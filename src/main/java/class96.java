import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class96 implements class321 {

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "[F")
    private float[] field1380 = new float[4];

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "Lhk;")
    public static class42 field1381 = null;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public static int field1388 = 0;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    private int field1383;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "[[[I")
    public static int[][][] field1378;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V", line = 6)
    private final void method718(int arg0) {
        GL var2 = class73.field1051;
        this.field1383 = var2.glGenLists(2);
        field1385++;
        var2.glNewList(this.field1383, 4864);
        var2.glActiveTexture(33985);
        if (class117.field1832) {
            var2.glBindTexture(32879, class117.field1829);
            var2.glTexGeni(8194, 9472, 9217);
            var2.glEnable(3170);
            var2.glEnable(32879);
        } else {
            var2.glEnable(3553);
        }
        var2.glTexGeni(8192, 9472, 9216);
        if (arg0 != -16223) {
            field1378 = (int[][][]) ((int[][][]) null);
        }
        var2.glTexGeni(8193, 9472, 9216);
        var2.glEnable(3168);
        var2.glEnable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
        var2.glNewList(this.field1383 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class117.field1832) {
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

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "()V", line = 50)
    public final void method355() {
        field1387++;
        GL var1 = class73.field1051;
        var1.glCallList(this.field1383 + 1);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 66)
    public final void method353(int arg0) {
        field1376++;
        GL var2 = class73.field1051;
        float var3 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        float var5 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        boolean var6 = (arg0 & 0x80) != 0;
        if (var6) {
            this.field1380[2] = 0.0F;
            this.field1380[0] = var4;
            this.field1380[1] = 0.0F;
            this.field1380[3] = 0.0F;
        } else {
            this.field1380[2] = var4;
            this.field1380[3] = 0.0F;
            this.field1380[0] = 0.0F;
            this.field1380[1] = 0.0F;
        }
        var2.glActiveTexture(33985);
        var2.glMatrixMode(5888);
        var2.glPushMatrix();
        var2.glLoadIdentity();
        var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class94.field1334 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class299.field4607 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var2.glTranslatef((float) (-class38.field548), (float) (-class309.field4821), (float) (-class257.field3937));
        var2.glTexGenfv(8192, 9474, this.field1380, 0);
        this.field1380[1] = var4;
        this.field1380[0] = 0.0F;
        this.field1380[3] = (float) class73.field1071 * var5;
        this.field1380[2] = 0.0F;
        var2.glTexGenfv(8193, 9474, this.field1380, 0);
        var2.glPopMatrix();
        if (class117.field1832) {
            this.field1380[0] = 0.0F;
            this.field1380[3] = (float) class73.field1071 * var3;
            this.field1380[2] = 0.0F;
            this.field1380[1] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field1380, 0);
        } else {
            int var7 = (int) ((float) class73.field1071 * var3 * 64.0F);
            var2.glBindTexture(3553, class117.field1831[var7 % 64]);
        }
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V", line = 216)
    public class96() {
        this.method718(-16223);
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "()V", line = 145)
    public final void method351() {
        field1386++;
        GL var1 = class73.field1051;
        var1.glCallList(this.field1383);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIII)V", line = 157)
    public static final void method719(int arg0, int arg1, int arg2, int arg3) {
        field1382++;
        int var4 = class59.field783 * arg0 >> 8;
        if (arg1 != 6387) {
            method721((byte) 66);
        }
        if (var4 != 0 && arg3 != -1) {
            class262.method1837(false, 0, class122.field1872, var4, arg3, 0);
            class132.field2016 = true;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZI)Lin;", line = 177)
    public static final class39 method720(boolean arg0, int arg1) {
        field1384++;
        class39 var2 = (class39) class228.field3479.method730((long) arg1, (byte) 90);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class15.field201.method696(arg1, (byte) 104, 5);
        class39 var4 = new class39();
        if (var3 != null) {
            var4.method303(-1, new class254(var3));
        }
        if (!arg0) {
            field1381 = (class42) null;
        }
        class228.field3479.method734((byte) -14, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "()I", line = 199)
    public final int method352() {
        field1379++;
        return 0;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V", line = 207)
    public static void method721(byte arg0) {
        field1381 = null;
        if (arg0 != -46) {
            method720(false, -105);
        }
        field1378 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljd;Ljd;B)V", line = 227)
    public static final void method722(class95 arg0, class95 arg1, byte arg2) {
        int var3 = -52 % ((arg2 + 77) / 44);
        class300.field4623 = class215.method1540(class341.field5298, 0, arg0, arg1, false);
        field1377++;
        if (class73.field1058) {
            class84.field1230 = class174.method1302(arg1, (byte) 33, class341.field5298, arg0, 0);
        } else {
            class84.field1230 = (class68) class300.field4623;
        }
        class265.field4128 = class215.method1540(class297.field4580, 0, arg0, arg1, false);
        class167.field2703 = class215.method1540(class69.field990, 0, arg0, arg1, false);
    }
}
