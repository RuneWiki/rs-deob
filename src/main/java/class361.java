import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class361 extends class418 {

    @OriginalMember(owner = "client!wg", name = "hc", descriptor = "I")
    public int field4954 = -1;

    @OriginalMember(owner = "client!wg", name = "zc", descriptor = "I")
    public int field4972 = -1;

    @OriginalMember(owner = "client!wg", name = "tc", descriptor = "J")
    public static long field4966 = 0L;

    @OriginalMember(owner = "client!wg", name = "vc", descriptor = "Llk;")
    public static class392 field4968 = class22.method156(-1);

    @OriginalMember(owner = "client!wg", name = "Ac", descriptor = "I")
    public static int field4973 = 0;

    @OriginalMember(owner = "client!wg", name = "Dc", descriptor = "I")
    public static int field4976 = 0;

    @OriginalMember(owner = "client!wg", name = "Bc", descriptor = "I")
    public static int field4974 = -1;

    @OriginalMember(owner = "client!wg", name = "Ec", descriptor = "Z")
    public static boolean field4977 = false;

    @OriginalMember(owner = "client!wg", name = "Cc", descriptor = "[Lml;")
    public static class21[] field4975 = new class21[0];

    @OriginalMember(owner = "client!wg", name = "Gc", descriptor = "I")
    public static int field4979 = -1;

    @OriginalMember(owner = "client!wg", name = "ec", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!wg", name = "gc", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!wg", name = "ic", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!wg", name = "jc", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!wg", name = "kc", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!wg", name = "lc", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!wg", name = "mc", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!wg", name = "nc", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!wg", name = "oc", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!wg", name = "pc", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!wg", name = "qc", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!wg", name = "rc", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!wg", name = "sc", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!wg", name = "uc", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!wg", name = "wc", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!wg", name = "xc", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!wg", name = "yc", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!wg", name = "Fc", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!wg", name = "fc", descriptor = "Lkc;")
    public class37 field4952;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(III)V", line = 3)
    public final void method2215(int arg0, int arg1, int arg2) {
        ++field4965;
        int var4 = super.field5811[0];
        int var5 = super.field5807[0];
        if (arg2 == 0) {
            ++var5;
        }
        if (~arg2 == -2) {
            ++var4;
            ++var5;
        }
        if (arg2 == 2) {
            ++var4;
        }
        if (~arg2 == -4) {
            ++var4;
            --var5;
        }
        if (arg0 < 43) {
            method2219((byte) -48);
        }
        if (~arg2 == -5) {
            --var5;
        }
        if (arg2 == 5) {
            --var4;
            --var5;
        }
        if (~arg2 == -7) {
            --var4;
        }
        if (super.field5742 != -1 && class386.field5289.method1856(38, super.field5742).field4291 == 1) {
            super.field5742 = -1;
        }
        if (~arg2 == -8) {
            ++var5;
            --var4;
        }
        if (~super.field5759 != 0) {
            class217 var6 = class371.field5108.method1664(super.field5759, -122);
            if (var6.field3128 && var6.field3129 != -1 && ~class386.field5289.method1856(60, var6.field3129).field4291 == -2) {
                super.field5759 = -1;
            }
        }
        if (super.field5810 < 9) {
            ++super.field5810;
        }
        for (int var7 = super.field5810; var7 > 0; --var7) {
            super.field5811[var7] = super.field5811[var7 - 1];
            super.field5807[var7] = super.field5807[var7 + -1];
            super.field5808[var7] = super.field5808[var7 + -1];
        }
        super.field5811[0] = var4;
        super.field5807[0] = var5;
        super.field5808[0] = (byte) arg1;
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(B)V", line = 92)
    public final void method75(byte arg0) {
        ++field4961;
        if (arg0 == 111) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "(B)I", line = 104)
    public final int method251(byte arg0) {
        ++field4957;
        if (arg0 != 5) {
            this.field4952 = null;
        }
        return super.field5736;
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)Z", line = 116)
    public final boolean method68(int arg0) {
        ++field4967;
        int var2 = 111 % ((arg0 - 2) / 57);
        return false;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIZ)V", line = 129)
    public final void method2216(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        super.field4531 = (byte) arg4;
        ++field4964;
        if (~super.field5742 != 0 && class386.field5289.method1856(98, super.field5742).field4291 == 1) {
            super.field5742 = -1;
        }
        if (super.field5759 != -1) {
            class217 var7 = class371.field5108.method1664(super.field5759, -3);
            if (var7.field3128 && ~var7.field3129 != 0 && class386.field5289.method1856(arg1 + 18086, var7.field3129).field4291 == 1) {
                super.field5759 = -1;
            }
        }
        if (!arg5) {
            int var8 = -super.field5811[0] + arg3;
            int var9 = -super.field5807[0] + arg2;
            if (~var8 <= 7 && ~var8 >= -9 && var9 >= -8 && var9 <= 8) {
                if (~super.field5810 > -10) {
                    ++super.field5810;
                }
                for (int var10 = super.field5810; ~var10 < -1; --var10) {
                    super.field5811[var10] = super.field5811[var10 + -1];
                    super.field5807[var10] = super.field5807[var10 + -1];
                    super.field5808[var10] = super.field5808[var10 - 1];
                }
                super.field5811[0] = arg3;
                super.field5808[0] = 1;
                super.field5807[0] = arg2;
                return;
            }
        }
        super.field5810 = 0;
        super.field5811[0] = arg3;
        super.field5805 = 0;
        super.field5809 = 0;
        super.field5807[0] = arg2;
        if (arg1 != -18052) {
            this.method2218(118);
        }
        super.field4537 = super.field5811[0] * 128 - -(arg0 * 64);
        super.field4530 = super.field5807[0] * 128 + arg0 * 64;
        if (super.field5812 != null) {
            super.field5812.method899();
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)Lae;", line = 194)
    public static final class172 method2217(int arg0, int arg1) {
        ++field4963;
        if (arg1 != -1060820048) {
            field4977 = false;
        }
        int var2 = arg0 >> 16;
        int var3 = 65535 & arg0;
        if (class263.field3787[var2] == null || class263.field3787[var2][var3] == null) {
            boolean var4 = class369.method2261(0, var2);
            if (!var4) {
                return null;
            }
        }
        return class263.field3787[var2][var3];
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(ZLvc;)V", line = 222)
    public final void method86(boolean arg0, class89 arg1) {
        ++field4971;
        if (this.field4952 != null) {
            if (super.field5806 || this.method2223(0, arg1, 68)) {
                this.method2502(arg1, super.field5803, super.field5806, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lvc;I)Lep;", line = 242)
    public final class309 method69(class89 arg0, int arg1) {
        ++field4955;
        if (this.field4952 != null && this.method2223(1024, arg0, arg1 ^ 10154)) {
            class257 var3 = arg0.method306();
            int var4 = super.field5772.method1849(-10543);
            var3.method110(var4);
            var3.method107(super.field4537, super.field4532, super.field4530);
            class389 var5 = this.method2506(arg1 ^ -6182);
            class37 var6 = this.field4952.field434 != null ? this.field4952.method232(class416.field5691, -1) : this.field4952;
            if (class228.field3281 && var6.field420 && var5.field5369) {
                class303 var7 = ~super.field5742 != 0 && super.field5773 == 0 ? class386.field5289.method1856(109, super.field5742) : null;
                class303 var8 = ~super.field5763 == 0 || super.field5765 && var7 != null ? null : class386.field5289.method1856(127, super.field5763);
                class468 var9 = class264.method1780(var8 != null ? super.field5752 : super.field5789, this.field4952.field400, super.field5747, super.field5768, var4, 255 & this.field4952.field450, arg1 + -10354, super.field5803[0], 255 & this.field4952.field423, 65535 & this.field4952.field418, super.field5791, var8 != null ? var8 : var7, arg0, 65535 & this.field4952.field397, super.field5794);
                if (var9 != null) {
                    float var10 = arg0.method404();
                    float var11 = arg0.method414();
                    arg0.method308(false);
                    arg0.method378(var10, var11 - 150.0F);
                    var9.method1592(var3, (class63) null, 0);
                    arg0.method378(var10, var11);
                    arg0.method308(true);
                }
            }
            class309 var12 = null;
            if (arg1 != 10228) {
                return null;
            } else {
                if (this.method2218(arg1 + -10132)) {
                    var12 = class163.method1205((byte) 40, super.field5803.length);
                }
                if (super.field5812 != null) {
                    class404 var13 = super.field5812.method896();
                    arg0.method326(super.field5803, var13, var3, var12 != null ? var12.field4383 : null, 0);
                } else {
                    arg0.method437(super.field5803, var3, var12 != null ? var12.field4383 : null, 0);
                }
                this.method2502(arg0, super.field5803, false, false);
                if (super.field5803[2] != null) {
                    if (var4 != 0) {
                        super.field5803[2].method1578(var4);
                    }
                    super.field5803[2].method1572(-super.field5813.field6186 + super.field4537, -super.field5813.field6203 + super.field4532, -super.field5813.field6201 + super.field4530);
                }
                return var12;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(B)I", line = 316)
    public final int method249(byte arg0) {
        if (arg0 != 111) {
            return -6;
        } else {
            ++field4978;
            if (this.field4952.field434 != null) {
                class37 var2 = this.field4952.method232(class416.field5691, -1);
                if (var2 != null && var2.field408 != -1) {
                    return var2.field408;
                }
            }
            return this.field4952.field408;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZILvc;IILuq;I)V", line = 338)
    public final void method70(boolean arg0, int arg1, class89 arg2, int arg3, int arg4, class316 arg5, int arg6) {
        if (arg1 > 40) {
            ++field4959;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "(I)Z", line = 350)
    private final boolean method2218(int arg0) {
        if (arg0 <= 41) {
            return true;
        } else {
            ++field4953;
            return this.field4952.field432;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILvc;II)Z", line = 362)
    public final boolean method77(int arg0, class89 arg1, int arg2, int arg3) {
        ++field4956;
        if (this.field4952 != null && this.method2223(65536, arg1, 81)) {
            class257 var5 = arg1.method306();
            int var6 = super.field5772.method1849(-10543);
            var5.method110(var6);
            var5.method107(super.field4537, super.field4532, super.field4530);
            for (int var7 = arg0; ~super.field5803.length < ~var7; ++var7) {
                if (super.field5803[var7] != null && super.field5803[var7].method1593(arg2, arg3, var5, ~this.field4952.field400 == -2)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(B)V", line = 391)
    public static void method2219(byte arg0) {
        if (arg0 > -107) {
            method2219((byte) 22);
        }
        field4975 = null;
        field4968 = null;
    }

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "(I)I", line = 403)
    public final int method2220(int arg0) {
        ++field4969;
        if (this.field4952.field434 != null) {
            class37 var2 = this.field4952.method232(class416.field5691, -1);
            if (var2 != null && ~var2.field405 != 0) {
                return var2.field405;
            }
        }
        if (arg0 != 0) {
            method2217(-112, 124);
        }
        return this.field4952.field405 != -1 ? this.field4952.field405 : super.method2220(arg0);
    }

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "(I)Z", line = 424)
    public final boolean method2221(int arg0) {
        ++field4951;
        if (this.field4952 == null) {
            return false;
        } else {
            if (arg0 != 0) {
                this.method2224((byte) -74, (class37) null);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLkk;)Lns;", line = 442)
    public static final class402 method2222(byte arg0, class161 arg1) {
        ++field4970;
        if (arg0 < 28) {
            field4976 = 19;
        }
        return new class402(arg1.method1163(9988), arg1.method1163(9988), arg1.method1163(9988), arg1.method1163(9988), arg1.method1178((byte) 63), arg1.method1178((byte) 63), arg1.method1172((byte) -121));
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILvc;I)Z", line = 454)
    private final boolean method2223(int arg0, class89 arg1, int arg2) {
        ++field4960;
        int var4 = arg0;
        class389 var5 = this.method2506(-16338);
        class303 var6 = ~super.field5742 != 0 && super.field5773 == 0 ? class386.field5289.method1856(21, super.field5742) : null;
        class303 var7 = ~super.field5763 == 0 || super.field5765 && var6 != null ? null : class386.field5289.method1856(87, super.field5763);
        int var8 = var5.field5375;
        int var9 = var5.field5333;
        if (~var8 != -1 || ~var9 != -1 || ~var5.field5363 != -1 || ~var5.field5347 != -1) {
            arg0 |= 7;
        }
        class468 var10 = super.field5803[0] = this.field4952.method221(class416.field5691, arg0, class382.field5247, super.field5734, (byte) 86, super.field5770, var7, arg1, super.field5767, super.field5797, super.field5781, class386.field5289, var6, super.field5789, super.field5752);
        if (var10 == null) {
            return false;
        } else {
            super.field5736 = var10.method1591();
            this.method2505(var10, 408);
            int var11 = super.field5772.method1849(-10543);
            super.field5768 = 0;
            super.field5747 = 0;
            super.field5791 = 0;
            if (arg2 <= 28) {
                field4975 = null;
            }
            if (var8 == 0 && var9 == 0) {
                this.method2498(this.method245(4452) << 7, this.method245(4452) << 7, var11, false);
            } else {
                this.method2498(var9, var8, var11, false);
                if (super.field5791 != 0) {
                    super.field5803[0].method1556(super.field5791);
                }
                if (~super.field5768 != -1) {
                    super.field5803[0].method1605(super.field5768);
                }
                if (super.field5747 != 0) {
                    super.field5803[0].method1572(0, super.field5747, 0);
                }
            }
            super.field5803[1] = null;
            if (super.field5759 != -1 && ~super.field5741 != 0) {
                class217 var12 = class371.field5108.method1664(super.field5759, -117);
                class468 var13 = var12.method1495((byte) 54, super.field5741, (!var12.field3125 ? 2 : 7) | var4, super.field5788, class386.field5289, arg1, super.field5737);
                if (var13 != null) {
                    var13.method1572(0, -super.field5749, 0);
                    if (var12.field3125 && (var8 != 0 || var9 != 0)) {
                        if (super.field5791 != 0) {
                            var13.method1556(super.field5791);
                        }
                        if (~super.field5768 != -1) {
                            var13.method1605(super.field5768);
                        }
                        if (super.field5747 != 0) {
                            var13.method1572(0, super.field5747, 0);
                        }
                    }
                    super.field5803[1] = var13;
                }
            }
            super.field5803[2] = null;
            if (super.field5813 != null) {
                if (class364.field5010 >= super.field5813.field6196) {
                    super.field5813 = null;
                } else if (~class364.field5010 <= ~super.field5813.field6194) {
                    class468 var14 = super.field5813.method2663(-121, arg1, 7 | var4);
                    if (var14 != null) {
                        var14.method1572(-super.field4537 + super.field5813.field6186, -super.field4532 + super.field5813.field6203, -super.field4530 + super.field5813.field6201);
                        if (var11 != 0) {
                            var14.method1578(var11);
                        }
                        super.field5803[2] = var14;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLkc;)V", line = 567)
    public final void method2224(byte arg0, class37 arg1) {
        this.field4952 = arg1;
        ++field4958;
        if (super.field5812 != null) {
            super.field5812.method899();
        }
        if (arg0 != 17) {
            field4977 = false;
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)I", line = 604)
    public final int method243(int arg0) {
        ++field4962;
        if (this.field4952.field434 != null) {
            class37 var2 = this.field4952.method232(class416.field5691, arg0 + 28772);
            if (var2 != null && var2.field451 != -1) {
                return var2.field451;
            }
        }
        return arg0 != -28773 ? -5 : this.field4952.field451;
    }
}
