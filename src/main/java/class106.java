import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class106 {

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "Lre;")
    private class603 field1475;

    @OriginalMember(owner = "client!jt", name = "q", descriptor = "I")
    private int field1491;

    @OriginalMember(owner = "client!jt", name = "h", descriptor = "I")
    private int field1482;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "Lhe;")
    private class372 field1477;

    @OriginalMember(owner = "client!jt", name = "l", descriptor = "Z")
    public static volatile boolean field1486 = true;

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!jt", name = "i", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!jt", name = "j", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!jt", name = "k", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!jt", name = "m", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!jt", name = "n", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!jt", name = "o", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!jt", name = "p", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!jt", name = "r", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!jt", name = "s", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!jt", name = "t", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1476;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 3)
    public final Object method795(int arg0) {
        field1493++;
        if (arg0 != 14023) {
            this.field1491 = 31;
        }
        class261 var2 = (class261) this.field1477.method2282((byte) 127);
        while (var2 != null) {
            Object var3 = var2.method938(false);
            if (var3 != null) {
                return var3;
            }
            class261 var4 = var2;
            var2 = (class261) this.field1477.method2282((byte) 65);
            var4.method1304((byte) 7);
            var4.method2597(arg0 ^ 0x36AC);
            this.field1491 += var4.field3712;
        }
        return null;
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(I)V", line = 34)
    public static final void method796(int arg0) {
        field1494++;
        if (arg0 != -4246) {
            field1486 = true;
        }
        for (int var1 = 0; var1 < class107.field1497; var1++) {
            class247 var3 = class282.field4007[var1];
            boolean var4 = false;
            if (var3.field3599 == null) {
                var3.field3586--;
                if (var3.field3586 < (var3.method1643(-82) ? -1500 : -10)) {
                    var4 = true;
                } else {
                    if (var3.field3595 == 1 && var3.field3588 == null) {
                        var3.field3588 = class747.method4174(class756.field10584, var3.field3598, 0);
                        if (var3.field3588 == null) {
                            continue;
                        }
                        var3.field3586 += var3.field3588.method4173();
                    } else if (var3.method1643(arg0 + 4336) && (var3.field3590 == null || var3.field3587 == null)) {
                        if (var3.field3590 == null) {
                            var3.field3590 = class552.method3226(class555.field7932, var3.field3598);
                        }
                        if (var3.field3590 == null) {
                            continue;
                        }
                        if (var3.field3587 == null) {
                            var3.field3587 = var3.field3590.method3225(new int[] { 22050 });
                            if (var3.field3587 == null) {
                                continue;
                            }
                        }
                    }
                    if (var3.field3586 < 0) {
                        int var5 = 8192;
                        int var7;
                        if (var3.field3597 == 0) {
                            var7 = var3.field3602 * (var3.field3595 == 3 ? class63.field916.field10210.method2268(17503) : class63.field916.field10189.method2268(17503)) >> 2;
                        } else {
                            int var6 = (var3.field3597 & 0x326E9B6) >> 24;
                            if (class130.field1749.field8429 == var6) {
                                int var8 = var3.field3597 & 0xFF << 9;
                                int var9 = class130.field1749.method2579(false) << 8;
                                int var10 = var3.field3597 >> 16 & 0xFF;
                                int var11 = (var10 << 9) + var9 + 256 - class130.field1749.field8423;
                                int var12 = (var3.field3597 & 0xFFBF) >> 8;
                                int var13 = (var12 << 9) + var9 + 256 - class130.field1749.field8428;
                                int var14 = Math.abs(var11) + Math.abs(var13) - 512;
                                if (var8 < var14) {
                                    var3.field3586 = -99999;
                                    continue;
                                }
                                if (var14 < 0) {
                                    var14 = 0;
                                }
                                var7 = class63.field916.field10211.method2268(17503) * (var8 - var14) * var3.field3602 / var8 >> 2;
                                if (var3.field3600 != null && var3.field3600 instanceof class119) {
                                    class119 var15 = (class119) var3.field3600;
                                    short var16 = var15.field1628;
                                    short var17 = var15.field1626;
                                }
                                if (var11 != 0 || var13 != 0) {
                                    int var18 = (-((int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D)) - 4096) - class660.field9234 & 0x3FFF;
                                    if (var18 > 8192) {
                                        var18 = 16384 - var18;
                                    }
                                    int var19;
                                    if (var14 <= 0) {
                                        var19 = 8192;
                                    } else if (var14 >= 4096) {
                                        var19 = 16384;
                                    } else {
                                        var19 = (8192 - var14) / 4096 + 8192;
                                    }
                                    var5 = (16384 - var19 >> 1) + var18 * var19 / 8192;
                                }
                            } else {
                                var7 = 0;
                            }
                        }
                        if (var7 > 0) {
                            class125 var20 = null;
                            if (var3.field3595 == 1) {
                                var20 = var3.field3588.method4175().method888(class229.field3370);
                            } else if (var3.method1643(-100)) {
                                var20 = var3.field3587;
                            }
                            class591 var21 = var3.field3599 = class591.method3458(var20, var3.field3592, var7, var5);
                            var21.method3433(var3.field3596 - 1);
                            class171.field2666.method3835(var21);
                        }
                    }
                }
            } else if (!var3.field3599.method1303((byte) 26)) {
                var4 = true;
            }
            if (var4) {
                class107.field1497--;
                for (int var22 = var1; var22 < class107.field1497; var22++) {
                    class282.field4007[var22] = class282.field4007[var22 + 1];
                }
                var1--;
            }
        }
        if (class202.field3022 && !class426.method2662(-119)) {
            if (class63.field916.field10184.method2268(17503) != 0 && class9.field142 != -1) {
                if (class407.field6148 == null) {
                    class187.method1308(class63.field916.field10184.method2268(17503), class299.field4244, 0, false, class9.field142, 0);
                } else {
                    class501.method2979(class407.field6148, false, class9.field142, 0, 29756, class299.field4244, class63.field916.field10184.method2268(17503));
                }
            }
            class407.field6148 = null;
            class202.field3022 = false;
        } else if (class63.field916.field10184.method2268(17503) != 0 && class9.field142 != -1 && !class426.method2662(100)) {
            class551.field7857++;
            class468 var2 = class93.method734(class29.field284, class578.field8176, 8174);
            var2.field6839.method3695(class9.field142, arg0 + 4501);
            class120.method872((byte) -81, var2);
            class9.field142 = -1;
        }
    }

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 256)
    public final Object method797(int arg0) {
        field1489++;
        class261 var2 = (class261) this.field1477.method2283(false);
        int var3 = 112 % ((arg0 - 75) / 43);
        while (var2 != null) {
            Object var4 = var2.method938(false);
            if (var4 != null) {
                return var4;
            }
            class261 var5 = var2;
            var2 = (class261) this.field1477.method2282((byte) 79);
            var5.method1304((byte) 7);
            var5.method2597(-79);
            this.field1491 += var5.field3712;
        }
        return null;
    }

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "(I)I", line = 290)
    public final int method798(int arg0) {
        if (arg0 != 0) {
            this.field1475 = null;
        }
        field1490++;
        return this.field1491;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)V", line = 302)
    public static void method799(byte arg0) {
        if (arg0 <= 92) {
            field1476 = null;
        }
        field1476 = null;
    }

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "(I)V", line = 312)
    public final void method800(int arg0) {
        for (class261 var2 = (class261) this.field1475.method3508(-2); var2 != null; var2 = (class261) this.field1475.method3507(-13)) {
            if (var2.method936(500)) {
                var2.method1304((byte) 7);
                var2.method2597(100);
                this.field1491 += var2.field3712;
            }
        }
        if (arg0 < 76) {
            this.method805(-103L, 47, -127, null);
        }
        field1481++;
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(I)V", line = 342)
    public class106(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILjava/lang/Object;J)V", line = 352)
    public final void method801(int arg0, Object arg1, long arg2) {
        field1487++;
        this.method805(arg2, arg0 ^ 0x1D7D, arg0, arg1);
    }

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "(I)I", line = 362)
    public final int method802(int arg0) {
        field1484++;
        if (arg0 != 65471) {
            this.field1475 = null;
        }
        int var2 = 0;
        for (class261 var3 = (class261) this.field1475.method3508(-2); var3 != null; var3 = (class261) this.field1475.method3507(arg0 - 65596)) {
            if (!var3.method936(500)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(II)V", line = 490)
    public class106(int arg0, int arg1) {
        this.field1475 = new class603();
        this.field1491 = arg0;
        this.field1482 = arg0;
        int var3;
        for (var3 = 1; (var3 + var3) < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field1477 = new class372(var3);
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IJ)Ljava/lang/Object;", line = 393)
    public final Object method803(int arg0, long arg1) {
        field1485++;
        class261 var4 = (class261) this.field1477.method2287(arg1, (byte) -117);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method938(false);
        if (var5 == null) {
            var4.method1304((byte) 7);
            var4.method2597(89);
            this.field1491 += var4.field3712;
            return null;
        }
        if (var4.method936(500)) {
            class133 var6 = new class133(var5, var4.field3712);
            this.field1477.method2278((byte) -82, var4.field2810, var6);
            this.field1475.method3505(var6, 4);
            var6.field6154 = 0L;
            var4.method1304((byte) 7);
            var4.method2597(79);
        } else {
            this.field1475.method3505(var4, 4);
            var4.field6154 = 0L;
        }
        if (arg0 < 105) {
            this.field1475 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "(I)I", line = 437)
    public final int method804(int arg0) {
        if (arg0 == 17067) {
            field1480++;
            return this.field1482;
        } else {
            return -39;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(JIILjava/lang/Object;)V", line = 448)
    public final void method805(long arg0, int arg1, int arg2, Object arg3) {
        if (arg1 != 7548) {
            this.field1475 = null;
        }
        field1488++;
        if (arg2 > this.field1482) {
            throw new IllegalStateException("s>cs");
        }
        this.method806(16384, arg0);
        this.field1491 -= arg2;
        while (this.field1491 < 0) {
            class261 var7 = (class261) this.field1475.method3510(-45);
            this.method808(var7, -91);
        }
        class133 var6 = new class133(arg3, arg2);
        this.field1477.method2278((byte) -123, arg0, var6);
        this.field1475.method3505(var6, arg1 - 7544);
        var6.field6154 = 0L;
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(IJ)V", line = 478)
    private final void method806(int arg0, long arg1) {
        if (arg0 != 16384) {
            this.method795(-79);
        }
        field1483++;
        class261 var4 = (class261) this.field1477.method2287(arg1, (byte) -117);
        this.method808(var4, arg0 ^ 0xFFFFBFBF);
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(II)V", line = 505)
    public final void method807(int arg0, int arg1) {
        if (arg1 != -1) {
            return;
        }
        field1479++;
        if (class182.field2799 == null) {
            return;
        }
        for (class261 var3 = (class261) this.field1475.method3508(-2); var3 != null; var3 = (class261) this.field1475.method3507(-46)) {
            if (var3.method936(500)) {
                if (var3.method938(false) == null) {
                    var3.method1304((byte) 7);
                    var3.method2597(122);
                    this.field1491 += var3.field3712;
                }
            } else if (++var3.field6154 > (long) arg0) {
                class261 var4 = class182.field2799.method2153(12462, var3);
                this.field1477.method2278((byte) -94, var3.field2810, var4);
                class386.method2488(true, var4, var3);
                var3.method1304((byte) 7);
                var3.method2597(arg1 ^ 0xFFFFFFB9);
            }
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lfc;I)V", line = 552)
    private final void method808(class261 arg0, int arg1) {
        field1492++;
        if (arg1 < -61 && arg0 != null) {
            arg0.method1304((byte) 7);
            arg0.method2597(91);
            this.field1491 += arg0.field3712;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z)V", line = 570)
    public final void method809(boolean arg0) {
        this.field1475.method3503(-16);
        field1478++;
        this.field1477.method2289(1393);
        if (!arg0) {
            this.field1475 = null;
        }
        this.field1491 = this.field1482;
    }
}
