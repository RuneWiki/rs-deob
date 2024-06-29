import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class86 extends class270 {

    @OriginalMember(owner = "client!al", name = "U", descriptor = "I")
    private int field1395 = -1;

    @OriginalMember(owner = "client!al", name = "V", descriptor = "I")
    public int field1396 = -1;

    @OriginalMember(owner = "client!al", name = "Y", descriptor = "I")
    private int field1399 = 0;

    @OriginalMember(owner = "client!al", name = "T", descriptor = "I")
    public int field1394 = 0;

    @OriginalMember(owner = "client!al", name = "W", descriptor = "I")
    private int field1397;

    @OriginalMember(owner = "client!al", name = "X", descriptor = "I")
    public int field1398;

    @OriginalMember(owner = "client!al", name = "Z", descriptor = "I")
    public int field1400;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(II)V", line = 5)
    public final void method616(int arg0, int arg1) {
        class94.method681();
        int var3 = this.field4212 + arg0;
        int var4 = this.field4206 + arg1;
        GL var5 = class94.field1473;
        class94.method698(this.field1396);
        this.method626(1);
        var5.glTranslatef((float) var3, (float) (class94.field1513 - var4), 0.0F);
        float var6 = (float) this.field4202 / (float) this.field1400;
        float var7 = (float) this.field4207 / (float) this.field1398;
        var5.glBegin(6);
        var5.glTexCoord2f(0.0F, 0.0F);
        var5.glVertex2f((float) this.field4202, 0.0F);
        var5.glTexCoord2f(var6, 0.0F);
        var5.glVertex2f(0.0F, 0.0F);
        var5.glTexCoord2f(var6, var7);
        var5.glVertex2f(0.0F, (float) (-this.field4207));
        var5.glTexCoord2f(0.0F, var7);
        var5.glVertex2f((float) this.field4202, (float) (-this.field4207));
        var5.glEnd();
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(II)V", line = 30)
    public final void method617(int arg0, int arg1) {
        class94.method681();
        int var3 = this.field4212 + arg0;
        int var4 = this.field4206 + arg1;
        GL var5 = class94.field1473;
        class94.method698(this.field1396);
        this.method626(1);
        var5.glTranslatef((float) var3, (float) (class94.field1513 - var4), 0.0F);
        var5.glCallList(this.field1395);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIIIIILal;)V", line = 42)
    public final void method618(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class86 arg8) {
        if (arg8 == null) {
            return;
        }
        class94.method681();
        class94.method698(arg8.field1396);
        arg8.method626(1);
        GL var10 = class94.field1473;
        class94.method698(this.field1396);
        this.method626(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field1396);
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
        float var27 = (float) arg8.field4202 / (float) arg8.field1400;
        float var28 = (float) arg8.field4207 / (float) arg8.field1398;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field1400 * 65536.0F;
        float var30 = (float) (this.field1398 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class94.field1513 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class94.field1513 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class94.field1513 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class94.field1513 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!al", name = "finalize", descriptor = "()V", line = 117)
    protected final void finalize() throws Throwable {
        if (this.field1396 != -1) {
            class198.method1403(this.field1396, this.field1394, this.field1397);
            this.field1396 = -1;
            this.field1394 = 0;
        }
        if (this.field1395 != -1) {
            class198.method1406(this.field1395, this.field1397);
            this.field1395 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(IIIIII)V", line = 133)
    public final void method619(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class94.method681();
        GL var7 = class94.field1473;
        class94.method698(this.field1396);
        this.method626(2);
        int var8 = arg0 - (this.field4212 << 4);
        int var9 = arg1 - (this.field4206 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class94.field1513 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field1395);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III)V", line = 150)
    public final void method620(int arg0, int arg1, int arg2) {
        class94.method707();
        int var4 = this.field4212 + arg0;
        int var5 = this.field4206 + arg1;
        GL var6 = class94.field1473;
        class94.method698(this.field1396);
        this.method626(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class94.field1513 - var5), 0.0F);
        var6.glCallList(this.field1395);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(IIII)V", line = 163)
    public final void method621(int arg0, int arg1, int arg2, int arg3) {
        class94.method681();
        GL var5 = class94.field1473;
        class94.method698(this.field1396);
        this.method626(1);
        float var6 = (float) this.field4202 / (float) this.field1400;
        float var7 = (float) this.field4207 / (float) this.field1398;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field4212 + arg0;
        int var11 = this.field4202 * arg2 + var10;
        int var12 = class94.field1513 - arg1 - this.field4206;
        int var13 = var12 - this.field4207 * arg3;
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

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IILal;)V", line = 198)
    public final void method622(int arg0, int arg1, class86 arg2) {
        if (arg2 == null) {
            return;
        }
        class94.method681();
        class94.method698(arg2.field1396);
        arg2.method626(1);
        GL var4 = class94.field1473;
        class94.method698(this.field1396);
        this.method626(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field1396);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class167.field2550) / (float) arg2.field1400;
        float var6 = (float) (arg1 - class167.field2552) / (float) arg2.field1398;
        float var7 = (float) (this.field4202 + arg0 - class167.field2550) / (float) arg2.field1400;
        float var8 = (float) (this.field4207 + arg1 - class167.field2552) / (float) arg2.field1398;
        int var9 = this.field4212 + arg0;
        int var10 = this.field4206 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field4202 / (float) this.field1400;
        float var12 = (float) this.field4207 / (float) this.field1398;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field4202 + var9), (float) (class94.field1513 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class94.field1513 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class94.field1513 - (this.field4207 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field4202 + var9), (float) (class94.field1513 - (this.field4207 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "()V", line = 249)
    private final void method623() {
        float var1 = (float) this.field4202 / (float) this.field1400;
        float var2 = (float) this.field4207 / (float) this.field1398;
        GL var3 = class94.field1473;
        if (this.field1395 == -1) {
            this.field1395 = var3.glGenLists(1);
            this.field1397 = class198.field2966;
        }
        var3.glNewList(this.field1395, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field4202, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field4207));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field4202, (float) (-this.field4207));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIII)V", line = 274)
    public final void method624(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class94.method681();
        int var5 = this.field4202;
        int var6 = this.field4207;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field4211;
        int var10 = this.field4201;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field4212 > 0) {
            int var13 = ((this.field4212 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field4212 << 16);
        }
        if (this.field4206 > 0) {
            int var14 = ((this.field4206 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field4206 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class94.field1473;
        class94.method698(this.field1396);
        this.method626(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class94.field1513 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field4202 / (float) this.field1400;
        float var21 = (float) this.field4207 / (float) this.field1398;
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

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(IIIIII[I)V", line = 572)
    public class86(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field4211 = arg0;
        this.field4201 = arg1;
        this.field4212 = arg2;
        this.field4206 = arg3;
        this.field4202 = arg4;
        this.field4207 = arg5;
        this.method548(arg6);
        this.method623();
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lgm;)V", line = 582)
    public class86(class249 arg0) {
        this.field4211 = arg0.field4211;
        this.field4201 = arg0.field4201;
        this.field4212 = arg0.field4212;
        this.field4206 = arg0.field4206;
        this.field4202 = arg0.field4202;
        this.field4207 = arg0.field4207;
        this.method548(arg0.field3942);
        this.method623();
    }

    @OriginalMember(owner = "client!al", name = "e", descriptor = "(II)V", line = 348)
    public final void method625(int arg0, int arg1) {
        class94.method681();
        int var3 = this.field4212 + arg0;
        int var4 = this.field4206 + arg1;
        GL var5 = class94.field1473;
        class94.method698(this.field1396);
        this.method626(1);
        var5.glTranslatef((float) var3, (float) (class94.field1513 - var4), 0.0F);
        var5.glCallList(this.field1395);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "([I)V", line = 361)
    public void method548(int[] arg0) {
        this.field1400 = class10.method73((byte) -79, this.field4202);
        this.field1398 = class10.method73((byte) -101, this.field4207);
        byte[] var2 = new byte[this.field1400 * this.field1398 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field1400 - this.field4202) * 4;
        for (int var6 = 0; var6 < this.field4207; var6++) {
            for (int var7 = 0; var7 < this.field4202; var7++) {
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
        GL var10 = class94.field1473;
        if (this.field1396 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field1396 = var11[0];
            this.field1397 = class198.field2966;
        }
        class94.method698(this.field1396);
        var10.glTexImage2D(3553, 0, 6408, this.field1400, this.field1398, 0, 6408, 5121, var9);
        class198.field2964 += var9.limit() - this.field1394;
        this.field1394 = var9.limit();
    }

    @OriginalMember(owner = "client!al", name = "g", descriptor = "(I)V", line = 419)
    private final void method626(int arg0) {
        if (this.field1399 == arg0) {
            return;
        }
        this.field1399 = arg0;
        GL var2 = class94.field1473;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(IIIII)V", line = 438)
    public final void method627(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class94.method707();
        GL var6 = class94.field1473;
        class94.method698(this.field1396);
        this.method626(1);
        float var7 = (float) this.field4202 / (float) this.field1400;
        float var8 = (float) this.field4207 / (float) this.field1398;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field4212 + arg0;
        int var12 = this.field4202 * arg3 + var11;
        int var13 = class94.field1513 - arg1 - this.field4206;
        int var14 = var13 - this.field4207 * arg4;
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

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIII)V", line = 475)
    public final void method628(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class94.method681();
        GL var7 = class94.field1473;
        class94.method698(this.field1396);
        this.method626(1);
        int var8 = arg0 - (this.field4212 << 4);
        int var9 = arg1 - (this.field4206 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class94.field1513 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field1395);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(IIIII)V", line = 492)
    public final void method629(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class94.method707();
        int var6 = this.field4202;
        int var7 = this.field4207;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field4211;
        int var11 = this.field4201;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field4212 > 0) {
            int var14 = ((this.field4212 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field4212 << 16);
        }
        if (this.field4206 > 0) {
            int var15 = ((this.field4206 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field4206 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class94.field1473;
        class94.method698(this.field1396);
        this.method626(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class94.field1513 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field4202 / (float) this.field1400;
        float var22 = (float) this.field4207 / (float) this.field1398;
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
