import jaggl.OpenGL;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class343 extends class424 {

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "Z")
    private boolean field5038 = false;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    private int field5031 = 0;

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "I")
    private int field5049 = 0;

    @OriginalMember(owner = "client!gm", name = "x", descriptor = "I")
    private int field5054 = 0;

    @OriginalMember(owner = "client!gm", name = "l", descriptor = "I")
    private int field5042 = 0;

    @OriginalMember(owner = "client!gm", name = "z", descriptor = "I")
    private int field5056 = 0;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "Lpea;")
    private class641 field5035;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "Lmm;")
    private class459 field5037;

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field5050 = new CRC32();

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!gm", name = "v", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!gm", name = "w", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!gm", name = "y", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!gm", name = "A", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "Lnd;")
    public static class409 field5048;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "Lmm;")
    private class459 field5033;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V")
    private final void method2165(byte arg0) {
        this.field5035.method3488(1, (byte) 23);
        field5041++;
        this.field5035.method3553((byte) -116, null);
        this.field5035.method3499(8448, arg0 ^ 0x8537, 8448);
        this.field5035.method3525(768, 34168, 1, true);
        if (arg0 == 70) {
            this.field5035.method3557(8960, 770, 0, 5890);
            this.field5035.method3488(0, (byte) 23);
            this.field5035.method3525(768, 34168, 1, true);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BI)V")
    private final void method2166(byte arg0, int arg1) {
        field5045++;
        this.field5035.method3488(1, (byte) 23);
        this.field5035.method3553((byte) 81, this.field5037);
        this.field5035.method3499(7681, 34161, this.field5035.method3513(-127, arg1));
        this.field5035.method3525(768, 34167, 1, true);
        this.field5035.method3557(8960, 770, 0, 34168);
        this.field5035.method3488(0, (byte) 23);
        this.field5035.method3553((byte) 75, this.field5033);
        this.field5035.method3499(7681, 34161, 34479);
        this.field5035.method3525(768, 34166, 1, true);
        if (this.field5049 == 0) {
            this.field5035.method3515(0.5F, -976, 0.5F, 0.0F, 1.0F);
        } else if (this.field5049 == 1) {
            this.field5035.method3515(1.0F, -976, 0.5F, 0.0F, 0.5F);
        } else if (this.field5049 == 2) {
            this.field5035.method3515(0.5F, -976, 1.0F, 0.0F, 0.5F);
        } else if (this.field5049 == 3) {
            this.field5035.method3515(128.5F, -976, 128.5F, 0.0F, 128.5F);
        }
        if (arg0 > -70) {
            this.field5033 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IILfa;II)V")
    public final void method63(int arg0, int arg1, class185 arg2, int arg3, int arg4) {
        field5032++;
        class200 var6 = (class200) arg2;
        class459 var7 = var6.field2628;
        this.field5037.method1592(-104, false);
        this.field5035.method3564(14528);
        this.field5035.method3553((byte) -112, this.field5037);
        this.field5035.method3524(1, 14);
        this.field5035.method3488(1, (byte) 23);
        this.field5035.method3553((byte) -126, var7);
        this.field5035.method3499(8448, 34161, 7681);
        this.field5035.method3525(768, 34168, 0, true);
        this.field5035.method3547(1, true);
        int var8 = this.field5054 + arg1;
        int var9 = this.field5056 + arg0;
        int var10 = var9 + this.field5037.field6239;
        int var11 = this.field5037.field6241 + var8;
        float var12 = var7.field6240 / (float) var7.field6239;
        float var13 = var7.field6242 / (float) var7.field6241;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field6242 - (float) (var8 - arg4) * var13;
        float var17 = var7.field6242 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field5037.field6242);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, this.field5037.field6241 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field5037.field6240, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(var9 + this.field5037.field6239, var8 - -this.field5037.field6241);
        OpenGL.glMultiTexCoord2f(33984, this.field5037.field6240, this.field5037.field6242);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(var9 + this.field5037.field6239, var8);
        OpenGL.glEnd();
        this.field5035.method3525(768, 5890, 0, true);
        this.field5035.method3524(0, 14);
        this.field5035.method3553((byte) -117, null);
        this.field5035.method3488(0, (byte) 23);
    }

    @OriginalMember(owner = "client!gm", name = "QA", descriptor = "()I")
    public final int method1159() {
        field5034++;
        return this.field5037.field6239;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(B)V")
    public static final void method2167(byte arg0) {
        if (arg0 <= 44) {
            method2168(-6);
        }
        if (class112.field1345.toLowerCase().indexOf("microsoft") == -1) {
            class237.field3086[61] = 27;
            class237.field3086[91] = 42;
            class237.field3086[46] = 72;
            class237.field3086[92] = 74;
            class237.field3086[59] = 57;
            class237.field3086[44] = 71;
            if (class112.field1349 == null) {
                class237.field3086[222] = 59;
                class237.field3086[192] = 58;
            } else {
                class237.field3086[520] = 59;
                class237.field3086[222] = 58;
                class237.field3086[192] = 28;
            }
            class237.field3086[93] = 43;
            class237.field3086[45] = 26;
            class237.field3086[47] = 73;
        } else {
            class237.field3086[190] = 72;
            class237.field3086[221] = 43;
            class237.field3086[186] = 57;
            class237.field3086[187] = 27;
            class237.field3086[189] = 26;
            class237.field3086[191] = 73;
            class237.field3086[219] = 42;
            class237.field3086[192] = 58;
            class237.field3086[223] = 28;
            class237.field3086[220] = 74;
            class237.field3086[188] = 71;
            class237.field3086[222] = 59;
        }
        field5043++;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
    public static void method2168(int arg0) {
        field5048 = null;
        field5050 = null;
        if (arg0 != 33985) {
            field5050 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "()I")
    public final int method1154() {
        field5044++;
        return this.field5037.field6241;
    }

    @OriginalMember(owner = "client!gm", name = "ba", descriptor = "(IIIIIII)V")
    public final void method1161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5057++;
        int var8 = arg0 + arg2;
        this.field5037.method1592(112, false);
        int var9 = arg1 + arg3;
        this.field5035.method3564(14528);
        this.field5035.method3553((byte) 123, this.field5037);
        this.field5035.method3547(arg6, true);
        this.field5035.method3524(arg4, 14);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field5037.field6243 && !this.field5038) {
            float var10 = (float) arg3 * this.field5037.field6242 / (float) this.field5037.field6241;
            float var11 = (float) arg2 * this.field5037.field6240 / (float) this.field5037.field6239;
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
        OpenGL.glTranslatef((float) this.field5056, (float) this.field5054, 0.0F);
        int var12 = this.method1160();
        int var13 = this.method1157();
        int var14 = arg1 + this.field5037.field6241;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = this.field5037.field6239 + arg0;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field5037.field6242);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field5037.field6240, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field5037.field6240, this.field5037.field6242);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field5037.field6240 / (float) this.field5037.field6239;
                OpenGL.glTexCoord2f(0.0F, this.field5037.field6242);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field5037.field6242);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (this.field5037.field6241 - (var9 - var15)) * this.field5037.field6242 / (float) this.field5037.field6241;
            int var17 = this.field5037.field6239 + arg0;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field5037.field6242);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field5037.field6240, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field5037.field6240, this.field5037.field6242);
                OpenGL.glVertex2i(var17, var15);
                var18 += var12;
                var17 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field5037.field6240 / (float) this.field5037.field6239;
                OpenGL.glTexCoord2f(0.0F, this.field5037.field6242);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field5037.field6242);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!gm", name = "sa", descriptor = "(FFFFFFIII)V")
    public final void method1158(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field5038) {
            float var10 = (float) this.method1160();
            float var11 = (float) this.method1157();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field5054 * var14;
            float var17 = (float) this.field5054 * var15;
            float var18 = (float) this.field5056 * var12;
            float var19 = (float) this.field5056 * var13;
            float var20 = (float) this.field5031 * -var12;
            float var21 = (float) this.field5031 * -var13;
            float var22 = (float) this.field5042 * -var14;
            arg3 = arg3 + var21 + var17;
            arg1 = arg1 + var19 + var17;
            float var23 = (float) this.field5042 * -var15;
            arg4 = arg4 + var18 + var22;
            arg2 = arg2 + var20 + var16;
            arg0 = arg0 + var18 + var16;
            arg5 = arg5 + var19 + var23;
        }
        field5055++;
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        this.field5037.method1592(-54, true);
        this.field5035.method3564(14528);
        this.field5035.method3553((byte) -105, this.field5037);
        this.field5035.method3547(arg8, true);
        this.field5035.method3524(arg6, 14);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field5037.field6242);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field5037.field6240, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field5037.field6240, this.field5037.field6242);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "(III)V")
    public final void method66(int arg0, int arg1, int arg2) {
        field5040++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field5033 = class155.method1029(this.field5037.field6241, arg0, (byte) -57, this.field5035, arg1, this.field5037.field6239);
        this.field5049 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!gm", name = "EA", descriptor = "(IIII)V")
    public final void method1155(int arg0, int arg1, int arg2, int arg3) {
        field5053++;
        this.field5054 = arg1;
        this.field5056 = arg0;
        this.field5031 = arg2;
        this.field5042 = arg3;
        this.field5038 = this.field5056 != 0 || this.field5054 != 0 || this.field5031 != 0 || this.field5042 != 0;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(FFFFFFLfa;II)V")
    public final void method1156(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class185 arg6, int arg7, int arg8) {
        field5039++;
        class459 var10 = ((class200) arg6).field2628;
        if (this.field5038) {
            float var11 = (float) this.method1160();
            float var12 = (float) this.method1157();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field5054 * var15;
            float var18 = (float) this.field5054 * var16;
            float var19 = (float) this.field5056 * var13;
            float var20 = (float) this.field5056 * var14;
            float var21 = (float) this.field5031 * -var13;
            float var22 = (float) this.field5031 * -var14;
            float var23 = (float) this.field5042 * -var15;
            arg2 = arg2 + var21 + var17;
            arg4 = arg4 + var19 + var23;
            arg3 = arg3 + var22 + var18;
            arg1 = arg1 + var20 + var18;
            arg0 = arg0 + var19 + var17;
            float var24 = (float) this.field5042 * -var16;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        this.field5037.method1592(-76, true);
        float var26 = arg5 + arg3 - arg1;
        this.field5035.method3564(14528);
        this.field5035.method3553((byte) -115, this.field5037);
        this.field5035.method3524(1, 14);
        this.field5035.method3488(1, (byte) 23);
        this.field5035.method3553((byte) -126, var10);
        this.field5035.method3499(8448, 34161, 7681);
        this.field5035.method3525(768, 34168, 0, true);
        this.field5035.method3547(1, true);
        float var27 = var10.field6240 / (float) var10.field6239;
        float var28 = var10.field6242 / (float) var10.field6241;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field5037.field6242);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var27, var10.field6242 - (arg1 - (float) arg8) * var28);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg4) * var27, var10.field6242 - ((float) (-arg8) + arg5) * var28);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field5037.field6240, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var27, var10.field6242 - (var26 - (float) arg8) * var28);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field5037.field6240, this.field5037.field6242);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var27, var10.field6242 - (((float) (-arg8) + arg3) * var28));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field5035.method3525(768, 5890, 0, true);
        this.field5035.method3524(0, 14);
        this.field5035.method3553((byte) 64, null);
        this.field5035.method3488(0, (byte) 23);
    }

    @OriginalMember(owner = "client!gm", name = "AA", descriptor = "()I")
    public final int method1160() {
        field5052++;
        return this.field5037.field6239 + this.field5056 + this.field5031;
    }

    @OriginalMember(owner = "client!gm", name = "GA", descriptor = "(IIIIII)V")
    public final void method68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5051++;
        this.field5037.method2300(arg1, arg4, true, arg0, arg5, arg3, arg2);
    }

    @OriginalMember(owner = "client!gm", name = "I", descriptor = "(IIIII)V")
    public final void method67(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5036++;
        this.field5037.method1592(-83, false);
        this.field5035.method3564(14528);
        this.field5035.method3547(arg4, true);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field5054 + arg1;
        int var7 = this.field5056 + arg0;
        if (this.field5033 == null) {
            this.field5035.method3553((byte) -93, this.field5037);
            this.field5035.method3524(arg2, 14);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field5037.field6242);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, this.field5037.field6241 + var6);
            OpenGL.glTexCoord2f(this.field5037.field6240, 0.0F);
            OpenGL.glVertex2i(this.field5037.field6239 + var7, this.field5037.field6241 + var6);
            OpenGL.glTexCoord2f(this.field5037.field6240, this.field5037.field6242);
            OpenGL.glVertex2i(this.field5037.field6239 + var7, var6);
            OpenGL.glEnd();
            return;
        }
        this.method2166((byte) -76, arg2);
        this.field5033.method1592(-69, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5037.field6242);
        OpenGL.glTexCoord2f(0.0F, this.field5037.field6242);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, var6 + this.field5037.field6241);
        OpenGL.glMultiTexCoord2f(33985, this.field5037.field6240, 0.0F);
        OpenGL.glTexCoord2f(this.field5037.field6240, 0.0F);
        OpenGL.glVertex2i(var7 + this.field5037.field6239, this.field5037.field6241 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field5037.field6240, this.field5037.field6242);
        OpenGL.glTexCoord2f(this.field5037.field6240, this.field5037.field6242);
        OpenGL.glVertex2i(var7 + this.field5037.field6239, var6);
        OpenGL.glEnd();
        this.method2165((byte) 70);
    }

    @OriginalMember(owner = "client!gm", name = "KA", descriptor = "(IIIIIII)V")
    public final void method65(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5037.method1592(-92, true);
        field5046++;
        this.field5035.method3564(14528);
        this.field5035.method3547(arg6, true);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field5038) {
            float var8 = (float) arg2 / (float) this.method1160();
            float var9 = (float) arg3 / (float) this.method1157();
            float var10 = (float) this.field5056 * var8 + (float) arg0;
            float var11 = (float) this.field5054 * var9 + (float) arg1;
            float var12 = (float) this.field5037.field6239 * var8 + var10;
            float var13 = (float) this.field5037.field6241 * var9 + var11;
            if (this.field5033 == null) {
                this.field5035.method3553((byte) -116, this.field5037);
                this.field5035.method3524(arg4, 14);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field5037.field6242);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field5037.field6240, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field5037.field6240, this.field5037.field6242);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method2166((byte) -120, arg4);
                this.field5033.method1592(121, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5037.field6242);
                OpenGL.glTexCoord2f(0.0F, this.field5037.field6242);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field5037.field6240, 0.0F);
                OpenGL.glTexCoord2f(this.field5037.field6240, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field5037.field6240, this.field5037.field6242);
                OpenGL.glTexCoord2f(this.field5037.field6240, this.field5037.field6242);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method2165((byte) 70);
            }
        } else if (this.field5033 == null) {
            this.field5035.method3553((byte) -89, this.field5037);
            this.field5035.method3524(arg4, 14);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field5037.field6242);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field5037.field6240, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field5037.field6240, this.field5037.field6242);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method2166((byte) -122, arg4);
            this.field5033.method1592(-62, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5037.field6242);
            OpenGL.glTexCoord2f(0.0F, this.field5037.field6242);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field5037.field6240, 0.0F);
            OpenGL.glTexCoord2f(this.field5037.field6240, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field5037.field6240, this.field5037.field6242);
            OpenGL.glTexCoord2f(this.field5037.field6240, this.field5037.field6242);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method2165((byte) 70);
        }
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lpea;IIII)V")
    public class343(class641 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5035 = arg0;
        this.field5037 = class155.method1029(arg4, arg1, (byte) -72, arg0, arg2, arg3);
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lpea;II[III)V")
    public class343(class641 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field5035 = arg0;
        this.field5037 = class399.method2360(arg2, false, arg3, false, arg1, arg0);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "()I")
    public final int method1157() {
        field5047++;
        return this.field5037.field6241 + this.field5042 + this.field5054;
    }
}
