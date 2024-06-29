import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 extends class107 {

    @OriginalMember(owner = "client!ro", name = "v", descriptor = "Z")
    private boolean field9 = false;

    @OriginalMember(owner = "client!ro", name = "r", descriptor = "I")
    private int field17 = 0;

    @OriginalMember(owner = "client!ro", name = "y", descriptor = "I")
    private int field24 = 0;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    private int field25 = 0;

    @OriginalMember(owner = "client!ro", name = "B", descriptor = "I")
    private int field7 = 0;

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "I")
    private int field27 = 0;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "Lvf;")
    private class159 field13;

    @OriginalMember(owner = "client!ro", name = "o", descriptor = "Lub;")
    private class20 field33;

    @OriginalMember(owner = "client!ro", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field38 = new String[] { method28(method27("f\\2F\b")), method28(method27("f\\2B\b")), method28(method27("f\\2N\b")), method28(method27("zFpg")), method28(method27("f\\2A\b")), method28(method27("o\u001d2%]")), method28(method27("f\\2G\b")), method28(method27("f\\27IzZh5\b")), method28(method27("f\\2Ja<")), method28(method27("f\\2L\b")), method28(method27("f\\2@\b")), method28(method27("f\\2H\b")), method28(method27("f\\2C\b")), method28(method27("f\\2J\b")), method28(method27("f\\2X\b")), method28(method27("f\\2D\b")), method28(method27("f\\2_\b")), method28(method27("f\\2I\b")), method28(method27("f\\2M\b")), method28(method27("f\\2Ia<")), method28(method27("f\\2O\b")), method28(method27("f\\2Ma<")), method28(method27("f\\2Oa<")), method28(method27("f\\2Z\b")) };

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "Lak;")
    public static class369 field34 = new class369();

    @OriginalMember(owner = "client!ro", name = "F", descriptor = "I")
    public static int field36 = 0;

    @OriginalMember(owner = "client!ro", name = "E", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!ro", name = "w", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!ro", name = "t", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!ro", name = "s", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!ro", name = "G", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!ro", name = "A", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ro", name = "p", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ro", name = "z", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ro", name = "x", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!ro", name = "u", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ro", name = "D", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!ro", name = "q", descriptor = "Lub;")
    private class20 field16;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(II)I")
    public static final int method6(int arg0, int arg1) {
        try {
            if (arg1 == 33985) {
                field21++;
                return arg0 & 0xFF;
            } else {
                return 102;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field38[18] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "()I")
    public final int method7() {
        try {
            field8++;
            return this.field33.field205;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field38[15] + ')');
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIII)V")
    public final void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            if (this.field13.field2434) {
                int[] var7 = this.field13.method207(arg4, arg5, arg2, arg3);
                if (var7 != null) {
                    for (int var8 = 0; var8 < var7.length; var8++) {
                        var7[var8] = class553.method4099(var7[var8], -16777216);
                    }
                    this.method10(arg0, arg1, arg2, arg3, var7, 0, arg2);
                }
            } else {
                this.field33.method4730(arg0, arg4, (byte) -108, arg3, arg1, arg5, arg2);
            }
            field29++;
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field38[20] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IILaa;II)V")
    public final void method9(int arg0, int arg1, class514 arg2, int arg3, int arg4) {
        try {
            field18++;
            class553 var6 = (class553) arg2;
            class20 var7 = var6.field8103;
            this.field33.method1967(7, false);
            this.field13.method1431(0);
            this.field13.method1497(this.field33, true);
            this.field13.method1425((byte) 35, 1);
            this.field13.method1432((byte) 3, 1);
            this.field13.method1497(var7, true);
            this.field13.method1492(8448, 7681, (byte) 17);
            this.field13.method1456((byte) -101, 768, 34168, 0);
            this.field13.method1482(13370, 1);
            int var19 = this.field27 + arg1;
            int var18 = this.field7 + arg0;
            int var8 = this.field33.field205 + var18;
            int var9 = var19 + this.field33.field197;
            float var10 = var7.field201 / (float) var7.field205;
            float var11 = var7.field202 / (float) var7.field197;
            float var12 = (float) (var18 - arg3) * var10;
            float var13 = (float) (var8 - arg3) * var10;
            float var14 = var7.field202 - (float) (var19 - arg4) * var11;
            float var15 = var7.field202 - (float) (var9 - arg4) * var11;
            OpenGL.glBegin(7);
            OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
            OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field33.field202);
            OpenGL.glMultiTexCoord2f(33985, var12, var14);
            OpenGL.glVertex2i(var18, var19);
            OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
            OpenGL.glMultiTexCoord2f(33985, var12, var15);
            OpenGL.glVertex2i(var18, this.field33.field197 + var19);
            OpenGL.glMultiTexCoord2f(33984, this.field33.field201, 0.0F);
            OpenGL.glMultiTexCoord2f(33985, var13, var15);
            OpenGL.glVertex2i(this.field33.field205 + var18, this.field33.field197 + var19);
            OpenGL.glMultiTexCoord2f(33984, this.field33.field201, this.field33.field202);
            OpenGL.glMultiTexCoord2f(33985, var13, var14);
            OpenGL.glVertex2i(this.field33.field205 + var18, var19);
            OpenGL.glEnd();
            this.field13.method1456((byte) -101, 768, 5890, 0);
            this.field13.method1425((byte) 35, 0);
            this.field13.method1497(null, true);
            this.field13.method1432((byte) 3, 0);
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field38[9] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field38[3] : field38[5]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIII[III)V")
    private final void method10(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        try {
            field14++;
            this.field33.method4733(arg5, arg4, arg0, true, arg3, (byte) -125, arg2, arg1, arg6);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field38[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field38[3] : field38[5]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IILjava/lang/String;IIILha;I)V")
    public static final void method11(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, class63 arg6, int arg7) {
        try {
            field30++;
            if (class334.field5452 == null || class739.field10873 == null) {
                if (class550.field8065.method595(-2, class287.field4629) && class550.field8065.method595(-2, class658.field9410)) {
                    class334.field5452 = arg6.method213(class174.method1608(class550.field8065, class287.field4629, 0), true);
                    class174 var8 = class174.method1608(class550.field8065, class658.field9410, 0);
                    class739.field10873 = arg6.method213(var8, true);
                    var8.method1606();
                    class794.field11608 = arg6.method213(var8, true);
                } else {
                    arg6.method242(arg7, arg5, arg4, arg1, class582.field8378 | 255 - class152.field2132 << 24, 1);
                }
            }
            if (arg3 < -127) {
                if (class334.field5452 != null && class739.field10873 != null) {
                    int var9 = (arg4 - (class739.field10873.method7() * 2)) / class334.field5452.method7();
                    for (int var10 = 0; var10 < var9; var10++) {
                        class334.field5452.method1001(class739.field10873.method7() + (arg7 + (var10 * class334.field5452.method7())), arg5);
                    }
                    class739.field10873.method1001(arg7, arg5);
                    class794.field11608.method1001(arg7 + arg4 - class794.field11608.method7(), arg5);
                }
                class461.field7108.method679(0, arg7 + 3, -1, class785.field11472 | -16777216, arg2, arg5 + 14);
                arg6.method242(arg7, arg1 + arg5, arg4, arg0 - arg1, -class152.field2132 + 255 << 24 | class582.field8378, 1);
            }
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field38[17] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field38[3] : field38[5]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field38[3] : field38[5]) + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "()I")
    public final int method12() {
        try {
            field35++;
            return this.field27 + this.field17 + this.field33.field197;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field38[16] + ')');
        }
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "()I")
    public final int method13() {
        try {
            field26++;
            return this.field33.field197;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field38[23] + ')');
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(III)V")
    public final void method14(int arg0, int arg1, int arg2) {
        try {
            field31++;
            OpenGL.glPixelTransferf(3348, 0.5F);
            OpenGL.glPixelTransferf(3349, 0.499F);
            OpenGL.glPixelTransferf(3352, 0.5F);
            OpenGL.glPixelTransferf(3353, 0.499F);
            OpenGL.glPixelTransferf(3354, 0.5F);
            OpenGL.glPixelTransferf(3355, 0.499F);
            this.field16 = class65.method691(this.field13, arg0, this.field33.field205, this.field33.field197, -29, arg1);
            this.field24 = arg2;
            OpenGL.glPixelTransferf(3348, 1.0F);
            OpenGL.glPixelTransferf(3349, 0.0F);
            OpenGL.glPixelTransferf(3352, 1.0F);
            OpenGL.glPixelTransferf(3353, 0.0F);
            OpenGL.glPixelTransferf(3354, 1.0F);
            OpenGL.glPixelTransferf(3355, 0.0F);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field38[12] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
    public static void method15(int arg0) {
        try {
            field34 = null;
            if (arg0 != 1) {
                field36 = 47;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field38[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIIIII)V")
    public final void method16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            this.field33.method1967(26, (arg7 & 0x1) != 0);
            field15++;
            this.field13.method1431(0);
            this.field13.method1482(13370, arg6);
            OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
            if (this.field9) {
                float var9 = (float) arg2 / (float) this.method26();
                float var10 = (float) arg3 / (float) this.method12();
                float var11 = (float) this.field7 * var9 + (float) arg0;
                float var12 = (float) this.field27 * var10 + (float) arg1;
                float var13 = (float) this.field33.field205 * var9 + var11;
                float var14 = (float) this.field33.field197 * var10 + var12;
                if (this.field16 == null) {
                    this.field13.method1497(this.field33, true);
                    this.field13.method1425((byte) 35, arg4);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, this.field33.field202);
                    OpenGL.glVertex2f(var11, var12);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2f(var11, var14);
                    OpenGL.glTexCoord2f(this.field33.field201, 0.0F);
                    OpenGL.glVertex2f(var13, var14);
                    OpenGL.glTexCoord2f(this.field33.field201, this.field33.field202);
                    OpenGL.glVertex2f(var13, var12);
                    OpenGL.glEnd();
                } else {
                    this.method23(arg4, 0);
                    this.field16.method1967(82, true);
                    OpenGL.glBegin(7);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field33.field202);
                    OpenGL.glTexCoord2f(0.0F, this.field33.field202);
                    OpenGL.glVertex2f(var11, var12);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2f(var11, var14);
                    OpenGL.glMultiTexCoord2f(33985, this.field33.field201, 0.0F);
                    OpenGL.glTexCoord2f(this.field33.field201, 0.0F);
                    OpenGL.glVertex2f(var13, var14);
                    OpenGL.glMultiTexCoord2f(33985, this.field33.field201, this.field33.field202);
                    OpenGL.glTexCoord2f(this.field33.field201, this.field33.field202);
                    OpenGL.glVertex2f(var13, var12);
                    OpenGL.glEnd();
                    this.method18(118);
                }
            } else if (this.field16 == null) {
                this.field13.method1497(this.field33, true);
                this.field13.method1425((byte) 35, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field33.field202);
                OpenGL.glVertex2i(arg0, arg1);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(arg0, arg1 + arg3);
                OpenGL.glTexCoord2f(this.field33.field201, 0.0F);
                OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
                OpenGL.glTexCoord2f(this.field33.field201, this.field33.field202);
                OpenGL.glVertex2i(arg0 + arg2, arg1);
                OpenGL.glEnd();
            } else {
                this.method23(arg4, 0);
                this.field16.method1967(70, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field33.field202);
                OpenGL.glTexCoord2f(0.0F, this.field33.field202);
                OpenGL.glVertex2i(arg0, arg1);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(arg0, arg1 + arg3);
                OpenGL.glMultiTexCoord2f(33985, this.field33.field201, 0.0F);
                OpenGL.glTexCoord2f(this.field33.field201, 0.0F);
                OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
                OpenGL.glMultiTexCoord2f(33985, this.field33.field201, this.field33.field202);
                OpenGL.glTexCoord2f(this.field33.field201, this.field33.field202);
                OpenGL.glVertex2i(arg0 + arg2, arg1);
                OpenGL.glEnd();
                this.method18(-7);
            }
        } catch (RuntimeException var16) {
            throw class590.method4333(var16, field38[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method17(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        try {
            if (this.field9) {
                float var11 = (float) this.method26();
                float var12 = (float) this.method12();
                float var13 = (arg2 - arg0) / var11;
                float var14 = (arg3 - arg1) / var11;
                float var15 = (arg4 - arg0) / var12;
                float var16 = (arg5 - arg1) / var12;
                float var17 = (float) this.field27 * var15;
                float var18 = (float) this.field27 * var16;
                float var19 = (float) this.field7 * var13;
                float var20 = (float) this.field7 * var14;
                float var21 = (float) this.field25 * -var13;
                float var22 = (float) this.field25 * -var14;
                float var23 = (float) this.field17 * -var15;
                float var24 = (float) this.field17 * -var16;
                arg4 = arg4 + var19 + var23;
                arg3 = arg3 + var22 + var18;
                arg0 = arg0 + var19 + var17;
                arg1 = arg1 + var20 + var18;
                arg2 = arg2 + var21 + var17;
                arg5 = arg5 + var20 + var24;
            }
            field11++;
            float var25 = arg2 + arg4 - arg0;
            float var26 = arg5 + arg3 - arg1;
            this.field33.method1967(111, (arg9 & 0x1) != 0);
            this.field13.method1431(0);
            this.field13.method1497(this.field33, true);
            this.field13.method1482(13370, arg8);
            this.field13.method1425((byte) 35, arg6);
            OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field33.field202);
            OpenGL.glVertex2f(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2f(arg4, arg5);
            OpenGL.glTexCoord2f(this.field33.field201, 0.0F);
            OpenGL.glVertex2f(var25, var26);
            OpenGL.glTexCoord2f(this.field33.field201, this.field33.field202);
            OpenGL.glVertex2f(arg2, arg3);
            OpenGL.glEnd();
        } catch (RuntimeException var28) {
            throw class590.method4333(var28, field38[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)V")
    private final void method18(int arg0) {
        try {
            field6++;
            this.field13.method1432((byte) 3, 1);
            this.field13.method1497(null, true);
            this.field13.method1492(8448, 8448, (byte) 17);
            int var2 = 4 % ((60 - arg0) / 49);
            this.field13.method1456((byte) -101, 768, 34168, 1);
            this.field13.method1427(2, 5890, 770, 0);
            this.field13.method1432((byte) 3, 0);
            this.field13.method1456((byte) -101, 768, 34168, 1);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field38[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIII)V")
    public final void method19(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field10++;
            this.field33.method1967(104, false);
            this.field13.method1431(0);
            this.field13.method1482(13370, arg4);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            int var9 = this.field27 + arg1;
            int var8 = this.field7 + arg0;
            if (this.field16 == null) {
                this.field13.method1497(this.field33, true);
                this.field13.method1425((byte) 35, arg2);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field33.field202);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var8, this.field33.field197 + var9);
                OpenGL.glTexCoord2f(this.field33.field201, 0.0F);
                OpenGL.glVertex2i(var8 + this.field33.field205, this.field33.field197 + var9);
                OpenGL.glTexCoord2f(this.field33.field201, this.field33.field202);
                OpenGL.glVertex2i(this.field33.field205 + var8, var9);
                OpenGL.glEnd();
            } else {
                this.method23(arg2, 0);
                this.field16.method1967(6, false);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field33.field202);
                OpenGL.glTexCoord2f(0.0F, this.field33.field202);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var8, this.field33.field197 + var9);
                OpenGL.glMultiTexCoord2f(33985, this.field33.field201, 0.0F);
                OpenGL.glTexCoord2f(this.field33.field201, 0.0F);
                OpenGL.glVertex2i(this.field33.field205 + var8, this.field33.field197 + var9);
                OpenGL.glMultiTexCoord2f(33985, this.field33.field201, this.field33.field202);
                OpenGL.glTexCoord2f(this.field33.field201, this.field33.field202);
                OpenGL.glVertex2i(this.field33.field205 + var8, var9);
                OpenGL.glEnd();
                this.method18(115);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field38[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "([I)V")
    public final void method20(int[] arg0) {
        try {
            arg0[3] = this.field17;
            arg0[0] = this.field7;
            field28++;
            arg0[2] = this.field25;
            arg0[1] = this.field27;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field38[19] + (arg0 == null ? field38[3] : field38[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIIII)V")
    public final void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            field22++;
            int var8 = arg0 + arg2;
            this.field33.method1967(-122, false);
            int var9 = arg1 + arg3;
            this.field13.method1431(0);
            this.field13.method1497(this.field33, true);
            this.field13.method1482(13370, arg6);
            this.field13.method1425((byte) 35, arg4);
            OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
            if (this.field33.field198 && !this.field9) {
                float var21 = (float) arg3 * this.field33.field202 / (float) this.field33.field197;
                float var22 = (float) arg2 * this.field33.field201 / (float) this.field33.field205;
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, var21);
                OpenGL.glVertex2i(arg0, arg1);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(arg0, var9);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var22, var21);
                OpenGL.glVertex2i(var8, arg1);
                OpenGL.glEnd();
            } else {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef((float) this.field7, (float) this.field27, 0.0F);
                int var10 = this.method26();
                int var11 = this.method12();
                int var12 = this.field33.field197 + arg1;
                OpenGL.glBegin(7);
                int var13 = arg1;
                while (var9 >= var12) {
                    int var14 = arg0 + this.field33.field205;
                    int var15 = arg0;
                    while (var8 >= var14) {
                        OpenGL.glTexCoord2f(0.0F, this.field33.field202);
                        OpenGL.glVertex2i(var15, var13);
                        OpenGL.glTexCoord2f(0.0F, 0.0F);
                        OpenGL.glVertex2i(var15, var12);
                        OpenGL.glTexCoord2f(this.field33.field201, 0.0F);
                        OpenGL.glVertex2i(var14, var12);
                        OpenGL.glTexCoord2f(this.field33.field201, this.field33.field202);
                        OpenGL.glVertex2i(var14, var13);
                        var15 += var10;
                        var14 += var10;
                    }
                    if (var8 > var15) {
                        float var16 = (float) (var8 - var15) * this.field33.field201 / (float) this.field33.field205;
                        OpenGL.glTexCoord2f(0.0F, this.field33.field202);
                        OpenGL.glVertex2i(var15, var13);
                        OpenGL.glTexCoord2f(0.0F, 0.0F);
                        OpenGL.glVertex2i(var15, var12);
                        OpenGL.glTexCoord2f(var16, 0.0F);
                        OpenGL.glVertex2i(var8, var12);
                        OpenGL.glTexCoord2f(var16, this.field33.field202);
                        OpenGL.glVertex2i(var8, var13);
                    }
                    var13 += var11;
                    var12 += var11;
                }
                if (var13 < var9) {
                    float var17 = (float) (this.field33.field197 + var13 - var9) * this.field33.field202 / (float) this.field33.field197;
                    int var18 = this.field33.field205 + arg0;
                    int var19 = arg0;
                    while (var8 >= var18) {
                        OpenGL.glTexCoord2f(0.0F, this.field33.field202);
                        OpenGL.glVertex2i(var19, var13);
                        OpenGL.glTexCoord2f(0.0F, var17);
                        OpenGL.glVertex2i(var19, var9);
                        OpenGL.glTexCoord2f(this.field33.field201, var17);
                        OpenGL.glVertex2i(var18, var9);
                        OpenGL.glTexCoord2f(this.field33.field201, this.field33.field202);
                        OpenGL.glVertex2i(var18, var13);
                        var19 += var10;
                        var18 += var10;
                    }
                    if (var19 < var8) {
                        float var20 = (float) (var8 - var19) * this.field33.field201 / (float) this.field33.field205;
                        OpenGL.glTexCoord2f(0.0F, this.field33.field202);
                        OpenGL.glVertex2i(var19, var13);
                        OpenGL.glTexCoord2f(0.0F, var17);
                        OpenGL.glVertex2i(var19, var9);
                        OpenGL.glTexCoord2f(var20, var17);
                        OpenGL.glVertex2i(var8, var9);
                        OpenGL.glTexCoord2f(var20, this.field33.field202);
                        OpenGL.glVertex2i(var8, var13);
                    }
                }
                OpenGL.glEnd();
                OpenGL.glPopMatrix();
            }
        } catch (RuntimeException var24) {
            throw class590.method4333(var24, field38[22] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "(II)Z")
    public static final boolean method22(int arg0, int arg1) {
        try {
            field23++;
            if (arg1 > -12) {
                method11(97, 56, null, 29, -111, -26, null, 98);
            }
            return arg0 == 15 || arg0 == 45 || arg0 == 59 || arg0 == 52 || arg0 == 13 || arg0 == 5 || arg0 == 9;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field38[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(II)V")
    private final void method23(int arg0, int arg1) {
        try {
            this.field13.method1432((byte) 3, 1);
            field20++;
            this.field13.method1497(this.field33, true);
            this.field13.method1492(7681, this.field13.method1486(arg0, (byte) -95), (byte) 17);
            this.field13.method1456((byte) -101, 768, 34167, 1);
            this.field13.method1427(arg1 + 2, 34168, 770, 0);
            this.field13.method1432((byte) 3, arg1);
            this.field13.method1497(this.field16, true);
            this.field13.method1492(7681, 34479, (byte) 17);
            this.field13.method1456((byte) -101, 768, 34166, 1);
            if (this.field24 == 0) {
                this.field13.method1455(0.5F, 0.5F, 0, 0.0F, 1.0F);
            } else if (this.field24 == 1) {
                this.field13.method1455(0.5F, 1.0F, 0, 0.0F, 0.5F);
            } else if (this.field24 == 2) {
                this.field13.method1455(1.0F, 0.5F, 0, 0.0F, 0.5F);
            } else if (this.field24 == 3) {
                this.field13.method1455(128.5F, 128.5F, 0, 0.0F, 128.5F);
                return;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field38[13] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(IIII)V")
    public final void method24(int arg0, int arg1, int arg2, int arg3) {
        try {
            this.field25 = arg2;
            field12++;
            this.field17 = arg3;
            this.field7 = arg0;
            this.field27 = arg1;
            this.field9 = this.field7 != 0 || this.field27 != 0 || this.field25 != 0 || this.field17 != 0;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field38[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method25(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class514 arg7, int arg8, int arg9) {
        try {
            field32++;
            class20 var11 = ((class553) arg7).field8103;
            if (this.field9) {
                float var12 = (float) this.method26();
                float var13 = (float) this.method12();
                float var14 = (arg2 - arg0) / var12;
                float var15 = (arg3 - arg1) / var12;
                float var16 = (arg4 - arg0) / var13;
                float var17 = (arg5 - arg1) / var13;
                float var18 = (float) this.field27 * var16;
                float var19 = (float) this.field27 * var17;
                float var20 = (float) this.field7 * var14;
                float var21 = (float) this.field7 * var15;
                float var22 = (float) this.field25 * -var14;
                float var23 = (float) this.field25 * -var15;
                float var24 = (float) this.field17 * -var16;
                float var25 = (float) this.field17 * -var17;
                arg1 = arg1 + var21 + var19;
                arg3 = arg3 + var23 + var19;
                arg0 = arg0 + var20 + var18;
                arg4 = arg4 + var20 + var24;
                arg2 = arg2 + var22 + var18;
                arg5 = arg5 + var21 + var25;
            }
            float var26 = arg2 + arg4 - arg0;
            float var27 = arg5 + arg3 - arg1;
            this.field33.method1967(5, (arg6 & 0x1) != 0);
            this.field13.method1431(0);
            this.field13.method1497(this.field33, true);
            this.field13.method1425((byte) 35, 1);
            this.field13.method1432((byte) 3, 1);
            this.field13.method1497(var11, true);
            this.field13.method1492(8448, 7681, (byte) 17);
            this.field13.method1456((byte) -101, 768, 34168, 0);
            this.field13.method1482(13370, 1);
            float var28 = var11.field201 / (float) var11.field205;
            float var29 = var11.field202 / (float) var11.field197;
            OpenGL.glBegin(7);
            OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
            OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field33.field202);
            OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg0) * var28, var11.field202 - (arg1 - (float) arg9) * var29);
            OpenGL.glVertex2f(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
            OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg8) * var28, var11.field202 - ((arg5 - (float) arg9) * var29));
            OpenGL.glVertex2f(arg4, arg5);
            OpenGL.glMultiTexCoord2f(33984, this.field33.field201, 0.0F);
            OpenGL.glMultiTexCoord2f(33985, (var26 - (float) arg8) * var28, var11.field202 - (((float) (-arg9) + var27) * var29));
            OpenGL.glVertex2f(var26, var27);
            OpenGL.glMultiTexCoord2f(33984, this.field33.field201, this.field33.field202);
            OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg8) * var28, var11.field202 - (((float) (-arg9) + arg3) * var29));
            OpenGL.glVertex2f(arg2, arg3);
            OpenGL.glEnd();
            this.field13.method1456((byte) -101, 768, 5890, 0);
            this.field13.method1425((byte) 35, 0);
            this.field13.method1497(null, true);
            this.field13.method1432((byte) 3, 0);
        } catch (RuntimeException var31) {
            throw class590.method4333(var31, field38[21] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field38[3] : field38[5]) + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "()I")
    public final int method26() {
        try {
            field19++;
            return this.field33.field205 + this.field7 + this.field25;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field38[14] + ')');
        }
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lvf;IIZ)V")
    public class2(class159 arg0, int arg1, int arg2, boolean arg3) {
        try {
            this.field13 = arg0;
            this.field33 = class246.method2115(34037, arg0, arg3 ? 6408 : 6407, arg2, arg1);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field38[7] + (arg0 == null ? field38[3] : field38[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lvf;IIII)V")
    public class2(class159 arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            this.field13 = arg0;
            this.field33 = class65.method691(arg0, arg1, arg3, arg4, -84, arg2);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field38[7] + (arg0 == null ? field38[3] : field38[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lvf;II[III)V")
    public class2(class159 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        try {
            this.field13 = arg0;
            this.field33 = class447.method3492(false, arg2, arg0, arg1, arg4, arg5, arg3, 13);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field38[7] + (arg0 == null ? field38[3] : field38[5]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field38[3] : field38[5]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ro", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method27(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x20);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ro", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method28(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 20;
                    break;
                case 1:
                    var10005 = 51;
                    break;
                case 2:
                    var10005 = 28;
                    break;
                case 3:
                    var10005 = 11;
                    break;
                default:
                    var10005 = 32;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
