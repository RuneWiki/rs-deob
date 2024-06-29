import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class476 {

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
    public static int field7066 = 0;

    @OriginalMember(owner = "client!dv", name = "j", descriptor = "Lco;")
    public static class77 field7072;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "B")
    public byte field7064;

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "I")
    public int field7065;

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "I")
    public static int field7067;

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "I")
    public static int field7068;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "Ljava/lang/String;")
    public String field7063;

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "Ljava/lang/String;")
    public String field7069;

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "Ljava/lang/String;")
    public String field7070;

    @OriginalMember(owner = "client!dv", name = "i", descriptor = "Ljava/lang/String;")
    public String field7071;

    static {
        new class446("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
        new class446(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
        field7072 = new class77("LIVE", 0);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V", line = 6)
    public static void method2838(int arg0) {
        if (arg0 == 6017) {
            field7072 = null;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 18)
    public static final void method2839(String arg0, boolean arg1) {
        field7067++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class467.method2808(-1, arg0);
        if (var2 == null) {
            return;
        }
        if (!arg1) {
            method2838(-54);
        }
        for (int var3 = 0; var3 < class243.field3404; var3++) {
            String var4 = class436.field6599[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class467.method2808(-1, var4);
            if (var5 != null && var5.equals(var2)) {
                class243.field3404--;
                for (int var6 = var3; var6 < class243.field3404; var6++) {
                    class436.field6599[var6] = class436.field6599[var6 + 1];
                    class165.field2242[var6] = class165.field2242[var6 + 1];
                    class317.field4608[var6] = class317.field4608[var6 + 1];
                    class321.field4646[var6] = class321.field4646[var6 + 1];
                    class295.field4305[var6] = class295.field4305[var6 + 1];
                }
                class38.field557++;
                class114.field1586 = class145.field1932;
                class424.method2582(class165.field2225, -1);
                class538.field7879.method1072((byte) 102, class436.method2652(arg0, (byte) -79));
                class538.field7879.method1071(-25643, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(ZZI)V", line = 80)
    public static final void method2840(boolean arg0, boolean arg1, int arg2) {
        if (arg1) {
            class56.field822--;
            if (class56.field822 == 0) {
                class401.field6108 = null;
            }
        }
        if (arg0) {
            class118.field1618--;
            if (class118.field1618 == 0) {
                class179.field2408 = null;
            }
        }
        if (arg2 != 0) {
            method2839(null, false);
        }
        field7068++;
    }
}
