import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class98 extends class11 {

    @OriginalMember(owner = "client!ct", name = "K", descriptor = "Z")
    private boolean field1480 = true;

    @OriginalMember(owner = "client!ct", name = "R", descriptor = "Z")
    private boolean field1486 = true;

    @OriginalMember(owner = "client!ct", name = "G", descriptor = "I")
    public static int field1476 = -1;

    @OriginalMember(owner = "client!ct", name = "N", descriptor = "F")
    public static float field1482;

    @OriginalMember(owner = "client!ct", name = "H", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!ct", name = "I", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!ct", name = "J", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!ct", name = "M", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!ct", name = "O", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!ct", name = "Q", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!ct", name = "S", descriptor = "Ll;")
    public static class16 field1487;

    @OriginalMember(owner = "client!ct", name = "P", descriptor = "Lod;")
    public static class349 field1484;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILjn;IB)J")
    public static final long method717(int arg0, class503 arg1, int arg2, byte arg3) {
        ++field1481;
        if (arg3 != 76) {
            method720(true);
        }
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class220 var10 = class78.field1141.method2103(arg1.method490(-29679), true);
        long var11 = (long) (arg0 | arg2 << 7 | arg1.method496(-89) << 14 | arg1.method499(arg3 ^ -15493) << 20 | 1073741824);
        if (~var10.field3119 == -1) {
            var11 |= var8;
        }
        if (~var10.field3086 == -2) {
            var11 |= var4;
        }
        if (var10.field3070) {
            var11 |= var6;
        }
        return var11 | (long) arg1.method490(-29679) << 32;
    }

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "(I)V")
    public static void method718(int arg0) {
        if (arg0 != 0) {
            field1482 = -0.80154186F;
        }
        field1487 = null;
        field1484 = null;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)[[I")
    public final int[][] method41(int arg0, int arg1) {
        int var3 = 58 % ((-75 - arg0) / 49);
        ++field1477;
        int[][] var4 = super.field156.method1719(arg1, 3);
        if (super.field156.field4001) {
            int[][] var5 = this.method49(!this.field1480 ? arg1 : class183.field2683 - arg1, 0, 119);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            if (this.field1486) {
                for (int var12 = 0; ~class90.field1316 < ~var12; ++var12) {
                    var9[var12] = var6[-var12 + class99.field1490];
                    var10[var12] = var7[-var12 + class99.field1490];
                    var11[var12] = var8[class99.field1490 - var12];
                }
            } else {
                for (int var13 = 0; class90.field1316 > var13; ++var13) {
                    var9[var13] = var6[var13];
                    var10[var13] = var7[var13];
                    var11[var13] = var8[var13];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lsi;II)V")
    public final void method43(class391 arg0, int arg1, int arg2) {
        ++field1479;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field167 = ~arg0.method2348(-2) == -2;
                }
            } else {
                this.field1480 = ~arg0.method2348(-2) == -2;
            }
        } else {
            this.field1486 = arg0.method2348(-2) == 1;
        }
        if (arg1 > -40) {
            this.field1486 = true;
        }
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "()V")
    public class98() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(BII)Z")
    public static final boolean method719(byte arg0, int arg1, int arg2) {
        ++field1478;
        if (arg0 != -3) {
            method717(-41, (class503) null, -114, (byte) 57);
        }
        return (arg1 & 2048) != 0;
    }

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "(Z)V")
    public static final void method720(boolean arg0) {
        ++field1483;
        class96.method706(-4701, false);
        if (~class276.field3777 <= -1 && class276.field3777 != 0) {
            class455.method2675(67, class276.field3777);
            class276.field3777 = -1;
        }
        if (!arg0) {
            method718(-63);
        }
    }

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        if (arg0 > -42) {
            return null;
        } else {
            ++field1485;
            int[] var3 = super.field158.method1312(arg1, (byte) 74);
            if (super.field158.field2966) {
                int[] var4 = this.method48(!this.field1480 ? arg1 : -arg1 + class183.field2683, 0, (byte) -88);
                if (!this.field1486) {
                    class91.method680(var4, 0, var3, 0, class90.field1316);
                } else {
                    for (int var5 = 0; ~class90.field1316 < ~var5; ++var5) {
                        var3[var5] = var4[-var5 + class99.field1490];
                    }
                }
            }
            return var3;
        }
    }
}
