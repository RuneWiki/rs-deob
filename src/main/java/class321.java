import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class321 extends class172 {

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "Ljl;")
    public static class332 field5105 = new class332(200);

    @OriginalMember(owner = "client!vd", name = "X", descriptor = "Ljava/lang/String;")
    public static String field5114 = null;

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "I")
    public int field5101;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!vd", name = "S", descriptor = "I")
    public int field5109;

    @OriginalMember(owner = "client!vd", name = "T", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!vd", name = "U", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!vd", name = "V", descriptor = "I")
    public int field5112;

    @OriginalMember(owner = "client!vd", name = "W", descriptor = "Lth;")
    public static class57 field5113;

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "Ljava/lang/String;")
    public String field5099;

    @OriginalMember(owner = "client!vd", name = "R", descriptor = "[B")
    public static byte[] field5108;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V", line = 5)
    public final void method2261(int arg0) {
        field5111++;
        this.field2754 = this.field2754 & Long.MIN_VALUE | class47.method371(-81) + 500L;
        if (arg0 != -129) {
            this.method2269(114);
        }
        class196.field3121.method911(arg0 + 629, this);
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "(I)V", line = 17)
    public static void method2262(int arg0) {
        field5114 = null;
        field5108 = null;
        field5105 = null;
        field5113 = null;
        if (arg0 != 1) {
            method2264(100, (class57) null, 98, -101);
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(Z)I", line = 35)
    public final int method2263(boolean arg0) {
        field5110++;
        return arg0 ? 19 : (int) this.field698;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILth;II)[Lsi;", line = 51)
    public static final class351[] method2264(int arg0, class57 arg1, int arg2, int arg3) {
        if (arg0 >= -108) {
            field5113 = (class57) null;
        }
        field5107++;
        return class315.method2233(arg2, (byte) 111, arg1, arg3) ? class6.method25((byte) 33) : null;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(Z)V", line = 67)
    public final void method2265(boolean arg0) {
        field5106++;
        this.field2754 |= Long.MIN_VALUE;
        if (this.method2267((byte) -26) == 0L) {
            class26.field319.method911(500, this);
        }
        if (arg0) {
            method2268(120);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([[FLua;IB[[FI[[FIIIIFZ[[IIII[[I)I", line = 82)
    public static final int method2266(float[][] arg0, class299 arg1, int arg2, byte arg3, float[][] arg4, int arg5, float[][] arg6, int arg7, int arg8, int arg9, int arg10, float arg11, boolean arg12, int[][] arg13, int arg14, int arg15, int arg16, int[][] arg17) {
        field5103++;
        if (arg10 == 1) {
            int var19 = arg7;
            arg7 = arg14;
            arg14 = 128 - var19;
        } else if (arg10 == 2) {
            arg7 = 128 - arg7;
            arg14 = 128 - arg14;
        } else if (arg10 == 3) {
            int var18 = arg7;
            arg7 = 128 - arg14;
            arg14 = var18;
        }
        if (arg3 != -21) {
            return -44;
        }
        float var20;
        float var21;
        int var22;
        float var23;
        if (arg7 == 0 && arg14 == 0) {
            var20 = arg0[arg16][arg8];
            var21 = arg4[arg16][arg8];
            var22 = arg15;
            var23 = arg6[arg16][arg8];
        } else if (arg7 == 128 && arg14 == 0) {
            var20 = arg0[arg16 + 1][arg8];
            var23 = arg6[arg16 + 1][arg8];
            var21 = arg4[arg16 + 1][arg8];
            var22 = arg2;
        } else if (arg7 == 128 && arg14 == 128) {
            var22 = arg5;
            var23 = arg6[arg16 + 1][arg8 + 1];
            var20 = arg0[arg16 + 1][arg8 + 1];
            var21 = arg4[arg16 + 1][arg8 + 1];
        } else if (arg7 == 0 && arg14 == 128) {
            var21 = arg4[arg16][arg8 + 1];
            var22 = arg9;
            var20 = arg0[arg16][arg8 + 1];
            var23 = arg6[arg16][arg8 + 1];
        } else {
            float var24 = (float) arg7 / 128.0F;
            float var25 = arg6[arg16][arg8];
            float var26 = arg0[arg16][arg8];
            float var27 = (arg6[arg16 + 1][arg8] - var25) * var24 + var25;
            float var28 = (arg0[arg16 + 1][arg8] - var26) * var24 + var26;
            float var29 = (float) arg14 / 128.0F;
            float var30 = arg4[arg16][arg8 + 1];
            float var31 = arg6[arg16][arg8 + 1];
            float var32 = (arg4[arg16 + 1][arg8 + 1] - var30) * var24 + var30;
            float var33 = arg4[arg16][arg8];
            float var34 = (arg4[arg16 + 1][arg8] - var33) * var24 + var33;
            float var35 = arg0[arg16][arg8 + 1];
            float var36 = (arg6[arg16 + 1][arg8 + 1] - var31) * var24 + var31;
            var23 = (var36 - var27) * var29 + var27;
            var21 = (var32 - var34) * var29 + var34;
            float var37 = (arg0[arg16 + 1][arg8 + 1] - var35) * var24 + var35;
            var20 = (var37 - var28) * var29 + var28;
            int var38 = class343.method2419(-80, arg2, arg15, arg7);
            int var39 = class343.method2419(arg3 ^ 0x7B, arg5, arg9, arg7);
            var22 = class343.method2419(-126, var39, var38, arg14);
        }
        int var40 = (arg16 << 7) + arg7;
        int var41 = (arg8 << 7) + arg14;
        int var42 = class151.method1168(arg8, arg17, (byte) -123, arg7, arg14, arg16);
        return arg1.method2140(var40, var42, var41, var21, var23, var20, arg12 ? var22 & 0xFFFFFF00 : var22, arg13 == null ? 0.0F : (float) (var42 - class151.method1168(arg8, arg13, (byte) -112, arg7, arg14, arg16)) / arg11);
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(B)J", line = 200)
    public final long method2267(byte arg0) {
        if (arg0 != -26) {
            this.field5101 = -16;
        }
        field5102++;
        return this.field2754 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "(I)V", line = 213)
    public static final void method2268(int arg0) {
        try {
            Method var1 = Runtime.class.getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class10.field81 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var6) {
                }
            }
        } catch (Exception var7) {
        }
        if (arg0 <= -21) {
            field5104++;
        }
    }

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "(I)I", line = 248)
    public final int method2269(int arg0) {
        field5100++;
        if (arg0 != -28597) {
            this.method2269(12);
        }
        return (int) (this.field698 >>> 32 & 0xFFL);
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(II)V", line = 257)
    public class321(int arg0, int arg1) {
        this.field698 = (long) arg0 << 32 | (long) arg1;
    }
}
