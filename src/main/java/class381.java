import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class381 extends class328 {

    @OriginalMember(owner = "client!or", name = "G", descriptor = "Ljava/lang/Object;")
    private Object field5757;

    @OriginalMember(owner = "client!or", name = "H", descriptor = "Lal;")
    public static class52 field5758 = new class52(64);

    @OriginalMember(owner = "client!or", name = "S", descriptor = "Z")
    public static boolean field5767 = false;

    @OriginalMember(owner = "client!or", name = "Q", descriptor = "I")
    public static int field5765 = 0;

    @OriginalMember(owner = "client!or", name = "D", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!or", name = "E", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!or", name = "F", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!or", name = "I", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!or", name = "J", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!or", name = "K", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!or", name = "L", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!or", name = "O", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!or", name = "R", descriptor = "Lmo;")
    public static class447 field5766;

    @OriginalMember(owner = "client!or", name = "N", descriptor = "[[I")
    public static int[][] field5763;

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(BI)I")
    public static final int method2423(byte arg0, int arg1) {
        field5756++;
        return arg0 == -42 ? arg1 & 0xFF : -123;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ZI)V")
    public static final void method2424(boolean arg0, int arg1) {
        field5760++;
        if (class68.field857 == arg0) {
            return;
        }
        class68.field857 = arg0;
        if (arg1 > -76) {
            method2424(false, 5);
        }
        class345.method2254(-11424);
    }

    @OriginalMember(owner = "client!or", name = "d", descriptor = "(B)V")
    public static void method2425(byte arg0) {
        field5758 = null;
        field5766 = null;
        field5763 = null;
        if (arg0 != -73) {
            method2426(-116, 4);
        }
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(II)Ljava/lang/String;")
    public static final String method2426(int arg0, int arg1) {
        field5759++;
        return arg1 > arg0 ? Integer.toString(arg0) : "*";
    }

    @OriginalMember(owner = "client!or", name = "g", descriptor = "(I)Z")
    public final boolean method1256(int arg0) {
        if (arg0 == -2968) {
            field5761++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class381(Object arg0) {
        this.field5757 = arg0;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lmo;I)V")
    public static final void method2427(class447 arg0, int arg1) {
        class182.field2979 = arg0;
        field5754++;
        if (arg1 != 999999999) {
            field5764 = -103;
        }
        class182.field2979.method2758(35, 14535);
    }

    @OriginalMember(owner = "client!or", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1255(int arg0) {
        field5762++;
        if (arg0 != 7756) {
            method2425((byte) -93);
        }
        return this.field5757;
    }
}
