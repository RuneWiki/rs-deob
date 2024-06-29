import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class15 extends class93 {

    @OriginalMember(owner = "client!bd", name = "Y", descriptor = "I")
    private int field425 = 6;

    @OriginalMember(owner = "client!bd", name = "X", descriptor = "Z")
    public static boolean field424 = false;

    @OriginalMember(owner = "client!bd", name = "bb", descriptor = "[I")
    public static int[] field428 = new int[25];

    @OriginalMember(owner = "client!bd", name = "ab", descriptor = "Loe;")
    public static class139 field427 = new class139(20);

    @OriginalMember(owner = "client!bd", name = "kb", descriptor = "Ljd;")
    private static class92 field437 = class202.method1325((byte) 90, "Connecting to server)3)3)3");

    @OriginalMember(owner = "client!bd", name = "gb", descriptor = "[I")
    public static int[] field433 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!bd", name = "ib", descriptor = "Ljd;")
    public static class92 field435 = field437;

    @OriginalMember(owner = "client!bd", name = "jb", descriptor = "Ljd;")
    private static class92 field436 = class202.method1325((byte) 90, "yellow:");

    @OriginalMember(owner = "client!bd", name = "fb", descriptor = "Ljd;")
    public static class92 field432 = field436;

    @OriginalMember(owner = "client!bd", name = "hb", descriptor = "Ljd;")
    public static class92 field434 = field436;

    @OriginalMember(owner = "client!bd", name = "S", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!bd", name = "T", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!bd", name = "U", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!bd", name = "V", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!bd", name = "Z", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!bd", name = "cb", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!bd", name = "db", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!bd", name = "eb", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!bd", name = "mb", descriptor = "Lud;")
    public static class192 field439;

    @OriginalMember(owner = "client!bd", name = "W", descriptor = "Ljc;")
    public static class91 field423;

    @OriginalMember(owner = "client!bd", name = "lb", descriptor = "[I")
    public static int[] field438;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                super.field1885 = ~arg1.method443(arg2 + 255) == -2;
            }
        } else {
            this.field425 = arg1.method443(arg2 + 255);
        }
        if (arg2 == 0) {
            ++field426;
        }
    }

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)V")
    public static void method89(int arg0) {
        field432 = null;
        field435 = null;
        field427 = null;
        if (arg0 != 4096) {
            field424 = true;
        }
        field433 = null;
        field438 = null;
        field434 = null;
        field437 = null;
        field439 = null;
        field436 = null;
        field423 = null;
        field428 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBI)I")
    private final int method90(int arg0, byte arg1, int arg2) {
        ++field430;
        int var4 = this.field425;
        if (var4 != 1) {
            if (var4 != 2) {
                if (~var4 != -4) {
                    if (var4 != 4) {
                        if (var4 != 5) {
                            if (~var4 != -7) {
                                if (var4 != 7) {
                                    if (~var4 != -9) {
                                        if (~var4 != -10) {
                                            if (~var4 != -11) {
                                                if (var4 != 11) {
                                                    if (var4 == 12) {
                                                        return arg0 - (arg0 * arg2 >> 11) + arg2;
                                                    } else {
                                                        if (arg1 != -75) {
                                                            field423 = null;
                                                        }
                                                        return arg2;
                                                    }
                                                } else {
                                                    return arg2 <= arg0 ? -arg2 + arg0 : arg2 - arg0;
                                                }
                                            } else {
                                                return ~arg2 >= ~arg0 ? arg0 : arg2;
                                            }
                                        } else {
                                            return arg0 > arg2 ? arg2 : arg0;
                                        }
                                    } else {
                                        return ~arg2 == -1 ? 0 : -((-arg0 + 4096 << 12) / arg2) + 4096;
                                    }
                                } else {
                                    return arg2 == 4096 ? 4096 : (arg0 << 12) / (-arg2 + 4096);
                                }
                            } else {
                                return ~arg0 > -2049 ? arg0 * arg2 >> 11 : 4096 - ((4096 - arg0) * (-arg2 + 4096) >> 11);
                            }
                        } else {
                            return 4096 - ((-arg0 + 4096) * (-arg2 + 4096) >> 12);
                        }
                    } else {
                        return ~arg0 == -1 ? 4096 : (arg2 << 12) / arg0;
                    }
                } else {
                    return arg0 * arg2 >> 12;
                }
            } else {
                return -arg0 + arg2;
            }
        } else {
            return arg2 - -arg0;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZLnh;Lnh;)V")
    public static final void method91(boolean arg0, class133 arg1, class133 arg2) {
        if (!arg0) {
            field434 = null;
        }
        class119.field2408 = arg2;
        ++field431;
        class73.field1538 = arg1;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(III)Z")
    public static final boolean method92(int arg0, int arg1, int arg2) {
        int var3 = class81.field1643[arg0][arg1][arg2];
        if (-class96.field1931 == var3) {
            return false;
        } else if (class96.field1931 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class80.method543(var4 + 1, class158.field3146[arg0][arg1][arg2], var5 + 1) && class80.method543(var4 + 128 - 1, class158.field3146[arg0][arg1 + 1][arg2], var5 + 1) && class80.method543(var4 + 128 - 1, class158.field3146[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class80.method543(var4 + 1, class158.field3146[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class81.field1643[arg0][arg1][arg2] = class96.field1931;
                return true;
            } else {
                class81.field1643[arg0][arg1][arg2] = -class96.field1931;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BZLjd;)V")
    public static final void method93(byte arg0, boolean arg1, class92 arg2) {
        byte var3 = 4;
        if (arg0 != -90) {
            field436 = null;
        }
        ++field429;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class176.field3387.method1002(arg2, 250);
        int var7 = class176.field3387.method997(arg2, 250) * 13;
        class163.method1049(-var3 + var4, -var3 + var5, var3 + var6 + var3, var3 + var7 + var3, 0);
        class163.method1053(-var3 + var4, -var3 + var5, var3 + var6 + var3, var3 + var7 + var3, 16777215);
        class176.field3387.method982(arg2, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class168.method1116(var6 - (-var3 - var3), (byte) 82, var4 - var3, var3 + var7 - -var3, -var3 + var5);
        if (!arg1) {
            class130.method858(var7, var5, var6, false, var4);
        } else {
            try {
                Graphics var8 = class153.field3032.getGraphics();
                class77.field1605.method566(101, var8, 0, 0);
            } catch (Exception var9) {
                class153.field3032.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)[[I")
    public final int[][] method62(int arg0, int arg1) {
        if (arg1 != 4096) {
            field434 = null;
        }
        ++field421;
        int[][] var3 = super.field1873.method553(arg0, arg1 + -4096);
        if (super.field1873.field1656) {
            int[][] var4 = this.method649(0, true, arg0);
            int[][] var5 = this.method649(1, true, arg0);
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            int[] var8 = var3[0];
            int[] var9 = var4[1];
            int[] var10 = var4[0];
            int[] var11 = var5[0];
            int[] var12 = var4[2];
            int[] var13 = var5[2];
            int[] var14 = var5[1];
            for (int var15 = 0; ~class150.field2985 < ~var15; ++var15) {
                var8[var15] = this.method90(var11[var15], (byte) -75, var10[var15]);
                var6[var15] = this.method90(var14[var15], (byte) -75, var9[var15]);
                var7[var15] = this.method90(var13[var15], (byte) -75, var12[var15]);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
    public class15() {
        super(2, false);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        ++field419;
        int[] var3 = super.field1887.method916(arg0, -37);
        if (super.field1887.field2757) {
            int[] var4 = this.method648((byte) 84, arg0, 0);
            int[] var5 = this.method648((byte) 101, arg0, 1);
            for (int var6 = 0; class150.field2985 > var6; ++var6) {
                var3[var6] = this.method90(var5[var6], (byte) -75, var4[var6]);
            }
        }
        int var7 = -40 / ((67 - arg1) / 42);
        return var3;
    }
}
