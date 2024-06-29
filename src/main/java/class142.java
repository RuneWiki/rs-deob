import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class142 extends class264 {

    @OriginalMember(owner = "client!er", name = "U", descriptor = "J")
    public static long field1983 = -1L;

    @OriginalMember(owner = "client!er", name = "N", descriptor = "Lrc;")
    public static class108 field1976 = new class108(46, 8);

    @OriginalMember(owner = "client!er", name = "X", descriptor = "[I")
    public static int[] field1986 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!er", name = "P", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!er", name = "R", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!er", name = "S", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!er", name = "T", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!er", name = "V", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!er", name = "Q", descriptor = "[I")
    public static int[] field1979;

    @OriginalMember(owner = "client!er", name = "W", descriptor = "[Lae;")
    public static class172[] field1985;

    @OriginalMember(owner = "client!er", name = "O", descriptor = "[Lsr;")
    private class391[] field1977;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I[[I)V")
    private final void method1022(int arg0, int[][] arg1) {
        ++field1981;
        int var3 = class478.field6792;
        int var4 = class129.field1772;
        class143.method1026(arg1, (byte) 10);
        class405.method2427(0, class205.field3007, 0, arg0 ^ -124, class301.field4265);
        if (this.field1977 != null) {
            for (int var5 = 0; ~var5 > ~this.field1977.length; ++var5) {
                class391 var6 = this.field1977[var5];
                int var7 = var6.field5403;
                int var8 = var6.field5406;
                if (~var7 <= -1) {
                    if (~var8 > -1) {
                        var6.method1254(var4, var3, 127);
                    } else {
                        var6.method1255(var3, var4, arg0 ^ 112);
                    }
                } else if (~var8 <= -1) {
                    var6.method1256(9329, var4, var3);
                }
            }
        }
        if (arg0 != -2) {
            this.method5((byte) -52, 84);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BLkk;I)V")
    public final void method7(byte arg0, class161 arg1, int arg2) {
        if (arg0 < 31) {
            this.method1022(-40, (int[][]) null);
        }
        ++field1980;
        if (~arg2 == -1) {
            this.field1977 = new class391[arg1.method1172((byte) -117)];
            for (int var4 = 0; ~var4 > ~this.field1977.length; ++var4) {
                int var5 = arg1.method1172((byte) -122);
                if (~var5 != -1) {
                    if (~var5 != -2) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field1977[var4] = class361.method2222((byte) 74, arg1);
                            }
                        } else {
                            this.field1977[var4] = class427.method2553(arg1, (byte) -122);
                        }
                    } else {
                        this.field1977[var4] = class27.method185((byte) 85, arg1);
                    }
                } else {
                    this.field1977[var4] = class401.method2411(4095, arg1);
                }
            }
        } else if (~arg2 == -2) {
            super.field3794 = arg1.method1172((byte) 91) == 1;
        }
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V")
    public class142() {
        super(0, true);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field1984;
        if (arg1 != 21034) {
            return null;
        } else {
            int[] var3 = super.field3808.method958((byte) 112, arg0);
            if (super.field3808.field1732) {
                this.method1022(arg1 ^ -21036, super.field3808.method957(0));
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(III)I")
    public static final int method1023(int arg0, int arg1, int arg2) {
        if (arg2 != 1359681988) {
            method1025((byte) -67);
        }
        ++field1982;
        int var3 = arg1 + -1 & arg0 >> 31;
        return (arg0 - -(arg0 >>> 31)) % arg1 - -var3;
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(BI)[[I")
    public final int[][] method5(byte arg0, int arg1) {
        ++field1978;
        int[][] var3 = super.field3816.method1928((byte) 45, arg1);
        if (arg0 != 116) {
            return null;
        } else {
            if (super.field3816.field4208) {
                int var4 = class478.field6792;
                int var5 = class129.field1772;
                int[][] var6 = new int[var5][var4];
                int[][][] var7 = super.field3816.method1922(false);
                this.method1022(-2, var6);
                for (int var8 = 0; ~var8 > ~class129.field1772; ++var8) {
                    int[] var9 = var6[var8];
                    int[][] var10 = var7[var8];
                    int[] var11 = var10[0];
                    int[] var12 = var10[1];
                    int[] var13 = var10[2];
                    for (int var14 = 0; ~var14 > ~class478.field6792; ++var14) {
                        int var15 = var9[var14];
                        var13[var14] = class88.method739(255, var15) << 4;
                        var12[var14] = class88.method739(4080, var15 >> 4);
                        var11[var14] = class88.method739(var15, 16711680) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(II)I")
    public static int method1024(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(B)V")
    public static void method1025(byte arg0) {
        if (arg0 != -21) {
            field1985 = null;
        }
        field1986 = null;
        field1976 = null;
        field1979 = null;
        field1985 = null;
    }
}
