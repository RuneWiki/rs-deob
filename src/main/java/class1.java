import jaggl.OpenGL;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class1 {

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "Lml;")
    private class194 field13;

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "Lqd;")
    private class622 field2;

    @OriginalMember(owner = "client!ko", name = "t", descriptor = "I")
    public int field16;

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
    private int field10;

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "[B")
    public byte[] field15;

    @OriginalMember(owner = "client!ko", name = "u", descriptor = "I")
    private int field18;

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
    private int field5;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
    private int field17;

    @OriginalMember(owner = "client!ko", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field22 = new String[] { method11(method10("Thn'x")), method11(method10("A3,e")), method11(method10("D)nH-")), method11(method10("D)nL-")), method11(method10("D)nM-")), method11(method10("D)nA-")), method11(method10("D)nO-")), method11(method10("D)nN-")), method11(method10("D)n@-")), method11(method10("D)nJ-")), method11(method10("D)nK-")), method11(method10("D)n5lA/47-")) };

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "Lsb;")
    public static class261 field3 = new class261(85, -2);

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field9 = new BigInteger(method11(method10("\u001evp94")), 16);

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "Llc;")
    public static class608 field19 = new class608();

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "Lhj;")
    public static class671 field20 = new class671(7, 0, 1, 1);

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!ko", name = "s", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "[[Ll;")
    private class503[][] field4;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(CI)Z", line = 9)
    public static final boolean method1(char arg0, int arg1) {
        try {
            if (arg1 > -118) {
                field9 = null;
            }
            field7++;
            return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field22[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lr;IZI)V", line = 21)
    public final void method2(class412 arg0, int arg1, boolean arg2, int arg3) {
        try {
            field14++;
            class143 var5 = (class143) arg0;
            arg1 += var5.field1859 + 1;
            arg3 += var5.field1850 + 1;
            int var6 = this.field16 * arg3 + arg1;
            if (arg2) {
                this.field2 = null;
            }
            int var7 = 0;
            int var8 = var5.field1852;
            int var9 = var5.field1848;
            int var10 = this.field16 - var9;
            if (arg3 <= 0) {
                int var11 = 1 - arg3;
                var8 -= var11;
                arg3 = 1;
                var6 += this.field16 * var11;
                var7 += var9 * var11;
            }
            int var12 = 0;
            if (arg3 + var8 >= this.field10) {
                int var13 = arg3 + var8 + 1 - this.field10;
                var8 -= var13;
            }
            if (arg1 <= 0) {
                int var14 = 1 - arg1;
                var10 += var14;
                var7 += var14;
                var6 += var14;
                arg1 = 1;
                var12 += var14;
                var9 -= var14;
            }
            if (this.field16 <= (arg1 + var9)) {
                int var15 = arg1 + var9 + 1 - this.field16;
                var12 += var15;
                var10 += var15;
                var9 -= var15;
            }
            if (var9 > 0 && var8 > 0) {
                class532.method4025(var9, var10, 1393, var5.field1853, var7, this.field15, var6, var12, var8);
                this.method3(arg3, var9, var8, arg1, -2);
            }
        } catch (RuntimeException var17) {
            throw class665.method4799(var17, field22[8] + (arg0 == null ? field22[1] : field22[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIII)V", line = 91)
    private final void method3(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field6++;
            if (this.field4 != null) {
                int var6 = arg3 - 1 >> 7;
                if (arg4 != -2) {
                    this.field13 = null;
                }
                int var7 = arg3 + arg1 - 2 >> 7;
                int var8 = arg0 - 1 >> 7;
                int var9 = arg0 + arg2 - 2 >> 7;
                for (int var10 = var6; var10 <= var7; var10++) {
                    class503[] var11 = this.field4[var10];
                    for (int var12 = var8; var12 <= var9; var12++) {
                        var11[var12].field7351 = true;
                    }
                }
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field22[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V", line = 134)
    public static void method4(int arg0) {
        try {
            field20 = null;
            field19 = null;
            field3 = null;
            if (arg0 != 1) {
                method1((char) 65430, 107);
            }
            field9 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field22[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIILr;)V", line = 148)
    public final void method5(int arg0, int arg1, int arg2, class412 arg3) {
        try {
            field21++;
            class143 var5 = (class143) arg3;
            arg1 += var5.field1859 + 1;
            arg2 += var5.field1850 + 1;
            int var6 = this.field16 * arg2 + arg1;
            int var7 = arg0;
            int var8 = var5.field1852;
            int var9 = var5.field1848;
            int var10 = this.field16 - var9;
            if (arg2 <= 0) {
                int var11 = 1 - arg2;
                arg2 = 1;
                var6 += this.field16 * var11;
                var8 -= var11;
                var7 = var9 * var11 + arg0;
            }
            int var12 = 0;
            if (arg2 + var8 >= this.field10) {
                int var13 = arg2 + var8 + 1 - this.field10;
                var8 -= var13;
            }
            if (arg1 <= 0) {
                int var14 = 1 - arg1;
                var9 -= var14;
                arg1 = 1;
                var12 += var14;
                var6 += var14;
                var7 += var14;
                var10 += var14;
            }
            if (this.field16 <= arg1 + var9) {
                int var15 = arg1 - this.field16 - (-var9 - 1);
                var9 -= var15;
                var10 += var15;
                var12 += var15;
            }
            if (var9 > 0 && var8 > 0) {
                class34.method353(var9, var10, -1040068350, var12, var5.field1853, var6, var8, this.field15, var7);
                this.method3(arg2, var9, var8, arg1, -2);
            }
        } catch (RuntimeException var17) {
            throw class665.method4799(var17, field22[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field22[1] : field22[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)I", line = 218)
    public static final int method6(int arg0, int arg1) {
        try {
            if (arg1 != 25637) {
                field3 = null;
            }
            field11++;
            return arg0 & 0x7F;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field22[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V", line = 232)
    public final void method7(int arg0) {
        try {
            this.field4 = new class503[this.field5][this.field17];
            field12++;
            for (int var2 = 0; var2 < this.field17; var2++) {
                for (int var3 = 0; var3 < this.field5; var3++) {
                    this.field4[var3][var2] = new class503(this.field13, this, this.field2, var3, var2, this.field18, var3 * 128 + 1, var2 * 128 - -1);
                }
            }
            if (arg0 >= -123) {
                this.method7(-101);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field22[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(II[[ZIZZ)V", line = 260)
    public final void method8(int arg0, int arg1, boolean[][] arg2, int arg3, boolean arg4, boolean arg5) {
        try {
            this.field13.method1684(false, (byte) -11);
            field8++;
            this.field13.method1632(false, arg4);
            this.field13.method1625(55, -2);
            this.field13.method1631(1, 7681);
            this.field13.method1670(1, (byte) 115);
            float var7 = 1.0F / (float) (this.field13.field2758 * 128);
            if (arg5) {
                for (int var22 = 0; var22 < this.field17; var22++) {
                    int var23 = var22 << this.field18;
                    int var24 = var22 + 1 << this.field18;
                    label111: for (int var25 = 0; var25 < this.field5; var25++) {
                        int var26 = var25 << this.field18;
                        int var27 = var25 + 1 << this.field18;
                        for (int var28 = var26; var28 < var27; var28++) {
                            if ((var28 - arg1) >= (-arg3) && arg3 >= var28 - arg1) {
                                for (int var29 = var23; var29 < var24; var29++) {
                                    if ((var29 - arg0) >= (-arg3) && arg3 >= var29 - arg0 && arg2[var28 + arg3 - arg1][arg3 + var29 - arg0]) {
                                        OpenGL.glMatrixMode(5890);
                                        OpenGL.glLoadIdentity();
                                        OpenGL.glScalef(var7, var7, 1.0F);
                                        OpenGL.glTranslatef((float) (-var25) / var7, (float) (-var22) / var7, 1.0F);
                                        OpenGL.glMatrixMode(5888);
                                        this.field4[var25][var22].method3846(6406);
                                        continue label111;
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                for (int var8 = 0; var8 < this.field17; var8++) {
                    int var9 = var8 << this.field18;
                    int var10 = var8 + 1 << this.field18;
                    for (int var11 = 0; var11 < this.field5; var11++) {
                        int var12 = 0;
                        int var13 = var11 << this.field18;
                        int var14 = var11 + 1 << this.field18;
                        class318 var15 = this.field13.field2890;
                        var15.field9945 = 0;
                        for (int var16 = var9; var16 < var10; var16++) {
                            if ((var16 - arg0) >= (-arg3) && arg3 >= var16 - arg0) {
                                int var17 = this.field2.field10701 * var16 + var13;
                                for (int var18 = var13; var18 < var14; var18++) {
                                    if ((-arg3) <= (var18 - arg1) && arg3 >= (var18 - arg1) && arg2[arg3 + var18 - arg1][var16 + arg3 - arg0]) {
                                        short[] var19 = this.field2.field8872[var17];
                                        if (var19 != null) {
                                            if (this.field13.field2842) {
                                                for (int var20 = 0; var20 < var19.length; var20++) {
                                                    var12++;
                                                    var15.method5138((byte) -97, var19[var20] & 0xFFFF);
                                                }
                                            } else {
                                                for (int var21 = 0; var21 < var19.length; var21++) {
                                                    var15.method5106(var19[var21] & 0xFFFF, -69);
                                                    var12++;
                                                }
                                            }
                                        }
                                    }
                                    var17++;
                                }
                            }
                        }
                        if (var12 > 0) {
                            OpenGL.glMatrixMode(5890);
                            OpenGL.glLoadIdentity();
                            OpenGL.glScalef(var7, var7, 1.0F);
                            OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                            OpenGL.glMatrixMode(5888);
                            this.field4[var11][var8].method3850((byte) -16, var15.field9996, var12, 5123);
                        }
                    }
                }
            }
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
        } catch (RuntimeException var31) {
            throw class665.method4799(var31, field22[7] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field22[1] : field22[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lml;Lqd;)V", line = 445)
    public class1(class194 arg0, class622 arg1) {
        try {
            this.field13 = arg0;
            this.field2 = arg1;
            this.field16 = (this.field2.field10701 * this.field2.field10690 >> this.field13.field2760) + 2;
            this.field10 = (this.field2.field10703 * this.field2.field10690 >> this.field13.field2760) + 2;
            this.field15 = new byte[this.field16 * this.field10];
            this.field18 = this.field13.field2760 + 7 - this.field2.field10692;
            this.field5 = this.field2.field10701 >> this.field18;
            this.field17 = this.field2.field10703 >> this.field18;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field22[11] + (arg0 == null ? field22[1] : field22[0]) + ',' + (arg1 == null ? field22[1] : field22[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILr;II)Z", line = 464)
    public final boolean method9(int arg0, class412 arg1, int arg2, int arg3) {
        try {
            field1++;
            class143 var5 = (class143) arg1;
            arg3 += var5.field1850 + 1;
            arg2 += var5.field1859 + 1;
            int var6 = arg2 + (this.field16 * arg3);
            int var7 = var5.field1852;
            int var8 = var5.field1848;
            int var9 = this.field16 - var8;
            if (arg3 <= 0) {
                int var10 = 1 - arg3;
                var6 += this.field16 * var10;
                arg3 = 1;
                var7 -= var10;
            }
            if (this.field10 <= arg3 + var7) {
                int var11 = arg3 + var7 + 1 - this.field10;
                var7 -= var11;
            }
            if (arg2 <= 0) {
                int var12 = 1 - arg2;
                var9 += var12;
                var8 -= var12;
                var6 += var12;
                arg2 = 1;
            }
            if (this.field16 <= (arg2 + var8)) {
                int var13 = arg2 + var8 + 1 - this.field16;
                var9 += var13;
                var8 -= var13;
            }
            if (var8 > 0 && var7 > 0) {
                int var15 = (arg0 - 1) * this.field16 + var9;
                return class427.method3303(var15, 0, var8, this.field15, var6, var7, arg0);
            } else {
                return false;
            }
        } catch (RuntimeException var17) {
            throw class665.method4799(var17, field22[2] + arg0 + ',' + (arg1 == null ? field22[1] : field22[0]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ko", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method10(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ko", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method11(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 47;
                    break;
                case 1:
                    var10005 = 70;
                    break;
                case 2:
                    var10005 = 64;
                    break;
                case 3:
                    var10005 = 9;
                    break;
                default:
                    var10005 = 5;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
