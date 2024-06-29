import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class319 {

    @OriginalMember(owner = "client!at", name = "b", descriptor = "Lea;")
    public static class474 field4620 = new class474("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!at", name = "d", descriptor = "I")
    public static int field4622 = 0;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!at", name = "c", descriptor = "Lkea;")
    public static class203 field4621;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V", line = 13)
    public static final void method2082(int arg0) {
        class37.method201((byte) -122, class595.field8694.field6537);
        field4619++;
        int var1 = (class337.field4821 >> 12) + (class287.field3980 >> 3);
        int var2 = (class250.field3549 >> 3) + (class207.field2781 >> 12);
        class226.field3179 = class439.field6548.field1757 = 0;
        class439.field6548.method3736(8, 0, 8);
        byte var3 = 18;
        class514.field7496 = new int[var3][4];
        class621.field8995 = new int[var3];
        class451.field6731 = new byte[var3][];
        class639.field9186 = new byte[var3][];
        class11.field99 = new int[var3];
        class348.field4971 = new byte[var3][];
        class290.field4014 = new byte[var3][];
        class170.field2090 = new int[var3];
        class475.field7018 = new int[var3];
        class162.field1979 = new byte[var3][];
        class371.field5682 = new int[var3];
        class577.field8333 = new int[var3];
        int var4 = 0;
        for (int var5 = (var1 - (class90.field1032 >> 4)) / 8; var5 <= ((class90.field1032 >> 4) + var1) / 8; var5++) {
            for (int var8 = (var2 - (class30.field349 >> 4)) / 8; var8 <= ((class30.field349 >> 4) + var2) / 8; var8++) {
                int var9 = (var5 << 8) + var8;
                class170.field2090[var4] = var9;
                class475.field7018[var4] = class647.field9367.method1283((byte) -62, "m" + var5 + "_" + var8);
                class621.field8995[var4] = class647.field9367.method1283((byte) -71, "l" + var5 + "_" + var8);
                class371.field5682[var4] = class647.field9367.method1283((byte) -66, "n" + var5 + "_" + var8);
                class577.field8333[var4] = class647.field9367.method1283((byte) -42, "um" + var5 + "_" + var8);
                class11.field99[var4] = class647.field9367.method1283((byte) -55, "ul" + var5 + "_" + var8);
                if (class371.field5682[var4] == -1) {
                    class475.field7018[var4] = -1;
                    class621.field8995[var4] = -1;
                    class577.field8333[var4] = -1;
                    class11.field99[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class371.field5682.length; var6++) {
            class371.field5682[var6] = -1;
            class475.field7018[var6] = -1;
            class621.field8995[var6] = -1;
            class577.field8333[var6] = -1;
            class11.field99[var6] = -1;
        }
        byte var7;
        if (class133.field1673 == 1 || class133.field1673 == 2) {
            var7 = 3;
        } else {
            var7 = 7;
        }
        if (arg0 != 100016300) {
            field4621 = null;
        }
        class258.method1722(var2, var1, var7, arg0 ^ 0x5F620F0, false);
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Z)V", line = 99)
    public static void method2083(boolean arg0) {
        if (!arg0) {
            field4620 = null;
        }
        field4620 = null;
        field4621 = null;
    }
}
