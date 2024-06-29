import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class485 extends class16 {

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "Z")
    private boolean field6982 = false;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    private int field6973 = 0;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    private int field6974 = 0;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
    private int field6980 = 0;

    @OriginalMember(owner = "client!vm", name = "p", descriptor = "I")
    private int field6987 = 0;

    @OriginalMember(owner = "client!vm", name = "z", descriptor = "I")
    private int field6997 = 0;

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "Lkd;")
    private class188 field6986;

    @OriginalMember(owner = "client!vm", name = "y", descriptor = "Loi;")
    private class53 field6996;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "Lkh;")
    public static class13 field6972 = new class13(8);

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field6976;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
    public static int field6977;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field6978;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
    public static int field6979;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
    public static int field6981;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "I")
    public static int field6984;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "I")
    public static int field6985;

    @OriginalMember(owner = "client!vm", name = "q", descriptor = "I")
    public static int field6988;

    @OriginalMember(owner = "client!vm", name = "r", descriptor = "I")
    public static int field6989;

    @OriginalMember(owner = "client!vm", name = "s", descriptor = "I")
    public static int field6990;

    @OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
    public static int field6991;

    @OriginalMember(owner = "client!vm", name = "u", descriptor = "I")
    public static int field6992;

    @OriginalMember(owner = "client!vm", name = "v", descriptor = "I")
    public static int field6993;

    @OriginalMember(owner = "client!vm", name = "w", descriptor = "I")
    public static int field6994;

    @OriginalMember(owner = "client!vm", name = "x", descriptor = "I")
    public static int field6995;

    @OriginalMember(owner = "client!vm", name = "A", descriptor = "I")
    public static int field6998;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "Loi;")
    private class53 field6983;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "[I")
    public static int[] field6975;

    @OriginalMember(owner = "client!vm", name = "ma", descriptor = "()I", line = 3)
    public final int method125() {
        field6976++;
        return this.field6996.field656;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(FFFFFFIII)V", line = 11)
    public final void method134(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field6982) {
            float var10 = (float) this.method129();
            float var11 = (float) this.method139();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field6974 * var14;
            float var17 = (float) this.field6974 * var15;
            float var18 = (float) this.field6980 * var12;
            float var19 = (float) this.field6980 * var13;
            float var20 = (float) this.field6973 * -var12;
            float var21 = (float) this.field6973 * -var13;
            float var22 = (float) this.field6997 * -var14;
            arg0 = arg0 + var18 + var16;
            arg1 = arg1 + var19 + var17;
            arg3 = arg3 + var21 + var17;
            float var23 = (float) this.field6997 * -var15;
            arg2 = arg2 + var20 + var16;
            arg4 = arg4 + var18 + var22;
            arg5 = arg5 + var19 + var23;
        }
        field6984++;
        float var24 = arg2 + arg4 - arg0;
        this.field6996.method2757(true, -113);
        float var25 = arg5 + arg3 - arg1;
        this.field6986.method1314(2);
        this.field6986.method1289(-19391, this.field6996);
        this.field6986.method1291(arg8, false);
        this.field6986.method1248(arg6, true);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field6996.field658);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field6996.field664, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field6996.field664, this.field6996.field658);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z)V", line = 82)
    private final void method2900(boolean arg0) {
        if (arg0) {
            field6972 = null;
        }
        this.field6986.method1307(1, (byte) 92);
        field6977++;
        this.field6986.method1289(-19391, null);
        this.field6986.method1242(34162, 8448, 8448);
        this.field6986.method1266(768, 1, 34168, 8960);
        this.field6986.method1296(770, 5890, 0, (byte) -92);
        this.field6986.method1307(0, (byte) 92);
        this.field6986.method1266(768, 1, 34168, 8960);
    }

    @OriginalMember(owner = "client!vm", name = "JA", descriptor = "(IIIIIII)V", line = 100)
    public final void method136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6992++;
        int var8 = arg0 + arg2;
        int var9 = arg1 + arg3;
        this.field6996.method2757(false, -103);
        this.field6986.method1314(2);
        this.field6986.method1289(-19391, this.field6996);
        this.field6986.method1291(arg6, false);
        this.field6986.method1248(arg4, true);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field6996.field662 && !this.field6982) {
            float var10 = (float) arg3 * this.field6996.field658 / (float) this.field6996.field656;
            float var11 = (float) arg2 * this.field6996.field664 / (float) this.field6996.field663;
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
        OpenGL.glTranslatef((float) this.field6980, (float) this.field6974, 0.0F);
        int var12 = this.method129();
        int var13 = this.method139();
        int var14 = this.field6996.field656 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var9 >= var14) {
            int var20 = arg0 + this.field6996.field663;
            int var21 = arg0;
            while (var8 >= var20) {
                OpenGL.glTexCoord2f(0.0F, this.field6996.field658);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field6996.field664, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field6996.field664, this.field6996.field658);
                OpenGL.glVertex2i(var20, var15);
                var20 += var12;
                var21 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field6996.field664 / (float) this.field6996.field663;
                OpenGL.glTexCoord2f(0.0F, this.field6996.field658);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field6996.field658);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (-var9 - (-var15 - this.field6996.field656)) * this.field6996.field658 / (float) this.field6996.field656;
            int var17 = this.field6996.field663 + arg0;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field6996.field658);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field6996.field664, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field6996.field664, this.field6996.field658);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field6996.field664 / (float) this.field6996.field663;
                OpenGL.glTexCoord2f(0.0F, this.field6996.field658);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field6996.field658);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "()I", line = 236)
    public final int method129() {
        field6978++;
        return this.field6996.field663 + this.field6980 + this.field6973;
    }

    @OriginalMember(owner = "client!vm", name = "t", descriptor = "(IIIIII)V", line = 248)
    public final void method140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6981++;
        this.field6996.method2268(true, arg1, arg5, arg2, arg3, arg0, arg4);
    }

    @OriginalMember(owner = "client!vm", name = "MA", descriptor = "(IIII)V", line = 258)
    public final void method130(int arg0, int arg1, int arg2, int arg3) {
        this.field6974 = arg1;
        field6991++;
        this.field6997 = arg3;
        this.field6973 = arg2;
        this.field6980 = arg0;
        this.field6982 = this.field6980 != 0 || this.field6974 != 0 || this.field6973 != 0 || this.field6997 != 0;
    }

    @OriginalMember(owner = "client!vm", name = "r", descriptor = "(IIIII)V", line = 270)
    public final void method141(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6996.method2757(false, -112);
        field6988++;
        this.field6986.method1314(2);
        this.field6986.method1291(arg4, false);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field6980 + arg0;
        int var7 = this.field6974 + arg1;
        if (this.field6983 == null) {
            this.field6986.method1289(-19391, this.field6996);
            this.field6986.method1248(arg2, true);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field6996.field658);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, this.field6996.field656 + var7);
            OpenGL.glTexCoord2f(this.field6996.field664, 0.0F);
            OpenGL.glVertex2i(this.field6996.field663 + var6, this.field6996.field656 + var7);
            OpenGL.glTexCoord2f(this.field6996.field664, this.field6996.field658);
            OpenGL.glVertex2i(this.field6996.field663 + var6, var7);
            OpenGL.glEnd();
            return;
        }
        this.method2903(arg2, -1485);
        this.field6983.method2757(false, -85);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field6996.field658);
        OpenGL.glTexCoord2f(0.0F, this.field6996.field658);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, this.field6996.field656 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field6996.field664, 0.0F);
        OpenGL.glTexCoord2f(this.field6996.field664, 0.0F);
        OpenGL.glVertex2i(this.field6996.field663 + var6, this.field6996.field656 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field6996.field664, this.field6996.field658);
        OpenGL.glTexCoord2f(this.field6996.field664, this.field6996.field658);
        OpenGL.glVertex2i(var6 + this.field6996.field663, var7);
        OpenGL.glEnd();
        this.method2900(false);
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lkd;IIII)V", line = 663)
    public class485(class188 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6986 = arg0;
        this.field6996 = class165.method1103(arg4, arg2, 3553, arg1, arg3, arg0);
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lkd;II[III)V", line = 673)
    public class485(class188 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field6986 = arg0;
        this.field6996 = class360.method2262(34037, arg2, arg3, false, arg1, arg0);
    }

    @OriginalMember(owner = "client!vm", name = "la", descriptor = "()I", line = 329)
    public final int method123() {
        field6994++;
        return this.field6996.field663;
    }

    @OriginalMember(owner = "client!vm", name = "s", descriptor = "(IIIIIII)V", line = 345)
    public final void method135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6996.method2757(true, -66);
        field6985++;
        this.field6986.method1314(2);
        this.field6986.method1291(arg6, false);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field6982) {
            float var8 = (float) arg2 / (float) this.method129();
            float var9 = (float) arg3 / (float) this.method139();
            float var10 = (float) this.field6980 * var8 + (float) arg0;
            float var11 = (float) this.field6974 * var9 + (float) arg1;
            float var12 = (float) this.field6996.field663 * var8 + var10;
            float var13 = (float) this.field6996.field656 * var9 + var11;
            if (this.field6983 == null) {
                this.field6986.method1289(-19391, this.field6996);
                this.field6986.method1248(arg4, true);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field6996.field658);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field6996.field664, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field6996.field664, this.field6996.field658);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method2903(arg4, -1485);
                this.field6983.method2757(true, -47);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field6996.field658);
                OpenGL.glTexCoord2f(0.0F, this.field6996.field658);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field6996.field664, 0.0F);
                OpenGL.glTexCoord2f(this.field6996.field664, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field6996.field664, this.field6996.field658);
                OpenGL.glTexCoord2f(this.field6996.field664, this.field6996.field658);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method2900(false);
            }
        } else if (this.field6983 == null) {
            this.field6986.method1289(-19391, this.field6996);
            this.field6986.method1248(arg4, true);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field6996.field658);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field6996.field664, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field6996.field664, this.field6996.field658);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method2903(arg4, -1485);
            this.field6983.method2757(true, -53);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field6996.field658);
            OpenGL.glTexCoord2f(0.0F, this.field6996.field658);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field6996.field664, 0.0F);
            OpenGL.glTexCoord2f(this.field6996.field664, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field6996.field664, this.field6996.field658);
            OpenGL.glTexCoord2f(this.field6996.field664, this.field6996.field658);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method2900(false);
        }
    }

    @OriginalMember(owner = "client!vm", name = "BA", descriptor = "(III)V", line = 463)
    public final void method133(int arg0, int arg1, int arg2) {
        field6998++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field6983 = class165.method1103(this.field6996.field656, arg1, 3553, arg0, this.field6996.field663, this.field6986);
        this.field6987 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIB)I", line = 489)
    public static final int method2901(int arg0, int arg1, int arg2, byte arg3) {
        field6979++;
        int var4 = -83 / ((arg3 + 35) / 48);
        if (arg2 > 243) {
            arg0 >>= 0x4;
        } else if (arg2 > 217) {
            arg0 >>= 0x3;
        } else if (arg2 > 192) {
            arg0 >>= 0x2;
        } else if (arg2 > 179) {
            arg0 >>= 0x1;
        }
        return (arg2 >> 1) + ((arg1 & 0xFF) >> 2 << 10) + (arg0 >> 5 << 7);
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(FFFFFFLma;II)V", line = 515)
    public final void method121(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class10 arg6, int arg7, int arg8) {
        field6993++;
        class53 var10 = ((class289) arg6).field4353;
        if (this.field6982) {
            float var11 = (float) this.method129();
            float var12 = (float) this.method139();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field6974 * var15;
            float var18 = (float) this.field6974 * var16;
            float var19 = (float) this.field6980 * var13;
            float var20 = (float) this.field6980 * var14;
            float var21 = (float) this.field6973 * -var13;
            float var22 = (float) this.field6973 * -var14;
            float var23 = (float) this.field6997 * -var15;
            arg3 = arg3 + var22 + var18;
            arg1 = arg1 + var20 + var18;
            arg0 = arg0 + var19 + var17;
            arg2 = arg2 + var21 + var17;
            float var24 = (float) this.field6997 * -var16;
            arg4 = arg4 + var19 + var23;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        this.field6996.method2757(true, -119);
        float var26 = arg5 + arg3 - arg1;
        this.field6986.method1314(2);
        this.field6986.method1289(-19391, this.field6996);
        this.field6986.method1248(1, true);
        this.field6986.method1307(1, (byte) 92);
        this.field6986.method1289(-19391, var10);
        this.field6986.method1242(34162, 8448, 7681);
        this.field6986.method1266(768, 0, 34168, 8960);
        this.field6986.method1291(1, false);
        float var27 = var10.field664 / (float) var10.field663;
        float var28 = var10.field658 / (float) var10.field656;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field6996.field658);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg0) * var27, var10.field658 - ((arg1 - (float) arg8) * var28));
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var27, var10.field658 - ((arg5 - (float) arg8) * var28));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field6996.field664, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + var25) * var27, var10.field658 - ((float) (-arg8) + var26) * var28);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field6996.field664, this.field6996.field658);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var27, var10.field658 - (((float) (-arg8) + arg3) * var28));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field6986.method1266(768, 0, 5890, 8960);
        this.field6986.method1248(0, true);
        this.field6986.method1289(-19391, null);
        this.field6986.method1307(0, (byte) 92);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 604)
    public static void method2902(int arg0) {
        int var1 = 16 % ((arg0 - 53) / 42);
        field6972 = null;
        field6975 = null;
    }

    @OriginalMember(owner = "client!vm", name = "T", descriptor = "()I", line = 619)
    public final int method139() {
        field6989++;
        return this.field6996.field656 + this.field6974 + this.field6997;
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(II)V", line = 627)
    private final void method2903(int arg0, int arg1) {
        this.field6986.method1307(1, (byte) 92);
        if (arg1 != -1485) {
            this.method134(-0.4899664F, -0.72123224F, 0.5227327F, 0.7236805F, 0.61018854F, 1.1806312F, 42, -59, 24);
        }
        field6995++;
        this.field6986.method1289(-19391, this.field6996);
        this.field6986.method1242(34162, 7681, this.field6986.method1277(arg0, (byte) -99));
        this.field6986.method1266(768, 1, 34167, 8960);
        this.field6986.method1296(770, 34168, 0, (byte) -122);
        this.field6986.method1307(0, (byte) 92);
        this.field6986.method1289(-19391, this.field6983);
        this.field6986.method1242(34162, 7681, 34479);
        this.field6986.method1266(768, 1, 34166, 8960);
        if (this.field6987 == 0) {
            this.field6986.method1258(1.0F, 0.0F, 0.5F, (byte) 117, 0.5F);
        } else if (this.field6987 == 1) {
            this.field6986.method1258(0.5F, 0.0F, 1.0F, (byte) 119, 0.5F);
        } else if (this.field6987 == 2) {
            this.field6986.method1258(0.5F, 0.0F, 0.5F, (byte) 113, 1.0F);
            return;
        } else if (this.field6987 == 3) {
            this.field6986.method1258(128.5F, 0.0F, 128.5F, (byte) 119, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IILma;II)V", line = 684)
    public final void method127(int arg0, int arg1, class10 arg2, int arg3, int arg4) {
        field6990++;
        class289 var6 = (class289) arg2;
        class53 var7 = var6.field4353;
        this.field6996.method2757(false, -53);
        this.field6986.method1314(2);
        this.field6986.method1289(-19391, this.field6996);
        this.field6986.method1248(1, true);
        this.field6986.method1307(1, (byte) 92);
        this.field6986.method1289(-19391, var7);
        this.field6986.method1242(34162, 8448, 7681);
        this.field6986.method1266(768, 0, 34168, 8960);
        this.field6986.method1291(1, false);
        int var8 = this.field6974 + arg1;
        int var9 = this.field6980 + arg0;
        int var10 = var9 + this.field6996.field663;
        int var11 = this.field6996.field656 + var8;
        float var12 = var7.field664 / (float) var7.field663;
        float var13 = var7.field658 / (float) var7.field656;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field658 - (float) (var8 - arg4) * var13;
        float var17 = var7.field658 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field6996.field658);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, this.field6996.field656 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field6996.field664, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field6996.field663 + var9, this.field6996.field656 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field6996.field664, this.field6996.field658);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(var9 + this.field6996.field663, var8);
        OpenGL.glEnd();
        this.field6986.method1266(768, 0, 5890, 8960);
        this.field6986.method1248(0, true);
        this.field6986.method1289(-19391, null);
        this.field6986.method1307(0, (byte) 92);
    }
}
