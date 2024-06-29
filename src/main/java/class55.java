import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class55 extends class178 {

    @OriginalMember(owner = "client!ej", name = "U", descriptor = "Loc;")
    private class151 field1115 = class94.field1755;

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "Loc;")
    public static class151 field1107 = class137.method873(2, "null");

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "Loc;")
    private static class151 field1105 = class137.method873(2, "Loading sprites )2 ");

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "Loc;")
    private static class151 field1108 = class137.method873(2, "Loaded config");

    @OriginalMember(owner = "client!ej", name = "T", descriptor = "Loc;")
    public static class151 field1114 = class137.method873(2, "oder ung-Ultiges Passwort)3");

    @OriginalMember(owner = "client!ej", name = "V", descriptor = "Loc;")
    public static class151 field1116 = field1105;

    @OriginalMember(owner = "client!ej", name = "Y", descriptor = "Loc;")
    public static class151 field1119 = field1108;

    @OriginalMember(owner = "client!ej", name = "Z", descriptor = "Loc;")
    public static class151 field1120 = class137.method873(2, "Standort");

    @OriginalMember(owner = "client!ej", name = "bb", descriptor = "Loc;")
    public static class151 field1122 = null;

    @OriginalMember(owner = "client!ej", name = "cb", descriptor = "I")
    public static int field1123 = 0;

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "I")
    public int field1111;

    @OriginalMember(owner = "client!ej", name = "R", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!ej", name = "S", descriptor = "I")
    private int field1113;

    @OriginalMember(owner = "client!ej", name = "W", descriptor = "I")
    public int field1117;

    @OriginalMember(owner = "client!ej", name = "X", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!ej", name = "db", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!ej", name = "eb", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!ej", name = "ab", descriptor = "Lwh;")
    private class236 field1121;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BILwa;)V")
    private final void method375(byte arg0, int arg1, class229 arg2) {
        if (arg1 == 1) {
            this.field1117 = arg2.method1475(255);
        } else if (arg1 == 2) {
            this.field1111 = arg2.method1475(255);
        } else if (arg1 == 3) {
            this.field1115 = arg2.method1443((byte) -74);
        } else if (arg1 == 4) {
            this.field1113 = arg2.method1437(425528536);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg2.method1490((byte) 73);
            this.field1121 = new class236(class54.method373(var4, 124));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1437(425528536);
                class106 var7;
                if (arg1 == 5) {
                    var7 = new class79(arg2.method1443((byte) -115));
                } else {
                    var7 = new class170(arg2.method1437(425528536));
                }
                this.field1121.method1536((byte) 100, var7, (long) var6);
            }
        }
        if (arg0 < 38) {
            this.method377(null, true);
        }
        field1110++;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BI)Loc;")
    public final class151 method376(byte arg0, int arg1) {
        field1118++;
        if (this.field1121 == null) {
            return this.field1115;
        }
        if (arg0 != 126) {
            this.field1113 = 69;
        }
        class79 var3 = (class79) this.field1121.method1538((long) arg1, (byte) 127);
        return var3 == null ? this.field1115 : var3.field1525;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lwa;Z)V")
    public final void method377(class229 arg0, boolean arg1) {
        field1106++;
        while (true) {
            int var3 = arg0.method1475(255);
            if (var3 == 0) {
                if (arg1) {
                    this.method376((byte) 34, -99);
                    return;
                } else {
                    return;
                }
            }
            this.method375((byte) 40, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(B)V")
    public static void method378(byte arg0) {
        field1119 = null;
        field1120 = null;
        if (arg0 >= -40) {
            field1107 = null;
        }
        field1105 = null;
        field1114 = null;
        field1107 = null;
        field1122 = null;
        field1116 = null;
        field1108 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIZI)V")
    public static final void method379(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field1125++;
        if (arg3) {
            field1122 = null;
        }
        for (class22 var5 = (class22) class152.field2757.method1358(-29726); var5 != null; var5 = (class22) class152.field2757.method1360(true)) {
            if (var5.field496 != -1 || var5.field486 != null) {
                int var6 = 0;
                if (var5.field502 < arg0) {
                    var6 += arg0 - var5.field502;
                } else if (var5.field482 > arg0) {
                    var6 += var5.field482 - arg0;
                }
                if (var5.field484 < arg2) {
                    var6 += arg2 - var5.field484;
                } else if (var5.field491 > arg2) {
                    var6 += var5.field491 - arg2;
                }
                if (var6 - 64 > var5.field475 || class57.field1139 == 0 || var5.field478 != arg1) {
                    if (var5.field483 != null) {
                        class109.field1937.method757(var5.field483);
                        var5.field483 = null;
                    }
                    if (var5.field498 != null) {
                        class109.field1937.method757(var5.field498);
                        var5.field498 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field475 - var6) * class57.field1139 / var5.field475;
                    if (var5.field483 != null) {
                        var5.field483.method836(var7);
                    } else if (var5.field496 >= 0) {
                        class199 var8 = class199.method1246(class56.field1126, var5.field496, 0);
                        if (var8 != null) {
                            class135 var9 = var8.method1247().method827(class195.field3480);
                            class136 var10 = class136.method847(var9, 100, var7);
                            var10.method828(-1);
                            class109.field1937.method752(var10);
                            var5.field483 = var10;
                        }
                    }
                    if (var5.field498 != null) {
                        var5.field498.method836(var7);
                        if (!var5.field498.method637((byte) 118)) {
                            var5.field498 = null;
                        }
                    } else if (var5.field486 != null && (var5.field500 -= arg4) <= 0) {
                        int var11 = (int) ((double) var5.field486.length * Math.random());
                        class199 var12 = class199.method1246(class56.field1126, var5.field486[var11], 0);
                        if (var12 != null) {
                            class135 var13 = var12.method1247().method827(class195.field3480);
                            class136 var14 = class136.method847(var13, 100, var7);
                            var14.method828(0);
                            class109.field1937.method752(var14);
                            var5.field498 = var14;
                            var5.field500 = (int) ((double) (var5.field499 - var5.field494) * Math.random()) + var5.field494;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II[III)V")
    public static final void method380(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        arg4--;
        if (arg1 < 102) {
            return;
        }
        field1124++;
        int var6 = arg3 - 1;
        int var5 = var6 - 7;
        while (var5 > arg4) {
            int var7 = arg4 + 1;
            arg2[var7] = arg0;
            int var8 = var7 + 1;
            arg2[var8] = arg0;
            int var9 = var8 + 1;
            arg2[var9] = arg0;
            int var10 = var9 + 1;
            arg2[var10] = arg0;
            int var11 = var10 + 1;
            arg2[var11] = arg0;
            int var12 = var11 + 1;
            arg2[var12] = arg0;
            int var13 = var12 + 1;
            arg2[var13] = arg0;
            arg4 = var13 + 1;
            arg2[arg4] = arg0;
        }
        while (arg4 < var6) {
            arg4++;
            arg2[arg4] = arg0;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZI)I")
    public final int method381(boolean arg0, int arg1) {
        field1112++;
        if (this.field1121 == null) {
            return this.field1113;
        }
        if (arg0) {
            this.method381(false, -64);
        }
        class170 var3 = (class170) this.field1121.method1538((long) arg1, (byte) 127);
        return var3 == null ? this.field1113 : var3.field3098;
    }
}
