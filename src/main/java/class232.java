import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class232 {

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "Lv;")
    private class57 field4140 = new class57();

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    private int field4124;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
    private int field4137;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "Lka;")
    private class157 field4141;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "[S")
    public static short[] field4134 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "Lsg;")
    public static class30 field4132 = class167.method1221((byte) 33, "weiss:");

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "Lsg;")
    private static class30 field4143 = class167.method1221((byte) 33, "Allocated memory");

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "Lsg;")
    public static class30 field4138 = field4143;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "Lka;")
    public static class157 field4130 = new class157(512);

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "Lsg;")
    public static class30 field4144 = class167.method1221((byte) 33, "_labels");

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "Lmc;")
    public static class151 field4127;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "Lcc;")
    public static class206 field4126;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "[I")
    public static int[] field4139;

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "[I")
    public static int[] field4142;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)V")
    public final void method1642(int arg0, int arg1) {
        field4136++;
        if (arg1 <= 59) {
            this.field4140 = null;
        }
        if (class244.field4352 == null) {
            return;
        }
        for (class53 var3 = (class53) this.field4140.method542(18844); var3 != null; var3 = (class53) this.field4140.method533(7)) {
            if (var3.method517(true)) {
                if (var3.method521(90) == null) {
                    var3.method1681(false);
                    var3.method701(true);
                    this.field4137++;
                }
            } else if ((long) arg0 < ++var3.field1743) {
                class53 var4 = class244.field4352.method175(-27285, var3);
                this.field4141.method1164((byte) -90, var3.field4215, var4);
                class262.method1811(var3, var4, (byte) 34);
                var3.method1681(false);
                var3.method701(true);
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IB)I")
    public static final int method1643(int arg0, byte arg1) {
        field4123++;
        if (arg1 != -86) {
            method1645((byte) 31);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
    public final Object method1644(byte arg0, long arg1) {
        field4133++;
        class53 var4 = (class53) this.field4141.method1168(-3, arg1);
        if (arg0 > -30) {
            field4132 = null;
        }
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method521(87);
        if (var5 == null) {
            var4.method1681(false);
            var4.method701(true);
            this.field4137++;
            return null;
        }
        if (var4.method517(true)) {
            class106 var6 = new class106(var5);
            this.field4141.method1164((byte) -123, var4.field4215, var6);
            this.field4140.method535(var6, (byte) -109);
            var6.field1743 = 0L;
            var4.method1681(false);
            var4.method701(true);
        } else {
            this.field4140.method535(var4, (byte) -54);
            var4.field1743 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V")
    public static final void method1645(byte arg0) {
        int var1 = 36 % ((arg0 - 39) / 50);
        field4125++;
        class201.method1427((byte) -125);
        System.gc();
        class253.method1764((byte) -85, 25);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(JLjava/lang/Object;I)V")
    public final void method1646(long arg0, Object arg1, int arg2) {
        field4122++;
        this.method1647((byte) 64, arg0);
        if (arg2 >= -105) {
            return;
        }
        if (this.field4137 == 0) {
            class53 var5 = (class53) this.field4140.method541(false);
            var5.method1681(false);
            var5.method701(true);
        } else {
            this.field4137--;
        }
        class106 var6 = new class106(arg1);
        this.field4141.method1164((byte) 47, arg0, var6);
        this.field4140.method535(var6, (byte) -64);
        var6.field1743 = 0L;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(BJ)V")
    public final void method1647(byte arg0, long arg1) {
        if (arg0 <= 55) {
            return;
        }
        class53 var4 = (class53) this.field4141.method1168(-3, arg1);
        field4129++;
        if (var4 != null) {
            var4.method1681(false);
            var4.method701(true);
            this.field4137++;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1648(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4121++;
        class45.method458(arg3, arg6 + 137);
        int var7 = arg3 - arg1;
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = arg6;
        int var9 = -arg3;
        int var10 = var7;
        int var11 = arg3;
        int var12 = -var7;
        int var13 = -1;
        if (class275.field4804 <= arg4 && class167.field3064 >= arg4) {
            int[] var14 = class121.field2390[arg4];
            int var15 = class68.method609(class48.field1096, arg6 + 22050, class252.field4458, arg0 - arg3);
            int var16 = class68.method609(class48.field1096, 22050, class252.field4458, arg0 + arg3);
            int var17 = class68.method609(class48.field1096, 22050, class252.field4458, arg0 - var7);
            int var18 = class68.method609(class48.field1096, arg6 ^ 0x5622, class252.field4458, arg0 + var7);
            class194.method1405(true, var14, var17, var15, arg2);
            class194.method1405(true, var14, var18, var17, arg5);
            class194.method1405(true, var14, var16, var18, arg2);
        }
        int var19 = -1;
        while (var8 < var11) {
            var19 += 2;
            var13 += 2;
            var12 += var19;
            var9 += var13;
            if (var12 >= 0 && var10 >= 1) {
                var10--;
                var12 -= var10 << 1;
                class121.field2388[var10] = var8;
            }
            var8++;
            if (var9 >= 0) {
                var11--;
                var9 -= var11 << 1;
                int var20 = arg4 + var11;
                int var21 = arg4 - var11;
                if (class275.field4804 <= var20 && class167.field3064 >= var21) {
                    if (var7 > var11) {
                        int var22 = class121.field2388[var11];
                        int var23 = class68.method609(class48.field1096, 22050, class252.field4458, arg0 + var8);
                        int var24 = class68.method609(class48.field1096, 22050, class252.field4458, arg0 - var8);
                        int var25 = class68.method609(class48.field1096, 22050, class252.field4458, arg0 + var22);
                        int var26 = class68.method609(class48.field1096, 22050, class252.field4458, arg0 - var22);
                        if (class167.field3064 >= var20) {
                            int[] var27 = class121.field2390[var20];
                            class194.method1405(true, var27, var26, var24, arg2);
                            class194.method1405(true, var27, var25, var26, arg5);
                            class194.method1405(true, var27, var23, var25, arg2);
                        }
                        if (var21 >= class275.field4804) {
                            int[] var28 = class121.field2390[var21];
                            class194.method1405(true, var28, var26, var24, arg2);
                            class194.method1405(true, var28, var25, var26, arg5);
                            class194.method1405(true, var28, var23, var25, arg2);
                        }
                    } else {
                        int var29 = class68.method609(class48.field1096, 22050, class252.field4458, arg0 + var8);
                        int var30 = class68.method609(class48.field1096, 22050, class252.field4458, arg0 - var8);
                        if (var20 <= class167.field3064) {
                            class194.method1405(true, class121.field2390[var20], var29, var30, arg2);
                        }
                        if (var21 >= class275.field4804) {
                            class194.method1405(true, class121.field2390[var21], var29, var30, arg2);
                        }
                    }
                }
            }
            int var31 = arg4 - var8;
            int var32 = arg4 + var8;
            if (var32 >= class275.field4804 && var31 <= class167.field3064) {
                int var33 = arg0 + var11;
                int var34 = arg0 - var11;
                if (class48.field1096 <= var33 && class252.field4458 >= var34) {
                    int var35 = class68.method609(class48.field1096, arg6 + 22050, class252.field4458, var33);
                    int var36 = class68.method609(class48.field1096, 22050, class252.field4458, var34);
                    if (var8 >= var7) {
                        if (class167.field3064 >= var32) {
                            class194.method1405(true, class121.field2390[var32], var35, var36, arg2);
                        }
                        if (var31 >= class275.field4804) {
                            class194.method1405(true, class121.field2390[var31], var35, var36, arg2);
                        }
                    } else {
                        int var37 = var8 > var10 ? class121.field2388[var8] : var10;
                        int var38 = class68.method609(class48.field1096, 22050, class252.field4458, arg0 + var37);
                        int var39 = class68.method609(class48.field1096, 22050, class252.field4458, arg0 - var37);
                        if (class167.field3064 >= var32) {
                            int[] var40 = class121.field2390[var32];
                            class194.method1405(true, var40, var39, var36, arg2);
                            class194.method1405(true, var40, var38, var39, arg5);
                            class194.method1405(true, var40, var35, var38, arg2);
                        }
                        if (class275.field4804 <= var31) {
                            int[] var41 = class121.field2390[var31];
                            class194.method1405(true, var41, var39, var36, arg2);
                            class194.method1405(true, var41, var38, var39, arg5);
                            class194.method1405(true, var41, var35, var38, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    public static final void method1649(int arg0) {
        field4131++;
        class243.field4349.method1650(arg0 + 73);
        if (arg0 != 2) {
            method1648(107, 95, -43, 3, 108, 73, -61);
        }
        class163.field3033.method1650(arg0 + 69);
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V")
    public final void method1650(int arg0) {
        this.field4140.method534(-90);
        field4135++;
        if (arg0 <= 45) {
            this.method1647((byte) 125, -71L);
        }
        this.field4141.method1174((byte) 33);
        this.field4137 = this.field4124;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V")
    public static void method1651(boolean arg0) {
        field4134 = null;
        field4138 = null;
        field4132 = null;
        field4143 = null;
        field4130 = null;
        field4139 = null;
        field4127 = null;
        field4144 = null;
        field4126 = null;
        if (!arg0) {
            method1643(-120, (byte) -125);
        }
        field4142 = null;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(I)V")
    public class232(int arg0) {
        this.field4124 = arg0;
        this.field4137 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field4141 = new class157(var2);
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)V")
    public final void method1652(int arg0) {
        if (arg0 != -8259) {
            field4142 = null;
        }
        for (class53 var2 = (class53) this.field4140.method542(arg0 + 27103); var2 != null; var2 = (class53) this.field4140.method533(arg0 ^ 0xFFFFDFBA)) {
            if (var2.method517(true)) {
                var2.method1681(false);
                var2.method701(true);
                this.field4137++;
            }
        }
        field4128++;
    }
}
