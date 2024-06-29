import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class52 extends class147 implements class332 {

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "Z")
    private boolean field1036 = false;

    @OriginalMember(owner = "client!ik", name = "W", descriptor = "I")
    private int field1062 = 50;

    @OriginalMember(owner = "client!ik", name = "ab", descriptor = "Lbm;")
    private class307 field1066;

    @OriginalMember(owner = "client!ik", name = "R", descriptor = "Lbm;")
    private class307 field1057;

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "Le;")
    private class342 field1042;

    @OriginalMember(owner = "client!ik", name = "I", descriptor = "Le;")
    private class342 field1048;

    @OriginalMember(owner = "client!ik", name = "F", descriptor = "Ljava/lang/String;")
    public static String field1045 = " ";

    @OriginalMember(owner = "client!ik", name = "L", descriptor = "I")
    public static int field1051 = 0;

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field1037 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!ik", name = "D", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!ik", name = "E", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!ik", name = "G", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!ik", name = "H", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!ik", name = "J", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!ik", name = "M", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!ik", name = "N", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!ik", name = "O", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!ik", name = "P", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!ik", name = "Q", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!ik", name = "S", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!ik", name = "T", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!ik", name = "U", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!ik", name = "V", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!ik", name = "X", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!ik", name = "Y", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!ik", name = "Z", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!ik", name = "bb", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!ik", name = "cb", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!ik", name = "db", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!ik", name = "eb", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "Lbm;")
    public static class307 field1040;

    @OriginalMember(owner = "client!ik", name = "K", descriptor = "Ljava/lang/Thread;")
    public static Thread field1050;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(II)Z", line = 4)
    public final boolean method385(int arg0, int arg1) {
        if (arg1 != 623) {
            this.method396(-82, false);
        }
        field1038++;
        return this.field1036 || this.method960((byte) 99, arg0).field1030;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V", line = 23)
    public final void method386(int arg0) {
        this.field1042.method2376(0);
        if (this.field1048 != null) {
            this.field1048.method2376(0);
        }
        if (arg0 <= 72) {
            this.method386(29);
        }
        class243.field3778 = null;
        field1049++;
    }

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "(II)Lnm;", line = 39)
    public final class189 method387(int arg0, int arg1) {
        if (arg0 == 9) {
            field1047++;
            class243 var3 = this.method399(arg1, -42);
            return var3 == null ? null : var3.field3768;
        } else {
            return (class189) null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IZ)I", line = 52)
    public final int method388(int arg0, boolean arg1) {
        if (arg1) {
            field1044++;
            return this.method960((byte) 99, arg0).field1018 & 0xFFFF;
        } else {
            return -126;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIBII)V", line = 66)
    public static final void method389(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != -113) {
            field1040 = (class307) null;
        }
        field1067++;
        class2 var5 = class212.method1433(arg1, 10, -13802);
        var5.method13((byte) -1);
        var5.field39 = arg4;
        var5.field32 = arg0;
        var5.field43 = arg3;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZI)I", line = 82)
    public final int method390(boolean arg0, int arg1) {
        if (!arg0) {
            this.method396(-40, true);
        }
        field1043++;
        return this.method960((byte) 99, arg1).field1019 & 0xFF;
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(II)Z", line = 94)
    public final boolean method391(int arg0, int arg1) {
        int var3 = -84 / ((-arg1 - 28) / 55);
        field1053++;
        return this.method960((byte) 99, arg0).field1022;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)I", line = 105)
    public static final int method392(boolean arg0) {
        field1056++;
        if (!arg0) {
            field1040 = (class307) null;
        }
        return 15;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(IZ)I", line = 118)
    public final int method393(int arg0, boolean arg1) {
        if (arg1) {
            return -4;
        } else {
            field1052++;
            return this.method960((byte) 99, arg0).field1023 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "(II)V", line = 130)
    public final void method394(int arg0, int arg1) {
        this.field1062 = arg0;
        int var3 = 49 % ((8 - arg1) / 49);
        this.field1042 = new class342(this.field1062);
        field1046++;
        if (class249.field3893) {
            this.field1048 = new class342(this.field1062);
        } else {
            this.field1048 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "(II)Z", line = 147)
    public final boolean method395(int arg0, int arg1) {
        field1058++;
        if (arg0 != 255) {
            this.field1036 = true;
        }
        return this.method960((byte) 99, arg1).field1028;
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(IZ)V", line = 162)
    public final void method396(int arg0, boolean arg1) {
        field1061++;
        this.field1036 = arg1;
        this.method386(76);
        if (arg0 != 26392) {
            field1045 = (String) null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lhd;IIIIIIIZ)V", line = 177)
    public static final void method397(class154 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class56.field1113;
        int var11;
        int var12 = var11 = (arg7 << 7) - class303.field4606;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class45.field923[arg1][arg6][arg7] - class344.field5347;
        int var18 = class45.field923[arg1][arg6 + 1][arg7] - class344.field5347;
        int var19 = class45.field923[arg1][arg6 + 1][arg7 + 1] - class344.field5347;
        int var20 = class45.field923[arg1][arg6][arg7 + 1] - class344.field5347;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class284.field4396;
        int var46 = (var24 << 9) / var25 + class284.field4401;
        int var47 = (var27 << 9) / var31 + class284.field4396;
        int var48 = (var30 << 9) / var31 + class284.field4401;
        int var49 = (var33 << 9) / var37 + class284.field4396;
        int var50 = (var36 << 9) / var37 + class284.field4401;
        int var51 = (var39 << 9) / var43 + class284.field4396;
        int var52 = (var42 << 9) / var43 + class284.field4401;
        class284.field4391 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class70.field1477 && class151.method985(class284.field4396 + class150.field2456, class8.field183 + class284.field4401, var50, var52, var48, var49, var51, var47)) {
                class305.field4619 = arg6;
                class4.field105 = arg7;
            }
            if (!class249.field3893 && !arg8) {
                class284.field4400 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class284.field4390 || var51 > class284.field4390 || var47 > class284.field4390) {
                    class284.field4400 = true;
                }
                if (arg0.field2510 == -1) {
                    if (arg0.field2517 != 12345678) {
                        class284.method1913(var50, var52, var48, var49, var51, var47, arg0.field2517, arg0.field2508, arg0.field2513);
                    }
                } else if (!class157.field2572) {
                    int var53 = class284.field4393.method388(arg0.field2510, true);
                    class284.method1913(var50, var52, var48, var49, var51, var47, class187.method1193(var53, arg0.field2517), class187.method1193(var53, arg0.field2508), class187.method1193(var53, arg0.field2513));
                } else if (arg0.field2512) {
                    class284.method1911(var50, var52, var48, var49, var51, var47, arg0.field2517, arg0.field2508, arg0.field2513, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2510);
                } else {
                    class284.method1911(var50, var52, var48, var49, var51, var47, arg0.field2517, arg0.field2508, arg0.field2513, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field2510);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class70.field1477 && class151.method985(class284.field4396 + class150.field2456, class8.field183 + class284.field4401, var46, var48, var52, var45, var47, var51)) {
            class305.field4619 = arg6;
            class4.field105 = arg7;
        }
        if (class249.field3893 || arg8) {
            return;
        }
        class284.field4400 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class284.field4390 || var47 > class284.field4390 || var51 > class284.field4390) {
            class284.field4400 = true;
        }
        if (arg0.field2510 == -1) {
            if (arg0.field2516 != 12345678) {
                class284.method1913(var46, var48, var52, var45, var47, var51, arg0.field2516, arg0.field2513, arg0.field2508);
            }
        } else if (class157.field2572) {
            class284.method1911(var46, var48, var52, var45, var47, var51, arg0.field2516, arg0.field2513, arg0.field2508, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2510);
        } else {
            int var54 = class284.field4393.method388(arg0.field2510, true);
            class284.method1913(var46, var48, var52, var45, var47, var51, class187.method1193(var54, arg0.field2516), class187.method1193(var54, arg0.field2513), class187.method1193(var54, arg0.field2508));
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BI)I", line = 334)
    public final int method398(byte arg0, int arg1) {
        field1059++;
        return arg0 <= 48 ? 16 : this.method960((byte) 99, arg1).field1032 & 0xFF;
    }

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "(II)Lui;", line = 346)
    private final class243 method399(int arg0, int arg1) {
        field1070++;
        class243 var3 = (class243) this.field1042.method2367((long) arg0, -12270);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field1057.method2036(arg0, 0, (byte) 99);
        if (var4 == null) {
            return null;
        }
        class243 var5 = new class243(new class202(var4));
        if (arg1 >= -41) {
            this.field1062 = -85;
        }
        this.field1042.method2369((long) arg0, -28759, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IB)V", line = 372)
    public final void method400(int arg0, byte arg1) {
        for (class243 var3 = (class243) this.field1042.method2368(-1); var3 != null; var3 = (class243) this.field1042.method2372((byte) 11)) {
            if (var3.field3781) {
                var3.method1606(arg0);
                var3.field3781 = false;
            }
        }
        if (arg1 <= 29) {
            this.method395(-37, 29);
        }
        field1068++;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IBF)[I", line = 397)
    public final int[] method401(int arg0, byte arg1, float arg2) {
        class243 var4 = this.method399(arg0, -121);
        field1065++;
        if (arg1 != 113) {
            return (int[]) null;
        } else if (var4 == null) {
            return null;
        } else {
            var4.field3781 = true;
            return var4.method1607(this, this.field1066, arg2, this.field1036 || this.method960((byte) 99, arg0).field1030);
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lbm;Lbm;Lbm;IZ)V", line = 466)
    public class52(class307 arg0, class307 arg1, class307 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field1066 = arg2;
        this.field1057 = arg0;
        this.field1062 = arg3;
        this.field1036 = arg4;
        this.field1042 = new class342(this.field1062);
        if (class249.field3893) {
            this.field1048 = new class342(this.field1062);
        } else {
            this.field1048 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(ZI)I", line = 422)
    public final int method402(boolean arg0, int arg1) {
        field1041++;
        return arg0 ? 35 : this.method960((byte) 99, arg1).field1034 & 0xFF;
    }

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "(II)Lpc;", line = 434)
    private final class127 method403(int arg0, int arg1) {
        field1060++;
        if (arg1 <= 19) {
            this.method387(-9, 58);
        }
        class127 var3 = (class127) this.field1048.method2367((long) arg0, -12270);
        if (var3 == null) {
            class127 var4 = new class127(this.method960((byte) 99, arg0).field1018 & 0xFFFF);
            this.field1048.method2369((long) arg0, -28759, var4);
            return var4;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(BI)V", line = 456)
    public final void method404(byte arg0, int arg1) {
        this.method407(arg1, -90, this.field1036 || this.method960((byte) 99, arg1).field1030 ? 64 : 128);
        field1055++;
        if (arg0 != -54) {
            field1051 = 98;
        }
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)V", line = 488)
    public static void method405(int arg0) {
        field1037 = null;
        field1040 = null;
        field1045 = null;
        if (arg0 != 128) {
            method389(-98, -33, (byte) -32, 116, -123);
        }
        field1050 = null;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)Z", line = 502)
    public final boolean method406(int arg0, int arg1) {
        if (arg0 != 12880) {
            this.method390(true, 61);
        }
        field1069++;
        class243 var3 = this.method399(arg1, -90);
        return var3 == null ? false : var3.method1610(this, this.field1066);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)V", line = 518)
    public final void method407(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        class128.method844(this.method960((byte) 99, arg0).field1023 & 0xFF, this.method960((byte) 99, arg0).field1032 & 0xFF, (byte) -103);
        int var5 = -30 % ((-arg1 - 26) / 33);
        class243 var6 = this.method399(arg0, -51);
        if (var6 != null) {
            var4 = var6.method1611(this, this.field1066, arg2);
        }
        field1039++;
        if (!var4) {
            class127 var7 = this.method403(arg0, 27);
            var7.method837(1682);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)[I", line = 547)
    public final int[] method408(int arg0, int arg1) {
        field1063++;
        class243 var3 = this.method399(arg1, -76);
        if (var3 == null) {
            return null;
        } else if (arg0 == 9) {
            return var3.method1612(this, this.field1066, this.field1036 || this.method960((byte) 99, arg1).field1030);
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(II)Z", line = 564)
    public final boolean method409(int arg0, int arg1) {
        field1054++;
        if (arg1 != 9) {
            field1040 = (class307) null;
        }
        return !this.method960((byte) 99, arg0).field1020;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IFIIZ)Lfd;", line = 592)
    public final class206 method410(int arg0, float arg1, int arg2, int arg3, boolean arg4) {
        field1064++;
        class243 var6 = this.method399(arg3, -91);
        if (var6 != null && var6.method1610(this, this.field1066)) {
            if (arg2 != 65535) {
                field1040 = (class307) null;
            }
            return arg4 ? var6.field3768.method1207(false, this.field1066, (double) arg1, (byte) 95, this, arg0, arg0) : var6.field3768.method1208(arg0, this.field1066, (byte) 10, false, (double) arg1, arg0, this);
        } else {
            return null;
        }
    }
}
