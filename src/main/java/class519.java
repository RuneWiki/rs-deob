import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class519 {

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "Ljda;")
    private class239 field7099 = new class239(128);

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "Laj;")
    private class333 field7096;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "I")
    public static int field7095;

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "I")
    public static int field7097;

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "I")
    public static int field7098;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(BII)I", line = 7)
    public static final int method3004(byte arg0, int arg1, int arg2) {
        field7098++;
        int var3 = class520.method3008(57, arg2 - 1, arg1 + -1) + class520.method3008(57, arg2 - 1, arg1 - -1) - (-class520.method3008(57, arg2 + 1, arg1 + -1) + -class520.method3008(57, arg2 + 1, arg1 + 1));
        int var4 = class520.method3008(57, arg2, arg1 - 1) + (class520.method3008(57, arg2, arg1 + 1) + class520.method3008(57, arg2 - 1, arg1)) + class520.method3008(57, arg2 - -1, arg1);
        int var5 = 75 % ((33 - arg0) / 56);
        int var6 = class520.method3008(57, arg2, arg1);
        return var6 / 4 + (var3 / 16 + (var4 / 8));
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(BI)Ltc;", line = 25)
    public final class373 method3005(byte arg0, int arg1) {
        int var3 = 49 % ((arg0 - 56) / 59);
        field7095++;
        class239 var4 = this.field7099;
        class373 var5;
        synchronized (this.field7099) {
            var5 = (class373) this.field7099.method1541(-10, (long) arg1);
        }
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = this.field7096.method2095(class122.method1000(255, arg1), class324.method2061(arg1, true), 1);
        class373 var7 = new class373();
        if (var6 != null) {
            var7.method2312((byte) 103, new class376(var6));
        }
        class239 var8 = this.field7099;
        synchronized (this.field7099) {
            this.field7099.method1544(true, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lgia;ILaj;)V", line = 60)
    public class519(class285 arg0, int arg1, class333 arg2) {
        this.field7096 = arg2;
        if (this.field7096 != null) {
            int var4 = this.field7096.method2094((byte) -115) - 1;
            this.field7096.method2090(var4, false);
        }
    }
}
