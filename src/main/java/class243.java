import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class243 extends class198 {

    @OriginalMember(owner = "client!re", name = "O", descriptor = "I")
    private int field3865 = 4;

    @OriginalMember(owner = "client!re", name = "N", descriptor = "I")
    private int field3864 = 4;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "I")
    public static int field3863 = 0;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!re", name = "K", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!re", name = "P", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!re", name = "R", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        ++field3860;
        int var4 = -61 % ((60 - arg0) / 61);
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field3864 = arg1.method1420((byte) 0);
            }
        } else {
            this.field3865 = arg1.method1420((byte) 0);
        }
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(B)V")
    public static final void method1706(byte arg0) {
        if (arg0 == 88) {
            ++field3867;
            for (class194 var1 = (class194) class10.field125.method1959(205); var1 != null; var1 = (class194) class10.field125.method1956(125)) {
                class245 var2 = var1.field3068;
                if (class165.field2600 == var2.field3899 && ~var2.field3908 <= ~class4.field32) {
                    if (var2.field3888 <= class4.field32) {
                        if (~var2.field3876 < -1) {
                            class35 var3 = class76.field1188[var2.field3876 + -1];
                            if (var3 != null && ~var3.field836 <= -1 && var3.field836 < 13312 && var3.field850 >= 0 && var3.field850 < 13312) {
                                var2.method1710(class12.method66(var3.field836, var2.field3899, var3.field850, 0) - var2.field3879, var3.field850, arg0 + 4202, var3.field836, class4.field32);
                            }
                        }
                        if (var2.field3876 < 0) {
                            int var4 = -var2.field3876 + -1;
                            class208 var5;
                            if (class31.field396 == var4) {
                                var5 = class309.field5006;
                            } else {
                                var5 = class300.field4925[var4];
                            }
                            if (var5 != null && ~var5.field836 <= -1 && ~var5.field836 > -13313 && ~var5.field850 <= -1 && var5.field850 < 13312) {
                                var2.method1710(class12.method66(var5.field836, var2.field3899, var5.field850, 0) - var2.field3879, var5.field850, 4290, var5.field836, class4.field32);
                            }
                        }
                        var2.method1717(class247.field3938, (byte) -96);
                        class121.method786(class165.field2600, (int) var2.field3902, (int) var2.field3909, (int) var2.field3897, 60, var2, var2.field3912, -1L, false);
                    }
                } else {
                    var1.method900(arg0 + 27);
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)[[I")
    public final int[][] method200(int arg0, int arg1) {
        ++field3861;
        int[][] var3 = super.field3150.method642(arg0, 1);
        if (arg1 != -2) {
            method1707(-87, (char) 65479, 21);
        }
        if (super.field3150.field1498) {
            int var4 = class258.field4243 / this.field3864;
            int var5 = class42.field590 / this.field3865;
            int[][] var6;
            if (var4 <= 0) {
                var6 = this.method1372(0, 0, (byte) 103);
            } else {
                int var7 = arg0 % var4;
                var6 = this.method1372(0, class258.field4243 * var7 / var4, (byte) -92);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[2];
            int[] var10 = var3[0];
            int[] var11 = var6[1];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; class42.field590 > var14; ++var14) {
                int var16;
                if (~var5 < -1) {
                    int var15 = var14 % var5;
                    var16 = class42.field590 * var15 / var5;
                } else {
                    var16 = 0;
                }
                var10[var14] = var8[var16];
                var12[var14] = var11[var16];
                var13[var14] = var9[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
    public class243() {
        super(1, false);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ICI)I")
    public static final int method1707(int arg0, char arg1, int arg2) {
        ++field3866;
        if (arg0 != 0) {
            return -24;
        } else {
            int var3 = arg1 << 4;
            if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
                arg1 = Character.toLowerCase(arg1);
                var3 = (arg1 << 4) - -1;
            }
            if (arg1 == 241 && ~arg2 == -1) {
                var3 = 1762;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(B)V")
    public static final void method1708(byte arg0) {
        class82.field1298.method144(arg0 ^ -72);
        if (arg0 != -72) {
            method1708((byte) 58);
        }
        ++field3868;
        class98.field1463.method144(0);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZI)[I")
    public final int[] method32(boolean arg0, int arg1) {
        ++field3862;
        int[] var3 = super.field3134.method36(arg1, 30672);
        if (!arg0) {
            field3863 = 8;
        }
        if (super.field3134.field69) {
            int var4 = class42.field590 / this.field3865;
            int var5 = class258.field4243 / this.field3864;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method1367((byte) -79, 0, class258.field4243 * var6 / var5);
            } else {
                var7 = this.method1367((byte) -79, 0, 0);
            }
            for (int var8 = 0; class42.field590 > var8; ++var8) {
                if (~var4 >= -1) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class42.field590 * var9 / var4];
                }
            }
        }
        return var3;
    }
}
