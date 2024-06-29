import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class562 {

    @OriginalMember(owner = "client!mfa", name = "k", descriptor = "Lmu;")
    public class270 field7992 = new class270();

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "I")
    public static int field7982;

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "I")
    public static int field7983;

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "I")
    public static int field7984;

    @OriginalMember(owner = "client!mfa", name = "d", descriptor = "I")
    public static int field7985;

    @OriginalMember(owner = "client!mfa", name = "e", descriptor = "I")
    public static int field7986;

    @OriginalMember(owner = "client!mfa", name = "f", descriptor = "I")
    public static int field7987;

    @OriginalMember(owner = "client!mfa", name = "g", descriptor = "I")
    public static int field7988;

    @OriginalMember(owner = "client!mfa", name = "h", descriptor = "I")
    public static int field7989;

    @OriginalMember(owner = "client!mfa", name = "i", descriptor = "I")
    public static int field7990;

    @OriginalMember(owner = "client!mfa", name = "j", descriptor = "I")
    public static int field7991;

    @OriginalMember(owner = "client!mfa", name = "l", descriptor = "I")
    public static int field7993;

    @OriginalMember(owner = "client!mfa", name = "m", descriptor = "I")
    public static int field7994;

    @OriginalMember(owner = "client!mfa", name = "n", descriptor = "I")
    public static int field7995;

    @OriginalMember(owner = "client!mfa", name = "o", descriptor = "I")
    public static int field7996;

    @OriginalMember(owner = "client!mfa", name = "q", descriptor = "I")
    public static int field7998;

    @OriginalMember(owner = "client!mfa", name = "p", descriptor = "Lmu;")
    private class270 field7997;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(B)Z", line = 4)
    public final boolean method3161(byte arg0) {
        field7982++;
        if (arg0 < 85) {
            return false;
        } else {
            return this.field7992.field3394 == this.field7992;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lmfa;B)V", line = 19)
    public final void method3162(class562 arg0, byte arg1) {
        this.method3167(this.field7992.field3394, 70, arg0);
        field7994++;
        if (arg1 > -105) {
            this.field7997 = null;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I)Lmu;", line = 31)
    public final class270 method3163(int arg0) {
        field7988++;
        class270 var2 = this.field7997;
        if (this.field7992 == var2) {
            this.field7997 = null;
            return null;
        }
        this.field7997 = var2.field3404;
        if (arg0 != 5769) {
            this.field7997 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lmu;I)V", line = 55)
    public final void method3164(class270 arg0, int arg1) {
        field7996++;
        if (arg0.field3404 != null) {
            arg0.method1519((byte) 121);
        }
        if (arg1 != 256) {
            this.field7997 = null;
        }
        arg0.field3394 = this.field7992;
        arg0.field3404 = this.field7992.field3404;
        arg0.field3404.field3394 = arg0;
        arg0.field3394.field3404 = arg0;
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(B)I", line = 75)
    public final int method3165(byte arg0) {
        field7990++;
        int var2 = 0;
        if (arg0 <= 32) {
            this.field7997 = null;
        }
        for (class270 var3 = this.field7992.field3394; var3 != this.field7992; var3 = var3.field3394) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ILiaa;Ljava/lang/String;)I", line = 96)
    public static final int method3166(int arg0, class452 arg1, String arg2) {
        if (arg0 != 1024) {
            method3173(-23);
        }
        field7983++;
        int var3 = arg1.field6215;
        byte[] var4 = class456.method2599(8431, arg2);
        arg1.method2559(var4.length, (byte) -80);
        arg1.field6215 += class272.field3444.method1948(0, arg1.field6209, var4.length, var4, arg1.field6215, 8);
        return arg1.field6215 - var3;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lmu;ILmfa;)V", line = 116)
    private final void method3167(class270 arg0, int arg1, class562 arg2) {
        field7995++;
        class270 var4 = this.field7992.field3404;
        this.field7992.field3404 = arg0.field3404;
        arg0.field3404.field3394 = this.field7992;
        if (this.field7992 != arg0) {
            arg0.field3404 = arg2.field7992.field3404;
            arg0.field3404.field3394 = arg0;
            var4.field3394 = arg2.field7992;
            arg2.field7992.field3404 = var4;
        }
        int var5 = 90 / ((arg1 + 25) / 50);
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Z)Lmu;", line = 140)
    public final class270 method3168(boolean arg0) {
        field7986++;
        class270 var2 = this.field7997;
        if (this.field7992 == var2) {
            this.field7997 = null;
            return null;
        } else {
            this.field7997 = var2.field3394;
            return arg0 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ILmu;)V", line = 166)
    public final void method3169(int arg0, class270 arg1) {
        field7984++;
        if (arg1.field3404 != null) {
            arg1.method1519((byte) 121);
        }
        arg1.field3394 = this.field7992.field3394;
        arg1.field3404 = this.field7992;
        arg1.field3404.field3394 = arg1;
        int var3 = -123 % ((arg0 + 77) / 39);
        arg1.field3394.field3404 = arg1;
    }

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "(B)V", line = 184)
    public final void method3170(byte arg0) {
        field7989++;
        int var2 = -54 / ((3 - arg0) / 55);
        while (true) {
            class270 var3 = this.field7992.field3394;
            if (this.field7992 == var3) {
                this.field7997 = null;
                return;
            }
            var3.method1519((byte) 121);
        }
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(I)Lmu;", line = 204)
    public final class270 method3171(int arg0) {
        if (arg0 != 768) {
            method3166(19, null, null);
        }
        field7991++;
        class270 var2 = this.field7992.field3394;
        if (this.field7992 == var2) {
            return null;
        } else {
            var2.method1519((byte) 121);
            return var2;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "()V", line = 337)
    public class562() {
        this.field7992.field3404 = this.field7992;
        this.field7992.field3394 = this.field7992;
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(Z)V", line = 227)
    public static final void method3172(boolean arg0) {
        class14.field135.method363(class631.field8956, class601.field8530.field2853 ? class32.field363 + 256 << 2 : -1, 0);
        if (!arg0) {
            field7987++;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "(I)V", line = 242)
    public static final void method3173(int arg0) {
        if (arg0 != 1024) {
            method3173(-63);
        }
        field7993++;
        int var1 = 0;
        if (class601.field8530 != null) {
            var1 = class601.field8530.method1844(class150.field1711, true);
        }
        if (var1 == 2) {
            int var2 = class433.field5699 > 800 ? 800 : class433.field5699;
            class287.field3673 = (class433.field5699 - var2) / 2;
            int var3 = class680.field9645 > 600 ? 600 : class680.field9645;
            class399.field5336 = var2;
            class416.field5524 = var3;
            class600.field8523 = 0;
        } else if (var1 == 1) {
            int var4 = class433.field5699 > 1024 ? 1024 : class433.field5699;
            class399.field5336 = var4;
            int var5 = class680.field9645 > 768 ? 768 : class680.field9645;
            class287.field3673 = (class433.field5699 - var4) / 2;
            class416.field5524 = var5;
            class600.field8523 = 0;
        } else {
            class287.field3673 = 0;
            class600.field8523 = 0;
            class416.field5524 = class680.field9645;
            class399.field5336 = class433.field5699;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "d", descriptor = "(B)Lmu;", line = 294)
    public final class270 method3174(byte arg0) {
        field7998++;
        class270 var2 = this.field7992.field3394;
        if (this.field7992 == var2) {
            this.field7997 = null;
            return null;
        } else {
            this.field7997 = var2.field3394;
            return arg0 == 49 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "e", descriptor = "(B)Lmu;", line = 316)
    public final class270 method3175(byte arg0) {
        field7985++;
        class270 var2 = this.field7992.field3404;
        if (arg0 != 110) {
            this.method3167(null, -103, null);
        }
        if (this.field7992 == var2) {
            this.field7997 = null;
            return null;
        } else {
            this.field7997 = var2.field3404;
            return var2;
        }
    }
}
