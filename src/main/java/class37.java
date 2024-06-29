import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class37 extends class82 {

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "Z")
    private boolean field662 = true;

    @OriginalMember(owner = "client!dc", name = "bb", descriptor = "Z")
    private boolean field667 = true;

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "Ldj;")
    public static class44 field659 = class89.method650(255, "Unerwartete Antwort vom Anmelde)2Server");

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "Ldj;")
    public static class44 field661 = class89.method650(255, "Diese Welt ist voll)3");

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "[I")
    public static int[] field657 = new int[200];

    @OriginalMember(owner = "client!dc", name = "ab", descriptor = "I")
    public static int field666 = 0;

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "I")
    public static int field664 = 0;

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "[[B")
    public static byte[][] field665;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(B)V")
    public static void method255(byte arg0) {
        field665 = null;
        field657 = null;
        field659 = null;
        field661 = null;
        if (arg0 != -40) {
            field659 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(B)V")
    public static final void method256(byte arg0) {
        ++field663;
        if (class101.field1844 != null) {
            class101.field1844.method778((byte) -2);
            class101.field1844 = null;
        }
        class162.method1050((byte) -114);
        class196.method1274();
        if (arg0 <= 0) {
            method257((byte) 58, 64);
        }
        for (int var1 = 0; ~var1 > -5; ++var1) {
            class73.field1390[var1].method1405(-5);
        }
        class61.method457((byte) 55);
        System.gc();
        class136.method914(2, 115);
        class73.field1386 = -1;
        class197.field3490 = false;
        class89.method653(true);
        class62.method467(10, (byte) 57);
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(II)[[I")
    public final int[][] method6(int arg0, int arg1) {
        if (arg0 > -59) {
            return null;
        } else {
            int[][] var3 = super.field1601.method548(arg1, true);
            ++field656;
            if (super.field1601.field1343) {
                int[][] var4 = this.method619(this.field667 ? -arg1 + class101.field1850 : arg1, true, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                int[] var10 = var3[0];
                if (this.field662) {
                    for (int var11 = 0; var11 < class129.field2287; ++var11) {
                        var10[var11] = var5[class53.field943 - var11];
                        var8[var11] = var6[-var11 + class53.field943];
                        var9[var11] = var7[-var11 + class53.field943];
                    }
                } else {
                    for (int var12 = 0; class129.field2287 > var12; ++var12) {
                        var10[var12] = var5[var12];
                        var8[var12] = var6[var12];
                        var9[var12] = var7[var12];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        if (arg2 != 68) {
            method257((byte) 53, 74);
        }
        ++field658;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field1599 = arg0.method506(255) == 1;
                }
            } else {
                this.field667 = arg0.method506(255) == 1;
            }
        } else {
            this.field662 = ~arg0.method506(255) == -2;
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class37() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field660;
        int[] var3 = super.field1595.method603(true, arg1);
        if (arg0 != 25238) {
            field664 = -40;
        }
        if (super.field1595.field1538) {
            int[] var4 = this.method620(2652, this.field667 ? class101.field1850 - arg1 : arg1, 0);
            if (this.field662) {
                for (int var5 = 0; ~var5 > ~class129.field2287; ++var5) {
                    var3[var5] = var4[class53.field943 - var5];
                }
            } else {
                class18.method148(var4, 0, var3, 0, class129.field2287);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)Z")
    public static final boolean method257(byte arg0, int arg1) {
        ++field655;
        if (arg1 < 0) {
            return false;
        } else {
            int var2 = class108.field1990[arg1];
            if (arg0 != -95) {
                method257((byte) 91, -111);
            }
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            return ~var2 == -1005;
        }
    }
}
