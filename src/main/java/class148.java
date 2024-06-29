import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class148 implements class14 {

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "[F")
    private float[] field2390 = new float[4];

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "[I")
    public static int[] field2389 = new int[2];

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "Lo;")
    public static class227 field2393 = new class227();

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "Lph;")
    public static class229 field2398 = class266.method1858("Memory before cleanup=", 0);

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static volatile int field2397 = 0;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    private int field2395;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(La;B)V", line = 10)
    public static final void method1081(class172 arg0, byte arg1) {
        arg0.field2820 = false;
        if (arg1 >= -121) {
            method1082((byte) -51);
        }
        field2400++;
        if (arg0.field2821 != null) {
            arg0.field2821.field2109 = 0;
        }
        for (class172 var2 = arg0.method463(); var2 != null; var2 = arg0.method459()) {
            method1081(var2, (byte) -126);
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "()V", line = 31)
    public final void method80() {
        field2394++;
        GL var1 = class99.field1682;
        var1.glCallList(this.field2395 + 1);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V", line = 43)
    public final void method84(int arg0) {
        GL var2 = class99.field1682;
        float var3 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        field2392++;
        float var4 = (float) (((arg0 & 0x19) >> 3) + 1) * 0.01F;
        float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var6 = (arg0 & 0x80) != 0;
        if (var6) {
            this.field2390[3] = 0.0F;
            this.field2390[0] = var5;
            this.field2390[1] = 0.0F;
            this.field2390[2] = 0.0F;
        } else {
            this.field2390[0] = 0.0F;
            this.field2390[2] = var5;
            this.field2390[1] = 0.0F;
            this.field2390[3] = 0.0F;
        }
        var2.glActiveTexture(33985);
        var2.glMatrixMode(5888);
        var2.glPushMatrix();
        var2.glLoadIdentity();
        var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class203.field3348 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class263.field4398 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var2.glTranslatef((float) (-class97.field1626), (float) (-class1.field2), (float) (-class326.field5578));
        var2.glTexGenfv(8192, 9474, this.field2390, 0);
        this.field2390[0] = 0.0F;
        this.field2390[1] = var5;
        this.field2390[2] = 0.0F;
        this.field2390[3] = (float) class99.field1671 * var3;
        var2.glTexGenfv(8193, 9474, this.field2390, 0);
        var2.glPopMatrix();
        if (class9.field116) {
            this.field2390[3] = (float) class99.field1671 * var4;
            this.field2390[1] = 0.0F;
            this.field2390[2] = 0.0F;
            this.field2390[0] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field2390, 0);
        } else {
            int var7 = (int) ((float) class99.field1671 * var4 * 64.0F);
            var2.glBindTexture(3553, class9.field112[var7 % 64]);
        }
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V", line = 107)
    public static void method1082(byte arg0) {
        field2398 = null;
        int var1 = -108 / ((58 - arg0) / 55);
        field2393 = null;
        field2389 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "()I", line = 123)
    public final int method83() {
        field2391++;
        return 0;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V", line = 159)
    public class148() {
        this.method1083((byte) 114);
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "()V", line = 150)
    public final void method79() {
        GL var1 = class99.field1682;
        var1.glCallList(this.field2395);
        field2399++;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)V", line = 171)
    private final void method1083(byte arg0) {
        field2386++;
        GL var2 = class99.field1682;
        this.field2395 = var2.glGenLists(2);
        var2.glNewList(this.field2395, 4864);
        var2.glActiveTexture(33985);
        if (class9.field116) {
            var2.glBindTexture(32879, class9.field115);
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
        var2.glNewList(this.field2395 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class9.field116) {
            var2.glDisable(32879);
            var2.glDisable(3170);
        } else {
            var2.glDisable(3553);
        }
        if (arg0 < 99) {
            this.method84(-36);
        }
        var2.glDisable(3168);
        var2.glDisable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZZIIZ)Lsi;", line = 222)
    public static final class66 method1084(boolean arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        field2396++;
        class250 var5 = null;
        if (arg2 != 0) {
            method1081((class172) null, (byte) 58);
        }
        if (class313.field5326 != null) {
            var5 = new class250(arg3, class313.field5326, class74.field1249[arg3], 1000000);
        }
        class180.field2955[arg3] = class180.field2957.method629(5100, class164.field2692, arg3, var5);
        if (arg1) {
            class180.field2955[arg3].method1672((byte) -110);
        }
        return new class66(class180.field2955[arg3], arg4, arg0);
    }
}
