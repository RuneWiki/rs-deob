import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class191 extends class4 {

    @OriginalMember(owner = "client!fe", name = "F", descriptor = "I")
    private int field2465 = 1;

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
    private int field2474 = 2;

    @OriginalMember(owner = "client!fe", name = "R", descriptor = "[B")
    private byte[] field2477 = new byte[512];

    @OriginalMember(owner = "client!fe", name = "L", descriptor = "I")
    private int field2471 = 0;

    @OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
    private int field2479 = 5;

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "[S")
    private short[] field2467 = new short[512];

    @OriginalMember(owner = "client!fe", name = "J", descriptor = "I")
    private int field2469 = 2048;

    @OriginalMember(owner = "client!fe", name = "K", descriptor = "I")
    private int field2470 = 5;

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "I")
    public static int field2468 = 0;

    @OriginalMember(owner = "client!fe", name = "U", descriptor = "Lgn;")
    public static class635 field2480 = new class635();

    @OriginalMember(owner = "client!fe", name = "Y", descriptor = "I")
    public static int field2484 = 0;

    @OriginalMember(owner = "client!fe", name = "Z", descriptor = "[I")
    public static int[] field2485 = new int[128];

    @OriginalMember(owner = "client!fe", name = "G", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!fe", name = "M", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!fe", name = "P", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!fe", name = "Q", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!fe", name = "S", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!fe", name = "V", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!fe", name = "W", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!fe", name = "X", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!fe", name = "N", descriptor = "Ljava/lang/String;")
    public static String field2473;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "(I)V")
    public static void method1220(int arg0) {
        if (arg0 != 0) {
            field2480 = null;
        }
        field2480 = null;
        field2473 = null;
        field2485 = null;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(III)I")
    public static final int method1221(int arg0, int arg1, int arg2) {
        ++field2476;
        int var3 = arg2 * 57 + arg1;
        int var4 = var3 << 13 ^ var3;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & arg0;
        return (134175401 & var5) >> 19;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
    public class191() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "(I)V")
    public final void method18(int arg0) {
        if (arg0 == -9) {
            ++field2475;
            this.field2477 = class85.method478(this.field2471, (byte) 100);
            this.method1223(-10653);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZZLdg;)V")
    public static final void method1222(boolean arg0, boolean arg1, class20 arg2) {
        ++field2483;
        if (class50.field673 < 400) {
            if (arg0) {
                method1221(40, -32, -71);
            }
            if (class147.field1899 == arg2) {
                if (class280.field3669 && ~(16 & class59.field809) != -1) {
                    ++class165.field2091;
                    class431.method2520(0L, 0, class126.field1571 + " -> <col=ffffff>" + class215.field2766.method2157(class245.field3103, 4074), 0, 60, 2, class88.field1171, -1, true, false, class497.field6936);
                }
            } else {
                String var3;
                if (arg2.field258 != 0) {
                    var3 = arg2.method110(-1, true) + " (" + class18.field199.method2157(class245.field3103, 4074) + arg2.field258 + ")";
                } else {
                    boolean var4 = true;
                    if (~class147.field1899.field259 != 0 && ~arg2.field259 != 0) {
                        int var5 = ~arg2.field254 <= ~class147.field1899.field254 ? arg2.field254 : class147.field1899.field254;
                        int var6 = ~class147.field1899.field259 > ~arg2.field259 ? class147.field1899.field259 : arg2.field259;
                        int var7 = var5 * 10 / 100 + 5 + var6;
                        int var8 = -arg2.field254 + class147.field1899.field254;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        if (var8 > var7) {
                            var4 = false;
                        }
                    }
                    String var9 = class532.field7433 == class26.field453 ? class601.field8693.method2157(class245.field3103, 4074) : class428.field5841.method2157(class245.field3103, 4074);
                    if (arg2.field261 > arg2.field254) {
                        var3 = arg2.method110(-1, true) + (!var4 ? "<col=ffffff>" : class552.method3098(125, class147.field1899.field254, arg2.field254)) + " (" + var9 + arg2.field254 + "+" + (-arg2.field254 + arg2.field261) + ")";
                    } else {
                        var3 = arg2.method110(-1, true) + (!var4 ? "<col=ffffff>" : class552.method3098(95, class147.field1899.field254, arg2.field254)) + " (" + var9 + arg2.field254 + ")";
                    }
                }
                if (class280.field3669 && !arg1 && ~(8 & class59.field809) != -1) {
                    ++class643.field9333;
                    class431.method2520((long) arg2.field366, 0, class126.field1571 + " -> <col=ffffff>" + var3, 0, 5, 2, class88.field1171, -1, true, false, class497.field6936);
                }
                if (!arg1) {
                    for (int var10 = 7; var10 >= 0; --var10) {
                        if (class646.field9352[var10] != null) {
                            short var11 = 0;
                            if (class612.field8806 == class26.field453 && class646.field9352[var10].equalsIgnoreCase(class123.field1536.method2157(class245.field3103, 4074))) {
                                if (~class147.field1899.field254 > ~arg2.field254) {
                                    var11 = 2000;
                                }
                                if (class147.field1899.field252 != 0 && ~arg2.field252 != -1) {
                                    if (class147.field1899.field252 == arg2.field252) {
                                        var11 = 2000;
                                    } else {
                                        var11 = 0;
                                    }
                                }
                            } else if (class261.field3254[var10]) {
                                var11 = 2000;
                            }
                            short var12 = (short) (class548.field7625[var10] + var11);
                            int var13 = class48.field660[var10] == -1 ? class261.field3264 : class48.field660[var10];
                            ++class409.field5615;
                            class431.method2520((long) arg2.field366, 0, "<col=ffffff>" + var3, 0, var12, 2, class646.field9352[var10], -1, true, false, var13);
                        }
                    }
                } else {
                    class431.method2520(0L, 0, "", 0, -1, 2, "<col=cccccc>" + var3, 0, false, true, -1);
                }
                if (!arg1) {
                    for (class245 var14 = (class245) class57.field760.method3188((byte) -100); var14 != null; var14 = (class245) class57.field760.method3182((byte) -24)) {
                        if (~var14.field3094 == -51) {
                            var14.field3093 = "<col=ffffff>" + var3;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        ++field2466;
        if (arg0 <= -89) {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (arg2 != 2) {
                        if (~arg2 != -4) {
                            if (~arg2 != -5) {
                                if (arg2 != 5) {
                                    if (~arg2 == -7) {
                                        this.field2479 = arg1.method3045(-128);
                                    }
                                } else {
                                    this.field2470 = arg1.method3045(-128);
                                }
                            } else {
                                this.field2465 = arg1.method3045(-127);
                            }
                        } else {
                            this.field2474 = arg1.method3045(-126);
                        }
                    } else {
                        this.field2469 = arg1.method3090(-98);
                    }
                } else {
                    this.field2471 = arg1.method3045(-128);
                }
            } else {
                this.field2470 = this.field2479 = arg1.method3045(-128);
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "(I)V")
    private final void method1223(int arg0) {
        ++field2481;
        if (arg0 == -10653) {
            Random var2 = new Random((long) this.field2471);
            this.field2467 = new short[512];
            if (~this.field2469 < -1) {
                for (int var3 = 0; var3 < 512; ++var3) {
                    this.field2467[var3] = (short) class585.method3373(var2, true, this.field2469);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method1224(int arg0, long arg1) {
        ++field2478;
        if (arg1 > 0L && arg1 < 6582952005840035281L) {
            if (~(arg1 % 37L) == -1L) {
                return null;
            } else {
                int var3 = 0;
                long var4 = arg1;
                while (~var4 != -1L) {
                    var4 /= 37L;
                    ++var3;
                }
                if (arg0 != 2783) {
                    return null;
                } else {
                    StringBuffer var6 = new StringBuffer(var3);
                    while (arg1 != 0L) {
                        long var7 = arg1;
                        arg1 /= 37L;
                        char var9 = class4.field27[(int) (-(arg1 * 37L) + var7)];
                        if (~var9 == -96) {
                            int var10 = -1 + var6.length();
                            var9 = 160;
                            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                        }
                        var6.append(var9);
                    }
                    var6.reverse();
                    var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                    return var6.toString();
                }
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        if (arg0 != 10) {
            method1220(87);
        }
        ++field2482;
        int[] var3 = super.field31.method2252(arg1, 11);
        if (super.field31.field5127) {
            int var4 = class130.field1606[arg1] * this.field2479 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; class132.field1627 > var7; ++var7) {
                class389.field5398 = Integer.MAX_VALUE;
                class335.field4689 = Integer.MAX_VALUE;
                class510.field7113 = Integer.MAX_VALUE;
                class1.field4 = Integer.MAX_VALUE;
                int var8 = class66.field881[var7] * this.field2470 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; var6 >= var11; ++var11) {
                    int var13 = 255 & this.field2477[(var11 >= this.field2479 ? -this.field2479 + var11 : var11) & 255];
                    for (int var14 = var9 + -1; var10 >= var14; ++var14) {
                        int var15 = 2 * (this.field2477[255 & (var14 < this.field2470 ? var14 : -this.field2470 + var14) + var13] & 255);
                        int var10000 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 + -this.field2467[var15] + var8;
                        int var17 = var4 - this.field2467[var27] + -(var11 << 12);
                        int var18 = this.field2465;
                        int var19;
                        if (~var18 != -2) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (var18 == 2) {
                                            var19 = (var16 < 0 ? -var16 : var16) - -(~var17 > -1 ? -var17 : var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)));
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var16 >= 0 ? var16 : -var16;
                                int var26 = var17 >= 0 ? var17 : -var17;
                                var19 = ~var26 > ~var25 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 - -(var17 * var17) >> 12;
                        }
                        if (~class1.field4 < ~var19) {
                            class389.field5398 = class335.field4689;
                            class335.field4689 = class510.field7113;
                            class510.field7113 = class1.field4;
                            class1.field4 = var19;
                        } else if (~class510.field7113 < ~var19) {
                            class389.field5398 = class335.field4689;
                            class335.field4689 = class510.field7113;
                            class510.field7113 = var19;
                        } else if (~var19 <= ~class335.field4689) {
                            if (~var19 > ~class389.field5398) {
                                class389.field5398 = var19;
                            }
                        } else {
                            class389.field5398 = class335.field4689;
                            class335.field4689 = var19;
                        }
                    }
                }
                int var12 = this.field2474;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (~var12 != -4) {
                            if (~var12 != -5) {
                                if (var12 == 2) {
                                    var3[var7] = -class1.field4 + class510.field7113;
                                }
                            } else {
                                var3[var7] = class389.field5398;
                            }
                        } else {
                            var3[var7] = class335.field4689;
                        }
                    } else {
                        var3[var7] = class510.field7113;
                    }
                } else {
                    var3[var7] = class1.field4;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILraa;ILqa;Lbl;I)Z")
    public static final boolean method1225(int arg0, class625 arg1, int arg2, class167 arg3, class297 arg4, int arg5) {
        ++field2472;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg4.field3858 != null) {
            var9 = class614.field8860 - (-class614.field8858 + arg4.field3887 + arg1.field9039) * (-class614.field8857 + class614.field8860) / (class614.field8841 - class614.field8858);
            var8 = class614.field8860 - (-class614.field8858 + arg1.field9039 + arg4.field3888) * (-class614.field8857 + class614.field8860) / (-class614.field8858 + class614.field8841);
            var6 = (-class614.field8849 + arg4.field3856 - -arg1.field9038) * (-class614.field8854 + class614.field8846) / (class614.field8861 - class614.field8849) + class614.field8854;
            var7 = class614.field8854 - -((arg4.field3873 - (-arg1.field9038 - -class614.field8849)) * (-class614.field8854 + class614.field8846) / (-class614.field8849 + class614.field8861));
        }
        class116 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (~arg4.field3862 != 0) {
            if (arg1.field9043 && ~arg4.field3890 != 0) {
                var10 = arg4.method1828(arg3, true, (byte) -128);
            } else {
                var10 = arg4.method1828(arg3, false, (byte) -128);
            }
            if (var10 != null) {
                var11 = arg1.field9042 - (var10.method627() + 1 >> 1);
                var12 = arg1.field9042 - -(1 + var10.method627() >> 1);
                if (~var11 > ~var6) {
                    var6 = var11;
                }
                var13 = arg1.field9040 - (var10.method631() - -1 >> 1);
                if (~var7 > ~var12) {
                    var7 = var12;
                }
                if (~var13 > ~var8) {
                    var8 = var13;
                }
                var14 = arg1.field9040 + (var10.method631() + 1 >> 1);
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class346 var15 = null;
        if (arg2 <= 102) {
            method1224(16, 109L);
        }
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg4.field3872 != null) {
            var15 = class431.method2516(69, arg4.field3857);
            if (var15 != null) {
                var16 = class389.field5395.method859(arg4.field3872, (class116[]) null, (int[]) null, 42, class148.field1909);
                int var23 = arg1.field9040;
                if (var10 != null) {
                    var17 = var23 - ((var10.method631() >> 1) + var15.method2166() * var16);
                } else {
                    var17 = var23 - var15.method2165() * var16 / 2;
                }
                for (int var24 = 0; var16 > var24; ++var24) {
                    String var25 = class148.field1909[var24];
                    if (~(var16 + -1) < ~var24) {
                        var25 = var25.substring(0, -4 + var25.length());
                    }
                    int var26 = var15.method2167(var25);
                    if (var18 < var26) {
                        var18 = var26;
                    }
                }
                var19 = arg1.field9042 - (var18 / 2 + -arg5);
                var20 = arg1.field9042 - -(var18 / 2) + arg5;
                if (var6 > var19) {
                    var6 = var19;
                }
                if (var20 > var7) {
                    var7 = var20;
                }
                var21 = arg0 + var17;
                if (~var8 < ~var21) {
                    var8 = var21;
                }
                var22 = var16 * var15.method2166() + var17 - -arg0;
                if (~var22 < ~var9) {
                    var9 = var22;
                }
            }
        }
        if (var7 >= class614.field8854 && ~var6 >= ~class614.field8846 && ~class614.field8857 >= ~var9 && ~var8 >= ~class614.field8860) {
            if (arg4.field3858 != null) {
                int[] var27 = new int[arg4.field3858.length];
                for (int var28 = 0; ~(var27.length / 2) < ~var28; ++var28) {
                    int var30 = arg4.field3858[var28 * 2] + arg1.field9038;
                    int var31 = arg4.field3858[var28 * 2 + 1] + arg1.field9039;
                    var27[var28 * 2] = (var30 - class614.field8849) * (-class614.field8854 + class614.field8846) / (-class614.field8849 + class614.field8861) + class614.field8854;
                    var27[var28 * 2 + 1] = -((var31 - class614.field8858) * (-class614.field8857 + class614.field8860) / (-class614.field8858 + class614.field8841)) + class614.field8860;
                }
                class156.method848(arg3, var27, arg4.field3893);
                for (int var29 = 0; var29 < var27.length / 2 + -1; ++var29) {
                    arg3.method906(var27[var29 * 2 - -2], 1, var27[var29 * 2], var27[var29 * 2 - -3], arg4.field3883, var27[var29 * 2 + 1]);
                }
                arg3.method906(var27[0], 1, var27[var27.length + -2], var27[1], arg4.field3883, var27[var27.length + -1]);
            }
            if (var10 != null) {
                if (~class592.field8548 < -1 && (class35.field537 != -1 && class35.field537 == arg1.field9044 || class145.field1888 != -1 && class145.field1888 == arg4.field3859)) {
                    int var32;
                    if (~class535.field7468 < -51) {
                        var32 = (-class535.field7468 + 100) * 2;
                    } else {
                        var32 = class535.field7468 * 2;
                    }
                    int var33 = 16776960 | var32 << 24;
                    arg3.method909(false, 7 + var10.method637() / 2, var33, arg1.field9042, arg1.field9040);
                    arg3.method909(false, var10.method637() / 2 + 5, var33, arg1.field9042, arg1.field9040);
                    arg3.method909(false, 3 + var10.method637() / 2, var33, arg1.field9042, arg1.field9040);
                    arg3.method909(false, 1 + var10.method637() / 2, var33, arg1.field9042, arg1.field9040);
                    arg3.method909(false, var10.method637() / 2, var33, arg1.field9042, arg1.field9040);
                }
                var10.method632(arg1.field9042 - (var10.method627() >> 1), arg1.field9040 - (var10.method631() >> 1));
            }
            if (arg4.field3872 != null && var15 != null) {
                class377.method2305(var18, var16, arg1, var15, var17, 11079, arg3, arg4);
            }
            if (arg4.field3862 != -1 || arg4.field3872 != null) {
                class525 var34 = new class525(arg1);
                var34.field7309 = var13;
                var34.field7302 = var11;
                var34.field7305 = var12;
                var34.field7301 = var19;
                var34.field7314 = var20;
                var34.field7311 = var21;
                var34.field7304 = var14;
                var34.field7303 = var22;
                class612.field8795.method3181(var34, true);
            }
            return false;
        } else {
            return true;
        }
    }

    static {
        for (int var0 = 0; var0 < field2485.length; ++var0) {
            field2485[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; ++var1) {
            field2485[var1] = var1 + -65;
        }
        for (int var2 = 97; var2 <= 122; ++var2) {
            field2485[var2] = var2 + -97 + 26;
        }
        for (int var3 = 48; var3 <= 57; ++var3) {
            field2485[var3] = var3 + 52 - 48;
        }
        field2485[42] = field2485[43] = 62;
        field2485[45] = field2485[47] = 63;
    }
}
