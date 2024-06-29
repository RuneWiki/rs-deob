import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public class class17 extends class49 {

    @OriginalMember(owner = "client!tia", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field100 = new String[100];

    @OriginalMember(owner = "client!tia", name = "x", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!tia", name = "z", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!tia", name = "A", descriptor = "I")
    public int field104;

    @OriginalMember(owner = "client!tia", name = "C", descriptor = "I")
    public int field105;

    @OriginalMember(owner = "client!tia", name = "D", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!tia", name = "E", descriptor = "I")
    public int field107;

    @OriginalMember(owner = "client!tia", name = "F", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!tia", name = "H", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!tia", name = "I", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!tia", name = "y", descriptor = "Ljava/lang/String;")
    public String field102;

    @OriginalMember(owner = "client!tia", name = "b", descriptor = "(B)J")
    public final long method64(byte arg0) {
        if (arg0 != -26) {
            return 82L;
        } else {
            ++field106;
            return super.field581 & Long.MAX_VALUE;
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(I)V")
    public static void method65(int arg0) {
        field100 = null;
        int var1 = -69 / ((arg0 - -55) / 62);
    }

    @OriginalMember(owner = "client!tia", name = "d", descriptor = "(B)V")
    public final void method66(byte arg0) {
        super.field581 |= Long.MIN_VALUE;
        ++field103;
        if (~this.method64((byte) -26) == -1L) {
            class695.field9695.method1139((byte) -84, this);
        }
        int var2 = -127 % ((arg0 - -44) / 56);
    }

    @OriginalMember(owner = "client!tia", name = "e", descriptor = "(B)I")
    public final int method67(byte arg0) {
        int var2 = -60 / ((arg0 - -10) / 58);
        ++field109;
        return (int) (super.field762 >>> 56 & 255L);
    }

    @OriginalMember(owner = "client!tia", name = "f", descriptor = "(B)J")
    public final long method68(byte arg0) {
        ++field110;
        return arg0 > -105 ? 87L : 72057594037927935L & super.field762;
    }

    @OriginalMember(owner = "client!tia", name = "<init>", descriptor = "(IJ)V")
    public class17(int arg0, long arg1) {
        super.field762 = (long) arg0 << 56 | arg1;
    }

    @OriginalMember(owner = "client!tia", name = "g", descriptor = "(I)V")
    public final void method69(int arg0) {
        ++field101;
        super.field581 = 500L + class683.method3903((byte) 4) | Long.MIN_VALUE & super.field581;
        class557.field7839.method1139((byte) -84, this);
        if (arg0 != 13) {
            field108 = 58;
        }
    }
}
