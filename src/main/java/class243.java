import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class243 extends class393 {

    @OriginalMember(owner = "client!mda", name = "h", descriptor = "F")
    public float field3851;

    @OriginalMember(owner = "client!mda", name = "i", descriptor = "F")
    public float field3852;

    @OriginalMember(owner = "client!mda", name = "m", descriptor = "F")
    public float field3856;

    @OriginalMember(owner = "client!mda", name = "r", descriptor = "F")
    public float field3861;

    @OriginalMember(owner = "client!mda", name = "s", descriptor = "F")
    public float field3862;

    @OriginalMember(owner = "client!mda", name = "z", descriptor = "F")
    public float field3869;

    @OriginalMember(owner = "client!mda", name = "E", descriptor = "F")
    public float field3873;

    @OriginalMember(owner = "client!mda", name = "H", descriptor = "F")
    public float field3876;

    @OriginalMember(owner = "client!mda", name = "I", descriptor = "F")
    public float field3877;

    @OriginalMember(owner = "client!mda", name = "L", descriptor = "F")
    public float field3880;

    @OriginalMember(owner = "client!mda", name = "M", descriptor = "F")
    public float field3881;

    @OriginalMember(owner = "client!mda", name = "N", descriptor = "F")
    public float field3882;

    @OriginalMember(owner = "client!mda", name = "f", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!mda", name = "g", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!mda", name = "j", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!mda", name = "l", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!mda", name = "n", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!mda", name = "o", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!mda", name = "p", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!mda", name = "q", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!mda", name = "t", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!mda", name = "u", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!mda", name = "v", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!mda", name = "w", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!mda", name = "x", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!mda", name = "y", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!mda", name = "A", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!mda", name = "B", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!mda", name = "C", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!mda", name = "F", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!mda", name = "G", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!mda", name = "J", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!mda", name = "K", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!mda", name = "k", descriptor = "Lad;")
    public static class390 field3854;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIILri;)Luo;")
    public static final class534 method1736(int arg0, int arg1, int arg2, class97 arg3) {
        if (arg2 != 6392) {
            field3854 = null;
        }
        field3874++;
        byte[] var4 = arg3.method926(arg0, -127, arg1);
        return var4 == null ? null : new class534(var4);
    }

    @OriginalMember(owner = "client!mda", name = "na", descriptor = "(IIIIII)V")
    public final void method497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3865++;
        float var7 = class122.field2039[arg3 & 0x3FFF];
        float var8 = class122.field2038[arg3 & 0x3FFF];
        float var9 = class122.field2039[arg4 & 0x3FFF];
        float var10 = class122.field2038[arg4 & 0x3FFF];
        float var11 = class122.field2039[arg5 & 0x3FFF];
        float var12 = class122.field2038[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field3869 = var9 * var13 + var10 * var12;
        this.field3856 = -var9 * var12 + var10 * var13;
        this.field3861 = -var10 * var11 + var9 * var14;
        this.field3882 = -var8;
        this.field3862 = var7 * var11;
        this.field3876 = var7 * var12;
        this.field3873 = var7 * var10;
        this.field3881 = var9 * var11 + var10 * var14;
        this.field3877 = var7 * var9;
        this.field3851 = (float) (-arg0) * this.field3856 - (float) arg1 * this.field3862 - (float) arg2 * this.field3869;
        this.field3880 = (float) (-arg0) * this.field3873 - (float) arg1 * this.field3882 - ((float) arg2 * this.field3877);
        this.field3852 = (float) (-arg0) * this.field3881 - ((float) arg1 * this.field3876) - ((float) arg2 * this.field3861);
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "()Lq;")
    public final class393 method519() {
        field3860++;
        class243 var1 = new class243();
        var1.field3852 = this.field3852;
        var1.field3856 = this.field3856;
        var1.field3869 = this.field3869;
        var1.field3862 = this.field3862;
        var1.field3882 = this.field3882;
        var1.field3881 = this.field3881;
        var1.field3861 = this.field3861;
        var1.field3877 = this.field3877;
        var1.field3873 = this.field3873;
        var1.field3876 = this.field3876;
        var1.field3880 = this.field3880;
        var1.field3851 = this.field3851;
        return var1;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lri;Lcl;ILri;Lqk;Lri;)Z")
    public static final boolean method1737(class97 arg0, class245 arg1, int arg2, class97 arg3, class16 arg4, class97 arg5) {
        class527.field7694 = arg5;
        class300.field4692 = arg0;
        class252.field4036 = arg4;
        field3850++;
        class414.field6351 = arg3;
        class655.field9151 = arg1;
        for (int var6 = arg2; var6 < 16; var6++) {
            class255.field4052[var6] = 255;
        }
        return true;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(II)V")
    public static final void method1738(int arg0, int arg1) {
        if (arg1 == -13924) {
            field3879++;
            class413 var2 = class674.method3852(3, arg0, 126);
            var2.method2634(1065768928);
        }
    }

    @OriginalMember(owner = "client!mda", name = "NA", descriptor = "(III)V")
    public final void method503(int arg0, int arg1, int arg2) {
        this.field3881 = this.field3862 = this.field3877 = 1.0F;
        this.field3852 = arg0;
        this.field3880 = arg2;
        this.field3856 = this.field3873 = this.field3876 = this.field3882 = this.field3861 = this.field3869 = 0.0F;
        field3878++;
        this.field3851 = arg1;
    }

    @OriginalMember(owner = "client!mda", name = "Y", descriptor = "()V")
    public final void method504() {
        field3857++;
        this.field3856 = this.field3873 = this.field3876 = this.field3882 = this.field3861 = this.field3869 = this.field3852 = this.field3851 = this.field3880 = 0.0F;
        this.field3881 = this.field3862 = this.field3877 = 1.0F;
    }

    @OriginalMember(owner = "client!mda", name = "U", descriptor = "(III)V")
    public final void method505(int arg0, int arg1, int arg2) {
        this.field3880 += arg2;
        this.field3852 += arg0;
        this.field3851 += arg1;
        field3867++;
    }

    @OriginalMember(owner = "client!mda", name = "d", descriptor = "(I)V")
    public static final void method1739(int arg0) {
        field3870++;
        if (class623.field8796) {
            return;
        }
        if (class17.field282.field4878) {
            class162.field2746 = ((int) class162.field2746 - 17 & 0xFFFFFFF0);
        } else {
            class254.field4045 += (-12.0F - class254.field4045) / 2.0F;
        }
        if (arg0 != -16) {
            method1736(-25, 98, 92, null);
        }
        class623.field8796 = true;
        class328.field5085 = true;
    }

    @OriginalMember(owner = "client!mda", name = "oa", descriptor = "(I)V")
    public final void method521(int arg0) {
        this.field3881 = 1.0F;
        field3872++;
        this.field3862 = this.field3877 = class122.field2039[arg0 & 0x3FFF];
        this.field3882 = class122.field2038[arg0 & 0x3FFF];
        this.field3869 = -this.field3882;
        this.field3876 = this.field3861 = this.field3852 = this.field3856 = this.field3851 = this.field3873 = this.field3880 = 0.0F;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(III[I)V")
    public final void method502(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field3861 + (float) arg0 * this.field3881 + (float) arg1 * this.field3876 + this.field3852);
        arg3[1] = (int) ((float) arg2 * this.field3869 + (float) arg0 * this.field3856 + (float) arg1 * this.field3862 + this.field3851);
        arg3[2] = (int) ((float) arg2 * this.field3877 + (float) arg0 * this.field3873 + (float) arg1 * this.field3882 + this.field3880);
        field3853++;
    }

    @OriginalMember(owner = "client!mda", name = "M", descriptor = "(Lq;)V")
    public final void method512(class393 arg0) {
        field3855++;
        class243 var2 = (class243) arg0;
        this.field3877 = var2.field3877;
        this.field3851 = var2.field3851;
        this.field3880 = var2.field3880;
        this.field3852 = var2.field3852;
        this.field3876 = var2.field3876;
        this.field3856 = var2.field3856;
        this.field3862 = var2.field3862;
        this.field3861 = var2.field3861;
        this.field3869 = var2.field3869;
        this.field3881 = var2.field3881;
        this.field3873 = var2.field3873;
        this.field3882 = var2.field3882;
    }

    @OriginalMember(owner = "client!mda", name = "I", descriptor = "(III[I)V")
    public final void method509(int arg0, int arg1, int arg2, int[] arg3) {
        field3864++;
        int var5 = (int) ((float) arg0 - this.field3852);
        int var6 = (int) ((float) arg1 - this.field3851);
        int var7 = (int) ((float) arg2 - this.field3880);
        arg3[2] = (int) ((float) var7 * this.field3877 + (float) var5 * this.field3861 + (float) var6 * this.field3869);
        arg3[1] = (int) ((float) var7 * this.field3882 + (float) var5 * this.field3876 + (float) var6 * this.field3862);
        arg3[0] = (int) ((float) var7 * this.field3873 + (float) var5 * this.field3881 + (float) var6 * this.field3856);
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "()V")
    public static final void method1740() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class458.field6856.length; var1++) {
                if (class458.field6856[var1].method3188()) {
                    class521.field7522[var1] = class458.field6856[var1].method3189();
                } else {
                    synchronized (class458.field6856[var1]) {
                        class458.field6856[var1].notify();
                    }
                    var0 = false;
                }
            }
            if (var0) {
                class458.field6856[class458.field6856.length - 1].method3192();
                class65.method700(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class458.field6856.length - 1; var4++) {
                        if (!class458.field6856[var4].method3188()) {
                            synchronized (class458.field6856[var4]) {
                                class458.field6856[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class458.field6856.length - 2; var6++) {
                            class458.field6856[var6].method3192();
                        }
                        class65.method700(2);
                        while (!class458.field6856[0].method3188()) {
                            synchronized (class458.field6856[0]) {
                                class458.field6856[0].notify();
                            }
                            try {
                                class549.method3313(1L, 125);
                            } catch (Exception var9) {
                            }
                        }
                        class458.field6856[0].method3192();
                        return;
                    }
                    try {
                        class549.method3313(1L, 124);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class549.method3313(1L, 124);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!mda", name = "YA", descriptor = "([I)V")
    public final void method500(int[] arg0) {
        field3875++;
        float var2 = (float) arg0[0] - this.field3852;
        float var3 = (float) arg0[1] - this.field3851;
        float var4 = (float) arg0[2] - this.field3880;
        arg0[1] = (int) (this.field3882 * var4 + this.field3876 * var2 + this.field3862 * var3);
        arg0[2] = (int) (this.field3877 * var4 + this.field3869 * var3 + this.field3861 * var2);
        arg0[0] = (int) (this.field3873 * var4 + this.field3881 * var2 + this.field3856 * var3);
    }

    @OriginalMember(owner = "client!mda", name = "wa", descriptor = "(III[I)V")
    public final void method514(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field3877 + (float) arg0 * this.field3873 + (float) arg1 * this.field3882);
        arg3[0] = (int) ((float) arg2 * this.field3861 + (float) arg0 * this.field3881 + (float) arg1 * this.field3876);
        arg3[1] = (int) ((float) arg2 * this.field3869 + (float) arg0 * this.field3856 + (float) arg1 * this.field3862);
        field3866++;
    }

    @OriginalMember(owner = "client!mda", name = "w", descriptor = "(I)V")
    public final void method517(int arg0) {
        field3868++;
        float var2 = class122.field2039[arg0 & 0x3FFF];
        float var3 = class122.field2038[arg0 & 0x3FFF];
        float var4 = this.field3856;
        float var5 = this.field3862;
        float var6 = this.field3869;
        float var7 = this.field3851;
        this.field3856 = var2 * var4 - this.field3873 * var3;
        this.field3862 = var2 * var5 - this.field3882 * var3;
        this.field3873 = this.field3873 * var2 + var3 * var4;
        this.field3882 = this.field3882 * var2 + var3 * var5;
        this.field3869 = var2 * var6 - (this.field3877 * var3);
        this.field3851 = var2 * var7 - (this.field3880 * var3);
        this.field3877 = this.field3877 * var2 + var3 * var6;
        this.field3880 = this.field3880 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!mda", name = "e", descriptor = "(I)V")
    public static void method1741(int arg0) {
        if (arg0 < -78) {
            field3854 = null;
        }
    }

    @OriginalMember(owner = "client!mda", name = "ZA", descriptor = "(I)V")
    public final void method511(int arg0) {
        field3849++;
        float var2 = class122.field2039[arg0 & 0x3FFF];
        float var3 = class122.field2038[arg0 & 0x3FFF];
        float var4 = this.field3881;
        float var5 = this.field3876;
        float var6 = this.field3861;
        this.field3881 = this.field3873 * var3 + var2 * var4;
        float var7 = this.field3852;
        this.field3876 = this.field3882 * var3 + var2 * var5;
        this.field3873 = this.field3873 * var2 - (var3 * var4);
        this.field3882 = this.field3882 * var2 - (var3 * var5);
        this.field3861 = this.field3877 * var3 + var2 * var6;
        this.field3877 = this.field3877 * var2 - var3 * var6;
        this.field3852 = this.field3880 * var3 + var2 * var7;
        this.field3880 = this.field3880 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!mda", name = "AA", descriptor = "(I)V")
    public final void method515(int arg0) {
        field3871++;
        float var2 = class122.field2039[arg0 & 0x3FFF];
        float var3 = class122.field2038[arg0 & 0x3FFF];
        float var4 = this.field3881;
        float var5 = this.field3876;
        float var6 = this.field3861;
        this.field3881 = var2 * var4 - this.field3856 * var3;
        float var7 = this.field3852;
        this.field3876 = var2 * var5 - (this.field3862 * var3);
        this.field3856 = this.field3856 * var2 + var3 * var4;
        this.field3861 = var2 * var6 - (this.field3869 * var3);
        this.field3862 = this.field3862 * var2 + var3 * var5;
        this.field3869 = this.field3869 * var2 + var3 * var6;
        this.field3852 = var2 * var7 - this.field3851 * var3;
        this.field3851 = this.field3851 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!mda", name = "J", descriptor = "(I)V")
    public final void method508(int arg0) {
        this.field3877 = 1.0F;
        field3859++;
        this.field3881 = this.field3862 = class122.field2039[arg0 & 0x3FFF];
        this.field3856 = class122.field2038[arg0 & 0x3FFF];
        this.field3861 = this.field3852 = this.field3869 = this.field3851 = this.field3873 = this.field3882 = this.field3880 = 0.0F;
        this.field3876 = -this.field3856;
    }

    @OriginalMember(owner = "client!mda", name = "o", descriptor = "(I)V")
    public final void method506(int arg0) {
        field3858++;
        this.field3862 = 1.0F;
        this.field3881 = this.field3877 = class122.field2039[arg0 & 0x3FFF];
        this.field3861 = class122.field2038[arg0 & 0x3FFF];
        this.field3873 = -this.field3861;
        this.field3876 = this.field3852 = this.field3856 = this.field3869 = this.field3851 = this.field3882 = this.field3880 = 0.0F;
    }

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "()V")
    public class243() {
        this.method504();
    }
}
