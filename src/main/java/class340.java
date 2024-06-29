import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class340 {

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field5274 = 64;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "[I")
    public static int[] field5280 = new int[14];

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "F")
    public static float field5275;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "Llc;")
    public static class175 field5277;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V", line = 6)
    public static void method2353(byte arg0) {
        field5280 = null;
        field5277 = null;
        int var1 = -123 % ((arg0 + 71) / 50);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZ)V", line = 24)
    public static final void method2354(int arg0, boolean arg1) {
        class64.method399(class27.field355, class283.field4443, class98.field1280, class337.field5208);
        field5276++;
        class64.method398(class145.field2016, class31.field394, arg1);
        class64.method403((float) class134.field1858, (float) class208.field2949, (float) class296.field4625);
        if (arg0 != 255) {
            method2353((byte) 34);
        }
        class64.method397();
        class169.field2342 = class313.field4833;
        class169.field2353 = class195.field2795;
        class169.field2344 = class127.field1739;
        class308.field4756 = class205.field2878;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(IZ)V", line = 46)
    public static final void method2355(int arg0, boolean arg1) {
        int var2 = class106.field1347.length;
        byte[][] var3;
        if (class250.field3787 && arg1) {
            var3 = class230.field3361;
        } else {
            var3 = class239.field3574;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            byte[] var5 = var3[var4];
            if (var5 != null) {
                int var6 = (class120.field1694[var4] >> 8) * 64 - class142.field1992;
                int var7 = (class120.field1694[var4] & 0xFF) * 64 - class118.field1668;
                class239.method1713(31532);
                class157.method1047(var5, arg0 ^ 0x40AADDE6, var6, arg1, class149.field2072, var7);
            }
        }
        if (arg0 == 1084939752) {
            field5279++;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IFIIIBIZ)[I", line = 91)
    public static final int[] method2356(int arg0, float arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, boolean arg7) {
        int[] var8 = new int[arg4];
        field5278++;
        class217 var9 = new class217();
        var9.field3049 = (int) (arg1 * 4096.0F);
        var9.field3056 = arg0;
        int var10 = 0 / ((-arg5 - 44) / 50);
        var9.field3043 = arg7;
        var9.field3051 = arg2;
        var9.field3046 = arg3;
        var9.field3050 = arg6;
        var9.method130(false);
        class224.method1542((byte) 25, 1, arg4);
        var9.method1500(0, var8, 92);
        return var8;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BI)[B", line = 117)
    public static final synchronized byte[] method2357(byte arg0, int arg1) {
        field5282++;
        if (arg1 == 100 && class328.field5013 > 0) {
            byte[] var2 = class17.field231[--class328.field5013];
            class17.field231[class328.field5013] = null;
            return var2;
        } else if (arg1 == 5000 && class88.field1098 > 0) {
            byte[] var3 = class177.field2577[--class88.field1098];
            class177.field2577[class88.field1098] = null;
            return var3;
        } else if (arg1 == 30000 && class127.field1746 > 0) {
            byte[] var4 = class208.field2956[--class127.field1746];
            class208.field2956[class127.field1746] = null;
            return var4;
        } else {
            if (arg0 != -8) {
                field5274 = -65;
            }
            return new byte[arg1];
        }
    }
}
