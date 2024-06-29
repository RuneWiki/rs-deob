import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class74 {

    @OriginalMember(owner = "client!th", name = "f", descriptor = "[[I")
    private int[][] field1064;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    private int field1062;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    private int field1061;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "[I")
    public static int[] field1059 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!th", name = "i", descriptor = "[B")
    public static byte[] field1067 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!th", name = "k", descriptor = "Lch;")
    public static class151 field1069 = new class151("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "Ltq;")
    public static class248 field1071;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "Lnl;")
    public static class435 field1070;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)I", line = 3)
    public static final int method658(int arg0, int arg1) {
        field1066++;
        return arg0 == 0 ? arg1 & 0xFF : -35;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(II)I", line = 15)
    public final int method659(int arg0, int arg1) {
        field1068++;
        if (this.field1064 != null) {
            arg1 = (int) ((long) this.field1062 * (long) arg1 / (long) this.field1061);
        }
        int var3 = 95 % ((37 - arg0) / 58);
        return arg1;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "([BB)[B", line = 29)
    public final byte[] method660(byte[] arg0, byte arg1) {
        if (this.field1064 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field1062 / (long) this.field1061) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field1064[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field1062 + var6;
                int var14 = var13 / this.field1061;
                var5 += var14;
                var6 = var13 - this.field1061 * var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 <= 127) {
                    arg0[var8] = (byte) var9;
                } else {
                    arg0[var8] = 127;
                }
            }
        }
        field1060++;
        return arg1 >= -120 ? null : arg0;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V", line = 104)
    public static void method661(byte arg0) {
        field1059 = null;
        if (arg0 >= -32) {
            field1069 = null;
        }
        field1067 = null;
        field1070 = null;
        field1071 = null;
        field1069 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZI)I", line = 119)
    public final int method662(boolean arg0, int arg1) {
        if (!arg0) {
            this.method662(false, 115);
        }
        if (this.field1064 != null) {
            arg1 = (int) ((long) this.field1062 * (long) arg1 / (long) this.field1061) + 6;
        }
        field1065++;
        return arg1;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(II)V", line = 134)
    public class74(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class310.method1980(arg1, arg0, 29297);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field1064 = new int[var5][14];
            this.field1062 = var4;
            this.field1061 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field1064[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var10 < var11) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(JB)V", line = 197)
    public static final void method663(long arg0, byte arg1) {
        field1063++;
        if (class385.field5285 != null) {
            if (class390.field5393 == 1 || class390.field5393 == 5) {
                class319.method2029(arg0, -1);
            } else if (class390.field5393 == 4) {
                class193.method1344(-74, arg0);
            }
        }
        class128.method961(16711680, class374.field5152, (long) class364.field5010);
        if (class238.field3475 != -1) {
            class189.method1327(class238.field3475, true);
        }
        for (int var3 = 0; var3 < class173.field2636; var3++) {
            if (class424.field5879[var3]) {
                class184.field2783[var3] = true;
            }
            class432.field6115[var3] = class424.field5879[var3];
            class424.field5879[var3] = false;
        }
        class165.field2403 = class364.field5010;
        if (class374.field5152.method452()) {
            class266.field3834 = true;
        }
        if (class238.field3475 != -1) {
            class173.field2636 = 0;
            class266.method1793(105);
        }
        class374.field5152.method360();
        class412.method2477(class374.field5152, true);
        int var4 = class164.method1209(13);
        int var5 = 91 / ((61 - arg1) / 32);
        if (var4 == -1) {
            var4 = class193.field2875;
        }
        class486.method2863(-1, var4);
        class255.method1727(class262.field3781.field4537, class262.field3781.field4530, false, class262.field3781.field4531, class385.field5283);
        class385.field5283 = 0;
    }
}
