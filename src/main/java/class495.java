import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class495 extends class616 {

    @OriginalMember(owner = "client!iaa", name = "K", descriptor = "I")
    public int field6742;

    @OriginalMember(owner = "client!iaa", name = "H", descriptor = "I")
    public int field6739;

    @OriginalMember(owner = "client!iaa", name = "I", descriptor = "F")
    public float field6740;

    @OriginalMember(owner = "client!iaa", name = "M", descriptor = "F")
    public float field6744;

    @OriginalMember(owner = "client!iaa", name = "Q", descriptor = "Z")
    public boolean field6747;

    @OriginalMember(owner = "client!iaa", name = "O", descriptor = "I")
    public static int field6746 = 0;

    @OriginalMember(owner = "client!iaa", name = "L", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!iaa", name = "N", descriptor = "I")
    public static int field6745;

    @OriginalMember(owner = "client!iaa", name = "J", descriptor = "Lni;")
    public static class522 field6741;

    @OriginalMember(owner = "client!iaa", name = "e", descriptor = "(I)V", line = 4)
    public static void method2765(int arg0) {
        if (arg0 == -16573) {
            field6741 = null;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lac;IIII[I)V", line = 14)
    public class495(class541 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field6742 = arg1;
        this.field6739 = arg2;
        this.method3467(arg2, arg5, 0, 3656, true, 0, 0, arg1, 0);
        this.field6740 = (float) arg1 / (float) arg3;
        this.field6744 = (float) arg2 / (float) arg4;
        this.field6747 = false;
        this.method3471(false, 10242, false);
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lac;IIIII)V", line = 30)
    public class495(class541 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field6747 = false;
        this.field6739 = arg3;
        this.field6742 = arg2;
        this.field6740 = (float) arg2 / (float) arg4;
        this.field6744 = (float) arg3 / (float) arg5;
        this.method3471(false, 10242, false);
    }

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "(Z)V", line = 44)
    public static final void method2766(boolean arg0) {
        ++field6745;
        if (class568.field8003 != null) {
            try {
                class568.field8003.close();
            } catch (IOException var1) {
            }
        }
        if (!arg0) {
            method2766(true);
        }
        class568.field8003 = null;
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lac;IIIIIZ)V", line = 66)
    public class495(class541 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field6739 = arg5;
        if (super.field2849 == 34037) {
            this.field6744 = (float) arg5;
            this.field6740 = (float) arg4;
            this.field6747 = false;
        } else {
            this.field6747 = true;
            this.field6740 = this.field6744 = 1.0F;
        }
        this.field6742 = arg4;
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lac;IIIIZ[BI)V", line = 90)
    public class495(class541 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (super.field2849 == 34037) {
            this.field6747 = false;
            this.field6740 = (float) arg3;
            this.field6744 = (float) arg4;
        } else {
            this.field6740 = this.field6744 = 1.0F;
            this.field6747 = true;
        }
        this.field6742 = arg3;
        this.field6739 = arg4;
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lac;IIII)V", line = 112)
    public class495(class541 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field6742 = arg3;
        if (super.field2849 != 34037) {
            this.field6740 = this.field6744 = 1.0F;
            this.field6747 = true;
        } else {
            this.field6747 = false;
            this.field6744 = (float) arg4;
            this.field6740 = (float) arg3;
        }
        this.field6739 = arg4;
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lac;IIIIIIZ)V", line = 136)
    public class495(class541 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field6744 = (float) arg4 / (float) arg6;
        this.field6739 = arg4;
        this.field6740 = (float) arg3 / (float) arg5;
        this.field6742 = arg3;
        this.field6747 = false;
        this.method3471(false, 10242, false);
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lac;IIIII[BI)V", line = 149)
    public class495(class541 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field6739 = arg3;
        this.field6742 = arg2;
        this.method3466(arg2, arg7, true, 0, arg6, 0, (byte) -80, 0, 0, arg3);
        this.field6747 = false;
        this.field6744 = (float) arg3 / (float) arg5;
        this.field6740 = (float) arg2 / (float) arg4;
        this.method3471(false, 10242, false);
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lac;IIIZ[III)V", line = 164)
    public class495(class541 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field6742 = arg2;
        if (~super.field2849 == -34038) {
            this.field6747 = false;
            this.field6744 = (float) arg3;
            this.field6740 = (float) arg2;
        } else {
            this.field6740 = this.field6744 = 1.0F;
            this.field6747 = true;
        }
        this.field6739 = arg3;
    }
}
