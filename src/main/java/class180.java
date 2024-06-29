import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class180 implements class217 {

    @OriginalMember(owner = "client!af", name = "k", descriptor = "[F")
    private float[] field3183 = new float[4];

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Lke;")
    private static class256 field3176 = class316.method2202("Opened title screen", 27626);

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Lke;")
    public static class256 field3177 = field3176;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "Lc;")
    public static class70 field3187 = new class70();

    @OriginalMember(owner = "client!af", name = "p", descriptor = "Lod;")
    public static class209 field3188 = new class209();

    @OriginalMember(owner = "client!af", name = "s", descriptor = "[Lke;")
    public static class256[] field3191 = new class256[5];

    @OriginalMember(owner = "client!af", name = "u", descriptor = "I")
    public static int field3193 = 0;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "F")
    public static float field3185;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "F")
    public static float field3194;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    private int field3182;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V", line = 6)
    private final void method1319(byte arg0) {
        field3178++;
        if (arg0 != 6) {
            return;
        }
        GL var2 = class253.field4319;
        this.field3182 = var2.glGenLists(2);
        var2.glNewList(this.field3182, 4864);
        var2.glActiveTexture(33985);
        if (class296.field5127) {
            var2.glBindTexture(32879, class296.field5129);
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
        var2.glNewList(this.field3182 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class296.field5127) {
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

    @OriginalMember(owner = "client!af", name = "a", descriptor = "()V", line = 52)
    public final void method91() {
        GL var1 = class253.field4319;
        field3179++;
        var1.glCallList(this.field3182 + 1);
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V", line = 68)
    public static void method1320(int arg0) {
        field3188 = null;
        field3191 = null;
        field3176 = null;
        field3177 = null;
        field3187 = null;
        int var1 = -63 % ((-arg0 - 20) / 51);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V", line = 92)
    public final void method93(int arg0) {
        field3186++;
        GL var2 = class253.field4319;
        float var3 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        float var4 = (float) (((arg0 & 0x18) >> 3) + 1) * 0.01F;
        float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var6 = (arg0 & 0x80) != 0;
        if (var6) {
            this.field3183[3] = 0.0F;
            this.field3183[2] = 0.0F;
            this.field3183[1] = 0.0F;
            this.field3183[0] = var5;
        } else {
            this.field3183[1] = 0.0F;
            this.field3183[2] = var5;
            this.field3183[3] = 0.0F;
            this.field3183[0] = 0.0F;
        }
        var2.glActiveTexture(33985);
        var2.glMatrixMode(5888);
        var2.glPushMatrix();
        var2.glLoadIdentity();
        var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class74.field1353 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class284.field4934 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var2.glTranslatef((float) (-class191.field3496), (float) (-class256.field4428), (float) (-class98.field1752));
        var2.glTexGenfv(8192, 9474, this.field3183, 0);
        this.field3183[3] = (float) class253.field4326 * var3;
        this.field3183[1] = var5;
        this.field3183[0] = 0.0F;
        this.field3183[2] = 0.0F;
        var2.glTexGenfv(8193, 9474, this.field3183, 0);
        var2.glPopMatrix();
        if (class296.field5127) {
            this.field3183[0] = 0.0F;
            this.field3183[2] = 0.0F;
            this.field3183[3] = (float) class253.field4326 * var4;
            this.field3183[1] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field3183, 0);
        } else {
            int var7 = (int) ((float) class253.field4326 * var4 * 64.0F);
            var2.glBindTexture(3553, class296.field5133[var7 % 64]);
        }
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZLke;I)V", line = 157)
    public static final void method1321(boolean arg0, class256 arg1, int arg2) {
        class256 var3 = arg1.method1771(false);
        short[] var4 = new short[16];
        field3173++;
        int var5 = arg0 ? 32768 : 0;
        int var6 = 0;
        int var7 = (arg0 ? class157.field2793 : class10.field148) + var5;
        for (int var8 = var5; var8 < var7; var8++) {
            class17 var9 = class66.method507(var8, 536870911);
            if (var9.field219 && var9.method106((byte) 119).method1771(false).method1779(var3, (byte) -116) != -1) {
                if (var6 >= 50) {
                    class63.field1108 = -1;
                    class301.field5181 = null;
                    return;
                }
                if (var4.length <= var6) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var6; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var6++] = (short) var8;
            }
        }
        class44.field832 = arg2;
        class301.field5181 = var4;
        class63.field1108 = var6;
        class256[] var12 = new class256[class63.field1108];
        for (int var13 = 0; var13 < class63.field1108; var13++) {
            var12[var13] = class66.method507(var4[var13], class288.method2011(arg2, 536870911)).method106((byte) -122);
        }
        class175.method1274(class301.field5181, var12, true);
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)Lke;", line = 226)
    public static final class256 method1322(int arg0) {
        field3174++;
        class256 var1;
        if (class21.field273 == 1 && class17.field244 < 2) {
            var1 = class30.method214(new class256[] { class251.field4260, class238.field4055, class99.field1765, class233.field3990 }, 29784);
        } else if (class320.field5489 && class17.field244 < 2) {
            var1 = class30.method214(new class256[] { class261.field4511, class238.field4055, class24.field319, class233.field3990 }, 29784);
        } else if (class302.field5230 && class140.field2468[81] && class17.field244 > 2) {
            var1 = class191.method1387(class17.field244 - 2, (byte) -104);
        } else {
            var1 = class191.method1387(class17.field244 - 1, (byte) -104);
        }
        if (class17.field244 > 2) {
            var1 = class30.method214(new class256[] { var1, class34.field532, class305.method2125((byte) 122, class17.field244 - 2), class252.field4290 }, 29784);
        }
        if (arg0 <= 1) {
            field3191 = (class256[]) null;
        }
        return var1;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V", line = 253)
    public static final void method1323(byte arg0) {
        field3184++;
        if (arg0 <= 96) {
            return;
        }
        for (int var1 = 0; var1 < class311.field5357; var1++) {
            int var2 = class141.field2480[var1];
            class279 var3 = class187.field3281[var2];
            if (var3 != null) {
                class229.method1562(var3, var3.field4860.field1418, 64);
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V", line = 329)
    public class180() {
        this.method1319((byte) 6);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILke;ILke;)V", line = 289)
    public static final void method1324(int arg0, class256 arg1, int arg2, class256 arg3) {
        class46.field853 = arg1;
        class203.field3668 = arg2;
        field3180++;
        class46.field849 = arg3;
        if (class46.field849.method1806(false, class46.field844) || class46.field853.method1806(false, class46.field844)) {
            class118.field2086 = 3;
        } else if (class240.field4089 == -1) {
            class102.field1839 = 0;
            class118.field2086 = -3;
            class248.field4222 = 0;
            class44.field830 = 1;
            class41 var4 = new class41(128);
            var4.method308(10, -2);
            var4.method366((int) (Math.random() * (double) arg0), -99);
            var4.method366(526, -112);
            var4.method330(255, class46.field849.method1780(true));
            var4.method365((byte) -32, (int) (Math.random() * 9.9999999E7D));
            var4.method361(class46.field853, 0);
            var4.method365((byte) -32, (int) (Math.random() * 9.9999999E7D));
            var4.method324(class106.field1894, 2097244, class129.field2257);
            class308.field5322.field738 = 0;
            class308.field5322.method308(160, arg0 ^ 0xFFFE7961);
            class308.field5322.method308(var4.field738, -2);
            class308.field5322.method311(var4.field738, var4.field772, 255, 0);
        } else {
            class270.method1864(-1);
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "()V", line = 344)
    public final void method95() {
        field3175++;
        GL var1 = class253.field4319;
        var1.glCallList(this.field3182);
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "()I", line = 354)
    public final int method90() {
        field3181++;
        return 0;
    }
}
