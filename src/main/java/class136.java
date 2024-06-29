import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class136 extends class40 {

    @OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
    private int field2421 = -1;

    @OriginalMember(owner = "client!oc", name = "P", descriptor = "I")
    public int field2422 = -1;

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "I")
    public int field2424 = 0;

    @OriginalMember(owner = "client!oc", name = "T", descriptor = "I")
    private int field2425 = 0;

    @OriginalMember(owner = "client!oc", name = "M", descriptor = "I")
    public int field2419;

    @OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
    private int field2420;

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "I")
    public int field2423;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)V", line = 6)
    public final void method306(int arg0, int arg1) {
        class123.method863();
        int var3 = this.field624 + arg0;
        int var4 = this.field621 + arg1;
        GL var5 = class123.field2212;
        class123.method867(this.field2422);
        this.method970(1);
        var5.glTranslatef((float) var3, (float) (class123.field2207 - var4), 0.0F);
        var5.glCallList(this.field2421);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "()V", line = 19)
    private final void method968() {
        float var1 = (float) this.field627 / (float) this.field2419;
        float var2 = (float) this.field629 / (float) this.field2423;
        GL var3 = class123.field2212;
        if (this.field2421 == -1) {
            this.field2421 = var3.glGenLists(1);
            this.field2420 = class285.field4893;
        }
        var3.glNewList(this.field2421, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field627, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field629));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field627, (float) (-this.field629));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)V", line = 44)
    public final void method312(int arg0, int arg1, int arg2) {
        class123.method899();
        int var4 = this.field624 + arg0;
        int var5 = this.field621 + arg1;
        GL var6 = class123.field2212;
        class123.method867(this.field2422);
        this.method970(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class123.field2207 - var5), 0.0F);
        var6.glCallList(this.field2421);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIII)V", line = 57)
    public final void method310(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class123.method899();
        int var6 = this.field627;
        int var7 = this.field629;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field632;
        int var11 = this.field622;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field624 > 0) {
            int var14 = ((this.field624 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field624 << 16);
        }
        if (this.field621 > 0) {
            int var15 = ((this.field621 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field621 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class123.field2212;
        class123.method867(this.field2422);
        this.method970(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class123.field2207 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field627 / (float) this.field2419;
        float var22 = (float) this.field629 / (float) this.field2423;
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

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIII)V", line = 131)
    public final void method308(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class123.method863();
        GL var7 = class123.field2212;
        class123.method867(this.field2422);
        this.method970(1);
        int var8 = arg0 - (this.field624 << 4);
        int var9 = arg1 - (this.field621 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class123.field2207 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field2421);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILoc;)V", line = 148)
    public final void method969(int arg0, int arg1, class136 arg2) {
        if (arg2 == null) {
            return;
        }
        class123.method863();
        class123.method867(arg2.field2422);
        arg2.method970(1);
        GL var4 = class123.field2212;
        class123.method867(this.field2422);
        this.method970(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field2422);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class21.field367) / (float) arg2.field2419;
        float var6 = (float) (arg1 - class21.field371) / (float) arg2.field2423;
        float var7 = (float) (this.field627 + arg0 - class21.field367) / (float) arg2.field2419;
        float var8 = (float) (this.field629 + arg1 - class21.field371) / (float) arg2.field2423;
        int var9 = this.field624 + arg0;
        int var10 = this.field621 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field627 / (float) this.field2419;
        float var12 = (float) this.field629 / (float) this.field2423;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field627 + var9), (float) (class123.field2207 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class123.field2207 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class123.field2207 - (this.field629 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field627 + var9), (float) (class123.field2207 - (this.field629 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(IIII)V", line = 198)
    public final void method309(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class123.method863();
        int var5 = this.field627;
        int var6 = this.field629;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field632;
        int var10 = this.field622;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field624 > 0) {
            int var13 = ((this.field624 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field624 << 16);
        }
        if (this.field621 > 0) {
            int var14 = ((this.field621 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field621 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class123.field2212;
        class123.method867(this.field2422);
        this.method970(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class123.field2207 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field627 / (float) this.field2419;
        float var21 = (float) this.field629 / (float) this.field2423;
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

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)V", line = 268)
    private final void method970(int arg0) {
        if (this.field2425 == arg0) {
            return;
        }
        this.field2425 = arg0;
        GL var2 = class123.field2212;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIIIILoc;)V", line = 290)
    public final void method971(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class136 arg8) {
        if (arg8 == null) {
            return;
        }
        class123.method863();
        class123.method867(arg8.field2422);
        arg8.method970(1);
        GL var10 = class123.field2212;
        class123.method867(this.field2422);
        this.method970(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field2422);
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
        float var27 = (float) arg8.field627 / (float) arg8.field2419;
        float var28 = (float) arg8.field629 / (float) arg8.field2423;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field2419 * 65536.0F;
        float var30 = (float) (this.field2423 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class123.field2207 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class123.field2207 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class123.field2207 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class123.field2207 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(IIIII)V", line = 364)
    public final void method972(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class123.method899();
        GL var6 = class123.field2212;
        class123.method867(this.field2422);
        this.method970(1);
        float var7 = (float) this.field627 / (float) this.field2419;
        float var8 = (float) this.field629 / (float) this.field2423;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field624 + arg0;
        int var12 = this.field627 * arg3 + var11;
        int var13 = class123.field2207 - arg1 - this.field621;
        int var14 = var13 - this.field629 * arg4;
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

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(IIIIII)V", line = 400)
    public final void method973(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class123.method863();
        GL var7 = class123.field2212;
        class123.method867(this.field2422);
        this.method970(2);
        int var8 = arg0 - (this.field624 << 4);
        int var9 = arg1 - (this.field621 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class123.field2207 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field2421);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)V", line = 417)
    public final void method314(int arg0, int arg1) {
        class123.method863();
        int var3 = this.field624 + arg0;
        int var4 = this.field621 + arg1;
        GL var5 = class123.field2212;
        class123.method867(this.field2422);
        this.method970(1);
        var5.glTranslatef((float) var3, (float) (class123.field2207 - var4), 0.0F);
        var5.glCallList(this.field2421);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(IIIIII[I)V", line = 547)
    public class136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field632 = arg0;
        this.field622 = arg1;
        this.field624 = arg2;
        this.field621 = arg3;
        this.field627 = arg4;
        this.field629 = arg5;
        this.method974(arg6);
        this.method968();
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lvd;)V", line = 557)
    public class136(class127 arg0) {
        this.field632 = arg0.field632;
        this.field622 = arg0.field622;
        this.field624 = arg0.field624;
        this.field621 = arg0.field621;
        this.field627 = arg0.field627;
        this.field629 = arg0.field629;
        this.method974(arg0.field2274);
        this.method968();
    }

    @OriginalMember(owner = "client!oc", name = "finalize", descriptor = "()V", line = 435)
    protected final void finalize() throws Throwable {
        if (this.field2422 != -1) {
            class285.method1974(this.field2422, this.field2424, this.field2420);
            this.field2422 = -1;
            this.field2424 = 0;
        }
        if (this.field2421 != -1) {
            class285.method1976(this.field2421, this.field2420);
            this.field2421 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([I)V", line = 451)
    public void method974(int[] arg0) {
        this.field2419 = class143.method1013((byte) 106, this.field627);
        this.field2423 = class143.method1013((byte) 23, this.field629);
        byte[] var2 = new byte[this.field2423 * this.field2419 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field2419 - this.field627) * 4;
        for (int var6 = 0; var6 < this.field629; var6++) {
            for (int var7 = 0; var7 < this.field627; var7++) {
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
        GL var10 = class123.field2212;
        if (this.field2422 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field2422 = var11[0];
            this.field2420 = class285.field4893;
        }
        class123.method867(this.field2422);
        var10.glTexImage2D(3553, 0, 6408, this.field2419, this.field2423, 0, 6408, 5121, var9);
        class285.field4890 += var9.limit() - this.field2424;
        this.field2424 = var9.limit();
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(IIII)V", line = 513)
    public final void method975(int arg0, int arg1, int arg2, int arg3) {
        class123.method863();
        GL var5 = class123.field2212;
        class123.method867(this.field2422);
        this.method970(1);
        float var6 = (float) this.field627 / (float) this.field2419;
        float var7 = (float) this.field629 / (float) this.field2423;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field624 + arg0;
        int var11 = this.field627 * arg2 + var10;
        int var12 = class123.field2207 - arg1 - this.field621;
        int var13 = var12 - this.field629 * arg3;
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
}
