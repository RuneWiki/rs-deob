import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class681 {

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    private int field9670 = -1;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "Z")
    private boolean field9661 = true;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
    private int field9675;

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "I")
    private int field9676;

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "I")
    private int field9679;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    private int field9662;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "[Lth;")
    private class620[] field9669;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "[Lth;")
    private class620[] field9666;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "Lth;")
    private class620 field9668;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "Ljava/util/Random;")
    public static Random field9660 = new Random();

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "Lve;")
    public static class527 field9674 = new class527(1, 2);

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "[[I")
    public static int[][] field9678 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field9663;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    private int field9664;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    private int field9665;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field9667;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public static int field9671;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
    public static int field9672;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
    public static int field9673;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "Lqda;")
    private class112 field9677;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZII)V", line = 3)
    public static final void method3844(boolean arg0, int arg1, int arg2) {
        class595.method3447((byte) -72, arg1, arg2);
        if (!arg0) {
            field9673++;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IILha;)Z", line = 16)
    public final boolean method3845(int arg0, int arg1, class66 arg2) {
        if (this.field9670 != arg0) {
            this.field9670 = arg0;
            int var4 = class377.method2330((byte) 48, arg0);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field9664 != var4) {
                this.field9677 = null;
                this.field9664 = var4;
            }
            if (this.field9669 != null) {
                this.field9665 = 0;
                int[] var5 = new int[this.field9669.length];
                for (int var6 = 0; var6 < this.field9669.length; var6++) {
                    class620 var7 = this.field9669[var6];
                    if (var7.method3546(this.field9662, this.field9679, this.field9676, this.field9670)) {
                        var5[this.field9665] = var7.field8732;
                        this.field9666[this.field9665++] = var7;
                    }
                }
                class698.method3938(this.field9666, this.field9665 - 1, (byte) -107, var5, 0);
            }
            this.field9661 = true;
        }
        field9663++;
        if (arg1 != 0) {
            method3849(-12);
        }
        boolean var8 = false;
        if (this.field9661) {
            this.field9661 = false;
            for (int var9 = this.field9665 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field9666[var9].method3542(arg2, this.field9668);
                this.field9661 |= !var10;
                var8 |= var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)V", line = 92)
    public final void method3846(boolean arg0) {
        if (this.field9669 != null) {
            for (int var2 = 0; var2 < this.field9669.length; var2++) {
                this.field9669[var2].method3547();
            }
        }
        field9667++;
        if (arg0) {
            this.field9677 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILcm;)V", line = 122)
    public static final void method3847(int arg0, class758 arg1) {
        field9672++;
        if (arg0 < 55) {
            field9660 = null;
        }
        arg1.field10468 = null;
        if (class488.field6907 < 20) {
            class314.field4654.method2026((byte) 51, arg1);
            class488.field6907++;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IBIIIIIILha;I)V", line = 140)
    public final void method3848(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class66 arg8, int arg9) {
        field9671++;
        int var11 = arg5 + arg6 & 0x3FFF;
        if (this.field9675 == -1 || this.field9664 == 0) {
            arg8.method474(arg0, arg2, arg3, arg7, arg4, 0);
        } else {
            class181 var12 = class496.field7062.method1263(this.field9675, (byte) 115);
            if (this.field9677 == null && class496.field7062.method1262(this.field9675, (byte) 51)) {
                int[] var13 = var12.field2751 == 2 ? class496.field7062.method1259(this.field9675, this.field9664, 30767, 0.7F, false, this.field9664) : class496.field7062.method1261(this.field9675, this.field9664, arg1 - 13796, false, 0.7F, this.field9664);
                this.field9677 = arg8.method476(0, this.field9664, this.field9664, true, this.field9664, var13);
            }
            if (var12.field2751 == 2) {
                arg8.method474(arg0, arg2, arg3, arg7, arg4, 0);
            }
            if (this.field9677 != null) {
                int var14 = var12.field2751 == 2 ? 1 : 0;
                int var15 = arg7 * arg9 / -4096;
                int var16;
                for (var16 = (arg3 - arg7) / 2 + (arg7 * var11 / 4096); var16 > arg7; var16 -= arg7) {
                }
                while (arg7 < var15) {
                    var15 -= arg7;
                }
                while (var16 < 0) {
                    var16 += arg7;
                }
                while (var15 < 0) {
                    var15 += arg7;
                }
                for (int var17 = var16 - arg7; var17 < arg3; var17 += arg7) {
                    for (int var18 = var15 - arg7; var18 < arg7; var18 += arg7) {
                        this.field9677.method786(arg0 + var17, var18 - -arg2, arg7, arg7, 1, 0, var14);
                    }
                }
            }
        }
        if (arg1 != 40) {
            this.method3845(50, -63, null);
        }
        for (int var19 = this.field9665 - 1; var19 >= 0; var19--) {
            this.field9666[var19].method3549(arg8, arg0, arg2, arg3, arg7, arg9, var11);
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(I[Lth;IIII)V", line = 259)
    public class681(int arg0, class620[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field9675 = arg0;
        this.field9676 = arg5;
        this.field9679 = arg4;
        this.field9662 = arg3;
        this.field9669 = arg1;
        if (arg1 == null) {
            this.field9666 = null;
            this.field9668 = null;
        } else {
            this.field9666 = new class620[arg1.length];
            this.field9668 = arg2 < 0 ? null : arg1[arg2];
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V", line = 236)
    public static void method3849(int arg0) {
        if (arg0 <= 72) {
            field9660 = null;
        }
        field9674 = null;
        field9678 = null;
        field9660 = null;
    }
}
