import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class84 {

    @OriginalMember(owner = "client!qw", name = "g", descriptor = "Z")
    public boolean field1107;

    @OriginalMember(owner = "client!qw", name = "h", descriptor = "[I")
    public static int[] field1108 = new int[14];

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!qw", name = "f", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!qw", name = "i", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "Lmq;")
    public class532 field1102;

    @OriginalMember(owner = "client!qw", name = "d", descriptor = "Lmq;")
    public class532 field1104;

    @OriginalMember(owner = "client!qw", name = "c", descriptor = "Lcb;")
    public static class544 field1103;

    @OriginalMember(owner = "client!qw", name = "e", descriptor = "Z")
    public boolean field1105;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(I)V", line = 7)
    public final void method608(int arg0) {
        if (this.field1104 != null) {
            this.field1104.method47((byte) -37);
        }
        field1101++;
        if (arg0 != 14) {
            method611(100);
        }
        this.field1105 = false;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(B)V", line = 23)
    public static void method609(byte arg0) {
        field1108 = null;
        field1103 = null;
        if (arg0 != -106) {
            method609((byte) 118);
        }
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(B)Z", line = 34)
    public final boolean method610(byte arg0) {
        int var2 = -77 % ((7 - arg0) / 42);
        field1106++;
        return this.field1105 && !this.field1107;
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(I)V", line = 48)
    public static final void method611(int arg0) {
        field1109++;
        if (class262.field3703 != null) {
            class262.field3703.method1648((byte) 55);
        }
        if (class405.field5708 != null) {
            class405.field5708.method1648((byte) 55);
        }
        int var1 = -70 % ((50 - arg0) / 48);
    }

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Z)V", line = 64)
    public class84(boolean arg0) {
        this.field1107 = arg0;
    }
}
