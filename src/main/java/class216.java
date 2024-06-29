import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class216 {

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "[I")
    private static int[] field3168 = new int[1000];

    @OriginalMember(owner = "client!ir", name = "m", descriptor = "[Ltr;")
    private static class139[] field3179 = new class139[50];

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "I")
    private static int field3176 = 0;

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "[Ljava/lang/String;")
    private static String[] field3172 = new String[1000];

    @OriginalMember(owner = "client!ir", name = "u", descriptor = "[I")
    private static int[] field3187 = new int[5];

    @OriginalMember(owner = "client!ir", name = "w", descriptor = "[[I")
    private static int[][] field3189 = new int[5][5000];

    @OriginalMember(owner = "client!ir", name = "p", descriptor = "Ljava/util/Calendar;")
    private static Calendar field3182 = Calendar.getInstance();

    @OriginalMember(owner = "client!ir", name = "x", descriptor = "[I")
    private static int[] field3190 = new int[3];

    @OriginalMember(owner = "client!ir", name = "y", descriptor = "[Ljava/lang/String;")
    private static String[] field3191 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "Lfg;")
    public static class18 field3192 = new class18(4);

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!ir", name = "l", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!ir", name = "n", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!ir", name = "q", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!ir", name = "r", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!ir", name = "s", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!ir", name = "t", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!ir", name = "v", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "Lmb;")
    private static class258 field3171;

    @OriginalMember(owner = "client!ir", name = "o", descriptor = "Lmb;")
    private static class258 field3181;

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "Lsg;")
    private static class265 field3177;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "[I")
    private static int[] field3167;

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "[Ljava/lang/String;")
    private static String[] field3170;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lgk;I)V", line = 12)
    private static final void method1634(class254 arg0, int arg1) {
        Object[] var2 = arg0.field3683;
        int var3 = (Integer) var2[0];
        class140 var4 = class230.method1710(0, var3);
        if (var4 == null) {
            return;
        }
        field3167 = new int[var4.field2224];
        int var5 = 0;
        field3170 = new String[var4.field2222];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field3668;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field3680;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field3678 == null ? -1 : arg0.field3678.field3854;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field3679;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field3678 == null ? -1 : arg0.field3678.field3860;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field3684 == null ? -1 : arg0.field3684.field3854;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field3684 == null ? -1 : arg0.field3684.field3860;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field3676;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field3674;
                }
                field3167[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field3677;
                }
                field3170[var6++] = var9;
            }
        }
        method1637(var4, arg1);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "()V", line = 98)
    public static void method1635() {
        field3167 = null;
        field3170 = null;
        field3187 = null;
        field3189 = null;
        field3168 = null;
        field3172 = null;
        field3179 = null;
        field3181 = null;
        field3171 = null;
        field3177 = null;
        field3182 = null;
        field3191 = null;
        field3190 = null;
        field3192 = null;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lgk;)V", line = 117)
    public static final void method1636(class254 arg0) {
        method1634(arg0, 200000);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Leq;I)V", line = 123)
    private static final void method1637(class140 arg0, int arg1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = -1;
        int[] var5 = arg0.field2221;
        int[] var6 = arg0.field2212;
        byte var7 = -1;
        field3176 = 0;
        try {
            int var8 = 0;
            label4411: while (true) {
                var8++;
                if (var8 > arg1) {
                    throw new RuntimeException("slow");
                }
                var4++;
                int var607 = var5[var4];
                if (var607 < 100) {
                    if (var607 == 0) {
                        field3168[var2++] = var6[var4];
                        continue;
                    }
                    if (var607 == 1) {
                        int var9 = var6[var4];
                        field3168[var2++] = class351.field4988[var9];
                        continue;
                    }
                    if (var607 == 2) {
                        int var10 = var6[var4];
                        var2--;
                        class276.method1969(field3168[var2], var10, 0);
                        continue;
                    }
                    if (var607 == 3) {
                        field3172[var3++] = arg0.field2227[var4];
                        continue;
                    }
                    if (var607 == 6) {
                        var4 += var6[var4];
                        continue;
                    }
                    if (var607 == 7) {
                        var2 -= 2;
                        if (field3168[var2 + 1] != field3168[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var607 == 8) {
                        var2 -= 2;
                        if (field3168[var2 + 1] == field3168[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var607 == 9) {
                        var2 -= 2;
                        if (field3168[var2] < field3168[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var607 == 10) {
                        var2 -= 2;
                        if (field3168[var2] > field3168[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var607 == 21) {
                        if (field3176 == 0) {
                            return;
                        }
                        class139 var11 = field3179[--field3176];
                        arg0 = var11.field2207;
                        var5 = arg0.field2221;
                        var6 = arg0.field2212;
                        var4 = var11.field2208;
                        field3167 = var11.field2205;
                        field3170 = var11.field2203;
                        continue;
                    }
                    if (var607 == 25) {
                        int var12 = var6[var4];
                        field3168[var2++] = class351.method2252(var12, (byte) -38);
                        continue;
                    }
                    if (var607 == 27) {
                        int var13 = var6[var4];
                        var2--;
                        class253.method1829(var13, (byte) -115, field3168[var2]);
                        continue;
                    }
                    if (var607 == 31) {
                        var2 -= 2;
                        if (field3168[var2] <= field3168[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var607 == 32) {
                        var2 -= 2;
                        if (field3168[var2] >= field3168[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var607 == 33) {
                        field3168[var2++] = field3167[var6[var4]];
                        continue;
                    }
                    int var10001;
                    if (var607 == 34) {
                        var10001 = var6[var4];
                        var2--;
                        field3167[var10001] = field3168[var2];
                        continue;
                    }
                    if (var607 == 35) {
                        field3172[var3++] = field3170[var6[var4]];
                        continue;
                    }
                    if (var607 == 36) {
                        var10001 = var6[var4];
                        var3--;
                        field3170[var10001] = field3172[var3];
                        continue;
                    }
                    if (var607 == 37) {
                        int var14 = var6[var4];
                        var3 -= var14;
                        String var15 = class297.method2066(var3, field3172, (byte) -104, var14);
                        field3172[var3++] = var15;
                        continue;
                    }
                    if (var607 == 38) {
                        var2--;
                        continue;
                    }
                    if (var607 == 39) {
                        var3--;
                        continue;
                    }
                    if (var607 == 40) {
                        int var16 = var6[var4];
                        class140 var17 = class230.method1710(0, var16);
                        if (var17 == null) {
                            throw new RuntimeException();
                        }
                        int[] var18 = new int[var17.field2224];
                        String[] var19 = new String[var17.field2222];
                        for (int var20 = 0; var20 < var17.field2228; var20++) {
                            var18[var20] = field3168[var2 + var20 - var17.field2228];
                        }
                        for (int var21 = 0; var21 < var17.field2213; var21++) {
                            var19[var21] = field3172[var3 + var21 - var17.field2213];
                        }
                        var2 -= var17.field2228;
                        var3 -= var17.field2213;
                        class139 var22 = new class139();
                        var22.field2207 = arg0;
                        var22.field2208 = var4;
                        var22.field2205 = field3167;
                        var22.field2203 = field3170;
                        if (field3176 >= field3179.length) {
                            throw new RuntimeException();
                        }
                        field3179[field3176++] = var22;
                        arg0 = var17;
                        var5 = var17.field2221;
                        var6 = var17.field2212;
                        var4 = -1;
                        field3167 = var18;
                        field3170 = var19;
                        continue;
                    }
                    if (var607 == 42) {
                        field3168[var2++] = class27.field401[var6[var4]];
                        continue;
                    }
                    if (var607 == 43) {
                        int var23 = var6[var4];
                        var2--;
                        class27.field401[var23] = field3168[var2];
                        class126.method1066(var23, 125);
                        class315.field4587 |= class102.field1590[var23];
                        continue;
                    }
                    if (var607 == 44) {
                        int var24 = var6[var4] >> 16;
                        int var25 = var6[var4] & 0xFFFF;
                        var2--;
                        int var26 = field3168[var2];
                        if (var26 >= 0 && var26 <= 5000) {
                            field3187[var24] = var26;
                            byte var27 = -1;
                            if (var25 == 105) {
                                var27 = 0;
                            }
                            int var28 = 0;
                            while (true) {
                                if (var28 >= var26) {
                                    continue label4411;
                                }
                                field3189[var24][var28] = var27;
                                var28++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var607 == 45) {
                        int var29 = var6[var4];
                        var2--;
                        int var30 = field3168[var2];
                        if (var30 >= 0 && var30 < field3187[var29]) {
                            field3168[var2++] = field3189[var29][var30];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var607 == 46) {
                        int var31 = var6[var4];
                        var2 -= 2;
                        int var32 = field3168[var2];
                        if (var32 >= 0 && var32 < field3187[var31]) {
                            field3189[var31][var32] = field3168[var2 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var607 == 47) {
                        String var33 = class425.field6183[var6[var4]];
                        if (var33 == null) {
                            var33 = "null";
                        }
                        field3172[var3++] = var33;
                        continue;
                    }
                    if (var607 == 48) {
                        int var34 = var6[var4];
                        var3--;
                        class425.field6183[var34] = field3172[var3];
                        class192.method1483(-4097, var34);
                        continue;
                    }
                    if (var607 == 51) {
                        class156 var35 = arg0.field2225[var6[var4]];
                        var2--;
                        class9 var36 = (class9) var35.method1219((long) field3168[var2], -99);
                        if (var36 != null) {
                            var4 += var36.field117;
                        }
                        continue;
                    }
                }
                boolean var37;
                if (var6[var4] == 1) {
                    var37 = true;
                } else {
                    var37 = false;
                }
                if (var607 < 300) {
                    if (var607 == 100) {
                        var2 -= 3;
                        int var38 = field3168[var2];
                        int var39 = field3168[var2 + 1];
                        int var40 = field3168[var2 + 2];
                        if (var39 == 0) {
                            throw new RuntimeException();
                        }
                        class258 var41 = class342.method2207(var38, (byte) 14);
                        if (var41.field3869 == null) {
                            var41.field3869 = new class258[var40 + 1];
                        }
                        if (var41.field3869.length <= var40) {
                            class258[] var42 = new class258[var40 + 1];
                            for (int var43 = 0; var43 < var41.field3869.length; var43++) {
                                var42[var43] = var41.field3869[var43];
                            }
                            var41.field3869 = var42;
                        }
                        if (var40 > 0 && var41.field3869[var40 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var40 - 1));
                        }
                        class258 var44 = new class258();
                        var44.field3793 = var39;
                        var44.field3754 = var44.field3854 = var41.field3854;
                        var44.field3860 = var40;
                        var44.field3825 = true;
                        var41.field3869[var40] = var44;
                        if (var37) {
                            field3171 = var44;
                        } else {
                            field3181 = var44;
                        }
                        class107.method947(true, var41);
                        continue;
                    }
                    if (var607 == 101) {
                        class258 var45 = var37 ? field3171 : field3181;
                        if (var45.field3860 == -1) {
                            if (var37) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class258 var46 = class342.method2207(var45.field3854, (byte) 14);
                        var46.field3869[var45.field3860] = null;
                        class107.method947(true, var46);
                        continue;
                    }
                    if (var607 == 102) {
                        var2--;
                        class258 var47 = class342.method2207(field3168[var2], (byte) 14);
                        var47.field3869 = null;
                        class107.method947(true, var47);
                        continue;
                    }
                    if (var607 == 200) {
                        var2 -= 2;
                        int var48 = field3168[var2];
                        int var49 = field3168[var2 + 1];
                        class258 var50 = class102.method849((byte) -105, var48, var49);
                        if (var50 != null && var49 != -1) {
                            field3168[var2++] = 1;
                            if (var37) {
                                field3171 = var50;
                            } else {
                                field3181 = var50;
                            }
                            continue;
                        }
                        field3168[var2++] = 0;
                        continue;
                    }
                    if (var607 == 201) {
                        var2--;
                        int var51 = field3168[var2];
                        class258 var52 = class342.method2207(var51, (byte) 14);
                        if (var52 == null) {
                            field3168[var2++] = 0;
                        } else {
                            field3168[var2++] = 1;
                            if (var37) {
                                field3171 = var52;
                            } else {
                                field3181 = var52;
                            }
                        }
                        continue;
                    }
                } else if (var607 < 500) {
                    if (var607 == 403) {
                        var2 -= 2;
                        int var53 = field3168[var2];
                        int var54 = field3168[var2 + 1];
                        for (int var55 = 0; var55 < class367.field5224.length; var55++) {
                            if (class367.field5224[var55] == var53) {
                                class86.field1394.field2072.method1177(var54, var55, 0);
                                continue label4411;
                            }
                        }
                        int var56 = 0;
                        while (true) {
                            if (var56 >= class297.field4401.length) {
                                continue label4411;
                            }
                            if (class297.field4401[var56] == var53) {
                                class86.field1394.field2072.method1177(var54, var56, 0);
                                continue label4411;
                            }
                            var56++;
                        }
                    }
                    if (var607 == 404) {
                        var2 -= 2;
                        int var57 = field3168[var2];
                        int var58 = field3168[var2 + 1];
                        class86.field1394.field2072.method1182(-69, var57, var58);
                        continue;
                    }
                    if (var607 == 410) {
                        var2--;
                        boolean var59 = field3168[var2] != 0;
                        class86.field1394.field2072.method1172(true, var59);
                        continue;
                    }
                } else if (var607 >= 1000 && var607 < 1100 || var607 >= 2000 && var607 < 2100) {
                    class258 var60;
                    if (var607 >= 2000) {
                        var607 -= 1000;
                        var2--;
                        var60 = class342.method2207(field3168[var2], (byte) 14);
                    } else {
                        var60 = var37 ? field3171 : field3181;
                    }
                    if (var607 == 1000) {
                        var2 -= 4;
                        var60.field3853 = field3168[var2];
                        var60.field3870 = field3168[var2 + 1];
                        int var61 = field3168[var2 + 2];
                        if (var61 < 0) {
                            var61 = 0;
                        } else if (var61 > 5) {
                            var61 = 5;
                        }
                        int var62 = field3168[var2 + 3];
                        if (var62 < 0) {
                            var62 = 0;
                        } else if (var62 > 5) {
                            var62 = 5;
                        }
                        var60.field3770 = (byte) var61;
                        var60.field3868 = (byte) var62;
                        class107.method947(true, var60);
                        class187.method1451(var60, (byte) 126);
                        if (var60.field3860 == -1) {
                            class420.method2635(var60.field3854, 122);
                        }
                        continue;
                    }
                    if (var607 == 1001) {
                        var2 -= 4;
                        var60.field3905 = field3168[var2];
                        var60.field3814 = field3168[var2 + 1];
                        var60.field3819 = 0;
                        var60.field3728 = 0;
                        int var63 = field3168[var2 + 2];
                        if (var63 < 0) {
                            var63 = 0;
                        } else if (var63 > 4) {
                            var63 = 4;
                        }
                        int var64 = field3168[var2 + 3];
                        if (var64 < 0) {
                            var64 = 0;
                        } else if (var64 > 4) {
                            var64 = 4;
                        }
                        var60.field3909 = (byte) var63;
                        var60.field3883 = (byte) var64;
                        class107.method947(true, var60);
                        class187.method1451(var60, (byte) 126);
                        if (var60.field3793 == 0) {
                            class360.method2307(var60, -1, false);
                        }
                        continue;
                    }
                    if (var607 == 1003) {
                        var2--;
                        boolean var65 = field3168[var2] == 1;
                        if (var60.field3873 != var65) {
                            var60.field3873 = var65;
                            class107.method947(true, var60);
                        }
                        if (var60.field3860 == -1) {
                            class221.method1693(-124, var60.field3854);
                        }
                        continue;
                    }
                    if (var607 == 1004) {
                        var2 -= 2;
                        var60.field3859 = field3168[var2];
                        var60.field3794 = field3168[var2 + 1];
                        class107.method947(true, var60);
                        class187.method1451(var60, (byte) 124);
                        if (var60.field3793 == 0) {
                            class360.method2307(var60, -1, false);
                        }
                        continue;
                    }
                    if (var607 == 1005) {
                        var2--;
                        var60.field3762 = field3168[var2] == 1;
                        continue;
                    }
                } else if (var607 >= 1100 && var607 < 1200 || var607 >= 2100 && var607 < 2200) {
                    class258 var66;
                    if (var607 >= 2000) {
                        var607 -= 1000;
                        var2--;
                        var66 = class342.method2207(field3168[var2], (byte) 14);
                    } else {
                        var66 = var37 ? field3171 : field3181;
                    }
                    if (var607 == 1100) {
                        var2 -= 2;
                        var66.field3791 = field3168[var2];
                        if (var66.field3791 > var66.field3805 - var66.field3764) {
                            var66.field3791 = var66.field3805 - var66.field3764;
                        }
                        if (var66.field3791 < 0) {
                            var66.field3791 = 0;
                        }
                        var66.field3900 = field3168[var2 + 1];
                        if (var66.field3900 > var66.field3882 - var66.field3758) {
                            var66.field3900 = var66.field3882 - var66.field3758;
                        }
                        if (var66.field3900 < 0) {
                            var66.field3900 = 0;
                        }
                        class107.method947(true, var66);
                        if (var66.field3860 == -1) {
                            class328.method2163(var66.field3854, (byte) -93);
                        }
                        continue;
                    }
                    if (var607 == 1101) {
                        var2--;
                        var66.field3772 = field3168[var2];
                        class107.method947(true, var66);
                        if (var66.field3860 == -1) {
                            class355.method2277(74, var66.field3854);
                        }
                        continue;
                    }
                    if (var607 == 1102) {
                        var2--;
                        var66.field3729 = field3168[var2] == 1;
                        class107.method947(true, var66);
                        continue;
                    }
                    if (var607 == 1103) {
                        var2--;
                        var66.field3832 = field3168[var2];
                        class107.method947(true, var66);
                        continue;
                    }
                    if (var607 == 1104) {
                        var2--;
                        var66.field3880 = field3168[var2];
                        class107.method947(true, var66);
                        continue;
                    }
                    if (var607 == 1105) {
                        var2--;
                        int var67 = field3168[var2];
                        if (var66.field3810 != var67) {
                            var66.field3810 = var67;
                            class107.method947(true, var66);
                        }
                        if (var66.field3860 == -1) {
                            class91.method777(21, var66.field3854);
                        }
                        continue;
                    }
                    if (var607 == 1106) {
                        var2--;
                        var66.field3912 = field3168[var2];
                        class107.method947(true, var66);
                        continue;
                    }
                    if (var607 == 1107) {
                        var2--;
                        var66.field3903 = field3168[var2] == 1;
                        class107.method947(true, var66);
                        continue;
                    }
                    if (var607 == 1108) {
                        var66.field3858 = 1;
                        var2--;
                        var66.field3864 = field3168[var2];
                        class107.method947(true, var66);
                        if (var66.field3860 == -1) {
                            class58.method444(var66.field3854, -82);
                        }
                        continue;
                    }
                    if (var607 == 1109) {
                        var2 -= 6;
                        var66.field3785 = field3168[var2];
                        var66.field3752 = field3168[var2 + 1];
                        var66.field3771 = field3168[var2 + 2];
                        var66.field3889 = field3168[var2 + 3];
                        var66.field3774 = field3168[var2 + 4];
                        var66.field3888 = field3168[var2 + 5];
                        class107.method947(true, var66);
                        if (var66.field3860 == -1) {
                            class258.method1874(8, var66.field3854);
                            class362.method2318((byte) 28, var66.field3854);
                        }
                        continue;
                    }
                    if (var607 == 1110) {
                        var2--;
                        int var68 = field3168[var2];
                        if (var66.field3828 != var68) {
                            var66.field3828 = var68;
                            var66.field3811 = 0;
                            var66.field3731 = 1;
                            var66.field3894 = 0;
                            class107.method947(true, var66);
                        }
                        if (var66.field3860 == -1) {
                            class282.method2002(5, var66.field3854);
                        }
                        continue;
                    }
                    if (var607 == 1111) {
                        var2--;
                        var66.field3871 = field3168[var2] == 1;
                        class107.method947(true, var66);
                        continue;
                    }
                    if (var607 == 1112) {
                        var3--;
                        String var69 = field3172[var3];
                        if (!var69.equals(var66.field3733)) {
                            var66.field3733 = var69;
                            class107.method947(true, var66);
                        }
                        if (var66.field3860 == -1) {
                            class157.method1234(var66.field3854, false);
                        }
                        continue;
                    }
                    if (var607 == 1113) {
                        var2--;
                        var66.field3813 = field3168[var2];
                        class107.method947(true, var66);
                        continue;
                    }
                    if (var607 == 1114) {
                        var2 -= 3;
                        var66.field3766 = field3168[var2];
                        var66.field3788 = field3168[var2 + 1];
                        var66.field3737 = field3168[var2 + 2];
                        class107.method947(true, var66);
                        continue;
                    }
                    if (var607 == 1115) {
                        var2--;
                        var66.field3787 = field3168[var2] == 1;
                        class107.method947(true, var66);
                        continue;
                    }
                    if (var607 == 1116) {
                        var2--;
                        var66.field3842 = field3168[var2];
                        class107.method947(true, var66);
                        continue;
                    }
                    if (var607 == 1117) {
                        var2--;
                        var66.field3798 = field3168[var2];
                        class107.method947(true, var66);
                        continue;
                    }
                    if (var607 == 1118) {
                        var2--;
                        var66.field3796 = field3168[var2] == 1;
                        class107.method947(true, var66);
                        continue;
                    }
                    if (var607 == 1119) {
                        var2--;
                        var66.field3866 = field3168[var2] == 1;
                        class107.method947(true, var66);
                        continue;
                    }
                    if (var607 == 1120) {
                        var2 -= 2;
                        var66.field3805 = field3168[var2];
                        var66.field3882 = field3168[var2 + 1];
                        class107.method947(true, var66);
                        if (var66.field3793 == 0) {
                            class360.method2307(var66, -1, false);
                        }
                        continue;
                    }
                    if (var607 == 1121) {
                        var2 -= 2;
                        var66.field3776 = (short) field3168[var2];
                        var66.field3843 = (short) field3168[var2 + 1];
                        class107.method947(true, var66);
                        continue;
                    }
                    if (var607 == 1122) {
                        var2--;
                        var66.field3775 = field3168[var2] == 1;
                        class107.method947(true, var66);
                        continue;
                    }
                    if (var607 == 1123) {
                        var2--;
                        var66.field3888 = field3168[var2];
                        class107.method947(true, var66);
                        if (var66.field3860 == -1) {
                            class258.method1874(8, var66.field3854);
                        }
                        continue;
                    }
                    if (var607 == 1124) {
                        var2--;
                        int var70 = field3168[var2];
                        var66.field3818 = var70 == 1;
                        class107.method947(true, var66);
                        continue;
                    }
                    if (var607 == 1125) {
                        var2 -= 2;
                        var66.field3897 = field3168[var2];
                        var66.field3816 = field3168[var2 + 1];
                        class107.method947(true, var66);
                        continue;
                    }
                } else if (!(var607 < 1200 || var607 >= 1300) || !(var607 < 2200 || var607 >= 2300)) {
                    class258 var71;
                    if (var607 >= 2000) {
                        var607 -= 1000;
                        var2--;
                        var71 = class342.method2207(field3168[var2], (byte) 14);
                    } else {
                        var71 = var37 ? field3171 : field3181;
                    }
                    class107.method947(true, var71);
                    if (var607 == 1200 || var607 == 1205 || var607 == 1208 || var607 == 1209 || var607 == 1212 || var607 == 1213) {
                        var2 -= 2;
                        int var72 = field3168[var2];
                        int var73 = field3168[var2 + 1];
                        if (var71.field3860 == -1) {
                            class276.method1972(var71.field3854, (byte) -93);
                            class258.method1874(8, var71.field3854);
                            class362.method2318((byte) 28, var71.field3854);
                        }
                        if (var72 == -1) {
                            var71.field3858 = 1;
                            var71.field3864 = -1;
                            var71.field3765 = -1;
                            continue;
                        }
                        var71.field3765 = var72;
                        var71.field3743 = var73;
                        if (var607 == 1208 || var607 == 1209) {
                            var71.field3879 = true;
                        } else {
                            var71.field3879 = false;
                        }
                        class124 var74 = class206.method1561(115, var72);
                        var71.field3771 = var74.field1982;
                        var71.field3889 = var74.field1958;
                        var71.field3774 = var74.field1979;
                        var71.field3785 = var74.field1963;
                        var71.field3752 = var74.field2035;
                        var71.field3888 = var74.field1971;
                        if (var607 == 1205 || var607 == 1209) {
                            var71.field3759 = 0;
                        } else if (var607 == 1212 || var607 == 1213) {
                            var71.field3759 = 1;
                        } else {
                            var71.field3759 = 2;
                        }
                        if (var71.field3819 > 0) {
                            var71.field3888 = var71.field3888 * 32 / var71.field3819;
                        } else if (var71.field3905 > 0) {
                            var71.field3888 = var71.field3888 * 32 / var71.field3905;
                        }
                        continue;
                    }
                    if (var607 == 1201) {
                        var71.field3858 = 2;
                        var2--;
                        var71.field3864 = field3168[var2];
                        if (var71.field3860 == -1) {
                            class58.method444(var71.field3854, -77);
                        }
                        continue;
                    }
                    if (var607 == 1202) {
                        var71.field3858 = 3;
                        var71.field3864 = -1;
                        if (var71.field3860 == -1) {
                            class58.method444(var71.field3854, -118);
                        }
                        continue;
                    }
                    if (var607 == 1203) {
                        var71.field3858 = 6;
                        var2--;
                        var71.field3864 = field3168[var2];
                        if (var71.field3860 == -1) {
                            class58.method444(var71.field3854, -128);
                        }
                        continue;
                    }
                    if (var607 == 1204) {
                        var71.field3858 = 5;
                        var2--;
                        var71.field3864 = field3168[var2];
                        if (var71.field3860 == -1) {
                            class58.method444(var71.field3854, -58);
                        }
                        continue;
                    }
                    if (var607 == 1206) {
                        var2 -= 4;
                        var71.field3892 = field3168[var2];
                        var71.field3840 = field3168[var2 + 1];
                        var71.field3807 = field3168[var2 + 2];
                        var71.field3887 = field3168[var2 + 3];
                        class107.method947(true, var71);
                        continue;
                    }
                    if (var607 == 1207) {
                        var2 -= 2;
                        var71.field3736 = field3168[var2];
                        var71.field3841 = field3168[var2 + 1];
                        class107.method947(true, var71);
                        continue;
                    }
                    if (var607 == 1210) {
                        var2 -= 4;
                        var71.field3864 = field3168[var2];
                        var71.field3872 = field3168[var2 + 1];
                        if (field3168[var2 + 2] == 1) {
                            var71.field3858 = 9;
                        } else {
                            var71.field3858 = 8;
                        }
                        if (field3168[var2 + 3] == 1) {
                            var71.field3879 = true;
                        } else {
                            var71.field3879 = false;
                        }
                        if (var71.field3860 == -1) {
                            class58.method444(var71.field3854, -57);
                        }
                        continue;
                    }
                    if (var607 == 1211) {
                        var71.field3858 = 5;
                        var71.field3864 = 2047;
                        var71.field3872 = 0;
                        if (var71.field3860 == -1) {
                            class58.method444(var71.field3854, -116);
                        }
                        continue;
                    }
                } else if ((var607 < 1300 || var607 >= 1400) && (var607 < 2300 || var607 >= 2400)) {
                    if (var607 >= 1400 && var607 < 1500 || var607 >= 2400 && var607 < 2500) {
                        class258 var81;
                        if (var607 >= 2000) {
                            var607 -= 1000;
                            var2--;
                            var81 = class342.method2207(field3168[var2], (byte) 14);
                        } else {
                            var81 = var37 ? field3171 : field3181;
                        }
                        var3--;
                        String var82 = field3172[var3];
                        int[] var83 = null;
                        if (var82.length() > 0 && var82.charAt(var82.length() - 1) == 'Y') {
                            var2--;
                            int var84 = field3168[var2];
                            if (var84 > 0) {
                                var83 = new int[var84];
                                while (var84-- > 0) {
                                    var2--;
                                    var83[var84] = field3168[var2];
                                }
                            }
                            var82 = var82.substring(0, var82.length() - 1);
                        }
                        Object[] var85 = new Object[var82.length() + 1];
                        for (int var86 = var85.length - 1; var86 >= 1; var86--) {
                            if (var82.charAt(var86 - 1) == 's') {
                                var3--;
                                var85[var86] = field3172[var3];
                            } else {
                                var2--;
                                var85[var86] = Integer.valueOf(field3168[var2]);
                            }
                        }
                        var2--;
                        int var87 = field3168[var2];
                        if (var87 == -1) {
                            var85 = null;
                        } else {
                            var85[0] = Integer.valueOf(var87);
                        }
                        if (var607 == 1400) {
                            var81.field3851 = var85;
                        } else if (var607 == 1401) {
                            var81.field3855 = var85;
                        } else if (var607 == 1402) {
                            var81.field3886 = var85;
                        } else if (var607 == 1403) {
                            var81.field3849 = var85;
                        } else if (var607 == 1404) {
                            var81.field3739 = var85;
                        } else if (var607 == 1405) {
                            var81.field3836 = var85;
                        } else if (var607 == 1406) {
                            var81.field3777 = var85;
                        } else if (var607 == 1407) {
                            var81.field3838 = var85;
                            var81.field3867 = var83;
                        } else if (var607 == 1408) {
                            var81.field3829 = var85;
                        } else if (var607 == 1409) {
                            var81.field3831 = var85;
                        } else if (var607 == 1410) {
                            var81.field3826 = var85;
                        } else if (var607 == 1411) {
                            var81.field3804 = var85;
                        } else if (var607 == 1412) {
                            var81.field3735 = var85;
                        } else if (var607 == 1414) {
                            var81.field3904 = var85;
                            var81.field3865 = var83;
                        } else if (var607 == 1415) {
                            var81.field3822 = var85;
                            var81.field3911 = var83;
                        } else if (var607 == 1416) {
                            var81.field3761 = var85;
                        } else if (var607 == 1417) {
                            var81.field3913 = var85;
                        } else if (var607 == 1418) {
                            var81.field3833 = var85;
                        } else if (var607 == 1419) {
                            var81.field3815 = var85;
                        } else if (var607 == 1420) {
                            var81.field3782 = var85;
                        } else if (var607 == 1421) {
                            var81.field3914 = var85;
                        } else if (var607 == 1422) {
                            var81.field3768 = var85;
                        } else if (var607 == 1423) {
                            var81.field3848 = var85;
                        } else if (var607 == 1424) {
                            var81.field3884 = var85;
                        } else if (var607 == 1425) {
                            var81.field3781 = var85;
                        } else if (var607 == 1426) {
                            var81.field3823 = var85;
                        } else if (var607 == 1427) {
                            var81.field3747 = var85;
                        } else if (var607 == 1428) {
                            var81.field3751 = var85;
                            var81.field3812 = var83;
                        } else if (var607 == 1429) {
                            var81.field3891 = var85;
                            var81.field3852 = var83;
                        }
                        var81.field3857 = true;
                        continue;
                    }
                    if (var607 < 1600) {
                        class258 var88 = var37 ? field3171 : field3181;
                        if (var607 == 1500) {
                            field3168[var2++] = var88.field3750;
                            continue;
                        }
                        if (var607 == 1501) {
                            field3168[var2++] = var88.field3908;
                            continue;
                        }
                        if (var607 == 1502) {
                            field3168[var2++] = var88.field3764;
                            continue;
                        }
                        if (var607 == 1503) {
                            field3168[var2++] = var88.field3758;
                            continue;
                        }
                        if (var607 == 1504) {
                            field3168[var2++] = var88.field3873 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 1505) {
                            field3168[var2++] = var88.field3754;
                            continue;
                        }
                    } else if (var607 < 1700) {
                        class258 var89 = var37 ? field3171 : field3181;
                        if (var607 == 1600) {
                            field3168[var2++] = var89.field3791;
                            continue;
                        }
                        if (var607 == 1601) {
                            field3168[var2++] = var89.field3900;
                            continue;
                        }
                        if (var607 == 1602) {
                            field3172[var3++] = var89.field3733;
                            continue;
                        }
                        if (var607 == 1603) {
                            field3168[var2++] = var89.field3805;
                            continue;
                        }
                        if (var607 == 1604) {
                            field3168[var2++] = var89.field3882;
                            continue;
                        }
                        if (var607 == 1605) {
                            field3168[var2++] = var89.field3888;
                            continue;
                        }
                        if (var607 == 1606) {
                            field3168[var2++] = var89.field3771;
                            continue;
                        }
                        if (var607 == 1607) {
                            field3168[var2++] = var89.field3774;
                            continue;
                        }
                        if (var607 == 1608) {
                            field3168[var2++] = var89.field3889;
                            continue;
                        }
                        if (var607 == 1609) {
                            field3168[var2++] = var89.field3832;
                            continue;
                        }
                        if (var607 == 1610) {
                            field3168[var2++] = var89.field3785;
                            continue;
                        }
                        if (var607 == 1611) {
                            field3168[var2++] = var89.field3752;
                            continue;
                        }
                        if (var607 == 1612) {
                            field3168[var2++] = var89.field3810;
                            continue;
                        }
                    } else if (var607 < 1800) {
                        class258 var90 = var37 ? field3171 : field3181;
                        if (var607 == 1700) {
                            field3168[var2++] = var90.field3765;
                            continue;
                        }
                        if (var607 == 1701) {
                            if (var90.field3765 == -1) {
                                field3168[var2++] = 0;
                            } else {
                                field3168[var2++] = var90.field3743;
                            }
                            continue;
                        }
                        if (var607 == 1702) {
                            field3168[var2++] = var90.field3860;
                            continue;
                        }
                    } else if (var607 < 1900) {
                        class258 var91 = var37 ? field3171 : field3181;
                        if (var607 == 1800) {
                            field3168[var2++] = client.method1815(var91).method2609((byte) 126);
                            continue;
                        }
                        if (var607 == 1801) {
                            var2--;
                            int var92 = field3168[var2];
                            int var608 = var92 - 1;
                            if (var91.field3795 != null && var608 < var91.field3795.length && var91.field3795[var608] != null) {
                                field3172[var3++] = var91.field3795[var608];
                                continue;
                            }
                            field3172[var3++] = "";
                            continue;
                        }
                        if (var607 == 1802) {
                            if (var91.field3863 == null) {
                                field3172[var3++] = "";
                            } else {
                                field3172[var3++] = var91.field3863;
                            }
                            continue;
                        }
                    } else if (var607 < 2600) {
                        var2--;
                        class258 var93 = class342.method2207(field3168[var2], (byte) 14);
                        if (var607 == 2500) {
                            field3168[var2++] = var93.field3750;
                            continue;
                        }
                        if (var607 == 2501) {
                            field3168[var2++] = var93.field3908;
                            continue;
                        }
                        if (var607 == 2502) {
                            field3168[var2++] = var93.field3764;
                            continue;
                        }
                        if (var607 == 2503) {
                            field3168[var2++] = var93.field3758;
                            continue;
                        }
                        if (var607 == 2504) {
                            field3168[var2++] = var93.field3873 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 2505) {
                            field3168[var2++] = var93.field3754;
                            continue;
                        }
                    } else if (var607 < 2700) {
                        var2--;
                        class258 var94 = class342.method2207(field3168[var2], (byte) 14);
                        if (var607 == 2600) {
                            field3168[var2++] = var94.field3791;
                            continue;
                        }
                        if (var607 == 2601) {
                            field3168[var2++] = var94.field3900;
                            continue;
                        }
                        if (var607 == 2602) {
                            field3172[var3++] = var94.field3733;
                            continue;
                        }
                        if (var607 == 2603) {
                            field3168[var2++] = var94.field3805;
                            continue;
                        }
                        if (var607 == 2604) {
                            field3168[var2++] = var94.field3882;
                            continue;
                        }
                        if (var607 == 2605) {
                            field3168[var2++] = var94.field3888;
                            continue;
                        }
                        if (var607 == 2606) {
                            field3168[var2++] = var94.field3771;
                            continue;
                        }
                        if (var607 == 2607) {
                            field3168[var2++] = var94.field3774;
                            continue;
                        }
                        if (var607 == 2608) {
                            field3168[var2++] = var94.field3889;
                            continue;
                        }
                        if (var607 == 2609) {
                            field3168[var2++] = var94.field3832;
                            continue;
                        }
                        if (var607 == 2610) {
                            field3168[var2++] = var94.field3785;
                            continue;
                        }
                        if (var607 == 2611) {
                            field3168[var2++] = var94.field3752;
                            continue;
                        }
                        if (var607 == 2612) {
                            field3168[var2++] = var94.field3810;
                            continue;
                        }
                    } else if (var607 < 2800) {
                        if (var607 == 2700) {
                            var2--;
                            class258 var95 = class342.method2207(field3168[var2], (byte) 14);
                            field3168[var2++] = var95.field3765;
                            continue;
                        }
                        if (var607 == 2701) {
                            var2--;
                            class258 var96 = class342.method2207(field3168[var2], (byte) 14);
                            if (var96.field3765 == -1) {
                                field3168[var2++] = 0;
                            } else {
                                field3168[var2++] = var96.field3743;
                            }
                            continue;
                        }
                        if (var607 == 2702) {
                            var2--;
                            int var97 = field3168[var2];
                            class120 var98 = (class120) class355.field5045.method1219((long) var97, -105);
                            if (var98 == null) {
                                field3168[var2++] = 0;
                            } else {
                                field3168[var2++] = 1;
                            }
                            continue;
                        }
                        if (var607 == 2703) {
                            var2--;
                            class258 var99 = class342.method2207(field3168[var2], (byte) 14);
                            if (var99.field3869 == null) {
                                field3168[var2++] = 0;
                                continue;
                            }
                            int var100 = var99.field3869.length;
                            for (int var101 = 0; var101 < var99.field3869.length; var101++) {
                                if (var99.field3869[var101] == null) {
                                    var100 = var101;
                                    break;
                                }
                            }
                            field3168[var2++] = var100;
                            continue;
                        }
                        if (var607 == 2704 || var607 == 2705) {
                            var2 -= 2;
                            int var102 = field3168[var2];
                            int var103 = field3168[var2 + 1];
                            class120 var104 = (class120) class355.field5045.method1219((long) var102, -128);
                            if (var104 != null && var104.field1874 == var103) {
                                field3168[var2++] = 1;
                                continue;
                            }
                            field3168[var2++] = 0;
                            continue;
                        }
                    } else if (var607 < 2900) {
                        var2--;
                        class258 var105 = class342.method2207(field3168[var2], (byte) 14);
                        if (var607 == 2800) {
                            field3168[var2++] = client.method1815(var105).method2609((byte) 127);
                            continue;
                        }
                        if (var607 == 2801) {
                            var2--;
                            int var106 = field3168[var2];
                            int var609 = var106 - 1;
                            if (var105.field3795 != null && var609 < var105.field3795.length && var105.field3795[var609] != null) {
                                field3172[var3++] = var105.field3795[var609];
                                continue;
                            }
                            field3172[var3++] = "";
                            continue;
                        }
                        if (var607 == 2802) {
                            if (var105.field3863 == null) {
                                field3172[var3++] = "";
                            } else {
                                field3172[var3++] = var105.field3863;
                            }
                            continue;
                        }
                    } else if (var607 < 3200) {
                        if (var607 == 3100) {
                            var3--;
                            String var107 = field3172[var3];
                            class373.method2380(19380, var107);
                            continue;
                        }
                        if (var607 == 3101) {
                            var2 -= 2;
                            class390.method2467(field3168[var2], -1, field3168[var2 + 1], class86.field1394);
                            continue;
                        }
                        if (var607 == 3103) {
                            class311.method2122(true, 49);
                            continue;
                        }
                        if (var607 == 3104) {
                            var3--;
                            String var108 = field3172[var3];
                            int var109 = 0;
                            if (class341.method2202((byte) 114, var108)) {
                                var109 = class36.method259(var108, (byte) 117);
                            }
                            field3175++;
                            class13.field216.method2781(false, 32);
                            class13.field216.method275(var109, 1414495172);
                            continue;
                        }
                        if (var607 == 3105) {
                            var3--;
                            String var110 = field3172[var3];
                            field3173++;
                            class13.field216.method2781(false, 83);
                            class13.field216.method267(var110.length() + 1, false);
                            class13.field216.method265((byte) -114, var110);
                            continue;
                        }
                        if (var607 == 3106) {
                            var3--;
                            String var111 = field3172[var3];
                            field3169++;
                            class13.field216.method2781(false, 160);
                            class13.field216.method267(var111.length() + 1, false);
                            class13.field216.method265((byte) -82, var111);
                            continue;
                        }
                        if (var607 == 3107) {
                            var2--;
                            int var112 = field3168[var2];
                            var3--;
                            String var113 = field3172[var3];
                            class286.method2021(var112, var113, true);
                            continue;
                        }
                        if (var607 == 3108) {
                            var2 -= 3;
                            int var114 = field3168[var2];
                            int var115 = field3168[var2 + 1];
                            int var116 = field3168[var2 + 2];
                            class258 var117 = class342.method2207(var116, (byte) 14);
                            class268.method1911(var117, var114, 0, var115);
                            continue;
                        }
                        if (var607 == 3109) {
                            var2 -= 2;
                            int var118 = field3168[var2];
                            int var119 = field3168[var2 + 1];
                            class258 var120 = var37 ? field3171 : field3181;
                            class268.method1911(var120, var118, 0, var119);
                            continue;
                        }
                        if (var607 == 3110) {
                            var2--;
                            int var121 = field3168[var2];
                            field3178++;
                            class13.field216.method2781(false, 51);
                            class13.field216.method324(var121, -92);
                            continue;
                        }
                        if (var607 == 3111) {
                            var2 -= 2;
                            int var122 = field3168[var2];
                            int var123 = field3168[var2 + 1];
                            class120 var124 = (class120) class355.field5045.method1219((long) var122, -110);
                            if (var124 != null) {
                                class254.method1839(var124.field1874 != var123, true, -1, var124);
                            }
                            class48.method386(3, true, var123, (byte) 116, var122);
                            continue;
                        }
                        if (var607 == 3112) {
                            var2--;
                            int var125 = field3168[var2];
                            class120 var126 = (class120) class355.field5045.method1219((long) var125, -100);
                            if (var126 != null && var126.field1875 == 3) {
                                class254.method1839(true, true, -1, var126);
                            }
                            continue;
                        }
                    } else if (var607 < 3300) {
                        if (var607 == 3200) {
                            var2 -= 3;
                            class254.method1837(true, 255, field3168[var2 + 2], field3168[var2 + 1], field3168[var2]);
                            continue;
                        }
                        if (var607 == 3201) {
                            var2--;
                            class153.method1171(255, (byte) 62, field3168[var2]);
                            continue;
                        }
                        if (var607 == 3202) {
                            var2 -= 2;
                            class308.method2110(0, 255, field3168[var2 + 1], field3168[var2]);
                            continue;
                        }
                    } else if (var607 < 3400) {
                        if (var607 == 3300) {
                            field3168[var2++] = class267.field4002;
                            continue;
                        }
                        if (var607 == 3301) {
                            var2 -= 2;
                            int var127 = field3168[var2];
                            int var128 = field3168[var2 + 1];
                            field3168[var2++] = class360.method2309((byte) 103, var128, var127);
                            continue;
                        }
                        if (var607 == 3302) {
                            var2 -= 2;
                            int var129 = field3168[var2];
                            int var130 = field3168[var2 + 1];
                            field3168[var2++] = class403.method2555((byte) 113, var129, var130);
                            continue;
                        }
                        if (var607 == 3303) {
                            var2 -= 2;
                            int var131 = field3168[var2];
                            int var132 = field3168[var2 + 1];
                            field3168[var2++] = class450.method2805(var132, var131, false);
                            continue;
                        }
                        if (var607 == 3304) {
                            var2--;
                            int var133 = field3168[var2];
                            field3168[var2++] = class354.method2272(var133, 10).field855;
                            continue;
                        }
                        if (var607 == 3305) {
                            var2--;
                            int var134 = field3168[var2];
                            field3168[var2++] = class334.field4793[var134];
                            continue;
                        }
                        if (var607 == 3306) {
                            var2--;
                            int var135 = field3168[var2];
                            field3168[var2++] = class157.field2399[var135];
                            continue;
                        }
                        if (var607 == 3307) {
                            var2--;
                            int var136 = field3168[var2];
                            field3168[var2++] = class350.field4977[var136];
                            continue;
                        }
                        if (var607 == 3308) {
                            int var137 = class367.field5213;
                            int var138 = (class86.field1394.field6520 >> 7) + class379.field5384;
                            int var139 = (class86.field1394.field6519 >> 7) + class294.field4362;
                            field3168[var2++] = (var137 << 28) + (var138 << 14) + var139;
                            continue;
                        }
                        if (var607 == 3309) {
                            var2--;
                            int var140 = field3168[var2];
                            field3168[var2++] = var140 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var607 == 3310) {
                            var2--;
                            int var141 = field3168[var2];
                            field3168[var2++] = var141 >> 28;
                            continue;
                        }
                        if (var607 == 3311) {
                            var2--;
                            int var142 = field3168[var2];
                            field3168[var2++] = var142 & 0x3FFF;
                            continue;
                        }
                        if (var607 == 3312) {
                            field3168[var2++] = class121.field1908 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3313) {
                            var2 -= 2;
                            int var143 = field3168[var2] + 32768;
                            int var144 = field3168[var2 + 1];
                            field3168[var2++] = class360.method2309((byte) 103, var144, var143);
                            continue;
                        }
                        if (var607 == 3314) {
                            var2 -= 2;
                            int var145 = field3168[var2] + 32768;
                            int var146 = field3168[var2 + 1];
                            field3168[var2++] = class403.method2555((byte) -79, var145, var146);
                            continue;
                        }
                        if (var607 == 3315) {
                            var2 -= 2;
                            int var147 = field3168[var2] + 32768;
                            int var148 = field3168[var2 + 1];
                            field3168[var2++] = class450.method2805(var148, var147, false);
                            continue;
                        }
                        if (var607 == 3316) {
                            if (class289.field4315 >= 2) {
                                field3168[var2++] = class289.field4315;
                            } else {
                                field3168[var2++] = 0;
                            }
                            continue;
                        }
                        if (var607 == 3317) {
                            field3168[var2++] = class234.field3387;
                            continue;
                        }
                        if (var607 == 3318) {
                            field3168[var2++] = class419.field6108;
                            continue;
                        }
                        if (var607 == 3321) {
                            field3168[var2++] = class324.field4665;
                            continue;
                        }
                        if (var607 == 3322) {
                            field3168[var2++] = class439.field6383;
                            continue;
                        }
                        if (var607 == 3323) {
                            if (class278.field4188 >= 5 && class278.field4188 <= 9) {
                                field3168[var2++] = 1;
                                continue;
                            }
                            field3168[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3324) {
                            if (class278.field4188 >= 5 && class278.field4188 <= 9) {
                                field3168[var2++] = class278.field4188;
                                continue;
                            }
                            field3168[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3325) {
                            field3168[var2++] = class389.field5581 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3326) {
                            field3168[var2++] = class86.field1394.field2065;
                            continue;
                        }
                        if (var607 == 3327) {
                            field3168[var2++] = class86.field1394.field2072.field2346 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3328) {
                            field3168[var2++] = class223.field3313 && !class36.field509 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3329) {
                            field3168[var2++] = class198.field2892 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3330) {
                            var2--;
                            int var149 = field3168[var2];
                            field3168[var2++] = class328.method2161(var149, (byte) -109);
                            continue;
                        }
                        if (var607 == 3331) {
                            var2 -= 2;
                            int var150 = field3168[var2];
                            int var151 = field3168[var2 + 1];
                            field3168[var2++] = class42.method347(-116, var151, false, var150);
                            continue;
                        }
                        if (var607 == 3332) {
                            var2 -= 2;
                            int var152 = field3168[var2];
                            int var153 = field3168[var2 + 1];
                            field3168[var2++] = class42.method347(-126, var153, true, var152);
                            continue;
                        }
                        if (var607 == 3333) {
                            field3168[var2++] = class106.field1752;
                            continue;
                        }
                        if (var607 == 3335) {
                            field3168[var2++] = class202.field2945;
                            continue;
                        }
                        if (var607 == 3336) {
                            var2 -= 4;
                            int var154 = field3168[var2];
                            int var155 = field3168[var2 + 1];
                            int var156 = field3168[var2 + 2];
                            int var157 = field3168[var2 + 3];
                            int var158 = (var155 << 14) + var154;
                            int var159 = (var156 << 28) + var158;
                            int var160 = var157 + var159;
                            field3168[var2++] = var160;
                            continue;
                        }
                        if (var607 == 3337) {
                            field3168[var2++] = class351.field4986;
                            continue;
                        }
                        if (var607 == 3338) {
                            field3168[var2++] = class110.method963((byte) -1);
                            continue;
                        }
                    } else if (var607 < 3500) {
                        if (var607 == 3400) {
                            var2 -= 2;
                            int var161 = field3168[var2];
                            int var162 = field3168[var2 + 1];
                            class269 var163 = class443.method2771(2048, var161);
                            field3172[var3++] = var163.method1924(var162, 6);
                            continue;
                        }
                        if (var607 == 3408) {
                            var2 -= 4;
                            int var164 = field3168[var2];
                            int var165 = field3168[var2 + 1];
                            int var166 = field3168[var2 + 2];
                            int var167 = field3168[var2 + 3];
                            class269 var168 = class443.method2771(2048, var166);
                            if (var168.field4038 == var164 && var168.field4029 == var165) {
                                if (var165 == 115) {
                                    field3172[var3++] = var168.method1924(var167, 6);
                                } else {
                                    field3168[var2++] = var168.method1918(var167, 126);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var607 == 3409) {
                            var2 -= 3;
                            int var169 = field3168[var2];
                            int var170 = field3168[var2 + 1];
                            int var171 = field3168[var2 + 2];
                            if (var170 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class269 var172 = class443.method2771(2048, var170);
                            if (var172.field4029 != var169) {
                                throw new RuntimeException("C3409-1");
                            }
                            field3168[var2++] = var172.method1921(true, var171) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3410) {
                            var2--;
                            int var173 = field3168[var2];
                            var3--;
                            String var174 = field3172[var3];
                            if (var173 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class269 var175 = class443.method2771(2048, var173);
                            if (var175.field4029 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            field3168[var2++] = var175.method1919(var174, 0) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3411) {
                            var2--;
                            int var176 = field3168[var2];
                            class269 var177 = class443.method2771(2048, var176);
                            field3168[var2++] = var177.field4040.method1225(-12198);
                            continue;
                        }
                    } else if (var607 < 3700) {
                        if (var607 == 3600) {
                            if (class277.field4171 == 0) {
                                field3168[var2++] = -2;
                            } else if (class277.field4171 == 1) {
                                field3168[var2++] = -1;
                            } else {
                                field3168[var2++] = class284.field4255;
                            }
                            continue;
                        }
                        if (var607 == 3601) {
                            var2--;
                            int var178 = field3168[var2];
                            if (class277.field4171 == 2 && var178 < class284.field4255) {
                                field3172[var3++] = class164.field2473[var178];
                                if (class307.field4484[var178] == null) {
                                    field3172[var3++] = "";
                                } else {
                                    field3172[var3++] = class307.field4484[var178];
                                }
                                continue;
                            }
                            field3172[var3++] = "";
                            field3172[var3++] = "";
                            continue;
                        }
                        if (var607 == 3602) {
                            var2--;
                            int var179 = field3168[var2];
                            if (class277.field4171 == 2 && var179 < class284.field4255) {
                                field3168[var2++] = class51.field821[var179];
                                continue;
                            }
                            field3168[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3603) {
                            var2--;
                            int var180 = field3168[var2];
                            if (class277.field4171 == 2 && var180 < class284.field4255) {
                                field3168[var2++] = class418.field6048[var180];
                                continue;
                            }
                            field3168[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3604) {
                            var3--;
                            String var181 = field3172[var3];
                            var2--;
                            int var182 = field3168[var2];
                            class359.method2304(var182, 1, var181);
                            continue;
                        }
                        if (var607 == 3605) {
                            var3--;
                            String var183 = field3172[var3];
                            class308.method2108(var183, (byte) -70);
                            continue;
                        }
                        if (var607 == 3606) {
                            var3--;
                            String var184 = field3172[var3];
                            class428.method2674((byte) 109, var184);
                            continue;
                        }
                        if (var607 == 3607) {
                            var3--;
                            String var185 = field3172[var3];
                            class358.method2294(false, -37, var185);
                            continue;
                        }
                        if (var607 == 3608) {
                            var3--;
                            String var186 = field3172[var3];
                            class23.method163(-1357113757, var186);
                            continue;
                        }
                        if (var607 == 3609) {
                            var3--;
                            String var187 = field3172[var3];
                            if (var187.startsWith("<img=0>") || var187.startsWith("<img=1>")) {
                                var187 = var187.substring(7);
                            }
                            field3168[var2++] = class110.method962(var187, 15) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3610) {
                            var2--;
                            int var188 = field3168[var2];
                            if (class277.field4171 == 2 && var188 < class284.field4255) {
                                field3172[var3++] = class27.field406[var188];
                                continue;
                            }
                            field3172[var3++] = "";
                            continue;
                        }
                        if (var607 == 3611) {
                            if (class320.field4634 == null) {
                                field3172[var3++] = "";
                            } else {
                                field3172[var3++] = class168.method1285(-26, class320.field4634);
                            }
                            continue;
                        }
                        if (var607 == 3612) {
                            if (class320.field4634 == null) {
                                field3168[var2++] = 0;
                            } else {
                                field3168[var2++] = class110.field1798;
                            }
                            continue;
                        }
                        if (var607 == 3613) {
                            var2--;
                            int var189 = field3168[var2];
                            if (class320.field4634 != null && var189 < class110.field1798) {
                                field3172[var3++] = class377.field5352[var189].field2242;
                                continue;
                            }
                            field3172[var3++] = "";
                            continue;
                        }
                        if (var607 == 3614) {
                            var2--;
                            int var190 = field3168[var2];
                            if (class320.field4634 != null && var190 < class110.field1798) {
                                field3168[var2++] = class377.field5352[var190].field2237;
                                continue;
                            }
                            field3168[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3615) {
                            var2--;
                            int var191 = field3168[var2];
                            if (class320.field4634 != null && var191 < class110.field1798) {
                                field3168[var2++] = class377.field5352[var191].field2239;
                                continue;
                            }
                            field3168[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3616) {
                            field3168[var2++] = class239.field3459;
                            continue;
                        }
                        if (var607 == 3617) {
                            var3--;
                            String var192 = field3172[var3];
                            class214.method1625((byte) -97, var192);
                            continue;
                        }
                        if (var607 == 3618) {
                            field3168[var2++] = class256.field3705;
                            continue;
                        }
                        if (var607 == 3619) {
                            var3--;
                            String var193 = field3172[var3];
                            class283.method2006(var193, 174);
                            continue;
                        }
                        if (var607 == 3620) {
                            class391.method2484((byte) 2);
                            continue;
                        }
                        if (var607 == 3621) {
                            if (class277.field4171 == 0) {
                                field3168[var2++] = -1;
                            } else {
                                field3168[var2++] = class119.field1866;
                            }
                            continue;
                        }
                        if (var607 == 3622) {
                            var2--;
                            int var194 = field3168[var2];
                            if (class277.field4171 != 0 && var194 < class119.field1866) {
                                field3172[var3++] = class443.field6438[var194];
                                if (class205.field3010[var194] == null) {
                                    field3172[var3++] = "";
                                } else {
                                    field3172[var3++] = class205.field3010[var194];
                                }
                                continue;
                            }
                            field3172[var3++] = "";
                            field3172[var3++] = "";
                            continue;
                        }
                        if (var607 == 3623) {
                            var3--;
                            String var195 = field3172[var3];
                            if (var195.startsWith("<img=0>") || var195.startsWith("<img=1>")) {
                                var195 = var195.substring(7);
                            }
                            field3168[var2++] = class285.method2014((byte) -127, var195) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3624) {
                            var2--;
                            int var196 = field3168[var2];
                            if (class377.field5352 != null && var196 < class110.field1798 && class377.field5352[var196].field2236.equalsIgnoreCase(class86.field1394.field2066)) {
                                field3168[var2++] = 1;
                                continue;
                            }
                            field3168[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3625) {
                            if (class209.field3051 == null) {
                                field3172[var3++] = "";
                            } else {
                                field3172[var3++] = class209.field3051;
                            }
                            continue;
                        }
                        if (var607 == 3626) {
                            var2--;
                            int var197 = field3168[var2];
                            if (class320.field4634 != null && var197 < class110.field1798) {
                                field3172[var3++] = class377.field5352[var197].field2240;
                                continue;
                            }
                            field3172[var3++] = "";
                            continue;
                        }
                        if (var607 == 3627) {
                            var2--;
                            int var198 = field3168[var2];
                            if (class277.field4171 == 2 && var198 >= 0 && var198 < class284.field4255) {
                                field3168[var2++] = class33.field478[var198] ? 1 : 0;
                                continue;
                            }
                            field3168[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3628) {
                            var3--;
                            String var199 = field3172[var3];
                            if (var199.startsWith("<img=0>") || var199.startsWith("<img=1>")) {
                                var199 = var199.substring(7);
                            }
                            field3168[var2++] = class46.method374((byte) -121, var199);
                            continue;
                        }
                        if (var607 == 3629) {
                            field3168[var2++] = class281.field4210;
                            continue;
                        }
                        if (var607 == 3630) {
                            var3--;
                            String var200 = field3172[var3];
                            class358.method2294(true, -127, var200);
                            continue;
                        }
                        if (var607 == 3631) {
                            var2--;
                            int var201 = field3168[var2];
                            field3168[var2++] = class420.field6121[var201] ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3632) {
                            var2--;
                            int var202 = field3168[var2];
                            if (class320.field4634 != null && var202 < class110.field1798) {
                                field3172[var3++] = class377.field5352[var202].field2236;
                                continue;
                            }
                            field3172[var3++] = "";
                            continue;
                        }
                        if (var607 == 3633) {
                            var2--;
                            int var203 = field3168[var2];
                            if (class277.field4171 != 0 && var203 < class119.field1866) {
                                field3172[var3++] = class390.field5636[var203];
                                continue;
                            }
                            field3172[var3++] = "";
                            continue;
                        }
                    } else if (var607 < 4000) {
                        if (var607 == 3903) {
                            var2--;
                            int var204 = field3168[var2];
                            field3168[var2++] = class192.field2834[var204].method1728((byte) 42);
                            continue;
                        }
                        if (var607 == 3904) {
                            var2--;
                            int var205 = field3168[var2];
                            field3168[var2++] = class192.field2834[var205].field3416;
                            continue;
                        }
                        if (var607 == 3905) {
                            var2--;
                            int var206 = field3168[var2];
                            field3168[var2++] = class192.field2834[var206].field3417;
                            continue;
                        }
                        if (var607 == 3906) {
                            var2--;
                            int var207 = field3168[var2];
                            field3168[var2++] = class192.field2834[var207].field3408;
                            continue;
                        }
                        if (var607 == 3907) {
                            var2--;
                            int var208 = field3168[var2];
                            field3168[var2++] = class192.field2834[var208].field3410;
                            continue;
                        }
                        if (var607 == 3908) {
                            var2--;
                            int var209 = field3168[var2];
                            field3168[var2++] = class192.field2834[var209].field3419;
                            continue;
                        }
                        if (var607 == 3910) {
                            var2--;
                            int var210 = field3168[var2];
                            int var211 = class192.field2834[var210].method1729((byte) -101);
                            field3168[var2++] = var211 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3911) {
                            var2--;
                            int var212 = field3168[var2];
                            int var213 = class192.field2834[var212].method1729((byte) -101);
                            field3168[var2++] = var213 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3912) {
                            var2--;
                            int var214 = field3168[var2];
                            int var215 = class192.field2834[var214].method1729((byte) -101);
                            field3168[var2++] = var215 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3913) {
                            var2--;
                            int var216 = field3168[var2];
                            int var217 = class192.field2834[var216].method1729((byte) -101);
                            field3168[var2++] = var217 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var607 < 4100) {
                        if (var607 == 4000) {
                            var2 -= 2;
                            int var218 = field3168[var2];
                            int var219 = field3168[var2 + 1];
                            field3168[var2++] = var218 + var219;
                            continue;
                        }
                        if (var607 == 4001) {
                            var2 -= 2;
                            int var220 = field3168[var2];
                            int var221 = field3168[var2 + 1];
                            field3168[var2++] = var220 - var221;
                            continue;
                        }
                        if (var607 == 4002) {
                            var2 -= 2;
                            int var222 = field3168[var2];
                            int var223 = field3168[var2 + 1];
                            field3168[var2++] = var222 * var223;
                            continue;
                        }
                        if (var607 == 4003) {
                            var2 -= 2;
                            int var224 = field3168[var2];
                            int var225 = field3168[var2 + 1];
                            field3168[var2++] = var224 / var225;
                            continue;
                        }
                        if (var607 == 4004) {
                            var2--;
                            int var226 = field3168[var2];
                            field3168[var2++] = (int) (Math.random() * (double) var226);
                            continue;
                        }
                        if (var607 == 4005) {
                            var2--;
                            int var227 = field3168[var2];
                            field3168[var2++] = (int) (Math.random() * (double) (var227 + 1));
                            continue;
                        }
                        if (var607 == 4006) {
                            var2 -= 5;
                            int var228 = field3168[var2];
                            int var229 = field3168[var2 + 1];
                            int var230 = field3168[var2 + 2];
                            int var231 = field3168[var2 + 3];
                            int var232 = field3168[var2 + 4];
                            field3168[var2++] = (var229 - var228) * (var232 - var230) / (var231 - var230) + var228;
                            continue;
                        }
                        if (var607 == 4007) {
                            var2 -= 2;
                            long var233 = (long) field3168[var2];
                            long var235 = (long) field3168[var2 + 1];
                            field3168[var2++] = (int) (var233 * var235 / 100L + var233);
                            continue;
                        }
                        if (var607 == 4008) {
                            var2 -= 2;
                            int var237 = field3168[var2];
                            int var238 = field3168[var2 + 1];
                            field3168[var2++] = var237 | 0x1 << var238;
                            continue;
                        }
                        if (var607 == 4009) {
                            var2 -= 2;
                            int var239 = field3168[var2];
                            int var240 = field3168[var2 + 1];
                            field3168[var2++] = var239 & -(0x1 << var240) - 1;
                            continue;
                        }
                        if (var607 == 4010) {
                            var2 -= 2;
                            int var241 = field3168[var2];
                            int var242 = field3168[var2 + 1];
                            field3168[var2++] = (var241 & 0x1 << var242) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var607 == 4011) {
                            var2 -= 2;
                            int var243 = field3168[var2];
                            int var244 = field3168[var2 + 1];
                            field3168[var2++] = var243 % var244;
                            continue;
                        }
                        if (var607 == 4012) {
                            var2 -= 2;
                            int var245 = field3168[var2];
                            int var246 = field3168[var2 + 1];
                            if (var245 == 0) {
                                field3168[var2++] = 0;
                            } else {
                                field3168[var2++] = (int) Math.pow((double) var245, (double) var246);
                            }
                            continue;
                        }
                        if (var607 == 4013) {
                            var2 -= 2;
                            int var247 = field3168[var2];
                            int var248 = field3168[var2 + 1];
                            if (var247 == 0) {
                                field3168[var2++] = 0;
                            } else if (var248 == 0) {
                                field3168[var2++] = Integer.MAX_VALUE;
                            } else {
                                field3168[var2++] = (int) Math.pow((double) var247, 1.0D / (double) var248);
                            }
                            continue;
                        }
                        if (var607 == 4014) {
                            var2 -= 2;
                            int var249 = field3168[var2];
                            int var250 = field3168[var2 + 1];
                            field3168[var2++] = var249 & var250;
                            continue;
                        }
                        if (var607 == 4015) {
                            var2 -= 2;
                            int var251 = field3168[var2];
                            int var252 = field3168[var2 + 1];
                            field3168[var2++] = var251 | var252;
                            continue;
                        }
                        if (var607 == 4016) {
                            var2 -= 2;
                            int var253 = field3168[var2];
                            int var254 = field3168[var2 + 1];
                            field3168[var2++] = var253 < var254 ? var253 : var254;
                            continue;
                        }
                        if (var607 == 4017) {
                            var2 -= 2;
                            int var255 = field3168[var2];
                            int var256 = field3168[var2 + 1];
                            field3168[var2++] = var255 > var256 ? var255 : var256;
                            continue;
                        }
                        if (var607 == 4018) {
                            var2 -= 3;
                            long var257 = (long) field3168[var2];
                            long var259 = (long) field3168[var2 + 1];
                            long var261 = (long) field3168[var2 + 2];
                            field3168[var2++] = (int) (var257 * var261 / var259);
                            continue;
                        }
                    } else if (var607 < 4200) {
                        if (var607 == 4100) {
                            var3--;
                            String var263 = field3172[var3];
                            var2--;
                            int var264 = field3168[var2];
                            field3172[var3++] = var263 + var264;
                            continue;
                        }
                        if (var607 == 4101) {
                            var3 -= 2;
                            String var265 = field3172[var3];
                            String var266 = field3172[var3 + 1];
                            field3172[var3++] = var265 + var266;
                            continue;
                        }
                        if (var607 == 4102) {
                            var3--;
                            String var267 = field3172[var3];
                            var2--;
                            int var268 = field3168[var2];
                            field3172[var3++] = var267 + class90.method669(var268, true, 105);
                            continue;
                        }
                        if (var607 == 4103) {
                            var3--;
                            String var269 = field3172[var3];
                            field3172[var3++] = var269.toLowerCase();
                            continue;
                        }
                        if (var607 == 4104) {
                            var2--;
                            int var270 = field3168[var2];
                            long var271 = ((long) var270 + 11745L) * 86400000L;
                            field3182.setTime(new Date(var271));
                            int var273 = field3182.get(5);
                            int var274 = field3182.get(2);
                            int var275 = field3182.get(1);
                            field3172[var3++] = var273 + "-" + field3191[var274] + "-" + var275;
                            continue;
                        }
                        if (var607 == 4105) {
                            var3 -= 2;
                            String var276 = field3172[var3];
                            String var277 = field3172[var3 + 1];
                            if (class86.field1394.field2072 != null && class86.field1394.field2072.field2346) {
                                field3172[var3++] = var277;
                                continue;
                            }
                            field3172[var3++] = var276;
                            continue;
                        }
                        if (var607 == 4106) {
                            var2--;
                            int var278 = field3168[var2];
                            field3172[var3++] = Integer.toString(var278);
                            continue;
                        }
                        if (var607 == 4107) {
                            var3 -= 2;
                            field3168[var2++] = class180.method1405(field3172[var3], true, class202.field2945, field3172[var3 + 1]);
                            continue;
                        }
                        if (var607 == 4108) {
                            var3--;
                            String var279 = field3172[var3];
                            var2 -= 2;
                            int var280 = field3168[var2];
                            int var281 = field3168[var2 + 1];
                            class186 var282 = class110.method961(54, var281, class275.field4139, 0);
                            field3168[var2++] = var282.method1439(class171.field2548, var280, var279, true);
                            continue;
                        }
                        if (var607 == 4109) {
                            var3--;
                            String var283 = field3172[var3];
                            var2 -= 2;
                            int var284 = field3168[var2];
                            int var285 = field3168[var2 + 1];
                            class186 var286 = class110.method961(78, var285, class275.field4139, 0);
                            field3168[var2++] = var286.method1443(var283, class171.field2548, (byte) 105, var284);
                            continue;
                        }
                        if (var607 == 4110) {
                            var3 -= 2;
                            String var287 = field3172[var3];
                            String var288 = field3172[var3 + 1];
                            var2--;
                            if (field3168[var2] == 1) {
                                field3172[var3++] = var287;
                            } else {
                                field3172[var3++] = var288;
                            }
                            continue;
                        }
                        if (var607 == 4111) {
                            var3--;
                            String var289 = field3172[var3];
                            field3172[var3++] = class164.method1270(0, var289);
                            continue;
                        }
                        if (var607 == 4112) {
                            var3--;
                            String var290 = field3172[var3];
                            var2--;
                            int var291 = field3168[var2];
                            if (var291 == -1) {
                                throw new RuntimeException("null char");
                            }
                            field3172[var3++] = var290 + (char) var291;
                            continue;
                        }
                        if (var607 == 4113) {
                            var2--;
                            int var292 = field3168[var2];
                            field3168[var2++] = class439.method2742(1, (char) var292) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 4114) {
                            var2--;
                            int var293 = field3168[var2];
                            field3168[var2++] = class153.method1184((char) var293, 7) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 4115) {
                            var2--;
                            int var294 = field3168[var2];
                            field3168[var2++] = class256.method1848((char) var294, (byte) 59) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 4116) {
                            var2--;
                            int var295 = field3168[var2];
                            field3168[var2++] = class423.method2657((char) var295, (byte) 19) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 4117) {
                            var3--;
                            String var296 = field3172[var3];
                            if (var296 == null) {
                                field3168[var2++] = 0;
                            } else {
                                field3168[var2++] = var296.length();
                            }
                            continue;
                        }
                        if (var607 == 4118) {
                            var3--;
                            String var297 = field3172[var3];
                            var2 -= 2;
                            int var298 = field3168[var2];
                            int var299 = field3168[var2 + 1];
                            field3172[var3++] = var297.substring(var298, var299);
                            continue;
                        }
                        if (var607 == 4119) {
                            var3--;
                            String var300 = field3172[var3];
                            StringBuffer var301 = new StringBuffer(var300.length());
                            boolean var302 = false;
                            for (int var303 = 0; var303 < var300.length(); var303++) {
                                char var304 = var300.charAt(var303);
                                if (var304 == '<') {
                                    var302 = true;
                                } else if (var304 == '>') {
                                    var302 = false;
                                } else if (!var302) {
                                    var301.append(var304);
                                }
                            }
                            field3172[var3++] = var301.toString();
                            continue;
                        }
                        if (var607 == 4120) {
                            var3--;
                            String var305 = field3172[var3];
                            var2 -= 2;
                            int var306 = field3168[var2];
                            int var307 = field3168[var2 + 1];
                            field3168[var2++] = var305.indexOf(var306, var307);
                            continue;
                        }
                        if (var607 == 4121) {
                            var3 -= 2;
                            String var308 = field3172[var3];
                            String var309 = field3172[var3 + 1];
                            var2--;
                            int var310 = field3168[var2];
                            field3168[var2++] = var308.indexOf(var309, var310);
                            continue;
                        }
                        if (var607 == 4122) {
                            var2--;
                            int var311 = field3168[var2];
                            field3168[var2++] = Character.toLowerCase((char) var311);
                            continue;
                        }
                        if (var607 == 4123) {
                            var2--;
                            int var312 = field3168[var2];
                            field3168[var2++] = Character.toUpperCase((char) var312);
                            continue;
                        }
                        if (var607 == 4124) {
                            var2--;
                            boolean var313 = field3168[var2] != 0;
                            var2--;
                            int var314 = field3168[var2];
                            field3172[var3++] = class333.method2178((long) var314, var313, (byte) 21, class202.field2945, 0);
                            continue;
                        }
                    } else if (var607 < 4300) {
                        if (var607 == 4200) {
                            var2--;
                            int var315 = field3168[var2];
                            field3172[var3++] = class206.method1561(-66, var315).field1999;
                            continue;
                        }
                        if (var607 == 4201) {
                            var2 -= 2;
                            int var316 = field3168[var2];
                            int var317 = field3168[var2 + 1];
                            class124 var318 = class206.method1561(-60, var316);
                            if (var317 >= 1 && var317 <= 5 && var318.field2024[var317 - 1] != null) {
                                field3172[var3++] = var318.field2024[var317 - 1];
                                continue;
                            }
                            field3172[var3++] = "";
                            continue;
                        }
                        if (var607 == 4202) {
                            var2 -= 2;
                            int var319 = field3168[var2];
                            int var320 = field3168[var2 + 1];
                            class124 var321 = class206.method1561(-124, var319);
                            if (var320 >= 1 && var320 <= 5 && var321.field1996[var320 - 1] != null) {
                                field3172[var3++] = var321.field1996[var320 - 1];
                                continue;
                            }
                            field3172[var3++] = "";
                            continue;
                        }
                        if (var607 == 4203) {
                            var2--;
                            int var322 = field3168[var2];
                            field3168[var2++] = class206.method1561(-127, var322).field1987;
                            continue;
                        }
                        if (var607 == 4204) {
                            var2--;
                            int var323 = field3168[var2];
                            field3168[var2++] = class206.method1561(88, var323).field2032 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 4205) {
                            var2--;
                            int var324 = field3168[var2];
                            class124 var325 = class206.method1561(-119, var324);
                            if (var325.field1957 == -1 && var325.field1973 >= 0) {
                                field3168[var2++] = var325.field1973;
                                continue;
                            }
                            field3168[var2++] = var324;
                            continue;
                        }
                        if (var607 == 4206) {
                            var2--;
                            int var326 = field3168[var2];
                            class124 var327 = class206.method1561(-41, var326);
                            if (var327.field1957 >= 0 && var327.field1973 >= 0) {
                                field3168[var2++] = var327.field1973;
                                continue;
                            }
                            field3168[var2++] = var326;
                            continue;
                        }
                        if (var607 == 4207) {
                            var2--;
                            int var328 = field3168[var2];
                            field3168[var2++] = class206.method1561(94, var328).field2001 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 4208) {
                            var2 -= 2;
                            int var329 = field3168[var2];
                            int var330 = field3168[var2 + 1];
                            class413 var331 = class392.method2497(var330, 0);
                            if (var331.method2594((byte) -120)) {
                                field3172[var3++] = class206.method1561(86, var329).method1052(95, var330, var331.field5994);
                            } else {
                                field3168[var2++] = class206.method1561(123, var329).method1049(var330, var331.field5993, false);
                            }
                            continue;
                        }
                        if (var607 == 4210) {
                            var3--;
                            String var332 = field3172[var3];
                            var2--;
                            int var333 = field3168[var2];
                            class336.method2188((byte) -102, var333 == 1, var332);
                            field3168[var2++] = class384.field5515;
                            continue;
                        }
                        if (var607 == 4211) {
                            if (class380.field5385 != null && class279.field4190 < class384.field5515) {
                                field3168[var2++] = class380.field5385[class279.field4190++] & 0xFFFF;
                                continue;
                            }
                            field3168[var2++] = -1;
                            continue;
                        }
                        if (var607 == 4212) {
                            class279.field4190 = 0;
                            continue;
                        }
                    } else if (var607 < 4400) {
                        if (var607 == 4300) {
                            var2 -= 2;
                            int var334 = field3168[var2];
                            int var335 = field3168[var2 + 1];
                            class413 var336 = class392.method2497(var335, 0);
                            if (var336.method2594((byte) -111)) {
                                field3172[var3++] = class371.method2357(var334, -13299).method67(var336.field5994, -1, var335);
                            } else {
                                field3168[var2++] = class371.method2357(var334, -13299).method73(var335, var336.field5993, -115);
                            }
                            continue;
                        }
                    } else if (var607 < 4500) {
                        if (var607 == 4400) {
                            var2 -= 2;
                            int var337 = field3168[var2];
                            int var338 = field3168[var2 + 1];
                            class413 var339 = class392.method2497(var338, 0);
                            if (var339.method2594((byte) -121)) {
                                field3172[var3++] = class451.method2812(97, var337).method372((byte) 88, var338, var339.field5994);
                            } else {
                                field3168[var2++] = class451.method2812(118, var337).method363(var338, var339.field5993, (byte) -106);
                            }
                            continue;
                        }
                    } else if (var607 < 4600) {
                        if (var607 == 4500) {
                            var2 -= 2;
                            int var340 = field3168[var2];
                            int var341 = field3168[var2 + 1];
                            class413 var342 = class392.method2497(var341, 0);
                            if (var342.method2594((byte) -116)) {
                                field3172[var3++] = class228.method1705((byte) -59, var340).method1828(var342.field5994, false, var341);
                            } else {
                                field3168[var2++] = class228.method1705((byte) -81, var340).method1830(var342.field5993, var341, 127);
                            }
                            continue;
                        }
                    } else if (var607 < 4700) {
                        if (var607 == 4600) {
                            var2--;
                            int var343 = field3168[var2];
                            field3168[var2++] = class248.method1789((byte) 111, var343).field6089;
                            continue;
                        }
                    } else if (var607 < 5100) {
                        if (var607 == 5000) {
                            field3168[var2++] = class26.field391;
                            continue;
                        }
                        if (var607 == 5001) {
                            var2 -= 3;
                            class26.field391 = field3168[var2];
                            class83.field1362 = field3168[var2 + 1];
                            class451.field6544 = field3168[var2 + 2];
                            field3185++;
                            class13.field216.method2781(false, 96);
                            class13.field216.method267(class26.field391, false);
                            class13.field216.method267(class83.field1362, false);
                            class13.field216.method267(class451.field6544, false);
                            continue;
                        }
                        if (var607 == 5002) {
                            var3--;
                            String var344 = field3172[var3];
                            var2 -= 2;
                            int var345 = field3168[var2];
                            int var346 = field3168[var2 + 1];
                            field3184++;
                            class13.field216.method2781(false, 175);
                            class13.field216.method267(class429.method2677(var344, 1) + 2, false);
                            class13.field216.method265((byte) -127, var344);
                            class13.field216.method267(var345 - 1, false);
                            class13.field216.method267(var346, false);
                            continue;
                        }
                        if (var607 == 5003) {
                            var2--;
                            int var347 = field3168[var2];
                            String var348 = null;
                            if (var347 < 100) {
                                var348 = class282.field4231[var347];
                            }
                            if (var348 == null) {
                                var348 = "";
                            }
                            field3172[var3++] = var348;
                            continue;
                        }
                        if (var607 == 5004) {
                            var2--;
                            int var349 = field3168[var2];
                            int var350 = -1;
                            if (var349 < 100 && class282.field4231[var349] != null) {
                                var350 = class293.field4356[var349];
                            }
                            field3168[var2++] = var350;
                            continue;
                        }
                        if (var607 == 5005) {
                            field3168[var2++] = class83.field1362;
                            continue;
                        }
                        if (var607 == 5008) {
                            var3--;
                            String var351 = field3172[var3];
                            if (class289.field4315 == 0 && (class223.field3313 && !class36.field509 || class198.field2892)) {
                                continue;
                            }
                            String var352 = var351.toLowerCase();
                            byte var353 = 0;
                            if (var352.startsWith(class186.field2746)) {
                                var353 = 0;
                                var351 = var351.substring(class186.field2746.length());
                            } else if (var352.startsWith(class42.field636)) {
                                var353 = 1;
                                var351 = var351.substring(class42.field636.length());
                            } else if (var352.startsWith(class390.field5682)) {
                                var353 = 2;
                                var351 = var351.substring(class390.field5682.length());
                            } else if (var352.startsWith(class315.field4590)) {
                                var353 = 3;
                                var351 = var351.substring(class315.field4590.length());
                            } else if (var352.startsWith(class297.field4397)) {
                                var353 = 4;
                                var351 = var351.substring(class297.field4397.length());
                            } else if (var352.startsWith(class380.field5394)) {
                                var353 = 5;
                                var351 = var351.substring(class380.field5394.length());
                            } else if (var352.startsWith(class388.field5568)) {
                                var353 = 6;
                                var351 = var351.substring(class388.field5568.length());
                            } else if (var352.startsWith(class15.field230)) {
                                var353 = 7;
                                var351 = var351.substring(class15.field230.length());
                            } else if (var352.startsWith(class236.field3401)) {
                                var353 = 8;
                                var351 = var351.substring(class236.field3401.length());
                            } else if (var352.startsWith(class365.field5195)) {
                                var353 = 9;
                                var351 = var351.substring(class365.field5195.length());
                            } else if (var352.startsWith(class284.field4254)) {
                                var353 = 10;
                                var351 = var351.substring(class284.field4254.length());
                            } else if (var352.startsWith(class289.field4311)) {
                                var353 = 11;
                                var351 = var351.substring(class289.field4311.length());
                            } else if (class202.field2945 != 0) {
                                if (var352.startsWith(class252.field3634)) {
                                    var353 = 0;
                                    var351 = var351.substring(class252.field3634.length());
                                } else if (var352.startsWith(class23.field354)) {
                                    var353 = 1;
                                    var351 = var351.substring(class23.field354.length());
                                } else if (var352.startsWith(class379.field5382)) {
                                    var353 = 2;
                                    var351 = var351.substring(class379.field5382.length());
                                } else if (var352.startsWith(class398.field5860)) {
                                    var353 = 3;
                                    var351 = var351.substring(class398.field5860.length());
                                } else if (var352.startsWith(class109.field1777)) {
                                    var353 = 4;
                                    var351 = var351.substring(class109.field1777.length());
                                } else if (var352.startsWith(class432.field6225)) {
                                    var353 = 5;
                                    var351 = var351.substring(class432.field6225.length());
                                } else if (var352.startsWith(class365.field5196)) {
                                    var353 = 6;
                                    var351 = var351.substring(class365.field5196.length());
                                } else if (var352.startsWith(class333.field4778)) {
                                    var353 = 7;
                                    var351 = var351.substring(class333.field4778.length());
                                } else if (var352.startsWith(class98.field1533)) {
                                    var353 = 8;
                                    var351 = var351.substring(class98.field1533.length());
                                } else if (var352.startsWith(class30.field445)) {
                                    var353 = 9;
                                    var351 = var351.substring(class30.field445.length());
                                } else if (var352.startsWith(class376.field5329)) {
                                    var353 = 10;
                                    var351 = var351.substring(class376.field5329.length());
                                } else if (var352.startsWith(class148.field2283)) {
                                    var353 = 11;
                                    var351 = var351.substring(class148.field2283.length());
                                }
                            }
                            String var354 = var351.toLowerCase();
                            byte var355 = 0;
                            if (var354.startsWith(class122.field1922)) {
                                var355 = 1;
                                var351 = var351.substring(class122.field1922.length());
                            } else if (var354.startsWith(class270.field4062)) {
                                var355 = 2;
                                var351 = var351.substring(class270.field4062.length());
                            } else if (var354.startsWith(class265.field3981)) {
                                var355 = 3;
                                var351 = var351.substring(class265.field3981.length());
                            } else if (var354.startsWith(class408.field5944)) {
                                var355 = 4;
                                var351 = var351.substring(class408.field5944.length());
                            } else if (var354.startsWith(class302.field4414)) {
                                var355 = 5;
                                var351 = var351.substring(class302.field4414.length());
                            } else if (class202.field2945 != 0) {
                                if (var354.startsWith(class451.field6560)) {
                                    var355 = 1;
                                    var351 = var351.substring(class451.field6560.length());
                                } else if (var354.startsWith(class275.field4145)) {
                                    var355 = 2;
                                    var351 = var351.substring(class275.field4145.length());
                                } else if (var354.startsWith(class135.field2166)) {
                                    var355 = 3;
                                    var351 = var351.substring(class135.field2166.length());
                                } else if (var354.startsWith(class39.field610)) {
                                    var355 = 4;
                                    var351 = var351.substring(class39.field610.length());
                                } else if (var354.startsWith(class100.field1564)) {
                                    var355 = 5;
                                    var351 = var351.substring(class100.field1564.length());
                                }
                            }
                            field3188++;
                            class13.field216.method2781(false, 80);
                            class13.field216.method267(0, false);
                            int var356 = class13.field216.field565;
                            class13.field216.method267(var353, false);
                            class13.field216.method267(var355, false);
                            class79.method623(var351, class13.field216, (byte) -61);
                            class13.field216.method287(class13.field216.field565 - var356, -72);
                            continue;
                        }
                        if (var607 == 5009) {
                            var3 -= 2;
                            String var357 = field3172[var3];
                            String var358 = field3172[var3 + 1];
                            if (class289.field4315 != 0 || (!class223.field3313 || class36.field509) && !class198.field2892) {
                                field3183++;
                                class13.field216.method2781(false, 136);
                                class13.field216.method267(0, false);
                                int var359 = class13.field216.field565;
                                class13.field216.method265((byte) -74, var357);
                                class79.method623(var358, class13.field216, (byte) -61);
                                class13.field216.method287(class13.field216.field565 - var359, -39);
                            }
                            continue;
                        }
                        if (var607 == 5010) {
                            var2--;
                            int var360 = field3168[var2];
                            String var361 = null;
                            if (var360 < 100) {
                                var361 = class452.field6562[var360];
                            }
                            if (var361 == null) {
                                var361 = "";
                            }
                            field3172[var3++] = var361;
                            continue;
                        }
                        if (var607 == 5011) {
                            var2--;
                            int var362 = field3168[var2];
                            String var363 = null;
                            if (var362 < 100) {
                                var363 = class333.field4779[var362];
                            }
                            if (var363 == null) {
                                var363 = "";
                            }
                            field3172[var3++] = var363;
                            continue;
                        }
                        if (var607 == 5012) {
                            var2--;
                            int var364 = field3168[var2];
                            int var365 = -1;
                            if (var364 < 100) {
                                var365 = class72.field1204[var364];
                            }
                            field3168[var2++] = var365;
                            continue;
                        }
                        if (var607 == 5015) {
                            String var366;
                            if (class86.field1394 == null || class86.field1394.field2061 == null) {
                                var366 = class441.field6409;
                            } else {
                                var366 = class86.field1394.method1074(true, (byte) 84);
                            }
                            field3172[var3++] = var366;
                            continue;
                        }
                        if (var607 == 5016) {
                            field3168[var2++] = class451.field6544;
                            continue;
                        }
                        if (var607 == 5017) {
                            field3168[var2++] = class47.field762;
                            continue;
                        }
                        if (var607 == 5018) {
                            var2--;
                            int var367 = field3168[var2];
                            int var368 = 0;
                            if (var367 < 100 && class282.field4231[var367] != null) {
                                var368 = class293.field4356[var367];
                            }
                            field3168[var2++] = var368;
                            continue;
                        }
                        if (var607 == 5019) {
                            var2--;
                            int var369 = field3168[var2];
                            String var370 = null;
                            if (var369 < 100) {
                                var370 = class99.field1550[var369];
                            }
                            if (var370 == null) {
                                var370 = "";
                            }
                            field3172[var3++] = var370;
                            continue;
                        }
                        if (var607 == 5020) {
                            String var371;
                            if (class86.field1394 == null || class86.field1394.field2061 == null) {
                                var371 = class441.field6409;
                            } else {
                                var371 = class86.field1394.method1077(false, 0);
                            }
                            field3172[var3++] = var371;
                            continue;
                        }
                        if (var607 == 5050) {
                            var2--;
                            int var372 = field3168[var2];
                            field3172[var3++] = class289.method2033(0, var372).field2448;
                            continue;
                        }
                        if (var607 == 5051) {
                            var2--;
                            int var373 = field3168[var2];
                            class161 var374 = class289.method2033(0, var373);
                            if (var374.field2443 == null) {
                                field3168[var2++] = 0;
                            } else {
                                field3168[var2++] = var374.field2443.length;
                            }
                            continue;
                        }
                        if (var607 == 5052) {
                            var2 -= 2;
                            int var375 = field3168[var2];
                            int var376 = field3168[var2 + 1];
                            class161 var377 = class289.method2033(0, var375);
                            int var378 = var377.field2443[var376];
                            field3168[var2++] = var378;
                            continue;
                        }
                        if (var607 == 5053) {
                            var2--;
                            int var379 = field3168[var2];
                            class161 var380 = class289.method2033(0, var379);
                            if (var380.field2449 == null) {
                                field3168[var2++] = 0;
                            } else {
                                field3168[var2++] = var380.field2449.length;
                            }
                            continue;
                        }
                        if (var607 == 5054) {
                            var2 -= 2;
                            int var381 = field3168[var2];
                            int var382 = field3168[var2 + 1];
                            field3168[var2++] = class289.method2033(0, var381).field2449[var382];
                            continue;
                        }
                        if (var607 == 5055) {
                            var2--;
                            int var383 = field3168[var2];
                            field3172[var3++] = class56.method439(var383, true).method1306(88);
                            continue;
                        }
                        if (var607 == 5056) {
                            var2--;
                            int var384 = field3168[var2];
                            class170 var385 = class56.method439(var384, true);
                            if (var385.field2539 == null) {
                                field3168[var2++] = 0;
                            } else {
                                field3168[var2++] = var385.field2539.length;
                            }
                            continue;
                        }
                        if (var607 == 5057) {
                            var2 -= 2;
                            int var386 = field3168[var2];
                            int var387 = field3168[var2 + 1];
                            field3168[var2++] = class56.method439(var386, true).field2539[var387];
                            continue;
                        }
                        if (var607 == 5058) {
                            field3177 = new class265();
                            var2--;
                            field3177.field3984 = field3168[var2];
                            field3177.field3978 = class56.method439(field3177.field3984, true);
                            field3177.field3986 = new int[field3177.field3978.method1303((byte) -116)];
                            continue;
                        }
                        if (var607 == 5059) {
                            field3180++;
                            class13.field216.method2781(false, 215);
                            class13.field216.method267(0, false);
                            int var388 = class13.field216.field565;
                            class13.field216.method267(0, false);
                            class13.field216.method324(field3177.field3984, -25);
                            field3177.field3978.method1300(class13.field216, -184, field3177.field3986);
                            class13.field216.method287(class13.field216.field565 - var388, -91);
                            continue;
                        }
                        if (var607 == 5060) {
                            var3--;
                            String var389 = field3172[var3];
                            field3186++;
                            class13.field216.method2781(false, 228);
                            class13.field216.method267(0, false);
                            int var390 = class13.field216.field565;
                            class13.field216.method265((byte) -75, var389);
                            class13.field216.method324(field3177.field3984, -83);
                            field3177.field3978.method1300(class13.field216, -184, field3177.field3986);
                            class13.field216.method287(class13.field216.field565 - var390, -65);
                            continue;
                        }
                        if (var607 == 5061) {
                            field3180++;
                            class13.field216.method2781(false, 215);
                            class13.field216.method267(0, false);
                            int var391 = class13.field216.field565;
                            class13.field216.method267(1, false);
                            class13.field216.method324(field3177.field3984, -47);
                            field3177.field3978.method1300(class13.field216, -184, field3177.field3986);
                            class13.field216.method287(class13.field216.field565 - var391, -123);
                            continue;
                        }
                        if (var607 == 5062) {
                            var2 -= 2;
                            int var392 = field3168[var2];
                            int var393 = field3168[var2 + 1];
                            field3168[var2++] = class289.method2033(0, var392).field2437[var393];
                            continue;
                        }
                        if (var607 == 5063) {
                            var2 -= 2;
                            int var394 = field3168[var2];
                            int var395 = field3168[var2 + 1];
                            field3168[var2++] = class289.method2033(0, var394).field2441[var395];
                            continue;
                        }
                        if (var607 == 5064) {
                            var2 -= 2;
                            int var396 = field3168[var2];
                            int var397 = field3168[var2 + 1];
                            if (var397 == -1) {
                                field3168[var2++] = -1;
                            } else {
                                field3168[var2++] = class289.method2033(0, var396).method1257(false, (char) var397);
                            }
                            continue;
                        }
                        if (var607 == 5065) {
                            var2 -= 2;
                            int var398 = field3168[var2];
                            int var399 = field3168[var2 + 1];
                            if (var399 == -1) {
                                field3168[var2++] = -1;
                            } else {
                                field3168[var2++] = class289.method2033(0, var398).method1263(-1, (char) var399);
                            }
                            continue;
                        }
                        if (var607 == 5066) {
                            var2--;
                            int var400 = field3168[var2];
                            field3168[var2++] = class56.method439(var400, true).method1303((byte) 66);
                            continue;
                        }
                        if (var607 == 5067) {
                            var2 -= 2;
                            int var401 = field3168[var2];
                            int var402 = field3168[var2 + 1];
                            int var403 = class56.method439(var401, true).method1304(var402, -1);
                            field3168[var2++] = var403;
                            continue;
                        }
                        if (var607 == 5068) {
                            var2 -= 2;
                            int var404 = field3168[var2];
                            int var405 = field3168[var2 + 1];
                            field3177.field3986[var404] = var405;
                            continue;
                        }
                        if (var607 == 5069) {
                            var2 -= 2;
                            int var406 = field3168[var2];
                            int var407 = field3168[var2 + 1];
                            field3177.field3986[var406] = var407;
                            continue;
                        }
                        if (var607 == 5070) {
                            var2 -= 3;
                            int var408 = field3168[var2];
                            int var409 = field3168[var2 + 1];
                            int var410 = field3168[var2 + 2];
                            class170 var411 = class56.method439(var408, true);
                            if (var411.method1304(var409, -1) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            field3168[var2++] = var411.method1293(var410, var409, (byte) -124);
                            continue;
                        }
                        if (var607 == 5071) {
                            var3--;
                            String var412 = field3172[var3];
                            var2--;
                            boolean var413 = field3168[var2] == 1;
                            class13.method87(var413, -95, var412);
                            field3168[var2++] = class384.field5515;
                            continue;
                        }
                        if (var607 == 5072) {
                            if (class380.field5385 != null && class279.field4190 < class384.field5515) {
                                field3168[var2++] = class380.field5385[class279.field4190++] & 0xFFFF;
                                continue;
                            }
                            field3168[var2++] = -1;
                            continue;
                        }
                        if (var607 == 5073) {
                            class279.field4190 = 0;
                            continue;
                        }
                    } else if (var607 < 5200) {
                        if (var607 == 5100) {
                            if (class33.field482[86]) {
                                field3168[var2++] = 1;
                            } else {
                                field3168[var2++] = 0;
                            }
                            continue;
                        }
                        if (var607 == 5101) {
                            if (class33.field482[82]) {
                                field3168[var2++] = 1;
                            } else {
                                field3168[var2++] = 0;
                            }
                            continue;
                        }
                        if (var607 == 5102) {
                            if (class33.field482[81]) {
                                field3168[var2++] = 1;
                            } else {
                                field3168[var2++] = 0;
                            }
                            continue;
                        }
                    } else if (var607 < 5300) {
                        if (var607 == 5200) {
                            var2--;
                            class418.method2623(field3168[var2], (byte) 35);
                            continue;
                        }
                        if (var607 == 5201) {
                            field3168[var2++] = class332.method2176(false);
                            continue;
                        }
                        if (var607 == 5205) {
                            var2--;
                            class324.method2150((byte) -88, false, field3168[var2], -1, -1);
                            continue;
                        }
                        if (var607 == 5206) {
                            var2--;
                            int var414 = field3168[var2];
                            class294 var415 = class272.method1934(var414 >> 14 & 0x3FFF, var414 & 0x3FFF);
                            if (var415 == null) {
                                field3168[var2++] = -1;
                            } else {
                                field3168[var2++] = var415.field4365;
                            }
                            continue;
                        }
                        if (var607 == 5207) {
                            var2--;
                            class294 var416 = class272.method1943(field3168[var2]);
                            if (var416 != null && var416.field4364 != null) {
                                field3172[var3++] = var416.field4364;
                                continue;
                            }
                            field3172[var3++] = "";
                            continue;
                        }
                        if (var607 == 5208) {
                            field3168[var2++] = class51.field820;
                            field3168[var2++] = class441.field6407;
                            continue;
                        }
                        if (var607 == 5209) {
                            field3168[var2++] = class272.field4096 + class110.field1797;
                            field3168[var2++] = class373.field5295 + class272.field4088;
                            continue;
                        }
                        if (var607 == 5210) {
                            var2--;
                            int var417 = field3168[var2];
                            class294 var418 = class272.method1943(var417);
                            if (var418 == null) {
                                field3168[var2++] = 0;
                                field3168[var2++] = 0;
                            } else {
                                field3168[var2++] = var418.field4361 >> 14 & 0x3FFF;
                                field3168[var2++] = var418.field4361 & 0x3FFF;
                            }
                            continue;
                        }
                        if (var607 == 5211) {
                            var2--;
                            int var419 = field3168[var2];
                            class294 var420 = class272.method1943(var419);
                            if (var420 == null) {
                                field3168[var2++] = 0;
                                field3168[var2++] = 0;
                            } else {
                                field3168[var2++] = var420.field4367 - var420.field4370;
                                field3168[var2++] = var420.field4359 - var420.field4357;
                            }
                            continue;
                        }
                        if (var607 == 5212) {
                            class198 var421 = class39.method335((byte) 4);
                            if (var421 == null) {
                                field3168[var2++] = -1;
                                field3168[var2++] = -1;
                            } else {
                                field3168[var2++] = var421.field2883;
                                int var422 = var421.field2887 << 28 | class272.field4096 + var421.field2896 << 14 | class272.field4088 + var421.field2900;
                                field3168[var2++] = var422;
                            }
                            continue;
                        }
                        if (var607 == 5213) {
                            class198 var423 = class126.method1064((byte) 82);
                            if (var423 == null) {
                                field3168[var2++] = -1;
                                field3168[var2++] = -1;
                            } else {
                                field3168[var2++] = var423.field2883;
                                int var424 = var423.field2887 << 28 | class272.field4096 + var423.field2896 << 14 | class272.field4088 + var423.field2900;
                                field3168[var2++] = var424;
                            }
                            continue;
                        }
                        if (var607 == 5214) {
                            var2--;
                            int var425 = field3168[var2];
                            class294 var426 = class402.method2550((byte) -125);
                            if (var426 != null) {
                                boolean var427 = var426.method2061(var425 >> 14 & 0x3FFF, (byte) 47, var425 >> 28 & 0x3, var425 & 0x3FFF, field3190);
                                if (var427) {
                                    class292.method2039(field3190[1], field3190[2], -1);
                                }
                            }
                            continue;
                        }
                        if (var607 == 5215) {
                            var2 -= 2;
                            int var428 = field3168[var2];
                            int var429 = field3168[var2 + 1];
                            class206 var430 = class272.method1931(var428 >> 14 & 0x3FFF, var428 & 0x3FFF);
                            boolean var431 = false;
                            for (class294 var432 = (class294) var430.method1565(1); var432 != null; var432 = (class294) var430.method1562(-4)) {
                                if (var432.field4365 == var429) {
                                    var431 = true;
                                    break;
                                }
                            }
                            if (var431) {
                                field3168[var2++] = 1;
                            } else {
                                field3168[var2++] = 0;
                            }
                            continue;
                        }
                        if (var607 == 5218) {
                            var2--;
                            int var433 = field3168[var2];
                            class294 var434 = class272.method1943(var433);
                            if (var434 == null) {
                                field3168[var2++] = -1;
                            } else {
                                field3168[var2++] = var434.field4379;
                            }
                            continue;
                        }
                        if (var607 == 5220) {
                            field3168[var2++] = class358.field5117 == 100 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 5221) {
                            var2--;
                            int var435 = field3168[var2];
                            class292.method2039(var435 >> 14 & 0x3FFF, var435 & 0x3FFF, -1);
                            continue;
                        }
                        if (var607 == 5222) {
                            class294 var436 = class402.method2550((byte) 127);
                            if (var436 == null) {
                                field3168[var2++] = -1;
                                field3168[var2++] = -1;
                            } else {
                                boolean var437 = var436.method2054(class272.field4096 + class110.field1797, field3190, (byte) 78, class373.field5295 + class272.field4088);
                                if (var437) {
                                    field3168[var2++] = field3190[1];
                                    field3168[var2++] = field3190[2];
                                } else {
                                    field3168[var2++] = -1;
                                    field3168[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var607 == 5223) {
                            var2 -= 2;
                            int var438 = field3168[var2];
                            int var439 = field3168[var2 + 1];
                            class324.method2150((byte) -86, false, var438, var439 & 0x3FFF, var439 >> 14 & 0x3FFF);
                            continue;
                        }
                        if (var607 == 5224) {
                            var2--;
                            int var440 = field3168[var2];
                            class294 var441 = class402.method2550((byte) 101);
                            if (var441 == null) {
                                field3168[var2++] = -1;
                                field3168[var2++] = -1;
                            } else {
                                boolean var442 = var441.method2061(var440 >> 14 & 0x3FFF, (byte) 90, var440 >> 28 & 0x3, var440 & 0x3FFF, field3190);
                                if (var442) {
                                    field3168[var2++] = field3190[1];
                                    field3168[var2++] = field3190[2];
                                } else {
                                    field3168[var2++] = -1;
                                    field3168[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var607 == 5225) {
                            var2--;
                            int var443 = field3168[var2];
                            class294 var444 = class402.method2550((byte) -78);
                            if (var444 == null) {
                                field3168[var2++] = -1;
                                field3168[var2++] = -1;
                            } else {
                                boolean var445 = var444.method2054(var443 >> 14 & 0x3FFF, field3190, (byte) 92, var443 & 0x3FFF);
                                if (var445) {
                                    field3168[var2++] = field3190[1];
                                    field3168[var2++] = field3190[2];
                                } else {
                                    field3168[var2++] = -1;
                                    field3168[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var607 == 5226) {
                            var2--;
                            class170.method1297(field3168[var2], 0);
                            continue;
                        }
                        if (var607 == 5227) {
                            var2 -= 2;
                            int var446 = field3168[var2];
                            int var447 = field3168[var2 + 1];
                            class324.method2150((byte) -114, true, var446, var447 & 0x3FFF, var447 >> 14 & 0x3FFF);
                            continue;
                        }
                        if (var607 == 5228) {
                            var2--;
                            class72.field1209 = field3168[var2] == 1;
                            continue;
                        }
                        if (var607 == 5229) {
                            field3168[var2++] = class72.field1209 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 5230) {
                            var2--;
                            int var448 = field3168[var2];
                            class30.method225(-8, var448);
                            continue;
                        }
                        if (var607 == 5231) {
                            var2 -= 2;
                            int var449 = field3168[var2];
                            boolean var450 = field3168[var2 + 1] == 1;
                            if (class242.field3523 == null) {
                                continue;
                            }
                            class35 var451 = class242.field3523.method1219((long) var449, -120);
                            if (var451 != null && !var450) {
                                var451.method251(91);
                                continue;
                            }
                            if (var451 == null && var450) {
                                class35 var452 = new class35();
                                class242.field3523.method1217(1, (long) var449, var452);
                            }
                            continue;
                        }
                        if (var607 == 5232) {
                            var2--;
                            int var453 = field3168[var2];
                            if (class242.field3523 == null) {
                                field3168[var2++] = 0;
                            } else {
                                class35 var454 = class242.field3523.method1219((long) var453, -119);
                                field3168[var2++] = var454 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var607 == 5233) {
                            var2 -= 2;
                            int var455 = field3168[var2];
                            boolean var456 = field3168[var2 + 1] == 1;
                            if (class211.field3137 == null) {
                                continue;
                            }
                            class35 var457 = class211.field3137.method1219((long) var455, -116);
                            if (var457 != null && !var456) {
                                var457.method251(78);
                                continue;
                            }
                            if (var457 == null && var456) {
                                class35 var458 = new class35();
                                class211.field3137.method1217(1, (long) var455, var458);
                            }
                            continue;
                        }
                        if (var607 == 5234) {
                            var2--;
                            int var459 = field3168[var2];
                            if (class211.field3137 == null) {
                                field3168[var2++] = 0;
                            } else {
                                class35 var460 = class211.field3137.method1219((long) var459, -114);
                                field3168[var2++] = var460 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var607 == 5235) {
                            field3168[var2++] = class272.field4070 == null ? -1 : class272.field4070.field4365;
                            continue;
                        }
                    } else if (var607 < 5400) {
                        if (var607 == 5300) {
                            var2 -= 2;
                            int var461 = field3168[var2];
                            int var462 = field3168[var2 + 1];
                            class211.method1616(false, var461, 3, -60, var462);
                            field3168[var2++] = class315.field4585 == null ? 0 : 1;
                            continue;
                        }
                        if (var607 == 5301) {
                            if (class315.field4585 != null) {
                                class211.method1616(false, -1, class62.field1007, -50, -1);
                            }
                            continue;
                        }
                        if (var607 == 5302) {
                            class319[] var463 = class79.method628(0);
                            field3168[var2++] = var463.length;
                            continue;
                        }
                        if (var607 == 5303) {
                            var2--;
                            int var464 = field3168[var2];
                            class319[] var465 = class79.method628(0);
                            field3168[var2++] = var465[var464].field4608;
                            field3168[var2++] = var465[var464].field4611;
                            continue;
                        }
                        if (var607 == 5305) {
                            int var466 = class331.field4757;
                            int var467 = class7.field99;
                            int var468 = -1;
                            class319[] var469 = class79.method628(0);
                            for (int var470 = 0; var470 < var469.length; var470++) {
                                class319 var471 = var469[var470];
                                if (var471.field4608 == var466 && var471.field4611 == var467) {
                                    var468 = var470;
                                    break;
                                }
                            }
                            field3168[var2++] = var468;
                            continue;
                        }
                        if (var607 == 5306) {
                            field3168[var2++] = class285.method2015(6071);
                            continue;
                        }
                        if (var607 == 5307) {
                            var2--;
                            int var472 = field3168[var2];
                            if (var472 >= 1 && var472 <= 2) {
                                class211.method1616(false, -1, var472, -99, -1);
                            }
                            continue;
                        }
                        if (var607 == 5308) {
                            field3168[var2++] = class62.field1007;
                            continue;
                        }
                        if (var607 == 5309) {
                            var2--;
                            int var473 = field3168[var2];
                            if (var473 >= 1 && var473 <= 2) {
                                class62.field1007 = var473;
                                class119.method1002(0, class188.field2783);
                            }
                            continue;
                        }
                    } else if (var607 < 5500) {
                        if (var607 == 5400) {
                            var3 -= 2;
                            String var474 = field3172[var3];
                            String var475 = field3172[var3 + 1];
                            var2--;
                            int var476 = field3168[var2];
                            field3174++;
                            class13.field216.method2781(false, 231);
                            class13.field216.method267(class429.method2677(var474, 1) + class429.method2677(var475, 1) + 1, false);
                            class13.field216.method265((byte) -125, var474);
                            class13.field216.method265((byte) -99, var475);
                            class13.field216.method267(var476, false);
                            continue;
                        }
                        if (var607 == 5401) {
                            var2 -= 2;
                            class74.field1274[field3168[var2]] = (short) class207.method1567(field3168[var2 + 1], (byte) -90);
                            class59.method457((byte) 123);
                            class78.method610((byte) 80);
                            class362.method2324(32);
                            class179.method1400((byte) -3);
                            class126.method1061(false);
                            continue;
                        }
                        if (var607 == 5405) {
                            var2 -= 2;
                            int var477 = field3168[var2];
                            int var478 = field3168[var2 + 1];
                            if (var477 >= 0 && var477 < 2) {
                                class253.field3659[var477] = new int[var478 << 1][4];
                            }
                            continue;
                        }
                        if (var607 == 5406) {
                            var2 -= 7;
                            int var479 = field3168[var2];
                            int var480 = field3168[var2 + 1] << 1;
                            int var481 = field3168[var2 + 2];
                            int var482 = field3168[var2 + 3];
                            int var483 = field3168[var2 + 4];
                            int var484 = field3168[var2 + 5];
                            int var485 = field3168[var2 + 6];
                            if (var479 >= 0 && var479 < 2 && class253.field3659[var479] != null && var480 >= 0 && var480 < class253.field3659[var479].length) {
                                class253.field3659[var479][var480] = new int[] { (var481 >> 14 & 0x3FFF) * 128, var482, (var481 & 0x3FFF) * 128, var485 };
                                class253.field3659[var479][var480 + 1] = new int[] { (var483 >> 14 & 0x3FFF) * 128, var484, (var483 & 0x3FFF) * 128 };
                            }
                            continue;
                        }
                        if (var607 == 5407) {
                            var2--;
                            int var486 = class253.field3659[field3168[var2]].length >> 1;
                            field3168[var2++] = var486;
                            continue;
                        }
                        if (var607 == 5411) {
                            if (class315.field4585 != null) {
                                class211.method1616(false, -1, class62.field1007, -56, -1);
                            }
                            if (class239.field3443 == null) {
                                String var487 = class107.field1765 == null ? class285.method2012((byte) 38) : class107.field1765;
                                class182.method1416(class288.field4303 == 1, -128, class188.field2783, var487, false);
                            } else {
                                class239.method1740((byte) 101);
                                System.exit(0);
                            }
                            continue;
                        }
                        if (var607 == 5419) {
                            String var488 = "";
                            if (class120.field1877 != null) {
                                if (class120.field1877.field2125 == null) {
                                    var488 = class293.method2046(class120.field1877.field2124, 65280);
                                } else {
                                    var488 = (String) class120.field1877.field2125;
                                }
                            }
                            field3172[var3++] = var488;
                            continue;
                        }
                        if (var607 == 5420) {
                            field3168[var2++] = class177.field2636 == 3 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 5421) {
                            if (class315.field4585 != null) {
                                class211.method1616(false, -1, class62.field1007, -125, -1);
                            }
                            var3--;
                            String var489 = field3172[var3];
                            var2--;
                            boolean var490 = field3168[var2] == 1;
                            String var491 = class285.method2012((byte) 127) + var489;
                            class182.method1416(class288.field4303 == 1, -124, class188.field2783, var491, var490);
                            continue;
                        }
                        if (var607 == 5422) {
                            var3 -= 2;
                            String var492 = field3172[var3];
                            String var493 = field3172[var3 + 1];
                            var2--;
                            int var494 = field3168[var2];
                            if (var492.length() > 0) {
                                if (class69.field1123 == null) {
                                    class69.field1123 = new String[class27.field403[class336.field4809]];
                                }
                                class69.field1123[var494] = var492;
                            }
                            if (var493.length() > 0) {
                                if (class14.field223 == null) {
                                    class14.field223 = new String[class27.field403[class336.field4809]];
                                }
                                class14.field223[var494] = var493;
                            }
                            continue;
                        }
                        if (var607 == 5423) {
                            var3--;
                            System.out.println(field3172[var3]);
                            continue;
                        }
                        if (var607 == 5424) {
                            var2 -= 11;
                            class143.field2235 = field3168[var2];
                            class157.field2386 = field3168[var2 + 1];
                            class111.field1800 = field3168[var2 + 2];
                            class361.field5153 = field3168[var2 + 3];
                            class258.field3862 = field3168[var2 + 4];
                            class367.field5230 = field3168[var2 + 5];
                            class34.field493 = field3168[var2 + 6];
                            class102.field1579 = field3168[var2 + 7];
                            class425.field6181 = field3168[var2 + 8];
                            class199.field2907 = field3168[var2 + 9];
                            class389.field5587 = field3168[var2 + 10];
                            class100.field1561.method1348(255, class258.field3862);
                            class100.field1561.method1348(255, class367.field5230);
                            class100.field1561.method1348(255, class34.field493);
                            class100.field1561.method1348(255, class102.field1579);
                            class100.field1561.method1348(255, class425.field6181);
                            class451.field6549 = null;
                            class245.field3582 = null;
                            class320.field4629 = null;
                            class308.field4509 = null;
                            class365.field5209 = null;
                            class85.field1389 = null;
                            class86.field1401 = null;
                            class420.field6134 = null;
                            class369.field5242 = true;
                            continue;
                        }
                        if (var607 == 5425) {
                            class275.method1965((byte) -96);
                            class369.field5242 = false;
                            continue;
                        }
                        if (var607 == 5426) {
                            var2 -= 2;
                            class206.field3027 = field3168[var2];
                            class361.field5151 = field3168[var2 + 1];
                            continue;
                        }
                        if (var607 == 5427) {
                            var2 -= 2;
                            class119.field1867 = field3168[var2];
                            class64.field1038 = field3168[var2 + 1];
                            continue;
                        }
                        if (var607 == 5428) {
                            var2 -= 2;
                            int var495 = field3168[var2];
                            int var496 = field3168[var2 + 1];
                            field3168[var2++] = class199.method1518(-30, var496, var495) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 5429) {
                            var3--;
                            class55.method435(1, field3172[var3], false);
                            continue;
                        }
                    } else if (var607 < 5600) {
                        if (var607 == 5500) {
                            var2 -= 4;
                            int var497 = field3168[var2];
                            int var498 = field3168[var2 + 1];
                            int var499 = field3168[var2 + 2];
                            int var500 = field3168[var2 + 3];
                            class42.method346(true, false, var499, (var497 >> 14 & 0x3FFF) - class379.field5384, var500, (var497 & 0x3FFF) - class294.field4362, var498);
                            continue;
                        }
                        if (var607 == 5501) {
                            var2 -= 4;
                            int var501 = field3168[var2];
                            int var502 = field3168[var2 + 1];
                            int var503 = field3168[var2 + 2];
                            int var504 = field3168[var2 + 3];
                            class258.method1859(var504, (byte) 118, (var501 & 0x3FFF) - class294.field4362, var503, var502, (var501 >> 14 & 0x3FFF) - class379.field5384);
                            continue;
                        }
                        if (var607 == 5502) {
                            var2 -= 6;
                            int var505 = field3168[var2];
                            if (var505 >= 2) {
                                throw new RuntimeException();
                            }
                            class98.field1547 = var505;
                            int var506 = field3168[var2 + 1];
                            if (var506 + 1 >= class253.field3659[class98.field1547].length >> 1) {
                                throw new RuntimeException();
                            }
                            class37.field562 = var506;
                            class413.field5999 = 0;
                            class55.field884 = field3168[var2 + 2];
                            class230.field3368 = field3168[var2 + 3];
                            int var507 = field3168[var2 + 4];
                            if (var507 >= 2) {
                                throw new RuntimeException();
                            }
                            class376.field5330 = var507;
                            int var508 = field3168[var2 + 5];
                            if (var508 + 1 >= class253.field3659[class376.field5330].length >> 1) {
                                throw new RuntimeException();
                            }
                            class51.field823 = var508;
                            class322.field4643 = 3;
                            continue;
                        }
                        if (var607 == 5503) {
                            class416.method2604((byte) -103);
                            continue;
                        }
                        if (var607 == 5504) {
                            var2 -= 2;
                            class127.method1073(true, 0, field3168[var2], field3168[var2 + 1]);
                            continue;
                        }
                        if (var607 == 5505) {
                            field3168[var2++] = (int) class436.field6359 >> 3;
                            continue;
                        }
                        if (var607 == 5506) {
                            field3168[var2++] = (int) class106.field1756 >> 3;
                            continue;
                        }
                        if (var607 == 5507) {
                            class336.method2186((byte) 77);
                            continue;
                        }
                        if (var607 == 5508) {
                            class341.method2203(-78);
                            continue;
                        }
                        if (var607 == 5509) {
                            class334.method2182(false);
                            continue;
                        }
                        if (var607 == 5510) {
                            class281.method1996(-128);
                            continue;
                        }
                        if (var607 == 5511) {
                            var2--;
                            int var509 = field3168[var2];
                            int var510 = var509 >> 14 & 0x3FFF;
                            int var511 = var509 & 0x3FFF;
                            int var512 = var510 - class379.field5384;
                            if (var512 < 0) {
                                var512 = 0;
                            } else if (var512 >= class183.field2703) {
                                var512 = class183.field2703;
                            }
                            int var513 = var511 - class294.field4362;
                            if (var513 < 0) {
                                var513 = 0;
                            } else if (var513 >= class66.field1056) {
                                var513 = class66.field1056;
                            }
                            class369.field5238 = var512 * 128 + 64;
                            class263.field3956 = var513 * 128 + 64;
                            class322.field4643 = 4;
                            continue;
                        }
                        if (var607 == 5512) {
                            class358.method2300(-1);
                            continue;
                        }
                    } else if (var607 < 5700) {
                        if (var607 == 5600) {
                            var3 -= 2;
                            String var514 = field3172[var3];
                            String var515 = field3172[var3 + 1];
                            var2--;
                            int var516 = field3168[var2];
                            if (class240.field3463 == 10 && class132.field2136 == 0 && class419.field6072 == 0 && class205.field3012 == 0 && class394.field5749 == 0) {
                                class93.method785(var516, var514, var515, false);
                            }
                            continue;
                        }
                        if (var607 == 5601) {
                            class170.method1299(63);
                            continue;
                        }
                        if (var607 == 5602) {
                            if (class419.field6072 == 0) {
                                class11.field159 = -2;
                            }
                            continue;
                        }
                        if (var607 == 5603) {
                            var2 -= 4;
                            if (class240.field3463 == 10 && class132.field2136 == 0 && class419.field6072 == 0 && class205.field3012 == 0 && class394.field5749 == 0) {
                                class415.method2596(123, field3168[var2 + 2], field3168[var2 + 1], field3168[var2 + 3], field3168[var2]);
                            }
                            continue;
                        }
                        if (var607 == 5604) {
                            var3--;
                            if (class240.field3463 == 10 && class132.field2136 == 0 && class419.field6072 == 0 && class205.field3012 == 0 && class394.field5749 == 0) {
                                class183.method1429(true, class437.method2739(37, field3172[var3]));
                            }
                            continue;
                        }
                        if (var607 == 5605) {
                            var3 -= 3;
                            var2 -= 7;
                            if (class240.field3463 == 10 && class132.field2136 == 0 && class419.field6072 == 0 && class205.field3012 == 0 && class394.field5749 == 0) {
                                class156.method1226(field3168[var2 + 1], class437.method2739(37, field3172[var3]), field3168[var2 + 4] == 1, field3168[var2], field3168[var2 + 6] == 1, field3168[var2 + 3], field3168[var2 + 2], field3172[var3 + 1], field3168[var2 + 5] == 1, field3172[var3 + 2], 11341);
                            }
                            continue;
                        }
                        if (var607 == 5606) {
                            if (class205.field3012 == 0) {
                                class349.field4965 = -2;
                            }
                            continue;
                        }
                        if (var607 == 5607) {
                            field3168[var2++] = class11.field159;
                            continue;
                        }
                        if (var607 == 5608) {
                            field3168[var2++] = class170.field2541;
                            continue;
                        }
                        if (var607 == 5609) {
                            field3168[var2++] = class349.field4965;
                            continue;
                        }
                        if (var607 == 5610) {
                            for (int var517 = 0; var517 < 5; var517++) {
                                field3172[var3++] = class62.field997.length > var517 ? class168.method1285(-26, class62.field997[var517]) : "";
                            }
                            class62.field997 = null;
                            continue;
                        }
                        if (var607 == 5611) {
                            field3168[var2++] = class13.field219;
                            continue;
                        }
                    } else if (var607 < 6100) {
                        if (var607 == 6001) {
                            var2--;
                            int var518 = field3168[var2];
                            if (var518 < 1) {
                                var518 = 1;
                            }
                            if (var518 > 4) {
                                var518 = 4;
                            }
                            class354.field5039 = var518;
                            class64.method493(125);
                            class119.method1002(0, class188.field2783);
                            class196.field2870 = false;
                            continue;
                        }
                        if (var607 == 6002) {
                            var2--;
                            class58.method453(field3168[var2] == 1, 50);
                            class123.method1040(-128);
                            class64.method493(122);
                            class364.method2327(3891);
                            class119.method1002(0, class188.field2783);
                            class196.field2870 = false;
                            continue;
                        }
                        if (var607 == 6003) {
                            var2--;
                            class47.field758 = field3168[var2] == 1;
                            class364.method2327(3891);
                            class119.method1002(0, class188.field2783);
                            class196.field2870 = false;
                            continue;
                        }
                        if (var607 == 6005) {
                            var2--;
                            class310.field4525 = field3168[var2] == 1;
                            class64.method493(123);
                            class119.method1002(0, class188.field2783);
                            class196.field2870 = false;
                            continue;
                        }
                        if (var607 == 6006) {
                            var2--;
                            class110.field1793 = field3168[var2] == 1;
                            class73.field1235.method714(!class110.field1793);
                            class119.method1002(0, class188.field2783);
                            class196.field2870 = false;
                            continue;
                        }
                        if (var607 == 6007) {
                            var2--;
                            class339.field4830 = field3168[var2];
                            class119.method1002(0, class188.field2783);
                            class196.field2870 = false;
                            continue;
                        }
                        if (var607 == 6008) {
                            var2--;
                            class428.field6199 = field3168[var2] == 1;
                            class119.method1002(0, class188.field2783);
                            class196.field2870 = false;
                            continue;
                        }
                        if (var607 == 6009) {
                            var2--;
                            class280.field4196 = field3168[var2] == 1;
                            class64.method493(120);
                            class119.method1002(0, class188.field2783);
                            class196.field2870 = false;
                            continue;
                        }
                        if (var607 == 6010) {
                            var2--;
                            class451.field6550 = field3168[var2] == 1;
                            class119.method1002(0, class188.field2783);
                            class196.field2870 = false;
                            continue;
                        }
                        if (var607 == 6011) {
                            var2--;
                            int var519 = field3168[var2];
                            if (var519 < 0 || var519 > 2) {
                                var519 = 0;
                            }
                            class238.field3438 = var519;
                            class64.method493(121);
                            class119.method1002(0, class188.field2783);
                            class196.field2870 = false;
                            continue;
                        }
                        if (var607 == 6012) {
                            var2--;
                            class169.field2515 = field3168[var2] == 1;
                            class211.method1617(106);
                            class119.method1002(0, class188.field2783);
                            class196.field2870 = false;
                            continue;
                        }
                        if (var607 == 6014) {
                            var2--;
                            class303.field4424 = field3168[var2] == 1;
                            class64.method493(123);
                            class119.method1002(0, class188.field2783);
                            class196.field2870 = false;
                            continue;
                        }
                        if (var607 == 6015) {
                            var2--;
                            class322.field4645 = field3168[var2] == 1;
                            class64.method493(123);
                            class119.method1002(0, class188.field2783);
                            class196.field2870 = false;
                            continue;
                        }
                        if (var607 == 6016) {
                            var2--;
                            int var520 = field3168[var2];
                            if (var520 < 0 || var520 > 2) {
                                var520 = 0;
                            }
                            class319.field4614 = var520;
                            class214.method1624(31269);
                            class119.method1002(0, class188.field2783);
                            continue;
                        }
                        if (var607 == 6017) {
                            var2--;
                            class59.field946 = field3168[var2] == 1;
                            class55.method434((byte) 94);
                            class119.method1002(0, class188.field2783);
                            class196.field2870 = false;
                            continue;
                        }
                        if (var607 == 6018) {
                            var2--;
                            int var521 = field3168[var2];
                            if (var521 < 0) {
                                var521 = 0;
                            }
                            if (var521 > 127) {
                                var521 = 127;
                            }
                            class242.field3530 = var521;
                            class119.method1002(0, class188.field2783);
                            class196.field2870 = false;
                            continue;
                        }
                        if (var607 == 6019) {
                            var2--;
                            int var522 = field3168[var2];
                            if (var522 < 0) {
                                var522 = 0;
                            }
                            if (var522 > 255) {
                                var522 = 255;
                            }
                            if (class321.field4641 != var522) {
                                if (class321.field4641 == 0 && class86.field1402 != -1) {
                                    class121.method1012((byte) 18, var522, false, class446.field6501, 0, class86.field1402);
                                    class387.field5546 = false;
                                } else if (var522 == 0) {
                                    class107.method945(73);
                                    class387.field5546 = false;
                                } else {
                                    class351.method2254(var522, (byte) -114);
                                }
                                class321.field4641 = var522;
                            }
                            class119.method1002(0, class188.field2783);
                            class196.field2870 = false;
                            continue;
                        }
                        if (var607 == 6020) {
                            var2--;
                            int var523 = field3168[var2];
                            if (var523 < 0) {
                                var523 = 0;
                            }
                            if (var523 > 127) {
                                var523 = 127;
                            }
                            class151.field2315 = var523;
                            class119.method1002(0, class188.field2783);
                            class196.field2870 = false;
                            continue;
                        }
                        if (var607 == 6021) {
                            var2--;
                            class176.field2633 = field3168[var2] == 1;
                            class364.method2327(3891);
                            continue;
                        }
                        if (var607 == 6023) {
                            var2--;
                            int var524 = field3168[var2];
                            boolean var525 = false;
                            if (var524 < 0) {
                                var524 = 0;
                            }
                            if (var524 > 2) {
                                var524 = 2;
                            }
                            if (class75.field1288 < 96) {
                                var524 = 0;
                                var525 = true;
                            }
                            class447.method2796(var524, -116);
                            class119.method1002(0, class188.field2783);
                            class196.field2870 = false;
                            field3168[var2++] = var525 ? 0 : 1;
                            continue;
                        }
                        if (var607 == 6024) {
                            var2--;
                            int var526 = field3168[var2];
                            if (var526 < 0 || var526 > 2) {
                                var526 = 0;
                            }
                            class360.field5139 = var526;
                            class119.method1002(0, class188.field2783);
                            continue;
                        }
                        if (var607 == 6025) {
                            var2--;
                            int var527 = field3168[var2];
                            if (var527 < 0 || var527 > 3) {
                                var527 = 0;
                            }
                            class436.field6356 = var527;
                            class119.method1002(0, class188.field2783);
                            class196.field2870 = false;
                            continue;
                        }
                        if (var607 == 6027) {
                            var2--;
                            int var528 = field3168[var2];
                            if (var528 < 0 || var528 > 1) {
                                var528 = 0;
                            }
                            class378.method2399((byte) -96, var528 == 1);
                            continue;
                        }
                        if (var607 == 6028) {
                            var2--;
                            class282.field4224 = field3168[var2] != 0;
                            class119.method1002(0, class188.field2783);
                            continue;
                        }
                        if (var607 == 6029) {
                            var2--;
                            class339.field4830 = field3168[var2];
                            class119.method1002(0, class188.field2783);
                            continue;
                        }
                        if (var607 == 6030) {
                            var2--;
                            class33.field476 = field3168[var2] != 0;
                            class119.method1002(0, class188.field2783);
                            class64.method493(126);
                            continue;
                        }
                        if (var607 == 6031) {
                            var2--;
                            int var529 = field3168[var2];
                            if (var529 < 0 || var529 > 3) {
                                var529 = 2;
                            }
                            class322.method2145(var529, false);
                            continue;
                        }
                        if (var607 == 6032) {
                            var2--;
                            int var530 = field3168[var2];
                            if (var530 < 0 || var530 > 3) {
                                var530 = 2;
                            }
                            class230.field3364 = var530;
                            class119.method1002(0, class188.field2783);
                            class196.field2870 = false;
                            continue;
                        }
                    } else if (var607 < 6200) {
                        if (var607 == 6101) {
                            field3168[var2++] = class354.field5039;
                            continue;
                        }
                        if (var607 == 6102) {
                            field3168[var2++] = class122.method1034(24037) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6103) {
                            field3168[var2++] = class47.field758 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6105) {
                            field3168[var2++] = class310.field4525 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6106) {
                            field3168[var2++] = class110.field1793 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6107) {
                            field3168[var2++] = class339.field4830;
                            continue;
                        }
                        if (var607 == 6108) {
                            field3168[var2++] = class428.field6199 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6109) {
                            field3168[var2++] = class280.field4196 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6110) {
                            field3168[var2++] = class451.field6550 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6111) {
                            field3168[var2++] = class238.field3438;
                            continue;
                        }
                        if (var607 == 6112) {
                            field3168[var2++] = class169.field2515 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6114) {
                            field3168[var2++] = class303.field4424 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6115) {
                            field3168[var2++] = class322.field4645 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6116) {
                            field3168[var2++] = class319.field4614;
                            continue;
                        }
                        if (var607 == 6117) {
                            field3168[var2++] = class59.field946 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6118) {
                            field3168[var2++] = class242.field3530;
                            continue;
                        }
                        if (var607 == 6119) {
                            field3168[var2++] = class321.field4641;
                            continue;
                        }
                        if (var607 == 6120) {
                            field3168[var2++] = class151.field2315;
                            continue;
                        }
                        if (var607 == 6121) {
                            field3168[var2++] = class73.field1235.method697() ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6123) {
                            field3168[var2++] = class185.method1438(true);
                            continue;
                        }
                        if (var607 == 6124) {
                            field3168[var2++] = class360.field5139;
                            continue;
                        }
                        if (var607 == 6125) {
                            field3168[var2++] = class436.field6356;
                            continue;
                        }
                        if (var607 == 6126) {
                            field3168[var2++] = class73.field1235.method716() ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6127) {
                            field3168[var2++] = class13.field220 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6128) {
                            field3168[var2++] = class282.field4224 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6129) {
                            field3168[var2++] = class339.field4830;
                            continue;
                        }
                        if (var607 == 6130) {
                            field3168[var2++] = class33.field476 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6131) {
                            field3168[var2++] = class288.field4303;
                            continue;
                        }
                        if (var607 == 6132) {
                            field3168[var2++] = class230.field3364;
                            continue;
                        }
                        if (var607 == 6133) {
                            field3168[var2++] = class177.field2636 == 1 || class177.field2636 == 4 ? 1 : 0;
                            continue;
                        }
                    } else if (var607 < 6300) {
                        if (var607 == 6200) {
                            var2 -= 2;
                            class409.field5963 = (short) field3168[var2];
                            if (class409.field5963 <= 0) {
                                class409.field5963 = 256;
                            }
                            class28.field411 = (short) field3168[var2 + 1];
                            if (class28.field411 <= 0) {
                                class28.field411 = 205;
                            }
                            continue;
                        }
                        if (var607 == 6201) {
                            var2 -= 2;
                            class431.field6221 = (short) field3168[var2];
                            if (class431.field6221 <= 0) {
                                class431.field6221 = 256;
                            }
                            class250.field3615 = (short) field3168[var2 + 1];
                            if (class250.field3615 <= 0) {
                                class250.field3615 = 320;
                            }
                            continue;
                        }
                        if (var607 == 6202) {
                            var2 -= 4;
                            class39.field606 = (short) field3168[var2];
                            if (class39.field606 <= 0) {
                                class39.field606 = 1;
                            }
                            class110.field1794 = (short) field3168[var2 + 1];
                            if (class110.field1794 <= 0) {
                                class110.field1794 = 32767;
                            } else if (class110.field1794 < class39.field606) {
                                class110.field1794 = class39.field606;
                            }
                            class102.field1585 = (short) field3168[var2 + 2];
                            if (class102.field1585 <= 0) {
                                class102.field1585 = 1;
                            }
                            class260.field3919 = (short) field3168[var2 + 3];
                            if (class260.field3919 <= 0) {
                                class260.field3919 = 32767;
                            } else if (class260.field3919 < class102.field1585) {
                                class260.field3919 = class102.field1585;
                            }
                            continue;
                        }
                        if (var607 == 6203) {
                            class137.method1118(class291.field4331.field3764, 0, 0, class291.field4331.field3758, (byte) -5, false);
                            field3168[var2++] = class394.field5755;
                            field3168[var2++] = class444.field6451;
                            continue;
                        }
                        if (var607 == 6204) {
                            field3168[var2++] = class431.field6221;
                            field3168[var2++] = class250.field3615;
                            continue;
                        }
                        if (var607 == 6205) {
                            field3168[var2++] = class409.field5963;
                            field3168[var2++] = class28.field411;
                            continue;
                        }
                    } else if (var607 < 6400) {
                        if (var607 == 6300) {
                            field3168[var2++] = (int) (class10.method63(-21149) / 60000L);
                            continue;
                        }
                        if (var607 == 6301) {
                            field3168[var2++] = (int) (class10.method63(-21149) / 86400000L) - 11745;
                            continue;
                        }
                        if (var607 == 6302) {
                            var2 -= 3;
                            int var531 = field3168[var2];
                            int var532 = field3168[var2 + 1];
                            int var533 = field3168[var2 + 2];
                            field3182.clear();
                            field3182.set(11, 12);
                            field3182.set(var533, var532, var531);
                            field3168[var2++] = (int) (field3182.getTime().getTime() / 86400000L) - 11745;
                            continue;
                        }
                        if (var607 == 6303) {
                            field3182.clear();
                            field3182.setTime(new Date(class10.method63(-21149)));
                            field3168[var2++] = field3182.get(1);
                            continue;
                        }
                        if (var607 == 6304) {
                            var2--;
                            int var534 = field3168[var2];
                            boolean var535 = true;
                            if (var534 < 0) {
                                var535 = (var534 + 1) % 4 == 0;
                            } else if (var534 < 1582) {
                                var535 = var534 % 4 == 0;
                            } else if (var534 % 4 != 0) {
                                var535 = false;
                            } else if (var534 % 100 != 0) {
                                var535 = true;
                            } else if (var534 % 400 != 0) {
                                var535 = false;
                            }
                            field3168[var2++] = var535 ? 1 : 0;
                            continue;
                        }
                    } else if (var607 < 6500) {
                        if (var607 == 6405) {
                            field3168[var2++] = class122.method1029((byte) 113) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6406) {
                            field3168[var2++] = class56.method442(0) ? 1 : 0;
                            continue;
                        }
                    } else if (var607 < 6600) {
                        if (var607 == 6500) {
                            if (class240.field3463 == 10 && class132.field2136 == 0 && class419.field6072 == 0 && class205.field3012 == 0) {
                                field3168[var2++] = class157.method1232(109) == -1 ? 0 : 1;
                                continue;
                            }
                            field3168[var2++] = 1;
                            continue;
                        }
                        if (var607 == 6501) {
                            class218 var536 = class76.method600(0);
                            if (var536 == null) {
                                field3168[var2++] = -1;
                                field3168[var2++] = 0;
                                field3172[var3++] = "";
                                field3168[var2++] = 0;
                                field3172[var3++] = "";
                                field3168[var2++] = 0;
                                field3168[var2++] = 0;
                            } else {
                                field3168[var2++] = var536.field3233;
                                field3168[var2++] = var536.field4010;
                                field3172[var3++] = var536.field3223;
                                class91 var537 = var536.method1648(8);
                                field3168[var2++] = var537.field1447;
                                field3172[var3++] = var537.field1444;
                                field3168[var2++] = var536.field3999;
                                field3168[var2++] = var536.field3230;
                            }
                            continue;
                        }
                        if (var607 == 6502) {
                            class218 var538 = class450.method2804(true);
                            if (var538 == null) {
                                field3168[var2++] = -1;
                                field3168[var2++] = 0;
                                field3172[var3++] = "";
                                field3168[var2++] = 0;
                                field3172[var3++] = "";
                                field3168[var2++] = 0;
                                field3168[var2++] = 0;
                            } else {
                                field3168[var2++] = var538.field3233;
                                field3168[var2++] = var538.field4010;
                                field3172[var3++] = var538.field3223;
                                class91 var539 = var538.method1648(8);
                                field3168[var2++] = var539.field1447;
                                field3172[var3++] = var539.field1444;
                                field3168[var2++] = var538.field3999;
                                field3168[var2++] = var538.field3230;
                            }
                            continue;
                        }
                        if (var607 == 6503) {
                            var2--;
                            int var540 = field3168[var2];
                            if (class240.field3463 == 10 && class132.field2136 == 0 && class419.field6072 == 0 && class205.field3012 == 0) {
                                field3168[var2++] = class257.method1853(-1974171769, var540) ? 1 : 0;
                                continue;
                            }
                            field3168[var2++] = 0;
                            continue;
                        }
                        if (var607 == 6504) {
                            var2--;
                            class200.field2919 = field3168[var2];
                            class119.method1002(0, class188.field2783);
                            continue;
                        }
                        if (var607 == 6505) {
                            field3168[var2++] = class200.field2919;
                            continue;
                        }
                        if (var607 == 6506) {
                            var2--;
                            int var541 = field3168[var2];
                            class218 var542 = class33.method237(var541, (byte) -84);
                            if (var542 == null) {
                                field3168[var2++] = -1;
                                field3172[var3++] = "";
                                field3168[var2++] = 0;
                                field3172[var3++] = "";
                                field3168[var2++] = 0;
                                field3168[var2++] = 0;
                            } else {
                                field3168[var2++] = var542.field4010;
                                field3172[var3++] = var542.field3223;
                                class91 var543 = var542.method1648(8);
                                field3168[var2++] = var543.field1447;
                                field3172[var3++] = var543.field1444;
                                field3168[var2++] = var542.field3999;
                                field3168[var2++] = var542.field3230;
                            }
                            continue;
                        }
                        if (var607 == 6507) {
                            var2 -= 4;
                            int var544 = field3168[var2];
                            boolean var545 = field3168[var2 + 1] == 1;
                            int var546 = field3168[var2 + 2];
                            boolean var547 = field3168[var2 + 3] == 1;
                            class62.method478(var545, var547, var546, var544, false);
                            continue;
                        }
                        if (var607 == 6508) {
                            class367.method2344((byte) -110);
                            continue;
                        }
                        if (var607 == 6509) {
                            if (class240.field3463 == 10) {
                                var2--;
                                if (field3168[var2] == 1) {
                                    if (class265.field3987 == null) {
                                        class265.field3987 = new class264();
                                    }
                                } else if (class265.field3987 != null) {
                                    class265.field3987.method1890(false);
                                    class265.field3987 = null;
                                }
                            }
                            continue;
                        }
                    } else if (var607 < 6700) {
                        if (var607 == 6600) {
                            var2--;
                            class324.field4673 = field3168[var2] == 1;
                            class119.method1002(0, class188.field2783);
                            continue;
                        }
                        if (var607 == 6601) {
                            field3168[var2++] = class324.field4673 ? 1 : 0;
                            continue;
                        }
                    } else if (var607 < 6800 && class331.field4762 == 2) {
                        if (var607 == 6700) {
                            int var548 = class355.field5045.method1225(-12198);
                            if (class321.field4642 != -1) {
                                var548++;
                            }
                            field3168[var2++] = var548;
                            continue;
                        }
                        if (var607 == 6701) {
                            var2--;
                            int var549 = field3168[var2];
                            if (class321.field4642 != -1) {
                                if (var549 == 0) {
                                    field3168[var2++] = class321.field4642;
                                    continue;
                                }
                                var549--;
                            }
                            class120 var550 = (class120) class355.field5045.method1222(5656);
                            while (var549-- > 0) {
                                var550 = (class120) class355.field5045.method1224((byte) -102);
                            }
                            field3168[var2++] = var550.field1874;
                            continue;
                        }
                        if (var607 == 6702) {
                            var2--;
                            int var551 = field3168[var2];
                            if (class45.field710[var551] == null) {
                                field3172[var3++] = "";
                            } else {
                                String var552 = class45.field710[var551][0].field3745;
                                if (var552 == null) {
                                    field3172[var3++] = "";
                                } else {
                                    field3172[var3++] = var552.substring(0, var552.indexOf(58));
                                }
                            }
                            continue;
                        }
                        if (var607 == 6703) {
                            var2--;
                            int var553 = field3168[var2];
                            if (class45.field710[var553] == null) {
                                field3168[var2++] = 0;
                            } else {
                                field3168[var2++] = class45.field710[var553].length;
                            }
                            continue;
                        }
                        if (var607 == 6704) {
                            var2 -= 2;
                            int var554 = field3168[var2];
                            int var555 = field3168[var2 + 1];
                            if (class45.field710[var554] == null) {
                                field3172[var3++] = "";
                            } else {
                                String var556 = class45.field710[var554][var555].field3745;
                                if (var556 == null) {
                                    field3172[var3++] = "";
                                } else {
                                    field3172[var3++] = var556;
                                }
                            }
                            continue;
                        }
                        if (var607 == 6705) {
                            var2 -= 2;
                            int var557 = field3168[var2];
                            int var558 = field3168[var2 + 1];
                            if (class45.field710[var557] == null) {
                                field3168[var2++] = 0;
                            } else {
                                field3168[var2++] = class45.field710[var557][var558].field3861;
                            }
                            continue;
                        }
                        if (var607 == 6706) {
                            continue;
                        }
                        if (var607 == 6707) {
                            var2 -= 3;
                            int var559 = field3168[var2];
                            int var560 = field3168[var2 + 1];
                            int var561 = field3168[var2 + 2];
                            class153.method1183(27425, var561, "", 1, var559 << 16 | var560);
                            continue;
                        }
                        if (var607 == 6708) {
                            var2 -= 3;
                            int var562 = field3168[var2];
                            int var563 = field3168[var2 + 1];
                            int var564 = field3168[var2 + 2];
                            class153.method1183(27425, var564, "", 2, var562 << 16 | var563);
                            continue;
                        }
                        if (var607 == 6709) {
                            var2 -= 3;
                            int var565 = field3168[var2];
                            int var566 = field3168[var2 + 1];
                            int var567 = field3168[var2 + 2];
                            class153.method1183(27425, var567, "", 3, var565 << 16 | var566);
                            continue;
                        }
                        if (var607 == 6710) {
                            var2 -= 3;
                            int var568 = field3168[var2];
                            int var569 = field3168[var2 + 1];
                            int var570 = field3168[var2 + 2];
                            class153.method1183(27425, var570, "", 4, var568 << 16 | var569);
                            continue;
                        }
                        if (var607 == 6711) {
                            var2 -= 3;
                            int var571 = field3168[var2];
                            int var572 = field3168[var2 + 1];
                            int var573 = field3168[var2 + 2];
                            class153.method1183(27425, var573, "", 5, var571 << 16 | var572);
                            continue;
                        }
                        if (var607 == 6712) {
                            var2 -= 3;
                            int var574 = field3168[var2];
                            int var575 = field3168[var2 + 1];
                            int var576 = field3168[var2 + 2];
                            class153.method1183(27425, var576, "", 6, var574 << 16 | var575);
                            continue;
                        }
                        if (var607 == 6713) {
                            var2 -= 3;
                            int var577 = field3168[var2];
                            int var578 = field3168[var2 + 1];
                            int var579 = field3168[var2 + 2];
                            class153.method1183(27425, var579, "", 7, var577 << 16 | var578);
                            continue;
                        }
                        if (var607 == 6714) {
                            var2 -= 3;
                            int var580 = field3168[var2];
                            int var581 = field3168[var2 + 1];
                            int var582 = field3168[var2 + 2];
                            class153.method1183(27425, var582, "", 8, var580 << 16 | var581);
                            continue;
                        }
                        if (var607 == 6715) {
                            var2 -= 3;
                            int var583 = field3168[var2];
                            int var584 = field3168[var2 + 1];
                            int var585 = field3168[var2 + 2];
                            class153.method1183(27425, var585, "", 9, var583 << 16 | var584);
                            continue;
                        }
                        if (var607 == 6716) {
                            var2 -= 3;
                            int var586 = field3168[var2];
                            int var587 = field3168[var2 + 1];
                            int var588 = field3168[var2 + 2];
                            class153.method1183(27425, var588, "", 10, var586 << 16 | var587);
                            continue;
                        }
                        if (var607 == 6717) {
                            var2 -= 3;
                            int var589 = field3168[var2];
                            int var590 = field3168[var2 + 1];
                            int var591 = field3168[var2 + 2];
                            class258 var592 = class102.method849((byte) -105, var589 << 16 | var590, var591);
                            class282.method2000(97);
                            class417 var593 = client.method1815(var592);
                            class32.method233(var589 << 16 | var590, var592.field3746, var593.field6039, var591, var592.field3730, 5634, var593.method2609((byte) 115));
                            continue;
                        }
                    } else if (var607 < 6900) {
                        if (var607 == 6800) {
                            var2--;
                            int var594 = field3168[var2];
                            class242 var595 = class1.method3(var594, 36);
                            if (var595.field3483 == null) {
                                field3172[var3++] = "";
                            } else {
                                field3172[var3++] = var595.field3483;
                            }
                            continue;
                        }
                        if (var607 == 6801) {
                            var2--;
                            int var596 = field3168[var2];
                            class242 var597 = class1.method3(var596, 36);
                            field3168[var2++] = var597.field3514;
                            continue;
                        }
                        if (var607 == 6802) {
                            var2--;
                            int var598 = field3168[var2];
                            class242 var599 = class1.method3(var598, 36);
                            field3168[var2++] = var599.field3519;
                            continue;
                        }
                        if (var607 == 6803) {
                            var2--;
                            int var600 = field3168[var2];
                            class242 var601 = class1.method3(var600, 36);
                            field3168[var2++] = var601.field3528;
                            continue;
                        }
                    }
                } else {
                    class258 var75;
                    if (var607 >= 2000) {
                        var607 -= 1000;
                        var2--;
                        var75 = class342.method2207(field3168[var2], (byte) 14);
                    } else {
                        var75 = var37 ? field3171 : field3181;
                    }
                    if (var607 == 1300) {
                        var2--;
                        int var76 = field3168[var2] - 1;
                        if (var76 >= 0 && var76 <= 9) {
                            var3--;
                            var75.method1864(true, field3172[var3], var76);
                            continue;
                        }
                        var3--;
                        continue;
                    }
                    if (var607 == 1301) {
                        var2 -= 2;
                        int var77 = field3168[var2];
                        int var78 = field3168[var2 + 1];
                        var75.field3844 = class102.method849((byte) -105, var77, var78);
                        continue;
                    }
                    if (var607 == 1302) {
                        var2--;
                        var75.field3876 = field3168[var2] == 1;
                        continue;
                    }
                    if (var607 == 1303) {
                        var2--;
                        var75.field3898 = field3168[var2];
                        continue;
                    }
                    if (var607 == 1304) {
                        var2--;
                        var75.field3845 = field3168[var2];
                        continue;
                    }
                    if (var607 == 1305) {
                        var3--;
                        var75.field3863 = field3172[var3];
                        continue;
                    }
                    if (var607 == 1306) {
                        var3--;
                        var75.field3753 = field3172[var3];
                        continue;
                    }
                    if (var607 == 1307) {
                        var75.field3795 = null;
                        continue;
                    }
                    if (var607 == 1308) {
                        var2--;
                        var75.field3730 = field3168[var2];
                        var2--;
                        var75.field3746 = field3168[var2];
                        continue;
                    }
                    if (var607 == 1309) {
                        var2--;
                        int var79 = field3168[var2];
                        var2--;
                        int var80 = field3168[var2];
                        if (var80 >= 1 && var80 <= 10) {
                            var75.method1866(-18264, var79, var80 - 1);
                        }
                        continue;
                    }
                    if (var607 == 1310) {
                        var3--;
                        var75.field3741 = field3172[var3];
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var606) {
            if (arg0.field2220 == null) {
                class282.method2003("CS2 - scr:" + arg0.field499 + " op:" + var7, -24830, var606);
            } else {
                class373.method2380(19380, "Clientscript error in: " + arg0.field2220);
                StringBuffer var603 = new StringBuffer(30);
                var603.append("Clientscript error in: ").append(arg0.field2220).append("\n");
                for (int var604 = field3176 - 1; var604 >= 0; var604--) {
                    var603.append("via: ").append(field3179[var604].field2207.field2220).append("\n");
                }
                var603.append("Op: ").append(var7).append("\n");
                String var605 = var606.getMessage();
                if (var605 != null && var605.length() > 0) {
                    var603.append("Message: ").append(var605).append("\n");
                }
                class282.method2003(var603.toString(), -24830, var606);
                class319.method2135(var603.toString(), (byte) -110);
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V", line = 6930)
    public static final void method1638(int arg0) {
        if (arg0 == -1 || !class51.method407(arg0, 4)) {
            return;
        }
        class258[] var1 = class45.field710[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class258 var3 = var1[var2];
            if (var3.field3802 != null) {
                class254 var4 = new class254();
                var4.field3678 = var3;
                var4.field3683 = var3.field3802;
                method1634(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(III)V", line = 6966)
    public static final void method1639(int arg0, int arg1, int arg2) {
        class140 var3 = class432.method2682(arg2, arg1, (byte) -128, arg0);
        if (var3 == null) {
            return;
        }
        field3167 = new int[var3.field2224];
        field3170 = new String[var3.field2222];
        if (var3.field2219 == 15 || var3.field2219 == 17 || var3.field2219 == 16) {
            int var4 = 0;
            int var5 = 0;
            if (class331.field4759 != null) {
                var4 = class331.field4759.field3750;
                var5 = class331.field4759.field3908;
            }
            field3167[0] = class129.field2111 - var4;
            field3167[1] = class291.field4327 - var5;
        }
        method1637(var3, 200000);
    }
}
