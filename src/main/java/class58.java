import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class58 extends class17 {

    @OriginalMember(owner = "client!we", name = "U", descriptor = "I")
    public int field1002 = 0;

    @OriginalMember(owner = "client!we", name = "Z", descriptor = "I")
    public int field1007 = -1;

    @OriginalMember(owner = "client!we", name = "Y", descriptor = "I")
    private int field1006 = -1;

    @OriginalMember(owner = "client!we", name = "X", descriptor = "I")
    private int field1005 = 0;

    @OriginalMember(owner = "client!we", name = "T", descriptor = "I")
    public int field1001;

    @OriginalMember(owner = "client!we", name = "V", descriptor = "I")
    private int field1003;

    @OriginalMember(owner = "client!we", name = "W", descriptor = "I")
    public int field1004;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIII)V", line = 6)
    public final void method90(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class42.method307();
        int var5 = this.field197;
        int var6 = this.field199;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field198;
        int var10 = this.field201;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field203 > 0) {
            int var13 = ((this.field203 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field203 << 16);
        }
        if (this.field200 > 0) {
            int var14 = ((this.field200 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field200 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class42.field627;
        class42.method273(this.field1007);
        this.method493(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class42.field622 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field197 / (float) this.field1004;
        float var21 = (float) this.field199 / (float) this.field1001;
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

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(II)V", line = 78)
    public final void method93(int arg0, int arg1) {
        class42.method307();
        int var3 = this.field203 + arg0;
        int var4 = this.field200 + arg1;
        GL var5 = class42.field627;
        class42.method273(this.field1007);
        this.method493(1);
        var5.glTranslatef((float) var3, (float) (class42.field622 - var4), 0.0F);
        float var6 = (float) this.field197 / (float) this.field1004;
        float var7 = (float) this.field199 / (float) this.field1001;
        var5.glBegin(6);
        var5.glTexCoord2f(0.0F, 0.0F);
        var5.glVertex2f((float) this.field197, 0.0F);
        var5.glTexCoord2f(var6, 0.0F);
        var5.glVertex2f(0.0F, 0.0F);
        var5.glTexCoord2f(var6, var7);
        var5.glVertex2f(0.0F, (float) (-this.field199));
        var5.glTexCoord2f(0.0F, var7);
        var5.glVertex2f((float) this.field197, (float) (-this.field199));
        var5.glEnd();
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!we", name = "finalize", descriptor = "()V", line = 105)
    protected final void finalize() throws Throwable {
        if (this.field1007 != -1) {
            class199.method1531(this.field1007, this.field1002, this.field1003);
            this.field1007 = -1;
            this.field1002 = 0;
        }
        if (this.field1006 != -1) {
            class199.method1532(this.field1006, this.field1003);
            this.field1006 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(III)V", line = 121)
    public final void method92(int arg0, int arg1, int arg2) {
        class42.method276();
        int var4 = this.field203 + arg0;
        int var5 = this.field200 + arg1;
        GL var6 = class42.field627;
        class42.method273(this.field1007);
        this.method493(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class42.field622 - var5), 0.0F);
        var6.glCallList(this.field1006);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(IIII)V", line = 134)
    public final void method491(int arg0, int arg1, int arg2, int arg3) {
        class42.method307();
        GL var5 = class42.field627;
        class42.method273(this.field1007);
        this.method493(1);
        float var6 = (float) this.field197 / (float) this.field1004;
        float var7 = (float) this.field199 / (float) this.field1001;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field203 + arg0;
        int var11 = this.field197 * arg2 + var10;
        int var12 = class42.field622 - arg1 - this.field200;
        int var13 = var12 - this.field199 * arg3;
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

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(II)V", line = 165)
    public final void method95(int arg0, int arg1) {
        class42.method307();
        int var3 = this.field203 + arg0;
        int var4 = this.field200 + arg1;
        GL var5 = class42.field627;
        class42.method273(this.field1007);
        this.method493(1);
        var5.glTranslatef((float) var3, (float) (class42.field622 - var4), 0.0F);
        var5.glCallList(this.field1006);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V", line = 179)
    public final void method89(int arg0, int arg1) {
        class42.method307();
        int var3 = this.field203 + arg0;
        int var4 = this.field200 + arg1;
        GL var5 = class42.field627;
        class42.method273(this.field1007);
        this.method493(1);
        var5.glTranslatef((float) var3, (float) (class42.field622 - var4), 0.0F);
        var5.glCallList(this.field1006);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIII)V", line = 191)
    public final void method96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class42.method307();
        GL var7 = class42.field627;
        class42.method273(this.field1007);
        this.method493(1);
        int var8 = arg0 - (this.field203 << 4);
        int var9 = arg1 - (this.field200 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class42.field622 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field1006);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(IIIII)V", line = 208)
    public final void method492(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class42.method276();
        GL var6 = class42.field627;
        class42.method273(this.field1007);
        this.method493(1);
        float var7 = (float) this.field197 / (float) this.field1004;
        float var8 = (float) this.field199 / (float) this.field1001;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field203 + arg0;
        int var12 = this.field197 * arg3 + var11;
        int var13 = class42.field622 - arg1 - this.field200;
        int var14 = var13 - this.field199 * arg4;
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

    @OriginalMember(owner = "client!we", name = "f", descriptor = "(I)V", line = 242)
    public final void method493(int arg0) {
        if (this.field1005 == arg0) {
            return;
        }
        this.field1005 = arg0;
        GL var2 = class42.field627;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(IIIIII)V", line = 261)
    public final void method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class42.method307();
        GL var7 = class42.field627;
        class42.method273(this.field1007);
        this.method493(2);
        int var8 = arg0 - (this.field203 << 4);
        int var9 = arg1 - (this.field200 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class42.field622 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field1006);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(IIIIII[I)V", line = 365)
    public class58(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field198 = arg0;
        this.field201 = arg1;
        this.field203 = arg2;
        this.field200 = arg3;
        this.field197 = arg4;
        this.field199 = arg5;
        this.method498(arg6);
        this.method497();
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lsi;)V", line = 524)
    public class58(class351 arg0) {
        this.field198 = arg0.field198;
        this.field201 = arg0.field201;
        this.field203 = arg0.field203;
        this.field200 = arg0.field200;
        this.field197 = arg0.field197;
        this.field199 = arg0.field199;
        this.method498(arg0.field5571);
        this.method497();
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIIIILwe;)V", line = 289)
    public final void method495(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class58 arg8) {
        if (arg8 == null) {
            return;
        }
        class42.method307();
        class42.method273(arg8.field1007);
        arg8.method493(1);
        GL var10 = class42.field627;
        class42.method273(this.field1007);
        this.method493(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field1007);
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
        float var27 = (float) arg8.field197 / (float) arg8.field1004;
        float var28 = (float) arg8.field199 / (float) arg8.field1001;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field1004 * 65536.0F;
        float var30 = (float) (this.field1001 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class42.field622 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class42.field622 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class42.field622 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class42.field622 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IILwe;)V", line = 376)
    public final void method496(int arg0, int arg1, class58 arg2) {
        if (arg2 == null) {
            return;
        }
        class42.method307();
        class42.method273(arg2.field1007);
        arg2.method493(1);
        GL var4 = class42.field627;
        class42.method273(this.field1007);
        this.method493(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field1007);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class244.field4009) / (float) arg2.field1004;
        float var6 = (float) (arg1 - class244.field4005) / (float) arg2.field1001;
        float var7 = (float) (this.field197 + arg0 - class244.field4009) / (float) arg2.field1004;
        float var8 = (float) (this.field199 + arg1 - class244.field4005) / (float) arg2.field1001;
        int var9 = this.field203 + arg0;
        int var10 = this.field200 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field197 / (float) this.field1004;
        float var12 = (float) this.field199 / (float) this.field1001;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field197 + var9), (float) (class42.field622 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class42.field622 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class42.field622 - (this.field199 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field197 + var9), (float) (class42.field622 - (this.field199 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIII)V", line = 426)
    public final void method94(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class42.method276();
        int var6 = this.field197;
        int var7 = this.field199;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field198;
        int var11 = this.field201;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field203 > 0) {
            int var14 = ((this.field203 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field203 << 16);
        }
        if (this.field200 > 0) {
            int var15 = ((this.field200 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field200 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class42.field627;
        class42.method273(this.field1007);
        this.method493(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class42.field622 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field197 / (float) this.field1004;
        float var22 = (float) this.field199 / (float) this.field1001;
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

    @OriginalMember(owner = "client!we", name = "a", descriptor = "()V", line = 500)
    private final void method497() {
        float var1 = (float) this.field197 / (float) this.field1004;
        float var2 = (float) this.field199 / (float) this.field1001;
        GL var3 = class42.field627;
        if (this.field1006 == -1) {
            this.field1006 = var3.glGenLists(1);
            this.field1003 = class199.field3172;
        }
        var3.glNewList(this.field1006, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field197, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field199));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field197, (float) (-this.field199));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([I)V", line = 535)
    public void method498(int[] arg0) {
        this.field1004 = class206.method1575(this.field197, (byte) 99);
        this.field1001 = class206.method1575(this.field199, (byte) 99);
        byte[] var2 = new byte[this.field1004 * this.field1001 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field1004 - this.field197) * 4;
        for (int var6 = 0; var6 < this.field199; var6++) {
            for (int var7 = 0; var7 < this.field197; var7++) {
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
        GL var10 = class42.field627;
        if (this.field1007 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field1007 = var11[0];
            this.field1003 = class199.field3172;
        }
        class42.method273(this.field1007);
        var10.glTexImage2D(3553, 0, 6408, this.field1004, this.field1001, 0, 6408, 5121, var9);
        class199.field3174 += var9.limit() - this.field1002;
        this.field1002 = var9.limit();
    }
}
