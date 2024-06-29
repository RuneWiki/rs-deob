import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class613 {

    @OriginalMember(owner = "client!hw", name = "h", descriptor = "[I")
    private int[] field8645;

    @OriginalMember(owner = "client!hw", name = "g", descriptor = "[B")
    private byte[] field8644;

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "[I")
    private int[] field8642;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "I")
    public static int field8638;

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "I")
    public static int field8639;

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "I")
    public static int field8640;

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "I")
    public static int field8641;

    @OriginalMember(owner = "client!hw", name = "f", descriptor = "I")
    public static int field8643;

    @OriginalMember(owner = "client!hw", name = "i", descriptor = "I")
    public static int field8646;

    @OriginalMember(owner = "client!hw", name = "j", descriptor = "I")
    public static int field8647;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V", line = 6)
    public static final void method3498(byte arg0) {
        field8641++;
        if (class448.field6538 == -1 || class440.field6414 == -1) {
            return;
        }
        int var1 = ((class36.field352 - class618.field8706) * class271.field4167 >> 16) + class618.field8706;
        class271.field4167 += var1;
        if (class271.field4167 < 65535) {
            class38.field559 = false;
            class423.field6228 = false;
        } else {
            class271.field4167 = 65535;
            if (class38.field559) {
                class423.field6228 = false;
            } else {
                class423.field6228 = true;
            }
            class38.field559 = true;
        }
        float var2 = (float) class271.field4167 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class436.field6372 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var22 = class82.field1208[class448.field6538][var4][var5] * 3;
            int var23 = class82.field1208[class448.field6538][var4 + 1][var5] * 3;
            int var24 = (class82.field1208[class448.field6538][var4 + 2][var5] + class82.field1208[class448.field6538][var4 + 2][var5] - class82.field1208[class448.field6538][var4 + 3][var5]) * 3;
            int var25 = class82.field1208[class448.field6538][var4][var5];
            int var26 = var23 - var22;
            int var27 = var22 + var24 - (var23 * 2);
            int var28 = class82.field1208[class448.field6538][var4 + 2][var5] + var23 - var25 - var24;
            var3[var5] = (((float) var28 * var2 + (float) var27) * var2 + (float) var26) * var2 + (float) var25;
        }
        class101.field1507 = (int) var3[1] * -1;
        class329.field4857 = (int) var3[2] - class723.field10155 * 512;
        class497.field7212 = (int) var3[0] - (class265.field4123 * 512);
        float[] var6 = new float[3];
        int var7 = class494.field7161 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var15 = class82.field1208[class440.field6414][var7][var8] * 3;
            int var16 = class82.field1208[class440.field6414][var7 + 1][var8] * 3;
            int var17 = (-class82.field1208[class440.field6414][var7 + 3][var8] - (-class82.field1208[class440.field6414][var7 + 2][var8] - class82.field1208[class440.field6414][var7 + 2][var8])) * 3;
            int var18 = class82.field1208[class440.field6414][var7][var8];
            int var19 = var16 - var15;
            int var20 = var15 + var17 - (var16 * 2);
            int var21 = class82.field1208[class440.field6414][var7 + 2][var8] + var16 - var18 - var17;
            var6[var8] = (((float) var21 * var2 + (float) var20) * var2 + (float) var19) * var2 + (float) var18;
        }
        int var9 = -61 % ((-arg0 - 21) / 51);
        float var10 = var6[0] - var3[0];
        float var11 = (var6[1] - var3[1]) * -1.0F;
        float var12 = var6[2] - var3[2];
        double var13 = Math.sqrt((double) (var10 * var10 + var12 * var12));
        class81.field1167 = (int) (Math.atan2((double) var11, var13) * 2607.5945876176133D) & 0x3FFF;
        class608.field8587 = (int) (-Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
        class40.field714 = ((class82.field1208[class448.field6538][var4 + 2][3] - class82.field1208[class448.field6538][var4][3]) * class271.field4167 >> 16) + class82.field1208[class448.field6538][var4][3];
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIZ[ILrs;III)Lsb;", line = 108)
    public static final class89 method3499(int arg0, int arg1, boolean arg2, int[] arg3, class166 arg4, int arg5, int arg6, int arg7) {
        field8638++;
        if (arg5 <= 119) {
            method3498((byte) -110);
        }
        if (!arg4.field2818 && (!class668.method3743((byte) -121, arg1) || !class668.method3743((byte) -122, arg0))) {
            return arg4.field2824 ? new class89(arg4, 34037, arg1, arg0, arg2, arg3, arg6, arg7) : new class89(arg4, arg1, arg0, class567.method3292(arg1, -96), class567.method3292(arg0, -95), arg3);
        } else {
            return new class89(arg4, 3553, arg1, arg0, arg2, arg3, arg6, arg7);
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIII[B[B)I", line = 131)
    public final int method3500(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte[] arg5) {
        field8639++;
        int var7 = 0;
        int var8 = arg2 << 3;
        int var9 = arg1 + arg3;
        while (var9 > arg1) {
            int var10 = arg5[arg1] & 0xFF;
            int var11 = this.field8645[var10];
            byte var12 = this.field8644[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var7 = class112.method903(var15, var11 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg4[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg4[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg4[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var14 -= 8;
                            var13++;
                            arg4[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var8 += var12;
            arg1++;
        }
        if (arg0 != 24) {
            this.field8644 = null;
        }
        return (var8 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(B[BIII[B)I", line = 201)
    public final int method3501(byte arg0, byte[] arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field8640++;
        if (arg2 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg2 + arg4;
        int var9 = arg3;
        while (true) {
            byte var10 = arg1[var9];
            if (var10 < 0) {
                var7 = this.field8642[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field8642[var7]) < 0) {
                arg5[arg4++] = (byte) (~var11);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field8642[var7];
            }
            int var12;
            if ((var12 = this.field8642[var7]) < 0) {
                arg5[arg4++] = (byte) (~var12);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field8642[var7];
            }
            int var13;
            if ((var13 = this.field8642[var7]) < 0) {
                arg5[arg4++] = (byte) (~var13);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field8642[var7];
            }
            int var14;
            if ((var14 = this.field8642[var7]) < 0) {
                arg5[arg4++] = (byte) (~var14);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field8642[var7];
            }
            int var15;
            if ((var15 = this.field8642[var7]) < 0) {
                arg5[arg4++] = (byte) (~var15);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field8642[var7];
            }
            int var16;
            if ((var16 = this.field8642[var7]) < 0) {
                arg5[arg4++] = (byte) (~var16);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field8642[var7];
            }
            int var17;
            if ((var17 = this.field8642[var7]) < 0) {
                arg5[arg4++] = (byte) (~var17);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field8642[var7];
            }
            int var18;
            if ((var18 = this.field8642[var7]) < 0) {
                arg5[arg4++] = (byte) (~var18);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        if (arg0 != -10) {
            this.method3500(-11, 17, 124, 51, null, null);
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/lang/String;II)V", line = 351)
    public static final void method3502(Color arg0, Color arg1, Color arg2, String arg3, int arg4, int arg5) {
        field8643++;
        try {
            Graphics var6 = class400.field5941.getGraphics();
            if (class243.field3926 == null) {
                class243.field3926 = new Font("Helvetica", 1, 13);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            if (arg0 == null) {
                arg0 = new Color(255, 255, 255);
            }
            try {
                if (class255.field4028 == null) {
                    class255.field4028 = class400.field5941.createImage(class660.field9408, class412.field6066);
                }
                Graphics var7 = class255.field4028.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class660.field9408, class412.field6066);
                int var8 = class660.field9408 / 2 - 152;
                int var9 = class412.field6066 / 2 - 18;
                var7.setColor(arg1);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg2);
                var7.fillRect(var8 + 2, var9 + 2, arg5 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 + 1, 301, 31);
                var7.fillRect(arg5 * 3 + var8 + 2, var9 + 2, 300 - (arg5 * 3), 30);
                var7.setFont(class243.field3926);
                var7.setColor(arg0);
                var7.drawString(arg3, var8 + (304 - (arg3.length() * 6)) / 2, var9 + 22);
                if (class358.field5455 != null) {
                    var7.setFont(class243.field3926);
                    var7.setColor(arg0);
                    var7.drawString(class358.field5455, class660.field9408 / 2 - class358.field5455.length() * 6 / 2, class412.field6066 / 2 + -26);
                }
                if (arg4 <= 47) {
                    method3502(null, null, null, null, -31, 42);
                }
                var6.drawImage(class255.field4028, 0, 0, null);
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class660.field9408, class412.field6066);
                int var10 = class660.field9408 / 2 - 152;
                int var11 = class412.field6066 / 2 - 18;
                var6.setColor(arg1);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg2);
                var6.fillRect(var10 + 2, var11 - -2, arg5 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 + 1, 301, 31);
                var6.fillRect((arg5 * 3) + var10 + 2, var11 + 2, 300 - (arg5 * 3), 30);
                var6.setFont(class243.field3926);
                var6.setColor(arg0);
                if (class358.field5455 != null) {
                    var6.setFont(class243.field3926);
                    var6.setColor(arg0);
                    var6.drawString(class358.field5455, class660.field9408 / 2 - class358.field5455.length() * 6 / 2, class412.field6066 / 2 - 26);
                }
                var6.drawString(arg3, var10 + ((304 - (arg3.length() * 6)) / 2), var11 + 22);
            }
        } catch (Exception var13) {
            class400.field5941.repaint();
        }
    }

    @OriginalMember(owner = "client!hw", name = "<init>", descriptor = "([B)V", line = 438)
    public class613(byte[] arg0) {
        int var2 = arg0.length;
        this.field8645 = new int[var2];
        this.field8644 = arg0;
        int[] var3 = new int[33];
        this.field8642 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field8645[var5] = var8;
                int var12;
                if ((var8 & var7) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var11 & var10) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class112.method903(var11, var10);
                    }
                    var12 = var7 | var8;
                } else {
                    var12 = var3[var6 - 1];
                }
                var3[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field8642[var14] == 0) {
                            this.field8642[var14] = var4;
                        }
                        var14 = this.field8642[var14];
                    }
                    if (var14 >= this.field8642.length) {
                        int[] var17 = new int[this.field8642.length * 2];
                        for (int var18 = 0; var18 < this.field8642.length; var18++) {
                            var17[var18] = this.field8642[var18];
                        }
                        this.field8642 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field8642[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 560)
    public static final String method3503(byte arg0, String arg1) {
        if (arg0 != 61) {
            field8647 = -76;
        }
        field8646++;
        String var2 = class693.method3870(class481.method2911(arg0 ^ 0x18, arg1), -1);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }
}
