import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class171 implements class13 {

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "[F")
    private float[] field2781 = new float[4];

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Luf;")
    private static class168 field2786 = class148.method1019(-1720, "Allocating memory");

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Luf;")
    public static class168 field2783 = class148.method1019(-1720, "<img=0>");

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field2787 = 128;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field2789 = 0;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "Luf;")
    public static class168 field2794 = field2786;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field2795 = 0;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    private int field2792;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "[I")
    public static int[] field2793;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 4)
    public static final void method1235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class264 var20 = new class264(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class92.field1424[var21][arg1][arg2] == null) {
                    class92.field1424[var21][arg1][arg2] = new class127(var21, arg1, arg2);
                }
            }
            class92.field1424[arg0][arg1][arg2].field1973 = var20;
        } else if (arg3 == 1) {
            class264 var22 = new class264(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class92.field1424[var23][arg1][arg2] == null) {
                    class92.field1424[var23][arg1][arg2] = new class127(var23, arg1, arg2);
                }
            }
            class92.field1424[arg0][arg1][arg2].field1973 = var22;
        } else {
            class4 var24 = new class4(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class92.field1424[var25][arg1][arg2] == null) {
                    class92.field1424[var25][arg1][arg2] = new class127(var25, arg1, arg2);
                }
            }
            class92.field1424[arg0][arg1][arg2].field1963 = var24;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V", line = 53)
    private final void method1236(byte arg0) {
        field2785++;
        GL var2 = class90.field1390;
        this.field2792 = var2.glGenLists(2);
        var2.glNewList(this.field2792, 4864);
        var2.glActiveTexture(33985);
        if (class184.field2951) {
            var2.glBindTexture(32879, class184.field2946);
            var2.glTexGeni(8194, 9472, 9217);
            var2.glEnable(3170);
            var2.glEnable(32879);
        } else {
            var2.glEnable(3553);
        }
        var2.glTexGeni(8192, 9472, 9216);
        if (arg0 < 17) {
            field2795 = -85;
        }
        var2.glTexGeni(8193, 9472, 9216);
        var2.glEnable(3168);
        var2.glEnable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
        var2.glNewList(this.field2792 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class184.field2951) {
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

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "()V", line = 98)
    public final void method49() {
        field2791++;
        GL var1 = class90.field1390;
        var1.glCallList(this.field2792);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "()I", line = 110)
    public final int method48() {
        field2790++;
        return 0;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V", line = 125)
    public final void method47(int arg0) {
        GL var2 = class90.field1390;
        float var3 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        float var4 = (float) (((arg0 & 0x18) >> 3) + 1) * 0.01F;
        field2788++;
        float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var6 = (arg0 & 0x80) != 0;
        if (var6) {
            this.field2781[0] = var5;
            this.field2781[3] = 0.0F;
            this.field2781[1] = 0.0F;
            this.field2781[2] = 0.0F;
        } else {
            this.field2781[1] = 0.0F;
            this.field2781[2] = var5;
            this.field2781[0] = 0.0F;
            this.field2781[3] = 0.0F;
        }
        var2.glActiveTexture(33985);
        var2.glMatrixMode(5888);
        var2.glPushMatrix();
        var2.glLoadIdentity();
        var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class83.field1259 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class87.field1340 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var2.glTranslatef((float) (-class288.field4850), (float) (-class297.field5024), (float) (-class79.field1134));
        var2.glTexGenfv(8192, 9474, this.field2781, 0);
        this.field2781[1] = var5;
        this.field2781[3] = (float) class90.field1388 * var3;
        this.field2781[2] = 0.0F;
        this.field2781[0] = 0.0F;
        var2.glTexGenfv(8193, 9474, this.field2781, 0);
        var2.glPopMatrix();
        if (class184.field2951) {
            this.field2781[0] = 0.0F;
            this.field2781[2] = 0.0F;
            this.field2781[3] = (float) class90.field1388 * var4;
            this.field2781[1] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field2781, 0);
        } else {
            int var7 = (int) ((float) class90.field1388 * var4 * 64.0F);
            var2.glBindTexture(3553, class184.field2948[var7 % 64]);
        }
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "()V", line = 190)
    public final void method50() {
        field2784++;
        GL var1 = class90.field1390;
        var1.glCallList(this.field2792 + 1);
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V", line = 304)
    public class171() {
        this.method1236((byte) 71);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ldk;Z)I", line = 223)
    public static final int method1237(class241 arg0, boolean arg1) {
        field2782++;
        int var2 = 0;
        if (arg0.method1648(class106.field1635, false)) {
            var2++;
        }
        if (arg0.method1648(class194.field3154, false)) {
            var2++;
        }
        if (arg0.method1648(class156.field2463, false)) {
            var2++;
        }
        if (arg0.method1648(class6.field74, arg1)) {
            var2++;
        }
        if (arg0.method1648(class78.field1072, false)) {
            var2++;
        }
        if (arg0.method1648(class224.field3616, false)) {
            var2++;
        }
        if (arg0.method1648(class44.field542, arg1)) {
            var2++;
        }
        if (arg0.method1648(class153.field2377, false)) {
            var2++;
        }
        if (arg0.method1648(class110.field1725, false)) {
            var2++;
        }
        if (arg0.method1648(class287.field4845, arg1)) {
            var2++;
        }
        if (arg0.method1648(class71.field958, false)) {
            var2++;
        }
        if (arg0.method1648(class143.field2210, false)) {
            var2++;
        }
        if (arg0.method1648(class133.field2078, false)) {
            var2++;
        }
        if (arg0.method1648(class272.field4580, arg1)) {
            var2++;
        }
        if (arg0.method1648(class110.field1708, false)) {
            var2++;
        }
        if (arg0.method1648(class189.field3034, false)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V", line = 291)
    public static void method1238(int arg0) {
        if (arg0 >= -10) {
            method1237((class241) null, true);
        }
        field2793 = null;
        field2786 = null;
        field2783 = null;
        field2794 = null;
    }
}
