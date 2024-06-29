import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class313 {

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "Lbp;")
    public static class216 field4928;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "Ltp;")
    public class313 field4929;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "Ltp;")
    public class313 field4930;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)V")
    public static void method2096(boolean arg0) {
        if (!arg0) {
            field4928 = null;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "([[[Lwe;I)V")
    public static final void method2097(class232[][][] arg0, int arg1) {
        for (int var2 = arg1; var2 < arg0.length; var2++) {
            class232[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class232 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field3864 instanceof class149) {
                            ((class149) var6.field3864).method198(-32289);
                        }
                        if (var6.field3878 instanceof class149) {
                            ((class149) var6.field3878).method198(-32289);
                        }
                        if (var6.field3889 instanceof class149) {
                            ((class149) var6.field3889).method198(arg1 ^ 0xFFFF81DF);
                        }
                        if (var6.field3873 instanceof class149) {
                            ((class149) var6.field3873).method198(-32289);
                        }
                        if (var6.field3872 instanceof class149) {
                            ((class149) var6.field3872).method198(-32289);
                        }
                        for (class247 var7 = var6.field3866; var7 != null; var7 = var7.field4054) {
                            class57 var8 = var7.field4052;
                            if (var8 instanceof class149) {
                                ((class149) var8).method198(-32289);
                            }
                        }
                    }
                }
            }
        }
        field4927++;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)Lbr;")
    public static final class222 method2098(int arg0) {
        field4931++;
        if (class400.field5952 == null || class36.field437 == null) {
            return null;
        }
        class222 var1 = (class222) class36.field437.method2459(110);
        if (arg0 != -273) {
            field4928 = null;
        }
        while (var1 != null) {
            class324 var2 = class288.method1944(36, var1.field3684);
            if (var2 != null && var2.field5084 && var2.method2144((byte) -87)) {
                return var1;
            }
            var1 = (class222) class36.field437.method2459(110);
        }
        return null;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILlf;)V")
    public static final void method2099(int arg0, class129 arg1) {
        class275.field4396[arg0] = arg1;
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)V")
    public final void method2100(int arg0) {
        field4932++;
        if (this.field4930 == null) {
            return;
        }
        this.field4930.field4929 = this.field4929;
        this.field4929.field4930 = this.field4930;
        this.field4930 = null;
        this.field4929 = null;
        int var2 = 51 % ((-arg0 - 1) / 55);
    }
}
