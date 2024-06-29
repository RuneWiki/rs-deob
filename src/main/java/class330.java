import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class330 {

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public int field4236 = class519.method3084(14007);

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "Ljava/lang/String;")
    public String field4226;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "Ljava/lang/String;")
    public String field4229;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "Ljava/lang/String;")
    public String field4225;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public int field4233;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public int field4238;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public int field4234;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public int field4231;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "Ljava/lang/String;")
    public String field4242;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "Ljava/lang/String;")
    public String field4230;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "Lqk;")
    public static class148 field4227 = new class148(87, 7);

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "Z")
    public static boolean field4240 = false;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "F")
    public static float field4239;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "[I")
    public static int[] field4241;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static final void method1918(int arg0) {
        field4237++;
        for (int var1 = 0; var1 < 100; var1++) {
            class142.field1966[var1] = true;
        }
        if (arg0 != 7) {
            field4240 = false;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V")
    public final void method1919(String arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, int arg7, int arg8) {
        this.field4236 = class519.method3084(14007);
        field4232++;
        this.field4233 = class245.field3409;
        this.field4230 = arg3;
        this.field4226 = arg2;
        this.field4238 = arg1;
        this.field4231 = arg7;
        int var10 = -46 / ((-arg6 - 33) / 41);
        this.field4234 = arg8;
        this.field4242 = arg5;
        this.field4229 = arg0;
        this.field4225 = arg4;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)V")
    public static final void method1920(int arg0, int arg1, int arg2) {
        class38 var3 = class352.field4549[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class481.method2836(var3.field539);
        class481.method2836(var3.field540);
        if (var3.field539 != null) {
            var3.field539 = null;
        }
        if (var3.field540 != null) {
            var3.field540 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
    public static void method1921(int arg0) {
        if (arg0 > 92) {
            field4227 = null;
            field4241 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public class330(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field4226 = arg5;
        this.field4229 = arg3;
        this.field4225 = arg4;
        this.field4233 = class245.field3409;
        this.field4238 = arg0;
        this.field4234 = arg6;
        this.field4231 = arg1;
        this.field4242 = arg7;
        this.field4230 = arg2;
    }
}
