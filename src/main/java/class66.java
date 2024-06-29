import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class66 extends class89 {

    @OriginalMember(owner = "client!fg", name = "U", descriptor = "I")
    private int field1116 = 32768;

    @OriginalMember(owner = "client!fg", name = "X", descriptor = "I")
    public static int field1119 = (int) (17.0D * Math.random()) + -8;

    @OriginalMember(owner = "client!fg", name = "db", descriptor = "[[I")
    public static int[][] field1125 = new int[104][104];

    @OriginalMember(owner = "client!fg", name = "eb", descriptor = "I")
    public static int field1126 = 0;

    @OriginalMember(owner = "client!fg", name = "S", descriptor = "B")
    public static byte field1114;

    @OriginalMember(owner = "client!fg", name = "R", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!fg", name = "V", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!fg", name = "W", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!fg", name = "Y", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!fg", name = "ab", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!fg", name = "bb", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!fg", name = "cb", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!fg", name = "fb", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!fg", name = "T", descriptor = "Lpa;")
    public static class258 field1115;

    @OriginalMember(owner = "client!fg", name = "Z", descriptor = "[[S")
    public static short[][] field1121;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ltc;Lmi;IIILmf;II)V")
    public static final void method455(class236 arg0, class81 arg1, int arg2, int arg3, int arg4, class26 arg5, int arg6, int arg7) {
        ++field1127;
        if (arg2 != 0) {
            method458(-14);
        }
        class269 var8 = new class269();
        var8.field4670 = arg6 * 128;
        var8.field4666 = arg3;
        var8.field4675 = arg7 * 128;
        if (arg0 == null) {
            if (arg5 == null) {
                if (arg1 != null) {
                    var8.field4663 = arg1;
                    var8.field4645 = 128 * (arg6 - -arg1.method642(117));
                    var8.field4648 = 128 * (arg1.method642(126) + arg7);
                    var8.field4643 = class155.method1146(1, arg1);
                    var8.field4674 = arg1.field1547 * 128;
                    class47.field820.method1597(arg1.field1528.method349((byte) 59), (byte) -126, var8);
                    return;
                }
            } else {
                class78 var11 = arg5.field511;
                var8.field4660 = arg5;
                if (var11.field1448 != null) {
                    var8.field4665 = true;
                    var11 = var11.method620(-17713);
                }
                if (var11 != null) {
                    var8.field4648 = (var11.field1440 + arg7) * 128;
                    var8.field4645 = (arg6 - -var11.field1440) * 128;
                    var8.field4643 = class48.method357(arg5, (byte) 42);
                    var8.field4674 = var11.field1472 * 128;
                }
                class6.field101.method265(var8, -501);
            }
        } else {
            var8.field4652 = arg0;
            var8.field4644 = arg0.field4113;
            var8.field4643 = arg0.field4112;
            var8.field4667 = arg0.field4123;
            var8.field4676 = arg0.field4147;
            var8.field4674 = arg0.field4154 * 128;
            int var9 = arg0.field4152;
            int var10 = arg0.field4130;
            if (~arg4 == -2 || arg4 == 3) {
                var9 = arg0.field4130;
                var10 = arg0.field4152;
            }
            var8.field4645 = (arg6 - -var9) * 128;
            var8.field4648 = (arg7 + var10) * 128;
            if (arg0.field4142 != null) {
                var8.field4665 = true;
                var8.method1800(arg2);
            }
            if (var8.field4676 != null) {
                var8.field4655 = var8.field4667 + (int) ((double) (-var8.field4667 + var8.field4644) * Math.random());
            }
            class154.field2719.method265(var8, arg2 ^ -501);
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(IB)[I")
    public final int[] method12(int arg0, byte arg1) {
        ++field1117;
        int[] var3 = super.field1688.method936(1, arg0);
        int var4 = 89 % ((arg1 - 51) / 44);
        if (super.field1688.field2200) {
            int[] var5 = this.method685(122, arg0, 1);
            int[] var6 = this.method685(56, arg0, 2);
            for (int var7 = 0; ~var7 > ~class241.field4284; ++var7) {
                int var8 = var6[var7] * this.field1116 >> 12;
                int var9 = (4081 & var5[var7]) >> 4;
                int var10 = class142.field2594[var9] * var8 >> 12;
                int var11 = class260.field4541[var9] * var8 >> 12;
                int var12 = class115.field2177 & var7 - -(var10 >> 12);
                int var13 = (var11 >> 12) + arg0 & class231.field4015;
                int[] var14 = this.method685(-122, var13, 0);
                var3[var7] = var14[var12];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
    public class66() {
        super(3, false);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIZ[Lhi;)V")
    public static final void method456(int arg0, int arg1, int arg2, int arg3, boolean arg4, class24[] arg5) {
        if (arg1 != -31258) {
            field1114 = 4;
        }
        ++field1122;
        for (int var6 = 0; var6 < arg5.length; ++var6) {
            class24 var7 = arg5[var6];
            if (var7 != null && var7.field440 == arg2) {
                class160.method1170((byte) 97, arg3, arg4, arg0, var7);
                class268.method1794(var7, arg3, (byte) -99, arg0);
                if (-var7.field341 + var7.field350 < var7.field412) {
                    var7.field412 = var7.field350 - var7.field341;
                }
                if (~var7.field412 > -1) {
                    var7.field412 = 0;
                }
                if (var7.field506 > -var7.field468 + var7.field377) {
                    var7.field506 = -var7.field468 + var7.field377;
                }
                if (~var7.field506 > -1) {
                    var7.field506 = 0;
                }
                if (~var7.field485 == -1) {
                    class113.method922(arg4, var7, arg1 + 31162);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)V")
    public final void method8(boolean arg0) {
        ++field1118;
        if (!arg0) {
            method459(-9);
        }
        class49.method365((byte) 127);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZI)V")
    public static final void method457(boolean arg0, int arg1) {
        class141.field2586 = arg0;
        ++field1124;
        if (arg1 != 128) {
            method456(33, 48, 73, -21, false, (class24[]) null);
        }
        class83.field1603 = !class180.method1291(2047);
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)V")
    public static final void method458(int arg0) {
        ++field1113;
        for (int var1 = -1; ~class156.field2783 < ~var1; ++var1) {
            int var5;
            if (~var1 == 0) {
                var5 = 2047;
            } else {
                var5 = class129.field2373[var1];
            }
            class81 var6 = class1.field6[var5];
            if (var6 != null && ~var6.field2564 < -1) {
                --var6.field2564;
                if (~var6.field2564 == -1) {
                    var6.field2567 = null;
                }
            }
        }
        if (arg0 != -29393) {
            field1114 = 54;
        }
        for (int var2 = 0; ~var2 > ~class51.field888; ++var2) {
            int var3 = class33.field612[var2];
            class26 var4 = class2.field29[var3];
            if (var4 != null && ~var4.field2564 < -1) {
                --var4.field2564;
                if (var4.field2564 == 0) {
                    var4.field2567 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 == -2) {
                super.field1683 = arg0.method558(1) == 1;
            }
        } else {
            this.field1116 = arg0.method545((byte) -107) << 4;
        }
        ++field1120;
        if (arg1 != -641641492) {
            field1115 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        int[][] var3 = super.field1695.method843((byte) -25, arg0);
        if (arg1 != 25) {
            field1125 = null;
        }
        ++field1123;
        if (super.field1695.field2028) {
            int[] var4 = this.method685(-112, arg0, 1);
            int[] var5 = this.method685(-83, arg0, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; class241.field4284 > var9; ++var9) {
                int var10 = 255 & var4[var9] * 255 >> 12;
                int var11 = var5[var9] * this.field1116 >> 12;
                int var12 = class142.field2594[var10] * var11 >> 12;
                int var13 = class260.field4541[var10] * var11 >> 12;
                int var14 = var9 - -(var12 >> 12) & class115.field2177;
                int var15 = (var13 >> 12) + arg0 & class231.field4015;
                int[][] var16 = this.method689((byte) 95, 0, var15);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "(I)V")
    public static void method459(int arg0) {
        if (arg0 == -31303) {
            field1121 = null;
            field1115 = null;
            field1125 = null;
        }
    }
}
