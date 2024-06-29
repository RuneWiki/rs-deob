import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class15 extends class292 {

    @OriginalMember(owner = "client!we", name = "F", descriptor = "Lfh;")
    public class133 field249;

    @OriginalMember(owner = "client!we", name = "H", descriptor = "[Ljava/lang/String;")
    public static String[] field251 = null;

    @OriginalMember(owner = "client!we", name = "D", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!we", name = "G", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!we", name = "I", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!we", name = "J", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V")
    public static void method149(byte arg0) {
        field251 = null;
        int var1 = -30 % ((arg0 + 70) / 38);
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(Z)V")
    public static final void method150(boolean arg0) {
        field248++;
        if (!arg0) {
            class287.field4523.method1783(0);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIII)V")
    public static final void method151(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field253++;
        class295 var5 = class250.method1673(arg1 - 3490, 8, arg2);
        var5.method1980(arg1 ^ 0x3CF566C7);
        if (arg1 != 3371) {
            method153(-83, -3);
        }
        var5.field4626 = arg4;
        var5.field4636 = arg3;
        var5.field4632 = arg0;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method152(String arg0, int arg1) throws ClassNotFoundException {
        field252++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg1 != 1) {
            return null;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(II)V")
    public static final void method153(int arg0, int arg1) {
        field250++;
        int var2 = class5.field78;
        if (arg0 == 0) {
            var2 = 1;
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class28 var20;
            if (arg0 == 0) {
                var20 = class261.field4058;
            } else {
                var20 = class41.field675[class166.field2510[var3]];
            }
            if (var20 != null && var20.method229(-18109)) {
                int var21 = var20.method226((byte) -97);
                if (arg0 == 0 || arg0 == var21) {
                    if (var21 == 1) {
                        if ((var20.field4176 & 0x7F) == 64 && (var20.field4123 & 0x7F) == 64) {
                            int var22 = var20.field4176 >> 7;
                            int var23 = var20.field4123 >> 7;
                            if (var22 >= 0 && var22 < 104 && var23 >= 0 && var23 < 104) {
                                var10002 = class295.field4643[var22][var23]++;
                            }
                        }
                    } else if (((var21 & 0x1) != 0 || (var20.field4176 & 0x7F) == 0 && (var20.field4123 & 0x7F) == 0) && ((var21 & 0x1) != 1 || (var20.field4176 & 0x7F) == 64 && (var20.field4123 & 0x7F) == 64)) {
                        int var24 = var20.field4176 - (var21 * 64) >> 7;
                        int var25 = var20.field4123 - (var21 * 64) >> 7;
                        int var26 = var20.method226((byte) -97) + var24;
                        if (var26 > 104) {
                            var26 = 104;
                        }
                        if (var24 < 0) {
                            var24 = 0;
                        }
                        int var27 = var25 + var20.method226((byte) -97);
                        if (var25 < 0) {
                            var25 = 0;
                        }
                        if (var27 > 104) {
                            var27 = 104;
                        }
                        for (int var28 = var24; var28 < var26; var28++) {
                            for (int var29 = var25; var29 < var27; var29++) {
                                var10002 = class295.field4643[var28][var29]++;
                            }
                        }
                    }
                }
            }
        }
        if (arg1 != -155) {
            return;
        }
        label217: for (int var4 = 0; var4 < var2; var4++) {
            class28 var5;
            long var6;
            if (arg0 == 0) {
                var5 = class261.field4058;
                var6 = 8791798054912L;
            } else {
                var5 = class41.field675[class166.field2510[var4]];
                var6 = (long) class166.field2510[var4] << 32;
            }
            if (var5 != null && var5.method229(-18109)) {
                int var8 = var5.method226((byte) -97);
                if (arg0 == 0 || arg0 == var8) {
                    var5.field436 = false;
                    var5.field4124 = true;
                    if ((class242.field3760 && class5.field78 > 200 || class5.field78 > 50) && arg0 != 0 && var5.field4148 == var5.method1801((byte) 121).field142) {
                        var5.field436 = true;
                    }
                    if (var8 == 1) {
                        if ((var5.field4176 & 0x7F) == 64 && (var5.field4123 & 0x7F) == 64) {
                            int var9 = var5.field4176 >> 7;
                            int var10 = var5.field4123 >> 7;
                            if (var9 < 0 || var9 >= 104 || var10 < 0 || var10 >= 104) {
                                continue;
                            }
                            if (class295.field4643[var9][var10] > 1) {
                                var10002 = class295.field4643[var9][var10]--;
                                continue;
                            }
                        }
                    } else if ((var8 & 0x1) == 0 && (var5.field4176 & 0x7F) == 0 && (var5.field4123 & 0x7F) == 0 || (var8 & 0x1) == 1 && (var5.field4176 & 0x7F) == 64 && (var5.field4123 & 0x7F) == 0) {
                        int var11 = var5.field4176 - var8 * 64 >> 7;
                        int var12 = var8 + var11;
                        if (var11 < 0) {
                            var11 = 0;
                        }
                        int var13 = var5.field4123 - (var8 * 64) >> 7;
                        if (var12 > 104) {
                            var12 = 104;
                        }
                        boolean var14 = true;
                        int var15 = var8 + var13;
                        if (var13 < 0) {
                            var13 = 0;
                        }
                        if (var15 > 104) {
                            var15 = 104;
                        }
                        for (int var16 = var11; var16 < var12; var16++) {
                            for (int var19 = var13; var19 < var15; var19++) {
                                if (class295.field4643[var16][var19] <= 1) {
                                    var14 = false;
                                    break;
                                }
                            }
                        }
                        if (var14) {
                            int var17 = var11;
                            while (true) {
                                if (var12 <= var17) {
                                    continue label217;
                                }
                                for (int var18 = var13; var18 < var15; var18++) {
                                    var10002 = class295.field4643[var17][var18]--;
                                }
                                var17++;
                            }
                        }
                    }
                    if (var5.field4138 == null || class267.field4256 < var5.field4129 || class267.field4256 >= var5.field4186) {
                        var5.field4124 = false;
                        var5.field4187 = class224.method1502((byte) -127, class274.field4318, var5.field4123, var5.field4176);
                        class111.method821(class274.field4318, var5.field4176, var5.field4123, var5.field4187, var8 * 64 + 60 - 64, var5, var5.field4159, var6, var5.field4157);
                    } else {
                        var5.field436 = false;
                        var5.field4124 = false;
                        var5.field4187 = class224.method1502((byte) -127, class274.field4318, var5.field4123, var5.field4176);
                        class94.method735(class274.field4318, var5.field4176, var5.field4123, var5.field4187, var5, var5.field4159, var6, var5.field4182, var5.field4212, var5.field4172, var5.field4202);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lfh;)V")
    public class15(class133 arg0) {
        this.field249 = arg0;
    }
}
