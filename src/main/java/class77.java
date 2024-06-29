import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class77 extends class272 {

    @OriginalMember(owner = "client!he", name = "ab", descriptor = "[S")
    private short[] field1350 = new short[257];

    @OriginalMember(owner = "client!he", name = "M", descriptor = "I")
    private int field1337 = 0;

    @OriginalMember(owner = "client!he", name = "L", descriptor = "Lli;")
    private static class185 field1336 = class245.method1649("Created gameworld", 127);

    @OriginalMember(owner = "client!he", name = "Q", descriptor = "Lli;")
    public static class185 field1340 = field1336;

    @OriginalMember(owner = "client!he", name = "Z", descriptor = "Z")
    public static boolean field1349 = false;

    @OriginalMember(owner = "client!he", name = "R", descriptor = "Lae;")
    public static class238 field1341 = new class238(64);

    @OriginalMember(owner = "client!he", name = "J", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!he", name = "K", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!he", name = "N", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!he", name = "O", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!he", name = "T", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!he", name = "U", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!he", name = "V", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!he", name = "X", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!he", name = "Y", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!he", name = "bb", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!he", name = "cb", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!he", name = "I", descriptor = "[I")
    private int[] field1333;

    @OriginalMember(owner = "client!he", name = "W", descriptor = "[I")
    private int[] field1346;

    @OriginalMember(owner = "client!he", name = "S", descriptor = "[[I")
    private int[][] field1342;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "(I)Lda;")
    public static final class101 method498(int arg0) {
        ++field1348;
        int var1 = class55.field940[0] * class258.field4591[0];
        byte[] var2 = class174.field3182[0];
        class101 var6;
        if (class267.field4734[0]) {
            byte[] var3 = class71.field1241[0];
            int[] var4 = new int[var1];
            for (int var5 = 0; var1 > var5; ++var5) {
                var4[var5] = class21.method150(class211.field3842[class220.method1526(255, var2[var5])], class220.method1526(-16777216, var3[var5] << 24));
            }
            var6 = new class143(class87.field1716, class210.field3839, class145.field2766[0], class249.field4418[0], class55.field940[0], class258.field4591[0], var4);
        } else {
            int[] var7 = new int[var1];
            for (int var8 = 0; var1 > var8; ++var8) {
                var7[var8] = class211.field3842[class220.method1526(255, var2[var8])];
            }
            var6 = new class101(class87.field1716, class210.field3839, class145.field2766[0], class249.field4418[0], class55.field940[0], class258.field4591[0], var7);
        }
        class269.method1827((byte) -83);
        if (arg0 != -1) {
            field1339 = -87;
        }
        return var6;
    }

    @OriginalMember(owner = "client!he", name = "g", descriptor = "(I)V")
    public static void method499(int arg0) {
        field1341 = null;
        if (arg0 == 0) {
            field1340 = null;
            field1336 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field1338;
        int[] var3 = super.field4819.method1632(0, arg0);
        if (arg1 != 4421) {
            return null;
        } else {
            if (super.field4819.field4294) {
                int[] var4 = this.method1866(arg0, 0, 110);
                for (int var5 = 0; var5 < class246.field4385; ++var5) {
                    int var6 = var4[var5] >> 4;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    if (~var6 < -257) {
                        var6 = 256;
                    }
                    var3[var5] = this.field1350[var6];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!he", name = "h", descriptor = "(I)I")
    public static final int method500(int arg0) {
        if (arg0 != 6) {
            return 37;
        } else {
            ++field1334;
            return 6;
        }
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(I)V")
    public final void method113(int arg0) {
        ++field1352;
        if (arg0 != 0) {
            this.field1346 = null;
        }
        if (this.field1342 == null) {
            this.field1342 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (~this.field1342.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field1337 == 2) {
                this.method502(-32768);
            }
            class256.method1732((byte) -72);
            this.method504(-98);
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
    public class77() {
        super(1, true);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZI)[I")
    private final int[] method501(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        } else {
            ++field1347;
            if (arg1 < 0) {
                return this.field1346;
            } else {
                return ~arg1 <= ~this.field1342.length ? this.field1333 : this.field1342[arg1];
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        int var4 = 89 / ((arg1 - -21) / 55);
        if (~arg2 == -1) {
            this.field1337 = arg0.method867(false);
            this.field1342 = new int[arg0.method867(false)][2];
            for (int var5 = 0; ~var5 > ~this.field1342.length; ++var5) {
                this.field1342[var5][0] = arg0.method827(255);
                this.field1342[var5][1] = arg0.method827(255);
            }
        }
        ++field1345;
    }

    @OriginalMember(owner = "client!he", name = "i", descriptor = "(I)V")
    private final void method502(int arg0) {
        if (arg0 == -32768) {
            ++field1335;
            int[] var2 = this.field1342[0];
            int[] var3 = this.field1342[this.field1342.length - 2];
            int[] var4 = this.field1342[1];
            int[] var5 = this.field1342[this.field1342.length + -1];
            this.field1333 = new int[] { var3[0] - (-var3[0] - -var5[0]), var3[1] - (var5[1] - var3[1]) };
            this.field1346 = new int[] { var2[0] + -var4[0] + var2[0], var2[1] - (-var2[1] - -var4[1]) };
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
    public static final void method503(byte arg0) {
        ++field1343;
        if (arg0 < 8) {
            field1336 = null;
        }
        for (int var1 = 0; var1 < 100; ++var1) {
            class44.field700[var1] = true;
        }
    }

    @OriginalMember(owner = "client!he", name = "j", descriptor = "(I)V")
    private final void method504(int arg0) {
        ++field1344;
        if (arg0 >= -33) {
            field1336 = null;
        }
        int var2 = this.field1337;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field1342.length + -1 && ~this.field1342[var5][0] >= ~var4; ++var5) {
                    }
                    int[] var6 = this.field1342[var5 + -1];
                    int[] var7 = this.field1342[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class96.field1804[var8 >> 5 & 255] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field1350[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field1342.length + -1) < ~var14 && var13 >= this.field1342[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field1342[var14];
                    int[] var16 = this.field1342[var14 + -1];
                    int var17 = (var13 - var16[0] << 12) / (var15[0] + -var16[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var17 + var16[1] * var18 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field1350[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field1342.length + -1 > var22 && ~var21 <= ~this.field1342[var22][0]; ++var22) {
                }
                int[] var23 = this.field1342[var22 + -1];
                int[] var24 = this.field1342[var22];
                int var25 = this.method501(true, var22 + -2)[1];
                int var26 = var24[1];
                int var27 = var23[1];
                int var28 = this.method501(true, var22 + 1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + var28 - (-var27 + var26);
                int var32 = -var27 + var25 - var31;
                int var34 = -var25 + var26;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var34 >> 12;
                int var38 = var35 + var37 - -var36 + var27;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field1350[var20] = (short) var38;
            }
        }
    }
}
