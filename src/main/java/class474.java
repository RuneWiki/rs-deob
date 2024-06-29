import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class474 {

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "[I")
    public static int[] field6655 = new int[32];

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    public static int field6656;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
    public static int field6657;

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "I")
    public static int field6661;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "Lu;")
    public static class202 field6658;

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "Lg;")
    public static class470 field6659;

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "Lg;")
    public static class470 field6660;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lqo;IZ)V", line = 3)
    public static final void method2804(class137 arg0, int arg1, boolean arg2) {
        field6654++;
        if (class223.field3099 >= 400) {
            return;
        }
        class476 var3 = arg0.field1643;
        if (var3.field6694 != null) {
            var3 = var3.method2812(class75.field909, true);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field6740) {
            return;
        }
        String var4 = var3.field6713;
        if (var3.field6712 != 0) {
            String var5 = class289.field4317 == class262.field3772 ? class291.field4326.method205((byte) 124, class68.field849) : class349.field5016.method205((byte) 121, class68.field849);
            var4 = var4 + class62.method319(class19.field258.field2726, var3.field6712, 9) + " (" + var5 + var3.field6712 + ")";
        }
        if (arg1 >= -88) {
            return;
        }
        if (!class293.field4359) {
            if (!arg2) {
                String[] var7 = var3.field6701;
                if (class52.field681) {
                    var7 = class401.method2396((byte) -43, var7);
                }
                if (var7 != null) {
                    for (int var8 = 4; var8 >= 0; var8--) {
                        if (var7[var8] != null && (class475.field6675 != class289.field4317 || !var7[var8].equalsIgnoreCase(class347.field4951.method205((byte) 114, class68.field849)))) {
                            byte var9 = 0;
                            if (var8 == 0) {
                                var9 = 46;
                            }
                            int var10 = class66.field835;
                            if (var8 == 1) {
                                var9 = 48;
                            }
                            if (var8 == 2) {
                                var9 = 30;
                            }
                            if (var8 == 3) {
                                var9 = 5;
                            }
                            if (var8 == 4) {
                                var9 = 25;
                            }
                            if (var3.field6687 == var8) {
                                var10 = var3.field6681;
                            }
                            if (var3.field6720 == var8) {
                                var10 = var3.field6696;
                            }
                            client.method1672((long) arg0.field2457, 0, var9, -1, var10, var7[var8], 0, false, "<col=ffff00>" + var4, 7520, true);
                            class208.field2871++;
                        }
                    }
                }
                if (class475.field6675 == class289.field4317 && var7 != null) {
                    for (int var11 = 4; var11 >= 0; var11--) {
                        if (var7[var11] != null && var7[var11].equalsIgnoreCase(class347.field4951.method205((byte) 121, class68.field849))) {
                            short var12 = 0;
                            if (var3.field6712 > class19.field258.field2726) {
                                var12 = 2000;
                            }
                            short var13 = 0;
                            if (var11 == 0) {
                                var13 = 46;
                            }
                            if (var11 == 1) {
                                var13 = 48;
                            }
                            if (var11 == 2) {
                                var13 = 30;
                            }
                            if (var11 == 3) {
                                var13 = 5;
                            }
                            if (var11 == 4) {
                                var13 = 25;
                            }
                            if (var13 != 0) {
                                var13 += var12;
                            }
                            client.method1672((long) arg0.field2457, 0, var13, -1, var3.field6686, var7[var11], 0, false, "<col=ffff00>" + var4, 7520, true);
                            class201.field2787++;
                        }
                    }
                }
            }
            class129.field1590++;
            client.method1672((long) arg0.field2457, 0, 1008, -1, class351.field5044, class367.field5247.method205((byte) 118, class68.field849), 0, arg2, "<col=ffff00>" + var4, 7520, true);
        } else if (!arg2) {
            class307 var6 = class206.field2828 == -1 ? null : class422.field6084.method2076((byte) -122, class206.field2828);
            if ((class284.field4135 & 0x2) != 0) {
                if (var6 == null || var3.method2810(class206.field2828, var6.field4519, -120) != var6.field4519) {
                    class189.field2579++;
                    client.method1672((long) arg0.field2457, 0, 6, -1, class435.field6264, class390.field5570, 0, false, class126.field1543 + " -> <col=ffff00>" + var4, 7520, true);
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)V", line = 169)
    public static void method2805(byte arg0) {
        field6660 = null;
        if (arg0 > -34) {
            method2807((byte[]) null, 6);
        }
        field6655 = null;
        field6658 = null;
        field6659 = null;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(JI)V", line = 188)
    public static final void method2806(long arg0, int arg1) {
        if (class293.field4356 != null) {
            if (class358.field5167 == 1 || class358.field5167 == 5) {
                class265.method1606(arg0, (byte) 107);
            } else if (class358.field5167 == 4) {
                class337.method2042(arg0, 1);
            }
        }
        field6657++;
        class93.method462(class231.field3205, (byte) -76, (long) class204.field2796);
        if (class57.field725 != -1) {
            class258.method1586(class57.field725, -24134);
        }
        for (int var3 = 0; var3 < class358.field5172; var3++) {
            if (class61.field764[var3]) {
                class217.field2994[var3] = true;
            }
            class412.field5866[var3] = class61.field764[var3];
            class61.field764[var3] = false;
        }
        class76.field921 = class204.field2796;
        if (class231.field3205.method1359()) {
            class231.field3208 = true;
        }
        if (arg1 != 27077) {
            field6660 = null;
        }
        if (class57.field725 != -1) {
            class358.field5172 = 0;
            class19.method125(126);
        }
        class231.field3205.method1352();
        class413.method2445(class231.field3205, (byte) -6);
        int var4 = class462.method2719(16);
        if (var4 == -1) {
            var4 = class84.field1019;
        }
        class58.method302(var4, -15794);
        class414.method2458(64, class19.field258.field1005, class19.field258.field994, class263.field3805, class19.field258.field1008);
        class263.field3805 = 0;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "([BI)Z", line = 250)
    public static final boolean method2807(byte[] arg0, int arg1) {
        field6661++;
        if (arg1 != 0) {
            method2805((byte) -73);
        }
        class179 var2 = new class179(arg0);
        int var3 = var2.method895((byte) -106);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method895((byte) -105) == 1;
        if (var4) {
            class52.method281(0, var2);
        }
        class352.method2132(89, var2);
        return true;
    }
}
