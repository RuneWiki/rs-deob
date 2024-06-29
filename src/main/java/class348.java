import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class348 extends class127 {

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    private int field5343 = 0;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    private int field5345 = 0;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "Z")
    private boolean field5347 = false;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
    private int field5364 = 0;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    private int field5358 = 0;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
    private int field5363 = 0;

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "Lvd;")
    private class258 field5368;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "Lwq;")
    private class283 field5361;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "[I")
    public static int[] field5356 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field5349 = 0;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "Luv;")
    public static class2 field5351 = new class2(91, -1);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field5355;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
    public static int field5369;

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "I")
    public static int field5371;

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!cc", name = "G", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "Lya;")
    public static class11 field5366;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "Lwq;")
    private class283 field5344;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cc", name = "H", descriptor = "Ljava/lang/Class;")
    public static Class field5374;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static final void method2104(int arg0) {
        field5370++;
        class27.field395.method63(class503.field7412, class23.field333, class170.field2495);
        if (arg0 != 768) {
            field5351 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)V")
    private final void method2105(boolean arg0, int arg1) {
        this.field5368.method1553(1, -8156);
        field5362++;
        this.field5368.method1546(-2, this.field5361);
        this.field5368.method1576(this.field5368.method1545(arg1, true), 7681, (byte) 41);
        this.field5368.method1590(768, 34167, true, 1);
        if (arg0) {
            field5366 = null;
        }
        this.field5368.method1556(770, 34168, 0, 34184);
        this.field5368.method1553(0, -8156);
        this.field5368.method1546(-2, this.field5344);
        this.field5368.method1576(34479, 7681, (byte) -122);
        this.field5368.method1590(768, 34166, true, 1);
        if (this.field5358 == 0) {
            this.field5368.method1550(0.0F, 0.5F, arg0, 1.0F, 0.5F);
        } else if (this.field5358 == 1) {
            this.field5368.method1550(0.0F, 0.5F, arg0, 0.5F, 1.0F);
        } else if (this.field5358 == 2) {
            this.field5368.method1550(0.0F, 1.0F, false, 0.5F, 0.5F);
        } else if (this.field5358 == 3) {
            this.field5368.method1550(0.0F, 128.5F, false, 128.5F, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!cc", name = "JA", descriptor = "(IIIIIII)V")
    public final void method469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5353++;
        int var8 = arg0 + arg2;
        int var9 = arg1 + arg3;
        this.field5361.method1693(false, (byte) 106);
        this.field5368.method1561((byte) 120);
        this.field5368.method1546(-2, this.field5361);
        this.field5368.method1594(arg6, 256);
        this.field5368.method1582(arg4, true);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field5361.field4276 && !this.field5347) {
            float var10 = (float) arg3 * this.field5361.field4283 / (float) this.field5361.field4277;
            float var11 = (float) arg2 * this.field5361.field4272 / (float) this.field5361.field4273;
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, var10);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, var9);
            OpenGL.glTexCoord2f(var11, 0.0F);
            OpenGL.glVertex2i(var8, var9);
            OpenGL.glTexCoord2f(var11, var10);
            OpenGL.glVertex2i(var8, arg1);
            OpenGL.glEnd();
            return;
        }
        OpenGL.glPushMatrix();
        OpenGL.glTranslatef((float) this.field5364, (float) this.field5343, 0.0F);
        int var12 = this.method468();
        int var13 = this.method467();
        int var14 = this.field5361.field4277 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = this.field5361.field4273 + arg0;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field5361.field4283);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field5361.field4272, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field5361.field4272, this.field5361.field4283);
                OpenGL.glVertex2i(var20, var15);
                var20 += var12;
                var21 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field5361.field4272 / (float) this.field5361.field4273;
                OpenGL.glTexCoord2f(0.0F, this.field5361.field4283);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field5361.field4283);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (this.field5361.field4277 - (var9 - var15)) * this.field5361.field4283 / (float) this.field5361.field4277;
            int var17 = this.field5361.field4273 + arg0;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field5361.field4283);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field5361.field4272, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field5361.field4272, this.field5361.field4283);
                OpenGL.glVertex2i(var17, var15);
                var18 += var12;
                var17 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field5361.field4272 / (float) this.field5361.field4273;
                OpenGL.glTexCoord2f(0.0F, this.field5361.field4283);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field5361.field4283);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
    public static final void method2106(int arg0) {
        if (arg0 != -1965) {
            field5351 = null;
        }
        for (class372 var1 = (class372) class257.field3491.method2957(-112); var1 != null; var1 = (class372) class257.field3491.method2947(arg0 + 1837)) {
            if (class236.field3305 == null) {
                var1.method876((byte) -96);
            } else if (class86.field1350 >= var1.field5625) {
                int var14 = class175.field2591[var1.field5628];
                if (var14 == 0) {
                    class512 var15 = class222.method1406(var1.field5620, var1.field5623, var1.field5627);
                    if (var15 instanceof class157) {
                        class218.method1378(var1.field5620, var1.field5623, var1.field5627);
                        class157 var16 = (class157) var15;
                        if (var16.field2374 != null) {
                            class157.method1117(var1.field5620, var1.field5623, var1.field5627, var16.field2374, null);
                        }
                    }
                } else if (var14 == 1) {
                    class169 var17 = class118.method886(var1.field5620, var1.field5623, var1.field5627);
                    if (var17 instanceof class239) {
                        class92.method722(var1.field5620, var1.field5623, var1.field5627);
                        class239 var18 = (class239) var17;
                        if (var18.field3352 != null) {
                            class349.method2111(var1.field5620, var1.field5623, var1.field5627, var18.field3352, null);
                        }
                    }
                } else if (var14 == 2) {
                    class522 var19 = class534.method3160(var1.field5620, var1.field5623, var1.field5627, field5374 == null ? (field5374 = method2110("gf")) : field5374);
                    if (var19 instanceof class23) {
                        class110.method845(var1.field5620, var1.field5623, var1.field5627, field5374 == null ? (field5374 = method2110("gf")) : field5374);
                        class23 var20 = (class23) var19;
                        if (var20.field337 != null) {
                            class89.method691(var20.field337, false);
                        }
                    }
                } else if (var14 == 3) {
                    class259 var21 = class341.method2081(var1.field5620, var1.field5623, var1.field5627);
                    if (var21 instanceof class532) {
                        class211.method1362(var1.field5620, var1.field5623, var1.field5627);
                        class532 var22 = (class532) var21;
                        if (var22.field7830 != null) {
                            class514.method3024(var1.field5620, var1.field5623, var1.field5627, var22.field7830);
                        }
                    }
                }
                var1.method876((byte) -96);
            } else if (class86.field1350 == var1.field5631) {
                int var2 = class175.field2591[var1.field5628];
                if (var2 == 0) {
                    class512 var3 = class222.method1406(var1.field5620, var1.field5623, var1.field5627);
                    if (var3 instanceof class157) {
                        var1.method876((byte) -96);
                    } else if (class389.method2335(var1.field5620, var1.field5623, var1.field5627) == null) {
                        class157 var4 = new class157(var1.field5628, var1.field5621, var1.field5624, var1.field5629, var1.field5636, var3);
                        class157.method1117(var1.field5620, var1.field5623, var1.field5627, var4, null);
                    } else {
                        var1.method876((byte) -96);
                    }
                } else if (var2 == 1) {
                    class169 var5 = class118.method886(var1.field5620, var1.field5623, var1.field5627);
                    if (var5 instanceof class239) {
                        var1.method876((byte) -96);
                    } else if (class452.method2631(var1.field5620, var1.field5623, var1.field5627) == null) {
                        class239 var6 = new class239(var1.field5628, var1.field5621, var1.field5624, var1.field5629, var1.field5636, var5);
                        class349.method2111(var1.field5620, var1.field5623, var1.field5627, var6, null);
                    } else {
                        var1.method876((byte) -96);
                    }
                } else if (var2 == 2) {
                    class522 var7 = class534.method3160(var1.field5620, var1.field5623, var1.field5627, field5374 == null ? (field5374 = method2110("gf")) : field5374);
                    if (var7 instanceof class23) {
                        var1.method876((byte) -96);
                    } else {
                        class110.method845(var1.field5620, var1.field5623, var1.field5627, field5374 == null ? (field5374 = method2110("gf")) : field5374);
                        class486 var8 = class119.field1824.method248(var1.field5633, 30);
                        int var9;
                        int var10;
                        if (var1.field5621 == 1 || var1.field5621 == 3) {
                            var10 = var8.field7235;
                            var9 = var8.field7182;
                        } else {
                            var9 = var8.field7235;
                            var10 = var8.field7182;
                        }
                        class23 var11 = new class23(var1.field5628, var1.field5621, var1.field5620, var1.field5624, var1.field5629, var1.field5636, var1.field5623, var1.field5623 + var10 - 1, var1.field5627, var1.field5627 + var9 - 1, var7);
                        class89.method691(var11, false);
                    }
                } else if (var2 == 3) {
                    class259 var12 = class341.method2081(var1.field5620, var1.field5623, var1.field5627);
                    if (var12 instanceof class532) {
                        var1.method876((byte) -96);
                    } else {
                        class532 var13 = new class532(var1.field5624, var1.field5629, var1.field5636, var12);
                        class514.method3024(var1.field5620, var1.field5623, var1.field5627, var13);
                    }
                }
            }
        }
        field5354++;
    }

    @OriginalMember(owner = "client!cc", name = "la", descriptor = "()I")
    public final int method470() {
        field5371++;
        return this.field5361.field4273;
    }

    @OriginalMember(owner = "client!cc", name = "BA", descriptor = "(III)V")
    public final void method295(int arg0, int arg1, int arg2) {
        field5342++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field5344 = class394.method2367((byte) -89, this.field5368, this.field5361.field4277, arg1, arg0, this.field5361.field4273);
        this.field5358 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(FFFFFFLma;II)V")
    public final void method474(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class249 arg6, int arg7, int arg8) {
        field5367++;
        class283 var10 = ((class40) arg6).field527;
        if (this.field5347) {
            float var11 = (float) this.method468();
            float var12 = (float) this.method467();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field5343 * var15;
            float var18 = (float) this.field5343 * var16;
            float var19 = (float) this.field5364 * var13;
            float var20 = (float) this.field5364 * var14;
            float var21 = (float) this.field5363 * -var13;
            float var22 = (float) this.field5363 * -var14;
            float var23 = (float) this.field5345 * -var15;
            arg3 = arg3 + var22 + var18;
            arg2 = arg2 + var21 + var17;
            arg4 = arg4 + var19 + var23;
            float var24 = (float) this.field5345 * -var16;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        this.field5361.method1693(true, (byte) 103);
        float var26 = arg5 + arg3 - arg1;
        this.field5368.method1561((byte) 120);
        this.field5368.method1546(-2, this.field5361);
        this.field5368.method1582(1, true);
        this.field5368.method1553(1, -8156);
        this.field5368.method1546(-2, var10);
        this.field5368.method1576(7681, 8448, (byte) 115);
        this.field5368.method1590(768, 34168, true, 0);
        this.field5368.method1594(1, 256);
        float var27 = var10.field4272 / (float) var10.field4273;
        float var28 = var10.field4283 / (float) var10.field4277;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field5361.field4283);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var27, var10.field4283 - ((float) (-arg8) + arg1) * var28);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg4) * var27, var10.field4283 - (((float) (-arg8) + arg5) * var28));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field5361.field4272, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + var25) * var27, var10.field4283 - (((float) (-arg8) + var26) * var28));
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field5361.field4272, this.field5361.field4283);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var27, var10.field4283 - (((float) (-arg8) + arg3) * var28));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field5368.method1590(768, 5890, true, 0);
        this.field5368.method1582(0, true);
        this.field5368.method1546(-2, null);
        this.field5368.method1553(0, -8156);
    }

    @OriginalMember(owner = "client!cc", name = "ma", descriptor = "()I")
    public final int method465() {
        field5350++;
        return this.field5361.field4277;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public static void method2107(byte arg0) {
        if (arg0 != 9) {
            field5349 = -51;
        }
        field5366 = null;
        field5351 = null;
        field5356 = null;
    }

    @OriginalMember(owner = "client!cc", name = "MA", descriptor = "(IIII)V")
    public final void method464(int arg0, int arg1, int arg2, int arg3) {
        field5360++;
        this.field5345 = arg3;
        this.field5364 = arg0;
        this.field5363 = arg2;
        this.field5343 = arg1;
        this.field5347 = this.field5364 != 0 || this.field5343 != 0 || this.field5363 != 0 || this.field5345 != 0;
    }

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "()I")
    public final int method467() {
        field5373++;
        return this.field5361.field4277 + this.field5343 + this.field5345;
    }

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "()I")
    public final int method468() {
        field5359++;
        return this.field5361.field4273 + this.field5364 + this.field5363;
    }

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "(IIIIIII)V")
    public final void method293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5352++;
        this.field5361.method1693(true, (byte) 19);
        this.field5368.method1561((byte) 120);
        this.field5368.method1594(arg6, 256);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field5347) {
            float var8 = (float) arg2 / (float) this.method468();
            float var9 = (float) arg3 / (float) this.method467();
            float var10 = (float) this.field5364 * var8 + (float) arg0;
            float var11 = (float) this.field5343 * var9 + (float) arg1;
            float var12 = (float) this.field5361.field4273 * var8 + var10;
            float var13 = (float) this.field5361.field4277 * var9 + var11;
            if (this.field5344 == null) {
                this.field5368.method1546(-2, this.field5361);
                this.field5368.method1582(arg4, true);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field5361.field4283);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field5361.field4272, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field5361.field4272, this.field5361.field4283);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method2105(false, arg4);
                this.field5344.method1693(true, (byte) -104);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5361.field4283);
                OpenGL.glTexCoord2f(0.0F, this.field5361.field4283);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field5361.field4272, 0.0F);
                OpenGL.glTexCoord2f(this.field5361.field4272, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field5361.field4272, this.field5361.field4283);
                OpenGL.glTexCoord2f(this.field5361.field4272, this.field5361.field4283);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method2108(68);
            }
        } else if (this.field5344 == null) {
            this.field5368.method1546(-2, this.field5361);
            this.field5368.method1582(arg4, true);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field5361.field4283);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field5361.field4272, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field5361.field4272, this.field5361.field4283);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method2105(false, arg4);
            this.field5344.method1693(true, (byte) -96);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5361.field4283);
            OpenGL.glTexCoord2f(0.0F, this.field5361.field4283);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field5361.field4272, 0.0F);
            OpenGL.glTexCoord2f(this.field5361.field4272, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field5361.field4272, this.field5361.field4283);
            OpenGL.glTexCoord2f(this.field5361.field4272, this.field5361.field4283);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method2108(105);
        }
    }

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "(IIIIII)V")
    public final void method298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5357++;
        this.field5361.method736(arg1, arg2, arg4, arg0, (byte) 125, arg5, arg3);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(FFFFFFIII)V")
    public final void method475(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        field5372++;
        if (this.field5347) {
            float var10 = (float) this.method468();
            float var11 = (float) this.method467();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field5343 * var14;
            float var17 = (float) this.field5343 * var15;
            float var18 = (float) this.field5364 * var12;
            float var19 = (float) this.field5364 * var13;
            float var20 = (float) this.field5363 * -var12;
            float var21 = (float) this.field5363 * -var13;
            float var22 = (float) this.field5345 * -var14;
            float var23 = (float) this.field5345 * -var15;
            arg1 = arg1 + var19 + var17;
            arg3 = arg3 + var21 + var17;
            arg4 = arg4 + var18 + var22;
            arg2 = arg2 + var20 + var16;
            arg0 = arg0 + var18 + var16;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        this.field5361.method1693(true, (byte) -109);
        this.field5368.method1561((byte) 120);
        this.field5368.method1546(-2, this.field5361);
        this.field5368.method1594(arg8, 256);
        this.field5368.method1582(arg6, true);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field5361.field4283);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field5361.field4272, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field5361.field4272, this.field5361.field4283);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILma;II)V")
    public final void method294(int arg0, int arg1, class249 arg2, int arg3, int arg4) {
        field5365++;
        class40 var6 = (class40) arg2;
        class283 var7 = var6.field527;
        this.field5361.method1693(false, (byte) -84);
        this.field5368.method1561((byte) 120);
        this.field5368.method1546(-2, this.field5361);
        this.field5368.method1582(1, true);
        this.field5368.method1553(1, -8156);
        this.field5368.method1546(-2, var7);
        this.field5368.method1576(7681, 8448, (byte) -110);
        this.field5368.method1590(768, 34168, true, 0);
        this.field5368.method1594(1, 256);
        int var8 = this.field5364 + arg0;
        int var9 = this.field5343 + arg1;
        int var10 = this.field5361.field4273 + var8;
        int var11 = var9 + this.field5361.field4277;
        float var12 = var7.field4272 / (float) var7.field4273;
        float var13 = var7.field4283 / (float) var7.field4277;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field4283 - (float) (var9 - arg4) * var13;
        float var17 = var7.field4283 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field5361.field4283);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var8, var9);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var8, this.field5361.field4277 + var9);
        OpenGL.glMultiTexCoord2f(33984, this.field5361.field4272, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(var8 + this.field5361.field4273, var9 - -this.field5361.field4277);
        OpenGL.glMultiTexCoord2f(33984, this.field5361.field4272, this.field5361.field4283);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field5361.field4273 + var8, var9);
        OpenGL.glEnd();
        this.field5368.method1590(768, 5890, true, 0);
        this.field5368.method1582(0, true);
        this.field5368.method1546(-2, null);
        this.field5368.method1553(0, -8156);
    }

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "(IIIII)V")
    public final void method299(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5369++;
        this.field5361.method1693(false, (byte) -120);
        this.field5368.method1561((byte) 120);
        this.field5368.method1594(arg4, 256);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field5364 + arg0;
        int var7 = this.field5343 + arg1;
        if (this.field5344 == null) {
            this.field5368.method1546(-2, this.field5361);
            this.field5368.method1582(arg2, true);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field5361.field4283);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, this.field5361.field4277 + var7);
            OpenGL.glTexCoord2f(this.field5361.field4272, 0.0F);
            OpenGL.glVertex2i(this.field5361.field4273 + var6, this.field5361.field4277 + var7);
            OpenGL.glTexCoord2f(this.field5361.field4272, this.field5361.field4283);
            OpenGL.glVertex2i(var6 + this.field5361.field4273, var7);
            OpenGL.glEnd();
            return;
        }
        this.method2105(false, arg2);
        this.field5344.method1693(false, (byte) -75);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5361.field4283);
        OpenGL.glTexCoord2f(0.0F, this.field5361.field4283);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, var7 + this.field5361.field4277);
        OpenGL.glMultiTexCoord2f(33985, this.field5361.field4272, 0.0F);
        OpenGL.glTexCoord2f(this.field5361.field4272, 0.0F);
        OpenGL.glVertex2i(var6 + this.field5361.field4273, this.field5361.field4277 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field5361.field4272, this.field5361.field4283);
        OpenGL.glTexCoord2f(this.field5361.field4272, this.field5361.field4283);
        OpenGL.glVertex2i(this.field5361.field4273 + var6, var7);
        OpenGL.glEnd();
        this.method2108(51);
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
    private final void method2108(int arg0) {
        this.field5368.method1553(1, -8156);
        field5346++;
        this.field5368.method1546(-2, null);
        if (arg0 < 30) {
            this.method469(42, 43, -84, -33, -14, -74, -55);
        }
        this.field5368.method1576(8448, 8448, (byte) 94);
        this.field5368.method1590(768, 34168, true, 1);
        this.field5368.method1556(770, 5890, 0, 34184);
        this.field5368.method1553(0, -8156);
        this.field5368.method1590(768, 34168, true, 1);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILgf;II)J")
    public static final long method2109(int arg0, class401 arg1, int arg2, int arg3) {
        field5355++;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        if (arg0 != -17703) {
            method2109(120, null, -109, -41);
        }
        long var8 = Long.MIN_VALUE;
        class486 var10 = class119.field1824.method248(arg1.method240(-15578), 30);
        long var11 = (long) (arg2 | arg3 << 7 | arg1.method222((byte) -117) << 14 | arg1.method223(-19634) << 20 | 0x40000000);
        if (var10.field7230 == 0) {
            var11 |= var8;
        }
        if (var10.field7147 == 1) {
            var11 |= var4;
        }
        if (var10.field7231) {
            var11 |= var6;
        }
        return var11 | (long) arg1.method240(-15578) << 32;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lvd;IIII)V")
    public class348(class258 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5368 = arg0;
        this.field5361 = class394.method2367((byte) -89, arg0, arg4, arg2, arg1, arg3);
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lvd;II[III)V")
    public class348(class258 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field5368 = arg0;
        this.field5361 = class133.method981(3553, false, arg0, arg2, arg3, arg1);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2110(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
