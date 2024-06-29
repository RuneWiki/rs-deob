import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public abstract class class699 extends class176 {

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "Lea;")
    public static class547 field9831 = new class547(46, 2);

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
    public static int field9832;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "I")
    public static int field9833;

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "I")
    public static int field9834;

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
    public static int field9835;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
    public static int field9836;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
    public static int field9837;

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "I")
    public static int field9838;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    public static int field9839;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
    public static int field9840;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static final void method3951(int arg0) {
        int var1 = 0;
        if (arg0 != -21641) {
            field9831 = null;
        }
        while (~var1 > ~class635.field8835) {
            label158: {
                class573 var3 = class643.field8975[var1];
                boolean var4 = false;
                if (var3.field8062 == null) {
                    --var3.field8057;
                    if (var3.field8057 < (var3.method3220(-4) ? -1500 : -10)) {
                        var4 = true;
                    } else {
                        if (~var3.field8069 == -2 && var3.field8060 == null) {
                            var3.field8060 = class269.method1609(class556.field7844, var3.field8055, 0);
                            if (var3.field8060 == null) {
                                break label158;
                            }
                            var3.field8057 += var3.field8060.method1610();
                        } else if (var3.method3220(arg0 ^ 21643) && (var3.field8065 == null || var3.field8066 == null)) {
                            if (var3.field8065 == null) {
                                var3.field8065 = class57.method326(class303.field4094, var3.field8055);
                            }
                            if (var3.field8065 == null) {
                                break label158;
                            }
                            if (var3.field8066 == null) {
                                var3.field8066 = var3.field8065.method321(new int[] { 22050 });
                                if (var3.field8066 == null) {
                                    break label158;
                                }
                            }
                        }
                        if (var3.field8057 < 0) {
                            int var5 = 8192;
                            int var6;
                            if (~var3.field8064 == -1) {
                                var6 = var3.field8070 * (var3.field8069 == 3 ? class11.field68.field5519.method750((byte) 121) : class11.field68.field5537.method750((byte) 125)) >> 2;
                            } else {
                                int var7 = 3 & var3.field8064 >> 24;
                                if (~class653.field9086.field2175 != ~var7) {
                                    var6 = 0;
                                } else {
                                    int var8 = (255 & var3.field8064) << 9;
                                    int var9 = class653.field9086.method543(0) << 8;
                                    int var10 = (var3.field8064 & 16726745) >> 16;
                                    int var11 = (var10 << 9) - (-256 - -class653.field9086.field2170) + var9;
                                    int var12 = var3.field8064 >> 8 & 255;
                                    int var13 = (var12 << 9) - (-256 - var9) + -class653.field9086.field2165;
                                    int var14 = -512 + Math.abs(var11) + Math.abs(var13);
                                    if (~var8 > ~var14) {
                                        var3.field8057 = -99999;
                                        break label158;
                                    }
                                    if (var14 < 0) {
                                        var14 = 0;
                                    }
                                    var6 = (-var14 + var8) * class11.field68.field5516.method750((byte) 127) * var3.field8070 / var8 >> 2;
                                    if (var3.field8059 != null && var3.field8059 instanceof class752) {
                                        class752 var15 = (class752) var3.field8059;
                                        short var16 = var15.field10421;
                                        short var17 = var15.field10422;
                                    }
                                    if (var11 != 0 || ~var13 != -1) {
                                        int var18 = 16383 & -class710.field9907 + -4096 - (int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D);
                                        if (var18 > 8192) {
                                            var18 = -var18 + 16384;
                                        }
                                        int var19;
                                        if (~var14 >= -1) {
                                            var19 = 8192;
                                        } else if (var14 >= 4096) {
                                            var19 = 16384;
                                        } else {
                                            var19 = (-var14 + 8192) / 4096 + 8192;
                                        }
                                        var5 = var18 * var19 / 8192 - -(-var19 + 16384 >> 1);
                                    }
                                }
                            }
                            if (~var6 < -1) {
                                class155 var20 = null;
                                if (~var3.field8069 == -2) {
                                    var20 = var3.field8060.method1611().method947(class108.field1427);
                                } else if (var3.method3220(arg0 + 21637)) {
                                    var20 = var3.field8066;
                                }
                                class466 var21 = var3.field8062 = class466.method2601(var20, var3.field8072, var6, var5);
                                var21.method2621(var3.field8056 + -1);
                                class143.field1851.method2539(var21);
                            }
                        }
                    }
                } else if (!var3.field8062.method314((byte) 78)) {
                    var4 = true;
                }
                if (var4) {
                    --class635.field8835;
                    for (int var22 = var1; ~class635.field8835 < ~var22; ++var22) {
                        class643.field8975[var22] = class643.field8975[var22 + 1];
                    }
                    --var1;
                }
            }
            ++var1;
        }
        ++field9834;
        if (class31.field270 && !class600.method3324(false)) {
            if (class11.field68.field5540.method750((byte) 120) != 0 && ~class555.field7831 != 0) {
                if (class443.field6170 == null) {
                    class257.method1547(class727.field10149, false, class11.field68.field5540.method750((byte) 123), class555.field7831, 0, -16523);
                } else {
                    class397.method2307(256, class555.field7831, class443.field6170, class727.field10149, class11.field68.field5540.method750((byte) 122), 0, false);
                }
            }
            class31.field270 = false;
            class443.field6170 = null;
        } else if (~class11.field68.field5540.method750((byte) 126) != -1 && class555.field7831 != -1 && !class600.method3324(false)) {
            ++class747.field10375;
            class103 var2 = class752.method4186(260, class633.field8797, class449.field6285);
            var2.field1379.method3384(arg0 ^ -1571876321, class555.field7831);
            class27.method104(false, var2);
            class555.field7831 = -1;
        }
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(Z)Z")
    public final boolean method885(boolean arg0) {
        if (arg0) {
            field9831 = null;
        }
        ++field9836;
        return class423.field5940[(super.field2170 >> class443.field6172) + -class610.field8512 + class118.field1562][(super.field2165 >> class443.field6172) + -class39.field407 + class118.field1562];
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lgg;BZILha;II)V")
    public final void method162(class176 arg0, byte arg1, boolean arg2, int arg3, class60 arg4, int arg5, int arg6) {
        int var8 = 102 / ((arg1 - 15) / 55);
        ++field9838;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lha;B)Z")
    public final boolean method882(class60 arg0, byte arg1) {
        ++field9832;
        if (arg1 != 77) {
            this.method162((class176) null, (byte) 76, true, 85, (class60) null, -57, 85);
        }
        class603 var3 = class413.method2383(super.field2175, super.field2170 >> class443.field6172, super.field2165 >> class443.field6172);
        return var3 != null && var3.field8410.field10431 ? class399.method2311(super.field2175, super.field2165 >> class443.field6172, super.field2170 >> class443.field6172, var3.field8410.method132(0) + this.method132(arg1 ^ 77), (byte) -118) : class161.method954((byte) 103, super.field2175, super.field2165 >> class443.field6172, super.field2170 >> class443.field6172);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public static void method3952(int arg0) {
        if (arg0 < -117) {
            field9831 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "(I)V")
    public static final void method3953(int arg0) {
        ++field9833;
        int var1 = class125.field1628.length;
        int var2 = 0;
        if (arg0 != 21378) {
            method3953(36);
        }
        while (~var2 > ~var1) {
            if (class125.field1628[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; ~var4 > ~class563.field7964; ++var4) {
                    if (~class519.field6991[var2] == ~class462.field6391[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class462.field6391[class563.field7964] = class519.field6991[var2];
                    var3 = class563.field7964++;
                }
                class611 var5 = new class611(class125.field1628[var2]);
                int var6 = 0;
                while (~class125.field1628[var2].length < ~var5.field8520 && var6 < 511 && class84.field1169 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method3402((byte) 127);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 8150) >> 7;
                    int var11 = 63 & var8;
                    int var12 = (class519.field6991[var2] >> 8) * 64 + var10 - class99.field1313;
                    int var13 = (255 & class519.field6991[var2]) * 64 - -var11 + -class133.field1704;
                    class274 var14 = class51.field540.method4084(arg0 + -21373, var5.method3402((byte) 127));
                    class706 var15 = (class706) class681.field9475.method2552((long) var7, arg0 ^ -21379);
                    if (var15 == null && (var14.field3608 & 1) > 0 && ~class131.field1693 == ~var9 && var12 >= 0 && class272.field3589 > var14.field3619 + var12 && var13 >= 0 && ~class3.field26 < ~(var14.field3619 + var13)) {
                        class215 var16 = new class215();
                        var16.field817 = var7;
                        class706 var17 = new class706(var16);
                        class681.field9475.method2558(var17, (long) var7, arg0 + -21379);
                        class746.field10359[class12.field79++] = var17;
                        class665.field9261[class84.field1169++] = var7;
                        var16.field863 = class406.field5732;
                        var16.method1200(var14, 1);
                        var16.method554((byte) 70, var16.field2589.field3619);
                        var16.field872 = var16.field2589.field3596 << 3;
                        var16.method556(var16.field2589.field3653 + 4 << 11 & 16346, true, 16);
                        var16.method1195(var16.method543(0), var12, true, (byte) -122, var13, var9);
                    }
                }
            }
            ++var2;
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(IIIII)V")
    public class699(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super.field2178 = arg1;
        super.field2165 = arg2;
        super.field2167 = (byte) arg4;
        super.field2170 = arg0;
        super.field2175 = (byte) arg3;
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(B)V")
    public final void method150(byte arg0) {
        ++field9839;
        if (arg0 != -73) {
            field9831 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(B)Z")
    public final boolean method157(byte arg0) {
        ++field9835;
        if (arg0 >= -70) {
            field9831 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[Lcba;)I")
    public final int method881(int arg0, class551[] arg1) {
        ++field9840;
        int var3 = 34 % ((29 - arg0) / 62);
        return this.method1009(super.field2170 >> class443.field6172, false, arg1, super.field2165 >> class443.field6172);
    }
}
