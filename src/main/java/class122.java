import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class122 extends class260 {

    @OriginalMember(owner = "client!rk", name = "K", descriptor = "I")
    public int field2020 = 0;

    @OriginalMember(owner = "client!rk", name = "L", descriptor = "I")
    public int field2021 = -1;

    @OriginalMember(owner = "client!rk", name = "Q", descriptor = "I")
    private int field2026 = -1;

    @OriginalMember(owner = "client!rk", name = "P", descriptor = "I")
    private int field2025 = 0;

    @OriginalMember(owner = "client!rk", name = "M", descriptor = "I")
    public int field2022;

    @OriginalMember(owner = "client!rk", name = "N", descriptor = "I")
    private int field2023;

    @OriginalMember(owner = "client!rk", name = "O", descriptor = "I")
    public int field2024;

    @OriginalMember(owner = "client!rk", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() throws Throwable {
        if (this.field2021 != -1) {
            class104.method790(this.field2021, this.field2020, this.field2023);
            this.field2021 = -1;
            this.field2020 = 0;
        }
        if (this.field2026 != -1) {
            class104.method784(this.field2026, this.field2023);
            this.field2026 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(IIII)V", line = 23)
    public final void method905(int arg0, int arg1, int arg2, int arg3) {
        class55.method410();
        GL var5 = class55.field812;
        class55.method407(this.field2021);
        this.method906(1);
        float var6 = (float) this.field4342 / (float) this.field2024;
        float var7 = (float) this.field4337 / (float) this.field2022;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field4340 + arg0;
        int var11 = this.field4342 * arg2 + var10;
        int var12 = class55.field806 - arg1 - this.field4345;
        int var13 = var12 - this.field4337 * arg3;
        var5.glBegin(6);
        var5.glTexCoord2f(var8, 0.0F);
        var5.glVertex2f((float) var11, (float) var12);
        var5.glTexCoord2f(0.0F, 0.0F);
        var5.glVertex2f((float) var10, (float) var12);
        var5.glTexCoord2f(0.0F, var9);
        var5.glVertex2f((float) var10, (float) var13);
        var5.glTexCoord2f(var8, var9);
        var5.glVertex2f((float) var11, (float) var13);
        var5.glEnd();
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIII)V", line = 55)
    public final void method332(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class55.method410();
        int var5 = this.field4342;
        int var6 = this.field4337;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field4336;
        int var10 = this.field4335;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field4340 > 0) {
            int var13 = ((this.field4340 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field4340 << 16);
        }
        if (this.field4345 > 0) {
            int var14 = ((this.field4345 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field4345 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class55.field812;
        class55.method407(this.field2021);
        this.method906(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class55.field806 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field4342 / (float) this.field2024;
        float var21 = (float) this.field4337 / (float) this.field2022;
        var15.glBegin(6);
        var15.glTexCoord2f(var20, 0.0F);
        var15.glVertex2f(var17, var18);
        var15.glTexCoord2f(0.0F, 0.0F);
        var15.glVertex2f(var16, var18);
        var15.glTexCoord2f(0.0F, var21);
        var15.glVertex2f(var16, var19);
        var15.glTexCoord2f(var20, var21);
        var15.glVertex2f(var17, var19);
        var15.glEnd();
    }

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "(I)V", line = 126)
    private final void method906(int arg0) {
        if (this.field2025 == arg0) {
            return;
        }
        this.field2025 = arg0;
        GL var2 = class55.field812;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(IIIIII)V", line = 145)
    public final void method907(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class55.method410();
        GL var7 = class55.field812;
        class55.method407(this.field2021);
        this.method906(2);
        int var8 = arg0 - (this.field4340 << 4);
        int var9 = arg1 - (this.field4345 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class55.field806 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field2026);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)V", line = 162)
    public final void method347(int arg0, int arg1, int arg2) {
        class55.method394();
        int var4 = this.field4340 + arg0;
        int var5 = this.field4345 + arg1;
        GL var6 = class55.field812;
        class55.method407(this.field2021);
        this.method906(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class55.field806 - var5), 0.0F);
        var6.glCallList(this.field2026);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "([I)V", line = 176)
    public void method507(int[] arg0) {
        this.field2024 = class43.method293(true, this.field4342);
        this.field2022 = class43.method293(true, this.field4337);
        byte[] var2 = new byte[this.field2024 * this.field2022 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field2024 - this.field4342) * 4;
        for (int var6 = 0; var6 < this.field4337; var6++) {
            for (int var7 = 0; var7 < this.field4342; var7++) {
                int var8 = arg0[var4++];
                if (var8 == 0) {
                    var3 += 4;
                } else {
                    var2[var3++] = (byte) (var8 >> 16);
                    var2[var3++] = (byte) (var8 >> 8);
                    var2[var3++] = (byte) var8;
                    var2[var3++] = -1;
                }
            }
            var3 += var5;
        }
        ByteBuffer var9 = ByteBuffer.wrap(var2);
        GL var10 = class55.field812;
        if (this.field2021 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field2021 = var11[0];
            this.field2023 = class104.field1712;
        }
        class55.method407(this.field2021);
        var10.glTexImage2D(3553, 0, 6408, this.field2024, this.field2022, 0, 6408, 5121, var9);
        class104.field1714 += var9.limit() - this.field2020;
        this.field2020 = var9.limit();
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILrk;)V", line = 236)
    public final void method908(int arg0, int arg1, class122 arg2) {
        if (arg2 == null) {
            return;
        }
        class55.method410();
        class55.method407(arg2.field2021);
        arg2.method906(1);
        GL var4 = class55.field812;
        class55.method407(this.field2021);
        this.method906(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field2021);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class240.field3999) / (float) arg2.field2024;
        float var6 = (float) (arg1 - class240.field3997) / (float) arg2.field2022;
        float var7 = (float) (this.field4342 + arg0 - class240.field3999) / (float) arg2.field2024;
        float var8 = (float) (this.field4337 + arg1 - class240.field3997) / (float) arg2.field2022;
        int var9 = this.field4340 + arg0;
        int var10 = this.field4345 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field4342 / (float) this.field2024;
        float var12 = (float) this.field4337 / (float) this.field2022;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field4342 + var9), (float) (class55.field806 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class55.field806 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class55.field806 - (this.field4337 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field4342 + var9), (float) (class55.field806 - (this.field4337 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIII)V", line = 286)
    public final void method339(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class55.method394();
        int var6 = this.field4342;
        int var7 = this.field4337;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field4336;
        int var11 = this.field4335;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field4340 > 0) {
            int var14 = ((this.field4340 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field4340 << 16);
        }
        if (this.field4345 > 0) {
            int var15 = ((this.field4345 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field4345 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class55.field812;
        class55.method407(this.field2021);
        this.method906(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class55.field806 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field4342 / (float) this.field2024;
        float var22 = (float) this.field4337 / (float) this.field2022;
        float var23 = (float) arg4 / 256.0F;
        var16.glBegin(6);
        var16.glColor4f(1.0F, 1.0F, 1.0F, var23);
        var16.glTexCoord2f(var21, 0.0F);
        var16.glVertex2f(var18, var19);
        var16.glTexCoord2f(0.0F, 0.0F);
        var16.glVertex2f(var17, var19);
        var16.glTexCoord2f(0.0F, var22);
        var16.glVertex2f(var17, var20);
        var16.glTexCoord2f(var21, var22);
        var16.glVertex2f(var18, var20);
        var16.glEnd();
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIII)V", line = 359)
    public final void method338(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class55.method410();
        GL var7 = class55.field812;
        class55.method407(this.field2021);
        this.method906(1);
        int var8 = arg0 - (this.field4340 << 4);
        int var9 = arg1 - (this.field4345 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class55.field806 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field2026);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)V", line = 376)
    public final void method341(int arg0, int arg1) {
        class55.method410();
        int var3 = this.field4340 + arg0;
        int var4 = this.field4345 + arg1;
        GL var5 = class55.field812;
        class55.method407(this.field2021);
        this.method906(1);
        var5.glTranslatef((float) var3, (float) (class55.field806 - var4), 0.0F);
        var5.glCallList(this.field2026);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "()V", line = 390)
    private final void method909() {
        float var1 = (float) this.field4342 / (float) this.field2024;
        float var2 = (float) this.field4337 / (float) this.field2022;
        GL var3 = class55.field812;
        if (this.field2026 == -1) {
            this.field2026 = var3.glGenLists(1);
            this.field2023 = class104.field1712;
        }
        var3.glNewList(this.field2026, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field4342, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field4337));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field4342, (float) (-this.field4337));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIIIILrk;)V", line = 415)
    public final void method910(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class122 arg8) {
        if (arg8 == null) {
            return;
        }
        class55.method410();
        class55.method407(arg8.field2021);
        arg8.method906(1);
        GL var10 = class55.field812;
        class55.method407(this.field2021);
        this.method906(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field2021);
        var10.glTexEnvi(8960, 34161, 7681);
        var10.glTexEnvi(8960, 34176, 34168);
        int var11 = -arg2 / 2;
        int var12 = -arg3 / 2;
        int var13 = -var11;
        int var14 = -var12;
        int var15 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
        int var16 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
        int var17 = arg7 * var15 >> 8;
        int var18 = arg7 * var16 >> 8;
        int var19 = (arg4 << 16) + var11 * var18 + var12 * var17;
        int var20 = (arg5 << 16) + (var12 * var18 - var11 * var17);
        int var21 = (arg4 << 16) + var12 * var17 + var13 * var18;
        int var22 = (arg5 << 16) + (var12 * var18 - var13 * var17);
        int var23 = (arg4 << 16) + var11 * var18 + var14 * var17;
        int var24 = (arg5 << 16) + (var14 * var18 - var11 * var17);
        int var25 = (arg4 << 16) + var13 * var18 + var14 * var17;
        int var26 = (arg5 << 16) + (var14 * var18 - var13 * var17);
        float var27 = (float) arg8.field4342 / (float) arg8.field2024;
        float var28 = (float) arg8.field4337 / (float) arg8.field2022;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field2024 * 65536.0F;
        float var30 = (float) (this.field2022 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class55.field806 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class55.field806 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class55.field806 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class55.field806 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(IIIIII[I)V", line = 513)
    public class122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field4336 = arg0;
        this.field4335 = arg1;
        this.field4340 = arg2;
        this.field4345 = arg3;
        this.field4342 = arg4;
        this.field4337 = arg5;
        this.method507(arg6);
        this.method909();
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lgg;)V", line = 523)
    public class122(class47 arg0) {
        this.field4336 = arg0.field4336;
        this.field4335 = arg0.field4335;
        this.field4340 = arg0.field4340;
        this.field4345 = arg0.field4345;
        this.field4342 = arg0.field4342;
        this.field4337 = arg0.field4337;
        this.method507(arg0.field757);
        this.method909();
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(II)V", line = 502)
    public final void method337(int arg0, int arg1) {
        class55.method410();
        int var3 = this.field4340 + arg0;
        int var4 = this.field4345 + arg1;
        GL var5 = class55.field812;
        class55.method407(this.field2021);
        this.method906(1);
        var5.glTranslatef((float) var3, (float) (class55.field806 - var4), 0.0F);
        var5.glCallList(this.field2026);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(IIIII)V", line = 534)
    public final void method911(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class55.method394();
        GL var6 = class55.field812;
        class55.method407(this.field2021);
        this.method906(1);
        float var7 = (float) this.field4342 / (float) this.field2024;
        float var8 = (float) this.field4337 / (float) this.field2022;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field4340 + arg0;
        int var12 = this.field4342 * arg3 + var11;
        int var13 = class55.field806 - arg1 - this.field4345;
        int var14 = var13 - this.field4337 * arg4;
        float var15 = (float) arg2 / 256.0F;
        var6.glBegin(6);
        var6.glColor4f(1.0F, 1.0F, 1.0F, var15);
        var6.glTexCoord2f(var9, 0.0F);
        var6.glVertex2f((float) var12, (float) var13);
        var6.glTexCoord2f(0.0F, 0.0F);
        var6.glVertex2f((float) var11, (float) var13);
        var6.glTexCoord2f(0.0F, var10);
        var6.glVertex2f((float) var11, (float) var14);
        var6.glTexCoord2f(var9, var10);
        var6.glVertex2f((float) var12, (float) var14);
        var6.glEnd();
    }
}
