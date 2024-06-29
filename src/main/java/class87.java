import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class87 extends class135 {

    @OriginalMember(owner = "client!qb", name = "db", descriptor = "I")
    private int field1572 = -1;

    @OriginalMember(owner = "client!qb", name = "eb", descriptor = "I")
    public int field1573 = -1;

    @OriginalMember(owner = "client!qb", name = "bb", descriptor = "I")
    public int field1570 = 0;

    @OriginalMember(owner = "client!qb", name = "fb", descriptor = "I")
    private int field1574 = 0;

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "I")
    public int field1568;

    @OriginalMember(owner = "client!qb", name = "ab", descriptor = "I")
    public int field1569;

    @OriginalMember(owner = "client!qb", name = "cb", descriptor = "I")
    private int field1571;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIIILqb;)V", line = 5)
    public final void method635(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class87 arg8) {
        if (arg8 == null) {
            return;
        }
        class253.method1712();
        class253.method1714(arg8.field1573);
        arg8.method645(1);
        GL var10 = class253.field4319;
        class253.method1714(this.field1573);
        this.method645(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field1573);
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
        float var27 = (float) arg8.field2343 / (float) arg8.field1568;
        float var28 = (float) arg8.field2348 / (float) arg8.field1569;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field1568 * 65536.0F;
        float var30 = (float) (this.field1569 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class253.field4329 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class253.field4329 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class253.field4329 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class253.field4329 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILqb;)V", line = 79)
    public final void method636(int arg0, int arg1, class87 arg2) {
        if (arg2 == null) {
            return;
        }
        class253.method1712();
        class253.method1714(arg2.field1573);
        arg2.method645(1);
        GL var4 = class253.field4319;
        class253.method1714(this.field1573);
        this.method645(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field1573);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class60.field1081) / (float) arg2.field1568;
        float var6 = (float) (arg1 - class60.field1085) / (float) arg2.field1569;
        float var7 = (float) (this.field2343 + arg0 - class60.field1081) / (float) arg2.field1568;
        float var8 = (float) (this.field2348 + arg1 - class60.field1085) / (float) arg2.field1569;
        int var9 = this.field2344 + arg0;
        int var10 = this.field2342 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field2343 / (float) this.field1568;
        float var12 = (float) this.field2348 / (float) this.field1569;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field2343 + var9), (float) (class253.field4329 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class253.field4329 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class253.field4329 - (this.field2348 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field2343 + var9), (float) (class253.field4329 - (this.field2348 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(II)V", line = 129)
    public final void method637(int arg0, int arg1) {
        class253.method1712();
        int var3 = this.field2344 + arg0;
        int var4 = this.field2342 + arg1;
        GL var5 = class253.field4319;
        class253.method1714(this.field1573);
        this.method645(1);
        var5.glTranslatef((float) var3, (float) (class253.field4329 - var4), 0.0F);
        var5.glCallList(this.field1572);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([I)V", line = 141)
    public void method638(int[] arg0) {
        this.field1568 = class124.method859((byte) -95, this.field2343);
        this.field1569 = class124.method859((byte) -93, this.field2348);
        byte[] var2 = new byte[this.field1569 * this.field1568 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field1568 - this.field2343) * 4;
        for (int var6 = 0; var6 < this.field2348; var6++) {
            for (int var7 = 0; var7 < this.field2343; var7++) {
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
        GL var10 = class253.field4319;
        if (this.field1573 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field1573 = var11[0];
            this.field1571 = class221.field3871;
        }
        class253.method1714(this.field1573);
        var10.glTexImage2D(3553, 0, 6408, this.field1568, this.field1569, 0, 6408, 5121, var9);
        class221.field3867 += var9.limit() - this.field1570;
        this.field1570 = var9.limit();
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(IIIII)V", line = 200)
    public final void method639(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class253.method1705();
        GL var6 = class253.field4319;
        class253.method1714(this.field1573);
        this.method645(1);
        float var7 = (float) this.field2343 / (float) this.field1568;
        float var8 = (float) this.field2348 / (float) this.field1569;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field2344 + arg0;
        int var12 = this.field2343 * arg3 + var11;
        int var13 = class253.field4329 - arg1 - this.field2342;
        int var14 = var13 - this.field2348 * arg4;
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

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIII)V", line = 235)
    public final void method640(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class253.method1712();
        GL var7 = class253.field4319;
        class253.method1714(this.field1573);
        this.method645(1);
        int var8 = arg0 - (this.field2344 << 4);
        int var9 = arg1 - (this.field2342 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class253.field4329 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field1572);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(IIIIII)V", line = 253)
    public final void method641(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class253.method1712();
        GL var7 = class253.field4319;
        class253.method1714(this.field1573);
        this.method645(2);
        int var8 = arg0 - (this.field2344 << 4);
        int var9 = arg1 - (this.field2342 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class253.field4329 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field1572);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "()V", line = 271)
    private final void method642() {
        float var1 = (float) this.field2343 / (float) this.field1568;
        float var2 = (float) this.field2348 / (float) this.field1569;
        GL var3 = class253.field4319;
        if (this.field1572 == -1) {
            this.field1572 = var3.glGenLists(1);
            this.field1571 = class221.field3871;
        }
        var3.glNewList(this.field1572, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field2343, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field2348));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field2343, (float) (-this.field2348));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!qb", name = "finalize", descriptor = "()V", line = 296)
    protected final void finalize() throws Throwable {
        if (this.field1573 != -1) {
            class221.method1525(this.field1573, this.field1570, this.field1571);
            this.field1573 = -1;
            this.field1570 = 0;
        }
        if (this.field1572 != -1) {
            class221.method1523(this.field1572, this.field1571);
            this.field1572 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIII)V", line = 313)
    public final void method643(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class253.method1705();
        int var6 = this.field2343;
        int var7 = this.field2348;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field2351;
        int var11 = this.field2354;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field2344 > 0) {
            int var14 = ((this.field2344 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field2344 << 16);
        }
        if (this.field2342 > 0) {
            int var15 = ((this.field2342 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field2342 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class253.field4319;
        class253.method1714(this.field1573);
        this.method645(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class253.field4329 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field2343 / (float) this.field1568;
        float var22 = (float) this.field2348 / (float) this.field1569;
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

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(IIII)V", line = 386)
    public final void method644(int arg0, int arg1, int arg2, int arg3) {
        class253.method1712();
        GL var5 = class253.field4319;
        class253.method1714(this.field1573);
        this.method645(1);
        float var6 = (float) this.field2343 / (float) this.field1568;
        float var7 = (float) this.field2348 / (float) this.field1569;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field2344 + arg0;
        int var11 = this.field2343 * arg2 + var10;
        int var12 = class253.field4329 - arg1 - this.field2342;
        int var13 = var12 - this.field2348 * arg3;
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

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "(I)V", line = 419)
    private final void method645(int arg0) {
        if (this.field1574 == arg0) {
            return;
        }
        this.field1574 = arg0;
        GL var2 = class253.field4319;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)V", line = 439)
    public final void method646(int arg0, int arg1) {
        class253.method1712();
        int var3 = this.field2344 + arg0;
        int var4 = this.field2342 + arg1;
        GL var5 = class253.field4319;
        class253.method1714(this.field1573);
        this.method645(1);
        var5.glTranslatef((float) var3, (float) (class253.field4329 - var4), 0.0F);
        var5.glCallList(this.field1572);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IIIIII[I)V", line = 559)
    public class87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field2351 = arg0;
        this.field2354 = arg1;
        this.field2344 = arg2;
        this.field2342 = arg3;
        this.field2343 = arg4;
        this.field2348 = arg5;
        this.method638(arg6);
        this.method642();
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lj;)V", line = 582)
    public class87(class227 arg0) {
        this.field2351 = arg0.field2351;
        this.field2354 = arg0.field2354;
        this.field2344 = arg0.field2344;
        this.field2342 = arg0.field2342;
        this.field2343 = arg0.field2343;
        this.field2348 = arg0.field2348;
        this.method638(arg0.field3921);
        this.method642();
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(II)V", line = 455)
    public final void method647(int arg0, int arg1) {
        class253.method1712();
        int var3 = this.field2344 + arg0;
        int var4 = this.field2342 + arg1;
        GL var5 = class253.field4319;
        class253.method1714(this.field1573);
        this.method645(1);
        var5.glTranslatef((float) var3, (float) (class253.field4329 - var4), 0.0F);
        float var6 = (float) this.field2343 / (float) this.field1568;
        float var7 = (float) this.field2348 / (float) this.field1569;
        var5.glBegin(6);
        var5.glTexCoord2f(0.0F, 0.0F);
        var5.glVertex2f((float) this.field2343, 0.0F);
        var5.glTexCoord2f(var6, 0.0F);
        var5.glVertex2f(0.0F, 0.0F);
        var5.glTexCoord2f(var6, var7);
        var5.glVertex2f(0.0F, (float) (-this.field2348));
        var5.glTexCoord2f(0.0F, var7);
        var5.glVertex2f((float) this.field2343, (float) (-this.field2348));
        var5.glEnd();
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII)V", line = 483)
    public final void method648(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class253.method1712();
        int var5 = this.field2343;
        int var6 = this.field2348;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field2351;
        int var10 = this.field2354;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field2344 > 0) {
            int var13 = ((this.field2344 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field2344 << 16);
        }
        if (this.field2342 > 0) {
            int var14 = ((this.field2342 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field2342 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class253.field4319;
        class253.method1714(this.field1573);
        this.method645(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class253.field4329 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field2343 / (float) this.field1568;
        float var21 = (float) this.field2348 / (float) this.field1569;
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

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(III)V", line = 570)
    public final void method649(int arg0, int arg1, int arg2) {
        class253.method1705();
        int var4 = this.field2344 + arg0;
        int var5 = this.field2342 + arg1;
        GL var6 = class253.field4319;
        class253.method1714(this.field1573);
        this.method645(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class253.field4329 - var5), 0.0F);
        var6.glCallList(this.field1572);
        var6.glLoadIdentity();
    }
}
