import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class112 {

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "Lnk;")
    public static class2 field1722 = new class2();

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "F")
    public static float field1719;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "Lwf;")
    public static class306 field1718;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLte;)V", line = 5)
    public static final void method748(byte arg0, class38 arg1) {
        field1716++;
        if (arg1.field565 == 0) {
            return;
        }
        if (arg0 != 101) {
            field1722 = (class2) null;
        }
        class309 var2 = arg1.method280(arg0 ^ 0xFFFFFFD5);
        if (arg1.field551 != -1 && arg1.field551 < 32768) {
            class80 var3 = class208.field3313[arg1.field551];
            if (var3 != null) {
                int var4 = arg1.field537 - var3.field537;
                int var5 = arg1.field519 - var3.field519;
                if (var4 != 0 || var5 != 0) {
                    arg1.field520 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field551 >= 32768) {
            int var6 = arg1.field551 - 32768;
            if (class124.field1944 == var6) {
                var6 = 2047;
            }
            class82 var7 = class64.field966[var6];
            if (var7 != null) {
                int var8 = arg1.field519 - var7.field519;
                int var9 = arg1.field537 - var7.field537;
                if (var9 != 0 || var8 != 0) {
                    arg1.field520 = (int) (Math.atan2((double) var9, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field510 != 0 || arg1.field540 != 0) && (arg1.field541 == 0 || arg1.field543 > 0)) {
            int var10 = arg1.field537 - (arg1.field510 - class30.field374 - class30.field374) * 64;
            int var11 = arg1.field519 - ((arg1.field540 - class294.field4535 - class294.field4535) * 64);
            if (var10 != 0 || var11 != 0) {
                arg1.field520 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg1.field510 = 0;
            arg1.field540 = 0;
        }
        int var12 = arg1.field520 - arg1.field564 & 0x7FF;
        if (var12 == 0) {
            arg1.field531 = 0;
            arg1.field550 = 0;
        } else if (var2.field4871 == 0) {
            arg1.field531++;
            if (var12 <= 1024) {
                arg1.field564 += arg1.field565;
                boolean var13 = true;
                if (arg1.field565 > var12 || 2048 - arg1.field565 < var12) {
                    arg1.field564 = arg1.field520;
                    var13 = false;
                }
                if (arg1.field531 > 25 || var13) {
                    arg1.field474 = var2.field4879;
                    if (arg1.field541 <= 0) {
                        if (var2.field4887 != -1) {
                            arg1.field474 = var2.field4887;
                        }
                    } else if (arg1.field487[arg1.field541 - 1] == 2) {
                        if (var2.field4853 != -1) {
                            arg1.field474 = var2.field4853;
                        } else if (var2.field4872 != -1) {
                            arg1.field474 = var2.field4872;
                        }
                    } else if (arg1.field487[arg1.field541 - 1] == 0) {
                        if (var2.field4854 != -1) {
                            arg1.field474 = var2.field4854;
                        } else if (var2.field4855 != -1) {
                            arg1.field474 = var2.field4855;
                        }
                    } else if (var2.field4875 != -1) {
                        arg1.field474 = var2.field4875;
                    }
                }
            } else {
                arg1.field564 -= arg1.field565;
                boolean var14 = true;
                if (var12 < arg1.field565 || 2048 - arg1.field565 < var12) {
                    arg1.field564 = arg1.field520;
                    var14 = false;
                }
                if (arg1.field531 > 25 || var14) {
                    arg1.field474 = var2.field4879;
                    if (arg1.field541 <= 0) {
                        if (var2.field4877 != -1) {
                            arg1.field474 = var2.field4877;
                        }
                    } else if (arg1.field487[arg1.field541 - 1] == 2) {
                        if (var2.field4857 != -1) {
                            arg1.field474 = var2.field4857;
                        } else if (var2.field4872 != -1) {
                            arg1.field474 = var2.field4872;
                        }
                    } else if (arg1.field487[arg1.field541 - 1] == 0) {
                        if (var2.field4852 != -1) {
                            arg1.field474 = var2.field4852;
                        } else if (var2.field4855 != -1) {
                            arg1.field474 = var2.field4855;
                        }
                    } else if (var2.field4886 != -1) {
                        arg1.field474 = var2.field4886;
                    }
                }
            }
            arg1.field564 &= 0x7FF;
        } else {
            arg1.field474 = -1;
            int var15 = arg1.field520 << 5;
            if (arg1.field475 != var15) {
                arg1.field482 = 0;
                int var16 = var15 - arg1.field472 & 0xFFFF;
                arg1.field475 = var15;
                int var17 = arg1.field550 * arg1.field550 / (var2.field4871 * 2);
                if (arg1.field550 > 0 && var16 >= var17 && var16 - var17 < 32768) {
                    arg1.field490 = true;
                    arg1.field526 = var16 / 2;
                    int var18 = var2.field4885 * var2.field4885 / (var2.field4871 * 2);
                    if (var18 > 32767) {
                        var18 = 32767;
                    }
                    if (var18 < arg1.field526) {
                        arg1.field526 = var16 - var18;
                    }
                } else if (arg1.field550 < 0 && var17 <= 65536 - var16 && (65536 - var16 - var17) < 32768) {
                    arg1.field526 = (65536 - var16) / 2;
                    arg1.field490 = true;
                    int var19 = var2.field4885 * var2.field4885 / (var2.field4871 * 2);
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    if (var19 < arg1.field526) {
                        arg1.field526 = 65536 - var16 - var19;
                    }
                } else {
                    arg1.field490 = false;
                }
            }
            if (arg1.field550 == 0) {
                int var20 = arg1.field475 - arg1.field472 & 0xFFFF;
                if (var20 >= var2.field4871) {
                    arg1.field490 = true;
                    int var21 = var2.field4885 * var2.field4885 / (var2.field4871 * 2);
                    if (var21 > 32767) {
                        var21 = 32767;
                    }
                    if (var20 < 32768) {
                        arg1.field526 = var20 / 2;
                        arg1.field550 = var2.field4871;
                        if (var21 < arg1.field526) {
                            arg1.field526 = var20 - var21;
                        }
                    } else {
                        arg1.field526 = (65536 - var20) / 2;
                        if (var21 < arg1.field526) {
                            arg1.field526 = 65536 - var21 - var20;
                        }
                        arg1.field550 = -var2.field4871;
                    }
                    arg1.field482 = 0;
                } else {
                    arg1.field472 = arg1.field475;
                }
            } else if (arg1.field550 <= 0) {
                if (arg1.field526 <= arg1.field482) {
                    arg1.field490 = false;
                }
                if (!arg1.field490) {
                    arg1.field550 += var2.field4871;
                    if (arg1.field550 > 0) {
                        arg1.field550 = 0;
                    }
                } else if ((-var2.field4885) < arg1.field550) {
                    arg1.field550 -= var2.field4871;
                }
            } else {
                if (arg1.field482 >= arg1.field526) {
                    arg1.field490 = false;
                }
                if (!arg1.field490) {
                    arg1.field550 -= var2.field4871;
                    if (arg1.field550 < 0) {
                        arg1.field550 = 0;
                    }
                } else if (arg1.field550 < var2.field4885) {
                    arg1.field550 += var2.field4871;
                }
            }
            arg1.field472 += arg1.field550;
            arg1.field472 &= 0xFFFF;
            arg1.field564 = arg1.field472 >> 5;
            if (arg1.field550 <= 0) {
                arg1.field482 -= arg1.field550;
            } else {
                arg1.field482 += arg1.field550;
            }
            if (arg1.field550 < 0) {
                if (arg1.field541 > 0) {
                    if (arg1.field487[arg1.field541 - 1] == 2) {
                        if (var2.field4857 != -1) {
                            arg1.field474 = var2.field4857;
                        } else if (var2.field4872 != -1) {
                            arg1.field474 = var2.field4872;
                        }
                    } else if (arg1.field487[arg1.field541 - 1] == 0) {
                        if (var2.field4852 != -1) {
                            arg1.field474 = var2.field4852;
                        } else if (var2.field4855 != -1) {
                            arg1.field474 = var2.field4855;
                        }
                    }
                }
                if (arg1.field474 == -1) {
                    if (var2.field4886 != -1) {
                        arg1.field474 = var2.field4886;
                    } else if (var2.field4877 != -1) {
                        arg1.field474 = var2.field4877;
                    }
                }
            } else {
                if (arg1.field541 > 0) {
                    if (arg1.field487[arg1.field541 - 1] == 2) {
                        if (var2.field4853 != -1) {
                            arg1.field474 = var2.field4853;
                        } else if (var2.field4872 != -1) {
                            arg1.field474 = var2.field4872;
                        }
                    } else if (arg1.field487[arg1.field541 - 1] == 0) {
                        if (var2.field4854 != -1) {
                            arg1.field474 = var2.field4854;
                        } else if (var2.field4855 != -1) {
                            arg1.field474 = var2.field4855;
                        }
                    }
                }
                if (arg1.field474 == -1) {
                    if (var2.field4875 != -1) {
                        arg1.field474 = var2.field4875;
                    } else if (var2.field4887 != -1) {
                        arg1.field474 = var2.field4887;
                    }
                }
            }
            if (arg1.field474 == -1) {
                arg1.field474 = var2.field4879;
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIILjj;)V", line = 435)
    public static final void method749(int arg0, int arg1, int arg2, class80 arg3) {
        if (arg0 > -23) {
            return;
        }
        field1723++;
        if (arg3.field507 == arg1 && arg1 != -1) {
            class222 var4 = class118.method809((byte) 49, arg1);
            int var5 = var4.field3552;
            if (var5 == 1) {
                arg3.field495 = 0;
                arg3.field546 = 1;
                arg3.field557 = 0;
                arg3.field558 = arg2;
                arg3.field478 = 0;
                class229.method1571(arg3.field537, false, (byte) -110, arg3.field519, var4, arg3.field557);
            }
            if (var5 == 2) {
                arg3.field478 = 0;
            }
        } else if (arg1 == -1 || arg3.field507 == -1 || class118.method809((byte) 74, arg1).field3560 >= class118.method809((byte) 91, arg3.field507).field3560) {
            arg3.field507 = arg1;
            arg3.field504 = arg3.field541;
            arg3.field495 = 0;
            arg3.field558 = arg2;
            arg3.field478 = 0;
            arg3.field546 = 1;
            arg3.field557 = 0;
            if (arg3.field507 != -1) {
                class229.method1571(arg3.field537, false, (byte) -110, arg3.field519, class118.method809((byte) 49, arg3.field507), arg3.field557);
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)I", line = 492)
    public static final int method750(boolean arg0) {
        if (!arg0) {
            method751((class306) null, 114, (class306) null, 114, -69);
        }
        field1720++;
        if (class319.field5002) {
            return 0;
        } else if (class148.method1042((byte) 54)) {
            return class233.field3752 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lwf;ILwf;II)Lbk;", line = 511)
    public static final class180 method751(class306 arg0, int arg1, class306 arg2, int arg3, int arg4) {
        field1717++;
        if (arg1 <= 115) {
            return (class180) null;
        } else if (class156.method1093(true, arg4, arg3, arg2)) {
            return class197.method1332(-97, arg0.method2103(0, arg3, arg4));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIBIIII)V", line = 526)
    public static final void method752(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field1721++;
        if (arg6 < 128 || arg5 < 128 || arg6 > 13056 || arg5 > 13056) {
            class307.field4844 = -1;
            class315.field4971 = -1;
            return;
        }
        if (arg3 != -13) {
            method751((class306) null, -20, (class306) null, -33, 16);
        }
        int var8 = class39.method286(class77.field1154, (byte) 82, arg6, arg5) - arg7;
        int var9 = class12.field121[class199.field2989];
        int var10 = var8 - class169.field2579;
        int var11 = arg6 - class298.field4598;
        int var12 = class12.field127[class199.field2989];
        int var13 = class12.field121[class305.field4781];
        int var14 = arg5 - class225.field3592;
        int var15 = class12.field127[class305.field4781];
        int var16 = var11 * var15 + var13 * var14 >> 16;
        int var17 = var14 * var15 - var11 * var13 >> 16;
        int var19 = var10 * var12 - (var9 * var17) >> 16;
        int var20 = var9 * var10 + (var12 * var17) >> 16;
        if (var20 < 50) {
            class307.field4844 = -1;
            class315.field4971 = -1;
        } else if (class333.field5166) {
            int var22 = arg2 * 512 >> 8;
            class307.field4844 = arg0 + (var16 * var22 / var20);
            int var23 = arg1 * 512 >> 8;
            class315.field4971 = var19 * var23 / var20 + arg4;
        } else {
            class315.field4971 = (var19 << 9) / var20 + arg4;
            class307.field4844 = (var16 << 9) / var20 + arg0;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V", line = 595)
    public static void method753(byte arg0) {
        field1722 = null;
        field1718 = null;
        if (arg0 >= -32) {
            method748((byte) 61, (class38) null);
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(Z)Luh;", line = 606)
    public static final class75 method754(boolean arg0) {
        field1715++;
        class75 var1 = (class75) class234.field3763.method1826(-124);
        if (var1 != null) {
            var1.method1284(0);
            var1.method2143((byte) 125);
            return var1;
        } else if (arg0) {
            class75 var2;
            do {
                var2 = (class75) class51.field718.method1826(-126);
                if (var2 == null) {
                    return null;
                }
                if (var2.method527(120) > class195.method1322(127)) {
                    return null;
                }
                var2.method1284(0);
                var2.method2143((byte) 125);
            } while ((Long.MIN_VALUE & var2.field4938) == 0L);
            return var2;
        } else {
            return (class75) null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)V", line = 652)
    public static final void method755(int arg0, byte arg1) {
        field1724++;
        class115.field1790.method1287(arg0, 115);
        if (arg1 != 35) {
            method753((byte) -67);
        }
    }
}
