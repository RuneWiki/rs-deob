import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class42 extends class439 {

    @OriginalMember(owner = "client!da", name = "z", descriptor = "I")
    public int field649 = -1;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "Z")
    public boolean field638 = false;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "[[Z")
    public static boolean[][] field637 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field643 = 0;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field642 = 0;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public int field641;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "I")
    public int field644;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public int field645;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "I")
    public int field646;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!da", name = "y", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!da", name = "A", descriptor = "I")
    public int field650;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "Lds;")
    public static class12 field639;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BZLps;)V")
    public static final void method323(byte arg0, boolean arg1, class62 arg2) {
        field647++;
        if (class106.field1669 >= 400) {
            return;
        }
        if (class95.field1558 != arg2) {
            String var9;
            if (arg2.field1074 == 0) {
                boolean var3 = true;
                if (class95.field1558.field1097 != -1 && arg2.field1097 != -1) {
                    int var4 = class95.field1558.field1071 <= arg2.field1071 ? arg2.field1071 : class95.field1558.field1071;
                    int var5 = class95.field1558.field1097 < arg2.field1097 ? class95.field1558.field1097 : arg2.field1097;
                    int var6 = var4 * 10 / 100 + var5 + 5;
                    int var7 = class95.field1558.field1071 - arg2.field1071;
                    if (var7 < 0) {
                        var7 = -var7;
                    }
                    if (var7 > var6) {
                        var3 = false;
                    }
                }
                String var8 = class321.field4649 == class193.field2824 ? class425.field6237.method1273(true, class370.field5530) : class288.field4148.method1273(true, class370.field5530);
                if (arg2.field1076 > arg2.field1071) {
                    var9 = arg2.method561(13762, true) + (var3 ? class424.method2589(arg2.field1071, class95.field1558.field1071, -6) : "<col=ffffff>") + " (" + var8 + arg2.field1071 + "+" + (arg2.field1076 - arg2.field1071) + ")";
                } else {
                    var9 = arg2.method561(13762, true) + (var3 ? class424.method2589(arg2.field1071, class95.field1558.field1071, -6) : "<col=ffffff>") + " (" + var8 + arg2.field1071 + ")";
                }
            } else {
                var9 = arg2.method561(13762, true) + " (" + class14.field241.method1273(true, class370.field5530) + arg2.field1074 + ")";
            }
            int var10 = -79 / ((-arg0 - 13) / 56);
            if (class301.field4287) {
                if (!arg1 && (class288.field4144 & 0x8) != 0) {
                    class287.field4138++;
                    class192.method1313(-1, class189.field2797, class318.field4553 + " -> <col=ffffff>" + var9, class200.field2920, 0, false, (long) arg2.field331, (byte) 35, 18, true, 0);
                }
            } else if (arg1) {
                class192.method1313(0, -1, "", "<col=cccccc>" + var9, 0, true, 0L, (byte) 35, -1, false, 0);
            } else {
                for (int var11 = 7; var11 >= 0; var11--) {
                    if (client.field2875[var11] != null) {
                        short var12 = 0;
                        if (class371.field5565 == class321.field4649 && client.field2875[var11].equalsIgnoreCase(class367.field5503.method1273(true, class370.field5530))) {
                            if (class95.field1558.field1071 < arg2.field1071) {
                                var12 = 2000;
                            }
                            if (class95.field1558.field1061 != 0 && arg2.field1061 != 0) {
                                if (class95.field1558.field1061 == arg2.field1061) {
                                    var12 = 2000;
                                } else {
                                    var12 = 0;
                                }
                            }
                        } else if (class458.field6762[var11]) {
                            var12 = 2000;
                        }
                        short var13 = (short) (class200.field2916[var11] + var12);
                        int var14 = class492.field7187[var11] == -1 ? class183.field2751 : class492.field7187[var11];
                        class192.method1313(-1, var14, "<col=ffffff>" + var9, client.field2875[var11], 0, false, (long) arg2.field331, (byte) 35, var13, true, 0);
                        class308.field4385++;
                    }
                }
            }
            if (!arg1) {
                for (class231 var15 = (class231) class246.field3563.method2257((byte) 91); var15 != null; var15 = (class231) class246.field3563.method2256(-110)) {
                    if (var15.field3368 == 48) {
                        var15.field3364 = "<col=ffffff>" + var9;
                        return;
                    }
                }
            }
        } else if (class301.field4287 && (class288.field4144 & 0x10) != 0) {
            class192.method1313(-1, class189.field2797, class318.field4553 + " -> <col=ffffff>" + class33.field519.method1273(true, class370.field5530), class200.field2920, 0, false, 0L, (byte) 35, 20, true, 0);
            class491.field7163++;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)Lcp;")
    public static final class507 method324(boolean arg0) {
        if (arg0) {
            field648++;
            return class291.field4170.length > class4.field69 ? class291.field4170[class4.field69++] : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(Z)V")
    public static final void method325(boolean arg0) {
        class44.field667.method2349(0);
        if (!arg0) {
            method325(true);
        }
        field640++;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
    public static void method326(int arg0) {
        if (arg0 == 0) {
            field639 = null;
            field637 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(I)V")
    public class42(int arg0) {
        this.field649 = arg0;
    }
}
