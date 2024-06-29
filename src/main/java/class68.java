import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class68 {

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "Lad;")
    private class19 field688 = new class19(256);

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "Lvj;")
    private class422 field687;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "Lfa;")
    private class524 field680;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field678 = 0;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "[I")
    public static int[] field682 = new int[50];

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "[I")
    public static int[] field684;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIZIIIIIII)V")
    public static final void method358(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2) {
            return;
        }
        field685++;
        if (arg5 >= class412.field5526 && arg5 <= class72.field740 && class412.field5526 <= arg7 && arg7 <= class72.field740 && class412.field5526 <= arg9 && class72.field740 >= arg9 && class412.field5526 <= arg8 && arg8 <= class72.field740 && class93.field949 <= arg0 && class360.field4834 >= arg0 && arg1 >= class93.field949 && arg1 <= class360.field4834 && arg3 >= class93.field949 && arg3 <= class360.field4834 && class93.field949 <= arg4 && class360.field4834 >= arg4) {
            class171.method930(arg3, arg1, arg5, arg6, 1, arg0, arg4, arg7, arg8, arg9);
        } else {
            class157.method845(arg8, arg1, arg3, arg9, arg7, arg4, -857644382, arg6, arg5, arg0);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BLwp;)V")
    public static final void method359(byte arg0, class452 arg1) {
        field681++;
        class452 var2 = class411.method2304(arg1, false);
        if (arg0 > -56) {
            field684 = null;
        }
        int var3;
        int var4;
        if (var2 == null) {
            var4 = class338.field4244;
            var3 = class146.field1618;
        } else {
            var3 = var2.field6483;
            var4 = var2.field6443;
        }
        class182.method1106(var3, var4, arg1, false, (byte) 70);
        class528.method2972(arg1, 2, var4, var3);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public final void method360(int arg0) {
        field677++;
        this.field688.method83((byte) -2, 5);
        if (arg0 > -64) {
            field682 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
    public static void method361(int arg0) {
        field684 = null;
        if (arg0 != 5) {
            method359((byte) -19, null);
        }
        field682 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)Lg;")
    public final class555 method362(int arg0, byte arg1) {
        field683++;
        Object var3 = this.field688.method78(0, (long) arg0);
        if (var3 != null) {
            return (class555) var3;
        } else if (this.field680.method144(8649, arg0)) {
            class295 var4 = this.field680.method140(arg0, 862);
            int var5 = var4.field3668 ? 64 : this.field687.field5806;
            class555 var7;
            if (var4.field3679 && this.field687.method1044()) {
                float[] var6 = this.field680.method139(16564, var5, var5, 0.7F, arg0, false);
                var7 = new class555(this.field687, 3553, 34842, var5, var5, var4.field3675 != 0, var6, 6408);
            } else {
                int[] var8;
                if (!var4.field3666 && class594.method3340(var4.field3669, (byte) 48)) {
                    var8 = this.field680.method145(var5, true, 0.7F, -18551, var5, arg0);
                } else {
                    var8 = this.field680.method141(false, arg0, var5, 0.7F, 16944, var5);
                }
                var7 = new class555(this.field687, 3553, 6408, var5, var5, var4.field3675 != 0, var8, false);
            }
            var7.method3148(10243, var4.field3687, var4.field3678);
            this.field688.method92(1, (long) arg0, var7);
            int var9 = 7 % ((85 - arg1) / 40);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
    public final void method363(byte arg0) {
        this.field688.method88(81);
        int var2 = 71 % ((arg0 - 34) / 51);
        field686++;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lvj;Lfa;)V")
    public class68(class422 arg0, class524 arg1) {
        this.field687 = arg0;
        this.field680 = arg1;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILwn;)I")
    public static final int method364(int arg0, class236 arg1) {
        field679++;
        int var2 = arg1.field2911;
        if (arg0 != -9184) {
            return -117;
        }
        class543 var3 = arg1.method3737((byte) 80);
        if (arg1.field9473) {
            var2 = arg1.field2905;
        } else if (arg1.field9487 == var3.field7662 || arg1.field9487 == var3.field7641 || arg1.field9487 == var3.field7647 || arg1.field9487 == var3.field7680) {
            var2 = arg1.field2894;
        } else if (arg1.field9487 == var3.field7663 || arg1.field9487 == var3.field7644 || arg1.field9487 == var3.field7642 || arg1.field9487 == var3.field7643) {
            var2 = arg1.field2926;
        }
        return var2;
    }
}
