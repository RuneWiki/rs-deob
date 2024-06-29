import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class157 extends class125 {

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "Lud;")
    public static class143 field3602 = new class143(32);

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "Lod;")
    public static class101 field3604 = class46.method335(65, ":clan:");

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "Lod;")
    public static class101 field3611 = class46.method335(100, "::qa_op_test");

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "Lod;")
    public static class101 field3610 = class46.method335(117, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "Lod;")
    public static class101 field3609 = class46.method335(100, "Verbindung konnte nicht hergestellt werden)3");

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "Lod;")
    private static class101 field3621 = class46.method335(-104, "Existing User");

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "Lod;")
    public static class101 field3606 = field3621;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
    public static int field3626 = 0;

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "Lod;")
    public static class101 field3627 = class46.method335(-113, "Mitglieder)2Welt");

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public int field3601;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    public int field3603;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public int field3605;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    public int field3608;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    public int field3612;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
    public int field3614;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "I")
    public int field3618;

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "I")
    public int field3619;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
    public int field3620;

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "I")
    public int field3624;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "Ldb;")
    public class24 field3607;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "Ljf;")
    public class68 field3615;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "Ljf;")
    public class68 field3617;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "Lme;")
    public static class88 field3625;

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "[I")
    public int[] field3623;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V")
    public final void method1215(int arg0) {
        field3622++;
        if (arg0 != 14278) {
            this.field3619 = 117;
        }
        int var2 = this.field3619;
        class24 var3 = this.field3607.method192(false);
        if (var3 == null) {
            this.field3608 = 0;
            this.field3624 = 0;
            this.field3623 = null;
            this.field3612 = 0;
            this.field3619 = -1;
        } else {
            this.field3612 = var3.field617;
            this.field3608 = var3.field568 * 128;
            this.field3624 = var3.field571;
            this.field3619 = var3.field581;
            this.field3623 = var3.field584;
        }
        if (this.field3619 != var2 && this.field3615 != null) {
            class133.field3039.method509(this.field3615);
            this.field3615 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1216(int arg0, boolean arg1) {
        field3613++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class100.field2173[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (!arg1) {
            method1216(98, false);
        }
        return var2 == 1001;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public static void method1217(byte arg0) {
        field3610 = null;
        field3604 = null;
        field3621 = null;
        field3602 = null;
        field3627 = null;
        field3609 = null;
        field3606 = null;
        field3625 = null;
        field3611 = null;
        if (arg0 > -85) {
            field3626 = 127;
        }
    }
}
