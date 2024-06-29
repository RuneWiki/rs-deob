import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class9 extends class246 {

    @OriginalMember(owner = "client!of", name = "L", descriptor = "I")
    public int field74;

    @OriginalMember(owner = "client!of", name = "F", descriptor = "I")
    public int field68;

    @OriginalMember(owner = "client!of", name = "J", descriptor = "F")
    public float field72;

    @OriginalMember(owner = "client!of", name = "I", descriptor = "F")
    public float field71;

    @OriginalMember(owner = "client!of", name = "G", descriptor = "Z")
    public boolean field69;

    @OriginalMember(owner = "client!of", name = "K", descriptor = "Lgr;")
    public static class530 field73 = new class530(31, 16);

    @OriginalMember(owner = "client!of", name = "H", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(B)V")
    public static void method31(byte arg0) {
        field73 = null;
        if (arg0 != -119) {
            field73 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lkw;IIIZ[III)V")
    public class9(class346 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field74 = arg2;
        this.field68 = arg3;
        if (~super.field2261 != -34038) {
            this.field71 = this.field72 = 1.0F;
            this.field69 = true;
        } else {
            this.field72 = (float) arg3;
            this.field71 = (float) arg2;
            this.field69 = false;
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lkw;IIIII)V")
    public class9(class346 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field72 = (float) arg3 / (float) arg5;
        this.field68 = arg3;
        this.field74 = arg2;
        this.field71 = (float) arg2 / (float) arg4;
        this.field69 = false;
        this.method1676(false, false, (byte) 97);
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lkw;IIIIIIZ)V")
    public class9(class346 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field72 = (float) arg4 / (float) arg6;
        this.field68 = arg4;
        this.field74 = arg3;
        this.field69 = false;
        this.field71 = (float) arg3 / (float) arg5;
        this.method1676(false, false, (byte) 123);
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lkw;IIIII[BI)V")
    public class9(class346 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field74 = arg2;
        this.field68 = arg3;
        this.method1672(arg6, 0, arg2, arg7, 0, 1622, arg3, 0, true, 0);
        this.field71 = (float) arg2 / (float) arg4;
        this.field72 = (float) arg3 / (float) arg5;
        this.field69 = false;
        this.method1676(false, false, (byte) 64);
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lkw;IIIIIZ)V")
    public class9(class346 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        if (~super.field2261 == -34038) {
            this.field69 = false;
            this.field72 = (float) arg5;
            this.field71 = (float) arg4;
        } else {
            this.field69 = true;
            this.field71 = this.field72 = 1.0F;
        }
        this.field68 = arg5;
        this.field74 = arg4;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lkw;IIII[I)V")
    public class9(class346 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field68 = arg2;
        this.field74 = arg1;
        this.method1675(true, 0, (byte) 80, arg1, 0, arg2, 0, arg5, 0);
        this.field69 = false;
        this.field72 = (float) arg2 / (float) arg4;
        this.field71 = (float) arg1 / (float) arg3;
        this.method1676(false, false, (byte) 61);
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lkw;IIII)V")
    public class9(class346 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        if (super.field2261 != 34037) {
            this.field69 = true;
            this.field71 = this.field72 = 1.0F;
        } else {
            this.field69 = false;
            this.field72 = (float) arg4;
            this.field71 = (float) arg3;
        }
        this.field68 = arg4;
        this.field74 = arg3;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(III)I")
    public static final int method32(int arg0, int arg1, int arg2) {
        if (arg1 <= 67) {
            field73 = null;
        }
        ++field70;
        return ~arg2 != -2 && ~arg2 != -4 ? class246.field3599[arg0 & 3] : class126.field1738[arg0 & 3];
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lkw;IIIIZ[BI)V")
    public class9(class346 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (super.field2261 != 34037) {
            this.field71 = this.field72 = 1.0F;
            this.field69 = true;
        } else {
            this.field71 = (float) arg3;
            this.field69 = false;
            this.field72 = (float) arg4;
        }
        this.field68 = arg4;
        this.field74 = arg3;
    }
}
