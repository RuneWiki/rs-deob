import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class63 extends class299 {

    @OriginalMember(owner = "client!ps", name = "P", descriptor = "I")
    public int field743;

    @OriginalMember(owner = "client!ps", name = "U", descriptor = "I")
    public int field748;

    @OriginalMember(owner = "client!ps", name = "V", descriptor = "F")
    public float field749;

    @OriginalMember(owner = "client!ps", name = "S", descriptor = "F")
    public float field746;

    @OriginalMember(owner = "client!ps", name = "X", descriptor = "Z")
    public boolean field751;

    @OriginalMember(owner = "client!ps", name = "T", descriptor = "I")
    public static int field747 = 0;

    @OriginalMember(owner = "client!ps", name = "Y", descriptor = "I")
    public static int field752 = 0;

    @OriginalMember(owner = "client!ps", name = "O", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!ps", name = "Q", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!ps", name = "R", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!ps", name = "W", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lfd;IIIII[BI)V")
    public class63(class365 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field743 = arg2;
        this.field748 = arg3;
        this.method1877(arg2, 0, arg6, arg3, arg7, 0, 0, 0, true, 56);
        this.field749 = (float) arg2 / (float) arg4;
        this.field746 = (float) arg3 / (float) arg5;
        this.field751 = false;
        this.method1882(10497, false, false);
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lfd;IIIIZ[BI)V")
    public class63(class365 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field743 = arg3;
        this.field748 = arg4;
        if (super.field5801 != 34037) {
            this.field749 = this.field746 = 1.0F;
            this.field751 = true;
        } else {
            this.field749 = (float) arg3;
            this.field751 = false;
            this.field746 = (float) arg4;
        }
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lfd;IIII[I)V")
    public class63(class365 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field748 = arg2;
        this.field743 = arg1;
        this.method1883(true, arg2, 0, 0, arg5, 0, (byte) -51, 0, arg1);
        this.field751 = false;
        this.field749 = (float) arg1 / (float) arg3;
        this.field746 = (float) arg2 / (float) arg4;
        this.method1882(10497, false, false);
    }

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "(I)V")
    public static final void method567(int arg0) {
        ++field745;
        class291.field4175 = 0;
        class498.field7394.method1016(-108);
        int var1 = 121 % ((arg0 - 50) / 46);
        class498.field7394.method1015(false, class56.field607);
        ++class291.field4175;
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lfd;IIIIIIZ)V")
    public class63(class365 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field743 = arg3;
        this.field748 = arg4;
        this.field751 = false;
        this.field749 = (float) arg3 / (float) arg5;
        this.field746 = (float) arg4 / (float) arg6;
        this.method1882(10497, false, false);
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lfd;IIIIIZ)V")
    public class63(class365 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field748 = arg5;
        if (~super.field5801 != -34038) {
            this.field751 = true;
            this.field749 = this.field746 = 1.0F;
        } else {
            this.field746 = (float) arg5;
            this.field751 = false;
            this.field749 = (float) arg4;
        }
        this.field743 = arg4;
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lfd;IIIZ[I)V")
    public class63(class365 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field743 = arg2;
        this.field748 = arg3;
        if (~super.field5801 == -34038) {
            this.field749 = (float) arg2;
            this.field746 = (float) arg3;
            this.field751 = false;
        } else {
            this.field751 = true;
            this.field749 = this.field746 = 1.0F;
        }
    }
}
