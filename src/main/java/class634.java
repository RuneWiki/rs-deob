import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class634 extends class772 {

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    private int field8044 = 0;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    private int field8042 = 0;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    private int field8037 = 0;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    private int field8041 = 0;

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "Z")
    private boolean field8062 = false;

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "I")
    private int field8066 = 0;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "Lck;")
    private class733 field8055;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "Lrc;")
    private class59 field8056;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
    public static int field8063 = -1;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "[J")
    public static long[] field8053 = new long[10];

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field8035;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field8036;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field8038;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field8039;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field8040;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field8043;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field8045;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field8046;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field8047;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field8048;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public static int field8049;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public static int field8051;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
    public static int field8052;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
    public static int field8054;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
    public static int field8057;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
    public static int field8058;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
    public static int field8059;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "I")
    public static int field8060;

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
    public static int field8061;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "I")
    public static int field8065;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
    public static int field8067;

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "I")
    public static int field8068;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "Lrc;")
    private class59 field8050;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "[Lpu;")
    public static class772[] field8064;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIII)V", line = 3)
    public final void method626(int arg0, int arg1, int arg2, int arg3) {
        field8057++;
        this.field8066 = arg1;
        this.field8037 = arg3;
        this.field8042 = arg2;
        this.field8044 = arg0;
        this.field8062 = this.field8044 != 0 || this.field8066 != 0 || this.field8042 != 0 || this.field8037 != 0;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)V", line = 15)
    public final void method627(int arg0, int arg1, int arg2) {
        field8047++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field8050 = class732.method3907(this.field8056.field771, arg0, -114, arg1, this.field8055, this.field8056.field770);
        this.field8041 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V", line = 43)
    public static final void method3382(int arg0) {
        field8051++;
        if (class224.field3041 != arg0) {
            class386.method2220(-1, -1, class224.field3041, false, -1);
            class224.field3041 = -1;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 61)
    public final void method617(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class596 arg7, int arg8, int arg9) {
        field8068++;
        class59 var11 = ((class787) arg7).field10781;
        if (this.field8062) {
            float var12 = (float) this.method623();
            float var13 = (float) this.method628();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field8066 * var16;
            float var19 = (float) this.field8066 * var17;
            float var20 = (float) this.field8044 * var14;
            float var21 = (float) this.field8044 * var15;
            float var22 = (float) this.field8042 * -var14;
            float var23 = (float) this.field8042 * -var15;
            float var24 = (float) this.field8037 * -var16;
            arg2 = arg2 + var22 + var18;
            arg3 = arg3 + var23 + var19;
            arg4 = arg4 + var20 + var24;
            arg1 = arg1 + var21 + var19;
            arg0 = arg0 + var20 + var18;
            float var25 = (float) this.field8037 * -var17;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        this.field8056.method759(0, (arg6 & 0x1) != 0);
        float var27 = arg5 + arg3 - arg1;
        this.field8055.method3914((byte) -121);
        this.field8055.method3975((byte) 126, this.field8056);
        this.field8055.method3979((byte) 76, 1);
        this.field8055.method3945(1, false);
        this.field8055.method3975((byte) 122, var11);
        this.field8055.method3917(38, 7681, 8448);
        this.field8055.method3954(0, 768, 34168, (byte) 112);
        this.field8055.method3920(1, 9770);
        float var28 = var11.field772 / (float) var11.field770;
        float var29 = var11.field768 / (float) var11.field771;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field8056.field768);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg0) * var28, var11.field768 - ((arg1 - (float) arg9) * var29));
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg8) * var28, var11.field768 - (((float) (-arg9) + arg5) * var29));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field8056.field772, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + var26) * var28, var11.field768 - ((var27 - (float) arg9) * var29));
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field8056.field772, this.field8056.field768);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg2) * var28, var11.field768 - ((float) (-arg9) + arg3) * var29);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field8055.method3954(0, 768, 5890, (byte) 113);
        this.field8055.method3979((byte) 75, 0);
        this.field8055.method3975((byte) 127, null);
        this.field8055.method3945(0, false);
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lck;IIZ)V", line = 924)
    public class634(class733 arg0, int arg1, int arg2, boolean arg3) {
        this.field8055 = arg0;
        this.field8056 = class54.method335(arg1, arg0, (byte) 111, arg2, arg3 ? 6408 : 6407);
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lck;IIII)V", line = 934)
    public class634(class733 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field8055 = arg0;
        this.field8056 = class732.method3907(arg4, arg1, -90, arg2, arg0, arg3);
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lck;II[III)V", line = 944)
    public class634(class733 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field8055 = arg0;
        this.field8056 = class345.method2000(arg0, arg4, (byte) -25, arg3, arg5, false, arg1, arg2);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "()I", line = 151)
    public final int method612() {
        field8052++;
        return this.field8056.field771;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V", line = 159)
    public static final void method3383(int arg0) {
        int var1 = 68 % ((arg0 - 31) / 36);
        field8038++;
        for (class195 var2 = (class195) class604.field7674.method3591(0); var2 != null; var2 = (class195) class604.field7674.method3600((byte) 46)) {
            class127 var3 = var2.field2705;
            if (var3.field1691) {
                var2.method1946(-10364);
                var3.method744(0);
            } else if (class693.field8900 >= var3.field1693) {
                var3.method742(class621.field7858, 44);
                if (var3.field1691) {
                    var2.method1946(-10364);
                } else {
                    class376.method2154(var3, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "()I", line = 195)
    public final int method623() {
        field8065++;
        return this.field8056.field770 + this.field8044 + this.field8042;
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "()I", line = 203)
    public final int method628() {
        field8046++;
        return this.field8056.field771 + this.field8066 + this.field8037;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIII[III)V", line = 211)
    private final void method3384(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        field8035++;
        this.field8056.method2867(true, arg4, arg5, arg2, arg0, arg1, 0, arg6, arg3);
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)Lvc;", line = 221)
    public static final class622 method3385(int arg0) {
        int var1 = 85 / ((arg0 - 26) / 60);
        field8043++;
        class622 var2 = (class622) class96.field1307.method856(17737);
        if (var2 == null) {
            return new class622();
        } else {
            class136.field1802--;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V", line = 247)
    private final void method3386(int arg0) {
        field8058++;
        this.field8055.method3945(1, false);
        this.field8055.method3975((byte) 117, null);
        this.field8055.method3917(42, 8448, 8448);
        this.field8055.method3954(1, 768, 34168, (byte) 102);
        this.field8055.method3922(0, 1, 770, 5890);
        if (arg0 == -16134) {
            this.field8055.method3945(0, false);
            this.field8055.method3954(1, 768, 34168, (byte) 109);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)Lfi;", line = 264)
    public static final class13 method3387(byte arg0) {
        field8039++;
        class13 var1 = class359.method2074(0);
        if (arg0 == -117) {
            var1.field132 = null;
            var1.field133 = 0;
            var1.field130 = new class740(5000);
            return var1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "()I", line = 281)
    public final int method620() {
        field8067++;
        return this.field8056.field770;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([I)V", line = 291)
    public final void method615(int[] arg0) {
        arg0[3] = this.field8037;
        field8054++;
        arg0[2] = this.field8042;
        arg0[1] = this.field8066;
        arg0[0] = this.field8044;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(II)V", line = 305)
    private final void method3388(int arg0, int arg1) {
        field8036++;
        this.field8055.method3945(1, false);
        this.field8055.method3975((byte) 114, this.field8056);
        this.field8055.method3917(92, this.field8055.method3990(-89, arg1), 7681);
        this.field8055.method3954(1, 768, 34167, (byte) 106);
        this.field8055.method3922(0, 1, 770, 34168);
        this.field8055.method3945(0, false);
        if (arg0 < 111) {
            return;
        }
        this.field8055.method3975((byte) 121, this.field8050);
        this.field8055.method3917(122, 34479, 7681);
        this.field8055.method3954(1, 768, 34166, (byte) 125);
        if (this.field8041 == 0) {
            this.field8055.method3965(0.5F, 0.5F, 0.0F, 1.0F, 0);
        } else if (this.field8041 == 1) {
            this.field8055.method3965(0.5F, 1.0F, 0.0F, 0.5F, 0);
        } else if (this.field8041 == 2) {
            this.field8055.method3965(1.0F, 0.5F, 0.0F, 0.5F, 0);
            return;
        } else if (this.field8041 == 3) {
            this.field8055.method3965(128.5F, 128.5F, 0.0F, 128.5F, 0);
            return;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIII)V", line = 347)
    public final void method622(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8048++;
        if (!this.field8055.field9897) {
            this.field8056.method2866(arg0, true, arg1, arg5, arg3, arg2, arg4);
            return;
        }
        int[] var7 = this.field8055.method968(arg4, arg5, arg2, arg3);
        if (var7 == null) {
            return;
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = class77.method473(var7[var8], -16777216);
        }
        this.method3384(arg0, arg1, arg2, arg3, var7, 0, arg2);
        return;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(IIIIIII)V", line = 387)
    public final void method625(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8061++;
        int var8 = arg0 + arg2;
        this.field8056.method759(0, false);
        int var9 = arg1 + arg3;
        this.field8055.method3914((byte) -89);
        this.field8055.method3975((byte) 117, this.field8056);
        this.field8055.method3920(arg6, 9770);
        this.field8055.method3979((byte) -72, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field8056.field773 && !this.field8062) {
            float var10 = (float) arg3 * this.field8056.field768 / (float) this.field8056.field771;
            float var11 = (float) arg2 * this.field8056.field772 / (float) this.field8056.field770;
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
        OpenGL.glTranslatef((float) this.field8044, (float) this.field8066, 0.0F);
        int var12 = this.method623();
        int var13 = this.method628();
        int var14 = this.field8056.field771 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = this.field8056.field770 + arg0;
            int var21 = arg0;
            while (var20 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field8056.field768);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field8056.field772, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field8056.field772, this.field8056.field768);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field8056.field772 / (float) this.field8056.field770;
                OpenGL.glTexCoord2f(0.0F, this.field8056.field768);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field8056.field768);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (this.field8056.field771 + var15 - var9) * this.field8056.field768 / (float) this.field8056.field771;
            int var17 = this.field8056.field770 + arg0;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field8056.field768);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field8056.field772, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field8056.field772, this.field8056.field768);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field8056.field772 / (float) this.field8056.field770;
                OpenGL.glTexCoord2f(0.0F, this.field8056.field768);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field8056.field768);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIIII)V", line = 526)
    public final void method618(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field8056.method759(0, (arg7 & 0x1) != 0);
        field8045++;
        this.field8055.method3914((byte) -85);
        this.field8055.method3920(arg6, 9770);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field8062) {
            float var9 = (float) arg2 / (float) this.method623();
            float var10 = (float) arg3 / (float) this.method628();
            float var11 = (float) this.field8044 * var9 + (float) arg0;
            float var12 = (float) this.field8066 * var10 + (float) arg1;
            float var13 = (float) this.field8056.field770 * var9 + var11;
            float var14 = (float) this.field8056.field771 * var10 + var12;
            if (this.field8050 == null) {
                this.field8055.method3975((byte) 121, this.field8056);
                this.field8055.method3979((byte) -124, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field8056.field768);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field8056.field772, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field8056.field772, this.field8056.field768);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method3388(120, arg4);
                this.field8050.method759(0, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field8056.field768);
                OpenGL.glTexCoord2f(0.0F, this.field8056.field768);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field8056.field772, 0.0F);
                OpenGL.glTexCoord2f(this.field8056.field772, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field8056.field772, this.field8056.field768);
                OpenGL.glTexCoord2f(this.field8056.field772, this.field8056.field768);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method3386(-16134);
            }
        } else if (this.field8050 == null) {
            this.field8055.method3975((byte) 124, this.field8056);
            this.field8055.method3979((byte) 74, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field8056.field768);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field8056.field772, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field8056.field772, this.field8056.field768);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method3388(118, arg4);
            this.field8050.method759(0, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field8056.field768);
            OpenGL.glTexCoord2f(0.0F, this.field8056.field768);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field8056.field772, 0.0F);
            OpenGL.glTexCoord2f(this.field8056.field772, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field8056.field772, this.field8056.field768);
            OpenGL.glTexCoord2f(this.field8056.field772, this.field8056.field768);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method3386(-16134);
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)V", line = 630)
    public static void method3389(byte arg0) {
        if (arg0 == 118) {
            field8053 = null;
            field8064 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILaa;II)V", line = 641)
    public final void method621(int arg0, int arg1, class596 arg2, int arg3, int arg4) {
        field8040++;
        class787 var6 = (class787) arg2;
        class59 var7 = var6.field10781;
        this.field8056.method759(0, false);
        this.field8055.method3914((byte) -94);
        this.field8055.method3975((byte) 125, this.field8056);
        this.field8055.method3979((byte) 62, 1);
        this.field8055.method3945(1, false);
        this.field8055.method3975((byte) 113, var7);
        this.field8055.method3917(48, 7681, 8448);
        this.field8055.method3954(0, 768, 34168, (byte) 106);
        this.field8055.method3920(1, 9770);
        int var8 = this.field8066 + arg1;
        int var9 = this.field8044 + arg0;
        int var10 = this.field8056.field770 + var9;
        int var11 = this.field8056.field771 + var8;
        float var12 = var7.field772 / (float) var7.field770;
        float var13 = var7.field768 / (float) var7.field771;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field768 - (float) (var8 - arg4) * var13;
        float var17 = var7.field768 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field8056.field768);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, var8 + this.field8056.field771);
        OpenGL.glMultiTexCoord2f(33984, this.field8056.field772, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(var9 + this.field8056.field770, this.field8056.field771 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field8056.field772, this.field8056.field768);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field8056.field770 + var9, var8);
        OpenGL.glEnd();
        this.field8055.method3954(0, 768, 5890, (byte) 103);
        this.field8055.method3979((byte) 124, 0);
        this.field8055.method3975((byte) 122, null);
        this.field8055.method3945(0, false);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(FFFFFFIIII)V", line = 706)
    public final void method614(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field8062) {
            float var11 = (float) this.method623();
            float var12 = (float) this.method628();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field8066 * var15;
            float var18 = (float) this.field8066 * var16;
            float var19 = (float) this.field8044 * var13;
            float var20 = (float) this.field8044 * var14;
            float var21 = (float) this.field8042 * -var13;
            float var22 = (float) this.field8042 * -var14;
            float var23 = (float) this.field8037 * -var15;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            float var24 = (float) this.field8037 * -var16;
            arg4 = arg4 + var19 + var23;
            arg3 = arg3 + var22 + var18;
            arg0 = arg0 + var19 + var17;
            arg5 = arg5 + var20 + var24;
        }
        field8049++;
        float var25 = arg2 + arg4 - arg0;
        this.field8056.method759(0, (arg9 & 0x1) != 0);
        float var26 = arg5 + arg3 - arg1;
        this.field8055.method3914((byte) -98);
        this.field8055.method3975((byte) 119, this.field8056);
        this.field8055.method3920(arg8, 9770);
        this.field8055.method3979((byte) -53, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field8056.field768);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field8056.field772, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field8056.field772, this.field8056.field768);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZBIIII)V", line = 774)
    public static final void method3390(boolean arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field8060++;
        if (arg4 < 1) {
            arg4 = 1;
        }
        if (arg2 < 1) {
            arg2 = 1;
        }
        int var6 = arg2 - 334;
        int var7 = -16 / ((-arg1 - 22) / 53);
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var8 = (class410.field5434 - class698.field9257) * var6 / 100 + class698.field9257;
        if (class336.field4093 > var8) {
            var8 = class336.field4093;
        } else if (var8 > class151.field1920) {
            var8 = class151.field1920;
        }
        int var9 = arg2 * 512 * var8 / (arg4 * 334);
        if (var9 < class88.field1222) {
            short var10 = class88.field1222;
            var8 = arg4 * 334 * var10 / (arg2 * 512);
            if (class151.field1920 < var8) {
                var8 = class151.field1920;
                int var11 = arg2 * 512 * var8 / (var10 * 334);
                int var12 = (arg4 - var11) / 2;
                if (arg0) {
                    class576.field7320.method957();
                    class576.field7320.method3068(false, arg3, arg5, var12, -16777216, arg2);
                    class576.field7320.method3068(false, arg4 + arg3 - var12, arg5, var12, -16777216, arg2);
                }
                arg3 += var12;
                arg4 -= var12 * 2;
            }
        } else if (class365.field4464 < var9) {
            short var13 = class365.field4464;
            var8 = var13 * 334 * arg4 / (arg2 * 512);
            if (var8 < class336.field4093) {
                var8 = class336.field4093;
                int var14 = var13 * 334 * arg4 / (var8 * 512);
                int var15 = (arg2 - var14) / 2;
                if (arg0) {
                    class576.field7320.method957();
                    class576.field7320.method3068(false, arg3, arg5, arg4, -16777216, var15);
                    class576.field7320.method3068(false, arg3, arg5 + arg2 - var15, arg4, -16777216, var15);
                }
                arg2 -= var15 * 2;
                arg5 += var15;
            }
        }
        class368.field4503 = (short) arg2;
        class203.field2817 = arg3;
        class244.field3360 = arg5;
        class438.field5765 = arg2 * var8 / 334;
        class281.field3639 = (short) arg4;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIII)V", line = 871)
    public final void method616(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field8056.method759(0, false);
        field8059++;
        this.field8055.method3914((byte) -124);
        this.field8055.method3920(arg4, 9770);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field8066 + arg1;
        int var7 = this.field8044 + arg0;
        if (this.field8050 == null) {
            this.field8055.method3975((byte) 124, this.field8056);
            this.field8055.method3979((byte) 99, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field8056.field768);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, this.field8056.field771 + var6);
            OpenGL.glTexCoord2f(this.field8056.field772, 0.0F);
            OpenGL.glVertex2i(this.field8056.field770 + var7, var6 - -this.field8056.field771);
            OpenGL.glTexCoord2f(this.field8056.field772, this.field8056.field768);
            OpenGL.glVertex2i(this.field8056.field770 + var7, var6);
            OpenGL.glEnd();
            return;
        }
        this.method3388(123, arg2);
        this.field8050.method759(0, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field8056.field768);
        OpenGL.glTexCoord2f(0.0F, this.field8056.field768);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, this.field8056.field771 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field8056.field772, 0.0F);
        OpenGL.glTexCoord2f(this.field8056.field772, 0.0F);
        OpenGL.glVertex2i(this.field8056.field770 + var7, this.field8056.field771 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field8056.field772, this.field8056.field768);
        OpenGL.glTexCoord2f(this.field8056.field772, this.field8056.field768);
        OpenGL.glVertex2i(this.field8056.field770 + var7, var6);
        OpenGL.glEnd();
        this.method3386(-16134);
    }
}
