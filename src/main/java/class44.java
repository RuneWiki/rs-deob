import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class44 {

    @OriginalMember(owner = "client!be", name = "c", descriptor = "[I")
    public static int[] field656 = new int[64];

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Lfg;")
    public static class18 field654 = new class18(10);

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "Lwc;")
    public static class367 field660;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
    public static final void method355(byte arg0) {
        field657++;
        if (class123.field1937 > 0) {
            class174.method1352((byte) -80);
            return;
        }
        class134.field2159 = class124.field2028;
        class124.field2028 = null;
        if (arg0 == 118) {
            class168.method1288(-6, 40);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BLja;)V")
    public static final void method356(byte arg0, class90 arg1) {
        field655++;
        int var2 = class169.field2512;
        int var3 = class63.field1024;
        int var4 = class32.field452;
        int var5 = class305.field4451 - 3;
        byte var6 = 20;
        if (class85.field1389 == null || class365.field5209 == null) {
            if (class100.field1561.method1348(255, class258.field3862) && class100.field1561.method1348(255, class367.field5230)) {
                class85.field1389 = arg1.method734(class344.method2217(class100.field1561, class258.field3862, 0), true);
                class344 var7 = class344.method2217(class100.field1561, class367.field5230, 0);
                class365.field5209 = arg1.method734(var7, true);
                var7.method2222();
                class308.field4509 = arg1.method734(var7, true);
            } else {
                arg1.method681(var2, var3, var4, var6, class143.field2235 | 255 - class157.field2386 << 24, 1);
            }
        }
        if (class85.field1389 != null && class365.field5209 != null) {
            int var8 = (var4 - (class365.field5209.method1469() * 2)) / class85.field1389.method1469();
            for (int var9 = 0; var9 < var8; var9++) {
                class85.field1389.method2645(class365.field5209.method1469() + (var2 + (class85.field1389.method1469() * var9)), var3);
            }
            class365.field5209.method2645(var2, var3);
            class308.field4509.method2645(var2 + var4 - class308.field4509.method1469(), var3);
        }
        class250.field3620.method1677(var3 + 14, class199.field2907 | 0xFF000000, (byte) 20, -1, class391.field5712, var2 + 3);
        arg1.method681(var2, var3 + var6, var4, var5 - var6, -class157.field2386 + 255 << 24 | class143.field2235, 1);
        if (arg0 > -15) {
            method358((class174) null, -122);
        }
        int var10 = class129.field2111;
        int var11 = class291.field4327;
        for (int var12 = 0; var12 < class389.field5591; var12++) {
            int var26 = var3 + var6 + (class389.field5591 + -1 + -var12) * 16 + 13;
            if (var2 < var10 && var10 < (var2 + var4) && var11 > var26 - 13 && var11 < (var26 + 3)) {
                arg1.method681(var2, var26 - 12, var4, 16, 255 - class361.field5153 << 24 | class111.field1800, 1);
            }
        }
        if ((class451.field6549 == null || class420.field6134 == null || class320.field4629 == null) && class100.field1561.method1348(255, class34.field493) && class100.field1561.method1348(255, class102.field1579) && class100.field1561.method1348(255, class425.field6181)) {
            class344 var13 = class344.method2217(class100.field1561, class102.field1579, 0);
            class420.field6134 = arg1.method734(var13, true);
            var13.method2222();
            class86.field1401 = arg1.method734(var13, true);
            class451.field6549 = arg1.method734(class344.method2217(class100.field1561, class34.field493, 0), true);
            class344 var14 = class344.method2217(class100.field1561, class425.field6181, 0);
            class320.field4629 = arg1.method734(var14, true);
            var14.method2222();
            class245.field3582 = arg1.method734(var14, true);
        }
        if (class451.field6549 != null && class420.field6134 != null && class320.field4629 != null) {
            int var15 = (var4 - (class320.field4629.method1469() * 2)) / class451.field6549.method1469();
            for (int var16 = 0; var16 < var15; var16++) {
                class451.field6549.method2645(var2 - (-class320.field4629.method1469() - (var16 * class451.field6549.method1469())), -class451.field6549.method1467() + var3 - -var5);
            }
            int var17 = (var5 - class320.field4629.method1467() - var6) / class420.field6134.method1467();
            for (int var18 = 0; var18 < var17; var18++) {
                class420.field6134.method2645(var2, var18 * class420.field6134.method1467() + var3 + var6);
                class86.field1401.method2645(var2 + var4 - class86.field1401.method1469(), class420.field6134.method1467() * var18 + var3 + var6);
            }
            class320.field4629.method2645(var2, var3 + var5 - class320.field4629.method1467());
            class245.field3582.method2645((var2 + var4) - class320.field4629.method1469(), -class320.field4629.method1467() + var3 + var5);
        }
        int var19 = 0;
        for (class278 var20 = (class278) class276.field4153.method157((byte) -125); var20 != null; var20 = (class278) class276.field4153.method145(-117)) {
            int var21 = (class389.field5591 - var19 - 1) * 16 + var3 + var6 + 13;
            int var22 = class199.field2907 | 0xFF000000;
            if (var2 < var10 && var2 + var4 > var10 && (var21 - 13) < var11 && (var21 + 3) > var11) {
                var22 = class389.field5587 | 0xFF000000;
            }
            int[] var23 = null;
            if (class183.method1422(-5, var20.field4182)) {
                var23 = class206.method1561(123, (int) var20.field4186).field2021;
            } else if (class8.method58(var20.field4182, 12015)) {
                class98 var24 = class447.field6512[(int) var20.field4186];
                if (var24 != null) {
                    var23 = var24.field1545.field179;
                }
            } else if (class407.method2574(var20.field4182, 8396)) {
                if (var20.field4182 == 1004) {
                    var23 = class451.method2812(93, (int) var20.field4186).field701;
                } else {
                    var23 = class451.method2812(44, (int) (var20.field4186 >>> 32 & 0x7FFFFFFFL)).field701;
                }
            }
            String var25 = class451.method2813(12001, var20);
            if (var23 != null) {
                var25 = var25 + class12.method77((byte) 124, var23);
            }
            var19++;
            class250.field3620.method1682(class377.field5341, var21, 0, class28.field415, var2 + 3, var22, var25, false);
        }
        class16.method95(class305.field4451, class63.field1024, (byte) -96, class169.field2512, class32.field452);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public static void method357(int arg0) {
        if (arg0 != -1) {
            field659 = -60;
        }
        field660 = null;
        field654 = null;
        field656 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Ldp;I)V")
    public static final void method358(class174 arg0, int arg1) {
        field658++;
        class403.field5892 = arg0;
        class413.field6001 = class403.field5892.method1333(0, 19);
        int var2 = 19 / ((-arg1 - 11) / 62);
    }
}
