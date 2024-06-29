import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class109 {

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lv;")
    private static class122 field2691 = class55.method425(-125, " seconds)3");

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "[I")
    public static int[] field2690 = new int[1000];

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field2698 = -1;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Lv;")
    public static class122 field2683 = field2691;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "Ljb;")
    public static class56 field2694 = new class56(260);

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "[I")
    public static int[] field2699 = new int[2000];

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "Lv;")
    public static class122 field2705 = class55.method425(-68, "backvmid1");

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public static int field2700 = -1;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "I")
    public static int field2704 = 0;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "Z")
    public static boolean field2703 = false;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "Li;")
    public static class48 field2702;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "Lkb;")
    public static class62 field2701;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "[I")
    public static int[] field2697;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "[Z")
    public static boolean[] field2681;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lv;Lv;ZIILmb;II)V", line = 7)
    public static final synchronized void method841(class122 arg0, class122 arg1, boolean arg2, int arg3, int arg4, class74 arg5, int arg6, int arg7) {
        field2695++;
        if (!class55.method426(1)) {
            return;
        }
        int var8 = arg5.method628(arg0, true);
        if (arg7 != -1) {
            method849((byte) -111, 122, 78);
        }
        int var9 = arg5.method605(arg1, var8, 1036);
        method846(arg4, var9, arg7 ^ 0x7D, arg5, arg3, arg2, var8, arg6);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V", line = 25)
    public static final synchronized void method842(byte arg0) {
        field2693++;
        if (!class55.method426(1)) {
            return;
        }
        if (class93.field2397) {
            byte[] var1 = class100.method762(class119.field2892, class61.field1569, class94.field2414, (byte) 47, class51.field1290);
            if (var1 != null) {
                if (class22.field601 >= 0) {
                    class72.method589(21951, class95.field2434, class22.field601, var1, class8.field180);
                } else if (class7.field169 < 0) {
                    class61.method465(class8.field180, class95.field2434, var1, (byte) 94);
                } else {
                    class93.method737(class8.field180, class7.field169, class95.field2434, var1, true);
                }
                class93.field2397 = false;
                class61.field1569 = null;
            }
        }
        class11.method115(38);
        if (arg0 < 36) {
            field2698 = -19;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)Ldb;", line = 69)
    public static final class21 method843(int arg0, byte arg1) {
        field2682++;
        if (arg1 != -31) {
            method846(100, -53, -120, null, -27, true, 13, 81);
        }
        class21 var2 = (class21) class49.field1239.method436(-98, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class115.field2808.method611(0, 9, arg0);
        class21 var4 = new class21();
        var4.field562 = arg0;
        if (var3 != null) {
            var4.method223((byte) 68, new class64(var3));
        }
        var4.method221(arg1 ^ 0xFFFFFFC1);
        class49.field1239.method437((long) arg0, var4, (byte) 69);
        return var4;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 99)
    public static final void method844(int arg0) {
        if (arg0 != -1) {
            method848(57, -46, null, 118, -92, true, 108);
        }
        field2686++;
        field2694.method434((byte) -76);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V", line = 115)
    public static void method845(boolean arg0) {
        field2691 = null;
        field2702 = null;
        field2694 = null;
        field2681 = null;
        if (!arg0) {
            method851(-95, 82);
        }
        field2697 = null;
        field2699 = null;
        field2701 = null;
        field2705 = null;
        field2683 = null;
        field2690 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIILmb;IZII)V", line = 155)
    public static final synchronized void method846(int arg0, int arg1, int arg2, class74 arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field2687++;
        if (!class55.method426(1)) {
            return;
        }
        class51.field1290 = arg0;
        if (arg2 >= -114) {
            method848(98, 33, null, -20, -72, false, -93);
        }
        class61.field1569 = arg3;
        class22.field601 = arg7;
        class95.field2434 = arg5;
        class94.field2414 = arg1;
        class8.field180 = arg4;
        class119.field2892 = arg6;
        class7.field169 = -1;
        class93.field2397 = true;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V", line = 188)
    public static final synchronized void method847(byte arg0) {
        field2688++;
        if (arg0 >= -70) {
            method841(null, null, true, -69, 102, null, 47, -125);
        }
        if (class55.method426(1)) {
            class90.method717((byte) 120);
            class93.field2397 = false;
            class61.field1569 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILmb;IIZI)V", line = 204)
    public static final synchronized void method848(int arg0, int arg1, class74 arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field2684++;
        if (!class55.method426(1)) {
            return;
        }
        class51.field1290 = arg0;
        class8.field180 = arg4;
        class7.field169 = -1;
        class94.field2414 = arg6;
        class93.field2397 = true;
        class95.field2434 = arg5;
        class119.field2892 = arg3;
        if (arg1 == 20672) {
            class22.field601 = -1;
            class61.field1569 = arg2;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BII)V", line = 226)
    public static final void method849(byte arg0, int arg1, int arg2) {
        class34 var3 = class50.field1260[class34.field848][arg2][arg1];
        field2692++;
        if (var3 == null) {
            class90.field2306.method25(class34.field848, arg2, arg1);
            return;
        }
        int var4 = -99999999;
        class102 var5 = (class102) var3.method311((byte) 104);
        class102 var6 = null;
        while (var5 != null) {
            class10 var12 = class5.method69(var5.field2529, false);
            int var13 = var12.field256;
            if (var12.field221) {
                var13 = (var5.field2538 + 1) * var13;
            }
            if (var4 < var13) {
                var6 = var5;
                var4 = var13;
            }
            var5 = (class102) var3.method302((byte) -94);
        }
        class102 var7 = null;
        class102 var8 = null;
        int var9 = 118 / ((arg0 + 15) / 46);
        var3.method301(false, var6);
        for (class102 var10 = (class102) var3.method311((byte) 122); var10 != null; var10 = (class102) var3.method302((byte) -49)) {
            if (var6.field2529 != var10.field2529 && var7 == null) {
                var7 = var10;
            }
            if (var6.field2529 != var10.field2529 && var7.field2529 != var10.field2529 && var8 == null) {
                var8 = var10;
            }
        }
        int var11 = (arg1 << 7) + (arg2 + 1610612736);
        class90.field2306.method20(class34.field848, arg2, arg1, class108.method837((byte) 59, arg2 * 128 + 64, arg1 * 128 + 64, class34.field848), var6, var11, var7, var8);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(Z)V", line = 294)
    public static final synchronized void method850(boolean arg0) {
        field2689++;
        class103.method782((byte) -103);
        if (arg0) {
            method845(true);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V", line = 306)
    public static final synchronized void method851(int arg0, int arg1) {
        field2696++;
        if (class55.method426(1) && arg0 == -12101) {
            class50.method397(arg1, (byte) -103);
            class93.field2397 = false;
            class61.field1569 = null;
        }
    }
}
