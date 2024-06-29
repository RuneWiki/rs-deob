import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class30 extends class85 {

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "Ljava/lang/String;")
    public static String field493 = "Unable to find ";

    @OriginalMember(owner = "client!fb", name = "X", descriptor = "[I")
    public static int[] field502 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!fb", name = "cb", descriptor = "I")
    public static int field507 = 0;

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!fb", name = "S", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "I")
    public int field499;

    @OriginalMember(owner = "client!fb", name = "V", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!fb", name = "W", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!fb", name = "Z", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!fb", name = "ab", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!fb", name = "bb", descriptor = "Lkb;")
    public class54 field506;

    @OriginalMember(owner = "client!fb", name = "Y", descriptor = "[B")
    public byte[] field503;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method248(int arg0, String arg1) {
        if (arg0 < 124) {
            return null;
        } else {
            ++field504;
            String var2 = class292.method1939(class170.method1223(true, arg1), -119);
            if (var2 == null) {
                var2 = "";
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)[B")
    public final byte[] method249(int arg0) {
        ++field494;
        if (arg0 != 256) {
            method248(-64, (String) null);
        }
        if (super.field1264) {
            throw new RuntimeException();
        } else {
            return this.field503;
        }
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "(B)V")
    public static void method250(byte arg0) {
        int var1 = 93 / ((-91 - arg0) / 33);
        field502 = null;
        field493 = null;
    }

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "(B)V")
    public static final void method251(byte arg0) {
        ++field496;
        int var1 = class237.field3737;
        int var2 = class272.field4345;
        int var3 = class259.field4109;
        byte var4 = 20;
        int var5 = class209.field3233 + -3;
        if (arg0 >= -27) {
            field502 = null;
        }
        if (class49.field808 == null || class194.field3039 == null) {
            if (class246.field3910.method697(-117, class238.field3759) && class246.field3910.method697(-110, class125.field1887)) {
                class49.field808 = class306.method2053(0, 0, class238.field3759, class246.field3910);
                class194.field3039 = class306.method2053(0, 0, class125.field1887, class246.field3910);
            } else {
                class66.method520(var1, var3, var2, var4, class36.field618, -class250.field4013 + 256);
            }
        }
        if (class49.field808 != null && class194.field3039 != null) {
            int var6 = (var2 - class194.field3039.field3273 * 2) / class49.field808.field3273;
            for (int var7 = 0; ~var6 < ~var7; ++var7) {
                class49.field808.method425(class49.field808.field3273 * var7 + class194.field3039.field3273 + var1, var3);
            }
            class194.field3039.method425(var1, var3);
            class194.field3039.method430(var1 + var2 + -class194.field3039.field3273, var3);
        }
        class73.field1118.method1810(class164.field2480, var1 + 3, var3 + 14, class163.field2453, -1);
        class66.method520(var1, var3 - -var4, var2, -var4 + var5, class36.field618, -class250.field4013 + 256);
        int var8 = class171.field2587;
        int var9 = class157.field2340;
        for (int var10 = 0; ~class14.field174 < ~var10; ++var10) {
            int var18 = (class14.field174 + -1 + -var10) * 15 + var4 + var3 - -13;
            if (~var1 > ~var8 && var1 + var2 > var8 && ~(var18 - 13) > ~var9 && ~(var18 + 3) < ~var9) {
                class66.method520(var1, var18 + -12, var2, 15, class294.field4565, -class77.field1179 + 256);
            }
        }
        if ((class278.field4416 == null || class41.field692 == null || class2.field41 == null) && class246.field3910.method697(92, class295.field4658) && class246.field3910.method697(-111, class276.field4394) && class246.field3910.method697(9, class173.field2660)) {
            class278.field4416 = class306.method2053(0, 0, class295.field4658, class246.field3910);
            class41.field692 = class306.method2053(0, 0, class276.field4394, class246.field3910);
            class2.field41 = class306.method2053(0, 0, class173.field2660, class246.field3910);
        }
        if (class278.field4416 != null && class41.field692 != null && class2.field41 != null) {
            int var11 = (-(class2.field41.field3273 * 2) + var2) / class278.field4416.field3273;
            for (int var12 = 0; ~var12 > ~var11; ++var12) {
                class278.field4416.method425(class278.field4416.field3273 * var12 + class2.field41.field3273 + var1, -class278.field4416.field3265 + var5 + var3);
            }
            int var13 = (var5 - class2.field41.field3265 + -var4) / class41.field692.field3265;
            for (int var14 = 0; ~var13 < ~var14; ++var14) {
                class41.field692.method425(var1, class41.field692.field3265 * var14 + (var3 - -var4));
                class41.field692.method430(-class41.field692.field3273 + var1 - -var2, class41.field692.field3265 * var14 + (var3 - -var4));
            }
            class2.field41.method425(var1, var3 - -var5 + -class2.field41.field3265);
            class2.field41.method430(var1 + var2 + -class2.field41.field3273, var3 + var5 - class2.field41.field3265);
        }
        for (int var15 = 0; var15 < class14.field174; ++var15) {
            int var16 = (class14.field174 + -1 + -var15) * 15 + 13 + var3 - -var4;
            int var17 = class163.field2453;
            if (var1 < var8 && var1 + var2 > var8 && var9 > var16 + -13 && var9 < var16 + 3) {
                var17 = class200.field3102;
            }
            class73.field1118.method1810(class151.method1097(true, var15), var1 + 3, var16, var17, 0);
        }
        class159.method1140(class209.field3233, class237.field3737, -26514, class272.field4345, class259.field4109);
    }

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "(I)Lel;")
    public static final class213 method252(int arg0) {
        ++field497;
        byte[] var1 = class301.field4847[0];
        int var2 = class170.field2583[0] * class104.field1621[0];
        int[] var3 = new int[var2];
        for (int var4 = 0; ~var2 < ~var4; ++var4) {
            var3[var4] = class102.field1585[class118.method863(var1[var4], 255)];
        }
        if (arg0 < 43) {
            method255((class92) null, true);
        }
        class51 var5 = new class51(class214.field3278, class234.field3705, class196.field3069[0], class125.field1877[0], class104.field1621[0], class170.field2583[0], var3);
        method254(2);
        return var5;
    }

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "(I)I")
    public final int method253(int arg0) {
        if (arg0 != -12) {
            this.field506 = null;
        }
        ++field495;
        return super.field1264 ? 0 : 100;
    }

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "(I)V")
    public static final void method254(int arg0) {
        class196.field3069 = null;
        class301.field4847 = null;
        class125.field1877 = null;
        ++field498;
        class170.field2583 = null;
        class104.field1621 = null;
        class102.field1585 = null;
        if (arg0 != 2) {
            field507 = 118;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lub;Z)V")
    public static final void method255(class92 arg0, boolean arg1) {
        ++field501;
        class172.field2639 = arg0.method717(104, "p11_full");
        class181.field2831 = arg0.method717(104, "p12_full");
        class297.field4779 = arg0.method717(104, "b12_full");
        class257.field4102 = arg0.method717(104, "mapfunction");
        class64.field1019 = arg0.method717(104, "hitmarks");
        class252.field4035 = arg0.method717(104, "hitbar_default");
        class50.field816 = arg0.method717(104, "headicons_pk");
        class248.field3954 = arg0.method717(104, "headicons_prayer");
        class172.field2645 = arg0.method717(104, "hint_headicons");
        class125.field1881 = arg0.method717(104, "hint_mapmarkers");
        class46.field766 = arg0.method717(104, "mapflag");
        if (arg1) {
            field507 = -9;
        }
        class294.field4568 = arg0.method717(104, "cross");
        class55.field870 = arg0.method717(104, "mapdots");
        class26.field457 = arg0.method717(104, "scrollbar");
        class115.field1766 = arg0.method717(104, "name_icons");
        class204.field3147 = arg0.method717(104, "floorshadows");
        class152.field2250 = arg0.method717(104, "compass");
        class247.field3931 = arg0.method717(104, "hint_mapedge");
    }
}
