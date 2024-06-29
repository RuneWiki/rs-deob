import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class239 extends class169 {

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
    private int field3734 = 0;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "I")
    private int field3736 = -1;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
    public int field3739 = -1;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "I")
    public int field3737 = 0;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
    public int field3733;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
    private int field3735;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
    public int field3738;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([I)V", line = 5)
    public void method201(int[] arg0) {
        this.field3733 = class215.method1568(479166497, this.field2788);
        this.field3738 = class215.method1568(479166497, this.field2791);
        byte[] var2 = new byte[this.field3738 * this.field3733 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field3733 - this.field2788) * 4;
        for (int var6 = 0; var6 < this.field2791; var6++) {
            for (int var7 = 0; var7 < this.field2788; var7++) {
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
        GL var10 = class109.field1456;
        if (this.field3739 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field3739 = var11[0];
            this.field3735 = class103.field1369;
        }
        class109.method752(this.field3739);
        var10.glTexImage2D(3553, 0, 6408, this.field3733, this.field3738, 0, 6408, 5121, var9);
        class103.field1370 += var9.limit() - this.field3737;
        this.field3737 = var9.limit();
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIIILrc;)V", line = 63)
    public final void method1704(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class239 arg8) {
        if (arg8 == null) {
            return;
        }
        class109.method761();
        class109.method752(arg8.field3739);
        arg8.method1705(1);
        GL var10 = class109.field1456;
        class109.method752(this.field3739);
        this.method1705(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field3739);
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
        float var27 = (float) arg8.field2788 / (float) arg8.field3733;
        float var28 = (float) arg8.field2791 / (float) arg8.field3738;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field3733 * 65536.0F;
        float var30 = (float) (this.field3738 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class109.field1499 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class109.field1499 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class109.field1499 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class109.field1499 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)V", line = 139)
    private final void method1705(int arg0) {
        if (this.field3734 == arg0) {
            return;
        }
        this.field3734 = arg0;
        GL var2 = class109.field1456;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(IIIIII)V", line = 159)
    public final void method1706(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class109.method761();
        GL var7 = class109.field1456;
        class109.method752(this.field3739);
        this.method1705(2);
        int var8 = arg0 - (this.field2783 << 4);
        int var9 = arg1 - (this.field2784 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class109.field1499 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field3736);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(IIIIII[I)V", line = 572)
    public class239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field2793 = arg0;
        this.field2790 = arg1;
        this.field2783 = arg2;
        this.field2784 = arg3;
        this.field2788 = arg4;
        this.field2791 = arg5;
        this.method201(arg6);
        this.method1707();
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lun;)V", line = 582)
    public class239(class190 arg0) {
        this.field2793 = arg0.field2793;
        this.field2790 = arg0.field2790;
        this.field2783 = arg0.field2783;
        this.field2784 = arg0.field2784;
        this.field2788 = arg0.field2788;
        this.field2791 = arg0.field2791;
        this.method201(arg0.field3038);
        this.method1707();
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIII)V", line = 179)
    public final void method1268(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class109.method761();
        GL var7 = class109.field1456;
        class109.method752(this.field3739);
        this.method1705(1);
        int var8 = arg0 - (this.field2783 << 4);
        int var9 = arg1 - (this.field2784 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class109.field1499 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field3736);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "()V", line = 197)
    private final void method1707() {
        float var1 = (float) this.field2788 / (float) this.field3733;
        float var2 = (float) this.field2791 / (float) this.field3738;
        GL var3 = class109.field1456;
        if (this.field3736 == -1) {
            this.field3736 = var3.glGenLists(1);
            this.field3735 = class103.field1369;
        }
        var3.glNewList(this.field3736, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field2788, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field2791));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field2788, (float) (-this.field2791));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V", line = 224)
    public final void method1267(int arg0, int arg1) {
        class109.method761();
        int var3 = this.field2783 + arg0;
        int var4 = this.field2784 + arg1;
        GL var5 = class109.field1456;
        class109.method752(this.field3739);
        this.method1705(1);
        var5.glTranslatef((float) var3, (float) (class109.field1499 - var4), 0.0F);
        float var6 = (float) this.field2788 / (float) this.field3733;
        float var7 = (float) this.field2791 / (float) this.field3738;
        var5.glBegin(6);
        var5.glTexCoord2f(0.0F, 0.0F);
        var5.glVertex2f((float) this.field2788, 0.0F);
        var5.glTexCoord2f(var6, 0.0F);
        var5.glVertex2f(0.0F, 0.0F);
        var5.glTexCoord2f(var6, var7);
        var5.glVertex2f(0.0F, (float) (-this.field2791));
        var5.glTexCoord2f(0.0F, var7);
        var5.glVertex2f((float) this.field2788, (float) (-this.field2791));
        var5.glEnd();
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(IIIII)V", line = 253)
    public final void method1708(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class109.method754();
        GL var6 = class109.field1456;
        class109.method752(this.field3739);
        this.method1705(1);
        float var7 = (float) this.field2788 / (float) this.field3733;
        float var8 = (float) this.field2791 / (float) this.field3738;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field2783 + arg0;
        int var12 = this.field2788 * arg3 + var11;
        int var13 = class109.field1499 - arg1 - this.field2784;
        int var14 = var13 - this.field2791 * arg4;
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

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILrc;)V", line = 287)
    public final void method1709(int arg0, int arg1, class239 arg2) {
        if (arg2 == null) {
            return;
        }
        class109.method761();
        class109.method752(arg2.field3739);
        arg2.method1705(1);
        GL var4 = class109.field1456;
        class109.method752(this.field3739);
        this.method1705(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field3739);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class122.field1759) / (float) arg2.field3733;
        float var6 = (float) (arg1 - class122.field1758) / (float) arg2.field3738;
        float var7 = (float) (this.field2788 + arg0 - class122.field1759) / (float) arg2.field3733;
        float var8 = (float) (this.field2791 + arg1 - class122.field1758) / (float) arg2.field3738;
        int var9 = this.field2783 + arg0;
        int var10 = this.field2784 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field2788 / (float) this.field3733;
        float var12 = (float) this.field2791 / (float) this.field3738;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field2788 + var9), (float) (class109.field1499 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class109.field1499 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class109.field1499 - (this.field2791 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field2788 + var9), (float) (class109.field1499 - (this.field2791 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII)V", line = 337)
    public final void method1274(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class109.method754();
        int var6 = this.field2788;
        int var7 = this.field2791;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field2793;
        int var11 = this.field2790;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field2783 > 0) {
            int var14 = ((this.field2783 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field2783 << 16);
        }
        if (this.field2784 > 0) {
            int var15 = ((this.field2784 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field2784 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class109.field1456;
        class109.method752(this.field3739);
        this.method1705(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class109.field1499 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field2788 / (float) this.field3733;
        float var22 = (float) this.field2791 / (float) this.field3738;
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

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)V", line = 410)
    public final void method1269(int arg0, int arg1) {
        class109.method761();
        int var3 = this.field2783 + arg0;
        int var4 = this.field2784 + arg1;
        GL var5 = class109.field1456;
        class109.method752(this.field3739);
        this.method1705(1);
        var5.glTranslatef((float) var3, (float) (class109.field1499 - var4), 0.0F);
        var5.glCallList(this.field3736);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(IIII)V", line = 422)
    public final void method1710(int arg0, int arg1, int arg2, int arg3) {
        class109.method761();
        GL var5 = class109.field1456;
        class109.method752(this.field3739);
        this.method1705(1);
        float var6 = (float) this.field2788 / (float) this.field3733;
        float var7 = (float) this.field2791 / (float) this.field3738;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field2783 + arg0;
        int var11 = this.field2788 * arg2 + var10;
        int var12 = class109.field1499 - arg1 - this.field2784;
        int var13 = var12 - this.field2791 * arg3;
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

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(II)V", line = 455)
    public final void method1273(int arg0, int arg1) {
        class109.method761();
        int var3 = this.field2783 + arg0;
        int var4 = this.field2784 + arg1;
        GL var5 = class109.field1456;
        class109.method752(this.field3739);
        this.method1705(1);
        var5.glTranslatef((float) var3, (float) (class109.field1499 - var4), 0.0F);
        var5.glCallList(this.field3736);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!rc", name = "finalize", descriptor = "()V", line = 467)
    protected final void finalize() throws Throwable {
        if (this.field3739 != -1) {
            class103.method718(this.field3739, this.field3737, this.field3735);
            this.field3739 = -1;
            this.field3737 = 0;
        }
        if (this.field3736 != -1) {
            class103.method720(this.field3736, this.field3735);
            this.field3736 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)V", line = 487)
    public final void method1262(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class109.method761();
        int var5 = this.field2788;
        int var6 = this.field2791;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field2793;
        int var10 = this.field2790;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field2783 > 0) {
            int var13 = ((this.field2783 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field2783 << 16);
        }
        if (this.field2784 > 0) {
            int var14 = ((this.field2784 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field2784 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class109.field1456;
        class109.method752(this.field3739);
        this.method1705(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class109.field1499 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field2788 / (float) this.field3733;
        float var21 = (float) this.field2791 / (float) this.field3738;
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

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(III)V", line = 560)
    public final void method1265(int arg0, int arg1, int arg2) {
        class109.method754();
        int var4 = this.field2783 + arg0;
        int var5 = this.field2784 + arg1;
        GL var6 = class109.field1456;
        class109.method752(this.field3739);
        this.method1705(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class109.field1499 - var5), 0.0F);
        var6.glCallList(this.field3736);
        var6.glLoadIdentity();
    }
}
