import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SJIXUDLP")
public class class50 {

    @OriginalMember(owner = "SJIXUDLP", name = "a", descriptor = "I")
    private int field1297 = 16191;

    @OriginalMember(owner = "SJIXUDLP", name = "b", descriptor = "Z")
    private boolean field1298 = true;

    @OriginalMember(owner = "SJIXUDLP", name = "c", descriptor = "Z")
    private boolean field1299 = true;

    @OriginalMember(owner = "SJIXUDLP", name = "d", descriptor = "I")
    private int field1300 = 1;

    @OriginalMember(owner = "SJIXUDLP", name = "i", descriptor = "I")
    public int field1305 = 65000;

    @OriginalMember(owner = "SJIXUDLP", name = "h", descriptor = "I")
    public int field1304;

    @OriginalMember(owner = "SJIXUDLP", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1302;

    @OriginalMember(owner = "SJIXUDLP", name = "g", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1303;

    @OriginalMember(owner = "SJIXUDLP", name = "e", descriptor = "[B")
    public static byte[] field1301 = new byte[520];

    @OriginalMember(owner = "SJIXUDLP", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;ILjava/io/RandomAccessFile;I)V")
    public class50(int arg0, RandomAccessFile arg1, int arg2, RandomAccessFile arg3, int arg4) {
        this.field1304 = arg2;
        this.field1302 = arg3;
        this.field1303 = arg1;
        this.field1305 = arg0;
        if (arg4 != 22279) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "SJIXUDLP", name = "a", descriptor = "(II)[B")
    public synchronized byte[] method510(int arg0, int arg1) {
        if (this.field1297 != arg1) {
            this.field1300 = 416;
        }
        try {
            this.method513(arg0 * 6, this.field1303, true);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field1303.read(field1301, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field1301[2] & 0xFF) + ((field1301[0] & 0xFF) << 16) + ((field1301[1] & 0xFF) << 8);
            int var6 = (field1301[5] & 0xFF) + ((field1301[3] & 0xFF) << 16) + ((field1301[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field1305) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field1302.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method513(var6 * 520, this.field1302, true);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field1302.read(field1301, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field1301[0] & 0xFF) << 8) + (field1301[1] & 0xFF);
                    int var14 = ((field1301[2] & 0xFF) << 8) + (field1301[3] & 0xFF);
                    int var15 = (field1301[6] & 0xFF) + ((field1301[4] & 0xFF) << 16) + ((field1301[5] & 0xFF) << 8);
                    int var16 = field1301[7] & 0xFF;
                    if (arg0 == var13 && var9 == var14 && this.field1304 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field1302.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field1301[var17 + 8];
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

    @OriginalMember(owner = "SJIXUDLP", name = "a", descriptor = "([BIII)Z")
    public synchronized boolean method511(byte[] arg0, int arg1, int arg2, int arg3) {
        boolean var5 = this.method512(arg1, (byte) 4, true, arg0, arg3);
        int var6 = 62 / arg2;
        if (!var5) {
            var5 = this.method512(arg1, (byte) 4, false, arg0, arg3);
        }
        return var5;
    }

    @OriginalMember(owner = "SJIXUDLP", name = "a", descriptor = "(IBZ[BI)Z")
    private synchronized boolean method512(int arg0, byte arg1, boolean arg2, byte[] arg3, int arg4) {
        if (arg1 != 4) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        try {
            int var9;
            if (arg2) {
                this.method513(arg0 * 6, this.field1303, true);
                int var8;
                for (int var7 = 0; var7 < 6; var7 += var8) {
                    var8 = this.field1303.read(field1301, var7, 6 - var7);
                    if (var8 == -1) {
                        return false;
                    }
                }
                var9 = (field1301[5] & 0xFF) + ((field1301[3] & 0xFF) << 16) + ((field1301[4] & 0xFF) << 8);
                if (var9 <= 0 || (long) var9 > this.field1302.length() / 520L) {
                    return false;
                }
            } else {
                var9 = (int) ((this.field1302.length() + 519L) / 520L);
                if (var9 == 0) {
                    var9 = 1;
                }
            }
            field1301[0] = (byte) (arg4 >> 16);
            field1301[1] = (byte) (arg4 >> 8);
            field1301[2] = (byte) arg4;
            field1301[3] = (byte) (var9 >> 16);
            field1301[4] = (byte) (var9 >> 8);
            field1301[5] = (byte) var9;
            this.method513(arg0 * 6, this.field1303, true);
            this.field1303.write(field1301, 0, 6);
            int var10 = 0;
            int var11 = 0;
            while (var10 < arg4) {
                int var12 = 0;
                if (arg2) {
                    this.method513(var9 * 520, this.field1302, true);
                    int var13;
                    int var14;
                    for (var13 = 0; var13 < 8; var13 += var14) {
                        var14 = this.field1302.read(field1301, var13, 8 - var13);
                        if (var14 == -1) {
                            break;
                        }
                    }
                    if (var13 == 8) {
                        label117: {
                            int var15 = ((field1301[0] & 0xFF) << 8) + (field1301[1] & 0xFF);
                            int var16 = ((field1301[2] & 0xFF) << 8) + (field1301[3] & 0xFF);
                            var12 = (field1301[6] & 0xFF) + ((field1301[4] & 0xFF) << 16) + ((field1301[5] & 0xFF) << 8);
                            int var17 = field1301[7] & 0xFF;
                            if (arg0 == var15 && var11 == var16 && this.field1304 == var17) {
                                if (var12 >= 0 && (long) var12 <= this.field1302.length() / 520L) {
                                    break label117;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var12 == 0) {
                    arg2 = false;
                    var12 = (int) ((this.field1302.length() + 519L) / 520L);
                    if (var12 == 0) {
                        var12++;
                    }
                    if (var9 == var12) {
                        var12++;
                    }
                }
                if (arg4 - var10 <= 512) {
                    var12 = 0;
                }
                field1301[0] = (byte) (arg0 >> 8);
                field1301[1] = (byte) arg0;
                field1301[2] = (byte) (var11 >> 8);
                field1301[3] = (byte) var11;
                field1301[4] = (byte) (var12 >> 16);
                field1301[5] = (byte) (var12 >> 8);
                field1301[6] = (byte) var12;
                field1301[7] = (byte) this.field1304;
                this.method513(var9 * 520, this.field1302, true);
                this.field1302.write(field1301, 0, 8);
                int var18 = arg4 - var10;
                if (var18 > 512) {
                    var18 = 512;
                }
                this.field1302.write(arg3, var10, var18);
                var10 += var18;
                var9 = var12;
                var11++;
            }
            return true;
        } catch (IOException var19) {
            return false;
        }
    }

    @OriginalMember(owner = "SJIXUDLP", name = "a", descriptor = "(ILjava/io/RandomAccessFile;Z)V")
    public synchronized void method513(int arg0, RandomAccessFile arg1, boolean arg2) throws IOException {
        if (arg0 < 0 || arg0 > 62914560) {
            System.out.println("Badseek - pos:" + arg0 + " len:" + arg1.length());
            arg0 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg1.seek((long) arg0);
        if (!arg2) {
            this.field1299 = !this.field1299;
        }
    }
}
