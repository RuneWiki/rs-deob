import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public class class762 {

    @OriginalMember(owner = "client!wia", name = "k", descriptor = "I")
    public int field10618 = 128;

    @OriginalMember(owner = "client!wia", name = "q", descriptor = "I")
    public int field10624 = 128;

    @OriginalMember(owner = "client!wia", name = "c", descriptor = "I")
    public int field10610;

    @OriginalMember(owner = "client!wia", name = "s", descriptor = "I")
    public int field10626;

    @OriginalMember(owner = "client!wia", name = "p", descriptor = "I")
    public int field10623;

    @OriginalMember(owner = "client!wia", name = "m", descriptor = "I")
    public int field10620;

    @OriginalMember(owner = "client!wia", name = "f", descriptor = "Z")
    public static volatile boolean field10613 = false;

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "I")
    public int field10608;

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "I")
    public int field10609;

    @OriginalMember(owner = "client!wia", name = "d", descriptor = "I")
    public static int field10611;

    @OriginalMember(owner = "client!wia", name = "e", descriptor = "I")
    public int field10612;

    @OriginalMember(owner = "client!wia", name = "g", descriptor = "I")
    public static int field10614;

    @OriginalMember(owner = "client!wia", name = "h", descriptor = "I")
    public static int field10615;

    @OriginalMember(owner = "client!wia", name = "i", descriptor = "I")
    public static int field10616;

    @OriginalMember(owner = "client!wia", name = "j", descriptor = "I")
    public static int field10617;

    @OriginalMember(owner = "client!wia", name = "l", descriptor = "I")
    public int field10619;

    @OriginalMember(owner = "client!wia", name = "n", descriptor = "I")
    public int field10621;

    @OriginalMember(owner = "client!wia", name = "o", descriptor = "I")
    public static int field10622;

    @OriginalMember(owner = "client!wia", name = "r", descriptor = "[I")
    public static int[] field10625;

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(Z)V")
    public static void method4236(boolean arg0) {
        field10625 = null;
        if (arg0) {
            field10613 = false;
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(III)Z")
    public static final boolean method4237(int arg0, int arg1, int arg2) {
        if (arg0 != 24428) {
            method4238(-108);
        }
        field10614++;
        return class506.method2843((byte) 113, arg2, arg1) || class548.method3062(arg2, 55, arg1);
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(I)V")
    public static final void method4238(int arg0) {
        if (arg0 > -117) {
            method4237(90, 111, -50);
        }
        class26.method249(false, (byte) -127);
        field10611++;
        if (class734.field10156 >= 0 && class734.field10156 != 0) {
            class421.method2435(false, -70, class734.field10156);
            class734.field10156 = -1;
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(B)Lwia;")
    public final class762 method4239(byte arg0) {
        if (arg0 >= -10) {
            return null;
        } else {
            field10615++;
            return new class762(this.field10610, this.field10624, this.field10618, this.field10626, this.field10623, this.field10620);
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(ILwia;)V")
    public final void method4240(int arg0, class762 arg1) {
        this.field10624 = arg1.field10624;
        field10622++;
        this.field10610 = arg1.field10610;
        this.field10623 = arg1.field10623;
        this.field10618 = arg1.field10618;
        int var3 = -3 % ((arg0 - 39) / 45);
        this.field10620 = arg1.field10620;
        this.field10626 = arg1.field10626;
    }

    @OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(I)V")
    public class762(int arg0) {
        this.field10610 = arg0;
    }

    @OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(IIIIII)V")
    private class762(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field10610 = arg0;
        this.field10618 = arg2;
        this.field10624 = arg1;
        this.field10626 = arg3;
        this.field10623 = arg4;
        this.field10620 = arg5;
    }
}
