import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public class class336 {

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "[I")
    public static int[] field4918 = new int[14];

    @OriginalMember(owner = "client!jia", name = "c", descriptor = "I")
    public static int field4920 = 0;

    @OriginalMember(owner = "client!jia", name = "e", descriptor = "Ltm;")
    public static class334 field4922 = new class334(13, 3);

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!jia", name = "d", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!jia", name = "f", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(B)I", line = 12)
    public static final int method2151(byte arg0) {
        field4921++;
        if (class554.field7897 == 1) {
            return class208.field3477;
        } else {
            if (arg0 != -96) {
                method2151((byte) -120);
            }
            return class661.field9411;
        }
    }

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "(B)V", line = 35)
    public static void method2152(byte arg0) {
        if (arg0 != 83) {
            field4918 = null;
        }
        field4922 = null;
        field4918 = null;
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(BILha;IIILoj;IIIII)V", line = 46)
    public static final void method2153(byte arg0, int arg1, class544 arg2, int arg3, int arg4, int arg5, class208 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var12 = -74 % ((52 - arg0) / 56);
        if (arg10 < arg4 && arg4 < arg8 + arg10 && arg7 > (arg3 - 13) && arg7 < arg3 + 3 && arg6.field3479) {
            arg11 = arg9;
        }
        field4919++;
        int[] var13 = null;
        if (class313.method2064(-82, arg6.field3488)) {
            var13 = class556.field7917.method741(-27, (int) arg6.field3473).field9701;
        } else if (arg6.field3489 != -1) {
            var13 = class556.field7917.method741(-66, arg6.field3489).field9701;
        } else if (class4.method16((byte) -100, arg6.field3488)) {
            class53 var14 = (class53) class332.field4881.method3512(true, (long) ((int) arg6.field3473));
            if (var14 != null) {
                class461 var15 = var14.field847;
                class504 var16 = var15.field6688;
                if (var16.field7308 != null) {
                    var16 = var16.method3046(58, class422.field6216);
                }
                if (var16 != null) {
                    var13 = var16.field7310;
                }
            }
        } else if (class354.method2271(arg6.field3488, 25)) {
            Object var17 = null;
            class595 var18;
            if (arg6.field3488 == 1006) {
                var18 = class576.field8167.method3074(0, (int) arg6.field3473);
            } else {
                var18 = class576.field8167.method3074(0, (int) (arg6.field3473 >>> 32 & 0x7FFFFFFFL));
            }
            if (var18.field8351 != null) {
                var18 = var18.method3413(-1, class422.field6216);
            }
            if (var18 != null) {
                var13 = var18.field8434;
            }
        }
        String var19 = class208.method1519(false, arg6);
        if (var13 != null) {
            var19 = var19 + class740.method4144(var13, (byte) 119);
        }
        class257.field4034.method2472(arg11, var19, 0, class625.field8753, class465.field6788, arg3, (byte) 4, arg10 + 3);
        if (arg6.field3481) {
            class193.field3341.method182(class632.field8881.method510(var19, 174) + arg10 + 5, arg3 + -12);
        }
    }
}
