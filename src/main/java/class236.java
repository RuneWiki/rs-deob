import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class236 extends class623 {

    @OriginalMember(owner = "client!jea", name = "A", descriptor = "I")
    public static int field3049 = 999999;

    @OriginalMember(owner = "client!jea", name = "I", descriptor = "J")
    public static long field3056 = 20000000L;

    @OriginalMember(owner = "client!jea", name = "s", descriptor = "I")
    public int field3041;

    @OriginalMember(owner = "client!jea", name = "v", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!jea", name = "w", descriptor = "I")
    public int field3045;

    @OriginalMember(owner = "client!jea", name = "y", descriptor = "I")
    public int field3047;

    @OriginalMember(owner = "client!jea", name = "C", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!jea", name = "D", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!jea", name = "G", descriptor = "I")
    public int field3054;

    @OriginalMember(owner = "client!jea", name = "H", descriptor = "Lof;")
    public static class456 field3055;

    @OriginalMember(owner = "client!jea", name = "x", descriptor = "Lnha;")
    public class501 field3046;

    @OriginalMember(owner = "client!jea", name = "t", descriptor = "Ljava/lang/String;")
    public String field3042;

    @OriginalMember(owner = "client!jea", name = "z", descriptor = "[I")
    public int[] field3048;

    @OriginalMember(owner = "client!jea", name = "E", descriptor = "[I")
    public int[] field3052;

    @OriginalMember(owner = "client!jea", name = "F", descriptor = "[Lsga;")
    public class583[] field3053;

    @OriginalMember(owner = "client!jea", name = "u", descriptor = "[Ljava/lang/String;")
    public String[] field3043;

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)V", line = 6)
    public static final void method1478(int arg0) {
        if (arg0 != 2) {
            field3055 = null;
        }
        field3051++;
        class491.field6967.method776((byte) -110);
    }

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "(I)I", line = 21)
    public static final int method1479(int arg0) {
        field3050++;
        if (class447.field6289 == null) {
            return 0;
        } else {
            if (arg0 > -58) {
                method1479(103);
            }
            return class447.field6289.length * 2;
        }
    }

    @OriginalMember(owner = "client!jea", name = "e", descriptor = "(I)V", line = 37)
    public static void method1480(int arg0) {
        field3055 = null;
        if (arg0 != -11856) {
            field3055 = null;
        }
    }
}
