import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class101 {

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "[Lqf;")
    public static class293[] field1471 = new class293[0];

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "F")
    public static float field1482 = 0.0F;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public int field1469;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public int field1472;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public int field1473;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public int field1475;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "J")
    public long field1478;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "Lpk;")
    public static class237 field1483;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "Lbg;")
    public class264 field1467;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "Lbg;")
    public class264 field1476;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "Lbg;")
    public class264 field1480;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "[I")
    public static int[] field1474;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "[Lji;")
    public static class256[] field1481;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I[Ljk;I)V")
    public static final void method738(int arg0, class297[] arg1, int arg2) {
        if (arg2 != -2) {
            field1477 = 102;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class297 var4 = arg1[var3];
            if (var4 != null && var4.field4542 == arg0 && (!var4.field4647 || !client.method330(var4))) {
                if (var4.field4553 == 0) {
                    if (!var4.field4647 && client.method330(var4) && class148.field2144 != var4) {
                        continue;
                    }
                    method738(var4.field4683, arg1, -2);
                    if (var4.field4646 != null) {
                        method738(var4.field4683, var4.field4646, arg2);
                    }
                    class123 var5 = (class123) class124.field1833.method306((long) var4.field4683, arg2 + 16218);
                    if (var5 != null) {
                        class160.method1080(36, var5.field1823);
                    }
                }
                if (var4.field4553 == 6) {
                    if (var4.field4613 != -1 || var4.field4544 != -1) {
                        boolean var6 = class232.method1582(4, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field4544;
                        } else {
                            var7 = var4.field4613;
                        }
                        if (var7 != -1) {
                            class220 var8 = class108.method781(var7, -1);
                            if (var8 != null) {
                                var4.field4701 += class177.field2599;
                                while (var8.field3422[var4.field4546] < var4.field4701) {
                                    var4.field4701 -= var8.field3422[var4.field4546];
                                    var4.field4546++;
                                    if (var4.field4546 >= var8.field3413.length) {
                                        var4.field4546 -= var8.field3434;
                                        if (var4.field4546 < 0 || var4.field4546 >= var8.field3413.length) {
                                            var4.field4546 = 0;
                                        }
                                    }
                                    var4.field4527 = var4.field4546 + 1;
                                    if (var4.field4527 >= var8.field3413.length) {
                                        var4.field4527 -= var8.field3434;
                                        if (var4.field4527 < 0 || var8.field3413.length <= var4.field4527) {
                                            var4.field4527 = -1;
                                        }
                                    }
                                    class297.method1979((byte) -105, var4);
                                }
                            }
                        }
                    }
                    if (var4.field4640 != 0 && !var4.field4647) {
                        int var9 = var4.field4640 << 16 >> 16;
                        int var10 = class177.field2599 * var9;
                        int var11 = var4.field4640 >> 16;
                        int var12 = class177.field2599 * var11;
                        var4.field4622 = var4.field4622 + var12 & 0x7FF;
                        var4.field4691 = var4.field4691 + var10 & 0x7FF;
                        class297.method1979((byte) -56, var4);
                    }
                }
            }
        }
        field1484++;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
    public static void method739(byte arg0) {
        field1483 = null;
        field1481 = null;
        field1471 = null;
        field1474 = null;
        int var1 = 21 / ((-arg0 - 17) / 63);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BIIII)V")
    public static final void method740(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1468++;
        class72.method567(arg1, arg2, arg1 + arg3, arg2 - -arg4);
        class72.method576(arg1, arg2, arg3, arg4, 0);
        if (class130.field1903 < 100) {
            return;
        }
        if (class151.field2215 == null || class151.field2215.field3948 != arg3 || class151.field2215.field3936 != arg4) {
            class289 var5 = new class289(arg3, arg4);
            class72.method557(var5.field4397, arg3, arg4);
            class81.method629(0, class133.field1956, class235.field3619, arg4, 0, 0, 0, 0, arg3);
            class151.field2215 = var5;
            class148.field2148.method1703(5061);
        }
        class151.field2215.method1234(arg1, arg2);
        int var6 = field1477 * arg3 / class133.field1956 + arg1;
        int var7 = class97.field1441 * arg4 / class235.field3619 + arg2;
        int var8 = class151.field2202 * arg3 / class133.field1956;
        int var9 = 16711680;
        int var10 = class222.field3463 * arg4 / class235.field3619;
        if (class246.field3836 == 1) {
            var9 = 16777215;
        }
        int var11 = 67 % ((arg0 + 77) / 33);
        class72.method573(var6, var7, var8, var10, var9, 128);
        class72.method564(var6, var7, var8, var10, var9);
        if (class283.field4344 <= 0) {
            return;
        }
        int var12;
        if (class155.field2259 <= 10) {
            var12 = class155.field2259 * 25;
        } else {
            var12 = (20 - class155.field2259) * 25;
        }
        for (class268 var13 = (class268) class212.field3211.method1894((byte) -90); var13 != null; var13 = (class268) class212.field3211.method1886(-63)) {
            if (class83.field1280 == var13.field4172) {
                int var14 = var13.field4175 * arg3 / class133.field1956 + arg1;
                int var15 = var13.field4171 * arg4 / class235.field3619 + arg2;
                class72.method573(var14 - 2, var15 + -2, 4, 4, 16776960, var12);
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)Z")
    public static final boolean method741(int arg0) {
        if (arg0 != -6425) {
            method738(-88, (class297[]) null, 71);
        }
        field1485++;
        return class14.field207;
    }
}
