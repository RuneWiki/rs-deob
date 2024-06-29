import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class75 extends class343 {

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    private int field1213 = 0;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
    private int field1228 = 0;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    private int field1217 = 0;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
    private int field1226 = 0;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
    private int field1235 = 0;

    @OriginalMember(owner = "client!ri", name = "E", descriptor = "Z")
    private boolean field1242 = false;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "Lbt;")
    private class33 field1219;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "Lhf;")
    private class277 field1218;

    @OriginalMember(owner = "client!ri", name = "C", descriptor = "Z")
    public static boolean field1240 = false;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!ri", name = "D", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "Lhf;")
    private class277 field1229;

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "Lci;")
    public static class320 field1237;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "[Laa;")
    public static class343[] field1225;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZZI)Lst;")
    public static final class304 method579(boolean arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field1230 = 74;
        }
        field1220++;
        long var3 = (long) (arg2 | (arg0 ? Integer.MIN_VALUE : 0));
        return (class304) class183.field2696.method2284(true, var3);
    }

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "(IIII)V")
    public final void method375(int arg0, int arg1, int arg2, int arg3) {
        this.field1217 = arg3;
        this.field1226 = arg1;
        field1215++;
        this.field1213 = arg2;
        this.field1228 = arg0;
        this.field1242 = this.field1228 != 0 || this.field1226 != 0 || this.field1213 != 0 || this.field1217 != 0;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)V")
    private final void method580(int arg0, int arg1) {
        this.field1219.method277(1, (byte) 117);
        field1214++;
        this.field1219.method285(false, this.field1218);
        this.field1219.method275(this.field1219.method263(arg1, (byte) -51), arg0, arg0 - 7555);
        this.field1219.method333(false, 34167, 768, 1);
        this.field1219.method200(34168, 0, 770, (byte) 125);
        this.field1219.method277(0, (byte) 82);
        this.field1219.method285(false, this.field1229);
        this.field1219.method275(34479, 7681, 122);
        this.field1219.method333(false, 34166, 768, 1);
        if (this.field1235 == 0) {
            this.field1219.method310(0.5F, -127, 0.0F, 0.5F, 1.0F);
        } else if (this.field1235 == 1) {
            this.field1219.method310(0.5F, -121, 0.0F, 1.0F, 0.5F);
            return;
        } else if (this.field1235 == 2) {
            this.field1219.method310(1.0F, -127, 0.0F, 0.5F, 0.5F);
            return;
        } else if (this.field1235 == 3) {
            this.field1219.method310(128.5F, -126, 0.0F, 128.5F, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!ri", name = "XA", descriptor = "(IIIIIII)V")
    public final void method372(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1223++;
        this.field1218.method879(true, (byte) 120);
        this.field1219.method278((byte) -118);
        this.field1219.method229(arg6, -108);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field1242) {
            float var8 = (float) arg2 / (float) this.method376();
            float var9 = (float) arg3 / (float) this.method374();
            float var10 = (float) this.field1228 * var8 + (float) arg0;
            float var11 = (float) this.field1226 * var9 + (float) arg1;
            float var12 = (float) this.field1218.field4125 * var8 + var10;
            float var13 = (float) this.field1218.field4135 * var9 + var11;
            if (this.field1229 == null) {
                this.field1219.method285(false, this.field1218);
                this.field1219.method249(arg4, -2);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field1218.field4127);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field1218.field4131, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field1218.field4131, this.field1218.field4127);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method580(7681, arg4);
                this.field1229.method879(true, (byte) 127);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field1218.field4127);
                OpenGL.glTexCoord2f(0.0F, this.field1218.field4127);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field1218.field4131, 0.0F);
                OpenGL.glTexCoord2f(this.field1218.field4131, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field1218.field4131, this.field1218.field4127);
                OpenGL.glTexCoord2f(this.field1218.field4131, this.field1218.field4127);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method583(34168);
            }
        } else if (this.field1229 == null) {
            this.field1219.method285(false, this.field1218);
            this.field1219.method249(arg4, -2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field1218.field4127);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field1218.field4131, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field1218.field4131, this.field1218.field4127);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method580(7681, arg4);
            this.field1229.method879(true, (byte) 102);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field1218.field4127);
            OpenGL.glTexCoord2f(0.0F, this.field1218.field4127);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field1218.field4131, 0.0F);
            OpenGL.glTexCoord2f(this.field1218.field4131, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field1218.field4131, this.field1218.field4127);
            OpenGL.glTexCoord2f(this.field1218.field4131, this.field1218.field4127);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method583(34168);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static void method581(int arg0) {
        field1237 = null;
        field1225 = null;
        if (arg0 != 33985) {
            method581(-124);
        }
    }

    @OriginalMember(owner = "client!ri", name = "J", descriptor = "(III)V")
    public final void method369(int arg0, int arg1, int arg2) {
        field1222++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field1229 = class184.method1275(this.field1218.field4135, arg1, this.field1218.field4125, 6, this.field1219, arg0);
        this.field1235 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILi;II)V")
    public final void method368(int arg0, int arg1, class31 arg2, int arg3, int arg4) {
        field1216++;
        class173 var6 = (class173) arg2;
        class277 var7 = var6.field2592;
        this.field1218.method879(false, (byte) 121);
        this.field1219.method278((byte) -121);
        this.field1219.method285(false, this.field1218);
        this.field1219.method249(1, -2);
        this.field1219.method277(1, (byte) 103);
        this.field1219.method285(false, var7);
        this.field1219.method275(7681, 8448, 121);
        this.field1219.method333(false, 34168, 768, 0);
        this.field1219.method229(1, -58);
        int var8 = this.field1228 + arg0;
        int var9 = this.field1226 + arg1;
        int var10 = var8 + this.field1218.field4125;
        int var11 = var9 + this.field1218.field4135;
        float var12 = var7.field4131 / (float) var7.field4125;
        float var13 = var7.field4127 / (float) var7.field4135;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field4127 - (float) (var9 - arg4) * var13;
        float var17 = var7.field4127 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field1218.field4127);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var8, var9);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var8, this.field1218.field4135 + var9);
        OpenGL.glMultiTexCoord2f(33984, this.field1218.field4131, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field1218.field4125 + var8, this.field1218.field4135 + var9);
        OpenGL.glMultiTexCoord2f(33984, this.field1218.field4131, this.field1218.field4127);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field1218.field4125 + var8, var9);
        OpenGL.glEnd();
        this.field1219.method333(false, 5890, 768, 0);
        this.field1219.method249(0, -2);
        this.field1219.method285(false, null);
        this.field1219.method277(0, (byte) 90);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(FFFFFFLi;II)V")
    public final void method379(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class31 arg6, int arg7, int arg8) {
        field1232++;
        class277 var10 = ((class173) arg6).field2592;
        if (this.field1242) {
            float var11 = (float) this.method376();
            float var12 = (float) this.method374();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field1226 * var15;
            float var18 = (float) this.field1226 * var16;
            float var19 = (float) this.field1228 * var13;
            float var20 = (float) this.field1228 * var14;
            float var21 = (float) this.field1213 * -var13;
            float var22 = (float) this.field1213 * -var14;
            float var23 = (float) this.field1217 * -var15;
            float var24 = (float) this.field1217 * -var16;
            arg0 = arg0 + var19 + var17;
            arg3 = arg3 + var22 + var18;
            arg2 = arg2 + var21 + var17;
            arg1 = arg1 + var20 + var18;
            arg4 = arg4 + var19 + var23;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field1218.method879(true, (byte) 121);
        this.field1219.method278((byte) -94);
        this.field1219.method285(false, this.field1218);
        this.field1219.method249(1, -2);
        this.field1219.method277(1, (byte) 90);
        this.field1219.method285(false, var10);
        this.field1219.method275(7681, 8448, 127);
        this.field1219.method333(false, 34168, 768, 0);
        this.field1219.method229(1, -15);
        float var27 = var10.field4131 / (float) var10.field4125;
        float var28 = var10.field4127 / (float) var10.field4135;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field1218.field4127);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var27, var10.field4127 - (arg1 - (float) arg8) * var28);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg4) * var27, var10.field4127 - ((float) (-arg8) + arg5) * var28);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field1218.field4131, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var27, var10.field4127 - ((var26 - (float) arg8) * var28));
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field1218.field4131, this.field1218.field4127);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var27, var10.field4127 - ((float) (-arg8) + arg3) * var28);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field1219.method333(false, 5890, 768, 0);
        this.field1219.method249(0, -2);
        this.field1219.method285(false, null);
        this.field1219.method277(0, (byte) 65);
    }

    @OriginalMember(owner = "client!ri", name = "D", descriptor = "(IIIIII)V")
    public final void method365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1218.method1229(arg3, arg5, arg2, arg0, arg1, arg4, (byte) 112);
        field1224++;
    }

    @OriginalMember(owner = "client!ri", name = "TA", descriptor = "()I")
    public final int method378() {
        field1221++;
        return this.field1218.field4125;
    }

    @OriginalMember(owner = "client!ri", name = "V", descriptor = "()I")
    public final int method367() {
        field1233++;
        return this.field1218.field4135;
    }

    @OriginalMember(owner = "client!ri", name = "ga", descriptor = "()I")
    public final int method374() {
        field1236++;
        return this.field1218.field4135 + this.field1226 + this.field1217;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
    public static final void method582(int arg0) {
        class389.field5521++;
        field1227++;
        if (arg0 != 9981) {
            field1225 = null;
        }
        class228.method1528(true, class466.field6774);
        class276.field4124.method3016(class114.field1700, -97);
    }

    @OriginalMember(owner = "client!ri", name = "E", descriptor = "(IIIII)V")
    public final void method370(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1218.method879(false, (byte) 111);
        field1238++;
        this.field1219.method278((byte) -123);
        this.field1219.method229(arg4, -36);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field1226 + arg1;
        int var7 = this.field1228 + arg0;
        if (this.field1229 == null) {
            this.field1219.method285(false, this.field1218);
            this.field1219.method249(arg2, -2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field1218.field4127);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, var6 + this.field1218.field4135);
            OpenGL.glTexCoord2f(this.field1218.field4131, 0.0F);
            OpenGL.glVertex2i(this.field1218.field4125 + var7, var6 - -this.field1218.field4135);
            OpenGL.glTexCoord2f(this.field1218.field4131, this.field1218.field4127);
            OpenGL.glVertex2i(this.field1218.field4125 + var7, var6);
            OpenGL.glEnd();
            return;
        }
        this.method580(7681, arg2);
        this.field1229.method879(false, (byte) 118);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field1218.field4127);
        OpenGL.glTexCoord2f(0.0F, this.field1218.field4127);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, this.field1218.field4135 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field1218.field4131, 0.0F);
        OpenGL.glTexCoord2f(this.field1218.field4131, 0.0F);
        OpenGL.glVertex2i(this.field1218.field4125 + var7, var6 - -this.field1218.field4135);
        OpenGL.glMultiTexCoord2f(33985, this.field1218.field4131, this.field1218.field4127);
        OpenGL.glTexCoord2f(this.field1218.field4131, this.field1218.field4127);
        OpenGL.glVertex2i(var7 + this.field1218.field4125, var6);
        OpenGL.glEnd();
        this.method583(34168);
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)V")
    private final void method583(int arg0) {
        field1231++;
        this.field1219.method277(1, (byte) 70);
        this.field1219.method285(false, null);
        this.field1219.method275(8448, 8448, 122);
        this.field1219.method333(false, 34168, 768, 1);
        this.field1219.method200(5890, 0, 770, (byte) 114);
        this.field1219.method277(0, (byte) 101);
        this.field1219.method333(false, arg0, 768, 1);
    }

    @OriginalMember(owner = "client!ri", name = "ta", descriptor = "(FFFFFFIII)V")
    public final void method377(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        field1241++;
        if (this.field1242) {
            float var10 = (float) this.method376();
            float var11 = (float) this.method374();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field1226 * var14;
            float var17 = (float) this.field1226 * var15;
            float var18 = (float) this.field1228 * var12;
            float var19 = (float) this.field1228 * var13;
            float var20 = (float) this.field1213 * -var12;
            float var21 = (float) this.field1213 * -var13;
            float var22 = (float) this.field1217 * -var14;
            arg0 = arg0 + var18 + var16;
            float var23 = (float) this.field1217 * -var15;
            arg4 = arg4 + var18 + var22;
            arg1 = arg1 + var19 + var17;
            arg3 = arg3 + var21 + var17;
            arg2 = arg2 + var20 + var16;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        this.field1218.method879(true, (byte) 76);
        this.field1219.method278((byte) -97);
        this.field1219.method285(false, this.field1218);
        this.field1219.method229(arg8, -59);
        this.field1219.method249(arg6, -2);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field1218.field4127);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field1218.field4131, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field1218.field4131, this.field1218.field4127);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Li;IBIIILtf;Laa;)V")
    public static final void method584(class31 arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, class198 arg6, class343 arg7) {
        field1234++;
        if (arg2 >= -24) {
            method584(null, 10, (byte) -55, -17, -102, -17, null, null);
        }
        if (arg7 == null) {
            return;
        }
        int var8;
        if (class294.field4381 == 4) {
            var8 = (int) class508.field7354 & 0x3FFF;
        } else {
            var8 = (int) class508.field7354 + class78.field1280 & 0x3FFF;
        }
        int var9 = Math.max(arg6.field3008 / 2, arg6.field2988 / 2) + 10;
        int var10 = arg1 * arg1 + (arg4 * arg4);
        if (var10 > (var9 * var9)) {
            return;
        }
        int var11 = class358.field5204[var8];
        int var12 = class358.field5203[var8];
        if (class294.field4381 != 4) {
            var12 = var12 * 256 / (class384.field5495 + 256);
            var11 = var11 * 256 / (class384.field5495 + 256);
        }
        int var13 = arg4 * var11 + (arg1 * var12) >> 15;
        int var14 = arg4 * var12 - (arg1 * var11) >> 15;
        arg7.method368(arg6.field3008 / 2 + arg3 - (-var13 - -(arg7.method376() / 2)), arg5 - -(arg6.field2988 / 2) + -var14 + -(arg7.method374() / 2), arg0, arg3, arg5);
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "()I")
    public final int method376() {
        field1239++;
        return this.field1218.field4125 + this.field1228 + this.field1213;
    }

    @OriginalMember(owner = "client!ri", name = "PA", descriptor = "(IIIIIII)V")
    public final void method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1212++;
        int var8 = arg0 + arg2;
        this.field1218.method879(false, (byte) 97);
        int var9 = arg1 + arg3;
        this.field1219.method278((byte) -94);
        this.field1219.method285(false, this.field1218);
        this.field1219.method229(arg6, -42);
        this.field1219.method249(arg4, -2);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field1218.field4130 && !this.field1242) {
            float var10 = (float) arg3 * this.field1218.field4127 / (float) this.field1218.field4135;
            float var11 = (float) arg2 * this.field1218.field4131 / (float) this.field1218.field4125;
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
        OpenGL.glTranslatef((float) this.field1228, (float) this.field1226, 0.0F);
        int var12 = this.method376();
        int var13 = this.method374();
        int var14 = arg1 + this.field1218.field4135;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = this.field1218.field4125 + arg0;
            int var21 = arg0;
            while (var8 >= var20) {
                OpenGL.glTexCoord2f(0.0F, this.field1218.field4127);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field1218.field4131, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field1218.field4131, this.field1218.field4127);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field1218.field4131 / (float) this.field1218.field4125;
                OpenGL.glTexCoord2f(0.0F, this.field1218.field4127);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field1218.field4127);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (this.field1218.field4135 - (var9 - var15)) * this.field1218.field4127 / (float) this.field1218.field4135;
            int var17 = arg0 + this.field1218.field4125;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field1218.field4127);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field1218.field4131, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field1218.field4131, this.field1218.field4127);
                OpenGL.glVertex2i(var17, var15);
                var18 += var12;
                var17 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field1218.field4131 / (float) this.field1218.field4125;
                OpenGL.glTexCoord2f(0.0F, this.field1218.field4127);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field1218.field4127);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lbt;IIII)V")
    public class75(class33 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1219 = arg0;
        this.field1218 = class184.method1275(arg4, arg2, arg3, 6, arg0, arg1);
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lbt;II[III)V")
    public class75(class33 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field1219 = arg0;
        this.field1218 = class391.method2355(arg0, arg2, arg1, false, arg3, -80);
    }
}
