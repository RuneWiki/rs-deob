import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class456 {

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public int field6743;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "Lvp;")
    public static class123 field6741;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field6739;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field6742;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "Lje;")
    public static class275 field6744;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public static void method2740(int arg0) {
        field6741 = null;
        field6744 = null;
        if (arg0 < 45) {
            field6741 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)V")
    public static final void method2741(int arg0, int arg1, int arg2) {
        class165 var3 = class36.field545[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field2480 != null) {
            var3.field2480 = null;
        }
        if (var3.field2484 != null) {
            var3.field2484 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)I")
    public final int method2742(int arg0) {
        if (arg0 != -25320) {
            this.field6743 = 41;
        }
        field6740++;
        return this.field6743;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZIZLs;)V")
    public static final void method2743(boolean arg0, int arg1, boolean arg2, class183 arg3) {
        field6742++;
        if (arg1 < 63) {
            method2740(79);
        }
        int var4 = arg3.field2753;
        int var5 = (int) arg3.field6399;
        arg3.method2663(-112);
        if (arg0) {
            class143.method1036(var4, 0);
        }
        class62.method549(65535, var4);
        class58 var6 = class421.method2578(-4179, var5);
        if (var6 != null) {
            class139.method1027(var6, false);
        }
        class454.method2734(-15485);
        if (!arg2 && class341.field5207 != -1) {
            class270.method1734(class341.field5207, 1, -66);
        }
        class422 var7 = new class422(class466.field6844);
        for (class183 var8 = (class183) var7.method2584(1384084872); var8 != null; var8 = (class183) var7.method2585(-1)) {
            if (!var8.method2664(91)) {
                var8 = (class183) var7.method2584(1384084872);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field2750 == 3) {
                int var9 = (int) var8.field6399;
                if (var9 >>> 16 == var4) {
                    method2743(true, 67, arg2, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class456(String arg0, int arg1) {
        this.field6743 = arg1;
    }

    @OriginalMember(owner = "client!og", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6738++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZI)V")
    public static final void method2744(int arg0, boolean arg1, int arg2) {
        if (class2.field22 > class2.field29) {
            class2.field29 = (float) ((double) class2.field29 / 30.0D + (double) class2.field29);
            if (class2.field22 < class2.field29) {
                class2.field29 = class2.field22;
            }
            class182.method1276((byte) -103);
            class2.field28 = (int) class2.field29 >> 1;
            class2.field21 = class300.method1855(32705, class2.field28);
        } else if (class2.field29 > class2.field22) {
            class2.field29 = (float) ((double) class2.field29 - (double) class2.field29 / 30.0D);
            if (class2.field29 < class2.field22) {
                class2.field29 = class2.field22;
            }
            class182.method1276((byte) -62);
            class2.field28 = (int) class2.field29 >> 1;
            class2.field21 = class300.method1855(32705, class2.field28);
        }
        if (!arg1) {
            method2744(-87, false, -9);
        }
        field6739++;
        if (class504.field7389 != -1 && class511.field7539 != -1) {
            int var3 = class504.field7389 - class25.field439;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class511.field7539 - class33.field522;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class25.field439 += var3;
            if (var3 == 0 && var4 == 0) {
                class504.field7389 = -1;
                class511.field7539 = -1;
            }
            class33.field522 += var4;
            class182.method1276((byte) -46);
        }
        if (class410.field6034 <= 0) {
            class36.field540 = -1;
            class25.field441 = -1;
        } else {
            class421.field6199--;
            if (class421.field6199 == 0) {
                class410.field6034--;
                class421.field6199 = 100;
            }
        }
        if (!class225.field3274 || class282.field4093 == null) {
            return;
        }
        for (class469 var5 = (class469) class282.field4093.method2257((byte) 124); var5 != null; var5 = (class469) class282.field4093.method2256(43)) {
            class210 var6 = class2.field15.method1835(36, var5.field6894.field649);
            if (var5.method2801(arg2, arg0, -111)) {
                if (var6.field3028 != null) {
                    if (var6.field3028[4] != null) {
                        class192.method1313(-1, -1, var6.field3011, var6.field3028[4], var6.field3016, false, (long) var5.field6894.field649, (byte) 35, 1011, true, 0);
                    }
                    if (var6.field3028[3] != null) {
                        class192.method1313(-1, -1, var6.field3011, var6.field3028[3], var6.field3016, false, (long) var5.field6894.field649, (byte) 35, 1007, true, 0);
                    }
                    if (var6.field3028[2] != null) {
                        class192.method1313(-1, -1, var6.field3011, var6.field3028[2], var6.field3016, false, (long) var5.field6894.field649, (byte) 35, 1009, true, 0);
                    }
                    if (var6.field3028[1] != null) {
                        class192.method1313(-1, -1, var6.field3011, var6.field3028[1], var6.field3016, false, (long) var5.field6894.field649, (byte) 35, 1003, true, 0);
                    }
                    if (var6.field3028[0] != null) {
                        class192.method1313(-1, -1, var6.field3011, var6.field3028[0], var6.field3016, false, (long) var5.field6894.field649, (byte) 35, 1012, true, 0);
                    }
                }
                if (!var5.field6894.field638) {
                    var5.field6894.field638 = true;
                    class150.method1083(class398.field5855, var5.field6894.field649, var6.field3016);
                }
                if (var5.field6894.field638) {
                    class150.method1083(class490.field7148, var5.field6894.field649, var6.field3016);
                }
            } else if (var5.field6894.field638) {
                var5.field6894.field638 = false;
                class150.method1083(class325.field4979, var5.field6894.field649, var6.field3016);
            }
        }
    }

    static {
        new class180("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        field6741 = new class123(58, -1);
    }
}
