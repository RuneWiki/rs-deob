import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class162 extends class52 {

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    private int field1968 = 0;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    private int field1976 = 0;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    private int field1981 = 0;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
    private int field1983 = 0;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "Z")
    private boolean field1991 = false;

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "I")
    private int field1992 = 0;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "Lmh;")
    private class537 field1977;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "Lwo;")
    private class632 field1989;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
    public static int field1978 = 1;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!kk", name = "B", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "Laba;")
    public static class150 field1966;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "Lwo;")
    private class632 field1979;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1975;

    @OriginalMember(owner = "client!kk", name = "BA", descriptor = "(III)V", line = 4)
    public final void method5(int arg0, int arg1, int arg2) {
        OpenGL.glPixelTransferf(3348, 0.5F);
        field1967++;
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field1979 = class502.method2899(this.field1977, this.field1989.field9099, (byte) -93, arg0, arg1, this.field1989.field9109);
        this.field1983 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!kk", name = "ra", descriptor = "(IIIIIII)V", line = 29)
    public final void method6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1993++;
        this.field1989.method1358((byte) 96, true);
        this.field1977.method3100(5196);
        this.field1977.method3058((byte) -119, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field1991) {
            float var8 = (float) arg2 / (float) this.method292();
            float var9 = (float) arg3 / (float) this.method286();
            float var10 = (float) this.field1981 * var8 + (float) arg0;
            float var11 = (float) this.field1976 * var9 + (float) arg1;
            float var12 = (float) this.field1989.field9109 * var8 + var10;
            float var13 = (float) this.field1989.field9099 * var9 + var11;
            if (this.field1979 == null) {
                this.field1977.method3083((byte) 123, this.field1989);
                this.field1977.method3063(arg4, (byte) -107);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field1989.field9101);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field1989.field9100, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field1989.field9100, this.field1989.field9101);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method888(arg4, -41);
                this.field1979.method1358((byte) 117, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field1989.field9101);
                OpenGL.glTexCoord2f(0.0F, this.field1989.field9101);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field1989.field9100, 0.0F);
                OpenGL.glTexCoord2f(this.field1989.field9100, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field1989.field9100, this.field1989.field9101);
                OpenGL.glTexCoord2f(this.field1989.field9100, this.field1989.field9101);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method887(true);
            }
        } else if (this.field1979 == null) {
            this.field1977.method3083((byte) 99, this.field1989);
            this.field1977.method3063(arg4, (byte) -107);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field1989.field9101);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field1989.field9100, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field1989.field9100, this.field1989.field9101);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method888(arg4, -50);
            this.field1979.method1358((byte) -76, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field1989.field9101);
            OpenGL.glTexCoord2f(0.0F, this.field1989.field9101);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field1989.field9100, 0.0F);
            OpenGL.glTexCoord2f(this.field1989.field9100, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field1989.field9100, this.field1989.field9101);
            OpenGL.glTexCoord2f(this.field1989.field9100, this.field1989.field9101);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method887(true);
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(IIII)I", line = 136)
    public static final int method886(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > 243) {
            arg1 >>= 0x4;
        } else if (arg2 > 217) {
            arg1 >>= 0x3;
        } else if (arg2 > 192) {
            arg1 >>= 0x2;
        } else if (arg2 > 179) {
            arg1 >>= 0x1;
        }
        field1990++;
        return arg3 == 4 ? (arg2 >> 1) + (arg1 >> 5 << 7) + ((arg0 >> 2 & 0x3F) << 10) : 72;
    }

    @OriginalMember(owner = "client!kk", name = "DA", descriptor = "(IIIII)V", line = 163)
    public final void method3(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1969++;
        this.field1989.method1358((byte) -126, false);
        this.field1977.method3100(5196);
        this.field1977.method3058((byte) -116, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field1981 + arg0;
        int var7 = this.field1976 + arg1;
        if (this.field1979 == null) {
            this.field1977.method3083((byte) 110, this.field1989);
            this.field1977.method3063(arg2, (byte) -107);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field1989.field9101);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, this.field1989.field9099 + var7);
            OpenGL.glTexCoord2f(this.field1989.field9100, 0.0F);
            OpenGL.glVertex2i(this.field1989.field9109 + var6, this.field1989.field9099 + var7);
            OpenGL.glTexCoord2f(this.field1989.field9100, this.field1989.field9101);
            OpenGL.glVertex2i(this.field1989.field9109 + var6, var7);
            OpenGL.glEnd();
            return;
        }
        this.method888(arg2, -69);
        this.field1979.method1358((byte) -78, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field1989.field9101);
        OpenGL.glTexCoord2f(0.0F, this.field1989.field9101);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, this.field1989.field9099 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field1989.field9100, 0.0F);
        OpenGL.glTexCoord2f(this.field1989.field9100, 0.0F);
        OpenGL.glVertex2i(this.field1989.field9109 + var6, this.field1989.field9099 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field1989.field9100, this.field1989.field9101);
        OpenGL.glTexCoord2f(this.field1989.field9100, this.field1989.field9101);
        OpenGL.glVertex2i(this.field1989.field9109 + var6, var7);
        OpenGL.glEnd();
        this.method887(true);
    }

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "(IIIIIII)V", line = 214)
    public final void method296(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1986++;
        int var8 = arg0 + arg2;
        this.field1989.method1358((byte) -68, false);
        int var9 = arg1 + arg3;
        this.field1977.method3100(5196);
        this.field1977.method3083((byte) 92, this.field1989);
        this.field1977.method3058((byte) -113, arg6);
        this.field1977.method3063(arg4, (byte) -107);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field1989.field9103 && !this.field1991) {
            float var10 = (float) arg3 * this.field1989.field9101 / (float) this.field1989.field9099;
            float var11 = (float) arg2 * this.field1989.field9100 / (float) this.field1989.field9109;
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
        OpenGL.glTranslatef((float) this.field1981, (float) this.field1976, 0.0F);
        int var12 = this.method292();
        int var13 = this.method286();
        int var14 = this.field1989.field9099 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var9 >= var14) {
            int var20 = this.field1989.field9109 + arg0;
            int var21 = arg0;
            while (var8 >= var20) {
                OpenGL.glTexCoord2f(0.0F, this.field1989.field9101);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field1989.field9100, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field1989.field9100, this.field1989.field9101);
                OpenGL.glVertex2i(var20, var15);
                var20 += var12;
                var21 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field1989.field9100 / (float) this.field1989.field9109;
                OpenGL.glTexCoord2f(0.0F, this.field1989.field9101);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field1989.field9101);
                OpenGL.glVertex2i(var8, var15);
            }
            var14 += var13;
            var15 += var13;
        }
        if (var15 < var9) {
            float var16 = (float) (var15 + this.field1989.field9099 - var9) * this.field1989.field9101 / (float) this.field1989.field9099;
            int var17 = this.field1989.field9109 + arg0;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field1989.field9101);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field1989.field9100, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field1989.field9100, this.field1989.field9101);
                OpenGL.glVertex2i(var17, var15);
                var18 += var12;
                var17 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field1989.field9100 / (float) this.field1989.field9109;
                OpenGL.glTexCoord2f(0.0F, this.field1989.field9101);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field1989.field9101);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)V", line = 352)
    private final void method887(boolean arg0) {
        if (!arg0) {
            field1966 = null;
        }
        field1970++;
        this.field1977.method3078(33984, 1);
        this.field1977.method3083((byte) 75, null);
        this.field1977.method3099(8448, 8448, 8);
        this.field1977.method3126(false, 1, 768, 34168);
        this.field1977.method3098(770, 0, (byte) 14, 5890);
        this.field1977.method3078(33984, 0);
        this.field1977.method3126(false, 1, 768, 34168);
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lmh;IIII)V", line = 727)
    public class162(class537 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1977 = arg0;
        this.field1989 = class502.method2899(arg0, arg4, (byte) -93, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lmh;II[III)V", line = 738)
    public class162(class537 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field1977 = arg0;
        this.field1989 = class295.method1648(arg1, arg2, arg3, (byte) -45, arg0, false);
    }

    @OriginalMember(owner = "client!kk", name = "CA", descriptor = "(FFFFFFIII)V", line = 378)
    public final void method285(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field1991) {
            float var10 = (float) this.method292();
            float var11 = (float) this.method286();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field1976 * var14;
            float var17 = (float) this.field1976 * var15;
            float var18 = (float) this.field1981 * var12;
            float var19 = (float) this.field1981 * var13;
            float var20 = (float) this.field1968 * -var12;
            float var21 = (float) this.field1968 * -var13;
            float var22 = (float) this.field1992 * -var14;
            arg4 = arg4 + var18 + var22;
            arg0 = arg0 + var18 + var16;
            arg1 = arg1 + var19 + var17;
            float var23 = (float) this.field1992 * -var15;
            arg3 = arg3 + var21 + var17;
            arg2 = arg2 + var20 + var16;
            arg5 = arg5 + var19 + var23;
        }
        field1973++;
        float var24 = arg2 + arg4 - arg0;
        this.field1989.method1358((byte) -78, true);
        float var25 = arg5 + arg3 - arg1;
        this.field1977.method3100(5196);
        this.field1977.method3083((byte) 96, this.field1989);
        this.field1977.method3058((byte) -113, arg8);
        this.field1977.method3063(arg6, (byte) -107);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field1989.field9101);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field1989.field9100, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field1989.field9100, this.field1989.field9101);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)V", line = 446)
    private final void method888(int arg0, int arg1) {
        field1971++;
        this.field1977.method3078(33984, 1);
        this.field1977.method3083((byte) 111, this.field1989);
        this.field1977.method3099(7681, this.field1977.method3133(arg0, 3790), 8);
        this.field1977.method3126(false, 1, 768, 34167);
        this.field1977.method3098(770, 0, (byte) 14, 34168);
        this.field1977.method3078(33984, 0);
        this.field1977.method3083((byte) 84, this.field1979);
        if (arg1 >= -18) {
            return;
        }
        this.field1977.method3099(7681, 34479, 8);
        this.field1977.method3126(false, 1, 768, 34166);
        if (this.field1983 == 0) {
            this.field1977.method3129(8705, 0.0F, 1.0F, 0.5F, 0.5F);
        } else if (this.field1983 == 1) {
            this.field1977.method3129(8705, 0.0F, 0.5F, 0.5F, 1.0F);
        } else if (this.field1983 == 2) {
            this.field1977.method3129(8705, 0.0F, 0.5F, 1.0F, 0.5F);
        } else if (this.field1983 == 3) {
            this.field1977.method3129(8705, 0.0F, 128.5F, 128.5F, 128.5F);
        }
    }

    @OriginalMember(owner = "client!kk", name = "ma", descriptor = "()I", line = 491)
    public final int method286() {
        field1982++;
        return this.field1989.field9099 + this.field1976 + this.field1992;
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "()I", line = 499)
    public final int method291() {
        field1980++;
        return this.field1989.field9109;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(FFFFFFLpa;II)V", line = 512)
    public final void method298(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class309 arg6, int arg7, int arg8) {
        field1972++;
        class632 var10 = ((class33) arg6).field257;
        if (this.field1991) {
            float var11 = (float) this.method292();
            float var12 = (float) this.method286();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field1976 * var15;
            float var18 = (float) this.field1976 * var16;
            float var19 = (float) this.field1981 * var13;
            float var20 = (float) this.field1981 * var14;
            float var21 = (float) this.field1968 * -var13;
            float var22 = (float) this.field1968 * -var14;
            float var23 = (float) this.field1992 * -var15;
            float var24 = (float) this.field1992 * -var16;
            arg3 = arg3 + var22 + var18;
            arg1 = arg1 + var20 + var18;
            arg4 = arg4 + var19 + var23;
            arg2 = arg2 + var21 + var17;
            arg0 = arg0 + var19 + var17;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        this.field1989.method1358((byte) -112, true);
        float var26 = arg5 + arg3 - arg1;
        this.field1977.method3100(5196);
        this.field1977.method3083((byte) 93, this.field1989);
        this.field1977.method3063(1, (byte) -107);
        this.field1977.method3078(33984, 1);
        this.field1977.method3083((byte) 88, var10);
        this.field1977.method3099(8448, 7681, 8);
        this.field1977.method3126(false, 0, 768, 34168);
        this.field1977.method3058((byte) -127, 1);
        float var27 = var10.field9100 / (float) var10.field9109;
        float var28 = var10.field9101 / (float) var10.field9099;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field1989.field9101);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg0) * var27, var10.field9101 - (arg1 - (float) arg8) * var28);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var27, var10.field9101 - ((arg5 - (float) arg8) * var28));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field1989.field9100, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var27, var10.field9101 - (var26 - (float) arg8) * var28);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field1989.field9100, this.field1989.field9101);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var27, var10.field9101 - ((arg3 - (float) arg8) * var28));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field1977.method3126(false, 0, 768, 5890);
        this.field1977.method3063(0, (byte) -107);
        this.field1977.method3083((byte) 73, null);
        this.field1977.method3078(33984, 0);
    }

    @OriginalMember(owner = "client!kk", name = "P", descriptor = "(IIIIII)V", line = 602)
    public final void method4(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1985++;
        this.field1989.method1672(arg2, -12, arg0, arg5, arg1, arg4, arg3);
    }

    @OriginalMember(owner = "client!kk", name = "la", descriptor = "()I", line = 612)
    public final int method290() {
        field1974++;
        return this.field1989.field9099;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V", line = 622)
    public static void method889(int arg0) {
        field1975 = null;
        if (arg0 != 3355) {
            method889(-37);
        }
        field1966 = null;
    }

    @OriginalMember(owner = "client!kk", name = "KA", descriptor = "(IIII)V", line = 638)
    public final void method297(int arg0, int arg1, int arg2, int arg3) {
        this.field1976 = arg1;
        field1987++;
        this.field1968 = arg2;
        this.field1981 = arg0;
        this.field1992 = arg3;
        this.field1991 = this.field1981 != 0 || this.field1976 != 0 || this.field1968 != 0 || this.field1992 != 0;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IILpa;II)V", line = 653)
    public final void method7(int arg0, int arg1, class309 arg2, int arg3, int arg4) {
        field1988++;
        class33 var6 = (class33) arg2;
        class632 var7 = var6.field257;
        this.field1989.method1358((byte) -38, false);
        this.field1977.method3100(5196);
        this.field1977.method3083((byte) 96, this.field1989);
        this.field1977.method3063(1, (byte) -107);
        this.field1977.method3078(33984, 1);
        this.field1977.method3083((byte) 120, var7);
        this.field1977.method3099(8448, 7681, 8);
        this.field1977.method3126(false, 0, 768, 34168);
        this.field1977.method3058((byte) -116, 1);
        int var8 = this.field1981 + arg0;
        int var9 = this.field1976 + arg1;
        int var10 = this.field1989.field9109 + var8;
        int var11 = this.field1989.field9099 + var9;
        float var12 = var7.field9100 / (float) var7.field9109;
        float var13 = var7.field9101 / (float) var7.field9099;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field9101 - ((float) (var9 - arg4) * var13);
        float var17 = var7.field9101 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field1989.field9101);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var8, var9);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var8, this.field1989.field9099 + var9);
        OpenGL.glMultiTexCoord2f(33984, this.field1989.field9100, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field1989.field9109 + var8, this.field1989.field9099 + var9);
        OpenGL.glMultiTexCoord2f(33984, this.field1989.field9100, this.field1989.field9101);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field1989.field9109 + var8, var9);
        OpenGL.glEnd();
        this.field1977.method3126(false, 0, 768, 5890);
        this.field1977.method3063(0, (byte) -107);
        this.field1977.method3083((byte) 74, null);
        this.field1977.method3078(33984, 0);
    }

    @OriginalMember(owner = "client!kk", name = "EA", descriptor = "()I", line = 715)
    public final int method292() {
        field1984++;
        return this.field1981 + this.field1968 + this.field1989.field9109;
    }
}
