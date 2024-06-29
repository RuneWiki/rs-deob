import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class145 {

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "Lmb;")
    public static class96 field2575 = class243.method1708("Cache:", (byte) 93);

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field2577 = 0;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Lmb;")
    private static class96 field2573 = class243.method1708("glow2:", (byte) 96);

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "Lmb;")
    public static class96 field2578 = field2573;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Lmb;")
    public static class96 field2576 = field2573;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static void method1070(int arg0) {
        field2578 = null;
        if (arg0 > 3) {
            field2576 = null;
            field2573 = null;
            field2575 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLrg;)Lki;")
    public static final class267 method1071(byte arg0, class239 arg1) {
        field2570++;
        class267 var2 = new class267();
        if (arg0 != -9) {
            method1070(-118);
        }
        var2.field4650 = arg1.method1663((byte) -113);
        var2.field4653 = class11.method89(var2.field4650, false);
        return var2;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "()V")
    public static final void method1072() {
        class115.field2140 = 0;
        label191: for (int var0 = 0; var0 < class250.field4326; var0++) {
            class180 var1 = class50.field879[var0];
            if (class276.field4795 != null) {
                for (int var2 = 0; var2 < class276.field4795.length; var2++) {
                    if (class276.field4795[var2] != -1000000 && (var1.field3120 <= class276.field4795[var2] || var1.field3116 <= class276.field4795[var2]) && (var1.field3122 <= class222.field3789[var2] || var1.field3103 <= class222.field3789[var2]) && (var1.field3122 >= class159.field2753[var2] || var1.field3103 >= class159.field2753[var2]) && (var1.field3119 <= class127.field2323[var2] || var1.field3117 <= class127.field2323[var2]) && (var1.field3119 >= class60.field1036[var2] || var1.field3117 >= class60.field1036[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field3104 == 1) {
                int var3 = var1.field3109 + class233.field3992 - class14.field224;
                if (var3 >= 0 && var3 <= class233.field3992 + class233.field3992) {
                    int var4 = var1.field3099 + class233.field3992 - class6.field120;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field3105 + class233.field3992 - class6.field120;
                    if (var5 > class233.field3992 + class233.field3992) {
                        var5 = class233.field3992 + class233.field3992;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class55.field946[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class211.field3646 - var1.field3122;
                        if (var7 > 32) {
                            var1.field3123 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field3123 = 2;
                            var7 = -var7;
                        }
                        var1.field3121 = (var1.field3119 - class21.field350 << 8) / var7;
                        var1.field3107 = (var1.field3117 - class21.field350 << 8) / var7;
                        var1.field3112 = (var1.field3120 - class262.field4598 << 8) / var7;
                        var1.field3102 = (var1.field3116 - class262.field4598 << 8) / var7;
                        class214.field3681[class115.field2140++] = var1;
                    }
                }
            } else if (var1.field3104 == 2) {
                int var8 = var1.field3099 + class233.field3992 - class6.field120;
                if (var8 >= 0 && var8 <= class233.field3992 + class233.field3992) {
                    int var9 = var1.field3109 + class233.field3992 - class14.field224;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field3106 + class233.field3992 - class14.field224;
                    if (var10 > class233.field3992 + class233.field3992) {
                        var10 = class233.field3992 + class233.field3992;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class55.field946[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class21.field350 - var1.field3119;
                        if (var12 > 32) {
                            var1.field3123 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field3123 = 4;
                            var12 = -var12;
                        }
                        var1.field3111 = (var1.field3122 - class211.field3646 << 8) / var12;
                        var1.field3098 = (var1.field3103 - class211.field3646 << 8) / var12;
                        var1.field3112 = (var1.field3120 - class262.field4598 << 8) / var12;
                        var1.field3102 = (var1.field3116 - class262.field4598 << 8) / var12;
                        class214.field3681[class115.field2140++] = var1;
                    }
                }
            } else if (var1.field3104 == 4) {
                int var13 = var1.field3120 - class262.field4598;
                if (var13 > 128) {
                    int var14 = var1.field3099 + class233.field3992 - class6.field120;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field3105 + class233.field3992 - class6.field120;
                    if (var15 > class233.field3992 + class233.field3992) {
                        var15 = class233.field3992 + class233.field3992;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field3109 + class233.field3992 - class14.field224;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field3106 + class233.field3992 - class14.field224;
                        if (var17 > class233.field3992 + class233.field3992) {
                            var17 = class233.field3992 + class233.field3992;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class55.field946[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field3123 = 5;
                            var1.field3111 = (var1.field3122 - class211.field3646 << 8) / var13;
                            var1.field3098 = (var1.field3103 - class211.field3646 << 8) / var13;
                            var1.field3121 = (var1.field3119 - class21.field350 << 8) / var13;
                            var1.field3107 = (var1.field3117 - class21.field350 << 8) / var13;
                            class214.field3681[class115.field2140++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lff;II)Lka;")
    public static final class174 method1073(class3 arg0, int arg1, int arg2) {
        field2572++;
        if (class153.method1119(arg0, arg2, 4)) {
            if (arg1 != 1) {
                field2577 = 46;
            }
            return class9.method69((byte) -123);
        } else {
            return null;
        }
    }
}
