import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class261 extends class235 {

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "Lsb;")
    public class98 field4582;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "Lsb;")
    public static class98 field4580 = class47.method368("Update)2Liste geladen)3", 0);

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "Lsb;")
    public static class98 field4583 = class47.method368(":trade:", 0);

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "Lsb;")
    public static class98 field4586 = class47.method368("Lade)3)3)3", 0);

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "[I")
    public static int[] field4577;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILtg;)V")
    public static final void method1786(int arg0, class75 arg1) {
        class181.field3124 = arg1;
        field4584++;
        class59.field961 = class181.field3124.method550(arg0 - 1757152083, 16);
        if (arg0 != 3) {
            field4586 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public static final void method1787(int arg0) {
        field4585++;
        if (class151.field2780 == -1 || class171.field3022 == -1) {
            return;
        }
        int var1 = ((class130.field2315 - class163.field2945) * class12.field243 >> 16) + class163.field2945;
        class12.field243 += var1;
        if (class12.field243 >= 65535) {
            if (class154.field2814) {
                class106.field1900 = false;
            } else {
                class106.field1900 = true;
            }
            class154.field2814 = true;
            class12.field243 = 65535;
        } else {
            class106.field1900 = false;
            class154.field2814 = false;
        }
        float var2 = (float) class12.field243 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class139.field2470 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class243.field4212[class151.field2780][var4][var5] * 3;
            int var22 = (class243.field4212[class151.field2780][var4 + 2][var5] + class243.field4212[class151.field2780][var4 - -2][var5] - class243.field4212[class151.field2780][var4 + 3][var5]) * 3;
            int var23 = class243.field4212[class151.field2780][var4][var5];
            int var24 = class243.field4212[class151.field2780][var4 + 1][var5] * 3;
            int var25 = var24 - var21;
            int var26 = var24 + class243.field4212[class151.field2780][var4 + 2][var5] - var22 - var23;
            int var27 = var21 + var22 - (var24 * 2);
            var3[var5] = (((float) var26 * var2 + (float) var27) * var2 + (float) var25) * var2 + (float) var23;
        }
        class122.field2239 = (int) var3[1] * -1;
        if (class189.field3277 == 0 && class182.field3143 == 0) {
            class182.field3143 = ((int) var3[2] >> 10) * 8 - 48;
            class189.field3277 = (((int) var3[0] >> 10) - 6) * 8;
        }
        class20.field361 = (int) var3[2] - class182.field3143 * 128;
        class6.field86 = (int) var3[0] - (class189.field3277 * 128);
        float[] var6 = new float[3];
        int var7 = class96.field1662 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class243.field4212[class171.field3022][var7][var8] * 3;
            int var15 = (class243.field4212[class171.field3022][var7 + 2][var8] + class243.field4212[class171.field3022][var7 + 2][var8] - class243.field4212[class171.field3022][var7 + 3][var8]) * 3;
            int var16 = class243.field4212[class171.field3022][var7 + 1][var8] * 3;
            int var17 = class243.field4212[class171.field3022][var7][var8];
            int var18 = var14 + var15 - var16 * 2;
            int var19 = class243.field4212[class171.field3022][var7 + 2][var8] + var16 - var15 - var17;
            int var20 = var16 - var14;
            var6[var8] = (((float) var19 * var2 + (float) var18) * var2 + (float) var20) * var2 + (float) var17;
        }
        float var9 = var6[2] - var3[2];
        float var10 = var6[0] - var3[0];
        float var11 = (var6[1] - var3[1]) * -1.0F;
        if (arg0 != 8) {
            method1786(38, (class75) null);
        }
        double var12 = Math.sqrt((double) (var9 * var9 + var10 * var10));
        class135.field2394 = (float) Math.atan2((double) var11, var12);
        class20.field372 = -((float) Math.atan2((double) var10, (double) var9));
        class81.field1430 = (int) ((double) class20.field372 * 325.949D) & 0x7FF;
        class224.field3864 = (int) ((double) class135.field2394 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(II)V")
    public static final void method1788(int arg0, int arg1) {
        field4581++;
        class134 var2 = class115.method861(arg0, (byte) 32, arg1);
        var2.method1014(arg0 ^ 0xFE4D8A14);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
    public static void method1789(int arg0) {
        field4583 = null;
        if (arg0 <= 93) {
            method1788(-117, -63);
        }
        field4577 = null;
        field4586 = null;
        field4580 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lq;I)Lq;")
    public static final class148 method1790(class148 arg0, int arg1) {
        field4587++;
        if (arg0.field2650 != -1) {
            return class62.method455(-854073200, arg0.field2650);
        }
        if (arg1 != 3) {
            field4583 = null;
        }
        int var2 = arg0.field2728 >>> 16;
        for (class34 var3 = (class34) class243.field4209.method1514((byte) 103); var3 != null; var3 = (class34) class243.field4209.method1515(arg1 ^ 0x6A)) {
            if (var3.field596 == var2) {
                return class62.method455(-854073200, (int) var3.field4061);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
    public class261() {
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(II)V")
    public static final void method1791(int arg0, int arg1) {
        int var2 = -62 % ((arg1 + 20) / 62);
        class91.field1606.method1561(-57, arg0);
        field4578++;
        class16.field315.method1561(-115, arg0);
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lsb;I)V")
    public class261(class98 arg0, int arg1) {
        this.field4582 = arg0;
    }
}
