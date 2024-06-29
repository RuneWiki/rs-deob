import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class165 {

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field2470 = 3353893;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field2473 = 50;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2475 = "Loaded textures";

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field2471 = -1;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "[I")
    public static int[] field2480 = new int[5];

    @OriginalMember(owner = "client!df", name = "h", descriptor = "Lpg;")
    public static class320 field2477 = new class320(5);

    @OriginalMember(owner = "client!df", name = "c", descriptor = "F")
    public static float field2472;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIII)V", line = 18)
    public static final void method1115(int arg0, int arg1, int arg2, int arg3) {
        class142 var4 = class256.field4013[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class228 var5 = var4.field2194;
        if (var5 != null) {
            var5.field3633 = var5.field3633 * arg3 / 16;
            var5.field3622 = var5.field3622 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V", line = 44)
    public static void method1116(boolean arg0) {
        if (!arg0) {
            method1118((byte) -15);
        }
        field2480 = null;
        field2475 = null;
        field2477 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V", line = 56)
    public static final void method1117(int arg0, int arg1, int arg2) {
        field2478++;
        class338 var3 = class195.method1391(1, (byte) -92, arg2);
        if (arg0 != -22061) {
            method1118((byte) 21);
        }
        var3.method2352((byte) 126);
        var3.field5279 = arg1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V", line = 80)
    public static final void method1118(byte arg0) {
        field2474++;
        if (!class94.field1516 || class146.field2236 || arg0 <= 117) {
            return;
        }
        class142[][][] var1 = class256.field4013;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class142[][] var3 = var1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class142 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field2196 != null && var6.field2196.field4297 instanceof class21) {
                            class21 var7 = (class21) var6.field2196.field4297;
                            if ((var6.field2196.field4300 & Long.MIN_VALUE) == 0L) {
                                var7.method182(false, true, true, true, false, true, true);
                            } else {
                                var7.method182(true, true, true, true, true, true, true);
                            }
                        }
                        if (var6.field2194 != null) {
                            if (var6.field2194.field3623 instanceof class21) {
                                class21 var8 = (class21) var6.field2194.field3623;
                                if ((Long.MIN_VALUE & var6.field2194.field3631) == 0L) {
                                    var8.method182(false, true, true, true, false, true, true);
                                } else {
                                    var8.method182(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field2194.field3628 instanceof class21) {
                                class21 var9 = (class21) var6.field2194.field3628;
                                if ((var6.field2194.field3631 & Long.MIN_VALUE) == 0L) {
                                    var9.method182(false, true, true, true, false, true, true);
                                } else {
                                    var9.method182(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        if (var6.field2213 != null) {
                            if (var6.field2213.field1598 instanceof class21) {
                                class21 var10 = (class21) var6.field2213.field1598;
                                if ((Long.MIN_VALUE & var6.field2213.field1602) == 0L) {
                                    var10.method182(false, true, true, true, false, true, true);
                                } else {
                                    var10.method182(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field2213.field1600 instanceof class21) {
                                class21 var11 = (class21) var6.field2213.field1600;
                                if ((var6.field2213.field1602 & Long.MIN_VALUE) == 0L) {
                                    var11.method182(false, true, true, true, false, true, true);
                                } else {
                                    var11.method182(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        for (int var12 = 0; var12 < var6.field2204; var12++) {
                            if (var6.field2197[var12].field406 instanceof class21) {
                                class21 var13 = (class21) var6.field2197[var12].field406;
                                if ((var6.field2197[var12].field402 & Long.MIN_VALUE) == 0L) {
                                    var13.method182(false, true, true, true, false, true, true);
                                } else {
                                    var13.method182(true, true, true, true, true, true, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        class146.field2236 = true;
    }
}
