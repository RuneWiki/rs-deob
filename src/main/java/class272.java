import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class272 extends class269 {

    @OriginalMember(owner = "client!caa", name = "H", descriptor = "[B")
    public byte[] field3447;

    @OriginalMember(owner = "client!caa", name = "B", descriptor = "Z")
    public static boolean field3441 = true;

    @OriginalMember(owner = "client!caa", name = "C", descriptor = "Lbca;")
    public static class604 field3442 = new class604("", 16);

    @OriginalMember(owner = "client!caa", name = "z", descriptor = "F")
    public static float field3439;

    @OriginalMember(owner = "client!caa", name = "w", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!caa", name = "x", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!caa", name = "y", descriptor = "I")
    public int field3438;

    @OriginalMember(owner = "client!caa", name = "A", descriptor = "I")
    public int field3440;

    @OriginalMember(owner = "client!caa", name = "D", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!caa", name = "F", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!caa", name = "G", descriptor = "I")
    public int field3446;

    @OriginalMember(owner = "client!caa", name = "I", descriptor = "I")
    public int field3448;

    @OriginalMember(owner = "client!caa", name = "J", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!caa", name = "L", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!caa", name = "M", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!caa", name = "E", descriptor = "Lml;")
    public static class351 field3444;

    // $FF: synthetic field
    @OriginalMember(owner = "client!caa", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field3452;

    // $FF: synthetic method
    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1557(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIIII)V", line = 6)
    public final void method1550(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3438 = arg1 - arg4;
        this.field3440 = arg3 - arg0;
        this.field3446 = arg0;
        this.field3448 = arg4;
        if (arg2 != 643436272) {
            this.field3446 = 111;
        }
        field3443++;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIIIIII)V", line = 24)
    public final void method1551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3437++;
        int var8 = 0;
        if (arg0 >= -98) {
            this.method1553(true, 89, -121);
        }
        if (arg1 != arg4) {
            var8 = (arg2 - arg3 << 16) / (arg1 - arg4);
        }
        int var9 = 0;
        if (arg1 != arg6) {
            var9 = (arg5 - arg2 << 16) / (arg6 - arg1);
        }
        int var10 = 0;
        if (arg4 != arg6) {
            var10 = (arg3 - arg5 << 16) / (arg4 - arg6);
        }
        if (arg4 <= arg1 && arg4 <= arg6) {
            if (arg6 <= arg1) {
                int var11;
                int var12 = var11 = arg3 << 16;
                int var13 = arg5 << 16;
                if (arg4 < 0) {
                    var11 -= arg4 * var8;
                    var12 -= arg4 * var10;
                    arg4 = 0;
                }
                if (arg6 < 0) {
                    var13 -= arg6 * var9;
                    arg6 = 0;
                }
                if ((arg4 == arg6 || var10 >= var8) && (arg4 != arg6 || var8 >= var9)) {
                    int var17 = arg1 - arg6;
                    int var18 = arg6 - arg4;
                    int var19 = this.field3438 * arg4;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class365.method2012(this.field3447, var13 >> 16, 32951362, var19, 0, var11 >> 16);
                                var13 += var9;
                                var11 += var8;
                                var19 += this.field3438;
                            }
                        }
                        class365.method2012(this.field3447, var12 >> 16, 32951362, var19, 0, var11 >> 16);
                        var11 += var8;
                        var12 += var10;
                        var19 += this.field3438;
                    }
                } else {
                    int var14 = arg1 - arg6;
                    int var15 = arg6 - arg4;
                    int var16 = this.field3438 * arg4;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class365.method2012(this.field3447, var11 >> 16, 32951362, var16, 0, var13 >> 16);
                                var13 += var9;
                                var16 += this.field3438;
                                var11 += var8;
                            }
                        }
                        class365.method2012(this.field3447, var11 >> 16, 32951362, var16, 0, var12 >> 16);
                        var12 += var10;
                        var11 += var8;
                        var16 += this.field3438;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg3 << 16;
                if (arg4 < 0) {
                    var20 -= arg4 * var8;
                    var21 -= arg4 * var10;
                    arg4 = 0;
                }
                int var22 = arg2 << 16;
                if (arg1 < 0) {
                    var22 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg1 != arg4 && var10 < var8 || arg1 == arg4 && var10 > var9) {
                    int var23 = arg6 - arg1;
                    int var24 = arg1 - arg4;
                    int var25 = this.field3438 * arg4;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class365.method2012(this.field3447, var22 >> 16, 32951362, var25, 0, var21 >> 16);
                                var22 += var9;
                                var25 += this.field3438;
                                var21 += var10;
                            }
                        }
                        class365.method2012(this.field3447, var20 >> 16, 32951362, var25, 0, var21 >> 16);
                        var21 += var10;
                        var20 += var8;
                        var25 += this.field3438;
                    }
                } else {
                    int var26 = arg6 - arg1;
                    int var27 = arg1 - arg4;
                    int var28 = this.field3438 * arg4;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class365.method2012(this.field3447, var21 >> 16, 32951362, var28, 0, var22 >> 16);
                                var28 += this.field3438;
                                var21 += var10;
                                var22 += var9;
                            }
                        }
                        class365.method2012(this.field3447, var21 >> 16, 32951362, var28, 0, var20 >> 16);
                        var20 += var8;
                        var28 += this.field3438;
                        var21 += var10;
                    }
                }
            }
        } else if (arg6 < arg1) {
            if (arg1 <= arg4) {
                int var29;
                int var30 = var29 = arg5 << 16;
                int var31 = arg2 << 16;
                if (arg6 < 0) {
                    var30 -= arg6 * var9;
                    var29 -= arg6 * var10;
                    arg6 = 0;
                }
                if (arg1 < 0) {
                    var31 -= arg1 * var8;
                    arg1 = 0;
                }
                if (var10 > var9) {
                    int var32 = arg4 - arg1;
                    int var33 = arg1 - arg6;
                    int var34 = this.field3438 * arg6;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class365.method2012(this.field3447, var29 >> 16, 32951362, var34, 0, var31 >> 16);
                                var34 += this.field3438;
                                var29 += var10;
                                var31 += var8;
                            }
                        }
                        class365.method2012(this.field3447, var29 >> 16, 32951362, var34, 0, var30 >> 16);
                        var30 += var9;
                        var29 += var10;
                        var34 += this.field3438;
                    }
                } else {
                    int var35 = arg4 - arg1;
                    int var36 = arg1 - arg6;
                    int var37 = this.field3438 * arg6;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class365.method2012(this.field3447, var31 >> 16, 32951362, var37, 0, var29 >> 16);
                                var37 += this.field3438;
                                var31 += var8;
                                var29 += var10;
                            }
                        }
                        class365.method2012(this.field3447, var30 >> 16, 32951362, var37, 0, var29 >> 16);
                        var37 += this.field3438;
                        var29 += var10;
                        var30 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg5 << 16;
                if (arg6 < 0) {
                    var38 -= arg6 * var10;
                    var39 -= arg6 * var9;
                    arg6 = 0;
                }
                int var40 = arg3 << 16;
                if (arg4 < 0) {
                    var40 -= arg4 * var8;
                    arg4 = 0;
                }
                if (var10 > var9) {
                    int var41 = arg1 - arg4;
                    int var42 = arg4 - arg6;
                    int var43 = this.field3438 * arg6;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class365.method2012(this.field3447, var40 >> 16, 32951362, var43, 0, var39 >> 16);
                                var43 += this.field3438;
                                var39 += var9;
                                var40 += var8;
                            }
                        }
                        class365.method2012(this.field3447, var38 >> 16, 32951362, var43, 0, var39 >> 16);
                        var43 += this.field3438;
                        var38 += var10;
                        var39 += var9;
                    }
                } else {
                    int var44 = arg1 - arg4;
                    int var45 = arg4 - arg6;
                    int var46 = this.field3438 * arg6;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class365.method2012(this.field3447, var39 >> 16, 32951362, var46, 0, var40 >> 16);
                                var40 += var8;
                                var39 += var9;
                                var46 += this.field3438;
                            }
                        }
                        class365.method2012(this.field3447, var39 >> 16, 32951362, var46, 0, var38 >> 16);
                        var46 += this.field3438;
                        var38 += var10;
                        var39 += var9;
                    }
                }
            }
        } else if (arg6 >= arg4) {
            int var47;
            int var48 = var47 = arg2 << 16;
            if (arg1 < 0) {
                var48 -= arg1 * var8;
                var47 -= arg1 * var9;
                arg1 = 0;
            }
            int var49 = arg3 << 16;
            if (arg4 < 0) {
                var49 -= arg4 * var10;
                arg4 = 0;
            }
            if (var9 <= var8) {
                int var50 = arg6 - arg4;
                int var51 = arg4 - arg1;
                int var52 = this.field3438 * arg1;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class365.method2012(this.field3447, var49 >> 16, 32951362, var52, 0, var47 >> 16);
                            var49 += var10;
                            var47 += var9;
                            var52 += this.field3438;
                        }
                    }
                    class365.method2012(this.field3447, var48 >> 16, 32951362, var52, 0, var47 >> 16);
                    var48 += var8;
                    var47 += var9;
                    var52 += this.field3438;
                }
            } else {
                int var53 = arg6 - arg4;
                int var54 = arg4 - arg1;
                int var55 = this.field3438 * arg1;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class365.method2012(this.field3447, var47 >> 16, 32951362, var55, 0, var49 >> 16);
                            var47 += var9;
                            var49 += var10;
                            var55 += this.field3438;
                        }
                    }
                    class365.method2012(this.field3447, var47 >> 16, 32951362, var55, 0, var48 >> 16);
                    var48 += var8;
                    var55 += this.field3438;
                    var47 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg2 << 16;
            int var58 = arg5 << 16;
            if (arg1 < 0) {
                var56 -= arg1 * var9;
                var57 -= arg1 * var8;
                arg1 = 0;
            }
            if (arg6 < 0) {
                var58 -= arg6 * var10;
                arg6 = 0;
            }
            if (arg1 != arg6 && var9 > var8 || arg1 == arg6 && var10 < var8) {
                int var59 = arg4 - arg6;
                int var60 = arg6 - arg1;
                int var61 = this.field3438 * arg1;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class365.method2012(this.field3447, var58 >> 16, 32951362, var61, 0, var57 >> 16);
                            var61 += this.field3438;
                            var58 += var10;
                            var57 += var8;
                        }
                    }
                    class365.method2012(this.field3447, var56 >> 16, 32951362, var61, 0, var57 >> 16);
                    var56 += var9;
                    var57 += var8;
                    var61 += this.field3438;
                }
            } else {
                int var62 = arg4 - arg6;
                int var63 = arg6 - arg1;
                int var64 = this.field3438 * arg1;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class365.method2012(this.field3447, var57 >> 16, 32951362, var64, 0, var58 >> 16);
                            var64 += this.field3438;
                            var57 += var8;
                            var58 += var10;
                        }
                    }
                    class365.method2012(this.field3447, var57 >> 16, 32951362, var64, 0, var56 >> 16);
                    var64 += this.field3438;
                    var56 += var9;
                    var57 += var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Z)V", line = 460)
    public static void method1552(boolean arg0) {
        field3444 = null;
        field3442 = null;
        if (!arg0) {
            field3442 = null;
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(ZII)Z", line = 471)
    public final boolean method1553(boolean arg0, int arg1, int arg2) {
        field3436++;
        if (arg0) {
            return true;
        } else {
            return (arg1 * arg2) <= this.field3447.length;
        }
    }

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "(I)V", line = 482)
    public static final void method1554(int arg0) {
        if (arg0 != -3) {
            method1552(true);
        }
        field3449++;
        for (class519 var1 = (class519) class520.field7440.method3174((byte) 49); var1 != null; var1 = (class519) class520.field7440.method3168(false)) {
            if (class97.field1074 == null) {
                var1.method1519((byte) 121);
            } else if (var1.field7411 <= class469.field6549) {
                int var2 = class393.field5238[var1.field7408];
                if (var2 == 0) {
                    class244 var9 = class480.method2801(var1.field7416, var1.field7419, var1.field7404);
                    if (var9 instanceof class107) {
                        class221.method1294(var1.field7416, var1.field7419, var1.field7404);
                        class107 var10 = (class107) var9;
                        if (var10.field1243 != null) {
                            class303.method1717(var1.field7416, var1.field7419, var1.field7404, var10.field1243, null);
                        }
                    }
                } else if (var2 == 1) {
                    class599 var3 = class248.method1430(var1.field7416, var1.field7419, var1.field7404);
                    if (var3 instanceof class567) {
                        class605.method3375(var1.field7416, var1.field7419, var1.field7404);
                        class567 var4 = (class567) var3;
                        if (var4.field8037 != null) {
                            class308.method1756(var1.field7416, var1.field7419, var1.field7404, var4.field8037, null);
                        }
                    }
                } else if (var2 == 2) {
                    class354 var7 = class396.method2163(var1.field7416, var1.field7419, var1.field7404, field3452 == null ? (field3452 = method1557("ql")) : field3452);
                    if (var7 instanceof class557) {
                        class634.method3545(var1.field7416, var1.field7419, var1.field7404, field3452 == null ? (field3452 = method1557("ql")) : field3452);
                        class557 var8 = (class557) var7;
                        if (var8.field7955 != null) {
                            class223.method1309(var8.field7955, false);
                        }
                    }
                } else if (var2 == 3) {
                    class344 var5 = class606.method3380(var1.field7416, var1.field7419, var1.field7404);
                    if (var5 instanceof class68) {
                        class39.method203(var1.field7416, var1.field7419, var1.field7404);
                        class68 var6 = (class68) var5;
                        if (var6.field736 != null) {
                            class557.method3153(var1.field7416, var1.field7419, var1.field7404, var6.field736);
                        }
                    }
                }
                var1.method1519((byte) 121);
            } else if (class469.field6549 == var1.field7412) {
                int var11 = class393.field5238[var1.field7408];
                if (var11 == 0) {
                    class244 var12 = class480.method2801(var1.field7416, var1.field7419, var1.field7404);
                    if (var12 instanceof class107) {
                        var1.method1519((byte) 121);
                    } else if (class649.method3653(var1.field7416, var1.field7419, var1.field7404) == null) {
                        class107 var13 = new class107(var1.field7408, var1.field7401, var1.field7403, var1.field7405, var1.field7409, var12);
                        class303.method1717(var1.field7416, var1.field7419, var1.field7404, var13, null);
                    } else {
                        var1.method1519((byte) 121);
                    }
                } else if (var11 == 1) {
                    class599 var14 = class248.method1430(var1.field7416, var1.field7419, var1.field7404);
                    if (var14 instanceof class567) {
                        var1.method1519((byte) 121);
                    } else if (class288.method1629(var1.field7416, var1.field7419, var1.field7404) == null) {
                        class567 var15 = new class567(var1.field7408, var1.field7401, var1.field7403, var1.field7405, var1.field7409, var14);
                        class308.method1756(var1.field7416, var1.field7419, var1.field7404, var15, null);
                    } else {
                        var1.method1519((byte) 121);
                    }
                } else if (var11 == 2) {
                    class354 var18 = class396.method2163(var1.field7416, var1.field7419, var1.field7404, field3452 == null ? (field3452 = method1557("ql")) : field3452);
                    if (var18 instanceof class557) {
                        var1.method1519((byte) 121);
                    } else {
                        class634.method3545(var1.field7416, var1.field7419, var1.field7404, field3452 == null ? (field3452 = method1557("ql")) : field3452);
                        class335 var19 = class195.field2339.method3729(var1.field7417, (byte) 109);
                        int var20;
                        int var21;
                        if (var1.field7401 == 1 || var1.field7401 == 3) {
                            var20 = var19.field4322;
                            var21 = var19.field4410;
                        } else {
                            var20 = var19.field4410;
                            var21 = var19.field4322;
                        }
                        class557 var22 = new class557(var1.field7408, var1.field7401, var1.field7416, var1.field7403, var1.field7405, var1.field7409, var1.field7419, var1.field7419 + var20 - 1, var1.field7404, var1.field7404 + var21 - 1, var18);
                        class223.method1309(var22, false);
                    }
                } else if (var11 == 3) {
                    class344 var16 = class606.method3380(var1.field7416, var1.field7419, var1.field7404);
                    if (var16 instanceof class68) {
                        var1.method1519((byte) 121);
                    } else {
                        class68 var17 = new class68(var1.field7403, var1.field7405, var1.field7409, var16);
                        class557.method3153(var1.field7416, var1.field7419, var1.field7404, var17);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(ICI)I", line = 694)
    public static final int method1555(int arg0, char arg1, int arg2) {
        field3445++;
        int var3 = arg1 << 4;
        int var4 = 0 % ((-arg0 - 76) / 42);
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var3 = (arg1 << 4) + 1;
        }
        if (arg1 == 'ñ' && arg2 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(B)V", line = 719)
    public final void method1556(byte arg0) {
        field3450++;
        int var2 = -1;
        int var3 = this.field3447.length - 8;
        while (var3 > var2) {
            var2++;
            this.field3447[var2] = 0;
            var2++;
            this.field3447[var2] = 0;
            var2++;
            this.field3447[var2] = 0;
            var2++;
            this.field3447[var2] = 0;
            var2++;
            this.field3447[var2] = 0;
            var2++;
            this.field3447[var2] = 0;
            var2++;
            this.field3447[var2] = 0;
            var2++;
            this.field3447[var2] = 0;
        }
        while (this.field3447.length - 1 > var2) {
            var2++;
            this.field3447[var2] = 0;
        }
        if (arg0 <= 1) {
            this.method1556((byte) -85);
        }
    }

    @OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(Lap;II)V", line = 761)
    public class272(class435 arg0, int arg1, int arg2) {
        this.field3447 = new byte[arg1 * arg2];
    }
}
