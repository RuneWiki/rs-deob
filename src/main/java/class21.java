import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class21 extends class22 {

    @OriginalMember(owner = "client!vg", name = "fb", descriptor = "Ljava/lang/Object;")
    private Object field275;

    @OriginalMember(owner = "client!vg", name = "Z", descriptor = "Leg;")
    public static class37 field269 = class174.method1167(" <col=ffffff>", 121);

    @OriginalMember(owner = "client!vg", name = "eb", descriptor = "Leg;")
    private static class37 field274 = class174.method1167("Unable to find ", -43);

    @OriginalMember(owner = "client!vg", name = "gb", descriptor = "Leg;")
    public static class37 field276 = field274;

    @OriginalMember(owner = "client!vg", name = "hb", descriptor = "Leg;")
    public static class37 field277 = class174.method1167("<br>(X100(U(Y", 78);

    @OriginalMember(owner = "client!vg", name = "bb", descriptor = "Lid;")
    public static class226 field271 = new class226();

    @OriginalMember(owner = "client!vg", name = "ab", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!vg", name = "cb", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!vg", name = "db", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!vg", name = "ib", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(B)Z")
    public final boolean method129(byte arg0) {
        if (arg0 == -124) {
            field272++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "(I)V")
    public static void method130(int arg0) {
        if (arg0 != 2) {
            field277 = null;
        }
        field276 = null;
        field274 = null;
        field271 = null;
        field277 = null;
        field269 = null;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class21(Object arg0) {
        this.field275 = arg0;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lih;IIII)V")
    public static final void method131(class275 arg0, int arg1, int arg2, int arg3, int arg4) {
        field270++;
        if (class159.field2661 >= 400) {
            return;
        }
        if (arg0.field4888 != null) {
            arg0 = arg0.method1854((byte) 68);
        }
        if (arg0 == null || !arg0.field4851) {
            return;
        }
        class37 var5 = arg0.field4846;
        if (arg0.field4826 != 0) {
            var5 = class156.method1061((byte) 45, new class37[] { var5, class88.method585(21722, arg0.field4826, class82.field1285.field3241), class200.field3398, class129.field2155, class163.method1096(arg0.field4826, (byte) -35), class269.field4696 });
        }
        if (class23.field292 == 1) {
            class87.method583(arg1, arg4, class156.method1061((byte) 121, new class37[] { class150.field2523, class88.field1387, var5 }), 29782, (short) 49, (long) arg2, class86.field1365);
            class278.field4919++;
        } else if (!class174.field2924) {
            class186.field3124++;
            class37[] var6 = arg0.field4845;
            if (class146.field2489) {
                var6 = class129.method919(var6, 2047);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class132.field2221 != 0 || !var6[var7].method256(true, class189.field3247))) {
                        class181.field3020++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 39;
                        }
                        if (var7 == 1) {
                            var8 = 33;
                        }
                        if (var7 == 2) {
                            var8 = 1;
                        }
                        if (var7 == 3) {
                            var8 = 11;
                        }
                        if (var7 == 4) {
                            var8 = 17;
                        }
                        class87.method583(arg1, arg4, class156.method1061((byte) 73, new class37[] { class194.field3327, var5 }), 29782, var8, (long) arg2, var6[var7]);
                    }
                }
            }
            if (class132.field2221 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method256(true, class189.field3247)) {
                        short var10 = 0;
                        class249.field4473++;
                        short var11 = 0;
                        if (arg0.field4826 > class82.field1285.field3241) {
                            var10 = 2000;
                        }
                        if (var9 == 0) {
                            var11 = 39;
                        }
                        if (var9 == 1) {
                            var11 = 33;
                        }
                        if (var9 == 2) {
                            var11 = 1;
                        }
                        if (var9 == 3) {
                            var11 = 11;
                        }
                        if (var9 == 4) {
                            var11 = 17;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class87.method583(arg1, arg4, class156.method1061((byte) -96, new class37[] { class194.field3327, var5 }), 29782, var11, (long) arg2, var6[var9]);
                    }
                }
            }
            class87.method583(arg1, arg4, class156.method1061((byte) -88, new class37[] { class194.field3327, var5 }), 29782, (short) 1007, (long) arg2, class47.field753);
        } else if ((class274.field4807 & 0x2) == 2) {
            class87.method583(arg1, arg4, class156.method1061((byte) 100, new class37[] { class93.field1464, class88.field1387, var5 }), 29782, (short) 60, (long) arg2, class147.field2497);
            class35.field506++;
        }
        if (arg3 < 102) {
            method131((class275) null, 48, -84, -82, 5);
        }
    }

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "(I)I")
    public static final int method132(int arg0) {
        field273++;
        if (arg0 != -1) {
            method132(-117);
        }
        return 2;
    }

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public final Object method133(int arg0) {
        field278++;
        if (arg0 != -26125) {
            field269 = null;
        }
        return this.field275;
    }
}
