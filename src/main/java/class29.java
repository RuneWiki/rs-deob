import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class29 {

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public int field633 = -1;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "[Lca;")
    public static class23[] field632 = new class23[5000];

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "Lvd;")
    public static class222 field638 = class212.method1357("(U2", 10731);

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "Lvd;")
    private static class222 field637 = class212.method1357("Error loading your profile)3", 10731);

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "Lvd;")
    public static class222 field640 = field637;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "Lvd;")
    private static class222 field644 = class212.method1357("Loading )2 please wait)3", 10731);

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "Lvd;")
    public static class222 field642 = field644;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "Lcf;")
    public static class28 field639 = new class28();

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "Lvd;")
    public static class222 field645 = class212.method1357("titlebutton", 10731);

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "Lvd;")
    public static class222 field646 = class212.method1357("", 10731);

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Luh;")
    public class216 field636;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "[I")
    public int[] field643;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "[Lvd;")
    public class222[] field641;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
    public static void method248(byte arg0) {
        field638 = null;
        field642 = null;
        field639 = null;
        field646 = null;
        field645 = null;
        field644 = null;
        if (arg0 >= -102) {
            method248((byte) -41);
        }
        field637 = null;
        field640 = null;
        field632 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BIILvd;I)V")
    public static final void method249(byte arg0, int arg1, int arg2, class222 arg3, int arg4) {
        field635++;
        class13 var5 = class197.method1215(arg4, arg2, -105);
        if (var5 == null) {
            return;
        }
        if (var5.field366 != null) {
            class191 var6 = new class191();
            var6.field3521 = var5;
            var6.field3516 = arg3;
            var6.field3510 = var5.field366;
            var6.field3522 = arg1;
            class52.method373(-32560, var6);
        }
        boolean var7 = true;
        if (var5.field348 > 0) {
            var7 = class69.method469(250, var5);
        }
        if (!var7 || !class16.method142(arg1 - 1, class221.method1405(var5, (byte) -106), (byte) 18)) {
            return;
        }
        if (arg1 == 1) {
            class59.field1100++;
            class42.field895.method1347((byte) -64, 148);
            class42.field895.method684(arg4, -26);
            class42.field895.method672(-279704376, arg2);
        }
        if (arg1 == 2) {
            class47.field955++;
            class42.field895.method1347((byte) -121, 45);
            class42.field895.method684(arg4, -102);
            class42.field895.method672(-279704376, arg2);
        }
        if (arg1 == 3) {
            class44.field918++;
            class42.field895.method1347((byte) -95, 189);
            class42.field895.method684(arg4, -89);
            class42.field895.method672(-279704376, arg2);
        }
        if (arg1 == 4) {
            class42.field895.method1347((byte) -110, 149);
            class42.field895.method684(arg4, 124);
            class42.field895.method672(-279704376, arg2);
            class95.field1782++;
        }
        if (arg1 == 5) {
            class52.field987++;
            class42.field895.method1347((byte) -88, 191);
            class42.field895.method684(arg4, 86);
            class42.field895.method672(-279704376, arg2);
        }
        if (arg1 == 6) {
            class42.field895.method1347((byte) -80, 64);
            class225.field4210++;
            class42.field895.method684(arg4, -29);
            class42.field895.method672(-279704376, arg2);
        }
        if (arg1 == 7) {
            class42.field895.method1347((byte) -61, 228);
            class140.field2694++;
            class42.field895.method684(arg4, -112);
            class42.field895.method672(-279704376, arg2);
        }
        if (arg0 >= -3) {
            return;
        }
        if (arg1 == 8) {
            class188.field3481++;
            class42.field895.method1347((byte) -64, 151);
            class42.field895.method684(arg4, 65);
            class42.field895.method672(-279704376, arg2);
        }
        if (arg1 == 9) {
            class92.field1727++;
            class42.field895.method1347((byte) -81, 216);
            class42.field895.method684(arg4, 60);
            class42.field895.method672(-279704376, arg2);
        }
        if (arg1 == 10) {
            class42.field895.method1347((byte) -90, 138);
            class201.field3671++;
            class42.field895.method684(arg4, -114);
            class42.field895.method672(-279704376, arg2);
        }
    }
}
