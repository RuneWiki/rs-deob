import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class386 {

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "[I")
    private int[] field6185;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6189 = new String[] { method3153(method3152("\u0010IE\u0017<")), method3153(method3152("\t\u0004E|i")), method3153(method3152("\u001c_\u0007>")), method3153(method3152("\u0010IEn}\u001cC\u001fl<")), method3153(method3152("\u0010IE\u0013<")), method3153(method3152("\u0010IE\u0016<")), method3153(method3152("\u0010IE\u0010<")), method3153(method3152("\u0010IE\u0011<")) };

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "Lvn;")
    public static class330 field6184 = new class330(32, 3);

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field6187 = 0;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "Lhl;")
    public static class556 field6188 = new class556(108, -1);

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field6182;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)I")
    public final int method3147(int arg0, int arg1) {
        try {
            field6181++;
            int var3 = (this.field6185.length >> 1) - 1;
            if (arg1 <= 21) {
                method3151(true, null, (byte) -111);
            }
            int var4 = arg0 & var3;
            while (true) {
                int var5 = this.field6185[var4 + var4 + 1];
                if (var5 == -1) {
                    return -1;
                }
                if (this.field6185[var4 + var4] == arg0) {
                    return var5;
                }
                var4 = var4 + 1 & var3;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field6189[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static void method3148(int arg0) {
        try {
            field6188 = null;
            field6184 = null;
            if (arg0 != 1) {
                field6184 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6189[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IBI)I")
    public static final int method3149(int arg0, byte arg1, int arg2) {
        try {
            field6182++;
            if (arg0 < arg2) {
                int var3 = arg0;
                arg0 = arg2;
                arg2 = var3;
            }
            if (arg1 != -44) {
                return -53;
            }
            while (arg2 != 0) {
                int var4 = arg0 % arg2;
                arg0 = arg2;
                arg2 = var4;
            }
            return arg0;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field6189[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIII)I")
    public static final int method3150(int arg0, int arg1, int arg2, int arg3) {
        try {
            field6186++;
            if ((class224.field3519[arg0][arg3][arg1] & 0x8) != 0) {
                return 0;
            } else if (arg0 <= 0 || (class224.field3519[1][arg3][arg1] & 0x2) == 0) {
                int var4 = -31 % ((arg2 - 65) / 39);
                return arg0;
            } else {
                return arg0 - 1;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field6189[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "([I)V")
    public class386(int[] arg0) {
        try {
            int var2;
            for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
            }
            this.field6185 = new int[var2 + var2];
            for (int var3 = 0; var3 < (var2 + var2); var3++) {
                this.field6185[var3] = -1;
            }
            int var4 = 0;
            while (var4 < arg0.length) {
                int var5;
                for (var5 = arg0[var4] & var2 - 1; this.field6185[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
                }
                this.field6185[var5 + var5] = arg0[var4];
                this.field6185[var5 + var5 + 1] = var4++;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field6189[3] + (arg0 == null ? field6189[2] : field6189[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZLoi;B)V")
    public static final void method3151(boolean arg0, class77 arg1, byte arg2) {
        try {
            field6183++;
            class707 var3 = arg1.method802(-93);
            if (arg1.field1205 == 0) {
                class135.field1916 = -1;
                class167.field2709 = 0;
                arg1.field1206 = 0;
            } else {
                if (arg1.field1167 != -1 && arg1.field1186 == 0) {
                    class210 var4 = class397.field6293.method2058(arg1.field1167, (byte) 121);
                    if (arg1.field1208 > 0 && var4.field3328 == 0) {
                        arg1.field1206++;
                        class167.field2709 = 0;
                        class135.field1916 = -1;
                        return;
                    }
                    if (arg1.field1208 <= 0 && var4.field3315 == 0) {
                        class167.field2709 = 0;
                        class135.field1916 = -1;
                        arg1.field1206++;
                        return;
                    }
                }
                for (int var5 = 0; var5 < arg1.field1192.length; var5++) {
                    if (arg1.field1192[var5].field7459 != -1 && arg1.field1192[var5].field7461 <= class431.field6776) {
                        class75 var6 = class779.field11366.method1859((byte) 127, arg1.field1192[var5].field7459);
                        if (var6.field1084 && var6.field1072 != -1) {
                            class210 var7 = class397.field6293.method2058(var6.field1072, (byte) -22);
                            if (arg1.field1208 > 0 && var7.field3328 == 0) {
                                arg1.field1206++;
                                class167.field2709 = 0;
                                class135.field1916 = -1;
                                return;
                            }
                            if (arg1.field1208 <= 0 && var7.field3315 == 0) {
                                arg1.field1206++;
                                class167.field2709 = 0;
                                class135.field1916 = -1;
                                return;
                            }
                        }
                    }
                }
                int var8 = arg1.field9985;
                int var9 = arg1.field9983;
                int var10 = arg1.field1201[arg1.field1205 - 1] * 512 + arg1.method804(true) * 256;
                int var11 = arg1.field1200[arg1.field1205 - 1] * 512 + (arg1.method804(true) * 256);
                if (var8 < var10) {
                    if (var11 > var9) {
                        arg1.method800(10240, -57);
                    } else if (var9 > var11) {
                        arg1.method800(14336, -41);
                    } else {
                        arg1.method800(12288, -108);
                    }
                } else if (var10 >= var8) {
                    if (var9 < var11) {
                        arg1.method800(8192, -116);
                    } else if (var11 < var9) {
                        arg1.method800(0, -88);
                    }
                } else if (var9 < var11) {
                    arg1.method800(6144, -59);
                } else if (var11 < var9) {
                    arg1.method800(2048, -113);
                } else {
                    arg1.method800(4096, -87);
                }
                byte var12 = arg1.field1198[arg1.field1205 - 1];
                if (arg0 || (var10 - var8) <= 1024 && var10 - var8 >= -1024 && (var11 - var9) <= 1024 && var11 - var9 >= -1024) {
                    int var13 = 16;
                    boolean var14 = true;
                    if (arg1 instanceof class426) {
                        var14 = ((class426) arg1).field6716.field2626;
                    }
                    if (var14) {
                        int var15 = arg1.field1165 - arg1.field1118.field8044;
                        if (var15 != 0 && arg1.field1155 == -1 && arg1.field1145 != 0) {
                            var13 = 8;
                        }
                        if (!arg0 && arg1.field1205 > 2) {
                            var13 = 24;
                        }
                        if (!arg0 && arg1.field1205 > 3) {
                            var13 = 32;
                        }
                    } else {
                        if (!arg0 && arg1.field1205 > 1) {
                            var13 = 24;
                        }
                        if (!arg0 && arg1.field1205 > 2) {
                            var13 = 32;
                        }
                    }
                    if (arg1.field1206 > 0 && arg1.field1205 > 1) {
                        var13 = 32;
                        arg1.field1206--;
                    }
                    if (arg2 >= -116) {
                        field6184 = null;
                    }
                    if (var12 == 2) {
                        var13 <<= 0x1;
                    } else if (var12 == 0) {
                        var13 >>= 0x1;
                    }
                    if (var3.field10144 != -1) {
                        int var16 = var13 << 9;
                        if (arg1.field1205 == 1) {
                            int var17 = arg1.field1199 * arg1.field1199;
                            int var18 = (arg1.field9985 <= var10 ? var10 - arg1.field9985 : arg1.field9985 - var10) << 9;
                            int var19 = (var11 >= arg1.field9983 ? var11 - arg1.field9983 : -var11 + arg1.field9983) << 9;
                            int var20 = var18 <= var19 ? var19 : var18;
                            int var21 = var3.field10144 * 2 * var20;
                            if (var21 < var17) {
                                arg1.field1199 /= 2;
                            } else if (var20 < (var17 / 2)) {
                                arg1.field1199 -= var3.field10144;
                                if (arg1.field1199 < 0) {
                                    arg1.field1199 = 0;
                                }
                            } else if (var16 > arg1.field1199) {
                                arg1.field1199 += var3.field10144;
                                if (arg1.field1199 > var16) {
                                    arg1.field1199 = var16;
                                }
                            }
                        } else if (var16 > arg1.field1199) {
                            arg1.field1199 += var3.field10144;
                            if (var16 < arg1.field1199) {
                                arg1.field1199 = var16;
                            }
                        } else if (arg1.field1199 > 0) {
                            arg1.field1199 -= var3.field10144;
                            if (arg1.field1199 < 0) {
                                arg1.field1199 = 0;
                            }
                        }
                        var13 = arg1.field1199 >> 9;
                        if (var13 < 1) {
                            var13 = 1;
                        }
                    }
                    class167.field2709 = 0;
                    if (var8 == var10 && var9 == var11) {
                        class135.field1916 = -1;
                    } else {
                        if (var10 > var8) {
                            arg1.field9985 += var13;
                            class167.field2709 |= 0x4;
                            if (arg1.field9985 > var10) {
                                arg1.field9985 = var10;
                            }
                        } else if (var10 < var8) {
                            arg1.field9985 -= var13;
                            class167.field2709 |= 0x8;
                            if (arg1.field9985 < var10) {
                                arg1.field9985 = var10;
                            }
                        }
                        if (var9 < var11) {
                            arg1.field9983 += var13;
                            class167.field2709 |= 0x1;
                            if (arg1.field9983 > var11) {
                                arg1.field9983 = var11;
                            }
                        } else if (var11 < var9) {
                            class167.field2709 |= 0x2;
                            arg1.field9983 -= var13;
                            if (var11 > arg1.field9983) {
                                arg1.field9983 = var11;
                            }
                        }
                        if (var13 >= 32) {
                            class135.field1916 = 2;
                        } else {
                            class135.field1916 = var12;
                        }
                    }
                    if (arg1.field9985 == var10 && arg1.field9983 == var11) {
                        arg1.field1205--;
                        if (arg1.field1208 > 0) {
                            arg1.field1208--;
                            return;
                        }
                    }
                } else {
                    arg1.field9985 = var10;
                    arg1.field9983 = var11;
                    arg1.method808(false, -105, arg1.field1165);
                    class135.field1916 = -1;
                    if (arg1.field1208 > 0) {
                        arg1.field1208--;
                    }
                    arg1.field1205--;
                    class167.field2709 = 0;
                }
            }
        } catch (RuntimeException var23) {
            throw class590.method4333(var23, field6189[5] + arg0 + ',' + (arg1 == null ? field6189[2] : field6189[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3152(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x14);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3153(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 114;
                    break;
                case 1:
                    var10005 = 42;
                    break;
                case 2:
                    var10005 = 107;
                    break;
                case 3:
                    var10005 = 82;
                    break;
                default:
                    var10005 = 20;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
