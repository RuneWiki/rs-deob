import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class537 {

    @OriginalMember(owner = "client!iu", name = "i", descriptor = "Laj;")
    private class287 field7519 = new class287(128);

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "Lom;")
    private class344 field7514;

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "Z")
    public static boolean field7512 = false;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "Ljv;")
    public static class71 field7515 = new class71();

    @OriginalMember(owner = "client!iu", name = "m", descriptor = "Lmo;")
    public static class695 field7523 = new class695("RC", 1);

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
    public static int field7513;

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "I")
    public static int field7516;

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "I")
    public static int field7517;

    @OriginalMember(owner = "client!iu", name = "h", descriptor = "I")
    public static int field7518;

    @OriginalMember(owner = "client!iu", name = "k", descriptor = "I")
    public static int field7521;

    @OriginalMember(owner = "client!iu", name = "l", descriptor = "I")
    public static int field7522;

    @OriginalMember(owner = "client!iu", name = "j", descriptor = "Ljava/applet/Applet;")
    public static Applet field7520;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "[I")
    public static int[] field7511;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lqh;I)Lms;")
    public static final class705 method3102(class61 arg0, int arg1) {
        field7517++;
        class234 var2 = class569.method3281(arg0, -1);
        int var3 = arg0.method730(arg1 ^ 0x7E);
        if (arg1 == 0) {
            int var4 = arg0.method730(-92);
            return new class705(var2.field3490, var2.field3499, var2.field3497, var2.field3496, var2.field3492, var2.field3491, var2.field3500, var2.field3502, var2.field3498, var3, var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)Lhfa;")
    public final class285 method3103(int arg0, int arg1) {
        field7516++;
        class287 var3 = this.field7519;
        class285 var4;
        synchronized (this.field7519) {
            var4 = (class285) this.field7519.method1900((long) arg0, -102);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field7514.method2216(class365.method2314((byte) -26, arg0), class30.method499(arg0, arg1), true);
        class285 var6 = new class285();
        if (var5 != null) {
            var6.method1886(new class61(var5), (byte) 108);
        }
        class287 var7 = this.field7519;
        synchronized (this.field7519) {
            this.field7519.method1904(var6, (long) arg0, arg1 - 1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "([Llk;IBZII)V")
    public static final void method3104(class545[] arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5) {
        if (arg2 != -69) {
            field7522 = -94;
        }
        field7513++;
        for (int var6 = 0; var6 < arg0.length; var6++) {
            class545 var7 = arg0[var6];
            if (var7 != null && var7.field7733 == arg1) {
                class141.method1145(-84, arg5, arg4, var7, arg3);
                class601.method3436(arg5, arg4, (byte) -121, var7);
                if ((var7.field7676 - var7.field7718) < var7.field7636) {
                    var7.field7636 = var7.field7676 - var7.field7718;
                }
                if ((var7.field7699 - var7.field7652) < var7.field7716) {
                    var7.field7716 = var7.field7699 - var7.field7652;
                }
                if (var7.field7636 < 0) {
                    var7.field7636 = 0;
                }
                if (var7.field7716 < 0) {
                    var7.field7716 = 0;
                }
                if (var7.field7649 == 0) {
                    class367.method2321(arg3, (byte) -41, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)V")
    public static void method3105(byte arg0) {
        if (arg0 >= 88) {
            field7511 = null;
            field7515 = null;
            field7520 = null;
            field7523 = null;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIII)Lpl;")
    public static final class604 method3106(int arg0, int arg1, int arg2, int arg3) {
        field7521++;
        class370 var4 = class257.field3792[arg1][arg0][arg2];
        if (var4 == null) {
            return null;
        }
        class604 var5 = null;
        int var6 = -1;
        class636 var7 = var4.field5497;
        if (arg3 != 0) {
            field7522 = -116;
        }
        while (var7 != null) {
            class122 var8 = var7.field9172;
            if (var8 instanceof class604) {
                class604 var9 = (class604) var8;
                int var10 = var9.method3446(0) * 256 + 252 - 256;
                int var11 = var9.field9806 - var10 >> 9;
                int var12 = var9.field9815 - var10 >> 9;
                int var13 = var9.field9806 + var10 >> 9;
                int var14 = var9.field9815 + var10 >> 9;
                if (var11 <= arg0 && var12 <= arg2 && arg0 <= var13 && var14 >= arg2) {
                    int var15 = (var14 + 1 - arg2) * (var13 + 1 - arg0);
                    if (var15 > var6) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
            var7 = var7.field9171;
        }
        return var5;
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lmea;ILom;)V")
    public class537(class398 arg0, int arg1, class344 arg2) {
        this.field7514 = arg2;
        if (this.field7514 != null) {
            int var4 = this.field7514.method2245(0) - 1;
            this.field7514.method2236(var4, 0);
        }
    }
}
