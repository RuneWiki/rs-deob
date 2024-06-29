import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class163 implements class759 {

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "Z")
    public static boolean field2583 = false;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!tba", name = "e", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(ILsca;)V")
    public static final void method1189(int arg0, class46 arg1) {
        field2581++;
        if (arg1.field577 == 5 && arg1.field687 != -1) {
            class86.method703((byte) 13, arg1, class736.field10316);
        }
        if (arg0 != 19919) {
            field2582 = 54;
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(I[ILfa;J)Ljava/lang/String;")
    public final String method1190(int arg0, int[] arg1, class235 arg2, long arg3) {
        field2584++;
        if (arg0 != 4064) {
            return null;
        } else if (class248.field3610 == arg2) {
            class110 var6 = class448.field6624.method743(arg1[0], true);
            return var6.method824((byte) -109, (int) arg3);
        } else if (class339.field4930 == arg2 || class732.field10250 == arg2) {
            class578 var7 = class336.field4876.method2079((int) arg3, (byte) -103);
            return var7.field8231;
        } else if (class739.field10362 == arg2 || class223.field3272 == arg2 || class362.field5233 == arg2) {
            return class448.field6624.method743(arg1[0], true).method824((byte) -99, (int) arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V")
    public static final void method1191(int arg0) {
        field2585++;
        for (class19 var1 = (class19) class153.field2445.method1195(arg0 ^ arg0); var1 != null; var1 = (class19) class153.field2445.method1201(2)) {
            class14.method88(8192, var1, false);
        }
        for (class19 var2 = (class19) class606.field8555.method1195(0); var2 != null; var2 = (class19) class606.field8555.method1201(arg0 ^ 0xFFFF89BD)) {
            class14.method88(arg0 ^ 0xFFFFA9BF, var2, true);
        }
    }
}
