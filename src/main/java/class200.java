import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class200 extends class222 {

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
    public int field3626;

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
    public int field3646;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "Lcf;")
    public static class93 field3625 = class147.method1066(")1 ", -48);

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "Lcf;")
    public static class93 field3630 = class147.method1066("Chargement de RuneScape en cours )2 veuillez patienter)3)3)3", -48);

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "Lcf;")
    private static class93 field3637 = class147.method1066("Loaded input handler", -48);

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "Lcf;")
    public static class93 field3638 = class147.method1066("Examiner", -48);

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "Lcf;")
    private static class93 field3632 = class147.method1066("Loading )2 please wait)3", -48);

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "Lcf;")
    public static class93 field3636 = class147.method1066(" ", -48);

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "Lcf;")
    private static class93 field3634 = class147.method1066("Please wait)3)3)3", -48);

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "Lcf;")
    public static class93 field3640 = class147.method1066("Utiliser", -48);

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "Lcf;")
    public static class93 field3642 = class147.method1066("Lade Sprites )2 ", -48);

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "Lcf;")
    public static class93 field3635 = field3632;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "Lcf;")
    public static class93 field3633 = class147.method1066("::", -48);

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "Lcf;")
    public static class93 field3621 = field3637;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "Lcf;")
    public static class93 field3624 = field3634;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "Lcf;")
    public static class93 field3643 = class147.method1066(":clanreq:", -48);

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "[I")
    public static int[] field3627;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "[[[I")
    public static int[][][] field3620;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)I")
    public final int method1430(int arg0) {
        if (arg0 <= 119) {
            this.method1439(-122);
        }
        field3628++;
        return class205.method1453(this.field3646, 127);
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(B)Z")
    public final boolean method1431(byte arg0) {
        field3619++;
        if (arg0 == 106) {
            return ((this.field3646 & 0x3D3A2474) >> 29) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)Z")
    public final boolean method1432(int arg0) {
        field3629++;
        if (arg0 != 1) {
            method1436(99, -113, (byte[]) null, 43);
        }
        return (this.field3646 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)Z")
    public final boolean method1433(int arg0) {
        field3641++;
        if (arg0 != -28199) {
            this.method1438(18);
        }
        return (this.field3646 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)I")
    public final int method1434(boolean arg0) {
        if (!arg0) {
            field3643 = null;
        }
        field3623++;
        return (this.field3646 & 0x1E109B) >> 18;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(Z)Z")
    public final boolean method1435(boolean arg0) {
        if (arg0) {
            this.method1433(-48);
        }
        field3639++;
        return ((this.field3646 & 0x18F87225) >> 28) != 0;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II[BI)I")
    public static final int method1436(int arg0, int arg1, byte[] arg2, int arg3) {
        field3622++;
        if (arg1 != 20920) {
            method1437(44);
        }
        int var4 = -1;
        for (int var5 = arg3; var5 < arg0; var5++) {
            var4 = var4 >>> 8 ^ class58.field988[(var4 ^ arg2[var5]) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)V")
    public static void method1437(int arg0) {
        field3638 = null;
        field3637 = null;
        if (arg0 != 27513) {
            return;
        }
        field3625 = null;
        field3642 = null;
        field3620 = null;
        field3634 = null;
        field3627 = null;
        field3633 = null;
        field3624 = null;
        field3640 = null;
        field3643 = null;
        field3630 = null;
        field3635 = null;
        field3621 = null;
        field3636 = null;
        field3632 = null;
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)Z")
    public final boolean method1438(int arg0) {
        field3631++;
        if (arg0 <= 101) {
            field3632 = null;
        }
        return (this.field3646 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "(I)Z")
    public final boolean method1439(int arg0) {
        if (arg0 != 1) {
            this.method1439(109);
        }
        field3644++;
        return (this.field3646 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)Z")
    public final boolean method1440(int arg0, int arg1) {
        if (arg0 > -39) {
            this.method1430(-124);
        }
        field3618++;
        return (this.field3646 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "(I)Z")
    public final boolean method1441(int arg0) {
        field3645++;
        if (arg0 != -1500906954) {
            field3635 = null;
        }
        return (this.field3646 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(II)V")
    public class200(int arg0, int arg1) {
        this.field3626 = arg1;
        this.field3646 = arg0;
    }
}
