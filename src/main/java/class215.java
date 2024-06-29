import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class215 extends class74 {

    @OriginalMember(owner = "client!cea", name = "fd", descriptor = "I")
    public int field2580 = 1;

    @OriginalMember(owner = "client!cea", name = "md", descriptor = "I")
    public int field2587 = 1;

    @OriginalMember(owner = "client!cea", name = "sd", descriptor = "I")
    public int field2593 = -1;

    @OriginalMember(owner = "client!cea", name = "Bd", descriptor = "I")
    public int field2602 = -1;

    @OriginalMember(owner = "client!cea", name = "dd", descriptor = "I")
    public static int field2578 = -1;

    @OriginalMember(owner = "client!cea", name = "ud", descriptor = "Llga;")
    public static class712 field2595 = new class712(5, 2);

    @OriginalMember(owner = "client!cea", name = "bd", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!cea", name = "cd", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!cea", name = "ed", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!cea", name = "hd", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!cea", name = "id", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!cea", name = "jd", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!cea", name = "kd", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!cea", name = "ld", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!cea", name = "nd", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!cea", name = "pd", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!cea", name = "qd", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!cea", name = "rd", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!cea", name = "td", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!cea", name = "vd", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!cea", name = "wd", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!cea", name = "xd", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!cea", name = "Ad", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!cea", name = "Cd", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!cea", name = "Dd", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!cea", name = "od", descriptor = "Ljl;")
    public class274 field2589;

    @OriginalMember(owner = "client!cea", name = "gd", descriptor = "Lcr;")
    public class574 field2581;

    @OriginalMember(owner = "client!cea", name = "zd", descriptor = "Lufa;")
    public static class680 field2600;

    @OriginalMember(owner = "client!cea", name = "yd", descriptor = "Ljava/lang/String;")
    public static String field2599;

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "(Lha;I)V")
    public final void method136(class60 arg0, int arg1) {
        int var3 = 82 % ((arg1 - 53) / 46);
        ++field2591;
        if (this.field2589 != null) {
            if (super.field901 || this.method1194(arg0, 255, 0)) {
                class10 var4 = arg0.method410();
                var4.method34(super.field854.method3756((byte) 116));
                var4.method39(super.field2170, super.field2178 - 20, super.field2165);
                this.method545(arg0, super.field901, (byte) -119, var4, super.field902);
                super.field902[0] = super.field902[1] = super.field902[2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lha;II)Z")
    private final boolean method1194(class60 arg0, int arg1, int arg2) {
        ++field2584;
        int var4 = arg2;
        class351 var5 = this.method548(1);
        if (arg1 != 255) {
            field2599 = null;
        }
        class300 var6 = super.field871 != -1 && ~super.field855 == -1 ? class460.field6365.method1090(super.field871, arg1 ^ 16128) : null;
        class300 var7 = ~super.field837 == 0 || super.field803 && var6 != null ? null : class460.field6365.method1090(super.field837, 16383);
        int var8 = var5.field4651;
        int var9 = var5.field4672;
        if (~var8 != -1 || ~var9 != -1 || ~var5.field4687 != -1 || var5.field4652 != 0) {
            arg2 |= 7;
        }
        boolean var10 = ~super.field881 != -1 && class406.field5732 >= super.field860 && ~class406.field5732 > ~super.field789;
        if (var10) {
            arg2 |= 524288;
        }
        int var11 = super.field854.method3756((byte) 116);
        class472 var12 = super.field902[0] = this.field2589.method1638(super.field846, var11, super.field818, super.field790, (byte) 100, var6, super.field839, arg0, super.field866, super.field806, class386.field5455, this.field2581, super.field811, class137.field1743, arg2, super.field878, class460.field6365, var7);
        if (var12 == null) {
            return false;
        } else {
            super.field792 = var12.method234();
            super.field795 = var12.method212();
            this.method555(758, var12);
            if (~var8 == -1 && var9 == 0) {
                this.method549(false, 0, this.method543(arg1 + -255) << 9, this.method543(0) << 9, var11, 0);
            } else {
                this.method549(false, var5.field4648, var8, var9, var11, var5.field4685);
                if (~super.field840 != -1) {
                    super.field902[0].method229(super.field840);
                }
                if (super.field825 != 0) {
                    super.field902[0].method216(super.field825);
                }
                if (super.field874 != 0) {
                    super.field902[0].method237(0, super.field874, 0);
                }
            }
            if (var10) {
                var12.method233(super.field861, super.field832, super.field815, super.field881 & 255);
            }
            if (super.field829 != -1 && ~super.field824 != 0) {
                class49 var13 = class303.field4090.method3521(arg1 + -253, super.field829);
                boolean var14 = var13.field514 == 3 && (var8 != 0 || var9 != 0);
                int var15 = var4;
                if (!var14) {
                    if (super.field841 != 0) {
                        var15 = var4 | 5;
                    }
                    if (~super.field834 != -1) {
                        var15 |= 2;
                    }
                    if (super.field867 >= 0) {
                        var15 |= 7;
                    }
                } else {
                    var15 = var4 | 7;
                }
                class472 var16 = super.field902[1] = var13.method292(super.field824, class460.field6365, var15, super.field850, (byte) 66, super.field813, arg0);
                if (var16 != null) {
                    if (~super.field867 > -1) {
                        if (super.field841 != 0) {
                            var16.method197(super.field841 * 2048);
                        }
                    } else {
                        int var17 = 0;
                        int var18 = 0;
                        int var19 = 0;
                        if (var5.field4655 != null && var5.field4655[super.field867] != null) {
                            var18 += var5.field4655[super.field867][1];
                            var19 += var5.field4655[super.field867][2];
                            var17 += var5.field4655[super.field867][0];
                        }
                        if (var5.field4653 != null && var5.field4653[super.field867] != null) {
                            var17 += var5.field4653[super.field867][0];
                            var18 += var5.field4653[super.field867][1];
                            var19 += var5.field4653[super.field867][2];
                        }
                        if (~var19 != -1 || var17 != 0) {
                            int var20 = var11;
                            if (super.field818 != null && ~super.field818[super.field867] != 0) {
                                var20 = super.field818[super.field867];
                            }
                            int var21 = super.field841 * 2048 - var11 + var20 & 16383;
                            if (var21 != 0) {
                                var16.method197(var21);
                            }
                            int var22 = class15.field113[var21];
                            int var23 = class15.field115[var21];
                            int var24 = var17 * var23 + var19 * var22 >> 14;
                            var19 = var19 * var23 + -(var17 * var22) >> 14;
                            var17 = var24;
                        }
                        var16.method237(var17, var18, var19);
                    }
                    if (super.field834 != 0) {
                        var16.method237(0, -super.field834 << 2, 0);
                    }
                    if (var14) {
                        if (~super.field840 != -1) {
                            var16.method229(super.field840);
                        }
                        if (~super.field825 != -1) {
                            var16.method216(super.field825);
                        }
                        if (~super.field874 != -1) {
                            var16.method237(0, super.field874, 0);
                        }
                    }
                }
            } else {
                super.field902[1] = null;
            }
            if (~super.field810 != 0 && super.field889 != -1) {
                class49 var25 = class303.field4090.method3521(2, super.field810);
                boolean var26 = ~var25.field514 == -4 && (var8 != 0 || var9 != 0);
                int var27 = var4;
                if (!var26) {
                    if (super.field804 != 0) {
                        var27 = var4 | 5;
                    }
                    if (~super.field808 != -1) {
                        var27 |= 2;
                    }
                    if (~super.field793 <= -1) {
                        var27 |= 7;
                    }
                } else {
                    var27 = var4 | 7;
                }
                class472 var28 = super.field902[2] = var25.method285(arg0, super.field880, 21945, var27, class460.field6365, super.field886, super.field889);
                if (var28 != null) {
                    if (~super.field793 <= -1 && var5.field4655 != null && var5.field4655[super.field793] != null) {
                        int var29 = 0;
                        int var30 = 0;
                        int var31 = 0;
                        if (var5.field4655 != null && var5.field4655[super.field793] != null) {
                            var29 += var5.field4655[super.field793][0];
                            var30 += var5.field4655[super.field793][1];
                            var31 += var5.field4655[super.field793][2];
                        }
                        if (var5.field4653 != null && var5.field4653[super.field793] != null) {
                            var30 += var5.field4653[super.field793][1];
                            var29 += var5.field4653[super.field793][0];
                            var31 += var5.field4653[super.field793][2];
                        }
                        if (var31 != 0 || var29 != 0) {
                            int var32 = var11;
                            if (super.field818 != null && super.field818[super.field793] != -1) {
                                var32 = super.field818[super.field793];
                            }
                            int var33 = 16383 & super.field804 * 2048 + var32 - var11;
                            if (~var33 != -1) {
                                var28.method197(var33);
                            }
                            int var34 = class15.field113[var33];
                            int var35 = class15.field115[var33];
                            int var36 = var29 * var35 + var31 * var34 >> 14;
                            var31 = var31 * var35 - var29 * var34 >> 14;
                            var29 = var36;
                        }
                        var28.method237(var29, var30, var31);
                    } else if (super.field804 != 0) {
                        var28.method197(super.field804 * 2048);
                    }
                    if (super.field808 != 0) {
                        var28.method237(0, -super.field808 << 2, 0);
                    }
                    if (var26) {
                        if (super.field840 != 0) {
                            var28.method229(super.field840);
                        }
                        if (super.field825 != 0) {
                            var28.method216(super.field825);
                        }
                        if (super.field874 != 0) {
                            var28.method237(0, super.field874, 0);
                        }
                    }
                }
            } else {
                super.field902[2] = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIZBII)V")
    public final void method1195(int arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5) {
        ++field2596;
        super.field2175 = super.field2167 = (byte) arg5;
        if (class669.method3767(arg4, (byte) -99, arg1)) {
            ++super.field2167;
        }
        if (~super.field871 != 0 && ~class460.field6365.method1090(super.field871, 16383).field4039 == -2) {
            super.field821 = null;
            super.field871 = -1;
        }
        if (super.field829 != -1) {
            class49 var7 = class303.field4090.method3521(2, super.field829);
            if (var7.field496 && ~var7.field497 != 0 && ~class460.field6365.method1090(var7.field497, 16383).field4039 == -2) {
                super.field829 = -1;
            }
        }
        if (~super.field810 != 0) {
            class49 var8 = class303.field4090.method3521(2, super.field810);
            if (var8.field496 && ~var8.field497 != 0 && class460.field6365.method1090(var8.field497, 16383).field4039 == 1) {
                super.field810 = -1;
            }
        }
        if (!arg2) {
            int var9 = -super.field898[0] + arg1;
            int var10 = -super.field899[0] + arg4;
            if (~var9 <= 7 && ~var9 >= -9 && ~var10 <= 7 && var10 <= 8) {
                if (~super.field895 > -10) {
                    ++super.field895;
                }
                for (int var11 = super.field895; ~var11 < -1; --var11) {
                    super.field898[var11] = super.field898[var11 + -1];
                    super.field899[var11] = super.field899[var11 + -1];
                    super.field904[var11] = super.field904[var11 + -1];
                }
                super.field898[0] = arg1;
                super.field904[0] = 1;
                super.field899[0] = arg4;
                return;
            }
        }
        super.field895 = 0;
        super.field898[0] = arg1;
        super.field897 = 0;
        super.field894 = 0;
        super.field899[0] = arg4;
        super.field2165 = (super.field899[0] << 9) + (arg0 << 8);
        super.field2170 = (super.field898[0] << 9) + (arg0 << 8);
        if (arg3 >= -105) {
            this.field2580 = -54;
        }
        if (super.field900 != null) {
            super.field900.method3127();
        }
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(III)V")
    public final void method1196(int arg0, int arg1, int arg2) {
        ++field2598;
        int var4 = super.field898[0];
        int var5 = super.field899[0];
        if (arg2 == 0) {
            ++var5;
        }
        if (arg2 == 1) {
            ++var4;
            ++var5;
        }
        if (~arg2 == -3) {
            ++var4;
        }
        if (~arg2 == -4) {
            ++var4;
            --var5;
        }
        if (~arg2 == -5) {
            --var5;
        }
        if (arg2 == 5) {
            --var4;
            --var5;
        }
        if (arg2 == 6) {
            --var4;
        }
        if (~arg2 == -8) {
            ++var5;
            --var4;
        }
        if (super.field871 != -1 && class460.field6365.method1090(super.field871, 16383).field4039 == 1) {
            super.field871 = -1;
            super.field821 = null;
        }
        if (~super.field829 != arg0) {
            class49 var6 = class303.field4090.method3521(arg0 + 2, super.field829);
            if (var6.field496 && var6.field497 != -1 && class460.field6365.method1090(var6.field497, 16383).field4039 == 1) {
                super.field829 = -1;
            }
        }
        if (super.field810 != -1) {
            class49 var7 = class303.field4090.method3521(arg0 + 2, super.field810);
            if (var7.field496 && ~var7.field497 != 0 && class460.field6365.method1090(var7.field497, 16383).field4039 == 1) {
                super.field810 = -1;
            }
        }
        if (super.field895 < 9) {
            ++super.field895;
        }
        for (int var8 = super.field895; ~var8 < -1; --var8) {
            super.field898[var8] = super.field898[var8 + -1];
            super.field899[var8] = super.field899[var8 + -1];
            super.field904[var8] = super.field904[var8 + -1];
        }
        super.field898[0] = var4;
        super.field899[0] = var5;
        super.field904[0] = (byte) arg1;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Z)I")
    public final int method553(boolean arg0) {
        ++field2585;
        if (arg0) {
            this.field2589 = null;
        }
        if (this.field2589.field3616 != null) {
            class274 var2 = this.field2589.method1637(class386.field5455, (byte) 70);
            if (var2 != null && ~var2.field3597 != 0) {
                return var2.field3597;
            }
        }
        return this.field2589.field3597 == -1 ? super.method553(false) : this.field2589.field3597;
    }

    @OriginalMember(owner = "client!cea", name = "l", descriptor = "(I)Z")
    private final boolean method1197(int arg0) {
        ++field2576;
        if (arg0 != 2) {
            this.field2587 = -16;
        }
        return this.field2589.field3624;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lgg;BZILha;II)V")
    public final void method162(class176 arg0, byte arg1, boolean arg2, int arg3, class60 arg4, int arg5, int arg6) {
        ++field2582;
        int var8 = -121 % ((15 - arg1) / 55);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILha;BI)Z")
    public final boolean method131(int arg0, class60 arg1, byte arg2, int arg3) {
        ++field2586;
        if (this.field2589 != null && this.method1194(arg1, 255, 131072)) {
            class10 var5 = arg1.method410();
            int var6 = super.field854.method3756((byte) 116);
            var5.method34(var6);
            if (arg2 <= 59) {
                this.method127((class60) null, -17);
            }
            var5.method39(super.field2170, super.field2178, super.field2165);
            boolean var7 = false;
            for (int var8 = 0; var8 < super.field902.length; ++var8) {
                if (super.field902[var8] != null) {
                    boolean var10000;
                    label47: {
                        if (~this.field2589.field3633 >= -1) {
                            label45: {
                                if (~this.field2589.field3601 == 0) {
                                    if (this.field2589.field3619 == 1) {
                                        break label45;
                                    }
                                    var10000 = false;
                                } else {
                                    if (~this.field2589.field3601 == -2) {
                                        break label45;
                                    }
                                    var10000 = false;
                                }
                                if (!var10000) {
                                    var10000 = false;
                                    break label47;
                                }
                            }
                        }
                        var10000 = true;
                    }
                    boolean var9 = var10000;
                    boolean var10;
                    if (!class670.field9312) {
                        var10 = super.field902[var8].method206(arg0, arg3, var5, var9, this.field2589.field3633);
                    } else {
                        var10 = super.field902[var8].method196(arg0, arg3, var5, var9, this.field2589.field3633, class661.field9249);
                    }
                    if (var10) {
                        var7 = true;
                        break;
                    }
                }
            }
            super.field902[0] = super.field902[1] = super.field902[2] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cea", name = "j", descriptor = "(I)I")
    public final int method544(int arg0) {
        ++field2583;
        if (this.field2589.field3616 != null) {
            class274 var2 = this.field2589.method1637(class386.field5455, (byte) 82);
            if (var2 != null && ~var2.field3600 != 0) {
                return var2.field3600;
            }
        }
        if (arg0 != 28213) {
            field2595 = null;
        }
        return this.field2589.field3600;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(BLha;)Loia;")
    public final class90 method134(byte arg0, class60 arg1) {
        if (arg0 != -53) {
            this.method1195(56, 121, false, (byte) 20, 65, -105);
        }
        ++field2592;
        return null;
    }

    @OriginalMember(owner = "client!cea", name = "g", descriptor = "(B)Z")
    public final boolean method1198(byte arg0) {
        if (arg0 != 106) {
            field2578 = -47;
        }
        ++field2590;
        return this.field2589 != null;
    }

    @OriginalMember(owner = "client!cea", name = "e", descriptor = "(Z)V")
    public static void method1199(boolean arg0) {
        field2595 = null;
        if (arg0) {
            method1199(true);
        }
        field2600 = null;
        field2599 = null;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljl;I)V")
    public final void method1200(class274 arg0, int arg1) {
        this.field2589 = arg0;
        ++field2579;
        if (arg1 != 1) {
            this.field2602 = -51;
        }
        if (super.field900 != null) {
            super.field900.method3127();
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(B)I")
    public final int method539(byte arg0) {
        if (arg0 != 70) {
            return 64;
        } else {
            ++field2588;
            if (this.field2589.field3616 != null) {
                class274 var2 = this.field2589.method1637(class386.field5455, (byte) 121);
                if (var2 != null && var2.field3658 != -1) {
                    return var2.field3658;
                }
            }
            return this.field2589.field3658;
        }
    }

    @OriginalMember(owner = "client!cea", name = "d", descriptor = "(B)Z")
    public final boolean method157(byte arg0) {
        ++field2597;
        if (arg0 >= -70) {
            this.method134((byte) 85, (class60) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!cea", name = "f", descriptor = "(I)I")
    public final int method130(int arg0) {
        if (arg0 != -14240) {
            this.method1196(-27, -46, 97);
        }
        ++field2604;
        return this.field2589 == null ? 0 : this.field2589.field3633;
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(Lha;I)Lbd;")
    public final class62 method127(class60 arg0, int arg1) {
        ++field2577;
        if (this.field2589 != null && this.method1194(arg0, 255, 2048)) {
            class10 var3 = arg0.method410();
            int var4 = super.field854.method3756((byte) 116);
            var3.method34(var4);
            class624 var5 = class77.field947[super.field2175][super.field2170 >> class443.field6172][super.field2165 >> class443.field6172];
            if (var5 != null && var5.field8736 != null) {
                int var6 = -var5.field8736.field1827 + super.field791;
                super.field791 = (int) ((float) super.field791 - (float) var6 / 10.0F);
            } else {
                super.field791 = (int) ((float) super.field791 - (float) super.field791 / 10.0F);
            }
            var3.method39(super.field2170, -super.field791 + super.field2178 + -20, super.field2165);
            class351 var7 = this.method548(1);
            class274 var8 = this.field2589.field3616 != null ? this.field2589.method1637(class386.field5455, (byte) 70) : this.field2589;
            super.field903 = false;
            class62 var9 = null;
            if (~class11.field68.field5494.method193((byte) 123) == -2 && var8.field3642 && var7.field4695) {
                class300 var10 = super.field871 != -1 && ~super.field855 == -1 ? class460.field6365.method1090(super.field871, 16383) : null;
                class300 var11 = super.field837 == -1 || super.field803 && var10 != null ? null : class460.field6365.method1090(super.field837, 16383);
                class472 var12 = class549.method3106(var11 == null ? var10 : var11, super.field825, this.field2589.field3619, this.field2589.field3646 & 255, super.field902[0], super.field840, var4, 121, 255 & this.field2589.field3632, this.field2589.field3647 & 65535, var11 != null ? super.field790 : super.field846, arg0, this.field2589.field3599 & 65535, super.field874);
                if (var12 != null) {
                    var9 = class413.method2384(super.field902.length + 1, (byte) -47, this.method1197(2));
                    super.field903 = true;
                    arg0.method350(false);
                    if (class670.field9312) {
                        var12.method243(var3, var9.field678[super.field902.length], class661.field9249, 0);
                    } else {
                        var12.method230(var3, var9.field678[super.field902.length], 0);
                    }
                    arg0.method350(true);
                }
            }
            var3.method34(var4);
            var3.method39(super.field2170, super.field2178 - 5 + -super.field791, super.field2165);
            if (var9 == null) {
                var9 = class413.method2384(super.field902.length, (byte) -47, this.method1197(2));
            }
            this.method545(arg0, false, (byte) -124, var3, super.field902);
            if (class670.field9312) {
                for (int var13 = 0; var13 < super.field902.length; ++var13) {
                    if (super.field902[var13] != null) {
                        super.field902[var13].method243(var3, var9.field678[var13], class661.field9249, 0);
                    }
                }
            } else {
                for (int var14 = 0; ~var14 > ~super.field902.length; ++var14) {
                    if (super.field902[var14] != null) {
                        super.field902[var14].method230(var3, var9.field678[var14], 0);
                    }
                }
            }
            if (super.field900 != null) {
                class583 var15 = super.field900.method3116();
                if (!class670.field9312) {
                    arg0.method452(var15);
                } else {
                    arg0.method397(var15, class661.field9249);
                }
            }
            for (int var16 = 0; super.field902.length > var16; ++var16) {
                if (super.field902[var16] != null) {
                    super.field903 |= super.field902[var16].method219();
                }
            }
            super.field902[0] = super.field902[1] = super.field902[2] = null;
            super.field875 = class478.field6604;
            if (arg1 > -12) {
                this.method157((byte) -72);
            }
            return var9;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cea", name = "f", descriptor = "(B)V")
    public final void method150(byte arg0) {
        if (arg0 != -73) {
            this.field2587 = -15;
        }
        ++field2594;
        throw new IllegalStateException();
    }
}
