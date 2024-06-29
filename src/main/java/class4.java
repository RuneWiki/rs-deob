import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 extends class363 implements class529 {

    @OriginalMember(owner = "client!ft", name = "F", descriptor = "Lbi;")
    public class335 field61;

    @OriginalMember(owner = "client!ft", name = "K", descriptor = "Z")
    private boolean field66;

    @OriginalMember(owner = "client!ft", name = "G", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ft", name = "I", descriptor = "[Llv;")
    public static class308[] field64;

    @OriginalMember(owner = "client!ft", name = "J", descriptor = "Lgk;")
    public static class331 field65;

    @OriginalMember(owner = "client!ft", name = "N", descriptor = "Lbg;")
    public static class324 field69;

    @OriginalMember(owner = "client!ft", name = "O", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!ft", name = "p", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ft", name = "q", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!ft", name = "r", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!ft", name = "s", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!ft", name = "t", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!ft", name = "u", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ft", name = "v", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!ft", name = "w", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!ft", name = "x", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!ft", name = "y", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!ft", name = "z", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!ft", name = "A", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!ft", name = "B", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!ft", name = "C", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!ft", name = "D", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!ft", name = "H", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!ft", name = "L", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!ft", name = "E", descriptor = "[I")
    public static int[] field60;

    @OriginalMember(owner = "client!ft", name = "M", descriptor = "[I")
    public static int[] field68;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)I")
    public final int method22(byte arg0) {
        ++field57;
        if (arg0 != -70) {
            this.method35((class38) null, -50);
        }
        return this.field61.field4672;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIILpn;)Lae;")
    public static final class164 method23(int arg0, int arg1, int arg2, class523 arg3) {
        ++field45;
        int var4 = arg3.field7683 | arg2 << 8;
        class164 var5 = (class164) class427.field6304.method2871((long) var4 << 16, (byte) 74);
        if (var5 != null) {
            return var5;
        } else {
            byte[] var6 = class82.field1116.method2381(class82.field1116.method2376(-14943, var4), arg0 ^ -11640);
            if (arg0 != 11639) {
                return null;
            } else if (var6 != null) {
                if (var6.length <= 1) {
                    return null;
                } else {
                    class164 var7 = class245.method1607((byte) -51, var6);
                    var7.field2332 = arg3;
                    class427.field6304.method2868((long) var4 << 16, var7, -8869);
                    return var7;
                }
            } else {
                int var8 = arg3.field7683 | arg1 - -65536 << 8;
                class164 var9 = (class164) class427.field6304.method2871((long) var8 << 16, (byte) 48);
                if (var9 != null) {
                    return var9;
                } else {
                    byte[] var10 = class82.field1116.method2381(class82.field1116.method2376(arg0 ^ -5930, var8), -1);
                    if (var10 != null) {
                        if (var10.length <= 1) {
                            return null;
                        } else {
                            class164 var11 = class245.method1607((byte) -23, var10);
                            var11.field2332 = arg3;
                            class427.field6304.method2868((long) var8 << 16, var11, -8869);
                            return var11;
                        }
                    } else {
                        int var12 = 16776960 | arg3.field7683;
                        class164 var13 = (class164) class427.field6304.method2871((long) var12 << 16, (byte) 104);
                        if (var13 != null) {
                            return var13;
                        } else {
                            byte[] var14 = class82.field1116.method2381(class82.field1116.method2376(-14943, var12), -1);
                            if (var14 != null) {
                                if (~var14.length >= -2) {
                                    return null;
                                } else {
                                    class164 var15 = class245.method1607((byte) 108, var14);
                                    var15.field2332 = arg3;
                                    class427.field6304.method2868((long) var12 << 16, var15, -8869);
                                    return var15;
                                }
                            } else {
                                return null;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lya;II)Lt;")
    public final class471 method24(class38 arg0, int arg1, int arg2) {
        ++field56;
        int var4 = -124 % ((arg2 - 54) / 56);
        return this.field61.method2042(0, false, arg0, 0, arg1, (byte) 120, false);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IILfi;BZLya;I)V")
    public final void method25(int arg0, int arg1, class388 arg2, byte arg3, boolean arg4, class38 arg5, int arg6) {
        ++field48;
        if (arg3 == -99) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZLya;)V")
    public final void method26(boolean arg0, class38 arg1) {
        ++field63;
        this.field61.method2052(arg0, arg1);
    }

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(I)I")
    public final int method27(int arg0) {
        int var2 = 16 % ((39 - arg0) / 41);
        ++field67;
        return this.field61.field4650;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Z)I")
    public final int method28(boolean arg0) {
        if (!arg0) {
            return 122;
        } else {
            ++field50;
            return this.field61.field4668;
        }
    }

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "(I)V")
    public final void method29(int arg0) {
        ++field46;
        int var2 = 15 % ((57 - arg0) / 44);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lya;Lrd;IIIIIZII)V")
    public class4(class38 arg0, class222 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field3194, arg1.field3211);
        this.field61 = new class335(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field66 = ~arg1.field3200 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)Z")
    public final boolean method30(int arg0) {
        if (arg0 != 10869) {
            this.field66 = true;
        }
        ++field47;
        return this.field61.method2048(arg0 ^ -10870);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lya;I)V")
    public final void method31(class38 arg0, int arg1) {
        if (arg1 != -12694) {
            field60 = null;
        }
        this.field61.method2046(262144, arg0);
        ++field53;
    }

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "(B)Z")
    public final boolean method32(byte arg0) {
        ++field49;
        if (arg0 < 104) {
            this.method22((byte) -37);
        }
        return false;
    }

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "(I)V")
    public static void method33(int arg0) {
        field60 = null;
        field64 = null;
        field65 = null;
        field69 = null;
        if (arg0 != 30517) {
            field68 = null;
        }
        field68 = null;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IILya;I)Z")
    public final boolean method34(int arg0, int arg1, class38 arg2, int arg3) {
        ++field51;
        class471 var5 = this.field61.method2042(super.field5044, false, arg2, super.field5042, 131072, (byte) 124, false);
        if (arg1 != 0) {
            return false;
        } else if (var5 == null) {
            return false;
        } else {
            class122 var6 = arg2.method362();
            var6.method249(super.field5042, super.field5045, super.field5044);
            return var5.method443(arg3, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(Lya;I)V")
    public final void method35(class38 arg0, int arg1) {
        if (arg1 < 53) {
            this.method26(true, (class38) null);
        }
        ++field58;
        class471 var3 = this.field61.method2042(super.field5044, true, arg0, super.field5042, 262144, (byte) 125, true);
        if (var3 != null) {
            int var4 = super.field5042 >> 7;
            int var5 = super.field5044 >> 7;
            this.field61.method2050(false, var5, 28146, var3, var4, arg0, var5, var4);
        }
    }

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "(I)V")
    public static final void method36(int arg0) {
        ++field59;
        int var1 = 0;
        if (class478.field7044.method1540(29083, class65.field802)) {
            int var2 = var1 | 1;
            int var3 = var2 | 16;
            int var4 = var3 | 32;
            int var5 = var4 | 2;
            var1 = var5 | 4;
        }
        if (!class478.field7044.field3356) {
            var1 |= 64;
        }
        class164.method1164(var1, arg0 + 275);
        class384.field5645.method784(var1, false);
        class270.field3995.method15(var1, 8);
        class515.field7587.method1211(var1, 1);
        class151.field2145.method2111(var1, false);
        class24.method211(var1, (byte) -94);
        class366.method2263((byte) -3, var1);
        class503.method3012(1, var1);
        class450.method2722(arg0 ^ arg0, var1);
        if (~class113.field1589 == -11) {
            class432.method2619((byte) -126, 28);
        } else if (class113.field1589 == 30) {
            class432.method2619((byte) -2, 25);
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIII)V")
    public static final void method37(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 110 % ((arg0 - -38) / 52);
        ++field52;
        class215 var5 = class171.method1208(arg1, (byte) 125, 9);
        var5.method1465(-25852);
        var5.field3082 = arg3;
        var5.field3081 = arg2;
    }

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(Lya;I)Lfk;")
    public final class462 method38(class38 arg0, int arg1) {
        ++field54;
        class471 var3 = this.field61.method2042(super.field5044, true, arg0, super.field5042, 2048, (byte) 123, false);
        if (var3 == null) {
            return null;
        } else {
            class122 var4 = arg0.method362();
            var4.method249(super.field5042, super.field5045, super.field5044);
            class462 var5 = null;
            if (this.field66) {
                var5 = class482.method2908(1, (byte) -95);
            }
            if (this.field61.field4660 != null) {
                class88 var6 = this.field61.field4660.method1331();
                arg0.method324(var3, var6, var4, var5 == null ? null : var5.field6800[0], 0);
            } else {
                var3.method457(var4, var5 != null ? var5.field6800[0] : null, 0);
            }
            int var7 = super.field5042 >> 7;
            if (arg1 >= -87) {
                this.method26(false, (class38) null);
            }
            int var8 = super.field5044 >> 7;
            this.field61.method2050(true, var8, 28146, var3, var7, arg0, var8, var7);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)V")
    public final void method39(int arg0) {
        ++field55;
        if (arg0 > -18) {
            method37(-90, 25, -73, 79);
        }
    }

    static {
        new class331("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
        field62 = 0;
        field64 = new class308[30];
        field65 = new class331("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
        field69 = new class324(20, 12);
        field70 = 0;
    }
}
