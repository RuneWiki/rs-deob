import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class497 extends class200 implements class143 {

    @OriginalMember(owner = "client!ip", name = "E", descriptor = "I")
    private int field7342 = -1;

    @OriginalMember(owner = "client!ip", name = "z", descriptor = "I")
    private int field7337 = -1;

    @OriginalMember(owner = "client!ip", name = "L", descriptor = "I")
    public int field7349;

    @OriginalMember(owner = "client!ip", name = "y", descriptor = "I")
    private int field7336;

    @OriginalMember(owner = "client!ip", name = "G", descriptor = "Lvj;")
    private class303 field7344;

    @OriginalMember(owner = "client!ip", name = "A", descriptor = "I")
    public int field7338;

    @OriginalMember(owner = "client!ip", name = "w", descriptor = "I")
    private int field7334;

    @OriginalMember(owner = "client!ip", name = "u", descriptor = "I")
    private int field7332;

    @OriginalMember(owner = "client!ip", name = "C", descriptor = "Ljv;")
    public static class55 field7340 = new class55(8);

    @OriginalMember(owner = "client!ip", name = "H", descriptor = "F")
    public static float field7345;

    @OriginalMember(owner = "client!ip", name = "v", descriptor = "I")
    public static int field7333;

    @OriginalMember(owner = "client!ip", name = "x", descriptor = "I")
    public static int field7335;

    @OriginalMember(owner = "client!ip", name = "B", descriptor = "I")
    public static int field7339;

    @OriginalMember(owner = "client!ip", name = "D", descriptor = "I")
    public static int field7341;

    @OriginalMember(owner = "client!ip", name = "F", descriptor = "I")
    public static int field7343;

    @OriginalMember(owner = "client!ip", name = "I", descriptor = "I")
    public static int field7346;

    @OriginalMember(owner = "client!ip", name = "K", descriptor = "I")
    public static int field7348;

    @OriginalMember(owner = "client!ip", name = "J", descriptor = "[J")
    public static long[] field7347;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "(I)V")
    public static final void method2979(int arg0) {
        field7348++;
        if (class364.field5513 == -1) {
            return;
        }
        int var1 = class166.field2579.method1024(true);
        int var2 = class166.field2579.method1019((byte) 3);
        class432 var3 = (class432) class502.field7411.method2427(105);
        if (var3 != null) {
            var1 = var3.method2183(arg0 - 5);
            var2 = var3.method2186((byte) 119);
        }
        class48.method454(0, 0, 0, var1, class77.field1297, (byte) 85, class364.field5513, arg0, class466.field6952, var2);
        if (class47.field876 != null) {
            class432.method2587(var1, var2, false);
        }
    }

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "(I)V")
    public final void method2980(int arg0) {
        if (this.field7334 > arg0) {
            this.field7344.method1932(this.field7332, -1, this.field7334);
            this.field7334 = 0;
        }
        field7341++;
    }

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "(I)V")
    public static final void method2981(int arg0) {
        field7346++;
        int var1 = 0;
        if (class443.field6623.method337(class169.field2624, (byte) 119)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (arg0 != 30) {
            return;
        }
        if (!class443.field6623.field616) {
            var1 |= 0x40;
        }
        class122.method944((byte) -122, var1);
        class319.field4807.method2868((byte) 123, var1);
        class367.field5550.method1310(arg0 + 23, var1);
        class61.field1070.method501((byte) -106, var1);
        class140.field2233.method2250((byte) 85, var1);
        class390.method2411((byte) 124, var1);
        class483.method2880(var1, -1);
        class106.method798(var1, 16383);
        class268.method1735(-28389, var1);
        if (class281.field4023 == 10) {
            class244.method1590(28, (byte) 24);
        } else if (class281.field4023 == 30) {
            class244.method1590(25, (byte) 82);
            return;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)V")
    public static void method2982(boolean arg0) {
        if (!arg0) {
            field7347 = null;
            field7340 = null;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(BII)V")
    public final void method2983(byte arg0, int arg1, int arg2) {
        if (arg0 > -74) {
            this.field7342 = 57;
        }
        field7339++;
        OpenGL.glFramebufferRenderbufferEXT(arg2, arg1, 36161, this.field7334);
        this.field7342 = arg2;
        this.field7337 = arg1;
    }

    @OriginalMember(owner = "client!ip", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method2980(0);
        field7343++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
    public final void method1055(byte arg0) {
        if (arg0 > -52) {
            method2979(20);
        }
        OpenGL.glFramebufferRenderbufferEXT(this.field7342, this.field7337, 36161, 0);
        field7335++;
        this.field7337 = -1;
        this.field7342 = -1;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2984(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class251.method1618(108, arg6);
        field7333++;
        int var7 = 0;
        int var8 = arg6 - arg1;
        if (arg4 > var8) {
            var8 = 0;
        }
        int var9 = arg6;
        int var10 = -arg6;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (arg5 >= class70.field1213 && class389.field5859 >= arg5) {
            int[] var15 = class21.field430[arg5];
            int var16 = class9.method50(class315.field4754, arg3 - arg6, class156.field2455, true);
            int var17 = class9.method50(class315.field4754, arg3 + arg6, class156.field2455, true);
            int var18 = class9.method50(class315.field4754, arg3 - var8, class156.field2455, true);
            int var19 = class9.method50(class315.field4754, arg3 + var8, class156.field2455, true);
            class179.method1269(var15, arg2, var16, var18, 26985);
            class179.method1269(var15, arg0, var18, var19, 26985);
            class179.method1269(var15, arg2, var19, var17, 26985);
        }
        while (var9 > var7) {
            var14 += 2;
            var13 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class288.field4106[var11] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg5 - var9;
                int var21 = arg5 + var9;
                if (class70.field1213 <= var21 && var20 <= class389.field5859) {
                    if (var9 < var8) {
                        int var22 = class288.field4106[var9];
                        int var23 = class9.method50(class315.field4754, arg3 + var7, class156.field2455, true);
                        int var24 = class9.method50(class315.field4754, arg3 - var7, class156.field2455, true);
                        int var25 = class9.method50(class315.field4754, arg3 + var22, class156.field2455, true);
                        int var26 = class9.method50(class315.field4754, arg3 - var22, class156.field2455, true);
                        if (var21 <= class389.field5859) {
                            int[] var27 = class21.field430[var21];
                            class179.method1269(var27, arg2, var24, var26, arg4 ^ 0x6969);
                            class179.method1269(var27, arg0, var26, var25, 26985);
                            class179.method1269(var27, arg2, var25, var23, 26985);
                        }
                        if (class70.field1213 <= var20) {
                            int[] var28 = class21.field430[var20];
                            class179.method1269(var28, arg2, var24, var26, arg4 ^ 0x6969);
                            class179.method1269(var28, arg0, var26, var25, 26985);
                            class179.method1269(var28, arg2, var25, var23, arg4 ^ 0x6969);
                        }
                    } else {
                        int var29 = class9.method50(class315.field4754, arg3 + var7, class156.field2455, true);
                        int var30 = class9.method50(class315.field4754, arg3 - var7, class156.field2455, true);
                        if (class389.field5859 >= var21) {
                            class179.method1269(class21.field430[var21], arg2, var30, var29, arg4 ^ 0x6969);
                        }
                        if (class70.field1213 <= var20) {
                            class179.method1269(class21.field430[var20], arg2, var30, var29, 26985);
                        }
                    }
                }
            }
            int var31 = arg5 - var7;
            int var32 = arg5 + var7;
            if (var32 >= class70.field1213 && var31 <= class389.field5859) {
                int var33 = arg3 + var9;
                int var34 = arg3 - var9;
                if (class315.field4754 <= var33 && var34 <= class156.field2455) {
                    int var35 = class9.method50(class315.field4754, var33, class156.field2455, true);
                    int var36 = class9.method50(class315.field4754, var34, class156.field2455, true);
                    if (var7 >= var8) {
                        if (var32 <= class389.field5859) {
                            class179.method1269(class21.field430[var32], arg2, var36, var35, 26985);
                        }
                        if (class70.field1213 <= var31) {
                            class179.method1269(class21.field430[var31], arg2, var36, var35, 26985);
                        }
                    } else {
                        int var37 = var7 > var11 ? class288.field4106[var7] : var11;
                        int var38 = class9.method50(class315.field4754, arg3 + var37, class156.field2455, true);
                        int var39 = class9.method50(class315.field4754, arg3 - var37, class156.field2455, true);
                        if (class389.field5859 >= var32) {
                            int[] var40 = class21.field430[var32];
                            class179.method1269(var40, arg2, var36, var39, arg4 + 26985);
                            class179.method1269(var40, arg0, var39, var38, arg4 + 26985);
                            class179.method1269(var40, arg2, var38, var35, 26985);
                        }
                        if (var31 >= class70.field1213) {
                            int[] var41 = class21.field430[var31];
                            class179.method1269(var41, arg2, var36, var39, 26985);
                            class179.method1269(var41, arg0, var39, var38, 26985);
                            class179.method1269(var41, arg2, var38, var35, arg4 ^ 0x6969);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lvj;III)V")
    public class497(class303 arg0, int arg1, int arg2, int arg3) {
        this.field7349 = arg3;
        this.field7336 = arg1;
        this.field7344 = arg0;
        this.field7338 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class179.field2710, 0);
        this.field7334 = class179.field2710[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field7334);
        OpenGL.glRenderbufferStorageEXT(36161, this.field7336, this.field7338, this.field7349);
        this.field7332 = this.field7338 * this.field7349 * this.field7344.method1963(503683664, this.field7336);
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lvj;IIII)V")
    public class497(class303 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7349 = arg3;
        this.field7344 = arg0;
        this.field7338 = arg2;
        this.field7336 = arg1;
        OpenGL.glGenRenderbuffersEXT(1, class179.field2710, 0);
        this.field7334 = class179.field2710[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field7334);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field7336, this.field7338, this.field7349);
        this.field7332 = this.field7349 * this.field7338 * this.field7344.method1963(503683664, this.field7336);
    }
}
