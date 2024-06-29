import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class735 {

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "Lof;")
    private class620 field10273 = new class620(256);

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "Loh;")
    private class404 field10278;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field10274 = 0;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field10279 = 0;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field10268;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field10269;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field10271;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field10272;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field10275;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field10276;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field10277;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public static int field10280;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    public static int field10281;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ob", name = "o", descriptor = "Ljava/lang/Class;")
    public static Class field10282;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "[[[Lcj;")
    public static class691[][][] field10270;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method4101(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 4)
    public final void method4091(int arg0) {
        if (arg0 != 3553) {
            return;
        }
        field10276++;
        class620 var2 = this.field10273;
        synchronized (this.field10273) {
            this.field10273.method3541(-647);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V", line = 17)
    public static void method4092(byte arg0) {
        field10270 = null;
        if (arg0 != -23) {
            method4095(32, -36);
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V", line = 31)
    public final void method4093(byte arg0) {
        field10281++;
        class620 var2 = this.field10273;
        synchronized (this.field10273) {
            int var3 = 40 / ((-arg0 - 53) / 32);
            this.field10273.method3549(0);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIZ[BILnv;I)Ltea;", line = 44)
    public static final class238 method4094(int arg0, int arg1, int arg2, boolean arg3, byte[] arg4, int arg5, class417 arg6, int arg7) {
        field10269++;
        if (arg7 < 107) {
            field10279 = 83;
        }
        if (!arg6.field6061 && (!class560.method3273(-3469, arg1) || !class560.method3273(-3469, arg2))) {
            return arg6.field5996 ? new class238(arg6, 34037, arg5, arg1, arg2, arg3, arg4, arg0) : new class238(arg6, arg5, arg1, arg2, class756.method4202(true, arg1), class756.method4202(true, arg2), arg4, arg0);
        } else {
            return new class238(arg6, 3553, arg5, arg1, arg2, arg3, arg4, arg0);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V", line = 65)
    public static final void method4095(int arg0, int arg1) {
        class30.field344 = 0;
        class163.field1819 = -1;
        class407.field5582 = arg0;
        class34.field372 = false;
        class446.field6457 = 1;
        class231.field2696 = arg1;
        class344.field4471 = null;
        class462.field6583 = null;
        field10277++;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)V", line = 83)
    public final void method4096(int arg0, int arg1) {
        class620 var3 = this.field10273;
        synchronized (this.field10273) {
            this.field10273.method3539((byte) 118, arg0);
        }
        int var4 = 75 % ((60 - arg1) / 50);
        field10268++;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "()V", line = 100)
    public static final void method4097() {
        for (int var0 = 0; var0 < class485.field6894; var0++) {
            class340 var1 = class139.field1560[var0];
            class114.method758(var1, true);
            class139.field1560[var0] = null;
        }
        class485.field6894 = 0;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)I", line = 113)
    public static final int method4098(boolean arg0) {
        if (arg0) {
            field10270 = null;
        }
        field10271++;
        if (class370.field4740 == null) {
            return class67.field683 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(II)Lmw;", line = 131)
    public final class490 method4099(int arg0, int arg1) {
        field10272++;
        class620 var3 = this.field10273;
        class490 var4;
        synchronized (this.field10273) {
            var4 = (class490) this.field10273.method3538((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class404 var5 = this.field10278;
        byte[] var6;
        synchronized (this.field10278) {
            var6 = this.field10278.method2481(arg0, arg1, (byte) 101);
        }
        class490 var7 = new class490();
        if (var6 != null) {
            var7.method2947(new class244(var6), 9014);
        }
        class620 var8 = this.field10273;
        synchronized (this.field10273) {
            this.field10273.method3537(arg0 + 72, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(B)V", line = 165)
    public static final void method4100(byte arg0) {
        try {
            if (arg0 >= -62) {
                return;
            }
            Method var1 = (field10282 == null ? (field10282 = method4101("java.lang.Runtime")) : field10282).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class125.field1314 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        field10275++;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lnb;ILoh;)V", line = 195)
    public class735(class301 arg0, int arg1, class404 arg2) {
        this.field10278 = arg2;
        this.field10278.method2482(0, 26);
    }
}
