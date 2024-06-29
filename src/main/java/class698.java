import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class698 {

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Laq;")
    private class170 field10164;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "Lffa;")
    private class197 field10150;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    public int field10155;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    private int field10158;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    private int field10154;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "[B")
    public byte[] field10161;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    private int field10152;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    private int field10165;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10169 = new String[] { method5091(method5090("\u00178z_")), method5091(method5090("\u0002c8\u001dv")), method5091(method5090("\t.8q#")), method5091(method5090("\t.8\u000fb\u0017$b\r#")), method5091(method5090("\t.8w#")), method5091(method5090("\t.8{#")), method5091(method5090("\t.8p#")), method5091(method5090("\t.8r#")), method5091(method5090("\t.8v#")), method5091(method5090("\t.8u#")), method5091(method5090("\t.8t#")) };

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field10153 = 0;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    public static int field10162 = -1;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "F")
    public static float field10156;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field10149;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    public static int field10157;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public static int field10160;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field10163;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field10166;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field10167;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    public static int field10168;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "Lvd;")
    public static class42 field10159;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "[[Lcq;")
    private class492[][] field10151;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static void method5082(int arg0) {
        try {
            field10159 = null;
            if (arg0 != 7435) {
                field10153 = -120;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10169[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILr;I)V")
    public final void method5083(int arg0, int arg1, class194 arg2, int arg3) {
        try {
            field10166++;
            class582 var5 = (class582) arg2;
            arg1 += var5.field8613 + 1;
            arg0 += var5.field8607 + 1;
            int var6 = arg0 + (this.field10155 * arg1);
            int var7 = 0;
            int var8 = var5.field8606;
            int var9 = var5.field8610;
            int var10 = this.field10155 - var9;
            if (arg1 <= 0) {
                int var11 = 1 - arg1;
                var8 -= var11;
                arg1 = 1;
                var7 += var9 * var11;
                var6 += this.field10155 * var11;
            }
            if (arg3 >= 38) {
                int var12 = 0;
                if (this.field10158 <= (arg1 + var8)) {
                    int var13 = arg1 + var8 + 1 - this.field10158;
                    var8 -= var13;
                }
                if (arg0 <= 0) {
                    int var14 = 1 - arg0;
                    var12 += var14;
                    var9 -= var14;
                    var7 += var14;
                    var10 += var14;
                    var6 += var14;
                    arg0 = 1;
                }
                if (this.field10155 <= arg0 + var9) {
                    int var15 = arg0 + var9 + 1 - this.field10155;
                    var10 += var15;
                    var12 += var15;
                    var9 -= var15;
                }
                if (var9 > 0 && var8 > 0) {
                    class379.method3049(var10, var7, this.field10161, var5.field8609, var8, var9, var12, 0, var6);
                    this.method5086(-87, arg0, var9, arg1, var8);
                }
            }
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field10169[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field10169[0] : field10169[1]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILr;II)V")
    public final void method5084(int arg0, class194 arg1, int arg2, int arg3) {
        try {
            field10163++;
            class582 var5 = (class582) arg1;
            arg0 += var5.field8607 + 1;
            arg3 += var5.field8613 + arg2;
            int var6 = this.field10155 * arg3 + arg0;
            int var7 = 0;
            int var8 = var5.field8606;
            int var9 = var5.field8610;
            int var10 = this.field10155 - var9;
            if (arg3 <= 0) {
                int var11 = 1 - arg3;
                var6 += this.field10155 * var11;
                var7 += var9 * var11;
                var8 -= var11;
                arg3 = 1;
            }
            int var12 = 0;
            if ((arg3 + var8) >= this.field10158) {
                int var13 = var8 + arg3 + 1 - this.field10158;
                var8 -= var13;
            }
            if (arg0 <= 0) {
                int var14 = 1 - arg0;
                var12 += var14;
                var9 -= var14;
                arg0 = 1;
                var10 += var14;
                var7 += var14;
                var6 += var14;
            }
            if (this.field10155 <= arg0 + var9) {
                int var15 = arg0 + var9 + 1 - this.field10155;
                var12 += var15;
                var10 += var15;
                var9 -= var15;
            }
            if (var9 > 0 && var8 > 0) {
                class672.method4941(this.field10161, var10, var6, var9, (byte) 115, var12, var5.field8609, var8, var7);
                this.method5086(-76, arg0, var9, arg3, var8);
            }
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field10169[7] + arg0 + ',' + (arg1 == null ? field10169[0] : field10169[1]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([[ZBZIII)V")
    public final void method5085(boolean[][] arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5) {
        try {
            if (arg1 != 20) {
                this.method5085(null, (byte) 112, false, -95, 90, 85);
            }
            field10160++;
            this.field10150.method1706(arg1 ^ 0x7A, false);
            this.field10150.method1680(false, -32);
            this.field10150.method1729((byte) -101, -2);
            this.field10150.method1753(0, 1);
            this.field10150.method1743(-105, 1);
            float var7 = 1.0F / (float) (this.field10150.field2849 * 128);
            if (arg2) {
                for (int var8 = 0; var8 < this.field10165; var8++) {
                    int var9 = var8 << this.field10154;
                    int var10 = var8 + 1 << this.field10154;
                    label161: for (int var11 = 0; var11 < this.field10152; var11++) {
                        int var12 = var11 << this.field10154;
                        int var13 = var11 + 1 << this.field10154;
                        for (int var14 = var12; var14 < var13; var14++) {
                            if ((var14 - arg3) >= (-arg4) && arg4 >= (var14 - arg3)) {
                                for (int var15 = var9; var15 < var10; var15++) {
                                    if (var15 - arg5 >= -arg4 && arg4 >= var15 - arg5 && arg0[var14 + arg4 - arg3][var15 - (arg5 - arg4)]) {
                                        OpenGL.glMatrixMode(5890);
                                        OpenGL.glLoadIdentity();
                                        OpenGL.glScalef(var7, var7, 1.0F);
                                        OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                        OpenGL.glMatrixMode(5888);
                                        this.field10151[var11][var8].method3722((byte) 121);
                                        continue label161;
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                for (int var16 = 0; var16 < this.field10165; var16++) {
                    int var17 = var16 << this.field10154;
                    int var18 = var16 + 1 << this.field10154;
                    for (int var19 = 0; var19 < this.field10152; var19++) {
                        int var20 = 0;
                        int var21 = var19 << this.field10154;
                        int var22 = var19 + 1 << this.field10154;
                        class353 var23 = this.field10150.field2994;
                        var23.field2201 = 0;
                        for (int var24 = var17; var24 < var18; var24++) {
                            if ((var24 - arg5) >= (-arg4) && arg4 >= var24 - arg5) {
                                int var25 = this.field10164.field4337 * var24 + var21;
                                for (int var26 = var21; var26 < var22; var26++) {
                                    if (var26 - arg3 >= -arg4 && (var26 - arg3) <= arg4 && arg0[var26 + arg4 - arg3][var24 + arg4 - arg5]) {
                                        short[] var27 = this.field10164.field2328[var25];
                                        if (var27 != null) {
                                            if (this.field10150.field2922) {
                                                for (int var29 = 0; var29 < var27.length; var29++) {
                                                    var23.method1406(var27[var29] & 0xFFFF, 380332136);
                                                    var20++;
                                                }
                                            } else {
                                                for (int var28 = 0; var28 < var27.length; var28++) {
                                                    var20++;
                                                    var23.method1465(var27[var28] & 0xFFFF, (byte) -108);
                                                }
                                            }
                                        }
                                    }
                                    var25++;
                                }
                            }
                        }
                        if (var20 > 0) {
                            OpenGL.glMatrixMode(5890);
                            OpenGL.glLoadIdentity();
                            OpenGL.glScalef(var7, var7, 1.0F);
                            OpenGL.glTranslatef((float) (-var19) / var7, (float) (-var16) / var7, 1.0F);
                            OpenGL.glMatrixMode(5888);
                            this.field10151[var19][var16].method3720(var23.field2209, var20, 5123, -29);
                        }
                    }
                }
            }
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
        } catch (RuntimeException var31) {
            throw class759.method5498(var31, field10169[8] + (arg0 == null ? field10169[0] : field10169[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIII)V")
    private final void method5086(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field10157++;
            if (this.field10151 != null) {
                int var6 = arg1 - 1 >> 7;
                int var7 = arg1 + arg2 - 1 - 1 >> 7;
                int var8 = arg3 - 1 >> 7;
                int var9 = arg3 + (arg4 - 1) - 1 >> 7;
                if (arg0 < -2) {
                    for (int var10 = var6; var10 <= var7; var10++) {
                        class492[] var11 = this.field10151[var10];
                        for (int var12 = var8; var12 <= var9; var12++) {
                            var11[var12].field7066 = true;
                        }
                    }
                }
            }
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field10169[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([BZ)Z")
    public static final boolean method5087(byte[] arg0, boolean arg1) {
        try {
            field10167++;
            class163 var2 = new class163(arg0);
            if (arg1) {
                return false;
            }
            int var3 = var2.method1455((byte) 62);
            if (var3 != 2) {
                return false;
            }
            boolean var4 = var2.method1455((byte) 62) == 1;
            if (var4) {
                class745.method5427(var2, true);
            }
            class234.method1999(var2, -65536);
            return true;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field10169[6] + (arg0 == null ? field10169[0] : field10169[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBLr;I)Z")
    public final boolean method5088(int arg0, byte arg1, class194 arg2, int arg3) {
        try {
            field10149++;
            class582 var5 = (class582) arg2;
            arg3 += var5.field8607 + 1;
            arg0 += var5.field8613 + 1;
            int var6 = this.field10155 * arg0 + arg3;
            int var7 = var5.field8606;
            int var8 = var5.field8610;
            if (arg0 <= 0) {
                int var9 = 1 - arg0;
                var7 -= var9;
                arg0 = 1;
                var6 += this.field10155 * var9;
            }
            int var10 = this.field10155 - var8;
            if (arg0 + var7 >= this.field10158) {
                int var11 = arg0 + var7 + 1 - this.field10158;
                var7 -= var11;
            }
            if (arg3 <= 0) {
                int var12 = 1 - arg3;
                var10 += var12;
                arg3 = 1;
                var6 += var12;
                var8 -= var12;
            }
            if (this.field10155 <= (arg3 + var8)) {
                int var13 = var8 + arg3 + 1 - this.field10155;
                var8 -= var13;
                var10 += var13;
            }
            if (var8 <= 0 || var7 <= 0) {
                return false;
            }
            byte var14 = 8;
            if (arg1 < 16) {
                this.method5089((byte) 0);
            }
            int var15 = (var14 - 1) * this.field10155 + var10;
            return class294.method2406(var15, this.field10161, var8, var14, var6, var7, 297);
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field10169[2] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field10169[0] : field10169[1]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public final void method5089(byte arg0) {
        try {
            if (arg0 > -57) {
                field10156 = 0.20222348F;
            }
            field10168++;
            this.field10151 = new class492[this.field10152][this.field10165];
            for (int var2 = 0; var2 < this.field10165; var2++) {
                for (int var3 = 0; var3 < this.field10152; var3++) {
                    this.field10151[var3][var2] = new class492(this.field10150, this, this.field10164, var3, var2, this.field10154, var3 * 128 + 1, var2 * 128 + 1);
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10169[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lffa;Laq;)V")
    public class698(class197 arg0, class170 arg1) {
        try {
            this.field10164 = arg1;
            this.field10150 = arg0;
            this.field10155 = (this.field10164.field4340 * this.field10164.field4337 >> this.field10150.field2852) + 2;
            this.field10158 = (this.field10164.field4340 * this.field10164.field4336 >> this.field10150.field2852) + 2;
            this.field10154 = this.field10150.field2852 + 7 - this.field10164.field4341;
            this.field10161 = new byte[this.field10158 * this.field10155];
            this.field10152 = this.field10164.field4337 >> this.field10154;
            this.field10165 = this.field10164.field4336 >> this.field10154;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10169[3] + (arg0 == null ? field10169[0] : field10169[1]) + ',' + (arg1 == null ? field10169[0] : field10169[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5090(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xB);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5091(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 121;
                    break;
                case 1:
                    var10005 = 77;
                    break;
                case 2:
                    var10005 = 22;
                    break;
                case 3:
                    var10005 = 51;
                    break;
                default:
                    var10005 = 11;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
