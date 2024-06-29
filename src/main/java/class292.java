import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class292 implements class215 {

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "[F")
    private float[] field4829 = new float[4];

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field4832 = 128;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "Lce;")
    public static class126 field4836 = class206.method1445(-7923, "hitmarks");

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "Lce;")
    public static class126 field4839 = class206.method1445(-7923, "Prendre");

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "Z")
    public static boolean field4838 = false;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field4837 = 0;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "Lfg;")
    public static class48 field4831 = new class48(64);

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    private int field4828;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V", line = 11)
    public static void method1932(int arg0) {
        field4831 = null;
        field4839 = null;
        field4836 = null;
        if (arg0 <= 18) {
            method1932(-84);
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "()V", line = 24)
    public final void method18() {
        GL var1 = class56.field848;
        var1.glCallList(this.field4828);
        field4841++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V", line = 54)
    private final void method1933(byte arg0) {
        field4830++;
        GL var2 = class56.field848;
        this.field4828 = var2.glGenLists(2);
        var2.glNewList(this.field4828, 4864);
        var2.glActiveTexture(33985);
        if (class149.field2738) {
            var2.glBindTexture(32879, class149.field2736);
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
        var2.glNewList(this.field4828 + 1, 4864);
        if (arg0 > -95) {
            this.method19();
        }
        var2.glActiveTexture(33985);
        if (class149.field2738) {
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

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V", line = 119)
    public final void method21(int arg0) {
        float var2 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        GL var3 = class56.field848;
        float var4 = (float) (((arg0 & 0x1A) >> 3) + 1) * 0.01F;
        field4842++;
        float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var6 = (arg0 & 0x80) != 0;
        if (var6) {
            this.field4829[2] = 0.0F;
            this.field4829[1] = 0.0F;
            this.field4829[3] = 0.0F;
            this.field4829[0] = var5;
        } else {
            this.field4829[2] = var5;
            this.field4829[1] = 0.0F;
            this.field4829[3] = 0.0F;
            this.field4829[0] = 0.0F;
        }
        var3.glActiveTexture(33985);
        var3.glMatrixMode(5888);
        var3.glPushMatrix();
        var3.glLoadIdentity();
        var3.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var3.glRotatef((float) class237.field4000 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var3.glRotatef((float) class120.field2019 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var3.glTranslatef((float) (-class117.field1975), (float) (-class167.field2969), (float) (-class85.field1350));
        var3.glTexGenfv(8192, 9474, this.field4829, 0);
        this.field4829[3] = (float) class56.field871 * var2;
        this.field4829[1] = var5;
        this.field4829[2] = 0.0F;
        this.field4829[0] = 0.0F;
        var3.glTexGenfv(8193, 9474, this.field4829, 0);
        var3.glPopMatrix();
        if (class149.field2738) {
            this.field4829[0] = 0.0F;
            this.field4829[3] = (float) class56.field871 * var4;
            this.field4829[1] = 0.0F;
            this.field4829[2] = 0.0F;
            var3.glTexGenfv(8194, 9473, this.field4829, 0);
        } else {
            int var7 = (int) ((float) class56.field871 * var4 * 64.0F);
            var3.glBindTexture(3553, class149.field2734[var7 % 64]);
        }
        var3.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V", line = 204)
    public class292() {
        this.method1933((byte) -112);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "()I", line = 183)
    public final int method19() {
        field4827++;
        return 0;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "()V", line = 194)
    public final void method23() {
        field4834++;
        GL var1 = class56.field848;
        var1.glCallList(this.field4828 + 1);
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V", line = 238)
    public static final void method1934(byte arg0) {
        field4835++;
        int var1 = (class58.field914 >> 3) + (class152.field2780 >> 10);
        int var2 = (class223.field3755 >> 10) + (class138.field2473 >> 3);
        byte var3 = 0;
        byte var4 = 18;
        class69.field1132 = new byte[var4][];
        class314.field5392 = new int[var4][4];
        class45.field697 = new int[var4];
        class122.field2049 = new int[var4];
        byte var5 = 8;
        class243.field4116 = new byte[var4][];
        class148.field2732 = new int[var4];
        class68.field1125 = new int[var4];
        class140.field2555 = new int[var4];
        byte var6 = 8;
        class128.field2200 = new byte[var4][];
        class314.field5388 = new byte[var4][];
        class213.field3622 = new int[var4];
        class322.field5502 = new byte[var4][];
        int var7 = 0;
        for (int var8 = (var1 - 6) / 8; var8 <= ((var1 + 6) / 8); var8++) {
            for (int var9 = (var2 - 6) / 8; var9 <= ((var2 + 6) / 8); var9++) {
                int var10 = (var8 << 8) + var9;
                class148.field2732[var7] = var10;
                class213.field3622[var7] = class168.field3000.method2176(class12.method69(new class126[] { class117.field1972, class195.method1386((byte) 20, var8), class105.field1663, class195.method1386((byte) 20, var9) }, (byte) 118), 0);
                class140.field2555[var7] = class168.field3000.method2176(class12.method69(new class126[] { class26.field373, class195.method1386((byte) 20, var8), class105.field1663, class195.method1386((byte) 20, var9) }, (byte) 126), 0);
                class68.field1125[var7] = class168.field3000.method2176(class12.method69(new class126[] { class150.field2744, class195.method1386((byte) 20, var8), class105.field1663, class195.method1386((byte) 20, var9) }, (byte) 126), 0);
                class45.field697[var7] = class168.field3000.method2176(class12.method69(new class126[] { class151.field2760, class195.method1386((byte) 20, var8), class105.field1663, class195.method1386((byte) 20, var9) }, (byte) 122), class130.method910(arg0, -51));
                class122.field2049[var7] = class168.field3000.method2176(class12.method69(new class126[] { class314.field5381, class195.method1386((byte) 20, var8), class105.field1663, class195.method1386((byte) 20, var9) }, (byte) 122), class130.method910(arg0, -51));
                if (class68.field1125[var7] == -1) {
                    class213.field3622[var7] = -1;
                    class140.field2555[var7] = -1;
                    class45.field697[var7] = -1;
                    class122.field2049[var7] = -1;
                }
                var7++;
            }
        }
        int var11 = var7;
        if (arg0 != -51) {
            method1934((byte) -9);
        }
        while (class68.field1125.length > var11) {
            class68.field1125[var11] = -1;
            class213.field3622[var11] = -1;
            class140.field2555[var11] = -1;
            class45.field697[var11] = -1;
            class122.field2049[var11] = -1;
            var11++;
        }
        class47.method296(var5, var1, var2, var6, true, var3, -94);
    }
}
