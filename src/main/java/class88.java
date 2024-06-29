import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class88 implements class223 {

    @OriginalMember(owner = "client!be", name = "m", descriptor = "[F")
    private float[] field1503 = new float[4];

    @OriginalMember(owner = "client!be", name = "d", descriptor = "Loh;")
    public static class258 field1494 = class153.method1046(" steht bereits auf Ihrer Freunde)2Liste(Q", 102);

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field1493 = 0;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "Loh;")
    public static class258 field1500 = class153.method1046("::fpson", 90);

    @OriginalMember(owner = "client!be", name = "r", descriptor = "Loh;")
    private static class258 field1508 = class153.method1046("Loaded fonts", 122);

    @OriginalMember(owner = "client!be", name = "h", descriptor = "Loh;")
    public static class258 field1498 = field1508;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    private int field1501;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IBI)V", line = 7)
    public static final void method629(int arg0, byte arg1, int arg2) {
        if (class244.field4233 != 0 && arg0 != -1) {
            class44.method370(-32768, arg0, 0, false, class244.field4233, class56.field877);
            class106.field1898 = true;
        }
        field1496++;
        int var3 = 39 / ((arg1 - 24) / 58);
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "()I", line = 42)
    public final int method423() {
        field1507++;
        return 0;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V", line = 51)
    private final void method630(byte arg0) {
        GL var2 = class257.field4409;
        int var3 = -20 / ((arg0 - 62) / 36);
        field1495++;
        this.field1501 = var2.glGenLists(2);
        var2.glNewList(this.field1501, 4864);
        var2.glActiveTexture(33985);
        if (class230.field3963) {
            var2.glBindTexture(32879, class230.field3966);
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
        var2.glNewList(this.field1501 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class230.field3963) {
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

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIIII)V", line = 95)
    public static final void method631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1499++;
        if (arg3 < 128 || arg2 < 128 || arg3 > 13056 || arg2 > 13056) {
            class294.field5055 = -1;
            class73.field1287 = -1;
            return;
        }
        int var8 = class228.method1525(true, class272.field4704, arg2, arg3) - arg6;
        int var9 = arg3 - class285.field4906;
        int var10 = var8 - class245.field4258;
        int var11 = class266.field4642[class106.field1894];
        int var12 = arg2 - class61.field1086;
        if (arg1 != 16329) {
            field1500 = (class258) null;
        }
        int var13 = class266.field4636[class90.field1576];
        int var14 = class266.field4636[class106.field1894];
        int var15 = class266.field4642[class90.field1576];
        int var16 = var9 * var13 + var12 * var15 >> 16;
        int var17 = var12 * var13 - (var9 * var15) >> 16;
        int var19 = var10 * var14 - (var11 * var17) >> 16;
        int var20 = var10 * var11 + (var14 * var17) >> 16;
        if (var20 < 50) {
            class73.field1287 = -1;
            class294.field5055 = -1;
        } else if (class257.field4390) {
            int var22 = arg0 * 512 >> 8;
            class73.field1287 = var19 * var22 / var20 + arg7;
            int var23 = arg4 * 512 >> 8;
            class294.field5055 = var16 * var23 / var20 + arg5;
        } else {
            class294.field5055 = arg5 + ((var16 << 9) / var20);
            class73.field1287 = arg7 + ((var19 << 9) / var20);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Lmk;", line = 156)
    public static final class151 method632(int arg0, int arg1) {
        field1505++;
        class151 var2 = (class151) class173.field3095.method1159((byte) 124, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class71.field1232.method1453(class180.method1232(-1762753753, arg1), (byte) -16, class147.method1013(arg1, 0));
        class151 var4 = new class151();
        var4.field2596 = arg1;
        if (var3 != null) {
            var4.method1031((byte) -88, new class235(var3));
        }
        var4.method1032(-2);
        int var5 = 115 % ((arg0 - 6) / 40);
        class173.field3095.method1163(var4, -1, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V", line = 186)
    public static void method633(byte arg0) {
        field1500 = null;
        if (arg0 < 99) {
            method634(7, -10, (class213) null);
        }
        field1494 = null;
        field1498 = null;
        field1508 = null;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "()V", line = 200)
    public final void method424() {
        GL var1 = class257.field4409;
        var1.glCallList(this.field1501);
        field1491++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IILgb;)[Lvi;", line = 219)
    public static final class129[] method634(int arg0, int arg1, class213 arg2) {
        if (arg0 > -77) {
            return (class129[]) null;
        } else {
            field1504++;
            return class286.method2016(arg2, false, arg1) ? class147.method1014((byte) 116) : null;
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V", line = 234)
    public static final void method635(int arg0) {
        field1509++;
        class70.field1207 = class252.method1708(true, (byte) -73, 2048, 8, 35, 0.4F, 4, 8);
        if (arg0 != 26129) {
            method631(61, -51, -125, -98, 113, -76, 123, 20);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "()V", line = 249)
    public final void method419() {
        GL var1 = class257.field4409;
        field1502++;
        var1.glCallList(this.field1501 + 1);
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V", line = 272)
    public class88() {
        this.method630((byte) 21);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 285)
    public final void method426(int arg0) {
        field1492++;
        GL var2 = class257.field4409;
        float var3 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        float var5 = (float) (((arg0 & 0x1C) >> 3) + 1) * 0.01F;
        boolean var6 = (arg0 & 0x80) != 0;
        if (var6) {
            this.field1503[3] = 0.0F;
            this.field1503[1] = 0.0F;
            this.field1503[2] = 0.0F;
            this.field1503[0] = var4;
        } else {
            this.field1503[0] = 0.0F;
            this.field1503[2] = var4;
            this.field1503[3] = 0.0F;
            this.field1503[1] = 0.0F;
        }
        var2.glActiveTexture(33985);
        var2.glMatrixMode(5888);
        var2.glPushMatrix();
        var2.glLoadIdentity();
        var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class204.field3533 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class310.field5253 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var2.glTranslatef((float) (-class145.field2438), (float) (-class57.field903), (float) (-class212.field3643));
        var2.glTexGenfv(8192, 9474, this.field1503, 0);
        this.field1503[3] = (float) class257.field4407 * var3;
        this.field1503[2] = 0.0F;
        this.field1503[1] = var4;
        this.field1503[0] = 0.0F;
        var2.glTexGenfv(8193, 9474, this.field1503, 0);
        var2.glPopMatrix();
        if (class230.field3963) {
            this.field1503[2] = 0.0F;
            this.field1503[0] = 0.0F;
            this.field1503[1] = 0.0F;
            this.field1503[3] = (float) class257.field4407 * var5;
            var2.glTexGenfv(8194, 9473, this.field1503, 0);
        } else {
            int var7 = (int) ((float) class257.field4407 * var5 * 64.0F);
            var2.glBindTexture(3553, class230.field3964[var7 % 64]);
        }
        var2.glActiveTexture(33984);
    }
}
