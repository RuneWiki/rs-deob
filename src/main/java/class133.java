import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class133 {

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "F")
    public static float field1692;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)V", line = 3)
    public static final void method890(byte arg0) {
        if (class112.field1433 < 102) {
            class112.field1433 += 6;
        }
        field1690++;
        if (class20.field528 != -1 && class301.method1787((byte) 46) > class544.field7883) {
            for (int var1 = class20.field528; var1 < class410.field5806.length; var1++) {
                if (class410.field5806[var1].startsWith("pause")) {
                    int var2 = 5;
                    try {
                        var2 = Integer.parseInt(class410.field5806[var1].substring(6));
                    } catch (Exception var13) {
                    }
                    class79.method660((byte) 43, "Pausing for " + var2 + " seconds...");
                    class20.field528 = var1 + 1;
                    class544.field7883 = (long) (var2 * 1000) + class301.method1787((byte) -94);
                    return;
                }
                class220.field2850 = class410.field5806[var1];
                class559.method3272(-16392, false);
            }
            class20.field528 = -1;
        }
        if (class131.field1668 != 0) {
            class405.field5743 -= class131.field1668 * 5;
            if (class567.field8285 <= class405.field5743) {
                class405.field5743 = class567.field8285 - 1;
            }
            class131.field1668 = 0;
            if (class405.field5743 < 0) {
                class405.field5743 = 0;
            }
        }
        int var3 = 0;
        if (arg0 <= 34) {
            method890((byte) -67);
        }
        while (class660.field9377 > var3) {
            class446 var4 = class159.field1934[var3];
            int var5 = var4.method2637(127);
            char var6 = var4.method2636((byte) 93);
            int var7 = var4.method2638(true);
            if (var5 == 84) {
                class559.method3272(-16392, false);
            }
            if (var5 == 80) {
                class559.method3272(-16392, true);
            } else if (var5 == 66 && (var7 & 0x4) != 0) {
                if (class181.field2220 != null) {
                    String var8 = "";
                    for (int var9 = class652.field9237.length - 1; var9 >= 0; var9--) {
                        if (class652.field9237[var9] != null && class652.field9237[var9].length() > 0) {
                            var8 = var8 + class652.field9237[var9] + '\n';
                        }
                    }
                    class181.field2220.setContents(new StringSelection(var8), null);
                }
            } else if (var5 == 67 && (var7 & 0x4) != 0) {
                if (class181.field2220 != null) {
                    Transferable var10 = class181.field2220.getContents(null);
                    if (var10 != null) {
                        try {
                            String var11 = (String) var10.getTransferData(DataFlavor.stringFlavor);
                            if (var11 != null) {
                                String[] var12 = class72.method637('\n', false, var11);
                                class404.method2433(var12, (byte) 113);
                            }
                        } catch (Exception var14) {
                        }
                    }
                }
            } else if (var5 == 85 && class603.field8700 > 0) {
                class220.field2850 = class220.field2850.substring(0, class603.field8700 - 1) + class220.field2850.substring(class603.field8700);
                class603.field8700--;
            } else if (var5 == 101 && class603.field8700 < class220.field2850.length()) {
                class220.field2850 = class220.field2850.substring(0, class603.field8700) + class220.field2850.substring(class603.field8700 + 1);
            } else if (var5 == 96 && class603.field8700 > 0) {
                class603.field8700--;
            } else if (var5 == 97 && class603.field8700 < class220.field2850.length()) {
                class603.field8700++;
            } else if (var5 == 102) {
                class603.field8700 = 0;
            } else if (var5 == 103) {
                class603.field8700 = class220.field2850.length();
            } else if (var5 == 104 && class176.field2173 < class652.field9237.length) {
                class176.field2173++;
                class541.method3171(-75);
                class603.field8700 = class220.field2850.length();
            } else if (var5 == 105 && class176.field2173 > 0) {
                class176.field2173--;
                class541.method3171(-79);
                class603.field8700 = class220.field2850.length();
            } else if (class236.method1432(var6, 48) || var6 == '\\' || var6 == '/' || var6 == '.' || var6 == ':' || var6 == ',' || var6 == ' ' || var6 == '_' || var6 == '-' || var6 == '+' || var6 == '[' || var6 == ']') {
                class220.field2850 = class220.field2850.substring(0, class603.field8700) + class159.field1934[var3].method2636((byte) 72) + class220.field2850.substring(class603.field8700);
                class603.field8700++;
            }
            var3++;
        }
        class660.field9377 = 0;
        class171.field2089 = 0;
        class100.method747(false);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(FFIIFIII)[F", line = 197)
    public static final float[] method891(float arg0, float arg1, int arg2, int arg3, float arg4, int arg5, int arg6, int arg7) {
        field1689++;
        float[] var8 = new float[9];
        if (arg5 != 19386) {
            method891(-0.25388762F, -0.31088442F, -35, 56, 0.16821773F, 67, 57, -70);
        }
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
        float var12 = 1.0F - var10;
        var8[3] = 0.0F;
        var8[8] = var10;
        var8[4] = 1.0F;
        var8[7] = 0.0F;
        var8[1] = 0.0F;
        var8[5] = 0.0F;
        var8[0] = var10;
        var8[2] = var11;
        var8[6] = -var11;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg7 / 32767.0F;
        float var16 = 0.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - (var15 * var15))));
        float var18 = 1.0F - var15;
        float var19 = (float) Math.sqrt((double) (arg3 * arg3 + arg6 * arg6));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var16 = (float) arg6 / var19;
                var14 = (float) (-arg3) / var19;
            }
            var13[4] = var15;
            var13[5] = var14 * var17;
            var13[8] = var16 * var16 * var18 + var15;
            var13[2] = var14 * var16 * var18;
            var13[3] = -var16 * var17;
            var13[7] = -var14 * var17;
            var13[6] = var14 * var16 * var18;
            var13[1] = var16 * var17;
            var13[0] = var14 * var14 * var18 + var15;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[6] *= arg1;
        var9[2] *= arg0;
        var9[1] *= arg0;
        var9[0] *= arg0;
        var9[4] *= arg4;
        var9[3] *= arg4;
        var9[8] *= arg1;
        var9[7] *= arg1;
        var9[5] *= arg4;
        return var9;
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(B)V", line = 282)
    public static final void method892(byte arg0) {
        field1691++;
        int var1 = class29.field617.method2279((byte) -127);
        int var2 = class29.field617.method2260(-35);
        class53.field865 = class29.field617.method2240((byte) 118);
        int var3 = class29.field617.method2262(true);
        boolean var4 = class29.field617.method2240((byte) 125) == 1;
        class28.method384((byte) 100);
        class603.method3474(var3, (byte) 19);
        class29.field617.method26(8);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < class473.field6604 >> 3; var20++) {
                for (int var21 = 0; var21 < class205.field2465 >> 3; var21++) {
                    int var22 = class29.field617.method25(1, 255);
                    if (var22 == 1) {
                        class50.field831[var5][var20][var21] = class29.field617.method25(26, 255);
                    } else {
                        class50.field831[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class29.field617.method32((byte) -127);
        int var6 = (class283.field3848 - class29.field617.field5195) / 16;
        class322.field4249 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class322.field4249[var7][var19] = class29.field617.method2255(255);
            }
        }
        class653.field9257 = new byte[var6][];
        class423.field6026 = null;
        class498.field6965 = new int[var6];
        class312.field4119 = new int[var6];
        if (arg0 > -109) {
            field1693 = 80;
        }
        class346.field4549 = new byte[var6][];
        class5.field38 = null;
        class176.field2177 = new int[var6];
        class50.field830 = new byte[var6][];
        class478.field6703 = new int[var6];
        class445.field6318 = new int[var6];
        class354.field4734 = new byte[var6][];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < class473.field6604 >> 3; var10++) {
                for (int var11 = 0; var11 < class205.field2465 >> 3; var11++) {
                    int var12 = class50.field831[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = var12 >> 14 & 0x3FF;
                        int var14 = (var12 & 0x3FFB) >> 3;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class312.field4119[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class312.field4119[var8] = var15;
                            int var17 = (var15 & 0xFFAE) >> 8;
                            int var18 = var15 & 0xFF;
                            class498.field6965[var8] = class89.field1249.method3804((byte) 82, "m" + var17 + "_" + var18);
                            class445.field6318[var8] = class89.field1249.method3804((byte) 74, "l" + var17 + "_" + var18);
                            class176.field2177[var8] = class89.field1249.method3804((byte) 101, "um" + var17 + "_" + var18);
                            class478.field6703[var8] = class89.field1249.method3804((byte) 107, "ul" + var17 + "_" + var18);
                            var8++;
                        }
                    }
                }
            }
        }
        class245.method1493((byte) 108, var4, 11, var2, var1);
    }
}
