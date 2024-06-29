import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class571 extends class335 {

    @OriginalMember(owner = "client!gt", name = "Uc", descriptor = "I")
    public int field8222 = -1;

    @OriginalMember(owner = "client!gt", name = "jd", descriptor = "I")
    public int field8237 = -1;

    @OriginalMember(owner = "client!gt", name = "Yc", descriptor = "Lgr;")
    public static class530 field8226 = new class530(65, -1);

    @OriginalMember(owner = "client!gt", name = "Rc", descriptor = "I")
    public static int field8219;

    @OriginalMember(owner = "client!gt", name = "Sc", descriptor = "I")
    public static int field8220;

    @OriginalMember(owner = "client!gt", name = "Tc", descriptor = "I")
    public static int field8221;

    @OriginalMember(owner = "client!gt", name = "Vc", descriptor = "I")
    public static int field8223;

    @OriginalMember(owner = "client!gt", name = "Wc", descriptor = "I")
    public static int field8224;

    @OriginalMember(owner = "client!gt", name = "Xc", descriptor = "I")
    public static int field8225;

    @OriginalMember(owner = "client!gt", name = "Zc", descriptor = "I")
    public static int field8227;

    @OriginalMember(owner = "client!gt", name = "ad", descriptor = "I")
    public static int field8228;

    @OriginalMember(owner = "client!gt", name = "cd", descriptor = "I")
    public static int field8230;

    @OriginalMember(owner = "client!gt", name = "dd", descriptor = "I")
    public static int field8231;

    @OriginalMember(owner = "client!gt", name = "ed", descriptor = "I")
    public static int field8232;

    @OriginalMember(owner = "client!gt", name = "fd", descriptor = "I")
    public static int field8233;

    @OriginalMember(owner = "client!gt", name = "gd", descriptor = "I")
    public static int field8234;

    @OriginalMember(owner = "client!gt", name = "id", descriptor = "I")
    public static int field8236;

    @OriginalMember(owner = "client!gt", name = "kd", descriptor = "I")
    public static int field8238;

    @OriginalMember(owner = "client!gt", name = "ld", descriptor = "I")
    public static int field8239;

    @OriginalMember(owner = "client!gt", name = "md", descriptor = "I")
    public static int field8240;

    @OriginalMember(owner = "client!gt", name = "nd", descriptor = "I")
    public static int field8241;

    @OriginalMember(owner = "client!gt", name = "od", descriptor = "I")
    public static int field8242;

    @OriginalMember(owner = "client!gt", name = "hd", descriptor = "Lfha;")
    public class521 field8235;

    @OriginalMember(owner = "client!gt", name = "bd", descriptor = "[I")
    public static int[] field8229;

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(BLha;)Lro;", line = 3)
    public final class522 method602(byte arg0, class543 arg1) {
        if (arg0 > -114) {
            return null;
        } else {
            ++field8238;
            return null;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZILha;)Z", line = 19)
    private final boolean method3393(boolean arg0, int arg1, class543 arg2) {
        ++field8224;
        int var4 = arg1;
        class83 var5 = this.method2052(-5569);
        class131 var6 = ~super.field4545 != 0 && ~super.field4535 == -1 ? class610.field8698.method2999(super.field4545, false) : null;
        class131 var7 = super.field4575 == -1 || super.field4595 && var6 != null ? null : class610.field8698.method2999(super.field4575, false);
        int var8 = var5.field1229;
        int var9 = var5.field1232;
        if (var8 != 0 || ~var9 != -1 || var5.field1197 != 0 || var5.field1183 != 0) {
            arg1 |= 7;
        }
        boolean var10 = super.field4633 != 0 && ~class703.field9918 <= ~super.field4581 && super.field4618 > class703.field9918;
        if (var10) {
            arg1 |= 524288;
        }
        if (arg0) {
            return true;
        } else {
            int var11 = super.field4598.method2110(true);
            class282 var12 = super.field4636[0] = this.field8235.method3169(super.field4563, var7, class610.field8698, var6, super.field4605, super.field4551, class306.field4169, super.field4631, arg1, super.field4557, super.field4616, super.field4615, -1, class226.field3372, arg2, var11, super.field4534);
            if (var12 == null) {
                return false;
            } else {
                super.field4620 = var12.method511();
                super.field4565 = var12.method507();
                this.method2055(var12, (byte) -8);
                if (~var8 == -1 && ~var9 == -1) {
                    this.method2063(0, 0, 0, this.method2053(true) << 9, this.method2053(true) << 9, var11);
                } else {
                    this.method2063(0, var5.field1187, var5.field1202, var9, var8, var11);
                    if (~super.field4558 != -1) {
                        super.field4636[0].method500(super.field4558);
                    }
                    if (~super.field4585 != -1) {
                        super.field4636[0].method488(super.field4585);
                    }
                    if (~super.field4583 != -1) {
                        super.field4636[0].method529(0, super.field4583, 0);
                    }
                }
                if (var10) {
                    var12.method524(super.field4549, super.field4619, super.field4614, 255 & super.field4633);
                }
                if (~super.field4547 != 0 && ~super.field4541 != 0) {
                    class365 var13 = class596.field8476.method2263(super.field4547, -108);
                    boolean var14 = ~var13.field5348 == -4 && (~var8 != -1 || var9 != 0);
                    int var15 = var4;
                    if (var14) {
                        var15 = var4 | 7;
                    } else {
                        if (super.field4539 != 0) {
                            var15 = var4 | 5;
                        }
                        if (~super.field4568 != -1) {
                            var15 |= 2;
                        }
                        if (~super.field4546 != -1) {
                            var15 |= 7;
                        }
                    }
                    class282 var16 = super.field4636[1] = var13.method2295(super.field4541, (byte) 111, class610.field8698, super.field4584, var15, arg2, super.field4604);
                    if (var16 != null) {
                        if (~super.field4546 > -1) {
                            if (~super.field4539 != -1) {
                                var16.method541(super.field4539 * 2048);
                            }
                        } else {
                            int var17 = 0;
                            int var18 = 0;
                            int var19 = 0;
                            if (var5.field1237 != null && var5.field1237[super.field4546] != null) {
                                var17 += var5.field1237[super.field4546][0];
                                var19 += var5.field1237[super.field4546][2];
                                var18 += var5.field1237[super.field4546][1];
                            }
                            if (var5.field1188 != null && var5.field1188[super.field4546] != null) {
                                var18 += var5.field1188[super.field4546][1];
                                var17 += var5.field1188[super.field4546][0];
                                var19 += var5.field1188[super.field4546][2];
                            }
                            if (~var19 != -1 || var17 != 0) {
                                int var20 = var11;
                                if (super.field4557 != null && super.field4557[super.field4546] != -1) {
                                    var20 = super.field4557[super.field4546];
                                }
                                int var21 = super.field4539 * 2048 + var20 + -var11 & 16383;
                                if (~var21 != -1) {
                                    var16.method541(var21);
                                }
                                int var22 = class125.field1736[var21];
                                int var23 = class125.field1729[var21];
                                int var24 = var17 * var23 + var19 * var22 >> 14;
                                var19 = var19 * var23 + -(var17 * var22) >> 14;
                                var17 = var24;
                            }
                            var16.method529(var17, var18, var19);
                        }
                        if (super.field4568 != 0) {
                            var16.method529(0, -super.field4568 << 2, 0);
                        }
                        if (var14) {
                            if (super.field4558 != 0) {
                                var16.method500(super.field4558);
                            }
                            if (super.field4585 != 0) {
                                var16.method488(super.field4585);
                            }
                            if (super.field4583 != 0) {
                                var16.method529(0, super.field4583, 0);
                            }
                        }
                    }
                } else {
                    super.field4636[1] = null;
                }
                if (super.field4544 != -1 && ~super.field4600 != 0) {
                    class365 var25 = class596.field8476.method2263(super.field4544, -123);
                    boolean var26 = ~var25.field5348 == -4 && (~var8 != -1 || ~var9 != -1);
                    int var27 = var4;
                    if (!var26) {
                        if (super.field4588 != 0) {
                            var27 = var4 | 5;
                        }
                        if (super.field4624 != 0) {
                            var27 |= 2;
                        }
                        if (~super.field4621 != -1) {
                            var27 |= 7;
                        }
                    } else {
                        var27 = var4 | 7;
                    }
                    class282 var28 = super.field4636[2] = var25.method2300(super.field4623, var27, super.field4600, (byte) -84, super.field4554, class610.field8698, arg2);
                    if (var28 != null) {
                        if (super.field4621 >= 0 && var5.field1237 != null && var5.field1237[super.field4621] != null) {
                            int var29 = 0;
                            int var30 = 0;
                            int var31 = 0;
                            if (var5.field1237 != null && var5.field1237[super.field4621] != null) {
                                var30 += var5.field1237[super.field4621][1];
                                var29 += var5.field1237[super.field4621][0];
                                var31 += var5.field1237[super.field4621][2];
                            }
                            if (var5.field1188 != null && var5.field1188[super.field4621] != null) {
                                var30 += var5.field1188[super.field4621][1];
                                var31 += var5.field1188[super.field4621][2];
                                var29 += var5.field1188[super.field4621][0];
                            }
                            if (~var31 != -1 || var29 != 0) {
                                int var32 = var11;
                                if (super.field4557 != null && ~super.field4557[super.field4621] != 0) {
                                    var32 = super.field4557[super.field4621];
                                }
                                int var33 = 16383 & super.field4588 * 2048 + var32 - var11;
                                if (~var33 != -1) {
                                    var28.method541(var33);
                                }
                                int var34 = class125.field1736[var33];
                                int var35 = class125.field1729[var33];
                                int var36 = var29 * var35 + var31 * var34 >> 14;
                                var31 = var31 * var35 + -(var29 * var34) >> 14;
                                var29 = var36;
                            }
                            var28.method529(var29, var30, var31);
                        } else if (super.field4588 != 0) {
                            var28.method541(super.field4588 * 2048);
                        }
                        if (~super.field4624 != -1) {
                            var28.method529(0, -super.field4624 << 2, 0);
                        }
                        if (var26) {
                            if (super.field4558 != 0) {
                                var28.method500(super.field4558);
                            }
                            if (~super.field4585 != -1) {
                                var28.method488(super.field4585);
                            }
                            if (super.field4583 != 0) {
                                var28.method529(0, super.field4583, 0);
                            }
                        }
                    }
                } else {
                    super.field4636[2] = null;
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "(I)Z", line = 297)
    public final boolean method715(int arg0) {
        if (arg0 != -12888) {
            return false;
        } else {
            ++field8240;
            return false;
        }
    }

    @OriginalMember(owner = "client!gt", name = "m", descriptor = "(I)Z", line = 310)
    public final boolean method3394(int arg0) {
        ++field8232;
        if (this.field8235 == null) {
            return false;
        } else {
            return arg0 <= 3 ? true : true;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lfha;I)V", line = 324)
    public final void method3395(class521 arg0, int arg1) {
        this.field8235 = arg0;
        ++field8225;
        if (super.field4638 != null) {
            super.field4638.method125();
        }
        if (arg1 != 0) {
            this.method3397(-53, 13, -116, 104, false, (byte) 22);
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(B)Z", line = 342)
    private final boolean method3396(byte arg0) {
        ++field8219;
        int var2 = 33 / ((arg0 - 24) / 37);
        return this.field8235.field7541;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(BLha;)Lqs;", line = 352)
    public final class603 method613(byte arg0, class543 arg1) {
        ++field8223;
        if (this.field8235 != null && this.method3393(false, 2048, arg1)) {
            class121 var3 = arg1.method342();
            int var4 = super.field4598.method2110(true);
            var3.method844(var4);
            if (arg0 <= 76) {
                return null;
            } else {
                class375 var5 = class565.field8185[super.field3920][super.field3923 >> class639.field9095][super.field3916 >> class639.field9095];
                if (var5 != null && var5.field5422 != null) {
                    int var6 = -var5.field5422.field9265 + super.field4611;
                    super.field4611 = (int) ((float) super.field4611 - (float) var6 / 10.0F);
                } else {
                    super.field4611 = (int) ((float) super.field4611 - (float) super.field4611 / 10.0F);
                }
                var3.method849(super.field3923, -super.field4611 + -20 + super.field3922, super.field3916);
                class83 var7 = this.method2052(-5569);
                class521 var8 = this.field8235.field7535 == null ? this.field8235 : this.field8235.method3166(class226.field3372, true);
                super.field4639 = false;
                class603 var9 = null;
                if (~class243.field3580.field7994.method2410(false) == -2 && var8.field7538 && var7.field1208) {
                    class131 var10 = ~super.field4545 != 0 && super.field4535 == 0 ? class610.field8698.method2999(super.field4545, false) : null;
                    class131 var11 = ~super.field4575 == 0 || super.field4595 && var10 != null ? null : class610.field8698.method2999(super.field4575, false);
                    class282 var12 = class422.method2585(arg1, this.field8235.field7575 & 255, 65535 & this.field8235.field7580, super.field4583, super.field4558, this.field8235.field7556 & 65535, super.field4585, 96, 255 & this.field8235.field7569, var11 == null ? super.field4605 : super.field4563, super.field4636[0], var4, this.field8235.field7512, var11 == null ? var10 : var11);
                    if (var12 != null) {
                        var9 = class6.method26(this.method3396((byte) 62), 119, super.field4636.length + 1);
                        super.field4639 = true;
                        arg1.method235(false);
                        if (!class100.field1447) {
                            var12.method533(var3, var9.field8543[super.field4636.length], 0);
                        } else {
                            var12.method503(var3, var9.field8543[super.field4636.length], class680.field9660, 0);
                        }
                        arg1.method235(true);
                    }
                }
                var3.method844(var4);
                var3.method849(super.field3923, super.field3922 + -5 - super.field4611, super.field3916);
                if (var9 == null) {
                    var9 = class6.method26(this.method3396((byte) -42), -30, super.field4636.length);
                }
                this.method2068(arg1, false, true, var3, super.field4636);
                if (!class100.field1447) {
                    for (int var13 = 0; ~var13 > ~super.field4636.length; ++var13) {
                        if (super.field4636[var13] != null) {
                            super.field4636[var13].method533(var3, var9.field8543[var13], 0);
                        }
                    }
                } else {
                    for (int var14 = 0; var14 < super.field4636.length; ++var14) {
                        if (super.field4636[var14] != null) {
                            super.field4636[var14].method503(var3, var9.field8543[var14], class680.field9660, 0);
                        }
                    }
                }
                if (super.field4638 != null) {
                    class458 var15 = super.field4638.method127();
                    if (class100.field1447) {
                        arg1.method216(var15, class680.field9660);
                    } else {
                        arg1.method214(var15);
                    }
                }
                for (int var16 = 0; var16 < super.field4636.length; ++var16) {
                    if (super.field4636[var16] != null) {
                        super.field4639 |= super.field4636[var16].method497();
                    }
                }
                super.field4562 = class444.field6347;
                super.field4636[0] = super.field4636[1] = super.field4636[2] = null;
                return var9;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(Z)I", line = 482)
    public final int method1582(boolean arg0) {
        if (!arg0) {
            this.method594(43, -1, 78, (class543) null);
        }
        ++field8221;
        return this.field8235 == null ? 0 : this.field8235.field7542;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIZB)V", line = 498)
    public final void method3397(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5) {
        ++field8227;
        super.field3920 = super.field3924 = (byte) arg1;
        if (arg5 <= -76) {
            if (class547.method3292((byte) -126, arg0, arg2)) {
                ++super.field3924;
            }
            if (~super.field4545 != 0 && class610.field8698.method2999(super.field4545, false).field1788 == 1) {
                super.field4564 = null;
                super.field4545 = -1;
            }
            if (~super.field4547 != 0) {
                class365 var7 = class596.field8476.method2263(super.field4547, -107);
                if (var7.field5345 && var7.field5332 != -1 && class610.field8698.method2999(var7.field5332, false).field1788 == 1) {
                    super.field4547 = -1;
                }
            }
            if (super.field4544 != -1) {
                class365 var8 = class596.field8476.method2263(super.field4544, -113);
                if (var8.field5345 && ~var8.field5332 != 0 && ~class610.field8698.method2999(var8.field5332, false).field1788 == -2) {
                    super.field4544 = -1;
                }
            }
            if (!arg4) {
                int var9 = arg2 - super.field4646[0];
                int var10 = -super.field4645[0] + arg0;
                if (var9 >= -8 && ~var9 >= -9 && var10 >= -8 && var10 <= 8) {
                    if (~super.field4637 > -10) {
                        ++super.field4637;
                    }
                    for (int var11 = super.field4637; var11 > 0; --var11) {
                        super.field4646[var11] = super.field4646[var11 + -1];
                        super.field4645[var11] = super.field4645[var11 + -1];
                        super.field4642[var11] = super.field4642[var11 + -1];
                    }
                    super.field4646[0] = arg2;
                    super.field4645[0] = arg0;
                    super.field4642[0] = 1;
                    return;
                }
            }
            super.field4641 = 0;
            super.field4637 = 0;
            super.field4643 = 0;
            super.field4646[0] = arg2;
            super.field4645[0] = arg0;
            super.field3916 = (super.field4645[0] << 9) + (arg3 << 8);
            super.field3923 = (super.field4646[0] << 9) - -(arg3 << 8);
            if (super.field4638 != null) {
                super.field4638.method125();
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "(I)V", line = 584)
    public final void method713(int arg0) {
        if (arg0 == -16221) {
            ++field8242;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "(I)I", line = 599)
    public final int method2057(int arg0) {
        ++field8233;
        if (this.field8235.field7535 != null) {
            class521 var2 = this.field8235.method3166(class226.field3372, true);
            if (var2 != null && ~var2.field7563 != 0) {
                return var2.field7563;
            }
        }
        if (arg0 != 0) {
            field8229 = null;
        }
        return this.field8235.field7563 == -1 ? super.method2057(arg0) : this.field8235.field7563;
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(III)V", line = 621)
    public final void method3398(int arg0, int arg1, int arg2) {
        ++field8239;
        int var4 = super.field4646[0];
        int var5 = super.field4645[0];
        if (~arg1 == -1) {
            ++var5;
        }
        if (arg1 == 1) {
            ++var4;
            ++var5;
        }
        if (~arg1 == -3) {
            ++var4;
        }
        if (arg1 == 3) {
            ++var4;
            --var5;
        }
        if (~arg1 == -5) {
            --var5;
        }
        if (~arg1 == -6) {
            --var4;
            --var5;
        }
        if (~arg1 == -7) {
            --var4;
        }
        if (super.field4545 != -1 && ~class610.field8698.method2999(super.field4545, false).field1788 == -2) {
            super.field4545 = -1;
            super.field4564 = null;
        }
        if (~arg1 == -8) {
            ++var5;
            --var4;
        }
        if (~super.field4547 != 0) {
            class365 var6 = class596.field8476.method2263(super.field4547, -124);
            if (var6.field5345 && ~var6.field5332 != 0 && ~class610.field8698.method2999(var6.field5332, false).field1788 == -2) {
                super.field4547 = -1;
            }
        }
        if (super.field4544 != -1) {
            class365 var7 = class596.field8476.method2263(super.field4544, arg2 ^ -28103);
            if (var7.field5345 && var7.field5332 != -1 && class610.field8698.method2999(var7.field5332, false).field1788 == 1) {
                super.field4544 = -1;
            }
        }
        if (~super.field4637 > -10) {
            ++super.field4637;
        }
        for (int var8 = super.field4637; ~var8 < -1; --var8) {
            super.field4646[var8] = super.field4646[var8 + -1];
            super.field4645[var8] = super.field4645[var8 + -1];
            super.field4642[var8] = super.field4642[var8 + -1];
        }
        if (arg2 != 28092) {
            this.field8235 = null;
        }
        super.field4646[0] = var4;
        super.field4642[0] = (byte) arg0;
        super.field4645[0] = var5;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjw;Lha;BIZI)V", line = 722)
    public final void method711(int arg0, class280 arg1, class543 arg2, byte arg3, int arg4, boolean arg5, int arg6) {
        if (arg3 <= 28) {
            this.field8235 = null;
        }
        ++field8228;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIILha;)Z", line = 733)
    public final boolean method594(int arg0, int arg1, int arg2, class543 arg3) {
        ++field8236;
        if (this.field8235 != null && this.method3393(false, 131072, arg3)) {
            class121 var5 = arg3.method342();
            int var6 = super.field4598.method2110(true);
            var5.method844(var6);
            var5.method849(super.field3923, super.field3922, super.field3916);
            boolean var7 = false;
            for (int var8 = 0; var8 < super.field4636.length; ++var8) {
                if (super.field4636[var8] != null) {
                    boolean var10000;
                    label43: {
                        if (this.field8235.field7542 <= 0) {
                            label41: {
                                if (this.field8235.field7551 != -1) {
                                    if (~this.field8235.field7551 == -2) {
                                        break label41;
                                    }
                                    var10000 = false;
                                } else {
                                    if (~this.field8235.field7512 == -2) {
                                        break label41;
                                    }
                                    var10000 = false;
                                }
                                if (!var10000) {
                                    var10000 = false;
                                    break label43;
                                }
                            }
                        }
                        var10000 = true;
                    }
                    boolean var9 = var10000;
                    boolean var10;
                    if (!class100.field1447) {
                        var10 = super.field4636[var8].method496(arg1, arg0, var5, var9, this.field8235.field7542);
                    } else {
                        var10 = super.field4636[var8].method538(arg1, arg0, var5, var9, this.field8235.field7542, class680.field9660);
                    }
                    if (var10) {
                        var7 = true;
                        break;
                    }
                }
            }
            super.field4636[0] = super.field4636[arg2] = super.field4636[2] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(BLha;)V", line = 788)
    public final void method610(byte arg0, class543 arg1) {
        ++field8231;
        if (this.field8235 != null) {
            if (super.field4640 || this.method3393(false, 0, arg1)) {
                class121 var3 = arg1.method342();
                var3.method844(super.field4598.method2110(true));
                if (arg0 <= 51) {
                    this.method602((byte) 12, (class543) null);
                }
                var3.method849(super.field3923, super.field3922 + -20, super.field3916);
                this.method2068(arg1, super.field4640, true, var3, super.field4636);
                super.field4636[0] = super.field4636[1] = super.field4636[2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lqk;ILqk;)V", line = 816)
    public static final void method3399(class146 arg0, int arg1, class146 arg2) {
        ++field8241;
        ++class391.field5629;
        class88 var3 = class448.method2741((byte) 77, class648.field9335, class583.field8319);
        var3.field1260.method2926((byte) -126, arg0.field2079);
        var3.field1260.method2887(arg0.field2131, (byte) -35);
        var3.field1260.method2887(arg2.field2131, (byte) -98);
        if (arg1 != -1) {
            field8229 = null;
        }
        var3.field1260.method2862(arg2.field2010, -1166933656);
        var3.field1260.method2863(arg0.field2010, (byte) 32);
        var3.field1260.method2927((byte) -54, arg2.field2079);
        class523.method3183(var3, (byte) 31);
    }

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "(Z)I", line = 837)
    public final int method2058(boolean arg0) {
        ++field8230;
        if (arg0) {
            return -66;
        } else {
            if (this.field8235.field7535 != null) {
                class521 var2 = this.field8235.method3166(class226.field3372, true);
                if (var2 != null && var2.field7547 != -1) {
                    return var2.field7547;
                }
            }
            return this.field8235.field7547;
        }
    }

    @OriginalMember(owner = "client!gt", name = "k", descriptor = "(I)I", line = 861)
    public final int method2064(int arg0) {
        ++field8220;
        if (arg0 < 46) {
            field8234 = 95;
        }
        if (this.field8235.field7535 != null) {
            class521 var2 = this.field8235.method3166(class226.field3372, true);
            if (var2 != null && var2.field7552 != -1) {
                return var2.field7552;
            }
        }
        return this.field8235.field7552;
    }

    @OriginalMember(owner = "client!gt", name = "n", descriptor = "(I)V", line = 886)
    public static void method3400(int arg0) {
        if (arg0 != 0) {
            field8234 = 113;
        }
        field8229 = null;
        field8226 = null;
    }
}
