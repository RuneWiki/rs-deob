import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class376 {

    @OriginalMember(owner = "client!at", name = "b", descriptor = "Ljava/lang/String;")
    public String field5661;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "Ljava/lang/String;")
    public String field5660;

    @OriginalMember(owner = "client!at", name = "d", descriptor = "Ljava/lang/String;")
    public String field5663;

    @OriginalMember(owner = "client!at", name = "c", descriptor = "I")
    public static int field5662 = 1337;

    @OriginalMember(owner = "client!at", name = "f", descriptor = "I")
    public static int field5665 = -1;

    @OriginalMember(owner = "client!at", name = "g", descriptor = "[Z")
    public static boolean[] field5666 = new boolean[100];

    @OriginalMember(owner = "client!at", name = "e", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(B)V")
    public static void method2375(byte arg0) {
        field5666 = null;
        if (arg0 <= 124) {
            method2375((byte) 36);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "([Ljava/lang/String;III)Ljava/lang/String;")
    public static final String method2376(String[] arg0, int arg1, int arg2, int arg3) {
        field5664++;
        if (arg1 == 0) {
            return "";
        } else if (arg1 == 1) {
            String var4 = arg0[arg2];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg2;
            int var6 = 0;
            for (int var7 = arg2; var7 < var5; var7++) {
                String var11 = arg0[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            if (arg3 != -1) {
                method2376(null, 77, -100, -41);
            }
            for (int var9 = arg2; var9 < var5; var9++) {
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

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class376(String arg0, String arg1, String arg2) {
        this.field5661 = arg2;
        this.field5660 = arg0;
        this.field5663 = arg1;
    }
}
