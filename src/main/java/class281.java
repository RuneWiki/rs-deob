import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class281 {

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field4573 = 0;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field4577 = 0;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB)Lrg;")
    public static final class248 method1913(int arg0, byte arg1) {
        int var2 = -78 % ((arg1 + 13) / 48);
        int var3 = arg0 & 0xFFFF;
        field4572++;
        int var4 = arg0 >> 16;
        if (class208.field3315[var4] == null || class208.field3315[var4][var3] == null) {
            boolean var5 = class118.method816(var4, 0);
            if (!var5) {
                return null;
            }
        }
        return class208.field3315[var4][var3];
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)I")
    public static final int method1914(int arg0, String arg1, String arg2, int arg3) {
        field4576++;
        int var4 = arg2.length();
        int var5 = 0;
        int var6 = arg1.length();
        char var7 = 0;
        char var8 = 0;
        int var9 = 0;
        while (var4 > (var5 - var7) || var9 - var8 < var6) {
            if (var5 - var7 >= var4) {
                return -1;
            }
            if ((var9 - var8) >= var6) {
                return 1;
            }
            char var22;
            if (var7 == '\u0000') {
                var22 = arg2.charAt(var5++);
            } else {
                var22 = var7;
                boolean var23 = false;
            }
            char var24;
            if (var8 == '\u0000') {
                var24 = arg1.charAt(var9++);
            } else {
                var24 = var8;
                boolean var25 = false;
            }
            var7 = class86.method610(var22, (byte) -117);
            var8 = class86.method610(var24, (byte) 121);
            char var26 = class137.method948(arg0, 3139, var22);
            char var27 = class137.method948(arg0, 3139, var24);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class99.method707(arg0, true, var28) - class99.method707(arg0, true, var29);
                }
            }
        }
        int var10 = Math.min(var4, var6);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg0 == 2) {
                var16 = var6 - var11 - 1;
                var17 = var4 - (var11 + 1);
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg2.charAt(var17);
            char var19 = arg1.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class99.method707(arg0, true, var20) - class99.method707(arg0, true, var21);
                }
            }
        }
        int var12 = var4 - var6;
        if (var12 != 0) {
            return var12;
        }
        if (arg3 != 3) {
            field4577 = 34;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg2.charAt(var13);
            char var15 = arg1.charAt(var13);
            if (var14 != var15) {
                return class99.method707(arg0, true, var14) - class99.method707(arg0, true, var15);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lqi;Lqi;B)V")
    public static final void method1915(class137 arg0, class137 arg1, byte arg2) {
        if (arg0.field2218 != null) {
            arg0.method952((byte) 80);
        }
        arg0.field2218 = arg1.field2218;
        field4571++;
        arg0.field2216 = arg1;
        arg0.field2218.field2216 = arg0;
        arg0.field2216.field2218 = arg0;
        if (arg2 != -42) {
            field4577 = -63;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
    public static final void method1916(byte arg0) {
        field4574++;
        if (class311.field5026 == -1 || class22.field424 == -1) {
            return;
        }
        int var1 = 14 % ((arg0 - 12) / 42);
        int var2 = class112.field1717 * 2;
        float[] var3 = new float[3];
        int var4 = ((class51.field734 - class119.field1885) * class170.field2789 >> 16) + class119.field1885;
        class170.field2789 += var4;
        if (class170.field2789 < 65535) {
            class242.field3841 = false;
            class224.field3525 = false;
        } else {
            if (class242.field3841) {
                class224.field3525 = false;
            } else {
                class224.field3525 = true;
            }
            class242.field3841 = true;
            class170.field2789 = 65535;
        }
        float var5 = (float) class170.field2789 / 65535.0F;
        for (int var6 = 0; var6 < 3; var6++) {
            int var22 = (class26.field469[class311.field5026][var2 + 2][var6] + class26.field469[class311.field5026][var2 + 2][var6] - class26.field469[class311.field5026][var2 + 3][var6]) * 3;
            int var23 = class26.field469[class311.field5026][var2][var6];
            int var24 = class26.field469[class311.field5026][var2 + 1][var6] * 3;
            int var25 = class26.field469[class311.field5026][var2 + 2][var6] + var24 - var22 - var23;
            int var26 = class26.field469[class311.field5026][var2][var6] * 3;
            int var27 = var24 - var26;
            int var28 = var22 + var26 - (var24 * 2);
            var3[var6] = (((float) var25 * var5 + (float) var28) * var5 + (float) var27) * var5 + (float) var23;
        }
        class135.field2184 = (int) var3[0] - class75.field1211 * 128;
        class123.field1960 = (int) var3[2] - (class145.field2327 * 128);
        class182.field3028 = (int) var3[1] * -1;
        float[] var7 = new float[3];
        int var8 = class59.field866 * 2;
        for (int var9 = 0; var9 < 3; var9++) {
            int var15 = class26.field469[class22.field424][var8][var9] * 3;
            int var16 = class26.field469[class22.field424][var8 + 1][var9] * 3;
            int var17 = (class26.field469[class22.field424][var8 + 2][var9] + class26.field469[class22.field424][var8 + 2][var9] - class26.field469[class22.field424][var8 + 3][var9]) * 3;
            int var18 = class26.field469[class22.field424][var8][var9];
            int var19 = var15 + var17 - var16 * 2;
            int var20 = var16 - var15;
            int var21 = class26.field469[class22.field424][var8 + 2][var9] + var16 - var18 - var17;
            var7[var9] = (((float) var21 * var5 + (float) var19) * var5 + (float) var20) * var5 + (float) var18;
        }
        float var10 = var7[0] - var3[0];
        float var11 = var7[2] - var3[2];
        float var12 = (var7[1] - var3[1]) * -1.0F;
        double var13 = Math.sqrt((double) (var10 * var10 + var11 * var11));
        class25.field452 = (float) Math.atan2((double) var12, var13);
        class271.field4363 = -((float) Math.atan2((double) var10, (double) var11));
        class211.field3361 = (int) ((double) class271.field4363 * 325.949D) & 0x7FF;
        class95.field1506 = (int) ((double) class25.field452 * 325.949D) & 0x7FF;
    }
}
