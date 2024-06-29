import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class235 {

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "[B")
    public static byte[] field3302;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "Lok;")
    public static class74 field3298;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
    public static final void method1447(int arg0) {
        if (arg0 > 99) {
            class202.field2946 = null;
            field3301++;
            class496.field7361 = false;
            class134.method988(-28945);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
    public static final void method1448(byte arg0) {
        if (arg0 < 90) {
            return;
        }
        for (class245 var1 = (class245) class410.field6199.method3090(2); var1 != null; var1 = (class245) class410.field6199.method3090(2)) {
            class337.method2065(20, var1);
        }
        field3300++;
        int var2;
        int var3;
        if (class454.field6661.method1533(-1, class113.field1723)) {
            var2 = 3;
            var3 = 0;
        } else {
            var2 = class151.field2295;
            var3 = class151.field2295;
        }
        client.method3047();
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method3049();
            client.method3032(var4);
            client.method3034(var4);
        }
        client.method3037();
        client.method3042();
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V")
    public static void method1449(int arg0) {
        field3302 = null;
        field3298 = null;
        if (arg0 != 11720) {
            field3302 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(B)V")
    public static final void method1450(byte arg0) {
        class382.field5733 = 0;
        class352.field5413 = 0;
        class491.field7325 = 0;
        class365.field5574 = 0;
        if (arg0 != 22) {
            field3302 = null;
        }
        field3297++;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIII)V")
    public static final void method1451(int arg0, int arg1, int arg2, int arg3) {
        field3299++;
        if (class236.field3305 == null) {
            return;
        }
        long var4 = (long) (arg2 << 28 | arg1 << 14 | arg0);
        class449 var6 = (class449) class491.field7318.method3059(71, var4);
        if (var6 == null) {
            client.method3038(arg2, arg0, arg1);
            return;
        }
        class233 var7 = (class233) var6.field6612.method2957(89);
        if (var7 == null) {
            client.method3038(arg2, arg0, arg1);
            return;
        }
        class315 var8 = (class315) client.method3038(arg2, arg0, arg1);
        if (var8 == null) {
            var8 = new class315();
        } else {
            var8.field4859 = var8.field4866 = -1;
        }
        var8.field4864 = var7.field3272;
        if (arg3 != 0) {
            method1448((byte) -106);
        }
        var8.field4863 = var7.field3273;
        label48: while (true) {
            class233 var9 = (class233) var6.field6612.method2947(89);
            if (var9 == null) {
                break;
            }
            if (var8.field4864 != var9.field3272) {
                var8.field4859 = var9.field3272;
                var8.field4867 = var9.field3273;
                while (true) {
                    class233 var10 = (class233) var6.field6612.method2947(39);
                    if (var10 == null) {
                        break label48;
                    }
                    if (var8.field4864 != var10.field3272 && var8.field4859 != var10.field3272) {
                        var8.field4861 = var10.field3273;
                        var8.field4866 = var10.field3272;
                    }
                }
            }
        }
        int var11 = class50.method373(arg2, 14966, (arg1 << 7) + 64, (arg0 << 7) + 64);
        class110.method854(arg2, arg0, arg1, var11, var8);
    }

    static {
        new class347("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
        field3302 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
    }
}
