import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class173 {

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public int field3090 = -1;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
    private int field3102 = 128;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
    private int field3101 = 0;

    @OriginalMember(owner = "client!ci", name = "A", descriptor = "Z")
    public boolean field3115 = false;

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
    private int field3110 = 0;

    @OriginalMember(owner = "client!ci", name = "D", descriptor = "I")
    private int field3117 = 0;

    @OriginalMember(owner = "client!ci", name = "E", descriptor = "I")
    private int field3118 = 128;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "Llc;")
    public static class143 field3104 = null;

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "I")
    public static int field3112 = 0;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "Llc;")
    public static class143 field3091 = class66.method374("rot:", -1);

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "Llc;")
    public static class143 field3111 = class66.method374(" <col=00ff80>", -1);

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
    public int field3109;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!ci", name = "B", descriptor = "I")
    private int field3116;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "[I")
    public static int[] field3107;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "[I")
    public static int[] field3108;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "[S")
    private short[] field3089;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "[S")
    private short[] field3099;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "[S")
    public static short[] field3103;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "[S")
    private short[] field3106;

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "[S")
    private short[] field3114;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIIIIBI)V")
    public static final void method1134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        if (arg3 == arg4 && arg1 == arg9 && arg0 == arg2 && arg5 == arg6) {
            class110.method663(arg7, arg3, (byte) 69, arg0, arg5, arg9);
        } else {
            int var10 = arg3;
            int var11 = arg9;
            int var12 = arg4 * 3;
            int var13 = arg3 * 3;
            int var14 = arg1 * 3;
            int var15 = arg2 * 3;
            int var16 = arg9 * 3;
            int var17 = arg6 * 3;
            int var18 = var15 + var13 - var12 - var12;
            int var19 = var14 + arg5 - arg9 - var17;
            int var20 = var12 - var13;
            int var21 = var16 + var17 - var14 - var14;
            int var22 = var12 + arg0 - arg3 - var15;
            int var23 = var14 - var16;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var18 * var25;
                int var27 = var24 * var25 >> 12;
                int var28 = var22 * var27;
                int var29 = var19 * var27;
                int var30 = var21 * var25;
                int var31 = var23 * var24;
                int var32 = (var29 + var30 + var31 >> 12) + arg9;
                int var33 = var20 * var24;
                int var34 = (var26 + var33 + var28 >> 12) + arg3;
                class110.method663(arg7, var10, (byte) 111, var34, var32, var11);
                var10 = var34;
                var11 = var32;
            }
        }
        if (arg8 != -128) {
            method1144(103);
        }
        field3094++;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIILlc;Llc;Llc;)V")
    public static final void method1135(int arg0, int arg1, int arg2, class143 arg3, class143 arg4, class143 arg5) {
        field3092++;
        if (arg1 != 3) {
            method1134(35, 34, 10, 125, -68, 58, -3, 17, (byte) -51, 116);
        }
        for (int var6 = 99; var6 > 0; var6--) {
            class208.field3827[var6] = class208.field3827[var6 - 1];
            class184.field3351[var6] = class184.field3351[var6 - 1];
            class159.field2885[var6] = class159.field2885[var6 - 1];
            class48.field932[var6] = class48.field932[var6 - 1];
            class133.field2324[var6] = class133.field2324[var6 - 1];
        }
        class208.field3827[0] = arg2;
        class133.field2324[0] = arg0;
        class92.field1652 = class13.field249;
        class214.field3957++;
        class184.field3351[0] = arg4;
        class159.field2885[0] = arg5;
        class48.field932[0] = arg3;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lgf;B)V")
    public static final void method1136(class7 arg0, byte arg1) {
        class49.field959 = arg0.method55(-1, class17.field309);
        if (arg1 < 22) {
            field3091 = null;
        }
        field3095++;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)Lhg;")
    public final class150 method1137(int arg0, int arg1) {
        field3097++;
        class150 var3 = (class150) class124.field2168.method826((long) this.field3109, false);
        if (var3 == null) {
            class94 var4 = class94.method550(class97.field1777, this.field3116, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field3114 != null) {
                for (int var5 = 0; var5 < this.field3114.length; var5++) {
                    var4.method545(this.field3114[var5], this.field3099[var5]);
                }
            }
            if (this.field3106 != null) {
                for (int var6 = 0; var6 < this.field3106.length; var6++) {
                    var4.method528(this.field3106[var6], this.field3089[var6]);
                }
            }
            var3 = var4.method553(this.field3101 + 64, this.field3110 + 850, -30, -50, -30);
            class124.field2168.method827(-3, var3, (long) this.field3109);
        }
        if (arg0 != 29263) {
            this.method1138((class190) null, -83, (byte) -84);
        }
        class150 var7;
        if (this.field3090 == -1 || arg1 == -1) {
            var7 = var3.method979(true, true);
        } else {
            var7 = class164.method1081(this.field3090, -21331).method621(arg1, -99, var3);
        }
        if (this.field3118 != 128 || this.field3102 != 128) {
            var7.method989(this.field3118, this.field3102, this.field3118);
        }
        if (this.field3117 != 0) {
            if (this.field3117 == 90) {
                var7.method992();
            }
            if (this.field3117 == 180) {
                var7.method990();
            }
            if (this.field3117 == 270) {
                var7.method981();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lh;IB)V")
    private final void method1138(class190 arg0, int arg1, byte arg2) {
        field3098++;
        if (arg2 <= 98) {
            method1145(36);
        }
        if (arg1 == 1) {
            this.field3116 = arg0.method1275(128);
        } else if (arg1 == 2) {
            this.field3090 = arg0.method1275(128);
        } else if (arg1 == 4) {
            this.field3118 = arg0.method1275(128);
        } else if (arg1 == 5) {
            this.field3102 = arg0.method1275(128);
        } else if (arg1 == 6) {
            this.field3117 = arg0.method1275(128);
        } else if (arg1 == 7) {
            this.field3101 = arg0.method1265(118);
        } else if (arg1 == 8) {
            this.field3110 = arg0.method1265(119);
        } else if (arg1 == 9) {
            this.field3115 = true;
        } else if (arg1 == 40) {
            int var6 = arg0.method1265(113);
            this.field3114 = new short[var6];
            this.field3099 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3114[var7] = (short) arg0.method1275(128);
                this.field3099[var7] = (short) arg0.method1275(128);
            }
        } else if (arg1 == 41) {
            int var4 = arg0.method1265(125);
            this.field3106 = new short[var4];
            this.field3089 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3106[var5] = (short) arg0.method1275(128);
                this.field3089[var5] = (short) arg0.method1275(128);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIII)V")
    public static final void method1139(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 128) {
            field3111 = null;
        }
        field3100++;
        class166 var4 = class262.method1746(103, arg3, 11);
        var4.method1097((byte) -74);
        var4.field2978 = arg0;
        var4.field2979 = arg2;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public static final void method1140(byte arg0) {
        for (int var1 = 0; var1 < class268.field4809; var1++) {
            int var2 = class135.field2379[var1];
            class32 var3 = class6.field97[var2];
            int var4 = class161.field2902.method1265(116);
            if ((var4 & 0x2) != 0) {
                var4 += class161.field2902.method1265(122) << 8;
            }
            class277.method1829(var2, var4, (byte) 53, var3);
        }
        if (arg0 > -93) {
            field3111 = null;
        }
        field3096++;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILh;)V")
    public final void method1141(int arg0, class190 arg1) {
        field3113++;
        while (true) {
            int var3 = arg1.method1265(126);
            if (var3 == 0) {
                if (arg0 == -1) {
                    return;
                } else {
                    field3107 = null;
                    return;
                }
            }
            this.method1138(arg1, var3, (byte) 102);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method1142(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class182.field3256++;
        class212.field3947 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class123.field2161; var12 < class176.field3159; var12++) {
            class120[][] var38 = class7.field122[var12];
            for (int var39 = class123.field2158; var39 < class227.field4102; var39++) {
                for (int var40 = class56.field1094; var40 < class59.field1138; var40++) {
                    class120 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class168.field3007[var39 + class208.field3824 - class139.field2430][var40 + class208.field3824 - class126.field2227] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field2133 = true;
                            var41.field2115 = true;
                            if (var41.field2134 > 0) {
                                var41.field2137 = true;
                            } else {
                                var41.field2137 = false;
                            }
                            class212.field3947++;
                        } else {
                            var41.field2133 = false;
                            var41.field2115 = false;
                            var41.field2140 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field2131 != null) {
                                    class57 var42 = var41.field2131;
                                    var42.field1105.method167(0, var12, var42.field1102, var42.field1097, var42.field1101);
                                    if (var42.field1099 != null) {
                                        var42.field1099.method167(0, var12, var42.field1102, var42.field1097, var42.field1101);
                                    }
                                }
                                if (var41.field2124 != null) {
                                    class63 var43 = var41.field2124;
                                    var43.field1182.method167(var43.field1202, var12, var43.field1199, var43.field1188, var43.field1194);
                                    if (var43.field1190 != null) {
                                        var43.field1190.method167(var43.field1202, var12, var43.field1199, var43.field1188, var43.field1194);
                                    }
                                }
                                if (var41.field2129 != null) {
                                    class140 var44 = var41.field2129;
                                    var44.field2445.method167(0, var12, var44.field2447, var44.field2443, var44.field2441);
                                }
                                if (var41.field2144 != null) {
                                    for (int var45 = 0; var45 < var41.field2134; var45++) {
                                        class211 var46 = var41.field2144[var45];
                                        var46.field3916.method167(var46.field3932, var12, var46.field3927, var46.field3929, var46.field3930);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class83.field1503 == class192.field3535;
        for (int var14 = class123.field2161; var14 < class176.field3159; var14++) {
            class120[][] var27 = class7.field122[var14];
            for (int var28 = -class208.field3824; var28 <= 0; var28++) {
                int var29 = class139.field2430 + var28;
                int var30 = class139.field2430 - var28;
                if (var29 >= class123.field2158 || var30 < class227.field4102) {
                    for (int var31 = -class208.field3824; var31 <= 0; var31++) {
                        int var32 = class126.field2227 + var31;
                        int var33 = class126.field2227 - var31;
                        if (var29 >= class123.field2158) {
                            if (var32 >= class56.field1094) {
                                class120 var34 = var27[var29][var32];
                                if (var34 != null && var34.field2133) {
                                    class141.method846(var34, true);
                                }
                            }
                            if (var33 < class59.field1138) {
                                class120 var35 = var27[var29][var33];
                                if (var35 != null && var35.field2133) {
                                    class141.method846(var35, true);
                                }
                            }
                        }
                        if (var30 < class227.field4102) {
                            if (var32 >= class56.field1094) {
                                class120 var36 = var27[var30][var32];
                                if (var36 != null && var36.field2133) {
                                    class141.method846(var36, true);
                                }
                            }
                            if (var33 < class59.field1138) {
                                class120 var37 = var27[var30][var33];
                                if (var37 != null && var37.field2133) {
                                    class141.method846(var37, true);
                                }
                            }
                        }
                        if (class212.field3947 == 0) {
                            if (!var13) {
                                class133.field2328 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class123.field2161; var15 < class176.field3159; var15++) {
            class120[][] var16 = class7.field122[var15];
            for (int var17 = -class208.field3824; var17 <= 0; var17++) {
                int var18 = class139.field2430 + var17;
                int var19 = class139.field2430 - var17;
                if (var18 >= class123.field2158 || var19 < class227.field4102) {
                    for (int var20 = -class208.field3824; var20 <= 0; var20++) {
                        int var21 = class126.field2227 + var20;
                        int var22 = class126.field2227 - var20;
                        if (var18 >= class123.field2158) {
                            if (var21 >= class56.field1094) {
                                class120 var23 = var16[var18][var21];
                                if (var23 != null && var23.field2133) {
                                    class141.method846(var23, false);
                                }
                            }
                            if (var22 < class59.field1138) {
                                class120 var24 = var16[var18][var22];
                                if (var24 != null && var24.field2133) {
                                    class141.method846(var24, false);
                                }
                            }
                        }
                        if (var19 < class227.field4102) {
                            if (var21 >= class56.field1094) {
                                class120 var25 = var16[var19][var21];
                                if (var25 != null && var25.field2133) {
                                    class141.method846(var25, false);
                                }
                            }
                            if (var22 < class59.field1138) {
                                class120 var26 = var16[var19][var22];
                                if (var26 != null && var26.field2133) {
                                    class141.method846(var26, false);
                                }
                            }
                        }
                        if (class212.field3947 == 0) {
                            if (!var13) {
                                class133.field2328 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class133.field2328 = false;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(B)V")
    public static final void method1143(byte arg0) {
        class144.field2572.method823(true);
        if (arg0 != -37) {
            field3111 = null;
        }
        field3105++;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method1144(int arg0) {
        field3108 = null;
        field3091 = null;
        field3107 = null;
        if (arg0 != -50) {
            method1142(74, -106, 120, (byte[][][]) null, -5, (byte) -117, 15, -10);
        }
        field3111 = null;
        field3103 = null;
        field3104 = null;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V")
    public static final void method1145(int arg0) {
        field3093++;
        if (arg0 != 3) {
            return;
        }
        int var1 = class128.field2271;
        int var2 = class24.field417;
        int var3 = class52.field1023;
        int var4 = class176.field3167;
        int var5 = 6116423;
        class260.method1726(var1, var2, var3, var4, var5);
        class260.method1726(var1 + 1, var2 + 1, var3 - 2, 16, 0);
        class260.method1729(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
        class239.field4326.method1319(class130.field2307, var1 + 3, var2 - -14, var5, -1);
        int var6 = class158.field2859;
        int var7 = class235.field4292;
        for (int var8 = 0; var8 < class257.field4625; var8++) {
            int var9 = var2 + ((-var8 + -1 + class257.field4625) * 15) + 31;
            int var10 = 16777215;
            if (var7 > var1 && var7 < var1 + var3 && var6 > (var9 - 13) && (var9 + 3) > var6) {
                var10 = 16776960;
            }
            class239.field4326.method1319(class263.method1752(arg0 + 7018, var8), var1 + 3, var9, var10, 0);
        }
        class186.method1216(class52.field1023, class24.field417, -128, class128.field2271, class176.field3167);
    }
}
