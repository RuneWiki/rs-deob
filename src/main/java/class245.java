import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class245 implements class323 {

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "[F")
    private float[] field3809 = new float[4];

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "[S")
    public static short[] field3804 = new short[256];

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3806 = "yellow:";

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    private int field3810;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3808;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V", line = 12)
    public final void method186(int arg0) {
        field3800++;
        float var2 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        GL var3 = class249.field3898;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        float var5 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
        boolean var6 = (arg0 & 0x80) != 0;
        if (var6) {
            this.field3809[1] = 0.0F;
            this.field3809[2] = 0.0F;
            this.field3809[3] = 0.0F;
            this.field3809[0] = var4;
        } else {
            this.field3809[0] = 0.0F;
            this.field3809[3] = 0.0F;
            this.field3809[1] = 0.0F;
            this.field3809[2] = var4;
        }
        var3.glActiveTexture(33985);
        var3.glMatrixMode(5888);
        var3.glPushMatrix();
        var3.glLoadIdentity();
        var3.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var3.glRotatef((float) class283.field4380 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var3.glRotatef((float) class326.field4981 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var3.glTranslatef((float) (-class252.field3946), (float) (-class302.field4578), (float) (-class157.field2569));
        var3.glTexGenfv(8192, 9474, this.field3809, 0);
        this.field3809[3] = (float) class249.field3892 * var2;
        this.field3809[2] = 0.0F;
        this.field3809[1] = var4;
        this.field3809[0] = 0.0F;
        var3.glTexGenfv(8193, 9474, this.field3809, 0);
        var3.glPopMatrix();
        if (class207.field3354) {
            this.field3809[3] = (float) class249.field3892 * var5;
            this.field3809[2] = 0.0F;
            this.field3809[1] = 0.0F;
            this.field3809[0] = 0.0F;
            var3.glTexGenfv(8194, 9473, this.field3809, 0);
        } else {
            int var7 = (int) ((float) class249.field3892 * var5 * 64.0F);
            var3.glBindTexture(3553, class207.field3359[var7 % 64]);
        }
        var3.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "()V", line = 79)
    public final void method185() {
        field3803++;
        GL var1 = class249.field3898;
        var1.glCallList(this.field3810 + 1);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V", line = 90)
    private final void method1622(byte arg0) {
        field3805++;
        GL var2 = class249.field3898;
        this.field3810 = var2.glGenLists(2);
        var2.glNewList(this.field3810, 4864);
        var2.glActiveTexture(33985);
        if (class207.field3354) {
            var2.glBindTexture(32879, class207.field3357);
            var2.glTexGeni(8194, 9472, 9217);
            var2.glEnable(3170);
            var2.glEnable(32879);
        } else {
            var2.glEnable(3553);
        }
        var2.glTexGeni(8192, 9472, 9216);
        var2.glTexGeni(8193, 9472, 9216);
        int var3 = 49 / ((52 - arg0) / 45);
        var2.glEnable(3168);
        var2.glEnable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
        var2.glNewList(this.field3810 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class207.field3354) {
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

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "()V", line = 134)
    public final void method188() {
        field3802++;
        GL var1 = class249.field3898;
        var1.glCallList(this.field3810);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "()I", line = 147)
    public final int method187() {
        field3807++;
        return 0;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BJ)V", line = 161)
    public static final void method1623(byte arg0, long arg1) {
        field3801++;
        if (arg0 != 102 || arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class274.field4197; var3++) {
            if (class248.field3859[var3] == arg1) {
                class274.field4197--;
                for (int var4 = var3; var4 < class274.field4197; var4++) {
                    class296.field4509[var4] = class296.field4509[var4 + 1];
                    class306.field4633[var4] = class306.field4633[var4 + 1];
                    class293.field4485[var4] = class293.field4485[var4 + 1];
                    class248.field3859[var4] = class248.field3859[var4 + 1];
                    class1.field16[var4] = class1.field16[var4 + 1];
                    class95.field1707[var4] = class95.field1707[var4 + 1];
                }
                class165.field2670 = class342.field5323;
                class154.field2518++;
                class14.field263.method80(2, (byte) 113);
                class14.field263.method1353((byte) -105, arg1);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V", line = 208)
    public static void method1624(int arg0) {
        if (arg0 != -12911) {
            method1623((byte) -45, 87L);
        }
        field3806 = null;
        field3804 = null;
        field3808 = null;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V", line = 223)
    public class245() {
        this.method1622((byte) 126);
    }
}
