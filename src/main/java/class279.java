import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class279 {

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "Lrf;")
    private class79 field4301 = new class79();

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    private int field4302;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    private int field4296;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "Lsl;")
    private class39 field4300;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIZI)V", line = 13)
    public static final void method1875(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class158.field2589++;
        field4290++;
        class224.method1485(false);
        if (arg4) {
            class177.method1119(0, false, (byte) -67, false);
        } else {
            class335.method2309(21319, 0);
            class177.method1119(0, false, (byte) -67, true);
            if (class106.field1845 == 0) {
                for (int var7 = 1; var7 <= 5; var7++) {
                    class177.method1119(var7, false, (byte) -67, false);
                    class177.method1119(var7, true, (byte) -67, false);
                    class335.method2309(21319, var7);
                }
            } else {
                for (int var6 = 1; var6 <= 5; var6++) {
                    class335.method2309(arg2 + 21317, var6);
                    class177.method1119(var6, false, (byte) -67, false);
                    class177.method1119(var6, true, (byte) -67, false);
                }
            }
        }
        if (!arg4) {
            class202.method1330(-128);
        }
        class221.method1470(arg2 - 3);
        if (class249.field3893) {
            class69.method533(arg3, arg5, 0, arg1, arg0, true);
            arg5 = class174.field2794;
            arg0 = class282.field4365;
            arg3 = class146.field2393;
            arg1 = class50.field1016;
        }
        if (class135.field2271 == 1) {
            int var8 = (int) class95.field1709 + class301.field4556 & 0x7FF;
            int var9 = (int) class120.field2090;
            if (var9 < class168.field2692 / 256) {
                var9 = class168.field2692 / 256;
            }
            if (class39.field747[4] && class293.field4480[4] + 128 > var9) {
                var9 = class293.field4480[4] + 128;
            }
            class94.method630(class325.method2250(class66.field1265.field1872, 22771, class289.field4438, class66.field1265.field1869) - 50, var9, var9 * 3 + 600, class221.field3503, var8, arg1, class230.field3630, (byte) -54);
        } else if (class135.field2271 == 5) {
            class214.method1441(arg1, -58);
        }
        int var10 = class38.field742;
        int var11 = class283.field4381;
        int var12 = class132.field2232;
        int var13 = class131.field2213;
        int var14 = class43.field820;
        for (int var15 = 0; var15 < 5; var15++) {
            if (class39.field747[var15]) {
                int var16 = (int) ((double) (-class43.field817[var15]) + Math.random() * (double) (class43.field817[var15] * 2 + 1) + Math.sin((double) class33.field672[var15] / 100.0D * (double) class285.field4415[var15]) * (double) class293.field4480[var15]);
                if (var15 == 4) {
                    class43.field820 += var16;
                    if (class43.field820 < 128) {
                        class43.field820 = 128;
                    }
                    if (class43.field820 > 383) {
                        class43.field820 = 383;
                    }
                }
                if (var15 == 1) {
                    class132.field2232 += var16;
                }
                if (var15 == 0) {
                    class38.field742 += var16;
                }
                if (var15 == 3) {
                    class131.field2213 = class131.field2213 + var16 & 0x7FF;
                }
                if (var15 == 2) {
                    class283.field4381 += var16;
                }
            }
        }
        class135.method881((byte) 127);
        if (class249.field3893) {
            class115.method757(arg0, arg5, arg0 + arg3, arg1 + arg5);
            float var17 = (float) class131.field2213 * 0.17578125F;
            float var18 = (float) class43.field820 * 0.17578125F;
            if (class135.field2271 == 3) {
                var18 = class55.field1096 * 360.0F / 6.2831855F;
                var17 = class336.field5153 * 360.0F / 6.2831855F;
            }
            boolean var19 = false;
            int var20;
            if (class38.field730 == 10) {
                var20 = class58.method453(class331.field5068, class283.field4381 >> 10, (byte) -105, class176.field2836, class38.field742 >> 10);
            } else {
                var20 = class58.method453(class331.field5068, class66.field1265.field1899[0] >> 3, (byte) -127, class176.field2836, class66.field1265.field1871[0] >> 3);
            }
            if (class168.field2696 >= 0) {
                class249.method1656();
                class145 var21 = class103.method672(class164.field2640, class168.field2696, class343.field5327, class212.field3410, -1858901856);
                var21.method938(class252.field3942, arg0, arg5, arg3, arg1, class43.field820, class131.field2213, var20);
            } else {
                class249.method1658(var20);
            }
            class249.method1654(arg0, arg5, arg3, arg1, arg0 + (arg3 / 2), arg1 / 2 + arg5, var18, var17, class40.field778, class40.field778);
            class135.method884(false, (byte) -76);
            class249.method1666();
            class249.method1677(true);
            class249.method1661(true);
        } else {
            class270.method1806(arg0, arg5, arg0 + arg3, arg5 - -arg1);
            class284.method1909();
            if (class168.field2696 >= 0) {
                class145 var22 = class103.method672(class164.field2640, class168.field2696, class343.field5327, class212.field3410, -1858901856);
                var22.method939(class252.field3942, arg0, arg5, arg3, arg1, class43.field820, class131.field2213, 0);
            } else {
                class270.method1811(arg0, arg5, arg3, arg1, 0);
            }
        }
        if (class290.field4459 || arg0 > class189.field3058 || class189.field3058 >= (arg0 + arg3) || arg5 > class75.field1529 || (arg5 + arg1) <= class75.field1529) {
            class223.field3520 = 0;
            class328.field5037 = false;
        } else {
            class223.field3520 = 0;
            class328.field5037 = true;
            int var23 = class39.field760;
            int var24 = class329.field5044;
            class130.field2202 = (class189.field3058 - arg0) * (var24 - var23) / arg3 + var23;
            int var25 = class343.field5334;
            int var26 = class191.field3095;
            class201.field3208 = (class75.field1529 - arg5) * (var25 - var26) / arg1 + var26;
        }
        class268.method1782(true);
        byte var27 = arg2 == class239.method1586(true) ? (byte) class158.field2589 : 1;
        if (class249.field3893) {
            class310.method2080(class25.field494, !client.field902);
            class301.method2004(class131.field2213, class132.field2232, class283.field4381, class43.field820, 21650, class38.field742);
            class249.field3892 = class25.field494;
            class127.method838(class38.field742, class132.field2232, class283.field4381, class43.field820, class131.field2213, class6.field137, class15.field281, class81.field1580, class119.field2075, class259.field4031, class271.field4189, class289.field4438 + 1, var27, class66.field1265.field1869 >> 7, class66.field1265.field1872 >> 7);
            class33.field660 = true;
            class310.method2072();
            class301.method2004(0, 0, 0, 0, arg2 + 21648, 0);
            class268.method1782(true);
            class235.method1564(arg5, arg3, class40.field778, class40.field778, (byte) -127, arg1, arg0);
            class255.method1707((byte) -116, class40.field778, arg0, class40.field778, arg5, arg3, arg1);
            class247.method1637();
        } else {
            class127.method838(class38.field742, class132.field2232, class283.field4381, class43.field820, class131.field2213, class6.field137, class15.field281, class81.field1580, class119.field2075, class259.field4031, class271.field4189, class289.field4438 + 1, var27, class66.field1265.field1869 >> 7, class66.field1265.field1872 >> 7);
            class268.method1782(true);
            class247.method1637();
            class235.method1564(arg5, arg3, 256, 256, (byte) -121, arg1, arg0);
            class255.method1707((byte) -116, 256, arg0, 256, arg5, arg3, arg1);
        }
        ((class52) class284.field4393).method400(class176.field2836, (byte) 101);
        class186.method1192(arg3, arg0, -1, arg1, arg5);
        class38.field742 = var10;
        class43.field820 = var14;
        class283.field4381 = var11;
        class132.field2232 = var12;
        class131.field2213 = var13;
        if (class49.field1007 && class335.field5137.method1854((byte) 110) == 0) {
            class49.field1007 = false;
        }
        if (class49.field1007) {
            if (class249.field3893) {
                class115.method755(arg0, arg5, arg3, arg1, 0);
            } else {
                class270.method1811(arg0, arg5, arg3, arg1, 0);
            }
            class188.method1200(false, class219.field3478, false);
        }
        if (!arg4 && !class49.field1007 && !class290.field4459 && class189.field3058 >= arg0 && class189.field3058 < arg0 + arg3 && arg5 <= class75.field1529 && class75.field1529 < arg5 + arg1) {
            class201.method1281(arg1, class189.field3058, arg0, class75.field1529, arg3, arg5, false);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIIZ)V", line = 270)
    public static final void method1876(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field4291++;
        int var8 = 0;
        int var9 = arg6;
        int var10 = 0;
        int var11 = arg4 - arg3;
        int var12 = arg6 * arg6;
        int var13 = var11 * var11;
        int var14 = arg4 * arg4;
        int var15 = arg6 - arg3;
        int var16 = var15 * var15;
        int var17 = var12 << 1;
        int var18 = var14 << 1;
        int var19 = var16 << 1;
        int var20 = var13 << 1;
        int var21 = var15 << 1;
        int var22 = arg6 << 1;
        int var23 = (1 - var22) * var14 + var17;
        int var24 = var12 - ((var22 - 1) * var18);
        int var25 = (1 - var21) * var13 + var19;
        int var26 = var14 << 2;
        int var27 = var13 << 2;
        int var28 = var12 << 2;
        int var29 = var16 << 2;
        int var30 = var16 - ((var21 - 1) * var20);
        int var31 = var19 * 3;
        int var32 = (var22 - 3) * var18;
        int var33 = var17 * 3;
        if (arg7) {
            return;
        }
        int var34 = (var21 - 3) * var20;
        int var35 = var28;
        int var36 = var29;
        int var37 = (arg6 - 1) * var26;
        int var38 = (var15 - 1) * var27;
        int[] var39 = class155.field2522[arg5];
        class241.method1598(arg2, -7, var39, arg1 - var11, -arg4 + arg1);
        class241.method1598(arg0, -7, var39, arg1 + var11, -var11 + arg1);
        class241.method1598(arg2, -7, var39, arg1 + arg4, arg1 - -var11);
        while (var9 > 0) {
            boolean var40 = var15 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var33;
                    var8++;
                    var24 += var35;
                    var33 += var28;
                    var35 += var28;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var35 += var28;
                var23 += var33;
                var33 += var28;
                var8++;
            }
            var23 += -var37;
            var9--;
            var37 -= var26;
            int var41 = arg5 + var9;
            var24 += -var32;
            int var42 = arg1 + var8;
            int var43 = arg5 - var9;
            int var44 = arg1 - var8;
            var32 -= var26;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var31;
                        var31 += var29;
                        var30 += var36;
                        var10++;
                        var36 += var29;
                    }
                }
                if (var30 < 0) {
                    var10++;
                    var25 += var31;
                    var31 += var29;
                    var30 += var36;
                    var36 += var29;
                }
                var25 += -var38;
                var30 += -var34;
                var38 -= var27;
                var34 -= var27;
            }
            if (var40) {
                int var45 = arg1 + var10;
                int var46 = arg1 - var10;
                class241.method1598(arg2, -7, class155.field2522[var43], var46, var44);
                class241.method1598(arg0, -7, class155.field2522[var43], var45, var46);
                class241.method1598(arg2, -7, class155.field2522[var43], var42, var45);
                class241.method1598(arg2, -7, class155.field2522[var41], var46, var44);
                class241.method1598(arg0, -7, class155.field2522[var41], var45, var46);
                class241.method1598(arg2, -7, class155.field2522[var41], var42, var45);
            } else {
                class241.method1598(arg2, -7, class155.field2522[var43], var42, var44);
                class241.method1598(arg2, -7, class155.field2522[var41], var42, var44);
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 442)
    public final void method1877(int arg0) {
        if (arg0 != -29702) {
            this.field4296 = -2;
        }
        for (class178 var2 = (class178) this.field4301.method576((byte) -107); var2 != null; var2 = (class178) this.field4301.method579(0)) {
            if (var2.method696(0)) {
                var2.method278((byte) -105);
                var2.method2024(0);
                this.field4302++;
            }
        }
        field4295++;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)I", line = 467)
    public final int method1878(byte arg0) {
        field4298++;
        int var2 = 0;
        for (class178 var3 = (class178) this.field4301.method576((byte) -81); var3 != null; var3 = (class178) this.field4301.method579(0)) {
            if (!var3.method696(0)) {
                var2++;
            }
        }
        if (arg0 <= 117) {
            this.field4302 = -43;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILag;)Lqe;", line = 496)
    public static final class37 method1879(int arg0, class202 arg1) {
        field4297++;
        return arg0 == -13544 ? new class37(arg1.method1356(false), arg1.method1356(false), arg1.method1356(false), arg1.method1356(false), arg1.method1356(false), arg1.method1356(false), arg1.method1356(false), arg1.method1356(false), arg1.method1352((byte) 10), arg1.method1317((byte) -100)) : (class37) null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/lang/Object;JI)V", line = 509)
    public final void method1880(Object arg0, long arg1, int arg2) {
        this.method1885((byte) -82, arg1);
        if (arg2 <= 43) {
            this.method1880((Object) null, 48L, -75);
        }
        if (this.field4302 == 0) {
            class178 var5 = (class178) this.field4301.method577((byte) -92);
            var5.method278((byte) -105);
            var5.method2024(0);
        } else {
            this.field4302--;
        }
        field4299++;
        class344 var6 = new class344(arg0);
        this.field4300.method310(arg1, var6, 25357);
        this.field4301.method578(-106, var6);
        var6.field4610 = 0L;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZJ)Ljava/lang/Object;", line = 538)
    public final Object method1881(boolean arg0, long arg1) {
        field4289++;
        if (!arg0) {
            return (Object) null;
        }
        class178 var4 = (class178) this.field4300.method303(arg1, (byte) 113);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method695(0);
        if (var5 == null) {
            var4.method278((byte) -105);
            var4.method2024(0);
            this.field4302++;
            return null;
        }
        if (var4.method696(0)) {
            class344 var6 = new class344(var5);
            this.field4300.method310(var4.field702, var6, 25357);
            this.field4301.method578(-119, var6);
            var6.field4610 = 0L;
            var4.method278((byte) -105);
            var4.method2024(0);
        } else {
            this.field4301.method578(-112, var4);
            var4.field4610 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)Ldn;", line = 583)
    public static final class260 method1882(int arg0, int arg1) {
        field4292++;
        class260 var2 = (class260) class159.field2598.method1881(true, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class109.field1948.method2036(class149.method976(arg1, -2466), class303.method2011(-76, arg1), (byte) 66);
        class260 var4 = new class260();
        var4.field4053 = arg1;
        if (arg0 != 25397) {
            return (class260) null;
        }
        if (var3 != null) {
            var4.method1742((byte) 3, new class202(var3));
        }
        var4.method1744(1);
        class159.field2598.method1880(var4, (long) arg1, 101);
        return var4;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(II)V", line = 611)
    public final void method1883(int arg0, int arg1) {
        field4293++;
        if (class90.field1666 != null) {
            for (class178 var3 = (class178) this.field4301.method576((byte) -117); var3 != null; var3 = (class178) this.field4301.method579(0)) {
                if (var3.method696(0)) {
                    if (var3.method695(0) == null) {
                        var3.method278((byte) -105);
                        var3.method2024(0);
                        this.field4302++;
                    }
                } else if (++var3.field4610 > (long) arg1) {
                    class178 var4 = class90.field1666.method558((byte) 32, var3);
                    this.field4300.method310(var3.field702, var4, 25357);
                    class263.method1755(var4, var3, 128);
                    var3.method278((byte) -105);
                    var3.method2024(0);
                }
            }
        }
        if (arg0 != 2047773287) {
            this.field4296 = -121;
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(I)V", line = 675)
    public class279(int arg0) {
        this.field4302 = arg0;
        this.field4296 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field4300 = new class39(var2);
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V", line = 662)
    public final void method1884(int arg0) {
        field4303++;
        this.field4301.method575((byte) -82);
        if (arg0 != -22054) {
            this.method1881(true, -72L);
        }
        this.field4300.method302((byte) 125);
        this.field4302 = this.field4296;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BJ)V", line = 692)
    public final void method1885(byte arg0, long arg1) {
        field4294++;
        if (arg0 != -82) {
            return;
        }
        class178 var4 = (class178) this.field4300.method303(arg1, (byte) 104);
        if (var4 != null) {
            var4.method278((byte) -105);
            var4.method2024(0);
            this.field4302++;
        }
    }
}
