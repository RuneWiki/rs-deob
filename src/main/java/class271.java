import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class271 extends class336 {

    @OriginalMember(owner = "client!ra", name = "bb", descriptor = "Z")
    public boolean field3773 = false;

    @OriginalMember(owner = "client!ra", name = "cb", descriptor = "Z")
    public boolean field3774 = false;

    @OriginalMember(owner = "client!ra", name = "W", descriptor = "[I")
    public static int[] field3768 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!ra", name = "V", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!ra", name = "X", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!ra", name = "Z", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!ra", name = "ab", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!ra", name = "eb", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!ra", name = "fb", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!ra", name = "gb", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!ra", name = "hb", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!ra", name = "db", descriptor = "[I")
    public static int[] field3775;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
    public static void method1729(int arg0) {
        field3768 = null;
        field3775 = null;
        if (arg0 != -29530) {
            field3768 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ltl;I)V")
    private final void method1730(class91 arg0, int arg1) {
        ++field3769;
        if (~(arg0.field1277.length + -arg0.field1292) <= -2) {
            int var3 = arg0.method618((byte) 100);
            if (var3 >= 0 && ~var3 >= -18) {
                byte var4;
                if (var3 != 17) {
                    if (~var3 != -17) {
                        if (var3 != 15) {
                            if (~var3 != -15) {
                                if (var3 != 13) {
                                    if (var3 != 12) {
                                        if (var3 == 11) {
                                            var4 = 33;
                                        } else if (~var3 == -11) {
                                            var4 = 32;
                                        } else if (~var3 == -10) {
                                            var4 = 31;
                                        } else if (~var3 == -9) {
                                            var4 = 30;
                                        } else if (var3 != 7) {
                                            if (~var3 == -7) {
                                                var4 = 28;
                                            } else if (var3 != 5) {
                                                if (var3 == 4) {
                                                    var4 = 24;
                                                } else if (~var3 == -4) {
                                                    var4 = 23;
                                                } else if (~var3 == -3) {
                                                    var4 = 22;
                                                } else if (var3 == 1) {
                                                    var4 = 23;
                                                } else {
                                                    var4 = 19;
                                                }
                                            } else {
                                                var4 = 28;
                                            }
                                        } else {
                                            var4 = 29;
                                        }
                                    } else {
                                        var4 = 34;
                                    }
                                } else {
                                    var4 = 35;
                                }
                            } else {
                                var4 = 36;
                            }
                        } else {
                            var4 = 37;
                        }
                    } else {
                        var4 = 38;
                    }
                } else {
                    var4 = 40;
                }
                if (~(arg0.field1277.length - arg0.field1292) <= ~var4) {
                    super.field5195 = arg0.method618((byte) 100);
                    if (~super.field5195 <= -2) {
                        if (super.field5195 > 4) {
                            super.field5195 = 4;
                        }
                    } else {
                        super.field5195 = 1;
                    }
                    this.method1737(~arg0.method618((byte) 100) == -2, (byte) -86);
                    super.field5237 = arg0.method618((byte) 100) == 1;
                    super.field5196 = ~arg0.method618((byte) 100) == -2;
                    super.field5200 = arg0.method618((byte) 100) == 1;
                    super.field5223 = ~arg0.method618((byte) 100) == -2 ? 1 : 0;
                    super.field5208 = arg0.method618((byte) 100) == 1;
                    super.field5235 = arg0.method618((byte) 100) == 1;
                    super.field5222 = ~arg0.method618((byte) 100) == -2;
                    super.field5238 = arg0.method618((byte) 100);
                    if (super.field5238 > 2) {
                        super.field5238 = 2;
                    }
                    if (var3 >= 17) {
                        super.field5213 = arg0.method618((byte) 100);
                    }
                    if (~var3 > -3) {
                        super.field5231 = arg0.method618((byte) 100) == 1;
                        arg0.method618((byte) 100);
                    } else {
                        super.field5231 = arg0.method618((byte) 100) == 1;
                        if (~var3 <= -18) {
                            super.field5197 = ~arg0.method618((byte) 100) == -2;
                        }
                    }
                    super.field5194 = arg0.method618((byte) 100) == 1;
                    super.field5220 = arg0.method618((byte) 100) == 1;
                    super.field5225 = arg0.method618((byte) 100);
                    if (super.field5225 > 2) {
                        super.field5225 = 2;
                    }
                    super.field5212 = super.field5225;
                    super.field5198 = ~arg0.method618((byte) 100) == arg1;
                    super.field5216 = arg0.method618((byte) 100);
                    if (super.field5216 > 127) {
                        super.field5216 = 127;
                    }
                    super.field5226 = arg0.method618((byte) 100);
                    super.field5221 = arg0.method618((byte) 100);
                    if (super.field5221 > 127) {
                        super.field5221 = 127;
                    }
                    if (~var3 <= -2) {
                        super.field5228 = arg0.method631(10494);
                        super.field5207 = arg0.method631(arg1 + 10496);
                    }
                    if (~var3 <= -4 && ~var3 > -7) {
                        arg0.method618((byte) 100);
                    }
                    if (var3 >= 4) {
                        int var5 = arg0.method618((byte) 100);
                        if (~var5 > -1 || var5 > 2) {
                            var5 = 0;
                        }
                        if (~class455.field6684 > -97) {
                            var5 = 0;
                        }
                        class466.method2784(var5, (byte) -78);
                    }
                    if (~var3 <= -6) {
                        super.field5215 = arg0.method626((byte) 100);
                    }
                    int var6 = 0;
                    if (~var3 <= -7) {
                        super.field5234 = var6 = arg0.method618((byte) 100);
                    }
                    if (~super.field5234 != -2 && ~super.field5234 != -3) {
                        super.field5234 = 2;
                    }
                    if (~var3 <= -8) {
                        super.field5227 = arg0.method618((byte) 100) == 1;
                    }
                    if (var3 >= 8) {
                        super.field5229 = ~arg0.method618((byte) 100) == -2;
                    }
                    if (var3 >= 9) {
                        super.field5219 = arg0.method618((byte) 100);
                    }
                    if (super.field5219 < 0 || super.field5219 > class237.method1602(-109, class455.field6684)) {
                        super.field5219 = 0;
                    }
                    if (~var3 <= -11) {
                        super.field5211 = arg0.method618((byte) 100) != 0;
                    }
                    if (~var3 <= -12) {
                        super.field5202 = ~arg0.method618((byte) 100) != -1;
                    }
                    if (~var3 <= -13) {
                        super.field5223 = arg0.method618((byte) 100);
                    }
                    if (super.field5223 < 0 || super.field5223 > 2) {
                        super.field5223 = 1;
                    }
                    if (~var3 <= -14) {
                        super.field5210 = arg0.method618((byte) 100) == 1;
                    }
                    if (var3 < 14) {
                        if (~var6 == -1) {
                            super.field5239 = 2;
                        } else {
                            super.field5239 = 1;
                        }
                    } else {
                        super.field5239 = arg0.method618((byte) 100);
                    }
                    if (~super.field5239 > -1 || super.field5239 > 3) {
                        super.field5239 = 2;
                    }
                    if (~var3 <= -16) {
                        super.field5204 = arg0.method618((byte) 100);
                        if (super.field5204 < 0 || ~super.field5204 < -5) {
                            super.field5204 = class33.field521 == 1 ? 2 : 4;
                        }
                    }
                    if (~var3 <= -17) {
                        super.field5209 = arg0.method618((byte) 100) == 1;
                    }
                    if (var3 < 17 && super.field5239 == 0) {
                        super.field5239 = 2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZLhu;)V")
    public final void method1731(boolean arg0, class469 arg1) {
        if (!arg0) {
            field3775 = null;
        }
        ++field3777;
        class497 var3 = null;
        try {
            class125 var4 = arg1.method2813("", (byte) -121);
            while (~var4.field1791 == -1) {
                class106.method710(1L, (byte) 6);
            }
            if (var4.field1791 == 1) {
                var3 = (class497) var4.field1793;
                class91 var5 = this.method1732(arg0);
                var3.method2962(!arg0, var5.field1292, var5.field1277, 0);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method2961((byte) -27);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)Ltl;")
    public final class91 method1732(boolean arg0) {
        ++field3778;
        class91 var2 = new class91(41);
        var2.method625(17, false);
        var2.method625(super.field5195, false);
        var2.method625(super.field5203 ? 1 : 0, false);
        var2.method625(!super.field5237 ? 0 : 1, false);
        var2.method625(!super.field5196 ? 0 : 1, false);
        var2.method625(!super.field5200 ? 0 : 1, false);
        var2.method625(0, !arg0);
        var2.method625(!super.field5208 ? 0 : 1, false);
        var2.method625(!super.field5235 ? 0 : 1, false);
        var2.method625(!super.field5222 ? 0 : 1, false);
        var2.method625(super.field5238, false);
        var2.method625(super.field5213, false);
        var2.method625(!super.field5231 ? 0 : 1, false);
        var2.method625(super.field5197 ? 1 : 0, false);
        var2.method625(!super.field5194 ? 0 : 1, !arg0);
        var2.method625(!super.field5220 ? 0 : 1, false);
        var2.method625(super.field5225, false);
        if (!arg0) {
            field3768 = null;
        }
        var2.method625(super.field5198 ? 1 : 0, false);
        var2.method625(super.field5216, false);
        var2.method625(super.field5226, false);
        var2.method625(super.field5221, !arg0);
        var2.method600(super.field5228, -12891);
        var2.method600(super.field5207, -12891);
        var2.method625(class453.method2728(2), false);
        var2.method615(28010, super.field5215);
        var2.method625(super.field5234, false);
        var2.method625(super.field5227 ? 1 : 0, false);
        var2.method625(super.field5229 ? 1 : 0, false);
        var2.method625(super.field5219, !arg0);
        var2.method625(!super.field5211 ? 0 : 1, false);
        var2.method625(super.field5202 ? 1 : 0, !arg0);
        var2.method625(super.field5223, false);
        var2.method625(!super.field5210 ? 0 : 1, false);
        var2.method625(super.field5239, !arg0);
        var2.method625(super.field5204, !arg0);
        var2.method625(!super.field5209 ? 0 : 1, false);
        return var2;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(II)Z")
    public final boolean method1733(int arg0, int arg1) {
        if (arg1 >= -116) {
            return true;
        } else {
            ++field3772;
            return arg0 == 0 ? super.field5203 : true;
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(II)Z")
    public final boolean method1734(int arg0, int arg1) {
        ++field3771;
        if (arg0 <= 113) {
            this.method1731(false, (class469) null);
        }
        return arg1 == 0 && !this.field3774 ? super.field5203 : true;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lhu;)V")
    public class271(class469 arg0) {
        super.field5195 = 3;
        this.method1737(true, (byte) -93);
        super.field5197 = false;
        super.field5198 = true;
        super.field5196 = true;
        super.field5231 = true;
        super.field5221 = 127;
        super.field5228 = 0;
        super.field5213 = 0;
        super.field5237 = true;
        super.field5200 = true;
        super.field5208 = true;
        super.field5212 = 0;
        super.field5220 = true;
        super.field5226 = 255;
        super.field5223 = 1;
        super.field5225 = 0;
        super.field5238 = 2;
        super.field5216 = 127;
        super.field5235 = true;
        super.field5207 = 0;
        super.field5222 = true;
        super.field5194 = true;
        if (class455.field6684 < 96) {
            class466.method2784(0, (byte) -76);
        } else {
            class466.method2784(2, (byte) -46);
        }
        super.field5210 = true;
        super.field5211 = false;
        super.field5215 = 0;
        super.field5202 = true;
        super.field5227 = false;
        super.field5239 = 2;
        super.field5229 = false;
        super.field5204 = ~class33.field521 != -2 ? 4 : 2;
        super.field5219 = 0;
        super.field5234 = 2;
        class497 var2 = null;
        try {
            class125 var3 = arg0.method2813("", (byte) 35);
            while (var3.field1791 == 0) {
                class106.method710(1L, (byte) 6);
            }
            if (var3.field1791 == 1) {
                var2 = (class497) var3.field1793;
                byte[] var4 = new byte[(int) var2.method2957(0)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method2959(var5, var4.length + -var5, (byte) 25, var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                this.method1730(new class91(var4), -2);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2961((byte) -27);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLtl;)Lnc;")
    public static final class149 method1735(byte arg0, class91 arg1) {
        arg1.method618((byte) 100);
        ++field3776;
        int var2 = arg1.method618((byte) 100);
        class149 var3 = class296.method1903(var2, (byte) 126);
        var3.field2149 = arg1.method618((byte) 100);
        int var4 = arg1.method618((byte) 100);
        if (arg0 != -115) {
            method1729(-30);
        }
        for (int var5 = 0; ~var4 < ~var5; ++var5) {
            int var6 = arg1.method618((byte) 100);
            var3.method93(var6, (byte) 35, arg1);
        }
        var3.method99(-124);
        return var3;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIII[I)V")
    public static final void method1736(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        --arg2;
        ++field3766;
        if (arg3 == -11) {
            int var6 = arg0 - 1;
            int var5 = var6 + -7;
            while (~var5 < ~arg2) {
                int var7 = arg2 + 1;
                arg4[var7] = arg1;
                int var8 = var7 + 1;
                arg4[var8] = arg1;
                int var9 = var8 + 1;
                arg4[var9] = arg1;
                int var10 = var9 + 1;
                arg4[var10] = arg1;
                int var11 = var10 + 1;
                arg4[var11] = arg1;
                int var12 = var11 + 1;
                arg4[var12] = arg1;
                int var13 = var12 + 1;
                arg4[var13] = arg1;
                arg2 = var13 + 1;
                arg4[arg2] = arg1;
            }
            while (arg2 < var6) {
                ++arg2;
                arg4[arg2] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZB)V")
    public final void method1737(boolean arg0, byte arg1) {
        int var3 = 103 % ((11 - arg1) / 44);
        ++field3767;
        super.field5203 = arg0;
        if (class56.field755 != null) {
            class56.field755.method2037(!this.method1734(120, class441.field6563), -148568433);
        }
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(II)I")
    public final int method1738(int arg0, int arg1) {
        if (arg0 != -97) {
            this.field3773 = true;
        }
        ++field3770;
        if (this.field3773) {
            return 0;
        } else if (!this.method1734(125, arg1)) {
            return 1;
        } else {
            return super.field5237 ? 2 : 1;
        }
    }

    static {
        new class375("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
    }
}
