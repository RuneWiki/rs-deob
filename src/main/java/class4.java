import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public abstract class class4 extends class108 {

    @OriginalMember(owner = "client!ar", name = "q", descriptor = "[Lar;")
    public class4[] field33;

    @OriginalMember(owner = "client!ar", name = "B", descriptor = "Z")
    public boolean field44;

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "[C")
    public static char[] field27 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
    public int field28;

    @OriginalMember(owner = "client!ar", name = "m", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ar", name = "n", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ar", name = "p", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ar", name = "r", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!ar", name = "s", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ar", name = "t", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!ar", name = "u", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!ar", name = "w", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!ar", name = "x", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!ar", name = "y", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!ar", name = "z", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ar", name = "A", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!ar", name = "C", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ar", name = "D", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!ar", name = "o", descriptor = "Lao;")
    public class367 field31;

    @OriginalMember(owner = "client!ar", name = "v", descriptor = "Lou;")
    public class546 field38;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
    public static void method9(int arg0) {
        field27 = null;
        if (arg0 != 114) {
            field27 = null;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)I")
    public static final int method10(byte arg0) {
        field39++;
        if (arg0 != 65) {
            method12(115, true, 101);
        }
        return 42;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(BII)V")
    public void method11(byte arg0, int arg1, int arg2) {
        field34++;
        int var4 = this.field28 == 255 ? arg2 : this.field28;
        if (arg0 != 86) {
            this.method22(61, (byte) -97, -43);
        }
        if (this.field44) {
            this.field31 = new class367(var4, arg2, arg1);
        } else {
            this.field38 = new class546(var4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IZI)Z")
    public static final boolean method12(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return false;
        } else {
            field45++;
            return (arg2 & 0x180) != 0;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILge;I)V")
    public void method13(int arg0, class551 arg1, int arg2) {
        if (arg0 < -89) {
            field30++;
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)V")
    public void method14(int arg0) {
        if (this.field44) {
            this.field31.method2257(-123);
            this.field31 = null;
        } else {
            this.field38.method3022(false);
            this.field38 = null;
        }
        field36++;
        if (arg0 != 26131) {
            this.field38 = null;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(BI)[I")
    public int[] method15(byte arg0, int arg1) {
        if (arg0 != 10) {
            this.method14(-9);
        }
        field46++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(I)I")
    public int method16(int arg0) {
        field26++;
        if (arg0 != 112) {
            method10((byte) -51);
        }
        return -1;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IB)[[I")
    public int[][] method17(int arg0, byte arg1) {
        if (arg1 > -83) {
            return null;
        } else {
            field32++;
            throw new IllegalStateException("This operation does not have a colour output");
        }
    }

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "(I)V")
    public void method18(int arg0) {
        field29++;
        if (arg0 != -9) {
            this.field33 = null;
        }
    }

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "(I)I")
    public int method19(int arg0) {
        if (arg0 == 102) {
            field37++;
            return -1;
        } else {
            return -6;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(III)[I")
    public final int[] method20(int arg0, int arg1, int arg2) {
        if (arg1 == -21986) {
            field41++;
            return this.field33[arg0].field44 ? this.field33[arg0].method15((byte) 10, arg2) : this.field33[arg0].method17(arg2, (byte) -86)[0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(IZI)Z")
    public static final boolean method21(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method12(-57, true, -128);
        }
        field35++;
        return (arg2 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IBI)[[I")
    public final int[][] method22(int arg0, byte arg1, int arg2) {
        if (arg1 >= -74) {
            this.field31 = null;
        }
        field43++;
        if (this.field33[arg2].field44) {
            int[] var4 = this.field33[arg2].method15((byte) 10, arg0);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field33[arg2].method17(arg0, (byte) -89);
        }
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(IZ)V")
    public class4(int arg0, boolean arg1) {
        this.field33 = new class4[arg0];
        this.field44 = arg1;
    }
}
