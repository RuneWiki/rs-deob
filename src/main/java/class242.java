import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class242 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Lma;")
    public static class5 field4024 = class12.method119("overlay2", (byte) 85);

    @OriginalMember(owner = "client!re", name = "b", descriptor = "Lma;")
    public static class5 field4025 = class12.method119("www", (byte) 105);

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field4027 = 0;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Z")
    public static boolean field4033 = false;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field4026 = -1;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "Lma;")
    public static class5 field4036 = class12.method119("Stufe)2", (byte) 62);

    @OriginalMember(owner = "client!re", name = "h", descriptor = "[Lmc;")
    public static class50[] field4031 = new class50[4];

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public static int field4038 = 0;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)V", line = 4)
    public static final void method1704(int arg0, int arg1) {
        if (arg1 != Integer.MAX_VALUE) {
            field4033 = true;
        }
        field4032++;
        class12.field234.method517(false, arg0);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZIIIIILmc;)V", line = 15)
    public static final void method1705(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class50 arg6) {
        field4028++;
        long var7 = 0L;
        boolean var9 = false;
        if (arg0) {
            return;
        }
        boolean var10 = true;
        if (arg1 == 0) {
            var7 = class223.method1576(arg4, arg3, arg2);
        } else if (arg1 == 1) {
            var7 = class14.method134(arg4, arg3, arg2);
        } else if (arg1 == 2) {
            var7 = class158.method1013(arg4, arg3, arg2);
        } else if (arg1 == 3) {
            var7 = class157.method1008(arg4, arg3, arg2);
        }
        boolean var11 = false;
        int var12 = (int) var7 >> 20 & 0x3;
        int var13 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        class185 var14 = class77.method536(var13, 120);
        int var15 = (int) var7 >> 14 & 0x1F;
        if (var14.method1224(0)) {
            class282.method1910(arg0, var14, arg3, arg2, arg4);
        }
        if (var7 == 0L) {
            return;
        }
        class280 var16 = null;
        class280 var17 = null;
        if (arg1 == 0) {
            class89 var18 = class275.method1873(arg4, arg3, arg2);
            if (var18 != null) {
                var17 = var18.field1337;
                var16 = var18.field1326;
            }
            if (var14.field2911 != 0) {
                arg6.method368(arg2, arg3, var14.field2858, var12, var15, -1);
            }
        } else if (arg1 == 1) {
            class133 var21 = class98.method633(arg4, arg3, arg2);
            if (var21 != null) {
                var16 = var21.field1977;
                var17 = var21.field1971;
            }
        } else if (arg1 == 2) {
            class107 var19 = class194.method1274(arg4, arg3, arg2);
            if (var19 != null) {
                var17 = var19.field1589;
            }
            if (var14.field2911 != 0 && arg3 + var14.field2840 < 104 && var14.field2840 + arg2 < 104 && (var14.field2859 + arg3) < 104 && (var14.field2859 + arg2) < 104) {
                arg6.method388(var12, var14.field2859, arg2, var14.field2840, -1, arg3, var14.field2858);
            }
        } else if (arg1 == 3) {
            class51 var20 = class49.method364(arg4, arg3, arg2);
            if (var20 != null) {
                var17 = var20.field809;
            }
            if (var14.field2911 == 1) {
                arg6.method370(arg2, arg3, -262145);
            }
        }
        if (!var14.field2898) {
            return;
        }
        if (var15 == 2) {
            if (var17 instanceof class68) {
                ((class68) var17).method488((byte) -43);
            } else {
                class211.method1397(0, var14, arg2, !arg0, arg3, arg5, var12 + 4, 0, var15);
            }
            if (var16 instanceof class68) {
                ((class68) var16).method488((byte) -121);
            } else {
                class211.method1397(0, var14, arg2, true, arg3, arg5, var12 + 1 & 0x3, 0, var15);
            }
        } else if (var15 == 5) {
            if (var17 instanceof class68) {
                ((class68) var17).method488((byte) -81);
            } else {
                class211.method1397(class250.field4150[var12] * 8, var14, arg2, !arg0, arg3, arg5, var12, class81.field1266[var12] * 8, 4);
            }
        } else if (var15 == 6) {
            if ((var17 instanceof class68)) {
                ((class68) var17).method488((byte) -115);
            } else {
                class211.method1397(class286.field4816[var12] * 8, var14, arg2, true, arg3, arg5, var12 + 4, class142.field2091[var12] * 8, 4);
            }
        } else if (var15 == 7) {
            if ((var17 instanceof class68)) {
                ((class68) var17).method488((byte) -30);
            } else {
                class211.method1397(0, var14, arg2, true, arg3, arg5, (var12 + 2 & 0x3) + 4, 0, 4);
            }
        } else if (var15 == 8) {
            if ((var17 instanceof class68)) {
                ((class68) var17).method488((byte) -80);
            } else {
                class211.method1397(class286.field4816[var12] * 8, var14, arg2, true, arg3, arg5, var12 + 4, class142.field2091[var12] * 8, 4);
            }
            if ((var16 instanceof class68)) {
                ((class68) var16).method488((byte) -18);
            } else {
                class211.method1397(class286.field4816[var12] * 8, var14, arg2, true, arg3, arg5, (var12 + 2 & 0x3) + 4, class142.field2091[var12] * 8, 4);
            }
        } else if (var15 == 11) {
            if ((var17 instanceof class68)) {
                ((class68) var17).method488((byte) -116);
            } else {
                class211.method1397(0, var14, arg2, !arg0, arg3, arg5, var12 + 4, 0, 10);
            }
        } else if ((var17 instanceof class68)) {
            ((class68) var17).method488((byte) -64);
        } else {
            class211.method1397(0, var14, arg2, true, arg3, arg5, var12, 0, var15);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I[[I)V", line = 222)
    public static final void method1706(int arg0, int[][] arg1) {
        class137.field2032 = arg1;
        field4035++;
        if (arg0 != 0) {
            field4038 = 20;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 247)
    public static void method1707(int arg0) {
        field4036 = null;
        field4031 = null;
        if (arg0 == 2060170464) {
            field4025 = null;
            field4024 = null;
        }
    }
}
