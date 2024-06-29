import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class109 extends class145 {

    @OriginalMember(owner = "client!tn", name = "J", descriptor = "I")
    private int field1581 = 3072;

    @OriginalMember(owner = "client!tn", name = "F", descriptor = "I")
    private int field1577 = 2048;

    @OriginalMember(owner = "client!tn", name = "O", descriptor = "I")
    private int field1586 = 1024;

    @OriginalMember(owner = "client!tn", name = "I", descriptor = "Z")
    public static boolean field1580 = true;

    @OriginalMember(owner = "client!tn", name = "G", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!tn", name = "H", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!tn", name = "K", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!tn", name = "L", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!tn", name = "M", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!tn", name = "P", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!tn", name = "Q", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!tn", name = "N", descriptor = "Lrk;")
    public static class427 field1585;

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V", line = 4)
    public class109() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "(I)V", line = 9)
    public static void method903(int arg0) {
        if (arg0 == 1604) {
            field1585 = null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lap;BI)V", line = 27)
    public final void method2(class289 arg0, byte arg1, int arg2) {
        ++field1579;
        int var4 = 117 % ((arg1 - 11) / 52);
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field2205 = arg0.method1861((byte) -72) == 1;
                }
            } else {
                this.field1581 = arg0.method1853(-82);
            }
        } else {
            this.field1586 = arg0.method1853(-97);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "([BBZ)Ljava/lang/Object;", line = 70)
    public static final Object method904(byte[] arg0, byte arg1, boolean arg2) {
        if (arg1 < 115) {
            method905((byte) 74, true);
        }
        ++field1587;
        if (arg0 == null) {
            return null;
        } else {
            if (arg0.length > 136 && !class13.field103) {
                try {
                    class114 var3 = (class114) Class.forName("tb").newInstance();
                    var3.method881(arg0, (byte) 121);
                    return var3;
                } catch (Throwable var4) {
                    class13.field103 = true;
                }
            }
            return arg2 ? class331.method2106(arg0, 0) : arg0;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZI)[[I", line = 106)
    public final int[][] method4(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        } else {
            ++field1582;
            int[][] var3 = super.field2217.method2549(arg1, 0);
            if (super.field2217.field5771) {
                int[][] var4 = this.method1121(arg1, 0, 2);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class156.field2364 < ~var11; ++var11) {
                    var8[var11] = (var5[var11] * this.field1577 >> 12) + this.field1586;
                    var9[var11] = this.field1586 - -(var6[var11] * this.field1577 >> 12);
                    var10[var11] = this.field1586 - -(var7[var11] * this.field1577 >> 12);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "(B)V", line = 152)
    public final void method87(byte arg0) {
        if (arg0 != 77) {
            field1585 = null;
        }
        this.field1577 = -this.field1586 + this.field1581;
        ++field1578;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)[I", line = 165)
    public final int[] method3(int arg0, int arg1) {
        ++field1583;
        int[] var3 = super.field2218.method1614(82, arg0);
        int var4 = -87 % ((arg1 - 16) / 49);
        if (super.field2218.field3396) {
            int[] var5 = this.method1119(0, 0, arg0);
            for (int var6 = 0; ~class156.field2364 < ~var6; ++var6) {
                var3[var6] = (var5[var6] * this.field1577 >> 12) + this.field1586;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(BZ)V", line = 206)
    public static final void method905(byte arg0, boolean arg1) {
        ++field1584;
        byte var2;
        byte[][] var3;
        if (arg1) {
            var2 = 1;
            var3 = class360.field4894;
        } else {
            var3 = class192.field2760;
            var2 = 4;
        }
        for (int var4 = 0; ~var2 < ~var4; ++var4) {
            class127.method996(125);
            for (int var5 = 0; ~var5 > ~(class116.field1621 >> 3); ++var5) {
                for (int var6 = 0; var6 < class385.field5425 >> 3; ++var6) {
                    int var7 = class39.field602[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (62181172 & var7) >> 24;
                        if (!arg1 || var8 == 0) {
                            int var9 = (7 & var7) >> 1;
                            int var10 = (16764810 & var7) >> 14;
                            int var11 = (var7 & 16378) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; ~var13 > ~class101.field1500.length; ++var13) {
                                if (class101.field1500[var13] == var12 && var3[var13] != null) {
                                    class91.method800(class235.field3247, var5 * 8, arg1, var3[var13], false, var8, (7 & var10) * 8, var4, var9, var6 * 8, (var11 & 7) * 8, class249.field3415);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg0 < 85) {
            method903(-80);
        }
    }
}
