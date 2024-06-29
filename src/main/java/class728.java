import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class728 {

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public int field10186 = 0;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public int field10190 = 0;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Lof;")
    private class620 field10183 = new class620(64);

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "Lev;")
    private class690 field10192 = null;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "Loh;")
    private class404 field10185;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "Loh;")
    private class404 field10184;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field10187;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field10188;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field10189;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field10191;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIB)Z", line = 7)
    public static final boolean method4056(int arg0, int arg1, byte arg2) {
        int var3 = 123 / ((arg2 + 34) / 63);
        field10189++;
        if (arg1 >= 0 && arg0 >= 0 && arg1 < class100.field1043[1].length && arg0 < class100.field1043[1][arg1].length) {
            return (class100.field1043[1][arg1][arg0] & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILsq;[IJ)Ljava/lang/String;", line = 25)
    public final String method4057(int arg0, class178 arg1, int[] arg2, long arg3) {
        field10187++;
        if (arg0 != 1) {
            return null;
        }
        if (this.field10192 != null) {
            String var6 = this.field10192.method1416(arg2, arg3, true, arg1);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg3);
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(ILoh;Loh;Lev;)V", line = 101)
    public class728(int arg0, class404 arg1, class404 arg2, class690 arg3) {
        this.field10185 = arg2;
        this.field10192 = arg3;
        this.field10184 = arg1;
        if (this.field10184 != null) {
            this.field10186 = this.field10184.method2482(0, 1);
        }
        if (this.field10185 != null) {
            this.field10190 = this.field10185.method2482(0, 1);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)Ltk;", line = 59)
    public final class343 method4058(int arg0, byte arg1) {
        field10191++;
        class343 var3 = (class343) this.field10183.method3538((long) arg0, arg1 ^ 0x52);
        if (var3 != null) {
            return var3;
        }
        if (arg1 != 82) {
            this.method4058(-56, (byte) -68);
        }
        byte[] var4;
        if (arg0 < 32768) {
            var4 = this.field10184.method2481(1, arg0, (byte) 122);
        } else {
            var4 = this.field10185.method2481(1, arg0 & 0x7FFF, (byte) 108);
        }
        class343 var5 = new class343();
        var5.field4455 = this;
        if (var4 != null) {
            var5.method2044(new class244(var4), (byte) 95);
        }
        if (arg0 >= 32768) {
            var5.method2043((byte) -26);
        }
        this.field10183.method3537(-100, (long) arg0, var5);
        return var5;
    }
}
