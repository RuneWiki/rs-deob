import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lja")
public class class744 extends class577 {

    @OriginalMember(owner = "client!lja", name = "o", descriptor = "[Z")
    public static boolean[] field10313 = new boolean[100];

    @OriginalMember(owner = "client!lja", name = "l", descriptor = "Lcfa;")
    public static class179 field10310 = new class179();

    @OriginalMember(owner = "client!lja", name = "m", descriptor = "I")
    public static int field10311;

    @OriginalMember(owner = "client!lja", name = "n", descriptor = "I")
    public int field10312;

    @OriginalMember(owner = "client!lja", name = "p", descriptor = "I")
    public int field10314;

    @OriginalMember(owner = "client!lja", name = "q", descriptor = "I")
    public static int field10315;

    @OriginalMember(owner = "client!lja", name = "r", descriptor = "I")
    public static int field10316;

    @OriginalMember(owner = "client!lja", name = "c", descriptor = "(B)V", line = 4)
    public static void method4145(byte arg0) {
        if (arg0 >= 1) {
            field10310 = null;
            field10313 = null;
        }
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;)Ljava/lang/String;", line = 15)
    public static final String method4146(String arg0, String arg1, byte arg2, String arg3) {
        if (arg2 < 49) {
            method4147(122, null, false, -105, 81);
        }
        field10315++;
        for (int var4 = arg3.indexOf(arg1); var4 != -1; var4 = arg3.indexOf(arg1, var4 + arg0.length())) {
            arg3 = arg3.substring(0, var4) + arg0 + arg3.substring(var4 + arg1.length());
        }
        return arg3;
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(ILjava/lang/String;ZII)V", line = 38)
    public static final void method4147(int arg0, String arg1, boolean arg2, int arg3, int arg4) {
        field10311++;
        if (arg4 == -31280) {
            class28.method250(arg1, arg4 + 48635, false, null, arg2, arg0, arg3);
        }
    }
}
