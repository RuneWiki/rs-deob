import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class322 {

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "Ltb;")
    private class450 field4127 = new class450(64);

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "Ltb;")
    private class450 field4132 = new class450(100);

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "Lpl;")
    private class612 field4123;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public static int field4130 = 0;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
    public final void method1839(byte arg0) {
        if (arg0 > -108) {
            this.method1839((byte) 81);
        }
        field4124++;
        class450 var2 = this.field4127;
        synchronized (this.field4127) {
            this.field4127.method2412((byte) -126);
        }
        class450 var3 = this.field4132;
        synchronized (this.field4132) {
            this.field4132.method2412((byte) -24);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)V")
    public final void method1840(int arg0, int arg1) {
        field4131++;
        class450 var3 = this.field4127;
        synchronized (this.field4127) {
            this.field4127.method2411(true, arg1);
        }
        class450 var4 = this.field4132;
        synchronized (this.field4132) {
            int var5 = 4 / ((arg0 + 59) / 34);
            this.field4132.method2411(true, arg1);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V")
    public final void method1841(boolean arg0) {
        field4125++;
        class450 var2 = this.field4127;
        synchronized (this.field4127) {
            this.field4127.method2406(18385);
        }
        class450 var3 = this.field4132;
        synchronized (this.field4132) {
            if (!arg0) {
                this.method1843(-73, 67);
            }
            this.field4132.method2406(18385);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method1842(String arg0, boolean arg1) {
        field4126++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + arg0.charAt(var4) - var3;
        }
        if (arg1) {
            method1842(null, false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(II)Lwa;")
    public final class662 method1843(int arg0, int arg1) {
        field4128++;
        class450 var3 = this.field4132;
        synchronized (this.field4132) {
            class662 var4 = (class662) this.field4132.method2418((long) arg0, (byte) 100);
            int var5 = 7 % ((arg1 + 28) / 58);
            if (var4 == null) {
                var4 = new class662(arg0);
                this.field4132.method2409((long) arg0, var4, 1);
            }
            return var4.method3733(true) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(II)Ldr;")
    public final class395 method1844(int arg0, int arg1) {
        field4122++;
        if (arg0 != 64) {
            return null;
        }
        class450 var3 = this.field4127;
        class395 var4;
        synchronized (this.field4127) {
            var4 = (class395) this.field4127.method2418((long) arg1, (byte) 100);
        }
        if (var4 != null) {
            return var4;
        }
        class612 var5 = this.field4123;
        byte[] var6;
        synchronized (this.field4123) {
            var6 = this.field4123.method3365(class374.method2037(-78, arg1), arg0 ^ 0xFFFFFFD1, client.method3816(arg1, (byte) 114));
        }
        class395 var7 = new class395();
        var7.field4966 = arg1;
        var7.field4981 = this;
        if (var6 != null) {
            var7.method2118(arg0 + 6, new class630(var6));
        }
        var7.method2119(arg0 - 62);
        class450 var8 = this.field4127;
        synchronized (this.field4127) {
            this.field4127.method2409((long) arg1, var7, arg0 ^ 0x41);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Les;I)V")
    public static final void method1845(class630 arg0, int arg1) {
        for (int var2 = 0; var2 < class581.field8127; var2++) {
            int var3 = arg0.method3504(-13829);
            int var4 = arg0.method3470(13111);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class415.field5190[var3] != null) {
                class415.field5190[var3].field2901 = var4;
            }
        }
        if (arg1 != 6130) {
            method1845(null, -64);
        }
        field4129++;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lrf;ILpl;Lpl;Lpl;)V")
    public class322(class112 arg0, int arg1, class612 arg2, class612 arg3, class612 arg4) {
        this.field4123 = arg2;
        if (this.field4123 != null) {
            int var6 = this.field4123.method3342((byte) -107) - 1;
            this.field4123.method3349(var6, true);
        }
        class100.method571(arg4, arg3, 2, 21);
    }
}
