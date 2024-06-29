import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class146 {

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field2401 = 0;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field2404 = 0;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "[[S")
    public static short[][] field2409 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "J")
    public long field2406;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "Lhb;")
    public class146 field2405;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "Lhb;")
    public class146 field2407;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLsb;)V")
    public static final void method1073(boolean arg0, class124 arg1) {
        if (!arg0) {
            method1073(false, (class124) null);
        }
        field2398++;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
    public final void method1074(byte arg0) {
        field2403++;
        if (this.field2405 == null) {
            return;
        }
        this.field2405.field2407 = this.field2407;
        this.field2407.field2405 = this.field2405;
        this.field2407 = null;
        this.field2405 = null;
        int var2 = -39 / ((-arg0 - 79) / 37);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)Z")
    public final boolean method1075(boolean arg0) {
        field2396++;
        if (this.field2405 == null) {
            return false;
        } else {
            if (arg0) {
                field2401 = 60;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)V")
    public static void method1076(boolean arg0) {
        if (!arg0) {
            field2409 = null;
        }
        field2409 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZILsb;)Z")
    public static final boolean method1077(boolean arg0, int arg1, class124 arg2) {
        byte[] var3 = arg2.method897(false, arg1);
        field2397++;
        if (var3 == null) {
            return false;
        }
        class237.method1569(var3, -16144);
        if (!arg0) {
            method1078((byte) -49);
        }
        return true;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)Z")
    public static final boolean method1078(byte arg0) {
        field2399++;
        int var1 = -77 % ((arg0 + 22) / 63);
        try {
            return class244.method1616(-128);
        } catch (IOException var5) {
            class167.method1204(true);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + client.field4578 + "," + class26.field461 + "," + class38.field649 + " - " + class222.field3547 + "," + (class48.field878.field2844[0] + class256.field4082) + "," + (class48.field878.field2813[0] + class170.field2787) + " - ";
            for (int var4 = 0; class222.field3547 > var4 && var4 < 50; var4++) {
                var3 = var3 + class143.field2360.field2263[var4] + ",";
            }
            class161.method1167(var6, -127, var3);
            class31.method270(31377);
            return true;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1079(String arg0, int arg1) {
        String var2 = class66.method506((byte) 20, class260.method1739(false, arg0));
        if (var2 == null) {
            var2 = "";
        }
        field2400++;
        if (arg1 != 10446) {
            method1073(true, (class124) null);
        }
        return var2;
    }
}
