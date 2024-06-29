import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class617 extends class190 implements class599 {

    @OriginalMember(owner = "client!bv", name = "hb", descriptor = "Z")
    private boolean field8549;

    @OriginalMember(owner = "client!bv", name = "S", descriptor = "Z")
    private boolean field8534;

    @OriginalMember(owner = "client!bv", name = "ob", descriptor = "Z")
    private boolean field8556;

    @OriginalMember(owner = "client!bv", name = "W", descriptor = "S")
    private short field8538;

    @OriginalMember(owner = "client!bv", name = "ab", descriptor = "B")
    private byte field8542;

    @OriginalMember(owner = "client!bv", name = "lb", descriptor = "B")
    private byte field8553;

    @OriginalMember(owner = "client!bv", name = "cb", descriptor = "Z")
    private boolean field8544;

    @OriginalMember(owner = "client!bv", name = "gb", descriptor = "Lda;")
    public class470 field8548;

    @OriginalMember(owner = "client!bv", name = "kb", descriptor = "Lha;")
    private class117 field8552;

    @OriginalMember(owner = "client!bv", name = "qb", descriptor = "[I")
    public static int[] field8558 = new int[13];

    @OriginalMember(owner = "client!bv", name = "Q", descriptor = "I")
    public static int field8532;

    @OriginalMember(owner = "client!bv", name = "R", descriptor = "I")
    public static int field8533;

    @OriginalMember(owner = "client!bv", name = "T", descriptor = "I")
    public static int field8535;

    @OriginalMember(owner = "client!bv", name = "U", descriptor = "I")
    public static int field8536;

    @OriginalMember(owner = "client!bv", name = "V", descriptor = "I")
    public static int field8537;

    @OriginalMember(owner = "client!bv", name = "Y", descriptor = "I")
    public static int field8540;

    @OriginalMember(owner = "client!bv", name = "Z", descriptor = "I")
    public static int field8541;

    @OriginalMember(owner = "client!bv", name = "bb", descriptor = "I")
    public static int field8543;

    @OriginalMember(owner = "client!bv", name = "db", descriptor = "I")
    public static int field8545;

    @OriginalMember(owner = "client!bv", name = "eb", descriptor = "I")
    public static int field8546;

    @OriginalMember(owner = "client!bv", name = "fb", descriptor = "I")
    public static int field8547;

    @OriginalMember(owner = "client!bv", name = "ib", descriptor = "I")
    public static int field8550;

    @OriginalMember(owner = "client!bv", name = "jb", descriptor = "I")
    public static int field8551;

    @OriginalMember(owner = "client!bv", name = "mb", descriptor = "I")
    public static int field8554;

    @OriginalMember(owner = "client!bv", name = "nb", descriptor = "I")
    public static int field8555;

    @OriginalMember(owner = "client!bv", name = "pb", descriptor = "I")
    public static int field8557;

    @OriginalMember(owner = "client!bv", name = "rb", descriptor = "I")
    public static int field8559;

    @OriginalMember(owner = "client!bv", name = "sb", descriptor = "I")
    public static int field8560;

    @OriginalMember(owner = "client!bv", name = "tb", descriptor = "I")
    public static int field8561;

    @OriginalMember(owner = "client!bv", name = "ub", descriptor = "I")
    public static int field8562;

    @OriginalMember(owner = "client!bv", name = "vb", descriptor = "I")
    public static int field8563;

    @OriginalMember(owner = "client!bv", name = "wb", descriptor = "I")
    public static int field8564;

    @OriginalMember(owner = "client!bv", name = "xb", descriptor = "I")
    public static int field8565;

    @OriginalMember(owner = "client!bv", name = "X", descriptor = "Lcu;")
    private class475 field8539;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(BILwv;I)V")
    public static final void method3411(byte arg0, int arg1, class423 arg2, int arg3) {
        ++field8554;
        if (class38.field507) {
            class119 var4 = ~class396.field5273 != 0 ? class15.field198.method3462((byte) -79, class396.field5273) : null;
            if (client.method3858(arg2).method35(15359) && ~(class544.field7442 & 32) != -1 && (var4 == null || ~arg2.method2386(class396.field5273, var4.field1521, 0) != ~var4.field1521)) {
                ++class79.field932;
                class592.method3274(false, true, arg2.field5552, 2, class418.field5499, false, 0L, class101.field1208, arg2.field5685, arg2.field5610, class209.field2788 + " -> " + arg2.field5653);
            }
        }
        if (arg0 >= -115) {
            field8558 = null;
        }
        for (int var5 = 9; var5 >= 5; --var5) {
            String var9 = class463.method2587(arg2, var5, (byte) -58);
            if (var9 != null) {
                ++class235.field3129;
                class592.method3274(false, true, arg2.field5552, 1001, var9, false, (long) (var5 + 1), class500.method2838(var5, arg2, 125), arg2.field5685, arg2.field5610, arg2.field5653);
            }
        }
        String var6 = class159.method986(6874, arg2);
        if (var6 != null) {
            class592.method3274(false, true, arg2.field5552, 60, var6, false, 0L, arg2.field5588, arg2.field5685, arg2.field5610, arg2.field5653);
            ++class66.field814;
        }
        for (int var7 = 4; var7 >= 0; --var7) {
            String var8 = class463.method2587(arg2, var7, (byte) 119);
            if (var8 != null) {
                ++class235.field3129;
                class592.method3274(false, true, arg2.field5552, 50, var8, false, (long) (var7 - -1), class500.method2838(var7, arg2, 124), arg2.field5685, arg2.field5610, arg2.field5653);
            }
        }
        if (client.method3858(arg2).method30(17197)) {
            if (arg2.field5605 != null) {
                class592.method3274(false, true, arg2.field5552, 48, arg2.field5605, false, 0L, -1, arg2.field5685, arg2.field5610, "");
            } else {
                class592.method3274(false, true, arg2.field5552, 48, class371.field4888.method2141(class422.field5539, true), false, 0L, -1, arg2.field5685, arg2.field5610, "");
            }
            ++class125.field1743;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lr;Z)V")
    public final void method177(class562 arg0, boolean arg1) {
        ++field8555;
        if (!arg1) {
            this.field8548 = null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILir;ZILr;IB)V")
    public final void method169(int arg0, class27 arg1, boolean arg2, int arg3, class562 arg4, int arg5, byte arg6) {
        if (!(arg1 instanceof class617)) {
            if (arg1 instanceof class120) {
                class120 var8 = (class120) arg1;
                if (this.field8548 != null && var8.field1547 != null) {
                    this.field8548.method617(var8.field1547, arg5, arg3, arg0, arg2);
                }
            }
        } else {
            class617 var9 = (class617) arg1;
            if (this.field8548 != null && var9.field8548 != null) {
                this.field8548.method617(var9.field8548, arg5, arg3, arg0, arg2);
            }
        }
        if (arg6 < -117) {
            ++field8551;
        }
    }

    @OriginalMember(owner = "client!bv", name = "l", descriptor = "(I)I")
    public final int method173(int arg0) {
        if (arg0 != 0) {
            return -108;
        } else {
            ++field8559;
            return this.field8548 != null ? this.field8548.method621() : 0;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(BLr;)Lqw;")
    public final class329 method165(byte arg0, class562 arg1) {
        ++field8550;
        if (this.field8548 == null) {
            return null;
        } else if (arg0 <= 109) {
            return null;
        } else {
            class487 var3 = arg1.method1153();
            var3.method359(super.field398, super.field388, super.field397);
            class329 var4 = null;
            if (this.field8534) {
                var4 = class541.method3035(27479, 1);
            }
            if (!class347.field4632) {
                this.field8548.method625(var3, var4 != null ? var4.field4414[0] : null, 0);
            } else {
                this.field8548.method648(var3, var4 == null ? null : var4.field4414[0], class414.field5430, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lr;B)V")
    public final void method707(class562 arg0, byte arg1) {
        ++field8533;
        Object var3 = null;
        int var4 = -52 / ((arg1 - -28) / 54);
        class117 var6;
        if (this.field8552 == null && this.field8544) {
            class606 var5 = this.method3416(6041, 262144, arg0, true);
            var6 = var5 != null ? var5.field8446 : null;
        } else {
            var6 = this.field8552;
            this.field8552 = null;
        }
        if (var6 != null) {
            class614.method3395(var6, super.field386, super.field398, super.field397, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(IIIIII)I")
    public static final int method3412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8547;
        if (class246.field3214 == null) {
            return 0;
        } else {
            if (arg1 != 0) {
                field8558 = null;
            }
            if (~arg2 > -4) {
                int var6 = arg3 >> 9;
                int var7 = arg0 >> 9;
                if (~arg5 > -1 || ~arg4 > -1 || ~arg5 < ~(class703.field9886 - 1) || ~arg4 < ~(class431.field5789 - 1)) {
                    return 0;
                }
                if (var6 < 1 || ~var7 > -2 || ~(class703.field9886 + -1) > ~var6 || ~var7 < ~(class431.field5789 + -1)) {
                    return 0;
                }
                boolean var8 = (class31.field440[1][arg3 >> 9][arg0 >> 9] & 2) != 0;
                if (~(511 & arg3) == -1) {
                    boolean var9 = ~(2 & class31.field440[1][var6 + -1][arg0 >> 9]) != -1;
                    boolean var10 = (class31.field440[1][var6][arg0 >> 9] & 2) != 0;
                    if (!var9 != !var10) {
                        var8 = ~(class31.field440[1][arg5][arg4] & 2) != -1;
                    }
                }
                if (~(511 & arg0) == -1) {
                    boolean var11 = ~(2 & class31.field440[1][arg3 >> 9][var7 + -1]) != -1;
                    boolean var12 = ~(class31.field440[1][arg3 >> 9][var7] & 2) != -1;
                    if (!var12 == var11) {
                        var8 = (2 & class31.field440[1][arg5][arg4]) != 0;
                    }
                }
                if (var8) {
                    ++arg2;
                }
            }
            return class246.field3214[arg2].method1609(arg3, arg0, arg1 + 24);
        }
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(Lr;Ltc;IIIIIZIIZ)V")
    public class617(class562 arg0, class600 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class123.method723((byte) -68, arg8, arg9));
        this.field8549 = arg10;
        this.field8534 = ~arg1.field8293 != -1 && !arg7;
        this.field8556 = arg7;
        this.field8538 = (short) arg1.field8345;
        super.field398 = arg4;
        super.field397 = arg6;
        this.field8542 = (byte) arg9;
        this.field8553 = (byte) arg8;
        this.field8544 = arg0.method1084() && arg1.field8305 && !this.field8556 && class602.field8408.method1870((byte) -54, class618.field8566) != 0;
        int var12 = 2048;
        if (this.field8549) {
            var12 |= 65536;
        }
        class606 var13 = this.method3416(6041, var12, arg0, this.field8544);
        if (var13 != null) {
            this.field8548 = var13.field8448;
            this.field8552 = var13.field8446;
            if (this.field8549) {
                this.field8548 = this.field8548.method649((byte) 0, var12, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(I)Z")
    public final boolean method705(int arg0) {
        ++field8565;
        return arg0 < 67 ? true : this.field8544;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IILr;)Lda;")
    private final class470 method3413(int arg0, int arg1, class562 arg2) {
        ++field8537;
        if (arg1 != 27658) {
            return null;
        } else if (this.field8548 != null && arg2.method1053(this.field8548.method604(), arg0) == 0) {
            return this.field8548;
        } else {
            class606 var4 = this.method3416(6041, arg0, arg2, false);
            return var4 != null ? var4.field8448 : null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(Lr;I)Lcu;")
    public final class475 method174(class562 arg0, int arg1) {
        if (arg1 != -14700) {
            this.method165((byte) 111, (class562) null);
        }
        ++field8546;
        if (this.field8539 == null) {
            this.field8539 = class258.method1562(super.field398, (byte) -47, super.field397, this.method3413(0, 27658, arg0), super.field388);
        }
        return this.field8539;
    }

    @OriginalMember(owner = "client!bv", name = "i", descriptor = "(I)Z")
    public final boolean method166(int arg0) {
        ++field8564;
        return arg0 != 0 ? true : this.field8549;
    }

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "(I)Z")
    public final boolean method161(int arg0) {
        if (arg0 != 28602) {
            this.field8552 = null;
        }
        ++field8560;
        return true;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V")
    public final void method703(int arg0) {
        if (this.field8548 != null) {
            this.field8548.method634();
        }
        ++field8562;
        if (arg0 != 6956) {
            method3412(-62, -74, 21, 87, 4, 73);
        }
    }

    @OriginalMember(owner = "client!bv", name = "n", descriptor = "(I)V")
    public static void method3414(int arg0) {
        if (arg0 != 27166) {
            method3414(31);
        }
        field8558 = null;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lr;I)V")
    public final void method700(class562 arg0, int arg1) {
        ++field8543;
        if (arg1 != -21186) {
            this.method710((byte) 68);
        }
        Object var3 = null;
        class117 var5;
        if (this.field8552 == null && this.field8544) {
            class606 var4 = this.method3416(arg1 ^ -17753, 262144, arg0, true);
            var5 = var4 != null ? var4.field8446 : null;
        } else {
            var5 = this.field8552;
            this.field8552 = null;
        }
        if (var5 != null) {
            class201.method1287(var5, super.field386, super.field398, super.field397, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "(I)I")
    public final int method706(int arg0) {
        if (arg0 != 16259) {
            return 68;
        } else {
            ++field8563;
            return this.field8542;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZLkba;)V")
    public static final void method3415(boolean arg0, class573 arg1) {
        ++field8541;
        if (!arg0) {
            class502 var2 = (class502) class140.field1903.method3057(1, (long) arg1.field3010);
            if (var2 != null) {
                if (var2.field6915 != null) {
                    class126.field1759.method1345(var2.field6915);
                    var2.field6915 = null;
                }
                var2.method242(true);
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)I")
    public final int method710(byte arg0) {
        if (arg0 <= 55) {
            this.field8539 = null;
        }
        ++field8561;
        return this.field8538 & 65535;
    }

    @OriginalMember(owner = "client!bv", name = "j", descriptor = "(I)Z")
    public final boolean method168(int arg0) {
        if (arg0 != 20071) {
            this.method167(false, (class562) null, 21, -57);
        }
        ++field8535;
        return this.field8548 == null ? false : this.field8548.method657();
    }

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "(B)V")
    public final void method175(byte arg0) {
        if (arg0 <= 24) {
            this.field8556 = false;
        }
        ++field8545;
        this.field8549 = false;
        if (this.field8548 != null) {
            this.field8548.method602(this.field8548.method604() & -65537);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZLr;II)Z")
    public final boolean method167(boolean arg0, class562 arg1, int arg2, int arg3) {
        ++field8540;
        if (arg0) {
            this.field8548 = null;
        }
        class470 var5 = this.method3413(131072, 27658, arg1);
        if (var5 != null) {
            class487 var6 = arg1.method1153();
            var6.method359(super.field398, super.field388, super.field397);
            return !class347.field4632 ? var5.method655(arg3, arg2, var6, false) : var5.method603(arg3, arg2, var6, false, class414.field5430);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(B)I")
    public final int method699(byte arg0) {
        if (arg0 >= -32) {
            return -111;
        } else {
            ++field8532;
            return this.field8553;
        }
    }

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "(B)I")
    public final int method176(byte arg0) {
        if (arg0 > -114) {
            return -105;
        } else {
            ++field8557;
            return this.field8548 != null ? this.field8548.method613() : 0;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IILr;Z)Lht;")
    private final class606 method3416(int arg0, int arg1, class562 arg2, boolean arg3) {
        ++field8536;
        class600 var5 = class118.field1510.method3921(this.field8538 & 65535, -95);
        if (arg0 != 6041) {
            this.field8549 = false;
        }
        class270 var6;
        class270 var7;
        if (this.field8556) {
            var6 = class454.field5981[0];
            var7 = class446.field5914[super.field386];
        } else {
            if (~super.field386 > -4) {
                var6 = class454.field5981[super.field386 + 1];
            } else {
                var6 = null;
            }
            var7 = class454.field5981[super.field386];
        }
        return var5.method3321(super.field388, this.field8542, arg3, arg2, super.field397, false, super.field398, arg1, this.field8553, var6, var7);
    }
}
