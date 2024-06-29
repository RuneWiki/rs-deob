import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class104 extends class62 {

    @OriginalMember(owner = "client!uk", name = "tc", descriptor = "I")
    public static int field1635 = 0;

    @OriginalMember(owner = "client!uk", name = "uc", descriptor = "S")
    public static short field1636 = 32767;

    @OriginalMember(owner = "client!uk", name = "Cc", descriptor = "I")
    public static int field1644 = 0;

    @OriginalMember(owner = "client!uk", name = "rc", descriptor = "Lad;")
    public static class275 field1633 = new class275(30);

    @OriginalMember(owner = "client!uk", name = "Gc", descriptor = "[S")
    public static short[] field1648 = new short[256];

    @OriginalMember(owner = "client!uk", name = "qc", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!uk", name = "sc", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!uk", name = "vc", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!uk", name = "wc", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!uk", name = "xc", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!uk", name = "yc", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!uk", name = "zc", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!uk", name = "Ac", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!uk", name = "Bc", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!uk", name = "Fc", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!uk", name = "Hc", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!uk", name = "Dc", descriptor = "Lmd;")
    public class242 field1645;

    @OriginalMember(owner = "client!uk", name = "Ec", descriptor = "[I")
    public static int[] field1646;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(JBZ)V")
    public static final void method739(long arg0, byte arg1, boolean arg2) {
        ++field1640;
        if (~arg0 != -1L) {
            if (class34.field562 >= 100) {
                class74.method536(class57.field825, "", (byte) -86, 0);
            } else {
                String var4 = class125.method857(arg0, (byte) -89);
                for (int var5 = 0; ~var5 > ~class34.field562; ++var5) {
                    if (~class161.field2634[var5] == ~arg0) {
                        class74.method536(var4 + class253.field4153, "", (byte) -106, 0);
                        return;
                    }
                }
                for (int var6 = 0; ~class146.field2345 < ~var6; ++var6) {
                    if (class44.field651[var6] == arg0) {
                        class74.method536(class236.field3694 + var4 + class157.field2519, "", (byte) -70, 0);
                        return;
                    }
                }
                if (var4.equals(class217.field3408.field222)) {
                    class74.method536(class82.field1326, "", (byte) -83, 0);
                } else {
                    ++class140.field2275;
                    class161.field2634[class34.field562] = arg0;
                    class121.field1912[class34.field562] = class263.method1773(class81.method582(arg1, 27), arg0);
                    class29.field526[class34.field562++] = arg2;
                    class24.field439 = class68.field1083;
                    class311.field5027.method2081(false, 40);
                    class311.field5027.method1840((byte) 47, arg0);
                    if (arg1 != -32) {
                        field1635 = -65;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIIIIJILga;)V")
    public final void method27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class181 arg10) {
        ++field1641;
        if (this.field1645 != null) {
            class91 var13 = super.field900 != -1 && ~super.field973 == -1 ? class159.method1085((byte) -63, super.field900) : null;
            class91 var14 = ~super.field947 == 0 || ~super.field947 == ~this.method403((byte) 90).field4180 && var13 != null ? null : class159.method1085((byte) -63, super.field947);
            class32 var15 = this.field1645.method1645(super.field992, var14, super.field986, super.field934, super.field951, super.field915, 119, super.field961, var13, super.field984);
            if (var15 != null) {
                super.field893 = var15.method22();
                class242 var16 = this.field1645;
                if (var16.field3779 != null) {
                    var16 = var16.method1649(false);
                }
                if (class277.field4524 && var16.field3776) {
                    class32 var17 = class25.method199(this.field1645.field3789, super.field964, this.field1645.field3775, 117, this.field1645.field3783, super.field994, super.field929, var14 != null ? super.field992 : super.field934, super.field948, arg0, this.field1645.field3788, var15, this.field1645.field3820, var14 == null ? var13 : var14);
                    var17.method27(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.field917);
                }
                this.method407(-30443, var15);
                this.method399(arg0, var15, (byte) 111);
                class32 var18 = null;
                if (~super.field995 != 0 && super.field911 != -1) {
                    class156 var19 = class166.method1182(1, super.field995);
                    var18 = var19.method1055(true, super.field911, super.field979, super.field919);
                    if (var18 != null) {
                        var18.method19(0, -super.field901, 0);
                        if (var19.field2481) {
                            if (~class95.field1513 != -1) {
                                var18.method30(class95.field1513);
                            }
                            if (~class55.field812 != -1) {
                                var18.method43(class55.field812);
                            }
                            if (~class97.field1524 != -1) {
                                var18.method19(0, class97.field1524, 0);
                            }
                        }
                    }
                }
                if (var18 != null) {
                    var15 = ((class3) var15).method41(var18);
                }
                this.method405(var15, 0, var18);
                if (this.field1645.field3789 == 1) {
                    var15.field532 = true;
                }
                var15.method27(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field917);
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "()I")
    public final int method22() {
        ++field1634;
        return super.field893;
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(III)I")
    public static final int method740(int arg0, int arg1, int arg2) {
        ++field1637;
        int var3 = class11.method88(arg0 - 1, false, arg1 + -1) - (-class11.method88(arg0 + -1, false, arg1 + 1) + -class11.method88(arg0 + 1, false, arg1 + -1) - class11.method88(arg0 + 1, false, arg1 + 1));
        int var4 = class11.method88(arg0, false, arg1 + -1) + class11.method88(arg0, false, arg1 + 1) - (-class11.method88(arg0 + -1, false, arg1) + -class11.method88(arg0 + 1, false, arg1));
        if (arg2 != -15533) {
            method742(89);
        }
        int var5 = class11.method88(arg0, false, arg1);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V")
    public static void method741(int arg0) {
        if (arg0 == 28208) {
            field1633 = null;
            field1646 = null;
            field1648 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(Z)I")
    public final int method95(boolean arg0) {
        ++field1643;
        if (arg0) {
            this.field1645 = null;
        }
        if (this.field1645.field3779 != null) {
            class242 var2 = this.field1645.method1649(false);
            if (var2 != null && var2.field3822 != -1) {
                return var2.field3822;
            }
        }
        return super.field897;
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)V")
    public static final void method742(int arg0) {
        client.field2666.method1873(arg0 ^ -7401);
        class312.field5034.method1873(-7401);
        ++field1639;
        if (arg0 != 0) {
            method740(61, -44, -111);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lmd;B)V")
    public final void method743(class242 arg0, byte arg1) {
        if (arg1 < -96) {
            ++field1632;
            this.field1645 = arg0;
            if (super.field917 != null) {
                super.field917.method1270();
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)Z")
    public final boolean method104(int arg0) {
        ++field1638;
        if (arg0 != -32447) {
            return true;
        } else {
            return this.field1645 != null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIII)V")
    public final void method102(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1647;
        if (this.field1645 != null) {
            if (!super.field941) {
                class91 var6 = super.field900 != -1 && ~super.field973 == -1 ? class159.method1085((byte) -63, super.field900) : null;
                class91 var7 = super.field947 == -1 || ~super.field947 == ~this.method403((byte) 107).field4180 && var6 != null ? null : class159.method1085((byte) -63, super.field947);
                class32 var8 = this.field1645.method1645(super.field992, var7, super.field986, super.field934, super.field951, super.field915, -95, super.field961, var6, super.field984);
                if (var8 == null) {
                    return;
                }
                this.method405(var8, 0, (class32) null);
            }
            if (super.field917 != null) {
                super.field917.method1275(arg0, arg1, arg3, arg2, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "()V")
    public static final void method744() {
        if (class48.field710 != null) {
            for (int var0 = 0; var0 < class48.field710.length; ++var0) {
                for (int var1 = 0; var1 < class95.field1504; ++var1) {
                    for (int var2 = 0; var2 < class200.field3208; ++var2) {
                        class48.field710[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class111.field1711 != null) {
            for (int var3 = 0; var3 < class111.field1711.length; ++var3) {
                for (int var4 = 0; var4 < class95.field1504; ++var4) {
                    for (int var5 = 0; var5 < class200.field3208; ++var5) {
                        class111.field1711[var3][var4][var5] = null;
                    }
                }
            }
        }
        class28.field512 = 0;
        if (class248.field3935 != null) {
            for (int var6 = 0; var6 < class28.field512; ++var6) {
                class248.field3935[var6] = null;
            }
        }
        if (class68.field1093 != null) {
            for (int var7 = 0; var7 < class198.field3188; ++var7) {
                class68.field1093[var7] = null;
            }
            class198.field3188 = 0;
        }
        if (class119.field1872 != null) {
            for (int var8 = 0; var8 < class119.field1872.length; ++var8) {
                class119.field1872[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (super.field917 != null) {
            super.field917.method1269();
        }
        ++field1649;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IB)V")
    public static final void method745(int arg0, byte arg1) {
        class251.field4117 = 1000 / arg0;
        ++field1642;
        if (arg1 != 117) {
            method740(-49, -11, -80);
        }
    }
}
