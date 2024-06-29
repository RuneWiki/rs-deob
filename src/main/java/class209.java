import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class209 {

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "J")
    private long field3179 = -1L;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "J")
    private long field3184 = -1L;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    private int field3183 = 0;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "Lkm;")
    private class95 field3197;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "J")
    private long field3202;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "J")
    private long field3198;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "[B")
    private byte[] field3186;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "J")
    private long field3188;

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "[B")
    private byte[] field3201;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "[I")
    public static int[] field3196 = new int[500];

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "Ljp;")
    public static class55 field3194 = new class55(2, -1);

    @OriginalMember(owner = "client!aj", name = "y", descriptor = "[I")
    public static int[] field3203 = new int[5];

    @OriginalMember(owner = "client!aj", name = "z", descriptor = "I")
    public static int field3204 = 0;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    private int field3180;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "J")
    private long field3181;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
    public static final void method1452(byte arg0) {
        class376.method2400(10, (byte) 107);
        field3200++;
        class384.method2448(126);
        System.gc();
        if (arg0 > -30) {
            field3203 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public static final void method1453(int arg0) {
        field3199++;
        class350.field5223.method360(-48);
        class104.field1607.method2831(0);
        if (arg0 <= -35) {
            class200.field3103.method2831(0);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V")
    public static void method1454(boolean arg0) {
        field3196 = null;
        field3194 = null;
        field3203 = null;
        if (arg0) {
            method1459(-32, (byte) -85, -126, 69);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z[BII)V")
    public final void method1455(boolean arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field3191++;
        try {
            if (arg2 + arg3 > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg3 - arg1.length);
            }
            if (this.field3184 != -1L && this.field3184 <= this.field3188 && this.field3188 + ((long) arg2) <= this.field3184 - -((long) this.field3183)) {
                class325.method2131(this.field3186, (int) (this.field3188 - this.field3184), arg1, arg3, arg2);
                this.field3188 += arg2;
                return;
            }
            long var5 = this.field3188;
            int var7 = arg3;
            int var8 = arg2;
            if (this.field3188 >= this.field3179 && this.field3188 < ((long) this.field3180 + this.field3179)) {
                int var9 = (int) (this.field3179 + (long) this.field3180 - this.field3188);
                if (arg2 < var9) {
                    var9 = arg2;
                }
                class325.method2131(this.field3201, (int) (this.field3188 - this.field3179), arg1, arg3, var9);
                arg2 -= var9;
                arg3 += var9;
                this.field3188 += var9;
            }
            if (arg2 > this.field3201.length) {
                this.field3197.method802(127, this.field3188);
                this.field3181 = this.field3188;
                while (arg2 > 0) {
                    int var10 = this.field3197.method801(arg2, (byte) 118, arg3, arg1);
                    if (var10 == -1) {
                        break;
                    }
                    this.field3188 += var10;
                    arg3 += var10;
                    arg2 -= var10;
                    this.field3181 += var10;
                }
            } else if (arg2 > 0) {
                this.method1456(5);
                int var11 = arg2;
                if (this.field3180 < arg2) {
                    var11 = this.field3180;
                }
                class325.method2131(this.field3201, 0, arg1, arg3, var11);
                arg2 -= var11;
                this.field3188 += var11;
                arg3 += var11;
            }
            if (arg0) {
                method1459(-72, (byte) 12, -83, 107);
            }
            if (this.field3184 != -1L) {
                if (this.field3188 < this.field3184 && arg2 > 0) {
                    int var12 = (int) (this.field3184 - this.field3188) + arg3;
                    if (var12 > arg2 + arg3) {
                        var12 = arg2 + arg3;
                    }
                    while (var12 > arg3) {
                        arg2--;
                        arg1[arg3++] = 0;
                        this.field3188++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field3184 && ((long) var8 + var5) > this.field3184) {
                    var13 = this.field3184;
                } else if (this.field3184 <= var5 && ((long) this.field3183 + this.field3184) > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (((long) this.field3183 + this.field3184) > var5 && (var5 + ((long) var8)) >= ((long) this.field3183 + this.field3184)) {
                    var15 = (long) this.field3183 + this.field3184;
                } else if (var5 + ((long) var8) > this.field3184 && ((long) this.field3183 + this.field3184) >= ((long) var8 + var5)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class325.method2131(this.field3186, (int) (var13 - this.field3184), arg1, (int) (var13 - var5) + var7, var17);
                    if (this.field3188 < var15) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field3188));
                        this.field3188 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3181 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
    private final void method1456(int arg0) throws IOException {
        this.field3180 = 0;
        field3182++;
        if (this.field3188 != this.field3181) {
            this.field3197.method802(15, this.field3188);
            this.field3181 = this.field3188;
        }
        this.field3179 = this.field3188;
        while (this.field3180 < this.field3201.length) {
            int var2 = this.field3201.length - this.field3180;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field3197.method801(var2, (byte) 114, this.field3180, this.field3201);
            if (var3 == -1) {
                break;
            }
            this.field3181 += var3;
            this.field3180 += var3;
        }
        if (arg0 != 5) {
            field3204 = 87;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "([BB)V")
    public final void method1457(byte[] arg0, byte arg1) throws IOException {
        this.method1455(false, arg0, arg0.length, 0);
        field3195++;
        int var3 = -40 / ((arg1 - 66) / 44);
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)J")
    public final long method1458(byte arg0) {
        if (arg0 <= 10) {
            field3194 = null;
        }
        field3193++;
        return this.field3198;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IBII)V")
    public static final void method1459(int arg0, byte arg1, int arg2, int arg3) {
        field3189++;
        if (arg1 != -102) {
            field3204 = 98;
        }
        int var4 = arg0 << 3;
        int var5 = arg3 << 3;
        int var6 = arg2 << 3;
        class434.field6466 = var6;
        class353.field5236 = var5;
        if (class33.field401 == 2) {
            class536.field7863 = var6;
            class21.field242 = var4;
            class430.field6377 = var5;
        }
        class70.method613(true);
        class397.field5861 = true;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(JI)V")
    public final void method1460(long arg0, int arg1) throws IOException {
        field3187++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1463((byte) -82));
        } else if (arg1 < -31) {
            this.field3188 = arg0;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(III[B)V")
    public final void method1461(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field3190++;
        try {
            if (this.field3188 + ((long) arg2) > this.field3198) {
                this.field3198 = (long) arg2 + this.field3188;
            }
            if (arg0 != -1675) {
                this.field3198 = 125L;
            }
            if (this.field3184 != -1L && (this.field3184 > this.field3188 || this.field3188 > (long) this.field3183 + this.field3184)) {
                this.method1462((byte) 71);
            }
            if (this.field3184 != -1L && (this.field3184 + ((long) this.field3186.length)) < ((long) arg2 + this.field3188)) {
                int var5 = (int) ((long) this.field3186.length + this.field3184 - this.field3188);
                class325.method2131(arg3, arg1, this.field3186, (int) (this.field3188 - this.field3184), var5);
                arg1 += var5;
                arg2 -= var5;
                this.field3188 += var5;
                this.field3183 = this.field3186.length;
                this.method1462((byte) 71);
            }
            if (this.field3186.length < arg2) {
                if (this.field3188 != this.field3181) {
                    this.field3197.method802(108, this.field3188);
                    this.field3181 = this.field3188;
                }
                this.field3197.method805(arg3, true, arg1, arg2);
                this.field3181 += arg2;
                if (this.field3181 > this.field3202) {
                    this.field3202 = this.field3181;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field3188 >= this.field3179 && (long) this.field3180 + this.field3179 > this.field3188) {
                    var6 = this.field3188;
                } else if (this.field3179 >= this.field3188 && this.field3179 < (long) arg2 + this.field3188) {
                    var6 = this.field3179;
                }
                if ((long) arg2 + this.field3188 > this.field3179 && (long) arg2 + this.field3188 <= (long) this.field3180 + this.field3179) {
                    var8 = this.field3188 + ((long) arg2);
                } else if (this.field3188 < ((long) this.field3180 + this.field3179) && (long) this.field3180 + this.field3179 <= (long) arg2 + this.field3188) {
                    var8 = (long) this.field3180 + this.field3179;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class325.method2131(arg3, (int) ((long) arg1 + var6 - this.field3188), this.field3201, (int) (var6 - this.field3179), var10);
                }
                this.field3188 += arg2;
            } else if (arg2 > 0) {
                if (this.field3184 == -1L) {
                    this.field3184 = this.field3188;
                }
                class325.method2131(arg3, arg1, this.field3186, (int) (this.field3188 - this.field3184), arg2);
                this.field3188 += arg2;
                if (((long) this.field3183) < (this.field3188 - this.field3184)) {
                    this.field3183 = (int) (this.field3188 - this.field3184);
                }
            }
        } catch (IOException var12) {
            this.field3181 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(B)V")
    private final void method1462(byte arg0) throws IOException {
        if (this.field3184 != -1L) {
            if (this.field3184 != this.field3181) {
                this.field3197.method802(112, this.field3184);
                this.field3181 = this.field3184;
            }
            this.field3197.method805(this.field3186, true, 0, this.field3183);
            this.field3181 += this.field3183;
            if (this.field3181 > this.field3202) {
                this.field3202 = this.field3181;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field3179 <= this.field3184 && (long) this.field3180 + this.field3179 > this.field3184) {
                var2 = this.field3184;
            } else if (this.field3179 >= this.field3184 && this.field3179 < ((long) this.field3183 + this.field3184)) {
                var2 = this.field3179;
            }
            if ((long) this.field3183 + this.field3184 > this.field3179 && this.field3179 + ((long) this.field3180) >= (long) this.field3183 + this.field3184) {
                var4 = (long) this.field3183 + this.field3184;
            } else if (this.field3184 < ((long) this.field3180 + this.field3179) && ((long) this.field3183 + this.field3184) >= ((long) this.field3180 + this.field3179)) {
                var4 = (long) this.field3180 + this.field3179;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class325.method2131(this.field3186, (int) (var2 - this.field3184), this.field3201, (int) (var2 - this.field3179), var6);
            }
            this.field3183 = 0;
            this.field3184 = -1L;
        }
        if (arg0 == 71) {
            field3185++;
        }
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(B)Ljava/io/File;")
    private final File method1463(byte arg0) {
        field3192++;
        if (arg0 != -82) {
            method1452((byte) 32);
        }
        return this.field3197.method804(arg0 ^ 0xFFFFE75D);
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lkm;II)V")
    public class209(class95 arg0, int arg1, int arg2) throws IOException {
        this.field3197 = arg0;
        this.field3198 = this.field3202 = arg0.method803((byte) 78);
        this.field3186 = new byte[arg2];
        this.field3188 = 0L;
        this.field3201 = new byte[arg1];
    }
}
