import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class290 {

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    private int field4627 = 0;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    private int field4617 = -1;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Lre;")
    private class266 field4620 = new class266();

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "Z")
    public boolean field4631 = false;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    private int field4626;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "[Lpl;")
    private class255[] field4621;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    private int field4629;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "[[[I")
    private int[][][] field4624;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "F")
    public static float field4630 = 0.0F;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field4622 = 0;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "[Lfh;")
    public static class108[] field4618;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)[[[I")
    public final int[][][] method1945(byte arg0) {
        field4628++;
        if (this.field4629 != this.field4626) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != -55) {
            this.field4626 = 31;
        }
        for (int var2 = 0; var2 < this.field4629; var2++) {
            this.field4621[var2] = class201.field3270;
        }
        return this.field4624;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static void method1946(int arg0) {
        field4618 = null;
        if (arg0 <= 6) {
            field4622 = -75;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method1947(String arg0, int arg1) {
        field4625++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class45.field820; var2++) {
            if (arg0.equalsIgnoreCase(class35.field603[var2])) {
                return true;
            }
        }
        return arg0.equalsIgnoreCase(class48.field878.field3445);
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
    public final void method1948(int arg0) {
        for (int var2 = arg0; var2 < this.field4629; var2++) {
            this.field4624[var2][0] = null;
            this.field4624[var2][1] = null;
            this.field4624[var2][2] = null;
            this.field4624[var2] = null;
        }
        this.field4624 = null;
        this.field4621 = null;
        field4623++;
        this.field4620.method1818(-62);
        this.field4620 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method1949(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        }
        field4619++;
        if (this.field4629 == this.field4626) {
            this.field4631 = this.field4621[arg1] == null;
            this.field4621[arg1] = class201.field3270;
            return this.field4624[arg1];
        } else if (this.field4629 == 1) {
            this.field4631 = this.field4617 != arg1;
            this.field4617 = arg1;
            return this.field4624[0];
        } else {
            class255 var3 = this.field4621[arg1];
            if (var3 == null) {
                this.field4631 = true;
                if (this.field4627 < this.field4629) {
                    var3 = new class255(arg1, this.field4627);
                    this.field4627++;
                } else {
                    class255 var4 = (class255) this.field4620.method1813(2);
                    var3 = new class255(arg1, var4.field4066);
                    this.field4621[var4.field4062] = null;
                    var4.method1074((byte) -123);
                }
                this.field4621[arg1] = var3;
            } else {
                this.field4631 = false;
            }
            this.field4620.method1810(var3, 7);
            return this.field4624[var3.field4066];
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZZIIIIIILml;II)V")
    public static final void method1950(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class13 arg8, int arg9, int arg10) {
        field4616++;
        if (arg0 && !class9.method50(false) && (class43.field790[0][arg2][arg6] & 0x2) == 0) {
            if ((class43.field790[arg4][arg2][arg6] & 0x10) != 0) {
                return;
            }
            if (class157.method1133(arg4, arg6, arg2, 89) != class282.field4485) {
                return;
            }
        }
        if (class111.field1710 > arg4) {
            class111.field1710 = arg4;
        }
        class248 var11 = class46.method396(arg5, (byte) 63);
        int var12;
        int var13;
        if (arg3 == 1 || arg3 == 3) {
            var13 = var11.field3947;
            var12 = var11.field3960;
        } else {
            var12 = var11.field3947;
            var13 = var11.field3960;
        }
        int var14;
        int var15;
        if ((arg2 + var12) <= 104) {
            var14 = (var12 + 1 >> 1) + arg2;
            var15 = (var12 >> 1) + arg2;
        } else {
            var15 = arg2;
            var14 = arg2 + 1;
        }
        int var16;
        int var17;
        if (arg6 + var13 > 104) {
            var16 = arg6 + 1;
            var17 = arg6;
        } else {
            var16 = (var13 + 1 >> 1) + arg6;
            var17 = (var13 >> 1) + arg6;
        }
        int[][] var18 = class21.field327[arg9];
        int var19 = var18[var15][var16] + var18[var15][var17] + var18[var14][var17] + var18[var14][var16] >> 2;
        int var20 = (arg2 << 7) + (var12 << 6);
        int var21 = (arg6 << 7) + (var13 << 6);
        int[][] var22 = null;
        if (arg1) {
            var22 = class161.field2627[0];
        } else if (arg9 < 3) {
            var22 = class21.field327[arg9 + 1];
        }
        long var23 = (long) (arg2 | arg6 << 7 | arg10 << 14 | arg3 << 20 | 0x40000000);
        if (var11.field3936 == 0 || arg1) {
            var23 |= Long.MIN_VALUE;
        }
        if (var11.field3953 == arg7) {
            var23 |= 0x400000L;
        }
        if (var11.field3948) {
            var23 |= 0x80000000L;
        }
        long var25 = var23 | (long) arg5 << 32;
        if (var11.method1644(true)) {
            class255.method1707(var11, (class139) null, (class213) null, (byte) 79, arg4, arg2, arg6, arg3);
        }
        int var27 = var11.field3946;
        boolean var28 = var11.field3967 & !arg1;
        if (arg10 == 22) {
            if (class151.field2470 || var11.field3936 != 0 || var11.field3892 == 1 || var11.field3930) {
                class60 var30;
                if (var27 == -1 && var11.field3897 == null && !var11.field3965) {
                    class55 var29 = var11.method1647(var21, var20, var28, (class74) null, var22, var18, arg3, 22, arg7 ^ 0xFFFFFFAF, arg0, var19);
                    var30 = var29.field986;
                } else {
                    var30 = new class100(arg5, 22, arg3, arg9, arg2, arg6, var27, var11.field3911, (class60) null);
                }
                class180.method1272(arg4, arg2, arg6, var19, var30, var25, var11.field3925);
                if (var11.field3892 == 1 && arg8 != null) {
                    arg8.method90(arg2, arg6, -17873);
                }
            }
        } else if (arg10 == 10 || arg10 == 11) {
            class60 var70;
            if (var27 == -1 && var11.field3897 == null && !var11.field3965) {
                class55 var69 = var11.method1647(var21, var20, var28, (class74) null, var22, var18, arg10 == 11 ? arg3 + 4 : arg3, 10, -51, arg0, var19);
                var70 = var69.field986;
            } else {
                var70 = new class100(arg5, 10, arg10 == 11 ? arg3 + 4 : arg3, arg9, arg2, arg6, var27, var11.field3911, (class60) null);
            }
            if (var70 != null) {
                boolean var71 = class107.method796(arg4, arg2, arg6, var19, var12, var13, var70, 0, var25);
                if (var11.field3939 && var71 && arg0) {
                    int var72 = 15;
                    if (var70 instanceof class168) {
                        var72 = ((class168) var70).method352() / 4;
                        if (var72 > 30) {
                            var72 = 30;
                        }
                    }
                    for (int var73 = 0; var73 <= var12; var73++) {
                        for (int var74 = 0; var74 <= var13; var74++) {
                            if (class127.field2098[arg4][arg2 + var73][arg6 + var74] < var72) {
                                class127.field2098[arg4][arg2 + var73][arg6 + var74] = (byte) var72;
                            }
                        }
                    }
                }
            }
            if (var11.field3892 != 0 && arg8 != null) {
                arg8.method82(arg6, var12, var13, !var11.field3927, arg2, 26, var11.field3909);
            }
        } else if (arg10 >= 12) {
            class60 var32;
            if (var27 == -1 && var11.field3897 == null && !var11.field3965) {
                class55 var31 = var11.method1647(var21, var20, var28, (class74) null, var22, var18, arg3, arg10, -66, arg0, var19);
                var32 = var31.field986;
            } else {
                var32 = new class100(arg5, arg10, arg3, arg9, arg2, arg6, var27, var11.field3911, (class60) null);
            }
            class107.method796(arg4, arg2, arg6, var19, 1, 1, var32, 0, var25);
            if (arg0 && arg10 >= 12 && arg10 <= 17 && arg10 != 13 && arg4 > 0 && var11.field3950 != 0) {
                class240.field3786[arg4][arg2][arg6] = class140.method1045(class240.field3786[arg4][arg2][arg6], 4);
            }
            if (var11.field3892 != 0 && arg8 != null) {
                arg8.method82(arg6, var12, var13, !var11.field3927, arg2, 62, var11.field3909);
            }
        } else if (arg10 == 0) {
            class60 var34;
            if (var27 == -1 && var11.field3897 == null && !var11.field3965) {
                class55 var33 = var11.method1647(var21, var20, var28, (class74) null, var22, var18, arg3, 0, arg7 ^ 0x55, arg0, var19);
                var34 = var33.field986;
            } else {
                var34 = new class100(arg5, 0, arg3, arg9, arg2, arg6, var27, var11.field3911, (class60) null);
            }
            class141.method1052(arg4, arg2, arg6, var19, var34, (class60) null, class49.field901[arg3], 0, var25);
            if (arg0) {
                if (arg3 == 0) {
                    if (var11.field3939) {
                        class127.field2098[arg4][arg2][arg6] = 50;
                        class127.field2098[arg4][arg2][arg6 + 1] = 50;
                    }
                    if (var11.field3950 == 1) {
                        class240.field3786[arg4][arg2][arg6] = class140.method1045(class240.field3786[arg4][arg2][arg6], 1);
                    }
                } else if (arg3 == 1) {
                    if (var11.field3939) {
                        class127.field2098[arg4][arg2][arg6 + 1] = 50;
                        class127.field2098[arg4][arg2 + 1][arg6 + 1] = 50;
                    }
                    if (var11.field3950 == 1) {
                        class240.field3786[arg4][arg2][arg6 + 1] = class140.method1045(class240.field3786[arg4][arg2][arg6 + 1], 2);
                    }
                } else if (arg3 == 2) {
                    if (var11.field3939) {
                        class127.field2098[arg4][arg2 + 1][arg6] = 50;
                        class127.field2098[arg4][arg2 + 1][arg6 + 1] = 50;
                    }
                    if (var11.field3950 == 1) {
                        class240.field3786[arg4][arg2 + 1][arg6] = class140.method1045(class240.field3786[arg4][arg2 + 1][arg6], 1);
                    }
                } else if (arg3 == 3) {
                    if (var11.field3939) {
                        class127.field2098[arg4][arg2][arg6] = 50;
                        class127.field2098[arg4][arg2 + 1][arg6] = 50;
                    }
                    if (var11.field3950 == 1) {
                        class240.field3786[arg4][arg2][arg6] = class140.method1045(class240.field3786[arg4][arg2][arg6], 2);
                    }
                }
            }
            if (var11.field3892 != 0 && arg8 != null) {
                arg8.method85(arg2, arg10, arg3, !var11.field3927, arg6, arg7 ^ 0x4C, var11.field3909);
            }
            if (var11.field3912 != 16) {
                class246.method1635(arg4, arg2, arg6, var11.field3912);
            }
        } else if (arg10 == 1) {
            class60 var36;
            if (var27 == -1 && var11.field3897 == null && !var11.field3965) {
                class55 var35 = var11.method1647(var21, var20, var28, (class74) null, var22, var18, arg3, 1, -64, arg0, var19);
                var36 = var35.field986;
            } else {
                var36 = new class100(arg5, 1, arg3, arg9, arg2, arg6, var27, var11.field3911, (class60) null);
            }
            class141.method1052(arg4, arg2, arg6, var19, var36, (class60) null, class161.field2634[arg3], 0, var25);
            if (var11.field3939 && arg0) {
                if (arg3 == 0) {
                    class127.field2098[arg4][arg2][arg6 + 1] = 50;
                } else if (arg3 == 1) {
                    class127.field2098[arg4][arg2 + 1][arg6 + 1] = 50;
                } else if (arg3 == 2) {
                    class127.field2098[arg4][arg2 + 1][arg6] = 50;
                } else if (arg3 == 3) {
                    class127.field2098[arg4][arg2][arg6] = 50;
                }
            }
            if (var11.field3892 != 0 && arg8 != null) {
                arg8.method85(arg2, arg10, arg3, !var11.field3927, arg6, 65, var11.field3909);
            }
        } else if (arg10 == 2) {
            int var37 = arg3 + 1 & 0x3;
            class60 var39;
            class60 var41;
            if (var27 == -1 && var11.field3897 == null && !var11.field3965) {
                class55 var38 = var11.method1647(var21, var20, var28, (class74) null, var22, var18, arg3 + 4, 2, -127, arg0, var19);
                var39 = var38.field986;
                class55 var40 = var11.method1647(var21, var20, var28, (class74) null, var22, var18, var37, 2, -74, arg0, var19);
                var41 = var40.field986;
            } else {
                var39 = new class100(arg5, 2, arg3 + 4, arg9, arg2, arg6, var27, var11.field3911, (class60) null);
                var41 = new class100(arg5, 2, var37, arg9, arg2, arg6, var27, var11.field3911, (class60) null);
            }
            class141.method1052(arg4, arg2, arg6, var19, var39, var41, class49.field901[arg3], class49.field901[var37], var25);
            if (var11.field3950 == 1 && arg0) {
                if (arg3 == 0) {
                    class240.field3786[arg4][arg2][arg6] = class140.method1045(class240.field3786[arg4][arg2][arg6], 1);
                    class240.field3786[arg4][arg2][arg6 + 1] = class140.method1045(class240.field3786[arg4][arg2][arg6 + 1], 2);
                } else if (arg3 == 1) {
                    class240.field3786[arg4][arg2][arg6 + 1] = class140.method1045(class240.field3786[arg4][arg2][arg6 + 1], 2);
                    class240.field3786[arg4][arg2 + 1][arg6] = class140.method1045(class240.field3786[arg4][arg2 + 1][arg6], 1);
                } else if (arg3 == 2) {
                    class240.field3786[arg4][arg2 + 1][arg6] = class140.method1045(class240.field3786[arg4][arg2 + 1][arg6], 1);
                    class240.field3786[arg4][arg2][arg6] = class140.method1045(class240.field3786[arg4][arg2][arg6], 2);
                } else if (arg3 == 3) {
                    class240.field3786[arg4][arg2][arg6] = class140.method1045(class240.field3786[arg4][arg2][arg6], 2);
                    class240.field3786[arg4][arg2][arg6] = class140.method1045(class240.field3786[arg4][arg2][arg6], 1);
                }
            }
            if (var11.field3892 != 0 && arg8 != null) {
                arg8.method85(arg2, arg10, arg3, !var11.field3927, arg6, 111, var11.field3909);
            }
            if (var11.field3912 != 16) {
                class246.method1635(arg4, arg2, arg6, var11.field3912);
            }
        } else if (arg10 == 3) {
            class60 var43;
            if (var27 == -1 && var11.field3897 == null && !var11.field3965) {
                class55 var42 = var11.method1647(var21, var20, var28, (class74) null, var22, var18, arg3, 3, -55, arg0, var19);
                var43 = var42.field986;
            } else {
                var43 = new class100(arg5, 3, arg3, arg9, arg2, arg6, var27, var11.field3911, (class60) null);
            }
            class141.method1052(arg4, arg2, arg6, var19, var43, (class60) null, class161.field2634[arg3], 0, var25);
            if (var11.field3939 && arg0) {
                if (arg3 == 0) {
                    class127.field2098[arg4][arg2][arg6 + 1] = 50;
                } else if (arg3 == 1) {
                    class127.field2098[arg4][arg2 + 1][arg6 + 1] = 50;
                } else if (arg3 == 2) {
                    class127.field2098[arg4][arg2 + 1][arg6] = 50;
                } else if (arg3 == 3) {
                    class127.field2098[arg4][arg2][arg6] = 50;
                }
            }
            if (var11.field3892 != 0 && arg8 != null) {
                arg8.method85(arg2, arg10, arg3, !var11.field3927, arg6, -74, var11.field3909);
            }
        } else if (arg10 == 9) {
            class60 var45;
            if (var27 == -1 && var11.field3897 == null && !var11.field3965) {
                class55 var44 = var11.method1647(var21, var20, var28, (class74) null, var22, var18, arg3, arg10, 100, arg0, var19);
                var45 = var44.field986;
            } else {
                var45 = new class100(arg5, arg10, arg3, arg9, arg2, arg6, var27, var11.field3911, (class60) null);
            }
            class107.method796(arg4, arg2, arg6, var19, 1, 1, var45, 0, var25);
            if (var11.field3892 != 0 && arg8 != null) {
                arg8.method82(arg6, var12, var13, !var11.field3927, arg2, 113, var11.field3909);
            }
            if (var11.field3912 != 16) {
                class246.method1635(arg4, arg2, arg6, var11.field3912);
            }
        } else if (arg10 == 4) {
            class60 var47;
            if (var27 == -1 && var11.field3897 == null && !var11.field3965) {
                class55 var46 = var11.method1647(var21, var20, var28, (class74) null, var22, var18, arg3, 4, 96, arg0, var19);
                var47 = var46.field986;
            } else {
                var47 = new class100(arg5, 4, arg3, arg9, arg2, arg6, var27, var11.field3911, (class60) null);
            }
            class114.method847(arg4, arg2, arg6, var19, var47, (class60) null, class49.field901[arg3], 0, 0, 0, var25);
        } else if (arg10 == 5) {
            long var48 = class76.method602(arg4, arg2, arg6);
            int var50 = 16;
            if (var48 != 0L) {
                var50 = class46.method396((int) (var48 >>> 32) & Integer.MAX_VALUE, (byte) 63).field3912;
            }
            class60 var52;
            if (var27 == -1 && var11.field3897 == null && !var11.field3965) {
                class55 var51 = var11.method1647(var21, var20, var28, (class74) null, var22, var18, arg3, 4, 111, arg0, var19);
                var52 = var51.field986;
            } else {
                var52 = new class100(arg5, 4, arg3, arg9, arg2, arg6, var27, var11.field3911, (class60) null);
            }
            class114.method847(arg4, arg2, arg6, var19, var52, (class60) null, class49.field901[arg3], 0, class82.field1365[arg3] * var50, class49.field893[arg3] * var50, var25);
        } else if (arg10 == 6) {
            int var53 = 8;
            long var54 = class76.method602(arg4, arg2, arg6);
            if (var54 != 0L) {
                var53 = class46.method396(Integer.MAX_VALUE & (int) (var54 >>> 32), (byte) 63).field3912 / 2;
            }
            class60 var57;
            if (var27 == -1 && var11.field3897 == null && !var11.field3965) {
                class55 var56 = var11.method1647(var21, var20, var28, (class74) null, var22, var18, arg3 + 4, 4, 104, arg0, var19);
                var57 = var56.field986;
            } else {
                var57 = new class100(arg5, 4, arg3 + 4, arg9, arg2, arg6, var27, var11.field3911, (class60) null);
            }
            class114.method847(arg4, arg2, arg6, var19, var57, (class60) null, 256, arg3, class199.field3243[arg3] * var53, class43.field787[arg3] * var53, var25);
        } else if (arg10 == 7) {
            int var58 = arg3 + 2 & 0x3;
            class60 var60;
            if (var27 == -1 && var11.field3897 == null && !var11.field3965) {
                class55 var59 = var11.method1647(var21, var20, var28, (class74) null, var22, var18, var58 + 4, 4, 97, arg0, var19);
                var60 = var59.field986;
            } else {
                var60 = new class100(arg5, 4, var58 + 4, arg9, arg2, arg6, var27, var11.field3911, (class60) null);
            }
            class114.method847(arg4, arg2, arg6, var19, var60, (class60) null, 256, var58, 0, 0, var25);
        } else if (arg10 == 8) {
            int var61 = 8;
            long var62 = class76.method602(arg4, arg2, arg6);
            if (var62 != 0L) {
                var61 = class46.method396(Integer.MAX_VALUE & (int) (var62 >>> 32), (byte) 63).field3912 / 2;
            }
            int var64 = arg3 + 2 & 0x3;
            class60 var66;
            class60 var68;
            if (var27 == -1 && var11.field3897 == null && !var11.field3965) {
                class55 var65 = var11.method1647(var21, var20, var28, (class74) null, var22, var18, arg3 + 4, 4, -105, arg0, var19);
                var66 = var65.field986;
                class55 var67 = var11.method1647(var21, var20, var28, (class74) null, var22, var18, var64 + 4, 4, -93, arg0, var19);
                var68 = var67.field986;
            } else {
                var66 = new class100(arg5, 4, arg3 + 4, arg9, arg2, arg6, var27, var11.field3911, (class60) null);
                var68 = new class100(arg5, 4, var64 + 4, arg9, arg2, arg6, var27, var11.field3911, (class60) null);
            }
            class114.method847(arg4, arg2, arg6, var19, var66, var68, 256, arg3, class199.field3243[arg3] * var61, class43.field787[arg3] * var61, var25);
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(III)V")
    public class290(int arg0, int arg1, int arg2) {
        this.field4626 = arg1;
        this.field4621 = new class255[this.field4626];
        this.field4629 = arg0;
        this.field4624 = new int[this.field4629][3][arg2];
    }
}
