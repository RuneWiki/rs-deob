import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class8 extends class70 {

    @OriginalMember(owner = "client!aa", name = "X", descriptor = "I")
    public int field168 = -1;

    @OriginalMember(owner = "client!aa", name = "Z", descriptor = "I")
    private int field170 = -1;

    @OriginalMember(owner = "client!aa", name = "Y", descriptor = "I")
    private int field169 = 0;

    @OriginalMember(owner = "client!aa", name = "db", descriptor = "I")
    public int field174 = 0;

    @OriginalMember(owner = "client!aa", name = "ab", descriptor = "I")
    private int field171;

    @OriginalMember(owner = "client!aa", name = "bb", descriptor = "I")
    public int field172;

    @OriginalMember(owner = "client!aa", name = "cb", descriptor = "I")
    public int field173;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(II)V", line = 5)
    public final void method46(int arg0, int arg1) {
        class271.method1967();
        int var3 = this.field1150 + arg0;
        int var4 = this.field1148 + arg1;
        GL var5 = class271.field4641;
        class271.method1978(this.field168);
        this.method48(1);
        var5.glTranslatef((float) var3, (float) (class271.field4628 - var4), 0.0F);
        float var6 = (float) this.field1145 / (float) this.field173;
        float var7 = (float) this.field1155 / (float) this.field172;
        var5.glBegin(6);
        var5.glTexCoord2f(0.0F, 0.0F);
        var5.glVertex2f((float) this.field1145, 0.0F);
        var5.glTexCoord2f(var6, 0.0F);
        var5.glVertex2f(0.0F, 0.0F);
        var5.glTexCoord2f(var6, var7);
        var5.glVertex2f(0.0F, (float) (-this.field1155));
        var5.glTexCoord2f(0.0F, var7);
        var5.glVertex2f((float) this.field1145, (float) (-this.field1155));
        var5.glEnd();
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!aa", name = "finalize", descriptor = "()V", line = 31)
    protected final void finalize() throws Throwable {
        if (this.field168 != -1) {
            class68.method503(this.field168, this.field174, this.field171);
            this.field168 = -1;
            this.field174 = 0;
        }
        if (this.field170 != -1) {
            class68.method502(this.field170, this.field171);
            this.field170 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)V", line = 49)
    public final void method47(int arg0, int arg1) {
        class271.method1967();
        int var3 = this.field1150 + arg0;
        int var4 = this.field1148 + arg1;
        GL var5 = class271.field4641;
        class271.method1978(this.field168);
        this.method48(1);
        var5.glTranslatef((float) var3, (float) (class271.field4628 - var4), 0.0F);
        var5.glCallList(this.field170);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)V", line = 61)
    private final void method48(int arg0) {
        if (this.field169 == arg0) {
            return;
        }
        this.field169 = arg0;
        GL var2 = class271.field4641;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(II)V", line = 81)
    public final void method49(int arg0, int arg1) {
        class271.method1967();
        int var3 = this.field1150 + arg0;
        int var4 = this.field1148 + arg1;
        GL var5 = class271.field4641;
        class271.method1978(this.field168);
        this.method48(1);
        var5.glTranslatef((float) var3, (float) (class271.field4628 - var4), 0.0F);
        var5.glCallList(this.field170);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIII)V", line = 93)
    public final void method50(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class271.method1965();
        int var6 = this.field1145;
        int var7 = this.field1155;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field1144;
        int var11 = this.field1140;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field1150 > 0) {
            int var14 = ((this.field1150 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field1150 << 16);
        }
        if (this.field1148 > 0) {
            int var15 = ((this.field1148 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field1148 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class271.field4641;
        class271.method1978(this.field168);
        this.method48(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class271.field4628 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field1145 / (float) this.field173;
        float var22 = (float) this.field1155 / (float) this.field172;
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

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(IIIII)V", line = 166)
    public final void method51(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class271.method1965();
        GL var6 = class271.field4641;
        class271.method1978(this.field168);
        this.method48(1);
        float var7 = (float) this.field1145 / (float) this.field173;
        float var8 = (float) this.field1155 / (float) this.field172;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field1150 + arg0;
        int var12 = this.field1145 * arg3 + var11;
        int var13 = class271.field4628 - arg1 - this.field1148;
        int var14 = var13 - this.field1155 * arg4;
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

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIIIIILaa;)V", line = 200)
    public final void method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class8 arg8) {
        if (arg8 == null) {
            return;
        }
        class271.method1967();
        class271.method1978(arg8.field168);
        arg8.method48(1);
        GL var10 = class271.field4641;
        class271.method1978(this.field168);
        this.method48(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field168);
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
        float var27 = (float) arg8.field1145 / (float) arg8.field173;
        float var28 = (float) arg8.field1155 / (float) arg8.field172;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field173 * 65536.0F;
        float var30 = (float) (this.field172 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class271.field4628 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class271.field4628 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class271.field4628 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class271.field4628 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)V", line = 276)
    public final void method53(int arg0, int arg1, int arg2) {
        class271.method1965();
        int var4 = this.field1150 + arg0;
        int var5 = this.field1148 + arg1;
        GL var6 = class271.field4641;
        class271.method1978(this.field168);
        this.method48(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class271.field4628 - var5), 0.0F);
        var6.glCallList(this.field170);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(IIIIII[I)V", line = 572)
    public class8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field1144 = arg0;
        this.field1140 = arg1;
        this.field1150 = arg2;
        this.field1148 = arg3;
        this.field1145 = arg4;
        this.field1155 = arg5;
        this.method59(arg6);
        this.method57();
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Ltg;)V", line = 582)
    public class8(class307 arg0) {
        this.field1144 = arg0.field1144;
        this.field1140 = arg0.field1140;
        this.field1150 = arg0.field1150;
        this.field1148 = arg0.field1148;
        this.field1145 = arg0.field1145;
        this.field1155 = arg0.field1155;
        this.method59(arg0.field5243);
        this.method57();
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(IIII)V", line = 295)
    public final void method54(int arg0, int arg1, int arg2, int arg3) {
        class271.method1967();
        GL var5 = class271.field4641;
        class271.method1978(this.field168);
        this.method48(1);
        float var6 = (float) this.field1145 / (float) this.field173;
        float var7 = (float) this.field1155 / (float) this.field172;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field1150 + arg0;
        int var11 = this.field1145 * arg2 + var10;
        int var12 = class271.field4628 - arg1 - this.field1148;
        int var13 = var12 - this.field1155 * arg3;
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

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(IIIIII)V", line = 326)
    public final void method55(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class271.method1967();
        GL var7 = class271.field4641;
        class271.method1978(this.field168);
        this.method48(2);
        int var8 = arg0 - (this.field1150 << 4);
        int var9 = arg1 - (this.field1148 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class271.field4628 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field170);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(IIIIII)V", line = 344)
    public final void method56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class271.method1967();
        GL var7 = class271.field4641;
        class271.method1978(this.field168);
        this.method48(1);
        int var8 = arg0 - (this.field1150 << 4);
        int var9 = arg1 - (this.field1148 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class271.field4628 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field170);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "()V", line = 362)
    private final void method57() {
        float var1 = (float) this.field1145 / (float) this.field173;
        float var2 = (float) this.field1155 / (float) this.field172;
        GL var3 = class271.field4641;
        if (this.field170 == -1) {
            this.field170 = var3.glGenLists(1);
            this.field171 = class68.field1125;
        }
        var3.glNewList(this.field170, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field1145, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field1155));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field1145, (float) (-this.field1155));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIII)V", line = 387)
    public final void method58(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class271.method1967();
        int var5 = this.field1145;
        int var6 = this.field1155;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field1144;
        int var10 = this.field1140;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field1150 > 0) {
            int var13 = ((this.field1150 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field1150 << 16);
        }
        if (this.field1148 > 0) {
            int var14 = ((this.field1148 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field1148 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class271.field4641;
        class271.method1978(this.field168);
        this.method48(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class271.field4628 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field1145 / (float) this.field173;
        float var21 = (float) this.field1155 / (float) this.field172;
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

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([I)V", line = 457)
    public void method59(int[] arg0) {
        this.field173 = class272.method1993(this.field1145, 114);
        this.field172 = class272.method1993(this.field1155, 110);
        byte[] var2 = new byte[this.field173 * this.field172 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field173 - this.field1145) * 4;
        for (int var6 = 0; var6 < this.field1155; var6++) {
            for (int var7 = 0; var7 < this.field1145; var7++) {
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
        GL var10 = class271.field4641;
        if (this.field168 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field168 = var11[0];
            this.field171 = class68.field1125;
        }
        class271.method1978(this.field168);
        var10.glTexImage2D(3553, 0, 6408, this.field173, this.field172, 0, 6408, 5121, var9);
        class68.field1129 += var9.limit() - this.field174;
        this.field174 = var9.limit();
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILaa;)V", line = 523)
    public final void method60(int arg0, int arg1, class8 arg2) {
        if (arg2 == null) {
            return;
        }
        class271.method1967();
        class271.method1978(arg2.field168);
        arg2.method48(1);
        GL var4 = class271.field4641;
        class271.method1978(this.field168);
        this.method48(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field168);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class131.field2223) / (float) arg2.field173;
        float var6 = (float) (arg1 - class131.field2221) / (float) arg2.field172;
        float var7 = (float) (this.field1145 + arg0 - class131.field2223) / (float) arg2.field173;
        float var8 = (float) (this.field1155 + arg1 - class131.field2221) / (float) arg2.field172;
        int var9 = this.field1150 + arg0;
        int var10 = this.field1148 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field1145 / (float) this.field173;
        float var12 = (float) this.field1155 / (float) this.field172;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field1145 + var9), (float) (class271.field4628 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class271.field4628 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class271.field4628 - (this.field1155 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field1145 + var9), (float) (class271.field4628 - (this.field1155 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }
}
