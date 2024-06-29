import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class761 {

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "Z")
    public boolean field10859 = false;

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10871 = new String[] { method5521(method5520("xI\b3=;")), method5521(method5520("}]J\u001e")), method5521(method5520("xI\b4=;")), method5521(method5520("h\u0006\b\\\u0003")), method5521(method5520("xI\b9=;")), method5521(method5520("xI\b8=;")), method5521(method5520("xI\b0=;")), method5521(method5520("xI\b;=;")), method5521(method5520("xI\b5=;")), method5521(method5520("xI\b:=;")), method5521(method5520("xI\b1=;")), method5521(method5520("xI\b7=;")), method5521(method5520("xI\b6=;")) };

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "Lsb;")
    public static class261 field10861 = new class261(112, 4);

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "J")
    public static long field10863 = 0L;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field10867 = 50;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "[I")
    public static int[] field10864 = new int[field10867];

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "[I")
    public static int[] field10870 = new int[field10867];

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "[I")
    public static int[] field10862 = new int[field10867];

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "[I")
    public static int[] field10868 = new int[field10867];

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "[I")
    public static int[] field10869 = new int[field10867];

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "[I")
    public static int[] field10866 = new int[field10867];

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field10865 = new String[field10867];

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field10850;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    public static int field10851;

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "I")
    public static int field10852;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field10853;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field10854;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field10855;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field10856;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field10857;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field10858;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
    public static int field10860;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIIZI[II[III)V", line = 6)
    private final void method5509(byte arg0, int arg1, int arg2, boolean arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, int arg9) {
        try {
            field10856++;
            if (arg2 == 1) {
                if (arg4 == 0 || arg4 == 1) {
                    int var11 = -arg9;
                    arg9 = arg8;
                    arg8 = var11;
                } else if (arg4 == 3) {
                    int var13 = arg9;
                    arg9 = arg8;
                    arg8 = var13;
                } else if (arg4 == 2) {
                    int var12 = arg9;
                    arg9 = -arg8 & 0x3FFF;
                    arg8 = var12 & 0x3FFF;
                }
            } else if (arg2 == 2) {
                if (arg4 == 0 || arg4 == 1) {
                    arg9 = -arg9;
                    arg8 = -arg8;
                } else if (arg4 == 2) {
                    arg9 = -arg9 & 0x3FFF;
                    arg8 = -arg8 & 0x3FFF;
                }
            } else if (arg2 == 3) {
                if (arg4 == 0 || arg4 == 1) {
                    int var16 = arg9;
                    arg9 = -arg8;
                    arg8 = var16;
                } else if (arg4 == 3) {
                    int var15 = arg9;
                    arg9 = arg8;
                    arg8 = var15;
                } else if (arg4 == 2) {
                    int var14 = arg9;
                    arg9 = arg8 & 0x3FFF;
                    arg8 = -var14 & 0x3FFF;
                }
            }
            if (arg0 != 61) {
                this.method424();
            }
            if (arg6 == 65535) {
                this.method383(arg4, arg5, arg9, arg1, arg8, arg2, arg3);
            } else {
                this.method388(arg4, arg5, arg9, arg1, arg8, arg3, arg6, arg7);
            }
        } catch (RuntimeException var18) {
            throw class665.method4799(var18, field10871[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field10871[1] : field10871[3]) + ',' + arg6 + ',' + (arg7 == null ? field10871[1] : field10871[3]) + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILha;IIIZII)V", line = 111)
    private static final void method5510(int arg0, class18 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        try {
            class349.field5060 = arg1;
            field10853++;
            class570.field8270 = class349.field5060.method221();
            class209.field3043 = class349.field5060.method221();
            class742.field10549 = class349.field5060.method221();
            class389.field5670 = arg6;
            class101.field1360 = 1;
            class755.field10800 = arg4;
            if (!arg5) {
                method5510(-122, null, -103, -100, 68, true, -90, 18);
            }
            class237.field3428 = arg7;
            class567.field8258 = arg0;
            class785.field11337 = null;
            class109.field1427 = 0;
            class322.field4397 = 0;
            class260.method2162(arg2, 12, arg3);
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field10871[7] + arg0 + ',' + (arg1 == null ? field10871[1] : field10871[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)V", line = 146)
    public static void method5511(byte arg0) {
        try {
            field10868 = null;
            if (arg0 <= 34) {
                method5514((byte) -123);
            }
            field10865 = null;
            field10864 = null;
            field10870 = null;
            field10862 = null;
            field10861 = null;
            field10869 = null;
            field10866 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10871[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILdt;IIIZII[IILdt;)V", line = 167)
    public final void method5512(int arg0, class669 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int[] arg8, int arg9, class669 arg10) {
        try {
            field10852++;
            if (arg7 != -1) {
                this.method401();
                if (this.method393()) {
                    class284 var12 = arg10.field9432[arg7];
                    class616 var13 = var12.field3996;
                    if (arg9 == 16383) {
                        class284 var14 = null;
                        if (arg1 != null) {
                            var14 = arg1.field9432[arg4];
                            if (var14.field3996 != var13) {
                                var14 = null;
                            }
                        }
                        this.method5518(arg2, false, var14, null, arg5, var12, (byte) 25, arg8, arg6, arg3, var13, arg0);
                        this.method424();
                        this.method429();
                    }
                } else {
                    this.method429();
                }
            }
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field10871[12] + arg0 + ',' + (arg1 == null ? field10871[1] : field10871[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 == null ? field10871[1] : field10871[3]) + ',' + arg9 + ',' + (arg10 == null ? field10871[1] : field10871[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIILs;BI)V", line = 215)
    public final void method5513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class751 arg6, byte arg7, int arg8) {
        try {
            field10855++;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            int var13 = -arg1 / 2;
            int var14 = -arg8 / 2;
            int var15 = arg6.method5440((byte) 15, arg0 + var13, arg3 + var14);
            int var16 = arg1 / 2;
            int var17 = -arg8 / 2;
            int var18 = arg6.method5440((byte) 15, arg0 + var16, arg3 + var17);
            int var19 = -arg1 / 2;
            int var20 = arg8 / 2;
            int var21 = arg6.method5440((byte) 15, arg0 + var19, arg3 + var20);
            if (arg7 != 23) {
                this.method389(null, 68, true);
            }
            int var22 = arg1 / 2;
            int var23 = arg8 / 2;
            int var24 = arg6.method5440((byte) 15, arg0 + var22, arg3 + var23);
            int var25 = var18 <= var15 ? var18 : var15;
            int var26 = var24 <= var21 ? var24 : var21;
            int var27 = var18 < var24 ? var18 : var24;
            if (arg8 != 0) {
                int var28 = (int) (Math.atan2((double) (var25 - var26), (double) arg8) * 2607.5945876176133D) & 0x3FFF;
                if (var28 != 0) {
                    if (arg5 != 0) {
                        if (var28 > 8192) {
                            int var29 = 16384 - arg5;
                            if (var28 < var29) {
                                var28 = var29;
                            }
                        } else if (arg5 < var28) {
                            var28 = arg5;
                        }
                    }
                    this.method436(var28);
                }
            }
            int var30 = var21 > var15 ? var15 : var21;
            int var31 = var15 + var24;
            if (arg1 != 0) {
                int var32 = (int) (Math.atan2((double) (var30 - var27), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
                if (var32 != 0) {
                    if (arg4 != 0) {
                        if (var32 > 8192) {
                            int var33 = 16384 - arg4;
                            if (var32 < var33) {
                                var32 = var33;
                            }
                        } else if (var32 > arg4) {
                            var32 = arg4;
                        }
                    }
                    this.method437(var32);
                }
            }
            if (var18 + var21 < var31) {
                var31 = var18 + var21;
            }
            int var34 = (var31 >> 1) - arg2;
            if (var34 != 0) {
                this.method430(0, var34, 0);
            }
        } catch (RuntimeException var36) {
            throw class665.method4799(var36, field10871[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field10871[1] : field10871[3]) + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V", line = 331)
    public static final void method5514(byte arg0) {
        try {
            field10850++;
            if (arg0 == -63) {
                class530.method4013((byte) 43);
                int var1 = class451.field6612.field9085.method5153(arg0 + 66);
                if (var1 == 2) {
                    class144.method1246(100, class236.field3418, 100, 0, class391.field5700, class711.field9998);
                } else if (var1 == 3) {
                    method5510(class346.field5038, class236.field3418, class391.field5700, class711.field9998, 2, true, class644.field9166, 2);
                }
                if (class451.field6612.field9085.method5157((byte) 108)) {
                    class437.method3408(class560.field8153, false);
                }
                if (class236.field3418 != null) {
                    class502.method3843(true);
                }
                class149.field1902 = class451.field6612.field9085.method5153(3) != 0;
                class212.field3119 = class451.field6612.field9085.method5157((byte) -91);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10871[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ldt;IB)V", line = 380)
    public final void method5515(class669 arg0, int arg1, byte arg2) {
        try {
            field10854++;
            if (arg1 != -1) {
                this.method401();
                if (arg2 != 77) {
                    field10866 = null;
                }
                if (this.method393()) {
                    class284 var4 = arg0.field9432[arg1];
                    class616 var5 = var4.field3996;
                    for (int var6 = 0; var6 < var4.field3992; var6++) {
                        short var7 = var4.field4003[var6];
                        if (var5.field8794[var7]) {
                            if (var4.field3995[var6] != -1) {
                                this.method394(0, 0, 0, 0);
                            }
                            this.method394(var5.field8793[var7], var4.field3997[var6], var4.field3991[var6], var4.field3994[var6]);
                        }
                    }
                    this.method424();
                    this.method429();
                } else {
                    this.method429();
                }
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field10871[11] + (arg0 == null ? field10871[1] : field10871[3]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILvo;II)V", line = 430)
    public static final void method5516(int arg0, class782 arg1, int arg2, int arg3) {
        try {
            field10860++;
            class685 var4 = arg1.method5630((byte) -33, class236.field3418);
            if (arg3 >= -3) {
                method5516(111, null, 7, 123);
            }
            if (var4 != null) {
                class236.field3418.method208(arg2, arg0, arg1.field11295 + arg2, arg0 - -arg1.field11244);
                if (class345.field5028 >= 3) {
                    class236.field3418.method153(-16777216, var4, arg2, arg0);
                } else {
                    class169.field2165.method3070((float) arg1.field11295 / 2.0F + (float) arg2, (float) arg1.field11244 / 2.0F + (float) arg0, 4096, ((int) (-class349.field5057) & 0x3FFF) << 2, var4, arg2, arg0);
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10871[2] + arg0 + ',' + (arg1 == null ? field10871[1] : field10871[3]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ldt;[ZIIIIILdt;Ldt;IIIZLdt;I)V", line = 466)
    public final void method5517(class669 arg0, boolean[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class669 arg7, class669 arg8, int arg9, int arg10, int arg11, boolean arg12, class669 arg13, int arg14) {
        try {
            field10851++;
            if (arg6 != -1) {
                if (arg1 == null || arg10 == -1) {
                    this.method5519(arg9, arg12, 0, arg13, 0, arg7, arg3, arg11, arg6);
                } else {
                    this.method401();
                    if (this.method393()) {
                        class284 var16 = arg7.field9432[arg6];
                        class616 var17 = var16.field3996;
                        class284 var18 = null;
                        if (arg13 != null) {
                            var18 = arg13.field9432[arg11];
                            if (var18.field3996 != var17) {
                                var18 = null;
                            }
                        }
                        int var19 = 104 % ((arg2 + 49) / 43);
                        this.method5518(arg3, false, var18, arg1, arg12, var16, (byte) 60, null, arg9, 0, var17, 65535);
                        class284 var20 = arg0.field9432[arg10];
                        class284 var21 = null;
                        if (arg8 != null) {
                            var21 = arg8.field9432[arg14];
                            if (var21.field3996 != var17) {
                                var21 = null;
                            }
                        }
                        this.method383(0, new int[0], 0, 0, 0, 0, arg12);
                        this.method5518(arg5, true, var21, arg1, arg12, var20, (byte) 40, null, arg4, 0, var20.field3996, 65535);
                        this.method424();
                        this.method429();
                    } else {
                        this.method429();
                    }
                }
            }
        } catch (RuntimeException var23) {
            throw class665.method4799(var23, field10871[5] + (arg0 == null ? field10871[1] : field10871[3]) + ',' + (arg1 == null ? field10871[1] : field10871[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field10871[1] : field10871[3]) + ',' + (arg8 == null ? field10871[1] : field10871[3]) + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + (arg13 == null ? field10871[1] : field10871[3]) + ',' + arg14 + ')');
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZLpv;[ZZLpv;B[IIILbb;I)V", line = 532)
    private final void method5518(int arg0, boolean arg1, class284 arg2, boolean[] arg3, boolean arg4, class284 arg5, byte arg6, int[] arg7, int arg8, int arg9, class616 arg10, int arg11) {
        try {
            field10858++;
            if (arg2 == null || arg8 == 0) {
                for (int var13 = 0; var13 < arg5.field3992; var13++) {
                    short var14 = arg5.field4003[var13];
                    if (arg3 == null || arg1 == arg3[var14] || arg10.field8793[var14] == 0) {
                        short var15 = arg5.field3995[var13];
                        if (var15 != -1) {
                            this.method5509((byte) 61, 0, arg9, arg4, 0, arg10.field8791[var15], arg10.field8790[var15] & arg11, arg7, 0, 0);
                        }
                        this.method5509((byte) 61, arg5.field3991[var13], arg9, arg4, arg10.field8793[var14], arg10.field8791[var14], arg11 & arg10.field8790[var14], arg7, arg5.field3994[var13], arg5.field3997[var13]);
                    }
                }
            } else {
                int var16 = 0;
                int var17 = 0;
                if (arg6 <= 23) {
                    field10866 = null;
                }
                for (int var18 = 0; var18 < arg10.field8788; var18++) {
                    boolean var19 = false;
                    if (arg5.field3992 > var16 && arg5.field4003[var16] == var18) {
                        var19 = true;
                    }
                    boolean var20 = false;
                    if (arg2.field3992 > var17 && arg2.field4003[var17] == var18) {
                        var20 = true;
                    }
                    if (var19 || var20) {
                        if (arg3 == null || arg3[var18] == arg1 || arg10.field8793[var18] == 0) {
                            short var21 = 0;
                            int var22 = arg10.field8793[var18];
                            if (var22 == 3 || var22 == 10) {
                                var21 = 128;
                            }
                            short var23;
                            short var24;
                            byte var25;
                            short var26;
                            short var27;
                            if (var19) {
                                var23 = arg5.field3994[var16];
                                var24 = arg5.field3995[var16];
                                var25 = arg5.field3998[var16];
                                var26 = arg5.field3991[var16];
                                var27 = arg5.field3997[var16];
                                var16++;
                            } else {
                                var23 = var21;
                                var25 = 0;
                                var27 = var21;
                                var26 = var21;
                                var24 = -1;
                            }
                            byte var28;
                            short var29;
                            short var30;
                            short var31;
                            short var32;
                            if (var20) {
                                var31 = arg2.field3994[var17];
                                var30 = arg2.field3995[var17];
                                var28 = arg2.field3998[var17];
                                var32 = arg2.field3997[var17];
                                var29 = arg2.field3991[var17];
                                var17++;
                            } else {
                                var28 = 0;
                                var29 = var21;
                                var30 = -1;
                                var31 = var21;
                                var32 = var21;
                            }
                            if (var24 != -1) {
                                this.method5509((byte) 61, 0, arg9, arg4, 0, arg10.field8791[var24], arg10.field8790[var24] & arg11, arg7, 0, 0);
                            } else if (var30 != -1) {
                                this.method5509((byte) 61, 0, arg9, arg4, 0, arg10.field8791[var30], arg10.field8790[var30] & arg11, arg7, 0, 0);
                            }
                            int var33;
                            int var34;
                            int var35;
                            if ((var25 & 0x2) != 0 || (var28 & 0x1) != 0) {
                                var33 = var26;
                                var34 = var27;
                                var35 = var23;
                            } else if (var22 == 2) {
                                int var38 = var32 - var27 & 0x3FFF;
                                int var39 = var29 - var26 & 0x3FFF;
                                int var40 = var31 - var23 & 0x3FFF;
                                if (var39 >= 8192) {
                                    var39 -= 16384;
                                }
                                if (var38 >= 8192) {
                                    var38 -= 16384;
                                }
                                var33 = var26 + (arg8 * var39 / arg0) & 0x3FFF;
                                var34 = arg8 * var38 / arg0 + var27 & 0x3FFF;
                                if (var40 >= 8192) {
                                    var40 -= 16384;
                                }
                                var35 = var23 + (arg8 * var40 / arg0) & 0x3FFF;
                            } else if (var22 == 9) {
                                int var36 = var32 - var27 & 0x3FFF;
                                if (var36 >= 8192) {
                                    var36 -= 16384;
                                }
                                var34 = var27 + (arg8 * var36 / arg0) & 0x3FFF;
                                var35 = 0;
                                var33 = 0;
                            } else if (var22 == 7) {
                                int var37 = var32 - var27 & 0x3F;
                                if (var37 >= 32) {
                                    var37 -= 64;
                                }
                                var34 = arg8 * var37 / arg0 + var27 & 0x3F;
                                var33 = var26 + ((var29 - var26) * arg8 / arg0);
                                var35 = (var31 - var23) * arg8 / arg0 + var23;
                            } else {
                                var33 = (var29 - var26) * arg8 / arg0 + var26;
                                var35 = (var31 - var23) * arg8 / arg0 + var23;
                                var34 = (var32 - var27) * arg8 / arg0 + var27;
                            }
                            this.method5509((byte) 61, var33, arg9, arg4, var22, arg10.field8791[var18], arg10.field8790[var18] & arg11, arg7, var35, var34);
                        } else {
                            if (var20) {
                                var17++;
                            }
                            if (var19) {
                                var16++;
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var42) {
            throw class665.method4799(var42, field10871[9] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field10871[1] : field10871[3]) + ',' + (arg3 == null ? field10871[1] : field10871[3]) + ',' + arg4 + ',' + (arg5 == null ? field10871[1] : field10871[3]) + ',' + arg6 + ',' + (arg7 == null ? field10871[1] : field10871[3]) + ',' + arg8 + ',' + arg9 + ',' + (arg10 == null ? field10871[1] : field10871[3]) + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZILdt;ILdt;III)V", line = 746)
    public final void method5519(int arg0, boolean arg1, int arg2, class669 arg3, int arg4, class669 arg5, int arg6, int arg7, int arg8) {
        try {
            field10857++;
            if (~arg8 != arg2) {
                this.method401();
                if (this.method393()) {
                    class284 var10 = arg5.field9432[arg8];
                    class616 var11 = var10.field3996;
                    class284 var12 = null;
                    if (arg3 != null) {
                        var12 = arg3.field9432[arg7];
                        if (var12.field3996 != var11) {
                            var12 = null;
                        }
                    }
                    this.method5518(arg6, false, var12, null, arg1, var10, (byte) 101, null, arg0, arg4, var11, 65535);
                    this.method424();
                    this.method429();
                } else {
                    this.method429();
                }
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field10871[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field10871[1] : field10871[3]) + ',' + arg4 + ',' + (arg5 == null ? field10871[1] : field10871[3]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
    public abstract int method377();

    @OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
    public abstract int method423();

    @OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
    public abstract void method437(int arg0);

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
    public abstract void method411(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lka;")
    public abstract class761 method418(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
    public abstract boolean method393();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILqa;ZII)Z")
    public abstract boolean method440(int arg0, int arg1, class104 arg2, boolean arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lqa;Lwha;I)V")
    public abstract void method415(class104 arg0, class535 arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
    public abstract void method394(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILs;Ls;III)V")
    public abstract void method412(int arg0, int arg1, class751 arg2, class751 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
    public abstract int method432();

    @OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
    public abstract int method384();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method383(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()Z")
    public abstract boolean method431();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lka;IIIZ)V")
    public abstract void method391(class761 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lqa;Lwha;II)V")
    public abstract void method427(class104 arg0, class535 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "()[Lkw;")
    public abstract class510[] method426();

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()[Liia;")
    public abstract class264[] method413();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lqa;)V")
    public abstract void method402(class104 arg0);

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
    public abstract int method433();

    @OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
    public abstract void method439(int arg0);

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
    public abstract void method390(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public abstract void method419(int arg0);

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
    public abstract void method379();

    @OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
    public abstract void method436(int arg0);

    @OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
    public abstract int method399();

    @OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
    public abstract int method414();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
    public abstract void method403();

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
    public abstract void method388(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
    public abstract int method417();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lqa;IZ)V")
    public abstract void method389(class104 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
    public abstract boolean method396();

    @OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lr;)Lr;")
    public abstract class412 method406(class412 arg0);

    @OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
    public abstract int method395();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILqa;ZI)Z")
    public abstract boolean method382(int arg0, int arg1, class104 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
    public abstract void method430(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
    public abstract boolean method422();

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "()V")
    public abstract void method429();

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
    public abstract int method385();

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
    public abstract void method401();

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
    public abstract void method409(int arg0);

    @OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
    public abstract int method410();

    @OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
    public abstract void method424();

    @OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
    public abstract void method386(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
    public abstract void method392(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
    public abstract void method376(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "()[B")
    public abstract byte[] method407();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B[B)V")
    public abstract void method404(byte arg0, byte[] arg1);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
    public abstract void method398(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5520(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5521(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 19;
                    break;
                case 1:
                    var10005 = 40;
                    break;
                case 2:
                    var10005 = 38;
                    break;
                case 3:
                    var10005 = 114;
                    break;
                default:
                    var10005 = 126;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
