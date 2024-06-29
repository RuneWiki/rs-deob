import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class155 implements class140 {

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "[[[J")
    public static long[][][] field2450;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(JLhi;[II)Ljava/lang/String;")
    public final String method932(long arg0, class131 arg1, int[] arg2, int arg3) {
        if (arg3 != 0) {
            return null;
        }
        field2449++;
        if (class67.field1084 == arg1) {
            class324 var6 = class295.field4480.method2563((byte) 27, arg2[0]);
            return var6.method2024((int) arg0, 17769);
        } else if (class82.field1407 == arg1 || class474.field7241 == arg1) {
            class182 var7 = class288.field4362.method3030((byte) 103, (int) arg0);
            return var7.field2829;
        } else if (class484.field7397 == arg1 || class306.field4641 == arg1 || class51.field776 == arg1) {
            return class295.field4480.method2563((byte) 108, arg2[0]).method2024((int) arg0, 17769);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)V")
    public static void method1002(boolean arg0) {
        field2450 = null;
        if (arg0) {
            method1002(true);
        }
    }
}
