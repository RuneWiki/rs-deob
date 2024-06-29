import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class90 {

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Lha;")
    public static class46 field1700 = class271.method1828("::clientjs5drop", -46);

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
    public static void method697(byte arg0) {
        int var1 = -74 / ((arg0 - 7) / 52);
        field1700 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)V")
    public static final void method698(int arg0, boolean arg1) {
        if (arg0 != 64) {
            field1698 = 66;
        }
        for (class269 var2 = (class269) class154.field2719.method264(-73); var2 != null; var2 = (class269) class154.field2719.method269((byte) 7)) {
            if (var2.field4671 != null) {
                class236.field4116.method1711(var2.field4671);
                var2.field4671 = null;
            }
            if (var2.field4668 != null) {
                class236.field4116.method1711(var2.field4668);
                var2.field4668 = null;
            }
            var2.method501(0);
        }
        field1702++;
        if (!arg1) {
            return;
        }
        for (class269 var3 = (class269) class6.field101.method264(arg0 - 99); var3 != null; var3 = (class269) class6.field101.method269((byte) 7)) {
            if (var3.field4671 != null) {
                class236.field4116.method1711(var3.field4671);
                var3.field4671 = null;
            }
            var3.method501(0);
        }
        for (class269 var4 = (class269) class47.field820.method1592(false); var4 != null; var4 = (class269) class47.field820.method1591(117)) {
            if (var4.field4671 != null) {
                class236.field4116.method1711(var4.field4671);
                var4.field4671 = null;
            }
            var4.method501(0);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method699(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class15.field224 = arg0;
        class12.field198 = arg1;
        class272.field4746 = arg3;
        class182.field3273 = arg2;
        field1699++;
        class254.field4452 = arg4;
        if (arg5 && class272.field4746 >= 100) {
            class134.field2425 = class12.field198 * 128 + 64;
            class161.field2849 = class15.field224 * 128 + 64;
            class26.field513 = class206.method1461(class134.field2425, class135.field2450, class161.field2849, 4) - class182.field3273;
        }
        class154.field2735 = 2;
        if (arg6 != 128) {
            field1698 = -11;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IBLpi;)Lkg;")
    public static final class21 method700(int arg0, byte arg1, class181 arg2) {
        field1701++;
        if (class54.method386(arg0, arg2, -13377)) {
            int var3 = -49 / ((arg1 + 32) / 37);
            return class182.method1329(115);
        } else {
            return null;
        }
    }
}
