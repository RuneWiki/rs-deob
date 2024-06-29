import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class126 extends class154 {

    @OriginalMember(owner = "client!jg", name = "ib", descriptor = "I")
    private int field2113 = 0;

    @OriginalMember(owner = "client!jg", name = "ob", descriptor = "I")
    private int field2119 = 2048;

    @OriginalMember(owner = "client!jg", name = "kb", descriptor = "I")
    private int field2115 = 10;

    @OriginalMember(owner = "client!jg", name = "gb", descriptor = "Leg;")
    public static class37 field2111 = class174.method1167("blaugr-Un:", -105);

    @OriginalMember(owner = "client!jg", name = "mb", descriptor = "Z")
    public static boolean field2117 = false;

    @OriginalMember(owner = "client!jg", name = "X", descriptor = "Lbf;")
    public static class202 field2102 = new class202(50);

    @OriginalMember(owner = "client!jg", name = "sb", descriptor = "Leg;")
    public static class37 field2123 = class174.method1167("Memory after cleanup=", -27);

    @OriginalMember(owner = "client!jg", name = "tb", descriptor = "S")
    public static short field2124 = 32767;

    @OriginalMember(owner = "client!jg", name = "ub", descriptor = "I")
    public static int field2125 = 0;

    @OriginalMember(owner = "client!jg", name = "Y", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!jg", name = "ab", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!jg", name = "cb", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!jg", name = "db", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!jg", name = "eb", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!jg", name = "fb", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!jg", name = "jb", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!jg", name = "lb", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!jg", name = "nb", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!jg", name = "qb", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!jg", name = "rb", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!jg", name = "vb", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!jg", name = "hb", descriptor = "Ljl;")
    public static class101 field2112;

    @OriginalMember(owner = "client!jg", name = "Z", descriptor = "[I")
    private int[] field2104;

    @OriginalMember(owner = "client!jg", name = "bb", descriptor = "[I")
    private int[] field2106;

    @OriginalMember(owner = "client!jg", name = "pb", descriptor = "[Lrk;")
    public static class14[] field2120;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "(I)V")
    public final void method144(int arg0) {
        if (arg0 != -9) {
            this.method903(-94);
        }
        ++field2121;
        this.method903(arg0 + 10);
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(B)V")
    public static final void method898(byte arg0) {
        if (arg0 != 83) {
            method902(-15, -126);
        }
        if (class61.field1000 != null) {
            class61.field1000.method936((byte) -34);
        }
        ++field2108;
        if (class36.field529 != null) {
            class36.field529.method936((byte) -34);
        }
    }

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "(B)Lbe;")
    public static final class17 method899(byte arg0) {
        ++field2116;
        int var1 = -102 % ((8 - arg0) / 58);
        return ~class36.field535 > ~class69.field1103.length ? class69.field1103[class36.field535++] : null;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
    public class126() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILva;)V")
    public static final void method900(int arg0, class187 arg1) {
        ++field2109;
        if (arg0 != 9759) {
            field2111 = null;
        }
        for (int var2 = 0; class218.field3752 > var2; ++var2) {
            int var3 = arg1.method1246(true);
            int var4 = arg1.method1244(false);
            if (~var4 == -65536) {
                var4 = -1;
            }
            if (class29.field417[var3] != null) {
                class29.field417[var3].field4613 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(II)[I")
    public final int[] method143(int arg0, int arg1) {
        if (arg1 != 1075962732) {
            return null;
        } else {
            ++field2103;
            int[] var3 = super.field2574.method206(arg0, 10232);
            if (super.field2574.field536) {
                int var4 = class62.field1029[arg0];
                if (this.field2113 != 0) {
                    for (int var5 = 0; var5 < class227.field3898; ++var5) {
                        int var6 = 0;
                        int var7 = class239.field4263[var5];
                        short var8 = 0;
                        int var9 = this.field2113;
                        if (var9 != 1) {
                            if (~var9 != -3) {
                                if (var9 == 3) {
                                    var6 = (-var4 + var7 >> 1) + 2048;
                                }
                            } else {
                                var6 = (-4096 - -var4 + var7 >> 1) + 2048;
                            }
                        } else {
                            var6 = var7;
                        }
                        for (int var10 = 0; var10 < this.field2115; ++var10) {
                            if (var6 >= this.field2106[var10] && ~var6 > ~this.field2106[var10 + 1]) {
                                if (~var6 > ~this.field2104[var10]) {
                                    var8 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var5] = var8;
                    }
                } else {
                    short var11 = 0;
                    for (int var12 = 0; this.field2115 > var12; ++var12) {
                        if (~this.field2106[var12] >= ~var4 && this.field2106[var12 + 1] > var4) {
                            if (~var4 > ~this.field2104[var12]) {
                                var11 = 4096;
                            }
                            break;
                        }
                    }
                    class54.method350(var3, 0, class227.field3898, var11);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljl;B)Z")
    public static final boolean method901(class101 arg0, byte arg1) {
        ++field2114;
        if (arg1 != -89) {
            return false;
        } else {
            return arg0.method658(class120.field2033, (byte) 48);
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(II)V")
    public static final void method902(int arg0, int arg1) {
        class111 var2 = class286.field5048[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; ++var3) {
            class111 var4 = class286.field5048[var3][arg0][arg1] = class286.field5048[var3 + 1][arg0][arg1];
            if (var4 != null) {
                --var4.field1867;
                for (int var5 = 0; var5 < var4.field1880; ++var5) {
                    class27 var6 = var4.field1858[var5];
                    if ((var6.field381 >> 29 & 3L) == 2L && var6.field402 == arg0 && var6.field397 == arg1) {
                        --var6.field383;
                    }
                }
            }
        }
        if (class286.field5048[0][arg0][arg1] == null) {
            class286.field5048[0][arg0][arg1] = new class111(0, arg0, arg1);
        }
        class286.field5048[0][arg0][arg1].field1869 = var2;
        class286.field5048[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "(I)V")
    private final void method903(int arg0) {
        this.field2106 = new int[this.field2115 + arg0];
        this.field2104 = new int[this.field2115 + 1];
        ++field2110;
        int var2 = 0;
        int var3 = 4096 / this.field2115;
        int var4 = this.field2119 * var3 >> 12;
        for (int var5 = 0; ~this.field2115 < ~var5; ++var5) {
            this.field2106[var5] = var2;
            this.field2104[var5] = var2 - -var4;
            var2 += var3;
        }
        this.field2106[this.field2115] = 4096;
        this.field2104[this.field2115] = this.field2104[0] + 4096;
    }

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "(I)V")
    public static void method904(int arg0) {
        field2120 = null;
        field2123 = null;
        field2102 = null;
        field2111 = null;
        if (arg0 != 0) {
            method899((byte) 25);
        }
        field2112 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field2113 = arg0.method1268(255);
                }
            } else {
                this.field2119 = arg0.method1244(false);
            }
        } else {
            this.field2115 = arg0.method1268(255);
        }
        ++field2107;
        if (arg1 != -14015) {
            field2126 = 47;
        }
    }
}
