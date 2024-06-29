import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class13 {

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "[Z")
    public static boolean[] field163 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "[I")
    public static int[] field166 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
    public static void method55(byte arg0) {
        field166 = null;
        if (arg0 < 5) {
            method58(-34, (class93) null);
        }
        field163 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIBI)I")
    public static final int method56(int arg0, int arg1, byte arg2, int arg3) {
        field164++;
        if (class233.field4151 == null) {
            return 0;
        }
        int var4 = arg1 >> 7;
        int var5 = arg0 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        if (arg2 < 21) {
            method55((byte) 23);
        }
        int var6 = arg1 & 0x7F;
        int var7 = arg3;
        if (arg3 < 3 && (class4.field53[1][var4][var5] & 0x2) == 2) {
            var7 = arg3 + 1;
        }
        int var8 = (128 - var6) * class233.field4151[var7][var4][var5 + 1] + class233.field4151[var7][var4 + 1][var5 + 1] * var6 >> 7;
        int var9 = (128 - var6) * class233.field4151[var7][var4][var5] + class233.field4151[var7][var4 + 1][var5] * var6 >> 7;
        int var10 = arg0 & 0x7F;
        return (128 - var10) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)Z")
    public static final boolean method57(int arg0) {
        field165++;
        if (arg0 != 2357) {
            field166 = null;
        }
        return class152.field2658;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILcf;)Lgk;")
    public static final class157 method58(int arg0, class93 arg1) {
        field162++;
        if (arg0 != -1787757920) {
            method55((byte) 124);
        }
        for (class157 var2 = (class157) class85.field1538.method1151(116); var2 != null; var2 = (class157) class85.field1538.method1159(37)) {
            if (var2.field2773.method667(arg1, (byte) -109)) {
                return var2;
            }
        }
        return null;
    }
}
