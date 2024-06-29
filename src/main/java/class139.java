import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class139 implements class114 {

    @OriginalMember(owner = "client!u", name = "r", descriptor = "Ljd;")
    private class66 field3163 = new class66();

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    private int field3165 = 0;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "D")
    private double field3169 = 1.0D;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    private int field3171 = 128;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "Lie;")
    private class61 field3167;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "I")
    private int field3170;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "[Lsa;")
    private class126[] field3150;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Z")
    public static boolean field3149 = false;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "Lid;")
    private static class60 field3160 = class11.method72("flash3:", (byte) 95);

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Lid;")
    public static class60 field3151 = field3160;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "Lid;")
    public static class60 field3166 = field3160;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "Lid;")
    public static class60 field3168 = class11.method72("sl_flags", (byte) 118);

    @OriginalMember(owner = "client!u", name = "s", descriptor = "Ljd;")
    public static class66 field3164 = new class66();

    @OriginalMember(owner = "client!u", name = "A", descriptor = "Lqd;")
    public static class115 field3172 = new class115(30);

    @OriginalMember(owner = "client!u", name = "F", descriptor = "Lid;")
    private static class60 field3177 = class11.method72("Create a free account", (byte) 99);

    @OriginalMember(owner = "client!u", name = "E", descriptor = "Lid;")
    public static class60 field3176 = field3177;

    @OriginalMember(owner = "client!u", name = "G", descriptor = "Lid;")
    private static class60 field3178 = class11.method72("Welcome to RuneScape", (byte) 127);

    @OriginalMember(owner = "client!u", name = "C", descriptor = "I")
    public static int field3174 = 0;

    @OriginalMember(owner = "client!u", name = "H", descriptor = "Lid;")
    public static class60 field3179 = field3178;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "Lid;")
    public static class60 field3175 = class11.method72("(U0a )2 in: ", (byte) 120);

    @OriginalMember(owner = "client!u", name = "K", descriptor = "Lid;")
    private static class60 field3182 = class11.method72("No response from server)3", (byte) 106);

    @OriginalMember(owner = "client!u", name = "I", descriptor = "Lid;")
    public static class60 field3180 = class11.method72("Registrierter Benutzer", (byte) -60);

    @OriginalMember(owner = "client!u", name = "B", descriptor = "Lid;")
    public static class60 field3173 = field3182;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!u", name = "J", descriptor = "Loe;")
    public static class102 field3181;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ID)V")
    public final void method1078(int arg0, double arg1) {
        this.field3169 = arg1;
        if (arg0 <= 6) {
            field3182 = null;
        }
        this.method1081((byte) -63);
        field3146++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public static void method1079(byte arg0) {
        field3168 = null;
        field3173 = null;
        field3182 = null;
        field3166 = null;
        field3181 = null;
        field3180 = null;
        field3177 = null;
        field3178 = null;
        field3172 = null;
        field3151 = null;
        field3160 = null;
        field3179 = null;
        field3176 = null;
        field3164 = null;
        field3175 = null;
        if (arg0 != 114) {
            field3176 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)Z")
    public final boolean method912(int arg0, byte arg1) {
        field3158++;
        return arg1 >= -53 ? false : this.field3150[arg0].field2889;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(B)V")
    public static final void method1080(byte arg0) {
        field3156++;
        if (class152.field3397 != null) {
            class152.field3397.method1186(1024);
        }
        if (class113.field2703 != null) {
            class113.field2703.method1186(1024);
        }
        if (arg0 < 10) {
            field3175 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)[I")
    public final int[] method909(int arg0, boolean arg1) {
        if (arg1) {
            this.field3163 = null;
        }
        field3159++;
        class126 var3 = this.field3150[arg0];
        if (var3 != null) {
            if (var3.field2890 != null) {
                this.field3163.method505(var3, 10);
                var3.field2886 = true;
                return var3.field2890;
            }
            boolean var4 = var3.method986(this.field3169, this.field3171, this.field3167);
            if (var4) {
                if (this.field3165 == 0) {
                    class126 var5 = (class126) this.field3163.method504(4500);
                    var5.method989();
                } else {
                    this.field3165--;
                }
                this.field3163.method505(var3, 10);
                var3.field2886 = true;
                return var3.field2890;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Z")
    public final boolean method910(int arg0, int arg1) {
        field3148++;
        if (arg0 <= 3) {
            return true;
        } else {
            return this.field3171 == 64;
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(B)V")
    public final void method1081(byte arg0) {
        for (int var2 = 0; var2 < this.field3150.length; var2++) {
            if (this.field3150[var2] != null) {
                this.field3150[var2].method989();
            }
        }
        field3154++;
        this.field3163 = new class66();
        this.field3165 = this.field3170;
        if (arg0 != -63) {
            method1082(-80);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public static final void method1082(int arg0) {
        if (arg0 != 13) {
            field3173 = null;
        }
        for (class81 var1 = (class81) class39.field929.method713(12421); var1 != null; var1 = (class81) class39.field929.method711(124)) {
            int var2 = var1.field2012;
            if (class28.method209(var2, -1)) {
                boolean var3 = true;
                class40[] var4 = class45.field1177[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field977;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field2929;
                    class40 var7 = class132.method1041(true, var6);
                    if (var7 != null) {
                        class12.method79(arg0 - 30846, var7);
                    }
                }
            }
        }
        field3157++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)I")
    public final int method911(byte arg0, int arg1) {
        if (arg0 != 58) {
            field3168 = null;
        }
        field3153++;
        return this.field3150[arg1] == null ? 0 : this.field3150[arg1].field2894;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILl;IZIIIILpb;)V")
    public static final void method1083(int arg0, class76 arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, class106 arg8) {
        field3161++;
        if (class22.field548 && (class124.field2869[0][arg7][arg2] & 0x2) == 0) {
            if ((class124.field2869[arg5][arg7][arg2] & 0x10) != 0) {
                return;
            }
            if (class32.method241(arg7, arg5, arg2, -58) != class153.field3423) {
                return;
            }
        }
        if (arg5 < class7.field95) {
            class7.field95 = arg5;
        }
        int var9 = class113.field2711[arg5][arg7][arg2];
        if (!arg3) {
            return;
        }
        int var10 = class113.field2711[arg5][arg7 + 1][arg2];
        int var11 = class113.field2711[arg5][arg7 + 1][arg2 + 1];
        int var12 = class113.field2711[arg5][arg7][arg2 + 1];
        class148 var13 = class31.method238(-29628, arg0);
        int var14 = var9 + var11 + var10 + var12 >> 2;
        int var15 = (arg0 << 14) + (arg2 << 7) + arg7 + 1073741824;
        if (var13.field3359 == 0) {
            var15 += Integer.MIN_VALUE;
        }
        int var16 = (arg6 << 6) + arg4;
        if (var13.field3322 == 1) {
            var16 += 256;
        }
        if (var13.method1121(19574)) {
            class158.method1216(var13, -32225, arg6, arg2, arg5, arg7);
        }
        if (arg4 == 22) {
            if (!class22.field548 || var13.field3359 != 0 || var13.field3348 == 1 || var13.field3318) {
                class50 var17;
                if (var13.field3307 == -1 && var13.field3364 == null) {
                    var17 = var13.method1120(22, var12, var9, arg6, var10, -121, var11);
                } else {
                    var17 = new class135(arg0, 22, arg6, var9, var10, var11, var12, var13.field3307, true, null);
                }
                arg1.method604(arg5, arg7, arg2, var14, var17, var15, var16);
                if (var13.field3348 == 1 && arg8 != null) {
                    arg8.method876(arg2, arg7, (byte) -94);
                }
            }
        } else if (arg4 == 10 || arg4 == 11) {
            class50 var37;
            if (var13.field3307 == -1 && var13.field3364 == null) {
                var37 = var13.method1120(10, var12, var9, arg6, var10, 109, var11);
            } else {
                var37 = new class135(arg0, 10, arg6, var9, var10, var11, var12, var13.field3307, true, null);
            }
            if (var37 != null) {
                int var38;
                int var39;
                if (arg6 == 1 || arg6 == 3) {
                    var38 = var13.field3306;
                    var39 = var13.field3330;
                } else {
                    var38 = var13.field3330;
                    var39 = var13.field3306;
                }
                int var40 = 0;
                if (arg4 == 11) {
                    var40 += 256;
                }
                if (arg1.method613(arg5, arg7, arg2, var14, var38, var39, var37, var40, var15, var16) && var13.field3361) {
                    int var41 = 15;
                    if (var37 instanceof class70) {
                        var41 = ((class70) var37).method527() / 4;
                        if (var41 > 30) {
                            var41 = 30;
                        }
                    }
                    for (int var42 = 0; var42 <= var38; var42++) {
                        for (int var43 = 0; var43 <= var39; var43++) {
                            if (var41 > class77.field1889[arg5][arg7 + var42][arg2 + var43]) {
                                class77.field1889[arg5][arg7 + var42][arg2 + var43] = (byte) var41;
                            }
                        }
                    }
                }
            }
            if (var13.field3348 != 0 && arg8 != null) {
                arg8.method873(arg6, 109, arg7, var13.field3306, var13.field3347, var13.field3330, arg2);
            }
        } else if (arg4 >= 12) {
            class50 var18;
            if (var13.field3307 == -1 && var13.field3364 == null) {
                var18 = var13.method1120(arg4, var12, var9, arg6, var10, 110, var11);
            } else {
                var18 = new class135(arg0, arg4, arg6, var9, var10, var11, var12, var13.field3307, true, null);
            }
            arg1.method613(arg5, arg7, arg2, var14, 1, 1, var18, 0, var15, var16);
            if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg5 > 0) {
                class55.field1380[arg5][arg7][arg2] = class97.method769(class55.field1380[arg5][arg7][arg2], 2340);
            }
            if (var13.field3348 != 0 && arg8 != null) {
                arg8.method873(arg6, 106, arg7, var13.field3306, var13.field3347, var13.field3330, arg2);
            }
        } else if (arg4 == 0) {
            class50 var19;
            if (var13.field3307 == -1 && var13.field3364 == null) {
                var19 = var13.method1120(0, var12, var9, arg6, var10, -59, var11);
            } else {
                var19 = new class135(arg0, 0, arg6, var9, var10, var11, var12, var13.field3307, true, null);
            }
            arg1.method588(arg5, arg7, arg2, var14, var19, null, class69.field1652[arg6], 0, var15, var16);
            if (arg6 == 0) {
                if (var13.field3361) {
                    class77.field1889[arg5][arg7][arg2] = 50;
                    class77.field1889[arg5][arg7][arg2 + 1] = 50;
                }
                if (var13.field3324) {
                    class55.field1380[arg5][arg7][arg2] = class97.method769(class55.field1380[arg5][arg7][arg2], 585);
                }
            } else if (arg6 == 1) {
                if (var13.field3361) {
                    class77.field1889[arg5][arg7][arg2 + 1] = 50;
                    class77.field1889[arg5][arg7 + 1][arg2 + 1] = 50;
                }
                if (var13.field3324) {
                    class55.field1380[arg5][arg7][arg2 + 1] = class97.method769(class55.field1380[arg5][arg7][arg2 + 1], 1170);
                }
            } else if (arg6 == 2) {
                if (var13.field3361) {
                    class77.field1889[arg5][arg7 + 1][arg2] = 50;
                    class77.field1889[arg5][arg7 + 1][arg2 + 1] = 50;
                }
                if (var13.field3324) {
                    class55.field1380[arg5][arg7 + 1][arg2] = class97.method769(class55.field1380[arg5][arg7 + 1][arg2], 585);
                }
            } else if (arg6 == 3) {
                if (var13.field3361) {
                    class77.field1889[arg5][arg7][arg2] = 50;
                    class77.field1889[arg5][arg7 + 1][arg2] = 50;
                }
                if (var13.field3324) {
                    class55.field1380[arg5][arg7][arg2] = class97.method769(class55.field1380[arg5][arg7][arg2], 1170);
                }
            }
            if (var13.field3348 != 0 && arg8 != null) {
                arg8.method875(1, arg2, arg4, arg7, arg6, var13.field3347);
            }
            if (var13.field3328 != 16) {
                arg1.method622(arg5, arg7, arg2, var13.field3328);
            }
        } else if (arg4 == 1) {
            class50 var20;
            if (var13.field3307 == -1 && var13.field3364 == null) {
                var20 = var13.method1120(1, var12, var9, arg6, var10, 98, var11);
            } else {
                var20 = new class135(arg0, 1, arg6, var9, var10, var11, var12, var13.field3307, true, null);
            }
            arg1.method588(arg5, arg7, arg2, var14, var20, null, class17.field420[arg6], 0, var15, var16);
            if (var13.field3361) {
                if (arg6 == 0) {
                    class77.field1889[arg5][arg7][arg2 + 1] = 50;
                } else if (arg6 == 1) {
                    class77.field1889[arg5][arg7 + 1][arg2 + 1] = 50;
                } else if (arg6 == 2) {
                    class77.field1889[arg5][arg7 + 1][arg2] = 50;
                } else if (arg6 == 3) {
                    class77.field1889[arg5][arg7][arg2] = 50;
                }
            }
            if (var13.field3348 != 0 && arg8 != null) {
                arg8.method875(1, arg2, arg4, arg7, arg6, var13.field3347);
            }
        } else if (arg4 == 2) {
            int var21 = arg6 + 1 & 0x3;
            class50 var22;
            class50 var23;
            if (var13.field3307 == -1 && var13.field3364 == null) {
                var22 = var13.method1120(2, var12, var9, arg6 + 4, var10, 116, var11);
                var23 = var13.method1120(2, var12, var9, var21, var10, 114, var11);
            } else {
                var22 = new class135(arg0, 2, arg6 + 4, var9, var10, var11, var12, var13.field3307, true, null);
                var23 = new class135(arg0, 2, var21, var9, var10, var11, var12, var13.field3307, true, null);
            }
            arg1.method588(arg5, arg7, arg2, var14, var22, var23, class69.field1652[arg6], class69.field1652[var21], var15, var16);
            if (var13.field3324) {
                if (arg6 == 0) {
                    class55.field1380[arg5][arg7][arg2] = class97.method769(class55.field1380[arg5][arg7][arg2], 585);
                    class55.field1380[arg5][arg7][arg2 + 1] = class97.method769(class55.field1380[arg5][arg7][arg2 + 1], 1170);
                } else if (arg6 == 1) {
                    class55.field1380[arg5][arg7][arg2 + 1] = class97.method769(class55.field1380[arg5][arg7][arg2 + 1], 1170);
                    class55.field1380[arg5][arg7 + 1][arg2] = class97.method769(class55.field1380[arg5][arg7 + 1][arg2], 585);
                } else if (arg6 == 2) {
                    class55.field1380[arg5][arg7 + 1][arg2] = class97.method769(class55.field1380[arg5][arg7 + 1][arg2], 585);
                    class55.field1380[arg5][arg7][arg2] = class97.method769(class55.field1380[arg5][arg7][arg2], 1170);
                } else if (arg6 == 3) {
                    class55.field1380[arg5][arg7][arg2] = class97.method769(class55.field1380[arg5][arg7][arg2], 1170);
                    class55.field1380[arg5][arg7][arg2] = class97.method769(class55.field1380[arg5][arg7][arg2], 585);
                }
            }
            if (var13.field3348 != 0 && arg8 != null) {
                arg8.method875(1, arg2, arg4, arg7, arg6, var13.field3347);
            }
            if (var13.field3328 != 16) {
                arg1.method622(arg5, arg7, arg2, var13.field3328);
            }
        } else if (arg4 == 3) {
            class50 var24;
            if (var13.field3307 == -1 && var13.field3364 == null) {
                var24 = var13.method1120(3, var12, var9, arg6, var10, -71, var11);
            } else {
                var24 = new class135(arg0, 3, arg6, var9, var10, var11, var12, var13.field3307, true, null);
            }
            arg1.method588(arg5, arg7, arg2, var14, var24, null, class17.field420[arg6], 0, var15, var16);
            if (var13.field3361) {
                if (arg6 == 0) {
                    class77.field1889[arg5][arg7][arg2 + 1] = 50;
                } else if (arg6 == 1) {
                    class77.field1889[arg5][arg7 + 1][arg2 + 1] = 50;
                } else if (arg6 == 2) {
                    class77.field1889[arg5][arg7 + 1][arg2] = 50;
                } else if (arg6 == 3) {
                    class77.field1889[arg5][arg7][arg2] = 50;
                }
            }
            if (var13.field3348 != 0 && arg8 != null) {
                arg8.method875(1, arg2, arg4, arg7, arg6, var13.field3347);
            }
        } else if (arg4 == 9) {
            class50 var25;
            if (var13.field3307 == -1 && var13.field3364 == null) {
                var25 = var13.method1120(arg4, var12, var9, arg6, var10, 83, var11);
            } else {
                var25 = new class135(arg0, arg4, arg6, var9, var10, var11, var12, var13.field3307, true, null);
            }
            arg1.method613(arg5, arg7, arg2, var14, 1, 1, var25, 0, var15, var16);
            if (var13.field3348 != 0 && arg8 != null) {
                arg8.method873(arg6, 79, arg7, var13.field3306, var13.field3347, var13.field3330, arg2);
            }
        } else {
            if (var13.field3323) {
                if (arg6 == 1) {
                    int var26 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var9;
                    var9 = var26;
                } else if (arg6 == 2) {
                    int var27 = var12;
                    var12 = var10;
                    var10 = var27;
                    int var28 = var11;
                    var11 = var9;
                    var9 = var28;
                } else if (arg6 == 3) {
                    int var29 = var12;
                    var12 = var9;
                    var9 = var10;
                    var10 = var11;
                    var11 = var29;
                }
            }
            if (arg4 == 4) {
                class50 var30;
                if (var13.field3307 == -1 && var13.field3364 == null) {
                    var30 = var13.method1120(4, var12, var9, 0, var10, -66, var11);
                } else {
                    var30 = new class135(arg0, 4, 0, var9, var10, var11, var12, var13.field3307, true, null);
                }
                arg1.method615(arg5, arg7, arg2, var14, var30, class69.field1652[arg6], arg6 * 512, 0, 0, var15, var16);
            } else if (arg4 == 5) {
                int var31 = 16;
                int var32 = arg1.method584(arg5, arg7, arg2);
                if (var32 != 0) {
                    var31 = class31.method238(-29628, var32 >> 14 & 0x7FFF).field3328;
                }
                class50 var33;
                if (var13.field3307 == -1 && var13.field3364 == null) {
                    var33 = var13.method1120(4, var12, var9, 0, var10, -59, var11);
                } else {
                    var33 = new class135(arg0, 4, 0, var9, var10, var11, var12, var13.field3307, true, null);
                }
                arg1.method615(arg5, arg7, arg2, var14, var33, class69.field1652[arg6], arg6 * 512, class99.field2416[arg6] * var31, class135.field3072[arg6] * var31, var15, var16);
            } else if (arg4 == 6) {
                class50 var34;
                if (var13.field3307 == -1 && var13.field3364 == null) {
                    var34 = var13.method1120(4, var12, var9, 0, var10, 90, var11);
                } else {
                    var34 = new class135(arg0, 4, 0, var9, var10, var11, var12, var13.field3307, true, null);
                }
                arg1.method615(arg5, arg7, arg2, var14, var34, 256, arg6, 0, 0, var15, var16);
            } else if (arg4 == 7) {
                class50 var35;
                if (var13.field3307 == -1 && var13.field3364 == null) {
                    var35 = var13.method1120(4, var12, var9, 0, var10, 102, var11);
                } else {
                    var35 = new class135(arg0, 4, 0, var9, var10, var11, var12, var13.field3307, true, null);
                }
                arg1.method615(arg5, arg7, arg2, var14, var35, 512, arg6, 0, 0, var15, var16);
            } else if (arg4 == 8) {
                class50 var36;
                if (var13.field3307 == -1 && var13.field3364 == null) {
                    var36 = var13.method1120(4, var12, var9, 0, var10, 107, var11);
                } else {
                    var36 = new class135(arg0, 4, 0, var9, var10, var11, var12, var13.field3307, true, null);
                }
                arg1.method615(arg5, arg7, arg2, var14, var36, 768, arg6, 0, 0, var15, var16);
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(II)V")
    public final void method1084(int arg0, int arg1) {
        field3155++;
        if (arg1 != -22659) {
            return;
        }
        for (int var3 = 0; var3 < this.field3150.length; var3++) {
            class126 var4 = this.field3150[var3];
            if (var4 != null && var4.field2891 != 0 && var4.field2886) {
                var4.method987(arg0);
                var4.field2886 = false;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZI)V")
    public static final void method1085(boolean arg0, int arg1) {
        field3147++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class56.field1406[arg1];
        int var3 = class69.field1653[arg1];
        if (!arg0) {
            return;
        }
        int var4 = class151.field3385[arg1];
        int var5 = class90.field2249[arg1];
        if (var5 >= 2000) {
            var5 -= 2000;
        }
        if (var5 == 42) {
            boolean var6 = class78.method634(class107.field2640.field827[0], 0, 0, class107.field2640.field841[0], 2, var2, false, 0, var3, -26, 0, 0);
            if (!var6) {
                class78.method634(class107.field2640.field827[0], 0, 1, class107.field2640.field841[0], 2, var2, false, 0, var3, -69, 0, 1);
            }
            class11.field196 = 2;
            class10.field177 = 0;
            class23.field569++;
            class121.field2792 = field3174;
            class148.field3369 = class140.field3185;
            class22.field519.method1214(75, 0);
            class22.field519.method811(true, var4);
            class22.field519.method811(true, var2 + class41.field1095);
            class22.field519.method811(arg0, class144.field3240 + var3);
        }
        if (var5 == 1003) {
            class28.field675++;
            class148.field3369 = class140.field3185;
            class10.field177 = 0;
            class11.field196 = 2;
            class121.field2792 = field3174;
            class22.field519.method1214(23, 0);
            class22.field519.method800(-10255, var4);
        }
        if (var5 == 47) {
            class11.field191++;
            class22.field519.method1214(28, 0);
            class22.field519.method845(128, var4);
            class22.field519.method845(128, var2);
            class22.field519.method826(120, var3);
            class81.field2018 = 0;
            class157.field3611 = class132.method1041(true, var3);
            class22.field550 = var2;
        }
        if (var5 == 1001) {
            class40 var8 = class132.method1041(true, var3);
            if (var8 == null || var8.field993[var2] < 100000) {
                class22.field519.method1214(23, 0);
                class22.field519.method800(-10255, var4);
                class28.field675++;
            } else {
                class43.method342(class94.field2314, 0, class104.method853(-115, new class60[] { class98.method774((byte) -121, var8.field993[var2]), class23.field561, class85.method710(var4, 10).field2122 }), 2001);
            }
            class81.field2018 = 0;
            class157.field3611 = class132.method1041(true, var3);
            class22.field550 = var2;
        }
        if (var5 == 31) {
            class56.field1388++;
            class22.field519.method1214(102, 0);
            class22.field519.method826(97, var3);
            class22.field519.method845(128, var2);
            class22.field519.method800(-10255, var4);
            class81.field2018 = 0;
            class157.field3611 = class132.method1041(true, var3);
            class22.field550 = var2;
        }
        if (var5 == 18) {
            class141.field3222++;
            class46.method355((byte) -89, var2, var3, var4);
            class22.field519.method1214(31, 0);
            class22.field519.method800(-10255, var4 >> 14 & 0x7FFF);
            class22.field519.method811(true, var2 + class41.field1095);
            class22.field519.method845(128, class144.field3240 + var3);
        }
        if (var5 == 35) {
            class1 var9 = class81.field2016[var4];
            if (var9 != null) {
                class129.field2945++;
                class78.method634(class107.field2640.field827[0], 0, 1, class107.field2640.field841[0], 2, var9.field841[0], false, 0, var9.field827[0], -92, 0, 1);
                class10.field177 = 0;
                class148.field3369 = class140.field3185;
                class121.field2792 = field3174;
                class11.field196 = 2;
                class22.field519.method1214(99, 0);
                class22.field519.method800(-10255, var4);
            }
        }
        if (var5 == 16) {
            class53 var10 = class5.field83[var4];
            if (var10 != null) {
                class35.field849++;
                class78.method634(class107.field2640.field827[0], 0, 1, class107.field2640.field841[0], 2, var10.field841[0], false, 0, var10.field827[0], -95, 0, 1);
                class121.field2792 = field3174;
                class10.field177 = 0;
                class148.field3369 = class140.field3185;
                class11.field196 = 2;
                class22.field519.method1214(188, 0);
                class22.field519.method800(-10255, class23.field564);
                class22.field519.method800(-10255, class101.field2469);
                class22.field519.method824(23656, var4);
                class22.field519.method834((byte) 76, class107.field2634);
            }
        }
        if (var5 == 57) {
            class154.field3472++;
            class22.field519.method1214(239, 0);
            class22.field519.method834((byte) 126, var3);
            class22.field519.method811(true, class10.field159);
            class22.field519.method826(97, class135.field3073);
            class22.field519.method800(-10255, var2);
        }
        if (var5 == 13) {
            class1 var11 = class81.field2016[var4];
            if (var11 != null) {
                class133.field3027++;
                class78.method634(class107.field2640.field827[0], 0, 1, class107.field2640.field841[0], 2, var11.field841[0], false, 0, var11.field827[0], -62, 0, 1);
                class10.field177 = 0;
                class11.field196 = 2;
                class148.field3369 = class140.field3185;
                class121.field2792 = field3174;
                class22.field519.method1214(245, 0);
                class22.field519.method800(-10255, var4);
            }
        }
        if (var5 == 40) {
            class1 var12 = class81.field2016[var4];
            if (var12 != null) {
                class78.method634(class107.field2640.field827[0], 0, 1, class107.field2640.field841[0], 2, var12.field841[0], false, 0, var12.field827[0], -117, 0, 1);
                class10.field177 = 0;
                class121.field2792 = field3174;
                class148.field3369 = class140.field3185;
                class11.field196 = 2;
                class22.field519.method1214(175, 0);
                class22.field519.method826(104, class135.field3073);
                class22.field519.method800(-10255, var4);
                class136.field3089++;
                class22.field519.method845(128, class10.field159);
            }
        }
        if (var5 == 23) {
            class81.field2009++;
            class22.field519.method1214(251, 0);
            class22.field519.method800(-10255, var4);
            class22.field519.method800(-10255, var2);
            class22.field519.method826(121, var3);
            class81.field2018 = 0;
            class157.field3611 = class132.method1041(true, var3);
            class22.field550 = var2;
        }
        if (var5 == 9 && class124.field2864 == null) {
            class140.method1090(var3, -30622, var2);
            class124.field2864 = class158.method1218(12777, var2, var3);
            class12.method79(-30833, class124.field2864);
        }
        if (var5 == 32) {
            class1 var13 = class81.field2016[var4];
            if (var13 != null) {
                class78.method634(class107.field2640.field827[0], 0, 1, class107.field2640.field841[0], 2, var13.field841[0], false, 0, var13.field827[0], -26, 0, 1);
                class104.field2552++;
                class148.field3369 = class140.field3185;
                class10.field177 = 0;
                class121.field2792 = field3174;
                class11.field196 = 2;
                class22.field519.method1214(203, 0);
                class22.field519.method824(23656, var4);
            }
        }
        if (var5 == 34) {
            class129.field2943++;
            class22.field519.method1214(29, 0);
            class22.field519.method834((byte) 102, class107.field2634);
            class22.field519.method800(-10255, var2);
            class22.field519.method811(true, var4);
            class22.field519.method819(var3, (byte) -111);
            class22.field519.method845(128, class23.field564);
            class22.field519.method800(-10255, class101.field2469);
            class81.field2018 = 0;
            class157.field3611 = class132.method1041(true, var3);
            class22.field550 = var2;
        }
        if (var5 == 44) {
            class48.field1252++;
            class46.method355((byte) -115, var2, var3, var4);
            class22.field519.method1214(106, 0);
            class22.field519.method845(128, var2 + class41.field1095);
            class22.field519.method800(-10255, var4 >> 14 & 0x7FFF);
            class22.field519.method824(23656, class144.field3240 + var3);
        }
        if (var5 == 45) {
            class124.field2839++;
            boolean var14 = class78.method634(class107.field2640.field827[0], 0, 0, class107.field2640.field841[0], 2, var2, false, 0, var3, -23, 0, 0);
            if (!var14) {
                class78.method634(class107.field2640.field827[0], 0, 1, class107.field2640.field841[0], 2, var2, false, 0, var3, -80, 0, 1);
            }
            class121.field2792 = field3174;
            class11.field196 = 2;
            class10.field177 = 0;
            class148.field3369 = class140.field3185;
            class22.field519.method1214(83, 0);
            class22.field519.method824(23656, var4);
            class22.field519.method811(true, class41.field1095 + var2);
            class22.field519.method845(128, class144.field3240 + var3);
        }
        if (var5 == 1002) {
            class121.field2792 = field3174;
            class10.field177 = 0;
            class11.field196 = 2;
            class148.field3369 = class140.field3185;
            class53 var16 = class5.field83[var4];
            if (var16 != null) {
                class154 var17 = var16.field1337;
                if (var17.field3499 != null) {
                    var17 = var17.method1169(-14424);
                }
                if (var17 != null) {
                    class107.field2631++;
                    class22.field519.method1214(56, 0);
                    class22.field519.method800(-10255, var17.field3465);
                }
            }
        }
        if (var5 == 21) {
            class43.field1151.method590(class46.field1222, var2, var3);
        }
        if (var5 == 36) {
            boolean var18 = class78.method634(class107.field2640.field827[0], 0, 0, class107.field2640.field841[0], 2, var2, false, 0, var3, -121, 0, 0);
            class90.field2224++;
            if (!var18) {
                class78.method634(class107.field2640.field827[0], 0, 1, class107.field2640.field841[0], 2, var2, false, 0, var3, -85, 0, 1);
            }
            class121.field2792 = field3174;
            class11.field196 = 2;
            class10.field177 = 0;
            class148.field3369 = class140.field3185;
            class22.field519.method1214(201, 0);
            class22.field519.method845(128, class10.field159);
            class22.field519.method845(128, class144.field3240 + var3);
            class22.field519.method811(true, var4);
            class22.field519.method819(class135.field3073, (byte) 41);
            class22.field519.method824(23656, class41.field1095 + var2);
        }
        if (var5 == 28) {
            boolean var20 = true;
            class40 var21 = class132.method1041(true, var3);
            if (var21.field966 > 0) {
                var20 = class152.method1159(var21, 324);
            }
            if (var20) {
                class38.field914++;
                class22.field519.method1214(152, 0);
                class22.field519.method819(var3, (byte) 45);
            }
        }
        if (var5 == 20) {
            class135.field3074++;
            class22.field519.method1214(207, 0);
            class22.field519.method845(128, var2);
            class22.field519.method824(23656, var4);
            class22.field519.method826(98, var3);
            class81.field2018 = 0;
            class157.field3611 = class132.method1041(true, var3);
            class22.field550 = var2;
        }
        if (var5 == 1005) {
            class120.field2762++;
            class46.method355((byte) -124, var2, var3, var4);
            class22.field519.method1214(149, 0);
            class22.field519.method845(128, var4 >> 14 & 0x7FFF);
            class22.field519.method824(23656, class144.field3240 + var3);
            class22.field519.method800(-10255, class41.field1095 + var2);
        }
        if (var5 == 14) {
            class53 var22 = class5.field83[var4];
            if (var22 != null) {
                class78.method634(class107.field2640.field827[0], 0, 1, class107.field2640.field841[0], 2, var22.field841[0], false, 0, var22.field827[0], -107, 0, 1);
                class140.field3183++;
                class121.field2792 = field3174;
                class11.field196 = 2;
                class148.field3369 = class140.field3185;
                class10.field177 = 0;
                class22.field519.method1214(241, 0);
                class22.field519.method845(128, var4);
            }
        }
        if (var5 == 33) {
            class53 var23 = class5.field83[var4];
            if (var23 != null) {
                class78.method634(class107.field2640.field827[0], 0, 1, class107.field2640.field841[0], 2, var23.field841[0], false, 0, var23.field827[0], -95, 0, 1);
                class10.field177 = 0;
                class11.field196 = 2;
                class148.field3369 = class140.field3185;
                class80.field1973++;
                class121.field2792 = field3174;
                class22.field519.method1214(64, 0);
                class22.field519.method824(23656, var4);
                class22.field519.method826(97, class135.field3073);
                class22.field519.method845(128, class10.field159);
            }
        }
        if (var5 == 46) {
            class40 var24 = class158.method1218(12777, var2, var3);
            if (var24 != null) {
                class101.method795(false);
                class45.method350(var3, class140.method1092(class97.method770(var24, -1370253216), (byte) -87), (byte) -80, var2);
                class155.field3546 = 0;
                class35.field857 = class21.method163((byte) 59, var24);
                if (class35.field857 == null) {
                    class35.field857 = class2.field41;
                }
                if (!var24.field977) {
                    class56.field1389 = class104.method853(-111, new class60[] { class33.field781, var24.field1039, class90.field2261 });
                    return;
                }
                class56.field1389 = class104.method853(-78, new class60[] { var24.field1036, class90.field2261 });
            }
            return;
        }
        if (var5 == 17) {
            class38.field914++;
            class22.field519.method1214(152, 0);
            class22.field519.method819(var3, (byte) -108);
            class40 var25 = class132.method1041(arg0, var3);
            if (var25.field1019 != null && var25.field1019[0][0] == 5) {
                int var26 = var25.field1019[0][1];
                class43.field1158[var26] = 1 - class43.field1158[var26];
                class72.method551((byte) 125, var26);
            }
        }
        if (var5 == 37) {
            class66.field1615++;
            class22.field519.method1214(1, 0);
            class22.field519.method800(-10255, var2);
            class22.field519.method824(23656, var4);
            class22.field519.method834((byte) 84, var3);
            class81.field2018 = 0;
            class157.field3611 = class132.method1041(true, var3);
            class22.field550 = var2;
        }
        if (var5 == 26) {
            class56.field1392++;
            class22.field519.method1214(12, 0);
            class22.field519.method845(128, var4);
            class22.field519.method819(var3, (byte) -102);
            class22.field519.method800(-10255, var2);
            class81.field2018 = 0;
            class157.field3611 = class132.method1041(true, var3);
            class22.field550 = var2;
        }
        if (var5 == 12) {
            class72.field1747++;
            boolean var27 = class78.method634(class107.field2640.field827[0], 0, 0, class107.field2640.field841[0], 2, var2, false, 0, var3, -95, 0, 0);
            if (!var27) {
                class78.method634(class107.field2640.field827[0], 0, 1, class107.field2640.field841[0], 2, var2, false, 0, var3, -75, 0, 1);
            }
            class148.field3369 = class140.field3185;
            class10.field177 = 0;
            class11.field196 = 2;
            class121.field2792 = field3174;
            class22.field519.method1214(136, 0);
            class22.field519.method811(true, class41.field1095 + var2);
            class22.field519.method811(true, var3 + class144.field3240);
            class22.field519.method811(true, var4);
        }
        if (var5 == 22) {
            class53 var29 = class5.field83[var4];
            if (var29 != null) {
                class78.method634(class107.field2640.field827[0], 0, 1, class107.field2640.field841[0], 2, var29.field841[0], false, 0, var29.field827[0], -56, 0, 1);
                class10.field177 = 0;
                class121.field2792 = field3174;
                class11.field196 = 2;
                class148.field3369 = class140.field3185;
                class22.field519.method1214(227, 0);
                class25.field609++;
                class22.field519.method811(true, var4);
            }
        }
        if (var5 == 48) {
            class41.field1099++;
            class22.field519.method1214(13, 0);
            class22.field519.method800(-10255, var2);
            class22.field519.method837(var3, 8895);
            class22.field519.method845(128, class10.field159);
            class22.field519.method824(23656, var4);
            class22.field519.method834((byte) -93, class135.field3073);
            class81.field2018 = 0;
            class157.field3611 = class132.method1041(true, var3);
            class22.field550 = var2;
        }
        if (var5 == 19) {
            class28.field673++;
            class46.method355((byte) -109, var2, var3, var4);
            class22.field519.method1214(129, 0);
            class22.field519.method845(128, var4 >> 14 & 0x7FFF);
            class22.field519.method824(23656, class41.field1095 + var2);
            class22.field519.method811(true, var3 + class144.field3240);
        }
        if (var5 == 2) {
            class28.field651++;
            class22.field519.method1214(234, 0);
            class22.field519.method800(-10255, var2);
            class22.field519.method811(true, var4);
            class22.field519.method826(105, var3);
            class81.field2018 = 0;
            class157.field3611 = class132.method1041(true, var3);
            class22.field550 = var2;
        }
        if (var5 == 3) {
            class53 var30 = class5.field83[var4];
            if (var30 != null) {
                class78.method634(class107.field2640.field827[0], 0, 1, class107.field2640.field841[0], 2, var30.field841[0], false, 0, var30.field827[0], -68, 0, 1);
                class10.field177 = 0;
                class121.field2792 = field3174;
                class43.field1143++;
                class148.field3369 = class140.field3185;
                class11.field196 = 2;
                class22.field519.method1214(220, 0);
                class22.field519.method800(-10255, var4);
            }
        }
        if (var5 == 1007) {
            class121.field2792 = field3174;
            class148.field3369 = class140.field3185;
            class10.field177 = 0;
            class11.field196 = 2;
            class51.field1299++;
            class22.field519.method1214(22, 0);
            class22.field519.method824(23656, var4 >> 14 & 0x7FFF);
        }
        if (var5 == 49) {
            class101.method795(false);
            class40 var31 = class132.method1041(arg0, var3);
            class101.field2469 = var4;
            class107.field2634 = var3;
            class23.field564 = var2;
            class155.field3546 = 1;
            class12.method79(-30833, var31);
            class85.field2121 = class104.method853(-106, new class60[] { class131.field2986, class85.method710(var4, 10).field2122, class90.field2261 });
            if (class85.field2121 == null) {
                class85.field2121 = class41.field1107;
            }
            return;
        }
        if (var5 == 11 && class46.method355((byte) -67, var2, var3, var4)) {
            class22.field519.method1214(200, 0);
            class22.field519.method824(23656, class144.field3240 + var3);
            class22.field519.method845(128, var4 >> 14 & 0x7FFF);
            class38.field911++;
            class22.field519.method826(118, class135.field3073);
            class22.field519.method845(128, class41.field1095 + var2);
            class22.field519.method800(-10255, class10.field159);
        }
        if (var5 == 38) {
            class44.field1163++;
            class22.field519.method1214(6, 0);
            class22.field519.method824(23656, var2);
            class22.field519.method800(-10255, var4);
            class22.field519.method826(112, var3);
            class81.field2018 = 0;
            class157.field3611 = class132.method1041(true, var3);
            class22.field550 = var2;
        }
        if (var5 == 43 || var5 == 1004) {
            class42.method328(126, var3, var2, var4, class80.field1995[arg1]);
        }
        if (var5 == 25) {
            class1 var32 = class81.field2016[var4];
            if (var32 != null) {
                class78.method634(class107.field2640.field827[0], 0, 1, class107.field2640.field841[0], 2, var32.field841[0], false, 0, var32.field827[0], -107, 0, 1);
                class10.field177 = 0;
                class148.field3369 = class140.field3185;
                class121.field2792 = field3174;
                class69.field1649++;
                class11.field196 = 2;
                class22.field519.method1214(92, 0);
                class22.field519.method845(128, var4);
                class22.field519.method845(128, class23.field564);
                class22.field519.method824(23656, class101.field2469);
                class22.field519.method837(class107.field2634, 8895);
            }
        }
        if (var5 == 29) {
            class1 var33 = class81.field2016[var4];
            if (var33 != null) {
                class78.method634(class107.field2640.field827[0], 0, 1, class107.field2640.field841[0], 2, var33.field841[0], false, 0, var33.field827[0], -93, 0, 1);
                class148.field3369 = class140.field3185;
                class10.field177 = 0;
                class121.field2792 = field3174;
                class11.field196 = 2;
                class112.field2691++;
                class22.field519.method1214(229, 0);
                class22.field519.method824(23656, var4);
            }
        }
        if (var5 == 24) {
            class31.field722++;
            class46.method355((byte) -95, var2, var3, var4);
            class22.field519.method1214(112, 0);
            class22.field519.method800(-10255, class144.field3240 + var3);
            class22.field519.method845(128, class41.field1095 + var2);
            class22.field519.method845(128, var4 >> 14 & 0x7FFF);
        }
        if (var5 == 7) {
            class1 var34 = class81.field2016[var4];
            if (var34 != null) {
                class78.method634(class107.field2640.field827[0], 0, 1, class107.field2640.field841[0], 2, var34.field841[0], false, 0, var34.field827[0], -38, 0, 1);
                class93.field2292++;
                class148.field3369 = class140.field3185;
                class11.field196 = 2;
                class121.field2792 = field3174;
                class10.field177 = 0;
                class22.field519.method1214(7, 0);
                class22.field519.method845(128, var4);
            }
        }
        if (var5 == 6 && class46.method355((byte) -84, var2, var3, var4)) {
            class22.field519.method1214(108, 0);
            class22.field519.method811(true, class144.field3240 + var3);
            class22.field519.method845(128, class41.field1095 + var2);
            class13.field234++;
            class22.field519.method834((byte) 124, class107.field2634);
            class22.field519.method800(-10255, class23.field564);
            class22.field519.method845(128, class101.field2469);
            class22.field519.method824(23656, var4 >> 14 & 0x7FFF);
        }
        if (var5 == 8) {
            class53 var35 = class5.field83[var4];
            if (var35 != null) {
                class28.field654++;
                class78.method634(class107.field2640.field827[0], 0, 1, class107.field2640.field841[0], 2, var35.field841[0], false, 0, var35.field827[0], -68, 0, 1);
                class148.field3369 = class140.field3185;
                class10.field177 = 0;
                class121.field2792 = field3174;
                class11.field196 = 2;
                class22.field519.method1214(126, 0);
                class22.field519.method845(128, var4);
            }
        }
        if (var5 == 58) {
            class154.field3479++;
            boolean var36 = class78.method634(class107.field2640.field827[0], 0, 0, class107.field2640.field841[0], 2, var2, false, 0, var3, -48, 0, 0);
            if (!var36) {
                class78.method634(class107.field2640.field827[0], 0, 1, class107.field2640.field841[0], 2, var2, false, 0, var3, -59, 0, 1);
            }
            class10.field177 = 0;
            class148.field3369 = class140.field3185;
            class121.field2792 = field3174;
            class11.field196 = 2;
            class22.field519.method1214(205, 0);
            class22.field519.method845(128, var3 + class144.field3240);
            class22.field519.method845(128, class41.field1095 + var2);
            class22.field519.method800(-10255, var4);
        }
        if (var5 == 50) {
            class86.method718(18261);
        }
        if (var5 == 15) {
            class1 var38 = class81.field2016[var4];
            if (var38 != null) {
                class61.field1529++;
                class78.method634(class107.field2640.field827[0], 0, 1, class107.field2640.field841[0], 2, var38.field841[0], false, 0, var38.field827[0], -82, 0, 1);
                class121.field2792 = field3174;
                class10.field177 = 0;
                class148.field3369 = class140.field3185;
                class11.field196 = 2;
                class22.field519.method1214(66, 0);
                class22.field519.method824(23656, var4);
            }
        }
        if (var5 == 30) {
            class132.field3000++;
            class22.field519.method1214(24, 0);
            class22.field519.method826(101, var3);
            class22.field519.method811(true, var2);
            class22.field519.method800(-10255, var4);
            class81.field2018 = 0;
            class157.field3611 = class132.method1041(true, var3);
            class22.field550 = var2;
        }
        if (var5 == 41) {
            class38.field914++;
            class22.field519.method1214(152, 0);
            class22.field519.method819(var3, (byte) -99);
            class40 var39 = class132.method1041(true, var3);
            if (var39.field1019 != null && var39.field1019[0][0] == 5) {
                int var40 = var39.field1019[0][1];
                if (class43.field1158[var40] != var39.field1015[0]) {
                    class43.field1158[var40] = var39.field1015[0];
                    class72.method551((byte) 116, var40);
                }
            }
        }
        if (var5 == 39) {
            class1 var41 = class81.field2016[var4];
            if (var41 != null) {
                class78.method634(class107.field2640.field827[0], 0, 1, class107.field2640.field841[0], 2, var41.field841[0], false, 0, var41.field827[0], -34, 0, 1);
                class86.field2150++;
                class11.field196 = 2;
                class10.field177 = 0;
                class121.field2792 = field3174;
                class148.field3369 = class140.field3185;
                class22.field519.method1214(140, 0);
                class22.field519.method845(128, var4);
            }
        }
        if (var5 == 5) {
            class87.field2167++;
            class22.field519.method1214(51, 0);
            class22.field519.method811(arg0, var2);
            class22.field519.method800(-10255, var4);
            class22.field519.method834((byte) -76, var3);
            class81.field2018 = 0;
            class157.field3611 = class132.method1041(true, var3);
            class22.field550 = var2;
        }
        if (var5 == 1) {
            class124.field2849++;
            boolean var42 = class78.method634(class107.field2640.field827[0], 0, 0, class107.field2640.field841[0], 2, var2, false, 0, var3, -31, 0, 0);
            if (!var42) {
                class78.method634(class107.field2640.field827[0], 0, 1, class107.field2640.field841[0], 2, var2, false, 0, var3, -21, 0, 1);
            }
            class11.field196 = 2;
            class10.field177 = 0;
            class121.field2792 = field3174;
            class148.field3369 = class140.field3185;
            class22.field519.method1214(215, 0);
            class22.field519.method824(23656, class23.field564);
            class22.field519.method824(23656, class101.field2469);
            class22.field519.method845(128, var4);
            class22.field519.method837(class107.field2634, 8895);
            class22.field519.method800(-10255, class41.field1095 + var2);
            class22.field519.method811(true, class144.field3240 + var3);
        }
        if (var5 == 51) {
            class1 var44 = class81.field2016[var4];
            if (var44 != null) {
                class78.method634(class107.field2640.field827[0], 0, 1, class107.field2640.field841[0], 2, var44.field841[0], false, 0, var44.field827[0], -86, 0, 1);
                class11.field196 = 2;
                class10.field177 = 0;
                class148.field3369 = class140.field3185;
                class121.field2792 = field3174;
                class157.field3589++;
                class22.field519.method1214(38, 0);
                class22.field519.method824(23656, var4);
            }
        }
        if (var5 == 4) {
            boolean var45 = class78.method634(class107.field2640.field827[0], 0, 0, class107.field2640.field841[0], 2, var2, false, 0, var3, -62, 0, 0);
            class129.field2947++;
            if (!var45) {
                class78.method634(class107.field2640.field827[0], 0, 1, class107.field2640.field841[0], 2, var2, false, 0, var3, -125, 0, 1);
            }
            class10.field177 = 0;
            class148.field3369 = class140.field3185;
            class11.field196 = 2;
            class121.field2792 = field3174;
            class22.field519.method1214(132, 0);
            class22.field519.method845(128, class41.field1095 + var2);
            class22.field519.method811(true, var3 + class144.field3240);
            class22.field519.method800(-10255, var4);
        }
        if (var5 == 10) {
            class53 var47 = class5.field83[var4];
            if (var47 != null) {
                class78.method634(class107.field2640.field827[0], 0, 1, class107.field2640.field841[0], 2, var47.field841[0], false, 0, var47.field827[0], -23, 0, 1);
                class35.field873++;
                class10.field177 = 0;
                class121.field2792 = field3174;
                class148.field3369 = class140.field3185;
                class11.field196 = 2;
                class22.field519.method1214(167, 0);
                class22.field519.method845(128, var4);
            }
        }
        if (class155.field3546 != 0) {
            class155.field3546 = 0;
            class12.method79(-30833, class132.method1041(true, class107.field2634));
        }
        if (class1.field17) {
            class101.method795(!arg0);
        }
        if (class157.field3611 != null && class81.field2018 == 0) {
            class12.method79(-30833, class157.field3611);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILkb;)V")
    public static final void method1086(int arg0, class71 arg1) {
        arg1.field1723 = false;
        if (arg1.field1724 != null) {
            arg1.field1724.field2289 = 0;
        }
        field3162++;
        for (class71 var2 = arg1.method87(); var2 != null; var2 = arg1.method109()) {
            method1086(116, var2);
        }
        int var3 = 27 % ((45 - arg0) / 47);
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lie;Lie;IDI)V")
    public class139(class61 arg0, class61 arg1, int arg2, double arg3, int arg4) {
        this.field3167 = arg1;
        this.field3169 = arg3;
        this.field3170 = arg2;
        this.field3171 = arg4;
        this.field3165 = this.field3170;
        int[] var7 = arg0.method480((byte) -64, 0);
        int var8 = var7.length;
        this.field3150 = new class126[arg0.method479(0, (byte) -98)];
        for (int var9 = 0; var9 < var8; var9++) {
            class103 var10 = new class103(arg0.method473((byte) 118, 0, var7[var9]));
            this.field3150[var7[var9]] = new class126(var10);
        }
    }
}
