import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class484 extends class261 implements class116 {

    @OriginalMember(owner = "client!pl", name = "D", descriptor = "Laf;")
    public class110 field6861;

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "Z")
    private boolean field6854;

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "Lsd;")
    public static class74 field6855 = new class74(50, 12);

    @OriginalMember(owner = "client!pl", name = "K", descriptor = "Lab;")
    public static class256 field6868 = null;

    @OriginalMember(owner = "client!pl", name = "L", descriptor = "F")
    public static float field6869;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
    public static int field6848;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
    public static int field6850;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "I")
    public static int field6852;

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "I")
    public static int field6853;

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "I")
    public static int field6856;

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "I")
    public static int field6857;

    @OriginalMember(owner = "client!pl", name = "A", descriptor = "I")
    public static int field6858;

    @OriginalMember(owner = "client!pl", name = "B", descriptor = "I")
    public static int field6859;

    @OriginalMember(owner = "client!pl", name = "C", descriptor = "I")
    public static int field6860;

    @OriginalMember(owner = "client!pl", name = "E", descriptor = "I")
    public static int field6862;

    @OriginalMember(owner = "client!pl", name = "F", descriptor = "I")
    public static int field6863;

    @OriginalMember(owner = "client!pl", name = "G", descriptor = "I")
    public static int field6864;

    @OriginalMember(owner = "client!pl", name = "H", descriptor = "I")
    public static int field6865;

    @OriginalMember(owner = "client!pl", name = "I", descriptor = "I")
    public static int field6866;

    @OriginalMember(owner = "client!pl", name = "J", descriptor = "I")
    public static int field6867;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pl", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field6870;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)I")
    public final int method16(boolean arg0) {
        ++field6858;
        return arg0 ? 58 : this.field6861.field1346;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIII)V")
    public static final void method2857(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6866;
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg1 * arg1;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (-var12 + 1) * var8 - -var10;
        if (arg0 > 10) {
            int var14 = -((var12 + -1) * var11) + var9;
            int var15 = var8 << 2;
            int var16 = var9 << 2;
            int var17 = ((var6 << 1) + 3) * var10;
            int var18 = ((arg3 << 1) - 3) * var11;
            int var19 = (var6 + 1) * var16;
            int var20 = (arg3 - 1) * var15;
            class270.method1633(class240.field3303[arg2], arg1 + arg5, arg4, -arg1 + arg5, 122);
            while (~var7 < -1) {
                if (~var13 > -1) {
                    while (var13 < 0) {
                        var14 += var19;
                        var13 += var17;
                        var19 += var16;
                        ++var6;
                        var17 += var16;
                    }
                }
                if (~var14 > -1) {
                    var14 += var19;
                    var13 += var17;
                    var17 += var16;
                    ++var6;
                    var19 += var16;
                }
                var14 += -var18;
                var13 += -var20;
                var18 -= var15;
                var20 -= var15;
                --var7;
                int var21 = -var7 + arg2;
                int var22 = arg2 + var7;
                int var23 = arg5 - -var6;
                int var24 = -var6 + arg5;
                class270.method1633(class240.field3303[var21], var23, arg4, var24, 105);
                class270.method1633(class240.field3303[var22], var23, arg4, var24, 92);
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Loj;Lcu;IIIIIZIII)V")
    public class484(class280 arg0, class415 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class329.method1998(3, arg8, arg9));
        this.field6861 = new class110(arg0, arg1, arg8, arg9, arg2, arg3, super.field3760, super.field3759, arg7, arg10);
        this.field6854 = arg1.field5990 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(ILoj;)V")
    public final void method18(int arg0, class280 arg1) {
        ++field6856;
        this.field6861.method523(-27426, arg1);
        int var3 = 103 % ((arg0 - 62) / 63);
    }

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "(I)V")
    public final void method32(int arg0) {
        if (arg0 == -2) {
            ++field6859;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;ZC)I")
    public static final int method2858(String arg0, boolean arg1, char arg2) {
        ++field6848;
        int var3 = 0;
        int var4 = arg0.length();
        for (int var5 = 0; ~var5 > ~var4; ++var5) {
            if (arg0.charAt(var5) == arg2) {
                ++var3;
            }
        }
        if (!arg1) {
            method2858((String) null, true, (char) 65494);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
    public final void method24(int arg0) {
        if (arg0 > 41) {
            ++field6851;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILoj;II)Z")
    public final boolean method28(int arg0, class280 arg1, int arg2, int arg3) {
        ++field6865;
        class352 var5 = this.field6861.method529(false, 88, arg1, super.field3759, super.field3760, 65536, false);
        if (arg3 != -6085) {
            method2859((byte) -66);
        }
        if (var5 == null) {
            return false;
        } else {
            class327 var6 = arg1.method1456();
            var6.method553(super.field3760, super.field3758, super.field3759);
            return var5.method1695(arg0, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILoj;B)Lqh;")
    public final class352 method21(int arg0, class280 arg1, byte arg2) {
        ++field6867;
        if (arg2 != -98) {
            this.field6854 = true;
        }
        return this.field6861.method529(false, 74, arg1, 0, 0, arg0, false);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIZLa;IBLoj;)V")
    public final void method23(int arg0, int arg1, boolean arg2, class78 arg3, int arg4, byte arg5, class280 arg6) {
        if (arg5 == -65) {
            ++field6857;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)I")
    public final int method26(byte arg0) {
        if (arg0 != 73) {
            method2860(36, -119, 10, 88, (class280) null, 22, (byte) 72, 61, -73);
        }
        ++field6863;
        return this.field6861.field1341;
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(ILoj;)Lmg;")
    public final class451 method19(int arg0, class280 arg1) {
        ++field6853;
        class352 var3 = this.field6861.method529(true, 108, arg1, super.field3759, super.field3760, 1024, false);
        if (var3 == null) {
            return null;
        } else {
            class327 var4 = arg1.method1456();
            var4.method553(super.field3760, super.field3758, super.field3759);
            class451 var5 = null;
            if (this.field6854) {
                var5 = class134.method638(762096108, 1);
            }
            if (arg0 < 95) {
                field6869 = -1.0960182F;
            }
            if (this.field6861.field1331 != null) {
                class46 var6 = this.field6861.field1331.method2272();
                arg1.method1463(var3, var6, var4, var5 == null ? null : var5.field6379[0], 0);
            } else {
                var3.method1716(var4, var5 != null ? var5.field6379[0] : null, 0);
            }
            this.field6861.method532((byte) -103, var3, true, super.field3759 >> 7, super.field3759 >> 7, super.field3760 >> 7, super.field3760 >> 7, arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILoj;)V")
    public final void method20(int arg0, class280 arg1) {
        this.field6861.method528(arg1, arg0 ^ 136816);
        if (arg0 == 5744) {
            ++field6850;
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)I")
    public final int method31(byte arg0) {
        int var2 = 36 % ((arg0 - -23) / 35);
        ++field6864;
        return this.field6861.field1333;
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(I)Z")
    public final boolean method33(int arg0) {
        if (arg0 != 1957) {
            this.field6861 = null;
        }
        ++field6849;
        return false;
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(ILoj;)V")
    public final void method27(int arg0, class280 arg1) {
        if (arg0 != 0) {
            this.method16(true);
        }
        ++field6852;
        class352 var3 = this.field6861.method529(true, 49, arg1, super.field3759, super.field3760, 131072, true);
        if (var3 != null) {
            this.field6861.method532((byte) -124, var3, false, super.field3759 >> 7, super.field3759 >> 7, super.field3760 >> 7, super.field3760 >> 7, arg1);
        }
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(B)V")
    public static void method2859(byte arg0) {
        field6868 = null;
        if (arg0 == -106) {
            field6855 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIILoj;IBII)V")
    public static final void method2860(int arg0, int arg1, int arg2, int arg3, class280 arg4, int arg5, byte arg6, int arg7, int arg8) {
        ++field6860;
        class116 var9 = (class116) class63.method320(arg8, arg1, arg0);
        if (var9 != null) {
            class415 var10 = class173.field2084.method2297(50, var9.method16(false));
            int var11 = 3 & var9.method31((byte) -81);
            int var12 = var9.method26((byte) 73);
            if (~var10.field5932 == 0) {
                int var13 = arg3;
                if (~var10.field5990 < -1) {
                    var13 = arg5;
                }
                if (var12 == 0 || ~var12 == -3) {
                    if (var11 == 0) {
                        arg4.method1760((byte) 120, arg2, arg7, var13, 4);
                    } else if (~var11 != -2) {
                        if (var11 != 2) {
                            if (~var11 == -4) {
                                arg4.method1756(var13, arg7, arg2 + 3, 4, 9);
                            }
                        } else {
                            arg4.method1760((byte) 97, arg2, arg7 + 3, var13, 4);
                        }
                    } else {
                        arg4.method1756(var13, arg7, arg2, 4, arg6 ^ 125);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg4.method1759(-6923, 1, 1, arg2, var13, arg7);
                    } else if (~var11 == -2) {
                        arg4.method1759(-6923, 1, 1, arg2, var13, arg7 + 3);
                    } else if (~var11 == -3) {
                        arg4.method1759(arg6 ^ -7039, 1, 1, arg2 - -3, var13, arg7 + 3);
                    } else if (var11 == 3) {
                        arg4.method1759(-6923, 1, 1, arg2 - -3, var13, arg7);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg4.method1756(var13, arg7, arg2, 4, 9);
                    } else if (var11 == 1) {
                        arg4.method1760((byte) 35, arg2, arg7 - -3, var13, 4);
                    } else if (~var11 == -3) {
                        arg4.method1756(var13, arg7, arg2 + 3, 4, 9);
                    } else if (var11 == 3) {
                        arg4.method1760((byte) 93, arg2, arg7, var13, 4);
                    }
                }
            } else {
                class199.method1093(arg2, var11, arg7, var10, arg4, 122);
            }
        }
        class116 var14 = (class116) class263.method1603(arg8, arg1, arg0, field6870 != null ? field6870 : (field6870 = method2861("td")));
        if (var14 != null) {
            class415 var15 = class173.field2084.method2297(50, var14.method16(false));
            int var16 = 3 & var14.method31((byte) 86);
            int var17 = var14.method26((byte) 73);
            if (var15.field5932 != -1) {
                class199.method1093(arg2, var16, arg7, var15, arg4, 124);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field5990 > 0) {
                    var18 = -1179648;
                }
                if (~var16 != -1 && ~var16 != -3) {
                    arg4.method1761(arg7, arg7 + 3, arg2 - -3, 1, var18, arg2);
                } else {
                    arg4.method1761(arg7, arg7 + 3, arg2, 1, var18, arg2 + 3);
                }
            }
        }
        class116 var19 = (class116) class427.method2542(arg8, arg1, arg0);
        if (arg6 == 116) {
            if (var19 != null) {
                class415 var20 = class173.field2084.method2297(50, var19.method16(false));
                int var21 = var19.method31((byte) 57) & 3;
                if (var20.field5932 != -1) {
                    class199.method1093(arg2, var21, arg7, var20, arg4, 122);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)Z")
    public final boolean method22(int arg0) {
        if (arg0 > -32) {
            field6868 = null;
        }
        ++field6862;
        return this.field6861.method524(10);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2861(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class40("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
    }
}
