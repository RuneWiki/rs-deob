import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class236 {

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "Z")
    public static boolean field3947 = false;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "[I")
    public static int[] field3948 = new int[200];

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "Lbd;")
    public static class37 field3946 = new class37();

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "Lmo;")
    public static class447 field3950;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "Lmo;")
    public static class447 field3951;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "[I")
    public static int[] field3945;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
    public static final void method1668(byte arg0) {
        field3944++;
        class201.method1392(5, -29);
        class219.method1568(5, -124);
        class348.method2266(5, 120);
        class324.method2147(5, (byte) 18);
        class342.method2244(5, (byte) -75);
        class51.method325(5, (byte) -81);
        class402.method2532(104, 5);
        class179.method1227(-4776, 5);
        class136.method999(5, -23944);
        int var1 = 115 % ((arg0 + 77) / 40);
        class156.method1106((byte) 67, 5);
        class28.method181(5, (byte) 117);
        class45.method295(5, false);
        class344.method2252(99, 5);
        class38.method260(0, 5);
        class353.method2296(5, (byte) -113);
        class239.method1693(5, 85);
        class91.method540(-65537, 5);
        class246.method1710(5, false);
        class7.method91((byte) -127, 5);
        class298.method2011((byte) -17, 5);
        class125.method922(90, 50);
        class328.method2177(-21965, 5);
        class107.method808(5, 73);
        class427.field6300.method337(5, (byte) -125);
        class214.field3439.method337(5, (byte) -116);
        class272.field4367.method337(5, (byte) -118);
        class209.field3362.method337(5, (byte) -126);
        class17.field229.method337(5, (byte) -108);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I[[[BIBII)V")
    public static final void method1669(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class381.field5764++;
        class7.field95 = 0;
        for (int var6 = class198.field3193; var6 < class81.field1006; var6++) {
            class232[][] var17 = class423.field6252[var6];
            for (int var18 = class255.field4137; var18 < class391.field5871; var18++) {
                for (int var19 = class269.field4315; var19 < field3952; var19++) {
                    class232 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class241.field3991[var18 + class374.field5649 - class235.field3937][var19 + class374.field5649 - class181.field2959] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field3886 = true;
                            var20.field3883 = true;
                            if (var20.field3866 == null) {
                                var20.field3885 = false;
                            } else {
                                var20.field3885 = true;
                            }
                            class7.field95++;
                        } else {
                            var20.field3886 = false;
                            var20.field3883 = false;
                            var20.field3869 = 0;
                            if (var18 >= class235.field3937 - 16 && var18 <= class235.field3937 + 16 && var19 >= class181.field2959 - 16 && var19 <= class181.field2959 + 16 && (var20.field3873 != null || var20.field3872 != null || var20.field3878 != null || var20.field3889 != null || var20.field3864 != null || var20.field3866 != null)) {
                                class264.field4255.method440(var20, 126);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class364.field5542 == class275.field4396;
        for (int var8 = class198.field3193; var8 < class81.field1006; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class67.field847.method711() && var8 >= arg2 && arg1 != null) {
                int var10 = class241.field3991.length;
                if (class241.field3991.length + class255.field4137 > class156.field2449) {
                    var10 -= class241.field3991.length + class255.field4137 - class156.field2449;
                }
                int var11 = class241.field3991[0].length;
                if (class241.field3991[0].length + class269.field4315 > class361.field5513) {
                    var11 -= class241.field3991[0].length + class269.field4315 - class361.field5513;
                }
                int var12 = class173.field2886;
                while (true) {
                    if (var12 >= var10) {
                        class264.field4255.method437(class275.field4396[var8], true, var9, var8, true);
                        break;
                    }
                    int var13 = class255.field4137 + var12 - class173.field2886;
                    for (int var14 = class110.field1523; var14 < var11; var14++) {
                        class56.field706[var12][var14] = false;
                        if (class241.field3991[var12][var14]) {
                            int var15 = class269.field4315 + var14 - class110.field1523;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class423.field6252[var16][var13][var15] != null && class423.field6252[var16][var13][var15].field3879 == var8) {
                                    class56.field706[var12][var14] = class423.field6252[var16][var13][var15].field3886;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class264.field4255.method437(class275.field4396[var8], true, var9, var8, false);
            }
            class264.field4255.method436(-122);
        }
        if (!class185.method1262(true)) {
            class185.method1262(false);
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V")
    public static void method1670(byte arg0) {
        field3945 = null;
        if (arg0 != -56) {
            method1670((byte) 51);
        }
        field3950 = null;
        field3951 = null;
        field3948 = null;
        field3946 = null;
    }
}
