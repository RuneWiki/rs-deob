import java.awt.Canvas;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class367 extends class161 {

    @OriginalMember(owner = "client!tl", name = "y", descriptor = "I")
    public int field5564;

    @OriginalMember(owner = "client!tl", name = "C", descriptor = "I")
    public int field5568;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    private int field5557;

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "I")
    private int field5563;

    @OriginalMember(owner = "client!tl", name = "A", descriptor = "I")
    private int field5566;

    @OriginalMember(owner = "client!tl", name = "D", descriptor = "I")
    public int field5569;

    @OriginalMember(owner = "client!tl", name = "E", descriptor = "I")
    private int field5570;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
    private int field5559;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "I")
    public int field5562;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "[I")
    public static int[] field5553 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "I")
    public static int field5561 = 0;

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "I")
    public static int field5565 = 0;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "I")
    public static int field5552 = 0;

    @OriginalMember(owner = "client!tl", name = "B", descriptor = "I")
    public static int field5567 = 0;

    @OriginalMember(owner = "client!tl", name = "F", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5571 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    public static int field5556;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!tl", name = "G", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)Z")
    public final boolean method2355(int arg0, int arg1, int arg2) {
        field5555++;
        if (arg1 != -1) {
            field5561 = 44;
        }
        return arg0 >= this.field5568 && this.field5564 >= arg0 && this.field5562 <= arg2 && this.field5569 >= arg2;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIII)Z")
    public final boolean method2356(int arg0, int arg1, int arg2, int arg3) {
        field5558++;
        if (arg2 == 100) {
            return this.field5559 == arg0 && this.field5563 <= arg1 && this.field5557 >= arg1 && arg3 >= this.field5570 && arg3 <= this.field5566;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method2357(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (arg6 != -39) {
            method2359(false);
        }
        class57.method374(arg6 ^ 0xFFFF8D4F, arg3);
        field5551++;
        int var7 = 0;
        int var8 = arg3 - arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg3;
        int var10 = -arg3;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (arg1 >= class99.field1378 && class396.field5925 >= arg1) {
            int[] var14 = class277.field4414[arg1];
            int var15 = class21.method153(arg0 - arg3, (byte) -83, class185.field3005, class406.field6033);
            int var16 = class21.method153(arg0 + arg3, (byte) -123, class185.field3005, class406.field6033);
            int var17 = class21.method153(arg0 - var8, (byte) -85, class185.field3005, class406.field6033);
            int var18 = class21.method153(arg0 + var8, (byte) -81, class185.field3005, class406.field6033);
            class256.method1769(var17, var14, (byte) 47, arg2, var15);
            class256.method1769(var18, var14, (byte) 64, arg4, var17);
            class256.method1769(var16, var14, (byte) 125, arg2, var18);
        }
        int var19 = -1;
        while (var9 > var7) {
            var13 += 2;
            var19 += 2;
            var10 += var13;
            var12 += var19;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class172.field2714[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg1 - var9;
                int var21 = arg1 + var9;
                if (class99.field1378 <= var21 && var20 <= class396.field5925) {
                    if (var8 <= var9) {
                        int var22 = class21.method153(arg0 + var7, (byte) -69, class185.field3005, class406.field6033);
                        int var23 = class21.method153(arg0 - var7, (byte) -79, class185.field3005, class406.field6033);
                        if (var21 <= class396.field5925) {
                            class256.method1769(var22, class277.field4414[var21], (byte) 115, arg2, var23);
                        }
                        if (var20 >= class99.field1378) {
                            class256.method1769(var22, class277.field4414[var20], (byte) 93, arg2, var23);
                        }
                    } else {
                        int var24 = class172.field2714[var9];
                        int var25 = class21.method153(arg0 + var7, (byte) -120, class185.field3005, class406.field6033);
                        int var26 = class21.method153(arg0 - var7, (byte) -86, class185.field3005, class406.field6033);
                        int var27 = class21.method153(arg0 + var24, (byte) -81, class185.field3005, class406.field6033);
                        int var28 = class21.method153(arg0 - var24, (byte) -95, class185.field3005, class406.field6033);
                        if (var21 <= class396.field5925) {
                            int[] var29 = class277.field4414[var21];
                            class256.method1769(var28, var29, (byte) 64, arg2, var26);
                            class256.method1769(var27, var29, (byte) 94, arg4, var28);
                            class256.method1769(var25, var29, (byte) 121, arg2, var27);
                        }
                        if (var20 >= class99.field1378) {
                            int[] var30 = class277.field4414[var20];
                            class256.method1769(var28, var30, (byte) 46, arg2, var26);
                            class256.method1769(var27, var30, (byte) 85, arg4, var28);
                            class256.method1769(var25, var30, (byte) 61, arg2, var27);
                        }
                    }
                }
            }
            int var31 = arg1 - var7;
            int var32 = arg1 + var7;
            if (class99.field1378 <= var32 && class396.field5925 >= var31) {
                int var33 = arg0 + var9;
                int var34 = arg0 - var9;
                if (class406.field6033 <= var33 && var34 <= class185.field3005) {
                    int var35 = class21.method153(var33, (byte) -108, class185.field3005, class406.field6033);
                    int var36 = class21.method153(var34, (byte) -74, class185.field3005, class406.field6033);
                    if (var8 <= var7) {
                        if (var32 <= class396.field5925) {
                            class256.method1769(var35, class277.field4414[var32], (byte) 108, arg2, var36);
                        }
                        if (var31 >= class99.field1378) {
                            class256.method1769(var35, class277.field4414[var31], (byte) 95, arg2, var36);
                        }
                    } else {
                        int var37 = var11 >= var7 ? var11 : class172.field2714[var7];
                        int var38 = class21.method153(arg0 + var37, (byte) -89, class185.field3005, class406.field6033);
                        int var39 = class21.method153(arg0 - var37, (byte) -81, class185.field3005, class406.field6033);
                        if (class396.field5925 >= var32) {
                            int[] var40 = class277.field4414[var32];
                            class256.method1769(var39, var40, (byte) 113, arg2, var36);
                            class256.method1769(var38, var40, (byte) 47, arg4, var39);
                            class256.method1769(var35, var40, (byte) 47, arg2, var38);
                        }
                        if (class99.field1378 <= var31) {
                            int[] var41 = class277.field4414[var31];
                            class256.method1769(var39, var41, (byte) 50, arg2, var36);
                            class256.method1769(var38, var41, (byte) 121, arg4, var39);
                            class256.method1769(var35, var41, (byte) 120, arg2, var38);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II[II)V")
    public final void method2358(int arg0, int arg1, int[] arg2, int arg3) {
        arg2[2] = this.field5562 + arg1 - this.field5570;
        if (arg0 <= 8) {
            field5552 = -5;
        }
        field5560++;
        arg2[1] = arg3 - (this.field5563 - this.field5568);
        arg2[0] = 0;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(Z)V")
    public static void method2359(boolean arg0) {
        if (arg0) {
            field5571 = null;
        }
        field5553 = null;
        field5571 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I[III)V")
    public final void method2360(int arg0, int[] arg1, int arg2, int arg3) {
        arg1[2] = this.field5570 + arg2 - this.field5562;
        arg1[0] = this.field5559;
        arg1[1] = this.field5563 + arg3 - this.field5568;
        field5556++;
        int var5 = 7 / ((-arg0 - 41) / 51);
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)I")
    public static final int method2361(int arg0) {
        field5572++;
        class312 var1 = class284.field4547;
        boolean var2 = false;
        if (class128.field2035 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class312.method2084((class215) null, (class279) null, -1, var3, 0, 0);
        }
        long var4 = class46.method297(27104);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method617(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class46.method297(27104) - var4);
        var1.method2086(100, 0, 100, -16777216, -765, 0);
        if (arg0 <= 48) {
            return 20;
        } else {
            if (var2) {
                var1.method2091(-15001);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(III)Z")
    public final boolean method2362(int arg0, int arg1, int arg2) {
        field5554++;
        if (arg2 != 26470) {
            this.method2358(-43, -94, (int[]) null, 29);
        }
        return this.field5563 <= arg0 && arg0 <= this.field5557 && this.field5570 <= arg1 && arg1 <= this.field5566;
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class367(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field5564 = arg7;
        this.field5568 = arg5;
        this.field5557 = arg3;
        this.field5563 = arg1;
        this.field5566 = arg4;
        this.field5569 = arg8;
        this.field5570 = arg2;
        this.field5559 = arg0;
        this.field5562 = arg6;
    }
}
