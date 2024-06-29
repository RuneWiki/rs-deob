import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class394 {

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "Lui;")
    public static class375 field5988 = new class375("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!lv", name = "g", descriptor = "I")
    public static int field5990 = 1;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "I")
    public static int field5984;

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
    public static int field5986;

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
    public static int field5987;

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "I")
    public static int field5989;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "Lns;")
    public static class438 field5985;

    @OriginalMember(owner = "client!lv", name = "h", descriptor = "Lns;")
    public static class438 field5991;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lrk;I)V", line = 5)
    public static final void method2423(class194 arg0, int arg1) {
        field5984++;
        class119 var2 = (class119) class55.field747.method1970(64);
        int var3 = 13 / ((arg1 - 17) / 48);
        while (var2 != null) {
            if (var2.field1670 == arg0) {
                if (var2.field1681 != null) {
                    class325.field4996.method1274(var2.field1681);
                    var2.field1681 = null;
                }
                var2.method2785((byte) -120);
                return;
            }
            var2 = (class119) class55.field747.method1960(24);
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)V", line = 46)
    public static void method2424(byte arg0) {
        field5985 = null;
        field5991 = null;
        if (arg0 == -39) {
            field5988 = null;
        }
    }
}
