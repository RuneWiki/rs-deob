import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class397 extends class344 implements class115 {

    @OriginalMember(owner = "client!cq", name = "y", descriptor = "B")
    private byte field5645;

    @OriginalMember(owner = "client!cq", name = "p", descriptor = "Z")
    private boolean field5636;

    @OriginalMember(owner = "client!cq", name = "B", descriptor = "B")
    private byte field5648;

    @OriginalMember(owner = "client!cq", name = "r", descriptor = "Z")
    private boolean field5638;

    @OriginalMember(owner = "client!cq", name = "l", descriptor = "Z")
    private boolean field5632;

    @OriginalMember(owner = "client!cq", name = "L", descriptor = "B")
    private byte field5658;

    @OriginalMember(owner = "client!cq", name = "A", descriptor = "S")
    private short field5647;

    @OriginalMember(owner = "client!cq", name = "v", descriptor = "Z")
    private boolean field5642;

    @OriginalMember(owner = "client!cq", name = "F", descriptor = "Lk;")
    private class485 field5652;

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "Lr;")
    public class157 field5631;

    @OriginalMember(owner = "client!cq", name = "M", descriptor = "Ldv;")
    public static class566 field5659 = new class566(59, -1);

    @OriginalMember(owner = "client!cq", name = "Q", descriptor = "Ldea;")
    public static class205 field5663 = new class205(16);

    @OriginalMember(owner = "client!cq", name = "T", descriptor = "I")
    public static int field5666 = 0;

    @OriginalMember(owner = "client!cq", name = "R", descriptor = "[I")
    public static int[] field5664 = new int[14];

    @OriginalMember(owner = "client!cq", name = "U", descriptor = "F")
    public static float field5667;

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "I")
    public static int field5630;

    @OriginalMember(owner = "client!cq", name = "m", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!cq", name = "n", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!cq", name = "o", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!cq", name = "q", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!cq", name = "s", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!cq", name = "t", descriptor = "I")
    public static int field5640;

    @OriginalMember(owner = "client!cq", name = "u", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!cq", name = "w", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!cq", name = "x", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!cq", name = "z", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!cq", name = "C", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!cq", name = "E", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!cq", name = "G", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!cq", name = "H", descriptor = "I")
    public static int field5654;

    @OriginalMember(owner = "client!cq", name = "I", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!cq", name = "J", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!cq", name = "K", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!cq", name = "N", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!cq", name = "O", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!cq", name = "P", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!cq", name = "S", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!cq", name = "W", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!cq", name = "D", descriptor = "Lnk;")
    private class611 field5650;

    @OriginalMember(owner = "client!cq", name = "V", descriptor = "[I")
    public static int[] field5668;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lqa;BI)Lr;")
    private final class157 method2372(class207 arg0, byte arg1, int arg2) {
        ++field5630;
        if (arg1 >= -87) {
            field5663 = null;
        }
        if (this.field5631 != null && ~arg0.method1357(this.field5631.method166(), arg2) == -1) {
            return this.field5631;
        } else {
            class105 var4 = this.method2378(arg2, false, arg0, 105);
            return var4 == null ? null : var4.field1580;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)I")
    public static final int method2373(int arg0, String arg1, int arg2, String arg3) {
        ++field5657;
        int var4 = arg3.length();
        int var5 = arg1.length();
        int var6 = arg2;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (~(-var8 + var6) > ~var4 || var7 - var9 < var5) {
            if (-var8 + var6 >= var4) {
                return -1;
            }
            if (~var5 >= ~(-var9 + var7)) {
                return 1;
            }
            char var22;
            if (var8 == 0) {
                var22 = arg3.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (~var9 == -1) {
                var24 = arg1.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class73.method579(101, var22);
            var9 = class73.method579(101, var24);
            char var26 = class560.method3190(arg2 ^ -73, arg0, var22);
            char var27 = class560.method3190(127, arg0, var24);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class214.method1396(false, var28, arg0) + -class214.method1396(false, var29, arg0);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var10 > var11; ++var11) {
            int var16;
            int var17;
            if (~arg0 == -3) {
                var16 = var5 - 1 + -var11;
                var17 = -var11 + var4 + -1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg3.charAt(var17);
            char var19 = arg1.charAt(var16);
            if (~var18 != ~var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class214.method1396(false, var20, arg0) + -class214.method1396(false, var21, arg0);
                }
            }
        }
        int var12 = -var5 + var4;
        if (~var12 != -1) {
            return var12;
        } else {
            for (int var13 = 0; ~var13 > ~var10; ++var13) {
                char var14 = arg3.charAt(var13);
                char var15 = arg1.charAt(var13);
                if (~var14 != ~var15) {
                    return class214.method1396(false, var14, arg0) + -class214.method1396(false, var15, arg0);
                }
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(Z)I")
    public final int method752(boolean arg0) {
        if (!arg0) {
            this.field5642 = true;
        }
        ++field5633;
        return this.field5648;
    }

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "(I)V")
    public static void method2374(int arg0) {
        field5659 = null;
        field5668 = null;
        field5664 = null;
        int var1 = -5 / ((arg0 - -35) / 44);
        field5663 = null;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZZ)V")
    public static final void method2375(boolean arg0, boolean arg1) {
        ++field5651;
        if (arg1) {
            if (~class56.field1005 != 0) {
                class296.method1892(class56.field1005, (byte) -114);
            }
            for (class128 var2 = (class128) class211.field2971.method1248(-1); var2 != null; var2 = (class128) class211.field2971.method1245((byte) 95)) {
                if (!var2.method1120(0)) {
                    var2 = (class128) class211.field2971.method1248(-1);
                    if (var2 == null) {
                        break;
                    }
                }
                class299.method1902(true, var2, (byte) 78, false);
            }
            class56.field1005 = -1;
            class211.field2971 = new class205(8);
            class207.method1354((byte) -84);
            class56.field1005 = class68.field1151;
            class443.method2621(false, !arg0);
            class40.method413(-101);
            class123.method849(class56.field1005);
        }
        class150.field2283 = false;
        if (!arg0) {
            field5663 = null;
        }
        class636.field9276 = "";
        class146.field2257 = "";
        class152.method995((byte) -84);
        class575.field7926 = -1;
        class464.method2715((byte) 110, class644.field9360);
        class645.field9372 = new class188();
        class645.field9372.field616[0] = class32.field513 / 2;
        class645.field9372.field6037 = class32.field513 * 128 / 2;
        class645.field9372.field6029 = class611.field8786 * 128 / 2;
        class645.field9372.field618[0] = class611.field8786 / 2;
        class462.field6488 = 0;
        class563.field7794 = 0;
        if (~class107.field1653 == -3) {
            class462.field6488 = class333.field4458 << 7;
            class563.field7794 = class462.field6490 << 7;
        } else {
            class5.method37(-68);
        }
        class465.method2718(-8274);
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)I")
    public final int method749(int arg0) {
        ++field5654;
        if (arg0 != 24194) {
            this.method746((byte) -41, (class207) null);
        }
        return this.field5645;
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lqa;Lss;IIIIZIIZ)V")
    public class397(class207 arg0, class364 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class252.method1569(false, arg8, arg7));
        super.field4629 = arg3;
        this.field5645 = (byte) arg8;
        super.field4630 = arg5;
        this.field5636 = arg9;
        this.field5648 = (byte) arg7;
        this.field5638 = arg1.field4881 != 0 && !arg6;
        this.field5632 = arg6;
        this.field5658 = (byte) arg2;
        this.field5647 = (short) arg1.field4944;
        this.field5642 = arg0.method1345() && arg1.field4913 && !this.field5632 && ~class491.field6875.method1507(class103.field1570, (byte) 93) != -1;
        int var11 = 2048;
        if (this.field5636) {
            var11 |= 65536;
        }
        class105 var12 = this.method2378(var11, this.field5642, arg0, -7);
        if (var12 != null) {
            this.field5652 = var12.field1585;
            this.field5631 = var12.field1580;
            if (this.field5636) {
                this.field5631 = this.field5631.method163((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(I)Z")
    public final boolean method747(int arg0) {
        ++field5655;
        return arg0 != -23611 ? false : this.field5642;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lan;BLqa;)V")
    public static final void method2376(class21 arg0, byte arg1, class207 arg2) {
        ++field5634;
        if (!class283.field3913) {
            arg2.method1274(0);
            class175.field2512 = arg2.method1332(class38.method396(arg0, class150.field2285), true);
            class175.field2512.method497((class387.field5196 - class175.field2512.method419()) / 2, (class134.field2128 - class175.field2512.method432()) / 2);
            class62.field1079 = arg2.method1332(class38.method396(arg0, class427.field6067), true);
            if (arg1 <= -118) {
                class62.field1079.method497((class387.field5196 + -class62.field1079.method419()) / 2, 18);
                class283.field3913 = true;
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BLdaa;)Lrb;")
    public static final class296 method2377(byte arg0, class11 arg1) {
        int var2 = 22 % ((-10 - arg0) / 62);
        ++field5649;
        return new class296(arg1.method111(-125), arg1.method111(-120), arg1.method111(-123), arg1.method111(-126), arg1.method89((byte) -82), arg1.method110((byte) 117));
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BLqa;)V")
    public final void method746(byte arg0, class207 arg1) {
        ++field5656;
        Object var3 = null;
        if (arg0 > -50) {
            method2377((byte) 81, (class11) null);
        }
        class485 var5;
        if (this.field5652 == null && this.field5642) {
            class105 var4 = this.method2378(262144, true, arg1, 124);
            var5 = var4 != null ? var4.field1585 : null;
        } else {
            var5 = this.field5652;
            this.field5652 = null;
        }
        if (var5 != null) {
            class104.method734(var5, this.field5658, super.field4629, super.field4630, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BLqa;I)Lr;")
    public final class157 method744(byte arg0, class207 arg1, int arg2) {
        ++field5660;
        int var4 = 111 / ((arg0 - -54) / 60);
        return this.method2372(arg1, (byte) -89, arg2);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
    public final void method750(int arg0) {
        ++field5640;
        if (arg0 <= 88) {
            this.method264(-21);
        }
        if (this.field5631 != null) {
            this.field5631.method156();
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IZIILjt;ILqa;)V")
    public final void method258(int arg0, boolean arg1, int arg2, int arg3, class87 arg4, int arg5, class207 arg6) {
        ++field5643;
        if (arg4 instanceof class397) {
            class397 var8 = (class397) arg4;
            if (this.field5631 != null && var8.field5631 != null) {
                this.field5631.method147(var8.field5631, arg5, arg3, arg0, arg1);
            }
        } else if (arg4 instanceof class602) {
            class602 var9 = (class602) arg4;
            if (this.field5631 != null && var9.field8677 != null) {
                this.field5631.method147(var9.field8677, arg5, arg3, arg0, arg1);
            }
        }
        if (arg2 <= 79) {
            field5666 = -66;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Z)I")
    public final int method748(boolean arg0) {
        if (arg0) {
            return -63;
        } else {
            ++field5637;
            return this.field5647 & 65535;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lqa;B)V")
    public final void method487(class207 arg0, byte arg1) {
        ++field5644;
        if (arg1 != 21) {
            this.field5638 = true;
        }
    }

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "(I)V")
    public final void method262(int arg0) {
        ++field5661;
        if (arg0 != 1) {
            this.field5632 = true;
        }
        this.field5636 = false;
        if (this.field5631 != null) {
            this.field5631.method138(-65537 & this.field5631.method166());
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILqa;)V")
    public final void method751(int arg0, class207 arg1) {
        ++field5646;
        Object var3 = null;
        class485 var5;
        if (this.field5652 == null && this.field5642) {
            class105 var4 = this.method2378(262144, true, arg1, -112);
            var5 = var4 == null ? null : var4.field1585;
        } else {
            var5 = this.field5652;
            this.field5652 = null;
        }
        if (arg0 > 0) {
            this.method490(true, (class207) null);
        }
        if (var5 != null) {
            class294.method1888(var5, this.field5658, super.field4629, super.field4630, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(ZLqa;)Lvw;")
    public final class254 method483(boolean arg0, class207 arg1) {
        ++field5662;
        if (this.field5631 == null) {
            return null;
        } else {
            if (!arg0) {
                field5665 = -30;
            }
            class163 var3 = arg1.method1344();
            var3.method1054(super.field4629, super.field4628, super.field4630);
            class254 var4 = null;
            if (this.field5638) {
                var4 = class110.method772(1, 1);
            }
            this.field5631.method154(var3, var4 == null ? null : var4.field3525[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "(I)Z")
    public final boolean method264(int arg0) {
        if (arg0 != 1) {
            return false;
        } else {
            ++field5635;
            return this.field5636;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZLqa;)Lnk;")
    public final class611 method490(boolean arg0, class207 arg1) {
        if (arg0) {
            return null;
        } else {
            if (this.field5650 == null) {
                this.field5650 = class563.method3213(super.field4628, this.method2372(arg1, (byte) -116, 0), super.field4629, super.field4630, true);
            }
            ++field5653;
            return this.field5650;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IZLqa;I)Lgm;")
    private final class105 method2378(int arg0, boolean arg1, class207 arg2, int arg3) {
        ++field5639;
        int var5 = 116 % ((arg3 - 55) / 41);
        class364 var6 = class18.field227.method1201((byte) 44, 65535 & this.field5647);
        class174 var7;
        class174 var8;
        if (!this.field5632) {
            var7 = class608.field8767[this.field5658];
            if (this.field5658 < 3) {
                var8 = class608.field8767[this.field5658 + 1];
            } else {
                var8 = null;
            }
        } else {
            var7 = client.field3472[this.field5658];
            var8 = class608.field8767[0];
        }
        return var6.method2176(this.field5648, arg2, super.field4629, var7, this.field5645, arg1, super.field4630, var8, -333, super.field4628, arg0);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lqa;III)Z")
    public final boolean method488(class207 arg0, int arg1, int arg2, int arg3) {
        ++field5641;
        class157 var5 = this.method2372(arg0, (byte) -120, 131072);
        if (arg3 != 1) {
            this.method2378(115, true, (class207) null, -79);
        }
        if (var5 != null) {
            class163 var6 = arg0.method1344();
            var6.method1054(super.field4629, super.field4628, super.field4630);
            return var5.method143(arg1, arg2, var6, false);
        } else {
            return false;
        }
    }
}
