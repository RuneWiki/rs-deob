import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public abstract class class59 {

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "Lon;")
    public static class184 field709;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Z)V")
    public static void method348(boolean arg0) {
        if (!arg0) {
            field709 = null;
        }
        field709 = null;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V")
    public static final void method349(byte arg0) {
        field708++;
        if (arg0 <= 125) {
            field707 = -85;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class442.field6335[var1] = false;
        }
        class218.field3074 = -1;
        class352.field4976 = class334.field4730;
        class98.field1193 = 0;
        class129.field1568 = 5;
        class380.field5347 = class276.field3925;
        class414.field5950 = class189.field2726;
        class332.field4705 = class265.field3774;
        class45.field547 = class138.field1722;
        class434.field6241 = -1;
        class392.field5532 = 0;
        class162.field2198 = class377.field5324;
    }

    static {
        new class362((String) null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", (String) null, (String) null);
        field709 = null;
    }
}
