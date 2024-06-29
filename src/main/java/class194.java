import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class194 implements class73 {

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "[F")
    private float[] field3303 = new float[4];

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Lcd;")
    public static class64 field3296 = class44.method335((byte) 71, "::noclip");

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "[I")
    public static int[] field3300 = new int[100];

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "[I")
    public static int[] field3307 = new int[2048];

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    private int field3299;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "[[B")
    public static byte[][] field3304;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "()I", line = 9)
    public final int method554() {
        field3302++;
        return 0;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "()V", line = 35)
    public final void method555() {
        field3301++;
        GL var1 = class123.field2212;
        var1.glCallList(this.field3299 + 1);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V", line = 49)
    public static void method1363(byte arg0) {
        field3307 = null;
        field3296 = null;
        field3300 = null;
        if (arg0 > 6) {
            field3304 = (byte[][]) null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V", line = 62)
    public final void method557(int arg0) {
        field3298++;
        GL var2 = class123.field2212;
        float var3 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
        float var4 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        boolean var5 = (arg0 & 0x80) != 0;
        float var6 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        if (var5) {
            this.field3303[1] = 0.0F;
            this.field3303[3] = 0.0F;
            this.field3303[0] = var6;
            this.field3303[2] = 0.0F;
        } else {
            this.field3303[1] = 0.0F;
            this.field3303[2] = var6;
            this.field3303[3] = 0.0F;
            this.field3303[0] = 0.0F;
        }
        var2.glActiveTexture(33985);
        var2.glMatrixMode(5888);
        var2.glPushMatrix();
        var2.glLoadIdentity();
        var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class306.field5238 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class218.field3709 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var2.glTranslatef((float) (-class65.field1294), (float) (-class296.field5099), (float) (-class53.field874));
        var2.glTexGenfv(8192, 9474, this.field3303, 0);
        this.field3303[2] = 0.0F;
        this.field3303[3] = (float) class123.field2226 * var4;
        this.field3303[0] = 0.0F;
        this.field3303[1] = var6;
        var2.glTexGenfv(8193, 9474, this.field3303, 0);
        var2.glPopMatrix();
        if (class212.field3570) {
            this.field3303[1] = 0.0F;
            this.field3303[3] = (float) class123.field2226 * var3;
            this.field3303[2] = 0.0F;
            this.field3303[0] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field3303, 0);
        } else {
            int var7 = (int) ((float) class123.field2226 * var3 * 64.0F);
            var2.glBindTexture(3553, class212.field3571[var7 % 64]);
        }
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V", line = 129)
    private final void method1364(int arg0) {
        GL var2 = class123.field2212;
        this.field3299 = var2.glGenLists(2);
        field3297++;
        var2.glNewList(this.field3299, 4864);
        var2.glActiveTexture(33985);
        if (class212.field3570) {
            var2.glBindTexture(32879, class212.field3574);
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
        if (arg0 != -1280296410) {
            field3296 = (class64) null;
        }
        var2.glEndList();
        var2.glNewList(this.field3299 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class212.field3570) {
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

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V", line = 408)
    public class194() {
        this.method1364(-1280296410);
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "()V", line = 176)
    public final void method556() {
        field3305++;
        GL var1 = class123.field2212;
        var1.glCallList(this.field3299);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZZ)V", line = 187)
    public static final void method1365(boolean arg0, boolean arg1) {
        field3306++;
        if (class138.field2454 == arg1) {
            return;
        }
        class138.field2454 = arg1;
        class261.method1840(10);
        if (!arg0) {
            field3307 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V", line = 204)
    public static final void method1366(byte arg0) {
        field3308++;
        int var1 = 53 % ((38 - arg0) / 62);
        class76.field1432.method1187(0);
        class55.field924.method1187(0);
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)V", line = 215)
    public static final void method1367(byte arg0) {
        field3309++;
        if (class165.field2897 == null) {
            return;
        }
        if (class276.field4745 < 10) {
            if (!client.field4172.method1602(-105, class165.field2897.field5233) || !client.field4172.method1602(92, class104.method768(new class64[] { class165.field2897.field5233, class218.field3697 }, false))) {
                class276.field4745 = class114.field2096.method1593(class165.field2897.field5233, 0) / 10;
                return;
            }
            class173.method1211(arg0 - 99);
            class276.field4745 = 10;
        }
        if (class276.field4745 == 10) {
            class232.field3923 = class165.field2897.field5229 >> 6 << 6;
            class251.field4360 = class165.field2897.field5228 >> 6 << 6;
            int var1 = (class139.field2472.field1859 >> 7) + class190.field3269 - class251.field4360;
            class298.field5138 = 8.0F;
            class106.field1965 = 8.0F;
            int var2 = var1 + (int) (Math.random() * 10.0D) - 5;
            class226.field3845 = (class165.field2897.field5225 >> 6 << 6) + 64 - class251.field4360;
            class233.field3934 = (class165.field2897.field5222 >> 6 << 6) + 64 - class232.field3923;
            int var3 = class232.field3923 + class233.field3934 - (class139.field2472.field1865 >> 7) - class121.field2184 - 1;
            int var4 = var3 + ((int) (Math.random() * 10.0D) - 5);
            if (var2 >= 0 && class226.field3845 > var2 && var4 >= 0 && var4 < class233.field3934) {
                class274.field4699 = var4;
                class69.field1335 = var2;
            } else {
                class69.field1335 = class165.field2897.field5227 * 64 - class251.field4360;
                class274.field4699 = class233.field3934 + class232.field3923 - (class165.field2897.field5216 * 64) - 1;
            }
            class155.method1117((byte) -106);
            class288.field4920 = new int[class85.field1574 + 1];
            int var5 = class12.field237 >> 2 << 10;
            int var6 = class226.field3845 >> 6;
            int var7 = class233.field3934 >> 6;
            class122.field2192 = new byte[var6][var7][];
            class134.field2377 = new byte[var6][var7][];
            class173.field2988 = new byte[var6][var7][];
            int var8 = class189.field3251 >> 1;
            class159.field2812 = new byte[var6][var7][];
            class270.field4665 = new short[var6][var7][];
            class295.field5073 = new int[var6][var7][];
            class62.field1209 = new int[var6][var7][];
            class253.field4416 = new byte[var6][var7][];
            class253.method1814(var5, var8, (byte) -104);
            class276.field4745 = 20;
        } else if (class276.field4745 == 20) {
            class164.method1175(new class13(client.field4172.method1604(class47.field774, class165.field2897.field5233, 100)), 20779);
            class276.field4745 = 30;
            class255.method1821(true, (byte) -126);
            class31.method270((byte) 126);
        } else if (class276.field4745 == 30) {
            class164.method1172(111, new class13(client.field4172.method1604(class63.field1223, class165.field2897.field5233, arg0 + 120)));
            class276.field4745 = 40;
            class31.method270((byte) -11);
        } else {
            if (arg0 != -20) {
                method1365(true, false);
            }
            if (class276.field4745 == 40) {
                class69.method566(30711, new class13(client.field4172.method1604(class85.field1575, class165.field2897.field5233, arg0 ^ 0xFFFFFF88)));
                class276.field4745 = 50;
                class31.method270((byte) 126);
            } else if (class276.field4745 == 50) {
                class213.method1502(8, new class13(client.field4172.method1604(class296.field5098, class165.field2897.field5233, 100)));
                class276.field4745 = 60;
                class255.method1821(true, (byte) 86);
                class31.method270((byte) 126);
            } else if (class276.field4745 == 60) {
                class143.field2516 = class313.method2168((byte) -99, class104.method768(new class64[] { class165.field2897.field5233, class218.field3697 }, false), client.field4172);
                class276.field4745 = 70;
                class31.method270((byte) 126);
            } else if (class276.field4745 == 70) {
                class199.field3410 = new class209(11, true, class307.field5251);
                class276.field4745 = 73;
                class255.method1821(true, (byte) 38);
                class31.method270((byte) 127);
            } else if (class276.field4745 == 73) {
                class114.field2097 = new class209(12, true, class307.field5251);
                class276.field4745 = 76;
                class255.method1821(true, (byte) 76);
                class31.method270((byte) 126);
            } else if (class276.field4745 == 76) {
                class255.field4429 = new class209(14, true, class307.field5251);
                class276.field4745 = 79;
                class255.method1821(true, (byte) 29);
                class31.method270((byte) 126);
            } else if (class276.field4745 == 79) {
                class270.field4657 = new class209(17, true, class307.field5251);
                class276.field4745 = 82;
                class255.method1821(true, (byte) -125);
                class31.method270((byte) 127);
            } else if (class276.field4745 == 82) {
                class295.field5068 = new class209(19, true, class307.field5251);
                class276.field4745 = 85;
                class255.method1821(true, (byte) -101);
                class31.method270((byte) 127);
            } else if (class276.field4745 == 85) {
                class254.field4425 = new class209(22, true, class307.field5251);
                class276.field4745 = 88;
                class255.method1821(true, (byte) 38);
                class31.method270((byte) 126);
            } else if (class276.field4745 == 88) {
                class41.field679 = new class209(26, true, class307.field5251);
                class276.field4745 = 91;
                class255.method1821(true, (byte) -101);
                class31.method270((byte) 126);
            } else {
                class163.field2864 = new class209(30, true, class307.field5251);
                class276.field4745 = 100;
                class255.method1821(true, (byte) 83);
                class31.method270((byte) 126);
                class255.field4436 = -1;
                class189.field3257 = -1;
                System.gc();
            }
        }
    }
}
