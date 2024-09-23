import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IJFFCIDM")
public class class25 {

    @OriginalMember(owner = "IJFFCIDM", name = "a", descriptor = "Z")
    private boolean field908 = true;

    @OriginalMember(owner = "IJFFCIDM", name = "f", descriptor = "I")
    public int field913 = 65000;

    @OriginalMember(owner = "IJFFCIDM", name = "e", descriptor = "I")
    public int field912;

    @OriginalMember(owner = "IJFFCIDM", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field910;

    @OriginalMember(owner = "IJFFCIDM", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field911;

    @OriginalMember(owner = "IJFFCIDM", name = "b", descriptor = "[B")
    public static byte[] field909 = new byte[520];

    @OriginalMember(owner = "IJFFCIDM", name = "<init>", descriptor = "(BILjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;I)V")
    public class25(byte arg0, int arg1, RandomAccessFile arg2, RandomAccessFile arg3, int arg4) {
        this.field912 = arg4;
        this.field910 = arg3;
        if (arg0 != -113) {
            throw new NullPointerException();
        }
        this.field911 = arg2;
        this.field913 = arg1;
    }

    @OriginalMember(owner = "IJFFCIDM", name = "a", descriptor = "(ZI)[B")
    public synchronized byte[] method252(boolean arg0, int arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        try {
            this.method255(arg1 * 6, 0, this.field911);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field911.read(field909, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field909[2] & 0xFF) + ((field909[0] & 0xFF) << 16) + ((field909[1] & 0xFF) << 8);
            int var6 = (field909[5] & 0xFF) + ((field909[3] & 0xFF) << 16) + ((field909[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field913) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field910.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method255(var6 * 520, 0, this.field910);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field910.read(field909, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field909[0] & 0xFF) << 8) + (field909[1] & 0xFF);
                    int var14 = ((field909[2] & 0xFF) << 8) + (field909[3] & 0xFF);
                    int var15 = (field909[6] & 0xFF) + ((field909[4] & 0xFF) << 16) + ((field909[5] & 0xFF) << 8);
                    int var16 = field909[7] & 0xFF;
                    if (arg1 == var13 && var9 == var14 && this.field912 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field910.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field909[var17 + 8];
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

    @OriginalMember(owner = "IJFFCIDM", name = "a", descriptor = "(IB[BI)Z")
    public synchronized boolean method253(int arg0, byte arg1, byte[] arg2, int arg3) {
        boolean var5 = this.method254(arg3, arg2, true, 8, arg0);
        if (arg1 != 9) {
            throw new NullPointerException();
        }
        if (!var5) {
            var5 = this.method254(arg3, arg2, false, 8, arg0);
        }
        return var5;
    }

    @OriginalMember(owner = "IJFFCIDM", name = "a", descriptor = "(I[BZII)Z")
    private synchronized boolean method254(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4) {
        if (arg3 < 8 || arg3 > 8) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        try {
            int var9;
            if (arg2) {
                this.method255(arg0 * 6, 0, this.field911);
                int var8;
                for (int var7 = 0; var7 < 6; var7 += var8) {
                    var8 = this.field911.read(field909, var7, 6 - var7);
                    if (var8 == -1) {
                        return false;
                    }
                }
                var9 = (field909[5] & 0xFF) + ((field909[3] & 0xFF) << 16) + ((field909[4] & 0xFF) << 8);
                if (var9 <= 0 || (long) var9 > this.field910.length() / 520L) {
                    return false;
                }
            } else {
                var9 = (int) ((this.field910.length() + 519L) / 520L);
                if (var9 == 0) {
                    var9 = 1;
                }
            }
            field909[0] = (byte) (arg4 >> 16);
            field909[1] = (byte) (arg4 >> 8);
            field909[2] = (byte) arg4;
            field909[3] = (byte) (var9 >> 16);
            field909[4] = (byte) (var9 >> 8);
            field909[5] = (byte) var9;
            this.method255(arg0 * 6, 0, this.field911);
            this.field911.write(field909, 0, 6);
            int var10 = 0;
            int var11 = 0;
            while (var10 < arg4) {
                int var12 = 0;
                if (arg2) {
                    this.method255(var9 * 520, 0, this.field910);
                    int var13;
                    int var14;
                    for (var13 = 0; var13 < 8; var13 += var14) {
                        var14 = this.field910.read(field909, var13, 8 - var13);
                        if (var14 == -1) {
                            break;
                        }
                    }
                    if (var13 == 8) {
                        label122: {
                            int var15 = ((field909[0] & 0xFF) << 8) + (field909[1] & 0xFF);
                            int var16 = ((field909[2] & 0xFF) << 8) + (field909[3] & 0xFF);
                            var12 = (field909[6] & 0xFF) + ((field909[4] & 0xFF) << 16) + ((field909[5] & 0xFF) << 8);
                            int var17 = field909[7] & 0xFF;
                            if (arg0 == var15 && var11 == var16 && this.field912 == var17) {
                                if (var12 >= 0 && (long) var12 <= this.field910.length() / 520L) {
                                    break label122;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var12 == 0) {
                    arg2 = false;
                    var12 = (int) ((this.field910.length() + 519L) / 520L);
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
                field909[0] = (byte) (arg0 >> 8);
                field909[1] = (byte) arg0;
                field909[2] = (byte) (var11 >> 8);
                field909[3] = (byte) var11;
                field909[4] = (byte) (var12 >> 16);
                field909[5] = (byte) (var12 >> 8);
                field909[6] = (byte) var12;
                field909[7] = (byte) this.field912;
                this.method255(var9 * 520, 0, this.field910);
                this.field910.write(field909, 0, 8);
                int var18 = arg4 - var10;
                if (var18 > 512) {
                    var18 = 512;
                }
                this.field910.write(arg1, var10, var18);
                var10 += var18;
                var9 = var12;
                var11++;
            }
            return true;
        } catch (IOException var19) {
            return false;
        }
    }

    @OriginalMember(owner = "IJFFCIDM", name = "a", descriptor = "(IILjava/io/RandomAccessFile;)V")
    public synchronized void method255(int arg0, int arg1, RandomAccessFile arg2) throws IOException {
        if (arg0 < 0 || arg0 > 62914560) {
            System.out.println("Badseek - pos:" + arg0 + " len:" + arg2.length());
            arg0 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg2.seek((long) arg0);
        if (arg1 != 0) {
            this.field908 = !this.field908;
        }
    }
}
