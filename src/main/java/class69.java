import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class69 {

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "Ljava/lang/String;")
    public static String field995 = "Select";

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "Ljava/lang/String;")
    public static String field997 = "Loaded update list";

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "I")
    public static int field1003 = -1;

    @OriginalMember(owner = "client!kq", name = "n", descriptor = "Z")
    public static boolean field1008 = true;

    @OriginalMember(owner = "client!kq", name = "k", descriptor = "Ljl;")
    public static class373 field1005 = new class373();

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "B")
    public byte field998;

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!kq", name = "j", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!kq", name = "l", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!kq", name = "o", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!kq", name = "p", descriptor = "I")
    public int field1010;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "Ljava/lang/String;")
    public String field1001;

    @OriginalMember(owner = "client!kq", name = "m", descriptor = "Ljava/lang/String;")
    public String field1007;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "Ljava/lang/String;")
    public String field996;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)I", line = 4)
    public static final int method578(int arg0, int arg1) {
        if (arg1 != 15967) {
            return 24;
        }
        field999++;
        class92 var2 = class406.method2575(14880, arg0);
        int var3 = var2.field1260;
        int var4 = var2.field1259;
        int var5 = var2.field1262;
        int var6 = class354.field5246[var5 - var4];
        return class100.field1325[var3] >> var4 & var6;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V", line = 32)
    public static final void method579(int arg0) {
        if (arg0 != 19294) {
            field995 = null;
        }
        for (int var1 = -1; var1 < class402.field5869; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class117.field1528[var1];
            }
            class317 var3 = class176.field2382[var2];
            if (var3 != null) {
                class370.method2437(var3.method1091((byte) -82), arg0 ^ 0xFFFFB4A1, var3);
            }
        }
        field1006++;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIIZ)V", line = 63)
    public static final void method580(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var5 = -25 % ((14 - arg3) / 52);
        if (class397.field5796 == 0) {
            class149.method1030(false, true);
        } else {
            class345.field5136 = class397.field5796;
            class169.method1127((byte) -87, 0);
        }
        field1000++;
        class431.field6272 = arg4;
        class129.field1677 = arg1;
        class334.field4907 = arg2;
        class200.method1321(arg0);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(III[B)Z", line = 94)
    public static final boolean method581(int arg0, int arg1, int arg2, byte[] arg3) {
        field1002++;
        boolean var4 = true;
        class341 var5 = new class341(arg3);
        int var6 = -1;
        label72: while (true) {
            int var7 = var5.method2236(-31885);
            if (var7 == 0) {
                if (arg0 <= 79) {
                    return true;
                }
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var13;
                class212 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method2223(-1);
                                        if (var17 == 0) {
                                            continue label72;
                                        }
                                        var5.method2233((byte) 104);
                                    }
                                    int var10 = var5.method2223(-1);
                                    if (var10 == 0) {
                                        continue label72;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    int var12 = (var8 & 0xFD9) >> 6;
                                    var13 = var5.method2233((byte) 104) >> 2;
                                    var14 = arg1 + var12;
                                    var15 = arg2 + var11;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while ((class351.field5217 - 1) <= var14);
                    } while (class143.field1815 - 1 <= var15);
                    var16 = class372.method2447(var6, (byte) 33);
                } while (var13 == 22 && !class24.field434 && var16.field2932 == 0 && var16.field2905 != 1 && !var16.field2962);
                var9 = true;
                if (!var16.method1394(false)) {
                    var4 = false;
                    class238.field3326++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIII)Z", line = 187)
    public static final boolean method582(int arg0, int arg1, int arg2, int arg3) {
        if (!class28.method234(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class266.field3950[arg0].method722(arg1, arg2) - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class193.field2684) {
                    if (!class27.method229(var4, var6, var5)) {
                        return false;
                    }
                    if (!class27.method229(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class27.method229(var4, var7, var5)) {
                        return false;
                    }
                    if (!class27.method229(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class27.method229(var4, var8, var5)) {
                    return false;
                }
                if (!class27.method229(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class447.field6430) {
                    if (!class27.method229(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class27.method229(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class27.method229(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class27.method229(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class27.method229(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class27.method229(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class193.field2684) {
                    if (!class27.method229(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class27.method229(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class27.method229(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class27.method229(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class27.method229(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class27.method229(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class447.field6430) {
                    if (!class27.method229(var4, var6, var5)) {
                        return false;
                    }
                    if (!class27.method229(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class27.method229(var4, var7, var5)) {
                        return false;
                    }
                    if (!class27.method229(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class27.method229(var4, var8, var5)) {
                    return false;
                }
                if (!class27.method229(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class27.method229(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class27.method229(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class27.method229(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class27.method229(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class27.method229(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZLsj;)V", line = 375)
    public static final void method583(boolean arg0, class248 arg1) {
        if (!arg0) {
            method579(117);
        }
        field1004++;
        int var2 = arg1.field3624;
        if (var2 == 324) {
            if (class30.field499 == -1) {
                class356.field5268 = arg1.field3611;
                class30.field499 = arg1.field3668;
            }
            if (class219.field3055.field6341) {
                arg1.field3668 = class30.field499;
            } else {
                arg1.field3668 = class356.field5268;
            }
        } else if (var2 == 325) {
            if (class30.field499 == -1) {
                class356.field5268 = arg1.field3611;
                class30.field499 = arg1.field3668;
            }
            if (class219.field3055.field6341) {
                arg1.field3668 = class356.field5268;
            } else {
                arg1.field3668 = class30.field499;
            }
        } else if (var2 == 327) {
            arg1.field3607 = 150;
            arg1.field3548 = (int) (Math.sin((double) class231.field3179 / 40.0D) * 256.0D) & 0x3FFF;
            arg1.field3535 = 5;
            arg1.field3638 = -1;
        } else if (var2 == 328) {
            if (class383.field5609.field4650 == null) {
                arg1.field3638 = 0;
                arg1.field3643 = 0;
            } else {
                arg1.field3607 = 150;
                arg1.field3548 = (int) (Math.sin((double) class231.field3179 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field3638 = 2047;
                arg1.field3535 = 5;
                arg1.field3643 = class425.method2666(class383.field5609.field4650, true);
                arg1.field3622 = class383.field5609.field2167;
                arg1.field3606 = class383.field5609.field2162;
                arg1.field3600 = class383.field5609.field2143;
                arg1.field3662 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)V", line = 459)
    public static void method584(int arg0) {
        field995 = null;
        if (arg0 == 238) {
            field1005 = null;
            field997 = null;
        }
    }
}
