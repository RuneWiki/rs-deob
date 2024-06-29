import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class245 extends class132 {

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    private int field3525 = 0;

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "Z")
    public boolean field3534 = false;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "I")
    private int field3527 = -1;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "I")
    private int field3528 = -32768;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    private int field3520 = 0;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
    public int field3530;

    @OriginalMember(owner = "client!ma", name = "F", descriptor = "I")
    public int field3536;

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "I")
    public int field3533;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public int field3522;

    @OriginalMember(owner = "client!ma", name = "G", descriptor = "I")
    private int field3537;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
    public int field3523;

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "Lom;")
    private class125 field3532;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!ma", name = "E", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "Lsa;")
    private class265 field3531;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIII)V", line = 12)
    public final void method100(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3538++;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)Lq;", line = 32)
    private final class345 method1684(int arg0) {
        class309 var2 = class336.method2329(-63, this.field3537);
        field3526++;
        if (arg0 < 31) {
            return (class345) null;
        }
        class345 var3;
        if (this.field3534) {
            var3 = var2.method2122(-1, -35, -1, 0);
        } else {
            var3 = var2.method2122(this.field3520, 123, this.field3527, this.field3525);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIIIIJILsa;)V", line = 54)
    public final void method108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class265 arg10) {
        field3521++;
        class345 var13 = this.method1684(121);
        if (var13 != null) {
            var13.method108(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3531);
            this.field3528 = var13.method105();
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)V", line = 72)
    public final void method1685(byte arg0, int arg1) {
        if (arg0 != -57) {
            this.field3527 = -45;
        }
        field3540++;
        if (this.field3534) {
            return;
        }
        this.field3525 += arg1;
        while (this.field3525 > this.field3532.field1706[this.field3520]) {
            this.field3525 -= this.field3532.field1706[this.field3520];
            this.field3520++;
            if (this.field3520 >= this.field3532.field1707.length) {
                this.field3534 = true;
                break;
            }
        }
        if (!this.field3534) {
            class241.method1651(this.field3520, false, this.field3530, this.field3532, this.field3533, arg0 ^ 0x76);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()I", line = 112)
    public final int method105() {
        field3535++;
        return this.field3528;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(IIIIIII)V", line = 140)
    public class245(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3530 = arg2;
        this.field3536 = arg4;
        this.field3533 = arg3;
        this.field3522 = arg1;
        this.field3537 = arg0;
        this.field3523 = arg5 + arg6;
        int var8 = class336.method2329(-114, this.field3537).field4662;
        if (var8 == -1) {
            this.field3534 = true;
        } else {
            this.field3534 = false;
            this.field3532 = class52.method361(true, var8);
        }
        if (this.field3523 == arg6) {
            class241.method1651(this.field3520, false, this.field3530, this.field3532, this.field3533, -39);
        }
    }
}
