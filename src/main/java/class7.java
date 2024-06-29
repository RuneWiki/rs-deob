import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class7 extends class26 {

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    public int field67;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "Ljava/lang/String;")
    public static String field65 = "Loading interfaces - ";

    @OriginalMember(owner = "client!v", name = "s", descriptor = "[I")
    public static int[] field68 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!v", name = "o", descriptor = "[I")
    public static int[] field64 = new int[2];

    @OriginalMember(owner = "client!v", name = "w", descriptor = "J")
    public static long field72 = 0L;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "[[Lih;")
    public static class70[][] field66;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V", line = 6)
    public static final void method38(int arg0) {
        class182.field2482.method2262(false);
        class142.field1982.method2262(false);
        field69++;
        if (arg0 != 18786) {
            field72 = 81L;
        }
        class103.field1335.method2262(false);
        class253.field3698.method2262(false);
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V", line = 21)
    public static void method39(int arg0) {
        field65 = null;
        field68 = null;
        field66 = (class70[][]) null;
        field64 = null;
        if (arg0 != 0) {
            method38(113);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BLwf;)Z", line = 50)
    public static final boolean method40(byte arg0, class333 arg1) {
        if (arg0 != -101) {
            method40((byte) 8, (class333) null);
        }
        field70++;
        if (arg1.field5084 == 205) {
            class16.field195 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V", line = 69)
    public class7() {
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(I)V", line = 76)
    public class7(int arg0) {
        this.field67 = arg0;
    }
}
