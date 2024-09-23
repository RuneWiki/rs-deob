import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BDNJGDVN")
public class class7 {

    @OriginalMember(owner = "BDNJGDVN", name = "a", descriptor = "Z")
    private boolean field143 = true;

    @OriginalMember(owner = "BDNJGDVN", name = "f", descriptor = "I")
    public int field148 = 65000;

    @OriginalMember(owner = "BDNJGDVN", name = "e", descriptor = "I")
    public int field147;

    @OriginalMember(owner = "BDNJGDVN", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field145;

    @OriginalMember(owner = "BDNJGDVN", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field146;

    @OriginalMember(owner = "BDNJGDVN", name = "b", descriptor = "[B")
    public static byte[] field144 = new byte[520];

    @OriginalMember(owner = "BDNJGDVN", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;BLjava/io/RandomAccessFile;II)V")
    public class7(RandomAccessFile arg0, byte arg1, RandomAccessFile arg2, int arg3, int arg4) {
        this.field147 = arg3;
        this.field145 = arg0;
        if (arg1 != 6) {
            throw new NullPointerException();
        }
        this.field146 = arg2;
        this.field148 = arg4;
    }

    @OriginalMember(owner = "BDNJGDVN", name = "a", descriptor = "(IB)[B")
    public synchronized byte[] method31(int arg0, byte arg1) {
        if (arg1 != -50) {
            throw new NullPointerException();
        }
        try {
            this.method34(arg0 * 6, -206, this.field146);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field146.read(field144, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field144[2] & 0xFF) + ((field144[0] & 0xFF) << 16) + ((field144[1] & 0xFF) << 8);
            int var6 = (field144[5] & 0xFF) + ((field144[3] & 0xFF) << 16) + ((field144[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field148) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field145.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method34(var6 * 520, -206, this.field145);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field145.read(field144, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field144[0] & 0xFF) << 8) + (field144[1] & 0xFF);
                    int var14 = ((field144[2] & 0xFF) << 8) + (field144[3] & 0xFF);
                    int var15 = (field144[6] & 0xFF) + ((field144[4] & 0xFF) << 16) + ((field144[5] & 0xFF) << 8);
                    int var16 = field144[7] & 0xFF;
                    if (arg0 == var13 && var9 == var14 && this.field147 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field145.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field144[var17 + 8];
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

    @OriginalMember(owner = "BDNJGDVN", name = "a", descriptor = "(I[BBI)Z")
    public synchronized boolean method32(int arg0, byte[] arg1, byte arg2, int arg3) {
        boolean var5 = this.method33(true, arg3, arg1, true, arg0);
        if (arg2 != -5) {
            throw new NullPointerException();
        }
        if (!var5) {
            var5 = this.method33(true, arg3, arg1, false, arg0);
        }
        return var5;
    }

    @OriginalMember(owner = "BDNJGDVN", name = "a", descriptor = "(ZI[BZI)Z")
    private synchronized boolean method33(boolean arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        if (!arg0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        try {
            int var9;
            if (arg3) {
                this.method34(arg1 * 6, -206, this.field146);
                int var8;
                for (int var7 = 0; var7 < 6; var7 += var8) {
                    var8 = this.field146.read(field144, var7, 6 - var7);
                    if (var8 == -1) {
                        return false;
                    }
                }
                var9 = (field144[5] & 0xFF) + ((field144[3] & 0xFF) << 16) + ((field144[4] & 0xFF) << 8);
                if (var9 <= 0 || (long) var9 > this.field145.length() / 520L) {
                    return false;
                }
            } else {
                var9 = (int) ((this.field145.length() + 519L) / 520L);
                if (var9 == 0) {
                    var9 = 1;
                }
            }
            field144[0] = (byte) (arg4 >> 16);
            field144[1] = (byte) (arg4 >> 8);
            field144[2] = (byte) arg4;
            field144[3] = (byte) (var9 >> 16);
            field144[4] = (byte) (var9 >> 8);
            field144[5] = (byte) var9;
            this.method34(arg1 * 6, -206, this.field146);
            this.field146.write(field144, 0, 6);
            int var10 = 0;
            int var11 = 0;
            while (var10 < arg4) {
                int var12 = 0;
                if (arg3) {
                    this.method34(var9 * 520, -206, this.field145);
                    int var13;
                    int var14;
                    for (var13 = 0; var13 < 8; var13 += var14) {
                        var14 = this.field145.read(field144, var13, 8 - var13);
                        if (var14 == -1) {
                            break;
                        }
                    }
                    if (var13 == 8) {
                        label117: {
                            int var15 = ((field144[0] & 0xFF) << 8) + (field144[1] & 0xFF);
                            int var16 = ((field144[2] & 0xFF) << 8) + (field144[3] & 0xFF);
                            var12 = (field144[6] & 0xFF) + ((field144[4] & 0xFF) << 16) + ((field144[5] & 0xFF) << 8);
                            int var17 = field144[7] & 0xFF;
                            if (arg1 == var15 && var11 == var16 && this.field147 == var17) {
                                if (var12 >= 0 && (long) var12 <= this.field145.length() / 520L) {
                                    break label117;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var12 == 0) {
                    arg3 = false;
                    var12 = (int) ((this.field145.length() + 519L) / 520L);
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
                field144[0] = (byte) (arg1 >> 8);
                field144[1] = (byte) arg1;
                field144[2] = (byte) (var11 >> 8);
                field144[3] = (byte) var11;
                field144[4] = (byte) (var12 >> 16);
                field144[5] = (byte) (var12 >> 8);
                field144[6] = (byte) var12;
                field144[7] = (byte) this.field147;
                this.method34(var9 * 520, -206, this.field145);
                this.field145.write(field144, 0, 8);
                int var18 = arg4 - var10;
                if (var18 > 512) {
                    var18 = 512;
                }
                this.field145.write(arg2, var10, var18);
                var10 += var18;
                var9 = var12;
                var11++;
            }
            return true;
        } catch (IOException var19) {
            return false;
        }
    }

    @OriginalMember(owner = "BDNJGDVN", name = "a", descriptor = "(IILjava/io/RandomAccessFile;)V")
    public synchronized void method34(int arg0, int arg1, RandomAccessFile arg2) throws IOException {
        while (arg1 >= 0) {
            this.field143 = !this.field143;
        }
        if (arg0 < 0 || arg0 > 62914560) {
            System.out.println("Badseek - pos:" + arg0 + " len:" + arg2.length());
            arg0 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg2.seek((long) arg0);
    }
}
