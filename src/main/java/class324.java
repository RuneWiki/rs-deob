import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class324 extends class35 {

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public int field4663 = 0;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field4665 = 0;

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
    public static int field4689 = 0;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public int field4664;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public int field4669;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
    public int field4675;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "I")
    public int field4677;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "I")
    public int field4680;

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "I")
    public int field4681;

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
    public int field4682;

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
    public int field4684;

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "I")
    public int field4687;

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "I")
    public int field4688;

    @OriginalMember(owner = "client!ug", name = "K", descriptor = "I")
    public int field4691;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "Lqo;")
    public class127 field4676;

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "Lwe;")
    public class24 field4679;

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "Lwe;")
    public class24 field4690;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "Lfb;")
    public class45 field4671;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "Lri;")
    public class98 field4672;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "Z")
    public static boolean field4673;

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "Z")
    public boolean field4686;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "[I")
    public int[] field4666;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLec;)Ldb;")
    public static final class26 method2147(byte arg0, class37 arg1) {
        field4678++;
        int var2 = 8 % ((arg0 + 46) / 48);
        return new class26(arg1.method321((byte) 102), arg1.method321((byte) 123), arg1.method321((byte) 122), arg1.method321((byte) 95), arg1.method295(true), arg1.method295(true), arg1.method271((byte) 121));
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IILja;BIIIIII[[[BII)V")
    public static final void method2148(int arg0, int arg1, class90 arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte[][][] arg10, int arg11, int arg12) {
        field4683++;
        if (arg8 == 0 || arg4 == 0) {
            return;
        }
        if (arg8 == 9) {
            arg8 = 1;
            arg1 = arg1 + 1 & 0x3;
        }
        if (arg8 == 10) {
            arg8 = 1;
            arg1 = arg1 + 3 & 0x3;
        }
        if (arg8 == 11) {
            arg8 = 8;
            arg1 = arg1 + 3 & 0x3;
        }
        if (arg3 >= -64) {
            method2147((byte) 47, (class37) null);
        }
        arg2.method679(arg6, arg7, arg9, arg12, arg11, arg5, arg10[arg8 - 1][arg1], arg4, arg0);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIILim;Lim;)V")
    public static final void method2149(int arg0, int arg1, int arg2, class350 arg3, class350 arg4) {
        if (class443.field6447[arg0][arg1][arg2] == null) {
            class253.method1833(arg0, arg1, arg2);
        }
        class443.field6447[arg0][arg1][arg2].field2506 = arg3;
        class443.field6447[arg0][arg1][arg2].field2507 = arg4;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BZIII)V")
    public static final void method2150(byte arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg0 > -69) {
            method2147((byte) 113, (class37) null);
        }
        field4668++;
        if (class288.field4303 == 0) {
            class51.method404(false, 64);
        } else {
            class305.field4450 = class288.field4303;
            class322.method2145(0, false);
        }
        class217.field3205 = arg4;
        class420.field6133 = arg3;
        class236.field3402 = arg1;
        class272.method1936(arg2);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZI)V")
    public static final void method2151(boolean arg0, int arg1) {
        class18 var2 = class205.field3011;
        synchronized (class205.field3011) {
            class205.field3011.method104(arg1, (byte) -34);
        }
        field4685++;
        if (!arg0) {
            method2148(86, -48, (class90) null, (byte) -117, -114, -71, 87, -25, 92, 88, (byte[][][]) null, 6, -97);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIIIILja;ILrc;)Lrc;")
    public static final class100 method2152(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class90 arg8, int arg9, class100 arg10) {
        field4667++;
        long var11 = (long) arg6;
        class100 var13 = (class100) class393.field5744.method103(arg1, var11);
        short var14 = 1031;
        if (var13 == null) {
            class382 var15 = class265.method1893(arg6, class270.field4043, 0, (byte) -123);
            if (var15 == null) {
                return null;
            }
            var13 = arg8.method735(var15, var14, class243.field3538, 64, 768);
            class393.field5744.method113(var13, arg1, var11);
        }
        class100 var16 = var13.method518((byte) 2, var14, true);
        if (arg3 != 0) {
            var16.method538(arg3);
        }
        if (arg4 != 0) {
            var16.method543(arg4);
        }
        if (arg5 != 0) {
            var16.method519(arg5);
        }
        if (arg0 != 0) {
            var16.method523(0, arg0, 0);
        }
        return var16;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V")
    public final void method2153(int arg0) {
        field4674++;
        if (arg0 != 0) {
            method2151(true, -126);
        }
        int var2 = this.field4669;
        if (this.field4671 != null) {
            class45 var5 = this.field4671.method369(-70);
            if (var5 == null) {
                this.field4684 = 0;
                this.field4681 = 0;
                this.field4666 = null;
                this.field4664 = 0;
                this.field4669 = -1;
                this.field4687 = 0;
            } else {
                this.field4669 = var5.field739;
                this.field4687 = var5.field686;
                this.field4681 = var5.field685;
                this.field4666 = var5.field731;
                this.field4664 = var5.field683 * 128;
                this.field4684 = var5.field677;
            }
        } else if (this.field4672 != null) {
            int var3 = class332.method2175(-108, this.field4672);
            if (var2 != var3) {
                this.field4669 = var3;
                class11 var4 = this.field4672.field1545;
                if (var4.field135 != null) {
                    var4 = var4.method75(arg0);
                }
                if (var4 == null) {
                    this.field4684 = this.field4664 = 0;
                } else {
                    this.field4684 = var4.field185;
                    this.field4664 = var4.field164 * 128;
                }
            }
        } else if (this.field4676 != null) {
            this.field4669 = class220.method1676(this.field4676, 21386);
            this.field4684 = this.field4676.field2078;
            this.field4664 = this.field4676.field2062 * 128;
        }
        if (this.field4669 != var2 && this.field4690 != null) {
            class220.field3275.method511(this.field4690);
            this.field4690 = null;
        }
    }
}
