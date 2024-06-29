import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class546 extends class673 {

    @OriginalMember(owner = "client!ot", name = "Q", descriptor = "Z")
    public boolean field7680;

    @OriginalMember(owner = "client!ot", name = "M", descriptor = "F")
    public float field7676;

    @OriginalMember(owner = "client!ot", name = "S", descriptor = "F")
    public float field7682;

    @OriginalMember(owner = "client!ot", name = "N", descriptor = "I")
    public int field7677;

    @OriginalMember(owner = "client!ot", name = "R", descriptor = "I")
    public int field7681;

    @OriginalMember(owner = "client!ot", name = "P", descriptor = "I")
    public static int field7679 = 2;

    @OriginalMember(owner = "client!ot", name = "T", descriptor = "Lmf;")
    public static class382 field7683 = new class382(64);

    @OriginalMember(owner = "client!ot", name = "O", descriptor = "I")
    public static int field7678;

    @OriginalMember(owner = "client!ot", name = "U", descriptor = "I")
    public static int field7684;

    @OriginalMember(owner = "client!ot", name = "V", descriptor = "I")
    public static int field7685;

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lok;IIII)V")
    public class546(class228 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        if (~super.field9226 == -34038) {
            this.field7680 = false;
            this.field7676 = (float) arg3;
            this.field7682 = (float) arg4;
        } else {
            this.field7676 = this.field7682 = 1.0F;
            this.field7680 = true;
        }
        this.field7677 = arg4;
        this.field7681 = arg3;
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lok;IIIIZ[BI)V")
    public class546(class228 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (super.field9226 != 34037) {
            this.field7680 = true;
            this.field7676 = this.field7682 = 1.0F;
        } else {
            this.field7676 = (float) arg3;
            this.field7680 = false;
            this.field7682 = (float) arg4;
        }
        this.field7677 = arg4;
        this.field7681 = arg3;
    }

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "(B)V")
    public static void method3089(byte arg0) {
        if (arg0 != -106) {
            method3092((byte) -45, 103);
        }
        field7683 = null;
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lok;IIII[I)V")
    public class546(class228 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field7681 = arg1;
        this.field7677 = arg2;
        this.method3733(arg5, arg2, 0, (byte) 80, 0, 0, arg1, true, 0);
        this.field7682 = (float) arg2 / (float) arg4;
        this.field7680 = false;
        this.field7676 = (float) arg1 / (float) arg3;
        this.method3736(-100, false, false);
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lok;IIIIIIZ)V")
    public class546(class228 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field7680 = false;
        this.field7681 = arg3;
        this.field7676 = (float) arg3 / (float) arg5;
        this.field7677 = arg4;
        this.field7682 = (float) arg4 / (float) arg6;
        this.method3736(-88, false, false);
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lok;IIIIIZ)V")
    public class546(class228 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field7677 = arg5;
        if (~super.field9226 == -34038) {
            this.field7676 = (float) arg4;
            this.field7680 = false;
            this.field7682 = (float) arg5;
        } else {
            this.field7676 = this.field7682 = 1.0F;
            this.field7680 = true;
        }
        this.field7681 = arg4;
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lok;IIIII[BI)V")
    public class546(class228 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field7681 = arg2;
        this.field7677 = arg3;
        this.method3732(arg6, -6577, arg2, 0, 0, true, 0, 0, arg7, arg3);
        this.field7680 = false;
        this.field7676 = (float) arg2 / (float) arg4;
        this.field7682 = (float) arg3 / (float) arg5;
        this.method3736(-101, false, false);
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lok;IIIII)V")
    public class546(class228 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field7682 = (float) arg3 / (float) arg5;
        this.field7680 = false;
        this.field7677 = arg3;
        this.field7681 = arg2;
        this.field7676 = (float) arg2 / (float) arg4;
        this.method3736(-110, false, false);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(BIIILut;ILgi;IIIII)V")
    public static final void method3090(byte arg0, int arg1, int arg2, int arg3, class109 arg4, int arg5, class630 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        class677.field9580 = arg9;
        class35.field609 = arg8;
        class564.field7964 = arg4;
        if (arg0 <= -7) {
            class426.field6276 = arg2;
            class100.field1563 = null;
            ++field7678;
            class345.field5035 = arg6;
            class383.field5412 = arg11;
            class124.field1868 = arg3;
            class252.field3879 = null;
            class230.field3599 = arg1;
            class539.field7553 = null;
            class310.field4596 = arg10;
            class576.field8107 = arg7;
            class176.field2512 = arg5;
            class632.method3515(-23978);
            class683.field9627 = true;
        }
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(II)V")
    public static final void method3091(int arg0, int arg1) {
        ++field7684;
        if (arg0 != 0) {
            field7683 = null;
        }
        class191 var2 = class6.method38(2, arg0 ^ -115, arg1);
        var2.method1284((byte) -71);
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lok;IIIZ[I)V")
    public class546(class228 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field7677 = arg3;
        if (~super.field9226 != -34038) {
            this.field7680 = true;
            this.field7676 = this.field7682 = 1.0F;
        } else {
            this.field7676 = (float) arg2;
            this.field7682 = (float) arg3;
            this.field7680 = false;
        }
        this.field7681 = arg2;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(BI)Lsk;")
    public static final class576 method3092(byte arg0, int arg1) {
        int var2 = 94 / ((-9 - arg0) / 34);
        ++field7685;
        return arg1 >= 0 && arg1 < 100 ? class85.field1395[arg1] : null;
    }
}
