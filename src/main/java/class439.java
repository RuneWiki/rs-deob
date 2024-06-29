import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class439 {

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public int field6535;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "I")
    public int field6546;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "Lil;")
    public class439 field6534;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "Lia;")
    public class23 field6548;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "[Lbp;")
    public static class322[] field6539 = new class322[2048];

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public static int field6542 = 0;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "Ljb;")
    public static class499 field6543 = null;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field6536;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public int field6537;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public static int field6540;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public int field6541;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public static int field6544;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public int field6545;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "[Lf;")
    public static class191[] field6538;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V", line = 9)
    public static final void method2655(boolean arg0) {
        if (arg0) {
            class380.field5802 = class483.field7028;
            class455.field6683 = class187.field2632;
        } else {
            class380.field5802 = class492.field7181;
            class455.field6683 = class204.field2871;
        }
        class222.field3107 = class380.field5802.length;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)Lmb;", line = 24)
    public final class285 method2656(int arg0) {
        field6544++;
        if (arg0 != -4549) {
            field6539 = null;
        }
        return class512.method3051(114, this.field6546);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BIIII)V", line = 51)
    public static final void method2657(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= -26) {
            return;
        }
        class443.field6591 = arg2;
        class396.field6021 = arg4;
        class410.field6176 = arg3;
        field6540++;
        class158.field2302 = arg1;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V", line = 68)
    public static void method2658(int arg0) {
        if (arg0 < 0) {
            field6542 = 103;
        }
        field6539 = null;
        field6543 = null;
        field6538 = null;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(II)V", line = 80)
    public class439(int arg0, int arg1) {
        this.field6535 = arg1;
        this.field6546 = arg0;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)Lil;", line = 89)
    public final class439 method2659(int arg0, int arg1) {
        field6547++;
        int var3 = -99 / ((-arg1 - 11) / 42);
        return new class439(this.field6546, arg0);
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lil;I)V", line = 98)
    public class439(class439 arg0, int arg1) {
        this.field6534 = arg0;
        this.field6535 = this.field6534.field6535 + arg1;
        this.field6548 = this.field6534.field6548;
        this.field6546 = this.field6534.field6546;
    }
}
