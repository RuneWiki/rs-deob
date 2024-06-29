import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class302 implements class210 {

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "[F")
    private float[] field5133 = new float[4];

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "Lpc;")
    public static class91 field5134 = new class91(64);

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "Z")
    public static boolean field5140 = true;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public static int field5139 = -1;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "[Z")
    public static boolean[] field5142 = new boolean[5];

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    private int field5137;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V", line = 9)
    private final void method2070(int arg0) {
        GL var2 = class108.field1899;
        if (arg0 != -21967) {
            return;
        }
        field5138++;
        this.field5137 = var2.glGenLists(2);
        var2.glNewList(this.field5137, 4864);
        var2.glActiveTexture(33985);
        if (class99.field1755) {
            var2.glBindTexture(32879, class99.field1754);
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
        var2.glNewList(this.field5137 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class99.field1755) {
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

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "()V", line = 55)
    public final void method483() {
        field5141++;
        GL var1 = class108.field1899;
        var1.glCallList(this.field5137);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V", line = 66)
    public static void method2071(byte arg0) {
        field5134 = null;
        if (arg0 == -68) {
            field5142 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V", line = 191)
    public class302() {
        this.method2070(-21967);
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "()V", line = 88)
    public final void method486() {
        GL var1 = class108.field1899;
        field5131++;
        var1.glCallList(this.field5137 + 1);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V", line = 100)
    public final void method484(int arg0) {
        field5132++;
        GL var2 = class108.field1899;
        float var3 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        boolean var4 = (arg0 & 0x80) != 0;
        float var5 = (float) (((arg0 & 0x18) >> 3) + 1) * 0.01F;
        float var6 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        if (var4) {
            this.field5133[1] = 0.0F;
            this.field5133[2] = 0.0F;
            this.field5133[3] = 0.0F;
            this.field5133[0] = var6;
        } else {
            this.field5133[1] = 0.0F;
            this.field5133[0] = 0.0F;
            this.field5133[3] = 0.0F;
            this.field5133[2] = var6;
        }
        var2.glActiveTexture(33985);
        var2.glMatrixMode(5888);
        var2.glPushMatrix();
        var2.glLoadIdentity();
        var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class31.field533 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class205.field3565 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var2.glTranslatef((float) (-class311.field5235), (float) (-class113.field2042), (float) (-class305.field5165));
        var2.glTexGenfv(8192, 9474, this.field5133, 0);
        this.field5133[1] = var6;
        this.field5133[0] = 0.0F;
        this.field5133[2] = 0.0F;
        this.field5133[3] = (float) class108.field1905 * var3;
        var2.glTexGenfv(8193, 9474, this.field5133, 0);
        var2.glPopMatrix();
        if (class99.field1755) {
            this.field5133[2] = 0.0F;
            this.field5133[0] = 0.0F;
            this.field5133[3] = (float) class108.field1905 * var5;
            this.field5133[1] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field5133, 0);
        } else {
            int var7 = (int) ((float) class108.field1905 * var5 * 64.0F);
            var2.glBindTexture(3553, class99.field1758[var7 % 64]);
        }
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "()I", line = 166)
    public final int method482() {
        field5136++;
        return 0;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIZLek;)[Lad;", line = 179)
    public static final class129[] method2072(int arg0, int arg1, boolean arg2, class185 arg3) {
        if (!arg2) {
            field5139 = -57;
        }
        field5135++;
        return class208.method1444(arg1, -28236, arg0, arg3) ? class213.method1460(-32484) : null;
    }
}
