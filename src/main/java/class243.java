import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class243 {

    @OriginalMember(owner = "client!di", name = "d", descriptor = "Lvj;")
    private class422 field3003;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "J")
    public long field3000;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "[Llb;")
    public static class257[] field3004 = new class257[14];

    @OriginalMember(owner = "client!di", name = "b", descriptor = "Lwd;")
    public static class357 field3001 = new class357(6, 0, 4, 2);

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public static int field3008 = 0;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "F")
    public static float field3007;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "J")
    public static long field3006;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([II)Ljava/lang/String;", line = 4)
    public static final String method1439(int[] arg0, int arg1) {
        field3005++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class162.field1810;
        for (int var4 = arg1; var4 < arg0.length; var4++) {
            class349 var5 = class600.field8445.method1056(arg0[var4], arg1 + 35);
            if (var5.field4725 != -1) {
                class534 var6 = (class534) class664.field9289.method78(arg1, (long) var5.field4725);
                if (var6 == null) {
                    class550 var7 = class550.method3122(class408.field5441, var5.field4725, 0);
                    if (var7 != null) {
                        var6 = class701.field9813.method1041(var7, true);
                        class664.field9289.method92(1, (long) var5.field4725, var6);
                    }
                }
                if (var6 != null) {
                    class587.field8315[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!di", name = "finalize", descriptor = "()V", line = 52)
    protected final void finalize() throws Throwable {
        field3002++;
        this.field3003.method2391(-61, this.field3000);
        super.finalize();
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 63)
    public static void method1440(int arg0) {
        field3001 = null;
        if (arg0 != 0) {
            method1440(118);
        }
        field3004 = null;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lvj;J[Lmc;)V", line = 76)
    public class243(class422 arg0, long arg1, class424[] arg2) {
        this.field3003 = arg0;
        this.field3000 = arg1;
    }
}
