import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class25 implements class203 {

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "[F")
    private float[] field323 = new float[4];

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "[[B")
    public static byte[][] field329 = new byte[1000][];

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "[I")
    public static int[] field332 = new int[200];

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    private int field325;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Lja;")
    public static class264 field319;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Lel;")
    public static class3 field324;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "()I", line = 5)
    public final int method14() {
        field327++;
        return 0;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V", line = 14)
    public static void method160(int arg0) {
        field332 = null;
        field324 = null;
        field319 = null;
        field329 = (byte[][]) null;
        if (arg0 != -1) {
            field329 = (byte[][]) ((byte[][]) null);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII)V", line = 27)
    public static final void method161(int arg0, int arg1, int arg2, int arg3) {
        class245 var4 = class120.field2010[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class222 var5 = var4.field4104;
        if (var5 != null) {
            var5.field3599 = var5.field3599 * arg3 / 16;
            var5.field3594 = var5.field3594 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "()V", line = 63)
    public final void method12() {
        GL var1 = class55.field812;
        var1.glCallList(this.field325 + 1);
        field320++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIZBIII)V", line = 72)
    public static final void method162(int arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5, int arg6) {
        class313.field5301 = arg1;
        class222.field3607 = arg4;
        class314.field5315 = arg0;
        class88.field1381 = arg5;
        if (arg3 != 121) {
            field319 = (class264) null;
        }
        field331++;
        class206.field3367 = arg6;
        if (arg2 && class313.field5301 >= 100) {
            class216.field3528 = class222.field3607 * 128 + 64;
            class226.field3640 = class88.field1381 * 128 + 64;
            class185.field3109 = class73.method589(class247.field4119, true, class226.field3640, class216.field3528) - class206.field3367;
        }
        class266.field4585 = 2;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V", line = 190)
    public class25() {
        this.method164((byte) 76);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)Z", line = 103)
    public static final boolean method163(byte arg0, int arg1) {
        field322++;
        if (arg0 < 69) {
            field319 = (class264) null;
        }
        return (arg1 & -arg1) == arg1;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 114)
    public final void method11(int arg0) {
        field330++;
        GL var2 = class55.field812;
        float var3 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        float var5 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
        boolean var6 = (arg0 & 0x80) != 0;
        if (var6) {
            this.field323[3] = 0.0F;
            this.field323[1] = 0.0F;
            this.field323[0] = var4;
            this.field323[2] = 0.0F;
        } else {
            this.field323[1] = 0.0F;
            this.field323[3] = 0.0F;
            this.field323[0] = 0.0F;
            this.field323[2] = var4;
        }
        var2.glActiveTexture(33985);
        var2.glMatrixMode(5888);
        var2.glPushMatrix();
        var2.glLoadIdentity();
        var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class84.field1320 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class194.field3218 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var2.glTranslatef((float) (-class198.field3285), (float) (-class190.field3183), (float) (-class216.field3527));
        var2.glTexGenfv(8192, 9474, this.field323, 0);
        this.field323[1] = var4;
        this.field323[3] = (float) class55.field821 * var3;
        this.field323[2] = 0.0F;
        this.field323[0] = 0.0F;
        var2.glTexGenfv(8193, 9474, this.field323, 0);
        var2.glPopMatrix();
        if (class278.field4769) {
            this.field323[2] = 0.0F;
            this.field323[0] = 0.0F;
            this.field323[1] = 0.0F;
            this.field323[3] = (float) class55.field821 * var5;
            var2.glTexGenfv(8194, 9473, this.field323, 0);
        } else {
            int var7 = (int) ((float) class55.field821 * var5 * 64.0F);
            var2.glBindTexture(3553, class278.field4768[var7 % 64]);
        }
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "()V", line = 178)
    public final void method13() {
        GL var1 = class55.field812;
        field321++;
        var1.glCallList(this.field325);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V", line = 199)
    private final void method164(byte arg0) {
        field326++;
        GL var2 = class55.field812;
        this.field325 = var2.glGenLists(2);
        var2.glNewList(this.field325, 4864);
        var2.glActiveTexture(33985);
        if (class278.field4769) {
            var2.glBindTexture(32879, class278.field4764);
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
        var2.glNewList(this.field325 + 1, 4864);
        if (arg0 < 68) {
            field319 = (class264) null;
        }
        var2.glActiveTexture(33985);
        if (class278.field4769) {
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
}
