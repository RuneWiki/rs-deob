import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class570 implements class547 {

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public int field7975;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field7972;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field7973;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field7974;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    public static int field7977;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "Lf;")
    public static class536 field7976;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
    public static void method3147(byte arg0) {
        if (arg0 < 109) {
            field7976 = null;
        }
        field7976 = null;
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(I)V")
    public class570(int arg0) {
        this.field7975 = arg0;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)Z")
    public static final boolean method3148(int arg0, int arg1) {
        if (arg1 != 540800) {
            field7976 = null;
        }
        field7973++;
        return arg0 == 0 || arg0 == 1 || arg0 == 2;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)Lwea;")
    public final class259 method235(int arg0) {
        field7977++;
        if (arg0 <= 38) {
            this.field7975 = -105;
        }
        return class419.field5270;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)Z")
    public static final boolean method3149(int arg0, int arg1, int arg2) {
        if (arg2 != 14031) {
            method3148(37, -122);
        }
        field7972++;
        return (arg0 & 0x84080) != 0;
    }
}
