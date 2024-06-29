import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class98 extends class269 {

    @OriginalMember(owner = "client!ji", name = "R", descriptor = "I")
    public int field1684 = -1;

    @OriginalMember(owner = "client!ji", name = "W", descriptor = "I")
    private int field1689 = 0;

    @OriginalMember(owner = "client!ji", name = "X", descriptor = "I")
    public int field1690 = 0;

    @OriginalMember(owner = "client!ji", name = "T", descriptor = "I")
    private int field1686 = -1;

    @OriginalMember(owner = "client!ji", name = "S", descriptor = "I")
    public int field1685;

    @OriginalMember(owner = "client!ji", name = "U", descriptor = "I")
    public int field1687;

    @OriginalMember(owner = "client!ji", name = "V", descriptor = "I")
    private int field1688;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIIIILji;)V", line = 5)
    public final void method769(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class98 arg8) {
        if (arg8 == null) {
            return;
        }
        class281.method1977();
        class281.method1953(arg8.field1684);
        arg8.method770(1);
        GL var10 = class281.field4839;
        class281.method1953(this.field1684);
        this.method770(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field1684);
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
        float var27 = (float) arg8.field4619 / (float) arg8.field1685;
        float var28 = (float) arg8.field4628 / (float) arg8.field1687;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field1685 * 65536.0F;
        float var30 = (float) (this.field1687 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class281.field4823 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class281.field4823 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class281.field4823 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class281.field4823 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(II)V", line = 79)
    public final void method291(int arg0, int arg1) {
        class281.method1977();
        int var3 = this.field4632 + arg0;
        int var4 = this.field4625 + arg1;
        GL var5 = class281.field4839;
        class281.method1953(this.field1684);
        this.method770(1);
        var5.glTranslatef((float) var3, (float) (class281.field4823 - var4), 0.0F);
        var5.glCallList(this.field1686);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "(I)V", line = 92)
    private final void method770(int arg0) {
        if (this.field1689 == arg0) {
            return;
        }
        this.field1689 = arg0;
        GL var2 = class281.field4839;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIII)V", line = 111)
    public final void method572(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class281.method1977();
        int var5 = this.field4619;
        int var6 = this.field4628;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field4634;
        int var10 = this.field4622;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field4632 > 0) {
            int var13 = ((this.field4632 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field4632 << 16);
        }
        if (this.field4625 > 0) {
            int var14 = ((this.field4625 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field4625 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class281.field4839;
        class281.method1953(this.field1684);
        this.method770(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class281.field4823 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field4619 / (float) this.field1685;
        float var21 = (float) this.field4628 / (float) this.field1687;
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

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(IIII)V", line = 181)
    public final void method771(int arg0, int arg1, int arg2, int arg3) {
        class281.method1977();
        GL var5 = class281.field4839;
        class281.method1953(this.field1684);
        this.method770(1);
        float var6 = (float) this.field4619 / (float) this.field1685;
        float var7 = (float) this.field4628 / (float) this.field1687;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field4632 + arg0;
        int var11 = this.field4619 * arg2 + var10;
        int var12 = class281.field4823 - arg1 - this.field4625;
        int var13 = var12 - this.field4628 * arg3;
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

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IILji;)V", line = 213)
    public final void method772(int arg0, int arg1, class98 arg2) {
        if (arg2 == null) {
            return;
        }
        class281.method1977();
        class281.method1953(arg2.field1684);
        arg2.method770(1);
        GL var4 = class281.field4839;
        class281.method1953(this.field1684);
        this.method770(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field1684);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class126.field2089) / (float) arg2.field1685;
        float var6 = (float) (arg1 - class126.field2090) / (float) arg2.field1687;
        float var7 = (float) (this.field4619 + arg0 - class126.field2089) / (float) arg2.field1685;
        float var8 = (float) (this.field4628 + arg1 - class126.field2090) / (float) arg2.field1687;
        int var9 = this.field4632 + arg0;
        int var10 = this.field4625 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field4619 / (float) this.field1685;
        float var12 = (float) this.field4628 / (float) this.field1687;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field4619 + var9), (float) (class281.field4823 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class281.field4823 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class281.field4823 - (this.field4628 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field4619 + var9), (float) (class281.field4823 - (this.field4628 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(IIIIII[I)V", line = 547)
    public class98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field4634 = arg0;
        this.field4622 = arg1;
        this.field4632 = arg2;
        this.field4625 = arg3;
        this.field4619 = arg4;
        this.field4628 = arg5;
        this.method773(arg6);
        this.method774();
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lpc;)V", line = 557)
    public class98(class83 arg0) {
        this.field4634 = arg0.field4634;
        this.field4622 = arg0.field4622;
        this.field4632 = arg0.field4632;
        this.field4625 = arg0.field4625;
        this.field4619 = arg0.field4619;
        this.field4628 = arg0.field4628;
        this.method773(arg0.field1344);
        this.method774();
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([I)V", line = 270)
    public void method773(int[] arg0) {
        this.field1685 = class287.method2033(this.field4619, -1410546649);
        this.field1687 = class287.method2033(this.field4628, -1410546649);
        byte[] var2 = new byte[this.field1687 * this.field1685 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field1685 - this.field4619) * 4;
        for (int var6 = 0; var6 < this.field4628; var6++) {
            for (int var7 = 0; var7 < this.field4619; var7++) {
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
        GL var10 = class281.field4839;
        if (this.field1684 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field1684 = var11[0];
            this.field1688 = class139.field2330;
        }
        class281.method1953(this.field1684);
        var10.glTexImage2D(3553, 0, 6408, this.field1685, this.field1687, 0, 6408, 5121, var9);
        class139.field2325 += var9.limit() - this.field1690;
        this.field1690 = var9.limit();
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "()V", line = 329)
    private final void method774() {
        float var1 = (float) this.field4619 / (float) this.field1685;
        float var2 = (float) this.field4628 / (float) this.field1687;
        GL var3 = class281.field4839;
        if (this.field1686 == -1) {
            this.field1686 = var3.glGenLists(1);
            this.field1688 = class139.field2330;
        }
        var3.glNewList(this.field1686, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field4619, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field4628));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field4619, (float) (-this.field4628));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V", line = 354)
    public final void method290(int arg0, int arg1) {
        class281.method1977();
        int var3 = this.field4632 + arg0;
        int var4 = this.field4625 + arg1;
        GL var5 = class281.field4839;
        class281.method1953(this.field1684);
        this.method770(1);
        var5.glTranslatef((float) var3, (float) (class281.field4823 - var4), 0.0F);
        var5.glCallList(this.field1686);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ji", name = "finalize", descriptor = "()V", line = 366)
    protected final void finalize() throws Throwable {
        if (this.field1684 != -1) {
            class139.method1043(this.field1684, this.field1690, this.field1688);
            this.field1684 = -1;
            this.field1690 = 0;
        }
        if (this.field1686 != -1) {
            class139.method1041(this.field1686, this.field1688);
            this.field1686 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(IIIIII)V", line = 382)
    public final void method775(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class281.method1977();
        GL var7 = class281.field4839;
        class281.method1953(this.field1684);
        this.method770(2);
        int var8 = arg0 - (this.field4632 << 4);
        int var9 = arg1 - (this.field4625 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class281.field4823 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field1686);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIII)V", line = 399)
    public final void method401(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class281.method1977();
        GL var7 = class281.field4839;
        class281.method1953(this.field1684);
        this.method770(1);
        int var8 = arg0 - (this.field4632 << 4);
        int var9 = arg1 - (this.field4625 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class281.field4823 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field1686);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIII)V", line = 417)
    public final void method399(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class281.method1988();
        int var6 = this.field4619;
        int var7 = this.field4628;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field4634;
        int var11 = this.field4622;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field4632 > 0) {
            int var14 = ((this.field4632 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field4632 << 16);
        }
        if (this.field4625 > 0) {
            int var15 = ((this.field4625 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field4625 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class281.field4839;
        class281.method1953(this.field1684);
        this.method770(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class281.field4823 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field4619 / (float) this.field1685;
        float var22 = (float) this.field4628 / (float) this.field1687;
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

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(IIIII)V", line = 490)
    public final void method776(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class281.method1988();
        GL var6 = class281.field4839;
        class281.method1953(this.field1684);
        this.method770(1);
        float var7 = (float) this.field4619 / (float) this.field1685;
        float var8 = (float) this.field4628 / (float) this.field1687;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field4632 + arg0;
        int var12 = this.field4619 * arg3 + var11;
        int var13 = class281.field4823 - arg1 - this.field4625;
        int var14 = var13 - this.field4628 * arg4;
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

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)V", line = 532)
    public final void method395(int arg0, int arg1, int arg2) {
        class281.method1988();
        int var4 = this.field4632 + arg0;
        int var5 = this.field4625 + arg1;
        GL var6 = class281.field4839;
        class281.method1953(this.field1684);
        this.method770(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class281.field4823 - var5), 0.0F);
        var6.glCallList(this.field1686);
        var6.glLoadIdentity();
    }
}
