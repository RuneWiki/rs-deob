import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class102 {

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "[I")
    private int[] field1877;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "[I")
    private int[] field1872;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "Lcf;")
    private class27 field1875;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "Lcf;")
    private class27 field1871;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "[Lcf;")
    private class27[] field1878;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field1880 = -1;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Lnb;")
    public static class120 field1879 = new class120(64);

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "Lkb;")
    private static class93 field1883 = class76.method390("yellow:", 0);

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public static int field1887 = 1;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "Lkb;")
    public static class93 field1884 = field1883;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "Lkb;")
    public static class93 field1886 = field1883;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "Lob;")
    public static class129 field1881;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "Lvc;")
    public static class193 field1885;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "Lhh;")
    public static class73 field1882;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "Z")
    public static boolean field1888;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
    public static void method565(boolean arg0) {
        field1886 = null;
        field1882 = null;
        field1881 = null;
        field1883 = null;
        field1885 = null;
        field1884 = null;
        if (!arg0) {
            field1883 = null;
        }
        field1879 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjg;Lrh;)Z")
    public final boolean method566(int arg0, class89 arg1, class162 arg2) {
        field1873++;
        if (arg0 >= -101) {
            field1886 = null;
        }
        for (int var4 = 0; var4 < this.field1877.length; var4++) {
            if (!arg1.method458((byte) 11, this.field1877[var4])) {
                return false;
            }
        }
        for (int var5 = 0; var5 < this.field1872.length; var5++) {
            if (!arg2.method1106(92, this.field1872[var5])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lhf;")
    public static final class71 method567(Throwable arg0, String arg1) {
        field1870++;
        class71 var2;
        if (arg0 instanceof class71) {
            var2 = (class71) arg0;
            var2.field1309 = var2.field1309 + ' ' + arg1;
        } else {
            var2 = new class71(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([Lh;II)V")
    public static final void method568(class65[] arg0, int arg1, int arg2) {
        for (int var3 = arg2; var3 < arg0.length; var3++) {
            class65 var4 = arg0[var3];
            if (var4 != null && var4.field1143 == arg1 && (!var4.field1152 || !class131.method766(var4, -30568))) {
                if (var4.field1076 == 0) {
                    if (!var4.field1152 && class131.method766(var4, -30568) && class80.field1418 != var4) {
                        continue;
                    }
                    method568(arg0, var4.field1058, arg2);
                    if (var4.field1121 != null) {
                        method568(var4.field1121, var4.field1058, 0);
                    }
                    class78 var5 = (class78) class147.field2834.method616((long) var4.field1058, -1);
                    if (var5 != null) {
                        class189.method1225(var5.field1406, (byte) -96);
                    }
                }
                if (var4.field1076 == 6) {
                    if (var4.field1173 != -1 || var4.field1171 != -1) {
                        boolean var6 = class137.method861(var4, 17108);
                        int var7;
                        if (var6) {
                            var7 = var4.field1171;
                        } else {
                            var7 = var4.field1173;
                        }
                        if (var7 != -1) {
                            class37 var8 = class39.method213(-10639, var7);
                            var4.field1151 += class24.field363;
                            while (var8.field615[var4.field1043] < var4.field1151) {
                                var4.field1151 -= var8.field615[var4.field1043];
                                var4.field1043++;
                                if (var4.field1043 >= var8.field616.length) {
                                    var4.field1043 -= var8.field609;
                                    if (var4.field1043 < 0 || var4.field1043 >= var8.field616.length) {
                                        var4.field1043 = 0;
                                    }
                                }
                                class160.method1095(0, var4);
                            }
                        }
                    }
                    if (var4.field1081 != 0 && !var4.field1152) {
                        int var9 = var4.field1081 >> 16;
                        int var10 = var4.field1081 << 16 >> 16;
                        int var11 = class24.field363 * var9;
                        var4.field1111 = var4.field1111 + var11 & 0x7FF;
                        int var12 = class24.field363 * var10;
                        var4.field1157 = var4.field1157 + var12 & 0x7FF;
                        class160.method1095(arg2, var4);
                    }
                }
            }
        }
        field1869++;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljg;ILrh;ZIID)[I")
    public final int[] method569(class89 arg0, int arg1, class162 arg2, boolean arg3, int arg4, int arg5, double arg6) {
        int[] var9 = new int[arg1 * arg4];
        class159.field3208 = arg0;
        class154.field3032 = arg2;
        field1874++;
        class176.method1162(28855, arg4, arg1);
        for (int var10 = arg5; var10 < this.field1878.length; var10++) {
            this.field1878[var10].method149(arg1, arg4, false);
        }
        int var11 = 0;
        int var12;
        int var13;
        byte var14;
        if (arg3) {
            var12 = -1;
            var13 = arg4 - 1;
            var14 = -1;
        } else {
            var12 = arg4;
            var14 = 1;
            var13 = 0;
        }
        for (int var15 = 0; var15 < arg1; var15++) {
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field1875.field435) {
                int[] var21 = this.field1875.method55(var15, false);
                var20 = var21;
                var19 = var21;
                var18 = var21;
            } else {
                int[][] var17 = this.field1875.method19(116, var15);
                var18 = var17[0];
                var19 = var17[1];
                var20 = var17[2];
            }
            for (int var22 = var13; var22 != var12; var22 += var14) {
                double var23 = Math.pow((double) var18[var22] / 4096.0D, arg6);
                int var25 = (int) (var23 * 256.0D);
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                double var26 = Math.pow((double) var19[var22] / 4096.0D, arg6);
                int var28 = (int) (var26 * 256.0D);
                if (var28 > 255) {
                    var28 = 255;
                }
                double var29 = Math.pow((double) var20[var22] / 4096.0D, arg6);
                if (var28 < 0) {
                    var28 = 0;
                }
                int var31 = (int) (var29 * 256.0D);
                if (var31 > 255) {
                    var31 = 255;
                }
                if (var31 < 0) {
                    var31 = 0;
                }
                var9[var11++] = (var25 << 16) + (var28 << 8) + var31;
            }
        }
        for (int var16 = 0; var16 < this.field1878.length; var16++) {
            this.field1878[var16].method146(-868);
        }
        return var9;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)V")
    public static final void method570(boolean arg0, int arg1) {
        field1876++;
        if (class62.field986 == null) {
            return;
        }
        try {
            if (arg1 == 255) {
                class158 var2 = new class158(4);
                var2.method1069(arg0 ? 2 : 3, (byte) -26);
                var2.method1050(false, 0);
                class62.field986.method6(0, var2.field3162, 4, (byte) 107);
            }
        } catch (IOException var4) {
            try {
                class62.field986.method10(false);
            } catch (Exception var3) {
            }
            class2.field38++;
            class62.field986 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
    public class102() {
        this.field1877 = new int[0];
        this.field1872 = new int[0];
        this.field1875 = new class28();
        this.field1871 = new class28();
        this.field1878 = new class27[] { this.field1875, this.field1871 };
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lrd;)V")
    public class102(class158 arg0) {
        int var2 = arg0.method1054(128);
        int[][] var3 = new int[var2][];
        class113 var4 = new class113(64);
        class113 var5 = new class113(64);
        class113 var6 = new class113(64);
        this.field1878 = new class27[var2];
        for (int var7 = 0; var7 < var2; var7++) {
            class27 var21 = class128.method730(arg0, true);
            int var22 = var21.method150(false);
            int var23 = var21.method153((byte) -84);
            if (var22 >= 0 && var22 >= 0 && var5.method616((long) var22, -1) == null) {
                var5.method617(0, (long) var22, new class197(var22));
            }
            if (var23 >= 0 && var23 >= 0 && var6.method616((long) var23, -1) == null) {
                var6.method617(0, (long) var23, new class197(var23));
            }
            int var26 = var21.field431.length;
            var3[var7] = new int[var26];
            for (int var27 = 0; var27 < var26; var27++) {
                var3[var7][var27] = arg0.method1054(128);
            }
            var4.method617(0, (long) var21.field444, var21);
            this.field1878[var7] = var21;
        }
        for (int var8 = 0; var8 < var2; var8++) {
            class27 var17 = this.field1878[var8];
            int var18 = var17.field431.length;
            for (int var19 = 0; var19 < var18; var19++) {
                class27 var20 = (class27) var4.method616((long) var3[var8][var19], -1);
                var17.field431[var19] = var20;
            }
            var3[var8] = null;
        }
        this.field1875 = (class27) var4.method616((long) arg0.method1054(128), -1);
        Object var9 = null;
        this.field1871 = (class27) var4.method616((long) arg0.method1054(128), -1);
        this.field1877 = new int[var5.method613(0)];
        this.field1872 = new int[var6.method613(0)];
        Object var10 = null;
        class44[] var11 = new class44[var5.method613(0)];
        class44[] var12 = new class44[var6.method613(0)];
        var5.method622(var11, 0);
        Object var13 = null;
        var6.method622(var12, 0);
        for (int var14 = 0; var14 < var11.length; var14++) {
            this.field1877[var14] = ((class197) var11[var14]).field3840;
        }
        for (int var15 = 0; var15 < var12.length; var15++) {
            this.field1872[var15] = ((class197) var12[var15]).field3840;
        }
        Object var16 = null;
    }
}
