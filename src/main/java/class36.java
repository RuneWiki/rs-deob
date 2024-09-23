import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MMZHRHUG")
public class class36 {

    @OriginalMember(owner = "MMZHRHUG", name = "e", descriptor = "I")
    public int field1215 = 65000;

    @OriginalMember(owner = "MMZHRHUG", name = "d", descriptor = "I")
    public int field1214;

    @OriginalMember(owner = "MMZHRHUG", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1212;

    @OriginalMember(owner = "MMZHRHUG", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1213;

    @OriginalMember(owner = "MMZHRHUG", name = "a", descriptor = "[B")
    public static byte[] field1211 = new byte[520];

    @OriginalMember(owner = "MMZHRHUG", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;IILjava/io/RandomAccessFile;)V")
    public class36(int arg0, RandomAccessFile arg1, int arg2, int arg3, RandomAccessFile arg4) {
        this.field1214 = arg0;
        if (arg3 != 8) {
            throw new NullPointerException();
        }
        this.field1212 = arg4;
        this.field1213 = arg1;
        this.field1215 = arg2;
    }

    @OriginalMember(owner = "MMZHRHUG", name = "a", descriptor = "(II)[B")
    public synchronized byte[] method424(int arg0, int arg1) {
        int var3 = 45 / arg0;
        try {
            this.method427(arg1 * 6, this.field1213, true);
            int var5;
            for (int var4 = 0; var4 < 6; var4 += var5) {
                var5 = this.field1213.read(field1211, var4, 6 - var4);
                if (var5 == -1) {
                    return null;
                }
            }
            int var6 = (field1211[2] & 0xFF) + ((field1211[0] & 0xFF) << 16) + ((field1211[1] & 0xFF) << 8);
            int var7 = (field1211[5] & 0xFF) + ((field1211[3] & 0xFF) << 16) + ((field1211[4] & 0xFF) << 8);
            if (var6 < 0 || var6 > this.field1215) {
                return null;
            } else if (var7 > 0 && (long) var7 <= this.field1212.length() / 520L) {
                byte[] var8 = new byte[var6];
                int var9 = 0;
                int var10 = 0;
                while (var9 < var6) {
                    if (var7 == 0) {
                        return null;
                    }
                    this.method427(var7 * 520, this.field1212, true);
                    int var11 = 0;
                    int var12 = var6 - var9;
                    if (var12 > 512) {
                        var12 = 512;
                    }
                    while (var11 < var12 + 8) {
                        int var13 = this.field1212.read(field1211, var11, var12 + 8 - var11);
                        if (var13 == -1) {
                            return null;
                        }
                        var11 += var13;
                    }
                    int var14 = ((field1211[0] & 0xFF) << 8) + (field1211[1] & 0xFF);
                    int var15 = ((field1211[2] & 0xFF) << 8) + (field1211[3] & 0xFF);
                    int var16 = (field1211[6] & 0xFF) + ((field1211[4] & 0xFF) << 16) + ((field1211[5] & 0xFF) << 8);
                    int var17 = field1211[7] & 0xFF;
                    if (arg1 == var14 && var10 == var15 && this.field1214 == var17) {
                        if (var16 >= 0 && (long) var16 <= this.field1212.length() / 520L) {
                            for (int var18 = 0; var18 < var12; var18++) {
                                var8[var9++] = field1211[var18 + 8];
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

    @OriginalMember(owner = "MMZHRHUG", name = "a", descriptor = "(IBI[B)Z")
    public synchronized boolean method425(int arg0, byte arg1, int arg2, byte[] arg3) {
        if (arg1 != -41) {
            throw new NullPointerException();
        }
        boolean var5 = this.method426(arg3, 17611, arg0, arg2, true);
        if (!var5) {
            var5 = this.method426(arg3, 17611, arg0, arg2, false);
        }
        return var5;
    }

    @OriginalMember(owner = "MMZHRHUG", name = "a", descriptor = "([BIIIZ)Z")
    private synchronized boolean method426(byte[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg1 != 17611) {
            throw new NullPointerException();
        }
        try {
            int var8;
            if (arg4) {
                this.method427(arg2 * 6, this.field1213, true);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field1213.read(field1211, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field1211[5] & 0xFF) + ((field1211[3] & 0xFF) << 16) + ((field1211[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field1212.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field1212.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field1211[0] = (byte) (arg3 >> 16);
            field1211[1] = (byte) (arg3 >> 8);
            field1211[2] = (byte) arg3;
            field1211[3] = (byte) (var8 >> 16);
            field1211[4] = (byte) (var8 >> 8);
            field1211[5] = (byte) var8;
            this.method427(arg2 * 6, this.field1213, true);
            this.field1213.write(field1211, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg3) {
                int var11 = 0;
                if (arg4) {
                    this.method427(var8 * 520, this.field1212, true);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field1212.read(field1211, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label110: {
                            int var14 = ((field1211[0] & 0xFF) << 8) + (field1211[1] & 0xFF);
                            int var15 = ((field1211[2] & 0xFF) << 8) + (field1211[3] & 0xFF);
                            var11 = (field1211[6] & 0xFF) + ((field1211[4] & 0xFF) << 16) + ((field1211[5] & 0xFF) << 8);
                            int var16 = field1211[7] & 0xFF;
                            if (arg2 == var14 && var10 == var15 && this.field1214 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field1212.length() / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var11 == 0) {
                    arg4 = false;
                    var11 = (int) ((this.field1212.length() + 519L) / 520L);
                    if (var11 == 0) {
                        var11++;
                    }
                    if (var8 == var11) {
                        var11++;
                    }
                }
                if (arg3 - var9 <= 512) {
                    var11 = 0;
                }
                field1211[0] = (byte) (arg2 >> 8);
                field1211[1] = (byte) arg2;
                field1211[2] = (byte) (var10 >> 8);
                field1211[3] = (byte) var10;
                field1211[4] = (byte) (var11 >> 16);
                field1211[5] = (byte) (var11 >> 8);
                field1211[6] = (byte) var11;
                field1211[7] = (byte) this.field1214;
                this.method427(var8 * 520, this.field1212, true);
                this.field1212.write(field1211, 0, 8);
                int var17 = arg3 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field1212.write(arg0, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "MMZHRHUG", name = "a", descriptor = "(ILjava/io/RandomAccessFile;Z)V")
    public synchronized void method427(int arg0, RandomAccessFile arg1, boolean arg2) throws IOException {
        if (arg0 < 0 || arg0 > 62914560) {
            System.out.println("Badseek - pos:" + arg0 + " len:" + arg1.length());
            arg0 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var5) {
            }
        }
        arg1.seek((long) arg0);
        if (!arg2) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }
}
