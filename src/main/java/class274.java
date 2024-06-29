import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class274 {

    @OriginalMember(owner = "client!re", name = "a", descriptor = "[I")
    public static int[] field4234 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field4236 = 0;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field4235 = 0;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "Lga;")
    public static class180 field4239;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lh;B)V", line = 5)
    public static final void method1926(class303 arg0, byte arg1) {
        field4240++;
        if (arg1 > -6) {
            field4236 = 68;
        }
        if (arg0.field4690 == 0) {
            return;
        }
        class107 var2 = arg0.method2100(2000117776);
        if (arg0.field4726 != -1 && arg0.field4726 < 32768) {
            class212 var3 = class59.field870[arg0.field4726];
            if (var3 != null) {
                int var4 = arg0.field4698 - var3.field4698;
                int var5 = arg0.field4731 - var3.field4731;
                if (var4 != 0 || var5 != 0) {
                    arg0.field4674 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field4726 >= 32768) {
            int var6 = arg0.field4726 - 32768;
            if (class92.field1231 == var6) {
                var6 = 2047;
            }
            class337 var7 = class284.field4403[var6];
            if (var7 != null) {
                int var8 = arg0.field4698 - var7.field4698;
                int var9 = arg0.field4731 - var7.field4731;
                if (var8 != 0 || var9 != 0) {
                    arg0.field4674 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field4730 != 0 || arg0.field4681 != 0) && (arg0.field4710 == 0 || arg0.field4728 > 0)) {
            int var10 = arg0.field4731 - ((arg0.field4681 - class198.field3168 - class198.field3168) * 64);
            int var11 = arg0.field4698 - ((arg0.field4730 - class326.field5108 - class326.field5108) * 64);
            if (var11 != 0 || var10 != 0) {
                arg0.field4674 = (int) (Math.atan2((double) var11, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field4681 = 0;
            arg0.field4730 = 0;
        }
        int var12 = arg0.field4674 - arg0.field4715 & 0x7FF;
        if (var12 == 0) {
            arg0.field4716 = 0;
            arg0.field4696 = 0;
        } else if (var2.field1432 == 0) {
            arg0.field4696++;
            if (var12 > 1024) {
                boolean var13 = true;
                arg0.field4715 -= arg0.field4690;
                if (arg0.field4690 > var12 || (2048 - arg0.field4690) < var12) {
                    var13 = false;
                    arg0.field4715 = arg0.field4674;
                }
                if (arg0.field4696 > 25 || var13) {
                    arg0.field4724 = var2.field1414;
                    if (arg0.field4710 > 0) {
                        if (arg0.field4657[arg0.field4710 - 1] == 2) {
                            if (var2.field1433 != -1) {
                                arg0.field4724 = var2.field1433;
                            } else if (var2.field1420 != -1) {
                                arg0.field4724 = var2.field1420;
                            }
                        } else if (arg0.field4657[arg0.field4710 - 1] == 0) {
                            if (var2.field1450 != -1) {
                                arg0.field4724 = var2.field1450;
                            } else if (var2.field1415 != -1) {
                                arg0.field4724 = var2.field1415;
                            }
                        } else if (var2.field1449 != -1) {
                            arg0.field4724 = var2.field1449;
                        }
                    } else if (var2.field1445 != -1) {
                        arg0.field4724 = var2.field1445;
                    }
                }
            } else {
                boolean var14 = true;
                arg0.field4715 += arg0.field4690;
                if (arg0.field4690 > var12 || var12 > (2048 - arg0.field4690)) {
                    var14 = false;
                    arg0.field4715 = arg0.field4674;
                }
                if (arg0.field4696 > 25 || var14) {
                    arg0.field4724 = var2.field1414;
                    if (arg0.field4710 > 0) {
                        if (arg0.field4657[arg0.field4710 - 1] == 2) {
                            if (var2.field1429 != -1) {
                                arg0.field4724 = var2.field1429;
                            } else if (var2.field1420 != -1) {
                                arg0.field4724 = var2.field1420;
                            }
                        } else if (arg0.field4657[arg0.field4710 - 1] == 0) {
                            if (var2.field1416 != -1) {
                                arg0.field4724 = var2.field1416;
                            } else if (var2.field1415 != -1) {
                                arg0.field4724 = var2.field1415;
                            }
                        } else if (var2.field1422 != -1) {
                            arg0.field4724 = var2.field1422;
                        }
                    } else if (var2.field1425 != -1) {
                        arg0.field4724 = var2.field1425;
                    }
                }
            }
            arg0.field4715 &= 0x7FF;
        } else {
            arg0.field4724 = -1;
            int var15 = arg0.field4674 << 5;
            if (arg0.field4741 != var15) {
                arg0.field4741 = var15;
                arg0.field4697 = 0;
                int var16 = var15 - arg0.field4694 & 0xFFFF;
                int var17 = arg0.field4716 * arg0.field4716 / (var2.field1432 * 2);
                if (arg0.field4716 > 0 && var16 >= var17 && var16 - var17 < 32768) {
                    arg0.field4669 = true;
                    int var18 = var2.field1417 * var2.field1417 / (var2.field1432 * 2);
                    arg0.field4676 = var16 / 2;
                    if (var18 > 32767) {
                        var18 = 32767;
                    }
                    if (var18 < arg0.field4676) {
                        arg0.field4676 = var16 - var18;
                    }
                } else if (arg0.field4716 < 0 && 65536 - var16 >= var17 && (65536 - var16 - var17) < 32768) {
                    arg0.field4669 = true;
                    arg0.field4676 = (65536 - var16) / 2;
                    int var19 = var2.field1417 * var2.field1417 / (var2.field1432 * 2);
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    if (var19 < arg0.field4676) {
                        arg0.field4676 = 65536 - var16 - var19;
                    }
                } else {
                    arg0.field4669 = false;
                }
            }
            if (arg0.field4716 == 0) {
                int var20 = arg0.field4741 - arg0.field4694 & 0xFFFF;
                if (var20 >= var2.field1432) {
                    arg0.field4669 = true;
                    int var21 = var2.field1417 * var2.field1417 / (var2.field1432 * 2);
                    if (var21 > 32767) {
                        var21 = 32767;
                    }
                    if (var20 < 32768) {
                        arg0.field4716 = var2.field1432;
                        arg0.field4676 = var20 / 2;
                        if (arg0.field4676 > var21) {
                            arg0.field4676 = var20 - var21;
                        }
                    } else {
                        arg0.field4676 = (65536 - var20) / 2;
                        arg0.field4716 = -var2.field1432;
                        if (var21 < arg0.field4676) {
                            arg0.field4676 = 65536 - var21 - var20;
                        }
                    }
                    arg0.field4697 = 0;
                } else {
                    arg0.field4694 = arg0.field4741;
                }
            } else if (arg0.field4716 <= 0) {
                if (arg0.field4676 <= arg0.field4697) {
                    arg0.field4669 = false;
                }
                if (!arg0.field4669) {
                    arg0.field4716 += var2.field1432;
                    if (arg0.field4716 > 0) {
                        arg0.field4716 = 0;
                    }
                } else if ((-var2.field1417) < arg0.field4716) {
                    arg0.field4716 -= var2.field1432;
                }
            } else {
                if (arg0.field4676 <= arg0.field4697) {
                    arg0.field4669 = false;
                }
                if (!arg0.field4669) {
                    arg0.field4716 -= var2.field1432;
                    if (arg0.field4716 < 0) {
                        arg0.field4716 = 0;
                    }
                } else if (var2.field1417 > arg0.field4716) {
                    arg0.field4716 += var2.field1432;
                }
            }
            if (arg0.field4716 > 0) {
                arg0.field4697 += arg0.field4716;
            } else {
                arg0.field4697 -= arg0.field4716;
            }
            arg0.field4694 += arg0.field4716;
            arg0.field4694 &= 0xFFFF;
            arg0.field4715 = arg0.field4694 >> 5;
            if (arg0.field4716 >= 0) {
                if (arg0.field4710 > 0) {
                    if (arg0.field4657[arg0.field4710 - 1] == 2) {
                        if (var2.field1429 != -1) {
                            arg0.field4724 = var2.field1429;
                        } else if (var2.field1420 != -1) {
                            arg0.field4724 = var2.field1420;
                        }
                    } else if (arg0.field4657[arg0.field4710 - 1] == 0) {
                        if (var2.field1416 != -1) {
                            arg0.field4724 = var2.field1416;
                        } else if (var2.field1415 != -1) {
                            arg0.field4724 = var2.field1415;
                        }
                    }
                }
                if (arg0.field4724 == -1) {
                    if (var2.field1422 != -1) {
                        arg0.field4724 = var2.field1422;
                    } else if (var2.field1425 != -1) {
                        arg0.field4724 = var2.field1425;
                    }
                }
            } else {
                if (arg0.field4710 > 0) {
                    if (arg0.field4657[arg0.field4710 - 1] == 2) {
                        if (var2.field1433 != -1) {
                            arg0.field4724 = var2.field1433;
                        } else if (var2.field1420 != -1) {
                            arg0.field4724 = var2.field1420;
                        }
                    } else if (arg0.field4657[arg0.field4710 - 1] == 0) {
                        if (var2.field1450 != -1) {
                            arg0.field4724 = var2.field1450;
                        } else if (var2.field1415 != -1) {
                            arg0.field4724 = var2.field1415;
                        }
                    }
                }
                if (arg0.field4724 == -1) {
                    if (var2.field1449 != -1) {
                        arg0.field4724 = var2.field1449;
                    } else if (var2.field1445 != -1) {
                        arg0.field4724 = var2.field1445;
                    }
                }
            }
            if (arg0.field4724 == -1) {
                arg0.field4724 = var2.field1414;
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 439)
    public static void method1927(int arg0) {
        if (arg0 <= 10) {
            method1928(10, (class253) null, 100, -35);
        }
        field4234 = null;
        field4239 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILug;II)Lci;", line = 451)
    public static final class201 method1928(int arg0, class253 arg1, int arg2, int arg3) {
        field4238++;
        if (class287.method2029(arg1, arg0, 2, arg2)) {
            if (arg3 <= 111) {
                method1929(-101, -77);
            }
            return class41.method336((byte) -114);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)Z", line = 480)
    public static final boolean method1929(int arg0, int arg1) {
        field4237++;
        return ~arg0 <= arg1 && class342.field5320.length > arg0 ? class342.field5320[arg0] : false;
    }
}
