import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class50 extends class179 {

    @OriginalMember(owner = "client!kc", name = "Q", descriptor = "[I")
    public static int[] field901 = new int[256];

    @OriginalMember(owner = "client!kc", name = "X", descriptor = "I")
    public static int field908 = 0;

    @OriginalMember(owner = "client!kc", name = "Z", descriptor = "Lke;")
    private static class256 field910;

    @OriginalMember(owner = "client!kc", name = "db", descriptor = "Lke;")
    private static class256 field914;

    @OriginalMember(owner = "client!kc", name = "cb", descriptor = "Lke;")
    public static class256 field913;

    @OriginalMember(owner = "client!kc", name = "fb", descriptor = "Lke;")
    private static class256 field916;

    @OriginalMember(owner = "client!kc", name = "eb", descriptor = "Lke;")
    private static class256 field915;

    @OriginalMember(owner = "client!kc", name = "nb", descriptor = "Z")
    public static boolean field924;

    @OriginalMember(owner = "client!kc", name = "lb", descriptor = "Lke;")
    private static class256 field922;

    @OriginalMember(owner = "client!kc", name = "gb", descriptor = "Lke;")
    private static class256 field917;

    @OriginalMember(owner = "client!kc", name = "ob", descriptor = "[I")
    public static int[] field925;

    @OriginalMember(owner = "client!kc", name = "hb", descriptor = "Lke;")
    private static class256 field918;

    @OriginalMember(owner = "client!kc", name = "mb", descriptor = "Lke;")
    private static class256 field923;

    @OriginalMember(owner = "client!kc", name = "jb", descriptor = "Lke;")
    private static class256 field920;

    @OriginalMember(owner = "client!kc", name = "rb", descriptor = "Lke;")
    private static class256 field928;

    @OriginalMember(owner = "client!kc", name = "qb", descriptor = "Lke;")
    private static class256 field927;

    @OriginalMember(owner = "client!kc", name = "ib", descriptor = "Lke;")
    private static class256 field919;

    @OriginalMember(owner = "client!kc", name = "bb", descriptor = "[Lke;")
    public static class256[] field912;

    @OriginalMember(owner = "client!kc", name = "R", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!kc", name = "S", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!kc", name = "T", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!kc", name = "U", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!kc", name = "V", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!kc", name = "W", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!kc", name = "Y", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!kc", name = "pb", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!kc", name = "ab", descriptor = "Lrd;")
    public static class135 field911;

    @OriginalMember(owner = "client!kc", name = "kb", descriptor = "[[Lla;")
    public static class188[][] field921;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)[[I", line = 11)
    public final int[][] method55(int arg0, int arg1) {
        field905++;
        if (arg0 != 75) {
            method404(4);
        }
        int[][] var3 = this.field3169.method463(arg1, 1);
        if (this.field3169.field1080) {
            int[] var4 = this.method1312(2, arg1, (byte) 122);
            int[][] var5 = this.method1314(arg1, 158, 0);
            int[][] var6 = this.method1314(arg1, 158, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var6[0];
            int[] var13 = var5[2];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class161.field2858; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var13[var16];
                } else if (var17 == 0) {
                    var7[var16] = var12[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var7[var16] = var10[var16] * var17 + (var12[var16] * var18) >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var13[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V", line = 89)
    public class50() {
        super(3, false);
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(II)I", line = 93)
    public static final int method402(int arg0, int arg1) {
        field909++;
        if (arg1 < 0) {
            return 0;
        }
        class185 var2 = (class185) class254.field4355.method1744((byte) 127, (long) arg1);
        if (var2 == null) {
            return class146.method1064(arg1, 3684).field5112;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field3254.length; var4++) {
            if (var2.field3254[var4] == -1) {
                var3++;
            }
        }
        int var5 = var3 + (class146.method1064(arg1, 3684).field5112 - var2.field3254.length);
        if (arg0 >= -114) {
            return -39;
        } else {
            return var5;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)[I", line = 129)
    public final int[] method41(int arg0, int arg1) {
        if (arg1 != -31598) {
            return (int[]) null;
        }
        field903++;
        int[] var3 = this.field3157.method1258(-99, arg0);
        if (this.field3157.field3081) {
            int[] var4 = this.method1312(0, arg0, (byte) 123);
            int[] var5 = this.method1312(1, arg0, (byte) -120);
            int[] var6 = this.method1312(2, arg0, (byte) -72);
            for (int var7 = 0; var7 < class161.field2858; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(II)I", line = 183)
    public static final int method403(int arg0, int arg1) {
        field902++;
        return arg0 >= -46 ? 24 : arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "(I)V", line = 195)
    public static void method404(int arg0) {
        field928 = null;
        field917 = null;
        field921 = (class188[][]) null;
        if (arg0 != 0) {
            method404(-26);
        }
        field920 = null;
        field916 = null;
        field914 = null;
        field919 = null;
        field915 = null;
        field911 = null;
        field912 = null;
        field927 = null;
        field925 = null;
        field922 = null;
        field918 = null;
        field901 = null;
        field910 = null;
        field913 = null;
        field923 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field901[var0] = var1;
        }
        field910 = class316.method2202("Feb", 27626);
        field914 = class316.method2202("Nov", 27626);
        field913 = class316.method2202(" zuerst von Ihrer Freunde)2Liste(Q", 27626);
        field916 = class316.method2202("Oct", 27626);
        field915 = class316.method2202("Sep", 27626);
        field924 = false;
        field922 = class316.method2202("Mar", 27626);
        field917 = class316.method2202("Jan", 27626);
        field925 = new int[128];
        field918 = class316.method2202("Jun", 27626);
        field923 = class316.method2202("Apr", 27626);
        field920 = class316.method2202("Jul", 27626);
        field928 = class316.method2202("Aug", 27626);
        field927 = class316.method2202("Dec", 27626);
        field919 = class316.method2202("May", 27626);
        field912 = new class256[] { field917, field910, field922, field923, field919, field918, field920, field928, field915, field916, field914, field927 };
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILra;I)V", line = 230)
    public final void method54(int arg0, class41 arg1, int arg2) {
        field907++;
        if (arg2 == 0) {
            this.field3153 = arg1.method357(false) == 1;
        }
        if (arg0 < 108) {
            field923 = (class256) null;
        }
    }
}
