import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!m")
public class class23 {

    @OriginalMember(owner = "mapview!m", name = "d", descriptor = "[I")
    public int[] field213 = new int[1500];

    @OriginalMember(owner = "mapview!m", name = "f", descriptor = "[I")
    private int[] field215 = new int[1500];

    @OriginalMember(owner = "mapview!m", name = "i", descriptor = "[I")
    public int[] field218 = new int[1500];

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "[I")
    private int[] field211 = new int[1500];

    @OriginalMember(owner = "mapview!m", name = "h", descriptor = "I")
    private int field217 = 0;

    @OriginalMember(owner = "mapview!m", name = "j", descriptor = "[I")
    private int[] field219 = new int[1500];

    @OriginalMember(owner = "mapview!m", name = "k", descriptor = "[I")
    public int[] field220 = new int[1500];

    @OriginalMember(owner = "mapview!m", name = "c", descriptor = "La;")
    public static class1 field212 = class3.method36("details)3dat", -118);

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "I")
    public static int field210 = 0;

    @OriginalMember(owner = "mapview!m", name = "l", descriptor = "La;")
    public static class1 field221 = class3.method36("_", -88);

    @OriginalMember(owner = "mapview!m", name = "e", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "mapview!m", name = "g", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field216;

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(IIIIIIIII)V", line = 8)
    public final void method125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg2 - arg7;
        int var11 = arg8 - arg1;
        int var12 = (arg4 - arg6 << 16) / var11;
        int var13 = (arg0 - arg5 << 16) / var10;
        if (arg3 != -2) {
            return;
        }
        for (int var14 = 0; var14 < var10; var14++) {
            int var15 = var13 * var14 >> 16;
            int var16 = (var14 + 1) * var13 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                class31.method197(var14 + arg7, -28, arg1);
                int var18 = arg5 + var16;
                int var19 = arg5 + var15;
                for (int var20 = 0; var20 < var11; var20++) {
                    int var21 = var12 * var20 >> 16;
                    int var22 = (var20 + 1) * var12 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = arg6 + var22;
                        int var25 = arg6 + var21;
                        int var26 = class6.method47((byte) -112);
                        int var27 = class7.method50((byte) -73);
                        if (var26 == 0 && var27 == 0) {
                            class32.method214(var19, var25, var18 - var19, -var25 + var24, class41.method261(true));
                        } else {
                            byte var28 = class1.method20((byte) 116);
                            int var29 = var28 & 0xFC;
                            if (var29 == 0 || var17 <= 1 || var23 <= 1) {
                                class32.method214(var19, var25, var17, var23, var26);
                            } else {
                                this.method137((byte) 122, var28 & 0x3, var26, class41.method261(true), var17, var23, var29 >> 2, class32.field445 * var25 + var19, true, class32.field446);
                            }
                            if (var27 > 0) {
                                byte var30 = class9.method59((byte) 48);
                                int var31 = var30 & 0xFC;
                                if (var31 == 0 || var17 <= 1 || var23 <= 1) {
                                    class32.method214(var19, var25, var17, var23, var27);
                                }
                                this.method137((byte) 116, var30 & 0x3, var27, class41.method261(true), var17, var23, var31 >> 2, class32.field445 * var25 + var19, var26 == 0, class32.field446);
                            }
                        }
                    }
                    class11.method62((byte) -111);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(III)V", line = 100)
    private final void method126(int arg0, int arg1, int arg2) {
        int var4 = arg2 >> 6;
        int var5 = arg1 >> 6;
        if (arg0 <= 89) {
            this.field218 = null;
        }
        class33.field459 = new class40[var5][var4];
        class10.field110[2] = new byte[var5][var4][];
        class35.field473 = new class40[var5][var4];
        class10.field110[0] = new byte[var5][var4][];
        class10.field110[3] = new byte[var5][var4][];
        class2.field17 = new int[var5][var4][];
        class10.field110[1] = new byte[var5][var4][];
        class10.field110[4] = new byte[var5][var4][];
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(I[[B)V", line = 120)
    private final void method127(int arg0, byte[][] arg1) {
        int var3 = class29.field400;
        int var4 = class9.field88;
        int[] var5 = new int[var4];
        int var6 = 0;
        if (arg0 != -706) {
            return;
        }
        while (var4 > var6) {
            var5[var6] = 0;
            var6++;
        }
        for (int var7 = 5; var7 < var3 - 5; var7++) {
            byte[] var8 = arg1[var7 + 5];
            byte[] var9 = arg1[var7 - 5];
            for (int var10 = 0; var10 < var4; var10++) {
                int var11 = class14.field126[var8[var10] & 0xFF];
                int var12 = class14.field126[var9[var10] & 0xFF];
                if (var11 <= 0 && class39.method246(arg0 + 16712386, var7 + 5, var10) > 0) {
                    var11 = 64;
                }
                if (var12 <= 0 && class39.method246(16711680, var7 - 5, var10) > 0) {
                    var12 = 64;
                }
                var5[var10] += var11 - var12;
            }
            if (var7 > 10 && var3 - 10 > var7) {
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                for (int var16 = 5; var16 < var4 - 5; var16++) {
                    int var17 = var5[var16 - 5];
                    int var18 = var5[var16 + 5];
                    var13 += (var18 >> 20) - (var17 >> 20);
                    var14 += (var18 >> 10 & 0x3FF) - ((var17 & 0xFFF97) >> 10);
                    var15 += (var18 & 0x3FF) - (var17 & 0x3FF);
                    if (var15 > 0) {
                        int var19 = var7 >> 6;
                        int var20 = var16 >> 6;
                        if (class2.field17[var20][var19] == null) {
                            class2.field17[var20][var19] = new int[4096];
                        }
                        if ((arg1[var7][var16] & 0xFF) <= 0) {
                            class2.field17[var20][var19][mapview.method165(63, var7) + mapview.method165(var16 << 6, 4032)] = 0;
                        } else {
                            class2.field17[var20][var19][mapview.method165(var16 << 6, 4032) + mapview.method165(63, var7)] = this.method130((byte) -38, (double) var14 / 8533.0D, (double) var15 / 8533.0D, (double) var13 / 8533.0D);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "([[B[BI)V", line = 225)
    private final void method128(byte[][] arg0, byte[] arg1, int arg2) {
        int var4 = 0;
        while (true) {
            while (arg1.length > var4) {
                int var5 = (arg1[var4++] & 0xFF) * 64 - class2.field23;
                int var6 = (arg1[var4++] & 0xFF) * 64 - class5.field48;
                if (var5 > 0 && var6 > 0 && var5 + 64 < class29.field400 && var6 + 64 < class9.field88) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        byte[] var8 = arg0[var5 + var7];
                        int var9 = class9.field88 - var6 - 1;
                        for (int var10 = -64; var10 < 0; var10++) {
                            var8[var9--] = arg1[var4++];
                        }
                    }
                } else {
                    var4 += 4096;
                }
            }
            if (arg2 != 64) {
                this.field220 = null;
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(B)V", line = 275)
    public static void method129(byte arg0) {
        field212 = null;
        field216 = null;
        if (arg0 >= -39) {
            method129((byte) -28);
        }
        field221 = null;
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(BDDD)I", line = 289)
    private final int method130(byte arg0, double arg1, double arg2, double arg3) {
        double var8 = arg2;
        if (arg0 != -38) {
            this.field211 = null;
        }
        double var10 = arg2;
        double var12 = arg2;
        if (arg1 != 0.0D) {
            double var14;
            if (arg2 < 0.5D) {
                var14 = (arg1 + 1.0D) * arg2;
            } else {
                var14 = arg1 + arg2 - arg1 * arg2;
            }
            double var16 = arg2 * 2.0D - var14;
            double var20 = arg3 + 0.3333333333333333D;
            if (var20 > 1.0D) {
                var20--;
            }
            if (arg3 * 6.0D < 1.0D) {
                var8 = (var14 - var16) * 6.0D * arg3 + var16;
            } else if (arg3 * 2.0D < 1.0D) {
                var8 = var14;
            } else if (arg3 * 3.0D < 2.0D) {
                var8 = (var14 - var16) * (-arg3 + 0.6666666666666666D) * 6.0D + var16;
            } else {
                var8 = var16;
            }
            if (var20 * 6.0D < 1.0D) {
                var10 = (var14 - var16) * 6.0D * var20 + var16;
            } else if (var20 * 2.0D < 1.0D) {
                var10 = var14;
            } else if (var20 * 3.0D < 2.0D) {
                var10 = (var14 - var16) * (-var20 + 0.6666666666666666D) * 6.0D + var16;
            } else {
                var10 = var16;
            }
            double var22 = arg3 - 0.3333333333333333D;
            if (var22 < 0.0D) {
                var22++;
            }
            if (var22 * 6.0D < 1.0D) {
                var12 = (var14 - var16) * 6.0D * var22 + var16;
            } else if (var22 * 2.0D < 1.0D) {
                var12 = var14;
            } else if (var22 * 3.0D < 2.0D) {
                var12 = (0.6666666666666666D - var22) * (-var16 + var14) * 6.0D + var16;
            } else {
                var12 = var16;
            }
        }
        int var24 = (int) (var10 * 256.0D);
        int var25 = (int) (var8 * 256.0D);
        int var26 = (int) (var12 * 256.0D);
        return (var24 << 16) + (var25 << 8) + var26;
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(II)I", line = 380)
    public static int method131(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(ZLh;)V", line = 392)
    public final void method132(boolean arg0, class14 arg1) {
        class39 var3 = new class39(arg1.method207(class24.field227, 10172, class26.field371));
        int var4 = var3.method253(!arg0);
        int var5 = var3.method253(false);
        int var6 = var3.method253(!arg0);
        int var7 = var3.method253(!arg0);
        int var8 = var3.method253(false);
        int var9 = var3.method253(false);
        var3.method249((byte) 8);
        class9.field88 = (var7 + 1 - var5) * 64;
        class5.field48 = var5 * 64;
        class29.field400 = (var6 - var4) * 64 + 64;
        field214 = class5.field48 + class9.field88 - var9 * 64;
        class2.field23 = var4 * 64;
        class4.field45 = var8 * 64 - class2.field23;
        this.method126(90, class9.field88, class29.field400);
        class39 var10 = new class39(arg1.method207(class11.field114, 10172, class26.field371));
        if (!arg0) {
            this.method139(null, -40);
        }
        int var11 = var10.method253(false);
        class14.field126 = new int[var11 + 1];
        for (int var12 = 0; var12 < var11; var12++) {
            class14.field126[var12 + 1] = var10.method250(26078);
        }
        int var13 = var10.method253(false);
        class7.field69 = new int[var13 + 1];
        for (int var14 = 0; var14 < var13; var14++) {
            class7.field69[var14 + 1] = var10.method250(26078);
        }
        byte[] var15 = arg1.method207(class10.field99, 10172, class26.field371);
        byte[][] var16 = new byte[class29.field400][class9.field88];
        this.method128(var16, var15, 64);
        byte[] var17 = arg1.method207(class26.field362, 10172, class26.field371);
        this.method140(false, var17);
        byte[] var18 = arg1.method207(class35.field476, 10172, class26.field371);
        this.method139(var18, 63);
        byte[] var19 = arg1.method207(class2.field15, 10172, class26.field371);
        class28.field387 = 0;
        this.method141(2, var19);
        this.method127(-706, var16);
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(IIIIIIIIIII)V", line = 473)
    public final void method133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (this.field217 == 0) {
            int var12 = arg3 - arg5;
            int var13 = arg10 - arg6;
            int var14 = (arg9 - arg7 << 16) / var13;
            int var15 = (arg1 - arg2 << 16) / var12;
            for (int var16 = 0; var16 < var12; var16++) {
                int var17 = (var16 + 1) * var15 >> 16;
                int var18 = var15 * var16 >> 16;
                int var19 = var17 - var18;
                if (var19 > 0) {
                    class31.method197(arg5 + var16, arg8 + -131, arg6);
                    for (int var20 = 0; var20 < var13; var20++) {
                        int var21 = var14 * var20 >> 16;
                        int var22 = (var20 + 1) * var14 >> 16;
                        int var23 = var22 - var21;
                        if (var23 > 0) {
                            int var24 = class4.method40((byte) -7) & 0xFF;
                            if (var24 != 0) {
                                this.field219[this.field217] = var24 - 1;
                                this.field215[this.field217] = var19 / 2 + var18;
                                this.field211[this.field217] = var23 / 2 + var21;
                                this.field217++;
                            }
                        }
                        class11.method62((byte) -111);
                    }
                }
            }
        }
        for (int var25 = 0; var25 < this.field217; var25++) {
            if (class31.field422[this.field219[var25]] != null) {
                class31.field422[this.field219[var25]].method242(this.field215[var25] - 7, this.field211[var25] + -7);
            }
        }
        if (arg8 != 15) {
            this.field219 = null;
        }
        if (arg0 > 0) {
            for (int var26 = 0; var26 < this.field217; var26++) {
                if (this.field219[var26] == arg4) {
                    class31.field422[this.field219[var26]].method242(this.field215[var26] - 7, this.field211[var26] + -7);
                    if (arg0 % 10 < 5) {
                        class32.method215(this.field215[var26], this.field211[var26], 15, 16776960, 128);
                        class32.method215(this.field215[var26], this.field211[var26], 7, 16777215, 256);
                    }
                }
            }
        }
        this.field217 = 0;
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(BIIIIIIII)V", line = 582)
    public final void method134(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg3 - arg6;
        this.field217 = 0;
        int var11 = 26 % ((-arg0 - 31) / 54);
        int var12 = arg4 - arg1;
        int var13 = (arg7 - arg2 << 16) / var12;
        int var14 = (arg5 - arg8 << 16) / var10;
        for (int var15 = 0; var15 < var10; var15++) {
            int var16 = var14 * var15 >> 16;
            int var17 = (var15 + 1) * var14 >> 16;
            int var18 = var17 - var16;
            if (var18 > 0) {
                class31.method197(arg6 + var15, -66, arg1);
                for (int var19 = 0; var19 < var12; var19++) {
                    int var20 = var13 * var19 >> 16;
                    int var21 = (var19 + 1) * var13 >> 16;
                    int var22 = var21 - var20;
                    if (var22 > 0) {
                        int var23 = class27.method179(0) & 0xFF;
                        if (var23 != 0) {
                            int var24;
                            if (var22 == 1) {
                                var24 = var20;
                            } else {
                                var24 = var21 - 1;
                            }
                            int var25;
                            if (var18 == 1) {
                                var25 = var16;
                            } else {
                                var25 = var17 - 1;
                            }
                            int var26 = 13421772;
                            if (var23 >= 5 && var23 <= 8 || var23 >= 13 && var23 <= 16 || var23 >= 21 && var23 <= 24 || var23 == 27 || var23 == 28) {
                                var26 = 13369344;
                                var23 -= 4;
                            }
                            if (var23 == 1) {
                                class32.method210(var16, var20, var22, var26);
                            } else if (var23 == 2) {
                                class32.method211(var16, var20, var18, var26);
                            } else if (var23 == 3) {
                                class32.method210(var25, var20, var22, var26);
                            } else if (var23 == 4) {
                                class32.method211(var16, var24, var18, var26);
                            } else if (var23 == 9) {
                                class32.method210(var16, var20, var22, 16777215);
                                class32.method211(var16, var20, var18, var26);
                            } else if (var23 == 10) {
                                class32.method210(var25, var20, var22, 16777215);
                                class32.method211(var16, var20, var18, var26);
                            } else if (var23 == 11) {
                                class32.method210(var25, var20, var22, 16777215);
                                class32.method211(var16, var24, var18, var26);
                            } else if (var23 == 12) {
                                class32.method210(var16, var20, var22, 16777215);
                                class32.method211(var16, var24, var18, var26);
                            } else if (var23 == 17) {
                                class32.method211(var16, var20, 1, var26);
                            } else if (var23 == 18) {
                                class32.method211(var25, var20, 1, var26);
                            } else if (var23 == 19) {
                                class32.method211(var25, var24, 1, var26);
                            } else if (var23 == 20) {
                                class32.method211(var16, var24, 1, var26);
                            } else if (var23 == 25) {
                                for (int var28 = 0; var28 < var22; var28++) {
                                    class32.method211(var16 + var28, -var28 + var24, 1, var26);
                                }
                            } else if (var23 == 26) {
                                for (int var27 = 0; var27 < var22; var27++) {
                                    class32.method211(var16 + var27, var20 + var27, 1, var26);
                                }
                            }
                        }
                        int var29 = class4.method40((byte) -7) & 0xFF;
                        if (var29 != 0) {
                            this.field219[this.field217] = var29 - 1;
                            this.field215[this.field217] = var18 / 2 + var16;
                            this.field211[this.field217] = var20 + var22 / 2;
                            this.field217++;
                        }
                    }
                    class11.method62((byte) -111);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(IIDIIIIIII)V", line = 765)
    public final void method135(int arg0, int arg1, double arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var12 = arg8 - arg0;
        if (arg5 != 16776960) {
            return;
        }
        int var13 = (arg7 - arg4 << 16) / var12;
        int var14 = arg3 - arg1;
        int var15 = (arg9 - arg6 << 16) / var14;
        if (arg7 - arg4 < -arg0 + arg8) {
            return;
        }
        this.field217 = 0;
        for (int var16 = 0; var16 < var12; var16++) {
            int var17 = (var16 + 1) * var13 >> 16;
            int var18 = var13 * var16 >> 16;
            int var19 = var17 - var18;
            if (var19 > 0) {
                class31.method197(arg0 + var16, arg5 + -16777032, arg1);
                for (int var20 = 0; var20 < var14; var20++) {
                    int var21 = var15 * var20 >> 16;
                    int var22 = (var20 + 1) * var15 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = class24.method145((byte) -115) & 0xFF;
                        if (var24 != 0) {
                            if (var24 == 47 || var24 == 53) {
                                class5.field55[var24 - 1].method227(var18, var21, var19 * 2 + 1, var23 * 2 + 1);
                                if (!(arg2 < 4.0D) && arg2 > 4.2D && arg2 > 6.2D) {
                                }
                            } else {
                                class5.field55[var24 - 1].method227(var18 - var19 / 2, -(var23 / 2) + var21, var19 * 2, var23 * 2);
                            }
                        }
                    }
                    class11.method62((byte) -111);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(I)Z", line = 879)
    public static final boolean method136(int arg0) {
        class13 var1 = class2.field13;
        synchronized (class2.field13) {
            if (class27.field381 == field210) {
                return false;
            }
            class8.field78 = class3.field32[class27.field381];
            class28.field392 = class10.field108[class27.field381];
            class27.field381 = class27.field381 + 1 & 0x7F;
            if (arg0 <= 38) {
                field221 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(BIIIIIIIZ[I)V", line = 900)
    private final void method137(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int[] arg9) {
        if (arg6 == 9) {
            arg1 = arg1 + 1 & 0x3;
            arg6 = 1;
        }
        int var11 = 73 / ((75 - arg0) / 40);
        if (arg6 == 10) {
            arg6 = 1;
            arg1 = arg1 + 3 & 0x3;
        }
        if (arg6 == 11) {
            arg6 = 8;
            arg1 = arg1 + 3 & 0x3;
        }
        int var12 = class32.field445 - arg4;
        if (arg6 == 1) {
            if (arg1 == 0) {
                for (int var75 = 0; var75 < arg5; var75++) {
                    for (int var76 = 0; var76 < arg4; var76++) {
                        if (var75 >= var76) {
                            arg9[arg7] = arg2;
                        } else if (arg8) {
                            arg9[arg7] = arg3;
                        }
                        arg7++;
                    }
                    arg7 += var12;
                }
            } else if (arg1 == 1) {
                for (int var73 = arg5 - 1; var73 >= 0; var73--) {
                    for (int var74 = 0; var74 < arg4; var74++) {
                        if (var73 >= var74) {
                            arg9[arg7] = arg2;
                        } else if (arg8) {
                            arg9[arg7] = arg3;
                        }
                        arg7++;
                    }
                    arg7 += var12;
                }
            } else if (arg1 == 2) {
                for (int var71 = 0; var71 < arg5; var71++) {
                    for (int var72 = 0; var72 < arg4; var72++) {
                        if (var71 <= var72) {
                            arg9[arg7] = arg2;
                        } else if (arg8) {
                            arg9[arg7] = arg3;
                        }
                        arg7++;
                    }
                    arg7 += var12;
                }
            } else if (arg1 == 3) {
                for (int var69 = arg5 - 1; var69 >= 0; var69--) {
                    for (int var70 = 0; var70 < arg4; var70++) {
                        if (var70 >= var69) {
                            arg9[arg7] = arg2;
                        } else if (arg8) {
                            arg9[arg7] = arg3;
                        }
                        arg7++;
                    }
                    arg7 += var12;
                }
            }
        } else if (arg6 == 2) {
            if (arg1 == 0) {
                for (int var61 = arg5 - 1; var61 >= 0; var61--) {
                    for (int var62 = 0; var62 < arg4; var62++) {
                        if (var62 <= var61 >> 1) {
                            arg9[arg7] = arg2;
                        } else if (arg8) {
                            arg9[arg7] = arg3;
                        }
                        arg7++;
                    }
                    arg7 += var12;
                }
            } else if (arg1 == 1) {
                for (int var63 = 0; var63 < arg5; var63++) {
                    for (int var64 = 0; var64 < arg4; var64++) {
                        if (var64 >= var63 << 1) {
                            arg9[arg7] = arg2;
                        } else if (arg8) {
                            arg9[arg7] = arg3;
                        }
                        arg7++;
                    }
                    arg7 += var12;
                }
            } else if (arg1 == 2) {
                for (int var65 = 0; var65 < arg5; var65++) {
                    for (int var66 = arg4 - 1; var66 >= 0; var66--) {
                        if (var65 >> 1 >= var66) {
                            arg9[arg7] = arg2;
                        } else if (arg8) {
                            arg9[arg7] = arg3;
                        }
                        arg7++;
                    }
                    arg7 += var12;
                }
            } else if (arg1 == 3) {
                for (int var67 = arg5 - 1; var67 >= 0; var67--) {
                    for (int var68 = arg4 - 1; var68 >= 0; var68--) {
                        if (var67 << 1 <= var68) {
                            arg9[arg7] = arg2;
                        } else if (arg8) {
                            arg9[arg7] = arg3;
                        }
                        arg7++;
                    }
                    arg7 += var12;
                }
            }
        } else if (arg6 == 3) {
            if (arg1 == 0) {
                for (int var59 = arg5 - 1; var59 >= 0; var59--) {
                    for (int var60 = arg4 - 1; var60 >= 0; var60--) {
                        if (var59 >> 1 >= var60) {
                            arg9[arg7] = arg2;
                        } else if (arg8) {
                            arg9[arg7] = arg3;
                        }
                        arg7++;
                    }
                    arg7 += var12;
                }
            } else if (arg1 == 1) {
                for (int var57 = arg5 - 1; var57 >= 0; var57--) {
                    for (int var58 = 0; var58 < arg4; var58++) {
                        if (var58 >= var57 << 1) {
                            arg9[arg7] = arg2;
                        } else if (arg8) {
                            arg9[arg7] = arg3;
                        }
                        arg7++;
                    }
                    arg7 += var12;
                }
            } else if (arg1 == 2) {
                for (int var53 = 0; var53 < arg5; var53++) {
                    for (int var54 = 0; var54 < arg4; var54++) {
                        if (var54 <= var53 >> 1) {
                            arg9[arg7] = arg2;
                        } else if (arg8) {
                            arg9[arg7] = arg3;
                        }
                        arg7++;
                    }
                    arg7 += var12;
                }
            } else if (arg1 == 3) {
                for (int var55 = 0; var55 < arg5; var55++) {
                    for (int var56 = arg4 - 1; var56 >= 0; var56--) {
                        if (var55 << 1 <= var56) {
                            arg9[arg7] = arg2;
                        } else if (arg8) {
                            arg9[arg7] = arg3;
                        }
                        arg7++;
                    }
                    arg7 += var12;
                }
            }
        } else if (arg6 == 4) {
            if (arg1 == 0) {
                for (int var45 = arg5 - 1; var45 >= 0; var45--) {
                    for (int var46 = 0; var46 < arg4; var46++) {
                        if (var46 >= var45 >> 1) {
                            arg9[arg7] = arg2;
                        } else if (arg8) {
                            arg9[arg7] = arg3;
                        }
                        arg7++;
                    }
                    arg7 += var12;
                }
            } else if (arg1 == 1) {
                for (int var47 = 0; var47 < arg5; var47++) {
                    for (int var48 = 0; var48 < arg4; var48++) {
                        if (var48 <= var47 << 1) {
                            arg9[arg7] = arg2;
                        } else if (arg8) {
                            arg9[arg7] = arg3;
                        }
                        arg7++;
                    }
                    arg7 += var12;
                }
            } else if (arg1 == 2) {
                for (int var51 = 0; var51 < arg5; var51++) {
                    for (int var52 = arg4 - 1; var52 >= 0; var52--) {
                        if (var52 >= var51 >> 1) {
                            arg9[arg7] = arg2;
                        } else if (arg8) {
                            arg9[arg7] = arg3;
                        }
                        arg7++;
                    }
                    arg7 += var12;
                }
            } else if (arg1 == 3) {
                for (int var49 = arg5 - 1; var49 >= 0; var49--) {
                    for (int var50 = arg4 - 1; var50 >= 0; var50--) {
                        if (var50 <= var49 << 1) {
                            arg9[arg7] = arg2;
                        } else if (arg8) {
                            arg9[arg7] = arg3;
                        }
                        arg7++;
                    }
                    arg7 += var12;
                }
            }
        } else if (arg6 != 5) {
            if (arg6 == 6) {
                if (arg1 == 0) {
                    for (int var43 = 0; var43 < arg5; var43++) {
                        for (int var44 = 0; var44 < arg4; var44++) {
                            if (arg4 / 2 >= var44) {
                                arg9[arg7] = arg2;
                            } else if (arg8) {
                                arg9[arg7] = arg3;
                            }
                            arg7++;
                        }
                        arg7 += var12;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var41 = 0; var41 < arg5; var41++) {
                        for (int var42 = 0; var42 < arg4; var42++) {
                            if (var41 <= arg5 / 2) {
                                arg9[arg7] = arg2;
                            } else if (arg8) {
                                arg9[arg7] = arg3;
                            }
                            arg7++;
                        }
                        arg7 += var12;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var39 = 0; var39 < arg5; var39++) {
                        for (int var40 = 0; var40 < arg4; var40++) {
                            if (var40 >= arg4 / 2) {
                                arg9[arg7] = arg2;
                            } else if (arg8) {
                                arg9[arg7] = arg3;
                            }
                            arg7++;
                        }
                        arg7 += var12;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var37 = 0; var37 < arg5; var37++) {
                        for (int var38 = 0; var38 < arg4; var38++) {
                            if (var37 >= arg5 / 2) {
                                arg9[arg7] = arg2;
                            } else if (arg8) {
                                arg9[arg7] = arg3;
                            }
                            arg7++;
                        }
                        arg7 += var12;
                    }
                    return;
                }
            }
            if (arg6 == 7) {
                if (arg1 == 0) {
                    for (int var35 = 0; var35 < arg5; var35++) {
                        for (int var36 = 0; var36 < arg4; var36++) {
                            if (var36 <= var35 - arg5 / 2) {
                                arg9[arg7] = arg2;
                            } else if (arg8) {
                                arg9[arg7] = arg3;
                            }
                            arg7++;
                        }
                        arg7 += var12;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var21 = arg5 - 1; var21 >= 0; var21--) {
                        for (int var22 = 0; var22 < arg4; var22++) {
                            if (var21 - arg5 / 2 >= var22) {
                                arg9[arg7] = arg2;
                            } else if (arg8) {
                                arg9[arg7] = arg3;
                            }
                            arg7++;
                        }
                        arg7 += var12;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var23 = arg5 - 1; var23 >= 0; var23--) {
                        for (int var24 = arg4 - 1; var24 >= 0; var24--) {
                            if (var24 <= var23 - arg5 / 2) {
                                arg9[arg7] = arg2;
                            } else if (arg8) {
                                arg9[arg7] = arg3;
                            }
                            arg7++;
                        }
                        arg7 += var12;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var33 = 0; var33 < arg5; var33++) {
                        for (int var34 = arg4 - 1; var34 >= 0; var34--) {
                            if (var34 <= var33 - arg5 / 2) {
                                arg9[arg7] = arg2;
                            } else if (arg8) {
                                arg9[arg7] = arg3;
                            }
                            arg7++;
                        }
                        arg7 += var12;
                    }
                    return;
                }
            }
            if (arg6 == 8) {
                if (arg1 == 0) {
                    for (int var31 = 0; var31 < arg5; var31++) {
                        for (int var32 = 0; var32 < arg4; var32++) {
                            if (var32 >= var31 - arg5 / 2) {
                                arg9[arg7] = arg2;
                            } else if (arg8) {
                                arg9[arg7] = arg3;
                            }
                            arg7++;
                        }
                        arg7 += var12;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var25 = arg5 - 1; var25 >= 0; var25--) {
                        for (int var26 = 0; var26 < arg4; var26++) {
                            if (var26 >= var25 - arg5 / 2) {
                                arg9[arg7] = arg2;
                            } else if (arg8) {
                                arg9[arg7] = arg3;
                            }
                            arg7++;
                        }
                        arg7 += var12;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var27 = arg5 - 1; var27 >= 0; var27--) {
                        for (int var28 = arg4 - 1; var28 >= 0; var28--) {
                            if (var27 - arg5 / 2 <= var28) {
                                arg9[arg7] = arg2;
                            } else if (arg8) {
                                arg9[arg7] = arg3;
                            }
                            arg7++;
                        }
                        arg7 += var12;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var29 = 0; var29 < arg5; var29++) {
                        for (int var30 = arg4 - 1; var30 >= 0; var30--) {
                            if (var29 - arg5 / 2 <= var30) {
                                arg9[arg7] = arg2;
                            } else if (arg8) {
                                arg9[arg7] = arg3;
                            }
                            arg7++;
                        }
                        arg7 += var12;
                    }
                    return;
                }
            }
        } else if (arg1 == 0) {
            for (int var13 = arg5 - 1; var13 >= 0; var13--) {
                for (int var14 = arg4 - 1; var14 >= 0; var14--) {
                    if (var14 >= var13 >> 1) {
                        arg9[arg7] = arg2;
                    } else if (arg8) {
                        arg9[arg7] = arg3;
                    }
                    arg7++;
                }
                arg7 += var12;
            }
        } else if (arg1 == 1) {
            for (int var19 = arg5 - 1; var19 >= 0; var19--) {
                for (int var20 = 0; var20 < arg4; var20++) {
                    if (var19 << 1 >= var20) {
                        arg9[arg7] = arg2;
                    } else if (arg8) {
                        arg9[arg7] = arg3;
                    }
                    arg7++;
                }
                arg7 += var12;
            }
        } else if (arg1 == 2) {
            for (int var15 = 0; var15 < arg5; var15++) {
                for (int var16 = 0; var16 < arg4; var16++) {
                    if (var15 >> 1 <= var16) {
                        arg9[arg7] = arg2;
                    } else if (arg8) {
                        arg9[arg7] = arg3;
                    }
                    arg7++;
                }
                arg7 += var12;
            }
        } else if (arg1 == 3) {
            for (int var17 = 0; var17 < arg5; var17++) {
                for (int var18 = arg4 - 1; var18 >= 0; var18--) {
                    if (var18 <= var17 << 1) {
                        arg9[arg7] = arg2;
                    } else if (arg8) {
                        arg9[arg7] = arg3;
                    }
                    arg7++;
                }
                arg7 += var12;
            }
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(BJ)V", line = 2027)
    public static final void method138(byte arg0, long arg1) {
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
        if (arg0 < 68) {
            method142(null, null);
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "([BI)V", line = 2053)
    private final void method139(byte[] arg0, int arg1) {
        if (arg1 != 63) {
            return;
        }
        int var3 = 0;
        while (true) {
            while (var3 < arg0.length) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - class2.field23;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class5.field48;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class29.field400 && class9.field88 > var5 + 64) {
                    class28.field395 = class9.field88 - var5 - 1 >> 6;
                    class4.field42 = var4 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg0[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg0[var3++];
                                class25.method169(var4 + var6, -var5 + class9.field88 - 64 + -var7 + -1, var9, 4, 4096);
                                if (class33.field459[class28.field395][class4.field42] == null) {
                                    class33.field459[class28.field395][class4.field42] = new class40();
                                    class33.field459[class28.field395][class4.field42].field509 = new byte[4096];
                                }
                                class33.field459[class28.field395][class4.field42].field509[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class33.field459[class28.field395][class4.field42] != null) {
                        class33.field459[class28.field395][class4.field42].method258(arg1 ^ 0x3F);
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
            return;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(Z[B)V", line = 2137)
    private final void method140(boolean arg0, byte[] arg1) {
        if (arg0) {
            this.method135(57, 22, 0.48295259453817796D, 21, 40, 98, 65, -60, 17, 12);
        }
        int var3 = 0;
        while (true) {
            while (var3 < arg1.length) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class2.field23;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class5.field48;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class29.field400 && var5 + 64 < class9.field88) {
                    class4.field42 = var4 >> 6;
                    class28.field395 = class9.field88 - var5 - 1 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg1[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg1[var3++];
                                class25.method169(var4 + var6, -1 - var7 + -var5 + -64 + class9.field88, var9, 3, 4096);
                                if (class35.field473[class28.field395][class4.field42] == null) {
                                    class35.field473[class28.field395][class4.field42] = new class40();
                                    class35.field473[class28.field395][class4.field42].field509 = new byte[4096];
                                }
                                class35.field473[class28.field395][class4.field42].field509[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class35.field473[class28.field395][class4.field42] != null) {
                        class35.field473[class28.field395][class4.field42].method258(0);
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

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(I[B)V", line = 2223)
    private final void method141(int arg0, byte[] arg1) {
        int var3 = 0;
        while (true) {
            while (arg1.length > var3) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class2.field23;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class5.field48;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class29.field400 && var5 + 64 < class9.field88) {
                    for (int var6 = 0; var6 < 64; var6++) {
                        int var7 = class9.field88 - var5 - 1;
                        for (int var8 = -64; var8 < 0; var8++) {
                            while (true) {
                                int var9 = arg1[var3++] & 0xFF;
                                if (var9 == 0) {
                                    break;
                                }
                                if (var9 < 29) {
                                    class25.method169(var4 + var6, -1 - (var8 - (-var5 + -64 + class9.field88)), (byte) var9, 0, 4096);
                                } else if (var9 >= 160) {
                                    class25.method169(var4 + var6, class9.field88 - var5 + -var8 + -1 + -64, (byte) (var9 - 159), 2, 4096);
                                    if (class28.field387 >= 1500) {
                                        break;
                                    }
                                    this.field220[class28.field387] = var4 + var6;
                                    this.field218[class28.field387] = var7;
                                    this.field213[class28.field387] = var9 - 160;
                                    class28.field387++;
                                } else {
                                    class25.method169(var4 + var6, -var5 + class9.field88 + -var8 + -64 + -1, (byte) (var9 - 28), 1, arg0 + 4094);
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
            if (arg0 != 2) {
                this.method133(-84, -35, -57, -76, 122, -26, -69, 108, -1, -61, -114);
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Ld;", line = 2328)
    public static final class6 method142(Throwable arg0, String arg1) {
        class6 var2;
        if (arg0 instanceof class6) {
            var2 = (class6) arg0;
            var2.field64 = var2.field64 + ' ' + arg1;
        } else {
            var2 = new class6(arg0, arg1);
        }
        return var2;
    }
}
