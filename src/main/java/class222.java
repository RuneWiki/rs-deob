import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class222 extends class44 {

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    private int field3587;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    private int field3594;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "I")
    private int field3595;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "I")
    private int field3600;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "[I")
    public static int[] field3591 = new int[500];

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!re", name = "x", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!re", name = "A", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
    public static final void method1506(byte arg0) {
        class228.field3696 = null;
        int var1 = -11 % ((arg0 - 51) / 55);
        ++field3589;
        class101.field1574 = null;
        class206.field3221 = null;
        class72.field1023 = null;
        class226.field3653 = null;
        class236.field3777 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lbd;I)I")
    public static final int method1507(class186 arg0, int arg1) {
        ++field3598;
        int var2 = arg0.field2914;
        if (arg1 != 0) {
            return 58;
        } else {
            class85 var3 = arg0.method564(arg1 ^ 126);
            if (~arg0.field1196 == ~var3.field1319) {
                var2 = arg0.field2920;
            } else if (~arg0.field1196 != ~var3.field1354 && ~arg0.field1196 != ~var3.field1353 && arg0.field1196 != var3.field1356 && arg0.field1196 != var3.field1340) {
                if (arg0.field1196 == var3.field1336 || ~arg0.field1196 == ~var3.field1334 || ~arg0.field1196 == ~var3.field1323 || ~arg0.field1196 == ~var3.field1338) {
                    var2 = arg0.field2934;
                }
            } else {
                var2 = arg0.field2913;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method1508(byte arg0, Component arg1) {
        arg1.addMouseListener(class39.field526);
        ++field3599;
        arg1.addMouseMotionListener(class39.field526);
        arg1.addFocusListener(class39.field526);
        int var2 = -84 % ((-69 - arg0) / 48);
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V")
    public static final void method1509(int arg0) {
        ++field3590;
        class13.field165.method892(243, (byte) -88);
        for (class35 var1 = (class35) class2.field22.method671(0); var1 != null; var1 = (class35) class2.field22.method666(-119)) {
            if (~var1.field445 == -1) {
                class102.method680(0, var1, true);
            }
        }
        if (arg0 == 29191) {
            ++class149.field2210;
            if (class249.field3995 != null) {
                class55.method397(arg0 + -29191, class249.field3995);
                class249.field3995 = null;
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III)V")
    public final void method332(int arg0, int arg1, int arg2) {
        if (arg1 <= 113) {
            this.field3595 = -41;
        }
        ++field3593;
        int var4 = this.field3600 * arg0 >> 12;
        int var5 = this.field3595 * arg2 >> 12;
        int var6 = this.field3587 * arg0 >> 12;
        int var7 = this.field3594 * arg2 >> 12;
        class64.method442(super.field567, var7, super.field565, super.field564, -18472, var6, var5, var4);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)Lda;")
    public static final class185 method1510(int arg0, int arg1) {
        ++field3592;
        class185 var2 = (class185) class229.field3706.method1428((long) arg1, (byte) -74);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class201.field3158.method807((byte) 126, arg1, 4);
            class185 var4 = new class185();
            if (var3 != null) {
                var4.method1288(new class25(var3), arg1, arg0 + 6822);
            }
            class229.field3706.method1424((long) arg1, var4, -2003648287);
            if (arg0 != -6822) {
                method1514(-112, -116, 101);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZII)I")
    public static final int method1511(int arg0, boolean arg1, int arg2, int arg3) {
        class33 var4 = (class33) class82.field1233.method665((byte) -50, (long) arg2);
        ++field3602;
        if (var4 == null) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var4.field426.length > var6; ++var6) {
                if (var4.field426[var6] >= 0 && var4.field426[var6] < class98.field1529) {
                    class253 var7 = class162.method1112(var4.field426[var6], (byte) 127);
                    if (var7.field4094 != null) {
                        class179 var8 = (class179) var7.field4094.method665((byte) 77, (long) arg3);
                        if (var8 != null) {
                            if (arg1) {
                                var5 += var4.field428[var6] * var8.field2791;
                            } else {
                                var5 += var8.field2791;
                            }
                        }
                    }
                }
            }
            if (arg0 != 32290) {
                method1515(47);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(II)Lfi;")
    public static final class110 method1512(int arg0, int arg1) {
        ++field3597;
        class110 var2 = (class110) class5.field77.method765((long) arg1, 0);
        if (arg0 != -2) {
            method1516(-11, -26, -6, 49, -48, -29, 97, -30);
        }
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class153.field2283.method807((byte) 97, arg1, 11);
            class110 var4 = new class110();
            if (var3 != null) {
                var4.method723(new class25(var3), -62);
            }
            class5.field77.method763(74, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILdl;)V")
    public static final void method1513(int arg0, class123 arg1) {
        if (arg0 != 9970) {
            method1517(60, (byte) 84);
        }
        ++field3586;
        class107.field1652 = arg1;
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(III)Ljh;")
    public static final class284 method1514(int arg0, int arg1, int arg2) {
        class49 var3 = class90.field1382[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            for (int var4 = 0; var4 < var3.field639; ++var4) {
                class284 var5 = var3.field643[var4];
                if ((var5.field4497 >> 29 & 3L) == 2L && var5.field4494 == arg1 && var5.field4498 == arg2) {
                    return var5;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(III)V")
    public final void method333(int arg0, int arg1, int arg2) {
        ++field3585;
        int var4 = this.field3600 * arg1 >> 12;
        int var5 = this.field3587 * arg1 >> 12;
        int var6 = this.field3595 * arg2 >> 12;
        int var7 = this.field3594 * arg2 >> 12;
        class36.method282(super.field564, var7, var4, arg0 + 64, var5, var6);
        if (arg0 != 0) {
            this.method332(32, 117, -77);
        }
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(I)V")
    public static void method1515(int arg0) {
        if (arg0 >= 42) {
            field3591 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3588;
        if (arg3 != 8) {
            field3591 = null;
        }
        if (arg0 >= 1 && ~arg7 <= -2 && ~arg0 >= -103 && arg7 <= 102) {
            if (!class26.method227(10920) && ~(2 & class35.field449[0][arg0][arg7]) == -1) {
                int var8 = arg1;
                if ((class35.field449[arg1][arg0][arg7] & 8) != 0) {
                    var8 = 0;
                }
                if (class104.field1610 != var8) {
                    return;
                }
            }
            int var9 = arg1;
            if (arg1 < 3 && (class35.field449[1][arg0][arg7] & 2) == 2) {
                var9 = arg1 + 1;
            }
            class141.method946(var9, false, arg7, arg1, arg0, class290.field4574[arg1], arg6);
            if (arg5 >= 0) {
                boolean var10 = class143.field2098;
                class143.field2098 = true;
                class56.method412(arg7, class290.field4574[arg1], (byte) 125, false, arg4, arg2, var9, arg0, arg1, arg5, false);
                class143.field2098 = var10;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(IB)V")
    public static final void method1517(int arg0, byte arg1) {
        ++field3596;
        class179.field2790.method1425(arg0, -114);
        int var2 = -60 / ((38 - arg1) / 47);
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(IIIIIII)V")
    public class222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3587 = arg2;
        this.field3594 = arg3;
        this.field3595 = arg1;
        this.field3600 = arg0;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IBI)V")
    public final void method336(int arg0, byte arg1, int arg2) {
        ++field3601;
        if (arg1 != 43) {
            this.field3587 = -119;
        }
    }
}
