import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public class class504 {

    @OriginalMember(owner = "client!lia", name = "l", descriptor = "I")
    private int field7132;

    @OriginalMember(owner = "client!lia", name = "k", descriptor = "I")
    public int field7131;

    @OriginalMember(owner = "client!lia", name = "f", descriptor = "Ldw;")
    private class748 field7126;

    @OriginalMember(owner = "client!lia", name = "d", descriptor = "I")
    public int field7124;

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "Llia;")
    public static class504 field7122 = new class504(0, 3, class748.field10388);

    @OriginalMember(owner = "client!lia", name = "e", descriptor = "Llia;")
    public static class504 field7125 = new class504(1, 3, class748.field10388);

    @OriginalMember(owner = "client!lia", name = "i", descriptor = "Llia;")
    public static class504 field7129 = new class504(2, 4, class748.field10384);

    @OriginalMember(owner = "client!lia", name = "m", descriptor = "Llia;")
    public static class504 field7133 = new class504(3, 1, class748.field10388);

    @OriginalMember(owner = "client!lia", name = "n", descriptor = "Llia;")
    public static class504 field7134 = new class504(4, 2, class748.field10388);

    @OriginalMember(owner = "client!lia", name = "o", descriptor = "Llia;")
    public static class504 field7135 = new class504(5, 3, class748.field10388);

    @OriginalMember(owner = "client!lia", name = "p", descriptor = "Llia;")
    public static class504 field7136 = new class504(6, 4, class748.field10388);

    @OriginalMember(owner = "client!lia", name = "q", descriptor = "I")
    public static int field7137 = class391.method2293((byte) 125, 16);

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "I")
    public static int field7121;

    @OriginalMember(owner = "client!lia", name = "c", descriptor = "I")
    public static int field7123;

    @OriginalMember(owner = "client!lia", name = "g", descriptor = "I")
    public static int field7127;

    @OriginalMember(owner = "client!lia", name = "h", descriptor = "I")
    public static int field7128;

    @OriginalMember(owner = "client!lia", name = "j", descriptor = "I")
    public static int field7130;

    @OriginalMember(owner = "client!lia", name = "r", descriptor = "Loga;")
    public static class500 field7138;

    @OriginalMember(owner = "client!lia", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field7128++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(IBI)Z", line = 13)
    public static final boolean method3022(int arg0, byte arg1, int arg2) {
        if (arg1 != -34) {
            field7136 = null;
        }
        field7127++;
        return (arg2 & 0x100100) != 0;
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(II)V", line = 34)
    public static final void method3023(int arg0, int arg1) {
        field7123++;
        class714 var2 = class350.method2072((long) arg1, 1, (byte) 123);
        if (arg0 < -27) {
            var2.method4044((byte) -128);
        }
    }

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "(IBI)Z", line = 51)
    public static final boolean method3024(int arg0, byte arg1, int arg2) {
        if (arg1 < 45) {
            return false;
        } else {
            field7130++;
            return class68.method674(arg2, arg0, 16) & class50.method464(arg2, -123, arg0);
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(Z)V", line = 66)
    public static void method3025(boolean arg0) {
        field7134 = null;
        field7138 = null;
        field7122 = null;
        if (arg0) {
            method3026(-46, -119);
        }
        field7136 = null;
        field7133 = null;
        field7129 = null;
        field7125 = null;
        field7135 = null;
    }

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "(II)Llia;", line = 87)
    public static final class504 method3026(int arg0, int arg1) {
        field7121++;
        if (arg0 != -15281) {
            field7137 = 82;
        }
        if (arg1 == 0) {
            return field7122;
        } else if (arg1 == 1) {
            return field7125;
        } else if (arg1 == 2) {
            return field7129;
        } else if (arg1 == 3) {
            return field7133;
        } else if (arg1 == 4) {
            return field7134;
        } else if (arg1 == 5) {
            return field7135;
        } else if (arg1 == 6) {
            return field7136;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(IILdw;)V", line = 160)
    private class504(int arg0, int arg1, class748 arg2) {
        this.field7132 = arg1;
        this.field7131 = arg0;
        this.field7126 = arg2;
        this.field7124 = this.field7126.field10374 * this.field7132;
        if (this.field7131 >= 16) {
            throw new RuntimeException();
        }
    }
}
