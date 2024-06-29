import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public abstract class class219 extends class151 {

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "Z")
    public boolean field3647;

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "[Lnl;")
    public class219[] field3649;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "I")
    public static int field3652 = 0;

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "I")
    public static int field3657 = 0;

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "I")
    public int field3653;

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!nl", name = "F", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!nl", name = "H", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!nl", name = "I", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "Lqa;")
    public class296 field3654;

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "Lub;")
    public class58 field3651;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZI)[[I", line = 7)
    public final int[][] method1583(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.field3647 = false;
        }
        field3658++;
        if (this.field3649[arg2].field3647) {
            int[] var4 = this.field3649[arg2].method41(arg1, arg0);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field3649[arg2].method219(arg0, (byte) 83);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIB)V", line = 41)
    public final void method1584(int arg0, int arg1, byte arg2) {
        if (arg2 >= -20) {
            this.method1584(-25, -39, (byte) -69);
        }
        field3650++;
        int var4 = this.field3653 == 255 ? arg0 : this.field3653;
        if (this.field3647) {
            this.field3654 = new class296(var4, arg0, arg1);
        } else {
            this.field3651 = new class58(var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)[I", line = 70)
    public final int[] method1585(int arg0, int arg1, int arg2) {
        field3659++;
        if (arg2 == -6606) {
            return this.field3649[arg0].field3647 ? this.field3649[arg0].method41(true, arg1) : this.field3649[arg0].method219(arg1, (byte) 83)[0];
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IB)[[I", line = 98)
    public int[][] method219(int arg0, byte arg1) {
        field3648++;
        if (arg1 == 83) {
            throw new IllegalStateException("This operation does not have a colour output");
        }
        return (int[][]) ((int[][]) null);
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(B)V", line = 116)
    public void method39(byte arg0) {
        if (arg0 != 22) {
            this.field3651 = (class58) null;
        }
        field3643++;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IILb;)V", line = 134)
    public void method42(int arg0, int arg1, class94 arg2) {
        field3656++;
        if (arg1 != 0) {
            this.field3647 = true;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)I", line = 148)
    public int method1396(int arg0) {
        field3646++;
        if (arg0 != 1) {
            this.method1584(89, -86, (byte) -97);
        }
        return -1;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V", line = 159)
    public void method216(int arg0) {
        if (arg0 >= -12) {
            this.field3649 = (class219[]) null;
        }
        if (this.field3647) {
            this.field3654.method2027(-2);
            this.field3654 = null;
        } else {
            this.field3651.method407(120);
            this.field3651 = null;
        }
        field3645++;
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(B)I", line = 195)
    public int method215(byte arg0) {
        if (arg0 >= -120) {
            return 65;
        } else {
            field3644++;
            return -1;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZI)[I", line = 206)
    public int[] method41(boolean arg0, int arg1) {
        field3655++;
        if (!arg0) {
            this.method1585(-46, -88, 12);
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(IZ)V", line = 219)
    public class219(int arg0, boolean arg1) {
        this.field3647 = arg1;
        this.field3649 = new class219[arg0];
    }
}
