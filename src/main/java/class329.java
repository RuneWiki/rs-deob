import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class329 {

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "Lof;")
    private class620 field4259 = new class620(64);

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "Loh;")
    private class404 field4258;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "Z")
    public static boolean field4261 = false;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V", line = 3)
    public final void method1963(byte arg0) {
        class620 var2 = this.field4259;
        synchronized (this.field4259) {
            this.field4259.method3549(arg0 ^ 0xFFFFFFE2);
        }
        if (arg0 != -30) {
            field4261 = false;
        }
        field4263++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)I", line = 19)
    public static final int method1964(int arg0, int arg1) {
        field4260++;
        return arg1 == 31 ? arg0 >>> 10 : -83;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V", line = 32)
    public final void method1965(int arg0) {
        if (arg0 != 6) {
            method1966(58, -78, 69);
        }
        field4262++;
        class620 var2 = this.field4259;
        synchronized (this.field4259) {
            this.field4259.method3541(arg0 ^ 0xFFFFFD7F);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V", line = 46)
    public static final void method1966(int arg0, int arg1, int arg2) {
        field4265++;
        class47 var3 = class258.method1546(6, arg2, (byte) 121);
        if (arg1 != 64) {
            field4261 = false;
        }
        var3.method271((byte) 127);
        var3.field507 = arg0;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)V", line = 60)
    public final void method1967(int arg0, int arg1) {
        field4256++;
        class620 var3 = this.field4259;
        synchronized (this.field4259) {
            this.field4259.method3539((byte) -39, arg1);
        }
        if (arg0 != -30610) {
            this.field4258 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)Lpn;", line = 78)
    public final class742 method1968(int arg0, byte arg1) {
        int var3 = -99 / ((arg1 - 28) / 56);
        field4267++;
        class620 var4 = this.field4259;
        class742 var5;
        synchronized (this.field4259) {
            var5 = (class742) this.field4259.method3538((long) arg0, 0);
        }
        if (var5 != null) {
            return var5;
        }
        class404 var6 = this.field4258;
        byte[] var7;
        synchronized (this.field4258) {
            var7 = this.field4258.method2481(31, arg0, (byte) 106);
        }
        class742 var8 = new class742();
        if (var7 != null) {
            var8.method4130(-1, new class244(var7));
        }
        class620 var9 = this.field4259;
        synchronized (this.field4259) {
            this.field4259.method3537(-81, (long) arg0, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)I", line = 111)
    public static final int method1969(int arg0, int arg1) {
        if (arg0 <= 46) {
            return -52;
        } else {
            field4264++;
            return arg1 == 16711935 ? -1 : class301.method1802(arg1, (byte) -6);
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lnb;ILoh;)V", line = 150)
    public class329(class301 arg0, int arg1, class404 arg2) {
        this.field4258 = arg2;
        this.field4258.method2482(0, 31);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILjava/lang/String;)V", line = 129)
    public static final void method1970(int arg0, String arg1) {
        field4266++;
        if (arg0 != 31) {
            method1964(-117, -46);
        }
        if (class75.field795 == null) {
            return;
        }
        class160.field1768++;
        class249 var2 = class289.method1715(class361.field4642, arg0 ^ 0x5D, class41.field470);
        var2.field3016.method1460(class729.method4063(-1, arg1), arg0 ^ 0x6099);
        var2.field3016.method1480(arg1, false);
        class510.method3017(var2, 108);
    }
}
