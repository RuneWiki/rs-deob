import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class187 {

    @OriginalMember(owner = "client!op", name = "b", descriptor = "S")
    public static short field2515 = 32767;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "[S")
    public static short[] field2518 = new short[256];

    @OriginalMember(owner = "client!op", name = "a", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "I")
    public int field2516;

    @OriginalMember(owner = "client!op", name = "d", descriptor = "I")
    public int field2517;

    @OriginalMember(owner = "client!op", name = "g", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!op", name = "h", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!op", name = "i", descriptor = "I")
    public int field2522;

    @OriginalMember(owner = "client!op", name = "f", descriptor = "Lqfa;")
    public static class98 field2519;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;", line = 6)
    public static final String method1172(String arg0, String arg1, int arg2, String arg3) {
        field2520++;
        int var4 = arg3.indexOf(arg0);
        if (arg2 != 0) {
            method1173(-12);
        }
        while (var4 != -1) {
            arg3 = arg3.substring(0, var4) + arg1 + arg3.substring(arg0.length() + var4);
            var4 = arg3.indexOf(arg0, var4 + arg1.length());
        }
        return arg3;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V", line = 34)
    public static void method1173(int arg0) {
        field2518 = null;
        field2519 = null;
        if (arg0 != 0) {
            field2518 = null;
        }
    }
}
