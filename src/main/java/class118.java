import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class118 implements class29 {

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "[F")
    private float[] field1671 = new float[4];

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "S")
    public static short field1676 = 1;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "[I")
    public static int[] field1679 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "Lwm;")
    public static class152 field1677 = class157.method1048("(U0a )2 in: ", 113);

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "Lwm;")
    public static class152 field1682 = class157.method1048("Fertigkeit: ", 113);

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "Lwm;")
    public static class152 field1683 = class157.method1048(" )2> <col=ffffff>", 113);

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    private int field1681;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "()I", line = 25)
    public final int method36() {
        field1675++;
        return 0;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "()V", line = 33)
    public final void method37() {
        field1673++;
        GL var1 = class217.field3551;
        var1.glCallList(this.field1681 + 1);
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V", line = 47)
    private final void method776(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field1680++;
        GL var2 = class217.field3551;
        this.field1681 = var2.glGenLists(2);
        var2.glNewList(this.field1681, 4864);
        var2.glActiveTexture(33985);
        if (class293.field5014) {
            var2.glBindTexture(32879, class293.field5012);
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
        var2.glNewList(this.field1681 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class293.field5014) {
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

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V", line = 200)
    public class118() {
        this.method776(0);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "()V", line = 105)
    public final void method34() {
        field1672++;
        GL var1 = class217.field3551;
        var1.glCallList(this.field1681);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V", line = 115)
    public final void method35(int arg0) {
        field1670++;
        GL var2 = class217.field3551;
        float var3 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var5 = (arg0 & 0x80) != 0;
        float var6 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
        if (var5) {
            this.field1671[1] = 0.0F;
            this.field1671[3] = 0.0F;
            this.field1671[2] = 0.0F;
            this.field1671[0] = var4;
        } else {
            this.field1671[1] = 0.0F;
            this.field1671[0] = 0.0F;
            this.field1671[3] = 0.0F;
            this.field1671[2] = var4;
        }
        var2.glActiveTexture(33985);
        var2.glMatrixMode(5888);
        var2.glPushMatrix();
        var2.glLoadIdentity();
        var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class131.field1997 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class62.field943 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var2.glTranslatef((float) (-class137.field2096), (float) (-class277.field4743), (float) (-class280.field4784));
        var2.glTexGenfv(8192, 9474, this.field1671, 0);
        this.field1671[0] = 0.0F;
        this.field1671[1] = var4;
        this.field1671[3] = (float) class217.field3521 * var3;
        this.field1671[2] = 0.0F;
        var2.glTexGenfv(8193, 9474, this.field1671, 0);
        var2.glPopMatrix();
        if (class293.field5014) {
            this.field1671[0] = 0.0F;
            this.field1671[1] = 0.0F;
            this.field1671[3] = (float) class217.field3521 * var6;
            this.field1671[2] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field1671, 0);
        } else {
            int var7 = (int) ((float) class217.field3521 * var6 * 64.0F);
            var2.glBindTexture(3553, class293.field5013[var7 % 64]);
        }
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V", line = 186)
    public static void method777(int arg0) {
        field1683 = null;
        field1679 = null;
        if (arg0 == 0) {
            field1682 = null;
            field1677 = null;
        }
    }
}
