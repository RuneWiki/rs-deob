import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class259 extends class242 {

    @OriginalMember(owner = "client!ca", name = "R", descriptor = "I")
    private int field4583 = 1;

    @OriginalMember(owner = "client!ca", name = "eb", descriptor = "I")
    private int field4596 = 204;

    @OriginalMember(owner = "client!ca", name = "bb", descriptor = "I")
    private int field4593 = 1;

    @OriginalMember(owner = "client!ca", name = "X", descriptor = "[I")
    public static int[] field4589 = new int[25];

    @OriginalMember(owner = "client!ca", name = "W", descriptor = "Lp;")
    public static class280 field4588 = class18.method140((byte) -122, "voudrait faire un -Bchange avec vous)3");

    @OriginalMember(owner = "client!ca", name = "fb", descriptor = "I")
    public static int field4597 = 0;

    @OriginalMember(owner = "client!ca", name = "db", descriptor = "Lp;")
    public static class280 field4595 = class18.method140((byte) -124, "ondulation2:");

    @OriginalMember(owner = "client!ca", name = "gb", descriptor = "[[[B")
    public static byte[][][] field4598 = new byte[4][104][104];

    @OriginalMember(owner = "client!ca", name = "S", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!ca", name = "T", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!ca", name = "U", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!ca", name = "V", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!ca", name = "Y", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!ca", name = "Z", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!ca", name = "ab", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!ca", name = "cb", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(II)Lp;")
    public static final class280 method1751(int arg0, int arg1) {
        ++field4585;
        class280 var2 = class249.method1685((byte) 45, arg0);
        int var3 = -3 + var2.method1889(-1);
        int var4 = -19 % ((-15 - arg1) / 32);
        while (~var3 < -1) {
            var2 = class30.method266(new class280[] { var2.method1864(var3, 0, (byte) -48), class8.field150, var2.method1870((byte) -122, var3) }, (byte) -87);
            var3 -= 3;
        }
        if (~var2.method1889(-1) < -10) {
            return class30.method266(new class280[] { class73.field1207, var2.method1864(var2.method1889(-1) + -8, 0, (byte) -23), class76.field1246, class64.field1067, var2, class169.field2961 }, (byte) -87);
        } else {
            return var2.method1889(-1) > 6 ? class30.method266(new class280[] { class224.field3876, var2.method1864(var2.method1889(-1) - 4, 0, (byte) -21), class102.field1662, class64.field1067, var2, class169.field2961 }, (byte) -87) : class30.method266(new class280[] { class199.field3481, var2, class106.field1763 }, (byte) -87);
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(BLua;)Z")
    public static final boolean method1752(byte arg0, class113 arg1) {
        ++field4594;
        if (arg1.field1939 == null) {
            return false;
        } else {
            if (arg0 != -117) {
                field4586 = 92;
            }
            for (int var2 = 0; ~var2 > ~arg1.field1939.length; ++var2) {
                int var3 = class49.method363(var2, arg1, (byte) 108);
                int var4 = arg1.field1982[var2];
                if (~arg1.field1939[var2] != -3) {
                    if (arg1.field1939[var2] != 3) {
                        if (~arg1.field1939[var2] != -5) {
                            if (var3 != var4) {
                                return false;
                            }
                        } else if (~var3 == ~var4) {
                            return false;
                        }
                    } else if (~var3 >= ~var4) {
                        return false;
                    }
                } else if (var3 >= var4) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)[I")
    public final int[] method54(int arg0, int arg1) {
        ++field4591;
        int[] var3 = super.field4251.method1417((byte) 92, arg0);
        if (super.field4251.field3655) {
            for (int var4 = 0; ~var4 > ~class264.field4654; ++var4) {
                int var5 = class117.field2106[arg0];
                int var6 = class102.field1701[var4];
                int var7 = this.field4593 * var6 >> 12;
                int var8 = this.field4583 * var5 >> 12;
                int var9 = var5 % (4096 / this.field4583) * this.field4583;
                int var10 = var6 % (4096 / this.field4593) * this.field4593;
                if (this.field4596 > var9) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var10 > ~this.field4596) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field4596 < ~var10) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        int var12 = 7 % ((arg1 - 73) / 41);
        return var3;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
    public class259() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
    public static void method1753(byte arg0) {
        int var1 = -33 / ((arg0 - 61) / 61);
        field4598 = null;
        field4588 = null;
        field4595 = null;
        field4589 = null;
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(II)[B")
    public static final byte[] method1754(int arg0, int arg1) {
        if (arg0 < 101) {
            field4586 = 100;
        }
        ++field4587;
        class189 var2 = (class189) class232.field4033.method1699((long) arg1, 106);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; ~var5 > -256; ++var5) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; ~var6 > -256; ++var6) {
                int var7 = -var6 + 255;
                int var8 = class47.method352(1, var4, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[-var6 + 511] = var9;
            }
            var2 = new class189(var3);
            class232.field4033.method1703(var2, (byte) 111, (long) arg1);
        }
        return var2.field3315;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        if (arg0 >= -119) {
            field4595 = null;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field4596 = arg2.method193((byte) 77);
                }
            } else {
                this.field4583 = arg2.method189((byte) -103);
            }
        } else {
            this.field4593 = arg2.method189((byte) -103);
        }
        ++field4590;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILlj;)Lgg;")
    public static final class191 method1755(int arg0, class25 arg1) {
        if (arg0 <= 42) {
            field4598 = null;
        }
        ++field4592;
        return new class191(arg1.method191(81), arg1.method191(-125), arg1.method191(34), arg1.method191(-124), arg1.method230(15046), arg1.method230(15046), arg1.method189((byte) -103));
    }
}
