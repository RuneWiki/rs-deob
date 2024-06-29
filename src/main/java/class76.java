import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class76 extends class199 {

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "[I")
    private int[] field1227;

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "[I")
    private int[] field1219;

    @OriginalMember(owner = "client!hj", name = "O", descriptor = "Lsi;")
    private class335 field1231;

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "Lsi;")
    private class335 field1229;

    @OriginalMember(owner = "client!hj", name = "N", descriptor = "Lsi;")
    private class335 field1230;

    @OriginalMember(owner = "client!hj", name = "P", descriptor = "[Lsi;")
    private class335[] field1232;

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!hj", name = "D", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!hj", name = "G", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!hj", name = "H", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!hj", name = "Q", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)I", line = 5)
    public static final int method552(int arg0, int arg1, int arg2) {
        if (arg2 >= -114) {
            return -90;
        } else {
            field1220++;
            int var3 = arg1 >>> 31;
            return (arg1 + var3) / arg0 - var3;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZILl;IDLrf;I)Lgm;", line = 28)
    public final class249 method553(boolean arg0, int arg1, class133 arg2, int arg3, double arg4, class79 arg5, int arg6) {
        field1218++;
        class291.method1992(-256, arg4);
        class89.field1431 = arg5;
        class188.field2819 = arg2;
        class80.method577(arg3, 0, arg6);
        class249 var9 = new class249(arg6, arg3);
        for (int var10 = 0; var10 < this.field1232.length; var10++) {
            this.field1232[var10].method2332(arg3, 21378, arg6);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg3; var12++) {
            if (arg0) {
                var11 = var12;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field1229.field5234) {
                int[] var13 = this.field1229.method149(var12, 621);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field1229.method249(var12, (byte) 51);
                var14 = var17[2];
                var16 = var17[1];
                var15 = var17[0];
            }
            for (int var18 = 0; var18 != arg6; var18++) {
                int var19 = var15[var18] >> 4;
                if (var19 > 255) {
                    var19 = 255;
                }
                int var20 = var16[var18] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                if (var19 < 0) {
                    var19 = 0;
                }
                int var21 = class67.field1119[var20];
                int var22 = class67.field1119[var19];
                int var23 = var14[var18] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class67.field1119[var23];
                var9.field3942[var11++] = (var22 << 16) + (var21 << 8) + var24;
                if (arg0) {
                    var11 += arg6 - 1;
                }
            }
        }
        if (arg1 < 110) {
            return (class249) null;
        } else {
            for (int var25 = 0; var25 < this.field1232.length; var25++) {
                this.field1232[var25].method1649(29);
            }
            return var9;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILrf;IZLl;)[F", line = 145)
    public final float[] method554(int arg0, int arg1, class79 arg2, int arg3, boolean arg4, class133 arg5) {
        class188.field2819 = arg5;
        class89.field1431 = arg2;
        class80.method577(arg0, 0, arg1);
        float[] var7 = new float[arg0 * 4 * arg1];
        for (int var8 = 0; var8 < this.field1232.length; var8++) {
            this.field1232[var8].method2332(arg0, 21378, arg1);
        }
        field1221++;
        int var9 = 0;
        if (arg3 != 255) {
            return (float[]) null;
        }
        for (int var10 = 0; var10 < arg0; var10++) {
            if (arg4) {
                var9 = var10 << 2;
            }
            int[] var12;
            int[] var13;
            int[] var14;
            if (this.field1229.field5234) {
                int[] var11 = this.field1229.method149(var10, 621);
                var12 = var11;
                var13 = var11;
                var14 = var11;
            } else {
                int[][] var15 = this.field1229.method249(var10, (byte) 51);
                var13 = var15[2];
                var12 = var15[0];
                var14 = var15[1];
            }
            int[] var16;
            if (this.field1230.field5234) {
                var16 = this.field1230.method149(var10, 621);
            } else {
                var16 = this.field1230.method249(var10, (byte) 51)[0];
            }
            int[] var17;
            if (this.field1231.field5234) {
                var17 = this.field1231.method149(var10, 621);
            } else {
                var17 = this.field1231.method249(var10, (byte) 51)[0];
            }
            for (int var18 = arg1 - 1; var18 >= 0; var18--) {
                float var19 = (float) var16[var18] / 4096.0F;
                float var20 = ((float) var17[var18] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var7[var9++] = (float) var12[var18] * var20;
                var7[var9++] = (float) var14[var18] * var20;
                if ((var19 < 0.0F)) {
                    var19 = 0.0F;
                } else if (var19 > 1.0F) {
                    var19 = 1.0F;
                }
                var7[var9++] = (float) var13[var18] * var20;
                var7[var9++] = var19;
                if (arg4) {
                    var9 += (arg1 << 2) - 4;
                }
            }
        }
        for (int var21 = 0; var21 < this.field1232.length; var21++) {
            this.field1232[var21].method1649(arg3 ^ 0xFFFFFF76);
        }
        return var7;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZILl;Lrf;ZID)[I", line = 256)
    public final int[] method555(int arg0, boolean arg1, int arg2, class133 arg3, class79 arg4, boolean arg5, int arg6, double arg7) {
        class291.method1992(-256, arg7);
        class89.field1431 = arg4;
        class188.field2819 = arg3;
        field1226++;
        class80.method577(arg6, 0, arg0);
        for (int var10 = 0; var10 < this.field1232.length; var10++) {
            this.field1232[var10].method2332(arg6, 21378, arg0);
        }
        int[] var11 = new int[arg0 * arg6];
        int var12 = 0;
        int var13;
        byte var14;
        int var15;
        if (arg5) {
            var13 = arg0 - 1;
            var14 = -1;
            var15 = -1;
        } else {
            var13 = 0;
            var15 = arg0;
            var14 = 1;
        }
        for (int var16 = 0; var16 < arg6; var16++) {
            if (arg1) {
                var12 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field1229.field5234) {
                int[] var21 = this.field1229.method149(var16, 621);
                var19 = var21;
                var20 = var21;
                var18 = var21;
            } else {
                int[][] var17 = this.field1229.method249(var16, (byte) 51);
                var18 = var17[2];
                var19 = var17[1];
                var20 = var17[0];
            }
            for (int var22 = var13; var22 != var15; var22 += var14) {
                int var23 = var19[var22] >> 4;
                int var24 = var18[var22] >> 4;
                int var25 = var20[var22] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class67.field1119[var23];
                int var27 = class67.field1119[var24];
                int var28 = class67.field1119[var25];
                var11[var12++] = (var28 << 16) + (var26 << 8) + var27;
                if (arg1) {
                    var12 += arg0 - 1;
                }
            }
        }
        if (arg2 <= 79) {
            return (int[]) null;
        } else {
            for (int var29 = 0; var29 < this.field1232.length; var29++) {
                this.field1232[var29].method1649(79);
            }
            return var11;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/lang/String;ZII)I", line = 387)
    public static final int method556(String arg0, boolean arg1, int arg2, int arg3) {
        field1224++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        int var4 = 0;
        boolean var5 = false;
        boolean var6 = false;
        int var7 = arg0.length();
        if (arg3 != 29695) {
            method557(75, (class123) null);
        }
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var5 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg2 <= var11) {
                throw new NumberFormatException();
            }
            if (var5) {
                var11 = -var11;
            }
            int var10 = arg2 * var4 + var11;
            if ((var10 / arg2) != var4) {
                throw new NumberFormatException();
            }
            var4 = var10;
            var6 = true;
        }
        if (!var6) {
            throw new NumberFormatException();
        }
        return var4;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILmd;)V", line = 469)
    public static final void method557(int arg0, class123 arg1) {
        field1222++;
        class333 var2 = arg1.method888(arg0);
        arg1.field1872 = var2.field5206;
        if (arg1.field1918 == 0) {
            arg1.field1877 = 0;
            return;
        }
        if (arg1.field1912 != -1 && arg1.field1881 == 0) {
            class281 var3 = class133.method948(arg1.field1912, (byte) 33);
            if (arg1.field1913 > 0 && var3.field4321 == 0) {
                arg1.field1877++;
                return;
            }
            if (arg1.field1913 <= 0 && var3.field4324 == 0) {
                arg1.field1877++;
                return;
            }
        }
        if (arg1.field1951 != -1 && arg1.field1895 <= class227.field3618) {
            class265 var4 = class112.method831(arg1.field1951, true);
            if (var4.field4133 && var4.field4117 != -1) {
                class281 var5 = class133.method948(var4.field4117, (byte) 33);
                if (arg1.field1913 > 0 && var5.field4321 == 0) {
                    arg1.field1877++;
                    return;
                }
                if (arg1.field1913 <= 0 && var5.field4324 == 0) {
                    arg1.field1877++;
                    return;
                }
            }
        }
        int var6 = arg1.field1905;
        int var7 = arg1.field1868;
        int var8 = arg1.field1910[arg1.field1918 - 1] * 128 + arg1.method280(false) * 64;
        int var9 = arg1.field1938[arg1.field1918 - 1] * 128 + arg1.method280(false) * 64;
        if ((var8 - var6) > 256 || var8 - var6 < -256 || var9 - var7 > 256 || (var9 - var7) < -256) {
            arg1.field1868 = var9;
            arg1.field1905 = var8;
            return;
        }
        if (var8 > var6) {
            if (var9 > var7) {
                arg1.field1858 = 1280;
            } else if (var7 > var9) {
                arg1.field1858 = 1792;
            } else {
                arg1.field1858 = 1536;
            }
        } else if (var8 < var6) {
            if (var9 > var7) {
                arg1.field1858 = 768;
            } else if (var7 > var9) {
                arg1.field1858 = 256;
            } else {
                arg1.field1858 = 512;
            }
        } else if (var7 < var9) {
            arg1.field1858 = 1024;
        } else if (var7 > var9) {
            arg1.field1858 = 0;
        }
        int var10 = arg1.field1858 - arg1.field1939 & 0x7FF;
        byte var11 = 1;
        int var12 = 4;
        if (var10 > 1024) {
            var10 -= 2048;
        }
        boolean var13 = true;
        int var14 = var2.field5192;
        if (var10 >= -256 && var10 <= 256) {
            var14 = var2.field5210;
        } else if (var10 >= 256 && var10 < 768) {
            var14 = var2.field5214;
        } else if (var10 >= -768 && var10 <= -256) {
            var14 = var2.field5181;
        }
        if (var14 == -1) {
            var14 = var2.field5210;
        }
        arg1.field1872 = var14;
        if (arg1 instanceof class313) {
            var13 = ((class313) arg1).field4859.field3160;
        }
        if (var13) {
            if (arg1.field1939 != arg1.field1858 && arg1.field1853 == -1 && arg1.field1941 != 0) {
                var12 = 2;
            }
            if (arg1.field1918 > 2) {
                var12 = 6;
            }
            if (arg1.field1918 > 3) {
                var12 = 8;
            }
            if (arg1.field1877 > 0 && arg1.field1918 > 1) {
                arg1.field1877--;
                var12 = 8;
            }
        } else {
            if (arg1.field1918 > 1) {
                var12 = 6;
            }
            if (arg1.field1918 > 2) {
                var12 = 8;
            }
            if (arg1.field1877 > 0 && arg1.field1918 > 1) {
                arg1.field1877--;
                var12 = 8;
            }
        }
        if (arg1.field1903[arg1.field1918 - 1] == 2) {
            var12 <<= 0x1;
            var11 = 2;
        } else if (arg1.field1903[arg1.field1918 - 1] == 0) {
            var11 = 0;
            var12 >>= 0x1;
        }
        if (var12 < 8 || var2.field5180 == -1) {
            if (var2.field5185 != -1 && var11 == 0) {
                if (arg1.field1872 == var2.field5192 && var2.field5178 != -1) {
                    arg1.field1872 = var2.field5178;
                } else if (arg1.field1872 == var2.field5181 && var2.field5196 != -1) {
                    arg1.field1872 = var2.field5196;
                } else if (arg1.field1872 == var2.field5214 && var2.field5205 != -1) {
                    arg1.field1872 = var2.field5205;
                } else {
                    arg1.field1872 = var2.field5185;
                }
            }
        } else if (arg1.field1872 == var2.field5192 && var2.field5217 != -1) {
            arg1.field1872 = var2.field5217;
        } else if (arg1.field1872 == var2.field5181 && var2.field5186 != -1) {
            arg1.field1872 = var2.field5186;
        } else if (arg1.field1872 == var2.field5214 && var2.field5187 != -1) {
            arg1.field1872 = var2.field5187;
        } else {
            arg1.field1872 = var2.field5180;
        }
        if (var2.field5199 != -1) {
            int var15 = var12 << 7;
            if (arg1.field1918 == 1) {
                int var16 = arg1.field1896 * arg1.field1896;
                int var17 = (arg1.field1905 > var8 ? arg1.field1905 - var8 : -arg1.field1905 + var8) << 7;
                int var18 = (var9 >= arg1.field1868 ? var9 - arg1.field1868 : -var9 + arg1.field1868) << 7;
                int var19 = var17 <= var18 ? var18 : var17;
                int var20 = var2.field5199 * 2 * var19;
                if (var16 > var20) {
                    arg1.field1896 /= 2;
                } else if ((var16 / 2) > var19) {
                    arg1.field1896 -= var2.field5199;
                    if (arg1.field1896 < 0) {
                        arg1.field1896 = 0;
                    }
                } else if (arg1.field1896 < var15) {
                    arg1.field1896 += var2.field5199;
                    if (arg1.field1896 > var15) {
                        arg1.field1896 = var15;
                    }
                }
            } else if (arg1.field1896 < var15) {
                arg1.field1896 += var2.field5199;
                if (var15 < arg1.field1896) {
                    arg1.field1896 = var15;
                }
            } else if (arg1.field1896 > 0) {
                arg1.field1896 -= var2.field5199;
                if (arg1.field1896 < 0) {
                    arg1.field1896 = 0;
                }
            }
            var12 = arg1.field1896 >> 7;
            if (var12 < 1) {
                var12 = 1;
            }
        }
        if (var7 < var9) {
            arg1.field1868 += var12;
            if (var9 < arg1.field1868) {
                arg1.field1868 = var9;
            }
        } else if (var9 < var7) {
            arg1.field1868 -= var12;
            if (var9 > arg1.field1868) {
                arg1.field1868 = var9;
            }
        }
        if (var6 < var8) {
            arg1.field1905 += var12;
            if (var8 < arg1.field1905) {
                arg1.field1905 = var8;
            }
        } else if (var6 > var8) {
            arg1.field1905 -= var12;
            if (var8 > arg1.field1905) {
                arg1.field1905 = var8;
            }
        }
        if (arg1.field1905 == var8 && arg1.field1868 == var9) {
            if (arg1.field1913 > 0) {
                arg1.field1913--;
            }
            arg1.field1918--;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V", line = 814)
    public static final void method558(byte arg0) {
        class240.field3839.method2176((byte) 125);
        field1233++;
        if (arg0 == -113) {
            ;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZLl;IDIILrf;)Lpm;", line = 826)
    public final class262 method559(boolean arg0, class133 arg1, int arg2, double arg3, int arg4, int arg5, class79 arg6) {
        class291.method1992(-256, arg3);
        field1225++;
        if (arg2 > -121) {
            method558((byte) 23);
        }
        class188.field2819 = arg1;
        class89.field1431 = arg6;
        class80.method577(arg5, 0, arg4);
        class262 var9 = new class262(arg4, arg5);
        for (int var10 = 0; var10 < this.field1232.length; var10++) {
            this.field1232[var10].method2332(arg5, 21378, arg4);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg5; var12++) {
            if (arg0) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field1229.field5234) {
                int[] var13 = this.field1229.method149(var12, 621);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field1229.method249(var12, (byte) 51);
                var14 = var17[2];
                var15 = var17[1];
                var16 = var17[0];
            }
            int[] var18;
            if (this.field1230.field5234) {
                var18 = this.field1230.method149(var12, 621);
            } else {
                var18 = this.field1230.method249(var12, (byte) 51)[0];
            }
            for (int var19 = arg4 - 1; var19 >= 0; var19--) {
                int var20 = var16[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var21 = var14[var19] >> 4;
                if (var20 < 0) {
                    var20 = 0;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                int var22 = class67.field1119[var20];
                int var23 = var15[var19] >> 4;
                if (var21 < 0) {
                    var21 = 0;
                }
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class67.field1119[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class67.field1119[var23];
                int var26;
                if (var22 == 0 && var25 == 0 && var24 == 0) {
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
                var9.field3942[var11++] = (var26 << 24) + (var22 << 16) + (var25 << 8) + var24;
                if (arg0) {
                    var11 += (arg4 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field1232.length; var27++) {
            this.field1232[var27].method1649(109);
        }
        return var9;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)V", line = 960)
    public static final void method560(byte arg0) {
        field1223++;
        class163.field2463 = new class220[class132.field2090.method981((byte) -104)][];
        class71.field1175 = new boolean[class132.field2090.method981((byte) -80)];
        if (arg0 <= 62) {
            method560((byte) 2);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ll;ILrf;)Z", line = 974)
    public final boolean method561(class133 arg0, int arg1, class79 arg2) {
        field1228++;
        if (class20.field265 <= 0) {
            for (int var4 = 0; var4 < this.field1219.length; var4++) {
                if (!arg0.method956(this.field1219[var4], true)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field1219.length; var5++) {
                if (!arg0.method949(this.field1219[var5], class20.field265, -17264)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field1227.length; var6++) {
            if (!arg2.method575(false, this.field1227[var6])) {
                return false;
            }
        }
        int var7 = 76 % ((arg1 - 4) / 58);
        return true;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V", line = 1025)
    public class76() {
        this.field1227 = new int[0];
        this.field1219 = new int[0];
        this.field1231 = new class110(0);
        this.field1231.field5230 = 1;
        this.field1229 = new class110();
        this.field1229.field5230 = 1;
        this.field1230 = new class110();
        this.field1232 = new class335[] { this.field1229, this.field1230, this.field1231 };
        this.field1230.field5230 = 1;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lrf;ZIDILl;Z)[I", line = 1044)
    public final int[] method562(class79 arg0, boolean arg1, int arg2, double arg3, int arg4, class133 arg5, boolean arg6) {
        if (!arg1) {
            this.method561((class133) null, 60, (class79) null);
        }
        field1217++;
        int[] var9 = new int[arg2 * arg4 * 4];
        class291.method1992(-256, arg3);
        class89.field1431 = arg0;
        class188.field2819 = arg5;
        class80.method577(arg2, 0, arg4);
        for (int var10 = 0; var10 < this.field1232.length; var10++) {
            this.field1232[var10].method2332(arg2, 21378, arg4);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg2; var12++) {
            if (arg6) {
                var11 = var12;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field1229.field5234) {
                int[] var17 = this.field1229.method149(var12, 621);
                var15 = var17;
                var14 = var17;
                var16 = var17;
            } else {
                int[][] var13 = this.field1229.method249(var12, (byte) 51);
                var14 = var13[2];
                var15 = var13[0];
                var16 = var13[1];
            }
            int[] var18;
            if (this.field1230.field5234) {
                var18 = this.field1230.method149(var12, 621);
            } else {
                var18 = this.field1230.method249(var12, (byte) 51)[0];
            }
            for (int var19 = arg4 - 1; var19 >= 0; var19--) {
                int var20 = var15[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var21 = var16[var19] >> 4;
                if (var20 < 0) {
                    var20 = 0;
                }
                int var22 = var14[var19] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var23 = class67.field1119[var20];
                if (var22 < 0) {
                    var22 = 0;
                }
                int var24 = class67.field1119[var22];
                int var25 = class67.field1119[var21];
                int var26;
                if (var23 == 0 && var25 == 0 && var24 == 0) {
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
                var9[var11++] = (var23 << 16) + (var26 << 24) + (var25 << 8) + var24;
                if (arg6) {
                    var11 += arg4 - 1;
                }
            }
        }
        for (int var27 = 0; var27 < this.field1232.length; var27++) {
            this.field1232[var27].method1649(-121);
        }
        return var9;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lkh;)V", line = 1178)
    public class76(class166 arg0) {
        int var2 = arg0.method1178(0);
        this.field1232 = new class335[var2];
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class335 var7 = class268.method1847(arg0, 0);
            if (var7.method1650(true) >= 0) {
                var3++;
            }
            if (var7.method2194((byte) 112) >= 0) {
                var4++;
            }
            int var8 = var7.field5237.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method1178(0);
            }
            this.field1232[var6] = var7;
        }
        this.field1227 = new int[var4];
        this.field1219 = new int[var3];
        int var10 = 0;
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class335 var13 = this.field1232[var12];
            int var14 = var13.field5237.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field5237[var15] = this.field1232[var5[var12][var15]];
            }
            int var16 = var13.method1650(true);
            int var17 = var13.method2194((byte) 112);
            if (var16 > 0) {
                this.field1219[var11++] = var16;
            }
            if (var17 > 0) {
                this.field1227[var10++] = var17;
            }
            var5[var12] = null;
        }
        int[][] var18 = (int[][]) null;
        this.field1229 = this.field1232[arg0.method1178(0)];
        this.field1230 = this.field1232[arg0.method1178(0)];
        this.field1231 = this.field1232[arg0.method1178(0)];
    }
}
