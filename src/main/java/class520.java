import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class520 {

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "I")
    public int field7668;

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "Lvh;")
    public static class125 field7669 = new class125(2, 4);

    @OriginalMember(owner = "client!kga", name = "j", descriptor = "I")
    public static int field7677 = 0;

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "I")
    public static int field7671;

    @OriginalMember(owner = "client!kga", name = "e", descriptor = "I")
    public static int field7672;

    @OriginalMember(owner = "client!kga", name = "f", descriptor = "I")
    public static int field7673;

    @OriginalMember(owner = "client!kga", name = "g", descriptor = "I")
    public static int field7674;

    @OriginalMember(owner = "client!kga", name = "h", descriptor = "I")
    public static int field7675;

    @OriginalMember(owner = "client!kga", name = "i", descriptor = "Llq;")
    public static class292 field7676;

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "Ltj;")
    public static class614 field7670;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(BII)Z")
    public static final boolean method3068(byte arg0, int arg1, int arg2) {
        field7672++;
        int var3 = -127 / ((arg0 + 25) / 33);
        return (arg1 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(III)I")
    public static final int method3069(int arg0, int arg1, int arg2) {
        field7671++;
        int var3 = arg1;
        while (arg0 > 0) {
            var3 = var3 << 1 | arg2 & 0x1;
            arg0--;
            arg2 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kga", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7674++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)I")
    public final int method3070(int arg0) {
        field7675++;
        if (arg0 != -21392) {
            this.toString();
        }
        return this.field7668;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(B)V")
    public static void method3071(byte arg0) {
        if (arg0 <= 61) {
            field7669 = null;
        }
        field7670 = null;
        field7676 = null;
        field7669 = null;
    }

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class520(String arg0, int arg1) {
        this.field7668 = arg1;
    }
}
