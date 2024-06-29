import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class11 extends class84 {

    @OriginalMember(owner = "client!hd", name = "Q", descriptor = "[I")
    public static int[] field120 = new int[5];

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "[S")
    public static short[] field119 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!hd", name = "Y", descriptor = "[I")
    public static int[] field128 = new int[99];

    @OriginalMember(owner = "client!hd", name = "Z", descriptor = "[I")
    public static int[] field129;

    @OriginalMember(owner = "client!hd", name = "ab", descriptor = "Led;")
    public static class187 field130;

    @OriginalMember(owner = "client!hd", name = "db", descriptor = "[I")
    public static int[] field133;

    @OriginalMember(owner = "client!hd", name = "eb", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!hd", name = "U", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!hd", name = "X", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!hd", name = "bb", descriptor = "Lje;")
    public static class188 field131;

    @OriginalMember(owner = "client!hd", name = "V", descriptor = "[I")
    public static int[] field125;

    @OriginalMember(owner = "client!hd", name = "W", descriptor = "[Lih;")
    private class209[] field126;

    @OriginalMember(owner = "client!hd", name = "cb", descriptor = "[Z")
    public static boolean[] field132;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I[[I)V")
    private final void method89(int arg0, int[][] arg1) {
        ++field121;
        int var3 = class49.field718;
        int var4 = class20.field221;
        int var5 = 0 / ((1 - arg0) / 39);
        class60.method432(40, arg1);
        class57.method419(0, (byte) -62, class36.field497, 0, class58.field822);
        if (this.field126 != null) {
            for (int var6 = 0; this.field126.length > var6; ++var6) {
                class209 var7 = this.field126[var6];
                int var8 = var7.field3348;
                int var9 = var7.field3349;
                if (~var8 <= -1) {
                    if (~var9 <= -1) {
                        var7.method318(50, var4, var3);
                    } else {
                        var7.method322(var4, var3, (byte) -123);
                    }
                } else if (var9 >= 0) {
                    var7.method319(var4, -1, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        ++field123;
        if (arg1 != -18) {
            return null;
        } else {
            int[][] var3 = super.field1211.method193((byte) 90, arg0);
            if (super.field1211.field321) {
                int var4 = class20.field221;
                int var5 = class49.field718;
                int[][] var6 = new int[var5][var4];
                int[][][] var7 = super.field1211.method195(-11010);
                this.method89(-53, var6);
                for (int var8 = 0; var8 < class49.field718; ++var8) {
                    int[] var9 = var6[var8];
                    int[][] var10 = var7[var8];
                    int[] var11 = var10[1];
                    int[] var12 = var10[2];
                    int[] var13 = var10[0];
                    for (int var14 = 0; ~class20.field221 < ~var14; ++var14) {
                        int var15 = var9[var14];
                        var12[var14] = class179.method1337(var15, 255) << 4;
                        var11[var14] = class179.method1337(4080, var15 >> 4);
                        var13[var14] = class179.method1337(4080, var15 >> 12);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "(I)V")
    public static void method90(int arg0) {
        field132 = null;
        field133 = null;
        field120 = null;
        field130 = null;
        field128 = null;
        field119 = null;
        field129 = null;
        field131 = null;
        field125 = null;
        if (arg0 != 0) {
            method90(-37);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        if (~arg2 == -1) {
            this.field126 = new class209[arg0.method1111(255)];
            for (int var4 = 0; ~this.field126.length < ~var4; ++var4) {
                int var5 = arg0.method1111(255);
                if (var5 != 0) {
                    if (~var5 != -2) {
                        if (var5 != 2) {
                            if (~var5 == -4) {
                                this.field126[var4] = class155.method1153(arg0, true);
                            }
                        } else {
                            this.field126[var4] = class25.method182(-14160, arg0);
                        }
                    } else {
                        this.field126[var4] = class55.method414(-12, arg0);
                    }
                } else {
                    this.field126[var4] = class250.method1785(-1, arg0);
                }
            }
        } else if (~arg2 == -2) {
            super.field1217 = arg0.method1111(255) == 1;
        }
        if (arg1 <= 87) {
            this.method89(-61, (int[][]) null);
        }
        ++field124;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
    public class11() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI)[I")
    public final int[] method91(byte arg0, int arg1) {
        ++field118;
        int[] var3 = super.field1228.method1627(-1, arg1);
        if (arg0 > -125) {
            field125 = null;
        }
        if (super.field1228.field3651) {
            this.method89(84, super.field1228.method1623(-15578));
        }
        return var3;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Llc;Llc;ILlc;)V")
    public static final void method92(class86 arg0, class86 arg1, int arg2, class86 arg3) {
        class222.field3553 = arg3;
        if (arg2 <= 39) {
            field119 = null;
        }
        class213.field3410 = arg1;
        ++field127;
        class39.field555 = arg0;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; ~var1 > -100; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) (300.0D * Math.pow(2.0D, (double) var2 / 7.0D) + (double) var2);
            var0 += var3;
            field128[var1] = var0 / 4;
        }
        field129 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
        field130 = new class187();
        field133 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
        field134 = 0;
    }
}
