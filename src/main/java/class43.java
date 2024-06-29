import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class43 extends class298 {

    @OriginalMember(owner = "client!cd", name = "Sc", descriptor = "I")
    public static int field607 = 0;

    @OriginalMember(owner = "client!cd", name = "Uc", descriptor = "Lar;")
    public static class47 field609 = new class47();

    @OriginalMember(owner = "client!cd", name = "bd", descriptor = "I")
    public static int field616 = -1;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!cd", name = "Ec", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!cd", name = "Hc", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!cd", name = "Ic", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!cd", name = "Jc", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!cd", name = "Kc", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!cd", name = "Lc", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!cd", name = "Mc", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!cd", name = "Nc", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!cd", name = "Oc", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!cd", name = "Pc", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!cd", name = "Qc", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!cd", name = "Tc", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!cd", name = "Vc", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!cd", name = "Xc", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!cd", name = "Yc", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!cd", name = "Zc", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!cd", name = "ad", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!cd", name = "Rc", descriptor = "Len;")
    public class249 field606;

    @OriginalMember(owner = "client!cd", name = "Gc", descriptor = "Lqp;")
    public static class278 field595;

    @OriginalMember(owner = "client!cd", name = "Fc", descriptor = "[I")
    public static int[] field594;

    @OriginalMember(owner = "client!cd", name = "Wc", descriptor = "[Lch;")
    public static class443[] field611;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILen;)V", line = 3)
    public final void method306(int arg0, class249 arg1) {
        if (arg0 != 0) {
            field609 = null;
        }
        this.field606 = arg1;
        ++field596;
        if (super.field4357 != null) {
            super.field4357.method37();
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(IIII)V", line = 18)
    public static final void method307(int arg0, int arg1, int arg2, int arg3) {
        ++field605;
        if (arg0 < 71) {
            field594 = null;
        }
        class438 var4 = class315.field4611[arg1][arg2];
        class225.method1303(var4 != null ? var4 : class382.field5544, (byte) -60, arg3);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)I", line = 34)
    public final int method308(byte arg0) {
        ++field614;
        if (this.field606.field3375 != null) {
            class249 var2 = this.field606.method1510(30);
            if (var2 != null && var2.field3369 != -1) {
                return var2.field3369;
            }
        }
        if (arg0 <= 74) {
            field607 = 98;
        }
        return ~this.field606.field3369 != 0 ? this.field606.field3369 : super.method308((byte) 98);
    }

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "(I)Z", line = 57)
    private final boolean method309(int arg0) {
        ++field603;
        return arg0 != 2 ? false : this.field606.field3373;
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)Z", line = 68)
    public final boolean method166(int arg0) {
        if (arg0 != -17506) {
            field609 = null;
        }
        ++field593;
        return false;
    }

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "(I)Z", line = 79)
    public final boolean method310(int arg0) {
        if (arg0 != 8968) {
            return true;
        } else {
            ++field608;
            return this.field606 != null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIZLii;)Z", line = 94)
    public final boolean method119(int arg0, int arg1, boolean arg2, class405 arg3) {
        ++field597;
        if (this.field606 != null && this.method312(arg3, 65536, 1)) {
            class177 var5 = arg3.method1735();
            int var6 = super.field4328.method2641((byte) -114);
            var5.method984(var6);
            var5.method985(super.field740, super.field729, super.field734);
            if (arg2) {
                return false;
            } else {
                for (int var7 = 0; ~var7 > ~super.field4352.length; ++var7) {
                    if (super.field4352[var7] != null) {
                        return super.field4352[var7].method1594(arg0, arg1, var5, ~this.field606.field3363 == -2);
                    }
                }
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lii;I)Leb;", line = 127)
    public final class382 method117(class405 arg0, int arg1) {
        if (arg1 != -1) {
            return null;
        } else {
            ++field602;
            if (this.field606 != null && this.method312(arg0, 1024, 1)) {
                class177 var3 = arg0.method1735();
                int var4 = super.field4328.method2641((byte) -43);
                var3.method984(var4);
                var3.method981(super.field740, super.field729, super.field734);
                class396 var5 = this.method2040(false);
                class249 var6 = this.field606.field3375 == null ? this.field606 : this.field606.method1510(30);
                if (class120.field1678 && var6.field3415 && var5.field5882) {
                    class12 var7 = ~super.field4290 != 0 && super.field4332 == 0 ? class33.method221((byte) 102, super.field4290) : null;
                    class12 var8 = ~super.field4298 == 0 || super.field4285 && var7 != null ? null : class33.method221((byte) 102, super.field4298);
                    class375 var9 = class195.method1166(var4, super.field4352[0], super.field4297, arg1 ^ 104, this.field606.field3413 & 65535, super.field4267, super.field4335, var8 != null ? var8 : var7, this.field606.field3420 & 255, var8 != null ? super.field4346 : super.field4300, this.field606.field3363, 255 & this.field606.field3361, super.field4343, arg0, this.field606.field3401 & 65535);
                    if (var9 != null) {
                        float var10 = arg0.method1619();
                        float var11 = arg0.method1724();
                        arg0.method1769(false);
                        arg0.method1737(var10, var11 + -150.0F);
                        var9.method1601(var3, (class330) null, 0);
                        arg0.method1737(var10, var11);
                        arg0.method1769(true);
                    }
                }
                class382 var12 = null;
                if (this.method309(2)) {
                    var12 = class397.method2554(super.field4352.length, 0);
                }
                if (super.field4357 == null) {
                    arg0.method1679(super.field4352, var3, var12 != null ? var12.field5543 : null, 0);
                } else {
                    class352 var13 = super.field4357.method35();
                    arg0.method1692(super.field4352, var13, var3, var12 != null ? var12.field5543 : null, 0);
                }
                this.method2048(super.field4352, true, arg0, false);
                if (super.field4352[2] != null) {
                    if (~var4 != -1) {
                        super.field4352[2].method1557(var4);
                    }
                    super.field4352[2].method1567(-super.field4356 + super.field740, -super.field4366 + super.field729, -super.field4363 + super.field734);
                }
                return var12;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 199)
    public static final boolean method311(int arg0, String arg1) {
        ++field615;
        int var2 = -40 % (arg0 / 49);
        return class144.method920((byte) -38, arg1, 10, true);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)I", line = 209)
    public final int method170(int arg0) {
        if (arg0 != 0) {
            this.method119(109, 51, true, (class405) null);
        }
        ++field613;
        if (this.field606.field3375 != null) {
            class249 var2 = this.field606.method1510(30);
            if (var2 != null && ~var2.field3422 != 0) {
                return var2.field3422;
            }
        }
        return this.field606.field3422;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lii;II)Z", line = 230)
    private final boolean method312(class405 arg0, int arg1, int arg2) {
        ++field601;
        int var4 = arg1;
        if (arg2 != 1) {
            this.method172(-39);
        }
        class396 var5 = this.method2040(false);
        class12 var6 = ~super.field4290 != 0 && ~super.field4332 == -1 ? class33.method221((byte) 102, super.field4290) : null;
        class12 var7 = ~super.field4298 == 0 || super.field4285 && var6 != null ? null : class33.method221((byte) 102, super.field4298);
        int var8 = var5.field5879;
        int var9 = var5.field5845;
        if (var8 != 0 || var9 != 0 || var5.field5846 != 0 || var5.field5868 != 0) {
            arg1 |= 7;
        }
        class375 var10 = super.field4352[0] = this.field606.method1507(var7, super.field4294, arg0, (byte) -72, super.field4300, super.field4282, super.field4278, super.field4291, super.field4346, arg1, super.field4305, var6);
        if (var10 == null) {
            return false;
        } else {
            super.field4327 = var10.method1597();
            this.method2033(var10, arg2 ^ 122);
            int var11 = super.field4328.method2641((byte) -61);
            super.field4343 = 0;
            super.field4335 = 0;
            super.field4297 = 0;
            if (var8 == 0 && var9 == 0) {
                this.method2036(-128, var11, this.method168(-124) << 7, this.method168(-115) << 7);
            } else {
                this.method2036(-128, var11, var9, var8);
                if (super.field4335 != 0) {
                    super.field4352[0].method1571(super.field4335);
                }
                if (~super.field4297 != -1) {
                    super.field4352[0].method1572(super.field4297);
                }
                if (~super.field4343 != -1) {
                    super.field4352[0].method1567(0, super.field4343, 0);
                }
            }
            super.field4352[1] = null;
            if (~super.field4326 != 0 && ~super.field4304 != 0) {
                class300 var12 = class426.method2706((byte) 11, super.field4326);
                class375 var13 = var12.method2060(var4 | (!var12.field4407 ? 2 : 7), (byte) -32, arg0, super.field4280, super.field4273, super.field4304);
                if (var13 != null) {
                    var13.method1567(0, -super.field4341, 0);
                    if (var12.field4407 && (var8 != 0 || ~var9 != -1)) {
                        if (~super.field4335 != -1) {
                            var13.method1571(super.field4335);
                        }
                        if (~super.field4297 != -1) {
                            var13.method1572(super.field4297);
                        }
                        if (super.field4343 != 0) {
                            var13.method1567(0, super.field4343, 0);
                        }
                    }
                    super.field4352[1] = var13;
                }
            }
            super.field4352[2] = null;
            if (super.field4368 != null) {
                if (~super.field4355 >= ~class28.field418) {
                    super.field4368 = null;
                }
                if (class28.field418 >= super.field4351 && super.field4355 > class28.field418) {
                    class375 var14 = super.field4368.method111(7 | var4, arg0, 47);
                    if (var14 != null) {
                        var14.method1567(-super.field740 + super.field4356, super.field4366 - super.field729, -super.field734 + super.field4363);
                        if (var11 != 0) {
                            var14.method1557(var11);
                        }
                        super.field4352[2] = var14;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "(I)V", line = 345)
    public static final void method313(int arg0) {
        ++field598;
        int var1 = class312.method2113(21410);
        if (arg0 < 106) {
            method314(3);
        }
        if (~var1 != -1) {
            if (var1 != 1) {
                class97.method660(0, (byte) (255 & class236.field3139 + -4));
                class313.method2116(2, -1);
            } else {
                class97.method660(0, (byte) 0);
                class313.method2116(512, -1);
                if (class103.field1430 != null) {
                    class432.method2735(126);
                }
            }
        } else {
            class12.field184 = null;
            class313.method2116(0, -1);
        }
        class310.field4562 = class227.field2981;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lii;IIIILnc;Z)V", line = 384)
    public final void method169(class405 arg0, int arg1, int arg2, int arg3, int arg4, class126 arg5, boolean arg6) {
        if (arg3 > -106) {
            field609 = null;
        }
        ++field600;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)I", line = 395)
    public final int method172(int arg0) {
        if (arg0 != 0) {
            this.method172(-123);
        }
        ++field610;
        if (this.field606.field3375 != null) {
            class249 var2 = this.field606.method1510(30);
            if (var2 != null && var2.field3406 != -1) {
                return var2.field3406;
            }
        }
        return this.field606.field3406;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V", line = 420)
    public final void method176(boolean arg0) {
        ++field599;
        if (arg0) {
            field609 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "(I)V", line = 434)
    public static void method314(int arg0) {
        if (arg0 >= -77) {
            field594 = null;
        }
        field594 = null;
        field609 = null;
        field611 = null;
        field595 = null;
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)I", line = 447)
    public final int method174(int arg0) {
        ++field612;
        if (arg0 != 2) {
            method315(-70);
        }
        return super.field4327;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILii;)V", line = 458)
    public final void method103(int arg0, class405 arg1) {
        ++field592;
        if (this.field606 != null) {
            if (super.field4353 || this.method312(arg1, 0, 1)) {
                this.method2048(super.field4352, true, arg1, super.field4353);
                if (arg0 < 102) {
                    this.method117((class405) null, -27);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "(I)V", line = 482)
    public static final void method315(int arg0) {
        ++field604;
        class377.field5489.method1136((byte) -122);
        if (arg0 >= -85) {
            method311(-65, (String) null);
        }
    }
}
