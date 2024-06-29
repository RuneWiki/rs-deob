import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class247 implements class276 {

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field3683 = 0;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3685 = " has logged in.";

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field3687 = 0;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "[Lea;")
    public static class235[] field3679;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "[Led;")
    public static class311[] field3686;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V", line = 5)
    public static void method1665(byte arg0) {
        field3686 = null;
        field3685 = null;
        field3679 = null;
        if (arg0 <= 115) {
            field3683 = 42;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lf;I)V", line = 22)
    public static final void method1666(class329 arg0, int arg1) {
        if (arg1 > -123) {
            field3685 = (String) null;
        }
        field3684++;
        if (class140.field2113 == arg0.field5014) {
            class22.field298[arg0.field4945] = true;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BII)Lnf;", line = 39)
    public static final class251 method1667(byte arg0, int arg1, int arg2) {
        field3681++;
        class251 var3 = new class251();
        if (arg0 <= 115) {
            return (class251) null;
        }
        for (class61 var4 = (class61) class211.field3208.method1109(-100); var4 != null; var4 = (class61) class211.field3208.method1115((byte) 60)) {
            if (var4.field803 && var4.method406(0, arg2, arg1)) {
                var3.method1697(34, var4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)V", line = 63)
    public static final void method1668(int arg0, int arg1) {
        field3680++;
        if (arg1 <= arg0 && class301.field4601.length > arg0) {
            class301.field4601[arg0] = !class301.field4601[arg0];
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II[IJ)Ljava/lang/String;", line = 75)
    public final String method1669(int arg0, int arg1, int[] arg2, long arg3) {
        field3682++;
        if (arg0 == 0) {
            class270 var6 = class206.method1414((byte) 127, arg2[0]);
            return var6.method1897(true, (int) arg3);
        } else if (arg0 == 1 || arg0 == 10) {
            class253 var7 = class325.method2219((int) arg3, -9379);
            return var7.field3837;
        } else if (arg1 == 10) {
            return arg0 == 6 || arg0 == 7 || arg0 == 11 ? class206.method1414((byte) 114, arg2[0]).method1897(true, (int) arg3) : null;
        } else {
            return (String) null;
        }
    }
}
