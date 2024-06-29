import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TUZTEZTO")
public class class53 {

    @OriginalMember(owner = "client!TUZTEZTO", name = "a", descriptor = "B")
    private byte field1399 = 5;

    @OriginalMember(owner = "client!TUZTEZTO", name = "b", descriptor = "Z")
    private boolean field1400 = false;

    @OriginalMember(owner = "client!TUZTEZTO", name = "h", descriptor = "I")
    public int field1405 = 65000;

    @OriginalMember(owner = "client!TUZTEZTO", name = "g", descriptor = "I")
    public int field1404;

    @OriginalMember(owner = "client!TUZTEZTO", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1402;

    @OriginalMember(owner = "client!TUZTEZTO", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1403;

    @OriginalMember(owner = "client!TUZTEZTO", name = "c", descriptor = "[B")
    public static byte[] field1401 = new byte[520];

    @OriginalMember(owner = "client!TUZTEZTO", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;ILjava/io/RandomAccessFile;II)V")
    public class53(RandomAccessFile arg0, int arg1, RandomAccessFile arg2, int arg3, int arg4) {
        this.field1404 = arg4;
        this.field1402 = arg0;
        this.field1403 = arg2;
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        this.field1405 = arg3;
    }

    @OriginalMember(owner = "client!TUZTEZTO", name = "a", descriptor = "(II)[B")
    public synchronized byte[] method430(int arg0, int arg1) {
        while (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        try {
            this.method433(arg1 * 6, 4, this.field1403);
            int var5;
            for (int var4 = 0; var4 < 6; var4 += var5) {
                var5 = this.field1403.read(field1401, var4, 6 - var4);
                if (var5 == -1) {
                    return null;
                }
            }
            int var6 = (field1401[2] & 0xFF) + ((field1401[0] & 0xFF) << 16) + ((field1401[1] & 0xFF) << 8);
            int var7 = (field1401[5] & 0xFF) + ((field1401[3] & 0xFF) << 16) + ((field1401[4] & 0xFF) << 8);
            if (var6 < 0 || var6 > this.field1405) {
                return null;
            } else if (var7 > 0 && (long) var7 <= this.field1402.length() / 520L) {
                byte[] var8 = new byte[var6];
                int var9 = 0;
                int var10 = 0;
                while (var9 < var6) {
                    if (var7 == 0) {
                        return null;
                    }
                    this.method433(var7 * 520, 4, this.field1402);
                    int var11 = 0;
                    int var12 = var6 - var9;
                    if (var12 > 512) {
                        var12 = 512;
                    }
                    while (var11 < var12 + 8) {
                        int var13 = this.field1402.read(field1401, var11, var12 + 8 - var11);
                        if (var13 == -1) {
                            return null;
                        }
                        var11 += var13;
                    }
                    int var14 = ((field1401[0] & 0xFF) << 8) + (field1401[1] & 0xFF);
                    int var15 = ((field1401[2] & 0xFF) << 8) + (field1401[3] & 0xFF);
                    int var16 = (field1401[6] & 0xFF) + ((field1401[4] & 0xFF) << 16) + ((field1401[5] & 0xFF) << 8);
                    int var17 = field1401[7] & 0xFF;
                    if (arg1 == var14 && var10 == var15 && this.field1404 == var17) {
                        if (var16 >= 0 && (long) var16 <= this.field1402.length() / 520L) {
                            for (int var18 = 0; var18 < var12; var18++) {
                                var8[var9++] = field1401[var18 + 8];
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

    @OriginalMember(owner = "client!TUZTEZTO", name = "a", descriptor = "([BBII)Z")
    public synchronized boolean method431(byte[] arg0, byte arg1, int arg2, int arg3) {
        if (this.field1399 == arg1) {
            boolean var5 = false;
        } else {
            this.field1400 = !this.field1400;
        }
        boolean var6 = this.method432(arg2, arg3, arg0, 0, true);
        if (!var6) {
            var6 = this.method432(arg2, arg3, arg0, 0, false);
        }
        return var6;
    }

    @OriginalMember(owner = "client!TUZTEZTO", name = "a", descriptor = "(II[BIZ)Z")
    private synchronized boolean method432(int arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        if (arg3 != 0) {
            this.field1400 = !this.field1400;
        }
        try {
            int var8;
            if (arg4) {
                this.method433(arg1 * 6, 4, this.field1403);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field1403.read(field1401, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field1401[5] & 0xFF) + ((field1401[3] & 0xFF) << 16) + ((field1401[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field1402.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field1402.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field1401[0] = (byte) (arg0 >> 16);
            field1401[1] = (byte) (arg0 >> 8);
            field1401[2] = (byte) arg0;
            field1401[3] = (byte) (var8 >> 16);
            field1401[4] = (byte) (var8 >> 8);
            field1401[5] = (byte) var8;
            this.method433(arg1 * 6, 4, this.field1403);
            this.field1403.write(field1401, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg0) {
                int var11 = 0;
                if (arg4) {
                    this.method433(var8 * 520, 4, this.field1402);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field1402.read(field1401, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label117: {
                            int var14 = ((field1401[0] & 0xFF) << 8) + (field1401[1] & 0xFF);
                            int var15 = ((field1401[2] & 0xFF) << 8) + (field1401[3] & 0xFF);
                            var11 = (field1401[6] & 0xFF) + ((field1401[4] & 0xFF) << 16) + ((field1401[5] & 0xFF) << 8);
                            int var16 = field1401[7] & 0xFF;
                            if (arg1 == var14 && var10 == var15 && this.field1404 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field1402.length() / 520L) {
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
                    var11 = (int) ((this.field1402.length() + 519L) / 520L);
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
                field1401[0] = (byte) (arg1 >> 8);
                field1401[1] = (byte) arg1;
                field1401[2] = (byte) (var10 >> 8);
                field1401[3] = (byte) var10;
                field1401[4] = (byte) (var11 >> 16);
                field1401[5] = (byte) (var11 >> 8);
                field1401[6] = (byte) var11;
                field1401[7] = (byte) this.field1404;
                this.method433(var8 * 520, 4, this.field1402);
                this.field1402.write(field1401, 0, 8);
                int var17 = arg0 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field1402.write(arg2, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "client!TUZTEZTO", name = "a", descriptor = "(IILjava/io/RandomAccessFile;)V")
    public synchronized void method433(int arg0, int arg1, RandomAccessFile arg2) throws IOException {
        if (arg0 < 0 || arg0 > 62914560) {
            System.out.println("Badseek - pos:" + arg0 + " len:" + arg2.length());
            arg0 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg2.seek((long) arg0);
        if (arg1 < 4 || arg1 > 4) {
            ;
        }
    }
}
