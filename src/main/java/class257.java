import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public class class257 extends class739 {

    @OriginalMember(owner = "client!aia", name = "B", descriptor = "[[I")
    public static int[][] field3684 = new int[6][];

    @OriginalMember(owner = "client!aia", name = "F", descriptor = "Z")
    public static boolean field3687 = false;

    @OriginalMember(owner = "client!aia", name = "z", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!aia", name = "A", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!aia", name = "E", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!aia", name = "H", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!aia", name = "I", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!aia", name = "C", descriptor = "Lgca;")
    public static class207 field3685;

    @OriginalMember(owner = "client!aia", name = "G", descriptor = "Lla;")
    public static class423 field3688;

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(IIBIIILha;IIIILip;)V")
    public static final void method1710(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, class543 arg6, int arg7, int arg8, int arg9, int arg10, class304 arg11) {
        ++field3686;
        if (arg9 > arg0 && arg0 + arg4 > arg9 && ~(arg3 + -13) > ~arg5 && arg5 < arg3 - -3 && arg11.field4145) {
            arg10 = arg7;
        }
        int[] var12 = null;
        if (class238.method1657(arg11.field4152, -52)) {
            var12 = class425.field6147.method4144((int) arg11.field4156, 125).field6117;
        } else if (arg11.field4147 == -1) {
            if (!class145.method1017(arg11.field4152, 102)) {
                if (class503.method3076(arg11.field4152, (byte) 111)) {
                    Object var13 = null;
                    class482 var14;
                    if (~arg11.field4152 == -1010) {
                        var14 = class375.field5421.method2680((int) arg11.field4156, (byte) 87);
                    } else {
                        var14 = class375.field5421.method2680((int) (2147483647L & arg11.field4156 >>> 32), (byte) 109);
                    }
                    if (var14.field6900 != null) {
                        var14 = var14.method2952(arg2 + -41, class226.field3372);
                    }
                    if (var14 != null) {
                        var12 = var14.field6961;
                    }
                }
            } else {
                class63 var15 = (class63) class389.field5608.method4020((long) ((int) arg11.field4156), (byte) -102);
                if (var15 != null) {
                    class571 var16 = var15.field1004;
                    class521 var17 = var16.field8235;
                    if (var17.field7535 != null) {
                        var17 = var17.method3166(class226.field3372, true);
                    }
                    if (var17 != null) {
                        var12 = var17.field7521;
                    }
                }
            }
        } else {
            var12 = class425.field6147.method4144(arg11.field4147, 124).field6117;
        }
        String var18 = class353.method2253(arg11, 121);
        if (var12 != null) {
            var18 = var18 + class718.method4032(var12, 0);
        }
        class193.field2838.method2421(class637.field9005, arg10, class42.field708, arg3, var18, arg0 - -3, 0, 0);
        if (arg11.field4154) {
            class755.field10511.method3128(class119.field1635.method3063(0, var18) + arg0 + 5, arg3 + -12);
        }
        if (arg2 != 40) {
            field3684 = null;
        }
    }

    @OriginalMember(owner = "client!aia", name = "c", descriptor = "(I)V")
    public static void method1711(int arg0) {
        field3688 = null;
        if (arg0 != -3) {
            method1712(-30, (byte) -49);
        }
        field3685 = null;
        field3684 = null;
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(IB)Lhl;")
    public static final class396 method1712(int arg0, byte arg1) {
        ++field3690;
        class396 var2 = (class396) class435.field6229.method2216(0, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = field3688.method2600(0, 1, arg0);
            class396 var4 = new class396();
            var4.field5682 = arg0;
            if (var3 != null) {
                var4.method2402(0, new class479(var3));
            }
            var4.method2404(-1);
            if (var4.field5666 == 2 && class205.field3078.method4020((long) arg0, (byte) -119) == null) {
                class205.field3078.method4022(new class177(class549.field7992), -108, (long) arg0);
                class567.field8202[class549.field7992++] = var4;
            }
            class435.field6229.method2213((byte) -16, (long) arg0, var4);
            int var5 = -47 / ((arg1 - 34) / 39);
            return var4;
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(ZI)[I")
    public final int[] method445(boolean arg0, int arg1) {
        ++field3682;
        int[] var3 = super.field10317.method1042(0, arg1);
        if (arg0) {
            return null;
        } else {
            if (super.field10317.field2170) {
                class85.method685(var3, 0, class399.field5703, class19.field185[arg1]);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!aia", name = "c", descriptor = "(II)V")
    public static final void method1713(int arg0, int arg1) {
        int var2 = 22 % ((arg1 - -14) / 34);
        if (class249.field3628 != 0) {
            class683.field9697 = arg0;
        } else {
            class36.field325.method1946(14569, arg0);
        }
        ++field3689;
    }

    @OriginalMember(owner = "client!aia", name = "<init>", descriptor = "()V")
    public class257() {
        super(0, true);
    }
}
