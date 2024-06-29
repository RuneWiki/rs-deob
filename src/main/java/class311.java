import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class311 extends RuntimeException {

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field4683;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "Ljava/lang/String;")
    public String field4680;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "Lbg;")
    public static class310 field4682 = new class310(47, 2);

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "Loe;")
    public static class127 field4684 = new class127(86, -2);

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "Lft;")
    public static class4 field4686 = new class4();

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "Loe;")
    public static class127 field4688 = new class127(71, 14);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "Z")
    public static boolean field4687;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "[[B")
    public static byte[][] field4685;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public static void method1859(int arg0) {
        field4684 = null;
        field4688 = null;
        field4682 = null;
        field4685 = null;
        field4686 = null;
        int var1 = -99 % ((arg0 + 16) / 38);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IILgr;III)V")
    public static final void method1860(int arg0, int arg1, class286 arg2, int arg3, int arg4, int arg5) {
        field4681++;
        if (arg2.field4320 == -1 && arg2.field4342 == null) {
            return;
        }
        if (arg1 < 68) {
            field4687 = true;
        }
        int var6 = 0;
        int var7 = class463.field7116.field2952 * arg2.field4338 >> 8;
        if (arg2.field4330 < arg4) {
            var6 += arg4 - arg2.field4330;
        } else if (arg2.field4333 > arg4) {
            var6 += arg2.field4333 - arg4;
        }
        if (arg0 > arg2.field4322) {
            var6 += arg0 - arg2.field4322;
        } else if (arg2.field4332 > arg0) {
            var6 += arg2.field4332 - arg0;
        }
        if (arg2.field4319 == 0 || var6 - 64 > arg2.field4319 || class463.field7116.field2952 == 0 || arg2.field4326 != arg5) {
            if (arg2.field4325 != null) {
                class178.field2786.method2099(arg2.field4325);
                arg2.field4325 = null;
            }
            if (arg2.field4337 != null) {
                class178.field2786.method2099(arg2.field4337);
                arg2.field4337 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg2.field4319 - var6) * var7 / arg2.field4319;
        if (arg2.field4325 != null) {
            arg2.field4325.method2791(var8);
        } else if (arg2.field4320 >= 0) {
            class104 var9 = class104.method766(class131.field2087, arg2.field4320, 0);
            if (var9 != null) {
                class393 var10 = var9.method767().method2337(class225.field3461);
                class464 var11 = class464.method2789(var10, 100, var8);
                var11.method2773(-1);
                class178.field2786.method2097(var11);
                arg2.field4325 = var11;
            }
        }
        if (arg2.field4337 != null) {
            arg2.field4337.method2791(var8);
            if (!arg2.field4337.method1124(-125)) {
                arg2.field4337 = null;
            }
        } else if (arg2.field4342 != null && (arg2.field4340 -= arg3) <= 0) {
            int var12 = (int) ((double) arg2.field4342.length * Math.random());
            class104 var13 = class104.method766(class131.field2087, arg2.field4342[var12], 0);
            if (var13 != null) {
                class393 var14 = var13.method767().method2337(class225.field3461);
                class464 var15 = class464.method2789(var14, 100, var8);
                var15.method2773(0);
                class178.field2786.method2097(var15);
                arg2.field4340 = arg2.field4323 + ((int) (Math.random() * (double) (arg2.field4335 - arg2.field4323)));
                arg2.field4337 = var15;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIII)Llf;")
    public static final class151 method1861(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4678++;
        long var7 = (long) arg0 * 76724863L ^ (long) arg6 * 475427L ^ (long) arg5 * 97549L ^ (long) arg3 * 67481L ^ (long) arg2 * 986053L ^ (long) arg1 * 32147369L;
        if (arg4 != -29965) {
            return null;
        }
        class151 var9 = (class151) class207.field3246.method1752(0, var7);
        if (var9 == null) {
            class151 var10 = class329.field4937.method1898(arg3, arg5, arg6, arg2, arg1, arg0);
            class207.field3246.method1758(1, var10, var7);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)I")
    public static final int method1862(boolean arg0) {
        field4679++;
        if (arg0) {
            return -77;
        } else {
            class288 var1 = class33.field452;
            synchronized (class33.field452) {
                return class33.field452.method1762(0);
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class311(Throwable arg0, String arg1) {
        this.field4683 = arg0;
        this.field4680 = arg1;
    }
}
