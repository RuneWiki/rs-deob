import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class132 implements class115 {

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "[F")
    private float[] field2290 = new float[4];

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public static int field2289 = 0;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    private int field2286;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "()I", line = 13)
    public final int method63() {
        field2283++;
        return 0;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "()V", line = 28)
    public final void method65() {
        field2284++;
        GL var1 = class147.field2479;
        var1.glCallList(this.field2286 + 1);
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "()V", line = 38)
    public final void method64() {
        field2288++;
        GL var1 = class147.field2479;
        var1.glCallList(this.field2286);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lum;ILum;Lum;)V", line = 50)
    public static final void method910(class222 arg0, int arg1, class222 arg2, class222 arg3) {
        class242.field4211 = arg3;
        class254.field4379 = arg0;
        field2287++;
        if (arg1 != -22806) {
            field2289 = -117;
        }
        class249.field4296 = arg2;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V", line = 64)
    public static final void method911(byte arg0) {
        field2280++;
        class309 var1 = new class309();
        int var2 = 104 / ((27 - arg0) / 44);
        for (int var3 = 0; var3 < 13; var3++) {
            for (int var4 = 0; var4 < 13; var4++) {
                class276.field4646[var3][var4] = var1;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V", line = 93)
    private final void method912(byte arg0) {
        GL var2 = class147.field2479;
        field2285++;
        this.field2286 = var2.glGenLists(2);
        var2.glNewList(this.field2286, 4864);
        var2.glActiveTexture(33985);
        if (class49.field805) {
            var2.glBindTexture(32879, class49.field808);
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
        var2.glNewList(this.field2286 + 1, 4864);
        if (arg0 != -49) {
            this.method912((byte) 25);
        }
        var2.glActiveTexture(33985);
        if (class49.field805) {
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

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V", line = 148)
    public class132() {
        this.method912((byte) -49);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 160)
    public final void method66(int arg0) {
        field2281++;
        float var2 = (float) (((arg0 & 0x1B) >> 3) + 1) * 0.01F;
        float var3 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        GL var4 = class147.field2479;
        float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var6 = (arg0 & 0x80) != 0;
        if (var6) {
            this.field2290[2] = 0.0F;
            this.field2290[3] = 0.0F;
            this.field2290[0] = var5;
            this.field2290[1] = 0.0F;
        } else {
            this.field2290[3] = 0.0F;
            this.field2290[1] = 0.0F;
            this.field2290[0] = 0.0F;
            this.field2290[2] = var5;
        }
        var4.glActiveTexture(33985);
        var4.glMatrixMode(5888);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var4.glRotatef((float) class28.field374 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var4.glRotatef((float) class324.field5566 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var4.glTranslatef((float) (-class62.field967), (float) (-class104.field1842), (float) (-class273.field4605));
        var4.glTexGenfv(8192, 9474, this.field2290, 0);
        this.field2290[1] = var5;
        this.field2290[3] = (float) class147.field2481 * var3;
        this.field2290[0] = 0.0F;
        this.field2290[2] = 0.0F;
        var4.glTexGenfv(8193, 9474, this.field2290, 0);
        var4.glPopMatrix();
        if (class49.field805) {
            this.field2290[1] = 0.0F;
            this.field2290[3] = (float) class147.field2481 * var2;
            this.field2290[0] = 0.0F;
            this.field2290[2] = 0.0F;
            var4.glTexGenfv(8194, 9473, this.field2290, 0);
        } else {
            int var7 = (int) ((float) class147.field2481 * var2 * 64.0F);
            var4.glBindTexture(3553, class49.field804[var7 % 64]);
        }
        var4.glActiveTexture(33984);
    }
}
