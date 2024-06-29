import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class625 extends class118 {

    @OriginalMember(owner = "client!mt", name = "o", descriptor = "Lqp;")
    public static class586 field9162 = new class586(100, -1);

    @OriginalMember(owner = "client!mt", name = "t", descriptor = "[I")
    public static int[] field9167 = new int[14];

    @OriginalMember(owner = "client!mt", name = "s", descriptor = "Lrk;")
    public static class419 field9166 = new class419();

    @OriginalMember(owner = "client!mt", name = "h", descriptor = "I")
    public static int field9155;

    @OriginalMember(owner = "client!mt", name = "i", descriptor = "I")
    public static int field9156;

    @OriginalMember(owner = "client!mt", name = "j", descriptor = "I")
    public static int field9157;

    @OriginalMember(owner = "client!mt", name = "k", descriptor = "I")
    public static int field9158;

    @OriginalMember(owner = "client!mt", name = "l", descriptor = "I")
    public static int field9159;

    @OriginalMember(owner = "client!mt", name = "m", descriptor = "I")
    public static int field9160;

    @OriginalMember(owner = "client!mt", name = "n", descriptor = "I")
    public static int field9161;

    @OriginalMember(owner = "client!mt", name = "q", descriptor = "I")
    public static int field9164;

    @OriginalMember(owner = "client!mt", name = "r", descriptor = "I")
    public static int field9165;

    @OriginalMember(owner = "client!mt", name = "p", descriptor = "[Lwca;")
    public static class311[] field9163;

    @OriginalMember(owner = "client!mt", name = "u", descriptor = "[Lgp;")
    public static class562[] field9168;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)Z", line = 3)
    public final boolean method446(byte arg0) {
        ++field9156;
        if (arg0 != 29) {
            field9167 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lqa;B)V", line = 15)
    public static final void method3647(class167 arg0, byte arg1) {
        ++field9159;
        int var2 = class290.field4257;
        int var3 = class218.field3232;
        int var4 = class452.field6607;
        int var5 = class475.field7252 + -3;
        byte var6 = 20;
        if (class597.field8787 == null || class455.field6637 == null) {
            if (class371.field5368.method3491(120, class268.field3983) && class371.field5368.method3491(104, class285.field4196)) {
                class597.field8787 = arg0.method961(class610.method3555(class371.field5368, class268.field3983, 0), true);
                class610 var7 = class610.method3555(class371.field5368, class285.field4196, 0);
                class455.field6637 = arg0.method961(var7, true);
                var7.method3544();
                class532.field7878 = arg0.method961(var7, true);
            } else {
                arg0.method980(var2, var3, var4, var6, class379.field5560 | -class281.field4177 + 255 << 24, 1);
            }
        }
        if (class597.field8787 != null && class455.field6637 != null) {
            int var8 = (var4 + -(class455.field6637.method718() * 2)) / class597.field8787.method718();
            for (int var9 = 0; ~var9 > ~var8; ++var9) {
                class597.field8787.method723(class455.field6637.method718() + var2 + class597.field8787.method718() * var9, var3);
            }
            class455.field6637.method723(var2, var3);
            class532.field7878.method723(var2 + var4 - class532.field7878.method718(), var3);
        }
        class179.field2757.method1683(-16777216 | class153.field1956, -1, class88.field1126.method2953(3181, class77.field889), var2 + 3, var3 + 14, 19945);
        arg0.method980(var2, var3 + var6, var4, var5 - var6, -class281.field4177 + 255 << 24 | class379.field5560, 1);
        int var10 = class350.field5071.method635(arg1 ^ 194);
        int var11 = class350.field5071.method633((byte) 29);
        int var12 = 0;
        for (class548 var13 = (class548) class272.field4014.method2496((byte) 24); var13 != null; var13 = (class548) class272.field4014.method2494(103)) {
            int var31 = var3 - -var6 + (class487.field7385 + -1 + -var12) * 16 + 13;
            ++var12;
            if (~var2 > ~var10 && var10 < var2 + var4 && ~var11 < ~(var31 + -13) && var31 + 4 > var11 && var13.field8172) {
                arg0.method980(var2, var31 + -12, var4, 16, class579.field8528 | -class350.field5087 + 255 << 24, 1);
            }
        }
        if ((class145.field1878 == null || class257.field3761 == null || class94.field1164 == null) && class371.field5368.method3491(104, class552.field8212) && class371.field5368.method3491(116, class626.field9183) && class371.field5368.method3491(arg1 ^ -23, class404.field5809)) {
            class610 var14 = class610.method3555(class371.field5368, class626.field9183, 0);
            class257.field3761 = arg0.method961(var14, true);
            var14.method3544();
            class32.field329 = arg0.method961(var14, true);
            class145.field1878 = arg0.method961(class610.method3555(class371.field5368, class552.field8212, 0), true);
            class610 var15 = class610.method3555(class371.field5368, class404.field5809, 0);
            class94.field1164 = arg0.method961(var15, true);
            var15.method3544();
            class125.field1644 = arg0.method961(var15, true);
        }
        if (class145.field1878 != null && class257.field3761 != null && class94.field1164 != null) {
            int var16 = (-(2 * class94.field1164.method718()) + var4) / class145.field1878.method718();
            for (int var17 = 0; ~var17 > ~var16; ++var17) {
                class145.field1878.method723(var2 + class94.field1164.method718() + class145.field1878.method718() * var17, var3 + var5 + -class145.field1878.method721());
            }
            int var18 = (-var6 + var5 + -class94.field1164.method721()) / class257.field3761.method721();
            for (int var19 = 0; ~var18 < ~var19; ++var19) {
                class257.field3761.method723(var2, var3 - (-var6 - class257.field3761.method721() * var19));
                class32.field329.method723(var2 + var4 - class32.field329.method718(), class257.field3761.method721() * var19 + var3 + var6);
            }
            class94.field1164.method723(var2, -class94.field1164.method721() + var3 + var5);
            class125.field1644.method723(-class94.field1164.method718() + var2 - -var4, -class94.field1164.method721() + (var3 - -var5));
        }
        int var20 = 0;
        for (class548 var21 = (class548) class272.field4014.method2496((byte) 17); var21 != null; var21 = (class548) class272.field4014.method2494(72)) {
            int var22 = (-var20 + class487.field7385 - 1) * 16 + 13 + var3 + var6;
            int var23 = -16777216 | class153.field1956;
            if (var2 < var10 && var10 < var2 + var4 && ~(var22 + -13) > ~var11 && ~var11 > ~(var22 + 4) && var21.field8172) {
                var23 = class620.field9060 | -16777216;
            }
            int[] var24 = null;
            if (class647.method3732(var21.field8163, (byte) -80)) {
                var24 = class216.field3204.method3357((int) var21.field8171, (byte) -73).field5965;
            } else if (~var21.field8174 != 0) {
                var24 = class216.field3204.method3357(var21.field8174, (byte) -105).field5965;
            } else if (!class555.method3242(var21.field8163, (byte) 114)) {
                if (class340.method2113((byte) -82, var21.field8163)) {
                    Object var25 = null;
                    class158 var26;
                    if (~var21.field8163 != -1007) {
                        var26 = class312.field4690.method2004(false, (int) (2147483647L & var21.field8171 >>> 32));
                    } else {
                        var26 = class312.field4690.method2004(false, (int) var21.field8171);
                    }
                    if (var26.field2035 != null) {
                        var26 = var26.method923(-117, class406.field5823);
                    }
                    if (var26 != null) {
                        var24 = var26.field2104;
                    }
                }
            } else {
                class234 var27 = (class234) class627.field9185.method1333((long) ((int) var21.field8171), false);
                if (var27 != null) {
                    class383 var28 = var27.field3443;
                    class429 var29 = var28.field5601;
                    if (var29.field6238 != null) {
                        var29 = var29.method2629(class406.field5823, (byte) 103);
                    }
                    if (var29 != null) {
                        var24 = var29.field6253;
                    }
                }
            }
            String var30 = class105.method606((byte) 66, var21);
            if (var24 != null) {
                var30 = var30 + class148.method874(23965, var24);
            }
            class179.field2757.method1678(class465.field6720, (byte) -102, var23, 0, var2 + 3, var22, var30, class427.field6112);
            if (var21.field8169) {
                class148.field1920.method723(class511.field7585.method1053((byte) 37, var30) + var2 + 5, var22 + -12);
            }
            ++var20;
        }
        class265.method1698(class290.field4257, class475.field7252, class218.field3232, class452.field6607, (byte) 75);
        if (arg1 != -126) {
            method3647((class167) null, (byte) 105);
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IBI)V", line = 219)
    public final void method445(int arg0, byte arg1, int arg2) {
        ++field9158;
        if (arg1 != 23) {
            field9166 = null;
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(BZ)V", line = 233)
    public final void method439(byte arg0, boolean arg1) {
        ++field9161;
        if (arg0 != 56) {
            this.method439((byte) 17, true);
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZB)V", line = 244)
    public final void method442(boolean arg0, byte arg1) {
        super.field1544.method2805(true, -121);
        if (arg1 >= -101) {
            field9166 = null;
        }
        ++field9160;
    }

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "(B)V", line = 258)
    public static final void method3648(byte arg0) {
        class328.field4849.method2037(true);
        ++field9157;
        class100.field1273.method2037(true);
        class369.field5335.method2037(true);
        class125.field1646.method2037(true);
        int var1 = -10 / ((arg0 - 48) / 35);
        class316.field4733.method2037(true);
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(I)V", line = 274)
    public static void method3649(int arg0) {
        field9168 = null;
        field9163 = null;
        field9166 = null;
        field9162 = null;
        if (arg0 == 1) {
            field9167 = null;
        }
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Los;)V", line = 294)
    public class625(class468 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V", line = 297)
    public final void method441(int arg0) {
        ++field9164;
        int var2 = 33 / ((arg0 - -58) / 41);
        super.field1544.method2805(false, -126);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lbaa;IB)V", line = 307)
    public final void method440(class541 arg0, int arg1, byte arg2) {
        super.field1544.method2811(arg0, -2);
        if (arg2 < -17) {
            ++field9165;
            super.field1544.method2791(arg1, (byte) -104);
        }
    }
}
