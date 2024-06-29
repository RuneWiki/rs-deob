import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class288 {

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "[I")
    public static int[] field4313 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "Z")
    public static boolean field4310 = false;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "Lqe;")
    public static class160 field4314;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "[I")
    public static int[] field4312;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILjava/lang/String;)I", line = 5)
    public static final int method1821(int arg0, String arg1) {
        field4308++;
        if (arg0 != 4189) {
            return -106;
        }
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = arg1.charAt(var4) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 35)
    public static void method1822(int arg0) {
        field4314 = null;
        if (arg0 != 1) {
            method1821(-83, (String) null);
        }
        field4312 = null;
        field4313 = null;
    }
}
