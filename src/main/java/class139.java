import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class139 {

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "Z")
    private boolean field1972 = true;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    private int field1980 = -1;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "[Lsg;")
    private class62[] field1969;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    private int field1971;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "I")
    private int field1984;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    private int field1982;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    private int field1974;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "Lsg;")
    private class62 field1968;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "[Lsg;")
    private class62[] field1973;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "Lcs;")
    public static class351 field1978 = new class351(72, -1);

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
    public static int field1986 = 0;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    private int field1970;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
    private int field1981;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "Laq;")
    private class385 field1977;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "[[B")
    public static byte[][] field1985;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
    public static final void method846(byte arg0) {
        if (class478.field6764 == 10) {
            class8.method94(28, 103);
        }
        field1975++;
        if (arg0 > 58 && class478.field6764 == 30) {
            class8.method94(25, -58);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
    public final void method847(int arg0) {
        field1987++;
        if (this.field1969 != null) {
            for (int var2 = 0; var2 < this.field1969.length; var2++) {
                this.field1969[var2].method458();
            }
        }
        this.field1977 = null;
        if (arg0 != -11) {
            this.field1984 = -18;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lkm;IB)Z")
    public final boolean method848(class487 arg0, int arg1, byte arg2) {
        if (this.field1980 != arg1) {
            this.field1980 = arg1;
            int var4 = class406.method2388(arg1, -85);
            if (arg1 < var4) {
                var4 = class166.method1019(-20703, arg1);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field1981 != var4) {
                this.field1981 = var4;
                this.field1977 = null;
            }
            if (this.field1969 != null) {
                this.field1970 = 0;
                int[] var5 = new int[this.field1969.length];
                for (int var6 = 0; var6 < this.field1969.length; var6++) {
                    class62 var7 = this.field1969[var6];
                    if (var7.method450(this.field1982, this.field1974, this.field1971, this.field1980)) {
                        var5[this.field1970] = var7.field957;
                        this.field1973[this.field1970++] = var7;
                    }
                }
                class335.method1996(var5, (byte) -42, this.field1973, 0, this.field1970 - 1);
            }
            this.field1972 = true;
        }
        field1979++;
        boolean var8 = false;
        if (this.field1972) {
            this.field1972 = false;
            for (int var9 = this.field1970 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field1973[var9].method451(arg0, this.field1968);
                var8 |= var10;
                this.field1972 |= !var10;
            }
        }
        int var11 = -105 / ((arg2 - 24) / 47);
        return var8;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(CBLjava/lang/String;)I")
    public static final int method849(char arg0, byte arg1, String arg2) {
        field1983++;
        int var3 = 0;
        int var4 = arg2.length();
        if (arg1 != 66) {
            field1985 = null;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg2.charAt(var5) == arg0) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ltq;)V")
    public static final void method850(class478 arg0) {
        for (int var1 = arg0.field6753; var1 <= arg0.field6751; var1++) {
            for (int var2 = arg0.field6747; var2 <= arg0.field6749; var2++) {
                class406 var3 = class455.field6293[arg0.field6766][var1][var2];
                if (var3 != null) {
                    class146 var4 = var3.field5613;
                    class146 var5 = null;
                    while (var4 != null) {
                        if (var4.field2062 == arg0) {
                            if (var5 == null) {
                                var3.field5613 = var4.field2066;
                            } else {
                                var5.field2066 = var4.field2066;
                            }
                            var4.method905(-501);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field2066;
                    }
                    var3.field5604 = 0;
                    for (class146 var6 = var3.field5613; var6 != null; var6 = var6.field2066) {
                        var3.field5604 = (byte) (var3.field5604 | var6.field2065);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(B)V")
    public static void method851(byte arg0) {
        int var1 = 110 % ((-arg0 - 9) / 56);
        field1985 = null;
        field1978 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIILkm;IIBI)V")
    public final void method852(int arg0, int arg1, int arg2, int arg3, int arg4, class487 arg5, int arg6, int arg7, byte arg8, int arg9) {
        int var11 = arg4 + arg6 & 0x3FFF;
        field1976++;
        if (this.field1984 == -1) {
            arg5.method1107(arg3, arg1, arg7, arg0, arg9, 0);
        } else {
            class192 var12 = class81.field1222.method1218(this.field1984, false);
            if (this.field1977 == null && class81.field1222.method1215(14455, this.field1984)) {
                int[] var13 = var12.field2734 ? class81.field1222.method1219(false, this.field1981, 0.7F, this.field1984, this.field1981, 63) : class81.field1222.method1217(this.field1981, 0.7F, this.field1984, this.field1981, (byte) -126, false);
                this.field1977 = arg5.method1073(var13, 0, this.field1981, this.field1981, this.field1981);
            }
            if (!var12.field2734) {
                arg5.method1107(arg3, arg1, arg7, arg0, arg9, 0);
            }
            if (this.field1977 != null) {
                int var14 = var12.field2734 ? 0 : 1;
                int var15 = arg0 * arg2 / -4096;
                int var16;
                for (var16 = arg0 * var11 / 4096 + (arg7 - arg0) / 2; var16 > arg0; var16 -= arg0) {
                }
                while (var16 < 0) {
                    var16 += arg0;
                }
                while (arg0 < var15) {
                    var15 -= arg0;
                }
                while (var15 < 0) {
                    var15 += arg0;
                }
                for (int var17 = var16 - arg0; var17 < arg7; var17 += arg0) {
                    for (int var18 = var15 - arg0; var18 < arg0; var18 += arg0) {
                        this.field1977.method384(var17 + arg3, arg1 + var18, arg0, arg0, 0, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field1970 - 1; var19 >= 0; var19--) {
            this.field1973[var19].method454(arg5, arg3, arg1, arg7, arg0, arg2, var11);
        }
        int var20 = -104 % ((arg8 + 44) / 37);
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(I[Lsg;IIII)V")
    public class139(int arg0, class62[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1969 = arg1;
        this.field1971 = arg5;
        this.field1984 = arg0;
        this.field1982 = arg3;
        this.field1974 = arg4;
        if (arg1 == null) {
            this.field1968 = null;
            this.field1973 = null;
        } else {
            this.field1973 = new class62[arg1.length];
            this.field1968 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}
