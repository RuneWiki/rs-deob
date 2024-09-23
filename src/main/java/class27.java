import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ICYHAEVI")
public class class27 {

    @OriginalMember(owner = "ICYHAEVI", name = "a", descriptor = "B")
    private byte field1037 = -128;

    @OriginalMember(owner = "ICYHAEVI", name = "b", descriptor = "B")
    private byte field1038 = 1;

    @OriginalMember(owner = "ICYHAEVI", name = "h", descriptor = "I")
    public int field1044 = 65000;

    @OriginalMember(owner = "ICYHAEVI", name = "g", descriptor = "I")
    public int field1043;

    @OriginalMember(owner = "ICYHAEVI", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1041;

    @OriginalMember(owner = "ICYHAEVI", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1042;

    @OriginalMember(owner = "ICYHAEVI", name = "d", descriptor = "[B")
    public static byte[] field1040 = new byte[520];

    @OriginalMember(owner = "ICYHAEVI", name = "c", descriptor = "I")
    private int field1039;

    @OriginalMember(owner = "ICYHAEVI", name = "<init>", descriptor = "(BIILjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;)V")
    public class27(byte arg0, int arg1, int arg2, RandomAccessFile arg3, RandomAccessFile arg4) {
        this.field1043 = arg2;
        this.field1041 = arg3;
        if (this.field1038 != arg0) {
            throw new NullPointerException();
        }
        boolean var6 = false;
        this.field1042 = arg4;
        this.field1044 = arg1;
    }

    @OriginalMember(owner = "ICYHAEVI", name = "a", descriptor = "(BI)[B")
    public synchronized byte[] method375(byte arg0, int arg1) {
        if (arg0 != -18) {
            throw new NullPointerException();
        }
        try {
            this.method378(arg1 * 6, true, this.field1042);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field1042.read(field1040, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field1040[2] & 0xFF) + ((field1040[0] & 0xFF) << 16) + ((field1040[1] & 0xFF) << 8);
            int var6 = (field1040[5] & 0xFF) + ((field1040[3] & 0xFF) << 16) + ((field1040[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field1044) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field1041.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method378(var6 * 520, true, this.field1041);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field1041.read(field1040, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field1040[0] & 0xFF) << 8) + (field1040[1] & 0xFF);
                    int var14 = ((field1040[2] & 0xFF) << 8) + (field1040[3] & 0xFF);
                    int var15 = (field1040[6] & 0xFF) + ((field1040[4] & 0xFF) << 16) + ((field1040[5] & 0xFF) << 8);
                    int var16 = field1040[7] & 0xFF;
                    if (arg1 == var13 && var9 == var14 && this.field1043 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field1041.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field1040[var17 + 8];
                            }
                            var6 = var15;
                            var9++;
                            continue;
                        }
                        return null;
                    }
                    return null;
                }
                return var7;
            } else {
                return null;
            }
        } catch (IOException var18) {
            return null;
        }
    }

    @OriginalMember(owner = "ICYHAEVI", name = "a", descriptor = "(II[BI)Z")
    public synchronized boolean method376(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg3 <= 0) {
            this.field1039 = -97;
        }
        boolean var5 = this.method377(arg1, arg0, arg2, this.field1037, true);
        if (!var5) {
            var5 = this.method377(arg1, arg0, arg2, this.field1037, false);
        }
        return var5;
    }

    @OriginalMember(owner = "ICYHAEVI", name = "a", descriptor = "(II[BBZ)Z")
    private synchronized boolean method377(int arg0, int arg1, byte[] arg2, byte arg3, boolean arg4) {
        if (arg3 != -128) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        try {
            int var9;
            if (arg4) {
                this.method378(arg0 * 6, true, this.field1042);
                int var8;
                for (int var7 = 0; var7 < 6; var7 += var8) {
                    var8 = this.field1042.read(field1040, var7, 6 - var7);
                    if (var8 == -1) {
                        return false;
                    }
                }
                var9 = (field1040[5] & 0xFF) + ((field1040[3] & 0xFF) << 16) + ((field1040[4] & 0xFF) << 8);
                if (var9 <= 0 || (long) var9 > this.field1041.length() / 520L) {
                    return false;
                }
            } else {
                var9 = (int) ((this.field1041.length() + 519L) / 520L);
                if (var9 == 0) {
                    var9 = 1;
                }
            }
            field1040[0] = (byte) (arg1 >> 16);
            field1040[1] = (byte) (arg1 >> 8);
            field1040[2] = (byte) arg1;
            field1040[3] = (byte) (var9 >> 16);
            field1040[4] = (byte) (var9 >> 8);
            field1040[5] = (byte) var9;
            this.method378(arg0 * 6, true, this.field1042);
            this.field1042.write(field1040, 0, 6);
            int var10 = 0;
            int var11 = 0;
            while (var10 < arg1) {
                int var12 = 0;
                if (arg4) {
                    this.method378(var9 * 520, true, this.field1041);
                    int var13;
                    int var14;
                    for (var13 = 0; var13 < 8; var13 += var14) {
                        var14 = this.field1041.read(field1040, var13, 8 - var13);
                        if (var14 == -1) {
                            break;
                        }
                    }
                    if (var13 == 8) {
                        label117: {
                            int var15 = ((field1040[0] & 0xFF) << 8) + (field1040[1] & 0xFF);
                            int var16 = ((field1040[2] & 0xFF) << 8) + (field1040[3] & 0xFF);
                            var12 = (field1040[6] & 0xFF) + ((field1040[4] & 0xFF) << 16) + ((field1040[5] & 0xFF) << 8);
                            int var17 = field1040[7] & 0xFF;
                            if (arg0 == var15 && var11 == var16 && this.field1043 == var17) {
                                if (var12 >= 0 && (long) var12 <= this.field1041.length() / 520L) {
                                    break label117;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var12 == 0) {
                    arg4 = false;
                    var12 = (int) ((this.field1041.length() + 519L) / 520L);
                    if (var12 == 0) {
                        var12++;
                    }
                    if (var9 == var12) {
                        var12++;
                    }
                }
                if (arg1 - var10 <= 512) {
                    var12 = 0;
                }
                field1040[0] = (byte) (arg0 >> 8);
                field1040[1] = (byte) arg0;
                field1040[2] = (byte) (var11 >> 8);
                field1040[3] = (byte) var11;
                field1040[4] = (byte) (var12 >> 16);
                field1040[5] = (byte) (var12 >> 8);
                field1040[6] = (byte) var12;
                field1040[7] = (byte) this.field1043;
                this.method378(var9 * 520, true, this.field1041);
                this.field1041.write(field1040, 0, 8);
                int var18 = arg1 - var10;
                if (var18 > 512) {
                    var18 = 512;
                }
                this.field1041.write(arg2, var10, var18);
                var10 += var18;
                var9 = var12;
                var11++;
            }
            return true;
        } catch (IOException var19) {
            return false;
        }
    }

    @OriginalMember(owner = "ICYHAEVI", name = "a", descriptor = "(IZLjava/io/RandomAccessFile;)V")
    public synchronized void method378(int arg0, boolean arg1, RandomAccessFile arg2) throws IOException {
        if (arg0 < 0 || arg0 > 62914560) {
            System.out.println("Badseek - pos:" + arg0 + " len:" + arg2.length());
            arg0 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var5) {
            }
        }
        arg2.seek((long) arg0);
        if (!arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }
}
