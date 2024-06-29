import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class44 extends class64 {

    @OriginalMember(owner = "client!ef", name = "jb", descriptor = "I")
    private int field823 = 4;

    @OriginalMember(owner = "client!ef", name = "lb", descriptor = "I")
    private int field825 = 4;

    @OriginalMember(owner = "client!ef", name = "gb", descriptor = "Lsg;")
    public static class169 field820 = class165.method1060("Ihr Spielkonto wurde deaktiviert)3", 1536);

    @OriginalMember(owner = "client!ef", name = "eb", descriptor = "I")
    public static int field818 = 0;

    @OriginalMember(owner = "client!ef", name = "bb", descriptor = "Lsg;")
    private static class169 field815 = class165.method1060("Existing User", 1536);

    @OriginalMember(owner = "client!ef", name = "ib", descriptor = "Lsg;")
    public static class169 field822 = field815;

    @OriginalMember(owner = "client!ef", name = "cb", descriptor = "Lsg;")
    public static class169 field816 = class165.method1060("Musik)2Engine vorbereitet)3", 1536);

    @OriginalMember(owner = "client!ef", name = "mb", descriptor = "Lsg;")
    public static class169 field826 = class165.method1060("Lade Sprites )2 ", 1536);

    @OriginalMember(owner = "client!ef", name = "fb", descriptor = "Lsg;")
    public static class169 field819 = class165.method1060("welle2:", 1536);

    @OriginalMember(owner = "client!ef", name = "nb", descriptor = "I")
    public static int field827 = 0;

    @OriginalMember(owner = "client!ef", name = "db", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!ef", name = "hb", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!ef", name = "kb", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!ef", name = "ob", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!ef", name = "qb", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!ef", name = "rb", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!ef", name = "pb", descriptor = "J")
    public static long field829;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)I")
    public static int method277(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)[I")
    public final int[] method16(int arg0, byte arg1) {
        ++field821;
        if (arg1 != 19) {
            this.field825 = -128;
        }
        int[] var3 = super.field1192.method19((byte) 124, arg0);
        if (super.field1192.field75) {
            int var4 = class103.field1895 / this.field823;
            int var5 = class147.field2715 / this.field825;
            int[] var6;
            if (~var4 >= -1) {
                var6 = this.method394(arg1 + 20312, 0, 0);
            } else {
                int var7 = arg0 % var4;
                var6 = this.method394(arg1 ^ 20344, 0, class103.field1895 * var7 / var4);
            }
            for (int var8 = 0; ~var8 > ~class147.field2715; ++var8) {
                if (~var5 >= -1) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var5;
                    var3[var8] = var6[class147.field2715 * var9 / var5];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)I")
    public static final int method278(int arg0, int arg1) {
        if (arg0 != 130551) {
            return 94;
        } else {
            ++field817;
            return (130551 & arg1) >> 11;
        }
    }

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "(I)V")
    public static void method279(int arg0) {
        field819 = null;
        field822 = null;
        field820 = null;
        field816 = null;
        field826 = null;
        if (arg0 == 2) {
            field815 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
    public class44() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)[[I")
    public final int[][] method59(byte arg0, int arg1) {
        int[][] var3 = super.field1195.method177(1193, arg1);
        if (super.field1195.field532) {
            int var4 = class103.field1895 / this.field823;
            int var5 = class147.field2715 / this.field825;
            int[][] var7;
            if (~var4 < -1) {
                int var6 = arg1 % var4;
                var7 = this.method402(false, class103.field1895 * var6 / var4, 0);
            } else {
                var7 = this.method402(false, 0, 0);
            }
            int[] var8 = var7[1];
            int[] var9 = var7[0];
            int[] var10 = var7[2];
            int[] var11 = var3[1];
            int[] var12 = var3[0];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class147.field2715; ++var14) {
                int var16;
                if (var5 > 0) {
                    int var15 = var14 % var5;
                    var16 = class147.field2715 * var15 / var5;
                } else {
                    var16 = 0;
                }
                var12[var14] = var9[var16];
                var11[var14] = var8[var16];
                var13[var14] = var10[var16];
            }
        }
        ++field828;
        if (arg0 != -40) {
            field819 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZ)Z")
    public static final boolean method280(int arg0, boolean arg1) {
        ++field824;
        if (class48.field871[arg0]) {
            return true;
        } else if (!class21.field447.method556(arg0, 14406)) {
            return false;
        } else {
            int var2 = class21.field447.method570((byte) 113, arg0);
            if (~var2 == -1) {
                class48.field871[arg0] = true;
                return true;
            } else {
                if (class142.field2647[arg0] == null) {
                    class142.field2647[arg0] = new class150[var2];
                }
                for (int var3 = 0; ~var3 > ~var2; ++var3) {
                    if (class142.field2647[arg0][var3] == null) {
                        byte[] var4 = class21.field447.method552(var3, arg0, 0);
                        if (var4 != null) {
                            class142.field2647[arg0][var3] = new class150();
                            class142.field2647[arg0][var3].field2878 = (arg0 << 16) + var3;
                            if (~var4[0] != 0) {
                                class142.field2647[arg0][var3].method993(new class127(var4), (byte) 71);
                            } else {
                                class142.field2647[arg0][var3].method988(new class127(var4), true);
                            }
                        }
                    }
                }
                class48.field871[arg0] = arg1;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        int var4 = -20 / ((arg0 - -60) / 36);
        ++field831;
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field823 = arg1.method819((byte) 22);
            }
        } else {
            this.field825 = arg1.method819((byte) 22);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIB)V")
    public static final void method281(int arg0, int arg1, byte arg2) {
        ++field830;
        if (class20.field436 >= 2 || ~class141.field2630 != -1 || class17.field380) {
            class169 var3;
            if (class141.field2630 == 1 && ~class20.field436 > -3) {
                var3 = class165.method1058(0, new class169[] { class73.field1368, class129.field2405, class16.field341, class184.field3597 });
            } else if (class17.field380 && ~class20.field436 > -3) {
                var3 = class165.method1058(0, new class169[] { class137.field2551, class129.field2405, class21.field455, class184.field3597 });
            } else {
                var3 = class147.method962(true, class20.field436 + -1);
            }
            if (arg2 == 48) {
                if (class20.field436 > 2) {
                    var3 = class165.method1058(0, new class169[] { var3, class199.field3900, class2.method18((byte) -62, class20.field436 + -2), class154.field2972 });
                }
                int var4 = class98.field1839.method730(var3, arg0 + 4, arg1 + 15, 16777215, 0, class63.field1153, class144.field2678);
                class5.method35(15, var4 + class98.field1839.method736(var3), true, arg0 + 4, arg1);
            }
        }
    }
}
