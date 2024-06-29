import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class42 extends class228 {

    @OriginalMember(owner = "client!ji", name = "Y", descriptor = "[I")
    public static int[] field710 = new int[4096];

    @OriginalMember(owner = "client!ji", name = "eb", descriptor = "Z")
    public static boolean field716;

    @OriginalMember(owner = "client!ji", name = "db", descriptor = "[I")
    public static int[] field715;

    @OriginalMember(owner = "client!ji", name = "fb", descriptor = "Ltf;")
    public static class107 field717;

    @OriginalMember(owner = "client!ji", name = "hb", descriptor = "Loa;")
    public static class99 field719;

    @OriginalMember(owner = "client!ji", name = "gb", descriptor = "Loa;")
    private static class99 field718;

    @OriginalMember(owner = "client!ji", name = "bb", descriptor = "Loa;")
    public static class99 field713;

    @OriginalMember(owner = "client!ji", name = "cb", descriptor = "Loa;")
    public static class99 field714;

    @OriginalMember(owner = "client!ji", name = "S", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!ji", name = "T", descriptor = "I")
    private int field705;

    @OriginalMember(owner = "client!ji", name = "U", descriptor = "I")
    private int field706;

    @OriginalMember(owner = "client!ji", name = "V", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!ji", name = "W", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!ji", name = "X", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!ji", name = "Z", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!ji", name = "ab", descriptor = "I")
    private int field712;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        ++field704;
        if (~arg0 == -1) {
            this.method317(arg1.method1747(false), (byte) -59);
        }
        if (arg2 != -7618) {
            field714 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(I)V")
    private class42(int arg0) {
        super(0, false);
        this.method317(arg0, (byte) -59);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IB)V")
    private final void method317(int arg0, byte arg1) {
        this.field705 = (arg0 & 255) << 4;
        ++field707;
        if (arg1 != -59) {
            field717 = null;
        }
        this.field712 = (65280 & arg0) >> 4;
        this.field706 = (16711680 & arg0) >> 12;
    }

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "(B)V")
    public static void method318(byte arg0) {
        field717 = null;
        field713 = null;
        field715 = null;
        field710 = null;
        field714 = null;
        field718 = null;
        field719 = null;
        if (arg0 != 112) {
            method319(-90, 2, (byte) -115, 13, (class257) null);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BI)[[I")
    public final int[][] method19(byte arg0, int arg1) {
        if (arg0 != -27) {
            method319(-15, 13, (byte) 125, -98, (class257) null);
        }
        int[][] var3 = super.field3948.method1797(arg1, (byte) -124);
        if (super.field3948.field4791) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class234.field4046; ++var7) {
                var4[var7] = this.field706;
                var5[var7] = this.field712;
                var6[var7] = this.field705;
            }
        }
        ++field708;
        return var3;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
    public class42() {
        this(0);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIBILii;)V")
    public static final void method319(int arg0, int arg1, byte arg2, int arg3, class257 arg4) {
        ++field709;
        if (arg2 >= -88) {
            field715 = null;
        }
        if (class258.field4497 < 400) {
            if (arg4.field4491 != null) {
                arg4 = arg4.method1667(92);
            }
            if (arg4 != null) {
                if (arg4.field4438) {
                    class99 var5 = arg4.field4436;
                    if (arg4.field4453 != 0) {
                        var5 = class198.method1332(76, new class99[] { var5, class174.method1166(class168.field3006.field3252, false, arg4.field4453), class100.field1712, class210.field3652, class198.method1333(-86, arg4.field4453), class31.field558 });
                    }
                    if (class150.field2647 == 1) {
                        class173.method1163(class258.field4503, class198.method1332(81, new class99[] { class63.field1074, class167.field2991, var5 }), arg0, (short) 34, 108, arg1, (long) arg3);
                        ++class35.field620;
                    } else {
                        if (class54.field896) {
                            if (~(class33.field592 & 2) == -3) {
                                ++class273.field4823;
                                class173.method1163(class169.field3018, class198.method1332(111, new class99[] { class93.field1562, class167.field2991, var5 }), arg0, (short) 22, 89, arg1, (long) arg3);
                                return;
                            }
                        } else {
                            ++class272.field4813;
                            class99[] var6 = arg4.field4488;
                            if (class65.field1101) {
                                var6 = class29.method251((byte) 66, var6);
                            }
                            if (var6 != null) {
                                for (int var7 = 4; ~var7 <= -1; --var7) {
                                    if (var6[var7] != null && (~class34.field613 != -1 || !var6[var7].method706(class199.field3461, 124))) {
                                        ++class50.field813;
                                        byte var8 = 0;
                                        if (var7 == 0) {
                                            var8 = 50;
                                        }
                                        if (var7 == 1) {
                                            var8 = 49;
                                        }
                                        if (var7 == 2) {
                                            var8 = 1;
                                        }
                                        if (var7 == 3) {
                                            var8 = 25;
                                        }
                                        if (var7 == 4) {
                                            var8 = 58;
                                        }
                                        class173.method1163(var6[var7], class198.method1332(82, new class99[] { class145.field2547, var5 }), arg0, var8, 121, arg1, (long) arg3);
                                    }
                                }
                            }
                            if (class34.field613 == 0 && var6 != null) {
                                for (int var9 = 4; var9 >= 0; --var9) {
                                    if (var6[var9] != null && var6[var9].method706(class199.field3461, 126)) {
                                        ++class208.field3598;
                                        short var10 = 0;
                                        if (~arg4.field4453 < ~class168.field3006.field3252) {
                                            var10 = 2000;
                                        }
                                        short var11 = 0;
                                        if (~var9 == -1) {
                                            var11 = 50;
                                        }
                                        if (~var9 == -2) {
                                            var11 = 49;
                                        }
                                        if (~var9 == -3) {
                                            var11 = 1;
                                        }
                                        if (var9 == 3) {
                                            var11 = 25;
                                        }
                                        if (~var9 == -5) {
                                            var11 = 58;
                                        }
                                        if (~var11 != -1) {
                                            var11 += var10;
                                        }
                                        class173.method1163(var6[var9], class198.method1332(111, new class99[] { class145.field2547, var5 }), arg0, var11, 127, arg1, (long) arg3);
                                    }
                                }
                            }
                            class173.method1163(class133.field2323, class198.method1332(115, new class99[] { class145.field2547, var5 }), arg0, (short) 1001, 124, arg1, (long) arg3);
                        }
                    }
                }
            }
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; ++var0) {
            field710[var0] = class254.method1645(57, var0);
        }
        field716 = true;
        field715 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
        field717 = null;
        field719 = class221.method1463(2844, "zap");
        field718 = class221.method1463(2844, "flash3:");
        field713 = field718;
        field714 = field718;
    }
}
