import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class301 implements class70 {

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "Z")
    private boolean field4693 = false;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    private int field4700 = -1;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Ldh;")
    public static class179 field4689 = new class179(5);

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "Ljava/lang/String;")
    public static String field4699 = "flash1:";

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "[I")
    public static int[] field4703 = new int[100];

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "Lcc;")
    public static class263 field4702;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V", line = 6)
    public static void method2120(byte arg0) {
        field4703 = null;
        if (arg0 <= 65) {
            method2122(-104, 79, -119, 16, -58, true, false, 1.4177287F, -87);
        }
        field4702 = null;
        field4699 = null;
        field4689 = null;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "()V", line = 21)
    public final void method17() {
        field4690++;
        GL var1 = class250.field3818;
        class250.method1812(1);
        if (class308.field4756 == null || this.field4700 < 0 || !class162.field2241) {
            var1.glTexEnvi(8960, 34184, 34167);
            return;
        }
        var1.glCallList(this.field4700);
        var1.glActiveTexture(33985);
        class308.field4756.method177();
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glRotatef(-((float) class230.field3362 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
        var1.glRotatef(-((float) class319.field4906 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
        var1.glScalef(-1.0F, 1.0F, 1.0F);
        var1.glMatrixMode(5888);
        var1.glActiveTexture(33984);
        this.field4693 = true;
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "()I", line = 49)
    public final int method16() {
        field4698++;
        return 4;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)I", line = 57)
    public static final int method2121(int arg0, byte arg1) {
        field4688++;
        double var2 = (double) ((arg0 & 0xFF34F7) >> 16) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        double var10 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        double var12 = 0.0D;
        if (var6 < var8) {
            var8 = var6;
        }
        if (var2 < var4) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var14 * 256.0D);
        int var21 = (int) (var18 * 256.0D);
        if (var20 < 0) {
            var20 = 0;
        } else if (var20 > 255) {
            var20 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (arg1 <= 56) {
            method2121(102, (byte) 2);
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var20 >>= 0x4;
        } else if (var22 > 217) {
            var20 >>= 0x3;
        } else if (var22 > 192) {
            var20 >>= 0x2;
        } else if (var22 > 179) {
            var20 >>= 0x1;
        }
        return (var21 >> 2 << 10) + (var20 >> 5 << 7) + (var22 >> 1);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIZZFI)[[I", line = 165)
    public static final int[][] method2122(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6, float arg7, int arg8) {
        field4692++;
        class217 var9 = new class217();
        int[][] var10 = new int[arg8][arg0];
        var9.field3051 = arg3;
        var9.field3056 = arg1;
        var9.field3049 = (int) (arg7 * 4096.0F);
        if (!arg6) {
            return (int[][]) ((int[][]) null);
        }
        var9.field3043 = arg5;
        var9.field3046 = arg4;
        var9.method130(false);
        class224.method1542((byte) -63, arg8, arg0);
        for (int var11 = 0; var11 < arg8; var11++) {
            var9.method1500(var11, var10[var11], 120);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)[Lbi;", line = 195)
    public static final class91[] method2123(byte arg0) {
        field4695++;
        class91[] var1 = new class91[class21.field266];
        for (int var2 = 0; var2 < class21.field266; var2++) {
            int var3 = class54.field664[var2] * class264.field4159[var2];
            byte[] var4 = class153.field2105[var2];
            if (class185.field2668[var2]) {
                byte[] var7 = class118.field1667[var2];
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class48.method283(class134.field1854[class229.method1613(255, var4[var9])], class229.method1613(var7[var9] << 24, -16777216));
                }
                if (class250.field3787) {
                    var1[var2] = new class199(class99.field1288, class78.field988, class120.field1681[var2], class223.field3150[var2], class54.field664[var2], class264.field4159[var2], var8);
                } else {
                    var1[var2] = new class317(class99.field1288, class78.field988, class120.field1681[var2], class223.field3150[var2], class54.field664[var2], class264.field4159[var2], var8);
                }
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class134.field1854[class229.method1613(var4[var6], 255)];
                }
                if (class250.field3787) {
                    var1[var2] = new class202(class99.field1288, class78.field988, class120.field1681[var2], class223.field3150[var2], class54.field664[var2], class264.field4159[var2], var5);
                } else {
                    var1[var2] = new class189(class99.field1288, class78.field988, class120.field1681[var2], class223.field3150[var2], class54.field664[var2], class264.field4159[var2], var5);
                }
            }
        }
        class321.method2238(arg0 + 60);
        if (arg0 == 63) {
            return var1;
        } else {
            return (class91[]) null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 258)
    public final void method14(int arg0) {
        field4694++;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()V", line = 269)
    public final void method15() {
        field4691++;
        GL var1 = class250.field3818;
        if (this.field4693) {
            var1.glCallList(this.field4700 + 1);
            this.field4693 = false;
        } else {
            var1.glTexEnvi(8960, 34184, 5890);
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V", line = 307)
    public class301() {
        if (class250.field3788) {
            GL var1 = class250.field3818;
            this.field4700 = var1.glGenLists(2);
            var1.glNewList(this.field4700, 4864);
            var1.glActiveTexture(33985);
            var1.glTexEnvi(8960, 34161, 34165);
            var1.glTexEnvi(8960, 34178, 34168);
            var1.glTexEnvi(8960, 34162, 7681);
            var1.glTexEnvi(8960, 34184, 34167);
            var1.glTexGeni(8192, 9472, 34066);
            var1.glTexGeni(8193, 9472, 34066);
            var1.glTexGeni(8194, 9472, 34066);
            var1.glEnable(3168);
            var1.glEnable(3169);
            var1.glEnable(3170);
            var1.glEnable(34067);
            var1.glActiveTexture(33984);
            var1.glEndList();
            var1.glNewList(this.field4700 + 1, 4864);
            var1.glActiveTexture(33985);
            var1.glTexEnvi(8960, 34161, 8448);
            var1.glTexEnvi(8960, 34178, 34166);
            var1.glTexEnvi(8960, 34162, 8448);
            var1.glTexEnvi(8960, 34184, 5890);
            var1.glDisable(3168);
            var1.glDisable(3169);
            var1.glDisable(3170);
            var1.glDisable(34067);
            var1.glMatrixMode(5890);
            var1.glLoadIdentity();
            var1.glMatrixMode(5888);
            var1.glActiveTexture(33984);
            var1.glEndList();
        }
    }
}
