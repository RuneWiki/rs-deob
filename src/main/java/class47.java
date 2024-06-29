import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class47 extends class194 {

    @OriginalMember(owner = "client!a", name = "s", descriptor = "I")
    public static int field928 = 50;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "Lqk;")
    public static class207 field931 = class24.method212(255, "(Y<)4col>");

    @OriginalMember(owner = "client!a", name = "w", descriptor = "[I")
    public static int[] field932 = new int[field928];

    @OriginalMember(owner = "client!a", name = "r", descriptor = "[Lqk;")
    public static class207[] field927 = new class207[field928];

    @OriginalMember(owner = "client!a", name = "B", descriptor = "[I")
    public static int[] field937 = new int[field928];

    @OriginalMember(owner = "client!a", name = "o", descriptor = "[I")
    public static int[] field924 = new int[field928];

    @OriginalMember(owner = "client!a", name = "x", descriptor = "[I")
    public static int[] field933 = new int[field928];

    @OriginalMember(owner = "client!a", name = "C", descriptor = "I")
    public static int field938 = 0;

    @OriginalMember(owner = "client!a", name = "D", descriptor = "I")
    public static int field939 = 0;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "Lqk;")
    public static class207 field925 = class24.method212(255, ":tradereq:");

    @OriginalMember(owner = "client!a", name = "z", descriptor = "[I")
    public static int[] field935 = new int[field928];

    @OriginalMember(owner = "client!a", name = "u", descriptor = "[I")
    public static int[] field930 = new int[field928];

    @OriginalMember(owner = "client!a", name = "E", descriptor = "Lqk;")
    public static class207 field940 = class24.method212(255, "settings");

    @OriginalMember(owner = "client!a", name = "F", descriptor = "[I")
    public static int[] field941 = new int[field928];

    @OriginalMember(owner = "client!a", name = "G", descriptor = "Ldd;")
    public static class132 field942 = new class132();

    @OriginalMember(owner = "client!a", name = "K", descriptor = "Lqk;")
    public static class207 field945 = class24.method212(255, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!a", name = "J", descriptor = "[I")
    public static int[] field944 = new int[14];

    @OriginalMember(owner = "client!a", name = "L", descriptor = "Lqk;")
    public static class207 field946 = class24.method212(255, "clignotant2:");

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public int field926;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "I")
    public int field934;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!a", name = "H", descriptor = "Luh;")
    public static class100 field943;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "Lai;")
    public static class85 field929;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(Z)V")
    public static void method359(boolean arg0) {
        field924 = null;
        field927 = null;
        field942 = null;
        field937 = null;
        field940 = null;
        field929 = null;
        field941 = null;
        if (arg0) {
            method359(false);
        }
        field932 = null;
        field931 = null;
        field930 = null;
        field946 = null;
        field925 = null;
        field943 = null;
        field933 = null;
        field935 = null;
        field944 = null;
        field945 = null;
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(Z)V")
    public static final void method360(boolean arg0) {
        field936++;
        int var1 = class136.field2341 + class202.field3565.field5104;
        int var2 = class286.field5112 + class202.field3565.field5072;
        if (class4.field66 - var1 < -500 || class4.field66 - var1 > 500 || (class260.field4636 - var2) < -500 || (class260.field4636 - var2) > 500) {
            class4.field66 = var1;
            class260.field4636 = var2;
        }
        if (!arg0) {
            method360(false);
        }
        if (class4.field66 != var1) {
            class4.field66 += (var1 - class4.field66) / 16;
        }
        if (class260.field4636 != var2) {
            class260.field4636 += (var2 - class260.field4636) / 16;
        }
        if (class214.field3808) {
            for (int var3 = 0; var3 < class113.field1975; var3++) {
                int var4 = class107.field1909[var3];
                if (var4 == 98) {
                    class25.field533 = class25.field533 + 47 & 0xFFFFFFF0;
                } else if (var4 == 99) {
                    class25.field533 = class25.field533 - 17 & 0xFFFFFFF0;
                } else if (var4 == 96) {
                    class266.field4711 = class266.field4711 - 65 & 0xFFFFFF80;
                } else if (var4 == 97) {
                    class266.field4711 = class266.field4711 + 191 & 0xFFFFFF80;
                }
            }
        } else {
            if (class165.field2920[98]) {
                class5.field77 += (12 - class5.field77) / 2;
            } else if (class165.field2920[99]) {
                class5.field77 += (-class5.field77 - 12) / 2;
            } else {
                class5.field77 /= 2;
            }
            if (class165.field2920[96]) {
                class123.field2133 += (-class123.field2133 - 24) / 2;
            } else if (class165.field2920[97]) {
                class123.field2133 += (24 - class123.field2133) / 2;
            } else {
                class123.field2133 /= 2;
            }
            class25.field533 += class5.field77 / 2;
            class266.field4711 += class123.field2133 / 2;
        }
        class105.method761(-4);
    }
}
