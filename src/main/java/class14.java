import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class14 extends class321 {

    @OriginalMember(owner = "client!nk", name = "T", descriptor = "I")
    private int field169 = 0;

    @OriginalMember(owner = "client!nk", name = "R", descriptor = "I")
    private int field167 = -1;

    @OriginalMember(owner = "client!nk", name = "Q", descriptor = "I")
    public int field166 = -1;

    @OriginalMember(owner = "client!nk", name = "U", descriptor = "I")
    public int field170 = 0;

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "I")
    public int field165;

    @OriginalMember(owner = "client!nk", name = "S", descriptor = "I")
    private int field168;

    @OriginalMember(owner = "client!nk", name = "V", descriptor = "I")
    public int field171;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "(II)V", line = 6)
    public final void method78(int arg0, int arg1) {
        class186.method1278();
        int var3 = this.field5033 + arg0;
        int var4 = this.field5038 + arg1;
        GL var5 = class186.field2990;
        class186.method1288(this.field166);
        this.method89(1);
        var5.glTranslatef((float) var3, (float) (class186.field2980 - var4), 0.0F);
        var5.glCallList(this.field167);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)V", line = 18)
    public final void method79(int arg0, int arg1) {
        class186.method1278();
        int var3 = this.field5033 + arg0;
        int var4 = this.field5038 + arg1;
        GL var5 = class186.field2990;
        class186.method1288(this.field166);
        this.method89(1);
        var5.glTranslatef((float) var3, (float) (class186.field2980 - var4), 0.0F);
        float var6 = (float) this.field5040 / (float) this.field165;
        float var7 = (float) this.field5030 / (float) this.field171;
        var5.glBegin(6);
        var5.glTexCoord2f(0.0F, 0.0F);
        var5.glVertex2f((float) this.field5040, 0.0F);
        var5.glTexCoord2f(var6, 0.0F);
        var5.glVertex2f(0.0F, 0.0F);
        var5.glTexCoord2f(var6, var7);
        var5.glVertex2f(0.0F, (float) (-this.field5030));
        var5.glTexCoord2f(0.0F, var7);
        var5.glVertex2f((float) this.field5040, (float) (-this.field5030));
        var5.glEnd();
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIII)V", line = 43)
    public final void method80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class186.method1278();
        GL var7 = class186.field2990;
        class186.method1288(this.field166);
        this.method89(1);
        int var8 = arg0 - (this.field5033 << 4);
        int var9 = arg1 - (this.field5038 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class186.field2980 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field167);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIII)V", line = 60)
    public final void method81(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class186.method1313();
        int var6 = this.field5040;
        int var7 = this.field5030;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field5028;
        int var11 = this.field5027;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field5033 > 0) {
            int var14 = ((this.field5033 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field5033 << 16);
        }
        if (this.field5038 > 0) {
            int var15 = ((this.field5038 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field5038 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class186.field2990;
        class186.method1288(this.field166);
        this.method89(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class186.field2980 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field5040 / (float) this.field165;
        float var22 = (float) this.field5030 / (float) this.field171;
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

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(III)V", line = 133)
    public final void method82(int arg0, int arg1, int arg2) {
        class186.method1313();
        int var4 = this.field5033 + arg0;
        int var5 = this.field5038 + arg1;
        GL var6 = class186.field2990;
        class186.method1288(this.field166);
        this.method89(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class186.field2980 - var5), 0.0F);
        var6.glCallList(this.field167);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILnk;)V", line = 147)
    public final void method83(int arg0, int arg1, class14 arg2) {
        if (arg2 == null) {
            return;
        }
        class186.method1278();
        class186.method1288(arg2.field166);
        arg2.method89(1);
        GL var4 = class186.field2990;
        class186.method1288(this.field166);
        this.method89(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field166);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class344.field5359) / (float) arg2.field165;
        float var6 = (float) (arg1 - class344.field5356) / (float) arg2.field171;
        float var7 = (float) (this.field5040 + arg0 - class344.field5359) / (float) arg2.field165;
        float var8 = (float) (this.field5030 + arg1 - class344.field5356) / (float) arg2.field171;
        int var9 = this.field5033 + arg0;
        int var10 = this.field5038 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field5040 / (float) this.field165;
        float var12 = (float) this.field5030 / (float) this.field171;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field5040 + var9), (float) (class186.field2980 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class186.field2980 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class186.field2980 - (this.field5030 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field5040 + var9), (float) (class186.field2980 - (this.field5030 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(II)V", line = 197)
    public final void method84(int arg0, int arg1) {
        class186.method1278();
        int var3 = this.field5033 + arg0;
        int var4 = this.field5038 + arg1;
        GL var5 = class186.field2990;
        class186.method1288(this.field166);
        this.method89(1);
        var5.glTranslatef((float) var3, (float) (class186.field2980 - var4), 0.0F);
        var5.glCallList(this.field167);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(IIII)V", line = 209)
    public final void method85(int arg0, int arg1, int arg2, int arg3) {
        class186.method1278();
        GL var5 = class186.field2990;
        class186.method1288(this.field166);
        this.method89(1);
        float var6 = (float) this.field5040 / (float) this.field165;
        float var7 = (float) this.field5030 / (float) this.field171;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field5033 + arg0;
        int var11 = this.field5040 * arg2 + var10;
        int var12 = class186.field2980 - arg1 - this.field5038;
        int var13 = var12 - this.field5030 * arg3;
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

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "()V", line = 241)
    private final void method86() {
        float var1 = (float) this.field5040 / (float) this.field165;
        float var2 = (float) this.field5030 / (float) this.field171;
        GL var3 = class186.field2990;
        if (this.field167 == -1) {
            this.field167 = var3.glGenLists(1);
            this.field168 = class275.field4359;
        }
        var3.glNewList(this.field167, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field5040, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field5030));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field5040, (float) (-this.field5030));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(IIIIII)V", line = 268)
    public final void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class186.method1278();
        GL var7 = class186.field2990;
        class186.method1288(this.field166);
        this.method89(2);
        int var8 = arg0 - (this.field5033 << 4);
        int var9 = arg1 - (this.field5038 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class186.field2980 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field167);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!nk", name = "finalize", descriptor = "()V", line = 285)
    protected final void finalize() throws Throwable {
        if (this.field166 != -1) {
            class275.method1961(this.field166, this.field170, this.field168);
            this.field166 = -1;
            this.field170 = 0;
        }
        if (this.field167 != -1) {
            class275.method1964(this.field167, this.field168);
            this.field167 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIII)V", line = 302)
    public final void method88(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class186.method1278();
        int var5 = this.field5040;
        int var6 = this.field5030;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field5028;
        int var10 = this.field5027;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field5033 > 0) {
            int var13 = ((this.field5033 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field5033 << 16);
        }
        if (this.field5038 > 0) {
            int var14 = ((this.field5038 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field5038 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class186.field2990;
        class186.method1288(this.field166);
        this.method89(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class186.field2980 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field5040 / (float) this.field165;
        float var21 = (float) this.field5030 / (float) this.field171;
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

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(I)V", line = 373)
    private final void method89(int arg0) {
        if (this.field169 == arg0) {
            return;
        }
        this.field169 = arg0;
        GL var2 = class186.field2990;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(IIIII)V", line = 392)
    public final void method90(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class186.method1313();
        GL var6 = class186.field2990;
        class186.method1288(this.field166);
        this.method89(1);
        float var7 = (float) this.field5040 / (float) this.field165;
        float var8 = (float) this.field5030 / (float) this.field171;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field5033 + arg0;
        int var12 = this.field5040 * arg3 + var11;
        int var13 = class186.field2980 - arg1 - this.field5038;
        int var14 = var13 - this.field5030 * arg4;
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

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIIIILnk;)V", line = 426)
    public final void method91(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class14 arg8) {
        if (arg8 == null) {
            return;
        }
        class186.method1278();
        class186.method1288(arg8.field166);
        arg8.method89(1);
        GL var10 = class186.field2990;
        class186.method1288(this.field166);
        this.method89(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field166);
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
        float var27 = (float) arg8.field5040 / (float) arg8.field165;
        float var28 = (float) arg8.field5030 / (float) arg8.field171;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field165 * 65536.0F;
        float var30 = (float) (this.field171 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class186.field2980 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class186.field2980 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class186.field2980 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class186.field2980 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "([I)V", line = 500)
    public void method92(int[] arg0) {
        this.field165 = class290.method2032(127, this.field5040);
        this.field171 = class290.method2032(91, this.field5030);
        byte[] var2 = new byte[this.field171 * this.field165 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field165 - this.field5040) * 4;
        for (int var6 = 0; var6 < this.field5030; var6++) {
            for (int var7 = 0; var7 < this.field5040; var7++) {
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
        GL var10 = class186.field2990;
        if (this.field166 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field166 = var11[0];
            this.field168 = class275.field4359;
        }
        class186.method1288(this.field166);
        var10.glTexImage2D(3553, 0, 6408, this.field165, this.field171, 0, 6408, 5121, var9);
        class275.field4357 += var9.limit() - this.field170;
        this.field170 = var9.limit();
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(IIIIII[I)V", line = 572)
    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field5028 = arg0;
        this.field5027 = arg1;
        this.field5033 = arg2;
        this.field5038 = arg3;
        this.field5040 = arg4;
        this.field5030 = arg5;
        this.method92(arg6);
        this.method86();
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Ln;)V", line = 582)
    public class14(class298 arg0) {
        this.field5028 = arg0.field5028;
        this.field5027 = arg0.field5027;
        this.field5033 = arg0.field5033;
        this.field5038 = arg0.field5038;
        this.field5040 = arg0.field5040;
        this.field5030 = arg0.field5030;
        this.method92(arg0.field4659);
        this.method86();
    }
}
