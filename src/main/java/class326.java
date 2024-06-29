import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class326 extends class35 {

    @OriginalMember(owner = "client!ef", name = "ab", descriptor = "I")
    private int field5483 = 0;

    @OriginalMember(owner = "client!ef", name = "db", descriptor = "I")
    public int field5486 = -1;

    @OriginalMember(owner = "client!ef", name = "gb", descriptor = "I")
    public int field5489 = 0;

    @OriginalMember(owner = "client!ef", name = "fb", descriptor = "I")
    private int field5488 = -1;

    @OriginalMember(owner = "client!ef", name = "bb", descriptor = "I")
    private int field5484;

    @OriginalMember(owner = "client!ef", name = "cb", descriptor = "I")
    public int field5485;

    @OriginalMember(owner = "client!ef", name = "eb", descriptor = "I")
    public int field5487;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)V", line = 7)
    public final void method314(int arg0, int arg1) {
        class108.method744();
        int var3 = this.field657 + arg0;
        int var4 = this.field658 + arg1;
        GL var5 = class108.field1899;
        class108.method736(this.field5486);
        this.method2193(1);
        var5.glTranslatef((float) var3, (float) (class108.field1916 - var4), 0.0F);
        var5.glCallList(this.field5488);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "()V", line = 20)
    private final void method2189() {
        float var1 = (float) this.field667 / (float) this.field5487;
        float var2 = (float) this.field669 / (float) this.field5485;
        GL var3 = class108.field1899;
        if (this.field5488 == -1) {
            this.field5488 = var3.glGenLists(1);
            this.field5484 = class263.field4547;
        }
        var3.glNewList(this.field5488, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field667, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field669));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field667, (float) (-this.field669));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([I)V", line = 45)
    public void method920(int[] arg0) {
        this.field5487 = class5.method28(-89, this.field667);
        this.field5485 = class5.method28(-95, this.field669);
        byte[] var2 = new byte[this.field5487 * this.field5485 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field5487 - this.field667) * 4;
        for (int var6 = 0; var6 < this.field669; var6++) {
            for (int var7 = 0; var7 < this.field667; var7++) {
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
        GL var10 = class108.field1899;
        if (this.field5486 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field5486 = var11[0];
            this.field5484 = class263.field4547;
        }
        class108.method736(this.field5486);
        var10.glTexImage2D(3553, 0, 6408, this.field5487, this.field5485, 0, 6408, 5121, var9);
        class263.field4544 += var9.limit() - this.field5489;
        this.field5489 = var9.limit();
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILef;)V", line = 103)
    public final void method2190(int arg0, int arg1, class326 arg2) {
        if (arg2 == null) {
            return;
        }
        class108.method744();
        class108.method736(arg2.field5486);
        arg2.method2193(1);
        GL var4 = class108.field1899;
        class108.method736(this.field5486);
        this.method2193(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field5486);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class163.field2767) / (float) arg2.field5487;
        float var6 = (float) (arg1 - class163.field2770) / (float) arg2.field5485;
        float var7 = (float) (this.field667 + arg0 - class163.field2767) / (float) arg2.field5487;
        float var8 = (float) (this.field669 + arg1 - class163.field2770) / (float) arg2.field5485;
        int var9 = this.field657 + arg0;
        int var10 = this.field658 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field667 / (float) this.field5487;
        float var12 = (float) this.field669 / (float) this.field5485;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field667 + var9), (float) (class108.field1916 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class108.field1916 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class108.field1916 - (this.field669 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field667 + var9), (float) (class108.field1916 - (this.field669 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ef", name = "finalize", descriptor = "()V", line = 153)
    protected final void finalize() throws Throwable {
        if (this.field5486 != -1) {
            class263.method1863(this.field5486, this.field5489, this.field5484);
            this.field5486 = -1;
            this.field5489 = 0;
        }
        if (this.field5488 != -1) {
            class263.method1866(this.field5488, this.field5484);
            this.field5488 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(IIIII)V", line = 171)
    public final void method317(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class108.method772();
        int var6 = this.field667;
        int var7 = this.field669;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field670;
        int var11 = this.field662;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field657 > 0) {
            int var14 = ((this.field657 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field657 << 16);
        }
        if (this.field658 > 0) {
            int var15 = ((this.field658 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field658 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class108.field1899;
        class108.method736(this.field5486);
        this.method2193(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class108.field1916 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field667 / (float) this.field5487;
        float var22 = (float) this.field669 / (float) this.field5485;
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

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(IIIIII[I)V", line = 547)
    public class326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field670 = arg0;
        this.field662 = arg1;
        this.field657 = arg2;
        this.field658 = arg3;
        this.field667 = arg4;
        this.field669 = arg5;
        this.method920(arg6);
        this.method2189();
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lsm;)V", line = 557)
    public class326(class159 arg0) {
        this.field670 = arg0.field670;
        this.field662 = arg0.field662;
        this.field657 = arg0.field657;
        this.field658 = arg0.field658;
        this.field667 = arg0.field667;
        this.field669 = arg0.field669;
        this.method920(arg0.field2708);
        this.method2189();
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(IIIII)V", line = 249)
    public final void method2191(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class108.method772();
        GL var6 = class108.field1899;
        class108.method736(this.field5486);
        this.method2193(1);
        float var7 = (float) this.field667 / (float) this.field5487;
        float var8 = (float) this.field669 / (float) this.field5485;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field657 + arg0;
        int var12 = this.field667 * arg3 + var11;
        int var13 = class108.field1916 - arg1 - this.field658;
        int var14 = var13 - this.field669 * arg4;
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

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIII)V", line = 283)
    public final void method310(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class108.method744();
        int var5 = this.field667;
        int var6 = this.field669;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field670;
        int var10 = this.field662;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field657 > 0) {
            int var13 = ((this.field657 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field657 << 16);
        }
        if (this.field658 > 0) {
            int var14 = ((this.field658 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field658 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class108.field1899;
        class108.method736(this.field5486);
        this.method2193(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class108.field1916 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field667 / (float) this.field5487;
        float var21 = (float) this.field669 / (float) this.field5485;
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

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIIIILef;)V", line = 353)
    public final void method2192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class326 arg8) {
        if (arg8 == null) {
            return;
        }
        class108.method744();
        class108.method736(arg8.field5486);
        arg8.method2193(1);
        GL var10 = class108.field1899;
        class108.method736(this.field5486);
        this.method2193(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field5486);
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
        float var27 = (float) arg8.field667 / (float) arg8.field5487;
        float var28 = (float) arg8.field669 / (float) arg8.field5485;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field5487 * 65536.0F;
        float var30 = (float) (this.field5485 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class108.field1916 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class108.field1916 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class108.field1916 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class108.field1916 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIII)V", line = 427)
    public final void method315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class108.method744();
        GL var7 = class108.field1899;
        class108.method736(this.field5486);
        this.method2193(1);
        int var8 = arg0 - (this.field657 << 4);
        int var9 = arg1 - (this.field658 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class108.field1916 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field5488);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)V", line = 445)
    private final void method2193(int arg0) {
        if (this.field5483 == arg0) {
            return;
        }
        this.field5483 = arg0;
        GL var2 = class108.field1899;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(II)V", line = 465)
    public final void method316(int arg0, int arg1) {
        class108.method744();
        int var3 = this.field657 + arg0;
        int var4 = this.field658 + arg1;
        GL var5 = class108.field1899;
        class108.method736(this.field5486);
        this.method2193(1);
        var5.glTranslatef((float) var3, (float) (class108.field1916 - var4), 0.0F);
        var5.glCallList(this.field5488);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(IIIIII)V", line = 477)
    public final void method2194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class108.method744();
        GL var7 = class108.field1899;
        class108.method736(this.field5486);
        this.method2193(2);
        int var8 = arg0 - (this.field657 << 4);
        int var9 = arg1 - (this.field658 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class108.field1916 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field5488);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(III)V", line = 494)
    public final void method313(int arg0, int arg1, int arg2) {
        class108.method772();
        int var4 = this.field657 + arg0;
        int var5 = this.field658 + arg1;
        GL var6 = class108.field1899;
        class108.method736(this.field5486);
        this.method2193(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class108.field1916 - var5), 0.0F);
        var6.glCallList(this.field5488);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(IIII)V", line = 511)
    public final void method2195(int arg0, int arg1, int arg2, int arg3) {
        class108.method744();
        GL var5 = class108.field1899;
        class108.method736(this.field5486);
        this.method2193(1);
        float var6 = (float) this.field667 / (float) this.field5487;
        float var7 = (float) this.field669 / (float) this.field5485;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field657 + arg0;
        int var11 = this.field667 * arg2 + var10;
        int var12 = class108.field1916 - arg1 - this.field658;
        int var13 = var12 - this.field669 * arg3;
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
