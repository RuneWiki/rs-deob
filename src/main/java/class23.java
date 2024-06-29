import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class23 extends class31 {

    @OriginalMember(owner = "client!dd", name = "dd", descriptor = "[I")
    public static int[] field532 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!dd", name = "hd", descriptor = "I")
    public static int field536 = -1;

    @OriginalMember(owner = "client!dd", name = "ed", descriptor = "Lba;")
    public static class7 field533 = new class7(128);

    @OriginalMember(owner = "client!dd", name = "md", descriptor = "Lgd;")
    public static class40 field541 = class14.method90(false, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

    @OriginalMember(owner = "client!dd", name = "ld", descriptor = "Loe;")
    public static class89 field540 = new class89();

    @OriginalMember(owner = "client!dd", name = "qd", descriptor = "Lgd;")
    public static class40 field545 = class14.method90(false, "@or1@");

    @OriginalMember(owner = "client!dd", name = "sd", descriptor = "I")
    public static int field547 = -1;

    @OriginalMember(owner = "client!dd", name = "ud", descriptor = "Lgd;")
    public static class40 field549 = class14.method90(false, "Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <OFF>");

    @OriginalMember(owner = "client!dd", name = "vd", descriptor = "Lgd;")
    private static class40 field550 = class14.method90(false, "Moderator option: Mute player for 48 hours: <ON>");

    @OriginalMember(owner = "client!dd", name = "rd", descriptor = "[I")
    public static int[] field546 = new int[25];

    @OriginalMember(owner = "client!dd", name = "nd", descriptor = "Lgd;")
    public static class40 field542 = class14.method90(false, "da dieser Computer gegen unsere ");

    @OriginalMember(owner = "client!dd", name = "od", descriptor = "Lgd;")
    public static class40 field543 = field550;

    @OriginalMember(owner = "client!dd", name = "td", descriptor = "I")
    public static int field548 = 0;

    @OriginalMember(owner = "client!dd", name = "Yc", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!dd", name = "Zc", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!dd", name = "ad", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!dd", name = "bd", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!dd", name = "fd", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!dd", name = "gd", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!dd", name = "id", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!dd", name = "kd", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!dd", name = "pd", descriptor = "Lrb;")
    public static class103 field544;

    @OriginalMember(owner = "client!dd", name = "cd", descriptor = "Lvc;")
    public class128 field531;

    @OriginalMember(owner = "client!dd", name = "jd", descriptor = "[[[B")
    public static byte[][][] field538;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "(I)V", line = 3)
    public static void method134(int arg0) {
        if (arg0 != 0) {
            method134(-52);
        }
        field532 = null;
        field549 = null;
        field543 = null;
        field545 = null;
        field541 = null;
        field538 = null;
        field546 = null;
        field542 = null;
        field540 = null;
        field544 = null;
        field550 = null;
        field533 = null;
    }

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "(I)Z", line = 31)
    public final boolean method135(int arg0) {
        ++field537;
        if (arg0 != 25) {
            return false;
        } else {
            return this.field531 != null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(JB)V", line = 50)
    public static final void method136(long arg0, byte arg1) {
        ++field539;
        if (arg1 > -20) {
            field549 = null;
        }
        if (arg0 != 0L) {
            for (int var3 = 0; var3 < class42.field1065; ++var3) {
                if (~class67.field1657[var3] == ~arg0) {
                    --class42.field1065;
                    class45.field1124 = true;
                    for (int var4 = var3; ~class42.field1065 < ~var4; ++var4) {
                        class67.field1657[var4] = class67.field1657[var4 + 1];
                    }
                    class92.field2094.method290((byte) 0, 29);
                    ++class2.field36;
                    class92.field2094.method793(arg0, false);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIZLra;)Z", line = 97)
    public static final boolean method137(int arg0, int arg1, boolean arg2, class102 arg3) {
        ++field530;
        if (!class96.method649(arg3, (byte) 84, arg2)) {
            return false;
        } else {
            if (arg0 > ~arg1) {
                class130.field3130 = new class7(arg1);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILra;Ljava/awt/Component;)Le;", line = 115)
    public static final class28 method138(int arg0, class102 arg1, Component arg2) {
        class13.method81(arg2, arg1, (byte) 72);
        if (arg0 != -1540) {
            field542 = null;
        }
        ++field534;
        class28 var3 = new class28();
        class12.method66(var3, (byte) -95);
        return var3;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)Lqb;", line = 154)
    public final class97 method2(byte arg0) {
        ++field528;
        if (this.field531 == null) {
            return null;
        } else {
            class45 var2 = ~super.field813 != 0 && ~super.field804 == -1 ? class22.method126((byte) 91, super.field813) : null;
            class45 var3 = ~super.field777 == 0 || ~super.field830 == ~super.field777 && var2 != null ? null : class22.method126((byte) 52, super.field777);
            class97 var4 = this.field531.method1014(super.field799, false, var3, super.field798, var2);
            if (var4 == null) {
                return null;
            } else {
                var4.method672();
                if (arg0 >= -110) {
                    field540 = null;
                }
                super.field820 = var4.field11;
                if (super.field827 != -1 && super.field806 != -1) {
                    class97 var5 = class58.method437(super.field827, -4990).method381((byte) 118, super.field806);
                    if (var5 != null) {
                        class97[] var6 = new class97[] { var4, var5 };
                        var5.method653(0, -super.field795, 0);
                        var4 = new class97(var6, 2, true);
                    }
                }
                if (~this.field531.field3030 == -2) {
                    var4.field2268 = true;
                }
                return var4;
            }
        }
    }
}
