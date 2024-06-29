import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class374 {

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "Z")
    public static boolean field5415 = false;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public int field5413;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public int field5414;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public int field5417;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "Z")
    public boolean field5418;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "([Ljava/lang/String;III)Ljava/lang/String;", line = 19)
    public static final String method2324(String[] arg0, int arg1, int arg2, int arg3) {
        field5416++;
        if (~arg3 == arg2) {
            return "";
        } else if (arg3 == 1) {
            String var4 = arg0[arg1];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg3;
            int var6 = 0;
            for (int var7 = arg1; var7 < var5; var7++) {
                String var11 = arg0[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg1; var9 < var5; var9++) {
                String var10 = arg0[var9];
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
