import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class269 extends class456 {

    @OriginalMember(owner = "client!fs", name = "R", descriptor = "I")
    private int field3981 = 0;

    @OriginalMember(owner = "client!fs", name = "T", descriptor = "[S")
    private short[] field3983 = new short[257];

    @OriginalMember(owner = "client!fs", name = "I", descriptor = "Lat;")
    public static class412 field3973 = new class412();

    @OriginalMember(owner = "client!fs", name = "X", descriptor = "I")
    public static int field3987 = 0;

    @OriginalMember(owner = "client!fs", name = "K", descriptor = "Ltl;")
    public static class400 field3975 = new class400(260);

    @OriginalMember(owner = "client!fs", name = "H", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!fs", name = "L", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!fs", name = "M", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!fs", name = "P", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!fs", name = "Q", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!fs", name = "S", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!fs", name = "U", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!fs", name = "V", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!fs", name = "Y", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!fs", name = "J", descriptor = "[I")
    private int[] field3974;

    @OriginalMember(owner = "client!fs", name = "W", descriptor = "[I")
    private int[] field3986;

    @OriginalMember(owner = "client!fs", name = "N", descriptor = "[[I")
    private int[][] field3978;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;BILjava/lang/String;I)V", line = 3)
    public static final void method1748(String arg0, String arg1, int arg2, String arg3, byte arg4, int arg5, String arg6, int arg7) {
        ++field3982;
        for (int var8 = 99; var8 > 0; --var8) {
            class124.field1700[var8] = class124.field1700[var8 + -1];
            class229.field3371[var8] = class229.field3371[var8 + -1];
            class225.field3263[var8] = class225.field3263[var8 + -1];
            class401.field5863[var8] = class401.field5863[var8 + -1];
            class261.field3874[var8] = class261.field3874[var8 - 1];
            class492.field6928[var8] = class492.field6928[var8 + -1];
            class140.field2003[var8] = class140.field2003[var8 - 1];
        }
        class124.field1700[0] = arg2;
        class229.field3371[0] = arg7;
        int var9 = 84 % ((19 - arg4) / 62);
        class225.field3263[0] = arg1;
        class401.field5863[0] = arg3;
        class261.field3874[0] = arg0;
        class431.field6131 = class12.field169;
        class492.field6928[0] = arg6;
        class140.field2003[0] = arg5;
        ++class17.field226;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IB)[I", line = 36)
    private final int[] method1749(int arg0, byte arg1) {
        ++field3979;
        if (~arg0 > -1) {
            return this.field3974;
        } else {
            if (arg1 > -23) {
                field3973 = null;
            }
            return ~arg0 <= ~this.field3978.length ? this.field3986 : this.field3978[arg0];
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IBLre;)V", line = 56)
    public final void method210(int arg0, byte arg1, class446 arg2) {
        if (arg1 != 55) {
            this.method1750(-17);
        }
        if (~arg0 == -1) {
            this.field3981 = arg2.method2628(arg1 ^ 49207);
            this.field3978 = new int[arg2.method2628(49152)][2];
            for (int var4 = 0; ~this.field3978.length < ~var4; ++var4) {
                this.field3978[var4][0] = arg2.method2631(2530);
                this.field3978[var4][1] = arg2.method2631(2530);
            }
        }
        ++field3988;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)V", line = 87)
    public final void method653(boolean arg0) {
        if (this.field3978 == null) {
            this.field3978 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field3977;
        if (~this.field3978.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field3981 == -3) {
                this.method1752(0);
            }
            if (!arg0) {
                method1751(-112, 88, (class271) null, 97, -75, (class63) null);
            }
            class154.method1056(99);
            this.method1750(32767);
        }
    }

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "(I)V", line = 113)
    private final void method1750(int arg0) {
        ++field3972;
        if (arg0 == 32767) {
            int var2 = this.field3981;
            if (var2 != 2) {
                if (~var2 == -2) {
                    for (int var3 = 0; var3 < 257; ++var3) {
                        int var4 = var3 << 4;
                        int var5;
                        for (var5 = 1; this.field3978.length - 1 > var5 && ~var4 <= ~this.field3978[var5][0]; ++var5) {
                        }
                        int[] var6 = this.field3978[var5 + -1];
                        int[] var7 = this.field3978[var5];
                        int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                        int var9 = 4096 - class489.field6853[(8165 & var8) >> 5] >> 1;
                        int var10 = 4096 - var9;
                        int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                        if (~var11 >= 32767) {
                            var11 = -32767;
                        }
                        if (~var11 <= -32769) {
                            var11 = 32767;
                        }
                        this.field3983[var3] = (short) var11;
                    }
                } else {
                    for (int var12 = 0; var12 < 257; ++var12) {
                        int var13 = var12 << 4;
                        int var14;
                        for (var14 = 1; ~(this.field3978.length + -1) < ~var14 && ~var13 <= ~this.field3978[var14][0]; ++var14) {
                        }
                        int[] var15 = this.field3978[var14 + -1];
                        int[] var16 = this.field3978[var14];
                        int var17 = (var13 - var15[0] << 12) / (var16[0] + -var15[0]);
                        int var18 = 4096 - var17;
                        int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                        if (~var19 >= 32767) {
                            var19 = -32767;
                        }
                        if (~var19 <= -32769) {
                            var19 = 32767;
                        }
                        this.field3983[var12] = (short) var19;
                    }
                }
            } else {
                for (int var20 = 0; var20 < 257; ++var20) {
                    int var21 = var20 << 4;
                    int var22;
                    for (var22 = 1; var22 < this.field3978.length + -1 && ~this.field3978[var22][0] >= ~var21; ++var22) {
                    }
                    int[] var23 = this.field3978[var22 - 1];
                    int[] var24 = this.field3978[var22];
                    int var25 = this.method1749(var22 + -2, (byte) -85)[1];
                    int var26 = var23[1];
                    int var27 = var24[1];
                    int var28 = this.method1749(var22 + 1, (byte) -55)[1];
                    int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                    int var30 = var29 * var29 >> 12;
                    int var31 = -var25 - -var26 + -var27 + var28;
                    int var32 = -var31 + var25 - var26;
                    int var33 = -var25 + var27;
                    int var35 = (var29 * var31 >> 12) * var30 >> 12;
                    int var36 = var30 * var32 >> 12;
                    int var37 = var29 * var33 >> 12;
                    int var38 = var35 - -var36 - -var37 + var26;
                    if (~var38 >= 32767) {
                        var38 = -32767;
                    }
                    if (var38 >= 32768) {
                        var38 = 32767;
                    }
                    this.field3983[var20] = (short) var38;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IILvc;IILtq;)V", line = 294)
    public static final void method1751(int arg0, int arg1, class271 arg2, int arg3, int arg4, class63 arg5) {
        ++field3980;
        class150 var6 = class256.field3796.method2243((byte) 127, arg2.field4064);
        if (~var6.field2100 != arg1) {
            int var7;
            if (!arg2.field4059) {
                var7 = 0;
            } else {
                int var8 = arg2.field4060 + arg3;
                var7 = var8 & 3;
            }
            class319 var9 = var6.method1018(0, arg5, arg2.field4083, var7);
            if (var9 != null) {
                int var10 = arg2.field4014;
                int var11 = arg2.field4048;
                if ((1 & var7) == 1) {
                    var10 = arg2.field4048;
                    var11 = arg2.field4014;
                }
                int var12 = var9.method791();
                int var13 = var9.method789();
                if (var6.field2104) {
                    var13 = var11 * 4;
                    var12 = var10 * 4;
                }
                if (var6.field2107 == 0) {
                    var9.method1962(arg4, -(var11 * 4) + 4 + arg0, var12, var13);
                } else {
                    var9.method792(arg4, -((var11 + -1) * 4) + arg0, var12, var13, 1, var6.field2107 | -16777216, 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(II)[I", line = 346)
    public final int[] method33(int arg0, int arg1) {
        ++field3976;
        int[] var3 = super.field6466.method2533(true, arg1);
        if (super.field6466.field6153) {
            int[] var4 = this.method2707(arg1, -31797, 0);
            for (int var5 = 0; ~class156.field2169 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field3983[var6];
            }
        }
        if (arg0 != -1) {
            this.method33(-118, -91);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "(I)V", line = 388)
    private final void method1752(int arg0) {
        ++field3984;
        int[] var2 = this.field3978[0];
        int[] var3 = this.field3978[1];
        int[] var4 = this.field3978[this.field3978.length + -2];
        int[] var5 = this.field3978[this.field3978.length + -1];
        this.field3986 = new int[] { var4[0] - -var4[0] - var5[arg0], -var5[1] - -var4[1] + var4[1] };
        this.field3974 = new int[] { var2[0] - (-var2[0] - -var3[0]), var2[1] - (var3[1] + -var2[1]) };
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "()V", line = 414)
    public class269() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)V", line = 420)
    public static void method1753(byte arg0) {
        field3975 = null;
        int var1 = 18 / ((35 - arg0) / 62);
        field3973 = null;
    }
}
