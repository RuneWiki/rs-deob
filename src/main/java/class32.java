import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class32 implements class70 {

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "[F")
    private float[] field404 = new float[4];

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "Ljava/lang/String;")
    public static String field407 = "slide:";

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    private int field406;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "Loh;")
    public static class18 field408;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBZLlc;II)V", line = 5)
    public static final void method192(int arg0, byte arg1, boolean arg2, class175 arg3, int arg4, int arg5) {
        class96.field1252 = arg4;
        class283.field4440 = arg3;
        class224.field3177 = arg2;
        class267.field4212 = arg0;
        class259.field3933 = arg5;
        field397++;
        class216.field3040 = 10000;
        class281.field4357 = 1;
        if (arg1 != -123) {
            method196(81, 26, -108, 113, -18, 10, (byte) 25);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V", line = 26)
    public final void method14(int arg0) {
        GL var2 = class250.field3818;
        field398++;
        float var3 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        float var4 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
        float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var6 = (arg0 & 0x80) != 0;
        if (var6) {
            this.field404[3] = 0.0F;
            this.field404[0] = var5;
            this.field404[2] = 0.0F;
            this.field404[1] = 0.0F;
        } else {
            this.field404[0] = 0.0F;
            this.field404[1] = 0.0F;
            this.field404[3] = 0.0F;
            this.field404[2] = var5;
        }
        var2.glActiveTexture(33985);
        var2.glMatrixMode(5888);
        var2.glPushMatrix();
        var2.glLoadIdentity();
        var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class319.field4906 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class230.field3362 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var2.glTranslatef((float) (-class329.field5020), (float) (-class261.field3955), (float) (-class166.field2296));
        var2.glTexGenfv(8192, 9474, this.field404, 0);
        this.field404[2] = 0.0F;
        this.field404[1] = var5;
        this.field404[3] = (float) class250.field3796 * var3;
        this.field404[0] = 0.0F;
        var2.glTexGenfv(8193, 9474, this.field404, 0);
        var2.glPopMatrix();
        if (class246.field3723) {
            this.field404[2] = 0.0F;
            this.field404[0] = 0.0F;
            this.field404[1] = 0.0F;
            this.field404[3] = (float) class250.field3796 * var4;
            var2.glTexGenfv(8194, 9473, this.field404, 0);
        } else {
            int var7 = (int) ((float) class250.field3796 * var4 * 64.0F);
            var2.glBindTexture(3553, class246.field3726[var7 % 64]);
        }
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIII)V", line = 89)
    public static final void method193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field401++;
        int var8 = arg2 - arg5;
        int var9 = arg3 + arg5;
        for (int var10 = arg3; var10 < var9; var10++) {
            class279.method1997(arg7, -824384948, arg6, arg4, class206.field2886[var10]);
        }
        int var11 = arg5 + arg6;
        for (int var12 = arg2; var12 > var8; var12--) {
            class279.method1997(arg7, -824384948, arg6, arg4, class206.field2886[var12]);
        }
        int var13 = arg7 - arg5;
        if (arg0 != 0) {
            field408 = (class18) null;
        }
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class206.field2886[var14];
            class279.method1997(var11, -824384948, arg6, arg4, var15);
            class279.method1997(var13, -824384948, var11, arg1, var15);
            class279.method1997(arg7, -824384948, var13, arg4, var15);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "()V", line = 137)
    public final void method15() {
        GL var1 = class250.field3818;
        var1.glCallList(this.field406 + 1);
        field399++;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V", line = 148)
    public static void method194(byte arg0) {
        field408 = null;
        field407 = null;
        int var1 = 73 / ((arg0 - 6) / 57);
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "()I", line = 158)
    public final int method16() {
        field400++;
        return 0;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V", line = 175)
    private final void method195(int arg0) {
        field405++;
        GL var2 = class250.field3818;
        this.field406 = var2.glGenLists(2);
        var2.glNewList(this.field406, 4864);
        var2.glActiveTexture(33985);
        if (class246.field3723) {
            var2.glBindTexture(32879, class246.field3722);
            var2.glTexGeni(8194, 9472, 9217);
            var2.glEnable(3170);
            var2.glEnable(32879);
        } else {
            var2.glEnable(3553);
        }
        var2.glTexGeni(8192, 9472, 9216);
        var2.glTexGeni(8193, 9472, 9216);
        var2.glEnable(3168);
        var2.glEnable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
        var2.glNewList(this.field406 - arg0, 4864);
        var2.glActiveTexture(33985);
        if (class246.field3723) {
            var2.glDisable(32879);
            var2.glDisable(3170);
        } else {
            var2.glDisable(3553);
        }
        var2.glDisable(3168);
        var2.glDisable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V", line = 219)
    public class32() {
        this.method195(-1);
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "()V", line = 233)
    public final void method17() {
        field402++;
        GL var1 = class250.field3818;
        var1.glCallList(this.field406);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIB)V", line = 245)
    public static final void method196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        int var7 = 0;
        field403++;
        int var8 = arg5 - arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        class84.method498(0, arg5);
        int var9 = arg5;
        int var10 = var8;
        int var11 = -arg5;
        int var12 = -var8;
        int var13 = -1;
        if (arg6 > -61) {
            method196(-22, -120, -67, 5, 1, 14, (byte) -128);
        }
        int[] var14 = class206.field2886[arg4];
        int var15 = -1;
        int var16 = arg1 - var8;
        int var17 = arg1 + var8;
        class279.method1997(var16, -824384948, arg1 - arg5, arg3, var14);
        class279.method1997(var17, -824384948, var16, arg0, var14);
        class279.method1997(arg1 + arg5, -824384948, var17, arg3, var14);
        while (var7 < var9) {
            var15 += 2;
            var13 += 2;
            var12 += var15;
            if (var12 >= 0 && var10 >= 1) {
                class7.field100[var10] = var7;
                var10--;
                var12 -= var10 << 1;
            }
            var11 += var13;
            var7++;
            if (var11 >= 0) {
                var9--;
                var11 -= var9 << 1;
                if (var8 > var9) {
                    int[] var18 = class206.field2886[arg4 + var9];
                    int[] var19 = class206.field2886[arg4 - var9];
                    int var20 = arg1 + var7;
                    int var21 = arg1 - var7;
                    int var22 = class7.field100[var9];
                    int var23 = arg1 - var22;
                    class279.method1997(var23, -824384948, var21, arg3, var18);
                    int var24 = arg1 + var22;
                    class279.method1997(var24, -824384948, var23, arg0, var18);
                    class279.method1997(var20, -824384948, var24, arg3, var18);
                    class279.method1997(var23, -824384948, var21, arg3, var19);
                    class279.method1997(var24, -824384948, var23, arg0, var19);
                    class279.method1997(var20, -824384948, var24, arg3, var19);
                } else {
                    int[] var25 = class206.field2886[arg4 + var9];
                    int var26 = arg1 - var7;
                    int[] var27 = class206.field2886[arg4 - var9];
                    int var28 = arg1 + var7;
                    class279.method1997(var28, -824384948, var26, arg3, var25);
                    class279.method1997(var28, -824384948, var26, arg3, var27);
                }
            }
            int[] var29 = class206.field2886[arg4 + var7];
            int[] var30 = class206.field2886[arg4 - var7];
            int var31 = arg1 + var9;
            int var32 = arg1 - var9;
            if (var8 <= var7) {
                class279.method1997(var31, -824384948, var32, arg3, var29);
                class279.method1997(var31, -824384948, var32, arg3, var30);
            } else {
                int var33 = var10 < var7 ? class7.field100[var7] : var10;
                int var34 = arg1 + var33;
                int var35 = arg1 - var33;
                class279.method1997(var35, -824384948, var32, arg3, var29);
                class279.method1997(var34, -824384948, var35, arg0, var29);
                class279.method1997(var31, -824384948, var34, arg3, var29);
                class279.method1997(var35, -824384948, var32, arg3, var30);
                class279.method1997(var34, -824384948, var35, arg0, var30);
                class279.method1997(var31, -824384948, var34, arg3, var30);
            }
        }
    }
}
