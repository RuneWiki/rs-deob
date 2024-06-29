import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class314 {

    @OriginalMember(owner = "client!km", name = "m", descriptor = "Lqd;")
    public static class40 field5308 = class147.method1106("gleiten:", (byte) -51);

    @OriginalMember(owner = "client!km", name = "p", descriptor = "Lqd;")
    private static class40 field5311 = class147.method1106("flash3:", (byte) -47);

    @OriginalMember(owner = "client!km", name = "n", descriptor = "Z")
    public static boolean field5309 = false;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "I")
    public static int field5306 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "Lqd;")
    public static class40 field5301 = field5311;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "Lqd;")
    public static class40 field5304 = field5311;

    @OriginalMember(owner = "client!km", name = "s", descriptor = "I")
    public static int field5314 = -1;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public int field5297;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public int field5300;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!km", name = "q", descriptor = "I")
    public int field5312;

    @OriginalMember(owner = "client!km", name = "r", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!km", name = "t", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2166(int arg0) {
        if (arg0 != 16329) {
            method2172((byte) 16, 34);
        }
        class122.field2126.method1349(true);
        field5296++;
        class274.field4547.method1349(true);
        class256.field4269.method1349(true);
        class158.field2646.method1349(true);
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V", line = 25)
    public static final void method2167(int arg0) {
        field5303++;
        if (class30.field632 == -1 || class315.field5349 == -1) {
            return;
        }
        int var1 = ((class206.field3279 - class58.field1115) * class257.field4279 >> 16) + class58.field1115;
        class257.field4279 += var1;
        float[] var2 = new float[3];
        if (class257.field4279 >= 65535) {
            class257.field4279 = 65535;
            if (class40.field714) {
                class104.field1849 = false;
            } else {
                class104.field1849 = true;
            }
            class40.field714 = true;
        } else {
            class104.field1849 = false;
            class40.field714 = false;
        }
        int var3 = class94.field1696 * 2;
        float var4 = (float) class257.field4279 / 65535.0F;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class33.field667[class30.field632][var3][var5] * 3;
            int var7 = class33.field667[class30.field632][var3 + 1][var5] * 3;
            int var8 = (class33.field667[class30.field632][var3 + 2][var5] - (class33.field667[class30.field632][var3 + 3][var5] - class33.field667[class30.field632][var3 + 2][var5])) * 3;
            int var9 = class33.field667[class30.field632][var3][var5];
            int var10 = var7 - var6;
            int var11 = var6 + var8 - (var7 * 2);
            int var12 = class33.field667[class30.field632][var3 + 2][var5] + var7 - var9 - var8;
            var2[var5] = (((float) var12 * var4 + (float) var11) * var4 + (float) var10) * var4 + (float) var9;
        }
        class116.field1988 = (int) var2[1] * -1;
        class289.field4841 = (int) var2[2] - (class263.field4407 * 128);
        if (arg0 >= -123) {
            method2167(6);
        }
        class238.field3922 = (int) var2[0] - (class196.field3152 * 128);
        int var13 = class202.field3205 * 2;
        float[] var14 = new float[3];
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class33.field667[class315.field5349][var13][var15] * 3;
            int var17 = class33.field667[class315.field5349][var13 + 1][var15] * 3;
            int var18 = (class33.field667[class315.field5349][var13 + 2][var15] + class33.field667[class315.field5349][var13 + 2][var15] - class33.field667[class315.field5349][var13 + 3][var15]) * 3;
            int var19 = class33.field667[class315.field5349][var13][var15];
            int var20 = var17 - var16;
            int var21 = var16 + var18 - (var17 * 2);
            int var22 = class33.field667[class315.field5349][var13 + 2][var15] + var17 - var19 - var18;
            var14[var15] = (((float) var22 * var4 + (float) var21) * var4 + (float) var20) * var4 + (float) var19;
        }
        float var23 = var14[0] - var2[0];
        float var24 = (var14[1] - var2[1]) * -1.0F;
        float var25 = var14[2] - var2[2];
        double var26 = Math.sqrt((double) (var23 * var23 + var25 * var25));
        class288.field4834 = (float) Math.atan2((double) var24, var26);
        class122.field2127 = -((float) Math.atan2((double) var23, (double) var25));
        class58.field1107 = (int) ((double) class288.field4834 * 325.949D) & 0x7FF;
        class181.field2949 = (int) ((double) class122.field2127 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V", line = 134)
    public static void method2168(byte arg0) {
        field5301 = null;
        if (arg0 > -102) {
            method2168((byte) 1);
        }
        field5311 = null;
        field5304 = null;
        field5308 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IJ)V", line = 153)
    public static final void method2169(int arg0, long arg1) {
        field5313++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0 != 1) {
            field5306 = 1;
        }
        for (int var3 = 0; var3 < class239.field3968; var3++) {
            if (class282.field4751[var3] == arg1) {
                class197.field3159++;
                class239.field3968--;
                for (int var4 = var3; var4 < class239.field3968; var4++) {
                    class282.field4751[var4] = class282.field4751[var4 + 1];
                    class28.field606[var4] = class28.field606[var4 + 1];
                }
                class166.field2754 = class60.field1152;
                class19.field295.method1464(98, 0);
                class19.field295.method241(arg1, 120);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZIILce;Lce;)Lw;", line = 199)
    public static final class262 method2170(boolean arg0, int arg1, int arg2, class239 arg3, class239 arg4) {
        if (arg0) {
            field5302++;
            return class272.method1881(arg3, arg2, arg1, 929) ? class83.method634(-91, arg4.method1651(arg1, arg2, -1)) : null;
        } else {
            return (class262) null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lsd;I)V", line = 227)
    public final void method2171(class26 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method226(255);
            if (var3 == 0) {
                if (arg1 != -20828) {
                    return;
                }
                field5310++;
                return;
            }
            this.method2174(var3, arg0, arg1 ^ 0xFFFF9FAF);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BI)Lrb;", line = 259)
    public static final class213 method2172(byte arg0, int arg1) {
        field5299++;
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class44.field845[var2] == null || class44.field845[var2][var3] == null) {
            boolean var4 = class255.method1799(var2, false);
            if (!var4) {
                return null;
            }
        }
        int var5 = 111 % ((arg0 + 66) / 44);
        return class44.field845[var2][var3];
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "()V", line = 300)
    public static final void method2173() {
        for (int var0 = 0; var0 < class207.field3300; var0++) {
            class193 var1 = class243.field4010[var0];
            class7.method39(var1);
            class243.field4010[var0] = null;
        }
        class207.field3300 = 0;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILsd;I)V", line = 326)
    private final void method2174(int arg0, class26 arg1, int arg2) {
        if (arg0 == 1) {
            this.field5312 = arg1.method197(-1);
            this.field5297 = arg1.method226(255);
            this.field5300 = arg1.method226(255);
        }
        field5315++;
        if (arg2 != 12555) {
            this.field5297 = 83;
        }
    }
}
