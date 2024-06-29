import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class126 extends class270 {

    @OriginalMember(owner = "client!an", name = "B", descriptor = "[B")
    public byte[] field2184;

    @OriginalMember(owner = "client!an", name = "z", descriptor = "Lnk;")
    public static class326 field2182 = new class326(62, 18);

    @OriginalMember(owner = "client!an", name = "C", descriptor = "I")
    public static int field2185 = 13156520;

    @OriginalMember(owner = "client!an", name = "y", descriptor = "F")
    public static float field2181;

    @OriginalMember(owner = "client!an", name = "A", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "(B)V", line = 3)
    public static void method986(byte arg0) {
        field2182 = null;
        if (arg0 != -36) {
            field2181 = -0.87161535F;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lch;ZI)V", line = 14)
    public static final void method987(class166 arg0, boolean arg1, int arg2) {
        field2183++;
        if (class480.field7080 >= 400) {
            return;
        }
        if (class302.field4850 != arg0) {
            String var3;
            if (arg0.field2656 == arg2) {
                boolean var4 = true;
                if (class302.field4850.field2641 != -1 && arg0.field2641 != -1) {
                    int var5 = class302.field4850.field2658 > arg0.field2658 ? class302.field4850.field2658 : arg0.field2658;
                    int var6 = class302.field4850.field2641 < arg0.field2641 ? class302.field4850.field2641 : arg0.field2641;
                    int var7 = var5 * 10 / 100 + var6 + 5;
                    int var8 = class302.field4850.field2658 - arg0.field2658;
                    if (var8 < 0) {
                        var8 = -var8;
                    }
                    if (var8 > var7) {
                        var4 = false;
                    }
                }
                String var9 = class271.field4501 == class131.field2246 ? class475.field7030.method1954(class300.field4813, -30366) : class197.field3144.method1954(class300.field4813, -30366);
                if (arg0.field2653 <= arg0.field2658) {
                    var3 = arg0.method1138(true, -124) + (var4 ? class261.method1748((byte) -112, arg0.field2658, class302.field4850.field2658) : "<col=ffffff>") + " (" + var9 + arg0.field2658 + ")";
                } else {
                    var3 = arg0.method1138(true, -126) + (var4 ? class261.method1748((byte) 27, arg0.field2658, class302.field4850.field2658) : "<col=ffffff>") + " (" + var9 + arg0.field2658 + "+" + (arg0.field2653 - arg0.field2658) + ")";
                }
            } else {
                var3 = arg0.method1138(true, -39) + " (" + class498.field7311.method1954(class300.field4813, -30366) + arg0.field2656 + ")";
            }
            if (class508.field7386) {
                if (!arg1 && (class313.field4934 & 0x8) != 0) {
                    class204.field3215++;
                    class307.method1956(46, true, -1, false, class208.field3282, -1, 0, (long) arg0.field3130, 0, class460.field6823, class15.field179 + " -> <col=ffffff>" + var3);
                }
            } else if (arg1) {
                class307.method1956(-1, false, -1, true, -1, 0, 0, 0L, 0, "<col=cccccc>" + var3, "");
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class246.field4214[var10] != null) {
                        short var11 = 0;
                        if (class271.field4501 == class251.field4283 && class246.field4214[var10].equalsIgnoreCase(class237.field4099.method1954(class300.field4813, -30366))) {
                            if (arg0.field2658 > class302.field4850.field2658) {
                                var11 = 2000;
                            }
                            if (class302.field4850.field2634 != 0 && arg0.field2634 != 0) {
                                if (class302.field4850.field2634 == arg0.field2634) {
                                    var11 = 2000;
                                } else {
                                    var11 = 0;
                                }
                            }
                        } else if (class101.field1681[var10]) {
                            var11 = 2000;
                        }
                        short var12 = (short) (class95.field1602[var10] + var11);
                        int var13 = class283.field4624[var10] == -1 ? class21.field229 : class283.field4624[var10];
                        class307.method1956(var12, true, -1, false, var13, -1, 0, (long) arg0.field3130, 0, class246.field4214[var10], "<col=ffffff>" + var3);
                        class400.field6100++;
                    }
                }
            }
            if (!arg1) {
                for (class162 var14 = (class162) class108.field1934.method2538(-3); var14 != null; var14 = (class162) class108.field1934.method2535((byte) -56)) {
                    if (var14.field2576 == 23) {
                        var14.field2572 = "<col=ffffff>" + var3;
                        return;
                    }
                }
            }
        } else if (class508.field7386 && (class313.field4934 & 0x10) != 0) {
            class307.method1956(16, true, -1, false, class208.field3282, -1, 0, 0L, 0, class460.field6823, class15.field179 + " -> <col=ffffff>" + class327.field5153.method1954(class300.field4813, arg2 - 30366));
            class86.field1473++;
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "([B)V", line = 169)
    public class126(byte[] arg0) {
        this.field2184 = arg0;
    }
}
