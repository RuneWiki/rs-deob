import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gka")
public class class303 {

    @OriginalMember(owner = "client!gka", name = "c", descriptor = "Z")
    public static boolean field3821 = false;

    @OriginalMember(owner = "client!gka", name = "e", descriptor = "I")
    public static int field3823 = 0;

    @OriginalMember(owner = "client!gka", name = "b", descriptor = "[I")
    public static int[] field3820 = new int[4];

    @OriginalMember(owner = "client!gka", name = "f", descriptor = "Lmw;")
    public static class687 field3824 = new class687();

    @OriginalMember(owner = "client!gka", name = "g", descriptor = "F")
    public static float field3825;

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!gka", name = "d", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(ZZ)I", line = 7)
    public static final int method1795(boolean arg0, boolean arg1) {
        field3822++;
        if (arg1) {
            method1797(-53, true);
        }
        if (class207.field2852 == null) {
            return 0;
        } else if (arg0 || class773.field10527 == null) {
            int var2 = 0;
            for (int var3 = 0; var3 < class207.field2852.length; var3++) {
                int var4 = class207.field2852[var3];
                if (class467.field6057.method130(-2, var4)) {
                    var2++;
                }
                if (class633.field8028.method130(-2, var4)) {
                    var2++;
                }
            }
            return var2;
        } else {
            return class207.field2852.length * 2;
        }
    }

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(I)V", line = 50)
    public static void method1796(int arg0) {
        field3824 = null;
        field3820 = null;
        if (arg0 > -66) {
            method1797(67, false);
        }
    }

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(IZ)I", line = 63)
    public static final int method1797(int arg0, boolean arg1) {
        field3819++;
        byte var2;
        if (arg0 > 12000) {
            var2 = 4;
            class104.method601(121);
        } else if (arg0 > 5000) {
            class432.method2482(1);
            var2 = 3;
        } else if (arg0 > 2000) {
            class11.method46((byte) 114);
            var2 = 2;
        } else {
            class588.method3149(0, true);
            var2 = 1;
        }
        if (!arg1) {
            field3825 = -0.56687284F;
        }
        if (class485.field6252.field6949.method2402(!arg1) != 2) {
            class485.field6252.method2986(2, class485.field6252.field6922, (byte) -60);
            class432.method2483((byte) 76, 2, false);
        }
        class627.method3356(92);
        return var2;
    }
}
