import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class200 {

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Lpj;")
    public static class237 field3457 = class33.method353("Loaded titlescreen)3", 18);

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "J")
    public static long field3460 = 0L;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II[Lw;)V")
    public static final void method1362(int arg0, int arg1, class141[] arg2) {
        if (arg0 > -37) {
            method1363(61);
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class141 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field2529 == 0) {
                    if (var4.field2457 != null) {
                        method1362(-64, arg1, var4.field2457);
                    }
                    class58 var5 = (class58) class164.field2915.method568((long) var4.field2530, -1);
                    if (var5 != null) {
                        class16.method146((byte) -91, var5.field1191, arg1);
                    }
                }
                if (arg1 == 0 && var4.field2532 != null) {
                    class117 var6 = new class117();
                    var6.field2053 = var4.field2532;
                    var6.field2046 = var4;
                    class229.method1519(-111, var6);
                }
                if (arg1 == 1 && var4.field2480 != null) {
                    if (var4.field2433 >= 0) {
                        class141 var7 = class70.method572(20043, var4.field2530);
                        if (var7 == null || var7.field2457 == null || var4.field2433 >= var7.field2457.length || var7.field2457[var4.field2433] != var4) {
                            continue;
                        }
                    }
                    class117 var8 = new class117();
                    var8.field2046 = var4;
                    var8.field2053 = var4.field2480;
                    class229.method1519(-128, var8);
                }
            }
        }
        field3456++;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static final void method1363(int arg0) {
        if (!class247.field4306) {
            class235.field4090[0] = 1007;
            class180.field3168[0] = class62.field1242;
            if (class260.field4465 != 0) {
                class126.field2201 = class3.field39;
                class169.field2968 = class243.field4270;
            } else if (class123.field2173 == 0) {
                class126.field2201 = class174.field3059;
                class169.field2968 = class28.field515;
            } else {
                class169.field2968 = class227.field3891;
                class126.field2201 = class58.field1196;
            }
            class215.field3747[0] = class239.field4202;
            class271.field4664 = 1;
        }
        field3459++;
        if (class84.field1573 != -1) {
            class226.method1509(class84.field1573, arg0 + 61);
        }
        for (int var1 = arg0; var1 < class68.field1348; var1++) {
            if (class166.field2941[var1]) {
                class114.field2008[var1] = true;
            }
            class70.field1381[var1] = class166.field2941[var1];
            class166.field2941[var1] = false;
        }
        class243.field4263 = -1;
        class149.field2645 = null;
        class36.field808 = class241.field4246;
        class131.field2307 = -1;
        if (class84.field1573 != -1) {
            class68.field1348 = 0;
            class166.method1159(class84.field1573, 0, class119.field2087, 0, arg0 ^ 0xFFFFFFC6, 0, 0, class142.field2585, -1);
        }
        class192.method1295();
        class29.method277(arg0 ^ 0x23);
        if (class247.field4306) {
            class234.method1554(122);
        } else if (class131.field2307 != -1) {
            class50.method457(class131.field2307, class243.field4263, (byte) 2);
        }
        if (class95.field1691 == 3) {
            for (int var2 = 0; var2 < class68.field1348; var2++) {
                if (class70.field1381[var2]) {
                    class192.method1313(class260.field4458[var2], class183.field3215[var2], class115.field2023[var2], class249.field4324[var2], 16711935, 128);
                } else if (class114.field2008[var2]) {
                    class192.method1313(class260.field4458[var2], class183.field3215[var2], class115.field2023[var2], class249.field4324[var2], 16711680, 128);
                }
            }
        }
        class209.method1402(class59.field1204, class229.field3911.field3710, 121, class274.field4798, class229.field3911.field3700);
        class59.field1204 = 0;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BIIII)V")
    public static final void method1364(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field3458++;
        class192.method1309(arg2, arg4, arg2 + arg3, arg4 - -arg1);
        class192.method1301(arg2, arg4, arg3, arg1, 0);
        if (class138.field2386 < 100) {
            return;
        }
        if (class274.field4764 == null || class274.field4764.field2018 != arg3 || class274.field4764.field2014 != arg1) {
            class225 var5 = new class225(arg3, arg1);
            class192.method1300(var5.field3867, arg3, arg1);
            class269.method1790(0, class148.field2629, class115.field2017, arg3, arg1, 0, false, 0, 0);
            class274.field4764 = var5;
            class38.field845.method153(100);
        }
        class274.field4764.method808(arg2, arg4);
        int var6 = arg2 + (class152.field2699 * arg3 / class148.field2629);
        if (arg0 < 36) {
            return;
        }
        int var7 = class20.field385 * arg1 / class115.field2017;
        int var8 = class94.field1674 * arg3 / class148.field2629;
        int var9 = class38.field847 * arg1 / class115.field2017 + arg4;
        class192.method1313(var6, var9, var8, var7, 16711680, 128);
        class192.method1316(var6, var9, var8, var7, 16711680);
        if (class135.field2360 <= 0 || (class135.field2360 % 10) >= 5) {
            return;
        }
        for (class96 var10 = (class96) class54.field1122.method673(false); var10 != null; var10 = (class96) class54.field1122.method680(28)) {
            if (class166.field2943 == var10.field1713) {
                int var11 = var10.field1706 * arg3 / class148.field2629 + arg2;
                int var12 = var10.field1704 * arg1 / class115.field2017 + arg4;
                class192.method1301(var11 - 2, var12 + -2, 4, 4, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
    public static void method1365(int arg0) {
        field3457 = null;
        if (arg0 != -16535) {
            field3457 = null;
        }
    }
}
