import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class118 extends class198 {

    @OriginalMember(owner = "client!rm", name = "N", descriptor = "I")
    private int field1795 = 0;

    @OriginalMember(owner = "client!rm", name = "Y", descriptor = "[S")
    private short[] field1806 = new short[257];

    @OriginalMember(owner = "client!rm", name = "M", descriptor = "I")
    public static int field1794 = 0;

    @OriginalMember(owner = "client!rm", name = "ab", descriptor = "[I")
    public static int[] field1808 = new int[99];

    @OriginalMember(owner = "client!rm", name = "I", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!rm", name = "J", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!rm", name = "L", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!rm", name = "O", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!rm", name = "Q", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!rm", name = "R", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!rm", name = "S", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!rm", name = "T", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!rm", name = "U", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!rm", name = "V", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!rm", name = "W", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!rm", name = "X", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!rm", name = "Z", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!rm", name = "K", descriptor = "[I")
    private int[] field1792;

    @OriginalMember(owner = "client!rm", name = "bb", descriptor = "[I")
    private int[] field1809;

    @OriginalMember(owner = "client!rm", name = "P", descriptor = "[[I")
    private int[][] field1797;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(II[Lkk;)V")
    public static final void method766(int arg0, int arg1, class254[] arg2) {
        for (int var3 = arg0; ~arg2.length < ~var3; ++var3) {
            class254 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field4052 == 0) {
                    if (var4.field4123 != null) {
                        method766(0, arg1, var4.field4123);
                    }
                    class229 var5 = (class229) class258.field4241.method872((byte) -89, (long) var4.field4077);
                    if (var5 != null) {
                        class117.method756(false, var5.field3658, arg1);
                    }
                }
                if (arg1 == 0 && var4.field4086 != null) {
                    class298 var6 = new class298();
                    var6.field4905 = var4.field4086;
                    var6.field4906 = var4;
                    class126.method844(200000, var6);
                }
                if (~arg1 == -2 && var4.field4195 != null) {
                    if (~var4.field4040 <= -1) {
                        class254 var7 = class80.method534(119, var4.field4077);
                        if (var7 == null || var7.field4123 == null || ~var4.field4040 <= ~var7.field4123.length || var7.field4123[var4.field4040] != var4) {
                            continue;
                        }
                    }
                    class298 var8 = new class298();
                    var8.field4905 = var4.field4195;
                    var8.field4906 = var4;
                    class126.method844(200000, var8);
                }
            }
        }
        ++field1790;
    }

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "(I)V")
    public static final void method767(int arg0) {
        for (int var1 = arg0; ~class14.field195 < ~var1; ++var1) {
            int var2 = class76.field1189[var1];
            class35 var3 = class76.field1188[var2];
            if (var3 != null) {
                class3.method10(var3, arg0 ^ 22301, var3.field442.field1591);
            }
        }
        ++field1807;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(II)[I")
    private final int[] method768(int arg0, int arg1) {
        ++field1801;
        if (arg1 > arg0) {
            return this.field1809;
        } else {
            return arg0 >= this.field1797.length ? this.field1792 : this.field1797[arg0];
        }
    }

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "(B)V")
    private final void method769(byte arg0) {
        ++field1799;
        int var2 = this.field1795;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field1797.length + -1 && var4 >= this.field1797[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field1797[var5];
                    int[] var7 = this.field1797[var5 + -1];
                    int var8 = (-var7[0] + var4 << 12) / (var6[0] + -var7[0]);
                    int var9 = -class179.field2790[var8 >> 5 & 255] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var9 + var7[1] * var10 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field1806[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field1797.length - 1 > var14 && ~var13 <= ~this.field1797[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field1797[var14 + -1];
                    int[] var16 = this.field1797[var14];
                    int var17 = (var13 - var15[0] << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field1806[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~(this.field1797.length + -1) < ~var22 && this.field1797[var22][0] <= var21; ++var22) {
                }
                int[] var23 = this.field1797[var22 - 1];
                int[] var24 = this.field1797[var22];
                int var25 = this.method768(var22 + -2, 0)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method768(var22 + 1, 0)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = -var27 + var28 + -var25 + var26;
                int var31 = var29 * var29 >> 12;
                int var32 = -var25 + var27;
                int var34 = -var30 + var25 + -var26;
                int var35 = var31 * var34 >> 12;
                int var36 = (var29 * var30 >> 12) * var31 >> 12;
                int var37 = var29 * var32 >> 12;
                int var38 = var36 - -var35 - -var26 + var37;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field1806[var20] = (short) var38;
            }
        }
        if (arg0 >= -35) {
            method773(-25, (byte) 23, (String) null, false, false, 81, false, -85, (String) null, -101, 96L);
        }
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V")
    public class118() {
        super(1, true);
    }

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "(B)V")
    private final void method770(byte arg0) {
        ++field1803;
        int[] var2 = this.field1797[0];
        int[] var3 = this.field1797[this.field1797.length + -1];
        int[] var4 = this.field1797[1];
        int[] var5 = this.field1797[this.field1797.length + -2];
        if (arg0 >= -6) {
            method767(41);
        }
        this.field1809 = new int[] { var2[0] - var4[0] + var2[0], -var4[1] - (-var2[1] - var2[1]) };
        this.field1792 = new int[] { var5[0] - (var3[0] - var5[0]), -var3[1] - -var5[1] + var5[1] };
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z[Lkk;I)V")
    public static final void method771(boolean arg0, class254[] arg1, int arg2) {
        if (!arg0) {
            field1808 = null;
        }
        for (int var3 = 0; var3 < arg1.length; ++var3) {
            class254 var4 = arg1[var3];
            if (var4 != null && ~var4.field4167 == ~arg2 && (!var4.field4181 || !client.method1096(var4))) {
                if (var4.field4052 == 0) {
                    if (!var4.field4181 && client.method1096(var4) && class217.field3458 != var4) {
                        continue;
                    }
                    method771(true, arg1, var4.field4077);
                    if (var4.field4123 != null) {
                        method771(true, var4.field4123, var4.field4077);
                    }
                    class229 var5 = (class229) class258.field4241.method872((byte) -120, (long) var4.field4077);
                    if (var5 != null) {
                        class105.method676(var5.field3658, 112);
                    }
                }
                if (~var4.field4052 == -7) {
                    if (var4.field4121 != -1 || var4.field4132 != -1) {
                        boolean var6 = class14.method96(2, var4);
                        int var7;
                        if (!var6) {
                            var7 = var4.field4121;
                        } else {
                            var7 = var4.field4132;
                        }
                        if (~var7 != 0) {
                            class200 var8 = class196.method1359(var7, (byte) 21);
                            if (var8 != null) {
                                var4.field4165 += class247.field3938;
                                while (~var4.field4165 < ~var8.field3168[var4.field4033]) {
                                    var4.field4165 -= var8.field3168[var4.field4033];
                                    ++var4.field4033;
                                    if (~var8.field3167.length >= ~var4.field4033) {
                                        var4.field4033 -= var8.field3191;
                                        if (var4.field4033 < 0 || ~var8.field3167.length >= ~var4.field4033) {
                                            var4.field4033 = 0;
                                        }
                                    }
                                    var4.field4117 = var4.field4033 - -1;
                                    if (~var8.field3167.length >= ~var4.field4117) {
                                        var4.field4117 -= var8.field3191;
                                        if (~var4.field4117 > -1 || ~var8.field3167.length >= ~var4.field4117) {
                                            var4.field4117 = -1;
                                        }
                                    }
                                    class58.method354(true, var4);
                                }
                            }
                        }
                    }
                    if (~var4.field4163 != -1 && !var4.field4181) {
                        int var9 = var4.field4163 << 16 >> 16;
                        int var10 = var4.field4163 >> 16;
                        int var11 = class247.field3938 * var9;
                        int var12 = class247.field3938 * var10;
                        var4.field4154 = 2047 & var4.field4154 + var11;
                        var4.field4139 = 2047 & var4.field4139 - -var12;
                        class58.method354(true, var4);
                    }
                }
            }
        }
        ++field1796;
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(B)V")
    public final void method142(byte arg0) {
        if (this.field1797 == null) {
            this.field1797 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field1805;
        if (~this.field1797.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field1795 == -3) {
                this.method770((byte) -71);
            }
            class217.method1516((byte) 79);
            this.method769((byte) -117);
            int var2 = -25 / ((arg0 - -46) / 47);
        }
    }

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "(I)V")
    public static void method772(int arg0) {
        field1808 = null;
        int var1 = -115 % ((-9 - arg0) / 63);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZI)[I")
    public final int[] method32(boolean arg0, int arg1) {
        if (!arg0) {
            this.method769((byte) 104);
        }
        ++field1791;
        int[] var3 = super.field3134.method36(arg1, 30672);
        if (super.field3134.field69) {
            int[] var4 = this.method1367((byte) -79, 0, arg1);
            for (int var5 = 0; ~class42.field590 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field1806[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBLjava/lang/String;ZZIZILjava/lang/String;IJ)V")
    public static final void method773(int arg0, byte arg1, String arg2, boolean arg3, boolean arg4, int arg5, boolean arg6, int arg7, String arg8, int arg9, long arg10) {
        ++field1800;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; ++var13) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class202 var14 = new class202(128);
        var14.method1446((byte) 74, 10);
        var14.method1412((arg6 ? 4 : 0) | (arg4 ? 1 : 0) | (!arg3 ? 0 : 2), false);
        var14.method1413(-349748560, arg10);
        var14.method1425(var12[0], (byte) -104);
        var14.method1409(arg8, (byte) 77);
        var14.method1425(var12[1], (byte) -97);
        var14.method1412(class115.field1742, false);
        var14.method1446((byte) 58, arg9);
        var14.method1446((byte) 69, arg0);
        var14.method1425(var12[2], (byte) -119);
        var14.method1412(arg5, false);
        var14.method1412(arg7, false);
        int var15 = 43 % ((52 - arg1) / 57);
        var14.method1425(var12[3], (byte) -99);
        var14.method1441((byte) -63, class60.field912, class105.field1572);
        class202 var16 = new class202(350);
        var16.method1409(arg2, (byte) 77);
        int var17 = -(class187.method1270((byte) -73, arg2) % 8) + 8;
        for (int var18 = 0; var17 > var18; ++var18) {
            var16.method1446((byte) 76, (int) (Math.random() * 255.0D));
        }
        var16.method1426(1964, var12);
        class276.field4572.field3272 = 0;
        class276.field4572.method1446((byte) 35, 22);
        class276.field4572.method1412(2 - -var16.field3272 + var14.field3272, false);
        class276.field4572.method1412(553, false);
        class276.field4572.method1453(var14.field3234, 0, var14.field3272, (byte) -12);
        class276.field4572.method1453(var16.field3234, 0, var16.field3272, (byte) -12);
        class52.field708 = 1;
        class284.field4756 = 0;
        class248.field3947 = -3;
        class235.field3730 = 0;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        ++field1802;
        int var4 = 60 / ((60 - arg0) / 61);
        if (~arg2 == -1) {
            this.field1795 = arg1.method1420((byte) 0);
            this.field1797 = new int[arg1.method1420((byte) 0)][2];
            for (int var5 = 0; this.field1797.length > var5; ++var5) {
                this.field1797[var5][0] = arg1.method1419(84);
                this.field1797[var5][1] = arg1.method1419(65);
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; ~var1 > -100; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field1808[var1] = var0 / 4;
        }
    }
}
