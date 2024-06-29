import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class185 {

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "[B")
    private byte[] field3077;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "[I")
    private int[] field3069;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "[I")
    private int[] field3076;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "Lwa;")
    public static class75 field3067 = class66.method560("<col=00ff80>", false);

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "Lwa;")
    public static class75 field3070 = class66.method560("0", false);

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public static int field3079 = 0;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field3065 = 0;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "Lcb;")
    public static class267 field3071;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V", line = 7)
    public static void method1392(boolean arg0) {
        field3067 = null;
        if (!arg0) {
            field3072 = 11;
        }
        field3070 = null;
        field3071 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I[BII[BI)I", line = 22)
    public final int method1393(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field3080++;
        if (arg5 == 0) {
            return 0;
        }
        int var7 = arg2 + arg5;
        int var8 = arg0;
        int var9 = arg3;
        while (true) {
            byte var10 = arg4[var9];
            if (var10 < 0) {
                var8 = this.field3076[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field3076[var8]) < 0) {
                arg1[arg2++] = (byte) (~var11);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field3076[var8];
            }
            int var12;
            if ((var12 = this.field3076[var8]) < 0) {
                arg1[arg2++] = (byte) (~var12);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field3076[var8];
            }
            int var13;
            if ((var13 = this.field3076[var8]) < 0) {
                arg1[arg2++] = (byte) (~var13);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field3076[var8];
            }
            int var14;
            if ((var14 = this.field3076[var8]) < 0) {
                arg1[arg2++] = (byte) (~var14);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field3076[var8];
            }
            int var15;
            if ((var15 = this.field3076[var8]) < 0) {
                arg1[arg2++] = (byte) (~var15);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field3076[var8];
            }
            int var16;
            if ((var16 = this.field3076[var8]) < 0) {
                arg1[arg2++] = (byte) (~var16);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field3076[var8];
            }
            int var17;
            if ((var17 = this.field3076[var8]) < 0) {
                arg1[arg2++] = (byte) (~var17);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field3076[var8];
            }
            int var18;
            if ((var18 = this.field3076[var8]) < 0) {
                arg1[arg2++] = (byte) (~var18);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)I", line = 179)
    public static final int method1394(int arg0) {
        int var1 = 116 / ((arg0 - 18) / 63);
        field3063++;
        return 6;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZLjava/awt/Color;BLwa;I)V", line = 195)
    public static final void method1395(boolean arg0, Color arg1, byte arg2, class75 arg3, int arg4) {
        try {
            Graphics var5 = class237.field3991.getGraphics();
            if (class175.field2937 == null) {
                class175.field2937 = new Font("Helvetica", 1, 13);
                class276.field4745 = class237.field3991.getFontMetrics(class175.field2937);
            }
            if (arg2 != -30) {
                field3079 = -98;
            }
            if (arg0) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class188.field3141, class244.field4111);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class150.field2576 == null) {
                    class150.field2576 = class237.field3991.createImage(304, 34);
                }
                Graphics var6 = class150.field2576.getGraphics();
                var6.setColor(arg1);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg4 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg4 * 3 + 2, 2, 300 - (arg4 * 3), 30);
                var6.setFont(class175.field2937);
                var6.setColor(Color.white);
                arg3.method631((byte) 11, 22, (304 - arg3.method618(class276.field4745, arg2 - 23956)) / 2, var6);
                var5.drawImage(class150.field2576, class188.field3141 / 2 - 152, class244.field4111 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class188.field3141 / 2 - 152;
                int var9 = class244.field4111 / 2 - 18;
                var5.setColor(arg1);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 - -2, arg4 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 + 1, 301, 31);
                var5.fillRect(arg4 * 3 + (var8 + 2), var9 + 2, 300 - (arg4 * 3), 30);
                var5.setFont(class175.field2937);
                var5.setColor(Color.white);
                arg3.method631((byte) 108, var9 + 22, (-arg3.method618(class276.field4745, -23986) + 304) / 2 + var8, var5);
            }
            if (class97.field1598 != null) {
                var5.setFont(class175.field2937);
                var5.setColor(Color.white);
                class97.field1598.method631((byte) 13, class244.field4111 / 2 - 26, class188.field3141 / 2 + -(class97.field1598.method618(class276.field4745, -23986) / 2), var5);
            }
        } catch (Exception var12) {
            class237.field3991.repaint();
        }
        field3064++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIII)V", line = 267)
    public static final void method1396(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 - arg4 >= class153.field2635 && arg0 + arg4 <= class288.field4956 && arg1 - arg4 >= class90.field1495 && class294.field5041 >= (arg1 + arg4)) {
            class242.method1761(125, arg0, arg4, arg1, arg3);
        } else {
            class149.method1147(arg3, arg1, arg4, arg0, 27268);
        }
        if (arg2 < 81) {
            method1396(-62, 35, 43, 19, -18);
        }
        field3073++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)I", line = 286)
    public static final int method1397(boolean arg0, int arg1) {
        long var2 = class78.method669(arg1 - 17185);
        if (arg1 != 19232) {
            field3070 = (class75) null;
        }
        field3074++;
        for (class272 var4 = arg0 ? (class272) class242.field4080.method1001((byte) 33) : (class272) class242.field4080.method1009(arg1 - 19360); var4 != null; var4 = (class272) class242.field4080.method1009(-128)) {
            if (var2 > (var4.field4696 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field4696 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field3488;
                    class286.field4920[var5] = class6.field77[var5];
                    var4.method1527(-86);
                    return var5;
                }
                var4.method1527(-67);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILcb;)V", line = 329)
    public static final void method1398(int arg0, class267 arg1) {
        class78.field1335 = arg1;
        field3081++;
        if (arg0 != 17472) {
            method1399(false, 74);
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(ZI)Lnc;", line = 340)
    public static final class136 method1399(boolean arg0, int arg1) {
        field3066++;
        class136 var2 = (class136) class226.field3812.method1514(false, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class221.field3765.method1911(26, arg1, -99);
        class136 var4 = new class136();
        if (!arg0) {
            method1396(68, 33, -125, -3, 9);
        }
        if (var3 != null) {
            var4.method1042(new class60(var3), (byte) -78);
        }
        class226.field3812.method1509((long) arg1, var4, -1);
        return var4;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Z)V", line = 365)
    public static final void method1400(boolean arg0) {
        field3068++;
        for (class218 var1 = (class218) class5.field52.method1250(arg0); var1 != null; var1 = (class218) class5.field52.method1256((byte) -123)) {
            class172 var2 = var1.field3722;
            if (class67.field1174 != var2.field2905 || var2.field2906) {
                var1.method1527(-64);
            } else if (class143.field2463 >= var2.field2900) {
                var2.method1272(class250.field4208, 21883);
                if (var2.field2906) {
                    var1.method1527(-121);
                } else {
                    class213.method1571(var2.field2905, var2.field2890, var2.field2893, var2.field2898, 60, var2, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "([B)V", line = 405)
    public class185(byte[] arg0) {
        int var2 = arg0.length;
        this.field3077 = arg0;
        this.field3069 = new int[var2];
        this.field3076 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field3069[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class102.method799(var11, var12);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field3076[var14] == 0) {
                            this.field3076[var14] = var4;
                        }
                        var14 = this.field3076[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field3076.length <= var14) {
                        int[] var18 = new int[this.field3076.length * 2];
                        for (int var19 = 0; var19 < this.field3076.length; var19++) {
                            var18[var19] = this.field3076[var19];
                        }
                        this.field3076 = var18;
                    }
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field3076[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([[[B[[B[[B[[I[[B[[F[[FZ[[II[[B[[F)[Lcg;", line = 531)
    public static final class38[] method1401(byte[][][] arg0, byte[][] arg1, byte[][] arg2, int[][] arg3, byte[][] arg4, float[][] arg5, float[][] arg6, boolean arg7, int[][] arg8, int arg9, byte[][] arg10, float[][] arg11) {
        field3078++;
        class126 var12 = new class126(128);
        if (arg7) {
            field3070 = (class75) null;
        }
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg1[var13][var14] & 0xFF;
                int var16 = arg10[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class87 var17 = class282.method1999(-3, var16 - 1);
                    if (var17.field1436 == -1) {
                        continue;
                    }
                    class38 var18 = class172.method1270(var12, -14517, var17);
                    byte var19 = arg4[var13][var14];
                    int[] var20 = class238.field4010[var19];
                    var18.field559 += var20.length / 2;
                    var18.field582++;
                    if (var17.field1429 && var15 != 0) {
                        var18.field559 += class253.field4245[var19];
                    }
                }
                if ((arg1[var13][var14] & 0xFF) != 0 || var16 != 0 && arg4[var13][var14] == 0) {
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 0;
                    int[] var25 = new int[8];
                    int var26 = 0;
                    int var27 = arg10[var13][var14 + 1] & 0xFF;
                    int var28 = arg10[var13 - 1][var14] & 0xFF;
                    int var29 = arg10[var13][var14 - 1] & 0xFF;
                    int var30 = arg10[var13 - 1][var14 + 1] & 0xFF;
                    int var31 = arg10[var13 + 1][var14 - 1] & 0xFF;
                    int var32 = arg10[var13 - 1][var14 - 1] & 0xFF;
                    int var33 = arg10[var13 + 1][var14 + 1] & 0xFF;
                    int var34 = arg10[var13 + 1][var14] & 0xFF;
                    if (var30 == 0 || var16 == var30) {
                        boolean var43 = false;
                    } else {
                        class87 var35 = class282.method1999(-3, var30 - 1);
                        if (var35.field1429 && var35.field1436 != -1) {
                            byte var36 = arg2[var13 - 1][var14 + 1];
                            byte var37 = arg4[var13 - 1][var14 + 1];
                            int var38 = class100.field1651[(var36 + 2 & 0x3) + var37 * 4];
                            int var39 = class100.field1651[(var36 + 3 & 0x3) + var37 * 4];
                            if (class73.field1230[var39][1] && class73.field1230[var38][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var21 == var41) {
                                        var25[var21++] = var30;
                                        break;
                                    }
                                    if (var25[var41] == var30) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var42 = false;
                        }
                    }
                    if (var32 == 0 || var16 == var32) {
                        boolean var52 = false;
                    } else {
                        class87 var44 = class282.method1999(-3, var32 - 1);
                        if (var44.field1429 && var44.field1436 != -1) {
                            byte var45 = arg2[var13 - 1][var14 - 1];
                            byte var46 = arg4[var13 - 1][var14 - 1];
                            int var47 = class100.field1651[(var45 & 0x3) + var46 * 4];
                            int var48 = class100.field1651[(var45 + 3 & 0x3) + var46 * 4];
                            if (class73.field1230[var47][1] && class73.field1230[var48][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var21 == var50) {
                                        var25[var21++] = var32;
                                        break;
                                    }
                                    if (var25[var50] == var32) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var51 = false;
                        }
                    }
                    if (var31 == 0 || var16 == var31) {
                        boolean var61 = false;
                    } else {
                        class87 var53 = class282.method1999(-3, var31 - 1);
                        if (var53.field1429 && var53.field1436 != -1) {
                            byte var54 = arg4[var13 + 1][var14 - 1];
                            byte var55 = arg2[var13 + 1][var14 - 1];
                            int var56 = class100.field1651[(var55 & 0x3) + var54 * 4];
                            int var57 = class100.field1651[(var55 + 1 & 0x3) + var54 * 4];
                            if (class73.field1230[var57][1] && class73.field1230[var56][0]) {
                                boolean var58 = false;
                            } else {
                                for (int var59 = 0; var59 < 8; var59++) {
                                    if (var21 == var59) {
                                        var25[var21++] = var31;
                                        break;
                                    }
                                    if (var25[var59] == var31) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var60 = false;
                        }
                    }
                    if (var33 == 0 || var16 == var33) {
                        boolean var70 = false;
                    } else {
                        class87 var62 = class282.method1999(-3, var33 - 1);
                        if (var62.field1429 && var62.field1436 != -1) {
                            byte var63 = arg2[var13 + 1][var14 + 1];
                            byte var64 = arg4[var13 + 1][var14 + 1];
                            int var65 = class100.field1651[(var63 + 1 & 0x3) + var64 * 4];
                            int var66 = class100.field1651[(var63 + 2 & 0x3) + var64 * 4];
                            if (class73.field1230[var66][1] && class73.field1230[var65][0]) {
                                boolean var67 = false;
                            } else {
                                for (int var68 = 0; var68 < 8; var68++) {
                                    if (var21 == var68) {
                                        var25[var21++] = var33;
                                        break;
                                    }
                                    if (var25[var68] == var33) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var69 = false;
                        }
                    }
                    if (var27 != 0 && var16 != var27) {
                        class87 var71 = class282.method1999(-3, var27 - 1);
                        if (var71.field1429 && var71.field1436 != -1) {
                            var23 = class100.field1651[arg4[var13][var14 + 1] * 4 + (arg2[var13][var14 + 1] + 2 & 0x3)];
                            for (int var72 = 0; var72 < 8; var72++) {
                                if (var21 == var72) {
                                    var25[var21++] = var27;
                                    break;
                                }
                                if (var25[var72] == var27) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var28 != 0 && var16 != var28) {
                        class87 var73 = class282.method1999(-3, var28 - 1);
                        if (var73.field1429 && var73.field1436 != -1) {
                            var22 = class100.field1651[(arg2[var13 - 1][var14] + 3 & 0x3) + arg4[var13 - 1][var14] * 4];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var21 == var74) {
                                    var25[var21++] = var28;
                                    break;
                                }
                                if (var25[var74] == var28) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var29 != 0 && var16 != var29) {
                        class87 var75 = class282.method1999(-3, var29 - 1);
                        if (var75.field1429 && var75.field1436 != -1) {
                            var24 = class100.field1651[(arg2[var13][var14 - 1] & 0x3) + arg4[var13][var14 - 1] * 4];
                            for (int var76 = 0; var76 < 8; var76++) {
                                if (var21 == var76) {
                                    var25[var21++] = var29;
                                    break;
                                }
                                if (var25[var76] == var29) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var34 != 0 && var16 != var34) {
                        class87 var77 = class282.method1999(-3, var34 - 1);
                        if (var77.field1429 && var77.field1436 != -1) {
                            var26 = class100.field1651[arg4[var13 + 1][var14] * 4 + (arg2[var13 + 1][var14] + 1 & 0x3)];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var21 == var78) {
                                    var25[var21++] = var34;
                                    break;
                                }
                                if (var25[var78] == var34) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var21; var79++) {
                        int var80 = var25[var79];
                        boolean[] var81 = class73.field1230[var27 == var80 ? var23 : 0];
                        boolean[] var82 = class73.field1230[var28 == var80 ? var22 : 0];
                        boolean[] var83 = class73.field1230[var34 == var80 ? var26 : 0];
                        boolean[] var84 = class73.field1230[var29 == var80 ? var24 : 0];
                        class87 var85 = class282.method1999(-3, var80 - 1);
                        class38 var86 = class172.method1270(var12, -14517, var85);
                        var86.field559 += 5;
                        var86.field559 += var81.length - 2;
                        var86.field559 += var82.length - 2;
                        var86.field559 += var84.length - 2;
                        var86.field559 += var83.length - 2;
                        var86.field582++;
                    }
                }
            }
        }
        for (class38 var87 = (class38) var12.method1001((byte) 33); var87 != null; var87 = (class38) var12.method1009(-122)) {
            var87.method258();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90;
                if ((arg0[arg9][var88][var89] & 0x8) != 0) {
                    var90 = 0;
                } else if ((arg0[1][var88][var89] & 0x2) == 2 && arg9 > 0) {
                    var90 = arg9 - 1;
                } else {
                    var90 = arg9;
                }
                int var91 = arg10[var88][var89] & 0xFF;
                int var92 = arg1[var88][var89] & 0xFF;
                if (var91 != 0) {
                    class87 var93 = class282.method1999(-3, var91 - 1);
                    if (var93.field1436 == -1) {
                        continue;
                    }
                    class38 var94 = class172.method1270(var12, -14517, var93);
                    byte var95 = arg2[var88][var89];
                    byte var96 = arg4[var88][var89];
                    int var97 = class16.method91(var93.field1428, var93.field1436, arg8[var88][var89], -30110);
                    int var98 = class16.method91(var93.field1428, var93.field1436, arg8[var88 + 1][var89], -30110);
                    int var99 = class16.method91(var93.field1428, var93.field1436, arg8[var88 + 1][var89 + 1], -30110);
                    int var100 = class16.method91(var93.field1428, var93.field1436, arg8[var88][var89 + 1], -30110);
                    class196.method1462(arg6, var96, var95, arg3, var89, var94, var98, (byte) 127, var90, var88, arg11, var97, var99, var100, var92 != 0 && var93.field1429, arg5);
                }
                if ((arg1[var88][var89] & 0xFF) != 0 || var91 != 0 && arg4[var88][var89] == 0) {
                    int[] var101 = new int[8];
                    int var102 = 0;
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = 0;
                    int var107 = arg10[var88][var89 + 1] & 0xFF;
                    int var108 = arg10[var88][var89 - 1] & 0xFF;
                    int var109 = arg10[var88 + 1][var89] & 0xFF;
                    int var110 = arg10[var88 - 1][var89 + 1] & 0xFF;
                    int var111 = arg10[var88 + 1][var89 - 1] & 0xFF;
                    int var112 = arg10[var88 + 1][var89 + 1] & 0xFF;
                    int var113 = arg10[var88 - 1][var89 - 1] & 0xFF;
                    int var114 = arg10[var88 - 1][var89] & 0xFF;
                    if (var110 == 0 || var91 == var110) {
                        var110 = 0;
                    } else {
                        class87 var115 = class282.method1999(-3, var110 - 1);
                        if (var115.field1429 && var115.field1436 != -1) {
                            byte var116 = arg2[var88 - 1][var89 + 1];
                            byte var117 = arg4[var88 - 1][var89 + 1];
                            int var118 = class100.field1651[(var116 + 3 & 0x3) + var117 * 4];
                            int var119 = class100.field1651[var117 * 4 + (var116 + 2 & 0x3)];
                            if (class73.field1230[var118][1] && class73.field1230[var119][0]) {
                                var110 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var102 == var120) {
                                        var101[var102++] = var110;
                                        break;
                                    }
                                    if (var101[var120] == var110) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var110 = 0;
                        }
                    }
                    if (var113 == 0 || var91 == var113) {
                        var113 = 0;
                    } else {
                        class87 var121 = class282.method1999(-3, var113 - 1);
                        if (var121.field1429 && var121.field1436 != -1) {
                            byte var122 = arg4[var88 - 1][var89 - 1];
                            byte var123 = arg2[var88 - 1][var89 - 1];
                            int var124 = class100.field1651[(var123 & 0x3) + var122 * 4];
                            int var125 = class100.field1651[(var123 + 3 & 0x3) + var122 * 4];
                            if (class73.field1230[var124][1] && class73.field1230[var125][0]) {
                                var113 = 0;
                            } else {
                                for (int var126 = 0; var126 < 8; var126++) {
                                    if (var102 == var126) {
                                        var101[var102++] = var113;
                                        break;
                                    }
                                    if (var101[var126] == var113) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var113 = 0;
                        }
                    }
                    if (var111 == 0 || var91 == var111) {
                        var111 = 0;
                    } else {
                        class87 var127 = class282.method1999(-3, var111 - 1);
                        if (var127.field1429 && var127.field1436 != -1) {
                            byte var128 = arg2[var88 + 1][var89 - 1];
                            byte var129 = arg4[var88 + 1][var89 - 1];
                            int var130 = class100.field1651[var129 * 4 + (var128 & 0x3)];
                            int var131 = class100.field1651[(var128 + 1 & 0x3) + var129 * 4];
                            if (class73.field1230[var131][1] && class73.field1230[var130][0]) {
                                var111 = 0;
                            } else {
                                for (int var132 = 0; var132 < 8; var132++) {
                                    if (var102 == var132) {
                                        var101[var102++] = var111;
                                        break;
                                    }
                                    if (var101[var132] == var111) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var111 = 0;
                        }
                    }
                    if (var112 == 0 || var91 == var112) {
                        var112 = 0;
                    } else {
                        class87 var133 = class282.method1999(-3, var112 - 1);
                        if (var133.field1429 && var133.field1436 != -1) {
                            byte var134 = arg2[var88 + 1][var89 + 1];
                            byte var135 = arg4[var88 + 1][var89 + 1];
                            int var136 = class100.field1651[(var134 + 1 & 0x3) + var135 * 4];
                            int var137 = class100.field1651[(var134 + 2 & 0x3) + var135 * 4];
                            if (class73.field1230[var137][1] && class73.field1230[var136][0]) {
                                var112 = 0;
                            } else {
                                for (int var138 = 0; var138 < 8; var138++) {
                                    if (var102 == var138) {
                                        var101[var102++] = var112;
                                        break;
                                    }
                                    if (var101[var138] == var112) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var112 = 0;
                        }
                    }
                    if (var107 != 0 && var91 != var107) {
                        class87 var139 = class282.method1999(-3, var107 - 1);
                        if (var139.field1429 && var139.field1436 != -1) {
                            var103 = class100.field1651[(arg2[var88][var89 + 1] + 2 & 0x3) + arg4[var88][var89 + 1] * 4];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var102 == var140) {
                                    var101[var102++] = var107;
                                    break;
                                }
                                if (var101[var140] == var107) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var114 != 0 && var91 != var114) {
                        class87 var141 = class282.method1999(-3, var114 - 1);
                        if (var141.field1429 && var141.field1436 != -1) {
                            var105 = class100.field1651[arg4[var88 - 1][var89] * 4 + (arg2[var88 - 1][var89] + 3 & 0x3)];
                            for (int var142 = 0; var142 < 8; var142++) {
                                if (var102 == var142) {
                                    var101[var102++] = var114;
                                    break;
                                }
                                if (var101[var142] == var114) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var108 != 0 && var91 != var108) {
                        class87 var143 = class282.method1999(-3, var108 - 1);
                        if (var143.field1429 && var143.field1436 != -1) {
                            var104 = class100.field1651[(arg2[var88][var89 - 1] & 0x3) + arg4[var88][var89 - 1] * 4];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var102 == var144) {
                                    var101[var102++] = var108;
                                    break;
                                }
                                if (var101[var144] == var108) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var109 != 0 && var91 != var109) {
                        class87 var145 = class282.method1999(-3, var109 - 1);
                        if (var145.field1429 && var145.field1436 != -1) {
                            var106 = class100.field1651[(arg2[var88 + 1][var89] + 1 & 0x3) + arg4[var88 + 1][var89] * 4];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var102 == var146) {
                                    var101[var102++] = var109;
                                    break;
                                }
                                if (var101[var146] == var109) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var102; var147++) {
                        int var148 = var101[var147];
                        boolean[] var149 = class73.field1230[var107 == var148 ? var103 : 0];
                        boolean[] var150 = class73.field1230[var114 == var148 ? var105 : 0];
                        boolean[] var151 = class73.field1230[var108 == var148 ? var104 : 0];
                        boolean[] var152 = class73.field1230[var109 == var148 ? var106 : 0];
                        class87 var153 = class282.method1999(-3, var148 - 1);
                        class38 var154 = class172.method1270(var12, -14517, var153);
                        byte var155 = 6;
                        int var156 = class16.method91(var153.field1428, var153.field1436, arg8[var88][var89], -30110) << 8 | 0xFF;
                        int var157 = class16.method91(var153.field1428, var153.field1436, arg8[var88 + 1][var89], -30110) << 8 | 0xFF;
                        int var158 = class16.method91(var153.field1428, var153.field1436, arg8[var88 + 1][var89 + 1], -30110) << 8 | 0xFF;
                        int var159 = class16.method91(var153.field1428, var153.field1436, arg8[var88][var89 + 1], -30110) << 8 | 0xFF;
                        boolean var160 = var112 != var148 && var149[0] && var152[1];
                        boolean var161 = var110 != var148 && var150[0] && var149[1];
                        int var162 = var149.length + var155 - 2;
                        boolean var163 = var111 != var148 && var152[0] && var151[1];
                        boolean var164 = var113 != var148 && var151[0] && var150[1];
                        int var165 = var150.length + var162 - 2;
                        int var166 = var151.length + var165 - 2;
                        int var167 = var152.length + var166 - 2;
                        int[] var168 = new int[var167];
                        int var169 = class82.method684(64, true, arg6, (int[][]) null, 0.0F, arg5, 14613, var159, var154, var158, arg11, var156, 64, var88, arg3, 0, var89, var157);
                        byte var170 = 0;
                        int var171 = class82.method684(128, var161, arg6, (int[][]) null, 0.0F, arg5, 14613, var159, var154, var158, arg11, var156, 0, var88, arg3, 0, var89, var157);
                        int var172 = class82.method684(128, var160, arg6, (int[][]) null, 0.0F, arg5, 14613, var159, var154, var158, arg11, var156, 128, var88, arg3, 0, var89, var157);
                        int var173 = class82.method684(0, var164, arg6, (int[][]) null, 0.0F, arg5, 14613, var159, var154, var158, arg11, var156, 0, var88, arg3, 0, var89, var157);
                        int var174 = class82.method684(0, var163, arg6, (int[][]) null, 0.0F, arg5, 14613, var159, var154, var158, arg11, var156, 128, var88, arg3, 0, var89, var157);
                        int var180 = var170 + 1;
                        var168[var170] = var169;
                        var168[var180++] = var172;
                        if (var149.length > 2) {
                            var168[var180++] = class82.method684(128, var149[2], arg6, (int[][]) null, 0.0F, arg5, 14613, var159, var154, var158, arg11, var156, 64, var88, arg3, 0, var89, var157);
                        }
                        var168[var180++] = var171;
                        if (var150.length > 2) {
                            var168[var180++] = class82.method684(64, var150[2], arg6, (int[][]) null, 0.0F, arg5, 14613, var159, var154, var158, arg11, var156, 0, var88, arg3, 0, var89, var157);
                        }
                        var168[var180++] = var173;
                        if (var151.length > 2) {
                            var168[var180++] = class82.method684(0, var151[2], arg6, (int[][]) null, 0.0F, arg5, 14613, var159, var154, var158, arg11, var156, 64, var88, arg3, 0, var89, var157);
                        }
                        var168[var180++] = var174;
                        if (var152.length > 2) {
                            var168[var180++] = class82.method684(64, var152[2], arg6, (int[][]) null, 0.0F, arg5, 14613, var159, var154, var158, arg11, var156, 128, var88, arg3, 0, var89, var157);
                        }
                        var168[var180++] = var172;
                        var154.method259(var90, var88, var89, var168, (int[]) null, true);
                    }
                }
            }
        }
        for (class38 var175 = (class38) var12.method1001((byte) 33); var175 != null; var175 = (class38) var12.method1009(-118)) {
            if (var175.field586 == 0) {
                var175.method1527(-87);
            } else {
                var175.method255();
            }
        }
        int var176 = var12.method999(arg7);
        class38[] var177 = new class38[var176];
        long[] var178 = new long[var176];
        var12.method1011(var177, (byte) 126);
        for (int var179 = 0; var179 < var176; var179++) {
            var178[var179] = var177[var179].field3488;
        }
        class151.method1158(var178, var177, arg7);
        return var177;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I[B[BIII)I", line = 1472)
    public final int method1402(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field3075++;
        int var7 = arg3 + arg5;
        int var8 = 0;
        int var9 = arg0 << 3;
        while (arg5 < var7) {
            int var10 = arg2[arg5] & 0xFF;
            byte var11 = this.field3077[var10];
            int var12 = this.field3069[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var8 & -var14 >> 31;
            int var16 = (var11 + var14 - 1 >> 3) + var13;
            var9 += var11;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var8 = class102.method799(var15, var12 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg1[var13] = (byte) (var8 = var12 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg1[var13] = (byte) (var8 = var12 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg1[var13] = (byte) (var8 = var12 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg1[var13] = (byte) (var8 = var12 << -var14);
                        }
                    }
                }
            }
            arg5++;
        }
        if (arg4 != -19252) {
            method1401((byte[][][]) ((byte[][][]) null), (byte[][]) ((byte[][]) null), (byte[][]) ((byte[][]) null), (int[][]) ((int[][]) null), (byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), false, (int[][]) ((int[][]) null), 118, (byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null));
        }
        return (var9 + 7 >> 3) - arg0;
    }
}
