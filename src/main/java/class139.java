import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class139 {

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "[I")
    public static int[] field2471 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "Lcd;")
    private static class64 field2469 = class44.method335((byte) 71, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "Lcd;")
    public static class64 field2466 = field2469;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "Lfk;")
    public static class41 field2472;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 6)
    public static void method988(int arg0) {
        if (arg0 >= 65) {
            field2471 = null;
            field2466 = null;
            field2472 = null;
            field2469 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lqm;IIILqm;)Lqg;", line = 19)
    public static final class231 method989(class222 arg0, int arg1, int arg2, int arg3, class222 arg4) {
        field2470++;
        if (arg2 != -20950) {
            field2472 = (class41) null;
        }
        return class135.method966(arg2 ^ 0xFFFFAE5C, arg3, arg1, arg4) ? class128.method930(arg0.method1580(0, arg3, arg1), (byte) -103) : null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)[B", line = 69)
    public static final synchronized byte[] method990(int arg0, int arg1) {
        field2465++;
        if (arg0 == 100 && class235.field3977 > 0) {
            byte[] var2 = class193.field3286[--class235.field3977];
            class193.field3286[class235.field3977] = null;
            return var2;
        } else if (arg0 == 5000 && class213.field3594 > 0) {
            byte[] var3 = class49.field813[--class213.field3594];
            class49.field813[class213.field3594] = null;
            return var3;
        } else {
            int var4 = -57 / ((15 - arg1) / 53);
            if (arg0 == 30000 && class289.field4948 > 0) {
                byte[] var5 = class145.field2572[--class289.field4948];
                class145.field2572[class289.field4948] = null;
                return var5;
            } else {
                return new byte[arg0];
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILja;)V", line = 112)
    public static final void method991(int arg0, class60 arg1) {
        int var2 = arg1.field1013;
        field2467++;
        if (arg0 != -1) {
            return;
        }
        if (var2 == 324) {
            if (class44.field714 == -1) {
                class267.field4605 = arg1.field1038;
                class44.field714 = arg1.field1033;
            }
            if (class244.field4209.field5280) {
                arg1.field1033 = class44.field714;
            } else {
                arg1.field1033 = class267.field4605;
            }
        } else if (var2 == 325) {
            if (class44.field714 == -1) {
                class267.field4605 = arg1.field1038;
                class44.field714 = arg1.field1033;
            }
            if (class244.field4209.field5280) {
                arg1.field1033 = class267.field4605;
            } else {
                arg1.field1033 = class44.field714;
            }
        } else if (var2 == 327) {
            arg1.field1146 = 150;
            arg1.field1009 = (int) (Math.sin((double) class29.field482 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field1067 = -1;
            arg1.field1012 = 5;
        } else if (var2 == 328) {
            if (field2472.field672 == null) {
                arg1.field1067 = 0;
            } else {
                arg1.field1146 = 150;
                arg1.field1009 = (int) (Math.sin((double) class29.field482 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field1012 = 5;
                arg1.field1067 = ((int) field2472.field672.method509(31492) << 11) + 2047;
                arg1.field1082 = field2472.field1904;
                arg1.field1026 = field2472.field1896;
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V", line = 184)
    public static final void method992(int arg0) {
        field2468++;
        if (class265.field4561 != null) {
            return;
        }
        if (arg0 <= 10) {
            method990(35, -89);
        }
        if (class263.field4511 != null) {
            return;
        }
        int var1 = class232.field3916;
        if (class101.field1828) {
            if (var1 != 1) {
                int var2 = class281.field4835;
                int var3 = class188.field3213;
                if (var2 < (class244.field4247 - 10) || class244.field4247 + class313.field5300 + 10 < var2 || var3 < class190.field3262 - 10 || var3 > class253.field4415 + class190.field3262 + 10) {
                    class101.field1828 = false;
                    class168.method1192((byte) -112, class244.field4247, class190.field3262, class313.field5300, class253.field4415);
                }
            }
            if (var1 == 1) {
                int var4 = class190.field3262;
                int var5 = class244.field4247;
                int var6 = class313.field5300;
                int var7 = class238.field4061;
                int var8 = class268.field4609;
                int var9 = -1;
                for (int var10 = 0; var10 < class220.field3736; var10++) {
                    int var11 = (class220.field3736 - var10 - 1) * 15 + var4 + 31;
                    if (var5 < var8 && var5 + var6 > var8 && var7 > (var11 - 13) && (var11 + 3) > var7) {
                        var9 = var10;
                    }
                }
                if (var9 != -1) {
                    class274.method1904(var9, -31786);
                }
                class101.field1828 = false;
                class168.method1192((byte) -112, class244.field4247, class190.field3262, class313.field5300, class253.field4415);
            }
            return;
        }
        if (var1 == 1 && class220.field3736 > 0) {
            short var12 = class289.field4934[class220.field3736 - 1];
            if (var12 == 32 || var12 == 50 || var12 == 21 || var12 == 17 || var12 == 1 || var12 == 6 || var12 == 30 || var12 == 15 || var12 == 46 || var12 == 39 || var12 == 40 || var12 == 1003) {
                int var13 = class223.field3806[class220.field3736 - 1];
                int var14 = class235.field3964[class220.field3736 - 1];
                class60 var15 = class125.method907(var14, -66);
                if (class199.method1391(78, client.method1762(var15)) || class11.method95(0, client.method1762(var15))) {
                    class138.field2459 = false;
                    class81.field1504 = 0;
                    if (class265.field4561 != null) {
                        class190.method1342(class265.field4561, 0);
                    }
                    class265.field4561 = class125.method907(var14, -80);
                    class71.field1377 = var13;
                    class273.field4690 = class238.field4061;
                    class134.field2383 = class268.field4609;
                    class190.method1342(class265.field4561, 0);
                    return;
                }
            }
        }
        if (var1 == 1 && (class146.field2591 == 1 && class220.field3736 > 2 || class298.method2083(2047, class220.field3736 - 1))) {
            var1 = 2;
        }
        if (var1 == 2 && class220.field3736 > 0 || class200.field3425 == 1) {
            class46.method343(0);
        }
        if (var1 == 1 && class220.field3736 > 0 || class200.field3425 == 2) {
            class283.method1967(-21576);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLqm;)V", line = 308)
    public static final void method993(byte arg0, class222 arg1) {
        class94.field1741 = arg1;
        field2473++;
        if (arg0 != 125) {
            field2472 = (class41) null;
        }
    }
}
