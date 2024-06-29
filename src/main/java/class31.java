import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class31 extends class176 {

    @OriginalMember(owner = "client!d", name = "D", descriptor = "[[[I")
    public static int[][][] field617 = new int[4][105][105];

    @OriginalMember(owner = "client!d", name = "E", descriptor = "Lob;")
    public static class141 field618 = class175.method1195(40, "leuchten1:");

    @OriginalMember(owner = "client!d", name = "G", descriptor = "Lob;")
    public static class141 field620 = class175.method1195(40, ":");

    @OriginalMember(owner = "client!d", name = "F", descriptor = "I")
    public int field619;

    @OriginalMember(owner = "client!d", name = "H", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!d", name = "I", descriptor = "I")
    public int field622;

    @OriginalMember(owner = "client!d", name = "J", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!d", name = "K", descriptor = "I")
    public int field624;

    @OriginalMember(owner = "client!d", name = "L", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!d", name = "M", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!d", name = "O", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!d", name = "R", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!d", name = "P", descriptor = "Lpe;")
    public static class154 field628;

    @OriginalMember(owner = "client!d", name = "S", descriptor = "Lfd;")
    public static class55 field631;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "(I)V")
    public static final void method224(int arg0) {
        class169.field3257 = arg0;
        for (int var1 = 0; var1 < class163.field3158; var1++) {
            for (int var2 = 0; var2 < class220.field4172; var2++) {
                if (class131.field2506[arg0][var1][var2] == null) {
                    class131.field2506[arg0][var1][var2] = new class153(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILog;)V")
    public final void method225(int arg0, class146 arg1) {
        field625++;
        int var3 = -83 % ((arg0 - 81) / 43);
        while (true) {
            int var4 = arg1.method991(255);
            if (var4 == 0) {
                return;
            }
            this.method231(arg1, -31549, var4);
        }
    }

    @OriginalMember(owner = "client!d", name = "g", descriptor = "(I)V")
    public static void method226(int arg0) {
        field617 = null;
        field618 = null;
        if (arg0 != 4) {
            method229(-125, null, 83);
        }
        field628 = null;
        field631 = null;
        field620 = null;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(II)V")
    public static final void method227(int arg0, int arg1) {
        if (arg1 >= -69) {
            method229(-73, null, 123);
        }
        for (class110 var2 = (class110) class195.field3729.method799((byte) 117); var2 != null; var2 = (class110) class195.field3729.method796((byte) -33)) {
            if ((var2.field4067 >> 48 & 0xFFFFL) == (long) arg0) {
                var2.method1392(128);
            }
        }
        field623++;
    }

    @OriginalMember(owner = "client!d", name = "h", descriptor = "(I)V")
    public static final void method228(int arg0) {
        if (~class189.field3666.toLowerCase().indexOf("microsoft") == arg0) {
            class119.field2317[93] = 43;
            class119.field2317[44] = 71;
            class119.field2317[45] = 26;
            class119.field2317[59] = 57;
            class119.field2317[47] = 73;
            class119.field2317[61] = 27;
            class119.field2317[92] = 74;
            class119.field2317[46] = 72;
            if (class189.field3662 == null) {
                class119.field2317[192] = 58;
                class119.field2317[222] = 59;
            } else {
                class119.field2317[520] = 59;
                class119.field2317[192] = 28;
                class119.field2317[222] = 58;
            }
            class119.field2317[91] = 42;
        } else {
            class119.field2317[221] = 43;
            class119.field2317[223] = 28;
            class119.field2317[219] = 42;
            class119.field2317[186] = 57;
            class119.field2317[220] = 74;
            class119.field2317[222] = 59;
            class119.field2317[192] = 58;
            class119.field2317[190] = 72;
            class119.field2317[188] = 71;
            class119.field2317[187] = 27;
            class119.field2317[191] = 73;
            class119.field2317[189] = 26;
        }
        field630++;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILob;I)V")
    public static final void method229(int arg0, class141 arg1, int arg2) {
        class141 var3 = arg1.method925((byte) 34).method898(120);
        int var4 = -40 / ((-arg2 - 8) / 55);
        field621++;
        boolean var5 = false;
        for (int var6 = 0; var6 < class184.field3587; var6++) {
            class38 var7 = class116.field2231[class188.field3647[var6]];
            if (var7 != null && var7.field773 != null && var7.field773.method933((byte) -76, var3)) {
                var5 = true;
                class162.method1130(2, 1, var7.field3870[0], var7.field3892[0], (byte) 82, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 1);
                if (arg0 == 1) {
                    class7.field120.method32(90, 12885);
                    class7.field120.method994(-118, class188.field3647[var6]);
                    class83.field1665++;
                } else if (arg0 == 4) {
                    class7.field120.method32(200, 12885);
                    class7.field120.method994(-120, class188.field3647[var6]);
                    class202.field3810++;
                } else if (arg0 == 6) {
                    class7.field120.method32(37, 12885);
                    class7.field120.method1004(-121, class188.field3647[var6]);
                    class16.field286++;
                } else if (arg0 == 7) {
                    class7.field120.method32(232, 12885);
                    class7.field120.method1009(-125, class188.field3647[var6]);
                    class118.field2301++;
                }
                break;
            }
        }
        if (!var5) {
            class131.method836(0, (byte) -101, class111.field2128, class220.method1422(new class141[] { class144.field2786, var3 }, -3));
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BLob;)V")
    public static final void method230(byte arg0, class141 arg1) {
        field629++;
        if (class180.field3541 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg1.method926(arg0 + 19784);
        if (var3 == 0L) {
            return;
        }
        while (var2 < class180.field3541.length && class180.field3541[var2].field4067 != var3) {
            var2++;
        }
        if (class180.field3541.length <= var2 || class180.field3541[var2] == null) {
            return;
        }
        class100.field1950++;
        class7.field120.method32(145, 12885);
        class7.field120.method978(-128, class180.field3541[var2].field4067);
        if (arg0 != 6) {
            field618 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Log;II)V")
    private final void method231(class146 arg0, int arg1, int arg2) {
        field627++;
        if (arg2 == 1) {
            this.field622 = arg0.method1007(93);
            this.field619 = arg0.method991(arg1 + 31804);
            this.field624 = arg0.method991(255);
        }
        if (arg1 != -31549) {
            field617 = null;
        }
    }
}
