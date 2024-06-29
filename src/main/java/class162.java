import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class162 extends class532 {

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    private int field2317 = 0;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "Z")
    private boolean field2323 = false;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    private int field2334 = 0;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    private int field2332 = 0;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    private int field2331 = 0;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "I")
    private int field2339 = 0;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "Lag;")
    private class469 field2316;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "Lck;")
    public class8 field2335;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Luf;")
    public static class380 field2320 = new class380(260);

    @OriginalMember(owner = "client!af", name = "r", descriptor = "[S")
    public static short[] field2333 = new short[256];

    @OriginalMember(owner = "client!af", name = "l", descriptor = "Z")
    public static boolean field2327 = true;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!af", name = "y", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!af", name = "z", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!af", name = "B", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!af", name = "A", descriptor = "Lck;")
    private class8 field2342;

    @OriginalMember(owner = "client!af", name = "da", descriptor = "(IIIIII)V", line = 3)
    public final void method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2341++;
        this.field2335.method2490(arg1, arg3, 30481, arg0, arg4, arg2, arg5);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V", line = 15)
    private final void method994(byte arg0) {
        field2324++;
        this.field2316.method2625(arg0 + 20190, 1);
        this.field2316.method2627(121, null);
        this.field2316.method2669(8448, 98, 8448);
        this.field2316.method2636(1, 768, 34168, arg0 ^ 0xFFFFFFF7);
        this.field2316.method2637(770, -513, 0, 5890);
        if (arg0 != 106) {
            this.field2323 = true;
        }
        this.field2316.method2625(20296, 0);
        this.field2316.method2636(1, 768, 34168, -110);
    }

    @OriginalMember(owner = "client!af", name = "ca", descriptor = "()I", line = 35)
    public final int method532() {
        field2328++;
        return this.field2334 + this.field2331 + this.field2335.field71;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lag;IIZ)V", line = 780)
    public class162(class469 arg0, int arg1, int arg2, boolean arg3) {
        this.field2316 = arg0;
        this.field2335 = class322.method1871(arg1, arg0, true, arg2, arg3 ? 6408 : 6407);
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lag;IIII)V", line = 790)
    public class162(class469 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2316 = arg0;
        this.field2335 = class216.method1375(arg0, arg3, arg2, (byte) -63, arg4, arg1);
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lag;II[III)V", line = 800)
    public class162(class469 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field2316 = arg0;
        this.field2335 = class546.method3058(arg1, arg0, false, -123, arg2, arg3);
    }

    @OriginalMember(owner = "client!af", name = "xa", descriptor = "(III)V", line = 58)
    public final void method218(int arg0, int arg1, int arg2) {
        OpenGL.glPixelTransferf(3348, 0.5F);
        field2319++;
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field2342 = class216.method1375(this.field2316, this.field2335.field74, arg1, (byte) -63, this.field2335.field71, arg0);
        this.field2317 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!af", name = "qa", descriptor = "(FFFFFFIIII)V", line = 85)
    public final void method525(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field2325++;
        if (this.field2323) {
            float var11 = (float) this.method523();
            float var12 = (float) this.method532();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field2331 * var15;
            float var18 = (float) this.field2331 * var16;
            float var19 = (float) this.field2332 * var13;
            float var20 = (float) this.field2332 * var14;
            float var21 = (float) this.field2339 * -var13;
            float var22 = (float) this.field2339 * -var14;
            float var23 = (float) this.field2334 * -var15;
            arg4 = arg4 + var19 + var23;
            arg3 = arg3 + var22 + var18;
            float var24 = (float) this.field2334 * -var16;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field2335.method1582(122, (arg9 & 0x1) != 0);
        this.field2316.method2629((byte) -116);
        this.field2316.method2627(120, this.field2335);
        this.field2316.method2644(arg8, (byte) 79);
        this.field2316.method2650((byte) -59, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field2335.field73);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field2335.field75, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field2335.field75, this.field2335.field73);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!af", name = "Q", descriptor = "(IIII)V", line = 158)
    public final void method527(int arg0, int arg1, int arg2, int arg3) {
        field2343++;
        this.field2339 = arg2;
        this.field2334 = arg3;
        this.field2332 = arg0;
        this.field2331 = arg1;
        this.field2323 = this.field2332 != 0 || this.field2331 != 0 || this.field2339 != 0 || this.field2334 != 0;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)V", line = 173)
    public static final void method995(int arg0, int arg1) {
        class207 var2 = class153.field2168[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class207 var4 = class153.field2168[var3][arg0][arg1] = class153.field2168[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class634 var5 = var4.field2774; var5 != null; var5 = var5.field8764) {
                    class29 var6 = var5.field8767;
                    if (var6.field423 == arg0 && var6.field419 == arg1) {
                        var6.field385--;
                    }
                }
                if (var4.field2765 != null) {
                    var4.field2765.field385--;
                }
                if (var4.field2768 != null) {
                    var4.field2768.field385--;
                }
                if (var4.field2767 != null) {
                    var4.field2767.field385--;
                }
                if (var4.field2763 != null) {
                    var4.field2763.field385--;
                }
                if (var4.field2764 != null) {
                    var4.field2764.field385--;
                }
            }
        }
        if (class153.field2168[0][arg0][arg1] == null) {
            class153.field2168[0][arg0][arg1] = new class207(0);
            class153.field2168[0][arg0][arg1].field2776 = 1;
        }
        class153.field2168[0][arg0][arg1].field2771 = var2;
        class153.field2168[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IILua;II)V", line = 227)
    public final void method219(int arg0, int arg1, class596 arg2, int arg3, int arg4) {
        field2326++;
        class516 var6 = (class516) arg2;
        class8 var7 = var6.field7173;
        this.field2335.method1582(117, false);
        this.field2316.method2629((byte) -126);
        this.field2316.method2627(119, this.field2335);
        this.field2316.method2650((byte) -118, 1);
        this.field2316.method2625(20296, 1);
        this.field2316.method2627(93, var7);
        this.field2316.method2669(8448, 122, 7681);
        this.field2316.method2636(0, 768, 34168, -96);
        this.field2316.method2644(1, (byte) 79);
        int var8 = this.field2332 + arg0;
        int var9 = this.field2331 + arg1;
        int var10 = this.field2335.field74 + var8;
        int var11 = this.field2335.field71 + var9;
        float var12 = var7.field75 / (float) var7.field74;
        float var13 = var7.field73 / (float) var7.field71;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field73 - (float) (var9 - arg4) * var13;
        float var17 = var7.field73 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field2335.field73);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var8, var9);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var8, this.field2335.field71 + var9);
        OpenGL.glMultiTexCoord2f(33984, this.field2335.field75, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field2335.field74 + var8, var9 - -this.field2335.field71);
        OpenGL.glMultiTexCoord2f(33984, this.field2335.field75, this.field2335.field73);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(var8 + this.field2335.field74, var9);
        OpenGL.glEnd();
        this.field2316.method2636(0, 768, 5890, -101);
        this.field2316.method2650((byte) -39, 0);
        this.field2316.method2627(35, null);
        this.field2316.method2625(20296, 0);
    }

    @OriginalMember(owner = "client!af", name = "E", descriptor = "()I", line = 286)
    public final int method530() {
        field2329++;
        return this.field2335.field74;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V", line = 298)
    public static void method996(int arg0) {
        if (arg0 == 302678168) {
            field2320 = null;
            field2333 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "YA", descriptor = "(IIIIIIII)V", line = 309)
    public final void method213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2336++;
        this.field2335.method1582(123, (arg7 & 0x1) != 0);
        this.field2316.method2629((byte) -118);
        this.field2316.method2644(arg6, (byte) 79);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field2323) {
            float var9 = (float) arg2 / (float) this.method523();
            float var10 = (float) arg3 / (float) this.method532();
            float var11 = (float) this.field2332 * var9 + (float) arg0;
            float var12 = (float) this.field2331 * var10 + (float) arg1;
            float var13 = (float) this.field2335.field74 * var9 + var11;
            float var14 = (float) this.field2335.field71 * var10 + var12;
            if (this.field2342 == null) {
                this.field2316.method2627(66, this.field2335);
                this.field2316.method2650((byte) -92, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field2335.field73);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field2335.field75, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field2335.field75, this.field2335.field73);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method997(1, arg4);
                this.field2342.method1582(122, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field2335.field73);
                OpenGL.glTexCoord2f(0.0F, this.field2335.field73);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field2335.field75, 0.0F);
                OpenGL.glTexCoord2f(this.field2335.field75, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field2335.field75, this.field2335.field73);
                OpenGL.glTexCoord2f(this.field2335.field75, this.field2335.field73);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method994((byte) 106);
            }
        } else if (this.field2342 == null) {
            this.field2316.method2627(28, this.field2335);
            this.field2316.method2650((byte) -103, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field2335.field73);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field2335.field75, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field2335.field75, this.field2335.field73);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method997(1, arg4);
            this.field2342.method1582(124, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field2335.field73);
            OpenGL.glTexCoord2f(0.0F, this.field2335.field73);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field2335.field75, 0.0F);
            OpenGL.glTexCoord2f(this.field2335.field75, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field2335.field75, this.field2335.field73);
            OpenGL.glTexCoord2f(this.field2335.field75, this.field2335.field73);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method994((byte) 106);
        }
    }

    @OriginalMember(owner = "client!af", name = "DA", descriptor = "(IIIIIII)V", line = 413)
    public final void method531(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2322++;
        int var8 = arg0 + arg2;
        this.field2335.method1582(127, false);
        int var9 = arg1 + arg3;
        this.field2316.method2629((byte) -116);
        this.field2316.method2627(26, this.field2335);
        this.field2316.method2644(arg6, (byte) 79);
        this.field2316.method2650((byte) -65, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field2335.field72 && !this.field2323) {
            float var10 = (float) arg3 * this.field2335.field73 / (float) this.field2335.field71;
            float var11 = (float) arg2 * this.field2335.field75 / (float) this.field2335.field74;
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
        OpenGL.glTranslatef((float) this.field2332, (float) this.field2331, 0.0F);
        int var12 = this.method523();
        int var13 = this.method532();
        int var14 = this.field2335.field71 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = this.field2335.field74 + arg0;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field2335.field73);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field2335.field75, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field2335.field75, this.field2335.field73);
                OpenGL.glVertex2i(var20, var15);
                var20 += var12;
                var21 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field2335.field75 / (float) this.field2335.field74;
                OpenGL.glTexCoord2f(0.0F, this.field2335.field73);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field2335.field73);
                OpenGL.glVertex2i(var8, var15);
            }
            var14 += var13;
            var15 += var13;
        }
        if (var15 < var9) {
            float var16 = (float) (this.field2335.field71 + var15 - var9) * this.field2335.field73 / (float) this.field2335.field71;
            int var17 = this.field2335.field74 + arg0;
            int var18 = arg0;
            while (var8 >= var17) {
                OpenGL.glTexCoord2f(0.0F, this.field2335.field73);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field2335.field75, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field2335.field75, this.field2335.field73);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field2335.field75 / (float) this.field2335.field74;
                OpenGL.glTexCoord2f(0.0F, this.field2335.field73);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field2335.field73);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(FFFFFFILua;II)V", line = 557)
    public final void method524(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class596 arg7, int arg8, int arg9) {
        field2337++;
        class8 var11 = ((class516) arg7).field7173;
        if (this.field2323) {
            float var12 = (float) this.method523();
            float var13 = (float) this.method532();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field2331 * var16;
            float var19 = (float) this.field2331 * var17;
            float var20 = (float) this.field2332 * var14;
            float var21 = (float) this.field2332 * var15;
            float var22 = (float) this.field2339 * -var14;
            float var23 = (float) this.field2339 * -var15;
            float var24 = (float) this.field2334 * -var16;
            arg4 = arg4 + var20 + var24;
            arg0 = arg0 + var20 + var18;
            float var25 = (float) this.field2334 * -var17;
            arg2 = arg2 + var22 + var18;
            arg1 = arg1 + var21 + var19;
            arg3 = arg3 + var23 + var19;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        float var27 = arg5 + arg3 - arg1;
        this.field2335.method1582(115, (arg6 & 0x1) != 0);
        this.field2316.method2629((byte) -123);
        this.field2316.method2627(56, this.field2335);
        this.field2316.method2650((byte) -118, 1);
        this.field2316.method2625(20296, 1);
        this.field2316.method2627(120, var11);
        this.field2316.method2669(8448, -128, 7681);
        this.field2316.method2636(0, 768, 34168, -105);
        this.field2316.method2644(1, (byte) 79);
        float var28 = var11.field75 / (float) var11.field74;
        float var29 = var11.field73 / (float) var11.field71;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field2335.field73);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg8) * var28, var11.field73 - ((arg1 - (float) arg9) * var29));
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg8) * var28, var11.field73 - ((arg5 - (float) arg9) * var29));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field2335.field75, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var26 - (float) arg8) * var28, var11.field73 - (var27 - (float) arg9) * var29);
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field2335.field75, this.field2335.field73);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg8) * var28, var11.field73 - (((float) (-arg9) + arg3) * var29));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field2316.method2636(0, 768, 5890, -120);
        this.field2316.method2650((byte) -92, 0);
        this.field2316.method2627(52, null);
        this.field2316.method2625(20296, 0);
    }

    @OriginalMember(owner = "client!af", name = "u", descriptor = "()I", line = 651)
    public final int method529() {
        field2318++;
        return this.field2335.field71;
    }

    @OriginalMember(owner = "client!af", name = "A", descriptor = "()I", line = 662)
    public final int method523() {
        field2340++;
        return this.field2335.field74 - (-this.field2339 - this.field2332);
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(II)V", line = 670)
    private final void method997(int arg0, int arg1) {
        this.field2316.method2625(20296, 1);
        field2338++;
        this.field2316.method2627(arg0 + 62, this.field2335);
        this.field2316.method2669(7681, -104, this.field2316.method2633(arg0 ^ 0x3, arg1));
        this.field2316.method2636(arg0, 768, 34167, -128);
        this.field2316.method2637(770, -513, 0, 34168);
        this.field2316.method2625(20296, 0);
        this.field2316.method2627(97, this.field2342);
        this.field2316.method2669(7681, -107, 34479);
        this.field2316.method2636(1, 768, 34166, -115);
        if (this.field2317 == 0) {
            this.field2316.method2680(0.0F, 0.5F, 0.5F, arg0 ^ 0x2301, 1.0F);
        } else if (this.field2317 == 1) {
            this.field2316.method2680(0.0F, 1.0F, 0.5F, 8960, 0.5F);
            return;
        } else if (this.field2317 == 2) {
            this.field2316.method2680(0.0F, 0.5F, 1.0F, 8960, 0.5F);
            return;
        } else if (this.field2317 == 3) {
            this.field2316.method2680(0.0F, 128.5F, 128.5F, 8960, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(II)Lrb;", line = 703)
    public static final class379 method998(int arg0, int arg1) {
        field2330++;
        class379[] var2 = class259.method1567(arg1 - 1);
        for (int var3 = arg1; var3 < var2.length; var3++) {
            class379 var4 = var2[var3];
            if (var4.field5019 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!af", name = "V", descriptor = "(IIIII)V", line = 726)
    public final void method217(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2335.method1582(116, false);
        field2321++;
        this.field2316.method2629((byte) -127);
        this.field2316.method2644(arg4, (byte) 79);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field2331 + arg1;
        int var7 = this.field2332 + arg0;
        if (this.field2342 == null) {
            this.field2316.method2627(66, this.field2335);
            this.field2316.method2650((byte) -68, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field2335.field73);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, this.field2335.field71 + var6);
            OpenGL.glTexCoord2f(this.field2335.field75, 0.0F);
            OpenGL.glVertex2i(this.field2335.field74 + var7, var6 - -this.field2335.field71);
            OpenGL.glTexCoord2f(this.field2335.field75, this.field2335.field73);
            OpenGL.glVertex2i(var7 + this.field2335.field74, var6);
            OpenGL.glEnd();
            return;
        }
        this.method997(1, arg2);
        this.field2342.method1582(121, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field2335.field73);
        OpenGL.glTexCoord2f(0.0F, this.field2335.field73);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, this.field2335.field71 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field2335.field75, 0.0F);
        OpenGL.glTexCoord2f(this.field2335.field75, 0.0F);
        OpenGL.glVertex2i(var7 + this.field2335.field74, this.field2335.field71 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field2335.field75, this.field2335.field73);
        OpenGL.glTexCoord2f(this.field2335.field75, this.field2335.field73);
        OpenGL.glVertex2i(this.field2335.field74 + var7, var6);
        OpenGL.glEnd();
        this.method994((byte) 106);
    }
}
