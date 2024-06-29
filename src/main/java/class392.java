import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class392 extends class270 {

    @OriginalMember(owner = "client!uba", name = "o", descriptor = "I")
    public volatile int field5225 = -1;

    @OriginalMember(owner = "client!uba", name = "n", descriptor = "Ljava/lang/String;")
    public volatile String field5224;

    @OriginalMember(owner = "client!uba", name = "m", descriptor = "Ltq;")
    public static class572 field5223 = new class572(64);

    @OriginalMember(owner = "client!uba", name = "q", descriptor = "Z")
    public static boolean field5227 = false;

    @OriginalMember(owner = "client!uba", name = "s", descriptor = "[I")
    public static int[] field5229 = new int[4096];

    @OriginalMember(owner = "client!uba", name = "p", descriptor = "Ldj;")
    public static class311 field5226 = new class311();

    @OriginalMember(owner = "client!uba", name = "r", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "([II)Ljava/lang/String;", line = 3)
    public static final String method2140(int[] arg0, int arg1) {
        field5228++;
        int var2 = -20 / ((10 - arg1) / 59);
        StringBuffer var3 = new StringBuffer();
        int var4 = class138.field1584;
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class569 var6 = class106.field1209.method1478(35, arg0[var5]);
            if (var6.field8069 != -1) {
                class458 var7 = (class458) class397.field5317.method3690((byte) 116, (long) var6.field8069);
                if (var7 == null) {
                    class563 var8 = class563.method3185(class633.field8972, var6.field8069, 0);
                    if (var8 != null) {
                        var7 = class453.field6284.method351(var8, true);
                        class397.field5317.method3683(var7, (byte) 90, (long) var6.field8069);
                    }
                }
                if (var7 != null) {
                    class595.field8449[var4] = var7;
                    var3.append(" <img=").append(var4).append(">");
                    var4++;
                }
            }
        }
        return var3.toString();
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(B)V", line = 55)
    public static void method2141(byte arg0) {
        int var1 = 106 / ((-arg0 - 51) / 50);
        field5226 = null;
        field5223 = null;
        field5229 = null;
    }

    @OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 84)
    public class392(String arg0) {
        this.field5224 = arg0;
    }
}
