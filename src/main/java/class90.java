import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class90 extends class182 {

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "[S")
    private short[] field1480 = new short[257];

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "I")
    private int field1482 = 0;

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "I")
    public static volatile int field1488 = 0;

    @OriginalMember(owner = "client!jb", name = "U", descriptor = "Lpf;")
    public static class17 field1486 = new class17(500);

    @OriginalMember(owner = "client!jb", name = "fb", descriptor = "Ljava/lang/String;")
    public static String field1497 = "Choose Option";

    @OriginalMember(owner = "client!jb", name = "eb", descriptor = "Ljg;")
    public static class42 field1496 = new class42(128);

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!jb", name = "Z", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!jb", name = "ab", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!jb", name = "bb", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!jb", name = "cb", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!jb", name = "hb", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "Laj;")
    public static class151 field1483;

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "Lf;")
    public static class205 field1487;

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "[I")
    private int[] field1485;

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "[I")
    private int[] field1490;

    @OriginalMember(owner = "client!jb", name = "db", descriptor = "[[I")
    private int[][] field1495;

    @OriginalMember(owner = "client!jb", name = "gb", descriptor = "[[[Lmc;")
    public static class174[][][] field1498;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        if (arg2 == 0) {
            this.field1482 = arg1.method1802((byte) -114);
            this.field1495 = new int[arg1.method1802((byte) 40)][2];
            for (int var4 = 0; this.field1495.length > var4; ++var4) {
                this.field1495[var4][0] = arg1.method1821((byte) 51);
                this.field1495[var4][1] = arg1.method1821((byte) 51);
            }
        }
        ++field1484;
        if (arg0) {
            this.field1480 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI)[I")
    public final int[] method153(boolean arg0, int arg1) {
        int[] var3 = super.field2911.method77(arg1, -52);
        if (arg0) {
            return null;
        } else {
            ++field1492;
            if (super.field2911.field287) {
                int[] var4 = this.method1323(0, -17707, arg1);
                for (int var5 = 0; ~var5 > ~class4.field116; ++var5) {
                    int var6 = var4[var5] >> 4;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    if (~var6 < -257) {
                        var6 = 256;
                    }
                    var3[var5] = this.field1480[var6];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)V")
    private final void method625(byte arg0) {
        ++field1493;
        if (arg0 > -46) {
            this.method627(-20);
        }
        int[] var2 = this.field1495[1];
        int[] var3 = this.field1495[0];
        int[] var4 = this.field1495[this.field1495.length + -1];
        int[] var5 = this.field1495[this.field1495.length - 2];
        this.field1485 = new int[] { var5[0] + -var4[0] + var5[0], var5[1] - var4[1] + var5[1] };
        this.field1490 = new int[] { var3[0] + var3[0] + -var2[0], var3[1] - (var2[1] + -var3[1]) };
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)[I")
    private final int[] method626(int arg0, int arg1) {
        ++field1499;
        if (~arg0 > -1) {
            return this.field1490;
        } else if (~arg0 <= ~this.field1495.length) {
            return this.field1485;
        } else {
            return arg1 != -14704 ? null : this.field1495[arg0];
        }
    }

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "(I)V")
    public final void method469(int arg0) {
        if (arg0 != -1) {
            field1496 = null;
        }
        if (this.field1495 == null) {
            this.field1495 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field1491;
        if (~this.field1495.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field1482 == 2) {
                this.method625((byte) -104);
            }
            class186.method1346((byte) 28);
            this.method627(26673);
        }
    }

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "(I)V")
    private final void method627(int arg0) {
        if (arg0 != 26673) {
            this.method155(false, (class249) null, -67);
        }
        int var2 = this.field1482;
        if (~var2 != -3) {
            if (~var2 == -2) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~(this.field1495.length + -1) < ~var5 && this.field1495[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field1495[var5 + -1];
                    int[] var7 = this.field1495[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class289.field4765[var8 >> 5 & 255] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field1480[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field1495.length + -1) < ~var14 && ~var13 <= ~this.field1495[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field1495[var14 + -1];
                    int[] var16 = this.field1495[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = 4096 - var17;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field1480[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~var22 > ~(this.field1495.length - 1) && ~var21 <= ~this.field1495[var22][0]; ++var22) {
                }
                int[] var23 = this.field1495[var22];
                int[] var24 = this.field1495[var22 + -1];
                int var25 = this.method626(var22 - 2, -14704)[1];
                int var26 = var24[1];
                int var27 = var23[1];
                int var28 = this.method626(var22 - -1, -14704)[1];
                int var29 = (-var24[0] + var21 << 12) / (var23[0] - var24[0]);
                int var30 = var28 - var27 + -var25 + var26;
                int var31 = var29 * var29 >> 12;
                int var32 = -var30 + var25 + -var26;
                int var33 = -var25 + var27;
                int var35 = var31 * var32 >> 12;
                int var36 = (var29 * var30 >> 12) * var31 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 + var36 - (-var26 + -var37);
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field1480[var20] = (short) var38;
            }
        }
        ++field1489;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)V")
    public static void method628(byte arg0) {
        field1487 = null;
        field1497 = null;
        field1498 = null;
        field1486 = null;
        field1496 = null;
        field1483 = null;
        int var1 = 77 % ((-60 - arg0) / 39);
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
    public class90() {
        super(1, true);
    }
}
