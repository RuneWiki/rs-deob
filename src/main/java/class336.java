import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class336 implements class215 {

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field4726 = -1;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "([IJBLjn;)Ljava/lang/String;")
    public final String method1267(int[] arg0, long arg1, byte arg2, class324 arg3) {
        field4725++;
        int var6 = -47 / ((-arg2 - 71) / 51);
        if (class470.field6529 == arg3) {
            class537 var7 = class189.field2579.method3264((byte) 38, arg0[0]);
            return var7.method3175((byte) 124, (int) arg1);
        } else if (class420.field5913 == arg3 || class376.field5289 == arg3) {
            class671 var8 = class291.field4179.method1313((int) arg1, true);
            return var8.field9281;
        } else if (class234.field3472 == arg3 || class364.field5185 == arg3 || class152.field2088 == arg3) {
            return class189.field2579.method3264((byte) 38, arg0[0]).method3175((byte) 85, (int) arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Luq;Z[[[BIB)Z")
    public static final boolean method2136(class318 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class369.field5216) {
            return false;
        }
        int var5 = arg0.field4410 >> class371.field5241;
        int var6 = var5;
        int var7 = arg0.field4418 >> class371.field5241;
        int var8 = var7;
        if (arg0 instanceof class395) {
            var6 = ((class395) arg0).field5683;
            var8 = ((class395) arg0).field5679;
            var5 = ((class395) arg0).field5680;
            var7 = ((class395) arg0).field5673;
        }
        for (int var9 = var5; var9 <= var6; var9++) {
            for (int var10 = var7; var10 <= var8; var10++) {
                if (arg0.field4419 < class370.field5229 && var9 >= class334.field4716 && var9 < class273.field3964 && var10 >= class621.field8318 && var10 < class719.field10004) {
                    if ((arg2 == null || arg0.field4408 < arg3 || arg2[arg0.field4408][var9][var10] != arg4) && arg0.method628(102) && !arg0.method627(class441.field6132, (byte) 122)) {
                        return false;
                    }
                    if (!arg1 && var9 >= class103.field1410 - 16 && var9 <= class103.field1410 + 16 && var10 >= class307.field4314 - 16 && var10 <= class307.field4314 + 16) {
                        if (class520.field7248) {
                            class690.field9610[class491.field6909++].method3955((byte) 118, arg0);
                            class491.field6909 %= class515.field7130;
                        } else {
                            arg0.method659(false, class441.field6132);
                        }
                    }
                }
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static final String method2137(byte arg0, int arg1) {
        field4727++;
        if (arg0 != -55) {
            method2136(null, false, null, 34, (byte) 95);
        }
        return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V")
    public static final void method2138(byte arg0) {
        field4728++;
        int var1 = class395.field5684 * 512 + 256;
        int var2 = class518.field7232 * 512 + 256;
        int var3 = class737.method4102((byte) 19, var1, var2, class96.field1331) - class671.field9272;
        if (class490.field6891 >= 100) {
            class671.field9282 = class395.field5684 * 512 + 256;
            class123.field1680 = class518.field7232 * 512 + 256;
            class206.field2702 = class737.method4102((byte) 19, class671.field9282, class123.field1680, class96.field1331) - class671.field9272;
        } else {
            if (var1 > class671.field9282) {
                class671.field9282 += (var1 - class671.field9282) * class490.field6891 / 1000 + class610.field8214;
                if (var1 < class671.field9282) {
                    class671.field9282 = var1;
                }
            }
            if (var3 > class206.field2702) {
                class206.field2702 += class610.field8214 + ((var3 - class206.field2702) * class490.field6891 / 1000);
                if (class206.field2702 > var3) {
                    class206.field2702 = var3;
                }
            }
            if (class671.field9282 > var1) {
                class671.field9282 -= (class671.field9282 - var1) * class490.field6891 / 1000 + class610.field8214;
                if (var1 > class671.field9282) {
                    class671.field9282 = var1;
                }
            }
            if (class123.field1680 < var2) {
                class123.field1680 += (var2 - class123.field1680) * class490.field6891 / 1000 + class610.field8214;
                if (var2 < class123.field1680) {
                    class123.field1680 = var2;
                }
            }
            if (var3 < class206.field2702) {
                class206.field2702 -= (class206.field2702 - var3) * class490.field6891 / 1000 + class610.field8214;
                if (var3 > class206.field2702) {
                    class206.field2702 = var3;
                }
            }
            if (var2 < class123.field1680) {
                class123.field1680 -= class610.field8214 + ((class123.field1680 - var2) * class490.field6891 / 1000);
                if (class123.field1680 < var2) {
                    class123.field1680 = var2;
                }
            }
        }
        int var4 = class409.field5827 * 512 + 256;
        int var5 = class49.field734 * 512 + 256;
        int var6 = class737.method4102((byte) 19, var4, var5, class96.field1331) - class724.field10048;
        int var7 = var4 - class671.field9282;
        int var8 = var6 - class206.field2702;
        int var9 = var5 - class123.field1680;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + (var9 * var9)));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (class25.field318 < var11) {
            class25.field318 += (var11 - class25.field318 >> 3) * class355.field5109 / 1000 + class204.field2693 << 3;
            if (var11 < class25.field318) {
                class25.field318 = var11;
            }
        }
        if (class25.field318 > var11) {
            class25.field318 -= (class25.field318 - var11 >> 3) * class355.field5109 / 1000 + class204.field2693 << 3;
            if (class25.field318 < var11) {
                class25.field318 = var11;
            }
        }
        int var13 = var12 - class230.field3118;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class230.field3118 += class355.field5109 * var14 / 1000 + class204.field2693 << 3;
            class230.field3118 &= 0x3FFF;
        }
        if (var14 < 0) {
            class230.field3118 -= -var14 * class355.field5109 / 1000 + class204.field2693 << 3;
            class230.field3118 &= 0x3FFF;
        }
        int var15 = var12 - class230.field3118;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class230.field3118 = var12;
        }
        class118.field1556 = 0;
        if (arg0 < 108) {
            field4726 = 19;
        }
    }
}
