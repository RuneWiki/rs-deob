import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class698 extends class154 {

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public int field9641;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public int field9638;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field9637 = 0;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field9634;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public static int field9635;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public static int field9636;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public static int field9639;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field9640;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    public static int field9642;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "Lfja;")
    public static class783 field9643;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V", line = 5)
    public static void method3883(byte arg0) {
        if (arg0 > 115) {
            field9643 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)Z", line = 15)
    public final boolean method3884(int arg0) {
        int var2 = 99 % ((arg0 + 54) / 63);
        field9636++;
        return (this.field9638 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)I", line = 25)
    public final int method3885(int arg0) {
        if (arg0 <= 125) {
            this.method3888(false);
        }
        field9640++;
        return this.field9638 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)Z", line = 38)
    public final boolean method3886(int arg0) {
        if (arg0 != 27470) {
            this.method3885(29);
        }
        field9635++;
        return (this.field9638 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)Z", line = 49)
    public final boolean method3887(int arg0, int arg1) {
        if (arg1 != 8616) {
            this.method3885(-123);
        }
        field9642++;
        return (this.field9638 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)Z", line = 61)
    public final boolean method3888(boolean arg0) {
        field9639++;
        if (arg0) {
            this.field9638 = -72;
        }
        return (this.field9638 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(Z)I", line = 77)
    public final int method3889(boolean arg0) {
        if (!arg0) {
            this.method3884(34);
        }
        field9634++;
        return class372.method2260((byte) -21, this.field9638);
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(II)V", line = 91)
    public class698(int arg0, int arg1) {
        this.field9641 = arg1;
        this.field9638 = arg0;
    }
}
