import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class127 extends class390 {

    @OriginalMember(owner = "client!qo", name = "Qc", descriptor = "I")
    public int field2047 = -1;

    @OriginalMember(owner = "client!qo", name = "Xc", descriptor = "I")
    public int field2054 = -1;

    @OriginalMember(owner = "client!qo", name = "fd", descriptor = "I")
    public int field2062 = 0;

    @OriginalMember(owner = "client!qo", name = "Rc", descriptor = "I")
    public int field2048 = -1;

    @OriginalMember(owner = "client!qo", name = "ld", descriptor = "B")
    private byte field2068 = 0;

    @OriginalMember(owner = "client!qo", name = "Yc", descriptor = "I")
    public int field2055 = -1;

    @OriginalMember(owner = "client!qo", name = "Sc", descriptor = "I")
    public int field2049 = -1;

    @OriginalMember(owner = "client!qo", name = "id", descriptor = "I")
    public int field2065 = 0;

    @OriginalMember(owner = "client!qo", name = "wd", descriptor = "I")
    public int field2079 = -1;

    @OriginalMember(owner = "client!qo", name = "kd", descriptor = "I")
    public int field2067 = -1;

    @OriginalMember(owner = "client!qo", name = "Pc", descriptor = "Z")
    public boolean field2046 = false;

    @OriginalMember(owner = "client!qo", name = "xd", descriptor = "I")
    public int field2080 = 0;

    @OriginalMember(owner = "client!qo", name = "zd", descriptor = "I")
    public int field2082 = 0;

    @OriginalMember(owner = "client!qo", name = "vd", descriptor = "I")
    public int field2078 = 255;

    @OriginalMember(owner = "client!qo", name = "ud", descriptor = "I")
    public int field2077 = 0;

    @OriginalMember(owner = "client!qo", name = "Dd", descriptor = "B")
    private byte field2086 = 0;

    @OriginalMember(owner = "client!qo", name = "sd", descriptor = "Lvq;")
    public static class22 field2075 = new class22();

    @OriginalMember(owner = "client!qo", name = "Tc", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!qo", name = "Uc", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!qo", name = "Vc", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!qo", name = "Wc", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!qo", name = "Zc", descriptor = "I")
    private int field2056;

    @OriginalMember(owner = "client!qo", name = "ad", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!qo", name = "bd", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!qo", name = "cd", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!qo", name = "dd", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!qo", name = "gd", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!qo", name = "hd", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!qo", name = "md", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!qo", name = "nd", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!qo", name = "od", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!qo", name = "qd", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!qo", name = "rd", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!qo", name = "td", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!qo", name = "yd", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!qo", name = "Ad", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!qo", name = "Bd", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!qo", name = "Cd", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!qo", name = "pd", descriptor = "Lbn;")
    public class153 field2072;

    @OriginalMember(owner = "client!qo", name = "ed", descriptor = "Ljava/lang/String;")
    public String field2061;

    @OriginalMember(owner = "client!qo", name = "jd", descriptor = "Ljava/lang/String;")
    public String field2066;

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "(I)V")
    public static final void method1068(int arg0) {
        ++field2069;
        class384.field5499.method112(0);
        class250.field3610.method112(0);
        if (arg0 != -218) {
            method1073(false, -53, -29, 16);
        }
    }

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "(I)Z")
    public final boolean method1069(int arg0) {
        ++field2051;
        if (this.field2072 == null) {
            return false;
        } else {
            if (arg0 != -1810533241) {
                this.method1078((class100) null, -88, 23, (class90) null, (byte) 77, (class202) null, -123, -35);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "(B)I")
    public final int method1070(byte arg0) {
        if (arg0 != -50) {
            this.method134((byte) 81, (class90) null);
        }
        ++field2064;
        return this.field2072 != null && ~this.field2072.field2343 != 0 ? class371.method2357(this.field2072.field2343, -13299).field174 : super.method1070((byte) -50);
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(B)Z")
    public final boolean method53(byte arg0) {
        if (arg0 < 58) {
            return false;
        } else {
            ++field2070;
            return false;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIZII)V")
    public final void method1071(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field2083;
        if (arg0 != 6289) {
            this.method1074(true, (byte) 33);
        }
        super.method2471((byte) 114, arg1, this.method1070((byte) -50), arg4, arg2, arg3);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lec;I)V")
    public final void method1072(class37 arg0, int arg1) {
        arg0.field565 = 0;
        ++field2059;
        int var3 = arg0.method271((byte) 120);
        int var4 = 1 & var3;
        boolean var5 = (var3 & 2) != 0;
        boolean var6 = (4 & var3) != 0;
        int var7 = super.method1070((byte) -50);
        this.method2474(false, ((63 & var3) >> 3) + 1);
        this.field2068 = (byte) ((204 & var3) >> 6);
        super.field6520 += (-var7 + this.method1070((byte) -50)) * 64;
        super.field6519 += (-var7 + this.method1070((byte) -50)) * 64;
        this.field2086 = arg0.method291(arg1);
        this.field2049 = arg0.method291(0);
        this.field2054 = arg0.method291(0);
        this.field2080 = 0;
        int var8 = -1;
        int[] var9 = new int[12];
        for (int var10 = 0; ~var10 > -13; ++var10) {
            int var11 = arg0.method271((byte) 105);
            if (var11 == 0) {
                var9[var10] = 0;
            } else {
                int var12 = arg0.method271((byte) 118);
                int var13 = (var11 << 8) + var12;
                if (var10 == 0 && ~var13 == -65536) {
                    var8 = arg0.method320((byte) -87);
                    this.field2080 = arg0.method271((byte) 102);
                    break;
                }
                if (var13 >= 32768) {
                    int var27 = class391.field5722[var13 + -32768];
                    var9[var10] = class439.method2744(1073741824, var27);
                    int var28 = class206.method1561(arg1 ^ 122, var27).field1976;
                    if (var28 != 0) {
                        this.field2080 = var28;
                    }
                } else {
                    var9[var10] = class439.method2744(var13 + -256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var14 = new int[5];
        for (int var15 = 0; var15 < 5; ++var15) {
            int var26 = arg0.method271((byte) 116);
            if (var26 < 0 || ~var26 <= ~class196.field2874[var15].length) {
                var26 = 0;
            }
            var14[var15] = var26;
        }
        this.field2056 = arg0.method320((byte) -87);
        this.field2061 = arg0.method322((byte) -34);
        if (!var5) {
            this.field2066 = this.field2061;
        } else {
            this.field2066 = arg0.method322((byte) -34);
        }
        this.field2065 = arg0.method271((byte) 127);
        if (var6) {
            this.field2082 = arg0.method320((byte) -87);
            this.field2055 = -1;
            this.field2077 = this.field2065;
        } else {
            this.field2082 = 0;
            this.field2077 = arg0.method271((byte) 120);
            this.field2055 = arg0.method271((byte) 113);
            if (~this.field2055 == -256) {
                this.field2055 = -1;
            }
        }
        int var16 = this.field2062;
        this.field2062 = arg0.method271((byte) 120);
        if (this.field2062 == 0) {
            class331.method2170(this, (byte) -88);
        } else {
            int var17 = this.field2067;
            int var18 = this.field2079;
            int var19 = this.field2048;
            int var20 = this.field2047;
            int var21 = this.field2078;
            this.field2067 = arg0.method320((byte) -87);
            this.field2079 = arg0.method320((byte) -87);
            this.field2048 = arg0.method320((byte) -87);
            this.field2047 = arg0.method320((byte) -87);
            this.field2078 = arg0.method271((byte) 109);
            if (this.field2062 != var16 || this.field2067 != var17 || this.field2079 != var18 || this.field2048 != var19 || this.field2047 != var20 || ~this.field2078 != ~var21) {
                class219.method1663(arg1 + -113, this);
            }
        }
        if (this.field2072 == null) {
            this.field2072 = new class153();
        }
        int var22 = this.field2072.field2343;
        int[] var23 = this.field2072.field2339;
        this.field2072.method1178(var8, (byte) -117, this.method816(-1), var14, var4 == 1, var9);
        if (~var8 != ~var22) {
            super.field6520 = super.field5694[0] * 128 - -(64 * this.method1070((byte) -50));
            super.field6519 = super.field5696[0] * 128 - -(this.method1070((byte) -50) * 64);
        }
        if (super.field5657 == 2047 && var23 != null) {
            for (int var24 = 0; ~var14.length < ~var24; ++var24) {
                if (var14[var24] != var23[var24]) {
                    class78.method610((byte) 108);
                    break;
                }
            }
        }
        if (super.field5703 != null) {
            super.field5703.method428();
        }
        if (~super.field5642 != 0 && super.field5661) {
            class419 var25 = this.method2476((byte) 59);
            if (!var25.method2633(false, super.field5642)) {
                super.field5642 = -1;
                super.field5661 = false;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZIII)V")
    public static final void method1073(boolean arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 << 3;
        int var5 = arg3 << 3;
        int var6 = arg2 << 3;
        ++field2084;
        class436.field6359 = (float) var6;
        class106.field1756 = (float) var5;
        if (class322.field4643 == 2) {
            class40.field623 = var6;
            class291.field4330 = var5;
            class375.field5318 = var4;
        }
        class169.method1292((byte) 98);
        class206.field3020 = arg0;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IBZIILnf;Lja;)V")
    public final void method47(int arg0, byte arg1, boolean arg2, int arg3, int arg4, class256 arg5, class90 arg6) {
        ++field2052;
        if (arg1 == 47) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZB)Ljava/lang/String;")
    public final String method1074(boolean arg0, byte arg1) {
        ++field2073;
        if (arg1 <= 14) {
            this.field2072 = null;
        }
        String var3 = "";
        if (class69.field1123 != null) {
            var3 = var3 + class69.field1123[this.field2068];
        }
        if (class280.field4193 != null && class280.field4193[this.field2068] != -1) {
            class269 var4 = class443.method2771(2048, class280.field4193[this.field2068]);
            if (var4.field4029 != 's') {
                class282.method2003("gdn1", -24830, new Throwable());
                class280.field4193[this.field2068] = -1;
            } else {
                var3 = var3 + var4.method1924(this.field2086 & 255, 6);
            }
        }
        String var5;
        if (arg0) {
            var5 = var3 + this.field2061;
        } else {
            var5 = var3 + this.field2066;
        }
        if (class14.field223 != null) {
            var5 = var5 + class14.field223[this.field2068];
        }
        return var5;
    }

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "(B)V")
    public static void method1075(byte arg0) {
        if (arg0 != -11) {
            method1075((byte) 87);
        }
        field2075 = null;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)I")
    public final int method816(int arg0) {
        if (arg0 != -1) {
            return -87;
        } else {
            ++field2074;
            return this.field2056;
        }
    }

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "(I)I")
    public final int method136(int arg0) {
        ++field2057;
        if (arg0 != 0) {
            this.field2054 = 29;
        }
        return super.field5613;
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)V")
    public final void method54(int arg0) {
        if (arg0 != 0) {
            this.method816(88);
        }
        ++field2058;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lja;BI)Z")
    private final boolean method1076(class90 arg0, byte arg1, int arg2) {
        ++field2060;
        int var4 = arg2;
        class419 var5 = this.method2476((byte) 73);
        class51 var6 = super.field5620 != -1 && super.field5647 == 0 ? class113.method974(super.field5620, (byte) -64) : null;
        class51 var7 = super.field5642 == -1 || this.field2046 || super.field5661 && var6 != null ? null : class113.method974(super.field5642, (byte) -76);
        int var8 = var5.field6085;
        if (arg1 < 37) {
            return true;
        } else {
            int var9 = var5.field6083;
            if (var8 != 0 || var9 != 0 || var5.field6095 != 0 || var5.field6073 != 0) {
                arg2 |= 7;
            }
            super.field5704[0] = this.field2072.method1175(var6, var7, arg2, true, super.field5665, (byte) 100, super.field5646, arg0, super.field5687, super.field5659, super.field5648, super.field5608, super.field5640);
            int var10 = class254.method1835(-76);
            if (class75.field1288 < 96 && var10 > 50) {
                class371.method2360(2857);
            }
            if (class331.field4762 != 0 && var10 < 50) {
                int var11 = 50 - var10;
                while (var11 > class39.field609) {
                    class275.field4144[class39.field609] = new byte[102400];
                    ++class39.field609;
                }
                while (var11 < class39.field609) {
                    --class39.field609;
                    class275.field4144[class39.field609] = null;
                }
            } else if (~class331.field4762 != -1) {
                class39.field609 = 0;
                class275.field4144 = new byte[50][];
            }
            if (super.field5704[0] == null) {
                return false;
            } else {
                super.field5613 = super.field5704[0].method541();
                this.method2470(super.field5704[0], -1);
                int var12 = super.field5623.method603(16383);
                super.field5671 = 0;
                super.field5622 = 0;
                super.field5607 = 0;
                if (~var8 == -1 && var9 == 0) {
                    this.method2480((byte) 127, this.method1070((byte) -50) << 7, this.method1070((byte) -50) << 7, var12);
                } else {
                    this.method2480((byte) 127, var8, var9, var12);
                    if (super.field5622 != 0) {
                        super.field5704[0].method543(super.field5622);
                    }
                    if (super.field5607 != 0) {
                        super.field5704[0].method519(super.field5607);
                    }
                    if (~super.field5671 != -1) {
                        super.field5704[0].method523(0, super.field5671, 0);
                    }
                }
                super.field5704[1] = null;
                if (!this.field2046 && super.field5683 != -1 && super.field5630 != -1) {
                    class389 var13 = class321.method2140(super.field5683, (byte) 45);
                    class100 var14 = var13.method2464(arg0, var4 | (!var13.field5577 ? 2 : 7), super.field5681, super.field5651, super.field5630, 6677);
                    if (var14 != null) {
                        var14.method523(0, -super.field5672, 0);
                        if (var13.field5577 && (~var8 != -1 || var9 != 0)) {
                            if (~super.field5622 != -1) {
                                var14.method543(super.field5622);
                            }
                            if (super.field5607 != 0) {
                                var14.method519(super.field5607);
                            }
                            if (~super.field5671 != -1) {
                                var14.method523(0, super.field5671, 0);
                            }
                        }
                        super.field5704[1] = var14;
                    }
                }
                super.field5704[2] = null;
                if (!this.field2046 && super.field5702 != null) {
                    if (class267.field4002 >= super.field5709) {
                        super.field5702 = null;
                    }
                    if (super.field5707 <= class267.field4002 && super.field5709 > class267.field4002) {
                        class100 var15 = super.field5702.method1025((byte) -84, var4 | 7, arg0);
                        if (var15 != null) {
                            var15.method523(-super.field6520 + super.field5710, -super.field6506 + super.field5697, -super.field6519 + super.field5708);
                            if (var12 != 0) {
                                var15.method538(-var12 & 16383);
                            }
                            super.field5704[2] = var15;
                        }
                    }
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(BLja;)Lkh;")
    public final class69 method134(byte arg0, class90 arg1) {
        ++field2053;
        if (this.field2072 != null && this.method1076(arg1, (byte) 87, 1024)) {
            class202 var3 = arg1.method709();
            int var4 = super.field5623.method603(16383);
            var3.method1541(var4);
            var3.method1528(super.field6520, super.field6506, super.field6519);
            if (arg0 < 90) {
                this.field2065 = -123;
            }
            float var5 = arg1.method759();
            float var6 = arg1.method689();
            if (class451.field6550) {
                class419 var7 = this.method2476((byte) 94);
                if (var7.field6071 && (this.field2072.field2343 == -1 || class371.method2357(this.field2072.field2343, -13299).field128)) {
                    class51 var8 = super.field5620 != -1 && ~super.field5647 == -1 ? class113.method974(super.field5620, (byte) -113) : null;
                    class51 var9 = ~super.field5642 == 0 || this.field2046 || super.field5661 && var8 != null ? null : class113.method974(super.field5642, (byte) -104);
                    class100 var10 = class42.method344((byte) 44, 160, super.field5704[0], super.field5671, arg1, var9 != null ? var9 : var8, 1, 240, 0, var4, super.field5622, super.field5619, var9 == null ? super.field5687 : super.field5659, 0, super.field5607);
                    if (var10 != null) {
                        arg1.method693(var5, var6 + -128.0F);
                        arg1.method676(false);
                        var10.method530(var3, (class290) null, 0);
                        arg1.method676(true);
                    }
                }
            }
            if (class86.field1394 == this) {
                arg1.method693(var5, var6 + -144.0F);
                var3.method1527(super.field6520, super.field6506, super.field6519);
                for (int var11 = class431.field6220.length + -1; var11 >= 0; --var11) {
                    class257 var12 = class431.field6220[var11];
                    if (var12 != null && var12.field3718 != -1) {
                        if (~var12.field3713 == -2 && ~var12.field3708 <= -1 && ~class447.field6512.length < ~var12.field3708) {
                            class98 var13 = class447.field6512[var12.field3708];
                            if (var13 != null) {
                                int var14 = var13.field6520 / 32 + -(class86.field1394.field6520 / 32);
                                int var15 = var13.field6519 / 32 + -(class86.field1394.field6519 / 32);
                                this.method1078(super.field5704[0], 360000, var12.field3718, arg1, (byte) -54, var3, var15, var14);
                            }
                        }
                        if (~var12.field3713 == -3) {
                            int var16 = (-class379.field5384 + var12.field3710) * 4 - (-2 - -(class86.field1394.field6520 / 32));
                            int var17 = (-class294.field4362 + var12.field3714) * 4 + -(class86.field1394.field6519 / 32) + 2;
                            int var18 = var12.field3706 * 4;
                            int var19 = var18 * var18;
                            this.method1078(super.field5704[0], var19, var12.field3718, arg1, (byte) -54, var3, var17, var16);
                        }
                        if (var12.field3713 == 10 && ~var12.field3708 <= -1 && ~class367.field5225.length < ~var12.field3708) {
                            class127 var20 = class367.field5225[var12.field3708];
                            if (var20 != null) {
                                int var21 = var20.field6520 / 32 + -(class86.field1394.field6520 / 32);
                                int var22 = var20.field6519 / 32 + -(class86.field1394.field6519 / 32);
                                this.method1078(super.field5704[0], 360000, var12.field3718, arg1, (byte) -54, var3, var22, var21);
                            }
                        }
                    }
                }
                var3.method1541(var4);
                var3.method1528(super.field6520, super.field6506, super.field6519);
            }
            arg1.method693(var5, var6);
            class69 var23 = class256.method1849(super.field5704.length, 85);
            if (super.field5703 == null) {
                arg1.method756(super.field5704, var3, var23.field1128, class86.field1394 == this ? 1 : 0);
            } else {
                class30 var24 = super.field5703.method427();
                arg1.method690(super.field5704, var24, var3, var23.field1128, class86.field1394 != this ? 0 : 1);
            }
            this.method2472(0, super.field5704, arg1, false);
            if (super.field5704[2] != null) {
                if (~var4 != -1) {
                    super.field5704[2].method538(var4);
                }
                super.field5704[2].method523(super.field6520 - super.field5710, -super.field5697 + super.field6506, -super.field5708 + super.field6519);
            }
            return var23;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(ZI)Ljava/lang/String;")
    public final String method1077(boolean arg0, int arg1) {
        if (arg1 != 0) {
            return null;
        } else {
            ++field2081;
            return arg0 ? this.field2061 : this.field2066;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lrc;IILja;BLpo;II)V")
    private final void method1078(class100 arg0, int arg1, int arg2, class90 arg3, byte arg4, class202 arg5, int arg6, int arg7) {
        if (arg4 != -54) {
            this.field2049 = -13;
        }
        ++field2085;
        int var9 = arg6 * arg6 + arg7 * arg7;
        if (var9 >= 16 && arg1 >= var9) {
            int var10 = (int) (2607.5945876176133D * Math.atan2((double) arg7, (double) arg6)) & 16383;
            class100 var11 = class324.method2152(super.field5671, 0, super.field6506, var10, super.field5622, super.field5607, arg2, super.field6520, arg3, super.field6519, arg0);
            if (var11 != null) {
                arg3.method676(false);
                var11.method530(arg5, (class290) null, 0);
                arg3.method676(true);
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)I")
    public final int method814(byte arg0) {
        ++field2050;
        if (arg0 != -14) {
            this.method816(42);
        }
        return -1;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lmb;Z)Lmb;")
    public static final class258 method1079(class258 arg0, boolean arg1) {
        ++field2076;
        if (~arg0.field3754 != 0) {
            return class342.method2207(arg0.field3754, (byte) 14);
        } else {
            int var2 = arg0.field3854 >>> 16;
            class129 var3 = new class129(class355.field5045);
            class120 var4 = (class120) var3.method1090(true);
            if (arg1) {
                field2075 = null;
            }
            while (var4 != null) {
                if (~var4.field1874 == ~var2) {
                    return class342.method2207((int) var4.field499, (byte) 14);
                }
                var4 = (class120) var3.method1089(0);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILja;)V")
    public final void method137(int arg0, class90 arg1) {
        ++field2063;
        int var3 = -61 / ((arg0 - -31) / 51);
        if (this.field2072 != null) {
            if (super.field5691 || this.method1076(arg1, (byte) 57, 0)) {
                this.method2472(0, super.field5704, arg1, super.field5691);
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILja;II)Z")
    public final boolean method132(int arg0, class90 arg1, int arg2, int arg3) {
        if (arg2 != 28033) {
            return false;
        } else {
            ++field2071;
            if (this.field2072 != null && this.method1076(arg1, (byte) 50, 65536)) {
                class202 var5 = arg1.method709();
                int var6 = super.field5623.method603(16383);
                var5.method1541(var6);
                var5.method1527(super.field6520, super.field6506, super.field6519);
                for (int var7 = 0; super.field5704.length > var7; ++var7) {
                    if (super.field5704[var7] != null) {
                        return super.field5704[var7].method574(arg3, arg0, var5, true);
                    }
                }
                return false;
            } else {
                return true;
            }
        }
    }
}
