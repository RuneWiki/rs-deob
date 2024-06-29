import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class325 extends class177 {

    @OriginalMember(owner = "client!bg", name = "U", descriptor = "I")
    public int field4891 = -1;

    @OriginalMember(owner = "client!bg", name = "W", descriptor = "I")
    private int field4893 = -1;

    @OriginalMember(owner = "client!bg", name = "X", descriptor = "I")
    public int field4894 = 0;

    @OriginalMember(owner = "client!bg", name = "Y", descriptor = "I")
    private int field4895 = 0;

    @OriginalMember(owner = "client!bg", name = "S", descriptor = "I")
    public int field4889;

    @OriginalMember(owner = "client!bg", name = "T", descriptor = "I")
    public int field4890;

    @OriginalMember(owner = "client!bg", name = "V", descriptor = "I")
    private int field4892;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(IIII)V", line = 5)
    public final void method651(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class141.method1001();
        int var5 = this.field2536;
        int var6 = this.field2553;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field2555;
        int var10 = this.field2549;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field2537 > 0) {
            int var13 = ((this.field2537 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field2537 << 16);
        }
        if (this.field2544 > 0) {
            int var14 = ((this.field2544 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field2544 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class141.field2025;
        class141.method1000(this.field4891);
        this.method2252(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class141.field2044 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field2536 / (float) this.field4889;
        float var21 = (float) this.field2553 / (float) this.field4890;
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

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILbg;)V", line = 75)
    public final void method2246(int arg0, int arg1, class325 arg2) {
        if (arg2 == null) {
            return;
        }
        class141.method1001();
        class141.method1000(arg2.field4891);
        arg2.method2252(1);
        GL var4 = class141.field2025;
        class141.method1000(this.field4891);
        this.method2252(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field4891);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class205.field3004) / (float) arg2.field4889;
        float var6 = (float) (arg1 - class205.field3006) / (float) arg2.field4890;
        float var7 = (float) (this.field2536 + arg0 - class205.field3004) / (float) arg2.field4889;
        float var8 = (float) (this.field2553 + arg1 - class205.field3006) / (float) arg2.field4890;
        int var9 = this.field2537 + arg0;
        int var10 = this.field2544 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field2536 / (float) this.field4889;
        float var12 = (float) this.field2553 / (float) this.field4890;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field2536 + var9), (float) (class141.field2044 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class141.field2044 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class141.field2044 - (this.field2553 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field2536 + var9), (float) (class141.field2044 - (this.field2553 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "()V", line = 126)
    private final void method2247() {
        float var1 = (float) this.field2536 / (float) this.field4889;
        float var2 = (float) this.field2553 / (float) this.field4890;
        GL var3 = class141.field2025;
        if (this.field4893 == -1) {
            this.field4893 = var3.glGenLists(1);
            this.field4892 = class305.field4573;
        }
        var3.glNewList(this.field4893, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field2536, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field2553));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field2536, (float) (-this.field2553));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)V", line = 153)
    public final void method640(int arg0, int arg1) {
        class141.method1001();
        int var3 = this.field2537 + arg0;
        int var4 = this.field2544 + arg1;
        GL var5 = class141.field2025;
        class141.method1000(this.field4891);
        this.method2252(1);
        var5.glTranslatef((float) var3, (float) (class141.field2044 - var4), 0.0F);
        var5.glCallList(this.field4893);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIII)V", line = 165)
    public final void method641(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class141.method1001();
        GL var7 = class141.field2025;
        class141.method1000(this.field4891);
        this.method2252(1);
        int var8 = arg0 - (this.field2537 << 4);
        int var9 = arg1 - (this.field2544 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class141.field2044 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field4893);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)V", line = 182)
    public final void method647(int arg0, int arg1, int arg2) {
        class141.method1017();
        int var4 = this.field2537 + arg0;
        int var5 = this.field2544 + arg1;
        GL var6 = class141.field2025;
        class141.method1000(this.field4891);
        this.method2252(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class141.field2044 - var5), 0.0F);
        var6.glCallList(this.field4893);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIII)V", line = 195)
    public final void method643(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class141.method1017();
        int var6 = this.field2536;
        int var7 = this.field2553;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field2555;
        int var11 = this.field2549;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field2537 > 0) {
            int var14 = ((this.field2537 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field2537 << 16);
        }
        if (this.field2544 > 0) {
            int var15 = ((this.field2544 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field2544 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class141.field2025;
        class141.method1000(this.field4891);
        this.method2252(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class141.field2044 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field2536 / (float) this.field4889;
        float var22 = (float) this.field2553 / (float) this.field4890;
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

    @OriginalMember(owner = "client!bg", name = "finalize", descriptor = "()V", line = 268)
    protected final void finalize() throws Throwable {
        if (this.field4891 != -1) {
            class305.method2143(this.field4891, this.field4894, this.field4892);
            this.field4891 = -1;
            this.field4894 = 0;
        }
        if (this.field4893 != -1) {
            class305.method2147(this.field4893, this.field4892);
            this.field4893 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(IIII)V", line = 285)
    public final void method2248(int arg0, int arg1, int arg2, int arg3) {
        class141.method1001();
        GL var5 = class141.field2025;
        class141.method1000(this.field4891);
        this.method2252(1);
        float var6 = (float) this.field2536 / (float) this.field4889;
        float var7 = (float) this.field2553 / (float) this.field4890;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field2537 + arg0;
        int var11 = this.field2536 * arg2 + var10;
        int var12 = class141.field2044 - arg1 - this.field2544;
        int var13 = var12 - this.field2553 * arg3;
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

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(IIIIII)V", line = 317)
    public final void method2249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class141.method1001();
        GL var7 = class141.field2025;
        class141.method1000(this.field4891);
        this.method2252(2);
        int var8 = arg0 - (this.field2537 << 4);
        int var9 = arg1 - (this.field2544 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class141.field2044 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field4893);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V", line = 336)
    public final void method642(int arg0, int arg1) {
        class141.method1001();
        int var3 = this.field2537 + arg0;
        int var4 = this.field2544 + arg1;
        GL var5 = class141.field2025;
        class141.method1000(this.field4891);
        this.method2252(1);
        var5.glTranslatef((float) var3, (float) (class141.field2044 - var4), 0.0F);
        var5.glCallList(this.field4893);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(IIIIII[I)V", line = 572)
    public class325(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field2555 = arg0;
        this.field2549 = arg1;
        this.field2537 = arg2;
        this.field2544 = arg3;
        this.field2536 = arg4;
        this.field2553 = arg5;
        this.method2056(arg6);
        this.method2247();
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lln;)V", line = 582)
    public class325(class118 arg0) {
        this.field2555 = arg0.field2555;
        this.field2549 = arg0.field2549;
        this.field2537 = arg0.field2537;
        this.field2544 = arg0.field2544;
        this.field2536 = arg0.field2536;
        this.field2553 = arg0.field2553;
        this.method2056(arg0.field1665);
        this.method2247();
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([I)V", line = 351)
    public void method2056(int[] arg0) {
        this.field4889 = class344.method2409(this.field2536, -24724);
        this.field4890 = class344.method2409(this.field2553, -24724);
        byte[] var2 = new byte[this.field4890 * this.field4889 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field4889 - this.field2536) * 4;
        for (int var6 = 0; var6 < this.field2553; var6++) {
            for (int var7 = 0; var7 < this.field2536; var7++) {
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
        GL var10 = class141.field2025;
        if (this.field4891 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field4891 = var11[0];
            this.field4892 = class305.field4573;
        }
        class141.method1000(this.field4891);
        var10.glTexImage2D(3553, 0, 6408, this.field4889, this.field4890, 0, 6408, 5121, var9);
        class305.field4569 += var9.limit() - this.field4894;
        this.field4894 = var9.limit();
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(IIIII)V", line = 409)
    public final void method2250(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class141.method1017();
        GL var6 = class141.field2025;
        class141.method1000(this.field4891);
        this.method2252(1);
        float var7 = (float) this.field2536 / (float) this.field4889;
        float var8 = (float) this.field2553 / (float) this.field4890;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field2537 + arg0;
        int var12 = this.field2536 * arg3 + var11;
        int var13 = class141.field2044 - arg1 - this.field2544;
        int var14 = var13 - this.field2553 * arg4;
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

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIIIILbg;)V", line = 444)
    public final void method2251(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class325 arg8) {
        if (arg8 == null) {
            return;
        }
        class141.method1001();
        class141.method1000(arg8.field4891);
        arg8.method2252(1);
        GL var10 = class141.field2025;
        class141.method1000(this.field4891);
        this.method2252(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field4891);
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
        float var27 = (float) arg8.field2536 / (float) arg8.field4889;
        float var28 = (float) arg8.field2553 / (float) arg8.field4890;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field4889 * 65536.0F;
        float var30 = (float) (this.field4890 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class141.field2044 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class141.field2044 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class141.field2044 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class141.field2044 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(II)V", line = 521)
    public final void method646(int arg0, int arg1) {
        class141.method1001();
        int var3 = this.field2537 + arg0;
        int var4 = this.field2544 + arg1;
        GL var5 = class141.field2025;
        class141.method1000(this.field4891);
        this.method2252(1);
        var5.glTranslatef((float) var3, (float) (class141.field2044 - var4), 0.0F);
        float var6 = (float) this.field2536 / (float) this.field4889;
        float var7 = (float) this.field2553 / (float) this.field4890;
        var5.glBegin(6);
        var5.glTexCoord2f(0.0F, 0.0F);
        var5.glVertex2f((float) this.field2536, 0.0F);
        var5.glTexCoord2f(var6, 0.0F);
        var5.glVertex2f(0.0F, 0.0F);
        var5.glTexCoord2f(var6, var7);
        var5.glVertex2f(0.0F, (float) (-this.field2553));
        var5.glTexCoord2f(0.0F, var7);
        var5.glVertex2f((float) this.field2536, (float) (-this.field2553));
        var5.glEnd();
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "(I)V", line = 550)
    public final void method2252(int arg0) {
        if (this.field4895 == arg0) {
            return;
        }
        this.field4895 = arg0;
        GL var2 = class141.field2025;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }
}
