import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class80 extends class69 {

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "[I")
    public int[] field1522 = new int[] { -1 };

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "[I")
    public int[] field1526 = new int[1];

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "Lha;")
    public static class46 field1518 = class271.method1828("W-=hlen Sie eine Option", -46);

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "Lha;")
    private static class46 field1524 = class271.method1828("Loaded sprites", -46);

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "Lha;")
    public static class46 field1519 = field1524;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "Lpi;")
    public static class181 field1523;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)Lwb;")
    public static final class71 method633(int arg0, int arg1) {
        field1517++;
        class71 var2 = (class71) class231.field4012.method86(7961, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class151.field2688.method1293(class197.method1404(0, arg0), class272.method1841(arg0, (byte) -101), (byte) -83);
        class71 var4 = new class71();
        var4.field1274 = arg0;
        if (var3 != null) {
            var4.method521((byte) 97, new class75(var3));
        }
        var4.method515((byte) -110);
        if (var4.field1222 != -1) {
            var4.method508(method633(var4.field1222, arg1), method633(var4.field1260, 0), 72);
        }
        if (~var4.field1279 != arg1) {
            var4.method516(true, method633(var4.field1279, 0), method633(var4.field1287, 0));
        }
        if (!class170.field3038 && var4.field1275) {
            var4.field1220 = null;
            var4.field1221 = 0;
            var4.field1218 = false;
            var4.field1240 = null;
            var4.field1213 = class17.field247;
        }
        class231.field4012.method80(var4, (long) arg0, (byte) 67);
        return var4;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBIIIIIIII)V")
    public static final void method634(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class65 var10 = null;
        field1520++;
        for (class65 var11 = (class65) class174.field3143.method264(-118); var11 != null; var11 = (class65) class174.field3143.method269((byte) 7)) {
            if (var11.field1109 == arg4 && var11.field1094 == arg5 && var11.field1096 == arg6 && var11.field1103 == arg8) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class65();
            var10.field1103 = arg8;
            var10.field1109 = arg4;
            var10.field1094 = arg5;
            var10.field1096 = arg6;
            class161.method1176(116, var10);
            class174.field3143.method265(var10, -501);
        }
        var10.field1108 = arg7;
        var10.field1098 = arg3;
        if (arg1 != -105) {
            field1523 = null;
        }
        var10.field1090 = arg9;
        var10.field1105 = arg2;
        var10.field1100 = arg0;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
    public static void method635(int arg0) {
        if (arg0 != -1) {
            field1523 = null;
        }
        field1524 = null;
        field1523 = null;
        field1518 = null;
        field1519 = null;
    }
}
