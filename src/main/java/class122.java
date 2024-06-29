import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class122 {

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field2257 = -1;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "Llb;")
    public static class127 field2258 = new class127(260);

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "Loh;")
    public static class263 field2263 = class253.method1681(-127, "Nehmen");

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "Loh;")
    private static class263 field2264 = class253.method1681(-119, "flash1:");

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "Loh;")
    public static class263 field2265 = field2264;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "Loh;")
    public static class263 field2267 = field2264;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public static int field2271 = 0;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "Loh;")
    public static class263 field2272 = class253.method1681(-122, "(Y<)4col>");

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
    public static int field2270 = 0;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "Loh;")
    public static class263 field2273 = class253.method1681(-117, "settings=");

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "Lue;")
    public static class86 field2268;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "[[[B")
    public static byte[][][] field2274;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZ)Ltc;")
    public static final class174 method788(int arg0, boolean arg1) {
        class174 var2 = (class174) class271.field4773.method1464((byte) 41, (long) arg0);
        field2260++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class24.field693.method596(-128, 11, arg0);
        class174 var4 = new class174();
        if (arg1) {
            field2258 = null;
        }
        if (var3 != null) {
            var4.method1146(new class194(var3), !arg1);
        }
        class271.field4773.method1472((byte) -29, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)V")
    public static final void method789(int arg0, int arg1, int arg2) {
        class64 var3 = class84.method563(arg2, arg0, -69);
        field2261++;
        var3.method396(true);
        var3.field1290 = arg1;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method790(Component arg0, byte arg1) {
        field2259++;
        int var2 = -29 % ((arg1 + 24) / 33);
        Method var3 = class262.field4566;
        if (var3 != null) {
            try {
                var3.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg0.addKeyListener(class236.field4122);
        arg0.addFocusListener(class236.field4122);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
    public static final void method791(byte arg0) {
        if (arg0 != 20) {
            method788(-3, true);
        }
        field2262++;
        if (class98.field1894 == -1 || class20.field466 == -1) {
            return;
        }
        int var1 = ((class66.field1357 - class176.field3182) * class261.field4530 >> 16) + class176.field3182;
        class261.field4530 += var1;
        if (class261.field4530 < 65535) {
            class108.field2044 = false;
            class265.field4633 = false;
        } else {
            if (class108.field2044) {
                class265.field4633 = false;
            } else {
                class265.field4633 = true;
            }
            class261.field4530 = 65535;
            class108.field2044 = true;
        }
        float[] var2 = new float[3];
        float var3 = (float) class261.field4530 / 65535.0F;
        int var4 = class57.field1171 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class275.field4823[class98.field1894][var4 + 1][var5] * 3;
            int var22 = class275.field4823[class98.field1894][var4][var5] * 3;
            int var23 = var21 - var22;
            int var24 = (class275.field4823[class98.field1894][var4 + 2][var5] - (class275.field4823[class98.field1894][var4 + 3][var5] - class275.field4823[class98.field1894][var4 + 2][var5])) * 3;
            int var25 = class275.field4823[class98.field1894][var4][var5];
            int var26 = var22 + var24 - var21 * 2;
            int var27 = class275.field4823[class98.field1894][var4 + 2][var5] + var21 - var25 - var24;
            var2[var5] = (((float) var27 * var3 + (float) var26) * var3 + (float) var23) * var3 + (float) var25;
        }
        class152.field2738 = (int) var2[2] - class142.field2596 * 128;
        class127.field2357 = (int) var2[0] - (class93.field1844 * 128);
        float[] var6 = new float[3];
        class87.field1750 = (int) var2[1] * -1;
        int var7 = class181.field3284 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class275.field4823[class20.field466][var7][var8] * 3;
            int var15 = (class275.field4823[class20.field466][var7 + 2][var8] + class275.field4823[class20.field466][var7 + 2][var8] - class275.field4823[class20.field466][var7 + 3][var8]) * 3;
            int var16 = class275.field4823[class20.field466][var7 + 1][var8] * 3;
            int var17 = class275.field4823[class20.field466][var7][var8];
            int var18 = var16 - var14;
            int var19 = var14 + var15 - (var16 * 2);
            int var20 = class275.field4823[class20.field466][var7 + 2][var8] + var16 - var17 - var15;
            var6[var8] = (((float) var20 * var3 + (float) var19) * var3 + (float) var18) * var3 + (float) var17;
        }
        float var9 = var6[0] - var2[0];
        float var10 = (var6[1] - var2[1]) * -1.0F;
        float var11 = var6[2] - var2[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class146.field2673 = (float) Math.atan2((double) var10, var12);
        class188.field3390 = -((float) Math.atan2((double) var9, (double) var11));
        class73.field1528 = (int) ((double) class146.field2673 * 325.949D) & 0x7FF;
        class215.field3816 = (int) ((double) class188.field3390 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V")
    public static void method792(boolean arg0) {
        field2265 = null;
        field2264 = null;
        field2273 = null;
        field2258 = null;
        field2263 = null;
        field2274 = null;
        field2272 = null;
        field2268 = null;
        field2267 = null;
        if (arg0) {
            method788(-55, true);
        }
    }
}
