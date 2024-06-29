import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class95 extends class43 {

    @OriginalMember(owner = "client!ih", name = "X", descriptor = "[S")
    private short[] field1663 = new short[257];

    @OriginalMember(owner = "client!ih", name = "mb", descriptor = "I")
    private int field1678 = 0;

    @OriginalMember(owner = "client!ih", name = "V", descriptor = "Lmb;")
    private static class132 field1661 = class166.method1092("Please reload this page)3", 123);

    @OriginalMember(owner = "client!ih", name = "bb", descriptor = "I")
    public static int field1667 = 0;

    @OriginalMember(owner = "client!ih", name = "ab", descriptor = "I")
    public static int field1666 = 0;

    @OriginalMember(owner = "client!ih", name = "jb", descriptor = "Lmb;")
    public static class132 field1675 = field1661;

    @OriginalMember(owner = "client!ih", name = "U", descriptor = "Lkg;")
    public static class115 field1660 = new class115(64);

    @OriginalMember(owner = "client!ih", name = "nb", descriptor = "[Lmb;")
    public static class132[] field1679 = new class132[500];

    @OriginalMember(owner = "client!ih", name = "ob", descriptor = "Llc;")
    public static class122 field1680 = new class122(4096);

    @OriginalMember(owner = "client!ih", name = "pb", descriptor = "I")
    public static int field1681 = 0;

    @OriginalMember(owner = "client!ih", name = "rb", descriptor = "Lmb;")
    private static class132 field1683 = class166.method1092("New User", 116);

    @OriginalMember(owner = "client!ih", name = "sb", descriptor = "Lmb;")
    public static class132 field1684 = field1683;

    @OriginalMember(owner = "client!ih", name = "tb", descriptor = "Lq;")
    public static class174 field1685 = new class174(50);

    @OriginalMember(owner = "client!ih", name = "ub", descriptor = "Lmb;")
    public static class132 field1686 = class166.method1092("Stufe)2", 116);

    @OriginalMember(owner = "client!ih", name = "vb", descriptor = "Lmb;")
    public static class132 field1687 = class166.method1092("<col=ffffff> )4 ", 113);

    @OriginalMember(owner = "client!ih", name = "T", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!ih", name = "W", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!ih", name = "Y", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!ih", name = "Z", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!ih", name = "cb", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!ih", name = "db", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!ih", name = "hb", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!ih", name = "ib", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!ih", name = "kb", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!ih", name = "lb", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!ih", name = "qb", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!ih", name = "eb", descriptor = "[I")
    private int[] field1670;

    @OriginalMember(owner = "client!ih", name = "fb", descriptor = "[I")
    private int[] field1671;

    @OriginalMember(owner = "client!ih", name = "gb", descriptor = "[[I")
    private int[][] field1672;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "(I)V")
    public static void method584(int arg0) {
        field1661 = null;
        if (arg0 == -32767) {
            field1675 = null;
            field1679 = null;
            field1680 = null;
            field1660 = null;
            field1687 = null;
            field1684 = null;
            field1685 = null;
            field1683 = null;
            field1686 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)[I")
    public final int[] method64(int arg0, int arg1) {
        ++field1662;
        int[] var3 = super.field768.method1123(arg1 + arg1, arg0);
        if (super.field768.field3219) {
            int[] var4 = this.method300(95, 0, arg0);
            for (int var5 = 0; class131.field2427 > var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field1663[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "(I)V")
    private final void method585(int arg0) {
        ++field1659;
        int[] var2 = this.field1672[0];
        int[] var3 = this.field1672[1];
        int[] var4 = this.field1672[this.field1672.length + -2];
        int[] var5 = this.field1672[this.field1672.length + -1];
        this.field1671 = new int[] { var2[0] - (var3[0] - var2[0]), -var3[1] - -var2[1] + var2[1] };
        this.field1670 = new int[] { var4[0] - (-var4[0] - -var5[0]), -var5[1] - -var4[arg0] + var4[1] };
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
    public class95() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)V")
    private final void method586(byte arg0) {
        ++field1673;
        if (arg0 >= -39) {
            method587(-120, -106);
        }
        int var2 = this.field1678;
        if (var2 != 2) {
            if (~var2 == -2) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field1672.length + -1 && var4 >= this.field1672[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field1672[var5 + -1];
                    int[] var7 = this.field1672[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] + -var6[0]);
                    int var9 = -class69.field1151[(var8 & 8184) >> 5] + 4096 >> 1;
                    int var10 = 4096 - var9;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field1663[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field1672.length + -1 > var14 && ~var13 <= ~this.field1672[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field1672[var14 + -1];
                    int[] var16 = this.field1672[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field1663[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field1672.length + -1 && ~this.field1672[var22][0] >= ~var21; ++var22) {
                }
                int[] var23 = this.field1672[var22 + -1];
                int[] var24 = this.field1672[var22];
                int var25 = this.method588(-1, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method588(-1, var22 - -1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + -var27 + var28 + var26;
                int var32 = var25 - (var26 + var31);
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 + var36 + var37 + var26;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field1663[var20] = (short) var38;
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(II)Lmd;")
    public static final class134 method587(int arg0, int arg1) {
        class134 var2 = (class134) class25.field406.method777(-1, (long) arg1);
        ++field1674;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class200.field3690.method1079(arg1, arg0 + -55, 0);
            if (var3 == null) {
                return null;
            } else {
                class134 var4 = new class134();
                class112 var5 = new class112(var3);
                var5.field2133 = var5.field2157.length + arg0;
                int var6 = var5.method739(arg0 ^ 122);
                int var7 = var5.field2157.length + -2 + -var6 + -12;
                var5.field2133 = var7;
                int var8 = var5.method759(37);
                var4.field2523 = var5.method739(-123);
                var4.field2522 = var5.method739(65);
                var4.field2530 = var5.method739(arg0 + 83);
                var4.field2527 = var5.method739(-125);
                int var9 = var5.method716(-1308);
                if (~var9 < -1) {
                    var4.field2532 = new class122[var9];
                    for (int var10 = 0; var10 < var9; ++var10) {
                        int var11 = var5.method739(-125);
                        class122 var12 = new class122(class145.method975(1185900324, var11));
                        var4.field2532[var10] = var12;
                        while (var11-- > 0) {
                            int var13 = var5.method759(arg0 + 111);
                            int var14 = var5.method759(106);
                            var12.method810(new class171(var14), (long) var13, -18274);
                        }
                    }
                }
                var5.field2133 = 0;
                var4.field2526 = var5.method755(1971511760);
                int var15 = 0;
                var4.field2517 = new int[var8];
                var4.field2520 = new class132[var8];
                var4.field2521 = new int[var8];
                while (~var5.field2133 > ~var7) {
                    int var16 = var5.method739(-125);
                    if (var16 == 3) {
                        var4.field2520[var15] = var5.method720((byte) 84);
                    } else if (var16 < 100 && ~var16 != -22 && var16 != 38 && ~var16 != -40) {
                        var4.field2521[var15] = var5.method759(45);
                    } else {
                        var4.field2521[var15] = var5.method716(-1308);
                    }
                    var4.field2517[var15++] = var16;
                }
                class25.field406.method774((long) arg1, var4, 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(II)[I")
    private final int[] method588(int arg0, int arg1) {
        if (arg0 != -1) {
            return null;
        } else {
            ++field1669;
            if (arg1 < 0) {
                return this.field1671;
            } else {
                return this.field1672.length <= arg1 ? this.field1670 : this.field1672[arg1];
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLdh;)V")
    public static final void method589(byte arg0, class42 arg1) {
        arg1.field722 = 0;
        int var2 = arg1.field704 - class30.field460;
        if (arg0 != -44) {
            field1675 = null;
        }
        ++field1676;
        if (~arg1.field694 == -1) {
            arg1.field739 = 1024;
        }
        int var3 = arg1.field679 * 64 + arg1.field678 * 128;
        int var4 = arg1.field714 * 128 + arg1.field679 * 64;
        arg1.field723 += (-arg1.field723 + var3) / var2;
        arg1.field673 += (-arg1.field673 + var4) / var2;
        if (arg1.field694 == 1) {
            arg1.field739 = 1536;
        }
        if (arg1.field694 == 2) {
            arg1.field739 = 0;
        }
        if (arg1.field694 == 3) {
            arg1.field739 = 512;
        }
    }

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "(I)V")
    public static final void method590(int arg0) {
        if (arg0 != 4096) {
            field1685 = null;
        }
        field1660.method778((byte) 118);
        ++field1665;
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)V")
    public final void method234(int arg0) {
        if (this.field1672 == null) {
            this.field1672 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field1682;
        if (~this.field1672.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field1678 == 2) {
                this.method585(1);
            }
            class191.method1222(false);
            this.method586((byte) -48);
            if (arg0 <= 21) {
                this.field1670 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        if (~arg0 == -1) {
            this.field1678 = arg2.method716(-1308);
            this.field1672 = new int[arg2.method716(arg1 ^ 1363)][2];
            for (int var4 = 0; ~var4 > ~this.field1672.length; ++var4) {
                this.field1672[var4][0] = arg2.method739(arg1 + -51);
                this.field1672[var4][1] = arg2.method739(80);
            }
        }
        ++field1664;
        if (arg1 != -73) {
            field1666 = -117;
        }
    }
}
