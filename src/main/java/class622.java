import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class622 extends class524 implements class237 {

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "B")
    private byte field8660;

    @OriginalMember(owner = "client!rj", name = "jb", descriptor = "Z")
    private boolean field8682;

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "B")
    private byte field8664;

    @OriginalMember(owner = "client!rj", name = "T", descriptor = "Z")
    private boolean field8666;

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "S")
    private short field8661;

    @OriginalMember(owner = "client!rj", name = "U", descriptor = "Z")
    private boolean field8667;

    @OriginalMember(owner = "client!rj", name = "gb", descriptor = "Lr;")
    private class196 field8679;

    @OriginalMember(owner = "client!rj", name = "hb", descriptor = "Lka;")
    private class499 field8680;

    @OriginalMember(owner = "client!rj", name = "ib", descriptor = "I")
    public static int field8681 = 1403;

    @OriginalMember(owner = "client!rj", name = "kb", descriptor = "Lab;")
    public static class698 field8683 = new class698(0, -1);

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    public static int field8657;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
    public static int field8658;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "I")
    public static int field8659;

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "I")
    public static int field8662;

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "I")
    public static int field8663;

    @OriginalMember(owner = "client!rj", name = "S", descriptor = "I")
    public static int field8665;

    @OriginalMember(owner = "client!rj", name = "V", descriptor = "I")
    public static int field8668;

    @OriginalMember(owner = "client!rj", name = "W", descriptor = "I")
    public static int field8669;

    @OriginalMember(owner = "client!rj", name = "X", descriptor = "I")
    public static int field8670;

    @OriginalMember(owner = "client!rj", name = "Y", descriptor = "I")
    public static int field8671;

    @OriginalMember(owner = "client!rj", name = "ab", descriptor = "I")
    public static int field8673;

    @OriginalMember(owner = "client!rj", name = "bb", descriptor = "I")
    public static int field8674;

    @OriginalMember(owner = "client!rj", name = "cb", descriptor = "I")
    public static int field8675;

    @OriginalMember(owner = "client!rj", name = "db", descriptor = "I")
    public static int field8676;

    @OriginalMember(owner = "client!rj", name = "eb", descriptor = "I")
    public static int field8677;

    @OriginalMember(owner = "client!rj", name = "fb", descriptor = "I")
    public static int field8678;

    @OriginalMember(owner = "client!rj", name = "lb", descriptor = "I")
    public static int field8684;

    @OriginalMember(owner = "client!rj", name = "mb", descriptor = "I")
    public static int field8685;

    @OriginalMember(owner = "client!rj", name = "nb", descriptor = "I")
    public static int field8686;

    @OriginalMember(owner = "client!rj", name = "ob", descriptor = "I")
    public static int field8687;

    @OriginalMember(owner = "client!rj", name = "Z", descriptor = "Ldg;")
    private class435 field8672;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(BLha;)Lhga;", line = 5)
    public final class186 method898(byte arg0, class66 arg1) {
        if (arg0 < 123) {
            this.field8666 = false;
        }
        ++field8674;
        if (this.field8680 == null) {
            return null;
        } else {
            class650 var3 = arg1.method533();
            var3.method1868(super.field7396 - -super.field7125, super.field7405, super.field7120 + super.field7398);
            class186 var4 = class174.method1320(1, this.field8666, 17832);
            if (!class507.field6967) {
                this.field8680.method301(var3, var4.field2877[0], 0);
            } else {
                this.field8680.method310(var3, var4.field2877[0], class90.field1369, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "(I)Z", line = 33)
    public final boolean method902(int arg0) {
        if (arg0 != 0) {
            this.field8672 = null;
        }
        ++field8671;
        if (this.field8680 != null) {
            return !this.field8680.method326();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILha;ZI)Lcb;", line = 50)
    private final class548 method3505(int arg0, class66 arg1, boolean arg2, int arg3) {
        ++field8657;
        class445 var5 = class414.field5670.method2319(65535 & this.field8661, false);
        class296 var6;
        class296 var7;
        if (this.field8682) {
            var6 = class142.field2418[0];
            var7 = class178.field2805[super.field7404];
        } else {
            if (~super.field7404 <= -4) {
                var6 = null;
            } else {
                var6 = class142.field2418[super.field7404 + 1];
            }
            var7 = class142.field2418[super.field7404];
        }
        if (arg3 != -4) {
            method3506(-49);
        }
        return var5.method2579(arg3 + 8, this.field8664, super.field7398, arg0, arg2, arg1, super.field7405, this.field8660, var6, var7, (class326) null, super.field7396);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lha;B)V", line = 81)
    public final void method1040(class66 arg0, byte arg1) {
        ++field8665;
        Object var3 = null;
        class196 var5;
        if (this.field8679 == null && this.field8667) {
            class548 var4 = this.method3505(262144, arg0, true, arg1 ^ -53);
            var5 = var4 != null ? var4.field7448 : null;
        } else {
            var5 = this.field8679;
            this.field8679 = null;
        }
        if (var5 != null) {
            class335.method2099(var5, super.field7404, super.field7396, super.field7398, (boolean[]) null);
        }
        if (arg1 != 55) {
            this.method900(-5);
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)I", line = 109)
    public final int method1033(int arg0) {
        if (arg0 >= -12) {
            return -63;
        } else {
            ++field8662;
            return this.field8660;
        }
    }

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "(I)V", line = 121)
    public static final void method3506(int arg0) {
        ++field8669;
        for (int var1 = 0; ~var1 > -101; ++var1) {
            class377.field5145[var1] = true;
        }
        if (arg0 < 72) {
            method3512(-117, -81, (String) null);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)Z", line = 138)
    public final boolean method1036(byte arg0) {
        ++field8658;
        return arg0 >= -44 ? true : this.field8667;
    }

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "(I)I", line = 150)
    public final int method900(int arg0) {
        if (arg0 != 0) {
            this.field8672 = null;
        }
        ++field8668;
        return this.field8680 == null ? 0 : this.field8680.method298();
    }

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "(B)V", line = 162)
    public static void method3507(byte arg0) {
        field8683 = null;
        if (arg0 < 100) {
            method3507((byte) -46);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILha;I)Lka;", line = 174)
    private final class499 method3508(int arg0, class66 arg1, int arg2) {
        ++field8687;
        if (this.field8680 != null && arg1.method482(this.field8680.method300(), arg2) == 0) {
            return this.field8680;
        } else {
            if (arg0 != 4) {
                this.method3505(-111, (class66) null, true, -82);
            }
            class548 var4 = this.method3505(arg2, arg1, false, -4);
            return var4 != null ? var4.field7450 : null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(Lha;B)Ldg;", line = 194)
    public final class435 method894(class66 arg0, byte arg1) {
        ++field8686;
        if (this.field8672 == null) {
            this.field8672 = class538.method3042(super.field7398, super.field7396, (byte) -47, this.method3508(4, arg0, 0), super.field7405);
        }
        if (arg1 >= -38) {
            method3510(-41, 92);
        }
        return this.field8672;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "()V", line = 210)
    public static final void method3509() {
        class677.field9437 = class677.field9436;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lha;I)V", line = 216)
    public final void method1039(class66 arg0, int arg1) {
        ++field8675;
        Object var3 = null;
        class196 var5;
        if (this.field8679 == null && this.field8667) {
            class548 var4 = this.method3505(262144, arg0, true, -4);
            var5 = var4 != null ? var4.field7448 : null;
        } else {
            var5 = this.field8679;
            this.field8679 = null;
        }
        if (var5 != null) {
            method3511(var5, super.field7404, super.field7396, super.field7398, (boolean[]) null);
        }
        if (arg1 <= 81) {
            method3507((byte) 101);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lha;III)Z", line = 243)
    public final boolean method908(class66 arg0, int arg1, int arg2, int arg3) {
        ++field8677;
        class499 var5 = this.method3508(4, arg0, arg2);
        if (var5 != null) {
            class650 var6 = arg0.method533();
            var6.method1868(super.field7396, super.field7405, super.field7398);
            return !class507.field6967 ? var5.method290(arg1, arg3, var6, false, 0) : var5.method286(arg1, arg3, var6, false, 0, class90.field1369);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lha;Lij;IIIIIZIIII)V", line = 262)
    public class622(class66 arg0, class445 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        super.field7398 = arg6;
        this.field8660 = (byte) arg11;
        this.field8682 = arg7;
        super.field7396 = arg4;
        this.field8664 = (byte) arg10;
        this.field8666 = ~arg1.field6050 != -1 && !arg7;
        this.field8661 = (short) arg1.field6104;
        this.field8667 = arg0.method479() && arg1.field6125 && !this.field8682 && ~class111.field1911.field6717.method3695((byte) 69) != -1;
        class548 var13 = this.method3505(2048, arg0, this.field8667, -4);
        if (var13 != null) {
            this.field8679 = var13.field7448;
            this.field8680 = var13.field7450;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)I", line = 285)
    public final int method1032(boolean arg0) {
        ++field8678;
        return arg0 ? -125 : 65535 & this.field8661;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)I", line = 297)
    public static final int method3510(int arg0, int arg1) {
        ++field8663;
        if (~arg1 != -6407) {
            if (~arg1 == -6410) {
                return 1;
            } else if (~arg1 != -32842) {
                if (arg1 == 6410) {
                    return 2;
                } else if (arg1 != 6407) {
                    if (arg1 == 6408) {
                        return 4;
                    } else {
                        if (arg0 != -8) {
                            method3507((byte) 87);
                        }
                        throw new IllegalArgumentException("");
                    }
                } else {
                    return 3;
                }
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lr;III[Z)V", line = 341)
    public static final void method3511(class196 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class745.field10286 != class178.field2805) {
            int var5 = class142.field2418[arg1].method1907(arg2, (byte) -88, arg3);
            for (int var6 = 0; var6 <= arg1; ++var6) {
                if (arg4 == null || arg4[var6]) {
                    class296 var7 = class142.field2418[var6];
                    if (var7 != null) {
                        var7.method1904(arg0, arg2, var5 - var7.method1907(arg2, (byte) -101, arg3), arg3, 0, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "(I)I", line = 367)
    public final int method907(int arg0) {
        ++field8684;
        if (arg0 != -20425) {
            method3507((byte) -56);
        }
        return this.field8680 == null ? 0 : this.field8680.method276();
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(Z)Z", line = 380)
    public final boolean method910(boolean arg0) {
        if (arg0) {
            this.method1037(109);
        }
        ++field8673;
        return this.field8680 != null ? this.field8680.method327() : false;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V", line = 404)
    public final void method1037(int arg0) {
        if (this.field8680 != null) {
            this.field8680.method294();
        }
        ++field8676;
        if (arg0 != -1114) {
            method3511((class196) null, -95, -80, 43, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)I", line = 417)
    public final int method1034(int arg0) {
        if (arg0 >= -125) {
            this.field8666 = false;
        }
        ++field8670;
        return this.field8664;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLha;)V", line = 429)
    public final void method901(byte arg0, class66 arg1) {
        if (arg0 < 114) {
            this.method1037(-15);
        }
        ++field8685;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILjava/lang/String;)V", line = 439)
    public static final void method3512(int arg0, int arg1, String arg2) {
        ++field8659;
        int var3 = class696.field9624;
        int[] var4 = class417.field5700;
        boolean var5 = false;
        if (arg1 != -9) {
            method3506(-95);
        }
        for (int var6 = 0; ~var6 > ~var3; ++var6) {
            class771 var7 = class527.field7150[var4[var6]];
            if (var7 != null && class235.field3379 != var7 && var7.field10641 != null && var7.field10641.equalsIgnoreCase(arg2)) {
                if (arg0 == 1) {
                    ++class485.field6558;
                    class537 var8 = class476.method2729(class333.field4500, (byte) -46, class551.field7498);
                    var8.field7295.method791(-550441944, var4[var6]);
                    var8.field7295.method800(0, 128);
                    class173.method1314(false, var8);
                } else if (~arg0 == -5) {
                    ++class469.field6347;
                    class537 var9 = class476.method2729(class218.field3214, (byte) -46, class551.field7498);
                    var9.field7295.method740(0, (byte) 67);
                    var9.field7295.method790(var4[var6], 65280);
                    class173.method1314(false, var9);
                } else if (arg0 != 5) {
                    if (~arg0 == -7) {
                        ++class357.field4892;
                        class537 var10 = class476.method2729(class400.field5512, (byte) -46, class551.field7498);
                        var10.field7295.method780(0, true);
                        var10.field7295.method790(var4[var6], 65280);
                        class173.method1314(false, var10);
                    } else if (~arg0 == -8) {
                        ++class423.field5794;
                        class537 var11 = class476.method2729(class672.field9331, (byte) -46, class551.field7498);
                        var11.field7295.method790(var4[var6], arg1 + 65289);
                        var11.field7295.method780(0, true);
                        class173.method1314(false, var11);
                    } else if (~arg0 == -9) {
                        class537 var12 = class476.method2729(class366.field4969, (byte) -46, class551.field7498);
                        var12.field7295.method800(0, 128);
                        var12.field7295.method791(-550441944, var4[var6]);
                        class173.method1314(false, var12);
                    }
                } else {
                    ++class155.field2532;
                    class537 var13 = class476.method2729(class95.field1458, (byte) -46, class551.field7498);
                    var13.field7295.method800(0, arg1 + 137);
                    var13.field7295.method781(23, var4[var6]);
                    class173.method1314(false, var13);
                }
                var5 = true;
                break;
            }
        }
        if (!var5) {
            class629.method3535(class641.field8839.method3566((byte) 92, class464.field6309) + arg2, 4, -2309);
        }
    }
}
