import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class48 extends class167 {

    @OriginalMember(owner = "client!ec", name = "X", descriptor = "I")
    private int field1002 = 20;

    @OriginalMember(owner = "client!ec", name = "eb", descriptor = "I")
    private int field1009 = 0;

    @OriginalMember(owner = "client!ec", name = "Z", descriptor = "I")
    private int field1004 = 1365;

    @OriginalMember(owner = "client!ec", name = "W", descriptor = "I")
    private int field1001 = 0;

    @OriginalMember(owner = "client!ec", name = "bb", descriptor = "Lkh;")
    public static class117 field1006 = class224.method1450((byte) -115, "titlebutton");

    @OriginalMember(owner = "client!ec", name = "U", descriptor = "Lkh;")
    public static class117 field999 = class224.method1450((byte) -78, "Bitte wenden Sie sich an den Kundendienst)3");

    @OriginalMember(owner = "client!ec", name = "Y", descriptor = "Lkh;")
    private static class117 field1003 = class224.method1450((byte) -1, " seconds)3");

    @OriginalMember(owner = "client!ec", name = "db", descriptor = "Lkh;")
    public static class117 field1008 = class224.method1450((byte) -102, "Wir vermuten)1 dass Ihr Konto gestohlen wurde");

    @OriginalMember(owner = "client!ec", name = "hb", descriptor = "Lvg;")
    public static class236 field1012 = null;

    @OriginalMember(owner = "client!ec", name = "lb", descriptor = "Lkh;")
    public static class117 field1016 = class224.method1450((byte) 111, ":duelfriend:");

    @OriginalMember(owner = "client!ec", name = "V", descriptor = "I")
    public static int field1000 = 3;

    @OriginalMember(owner = "client!ec", name = "kb", descriptor = "Lkh;")
    public static class117 field1015 = field1003;

    @OriginalMember(owner = "client!ec", name = "ab", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!ec", name = "cb", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!ec", name = "fb", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!ec", name = "gb", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!ec", name = "ib", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!ec", name = "jb", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!ec", name = "T", descriptor = "[[[Lpf;")
    public static class170[][][] field998;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)Ltc;")
    public static final class211 method379(int arg0, int arg1) {
        ++field1014;
        class211 var2 = (class211) class232.field4184.method506(1, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class11.field374.method104(-42, class9.method65(arg1, (byte) -114), class160.method1141(-5370, arg1));
            class211 var4 = new class211();
            var4.field3830 = arg1;
            if (var3 != null) {
                var4.method1389(-23, new class145(var3));
            }
            var4.method1377(0);
            if (var4.field3806) {
                var4.field3825 = false;
                var4.field3811 = 0;
            }
            if (!class17.field508 && var4.field3783) {
                var4.field3819 = null;
            }
            if (arg0 <= 47) {
                field1016 = null;
            }
            class232.field4184.method497((long) arg1, var4, -111);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        if (arg1) {
            field1010 = -59;
        }
        ++field1005;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 == -4) {
                        this.field1009 = arg0.method1049((byte) 112);
                    }
                } else {
                    this.field1001 = arg0.method1049((byte) 112);
                }
            } else {
                this.field1002 = arg0.method1049((byte) 104);
            }
        } else {
            this.field1004 = arg0.method1049((byte) 122);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILkh;)Lgf;")
    public static final class72 method380(int arg0, class117 arg1) {
        ++field1013;
        if (arg1.method819((byte) -102) == 0) {
            return null;
        } else {
            int var2 = 44 % ((arg0 - -28) / 54);
            for (class72 var3 = (class72) class41.field931.method314((byte) -26); var3 != null; var3 = (class72) class41.field931.method320(0)) {
                if (var3.field1388.method790(arg1, 25)) {
                    return var3;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lnc;ZIIIIIBI)V")
    public static final void method381(class145 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        if (arg8 >= 0 && ~arg8 > -105 && arg6 >= 0 && arg6 < 104) {
            if (!arg1) {
                class233.field4200[arg4][arg8][arg6] = 0;
            }
            while (true) {
                int var9 = arg0.method998(71);
                if (~var9 == -1) {
                    if (!arg1) {
                        if (~arg4 == -1) {
                            class156.field2839[0][arg8][arg6] = -class19.method175((byte) 67, 932731 - -arg8 + arg5, arg6 - -arg3 + 556238) * 8;
                        } else {
                            class156.field2839[arg4][arg8][arg6] = class156.field2839[arg4 - 1][arg8][arg6] + -240;
                        }
                    } else {
                        class156.field2839[0][arg8][arg6] = class146.field2684[0][arg8][arg6];
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg0.method998(95);
                    if (!arg1) {
                        if (~var10 == -2) {
                            var10 = 0;
                        }
                        if (arg4 == 0) {
                            class156.field2839[0][arg8][arg6] = -var10 * 8;
                        } else {
                            class156.field2839[arg4][arg8][arg6] = class156.field2839[arg4 + -1][arg8][arg6] + -(var10 * 8);
                        }
                    } else {
                        class156.field2839[0][arg8][arg6] = var10 * 8 + class146.field2684[0][arg8][arg6];
                    }
                    break;
                }
                if (~var9 >= -50) {
                    class73.field1394[arg4][arg8][arg6] = arg0.method994((byte) 21);
                    class120.field2268[arg4][arg8][arg6] = (byte) ((var9 + -2) / 4);
                    class109.field2062[arg4][arg8][arg6] = (byte) class209.method1370(3, arg2 + var9 + -2);
                } else if (var9 <= 81) {
                    if (!arg1) {
                        class233.field4200[arg4][arg8][arg6] = (byte) (var9 - 49);
                    }
                } else {
                    class196.field3496[arg4][arg8][arg6] = (byte) (var9 + -81);
                }
            }
        } else {
            while (true) {
                int var11 = arg0.method998(91);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg0.method998(106);
                    break;
                }
                if (var11 <= 49) {
                    arg0.method998(115);
                }
            }
        }
        if (arg7 > 56) {
            ++field1007;
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
    public class48() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)V")
    public static void method382(int arg0) {
        field1003 = null;
        field999 = null;
        field1015 = null;
        field1016 = null;
        field1006 = null;
        field1012 = null;
        field1008 = null;
        if (arg0 != 0) {
            method381((class145) null, true, 26, -65, 94, -67, 50, (byte) 95, -53);
        }
        field998 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)[I")
    public final int[] method53(byte arg0, int arg1) {
        if (arg0 != -96) {
            field1000 = 69;
        }
        int[] var3 = super.field3013.method1463((byte) -115, arg1);
        ++field1011;
        if (super.field3013.field4085) {
            for (int var4 = 0; ~var4 > ~class115.field2146; ++var4) {
                int var5 = (class143.field2583[arg1] << 12) / this.field1004 - -this.field1009;
                int var6 = (class70.field1350[var4] << 12) / this.field1004 - -this.field1001;
                int var7 = var6;
                int var8 = var6;
                int var9 = 0;
                int var10 = var6 * var6 >> 12;
                int var11 = var5;
                int var12 = var5 * var5 >> 12;
                int var13 = var5;
                while (var10 + var12 < 16384 && ~var9 > ~this.field1002) {
                    ++var9;
                    var13 = (var8 * var13 >> 12) * 2 + var11;
                    var8 = var10 - var12 - -var7;
                    var10 = var8 * var8 >> 12;
                    var12 = var13 * var13 >> 12;
                }
                var3[var4] = ~(this.field1002 + -1) < ~var9 ? (var9 << 12) / this.field1002 : 0;
            }
        }
        return var3;
    }
}
