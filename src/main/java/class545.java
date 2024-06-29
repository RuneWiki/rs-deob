import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class545 {

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "I")
    public int field7593 = 128;

    @OriginalMember(owner = "client!kga", name = "h", descriptor = "I")
    public int field7598 = 128;

    @OriginalMember(owner = "client!kga", name = "f", descriptor = "I")
    public int field7596;

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "I")
    public int field7594;

    @OriginalMember(owner = "client!kga", name = "l", descriptor = "I")
    public int field7602;

    @OriginalMember(owner = "client!kga", name = "k", descriptor = "I")
    public int field7601;

    @OriginalMember(owner = "client!kga", name = "g", descriptor = "I")
    public static int field7597 = 0;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "I")
    public static int field7591;

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "I")
    public static int field7592;

    @OriginalMember(owner = "client!kga", name = "e", descriptor = "I")
    public static int field7595;

    @OriginalMember(owner = "client!kga", name = "i", descriptor = "I")
    public static int field7599;

    @OriginalMember(owner = "client!kga", name = "j", descriptor = "I")
    public static int field7600;

    @OriginalMember(owner = "client!kga", name = "m", descriptor = "I")
    public static int field7603;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IILjb;I)V")
    public static final void method3156(int arg0, int arg1, class493 arg2, int arg3) {
        field7592++;
        class515.field7339 = arg2;
        class124.field1500 = arg0;
        class405.field5736 = arg1;
        if (arg3 != 0) {
            field7597 = 48;
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "([BIB)[B")
    public static final byte[] method3157(byte[] arg0, int arg1, byte arg2) {
        field7595++;
        if (arg2 < 123) {
            method3157(null, -116, (byte) 17);
        }
        byte[] var3 = new byte[arg1];
        class255.method1690(arg0, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(BLkga;)V")
    public final void method3158(byte arg0, class545 arg1) {
        int var3 = 26 % ((arg0 + 57) / 62);
        this.field7593 = arg1.field7593;
        this.field7594 = arg1.field7594;
        this.field7596 = arg1.field7596;
        this.field7602 = arg1.field7602;
        field7599++;
        this.field7601 = arg1.field7601;
        this.field7598 = arg1.field7598;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(B)Lkga;")
    public final class545 method3159(byte arg0) {
        int var2 = 91 / ((-arg0 - 29) / 43);
        field7603++;
        return new class545(this.field7596, this.field7598, this.field7593, this.field7594, this.field7602, this.field7601);
    }

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(I)V")
    public class545(int arg0) {
        this.field7596 = arg0;
    }

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(IIIIII)V")
    private class545(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7594 = arg3;
        this.field7596 = arg0;
        this.field7598 = arg1;
        this.field7602 = arg4;
        this.field7601 = arg5;
        this.field7593 = arg2;
    }
}
