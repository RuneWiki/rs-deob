import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class109 extends class51 {

    @OriginalMember(owner = "client!m", name = "eb", descriptor = "I")
    private int field2100 = -1;

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "Led;")
    public static class43 field2095 = class191.method1219(")2", false);

    @OriginalMember(owner = "client!m", name = "jb", descriptor = "Ln;")
    public static class118 field2105 = new class118();

    @OriginalMember(owner = "client!m", name = "lb", descriptor = "Led;")
    public static class43 field2107 = class191.method1219("Ung-Ultiger Benutzername", false);

    @OriginalMember(owner = "client!m", name = "mb", descriptor = "[I")
    public static int[] field2108 = new int[5];

    @OriginalMember(owner = "client!m", name = "pb", descriptor = "Led;")
    public static class43 field2111 = class191.method1219(" <col=ffff00>", false);

    @OriginalMember(owner = "client!m", name = "sb", descriptor = "I")
    public static int field2114 = 0;

    @OriginalMember(owner = "client!m", name = "ab", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!m", name = "bb", descriptor = "I")
    private int field2097;

    @OriginalMember(owner = "client!m", name = "cb", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!m", name = "db", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!m", name = "fb", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!m", name = "hb", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!m", name = "ib", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!m", name = "nb", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!m", name = "ob", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!m", name = "qb", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!m", name = "rb", descriptor = "I")
    private int field2113;

    @OriginalMember(owner = "client!m", name = "kb", descriptor = "Lga;")
    public static class58 field2106;

    @OriginalMember(owner = "client!m", name = "gb", descriptor = "[I")
    private int[] field2102;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method674(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2101;
        if (arg3 >= 1 && arg1 >= 1 && arg3 <= 102 && ~arg1 >= -103) {
            if (class9.field163 && ~class93.field1839 != ~arg2) {
                return;
            }
            boolean var8 = true;
            boolean var9 = false;
            int var10 = 0;
            boolean var11 = false;
            if (arg4 == 0) {
                var10 = class137.field2842.method1113(arg2, arg3, arg1);
            }
            if (~arg4 == -2) {
                var10 = class137.field2842.method1127(arg2, arg3, arg1);
            }
            if (arg4 == 2) {
                var10 = class137.field2842.method1137(arg2, arg3, arg1);
            }
            if (arg4 == 3) {
                var10 = class137.field2842.method1136(arg2, arg3, arg1);
            }
            if (~var10 != -1) {
                int var12 = class137.field2842.method1125(arg2, arg3, arg1, var10);
                int var13 = var12 & 31;
                int var14 = 3 & var12 >> 6;
                int var15 = var10 >> 14 & 32767;
                if (~arg4 == -1) {
                    class137.field2842.method1128(arg2, arg3, arg1);
                    class23 var16 = class92.method592(var15, (byte) 100);
                    if (~var16.field406 != -1) {
                        class147.field3011[arg2].method967(-118, arg3, arg1, var14, var13, var16.field396);
                    }
                }
                if (~arg4 == -2) {
                    class137.field2842.method1112(arg2, arg3, arg1);
                }
                if (arg4 == 2) {
                    class137.field2842.method1134(arg2, arg3, arg1);
                    class23 var17 = class92.method592(var15, (byte) 107);
                    if (~(arg3 - -var17.field423) < -104 || ~(var17.field423 + arg1) < -104 || ~(var17.field424 + arg3) < -104 || var17.field424 + arg1 > 103) {
                        return;
                    }
                    if (~var17.field406 != -1) {
                        class147.field3011[arg2].method976(var17.field424, arg1, var14, var17.field423, arg3, (byte) -26, var17.field396);
                    }
                }
                if (arg4 == 3) {
                    class137.field2842.method1111(arg2, arg3, arg1);
                    class23 var18 = class92.method592(var15, (byte) 118);
                    if (~var18.field406 == -2) {
                        class147.field3011[arg2].method974(-26960, arg3, arg1);
                    }
                }
            }
            if (~arg7 <= -1) {
                int var19 = arg2;
                if (~arg2 > -4 && ~(class15.field232[1][arg3][arg1] & 2) == -3) {
                    var19 = arg2 + 1;
                }
                class171.method1084(arg5, arg7, arg1, arg3, false, arg6, var19, class147.field3011[arg2], arg2, class137.field2842);
            }
        }
        if (arg0 < 120) {
            field2105 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(I)V")
    public static void method675(int arg0) {
        field2108 = null;
        field2095 = null;
        field2105 = null;
        field2106 = null;
        if (arg0 < 63) {
            field2106 = null;
        }
        field2111 = null;
        field2107 = null;
    }

    @OriginalMember(owner = "client!m", name = "f", descriptor = "(I)Z")
    private final boolean method676(int arg0) {
        ++field2096;
        if (this.field2102 != null) {
            return true;
        } else if (arg0 != 64) {
            return true;
        } else if (~this.field2100 <= -1) {
            int var2 = !class150.field3034.method20((byte) -32, this.field2100) ? 128 : 64;
            this.field2102 = class150.field3034.method16((byte) -92, this.field2100);
            this.field2113 = var2;
            this.field2097 = var2;
            return this.field2102 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZIZIZ)Lig;")
    public static final class80 method677(boolean arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        ++field2103;
        if (arg1 > -2) {
            field2114 = 4;
        }
        class48 var5 = null;
        if (class133.field2766 != null) {
            var5 = new class48(arg3, class133.field2766, class103.field1965[arg3], 1000000);
        }
        return new class80(var5, class96.field1869, arg3, arg2, arg0, arg4);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        ++field2110;
        if (arg1 == arg2) {
            this.field2100 = arg0.method555(-1113627096);
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
    public class109() {
        super(0, false);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)[[I")
    public final int[][] method99(int arg0, byte arg1) {
        ++field2099;
        if (arg1 != -94) {
            return null;
        } else {
            int[][] var3 = super.field1027.method1087(arg0, -2);
            if (super.field1027.field3428 && this.method676(64)) {
                int var4 = this.field2097 * (class112.field2144 != this.field2113 ? this.field2113 * arg0 / class112.field2144 : arg0);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                if (~class122.field2442 != ~this.field2097) {
                    for (int var8 = 0; var8 < class122.field2442; ++var8) {
                        int var9 = this.field2097 * var8 / class122.field2442;
                        int var10 = this.field2102[var4 + var9];
                        var7[var8] = class7.method38(4080, var10 << 4);
                        var6[var8] = class7.method38(var10 >> 4, 4080);
                        var5[var8] = class7.method38(var10, 16711680) >> 12;
                    }
                } else {
                    for (int var11 = 0; ~class122.field2442 < ~var11; ++var11) {
                        int var12 = this.field2102[var4++];
                        var7[var11] = class7.method38(4080, var12 << 4);
                        var6[var11] = class7.method38(var12 >> 4, 4080);
                        var5[var11] = class7.method38(16711680, var12) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BLjg;)Led;")
    public static final class43 method678(byte arg0, class89 arg1) {
        ++field2112;
        int var2 = -83 / ((-69 - arg0) / 57);
        return class133.method857(arg1, 105, 32767);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)I")
    public final int method309(byte arg0) {
        ++field2104;
        return arg0 != 94 ? -7 : this.field2100;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lga;II)Lbh;")
    public static final class19 method679(class58 arg0, int arg1, int arg2) {
        ++field2098;
        int var3 = 27 / ((arg1 - -38) / 36);
        byte[] var4 = arg0.method364(26552, arg2);
        return var4 == null ? null : new class19(var4);
    }
}
