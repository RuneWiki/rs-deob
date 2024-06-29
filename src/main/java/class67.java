import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class67 extends class238 {

    @OriginalMember(owner = "client!al", name = "M", descriptor = "I")
    public int field765;

    @OriginalMember(owner = "client!al", name = "N", descriptor = "I")
    public int field766;

    @OriginalMember(owner = "client!al", name = "Q", descriptor = "F")
    public float field769;

    @OriginalMember(owner = "client!al", name = "R", descriptor = "F")
    public float field770;

    @OriginalMember(owner = "client!al", name = "S", descriptor = "Z")
    public boolean field771;

    @OriginalMember(owner = "client!al", name = "L", descriptor = "[I")
    public static int[] field764 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!al", name = "T", descriptor = "[[I")
    public static int[][] field772 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!al", name = "O", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!al", name = "P", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lur;IIIZ[I)V")
    public class67(class377 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field765 = arg2;
        this.field766 = arg3;
        if (super.field3364 != 34037) {
            this.field770 = this.field769 = 1.0F;
            this.field771 = true;
        } else {
            this.field769 = (float) arg3;
            this.field770 = (float) arg2;
            this.field771 = false;
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lur;IIII[I)V")
    public class67(class377 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field766 = arg2;
        this.field765 = arg1;
        this.method1497(arg2, 0, arg1, true, 0, arg5, 0, false, 0);
        this.field770 = (float) arg1 / (float) arg3;
        this.field771 = false;
        this.field769 = (float) arg2 / (float) arg4;
        this.method1499(false, 0, false);
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(II)V")
    public static final void method392(int arg0, int arg1) {
        ++field767;
        class475.method2904(-1503);
        int var2 = class180.field2350.method802(arg0, (byte) 96).field167;
        if (~var2 != -1) {
            if (arg1 != 7) {
                field764 = null;
            }
            int var3 = class52.field606.field2789[arg0];
            if (var2 == 5) {
                class270.field3616 = var3;
            }
            if (~var2 == -7) {
                class235.field3145 = var3;
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lur;IIIIIZ)V")
    public class67(class377 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        if (super.field3364 == 34037) {
            this.field769 = (float) arg5;
            this.field771 = false;
            this.field770 = (float) arg4;
        } else {
            this.field771 = true;
            this.field770 = this.field769 = 1.0F;
        }
        this.field765 = arg4;
        this.field766 = arg5;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lur;IIIII[BI)V")
    public class67(class377 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field765 = arg2;
        this.field766 = arg3;
        this.method1495(arg6, 0, 6407, 0, 0, arg3, arg7, 0, true, arg2);
        this.field771 = false;
        this.field769 = (float) arg3 / (float) arg5;
        this.field770 = (float) arg2 / (float) arg4;
        this.method1499(false, 0, false);
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lur;IIIIZ[BI)V")
    public class67(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (~super.field3364 != -34038) {
            this.field770 = this.field769 = 1.0F;
            this.field771 = true;
        } else {
            this.field771 = false;
            this.field770 = (float) arg3;
            this.field769 = (float) arg4;
        }
        this.field766 = arg4;
        this.field765 = arg3;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lur;IIIIIIZ)V")
    public class67(class377 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field771 = false;
        this.field766 = arg4;
        this.field765 = arg3;
        this.field769 = (float) arg4 / (float) arg6;
        this.field770 = (float) arg3 / (float) arg5;
        this.method1499(false, 0, false);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)V")
    public static void method393(boolean arg0) {
        if (!arg0) {
            field764 = null;
            field772 = null;
        }
    }
}
