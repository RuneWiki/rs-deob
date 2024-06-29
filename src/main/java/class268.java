import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class268 implements class8 {

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "[F")
    private float[] field4034 = new float[4];

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "[Z")
    public static boolean[] field4041 = new boolean[5];

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field4038 = -1;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "F")
    public static float field4039;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    private int field4035;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "Ltg;")
    public static class314 field4027;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "()I", line = 9)
    public final int method71() {
        field4031++;
        return 0;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 22)
    public final void method72(int arg0) {
        GL var2 = class36.field518;
        field4033++;
        float var3 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        float var4 = (float) (((arg0 & 0x1A) >> 3) + 1) * 0.01F;
        boolean var5 = (arg0 & 0x80) != 0;
        float var6 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        if (var5) {
            this.field4034[2] = 0.0F;
            this.field4034[3] = 0.0F;
            this.field4034[1] = 0.0F;
            this.field4034[0] = var6;
        } else {
            this.field4034[3] = 0.0F;
            this.field4034[2] = var6;
            this.field4034[1] = 0.0F;
            this.field4034[0] = 0.0F;
        }
        var2.glActiveTexture(33985);
        var2.glMatrixMode(5888);
        var2.glPushMatrix();
        var2.glLoadIdentity();
        var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class137.field2137 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class325.field5058 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var2.glTranslatef((float) (-class117.field1821), (float) (-class45.field699), (float) (-class53.field799));
        var2.glTexGenfv(8192, 9474, this.field4034, 0);
        this.field4034[1] = var6;
        this.field4034[3] = (float) class36.field514 * var3;
        this.field4034[2] = 0.0F;
        this.field4034[0] = 0.0F;
        var2.glTexGenfv(8193, 9474, this.field4034, 0);
        var2.glPopMatrix();
        if (class19.field211) {
            this.field4034[0] = 0.0F;
            this.field4034[1] = 0.0F;
            this.field4034[2] = 0.0F;
            this.field4034[3] = (float) class36.field514 * var4;
            var2.glTexGenfv(8194, 9473, this.field4034, 0);
        } else {
            int var7 = (int) ((float) class36.field514 * var4 * 64.0F);
            var2.glBindTexture(3553, class19.field213[var7 % 64]);
        }
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILek;I)Ljava/lang/String;", line = 83)
    public static final String method1861(int arg0, class184 arg1, int arg2) {
        field4042++;
        if (!client.method1764(arg1).method1928(arg0, (byte) -60) && arg1.field2868 == null) {
            return null;
        } else if (arg1.field2922 == null || arg1.field2922.length <= arg0 || arg1.field2922[arg0] == null || arg1.field2922[arg0].trim().length() == 0) {
            return class199.field3147 ? "Hidden-" + arg0 : null;
        } else if (arg2 == 0) {
            return arg1.field2922[arg0];
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "()V", line = 113)
    public final void method70() {
        field4029++;
        GL var1 = class36.field518;
        var1.glCallList(this.field4035);
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V", line = 123)
    public static void method1862(int arg0) {
        field4027 = null;
        field4041 = null;
        if (arg0 != 0) {
            method1861(83, (class184) null, -3);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/String;B)J", line = 134)
    public static final long method1863(String arg0, byte arg1) {
        if (arg1 >= -67) {
            method1864(-101, -63);
        }
        field4036++;
        long var2 = 0L;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 = (long) arg0.charAt(var5) + (var2 << 5) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V", line = 297)
    public class268() {
        this.method1865(true);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V", line = 159)
    public static final void method1864(int arg0, int arg1) {
        field4026++;
        class274.method1907(21516);
        class135.method1031((byte) -103);
        int var2 = class241.method1671(arg1 ^ arg1, arg0).field1611;
        if (var2 == 0) {
            return;
        }
        int var3 = class199.field3158[arg0];
        if (var2 == 6) {
            class188.field2999 = var3;
        }
        if (var2 == 5) {
            class328.field5084 = var3;
        }
        if (var2 == 9) {
            class111.field1758 = var3;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V", line = 187)
    private final void method1865(boolean arg0) {
        GL var2 = class36.field518;
        this.field4035 = var2.glGenLists(2);
        field4028++;
        var2.glNewList(this.field4035, 4864);
        var2.glActiveTexture(33985);
        if (class19.field211) {
            var2.glBindTexture(32879, class19.field217);
            var2.glTexGeni(8194, 9472, 9217);
            var2.glEnable(3170);
            var2.glEnable(32879);
        } else {
            var2.glEnable(3553);
        }
        var2.glTexGeni(8192, 9472, 9216);
        if (!arg0) {
            field4027 = (class314) null;
        }
        var2.glTexGeni(8193, 9472, 9216);
        var2.glEnable(3168);
        var2.glEnable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
        var2.glNewList(this.field4035 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class19.field211) {
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

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "()V", line = 232)
    public final void method73() {
        GL var1 = class36.field518;
        field4040++;
        var1.glCallList(this.field4035 + 1);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIILqb;)V", line = 245)
    public static final void method1866(int arg0, int arg1, int arg2, int arg3, class101 arg4) {
        field4037++;
        if (arg3 != 0) {
            return;
        }
        for (class117 var5 = (class117) class154.field2330.method986(false); var5 != null; var5 = (class117) class154.field2330.method982(14877)) {
            if (var5.field1840 == arg0 && (arg2 * 128) == var5.field1827 && (arg1 * 128) == var5.field1843 && var5.field1826.field1570 == arg4.field1570) {
                if (var5.field1842 != null) {
                    class200.field3165.method2162(var5.field1842);
                    var5.field1842 = null;
                }
                if (var5.field1848 != null) {
                    class200.field3165.method2162(var5.field1848);
                    var5.field1848 = null;
                }
                var5.method1554((byte) -118);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V", line = 287)
    public static final void method1867(byte arg0) {
        field4030++;
        class193.field3086.method1428(10935);
        if (arg0 != 95) {
            method1862(16);
        }
        class81.field1127.method1428(10935);
    }
}
