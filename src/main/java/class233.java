import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class233 extends class50 {

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public int field3260 = -1;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "Ldb;")
    public static class298 field3261 = new class298(88, 28);

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "[[I")
    public static int[][] field3265 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "[I")
    public static int[] field3266 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "Z")
    public static boolean field3270 = false;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    public static int field3267 = 0;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public int field3262;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "Ljava/lang/String;")
    public String field3264;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "Ljava/lang/String;")
    public String field3268;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)Lwr;", line = 12)
    public final class427 method1452(boolean arg0) {
        ++field3272;
        return !arg0 ? null : class6.field184[super.field706];
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V", line = 27)
    public static void method1453(int arg0) {
        int var1 = 56 % ((-80 - arg0) / 40);
        field3265 = null;
        field3261 = null;
        field3266 = null;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(Z)Ljava/lang/String;", line = 45)
    public static final String method1454(boolean arg0) {
        ++field3271;
        String var1 = "www";
        if (class646.field8662 == class137.field2222) {
            var1 = "www-wtrc";
        } else if (class229.field3207 != class137.field2222) {
            if (class677.field9568 == class137.field2222) {
                var1 = "www-wtwip";
            }
        } else {
            var1 = "www-wtqa";
        }
        String var2 = "";
        if (!arg0) {
            method1453(-38);
        }
        if (class482.field6480 != null) {
            var2 = "/p=" + class482.field6480;
        }
        return "http://" + var1 + "." + class392.field5166.field9511 + ".com/l=" + class516.field6892 + "/a=" + class88.field1330 + var2 + "/";
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIB)Z", line = 82)
    public static final boolean method1455(int arg0, int arg1, byte arg2) {
        ++field3263;
        if (!(class492.method2747((byte) 69, arg0, arg1) | (65536 & arg1) != 0) && !class679.method3792(arg1, arg0, -853061855)) {
            if (arg2 != 124) {
                method1455(86, -104, (byte) -62);
            }
            return ~(arg0 & 55) == -1 && class252.method1532(arg0, (byte) -114, arg1);
        } else {
            return true;
        }
    }
}
