import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class163 extends class107 {

    @OriginalMember(owner = "client!bj", name = "H", descriptor = "Z")
    private boolean field2653 = true;

    @OriginalMember(owner = "client!bj", name = "I", descriptor = "I")
    private int field2654 = 4096;

    @OriginalMember(owner = "client!bj", name = "E", descriptor = "I")
    public static int field2650 = -1;

    @OriginalMember(owner = "client!bj", name = "M", descriptor = "Z")
    public static boolean field2658 = false;

    @OriginalMember(owner = "client!bj", name = "F", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!bj", name = "G", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!bj", name = "J", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!bj", name = "K", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!bj", name = "L", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!bj", name = "N", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public static final void method1115(Component arg0, boolean arg1) {
        ++field2651;
        arg0.addMouseListener(class149.field2381);
        arg0.addMouseMotionListener(class149.field2381);
        if (arg1) {
            field2650 = -35;
        }
        arg0.addFocusListener(class149.field2381);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        if (arg2 != 28) {
            field2650 = -88;
        }
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field2653 = arg1.method1849(255) == 1;
            }
        } else {
            this.field2654 = arg1.method1837(252);
        }
        ++field2656;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BI)Ljd;")
    public static final class92 method1116(byte arg0, int arg1) {
        ++field2655;
        class92 var2 = (class92) class192.field3135.method1879(8887, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class157.field2510.method1156(class200.method1375(arg0 ^ 15, arg1), class111.method775(-62, arg1), (byte) -16);
            class92 var4 = new class92();
            if (arg0 != 15) {
                method1116((byte) 94, -6);
            }
            if (var3 != null) {
                var4.method640(0, new class274(var3));
            }
            class192.field3135.method1883((long) arg1, 58, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
    public class163() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IB)[[I")
    public final int[][] method190(int arg0, byte arg1) {
        int[][] var3 = super.field1662.method1302(arg0, (byte) 26);
        if (super.field1662.field3063) {
            int[] var4 = this.method756(0, arg0 - 1 & class107.field1677, -29053);
            int[] var5 = this.method756(0, arg0, -29053);
            int[] var6 = this.method756(0, class107.field1677 & arg0 + 1, -29053);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class24.field443; ++var10) {
                int var11 = (var5[class128.field2053 & var10 - -1] + -var5[var10 + -1 & class128.field2053]) * this.field2654;
                int var12 = (var6[var10] + -var4[var10]) * this.field2654;
                int var13 = var11 >> 12;
                int var14 = var13 * var13 >> 12;
                int var15 = var12 >> 12;
                int var16 = var15 * var15 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var14 - (-var16 - 4096)) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 != -1) {
                    var18 = var11 / var17;
                    var19 = 16777216 / var17;
                    var20 = var12 / var17;
                } else {
                    var19 = 0;
                    var20 = 0;
                    var18 = 0;
                }
                if (this.field2653) {
                    var19 = 2048 - -(var19 >> 1);
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var18;
                var8[var10] = var20;
                var9[var10] = var19;
            }
        }
        if (arg1 != -117) {
            this.method190(-12, (byte) 24);
        }
        ++field2659;
        return var3;
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(III)Z")
    public static final boolean method1117(int arg0, int arg1, int arg2) {
        int var3 = class55.field798[arg0][arg1][arg2];
        if (-class271.field4367 == var3) {
            return false;
        } else if (class271.field4367 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class169.method1198(var4 + 1, class166.field2746[arg0][arg1][arg2], var5 + 1) && class169.method1198(var4 + 128 - 1, class166.field2746[arg0][arg1 + 1][arg2], var5 + 1) && class169.method1198(var4 + 128 - 1, class166.field2746[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class169.method1198(var4 + 1, class166.field2746[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class55.field798[arg0][arg1][arg2] = class271.field4367;
                return true;
            } else {
                class55.field798[arg0][arg1][arg2] = -class271.field4367;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method1118(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class95.field1504 * 128) {
            arg0 = class95.field1504 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class200.field3208 * 128) {
            arg2 = class200.field3208 * 128 - 1;
        }
        class270.field4354 = class136.field2191[arg3];
        class281.field4575 = class136.field2193[arg3];
        class25.field455 = class136.field2191[arg4];
        class268.field4333 = class136.field2193[arg4];
        class35.field567 = arg0;
        class251.field4123 = arg1;
        class280.field4561 = arg2;
        class270.field4351 = arg0 / 128;
        class72.field1157 = arg2 / 128;
        class21.field395 = class270.field4351 - class210.field3346;
        if (class21.field395 < 0) {
            class21.field395 = 0;
        }
        class154.field2460 = class72.field1157 - class210.field3346;
        if (class154.field2460 < 0) {
            class154.field2460 = 0;
        }
        class310.field5017 = class270.field4351 + class210.field3346;
        if (class310.field5017 > class95.field1504) {
            class310.field5017 = class95.field1504;
        }
        class49.field719 = class72.field1157 + class210.field3346;
        if (class49.field719 > class200.field3208) {
            class49.field719 = class200.field3208;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class210.field3346 + class210.field3346 + 2; ++var16) {
            for (int var19 = 0; var19 < class210.field3346 + class210.field3346 + 2; ++var19) {
                int var20 = (var16 - class210.field3346 << 7) - (class35.field567 & 127);
                int var21 = (var19 - class210.field3346 << 7) - (class280.field4561 & 127);
                int var22 = class270.field4351 - class210.field3346 + var16;
                int var23 = class72.field1157 - class210.field3346 + var19;
                if (var22 >= 0 && var23 >= 0 && var22 < class95.field1504 && var23 < class200.field3208) {
                    int var24;
                    if (class199.field3192 != null) {
                        var24 = class199.field3192[0][var22][var23] - class251.field4123 + 128;
                    } else {
                        var24 = class300.field4915[0][var22][var23] - class251.field4123 + 128;
                    }
                    int var25 = class300.field4915[3][var22][var23] - class251.field4123 - 1000;
                    class225.field3541[var16][var19] = class95.method686(var20, var25, var24, var21, var15);
                } else {
                    class225.field3541[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class210.field3346 + class210.field3346 + 1; ++var17) {
            for (int var18 = 0; var18 < class210.field3346 + class210.field3346 + 1; ++var18) {
                class306.field4970[var17][var18] = class225.field3541[var17][var18] || class225.field3541[var17 + 1][var18] || class225.field3541[var17][var18 + 1] || class225.field3541[var17 + 1][var18 + 1];
            }
        }
        class58.field833 = arg6;
        class75.field1199 = arg7;
        class237.field3726 = arg8;
        class13.field264 = arg9;
        class263.field4302 = arg10;
        class182.method1285();
        if (class111.field1711 != null) {
            class294.method2020(true);
            class130.method883(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class294.method2020(false);
        }
        class130.method883(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }
}
