import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class8 extends class441 {

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
    public int field71;

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "I")
    public int field74;

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "F")
    public float field73;

    @OriginalMember(owner = "client!ck", name = "R", descriptor = "F")
    public float field75;

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "Z")
    public boolean field72;

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "Z")
    public static boolean field70 = false;

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "[I")
    public static int[] field67;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "[[I")
    public static int[][] field68;

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lag;IIIIIZ)V", line = 4)
    public class8(class469 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field71 = arg5;
        this.field74 = arg4;
        if (~super.field3417 != -34038) {
            this.field75 = this.field73 = 1.0F;
            this.field72 = true;
        } else {
            this.field73 = (float) arg5;
            this.field75 = (float) arg4;
            this.field72 = false;
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lag;IIIIIIZ)V", line = 26)
    public class8(class469 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field73 = (float) arg4 / (float) arg6;
        this.field71 = arg4;
        this.field72 = false;
        this.field75 = (float) arg3 / (float) arg5;
        this.field74 = arg3;
        this.method2495(false, false, (byte) -1);
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lag;IIIZ[I)V", line = 39)
    public class8(class469 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field74 = arg2;
        if (super.field3417 == 34037) {
            this.field73 = (float) arg3;
            this.field75 = (float) arg2;
            this.field72 = false;
        } else {
            this.field75 = this.field73 = 1.0F;
            this.field72 = true;
        }
        this.field71 = arg3;
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(III)Z", line = 63)
    public static final boolean method44(int arg0, int arg1, int arg2) {
        ++field69;
        if (arg2 != 15090) {
            return true;
        } else if (arg1 >= 0 && ~arg0 <= -1 && ~arg1 > ~class31.field440[1].length && ~arg0 > ~class31.field440[1][arg1].length) {
            return ~(2 & class31.field440[1][arg1][arg0]) != -1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lag;IIIIZ[BI)V", line = 80)
    public class8(class469 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field71 = arg4;
        if (~super.field3417 == -34038) {
            this.field75 = (float) arg3;
            this.field73 = (float) arg4;
            this.field72 = false;
        } else {
            this.field72 = true;
            this.field75 = this.field73 = 1.0F;
        }
        this.field74 = arg3;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lag;IIII[I)V", line = 102)
    public class8(class469 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field71 = arg2;
        this.field74 = arg1;
        this.method2493(0, 0, arg5, -3, true, arg2, arg1, 0, 0);
        this.field72 = false;
        this.field73 = (float) arg2 / (float) arg4;
        this.field75 = (float) arg1 / (float) arg3;
        this.method2495(false, false, (byte) -1);
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lag;IIIII)V", line = 117)
    public class8(class469 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field71 = arg3;
        this.field74 = arg2;
        this.field72 = false;
        this.field73 = (float) arg3 / (float) arg5;
        this.field75 = (float) arg2 / (float) arg4;
        this.method2495(false, false, (byte) -1);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)V", line = 131)
    public static void method45(boolean arg0) {
        field68 = null;
        if (arg0) {
            field67 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lag;IIIII[BI)V", line = 142)
    public class8(class469 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field74 = arg2;
        this.field71 = arg3;
        this.method2492(arg2, -83, 0, arg6, arg7, true, arg3, 0, 0, 0);
        this.field75 = (float) arg2 / (float) arg4;
        this.field72 = false;
        this.field73 = (float) arg3 / (float) arg5;
        this.method2495(false, false, (byte) -1);
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lag;IIII)V", line = 156)
    public class8(class469 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field74 = arg3;
        this.field71 = arg4;
        if (super.field3417 == 34037) {
            this.field72 = false;
            this.field73 = (float) arg4;
            this.field75 = (float) arg3;
        } else {
            this.field75 = this.field73 = 1.0F;
            this.field72 = true;
        }
    }
}
