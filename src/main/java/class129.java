import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class129 extends class305 implements class218 {

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "Lco;")
    public class201 field1798;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "Z")
    private boolean field1790;

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V", line = 3)
    public static final void method898(int arg0, int arg1) {
        class131.field1827 = arg0;
        if (arg1 == 0) {
            ++field1794;
            class286.field4369.method2401((byte) -108);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILtq;)V", line = 16)
    public final void method260(int arg0, class63 arg1) {
        ++field1792;
        class57 var3 = this.field1798.method1369(true, super.field4538, arg1, -12, true, super.field4543, 131072);
        if (arg0 != 0) {
            this.field1798 = null;
        }
        if (var3 != null) {
            this.field1798.method1364(arg1, var3, super.field4547, super.field4542, super.field4552, super.field4541, false, -16777216);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ltq;III)Z", line = 33)
    public final boolean method259(class63 arg0, int arg1, int arg2, int arg3) {
        ++field1804;
        class57 var5 = this.field1798.method1369(false, super.field4538, arg0, -12, false, super.field4543, 65536);
        if (var5 == null) {
            return false;
        } else {
            class315 var6 = arg0.method565();
            var6.method482(super.field4543, super.field4554, super.field4538);
            int var7 = -114 % ((arg2 - -59) / 58);
            return var5.method423(arg1, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLtq;)V", line = 52)
    public final void method256(byte arg0, class63 arg1) {
        ++field1805;
        if (arg0 != 82) {
            this.method249(70);
        }
        this.field1798.method1368((byte) 111, arg1);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ltq;I)V", line = 63)
    public final void method258(class63 arg0, int arg1) {
        if (arg1 != -22360) {
            this.field1790 = false;
        }
        ++field1802;
        this.field1798.method1363(-1, arg0);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)I", line = 76)
    public final int method250(byte arg0) {
        int var2 = 51 % ((-49 - arg0) / 60);
        ++field1809;
        return this.field1798.field3064;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(Ltq;I)Lcj;", line = 89)
    public final class123 method252(class63 arg0, int arg1) {
        ++field1796;
        class57 var3 = this.field1798.method1369(true, super.field4538, arg0, -12, false, super.field4543, 1024);
        if (var3 == null) {
            return null;
        } else {
            class315 var4 = arg0.method565();
            if (arg1 != 2) {
                this.method899(49);
            }
            var4.method482(super.field4543, super.field4554, super.field4538);
            class123 var5 = null;
            if (this.field1790) {
                var5 = class225.method1462(1, arg1 + -90);
            }
            if (this.field1798.field3055 != null) {
                class268 var6 = this.field1798.field3055.method459();
                arg0.method552(var3, var6, var4, var5 == null ? null : var5.field1695[0], 0);
            } else {
                var3.method404(var4, var5 != null ? var5.field1695[0] : null, 0);
            }
            this.field1798.method1364(arg0, var3, super.field4547, super.field4542, super.field4552, super.field4541, true, -16777216);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BILtq;)Lns;", line = 125)
    public final class57 method255(byte arg0, int arg1, class63 arg2) {
        ++field1801;
        if (arg0 < 108) {
            this.method255((byte) 62, 112, (class63) null);
        }
        return this.field1798.method1369(false, 0, arg2, -12, false, 0, arg1);
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)I", line = 139)
    public final int method899(int arg0) {
        ++field1807;
        return arg0 != 0 ? 74 : this.field1798.method1371(1);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(Z)V", line = 150)
    public final void method247(boolean arg0) {
        ++field1793;
        if (arg0) {
            this.method899(-56);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lui;Ltq;I)V", line = 161)
    public static final void method900(class451 arg0, class63 arg1, int arg2) {
        ++field1795;
        class368[] var3 = class368.method2274(arg0, class23.field310, 0);
        class45.field654 = new class319[var3.length];
        for (int var4 = 0; ~var3.length < ~var4; ++var4) {
            class45.field654[var4] = arg1.method547(var3[var4], true);
        }
        class368[] var5 = class368.method2274(arg0, class492.field6922, 0);
        class32.field423 = new class319[var5.length];
        for (int var6 = 0; ~var5.length < ~var6; ++var6) {
            class32.field423[var6] = arg1.method547(var5[var6], true);
        }
        class368[] var7 = class368.method2274(arg0, class228.field3341, 0);
        class436.field6167 = new class319[var7.length];
        for (int var8 = 0; ~var8 > ~var7.length; ++var8) {
            class436.field6167[var8] = arg1.method547(var7[var8], true);
        }
        class368[] var9 = class368.method2274(arg0, class183.field2714, 0);
        class184.field2805 = new class319[var9.length];
        for (int var10 = 0; var10 < var9.length; ++var10) {
            class184.field2805[var10] = arg1.method547(var9[var10], true);
        }
        class368[] var11 = class368.method2274(arg0, class357.field5431, 0);
        class250.field3602 = new class319[var11.length];
        for (int var12 = 0; var12 < var11.length; ++var12) {
            class250.field3602[var12] = arg1.method547(var11[var12], true);
        }
        class368[] var13 = class368.method2274(arg0, class356.field5412, 0);
        class293.field4415 = new class319[var13.length];
        for (int var14 = 0; var14 < var13.length; ++var14) {
            class293.field4415[var14] = arg1.method547(var13[var14], true);
        }
        class368[] var15 = class368.method2274(arg0, class105.field1481, 0);
        class362.field5484 = new class319[var15.length];
        for (int var16 = 0; ~var15.length < ~var16; ++var16) {
            class362.field5484[var16] = arg1.method547(var15[var16], true);
        }
        class368[] var17 = class368.method2274(arg0, class449.field6349, 0);
        class182.field2701 = new class319[var17.length];
        for (int var18 = arg2; ~var17.length < ~var18; ++var18) {
            class182.field2701[var18] = arg1.method547(var17[var18], true);
        }
        class368[] var19 = class368.method2274(arg0, class317.field4760, 0);
        class186.field2823 = new class319[var19.length];
        for (int var20 = 0; ~var19.length < ~var20; ++var20) {
            class186.field2823[var20] = arg1.method547(var19[var20], true);
        }
        class368[] var21 = class368.method2274(arg0, class344.field5187, 0);
        class81.field1137 = new class319[var21.length];
        for (int var22 = 0; ~var22 > ~var21.length; ++var22) {
            class81.field1137[var22] = arg1.method547(var21[var22], true);
        }
        class368[] var23 = class368.method2274(arg0, class429.field6117, 0);
        class448.field6346 = new class319[var23.length];
        for (int var24 = 0; var24 < var23.length; ++var24) {
            class448.field6346[var24] = arg1.method547(var23[var24], true);
        }
        class368[] var25 = class368.method2274(arg0, class169.field2412, 0);
        class186.field2816 = new class319[var25.length];
        for (int var26 = 0; ~var26 > ~var25.length; ++var26) {
            class186.field2816[var26] = arg1.method547(var25[var26], true);
        }
        class349.field5324 = arg1.method547(class368.method2265(arg0, class282.field4260, 0), true);
        class45.field636 = arg1.method547(class368.method2265(arg0, class142.field2030, 0), true);
        class368[] var27 = class368.method2274(arg0, class395.field5815, 0);
        class8.field129 = new class319[var27.length];
        for (int var28 = 0; ~var27.length < ~var28; ++var28) {
            class8.field129[var28] = arg1.method547(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BZLtq;Lhm;III)V", line = 289)
    public final void method245(byte arg0, boolean arg1, class63 arg2, class352 arg3, int arg4, int arg5, int arg6) {
        ++field1806;
        if (arg0 >= -41) {
            this.method255((byte) 101, 55, (class63) null);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)Z", line = 301)
    public final boolean method253(int arg0) {
        ++field1803;
        if (arg0 >= -9) {
            this.field1798 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(Z)I", line = 312)
    public final int method257(boolean arg0) {
        ++field1808;
        if (arg0) {
            method900((class451) null, (class63) null, 98);
        }
        return this.field1798.field3063;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)Z", line = 327)
    public final boolean method254(boolean arg0) {
        if (!arg0) {
            this.method253(-2);
        }
        ++field1797;
        return this.field1798.method1370(-119);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)I", line = 341)
    public final int method244(byte arg0) {
        ++field1799;
        if (arg0 >= -8) {
            this.field1798 = null;
        }
        return this.field1798.field3065;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V", line = 354)
    public final void method249(int arg0) {
        if (arg0 < 56) {
            this.method260(-55, (class63) null);
        }
        ++field1800;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Ltq;Lvc;IIIIIZIIIIIII)V", line = 367)
    public class129(class63 arg0, class271 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field4067 == -2, class451.method2671(arg12, arg13, 0));
        this.field1798 = new class201(arg0, arg1, arg12, arg13, super.field4545, arg3, arg4, arg6, arg7, arg14);
        this.field1790 = arg1.field4053 != 0 && !arg7;
    }
}
