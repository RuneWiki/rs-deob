import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class49 extends class135 {

    @OriginalMember(owner = "client!m", name = "eb", descriptor = "I")
    private int field709 = -1;

    @OriginalMember(owner = "client!m", name = "db", descriptor = "I")
    public int field708 = -1;

    @OriginalMember(owner = "client!m", name = "hb", descriptor = "I")
    private int field712 = 0;

    @OriginalMember(owner = "client!m", name = "fb", descriptor = "I")
    public int field710 = 0;

    @OriginalMember(owner = "client!m", name = "gb", descriptor = "I")
    public int field711;

    @OriginalMember(owner = "client!m", name = "ib", descriptor = "I")
    private int field713;

    @OriginalMember(owner = "client!m", name = "jb", descriptor = "I")
    public int field714;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V", line = 5)
    private final void method336(int arg0) {
        if (this.field712 == arg0) {
            return;
        }
        this.field712 = arg0;
        GL var2 = class231.field4052;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!m", name = "g", descriptor = "(II)V", line = 24)
    public final void method81(int arg0, int arg1) {
        class231.method1590();
        int var3 = this.field2326 + arg0;
        int var4 = this.field2338 + arg1;
        GL var5 = class231.field4052;
        class231.method1597(this.field708);
        this.method336(1);
        var5.glTranslatef((float) var3, (float) (class231.field4079 - var4), 0.0F);
        var5.glCallList(this.field709);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIIIILm;)V", line = 36)
    public final void method337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class49 arg8) {
        if (arg8 == null) {
            return;
        }
        class231.method1590();
        class231.method1597(arg8.field708);
        arg8.method336(1);
        GL var10 = class231.field4052;
        class231.method1597(this.field708);
        this.method336(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field708);
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
        float var27 = (float) arg8.field2347 / (float) arg8.field714;
        float var28 = (float) arg8.field2329 / (float) arg8.field711;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field714 * 65536.0F;
        float var30 = (float) (this.field711 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class231.field4079 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class231.field4079 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class231.field4079 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class231.field4079 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IILm;)V", line = 110)
    public final void method338(int arg0, int arg1, class49 arg2) {
        if (arg2 == null) {
            return;
        }
        class231.method1590();
        class231.method1597(arg2.field708);
        arg2.method336(1);
        GL var4 = class231.field4052;
        class231.method1597(this.field708);
        this.method336(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field708);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class50.field717) / (float) arg2.field714;
        float var6 = (float) (arg1 - class50.field719) / (float) arg2.field711;
        float var7 = (float) (this.field2347 + arg0 - class50.field717) / (float) arg2.field714;
        float var8 = (float) (this.field2329 + arg1 - class50.field719) / (float) arg2.field711;
        int var9 = this.field2326 + arg0;
        int var10 = this.field2338 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field2347 / (float) this.field714;
        float var12 = (float) this.field2329 / (float) this.field711;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field2347 + var9), (float) (class231.field4079 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class231.field4079 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class231.field4079 - (this.field2329 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field2347 + var9), (float) (class231.field4079 - (this.field2329 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(III)V", line = 160)
    public final void method61(int arg0, int arg1, int arg2) {
        class231.method1578();
        int var4 = this.field2326 + arg0;
        int var5 = this.field2338 + arg1;
        GL var6 = class231.field4052;
        class231.method1597(this.field708);
        this.method336(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class231.field4079 - var5), 0.0F);
        var6.glCallList(this.field709);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "()V", line = 176)
    private final void method339() {
        float var1 = (float) this.field2347 / (float) this.field714;
        float var2 = (float) this.field2329 / (float) this.field711;
        GL var3 = class231.field4052;
        if (this.field709 == -1) {
            this.field709 = var3.glGenLists(1);
            this.field713 = class124.field2099;
        }
        var3.glNewList(this.field709, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field2347, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field2329));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field2347, (float) (-this.field2329));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(IIIIII[I)V", line = 548)
    public class49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field2342 = arg0;
        this.field2336 = arg1;
        this.field2326 = arg2;
        this.field2338 = arg3;
        this.field2347 = arg4;
        this.field2329 = arg5;
        this.method341(arg6);
        this.method339();
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lse;)V", line = 558)
    public class49(class12 arg0) {
        this.field2342 = arg0.field2342;
        this.field2336 = arg0.field2336;
        this.field2326 = arg0.field2326;
        this.field2338 = arg0.field2338;
        this.field2347 = arg0.field2347;
        this.field2329 = arg0.field2329;
        this.method341(arg0.field141);
        this.method339();
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(IIIII)V", line = 213)
    public final void method340(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class231.method1578();
        GL var6 = class231.field4052;
        class231.method1597(this.field708);
        this.method336(1);
        float var7 = (float) this.field2347 / (float) this.field714;
        float var8 = (float) this.field2329 / (float) this.field711;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field2326 + arg0;
        int var12 = this.field2347 * arg3 + var11;
        int var13 = class231.field4079 - arg1 - this.field2338;
        int var14 = var13 - this.field2329 * arg4;
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

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([I)V", line = 247)
    public void method341(int[] arg0) {
        this.field714 = class117.method832(this.field2347, (byte) 107);
        this.field711 = class117.method832(this.field2329, (byte) 100);
        byte[] var2 = new byte[this.field714 * this.field711 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field714 - this.field2347) * 4;
        for (int var6 = 0; var6 < this.field2329; var6++) {
            for (int var7 = 0; var7 < this.field2347; var7++) {
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
        GL var10 = class231.field4052;
        if (this.field708 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field708 = var11[0];
            this.field713 = class124.field2099;
        }
        class231.method1597(this.field708);
        var10.glTexImage2D(3553, 0, 6408, this.field714, this.field711, 0, 6408, 5121, var9);
        class124.field2101 += var9.limit() - this.field710;
        this.field710 = var9.limit();
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(II)V", line = 305)
    public final void method68(int arg0, int arg1) {
        class231.method1590();
        int var3 = this.field2326 + arg0;
        int var4 = this.field2338 + arg1;
        GL var5 = class231.field4052;
        class231.method1597(this.field708);
        this.method336(1);
        var5.glTranslatef((float) var3, (float) (class231.field4079 - var4), 0.0F);
        var5.glCallList(this.field709);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(IIII)V", line = 317)
    public final void method342(int arg0, int arg1, int arg2, int arg3) {
        class231.method1590();
        GL var5 = class231.field4052;
        class231.method1597(this.field708);
        this.method336(1);
        float var6 = (float) this.field2347 / (float) this.field714;
        float var7 = (float) this.field2329 / (float) this.field711;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field2326 + arg0;
        int var11 = this.field2347 * arg2 + var10;
        int var12 = class231.field4079 - arg1 - this.field2338;
        int var13 = var12 - this.field2329 * arg3;
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

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(IIIII)V", line = 348)
    public final void method63(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class231.method1578();
        int var6 = this.field2347;
        int var7 = this.field2329;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field2342;
        int var11 = this.field2336;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field2326 > 0) {
            int var14 = ((this.field2326 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field2326 << 16);
        }
        if (this.field2338 > 0) {
            int var15 = ((this.field2338 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field2338 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class231.field4052;
        class231.method1597(this.field708);
        this.method336(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class231.field4079 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field2347 / (float) this.field714;
        float var22 = (float) this.field2329 / (float) this.field711;
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

    @OriginalMember(owner = "client!m", name = "finalize", descriptor = "()V", line = 421)
    protected final void finalize() throws Throwable {
        if (this.field708 != -1) {
            class124.method859(this.field708, this.field710, this.field713);
            this.field708 = -1;
            this.field710 = 0;
        }
        if (this.field709 != -1) {
            class124.method862(this.field709, this.field713);
            this.field709 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIII)V", line = 437)
    public final void method72(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class231.method1590();
        int var5 = this.field2347;
        int var6 = this.field2329;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field2342;
        int var10 = this.field2336;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field2326 > 0) {
            int var13 = ((this.field2326 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field2326 << 16);
        }
        if (this.field2338 > 0) {
            int var14 = ((this.field2338 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field2338 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class231.field4052;
        class231.method1597(this.field708);
        this.method336(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class231.field4079 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field2347 / (float) this.field714;
        float var21 = (float) this.field2329 / (float) this.field711;
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

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIII)V", line = 511)
    public final void method67(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class231.method1590();
        GL var7 = class231.field4052;
        class231.method1597(this.field708);
        this.method336(1);
        int var8 = arg0 - (this.field2326 << 4);
        int var9 = arg1 - (this.field2338 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class231.field4079 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field709);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(IIIIII)V", line = 532)
    public final void method343(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class231.method1590();
        GL var7 = class231.field4052;
        class231.method1597(this.field708);
        this.method336(2);
        int var8 = arg0 - (this.field2326 << 4);
        int var9 = arg1 - (this.field2338 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class231.field4079 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field709);
        var7.glLoadIdentity();
    }
}
