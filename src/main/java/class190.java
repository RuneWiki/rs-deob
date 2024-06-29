import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class190 extends class149 {

    @OriginalMember(owner = "client!va", name = "ab", descriptor = "Lsg;")
    public class169 field3748 = class70.field1307;

    @OriginalMember(owner = "client!va", name = "T", descriptor = "I")
    public int field3741 = 0;

    @OriginalMember(owner = "client!va", name = "R", descriptor = "Lsg;")
    public static class169 field3739 = class165.method1060("(U0a )2 in: ", 1536);

    @OriginalMember(owner = "client!va", name = "U", descriptor = "Lsg;")
    public static class169 field3742 = class165.method1060("Passwort: ", 1536);

    @OriginalMember(owner = "client!va", name = "S", descriptor = "Lsg;")
    public static class169 field3740 = class165.method1060("sch-Utteln:", 1536);

    @OriginalMember(owner = "client!va", name = "fb", descriptor = "Lcb;")
    public static class22 field3753 = new class22();

    @OriginalMember(owner = "client!va", name = "P", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!va", name = "V", descriptor = "I")
    public int field3743;

    @OriginalMember(owner = "client!va", name = "W", descriptor = "I")
    public int field3744;

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "I")
    public int field3747;

    @OriginalMember(owner = "client!va", name = "cb", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!va", name = "eb", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!va", name = "db", descriptor = "J")
    public static long field3751;

    @OriginalMember(owner = "client!va", name = "Y", descriptor = "[I")
    public int[] field3746;

    @OriginalMember(owner = "client!va", name = "bb", descriptor = "[I")
    public int[] field3749;

    @OriginalMember(owner = "client!va", name = "X", descriptor = "[Lsg;")
    public class169[] field3745;

    @OriginalMember(owner = "client!va", name = "gb", descriptor = "[Lbg;")
    public static class18[] field3754;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZILoa;)V")
    private final void method1251(boolean arg0, int arg1, class127 arg2) {
        if (!arg0) {
            return;
        }
        if (arg1 == 1) {
            this.field3744 = arg2.method819((byte) 22);
        } else if (arg1 == 2) {
            this.field3743 = arg2.method819((byte) 22);
        } else if (arg1 == 3) {
            this.field3748 = arg2.method793((byte) -127);
        } else if (arg1 == 4) {
            this.field3747 = arg2.method814(8);
        } else if (arg1 == 5) {
            this.field3741 = arg2.method785(true);
            this.field3745 = new class169[this.field3741];
            this.field3746 = new int[this.field3741];
            for (int var4 = 0; var4 < this.field3741; var4++) {
                this.field3746[var4] = arg2.method814(8);
                this.field3745[var4] = arg2.method793((byte) -50);
            }
        } else if (arg1 == 6) {
            this.field3741 = arg2.method785(true);
            this.field3749 = new int[this.field3741];
            this.field3746 = new int[this.field3741];
            for (int var5 = 0; var5 < this.field3741; var5++) {
                this.field3746[var5] = arg2.method814(8);
                this.field3749[var5] = arg2.method814(8);
            }
        }
        field3737++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Loa;I)V")
    public final void method1252(class127 arg0, int arg1) {
        field3738++;
        if (arg1 != -1) {
            this.method1251(true, 52, null);
        }
        while (true) {
            int var3 = arg0.method819((byte) 22);
            if (var3 == 0) {
                return;
            }
            this.method1251(true, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(I)V")
    public static void method1253(int arg0) {
        if (arg0 != 5) {
            return;
        }
        field3753 = null;
        field3754 = null;
        field3742 = null;
        field3739 = null;
        field3740 = null;
    }
}
