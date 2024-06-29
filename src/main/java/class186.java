import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class186 {

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2923 = " more options";

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field2925 = new String[500];

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field2929 = 0;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2928 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "Lvl;")
    public static class73 field2927;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "Lvl;")
    public static class73 field2930;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
    public static void method1310(byte arg0) {
        field2927 = null;
        field2930 = null;
        field2925 = null;
        field2928 = null;
        if (arg0 < 112) {
            field2923 = null;
        }
        field2923 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)I")
    public static final int method1311(int arg0, int arg1, int arg2) {
        field2922++;
        if (arg0 > -30) {
            method1311(-29, -85, 123);
        }
        int var3 = class17.method101(arg1 + 45365, 1, 4, arg2 + 91923) - (-(class17.method101(arg1 + 10294, 1, 2, arg2 + 37821) + -128 >> 1) - (class17.method101(arg1, 1, 1, arg2) - 128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
    public static final void method1312(boolean arg0) {
        field2924++;
        while (class144.field2145 >= 2048.0F) {
            class144.field2145 -= 2048.0F;
        }
        while (class144.field2145 < 0.0F) {
            class144.field2145 += 2048.0F;
        }
        if (arg0) {
            method1313(13);
        }
        int var1 = class263.field4271 >> 7;
        int var2 = class99.field1477 >> 7;
        if (class215.field3356 < 128.0F) {
            class215.field3356 = 128.0F;
        }
        if (class215.field3356 > 383.0F) {
            class215.field3356 = 383.0F;
        }
        int var3 = class52.method351(-90, class263.field4271, class99.field1477, class148.field2204);
        int var4 = 0;
        if (var2 > 3 && var1 > 3 && var2 < 100 && var1 < 100) {
            for (int var5 = var2 - 4; var5 <= var2 + 4; var5++) {
                for (int var6 = var1 - 4; var6 <= var1 + 4; var6++) {
                    int var7 = class148.field2204;
                    if (var7 < 3 && (class74.field1121[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = ((class15.field218[var7][var5][var6] & 0xFF) * 8) + var3 - class8.field114[var7][var5][var6];
                    if (var8 > var4) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class106.field1549 < var9) {
            class106.field1549 += (var9 - class106.field1549) / 24;
        } else if (class106.field1549 > var9) {
            class106.field1549 += (var9 - class106.field1549) / 80;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public static final void method1313(int arg0) {
        field2926++;
        if (class243.field3886 == -1 || class28.field348 == -1) {
            return;
        }
        int var1 = ((class286.field4625 - field2929) * class59.field871 >> 16) + field2929;
        float[] var2 = new float[3];
        int var3 = class83.field1291 * 2;
        class59.field871 += var1;
        if (class59.field871 < 65535) {
            class303.field4823 = false;
            class254.field4146 = false;
        } else {
            class59.field871 = 65535;
            if (class254.field4146) {
                class303.field4823 = false;
            } else {
                class303.field4823 = true;
            }
            class254.field4146 = true;
        }
        float var4 = (float) class59.field871 / 65535.0F;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class66.field983[class243.field3886][var3][var5] * 3;
            int var22 = class66.field983[class243.field3886][var3][var5];
            int var23 = class66.field983[class243.field3886][var3 + 1][var5] * 3;
            int var24 = var23 - var21;
            int var25 = (class66.field983[class243.field3886][var3 + 2][var5] + class66.field983[class243.field3886][var3 + 2][var5] - class66.field983[class243.field3886][var3 - -3][var5]) * 3;
            int var26 = var21 + var25 - (var23 * 2);
            int var27 = class66.field983[class243.field3886][var3 + 2][var5] - var22 - (var25 - var23);
            var2[var5] = (((float) var27 * var4 + (float) var26) * var4 + (float) var24) * var4 + (float) var22;
        }
        class21.field279 = (int) var2[1] * -1;
        class255.field4159 = (int) var2[2] - (class5.field77 * 128);
        float[] var6 = new float[3];
        class99.field1474 = (int) var2[0] - (class113.field1653 * 128);
        int var7 = class306.field4889 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = (class66.field983[class28.field348][var7 + 2][var8] + class66.field983[class28.field348][var7 + 2][var8] - class66.field983[class28.field348][var7 + 3][var8]) * 3;
            int var15 = class66.field983[class28.field348][var7 + 1][var8] * 3;
            int var16 = class66.field983[class28.field348][var7][var8] * 3;
            int var17 = class66.field983[class28.field348][var7][var8];
            int var18 = var16 + var14 - (var15 * 2);
            int var19 = var15 + class66.field983[class28.field348][var7 - -2][var8] - var14 - var17;
            int var20 = var15 - var16;
            var6[var8] = (((float) var19 * var4 + (float) var18) * var4 + (float) var20) * var4 + (float) var17;
        }
        float var9 = var6[0] - var2[0];
        float var10 = (var6[1] - var2[arg0]) * -1.0F;
        float var11 = var6[2] - var2[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class183.field2875 = (float) Math.atan2((double) var10, var12);
        class68.field1015 = -((float) Math.atan2((double) var9, (double) var11));
        class147.field2189 = (int) ((double) class183.field2875 * 325.949D) & 0x7FF;
        class56.field817 = (int) ((double) class68.field1015 * 325.949D) & 0x7FF;
    }
}
