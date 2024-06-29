import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public abstract class class205 extends class132 {

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "Z")
    public boolean field3812;

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "[Ltg;")
    public class205[] field3822;

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "Lvd;")
    public static class222 field3820 = class212.method1357(":chalreq:", 10731);

    @OriginalMember(owner = "client!tg", name = "Q", descriptor = "Lvd;")
    public static class222 field3828 = class212.method1357("blinken3:", 10731);

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "Z")
    public static boolean field3827 = false;

    @OriginalMember(owner = "client!tg", name = "J", descriptor = "Lvd;")
    public static class222 field3821 = class212.method1357("Neuer Benutzer", 10731);

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
    public static int field3804 = 0;

    @OriginalMember(owner = "client!tg", name = "R", descriptor = "I")
    public static int field3829 = 0;

    @OriginalMember(owner = "client!tg", name = "T", descriptor = "I")
    public static int field3831 = 3353893;

    @OriginalMember(owner = "client!tg", name = "S", descriptor = "Lvd;")
    private static class222 field3830 = class212.method1357(" seconds)3", 10731);

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "Lvd;")
    public static class222 field3813 = field3830;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "I")
    public int field3814;

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!tg", name = "H", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!tg", name = "N", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!tg", name = "O", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!tg", name = "U", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "Loi;")
    public class157 field3815;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "Lw;")
    public static class228 field3807;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "Lhj;")
    public class86 field3810;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "[[[B")
    public static byte[][][] field3808;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V")
    public void method64(boolean arg0) {
        field3825++;
        if (arg0) {
            field3828 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZI)Lla;")
    public static final class119 method1320(boolean arg0, int arg1) {
        field3809++;
        class119 var2 = (class119) class81.field1550.method601((long) arg1, 70);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class55.field1034.method33(-29616, class123.method781(arg1, -102), class7.method60(102, arg1));
        class119 var4 = new class119();
        if (var3 != null) {
            var4.method762(new class109(var3), (byte) -58);
        }
        if (arg0) {
            return null;
        } else {
            class81.field1550.method593((long) arg1, var4, (byte) -12);
            return var4;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lka;BI)V")
    public void method2(class109 arg0, byte arg1, int arg2) {
        int var4 = 49 % ((-arg1 - 47) / 34);
        field3819++;
    }

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)V")
    public void method95(int arg0) {
        field3832++;
        if (this.field3812) {
            this.field3810.method555(200652353);
            this.field3810 = null;
        } else {
            this.field3815.method999(21122);
            this.field3815 = null;
        }
        if (arg0 != 3) {
            method1320(false, 70);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        class156 var8 = new class156();
        var8.field2986 = arg2 / 128;
        var8.field2970 = arg3 / 128;
        var8.field2974 = arg4 / 128;
        var8.field2982 = arg5 / 128;
        var8.field2980 = arg1;
        var8.field2967 = arg2;
        var8.field2971 = arg3;
        var8.field2984 = arg4;
        var8.field2965 = arg5;
        var8.field2985 = arg6;
        var8.field2966 = arg7;
        class221.field4107[arg0][class221.field4105[arg0]++] = var8;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IBI)[I")
    public final int[] method1322(int arg0, byte arg1, int arg2) {
        field3806++;
        if (arg1 < 52) {
            field3827 = true;
        }
        return this.field3822[arg2].field3812 ? this.field3822[arg2].method4(0, arg0) : this.field3822[arg2].method96(arg0, (byte) 100)[0];
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)[I")
    public int[] method4(int arg0, int arg1) {
        if (arg0 == 0) {
            field3805++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)I")
    public int method97(int arg0) {
        field3817++;
        if (arg0 != 8521) {
            method1321(-4, -123, 61, -29, -11, 94, 112, -119);
        }
        return -1;
    }

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "(I)I")
    public int method214(int arg0) {
        field3824++;
        return arg0 >= -60 ? -19 : -1;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)[[I")
    public final int[][] method1323(int arg0, int arg1, int arg2) {
        if (arg2 != -5920) {
            this.method1323(72, 99, -52);
        }
        field3823++;
        if (this.field3822[arg0].field3812) {
            int[] var4 = this.field3822[arg0].method4(0, arg1);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field3822[arg0].method96(arg1, (byte) 108);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IB)[[I")
    public int[][] method96(int arg0, byte arg1) {
        if (arg1 < 98) {
            return null;
        } else {
            field3826++;
            throw new IllegalStateException("This operation does not have a colour output");
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BII)V")
    public final void method1324(byte arg0, int arg1, int arg2) {
        if (arg0 < 100) {
            return;
        }
        field3811++;
        int var4 = this.field3814 == 255 ? arg2 : this.field3814;
        if (this.field3812) {
            this.field3810 = new class86(var4, arg2, arg1);
        } else {
            this.field3815 = new class157(var4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(IZ)V")
    public class205(int arg0, boolean arg1) {
        this.field3812 = arg1;
        this.field3822 = new class205[arg0];
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)V")
    public static void method1325(byte arg0) {
        field3813 = null;
        field3808 = null;
        field3828 = null;
        field3821 = null;
        field3807 = null;
        if (arg0 > -99) {
            field3813 = null;
        }
        field3830 = null;
        field3820 = null;
    }
}
