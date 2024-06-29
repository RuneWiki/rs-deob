import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class250 {

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "Lke;")
    private static class256 field4241 = class316.method2202("Please remove ", 27626);

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    public static int field4248 = -1;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "Lke;")
    public static class256 field4244 = class316.method2202("clignotant1:", 27626);

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "Lke;")
    public static class256 field4251 = field4241;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "[I")
    public static int[] field4252 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1 };

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "S")
    public static short field4253 = 32767;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "Lke;")
    public static class256 field4246 = field4241;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "Lke;")
    public static class256 field4254 = class316.method2202("loc", 27626);

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "Z")
    public static boolean field4242 = false;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "[I")
    public static int[] field4240;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIB)I", line = 10)
    public static final int method1680(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 121) {
            field4254 = (class256) null;
        }
        int var4 = arg0 & 0x3;
        field4249++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILng;)Z", line = 48)
    public static final boolean method1681(int arg0, class138 arg1) {
        if (arg0 != 4) {
            method1684(86);
        }
        field4239++;
        return arg1.method1011(class193.field3525, -23605);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IZ)Lkd;", line = 79)
    public static final class117 method1682(int arg0, boolean arg1) {
        if (!arg1) {
            return (class117) null;
        }
        field4245++;
        class117 var2 = (class117) class270.field4611.method2077(-13408, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class86.field1549.method1016(class277.method1912(-1782288857, arg0), 100, class83.method610((byte) -122, arg0));
        class117 var4 = new class117();
        if (var3 != null) {
            var4.method800((byte) -89, new class41(var3));
        }
        var4.method802(false);
        class270.field4611.method2074(var4, (long) arg0, -1);
        return var4;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([Lke;[SIIB)V", line = 126)
    public static final void method1683(class256[] arg0, short[] arg1, int arg2, int arg3, byte arg4) {
        if (arg3 < arg2) {
            int var5 = (arg3 + arg2) / 2;
            int var6 = arg3;
            class256 var7 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var7;
            short var8 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var8;
            for (int var9 = arg3; var9 < arg2; var9++) {
                if (var7 == null || arg0[var9] != null && arg0[var9].method1772((byte) 97, var7) < (var9 & 0x1)) {
                    class256 var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    short var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg0[arg2] = arg0[var6];
            arg0[var6] = var7;
            arg1[arg2] = arg1[var6];
            arg1[var6] = var8;
            method1683(arg0, arg1, var6 - 1, arg3, (byte) 112);
            method1683(arg0, arg1, arg2, var6 + 1, (byte) 105);
        }
        field4243++;
        if (arg4 <= 77) {
            method1684(-88);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 181)
    public static void method1684(int arg0) {
        field4252 = null;
        field4241 = null;
        field4246 = null;
        field4244 = null;
        field4240 = null;
        if (arg0 != -646173530) {
            method1681(48, (class138) null);
        }
        field4254 = null;
        field4251 = null;
    }
}
