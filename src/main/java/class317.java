import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class317 {

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "Lof;")
    private class620 field4058 = new class620(64);

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "Lof;")
    private class620 field4065 = new class620(100);

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "Loh;")
    private class404 field4064;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    public final void method1901(byte arg0) {
        field4056++;
        if (arg0 != 29) {
            method1902(118);
        }
        class620 var2 = this.field4058;
        synchronized (this.field4058) {
            this.field4058.method3549(arg0 ^ 0x1D);
        }
        class620 var3 = this.field4065;
        synchronized (this.field4065) {
            this.field4065.method3549(arg0 ^ 0x1D);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)[Lhs;")
    public static final class325[] method1902(int arg0) {
        field4054++;
        int var1 = 56 % ((arg0 - 49) / 61);
        return new class325[] { class614.field8794, class621.field8902, class371.field4742, class366.field4667, class709.field9994, class145.field1604, class675.field9561, class294.field3621, class593.field8382, class675.field9563 };
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BI)Lwc;")
    public final class66 method1903(byte arg0, int arg1) {
        field4061++;
        class620 var3 = this.field4065;
        synchronized (this.field4065) {
            class66 var4 = (class66) this.field4065.method3538((long) arg1, 0);
            if (var4 == null) {
                var4 = new class66(arg1);
                this.field4065.method3537(-65, (long) arg1, var4);
            }
            if (var4.method490(false)) {
                int var6 = -128 / (arg0 / 36);
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
    public final void method1904(byte arg0) {
        class620 var2 = this.field4058;
        synchronized (this.field4058) {
            this.field4058.method3541(-647);
        }
        if (arg0 < 40) {
            this.method1904((byte) 123);
        }
        field4063++;
        class620 var3 = this.field4065;
        synchronized (this.field4065) {
            this.field4065.method3541(-647);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)Lfba;")
    public final class25 method1905(int arg0, int arg1) {
        if (arg0 < 44) {
            this.field4058 = null;
        }
        field4057++;
        class620 var3 = this.field4058;
        class25 var4;
        synchronized (this.field4058) {
            var4 = (class25) this.field4058.method3538((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class404 var5 = this.field4064;
        byte[] var6;
        synchronized (this.field4064) {
            var6 = this.field4064.method2481(class627.method3592(-6943, arg1), class753.method4193(true, arg1), (byte) 108);
        }
        class25 var7 = new class25();
        var7.field248 = arg1;
        var7.field254 = this;
        if (var6 != null) {
            var7.method121(new class244(var6), -1);
        }
        var7.method124(69);
        class620 var8 = this.field4058;
        synchronized (this.field4058) {
            this.field4058.method3537(85, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1906(String arg0, String arg1, String arg2, int arg3) {
        field4062++;
        for (int var4 = arg2.indexOf(arg0); var4 != -1; var4 = arg2.indexOf(arg0, var4 + arg1.length())) {
            arg2 = arg2.substring(0, var4) + arg1 + arg2.substring(var4 + arg0.length());
        }
        if (arg3 != 0) {
            method1908(8, 26, null, -104);
        }
        return arg2;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZI)V")
    public final void method1907(boolean arg0, int arg1) {
        class620 var3 = this.field4058;
        synchronized (this.field4058) {
            this.field4058.method3539((byte) -107, arg1);
        }
        field4055++;
        class620 var4 = this.field4065;
        synchronized (this.field4065) {
            if (arg0) {
                this.field4065.method3539((byte) 114, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILefa;I)V")
    public static final void method1908(int arg0, int arg1, class183 arg2, int arg3) {
        field4060++;
        int[] var4 = new int[4];
        if (arg0 < 54) {
            method1906(null, null, null, 68);
        }
        class143.method896(var4, 0, var4.length, arg3);
        class357.method2106(arg1, 113, arg2, var4);
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lnb;ILoh;Loh;Loh;)V")
    public class317(class301 arg0, int arg1, class404 arg2, class404 arg3, class404 arg4) {
        this.field4064 = arg2;
        if (this.field4064 != null) {
            int var6 = this.field4064.method2478((byte) 76) - 1;
            this.field4064.method2482(0, var6);
        }
        class169.method1055(2, (byte) -104, arg3, arg4);
    }
}
