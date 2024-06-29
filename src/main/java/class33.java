import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class33 extends class130 {

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    public int field602 = 0;

    @OriginalMember(owner = "client!dd", name = "X", descriptor = "[I")
    public int[] field626 = new int[5];

    @OriginalMember(owner = "client!dd", name = "Y", descriptor = "[Lac;")
    public class4[] field627 = new class4[5];

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public int field607;

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "I")
    public int field623;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public int field611;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "I")
    public int field617;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "Lsd;")
    public static class166 field597 = class135.method935("Registrierter Benutzer", 0);

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "Lsd;")
    public static class166 field620 = class135.method935("(U2", 0);

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "Lmc;")
    public static class111 field598 = new class111();

    @OriginalMember(owner = "client!dd", name = "W", descriptor = "Lsd;")
    public static class166 field625 = class135.method935("(U", 0);

    @OriginalMember(owner = "client!dd", name = "Z", descriptor = "Lsd;")
    public static class166 field628 = class135.method935("Gegenstand f-Ur Mitglieder", 0);

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
    public int field603;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    public int field608;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
    public int field612;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
    public int field613;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public int field614;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "I")
    public int field621;

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "Llg;")
    public class106 field622;

    @OriginalMember(owner = "client!dd", name = "V", descriptor = "Lne;")
    public class122 field624;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "Lth;")
    public class179 field604;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "Lw;")
    public class198 field615;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "Ldd;")
    public class33 field600;

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "Lhe;")
    public class69 field619;

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "Lhh;")
    public class72 field618;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "Z")
    public boolean field606;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "Z")
    public boolean field609;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "Z")
    public boolean field610;

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(III)V")
    public class33(int arg0, int arg1, int arg2) {
        this.field607 = arg2;
        this.field611 = this.field623 = arg0;
        this.field617 = arg1;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
    public static void method241(boolean arg0) {
        field625 = null;
        if (arg0) {
            field597 = null;
            field628 = null;
            field620 = null;
            field598 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lff;I)Lsd;")
    public static final class166 method242(class53 arg0, int arg1) {
        field599++;
        return arg1 == 32767 ? class86.method688((byte) 116, arg0, 32767) : null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIBI)V")
    public static final void method243(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 72) {
            field625 = null;
        }
        class193 var4 = class121.method875(arg3, arg0, 116);
        field616++;
        if (var4 != null && var4.field3725 != null) {
            class137 var5 = new class137();
            var5.field2668 = var4.field3725;
            var5.field2673 = var4;
            class166.method1126((byte) -113, var5);
        }
        class49.field911 = arg1;
        class179.field3393 = true;
        class127.field2497 = arg3;
        class125.field2455 = arg0;
        class68.method550(var4, 15);
    }
}
