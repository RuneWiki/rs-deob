import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class177 {

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "Ldw;")
    public class613 field2700 = new class613();

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "[I")
    public static int[] field2708 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "Lhca;")
    public static class418 field2706;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "Ldw;")
    private class613 field2711;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILgw;I)Ljava/lang/String;")
    public static final String method1242(int arg0, class148 arg1, int arg2) {
        field2704++;
        try {
            int var3 = arg1.method1055(1957696096);
            if (arg0 < var3) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg1.field2177 += class215.field3166.method134(var3, true, var4, 0, arg1.field2146, arg1.field2177);
            if (arg2 != -7188) {
                method1248(true, 92, null, false, -40, -103);
            }
            return class174.method1222(0, var4, var3, arg2 ^ 0x1C93);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public static void method1243(int arg0) {
        int var1 = -118 % ((arg0 + 1) / 41);
        field2708 = null;
        field2706 = null;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)I")
    public final int method1244(int arg0) {
        field2701++;
        int var2 = 0;
        for (class613 var3 = this.field2700.field9070; var3 != this.field2700; var3 = var3.field9070) {
            var2++;
        }
        if (arg0 != -21363) {
            this.field2711 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)V")
    public final void method1245(int arg0) {
        field2699++;
        int var2 = 44 / ((7 - arg0) / 37);
        while (true) {
            class613 var3 = this.field2700.field9070;
            if (this.field2700 == var3) {
                this.field2711 = null;
                return;
            }
            var3.method3591((byte) 81);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)V")
    public static final void method1246(int arg0, int arg1, int arg2) {
        if (arg2 < -80) {
            field2698++;
            class221 var3 = class65.method413(13, arg1, (byte) -72);
            var3.method1426((byte) -119);
            var3.field3214 = arg0;
        }
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)Ldw;")
    public final class613 method1247(int arg0) {
        field2707++;
        class613 var2 = this.field2700.field9070;
        if (arg0 != 10884) {
            return null;
        } else if (this.field2700 == var2) {
            this.field2711 = null;
            return null;
        } else {
            this.field2711 = var2.field9070;
            return var2;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZI[[[Lnj;ZII)Z")
    public static final boolean method1248(boolean arg0, int arg1, class205[][][] arg2, boolean arg3, int arg4, int arg5) {
        field2702++;
        byte var6 = arg3 ? 1 : (byte) (class84.field1205 & 0xFF);
        if (class383.field5270[class89.field1339][arg5][arg4] == var6) {
            return false;
        } else if ((class146.field2114[class89.field1339][arg5][arg4] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            if (arg0) {
                method1248(true, 119, null, true, 89, -39);
            }
            class222.field3228[var7] = arg5;
            int var35 = var7 + 1;
            class552.field8227[var7] = arg4;
            class383.field5270[class89.field1339][arg5][arg4] = var6;
            while (var35 != var8) {
                int var9 = class222.field3228[var8] & 0xFFFF;
                int var10 = class222.field3228[var8] >> 16 & 0xFF;
                int var11 = class222.field3228[var8] >> 24 & 0xFF;
                int var12 = class552.field8227[var8] & 0xFFFF;
                int var13 = (class552.field8227[var8] & 0xFF51D6) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class146.field2114[class89.field1339][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class89.field1339 + 1; var16 <= 3; var16++) {
                    if ((class146.field2114[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg2[var16][var9][var12] != null) {
                            if (arg2[var16][var9][var12].field3047 != null) {
                                int var20 = class483.method2907(var10, 18701);
                                if (arg2[var16][var9][var12].field3047.field1595 == var20 || arg2[var16][var9][var12].field3037 != null && arg2[var16][var9][var12].field3037.field1595 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class483.method2907(var11, 18701);
                                    if (arg2[var16][var9][var12].field3047.field1595 == var21 || arg2[var16][var9][var12].field3037 != null && arg2[var16][var9][var12].field3037.field1595 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class483.method2907(var13, 18701);
                                    if (arg2[var16][var9][var12].field3047.field1595 == var22 || arg2[var16][var9][var12].field3037 != null && arg2[var16][var9][var12].field3037.field1595 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class205 var23 = arg2[var16][var9][var12];
                            if (var23.field3029 != null) {
                                for (class636 var24 = var23.field3029; var24 != null; var24 = var24.field9302) {
                                    class577 var25 = var24.field9299;
                                    if (var25 instanceof class231) {
                                        class231 var26 = (class231) var25;
                                        int var27 = var26.method173((byte) -98);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var28 = var26.method170(-123);
                                        int var29 = var28 << 6 | var27;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class205 var30 = arg2[var16][var9][var12];
                        if (var30 != null && var30.field3029 != null) {
                            for (class636 var31 = var30.field3029; var31 != null; var31 = var31.field9302) {
                                class577 var32 = var31.field9299;
                                if (var32.field8508 != var32.field8504 || var32.field8509 != var32.field8499) {
                                    for (int var33 = var32.field8504; var33 <= var32.field8508; var33++) {
                                        for (int var34 = var32.field8509; var34 <= var32.field8499; var34++) {
                                            class383.field5270[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class383.field5270[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var17 = class165.field2609[class89.field1339 + 1].method1239(var9, var12);
                    if (class25.field240[arg1] < var17) {
                        class25.field240[arg1] = var17;
                    }
                    int var18 = var9 << 7;
                    int var19 = var12 << 7;
                    if (var18 < class168.field2631[arg1]) {
                        class168.field2631[arg1] = var18;
                    } else if (class144.field2013[arg1] < var18) {
                        class144.field2013[arg1] = var18;
                    }
                    if (var19 < class513.field7337[arg1]) {
                        class513.field7337[arg1] = var19;
                    } else if (var19 > class149.field2208[arg1]) {
                        class149.field2208[arg1] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class383.field5270[class89.field1339][var9 - 1][var12] != var6) {
                        class222.field3228[var35] = class473.method2847(class473.method2847(1179648, var9 - 1), -754974720);
                        class552.field8227[var35] = class473.method2847(1245184, var12);
                        class383.field5270[class89.field1339][var9 - 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12++;
                    if (var12 < class410.field5609) {
                        if ((var9 - 1) >= 0 && class383.field5270[class89.field1339][var9 - 1][var12] != var6 && (class146.field2114[class89.field1339][var9][var12] & 0x4) == 0 && (class146.field2114[class89.field1339][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class222.field3228[var35] = class473.method2847(class473.method2847(var9 - 1, 1179648), 1375731712);
                            class552.field8227[var35] = class473.method2847(1245184, var12);
                            class383.field5270[class89.field1339][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class383.field5270[class89.field1339][var9][var12] != var6) {
                            class222.field3228[var35] = class473.method2847(318767104, class473.method2847(5373952, var9));
                            class552.field8227[var35] = class473.method2847(5439488, var12);
                            class383.field5270[class89.field1339][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class146.field2125 > var9 + 1 && class383.field5270[class89.field1339][var9 + 1][var12] != var6 && (class146.field2114[class89.field1339][var9][var12] & 0x4) == 0 && (class146.field2114[class89.field1339][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class222.field3228[var35] = class473.method2847(class473.method2847(var9 + 1, 5373952), -1845493760);
                            class552.field8227[var35] = class473.method2847(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class383.field5270[class89.field1339][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (class146.field2125 > (var9 + 1) && class383.field5270[class89.field1339][var9 + 1][var12] != var6) {
                        class222.field3228[var35] = class473.method2847(1392508928, class473.method2847(var9 + 1, 9568256));
                        class552.field8227[var35] = class473.method2847(var12, 9633792);
                        class383.field5270[class89.field1339][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class383.field5270[class89.field1339][var9 - 1][var12] != var6 && (class146.field2114[class89.field1339][var9][var12] & 0x4) == 0 && (class146.field2114[class89.field1339][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class222.field3228[var35] = class473.method2847(class473.method2847(var9 - 1, 13762560), 301989888);
                            class552.field8227[var35] = class473.method2847(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class383.field5270[class89.field1339][var9 - 1][var12] = var6;
                        }
                        if (class383.field5270[class89.field1339][var9][var12] != var6) {
                            class222.field3228[var35] = class473.method2847(class473.method2847(var9, 13762560), -1828716544);
                            class552.field8227[var35] = class473.method2847(13828096, var12);
                            class383.field5270[class89.field1339][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class146.field2125 > var9 + 1 && class383.field5270[class89.field1339][var9 + 1][var12] != var6 && (class146.field2114[class89.field1339][var9][var12] & 0x4) == 0 && (class146.field2114[class89.field1339][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class222.field3228[var35] = class473.method2847(class473.method2847(var9 + 1, 9568256), -771751936);
                            class552.field8227[var35] = class473.method2847(9633792, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class383.field5270[class89.field1339][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class25.field240[arg1] != -1000000) {
                class25.field240[arg1] += 10;
                class168.field2631[arg1] -= 50;
                class144.field2013[arg1] += 50;
                class149.field2208[arg1] += 50;
                class513.field7337[arg1] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ldw;I)V")
    public final void method1249(class613 arg0, int arg1) {
        field2705++;
        if (arg0.field9071 != null) {
            arg0.method3591((byte) 81);
        }
        arg0.field9071 = this.field2700.field9071;
        if (arg1 == -4) {
            arg0.field9070 = this.field2700;
            arg0.field9071.field9070 = arg0;
            arg0.field9070.field9071 = arg0;
        }
    }

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "(I)Ldw;")
    public final class613 method1250(int arg0) {
        field2710++;
        class613 var2 = this.field2711;
        if (this.field2700 == var2) {
            this.field2711 = null;
            return null;
        }
        if (arg0 != 4194303) {
            field2703 = 40;
        }
        this.field2711 = var2.field9070;
        return var2;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1251(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2709++;
        int var7 = class36.method223(class100.field1452, (byte) 50, arg3, class3.field25);
        int var8 = class36.method223(class100.field1452, (byte) 50, arg0, class3.field25);
        int var9 = class36.method223(class130.field1801, (byte) 50, arg6, class14.field136);
        int var10 = class36.method223(class130.field1801, (byte) 50, arg5, class14.field136);
        int var11 = class36.method223(class100.field1452, (byte) 50, arg2 + arg3, class3.field25);
        int var12 = class36.method223(class100.field1452, (byte) 50, arg0 - arg2, class3.field25);
        if (arg4 != 1) {
            return;
        }
        for (int var13 = var7; var13 < var11; var13++) {
            class140.method969(var9, 15888, arg1, var10, class604.field8993[var13]);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class140.method969(var9, 15888, arg1, var10, class604.field8993[var14]);
        }
        int var15 = class36.method223(class130.field1801, (byte) 50, arg6 + arg2, class14.field136);
        int var16 = class36.method223(class130.field1801, (byte) 50, arg5 - arg2, class14.field136);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class604.field8993[var17];
            class140.method969(var9, 15888, arg1, var15, var18);
            class140.method969(var16, 15888, arg1, var10, var18);
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
    public class177() {
        this.field2700.field9071 = this.field2700;
        this.field2700.field9070 = this.field2700;
    }
}
