import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class360 {

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Lgf;")
    public static class180 field5438 = new class180("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field5439 = 0;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "Lvb;")
    public static class130 field5440;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V", line = 7)
    public static final void method2317(byte arg0) {
        field5437++;
        class452.method2717(class394.field5821, (byte) 86, (long) class180.field2734);
        if (class341.field5207 != -1) {
            class471.method2809((byte) -63, class341.field5207);
        }
        int var1 = 0;
        if (arg0 < 120) {
            field5439 = 100;
        }
        while (class73.field1232 > var1) {
            if (class165.field2473[var1]) {
                class482.field7076[var1] = true;
            }
            class459.field6776[var1] = class165.field2473[var1];
            class165.field2473[var1] = false;
            var1++;
        }
        class35.field537 = class180.field2734;
        if (class394.field5821.method473()) {
            class466.field6856 = true;
        }
        if (class341.field5207 != -1) {
            class73.field1232 = 0;
            class21.method174(2);
        }
        class394.field5821.method492();
        class108.method807(class520.field7642, true);
        class228.field3343 = 0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lps;I)I", line = 53)
    public static final int method2318(class62 arg0, int arg1) {
        field5436++;
        int var2 = arg0.field1107;
        class441 var3 = arg0.method192(true);
        if (arg1 != -1) {
            field5440 = null;
        }
        if (arg0.field393) {
            var2 = arg0.field1098;
        } else if (arg0.field373 == var3.field6434 || arg0.field373 == var3.field6431 || arg0.field373 == var3.field6461 || arg0.field373 == var3.field6444) {
            var2 = arg0.field1105;
        } else if (arg0.field373 == var3.field6469 || arg0.field373 == var3.field6432 || arg0.field373 == var3.field6435 || arg0.field373 == var3.field6468) {
            var2 = arg0.field1104;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V", line = 87)
    public static void method2319(boolean arg0) {
        field5440 = null;
        if (!arg0) {
            field5438 = null;
        }
    }
}
