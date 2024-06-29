import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public abstract class class288 extends class69 {

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "Z")
    public boolean field4612;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "[Lcj;")
    public class288[] field4606;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "Lsj;")
    public static class48 field4608 = new class48();

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "Lsh;")
    public static class260 field4613 = class253.method1656(62);

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
    public int field4603;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "Lsk;")
    public class113 field4598;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "Lwl;")
    public class77 field4609;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
    public void method16(byte arg0) {
        if (arg0 != -125) {
            this.field4606 = null;
        }
        field4601++;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)[I")
    public int[] method26(int arg0, int arg1) {
        field4610++;
        if (arg0 == 0) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return null;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)I")
    public int method857(byte arg0) {
        field4600++;
        if (arg0 != -57) {
            this.field4603 = 97;
        }
        return -1;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(II)[[I")
    public int[][] method34(int arg0, int arg1) {
        if (arg0 != 1) {
            this.field4603 = 85;
        }
        field4599++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIB)V")
    public final void method1929(int arg0, int arg1, byte arg2) {
        int var4 = this.field4603 == 255 ? arg0 : this.field4603;
        if (arg2 <= 51) {
            this.method857((byte) 55);
        }
        if (this.field4612) {
            this.field4609 = new class77(var4, arg0, arg1);
        } else {
            this.field4598 = new class113(var4, arg0, arg1);
        }
        field4611++;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(IIB)[[I")
    public final int[][] method1930(int arg0, int arg1, byte arg2) {
        field4602++;
        int var4 = -80 % ((arg2 + 46) / 53);
        if (!this.field4606[arg0].field4612) {
            return this.field4606[arg0].method34(1, arg1);
        }
        int[][] var5 = new int[3][];
        int[] var6 = this.field4606[arg0].method26(0, arg1);
        var5[0] = var6;
        var5[2] = var6;
        var5[1] = var6;
        return var5;
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V")
    public void method571(int arg0) {
        if (arg0 <= 2) {
            return;
        }
        if (this.field4612) {
            this.field4609.method580(64);
            this.field4609 = null;
        } else {
            this.field4598.method814((byte) 121);
            this.field4598 = null;
        }
        field4604++;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BII)[I")
    public final int[] method1931(byte arg0, int arg1, int arg2) {
        field4614++;
        if (arg0 > -112) {
            this.method571(72);
        }
        return this.field4606[arg1].field4612 ? this.field4606[arg1].method26(0, arg2) : this.field4606[arg1].method34(1, arg2)[0];
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(B)V")
    public static void method1932(byte arg0) {
        if (arg0 != -101) {
            field4613 = null;
        }
        field4613 = null;
        field4608 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lhi;BI)V")
    public void method20(class264 arg0, byte arg1, int arg2) {
        if (arg1 != -19) {
            this.method34(91, 116);
        }
        field4605++;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(IZ)V")
    public class288(int arg0, boolean arg1) {
        this.field4612 = arg1;
        this.field4606 = new class288[arg0];
    }

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)I")
    public int method568(int arg0) {
        if (arg0 != 255) {
            this.method1929(-63, -89, (byte) -126);
        }
        field4607++;
        return -1;
    }
}
