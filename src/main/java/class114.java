import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class114 extends class5 {

    @OriginalMember(owner = "client!qc", name = "V", descriptor = "[B")
    public byte[] field2719;

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "Lhe;")
    public static class54 field2709 = class6.method58("Mitglieder)2Welt", false);

    @OriginalMember(owner = "client!qc", name = "R", descriptor = "Lhe;")
    public static class54 field2715 = class6.method58("Lade Wordpack )2 ", false);

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "[Z")
    public static boolean[] field2707 = new boolean[112];

    @OriginalMember(owner = "client!qc", name = "H", descriptor = "Z")
    public static boolean field2706 = false;

    @OriginalMember(owner = "client!qc", name = "W", descriptor = "Lhe;")
    private static class54 field2720 = class6.method58("button near the top of that page)3", false);

    @OriginalMember(owner = "client!qc", name = "S", descriptor = "I")
    public static int field2716 = 0;

    @OriginalMember(owner = "client!qc", name = "X", descriptor = "Lhe;")
    public static class54 field2721 = class6.method58("Regeln versto-8en hat)3", false);

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "Lhe;")
    public static class54 field2712 = field2720;

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!qc", name = "T", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!qc", name = "U", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "Leb;")
    public static class31 field2708;

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "Leb;")
    public static class31 field2714;

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "Lef;")
    public static class35 field2710;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)Lce;")
    public static final class20 method871(int arg0) {
        field2718++;
        if (arg0 != 2640) {
            method872(-74);
        }
        class20 var1 = new class20();
        var1.field576 = class70.field1732[0];
        var1.field574 = class62.field1503[0];
        var1.field572 = class103.field2574;
        var1.field570 = class64.field1549;
        var1.field573 = class141.field3221[0];
        var1.field571 = class68.field1686[0];
        var1.field577 = class56.field1412[0];
        var1.field575 = class134.field3050;
        class80.method610(true);
        return var1;
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V")
    public static void method872(int arg0) {
        field2707 = null;
        field2709 = null;
        if (arg0 != 0) {
            field2716 = 93;
        }
        field2721 = null;
        field2710 = null;
        field2712 = null;
        field2708 = null;
        field2720 = null;
        field2715 = null;
        field2714 = null;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)V")
    public static final void method873(boolean arg0) {
        class86.field2134.method992(0);
        if (arg0) {
            method873(false);
        }
        field2713++;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "([B)V")
    public class114(byte[] arg0) {
        this.field2719 = arg0;
    }
}
