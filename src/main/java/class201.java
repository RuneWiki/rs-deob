import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class201 extends class534 {

    @OriginalMember(owner = "client!be", name = "d", descriptor = "Z")
    private boolean field2362 = false;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    private int field2359 = 0;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    private int field2360 = 0;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    private int field2377 = 0;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "I")
    private int field2384 = 0;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "I")
    private int field2383 = 0;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "Lvj;")
    private class422 field2366;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "Lbr;")
    public class196 field2378;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    public static int field2381 = -1;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "Lcq;")
    public static class110 field2364 = new class110(34, 6);

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!be", name = "A", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!be", name = "B", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!be", name = "C", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Lbr;")
    private class196 field2363;

    @OriginalMember(owner = "client!be", name = "da", descriptor = "(IIIIII)V", line = 5)
    public final void method485(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2378.method3146(arg4, arg3, 0, arg1, arg5, arg0, arg2);
        field2379++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 17)
    public static void method1201(int arg0) {
        field2364 = null;
        if (arg0 != 33985) {
            method1202(36, 93, true, null, 52, -58, -119);
        }
    }

    @OriginalMember(owner = "client!be", name = "A", descriptor = "()I", line = 27)
    public final int method312() {
        field2382++;
        return this.field2378.field2262 + this.field2359 + this.field2383;
    }

    @OriginalMember(owner = "client!be", name = "xa", descriptor = "(III)V", line = 38)
    public final void method488(int arg0, int arg1, int arg2) {
        field2368++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field2363 = class400.method2251(arg1, this.field2366, arg0, this.field2378.field2261, this.field2378.field2262, 106);
        this.field2360 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(FFFFFFILua;II)V", line = 61)
    public final void method302(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class598 arg7, int arg8, int arg9) {
        field2371++;
        class196 var11 = ((class417) arg7).field5585;
        if (this.field2362) {
            float var12 = (float) this.method312();
            float var13 = (float) this.method304();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field2377 * var16;
            float var19 = (float) this.field2377 * var17;
            float var20 = (float) this.field2359 * var14;
            float var21 = (float) this.field2359 * var15;
            float var22 = (float) this.field2383 * -var14;
            float var23 = (float) this.field2383 * -var15;
            float var24 = (float) this.field2384 * -var16;
            arg0 = arg0 + var20 + var18;
            arg2 = arg2 + var22 + var18;
            float var25 = (float) this.field2384 * -var17;
            arg3 = arg3 + var23 + var19;
            arg1 = arg1 + var21 + var19;
            arg4 = arg4 + var20 + var24;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        float var27 = arg5 + arg3 - arg1;
        this.field2378.method1839((arg6 & 0x1) != 0, (byte) 79);
        this.field2366.method2397(39);
        this.field2366.method2396((byte) 36, this.field2378);
        this.field2366.method2421(1, 1);
        this.field2366.method2431((byte) -77, 1);
        this.field2366.method2396((byte) 36, var11);
        this.field2366.method2412((byte) -49, 7681, 8448);
        this.field2366.method2428(768, 34168, 0, -4);
        this.field2366.method2386(122, 1);
        float var28 = var11.field2266 / (float) var11.field2262;
        float var29 = var11.field2267 / (float) var11.field2261;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field2378.field2267);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg8) * var28, var11.field2267 - (arg1 - (float) arg9) * var29);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg8) * var28, var11.field2267 - ((arg5 - (float) arg9) * var29));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field2378.field2266, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + var26) * var28, var11.field2267 - (var27 - (float) arg9) * var29);
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field2378.field2266, this.field2378.field2267);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg8) * var28, var11.field2267 - (((float) (-arg9) + arg3) * var29));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field2366.method2428(768, 5890, 0, -4);
        this.field2366.method2421(0, 1);
        this.field2366.method2396((byte) 36, null);
        this.field2366.method2431((byte) -43, 0);
    }

    @OriginalMember(owner = "client!be", name = "V", descriptor = "(IIIII)V", line = 150)
    public final void method314(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2376++;
        this.field2378.method1839(false, (byte) 44);
        this.field2366.method2397(77);
        this.field2366.method2386(125, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field2377 + arg1;
        int var7 = this.field2359 + arg0;
        if (this.field2363 == null) {
            this.field2366.method2396((byte) 36, this.field2378);
            this.field2366.method2421(arg2, 1);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field2378.field2267);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, this.field2378.field2261 + var6);
            OpenGL.glTexCoord2f(this.field2378.field2266, 0.0F);
            OpenGL.glVertex2i(this.field2378.field2262 + var7, this.field2378.field2261 + var6);
            OpenGL.glTexCoord2f(this.field2378.field2266, this.field2378.field2267);
            OpenGL.glVertex2i(this.field2378.field2262 + var7, var6);
            OpenGL.glEnd();
            return;
        }
        this.method1203(arg2, (byte) 125);
        this.field2363.method1839(false, (byte) 35);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field2378.field2267);
        OpenGL.glTexCoord2f(0.0F, this.field2378.field2267);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, this.field2378.field2261 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field2378.field2266, 0.0F);
        OpenGL.glTexCoord2f(this.field2378.field2266, 0.0F);
        OpenGL.glVertex2i(this.field2378.field2262 + var7, var6 - -this.field2378.field2261);
        OpenGL.glMultiTexCoord2f(33985, this.field2378.field2266, this.field2378.field2267);
        OpenGL.glTexCoord2f(this.field2378.field2266, this.field2378.field2267);
        OpenGL.glVertex2i(this.field2378.field2262 + var7, var6);
        OpenGL.glEnd();
        this.method1205(0);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIZLtf;III)V", line = 207)
    public static final void method1202(int arg0, int arg1, boolean arg2, class701 arg3, int arg4, int arg5, int arg6) {
        if (arg5 > 0) {
            class168.field1878 = arg6;
            class597.field8420 = arg0;
            class369.field5053 = arg4;
            class370.field5061 = arg2;
            class25.field217 = arg3;
            class258.field3249 = 1;
            class469.field6710 = class291.field3642.method524((byte) -45) / arg5;
            if (class469.field6710 < 1) {
                class469.field6710 = 1;
            }
        } else {
            class193.method1175(0, arg0, arg3, arg4, arg6, arg2);
        }
        if (arg1 != 30127) {
            field2364 = null;
        }
        field2367++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IILua;II)V", line = 236)
    public final void method301(int arg0, int arg1, class598 arg2, int arg3, int arg4) {
        field2374++;
        class417 var6 = (class417) arg2;
        class196 var7 = var6.field5585;
        this.field2378.method1839(false, (byte) 45);
        this.field2366.method2397(102);
        this.field2366.method2396((byte) 36, this.field2378);
        this.field2366.method2421(1, 1);
        this.field2366.method2431((byte) -106, 1);
        this.field2366.method2396((byte) 36, var7);
        this.field2366.method2412((byte) -49, 7681, 8448);
        this.field2366.method2428(768, 34168, 0, -4);
        this.field2366.method2386(125, 1);
        int var8 = this.field2377 + arg1;
        int var9 = this.field2359 + arg0;
        int var10 = var9 + this.field2378.field2262;
        int var11 = this.field2378.field2261 + var8;
        float var12 = var7.field2266 / (float) var7.field2262;
        float var13 = var7.field2267 / (float) var7.field2261;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field2267 - (float) (var8 - arg4) * var13;
        float var17 = var7.field2267 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field2378.field2267);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, this.field2378.field2261 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field2378.field2266, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field2378.field2262 + var9, var8 - -this.field2378.field2261);
        OpenGL.glMultiTexCoord2f(33984, this.field2378.field2266, this.field2378.field2267);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(var9 + this.field2378.field2262, var8);
        OpenGL.glEnd();
        this.field2366.method2428(768, 5890, 0, -4);
        this.field2366.method2421(0, 1);
        this.field2366.method2396((byte) 36, null);
        this.field2366.method2431((byte) -125, 0);
    }

    @OriginalMember(owner = "client!be", name = "E", descriptor = "()I", line = 295)
    public final int method315() {
        field2375++;
        return this.field2378.field2262;
    }

    @OriginalMember(owner = "client!be", name = "u", descriptor = "()I", line = 304)
    public final int method306() {
        field2385++;
        return this.field2378.field2261;
    }

    @OriginalMember(owner = "client!be", name = "Q", descriptor = "(IIII)V", line = 313)
    public final void method313(int arg0, int arg1, int arg2, int arg3) {
        this.field2359 = arg0;
        field2370++;
        this.field2377 = arg1;
        this.field2383 = arg2;
        this.field2384 = arg3;
        this.field2362 = this.field2359 != 0 || this.field2377 != 0 || this.field2383 != 0 || this.field2384 != 0;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)V", line = 325)
    private final void method1203(int arg0, byte arg1) {
        int var3 = 59 / ((arg1 + 33) / 40);
        field2386++;
        this.field2366.method2431((byte) -34, 1);
        this.field2366.method2396((byte) 36, this.field2378);
        this.field2366.method2412((byte) -49, this.field2366.method2389(arg0, 2), 7681);
        this.field2366.method2428(768, 34167, 1, -4);
        this.field2366.method2371(770, 0, -83, 34168);
        this.field2366.method2431((byte) -59, 0);
        this.field2366.method2396((byte) 36, this.field2363);
        this.field2366.method2412((byte) -49, 34479, 7681);
        this.field2366.method2428(768, 34166, 1, -4);
        if (this.field2360 == 0) {
            this.field2366.method2361(0.5F, (byte) -122, 1.0F, 0.0F, 0.5F);
        } else if (this.field2360 == 1) {
            this.field2366.method2361(1.0F, (byte) -122, 0.5F, 0.0F, 0.5F);
        } else if (this.field2360 == 2) {
            this.field2366.method2361(0.5F, (byte) -122, 0.5F, 0.0F, 1.0F);
        } else if (this.field2360 == 3) {
            this.field2366.method2361(128.5F, (byte) -122, 128.5F, 0.0F, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lvj;IIZ)V", line = 751)
    public class201(class422 arg0, int arg1, int arg2, boolean arg3) {
        this.field2366 = arg0;
        this.field2378 = class189.method1151(arg2, arg0, (byte) 88, arg3 ? 6408 : 6407, arg1);
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lvj;IIII)V", line = 761)
    public class201(class422 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2366 = arg0;
        this.field2378 = class400.method2251(arg2, arg0, arg1, arg4, arg3, -117);
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lvj;II[III)V", line = 771)
    public class201(class422 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field2366 = arg0;
        this.field2378 = class530.method2976(arg2, arg1, arg0, true, arg3, false);
    }

    @OriginalMember(owner = "client!be", name = "qa", descriptor = "(FFFFFFIIII)V", line = 367)
    public final void method310(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field2362) {
            float var11 = (float) this.method312();
            float var12 = (float) this.method304();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field2377 * var15;
            float var18 = (float) this.field2377 * var16;
            float var19 = (float) this.field2359 * var13;
            float var20 = (float) this.field2359 * var14;
            float var21 = (float) this.field2383 * -var13;
            float var22 = (float) this.field2383 * -var14;
            float var23 = (float) this.field2384 * -var15;
            arg2 = arg2 + var21 + var17;
            arg4 = arg4 + var19 + var23;
            arg3 = arg3 + var22 + var18;
            float var24 = (float) this.field2384 * -var16;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg5 = arg5 + var20 + var24;
        }
        field2372++;
        float var25 = arg2 + arg4 - arg0;
        this.field2378.method1839((arg9 & 0x1) != 0, (byte) 101);
        float var26 = arg5 + arg3 - arg1;
        this.field2366.method2397(86);
        this.field2366.method2396((byte) 36, this.field2378);
        this.field2366.method2386(122, arg8);
        this.field2366.method2421(arg6, 1);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field2378.field2267);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field2378.field2266, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field2378.field2266, this.field2378.field2267);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!be", name = "DA", descriptor = "(IIIIIII)V", line = 436)
    public final void method307(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2369++;
        int var8 = arg0 + arg2;
        int var9 = arg1 + arg3;
        this.field2378.method1839(false, (byte) 43);
        this.field2366.method2397(93);
        this.field2366.method2396((byte) 36, this.field2378);
        this.field2366.method2386(127, arg6);
        this.field2366.method2421(arg4, 1);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field2378.field2264 && !this.field2362) {
            float var10 = (float) arg3 * this.field2378.field2267 / (float) this.field2378.field2261;
            float var11 = (float) arg2 * this.field2378.field2266 / (float) this.field2378.field2262;
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
        OpenGL.glTranslatef((float) this.field2359, (float) this.field2377, 0.0F);
        int var12 = this.method312();
        int var13 = this.method304();
        int var14 = this.field2378.field2261 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = this.field2378.field2262 + arg0;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field2378.field2267);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field2378.field2266, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field2378.field2266, this.field2378.field2267);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field2378.field2266 / (float) this.field2378.field2262;
                OpenGL.glTexCoord2f(0.0F, this.field2378.field2267);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field2378.field2267);
                OpenGL.glVertex2i(var8, var15);
            }
            var14 += var13;
            var15 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (this.field2378.field2261 + var15 - var9) * this.field2378.field2267 / (float) this.field2378.field2261;
            int var17 = this.field2378.field2262 + arg0;
            int var18 = arg0;
            while (var8 >= var17) {
                OpenGL.glTexCoord2f(0.0F, this.field2378.field2267);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field2378.field2266, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field2378.field2266, this.field2378.field2267);
                OpenGL.glVertex2i(var17, var15);
                var18 += var12;
                var17 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field2378.field2266 / (float) this.field2378.field2262;
                OpenGL.glTexCoord2f(0.0F, this.field2378.field2267);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field2378.field2267);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z[J[I)V", line = 571)
    public static final void method1204(boolean arg0, long[] arg1, int[] arg2) {
        if (!arg0) {
            class593.method3338(123, 0, arg2, arg1.length - 1, arg1);
            field2373++;
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V", line = 585)
    private final void method1205(int arg0) {
        this.field2366.method2431((byte) -114, 1);
        field2365++;
        this.field2366.method2396((byte) 36, null);
        this.field2366.method2412((byte) -49, 8448, 8448);
        this.field2366.method2428(768, 34168, 1, -4);
        this.field2366.method2371(770, 0, -54, 5890);
        this.field2366.method2431((byte) -46, arg0);
        this.field2366.method2428(768, 34168, 1, -4);
    }

    @OriginalMember(owner = "client!be", name = "ca", descriptor = "()I", line = 602)
    public final int method304() {
        field2387++;
        return this.field2378.field2261 + this.field2377 + this.field2384;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)I", line = 615)
    public static final int method1206(int arg0) {
        if (arg0 < 54) {
            return 112;
        }
        field2380++;
        if (class619.field8759 == null) {
            return class633.field8927 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!be", name = "YA", descriptor = "(IIIIIIII)V", line = 644)
    public final void method311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field2378.method1839((arg7 & 0x1) != 0, (byte) 68);
        field2361++;
        this.field2366.method2397(71);
        this.field2366.method2386(124, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field2362) {
            float var9 = (float) arg2 / (float) this.method312();
            float var10 = (float) arg3 / (float) this.method304();
            float var11 = (float) this.field2359 * var9 + (float) arg0;
            float var12 = (float) this.field2377 * var10 + (float) arg1;
            float var13 = (float) this.field2378.field2262 * var9 + var11;
            float var14 = (float) this.field2378.field2261 * var10 + var12;
            if (this.field2363 == null) {
                this.field2366.method2396((byte) 36, this.field2378);
                this.field2366.method2421(arg4, 1);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field2378.field2267);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field2378.field2266, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field2378.field2266, this.field2378.field2267);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method1203(arg4, (byte) -127);
                this.field2363.method1839(true, (byte) 95);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field2378.field2267);
                OpenGL.glTexCoord2f(0.0F, this.field2378.field2267);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field2378.field2266, 0.0F);
                OpenGL.glTexCoord2f(this.field2378.field2266, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field2378.field2266, this.field2378.field2267);
                OpenGL.glTexCoord2f(this.field2378.field2266, this.field2378.field2267);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method1205(0);
            }
        } else if (this.field2363 == null) {
            this.field2366.method2396((byte) 36, this.field2378);
            this.field2366.method2421(arg4, 1);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field2378.field2267);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field2378.field2266, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field2378.field2266, this.field2378.field2267);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method1203(arg4, (byte) 30);
            this.field2363.method1839(true, (byte) 54);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field2378.field2267);
            OpenGL.glTexCoord2f(0.0F, this.field2378.field2267);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field2378.field2266, 0.0F);
            OpenGL.glTexCoord2f(this.field2378.field2266, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field2378.field2266, this.field2378.field2267);
            OpenGL.glTexCoord2f(this.field2378.field2266, this.field2378.field2267);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method1205(0);
        }
    }
}
