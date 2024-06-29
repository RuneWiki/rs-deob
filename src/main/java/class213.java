import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class213 {

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "Z")
    public static boolean field3664 = false;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "Lsc;")
    public static class181 field3667 = class149.method967(255, "www)2wtrc");

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "Lsc;")
    public static class181 field3668 = class149.method967(255, ")3)3)3");

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public static int field3673 = 5063219;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "Z")
    public static boolean field3672 = false;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "Lsc;")
    public static class181 field3674 = class149.method967(255, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILjb;Ljb;)V")
    public static final void method1413(int arg0, class11 arg1, class11 arg2) {
        class52.field824 = arg2;
        class135.field2206 = arg1;
        field3669++;
        class77.field1245 = class135.field2206.method102(3, -23099);
        if (arg0 != -1) {
            field3664 = true;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)J")
    public static final synchronized long method1414(int arg0) {
        field3665++;
        long var1 = System.currentTimeMillis();
        if (class115.field1878 > var1) {
            class177.field3111 += class115.field1878 - var1;
        }
        if (arg0 != -9292) {
            field3674 = null;
        }
        class115.field1878 = var1;
        return class177.field3111 + var1;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Leg;I)V")
    public static final void method1415(class157 arg0, int arg1) {
        field3666++;
        if (arg0.field2628 == 0) {
            return;
        }
        if (arg0.field2658 != -1 && arg0.field2658 < 32768) {
            class178 var2 = class129.field2140[arg0.field2658];
            if (var2 != null) {
                int var3 = arg0.field2654 - var2.field2654;
                int var4 = arg0.field2681 - var2.field2681;
                if (var3 != 0 || var4 != 0) {
                    arg0.field2616 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field2658 >= 32768) {
            int var5 = arg0.field2658 - 32768;
            if (class199.field3452 == var5) {
                var5 = 2047;
            }
            class116 var6 = class39.field602[var5];
            if (var6 != null) {
                int var7 = arg0.field2681 - var6.field2681;
                int var8 = arg0.field2654 - var6.field2654;
                if (var8 != 0 || var7 != 0) {
                    arg0.field2616 = (int) (Math.atan2((double) var8, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field2641 != 0 || arg0.field2659 != 0) && (arg0.field2631 == 0 || arg0.field2651 > 0)) {
            int var9 = arg0.field2654 + (arg0.field2619 * 64) - ((-class253.field4420 + arg0.field2641 + -class253.field4420) * 64) - 64;
            int var10 = arg0.field2619 * 64 + arg0.field2681 - ((arg0.field2659 - class222.field3844 - class222.field3844) * 64) - 64;
            if (var9 != 0 || var10 != 0) {
                arg0.field2616 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field2659 = 0;
            arg0.field2641 = 0;
        }
        int var11 = arg0.field2616 - arg0.field2675 & 0x7FF;
        if (var11 == 0) {
            arg0.field2615 = 0;
        } else {
            arg0.field2615++;
            if (var11 <= 1024) {
                arg0.field2675 += arg0.field2628;
                boolean var12 = true;
                if (arg0.field2628 > var11 || 2048 - arg0.field2628 < var11) {
                    var12 = false;
                    arg0.field2675 = arg0.field2616;
                }
                if (arg0.field2655 == arg0.field2629 && (arg0.field2615 > 25 || var12)) {
                    if (arg0.field2635 == -1) {
                        arg0.field2629 = arg0.field2671;
                    } else {
                        arg0.field2629 = arg0.field2635;
                    }
                }
            } else {
                arg0.field2675 -= arg0.field2628;
                boolean var13 = true;
                if (arg0.field2628 > var11 || var11 > (2048 - arg0.field2628)) {
                    var13 = false;
                    arg0.field2675 = arg0.field2616;
                }
                if (arg0.field2655 == arg0.field2629 && (arg0.field2615 > 25 || var13)) {
                    if (arg0.field2663 == -1) {
                        arg0.field2629 = arg0.field2671;
                    } else {
                        arg0.field2629 = arg0.field2663;
                    }
                }
            }
            arg0.field2675 &= 0x7FF;
        }
        if (arg1 > -36) {
            method1414(-30);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
    public static void method1416(int arg0) {
        if (arg0 <= 125) {
            method1414(-90);
        }
        field3667 = null;
        field3674 = null;
        field3668 = null;
    }
}
