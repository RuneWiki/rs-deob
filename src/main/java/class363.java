import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class363 extends class39 {

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "Ljava/lang/Object;")
    private Object field5372;

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "Z")
    public static boolean field5366 = false;

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "I")
    public static int field5374 = 0;

    @OriginalMember(owner = "client!cb", name = "E", descriptor = "Lak;")
    public static class234 field5368 = new class234("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!cb", name = "P", descriptor = "[I")
    public static int[] field5378 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!cb", name = "N", descriptor = "Lhn;")
    public static class509 field5376 = new class509(58, 6);

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!cb", name = "D", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!cb", name = "H", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!cb", name = "I", descriptor = "I")
    public static int field5371;

    @OriginalMember(owner = "client!cb", name = "K", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!cb", name = "M", descriptor = "I")
    public static int field5375;

    @OriginalMember(owner = "client!cb", name = "O", descriptor = "Lam;")
    public static class449 field5377;

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "Z")
    public static boolean field5369;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "(I)Z", line = 3)
    public final boolean method377(int arg0) {
        field5370++;
        if (arg0 != 100) {
            method2278(109);
        }
        return false;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 14)
    public class363(Object arg0, int arg1) {
        super(arg1);
        this.field5372 = arg0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 22)
    public final Object method374(int arg0) {
        field5373++;
        if (arg0 >= -41) {
            field5378 = null;
        }
        return this.field5372;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)Lkn;", line = 34)
    public static final class523 method2274(byte arg0) {
        field5371++;
        if (class7.field89 == null || class95.field1365 == null) {
            return null;
        } else if (arg0 >= -1) {
            return null;
        } else {
            for (class523 var1 = (class523) class95.field1365.method1682((byte) -107); var1 != null; var1 = (class523) class95.field1365.method1682((byte) -33)) {
                class519 var2 = class7.field75.method3071(-116, var1.field7645);
                if (var2 != null && var2.field7560 && var2.method3082(class7.field82, -128)) {
                    return var1;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lya;I)V", line = 63)
    public static final void method2275(class38 arg0, int arg1) {
        field5375++;
        if (!(class382.field5752 >= 2 || class245.field3859) || class116.field1752 != null) {
            return;
        }
        int var2 = 95 / ((arg1 - 30) / 32);
        String var3;
        if (class245.field3859 && class382.field5752 < 2) {
            var3 = class412.field6176 + class59.field710.method1635(class224.field3673, (byte) 118) + class190.field3206 + " ->";
        } else if (class34.field392 && class101.field1456.method1045(81, (byte) -95) && class382.field5752 > 2) {
            var3 = class356.method2234(0, (class295) class456.field6644.field2077.field6389.field6389);
        } else {
            class295 var4 = (class295) class456.field6644.field2077.field6389;
            var3 = class356.method2234(0, var4);
            int[] var5 = null;
            if (class209.method1447(var4.field4498, (byte) -22)) {
                var5 = class390.field5847.method467((byte) -101, (int) var4.field4494).field7772;
            } else if (var4.field4503 != -1) {
                var5 = class390.field5847.method467((byte) -101, var4.field4503).field7772;
            } else if (class469.method2829((byte) 127, var4.field4498)) {
                class116 var8 = class153.field2265[(int) var4.field4494];
                if (var8 != null) {
                    class37 var9 = var8.field1763;
                    if (var9.field499 != null) {
                        var9 = var9.method256(127, class195.field3271);
                    }
                    if (var9 != null) {
                        var5 = var9.field502;
                    }
                }
            } else if (class229.method1623(var4.field4498, 49)) {
                Object var6 = null;
                class69 var7;
                if (var4.field4498 == 1004) {
                    var7 = class510.field7458.method2973(-120, (int) var4.field4494);
                } else {
                    var7 = class510.field7458.method2973(-127, (int) (var4.field4494 >>> 32 & 0x7FFFFFFFL));
                }
                if (var7.field906 != null) {
                    var7 = var7.method604((byte) -15, class195.field3271);
                }
                if (var7 != null) {
                    var5 = var7.field895;
                }
            }
            if (var5 != null) {
                var3 = var3 + class534.method3165(var5, false);
            }
        }
        if (class382.field5752 > 2) {
            var3 = var3 + "<col=ffffff> / " + (class382.field5752 - 2) + class327.field4928.method1635(class224.field3673, (byte) 125);
        }
        if (class509.field7449 != null) {
            class317 var11 = class509.field7449.method863(arg0, -1);
            if (var11 == null) {
                var11 = class185.field2805;
            }
            var11.method2027(class377.field5687, class109.field1531, class509.field7449.field1642, class265.field4069, class509.field7449.field1627, class509.field7449.field1715, class509.field7449.field1664, class36.field423, class271.field4150, var3, class318.field4805, class509.field7449.field1698, class305.field4603, (byte) -107, class509.field7449.field1706);
            class107.method827(0, class265.field4069[1], class265.field4069[2], class265.field4069[0], class265.field4069[3]);
        } else if (class460.field6696 != null && class312.field4691 == class282.field4297) {
            int var10 = class185.field2805.method2036(class377.field5687, 16777215, class299.field4541 + 4, class305.field4603, 0, class36.field423, -8304, class534.field7853 + 16, class318.field4805, var3);
            class107.method827(0, class534.field7853, class380.field5735.method2174(-33, var3) + var10, class299.field4541 + 4, 16);
            return;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V", line = 167)
    public static final void method2276(byte arg0) {
        for (class354 var1 = (class354) class465.field6733.method1958(95); var1 != null; var1 = (class354) class465.field6733.method1961(-31)) {
            var1.method2225();
        }
        int var2 = 56 / ((34 - arg0) / 34);
        field5367++;
    }

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "(I)V", line = 196)
    public static final void method2277(int arg0) {
        class58.field701 = null;
        field5365++;
        class458.field6661 = null;
        if (arg0 != 21006) {
            method2277(-109);
        }
    }

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "(I)V", line = 224)
    public static void method2278(int arg0) {
        field5378 = null;
        if (arg0 != Integer.MAX_VALUE) {
            field5378 = null;
        }
        field5377 = null;
        field5368 = null;
        field5376 = null;
    }
}
