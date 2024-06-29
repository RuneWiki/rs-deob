import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class60 extends class28 {

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "[Lti;")
    public class213[] field1278;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "Lqe;")
    public static class179 field1279 = class206.method1380("", (byte) -127);

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "[I")
    public static int[] field1285 = new int[32];

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "Lqe;")
    private static class179 field1277 = class206.method1380("Allocating memory", (byte) 2);

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "Lqe;")
    public static class179 field1282 = field1277;

    @OriginalMember(owner = "client!fe", name = "G", descriptor = "Lqe;")
    private static class179 field1287;

    @OriginalMember(owner = "client!fe", name = "J", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "Lqe;")
    public static class179 field1288;

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "Lqe;")
    public static class179 field1289;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!fe", name = "F", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!fe", name = "K", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
    public static final void method404(int arg0) {
        if (arg0 > 30) {
            class81.field1564.method70((byte) -62, 74);
            class46.field996++;
            field1281++;
            class81.field1564.method1232(0L, (byte) 124);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB[Ldg;III[BIII)V")
    public static final void method405(int arg0, byte arg1, class40[] arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9) {
        field1283++;
        class185 var10 = new class185(arg6);
        int var11 = -1;
        if (arg1 > -59) {
            method405(69, (byte) 45, null, -113, -37, -9, null, 8, -113, -97);
        }
        while (true) {
            int var12 = var10.method1215((byte) 93);
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method1215((byte) 93);
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var10.method1243(3);
                int var18 = var17 & 0x3;
                int var19 = var17 >> 2;
                int var20 = var13 >> 12;
                if (arg0 == var20 && arg3 <= var16 && var16 < arg3 + 8 && var15 >= arg8 && var15 < arg8 + 8) {
                    class134 var21 = class114.method735((byte) -77, var11);
                    int var22 = arg5 + class61.method412(var16 & 0x7, -1271474964, var21.field2430, var18, var21.field2442, arg7, var15 & 0x7);
                    int var23 = class195.method1307(var16 & 0x7, (byte) 98, arg7, var21.field2430, var15 & 0x7, var18, var21.field2442) + arg9;
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        int var24 = arg4;
                        if ((class9.field265[1][var22][var23] & 0x2) == 2) {
                            var24 = arg4 - 1;
                        }
                        class40 var25 = null;
                        if (var24 >= 0) {
                            var25 = arg2[var24];
                        }
                        class111.method719(arg4, class180.field3307, arg4, true, var22, (byte) 80, var23, var19, var11, arg7 + var18 & 0x3, var25);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)V")
    public static final void method406(int arg0, int arg1, int arg2) {
        field1286++;
        if (class113.field2118 < 2 && class172.field3086 == 0 && !class163.field2940) {
            return;
        }
        class179 var3;
        if (class172.field3086 == 1 && class113.field2118 < 2) {
            var3 = class78.method502((byte) -115, new class179[] { class232.field4285, class186.field3463, class114.field2139, class233.field4298 });
        } else if (class163.field2940 && class113.field2118 < 2) {
            var3 = class78.method502((byte) -117, new class179[] { class195.field3630, class186.field3463, class187.field3487, class233.field4298 });
        } else {
            var3 = class215.method1411(-17116, class113.field2118 - 1);
        }
        if (class113.field2118 > 2) {
            var3 = class78.method502((byte) -120, new class179[] { var3, class220.field4074, class148.method949((byte) -14, class113.field2118 - 2), class69.field1381 });
        }
        int var4 = class71.field1422.method1011(var3, arg1 + 4, arg0 + arg2, 16777215, 0, class12.field312, class93.field1754);
        class143.method900(class71.field1422.method1005(var3) + var4, 15, (byte) 115, arg2, arg1 + 4);
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(B)V")
    public static void method407(byte arg0) {
        field1282 = null;
        field1277 = null;
        field1289 = null;
        if (arg0 == 81) {
            field1287 = null;
            field1279 = null;
            field1288 = null;
            field1285 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(B)V")
    public static final void method408(byte arg0) {
        field1284++;
        for (int var1 = 0; var1 < class202.field3742; var1++) {
            int var3 = class74.field1449[var1];
            class188 var4 = class53.field1152[var3];
            int var5 = class36.field789.method1243(3);
            if ((var5 & 0x20) != 0) {
                int var6 = class36.field789.method1252(2);
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var7 = class36.field789.method1243(3);
                if (var4.field3182 == var6 && var6 != -1) {
                    class117 var8 = class239.method1550(var6, (byte) 107);
                    int var9 = var8.field2197;
                    if (var9 == 1) {
                        var4.field3156 = 0;
                        var4.field3140 = var7;
                        var4.field3148 = 0;
                        var4.field3170 = 0;
                        class226.method1481(false, var4.field3198, 15, var4.field3156, var4.field3159, var8);
                    }
                    if (var9 == 2) {
                        var4.field3170 = 0;
                    }
                } else if (var6 == -1 || var4.field3182 == -1 || class239.method1550(var6, (byte) 107).field2228 >= class239.method1550(var4.field3182, (byte) 107).field2228) {
                    var4.field3180 = var4.field3176;
                    var4.field3156 = 0;
                    var4.field3140 = var7;
                    var4.field3148 = 0;
                    var4.field3182 = var6;
                    var4.field3170 = 0;
                    if (var4.field3182 != -1) {
                        class226.method1481(false, var4.field3198, 15, var4.field3156, var4.field3159, class239.method1550(var4.field3182, (byte) 107));
                    }
                }
            }
            if ((var5 & 0x8) != 0) {
                var4.field3154 = class36.field789.method1237(-27);
                int var10 = class36.field789.method1240((byte) -117);
                var4.field3193 = 0;
                if (var4.field3154 == 65535) {
                    var4.field3154 = -1;
                }
                var4.field3138 = var10 >> 16;
                var4.field3192 = 0;
                var4.field3203 = (var10 & 0xFFFF) + class13.field322;
                if (var4.field3203 > class13.field322) {
                    var4.field3192 = -1;
                }
            }
            if ((var5 & 0x10) != 0) {
                int var11 = class36.field789.method1243(3);
                int var12 = class36.field789.method1223(126);
                var4.method1109(var11, (byte) 119, class13.field322, var12);
                var4.field3204 = class13.field322 + 300;
                var4.field3202 = class36.field789.method1202(true);
            }
            if ((var5 & 0x40) != 0) {
                var4.field3149 = class36.field789.method1245(-105);
                var4.field3164 = class36.field789.method1237(91);
            }
            if ((var5 & 0x2) != 0) {
                var4.field3142 = class36.field789.method1252(2);
                if (var4.field3142 == 65535) {
                    var4.field3142 = -1;
                }
            }
            if ((var5 & 0x80) != 0) {
                int var13 = class36.field789.method1243(3);
                int var14 = class36.field789.method1223(118);
                var4.method1109(var13, (byte) 110, class13.field322, var14);
            }
            if ((var5 & 0x1) != 0) {
                var4.field3496 = class152.method979((byte) 15, class36.field789.method1252(2));
                var4.field3168 = var4.field3496.field3317;
                var4.field3194 = var4.field3496.field3326;
                var4.field3178 = var4.field3496.field3303;
                var4.field3129 = var4.field3496.field3316;
                var4.field3130 = var4.field3496.field3350;
                var4.field3173 = var4.field3496.field3314;
                var4.field3133 = var4.field3496.field3357;
                var4.field3172 = var4.field3496.field3335;
                var4.field3199 = var4.field3496.field3323;
            }
            if ((var5 & 0x4) != 0) {
                var4.field3187 = class36.field789.method1242(-108);
                var4.field3137 = 100;
            }
        }
        int var2 = 19 / ((arg0 + 35) / 59);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Leh;Leh;IZ)V")
    public class60(class52 arg0, class52 arg1, int arg2, boolean arg3) {
        class36 var5 = new class36();
        int var6 = arg0.method336((byte) 64, arg2);
        this.field1278 = new class213[var6];
        int[] var7 = arg0.method363(arg2, false);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method342(var7[var8], arg2, (byte) 103);
            class31 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class31 var12 = (class31) var5.method242(16711680); var12 != null; var12 = (class31) var5.method237(10)) {
                if (var12.field671 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method341(var11, -1, 0);
                } else {
                    var13 = arg1.method341(0, -1, var11);
                }
                var10 = new class31(var11, var13);
                var5.method235(-64, var10);
            }
            this.field1278[var7[var8]] = new class213(var9, var10);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)Z")
    public final boolean method410(int arg0, int arg1) {
        field1280++;
        if (arg0 < 81) {
            method405(56, (byte) -25, null, 14, 9, 87, null, -46, 47, 59);
        }
        return this.field1278[arg1].field3966;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1285[var1] = var0 - 1;
            var0 += var0;
        }
        field1287 = class206.method1380("Invalid username or password)3", (byte) -126);
        field1290 = 0;
        field1288 = field1287;
        field1289 = class206.method1380("; version=1; path=)4; domain=", (byte) 1);
    }
}
