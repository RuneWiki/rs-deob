import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class283 extends class143 {

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field4550 = 0;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II[Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1864(int arg0, int arg1, String[] arg2, int arg3) {
        field4549++;
        if (arg1 == 0) {
            return "";
        } else if (arg1 == 1) {
            String var4 = arg2[arg3];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg3;
            int var6 = arg0;
            for (int var7 = arg3; var7 < var5; var7++) {
                String var11 = arg2[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg3; var9 < var5; var9++) {
                String var10 = arg2[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }
}
