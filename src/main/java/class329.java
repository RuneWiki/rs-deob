import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class329 {

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "Lne;")
    public static class118 field4555 = new class118(64);

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "Lwk;")
    public static class155 field4558 = new class155(512);

    @OriginalMember(owner = "client!iu", name = "h", descriptor = "I")
    public static int field4561 = 0;

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "F")
    public static float field4560;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(ZIIIILnl;)V", line = 3)
    public static final void method2057(boolean arg0, int arg1, int arg2, int arg3, int arg4, class435 arg5) {
        class26.field278 = arg5;
        field4554++;
        if (arg2 > -63) {
            field4560 = 0.041470375F;
        }
        class449.field6386 = 10000;
        class33.field342 = arg3;
        class363.field5004 = arg4;
        class347.field4785 = 1;
        class353.field4855 = arg0;
        class56.field829 = arg1;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V", line = 23)
    public static void method2058(int arg0) {
        if (arg0 < 49) {
            field4560 = -0.3243634F;
        }
        field4555 = null;
        field4558 = null;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIIIIII)V", line = 39)
    public static final void method2059(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4557++;
        int var8 = arg6 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = class443.field6299 + ((class13.field102 - class443.field6299) * var8 / 100);
        int var10 = arg0 * var9 >> 8;
        int var11 = 16384 - arg2 & 0x3FFF;
        int var12 = 16384 - arg3 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class319.field4501[var11] * -var10 >> 15;
            var15 = class319.field4504[var11] * var10 >> 15;
        }
        if (arg4 != 255) {
            method2061(60);
        }
        if (var12 != 0) {
            var13 = class319.field4501[var12] * var15 >> 15;
            var15 = class319.field4504[var12] * var15 >> 15;
        }
        class184.field2784 = arg1 - var15;
        class103.field1455 = arg3;
        class303.field4302 = arg5 - var14;
        class366.field5028 = arg2;
        class158.field2258 = 0;
        class135.field1884 = arg7 - var13;
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(I)V", line = 96)
    public static final void method2060(int arg0) {
        field4559++;
        if (class336.field4667 == 5 && arg0 == 0) {
            class336.field4667 = 6;
        }
    }

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "(I)V", line = 111)
    public static final void method2061(int arg0) {
        for (int var1 = 0; var1 < class172.field2628; var1++) {
            int var10002 = class377.field5194[var1]--;
            if (class377.field5194[var1] >= -10) {
                class242 var3 = class126.field1717[var1];
                if (var3 == null) {
                    var3 = class242.method1682(class74.field1070, class191.field2863[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class377.field5194[var1] += var3.method1680();
                    class126.field1717[var1] = var3;
                }
                if (class377.field5194[var1] < 0) {
                    int var11;
                    if (class128.field1758[var1] == 0) {
                        var11 = class131.field1805[var1] * class193.field2870 >> 8;
                    } else {
                        int var4 = (class128.field1758[var1] & 0x355A824) >> 24;
                        if (class262.field3781.field4531 == var4) {
                            int var5 = (class128.field1758[var1] & 0xFF) * 128;
                            int var6 = class128.field1758[var1] >> 16 & 0xFF;
                            int var7 = var6 * 128 + 64 - class262.field3781.field4537;
                            if (var7 < 0) {
                                var7 = -var7;
                            }
                            int var8 = class128.field1758[var1] >> 8 & 0xFF;
                            int var9 = var8 * 128 + 64 - class262.field3781.field4530;
                            if (var9 < 0) {
                                var9 = -var9;
                            }
                            int var10 = var9 + var7 - 128;
                            if (var10 > var5) {
                                class377.field5194[var1] = -100;
                                continue;
                            }
                            if (var10 < 0) {
                                var10 = 0;
                            }
                            var11 = (var5 - var10) * class339.field4687 * class131.field1805[var1] / var5 >> 8;
                        } else {
                            var11 = 0;
                        }
                    }
                    if (var11 > 0) {
                        class44 var12 = var3.method1681().method461(class445.field6349);
                        class215 var13 = class215.method1484(var12, 100, var11);
                        var13.method1483(class261.field3746[var1] - 1);
                        class332.field4613.method2407(var13);
                    }
                    class377.field5194[var1] = -100;
                }
            } else {
                class172.field2628--;
                for (int var2 = var1; var2 < class172.field2628; var2++) {
                    class191.field2863[var2] = class191.field2863[var2 + 1];
                    class126.field1717[var2] = class126.field1717[var2 + 1];
                    class261.field3746[var2] = class261.field3746[var2 + 1];
                    class377.field5194[var2] = class377.field5194[var2 + 1];
                    class128.field1758[var2] = class128.field1758[var2 + 1];
                    class131.field1805[var2] = class131.field1805[var2 + 1];
                }
                var1--;
            }
        }
        if (arg0 != -30746) {
            method2059(-122, 112, -116, -11, -13, -61, 85, 75);
        }
        field4556++;
        if (class468.field6598 && !class56.method519((byte) 22)) {
            if (class409.field5605 != 0 && class290.field4117 != -1) {
                method2057(false, class290.field4117, -73, class409.field5605, 0, class38.field473);
            }
            class468.field6598 = false;
        } else if (class409.field5605 != 0 && class290.field4117 != -1 && !class56.method519((byte) 33)) {
            class336.method2111(class443.field6294, 89);
            class323.field4518++;
            class311.field4403.method1177(class290.field4117, -98);
            class290.field4117 = -1;
        }
    }
}
