import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class213 {

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "[I")
    public static int[] field3579 = new int[100];

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "Lul;")
    public static class51 field3582 = new class51(30);

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
    public static int field3586 = -1;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3587 = "wave2:";

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
    public static int field3588 = 0;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public int field3578;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public int field3583;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public int field3584;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "Lcg;")
    public static class49 field3585;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V", line = 5)
    public static void method1577(int arg0) {
        field3579 = null;
        field3587 = null;
        if (arg0 != 0) {
            method1581();
        }
        field3582 = null;
        field3585 = null;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lpi;I)V", line = 19)
    public final void method1578(class336 arg0, int arg1) {
        field3580++;
        if (arg1 != 0) {
            return;
        }
        while (true) {
            int var3 = arg0.method2364(-9069);
            if (var3 == 0) {
                return;
            }
            this.method1579(arg0, var3, (byte) -106);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lpi;IB)V", line = 40)
    private final void method1579(class336 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field3584 = arg0.method2339((byte) -46);
            this.field3578 = arg0.method2364(-9069);
            this.field3583 = arg0.method2364(-9069);
        }
        int var4 = -108 / ((-arg2 - 49) / 47);
        field3581++;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "()V", line = 59)
    public static final void method1580() {
        class139.field2558 = 0;
        label194: for (int var0 = 0; var0 < class334.field5299; var0++) {
            class38 var1 = class31.field447[var0];
            if (class222.field3702 != null) {
                for (int var2 = 0; var2 < class222.field3702.length; var2++) {
                    if (class222.field3702[var2] != -1000000 && (var1.field571 <= class222.field3702[var2] || var1.field569 <= class222.field3702[var2]) && (var1.field559 <= class170.field2946[var2] || var1.field577 <= class170.field2946[var2]) && (var1.field559 >= class298.field4747[var2] || var1.field577 >= class298.field4747[var2]) && (var1.field570 <= class95.field1484[var2] || var1.field562 <= class95.field1484[var2]) && (var1.field570 >= class226.field3811[var2] || var1.field562 >= class226.field3811[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field563 == 1) {
                int var3 = var1.field575 + class259.field4197 - class51.field788;
                if (var3 >= 0 && var3 <= class259.field4197 + class259.field4197) {
                    int var4 = var1.field560 + class259.field4197 - class238.field3905;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field551 + class259.field4197 - class238.field3905;
                    if (var5 > class259.field4197 + class259.field4197) {
                        var5 = class259.field4197 + class259.field4197;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class112.field1878[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class233.field3870 - var1.field559;
                        if (var7 > 32) {
                            var1.field574 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field574 = 2;
                            var7 = -var7;
                        }
                        var1.field561 = (var1.field570 - class75.field1226 << 8) / var7;
                        var1.field576 = (var1.field562 - class75.field1226 << 8) / var7;
                        var1.field557 = (var1.field571 - class205.field3502 << 8) / var7;
                        var1.field555 = (var1.field569 - class205.field3502 << 8) / var7;
                        class159.field2809[class139.field2558++] = var1;
                    }
                }
            } else if (var1.field563 == 2) {
                int var8 = var1.field560 + class259.field4197 - class238.field3905;
                if (var8 >= 0 && var8 <= class259.field4197 + class259.field4197) {
                    int var9 = var1.field575 + class259.field4197 - class51.field788;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field558 + class259.field4197 - class51.field788;
                    if (var10 > class259.field4197 + class259.field4197) {
                        var10 = class259.field4197 + class259.field4197;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class112.field1878[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class75.field1226 - var1.field570;
                        if (var12 > 32) {
                            var1.field574 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field574 = 4;
                            var12 = -var12;
                        }
                        var1.field549 = (var1.field559 - class233.field3870 << 8) / var12;
                        var1.field564 = (var1.field577 - class233.field3870 << 8) / var12;
                        var1.field557 = (var1.field571 - class205.field3502 << 8) / var12;
                        var1.field555 = (var1.field569 - class205.field3502 << 8) / var12;
                        class159.field2809[class139.field2558++] = var1;
                    }
                }
            } else if (var1.field563 == 4) {
                int var13 = var1.field571 - class205.field3502;
                if (var13 > 128) {
                    int var14 = var1.field560 + class259.field4197 - class238.field3905;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field551 + class259.field4197 - class238.field3905;
                    if (var15 > class259.field4197 + class259.field4197) {
                        var15 = class259.field4197 + class259.field4197;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field575 + class259.field4197 - class51.field788;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field558 + class259.field4197 - class51.field788;
                        if (var17 > class259.field4197 + class259.field4197) {
                            var17 = class259.field4197 + class259.field4197;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class112.field1878[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field574 = 5;
                            var1.field549 = (var1.field559 - class233.field3870 << 8) / var13;
                            var1.field564 = (var1.field577 - class233.field3870 << 8) / var13;
                            var1.field561 = (var1.field570 - class75.field1226 << 8) / var13;
                            var1.field576 = (var1.field562 - class75.field1226 << 8) / var13;
                            class159.field2809[class139.field2558++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "()V", line = 314)
    public static final void method1581() {
        if (class266.field4287 != null) {
            for (int var0 = 0; var0 < class266.field4287.length; var0++) {
                for (int var1 = 0; var1 < class123.field2134; var1++) {
                    for (int var2 = 0; var2 < class185.field3144; var2++) {
                        class266.field4287[var0][var1][var2] = null;
                    }
                }
            }
        }
        class124.field2147 = (class337[][]) null;
        if (class78.field1258 != null) {
            for (int var3 = 0; var3 < class78.field1258.length; var3++) {
                for (int var4 = 0; var4 < class123.field2134; var4++) {
                    for (int var5 = 0; var5 < class185.field3144; var5++) {
                        class78.field1258[var3][var4][var5] = null;
                    }
                }
            }
        }
        class298.field4749 = (class337[][]) null;
        class334.field5299 = 0;
        if (class31.field447 != null) {
            for (int var6 = 0; var6 < class334.field5299; var6++) {
                class31.field447[var6] = null;
            }
        }
        if (class128.field2222 != null) {
            for (int var7 = 0; var7 < class13.field210; var7++) {
                class128.field2222[var7] = null;
            }
            class13.field210 = 0;
        }
        if (class221.field3695 != null) {
            for (int var8 = 0; var8 < class221.field3695.length; var8++) {
                class221.field3695[var8] = null;
            }
        }
    }
}
