import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class367 extends class464 {

    @OriginalMember(owner = "client!cr", name = "N", descriptor = "I")
    public int field5593 = 99;

    @OriginalMember(owner = "client!cr", name = "P", descriptor = "Luv;")
    public static class2 field5595 = new class2(90, 8);

    @OriginalMember(owner = "client!cr", name = "S", descriptor = "Luv;")
    public static class2 field5598;

    @OriginalMember(owner = "client!cr", name = "E", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!cr", name = "F", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!cr", name = "G", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!cr", name = "H", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!cr", name = "I", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!cr", name = "J", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!cr", name = "K", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!cr", name = "L", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!cr", name = "M", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!cr", name = "O", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!cr", name = "R", descriptor = "I")
    public static int field5597;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cr", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field5599;

    @OriginalMember(owner = "client!cr", name = "Q", descriptor = "[Ll;")
    public static class127[] field5596;

    // $FF: synthetic method
    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2194(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class347("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        field5598 = new class2(101, -2);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIILep;IIIIILya;I)V", line = 3)
    public final void method2184(int arg0, int arg1, int arg2, class311 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class11 arg9, int arg10) {
        ++field5587;
        if (class454.field6661.method1533(-1, class113.field1723) || class41.method328(arg0, 2, arg1, class151.field2295, arg2)) {
            if (~arg7 > ~this.field5593) {
                this.field5593 = arg7;
            }
            class486 var12 = class119.field1824.method248(arg10, 30);
            if (!arg9.method138() || !class454.field6661.field975 || !var12.field7150) {
                int var13;
                int var14;
                if (arg5 != 1 && arg5 != 3) {
                    var13 = var12.field7235;
                    var14 = var12.field7182;
                } else {
                    var14 = var12.field7235;
                    var13 = var12.field7182;
                }
                int var15;
                int var16;
                if (super.field6753 < arg2 + var14) {
                    var15 = arg2 + 1;
                    var16 = arg2;
                } else {
                    var16 = (var14 >> 1) + arg2;
                    var15 = arg2 - -(var14 - -1 >> 1);
                }
                int var17;
                int var18;
                if (~super.field6759 <= ~(arg1 + var13)) {
                    var17 = (var13 + 1 >> 1) + arg1;
                    var18 = (var13 >> 1) + arg1;
                } else {
                    var18 = arg1;
                    var17 = arg1 + 1;
                }
                class337 var19 = class249.field3405[arg0];
                int var20 = var19.method707(var16, var18) - -var19.method707(var15, var18) - (-var19.method707(var16, var17) + -var19.method707(var15, var17)) >> 2;
                int var21 = (arg2 << 7) + (var14 << 6);
                int var22 = (arg1 << 7) + (var13 << 6);
                boolean var23 = class276.field4117 && !super.field6746 && var12.field7146;
                if (var12.method2906(120)) {
                    class454.method2644(arg5, var12, (class351) null, (byte) 38, (class480) null, arg7, arg2, arg1);
                }
                boolean var24 = ~arg6 == 0 && var12.field7165 == -1 && var12.field7174 == null && var12.field7219 == null && !var12.field7223;
                if (!class85.field1348 || (!class95.method745((byte) -114, arg4) || var12.field7157 == 1) && (!class269.method1676((byte) 119, arg4) || var12.field7157 != 0)) {
                    if (arg4 == 22) {
                        if (class454.field6661.field991 || var12.field7230 != 0 || var12.field7234 == 1 || var12.field7186) {
                            class259 var25;
                            if (!var24) {
                                var25 = new class515(arg9, var12, arg7, arg0, var21, var20, var22, super.field6746, arg5, arg6);
                            } else {
                                class410 var26 = new class410(arg9, var12, arg0, var21, var20, var22, super.field6746, arg5, var23);
                                if (var26.method232(false)) {
                                    var26.method231((byte) 33, arg9);
                                }
                                var25 = var26;
                            }
                            class259 var27 = class341.method2081(arg7, arg2, arg1);
                            if (var27 instanceof class532) {
                                ((class532) var27).field7830 = var25;
                            } else {
                                class514.method3024(arg7, arg2, arg1, var25);
                            }
                            if (~var12.field7234 == -2 && arg3 != null) {
                                arg3.method1962(arg2, arg1, 1);
                            }
                        }
                    } else if (~arg4 != -11 && arg4 != 11) {
                        if (~arg4 <= -13 && arg4 <= 17 || ~arg4 <= -19 && ~arg4 >= -22) {
                            class522 var28;
                            if (!var24) {
                                var28 = new class338(arg9, var12, arg7, arg0, var21, var20, var22, super.field6746, arg2, var14 + -1 + arg2, arg1, var13 + -1 + arg1, arg4, arg5, arg6);
                            } else {
                                class326 var29 = new class326(arg9, var12, arg7, arg0, var21, var20, var22, super.field6746, arg2, arg2 + var14 + -1, arg1, arg1 + var13 + -1, arg4, arg5, var23);
                                var28 = var29;
                                if (var29.method232(false)) {
                                    var29.method231((byte) 33, arg9);
                                }
                            }
                            class522 var30 = class534.method3160(arg7, arg2, arg1, field5599 != null ? field5599 : (field5599 = method2194("gf")));
                            if (var30 instanceof class23 && var30.field7687 == arg2 && var30.field7676 == arg1) {
                                ((class23) var30).field337 = var28;
                            } else {
                                class89.method691(var28, false);
                            }
                            if (class276.field4117 && !super.field6746 && arg4 >= 12 && arg4 <= 17 && ~arg4 != -14 && arg7 > 0 && var12.field7157 != 0) {
                                super.field6758[arg7][arg2][arg1] = (byte) class390.method2340(super.field6758[arg7][arg2][arg1], 4);
                            }
                            if (var12.field7234 != 0 && arg3 != null) {
                                arg3.method1960(arg2, var12.field7192, var14, !var12.field7166, (byte) 55, arg1, var13);
                            }
                        } else if (~arg4 == -1) {
                            int var31 = var12.field7157;
                            if (class424.field6325 && ~var12.field7157 == 0) {
                                var31 = 1;
                            }
                            class512 var33;
                            if (var24) {
                                class53 var32 = new class53(arg9, var12, arg0, var21, var20, var22, super.field6746, arg4, arg5, var23);
                                if (var32.method232(false)) {
                                    var32.method231((byte) 33, arg9);
                                }
                                var33 = var32;
                            } else {
                                var33 = new class407(arg9, var12, arg7, arg0, var21, var20, var22, super.field6746, arg4, arg5, arg6);
                            }
                            class512 var34 = class222.method1406(arg7, arg2, arg1);
                            if (!(var34 instanceof class157)) {
                                class157.method1117(arg7, arg2, arg1, var33, (class512) null);
                            } else {
                                ((class157) var34).field2374 = var33;
                            }
                            if (class276.field4117) {
                                if (arg5 == 0) {
                                    if (var12.field7179) {
                                        var19.method719(arg2, arg1, 50);
                                        var19.method719(arg2, arg1 + 1, 50);
                                    }
                                    if (var31 == 1 && !super.field6746) {
                                        super.field6758[arg7][arg2][arg1] = (byte) class390.method2340(super.field6758[arg7][arg2][arg1], 1);
                                    }
                                } else if (~arg5 == -2) {
                                    if (var12.field7179) {
                                        var19.method719(arg2, arg1 + 1, 50);
                                        var19.method719(arg2 + 1, arg1 + 1, 50);
                                    }
                                    if (~var31 == -2 && !super.field6746) {
                                        super.field6758[arg7][arg2][arg1 + 1] = (byte) class390.method2340(super.field6758[arg7][arg2][arg1 + 1], 2);
                                    }
                                } else if (~arg5 == -3) {
                                    if (var12.field7179) {
                                        var19.method719(arg2 - -1, arg1, 50);
                                        var19.method719(arg2 + 1, arg1 - -1, 50);
                                    }
                                    if (~var31 == -2 && !super.field6746) {
                                        super.field6758[arg7][arg2 + 1][arg1] = (byte) class390.method2340(super.field6758[arg7][arg2 + 1][arg1], 1);
                                    }
                                } else if (arg5 == 3) {
                                    if (var12.field7179) {
                                        var19.method719(arg2, arg1, 50);
                                        var19.method719(arg2 + 1, arg1, 50);
                                    }
                                    if (~var31 == -2 && !super.field6746) {
                                        super.field6758[arg7][arg2][arg1] = (byte) class390.method2340(super.field6758[arg7][arg2][arg1], 2);
                                    }
                                }
                            }
                            if (~var12.field7234 != -1 && arg3 != null) {
                                arg3.method1956(var12.field7192, arg2, arg5, 3, arg4, arg1, !var12.field7166);
                            }
                            if (~var12.field7215 != -17) {
                                class313.method1971(arg7, arg2, arg1, var12.field7215);
                            }
                        } else if (arg4 == 1) {
                            class512 var36;
                            if (var24) {
                                class53 var35 = new class53(arg9, var12, arg0, var21, var20, var22, super.field6746, arg4, arg5, var23);
                                if (var35.method232(false)) {
                                    var35.method231((byte) 33, arg9);
                                }
                                var36 = var35;
                            } else {
                                var36 = new class407(arg9, var12, arg7, arg0, var21, var20, var22, super.field6746, arg4, arg5, arg6);
                            }
                            class512 var37 = class222.method1406(arg7, arg2, arg1);
                            if (!(var37 instanceof class157)) {
                                class157.method1117(arg7, arg2, arg1, var36, (class512) null);
                            } else {
                                ((class157) var37).field2374 = var36;
                            }
                            if (var12.field7179 && class276.field4117) {
                                if (arg5 != 0) {
                                    if (arg5 == 1) {
                                        var19.method719(arg2 - -1, arg1 + 1, 50);
                                    } else if (~arg5 != -3) {
                                        if (arg5 == 3) {
                                            var19.method719(arg2, arg1, 50);
                                        }
                                    } else {
                                        var19.method719(arg2 + 1, arg1, 50);
                                    }
                                } else {
                                    var19.method719(arg2, arg1 + 1, 50);
                                }
                            }
                            if (~var12.field7234 != -1 && arg3 != null) {
                                arg3.method1956(var12.field7192, arg2, arg5, 3, arg4, arg1, !var12.field7166);
                            }
                        } else if (~arg4 == -3) {
                            int var38 = 3 & arg5 - -1;
                            class512 var41;
                            class512 var42;
                            if (var24) {
                                class53 var39 = new class53(arg9, var12, arg0, var21, var20, var22, super.field6746, arg4, arg5 + 4, var23);
                                class53 var40 = new class53(arg9, var12, arg0, var21, var20, var22, super.field6746, arg4, var38, var23);
                                if (var39.method232(false)) {
                                    var39.method231((byte) 33, arg9);
                                }
                                if (var40.method232(false)) {
                                    var40.method231((byte) 33, arg9);
                                }
                                var41 = var39;
                                var42 = var40;
                            } else {
                                var41 = new class407(arg9, var12, arg7, arg0, var21, var20, var22, super.field6746, arg4, arg5 - -4, arg6);
                                var42 = new class407(arg9, var12, arg7, arg0, var21, var20, var22, super.field6746, arg4, var38, arg6);
                            }
                            class157.method1117(arg7, arg2, arg1, var41, var42);
                            if (var12.field7157 == 1 && class276.field4117 && !super.field6746) {
                                if (~arg5 != -1) {
                                    if (arg5 == 1) {
                                        super.field6758[arg7][arg2][arg1 + 1] = (byte) class390.method2340(super.field6758[arg7][arg2][arg1 + 1], 2);
                                        super.field6758[arg7][arg2 + 1][arg1] = (byte) class390.method2340(super.field6758[arg7][arg2 + 1][arg1], 1);
                                    } else if (arg5 == 2) {
                                        super.field6758[arg7][arg2 + 1][arg1] = (byte) class390.method2340(super.field6758[arg7][arg2 + 1][arg1], 1);
                                        super.field6758[arg7][arg2][arg1] = (byte) class390.method2340(super.field6758[arg7][arg2][arg1], 2);
                                    } else if (arg5 == 3) {
                                        super.field6758[arg7][arg2][arg1] = (byte) class390.method2340(super.field6758[arg7][arg2][arg1], 2);
                                        super.field6758[arg7][arg2][arg1] = (byte) class390.method2340(super.field6758[arg7][arg2][arg1], 1);
                                    }
                                } else {
                                    super.field6758[arg7][arg2][arg1] = (byte) class390.method2340(super.field6758[arg7][arg2][arg1], 1);
                                    super.field6758[arg7][arg2][arg1 + 1] = (byte) class390.method2340(super.field6758[arg7][arg2][arg1 + 1], 2);
                                }
                            }
                            if (~var12.field7234 != -1 && arg3 != null) {
                                arg3.method1956(var12.field7192, arg2, arg5, 3, arg4, arg1, !var12.field7166);
                            }
                            if (~var12.field7215 != -17) {
                                class313.method1971(arg7, arg2, arg1, var12.field7215);
                            }
                        } else if (arg4 == 3) {
                            class512 var44;
                            if (var24) {
                                class53 var43 = new class53(arg9, var12, arg0, var21, var20, var22, super.field6746, arg4, arg5, var23);
                                if (var43.method232(false)) {
                                    var43.method231((byte) 33, arg9);
                                }
                                var44 = var43;
                            } else {
                                var44 = new class407(arg9, var12, arg7, arg0, var21, var20, var22, super.field6746, arg4, arg5, arg6);
                            }
                            class512 var45 = class222.method1406(arg7, arg2, arg1);
                            if (var45 instanceof class157) {
                                ((class157) var45).field2374 = var44;
                            } else {
                                class157.method1117(arg7, arg2, arg1, var44, (class512) null);
                            }
                            if (var12.field7179 && class276.field4117) {
                                if (arg5 == 0) {
                                    var19.method719(arg2, arg1 + 1, 50);
                                } else if (~arg5 != -2) {
                                    if (~arg5 == -3) {
                                        var19.method719(arg2 + 1, arg1, 50);
                                    } else if (arg5 == 3) {
                                        var19.method719(arg2, arg1, 50);
                                    }
                                } else {
                                    var19.method719(arg2 - -1, arg1 + 1, 50);
                                }
                            }
                            if (var12.field7234 != 0 && arg3 != null) {
                                arg3.method1956(var12.field7192, arg2, arg5, 3, arg4, arg1, !var12.field7166);
                            }
                        } else if (arg4 == 9) {
                            class522 var47;
                            if (var24) {
                                class326 var46 = new class326(arg9, var12, arg7, arg0, var21, var20, var22, super.field6746, arg2, arg2, arg1, arg1, arg4, arg5, var23);
                                var47 = var46;
                                if (var46.method232(false)) {
                                    var46.method231((byte) 33, arg9);
                                }
                            } else {
                                var47 = new class338(arg9, var12, arg7, arg0, var21, var20, var22, super.field6746, arg2, var14 + -1 + arg2, arg1, arg1 + var13 - 1, arg4, arg5, arg6);
                            }
                            class522 var48 = class534.method3160(arg7, arg2, arg1, field5599 != null ? field5599 : (field5599 = method2194("gf")));
                            if (var48 instanceof class23 && ~var48.field7687 == ~arg2 && ~var48.field7676 == ~arg1) {
                                ((class23) var48).field337 = var47;
                            } else {
                                class89.method691(var47, false);
                            }
                            if (var12.field7234 != 0 && arg3 != null) {
                                arg3.method1960(arg2, var12.field7192, var14, !var12.field7166, (byte) 102, arg1, var13);
                            }
                            if (~var12.field7215 != -17) {
                                class313.method1971(arg7, arg2, arg1, var12.field7215);
                            }
                        } else if (arg4 == 4) {
                            class169 var49;
                            if (!var24) {
                                var49 = new class125(arg9, var12, arg7, arg0, var21, var20, var22, super.field6746, 0, 0, 0, arg4, arg5, arg6);
                            } else {
                                class386 var50 = new class386(arg9, var12, arg0, var21, var20, var22, super.field6746, 0, 0, 0, arg4, arg5);
                                var49 = var50;
                                if (var50.method232(false)) {
                                    var50.method231((byte) 33, arg9);
                                }
                            }
                            class169 var51 = class118.method886(arg7, arg2, arg1);
                            if (!(var51 instanceof class239)) {
                                class349.method2111(arg7, arg2, arg1, var49, (class169) null);
                            } else {
                                ((class239) var51).field3352 = var49;
                            }
                        } else if (~arg4 == -6) {
                            int var52 = 17;
                            class401 var53 = (class401) class222.method1406(arg7, arg2, arg1);
                            if (var53 != null) {
                                var52 = class119.field1824.method248(var53.method240(-15578), 30).field7215 + 1;
                            }
                            class169 var55;
                            if (var24) {
                                class386 var54 = new class386(arg9, var12, arg0, var21, var20, var22, super.field6746, 0, class44.field570[arg5] * var52, class396.field5917[arg5] * var52, arg4, arg5);
                                var55 = var54;
                                if (var54.method232(false)) {
                                    var54.method231((byte) 33, arg9);
                                }
                            } else {
                                var55 = new class125(arg9, var12, arg7, arg0, var21, var20, var22, super.field6746, 0, class44.field570[arg5] * var52, class396.field5917[arg5] * var52, arg4, arg5, arg6);
                            }
                            class169 var56 = class118.method886(arg7, arg2, arg1);
                            if (var56 instanceof class239) {
                                ((class239) var56).field3352 = var55;
                            } else {
                                class349.method2111(arg7, arg2, arg1, var55, (class169) null);
                            }
                        } else if (arg4 == 6) {
                            int var57 = 9;
                            class401 var58 = (class401) class222.method1406(arg7, arg2, arg1);
                            if (var58 != null) {
                                var57 = 1 + class119.field1824.method248(var58.method240(-15578), 30).field7215 / 2;
                            }
                            class169 var59;
                            if (!var24) {
                                var59 = new class125(arg9, var12, arg7, arg0, var21, var20, var22, super.field6746, arg5, class90.field1411[arg5] * var57, class159.field2389[arg5] * var57, arg4, arg5 - -4, arg6);
                            } else {
                                class386 var60 = new class386(arg9, var12, arg0, var21, var20, var22, super.field6746, arg5, class44.field570[arg5] * var57, class396.field5917[arg5] * var57, arg4, arg5 - -4);
                                if (var60.method232(false)) {
                                    var60.method231((byte) 33, arg9);
                                }
                                var59 = var60;
                            }
                            class169 var61 = class118.method886(arg7, arg2, arg1);
                            if (var61 instanceof class239) {
                                ((class239) var61).field3352 = var59;
                            } else {
                                class349.method2111(arg7, arg2, arg1, var59, (class169) null);
                            }
                        } else if (~arg4 == -8) {
                            int var62 = 3 & arg5 - -2;
                            class169 var63;
                            if (!var24) {
                                var63 = new class125(arg9, var12, arg7, arg0, var21, var20, var22, super.field6746, var62, 0, 0, arg4, var62 - -4, arg6);
                            } else {
                                class386 var64 = new class386(arg9, var12, arg0, var21, var20, var22, super.field6746, var62, 0, 0, arg4, var62 + 4);
                                var63 = var64;
                                if (var64.method232(false)) {
                                    var64.method231((byte) 33, arg9);
                                }
                            }
                            class169 var65 = class118.method886(arg7, arg2, arg1);
                            if (!(var65 instanceof class239)) {
                                class349.method2111(arg7, arg2, arg1, var63, (class169) null);
                            } else {
                                ((class239) var65).field3352 = var63;
                            }
                        } else {
                            if (arg8 >= -107) {
                                field5595 = null;
                            }
                            if (arg4 == 8) {
                                int var66 = 3 & arg5 + 2;
                                int var67 = 9;
                                class401 var68 = (class401) class222.method1406(arg7, arg2, arg1);
                                if (var68 != null) {
                                    var67 = 1 + class119.field1824.method248(var68.method240(-15578), 30).field7215 / 2;
                                }
                                class169 var71;
                                class169 var72;
                                if (!var24) {
                                    class125 var69 = new class125(arg9, var12, arg7, arg0, var21, var20, var22, super.field6746, arg5, class90.field1411[arg5] * var67, class159.field2389[arg5] * var67, arg4, arg5 + 4, arg6);
                                    class125 var70 = new class125(arg9, var12, arg7, arg0, var21, var20, var22, super.field6746, arg5, 0, 0, arg4, var66 + 4, arg6);
                                    var71 = var69;
                                    var72 = var70;
                                } else {
                                    class386 var73 = new class386(arg9, var12, arg0, var21, var20, var22, super.field6746, arg5, class90.field1411[arg5] * var67, class159.field2389[arg5] * var67, arg4, arg5 - -4);
                                    class386 var74 = new class386(arg9, var12, arg0, var21, var20, var22, super.field6746, arg5, 0, 0, arg4, var66 + 4);
                                    if (var73.method232(false)) {
                                        var73.method231((byte) 33, arg9);
                                    }
                                    var72 = var74;
                                    if (var74.method232(false)) {
                                        var74.method231((byte) 33, arg9);
                                    }
                                    var71 = var73;
                                }
                                class349.method2111(arg7, arg2, arg1, var71, var72);
                            }
                        }
                    } else {
                        class326 var75 = null;
                        int var76;
                        class522 var77;
                        if (!var24) {
                            var76 = 15;
                            var77 = new class338(arg9, var12, arg7, arg0, var21, var20, var22, super.field6746, arg2, arg2 + var14 - 1, arg1, arg1 - -var13 + -1, arg4, arg5, arg6);
                        } else {
                            class326 var78 = new class326(arg9, var12, arg7, arg0, var21, var20, var22, super.field6746, arg2, arg2 + var14 + -1, arg1, arg1 + var13 + -1, arg4, arg5, var23);
                            var75 = var78;
                            var77 = var78;
                            var76 = var78.method2026((byte) 126);
                        }
                        class522 var79 = class534.method3160(arg7, arg2, arg1, field5599 != null ? field5599 : (field5599 = method2194("gf")));
                        boolean var80 = false;
                        if (var79 instanceof class23 && var79.field7687 == arg2 && ~var79.field7676 == ~arg1) {
                            var80 = true;
                            ((class23) var79).field337 = var77;
                        }
                        if (var80 || class89.method691(var77, false)) {
                            if (var75 != null && var75.method232(false)) {
                                var75.method231((byte) 33, arg9);
                            }
                            if (var12.field7179 && class276.field4117) {
                                if (var76 > 30) {
                                    var76 = 30;
                                }
                                for (int var81 = 0; ~var14 <= ~var81; ++var81) {
                                    for (int var82 = 0; ~var13 <= ~var82; ++var82) {
                                        var19.method719(arg2 - -var81, arg1 + var82, var76);
                                    }
                                }
                            }
                        }
                        if (var12.field7234 != 0 && arg3 != null) {
                            arg3.method1960(arg2, var12.field7192, var14, !var12.field7166, (byte) -45, arg1, var13);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lgo;B)Lgo;", line = 720)
    public static final class310 method2185(class310 arg0, byte arg1) {
        if (arg1 != -2) {
            method2185((class310) null, (byte) -95);
        }
        ++field5586;
        if (~arg0.field4753 != 0) {
            return class52.method386(arg1 ^ -2, arg0.field4753);
        } else {
            int var2 = arg0.field4643 >>> 16;
            class34 var3 = new class34(class312.field4840);
            for (class313 var4 = (class313) var3.method286(true); var4 != null; var4 = (class313) var3.method288((byte) 63)) {
                if (~var4.field4852 == ~var2) {
                    return class52.method386(0, (int) var4.field1739);
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(III)Z", line = 750)
    public static final boolean method2186(int arg0, int arg1, int arg2) {
        ++field5585;
        if (arg1 != 1) {
            field5584 = 100;
        }
        return class487.method2910(arg2, arg0, arg1 + 73) || class242.method1474(arg2, -11, arg0);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(II[Lep;[BILya;)V", line = 767)
    public final void method2187(int arg0, int arg1, class311[] arg2, byte[] arg3, int arg4, class11 arg5) {
        if (arg0 >= -112) {
            this.method2184(-74, 20, 13, (class311) null, -11, 89, -31, 60, 71, (class11) null, -50);
        }
        ++field5589;
        class468 var7 = new class468(arg3);
        int var8 = -1;
        while (true) {
            int var9 = var7.method2723((byte) -127);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method2724(255);
                if (~var11 == -1) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = 63 & var10;
                int var13 = (var10 & 4093) >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method2765(91);
                int var16 = var15 >> 2;
                int var17 = 3 & var15;
                int var18 = arg4 + var13;
                int var19 = arg1 + var12;
                if (var18 > 0 && var19 > 0 && ~var18 > ~(super.field6753 + -1) && var19 < super.field6759 + -1) {
                    class311 var20 = null;
                    if (!super.field6746) {
                        int var21 = var14;
                        if (~(2 & class524.field7736[1][var18][var19]) == -3) {
                            var21 = var14 - 1;
                        }
                        if (~var21 <= -1) {
                            var20 = arg2[var21];
                        }
                    }
                    this.method2184(var14, var19, var18, var20, var16, var17, -1, var14, -124, arg5, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(I)V", line = 840)
    public static void method2188(int arg0) {
        field5596 = null;
        if (arg0 >= -96) {
            method2186(6, -125, 28);
        }
        field5595 = null;
        field5598 = null;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILya;IIBILep;)V", line = 853)
    public final void method2189(int arg0, class11 arg1, int arg2, int arg3, byte arg4, int arg5, class311 arg6) {
        ++field5591;
        class401 var8 = null;
        if (~arg5 == -1) {
            var8 = (class401) class222.method1406(arg2, arg0, arg3);
        }
        if (~arg5 == -2) {
            var8 = (class401) class118.method886(arg2, arg0, arg3);
        }
        if (arg5 == 2) {
            var8 = (class401) class534.method3160(arg2, arg0, arg3, field5599 != null ? field5599 : (field5599 = method2194("gf")));
        }
        if (arg5 == 3) {
            var8 = (class401) class341.method2081(arg2, arg0, arg3);
        }
        if (arg4 >= -106) {
            this.field5593 = 74;
        }
        if (var8 != null) {
            class486 var9 = class119.field1824.method248(var8.method240(-15578), 30);
            int var10 = var8.method222((byte) -113);
            int var11 = var8.method223(-19634);
            if (var9.method2906(115)) {
                class99.method764(arg0, arg2, var9, -30411, arg3);
            }
            if (var8.method232(false)) {
                var8.method225(arg1, (byte) -83);
            }
            if (~arg5 != -1) {
                if (arg5 == 1) {
                    class169 var12 = class118.method886(arg2, arg0, arg3);
                    if (var12 instanceof class239) {
                        ((class239) var12).field3352 = null;
                        return;
                    }
                    class92.method722(arg2, arg0, arg3);
                    return;
                }
                if (arg5 == 2) {
                    class522 var13 = class534.method3160(arg2, arg0, arg3, field5599 != null ? field5599 : (field5599 = method2194("gf")));
                    if (var13 instanceof class23 && var13.field7687 == arg0 && var13.field7676 == arg3) {
                        ((class23) var13).field337 = null;
                    } else {
                        class110.method845(arg2, arg0, arg3, field5599 != null ? field5599 : (field5599 = method2194("gf")));
                    }
                    if (var9.field7234 != 0 && ~super.field6753 < ~(var9.field7182 + arg0) && super.field6759 > var9.field7182 + arg3 && var9.field7235 + arg0 < super.field6753 && arg3 - -var9.field7235 < super.field6759) {
                        arg6.method1961(var9.field7235, var9.field7182, 256, var11, var9.field7192, arg3, !var9.field7166, arg0);
                        return;
                    }
                    return;
                }
                if (~arg5 == -4) {
                    class259 var14 = class341.method2081(arg2, arg0, arg3);
                    if (var14 instanceof class532) {
                        ((class532) var14).field7830 = null;
                    } else {
                        class211.method1362(arg2, arg0, arg3);
                    }
                    if (~var9.field7234 == -2) {
                        arg6.method1958(arg3, arg0, 115);
                        return;
                    }
                }
                return;
            }
            class512 var15 = class222.method1406(arg2, arg0, arg3);
            if (!(var15 instanceof class157)) {
                class218.method1378(arg2, arg0, arg3);
            } else {
                ((class157) var15).field2374 = null;
            }
            if (var9.field7234 != 0) {
                arg6.method1948((byte) -93, var11, var9.field7192, var10, arg0, !var9.field7166, arg3);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IILya;I[IIIIBLgk;I)V", line = 965)
    public final void method2190(int arg0, int arg1, class11 arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, byte arg8, class468 arg9, int arg10) {
        ++field5592;
        if (!super.field6746) {
            if (arg8 > -16) {
                field5597 = 8;
            }
            boolean var12 = false;
            class112 var13 = null;
            if (arg4 != null) {
                arg4[0] = -1;
            }
            int var14 = (arg0 & 7) * 8;
            int var15 = (7 & arg6) * 8;
            while (true) {
                while (true) {
                    while (true) {
                        while (true) {
                            while (arg9.field6868.length > arg9.field6830) {
                                int var20 = arg9.method2765(108);
                                if (var20 != 0) {
                                    if (~var20 != -2) {
                                        if (var20 != 2) {
                                            if (~var20 != -129) {
                                                if (~var20 != -130) {
                                                    throw new IllegalStateException("");
                                                }
                                                if (super.field6751 == null) {
                                                    super.field6751 = new byte[4][][];
                                                }
                                                for (int var21 = 0; ~var21 > -5; ++var21) {
                                                    byte var22 = arg9.method2714((byte) -58);
                                                    if (~var22 == -1 && super.field6751[arg5] != null) {
                                                        if (var21 <= arg1) {
                                                            int var23 = arg10;
                                                            int var24 = arg10 + 7;
                                                            int var25 = arg7;
                                                            if (arg10 >= 0) {
                                                                if (super.field6753 <= arg10) {
                                                                    var23 = super.field6753;
                                                                }
                                                            } else {
                                                                var23 = 0;
                                                            }
                                                            if (arg7 >= 0) {
                                                                if (~arg7 <= ~super.field6759) {
                                                                    var25 = super.field6759;
                                                                }
                                                            } else {
                                                                var25 = 0;
                                                            }
                                                            if (~var24 > -1) {
                                                                var24 = 0;
                                                            } else if (var24 >= super.field6753) {
                                                                var24 = super.field6753;
                                                            }
                                                            int var26 = arg7 + 7;
                                                            if (var26 < 0) {
                                                                var26 = 0;
                                                            } else if (var26 >= super.field6759) {
                                                                var26 = super.field6759;
                                                            }
                                                            while (var23 < var24) {
                                                                while (var26 > var25) {
                                                                    super.field6751[arg5][var23][var25] = 0;
                                                                    ++var25;
                                                                }
                                                                ++var23;
                                                            }
                                                        }
                                                    } else if (var22 == 1) {
                                                        if (super.field6751[arg5] == null) {
                                                            super.field6751[arg5] = new byte[super.field6753 + 1][super.field6759 + 1];
                                                        }
                                                        for (int var27 = 0; var27 < 64; var27 += 4) {
                                                            for (int var28 = 0; var28 < 64; var28 += 4) {
                                                                byte var29 = arg9.method2714((byte) -63);
                                                                if (arg1 >= var21) {
                                                                    for (int var30 = var27; ~var30 > ~(var27 + 4); ++var30) {
                                                                        for (int var31 = var28; var28 + 4 > var31; ++var31) {
                                                                            if (var30 >= var14 && var14 + 8 > var30 && ~var31 <= ~var15 && ~var15 > ~(var15 + 8)) {
                                                                                int var32 = class276.method1724(arg3, 7 & var30, (byte) -5, 7 & var31) + arg10;
                                                                                int var33 = arg7 + class163.method1148(-2, var30 & 7, arg3, var31 & 7);
                                                                                if (var32 >= 0 && ~super.field6753 < ~var32 && var33 >= 0 && super.field6759 > var33) {
                                                                                    super.field6751[arg5][var32][var33] = var29;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (arg4 == null) {
                                                arg9.field6830 += 10;
                                            } else {
                                                arg4[0] = arg9.method2727((byte) 43);
                                                arg4[1] = arg9.method2745(-1);
                                                arg4[2] = arg9.method2745(-1);
                                                arg4[3] = arg9.method2745(-1);
                                                arg4[4] = arg9.method2727((byte) 43);
                                            }
                                        } else {
                                            if (var13 == null) {
                                                var13 = new class112();
                                            }
                                            var13.method871((byte) 59, arg9);
                                        }
                                    } else {
                                        int var34 = arg9.method2765(106);
                                        if (~var34 < -1) {
                                            for (int var35 = 0; ~var35 > ~var34; ++var35) {
                                                class466 var36 = new class466(arg2, arg9, 0);
                                                if (~var36.field6779 == -32) {
                                                    class211 var37 = class25.field372.method1414(arg9.method2727((byte) 43), -96);
                                                    var36.method2709(var37.field3035, var37.field3037, 5, var37.field3042, var37.field3034);
                                                }
                                                if (arg2.method72() > 0) {
                                                    class531 var38 = var36.field6794;
                                                    int var39 = var38.method3157(-66) >> 7;
                                                    int var40 = var38.method3150((byte) 107) >> 7;
                                                    if (~var36.field6784 == ~arg1 && var14 <= var39 && ~(var14 - -8) < ~var39 && var15 <= var40 && ~(var15 + 8) < ~var40) {
                                                        int var41 = (arg10 << 7) - -class464.method2689(var38.method3150((byte) 107) & 1023, 1023 & var38.method3157(-86), (byte) 117, arg3);
                                                        int var42 = class268.method1671(var38.method3150((byte) 107) & 1023, (byte) 123, 1023 & var38.method3157(-86), arg3) + (arg7 << 7);
                                                        int var43 = var41 >> 7;
                                                        int var44 = var42 >> 7;
                                                        if (~var43 <= -1 && var44 >= 0 && ~super.field6753 < ~var43 && var44 < super.field6759) {
                                                            var38.method1491(super.field6742[arg1][var43][var44] - var38.method3154(false), var41, (byte) 116, var42);
                                                            class473.method2812(var36);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    var13 = new class112(arg9);
                                }
                            }
                            if (var13 != null) {
                                class465.method2702(var13, arg10 >> 3, 16764604, arg7 >> 3);
                            }
                            if (!var12 && super.field6751 != null && super.field6751[arg5] != null) {
                                int var16 = arg10 + 7;
                                int var17 = arg7 + 7;
                                for (int var18 = arg10; var18 < var16; ++var18) {
                                    for (int var19 = arg7; ~var19 > ~var17; ++var19) {
                                        super.field6751[arg5][var18][var19] = 0;
                                    }
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I[BI[Lep;IIBILya;II)V", line = 1256)
    public final void method2191(int arg0, byte[] arg1, int arg2, class311[] arg3, int arg4, int arg5, byte arg6, int arg7, class11 arg8, int arg9, int arg10) {
        ++field5594;
        class468 var12 = new class468(arg1);
        int var13 = 6 % ((arg6 - -93) / 32);
        int var14 = -1;
        while (true) {
            int var15 = var12.method2723((byte) -128);
            if (~var15 == -1) {
                return;
            }
            var14 += var15;
            int var16 = 0;
            while (true) {
                int var17 = var12.method2724(255);
                if (~var17 == -1) {
                    break;
                }
                var16 += var17 + -1;
                int var18 = var16 & 63;
                int var19 = (var16 & 4037) >> 6;
                int var20 = var16 >> 12;
                int var21 = var12.method2765(89);
                int var22 = var21 >> 2;
                int var23 = var21 & 3;
                if (arg10 == var20 && ~var19 <= ~arg0 && var19 < arg0 + 8 && ~arg4 >= ~var18 && arg4 + 8 > var18) {
                    class486 var24 = class119.field1824.method248(var14, 30);
                    int var25 = arg7 - -class32.method281(arg9, var23, var24.field7235, 7 & var18, 7 & var19, 7, var24.field7182);
                    int var26 = class231.method1434(var24.field7235, arg9, 8313, 7 & var18, var24.field7182, var23, 7 & var19) + arg5;
                    if (~var25 < -1 && ~var26 < -1 && var25 < super.field6753 - 1 && ~var26 > ~(super.field6759 + -1)) {
                        class311 var27 = null;
                        if (!super.field6746) {
                            int var28 = arg2;
                            if ((2 & class524.field7736[1][var25][var26]) == 2) {
                                var28 = arg2 - 1;
                            }
                            if (~var28 <= -1) {
                                var27 = arg3[var28];
                            }
                        }
                        this.method2184(arg2, var26, var25, var27, var22, 3 & arg9 + var23, -1, arg2, -110, arg8, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(IIIZ)V", line = 2008)
    public class367(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class59.field813, class293.field4386);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lya;I)V", line = 1342)
    public final void method2192(class11 arg0, int arg1) {
        ++field5590;
        class281.method1746(arg0);
        if (super.field6761 > 1) {
            for (int var3 = 0; ~var3 > ~super.field6753; ++var3) {
                for (int var4 = 0; ~var4 > ~super.field6759; ++var4) {
                    if ((2 & class524.field7736[1][var3][var4]) == 2) {
                        class93.method731(var3, var4);
                    }
                }
            }
        }
        int var5 = 0;
        if (arg1 != 3) {
            this.method2192((class11) null, 1);
        }
        while (~var5 > ~super.field6761) {
            for (int var6 = 0; ~var6 >= ~super.field6759; ++var6) {
                for (int var7 = 0; ~super.field6753 <= ~var7; ++var7) {
                    if ((super.field6758[var5][var7][var6] & 1) != 0) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        int var11 = var5;
                        while (~var8 < -1 && (1 & super.field6758[var5][var7][var8 + -1]) != 0) {
                            --var8;
                        }
                        while (super.field6759 > var9 && (1 & super.field6758[var5][var7][var9 + 1]) != 0) {
                            ++var9;
                        }
                        label168: while (var10 > 0) {
                            for (int var12 = var8; ~var12 >= ~var9; ++var12) {
                                if (~(1 & super.field6758[var10 - 1][var7][var12]) == -1) {
                                    break label168;
                                }
                            }
                            --var10;
                        }
                        label157: while (~var11 > -4) {
                            for (int var13 = var8; var13 <= var9; ++var13) {
                                if ((super.field6758[var11 + 1][var7][var13] & 1) == 0) {
                                    break label157;
                                }
                            }
                            ++var11;
                        }
                        int var14 = (var11 - (-1 - -var10)) * (-var8 + 1 + var9);
                        if (var14 >= 2) {
                            short var15 = 240;
                            int var16 = super.field6742[var11][var7][var8] + -var15;
                            int var17 = super.field6742[var10][var7][var8];
                            class155.method1114(1, var7 << 7, var7 << 7, var8 << 7, (var9 << 7) + 128, var16, var17);
                            for (int var18 = var10; var11 >= var18; ++var18) {
                                for (int var19 = var8; ~var19 >= ~var9; ++var19) {
                                    super.field6758[var18][var7][var19] = (byte) class140.method1023(super.field6758[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if ((super.field6758[var5][var7][var6] & 2) != 0) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        int var23 = var5;
                        while (~var21 > ~super.field6753 && (super.field6758[var5][var21 + 1][var6] & 2) != 0) {
                            ++var21;
                        }
                        while (var20 > 0 && (super.field6758[var5][var20 + -1][var6] & 2) != 0) {
                            --var20;
                        }
                        label221: while (~var22 < -1) {
                            for (int var24 = var20; var24 <= var21; ++var24) {
                                if ((2 & super.field6758[var22 - 1][var24][var6]) == 0) {
                                    break label221;
                                }
                            }
                            --var22;
                        }
                        label210: while (var23 < 3) {
                            for (int var25 = var20; ~var25 >= ~var21; ++var25) {
                                if ((super.field6758[var23 - -1][var25][var6] & 2) == 0) {
                                    break label210;
                                }
                            }
                            ++var23;
                        }
                        int var26 = (-var22 + var23 - -1) * (var21 + 1 + -var20);
                        if (~var26 <= -3) {
                            short var27 = 240;
                            int var28 = super.field6742[var23][var20][var6] + -var27;
                            int var29 = super.field6742[var22][var20][var6];
                            class155.method1114(2, var20 << 7, (var21 << 7) - -128, var6 << 7, var6 << 7, var28, var29);
                            for (int var30 = var22; ~var23 <= ~var30; ++var30) {
                                for (int var31 = var20; var21 >= var31; ++var31) {
                                    super.field6758[var30][var31][var6] = (byte) class140.method1023(super.field6758[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if ((super.field6758[var5][var7][var6] & 4) != 0) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34;
                        for (var34 = var6; ~var34 < -1 && ~(4 & super.field6758[var5][var7][var34 + -1]) != -1; --var34) {
                        }
                        int var35;
                        for (var35 = var6; ~super.field6759 < ~var35 && ~(4 & super.field6758[var5][var7][var35 - -1]) != -1; ++var35) {
                        }
                        label274: while (~var32 < -1) {
                            for (int var36 = var34; ~var36 >= ~var35; ++var36) {
                                if ((super.field6758[var5][var32 - 1][var36] & 4) == 0) {
                                    break label274;
                                }
                            }
                            --var32;
                        }
                        label263: while (~super.field6753 < ~var33) {
                            for (int var37 = var34; ~var37 >= ~var35; ++var37) {
                                if ((4 & super.field6758[var5][var33 + 1][var37]) == 0) {
                                    break label263;
                                }
                            }
                            ++var33;
                        }
                        if (~((var35 - var34 + 1) * (-var32 + 1 + var33)) <= -5) {
                            int var38 = super.field6742[var5][var32][var34];
                            class155.method1114(4, var32 << 7, (var33 << 7) + 128, var34 << 7, (var35 << 7) - -128, var38, var38);
                            for (int var39 = var32; ~var33 <= ~var39; ++var39) {
                                for (int var40 = var34; var35 >= var40; ++var40) {
                                    super.field6758[var5][var39][var40] = (byte) class140.method1023(super.field6758[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
            ++var5;
        }
        super.field6758 = null;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILya;[IZILgk;)V", line = 1631)
    public final void method2193(int arg0, class11 arg1, int[] arg2, boolean arg3, int arg4, class468 arg5) {
        ++field5588;
        if (!super.field6746) {
            boolean var7 = false;
            if (arg3) {
                class112 var8 = null;
                if (arg2 != null) {
                    arg2[0] = -1;
                }
                while (true) {
                    while (~arg5.field6830 > ~arg5.field6868.length) {
                        int var18 = arg5.method2765(107);
                        if (var18 == 0) {
                            var8 = new class112(arg5);
                        } else if (var18 == 1) {
                            int var34 = arg5.method2765(59);
                            if (var34 > 0) {
                                for (int var35 = 0; ~var35 > ~var34; ++var35) {
                                    class466 var36 = new class466(arg1, arg5, 0);
                                    if (var36.field6779 == 31) {
                                        class211 var37 = class25.field372.method1414(arg5.method2727((byte) 43), 120);
                                        var36.method2709(var37.field3035, var37.field3037, 5, var37.field3042, var37.field3034);
                                    }
                                    if (arg1.method72() > 0) {
                                        class531 var38 = var36.field6794;
                                        int var39 = (arg0 << 7) + var38.method3157(-92);
                                        int var40 = var38.method3150((byte) 107) + (arg4 << 7);
                                        int var41 = var39 >> 7;
                                        int var42 = var40 >> 7;
                                        if (~var41 <= -1 && var42 >= 0 && var41 < super.field6753 && super.field6759 > var42) {
                                            var38.method1491(super.field6742[var36.field6784][var41][var42] - var38.method3154(false), var39, (byte) 120, var40);
                                            class473.method2812(var36);
                                        }
                                    }
                                }
                            }
                        } else if (~var18 == -3) {
                            if (var8 == null) {
                                var8 = new class112();
                            }
                            var8.method871((byte) 59, arg5);
                        } else if (~var18 == -129) {
                            if (arg2 != null) {
                                arg2[0] = arg5.method2727((byte) 43);
                                arg2[1] = arg5.method2745(-1);
                                arg2[2] = arg5.method2745(-1);
                                arg2[3] = arg5.method2745(-1);
                                arg2[4] = arg5.method2727((byte) 43);
                            } else {
                                arg5.field6830 += 10;
                            }
                        } else {
                            if (~var18 != -130) {
                                throw new IllegalStateException("");
                            }
                            if (super.field6751 == null) {
                                super.field6751 = new byte[4][][];
                            }
                            for (int var19 = 0; var19 < 4; ++var19) {
                                byte var20 = arg5.method2714((byte) -75);
                                if (~var20 == -1 && super.field6751[var19] != null) {
                                    int var21 = arg0;
                                    int var22 = arg0 - -64;
                                    int var23 = arg4;
                                    int var24 = arg4 - -64;
                                    if (~var22 <= -1) {
                                        if (var22 >= super.field6753) {
                                            var22 = super.field6753;
                                        }
                                    } else {
                                        var22 = 0;
                                    }
                                    if (~arg0 > -1) {
                                        var21 = 0;
                                    } else if (super.field6753 <= arg0) {
                                        var21 = super.field6753;
                                    }
                                    if (~arg4 <= -1) {
                                        if (~arg4 <= ~super.field6759) {
                                            var23 = super.field6759;
                                        }
                                    } else {
                                        var23 = 0;
                                    }
                                    if (~var24 > -1) {
                                        var24 = 0;
                                    } else if (~super.field6759 >= ~var24) {
                                        var24 = super.field6759;
                                    }
                                    while (var22 > var21) {
                                        while (var23 < var24) {
                                            super.field6751[var19][var21][var23] = 0;
                                            ++var23;
                                        }
                                        ++var21;
                                    }
                                } else if (~var20 != -2) {
                                    if (~var20 == -3) {
                                        if (super.field6751[var19] == null) {
                                            super.field6751[var19] = new byte[super.field6753 - -1][super.field6759 + 1];
                                        }
                                        if (~var19 < -1) {
                                            int var25 = arg0;
                                            int var26 = arg0 + 64;
                                            int var27 = arg4;
                                            if (~var26 > -1) {
                                                var26 = 0;
                                            } else if (~var26 <= ~super.field6753) {
                                                var26 = super.field6753;
                                            }
                                            if (arg4 >= 0) {
                                                if (~arg4 <= ~super.field6759) {
                                                    var27 = super.field6759;
                                                }
                                            } else {
                                                var27 = 0;
                                            }
                                            if (~arg0 <= -1) {
                                                if (arg0 >= super.field6753) {
                                                    var25 = super.field6753;
                                                }
                                            } else {
                                                var25 = 0;
                                            }
                                            int var28 = arg4 + 64;
                                            if (var28 >= 0) {
                                                if (super.field6759 <= var28) {
                                                    var28 = super.field6759;
                                                }
                                            } else {
                                                var28 = 0;
                                            }
                                            while (var25 < var26) {
                                                while (~var28 < ~var27) {
                                                    super.field6751[var19][var25][var27] = super.field6751[var19 + -1][var25][var27];
                                                    ++var27;
                                                }
                                                ++var25;
                                            }
                                        }
                                    }
                                } else {
                                    if (super.field6751[var19] == null) {
                                        super.field6751[var19] = new byte[super.field6753 + 1][super.field6759 + 1];
                                    }
                                    for (int var29 = 0; ~var29 > -65; var29 += 4) {
                                        for (int var30 = 0; ~var30 > -65; var30 += 4) {
                                            byte var31 = arg5.method2714((byte) -67);
                                            for (int var32 = arg0 + var29; ~(arg0 + var29 + 4) < ~var32; ++var32) {
                                                for (int var33 = arg4 + var30; ~var33 > ~(var30 - (-arg4 - 4)); ++var33) {
                                                    if (var32 >= 0 && ~var32 > ~super.field6753 && var33 >= 0 && var33 < super.field6759) {
                                                        super.field6751[var19][var32][var33] = var31;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            var7 = true;
                        }
                    }
                    if (var8 != null) {
                        for (int var9 = 0; var9 < 8; ++var9) {
                            for (int var10 = 0; ~var10 > -9; ++var10) {
                                int var11 = (arg0 >> 3) + var9;
                                int var12 = (arg4 >> 3) + var10;
                                if (var11 >= 0 && var11 < super.field6753 >> 3 && ~var12 <= -1 && ~var12 > ~(super.field6759 >> 3)) {
                                    class465.method2702(var8, var11, 16764604, var12);
                                }
                            }
                        }
                    }
                    if (!var7 && super.field6751 != null) {
                        for (int var13 = 0; var13 < 4; ++var13) {
                            if (super.field6751[var13] != null) {
                                for (int var14 = 0; var14 < 16; ++var14) {
                                    for (int var15 = 0; ~var15 > -17; ++var15) {
                                        int var16 = (arg0 >> 2) - -var14;
                                        int var17 = (arg4 >> 2) + var15;
                                        if (var16 >= 0 && ~var16 > -27 && ~var17 <= -1 && var17 < 26) {
                                            super.field6751[var13][var16][var17] = 0;
                                        }
                                    }
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }
}
