import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class55 extends class105 {

    @OriginalMember(owner = "client!fg", name = "Z", descriptor = "I")
    private int field1052 = 4;

    @OriginalMember(owner = "client!fg", name = "fb", descriptor = "I")
    private int field1058 = 4;

    @OriginalMember(owner = "client!fg", name = "bb", descriptor = "Leh;")
    public static class47 field1054 = class195.method1282((byte) -4, ": ");

    @OriginalMember(owner = "client!fg", name = "eb", descriptor = "Leh;")
    private static class47 field1057 = class195.method1282((byte) -4, "Too many incorrect logins from your address)3");

    @OriginalMember(owner = "client!fg", name = "Y", descriptor = "Leh;")
    public static class47 field1051 = field1057;

    @OriginalMember(owner = "client!fg", name = "cb", descriptor = "Lpa;")
    public static class136 field1055 = new class136(50);

    @OriginalMember(owner = "client!fg", name = "kb", descriptor = "[I")
    public static int[] field1063 = new int[500];

    @OriginalMember(owner = "client!fg", name = "ab", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!fg", name = "db", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!fg", name = "gb", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!fg", name = "hb", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!fg", name = "ib", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!fg", name = "jb", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(B)Z")
    public static final boolean method476(byte arg0) {
        if (arg0 >= -24) {
            return true;
        } else {
            ++field1062;
            class27 var1 = class147.field2881;
            synchronized (class147.field2881) {
                if (class57.field1127 == class153.field3008) {
                    return false;
                } else {
                    class14.field302 = class182.field3493[class153.field3008];
                    class194.field3777 = class114.field2308[class153.field3008];
                    class153.field3008 = class153.field3008 + 1 & 127;
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(B)V")
    public static void method477(byte arg0) {
        field1054 = null;
        field1055 = null;
        field1057 = null;
        if (arg0 != -48) {
            method476((byte) -106);
        }
        field1051 = null;
        field1063 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)[I")
    public final int[] method92(int arg0, byte arg1) {
        ++field1059;
        if (arg1 < 78) {
            field1057 = null;
        }
        int[] var3 = super.field2192.method336(-104, arg0);
        if (super.field2192.field770) {
            int var4 = class120.field2422 / this.field1052;
            int var5 = class149.field2928 / this.field1058;
            int[] var7;
            if (~var4 < -1) {
                int var6 = arg0 % var4;
                var7 = this.method851(0, true, class120.field2422 * var6 / var4);
            } else {
                var7 = this.method851(0, true, 0);
            }
            for (int var8 = 0; class149.field2928 > var8; ++var8) {
                if (var5 <= 0) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var5;
                    var3[var8] = var7[class149.field2928 * var9 / var5];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(III)I")
    public static final int method478(int arg0, int arg1, int arg2) {
        ++field1061;
        if (arg2 >= -39) {
            return 44;
        } else {
            int var3 = arg1 * 57 + arg0;
            int var4 = var3 ^ var3 << 13;
            int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
            return 255 & var5 >> 19;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        ++field1053;
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field1052 = arg1.method604((byte) -128);
            }
        } else {
            this.field1058 = arg1.method604((byte) -128);
        }
        if (arg2 != -256) {
            this.method15(-21, true);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method15(int arg0, boolean arg1) {
        int[][] var3 = super.field2186.method10(arg0, (byte) 51);
        ++field1060;
        if (!arg1) {
            this.method15(-49, false);
        }
        if (super.field2186.field28) {
            int var4 = class149.field2928 / this.field1058;
            int var5 = class120.field2422 / this.field1052;
            int[][] var6;
            if (var5 <= 0) {
                var6 = this.method854(0, (byte) -114, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method854(0, (byte) 102, class120.field2422 * var7 / var5);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var3[0];
            int[] var11 = var6[2];
            int[] var12 = var3[2];
            int[] var13 = var3[1];
            for (int var14 = 0; ~var14 > ~class149.field2928; ++var14) {
                int var16;
                if (~var4 < -1) {
                    int var15 = var14 % var4;
                    var16 = class149.field2928 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var10[var14] = var8[var16];
                var13[var14] = var9[var16];
                var12[var14] = var11[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
    public class55() {
        super(1, false);
    }
}
