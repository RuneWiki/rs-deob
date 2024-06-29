import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class504 implements class653 {

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "Lgi;")
    public class630 field7127;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "Z")
    public boolean field7126;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public int field7117;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public int field7119;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public int field7129;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public int field7123;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public int field7120;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public int field7118;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "Lut;")
    public class109 field7124;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public int field7121;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public int field7125;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field7122;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field7128;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "()V", line = 10)
    public static final void method2898() {
        class636.method3542(1, class41.field685);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)Lrw;", line = 16)
    public final class703 method351(byte arg0) {
        field7128++;
        return arg0 <= 73 ? null : class336.field4962;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(ILut;Lgi;IIIIIIIZ)V", line = 33)
    public class504(int arg0, class109 arg1, class630 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field7127 = arg2;
        this.field7126 = arg10;
        this.field7117 = arg4;
        this.field7119 = arg0;
        this.field7129 = arg8;
        this.field7123 = arg5;
        this.field7120 = arg6;
        this.field7118 = arg7;
        this.field7124 = arg1;
        this.field7121 = arg9;
        this.field7125 = arg3;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ)V", line = 51)
    public static final void method2899(int arg0, boolean arg1) {
        field7122++;
        for (class28 var2 = (class28) class436.field6382.method472((byte) -115); var2 != null; var2 = (class28) class436.field6382.method482(arg0 ^ 0xFFFFFFBF)) {
            if (var2.field430 != null) {
                class627.field8780.method2114(var2.field430);
                var2.field430 = null;
            }
            if (var2.field411 != null) {
                class627.field8780.method2114(var2.field411);
                var2.field411 = null;
            }
            var2.method3678(-1);
        }
        if (arg0 != 1) {
            method2898();
        }
        if (!arg1) {
            return;
        }
        for (class28 var3 = (class28) class490.field6944.method472((byte) -39); var3 != null; var3 = (class28) class490.field6944.method482(-110)) {
            if (var3.field430 != null) {
                class627.field8780.method2114(var3.field430);
                var3.field430 = null;
            }
            var3.method3678(arg0 ^ 0xFFFFFFFE);
        }
        for (class28 var4 = (class28) class423.field6151.method1407(38); var4 != null; var4 = (class28) class423.field6151.method1413(true)) {
            if (var4.field430 != null) {
                class627.field8780.method2114(var4.field430);
                var4.field430 = null;
            }
            var4.method3678(-1);
        }
    }
}
