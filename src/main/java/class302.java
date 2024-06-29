import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class302 extends class476 {

    @OriginalMember(owner = "client!qaa", name = "t", descriptor = "Lfca;")
    public class661 field3809 = new class661();

    @OriginalMember(owner = "client!qaa", name = "B", descriptor = "Lof;")
    public class10 field3817 = new class10();

    @OriginalMember(owner = "client!qaa", name = "A", descriptor = "Leka;")
    private class654 field3816;

    @OriginalMember(owner = "client!qaa", name = "r", descriptor = "Lrn;")
    public static class633 field3807 = new class633(62, 7);

    @OriginalMember(owner = "client!qaa", name = "z", descriptor = "Lrn;")
    public static class633 field3815 = new class633(69, 6);

    @OriginalMember(owner = "client!qaa", name = "C", descriptor = "Luw;")
    public static class208 field3818 = new class208(32, -1);

    @OriginalMember(owner = "client!qaa", name = "u", descriptor = "F")
    public static float field3810;

    @OriginalMember(owner = "client!qaa", name = "p", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!qaa", name = "q", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!qaa", name = "s", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!qaa", name = "v", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!qaa", name = "w", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!qaa", name = "x", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!qaa", name = "y", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "(I)V", line = 7)
    public static void method1792(int arg0) {
        if (arg0 < 65) {
            method1792(-121);
        }
        field3807 = null;
        field3818 = null;
        field3815 = null;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "()I", line = 19)
    public final int method31() {
        field3808++;
        return 0;
    }

    @OriginalMember(owner = "client!qaa", name = "d", descriptor = "()Lkm;", line = 27)
    public final class476 method40() {
        field3806++;
        class468 var1;
        do {
            var1 = (class468) this.field3809.method3600((byte) 88);
            if (var1 == null) {
                return null;
            }
        } while (var1.field6093 == null);
        return var1.field6093;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I[IILeu;II)V", line = 47)
    private final void method1793(int arg0, int[] arg1, int arg2, class468 arg3, int arg4, int arg5) {
        field3805++;
        if (arg5 >= -37) {
            this.field3809 = null;
        }
        if ((this.field3816.field8423[arg3.field6080] & 0x4) != 0 && arg3.field6092 < 0) {
            int var7 = this.field3816.field8376[arg3.field6080] / class791.field10837;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field6095) / var7;
                if (arg0 < var8) {
                    arg3.field6095 += arg0 * var7;
                    break;
                }
                arg3.field6093.method33(arg1, arg2, var8);
                arg0 -= var8;
                arg2 += var8;
                arg3.field6095 += var7 * var8 - 1048576;
                int var9 = class791.field10837 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class635 var11 = arg3.field6093;
                if (this.field3816.field8405[arg3.field6080] == 0) {
                    arg3.field6093 = class635.method3411(arg3.field6100, var11.method3422(), var11.method3426(), var11.method3425());
                } else {
                    arg3.field6093 = class635.method3411(arg3.field6100, var11.method3422(), 0, var11.method3425());
                    this.field3816.method3557(-128, arg3, arg3.field6084.field10828[arg3.field6090] < 0);
                    arg3.field6093.method3424(var9, var11.method3426());
                }
                if (arg3.field6084.field10828[arg3.field6090] < 0) {
                    arg3.field6093.method3428(-1);
                }
                var11.method3397(var9);
                var11.method33(arg1, arg2, arg4 - arg2);
                if (var11.method3409()) {
                    this.field3817.method41(var11);
                }
            }
        }
        arg3.field6093.method33(arg1, arg2, arg0);
    }

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "()Lkm;", line = 111)
    public final class476 method42() {
        field3812++;
        class468 var1 = (class468) this.field3809.method3591(0);
        if (var1 == null) {
            return null;
        } else if (var1.field6093 == null) {
            return this.method40();
        } else {
            return var1.field6093;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Leu;II)V", line = 130)
    private final void method1794(class468 arg0, int arg1, int arg2) {
        if ((this.field3816.field8423[arg0.field6080] & 0x4) != 0 && arg0.field6092 < 0) {
            int var4 = this.field3816.field8376[arg0.field6080] / class791.field10837;
            int var5 = (var4 + 1048575 - arg0.field6095) / var4;
            arg0.field6095 = arg1 * var4 + arg0.field6095 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field3816.field8405[arg0.field6080] == 0) {
                    arg0.field6093 = class635.method3411(arg0.field6100, arg0.field6093.method3422(), arg0.field6093.method3426(), arg0.field6093.method3425());
                } else {
                    arg0.field6093 = class635.method3411(arg0.field6100, arg0.field6093.method3422(), 0, arg0.field6093.method3425());
                    this.field3816.method3557(-124, arg0, arg0.field6084.field10828[arg0.field6090] < 0);
                }
                if (arg0.field6084.field10828[arg0.field6090] < 0) {
                    arg0.field6093.method3428(-1);
                }
                arg1 = arg0.field6095 / var4;
            }
        }
        field3811++;
        arg0.field6093.method36(arg1);
        if (arg2 != -3855) {
            this.field3817 = null;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "([III)V", line = 170)
    public final void method33(int[] arg0, int arg1, int arg2) {
        field3813++;
        this.field3817.method33(arg0, arg1, arg2);
        for (class468 var4 = (class468) this.field3809.method3591(0); var4 != null; var4 = (class468) this.field3809.method3600((byte) 105)) {
            if (!this.field3816.method3554(-1, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field6088 >= var5) {
                        this.method1793(var5, arg0, var6, var4, var5 + var6, -41);
                        var4.field6088 -= var5;
                        break;
                    }
                    this.method1793(var4.field6088, arg0, var6, var4, var5 + var6, -91);
                    var6 += var4.field6088;
                    var5 -= var4.field6088;
                } while (!this.field3816.method3571(var5, arg0, 21, var6, var4));
            }
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)V", line = 218)
    public final void method36(int arg0) {
        this.field3817.method36(arg0);
        field3814++;
        for (class468 var2 = (class468) this.field3809.method3591(0); var2 != null; var2 = (class468) this.field3809.method3600((byte) 76)) {
            if (!this.field3816.method3554(-1, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field6088) {
                        this.method1794(var2, var3, -3855);
                        var2.field6088 -= var3;
                        break;
                    }
                    this.method1794(var2, var2.field6088, -3855);
                    var3 -= var2.field6088;
                } while (!this.field3816.method3571(var3, null, -106, 0, var2));
            }
        }
    }

    @OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Leka;)V", line = 264)
    public class302(class654 arg0) {
        this.field3816 = arg0;
    }
}
