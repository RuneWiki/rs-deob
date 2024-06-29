import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class26 {

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "Z")
    public static boolean field438 = true;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
    public static int field435 = 0;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "Llc;")
    private static class143 field439 = class66.method374("Loading world list data", -1);

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "Llc;")
    public static class143 field437 = class66.method374("Polices charg-Bes", -1);

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
    public static int field443 = 1;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "I")
    public static int field444 = 0;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "Llc;")
    public static class143 field434 = field439;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public int field430;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "Lkk;")
    public class204 field442;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "Ljava/awt/Image;")
    public static Image field436;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "[I")
    public int[] field441;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "[Luc;")
    public static class165[] field431;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILoc;IIII)V")
    public static final void method180(int arg0, class124 arg1, int arg2, int arg3, int arg4, int arg5) {
        field440++;
        if (arg1.field2175 == -1 && arg1.field2179 == null) {
            return;
        }
        int var6 = 0;
        if (arg2 <= 35) {
            return;
        }
        if (arg1.field2169 < arg4) {
            var6 += arg4 - arg1.field2169;
        } else if (arg4 < arg1.field2180) {
            var6 += arg1.field2180 - arg4;
        }
        if (arg5 > arg1.field2163) {
            var6 += arg5 - arg1.field2163;
        } else if (arg1.field2162 > arg5) {
            var6 += arg1.field2162 - arg5;
        }
        if (arg1.field2166 == 0 || (var6 - 64) > arg1.field2166 || class58.field1117 == 0 || arg1.field2176 != arg0) {
            if (arg1.field2171 != null) {
                class86.field1578.method1000(arg1.field2171);
                arg1.field2171 = null;
            }
            if (arg1.field2170 != null) {
                class86.field1578.method1000(arg1.field2170);
                arg1.field2170 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg1.field2166 - var6) * class58.field1117 / arg1.field2166;
        if (arg1.field2171 != null) {
            arg1.field2171.method1904(var7);
        } else if (arg1.field2175 >= 0) {
            class78 var8 = class78.method445(class89.field1614, arg1.field2175, 0);
            if (var8 != null) {
                class216 var9 = var8.method446().method1486(class134.field2345);
                class288 var10 = class288.method1897(var9, 100, var7);
                var10.method1883(-1);
                class86.field1578.method998(var10);
                arg1.field2171 = var10;
            }
        }
        if (arg1.field2170 != null) {
            arg1.field2170.method1904(var7);
            if (arg1.field2170.method345(-43)) {
                return;
            }
            arg1.field2170 = null;
        } else if (arg1.field2179 != null && (arg1.field2182 -= arg3) <= 0) {
            int var11 = (int) ((double) arg1.field2179.length * Math.random());
            class78 var12 = class78.method445(class89.field1614, arg1.field2179[var11], 0);
            if (var12 != null) {
                class216 var13 = var12.method446().method1486(class134.field2345);
                class288 var14 = class288.method1897(var13, 100, var7);
                var14.method1883(0);
                class86.field1578.method998(var14);
                arg1.field2170 = var14;
                arg1.field2182 = (int) ((double) (arg1.field2177 - arg1.field2172) * Math.random()) + arg1.field2172;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILlc;)V")
    public static final void method181(int arg0, class143 arg1) {
        field432++;
        class173.field3104 = arg1;
        if (class4.field62.field1469 == null) {
            return;
        }
        try {
            class143 var2 = class41.field694.method865(class4.field62.field1469, (byte) 112);
            class143 var3 = class165.field2958.method865(class4.field62.field1469, (byte) 72);
            class143 var4 = class25.method179(0, new class143[] { var2, class185.field3358, arg1, class200.field3652, var3 });
            class143 var5;
            if (arg0 == ~arg1.method913((byte) 45)) {
                var5 = class25.method179(0, new class143[] { var4, class42.field706 });
            } else {
                var5 = class25.method179(~arg0, new class143[] { var4, class282.field4958, class204.method1392((byte) 40, class205.method1403(-22) + 94608000000L), class40.field689, class218.method1495(94608000L, arg0 ^ 0xFFFFFFF5) });
            }
            class25.method179(0, new class143[] { class67.field1278, var5, class144.field2577 }).method871(class4.field62.field1469, 0);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lvh;B)Z")
    public static final boolean method182(class43 arg0, byte arg1) {
        field433++;
        if (arg0.field862 == 205) {
            class67.field1276 = 250;
            return true;
        } else {
            if (arg1 != -29) {
                method182((class43) null, (byte) 87);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V")
    public static void method183(byte arg0) {
        field434 = null;
        field436 = null;
        field431 = null;
        if (arg0 >= -103) {
            field431 = null;
        }
        field437 = null;
        field439 = null;
    }
}
