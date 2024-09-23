import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KQOBJHBO")
public class class34 {

    @OriginalMember(owner = "KQOBJHBO", name = "a", descriptor = "I")
    private int field943 = 4;

    @OriginalMember(owner = "KQOBJHBO", name = "f", descriptor = "I")
    public int field948 = 65000;

    @OriginalMember(owner = "KQOBJHBO", name = "e", descriptor = "I")
    public int field947;

    @OriginalMember(owner = "KQOBJHBO", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field945;

    @OriginalMember(owner = "KQOBJHBO", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field946;

    @OriginalMember(owner = "KQOBJHBO", name = "b", descriptor = "[B")
    public static byte[] field944 = new byte[520];

    @OriginalMember(owner = "KQOBJHBO", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;II)V")
    public class34(int arg0, RandomAccessFile arg1, RandomAccessFile arg2, int arg3, int arg4) {
        this.field947 = arg0;
        this.field945 = arg1;
        this.field946 = arg2;
        this.field948 = arg3;
        if (arg4 != -36202) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "KQOBJHBO", name = "a", descriptor = "(II)[B")
    public synchronized byte[] method356(int arg0, int arg1) {
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        try {
            this.method359(this.field946, 0, arg0 * 6);
            int var5;
            for (int var4 = 0; var4 < 6; var4 += var5) {
                var5 = this.field946.read(field944, var4, 6 - var4);
                if (var5 == -1) {
                    return null;
                }
            }
            int var6 = (field944[2] & 0xFF) + ((field944[0] & 0xFF) << 16) + ((field944[1] & 0xFF) << 8);
            int var7 = (field944[5] & 0xFF) + ((field944[3] & 0xFF) << 16) + ((field944[4] & 0xFF) << 8);
            if (var6 < 0 || var6 > this.field948) {
                return null;
            } else if (var7 > 0 && (long) var7 <= this.field945.length() / 520L) {
                byte[] var8 = new byte[var6];
                int var9 = 0;
                int var10 = 0;
                while (var9 < var6) {
                    if (var7 == 0) {
                        return null;
                    }
                    this.method359(this.field945, 0, var7 * 520);
                    int var11 = 0;
                    int var12 = var6 - var9;
                    if (var12 > 512) {
                        var12 = 512;
                    }
                    while (var11 < var12 + 8) {
                        int var13 = this.field945.read(field944, var11, var12 + 8 - var11);
                        if (var13 == -1) {
                            return null;
                        }
                        var11 += var13;
                    }
                    int var14 = ((field944[0] & 0xFF) << 8) + (field944[1] & 0xFF);
                    int var15 = ((field944[2] & 0xFF) << 8) + (field944[3] & 0xFF);
                    int var16 = (field944[6] & 0xFF) + ((field944[4] & 0xFF) << 16) + ((field944[5] & 0xFF) << 8);
                    int var17 = field944[7] & 0xFF;
                    if (arg0 == var14 && var10 == var15 && this.field947 == var17) {
                        if (var16 >= 0 && (long) var16 <= this.field945.length() / 520L) {
                            for (int var18 = 0; var18 < var12; var18++) {
                                var8[var9++] = field944[var18 + 8];
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

    @OriginalMember(owner = "KQOBJHBO", name = "a", descriptor = "([BIII)Z")
    public synchronized boolean method357(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            throw new NullPointerException();
        }
        boolean var5 = this.method358(arg1, arg2, this.field943, arg0, true);
        if (!var5) {
            var5 = this.method358(arg1, arg2, this.field943, arg0, false);
        }
        return var5;
    }

    @OriginalMember(owner = "KQOBJHBO", name = "a", descriptor = "(III[BZ)Z")
    private synchronized boolean method358(int arg0, int arg1, int arg2, byte[] arg3, boolean arg4) {
        if (arg2 != 4) {
            throw new NullPointerException();
        }
        try {
            int var8;
            if (arg4) {
                this.method359(this.field946, 0, arg0 * 6);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field946.read(field944, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field944[5] & 0xFF) + ((field944[3] & 0xFF) << 16) + ((field944[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field945.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field945.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field944[0] = (byte) (arg1 >> 16);
            field944[1] = (byte) (arg1 >> 8);
            field944[2] = (byte) arg1;
            field944[3] = (byte) (var8 >> 16);
            field944[4] = (byte) (var8 >> 8);
            field944[5] = (byte) var8;
            this.method359(this.field946, 0, arg0 * 6);
            this.field946.write(field944, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg1) {
                int var11 = 0;
                if (arg4) {
                    this.method359(this.field945, 0, var8 * 520);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field945.read(field944, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label110: {
                            int var14 = ((field944[0] & 0xFF) << 8) + (field944[1] & 0xFF);
                            int var15 = ((field944[2] & 0xFF) << 8) + (field944[3] & 0xFF);
                            var11 = (field944[6] & 0xFF) + ((field944[4] & 0xFF) << 16) + ((field944[5] & 0xFF) << 8);
                            int var16 = field944[7] & 0xFF;
                            if (arg0 == var14 && var10 == var15 && this.field947 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field945.length() / 520L) {
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
                    var11 = (int) ((this.field945.length() + 519L) / 520L);
                    if (var11 == 0) {
                        var11++;
                    }
                    if (var8 == var11) {
                        var11++;
                    }
                }
                if (arg1 - var9 <= 512) {
                    var11 = 0;
                }
                field944[0] = (byte) (arg0 >> 8);
                field944[1] = (byte) arg0;
                field944[2] = (byte) (var10 >> 8);
                field944[3] = (byte) var10;
                field944[4] = (byte) (var11 >> 16);
                field944[5] = (byte) (var11 >> 8);
                field944[6] = (byte) var11;
                field944[7] = (byte) this.field947;
                this.method359(this.field945, 0, var8 * 520);
                this.field945.write(field944, 0, 8);
                int var17 = arg1 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field945.write(arg3, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "KQOBJHBO", name = "a", descriptor = "(Ljava/io/RandomAccessFile;II)V")
    public synchronized void method359(RandomAccessFile arg0, int arg1, int arg2) throws IOException {
        if (arg1 < 0 || arg1 > 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg2 < 0 || arg2 > 62914560) {
            System.out.println("Badseek - pos:" + arg2 + " len:" + arg0.length());
            arg2 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var5) {
            }
        }
        arg0.seek((long) arg2);
    }
}
