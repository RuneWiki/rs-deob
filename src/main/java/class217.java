import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class217 extends class285 {

    @OriginalMember(owner = "client!kea", name = "eb", descriptor = "Ltn;")
    public class78 field2620;

    @OriginalMember(owner = "client!kea", name = "cb", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!kea", name = "fb", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!kea", name = "gb", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!kea", name = "hb", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!kea", name = "ib", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!kea", name = "db", descriptor = "Lxa;")
    public static class458 field2619;

    @OriginalMember(owner = "client!kea", name = "jb", descriptor = "[[B")
    public static byte[][] field2625;

    @OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Laf;)V", line = 6)
    public class217(class397 arg0) {
        super(arg0);
        this.field2620 = new class78(arg0);
        super.field3647 = new class96(super.field3612);
        super.field3650 = new class96(super.field3612);
        super.field3629 = new class96(super.field3612);
        super.field3648 = new class96(super.field3612);
        super.field3628 = new class96(super.field3612);
        super.field3616 = new class96(super.field3612);
        super.field3646 = new class96(super.field3612);
        super.field3632 = new class96(super.field3612);
        super.field3615 = new class96(super.field3612);
        super.field3630 = new class96(super.field3612);
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(B)V", line = 26)
    public final void method989(byte arg0) {
        this.field2620 = new class78((class397) super.field3612);
        if (arg0 > -79) {
            method1289(-80);
        }
        ++field2622;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(BZ)V", line = 38)
    public static final void method1286(byte arg0, boolean arg1) {
        if (arg0 != 116) {
            field2625 = null;
        }
        ++field2624;
        while (class680.field9630.method3464(96, class478.field7009) >= 15) {
            int var2 = class680.field9630.method3465(15, (byte) -124);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            class443 var4 = (class443) class392.field5223.method3234((byte) -114, (long) var2);
            if (var4 == null) {
                class625 var5 = new class625();
                var5.field3784 = var2;
                var4 = new class443(var5);
                class392.field5223.method3235((long) var2, -1, var4);
                class609.field8605[class208.field2528++] = var4;
                var3 = true;
            }
            class625 var6 = var4.field6107;
            class664.field9449[class118.field1356++] = var2;
            var6.field3734 = class469.field6549;
            if (var6.field8855 != null && var6.field8855.method100((byte) 122)) {
                class13.method64(var6, -9581);
            }
            int var7;
            if (!arg1) {
                var7 = class680.field9630.method3465(5, (byte) -96);
                if (var7 > 15) {
                    var7 -= 32;
                }
            } else {
                var7 = class680.field9630.method3465(8, (byte) -104);
                if (~var7 < -128) {
                    var7 -= 256;
                }
            }
            int var8 = class680.field9630.method3465(1, (byte) -90);
            var6.method3501(class608.field8585.method3273(-1119, class680.field9630.method3465(14, (byte) -126)), 56);
            int var9 = class680.field9630.method3465(1, (byte) -104);
            if (var9 == 1) {
                class233.field2975[class46.field507++] = var2;
            }
            int var10 = 15915 & 4 + class680.field9630.method3465(3, (byte) -125) << 11;
            int var11;
            if (!arg1) {
                var11 = class680.field9630.method3465(5, (byte) -125);
                if (~var11 < -16) {
                    var11 -= 32;
                }
            } else {
                var11 = class680.field9630.method3465(8, (byte) -100);
                if (~var11 < -128) {
                    var11 -= 256;
                }
            }
            int var12 = class680.field9630.method3465(2, (byte) -82);
            var6.method1664((byte) -95, var6.field8855.field234);
            var6.field3792 = var6.field8855.field232 << 3;
            if (var3) {
                var6.method1648(true, var10, (byte) 67);
            }
            var6.method3497(var12, ~var8 == -2, class377.field4914.field3839[0] - -var11, var6.method1656(true), -87, class377.field4914.field3841[0] + var7);
            if (var6.field8855.method100((byte) 122)) {
                class67.method441(0, var6.field3841[0], (class335) null, -126, var6.field3839[0], var6.field4638, (class455) null, var6);
            }
        }
        class680.field9630.method3463((byte) 104);
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 143)
    public static final void method1287(String arg0, int arg1) {
        ++field2623;
        if (arg0 != null) {
            if ((~class210.field2549 > -201 || class571.field8101) && class210.field2549 < 200) {
                String var3 = class487.method2819(2, arg0);
                if (var3 != null) {
                    if (arg1 <= -101) {
                        for (int var4 = 0; class210.field2549 > var4; ++var4) {
                            String var8 = class487.method2819(2, class314.field4077[var4]);
                            if (var8 != null && var8.equals(var3)) {
                                class638.method3593(true, 4, arg0 + class221.field2757.method1296(class226.field2899, (byte) -80));
                                return;
                            }
                            if (class485.field7061[var4] != null) {
                                String var9 = class487.method2819(2, class485.field7061[var4]);
                                if (var9 != null && var9.equals(var3)) {
                                    class638.method3593(true, 4, arg0 + class221.field2757.method1296(class226.field2899, (byte) -69));
                                    return;
                                }
                            }
                        }
                        for (int var5 = 0; ~var5 > ~class601.field8535; ++var5) {
                            String var6 = class487.method2819(2, class278.field3521[var5]);
                            if (var6 != null && var6.equals(var3)) {
                                class638.method3593(true, 4, class221.field2762.method1296(class226.field2899, (byte) 121) + arg0 + class221.field2763.method1296(class226.field2899, (byte) 111));
                                return;
                            }
                            if (class305.field3983[var5] != null) {
                                String var7 = class487.method2819(2, class305.field3983[var5]);
                                if (var7 != null && var7.equals(var3)) {
                                    class638.method3593(true, 4, class221.field2762.method1296(class226.field2899, (byte) 98) + arg0 + class221.field2763.method1296(class226.field2899, (byte) 67));
                                    return;
                                }
                            }
                        }
                        if (class487.method2819(2, class377.field4914.field6324).equals(var3)) {
                            class638.method3593(true, 4, class221.field2760.method1296(class226.field2899, (byte) -112));
                        } else {
                            ++class508.field7302;
                            class480.method2802(class223.field2832, 16751);
                            class334.field4314.method2525(class265.method1504(arg0, (byte) 88), -81849);
                            class334.field4314.method2573(arg0, 16746);
                        }
                    }
                }
            } else {
                class638.method3593(true, 4, class221.field2682.method1296(class226.field2899, (byte) 117));
                String var2 = class221.field2683.method1296(class226.field2899, (byte) 111);
                if (var2 != null) {
                    class638.method3593(true, 4, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IZI)V", line = 241)
    public static final void method1288(int arg0, boolean arg1, int arg2) {
        if (arg0 == 0) {
            class453.field6284 = class635.method3555(-64, class457.field6380, class601.field8530.field2858 * 2, class220.field2664, class209.field2545, 0);
        } else {
            if (arg1) {
                class453.field6284 = class635.method3555(-73, class457.field6380, 0, class220.field2664, class209.field2545, 0);
                class453.field6284.method343(0);
                class645 var3 = class415.method2244(2048, class57.field593, class525.field7511, 0);
                class195 var4 = class453.field6284.method349(var3, class563.method3180(class633.field8972, class525.field7511, 0), true);
                class1.method1(75, class221.field2684.method1296(class226.field2899, (byte) 65), true, var4);
                class280.method1597(false);
                class453.field6284.method3548(false);
            }
            try {
                class453.field6284 = class635.method3555(-73, class457.field6380, class601.field8530.field2858 * 2, class220.field2664, class209.field2545, arg0);
                if (class453.field6284.method376()) {
                    boolean var5 = true;
                    try {
                        var5 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var7) {
                    }
                    class37 var6;
                    if (!var5) {
                        var6 = class453.field6284.method308(104857600);
                    } else {
                        var6 = class453.field6284.method308(146800640);
                    }
                    class453.field6284.method292(var6);
                }
            } catch (Throwable var8) {
                arg0 = 0;
                class453.field6284 = class635.method3555(-87, class457.field6380, 0, class220.field2664, class209.field2545, 0);
            }
        }
        ++field2618;
        class150.field1711 = arg0;
        class209.method1258((byte) -26);
        if (!class453.field6284.method386()) {
            class665.field9458 = 1;
        }
        class453.field6284.method333(class665.field9458);
        class453.field6284.method288(0);
        class453.field6284.method369(32);
        class139.field1593 = class453.field6284.method371();
        class617.field8679 = class453.field6284.method371();
        class295.method1678((byte) -66);
        class453.field6284.method293(!class601.field8530.field2879);
        if (arg2 >= -81) {
            method1287((String) null, -50);
        }
        if (class453.field6284.method275()) {
            class445.method2464(class601.field8530.field2849, (byte) -27);
        }
        class195.method1131(16624, class349.field4567 >> 3, class399.field5338 >> 3, class453.field6284);
        class89.method558(0);
        class208.field2532 = true;
        class272.field3441 = false;
        class168.field2015 = null;
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(I)V", line = 322)
    public static void method1289(int arg0) {
        field2625 = null;
        field2619 = null;
        int var1 = 50 / ((arg0 - -5) / 55);
    }
}
