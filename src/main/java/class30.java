import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public abstract class class30 extends class401 {

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "[Lrk;")
    public class30[] field371;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "Z")
    public boolean field378;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!rk", name = "w", descriptor = "Lsea;")
    public static class648 field383;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "Lic;")
    public class650 field374;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "Lno;")
    public class653 field377;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)[I")
    public int[] method48(int arg0, int arg1) {
        field372++;
        if (arg0 == 1) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)I")
    public int method288(byte arg0) {
        if (arg0 > -82) {
            this.method290(20);
        }
        field385++;
        return -1;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)I")
    public int method289(int arg0) {
        if (arg0 != 0) {
            this.method292(58, 106, 81);
        }
        field379++;
        return -1;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V")
    public void method290(int arg0) {
        field375++;
        if (arg0 <= 19) {
            return;
        }
        if (this.field378) {
            this.field374.method3661((byte) 100);
            this.field374 = null;
        } else {
            this.field377.method3687(117);
            this.field377 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)V")
    public static void method291(int arg0) {
        int var1 = 61 / ((-arg0 - 17) / 52);
        field383 = null;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)V")
    public void method29(byte arg0) {
        if (arg0 >= -10) {
            this.method30(75, (byte) 119);
        }
        field381++;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB)[[I")
    public int[][] method30(int arg0, byte arg1) {
        field382++;
        if (arg1 != 7) {
            this.field378 = true;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)[[I")
    public final int[][] method292(int arg0, int arg1, int arg2) {
        field373++;
        if (arg0 <= 73) {
            return null;
        } else if (this.field371[arg1].field378) {
            int[] var4 = this.field371[arg1].method48(1, arg2);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field371[arg1].method30(arg2, (byte) 7);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZII)V")
    public void method293(boolean arg0, int arg1, int arg2) {
        field380++;
        int var4 = this.field376 == 255 ? arg1 : this.field376;
        if (arg0) {
            this.field378 = true;
        }
        if (this.field378) {
            this.field374 = new class650(var4, arg1, arg2);
        } else {
            this.field377 = new class653(var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BILac;)V")
    public void method27(byte arg0, int arg1, class501 arg2) {
        if (arg0 < 100) {
            this.field371 = null;
        }
        field384++;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(IZ)V")
    public class30(int arg0, boolean arg1) {
        this.field371 = new class30[arg0];
        this.field378 = arg1;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIB)[I")
    public final int[] method294(int arg0, int arg1, byte arg2) {
        int var4 = -54 % ((11 - arg2) / 58);
        field370++;
        return this.field371[arg1].field378 ? this.field371[arg1].method48(1, arg0) : this.field371[arg1].method30(arg0, (byte) 7)[0];
    }
}
