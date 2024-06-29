import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class204 extends class67 {

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "[S")
    public short[] field3891;

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "[B")
    public byte[] field3892;

    @OriginalMember(owner = "client!sh", name = "J", descriptor = "[Lla;")
    public class121[] field3897;

    @OriginalMember(owner = "client!sh", name = "I", descriptor = "[B")
    public byte[] field3896;

    @OriginalMember(owner = "client!sh", name = "G", descriptor = "[Ltf;")
    public class213[] field3894;

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "[I")
    private int[] field3889;

    @OriginalMember(owner = "client!sh", name = "L", descriptor = "[B")
    public byte[] field3899;

    @OriginalMember(owner = "client!sh", name = "K", descriptor = "I")
    public int field3898;

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "Li;")
    public static class88 field3886 = class208.method1425(105, "Bitte starten Sie eine Mitgliedschaft");

    @OriginalMember(owner = "client!sh", name = "M", descriptor = "Li;")
    public static class88 field3900 = class208.method1425(105, "Diese Betatest)2Welt ist nur f-Ur eingeladene");

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!sh", name = "F", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!sh", name = "H", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!sh", name = "N", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "Lnb;")
    public static class144 field3885;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "[I")
    public static int[] field3884;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
    public static final void method1397(int arg0) {
        if (arg0 != 0) {
            field3886 = null;
        }
        class118.field2135.method671(arg0 ^ 0x77);
        field3887++;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)Ljj;")
    public static final class108 method1398(int arg0, int arg1, int arg2) {
        class52 var3 = class29.field489[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field962; var4++) {
            class108 var5 = var3.field963[var4];
            if ((var5.field1950 >> 29 & 0x3L) == 2L && var5.field1935 == arg1 && var5.field1938 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)V")
    public static final void method1399(byte arg0) {
        class17 var1 = class43.field732;
        synchronized (class43.field732) {
            class190.field3670++;
            class156.field3018 = class46.field807;
            class28.field471 = class232.field4355;
            class239.field4451 = class170.field3299;
            class36.field625 = class158.field3046;
            class226.field4241 = class46.field833;
            class172.field3341 = class139.field2577;
            class36.field623 = class186.field3633;
            if (arg0 > -82) {
                method1401((byte) -52);
            }
            class158.field3046 = 0;
        }
        field3901++;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1400(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class28.field475 == 0 && !class10.field145) {
            int var7 = class147.field2768;
            class234.field4382++;
            int var8 = class151.field2933;
            int var9 = class58.field1102;
            int var10 = class217.field4057;
            int var11 = (arg0 - arg4) * (var10 - var9) / arg2 + var9;
            int var12 = (arg5 - arg1) * (var8 - var7) / arg3 + var7;
            class98.method687(9746, var12, class4.field54, (short) 10, 0L, class174.field3455, var11);
        }
        field3882++;
        long var13 = -1L;
        for (int var15 = 0; var15 < class161.field3103; var15++) {
            long var16 = class28.field476[var15];
            int var18 = (int) var16 & 0x7F;
            int var19 = (int) var16 >> 7 & 0x7F;
            int var20 = (int) var16 >> 29 & 0x3;
            int var21 = Integer.MAX_VALUE & (int) (var16 >>> 32);
            if (var13 != var16) {
                var13 = var16;
                if (var20 == 2 && class202.method1388(class149.field2909, var18, var19, var16)) {
                    class148 var22 = class190.method1323(var21, -12450);
                    if (var22.field2772 != null) {
                        var22 = var22.method1000((byte) 118);
                    }
                    if (var22 == null) {
                        continue;
                    }
                    if (class28.field475 == 1) {
                        class98.method687(9746, var18, class35.field608, (short) 26, var16, class166.method1142(new class88[] { class78.field1414, class175.field3528, var22.field2775 }, arg6 + 1450689184), var19);
                        class52.field942++;
                    } else if (!class10.field145) {
                        class43.field724++;
                        class88[] var23 = var22.field2818;
                        if (class99.field1809) {
                            var23 = class138.method923(var23, (byte) 72);
                        }
                        if (var23 != null) {
                            for (int var24 = 4; var24 >= 0; var24--) {
                                if (var23[var24] != null) {
                                    short var25 = 0;
                                    class177.field3550++;
                                    if (var24 == 0) {
                                        var25 = 7;
                                    }
                                    if (var24 == 1) {
                                        var25 = 35;
                                    }
                                    if (var24 == 2) {
                                        var25 = 51;
                                    }
                                    if (var24 == 3) {
                                        var25 = 33;
                                    }
                                    if (var24 == 4) {
                                        var25 = 1004;
                                    }
                                    class98.method687(9746, var18, var23[var24], var25, var16, class166.method1142(new class88[] { class17.field259, var22.field2775 }, -3), var19);
                                }
                            }
                        }
                        class98.method687(9746, var18, class65.field1174, (short) 1005, (long) var22.field2833, class166.method1142(new class88[] { class17.field259, var22.field2775 }, -3), var19);
                    } else if ((class115.field2086 & 0x4) == 4) {
                        class15.field231++;
                        class98.method687(9746, var18, class201.field3837, (short) 24, var16, class166.method1142(new class88[] { class28.field464, class175.field3528, var22.field2775 }, -3), var19);
                    }
                }
                if (var20 == 1) {
                    class191 var26 = class225.field4225[var21];
                    if (var26.field3684.field2351 == 1 && (var26.field4138 & 0x7F) == 64 && (var26.field4123 & 0x7F) == 64) {
                        for (int var27 = 0; var27 < class55.field1041; var27++) {
                            class191 var30 = class225.field4225[class25.field402[var27]];
                            if (var30 != null && var26 != var30 && var30.field3684.field2351 == 1 && var26.field4138 == var30.field4138 && var26.field4123 == var30.field4123) {
                                class225.method1515(var30.field3684, class25.field402[var27], 14665, var19, var18);
                            }
                        }
                        for (int var28 = 0; var28 < class55.field1027; var28++) {
                            class44 var29 = class244.field4493[class174.field3430[var28]];
                            if (var29 != null && var26.field4138 == var29.field4138 && var26.field4123 == var29.field4123) {
                                class139.method924(class174.field3430[var28], 31, var18, var19, var29);
                            }
                        }
                    }
                    class225.method1515(var26.field3684, var21, 14665, var19, var18);
                }
                if (var20 == 0) {
                    class44 var31 = class244.field4493[var21];
                    if ((var31.field4138 & 0x7F) == 64 && (var31.field4123 & 0x7F) == 64) {
                        for (int var32 = 0; var32 < class55.field1041; var32++) {
                            class191 var35 = class225.field4225[class25.field402[var32]];
                            if (var35 != null && var35.field3684.field2351 == 1 && var31.field4138 == var35.field4138 && var31.field4123 == var35.field4123) {
                                class225.method1515(var35.field3684, class25.field402[var32], 14665, var19, var18);
                            }
                        }
                        for (int var33 = 0; var33 < class55.field1027; var33++) {
                            class44 var34 = class244.field4493[class174.field3430[var33]];
                            if (var34 != null && var31 != var34 && var31.field4138 == var34.field4138 && var31.field4123 == var34.field4123) {
                                class139.method924(class174.field3430[var33], 31, var18, var19, var34);
                            }
                        }
                    }
                    class139.method924(var21, 31, var18, var19, var31);
                }
                if (var20 == 3) {
                    class248 var36 = class134.field2499[class149.field2909][var18][var19];
                    if (var36 != null) {
                        for (class227 var37 = (class227) var36.method1614((byte) -25); var37 != null; var37 = (class227) var36.method1619((byte) -34)) {
                            int var38 = var37.field4260.field2032;
                            class149 var39 = class71.method472(var38, (byte) -98);
                            if (class28.field475 == 1) {
                                class186.field3642++;
                                class98.method687(9746, var18, class35.field608, (short) 46, (long) var38, class166.method1142(new class88[] { class78.field1414, class34.field581, var39.field2894 }, -3), var19);
                            } else if (!class10.field145) {
                                class126.field2322++;
                                class88[] var40 = var39.field2900;
                                if (class99.field1809) {
                                    var40 = class138.method923(var40, (byte) -123);
                                }
                                for (int var41 = 4; var41 >= 0; var41--) {
                                    if (var40 != null && var40[var41] != null) {
                                        class210.field3990++;
                                        byte var42 = 0;
                                        if (var41 == 0) {
                                            var42 = 5;
                                        }
                                        if (var41 == 1) {
                                            var42 = 22;
                                        }
                                        if (var41 == 2) {
                                            var42 = 41;
                                        }
                                        if (var41 == 3) {
                                            var42 = 57;
                                        }
                                        if (var41 == 4) {
                                            var42 = 3;
                                        }
                                        class98.method687(9746, var18, var40[var41], var42, (long) var38, class166.method1142(new class88[] { class136.field2531, var39.field2894 }, -3), var19);
                                    } else if (var41 == 2) {
                                        class98.method687(arg6 ^ 0xA9881B4F, var18, class231.field4345, (short) 41, (long) var38, class166.method1142(new class88[] { class136.field2531, var39.field2894 }, -3), var19);
                                        class43.field722++;
                                    }
                                }
                                class98.method687(9746, var18, class65.field1174, (short) 1006, (long) var38, class166.method1142(new class88[] { class136.field2531, var39.field2894 }, -3), var19);
                            } else if ((class115.field2086 & 0x1) == 1) {
                                class117.field2120++;
                                class98.method687(9746, var18, class201.field3837, (short) 25, (long) var38, class166.method1142(new class88[] { class28.field464, class34.field581, var39.field2894 }, -3), var19);
                            }
                        }
                    }
                }
            }
        }
        if (arg6 != -1450689187) {
            field3895 = 86;
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(B)V")
    public static final void method1401(byte arg0) {
        field3890++;
        class206.field3922.method671(14);
        if (arg0 >= -67) {
            field3900 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "([IILnj;[B)Z")
    public final boolean method1402(int[] arg0, int arg1, class151 arg2, byte[] arg3) {
        field3893++;
        boolean var5 = true;
        int var6 = 0;
        class213 var7 = null;
        if (arg1 != -1) {
            this.field3892 = null;
        }
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field3889[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method1034(arg1 ^ 0xFFFFFFA2, var9 >> 2, arg0);
                        } else {
                            var7 = arg2.method1037(arg0, 25304, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field3894[var8] = var7;
                        this.field3889[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)V")
    public static final void method1403(int arg0) {
        field3881++;
        if (arg0 >= -111) {
            return;
        }
        if (class181.field3596.toLowerCase().indexOf("microsoft") != -1) {
            class237.field4425[223] = 28;
            class237.field4425[222] = 59;
            class237.field4425[189] = 26;
            class237.field4425[191] = 73;
            class237.field4425[190] = 72;
            class237.field4425[192] = 58;
            class237.field4425[219] = 42;
            class237.field4425[221] = 43;
            class237.field4425[220] = 74;
            class237.field4425[187] = 27;
            class237.field4425[188] = 71;
            class237.field4425[186] = 57;
            return;
        }
        class237.field4425[46] = 72;
        class237.field4425[44] = 71;
        class237.field4425[92] = 74;
        class237.field4425[59] = 57;
        class237.field4425[61] = 27;
        if (class181.field3588 == null) {
            class237.field4425[192] = 58;
            class237.field4425[222] = 59;
        } else {
            class237.field4425[520] = 59;
            class237.field4425[192] = 28;
            class237.field4425[222] = 58;
        }
        class237.field4425[47] = 73;
        class237.field4425[91] = 42;
        class237.field4425[93] = 43;
        class237.field4425[45] = 26;
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(I)V")
    public static void method1404(int arg0) {
        field3886 = null;
        field3900 = null;
        if (arg0 != -12699) {
            method1397(-31);
        }
        field3884 = null;
        field3885 = null;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)I")
    public static int method1405(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
    public class204() {
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(B)V")
    public final void method1406(byte arg0) {
        if (arg0 <= 106) {
            method1398(-39, -118, -117);
        }
        this.field3889 = null;
        field3883++;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "([B)V")
    public class204(byte[] arg0) {
        this.field3891 = new short[128];
        this.field3892 = new byte[128];
        this.field3897 = new class121[128];
        this.field3896 = new byte[128];
        this.field3894 = new class213[128];
        this.field3889 = new int[128];
        this.field3899 = new byte[128];
        class46 var2 = new class46(arg0);
        int var3;
        for (var3 = 0; var2.field842[var2.field831 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method324(87);
        }
        var2.field831++;
        var3++;
        int var6 = var2.field831;
        var2.field831 += var3;
        int var7;
        for (var7 = 0; var2.field842[var2.field831 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method324(52);
        }
        var2.field831++;
        var7++;
        int var10 = var2.field831;
        var2.field831 += var7;
        int var11;
        for (var11 = 0; var2.field842[var2.field831 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method324(27);
        }
        var2.field831++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method347(26119);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var18 <= var16) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        } else {
            var15 = var11;
        }
        class121[] var19 = new class121[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class121 var103 = var19[var20] = new class121();
            int var104 = var2.method347(26119);
            if (var104 > 0) {
                var103.field2218 = new byte[var104 * 2];
            }
            int var105 = var2.method347(26119);
            if (var105 > 0) {
                var103.field2207 = new byte[var105 * 2 + 2];
                var103.field2207[1] = 64;
            }
        }
        int var21 = var2.method347(26119);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var2.method347(26119);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var2.field842[var2.field831 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method324(120);
        }
        var2.field831++;
        var25++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method347(26119);
            this.field3891[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method347(26119);
            this.field3891[var31] = (short) (this.field3891[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var26.length <= var34) {
                    var32 = -1;
                } else {
                    var32 = var26[var34++];
                }
                var33 = var2.method317((byte) -39);
            }
            this.field3891[var35] = (short) (this.field3891[var35] + (class70.method470(2, var33 - 1) << 14));
            this.field3889[var35] = var33;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field3889[var39] != 0) {
                if (var36 == 0) {
                    var38 = var2.field842[var6++] - 1;
                    if (var4.length <= var37) {
                        var36 = -1;
                    } else {
                        var36 = var4[var37++];
                    }
                }
                var36--;
                this.field3892[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field3889[var43] != 0) {
                if (var40 == 0) {
                    if (var41 >= var8.length) {
                        var40 = -1;
                    } else {
                        var40 = var8[var41++];
                    }
                    var42 = var2.field842[var10++] + 16 << 2;
                }
                this.field3899[var43] = (byte) var42;
                var40--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class121 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field3889[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var44 >= var12.length) {
                        var45 = -1;
                    } else {
                        var45 = var12[var44++];
                    }
                }
                this.field3897[var47] = var46;
                var45--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var50 == 0) {
                if (var48 < var26.length) {
                    var50 = var26[var48++];
                } else {
                    var50 = -1;
                }
                if (this.field3889[var51] > 0) {
                    var49 = var2.method347(26119) + 1;
                }
            }
            var50--;
            this.field3896[var51] = (byte) var49;
        }
        this.field3898 = var2.method347(26119) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class121 var100 = var19[var52];
            if (var100.field2218 != null) {
                for (int var101 = 1; var101 < var100.field2218.length; var101 += 2) {
                    var100.field2218[var101] = var2.method324(87);
                }
            }
            if (var100.field2207 != null) {
                for (int var102 = 3; var102 < var100.field2207.length - 2; var102 += 2) {
                    var100.field2207[var102] = var2.method324(71);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method324(105);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method324(57);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class121 var97 = var19[var55];
            if (var97.field2207 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field2207.length; var99 += 2) {
                    var98 = var98 + var2.method347(26119) + 1;
                    var97.field2207[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class121 var94 = var19[var56];
            if (var94.field2218 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field2218.length; var96 += 2) {
                    var95 = var95 + var2.method347(26119) + 1;
                    var94.field2218[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method347(26119);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var57 + var2.method347(26119) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field3896[var61] = (byte) (this.field3896[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62 + 1];
                byte var66 = var22[var62];
                var62 += 2;
                int var67 = (var66 - var59) / 2 + (var66 - var59) * var60;
                for (int var68 = var59; var68 < var66; var68++) {
                    int var69 = class180.method1286(false, var66 - var59, var67);
                    var67 += var65 - var60;
                    this.field3896[var68] = (byte) (this.field3896[var68] * var69 + 32 >> 6);
                }
                var59 = var66;
                var60 = var65;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field3896[var63] = (byte) (this.field3896[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var2.method347(26119);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var70 + var2.method347(26119) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field3899[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field3899[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var24.length > var75) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                var75 += 2;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class180.method1286(false, var79 - var72, var81);
                    int var84 = (this.field3899[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    var81 += var80 - var73;
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field3899[var82] = (byte) var84;
                }
                var72 = var79;
                var73 = var80;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field3899[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field3899[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field2210 = var2.method347(26119);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class121 var93 = var19[var87];
            if (var93.field2218 != null) {
                var93.field2217 = var2.method347(26119);
            }
            if (var93.field2207 != null) {
                var93.field2214 = var2.method347(26119);
            }
            if (var93.field2210 > 0) {
                var93.field2209 = var2.method347(26119);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field2211 = var2.method347(26119);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class121 var92 = var19[var89];
            if (var92.field2211 > 0) {
                var92.field2213 = var2.method347(26119);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class121 var91 = var19[var90];
            if (var91.field2213 > 0) {
                var91.field2212 = var2.method347(26119);
            }
        }
    }
}
