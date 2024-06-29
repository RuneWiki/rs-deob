import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class373 {

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
    public static int field5582 = 0;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "Lib;")
    public static class105 field5580 = new class105(128);

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "Lvp;")
    public static class123 field5587 = new class123(57, 4);

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "I")
    public static int field5583;

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "Ltn;")
    public static class58 field5588;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILtn;)V")
    public static final void method2384(int arg0, class58 arg1) {
        if (arg0 != -37) {
            return;
        }
        field5585++;
        if (!class301.field4287) {
            return;
        }
        if (arg1.field968 != null) {
            class58 var2 = class155.method1123(class153.field2343, class114.field1817, (byte) -85);
            if (var2 != null) {
                class519 var3 = new class519();
                var3.field7627 = arg1.field968;
                var3.field7622 = var2;
                var3.field7625 = arg1;
                class150.method1086(var3);
            }
        }
        class314.field4489++;
        class114.method841(false, class483.field7086);
        class86.field1436.method1892(397825512, arg1.field955);
        class86.field1436.method1875(class153.field2343, (byte) -91);
        class86.field1436.method1865(class135.field2070, 0);
        class86.field1436.method1919(class114.field1817, -75);
        class86.field1436.method1865(arg1.field840, 0);
        class86.field1436.method1875(arg1.field946, (byte) -91);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lhh;Lhh;I)V")
    public static final void method2385(class84 arg0, class84 arg1, int arg2) {
        class310.field4443 = arg0;
        if (arg2 != 2082) {
            field5588 = null;
        }
        class54.field801 = arg1;
        field5581++;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
    public static final void method2386(int arg0) {
        field5584++;
        if (class258.field3726 == -1 || class98.field1598 == -1) {
            return;
        }
        int var1 = ((class222.field3220 - class439.field6407) * class172.field2600 >> 16) + class439.field6407;
        class172.field2600 += var1;
        if (class172.field2600 >= 65535) {
            if (class355.field5378) {
                class261.field3763 = false;
            } else {
                class261.field3763 = true;
            }
            class172.field2600 = 65535;
            class355.field5378 = true;
        } else {
            class355.field5378 = false;
            class261.field3763 = false;
        }
        float var2 = (float) class172.field2600 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class214.field3088 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class173.field2650[class258.field3726][var4][var5] * 3;
            int var22 = class173.field2650[class258.field3726][var4 + 1][var5] * 3;
            int var23 = (class173.field2650[class258.field3726][var4 + 2][var5] + class173.field2650[class258.field3726][var4 + 2][var5] - class173.field2650[class258.field3726][var4 + 3][var5]) * 3;
            int var24 = class173.field2650[class258.field3726][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - var22 * 2;
            int var27 = class173.field2650[class258.field3726][var4 + 2][var5] + var22 - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class207.field2983 = (int) var3[1] * -1;
        class430.field6262 = (int) var3[0] - (class483.field7082 * 128);
        class291.field4175 = (int) var3[2] - (class465.field6840 * 128);
        float[] var6 = new float[3];
        int var7 = class372.field5578 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class173.field2650[class98.field1598][var7][var8] * 3;
            int var15 = class173.field2650[class98.field1598][var7 + 1][var8] * 3;
            int var16 = (class173.field2650[class98.field1598][var7 + 2][var8] + class173.field2650[class98.field1598][var7 + 2][var8] - class173.field2650[class98.field1598][var7 + 3][var8]) * 3;
            int var17 = class173.field2650[class98.field1598][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = class173.field2650[class98.field1598][var7 + 2][var8] + var15 - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        if (arg0 <= -92) {
            class310.field4446 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
            class320.field4578 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
            class103.field1642 = class173.field2650[class258.field3726][var4][3] + ((class173.field2650[class258.field3726][var4 + 2][3] - class173.field2650[class258.field3726][var4][3]) * class172.field2600 >> 16);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZIBLjava/lang/String;)Z")
    public static final boolean method2387(boolean arg0, int arg1, byte arg2, String arg3) {
        field5583++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg3.length();
        int var8 = 0;
        if (arg2 != 50) {
            return true;
        }
        while (var7 > var8) {
            label80: {
                char var9 = arg3.charAt(var8);
                if (var8 == 0) {
                    if (var9 == '-') {
                        var4 = true;
                        break label80;
                    }
                    if (var9 == '+' && arg0) {
                        break label80;
                    }
                }
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else if (var9 >= 'a' && var9 <= 'z') {
                    var11 = var9 - 'W';
                } else {
                    return false;
                }
                if (var11 >= arg1) {
                    return false;
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg1 * var6 + var11;
                if ((var10 / arg1) != var6) {
                    return false;
                }
                var5 = true;
                var6 = var10;
            }
            var8++;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)V")
    public static void method2388(boolean arg0) {
        field5587 = null;
        if (!arg0) {
            field5588 = null;
            field5580 = null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(ILtn;)Z")
    public static final boolean method2389(int arg0, class58 arg1) {
        field5586++;
        if (arg0 != -28460) {
            return false;
        } else if (class424.field6225 == arg1.field892) {
            class134.field2068 = 250;
            return true;
        } else {
            return false;
        }
    }
}
