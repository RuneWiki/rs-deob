import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class546 extends class108 {

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public int field7595;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public int field7587;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "Lbv;")
    public static class567 field7591 = new class567("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public static int field7586;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    public static int field7588;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public static int field7590;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field7592;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public static int field7593;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field7594;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)I")
    public final int method3051(byte arg0) {
        if (arg0 != -70) {
            field7593 = -7;
        }
        field7592++;
        return class323.method2007(this.field7595, 177185355);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)I")
    public final int method3052(int arg0) {
        if (arg0 != -1707416750) {
            field7591 = null;
        }
        field7589++;
        return (this.field7595 & 0x1D89E4) >> 18;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)Z")
    public final boolean method3053(byte arg0) {
        field7590++;
        if (arg0 > -112) {
            method3055(-18);
        }
        return ((this.field7595 & 0x596422) >> 22) != 0;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)Z")
    public final boolean method3054(int arg0) {
        int var2 = 118 / ((-arg0 - 63) / 38);
        field7594++;
        return (this.field7595 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
    public static void method3055(int arg0) {
        int var1 = 74 % ((arg0 + 5) / 34);
        field7591 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)Z")
    public final boolean method3056(int arg0, int arg1) {
        field7588++;
        if (arg1 == 1) {
            return (this.field7595 >> arg0 + 1 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(II)V")
    public class546(int arg0, int arg1) {
        this.field7595 = arg0;
        this.field7587 = arg1;
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "(I)Z")
    public final boolean method3057(int arg0) {
        field7586++;
        if (arg0 == 6466) {
            return (this.field7595 & 0x1) != 0;
        } else {
            return true;
        }
    }
}
