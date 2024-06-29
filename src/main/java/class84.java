import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class84 extends class202 {

    @OriginalMember(owner = "client!dv", name = "I", descriptor = "Z")
    private boolean field1220 = true;

    @OriginalMember(owner = "client!dv", name = "L", descriptor = "Z")
    private boolean field1223 = true;

    @OriginalMember(owner = "client!dv", name = "N", descriptor = "Lbi;")
    public static class104 field1225 = new class104(87, 19);

    @OriginalMember(owner = "client!dv", name = "P", descriptor = "Lbi;")
    public static class104 field1227 = new class104(21, -1);

    @OriginalMember(owner = "client!dv", name = "T", descriptor = "[[I")
    public static int[][] field1231 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!dv", name = "S", descriptor = "Z")
    public static boolean field1230 = false;

    @OriginalMember(owner = "client!dv", name = "R", descriptor = "[I")
    public static int[] field1229 = new int[500];

    @OriginalMember(owner = "client!dv", name = "J", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!dv", name = "K", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!dv", name = "M", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!dv", name = "O", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!dv", name = "Q", descriptor = "[[I")
    public static int[][] field1228;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field3071 = arg0.method1445(-117) == 1;
                }
            } else {
                this.field1220 = ~arg0.method1445(-79) == -2;
            }
        } else {
            this.field1223 = arg0.method1445(81) == 1;
        }
        int var5 = -89 / ((arg1 - -46) / 50);
        ++field1224;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IZ)[I")
    public final int[] method41(int arg0, boolean arg1) {
        ++field1221;
        int[] var3 = super.field3064.method2452((byte) 100, arg0);
        if (super.field3064.field5837) {
            int[] var4 = this.method1376(1046794076, 0, this.field1220 ? -arg0 + class335.field5237 : arg0);
            if (this.field1223) {
                for (int var5 = 0; ~class276.field4375 < ~var5; ++var5) {
                    var3[var5] = var4[-var5 + class538.field7882];
                }
            } else {
                class324.method2169(var4, 0, var3, 0, class276.field4375);
            }
        }
        if (!arg1) {
            method591((class437) null, -108, -106, -71);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "(III)V")
    public static final void method589(int arg0, int arg1, int arg2) {
        boolean var3 = class217.field3699[0][arg1][arg2] != null && class217.field3699[0][arg1][arg2].field6195 != null;
        for (int var4 = arg0; var4 >= 0; --var4) {
            if (class217.field3699[var4][arg1][arg2] == null) {
                class409 var5 = class217.field3699[var4][arg1][arg2] = new class409(var4, arg1, arg2);
                if (var3) {
                    ++var5.field6174;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "()V")
    public class84() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(B)V")
    public static void method590(byte arg0) {
        field1225 = null;
        if (arg0 != -102) {
            method589(115, -121, 67);
        }
        field1229 = null;
        field1227 = null;
        field1228 = null;
        field1231 = null;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(II)[[I")
    public final int[][] method44(int arg0, int arg1) {
        ++field1226;
        if (arg0 != -1) {
            this.method40((class208) null, (byte) -106, -85);
        }
        int[][] var3 = super.field3081.method1050(arg1, 111);
        if (super.field3081.field2432) {
            int[][] var4 = this.method1382(0, !this.field1220 ? arg1 : -arg1 + class335.field5237, -88);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field1223) {
                for (int var11 = 0; ~var11 > ~class276.field4375; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; ~class276.field4375 < ~var12; ++var12) {
                    var8[var12] = var5[-var12 + class538.field7882];
                    var9[var12] = var6[-var12 + class538.field7882];
                    var10[var12] = var7[-var12 + class538.field7882];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lgi;III)V")
    public static final void method591(class437 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field6590 == 0) {
            arg0.field6666 = arg0.field6633;
        } else if (~arg0.field6590 == -2) {
            arg0.field6666 = (arg3 - arg0.field6615) / 2 + arg0.field6633;
        } else if (arg0.field6590 == 2) {
            arg0.field6666 = arg3 - arg0.field6633 + -arg0.field6615;
        } else if (~arg0.field6590 != -4) {
            if (arg0.field6590 == 4) {
                arg0.field6666 = (arg0.field6633 * arg3 >> 14) + (-arg0.field6615 + arg3) / 2;
            } else {
                arg0.field6666 = -(arg0.field6633 * arg3 >> 14) + -arg0.field6615 + arg3;
            }
        } else {
            arg0.field6666 = arg0.field6633 * arg3 >> 14;
        }
        if (arg0.field6691 != 0) {
            if (~arg0.field6691 != -2) {
                if (arg0.field6691 != 2) {
                    if (~arg0.field6691 != -4) {
                        if (~arg0.field6691 != -5) {
                            arg0.field6644 = -(arg0.field6750 * arg2 >> 14) + -arg0.field6730 + arg2;
                        } else {
                            arg0.field6644 = (-arg0.field6730 + arg2) / 2 - -(arg0.field6750 * arg2 >> 14);
                        }
                    } else {
                        arg0.field6644 = arg0.field6750 * arg2 >> 14;
                    }
                } else {
                    arg0.field6644 = -arg0.field6730 + arg2 + -arg0.field6750;
                }
            } else {
                arg0.field6644 = (-arg0.field6730 + arg2) / 2 - -arg0.field6750;
            }
        } else {
            arg0.field6644 = arg0.field6750;
        }
        ++field1222;
        if (class223.field3757 && (~client.method492(arg0).field7149 != -1 || arg0.field6729 == 0)) {
            if (~arg0.field6666 <= -1) {
                if (~(arg0.field6666 + arg0.field6615) < ~arg3) {
                    arg0.field6666 = arg3 - arg0.field6615;
                }
            } else {
                arg0.field6666 = 0;
            }
            if (~arg0.field6644 <= -1) {
                if (arg2 < arg0.field6730 + arg0.field6644) {
                    arg0.field6644 = -arg0.field6730 + arg2;
                }
            } else {
                arg0.field6644 = 0;
            }
        }
        if (arg1 < 38) {
            field1231 = null;
        }
    }
}
