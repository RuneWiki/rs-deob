import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class82 extends class337 implements class18 {

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "Lkp;")
    public class337 field1097;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "[I")
    public static int[] field1093 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "Lnn;")
    public static class151 field1101 = new class151("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "Lvo;")
    public static class312 field1103 = new class312(0, -1);

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!ed", name = "I", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!ed", name = "J", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "Ltb;")
    public static class290 field1105;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ldr;IB)Lwp;")
    public final class292 method12(class261 arg0, int arg1, byte arg2) {
        int var4 = -19 % ((46 - arg2) / 47);
        field1096++;
        return null;
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(Ldr;I)Lkq;")
    public final class70 method10(class261 arg0, int arg1) {
        field1094++;
        if (arg1 != 7) {
            field1103 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(B)I")
    public final int method16(byte arg0) {
        field1090++;
        if (arg0 >= -93) {
            this.method1(-38);
        }
        return 0;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ldr;I)V")
    public final void method6(class261 arg0, int arg1) {
        field1089++;
        if (arg1 >= -68) {
            method529((class119) null, (byte) -99, 26);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIII)V")
    public static final void method526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg3; var6 < arg1 + arg3; var6++) {
            for (int var9 = arg2; var9 < arg2 + arg5; var9++) {
                if (var9 >= 0 && var9 < class115.field1522 && var6 >= 0 && class198.field3004 > var6) {
                    class355.field5243[arg4][var9][var6] = arg4 > 0 ? class355.field5243[arg4 - 1][var9][var6] - 240 : 0;
                }
            }
        }
        field1098++;
        if (arg2 > 0 && arg2 < class115.field1522) {
            for (int var7 = arg3 + 1; var7 < arg1 + arg3; var7++) {
                if (var7 >= 0 && class198.field3004 > var7) {
                    class355.field5243[arg4][arg2][var7] = class355.field5243[arg4][arg2 - 1][var7];
                }
            }
        }
        if (arg3 > 0 && arg3 < class198.field3004) {
            for (int var8 = arg2 + 1; var8 < arg2 + arg5; var8++) {
                if (var8 >= 0 && class115.field1522 > var8) {
                    class355.field5243[arg4][var8][arg3] = class355.field5243[arg4][var8][arg3 - 1];
                }
            }
        }
        if (arg0 != -21375) {
            field1103 = null;
        }
        if (arg2 < 0 || arg3 < 0 || arg2 >= class115.field1522 || class198.field3004 <= arg3) {
            return;
        }
        if (arg4 == 0) {
            if (arg2 <= 0 || class355.field5243[arg4][arg2 - 1][arg3] == 0) {
                if (arg3 > 0 && class355.field5243[arg4][arg2][arg3 - 1] != 0) {
                    class355.field5243[arg4][arg2][arg3] = class355.field5243[arg4][arg2][arg3 - 1];
                    return;
                }
                if (arg2 > 0 && arg3 > 0 && class355.field5243[arg4][arg2 - 1][arg3 - 1] != 0) {
                    class355.field5243[arg4][arg2][arg3] = class355.field5243[arg4][arg2 - 1][arg3 - 1];
                    return;
                }
                return;
            }
            class355.field5243[arg4][arg2][arg3] = class355.field5243[arg4][arg2 - 1][arg3];
        } else if (arg2 <= 0 || class355.field5243[arg4 - 1][arg2 - 1][arg3] == class355.field5243[arg4][arg2 - 1][arg3]) {
            if (arg3 > 0 && class355.field5243[arg4][arg2][arg3 - 1] != class355.field5243[arg4 - 1][arg2][arg3 - 1]) {
                class355.field5243[arg4][arg2][arg3] = class355.field5243[arg4][arg2][arg3 - 1];
                return;
            }
            if (arg2 > 0 && arg3 > 0 && class355.field5243[arg4][arg2 - 1][arg3 - 1] != class355.field5243[arg4 - 1][arg2 - 1][arg3 - 1]) {
                class355.field5243[arg4][arg2][arg3] = class355.field5243[arg4][arg2 - 1][arg3 - 1];
                return;
            }
        } else {
            class355.field5243[arg4][arg2][arg3] = class355.field5243[arg4][arg2 - 1][arg3];
            return;
        }
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(Ldr;I)V")
    public final void method15(class261 arg0, int arg1) {
        field1092++;
        if (arg1 <= 114) {
            field1101 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)I")
    public final int method3(byte arg0) {
        if (arg0 > -3) {
            method528(-34);
        }
        field1100++;
        return 0;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)Lkp;")
    public static final class337 method527(int arg0, int arg1, int arg2) {
        class13 var3 = class277.field4216[arg0][arg1][arg2];
        return var3 == null ? null : var3.field149;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLdr;)V")
    public final void method2(byte arg0, class261 arg1) {
        field1095++;
        if (arg0 != 76) {
            method529((class119) null, (byte) 23, -101);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)I")
    public final int method7(boolean arg0) {
        if (!arg0) {
            this.method7(false);
        }
        field1102++;
        return 0;
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V")
    public final void method11(int arg0) {
        field1091++;
        if (arg0 != -21910) {
            this.field1097 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)Z")
    public final boolean method1(int arg0) {
        field1104++;
        int var2 = 86 % ((-arg0 - 1) / 46);
        return false;
    }

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "(I)V")
    public static void method528(int arg0) {
        if (arg0 != -1) {
            field1103 = null;
        }
        field1103 = null;
        field1093 = null;
        field1101 = null;
        field1105 = null;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(IIIIILkp;)V")
    public class82(int arg0, int arg1, int arg2, int arg3, int arg4, class337 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class62.method336(arg0, -6, arg1));
        this.field1097 = arg5;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljk;BI)V")
    public static final void method529(class119 arg0, byte arg1, int arg2) {
        if (arg1 <= 29) {
            field1105 = null;
        }
        field1099++;
        boolean var3 = arg0.method717(1, false) == 1;
        if (var3) {
            class133.field1729[class109.field1441++] = arg2;
        }
        int var4 = arg0.method717(2, false);
        class169 var5 = class140.field1883[arg2];
        if (var4 == 0) {
            if (var3) {
                var5.field2433 = -1;
            } else if (class386.field5703 == arg2) {
                throw new RuntimeException("s:lr");
            } else {
                class281.field4300[arg2] = (class112.field1487 + var5.field2018[0] >> 6) + (var5.field2019[0] + class17.field250 >> 6 << 14) + (var5.field1902 << 28);
                if (var5.field2444 == -1) {
                    class302.field4567[arg2] = var5.field1971.method2178(-14579);
                } else {
                    class302.field4567[arg2] = var5.field2444;
                }
                class241.field3625[arg2] = var5.field1956;
                if (var5.field2462 > 0) {
                    class288.method1781(1, var5);
                }
                class140.field1883[arg2] = null;
                if (arg0.method717(1, false) != 0) {
                    class37.method210((byte) -86, arg2, arg0);
                }
            }
        } else if (var4 == 1) {
            int var6 = arg0.method717(3, false);
            int var7 = var5.field2019[0];
            int var8 = var5.field2018[0];
            if (var6 == 0) {
                var8--;
                var7--;
            } else if (var6 == 1) {
                var8--;
            } else if (var6 == 2) {
                var7++;
                var8--;
            } else if (var6 == 3) {
                var7--;
            } else if (var6 == 4) {
                var7++;
            } else if (var6 == 5) {
                var8++;
                var7--;
            } else if (var6 == 6) {
                var8++;
            } else if (var6 == 7) {
                var7++;
                var8++;
            }
            if (var3) {
                var5.field2440 = var8;
                var5.field2433 = var7;
            } else {
                var5.field2433 = -1;
                var5.method1031(class339.field5060[arg2], var8, -36, var7);
            }
        } else if (var4 == 2) {
            int var9 = arg0.method717(4, false);
            int var10 = var5.field2019[0];
            int var11 = var5.field2018[0];
            if (var9 == 0) {
                var11 -= 2;
                var10 -= 2;
            } else if (var9 == 1) {
                var10--;
                var11 -= 2;
            } else if (var9 == 2) {
                var11 -= 2;
            } else if (var9 == 3) {
                var10++;
                var11 -= 2;
            } else if (var9 == 4) {
                var11 -= 2;
                var10 += 2;
            } else if (var9 == 5) {
                var10 -= 2;
                var11--;
            } else if (var9 == 6) {
                var10 += 2;
                var11--;
            } else if (var9 == 7) {
                var10 -= 2;
            } else if (var9 == 8) {
                var10 += 2;
            } else if (var9 == 9) {
                var10 -= 2;
                var11++;
            } else if (var9 == 10) {
                var11++;
                var10 += 2;
            } else if (var9 == 11) {
                var11 += 2;
                var10 -= 2;
            } else if (var9 == 12) {
                var10--;
                var11 += 2;
            } else if (var9 == 13) {
                var11 += 2;
            } else if (var9 == 14) {
                var11 += 2;
                var10++;
            } else if (var9 == 15) {
                var10 += 2;
                var11 += 2;
            }
            if (var3) {
                var5.field2433 = var10;
                var5.field2440 = var11;
            } else {
                var5.field2433 = -1;
                var5.method1031(class339.field5060[arg2], var11, -61, var10);
            }
        } else {
            int var12 = arg0.method717(1, false);
            if (var12 == 0) {
                int var13 = arg0.method717(12, false);
                int var14 = var13 >> 10;
                int var15 = var13 >> 5 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var13 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var5.field2019[0] + var15;
                int var18 = var5.field2018[0] + var16;
                if (var3) {
                    var5.field2440 = var18;
                    var5.field2433 = var17;
                } else {
                    var5.field2433 = -1;
                    var5.method1031(class339.field5060[arg2], var18, -100, var17);
                }
                var5.field1902 = (byte) (var5.field1902 + var14 & 0x3);
                if (class386.field5703 == arg2) {
                    class143.field1911 = var5.field1902;
                }
            } else {
                int var19 = arg0.method717(30, false);
                int var20 = var19 >> 28;
                int var21 = (var19 & 0xFFFD2D3) >> 14;
                int var22 = var19 & 0x3FFF;
                int var23 = (var5.field2019[0] + class17.field250 + var21 & 0x3FFF) - class17.field250;
                int var24 = (var5.field2018[0] + var22 + class112.field1487 & 0x3FFF) - class112.field1487;
                if (var3) {
                    var5.field2433 = var23;
                    var5.field2440 = var24;
                } else {
                    var5.field2433 = -1;
                    var5.method1031(class339.field5060[arg2], var24, -85, var23);
                }
                var5.field1902 = (byte) (var5.field1902 + var20 & 0x3);
                if (class386.field5703 == arg2) {
                    class143.field1911 = var5.field1902;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IILdr;I)Z")
    public final boolean method4(int arg0, int arg1, class261 arg2, int arg3) {
        field1087++;
        if (arg3 != 2) {
            field1093 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)I")
    public final int method9(int arg0) {
        field1088++;
        return arg0 < 26 ? -48 : 0;
    }
}
