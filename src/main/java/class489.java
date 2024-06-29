import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class489 extends class272 {

    @OriginalMember(owner = "client!lr", name = "y", descriptor = "Lku;")
    public static class232 field6886 = new class232(8);

    @OriginalMember(owner = "client!lr", name = "H", descriptor = "Ljava/lang/String;")
    public static String field6894 = null;

    @OriginalMember(owner = "client!lr", name = "x", descriptor = "I")
    public static int field6885;

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "I")
    public static int field6887;

    @OriginalMember(owner = "client!lr", name = "A", descriptor = "I")
    public static int field6888;

    @OriginalMember(owner = "client!lr", name = "C", descriptor = "I")
    public static int field6889;

    @OriginalMember(owner = "client!lr", name = "D", descriptor = "I")
    public int field6890;

    @OriginalMember(owner = "client!lr", name = "E", descriptor = "I")
    public static int field6891;

    @OriginalMember(owner = "client!lr", name = "F", descriptor = "I")
    public int field6892;

    @OriginalMember(owner = "client!lr", name = "I", descriptor = "I")
    public int field6895;

    @OriginalMember(owner = "client!lr", name = "G", descriptor = "Ljava/lang/String;")
    public String field6893;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)V")
    public final void method2861(int arg0) {
        super.field3960 = super.field3960 & Long.MIN_VALUE | class433.method2562(arg0 ^ 229012969) + 500L;
        if (arg0 != -229012000) {
            this.method2863(40);
        }
        ++field6889;
        class141.field1881.method1553(-99, this);
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "(B)V")
    public static void method2862(byte arg0) {
        if (arg0 == 9) {
            field6886 = null;
            field6894 = null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)V")
    public final void method2863(int arg0) {
        super.field3960 |= Long.MIN_VALUE;
        if (arg0 != 255) {
            this.field6890 = -90;
        }
        ++field6891;
        if (~this.method2865((byte) 10) == -1L) {
            class96.field1231.method1553(-102, this);
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(Z)I")
    public final int method2864(boolean arg0) {
        if (arg0) {
            this.method2865((byte) 119);
        }
        ++field6887;
        return (int) (super.field3568 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "(B)J")
    public final long method2865(byte arg0) {
        ++field6888;
        int var2 = -66 % ((arg0 - -38) / 42);
        return super.field3960 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)I")
    public final int method2866(int arg0) {
        ++field6885;
        if (arg0 != 255) {
            this.field6895 = -54;
        }
        return (int) super.field3568;
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(II)V")
    public class489(int arg0, int arg1) {
        super.field3568 = (long) arg0 << 32 | (long) arg1;
    }
}
