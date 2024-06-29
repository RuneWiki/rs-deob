import java.awt.FontMetrics;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ca")
public class class6 {

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "[I")
    private int[] field69 = new int[1500];

    @OriginalMember(owner = "mapview!ca", name = "h", descriptor = "[I")
    private int[] field75 = new int[1500];

    @OriginalMember(owner = "mapview!ca", name = "g", descriptor = "[I")
    public int[] field74 = new int[1500];

    @OriginalMember(owner = "mapview!ca", name = "c", descriptor = "[I")
    public int[] field70 = new int[1500];

    @OriginalMember(owner = "mapview!ca", name = "f", descriptor = "[I")
    private int[] field73 = new int[1500];

    @OriginalMember(owner = "mapview!ca", name = "n", descriptor = "[I")
    public int[] field81 = new int[1500];

    @OriginalMember(owner = "mapview!ca", name = "o", descriptor = "I")
    private int field82 = 0;

    @OriginalMember(owner = "mapview!ca", name = "k", descriptor = "Lv;")
    public static class40 field78 = class24.method170("Altar", (byte) 70);

    @OriginalMember(owner = "mapview!ca", name = "l", descriptor = "I")
    public static int field79 = -1;

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "Lv;")
    private static class40 field68 = class24.method170("details)3dat", (byte) 58);

    @OriginalMember(owner = "mapview!ca", name = "i", descriptor = "Lv;")
    public static class40 field76 = class24.method170("Hair Dressers", (byte) -124);

    @OriginalMember(owner = "mapview!ca", name = "e", descriptor = "Lv;")
    public static class40 field72 = class24.method170("Furnace", (byte) -75);

    @OriginalMember(owner = "mapview!ca", name = "d", descriptor = "I")
    public static int field71 = 0;

    @OriginalMember(owner = "mapview!ca", name = "q", descriptor = "I")
    public static int field84 = 0;

    @OriginalMember(owner = "mapview!ca", name = "r", descriptor = "I")
    public static volatile int field85 = 0;

    @OriginalMember(owner = "mapview!ca", name = "m", descriptor = "Lv;")
    private static class40 field80 = class24.method170("loc)3dat", (byte) 86);

    @OriginalMember(owner = "mapview!ca", name = "p", descriptor = "Lv;")
    public static class40 field83;

    @OriginalMember(owner = "mapview!ca", name = "j", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field77;

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(IIIIIDIIII)V", line = 8)
    public final void method39(int arg0, int arg1, int arg2, int arg3, int arg4, double arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg9 != 1) {
            field76 = null;
        }
        int var12 = arg2 - arg7;
        int var13 = arg8 - arg6;
        int var14 = (arg0 - arg3 << 16) / var12;
        int var15 = (arg4 - arg1 << 16) / var13;
        if (arg0 - arg3 < -arg7 + arg2) {
            return;
        }
        this.field82 = 0;
        for (int var16 = 0; var16 < var12; var16++) {
            int var17 = var14 * var16 >> 16;
            int var18 = (var16 + 1) * var14 >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                class26.method186(arg7 + var16, arg6, 63);
                for (int var20 = 0; var20 < var13; var20++) {
                    int var21 = var15 * var20 >> 16;
                    int var22 = (var20 + 1) * var15 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = class35.method213(-68) & 0xFF;
                        if (var24 != 0) {
                            if (var24 == 47 || var24 == 53) {
                                class5.field56[var24 - 1].method235(var17, var21, var19 * 2 + 1, var23 * 2 + 1);
                                if (!(arg5 < 4.0D) && arg5 > 4.2D && !(arg5 > 6.2D)) {
                                }
                            } else {
                                class5.field56[var24 - 1].method235(var17 - var19 / 2, -(var23 / 2) + var21, var19 * 2, var23 * 2);
                            }
                        }
                    }
                    class32.method204((byte) -93);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(IIZIIIIII)V", line = 126)
    public final void method40(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg6 - arg7;
        int var11 = arg5 - arg1;
        int var12 = (arg3 - arg8 << 16) / var11;
        int var13 = (arg0 - arg4 << 16) / var10;
        for (int var14 = 0; var14 < var10; var14++) {
            int var15 = var13 * var14 >> 16;
            int var16 = (var14 + 1) * var13 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                class26.method186(arg7 + var14, arg1, 63);
                int var18 = arg4 + var15;
                int var19 = arg4 + var16;
                for (int var20 = 0; var20 < var11; var20++) {
                    int var21 = var12 * var20 >> 16;
                    int var22 = (var20 + 1) * var12 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = arg8 + var21;
                        int var25 = arg8 + var22;
                        int var26 = class37.method225(0);
                        int var27 = class39.method238(!arg2);
                        if (var26 == 0 && var27 == 0) {
                            class2.method6(var18, var24, var19 - var18, -var24 + var25, class40.method265((byte) -89));
                        } else {
                            byte var28 = class20.method121(-113);
                            int var29 = var28 & 0xFC;
                            if (var29 == 0 || var17 <= 1 || var23 <= 1) {
                                class2.method6(var18, var24, var17, var23, var26);
                            } else {
                                this.method52(class2.field45 * var24 + var18, var17, var23, class2.field48, (byte) 48, var29 >> 2, true, var26, var28 & 0x3, class40.method265((byte) -89));
                            }
                            if (var27 > 0) {
                                byte var30 = class15.method80((byte) 36);
                                int var31 = var30 & 0xFC;
                                if (var31 == 0 || var17 <= 1 || var23 <= 1) {
                                    class2.method6(var18, var24, var17, var23, var27);
                                }
                                this.method52(class2.field45 * var24 + var18, var17, var23, class2.field48, (byte) 59, var31 >> 2, var26 == 0, var27, var30 & 0x3, class40.method265((byte) -89));
                            }
                        }
                    }
                    class32.method204((byte) -111);
                }
            }
        }
        if (!arg2) {
            this.method45(70, -10, 73, -11, 108, -114, -57, 48, 8, 99, 40);
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(DDDI)I", line = 218)
    private final int method41(double arg0, double arg1, double arg2, int arg3) {
        double var8 = arg0;
        double var10 = arg0;
        double var12 = arg0;
        if (arg2 != 0.0D) {
            double var14;
            if (arg0 < 0.5D) {
                var14 = (arg2 + 1.0D) * arg0;
            } else {
                var14 = arg0 + arg2 - arg0 * arg2;
            }
            double var16 = arg1 - 0.3333333333333333D;
            if (var16 < 0.0D) {
                var16++;
            }
            double var20 = arg1 + 0.3333333333333333D;
            double var22 = arg0 * 2.0D - var14;
            if (var16 * 6.0D < 1.0D) {
                var12 = (var14 - var22) * 6.0D * var16 + var22;
            } else if (var16 * 2.0D < 1.0D) {
                var12 = var14;
            } else if (var16 * 3.0D < 2.0D) {
                var12 = (var14 - var22) * (-var16 + 0.6666666666666666D) * 6.0D + var22;
            } else {
                var12 = var22;
            }
            if (var20 > 1.0D) {
                var20--;
            }
            if (var20 * 6.0D < 1.0D) {
                var8 = (var14 - var22) * 6.0D * var20 + var22;
            } else if (var20 * 2.0D < 1.0D) {
                var8 = var14;
            } else if (var20 * 3.0D < 2.0D) {
                var8 = (0.6666666666666666D - var20) * (-var22 + var14) * 6.0D + var22;
            } else {
                var8 = var22;
            }
            if (arg1 * 6.0D < 1.0D) {
                var10 = (var14 - var22) * 6.0D * arg1 + var22;
            } else if (arg1 * 2.0D < 1.0D) {
                var10 = var14;
            } else if (arg1 * 3.0D < 2.0D) {
                var10 = (0.6666666666666666D - arg1) * (-var22 + var14) * 6.0D + var22;
            } else {
                var10 = var22;
            }
        }
        int var24 = (int) (var8 * 256.0D);
        int var25 = (int) (var10 * 256.0D);
        int var26 = -75 / ((arg3 - 76) / 38);
        int var27 = (int) (var12 * 256.0D);
        return (var24 << 16) + (var25 << 8) + var27;
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(IZI)V", line = 307)
    private final void method42(int arg0, boolean arg1, int arg2) {
        int var4 = arg2 >> 6;
        int var5 = arg0 >> 6;
        class40.field519 = new class23[var4][var5];
        class34.field454[3] = new byte[var4][var5][];
        class11.field115 = new class23[var4][var5];
        class34.field454[2] = new byte[var4][var5][];
        class34.field454[0] = new byte[var4][var5][];
        class24.field370 = new int[var4][var5][];
        class34.field454[4] = new byte[var4][var5][];
        class34.field454[1] = new byte[var4][var5][];
        if (arg1) {
            this.method43(43, null);
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(I[[B)V", line = 346)
    private final void method43(int arg0, byte[][] arg1) {
        int var3 = class25.field377;
        int[] var4 = new int[var3];
        int var5 = class14.field138;
        for (int var6 = 0; var6 < var3; var6++) {
            var4[var6] = 0;
        }
        for (int var7 = 5; var7 < var5 - 5; var7++) {
            byte[] var8 = arg1[var7 + 5];
            byte[] var9 = arg1[var7 - 5];
            for (int var10 = 0; var10 < var3; var10++) {
                int var11 = class32.field444[var8[var10] & 0xFF];
                int var12 = class32.field444[var9[var10] & 0xFF];
                if (var11 <= 0 && class27.method189(var10, var7 + 5, (byte) 118) > 0) {
                    var11 = 64;
                }
                if (var12 <= 0 && class27.method189(var10, var7 - 5, (byte) 112) > 0) {
                    var12 = 64;
                }
                var4[var10] += var11 - var12;
            }
            if (var7 > 10 && var7 < var5 - 10) {
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                for (int var16 = 5; var16 < var3 - 5; var16++) {
                    int var17 = var4[var16 + 5];
                    int var18 = var4[var16 - 5];
                    var15 += (var17 & 0x3FF) - (var18 & 0x3FF);
                    var14 += (var17 >> 10 & 0x3FF) - ((var18 & 0xFFCF7) >> 10);
                    var13 += (var17 >> 20) - (var18 >> 20);
                    if (var15 > 0) {
                        int var19 = var7 >> 6;
                        int var20 = var16 >> 6;
                        if (class24.field370[var20][var19] == null) {
                            class24.field370[var20][var19] = new int[4096];
                        }
                        if ((arg1[var7][var16] & 0xFF) <= 0) {
                            class24.field370[var20][var19][class39.method241(63, var7) + (class39.method241(var16, 63) << 6)] = 0;
                        } else {
                            class24.field370[var20][var19][class39.method241(var7, 63) + (class39.method241(63, var16) << 6)] = this.method41((double) var15 / 8533.0D, (double) var13 / 8533.0D, (double) var14 / 8533.0D, -34);
                        }
                    }
                }
            }
        }
        if (arg0 != 1482747398) {
            field72 = null;
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "([BB)V", line = 451)
    private final void method44(byte[] arg0, byte arg1) {
        int var3 = 0;
        if (arg1 > -117) {
            field79 = -118;
        }
        while (true) {
            while (arg0.length > var3) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - class35.field466;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class25.field379;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class14.field138 && var5 + 64 < class25.field377) {
                    class40.field520 = var4 >> 6;
                    class40.field514 = class25.field377 - var5 - 1 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg0[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg0[var3++];
                                class1.method5(var4 + var6, var9, -102, 4, class25.field377 - var5 - var7 - 1 - 64);
                                if (class11.field115[class40.field514][class40.field520] == null) {
                                    class11.field115[class40.field514][class40.field520] = new class23();
                                    class11.field115[class40.field514][class40.field520].field264 = new byte[4096];
                                }
                                class11.field115[class40.field514][class40.field520].field264[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class11.field115[class40.field514][class40.field520] != null) {
                        class11.field115[class40.field514][class40.field520].method149(-4097);
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

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(IIIIIIIIIII)V", line = 538)
    public final void method45(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (this.field82 == 0) {
            int var12 = arg3 - arg1;
            int var13 = arg0 - arg6;
            int var14 = (arg9 - arg4 << 16) / var12;
            int var15 = (arg10 - arg8 << 16) / var13;
            for (int var16 = 0; var16 < var12; var16++) {
                int var17 = (var16 + 1) * var14 >> 16;
                int var18 = var14 * var16 >> 16;
                int var19 = var17 - var18;
                if (var19 > 0) {
                    class26.method186(var16 + arg1, arg6, arg2 + 39);
                    for (int var20 = 0; var20 < var13; var20++) {
                        int var21 = var15 * var20 >> 16;
                        int var22 = (var20 + 1) * var15 >> 16;
                        int var23 = var22 - var21;
                        if (var23 > 0) {
                            int var24 = class12.method70((byte) 126) & 0xFF;
                            if (var24 != 0) {
                                this.field69[this.field82] = var24 - 1;
                                this.field75[this.field82] = var19 / 2 + var18;
                                this.field73[this.field82] = var21 + var23 / 2;
                                this.field82++;
                            }
                        }
                        class32.method204((byte) -100);
                    }
                }
            }
        }
        if (arg2 != 24) {
            this.method40(11, -2, true, -24, 59, -47, 12, 87, 15);
        }
        for (int var25 = 0; var25 < this.field82; var25++) {
            if (class41.field530[this.field69[var25]] != null) {
                class41.field530[this.field69[var25]].method60(this.field75[var25] - 7, this.field73[var25] + -7);
            }
        }
        if (arg7 > 0) {
            for (int var26 = 0; var26 < this.field82; var26++) {
                if (this.field69[var26] == arg5) {
                    class41.field530[this.field69[var26]].method60(this.field75[var26] - 7, this.field73[var26] + -7);
                    if (arg7 % 10 < 5) {
                        class2.method12(this.field75[var26], this.field73[var26], 15, 16776960, 128);
                        class2.method12(this.field75[var26], this.field73[var26], 7, 16777215, 256);
                    }
                }
            }
        }
        this.field82 = 0;
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(I)V", line = 646)
    public static void method46(int arg0) {
        field80 = null;
        field77 = null;
        field72 = null;
        field83 = null;
        field68 = null;
        if (arg0 != -12) {
            method46(-79);
        }
        field78 = null;
        field76 = null;
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(Ljava/lang/Object;ILj;)V", line = 667)
    public static final void method47(Object arg0, int arg1, class17 arg2) {
        if (arg2.field174 == null) {
            return;
        }
        if (arg1 != 1001) {
            method46(123);
        }
        for (int var3 = 0; var3 < 50 && arg2.field174.peekEvent() != null; var3++) {
            class37.method226(303, 1L);
        }
        if (arg0 != null) {
            arg2.field174.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(IB)Lv;", line = 694)
    public static final class40 method48(int arg0, byte arg1) {
        if (arg1 != -62) {
            field72 = null;
        }
        return class36.method216(arg1 ^ 0x4D, arg0, 10, false);
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(Z[B[[B)V", line = 718)
    private final void method49(boolean arg0, byte[] arg1, byte[][] arg2) {
        int var4 = 0;
        if (arg0) {
            return;
        }
        while (true) {
            while (arg1.length > var4) {
                int var5 = (arg1[var4++] & 0xFF) * 64 - class35.field466;
                int var6 = (arg1[var4++] & 0xFF) * 64 - class25.field379;
                if (var5 > 0 && var6 > 0 && class14.field138 > var5 + 64 && var6 + 64 < class25.field377) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        int var8 = class25.field377 - var6 - 1;
                        byte[] var9 = arg2[var5 + var7];
                        for (int var10 = -64; var10 < 0; var10++) {
                            var9[var8--] = arg1[var4++];
                        }
                    }
                } else {
                    var4 += 4096;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "([BI)V", line = 780)
    private final void method50(byte[] arg0, int arg1) {
        if (arg1 != -22081) {
            this.method50(null, -115);
        }
        int var3 = 0;
        while (true) {
            while (var3 < arg0.length) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - class35.field466;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class25.field379;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class14.field138 && var5 + 64 < class25.field377) {
                    class40.field514 = class25.field377 - var5 - 1 >> 6;
                    class40.field520 = var4 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg0[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg0[var3++];
                                class1.method5(var4 + var6, var9, -112, 3, class25.field377 - var5 - var7 - 64 - 1);
                                if (class40.field519[class40.field514][class40.field520] == null) {
                                    class40.field519[class40.field514][class40.field520] = new class23();
                                    class40.field519[class40.field514][class40.field520].field264 = new byte[4096];
                                }
                                class40.field519[class40.field514][class40.field520].field264[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class40.field519[class40.field514][class40.field520] != null) {
                        class40.field519[class40.field514][class40.field520].method149(-4097);
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

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "([BB)V", line = 874)
    private final void method51(byte[] arg0, byte arg1) {
        int var3 = -56 / ((arg1 - 49) / 53);
        int var4 = 0;
        while (true) {
            while (var4 < arg0.length) {
                int var5 = (arg0[var4++] & 0xFF) * 64 - class35.field466;
                int var6 = (arg0[var4++] & 0xFF) * 64 - class25.field379;
                if (var5 > 0 && var6 > 0 && class14.field138 > var5 + 64 && var6 + 64 < class25.field377) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        int var8 = class25.field377 - var6 - 1;
                        for (int var9 = -64; var9 < 0; var9++) {
                            while (true) {
                                int var10 = arg0[var4++] & 0xFF;
                                if (var10 == 0) {
                                    break;
                                }
                                if (var10 < 29) {
                                    class1.method5(var5 + var7, (byte) var10, -104, 0, class25.field377 - var6 - var9 - 64 - 1);
                                } else if (var10 < 160) {
                                    class1.method5(var5 + var7, (byte) (var10 + -28), -99, 1, class25.field377 - var9 - var6 - 1 - 64);
                                } else {
                                    class1.method5(var5 + var7, (byte) (var10 + -159), -97, 2, class25.field377 - var6 - var9 - 65);
                                    if (class14.field143 >= 1500) {
                                        break;
                                    }
                                    this.field74[class14.field143] = var7 + var5;
                                    this.field81[class14.field143] = var8;
                                    this.field70[class14.field143] = var10 - 160;
                                    class14.field143++;
                                }
                            }
                            var8--;
                        }
                    }
                } else {
                    for (int var11 = 0; var11 < 64; var11++) {
                        byte var13;
                        for (int var12 = -64; var12 < 0; var12++) {
                            do {
                                var13 = arg0[var4++];
                            } while (var13 != 0);
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(III[IBIZIII)V", line = 977)
    private final void method52(int arg0, int arg1, int arg2, int[] arg3, byte arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (arg5 == 9) {
            arg8 = arg8 + 1 & 0x3;
            arg5 = 1;
        }
        if (arg5 == 10) {
            arg5 = 1;
            arg8 = arg8 + 3 & 0x3;
        }
        if (arg5 == 11) {
            arg5 = 8;
            arg8 = arg8 + 3 & 0x3;
        }
        int var11 = class2.field45 - arg1;
        if (arg4 < 31) {
            field76 = null;
        }
        if (arg5 == 1) {
            if (arg8 == 0) {
                for (int var18 = 0; var18 < arg2; var18++) {
                    for (int var19 = 0; var19 < arg1; var19++) {
                        if (var19 <= var18) {
                            arg3[arg0] = arg7;
                        } else if (arg6) {
                            arg3[arg0] = arg9;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg8 == 1) {
                for (int var16 = arg2 - 1; var16 >= 0; var16--) {
                    for (int var17 = 0; var17 < arg1; var17++) {
                        if (var17 <= var16) {
                            arg3[arg0] = arg7;
                        } else if (arg6) {
                            arg3[arg0] = arg9;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg8 == 2) {
                for (int var12 = 0; var12 < arg2; var12++) {
                    for (int var13 = 0; var13 < arg1; var13++) {
                        if (var12 <= var13) {
                            arg3[arg0] = arg7;
                        } else if (arg6) {
                            arg3[arg0] = arg9;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg8 == 3) {
                for (int var14 = arg2 - 1; var14 >= 0; var14--) {
                    for (int var15 = 0; var15 < arg1; var15++) {
                        if (var14 <= var15) {
                            arg3[arg0] = arg7;
                        } else if (arg6) {
                            arg3[arg0] = arg9;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            }
        } else if (arg5 == 2) {
            if (arg8 == 0) {
                for (int var20 = arg2 - 1; var20 >= 0; var20--) {
                    for (int var21 = 0; var21 < arg1; var21++) {
                        if (var20 >> 1 >= var21) {
                            arg3[arg0] = arg7;
                        } else if (arg6) {
                            arg3[arg0] = arg9;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg8 == 1) {
                for (int var22 = 0; var22 < arg2; var22++) {
                    for (int var23 = 0; var23 < arg1; var23++) {
                        if (var22 << 1 <= var23) {
                            arg3[arg0] = arg7;
                        } else if (arg6) {
                            arg3[arg0] = arg9;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg8 == 2) {
                for (int var24 = 0; var24 < arg2; var24++) {
                    for (int var25 = arg1 - 1; var25 >= 0; var25--) {
                        if (var24 >> 1 >= var25) {
                            arg3[arg0] = arg7;
                        } else if (arg6) {
                            arg3[arg0] = arg9;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg8 == 3) {
                for (int var26 = arg2 - 1; var26 >= 0; var26--) {
                    for (int var27 = arg1 - 1; var27 >= 0; var27--) {
                        if (var27 >= var26 << 1) {
                            arg3[arg0] = arg7;
                        } else if (arg6) {
                            arg3[arg0] = arg9;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            }
        } else if (arg5 == 3) {
            if (arg8 == 0) {
                for (int var28 = arg2 - 1; var28 >= 0; var28--) {
                    for (int var29 = arg1 - 1; var29 >= 0; var29--) {
                        if (var28 >> 1 >= var29) {
                            arg3[arg0] = arg7;
                        } else if (arg6) {
                            arg3[arg0] = arg9;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg8 == 1) {
                for (int var30 = arg2 - 1; var30 >= 0; var30--) {
                    for (int var31 = 0; var31 < arg1; var31++) {
                        if (var30 << 1 <= var31) {
                            arg3[arg0] = arg7;
                        } else if (arg6) {
                            arg3[arg0] = arg9;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg8 == 2) {
                for (int var34 = 0; var34 < arg2; var34++) {
                    for (int var35 = 0; var35 < arg1; var35++) {
                        if (var34 >> 1 >= var35) {
                            arg3[arg0] = arg7;
                        } else if (arg6) {
                            arg3[arg0] = arg9;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg8 == 3) {
                for (int var32 = 0; var32 < arg2; var32++) {
                    for (int var33 = arg1 - 1; var33 >= 0; var33--) {
                        if (var32 << 1 <= var33) {
                            arg3[arg0] = arg7;
                        } else if (arg6) {
                            arg3[arg0] = arg9;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            }
        } else if (arg5 == 4) {
            if (arg8 == 0) {
                for (int var42 = arg2 - 1; var42 >= 0; var42--) {
                    for (int var43 = 0; var43 < arg1; var43++) {
                        if (var42 >> 1 <= var43) {
                            arg3[arg0] = arg7;
                        } else if (arg6) {
                            arg3[arg0] = arg9;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg8 == 1) {
                for (int var40 = 0; var40 < arg2; var40++) {
                    for (int var41 = 0; var41 < arg1; var41++) {
                        if (var40 << 1 >= var41) {
                            arg3[arg0] = arg7;
                        } else if (arg6) {
                            arg3[arg0] = arg9;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg8 == 2) {
                for (int var38 = 0; var38 < arg2; var38++) {
                    for (int var39 = arg1 - 1; var39 >= 0; var39--) {
                        if (var38 >> 1 <= var39) {
                            arg3[arg0] = arg7;
                        } else if (arg6) {
                            arg3[arg0] = arg9;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg8 == 3) {
                for (int var36 = arg2 - 1; var36 >= 0; var36--) {
                    for (int var37 = arg1 - 1; var37 >= 0; var37--) {
                        if (var36 << 1 >= var37) {
                            arg3[arg0] = arg7;
                        } else if (arg6) {
                            arg3[arg0] = arg9;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            }
        } else if (arg5 != 5) {
            if (arg5 == 6) {
                if (arg8 == 0) {
                    for (int var58 = 0; var58 < arg2; var58++) {
                        for (int var59 = 0; var59 < arg1; var59++) {
                            if (var59 <= arg1 / 2) {
                                arg3[arg0] = arg7;
                            } else if (arg6) {
                                arg3[arg0] = arg9;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var52 = 0; var52 < arg2; var52++) {
                        for (int var53 = 0; var53 < arg1; var53++) {
                            if (arg2 / 2 >= var52) {
                                arg3[arg0] = arg7;
                            } else if (arg6) {
                                arg3[arg0] = arg9;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var54 = 0; var54 < arg2; var54++) {
                        for (int var55 = 0; var55 < arg1; var55++) {
                            if (arg1 / 2 <= var55) {
                                arg3[arg0] = arg7;
                            } else if (arg6) {
                                arg3[arg0] = arg9;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var56 = 0; var56 < arg2; var56++) {
                        for (int var57 = 0; var57 < arg1; var57++) {
                            if (var56 >= arg2 / 2) {
                                arg3[arg0] = arg7;
                            } else if (arg6) {
                                arg3[arg0] = arg9;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
            }
            if (arg5 == 7) {
                if (arg8 == 0) {
                    for (int var60 = 0; var60 < arg2; var60++) {
                        for (int var61 = 0; var61 < arg1; var61++) {
                            if (var61 <= var60 - arg2 / 2) {
                                arg3[arg0] = arg7;
                            } else if (arg6) {
                                arg3[arg0] = arg9;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var62 = arg2 - 1; var62 >= 0; var62--) {
                        for (int var63 = 0; var63 < arg1; var63++) {
                            if (var62 - arg2 / 2 >= var63) {
                                arg3[arg0] = arg7;
                            } else if (arg6) {
                                arg3[arg0] = arg9;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var64 = arg2 - 1; var64 >= 0; var64--) {
                        for (int var65 = arg1 - 1; var65 >= 0; var65--) {
                            if (var64 - arg2 / 2 >= var65) {
                                arg3[arg0] = arg7;
                            } else if (arg6) {
                                arg3[arg0] = arg9;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var66 = 0; var66 < arg2; var66++) {
                        for (int var67 = arg1 - 1; var67 >= 0; var67--) {
                            if (var67 <= var66 - arg2 / 2) {
                                arg3[arg0] = arg7;
                            } else if (arg6) {
                                arg3[arg0] = arg9;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
            }
            if (arg5 == 8) {
                if (arg8 == 0) {
                    for (int var74 = 0; var74 < arg2; var74++) {
                        for (int var75 = 0; var75 < arg1; var75++) {
                            if (var75 >= var74 - arg2 / 2) {
                                arg3[arg0] = arg7;
                            } else if (arg6) {
                                arg3[arg0] = arg9;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var72 = arg2 - 1; var72 >= 0; var72--) {
                        for (int var73 = 0; var73 < arg1; var73++) {
                            if (var73 >= var72 - arg2 / 2) {
                                arg3[arg0] = arg7;
                            } else if (arg6) {
                                arg3[arg0] = arg9;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var68 = arg2 - 1; var68 >= 0; var68--) {
                        for (int var69 = arg1 - 1; var69 >= 0; var69--) {
                            if (var69 >= var68 - arg2 / 2) {
                                arg3[arg0] = arg7;
                            } else if (arg6) {
                                arg3[arg0] = arg9;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var70 = 0; var70 < arg2; var70++) {
                        for (int var71 = arg1 - 1; var71 >= 0; var71--) {
                            if (var71 >= var70 - arg2 / 2) {
                                arg3[arg0] = arg7;
                            } else if (arg6) {
                                arg3[arg0] = arg9;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
            }
        } else if (arg8 == 0) {
            for (int var50 = arg2 - 1; var50 >= 0; var50--) {
                for (int var51 = arg1 - 1; var51 >= 0; var51--) {
                    if (var50 >> 1 <= var51) {
                        arg3[arg0] = arg7;
                    } else if (arg6) {
                        arg3[arg0] = arg9;
                    }
                    arg0++;
                }
                arg0 += var11;
            }
        } else if (arg8 == 1) {
            for (int var44 = arg2 - 1; var44 >= 0; var44--) {
                for (int var45 = 0; var45 < arg1; var45++) {
                    if (var44 << 1 >= var45) {
                        arg3[arg0] = arg7;
                    } else if (arg6) {
                        arg3[arg0] = arg9;
                    }
                    arg0++;
                }
                arg0 += var11;
            }
        } else if (arg8 == 2) {
            for (int var46 = 0; var46 < arg2; var46++) {
                for (int var47 = 0; var47 < arg1; var47++) {
                    if (var47 >= var46 >> 1) {
                        arg3[arg0] = arg7;
                    } else if (arg6) {
                        arg3[arg0] = arg9;
                    }
                    arg0++;
                }
                arg0 += var11;
            }
        } else if (arg8 == 3) {
            for (int var48 = 0; var48 < arg2; var48++) {
                for (int var49 = arg1 - 1; var49 >= 0; var49--) {
                    if (var48 << 1 >= var49) {
                        arg3[arg0] = arg7;
                    } else if (arg6) {
                        arg3[arg0] = arg9;
                    }
                    arg0++;
                }
                arg0 += var11;
            }
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(ILi;)V", line = 2112)
    public final void method53(int arg0, class15 arg1) {
        class5 var3 = new class5(arg1.method183(field68, class19.field206, arg0 - 5536));
        int var4 = var3.method31(-14467);
        int var5 = var3.method31(-14467);
        if (arg0 != -5) {
            return;
        }
        int var6 = var3.method31(-14467);
        int var7 = var3.method31(-14467);
        int var8 = var3.method31(-14467);
        int var9 = var3.method31(arg0 ^ 0x3886);
        var3.method29(408664184);
        class25.field379 = var5 * 64;
        class25.field377 = (var7 + 1 - var5) * 64;
        class40.field515 = class25.field377 + class25.field379 - var9 * 64;
        class14.field138 = (var6 + 1 - var4) * 64;
        class35.field466 = var4 * 64;
        mapview.field299 = var8 * 64 - class35.field466;
        this.method42(class14.field138, false, class25.field377);
        class5 var10 = new class5(arg1.method183(class16.field166, class19.field206, arg0 ^ 0x15A0));
        int var11 = var10.method31(-14467);
        class32.field444 = new int[var11 + 1];
        for (int var12 = 0; var12 < var11; var12++) {
            class32.field444[var12 + 1] = var10.method33(-16411);
        }
        int var13 = var10.method31(-14467);
        class8.field103 = new int[var13 + 1];
        for (int var14 = 0; var14 < var13; var14++) {
            class8.field103[var14 + 1] = var10.method33(-16411);
        }
        byte[] var15 = arg1.method183(class1.field23, class19.field206, -5541);
        byte[][] var16 = new byte[class14.field138][class25.field377];
        this.method49(false, var15, var16);
        byte[] var17 = arg1.method183(class35.field468, class19.field206, arg0 ^ 0x15A0);
        this.method50(var17, arg0 - 22076);
        byte[] var18 = arg1.method183(class11.field117, class19.field206, -5541);
        this.method44(var18, (byte) -119);
        byte[] var19 = arg1.method183(field80, class19.field206, -5541);
        class14.field143 = 0;
        this.method51(var19, (byte) -41);
        this.method43(arg0 + 1482747403, var16);
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(IIIIIBIII)V", line = 2187)
    public final void method54(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        this.field82 = 0;
        int var10 = arg6 - arg1;
        int var11 = (arg7 - arg4 << 16) / var10;
        int var12 = arg8 - arg0;
        int var13 = (arg2 - arg3 << 16) / var12;
        int var14 = 44 % ((arg5 + 48) / 55);
        for (int var15 = 0; var15 < var10; var15++) {
            int var16 = (var15 + 1) * var11 >> 16;
            int var17 = var11 * var15 >> 16;
            int var18 = var16 - var17;
            if (var18 > 0) {
                class26.method186(arg1 + var15, arg0, 63);
                for (int var19 = 0; var19 < var12; var19++) {
                    int var20 = (var19 + 1) * var13 >> 16;
                    int var21 = var13 * var19 >> 16;
                    int var22 = var20 - var21;
                    if (var22 > 0) {
                        int var23 = class39.method239(-8896) & 0xFF;
                        if (var23 != 0) {
                            int var24;
                            if (var22 == 1) {
                                var24 = var21;
                            } else {
                                var24 = var20 - 1;
                            }
                            int var25;
                            if (var18 == 1) {
                                var25 = var17;
                            } else {
                                var25 = var16 - 1;
                            }
                            int var26 = 13421772;
                            if (var23 >= 5 && var23 <= 8 || var23 >= 13 && var23 <= 16 || var23 >= 21 && var23 <= 24 || var23 == 27 || var23 == 28) {
                                var26 = 13369344;
                                var23 -= 4;
                            }
                            if (var23 == 1) {
                                class2.method7(var17, var21, var22, var26);
                            } else if (var23 == 2) {
                                class2.method9(var17, var21, var18, var26);
                            } else if (var23 == 3) {
                                class2.method7(var25, var21, var22, var26);
                            } else if (var23 == 4) {
                                class2.method9(var17, var24, var18, var26);
                            } else if (var23 == 9) {
                                class2.method7(var17, var21, var22, 16777215);
                                class2.method9(var17, var21, var18, var26);
                            } else if (var23 == 10) {
                                class2.method7(var25, var21, var22, 16777215);
                                class2.method9(var17, var21, var18, var26);
                            } else if (var23 == 11) {
                                class2.method7(var25, var21, var22, 16777215);
                                class2.method9(var17, var24, var18, var26);
                            } else if (var23 == 12) {
                                class2.method7(var17, var21, var22, 16777215);
                                class2.method9(var17, var24, var18, var26);
                            } else if (var23 == 17) {
                                class2.method9(var17, var21, 1, var26);
                            } else if (var23 == 18) {
                                class2.method9(var25, var21, 1, var26);
                            } else if (var23 == 19) {
                                class2.method9(var25, var24, 1, var26);
                            } else if (var23 == 20) {
                                class2.method9(var17, var24, 1, var26);
                            } else if (var23 == 25) {
                                for (int var27 = 0; var27 < var22; var27++) {
                                    class2.method9(var17 + var27, -var27 + var24, 1, var26);
                                }
                            } else if (var23 == 26) {
                                for (int var28 = 0; var28 < var22; var28++) {
                                    class2.method9(var17 + var28, var21 + var28, 1, var26);
                                }
                            }
                        }
                        int var29 = class12.method70((byte) 6) & 0xFF;
                        if (var29 != 0) {
                            this.field69[this.field82] = var29 - 1;
                            this.field75[this.field82] = var18 / 2 + var17;
                            this.field73[this.field82] = var22 / 2 + var21;
                            this.field82++;
                        }
                    }
                    class32.method204((byte) -98);
                }
            }
        }
    }
}
