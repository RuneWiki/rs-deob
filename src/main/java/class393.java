import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public abstract class class393 {

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field5742 = 0;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "Lgp;")
    public static class31 field5747;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIBZLja;IILja;)V", line = 10)
    public final void method2503(int arg0, int arg1, int arg2, byte arg3, boolean arg4, class152 arg5, int arg6, int arg7, class152 arg8) {
        field5752++;
        if (arg2 == -1 || !this.method746()) {
            return;
        }
        int var10 = 114 % ((arg3 + 33) / 59);
        class394 var11 = arg5.field2131[arg2];
        class88 var12 = var11.field5761;
        class394 var13 = null;
        if (arg8 != null) {
            var13 = arg8.field2131[arg1];
            if (var13.field5761 != var12) {
                var13 = null;
            }
        }
        this.method2508(arg4, (byte) 127, false, (int[]) null, var11, 65535, (boolean[]) null, arg7, var13, arg6, arg0, var12);
        this.method769();
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILja;IIIZI[IILja;)V", line = 53)
    public final void method2504(int arg0, int arg1, class152 arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int[] arg8, int arg9, class152 arg10) {
        field5755++;
        if (~arg9 == arg1 || !this.method746()) {
            return;
        }
        class394 var12 = arg2.field2131[arg9];
        class88 var13 = var12.field5761;
        class394 var14 = null;
        if (arg10 != null) {
            var14 = arg10.field2131[arg3];
            if (var14.field5761 != var13) {
                var14 = null;
            }
        }
        this.method2508(arg6, (byte) 127, false, arg8, var12, arg0, (boolean[]) null, arg4, var14, arg7, arg5, var13);
        this.method769();
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIILja;ILja;Lja;IIZI[ZIILja;)V", line = 86)
    public final void method2505(int arg0, int arg1, int arg2, class152 arg3, int arg4, class152 arg5, class152 arg6, int arg7, int arg8, boolean arg9, int arg10, boolean[] arg11, int arg12, int arg13, class152 arg14) {
        field5750++;
        if (arg7 == -1) {
            return;
        }
        if (arg11 == null || arg0 == -1) {
            this.method2503(arg12, arg2, arg7, (byte) -98, arg9, arg5, arg8, 0, arg6);
        } else if (this.method746()) {
            class394 var16 = arg5.field2131[arg7];
            if (arg10 != 5965) {
                this.method736(58, -29, 125);
            }
            class88 var17 = var16.field5761;
            class394 var18 = null;
            if (arg6 != null) {
                var18 = arg6.field2131[arg2];
                if (var18.field5761 != var17) {
                    var18 = null;
                }
            }
            class394 var19 = arg3.field2131[arg0];
            class394 var20 = null;
            if (arg14 != null) {
                var20 = arg14.field2131[arg13];
                if (var20.field5761 != var17) {
                    var20 = null;
                }
            }
            this.method2508(arg9, (byte) 127, false, (int[]) null, var16, 65535, arg11, 0, var18, arg8, arg12, var17);
            this.method734(0, new int[0], 0, 0, 0, 0, arg9);
            this.method2508(arg9, (byte) 127, true, (int[]) null, var19, 65535, arg11, 0, var20, arg4, arg1, var17);
            this.method769();
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lbm;Len;I)V", line = 144)
    public static final void method2506(class60 arg0, class174 arg1, int arg2) {
        field5746++;
        if (class106.field1202 == null) {
            return;
        }
        if (class173.field2404 < 10) {
            if (!class106.field1203.method326(100, class106.field1202.field1065)) {
                class173.field2404 = class54.field611.method356(0, class106.field1202.field1065) / 10;
                return;
            }
            class303.method1911(117);
            class173.field2404 = 10;
        }
        if (class173.field2404 == 10) {
            class106.field1228 = class106.field1202.field1045 >> 6 << 6;
            class106.field1222 = class106.field1202.field1046 >> 6 << 6;
            class106.field1227 = (class106.field1202.field1049 >> 6 << 6) + 64 - class106.field1228;
            class106.field1223 = (class106.field1202.field1044 >> 6 << 6) + 64 - class106.field1222;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class106.field1202.method507(class410.field5931, var3, class40.field427 + (class390.field5715.field1304 >> 7), class217.field2975 - -(class390.field5715.field1311 >> 7), false)) {
                var5 = var3[2] - class106.field1228;
                var4 = var3[1] - class106.field1222;
            }
            if (!class45.field554 && var4 >= 0 && var4 < class106.field1223 && var5 >= 0 && class106.field1227 > var5) {
                int var6 = var5 + ((int) (Math.random() * 10.0D) - 5);
                int var7 = var4 + (int) (Math.random() * 10.0D) - 5;
                class356.field5214 = var6;
                class221.field3025 = var7;
            } else if (class297.field4238 == -1 || class379.field5569 == -1) {
                class106.field1202.method512(var3, class106.field1202.field1055 & 0x3FFF, 0, class106.field1202.field1055 >> 14 & 0x3FFF);
                class356.field5214 = var3[2] - class106.field1228;
                class221.field3025 = var3[1] - class106.field1222;
            } else {
                class106.field1202.method512(var3, class379.field5569, arg2 ^ 0xFFFFC1D0, class297.field4238);
                class45.field554 = false;
                if (var3 != null) {
                    class221.field3025 = var3[1] - class106.field1222;
                    class356.field5214 = var3[2] - class106.field1228;
                }
                class379.field5569 = -1;
                class297.field4238 = -1;
            }
            if (class106.field1202.field1052 == 37) {
                class106.field1209 = 3.0F;
                class106.field1212 = 3.0F;
            } else if (class106.field1202.field1052 == 50) {
                class106.field1209 = 4.0F;
                class106.field1212 = 4.0F;
            } else if (class106.field1202.field1052 == 75) {
                class106.field1209 = 6.0F;
                class106.field1212 = 6.0F;
            } else if (class106.field1202.field1052 == 100) {
                class106.field1209 = 8.0F;
                class106.field1212 = 8.0F;
            } else if (class106.field1202.field1052 == 200) {
                class106.field1209 = 16.0F;
                class106.field1212 = 16.0F;
            } else {
                class106.field1209 = 8.0F;
                class106.field1212 = 8.0F;
            }
            class106.field1213 = (int) class106.field1209 >> 1;
            class106.field1206 = class221.method1443(class106.field1213, (byte) -1);
            class157.method1032(-6600);
            class106.method577();
            class188.field2550 = new class169();
            class95.field1067 = new class108();
            class106.field1205 += (int) (Math.random() * 5.0D) - 2;
            if (class106.field1205 < -8) {
                class106.field1205 = -8;
            }
            class106.field1207 += (int) (Math.random() * 5.0D) - 2;
            if (class106.field1205 > 8) {
                class106.field1205 = 8;
            }
            if (class106.field1207 < -16) {
                class106.field1207 = -16;
            }
            if (class106.field1207 > 16) {
                class106.field1207 = 16;
            }
            class106.method595(arg0, class106.field1205 >> 2 << 10, class106.field1207 >> 1);
            class57.method337(1024, (byte) 103, 256);
            class204.method1302(256, 256, (byte) 50);
            class133.method795(4096, (byte) 29);
            class54.method314(256, arg2 ^ 0xFFFFC1D0);
            class173.field2404 = 20;
        } else if (class173.field2404 == 20) {
            class59.method367(true, (byte) -128);
            class106.method596(arg1, class106.field1205, class106.field1207);
            class173.field2404 = 60;
            class59.method367(true, (byte) -127);
            class277.method1747((byte) -110);
        } else if (class173.field2404 == 60) {
            if (class106.field1203.method342((byte) 127, class106.field1202.field1065 + "_staticelements")) {
                if (!class106.field1203.method326(arg2 ^ 0xFFFFC1B4, class106.field1202.field1065 + "_staticelements")) {
                    return;
                }
                class106.field1210 = class353.method2247((byte) -72, class106.field1202.field1065 + "_staticelements", class106.field1203, class166.field2325);
            } else {
                class106.field1210 = new class220(0);
            }
            class106.method581();
            class173.field2404 = 70;
            class59.method367(true, (byte) -122);
            class277.method1747((byte) -93);
        } else if (class173.field2404 == 70) {
            class130.field1801 = new class31(arg1, 11, true, class348.field5096);
            class173.field2404 = 73;
            class59.method367(true, (byte) -122);
            class277.method1747((byte) -87);
        } else if (class173.field2404 == 73) {
            class81.field924 = new class31(arg1, 12, true, class348.field5096);
            class173.field2404 = 76;
            class59.method367(true, (byte) -126);
            class277.method1747((byte) -121);
        } else if (class173.field2404 == 76) {
            class157.field2232 = new class31(arg1, 14, true, class348.field5096);
            class173.field2404 = 79;
            class59.method367(true, (byte) -128);
            class277.method1747((byte) -77);
        } else if (class173.field2404 == 79) {
            class45.field550 = new class31(arg1, 17, true, class348.field5096);
            class173.field2404 = 82;
            class59.method367(true, (byte) -122);
            class277.method1747((byte) -105);
        } else if (class173.field2404 == 82) {
            class148.field2078 = new class31(arg1, 19, true, class348.field5096);
            class173.field2404 = 85;
            class59.method367(true, (byte) -125);
            class277.method1747((byte) -124);
        } else if (class173.field2404 == 85) {
            class417.field5985 = new class31(arg1, 22, true, class348.field5096);
            class173.field2404 = 88;
            class59.method367(true, (byte) -127);
            class277.method1747((byte) -95);
        } else if (class173.field2404 == 88) {
            class366.field5351 = new class31(arg1, 26, true, class348.field5096);
            class173.field2404 = 91;
            class59.method367(true, (byte) -128);
            class277.method1747((byte) -127);
        } else {
            field5747 = new class31(arg1, 30, true, class348.field5096);
            class173.field2404 = 100;
            class59.method367(true, (byte) -121);
            if (arg2 != -15920) {
                method2515((byte) -78);
            }
            class277.method1747((byte) -96);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V", line = 373)
    public static final void method2507(byte arg0) {
        class249.field3379.method813((byte) -57);
        field5749++;
        int var1 = class249.field3379.method817(-123, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class249.field3379.method817(-121, 2);
        if (var2 == 0) {
            class204.field2798[class189.field2578++] = 2047;
        } else if (arg0 == -83) {
            if (var2 == 1) {
                int var3 = class249.field3379.method817(-120, 3);
                class390.field5715.method2694(1, var3, (byte) -127);
                int var4 = class249.field3379.method817(-117, 1);
                if (var4 == 1) {
                    class204.field2798[class189.field2578++] = 2047;
                }
            } else if (var2 == 2) {
                if (class249.field3379.method817(-124, 1) == 1) {
                    int var6 = class249.field3379.method817(arg0 + 95, 3);
                    class390.field5715.method2694(2, var6, (byte) -127);
                    int var7 = class249.field3379.method817(62, 3);
                    class390.field5715.method2694(2, var7, (byte) -127);
                } else {
                    int var5 = class249.field3379.method817(-126, 3);
                    class390.field5715.method2694(0, var5, (byte) -127);
                }
                int var8 = class249.field3379.method817(arg0 + 156, 1);
                if (var8 == 1) {
                    class204.field2798[class189.field2578++] = 2047;
                }
            } else if (var2 == 3) {
                int var9 = class249.field3379.method817(arg0 - 33, 7);
                int var10 = class249.field3379.method817(18, 1);
                if (var10 == 1) {
                    class204.field2798[class189.field2578++] = 2047;
                }
                int var11 = class249.field3379.method817(arg0 ^ 0x2D, 7);
                class410.field5931 = class249.field3379.method817(-125, 2);
                int var12 = class249.field3379.method817(-115, 1);
                class390.field5715.method794((byte) -122, var9, var12 == 1, var11, class410.field5931);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZBZ[ILpb;I[ZILpb;IILhq;)V", line = 458)
    private final void method2508(boolean arg0, byte arg1, boolean arg2, int[] arg3, class394 arg4, int arg5, boolean[] arg6, int arg7, class394 arg8, int arg9, int arg10, class88 arg11) {
        field5740++;
        if (arg8 == null || arg9 == 0) {
            for (int var37 = 0; var37 < arg4.field5759; var37++) {
                short var38 = arg4.field5762[var37];
                if (arg6 == null || arg6[var38] == arg2 || arg11.field983[var38] == 0) {
                    short var39 = arg4.field5769[var37];
                    if (var39 != -1) {
                        this.method2511(0, 0, arg7, arg11.field990[var39], arg0, arg5 & arg11.field987[var39], (byte) 104, arg3, 0, 0);
                    }
                    this.method2511(arg11.field983[var38], arg4.field5766[var37], arg7, arg11.field990[var38], arg0, arg5 & arg11.field987[var38], (byte) 76, arg3, arg4.field5760[var37], arg4.field5764[var37]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        if (arg1 < 126) {
            return;
        }
        for (int var15 = 0; var15 < arg11.field993; var15++) {
            boolean var16 = false;
            if (var13 < arg4.field5759 && arg4.field5762[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg8.field5759 && arg8.field5762[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg6 == null || arg2 == arg6[var15] || arg11.field983[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg11.field983[var15];
                    if (var19 == 3) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    short var22;
                    byte var23;
                    short var24;
                    if (var16) {
                        var20 = arg4.field5766[var13];
                        var21 = arg4.field5760[var13];
                        var22 = arg4.field5764[var13];
                        var23 = arg4.field5757[var13];
                        var24 = arg4.field5769[var13];
                        var13++;
                    } else {
                        var21 = var18;
                        var20 = var18;
                        var22 = var18;
                        var23 = 0;
                        var24 = -1;
                    }
                    short var25;
                    short var26;
                    short var27;
                    short var28;
                    byte var29;
                    if (var17) {
                        var25 = arg8.field5760[var14];
                        var26 = arg8.field5769[var14];
                        var27 = arg8.field5766[var14];
                        var28 = arg8.field5764[var14];
                        var29 = arg8.field5757[var14];
                        var14++;
                    } else {
                        var29 = 0;
                        var28 = var18;
                        var25 = var18;
                        var27 = var18;
                        var26 = -1;
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var23 & 0x2) != 0 || (var29 & 0x1) != 0) {
                        var35 = var20;
                        var33 = var21;
                        var34 = var22;
                    } else if (var19 == 2) {
                        int var30 = var25 - var21 & 0x3FFF;
                        int var31 = var28 - var22 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        int var32 = var27 - var20 & 0x3FFF;
                        var33 = arg9 * var30 / arg10 + var21 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var34 = arg9 * var31 / arg10 + var22 & 0x3FFF;
                        var35 = var20 + (arg9 * var32 / arg10) & 0x3FFF;
                    } else if (var19 == 7) {
                        int var36 = var25 - var21 & 0x3F;
                        if (var36 >= 32) {
                            var36 -= 64;
                        }
                        var33 = arg9 * var36 / arg10 + var21 & 0x3F;
                        var35 = (var27 - var20) * arg9 / arg10 + var20;
                        var34 = var22 + ((var28 - var22) * arg9 / arg10);
                    } else {
                        var34 = var22 + ((var28 - var22) * arg9 / arg10);
                        var33 = (var25 - var21) * arg9 / arg10 + var21;
                        var35 = (var27 - var20) * arg9 / arg10 + var20;
                    }
                    if (var24 != -1) {
                        this.method2511(0, 0, arg7, arg11.field990[var24], arg0, arg11.field987[var24] & arg5, (byte) 91, arg3, 0, 0);
                    } else if (var26 != -1) {
                        this.method2511(0, 0, arg7, arg11.field990[var26], arg0, arg5 & arg11.field987[var26], (byte) 72, arg3, 0, 0);
                    }
                    this.method2511(var19, var35, arg7, arg11.field990[var15], arg0, arg5 & arg11.field987[var15], (byte) 123, arg3, var33, var34);
                } else {
                    if (var17) {
                        var14++;
                    }
                    if (var16) {
                        var13++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILnj;)V", line = 654)
    public static final void method2509(int arg0, class133 arg1) {
        field5744++;
        if (arg0 > -31 || class433.field6324 >= 400 || class390.field5715 == arg1) {
            return;
        }
        String var2;
        if (arg1.field1850 == 0) {
            boolean var3 = true;
            if (class390.field5715.field1820 != -1 && arg1.field1820 != -1) {
                int var4 = arg1.field1827 >= class390.field5715.field1827 ? arg1.field1827 : class390.field5715.field1827;
                int var5 = arg1.field1820 > class390.field5715.field1820 ? class390.field5715.field1820 : arg1.field1820;
                int var6 = (var4 * 10 / 100) + var5 + 5;
                int var7 = class390.field5715.field1827 - arg1.field1827;
                if (var7 < 0) {
                    var7 = -var7;
                }
                if (var6 < var7) {
                    var3 = false;
                }
            }
            String var8 = class136.field1912 == 1 ? class206.field2807 : class433.field6328;
            if (arg1.field1827 < arg1.field1834) {
                var2 = arg1.method787(-1, true) + (var3 ? class301.method1902(class390.field5715.field1827, 109, arg1.field1827) : "<col=ffffff>") + " (" + var8 + arg1.field1827 + "+" + (arg1.field1834 - arg1.field1827) + ")";
            } else {
                var2 = arg1.method787(-1, true) + (var3 ? class301.method1902(class390.field5715.field1827, 109, arg1.field1827) : "<col=ffffff>") + " (" + var8 + arg1.field1827 + ")";
            }
        } else {
            var2 = arg1.method787(-1, true) + " (" + class166.field2343 + arg1.field1850 + ")";
        }
        if (class423.field6070 == 1) {
            class402.field5865++;
            class70.method411(58, class179.field2467, class318.field4526 + " -> <col=ffffff>" + var2, class423.field6069, 0, 0, 0, (long) arg1.field6279);
        } else if (!class271.field3842) {
            for (int var9 = 7; var9 >= 0; var9--) {
                if (class189.field2574[var9] != null) {
                    short var10 = 0;
                    if (class136.field1912 == 0 && class189.field2574[var9].equalsIgnoreCase(class52.field596)) {
                        if (arg1.field1827 > class390.field5715.field1827) {
                            var10 = 2000;
                        }
                        if (class390.field5715.field1825 != 0 && arg1.field1825 != 0) {
                            if (class390.field5715.field1825 == arg1.field1825) {
                                var10 = 2000;
                            } else {
                                var10 = 0;
                            }
                        }
                    } else if (class213.field2918[var9]) {
                        var10 = 2000;
                    }
                    short var11 = (short) (class137.field1938[var9] + var10);
                    int var12 = class97.field1091[var9] == -1 ? class207.field2818 : class97.field1091[var9];
                    class70.method411(var11, class189.field2574[var9], "<col=ffffff>" + var2, var12, 0, 0, 0, (long) arg1.field6279);
                    class277.field3905++;
                }
            }
        } else if ((class289.field4103 & 0x8) != 0) {
            class70.method411(31, class110.field1275, class75.field825 + " -> <col=ffffff>" + var2, class338.field5007, 0, 0, 0, (long) arg1.field6279);
            class216.field2950++;
        }
        for (class159 var13 = (class159) class32.field301.method1124(-1); var13 != null; var13 = (class159) class32.field301.method1119(false)) {
            if (var13.field2257 == 59) {
                var13.field2252 = "<col=ffffff>" + var2;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V", line = 793)
    public static final void method2510(int arg0, int arg1) {
        class331 var2 = class360.field5269;
        synchronized (class360.field5269) {
            if (arg1 != 3) {
                field5742 = -100;
            }
            class360.field5269.method2054(-120, arg0);
        }
        field5745++;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III[IZIB[III)V", line = 811)
    private final void method2511(int arg0, int arg1, int arg2, int[] arg3, boolean arg4, int arg5, byte arg6, int[] arg7, int arg8, int arg9) {
        if (arg6 < 63) {
            this.method721((short) 39, (short) -75);
        }
        if (arg2 == 1) {
            if (arg0 == 0 || arg0 == 1) {
                int var13 = -arg8;
                arg8 = arg1;
                arg1 = var13;
            } else if (arg0 == 3) {
                int var12 = arg8;
                arg8 = arg1;
                arg1 = var12;
            } else if (arg0 == 2) {
                int var11 = arg8;
                arg8 = -arg1 & 0x3FFF;
                arg1 = var11 & 0x3FFF;
            }
        } else if (arg2 == 2) {
            if (arg0 == 0 || arg0 == 1) {
                arg1 = -arg1;
                arg8 = -arg8;
            } else if (arg0 == 2) {
                arg1 = -arg1 & 0x3FFF;
                arg8 = -arg8 & 0x3FFF;
            }
        } else if (arg2 == 3) {
            if (arg0 == 0 || arg0 == 1) {
                int var16 = arg8;
                arg8 = -arg1;
                arg1 = var16;
            } else if (arg0 == 3) {
                int var14 = arg8;
                arg8 = arg1;
                arg1 = var14;
            } else if (arg0 == 2) {
                int var15 = arg8;
                arg8 = arg1 & 0x3FFF;
                arg1 = -var15 & 0x3FFF;
            }
        }
        field5748++;
        if (arg5 == 65535) {
            this.method734(arg0, arg3, arg8, arg9, arg1, arg2, arg4);
        } else {
            this.method748(arg0, arg3, arg8, arg9, arg1, arg4, arg5, arg7);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBII)V", line = 912)
    public static final void method2512(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -23) {
            method2507((byte) -91);
        }
        class166.field2327 = new byte[arg2][arg0][arg3];
        field5751++;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lja;BI)V", line = 925)
    public final void method2513(class152 arg0, byte arg1, int arg2) {
        field5754++;
        if (arg2 == -1 || !this.method746()) {
            return;
        }
        class394 var4 = arg0.field2131[arg2];
        class88 var5 = var4.field5761;
        if (arg1 >= -10) {
            return;
        }
        for (int var6 = 0; var6 < var4.field5759; var6++) {
            short var7 = var4.field5762[var6];
            if (var5.field980[var7]) {
                if (var4.field5769[var6] != -1) {
                    this.method738(0, 0, 0, 0);
                }
                this.method738(var5.field983[var7], var4.field5760[var6], var4.field5764[var6], var4.field5766[var6]);
            }
        }
        this.method769();
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIILac;)V", line = 967)
    public final void method2514(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class319 arg6) {
        field5743++;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        int var11 = -arg5 / 2;
        int var12 = -arg4 / 2;
        int var13 = arg6.method1991(arg1 + var11, arg0 + var12);
        int var14 = arg5 / 2;
        int var15 = -arg4 / 2;
        int var16 = arg6.method1991(arg1 + var14, arg0 + var15);
        int var17 = -arg5 / 2;
        int var18 = arg4 / 2;
        int var19 = arg6.method1991(arg1 + var17, arg0 + var18);
        int var20 = arg5 / 2;
        int var21 = arg4 / 2;
        int var22 = arg6.method1991(arg1 + var20, arg0 + var21);
        int var23 = var16 > var13 ? var13 : var16;
        int var24 = var22 > var19 ? var19 : var22;
        int var25 = var22 > var16 ? var16 : var22;
        int var26 = var19 <= var13 ? var19 : var13;
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var23 - var24), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
            if (var27 != 0) {
                this.method737(var27);
            }
        }
        int var28 = var13 + var22;
        if (arg5 != 0) {
            int var29 = (int) (Math.atan2((double) (var26 - var25), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                this.method767(var29);
            }
        }
        if (var28 > (var16 + var19)) {
            var28 = var16 + var19;
        }
        if (arg3 >= -50) {
            field5747 = null;
        }
        int var30 = (var28 >> 1) - arg2;
        if (var30 != 0) {
            this.method758(0, var30, 0);
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V", line = 1062)
    public static void method2515(byte arg0) {
        field5747 = null;
        if (arg0 >= -23) {
            field5742 = -88;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B[B)[B", line = 1073)
    public static final byte[] method2516(byte arg0, byte[] arg1) {
        field5741++;
        if (arg0 > -117) {
            field5747 = null;
        }
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class408.method2571(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
    public abstract void method737(int arg0);

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
    public abstract void method774(int arg0);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "()I")
    public abstract int method731();

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "()I")
    public abstract int method715();

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V")
    public abstract void method744(int arg0);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIII)V")
    public abstract void method738(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lvr;Lue;II)V")
    public abstract void method718(class71 arg0, class127 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "()I")
    public abstract int method764();

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(SS)V")
    public abstract void method721(short arg0, short arg1);

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "()Z")
    public abstract boolean method746();

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[IIIIZI[I)V")
    public abstract void method748(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V")
    public abstract void method736(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(SS)V")
    public abstract void method751(short arg0, short arg1);

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "()[Lor;")
    public abstract class382[] method725();

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "()I")
    public abstract int method735();

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "()[Lnr;")
    public abstract class35[] method768();

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "()I")
    public abstract int method749();

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "()I")
    public abstract int method727();

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "()I")
    public abstract int method773();

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "()Z")
    public abstract boolean method757();

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "()I")
    public abstract int method720();

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lvr;Lue;I)V")
    public abstract void method775(class71 arg0, class127 arg1, int arg2);

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "()V")
    public abstract void method770();

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method734(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)V")
    public abstract void method723(int arg0);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lmj;IIIZ)V")
    public abstract void method726(class393 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Llg;)Llg;")
    public abstract class238 method728(class238 arg0);

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "()I")
    public abstract int method759();

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BIZ)Lmj;")
    public abstract class393 method717(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "()V")
    public abstract void method769();

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)V")
    public abstract void method767(int arg0);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILvr;Z)Z")
    public abstract boolean method724(int arg0, int arg1, class71 arg2, boolean arg3);

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "()I")
    public abstract int method763();

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "()V")
    public abstract void method752();

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "(I)V")
    public abstract void method772(int arg0);

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "(I)V")
    public abstract void method743(int arg0);

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(III)V")
    public abstract void method758(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILac;Lac;III)V")
    public abstract void method761(int arg0, int arg1, class319 arg2, class319 arg3, int arg4, int arg5, int arg6);
}
