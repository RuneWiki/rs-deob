import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class100 extends class185 {

    @OriginalMember(owner = "client!ji", name = "jb", descriptor = "I")
    private int field1764 = 0;

    @OriginalMember(owner = "client!ji", name = "lb", descriptor = "I")
    private int field1766 = -1;

    @OriginalMember(owner = "client!ji", name = "nb", descriptor = "I")
    public int field1768 = -1;

    @OriginalMember(owner = "client!ji", name = "hb", descriptor = "I")
    public int field1762 = 0;

    @OriginalMember(owner = "client!ji", name = "ib", descriptor = "I")
    public int field1763;

    @OriginalMember(owner = "client!ji", name = "kb", descriptor = "I")
    public int field1765;

    @OriginalMember(owner = "client!ji", name = "mb", descriptor = "I")
    private int field1767;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "()V", line = 8)
    private final void method754() {
        float var1 = (float) this.field2976 / (float) this.field1765;
        float var2 = (float) this.field2981 / (float) this.field1763;
        GL var3 = class21.field377;
        if (this.field1766 == -1) {
            this.field1766 = var3.glGenLists(1);
            this.field1767 = class136.field2300;
        }
        var3.glNewList(this.field1766, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field2976, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field2981));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field2976, (float) (-this.field2981));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIIIILji;)V", line = 34)
    public final void method755(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class100 arg8) {
        if (arg8 == null) {
            return;
        }
        class21.method134();
        class21.method140(arg8.field1768);
        arg8.method757(1);
        GL var10 = class21.field377;
        class21.method140(this.field1768);
        this.method757(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field1768);
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
        float var27 = (float) arg8.field2976 / (float) arg8.field1765;
        float var28 = (float) arg8.field2981 / (float) arg8.field1763;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field1765 * 65536.0F;
        float var30 = (float) (this.field1763 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class21.field361 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class21.field361 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class21.field361 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class21.field361 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(II)V", line = 108)
    public final void method744(int arg0, int arg1) {
        class21.method134();
        int var3 = this.field2983 + arg0;
        int var4 = this.field2977 + arg1;
        GL var5 = class21.field377;
        class21.method140(this.field1768);
        this.method757(1);
        var5.glTranslatef((float) var3, (float) (class21.field361 - var4), 0.0F);
        var5.glCallList(this.field1766);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ji", name = "finalize", descriptor = "()V", line = 120)
    protected final void finalize() throws Throwable {
        if (this.field1768 != -1) {
            class136.method1007(this.field1768, this.field1762, this.field1767);
            this.field1768 = -1;
            this.field1762 = 0;
        }
        if (this.field1766 != -1) {
            class136.method1006(this.field1766, this.field1767);
            this.field1766 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(IIIII)V", line = 136)
    public final void method733(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class21.method151();
        int var6 = this.field2976;
        int var7 = this.field2981;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field2971;
        int var11 = this.field2980;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field2983 > 0) {
            int var14 = ((this.field2983 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field2983 << 16);
        }
        if (this.field2977 > 0) {
            int var15 = ((this.field2977 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field2977 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class21.field377;
        class21.method140(this.field1768);
        this.method757(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class21.field361 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field2976 / (float) this.field1765;
        float var22 = (float) this.field2981 / (float) this.field1763;
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

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "(II)V", line = 209)
    public final void method735(int arg0, int arg1) {
        class21.method134();
        int var3 = this.field2983 + arg0;
        int var4 = this.field2977 + arg1;
        GL var5 = class21.field377;
        class21.method140(this.field1768);
        this.method757(1);
        var5.glTranslatef((float) var3, (float) (class21.field361 - var4), 0.0F);
        var5.glCallList(this.field1766);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IILji;)V", line = 224)
    public final void method756(int arg0, int arg1, class100 arg2) {
        if (arg2 == null) {
            return;
        }
        class21.method134();
        class21.method140(arg2.field1768);
        arg2.method757(1);
        GL var4 = class21.field377;
        class21.method140(this.field1768);
        this.method757(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field1768);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class111.field1936) / (float) arg2.field1765;
        float var6 = (float) (arg1 - class111.field1937) / (float) arg2.field1763;
        float var7 = (float) (this.field2976 + arg0 - class111.field1936) / (float) arg2.field1765;
        float var8 = (float) (this.field2981 + arg1 - class111.field1937) / (float) arg2.field1763;
        int var9 = this.field2983 + arg0;
        int var10 = this.field2977 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field2976 / (float) this.field1765;
        float var12 = (float) this.field2981 / (float) this.field1763;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field2976 + var9), (float) (class21.field361 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class21.field361 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class21.field361 - (this.field2981 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field2976 + var9), (float) (class21.field361 - (this.field2981 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(IIIIII[I)V", line = 547)
    public class100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field2971 = arg0;
        this.field2980 = arg1;
        this.field2983 = arg2;
        this.field2977 = arg3;
        this.field2976 = arg4;
        this.field2981 = arg5;
        this.method760(arg6);
        this.method754();
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lmb;)V", line = 557)
    public class100(class99 arg0) {
        this.field2971 = arg0.field2971;
        this.field2980 = arg0.field2980;
        this.field2983 = arg0.field2983;
        this.field2977 = arg0.field2977;
        this.field2976 = arg0.field2976;
        this.field2981 = arg0.field2981;
        this.method760(arg0.field1761);
        this.method754();
    }

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "(I)V", line = 278)
    private final void method757(int arg0) {
        if (this.field1764 == arg0) {
            return;
        }
        this.field1764 = arg0;
        GL var2 = class21.field377;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(IIII)V", line = 297)
    public final void method758(int arg0, int arg1, int arg2, int arg3) {
        class21.method134();
        GL var5 = class21.field377;
        class21.method140(this.field1768);
        this.method757(1);
        float var6 = (float) this.field2976 / (float) this.field1765;
        float var7 = (float) this.field2981 / (float) this.field1763;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field2983 + arg0;
        int var11 = this.field2976 * arg2 + var10;
        int var12 = class21.field361 - arg1 - this.field2977;
        int var13 = var12 - this.field2981 * arg3;
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

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIII)V", line = 328)
    public final void method734(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class21.method134();
        int var5 = this.field2976;
        int var6 = this.field2981;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field2971;
        int var10 = this.field2980;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field2983 > 0) {
            int var13 = ((this.field2983 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field2983 << 16);
        }
        if (this.field2977 > 0) {
            int var14 = ((this.field2977 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field2977 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class21.field377;
        class21.method140(this.field1768);
        this.method757(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class21.field361 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field2976 / (float) this.field1765;
        float var21 = (float) this.field2981 / (float) this.field1763;
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

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIII)V", line = 399)
    public final void method739(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class21.method134();
        GL var7 = class21.field377;
        class21.method140(this.field1768);
        this.method757(1);
        int var8 = arg0 - (this.field2983 << 4);
        int var9 = arg1 - (this.field2977 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class21.field361 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field1766);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(III)V", line = 419)
    public final void method743(int arg0, int arg1, int arg2) {
        class21.method151();
        int var4 = this.field2983 + arg0;
        int var5 = this.field2977 + arg1;
        GL var6 = class21.field377;
        class21.method140(this.field1768);
        this.method757(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class21.field361 - var5), 0.0F);
        var6.glCallList(this.field1766);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(IIIIII)V", line = 432)
    public final void method759(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class21.method134();
        GL var7 = class21.field377;
        class21.method140(this.field1768);
        this.method757(2);
        int var8 = arg0 - (this.field2983 << 4);
        int var9 = arg1 - (this.field2977 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class21.field361 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field1766);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([I)V", line = 453)
    public void method760(int[] arg0) {
        this.field1765 = class151.method1130(121, this.field2976);
        this.field1763 = class151.method1130(82, this.field2981);
        byte[] var2 = new byte[this.field1765 * this.field1763 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field1765 - this.field2976) * 4;
        for (int var6 = 0; var6 < this.field2981; var6++) {
            for (int var7 = 0; var7 < this.field2976; var7++) {
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
        GL var10 = class21.field377;
        if (this.field1768 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field1768 = var11[0];
            this.field1767 = class136.field2300;
        }
        class21.method140(this.field1768);
        var10.glTexImage2D(3553, 0, 6408, this.field1765, this.field1763, 0, 6408, 5121, var9);
        class136.field2301 += var9.limit() - this.field1762;
        this.field1762 = var9.limit();
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(IIIII)V", line = 511)
    public final void method761(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class21.method151();
        GL var6 = class21.field377;
        class21.method140(this.field1768);
        this.method757(1);
        float var7 = (float) this.field2976 / (float) this.field1765;
        float var8 = (float) this.field2981 / (float) this.field1763;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field2983 + arg0;
        int var12 = this.field2976 * arg3 + var11;
        int var13 = class21.field361 - arg1 - this.field2977;
        int var14 = var13 - this.field2981 * arg4;
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
