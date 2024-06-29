import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class124 extends class24 {

    @OriginalMember(owner = "client!dv", name = "id", descriptor = "I")
    public int field1478 = -1;

    @OriginalMember(owner = "client!dv", name = "pd", descriptor = "I")
    public int field1485 = -1;

    @OriginalMember(owner = "client!dv", name = "ed", descriptor = "Lgg;")
    public static class114 field1474 = new class114(260);

    @OriginalMember(owner = "client!dv", name = "vd", descriptor = "Lsga;")
    public static class583 field1491 = new class583(16);

    @OriginalMember(owner = "client!dv", name = "cd", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!dv", name = "dd", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!dv", name = "fd", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!dv", name = "gd", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!dv", name = "hd", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!dv", name = "jd", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!dv", name = "kd", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!dv", name = "ld", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!dv", name = "md", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!dv", name = "nd", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!dv", name = "od", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!dv", name = "rd", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!dv", name = "sd", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!dv", name = "td", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!dv", name = "ud", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!dv", name = "wd", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!dv", name = "xd", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!dv", name = "yd", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!dv", name = "qd", descriptor = "Lat;")
    public class155 field1486;

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "(I)V")
    public final void method523(int arg0) {
        if (arg0 == 0) {
            ++field1487;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "(I)I")
    public final int method789(int arg0) {
        if (arg0 <= 86) {
            this.field1486 = null;
        }
        ++field1480;
        return this.field1486 == null ? 0 : this.field1486.field1906;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILat;)V")
    public final void method803(int arg0, class155 arg1) {
        ++field1494;
        this.field1486 = arg1;
        if (arg0 < -85) {
            if (super.field433 != null) {
                super.field433.method2552();
            }
        }
    }

    @OriginalMember(owner = "client!dv", name = "k", descriptor = "(I)Z")
    private final boolean method804(int arg0) {
        ++field1475;
        if (arg0 != 28879) {
            this.method516((byte) 27);
        }
        return this.field1486.field1925;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(BILha;)Z")
    private final boolean method805(byte arg0, int arg1, class454 arg2) {
        ++field1484;
        int var4 = arg1;
        class459 var5 = this.method249(-128);
        class747 var6 = super.field376 != -1 && super.field364 == 0 ? class646.field8903.method643(super.field376, -110) : null;
        class747 var7 = ~super.field332 == 0 || super.field313 && var6 != null ? null : class646.field8903.method643(super.field332, -95);
        int var8 = var5.field6453;
        int var9 = var5.field6413;
        if (var8 != 0 || ~var9 != -1 || ~var5.field6417 != -1 || var5.field6439 != 0) {
            arg1 |= 7;
        }
        boolean var10 = super.field380 != 0 && ~super.field333 >= ~class266.field3368 && super.field327 > class266.field3368;
        if (var10) {
            arg1 |= 524288;
        }
        int var11 = super.field336.method2948(arg0 + 25245);
        class219 var12 = super.field429[0] = this.field1486.method967(class461.field6637, super.field320, super.field369, super.field385, super.field413, var7, (byte) 127, arg1, super.field415, super.field388, var6, class646.field8903, class190.field2501, super.field387, super.field326, var11, arg2);
        if (var12 == null) {
            return false;
        } else {
            super.field363 = var12.method1353();
            super.field381 = var12.method1333();
            this.method258(var12, arg0 ^ -85);
            if (~var8 == -1 && var9 == 0) {
                this.method252(0, var11, 963573505, this.method253((byte) -27) << 9, 0, this.method253((byte) -27) << 9);
            } else {
                this.method252(var5.field6414, var11, arg0 + 963573590, var9, var5.field6440, var8);
                if (~super.field359 != -1) {
                    super.field429[0].method1343(super.field359);
                }
                if (super.field325 != 0) {
                    super.field429[0].method1373(super.field325);
                }
                if (super.field324 != 0) {
                    super.field429[0].method1348(0, super.field324, 0);
                }
            }
            if (var10) {
                var12.method1369(super.field365, super.field398, super.field344, 255 & super.field380);
            }
            if (~super.field395 != 0 && super.field400 != -1) {
                class716 var13 = class250.field3177.method3616((byte) 126, super.field395);
                boolean var14 = ~var13.field10082 == -4 && (~var8 != -1 || var9 != 0);
                int var15 = var4;
                if (var14) {
                    var15 = var4 | 7;
                } else {
                    if (~super.field314 != -1) {
                        var15 = var4 | 5;
                    }
                    if (~super.field379 != -1) {
                        var15 |= 2;
                    }
                    if (~super.field403 <= -1) {
                        var15 |= 7;
                    }
                }
                class219 var16 = super.field429[1] = var13.method3980(arg2, class646.field8903, var15, super.field400, super.field361, super.field419, (byte) 62);
                if (var16 != null) {
                    if (super.field403 < 0) {
                        if (super.field314 != 0) {
                            var16.method1358(super.field314 * 2048);
                        }
                    } else {
                        int var17 = 0;
                        int var18 = 0;
                        int var19 = 0;
                        if (var5.field6454 != null && var5.field6454[super.field403] != null) {
                            var19 += var5.field6454[super.field403][2];
                            var18 += var5.field6454[super.field403][1];
                            var17 += var5.field6454[super.field403][0];
                        }
                        if (var5.field6424 != null && var5.field6424[super.field403] != null) {
                            var18 += var5.field6424[super.field403][1];
                            var17 += var5.field6424[super.field403][0];
                            var19 += var5.field6424[super.field403][2];
                        }
                        if (~var19 != -1 || ~var17 != -1) {
                            int var20 = var11;
                            if (super.field369 != null && super.field369[super.field403] != -1) {
                                var20 = super.field369[super.field403];
                            }
                            int var21 = 16383 & super.field314 * 2048 + -var11 - -var20;
                            if (~var21 != -1) {
                                var16.method1358(var21);
                            }
                            int var22 = class138.field1644[var21];
                            int var23 = class138.field1645[var21];
                            int var24 = var17 * var23 + var19 * var22 >> 14;
                            var19 = var19 * var23 + -(var17 * var22) >> 14;
                            var17 = var24;
                        }
                        var16.method1348(var17, var18, var19);
                    }
                    if (~super.field379 != -1) {
                        var16.method1348(0, -super.field379 << 2, 0);
                    }
                    if (var14) {
                        if (~super.field359 != -1) {
                            var16.method1343(super.field359);
                        }
                        if (super.field325 != 0) {
                            var16.method1373(super.field325);
                        }
                        if (~super.field324 != -1) {
                            var16.method1348(0, super.field324, 0);
                        }
                    }
                }
            } else {
                super.field429[1] = null;
            }
            if (arg0 != -85) {
                this.method804(23);
            }
            if (~super.field367 != 0 && ~super.field329 != 0) {
                class716 var25 = class250.field3177.method3616((byte) 120, super.field367);
                boolean var26 = ~var25.field10082 == -4 && (var8 != 0 || ~var9 != -1);
                int var27 = var4;
                if (!var26) {
                    if (~super.field374 != -1) {
                        var27 = var4 | 5;
                    }
                    if (~super.field397 != -1) {
                        var27 |= 2;
                    }
                    if (~super.field368 <= -1) {
                        var27 |= 7;
                    }
                } else {
                    var27 = var4 | 7;
                }
                class219 var28 = super.field429[2] = var25.method3979(class646.field8903, super.field329, arg2, -16341, super.field338, super.field392, var27);
                if (var28 != null) {
                    if (super.field368 >= 0 && var5.field6454 != null && var5.field6454[super.field368] != null) {
                        int var29 = 0;
                        int var30 = 0;
                        int var31 = 0;
                        if (var5.field6454 != null && var5.field6454[super.field368] != null) {
                            var31 += var5.field6454[super.field368][2];
                            var30 += var5.field6454[super.field368][1];
                            var29 += var5.field6454[super.field368][0];
                        }
                        if (var5.field6424 != null && var5.field6424[super.field368] != null) {
                            var29 += var5.field6424[super.field368][0];
                            var30 += var5.field6424[super.field368][1];
                            var31 += var5.field6424[super.field368][2];
                        }
                        if (var31 != 0 || var29 != 0) {
                            int var32 = var11;
                            if (super.field369 != null && ~super.field369[super.field368] != 0) {
                                var32 = super.field369[super.field368];
                            }
                            int var33 = 16383 & super.field374 * 2048 + -var11 + var32;
                            if (var33 != 0) {
                                var28.method1358(var33);
                            }
                            int var34 = class138.field1644[var33];
                            int var35 = class138.field1645[var33];
                            int var36 = var31 * var34 - -(var29 * var35) >> 14;
                            var31 = var31 * var35 + -(var29 * var34) >> 14;
                            var29 = var36;
                        }
                        var28.method1348(var29, var30, var31);
                    } else if (~super.field374 != -1) {
                        var28.method1358(super.field374 * 2048);
                    }
                    if (super.field397 != 0) {
                        var28.method1348(0, -super.field397 << 2, 0);
                    }
                    if (var26) {
                        if (~super.field359 != -1) {
                            var28.method1343(super.field359);
                        }
                        if (super.field325 != 0) {
                            var28.method1373(super.field325);
                        }
                        if (~super.field324 != -1) {
                            var28.method1348(0, super.field324, 0);
                        }
                    }
                }
            } else {
                super.field429[2] = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIBLha;)Z")
    public final boolean method512(int arg0, int arg1, byte arg2, class454 arg3) {
        ++field1472;
        if (arg2 != -4) {
            return false;
        } else if (this.field1486 != null && this.method805((byte) -85, 131072, arg3)) {
            class376 var5 = arg3.method114();
            int var6 = super.field336.method2948(arg2 ^ -25164);
            var5.method1976(var6);
            var5.method1973(super.field5790, super.field5791, super.field5784);
            boolean var7 = false;
            for (int var8 = 0; var8 < super.field429.length; ++var8) {
                if (super.field429[var8] != null) {
                    boolean var10000;
                    label46: {
                        if (~this.field1486.field1906 >= -1) {
                            label44: {
                                if (this.field1486.field1927 == -1) {
                                    if (~this.field1486.field1928 == -2) {
                                        break label44;
                                    }
                                    var10000 = false;
                                } else {
                                    if (~this.field1486.field1927 == -2) {
                                        break label44;
                                    }
                                    var10000 = false;
                                }
                                if (!var10000) {
                                    var10000 = false;
                                    break label46;
                                }
                            }
                        }
                        var10000 = true;
                    }
                    boolean var9 = var10000;
                    boolean var10;
                    if (class306.field3936) {
                        var10 = super.field429[var8].method1357(arg0, arg1, var5, var9, this.field1486.field1906, class468.field6738);
                    } else {
                        var10 = super.field429[var8].method1378(arg0, arg1, var5, var9, this.field1486.field1906);
                    }
                    if (var10) {
                        var7 = true;
                        break;
                    }
                }
            }
            super.field429[0] = super.field429[1] = super.field429[2] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(ZLha;)V")
    public final void method522(boolean arg0, class454 arg1) {
        ++field1473;
        if (arg0) {
            this.field1486 = null;
        }
        if (this.field1486 != null) {
            if (super.field432 || this.method805((byte) -85, 0, arg1)) {
                class376 var3 = arg1.method114();
                var3.method1976(super.field336.method2948(25160));
                var3.method1973(super.field5790, super.field5791 + -20, super.field5784);
                this.method260(super.field432, super.field429, var3, arg1, -21886);
                super.field429[0] = super.field429[1] = super.field429[2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)I")
    public final int method250(byte arg0) {
        ++field1492;
        if (this.field1486.field1929 != null) {
            class155 var2 = this.field1486.method968((byte) -76, class461.field6637);
            if (var2 != null && ~var2.field1963 != 0) {
                return var2.field1963;
            }
        }
        if (arg0 > -25) {
            method809('^', -66, (String) null);
        }
        return this.field1486.field1963;
    }

    @OriginalMember(owner = "client!dv", name = "l", descriptor = "(I)V")
    public static void method806(int arg0) {
        field1491 = null;
        field1474 = null;
        if (arg0 != 0) {
            method809('B', -119, (String) null);
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(ZIIIII)V")
    public final void method807(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != -237433432) {
            this.method789(-75);
        }
        ++field1488;
        super.field5779 = super.field5792 = (byte) arg4;
        if (class739.method4140((byte) 92, arg1, arg5)) {
            ++super.field5792;
        }
        if (~super.field376 != 0 && ~class646.field8903.method643(super.field376, arg2 + 237433331).field10456 == -2) {
            super.field376 = -1;
            super.field408 = null;
        }
        if (~super.field395 != 0) {
            class716 var7 = class250.field3177.method3616((byte) 108, super.field395);
            if (var7.field10105 && ~var7.field10096 != 0 && ~class646.field8903.method643(var7.field10096, -66).field10456 == -2) {
                super.field395 = -1;
            }
        }
        if (super.field367 != -1) {
            class716 var8 = class250.field3177.method3616((byte) 111, super.field367);
            if (var8.field10105 && ~var8.field10096 != 0 && class646.field8903.method643(var8.field10096, -82).field10456 == 1) {
                super.field367 = -1;
            }
        }
        if (!arg0) {
            int var9 = -super.field435[0] + arg5;
            int var10 = -super.field426[0] + arg1;
            if (var9 >= -8 && ~var9 >= -9 && var10 >= -8 && ~var10 >= -9) {
                if (super.field427 < 9) {
                    ++super.field427;
                }
                for (int var11 = super.field427; var11 > 0; --var11) {
                    super.field435[var11] = super.field435[var11 - 1];
                    super.field426[var11] = super.field426[var11 - 1];
                    super.field428[var11] = super.field428[var11 + -1];
                }
                super.field435[0] = arg5;
                super.field426[0] = arg1;
                super.field428[0] = 1;
                return;
            }
        }
        super.field435[0] = arg5;
        super.field434 = 0;
        super.field431 = 0;
        super.field427 = 0;
        super.field426[0] = arg1;
        super.field5784 = (super.field426[0] << 9) + (arg3 << 8);
        super.field5790 = (super.field435[0] << 9) + (arg3 << 8);
        if (super.field433 != null) {
            super.field433.method2552();
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIB)V")
    public final void method808(int arg0, int arg1, byte arg2) {
        ++field1477;
        int var4 = super.field435[0];
        int var5 = super.field426[0];
        if (~arg1 == -1) {
            ++var5;
        }
        if (~arg1 == -2) {
            ++var5;
            ++var4;
        }
        if (arg1 == 2) {
            ++var4;
        }
        if (~arg1 == -4) {
            --var5;
            ++var4;
        }
        if (arg1 == 4) {
            --var5;
        }
        if (~arg1 == -6) {
            --var5;
            --var4;
        }
        if (~arg1 == -7) {
            --var4;
        }
        if (~super.field376 != 0 && class646.field8903.method643(super.field376, -113).field10456 == 1) {
            super.field376 = -1;
            super.field408 = null;
        }
        if (arg1 == 7) {
            ++var5;
            --var4;
        }
        if (super.field395 != -1) {
            class716 var6 = class250.field3177.method3616((byte) 105, super.field395);
            if (var6.field10105 && var6.field10096 != -1 && class646.field8903.method643(var6.field10096, -86).field10456 == 1) {
                super.field395 = -1;
            }
        }
        if (~super.field367 != 0) {
            class716 var7 = class250.field3177.method3616((byte) 109, super.field367);
            if (var7.field10105 && var7.field10096 != -1 && class646.field8903.method643(var7.field10096, -128).field10456 == 1) {
                super.field367 = -1;
            }
        }
        if (~super.field427 > -10) {
            ++super.field427;
        }
        for (int var8 = super.field427; var8 > 0; --var8) {
            super.field435[var8] = super.field435[var8 + -1];
            super.field426[var8] = super.field426[var8 + -1];
            super.field428[var8] = super.field428[var8 - 1];
        }
        super.field435[0] = var4;
        if (arg2 != 87) {
            this.method805((byte) 92, -91, (class454) null);
        }
        super.field428[0] = (byte) arg0;
        super.field426[0] = var5;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(CILjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method809(char arg0, int arg1, String arg2) {
        ++field1489;
        int var3 = -30 % ((63 - arg1) / 54);
        int var4 = class101.method678(false, arg0, arg2);
        String[] var5 = new String[var4 + 1];
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 0; ~var8 > ~var4; ++var8) {
            int var9;
            for (var9 = var7; arg0 != arg2.charAt(var9); ++var9) {
            }
            var5[var6++] = arg2.substring(var7, var9);
            var7 = var9 + 1;
        }
        var5[var4] = arg2.substring(var7);
        return var5;
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(Lha;B)Lufa;")
    public final class152 method520(class454 arg0, byte arg1) {
        ++field1481;
        if (arg1 < 114) {
            method806(-77);
        }
        return null;
    }

    @OriginalMember(owner = "client!dv", name = "j", descriptor = "(I)I")
    public final int method268(int arg0) {
        ++field1479;
        if (this.field1486.field1929 != null) {
            class155 var2 = this.field1486.method968((byte) -76, class461.field6637);
            if (var2 != null && ~var2.field1968 != 0) {
                return var2.field1968;
            }
        }
        return arg0 != 0 ? -106 : this.field1486.field1968;
    }

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "(B)Z")
    public final boolean method516(byte arg0) {
        ++field1482;
        return arg0 >= -67 ? false : false;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lha;I)Lie;")
    public final class607 method509(class454 arg0, int arg1) {
        ++field1493;
        if (this.field1486 != null && this.method805((byte) -85, 2048, arg0)) {
            if (arg1 != -8964) {
                this.method808(90, -28, (byte) 58);
            }
            class376 var3 = arg0.method114();
            int var4 = super.field336.method2948(25160);
            var3.method1976(var4);
            class73 var5 = class495.field7002[super.field5779][super.field5790 >> class455.field6383][super.field5784 >> class455.field6383];
            if (var5 != null && var5.field966 != null) {
                int var6 = -var5.field966.field4355 + super.field370;
                super.field370 = (int) ((float) super.field370 - (float) var6 / 10.0F);
            } else {
                super.field370 = (int) ((float) super.field370 - (float) super.field370 / 10.0F);
            }
            var3.method1973(super.field5790, super.field5791 + -20 + -super.field370, super.field5784);
            class459 var7 = this.method249(-104);
            class155 var8 = this.field1486.field1929 != null ? this.field1486.method968((byte) -76, class461.field6637) : this.field1486;
            super.field425 = false;
            class607 var9 = null;
            if (class223.field2944.field611.method3531((byte) -127) == 1 && var8.field1938 && var7.field6441) {
                class747 var10 = super.field376 != -1 && ~super.field364 == -1 ? class646.field8903.method643(super.field376, -108) : null;
                class747 var11 = ~super.field332 == 0 || super.field313 && var10 != null ? null : class646.field8903.method643(super.field332, arg1 + 8849);
                class219 var12 = class349.method2045(arg0, 65535 & this.field1486.field1908, super.field325, this.field1486.field1907 & 255, var4, super.field359, var11 != null ? var11 : var10, -8079, super.field429[0], super.field324, var11 == null ? super.field388 : super.field387, this.field1486.field1928, 255 & this.field1486.field1892, 65535 & this.field1486.field1944);
                if (var12 != null) {
                    var9 = class311.method1814(113, super.field429.length + 1, this.method804(28879));
                    super.field425 = true;
                    arg0.method129(false);
                    if (class306.field3936) {
                        var12.method1375(var3, var9.field8425[super.field429.length], class468.field6738, 0);
                    } else {
                        var12.method1351(var3, var9.field8425[super.field429.length], 0);
                    }
                    arg0.method129(true);
                }
            }
            var3.method1976(var4);
            var3.method1973(super.field5790, super.field5791 - (5 - -super.field370), super.field5784);
            if (var9 == null) {
                var9 = class311.method1814(37, super.field429.length, this.method804(28879));
            }
            this.method260(false, super.field429, var3, arg0, arg1 ^ 30334);
            if (!class306.field3936) {
                for (int var13 = 0; ~var13 > ~super.field429.length; ++var13) {
                    if (super.field429[var13] != null) {
                        super.field429[var13].method1351(var3, var9.field8425[var13], 0);
                    }
                }
            } else {
                for (int var14 = 0; ~super.field429.length < ~var14; ++var14) {
                    if (super.field429[var14] != null) {
                        super.field429[var14].method1375(var3, var9.field8425[var14], class468.field6738, 0);
                    }
                }
            }
            if (super.field433 != null) {
                class603 var15 = super.field433.method2540();
                if (!class306.field3936) {
                    arg0.method102(var15);
                } else {
                    arg0.method155(var15, class468.field6738);
                }
            }
            for (int var16 = 0; var16 < super.field429.length; ++var16) {
                if (super.field429[var16] != null) {
                    super.field425 |= super.field429[var16].method1338();
                }
            }
            super.field390 = class710.field9990;
            super.field429[0] = super.field429[1] = super.field429[2] = null;
            return var9;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dv", name = "m", descriptor = "(I)Z")
    public final boolean method810(int arg0) {
        ++field1476;
        if (this.field1486 == null) {
            return false;
        } else {
            if (arg0 != -1) {
                this.method805((byte) 36, -30, (class454) null);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "(I)I")
    public final int method251(int arg0) {
        ++field1483;
        if (this.field1486.field1929 != null) {
            class155 var2 = this.field1486.method968((byte) -76, class461.field6637);
            if (var2 != null && var2.field1902 != -1) {
                return var2.field1902;
            }
        }
        if (arg0 >= -6) {
            field1491 = null;
        }
        return this.field1486.field1902 != -1 ? this.field1486.field1902 : super.method251(-54);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(ZILmb;Lha;III)V")
    public final void method514(boolean arg0, int arg1, class410 arg2, class454 arg3, int arg4, int arg5, int arg6) {
        ++field1490;
        if (arg1 != 12473) {
            field1474 = null;
        }
        throw new IllegalStateException();
    }
}
