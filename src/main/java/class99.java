import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class99 extends class270 {

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "[S")
    private short[] field1625 = new short[257];

    @OriginalMember(owner = "client!oa", name = "eb", descriptor = "I")
    private int field1636 = 0;

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "Lmh;")
    public static class62 field1629 = class201.method1405(true, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "I")
    public static int field1630 = 0;

    @OriginalMember(owner = "client!oa", name = "W", descriptor = "I")
    public static int field1628 = 0;

    @OriginalMember(owner = "client!oa", name = "bb", descriptor = "[I")
    public static int[] field1633 = new int[] { 4, 4, 1, 2, 6, 4, 2, 50, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!oa", name = "kb", descriptor = "Lmh;")
    public static class62 field1642 = class201.method1405(true, "l");

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!oa", name = "V", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!oa", name = "cb", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!oa", name = "fb", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!oa", name = "hb", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!oa", name = "ib", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!oa", name = "jb", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!oa", name = "ab", descriptor = "Ln;")
    public static class229 field1632;

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "[I")
    private int[] field1626;

    @OriginalMember(owner = "client!oa", name = "db", descriptor = "[I")
    private int[] field1635;

    @OriginalMember(owner = "client!oa", name = "gb", descriptor = "[[I")
    private int[][] field1638;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lmi;II)V", line = 19)
    public final void method8(class92 arg0, int arg1, int arg2) {
        int var4 = 58 / ((arg2 + 8) / 53);
        if (arg1 == 0) {
            this.field1636 = arg0.method702(-1);
            this.field1638 = new int[arg0.method702(-1)][2];
            for (int var5 = 0; var5 < this.field1638.length; var5++) {
                this.field1638[var5][0] = arg0.method721(125);
                this.field1638[var5][1] = arg0.method721(98);
            }
        }
        field1637++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZ)[I", line = 47)
    private final int[] method789(int arg0, boolean arg1) {
        field1624++;
        if (arg0 >= 0) {
            if (!arg1) {
                this.method789(-47, true);
            }
            return this.field1638.length <= arg0 ? this.field1626 : this.field1638[arg0];
        } else {
            return this.field1635;
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V", line = 65)
    public static final void method790(int arg0) {
        field1634++;
        int var1 = class75.field1223.method1687(8, (byte) 26);
        if (class118.field1975 > var1) {
            for (int var2 = var1; var2 < class118.field1975; var2++) {
                class97.field1597[class258.field4354++] = class98.field1617[var2];
            }
        }
        if (class118.field1975 < var1) {
            throw new RuntimeException("gppov1");
        }
        int var3 = 29 % ((-arg0 - 19) / 63);
        class118.field1975 = 0;
        for (int var4 = 0; var4 < var1; var4++) {
            int var5 = class98.field1617[var4];
            class153 var6 = class5.field50[var5];
            int var7 = class75.field1223.method1687(1, (byte) 26);
            if (var7 == 0) {
                class98.field1617[class118.field1975++] = var5;
                var6.field3854 = class199.field3367;
            } else {
                int var8 = class75.field1223.method1687(2, (byte) 26);
                if (var8 == 0) {
                    class98.field1617[class118.field1975++] = var5;
                    var6.field3854 = class199.field3367;
                    class21.field224[class294.field5010++] = var5;
                } else if (var8 == 1) {
                    class98.field1617[class118.field1975++] = var5;
                    var6.field3854 = class199.field3367;
                    int var9 = class75.field1223.method1687(3, (byte) 26);
                    var6.method1580(false, (byte) -92, var9);
                    int var10 = class75.field1223.method1687(1, (byte) 26);
                    if (var10 == 1) {
                        class21.field224[class294.field5010++] = var5;
                    }
                } else if (var8 == 2) {
                    class98.field1617[class118.field1975++] = var5;
                    var6.field3854 = class199.field3367;
                    int var11 = class75.field1223.method1687(3, (byte) 26);
                    var6.method1580(true, (byte) -92, var11);
                    int var12 = class75.field1223.method1687(3, (byte) 26);
                    var6.method1580(true, (byte) -92, var12);
                    int var13 = class75.field1223.method1687(1, (byte) 26);
                    if (var13 == 1) {
                        class21.field224[class294.field5010++] = var5;
                    }
                } else if (var8 == 3) {
                    class97.field1597[class258.field4354++] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V", line = 496)
    public class99() {
        super(1, true);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V", line = 174)
    private final void method791(int arg0) {
        field1641++;
        int var2 = this.field1636;
        if (var2 == 2) {
            for (int var20 = 0; var20 < 257; var20++) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; (this.field1638.length - 1) > var22 && var21 >= this.field1638[var22][0]; var22++) {
                }
                int[] var23 = this.field1638[var22 - 1];
                int[] var24 = this.field1638[var22];
                int var25 = this.method789(var22 - 2, true)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method789(var22 + 1, true)[1];
                int var29 = (var21 - var23[0] << 12) / (var24[0] - var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var28 + var26 - var25 - var27;
                int var32 = var27 - var25;
                int var33 = var25 - var31 - var26;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var29 * var32 >> 12;
                int var37 = var30 * var33 >> 12;
                int var38 = var35 + var36 + var37 + var26;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field1625[var20] = (short) var38;
            }
        } else if (var2 == 1) {
            for (int var11 = 0; var11 < 257; var11++) {
                int var12 = var11 << 4;
                int var13;
                for (var13 = 1; (this.field1638.length - 1) > var13 && this.field1638[var13][0] <= var12; var13++) {
                }
                int[] var14 = this.field1638[var13 - 1];
                int[] var15 = this.field1638[var13];
                int var16 = (var12 - var14[0] << 12) / (var15[0] - var14[0]);
                int var17 = 4096 - class63.field953[var16 >> 5 & 0xFF] >> 1;
                int var18 = 4096 - var17;
                int var19 = var14[1] * var18 + var15[1] * var17 >> 12;
                if (var19 <= -32768) {
                    var19 = -32767;
                }
                if (var19 >= 32768) {
                    var19 = 32767;
                }
                this.field1625[var11] = (short) var19;
            }
        } else {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; var5 < (this.field1638.length - 1) && this.field1638[var5][0] <= var4; var5++) {
                }
                int[] var6 = this.field1638[var5];
                int[] var7 = this.field1638[var5 - 1];
                int var8 = (var4 - var7[0] << 12) / (var6[0] - var7[0]);
                int var9 = 4096 - var8;
                int var10 = var6[1] * var8 + var7[1] * var9 >> 12;
                if (var10 <= -32768) {
                    var10 = -32767;
                }
                if (var10 >= 32768) {
                    var10 = 32767;
                }
                this.field1625[var3] = (short) var10;
            }
        }
        if (arg0 != 0) {
            this.field1626 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IJ)V", line = 365)
    public static final void method792(int arg0, long arg1) {
        field1627++;
        if (arg1 <= 0L) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class52.method333(arg1 - 1L, 0);
            class52.method333(1L, 102);
        } else {
            class52.method333(arg1, arg0 - 7);
        }
        if (arg0 != -1) {
            field1630 = 12;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)[I", line = 394)
    public final int[] method6(int arg0, int arg1) {
        field1631++;
        if (arg0 != 18693) {
            this.field1636 = -38;
        }
        int[] var3 = this.field4573.method919(arg1, 26072);
        if (this.field4573.field1984) {
            int[] var4 = this.method1850(0, 0, arg1);
            for (int var5 = 0; var5 < class109.field1770; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field1625[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V", line = 439)
    public static void method793(boolean arg0) {
        field1633 = null;
        field1629 = null;
        field1632 = null;
        field1642 = null;
        if (!arg0) {
            method793(true);
        }
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(B)V", line = 457)
    public final void method231(byte arg0) {
        field1640++;
        if (this.field1638 == null) {
            this.field1638 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        if (this.field1638.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field1636 == 2) {
            this.method794(0);
        }
        class96.method767((byte) -83);
        if (arg0 == 90) {
            this.method791(0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V", line = 482)
    private final void method794(int arg0) {
        int[] var2 = this.field1638[0];
        field1639++;
        int[] var3 = this.field1638[1];
        int[] var4 = this.field1638[this.field1638.length - 2];
        int[] var5 = this.field1638[this.field1638.length - 1];
        this.field1635 = new int[] { var2[arg0] + var2[0] - var3[0], var2[1] + -var3[1] + var2[1] };
        this.field1626 = new int[] { var4[0] - (var5[0] - var4[0]), var4[1] - (var5[1] + -var4[1]) };
    }
}
