import java.io.DataInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!d")
public class class6 {

    @OriginalMember(owner = "mapview!d", name = "g", descriptor = "[I")
    private int[] field151 = new int[1500];

    @OriginalMember(owner = "mapview!d", name = "j", descriptor = "[I")
    public int[] field154 = new int[1500];

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "[I")
    public int[] field146 = new int[1500];

    @OriginalMember(owner = "mapview!d", name = "e", descriptor = "[I")
    private int[] field149 = new int[1500];

    @OriginalMember(owner = "mapview!d", name = "p", descriptor = "I")
    private int field160 = 0;

    @OriginalMember(owner = "mapview!d", name = "k", descriptor = "[I")
    private int[] field155 = new int[1500];

    @OriginalMember(owner = "mapview!d", name = "r", descriptor = "[I")
    public int[] field162 = new int[1500];

    @OriginalMember(owner = "mapview!d", name = "h", descriptor = "Lna;")
    public static class26 field152 = class30.method205((byte) 106, "Short)2cut");

    @OriginalMember(owner = "mapview!d", name = "n", descriptor = "Lna;")
    public static class26 field158 = class30.method205((byte) 107, "Water Source");

    @OriginalMember(owner = "mapview!d", name = "m", descriptor = "I")
    public static int field157 = 0;

    @OriginalMember(owner = "mapview!d", name = "f", descriptor = "I")
    public static int field150 = 0;

    @OriginalMember(owner = "mapview!d", name = "l", descriptor = "Lna;")
    public static class26 field156 = class30.method205((byte) 97, "Cooking Range");

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "Lpa;")
    public static class30 field145 = null;

    @OriginalMember(owner = "mapview!d", name = "q", descriptor = "I")
    public static int field161 = 0;

    @OriginalMember(owner = "mapview!d", name = "s", descriptor = "Lna;")
    public static class26 field163 = class30.method205((byte) 50, "Next page");

    @OriginalMember(owner = "mapview!d", name = "c", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "mapview!d", name = "d", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "mapview!d", name = "i", descriptor = "Ljava/io/DataInputStream;")
    public static DataInputStream field153;

    @OriginalMember(owner = "mapview!d", name = "o", descriptor = "[Lma;")
    public static class24[] field159;

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(B[B)V", line = 6)
    private final void method53(byte arg0, byte[] arg1) {
        if (arg0 != 17) {
            this.method60(77, null, null);
        }
        int var3 = 0;
        while (true) {
            while (var3 < arg1.length) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class7.field170;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class25.field347;
                if (var4 > 0 && var5 > 0 && var4 + 64 < field148 && class26.field360 > var5 + 64) {
                    class27.field373 = var4 >> 6;
                    class1.field102 = class26.field360 - var5 - 1 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg1[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg1[var3++];
                                class12.method80((byte) -96, var4 + var6, var9, 3, class26.field360 - var7 - var5 - 1 - 64);
                                if (mapview.field5[class1.field102][class27.field373] == null) {
                                    mapview.field5[class1.field102][class27.field373] = new class37();
                                    mapview.field5[class1.field102][class27.field373].field481 = new byte[4096];
                                }
                                mapview.field5[class1.field102][class27.field373].field481[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (mapview.field5[class1.field102][class27.field373] != null) {
                        mapview.field5[class1.field102][class27.field373].method234(true);
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

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(IZI)V", line = 90)
    private final void method54(int arg0, boolean arg1, int arg2) {
        int var4 = arg2 >> 6;
        int var5 = arg0 >> 6;
        class25.field353[3] = new byte[var5][var4][];
        class39.field496 = new class37[var5][var4];
        class25.field353[0] = new byte[var5][var4][];
        class25.field353[1] = new byte[var5][var4][];
        class41.field520 = new int[var5][var4][];
        class25.field353[4] = new byte[var5][var4][];
        class25.field353[2] = new byte[var5][var4][];
        if (!arg1) {
            this.method54(106, true, 2);
        }
        mapview.field5 = new class37[var5][var4];
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(IIIDIIIIII)V", line = 114)
    public final void method55(int arg0, int arg1, int arg2, double arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var12 = arg0 - arg5;
        int var13 = -23 % ((arg2 + 33) / 49);
        int var14 = arg1 - arg9;
        int var15 = (arg6 - arg4 << 16) / var12;
        int var16 = (arg8 - arg7 << 16) / var14;
        if (arg0 - arg5 > -arg4 + arg6) {
            return;
        }
        this.field160 = 0;
        for (int var17 = 0; var17 < var12; var17++) {
            int var18 = var15 * var17 >> 16;
            int var19 = (var17 + 1) * var15 >> 16;
            int var20 = var19 - var18;
            if (var20 > 0) {
                class41.method262(false, arg9, arg5 + var17);
                for (int var21 = 0; var21 < var14; var21++) {
                    int var22 = (var21 + 1) * var16 >> 16;
                    int var23 = var16 * var21 >> 16;
                    int var24 = var22 - var23;
                    if (var24 > 0) {
                        int var25 = class41.method265(64) & 0xFF;
                        if (var25 != 0) {
                            if (var25 == 47 || var25 == 53) {
                                field159[var25 - 1].method162(var18, var23, var20 * 2 + 1, var24 * 2 - -1);
                                if (!(arg3 < 4.0D) && arg3 > 4.2D && arg3 > 6.2D) {
                                }
                            } else {
                                field159[var25 - 1].method162(var18 - var20 / 2, -(var24 / 2) + var23, var20 * 2, var24 * 2);
                            }
                        }
                    }
                    class19.method122(771523174);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(I[B)V", line = 237)
    private final void method56(int arg0, byte[] arg1) {
        int var3 = 0;
        if (arg0 != -1879) {
            this.method54(120, false, 31);
        }
        while (true) {
            while (var3 < arg1.length) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class7.field170;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class25.field347;
                if (var4 > 0 && var5 > 0 && var4 + 64 < field148 && class26.field360 > var5 + 64) {
                    for (int var6 = 0; var6 < 64; var6++) {
                        int var7 = class26.field360 - var5 - 1;
                        for (int var8 = -64; var8 < 0; var8++) {
                            while (true) {
                                int var9 = arg1[var3++] & 0xFF;
                                if (var9 == 0) {
                                    break;
                                }
                                if (var9 < 29) {
                                    class12.method80((byte) 123, var4 + var6, (byte) var9, 0, class26.field360 - var8 - var5 - 64 - 1);
                                } else if (var9 >= 160) {
                                    class12.method80((byte) 51, var4 + var6, (byte) (var9 + -159), 2, class26.field360 - var8 - var5 - 64 - 1);
                                    if (class39.field498 >= 1500) {
                                        break;
                                    }
                                    this.field146[class39.field498] = var6 + var4;
                                    this.field162[class39.field498] = var7;
                                    this.field154[class39.field498] = var9 - 160;
                                    class39.field498++;
                                } else {
                                    class12.method80((byte) -61, var4 + var6, (byte) (var9 + -28), 1, class26.field360 - var5 - var8 - 64 - 1);
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

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(I[[B)V", line = 348)
    private final void method57(int arg0, byte[][] arg1) {
        if (arg0 != 1198) {
            this.field151 = null;
        }
        int var3 = field148;
        int var4 = class26.field360;
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = 0;
        }
        for (int var7 = 5; var7 < var3 - 5; var7++) {
            byte[] var8 = arg1[var7 + 5];
            byte[] var9 = arg1[var7 - 5];
            for (int var10 = 0; var10 < var4; var10++) {
                int var11 = class27.field377[var8[var10] & 0xFF];
                int var12 = class27.field377[var9[var10] & 0xFF];
                if (var11 <= 0 && class17.method111(-86, var7 + 5, var10) > 0) {
                    var11 = 64;
                }
                if (var12 <= 0 && class17.method111(-109, var7 - 5, var10) > 0) {
                    var12 = 64;
                }
                var5[var10] += var11 - var12;
            }
            if (var7 > 10 && var7 < var3 - 10) {
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                for (int var16 = 5; var16 < var4 - 5; var16++) {
                    int var17 = var5[var16 + 5];
                    int var18 = var5[var16 - 5];
                    var15 += (var17 >> 10 & 0x3FF) - (var18 >> 10 & 0x3FF);
                    var14 += (var17 & 0x3FF) - (var18 & 0x3FF);
                    var13 += (var17 >> 20) - (var18 >> 20);
                    if (var14 > 0) {
                        int var19 = var16 >> 6;
                        int var20 = var7 >> 6;
                        if (class41.field520[var19][var20] == null) {
                            class41.field520[var19][var20] = new int[4096];
                        }
                        if ((arg1[var7][var16] & 0xFF) > 0) {
                            class41.field520[var19][var20][class36.method227(var16 << 6, 4032) + class36.method227(var7, 63)] = this.method65((double) var13 / 8533.0D, (double) var14 / 8533.0D, arg0 - 1097, (double) var15 / 8533.0D);
                        } else {
                            class41.field520[var19][var20][class36.method227(var7, 63) + class36.method227(var16 << 6, 4032)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(BLg;)V", line = 462)
    public final void method58(byte arg0, class12 arg1) {
        class4 var3 = new class4(arg1.method38(-2109, class16.field218, class41.field524));
        int var4 = var3.method47((byte) 63);
        int var5 = var3.method47((byte) 95);
        int var6 = var3.method47((byte) 102);
        int var7 = var3.method47((byte) 121);
        int var8 = var3.method47((byte) 105);
        int var9 = var3.method47((byte) 100);
        var3.method50(435895534);
        field148 = (var6 - var4) * 64 + 64;
        class7.field170 = var4 * 64;
        class26.field360 = (var7 - var5) * 64 + 64;
        mapview.field54 = var8 * 64 - class7.field170;
        class25.field347 = var5 * 64;
        class39.field497 = class25.field347 + class26.field360 - var9 * 64;
        this.method54(class26.field360, true, field148);
        class4 var10 = new class4(arg1.method38(-2109, class16.field218, class36.field467));
        if (arg0 != 88) {
            this.field151 = null;
        }
        int var11 = var10.method47((byte) 78);
        class27.field377 = new int[var11 + 1];
        for (int var12 = 0; var12 < var11; var12++) {
            class27.field377[var12 + 1] = var10.method43((byte) -120);
        }
        int var13 = var10.method47((byte) 127);
        class25.field343 = new int[var13 + 1];
        for (int var14 = 0; var14 < var13; var14++) {
            class25.field343[var14 + 1] = var10.method43((byte) -92);
        }
        byte[] var15 = arg1.method38(-2109, class16.field218, class13.field193);
        byte[][] var16 = new byte[field148][class26.field360];
        this.method60(arg0 + 167, var16, var15);
        byte[] var17 = arg1.method38(-2109, class16.field218, class13.field202);
        this.method53((byte) 17, var17);
        byte[] var18 = arg1.method38(-2109, class16.field218, class9.field176);
        this.method63((byte) -126, var18);
        byte[] var19 = arg1.method38(-2109, class16.field218, class36.field470);
        class39.field498 = 0;
        this.method56(-1879, var19);
        this.method57(1198, var16);
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(IIIBIIIII)V", line = 535)
    public final void method59(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg8 - arg6;
        int var11 = arg1 - arg5;
        int var12 = (arg4 - arg7 << 16) / var10;
        int var13 = (arg0 - arg2 << 16) / var11;
        int var14 = 0;
        if (arg3 != -39) {
            return;
        }
        while (var14 < var10) {
            int var15 = var12 * var14 >> 16;
            int var16 = (var14 + 1) * var12 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg7 + var16;
                class41.method262(false, arg5, arg6 + var14);
                int var19 = arg7 + var15;
                for (int var20 = 0; var20 < var11; var20++) {
                    int var21 = var13 * var20 >> 16;
                    int var22 = (var20 + 1) * var13 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = arg2 + var21;
                        int var25 = class19.method121(arg3 + 6210);
                        int var26 = arg2 + var22;
                        int var27 = class9.method76((byte) -50);
                        if (var25 == 0 && var27 == 0) {
                            class21.method134(var19, var24, var18 - var19, -var24 + var26, mapview.method4((byte) 66));
                        } else {
                            byte var28 = class9.method77(true);
                            int var29 = var28 & 0xFC;
                            if (var29 == 0 || var17 <= 1 || var23 <= 1) {
                                class21.method134(var19, var24, var17, var23, var25);
                            } else {
                                this.method66(true, class21.field294, var25, var29 >> 2, var28 & 0x3, false, class21.field291 * var24 + var19, var23, var17, mapview.method4((byte) 54));
                            }
                            if (var27 > 0) {
                                byte var30 = class16.method103(0);
                                int var31 = var30 & 0xFC;
                                if (var31 == 0 || var17 <= 1 || var23 <= 1) {
                                    class21.method134(var19, var24, var17, var23, var27);
                                }
                                this.method66(var25 == 0, class21.field294, var27, var31 >> 2, var30 & 0x3, false, class21.field291 * var24 + var19, var23, var17, mapview.method4((byte) -119));
                            }
                        }
                    }
                    class19.method122(arg3 ^ 0xD2037DBF);
                }
            }
            var14++;
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(I[[B[B)V", line = 626)
    private final void method60(int arg0, byte[][] arg1, byte[] arg2) {
        int var4 = 0;
        if (arg0 != 255) {
            return;
        }
        while (true) {
            while (arg2.length > var4) {
                int var5 = (arg2[var4++] & 0xFF) * 64 - class7.field170;
                int var6 = (arg2[var4++] & 0xFF) * 64 - class25.field347;
                if (var5 > 0 && var6 > 0 && field148 > var5 + 64 && var6 + 64 < class26.field360) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        byte[] var8 = arg1[var5 + var7];
                        int var9 = class26.field360 - var6 - 1;
                        for (int var10 = -64; var10 < 0; var10++) {
                            var8[var9--] = arg2[var4++];
                        }
                    }
                } else {
                    var4 += 4096;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(I)V", line = 673)
    public static void method61(int arg0) {
        if (arg0 != 2) {
            method61(-63);
        }
        field152 = null;
        field158 = null;
        field153 = null;
        field156 = null;
        field159 = null;
        field163 = null;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(IIIIIIIIIIB)V", line = 693)
    public final void method62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10) {
        if (this.field160 == 0) {
            int var12 = arg2 - arg6;
            int var13 = (arg9 - arg5 << 16) / var12;
            int var14 = arg1 - arg3;
            int var15 = (arg8 - arg4 << 16) / var14;
            for (int var16 = 0; var16 < var12; var16++) {
                int var17 = var13 * var16 >> 16;
                int var18 = (var16 + 1) * var13 >> 16;
                int var19 = var18 - var17;
                if (var19 > 0) {
                    class41.method262(false, arg3, arg6 + var16);
                    for (int var20 = 0; var20 < var14; var20++) {
                        int var21 = var15 * var20 >> 16;
                        int var22 = (var20 + 1) * var15 >> 16;
                        int var23 = var22 - var21;
                        if (var23 > 0) {
                            int var24 = class17.method108(false) & 0xFF;
                            if (var24 != 0) {
                                this.field155[this.field160] = var24 - 1;
                                this.field151[this.field160] = var19 / 2 + var17;
                                this.field149[this.field160] = var23 / 2 + var21;
                                this.field160++;
                            }
                        }
                        class19.method122(771523174);
                    }
                }
            }
        }
        int var25 = -65 / ((7 - arg10) / 39);
        for (int var26 = 0; var26 < this.field160; var26++) {
            if (class34.field445[this.field155[var26]] != null) {
                class34.field445[this.field155[var26]].method159(this.field151[var26] - 7, this.field149[var26] + -7);
            }
        }
        if (arg7 > 0) {
            for (int var27 = 0; var27 < this.field160; var27++) {
                if (this.field155[var27] == arg0) {
                    class34.field445[this.field155[var27]].method159(this.field151[var27] - 7, this.field149[var27] - 7);
                    if (arg7 % 10 < 5) {
                        class21.method137(this.field151[var27], this.field149[var27], 15, 16776960, 128);
                        class21.method137(this.field151[var27], this.field149[var27], 7, 16777215, 256);
                    }
                }
            }
        }
        this.field160 = 0;
    }

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "(B[B)V", line = 803)
    private final void method63(byte arg0, byte[] arg1) {
        int var3 = 0;
        while (true) {
            while (arg1.length > var3) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class7.field170;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class25.field347;
                if (var4 > 0 && var5 > 0 && field148 > var4 + 64 && var5 + 64 < class26.field360) {
                    class27.field373 = var4 >> 6;
                    class1.field102 = class26.field360 - var5 - 1 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg1[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg1[var3++];
                                class12.method80((byte) 127, var4 + var6, var9, 4, class26.field360 - var5 - var7 - 64 - 1);
                                if (class39.field496[class1.field102][class27.field373] == null) {
                                    class39.field496[class1.field102][class27.field373] = new class37();
                                    class39.field496[class1.field102][class27.field373].field481 = new byte[4096];
                                }
                                class39.field496[class1.field102][class27.field373].field481[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class39.field496[class1.field102][class27.field373] != null) {
                        class39.field496[class1.field102][class27.field373].method234(true);
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
            if (arg0 > -29) {
                this.method59(-87, 49, -7, (byte) -13, -65, 119, 124, 125, 58);
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(IIIIIIIII)V", line = 885)
    public final void method64(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field160 = 0;
        if (arg1 != 173357296) {
            field147 = 91;
        }
        int var10 = arg2 - arg6;
        int var11 = arg4 - arg5;
        int var12 = (arg3 - arg0 << 16) / var10;
        int var13 = (arg8 - arg7 << 16) / var11;
        for (int var14 = 0; var14 < var10; var14++) {
            int var15 = var12 * var14 >> 16;
            int var16 = (var14 + 1) * var12 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                class41.method262(false, arg5, arg6 + var14);
                for (int var18 = 0; var18 < var11; var18++) {
                    int var19 = var13 * var18 >> 16;
                    int var20 = (var18 + 1) * var13 >> 16;
                    int var21 = var20 - var19;
                    if (var21 > 0) {
                        int var22 = class20.method123(arg1 - 173357252) & 0xFF;
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
                                class21.method138(var15, var19, var21, var25);
                            } else if (var22 == 2) {
                                class21.method133(var15, var19, var17, var25);
                            } else if (var22 == 3) {
                                class21.method138(var23, var19, var21, var25);
                            } else if (var22 == 4) {
                                class21.method133(var15, var24, var17, var25);
                            } else if (var22 == 9) {
                                class21.method138(var15, var19, var21, 16777215);
                                class21.method133(var15, var19, var17, var25);
                            } else if (var22 == 10) {
                                class21.method138(var23, var19, var21, 16777215);
                                class21.method133(var15, var19, var17, var25);
                            } else if (var22 == 11) {
                                class21.method138(var23, var19, var21, 16777215);
                                class21.method133(var15, var24, var17, var25);
                            } else if (var22 == 12) {
                                class21.method138(var15, var19, var21, 16777215);
                                class21.method133(var15, var24, var17, var25);
                            } else if (var22 == 17) {
                                class21.method133(var15, var19, 1, var25);
                            } else if (var22 == 18) {
                                class21.method133(var23, var19, 1, var25);
                            } else if (var22 == 19) {
                                class21.method133(var23, var24, 1, var25);
                            } else if (var22 == 20) {
                                class21.method133(var15, var24, 1, var25);
                            } else if (var22 == 25) {
                                for (int var26 = 0; var26 < var21; var26++) {
                                    class21.method133(var15 + var26, var24 - var26, 1, var25);
                                }
                            } else if (var22 == 26) {
                                for (int var27 = 0; var27 < var21; var27++) {
                                    class21.method133(var15 + var27, var19 - -var27, 1, var25);
                                }
                            }
                        }
                        int var28 = class17.method108(false) & 0xFF;
                        if (var28 != 0) {
                            this.field155[this.field160] = var28 - 1;
                            this.field151[this.field160] = var17 / 2 + var15;
                            this.field149[this.field160] = var21 / 2 + var19;
                            this.field160++;
                        }
                    }
                    class19.method122(771523174);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(DDID)I", line = 1066)
    private final int method65(double arg0, double arg1, int arg2, double arg3) {
        if (arg2 < 49) {
            this.method54(48, false, -42);
        }
        double var8 = arg1;
        double var10 = arg1;
        double var12 = arg1;
        if (arg3 != 0.0D) {
            double var16 = arg0 + 0.3333333333333333D;
            if (var16 > 1.0D) {
                var16--;
            }
            double var18;
            if (arg1 < 0.5D) {
                var18 = (arg3 + 1.0D) * arg1;
            } else {
                var18 = arg1 + arg3 - arg1 * arg3;
            }
            double var20 = arg1 * 2.0D - var18;
            if (arg0 * 6.0D < 1.0D) {
                var10 = (var18 - var20) * 6.0D * arg0 + var20;
            } else if (arg0 * 2.0D < 1.0D) {
                var10 = var18;
            } else if (arg0 * 3.0D < 2.0D) {
                var10 = (0.6666666666666666D - arg0) * (-var20 + var18) * 6.0D + var20;
            } else {
                var10 = var20;
            }
            double var22 = arg0 - 0.3333333333333333D;
            if (var16 * 6.0D < 1.0D) {
                var12 = (var18 - var20) * 6.0D * var16 + var20;
            } else if (var16 * 2.0D < 1.0D) {
                var12 = var18;
            } else if (var16 * 3.0D < 2.0D) {
                var12 = (0.6666666666666666D - var16) * (-var20 + var18) * 6.0D + var20;
            } else {
                var12 = var20;
            }
            if (var22 < 0.0D) {
                var22++;
            }
            if (var22 * 6.0D < 1.0D) {
                var8 = (var18 - var20) * 6.0D * var22 + var20;
            } else if (var22 * 2.0D < 1.0D) {
                var8 = var18;
            } else if (var22 * 3.0D < 2.0D) {
                var8 = (var18 - var20) * (-var22 + 0.6666666666666666D) * 6.0D + var20;
            } else {
                var8 = var20;
            }
        }
        int var24 = (int) (var12 * 256.0D);
        int var25 = (int) (var8 * 256.0D);
        int var26 = (int) (var10 * 256.0D);
        return (var24 << 16) + (var26 << 8) + var25;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(Z[IIIIZIIII)V", line = 1202)
    private final void method66(boolean arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 == 9) {
            arg3 = 1;
            arg4 = arg4 + 1 & 0x3;
        }
        int var11 = class21.field291 - arg8;
        if (arg3 == 10) {
            arg3 = 1;
            arg4 = arg4 + 3 & 0x3;
        }
        if (arg3 == 11) {
            arg4 = arg4 + 3 & 0x3;
            arg3 = 8;
        }
        if (arg3 == 1) {
            if (arg4 == 0) {
                for (int var18 = 0; var18 < arg7; var18++) {
                    for (int var19 = 0; var19 < arg8; var19++) {
                        if (var18 >= var19) {
                            arg1[arg6] = arg2;
                        } else if (arg0) {
                            arg1[arg6] = arg9;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            } else if (arg4 == 1) {
                for (int var12 = arg7 - 1; var12 >= 0; var12--) {
                    for (int var13 = 0; var13 < arg8; var13++) {
                        if (var13 <= var12) {
                            arg1[arg6] = arg2;
                        } else if (arg0) {
                            arg1[arg6] = arg9;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            } else if (arg4 == 2) {
                for (int var16 = 0; var16 < arg7; var16++) {
                    for (int var17 = 0; var17 < arg8; var17++) {
                        if (var17 >= var16) {
                            arg1[arg6] = arg2;
                        } else if (arg0) {
                            arg1[arg6] = arg9;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            } else if (arg4 == 3) {
                for (int var14 = arg7 - 1; var14 >= 0; var14--) {
                    for (int var15 = 0; var15 < arg8; var15++) {
                        if (var14 <= var15) {
                            arg1[arg6] = arg2;
                        } else if (arg0) {
                            arg1[arg6] = arg9;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            }
        } else if (arg3 == 2) {
            if (arg4 == 0) {
                for (int var74 = arg7 - 1; var74 >= 0; var74--) {
                    for (int var75 = 0; var75 < arg8; var75++) {
                        if (var75 <= var74 >> 1) {
                            arg1[arg6] = arg2;
                        } else if (arg0) {
                            arg1[arg6] = arg9;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            } else if (arg4 == 1) {
                for (int var68 = 0; var68 < arg7; var68++) {
                    for (int var69 = 0; var69 < arg8; var69++) {
                        if (var68 << 1 <= var69) {
                            arg1[arg6] = arg2;
                        } else if (arg0) {
                            arg1[arg6] = arg9;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            } else if (arg4 == 2) {
                for (int var72 = 0; var72 < arg7; var72++) {
                    for (int var73 = arg8 - 1; var73 >= 0; var73--) {
                        if (var72 >> 1 >= var73) {
                            arg1[arg6] = arg2;
                        } else if (arg0) {
                            arg1[arg6] = arg9;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            } else if (arg4 == 3) {
                for (int var70 = arg7 - 1; var70 >= 0; var70--) {
                    for (int var71 = arg8 - 1; var71 >= 0; var71--) {
                        if (var70 << 1 <= var71) {
                            arg1[arg6] = arg2;
                        } else if (arg0) {
                            arg1[arg6] = arg9;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            }
        } else if (arg3 == 3) {
            if (arg4 == 0) {
                for (int var26 = arg7 - 1; var26 >= 0; var26--) {
                    for (int var27 = arg8 - 1; var27 >= 0; var27--) {
                        if (var26 >> 1 >= var27) {
                            arg1[arg6] = arg2;
                        } else if (arg0) {
                            arg1[arg6] = arg9;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            } else if (arg4 == 1) {
                for (int var20 = arg7 - 1; var20 >= 0; var20--) {
                    for (int var21 = 0; var21 < arg8; var21++) {
                        if (var20 << 1 <= var21) {
                            arg1[arg6] = arg2;
                        } else if (arg0) {
                            arg1[arg6] = arg9;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            } else if (arg4 == 2) {
                for (int var24 = 0; var24 < arg7; var24++) {
                    for (int var25 = 0; var25 < arg8; var25++) {
                        if (var24 >> 1 >= var25) {
                            arg1[arg6] = arg2;
                        } else if (arg0) {
                            arg1[arg6] = arg9;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            } else if (arg4 == 3) {
                for (int var22 = 0; var22 < arg7; var22++) {
                    for (int var23 = arg8 - 1; var23 >= 0; var23--) {
                        if (var22 << 1 <= var23) {
                            arg1[arg6] = arg2;
                        } else if (arg0) {
                            arg1[arg6] = arg9;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            }
        } else if (arg3 == 4) {
            if (arg4 == 0) {
                for (int var60 = arg7 - 1; var60 >= 0; var60--) {
                    for (int var61 = 0; var61 < arg8; var61++) {
                        if (var61 >= var60 >> 1) {
                            arg1[arg6] = arg2;
                        } else if (arg0) {
                            arg1[arg6] = arg9;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            } else if (arg4 == 1) {
                for (int var66 = 0; var66 < arg7; var66++) {
                    for (int var67 = 0; var67 < arg8; var67++) {
                        if (var66 << 1 >= var67) {
                            arg1[arg6] = arg2;
                        } else if (arg0) {
                            arg1[arg6] = arg9;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            } else if (arg4 == 2) {
                for (int var62 = 0; var62 < arg7; var62++) {
                    for (int var63 = arg8 - 1; var63 >= 0; var63--) {
                        if (var62 >> 1 <= var63) {
                            arg1[arg6] = arg2;
                        } else if (arg0) {
                            arg1[arg6] = arg9;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            } else if (arg4 == 3) {
                for (int var64 = arg7 - 1; var64 >= 0; var64--) {
                    for (int var65 = arg8 - 1; var65 >= 0; var65--) {
                        if (var64 << 1 >= var65) {
                            arg1[arg6] = arg2;
                        } else if (arg0) {
                            arg1[arg6] = arg9;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            }
        } else if (arg3 != 5) {
            if (arg3 == 6) {
                if (arg4 == 0) {
                    for (int var28 = 0; var28 < arg7; var28++) {
                        for (int var29 = 0; var29 < arg8; var29++) {
                            if (var29 <= arg8 / 2) {
                                arg1[arg6] = arg2;
                            } else if (arg0) {
                                arg1[arg6] = arg9;
                            }
                            arg6++;
                        }
                        arg6 += var11;
                    }
                    return;
                }
                if (arg4 == 1) {
                    for (int var30 = 0; var30 < arg7; var30++) {
                        for (int var31 = 0; var31 < arg8; var31++) {
                            if (var30 <= arg7 / 2) {
                                arg1[arg6] = arg2;
                            } else if (arg0) {
                                arg1[arg6] = arg9;
                            }
                            arg6++;
                        }
                        arg6 += var11;
                    }
                    return;
                }
                if (arg4 == 2) {
                    for (int var32 = 0; var32 < arg7; var32++) {
                        for (int var33 = 0; var33 < arg8; var33++) {
                            if (var33 >= arg8 / 2) {
                                arg1[arg6] = arg2;
                            } else if (arg0) {
                                arg1[arg6] = arg9;
                            }
                            arg6++;
                        }
                        arg6 += var11;
                    }
                    return;
                }
                if (arg4 == 3) {
                    for (int var34 = 0; var34 < arg7; var34++) {
                        for (int var35 = 0; var35 < arg8; var35++) {
                            if (arg7 / 2 <= var34) {
                                arg1[arg6] = arg2;
                            } else if (arg0) {
                                arg1[arg6] = arg9;
                            }
                            arg6++;
                        }
                        arg6 += var11;
                    }
                    return;
                }
            }
            if (!arg5) {
                if (arg3 == 7) {
                    if (arg4 == 0) {
                        for (int var42 = 0; var42 < arg7; var42++) {
                            for (int var43 = 0; var43 < arg8; var43++) {
                                if (var42 - arg7 / 2 >= var43) {
                                    arg1[arg6] = arg2;
                                } else if (arg0) {
                                    arg1[arg6] = arg9;
                                }
                                arg6++;
                            }
                            arg6 += var11;
                        }
                        return;
                    }
                    if (arg4 == 1) {
                        for (int var40 = arg7 - 1; var40 >= 0; var40--) {
                            for (int var41 = 0; var41 < arg8; var41++) {
                                if (var40 - arg7 / 2 >= var41) {
                                    arg1[arg6] = arg2;
                                } else if (arg0) {
                                    arg1[arg6] = arg9;
                                }
                                arg6++;
                            }
                            arg6 += var11;
                        }
                        return;
                    }
                    if (arg4 == 2) {
                        for (int var36 = arg7 - 1; var36 >= 0; var36--) {
                            for (int var37 = arg8 - 1; var37 >= 0; var37--) {
                                if (var36 - arg7 / 2 >= var37) {
                                    arg1[arg6] = arg2;
                                } else if (arg0) {
                                    arg1[arg6] = arg9;
                                }
                                arg6++;
                            }
                            arg6 += var11;
                        }
                        return;
                    }
                    if (arg4 == 3) {
                        for (int var38 = 0; var38 < arg7; var38++) {
                            for (int var39 = arg8 - 1; var39 >= 0; var39--) {
                                if (var38 - arg7 / 2 >= var39) {
                                    arg1[arg6] = arg2;
                                } else if (arg0) {
                                    arg1[arg6] = arg9;
                                }
                                arg6++;
                            }
                            arg6 += var11;
                        }
                        return;
                    }
                }
                if (arg3 == 8) {
                    if (arg4 == 0) {
                        for (int var50 = 0; var50 < arg7; var50++) {
                            for (int var51 = 0; var51 < arg8; var51++) {
                                if (var50 - arg7 / 2 <= var51) {
                                    arg1[arg6] = arg2;
                                } else if (arg0) {
                                    arg1[arg6] = arg9;
                                }
                                arg6++;
                            }
                            arg6 += var11;
                        }
                        return;
                    }
                    if (arg4 == 1) {
                        for (int var48 = arg7 - 1; var48 >= 0; var48--) {
                            for (int var49 = 0; var49 < arg8; var49++) {
                                if (var48 - arg7 / 2 <= var49) {
                                    arg1[arg6] = arg2;
                                } else if (arg0) {
                                    arg1[arg6] = arg9;
                                }
                                arg6++;
                            }
                            arg6 += var11;
                        }
                        return;
                    }
                    if (arg4 == 2) {
                        for (int var44 = arg7 - 1; var44 >= 0; var44--) {
                            for (int var45 = arg8 - 1; var45 >= 0; var45--) {
                                if (var45 >= var44 - arg7 / 2) {
                                    arg1[arg6] = arg2;
                                } else if (arg0) {
                                    arg1[arg6] = arg9;
                                }
                                arg6++;
                            }
                            arg6 += var11;
                        }
                        return;
                    }
                    if (arg4 == 3) {
                        for (int var46 = 0; var46 < arg7; var46++) {
                            for (int var47 = arg8 - 1; var47 >= 0; var47--) {
                                if (var47 >= var46 - arg7 / 2) {
                                    arg1[arg6] = arg2;
                                } else if (arg0) {
                                    arg1[arg6] = arg9;
                                }
                                arg6++;
                            }
                            arg6 += var11;
                        }
                        return;
                    }
                }
            }
        } else if (arg4 == 0) {
            for (int var52 = arg7 - 1; var52 >= 0; var52--) {
                for (int var53 = arg8 - 1; var53 >= 0; var53--) {
                    if (var52 >> 1 <= var53) {
                        arg1[arg6] = arg2;
                    } else if (arg0) {
                        arg1[arg6] = arg9;
                    }
                    arg6++;
                }
                arg6 += var11;
            }
        } else if (arg4 == 1) {
            for (int var58 = arg7 - 1; var58 >= 0; var58--) {
                for (int var59 = 0; var59 < arg8; var59++) {
                    if (var58 << 1 >= var59) {
                        arg1[arg6] = arg2;
                    } else if (arg0) {
                        arg1[arg6] = arg9;
                    }
                    arg6++;
                }
                arg6 += var11;
            }
        } else if (arg4 == 2) {
            for (int var54 = 0; var54 < arg7; var54++) {
                for (int var55 = 0; var55 < arg8; var55++) {
                    if (var55 >= var54 >> 1) {
                        arg1[arg6] = arg2;
                    } else if (arg0) {
                        arg1[arg6] = arg9;
                    }
                    arg6++;
                }
                arg6 += var11;
            }
        } else if (arg4 == 3) {
            for (int var56 = 0; var56 < arg7; var56++) {
                for (int var57 = arg8 - 1; var57 >= 0; var57--) {
                    if (var57 <= var56 << 1) {
                        arg1[arg6] = arg2;
                    } else if (arg0) {
                        arg1[arg6] = arg9;
                    }
                    arg6++;
                }
                arg6 += var11;
            }
        }
    }
}
