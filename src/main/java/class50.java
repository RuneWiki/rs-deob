import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PJMJGLFE")
public class class50 {

    @OriginalMember(owner = "PJMJGLFE", name = "a", descriptor = "I")
    private int field1300 = 22486;

    @OriginalMember(owner = "PJMJGLFE", name = "b", descriptor = "I")
    private int field1301 = 8;

    @OriginalMember(owner = "PJMJGLFE", name = "g", descriptor = "I")
    public int field1306 = 65000;

    @OriginalMember(owner = "PJMJGLFE", name = "f", descriptor = "I")
    public int field1305;

    @OriginalMember(owner = "PJMJGLFE", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1303;

    @OriginalMember(owner = "PJMJGLFE", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1304;

    @OriginalMember(owner = "PJMJGLFE", name = "c", descriptor = "[B")
    public static byte[] field1302 = new byte[520];

    @OriginalMember(owner = "PJMJGLFE", name = "<init>", descriptor = "(IILjava/io/RandomAccessFile;ILjava/io/RandomAccessFile;)V")
    public class50(int arg0, int arg1, RandomAccessFile arg2, int arg3, RandomAccessFile arg4) {
        this.field1305 = arg3;
        if (arg0 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field1303 = arg4;
        this.field1304 = arg2;
        this.field1306 = arg1;
    }

    @OriginalMember(owner = "PJMJGLFE", name = "a", descriptor = "(II)[B")
    public synchronized byte[] method459(int arg0, int arg1) {
        if (this.field1300 != arg1) {
            this.field1300 = -74;
        }
        try {
            this.method462(arg0 * 6, this.field1304, 1);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field1304.read(field1302, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field1302[2] & 0xFF) + ((field1302[0] & 0xFF) << 16) + ((field1302[1] & 0xFF) << 8);
            int var6 = (field1302[5] & 0xFF) + ((field1302[3] & 0xFF) << 16) + ((field1302[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field1306) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field1303.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method462(var6 * 520, this.field1303, 1);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field1303.read(field1302, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field1302[0] & 0xFF) << 8) + (field1302[1] & 0xFF);
                    int var14 = ((field1302[2] & 0xFF) << 8) + (field1302[3] & 0xFF);
                    int var15 = (field1302[6] & 0xFF) + ((field1302[4] & 0xFF) << 16) + ((field1302[5] & 0xFF) << 8);
                    int var16 = field1302[7] & 0xFF;
                    if (arg0 == var13 && var9 == var14 && this.field1305 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field1303.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field1302[var17 + 8];
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

    @OriginalMember(owner = "PJMJGLFE", name = "a", descriptor = "(II[BZ)Z")
    public synchronized boolean method460(int arg0, int arg1, byte[] arg2, boolean arg3) {
        if (!arg3) {
            throw new NullPointerException();
        }
        boolean var5 = this.method461(arg1, arg0, 8, true, arg2);
        if (!var5) {
            var5 = this.method461(arg1, arg0, 8, false, arg2);
        }
        return var5;
    }

    @OriginalMember(owner = "PJMJGLFE", name = "a", descriptor = "(IIIZ[B)Z")
    private synchronized boolean method461(int arg0, int arg1, int arg2, boolean arg3, byte[] arg4) {
        if (arg2 < this.field1301 || arg2 > this.field1301) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        try {
            int var9;
            if (arg3) {
                this.method462(arg1 * 6, this.field1304, 1);
                int var8;
                for (int var7 = 0; var7 < 6; var7 += var8) {
                    var8 = this.field1304.read(field1302, var7, 6 - var7);
                    if (var8 == -1) {
                        return false;
                    }
                }
                var9 = (field1302[5] & 0xFF) + ((field1302[3] & 0xFF) << 16) + ((field1302[4] & 0xFF) << 8);
                if (var9 <= 0 || (long) var9 > this.field1303.length() / 520L) {
                    return false;
                }
            } else {
                var9 = (int) ((this.field1303.length() + 519L) / 520L);
                if (var9 == 0) {
                    var9 = 1;
                }
            }
            field1302[0] = (byte) (arg0 >> 16);
            field1302[1] = (byte) (arg0 >> 8);
            field1302[2] = (byte) arg0;
            field1302[3] = (byte) (var9 >> 16);
            field1302[4] = (byte) (var9 >> 8);
            field1302[5] = (byte) var9;
            this.method462(arg1 * 6, this.field1304, 1);
            this.field1304.write(field1302, 0, 6);
            int var10 = 0;
            int var11 = 0;
            while (var10 < arg0) {
                int var12 = 0;
                if (arg3) {
                    this.method462(var9 * 520, this.field1303, 1);
                    int var13;
                    int var14;
                    for (var13 = 0; var13 < 8; var13 += var14) {
                        var14 = this.field1303.read(field1302, var13, 8 - var13);
                        if (var14 == -1) {
                            break;
                        }
                    }
                    if (var13 == 8) {
                        label122: {
                            int var15 = ((field1302[0] & 0xFF) << 8) + (field1302[1] & 0xFF);
                            int var16 = ((field1302[2] & 0xFF) << 8) + (field1302[3] & 0xFF);
                            var12 = (field1302[6] & 0xFF) + ((field1302[4] & 0xFF) << 16) + ((field1302[5] & 0xFF) << 8);
                            int var17 = field1302[7] & 0xFF;
                            if (arg1 == var15 && var11 == var16 && this.field1305 == var17) {
                                if (var12 >= 0 && (long) var12 <= this.field1303.length() / 520L) {
                                    break label122;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var12 == 0) {
                    arg3 = false;
                    var12 = (int) ((this.field1303.length() + 519L) / 520L);
                    if (var12 == 0) {
                        var12++;
                    }
                    if (var9 == var12) {
                        var12++;
                    }
                }
                if (arg0 - var10 <= 512) {
                    var12 = 0;
                }
                field1302[0] = (byte) (arg1 >> 8);
                field1302[1] = (byte) arg1;
                field1302[2] = (byte) (var11 >> 8);
                field1302[3] = (byte) var11;
                field1302[4] = (byte) (var12 >> 16);
                field1302[5] = (byte) (var12 >> 8);
                field1302[6] = (byte) var12;
                field1302[7] = (byte) this.field1305;
                this.method462(var9 * 520, this.field1303, 1);
                this.field1303.write(field1302, 0, 8);
                int var18 = arg0 - var10;
                if (var18 > 512) {
                    var18 = 512;
                }
                this.field1303.write(arg4, var10, var18);
                var10 += var18;
                var9 = var12;
                var11++;
            }
            return true;
        } catch (IOException var19) {
            return false;
        }
    }

    @OriginalMember(owner = "PJMJGLFE", name = "a", descriptor = "(ILjava/io/RandomAccessFile;I)V")
    public synchronized void method462(int arg0, RandomAccessFile arg1, int arg2) throws IOException {
        if (arg2 != 1) {
            return;
        }
        if (arg0 < 0 || arg0 > 62914560) {
            System.out.println("Badseek - pos:" + arg0 + " len:" + arg1.length());
            arg0 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg1.seek((long) arg0);
    }
}
