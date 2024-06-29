import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class42 extends class726 {

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "I")
    public int field971;

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "[I")
    public static int[] field970 = new int[8];

    @OriginalMember(owner = "client!vo", name = "p", descriptor = "[Log;")
    public static class649[] field977 = new class649[100];

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!vo", name = "l", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!vo", name = "m", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!vo", name = "n", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!vo", name = "o", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIILha;Ldb;IIIBIII)V", line = 4)
    public static final void method534(int arg0, int arg1, int arg2, class59 arg3, class324 arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10, int arg11) {
        field974++;
        if (arg8 < 123) {
            method539(27, -8, -96, 71, 72, (byte) 72, -82);
        }
        if (arg10 < arg11 && arg11 < (arg5 + arg10) && arg6 > arg2 - 13 && arg6 < (arg2 + 3) && arg4.field4507) {
            arg7 = arg1;
        }
        int[] var12 = null;
        if (class474.method2790(-12081, arg4.field4505)) {
            var12 = class721.field9801.method162(-67, (int) arg4.field4502).field4915;
        } else if (arg4.field4496 != -1) {
            var12 = class721.field9801.method162(113, arg4.field4496).field4915;
        } else if (class79.method729(arg4.field4505, (byte) -119)) {
            class751 var15 = (class751) class86.field1546.method1465((long) ((int) arg4.field4502), -6008);
            if (var15 != null) {
                class9 var16 = var15.field10510;
                class334 var17 = var16.field126;
                if (var17.field4694 != null) {
                    var17 = var17.method2110(class390.field5635, -1);
                }
                if (var17 != null) {
                    var12 = var17.field4659;
                }
            }
        } else if (class339.method2143(8806, arg4.field4505)) {
            Object var13 = null;
            class99 var14;
            if (arg4.field4505 == 1001) {
                var14 = class76.field1366.method1680(0, (int) arg4.field4502);
            } else {
                var14 = class76.field1366.method1680(0, (int) (arg4.field4502 >>> 32 & 0x7FFFFFFFL));
            }
            if (var14.field1780 != null) {
                var14 = var14.method925(class390.field5635, (byte) 47);
            }
            if (var14 != null) {
                var12 = var14.field1752;
            }
        }
        String var18 = class693.method3875((byte) 125, arg4);
        if (var12 != null) {
            var18 = var18 + class609.method3465(var12, true);
        }
        class168.field2634.method630(arg2, var18, (byte) 116, arg7, 0, arg10 + 3, class236.field3436, class195.field2889);
        if (arg4.field4494) {
            class94.field1658.method2925(class140.field2316.method3389(true, var18) + (arg10 + 5), arg2 + -12);
        }
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(B)V", line = 78)
    public static void method535(byte arg0) {
        if (arg0 <= 110) {
            field970 = null;
        }
        field970 = null;
        field977 = null;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIZ)Z", line = 91)
    public static final boolean method536(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method537(null, (byte) -29, null, 73);
        }
        field973++;
        if (arg0 >= 1000 && arg1 < 1000) {
            return true;
        } else if (arg0 >= 1000 || arg1 >= 1000) {
            return arg0 >= 1000 && arg1 >= 1000;
        } else if (class604.method3437((byte) 26, arg1)) {
            return true;
        } else {
            return !class604.method3437((byte) 26, arg0);
        }
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(I)V", line = 123)
    public class42(int arg0) {
        this.field971 = arg0;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "([BBLjava/lang/String;I)I", line = 131)
    public static final int method537(byte[] arg0, byte arg1, String arg2, int arg3) {
        field976++;
        int var4 = arg3;
        int var5 = arg2.length();
        int var6 = 0;
        if (arg1 != 0) {
            method536(21, -5, true);
        }
        while (var6 < var5) {
            int var7 = class453.method2695(7, arg2.charAt(var6));
            int var8 = var5 > var6 + 1 ? class453.method2695(7, arg2.charAt(var6 + 1)) : -1;
            int var9 = var6 + 2 < var5 ? class453.method2695(7, arg2.charAt(var6 + 2)) : -1;
            int var10 = (var6 + 3) >= var5 ? -1 : class453.method2695(7, arg2.charAt(var6 + 3));
            arg0[arg3++] = (byte) class418.method2577(var7 << 2, var8 >>> 4);
            if (var9 == -1) {
                break;
            }
            arg0[arg3++] = (byte) class418.method2577(class263.method1762(15, var8) << 4, var9 >>> 2);
            if (var10 == -1) {
                break;
            }
            arg0[arg3++] = (byte) class418.method2577(class263.method1762(3, var9) << 6, var10);
            var6 += 4;
        }
        return arg3 - var4;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lea;Lha;BI)V", line = 180)
    public static final void method538(class546 arg0, class59 arg1, byte arg2, int arg3) {
        field972++;
        if (arg2 > -101) {
            field970 = null;
        }
        if (class598.field8211 != null && arg3 <= arg0.field7518) {
            for (int var4 = 0; var4 < class598.field8211.length; var4++) {
                if (class598.field8211[var4] != -1000000 && (arg0.field7528[0] <= class598.field8211[var4] || arg0.field7528[1] <= class598.field8211[var4] || arg0.field7528[2] <= class598.field8211[var4] || class598.field8211[var4] >= arg0.field7528[3]) && (arg0.field7524[0] <= class659.field9030[var4] || arg0.field7524[1] <= class659.field9030[var4] || arg0.field7524[2] <= class659.field9030[var4] || class659.field9030[var4] >= arg0.field7524[3]) && (arg0.field7524[0] >= class391.field5756[var4] || class391.field5756[var4] <= arg0.field7524[1] || arg0.field7524[2] >= class391.field5756[var4] || class391.field5756[var4] <= arg0.field7524[3]) && (class271.field3813[var4] >= arg0.field7521[0] || arg0.field7521[1] <= class271.field3813[var4] || arg0.field7521[2] <= class271.field3813[var4] || class271.field3813[var4] >= arg0.field7521[3]) && (arg0.field7521[0] >= client.field4224[var4] || arg0.field7521[1] >= client.field4224[var4] || arg0.field7521[2] >= client.field4224[var4] || arg0.field7521[3] >= client.field4224[var4])) {
                    return;
                }
            }
        }
        if (arg0.field7529 == 1) {
            int var5 = arg0.field7522 + class708.field9611 - class134.field2256;
            if (var5 >= 0 && var5 <= class708.field9611 + class708.field9611) {
                int var6 = class708.field9611 + arg0.field7530 - class492.field6813;
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > (class708.field9611 + class708.field9611)) {
                    return;
                }
                int var7 = arg0.field7527 + class708.field9611 - class492.field6813;
                if (class708.field9611 + class708.field9611 < var7) {
                    var7 = class708.field9611 + class708.field9611;
                } else if (var7 < 0) {
                    return;
                }
                boolean var8 = false;
                while (var6 <= var7) {
                    if (class196.field2890[var5][var6++]) {
                        var8 = true;
                        break;
                    }
                }
                if (var8) {
                    float var9 = (float) (class119.field2020 - arg0.field7524[0]);
                    if (var9 < 0.0F) {
                        var9 *= -1.0F;
                    }
                    if (!(var9 < (float) class10.field138) && class299.method1954(0, 1, arg0) && class299.method1954(1, 1, arg0) && class299.method1954(2, 1, arg0) && class299.method1954(3, 1, arg0)) {
                        class634.field8720[class454.field6412++] = arg0;
                    }
                }
            }
        } else if (arg0.field7529 == 2) {
            int var10 = arg0.field7530 + class708.field9611 - class492.field6813;
            if (var10 >= 0 && var10 <= class708.field9611 + class708.field9611) {
                int var11 = class708.field9611 + arg0.field7522 - class134.field2256;
                if (var11 < 0) {
                    var11 = 0;
                } else if (var11 > class708.field9611 + class708.field9611) {
                    return;
                }
                int var12 = arg0.field7519 + class708.field9611 - class134.field2256;
                if (class708.field9611 + class708.field9611 < var12) {
                    var12 = class708.field9611 + class708.field9611;
                } else if (var12 < 0) {
                    return;
                }
                boolean var13 = false;
                while (var12 >= var11) {
                    if (class196.field2890[var11++][var10]) {
                        var13 = true;
                        break;
                    }
                }
                if (var13) {
                    float var14 = (float) (class364.field5216 - arg0.field7521[0]);
                    if (var14 < 0.0F) {
                        var14 *= -1.0F;
                    }
                    if (!(var14 < (float) class10.field138) && class299.method1954(0, 1, arg0) && class299.method1954(1, 1, arg0) && class299.method1954(2, 1, arg0) && class299.method1954(3, 1, arg0)) {
                        class634.field8720[class454.field6412++] = arg0;
                    }
                }
            }
        } else if (arg0.field7529 == 16 || arg0.field7529 == 8) {
            int var23 = arg0.field7522 + class708.field9611 - class134.field2256;
            if (var23 >= 0 && var23 <= class708.field9611 + class708.field9611) {
                int var24 = class708.field9611 + arg0.field7530 - class492.field6813;
                if (var24 >= 0 && var24 <= (class708.field9611 + class708.field9611) && class196.field2890[var23][var24]) {
                    float var25 = (float) (class119.field2020 - arg0.field7524[0]);
                    if (var25 < 0.0F) {
                        var25 *= -1.0F;
                    }
                    float var26 = (float) (class364.field5216 - arg0.field7521[0]);
                    if (var26 < 0.0F) {
                        var26 *= -1.0F;
                    }
                    if (!(var25 < (float) class10.field138) || !((float) class10.field138 > var26) && class299.method1954(0, 1, arg0) && class299.method1954(1, 1, arg0) && class299.method1954(2, 1, arg0) && class299.method1954(3, 1, arg0)) {
                        class634.field8720[class454.field6412++] = arg0;
                    }
                }
            }
        } else if (arg0.field7529 == 4) {
            float var15 = (float) (arg0.field7528[0] - class285.field3980);
            if (!(var15 <= (float) class22.field536)) {
                int var16 = class708.field9611 + arg0.field7530 - class492.field6813;
                if (var16 < 0) {
                    var16 = 0;
                } else if (class708.field9611 + class708.field9611 < var16) {
                    return;
                }
                int var17 = class708.field9611 + arg0.field7527 - class492.field6813;
                if ((class708.field9611 + class708.field9611) < var17) {
                    var17 = class708.field9611 + class708.field9611;
                } else if (var17 < 0) {
                    return;
                }
                int var18 = class708.field9611 + arg0.field7522 - class134.field2256;
                if (var18 < 0) {
                    var18 = 0;
                } else if (var18 > class708.field9611 + class708.field9611) {
                    return;
                }
                int var19 = class708.field9611 + arg0.field7519 - class134.field2256;
                if (class708.field9611 + class708.field9611 < var19) {
                    var19 = class708.field9611 + class708.field9611;
                } else if (var19 < 0) {
                    return;
                }
                boolean var20 = false;
                label295: for (int var21 = var18; var21 <= var19; var21++) {
                    for (int var22 = var16; var22 <= var17; var22++) {
                        if (class196.field2890[var21][var22]) {
                            var20 = true;
                            break label295;
                        }
                    }
                }
                if (var20 && class299.method1954(0, 1, arg0) && class299.method1954(1, 1, arg0) && class299.method1954(2, 1, arg0) && class299.method1954(3, 1, arg0)) {
                    class634.field8720[class454.field6412++] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIIIBI)Z", line = 513)
    public static final boolean method539(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field975++;
        if (!class728.field9848 || !class151.field2492) {
            return false;
        } else if (class399.field5890 < 100) {
            return false;
        } else if (arg4 != arg6 || arg1 != arg2) {
            if (arg5 <= 101) {
                method539(66, -39, -55, 105, 96, (byte) 114, -44);
            }
            for (int var9 = arg4; var9 <= arg6; var9++) {
                for (int var12 = arg2; var12 <= arg1; var12++) {
                    if (class299.field4185[arg0][var9][var12] == -class470.field6597) {
                        return false;
                    }
                }
            }
            int var10 = (arg4 << class130.field2185) + 1;
            int var11 = (arg2 << class130.field2185) + 2;
            if (class343.method2166(arg3, (arg6 + 1 - arg4) * class1.field3, var11, var10, class683.field9250[arg0].method1851((byte) -86, arg2, arg4), (arg1 + 1 - arg2) * class1.field3, 18507)) {
                class528.field7302++;
                return true;
            } else {
                return false;
            }
        } else if (class393.method2471(arg0, arg4, (byte) -97, arg2)) {
            int var7 = arg4 << class130.field2185;
            int var8 = arg2 << class130.field2185;
            if (class343.method2166(arg3, class1.field3, var8, var7, class683.field9250[arg0].method1851((byte) -86, arg2, arg4), class1.field3, 18507)) {
                class528.field7302++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
