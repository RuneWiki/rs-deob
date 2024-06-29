import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class237 extends class222 {

    @OriginalMember(owner = "client!h", name = "bb", descriptor = "I")
    private int field4088 = 4;

    @OriginalMember(owner = "client!h", name = "ib", descriptor = "I")
    private int field4095 = 4;

    @OriginalMember(owner = "client!h", name = "X", descriptor = "Ljf;")
    public static class70 field4084 = new class70(5000);

    @OriginalMember(owner = "client!h", name = "fb", descriptor = "[I")
    public static int[] field4092 = new int[2];

    @OriginalMember(owner = "client!h", name = "gb", descriptor = "I")
    public static int field4093 = 0;

    @OriginalMember(owner = "client!h", name = "hb", descriptor = "I")
    public static int field4094 = 0;

    @OriginalMember(owner = "client!h", name = "W", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!h", name = "Y", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!h", name = "Z", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!h", name = "ab", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!h", name = "cb", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!h", name = "db", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!h", name = "eb", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!h", name = "jb", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(III)Ljk;")
    public static final class225 method1618(int arg0, int arg1, int arg2) {
        class71 var3 = class31.field553[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1141;
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(II)I")
    public static final int method1619(int arg0, int arg1) {
        ++field4091;
        if (arg0 != -1) {
            method1623(74, -88);
        }
        return ~arg1 == -16711936 ? -1 : class137.method1026((byte) 118, arg1);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)V")
    public static final void method1620(int arg0, byte arg1) {
        class211.field3613 = arg0;
        class70.field1121 = -1;
        if (arg1 != 71) {
            method1620(73, (byte) 36);
        }
        class70.field1121 = -1;
        class225.method1553(115);
        ++field4096;
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V")
    public static void method1621(int arg0) {
        if (arg0 != 21807) {
            field4084 = null;
        }
        field4084 = null;
        field4092 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I[SI[Lsb;I)V")
    public static final void method1622(int arg0, short[] arg1, int arg2, class98[] arg3, int arg4) {
        if (arg4 > arg2) {
            int var5 = (arg2 + arg4) / 2;
            class98 var6 = arg3[var5];
            int var7 = arg2;
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var6;
            short var8 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var8;
            for (int var9 = arg2; var9 < arg4; ++var9) {
                if (var6 == null || arg3[var9] != null && arg3[var9].method746((byte) -70, var6) < (1 & var9)) {
                    class98 var10 = arg3[var9];
                    arg3[var9] = arg3[var7];
                    arg3[var7] = var10;
                    short var11 = arg1[var9];
                    arg1[var9] = arg1[var7];
                    arg1[var7++] = var11;
                }
            }
            arg3[arg4] = arg3[var7];
            arg3[var7] = var6;
            arg1[arg4] = arg1[var7];
            arg1[var7] = var8;
            method1622(-91, arg1, arg2, arg3, var7 - 1);
            method1622(-101, arg1, var7 + 1, arg3, arg4);
        }
        ++field4090;
        int var12 = -108 / ((3 - arg0) / 49);
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(II)Lof;")
    public static final class222 method1623(int arg0, int arg1) {
        ++field4089;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    if (arg1 != 7) {
                                        if (~arg1 != -9) {
                                            if (arg1 != 9) {
                                                if (arg1 != 10) {
                                                    if (~arg1 != -12) {
                                                        if (arg1 != 12) {
                                                            if (arg1 != 13) {
                                                                if (arg1 != 14) {
                                                                    if (~arg1 != -16) {
                                                                        if (arg1 != 16) {
                                                                            if (~arg1 != -18) {
                                                                                if (arg1 != 18) {
                                                                                    if (~arg1 != -20) {
                                                                                        if (arg1 != 20) {
                                                                                            if (~arg1 != -22) {
                                                                                                if (arg1 != 22) {
                                                                                                    if (arg1 != 23) {
                                                                                                        if (arg1 != 24) {
                                                                                                            if (arg1 != 25) {
                                                                                                                if (~arg1 != -27) {
                                                                                                                    if (arg1 != 27) {
                                                                                                                        if (~arg1 != -29) {
                                                                                                                            if (~arg1 != -30) {
                                                                                                                                if (arg1 != 30) {
                                                                                                                                    if (~arg1 != -32) {
                                                                                                                                        if (arg1 != 32) {
                                                                                                                                            if (arg1 != 33) {
                                                                                                                                                if (arg1 != 34) {
                                                                                                                                                    if (arg1 != 35) {
                                                                                                                                                        if (~arg1 != -37) {
                                                                                                                                                            if (~arg1 != -38) {
                                                                                                                                                                if (arg1 != 38) {
                                                                                                                                                                    if (~arg1 == -40) {
                                                                                                                                                                        return new class217();
                                                                                                                                                                    } else {
                                                                                                                                                                        return arg0 != 0 ? null : null;
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    return new class256();
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                return new class105();
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            return new class254();
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        return new class243();
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    return new class67();
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                return new class81();
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            return new class215();
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        return new class161();
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    return new class32();
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                return new class68();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            return new class147();
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        return new class111();
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    return new class263();
                                                                                                                }
                                                                                                            } else {
                                                                                                                return new class118();
                                                                                                            }
                                                                                                        } else {
                                                                                                            return new class41();
                                                                                                        }
                                                                                                    } else {
                                                                                                        return new class186();
                                                                                                    }
                                                                                                } else {
                                                                                                    return new class258();
                                                                                                }
                                                                                            } else {
                                                                                                return new class2();
                                                                                            }
                                                                                        } else {
                                                                                            return new class237();
                                                                                        }
                                                                                    } else {
                                                                                        return new class170();
                                                                                    }
                                                                                } else {
                                                                                    return new class47();
                                                                                }
                                                                            } else {
                                                                                return new class130();
                                                                            }
                                                                        } else {
                                                                            return new class157();
                                                                        }
                                                                    } else {
                                                                        return new class244();
                                                                    }
                                                                } else {
                                                                    return new class223();
                                                                }
                                                            } else {
                                                                return new class145();
                                                            }
                                                        } else {
                                                            return new class121();
                                                        }
                                                    } else {
                                                        return new class196();
                                                    }
                                                } else {
                                                    return new class96();
                                                }
                                            } else {
                                                return new class154();
                                            }
                                        } else {
                                            return new class187();
                                        }
                                    } else {
                                        return new class162();
                                    }
                                } else {
                                    return new class142();
                                }
                            } else {
                                return new class1();
                            }
                        } else {
                            return new class114();
                        }
                    } else {
                        return new class156();
                    }
                } else {
                    return new class92();
                }
            } else {
                return new class230();
            }
        } else {
            return new class135();
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(II)[[I")
    public final int[][] method4(int arg0, int arg1) {
        if (arg1 != 1) {
            field4084 = null;
        }
        ++field4085;
        int[][] var3 = super.field3834.method627(4103, arg0);
        if (super.field3834.field1486) {
            int var4 = class13.field253 / this.field4095;
            int var5 = class20.field373 / this.field4088;
            int[][] var6;
            if (~var5 >= -1) {
                var6 = this.method1531(0, 0, 112);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method1531(class20.field373 * var7 / var5, 0, 126);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var3[0];
            int[] var11 = var6[2];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; class13.field253 > var14; ++var14) {
                int var15;
                if (~var4 >= -1) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class13.field253 * var16 / var4;
                }
                var10[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var11[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method7((byte) 56, 110);
        }
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field4088 = arg0.method1446(5350);
            }
        } else {
            this.field4095 = arg0.method1446(5350);
        }
        ++field4087;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)I")
    public static final int method1624(boolean arg0) {
        ++field4083;
        if ((double) class148.field2726 == 3.0D) {
            return 37;
        } else if ((double) class148.field2726 == 4.0D) {
            return 50;
        } else if ((double) class148.field2726 == 6.0D) {
            return 75;
        } else {
            if (!arg0) {
                field4094 = 26;
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method1625(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class59 var20 = new class59(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; --var21) {
                if (class31.field553[var21][arg1][arg2] == null) {
                    class31.field553[var21][arg1][arg2] = new class71(var21, arg1, arg2);
                }
            }
            class31.field553[arg0][arg1][arg2].field1131 = var20;
        } else if (arg3 != 1) {
            class42 var24 = new class42(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; --var25) {
                if (class31.field553[var25][arg1][arg2] == null) {
                    class31.field553[var25][arg1][arg2] = new class71(var25, arg1, arg2);
                }
            }
            class31.field553[arg0][arg1][arg2].field1155 = var24;
        } else {
            class59 var22 = new class59(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; --var23) {
                if (class31.field553[var23][arg1][arg2] == null) {
                    class31.field553[var23][arg1][arg2] = new class71(var23, arg1, arg2);
                }
            }
            class31.field553[arg0][arg1][arg2].field1131 = var22;
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
    public class237() {
        super(1, false);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        if (arg0 < 35) {
            this.method3((class216) null, true, -20);
        }
        int[] var3 = super.field3844.method22(0, arg1);
        if (super.field3844.field61) {
            int var4 = class13.field253 / this.field4095;
            int var5 = class20.field373 / this.field4088;
            int[] var7;
            if (~var5 < -1) {
                int var6 = arg1 % var5;
                var7 = this.method1537((byte) 77, 0, class20.field373 * var6 / var5);
            } else {
                var7 = this.method1537((byte) 100, 0, 0);
            }
            for (int var8 = 0; ~class13.field253 < ~var8; ++var8) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class13.field253 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        ++field4086;
        return var3;
    }
}
