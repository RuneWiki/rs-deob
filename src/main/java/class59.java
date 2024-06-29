import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class59 {

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field1024 = 0;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field1026 = 0;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public static int field1030 = 0;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "[I")
    public static int[] field1027 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    public static void method364(int arg0) {
        field1027 = null;
        int var1 = 97 / ((arg0 + 11) / 62);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lbd;I)V")
    public static final void method365(class81 arg0, int arg1) {
        field1025++;
        if (arg0.field1443 == 0 || arg1 != -13994) {
            return;
        }
        class37 var2 = arg0.method533(-1);
        if (arg0.field1426 != -1 && arg0.field1426 < 32768) {
            class141 var3 = class42.field625[arg0.field1426];
            if (var3 != null) {
                int var4 = arg0.field1458 - var3.field1458;
                int var5 = arg0.field1397 - var3.field1397;
                if (var5 != 0 || var4 != 0) {
                    arg0.field1389 = (int) (Math.atan2((double) var5, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field1426 >= 32768) {
            int var6 = arg0.field1426 - 32768;
            if (class37.field545 == var6) {
                var6 = 2047;
            }
            class288 var7 = class105.field1874[var6];
            if (var7 != null) {
                int var8 = arg0.field1458 - var7.field1458;
                int var9 = arg0.field1397 - var7.field1397;
                if (var9 != 0 || var8 != 0) {
                    arg0.field1389 = (int) (Math.atan2((double) var9, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field1439 != 0 || arg0.field1438 != 0) && (arg0.field1422 == 0 || arg0.field1419 > 0)) {
            int var10 = arg0.field1397 - ((arg0.field1439 - class126.field2206 - class126.field2206) * 64);
            int var11 = arg0.field1458 - (arg0.field1438 - class255.field4162 - class255.field4162) * 64;
            if (var10 != 0 || var11 != 0) {
                arg0.field1389 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg0.field1438 = 0;
            arg0.field1439 = 0;
        }
        int var12 = arg0.field1389 - arg0.field1413 & 0x7FF;
        if (var12 == 0) {
            arg0.field1429 = 0;
            arg0.field1427 = 0;
        } else if (var2.field523 == 0) {
            arg0.field1429++;
            if (var12 > 1024) {
                arg0.field1413 -= arg0.field1443;
                boolean var13 = true;
                if (var12 < arg0.field1443 || var12 > 2048 - arg0.field1443) {
                    arg0.field1413 = arg0.field1389;
                    var13 = false;
                }
                if (arg0.field1429 > 25 || var13) {
                    arg0.field1421 = var2.field565;
                    if (arg0.field1422 > 0) {
                        if (arg0.field1418[arg0.field1422 - 1] == 2) {
                            if (var2.field553 != -1) {
                                arg0.field1421 = var2.field553;
                            } else if (var2.field540 != -1) {
                                arg0.field1421 = var2.field540;
                            }
                        } else if (arg0.field1418[arg0.field1422 - 1] == 0) {
                            if (var2.field537 != -1) {
                                arg0.field1421 = var2.field537;
                            } else if (var2.field551 != -1) {
                                arg0.field1421 = var2.field551;
                            }
                        } else if (var2.field529 != -1) {
                            arg0.field1421 = var2.field529;
                        }
                    } else if (var2.field533 != -1) {
                        arg0.field1421 = var2.field533;
                    }
                }
            } else {
                arg0.field1413 += arg0.field1443;
                boolean var14 = true;
                if (var12 < arg0.field1443 || var12 > 2048 - arg0.field1443) {
                    arg0.field1413 = arg0.field1389;
                    var14 = false;
                }
                if (arg0.field1429 > 25 || var14) {
                    arg0.field1421 = var2.field565;
                    if (arg0.field1422 > 0) {
                        if (arg0.field1418[arg0.field1422 - 1] == 2) {
                            if (var2.field538 != -1) {
                                arg0.field1421 = var2.field538;
                            } else if (var2.field540 != -1) {
                                arg0.field1421 = var2.field540;
                            }
                        } else if (arg0.field1418[arg0.field1422 - 1] == 0) {
                            if (var2.field566 != -1) {
                                arg0.field1421 = var2.field566;
                            } else if (var2.field551 != -1) {
                                arg0.field1421 = var2.field551;
                            }
                        } else if (var2.field560 != -1) {
                            arg0.field1421 = var2.field560;
                        }
                    } else if (var2.field564 != -1) {
                        arg0.field1421 = var2.field564;
                    }
                }
            }
            arg0.field1413 &= 0x7FF;
        } else {
            int var15 = arg0.field1389 << 5;
            arg0.field1421 = -1;
            if (arg0.field1459 != var15) {
                arg0.field1447 = 0;
                arg0.field1459 = var15;
                int var16 = var15 - arg0.field1441 & 0xFFFF;
                int var17 = arg0.field1427 * arg0.field1427 / (var2.field523 * 2);
                if (arg0.field1427 > 0 && var17 <= var16 && var16 - var17 < 32768) {
                    arg0.field1485 = var16 / 2;
                    arg0.field1402 = true;
                    int var18 = var2.field543 * var2.field543 / (var2.field523 * 2);
                    if (var18 > 32767) {
                        var18 = 32767;
                    }
                    if (arg0.field1485 > var18) {
                        arg0.field1485 = var16 - var18;
                    }
                } else if (arg0.field1427 < 0 && (65536 - var16) >= var17 && 65536 - (var16 + var17) < 32768) {
                    arg0.field1485 = (65536 - var16) / 2;
                    int var19 = var2.field543 * var2.field543 / (var2.field523 * 2);
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    arg0.field1402 = true;
                    if (var19 < arg0.field1485) {
                        arg0.field1485 = 65536 - var16 - var19;
                    }
                } else {
                    arg0.field1402 = false;
                }
            }
            if (arg0.field1427 == 0) {
                int var20 = arg0.field1459 - arg0.field1441 & 0xFFFF;
                if (var2.field523 <= var20) {
                    arg0.field1402 = true;
                    arg0.field1447 = 0;
                    int var21 = var2.field543 * var2.field543 / (var2.field523 * 2);
                    if (var21 > 32767) {
                        var21 = 32767;
                    }
                    if (var20 < 32768) {
                        arg0.field1485 = var20 / 2;
                        arg0.field1427 = var2.field523;
                        if (arg0.field1485 > var21) {
                            arg0.field1485 = var20 - var21;
                        }
                    } else {
                        arg0.field1485 = (65536 - var20) / 2;
                        if (arg0.field1485 > var21) {
                            arg0.field1485 = 65536 - var20 - var21;
                        }
                        arg0.field1427 = -var2.field523;
                    }
                } else {
                    arg0.field1441 = arg0.field1459;
                }
            } else if (arg0.field1427 > 0) {
                if (arg0.field1447 >= arg0.field1485) {
                    arg0.field1402 = false;
                }
                if (!arg0.field1402) {
                    arg0.field1427 -= var2.field523;
                    if (arg0.field1427 < 0) {
                        arg0.field1427 = 0;
                    }
                } else if (arg0.field1427 < var2.field543) {
                    arg0.field1427 += var2.field523;
                }
            } else {
                if (arg0.field1447 >= arg0.field1485) {
                    arg0.field1402 = false;
                }
                if (!arg0.field1402) {
                    arg0.field1427 += var2.field523;
                    if (arg0.field1427 > 0) {
                        arg0.field1427 = 0;
                    }
                } else if ((-var2.field543) < arg0.field1427) {
                    arg0.field1427 -= var2.field523;
                }
            }
            if (arg0.field1427 > 0) {
                arg0.field1447 += arg0.field1427;
            } else {
                arg0.field1447 -= arg0.field1427;
            }
            arg0.field1441 += arg0.field1427;
            arg0.field1441 &= 0xFFFF;
            arg0.field1413 = arg0.field1441 >> 5;
            if (arg0.field1427 >= 0) {
                if (arg0.field1422 > 0) {
                    if (arg0.field1418[arg0.field1422 - 1] == 2) {
                        if (var2.field538 != -1) {
                            arg0.field1421 = var2.field538;
                        } else if (var2.field540 != -1) {
                            arg0.field1421 = var2.field540;
                        }
                    } else if (arg0.field1418[arg0.field1422 - 1] == 0) {
                        if (var2.field566 != -1) {
                            arg0.field1421 = var2.field566;
                        } else if (var2.field551 != -1) {
                            arg0.field1421 = var2.field551;
                        }
                    }
                }
                if (arg0.field1421 == -1) {
                    if (var2.field560 != -1) {
                        arg0.field1421 = var2.field560;
                    } else if (var2.field564 != -1) {
                        arg0.field1421 = var2.field564;
                    }
                }
            } else {
                if (arg0.field1422 > 0) {
                    if (arg0.field1418[arg0.field1422 - 1] == 2) {
                        if (var2.field553 != -1) {
                            arg0.field1421 = var2.field553;
                        } else if (var2.field540 != -1) {
                            arg0.field1421 = var2.field540;
                        }
                    } else if (arg0.field1418[arg0.field1422 - 1] == 0) {
                        if (var2.field537 != -1) {
                            arg0.field1421 = var2.field537;
                        } else if (var2.field551 != -1) {
                            arg0.field1421 = var2.field551;
                        }
                    }
                }
                if (arg0.field1421 == -1) {
                    if (var2.field529 != -1) {
                        arg0.field1421 = var2.field529;
                    } else if (var2.field533 != -1) {
                        arg0.field1421 = var2.field533;
                    }
                }
            }
            if (arg0.field1421 == -1) {
                arg0.field1421 = var2.field565;
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II[I[IZ)V")
    public static final void method366(int arg0, int arg1, int[] arg2, int[] arg3, boolean arg4) {
        field1029++;
        if (arg1 > arg0) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg0;
            int var7 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var7;
            int var8 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var8;
            for (int var9 = arg0; var9 < arg1; var9++) {
                if ((var9 & 0x1) + var7 < arg2[var9]) {
                    int var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    int var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg2[arg1] = arg2[var6];
            arg2[var6] = var7;
            arg3[arg1] = arg3[var6];
            arg3[var6] = var8;
            method366(arg0, var6 - 1, arg2, arg3, false);
            method366(var6 + 1, arg1, arg2, arg3, false);
        }
        if (arg4) {
            field1030 = 104;
        }
    }
}
