import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class121 extends class252 {

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "Lni;")
    public class161 field1913;

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field1912 = new String[100];

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "[B")
    public static byte[] field1914 = new byte[32896];

    @OriginalMember(owner = "client!mj", name = "E", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "Loj;")
    public static class167 field1917;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)V")
    public static void method831(byte arg0) {
        int var1 = 24 / ((arg0 - 77) / 33);
        field1917 = null;
        field1914 = null;
        field1912 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V")
    public static final void method832(String arg0, String arg1, String arg2, int arg3, int arg4) {
        field1916++;
        if (arg4 != 2883983) {
            method834(75, (class62) null);
        }
        class35.method258(arg2, arg1, -1, arg0, arg3, -1);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIZIIIIIIIB)V")
    public static final void method833(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, byte arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class28.field499[var12][var36] = 0;
                class101.field1582[var12][var36] = 99999999;
            }
        }
        class28.field499[arg8][arg4] = 99;
        class101.field1582[arg8][arg4] = 0;
        int var13 = arg4;
        field1909++;
        int var14 = arg8;
        byte var15 = 0;
        class284.field4606[var15] = arg8;
        boolean var16 = false;
        int var17 = 0;
        int var37 = var15 + 1;
        class246.field3879[var15] = arg4;
        int[][] var18 = class310.field5021[class214.field3389].field811;
        label317: while (var37 != var17) {
            var13 = class246.field3879[var17];
            var14 = class284.field4606[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg9 == var14 && arg1 == var13) {
                var16 = true;
                break;
            }
            if (arg6 != 0) {
                if ((arg6 < 5 || arg6 == 10) && class310.field5021[class214.field3389].method352(arg2, var13, arg6 - 1, var14, arg1, arg7, arg9, 1)) {
                    var16 = true;
                    break;
                }
                if (arg6 < 10 && class310.field5021[class214.field3389].method349(arg7, 32, var13, var14, arg1, arg9, arg6 - 1, arg2)) {
                    var16 = true;
                    break;
                }
            }
            if (arg10 != 0 && arg0 != 0 && class310.field5021[class214.field3389].method357((byte) 65, arg9, var13, arg10, arg1, arg7, arg0, var14, arg5)) {
                var16 = true;
                break;
            }
            int var27 = class101.field1582[var14][var13] + 1;
            if (var14 > 0 && class28.field499[var14 - 1][var13] == 0 && (var18[var14 - 1][var13] & 0x2C010E) == 0 && (var18[var14 - 1][arg7 + var13 - 1] & 0x2C0138) == 0) {
                int var28 = 1;
                while (true) {
                    if (var28 >= arg7 - 1) {
                        class284.field4606[var37] = var14 - 1;
                        class246.field3879[var37] = var13;
                        class28.field499[var14 - 1][var13] = 2;
                        var37 = var37 + 1 & 0xFFF;
                        class101.field1582[var14 - 1][var13] = var27;
                        break;
                    }
                    if ((var18[var14 - 1][var13 + var28] & 0x2C013E) != 0) {
                        break;
                    }
                    var28++;
                }
            }
            if (var14 < 102 && class28.field499[var14 + 1][var13] == 0 && (var18[var14 + arg7][var13] & 0x2C0183) == 0 && (var18[arg7 + var14][var13 + arg7 - 1] & 0x2C01E0) == 0) {
                int var29 = 1;
                while (true) {
                    if (arg7 - 1 <= var29) {
                        class284.field4606[var37] = var14 + 1;
                        class246.field3879[var37] = var13;
                        var37 = var37 + 1 & 0xFFF;
                        class28.field499[var14 + 1][var13] = 8;
                        class101.field1582[var14 + 1][var13] = var27;
                        break;
                    }
                    if ((var18[var14 + arg7][var13 + var29] & 0x2C01E3) != 0) {
                        break;
                    }
                    var29++;
                }
            }
            if (var13 > 0 && class28.field499[var14][var13 - 1] == 0 && (var18[var14][var13 - 1] & 0x2C010E) == 0 && (var18[arg7 + var14 - 1][var13 - 1] & 0x2C0183) == 0) {
                int var30 = 1;
                while (true) {
                    if (arg7 - 1 <= var30) {
                        class284.field4606[var37] = var14;
                        class246.field3879[var37] = var13 - 1;
                        class28.field499[var14][var13 - 1] = 1;
                        class101.field1582[var14][var13 - 1] = var27;
                        var37 = var37 + 1 & 0xFFF;
                        break;
                    }
                    if ((var18[var14 + var30][var13 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var30++;
                }
            }
            if (var13 < 102 && class28.field499[var14][var13 + 1] == 0 && (var18[var14][arg7 + var13] & 0x2C0138) == 0 && (var18[arg7 + var14 - 1][arg7 + var13] & 0x2C01E0) == 0) {
                int var31 = 1;
                while (true) {
                    if (arg7 - 1 <= var31) {
                        class284.field4606[var37] = var14;
                        class246.field3879[var37] = var13 + 1;
                        var37 = var37 + 1 & 0xFFF;
                        class28.field499[var14][var13 + 1] = 4;
                        class101.field1582[var14][var13 + 1] = var27;
                        break;
                    }
                    if ((var18[var14 + var31][arg7 + var13] & 0x2C01F8) != 0) {
                        break;
                    }
                    var31++;
                }
            }
            if (var14 > 0 && var13 > 0 && class28.field499[var14 - 1][var13 - 1] == 0 && (var18[var14 - 1][var13 - 1] & 0x2C010E) == 0) {
                int var32 = 1;
                while (true) {
                    if (arg7 <= var32) {
                        class284.field4606[var37] = var14 - 1;
                        class246.field3879[var37] = var13 - 1;
                        var37 = var37 + 1 & 0xFFF;
                        class28.field499[var14 - 1][var13 - 1] = 3;
                        class101.field1582[var14 - 1][var13 - 1] = var27;
                        break;
                    }
                    if ((var18[var14 - 1][var13 + var32 - 1] & 0x2C013E) != 0 || (var18[var14 + var32 - 1][var13 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var32++;
                }
            }
            if (var14 < 102 && var13 > 0 && class28.field499[var14 + 1][var13 - 1] == 0 && (var18[arg7 + var14][var13 - 1] & 0x2C0183) == 0) {
                int var33 = 1;
                while (true) {
                    if (var33 >= arg7) {
                        class284.field4606[var37] = var14 + 1;
                        class246.field3879[var37] = var13 - 1;
                        var37 = var37 + 1 & 0xFFF;
                        class28.field499[var14 + 1][var13 - 1] = 9;
                        class101.field1582[var14 + 1][var13 - 1] = var27;
                        break;
                    }
                    if ((var18[arg7 + var14][var13 + var33 - 1] & 0x2C01E3) != 0 || (var18[var14 + var33][var13 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var33++;
                }
            }
            if (var14 > 0 && var13 < 102 && class28.field499[var14 - 1][var13 + 1] == 0 && (var18[var14 - 1][arg7 + var13] & 0x2C0138) == 0) {
                int var34 = 1;
                while (true) {
                    if (arg7 <= var34) {
                        class284.field4606[var37] = var14 - 1;
                        class246.field3879[var37] = var13 + 1;
                        class28.field499[var14 - 1][var13 + 1] = 6;
                        class101.field1582[var14 - 1][var13 + 1] = var27;
                        var37 = var37 + 1 & 0xFFF;
                        break;
                    }
                    if ((var18[var14 - 1][var13 + var34] & 0x2C013E) != 0 || (var18[var14 + var34 - 1][arg7 + var13] & 0x2C01F8) != 0) {
                        break;
                    }
                    var34++;
                }
            }
            if (var14 < 102 && var13 < 102 && class28.field499[var14 + 1][var13 + 1] == 0 && (var18[var14 + arg7][arg7 + var13] & 0x2C01E0) == 0) {
                for (int var35 = 1; var35 < arg7; var35++) {
                    if ((var18[var14 + var35][arg7 + var13] & 0x2C01F8) != 0 || (var18[arg7 + var14][var13 + var35] & 0x2C01E3) != 0) {
                        continue label317;
                    }
                }
                class284.field4606[var37] = var14 + 1;
                class246.field3879[var37] = var13 + 1;
                var37 = var37 + 1 & 0xFFF;
                class28.field499[var14 + 1][var13 + 1] = 12;
                class101.field1582[var14 + 1][var13 + 1] = var27;
            }
        }
        if (arg11 <= 30) {
            return;
        }
        if (!var16) {
            if (!arg3) {
                return;
            }
            int var19 = 1000;
            byte var20 = 10;
            int var21 = 100;
            for (int var22 = arg9 - var20; var22 <= arg9 + var20; var22++) {
                for (int var23 = arg1 - var20; var23 <= (arg1 + var20); var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class101.field1582[var22][var23] < 100) {
                        int var24 = 0;
                        int var25 = 0;
                        if (var22 < arg9) {
                            var24 = arg9 - var22;
                        } else if (var22 > arg9 + arg10 - 1) {
                            var24 = var22 + 1 - (arg9 + arg10);
                        }
                        if (var23 < arg1) {
                            var25 = arg1 - var23;
                        } else if (arg1 - (1 - arg0) < var23) {
                            var25 = 1 - arg0 - (arg1 - var23);
                        }
                        int var26 = var24 * var24 + (var25 * var25);
                        if (var26 < var19 || var19 == var26 && class101.field1582[var22][var23] < var21) {
                            var14 = var22;
                            var21 = class101.field1582[var22][var23];
                            var13 = var23;
                            var19 = var26;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return;
            }
            if (arg8 == var14 && arg4 == var13) {
                return;
            }
        }
        class46.field691 = false;
        class164.field2690 = var13;
        class35.field569 = var14;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILvb;)V")
    public static final void method834(int arg0, class62 arg1) {
        field1911++;
        if (arg1.field933 == 0) {
            return;
        }
        class254 var2 = arg1.method403((byte) 114);
        if (arg1.field998 != -1 && arg1.field998 < 32768) {
            class104 var3 = class131.field2113[arg1.field998];
            if (var3 != null) {
                int var4 = arg1.field994 - var3.field994;
                int var5 = arg1.field929 - var3.field929;
                if (var4 != 0 || var5 != 0) {
                    arg1.field963 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field998 >= 32768) {
            int var6 = arg1.field998 - 32768;
            if (class41.field632 == var6) {
                var6 = 2047;
            }
            class12 var7 = class28.field494[var6];
            if (var7 != null) {
                int var8 = arg1.field929 - var7.field929;
                int var9 = arg1.field994 - var7.field994;
                if (var9 != 0 || var8 != 0) {
                    arg1.field963 = (int) (Math.atan2((double) var9, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field898 != 0 || arg1.field895 != 0) && (arg1.field936 == 0 || arg1.field931 > 0)) {
            int var10 = arg1.field994 - ((arg1.field898 - class75.field1211 - class75.field1211) * 64);
            int var11 = arg1.field929 - ((arg1.field895 - class145.field2327 - class145.field2327) * 64);
            if (var10 != 0 || var11 != 0) {
                arg1.field963 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg1.field898 = 0;
            arg1.field895 = 0;
        }
        int var12 = arg1.field963 - arg1.field954 & 0x7FF;
        if (var12 == 0) {
            arg1.field977 = 0;
            arg1.field927 = 0;
        } else if (var2.field4182 == 0) {
            arg1.field977++;
            if (var12 > 1024) {
                boolean var20 = true;
                arg1.field954 -= arg1.field933;
                if (var12 < arg1.field933 || 2048 - arg1.field933 < var12) {
                    var20 = false;
                    arg1.field954 = arg1.field963;
                }
                if (arg1.field977 > 25 || var20) {
                    arg1.field947 = var2.field4185;
                    if (arg1.field936 > 0) {
                        if (arg1.field980[arg1.field936 - 1] == 2) {
                            if (var2.field4163 != -1) {
                                arg1.field947 = var2.field4163;
                            } else if (var2.field4183 != -1) {
                                arg1.field947 = var2.field4183;
                            }
                        } else if (arg1.field980[arg1.field936 - 1] == 0) {
                            if (var2.field4159 != -1) {
                                arg1.field947 = var2.field4159;
                            } else if (var2.field4176 != -1) {
                                arg1.field947 = var2.field4176;
                            }
                        } else if (var2.field4186 != -1) {
                            arg1.field947 = var2.field4186;
                        }
                    } else if (var2.field4165 != -1) {
                        arg1.field947 = var2.field4165;
                    }
                }
            } else {
                arg1.field954 += arg1.field933;
                boolean var21 = true;
                if (arg1.field933 > var12 || (2048 - arg1.field933) < var12) {
                    arg1.field954 = arg1.field963;
                    var21 = false;
                }
                if (arg1.field977 > 25 || var21) {
                    arg1.field947 = var2.field4185;
                    if (arg1.field936 <= 0) {
                        if (var2.field4187 != -1) {
                            arg1.field947 = var2.field4187;
                        }
                    } else if (arg1.field980[arg1.field936 - 1] == 2) {
                        if (var2.field4189 != -1) {
                            arg1.field947 = var2.field4189;
                        } else if (var2.field4183 != -1) {
                            arg1.field947 = var2.field4183;
                        }
                    } else if (arg1.field980[arg1.field936 - 1] == 0) {
                        if (var2.field4197 != -1) {
                            arg1.field947 = var2.field4197;
                        } else if (var2.field4176 != -1) {
                            arg1.field947 = var2.field4176;
                        }
                    } else if (var2.field4191 != -1) {
                        arg1.field947 = var2.field4191;
                    }
                }
            }
            arg1.field954 &= 0x7FF;
        } else {
            arg1.field947 = -1;
            int var13 = arg1.field963 << 5;
            if (arg1.field903 != var13) {
                arg1.field996 = 0;
                int var14 = var13 - arg1.field913 & 0xFFFF;
                arg1.field903 = var13;
                int var15 = arg1.field927 * arg1.field927 / (var2.field4182 * 2);
                if (arg1.field927 > 0 && var15 <= var14 && (var14 - var15) < 32768) {
                    arg1.field987 = true;
                    arg1.field968 = var14 / 2;
                    int var16 = var2.field4193 * var2.field4193 / (var2.field4182 * 2);
                    if (var16 > 32767) {
                        var16 = 32767;
                    }
                    if (var16 < arg1.field968) {
                        arg1.field968 = var14 - var16;
                    }
                } else if (arg1.field927 < 0 && (65536 - var14) >= var15 && 65536 - var14 - var15 < 32768) {
                    arg1.field987 = true;
                    arg1.field968 = (65536 - var14) / 2;
                    int var17 = var2.field4193 * var2.field4193 / (var2.field4182 * 2);
                    if (var17 > 32767) {
                        var17 = 32767;
                    }
                    if (arg1.field968 > var17) {
                        arg1.field968 = 65536 - var17 - var14;
                    }
                } else {
                    arg1.field987 = false;
                }
            }
            if (arg1.field927 == 0) {
                int var18 = arg1.field903 - arg1.field913 & 0xFFFF;
                if (var2.field4182 > var18) {
                    arg1.field913 = arg1.field903;
                } else {
                    arg1.field987 = true;
                    arg1.field996 = 0;
                    int var19 = var2.field4193 * var2.field4193 / (var2.field4182 * 2);
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    if (var18 >= 32768) {
                        arg1.field968 = (65536 - var18) / 2;
                        if (arg1.field968 > var19) {
                            arg1.field968 = 65536 - var18 - var19;
                        }
                        arg1.field927 = -var2.field4182;
                    } else {
                        arg1.field968 = var18 / 2;
                        arg1.field927 = var2.field4182;
                        if (arg1.field968 > var19) {
                            arg1.field968 = var18 - var19;
                        }
                    }
                }
            } else if (arg1.field927 > 0) {
                if (arg1.field996 >= arg1.field968) {
                    arg1.field987 = false;
                }
                if (!arg1.field987) {
                    arg1.field927 -= var2.field4182;
                    if (arg1.field927 < 0) {
                        arg1.field927 = 0;
                    }
                } else if (var2.field4193 > arg1.field927) {
                    arg1.field927 += var2.field4182;
                }
            } else {
                if (arg1.field968 <= arg1.field996) {
                    arg1.field987 = false;
                }
                if (!arg1.field987) {
                    arg1.field927 += var2.field4182;
                    if (arg1.field927 > 0) {
                        arg1.field927 = 0;
                    }
                } else if (arg1.field927 > (-var2.field4193)) {
                    arg1.field927 -= var2.field4182;
                }
            }
            arg1.field913 += arg1.field927;
            if (arg1.field927 > 0) {
                arg1.field996 += arg1.field927;
            } else {
                arg1.field996 -= arg1.field927;
            }
            arg1.field913 &= 0xFFFF;
            arg1.field954 = arg1.field913 >> 5;
            if (arg1.field927 >= 0) {
                if (arg1.field936 > 0) {
                    if (arg1.field980[arg1.field936 - 1] == 2) {
                        if (var2.field4189 != -1) {
                            arg1.field947 = var2.field4189;
                        } else if (var2.field4183 != -1) {
                            arg1.field947 = var2.field4183;
                        }
                    } else if (arg1.field980[arg1.field936 - 1] == 0) {
                        if (var2.field4197 != -1) {
                            arg1.field947 = var2.field4197;
                        } else if (var2.field4176 != -1) {
                            arg1.field947 = var2.field4176;
                        }
                    }
                }
                if (arg1.field947 == -1) {
                    if (var2.field4191 != -1) {
                        arg1.field947 = var2.field4191;
                    } else if (var2.field4187 != -1) {
                        arg1.field947 = var2.field4187;
                    }
                }
            } else {
                if (arg1.field936 > 0) {
                    if (arg1.field980[arg1.field936 - 1] == 2) {
                        if (var2.field4163 != -1) {
                            arg1.field947 = var2.field4163;
                        } else if (var2.field4183 != -1) {
                            arg1.field947 = var2.field4183;
                        }
                    } else if (arg1.field980[arg1.field936 - 1] == 0) {
                        if (var2.field4159 != -1) {
                            arg1.field947 = var2.field4159;
                        } else if (var2.field4176 != -1) {
                            arg1.field947 = var2.field4176;
                        }
                    }
                }
                if (arg1.field947 == -1) {
                    if (var2.field4186 != -1) {
                        arg1.field947 = var2.field4186;
                    } else if (var2.field4165 != -1) {
                        arg1.field947 = var2.field4165;
                    }
                }
            }
            if (arg1.field947 == -1) {
                arg1.field947 = var2.field4185;
            }
        }
        int var22 = -95 / ((-arg0 - 46) / 54);
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lni;)V")
    public class121(class161 arg0) {
        this.field1913 = arg0;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field1914[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field1918 = 0;
    }
}
