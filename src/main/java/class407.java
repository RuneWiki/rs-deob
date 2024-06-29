import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class407 extends class176 {

    @OriginalMember(owner = "client!eu", name = "m", descriptor = "I")
    public int field5776;

    @OriginalMember(owner = "client!eu", name = "r", descriptor = "I")
    public int field5781;

    @OriginalMember(owner = "client!eu", name = "p", descriptor = "I")
    public static int field5779 = 0;

    @OriginalMember(owner = "client!eu", name = "q", descriptor = "I")
    public static int field5780 = 0;

    @OriginalMember(owner = "client!eu", name = "n", descriptor = "I")
    public static int field5777;

    @OriginalMember(owner = "client!eu", name = "o", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2418(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class300.method1908(arg0, (byte) -89);
        field5777++;
        int var7 = 0;
        int var8 = arg0 - arg6;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        int var11 = var8;
        int var12 = -var8;
        if (arg3 > -37) {
            method2418(75, 105, 31, -121, -74, 56, -102);
        }
        int var13 = -1;
        int var14 = -1;
        if (arg2 >= class264.field3687 && arg2 <= class591.field8435) {
            int[] var15 = class182.field2580[arg2];
            int var16 = class646.method3722(arg5 - arg0, class326.field4387, class596.field8621, false);
            int var17 = class646.method3722(arg0 + arg5, class326.field4387, class596.field8621, false);
            int var18 = class646.method3722(arg5 - var8, class326.field4387, class596.field8621, false);
            int var19 = class646.method3722(arg5 + var8, class326.field4387, class596.field8621, false);
            class266.method1742(26844, var15, var18, arg4, var16);
            class266.method1742(26844, var15, var19, arg1, var18);
            class266.method1742(26844, var15, var17, arg4, var19);
        }
        while (var9 > var7) {
            var14 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class397.field5668[var11] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg2 - var9;
                int var21 = arg2 + var9;
                if (var21 >= class264.field3687 && class591.field8435 >= var20) {
                    if (var9 < var8) {
                        int var22 = class397.field5668[var9];
                        int var23 = class646.method3722(arg5 + var7, class326.field4387, class596.field8621, false);
                        int var24 = class646.method3722(arg5 - var7, class326.field4387, class596.field8621, false);
                        int var25 = class646.method3722(arg5 + var22, class326.field4387, class596.field8621, false);
                        int var26 = class646.method3722(arg5 - var22, class326.field4387, class596.field8621, false);
                        if (var21 <= class591.field8435) {
                            int[] var27 = class182.field2580[var21];
                            class266.method1742(26844, var27, var26, arg4, var24);
                            class266.method1742(26844, var27, var25, arg1, var26);
                            class266.method1742(26844, var27, var23, arg4, var25);
                        }
                        if (var20 >= class264.field3687) {
                            int[] var28 = class182.field2580[var20];
                            class266.method1742(26844, var28, var26, arg4, var24);
                            class266.method1742(26844, var28, var25, arg1, var26);
                            class266.method1742(26844, var28, var23, arg4, var25);
                        }
                    } else {
                        int var29 = class646.method3722(arg5 + var7, class326.field4387, class596.field8621, false);
                        int var30 = class646.method3722(arg5 - var7, class326.field4387, class596.field8621, false);
                        if (class591.field8435 >= var21) {
                            class266.method1742(26844, class182.field2580[var21], var29, arg4, var30);
                        }
                        if (var20 >= class264.field3687) {
                            class266.method1742(26844, class182.field2580[var20], var29, arg4, var30);
                        }
                    }
                }
            }
            int var31 = arg2 - var7;
            int var32 = arg2 + var7;
            if (var32 >= class264.field3687 && class591.field8435 >= var31) {
                int var33 = arg5 + var9;
                int var34 = arg5 - var9;
                if (var33 >= class326.field4387 && var34 <= class596.field8621) {
                    int var35 = class646.method3722(var33, class326.field4387, class596.field8621, false);
                    int var36 = class646.method3722(var34, class326.field4387, class596.field8621, false);
                    if (var7 < var8) {
                        int var37 = var11 >= var7 ? var11 : class397.field5668[var7];
                        int var38 = class646.method3722(arg5 + var37, class326.field4387, class596.field8621, false);
                        int var39 = class646.method3722(arg5 - var37, class326.field4387, class596.field8621, false);
                        if (var32 <= class591.field8435) {
                            int[] var40 = class182.field2580[var32];
                            class266.method1742(26844, var40, var39, arg4, var36);
                            class266.method1742(26844, var40, var38, arg1, var39);
                            class266.method1742(26844, var40, var35, arg4, var38);
                        }
                        if (var31 >= class264.field3687) {
                            int[] var41 = class182.field2580[var31];
                            class266.method1742(26844, var41, var39, arg4, var36);
                            class266.method1742(26844, var41, var38, arg1, var39);
                            class266.method1742(26844, var41, var35, arg4, var38);
                        }
                    } else {
                        if (var32 <= class591.field8435) {
                            class266.method1742(26844, class182.field2580[var32], var35, arg4, var36);
                        }
                        if (class264.field3687 <= var31) {
                            class266.method1742(26844, class182.field2580[var31], var35, arg4, var36);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILan;ILjava/awt/Canvas;Ln;)Lqa;")
    public static final class207 method2419(int arg0, class21 arg1, int arg2, Canvas arg3, class17 arg4) {
        field5778++;
        if (!class113.method786(false)) {
            throw new RuntimeException("");
        } else if (class336.method2038(false, "jaggl")) {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg3, 8, 8, arg0, 24, 0, arg2);
            if (var6 == 0L) {
                throw new RuntimeException("");
            }
            class424 var8 = new class424(var5, arg3, var6, arg4, arg1, arg2);
            var8.method2277(4);
            return var8;
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(II)V")
    public class407(int arg0, int arg1) {
        this.field5776 = arg0;
        this.field5781 = arg1;
    }
}
