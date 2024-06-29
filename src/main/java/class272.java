import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class272 {

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "Lad;")
    private class244 field3706 = new class244();

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
    private int field3712;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
    private int field3708;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "Lbr;")
    private class223 field3707;

    @OriginalMember(owner = "client!cq", name = "n", descriptor = "Lbr;")
    public static class223 field3718 = new class223(64);

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!cq", name = "l", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!cq", name = "m", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!cq", name = "o", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)I")
    public final int method1670(int arg0) {
        field3710++;
        if (arg0 < 29) {
            this.field3712 = 113;
        }
        return this.field3712;
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)V")
    public final void method1671(int arg0) {
        for (class262 var2 = (class262) this.field3706.method1527((byte) 84); var2 != null; var2 = (class262) this.field3706.method1532(-11786)) {
            if (var2.method1273((byte) 108)) {
                var2.method2459(198);
                var2.method2788((byte) -99);
                this.field3708++;
            }
        }
        if (arg0 != -30598) {
            this.method1673((class100) null, -100, (Object) null);
        }
        field3713++;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIIB)V")
    public static final void method1672(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        class406.field5905 = arg2;
        class405.field5890 = arg0;
        class403.field5874 = arg1;
        class89.field1359 = arg3;
        if (arg5 <= 60) {
            method1678((byte) 77);
        }
        field3709++;
        class350.field4886 = arg4;
        if (class405.field5890 >= 100) {
            int var6 = class403.field5874 * 128 + 64;
            int var7 = class350.field4886 * 128 + 64;
            int var8 = class279.method1698(var6, var7, class265.field3617, (byte) 3) - class406.field5905;
            int var9 = var6 - class368.field5158;
            int var10 = var8 - class34.field528;
            int var11 = var7 - class336.field4561;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class356.field5020 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class244.field3377 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 0x3FFF;
            if (class356.field5020 < 1024) {
                class356.field5020 = 1024;
            }
            if (class356.field5020 > 3072) {
                class356.field5020 = 3072;
            }
        }
        class123.field1731 = 2;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lc;ILjava/lang/Object;)V")
    public final void method1673(class100 arg0, int arg1, Object arg2) {
        this.method1679(126, arg0);
        field3714++;
        if (this.field3708 == 0) {
            class262 var4 = (class262) this.field3706.method1533(-4174);
            var4.method2459(198);
            var4.method2788((byte) -107);
        } else {
            this.field3708--;
        }
        class192 var5 = new class192(arg0, arg2);
        this.field3707.method1419(arg0.method705(-12414), 124, var5);
        this.field3706.method1530(var5, true);
        var5.field6446 = 0L;
        if (arg1 < 115) {
            this.field3707 = null;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V")
    public final void method1674(byte arg0) {
        this.field3706.method1529(-124);
        field3711++;
        if (arg0 >= -58) {
            method1675(true);
        }
        this.field3707.method1418((byte) -43);
        this.field3708 = this.field3712;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Z)V")
    public static void method1675(boolean arg0) {
        field3718 = null;
        if (arg0) {
            method1678((byte) 89);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IZ)V")
    public final void method1676(int arg0, boolean arg1) {
        if (!arg1) {
            this.field3706 = null;
        }
        if (class265.field3620 != null) {
            for (class262 var3 = (class262) this.field3706.method1527((byte) 84); var3 != null; var3 = (class262) this.field3706.method1532(-11786)) {
                if (var3.method1273((byte) 90)) {
                    if (var3.method1271((byte) -98) == null) {
                        var3.method2459(198);
                        var3.method2788((byte) -119);
                        this.field3708++;
                    }
                } else if ((long) arg0 < ++var3.field6446) {
                    class262 var4 = class265.field3620.method1330(var3, 105);
                    this.field3707.method1419(var3.field5363, 58, var4);
                    class294.method1884(var4, var3, (byte) 92);
                    var3.method2459(198);
                    var3.method2788((byte) -97);
                }
            }
        }
        field3715++;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZLc;)Ljava/lang/Object;")
    public final Object method1677(boolean arg0, class100 arg1) {
        field3705++;
        long var3 = arg1.method705(-12414);
        if (arg0) {
            return null;
        }
        for (class262 var5 = (class262) this.field3707.method1412((byte) -54, var3); var5 != null; var5 = (class262) this.field3707.method1421(1)) {
            if (var5.field3583.method706(64, arg1)) {
                Object var6 = var5.method1271((byte) -98);
                if (var6 != null) {
                    if (var5.method1273((byte) 109)) {
                        class192 var7 = new class192(arg1, var6);
                        this.field3707.method1419(var5.field5363, 47, var7);
                        this.field3706.method1530(var7, true);
                        var7.field6446 = 0L;
                        var5.method2459(198);
                        var5.method2788((byte) -119);
                    } else {
                        this.field3706.method1530(var5, true);
                        var5.field6446 = 0L;
                    }
                    return var6;
                }
                var5.method2459(198);
                var5.method2788((byte) -101);
                this.field3708++;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(B)V")
    public static final void method1678(byte arg0) {
        field3717++;
        class31.field479.method1315(120);
        int var1 = -25 % ((-arg0 - 34) / 56);
        for (class207 var2 = (class207) class167.field2393.method1312((byte) 25); var2 != null; var2 = (class207) class167.field2393.method1304(96)) {
            if (var2.field2797 < 1000) {
                var2.method2459(198);
                class31.field479.method1301(50, var2);
            }
        }
        class31.field479.method1303(class167.field2393, 50);
        if (class145.field2106 != null || class142.field2046 != null || class299.field4145 > 0) {
            return;
        }
        int var3 = class383.field5452;
        if (!class349.field4882) {
            if (var3 == 1 && class390.field5740 > 0) {
                int var18 = ((class207) class167.field2393.field2720.field5369).field2797;
                if (var18 == 20 || var18 == 7 || var18 == 2 || var18 == 17 || var18 == 30 || var18 == 26 || var18 == 37 || var18 == 41 || var18 == 45 || var18 == 9 || var18 == 43 || var18 == 1004) {
                    class207 var19 = (class207) class167.field2393.field2720.field5369;
                    class383 var20 = class290.method1869((byte) 25, var19.field2799);
                    class265 var21 = client.method1119(var20);
                    if (var21.method1638((byte) 108)) {
                        class376.field5359 = false;
                        class6.field92 = 0;
                        if (class145.field2106 != null) {
                            class86.method596(14459, class145.field2106);
                        }
                        class145.field2106 = class290.method1869((byte) 120, var19.field2799);
                        class427.field6126 = class349.field4879;
                        class298.field4131 = class361.field5073;
                        class437.field6288 = var19.field2808;
                        class86.method596(14459, class145.field2106);
                        return;
                    }
                }
            }
            if (var3 <= 0 && class109.field1607 > 0) {
                var3 = class109.field1607;
            }
            class109.field1607 = 0;
            if (var3 == 1 && (class202.field2757 == 1 && class390.field5740 > 2 || class298.method1926((byte) -117))) {
                var3 = 2;
            }
            if (var3 == 2 && class390.field5740 > 0) {
                class235.method1483((byte) -65, class361.field5073, class349.field4879);
            }
            if (var3 != 1 || class390.field5740 <= 0) {
                return;
            }
            class406.method2610((byte) -128);
            return;
        }
        if (var3 != 1) {
            int var4 = class349.field4883;
            int var5 = class162.field2269;
            if (class377.field5380 - 10 > var4 || var4 > (class377.field5380 + class340.field4753 + 10) || (class156.field2206 - 10) > var5 || var5 > class396.field5781 + class156.field2206 + 10) {
                class349.field4882 = false;
                class62.method421(class396.field5781, class340.field4753, class377.field5380, (byte) 99, class156.field2206);
            }
        }
        if (var3 != 1) {
            return;
        }
        int var6 = class377.field5380;
        int var7 = class156.field2206;
        int var8 = class340.field4753;
        int var9 = class349.field4879;
        int var10 = class361.field5073;
        int var11 = -1;
        for (int var12 = 0; var12 < class390.field5740; var12++) {
            if (class235.field3198) {
                int var17 = (class390.field5740 - var12 - 1) * 16 + var7 + 33;
                if (var6 < var9 && var9 < var6 + var8 && (var17 - 13) < var10 && var10 < var17 + 4) {
                    var11 = var12;
                }
            } else {
                int var16 = (class390.field5740 - var12 - 1) * 16 + var7 + 31;
                if (var9 > var6 && var9 < var6 + var8 && var10 > (var16 - 13) && var10 < (var16 + 3)) {
                    var11 = var12;
                }
            }
        }
        if (var11 != -1) {
            int var13 = 0;
            class29 var14 = new class29(class167.field2393);
            for (class207 var15 = (class207) var14.method229(12398); var15 != null; var15 = (class207) var14.method227((byte) -85)) {
                if (var11 == var13) {
                    class20.method132(var15, 2);
                }
                var13++;
            }
        }
        class349.field4882 = false;
        class62.method421(class396.field5781, class340.field4753, class377.field5380, (byte) 99, class156.field2206);
        return;
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(I)V")
    public class272(int arg0) {
        this.field3712 = arg0;
        this.field3708 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field3707 = new class223(var2);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILc;)V")
    private final void method1679(int arg0, class100 arg1) {
        field3716++;
        long var3 = arg1.method705(-12414);
        if (arg0 < 94) {
            this.field3707 = null;
        }
        for (class262 var5 = (class262) this.field3707.method1412((byte) -54, var3); var5 != null; var5 = (class262) this.field3707.method1421(1)) {
            if (var5.field3583.method706(-78, arg1)) {
                var5.method2459(198);
                var5.method2788((byte) -93);
                this.field3708++;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(B)I")
    public final int method1680(byte arg0) {
        if (arg0 <= 61) {
            return 48;
        } else {
            field3719++;
            return this.field3708;
        }
    }
}
