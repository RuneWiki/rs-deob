import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class5 extends class273 {

    @OriginalMember(owner = "client!ti", name = "Z", descriptor = "Ljd;")
    public static class86 field72 = class122.method868("Null", true);

    @OriginalMember(owner = "client!ti", name = "ab", descriptor = "[I")
    public static int[] field73 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!ti", name = "W", descriptor = "I")
    public static int field69 = (int) (17.0D * Math.random()) + -8;

    @OriginalMember(owner = "client!ti", name = "S", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!ti", name = "V", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ti", name = "X", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!ti", name = "Y", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ti", name = "bb", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!ti", name = "cb", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!ti", name = "T", descriptor = "J")
    public static long field66;

    @OriginalMember(owner = "client!ti", name = "U", descriptor = "[Lic;")
    private class137[] field67;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IB)[[I")
    public final int[][] method29(int arg0, byte arg1) {
        int[][] var3 = super.field4787.method1657(arg0, (byte) -98);
        int var4 = -18 % ((arg1 - 12) / 58);
        if (super.field4787.field4355) {
            int var5 = class176.field3200;
            int var6 = class96.field1896;
            int[][][] var7 = super.field4787.method1661(38);
            int[][] var8 = new int[var6][var5];
            this.method32(var8, -8743);
            for (int var9 = 0; ~class96.field1896 < ~var9; ++var9) {
                int[] var10 = var8[var9];
                int[][] var11 = var7[var9];
                int[] var12 = var11[0];
                int[] var13 = var11[2];
                int[] var14 = var11[1];
                for (int var15 = 0; ~class176.field3200 < ~var15; ++var15) {
                    int var16 = var10[var15];
                    var13[var15] = class1.method5(4080, var16 << 4);
                    var14[var15] = class1.method5(var16, 65280) >> 4;
                    var12[var15] = class1.method5(var16, 16711680) >> 12;
                }
            }
        }
        ++field75;
        return var3;
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(III)J")
    public static final long method30(int arg0, int arg1, int arg2) {
        class249 var3 = class248.field4406[arg0][arg1][arg2];
        return var3 != null && var3.field4435 != null ? var3.field4435.field3978 : 0L;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        int[] var3 = super.field4800.method1224(arg1, 0);
        if (super.field4800.field3160) {
            this.method32(super.field4800.method1230(arg0 ^ 23498), -8743);
        }
        if (arg0 != -7420) {
            return null;
        } else {
            ++field65;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "([[II)V")
    private final void method32(int[][] arg0, int arg1) {
        ++field71;
        if (arg1 != -8743) {
            method35(44, 87, 98, 126);
        }
        int var3 = class176.field3200;
        int var4 = class96.field1896;
        class263.method1788(arg0, (byte) 0);
        class136.method974(class90.field1844, arg1 + 9766, 0, 0, class274.field4808);
        if (this.field67 != null) {
            for (int var5 = 0; this.field67.length > var5; ++var5) {
                class137 var6 = this.field67[var5];
                int var7 = var6.field2617;
                int var8 = var6.field2619;
                if (~var7 > -1) {
                    if (~var8 <= -1) {
                        var6.method467(var3, var4, (byte) -83);
                    }
                } else if (~var8 <= -1) {
                    var6.method468(var3, arg1 + 9243, var4);
                } else {
                    var6.method471(var3, 9, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "(I)V")
    public static final void method33(int arg0) {
        int var1 = 100 % ((arg0 - -25) / 34);
        if (class254.field4513.toLowerCase().indexOf("microsoft") == -1) {
            class178.field3220[47] = 73;
            class178.field3220[92] = 74;
            class178.field3220[91] = 42;
            class178.field3220[44] = 71;
            class178.field3220[45] = 26;
            class178.field3220[59] = 57;
            class178.field3220[61] = 27;
            class178.field3220[46] = 72;
            if (class254.field4527 == null) {
                class178.field3220[222] = 59;
                class178.field3220[192] = 58;
            } else {
                class178.field3220[222] = 58;
                class178.field3220[520] = 59;
                class178.field3220[192] = 28;
            }
            class178.field3220[93] = 43;
        } else {
            class178.field3220[189] = 26;
            class178.field3220[222] = 59;
            class178.field3220[190] = 72;
            class178.field3220[186] = 57;
            class178.field3220[188] = 71;
            class178.field3220[221] = 43;
            class178.field3220[187] = 27;
            class178.field3220[219] = 42;
            class178.field3220[191] = 73;
            class178.field3220[192] = 58;
            class178.field3220[220] = 74;
            class178.field3220[223] = 28;
        }
        ++field74;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
    public class5() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                super.field4778 = arg1.method1408((byte) -50) == 1;
            }
        } else {
            this.field67 = new class137[arg1.method1408((byte) -18)];
            for (int var4 = 0; var4 < this.field67.length; ++var4) {
                int var5 = arg1.method1408((byte) -34);
                if (~var5 != -1) {
                    if (~var5 != -2) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field67[var4] = class138.method984(9550, arg1);
                            }
                        } else {
                            this.field67[var4] = class219.method1544((byte) -96, arg1);
                        }
                    } else {
                        this.field67[var4] = class15.method107(-58, arg1);
                    }
                } else {
                    this.field67[var4] = class96.method692(arg1, (byte) 116);
                }
            }
        }
        ++field70;
        if (arg2 >= -16) {
            method33(-124);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIII)V")
    public static final void method35(int arg0, int arg1, int arg2, int arg3) {
        class249 var4 = class248.field4406[arg0][arg1][arg2];
        if (var4 != null) {
            class258 var5 = var4.field4433;
            if (var5 != null) {
                var5.field4572 = var5.field4572 * arg3 / 16;
                var5.field4575 = var5.field4575 * arg3 / 16;
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "(I)V")
    public static void method36(int arg0) {
        field72 = null;
        field73 = null;
        int var1 = -125 % ((-29 - arg0) / 42);
    }
}
