import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class217 extends class260 {

    @OriginalMember(owner = "client!ia", name = "S", descriptor = "[S")
    private short[] field3853 = new short[257];

    @OriginalMember(owner = "client!ia", name = "cb", descriptor = "I")
    private int field3863 = 0;

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "Loh;")
    private static class263 field3852 = class253.method1681(-126, "Loaded interfaces");

    @OriginalMember(owner = "client!ia", name = "eb", descriptor = "Loh;")
    public static class263 field3865 = field3852;

    @OriginalMember(owner = "client!ia", name = "fb", descriptor = "Loh;")
    public static class263 field3866 = class253.method1681(-122, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!ia", name = "L", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!ia", name = "V", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!ia", name = "Y", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!ia", name = "Z", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!ia", name = "ab", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!ia", name = "gb", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!ia", name = "db", descriptor = "Lug;")
    public static class195 field3864;

    @OriginalMember(owner = "client!ia", name = "bb", descriptor = "Lue;")
    public static class86 field3862;

    @OriginalMember(owner = "client!ia", name = "N", descriptor = "[I")
    private int[] field3849;

    @OriginalMember(owner = "client!ia", name = "W", descriptor = "[I")
    private int[] field3857;

    @OriginalMember(owner = "client!ia", name = "M", descriptor = "[[I")
    private int[][] field3848;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)[I")
    public final int[] method17(int arg0, int arg1) {
        if (arg1 != 255) {
            return null;
        } else {
            ++field3856;
            int[] var3 = super.field4511.method304(arg0, false);
            if (super.field4511.field1029) {
                int[] var4 = this.method1711(arg0, 0, false);
                for (int var5 = 0; class49.field1052 > var5; ++var5) {
                    int var6 = var4[var5] >> 4;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    if (~var6 < -257) {
                        var6 = 256;
                    }
                    var3[var5] = this.field3853[var6];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZZJI)Loh;")
    public static final class263 method1473(boolean arg0, boolean arg1, long arg2, int arg3) {
        ++field3847;
        if (~arg3 <= -3 && ~arg3 >= -37) {
            int var5 = 1;
            long var6 = arg2 / (long) arg3;
            while (~var6 != -1L) {
                var6 /= (long) arg3;
                ++var5;
            }
            int var8 = var5;
            if (~arg2 > -1L || arg1) {
                var8 = var5 + 1;
            }
            byte[] var9 = new byte[var8];
            if (arg2 < 0L) {
                var9[0] = 45;
            } else if (arg1) {
                var9[0] = 43;
            }
            for (int var10 = 0; ~var10 > ~var5; ++var10) {
                int var12 = (int) (arg2 % (long) arg3);
                if (~var12 > -1) {
                    var12 = -var12;
                }
                arg2 /= (long) arg3;
                if (var12 > 9) {
                    var12 += 39;
                }
                var9[var8 - (var10 - -1)] = (byte) (var12 + 48);
            }
            class263 var11 = new class263();
            var11.field4591 = var8;
            var11.field4605 = var9;
            if (arg0) {
                method1475(87);
            }
            return var11;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(Z)V")
    public static final void method1474(boolean arg0) {
        ++field3867;
        for (class173 var1 = (class173) class189.field3408.method1878(arg0); var1 != null; var1 = (class173) class189.field3408.method1881(-51)) {
            if (~var1.field3145 == 0) {
                var1.field3137 = 0;
                class191.method1254((byte) -28, var1);
            } else {
                var1.method1614(-1204826926);
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V")
    public static void method1475(int arg0) {
        if (arg0 == -257) {
            field3866 = null;
            field3864 = null;
            field3852 = null;
            field3862 = null;
            field3865 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lue;III)Loe;")
    public static final class140 method1476(class86 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 19799) {
            field3862 = null;
        }
        ++field3854;
        return !class254.method1687(arg1, (byte) 83, arg0, arg2) ? null : class46.method295(true);
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(II)[I")
    private final int[] method1477(int arg0, int arg1) {
        ++field3855;
        if (~arg1 > -1) {
            return this.field3849;
        } else if (~this.field3848.length >= ~arg1) {
            return this.field3857;
        } else {
            int var3 = -36 / ((arg0 - 51) / 41);
            return this.field3848[arg1];
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(III)Laa;")
    public static final class165 method1478(int arg0, int arg1, int arg2) {
        class2 var3 = class18.field417[arg0][arg1][arg2];
        return var3 != null && var3.field52 != null ? var3.field52 : null;
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(B)V")
    private final void method1479(byte arg0) {
        if (arg0 <= 114) {
            this.field3863 = -38;
        }
        ++field3850;
        int var2 = this.field3863;
        if (var2 != 2) {
            if (~var2 == -2) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~(this.field3848.length + -1) < ~var5 && var4 >= this.field3848[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field3848[var5 + -1];
                    int[] var7 = this.field3848[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] + -var6[0]);
                    int var9 = -class251.field4374[(var8 & 8167) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field3853[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field3848.length + -1 > var14 && ~this.field3848[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field3848[var14];
                    int[] var16 = this.field3848[var14 + -1];
                    int var17 = (-var16[0] + var13 << 12) / (var15[0] + -var16[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var16[1] * var18 - -(var15[1] * var17) >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field3853[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~(this.field3848.length + -1) < ~var22 && this.field3848[var22][0] <= var21; ++var22) {
                }
                int[] var23 = this.field3848[var22];
                int[] var24 = this.field3848[var22 - 1];
                int var25 = this.method1477(105, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1477(105, var22 + 1)[1];
                int var29 = (-var24[0] + var21 << 12) / (var23[0] + -var24[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + var28 + -var26 + var27;
                int var32 = -var25 + var26;
                int var33 = -var27 + var25 + -var31;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var33 >> 12;
                int var37 = var29 * var32 >> 12;
                int var38 = var27 + var35 - (-var36 - var37);
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field3853[var20] = (short) var38;
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(B)V")
    private final void method1480(byte arg0) {
        int[] var2 = this.field3848[0];
        ++field3861;
        int[] var3 = this.field3848[this.field3848.length + -1];
        int var4 = 8 / ((-15 - arg0) / 40);
        int[] var5 = this.field3848[this.field3848.length + -2];
        int[] var6 = this.field3848[1];
        this.field3849 = new int[] { var2[0] + -var6[0] + var2[0], var2[1] + var2[1] + -var6[1] };
        this.field3857 = new int[] { var5[0] - var3[0] - -var5[0], var5[1] + -var3[1] + var5[1] };
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
    public class217() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        if (arg1 == 5701) {
            if (arg0 == 0) {
                this.field3863 = arg2.method1301(-8317);
                this.field3848 = new int[arg2.method1301(-8317)][2];
                for (int var4 = 0; this.field3848.length > var4; ++var4) {
                    this.field3848[var4][0] = arg2.method1294((byte) 3);
                    this.field3848[var4][1] = arg2.method1294((byte) 3);
                }
            }
            ++field3851;
        }
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "(B)V")
    public static final void method1481(byte arg0) {
        ++field3859;
        int var1 = 75 % ((arg0 - -16) / 59);
        if (class1.field13 == null || class251.field4374 == null) {
            class251.field4374 = new int[256];
            class1.field13 = new int[256];
            for (int var2 = 0; ~var2 > -257; ++var2) {
                double var3 = (double) var2 / 255.0D * 6.283185307179586D;
                class1.field13[var2] = (int) (4096.0D * Math.sin(var3));
                class251.field4374[var2] = (int) (Math.cos(var3) * 4096.0D);
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)V")
    public final void method88(int arg0) {
        ++field3860;
        if (this.field3848 == null) {
            this.field3848 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (~this.field3848.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field3863 == 2) {
                this.method1480((byte) 119);
            }
            if (arg0 <= 81) {
                field3852 = null;
            }
            method1481((byte) 68);
            this.method1479((byte) 123);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lfj;ILfj;)V")
    public static final void method1482(class241 arg0, int arg1, class241 arg2) {
        ++field3858;
        if (arg1 < 83) {
            method1474(true);
        }
        if (arg0.field4229 != null) {
            arg0.method1614(-1204826926);
        }
        arg0.field4229 = arg2.field4229;
        arg0.field4235 = arg2;
        arg0.field4229.field4235 = arg0;
        arg0.field4235.field4229 = arg0;
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(II)I")
    public static final int method1483(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }
}
