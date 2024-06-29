import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class220 {

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "B")
    private byte field3519;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public int field3523;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public int field3515;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public int field3517;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public int field3512;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public int field3514;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "Lll;")
    public static class212 field3524 = new class212();

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
    public static int field3529 = 0;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "[I")
    public static int[] field3530 = new int[2];

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "Lhl;")
    public static class40 field3526 = new class40(128);

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "Lpg;")
    public static class77 field3532 = new class77(5000);

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "[I")
    public static int[] field3527;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "[Lsi;")
    public static class204[] field3528;

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "[[[I")
    public static int[][][] field3533;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "[[[Lkc;")
    public static class286[][][] field3525;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/String;BZ)V")
    public static final void method1574(String arg0, byte arg1, boolean arg2) {
        field3516++;
        short[] var3 = new short[16];
        String var4 = arg0.toLowerCase();
        int var5 = 0;
        for (int var6 = 0; var6 < class19.field213; var6++) {
            class62 var9 = class254.method1800(var6, 15017);
            if ((!arg2 || var9.field886) && var9.field902 == -1 && var9.field924 == -1 && var9.field866 == 0 && var9.field910.toLowerCase().indexOf(var4) != -1) {
                if (var5 >= 250) {
                    class209.field3355 = null;
                    class144.field2336 = -1;
                    return;
                }
                if (var3.length <= var5) {
                    short[] var10 = new short[var3.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var3[var11];
                    }
                    var3 = var10;
                }
                var3[var5++] = (short) var6;
            }
        }
        class209.field3355 = var3;
        if (arg1 != 0) {
            method1577(-6, -124);
        }
        class144.field2336 = var5;
        class108.field1563 = 0;
        String[] var7 = new String[class144.field2336];
        for (int var8 = 0; var8 < class144.field2336; var8++) {
            var7[var8] = class254.method1800(var3[var8], arg1 + 15017).field910;
        }
        class81.method595(arg1 + 14366, var7, class209.field3355);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)I")
    public final int method1575(int arg0) {
        field3520++;
        if (arg0 != 7) {
            method1579(118);
        }
        return this.field3519 & 0x7;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIB[Lth;II[BZ)[I")
    public static final int[] method1576(int arg0, int arg1, byte arg2, class113[] arg3, int arg4, int arg5, byte[] arg6, boolean arg7) {
        field3521++;
        if (!arg7) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if ((arg0 + var9) > 0 && arg0 + var9 < 103 && (arg1 + var10) > 0 && arg1 + var10 < 103) {
                            arg3[var8].field1633[arg0 + var9][arg1 + var10] = class179.method1337(arg3[var8].field1633[arg0 + var9][arg1 + var10], -2097153);
                        }
                    }
                }
            }
        }
        class152 var11 = new class152(arg6);
        byte var12;
        if (arg7) {
            var12 = 1;
        } else {
            var12 = 4;
        }
        int var13 = arg0 + arg4;
        if (arg2 <= 5) {
            field3533 = null;
        }
        int var14 = arg5 + arg1;
        for (int var15 = 0; var15 < var12; var15++) {
            for (int var39 = 0; var39 < 64; var39++) {
                for (int var40 = 0; var40 < 64; var40++) {
                    class45.method338(arg7, arg0 + var39, 0, 0, var15, arg1 + var40, var14 + var40, 0, var11, 4276, var13 + var39, false);
                }
            }
        }
        boolean var16 = false;
        boolean var17 = false;
        while (var11.field2523.length > var11.field2511) {
            int var18 = var11.method1111(255);
            if (var18 == 128) {
                class110.field1581[0] = var11.method1126(false);
                var16 = true;
                class110.field1581[1] = var11.method1090(12107);
                class110.field1581[2] = var11.method1090(12107);
                class110.field1581[3] = var11.method1090(12107);
                class110.field1581[4] = var11.method1126(false);
            } else {
                if (var18 != 129) {
                    var11.field2511--;
                    break;
                }
                var17 = true;
                for (int var19 = 0; var19 < 4; var19++) {
                    byte var20 = var11.method1092((byte) -62);
                    if (var20 == 0) {
                        int var21 = arg0 + 64;
                        int var22 = arg0;
                        int var23 = arg1 + 64;
                        int var24 = arg1;
                        if (arg0 < 0) {
                            var22 = 0;
                        } else if (arg0 >= 104) {
                            var22 = 104;
                        }
                        if (arg1 < 0) {
                            var24 = 0;
                        } else if (arg1 >= 104) {
                            var24 = 104;
                        }
                        if (var21 < 0) {
                            var21 = 0;
                        } else if (var21 >= 104) {
                            var21 = 104;
                        }
                        if (var23 < 0) {
                            var23 = 0;
                        } else if (var23 >= 104) {
                            var23 = 104;
                        }
                        while (var21 > var22) {
                            while (var24 < var23) {
                                class117.field1676[var19][var22][var24] = 0;
                                var24++;
                            }
                            var22++;
                        }
                    } else if (var20 == 1) {
                        for (int var29 = 0; var29 < 64; var29 += 4) {
                            for (int var30 = 0; var30 < 64; var30 += 4) {
                                byte var31 = var11.method1092((byte) -62);
                                for (int var32 = var29 + arg0; var32 < arg0 + var29 + 4; var32++) {
                                    for (int var33 = arg1 + var30; var33 < var30 + arg1 + 4; var33++) {
                                        if (var32 >= 0 && var32 < 104 && var33 >= 0 && var33 < 104) {
                                            class117.field1676[var19][var32][var33] = var31;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var20 == 2 && var19 > 0) {
                        int var25 = arg0 + 64;
                        int var26 = arg0;
                        if (arg0 < 0) {
                            var26 = 0;
                        } else if (arg0 >= 104) {
                            var26 = 104;
                        }
                        if (var25 < 0) {
                            var25 = 0;
                        } else if (var25 >= 104) {
                            var25 = 104;
                        }
                        int var27 = arg1 + 64;
                        if (var27 < 0) {
                            var27 = 0;
                        } else if (var27 >= 104) {
                            var27 = 104;
                        }
                        int var28 = arg1;
                        if (arg1 < 0) {
                            var28 = 0;
                        } else if (arg1 >= 104) {
                            var28 = 104;
                        }
                        while (var25 > var26) {
                            while (var28 < var27) {
                                class117.field1676[var19][var26][var28] = class117.field1676[var19 - 1][var26][var28];
                                var28++;
                            }
                            var26++;
                        }
                    }
                }
            }
        }
        if (!var17) {
            for (int var34 = 0; var34 < 4; var34++) {
                for (int var35 = 0; var35 < 16; var35++) {
                    for (int var36 = 0; var36 < 16; var36++) {
                        int var37 = (arg0 >> 2) + var35;
                        int var38 = (arg1 >> 2) + var36;
                        if (var37 >= 0 && var37 < 26 && var38 >= 0 && var38 < 26) {
                            class117.field1676[var34][var37][var38] = 0;
                        }
                    }
                }
            }
        }
        if (var16) {
            return class110.field1581;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)V")
    public static final void method1577(int arg0, int arg1) {
        field3518++;
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class144.method1037(92);
        } else if (arg1 == 2) {
            class280.method1920((byte) 44);
        } else if (arg1 == 3) {
            class100.method762(-30538);
        } else {
            throw new RuntimeException();
        }
        if (arg0 > -60) {
            field3526 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)I")
    public final int method1578(int arg0) {
        field3522++;
        if (arg0 == -25135) {
            return (this.field3519 & 0x8) == 8 ? 1 : 0;
        } else {
            return 88;
        }
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V")
    public static void method1579(int arg0) {
        field3528 = null;
        field3532 = null;
        field3525 = null;
        field3526 = null;
        if (arg0 != -1664) {
            method1574((String) null, (byte) -79, false);
        }
        field3530 = null;
        field3533 = null;
        field3527 = null;
        field3524 = null;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
    public class220() {
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lv;)V")
    public class220(class152 arg0) {
        this.field3519 = arg0.method1092((byte) -62);
        this.field3523 = arg0.method1126(false);
        this.field3515 = arg0.method1097(126);
        this.field3517 = arg0.method1097(126);
        this.field3512 = arg0.method1097(127);
        this.field3514 = arg0.method1097(127);
    }
}
