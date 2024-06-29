import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class166 extends class397 {

    @OriginalMember(owner = "client!cl", name = "N", descriptor = "I")
    private int field2165 = -1;

    @OriginalMember(owner = "client!cl", name = "P", descriptor = "Liu;")
    public static class390 field2167 = new class390(109, 14);

    @OriginalMember(owner = "client!cl", name = "Z", descriptor = "I")
    public static int field2177 = 0;

    @OriginalMember(owner = "client!cl", name = "W", descriptor = "F")
    public static float field2174;

    @OriginalMember(owner = "client!cl", name = "L", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!cl", name = "M", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!cl", name = "Q", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!cl", name = "R", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!cl", name = "S", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!cl", name = "T", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!cl", name = "U", descriptor = "I")
    private int field2172;

    @OriginalMember(owner = "client!cl", name = "V", descriptor = "I")
    private int field2173;

    @OriginalMember(owner = "client!cl", name = "X", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!cl", name = "Y", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!cl", name = "ab", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!cl", name = "bb", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!cl", name = "O", descriptor = "[I")
    private int[] field2166;

    static {
        new class194("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILjava/lang/String;)V", line = 3)
    public static final void method1045(int arg0, String arg1) {
        ++field2168;
        if (arg0 >= -29) {
            method1047(-112, true, 32, true, -49);
        }
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(Z)V", line = 17)
    public final void method485(boolean arg0) {
        ++field2163;
        super.method485(arg0);
        if (!arg0) {
            this.field2166 = null;
        }
        this.field2166 = null;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V", line = 57)
    public class166() {
        super(0, false);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IBLae;)V", line = 35)
    public final void method27(int arg0, byte arg1, class156 arg2) {
        if (arg1 != 80) {
            field2167 = null;
        }
        ++field2164;
        if (~arg0 == -1) {
            this.field2165 = arg2.method993((byte) -117);
        }
    }

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)V", line = 48)
    public static void method1046(int arg0) {
        field2167 = null;
        int var1 = 106 % ((arg0 - 50) / 58);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZIZI)I", line = 62)
    public static final int method1047(int arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        ++field2179;
        class220 var5 = class224.method1384(arg3, true, arg4);
        if (var5 == null) {
            return 0;
        } else {
            int var6 = 0;
            if (arg0 != -7045) {
                field2177 = 122;
            }
            for (int var7 = 0; ~var7 > ~var5.field3097.length; ++var7) {
                if (~var5.field3097[var7] <= -1 && class405.field5947.field2619 > var5.field3097[var7]) {
                    class361 var8 = class405.field5947.method1162(var5.field3097[var7], 0);
                    int var9 = var8.method2195((byte) 102, arg2, class228.field3209.method1536((byte) -119, arg2).field7000);
                    if (arg1) {
                        var6 += var5.field3101[var7] * var9;
                    } else {
                        var6 += var9;
                    }
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(II)Z", line = 103)
    public static final boolean method1048(int arg0, int arg1) {
        if (arg0 != 12474) {
            method1045(-12, (String) null);
        }
        ++field2171;
        if (~arg1 != -7 && ~arg1 != -16 && ~arg1 != -12 && ~arg1 != -17 && arg1 != 25) {
            return arg1 == 45 || ~arg1 == -1005;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)I", line = 122)
    public final int method1049(int arg0) {
        ++field2176;
        if (arg0 != 902) {
            method1047(-41, false, -42, true, -118);
        }
        return this.field2165;
    }

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(III)V", line = 134)
    public final void method1050(int arg0, int arg1, int arg2) {
        super.method1050(arg0, arg1, arg2);
        ++field2178;
        if (arg0 == -30579) {
            if (~this.field2165 <= -1 && class163.field2132 != null) {
                int var4 = class163.field2132.method432(this.field2165, true).field1524 ? 64 : 128;
                this.field2166 = class163.field2132.method429(this.field2165, var4, false, 1.0F, -2472, var4);
                this.field2172 = var4;
                this.field2173 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)[[I", line = 157)
    public final int[][] method486(byte arg0, int arg1) {
        ++field2170;
        int[][] var3 = super.field5848.method1692(arg1, 112);
        if (arg0 < 81) {
            field2174 = 1.8667867F;
        }
        if (super.field5848.field3939) {
            int var4 = (~class508.field7746 != ~this.field2172 ? this.field2172 * arg1 / class508.field7746 : arg1) * this.field2173;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class164.field2152 != this.field2173) {
                for (int var8 = 0; class164.field2152 > var8; ++var8) {
                    int var9 = this.field2173 * var8 / class164.field2152;
                    int var10 = this.field2166[var4 + var9];
                    var7[var8] = class500.method3013(var10 << 4, 4080);
                    var6[var8] = class500.method3013(65280, var10) >> 4;
                    var5[var8] = class500.method3013(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; ~var11 > ~class164.field2152; ++var11) {
                    int var12 = this.field2166[var4++];
                    var7[var11] = class500.method3013(var12 << 4, 4080);
                    var6[var11] = class500.method3013(4080, var12 >> 4);
                    var5[var11] = class500.method3013(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IBIII)V", line = 226)
    public static final void method1051(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var5 = 120 % ((-59 - arg1) / 52);
        ++field2175;
        class338 var6 = class380.method2294((byte) 80, arg0, 10);
        var6.method2052((byte) -124);
        var6.field4924 = arg2;
        var6.field4926 = arg4;
        var6.field4930 = arg3;
    }
}
