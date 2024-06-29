import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public abstract class class93 extends class235 {

    @OriginalMember(owner = "client!oc", name = "C", descriptor = "Lwe;")
    public static class24 field1274 = new class24(8);

    @OriginalMember(owner = "client!oc", name = "H", descriptor = "Ljava/lang/String;")
    public static String field1279 = "Loading sprites - ";

    @OriginalMember(owner = "client!oc", name = "G", descriptor = "[I")
    public static int[] field1278 = new int[6];

    @OriginalMember(owner = "client!oc", name = "B", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!oc", name = "D", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!oc", name = "E", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!oc", name = "F", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!oc", name = "I", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!oc", name = "J", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "Lqj;")
    public static class238 field1272;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)V", line = 9)
    public static final void method571(int arg0, int arg1, int arg2) {
        field1277++;
        int var3 = class100.field1350.field303[0];
        int var4 = class100.field1350.field306[arg0];
        if (class126.field1679 == 1) {
            if (!class308.method1928(-2, arg2, 0, 106, arg1, 1, var3, var4, 0, 1, false)) {
                class308.method1928(-3, arg2, 0, 97, arg1, 1, var3, var4, 0, 1, false);
            }
        } else if (!class308.method1928(-3, arg2, 0, 93, arg1, 1, var3, var4, 0, 1, false)) {
            class308.method1928(-2, arg2, 0, arg0 + 113, arg1, 1, var3, var4, 0, 1, false);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZIB)Ljava/lang/String;", line = 39)
    public static final String method572(int arg0, boolean arg1, int arg2, byte arg3) {
        field1275++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        } else if (arg1 && arg0 >= 0) {
            if (arg3 > -108) {
                method571(109, -6, 17);
            }
            int var4 = 2;
            for (int var5 = arg0 / arg2; var5 != 0; var5 /= arg2) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg0;
                arg0 /= arg2;
                int var9 = var8 - (arg0 * arg2);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIBIII)V", line = 90)
    public static final void method573(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field1281++;
        int var6 = 76 % ((arg2 + 77) / 35);
        if (arg1 == arg3) {
            class374.method2477(arg0, false, arg3, arg5, arg4);
        } else if (class203.field2942 <= arg0 - arg3 && class297.field4268 >= (arg0 + arg3) && class180.field2375 <= (arg5 - arg1) && class50.field695 >= (arg5 + arg1)) {
            class360.method2369(arg0, arg3, 4096, arg1, arg4, arg5);
        } else {
            class226.method1407(arg4, arg1, 21697, arg3, arg5, arg0);
        }
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(B)V", line = 114)
    public static void method574(byte arg0) {
        if (arg0 == 94) {
            field1274 = null;
            field1272 = null;
            field1278 = null;
            field1279 = null;
        }
    }
}
