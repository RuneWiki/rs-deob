import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class725 {

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "[C")
    private static char[] field10169 = new char[64];

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "I")
    public static int field10168;

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "Lfg;")
    public static class140 field10167;

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(I)V")
    public static void method4109(int arg0) {
        field10169 = null;
        int var1 = 51 % ((arg0 + 53) / 41);
        field10167 = null;
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(B)V")
    public static final void method4110(byte arg0) {
        field10168++;
        int var1 = 0;
        if (class118.field1503.field10628.method1580(arg0 ^ 0x72) == 1) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (class118.field1503.field10641.method1572(0) == 0) {
            var1 |= 0x40;
        }
        class570.method3298(var1, 119);
        class379.field4811.method4189(var1, 0);
        class121.field1555.method2886(var1, 36);
        class444.field5956.method1072(var1, (byte) 127);
        if (arg0 != 114) {
            field10169 = null;
        }
        class740.field10303.method1478(var1, (byte) -69);
        class18.method224((byte) -120, var1);
        class192.method1254(-8210, var1);
        class566.method3267(0, var1);
        class432.method2561(0, var1);
        class520.method3115(true);
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field10169[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field10169[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field10169[var2] = (char) (var2 - 4);
        }
        field10169[63] = '-';
        field10169[62] = '*';
    }
}
