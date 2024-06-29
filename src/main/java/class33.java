import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class33 {

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "Lp;")
    public static class280 field603 = class18.method140((byte) -123, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public int field602;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public int field604;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public int field605;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public int field606;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public int field608;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public int field609;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public int field610;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public int field611;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public int field613;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
    public int field614;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "I")
    public int field615;

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
    public int field617;

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "I")
    public int field618;

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "I")
    public int field619;

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "I")
    public int field620;

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "I")
    public int field621;

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "I")
    public int field622;

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "I")
    public int field625;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "Lua;")
    public static class113 field612;

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "[I")
    public static int[] field623;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
    public static void method280(int arg0) {
        field603 = null;
        field612 = null;
        int var1 = 92 / ((arg0 - 23) / 43);
        field623 = null;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V")
    public static final void method281(int arg0) {
        if (arg0 != 20555) {
            method280(91);
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class237.field4121[var1] = false;
        }
        class178.field3094 = -1;
        class4.field113 = 1;
        field607++;
        class187.field3269 = 0;
        class226.field3900 = 0;
        class187.field3281 = -1;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZLji;)V")
    public static final void method282(boolean arg0, class42 arg1) {
        field624++;
        if (arg1.field711 != null) {
            arg1.field711.field1832 = 0;
        }
        arg1.field712 = false;
        for (class42 var2 = arg1.method37(); var2 != null; var2 = arg1.method3()) {
            method282(arg0, var2);
        }
        if (!arg0) {
            field623 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
    public static final void method283(byte arg0) {
        if (arg0 != -26) {
            method281(-95);
        }
        class57 var1 = class182.field3192;
        synchronized (class182.field3192) {
            class48.field789 = class258.field4576;
            class56.field908++;
            if (class80.field1320 >= 0) {
                while (class80.field1320 != class183.field3226) {
                    int var2 = class177.field3083[class183.field3226];
                    class183.field3226 = class183.field3226 + 1 & 0x7F;
                    if (var2 < 0) {
                        class88.field1431[~var2] = false;
                    } else {
                        class88.field1431[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class88.field1431[var3] = false;
                }
                class80.field1320 = class183.field3226;
            }
            class258.field4576 = class149.field2580;
        }
        field616++;
    }
}
