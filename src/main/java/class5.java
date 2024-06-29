import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!c")
public class class5 {

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "[I")
    private int[] field34 = new int[1500];

    @OriginalMember(owner = "mapview!c", name = "f", descriptor = "[I")
    public int[] field39 = new int[1500];

    @OriginalMember(owner = "mapview!c", name = "k", descriptor = "[I")
    private int[] field44 = new int[1500];

    @OriginalMember(owner = "mapview!c", name = "g", descriptor = "[I")
    public int[] field40 = new int[1500];

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "[I")
    public int[] field35 = new int[1500];

    @OriginalMember(owner = "mapview!c", name = "i", descriptor = "I")
    private int field42 = 0;

    @OriginalMember(owner = "mapview!c", name = "d", descriptor = "[I")
    private int[] field37 = new int[1500];

    @OriginalMember(owner = "mapview!c", name = "j", descriptor = "Ll;")
    public static class22 field43 = class33.method229("Tannery", -43);

    @OriginalMember(owner = "mapview!c", name = "e", descriptor = "Ll;")
    public static class22 field38 = class33.method229("Prev page", -40);

    @OriginalMember(owner = "mapview!c", name = "m", descriptor = "Ll;")
    public static class22 field46 = class33.method229("Sandpit", -91);

    @OriginalMember(owner = "mapview!c", name = "h", descriptor = "Ll;")
    public static class22 field41 = class33.method229("General Store", -124);

    @OriginalMember(owner = "mapview!c", name = "c", descriptor = "Lha;")
    public static class16 field36 = new class16();

    @OriginalMember(owner = "mapview!c", name = "n", descriptor = "I")
    public static int field47 = 500;

    @OriginalMember(owner = "mapview!c", name = "p", descriptor = "Ll;")
    public static class22 field49 = class33.method229("Spinning Wheel", -75);

    @OriginalMember(owner = "mapview!c", name = "r", descriptor = "I")
    public static int field51 = 0;

    @OriginalMember(owner = "mapview!c", name = "s", descriptor = "Ll;")
    public static class22 field52 = class33.method229("100(U", -127);

    @OriginalMember(owner = "mapview!c", name = "o", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "mapview!c", name = "q", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "mapview!c", name = "l", descriptor = "[B")
    public static byte[] field45;

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "([BB)V", line = 9)
    private final void method18(byte[] arg0, byte arg1) {
        int var3 = 0;
        while (true) {
            while (arg0.length > var3) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - class8.field58;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class30.field423;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class19.field197 && class33.field443 > var5 + 64) {
                    class29.field373 = var4 >> 6;
                    class13.field144 = class33.field443 - var5 - 1 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg0[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg0[var3++];
                                class14.method80(var9, 3, class33.field443 - var7 - var5 - 1 - 64, -29257, var4 + var6);
                                if (class27.field364[class13.field144][class29.field373] == null) {
                                    class27.field364[class13.field144][class29.field373] = new class24();
                                    class27.field364[class13.field144][class29.field373].field232 = new byte[4096];
                                }
                                class27.field364[class13.field144][class29.field373].field232[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class27.field364[class13.field144][class29.field373] != null) {
                        class27.field364[class13.field144][class29.field373].method162((byte) 17);
                    }
                } else {
                    for (int var10 = -4096; var10 < 0; var10++) {
                        byte var11 = arg0[var3++];
                        if (var11 != 0) {
                            var3++;
                        }
                    }
                }
            }
            if (arg1 < 50) {
                this.method21(35, (byte) -119, 65, -46, 20, 10, 22, 66, -81);
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IIIIIIIBI)V", line = 95)
    public final void method19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        int var10 = arg2 - arg6;
        int var11 = arg0 - arg3;
        int var12 = (arg8 - arg4 << 16) / var10;
        int var13 = (arg5 - arg1 << 16) / var11;
        for (int var14 = 0; var14 < var10; var14++) {
            int var15 = var12 * var14 >> 16;
            int var16 = (var14 + 1) * var12 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg4 + var16;
                class21.method127(arg3, true, arg6 + var14);
                int var19 = arg4 + var15;
                for (int var20 = 0; var20 < var11; var20++) {
                    int var21 = var13 * var20 >> 16;
                    int var22 = (var20 + 1) * var13 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = arg1 + var22;
                        int var25 = class24.method163(-63);
                        int var26 = arg1 + var21;
                        int var27 = class24.method164(0);
                        if (var25 == 0 && var27 == 0) {
                            class31.method216(var19, var26, var18 - var19, -var26 + var24, class30.method208(0));
                        } else {
                            byte var28 = class29.method205(0);
                            int var29 = var28 & 0xFC;
                            if (var29 == 0 || var17 <= 1 || var23 <= 1) {
                                class31.method216(var19, var26, var17, var23, var25);
                            } else {
                                this.method33(class31.field428 * var26 + var19, class30.method208(0), class31.field434, 3, var25, var23, var17, true, var28 & 0x3, var29 >> 2);
                            }
                            if (var27 > 0) {
                                byte var30 = class38.method242((byte) -99);
                                int var31 = var30 & 0xFC;
                                if (var31 == 0 || var17 <= 1 || var23 <= 1) {
                                    class31.method216(var19, var26, var17, var23, var27);
                                }
                                this.method33(class31.field428 * var26 + var19, class30.method208(0), class31.field434, 3, var27, var23, var17, var25 == 0, var30 & 0x3, var31 >> 2);
                            }
                        }
                    }
                    class10.method48((byte) -123);
                }
            }
        }
        int var32 = -122 % ((-arg7 - 1) / 35);
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IIIDIIBIII)V", line = 187)
    public final void method20(int arg0, int arg1, int arg2, double arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        int var12 = arg4 - arg0;
        int var13 = arg8 - arg7;
        int var14 = (arg5 - arg1 << 16) / var12;
        int var15 = (arg2 - arg9 << 16) / var13;
        if (arg5 - arg1 < -arg0 + arg4) {
            return;
        }
        this.field42 = 0;
        for (int var16 = 0; var16 < var12; var16++) {
            int var17 = var14 * var16 >> 16;
            int var18 = (var16 + 1) * var14 >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                class21.method127(arg7, true, arg0 + var16);
                for (int var20 = 0; var20 < var13; var20++) {
                    int var21 = var15 * var20 >> 16;
                    int var22 = (var20 + 1) * var15 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = class30.method207(-6726) & 0xFF;
                        if (var24 != 0) {
                            if (var24 == 47 || var24 == 53) {
                                class23.field226[var24 - 1].method237(var17, var21, var19 * 2 + 1, var23 * 2 - -1);
                                if (!(arg3 < 4.0D) && arg3 > 4.2D && arg3 > 6.2D) {
                                }
                            } else {
                                class23.field226[var24 - 1].method237(var17 - var19 / 2, var21 - var23 / 2, var19 * 2, var23 * 2);
                            }
                        }
                    }
                    class10.method48((byte) -119);
                }
            }
        }
        if (arg6 <= 81) {
            field49 = null;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IBIIIIIII)V", line = 303)
    public final void method21(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field42 = 0;
        int var10 = arg5 - arg7;
        int var11 = arg4 - arg0;
        if (arg1 != -49) {
            return;
        }
        int var12 = (arg8 - arg6 << 16) / var10;
        int var13 = (arg2 - arg3 << 16) / var11;
        for (int var14 = 0; var14 < var10; var14++) {
            int var15 = var12 * var14 >> 16;
            int var16 = (var14 + 1) * var12 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                class21.method127(arg0, true, arg7 + var14);
                for (int var18 = 0; var18 < var11; var18++) {
                    int var19 = var13 * var18 >> 16;
                    int var20 = (var18 + 1) * var13 >> 16;
                    int var21 = var20 - var19;
                    if (var21 > 0) {
                        int var22 = class22.method142(-123) & 0xFF;
                        if (var22 != 0) {
                            int var23;
                            if (var17 == 1) {
                                var23 = var15;
                            } else {
                                var23 = var16 - 1;
                            }
                            int var24;
                            if (var21 == 1) {
                                var24 = var19;
                            } else {
                                var24 = var20 - 1;
                            }
                            int var25 = 13421772;
                            if (var22 >= 5 && var22 <= 8 || var22 >= 13 && var22 <= 16 || var22 >= 21 && var22 <= 24 || var22 == 27 || var22 == 28) {
                                var22 -= 4;
                                var25 = 13369344;
                            }
                            if (var22 == 1) {
                                class31.method218(var15, var19, var21, var25);
                            } else if (var22 == 2) {
                                class31.method213(var15, var19, var17, var25);
                            } else if (var22 == 3) {
                                class31.method218(var23, var19, var21, var25);
                            } else if (var22 == 4) {
                                class31.method213(var15, var24, var17, var25);
                            } else if (var22 == 9) {
                                class31.method218(var15, var19, var21, 16777215);
                                class31.method213(var15, var19, var17, var25);
                            } else if (var22 == 10) {
                                class31.method218(var23, var19, var21, 16777215);
                                class31.method213(var15, var19, var17, var25);
                            } else if (var22 == 11) {
                                class31.method218(var23, var19, var21, 16777215);
                                class31.method213(var15, var24, var17, var25);
                            } else if (var22 == 12) {
                                class31.method218(var15, var19, var21, 16777215);
                                class31.method213(var15, var24, var17, var25);
                            } else if (var22 == 17) {
                                class31.method213(var15, var19, 1, var25);
                            } else if (var22 == 18) {
                                class31.method213(var23, var19, 1, var25);
                            } else if (var22 == 19) {
                                class31.method213(var23, var24, 1, var25);
                            } else if (var22 == 20) {
                                class31.method213(var15, var24, 1, var25);
                            } else if (var22 == 25) {
                                for (int var27 = 0; var27 < var21; var27++) {
                                    class31.method213(var15 + var27, -var27 + var24, 1, var25);
                                }
                            } else if (var22 == 26) {
                                for (int var26 = 0; var26 < var21; var26++) {
                                    class31.method213(var15 + var26, var19 - -var26, 1, var25);
                                }
                            }
                        }
                        int var28 = class24.method161(-43) & 0xFF;
                        if (var28 != 0) {
                            this.field37[this.field42] = var28 - 1;
                            this.field44[this.field42] = var17 / 2 + var15;
                            this.field34[this.field42] = var21 / 2 + var19;
                            this.field42++;
                        }
                    }
                    class10.method48((byte) -121);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(B)V", line = 482)
    public static void method22(byte arg0) {
        field43 = null;
        field41 = null;
        field52 = null;
        field49 = null;
        field38 = null;
        field36 = null;
        if (arg0 < 42) {
            method28(-94, -9, (byte) 60, null);
        }
        field46 = null;
        field45 = null;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(III)V", line = 499)
    private final void method23(int arg0, int arg1, int arg2) {
        int var4 = arg2 >> 6;
        int var5 = arg0 >> 6;
        class34.field460[3] = new byte[var4][var5][];
        class27.field364 = new class24[var4][var5];
        class34.field460[4] = new byte[var4][var5][];
        class34.field460[arg1] = new byte[var4][var5][];
        class34.field460[0] = new byte[var4][var5][];
        class34.field460[2] = new byte[var4][var5][];
        class13.field134 = new int[var4][var5][];
        class34.field463 = new class24[var4][var5];
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(B[B)V", line = 518)
    private final void method24(byte arg0, byte[] arg1) {
        int var3 = 0;
        if (arg0 != 26) {
            this.method30(61, -0.3851975235891955D, -1.616501924175961D, 0.6093569104216142D);
        }
        while (true) {
            while (var3 < arg1.length) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class8.field58;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class30.field423;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class19.field197 && var5 + 64 < class33.field443) {
                    class13.field144 = class33.field443 - var5 - 1 >> 6;
                    class29.field373 = var4 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg1[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg1[var3++];
                                class14.method80(var9, 4, class33.field443 - var5 - var7 - 64 - 1, -29257, var4 + var6);
                                if (class34.field463[class13.field144][class29.field373] == null) {
                                    class34.field463[class13.field144][class29.field373] = new class24();
                                    class34.field463[class13.field144][class29.field373].field232 = new byte[4096];
                                }
                                class34.field463[class13.field144][class29.field373].field232[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class34.field463[class13.field144][class29.field373] != null) {
                        class34.field463[class13.field144][class29.field373].method162((byte) -119);
                    }
                } else {
                    for (int var10 = -4096; var10 < 0; var10++) {
                        byte var11 = arg1[var3++];
                        if (var11 != 0) {
                            var3++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "([[BI)V", line = 601)
    private final void method25(byte[][] arg0, int arg1) {
        int var3 = class33.field443;
        int var4 = class19.field197;
        int[] var5 = new int[var3];
        if (arg1 != -1) {
            field45 = null;
        }
        for (int var6 = 0; var6 < var3; var6++) {
            var5[var6] = 0;
        }
        for (int var7 = 5; var7 < var4 - 5; var7++) {
            byte[] var8 = arg0[var7 - 5];
            byte[] var9 = arg0[var7 + 5];
            for (int var10 = 0; var10 < var3; var10++) {
                int var11 = class16.field162[var8[var10] & 0xFF];
                int var12 = class16.field162[var9[var10] & 0xFF];
                if (var12 <= 0 && class8.method39(3, var7 + 5, var10) > 0) {
                    var12 = 64;
                }
                if (var11 <= 0 && class8.method39(-126, var7 - 5, var10) > 0) {
                    var11 = 64;
                }
                var5[var10] += var12 - var11;
            }
            if (var7 > 10 && var7 < var4 - 10) {
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                for (int var16 = 5; var16 < var3 - 5; var16++) {
                    int var17 = var5[var16 - 5];
                    int var18 = var5[var16 + 5];
                    var14 += (var18 >> 10 & 0x3FF) - (var17 >> 10 & 0x3FF);
                    var13 += (var18 >> 20) - (var17 >> 20);
                    var15 += (var18 & 0x3FF) - (var17 & 0x3FF);
                    if (var15 > 0) {
                        int var19 = var7 >> 6;
                        int var20 = var16 >> 6;
                        if (class13.field134[var20][var19] == null) {
                            class13.field134[var20][var19] = new int[4096];
                        }
                        if ((arg0[var7][var16] & 0xFF) > 0) {
                            class13.field134[var20][var19][class19.method119(63, var7) + (class19.method119(var16, 63) << 6)] = this.method30(class12.method64(arg1, 0), (double) var15 / 8533.0D, (double) var13 / 8533.0D, (double) var14 / 8533.0D);
                        } else {
                            class13.field134[var20][var19][class19.method119(4032, var16 << 6) + class19.method119(var7, 63)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(BJ)V", line = 719)
    public static final void method26(byte arg0, long arg1) {
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class14.method77(false, arg1 - 1L);
            class14.method77(false, 1L);
        } else {
            class14.method77(false, arg1);
        }
        if (arg0 <= 12) {
            method28(-14, 107, (byte) 35, null);
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IZIIIIIIIII)V", line = 740)
    public final void method27(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (this.field42 == 0) {
            int var12 = arg7 - arg4;
            int var13 = arg8 - arg9;
            int var14 = (arg6 - arg0 << 16) / var12;
            int var15 = (arg2 - arg10 << 16) / var13;
            for (int var16 = 0; var16 < var12; var16++) {
                int var17 = var14 * var16 >> 16;
                int var18 = (var16 + 1) * var14 >> 16;
                int var19 = var18 - var17;
                if (var19 > 0) {
                    class21.method127(arg9, true, var16 + arg4);
                    for (int var20 = 0; var20 < var13; var20++) {
                        int var21 = var15 * var20 >> 16;
                        int var22 = (var20 + 1) * var15 >> 16;
                        int var23 = var22 - var21;
                        if (var23 > 0) {
                            int var24 = class24.method161(-16) & 0xFF;
                            if (var24 != 0) {
                                this.field37[this.field42] = var24 - 1;
                                this.field44[this.field42] = var19 / 2 + var17;
                                this.field34[this.field42] = var23 / 2 + var21;
                                this.field42++;
                            }
                        }
                        class10.method48((byte) -127);
                    }
                }
            }
        }
        for (int var25 = 0; var25 < this.field42; var25++) {
            if (class13.field135[this.field37[var25]] != null) {
                class13.field135[this.field37[var25]].method13(this.field44[var25] - 7, this.field34[var25] + -7);
            }
        }
        if (arg1) {
            field38 = null;
        }
        if (arg3 > 0) {
            for (int var26 = 0; var26 < this.field42; var26++) {
                if (this.field37[var26] == arg5) {
                    class13.field135[this.field37[var26]].method13(this.field44[var26] - 7, this.field34[var26] + -7);
                    if (arg3 % 10 < 5) {
                        class31.method212(this.field44[var26], this.field34[var26], 15, 16776960, 128);
                        class31.method212(this.field44[var26], this.field34[var26], 7, 16777215, 256);
                    }
                }
            }
        }
        this.field42 = 0;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IIBLea;)[Lu;", line = 855)
    public static final class36[] method28(int arg0, int arg1, byte arg2, class10 arg3) {
        if (class34.method233(arg3, true, arg0, arg1)) {
            int var4 = -1 % ((arg2 + 4) / 50);
            return class2.method7(126);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "([[B[BB)V", line = 868)
    private final void method29(byte[][] arg0, byte[] arg1, byte arg2) {
        if (arg2 != -59) {
            this.method24((byte) 110, null);
        }
        int var4 = 0;
        while (true) {
            while (arg1.length > var4) {
                int var5 = (arg1[var4++] & 0xFF) * 64 - class8.field58;
                int var6 = (arg1[var4++] & 0xFF) * 64 - class30.field423;
                if (var5 > 0 && var6 > 0 && var5 + 64 < class19.field197 && class33.field443 > var6 + 64) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        byte[] var8 = arg0[var7 + var5];
                        int var9 = class33.field443 - var6 - 1;
                        for (int var10 = -64; var10 < 0; var10++) {
                            var8[var9--] = arg1[var4++];
                        }
                    }
                } else {
                    var4 += 4096;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IDDD)I", line = 915)
    private final int method30(int arg0, double arg1, double arg2, double arg3) {
        double var8 = arg1;
        double var10 = arg1;
        double var12 = arg1;
        if (arg3 != 0.0D) {
            double var14 = arg2 + 0.3333333333333333D;
            double var16;
            if (arg1 < 0.5D) {
                var16 = (arg3 + 1.0D) * arg1;
            } else {
                var16 = arg1 + arg3 - arg1 * arg3;
            }
            if (var14 > 1.0D) {
                var14--;
            }
            double var20 = arg1 * 2.0D - var16;
            if (arg2 * 6.0D < 1.0D) {
                var10 = (var16 - var20) * 6.0D * arg2 + var20;
            } else if (arg2 * 2.0D < 1.0D) {
                var10 = var16;
            } else if (arg2 * 3.0D < 2.0D) {
                var10 = (var16 - var20) * (0.6666666666666666D - arg2) * 6.0D + var20;
            } else {
                var10 = var20;
            }
            if (var14 * 6.0D < 1.0D) {
                var8 = (var16 - var20) * 6.0D * var14 + var20;
            } else if (var14 * 2.0D < 1.0D) {
                var8 = var16;
            } else if (var14 * 3.0D < 2.0D) {
                var8 = (0.6666666666666666D - var14) * (-var20 + var16) * 6.0D + var20;
            } else {
                var8 = var20;
            }
            double var22 = arg2 - 0.3333333333333333D;
            if (var22 < 0.0D) {
                var22++;
            }
            if (var22 * 6.0D < 1.0D) {
                var12 = (var16 - var20) * 6.0D * var22 + var20;
            } else if (var22 * 2.0D < 1.0D) {
                var12 = var16;
            } else if (var22 * 3.0D < 2.0D) {
                var12 = (var16 - var20) * (-var22 + 0.6666666666666666D) * 6.0D + var20;
            } else {
                var12 = var20;
            }
        }
        int var24 = (int) (var8 * 256.0D);
        int var25 = (int) (var10 * 256.0D);
        int var26 = (int) (var12 * 256.0D);
        return arg0 == -1 ? (var24 << 16) + (var25 << 8) + var26 : -106;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(ILb;)V", line = 1006)
    public final void method31(int arg0, class3 arg1) {
        class38 var3 = new class38(arg1.method45((byte) -66, class8.field68, class34.field458));
        int var4 = var3.method254(arg0 ^ 0xBEE8A948);
        int var5 = var3.method254(-1092048568);
        int var6 = var3.method254(-1092048568);
        int var7 = var3.method254(arg0 - 1092048568);
        int var8 = var3.method254(-1092048568);
        int var9 = var3.method254(-1092048568);
        var3.method247(false);
        class8.field58 = var4 * 64;
        class33.field443 = (var7 + 1 - var5) * 64;
        class3.field25 = var8 * 64 - class8.field58;
        class30.field423 = var5 * 64;
        class24.field234 = class30.field423 + class33.field443 - var9 * 64;
        class19.field197 = (var6 - var4) * 64 + 64;
        this.method23(class19.field197, arg0 + 1, class33.field443);
        class38 var10 = new class38(arg1.method45((byte) -70, class29.field407, class34.field458));
        int var11 = var10.method254(arg0 ^ 0xBEE8A948);
        class16.field162 = new int[var11 + 1];
        for (int var12 = arg0; var12 < var11; var12++) {
            class16.field162[var12 + 1] = var10.method244(1918432520);
        }
        int var13 = var10.method254(-1092048568);
        class29.field378 = new int[var13 + 1];
        for (int var14 = 0; var14 < var13; var14++) {
            class29.field378[var14 + 1] = var10.method244(1918432520);
        }
        byte[] var15 = arg1.method45((byte) -123, class33.field444, class34.field458);
        byte[][] var16 = new byte[class19.field197][class33.field443];
        this.method29(var16, var15, (byte) -59);
        byte[] var17 = arg1.method45((byte) -32, class21.field208, class34.field458);
        this.method18(var17, (byte) 108);
        byte[] var18 = arg1.method45((byte) -106, class35.field476, class34.field458);
        this.method24((byte) 26, var18);
        byte[] var19 = arg1.method45((byte) -118, class35.field473, class34.field458);
        field51 = 0;
        this.method32((byte) -21, var19);
        this.method25(var16, -1);
        if (class14.field154) {
        }
    }

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "(B[B)V", line = 1079)
    private final void method32(byte arg0, byte[] arg1) {
        if (arg0 != -21) {
            this.method18(null, (byte) 44);
        }
        int var3 = 0;
        while (true) {
            while (var3 < arg1.length) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class8.field58;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class30.field423;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class19.field197 && var5 + 64 < class33.field443) {
                    for (int var6 = 0; var6 < 64; var6++) {
                        int var7 = class33.field443 - var5 - 1;
                        for (int var8 = -64; var8 < 0; var8++) {
                            while (true) {
                                int var9 = arg1[var3++] & 0xFF;
                                if (var9 == 0) {
                                    break;
                                }
                                if (var9 < 29) {
                                    class14.method80((byte) var9, 0, class33.field443 - var5 - var8 - 1 - 64, -29257, var4 + var6);
                                } else if (var9 < 160) {
                                    class14.method80((byte) (var9 - 28), 1, class33.field443 - var8 - var5 - 64 - 1, arg0 ^ 0x725C, var4 + var6);
                                } else {
                                    class14.method80((byte) (var9 - 159), 2, class33.field443 - var8 - var5 - 1 - 64, -29257, var4 + var6);
                                    if (field51 >= 1500) {
                                        break;
                                    }
                                    this.field35[field51] = var4 + var6;
                                    this.field39[field51] = var7;
                                    this.field40[field51] = var9 - 160;
                                    field51++;
                                }
                            }
                            var7--;
                        }
                    }
                } else {
                    for (int var10 = 0; var10 < 64; var10++) {
                        byte var12;
                        for (int var11 = -64; var11 < 0; var11++) {
                            do {
                                var12 = arg1[var3++];
                            } while (var12 != 0);
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(II[IIIIIZII)V", line = 1194)
    private final void method33(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        if (arg9 == 9) {
            arg9 = 1;
            arg8 = arg8 + 1 & 0x3;
        }
        if (arg9 == 10) {
            arg8 = arg8 + 3 & 0x3;
            arg9 = 1;
        }
        if (arg9 == 11) {
            arg8 = arg8 + 3 & 0x3;
            arg9 = 8;
        }
        int var11 = class31.field428 - arg6;
        if (arg9 == 1) {
            if (arg8 == 0) {
                for (int var68 = 0; var68 < arg5; var68++) {
                    for (int var69 = 0; var69 < arg6; var69++) {
                        if (var69 <= var68) {
                            arg2[arg0] = arg4;
                        } else if (arg7) {
                            arg2[arg0] = arg1;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg8 == 1) {
                for (int var70 = arg5 - 1; var70 >= 0; var70--) {
                    for (int var71 = 0; var71 < arg6; var71++) {
                        if (var71 <= var70) {
                            arg2[arg0] = arg4;
                        } else if (arg7) {
                            arg2[arg0] = arg1;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg8 == 2) {
                for (int var74 = 0; var74 < arg5; var74++) {
                    for (int var75 = 0; var75 < arg6; var75++) {
                        if (var74 <= var75) {
                            arg2[arg0] = arg4;
                        } else if (arg7) {
                            arg2[arg0] = arg1;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg8 == 3) {
                for (int var72 = arg5 - 1; var72 >= 0; var72--) {
                    for (int var73 = 0; var73 < arg6; var73++) {
                        if (var72 <= var73) {
                            arg2[arg0] = arg4;
                        } else if (arg7) {
                            arg2[arg0] = arg1;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            }
        } else if (arg9 == 2) {
            if (arg8 == 0) {
                for (int var12 = arg5 - 1; var12 >= 0; var12--) {
                    for (int var13 = 0; var13 < arg6; var13++) {
                        if (var13 <= var12 >> 1) {
                            arg2[arg0] = arg4;
                        } else if (arg7) {
                            arg2[arg0] = arg1;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg8 == 1) {
                for (int var18 = 0; var18 < arg5; var18++) {
                    for (int var19 = 0; var19 < arg6; var19++) {
                        if (var19 >= var18 << 1) {
                            arg2[arg0] = arg4;
                        } else if (arg7) {
                            arg2[arg0] = arg1;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg8 == 2) {
                for (int var16 = 0; var16 < arg5; var16++) {
                    for (int var17 = arg6 - 1; var17 >= 0; var17--) {
                        if (var17 <= var16 >> 1) {
                            arg2[arg0] = arg4;
                        } else if (arg7) {
                            arg2[arg0] = arg1;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg8 == 3) {
                for (int var14 = arg5 - 1; var14 >= 0; var14--) {
                    for (int var15 = arg6 - 1; var15 >= 0; var15--) {
                        if (var14 << 1 <= var15) {
                            arg2[arg0] = arg4;
                        } else if (arg7) {
                            arg2[arg0] = arg1;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            }
        } else if (arg3 == arg9) {
            if (arg8 == 0) {
                for (int var26 = arg5 - 1; var26 >= 0; var26--) {
                    for (int var27 = arg6 - 1; var27 >= 0; var27--) {
                        if (var27 <= var26 >> 1) {
                            arg2[arg0] = arg4;
                        } else if (arg7) {
                            arg2[arg0] = arg1;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg8 == 1) {
                for (int var24 = arg5 - 1; var24 >= 0; var24--) {
                    for (int var25 = 0; var25 < arg6; var25++) {
                        if (var24 << 1 <= var25) {
                            arg2[arg0] = arg4;
                        } else if (arg7) {
                            arg2[arg0] = arg1;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg8 == 2) {
                for (int var22 = 0; var22 < arg5; var22++) {
                    for (int var23 = 0; var23 < arg6; var23++) {
                        if (var23 <= var22 >> 1) {
                            arg2[arg0] = arg4;
                        } else if (arg7) {
                            arg2[arg0] = arg1;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg8 == 3) {
                for (int var20 = 0; var20 < arg5; var20++) {
                    for (int var21 = arg6 - 1; var21 >= 0; var21--) {
                        if (var20 << 1 <= var21) {
                            arg2[arg0] = arg4;
                        } else if (arg7) {
                            arg2[arg0] = arg1;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            }
        } else if (arg9 == 4) {
            if (arg8 == 0) {
                for (int var28 = arg5 - 1; var28 >= 0; var28--) {
                    for (int var29 = 0; var29 < arg6; var29++) {
                        if (var29 >= var28 >> 1) {
                            arg2[arg0] = arg4;
                        } else if (arg7) {
                            arg2[arg0] = arg1;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg8 == 1) {
                for (int var34 = 0; var34 < arg5; var34++) {
                    for (int var35 = 0; var35 < arg6; var35++) {
                        if (var35 <= var34 << 1) {
                            arg2[arg0] = arg4;
                        } else if (arg7) {
                            arg2[arg0] = arg1;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg8 == 2) {
                for (int var30 = 0; var30 < arg5; var30++) {
                    for (int var31 = arg6 - 1; var31 >= 0; var31--) {
                        if (var31 >= var30 >> 1) {
                            arg2[arg0] = arg4;
                        } else if (arg7) {
                            arg2[arg0] = arg1;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg8 == 3) {
                for (int var32 = arg5 - 1; var32 >= 0; var32--) {
                    for (int var33 = arg6 - 1; var33 >= 0; var33--) {
                        if (var32 << 1 >= var33) {
                            arg2[arg0] = arg4;
                        } else if (arg7) {
                            arg2[arg0] = arg1;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            }
        } else if (arg9 != 5) {
            if (arg9 == 6) {
                if (arg8 == 0) {
                    for (int var50 = 0; var50 < arg5; var50++) {
                        for (int var51 = 0; var51 < arg6; var51++) {
                            if (var51 <= arg6 / 2) {
                                arg2[arg0] = arg4;
                            } else if (arg7) {
                                arg2[arg0] = arg1;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var48 = 0; var48 < arg5; var48++) {
                        for (int var49 = 0; var49 < arg6; var49++) {
                            if (arg5 / 2 >= var48) {
                                arg2[arg0] = arg4;
                            } else if (arg7) {
                                arg2[arg0] = arg1;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var46 = 0; var46 < arg5; var46++) {
                        for (int var47 = 0; var47 < arg6; var47++) {
                            if (var47 >= arg6 / 2) {
                                arg2[arg0] = arg4;
                            } else if (arg7) {
                                arg2[arg0] = arg1;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var44 = 0; var44 < arg5; var44++) {
                        for (int var45 = 0; var45 < arg6; var45++) {
                            if (arg5 / 2 <= var44) {
                                arg2[arg0] = arg4;
                            } else if (arg7) {
                                arg2[arg0] = arg1;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
            }
            if (arg9 == 7) {
                if (arg8 == 0) {
                    for (int var66 = 0; var66 < arg5; var66++) {
                        for (int var67 = 0; var67 < arg6; var67++) {
                            if (var67 <= var66 - arg5 / 2) {
                                arg2[arg0] = arg4;
                            } else if (arg7) {
                                arg2[arg0] = arg1;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var64 = arg5 - 1; var64 >= 0; var64--) {
                        for (int var65 = 0; var65 < arg6; var65++) {
                            if (var65 <= var64 - arg5 / 2) {
                                arg2[arg0] = arg4;
                            } else if (arg7) {
                                arg2[arg0] = arg1;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var62 = arg5 - 1; var62 >= 0; var62--) {
                        for (int var63 = arg6 - 1; var63 >= 0; var63--) {
                            if (var62 - arg5 / 2 >= var63) {
                                arg2[arg0] = arg4;
                            } else if (arg7) {
                                arg2[arg0] = arg1;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var52 = 0; var52 < arg5; var52++) {
                        for (int var53 = arg6 - 1; var53 >= 0; var53--) {
                            if (var53 <= var52 - arg5 / 2) {
                                arg2[arg0] = arg4;
                            } else if (arg7) {
                                arg2[arg0] = arg1;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
            }
            if (arg9 == 8) {
                if (arg8 == 0) {
                    for (int var60 = 0; var60 < arg5; var60++) {
                        for (int var61 = 0; var61 < arg6; var61++) {
                            if (var61 >= var60 - arg5 / 2) {
                                arg2[arg0] = arg4;
                            } else if (arg7) {
                                arg2[arg0] = arg1;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var58 = arg5 - 1; var58 >= 0; var58--) {
                        for (int var59 = 0; var59 < arg6; var59++) {
                            if (var58 - arg5 / 2 <= var59) {
                                arg2[arg0] = arg4;
                            } else if (arg7) {
                                arg2[arg0] = arg1;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var56 = arg5 - 1; var56 >= 0; var56--) {
                        for (int var57 = arg6 - 1; var57 >= 0; var57--) {
                            if (var56 - arg5 / 2 <= var57) {
                                arg2[arg0] = arg4;
                            } else if (arg7) {
                                arg2[arg0] = arg1;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var54 = 0; var54 < arg5; var54++) {
                        for (int var55 = arg6 - 1; var55 >= 0; var55--) {
                            if (var54 - arg5 / 2 <= var55) {
                                arg2[arg0] = arg4;
                            } else if (arg7) {
                                arg2[arg0] = arg1;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
            }
        } else if (arg8 == 0) {
            for (int var42 = arg5 - 1; var42 >= 0; var42--) {
                for (int var43 = arg6 - 1; var43 >= 0; var43--) {
                    if (var42 >> 1 <= var43) {
                        arg2[arg0] = arg4;
                    } else if (arg7) {
                        arg2[arg0] = arg1;
                    }
                    arg0++;
                }
                arg0 += var11;
            }
        } else if (arg8 == 1) {
            for (int var36 = arg5 - 1; var36 >= 0; var36--) {
                for (int var37 = 0; var37 < arg6; var37++) {
                    if (var36 << 1 >= var37) {
                        arg2[arg0] = arg4;
                    } else if (arg7) {
                        arg2[arg0] = arg1;
                    }
                    arg0++;
                }
                arg0 += var11;
            }
        } else if (arg8 == 2) {
            for (int var40 = 0; var40 < arg5; var40++) {
                for (int var41 = 0; var41 < arg6; var41++) {
                    if (var40 >> 1 <= var41) {
                        arg2[arg0] = arg4;
                    } else if (arg7) {
                        arg2[arg0] = arg1;
                    }
                    arg0++;
                }
                arg0 += var11;
            }
        } else if (arg8 == 3) {
            for (int var38 = 0; var38 < arg5; var38++) {
                for (int var39 = arg6 - 1; var39 >= 0; var39--) {
                    if (var38 << 1 >= var39) {
                        arg2[arg0] = arg4;
                    } else if (arg7) {
                        arg2[arg0] = arg1;
                    }
                    arg0++;
                }
                arg0 += var11;
            }
        }
    }
}
