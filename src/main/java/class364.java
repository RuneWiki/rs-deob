import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class364 {

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field4694 = 0;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field4692 = 0;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Lhb;")
    public static class250 field4691 = new class250(41, 4);

    @OriginalMember(owner = "client!q", name = "f", descriptor = "F")
    public static float field4695;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)Z")
    public static final boolean method2137(int arg0) {
        field4690++;
        try {
            if (class520.field7691 == 2) {
                if (class503.field7395 == null) {
                    class503.field7395 = class50.method303(class181.field2362, class264.field3347, class298.field3864);
                    if (class503.field7395 == null) {
                        return false;
                    }
                }
                if (class480.field6986 == null) {
                    class480.field6986 = new class415(class474.field6924, class23.field417);
                }
                if (class117.field1641.method2236(class503.field7395, class480.field6986, class299.field3880, (byte) 49, 22050)) {
                    class117.field1641.method2253(-24794);
                    class117.field1641.method2230(class411.field5487, 95);
                    class117.field1641.method2255(class368.field4742, class503.field7395, 128);
                    class503.field7395 = null;
                    class520.field7691 = 0;
                    class480.field6986 = null;
                    class181.field2362 = null;
                    return true;
                }
            }
            if (arg0 > -47) {
                field4691 = null;
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class117.field1641.method2241(true);
            class503.field7395 = null;
            class181.field2362 = null;
            class480.field6986 = null;
            class520.field7691 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(FFIFF[BIIIZILqi;F)V")
    public static final void method2138(float arg0, float arg1, int arg2, float arg3, float arg4, byte[] arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, class385 arg11, float arg12) {
        for (int var13 = 0; var13 < arg10; var13++) {
            class225.method1433(arg2, arg7, -4, arg0, arg8, arg12, arg4, arg5, arg6, arg1, arg11, arg10, arg3, var13);
            arg6 += arg2 * arg8;
        }
        field4693++;
        if (!arg9) {
            method2138(-1.3179897F, -1.1200778F, 31, -1.6573299F, 0.68440443F, null, -47, -55, 120, false, 50, null, -1.342923F);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
    public static void method2139(byte arg0) {
        field4691 = null;
        if (arg0 != -33) {
            field4692 = -76;
        }
    }
}
