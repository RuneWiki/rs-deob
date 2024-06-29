import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class338 {

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "Lge;")
    private class511 field5005 = new class511(64);

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "Lci;")
    private class320 field5009;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "Ltg;")
    public static class158 field5008;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "Lbf;")
    public static class381 field5011;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "[I")
    public static int[] field5010;

    static {
        new class44("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V", line = 7)
    public final void method2144(byte arg0) {
        if (arg0 != -45) {
            return;
        }
        field5004++;
        class511 var2 = this.field5005;
        synchronized (this.field5005) {
            this.field5005.method2990((byte) -112);
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)I", line = 24)
    public static final int method2145(byte arg0) {
        field5012++;
        if (arg0 != -72) {
            method2149(-38);
        }
        return 13;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)V", line = 39)
    public final void method2146(int arg0, int arg1) {
        class511 var3 = this.field5005;
        synchronized (this.field5005) {
            this.field5005.method2989(false, arg0);
        }
        if (arg1 > 31) {
            field5007++;
        }
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(B)V", line = 53)
    public static final void method2147(byte arg0) {
        field5006++;
        class293.field4369.method2990((byte) -98);
        if (arg0 > -79) {
            method2149(-119);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIII)V", line = 64)
    public static final void method2148(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var9 = arg5 + 1;
        class479.method2839(arg3, arg2, class271.field4078[arg5], arg1 ^ 0x38, arg4);
        field5013++;
        if (arg1 != 64) {
            return;
        }
        int var8 = arg0 - 1;
        class479.method2839(arg3, arg2, class271.field4078[arg0], 107, arg4);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class271.field4078[var6];
            var7[arg2] = var7[arg3] = arg4;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V", line = 89)
    public static void method2149(int arg0) {
        if (arg0 != 13) {
            method2147((byte) -21);
        }
        field5011 = null;
        field5008 = null;
        field5010 = null;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V", line = 103)
    public final void method2150(int arg0) {
        if (arg0 != 64) {
            return;
        }
        class511 var2 = this.field5005;
        synchronized (this.field5005) {
            this.field5005.method2980(arg0 - 182819160);
        }
        field5003++;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)V", line = 123)
    public final void method2151(int arg0, int arg1) {
        field5014++;
        class511 var3 = this.field5005;
        synchronized (this.field5005) {
            this.field5005.method2990((byte) -127);
            this.field5005 = new class511(arg0);
        }
        int var4 = -116 / ((arg1 - 61) / 52);
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lsn;ILci;)V", line = 138)
    public class338(class453 arg0, int arg1, class320 arg2) {
        this.field5009 = arg2;
        if (this.field5009 != null) {
            int var4 = this.field5009.method2033((byte) 60) - 1;
            this.field5009.method2030(-10914, var4);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BI)Lqq;", line = 163)
    public final class339 method2152(byte arg0, int arg1) {
        field5002++;
        class511 var3 = this.field5005;
        class339 var4;
        synchronized (this.field5005) {
            var4 = (class339) this.field5005.method2982(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 >= -113) {
            this.field5005 = null;
        }
        class320 var5 = this.field5009;
        byte[] var6;
        synchronized (this.field5009) {
            var6 = this.field5009.method2037(class133.method971((byte) 114, arg1), (byte) -79, class245.method1606(arg1, 32));
        }
        class339 var7 = new class339();
        if (var6 != null) {
            var7.method2155(new class519(var6), (byte) 126);
        }
        class511 var8 = this.field5005;
        synchronized (this.field5005) {
            this.field5005.method2981(var7, 92, (long) arg1);
            return var7;
        }
    }
}
