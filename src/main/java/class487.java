import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class487 {

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "Z")
    public boolean field7138 = false;

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "I")
    public int field7137 = 43594;

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
    public int field7136 = 443;

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "Lfr;")
    public static class231 field7140 = new class231(64);

    @OriginalMember(owner = "client!bq", name = "k", descriptor = "Lnk;")
    public static class326 field7141 = new class326(65, -1);

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
    public static int field7131;

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "I")
    public static int field7134;

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
    public static int field7135;

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "I")
    public int field7139;

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "Lqs;")
    public static class496 field7132;

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "Ljava/lang/String;")
    public String field7133;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)I", line = 8)
    public final int method2847(int arg0) {
        field7134++;
        if (this.field7138) {
            return this.field7136;
        } else if (arg0 == 13101) {
            return this.field7137;
        } else {
            return -84;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIB)Z", line = 24)
    public static final boolean method2848(int arg0, int arg1, byte arg2) {
        if (arg2 > -111) {
            return false;
        } else {
            field7135++;
            return class440.method2655(5712, arg1, arg0) | (arg0 & 0x60000) != 0 || class206.method1354(-2, arg1, arg0) || class412.method2552(arg0, arg1, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(ZLbq;)Z", line = 46)
    public final boolean method2849(boolean arg0, class487 arg1) {
        if (arg0) {
            return true;
        }
        field7131++;
        if (arg1 == null) {
            return false;
        } else {
            return this.field7139 == arg1.field7139 && this.field7133.equals(arg1.field7133);
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)V", line = 70)
    public static void method2850(byte arg0) {
        if (arg0 < 18) {
            field7141 = null;
        }
        field7140 = null;
        field7141 = null;
        field7132 = null;
    }
}
