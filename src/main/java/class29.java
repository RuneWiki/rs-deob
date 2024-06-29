import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class29 implements class33 {

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "Lur;")
    private class393 field291;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "Lwk;")
    private class442 field292;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "Lcq;")
    public static class110 field289 = new class110(113, -2);

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "Z")
    public static boolean field293 = false;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V", line = 4)
    public static void method154(int arg0) {
        if (arg0 != 5392) {
            method154(69);
        }
        field289 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZI)V", line = 16)
    public final void method155(boolean arg0, int arg1) {
        field285++;
        class510 var3 = this.field292.method2565(this.field291.field5335, 3);
        if (var3 != null) {
            int var4 = this.field291.field5340.method1426(class267.field3329, this.field291.field5337, arg1 ^ 0xDEA) + this.field291.field5339;
            int var5 = this.field291.field5336.method3625(this.field291.field5327, class87.field873, 0) + this.field291.field5331;
            if (this.field291.field5332) {
                class701.field9813.method999(var4, var5, this.field291.field5337, this.field291.field5327, this.field291.field5328, 0);
            }
            int var6 = var5 + this.method158(class282.field3535, var3.field7315, var4, 5, (byte) -103, var5) * 12;
            int var9 = var6 + 8;
            if (this.field291.field5332) {
                class701.field9813.method957(var4, var9, var4 + this.field291.field5337 - 1, var9, this.field291.field5328, 0);
            }
            var6 = var9 + 1;
            int var7 = var6 + this.method158(class282.field3535, var3.field7320, var4, 5, (byte) -103, var6) * 12;
            int var10 = var7 + 5;
            int var10000 = var10 + this.method158(class282.field3535, var3.field7321, var4, 5, (byte) -103, var10) * 12;
        }
        if (arg1 != -3563) {
            field290 = 46;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 50)
    public final void method156(int arg0) {
        field288++;
        if (arg0 != 23004) {
            field293 = true;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)Z", line = 64)
    public final boolean method157(boolean arg0) {
        if (arg0) {
            field289 = null;
        }
        field286++;
        return this.field292.method2563((byte) 93);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lla;Ljava/lang/String;IIBI)I", line = 81)
    private final int method158(class413 arg0, String arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 != -103) {
            this.method157(false);
        }
        field287++;
        return arg0.method2313(null, null, 0, -69, 0, this.field291.field5330, this.field291.field5337 - (arg3 * 2), arg3 + arg5, this.field291.field5327 - arg3 * 2, 0, 0, this.field291.field5338, arg2 + arg3, arg1, 0, null);
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lwk;Lur;)V", line = 95)
    public class29(class442 arg0, class393 arg1) {
        this.field291 = arg1;
        this.field292 = arg0;
    }
}
