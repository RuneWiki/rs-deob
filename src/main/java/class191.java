import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class191 extends class288 {

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "I")
    private int field3045 = 0;

    @OriginalMember(owner = "client!ii", name = "E", descriptor = "[S")
    private short[] field3043 = new short[257];

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "[Z")
    public static boolean[] field3041 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!ii", name = "R", descriptor = "Leb;")
    public static class103 field3056 = null;

    @OriginalMember(owner = "client!ii", name = "K", descriptor = "Ljava/lang/String;")
    public static String field3049 = " more options";

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!ii", name = "I", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!ii", name = "L", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!ii", name = "N", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!ii", name = "O", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!ii", name = "P", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!ii", name = "Q", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!ii", name = "S", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!ii", name = "T", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!ii", name = "U", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!ii", name = "V", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!ii", name = "M", descriptor = "Ljj;")
    public static class134 field3051;

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "[I")
    private int[] field3042;

    @OriginalMember(owner = "client!ii", name = "J", descriptor = "[I")
    private int[] field3048;

    @OriginalMember(owner = "client!ii", name = "H", descriptor = "[[I")
    private int[][] field3046;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        ++field3060;
        if (arg1 != -19) {
            field3056 = null;
        }
        if (arg2 == 0) {
            this.field3045 = arg0.method1779(-102);
            this.field3046 = new int[arg0.method1779(arg1 ^ 118)][2];
            for (int var4 = 0; var4 < this.field3046.length; ++var4) {
                this.field3046[var4][0] = arg0.method1777(arg1 + -52);
                this.field3046[var4][1] = arg0.method1777(-39);
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
    public class191() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
    public final void method16(byte arg0) {
        if (arg0 == -125) {
            if (this.field3046 == null) {
                this.field3046 = new int[][] { new int[2], { 4096, 4096 } };
            }
            ++field3057;
            if (this.field3046.length < 2) {
                throw new RuntimeException("Curve operation requires at least two markers");
            } else {
                if (~this.field3045 == -3) {
                    this.method1295(false);
                }
                class206.method1389(4096);
                this.method1297(true);
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZLjava/lang/String;II)I")
    public static final int method1294(boolean arg0, String arg1, int arg2, int arg3) {
        ++field3052;
        if (arg2 >= 2 && arg2 <= 36) {
            int var4 = -16 / ((arg3 - -27) / 33);
            boolean var5 = false;
            boolean var6 = false;
            int var7 = 0;
            int var8 = arg1.length();
            for (int var9 = 0; var9 < var8; ++var9) {
                char var10 = arg1.charAt(var9);
                if (var9 == 0) {
                    if (var10 == '-') {
                        var5 = true;
                        continue;
                    }
                    if (~var10 == -44 && arg0) {
                        continue;
                    }
                }
                int var12;
                if (var10 >= '0' && var10 <= '9') {
                    var12 = var10 - '0';
                } else if (var10 >= 'A' && ~var10 >= -91) {
                    var12 = var10 - '7';
                } else {
                    if (var10 < 'a' || var10 > 'z') {
                        throw new NumberFormatException();
                    }
                    var12 = var10 - 'W';
                }
                if (var12 >= arg2) {
                    throw new NumberFormatException();
                }
                if (var5) {
                    var12 = -var12;
                }
                int var11 = arg2 * var7 + var12;
                if (var11 / arg2 != var7) {
                    throw new NumberFormatException();
                }
                var7 = var11;
                var6 = true;
            }
            if (!var6) {
                throw new NumberFormatException();
            } else {
                return var7;
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(Z)V")
    private final void method1295(boolean arg0) {
        ++field3059;
        int[] var2 = this.field3046[this.field3046.length + -2];
        int[] var3 = this.field3046[this.field3046.length + -1];
        if (!arg0) {
            int[] var4 = this.field3046[1];
            int[] var5 = this.field3046[0];
            this.field3048 = new int[] { var5[0] - (var4[0] + -var5[0]), var5[1] - var4[1] - -var5[1] };
            this.field3042 = new int[] { var2[0] - (var3[0] + -var2[0]), -var3[1] - (-var2[1] - var2[1]) };
        }
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(Z)V")
    public static void method1296(boolean arg0) {
        field3051 = null;
        field3056 = null;
        if (!arg0) {
            method1296(false);
        }
        field3049 = null;
        field3041 = null;
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(Z)V")
    private final void method1297(boolean arg0) {
        int var2 = this.field3045;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; this.field3046.length + -1 > var5 && this.field3046[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field3046[var5];
                    int[] var7 = this.field3046[var5 + -1];
                    int var8 = (var4 - var7[0] << 12) / (var6[0] + -var7[0]);
                    int var9 = -class272.field4388[(8174 & var8) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var9 + var7[1] * var10 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field3043[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field3046.length + -1 > var14 && ~var13 <= ~this.field3046[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field3046[var14 + -1];
                    int[] var16 = this.field3046[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field3043[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field3046.length + -1 && this.field3046[var22][0] <= var21; ++var22) {
                }
                int[] var23 = this.field3046[var22 + -1];
                int[] var24 = this.field3046[var22];
                int var25 = this.method1299(var22 + -2, (byte) 121)[1];
                int var26 = var24[1];
                int var27 = var23[1];
                int var28 = this.method1299(var22 + 1, (byte) 17)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] - var23[0]);
                int var30 = -var26 + var28 - var25 + var27;
                int var31 = -var27 - var30 + var25;
                int var32 = var29 * var29 >> 12;
                int var33 = -var25 + var26;
                int var35 = (var29 * var30 >> 12) * var32 >> 12;
                int var36 = var31 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 + var36 + var37 + var27;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field3043[var20] = (short) var38;
            }
        }
        ++field3058;
        if (!arg0) {
            this.field3043 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V")
    public static final void method1298(String arg0, String arg1, int arg2, int arg3) {
        class227.field3595 = arg1;
        class11.field157 = arg0;
        ++field3050;
        class86.field1177 = arg2;
        if (!class227.field3595.equals("") && !class11.field157.equals("")) {
            if (~class125.field2088 != 0) {
                class39.method305(false);
            } else {
                class157.field2523 = -3;
                class217.field3480 = 0;
                class95.field1440 = 1;
                class92.field1309 = 0;
                class264 var4 = new class264(128);
                var4.method1757(10, (byte) -104);
                var4.method1789((byte) -38, (int) (9.9999999E7D * Math.random()));
                var4.method1762(class238.method1570(class227.field3595, (byte) 97), (byte) -79);
                var4.method1789((byte) -38, (int) (Math.random() * 9.9999999E7D));
                var4.method1770(class11.field157, (byte) 105);
                var4.method1789((byte) -38, (int) (Math.random() * 9.9999999E7D));
                var4.method1748(class138.field2278, (byte) 125, class257.field4111);
                class83.field1148.field4195 = 0;
                if (arg3 == 2124055404) {
                    class83.field1148.method1757(24, (byte) -58);
                    class83.field1148.method1757(var4.field4195 + 2, (byte) 109);
                    class83.field1148.method1761(543, 4334);
                    class83.field1148.method1760(var4.field4198, var4.field4195, 21015, 0);
                }
            }
        } else {
            class157.field2523 = 3;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IB)[I")
    private final int[] method1299(int arg0, byte arg1) {
        ++field3044;
        if (~arg0 > -1) {
            return this.field3048;
        } else if (~arg0 <= ~this.field3046.length) {
            return this.field3042;
        } else {
            int var3 = -114 / ((-64 - arg1) / 59);
            return this.field3046[arg0];
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)[I")
    public final int[] method26(int arg0, int arg1) {
        if (arg0 != 0) {
            field3056 = null;
        }
        ++field3047;
        int[] var3 = super.field4609.method579((byte) -62, arg1);
        if (super.field4609.field1059) {
            int[] var4 = this.method1931((byte) -126, 0, arg1);
            for (int var5 = 0; ~class186.field2986 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field3043[var6];
            }
        }
        return var3;
    }
}
