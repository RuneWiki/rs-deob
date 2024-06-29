import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BCXJTIWC")
public class class3 {

    @OriginalMember(owner = "client!BCXJTIWC", name = "a", descriptor = "Z")
    private boolean field17 = false;

    @OriginalMember(owner = "client!BCXJTIWC", name = "b", descriptor = "Z")
    private boolean field18 = false;

    @OriginalMember(owner = "client!BCXJTIWC", name = "h", descriptor = "I")
    public int field24 = 65000;

    @OriginalMember(owner = "client!BCXJTIWC", name = "g", descriptor = "I")
    public int field23;

    @OriginalMember(owner = "client!BCXJTIWC", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field21;

    @OriginalMember(owner = "client!BCXJTIWC", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field22;

    @OriginalMember(owner = "client!BCXJTIWC", name = "d", descriptor = "[B")
    public static byte[] field20 = new byte[520];

    @OriginalMember(owner = "client!BCXJTIWC", name = "c", descriptor = "I")
    private int field19;

    @OriginalMember(owner = "client!BCXJTIWC", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;ILjava/io/RandomAccessFile;Z)V")
    public class3(int arg0, RandomAccessFile arg1, int arg2, RandomAccessFile arg3, boolean arg4) {
        if (!arg4) {
            throw new NullPointerException();
        }
        this.field23 = arg2;
        this.field21 = arg1;
        this.field22 = arg3;
        this.field24 = arg0;
    }

    @OriginalMember(owner = "client!BCXJTIWC", name = "a", descriptor = "(IB)[B")
    public synchronized byte[] method15(int arg0, byte arg1) {
        if (arg1 == 1) {
            boolean var3 = false;
        } else {
            this.field19 = -285;
        }
        try {
            this.method18(arg0 * 6, this.field22, (byte) 58);
            int var5;
            for (int var4 = 0; var4 < 6; var4 += var5) {
                var5 = this.field22.read(field20, var4, 6 - var4);
                if (var5 == -1) {
                    return null;
                }
            }
            int var6 = (field20[2] & 0xFF) + ((field20[0] & 0xFF) << 16) + ((field20[1] & 0xFF) << 8);
            int var7 = (field20[5] & 0xFF) + ((field20[3] & 0xFF) << 16) + ((field20[4] & 0xFF) << 8);
            if (var6 < 0 || var6 > this.field24) {
                return null;
            } else if (var7 > 0 && (long) var7 <= this.field21.length() / 520L) {
                byte[] var8 = new byte[var6];
                int var9 = 0;
                int var10 = 0;
                while (var9 < var6) {
                    if (var7 == 0) {
                        return null;
                    }
                    this.method18(var7 * 520, this.field21, (byte) 58);
                    int var11 = 0;
                    int var12 = var6 - var9;
                    if (var12 > 512) {
                        var12 = 512;
                    }
                    while (var11 < var12 + 8) {
                        int var13 = this.field21.read(field20, var11, var12 + 8 - var11);
                        if (var13 == -1) {
                            return null;
                        }
                        var11 += var13;
                    }
                    int var14 = ((field20[0] & 0xFF) << 8) + (field20[1] & 0xFF);
                    int var15 = ((field20[2] & 0xFF) << 8) + (field20[3] & 0xFF);
                    int var16 = (field20[6] & 0xFF) + ((field20[4] & 0xFF) << 16) + ((field20[5] & 0xFF) << 8);
                    int var17 = field20[7] & 0xFF;
                    if (arg0 == var14 && var10 == var15 && this.field23 == var17) {
                        if (var16 >= 0 && (long) var16 <= this.field21.length() / 520L) {
                            for (int var18 = 0; var18 < var12; var18++) {
                                var8[var9++] = field20[var18 + 8];
                            }
                            var7 = var16;
                            var10++;
                            continue;
                        }
                        return null;
                    }
                    return null;
                }
                return var8;
            } else {
                return null;
            }
        } catch (IOException var19) {
            return null;
        }
    }

    @OriginalMember(owner = "client!BCXJTIWC", name = "a", descriptor = "([BIII)Z")
    public synchronized boolean method16(byte[] arg0, int arg1, int arg2, int arg3) {
        boolean var5 = this.method17(arg3, true, arg1, arg0, true);
        if (arg2 != 6) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (!var5) {
            var5 = this.method17(arg3, true, arg1, arg0, false);
        }
        return var5;
    }

    @OriginalMember(owner = "client!BCXJTIWC", name = "a", descriptor = "(IZI[BZ)Z")
    private synchronized boolean method17(int arg0, boolean arg1, int arg2, byte[] arg3, boolean arg4) {
        if (!arg1) {
            this.field18 = !this.field18;
        }
        try {
            int var8;
            if (arg4) {
                this.method18(arg2 * 6, this.field22, (byte) 58);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field22.read(field20, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field20[5] & 0xFF) + ((field20[3] & 0xFF) << 16) + ((field20[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field21.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field21.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field20[0] = (byte) (arg0 >> 16);
            field20[1] = (byte) (arg0 >> 8);
            field20[2] = (byte) arg0;
            field20[3] = (byte) (var8 >> 16);
            field20[4] = (byte) (var8 >> 8);
            field20[5] = (byte) var8;
            this.method18(arg2 * 6, this.field22, (byte) 58);
            this.field22.write(field20, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg0) {
                int var11 = 0;
                if (arg4) {
                    this.method18(var8 * 520, this.field21, (byte) 58);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field21.read(field20, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label117: {
                            int var14 = ((field20[0] & 0xFF) << 8) + (field20[1] & 0xFF);
                            int var15 = ((field20[2] & 0xFF) << 8) + (field20[3] & 0xFF);
                            var11 = (field20[6] & 0xFF) + ((field20[4] & 0xFF) << 16) + ((field20[5] & 0xFF) << 8);
                            int var16 = field20[7] & 0xFF;
                            if (arg2 == var14 && var10 == var15 && this.field23 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field21.length() / 520L) {
                                    break label117;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var11 == 0) {
                    arg4 = false;
                    var11 = (int) ((this.field21.length() + 519L) / 520L);
                    if (var11 == 0) {
                        var11++;
                    }
                    if (var8 == var11) {
                        var11++;
                    }
                }
                if (arg0 - var9 <= 512) {
                    var11 = 0;
                }
                field20[0] = (byte) (arg2 >> 8);
                field20[1] = (byte) arg2;
                field20[2] = (byte) (var10 >> 8);
                field20[3] = (byte) var10;
                field20[4] = (byte) (var11 >> 16);
                field20[5] = (byte) (var11 >> 8);
                field20[6] = (byte) var11;
                field20[7] = (byte) this.field23;
                this.method18(var8 * 520, this.field21, (byte) 58);
                this.field21.write(field20, 0, 8);
                int var17 = arg0 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field21.write(arg3, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "client!BCXJTIWC", name = "a", descriptor = "(ILjava/io/RandomAccessFile;B)V")
    public synchronized void method18(int arg0, RandomAccessFile arg1, byte arg2) throws IOException {
        if (arg0 < 0 || arg0 > 62914560) {
            System.out.println("Badseek - pos:" + arg0 + " len:" + arg1.length());
            arg0 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg1.seek((long) arg0);
        if (arg2 != 58) {
            this.field17 = !this.field17;
        }
    }
}
