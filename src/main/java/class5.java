import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class5 extends class170 {

    @OriginalMember(owner = "client!ti", name = "Z", descriptor = "Lqk;")
    public static class207 field75 = class24.method212(255, "<)4col>");

    @OriginalMember(owner = "client!ti", name = "db", descriptor = "I")
    public static int field79 = (int) (Math.random() * 17.0D) + -8;

    @OriginalMember(owner = "client!ti", name = "gb", descriptor = "Lqk;")
    public static class207 field82 = class24.method212(255, "Liste der Welten geladen");

    @OriginalMember(owner = "client!ti", name = "fb", descriptor = "Lqk;")
    private static class207 field81 = class24.method212(255, "white:");

    @OriginalMember(owner = "client!ti", name = "bb", descriptor = "I")
    public static int field77 = 0;

    @OriginalMember(owner = "client!ti", name = "hb", descriptor = "Lqk;")
    public static class207 field83 = field81;

    @OriginalMember(owner = "client!ti", name = "eb", descriptor = "Lqk;")
    public static class207 field80 = field81;

    @OriginalMember(owner = "client!ti", name = "W", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!ti", name = "X", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!ti", name = "Y", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!ti", name = "ab", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!ti", name = "cb", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!ti", name = "ib", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!ti", name = "jb", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!ti", name = "kb", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
    public class5() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZLpk;I)Lbl;")
    public static final class33 method28(boolean arg0, class99 arg1, int arg2) {
        ++field76;
        if (arg0) {
            method35((class99) null, (class99) null, (byte) 39);
        }
        return !class135.method943(arg2, arg1, 2) ? null : class131.method917((byte) -111);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        ++field73;
        if (arg2 == 0) {
            super.field2998 = arg0.method1045((byte) -115) == 1;
        }
        if (arg1 != 5877) {
            field83 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == arg2 && arg3 == arg4) {
            if (!class88.method642(arg0, arg1, arg3)) {
                return false;
            } else {
                int var6 = arg1 << 7;
                int var7 = arg3 << 7;
                return class4.method27(var6 + 1, class163.field2881[arg0][arg1][arg3] + arg5, var7 + 1) && class4.method27(var6 + 128 - 1, class163.field2881[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class4.method27(var6 + 128 - 1, class163.field2881[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class4.method27(var6 + 1, class163.field2881[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
            }
        } else {
            for (int var8 = arg1; var8 <= arg2; ++var8) {
                for (int var14 = arg3; var14 <= arg4; ++var14) {
                    if (class204.field3598[arg0][var8][var14] == -class147.field2528) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class163.field2881[arg0][arg1][arg3] + arg5;
            if (!class4.method27(var9, var11, var10)) {
                return false;
            } else {
                int var12 = (arg2 << 7) - 1;
                if (!class4.method27(var12, var11, var10)) {
                    return false;
                } else {
                    int var13 = (arg4 << 7) - 1;
                    if (!class4.method27(var9, var11, var13)) {
                        return false;
                    } else if (!class4.method27(var12, var11, var13)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(BI)[I")
    public final int[] method31(byte arg0, int arg1) {
        if (arg0 != -30) {
            method36(-122);
        }
        ++field84;
        int[] var3 = super.field3001.method1538(118, arg1);
        if (super.field3001.field3835) {
            int[] var4 = this.method1226(0, arg1, 110);
            int[] var5 = this.method1226(1, arg1, 105);
            int[] var6 = this.method1226(2, arg1, -120);
            for (int var7 = 0; ~var7 > ~class88.field1595; ++var7) {
                int var8 = var6[var7];
                if (~var8 != -4097) {
                    if (~var8 != -1) {
                        var3[var7] = var4[var7] * var8 - -((-var8 + 4096) * var5[var7]) >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method32(int arg0, boolean arg1) {
        if (arg1) {
            method34((byte) 101);
        }
        ++field86;
        int[][] var3 = super.field3002.method427(arg0, 239);
        if (super.field3002.field1077) {
            int[] var4 = this.method1226(2, arg0, -109);
            int[][] var5 = this.method1223(0, -118, arg0);
            int[][] var6 = this.method1223(1, -126, arg0);
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; class88.field1595 > var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 != -4097) {
                    if (~var17 != -1) {
                        int var18 = 4096 - var17;
                        var9[var16] = var10[var16] * var17 - -(var13[var16] * var18) >> 12;
                        var8[var16] = var11[var16] * var17 - -(var14[var16] * var18) >> 12;
                        var7[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    } else {
                        var9[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var7[var16] = var15[var16];
                    }
                } else {
                    var9[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var7[var16] = var12[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BLpk;)V")
    public static final void method33(byte arg0, class99 arg1) {
        ++field74;
        if (arg0 <= 32) {
            method30(-58, -92, 0, 112, 107, -29);
        }
        class230.field4216 = arg1;
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(B)V")
    public static void method34(byte arg0) {
        int var1 = 73 / ((arg0 - -49) / 56);
        field82 = null;
        field80 = null;
        field81 = null;
        field83 = null;
        field75 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lpk;Lpk;B)V")
    public static final void method35(class99 arg0, class99 arg1, byte arg2) {
        ++field85;
        class243.field4419 = arg0;
        class44.field869 = arg1;
        int var3 = 83 % ((arg2 - 21) / 34);
    }

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "(I)Lob;")
    public static final class130 method36(int arg0) {
        class130 var1 = new class130(class242.field4406, class230.field4224, class287.field5127[0], class170.field3021[0], class107.field1895[0], class241.field4402[0], class185.field3286[0], class243.field4421);
        if (arg0 != -3581) {
            field82 = null;
        }
        class116.method821((byte) -124);
        ++field78;
        return var1;
    }
}
