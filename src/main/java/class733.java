import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class733 extends class13 {

    @OriginalMember(owner = "client!cc", name = "pd", descriptor = "I")
    public int field10198 = 1;

    @OriginalMember(owner = "client!cc", name = "sd", descriptor = "I")
    public int field10201 = 1;

    @OriginalMember(owner = "client!cc", name = "ud", descriptor = "I")
    public int field10203 = -1;

    @OriginalMember(owner = "client!cc", name = "id", descriptor = "I")
    public int field10191 = -1;

    @OriginalMember(owner = "client!cc", name = "rd", descriptor = "Lkg;")
    public static class275 field10200 = new class275(63, 7);

    @OriginalMember(owner = "client!cc", name = "xd", descriptor = "I")
    public static int field10206 = 0;

    @OriginalMember(owner = "client!cc", name = "hd", descriptor = "I")
    public static int field10190;

    @OriginalMember(owner = "client!cc", name = "kd", descriptor = "I")
    public static int field10193;

    @OriginalMember(owner = "client!cc", name = "ld", descriptor = "I")
    public static int field10194;

    @OriginalMember(owner = "client!cc", name = "md", descriptor = "I")
    public static int field10195;

    @OriginalMember(owner = "client!cc", name = "nd", descriptor = "I")
    public static int field10196;

    @OriginalMember(owner = "client!cc", name = "od", descriptor = "I")
    public static int field10197;

    @OriginalMember(owner = "client!cc", name = "qd", descriptor = "I")
    public static int field10199;

    @OriginalMember(owner = "client!cc", name = "td", descriptor = "I")
    public static int field10202;

    @OriginalMember(owner = "client!cc", name = "vd", descriptor = "I")
    public int field10204;

    @OriginalMember(owner = "client!cc", name = "wd", descriptor = "I")
    public static int field10205;

    @OriginalMember(owner = "client!cc", name = "yd", descriptor = "I")
    public static int field10207;

    @OriginalMember(owner = "client!cc", name = "zd", descriptor = "I")
    public static int field10208;

    @OriginalMember(owner = "client!cc", name = "Ad", descriptor = "I")
    public static int field10209;

    @OriginalMember(owner = "client!cc", name = "Bd", descriptor = "I")
    public static int field10210;

    @OriginalMember(owner = "client!cc", name = "Cd", descriptor = "I")
    public static int field10211;

    @OriginalMember(owner = "client!cc", name = "Dd", descriptor = "I")
    public static int field10212;

    @OriginalMember(owner = "client!cc", name = "Ed", descriptor = "I")
    public static int field10213;

    @OriginalMember(owner = "client!cc", name = "Fd", descriptor = "I")
    public static int field10214;

    @OriginalMember(owner = "client!cc", name = "Hd", descriptor = "I")
    public static int field10216;

    @OriginalMember(owner = "client!cc", name = "Id", descriptor = "I")
    public static int field10217;

    @OriginalMember(owner = "client!cc", name = "jd", descriptor = "Lfg;")
    public class131 field10192;

    @OriginalMember(owner = "client!cc", name = "Gd", descriptor = "Llba;")
    public class552 field10215;

    @OriginalMember(owner = "client!cc", name = "gd", descriptor = "Ljava/lang/String;")
    public String field10189;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)V", line = 3)
    public final void method4088(int arg0, int arg1, int arg2) {
        ++field10217;
        int var4 = super.field264[0];
        int var5 = super.field260[0];
        if (arg1 == 0) {
            ++var5;
        }
        if (~arg1 == -2) {
            ++var4;
            ++var5;
        }
        if (arg1 == 2) {
            ++var4;
        }
        if (~arg1 == -4) {
            --var5;
            ++var4;
        }
        if (~arg1 == -5) {
            --var5;
        }
        int var6 = -66 % ((arg2 - 6) / 63);
        if (arg1 == 5) {
            --var5;
            --var4;
        }
        if (~arg1 == -7) {
            --var4;
        }
        if (~super.field153 != 0 && ~class66.field941.method1299((byte) -111, super.field153).field778 == -2) {
            super.field165 = null;
            super.field153 = -1;
        }
        if (arg1 == 7) {
            --var4;
            ++var5;
        }
        if (~super.field160 != 0) {
            class164 var7 = class234.field3057.method2095(super.field160, (byte) -9);
            if (var7.field2267 && ~var7.field2276 != 0 && class66.field941.method1299((byte) -85, var7.field2276).field778 == 1) {
                super.field160 = -1;
            }
        }
        if (super.field199 != -1) {
            class164 var8 = class234.field3057.method2095(super.field199, (byte) 107);
            if (var8.field2267 && ~var8.field2276 != 0 && ~class66.field941.method1299((byte) -84, var8.field2276).field778 == -2) {
                super.field199 = -1;
            }
        }
        if (super.field263 < 9) {
            ++super.field263;
        }
        for (int var9 = super.field263; var9 > 0; --var9) {
            super.field264[var9] = super.field264[var9 + -1];
            super.field260[var9] = super.field260[var9 + -1];
            super.field259[var9] = super.field259[var9 + -1];
        }
        super.field264[0] = var4;
        super.field259[0] = (byte) arg0;
        super.field260[0] = var5;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lha;I)V", line = 103)
    public final void method744(class60 arg0, int arg1) {
        ++field10214;
        if (this.field10192 != null) {
            if (super.field262 || this.method4094(114, arg0, 0)) {
                class631 var3 = arg0.method531();
                var3.method598(super.field256.method1044((byte) 19));
                var3.method600(super.field5801, super.field5800 - 20, super.field5797);
                this.method93(arg0, arg1, super.field267, super.field262, var3);
                super.field267[arg1] = super.field267[1] = super.field267[2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 134)
    public static final String method4089(long arg0, int arg1) {
        ++field10207;
        class180.field2519.setTime(new Date(arg0));
        int var3 = class180.field2519.get(7);
        if (arg1 != 23482) {
            method4089(125L, -8);
        }
        int var4 = class180.field2519.get(5);
        int var5 = class180.field2519.get(2);
        int var6 = class180.field2519.get(1);
        int var7 = class180.field2519.get(11);
        int var8 = class180.field2519.get(12);
        int var9 = class180.field2519.get(13);
        return class103.field1419[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + class282.field3551[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)I", line = 160)
    public final int method78(byte arg0) {
        ++field10208;
        if (this.field10192.field1899 != null) {
            class131 var2 = this.field10192.method981(-109, class516.field7236);
            if (var2 != null && ~var2.field1908 != 0) {
                return var2.field1908;
            }
        }
        int var3 = -94 % ((-55 - arg0) / 41);
        return ~this.field10192.field1908 != 0 ? this.field10192.field1908 : super.method78((byte) -96);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lha;I)Ljk;", line = 181)
    public final class635 method755(class60 arg0, int arg1) {
        ++field10213;
        if (this.field10192 != null && this.method4094(102, arg0, 2048)) {
            class631 var3 = arg0.method531();
            int var4 = super.field256.method1044((byte) 19);
            var3.method598(var4);
            class14 var5 = class197.field2689[super.field5796][super.field5801 >> class480.field6531][super.field5797 >> class480.field6531];
            if (var5 != null && var5.field279 != null) {
                int var6 = super.field191 - var5.field279.field1737;
                super.field191 = (int) ((float) super.field191 - (float) var6 / 10.0F);
            } else {
                super.field191 = (int) ((float) super.field191 - (float) super.field191 / 10.0F);
            }
            var3.method600(super.field5801, super.field5800 + -20 + -super.field191, super.field5797);
            class738 var7 = this.method94((byte) 53);
            class131 var8 = this.field10192.field1899 == null ? this.field10192 : this.field10192.method981(-126, class516.field7236);
            super.field269 = false;
            class635 var9 = null;
            if (class748.field10451.field10406.method3611((byte) 56) == 1 && var8.field1869 && var7.field10281) {
                class56 var10 = super.field153 != -1 && ~super.field171 == -1 ? class66.field941.method1299((byte) -114, super.field153) : null;
                class56 var11 = super.field215 == -1 || super.field239 && var10 != null ? null : class66.field941.method1299((byte) -89, super.field215);
                class474 var12 = class694.method3885(super.field267[0], var4, 65535 & this.field10192.field1912, super.field205, this.field10192.field1872 & 255, var11 == null ? var10 : var11, var11 == null ? super.field198 : super.field168, super.field244, arg0, false, this.field10192.field1918, this.field10192.field1857 & 255, 65535 & this.field10192.field1907, super.field200);
                if (var12 != null) {
                    var9 = class510.method2982(this.method4093((byte) -128), 0, super.field267.length + 1);
                    super.field269 = true;
                    arg0.method504(false);
                    if (class232.field3053) {
                        var12.method255(var3, var9.field8760[super.field267.length], class286.field3600, 0);
                    } else {
                        var12.method250(var3, var9.field8760[super.field267.length], 0);
                    }
                    arg0.method504(true);
                }
            }
            var3.method598(var4);
            var3.method600(super.field5801, super.field5800 + -5 + -super.field191, super.field5797);
            if (var9 == null) {
                var9 = class510.method2982(this.method4093((byte) 73), 0, super.field267.length);
            }
            this.method93(arg0, 0, super.field267, false, var3);
            if (class232.field3053) {
                for (int var13 = 0; ~var13 > ~super.field267.length; ++var13) {
                    if (super.field267[var13] != null) {
                        super.field267[var13].method255(var3, var9.field8760[var13], class286.field3600, 0);
                    }
                }
            } else {
                for (int var14 = 0; ~super.field267.length < ~var14; ++var14) {
                    if (super.field267[var14] != null) {
                        super.field267[var14].method250(var3, var9.field8760[var14], 0);
                    }
                }
            }
            if (super.field261 != null) {
                class741 var15 = super.field261.method2969();
                if (class232.field3053) {
                    arg0.method545(var15, class286.field3600);
                } else {
                    arg0.method455(var15);
                }
            }
            for (int var16 = 0; super.field267.length > var16; ++var16) {
                if (super.field267[var16] != null) {
                    super.field269 |= super.field267[var16].method287();
                }
            }
            int var17 = 44 % ((arg1 - -39) / 55);
            super.field267[0] = super.field267[1] = super.field267[2] = null;
            super.field230 = class762.field10618;
            return var9;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)I", line = 310)
    public final int method96(boolean arg0) {
        ++field10193;
        if (this.field10192.field1899 != null) {
            class131 var2 = this.field10192.method981(53, class516.field7236);
            if (var2 != null && ~var2.field1895 != 0) {
                return var2.field1895;
            }
        }
        return !arg0 ? -12 : this.field10192.field1895;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lfg;I)V", line = 331)
    public final void method4090(class131 arg0, int arg1) {
        ++field10205;
        this.field10192 = arg0;
        if (this.field10192 != null) {
            this.field10204 = this.field10192.field1898;
            this.field10189 = this.field10192.field1851;
        }
        if (super.field261 != null) {
            super.field261.method2976();
        }
        if (arg1 != 0) {
            this.field10203 = 112;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZIIIB)V", line = 356)
    public final void method4091(int arg0, boolean arg1, int arg2, int arg3, int arg4, byte arg5) {
        ++field10216;
        if (arg5 < 36) {
            this.method755((class60) null, -102);
        }
        super.field5796 = super.field5793 = (byte) arg3;
        if (class99.method797(arg4, 1, arg2)) {
            ++super.field5793;
        }
        if (super.field153 != -1 && ~class66.field941.method1299((byte) -76, super.field153).field778 == -2) {
            super.field153 = -1;
            super.field165 = null;
        }
        if (super.field160 != -1) {
            class164 var7 = class234.field3057.method2095(super.field160, (byte) -7);
            if (var7.field2267 && var7.field2276 != -1 && ~class66.field941.method1299((byte) -94, var7.field2276).field778 == -2) {
                super.field160 = -1;
            }
        }
        if (super.field199 != -1) {
            class164 var8 = class234.field3057.method2095(super.field199, (byte) 26);
            if (var8.field2267 && ~var8.field2276 != 0 && class66.field941.method1299((byte) -83, var8.field2276).field778 == 1) {
                super.field199 = -1;
            }
        }
        if (!arg1) {
            int var9 = -super.field264[0] + arg2;
            int var10 = -super.field260[0] + arg4;
            if (~var9 <= 7 && var9 <= 8 && ~var10 <= 7 && ~var10 >= -9) {
                if (super.field263 < 9) {
                    ++super.field263;
                }
                for (int var11 = super.field263; ~var11 < -1; --var11) {
                    super.field264[var11] = super.field264[var11 + -1];
                    super.field260[var11] = super.field260[var11 + -1];
                    super.field259[var11] = super.field259[var11 - 1];
                }
                super.field264[0] = arg2;
                super.field259[0] = 1;
                super.field260[0] = arg4;
                return;
            }
        }
        super.field266 = 0;
        super.field264[0] = arg2;
        super.field263 = 0;
        super.field268 = 0;
        super.field260[0] = arg4;
        super.field5797 = (super.field260[0] << 9) + (arg0 << 8);
        super.field5801 = (super.field264[0] << 9) + (arg0 << 8);
        if (super.field261 != null) {
            super.field261.method2976();
        }
    }

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "(I)V", line = 447)
    public static void method4092(int arg0) {
        if (arg0 != -1) {
            field10200 = null;
        }
        field10200 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)I", line = 468)
    public final int method79(int arg0) {
        ++field10209;
        if (this.field10192.field1899 != null) {
            class131 var2 = this.field10192.method981(85, class516.field7236);
            if (var2 != null && var2.field1915 != -1) {
                return var2.field1915;
            }
        }
        if (arg0 != -1) {
            this.field10201 = 70;
        }
        return this.field10192.field1915;
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(ILha;)Lwg;", line = 493)
    public final class428 method750(int arg0, class60 arg1) {
        ++field10190;
        if (arg0 > -22) {
            this.method755((class60) null, -114);
        }
        return null;
    }

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "(B)Z", line = 504)
    private final boolean method4093(byte arg0) {
        int var2 = -94 / ((-79 - arg0) / 34);
        ++field10202;
        return this.field10192.field1881;
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(B)V", line = 517)
    public final void method749(byte arg0) {
        if (arg0 >= -41) {
            this.field10192 = null;
        }
        ++field10196;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILrba;Lha;ZII)V", line = 531)
    public final void method754(int arg0, int arg1, class435 arg2, class60 arg3, boolean arg4, int arg5, int arg6) {
        ++field10194;
        if (arg0 == 30558) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILha;I)Z", line = 542)
    private final boolean method4094(int arg0, class60 arg1, int arg2) {
        ++field10199;
        int var4 = arg2;
        class738 var5 = this.method94((byte) 78);
        class56 var6 = super.field153 != -1 && super.field171 == 0 ? class66.field941.method1299((byte) -93, super.field153) : null;
        class56 var7 = super.field215 == -1 || super.field239 && var6 != null ? null : class66.field941.method1299((byte) -99, super.field215);
        int var8 = var5.field10270;
        int var9 = var5.field10272;
        if (var8 != 0 || var9 != 0 || var5.field10274 != 0 || var5.field10269 != 0) {
            arg2 |= 7;
        }
        int var10 = 113 % ((arg0 - -39) / 54);
        boolean var11 = ~super.field219 != -1 && class463.field6224 >= super.field217 && class463.field6224 < super.field222;
        if (var11) {
            arg2 |= 524288;
        }
        int var12 = super.field256.method1044((byte) 19);
        class474 var13 = super.field267[0] = this.field10192.method976(this.field10215, (byte) 28, var12, var7, super.field216, class729.field10151, arg2, class516.field7236, class66.field941, super.field168, super.field202, super.field248, var6, super.field243, super.field251, arg1, super.field198, super.field207);
        if (var13 == null) {
            return false;
        } else {
            super.field245 = var13.method286();
            super.field218 = var13.method248();
            this.method89(var13, -49);
            if (var8 == 0 && var9 == 0) {
                this.method91(0, var12, -309283474, this.method82((byte) 49) << 9, 0, this.method82((byte) 49) << 9);
            } else {
                this.method91(var5.field10263, var12, -309283474, var8, var5.field10260, var9);
                if (~super.field205 != -1) {
                    super.field267[0].method257(super.field205);
                }
                if (~super.field244 != -1) {
                    super.field267[0].method276(super.field244);
                }
                if (super.field200 != 0) {
                    super.field267[0].method281(0, super.field200, 0);
                }
            }
            if (var11) {
                var13.method260(super.field156, super.field161, super.field151, 255 & super.field219);
            }
            if (~super.field160 != 0 && ~super.field220 != 0) {
                class164 var14 = class234.field3057.method2095(super.field160, (byte) 47);
                boolean var15 = var14.field2269 == 3 && (~var8 != -1 || var9 != 0);
                int var16 = var4;
                if (var15) {
                    var16 = var4 | 7;
                } else {
                    if (~super.field158 != -1) {
                        var16 = var4 | 5;
                    }
                    if (~super.field163 != -1) {
                        var16 |= 2;
                    }
                    if (~super.field175 <= -1) {
                        var16 |= 7;
                    }
                }
                class474 var17 = super.field267[1] = var14.method1145(super.field220, -8013, var16, super.field255, arg1, class66.field941, super.field178);
                if (var17 != null) {
                    if (super.field175 < 0) {
                        if (~super.field158 != -1) {
                            var17.method270(super.field158 * 2048);
                        }
                    } else {
                        int var18 = 0;
                        int var19 = 0;
                        int var20 = 0;
                        if (var5.field10290 != null && var5.field10290[super.field175] != null) {
                            var18 += var5.field10290[super.field175][0];
                            var20 += var5.field10290[super.field175][2];
                            var19 += var5.field10290[super.field175][1];
                        }
                        if (var5.field10240 != null && var5.field10240[super.field175] != null) {
                            var20 += var5.field10240[super.field175][2];
                            var19 += var5.field10240[super.field175][1];
                            var18 += var5.field10240[super.field175][0];
                        }
                        if (~var20 != -1 || ~var18 != -1) {
                            int var21 = var12;
                            if (super.field207 != null && super.field207[super.field175] != -1) {
                                var21 = super.field207[super.field175];
                            }
                            int var22 = super.field158 * 2048 + var21 + -var12 & 16383;
                            if (~var22 != -1) {
                                var17.method270(var22);
                            }
                            int var23 = class16.field320[var22];
                            int var24 = class16.field322[var22];
                            int var25 = var18 * var24 + var20 * var23 >> 14;
                            var20 = var20 * var24 + -(var18 * var23) >> 14;
                            var18 = var25;
                        }
                        var17.method281(var18, var19, var20);
                    }
                    if (~super.field163 != -1) {
                        var17.method281(0, -super.field163 << 2, 0);
                    }
                    if (var15) {
                        if (super.field205 != 0) {
                            var17.method257(super.field205);
                        }
                        if (~super.field244 != -1) {
                            var17.method276(super.field244);
                        }
                        if (~super.field200 != -1) {
                            var17.method281(0, super.field200, 0);
                        }
                    }
                }
            } else {
                super.field267[1] = null;
            }
            if (super.field199 != -1 && super.field167 != -1) {
                class164 var26 = class234.field3057.method2095(super.field199, (byte) 3);
                boolean var27 = ~var26.field2269 == -4 && (var8 != 0 || ~var9 != -1);
                int var28 = var4;
                if (!var27) {
                    if (super.field173 != 0) {
                        var28 = var4 | 5;
                    }
                    if (super.field212 != 0) {
                        var28 |= 2;
                    }
                    if (super.field184 >= 0) {
                        var28 |= 7;
                    }
                } else {
                    var28 = var4 | 7;
                }
                class474 var29 = super.field267[2] = var26.method1144((byte) 5, super.field193, super.field167, class66.field941, super.field252, var28, arg1);
                if (var29 != null) {
                    if (~super.field184 <= -1 && var5.field10290 != null && var5.field10290[super.field184] != null) {
                        int var30 = 0;
                        int var31 = 0;
                        int var32 = 0;
                        if (var5.field10290 != null && var5.field10290[super.field184] != null) {
                            var31 += var5.field10290[super.field184][1];
                            var32 += var5.field10290[super.field184][2];
                            var30 += var5.field10290[super.field184][0];
                        }
                        if (var5.field10240 != null && var5.field10240[super.field184] != null) {
                            var30 += var5.field10240[super.field184][0];
                            var31 += var5.field10240[super.field184][1];
                            var32 += var5.field10240[super.field184][2];
                        }
                        if (~var32 != -1 || ~var30 != -1) {
                            int var33 = var12;
                            if (super.field207 != null && super.field207[super.field184] != -1) {
                                var33 = super.field207[super.field184];
                            }
                            int var34 = super.field173 * 2048 + -var12 + var33 & 16383;
                            if (var34 != 0) {
                                var29.method270(var34);
                            }
                            int var35 = class16.field320[var34];
                            int var36 = class16.field322[var34];
                            int var37 = var30 * var36 + var32 * var35 >> 14;
                            var32 = var32 * var36 - var30 * var35 >> 14;
                            var30 = var37;
                        }
                        var29.method281(var30, var31, var32);
                    } else if (~super.field173 != -1) {
                        var29.method270(super.field173 * 2048);
                    }
                    if (super.field212 != 0) {
                        var29.method281(0, -super.field212 << 2, 0);
                    }
                    if (var27) {
                        if (super.field205 != 0) {
                            var29.method257(super.field205);
                        }
                        if (~super.field244 != -1) {
                            var29.method276(super.field244);
                        }
                        if (super.field200 != 0) {
                            var29.method281(0, super.field200, 0);
                        }
                    }
                }
            } else {
                super.field267[2] = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BILha;I)Z", line = 823)
    public final boolean method752(byte arg0, int arg1, class60 arg2, int arg3) {
        ++field10212;
        if (this.field10192 != null && this.method4094(65, arg2, 131072)) {
            class631 var5 = arg2.method531();
            int var6 = super.field256.method1044((byte) 19);
            var5.method598(var6);
            var5.method600(super.field5801, super.field5800, super.field5797);
            boolean var7 = false;
            if (arg0 > -41) {
                this.method4094(-56, (class60) null, -102);
            }
            for (int var8 = 0; var8 < super.field267.length; ++var8) {
                if (super.field267[var8] != null) {
                    boolean var10000;
                    label47: {
                        if (this.field10192.field1846 <= 0) {
                            label45: {
                                if (~this.field10192.field1879 == 0) {
                                    if (this.field10192.field1918 == 1) {
                                        break label45;
                                    }
                                    var10000 = false;
                                } else {
                                    if (this.field10192.field1879 == 1) {
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
                    if (!class232.field3053) {
                        var10 = super.field267[var8].method258(arg1, arg3, var5, var9, this.field10192.field1846);
                    } else {
                        var10 = super.field267[var8].method275(arg1, arg3, var5, var9, this.field10192.field1846, class286.field3600);
                    }
                    if (var10) {
                        var7 = true;
                        break;
                    }
                }
            }
            super.field267[0] = super.field267[1] = super.field267[2] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)I", line = 878)
    public final int method2066(byte arg0) {
        if (arg0 != -118) {
            this.method759(70);
        }
        ++field10210;
        return this.field10192 == null ? 0 : this.field10192.field1846;
    }

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "(B)Z", line = 893)
    public final boolean method4095(byte arg0) {
        ++field10197;
        if (this.field10192 == null) {
            return false;
        } else {
            if (arg0 != 114) {
                this.method96(true);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)Z", line = 914)
    public final boolean method759(int arg0) {
        ++field10211;
        if (arg0 != 0) {
            method4092(-105);
        }
        return false;
    }
}
