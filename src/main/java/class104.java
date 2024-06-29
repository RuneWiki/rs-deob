import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class104 {

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "Lsg;")
    public static class30 field2088 = class167.method1221((byte) 33, " (X");

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "Z")
    public static boolean field2086 = false;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "Lsg;")
    public static class30 field2098 = class167.method1221((byte) 33, "<col=ff9040>");

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
    public static int field2095 = 0;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "Lsg;")
    public static class30 field2091 = class167.method1221((byte) 33, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "Z")
    public static boolean field2102 = true;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
    public static int field2105 = 0;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public int field2093;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    public int field2101;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "I")
    public int field2104;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "J")
    public long field2087;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "Lmc;")
    public static class151 field2097;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "Lni;")
    public class20 field2089;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "Lkb;")
    public static class27 field2103;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)V")
    public static final void method832(int arg0, int arg1, int arg2) {
        field2094++;
        class68 var3 = class103.method830(arg1, 4, 1);
        var3.method608(false);
        var3.field1484 = arg2;
        if (arg0 < 45) {
            method834((byte) -67);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
    public static void method833(byte arg0) {
        int var1 = 17 / ((5 - arg0) / 33);
        field2097 = null;
        field2103 = null;
        field2098 = null;
        field2091 = null;
        field2088 = null;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V")
    public static final void method834(byte arg0) {
        field2090++;
        if (class157.field2967 != null || class166.field3053 != null) {
            return;
        }
        if (arg0 <= 9) {
            method839(-52, -71, 3, 56, 47, true, 52, -104, -9, -55, -112, 105, -23);
        }
        int var1 = class63.field1344;
        if (class94.field1890) {
            if (var1 != 1) {
                int var6 = field2095;
                int var7 = class23.field440;
                if (class169.field3187 - 10 > var7 || class169.field3187 - (-class163.field3039 - 10) < var7 || var6 < class208.field3744 - 10 || (class208.field3744 + class202.field3594 + 10) < var6) {
                    class94.field1890 = false;
                    class201.method1429(class169.field3187, class163.field3039, true, class208.field3744, class202.field3594);
                }
            }
            if (var1 != 1) {
                return;
            }
            int var8 = class169.field3187;
            int var9 = class208.field3744;
            int var10 = class32.field817;
            int var11 = -1;
            int var12 = class163.field3039;
            int var13 = class183.field3365;
            for (int var14 = 0; var14 < class52.field1165; var14++) {
                int var15 = (class52.field1165 - var14 - 1) * 15 + var9 + 31;
                if (var8 < var10 && var10 < (var8 + var12) && (var15 - 13) < var13 && var13 < (var15 + 3)) {
                    var11 = var14;
                }
            }
            if (var11 != -1) {
                class234.method1656(var11, 112);
            }
            class94.field1890 = false;
            class201.method1429(class169.field3187, class163.field3039, true, class208.field3744, class202.field3594);
            return;
        }
        if (var1 == 1 && class52.field1165 > 0) {
            short var2 = class30.field602[class52.field1165 - 1];
            if (var2 == 1 || var2 == 10 || var2 == 11 || var2 == 5 || var2 == 31 || var2 == 38 || var2 == 16 || var2 == 7 || var2 == 58 || var2 == 25 || var2 == 49 || var2 == 1003) {
                int var3 = class231.field4108[class52.field1165 - 1];
                int var4 = class97.field1969[class52.field1165 - 1];
                class31 var5 = class272.method1858(var4, 65535);
                if (class71.method660(client.method1498(var5), -930043140) || class91.method743(client.method1498(var5), 128)) {
                    class17.field341 = false;
                    class205.field3676 = 0;
                    if (class157.field2967 != null) {
                        class254.method1771(class157.field2967, 8);
                    }
                    class157.field2967 = class272.method1858(var4, 65535);
                    class222.field3991 = class32.field817;
                    class123.field2418 = var3;
                    class141.field2722 = class183.field3365;
                    class254.method1771(class157.field2967, 8);
                    return;
                }
            }
        }
        if (var1 == 1 && (class154.field2913 == 1 && class52.field1165 > 2 || class101.method822(0, class52.field1165 - 1))) {
            var1 = 2;
        }
        if (var1 == 2 && class52.field1165 > 0 || class93.field1864 == 1) {
            class154.method1153(false);
        }
        if (var1 == 1 && class52.field1165 > 0 || class93.field1864 == 2) {
            class143.method1064(-257);
            return;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ltb;B)V")
    public static final void method835(class183 arg0, byte arg1) {
        class8.method61(200000, arg0, (byte) 13);
        field2085++;
        if (arg1 != 41) {
            method835((class183) null, (byte) -54);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BI)I")
    public static final int method836(byte arg0, int arg1) {
        if (arg0 > -120) {
            field2091 = null;
        }
        field2099++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ldl;B)V")
    public static final void method837(class31 arg0, byte arg1) {
        class31 var2 = class142.method1060(0, arg0);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class15.field324;
            var4 = class238.field4238;
        } else {
            var4 = var2.field670;
            var3 = var2.field728;
        }
        int var5 = 3 / ((arg1 - 13) / 36);
        class97.method797(arg0, var4, var3, false, -31014);
        field2096++;
        class268.method1839(arg0, var4, var3, -2398);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lqd;)V")
    public static final void method838(class35 arg0) {
        for (int var1 = arg0.field854; var1 <= arg0.field844; var1++) {
            for (int var2 = arg0.field856; var2 <= arg0.field853; var2++) {
                class195 var3 = class71.field1613[arg0.field864][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field3522; var4++) {
                        if (var3.field3540[var4] == arg0) {
                            var3.field3522--;
                            for (int var5 = var4; var5 < var3.field3522; var5++) {
                                var3.field3540[var5] = var3.field3540[var5 + 1];
                                var3.field3529[var5] = var3.field3529[var5 + 1];
                            }
                            var3.field3540[var3.field3522] = null;
                            break;
                        }
                    }
                    var3.field3528 = 0;
                    for (int var6 = 0; var6 < var3.field3522; var6++) {
                        var3.field3528 |= var3.field3529[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIZIIIIIII)Z")
    public static final boolean method839(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var40 = 0; var40 < 104; var40++) {
                class87.field1782[var13][var40] = 0;
                class121.field2391[var13][var40] = 99999999;
            }
        }
        field2100++;
        int var14 = arg1;
        if (arg2 != 1) {
            method832(63, 58, -47);
        }
        int var15 = arg10;
        byte var16 = 0;
        class87.field1782[arg1][arg10] = 99;
        class121.field2391[arg1][arg10] = 0;
        boolean var17 = false;
        int var18 = 0;
        class195.field3509[var16] = arg1;
        int var41 = var16 + 1;
        class132.field2594[var16] = arg10;
        int[][] var19 = class100.field2032[class159.field2998].field258;
        label372: while (var41 != var18) {
            var15 = class132.field2594[var18];
            var14 = class195.field3509[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg11 == var14 && arg3 == var15) {
                var17 = true;
                break;
            }
            if (arg12 != 0) {
                if ((arg12 < 5 || arg12 == 10) && class100.field2032[class159.field2998].method136(arg11, arg7, arg12 - 1, var15, var14, arg3, arg4, (byte) 70)) {
                    var17 = true;
                    break;
                }
                if (arg12 < 10 && class100.field2032[class159.field2998].method129(arg11, arg4, var15, arg3, 42, arg7, arg12 - 1, var14)) {
                    var17 = true;
                    break;
                }
            }
            if (arg9 != 0 && arg0 != 0 && class100.field2032[class159.field2998].method125(var15, 16168, arg0, var14, arg9, arg11, arg4, arg3, arg6)) {
                var17 = true;
                break;
            }
            int var31 = class121.field2391[var14][var15] + 1;
            if (var14 > 0 && class87.field1782[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C010E) == 0 && (var19[var14 - 1][var15 + arg4 - 1] & 0x12C0138) == 0) {
                int var32 = 1;
                while (true) {
                    if (var32 >= (arg4 - 1)) {
                        class195.field3509[var41] = var14 - 1;
                        class132.field2594[var41] = var15;
                        var41 = var41 + 1 & 0xFFF;
                        class87.field1782[var14 - 1][var15] = 2;
                        class121.field2391[var14 - 1][var15] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var32] & 0x12C013E) != 0) {
                        break;
                    }
                    var32++;
                }
            }
            if (var14 < 102 && class87.field1782[var14 + 1][var15] == 0 && (var19[arg4 + var14][var15] & 0x12C0183) == 0 && (var19[arg4 + var14][arg4 + var15 - 1] & 0x12C01E0) == 0) {
                int var33 = 1;
                while (true) {
                    if ((arg4 - 1) <= var33) {
                        class195.field3509[var41] = var14 + 1;
                        class132.field2594[var41] = var15;
                        var41 = var41 + 1 & 0xFFF;
                        class87.field1782[var14 + 1][var15] = 8;
                        class121.field2391[var14 + 1][var15] = var31;
                        break;
                    }
                    if ((var19[arg4 + var14][var15 + var33] & 0x12C01E3) != 0) {
                        break;
                    }
                    var33++;
                }
            }
            if (var15 > 0 && class87.field1782[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C010E) == 0 && (var19[arg4 + var14 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var34 = 1;
                while (true) {
                    if (var34 >= arg4 - 1) {
                        class195.field3509[var41] = var14;
                        class132.field2594[var41] = var15 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class87.field1782[var14][var15 - 1] = 1;
                        class121.field2391[var14][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 + var34][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var34++;
                }
            }
            if (var15 < 102 && class87.field1782[var14][var15 + 1] == 0 && (var19[var14][arg4 + var15] & 0x12C0138) == 0 && (var19[var14 + arg4 - 1][arg4 + var15] & 0x12C01E0) == 0) {
                int var35 = 1;
                while (true) {
                    if (var35 >= arg4 - 1) {
                        class195.field3509[var41] = var14;
                        class132.field2594[var41] = var15 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class87.field1782[var14][var15 + 1] = 4;
                        class121.field2391[var14][var15 + 1] = var31;
                        break;
                    }
                    if ((var19[var14 + var35][arg4 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var35++;
                }
            }
            if (var14 > 0 && var15 > 0 && class87.field1782[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][arg4 + var15 - 1 - 1] & 0x12C0138) == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[arg4 + var14 - 1 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var36 = 1;
                while (true) {
                    if (arg4 - 1 <= var36) {
                        class195.field3509[var41] = var14 - 1;
                        class132.field2594[var41] = var15 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class87.field1782[var14 - 1][var15 - 1] = 3;
                        class121.field2391[var14 - 1][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var36 - 1] & 0x12C013E) != 0 || (var19[var36 + var14 - 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var36++;
                }
            }
            if (var14 < 102 && var15 > 0 && class87.field1782[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + arg4][var15 - 1] & 0x12C0183) == 0 && (var19[arg4 + var14][var15 + arg4 - 1 - 1] & 0x12C01E0) == 0) {
                int var37 = 1;
                while (true) {
                    if (arg4 - 1 <= var37) {
                        class195.field3509[var41] = var14 + 1;
                        class132.field2594[var41] = var15 - 1;
                        class87.field1782[var14 + 1][var15 - 1] = 9;
                        class121.field2391[var14 + 1][var15 - 1] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[arg4 + var14][var15 + var37 - 1] & 0x12C01E3) != 0 || (var19[var14 - (-var37 - 1)][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var37++;
                }
            }
            if (var14 > 0 && var15 < 102 && class87.field1782[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][arg4 + var15] & 0x12C0138) == 0 && (var19[var14][arg4 + var15] & 0x12C01E0) == 0) {
                int var38 = 1;
                while (true) {
                    if (var38 >= (arg4 - 1)) {
                        class195.field3509[var41] = var14 - 1;
                        class132.field2594[var41] = var15 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class87.field1782[var14 - 1][var15 + 1] = 6;
                        class121.field2391[var14 - 1][var15 + 1] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var38 + 1] & 0x12C013E) != 0 || (var19[var14 + var38 - 1][arg4 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var38++;
                }
            }
            if (var14 < 102 && var15 < 102 && class87.field1782[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][arg4 + var15] & 0x12C0138) == 0 && (var19[arg4 + var14][arg4 + var15] & 0x12C01E0) == 0 && (var19[arg4 + var14][var15 + 1] & 0x12C0183) == 0) {
                for (int var39 = 1; var39 < (arg4 - 1); var39++) {
                    if ((var19[var14 + var39 + 1][var15 + arg4] & 0x12C01F8) != 0 || (var19[arg4 + var14][var39 + var15 + 1] & 0x12C01E3) != 0) {
                        continue label372;
                    }
                }
                class195.field3509[var41] = var14 + 1;
                class132.field2594[var41] = var15 + 1;
                class87.field1782[var14 + 1][var15 + 1] = 12;
                class121.field2391[var14 + 1][var15 + 1] = var31;
                var41 = var41 + 1 & 0xFFF;
            }
        }
        class1.field14 = 0;
        if (!var17) {
            if (!arg5) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg11 - var22; var23 <= arg11 + var22; var23++) {
                for (int var24 = arg3 - var22; var24 <= (arg3 + var22); var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class121.field2391[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (var23 < arg11) {
                            var25 = arg11 - var23;
                        } else if (var23 > arg11 - (1 - arg9)) {
                            var25 = var23 + 1 - arg11 - arg9;
                        }
                        if (arg3 > var24) {
                            var26 = arg3 - var24;
                        } else if (arg0 + arg3 - 1 < var24) {
                            var26 = var24 - arg0 - (arg3 - 1);
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && var21 > class121.field2391[var23][var24]) {
                            var14 = var23;
                            var21 = class121.field2391[var23][var24];
                            var15 = var24;
                            var20 = var27;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg1 == var14 && arg10 == var15) {
                return false;
            }
            class1.field14 = 1;
        }
        byte var28 = 0;
        class195.field3509[var28] = var14;
        int var42 = var28 + 1;
        class132.field2594[var28] = var15;
        int var29;
        int var30 = var29 = class87.field1782[var14][var15];
        while (arg1 != var14 || arg10 != var15) {
            if (var29 != var30) {
                class195.field3509[var42] = var14;
                var29 = var30;
                class132.field2594[var42++] = var15;
            }
            if ((var30 & 0x1) != 0) {
                var15++;
            } else if ((var30 & 0x4) != 0) {
                var15--;
            }
            if ((var30 & 0x2) != 0) {
                var14++;
            } else if ((var30 & 0x8) != 0) {
                var14--;
            }
            var30 = class87.field1782[var14][var15];
        }
        if (var42 > 0) {
            class137.method1031((byte) -125, arg8, var42);
            return true;
        } else if (arg8 == 1) {
            return false;
        } else {
            return true;
        }
    }
}
