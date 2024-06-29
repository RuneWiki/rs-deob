import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class49 {

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "Loh;")
    public static class263 field1055 = class253.method1681(-119, "(U4");

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "Loh;")
    public static class263 field1054 = class253.method1681(-127, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "Led;")
    public static class178 field1050 = new class178();

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "Loh;")
    public static class263 field1057 = class253.method1681(-126, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Llb;")
    public static class127 field1056 = new class127(64);

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field1058 = 0;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field1060 = 0;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "Loh;")
    public static class263 field1059 = class253.method1681(-127, "unzap");

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "Lli;")
    public static class277 field1061 = new class277();

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "[Z")
    public static boolean[] field1062 = new boolean[5];

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "Loh;")
    public static class263 field1063 = class253.method1681(-124, "Titelbild ge-Offnet)3");

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Loh;ZB)V")
    public static final void method316(class263 arg0, boolean arg1, byte arg2) {
        short[] var3 = new short[16];
        if (arg2 < 3) {
            return;
        }
        class263 var4 = arg0.method1768(false);
        field1053++;
        int var5 = 0;
        for (int var6 = 0; var6 < class268.field4727; var6++) {
            class72 var9 = class92.method649(-32508, var6);
            if ((!arg1 || var9.field1499) && var9.field1507 == -1 && var9.field1511 == -1 && var9.field1509 == 0 && var9.field1467.method1768(false).method1744(var4, (byte) -101) != -1) {
                if (var5 >= 250) {
                    class114.field2125 = -1;
                    class245.field4318 = null;
                    return;
                }
                if (var5 >= var3.length) {
                    short[] var10 = new short[var3.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var3[var11];
                    }
                    var3 = var10;
                }
                var3[var5++] = (short) var6;
            }
        }
        class183.field3314 = 0;
        class114.field2125 = var5;
        class263[] var7 = new class263[class114.field2125];
        class245.field4318 = var3;
        for (int var8 = 0; var8 < class114.field2125; var8++) {
            var7[var8] = class92.method649(-32508, var3[var8]).field1467;
        }
        class162.method1066(-86, class245.field4318, var7);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    public static void method317(byte arg0) {
        field1062 = null;
        field1063 = null;
        field1050 = null;
        field1059 = null;
        field1054 = null;
        field1055 = null;
        field1057 = null;
        field1056 = null;
        if (arg0 >= -19) {
            method317((byte) -74);
        }
        field1061 = null;
    }
}
