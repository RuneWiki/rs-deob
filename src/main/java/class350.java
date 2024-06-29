import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class350 {

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "Lfg;")
    public static class83 field4791 = new class83("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V", line = 7)
    public static final void method1937(int arg0) {
        if (arg0 != 2) {
            method1939((byte) -14);
        }
        field4794++;
        int var1 = 0;
        if (class437.field6374.method1763(class278.field3761, (byte) 100)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (!class437.field6374.field4286) {
            var1 |= 0x40;
        }
        class253.method1485((byte) 62, var1);
        class82.field1154.method2127(var1, -31667);
        class75.field1097.method825(var1, 78);
        class398.field5549.method2817(var1, (byte) 62);
        class492.field7279.method2227(614, var1);
        class469.method2755(17707, var1);
        class413.method2473(1, var1);
        class521.method3061(true, var1);
        class217.method1289(var1, 0);
        if (class137.field1958 == 10) {
            class26.method186(28, 8);
        } else if (class137.field1958 == 30) {
            class26.method186(25, 8);
            return;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)Z", line = 58)
    public static final boolean method1938(byte arg0) {
        if (arg0 >= -36) {
            method1938((byte) -105);
        }
        field4793++;
        try {
            return class399.method2312((byte) 125);
        } catch (IOException var4) {
            class159.method982(-1);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class467.field6834 == null ? -1 : class467.field6834.method1759(true)) + "," + (class207.field2937 == null ? -1 : class207.field2937.method1759(true)) + "," + (class374.field5274 == null ? -1 : class374.field5274.method1759(true)) + " - " + class438.field6394 + "," + (class75.field1089.field372[0] + class215.field3059) + "," + (class79.field1134 + class75.field1089.field362[0]) + " - ";
            for (int var3 = 0; var3 < class438.field6394 && var3 < 50; var3++) {
                var2 = var2 + class387.field5435.field5073[var3] + ",";
            }
            class162.method1000((byte) 68, var5, var2);
            class528.method3102(-124);
            return true;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)V", line = 93)
    public static void method1939(byte arg0) {
        if (arg0 < 19) {
            field4791 = null;
        }
        field4791 = null;
    }
}
