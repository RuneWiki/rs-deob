import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class78 extends class452 {

    @OriginalMember(owner = "client!mn", name = "t", descriptor = "I")
    private int field1070;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
    private int field1062;

    @OriginalMember(owner = "client!mn", name = "u", descriptor = "I")
    private int field1071;

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "I")
    private int field1063;

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
    private int field1060;

    @OriginalMember(owner = "client!mn", name = "p", descriptor = "I")
    private int field1066;

    @OriginalMember(owner = "client!mn", name = "w", descriptor = "I")
    private int field1073;

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "I")
    private int field1064;

    @OriginalMember(owner = "client!mn", name = "v", descriptor = "Lbc;")
    public static class284 field1072 = new class284();

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!mn", name = "o", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!mn", name = "q", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!mn", name = "r", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!mn", name = "s", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!mn", name = "x", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!mn", name = "y", descriptor = "Lqj;")
    public static class238 field1075;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V", line = 4)
    public static void method491(int arg0) {
        if (arg0 != 0) {
            field1075 = null;
        }
        field1072 = null;
        field1075 = null;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(III)V", line = 18)
    public final void method492(int arg0, int arg1, int arg2) {
        ++field1065;
        if (arg2 != 0) {
            this.field1060 = -38;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IZI)V", line = 35)
    public final void method493(int arg0, boolean arg1, int arg2) {
        ++field1069;
        int var4 = this.field1071 * arg2 >> 12;
        int var5 = this.field1060 * arg0 >> 12;
        int var6 = this.field1062 * arg2 >> 12;
        int var7 = this.field1066 * arg0 >> 12;
        int var8 = this.field1063 * arg2 >> 12;
        int var9 = this.field1064 * arg0 >> 12;
        int var10 = this.field1070 * arg2 >> 12;
        int var11 = this.field1073 * arg0 >> 12;
        class411.method2675(super.field6585, var7, var9, var8, var4, var5, var10, arg1, var11, var6);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lil;I)V", line = 65)
    public static final void method494(class265 arg0, int arg1) {
        ++field1067;
        byte[] var2 = new byte[24];
        if (class228.field3220 != null) {
            try {
                class228.field3220.method408(0, 0L);
                class228.field3220.method410(-1, var2);
                int var3;
                for (var3 = 0; var3 < 24 && ~var2[var3] == -1; ++var3) {
                }
                if (~var3 <= -25) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var4 = 0; var4 < 24; ++var4) {
                    var2[var4] = -1;
                }
            }
        }
        int var5 = -108 % ((arg1 - -68) / 32);
        arg0.method1676(0, -86, var2, 24);
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 111)
    public class78(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field1070 = arg6;
        this.field1062 = arg2;
        this.field1071 = arg0;
        this.field1063 = arg4;
        this.field1060 = arg1;
        this.field1066 = arg3;
        this.field1073 = arg7;
        this.field1064 = arg5;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZIZIIIII)V", line = 135)
    public static final void method495(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1061;
        if (arg2 || class93.field1276 != arg3 || class249.field3539 != arg1 || class431.field6368 != arg5 && !class116.method810((byte) -32)) {
            class93.field1276 = arg3;
            class431.field6368 = arg5;
            class249.field3539 = arg1;
            if (class116.method810((byte) 124)) {
                class431.field6368 = 0;
            }
            if (!arg0) {
                class199.method1251(25, (byte) -126);
            } else {
                class199.method1251(28, (byte) -126);
            }
            class132.method898(true, arg6 ^ -29830, class284.field4157, class311.field4456);
            int var8 = class184.field2482;
            int var9 = class38.field620;
            class184.field2482 = (-(class324.field4652 >> 4) + class93.field1276) * 8;
            class38.field620 = (-(class336.field4964 >> 4) + class249.field3539) * 8;
            class424.field6307 = class76.method483(class93.field1276 * 8, class249.field3539 * 8);
            class403.field5987 = null;
            int var10 = -var8 + class184.field2482;
            int var11 = -var9 + class38.field620;
            if (!arg0) {
                for (int var12 = 0; var12 < 32768; ++var12) {
                    class129 var13 = class23.field408[var12];
                    if (var13 != null) {
                        for (int var14 = 0; ~var14 > -11; ++var14) {
                            var13.field303[var14] -= var10;
                            var13.field306[var14] -= var11;
                        }
                        var13.field5284 -= var10 * 128;
                        var13.field5298 -= var11 * 128;
                    }
                }
            } else {
                class191.field2662 = 0;
                int var15 = class324.field4652 * 128 - 128;
                int var16 = class336.field4964 * 128 + -128;
                for (int var17 = 0; ~var17 > -32769; ++var17) {
                    class129 var22 = class23.field408[var17];
                    if (var22 != null) {
                        var22.field5298 -= var11 * 128;
                        var22.field5284 -= var10 * 128;
                        if (~var22.field5284 <= -1 && var22.field5284 <= var15 && ~var22.field5298 <= -1 && var16 >= var22.field5298) {
                            boolean var23 = true;
                            for (int var24 = 0; ~var24 > -11; ++var24) {
                                var22.field303[var24] -= var10;
                                var22.field306[var24] -= var11;
                                if (~var22.field303[var24] > -1 || class324.field4652 <= var22.field303[var24] || var22.field306[var24] < 0 || var22.field306[var24] >= class336.field4964) {
                                    var23 = false;
                                }
                            }
                            if (!var23) {
                                class23.field408[var17].method877(arg6 + -146, (class373) null);
                                class23.field408[var17] = null;
                            } else {
                                class416.field6202[class191.field2662++] = var17;
                            }
                        } else {
                            class23.field408[var17].method877(-72, (class373) null);
                            class23.field408[var17] = null;
                        }
                    }
                }
            }
            for (int var18 = 0; var18 < 2048; ++var18) {
                class194 var20 = class125.field1664[var18];
                if (var20 != null) {
                    for (int var21 = 0; ~var21 > -11; ++var21) {
                        var20.field303[var21] -= var10;
                        var20.field306[var21] -= var11;
                    }
                    var20.field5284 -= var10 * 128;
                    var20.field5298 -= var11 * 128;
                }
            }
            class193.field2688 = arg5;
            class100.field1350.method1215(false, true, arg4, class193.field2688, arg7);
            class307.method1927(var11, var10, 16383);
            for (class370 var19 = (class370) class370.field5503.method2649(0); var19 != null; var19 = (class370) class370.field5503.method2656(0)) {
                var19.field5490 -= var11;
                var19.field5498 -= var10;
                if (~var19.field5498 > -1 || var19.field5490 < 0 || var19.field5498 >= class324.field4652 || ~class336.field4964 >= ~var19.field5490) {
                    var19.method2574((byte) 127);
                }
            }
            class7.field64 = 0;
            if (~class82.field1154 != -1) {
                class82.field1154 -= var10;
                class70.field967 -= var11;
            }
            if (!arg0) {
                if (~class5.field48 != -5) {
                    class5.field48 = 1;
                } else {
                    class370.field5511 -= var11 * 128;
                    class146.field1915 -= var11 * 128;
                    class64.field902 -= var10 * 128;
                    class309.field4409 -= var10 * 128;
                }
            } else {
                class7.field71 -= var11 * 128;
                class95.field1306 -= var10;
                class387.field5781 -= var10;
                class235.field3309 -= var11;
                class148.field1956 -= var11;
                class237.field3326 -= var10 * 128;
                if (Math.abs(var10) > class324.field4652 || ~Math.abs(var11) < ~class336.field4964) {
                    class144.method964(-37);
                }
            }
            class235.method1435((byte) 33);
            class122.method842((byte) 50);
            class119.field1599.method2654(0);
            class45.field669.method2654(0);
            class376.field5683.method977(arg6 ^ arg6);
            class355.method2329((byte) -6);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIB)V", line = 346)
    public final void method496(int arg0, int arg1, byte arg2) {
        if (arg2 != 75) {
            this.field1066 = -128;
        }
        ++field1068;
    }
}
