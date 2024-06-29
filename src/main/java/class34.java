import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class34 extends class37 {

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "I")
    private int field692 = 6;

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "Ll;")
    public static class107 field694 = new class107(4096);

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "Z")
    public static boolean field699 = false;

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "[I")
    public static int[] field701 = new int[500];

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "Lld;")
    public static class111 field700 = new class111(100);

    @OriginalMember(owner = "client!dc", name = "cb", descriptor = "Ldd;")
    private static class35 field704 = class180.method1196((byte) 126, "and choose the (Wcreate account(W");

    @OriginalMember(owner = "client!dc", name = "db", descriptor = "Ldd;")
    public static class35 field705 = class180.method1196((byte) -45, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!dc", name = "ab", descriptor = "I")
    public static int field702 = 0;

    @OriginalMember(owner = "client!dc", name = "bb", descriptor = "Ldd;")
    public static class35 field703 = field704;

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(III)I")
    private final int method314(int arg0, int arg1, int arg2) {
        ++field691;
        int var4 = this.field692;
        if (~var4 != -2) {
            if (var4 != 2) {
                if (~var4 != -4) {
                    if (var4 != 4) {
                        if (var4 != 5) {
                            if (var4 != 6) {
                                if (~var4 != -8) {
                                    if (var4 != 8) {
                                        if (~var4 != -10) {
                                            if (var4 != 10) {
                                                if (~var4 != -12) {
                                                    if (var4 == 12) {
                                                        return -(arg1 * arg2 >> 11) + arg2 + arg1;
                                                    } else {
                                                        if (arg0 != -10) {
                                                            method316(-25);
                                                        }
                                                        return arg1;
                                                    }
                                                } else {
                                                    return arg2 >= arg1 ? -arg1 + arg2 : -arg2 + arg1;
                                                }
                                            } else {
                                                return arg2 < arg1 ? arg1 : arg2;
                                            }
                                        } else {
                                            return arg1 < arg2 ? arg1 : arg2;
                                        }
                                    } else {
                                        return arg1 == 0 ? 0 : -((4096 - arg2 << 12) / arg1) + 4096;
                                    }
                                } else {
                                    return arg1 == 4096 ? 4096 : (arg2 << 12) / (-arg1 + 4096);
                                }
                            } else {
                                return arg2 < 2048 ? arg1 * arg2 >> 11 : 4096 - ((-arg1 + 4096) * (-arg2 + 4096) >> 11);
                            }
                        } else {
                            return -((-arg1 + 4096) * (-arg2 + 4096) >> 12) + 4096;
                        }
                    } else {
                        return arg2 != 0 ? (arg1 << 12) / arg2 : 4096;
                    }
                } else {
                    return arg1 * arg2 >> 12;
                }
            } else {
                return -arg2 + arg1;
            }
        } else {
            return arg1 + arg2;
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(BI)Llg;")
    public static final class114 method315(byte arg0, int arg1) {
        class114 var2 = (class114) class103.field2295.method817(true, (long) arg1);
        int var3 = -38 / ((arg0 - 70) / 38);
        ++field695;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var4 = class100.field2203.method39(8, -1, arg1);
            class114 var5 = new class114();
            if (var4 != null) {
                var5.method825(new class26(var4), 0);
            }
            class103.field2295.method816(var5, (long) arg1, 16);
            return var5;
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class34() {
        super(2, false);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        int[] var3 = super.field816.method1189((byte) 33, arg1);
        if (super.field816.field3661) {
            int[] var4 = this.method369(0, arg1, (byte) 127);
            int[] var5 = this.method369(1, arg1, (byte) 122);
            for (int var6 = 0; ~var6 > ~class72.field1719; ++var6) {
                var3[var6] = this.method314(-10, var4[var6], var5[var6]);
            }
        }
        if (arg0 != 75) {
            this.method314(58, -126, 111);
        }
        ++field697;
        return var3;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        ++field696;
        int[][] var3 = super.field832.method653(-30711, arg0);
        if (super.field832.field1978) {
            int[][] var4 = this.method370(arg0, 0, 3);
            int[][] var5 = this.method370(arg0, 1, 3);
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            for (int var15 = 0; ~var15 > ~class72.field1719; ++var15) {
                var7[var15] = this.method314(-10, var6[var15], var12[var15]);
                var8[var15] = this.method314(-10, var10[var15], var13[var15]);
                var9[var15] = this.method314(-10, var11[var15], var14[var15]);
            }
        }
        if (arg1 < 5) {
            this.field692 = 25;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field825 = arg2.method221(-106) == 1;
            }
        } else {
            this.field692 = arg2.method221(-93);
        }
        if (arg1 != 1) {
            field701 = null;
        }
        ++field693;
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)V")
    public static void method316(int arg0) {
        if (arg0 == 5) {
            field703 = null;
            field700 = null;
            field705 = null;
            field701 = null;
            field694 = null;
            field704 = null;
        }
    }
}
