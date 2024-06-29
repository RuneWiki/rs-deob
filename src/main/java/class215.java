import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class215 extends class386 {

    @OriginalMember(owner = "client!qt", name = "h", descriptor = "Z")
    public static boolean field3653 = false;

    @OriginalMember(owner = "client!qt", name = "k", descriptor = "[Lnb;")
    public static class249[] field3656;

    @OriginalMember(owner = "client!qt", name = "j", descriptor = "Lqu;")
    public static class219 field3655;

    @OriginalMember(owner = "client!qt", name = "i", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!qt", name = "g", descriptor = "Lmn;")
    public static class162 field3652;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ZILda;Z)V")
    public static final void method1588(boolean arg0, int arg1, class301 arg2, boolean arg3) {
        field3654++;
        int var4 = arg2.field4721;
        int var5 = (int) arg2.field7780;
        arg2.method3149(105);
        if (arg0) {
            class433.method2724(var4, 110);
        }
        class121.method759(120, var4);
        class437 var6 = class255.method1747(var5, false);
        if (var6 != null) {
            class479.method2962(-103, var6);
        }
        class296.method1990((byte) 99);
        if (!arg3 && class509.field7597 != -1) {
            class263.method1808(class509.field7597, 5759, 1);
        }
        class51 var7 = new class51(class423.field6414);
        for (class301 var8 = (class301) var7.method364((byte) 115); var8 != null; var8 = (class301) var7.method363(18098)) {
            if (!var8.method3147(126)) {
                var8 = (class301) var7.method364((byte) 105);
                if (var8 == null) {
                    break;
                }
            }
            if (var8.field4720 == 3) {
                int var9 = (int) var8.field7780;
                if ((var9 >>> 16) == var4) {
                    method1588(true, -117, var8, arg3);
                }
            }
        }
        if (arg1 > -98) {
            method1589((byte) -32);
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)V")
    public static void method1589(byte arg0) {
        if (arg0 == -67) {
            field3655 = null;
            field3652 = null;
            field3656 = null;
        }
    }

    static {
        new class213("Ok", "Okay", "OK", "Ok");
        field3656 = new class249[14];
        field3655 = new class219(2, -1);
    }
}
