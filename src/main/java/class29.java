import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class29 extends class113 {

    @OriginalMember(owner = "client!da", name = "D", descriptor = "I")
    private int field618 = 128;

    @OriginalMember(owner = "client!da", name = "F", descriptor = "I")
    private int field620 = 0;

    @OriginalMember(owner = "client!da", name = "K", descriptor = "I")
    private int field625 = 128;

    @OriginalMember(owner = "client!da", name = "V", descriptor = "I")
    public int field636 = -1;

    @OriginalMember(owner = "client!da", name = "cb", descriptor = "I")
    private int field643 = 0;

    @OriginalMember(owner = "client!da", name = "T", descriptor = "I")
    private int field634 = 0;

    @OriginalMember(owner = "client!da", name = "L", descriptor = "Lcd;")
    public static class23 field626 = class54.method414("W-=hlen Sie eine Welt", -1);

    @OriginalMember(owner = "client!da", name = "H", descriptor = "I")
    public static int field622 = 1;

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "Lcd;")
    public static class23 field631 = class54.method414("Bitte warten Sie)3)3)3", -1);

    @OriginalMember(owner = "client!da", name = "G", descriptor = "[I")
    public static int[] field621 = new int[50];

    @OriginalMember(owner = "client!da", name = "M", descriptor = "I")
    public static int field627 = 2;

    @OriginalMember(owner = "client!da", name = "N", descriptor = "Lcd;")
    public static class23 field628 = class54.method414("Unerwartete Antwort vom Anmelde)2Server", -1);

    @OriginalMember(owner = "client!da", name = "R", descriptor = "Lcd;")
    public static class23 field632 = class54.method414("sl_button", -1);

    @OriginalMember(owner = "client!da", name = "Z", descriptor = "Lcd;")
    public static class23 field640 = class54.method414("mapedge", -1);

    @OriginalMember(owner = "client!da", name = "eb", descriptor = "I")
    public static int field645 = 0;

    @OriginalMember(owner = "client!da", name = "I", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "I")
    private int field624;

    @OriginalMember(owner = "client!da", name = "O", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!da", name = "P", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!da", name = "S", descriptor = "I")
    public int field633;

    @OriginalMember(owner = "client!da", name = "U", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!da", name = "W", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!da", name = "Y", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!da", name = "db", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!da", name = "C", descriptor = "Loe;")
    public static class130 field617;

    @OriginalMember(owner = "client!da", name = "E", descriptor = "[S")
    private short[] field619;

    @OriginalMember(owner = "client!da", name = "X", descriptor = "[S")
    private short[] field638;

    @OriginalMember(owner = "client!da", name = "ab", descriptor = "[S")
    private short[] field641;

    @OriginalMember(owner = "client!da", name = "bb", descriptor = "[S")
    private short[] field642;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
    public static void method218(int arg0) {
        field631 = null;
        field632 = null;
        field628 = null;
        field617 = null;
        field621 = null;
        if (arg0 < -122) {
            field626 = null;
            field640 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V")
    public static final void method219(int arg0) {
        if (class137.field2827.toLowerCase().indexOf("microsoft") == -1) {
            class52.field1238[47] = 73;
            class52.field1238[61] = 27;
            class52.field1238[44] = 71;
            if (class137.field2829 == null) {
                class52.field1238[222] = 59;
                class52.field1238[192] = 58;
            } else {
                class52.field1238[222] = 58;
                class52.field1238[192] = 28;
                class52.field1238[520] = 59;
            }
            class52.field1238[59] = 57;
            class52.field1238[46] = 72;
            class52.field1238[93] = 43;
            class52.field1238[92] = 74;
            class52.field1238[91] = 42;
            class52.field1238[45] = 26;
        } else {
            class52.field1238[223] = 28;
            class52.field1238[187] = 27;
            class52.field1238[190] = 72;
            class52.field1238[191] = 73;
            class52.field1238[221] = 43;
            class52.field1238[186] = 57;
            class52.field1238[188] = 71;
            class52.field1238[219] = 42;
            class52.field1238[192] = 58;
            class52.field1238[220] = 74;
            class52.field1238[189] = 26;
            class52.field1238[222] = 59;
        }
        field629++;
        if (arg0 <= 54) {
            method219(-114);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lva;I)V")
    public final void method220(class189 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1202(arg1 - 43);
            if (var3 == 0) {
                if (arg1 != -1) {
                    method219(-27);
                }
                field635++;
                return;
            }
            this.method222(arg1 ^ 0x2, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Lbh;")
    public final class18 method221(int arg0, int arg1) {
        field644++;
        class18 var3 = (class18) class67.field1570.method995(108, (long) this.field633);
        if (var3 == null) {
            class188 var4 = class188.method1158(class155.field3113, this.field624, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field638 != null) {
                for (int var5 = 0; var5 < this.field638.length; var5++) {
                    var4.method1173(this.field638[var5], this.field642[var5]);
                }
            }
            if (this.field619 != null) {
                for (int var6 = 0; var6 < this.field619.length; var6++) {
                    var4.method1174(this.field619[var6], this.field641[var6]);
                }
            }
            var3 = var4.method1172(this.field643 + 64, this.field620 + 850, -30, -50, -30, true, true);
            class67.field1570.method990(var3, (long) this.field633, 103);
        }
        class18 var7;
        if (this.field636 == -1 || arg0 == -1) {
            var7 = var3.method116(true);
        } else {
            var7 = class20.method128(this.field636, (byte) 80).method619(arg0, var3, -1);
        }
        if (this.field625 != 128 || this.field618 != 128) {
            var7.method118(this.field625, this.field618, this.field625);
        }
        if (this.field634 != 0) {
            if (this.field634 == 90) {
                var7.method114();
            }
            if (this.field634 == 180) {
                var7.method114();
                var7.method114();
            }
            if (this.field634 == 270) {
                var7.method114();
                var7.method114();
                var7.method114();
            }
        }
        if (arg1 >= -20) {
            this.method222(78, -6, null);
        }
        return var7;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILva;)V")
    private final void method222(int arg0, int arg1, class189 arg2) {
        field637++;
        if (arg0 != -3) {
            return;
        }
        if (arg1 == 1) {
            this.field624 = arg2.method1197(-1);
        } else if (arg1 == 2) {
            this.field636 = arg2.method1197(-1);
        } else if (arg1 == 4) {
            this.field625 = arg2.method1197(-1);
        } else if (arg1 == 5) {
            this.field618 = arg2.method1197(-1);
        } else if (arg1 == 6) {
            this.field634 = arg2.method1197(-1);
        } else if (arg1 == 7) {
            this.field643 = arg2.method1202(108);
        } else if (arg1 == 8) {
            this.field620 = arg2.method1202(-108);
        } else if (arg1 == 40) {
            int var4 = arg2.method1202(-89);
            this.field642 = new short[var4];
            this.field638 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field638[var5] = (short) arg2.method1197(-1);
                this.field642[var5] = (short) arg2.method1197(-1);
            }
            return;
        } else if (arg1 == 41) {
            int var6 = arg2.method1202(121);
            this.field619 = new short[var6];
            this.field641 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field619[var7] = (short) arg2.method1197(-1);
                this.field641[var7] = (short) arg2.method1197(-1);
            }
            return;
        }
    }
}
