import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class547 {

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public int field7718;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    private int field7721;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field7720 = -1;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Lef;")
    public static class488 field7717 = new class488();

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field7716;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field7719;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field7722;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field7723;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field7724;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)[Lafa;")
    public static final class348[] method3099(byte arg0) {
        if (arg0 >= -54) {
            method3101(11);
        }
        field7719++;
        return new class348[] { class427.field6029, class669.field9306, class535.field7257 };
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)I")
    public final int method3100(byte arg0) {
        field7716++;
        if (arg0 <= 60) {
            this.method3100((byte) -127);
        }
        return this.field7721;
    }

    @OriginalMember(owner = "client!ea", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7723++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(II)V")
    public class547(int arg0, int arg1) {
        this.field7718 = arg1;
        this.field7721 = arg0;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public static void method3101(int arg0) {
        int var1 = -3 / ((-arg0 - 64) / 62);
        field7717 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)Z")
    public static final boolean method3102(int arg0, int arg1, int arg2) {
        if (arg1 == -1) {
            field7722++;
            return (arg2 & 0x21) != 0;
        } else {
            return true;
        }
    }
}
