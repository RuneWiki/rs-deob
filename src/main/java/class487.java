import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class487 {

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public int field6684;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    private int field6689;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field6685 = 2;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field6691 = 0;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "Lem;")
    public static class206 field6690 = new class206(16, 2);

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field6692 = 0;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field6683;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field6686;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public static int field6687;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field6688;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BILls;)V", line = 4)
    public static final void method2765(byte arg0, int arg1, class124 arg2) {
        if (arg2.field1735 != null) {
            int var3 = arg2.field1735[arg1 + 1];
            if (arg2.field1779 != var3) {
                arg2.field1739 = 0;
                arg2.field1722 = 0;
                arg2.field1802 = arg2.field1797;
                arg2.field1779 = var3;
                arg2.field1784 = 1;
                arg2.field1766 = 0;
                if (arg2.field1779 != -1) {
                    class234.method1476(arg2, class192.field2727.method3090(-94, arg2.field1779), arg2.field1739, (byte) 125);
                }
            }
        }
        if (arg0 > -59) {
            field6690 = null;
        }
        field6687++;
    }

    @OriginalMember(owner = "client!lh", name = "toString", descriptor = "()Ljava/lang/String;", line = 38)
    public final String toString() {
        field6686++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)I", line = 46)
    public final int method2766(int arg0) {
        field6683++;
        if (arg0 != 0) {
            method2768((byte) 27, 121, 52);
        }
        return this.field6689;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V", line = 58)
    public static void method2767(byte arg0) {
        if (arg0 == -116) {
            field6690 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BII)Z", line = 76)
    public static final boolean method2768(byte arg0, int arg1, int arg2) {
        field6688++;
        if (arg0 < 115) {
            return false;
        } else {
            return class213.method1373(arg1, arg2, false) || class66.method559(arg1, arg2, false);
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(II)V", line = 89)
    public class487(int arg0, int arg1) {
        this.field6684 = arg1;
        this.field6689 = arg0;
    }
}
