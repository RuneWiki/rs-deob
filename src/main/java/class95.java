import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class95 {

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public int field1566 = -1;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
    public int field1574 = 0;

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "Z")
    public boolean field1579 = true;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    public int field1576 = -1;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public static int field1571 = 0;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field1560 = 0;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Ldf;")
    public static class51 field1561 = class46.method233("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", 100);

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "Laf;")
    public static class64 field1575 = new class64(5000);

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Lja;")
    public static class55 field1565;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II[SI[Ldf;)V")
    public static final void method705(int arg0, int arg1, short[] arg2, int arg3, class51[] arg4) {
        if (arg1 != -29224) {
            method709((class103) null, -70, -90, 8, 120);
        }
        field1568++;
        if (arg3 >= arg0) {
            return;
        }
        int var5 = (arg0 + arg3) / 2;
        int var6 = arg3;
        class51 var7 = arg4[var5];
        arg4[var5] = arg4[arg0];
        arg4[arg0] = var7;
        short var8 = arg2[var5];
        arg2[var5] = arg2[arg0];
        arg2[arg0] = var8;
        for (int var9 = arg3; var9 < arg0; var9++) {
            if (var7 == null || arg4[var9] != null && arg4[var9].method282(var7, (byte) -113) < (var9 & 0x1)) {
                class51 var10 = arg4[var9];
                arg4[var9] = arg4[var6];
                arg4[var6] = var10;
                short var11 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6++] = var11;
            }
        }
        arg4[arg0] = arg4[var6];
        arg4[var6] = var7;
        arg2[arg0] = arg2[var6];
        arg2[var6] = var8;
        method705(var6 - 1, arg1, arg2, arg3, arg4);
        method705(arg0, -29224, arg2, var6 + 1, arg4);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Llb;II)V")
    public final void method706(class121 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method897(118);
            if (var4 == 0) {
                field1563++;
                if (arg2 < 72) {
                    this.field1576 = -87;
                    return;
                }
                return;
            }
            this.method711(arg0, arg1, var4, (byte) -126);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILwc;IIII)V")
    public static final void method707(int arg0, int arg1, class213 arg2, int arg3, int arg4, int arg5, int arg6) {
        field1567++;
        int var7 = arg1 * arg1 + arg6 * arg6;
        if (arg5 != 15) {
            field1561 = null;
        }
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg2.field3603 / 2, arg2.field3608 / 2);
        if (var7 <= var8 * var8) {
            class21.method109(class156.field2573[arg0], arg6, arg2, (byte) -86, arg4, arg3, arg1);
            return;
        }
        var8 -= 10;
        int var9 = class120.field1993 + class119.field1991 & 0x7FF;
        int var10 = class73.field1155[var9];
        int var11 = class73.field1167[var9];
        int var12 = var10 * 256 / (class109.field1849 + 256);
        int var13 = var11 * 256 / (class109.field1849 + 256);
        int var14 = arg1 * var13 + arg6 * var12 >> 16;
        int var15 = arg6 * var13 - (arg1 * var12) >> 16;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) (Math.sin(var16) * (double) var8);
        int var19 = (int) (Math.cos(var16) * (double) var8);
        ((class254) class107.field1762[arg0]).method1102(arg3 + (arg2.field3603 / 2) + (var18 - 10), arg2.field3608 / 2 + arg4 + -var19 + -10, 20, 20, 15, 15, var16, 256);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)Ldf;")
    public static final class51 method708(int arg0, int arg1) {
        field1577++;
        if (arg0 == -7831) {
            return arg1 < 999999999 ? class51.method311(arg1, 10) : class163.field2662;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lfi;IIII)V")
    public static final void method709(class103 arg0, int arg1, int arg2, int arg3, int arg4) {
        field1573++;
        if (class44.field706 == arg0 || class39.field616 >= 400) {
            return;
        }
        class51 var5;
        if (arg0.field1692 == 0) {
            var5 = class20.method104(-101, new class51[] { arg0.method747(false), class48.method248(class44.field706.field1697, arg0.field1697, false), class265.field4643, class217.field3772, class51.method311(arg0.field1697, 10), class169.field2759 });
        } else {
            var5 = class20.method104(~arg1, new class51[] { arg0.method747(false), class265.field4643, class147.field2475, class51.method311(arg0.field1692, arg1 + 10), class169.field2759 });
        }
        if (class175.field2871 == 1) {
            class217.field3766++;
            class185.method1313(arg4, (long) arg2, class183.field3031, (short) 50, class20.method104(-92, new class51[] { class181.field2990, class176.field2881, var5 }), arg3, -501);
        } else if (!class93.field1532) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class77.field1240[var6] != null) {
                    class241.field4175++;
                    short var7 = 0;
                    if (class86.field1440 == 0 && class77.field1240[var6].method292(true, class36.field555)) {
                        if (arg0.field1697 > class44.field706.field1697) {
                            var7 = 2000;
                        }
                        if (class44.field706.field1717 != 0 && arg0.field1717 != 0) {
                            if (class44.field706.field1717 == arg0.field1717) {
                                var7 = 2000;
                            } else {
                                var7 = 0;
                            }
                        }
                    } else if (class120.field1994[var6]) {
                        var7 = 2000;
                    }
                    boolean var8 = false;
                    short var9 = class33.field485[var6];
                    short var10 = (short) (var7 + var9);
                    class185.method1313(arg4, (long) arg2, class77.field1240[var6], var10, class20.method104(-107, new class51[] { class36.field560, var5 }), arg3, arg1 ^ 0xFFFFFE0B);
                }
            }
        } else if ((class170.field2788 & 0x8) == 8) {
            class185.method1313(arg4, (long) arg2, class261.field4562, (short) 45, class20.method104(103, new class51[] { class22.field336, class176.field2881, var5 }), arg3, -501);
            class242.field4200++;
        }
        for (int var11 = arg1; var11 < class39.field616; var11++) {
            if (class67.field1103[var11] == 38) {
                class77.field1235[var11] = class20.method104(-96, new class51[] { class36.field560, var5 });
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static void method710(int arg0) {
        field1575 = null;
        if (arg0 != 8652) {
            method713((byte) 18, (class188) null, (class55) null, -69);
        }
        field1565 = null;
        field1561 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Llb;IIB)V")
    private final void method711(class121 arg0, int arg1, int arg2, byte arg3) {
        if (arg3 > -118) {
            return;
        }
        if (arg2 == 1) {
            this.field1574 = class209.method1438(-1, arg0.method891((byte) -121));
        } else if (arg2 == 2) {
            this.field1566 = arg0.method897(108);
        } else if (arg2 == 3) {
            this.field1566 = arg0.method876(false);
            if (this.field1566 == 65535) {
                this.field1566 = -1;
            }
        } else if (arg2 == 5) {
            this.field1579 = false;
        } else if (arg2 == 7) {
            this.field1576 = class209.method1438(-1, arg0.method891((byte) -110));
        } else if (arg2 == 8) {
            class140.field2350 = arg1;
        } else if (arg2 == 9) {
            arg0.method876(false);
        } else if (arg2 != 10) {
            if (arg2 == 11) {
                arg0.method897(110);
            } else if (arg2 != 12) {
                if (arg2 == 13) {
                    arg0.method891((byte) -122);
                } else if (arg2 == 14) {
                    arg0.method897(125);
                }
            }
        }
        field1564++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIII)V")
    public static final void method712(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1569++;
        int var6 = arg5;
        int var7 = 0;
        int var8 = arg2 * arg2;
        int var9 = arg5 * arg5;
        int var10 = var8 << 1;
        int var11 = var9 << 1;
        int var12 = arg5 << 1;
        if (arg3 != 2184) {
            field1575 = null;
        }
        int var13 = (1 - var12) * var8 + var11;
        int var14 = var9 - (var12 - 1) * var10;
        int var15 = var9 << 2;
        int var16 = var8 << 2;
        int var17 = ((var7 << 1) + 3) * var11;
        int var18 = (arg5 - 1) * var16;
        int var19 = (var7 + 1) * var15;
        int var20 = ((arg5 << 1) - 3) * var10;
        if (class36.field542 <= arg4 && class175.field2867 >= arg4) {
            int var21 = class149.method1074(arg3 - 2080, class115.field1954, class28.field408, arg0 + arg2);
            int var22 = class149.method1074(arg3 ^ 0x8C7, class115.field1954, class28.field408, arg0 - arg2);
            class242.method1660((byte) -79, class80.field1324[arg4], arg1, var21, var22);
        }
        while (var6 > 0) {
            var6--;
            int var23 = arg4 - var6;
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var17 += var15;
                    var7++;
                    var14 += var19;
                    var19 += var15;
                }
            }
            if (var14 < 0) {
                var7++;
                var13 += var17;
                var14 += var19;
                var19 += var15;
                var17 += var15;
            }
            int var24 = arg4 + var6;
            var13 += -var18;
            if (class36.field542 <= var24 && class175.field2867 >= var23) {
                int var25 = class149.method1074(-73, class115.field1954, class28.field408, arg0 + var7);
                int var26 = class149.method1074(arg3 ^ 0xFFFFF735, class115.field1954, class28.field408, arg0 - var7);
                if (class36.field542 <= var23) {
                    class242.method1660((byte) -79, class80.field1324[var23], arg1, var25, var26);
                }
                if (var24 <= class175.field2867) {
                    class242.method1660((byte) -79, class80.field1324[var24], arg1, var25, var26);
                }
            }
            var18 -= var16;
            var14 += -var20;
            var20 -= var16;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLbf;Lja;I)V")
    public static final void method713(byte arg0, class188 arg1, class55 arg2, int arg3) {
        class124 var4 = new class124();
        var4.field2100 = arg2;
        var4.field1760 = (long) arg3;
        var4.field2107 = 1;
        if (arg0 > -114) {
            field1571 = -50;
        }
        var4.field2102 = arg1;
        field1562++;
        class252 var5 = class14.field207;
        synchronized (class14.field207) {
            class14.field207.method1709(5, var4);
        }
        class264.method1795(5);
    }
}
