import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class633 {

    @OriginalMember(owner = "client!me", name = "f", descriptor = "[I")
    public static int[] field8935 = new int[3];

    @OriginalMember(owner = "client!me", name = "g", descriptor = "F")
    public static float field8936;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field8930;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field8931;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field8933;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "Lla;")
    public static class423 field8934;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "[I")
    public static int[] field8937;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "[Lsia;")
    public static class151[] field8932;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public static void method3626(int arg0) {
        field8935 = null;
        field8934 = null;
        field8937 = null;
        field8932 = null;
        if (arg0 != -29656) {
            field8934 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BII)V")
    public static final void method3627(byte arg0, int arg1, int arg2) {
        field8933++;
        class503 var3 = class512.method3112(17, arg2, 0);
        var3.method3075((byte) 65);
        int var4 = 84 % ((-arg0 - 6) / 63);
        var3.field7310 = arg1;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;")
    public static final String method3628(boolean arg0, String arg1, String arg2, char arg3) {
        field8931++;
        int var4 = arg1.length();
        int var5 = arg2.length();
        int var6 = var4;
        if (!arg0) {
            return null;
        }
        int var7 = var5 - 1;
        if (var7 != 0) {
            int var8 = 0;
            while (true) {
                var8 = arg1.indexOf(arg3, var8);
                if (var8 < 0) {
                    break;
                }
                var6 += var7;
                var8++;
            }
        }
        StringBuffer var9 = new StringBuffer(var6);
        int var10 = 0;
        while (true) {
            int var11 = arg1.indexOf(arg3, var10);
            if (var11 < 0) {
                var9.append(arg1.substring(var10));
                return var9.toString();
            }
            var9.append(arg1.substring(var10, var11));
            var10 = var11 + 1;
            var9.append(arg2);
        }
    }
}
