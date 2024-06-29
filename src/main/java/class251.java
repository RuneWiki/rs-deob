import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class251 {

    @OriginalMember(owner = "client!caa", name = "d", descriptor = "I")
    public int field3234 = 0;

    @OriginalMember(owner = "client!caa", name = "g", descriptor = "I")
    public int field3237 = 0;

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "Lsw;")
    private class641 field3233 = new class641(64);

    @OriginalMember(owner = "client!caa", name = "k", descriptor = "Lje;")
    private class339 field3241 = null;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "Ldn;")
    private class438 field3231;

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "Ldn;")
    private class438 field3232;

    @OriginalMember(owner = "client!caa", name = "e", descriptor = "Z")
    public static boolean field3235 = true;

    @OriginalMember(owner = "client!caa", name = "f", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!caa", name = "h", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!caa", name = "i", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!caa", name = "j", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!caa", name = "l", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IILqa;IBLcn;)V", line = 3)
    public static final void method1423(int arg0, int arg1, class206 arg2, int arg3, byte arg4, class437 arg5) {
        int var6 = -2 / ((arg4 - 6) / 59);
        field3238++;
        class615 var7 = class284.field3721.method3419(arg5.field5943, -100);
        if (var7.field8916 == -1) {
            return;
        }
        int var8;
        if (arg5.field6002) {
            int var9 = arg5.field5941 + arg1;
            var8 = var9 & 0x3;
        } else {
            var8 = 0;
        }
        class52 var10 = var7.method3537(-1, arg5.field6030, arg2, var8);
        if (var10 == null) {
            return;
        }
        int var11 = arg5.field5982;
        int var12 = arg5.field5945;
        if ((var8 & 0x1) == 1) {
            var12 = arg5.field5982;
            var11 = arg5.field5945;
        }
        int var13 = var10.method292();
        int var14 = var10.method286();
        if (var7.field8913) {
            var14 = var12 * 4;
            var13 = var11 * 4;
        }
        if (var7.field8917 == 0) {
            var10.method284(arg3, arg0 + 4 - var12 * 4, var13, var14);
        } else {
            var10.method6(arg3, arg0 - ((var12 - 1) * 4), var13, var14, 0, var7.field8917 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(III)Z", line = 63)
    public static final boolean method1424(int arg0, int arg1, int arg2) {
        field3236++;
        int var3 = 111 / ((arg2 + 22) / 54);
        return (arg1 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(ILdn;Ldn;Lje;)V", line = 169)
    public class251(int arg0, class438 arg1, class438 arg2, class339 arg3) {
        this.field3241 = arg3;
        this.field3231 = arg2;
        this.field3232 = arg1;
        if (this.field3232 != null) {
            this.field3237 = this.field3232.method2554(1, 124);
        }
        if (this.field3231 != null) {
            this.field3234 = this.field3231.method2554(1, 124);
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(JI[ILjs;)Ljava/lang/String;", line = 81)
    public final String method1425(long arg0, int arg1, int[] arg2, class275 arg3) {
        field3240++;
        int var6 = 9 % ((29 - arg1) / 44);
        if (this.field3241 != null) {
            String var7 = this.field3241.method1901(0, arg2, arg0, arg3);
            if (var7 != null) {
                return var7;
            }
        }
        return Long.toString(arg0);
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIII)I", line = 107)
    public static final int method1426(int arg0, int arg1, int arg2, int arg3) {
        field3239++;
        if (arg2 != 5296) {
            return 82;
        } else if ((class330.field4304[arg0][arg3][arg1] & 0x8) == 0) {
            return arg0 <= 0 || (class330.field4304[1][arg3][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(II)Lnaa;", line = 129)
    public final class62 method1427(int arg0, int arg1) {
        field3242++;
        class62 var3 = (class62) this.field3233.method3682(0, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field3231.method2558(100, arg0 & 0x7FFF, 1);
        } else {
            var4 = this.field3232.method2558(100, arg0, 1);
        }
        class62 var5 = new class62();
        if (arg1 != 24845) {
            return null;
        }
        var5.field617 = this;
        if (var4 != null) {
            var5.method362(new class374(var4), -57);
        }
        if (arg0 >= 32768) {
            var5.method355(32768);
        }
        this.field3233.method3684(var5, 0, (long) arg0);
        return var5;
    }
}
