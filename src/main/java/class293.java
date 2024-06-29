import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class293 extends class149 {

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4648 = "glow2:";

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "[Lad;")
    public static class115[] field4649 = new class115[8];

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lte;IIII)V")
    public static final void method1961(class265 arg0, int arg1, int arg2, int arg3, int arg4) {
        field4650++;
        if (class202.field3248 >= 400) {
            return;
        }
        if (arg0.field4271 != null) {
            arg0 = arg0.method1794(-8159);
        }
        if (arg0 == null) {
            return;
        }
        int var5 = -48 / ((arg2 - 52) / 60);
        if (!arg0.field4282) {
            return;
        }
        String var6 = arg0.field4275;
        if (arg0.field4288 != 0) {
            String var7 = class189.field3026 == 1 ? class62.field865 : class173.field2800;
            var6 = var6 + class6.method37(-3, class197.field3179.field3760, arg0.field4288) + " (" + var7 + arg0.field4288 + ")";
        }
        if (class262.field4151 == 1) {
            class38.method301(arg1, class46.field556, class74.field1010 + " -> <col=ffff00>" + var6, (short) 23, class38.field466, 122, (long) arg3, arg4);
            class168.field2729++;
        } else if (class290.field4632) {
            class19 var15 = class274.field4429 == -1 ? null : class18.method129(11, class274.field4429);
            if ((class125.field2098 & 0x2) != 0 && var15 == null || arg0.method1797(var15.field222, class274.field4429, 9456) != var15.field222) {
                class278.field4460++;
                class38.method301(arg1, class117.field1995, class21.field268 + " -> <col=ffff00>" + var6, (short) 4, class17.field201, 52, (long) arg3, arg4);
            }
        } else {
            class34.field428++;
            String[] var8 = arg0.field4278;
            if (class71.field976) {
                var8 = class143.method969(var8, (byte) 85);
            }
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var8[var9] != null && (class189.field3026 != 0 || !var8[var9].equalsIgnoreCase(class144.field2333))) {
                        class112.field1929++;
                        byte var10 = 0;
                        if (var9 == 0) {
                            var10 = 49;
                        }
                        if (var9 == 1) {
                            var10 = 48;
                        }
                        int var11 = -1;
                        if (arg0.field4301 == var9) {
                            var11 = arg0.field4269;
                        }
                        if (arg0.field4305 == var9) {
                            var11 = arg0.field4258;
                        }
                        if (var9 == 2) {
                            var10 = 41;
                        }
                        if (var9 == 3) {
                            var10 = 51;
                        }
                        if (var9 == 4) {
                            var10 = 24;
                        }
                        class38.method301(arg1, var8[var9], "<col=ffff00>" + var6, var10, var11, 43, (long) arg3, arg4);
                    }
                }
            }
            if (class189.field3026 == 0 && var8 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var8[var12] != null && var8[var12].equalsIgnoreCase(class144.field2333)) {
                        class281.field4499++;
                        short var13 = 0;
                        if (arg0.field4288 > class197.field3179.field3760) {
                            var13 = 2000;
                        }
                        short var14 = 0;
                        if (var12 == 0) {
                            var14 = 49;
                        }
                        if (var12 == 1) {
                            var14 = 48;
                        }
                        if (var12 == 2) {
                            var14 = 41;
                        }
                        if (var12 == 3) {
                            var14 = 51;
                        }
                        if (var12 == 4) {
                            var14 = 24;
                        }
                        if (var14 != 0) {
                            var14 += var13;
                        }
                        class38.method301(arg1, var8[var12], "<col=ffff00>" + var6, var14, arg0.field4257, 57, (long) arg3, arg4);
                    }
                }
            }
            class38.method301(arg1, class45.field543, "<col=ffff00>" + var6, (short) 1006, class227.field3593, 79, (long) arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
    public static void method1962(int arg0) {
        if (arg0 == 51) {
            field4649 = null;
            field4648 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)I")
    public static final int method1963(byte arg0, int arg1) {
        class294 var2 = class73.method560(arg1, 2);
        field4647++;
        int var3 = var2.field4653;
        int var4 = var2.field4660;
        if (arg0 == -61) {
            int var5 = var2.field4659;
            int var6 = class197.field3180[var5 - var3];
            return class214.field3454[var4] >> var3 & var6;
        } else {
            return -72;
        }
    }
}
