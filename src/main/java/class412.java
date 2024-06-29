import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class412 {

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "Lcba;")
    public static class471 field5793 = new class471(37, 5);

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "[F")
    public static float[] field5796 = new float[4];

    @OriginalMember(owner = "client!lda", name = "e", descriptor = "[S")
    public static short[] field5797 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!lda", name = "g", descriptor = "Ljava/lang/String;")
    public static String field5799 = null;

    @OriginalMember(owner = "client!lda", name = "h", descriptor = "I")
    public static int field5800 = 1400;

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "I")
    public static int field5794;

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "I")
    public static int field5795;

    @OriginalMember(owner = "client!lda", name = "f", descriptor = "I")
    public static int field5798;

    @OriginalMember(owner = "client!lda", name = "i", descriptor = "Lea;")
    public static class467 field5801;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Z)V")
    public static void method2451(boolean arg0) {
        field5799 = null;
        field5796 = null;
        field5797 = null;
        field5801 = null;
        field5793 = null;
        if (arg0) {
            field5799 = null;
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IZI)Ljava/lang/String;")
    public static final String method2452(int arg0, boolean arg1, int arg2) {
        field5794++;
        if (arg1 && arg0 >= 0) {
            return arg2 == 13371 ? class1.method9(-1, arg0, 10, arg1) : null;
        } else {
            return Integer.toString(arg0);
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IZZ)V")
    public static final void method2453(int arg0, boolean arg1, boolean arg2) {
        field5798++;
        class133 var3 = class568.method3229(arg0, (byte) -88, arg2);
        if (arg1) {
            field5799 = null;
        }
        if (var3 != null) {
            var3.method1117(0);
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lmc;III)V")
    public static final void method2454(class114 arg0, int arg1, int arg2, int arg3) {
        field5795++;
        if (arg0 == null) {
            return;
        }
        if (arg0.field1844 != null) {
            class224 var4 = new class224();
            var4.field3207 = arg0.field1844;
            var4.field3210 = arg0;
            class123.method862(var4);
        }
        class103.field1566 = arg0.field1749;
        class226.field3238 = arg2;
        class328.field4396 = arg1;
        class65.field1111 = arg0.field1796;
        class608.field8768 = arg0.field1810;
        class461.field6472 = arg0.field1787;
        class575.field7926 = arg0.field1761;
        class493.field6904 = true;
        if (arg3 == -2) {
            class403.method2407(arg0, -9130);
        }
    }
}
