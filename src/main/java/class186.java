import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class186 {

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public static int field3028 = 100;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field3027 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "[I")
    public static int[] field3029 = new int[100];

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "Lab;")
    public static class279 field3022 = new class279(4);

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "J")
    public static long field3023;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "Lbm;")
    public static class307 field3026;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1187(int arg0) {
        field3019++;
        int var1 = class292.field4474.length;
        if (arg0 < 101) {
            method1190(73, -88, 65, -124, -26, -29);
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class292.field4474[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class274.field4207; var4++) {
                    if (class99.field1746[var4] == class95.field1708[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                int var5 = 0;
                if (var3 == -1) {
                    class99.field1746[class274.field4207] = class95.field1708[var2];
                    var3 = class274.field4207++;
                }
                class202 var6 = new class202(class292.field4474[var2]);
                while (var6.field3249 < class292.field4474[var2].length && var5 < 511) {
                    int var7 = var5++ << 6 | var3;
                    int var8 = var6.method1315(14289);
                    int var9 = (var8 & 0x1F92) >> 7;
                    int var10 = var8 >> 14;
                    int var11 = var8 & 0x3F;
                    int var12 = (class95.field1708[var2] >> 8) * 64 + var9 - class246.field3818;
                    int var13 = (class95.field1708[var2] & 0xFF) * 64 + var11 - class101.field1769;
                    class44 var14 = class19.method130(var6.method1315(14289), -5881);
                    if (class8.field179[var7] == null && (var14.field867 & 0x1) > 0 && class290.field4454 == var10 && var12 >= 0 && var12 + var14.field882 < 104 && var13 >= 0 && var13 + var14.field882 < 104) {
                        class8.field179[var7] = new class255();
                        class255 var15 = class8.field179[var7];
                        class131.field2226[class285.field4417++] = var7;
                        var15.field1855 = class25.field494;
                        var15.method1713((byte) -77, var14);
                        var15.method697(var15.field3991.field882, -2424);
                        var15.field1886 = var15.field1927 = class154.field2515[var15.field3991.field852];
                        var15.field1902 = var15.field3991.field889;
                        var15.field1859 = var15.field3991.field839;
                        if (var15.field1859 == 0) {
                            var15.field1927 = 0;
                        }
                        var15.method706(var13, var15.method710(-1), 0, true, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)Lme;", line = 102)
    public static final class322 method1188(int arg0, int arg1) {
        field3025++;
        class322 var2 = (class322) class134.field2255.method1881(true, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class63.field1205.method2036(arg0, arg1, (byte) 112);
        class322 var4 = new class322();
        if (var3 != null) {
            var4.method2240(-16732, new class202(var3));
        }
        var4.method2237(arg0 - 28);
        class134.field2255.method1880(var4, (long) arg1, 56);
        return var4;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V", line = 128)
    public static void method1189(int arg0) {
        field3027 = null;
        field3029 = null;
        field3022 = null;
        if (arg0 == 63) {
            field3026 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIII)V", line = 148)
    public static final void method1190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 - arg0;
        int var7 = arg5 - arg4;
        field3018++;
        if (var6 == 0) {
            if (var7 != 0) {
                class165.method1054(arg0, (byte) -90, arg4, arg3, arg5);
            }
        } else if (var7 == 0) {
            class202.method1351(arg0, arg4, false, arg3, arg2);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            int var8 = -97 % ((33 - arg1) / 43);
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var9 = var7 > var6;
            if (var9) {
                int var10 = arg2;
                int var11 = arg0;
                arg0 = arg4;
                arg4 = var11;
                arg2 = arg5;
                arg5 = var10;
            }
            if (arg2 < arg0) {
                int var12 = arg0;
                int var13 = arg4;
                arg0 = arg2;
                arg4 = arg5;
                arg5 = var13;
                arg2 = var12;
            }
            int var14 = arg4;
            int var15 = arg2 - arg0;
            int var16 = arg5 - arg4;
            if (var16 < 0) {
                var16 = -var16;
            }
            int var17 = arg5 <= arg4 ? -1 : 1;
            int var18 = -(var15 >> 1);
            if (var9) {
                for (int var20 = arg0; var20 <= arg2; var20++) {
                    var18 += var16;
                    class155.field2522[var20][var14] = arg3;
                    if (var18 > 0) {
                        var18 -= var15;
                        var14 += var17;
                    }
                }
            } else {
                for (int var19 = arg0; var19 <= arg2; var19++) {
                    var18 += var16;
                    class155.field2522[var14][var19] = arg3;
                    if (var18 > 0) {
                        var18 -= var15;
                        var14 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)Lvf;", line = 263)
    public static final class41 method1191(int arg0, int arg1, int arg2) {
        class47 var3 = class326.field4975[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class41 var4 = var3.field965;
            var3.field965 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIII)V", line = 280)
    public static final void method1192(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class337.field5181 == 1) {
            class225.field3554[class147.field2422 / 100].method901(class232.field3638 - 8, class190.field3080 + -8);
        }
        if (arg2 != -1) {
            method1191(-57, 122, 29);
        }
        field3024++;
        if (class337.field5181 == 2) {
            class225.field3554[class147.field2422 / 100 + 4].method901(class232.field3638 - 8, class190.field3080 + -8);
        }
        class191.method1223((byte) 43);
    }
}
