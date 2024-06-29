import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class90 extends class135 {

    @OriginalMember(owner = "client!vi", name = "X", descriptor = "I")
    private int field1309 = 4;

    @OriginalMember(owner = "client!vi", name = "bb", descriptor = "I")
    private int field1313 = 4;

    @OriginalMember(owner = "client!vi", name = "hb", descriptor = "[I")
    public static int[] field1319 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!vi", name = "jb", descriptor = "Lqj;")
    public static class196 field1321 = class80.method502("http:)4)4", -48);

    @OriginalMember(owner = "client!vi", name = "ib", descriptor = "Lba;")
    public static class93 field1320 = new class93(16);

    @OriginalMember(owner = "client!vi", name = "kb", descriptor = "Lqj;")
    public static class196 field1322 = class80.method502("Wordpack geladen)3", -48);

    @OriginalMember(owner = "client!vi", name = "lb", descriptor = "Lqj;")
    public static class196 field1323 = class80.method502("; version=1; path=)4; domain=", -48);

    @OriginalMember(owner = "client!vi", name = "mb", descriptor = "[I")
    public static int[] field1324 = new int[5];

    @OriginalMember(owner = "client!vi", name = "nb", descriptor = "I")
    public static int field1325 = 0;

    @OriginalMember(owner = "client!vi", name = "V", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!vi", name = "W", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!vi", name = "Y", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!vi", name = "Z", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!vi", name = "ab", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!vi", name = "cb", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!vi", name = "db", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!vi", name = "eb", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!vi", name = "fb", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!vi", name = "gb", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(IZ)Lgb;")
    public static final class44 method553(int arg0, boolean arg1) {
        ++field1307;
        class44 var2 = (class44) class54.field676.method575(0, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3;
            if (arg0 >= 32768) {
                var3 = class54.field670.method842(0, (byte) 37, 32767 & arg0);
            } else {
                var3 = class8.field77.method842(0, (byte) -94, arg0);
            }
            class44 var4 = new class44();
            if (var3 != null) {
                var4.method229(93, new class56(var3));
            }
            if (~arg0 <= -32769) {
                var4.method230((byte) -109);
            }
            if (!arg1) {
                return null;
            } else {
                class54.field676.method574((long) arg0, !arg1, var4);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
    public class90() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lhg;I)I")
    public static final int method554(class164 arg0, int arg1) {
        ++field1315;
        if (arg1 < 112) {
            field1320 = null;
        }
        class111 var2 = arg0.field2648;
        if (var2.field1591 != null) {
            var2 = var2.method659(65);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field1615;
        if (arg0.field2091 == arg0.field2063) {
            var3 = var2.field1630;
        } else if (arg0.field2065 == arg0.field2063) {
            var3 = var2.field1628;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZ)[I")
    public final int[] method99(int arg0, boolean arg1) {
        ++field1314;
        int[] var3 = super.field1954.method110(arg0, 25);
        if (arg1) {
            this.method164(38, -122);
        }
        if (super.field1954.field244) {
            int var4 = class131.field1862 / this.field1313;
            int var5 = class150.field2400 / this.field1309;
            int[] var6;
            if (~var5 >= -1) {
                var6 = this.method819(-93, 0, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method819(-95, 0, class150.field2400 * var7 / var5);
            }
            for (int var8 = 0; class131.field1862 > var8; ++var8) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class131.field1862 * var9 / var4];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZI)Z")
    public static final boolean method555(boolean arg0, int arg1) {
        if (!arg0) {
            return false;
        } else {
            ++field1308;
            if (~arg1 > -33) {
                return false;
            } else if (~arg1 == -128) {
                return false;
            } else {
                return ~arg1 > -130 || arg1 > 159;
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)[[I")
    public final int[][] method164(int arg0, int arg1) {
        ++field1312;
        if (arg0 != 260028743) {
            method558((byte) -84);
        }
        int[][] var3 = super.field1947.method511(arg1, arg0 + -260028744);
        if (super.field1947.field1180) {
            int var4 = class131.field1862 / this.field1313;
            int var5 = class150.field2400 / this.field1309;
            int[][] var7;
            if (~var5 < -1) {
                int var6 = arg1 % var5;
                var7 = this.method818(arg0 ^ 260028741, class150.field2400 * var6 / var5, 0);
            } else {
                var7 = this.method818(2, 0, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class131.field1862; ++var14) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class131.field1862 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILp;)V")
    public static final void method556(int arg0, class56 arg1) {
        if (arg0 <= 54) {
            field1323 = null;
        }
        ++field1311;
        if (class12.field134 != null) {
            try {
                class12.field134.method1704((byte) 110, 0L);
                class12.field134.method1699(arg1.field693, true, 24, arg1.field699);
            } catch (Exception var2) {
            }
        }
        arg1.field699 += 24;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field1309 = arg0.method367(1);
            }
        } else {
            this.field1313 = arg0.method367(arg2 + 16232);
        }
        if (arg2 != -16231) {
            method553(-3, true);
        }
        ++field1318;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I[Lqj;)[Lqj;")
    public static final class196[] method557(int arg0, class196[] arg1) {
        ++field1310;
        class196[] var2 = new class196[5];
        if (arg0 <= 102) {
            field1324 = null;
        }
        for (int var3 = 0; var3 < 5; ++var3) {
            var2[var3] = class93.method572(-54, new class196[] { class163.method1029(var3, false), class194.field3412 });
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class93.method572(-91, new class196[] { var2[var3], arg1[var3] });
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "(B)V")
    public static void method558(byte arg0) {
        field1320 = null;
        field1321 = null;
        field1324 = null;
        field1319 = null;
        field1323 = null;
        int var1 = -18 / ((50 - arg0) / 44);
        field1322 = null;
    }
}
