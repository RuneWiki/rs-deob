import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public abstract class class197 implements class694 {

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "Z")
    private boolean field2389 = false;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public int field2380;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    public int field2394;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Lkga;")
    public class506 field2388;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    private int field2398;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "Z")
    private boolean field2396;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    public int field2397;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "J")
    public static long field2381 = 20000000L;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field2384 = 0;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field2390 = 0;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "[I")
    public static int[] field2400;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V")
    private final void method1200(int arg0, int arg1) {
        field2387++;
        this.field2388.field7281 -= arg1;
        if (arg0 <= 93) {
            method1201(-1);
        }
        this.field2388.field7281 += this.method1203(false);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static void method1201(int arg0) {
        field2400 = null;
        if (arg0 != 9984) {
            field2384 = -48;
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)Z")
    public final boolean method1202(int arg0) {
        field2393++;
        if (arg0 != -32177) {
            return true;
        } else if (this.field2388.field7397) {
            int var2 = this.method1203(false);
            this.field2388.method2932(true, this);
            OpenGL.glGenerateMipmapEXT(this.field2380);
            this.field2396 = true;
            this.method1205(48);
            this.method1200(arg0 + 32276, var2);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)I")
    private final int method1203(boolean arg0) {
        field2385++;
        int var2 = this.field2388.method2993(this.field2394, arg0) * this.field2398;
        return this.field2396 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
    public final void method1204(int arg0) {
        if (this.field2397 > 0) {
            this.field2388.method2939(this.field2397, 5126, this.method1203(false));
            this.field2397 = 0;
        }
        field2382++;
        if (arg0 != -1) {
            method1201(124);
        }
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V")
    private final void method1205(int arg0) {
        field2392++;
        this.field2388.method2932(true, this);
        if (this.field2389) {
            OpenGL.glTexParameteri(this.field2380, 10241, this.field2396 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field2380, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field2380, 10241, this.field2396 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field2380, 10240, 9728);
        }
        int var2 = -93 / ((arg0 + 16) / 61);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILfga;BI)V")
    public static final void method1206(int arg0, int arg1, class232 arg2, byte arg3, int arg4) {
        field2379++;
        for (class58 var5 = (class58) class148.field1822.method1132((byte) 67); var5 != null; var5 = (class58) class148.field1822.method1134(8446)) {
            if (var5.field903 == arg4 && (arg0 << 9) == var5.field920 && (arg1 << 9) == var5.field923 && var5.field919.field3056 == arg2.field3056) {
                if (var5.field906 != null) {
                    class399.field5624.method1805(var5.field906);
                    var5.field906 = null;
                }
                if (var5.field914 != null) {
                    class399.field5624.method1805(var5.field914);
                    var5.field914 = null;
                }
                var5.method3045(true);
                return;
            }
        }
        int var6 = 64 % ((arg3 - 57) / 50);
    }

    @OriginalMember(owner = "client!jf", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field2401++;
        this.method1204(-1);
        super.finalize();
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I[J[Ljava/lang/Object;BI)V")
    public static final void method1207(int arg0, long[] arg1, Object[] arg2, byte arg3, int arg4) {
        field2386++;
        if (arg0 > arg4) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg4;
            long var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            Object var9 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg4; var11 < arg0; var11++) {
                if (arg1[var11] < (long) (var11 & var10) + var7) {
                    long var12 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6] = var12;
                    Object var14 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6++] = var14;
                }
            }
            arg1[arg0] = arg1[var6];
            arg1[var6] = var7;
            arg2[arg0] = arg2[var6];
            arg2[var6] = var9;
            method1207(var6 - 1, arg1, arg2, (byte) 54, arg4);
            method1207(arg0, arg1, arg2, (byte) 54, var6 + 1);
        }
        if (arg3 != 54) {
            method1201(-105);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZB)V")
    public final void method1208(boolean arg0, byte arg1) {
        field2391++;
        if (arg1 != 14) {
            this.field2388 = null;
        }
        if (arg0 != this.field2396) {
            int var3 = this.method1203(false);
            this.field2396 = true;
            this.method1205(91);
            this.method1200(96, var3);
        }
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)V")
    public static final void method1209(int arg0) {
        field2399++;
        if (class501.method2912(-4, class114.field1485) || class657.method3723(class114.field1485, -10)) {
            class513.method3043(5000, class627.field8995 >> 12, -1, class346.field4550 >> 12);
        } else {
            int var1 = class206.field2472.field2689[0] >> 3;
            int var2 = class206.field2472.field2686[0] >> 3;
            if (var1 >= 0 && class473.field6604 >> 3 > var1 && var2 >= 0 && class205.field2465 >> 3 > var2) {
                class513.method3043(5000, var2, -1, var1);
            } else {
                class513.method3043(0, class205.field2465 >> 4, arg0 ^ 0xD648413B, class473.field6604 >> 4);
            }
        }
        class397.method2399(false);
        class573.method3356(125);
        class641.method3649(-73);
        if (arg0 != 699907780) {
            method1201(-70);
        }
        class704.method3947((byte) -120);
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)I")
    public final int method1210(byte arg0) {
        if (arg0 != -122) {
            this.field2397 = 109;
        }
        field2395++;
        return this.field2397;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(ZB)V")
    public final void method1211(boolean arg0, byte arg1) {
        field2383++;
        if (arg0 != this.field2389) {
            this.field2389 = arg0;
            this.method1205(arg1 ^ 0xFFFFFF88);
        }
        if (arg1 != 33) {
            this.method1211(false, (byte) 52);
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lkga;IIIZ)V")
    public class197(class506 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2380 = arg1;
        this.field2394 = arg2;
        this.field2388 = arg0;
        this.field2398 = arg3;
        this.field2396 = arg4;
        OpenGL.glGenTextures(1, class665.field9421, 0);
        this.field2397 = class665.field9421[0];
        this.method1200(97, 0);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public abstract void method1160(byte arg0);
}
