import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class30 extends class135 {

    @OriginalMember(owner = "client!aa", name = "db", descriptor = "Z")
    private boolean field378 = true;

    @OriginalMember(owner = "client!aa", name = "cb", descriptor = "Z")
    private boolean field377 = true;

    @OriginalMember(owner = "client!aa", name = "X", descriptor = "Z")
    public static volatile boolean field372 = true;

    @OriginalMember(owner = "client!aa", name = "eb", descriptor = "Z")
    public static boolean field379 = false;

    @OriginalMember(owner = "client!aa", name = "Y", descriptor = "J")
    public static long field373 = 0L;

    @OriginalMember(owner = "client!aa", name = "fb", descriptor = "[[I")
    public static int[][] field380 = new int[104][104];

    @OriginalMember(owner = "client!aa", name = "gb", descriptor = "[Lej;")
    public static class252[] field381 = new class252[27];

    @OriginalMember(owner = "client!aa", name = "hb", descriptor = "Lqj;")
    public static class196 field382 = class80.method502("", -48);

    @OriginalMember(owner = "client!aa", name = "ab", descriptor = "[I")
    public static int[] field375 = new int[4096];

    @OriginalMember(owner = "client!aa", name = "jb", descriptor = "[I")
    public static int[] field384 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

    @OriginalMember(owner = "client!aa", name = "mb", descriptor = "Lec;")
    public static class178 field387 = null;

    @OriginalMember(owner = "client!aa", name = "V", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!aa", name = "W", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!aa", name = "Z", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!aa", name = "bb", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!aa", name = "ib", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!aa", name = "lb", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!aa", name = "nb", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!aa", name = "kb", descriptor = "[[B")
    public static byte[][] field385;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field1962 = ~arg0.method367(1) == -2;
                }
            } else {
                this.field378 = ~arg0.method367(1) == -2;
            }
        } else {
            this.field377 = arg0.method367(arg2 + 16232) == 1;
        }
        if (arg2 != -16231) {
            field381 = null;
        }
        ++field386;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILbk;ZI)[Lqh;")
    public static final class68[] method161(int arg0, class136 arg1, boolean arg2, int arg3) {
        ++field388;
        if (!arg2) {
            return null;
        } else {
            return !class84.method528(arg1, arg3, arg0, 0) ? null : class20.method106(123);
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(BI)V")
    public static final void method162(byte arg0, int arg1) {
        ++field371;
        if (arg1 == -1 && !class102.field1476) {
            class206.method1403((byte) 90);
        } else if (arg1 != -1 && (~class238.field4235 != ~arg1 || !class65.method414(false)) && class211.field3801 != 0 && !class102.field1476) {
            class153.method967(class62.field847, 2, (byte) 114, false, 0, arg1, class211.field3801);
        }
        class238.field4235 = arg1;
        if (arg0 != 14) {
            field372 = true;
        }
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(B)V")
    public static void method163(byte arg0) {
        field381 = null;
        field380 = null;
        field384 = null;
        field385 = null;
        field382 = null;
        field375 = null;
        field387 = null;
        if (arg0 != -107) {
            field375 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZ)[I")
    public final int[] method99(int arg0, boolean arg1) {
        ++field370;
        int[] var3 = super.field1954.method110(arg0, -98);
        if (arg1) {
            return null;
        } else {
            if (super.field1954.field244) {
                int[] var4 = this.method819(-95, 0, this.field378 ? -arg0 + class53.field667 : arg0);
                if (this.field377) {
                    for (int var5 = 0; ~class131.field1862 < ~var5; ++var5) {
                        var3[var5] = var4[class61.field816 - var5];
                    }
                } else {
                    class37.method188(var4, 0, var3, 0, class131.field1862);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
    public class30() {
        super(1, false);
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)[[I")
    public final int[][] method164(int arg0, int arg1) {
        if (arg0 != 260028743) {
            return null;
        } else {
            ++field376;
            int[][] var3 = super.field1947.method511(arg1, -1);
            if (super.field1947.field1180) {
                int[][] var4 = this.method818(2, !this.field378 ? arg1 : -arg1 + class53.field667, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var3[0];
                int[] var8 = var4[2];
                int[] var9 = var3[2];
                int[] var10 = var3[1];
                if (this.field377) {
                    for (int var11 = 0; class131.field1862 > var11; ++var11) {
                        var7[var11] = var5[-var11 + class61.field816];
                        var10[var11] = var6[class61.field816 - var11];
                        var9[var11] = var8[-var11 + class61.field816];
                    }
                } else {
                    for (int var12 = 0; var12 < class131.field1862; ++var12) {
                        var7[var12] = var5[var12];
                        var10[var12] = var6[var12];
                        var9[var12] = var8[var12];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(II)V")
    public static final void method165(int arg0, int arg1) {
        for (class206 var2 = (class206) class189.field3299.method1554(6539); var2 != null; var2 = (class206) class189.field3299.method1547(342)) {
            if (~(var2.field1850 >> 48 & 65535L) == ~((long) arg1)) {
                var2.method797((byte) 124);
            }
        }
        if (arg0 != -5064) {
            field382 = null;
        }
        ++field383;
    }
}
