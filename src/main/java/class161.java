import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class161 {

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field2538 = 99;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2544 = "cyan:";

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "Lfa;")
    public static class273 field2532;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "[[I")
    public static int[][] field2543;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
    public static final void method1064(byte arg0) {
        field2541++;
        if (class165.method1108(arg0 - 24) || class165.field2600 == class102.field1537) {
            class201.method1387((byte) 46);
            if (arg0 == 24 && class272.field4470 != class165.field2600) {
                class45.method285((byte) -111);
            }
        } else {
            class216.method1511(class309.field5006.field849[0], class165.field2600, class309.field5006.field804[0], (byte) -105, class113.field1711, class266.field4370, false, false);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static void method1065(int arg0) {
        field2544 = null;
        if (arg0 >= -12) {
            method1070(-79);
        }
        field2543 = null;
        field2532 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZ)V")
    public static final void method1066(int arg0, boolean arg1) {
        field2537++;
        byte var2 = 4;
        byte[][] var3 = class242.field3841;
        for (int var4 = 0; var4 < var2; var4++) {
            class217.method1521(arg0 - 7);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class193.field3049[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x3EBB7EE) >> 24;
                        if (!arg1 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = (var7 & 0xFFC40E) >> 14;
                            int var11 = (var7 & 0x3FFF) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class53.field718.length; var13++) {
                                if (class53.field718[var13] == var12 && var3[var13] != null) {
                                    class48.method302(var6 * 8, var8, var4, var9, var3[var13], (byte) -121, class183.field2841, var5 * 8, (var10 & 0x7) * 8, arg1, (var11 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 8) {
            field2532 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIB)Lvk;")
    public static final class36 method1067(int arg0, int arg1, byte arg2) {
        field2534++;
        if (arg2 != 81) {
            method1069(-4, (class202) null);
        }
        class36 var3 = (class36) class134.field2100.method872((byte) -93, (long) arg1 | (long) arg0 << 32);
        if (var3 == null) {
            var3 = new class36(arg0, arg1);
            class134.field2100.method857(false, var3, var3.field2102);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)V")
    public static final void method1068(byte arg0) {
        for (int var1 = -1; var1 < class249.field3964; var1++) {
            int var6;
            if (var1 == -1) {
                var6 = 2047;
            } else {
                var6 = class53.field713[var1];
            }
            class208 var7 = class300.field4925[var6];
            if (var7 != null && var7.field852 > 0) {
                var7.field852--;
                if (var7.field852 == 0) {
                    var7.field831 = null;
                }
            }
        }
        field2533++;
        int var2 = 0;
        int var3 = -60 % ((-arg0 - 18) / 56);
        while (class14.field195 > var2) {
            int var4 = class76.field1189[var2];
            class35 var5 = class76.field1188[var4];
            if (var5 != null && var5.field852 > 0) {
                var5.field852--;
                if (var5.field852 == 0) {
                    var5.field831 = null;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILma;)Lke;")
    public static final class115 method1069(int arg0, class202 arg1) {
        field2540++;
        if (arg0 != -22403) {
            method1071((class58) null, (byte) 71);
        }
        return new class115(arg1.method1442(-1970239824), arg1.method1442(-1970239824), arg1.method1442(-1970239824), arg1.method1442(-1970239824), arg1.method1401((byte) -114), arg1.method1401((byte) -114), arg1.method1420((byte) 0));
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
    public static final void method1070(int arg0) {
        if (arg0 != 27950) {
            field2543 = null;
        }
        for (class145 var1 = (class145) class226.field3589.method1959(205); var1 != null; var1 = (class145) class226.field3589.method1956(arg0 ^ 0x6D71)) {
            if (var1.field2272) {
                var1.method973(arg0 - 27950);
            }
        }
        field2536++;
        for (class145 var2 = (class145) class66.field976.method1959(205); var2 != null; var2 = (class145) class66.field976.method1956(79)) {
            if (var2.field2272) {
                var2.method973(0);
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lpd;B)V")
    public static final void method1071(class58 arg0, byte arg1) {
        field2542++;
        if (arg1 >= -101) {
            field2544 = null;
        }
        class261 var2 = arg0.method361(-1);
        arg0.field857 = var2.field4282;
        if (arg0.field862 == 0) {
            arg0.field878 = 0;
            return;
        }
        if (arg0.field853 != -1 && arg0.field883 == 0) {
            class200 var3 = class196.method1359(arg0.field853, (byte) 21);
            if (arg0.field856 > 0 && var3.field3178 == 0) {
                arg0.field878++;
                return;
            }
            if (arg0.field856 <= 0 && var3.field3186 == 0) {
                arg0.field878++;
                return;
            }
        }
        if (arg0.field870 != -1 && arg0.field827 <= class4.field32) {
            class119 var4 = class278.method1939(arg0.field870, (byte) -118);
            if (var4.field1833 && var4.field1810 != -1) {
                class200 var5 = class196.method1359(var4.field1810, (byte) 21);
                if (arg0.field856 > 0 && var5.field3178 == 0) {
                    arg0.field878++;
                    return;
                }
                if (arg0.field856 <= 0 && var5.field3186 == 0) {
                    arg0.field878++;
                    return;
                }
            }
        }
        int var6 = arg0.field836;
        int var7 = arg0.field850;
        int var8 = arg0.field849[arg0.field862 - 1] * 128 + (arg0.method362(25892) * 64);
        int var9 = arg0.field804[arg0.field862 - 1] * 128 + arg0.method362(25892) * 64;
        if (var8 - var6 > 256 || var8 - var6 < -256 || var9 - var7 > 256 || var9 - var7 < -256) {
            arg0.field850 = var9;
            arg0.field836 = var8;
            return;
        }
        int var10 = var2.field4298;
        if (var8 <= var6) {
            if (var6 <= var8) {
                if (var9 > var7) {
                    arg0.field802 = 1024;
                } else if (var7 > var9) {
                    arg0.field802 = 0;
                }
            } else if (var7 < var9) {
                arg0.field802 = 768;
            } else if (var7 > var9) {
                arg0.field802 = 256;
            } else {
                arg0.field802 = 512;
            }
        } else if (var9 > var7) {
            arg0.field802 = 1280;
        } else if (var9 >= var7) {
            arg0.field802 = 1536;
        } else {
            arg0.field802 = 1792;
        }
        int var11 = arg0.field802 - arg0.field855 & 0x7FF;
        byte var12 = 1;
        if (var11 > 1024) {
            var11 -= 2048;
        }
        if (var11 >= -256 && var11 <= 256) {
            var10 = var2.field4276;
        } else if (var11 >= 256 && var11 < 768) {
            var10 = var2.field4284;
        } else if (var11 >= -768 && var11 <= -256) {
            var10 = var2.field4277;
        }
        int var13 = 4;
        boolean var14 = true;
        if (var10 == -1) {
            var10 = var2.field4276;
        }
        arg0.field857 = var10;
        if (arg0 instanceof class35) {
            var14 = ((class35) arg0).field442.field1602;
        }
        if (var14) {
            if (arg0.field855 != arg0.field802 && arg0.field814 == -1 && arg0.field841 != 0) {
                var13 = 2;
            }
            if (arg0.field862 > 2) {
                var13 = 6;
            }
            if (arg0.field862 > 3) {
                var13 = 8;
            }
            if (arg0.field878 > 0 && arg0.field862 > 1) {
                var13 = 8;
                arg0.field878--;
            }
        } else {
            if (arg0.field862 > 1) {
                var13 = 6;
            }
            if (arg0.field862 > 2) {
                var13 = 8;
            }
            if (arg0.field878 > 0 && arg0.field862 > 1) {
                arg0.field878--;
                var13 = 8;
            }
        }
        if (arg0.field834[arg0.field862 - 1] == 2) {
            var12 = 2;
            var13 <<= 0x1;
        } else if (arg0.field834[arg0.field862 - 1] == 0) {
            var12 = 0;
            var13 >>= 0x1;
        }
        if (var13 < 8 || var2.field4299 == -1) {
            if (var2.field4308 != -1 && var12 == 0) {
                if (arg0.field857 == var2.field4298 && var2.field4281 != -1) {
                    arg0.field857 = var2.field4281;
                } else if (arg0.field857 == var2.field4277 && var2.field4275 != -1) {
                    arg0.field857 = var2.field4275;
                } else if (arg0.field857 == var2.field4284 && var2.field4272 != -1) {
                    arg0.field857 = var2.field4272;
                } else {
                    arg0.field857 = var2.field4308;
                }
            }
        } else if (arg0.field857 == var2.field4298 && var2.field4278 != -1) {
            arg0.field857 = var2.field4278;
        } else if (arg0.field857 == var2.field4277 && var2.field4305 != -1) {
            arg0.field857 = var2.field4305;
        } else if (arg0.field857 == var2.field4284 && var2.field4302 != -1) {
            arg0.field857 = var2.field4302;
        } else {
            arg0.field857 = var2.field4299;
        }
        if (var2.field4268 != -1) {
            int var15 = var13 << 7;
            if (arg0.field862 == 1) {
                int var16 = arg0.field832 * arg0.field832;
                int var17 = (var8 >= arg0.field836 ? var8 - arg0.field836 : -var8 + arg0.field836) << 7;
                int var18 = (var9 >= arg0.field850 ? var9 - arg0.field850 : -var9 + arg0.field850) << 7;
                int var19 = var18 >= var17 ? var18 : var17;
                int var20 = var19 * 2 * var2.field4268;
                if (var20 < var16) {
                    arg0.field832 /= 2;
                } else if (var19 < (var16 / 2)) {
                    arg0.field832 -= var2.field4268;
                    if (arg0.field832 < 0) {
                        arg0.field832 = 0;
                    }
                } else if (var15 > arg0.field832) {
                    arg0.field832 += var2.field4268;
                    if (arg0.field832 > var15) {
                        arg0.field832 = var15;
                    }
                }
            } else if (arg0.field832 < var15) {
                arg0.field832 += var2.field4268;
                if (var15 < arg0.field832) {
                    arg0.field832 = var15;
                }
            } else if (arg0.field832 > 0) {
                arg0.field832 -= var2.field4268;
                if (arg0.field832 < 0) {
                    arg0.field832 = 0;
                }
            }
            var13 = arg0.field832 >> 7;
            if (var13 < 1) {
                var13 = 1;
            }
        }
        if (var8 > var6) {
            arg0.field836 += var13;
            if (var8 < arg0.field836) {
                arg0.field836 = var8;
            }
        } else if (var8 < var6) {
            arg0.field836 -= var13;
            if (var8 > arg0.field836) {
                arg0.field836 = var8;
            }
        }
        if (var9 > var7) {
            arg0.field850 += var13;
            if (var9 < arg0.field850) {
                arg0.field850 = var9;
            }
        } else if (var7 > var9) {
            arg0.field850 -= var13;
            if (arg0.field850 < var9) {
                arg0.field850 = var9;
            }
        }
        if (arg0.field836 != var8 || arg0.field850 != var9) {
            return;
        }
        if (arg0.field856 > 0) {
            arg0.field856--;
        }
        arg0.field862--;
        return;
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(B)V")
    public static final void method1072(byte arg0) {
        field2535++;
        class218.field3482.method145(arg0 - 167);
        class69.field1009.method145(-72);
        if (arg0 == 51) {
            class12.field152.method145(arg0 - 163);
        }
    }
}
