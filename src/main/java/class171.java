import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class171 extends class88 {

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Lpf;")
    public static class17 field2761 = new class17(64);

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field2763 = 0;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "Lkm;")
    public static class230 field2772 = null;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field2769 = 0;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
    public static int field2773 = 0;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "[I")
    public static int[] field2766 = new int[8];

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "[I")
    public static int[] field2765 = new int[14];

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
    public static int field2775 = 0;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "Laj;")
    public static class151 field2768;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)Lmd;")
    public static final class273 method1273(byte arg0) {
        if (arg0 <= 109) {
            method1276((byte) -33);
        }
        field2762++;
        int var1 = class43.field656[0] * class297.field4859[0];
        byte[] var2 = class289.field4758[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class185.field2952[class15.method84(255, var2[var4])];
        }
        class92 var5 = new class92(class134.field2214, class253.field4293, class49.field842[0], class73.field1283[0], class297.field4859[0], class43.field656[0], var3);
        class155.method1175(75);
        return var5;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZI)Lqj;")
    public static final class164 method1274(boolean arg0, int arg1) {
        field2767++;
        class164 var2 = (class164) class84.field1388.method99((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class67.field1120.method1149(arg1, (byte) 57, 0);
        if (arg0) {
            field2765 = null;
        }
        class164 var4 = new class164(var3);
        var4.method1231(class57.field1000, (int[]) null);
        class84.field1388.method100((long) arg1, var4, 51);
        return var4;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Laj;B)I")
    public static final int method1275(class151 arg0, byte arg1) {
        field2771++;
        int var2 = 0;
        if (arg0.method1118((byte) 67, class108.field1762)) {
            var2++;
        }
        if (arg0.method1118((byte) 84, class180.field2873)) {
            var2++;
        }
        if (arg0.method1118((byte) 35, class119.field1999)) {
            var2++;
        }
        if (arg0.method1118((byte) 45, class136.field2245)) {
            var2++;
        }
        if (arg1 < 28) {
            field2768 = null;
        }
        if (arg0.method1118((byte) 85, class67.field1117)) {
            var2++;
        }
        if (arg0.method1118((byte) 110, class113.field1932)) {
            var2++;
        }
        if (arg0.method1118((byte) 104, class133.field2192)) {
            var2++;
        }
        if (arg0.method1118((byte) 49, class202.field3245)) {
            var2++;
        }
        if (arg0.method1118((byte) 44, class312.field5027)) {
            var2++;
        }
        if (arg0.method1118((byte) 99, class100.field1584)) {
            var2++;
        }
        if (arg0.method1118((byte) 90, class170.field2752)) {
            var2++;
        }
        if (arg0.method1118((byte) 75, class126.field2107)) {
            var2++;
        }
        if (arg0.method1118((byte) 62, class249.field4207)) {
            var2++;
        }
        if (arg0.method1118((byte) 86, class101.field1610)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
    public static final void method1276(byte arg0) {
        field2770++;
        if (class313.field5036 == -1 || class21.field383 == -1) {
            return;
        }
        int var1 = ((class196.field3157 - class265.field4436) * class180.field2874 >> 16) + class265.field4436;
        float[] var2 = new float[3];
        class180.field2874 += var1;
        int var3 = class289.field4769 * 2;
        if (class180.field2874 >= 65535) {
            class180.field2874 = 65535;
            if (class279.field4639) {
                class196.field3158 = false;
            } else {
                class196.field3158 = true;
            }
            class279.field4639 = true;
        } else {
            class279.field4639 = false;
            class196.field3158 = false;
        }
        float var4 = (float) class180.field2874 / 65535.0F;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class65.field1104[class313.field5036][var3][var5] * 3;
            int var22 = class65.field1104[class313.field5036][var3 + 1][var5] * 3;
            int var23 = (class65.field1104[class313.field5036][var3 + 2][var5] + class65.field1104[class313.field5036][var3 + 2][var5] - class65.field1104[class313.field5036][var3 + 3][var5]) * 3;
            int var24 = var22 - var21;
            int var25 = var21 + var23 - (var22 * 2);
            int var26 = class65.field1104[class313.field5036][var3][var5];
            int var27 = class65.field1104[class313.field5036][var3 + 2][var5] + var22 - var23 - var26;
            var2[var5] = (((float) var27 * var4 + (float) var25) * var4 + (float) var24) * var4 + (float) var26;
        }
        class76.field1302 = (int) var2[2] - (class78.field1313 * 128);
        class107.field1758 = (int) var2[0] - (class26.field462 * 128);
        class263.field4393 = (int) var2[1] * -1;
        float[] var6 = new float[3];
        int var7 = class301.field4915 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class65.field1104[class21.field383][var7][var8] * 3;
            int var15 = class65.field1104[class21.field383][var7 + 1][var8] * 3;
            int var16 = (class65.field1104[class21.field383][var7 + 2][var8] + class65.field1104[class21.field383][var7 + 2][var8] - class65.field1104[class21.field383][var7 + 3][var8]) * 3;
            int var17 = class65.field1104[class21.field383][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 - (var15 * 2 - var16);
            int var20 = class65.field1104[class21.field383][var7 + 2][var8] - var16 - (var17 - var15);
            var6[var8] = (((float) var20 * var4 + (float) var19) * var4 + (float) var18) * var4 + (float) var17;
        }
        float var9 = (var6[1] - var2[1]) * -1.0F;
        float var10 = var6[0] - var2[0];
        float var11 = var6[2] - var2[2];
        if (arg0 > -26) {
            method1274(false, -58);
        }
        double var12 = Math.sqrt((double) (var10 * var10 + var11 * var11));
        class189.field3028 = (float) Math.atan2((double) var9, var12);
        class275.field4588 = -((float) Math.atan2((double) var10, (double) var11));
        class245.field4102 = (int) ((double) class275.field4588 * 325.949D) & 0x7FF;
        class183.field2926 = (int) ((double) class189.field3028 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;Laj;ZZ)Ljh;")
    public static final class238 method1277(String arg0, class151 arg1, boolean arg2, boolean arg3) {
        field2764++;
        int var4 = arg1.method1121(2, arg0);
        if (var4 == -1) {
            return new class238(0);
        }
        int[] var5 = arg1.method1143(-18696, var4);
        int var6 = 0;
        class238 var7 = new class238(var5.length);
        int var8 = 0;
        while (true) {
            while (var7.field4005 > var8) {
                class249 var9 = new class249(arg1.method1149(var4, (byte) 51, var5[var6++]));
                int var10 = var9.method1800(-97);
                int var11 = var9.method1821((byte) 51);
                int var12 = var9.method1802((byte) 116);
                if (!arg2 && var12 == 1) {
                    var7.field4005--;
                } else {
                    var7.field4001[var8] = var10;
                    var7.field4008[var8] = new class206();
                    var7.field4008[var8].field3327 = var11;
                    var8++;
                }
            }
            if (!arg3) {
                field2772 = null;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static void method1278(int arg0) {
        field2765 = null;
        field2761 = null;
        field2766 = null;
        if (arg0 == 26950) {
            field2768 = null;
            field2772 = null;
        }
    }
}
