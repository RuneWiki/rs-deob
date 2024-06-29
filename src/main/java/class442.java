import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class442 {

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public int field6579 = 128;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public int field6584 = 128;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public int field6583;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public int field6576;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    public int field6586;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public int field6578;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "[I")
    public static int[] field6574 = new int[4096];

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BLha;)V")
    public static final void method2742(byte arg0, class60 arg1) {
        class427.field6332 = class735.method4133(true, arg1, 116, class567.field8053);
        field6580++;
        class232.field3385 = class45.method328(arg1, class567.field8053, (byte) 69);
        class358.field5201 = class735.method4133(true, arg1, 119, class357.field5182);
        if (arg0 > -53) {
            field6574 = null;
        }
        class55.field764 = class45.method328(arg1, class357.field5182, (byte) 69);
        class298.field4225 = class735.method4133(true, arg1, 104, class649.field9148);
        class335.field4827 = class45.method328(arg1, class649.field9148, (byte) 69);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZ)Z")
    public static final boolean method2743(int arg0, boolean arg1) {
        field6582++;
        if (arg1) {
            return true;
        } else {
            return arg0 == 0 || arg0 == 1 || arg0 == 2;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lti;I)V")
    public final void method2744(class442 arg0, int arg1) {
        this.field6576 = arg0.field6576;
        field6575++;
        this.field6584 = arg0.field6584;
        if (arg1 != 34037) {
            method2742((byte) -71, null);
        }
        this.field6579 = arg0.field6579;
        this.field6586 = arg0.field6586;
        this.field6578 = arg0.field6578;
        this.field6583 = arg0.field6583;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ljava/lang/String;I)[B")
    public static final byte[] method2745(String arg0, int arg1) {
        field6577++;
        int var2 = arg0.length();
        if (var2 == 0) {
            return new byte[0];
        } else if (arg1 <= 108) {
            return null;
        } else {
            int var3 = var2 + 3 & 0xFFFFFFFC;
            int var4 = var3 / 4 * 3;
            if (var2 <= (var3 - 2) || class253.method1669(-1, arg0.charAt(var3 - 2)) == -1) {
                var4 -= 2;
            } else if (var2 <= (var3 - 1) || class253.method1669(-1, arg0.charAt(var3 - 1)) == -1) {
                var4--;
            }
            byte[] var5 = new byte[var4];
            class358.method2236(-1437765436, var5, 0, arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)Lti;")
    public final class442 method2746(byte arg0) {
        field6581++;
        if (arg0 != 3) {
            method2747(-101, 70, -104);
        }
        return new class442(this.field6583, this.field6579, this.field6584, this.field6586, this.field6576, this.field6578);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)Liq;")
    public static final class608 method2747(int arg0, int arg1, int arg2) {
        class186 var3 = class80.field1136[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class608 var4 = var3.field2845;
            var3.field2845 = null;
            class51.method371(var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V")
    public static void method2748(boolean arg0) {
        if (arg0) {
            field6574 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIILwh;I)Liba;")
    public static final class531 method2749(int arg0, int arg1, int arg2, int arg3, class148 arg4, int arg5) {
        if (arg5 != 3553) {
            field6574 = null;
        }
        field6585++;
        if (!arg4.field2258 && (!class627.method3619(arg5 ^ 0xDE3, arg1) || !class627.method3619(2, arg0))) {
            return arg4.field2264 ? new class531(arg4, 34037, arg2, arg3, arg1, arg0, true) : new class531(arg4, arg2, arg3, arg1, arg0, class432.method2684(arg1, -21774), class432.method2684(arg0, -21774), true);
        } else {
            return new class531(arg4, 3553, arg2, arg3, arg1, arg0, true);
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(I)V")
    public class442(int arg0) {
        this.field6583 = arg0;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(IIIIII)V")
    private class442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6576 = arg4;
        this.field6586 = arg3;
        this.field6578 = arg5;
        this.field6584 = arg2;
        this.field6583 = arg0;
        this.field6579 = arg1;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field6574[var0] = class752.method4195(var0, (byte) -88);
        }
    }
}
