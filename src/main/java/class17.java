import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class17 extends class199 {

    @OriginalMember(owner = "client!rh", name = "Y", descriptor = "I")
    private int field219 = 0;

    @OriginalMember(owner = "client!rh", name = "N", descriptor = "I")
    public int field218 = 0;

    @OriginalMember(owner = "client!rh", name = "bb", descriptor = "I")
    public int field222 = -1;

    @OriginalMember(owner = "client!rh", name = "cb", descriptor = "I")
    private int field223 = -1;

    @OriginalMember(owner = "client!rh", name = "H", descriptor = "I")
    private int field217;

    @OriginalMember(owner = "client!rh", name = "Z", descriptor = "I")
    public int field220;

    @OriginalMember(owner = "client!rh", name = "ab", descriptor = "I")
    public int field221;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)V", line = 6)
    public final void method77(int arg0, int arg1) {
        class166.method1189();
        int var3 = this.field3195 + arg0;
        int var4 = this.field3188 + arg1;
        GL var5 = class166.field2648;
        class166.method1182(this.field222);
        this.method88(1);
        var5.glTranslatef((float) var3, (float) (class166.field2651 - var4), 0.0F);
        var5.glCallList(this.field223);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(IIII)V", line = 18)
    public final void method78(int arg0, int arg1, int arg2, int arg3) {
        class166.method1189();
        GL var5 = class166.field2648;
        class166.method1182(this.field222);
        this.method88(1);
        float var6 = (float) this.field3200 / (float) this.field220;
        float var7 = (float) this.field3189 / (float) this.field221;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field3195 + arg0;
        int var11 = this.field3200 * arg2 + var10;
        int var12 = class166.field2651 - arg1 - this.field3188;
        int var13 = var12 - this.field3189 * arg3;
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

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)V", line = 49)
    public final void method79(int arg0, int arg1, int arg2) {
        class166.method1176();
        int var4 = this.field3195 + arg0;
        int var5 = this.field3188 + arg1;
        GL var6 = class166.field2648;
        class166.method1182(this.field222);
        this.method88(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class166.field2651 - var5), 0.0F);
        var6.glCallList(this.field223);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIII)V", line = 62)
    public final void method80(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class166.method1189();
        int var5 = this.field3200;
        int var6 = this.field3189;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field3201;
        int var10 = this.field3194;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field3195 > 0) {
            int var13 = ((this.field3195 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field3195 << 16);
        }
        if (this.field3188 > 0) {
            int var14 = ((this.field3188 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field3188 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class166.field2648;
        class166.method1182(this.field222);
        this.method88(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class166.field2651 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field3200 / (float) this.field220;
        float var21 = (float) this.field3189 / (float) this.field221;
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

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IILrh;)V", line = 133)
    public final void method81(int arg0, int arg1, class17 arg2) {
        if (arg2 == null) {
            return;
        }
        class166.method1189();
        class166.method1182(arg2.field222);
        arg2.method88(1);
        GL var4 = class166.field2648;
        class166.method1182(this.field222);
        this.method88(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field222);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class190.field3075) / (float) arg2.field220;
        float var6 = (float) (arg1 - class190.field3073) / (float) arg2.field221;
        float var7 = (float) (this.field3200 + arg0 - class190.field3075) / (float) arg2.field220;
        float var8 = (float) (this.field3189 + arg1 - class190.field3073) / (float) arg2.field221;
        int var9 = this.field3195 + arg0;
        int var10 = this.field3188 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field3200 / (float) this.field220;
        float var12 = (float) this.field3189 / (float) this.field221;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field3200 + var9), (float) (class166.field2651 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class166.field2651 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class166.field2651 - (this.field3189 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field3200 + var9), (float) (class166.field2651 - (this.field3189 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIIIILrh;)V", line = 184)
    public final void method82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class17 arg8) {
        if (arg8 == null) {
            return;
        }
        class166.method1189();
        class166.method1182(arg8.field222);
        arg8.method88(1);
        GL var10 = class166.field2648;
        class166.method1182(this.field222);
        this.method88(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field222);
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
        float var27 = (float) arg8.field3200 / (float) arg8.field220;
        float var28 = (float) arg8.field3189 / (float) arg8.field221;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field220 * 65536.0F;
        float var30 = (float) (this.field221 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class166.field2651 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class166.field2651 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class166.field2651 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class166.field2651 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V", line = 258)
    public final void method83(int arg0, int arg1) {
        class166.method1189();
        int var3 = this.field3195 + arg0;
        int var4 = this.field3188 + arg1;
        GL var5 = class166.field2648;
        class166.method1182(this.field222);
        this.method88(1);
        var5.glTranslatef((float) var3, (float) (class166.field2651 - var4), 0.0F);
        var5.glCallList(this.field223);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(IIIIII[I)V", line = 547)
    public class17(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field3201 = arg0;
        this.field3194 = arg1;
        this.field3195 = arg2;
        this.field3188 = arg3;
        this.field3200 = arg4;
        this.field3189 = arg5;
        this.method86(arg6);
        this.method87();
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Laf;)V", line = 557)
    public class17(class72 arg0) {
        this.field3201 = arg0.field3201;
        this.field3194 = arg0.field3194;
        this.field3195 = arg0.field3195;
        this.field3188 = arg0.field3188;
        this.field3200 = arg0.field3200;
        this.field3189 = arg0.field3189;
        this.method86(arg0.field1070);
        this.method87();
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIII)V", line = 275)
    public final void method84(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class166.method1189();
        GL var7 = class166.field2648;
        class166.method1182(this.field222);
        this.method88(1);
        int var8 = arg0 - (this.field3195 << 4);
        int var9 = arg1 - (this.field3188 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class166.field2651 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field223);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(IIIII)V", line = 292)
    public final void method85(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class166.method1176();
        GL var6 = class166.field2648;
        class166.method1182(this.field222);
        this.method88(1);
        float var7 = (float) this.field3200 / (float) this.field220;
        float var8 = (float) this.field3189 / (float) this.field221;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field3195 + arg0;
        int var12 = this.field3200 * arg3 + var11;
        int var13 = class166.field2651 - arg1 - this.field3188;
        int var14 = var13 - this.field3189 * arg4;
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

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "([I)V", line = 326)
    public void method86(int[] arg0) {
        this.field220 = class110.method746(this.field3200, -705295902);
        this.field221 = class110.method746(this.field3189, -705295902);
        byte[] var2 = new byte[this.field221 * this.field220 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field220 - this.field3200) * 4;
        for (int var6 = 0; var6 < this.field3189; var6++) {
            for (int var7 = 0; var7 < this.field3200; var7++) {
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
        GL var10 = class166.field2648;
        if (this.field222 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field222 = var11[0];
            this.field217 = class103.field1460;
        }
        class166.method1182(this.field222);
        var10.glTexImage2D(3553, 0, 6408, this.field220, this.field221, 0, 6408, 5121, var9);
        class103.field1458 += var9.limit() - this.field218;
        this.field218 = var9.limit();
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "()V", line = 385)
    private final void method87() {
        float var1 = (float) this.field3200 / (float) this.field220;
        float var2 = (float) this.field3189 / (float) this.field221;
        GL var3 = class166.field2648;
        if (this.field223 == -1) {
            this.field223 = var3.glGenLists(1);
            this.field217 = class103.field1460;
        }
        var3.glNewList(this.field223, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field3200, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field3189));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field3200, (float) (-this.field3189));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!rh", name = "finalize", descriptor = "()V", line = 415)
    protected final void finalize() throws Throwable {
        if (this.field222 != -1) {
            class103.method713(this.field222, this.field218, this.field217);
            this.field222 = -1;
            this.field218 = 0;
        }
        if (this.field223 != -1) {
            class103.method716(this.field223, this.field217);
            this.field223 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "(I)V", line = 433)
    private final void method88(int arg0) {
        if (this.field219 == arg0) {
            return;
        }
        this.field219 = arg0;
        GL var2 = class166.field2648;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(IIIIII)V", line = 452)
    public final void method89(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class166.method1189();
        GL var7 = class166.field2648;
        class166.method1182(this.field222);
        this.method88(2);
        int var8 = arg0 - (this.field3195 << 4);
        int var9 = arg1 - (this.field3188 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class166.field2651 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field223);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIII)V", line = 469)
    public final void method90(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class166.method1176();
        int var6 = this.field3200;
        int var7 = this.field3189;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field3201;
        int var11 = this.field3194;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field3195 > 0) {
            int var14 = ((this.field3195 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field3195 << 16);
        }
        if (this.field3188 > 0) {
            int var15 = ((this.field3188 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field3188 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class166.field2648;
        class166.method1182(this.field222);
        this.method88(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class166.field2651 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field3200 / (float) this.field220;
        float var22 = (float) this.field3189 / (float) this.field221;
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
}
