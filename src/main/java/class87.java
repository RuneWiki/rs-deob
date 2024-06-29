import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class87 extends class259 {

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "[I")
    private int[] field1158;

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "[I")
    private int[] field1155;

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "Lrf;")
    private class306 field1152;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "Lrf;")
    private class306 field1145;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "Lrf;")
    private class306 field1154;

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "[Lrf;")
    private class306[] field1157;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "[I")
    public static int[] field1144 = new int[50];

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIBLfg;ILhi;IILjava/lang/String;)V", line = 4)
    public static final void method549(int arg0, int arg1, int arg2, byte arg3, class240 arg4, int arg5, class323 arg6, int arg7, int arg8, String arg9) {
        field1148++;
        int var10 = (int) class190.field2855 + class132.field1912 & 0x7FF;
        int var11 = Math.max(arg6.field5169 / 2, arg6.field5174 / 2) + 10;
        int var12 = arg1 * arg1 + (arg7 * arg7);
        if (var12 > (var11 * var11)) {
            return;
        }
        int var13 = class104.field1426[var10];
        int var14 = var13 * 256 / (class67.field831 + 256);
        int var15 = class104.field1435[var10];
        int var16 = var15 * 256 / (class67.field831 + 256);
        int var17 = arg7 * var16 - (arg1 * var14) >> 16;
        int var18 = arg4.method1689(arg9, 100);
        if (arg3 != -6) {
            field1147 = -105;
        }
        int var19 = arg7 * var14 + (arg1 * var16) >> 16;
        int var20 = arg4.method1678(arg9, 100, 0);
        int var21 = var19 - var18 / 2;
        if ((-arg6.field5169) > var21 || var21 > arg6.field5169 || var17 < (-arg6.field5174) || var17 > arg6.field5174) {
            return;
        }
        if (class272.field4317) {
            class239.method1658((class200) arg6.method2249(-84, false));
        } else {
            class343.method2370(arg6.field5175, arg6.field5093);
        }
        arg4.method1684(arg9, arg6.field5169 / 2 + var21 + arg8, arg6.field5174 / 2 + arg5 + -var17 + -arg0 + -var20, var18, 50, arg2, 0, 256, 1, 0, 0);
        if (class272.field4317) {
            class239.method1663();
        } else {
            class343.method2357();
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lnk;Lce;I)Z", line = 52)
    public final boolean method550(class16 arg0, class275 arg1, int arg2) {
        if (arg2 >= -86) {
            this.method555(-9, (class275) null, (class16) null, true, 1.6993193299057905D, 70, -61);
        }
        field1143++;
        if (class30.field350 <= 0) {
            for (int var4 = 0; var4 < this.field1155.length; var4++) {
                if (!arg0.method125(this.field1155[var4], 78)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field1155.length; var5++) {
                if (!arg0.method95(class30.field350, this.field1155[var5], (byte) 71)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field1158.length; var6++) {
            if (!arg1.method1206(this.field1158[var6], 102)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B[I)[I", line = 106)
    public static final int[] method551(byte arg0, int[] arg1) {
        field1160++;
        if (arg1 == null) {
            return null;
        } else if (arg0 == -111) {
            int[] var2 = new int[arg1.length];
            class8.method55(arg1, 0, var2, 0, arg1.length);
            return var2;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(B)V", line = 124)
    public static void method552(byte arg0) {
        int var1 = -75 / ((arg0 - 52) / 52);
        field1144 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILnk;Lce;IIZ)[F", line = 135)
    public final float[] method553(int arg0, class16 arg1, class275 arg2, int arg3, int arg4, boolean arg5) {
        class42.field456 = arg2;
        field1151++;
        float[] var7 = new float[arg3 * arg4 * 4];
        class49.field559 = arg1;
        class91.method572(arg3, 94, arg4);
        for (int var8 = 0; var8 < this.field1157.length; var8++) {
            this.field1157[var8].method2156(arg3, (byte) -50, arg4);
        }
        int var9 = 0;
        if (arg0 != -14895) {
            field1144 = (int[]) null;
        }
        for (int var10 = 0; var10 < arg3; var10++) {
            if (arg5) {
                var9 = var10 << 2;
            }
            int[] var12;
            int[] var13;
            int[] var14;
            if (this.field1145.field4759) {
                int[] var15 = this.field1145.method47(var10, -1546337535);
                var13 = var15;
                var12 = var15;
                var14 = var15;
            } else {
                int[][] var11 = this.field1145.method681(var10, (byte) -119);
                var12 = var11[2];
                var13 = var11[1];
                var14 = var11[0];
            }
            int[] var16;
            if (this.field1154.field4759) {
                var16 = this.field1154.method47(var10, -1546337535);
            } else {
                var16 = this.field1154.method681(var10, (byte) -119)[0];
            }
            int[] var17;
            if (this.field1152.field4759) {
                var17 = this.field1152.method47(var10, -1546337535);
            } else {
                var17 = this.field1152.method681(var10, (byte) -119)[0];
            }
            for (int var18 = arg4 - 1; var18 >= 0; var18--) {
                float var19 = ((float) var17[var18] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                float var20 = (float) var16[var18] / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var7[var9++] = (float) var14[var18] * var19;
                var7[var9++] = (float) var13[var18] * var19;
                var7[var9++] = (float) var12[var18] * var19;
                var7[var9++] = var20;
                if (arg5) {
                    var9 += (arg4 << 2) - 4;
                }
            }
        }
        for (int var21 = 0; var21 < this.field1157.length; var21++) {
            this.field1157[var21].method1343(-8222);
        }
        return var7;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ICBLjava/lang/StringBuffer;)Ljava/lang/StringBuffer;", line = 247)
    public static final StringBuffer method554(int arg0, char arg1, byte arg2, StringBuffer arg3) {
        field1159++;
        int var4 = arg3.length();
        arg3.setLength(arg0);
        for (int var5 = var4; var5 < arg0; var5++) {
            arg3.setCharAt(var5, arg1);
        }
        if (arg2 >= -96) {
            method551((byte) -56, (int[]) null);
        }
        return arg3;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILce;Lnk;ZDII)[I", line = 277)
    public final int[] method555(int arg0, class275 arg1, class16 arg2, boolean arg3, double arg4, int arg5, int arg6) {
        field1149++;
        class43.method268(arg4, (byte) 32);
        class42.field456 = arg1;
        int[] var9 = new int[arg6 * 4 * arg5];
        class49.field559 = arg2;
        class91.method572(arg5, -49, arg6);
        for (int var10 = 0; var10 < this.field1157.length; var10++) {
            this.field1157[var10].method2156(arg5, (byte) -50, arg6);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg5; var12++) {
            if (arg3) {
                var11 = var12;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field1145.field4759) {
                int[] var13 = this.field1145.method47(var12, -1546337535);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field1145.method681(var12, (byte) -119);
                var15 = var17[2];
                var14 = var17[0];
                var16 = var17[1];
            }
            int[] var18;
            if (this.field1154.field4759) {
                var18 = this.field1154.method47(var12, -1546337535);
            } else {
                var18 = this.field1154.method681(var12, (byte) -119)[0];
            }
            for (int var19 = arg6 - 1; var19 >= 0; var19--) {
                int var20 = var14[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var21 = var15[var19] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var16[var19] >> 4;
                int var23 = class140.field2146[var21];
                if (var22 > 255) {
                    var22 = 255;
                }
                int var24 = class140.field2146[var20];
                if (var22 < 0) {
                    var22 = 0;
                }
                int var25 = class140.field2146[var22];
                int var26;
                if (var24 == 0 && var25 == 0 && var23 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9[var11++] = (var25 << 8) + (var24 << 16) + (var26 << 24) + var23;
                if (arg3) {
                    var11 += arg6 - 1;
                }
            }
        }
        if (arg0 < 52) {
            return (int[]) null;
        } else {
            for (int var27 = 0; var27 < this.field1157.length; var27++) {
                this.field1157[var27].method1343(-8222);
            }
            return var9;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IILnk;Lnk;I)Ljh;", line = 416)
    public static final class299 method556(int arg0, int arg1, class16 arg2, class16 arg3, int arg4) {
        field1150++;
        if (class102.method648(arg1, -1000000000, arg4, arg3)) {
            return arg0 == 0 ? class273.method1970(arg2.method100(arg1, arg4, (byte) -107), -1) : (class299) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILnk;DBIZLce;)Lch;", line = 432)
    public final class158 method557(int arg0, class16 arg1, double arg2, byte arg3, int arg4, boolean arg5, class275 arg6) {
        class43.method268(arg2, (byte) 32);
        class49.field559 = arg1;
        class42.field456 = arg6;
        field1156++;
        class91.method572(arg0, 89, arg4);
        class158 var9 = new class158(arg4, arg0);
        for (int var10 = 0; var10 < this.field1157.length; var10++) {
            this.field1157[var10].method2156(arg0, (byte) -50, arg4);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg0; var12++) {
            if (arg5) {
                var11 = var12;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field1145.field4759) {
                int[] var17 = this.field1145.method47(var12, -1546337535);
                var15 = var17;
                var16 = var17;
                var14 = var17;
            } else {
                int[][] var13 = this.field1145.method681(var12, (byte) -119);
                var14 = var13[0];
                var15 = var13[1];
                var16 = var13[2];
            }
            for (int var18 = arg4 - 1; var18 >= 0; var18--) {
                int var19 = var14[var18] >> 4;
                if (var19 > 255) {
                    var19 = 255;
                }
                if (var19 < 0) {
                    var19 = 0;
                }
                int var20 = class140.field2146[var19];
                int var21 = var15[var18] >> 4;
                int var22 = var16[var18] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                int var23 = class140.field2146[var22];
                if (var21 < 0) {
                    var21 = 0;
                }
                int var24 = class140.field2146[var21];
                var9.field2455[var11++] = (var20 << 16) + (var24 << 8) + var23;
                if (arg5) {
                    var11 += arg4 - 1;
                }
            }
        }
        int var25 = -10 / ((-arg3 - 51) / 40);
        for (int var26 = 0; var26 < this.field1157.length; var26++) {
            this.field1157[var26].method1343(-8222);
        }
        return var9;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lce;IDIZILnk;)Lrh;", line = 554)
    public final class155 method558(class275 arg0, int arg1, double arg2, int arg3, boolean arg4, int arg5, class16 arg6) {
        field1146++;
        class43.method268(arg2, (byte) 32);
        class42.field456 = arg0;
        class49.field559 = arg6;
        class91.method572(arg1, -110, arg3);
        class155 var9 = new class155(arg3, arg1);
        for (int var10 = 0; var10 < this.field1157.length; var10++) {
            this.field1157[var10].method2156(arg1, (byte) -50, arg3);
        }
        int var11 = 0;
        for (int var12 = arg5; var12 < arg1; var12++) {
            if (arg4) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field1145.field4759) {
                int[] var17 = this.field1145.method47(var12, arg5 ^ 0xA3D4C301);
                var14 = var17;
                var15 = var17;
                var16 = var17;
            } else {
                int[][] var13 = this.field1145.method681(var12, (byte) -119);
                var14 = var13[0];
                var15 = var13[1];
                var16 = var13[2];
            }
            int[] var18;
            if (this.field1154.field4759) {
                var18 = this.field1154.method47(var12, -1546337535);
            } else {
                var18 = this.field1154.method681(var12, (byte) -119)[0];
            }
            for (int var19 = arg3 - 1; var19 >= 0; var19--) {
                int var20 = var15[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var21 = var16[var19] >> 4;
                int var22 = var14[var19] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var23 = class140.field2146[var20];
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var24 = class140.field2146[var21];
                int var25 = class140.field2146[var22];
                int var26;
                if (var25 == 0 && var23 == 0 && var24 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9.field2455[var11++] = (var23 << 8) + (var25 << 16) + ((var26 << 24) - -var24);
                if (arg4) {
                    var11 += (arg3 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field1157.length; var27++) {
            this.field1157[var27].method1343(-8222);
        }
        return var9;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V", line = 689)
    public class87() {
        this.field1158 = new int[0];
        this.field1155 = new int[0];
        this.field1152 = new class113(0);
        this.field1152.field4769 = 1;
        this.field1145 = new class113();
        this.field1145.field4769 = 1;
        this.field1154 = new class113();
        this.field1157 = new class306[] { this.field1145, this.field1154, this.field1152 };
        this.field1154.field4769 = 1;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Llf;)V", line = 704)
    public class87(class143 arg0) {
        int var2 = arg0.method1043(true);
        int var3 = 0;
        this.field1157 = new class306[var2];
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class306 var7 = class74.method457(0, arg0);
            if (var7.method1347((byte) -120) >= 0) {
                var3++;
            }
            if (var7.method1627(120) >= 0) {
                var4++;
            }
            int var8 = var7.field4771.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method1043(true);
            }
            this.field1157[var6] = var7;
        }
        this.field1158 = new int[var4];
        this.field1155 = new int[var3];
        int var10 = 0;
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class306 var13 = this.field1157[var12];
            int var14 = var13.field4771.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field4771[var15] = this.field1157[var5[var12][var15]];
            }
            int var16 = var13.method1347((byte) -120);
            int var17 = var13.method1627(97);
            if (var16 > 0) {
                this.field1155[var10++] = var16;
            }
            if (var17 > 0) {
                this.field1158[var11++] = var17;
            }
            var5[var12] = null;
        }
        int[][] var18 = (int[][]) null;
        this.field1145 = this.field1157[arg0.method1043(true)];
        this.field1154 = this.field1157[arg0.method1043(true)];
        this.field1152 = this.field1157[arg0.method1043(true)];
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZIZLnk;DILce;I)[I", line = 794)
    public final int[] method559(boolean arg0, int arg1, boolean arg2, class16 arg3, double arg4, int arg5, class275 arg6, int arg7) {
        class43.method268(arg4, (byte) 32);
        class49.field559 = arg3;
        class42.field456 = arg6;
        int[] var10 = new int[arg1 * arg7];
        class91.method572(arg1, 83, arg7);
        for (int var11 = 0; var11 < this.field1157.length; var11++) {
            this.field1157[var11].method2156(arg1, (byte) -50, arg7);
        }
        field1153++;
        if (arg5 != 1102507408) {
            this.method553(74, (class16) null, (class275) null, -79, 100, true);
        }
        byte var12;
        int var13;
        int var14;
        if (arg2) {
            var14 = -1;
            var13 = arg7 - 1;
            var12 = -1;
        } else {
            var12 = 1;
            var13 = 0;
            var14 = arg7;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg1; var16++) {
            if (arg0) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field1145.field4759) {
                int[] var21 = this.field1145.method47(var16, -1546337535);
                var18 = var21;
                var20 = var21;
                var19 = var21;
            } else {
                int[][] var17 = this.field1145.method681(var16, (byte) -119);
                var18 = var17[0];
                var19 = var17[1];
                var20 = var17[2];
            }
            for (int var22 = var13; var22 != var14; var22 += var12) {
                int var23 = var18[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = var19[var22] >> 4;
                int var25 = var20[var22] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = class140.field2146[var25];
                int var27 = class140.field2146[var23];
                if (var24 < 0) {
                    var24 = 0;
                }
                int var28 = class140.field2146[var24];
                var10[var15++] = (var27 << 16) + var26 + (var28 << 8);
                if (arg0) {
                    var15 += arg7 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field1157.length; var29++) {
            this.field1157[var29].method1343(-8222);
        }
        return var10;
    }
}
