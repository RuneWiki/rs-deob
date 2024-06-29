import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class68 extends class264 {

    @OriginalMember(owner = "client!kr", name = "S", descriptor = "I")
    public static int field998 = 104;

    @OriginalMember(owner = "client!kr", name = "N", descriptor = "[I")
    public static int[] field993 = new int[4];

    @OriginalMember(owner = "client!kr", name = "U", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!kr", name = "V", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!kr", name = "W", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!kr", name = "O", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!kr", name = "P", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!kr", name = "Q", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!kr", name = "R", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!kr", name = "T", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lwg;IIIIILgf;Lnm;)V", line = 7)
    public static final void method634(class361 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class39 arg6, class267 arg7) {
        ++field996;
        class31 var8 = new class31();
        var8.field323 = arg4 * 128;
        var8.field314 = arg5;
        var8.field322 = arg1 * arg3;
        if (arg7 == null) {
            if (arg0 != null) {
                var8.field317 = arg0;
                class37 var9 = arg0.field4952;
                if (var9.field434 != null) {
                    var8.field330 = true;
                    var9 = var9.method232(class416.field5691, arg3 + -129);
                }
                if (var9 != null) {
                    var8.field327 = (var9.field400 + arg4) * 128;
                    var8.field319 = (var9.field400 + arg1) * 128;
                    var8.field328 = class349.method2164(-15368, arg0);
                    var8.field321 = var9.field466;
                    var8.field325 = var9.field410 * 128;
                }
                class357.field4928.method766(var8, -1);
                return;
            }
            if (arg6 != null) {
                var8.field333 = arg6;
                var8.field319 = (arg6.method245(4452) + arg1) * 128;
                var8.field327 = (arg6.method245(4452) + arg4) * 128;
                var8.field328 = class77.method677((byte) 46, arg6);
                var8.field321 = arg6.field521;
                var8.field325 = arg6.field517 * 128;
                class218.field3152.method1100(var8, -114, (long) arg6.field5751);
                return;
            }
        } else {
            var8.field337 = arg7;
            int var10 = arg7.field3843;
            int var11 = arg7.field3856;
            if (~arg2 == -2 || ~arg2 == -4) {
                var11 = arg7.field3843;
                var10 = arg7.field3856;
            }
            var8.field325 = arg7.field3872 * 128;
            var8.field334 = arg7.field3886;
            var8.field315 = arg7.field3892;
            var8.field328 = arg7.field3906;
            var8.field321 = arg7.field3914;
            var8.field336 = arg7.field3875;
            var8.field327 = (arg4 - -var11) * 128;
            var8.field319 = (arg1 - -var10) * 128;
            if (arg7.field3846 != null) {
                var8.field330 = true;
                var8.method198(-98);
            }
            if (var8.field334 != null) {
                var8.field329 = (int) (Math.random() * (double) (-var8.field315 + var8.field336)) + var8.field315;
            }
            class428.field5975.method766(var8, -1);
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(B)V", line = 92)
    public static void method635(byte arg0) {
        field993 = null;
        if (arg0 <= 19) {
            field993 = null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(BLkk;I)V", line = 104)
    public final void method7(byte arg0, class161 arg1, int arg2) {
        if (~arg2 == -1) {
            super.field3794 = arg1.method1172((byte) -111) == 1;
        }
        if (arg0 <= 31) {
            method634((class361) null, -114, 85, -28, 127, 11, (class39) null, (class267) null);
        }
        ++field1002;
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "()V", line = 118)
    public class68() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lkk;I)Ljava/lang/String;", line = 122)
    public static final String method636(class161 arg0, int arg1) {
        int var2 = -80 % ((-15 - arg1) / 35);
        ++field999;
        return class19.method135(61, 32767, arg0);
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(BI)[[I", line = 133)
    public final int[][] method5(byte arg0, int arg1) {
        ++field994;
        int[][] var3 = super.field3816.method1928((byte) 64, arg1);
        if (arg0 != 116) {
            method635((byte) 36);
        }
        if (super.field3816.field4208) {
            int[][] var4 = this.method1782(arg1, (byte) 123, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class478.field6792 < ~var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)[I", line = 184)
    public final int[] method90(int arg0, int arg1) {
        ++field1001;
        if (arg1 != 21034) {
            this.method7((byte) -74, (class161) null, -46);
        }
        int[] var3 = super.field3808.method958((byte) 66, arg0);
        if (super.field3808.field1732) {
            int[] var4 = this.method1788(arg0, (byte) -67, 0);
            for (int var5 = 0; var5 < class478.field6792; ++var5) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "([Lae;IB)V", line = 219)
    public static final void method637(class172[] arg0, int arg1, byte arg2) {
        ++field997;
        int var3 = 0;
        if (arg2 == -6) {
            while (var3 < arg0.length) {
                class172 var4 = arg0[var3];
                if (var4 != null) {
                    if (var4.field2602 == 0) {
                        if (var4.field2541 != null) {
                            method637(var4.field2541, arg1, (byte) -6);
                        }
                        class249 var5 = (class249) class310.field4399.method1104(arg2 + -119, (long) var4.field2543);
                        if (var5 != null) {
                            class225.method1533(arg2 + 22, arg1, var5.field3593);
                        }
                    }
                    if (arg1 == 0 && var4.field2568 != null) {
                        class472 var6 = new class472();
                        var6.field6649 = var4.field2568;
                        var6.field6642 = var4;
                        class457.method2745(var6);
                    }
                    if (~arg1 == -2 && var4.field2486 != null) {
                        label62: {
                            if (var4.field2527 >= 0) {
                                class172 var7 = class361.method2217(var4.field2543, -1060820048);
                                if (var7 == null || var7.field2541 == null || ~var7.field2541.length >= ~var4.field2527 || var7.field2541[var4.field2527] != var4) {
                                    break label62;
                                }
                            }
                            class472 var8 = new class472();
                            var8.field6649 = var4.field2486;
                            var8.field6642 = var4;
                            class457.method2745(var8);
                        }
                    }
                }
                ++var3;
            }
        }
    }
}
