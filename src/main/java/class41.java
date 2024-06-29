import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class41 {

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "[I")
    public static int[] field466 = new int[128];

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field464 = 0;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "Z")
    public static boolean field470 = true;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "Lqj;")
    public static class196 field474 = class80.method502("Okay", -48);

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "Lqj;")
    public static class196 field473 = class80.method502("Ablegen", -48);

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "Lec;")
    public static class178 field472;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "Log;")
    public static class38 field465;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI)V")
    public static final void method209(boolean arg0, int arg1) {
        field467++;
        for (int var2 = 0; var2 < class63.field863; var2++) {
            class164 var3 = class153.field2482[class188.field3295[var2]];
            long var4 = (long) class188.field3295[var2] << 32 | 0x20000000L;
            if (var3 != null && var3.method811(-41) && var3.field2648.field1574 == arg0 && var3.field2648.method672(-1)) {
                int var6 = var3.field2081 >> 7;
                int var7 = var3.field2085 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var3.field2049 == 1 && (var3.field2081 & 0x7F) == 64 && (var3.field2085 & 0x7F) == 64) {
                        if (class109.field1558[var6][var7] == class163.field2640) {
                            continue;
                        }
                        class109.field1558[var6][var7] = class163.field2640;
                    }
                    if (!var3.field2648.field1639) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field2054 = class74.method470(var3.field2085 + var3.field2049 * 64 - 64, class27.field335, 103, (var3.field2049 - 1) * 64 + var3.field2081);
                    class87.method543(class27.field335, var3.field2081, var3.field2085, var3.field2054, var3.field2049 * 64 + 60 - 64, var3, var3.field2096, var4, var3.field2069);
                }
            }
        }
        if (arg1 <= 123) {
            method209(false, -98);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
    public static final void method210(boolean arg0) {
        field469++;
        if (arg0) {
            return;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class201.field3565[var1] = false;
        }
        class202.field3597 = 1;
        class235.field4181 = -1;
        class13.field146 = -1;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
    public static final void method211(byte arg0) {
        field471++;
        try {
            if (class171.field2876 == null) {
                class171.field2876 = new class181(class168.field2844, class93.method572(-112, new class196[] { class84.method531(-1), class186.field3259 }).method1321((byte) -127));
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class171.field2876 = null;
        }
        if (arg0 != 125) {
            method212(11);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public static void method212(int arg0) {
        field473 = null;
        if (arg0 > -29) {
            field470 = true;
        }
        field465 = null;
        field466 = null;
        field472 = null;
        field474 = null;
    }
}
