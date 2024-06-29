import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class96 extends class316 {

    @OriginalMember(owner = "client!mr", name = "A", descriptor = "Lug;")
    private class395 field1159;

    @OriginalMember(owner = "client!mr", name = "z", descriptor = "Lnq;")
    private class322 field1158;

    @OriginalMember(owner = "client!mr", name = "y", descriptor = "Z")
    private boolean field1157;

    @OriginalMember(owner = "client!mr", name = "B", descriptor = "Lbu;")
    private class17 field1160;

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lug;Lli;[Lqv;Z)V")
    public class96(class395 arg0, class297 arg1, class311[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field1159 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class311 var50 = arg2[var6];
            if (var50.field3980 > var5) {
                var5 = var50.field3980;
            }
            if (var50.field3974 > var5) {
                var5 = var50.field3974;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class311 var10 = arg2[var9];
                byte[] var11 = var10.field3979;
                int var12 = var10.field3980;
                int var13 = var10.field3974;
                int var14 = var9 % 16 * var5;
                int var15 = var9 / 16 * var5;
                int var16 = var7 * var15 + var14;
                int var17 = 0;
                for (int var18 = 0; var18 < var12; var18++) {
                    for (int var19 = 0; var19 < var13; var19++) {
                        var8[var16++] = (byte) (var11[var17++] == 0 ? 0 : -1);
                    }
                    var16 += var7 - var13;
                }
            }
            this.field1158 = class141.method958(var7, 52, 6406, false, 6406, var8, var7, arg0);
            this.field1157 = true;
        } else {
            int[] var20 = new int[var7 * var7];
            for (int var21 = 0; var21 < 256; var21++) {
                class311 var36 = arg2[var21];
                int[] var37 = var36.field3981;
                byte[] var38 = var36.field3977;
                byte[] var39 = var36.field3979;
                int var40 = var36.field3980;
                int var41 = var36.field3974;
                int var42 = var21 % 16 * var5;
                int var43 = var21 / 16 * var5;
                int var44 = var7 * var43 + var42;
                int var45 = 0;
                if (var38 == null) {
                    for (int var48 = 0; var48 < var40; var48++) {
                        for (int var49 = 0; var49 < var41; var49++) {
                            var20[var44++] = var37[var39[var45++] & 0xFF] | 0xFF000000;
                        }
                        var44 += var7 - var41;
                    }
                } else {
                    for (int var46 = 0; var46 < var40; var46++) {
                        for (int var47 = 0; var47 < var41; var47++) {
                            var20[var44++] = var38[var45] << 24 | var37[var39[var45] & 0xFF];
                            var45++;
                        }
                        var44 += var7 - var41;
                    }
                }
            }
            this.field1158 = class5.method31(var7, false, (byte) -96, var7, var20, arg0);
            this.field1157 = false;
        }
        this.field1158.method861(false, 9984);
        this.field1160 = new class17(arg0, 256);
        float var22 = this.field1158.field4080 / (float) this.field1158.field4084;
        float var23 = this.field1158.field4082 / (float) this.field1158.field4089;
        for (int var24 = 0; var24 < 256; var24++) {
            class311 var25 = arg2[var24];
            int var26 = var25.field3980;
            int var27 = var25.field3974;
            int var28 = var25.field3978;
            int var29 = var25.field3976;
            float var30 = (float) (var24 % 16 * var5);
            float var31 = (float) (var24 / 16 * var5);
            float var32 = var22 * var30;
            float var33 = var23 * var31;
            float var34 = ((float) var27 + var30) * var22;
            float var35 = ((float) var26 + var31) * var23;
            this.field1160.method152((byte) 63, var24);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var32, this.field1158.field4082 - var33);
            OpenGL.glVertex2i(var29, var28);
            OpenGL.glTexCoord2f(var32, this.field1158.field4082 - var35);
            OpenGL.glVertex2i(var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field1158.field4082 - var35);
            OpenGL.glVertex2i(var27 + var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field1158.field4082 - var33);
            OpenGL.glVertex2i(var27 + var29, var28);
            OpenGL.glEnd();
            this.field1160.method150((byte) 102);
        }
    }

    @OriginalMember(owner = "client!mr", name = "OA", descriptor = "(CIIIZ)V")
    public final void method40(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field1159.method2315(4);
        this.field1159.method2322(this.field1158, 14);
        if (this.field1157 || arg4) {
            this.field1159.method2271(98, 7681, 8448);
            this.field1159.method2338(34168, 0, false, 768);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field1160.method149(arg0, 4864);
        OpenGL.glLoadIdentity();
        if (this.field1157 || arg4) {
            this.field1159.method2338(5890, 0, false, 768);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(CIIIZLma;II)V")
    public final void method42(char arg0, int arg1, int arg2, int arg3, boolean arg4, class10 arg5, int arg6, int arg7) {
        class195 var9 = (class195) arg5;
        class322 var10 = var9.field2521;
        this.field1159.method2315(4);
        this.field1159.method2322(this.field1158, 14);
        if (this.field1157 || arg4) {
            this.field1159.method2271(-113, 7681, 8448);
            this.field1159.method2338(34168, 0, false, 768);
        }
        this.field1159.method2321(1, 25322);
        this.field1159.method2322(var10, 14);
        this.field1159.method2271(66, 7681, 8448);
        this.field1159.method2338(34168, 0, false, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field4080 / (float) var10.field4084;
        float var12 = var10.field4082 / (float) var10.field4089;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field1160.method149(arg0, 4864);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field1159.method2338(5890, 0, false, 768);
        this.field1159.method2271(-124, 8448, 8448);
        this.field1159.method2322(null, 14);
        this.field1159.method2321(0, 25322);
        if (this.field1157 || arg4) {
            this.field1159.method2338(5890, 0, false, 768);
        }
    }
}
