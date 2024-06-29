import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class83 extends class191 {

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "I")
    private int field1116 = 0;

    @OriginalMember(owner = "client!dv", name = "m", descriptor = "I")
    private int field1123 = 0;

    @OriginalMember(owner = "client!dv", name = "x", descriptor = "I")
    private int field1134 = 0;

    @OriginalMember(owner = "client!dv", name = "w", descriptor = "Z")
    private boolean field1133 = false;

    @OriginalMember(owner = "client!dv", name = "k", descriptor = "I")
    private int field1121 = 0;

    @OriginalMember(owner = "client!dv", name = "C", descriptor = "I")
    private int field1138 = 0;

    @OriginalMember(owner = "client!dv", name = "s", descriptor = "Lbv;")
    private class282 field1129;

    @OriginalMember(owner = "client!dv", name = "l", descriptor = "Log;")
    private class346 field1122;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!dv", name = "i", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!dv", name = "j", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!dv", name = "n", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!dv", name = "o", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!dv", name = "p", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!dv", name = "q", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!dv", name = "r", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!dv", name = "t", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!dv", name = "u", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!dv", name = "v", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!dv", name = "y", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!dv", name = "A", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!dv", name = "D", descriptor = "Lic;")
    public static class32 field1139;

    @OriginalMember(owner = "client!dv", name = "z", descriptor = "Log;")
    private class346 field1136;

    @OriginalMember(owner = "client!dv", name = "M", descriptor = "(IIIIIII)V")
    public final void method34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1122.method123(false, true);
        field1125++;
        this.field1129.method1833(16384);
        this.field1129.method1802(arg6, (byte) 57);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field1133) {
            float var8 = (float) arg2 / (float) this.method209();
            float var9 = (float) arg3 / (float) this.method219();
            float var10 = (float) this.field1134 * var8 + (float) arg0;
            float var11 = (float) this.field1123 * var9 + (float) arg1;
            float var12 = (float) this.field1122.field5415 * var8 + var10;
            float var13 = (float) this.field1122.field5411 * var9 + var11;
            if (this.field1136 == null) {
                this.field1129.method1787(this.field1122, (byte) 121);
                this.field1129.method1794(arg4, 120);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field1122.field5412);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field1122.field5417, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field1122.field5417, this.field1122.field5412);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method534(1465515432, arg4);
                this.field1136.method123(false, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field1122.field5412);
                OpenGL.glTexCoord2f(0.0F, this.field1122.field5412);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field1122.field5417, 0.0F);
                OpenGL.glTexCoord2f(this.field1122.field5417, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field1122.field5417, this.field1122.field5412);
                OpenGL.glTexCoord2f(this.field1122.field5417, this.field1122.field5412);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method533(false);
            }
        } else if (this.field1136 == null) {
            this.field1129.method1787(this.field1122, (byte) 121);
            this.field1129.method1794(arg4, 78);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field1122.field5412);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field1122.field5417, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field1122.field5417, this.field1122.field5412);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method534(1465515432, arg4);
            this.field1136.method123(false, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field1122.field5412);
            OpenGL.glTexCoord2f(0.0F, this.field1122.field5412);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field1122.field5417, 0.0F);
            OpenGL.glTexCoord2f(this.field1122.field5417, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field1122.field5417, this.field1122.field5412);
            OpenGL.glTexCoord2f(this.field1122.field5417, this.field1122.field5412);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method533(false);
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Z)V")
    public static void method532(boolean arg0) {
        field1139 = null;
        if (!arg0) {
            method536(-114, -9, 57, null, null, null);
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IILea;II)V")
    public final void method30(int arg0, int arg1, class15 arg2, int arg3, int arg4) {
        field1118++;
        class277 var6 = (class277) arg2;
        class346 var7 = var6.field3841;
        this.field1122.method123(false, false);
        this.field1129.method1833(16384);
        this.field1129.method1787(this.field1122, (byte) 121);
        this.field1129.method1794(1, 80);
        this.field1129.method1819(1, (byte) 92);
        this.field1129.method1787(var7, (byte) 121);
        this.field1129.method1776(-30, 8448, 7681);
        this.field1129.method1828(34168, 768, 0, (byte) -107);
        this.field1129.method1802(1, (byte) 57);
        int var8 = this.field1123 + arg1;
        int var9 = this.field1134 + arg0;
        int var10 = var9 + this.field1122.field5415;
        int var11 = this.field1122.field5411 + var8;
        float var12 = var7.field5417 / (float) var7.field5415;
        float var13 = var7.field5412 / (float) var7.field5411;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field5412 - ((float) (var8 - arg4) * var13);
        float var17 = var7.field5412 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field1122.field5412);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, this.field1122.field5411 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field1122.field5417, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(var9 + this.field1122.field5415, var8 - -this.field1122.field5411);
        OpenGL.glMultiTexCoord2f(33984, this.field1122.field5417, this.field1122.field5412);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field1122.field5415 + var9, var8);
        OpenGL.glEnd();
        this.field1129.method1828(5890, 768, 0, (byte) -91);
        this.field1129.method1794(0, 116);
        this.field1129.method1787(null, (byte) 121);
        this.field1129.method1819(0, (byte) 103);
    }

    @OriginalMember(owner = "client!dv", name = "ja", descriptor = "()I")
    public final int method209() {
        field1112++;
        return this.field1122.field5415 + this.field1134 + this.field1116;
    }

    @OriginalMember(owner = "client!dv", name = "V", descriptor = "(III)V")
    public final void method28(int arg0, int arg1, int arg2) {
        field1124++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field1136 = class422.method2541(arg0, this.field1122.field5411, this.field1122.field5415, this.field1129, arg1, -112);
        this.field1138 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!dv", name = "aa", descriptor = "(FFFFFFIII)V")
    public final void method217(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field1133) {
            float var10 = (float) this.method209();
            float var11 = (float) this.method219();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field1123 * var14;
            float var17 = (float) this.field1123 * var15;
            float var18 = (float) this.field1134 * var12;
            float var19 = (float) this.field1134 * var13;
            float var20 = (float) this.field1116 * -var12;
            float var21 = (float) this.field1116 * -var13;
            float var22 = (float) this.field1121 * -var14;
            arg3 = arg3 + var21 + var17;
            float var23 = (float) this.field1121 * -var15;
            arg1 = arg1 + var19 + var17;
            arg4 = arg4 + var18 + var22;
            arg2 = arg2 + var20 + var16;
            arg0 = arg0 + var18 + var16;
            arg5 = arg5 + var19 + var23;
        }
        field1130++;
        float var24 = arg2 + arg4 - arg0;
        this.field1122.method123(false, true);
        float var25 = arg5 + arg3 - arg1;
        this.field1129.method1833(16384);
        this.field1129.method1787(this.field1122, (byte) 121);
        this.field1129.method1802(arg8, (byte) 57);
        this.field1129.method1794(arg6, 104);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field1122.field5412);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field1122.field5417, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field1122.field5417, this.field1122.field5412);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!dv", name = "JA", descriptor = "()I")
    public final int method219() {
        field1137++;
        return this.field1122.field5411 + this.field1123 + this.field1121;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(FFFFFFLea;II)V")
    public final void method213(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class15 arg6, int arg7, int arg8) {
        field1119++;
        class346 var10 = ((class277) arg6).field3841;
        if (this.field1133) {
            float var11 = (float) this.method209();
            float var12 = (float) this.method219();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field1123 * var15;
            float var18 = (float) this.field1123 * var16;
            float var19 = (float) this.field1134 * var13;
            float var20 = (float) this.field1134 * var14;
            float var21 = (float) this.field1116 * -var13;
            float var22 = (float) this.field1116 * -var14;
            float var23 = (float) this.field1121 * -var15;
            arg3 = arg3 + var22 + var18;
            arg1 = arg1 + var20 + var18;
            arg4 = arg4 + var19 + var23;
            arg2 = arg2 + var21 + var17;
            arg0 = arg0 + var19 + var17;
            float var24 = (float) this.field1121 * -var16;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field1122.method123(false, true);
        this.field1129.method1833(16384);
        this.field1129.method1787(this.field1122, (byte) 121);
        this.field1129.method1794(1, 79);
        this.field1129.method1819(1, (byte) 103);
        this.field1129.method1787(var10, (byte) 121);
        this.field1129.method1776(-30, 8448, 7681);
        this.field1129.method1828(34168, 768, 0, (byte) -95);
        this.field1129.method1802(1, (byte) 57);
        float var27 = var10.field5417 / (float) var10.field5415;
        float var28 = var10.field5412 / (float) var10.field5411;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field1122.field5412);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var27, var10.field5412 - ((arg1 - (float) arg8) * var28));
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var27, var10.field5412 - ((float) (-arg8) + arg5) * var28);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field1122.field5417, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var27, var10.field5412 - (((float) (-arg8) + var26) * var28));
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field1122.field5417, this.field1122.field5412);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg2) * var27, var10.field5412 - ((float) (-arg8) + arg3) * var28);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field1129.method1828(5890, 768, 0, (byte) -80);
        this.field1129.method1794(0, 106);
        this.field1129.method1787(null, (byte) 121);
        this.field1129.method1819(0, (byte) 109);
    }

    @OriginalMember(owner = "client!dv", name = "UA", descriptor = "()I")
    public final int method220() {
        field1111++;
        return this.field1122.field5415;
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(Z)V")
    private final void method533(boolean arg0) {
        field1115++;
        this.field1129.method1819(1, (byte) 126);
        this.field1129.method1787(null, (byte) 121);
        this.field1129.method1776(-30, 8448, 8448);
        this.field1129.method1828(34168, 768, 1, (byte) -95);
        if (arg0) {
            this.field1122 = null;
        }
        this.field1129.method1825((byte) 117, 0, 770, 5890);
        this.field1129.method1819(0, (byte) 117);
        this.field1129.method1828(34168, 768, 1, (byte) -102);
    }

    @OriginalMember(owner = "client!dv", name = "D", descriptor = "(IIIIIII)V")
    public final void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1132++;
        int var8 = arg0 + arg2;
        int var9 = arg1 + arg3;
        this.field1122.method123(false, false);
        this.field1129.method1833(16384);
        this.field1129.method1787(this.field1122, (byte) 121);
        this.field1129.method1802(arg6, (byte) 57);
        this.field1129.method1794(arg4, 55);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field1122.field5414 && !this.field1133) {
            float var10 = (float) arg3 * this.field1122.field5412 / (float) this.field1122.field5411;
            float var11 = (float) arg2 * this.field1122.field5417 / (float) this.field1122.field5415;
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
        OpenGL.glTranslatef((float) this.field1134, (float) this.field1123, 0.0F);
        int var12 = this.method209();
        int var13 = this.method219();
        int var14 = arg1 + this.field1122.field5411;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = arg0 + this.field1122.field5415;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field1122.field5412);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field1122.field5417, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field1122.field5417, this.field1122.field5412);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field1122.field5417 / (float) this.field1122.field5415;
                OpenGL.glTexCoord2f(0.0F, this.field1122.field5412);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field1122.field5412);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (this.field1122.field5411 + var15 - var9) * this.field1122.field5412 / (float) this.field1122.field5411;
            int var17 = this.field1122.field5415 + arg0;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field1122.field5412);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field1122.field5417, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field1122.field5417, this.field1122.field5412);
                OpenGL.glVertex2i(var17, var15);
                var18 += var12;
                var17 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field1122.field5417 / (float) this.field1122.field5415;
                OpenGL.glTexCoord2f(0.0F, this.field1122.field5412);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field1122.field5412);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!dv", name = "W", descriptor = "(IIIIII)V")
    public final void method31(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1113++;
        this.field1122.method2419(arg4, arg3, arg0, arg1, -86, arg2, arg5);
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(II)V")
    private final void method534(int arg0, int arg1) {
        field1135++;
        this.field1129.method1819(1, (byte) 119);
        this.field1129.method1787(this.field1122, (byte) 121);
        this.field1129.method1776(-30, 7681, this.field1129.method1769((byte) 93, arg1));
        this.field1129.method1828(34167, 768, 1, (byte) -99);
        this.field1129.method1825((byte) 96, 0, 770, 34168);
        this.field1129.method1819(0, (byte) 109);
        this.field1129.method1787(this.field1136, (byte) 121);
        if (arg0 != 1465515432) {
            field1139 = null;
        }
        this.field1129.method1776(-30, 7681, 34479);
        this.field1129.method1828(34166, 768, 1, (byte) -87);
        if (this.field1138 == 0) {
            this.field1129.method1835(0.5F, 1.0F, 0.5F, 0.0F, -105);
        } else if (this.field1138 == 1) {
            this.field1129.method1835(0.5F, 0.5F, 1.0F, 0.0F, arg0 ^ 0xA8A60222);
        } else if (this.field1138 == 2) {
            this.field1129.method1835(1.0F, 0.5F, 0.5F, 0.0F, arg0 - 1465515550);
            return;
        } else if (this.field1138 == 3) {
            this.field1129.method1835(128.5F, 128.5F, 128.5F, 0.0F, -101);
            return;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILof;)V")
    public static final void method535(int arg0, class321 arg1) {
        if (arg0 != 33985) {
            return;
        }
        for (int var2 = 0; var2 < class499.field7298; var2++) {
            int var3 = class113.field1582[var2];
            class322 var4 = class439.field6539[var3];
            int var5 = arg1.method618((byte) 100);
            if ((var5 & 0x2) != 0) {
                var5 += arg1.method618((byte) 100) << 8;
            }
            if ((var5 & 0x200) != 0) {
                var5 += arg1.method618((byte) 100) << 16;
            }
            class344.method2201(var3, -89, arg1, var4, var5);
        }
        field1128++;
    }

    @OriginalMember(owner = "client!dv", name = "ka", descriptor = "(IIII)V")
    public final void method221(int arg0, int arg1, int arg2, int arg3) {
        this.field1123 = arg1;
        field1127++;
        this.field1121 = arg3;
        this.field1134 = arg0;
        this.field1116 = arg2;
        this.field1133 = this.field1134 != 0 || this.field1123 != 0 || this.field1116 != 0 || this.field1121 != 0;
    }

    @OriginalMember(owner = "client!dv", name = "qa", descriptor = "()I")
    public final int method214() {
        field1131++;
        return this.field1122.field5411;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(III[I[ILbv;)Lrr;")
    public static final class277 method536(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, class282 arg5) {
        field1114++;
        byte[] var6 = new byte[arg1 * arg2];
        for (int var7 = arg0; var7 < arg1; var7++) {
            int var8 = arg2 * var7 + arg3[var7];
            for (int var9 = 0; var9 < arg4[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class277(arg5, arg2, arg1, var6);
    }

    @OriginalMember(owner = "client!dv", name = "YA", descriptor = "(IIIII)V")
    public final void method32(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1122.method123(false, false);
        field1120++;
        this.field1129.method1833(16384);
        this.field1129.method1802(arg4, (byte) 57);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field1134 + arg0;
        int var7 = this.field1123 + arg1;
        if (this.field1136 == null) {
            this.field1129.method1787(this.field1122, (byte) 121);
            this.field1129.method1794(arg2, 60);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field1122.field5412);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, this.field1122.field5411 + var7);
            OpenGL.glTexCoord2f(this.field1122.field5417, 0.0F);
            OpenGL.glVertex2i(this.field1122.field5415 + var6, this.field1122.field5411 + var7);
            OpenGL.glTexCoord2f(this.field1122.field5417, this.field1122.field5412);
            OpenGL.glVertex2i(this.field1122.field5415 + var6, var7);
            OpenGL.glEnd();
            return;
        }
        this.method534(1465515432, arg2);
        this.field1136.method123(false, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field1122.field5412);
        OpenGL.glTexCoord2f(0.0F, this.field1122.field5412);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, this.field1122.field5411 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field1122.field5417, 0.0F);
        OpenGL.glTexCoord2f(this.field1122.field5417, 0.0F);
        OpenGL.glVertex2i(this.field1122.field5415 + var6, this.field1122.field5411 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field1122.field5417, this.field1122.field5412);
        OpenGL.glTexCoord2f(this.field1122.field5417, this.field1122.field5412);
        OpenGL.glVertex2i(this.field1122.field5415 + var6, var7);
        OpenGL.glEnd();
        this.method533(false);
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lbv;IIII)V")
    public class83(class282 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1129 = arg0;
        this.field1122 = class422.method2541(arg1, arg4, arg3, arg0, arg2, -111);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)V")
    public static final void method537(byte arg0) {
        field1126++;
        if (arg0 != 54) {
            method536(-116, 74, 111, null, null, null);
        }
        if (class453.field6657 != -1) {
            class420.method2532(class453.field6657, (byte) -110, -1, false, -1);
            class453.field6657 = -1;
        }
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lbv;II[III)V")
    public class83(class282 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field1129 = arg0;
        this.field1122 = class115.method746(3553, arg1, arg3, arg0, arg2, false);
    }
}
