import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class621 {

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
    public int field8818 = 128;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
    public int field8824 = 128;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "I")
    public int field8827;

    @OriginalMember(owner = "client!qr", name = "m", descriptor = "I")
    public int field8830;

    @OriginalMember(owner = "client!qr", name = "k", descriptor = "I")
    public int field8828;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
    public int field8819;

    @OriginalMember(owner = "client!qr", name = "n", descriptor = "Lsm;")
    public static class387 field8831 = new class387("", 10);

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
    public static int field8820;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
    public int field8821;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
    public int field8822;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
    public int field8823;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
    public static int field8825;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "I")
    public int field8826;

    @OriginalMember(owner = "client!qr", name = "l", descriptor = "I")
    public int field8829;

    @OriginalMember(owner = "client!qr", name = "o", descriptor = "Ld;")
    public static class267 field8832;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lqr;Z)V", line = 4)
    public final void method3594(class621 arg0, boolean arg1) {
        this.field8828 = arg0.field8828;
        field8820++;
        this.field8819 = arg0.field8819;
        this.field8830 = arg0.field8830;
        this.field8824 = arg0.field8824;
        this.field8827 = arg0.field8827;
        if (arg1) {
            this.field8818 = arg0.field8818;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)Lqr;", line = 23)
    public final class621 method3595(int arg0) {
        field8825++;
        int var2 = 15 % ((arg0 - 26) / 40);
        return new class621(this.field8827, this.field8818, this.field8824, this.field8819, this.field8830, this.field8828);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V", line = 42)
    public static void method3596(byte arg0) {
        field8831 = null;
        field8832 = null;
        if (arg0 >= -78) {
            field8832 = null;
        }
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(I)V", line = 60)
    public class621(int arg0) {
        this.field8827 = arg0;
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(IIIIII)V", line = 71)
    private class621(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8830 = arg4;
        this.field8828 = arg5;
        this.field8818 = arg1;
        this.field8827 = arg0;
        this.field8824 = arg2;
        this.field8819 = arg3;
    }
}
