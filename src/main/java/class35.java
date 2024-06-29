import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MACXPWDL")
public class class35 {

    @OriginalMember(owner = "client!MACXPWDL", name = "e", descriptor = "I")
    public int field1117 = 65000;

    @OriginalMember(owner = "client!MACXPWDL", name = "d", descriptor = "I")
    public int field1116;

    @OriginalMember(owner = "client!MACXPWDL", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1114;

    @OriginalMember(owner = "client!MACXPWDL", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1115;

    @OriginalMember(owner = "client!MACXPWDL", name = "a", descriptor = "[B")
    public static byte[] field1113 = new byte[520];

    @OriginalMember(owner = "client!MACXPWDL", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;ILjava/io/RandomAccessFile;BI)V")
    public class35(RandomAccessFile arg0, int arg1, RandomAccessFile arg2, byte arg3, int arg4) {
        this.field1116 = arg4;
        if (arg3 != -101) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field1114 = arg0;
        this.field1115 = arg2;
        this.field1117 = arg1;
    }

    @OriginalMember(owner = "client!MACXPWDL", name = "a", descriptor = "(IB)[B")
    public synchronized byte[] method420(int arg0, byte arg1) {
        if (arg1 != 59) {
            throw new NullPointerException();
        }
        try {
            this.method423(true, arg0 * 6, this.field1115);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field1115.read(field1113, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field1113[2] & 0xFF) + ((field1113[0] & 0xFF) << 16) + ((field1113[1] & 0xFF) << 8);
            int var6 = (field1113[5] & 0xFF) + ((field1113[3] & 0xFF) << 16) + ((field1113[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field1117) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field1114.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method423(true, var6 * 520, this.field1114);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field1114.read(field1113, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field1113[0] & 0xFF) << 8) + (field1113[1] & 0xFF);
                    int var14 = ((field1113[2] & 0xFF) << 8) + (field1113[3] & 0xFF);
                    int var15 = (field1113[6] & 0xFF) + ((field1113[4] & 0xFF) << 16) + ((field1113[5] & 0xFF) << 8);
                    int var16 = field1113[7] & 0xFF;
                    if (arg0 == var13 && var9 == var14 && this.field1116 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field1114.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field1113[var17 + 8];
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

    @OriginalMember(owner = "client!MACXPWDL", name = "a", descriptor = "([BIZI)Z")
    public synchronized boolean method421(byte[] arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            throw new NullPointerException();
        }
        boolean var5 = this.method422(true, 0, arg1, arg0, arg3);
        if (!var5) {
            var5 = this.method422(false, 0, arg1, arg0, arg3);
        }
        return var5;
    }

    @OriginalMember(owner = "client!MACXPWDL", name = "a", descriptor = "(ZII[BI)Z")
    private synchronized boolean method422(boolean arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        if (arg1 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        try {
            int var9;
            if (arg0) {
                this.method423(true, arg2 * 6, this.field1115);
                int var8;
                for (int var7 = 0; var7 < 6; var7 += var8) {
                    var8 = this.field1115.read(field1113, var7, 6 - var7);
                    if (var8 == -1) {
                        return false;
                    }
                }
                var9 = (field1113[5] & 0xFF) + ((field1113[3] & 0xFF) << 16) + ((field1113[4] & 0xFF) << 8);
                if (var9 <= 0 || (long) var9 > this.field1114.length() / 520L) {
                    return false;
                }
            } else {
                var9 = (int) ((this.field1114.length() + 519L) / 520L);
                if (var9 == 0) {
                    var9 = 1;
                }
            }
            field1113[0] = (byte) (arg4 >> 16);
            field1113[1] = (byte) (arg4 >> 8);
            field1113[2] = (byte) arg4;
            field1113[3] = (byte) (var9 >> 16);
            field1113[4] = (byte) (var9 >> 8);
            field1113[5] = (byte) var9;
            this.method423(true, arg2 * 6, this.field1115);
            this.field1115.write(field1113, 0, 6);
            int var10 = 0;
            int var11 = 0;
            while (var10 < arg4) {
                int var12 = 0;
                if (arg0) {
                    this.method423(true, var9 * 520, this.field1114);
                    int var13;
                    int var14;
                    for (var13 = 0; var13 < 8; var13 += var14) {
                        var14 = this.field1114.read(field1113, var13, 8 - var13);
                        if (var14 == -1) {
                            break;
                        }
                    }
                    if (var13 == 8) {
                        label117: {
                            int var15 = ((field1113[0] & 0xFF) << 8) + (field1113[1] & 0xFF);
                            int var16 = ((field1113[2] & 0xFF) << 8) + (field1113[3] & 0xFF);
                            var12 = (field1113[6] & 0xFF) + ((field1113[4] & 0xFF) << 16) + ((field1113[5] & 0xFF) << 8);
                            int var17 = field1113[7] & 0xFF;
                            if (arg2 == var15 && var11 == var16 && this.field1116 == var17) {
                                if (var12 >= 0 && (long) var12 <= this.field1114.length() / 520L) {
                                    break label117;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var12 == 0) {
                    arg0 = false;
                    var12 = (int) ((this.field1114.length() + 519L) / 520L);
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
                field1113[0] = (byte) (arg2 >> 8);
                field1113[1] = (byte) arg2;
                field1113[2] = (byte) (var11 >> 8);
                field1113[3] = (byte) var11;
                field1113[4] = (byte) (var12 >> 16);
                field1113[5] = (byte) (var12 >> 8);
                field1113[6] = (byte) var12;
                field1113[7] = (byte) this.field1116;
                this.method423(true, var9 * 520, this.field1114);
                this.field1114.write(field1113, 0, 8);
                int var18 = arg4 - var10;
                if (var18 > 512) {
                    var18 = 512;
                }
                this.field1114.write(arg3, var10, var18);
                var10 += var18;
                var9 = var12;
                var11++;
            }
            return true;
        } catch (IOException var19) {
            return false;
        }
    }

    @OriginalMember(owner = "client!MACXPWDL", name = "a", descriptor = "(ZILjava/io/RandomAccessFile;)V")
    public synchronized void method423(boolean arg0, int arg1, RandomAccessFile arg2) throws IOException {
        if (arg1 < 0 || arg1 > 62914560) {
            System.out.println("Badseek - pos:" + arg1 + " len:" + arg2.length());
            arg1 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg2.seek((long) arg1);
        if (arg0) {
            ;
        }
    }
}
