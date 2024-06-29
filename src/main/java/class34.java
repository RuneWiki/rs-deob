import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class34 extends class196 {

    @OriginalMember(owner = "client!f", name = "U", descriptor = "Z")
    private boolean field501 = true;

    @OriginalMember(owner = "client!f", name = "ab", descriptor = "Z")
    private boolean field507 = true;

    @OriginalMember(owner = "client!f", name = "Y", descriptor = "Ldf;")
    private static class51 field505 = class46.method233("Loading textures )2 ", 100);

    @OriginalMember(owner = "client!f", name = "V", descriptor = "Ldf;")
    public static class51 field502 = class46.method233(":", 100);

    @OriginalMember(owner = "client!f", name = "eb", descriptor = "[I")
    public static int[] field511 = new int[256];

    @OriginalMember(owner = "client!f", name = "fb", descriptor = "[Ljd;")
    public static class83[] field512 = new class83[32768];

    @OriginalMember(owner = "client!f", name = "Z", descriptor = "I")
    public static int field506 = 3353893;

    @OriginalMember(owner = "client!f", name = "gb", descriptor = "Ldf;")
    public static class51 field513 = field505;

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!f", name = "S", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!f", name = "T", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!f", name = "W", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!f", name = "X", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!f", name = "cb", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!f", name = "db", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!f", name = "R", descriptor = "Z")
    public static boolean field498;

    @OriginalMember(owner = "client!f", name = "bb", descriptor = "[I")
    public static int[] field508;

    @OriginalMember(owner = "client!f", name = "hb", descriptor = "[Ljg;")
    public static class158[] field514;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        ++field510;
        if (arg2 != 82) {
            this.method45(30, -27);
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field3291 = ~arg1.method897(-83) == -2;
                }
            } else {
                this.field501 = arg1.method897(-113) == 1;
            }
        } else {
            this.field507 = arg1.method897(-25) == 1;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([BI[Lkf;IBZ)V")
    public static final void method167(byte[] arg0, int arg1, class170[] arg2, int arg3, byte arg4, boolean arg5) {
        class121 var6 = new class121(arg0);
        if (arg4 < 93) {
            field506 = -113;
        }
        ++field509;
        int var7 = -1;
        while (true) {
            int var8 = var6.method907(122);
            if (~var8 == -1) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method877((byte) -125);
                if (~var10 == -1) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = 63 & var9;
                int var12 = var9 >> 12;
                int var13 = var6.method897(-88);
                int var14 = (4044 & var9) >> 6;
                int var15 = var13 >> 2;
                int var16 = 3 & var13;
                int var17 = arg3 + var14;
                int var18 = arg1 + var11;
                if (var17 > 0 && ~var18 < -1 && ~var17 > -104 && ~var18 > -104) {
                    class170 var19 = null;
                    if (!arg5) {
                        int var20 = var12;
                        if (~(2 & class160.field2626[1][var17][var18]) == -3) {
                            var20 = var12 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg2[var20];
                        }
                    }
                    class188.method1341(var19, var12, 0, var15, var7, !arg5, var18, arg5, var16, var17, var12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(B)V")
    public static void method168(byte arg0) {
        if (arg0 == -45) {
            field505 = null;
            field508 = null;
            field512 = null;
            field511 = null;
            field514 = null;
            field502 = null;
            field513 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZIZII)V")
    public static final void method169(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5) {
        ++class182.field2994;
        if (!arg3) {
            class49.method256(true, (byte) -126);
            class40.method201(true, 64);
            class49.method256(false, (byte) -93);
        }
        class40.method201(false, 64);
        ++field500;
        if (!arg3) {
            class23.method123((byte) 125);
        }
        class237.method1640(-26948);
        if (~class201.field3361 == -2) {
            int var6 = class192.field3211;
            if (~var6 > ~(class62.field1009 / 256)) {
                var6 = class62.field1009 / 256;
            }
            int var7 = 2047 & class215.field3736 + class120.field1993;
            if (class64.field1049[4] && ~(class140.field2356[4] + 128) < ~var6) {
                var6 = class140.field2356[4] + 128;
            }
            class217.method1494(class170.field2784, class118.field1977, true, var6 * 3 + 600, var7, -50 + class207.method1424(class257.field4496, class44.field706.field4319, (byte) 126, class44.field706.field4348), arg0, var6);
        }
        int var8 = class209.field3488;
        int var9 = class120.field2001;
        int var10 = class144.field2408;
        int var11 = class128.field2143;
        int var12 = class107.field1763;
        for (int var13 = 0; ~var13 > -6; ++var13) {
            if (class64.field1049[var13]) {
                int var19 = (int) ((double) (-class211.field3504[var13]) + (double) (class211.field3504[var13] * 2 + 1) * Math.random() + Math.sin((double) class76.field1217[var13] / 100.0D * (double) class169.field2744[var13]) * (double) class140.field2356[var13]);
                if (~var13 == -3) {
                    class144.field2408 += var19;
                }
                if (~var13 == -2) {
                    class120.field2001 += var19;
                }
                if (var13 == 4) {
                    class107.field1763 += var19;
                    if (~class107.field1763 > -129) {
                        class107.field1763 = 128;
                    }
                    if (class107.field1763 > 383) {
                        class107.field1763 = 383;
                    }
                }
                if (~var13 == -1) {
                    class209.field3488 += var19;
                }
                if (var13 == 3) {
                    class128.field2143 = 2047 & class128.field2143 - -var19;
                }
            }
        }
        class116.method848(-119);
        class59.method390(arg2, arg4, arg2 + arg5, arg0 + arg4);
        class73.method527();
        if (!class90.field1498 && ~class264.field4616 <= ~arg2 && ~class264.field4616 > ~(arg2 + arg5) && ~arg4 >= ~class191.field3203 && class191.field3203 < arg0 + arg4) {
            class210.field3490 = 0;
            int var14 = class42.field676;
            class258.field4505 = true;
            int var15 = class5.field39;
            class107.field1755 = (-arg2 + class264.field4616) * (-var14 + var15) / arg5 + var14;
            int var16 = class188.field3154;
            int var17 = class236.field4116;
            class8.field81 = (-arg4 + class191.field3203) * (-var16 + var17) / arg0 + var16;
        } else {
            class258.field4505 = false;
            class210.field3490 = 0;
        }
        class190.method1361(205);
        byte var18 = ~class85.method655(-18901) != -3 ? 1 : (byte) class182.field2994;
        class59.method393(arg2, arg4, arg5, arg0, 0);
        class41.method207(class209.field3488, class120.field2001, class144.field2408, class107.field1763, class128.field2143, class92.field1522, class69.field1119, class109.field1855, class79.field1262, class8.field83, class75.field1215, class257.field4496 + 1, var18, class44.field706.field4319 >> 7, class44.field706.field4348 >> 7);
        class190.method1361(205);
        class9.method43();
        class63.method423(arg2, arg4, arg5, 256, (byte) -119, 256, arg0);
        class53.method335(256, arg0, arg5, 256, 72, arg2, arg4);
        ((class66) class73.field1166).method455(class225.field3945, 255);
        class46.method237(arg0, arg5, arg4, arg2, (byte) 27);
        class120.field2001 = var9;
        class107.field1763 = var12;
        class128.field2143 = var11;
        class144.field2408 = var10;
        class209.field3488 = var8;
        if (class49.field782 && class160.method1138(true, true, false) == 0) {
            class49.field782 = false;
        }
        if (class49.field782) {
            class59.method393(arg2, arg4, arg5, arg0, 0);
            class164.method1155(class156.field2569, false, 6);
        }
        if (arg1) {
            if (!arg3 && !class49.field782 && !class90.field1498 && class264.field4616 >= arg2 && arg2 + arg5 > class264.field4616 && ~class191.field3203 <= ~arg4 && ~class191.field3203 > ~(arg0 + arg4)) {
                class233.method1619(class191.field3203, arg4, class264.field4616, 0, arg0, arg5, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "f", descriptor = "(I)Z")
    public static final boolean method170(int arg0) {
        ++field499;
        int var1 = -89 % ((32 - arg0) / 61);
        return class234.field4104;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(BI)[[I")
    public final int[][] method46(byte arg0, int arg1) {
        int[][] var3 = super.field3285.method1548(arg1, (byte) -64);
        if (super.field3285.field3963) {
            int[][] var4 = this.method1387(89, 0, !this.field501 ? arg1 : -arg1 + class214.field3717);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field507) {
                for (int var11 = 0; ~var11 > ~class49.field767; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var7[var11];
                    var10[var11] = var6[var11];
                }
            } else {
                for (int var12 = 0; ~class49.field767 < ~var12; ++var12) {
                    var8[var12] = var5[-var12 + class135.field2245];
                    var9[var12] = var7[-var12 + class135.field2245];
                    var10[var12] = var6[-var12 + class135.field2245];
                }
            }
        }
        if (arg0 != 11) {
            this.method46((byte) -85, 35);
        }
        ++field503;
        return var3;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method171(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 < -113) {
            for (int var9 = 0; class259.field4530.field2337 > var9; ++var9) {
                int var10 = class46.field736 + -1 + class85.field1433 + -class259.field4530.field2338[var9];
                int var11 = arg6 - -((var10 - arg0) * (-arg6 + arg8) / (arg3 - arg0));
                int var12 = class259.field4530.field2341[var9] + -class107.field1764;
                int var13 = 16777215;
                class91 var14 = null;
                int var15 = arg2 - -((arg5 - arg2) * (var12 - arg4) / (-arg4 + arg7));
                int var16 = class259.field4530.method1012(var9, (byte) -73);
                if (~var16 == -1) {
                    if ((double) class79.field1261 == 3.0D) {
                        var14 = class49.field786;
                    }
                    if ((double) class79.field1261 == 4.0D) {
                        var14 = class233.field4054;
                    }
                    if ((double) class79.field1261 == 6.0D) {
                        var14 = class80.field1315;
                    }
                    if ((double) class79.field1261 == 8.0D) {
                        var14 = class31.field457;
                    }
                }
                if (~var16 == -2) {
                    if ((double) class79.field1261 == 3.0D) {
                        var14 = class80.field1315;
                    }
                    if ((double) class79.field1261 == 4.0D) {
                        var14 = class31.field457;
                    }
                    if ((double) class79.field1261 == 6.0D) {
                        var14 = class70.field1126;
                    }
                    if ((double) class79.field1261 == 8.0D) {
                        var14 = class147.field2467;
                    }
                }
                if (~var16 == -3) {
                    var13 = 16755200;
                    if ((double) class79.field1261 == 3.0D) {
                        var14 = class70.field1126;
                    }
                    if ((double) class79.field1261 == 4.0D) {
                        var14 = class147.field2467;
                    }
                    if ((double) class79.field1261 == 6.0D) {
                        var14 = class121.field2051;
                    }
                    if ((double) class79.field1261 == 8.0D) {
                        var14 = class13.field199;
                    }
                }
                if (~class259.field4530.field2328[var9] != 0) {
                    var13 = class259.field4530.field2328[var9];
                }
                if (var14 != null) {
                    class51[] var17 = new class51[class259.field4530.field2342[var9].method296(60, false) + 1];
                    class4.field34.method1323(class259.field4530.field2342[var9], (int[]) null, var17);
                    int var18 = var17.length;
                    int var19 = var11 - (var18 - 1) * var14.method692() / 2;
                    int var20 = var19 + var14.method686() / 2;
                    for (int var21 = 0; var21 < var18; ++var21) {
                        class51 var22 = ~(var18 + -1) == ~var21 ? var17[var21] : var17[var21].method269((byte) -74, 0, var17[var21].method293(false) - 4);
                        var14.method691(var22, var15, var20, var13, true);
                        var20 += var14.method692();
                    }
                }
            }
            ++field497;
        }
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        if (arg1 != 10565) {
            field512 = null;
        }
        int[] var3 = super.field3274.method1476(true, arg0);
        ++field504;
        if (super.field3274.field3741) {
            int[] var4 = this.method1390(!this.field501 ? arg0 : -arg0 + class214.field3717, 0, -80);
            if (this.field507) {
                for (int var5 = 0; ~var5 > ~class49.field767; ++var5) {
                    var3[var5] = var4[-var5 + class135.field2245];
                }
            } else {
                class256.method1744(var4, 0, var3, 0, class49.field767);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
    public class34() {
        super(1, false);
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; ++var2) {
                if (~(var1 & 1) != -2) {
                    var1 >>>= 1;
                } else {
                    var1 = var1 >>> 1 ^ -306674912;
                }
            }
            field511[var0] = var1;
        }
    }
}
