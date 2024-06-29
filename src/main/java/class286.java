import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class286 {

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public int field3569;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public int field3571;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "Ljava/lang/String;")
    public String field3574;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "Ljava/lang/String;")
    public String field3575;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "J")
    public long field3573;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "[I")
    public static int[] field3570 = new int[1];

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "Lbs;")
    public static class215 field3572 = new class215();

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3580 = null;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "[Lf;")
    public static class534[] field3578;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILhfa;III)Z", line = 3)
    public static final boolean method1663(int arg0, class465 arg1, int arg2, int arg3, int arg4) {
        field3579++;
        if (!class321.field3945) {
            return false;
        } else if (class697.field9783 < 100) {
            return false;
        } else if (class64.method349(-124, arg0, arg2, arg3)) {
            int var5 = arg0 << class559.field7984;
            int var6 = arg3 << class559.field7984;
            int var7 = class156.field1743[arg2].method1608(arg3, 840, arg0) - 1;
            int var8 = arg1.method179(3370) + var7;
            if (arg1.field6646 == 1) {
                if (!class699.method3842(var5, -24488, var5, var7, var5, var6, class171.field1904 + var6, var6, var8, var8)) {
                    return false;
                } else if (class699.method3842(var5, -24488, var5, var7, var5, class171.field1904 + var6, class171.field1904 + var6, var6, var7, var8)) {
                    class602.field8471++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg1.field6646 == 2) {
                if (!class699.method3842(var5, -24488, var5, var7, var5 + class171.field1904, var6 - -class171.field1904, var6 + class171.field1904, class171.field1904 + var6, var8, var8)) {
                    return false;
                } else if (class699.method3842(class171.field1904 + var5, arg4 ^ 0xFFFFA059, var5, var7, class171.field1904 + var5, class171.field1904 + var6, class171.field1904 + var6, class171.field1904 + var6, var8, var7)) {
                    class602.field8471++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg1.field6646 == 4) {
                if (!class699.method3842(class171.field1904 + var5, arg4 ^ 0xFFFFA059, class171.field1904 + var5, var7, var5 + class171.field1904, var6, var6 + class171.field1904, var6, var8, var8)) {
                    return false;
                } else if (class699.method3842(class171.field1904 + var5, -24488, class171.field1904 + var5, var7, var5 + class171.field1904, class171.field1904 + var6, class171.field1904 + var6, var6, var7, var8)) {
                    class602.field8471++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg1.field6646 == 8) {
                if (!class699.method3842(var5, -24488, var5, var7, var5 + class171.field1904, var6, var6, var6, var8, var8)) {
                    return false;
                } else if (class699.method3842(class171.field1904 + var5, arg4 ^ 0xFFFFA059, var5, var7, var5 + class171.field1904, var6, var6, var6, var8, var7)) {
                    class602.field8471++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg1.field6646 == 16) {
                if (class300.method1744(var8, class291.field3640 + var6, arg4 ^ 0xFFFFA640, class291.field3640, class291.field3640, var7, var5)) {
                    class602.field8471++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg1.field6646 == 32) {
                if (class300.method1744(var8, class291.field3640 + var6, -22975, class291.field3640, class291.field3640, var7, class291.field3640 + var5)) {
                    class602.field8471++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg1.field6646 != 64) {
                if (arg4 != 1) {
                    field3578 = null;
                }
                if (arg1.field6646 != 128) {
                    return true;
                } else if (class300.method1744(var8, var6, -22975, class291.field3640, class291.field3640, var7, var5)) {
                    class602.field8471++;
                    return true;
                } else {
                    return false;
                }
            } else if (class300.method1744(var8, var6, -22975, class291.field3640, class291.field3640, var7, class291.field3640 + var5)) {
                class602.field8471++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V", line = 132)
    public static void method1664(int arg0) {
        field3572 = null;
        field3578 = null;
        field3570 = null;
        if (arg0 != 25254) {
            field3578 = null;
        }
        field3580 = null;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V", line = 149)
    public class286(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field3569 = arg0;
        this.field3571 = arg2;
        this.field3574 = arg1;
        this.field3575 = arg3;
        this.field3573 = arg4;
    }
}
