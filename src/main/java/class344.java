import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class344 extends class443 {

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "[I")
    public static int[] field4619 = new int[50];

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "Lph;")
    public static class114 field4615 = new class114(16);

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "I")
    public static int field4621 = 1;

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V", line = 8)
    public static final void method2007(int arg0) {
        field4617++;
        class204.method1107(class106.field1313, (byte) -107);
        class125.field1600++;
        if (class296.field4036 && class256.field3503) {
            int var1 = class337.field4493;
            int var2 = var1 - class279.field3800;
            int var3 = class306.field4146;
            if (class12.field117 > var2) {
                var2 = class12.field117;
            }
            int var4 = var3 - class36.field379;
            if (class272.field3678 > var4) {
                var4 = class272.field3678;
            }
            if ((class12.field117 + class428.field6290.field2501) < (class106.field1313.field2501 + var2)) {
                var2 = class12.field117 + class428.field6290.field2501 - class106.field1313.field2501;
            }
            if (var4 + class106.field1313.field2460 > class272.field3678 + class428.field6290.field2460) {
                var4 = class272.field3678 - (class106.field1313.field2460 - class428.field6290.field2460);
            }
            int var5 = var2 - class84.field939;
            int var6 = var4 - class164.field2093;
            int var7 = class106.field1313.field2536;
            if (class106.field1313.field2521 < class125.field1600 && (var7 < var5 || -var7 > var5 || var6 > var7 || var6 < (-var7))) {
                class104.field1280 = true;
            }
            int var8 = var2 + class428.field6290.field2522 - class12.field117;
            if (arg0 > -9) {
                method2008(39, true);
            }
            int var9 = var4 + class428.field6290.field2565 - class272.field3678;
            if (class106.field1313.field2539 != null && class104.field1280) {
                class425 var10 = new class425();
                var10.field6239 = var9;
                var10.field6227 = var8;
                var10.field6240 = class106.field1313.field2539;
                var10.field6242 = class106.field1313;
                class277.method1523(var10);
            }
            if (class268.field3650 == 0) {
                if (class104.field1280) {
                    if (class106.field1313.field2477 != null) {
                        class425 var11 = new class425();
                        var11.field6227 = var8;
                        var11.field6237 = class432.field6335;
                        var11.field6239 = var9;
                        var11.field6242 = class106.field1313;
                        var11.field6240 = class106.field1313.field2477;
                        class277.method1523(var11);
                    }
                    if (class432.field6335 != null && client.method1408(class106.field1313) != null) {
                        class98.field1155++;
                        class281.field3857.method295(20579, 114);
                        class281.field3857.method1357(class106.field1313.field2502, 1826838072);
                        class281.field3857.method1376(-116, class432.field6335.field2542);
                        class281.field3857.method1378(class432.field6335.field2502, (byte) 47);
                        class281.field3857.method1346(124, class106.field1313.field2542);
                    }
                } else if ((class56.field566 == 1 || class279.method1547((byte) 125)) && class244.field3323 > 2) {
                    class116.method623(1, 2);
                } else if (class244.method1307(-96)) {
                    class116.method623(1, 1);
                }
                class106.field1313 = null;
            }
        } else if (class125.field1600 > 1) {
            class106.field1313 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)I", line = 132)
    public static final int method2008(int arg0, boolean arg1) {
        field4616++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        if (arg1) {
            method2009(-80);
        }
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V", line = 159)
    public static void method2009(int arg0) {
        field4615 = null;
        field4619 = null;
        if (arg0 != 16097) {
            field4615 = null;
        }
    }
}
