import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class310 implements class66 {

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "[F")
    private float[] field5197 = new float[4];

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "Lpl;")
    public static class186 field5202 = new class186(64);

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "Lqd;")
    public static class40 field5207 = class147.method1106("Starte 3D)2Softwarebibliothek)3", (byte) -91);

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public static int field5210 = 50;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "F")
    public static float field5209;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    private int field5200;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "Ljd;")
    public static class134 field5208;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "Lde;")
    public static class58 field5206;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)V", line = 6)
    public static final void method2116(int arg0, byte arg1) {
        field5203++;
        short var2 = 256;
        if (var2 < arg0) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class270.field4487 += arg0 * 128;
        if (class298.field4982.length < class270.field4487) {
            class270.field4487 -= class298.field4982.length;
            int var3 = (int) (Math.random() * 12.0D);
            class104.method778(class22.field388[var3], (byte) 86);
        }
        int var4 = 0;
        int var5 = arg0 * 128;
        int var6 = (var2 - arg0) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = class286.field4819[var4 + var5] - class298.field4982[class298.field4982.length - 1 & class270.field4487 + var4] * arg0 / 6;
            if (var8 < 0) {
                var8 = 0;
            }
            class286.field4819[var4++] = var8;
        }
        for (int var9 = var2 - arg0; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class286.field4819[var10 + var11] = 255;
                } else {
                    class286.field4819[var10 + var11] = 0;
                }
            }
        }
        int var13 = 0;
        if (arg1 != 61) {
            method2117((byte) 1);
        }
        while (var2 - arg0 > var13) {
            class102.field1803[var13] = class102.field1803[arg0 + var13];
            var13++;
        }
        for (int var14 = var2 - arg0; var14 < var2; var14++) {
            class102.field1803[var14] = (int) (Math.sin((double) class309.field5189 / 14.0D) * 16.0D + Math.sin((double) class309.field5189 / 15.0D) * 14.0D + Math.sin((double) class309.field5189 / 16.0D) * 12.0D);
            class309.field5189++;
        }
        class110.field1924 += arg0;
        int var15 = ((class256.field4266 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class110.field1924; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            class286.field4819[(var18 << 7) + var17] = 192;
        }
        class110.field1924 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = var19 * 128;
            int var21 = 0;
            for (int var22 = -var15; var22 < 128; var22++) {
                if ((var15 + var22) < 128) {
                    var21 += class286.field4819[var22 - (-var15 - var20)];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var21 -= class286.field4819[var20 + var22 - var15 - 1];
                }
                if (var22 >= 0) {
                    class174.field2828[var22 + var20] = var21 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if (var2 > var15 + var25) {
                    var24 += class174.field2828[var15 * 128 + var23 + var26];
                }
                if (-(var15 - var25) - 1 >= 0) {
                    var24 -= class174.field2828[var23 + var26 - ((var15 + 1) * 128)];
                }
                if (var25 >= 0) {
                    class286.field4819[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "()V", line = 178)
    public final void method92() {
        field5196++;
        GL var1 = class21.field377;
        var1.glCallList(this.field5200);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 197)
    public static void method2117(byte arg0) {
        int var1 = -79 / ((arg0 + 25) / 45);
        field5208 = null;
        field5207 = null;
        field5202 = null;
        field5206 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()V", line = 213)
    public final void method93() {
        GL var1 = class21.field377;
        var1.glCallList(this.field5200 + 1);
        field5195++;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V", line = 224)
    private final void method2118(int arg0) {
        field5205++;
        GL var2 = class21.field377;
        this.field5200 = var2.glGenLists(2);
        var2.glNewList(this.field5200, 4864);
        var2.glActiveTexture(33985);
        if (class176.field2899) {
            var2.glBindTexture(32879, class176.field2898);
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
        var2.glNewList(this.field5200 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class176.field2899) {
            var2.glDisable(32879);
            var2.glDisable(3170);
        } else {
            var2.glDisable(3553);
        }
        var2.glDisable(3168);
        if (arg0 != -16711936) {
            method2117((byte) -76);
        }
        var2.glDisable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZILbd;)V", line = 270)
    public static final void method2119(boolean arg0, int arg1, class297 arg2) {
        field5198++;
        int var3 = arg2.field4959;
        int var4 = (int) arg2.field5149;
        arg2.method2095(0);
        if (arg0) {
            class135.method998(var3, (byte) -70);
        }
        class6.method30((byte) -121, var3);
        class213 var5 = class314.method2172((byte) -113, var4);
        if (var5 != null) {
            class25.method188(0, var5);
        }
        int var6 = class255.field4252;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class60.method505(class288.field4832[var7], arg1 ^ 0x2BA4)) {
                class68.method533(8422, var7);
            }
        }
        if (class255.field4252 == arg1) {
            class27.field518 = false;
            class129.method958(class27.field550, class178.field2934, class160.field2681, arg1 + 116, class250.field4138);
        } else {
            class129.method958(class27.field550, class178.field2934, class160.field2681, 87, class250.field4138);
            int var8 = class230.field3789.method1830(class98.field1756);
            for (int var9 = 0; var9 < class255.field4252; var9++) {
                int var10 = class230.field3789.method1830(class108.method819(var9, (byte) -69));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class178.field2934 = class255.field4252 * 15 + 22;
            class250.field4138 = var8 + 8;
        }
        if (class148.field2499 != -1) {
            class168.method1253(-11892, 1, class148.field2499);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIB)I", line = 339)
    public static final int method2120(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = 5 % ((arg3 + 86) / 39);
        field5199++;
        if (arg0 == arg1) {
            return arg1;
        } else {
            int var5 = 128 - arg2;
            int var6 = ((-16711936 & arg1) >>> 7) * var5 + (arg0 >>> 7 & 0x1FE01FE) * arg2 & 0xFF00FF00;
            int var7 = (arg0 & 0xFF00FF) * arg2 + (arg1 & 0xFF00FF) * var5 & 0xFF00FF00;
            return (var7 >> 7) + var6;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "()I", line = 361)
    public final int method91() {
        field5194++;
        return 0;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lce;B)V", line = 370)
    public static final void method2121(class239 arg0, byte arg1) {
        class300.field5028 = arg0;
        field5204++;
        if (arg1 != 69) {
            field5210 = 116;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 382)
    public final void method94(int arg0) {
        field5201++;
        GL var2 = class21.field377;
        float var3 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        float var4 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
        float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var6 = (arg0 & 0x80) != 0;
        if (var6) {
            this.field5197[3] = 0.0F;
            this.field5197[1] = 0.0F;
            this.field5197[2] = 0.0F;
            this.field5197[0] = var5;
        } else {
            this.field5197[3] = 0.0F;
            this.field5197[0] = 0.0F;
            this.field5197[2] = var5;
            this.field5197[1] = 0.0F;
        }
        var2.glActiveTexture(33985);
        var2.glMatrixMode(5888);
        var2.glPushMatrix();
        var2.glLoadIdentity();
        var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class240.field3977 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class7.field110 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var2.glTranslatef((float) (-class19.field324), (float) (-class1.field6), (float) (-class242.field3989));
        var2.glTexGenfv(8192, 9474, this.field5197, 0);
        this.field5197[2] = 0.0F;
        this.field5197[0] = 0.0F;
        this.field5197[1] = var5;
        this.field5197[3] = (float) class21.field357 * var3;
        var2.glTexGenfv(8193, 9474, this.field5197, 0);
        var2.glPopMatrix();
        if (class176.field2899) {
            this.field5197[2] = 0.0F;
            this.field5197[0] = 0.0F;
            this.field5197[3] = (float) class21.field357 * var4;
            this.field5197[1] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field5197, 0);
        } else {
            int var7 = (int) ((float) class21.field357 * var4 * 64.0F);
            var2.glBindTexture(3553, class176.field2894[var7 % 64]);
        }
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)J", line = 448)
    public static final long method2122(int arg0, int arg1, int arg2) {
        class14 var3 = class93.field1690[arg0][arg1][arg2];
        return var3 == null || var3.field222 == null ? 0L : var3.field222.field1804;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V", line = 460)
    public class310() {
        this.method2118(-16711936);
    }
}
