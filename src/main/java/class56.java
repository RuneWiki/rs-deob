import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public abstract class class56 extends class189 {

    @OriginalMember(owner = "client!tga", name = "r", descriptor = "Z")
    public boolean field674;

    @OriginalMember(owner = "client!tga", name = "k", descriptor = "[Ltga;")
    public class56[] field667;

    @OriginalMember(owner = "client!tga", name = "m", descriptor = "Lgda;")
    public static class53 field669 = new class53(69, -1);

    @OriginalMember(owner = "client!tga", name = "x", descriptor = "Lgda;")
    public static class53 field680 = new class53(62, 6);

    @OriginalMember(owner = "client!tga", name = "j", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!tga", name = "n", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!tga", name = "o", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!tga", name = "p", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!tga", name = "s", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!tga", name = "t", descriptor = "I")
    public int field676;

    @OriginalMember(owner = "client!tga", name = "u", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!tga", name = "v", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!tga", name = "w", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!tga", name = "y", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!tga", name = "z", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!tga", name = "A", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!tga", name = "B", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!tga", name = "l", descriptor = "Lqj;")
    public class509 field668;

    @OriginalMember(owner = "client!tga", name = "q", descriptor = "Lcv;")
    public class568 field673;

    @OriginalMember(owner = "client!tga", name = "C", descriptor = "Lee;")
    public static class675 field685;

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(I)I")
    public int method4(int arg0) {
        if (arg0 != 8347) {
            this.method365(-126);
        }
        field675++;
        return -1;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IZ)[I")
    public int[] method24(int arg0, boolean arg1) {
        field670++;
        if (arg1) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return null;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(II)[[I")
    public int[][] method5(int arg0, int arg1) {
        field677++;
        if (arg1 != 1) {
            this.method5(49, 33);
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "(I)V")
    public void method364(int arg0) {
        if (arg0 != 7) {
            this.field668 = null;
        }
        field666++;
    }

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "(B)V")
    public void method3(byte arg0) {
        int var2 = -93 % ((arg0 - 52) / 49);
        if (this.field674) {
            this.field673.method3271(-15341);
            this.field673 = null;
        } else {
            this.field668.method3012(-12665);
            this.field668 = null;
        }
        field683++;
    }

    @OriginalMember(owner = "client!tga", name = "c", descriptor = "(I)I")
    public int method365(int arg0) {
        if (arg0 != -1) {
            this.method369(91, 21, 67);
        }
        field678++;
        return -1;
    }

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "(III)V")
    public void method366(int arg0, int arg1, int arg2) {
        field672++;
        int var4 = this.field676 == 255 ? arg0 : this.field676;
        if (this.field674) {
            this.field673 = new class568(var4, arg0, arg2);
        } else {
            this.field668 = new class509(var4, arg0, arg2);
        }
        if (arg1 != -1) {
            this.field676 = -20;
        }
    }

    @OriginalMember(owner = "client!tga", name = "c", descriptor = "(III)[I")
    public final int[] method367(int arg0, int arg1, int arg2) {
        if (arg0 != 4463) {
            this.field667 = null;
        }
        field681++;
        return this.field667[arg1].field674 ? this.field667[arg1].method24(arg2, true) : this.field667[arg1].method5(arg2, 1)[0];
    }

    @OriginalMember(owner = "client!tga", name = "d", descriptor = "(I)V")
    public static void method368(int arg0) {
        field680 = null;
        field669 = null;
        field685 = null;
        if (arg0 != 0) {
            field680 = null;
        }
    }

    @OriginalMember(owner = "client!tga", name = "d", descriptor = "(III)[[I")
    public final int[][] method369(int arg0, int arg1, int arg2) {
        field679++;
        int var4 = 116 % ((93 - arg1) / 32);
        if (this.field667[arg2].field674) {
            int[] var5 = this.field667[arg2].method24(arg0, true);
            return new int[][] { var5, var5, var5 };
        } else {
            return this.field667[arg2].method5(arg0, 1);
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILee;I)V")
    public void method6(int arg0, class675 arg1, int arg2) {
        if (arg0 == 3731) {
            field682++;
        }
    }

    @OriginalMember(owner = "client!tga", name = "<init>", descriptor = "(IZ)V")
    public class56(int arg0, boolean arg1) {
        this.field674 = arg1;
        this.field667 = new class56[arg0];
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(III[BI[BIII)V")
    public static final void method370(int arg0, int arg1, int arg2, byte[] arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        field684++;
        if (arg8 >= -47) {
            method368(20);
        }
        int var9 = -(arg1 >> 2);
        int var10 = -(arg1 & 0x3);
        for (int var11 = -arg4; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg2++;
                arg5[var10001] += arg3[arg6++];
                int var14 = arg2++;
                arg5[var14] += arg3[arg6++];
                int var15 = arg2++;
                arg5[var15] += arg3[arg6++];
                int var16 = arg2++;
                arg5[var16] += arg3[arg6++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg2++;
                arg5[var10001] += arg3[arg6++];
            }
            arg6 += arg7;
            arg2 += arg0;
        }
    }
}
