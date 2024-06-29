import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class140 extends class71 {

    @OriginalMember(owner = "client!hg", name = "V", descriptor = "I")
    private int field2491 = -1;

    @OriginalMember(owner = "client!hg", name = "W", descriptor = "I")
    public int field2492 = 0;

    @OriginalMember(owner = "client!hg", name = "T", descriptor = "I")
    public int field2489 = -1;

    @OriginalMember(owner = "client!hg", name = "Y", descriptor = "I")
    private int field2494 = 0;

    @OriginalMember(owner = "client!hg", name = "U", descriptor = "I")
    private int field2490;

    @OriginalMember(owner = "client!hg", name = "X", descriptor = "I")
    public int field2493;

    @OriginalMember(owner = "client!hg", name = "Z", descriptor = "I")
    public int field2495;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIIIILhg;)V", line = 5)
    public final void method1088(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class140 arg8) {
        if (arg8 == null) {
            return;
        }
        class117.method949();
        class117.method939(arg8.field2489);
        arg8.method1095(1);
        GL var10 = class117.field2143;
        class117.method939(this.field2489);
        this.method1095(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field2489);
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
        float var27 = (float) arg8.field1131 / (float) arg8.field2495;
        float var28 = (float) arg8.field1135 / (float) arg8.field2493;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field2495 * 65536.0F;
        float var30 = (float) (this.field2493 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class117.field2126 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class117.field2126 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class117.field2126 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class117.field2126 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(IIIIII[I)V", line = 547)
    public class140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field1134 = arg0;
        this.field1141 = arg1;
        this.field1139 = arg2;
        this.field1130 = arg3;
        this.field1131 = arg4;
        this.field1135 = arg5;
        this.method1094(arg6);
        this.method1091();
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lud;)V", line = 557)
    public class140(class79 arg0) {
        this.field1134 = arg0.field1134;
        this.field1141 = arg0.field1141;
        this.field1139 = arg0.field1139;
        this.field1130 = arg0.field1130;
        this.field1131 = arg0.field1131;
        this.field1135 = arg0.field1135;
        this.method1094(arg0.field1384);
        this.method1091();
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(IIIIII)V", line = 86)
    public final void method1089(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class117.method949();
        GL var7 = class117.field2143;
        class117.method939(this.field2489);
        this.method1095(2);
        int var8 = arg0 - (this.field1139 << 4);
        int var9 = arg1 - (this.field1130 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class117.field2126 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field2491);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IILhg;)V", line = 103)
    public final void method1090(int arg0, int arg1, class140 arg2) {
        if (arg2 == null) {
            return;
        }
        class117.method949();
        class117.method939(arg2.field2489);
        arg2.method1095(1);
        GL var4 = class117.field2143;
        class117.method939(this.field2489);
        this.method1095(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field2489);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class16.field240) / (float) arg2.field2495;
        float var6 = (float) (arg1 - class16.field239) / (float) arg2.field2493;
        float var7 = (float) (this.field1131 + arg0 - class16.field240) / (float) arg2.field2495;
        float var8 = (float) (this.field1135 + arg1 - class16.field239) / (float) arg2.field2493;
        int var9 = this.field1139 + arg0;
        int var10 = this.field1130 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field1131 / (float) this.field2495;
        float var12 = (float) this.field1135 / (float) this.field2493;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field1131 + var9), (float) (class117.field2126 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class117.field2126 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class117.field2126 - (this.field1135 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field1131 + var9), (float) (class117.field2126 - (this.field1135 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "()V", line = 155)
    private final void method1091() {
        float var1 = (float) this.field1131 / (float) this.field2495;
        float var2 = (float) this.field1135 / (float) this.field2493;
        GL var3 = class117.field2143;
        if (this.field2491 == -1) {
            this.field2491 = var3.glGenLists(1);
            this.field2490 = class41.field659;
        }
        var3.glNewList(this.field2491, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field1131, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field1135));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field1131, (float) (-this.field1135));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!hg", name = "finalize", descriptor = "()V", line = 180)
    protected final void finalize() throws Throwable {
        if (this.field2489 != -1) {
            class41.method307(this.field2489, this.field2492, this.field2490);
            this.field2489 = -1;
            this.field2492 = 0;
        }
        if (this.field2491 != -1) {
            class41.method303(this.field2491, this.field2490);
            this.field2491 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)V", line = 199)
    public final void method514(int arg0, int arg1, int arg2) {
        class117.method932();
        int var4 = this.field1139 + arg0;
        int var5 = this.field1130 + arg1;
        GL var6 = class117.field2143;
        class117.method939(this.field2489);
        this.method1095(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class117.field2126 - var5), 0.0F);
        var6.glCallList(this.field2491);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(II)V", line = 212)
    public final void method286(int arg0, int arg1) {
        class117.method949();
        int var3 = this.field1139 + arg0;
        int var4 = this.field1130 + arg1;
        GL var5 = class117.field2143;
        class117.method939(this.field2489);
        this.method1095(1);
        var5.glTranslatef((float) var3, (float) (class117.field2126 - var4), 0.0F);
        var5.glCallList(this.field2491);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIII)V", line = 224)
    public final void method513(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class117.method932();
        int var6 = this.field1131;
        int var7 = this.field1135;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field1134;
        int var11 = this.field1141;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field1139 > 0) {
            int var14 = ((this.field1139 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field1139 << 16);
        }
        if (this.field1130 > 0) {
            int var15 = ((this.field1130 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field1130 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class117.field2143;
        class117.method939(this.field2489);
        this.method1095(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class117.field2126 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field1131 / (float) this.field2495;
        float var22 = (float) this.field1135 / (float) this.field2493;
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

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIII)V", line = 298)
    public final void method515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class117.method949();
        GL var7 = class117.field2143;
        class117.method939(this.field2489);
        this.method1095(1);
        int var8 = arg0 - (this.field1139 << 4);
        int var9 = arg1 - (this.field1130 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class117.field2126 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field2491);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(IIIII)V", line = 318)
    public final void method1092(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class117.method932();
        GL var6 = class117.field2143;
        class117.method939(this.field2489);
        this.method1095(1);
        float var7 = (float) this.field1131 / (float) this.field2495;
        float var8 = (float) this.field1135 / (float) this.field2493;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field1139 + arg0;
        int var12 = this.field1131 * arg3 + var11;
        int var13 = class117.field2126 - arg1 - this.field1130;
        int var14 = var13 - this.field1135 * arg4;
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

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(II)V", line = 352)
    public final void method285(int arg0, int arg1) {
        class117.method949();
        int var3 = this.field1139 + arg0;
        int var4 = this.field1130 + arg1;
        GL var5 = class117.field2143;
        class117.method939(this.field2489);
        this.method1095(1);
        var5.glTranslatef((float) var3, (float) (class117.field2126 - var4), 0.0F);
        var5.glCallList(this.field2491);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(IIII)V", line = 365)
    public final void method1093(int arg0, int arg1, int arg2, int arg3) {
        class117.method949();
        GL var5 = class117.field2143;
        class117.method939(this.field2489);
        this.method1095(1);
        float var6 = (float) this.field1131 / (float) this.field2495;
        float var7 = (float) this.field1135 / (float) this.field2493;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field1139 + arg0;
        int var11 = this.field1131 * arg2 + var10;
        int var12 = class117.field2126 - arg1 - this.field1130;
        int var13 = var12 - this.field1135 * arg3;
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

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([I)V", line = 396)
    public void method1094(int[] arg0) {
        this.field2495 = class237.method1678(this.field1131, -31981);
        this.field2493 = class237.method1678(this.field1135, -31981);
        byte[] var2 = new byte[this.field2495 * this.field2493 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field2495 - this.field1131) * 4;
        for (int var6 = 0; var6 < this.field1135; var6++) {
            for (int var7 = 0; var7 < this.field1131; var7++) {
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
        GL var10 = class117.field2143;
        if (this.field2489 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field2489 = var11[0];
            this.field2490 = class41.field659;
        }
        class117.method939(this.field2489);
        var10.glTexImage2D(3553, 0, 6408, this.field2495, this.field2493, 0, 6408, 5121, var9);
        class41.field661 += var9.limit() - this.field2492;
        this.field2492 = var9.limit();
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIII)V", line = 455)
    public final void method518(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class117.method949();
        int var5 = this.field1131;
        int var6 = this.field1135;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field1134;
        int var10 = this.field1141;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field1139 > 0) {
            int var13 = ((this.field1139 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field1139 << 16);
        }
        if (this.field1130 > 0) {
            int var14 = ((this.field1130 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field1130 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class117.field2143;
        class117.method939(this.field2489);
        this.method1095(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class117.field2126 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field1131 / (float) this.field2495;
        float var21 = (float) this.field1135 / (float) this.field2493;
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

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)V", line = 525)
    private final void method1095(int arg0) {
        if (this.field2494 == arg0) {
            return;
        }
        this.field2494 = arg0;
        GL var2 = class117.field2143;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }
}
