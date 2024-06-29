import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class517 extends class21 {

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "Z")
    private boolean field7203 = false;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
    private int field7212 = 0;

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
    private int field7214 = 0;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    private int field7205 = 0;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
    private int field7209 = 0;

    @OriginalMember(owner = "client!kn", name = "t", descriptor = "I")
    private int field7219 = 0;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "Lep;")
    private class371 field7213;

    @OriginalMember(owner = "client!kn", name = "r", descriptor = "Ldd;")
    private class146 field7217;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "Lqk;")
    public static class148 field7201 = new class148(55, 6);

    @OriginalMember(owner = "client!kn", name = "z", descriptor = "Lqk;")
    public static class148 field7225 = new class148(110, 6);

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field7200;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field7202;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    public static int field7204;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    public static int field7206;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public static int field7207;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "I")
    public static int field7215;

    @OriginalMember(owner = "client!kn", name = "q", descriptor = "I")
    public static int field7216;

    @OriginalMember(owner = "client!kn", name = "s", descriptor = "I")
    public static int field7218;

    @OriginalMember(owner = "client!kn", name = "u", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!kn", name = "v", descriptor = "I")
    public static int field7221;

    @OriginalMember(owner = "client!kn", name = "w", descriptor = "I")
    public static int field7222;

    @OriginalMember(owner = "client!kn", name = "x", descriptor = "I")
    public static int field7223;

    @OriginalMember(owner = "client!kn", name = "y", descriptor = "I")
    public static int field7224;

    @OriginalMember(owner = "client!kn", name = "A", descriptor = "I")
    public static int field7226;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "Ldd;")
    private class146 field7210;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(IIII)V", line = 4)
    public final void method106(int arg0, int arg1, int arg2, int arg3) {
        this.field7209 = arg3;
        this.field7205 = arg1;
        field7216++;
        this.field7214 = arg0;
        this.field7219 = arg2;
        this.field7203 = this.field7214 != 0 || this.field7205 != 0 || this.field7219 != 0 || this.field7209 != 0;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V", line = 16)
    public static void method3073(int arg0) {
        field7225 = null;
        field7201 = null;
        int var1 = 118 % ((12 - arg0) / 48);
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "()I", line = 28)
    public final int method115() {
        field7224++;
        return this.field7217.field2023;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIIIII)V", line = 45)
    public final void method107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field7217.method2419((arg7 & 0x1) != 0, true);
        field7218++;
        this.field7213.method2185((byte) 84);
        this.field7213.method2121(arg6, 1);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field7203) {
            float var9 = (float) arg2 / (float) this.method116();
            float var10 = (float) arg3 / (float) this.method108();
            float var11 = (float) this.field7214 * var9 + (float) arg0;
            float var12 = (float) this.field7205 * var10 + (float) arg1;
            float var13 = (float) this.field7217.field2023 * var9 + var11;
            float var14 = (float) this.field7217.field2028 * var10 + var12;
            if (this.field7210 == null) {
                this.field7213.method2154(this.field7217, -2);
                this.field7213.method2208(arg4, 6406);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field7217.field2019);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glTexCoord2f(this.field7217.field2025, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glTexCoord2f(this.field7217.field2025, this.field7217.field2019);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
            } else {
                this.method3074(arg4, -14567);
                this.field7210.method2419(true, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field7217.field2019);
                OpenGL.glTexCoord2f(0.0F, this.field7217.field2019);
                OpenGL.glVertex2f(var11, var12);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var11, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field7217.field2025, 0.0F);
                OpenGL.glTexCoord2f(this.field7217.field2025, 0.0F);
                OpenGL.glVertex2f(var13, var14);
                OpenGL.glMultiTexCoord2f(33985, this.field7217.field2025, this.field7217.field2019);
                OpenGL.glTexCoord2f(this.field7217.field2025, this.field7217.field2019);
                OpenGL.glVertex2f(var13, var12);
                OpenGL.glEnd();
                this.method3076(1);
            }
        } else if (this.field7210 == null) {
            this.field7213.method2154(this.field7217, -2);
            this.field7213.method2208(arg4, 6406);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field7217.field2019);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field7217.field2025, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field7217.field2025, this.field7217.field2019);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method3074(arg4, -14567);
            this.field7210.method2419(true, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field7217.field2019);
            OpenGL.glTexCoord2f(0.0F, this.field7217.field2019);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field7217.field2025, 0.0F);
            OpenGL.glTexCoord2f(this.field7217.field2025, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field7217.field2025, this.field7217.field2019);
            OpenGL.glTexCoord2f(this.field7217.field2025, this.field7217.field2019);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method3076(1);
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lep;IIZ)V", line = 744)
    public class517(class371 arg0, int arg1, int arg2, boolean arg3) {
        this.field7213 = arg0;
        this.field7217 = class566.method3388(arg0, arg2, arg3 ? 6408 : 6407, 3553, arg1);
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lep;IIII)V", line = 754)
    public class517(class371 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7213 = arg0;
        this.field7217 = client.method2680(arg3, arg1, arg4, arg2, arg0, -1);
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lep;II[III)V", line = 764)
    public class517(class371 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field7213 = arg0;
        this.field7217 = class5.method21(arg5, arg4, 3553, arg0, arg2, arg1, false, arg3);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(FFFFFFIIII)V", line = 154)
    public final void method123(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field7211++;
        if (this.field7203) {
            float var11 = (float) this.method116();
            float var12 = (float) this.method108();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field7205 * var15;
            float var18 = (float) this.field7205 * var16;
            float var19 = (float) this.field7214 * var13;
            float var20 = (float) this.field7214 * var14;
            float var21 = (float) this.field7219 * -var13;
            float var22 = (float) this.field7219 * -var14;
            float var23 = (float) this.field7209 * -var15;
            arg3 = arg3 + var22 + var18;
            arg4 = arg4 + var19 + var23;
            arg0 = arg0 + var19 + var17;
            arg2 = arg2 + var21 + var17;
            arg1 = arg1 + var20 + var18;
            float var24 = (float) this.field7209 * -var16;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field7217.method2419((arg9 & 0x1) != 0, true);
        this.field7213.method2185((byte) 123);
        this.field7213.method2154(this.field7217, -2);
        this.field7213.method2121(arg8, 1);
        this.field7213.method2208(arg6, 6406);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field7217.field2019);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field7217.field2025, 0.0F);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glTexCoord2f(this.field7217.field2025, this.field7217.field2019);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(II)V", line = 226)
    private final void method3074(int arg0, int arg1) {
        field7215++;
        this.field7213.method2196(1, (byte) 89);
        this.field7213.method2154(this.field7217, arg1 ^ 0x38E7);
        if (arg1 != -14567) {
            this.field7203 = false;
        }
        this.field7213.method2207(this.field7213.method2210(arg0, -87), 7681, -25248);
        this.field7213.method2202(390803672, 768, 34167, 1);
        this.field7213.method2190(0, 770, true, 34168);
        this.field7213.method2196(0, (byte) 89);
        this.field7213.method2154(this.field7210, -2);
        this.field7213.method2207(34479, 7681, -25248);
        this.field7213.method2202(arg1 ^ 0xE8B4F7C1, 768, 34166, 1);
        if (this.field7212 == 0) {
            this.field7213.method2155(0.5F, 1.0F, 0.5F, arg1 + 14632, 0.0F);
        } else if (this.field7212 == 1) {
            this.field7213.method2155(1.0F, 0.5F, 0.5F, 71, 0.0F);
        } else if (this.field7212 == 2) {
            this.field7213.method2155(0.5F, 0.5F, 1.0F, 102, 0.0F);
            return;
        } else if (this.field7212 == 3) {
            this.field7213.method2155(128.5F, 128.5F, 128.5F, 79, 0.0F);
            return;
        }
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "()I", line = 261)
    public final int method116() {
        field7204++;
        return this.field7217.field2023 + this.field7214 + this.field7219;
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V", line = 286)
    public static final void method3075(int arg0) {
        field7206++;
        if (class312.field4004 == -1) {
            return;
        }
        int var1 = class93.field1263.method805(0);
        if (arg0 != 4084) {
            method3075(30);
        }
        int var2 = class93.field1263.method806(arg0 - 4084);
        class12 var3 = (class12) class36.field508.method3118((byte) 73);
        if (var3 != null) {
            var1 = var3.method63(5245);
            var2 = var3.method64(-1);
        }
        int var4 = 0;
        int var5 = 0;
        if (class264.field3595) {
            var4 = class468.method2788(false);
            var5 = class142.method934((byte) -88);
        }
        class15.method79(var1 + var4, var4, var5, class58.field807 + var4, arg0 + -4085, class582.field8281 + var5, var1, class312.field4004, var2 + var5, var5, var2, var4);
        if (class355.field4559 != null) {
            class655.method3785(-113, var2 + var5, var1 + var4);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIIII)V", line = 325)
    public final void method105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7208++;
        int var8 = arg0 + arg2;
        int var9 = arg1 + arg3;
        this.field7217.method2419(false, true);
        this.field7213.method2185((byte) 99);
        this.field7213.method2154(this.field7217, -2);
        this.field7213.method2121(arg6, 1);
        this.field7213.method2208(arg4, 6406);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field7217.field2022 && !this.field7203) {
            float var10 = (float) arg3 * this.field7217.field2019 / (float) this.field7217.field2028;
            float var11 = (float) arg2 * this.field7217.field2025 / (float) this.field7217.field2023;
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
        OpenGL.glTranslatef((float) this.field7214, (float) this.field7205, 0.0F);
        int var12 = this.method116();
        int var13 = this.method108();
        int var14 = arg1 + this.field7217.field2028;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = this.field7217.field2023 + arg0;
            int var21 = arg0;
            while (var8 >= var20) {
                OpenGL.glTexCoord2f(0.0F, this.field7217.field2019);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field7217.field2025, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field7217.field2025, this.field7217.field2019);
                OpenGL.glVertex2i(var20, var15);
                var20 += var12;
                var21 += var12;
            }
            if (var8 > var21) {
                float var22 = (float) (var8 - var21) * this.field7217.field2025 / (float) this.field7217.field2023;
                OpenGL.glTexCoord2f(0.0F, this.field7217.field2019);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field7217.field2019);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var15 < var9) {
            float var16 = (float) (var15 + this.field7217.field2028 - var9) * this.field7217.field2019 / (float) this.field7217.field2028;
            int var17 = arg0 + this.field7217.field2023;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field7217.field2019);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field7217.field2025, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field7217.field2025, this.field7217.field2019);
                OpenGL.glVertex2i(var17, var15);
                var18 += var12;
                var17 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field7217.field2025 / (float) this.field7217.field2023;
                OpenGL.glTexCoord2f(0.0F, this.field7217.field2019);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field7217.field2019);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)V", line = 462)
    private final void method3076(int arg0) {
        field7202++;
        this.field7213.method2196(1, (byte) 89);
        this.field7213.method2154(null, ~arg0);
        this.field7213.method2207(8448, 8448, arg0 - 25249);
        this.field7213.method2202(390803672, 768, 34168, arg0);
        this.field7213.method2190(0, 770, true, 5890);
        this.field7213.method2196(0, (byte) 89);
        this.field7213.method2202(390803672, 768, 34168, 1);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)V", line = 484)
    public final void method120(int arg0, int arg1, int arg2) {
        field7221++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field7210 = client.method2680(this.field7217.field2023, arg0, this.field7217.field2028, arg1, this.field7213, -1);
        this.field7212 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIII)V", line = 507)
    public final void method104(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7226++;
        this.field7217.method2419(false, true);
        this.field7213.method2185((byte) 58);
        this.field7213.method2121(arg4, 1);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field7214 + arg0;
        int var7 = this.field7205 + arg1;
        if (this.field7210 == null) {
            this.field7213.method2154(this.field7217, -2);
            this.field7213.method2208(arg2, 6406);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field7217.field2019);
            OpenGL.glVertex2i(var6, var7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var6, this.field7217.field2028 + var7);
            OpenGL.glTexCoord2f(this.field7217.field2025, 0.0F);
            OpenGL.glVertex2i(this.field7217.field2023 + var6, this.field7217.field2028 + var7);
            OpenGL.glTexCoord2f(this.field7217.field2025, this.field7217.field2019);
            OpenGL.glVertex2i(this.field7217.field2023 + var6, var7);
            OpenGL.glEnd();
            return;
        }
        this.method3074(arg2, -14567);
        this.field7210.method2419(false, true);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field7217.field2019);
        OpenGL.glTexCoord2f(0.0F, this.field7217.field2019);
        OpenGL.glVertex2i(var6, var7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var6, this.field7217.field2028 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field7217.field2025, 0.0F);
        OpenGL.glTexCoord2f(this.field7217.field2025, 0.0F);
        OpenGL.glVertex2i(var6 + this.field7217.field2023, this.field7217.field2028 + var7);
        OpenGL.glMultiTexCoord2f(33985, this.field7217.field2025, this.field7217.field2019);
        OpenGL.glTexCoord2f(this.field7217.field2025, this.field7217.field2019);
        OpenGL.glVertex2i(var6 + this.field7217.field2023, var7);
        OpenGL.glEnd();
        this.method3076(1);
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "()I", line = 558)
    public final int method117() {
        field7222++;
        return this.field7217.field2028;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 571)
    public final void method103(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class571 arg7, int arg8, int arg9) {
        field7207++;
        class146 var11 = ((class669) arg7).field9416;
        if (this.field7203) {
            float var12 = (float) this.method116();
            float var13 = (float) this.method108();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field7205 * var16;
            float var19 = (float) this.field7205 * var17;
            float var20 = (float) this.field7214 * var14;
            float var21 = (float) this.field7214 * var15;
            float var22 = (float) this.field7219 * -var14;
            float var23 = (float) this.field7219 * -var15;
            float var24 = (float) this.field7209 * -var16;
            arg4 = arg4 + var20 + var24;
            arg3 = arg3 + var23 + var19;
            arg0 = arg0 + var20 + var18;
            arg1 = arg1 + var21 + var19;
            float var25 = (float) this.field7209 * -var17;
            arg2 = arg2 + var22 + var18;
            arg5 = arg5 + var21 + var25;
        }
        float var26 = arg2 + arg4 - arg0;
        float var27 = arg5 + arg3 - arg1;
        this.field7217.method2419((arg6 & 0x1) != 0, true);
        this.field7213.method2185((byte) 122);
        this.field7213.method2154(this.field7217, -2);
        this.field7213.method2208(1, 6406);
        this.field7213.method2196(1, (byte) 89);
        this.field7213.method2154(var11, -2);
        this.field7213.method2207(7681, 8448, -25248);
        this.field7213.method2202(390803672, 768, 34168, 0);
        this.field7213.method2121(1, 1);
        float var28 = var11.field2025 / (float) var11.field2023;
        float var29 = var11.field2019 / (float) var11.field2028;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field7217.field2019);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg8) * var28, var11.field2019 - (((float) (-arg9) + arg1) * var29));
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg8) * var28, var11.field2019 - ((float) (-arg9) + arg5) * var29);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field7217.field2025, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + var26) * var28, var11.field2019 - (((float) (-arg9) + var27) * var29));
        OpenGL.glVertex2f(var26, var27);
        OpenGL.glMultiTexCoord2f(33984, this.field7217.field2025, this.field7217.field2019);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg8) * var28, var11.field2019 - ((arg3 - (float) arg9) * var29));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field7213.method2202(390803672, 768, 5890, 0);
        this.field7213.method2208(0, 6406);
        this.field7213.method2154(null, -2);
        this.field7213.method2196(0, (byte) 89);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "()I", line = 661)
    public final int method108() {
        field7200++;
        return this.field7217.field2028 + this.field7205 + this.field7209;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IILaa;II)V", line = 669)
    public final void method119(int arg0, int arg1, class571 arg2, int arg3, int arg4) {
        field7223++;
        class669 var6 = (class669) arg2;
        class146 var7 = var6.field9416;
        this.field7217.method2419(false, true);
        this.field7213.method2185((byte) 91);
        this.field7213.method2154(this.field7217, -2);
        this.field7213.method2208(1, 6406);
        this.field7213.method2196(1, (byte) 89);
        this.field7213.method2154(var7, -2);
        this.field7213.method2207(7681, 8448, -25248);
        this.field7213.method2202(390803672, 768, 34168, 0);
        this.field7213.method2121(1, 1);
        int var8 = this.field7205 + arg1;
        int var9 = this.field7214 + arg0;
        int var10 = this.field7217.field2023 + var9;
        int var11 = this.field7217.field2028 + var8;
        float var12 = var7.field2025 / (float) var7.field2023;
        float var13 = var7.field2019 / (float) var7.field2028;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field2019 - ((float) (var8 - arg4) * var13);
        float var17 = var7.field2019 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field7217.field2019);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, this.field7217.field2028 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field7217.field2025, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field7217.field2023 + var9, this.field7217.field2028 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field7217.field2025, this.field7217.field2019);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field7217.field2023 + var9, var8);
        OpenGL.glEnd();
        this.field7213.method2202(390803672, 768, 5890, 0);
        this.field7213.method2208(0, 6406);
        this.field7213.method2154(null, -2);
        this.field7213.method2196(0, (byte) 89);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIII)V", line = 728)
    public final void method118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7220++;
        this.field7217.method1363(arg0, arg2, 0, arg3, arg4, arg5, arg1);
    }
}
