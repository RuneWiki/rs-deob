import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class204 extends class271 {

    @OriginalMember(owner = "client!ll", name = "M", descriptor = "I")
    public static int field2764 = 0;

    @OriginalMember(owner = "client!ll", name = "ab", descriptor = "[I")
    public static int[] field2768 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!ll", name = "db", descriptor = "I")
    public static int field2771 = 0;

    @OriginalMember(owner = "client!ll", name = "Q", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!ll", name = "Y", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!ll", name = "Z", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!ll", name = "cb", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!ll", name = "fb", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!ll", name = "eb", descriptor = "Lkq;")
    public static class351 field2772;

    @OriginalMember(owner = "client!ll", name = "bb", descriptor = "Ldi;")
    public static class65 field2769;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "(B)V", line = 8)
    public static final void method1336(byte arg0) {
        for (int var1 = 0; ~class145.field2115 < ~var1; ++var1) {
            int var10002 = class61.field935[var1]--;
            if (class61.field935[var1] >= -10) {
                class114 var4 = class423.field6076[var1];
                if (var4 == null) {
                    var4 = class114.method752(class367.field5152, class337.field4592[var1], 0);
                    if (var4 == null) {
                        continue;
                    }
                    class61.field935[var1] += var4.method754();
                    class423.field6076[var1] = var4;
                }
                if (~class61.field935[var1] > -1) {
                    int var11;
                    if (~class4.field66[var1] != -1) {
                        int var5 = (255 & class4.field66[var1]) * 128;
                        int var6 = (16760959 & class4.field66[var1]) >> 16;
                        int var7 = var6 * 128 + -class307.field4211.field6197 + 64;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = class4.field66[var1] >> 8 & 255;
                        int var9 = var8 * 128 + -class307.field4211.field6192 + 64;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 - 128;
                        if (~var10 < ~var5) {
                            class61.field935[var1] = -100;
                            continue;
                        }
                        if (~var10 > -1) {
                            var10 = 0;
                        }
                        var11 = class27.field438[var1] * class406.field5895 * (-var10 + var5) / var5 >> 8;
                    } else {
                        var11 = class27.field438[var1] * class396.field5788 >> 8;
                    }
                    if (var11 > 0) {
                        class56 var12 = var4.method755().method374(class300.field4158);
                        class96 var13 = class96.method645(var12, 100, var11);
                        var13.method673(class270.field3681[var1] + -1);
                        class252.field3467.method857(var13);
                    }
                    class61.field935[var1] = -100;
                }
            } else {
                --class145.field2115;
                for (int var3 = var1; class145.field2115 > var3; ++var3) {
                    class337.field4592[var3] = class337.field4592[var3 + 1];
                    class423.field6076[var3] = class423.field6076[var3 + 1];
                    class270.field3681[var3] = class270.field3681[var3 + 1];
                    class61.field935[var3] = class61.field935[var3 - -1];
                    class4.field66[var3] = class4.field66[var3 + 1];
                    class27.field438[var3] = class27.field438[var3 + 1];
                }
                --var1;
            }
        }
        int var2 = -108 / ((arg0 - -45) / 45);
        ++field2765;
        if (class1.field12 && !class48.method339(true)) {
            if (~class276.field3750 != -1 && class261.field3569 != -1) {
                class108.method729(false, false, class331.field4488, class261.field3569, class276.field3750, 0);
            }
            class1.field12 = false;
        } else if (~class276.field3750 != -1 && class261.field3569 != -1 && !class48.method339(true)) {
            ++class258.field3538;
            class442.field6400.method158((byte) 7, 92);
            class442.field6400.method2386(class261.field3569, 19324);
            class261.field3569 = -1;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILjava/lang/String;)V", line = 142)
    public static final void method1337(int arg0, String arg1) {
        ++field2766;
        if (arg1 != null) {
            String var2 = class408.method2616(arg1, -1);
            if (arg0 == 1) {
                if (var2 != null) {
                    for (int var3 = 0; ~var3 > ~class97.field1482; ++var3) {
                        String var4 = class408.method2616(class40.field609[var3], arg0 ^ -2);
                        if (var4 != null && var4.equals(var2)) {
                            --class97.field1482;
                            for (int var5 = var3; class97.field1482 > var5; ++var5) {
                                class40.field609[var5] = class40.field609[var5 + 1];
                                class365.field5117[var5] = class365.field5117[var5 + 1];
                                class344.field4810[var5] = class344.field4810[var5 + 1];
                                class2.field17[var5] = class2.field17[var5 - -1];
                                class57.field821[var5] = class57.field821[var5 + 1];
                                class407.field5917[var5] = class407.field5917[var5 + 1];
                            }
                            class184.field2579 = class441.field6398;
                            ++class341.field4766;
                            class442.field6400.method158((byte) 7, 239);
                            class442.field6400.method2396(class322.method2036(arg1, -53), 12450);
                            class442.field6400.method2412(-97, arg1);
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(III)I", line = 200)
    public static final int method1338(int arg0, int arg1, int arg2) {
        ++field2770;
        if (arg0 != 10144) {
            field2771 = 80;
        }
        int var3 = arg2 >>> 31;
        return (arg2 + var3) / arg1 + -var3;
    }

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "(B)V", line = 216)
    public static void method1339(byte arg0) {
        field2769 = null;
        if (arg0 == 9) {
            field2768 = null;
            field2772 = null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(II)[[I", line = 228)
    public final int[][] method85(int arg0, int arg1) {
        ++field2773;
        int[][] var3 = super.field6259.method1848((byte) 63, arg1);
        if (arg0 != -13348) {
            method1339((byte) 9);
        }
        if (super.field6259.field3950 && this.method1663((byte) 26)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field3696 * super.field3696;
            for (int var8 = 0; class43.field653 > var8; ++var8) {
                int var9 = super.field3694[var7 - -(var8 % super.field3691)];
                var6[var8] = class318.method2028(var9, 255) << 4;
                var5[var8] = class318.method2028(var9 >> 4, 4080);
                var4[var8] = class318.method2028(var9 >> 12, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIZZ)V", line = 275)
    public static final void method1340(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        class386.field5629 = arg1;
        class371.field5311 = arg2;
        class245.field3380 = arg3;
        class383.field5456 = new class142[arg0][class386.field5629][class371.field5311];
        class156.field2213 = new class156[arg0];
        if (arg4) {
            class77.field1200 = new class142[1][class386.field5629][class371.field5311];
            class270.field3683 = new int[class386.field5629][class371.field5311];
            class435.field6248 = new class156[1];
        } else {
            class77.field1200 = null;
            class270.field3683 = null;
            class435.field6248 = null;
        }
        if (arg5) {
            class36.field551 = new int[arg0][arg1][arg2];
            class84.field1302 = new class347[255];
            class257.field3496 = new boolean[255];
            class155.field2185 = 0;
        } else {
            class36.field551 = null;
            class84.field1302 = null;
            class257.field3496 = null;
            class155.field2185 = 0;
        }
        client.method1112(false);
        class99.field1515 = new class33[500];
        class389.field5668 = 0;
        class414.field6015 = new class33[500];
        class166.field2375 = 0;
        class28.field445 = new int[arg0][class386.field5629 + 1][class371.field5311 + 1];
        class327.field4469 = new class430[5000];
        class170.field2426 = 0;
        class3.field39 = new boolean[class245.field3380 + class245.field3380 + 1][class245.field3380 + class245.field3380 + 1];
        class4.field43 = new boolean[class245.field3380 + class245.field3380 + 2][class245.field3380 + class245.field3380 + 2];
        class165.field2357 = null;
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(II)V", line = 327)
    public static final void method1341(int arg0, int arg1) {
        ++field2767;
        class32.field498 = arg0;
        class190 var2 = class439.field6338;
        synchronized (class439.field6338) {
            class439.field6338.method1249(1);
            if (arg1 <= 57) {
                method1341(24, 26);
            }
        }
    }
}
