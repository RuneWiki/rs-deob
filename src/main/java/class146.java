import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class146 {

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "[I")
    private int[] field2462;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field2459 = 0;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "Le;")
    public static class191 field2460 = class54.method368("Art", 2047);

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "Le;")
    private static class191 field2463 = class54.method368("Players", 2047);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "Le;")
    public static class191 field2456 = field2463;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public static void method981(int arg0) {
        field2463 = null;
        field2456 = null;
        field2460 = null;
        if (arg0 != -18500) {
            field2460 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)Le;")
    public static final class191 method982(int arg0) {
        field2457++;
        class191 var1 = class250.field4444;
        if (~class18.field239 != arg0) {
            var1 = class218.field3835;
        }
        return class228.method1629(new class191[] { class162.field2735, var1, class268.field4730, class92.method563(-125, class233.field4165), class255.field4511, class92.method563(arg0 - 77, class235.field4190), class114.field1883 }, (byte) -26);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BI)I")
    public final int method983(byte arg0, int arg1) {
        field2458++;
        int var3 = (this.field2462.length >> 1) - 1;
        int var4 = arg1 & var3;
        if (arg0 != -119) {
            return -47;
        }
        while (true) {
            int var5 = this.field2462[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field2462[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "([I)V")
    public class146(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length + (arg0.length >> 1)); var2 <<= 0x1) {
        }
        this.field2462 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2462[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field2462[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field2462[var5 + var5] = arg0[var4];
            this.field2462[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V")
    public static final void method984(int arg0) {
        field2461++;
        if (class22.field320 == -1 || class271.field4776 == -1) {
            return;
        }
        int var1 = ((class122.field2015 - class18.field244) * class263.field4672 >> 16) + class18.field244;
        class263.field4672 += var1;
        if (class263.field4672 >= 65535) {
            class263.field4672 = 65535;
            if (class107.field1781) {
                class253.field4484 = false;
            } else {
                class253.field4484 = true;
            }
            class107.field1781 = true;
        } else {
            class107.field1781 = false;
            class253.field4484 = false;
        }
        float var2 = (float) class263.field4672 / 65535.0F;
        int var3 = class132.field2222 * 2;
        float[] var4 = new float[3];
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class4.field35[class22.field320][var3][var5] * 3;
            int var22 = class4.field35[class22.field320][var3 + 1][var5] * 3;
            int var23 = class4.field35[class22.field320][var3][var5];
            int var24 = var22 - var21;
            int var25 = (class4.field35[class22.field320][var3 + 2][var5] + class4.field35[class22.field320][var3 + 2][var5] - class4.field35[class22.field320][var3 + 3][var5]) * 3;
            int var26 = var21 + var25 - (var22 * 2);
            int var27 = class4.field35[class22.field320][var3 + 2][var5] - (var23 - var22) - var25;
            var4[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var24) * var2 + (float) var23;
        }
        if (class225.field4061 == 0 && class193.field3474 == 0) {
            class193.field3474 = ((int) var4[2] >> 10) * 8 - 48;
            class225.field4061 = (((int) var4[0] >> 10) - 6) * 8;
        }
        float[] var6 = new float[3];
        int var7 = class156.field2668 * 2;
        class137.field2306 = (int) var4[0] - (class225.field4061 * 128);
        class229.field4116 = (int) var4[1] * arg0;
        class244.field4353 = (int) var4[2] - (class193.field3474 * 128);
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class4.field35[class271.field4776][var7][var8] * 3;
            int var15 = class4.field35[class271.field4776][var7 + 1][var8] * 3;
            int var16 = (class4.field35[class271.field4776][var7 + 2][var8] + class4.field35[class271.field4776][var7 + 2][var8] - class4.field35[class271.field4776][var7 + 3][var8]) * 3;
            int var17 = class4.field35[class271.field4776][var7][var8];
            int var18 = var15 - var14;
            int var19 = var16 + var14 - (var15 * 2);
            int var20 = class4.field35[class271.field4776][var7 + 2][var8] - (var17 - var15) - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var4[0];
        float var10 = (var6[1] - var4[1]) * -1.0F;
        float var11 = var6[2] - var4[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class8.field79 = (float) Math.atan2((double) var10, var12);
        class117.field1931 = -((float) Math.atan2((double) var9, (double) var11));
        class81.field1371 = (int) ((double) class117.field1931 * 325.949D) & 0x7FF;
        class170.field2876 = (int) ((double) class8.field79 * 325.949D) & 0x7FF;
    }
}
