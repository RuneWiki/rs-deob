import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public abstract class class499 {

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "[I")
    public static int[] field7406 = new int[4096];

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field7409 = 0;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field7407 = 0;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IFIIFIFFII[F)V")
    public abstract void method503(int arg0, float arg1, int arg2, int arg3, float arg4, int arg5, float arg6, float arg7, int arg8, int arg9, float[] arg10);

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
    public static void method2993(boolean arg0) {
        field7406 = null;
        if (arg0) {
            field7409 = 55;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method2994(String arg0, byte arg1) {
        field7408++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 >= -41) {
            field7406 = null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var3 > var2 && class475.method2869(arg0.charAt(var2), 101)) {
            var2++;
        }
        while (var3 > var2 && class475.method2869(arg0.charAt(var3 - 1), 46)) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            if (class236.method1572(var7, false)) {
                char var8 = class138.method1039(234, var7);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }
}
