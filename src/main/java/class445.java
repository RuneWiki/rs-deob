import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class445 {

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "Lh;")
    public static class434 field6049 = new class434(90, 12);

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "Lad;")
    public static class268 field6055 = new class268(16);

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "Lmc;")
    public static class78 field6058 = new class78(39, 3);

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "J")
    public long field6047;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "Lbu;")
    public static class17 field6061;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Lag;")
    public class445 field6046;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "Lag;")
    public class445 field6048;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)Z", line = 6)
    public final boolean method2608(int arg0) {
        field6059++;
        if (arg0 == 25657) {
            return this.field6048 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ldg;IIIIIIIIII)Z", line = 21)
    public static final boolean method2609(class261 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field6054++;
        int var11 = arg10;
        int var12 = arg3;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg10 - var13;
        class65.field860[var13][var14] = 99;
        int var16 = arg3 - var14;
        class173.field2376[var13][var14] = 0;
        if (arg7 != 1) {
            return true;
        }
        byte var17 = 0;
        class68.field933[var17] = arg10;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class203.field2752[var10001] = arg3;
        int[][] var19 = arg0.field3454;
        while (var26 != var18) {
            var11 = class68.field933[var18];
            var12 = class203.field2752[var18];
            int var20 = var12 - arg0.field3469;
            var18 = var18 + 1 & 0xFFF;
            int var21 = var12 - var16;
            int var22 = var11 - var15;
            int var23 = var11 - arg0.field3451;
            if (arg6 == -4) {
                if (arg5 == var11 && arg4 == var12) {
                    class114.field1712 = var12;
                    class216.field2911 = var11;
                    return true;
                }
            } else if (arg6 == -3) {
                if (class27.method160(arg9, var12, arg4, var11, -50, arg5, 1, arg1, 1)) {
                    class114.field1712 = var12;
                    class216.field2911 = var11;
                    return true;
                }
            } else if (arg6 == -2) {
                if (arg0.method1480(arg9, var11, 23160, arg4, 1, arg8, arg5, var12, 1, arg1)) {
                    class114.field1712 = var12;
                    class216.field2911 = var11;
                    return true;
                }
            } else if (arg6 == -1) {
                if (arg0.method1483(arg8, arg5, arg9, var11, arg4, 4321, arg1, var12, 1)) {
                    class216.field2911 = var11;
                    class114.field1712 = var12;
                    return true;
                }
            } else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
                if (arg0.method1472(1, arg5, true, arg6, arg4, arg2, var12, var11)) {
                    class216.field2911 = var11;
                    class114.field1712 = var12;
                    return true;
                }
            } else if (arg0.method1473(arg2, 1, var12, var11, arg6, 19348, arg4, arg5)) {
                class114.field1712 = var12;
                class216.field2911 = var11;
                return true;
            }
            int var25 = class173.field2376[var22][var21] + 1;
            if (var22 > 0 && class65.field860[var22 - 1][var21] == 0 && (var19[var23 - 1][var20] & 0x42240000) == 0) {
                class68.field933[var26] = var11 - 1;
                class203.field2752[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class65.field860[var22 - 1][var21] = 2;
                class173.field2376[var22 - 1][var21] = var25;
            }
            if (var22 < 127 && class65.field860[var22 + 1][var21] == 0 && (var19[var23 + 1][var20] & 0x60240000) == 0) {
                class68.field933[var26] = var11 + 1;
                class203.field2752[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class65.field860[var22 + 1][var21] = 8;
                class173.field2376[var22 + 1][var21] = var25;
            }
            if (var21 > 0 && class65.field860[var22][var21 - 1] == 0 && (var19[var23][var20 - 1] & 0x40A40000) == 0) {
                class68.field933[var26] = var11;
                class203.field2752[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class65.field860[var22][var21 - 1] = 1;
                class173.field2376[var22][var21 - 1] = var25;
            }
            if (var21 < 127 && class65.field860[var22][var21 + 1] == 0 && (var19[var23][var20 + 1] & 0x48240000) == 0) {
                class68.field933[var26] = var11;
                class203.field2752[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class65.field860[var22][var21 + 1] = 4;
                class173.field2376[var22][var21 + 1] = var25;
            }
            if (var22 > 0 && var21 > 0 && class65.field860[var22 - 1][var21 - 1] == 0 && (var19[var23 - 1][var20 - 1] & 0x43A40000) == 0 && (var19[var23 - 1][var20] & 0x42240000) == 0 && (var19[var23][var20 - 1] & 0x40A40000) == 0) {
                class68.field933[var26] = var11 - 1;
                class203.field2752[var26] = var12 - 1;
                class65.field860[var22 - 1][var21 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class173.field2376[var22 - 1][var21 - 1] = var25;
            }
            if (var22 < 127 && var21 > 0 && class65.field860[var22 + 1][var21 - 1] == 0 && (var19[var23 + 1][var20 - 1] & 0x60E40000) == 0 && (var19[var23 + 1][var20] & 0x60240000) == 0 && (var19[var23][var20 - 1] & 0x40A40000) == 0) {
                class68.field933[var26] = var11 + 1;
                class203.field2752[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class65.field860[var22 + 1][var21 - 1] = 9;
                class173.field2376[var22 + 1][var21 - 1] = var25;
            }
            if (var22 > 0 && var21 < 127 && class65.field860[var22 - 1][var21 + 1] == 0 && (var19[var23 - 1][var20 + 1] & 0x4E240000) == 0 && (var19[var23 - 1][var20] & 0x42240000) == 0 && (var19[var23][var20 + 1] & 0x48240000) == 0) {
                class68.field933[var26] = var11 - 1;
                class203.field2752[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class65.field860[var22 - 1][var21 + 1] = 6;
                class173.field2376[var22 - 1][var21 + 1] = var25;
            }
            if (var22 < 127 && var21 < 127 && class65.field860[var22 + 1][var21 + 1] == 0 && (var19[var23 + 1][var20 + 1] & 0x78240000) == 0 && (var19[var23 + 1][var20] & 0x60240000) == 0 && (var19[var23][var20 + 1] & 0x48240000) == 0) {
                class68.field933[var26] = var11 + 1;
                class203.field2752[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class65.field860[var22 + 1][var21 + 1] = 12;
                class173.field2376[var22 + 1][var21 + 1] = var25;
            }
        }
        class216.field2911 = var11;
        class114.field1712 = var12;
        return false;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lqg;II)V", line = 264)
    public static final void method2610(class296 arg0, int arg1, int arg2) {
        field6050++;
        boolean var3 = arg0.method1664((byte) -13, 1) == arg1;
        if (var3) {
            class93.field1364[class151.field2133++] = arg2;
        }
        int var4 = arg0.method1664((byte) -13, 2);
        class487 var5 = class413.field5644[arg2];
        if (var4 == 0) {
            if (var3) {
                var5.field6781 = false;
            } else if (class332.field4494 == arg2) {
                throw new RuntimeException("s:lr");
            } else {
                class71.field978[arg2] = (var5.field1193[0] + class162.field2260 >> 6 << 14) + (var5.field6502 << 28) + (var5.field1197[0] + class266.field3511 >> 6);
                if (var5.field6751 == -1) {
                    class108.field1617[arg2] = var5.field1143.method2758((byte) 70);
                } else {
                    class108.field1617[arg2] = var5.field6751;
                }
                class15.field219[arg2] = var5.field1154;
                if (var5.field6760 > 0) {
                    class346.method2133(-1, var5);
                }
                class413.field5644[arg2] = null;
                if (arg0.method1664((byte) -13, 1) != 0) {
                    class247.method1386(arg0, true, arg2);
                }
            }
        } else if (var4 == 1) {
            int var6 = arg0.method1664((byte) -13, 3);
            int var7 = var5.field1193[0];
            int var8 = var5.field1197[0];
            if (var6 == 0) {
                var8--;
                var7--;
            } else if (var6 == 1) {
                var8--;
            } else if (var6 == 2) {
                var8--;
                var7++;
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
                var5.field6746 = var7;
                var5.field6759 = var8;
                var5.field6781 = true;
            } else {
                var5.method2831(var8, -15816, var7, class280.field3754[arg2]);
            }
        } else if (var4 == 2) {
            int var9 = arg0.method1664((byte) -13, 4);
            int var10 = var5.field1193[0];
            int var11 = var5.field1197[0];
            if (var9 == 0) {
                var10 -= 2;
                var11 -= 2;
            } else if (var9 == 1) {
                var10--;
                var11 -= 2;
            } else if (var9 == 2) {
                var11 -= 2;
            } else if (var9 == 3) {
                var10++;
                var11 -= 2;
            } else if (var9 == 4) {
                var10 += 2;
                var11 -= 2;
            } else if (var9 == 5) {
                var11--;
                var10 -= 2;
            } else if (var9 == 6) {
                var11--;
                var10 += 2;
            } else if (var9 == 7) {
                var10 -= 2;
            } else if (var9 == 8) {
                var10 += 2;
            } else if (var9 == 9) {
                var11++;
                var10 -= 2;
            } else if (var9 == 10) {
                var11++;
                var10 += 2;
            } else if (var9 == 11) {
                var10 -= 2;
                var11 += 2;
            } else if (var9 == 12) {
                var10--;
                var11 += 2;
            } else if (var9 == 13) {
                var11 += 2;
            } else if (var9 == 14) {
                var11 += 2;
                var10++;
            } else if (var9 == 15) {
                var11 += 2;
                var10 += 2;
            }
            if (var3) {
                var5.field6759 = var11;
                var5.field6781 = true;
                var5.field6746 = var10;
            } else {
                var5.method2831(var11, -15816, var10, class280.field3754[arg2]);
            }
        } else {
            int var12 = arg0.method1664((byte) -13, 1);
            if (var12 == 0) {
                int var13 = arg0.method1664((byte) -13, 12);
                int var14 = var13 >> 10;
                int var15 = var13 >> 5 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var13 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var5.field1193[0] + var15;
                int var18 = var5.field1197[0] + var16;
                if (var3) {
                    var5.field6759 = var18;
                    var5.field6781 = true;
                    var5.field6746 = var17;
                } else {
                    var5.method2831(var18, -15816, var17, class280.field3754[arg2]);
                }
                var5.field6502 = (byte) (var5.field6502 + var14 & 0x3);
                if (class332.field4494 == arg2) {
                    class373.field5104 = var5.field6502;
                }
            } else {
                int var19 = arg0.method1664((byte) -13, 30);
                int var20 = var19 >> 28;
                int var21 = var19 >> 14 & 0x3FFF;
                int var22 = var19 & 0x3FFF;
                int var23 = (class162.field2260 + var21 + var5.field1193[0] & 0x3FFF) - class162.field2260;
                int var24 = (class266.field3511 + var22 + var5.field1197[0] & 0x3FFF) - class266.field3511;
                if (var3) {
                    var5.field6781 = true;
                    var5.field6759 = var24;
                    var5.field6746 = var23;
                } else {
                    var5.method2831(var24, -15816, var23, class280.field3754[arg2]);
                }
                var5.field6502 = (byte) (var5.field6502 + var20 & 0x3);
                if (class332.field4494 == arg2) {
                    class373.field5104 = var5.field6502;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lnk;B)Lnk;", line = 572)
    public static final class464 method2611(class464 arg0, byte arg1) {
        field6045++;
        if (arg0.field6362 != -1) {
            return class150.method888((byte) -115, arg0.field6362);
        } else if (arg1 == 72) {
            int var2 = arg0.field6440 >>> 16;
            class262 var3 = new class262(class214.field2883);
            for (class132 var4 = (class132) var3.method1487(-124); var4 != null; var4 = (class132) var3.method1486(false)) {
                if (var4.field1939 == var2) {
                    return class150.method888((byte) -115, (int) var4.field6047);
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZI)I", line = 602)
    public static final int method2612(int arg0, boolean arg1, int arg2) {
        field6052++;
        int var3 = class243.method1357(4, arg0 + 45365, 1, arg2 + 91923) + ((class243.method1357(2, arg0 + 10294, 1, arg2 + 37821) - 128 >> 1) + (class243.method1357(1, arg0, 1, arg2) - 128 >> 2) - 128);
        if (!arg1) {
            return 69;
        }
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)Lac;", line = 625)
    public static final class348 method2613(int arg0, byte arg1) {
        field6051++;
        if (class341.field4562 && arg0 >= class385.field5320 && class124.field1816 >= arg0) {
            if (arg1 > -5) {
                method2618((class464) null, 82);
            }
            return class110.field1680[arg0 - class385.field5320];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V", line = 640)
    public final void method2614(byte arg0) {
        field6056++;
        if (arg0 <= -67 && this.field6048 != null) {
            this.field6048.field6046 = this.field6046;
            this.field6046.field6048 = this.field6048;
            this.field6048 = null;
            this.field6046 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V", line = 658)
    public static final void method2615(int arg0, int arg1, int arg2) {
        field6057++;
        if (arg1 <= -38) {
            class106 var3 = class250.method1400(14, -30, arg2);
            var3.method658(0);
            var3.field1589 = arg0;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lbh;IZ)V", line = 673)
    public static final void method2616(class27 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return;
        }
        field6053++;
        if (class356.field4909) {
            class356.field4909 = false;
            arg1 = 0;
        }
        if (class169.field2336 != null && class169.field2336.method158((byte) 96, arg0)) {
            return;
        }
        class169.field2336 = arg0;
        class402.field5523 = class440.method2583(25267);
        class93.field1368 = arg1;
        class384.field5313 = arg1;
        if (class384.field5313 != 0) {
            class77.field1040 = class37.field554;
            class373.field5080 = class392.field5439;
            class12.field165 = class375.field5172;
            class195.field2646 = class30.field404;
            class21.field284 = class476.field6568;
            class8.field108 = class162.field2261;
            class488.field6815 = class18.field257;
            class69.field946 = class27.field357;
            class487.field6780 = class48.field641;
            class16.field227 = class467.field6466;
            return;
        }
        class76.method504(16711680);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V", line = 717)
    public static void method2617(boolean arg0) {
        field6049 = null;
        field6061 = null;
        field6055 = null;
        field6058 = null;
        if (arg0) {
            method2613(-128, (byte) -111);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lnk;I)Z", line = 738)
    public static final boolean method2618(class464 arg0, int arg1) {
        field6044++;
        if (arg1 != 64) {
            field6061 = null;
        }
        if (class13.field184 == arg0.field6359) {
            class127.field1869 = 250;
            return true;
        } else {
            return false;
        }
    }
}
