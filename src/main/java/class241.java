import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class241 {

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "[[I")
    private static int[][] field3204 = new int[5][5000];

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    private static int field3205 = 0;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    private static int field3213 = 0;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "[Lji;")
    private static class609[] field3211 = new class609[50];

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "[I")
    private static int[] field3219 = new int[5];

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "[Ljava/lang/String;")
    private static String[] field3216 = new String[1000];

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "[I")
    private static int[] field3226 = new int[1000];

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "I")
    private static int field3228 = 0;

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "Ljava/util/Calendar;")
    private static Calendar field3227 = Calendar.getInstance();

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "[I")
    private static int[] field3230 = new int[3];

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "[Ljava/lang/String;")
    private static String[] field3231 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "Lpca;")
    public static class714 field3229 = new class714(4);

    @OriginalMember(owner = "client!bj", name = "C", descriptor = "I")
    private static int field3232 = 0;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "Lcfa;")
    private static class166 field3214;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "Ljb;")
    private static class493 field3209;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "Ljb;")
    private static class493 field3224;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "[I")
    private static int[] field3206;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "[Ljava/lang/String;")
    private static String[] field3212;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(C)I", line = 12)
    private static final int method1532(char arg0) {
        return class726.method4082(arg0, (byte) -85) ? 1 : 0;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "()V", line = 18)
    public static void method1533() {
        field3206 = null;
        field3212 = null;
        field3219 = null;
        field3204 = null;
        field3226 = null;
        field3216 = null;
        field3211 = null;
        field3209 = null;
        field3224 = null;
        field3214 = null;
        field3227 = null;
        field3231 = null;
        field3230 = null;
        field3229 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 40)
    private static final void method1534(int arg0) {
        class493 var1 = class127.method854((byte) -107, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class493[] var3 = class419.field5914[var2];
        if (var3 == null) {
            class493[] var4 = class37.field475[var2];
            int var5 = var4.length;
            var3 = class419.field5914[var2] = new class493[var5];
            class255.method1693(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class255.method1693(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lws;I)V", line = 91)
    private static final void method1535(class357 arg0, int arg1) {
        Object[] var2 = arg0.field5076;
        int var3 = (Integer) var2[0];
        class648 var4 = class254.method1683((byte) -88, var3);
        if (var4 == null) {
            return;
        }
        field3206 = new int[var4.field8913];
        int var5 = 0;
        field3212 = new String[var4.field8914];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field5073;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field5084;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field5082 == null ? -1 : arg0.field5082.field6956;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field5081;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field5082 == null ? -1 : arg0.field5082.field6944;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field5074 == null ? -1 : arg0.field5074.field6956;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field5074 == null ? -1 : arg0.field5074.field6944;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field5085;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field5072;
                }
                field3206[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field5080;
                }
                field3212[var6++] = var9;
            }
        }
        field3232 = arg0.field5075;
        method1545(var4, arg1);
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V", line = 172)
    public static final void method1536(int arg0) {
        if (arg0 == -1 || !class393.method2476(114, arg0)) {
            return;
        }
        class493[] var1 = class37.field475[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class493 var3 = var1[var2];
            if (var3.field7112 != null) {
                class357 var4 = new class357();
                var4.field5082 = var3;
                var4.field5076 = var3.field7112;
                method1535(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)Ljava/lang/String;", line = 204)
    private static final String method1537(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field3227.setTime(new Date(var1));
        int var3 = field3227.get(5);
        int var4 = field3227.get(2);
        int var5 = field3227.get(1);
        return var3 + "-" + field3231[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZ)V", line = 218)
    private static final void method1538(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field3228 -= 3;
                int var2 = field3226[field3228];
                int var3 = field3226[field3228 + 1];
                int var4 = field3226[field3228 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class493 var5 = class127.method854((byte) -125, var2);
                if (var5.field7009 == null) {
                    var5.field7009 = new class493[var4 + 1];
                }
                if (var5.field7009.length <= var4) {
                    class493[] var6 = new class493[var4 + 1];
                    for (int var7 = 0; var7 < var5.field7009.length; var7++) {
                        var6[var7] = var5.field7009[var7];
                    }
                    var5.field7009 = var6;
                }
                if (var4 > 0 && var5.field7009[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class493 var8 = new class493();
                var8.field7016 = var3;
                var8.field7078 = var8.field6956 = var5.field6956;
                var8.field6944 = var4;
                var5.field7009[var4] = var8;
                if (arg1) {
                    field3224 = var8;
                } else {
                    field3209 = var8;
                }
                class543.method3149(var5, 1);
                return;
            }
            if (arg0 == 101) {
                class493 var9 = arg1 ? field3224 : field3209;
                if (var9.field6944 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class493 var10 = class127.method854((byte) -105, var9.field6956);
                var10.field7009[var9.field6944] = null;
                class543.method3149(var10, 1);
                return;
            }
            if (arg0 == 102) {
                class493 var11 = class127.method854((byte) -80, field3226[--field3228]);
                var11.field7009 = null;
                class543.method3149(var11, 1);
                return;
            }
            if (arg0 == 200) {
                field3228 -= 2;
                int var12 = field3226[field3228];
                int var13 = field3226[field3228 + 1];
                class493 var14 = class323.method2083(var12, (byte) -108, var13);
                if (var14 != null && var13 != -1) {
                    field3226[field3228++] = 1;
                    if (arg1) {
                        field3224 = var14;
                        return;
                    }
                    field3209 = var14;
                    return;
                }
                field3226[field3228++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field3226[--field3228];
                class493 var16 = class127.method854((byte) -79, var15);
                if (var16 != null) {
                    field3226[field3228++] = 1;
                    if (arg1) {
                        field3224 = var16;
                        return;
                    }
                    field3209 = var16;
                    return;
                }
                field3226[field3228++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field3226[--field3228];
                method1540(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field3226[--field3228];
                method1534(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field3228 -= 2;
                int var19 = field3226[field3228];
                int var20 = field3226[field3228 + 1];
                if (class660.field9039.field3983 == null) {
                    return;
                }
                for (int var21 = 0; var21 < class104.field1234.length; var21++) {
                    if (class104.field1234[var21] == var19) {
                        class660.field9039.field3983.method3488(class606.field8530, var21, 104, var20);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class634.field8743.length; var22++) {
                    if (class634.field8743[var22] == var19) {
                        class660.field9039.field3983.method3488(class606.field8530, var22, 99, var20);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field3228 -= 2;
                int var23 = field3226[field3228];
                int var24 = field3226[field3228 + 1];
                if (class660.field9039.field3983 == null) {
                    return;
                }
                class660.field9039.field3983.method3489(-27417, var23, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field3226[--field3228] != 0;
                if (class660.field9039.field3983 == null) {
                    return;
                }
                class660.field9039.field3983.method3490(var25, (byte) 122);
                return;
            }
            if (arg0 == 411) {
                field3228 -= 2;
                int var26 = field3226[field3228];
                int var27 = field3226[field3228 + 1];
                if (class660.field9039.field3983 == null) {
                    return;
                }
                class660.field9039.field3983.method3493(class682.field9361, var26, var27, 0);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class493 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class127.method854((byte) -92, field3226[--field3228]);
            } else {
                var28 = arg1 ? field3224 : field3209;
            }
            if (arg0 == 1000) {
                field3228 -= 4;
                var28.field7100 = field3226[field3228];
                var28.field7035 = field3226[field3228 + 1];
                int var29 = field3226[field3228 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field3226[field3228 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field6958 = (byte) var29;
                var28.field7102 = (byte) var30;
                class543.method3149(var28, 1);
                class508.method2999(false, var28);
                if (var28.field6944 == -1) {
                    class191.method1189(var28.field6956, (byte) -34);
                }
                return;
            }
            if (arg0 == 1001) {
                field3228 -= 4;
                var28.field7098 = field3226[field3228];
                var28.field6983 = field3226[field3228 + 1];
                var28.field7101 = 0;
                var28.field7065 = 0;
                int var31 = field3226[field3228 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field3226[field3228 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field6950 = (byte) var31;
                var28.field7006 = (byte) var32;
                class543.method3149(var28, 1);
                class508.method2999(false, var28);
                if (var28.field7016 == 0) {
                    class107.method765(false, true, var28);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field3226[--field3228] == 1;
                if (var28.field7020 != var33) {
                    var28.field7020 = var33;
                    class543.method3149(var28, 1);
                }
                if (var28.field6944 == -1) {
                    class734.method4109((byte) -99, var28.field6956);
                }
                return;
            }
            if (arg0 == 1004) {
                field3228 -= 2;
                var28.field7087 = field3226[field3228];
                var28.field6982 = field3226[field3228 + 1];
                class543.method3149(var28, 1);
                class508.method2999(false, var28);
                if (var28.field7016 == 0) {
                    class107.method765(false, true, var28);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field6979 = field3226[--field3228] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class493 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class127.method854((byte) -115, field3226[--field3228]);
            } else {
                var34 = arg1 ? field3224 : field3209;
            }
            if (arg0 == 1100) {
                field3228 -= 2;
                var34.field7046 = field3226[field3228];
                if (var34.field7046 > var34.field7007 - var34.field7095) {
                    var34.field7046 = var34.field7007 - var34.field7095;
                }
                if (var34.field7046 < 0) {
                    var34.field7046 = 0;
                }
                var34.field7073 = field3226[field3228 + 1];
                if (var34.field7073 > var34.field6969 - var34.field7031) {
                    var34.field7073 = var34.field6969 - var34.field7031;
                }
                if (var34.field7073 < 0) {
                    var34.field7073 = 0;
                }
                class543.method3149(var34, 1);
                if (var34.field6944 == -1) {
                    class327.method2128(var34.field6956, 113);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field7062 = field3226[--field3228];
                class543.method3149(var34, 1);
                if (var34.field6944 == -1) {
                    class105.method754(var34.field6956, 19412);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field7027 = field3226[--field3228] == 1;
                class543.method3149(var34, 1);
                return;
            }
            if (arg0 == 1103) {
                var34.field7070 = field3226[--field3228];
                class543.method3149(var34, 1);
                return;
            }
            if (arg0 == 1104) {
                var34.field6977 = field3226[--field3228];
                class543.method3149(var34, 1);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field3226[--field3228];
                if (var34.field7029 != var35) {
                    var34.field7029 = var35;
                    class543.method3149(var34, 1);
                }
                if (var34.field6944 == -1) {
                    class344.method2233(14, var34.field6956);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field7072 = field3226[--field3228];
                class543.method3149(var34, 1);
                return;
            }
            if (arg0 == 1107) {
                var34.field6967 = field3226[--field3228] == 1;
                class543.method3149(var34, 1);
                return;
            }
            if (arg0 == 1108) {
                var34.field7082 = 1;
                var34.field6997 = field3226[--field3228];
                class543.method3149(var34, 1);
                if (var34.field6944 == -1) {
                    class139.method984(var34.field6956, (byte) 45);
                }
                return;
            }
            if (arg0 == 1109) {
                field3228 -= 6;
                var34.field7080 = field3226[field3228];
                var34.field7001 = field3226[field3228 + 1];
                var34.field6981 = field3226[field3228 + 2];
                var34.field7063 = field3226[field3228 + 3];
                var34.field7011 = field3226[field3228 + 4];
                var34.field7083 = field3226[field3228 + 5];
                class543.method3149(var34, 1);
                if (var34.field6944 == -1) {
                    class758.method4209(-61, var34.field6956);
                    class589.method3334(var34.field6956, (byte) -91);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field3226[--field3228];
                if (var34.field6976 != var36) {
                    var34.field6976 = var36;
                    var34.field7024 = 0;
                    var34.field7030 = 1;
                    var34.field6987 = 0;
                    class709 var37 = var34.field6976 == -1 ? null : class343.field4785.method3525(var34.field6976, (byte) 124);
                    if (var37 != null) {
                        class469.method2803((byte) 127, var34.field7024, var37);
                    }
                    class543.method3149(var34, 1);
                }
                if (var34.field6944 == -1) {
                    class544.method3152(2923, var34.field6956);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field7050 = field3226[--field3228] == 1;
                class543.method3149(var34, 1);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field3216[--field3213];
                if (!var38.equals(var34.field6966)) {
                    var34.field6966 = var38;
                    class543.method3149(var34, 1);
                }
                if (var34.field6944 == -1) {
                    class185.method1168(var34.field6956, 0);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field6973 = field3226[--field3228];
                class543.method3149(var34, 1);
                if (var34.field6944 == -1) {
                    class234.method1503(var34.field6956, 16);
                }
                return;
            }
            if (arg0 == 1114) {
                field3228 -= 3;
                var34.field7092 = field3226[field3228];
                var34.field7074 = field3226[field3228 + 1];
                var34.field6961 = field3226[field3228 + 2];
                class543.method3149(var34, 1);
                return;
            }
            if (arg0 == 1115) {
                var34.field6994 = field3226[--field3228] == 1;
                class543.method3149(var34, 1);
                return;
            }
            if (arg0 == 1116) {
                var34.field6951 = field3226[--field3228];
                class543.method3149(var34, 1);
                return;
            }
            if (arg0 == 1117) {
                var34.field7039 = field3226[--field3228];
                class543.method3149(var34, 1);
                return;
            }
            if (arg0 == 1118) {
                var34.field7002 = field3226[--field3228] == 1;
                class543.method3149(var34, 1);
                return;
            }
            if (arg0 == 1119) {
                var34.field7023 = field3226[--field3228] == 1;
                class543.method3149(var34, 1);
                return;
            }
            if (arg0 == 1120) {
                field3228 -= 2;
                var34.field7007 = field3226[field3228];
                var34.field6969 = field3226[field3228 + 1];
                class543.method3149(var34, 1);
                if (var34.field7016 == 0) {
                    class107.method765(false, true, var34);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field7025 = field3226[--field3228] == 1;
                class543.method3149(var34, 1);
                return;
            }
            if (arg0 == 1123) {
                var34.field7083 = field3226[--field3228];
                class543.method3149(var34, 1);
                if (var34.field6944 == -1) {
                    class758.method4209(-123, var34.field6956);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field3226[--field3228];
                var34.field6990 = var39 == 1;
                class543.method3149(var34, 1);
                return;
            }
            if (arg0 == 1125) {
                field3228 -= 2;
                var34.field7018 = field3226[field3228];
                var34.field7033 = field3226[field3228 + 1];
                class543.method3149(var34, 1);
                return;
            }
            if (arg0 == 1126) {
                var34.field7028 = field3226[--field3228];
                class543.method3149(var34, 1);
                return;
            }
            if (arg0 == 1127) {
                field3228 -= 2;
                int var40 = field3226[field3228];
                int var41 = field3226[field3228 + 1];
                class82 var42 = class605.field8497.method154(var40, (byte) -99);
                if (var42.field1025 != var41) {
                    var34.method2939(var40, -109, var41);
                    return;
                }
                var34.method2933(1880231200, var40);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field3226[--field3228];
                String var44 = field3216[--field3213];
                class82 var45 = class605.field8497.method154(var43, (byte) -70);
                if (!var45.field1031.equals(var44)) {
                    var34.method2949(var43, (byte) -98, var44);
                    return;
                }
                var34.method2933(1880231200, var43);
                return;
            }
            if (arg0 == 1129 || arg0 == 1130) {
                int var46 = field3226[--field3228];
                if (var34.field7016 != 5 && arg0 == 1129 || var34.field7016 != 4 && arg0 == 1130) {
                    return;
                }
                if (var34.field7037 != var46) {
                    var34.field7037 = var46;
                    class543.method3149(var34, 1);
                }
                if (var34.field6944 == -1) {
                    class100.method726(var34.field6956, (byte) 102);
                }
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class493 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class127.method854((byte) -94, field3226[--field3228]);
            } else {
                var47 = arg1 ? field3224 : field3209;
            }
            class543.method3149(var47, 1);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field3228 -= 2;
                int var48 = field3226[field3228];
                int var49 = field3226[field3228 + 1];
                if (var47.field6944 == -1) {
                    class129.method871(var47.field6956, 9);
                    class758.method4209(-117, var47.field6956);
                    class589.method3334(var47.field6956, (byte) -91);
                }
                if (var48 == -1) {
                    var47.field7082 = 1;
                    var47.field6997 = -1;
                    var47.field6952 = -1;
                    return;
                }
                var47.field6952 = var48;
                var47.field7057 = var49;
                if (arg0 == 1208 || arg0 == 1209) {
                    var47.field6970 = true;
                } else {
                    var47.field6970 = false;
                }
                class551 var50 = class682.field9361.method3424(var48, false);
                var47.field6981 = var50.field7701;
                var47.field7063 = var50.field7726;
                var47.field7011 = var50.field7712;
                var47.field7080 = var50.field7731;
                var47.field7001 = var50.field7697;
                var47.field7083 = var50.field7705;
                if (arg0 == 1205 || arg0 == 1209) {
                    var47.field6959 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var47.field6959 = 1;
                } else {
                    var47.field6959 = 2;
                }
                if (var47.field7101 > 0) {
                    var47.field7083 = var47.field7083 * 32 / var47.field7101;
                    return;
                }
                if (var47.field7098 > 0) {
                    var47.field7083 = var47.field7083 * 32 / var47.field7098;
                }
                return;
            }
            if (arg0 == 1201) {
                var47.field7082 = 2;
                var47.field6997 = field3226[--field3228];
                if (var47.field6944 == -1) {
                    class139.method984(var47.field6956, (byte) 120);
                }
                return;
            }
            if (arg0 == 1202) {
                var47.field7082 = 3;
                var47.field6997 = -1;
                if (var47.field6944 == -1) {
                    class139.method984(var47.field6956, (byte) 47);
                }
                return;
            }
            if (arg0 == 1203) {
                var47.field7082 = 6;
                var47.field6997 = field3226[--field3228];
                if (var47.field6944 == -1) {
                    class139.method984(var47.field6956, (byte) 95);
                }
                return;
            }
            if (arg0 == 1204) {
                var47.field7082 = 5;
                var47.field6997 = field3226[--field3228];
                if (var47.field6944 == -1) {
                    class139.method984(var47.field6956, (byte) 112);
                }
                return;
            }
            if (arg0 == 1206) {
                field3228 -= 4;
                var47.field7088 = field3226[field3228];
                var47.field6943 = field3226[field3228 + 1];
                var47.field6953 = field3226[field3228 + 2];
                var47.field6945 = field3226[field3228 + 3];
                class543.method3149(var47, 1);
                return;
            }
            if (arg0 == 1207) {
                field3228 -= 2;
                var47.field6971 = field3226[field3228];
                var47.field6995 = field3226[field3228 + 1];
                class543.method3149(var47, 1);
                return;
            }
            if (arg0 == 1210) {
                field3228 -= 4;
                var47.field6997 = field3226[field3228];
                var47.field7047 = field3226[field3228 + 1];
                if (field3226[field3228 + 2] == 1) {
                    var47.field7082 = 9;
                } else {
                    var47.field7082 = 8;
                }
                if (field3226[field3228 + 3] == 1) {
                    var47.field6970 = true;
                } else {
                    var47.field6970 = false;
                }
                if (var47.field6944 == -1) {
                    class139.method984(var47.field6956, (byte) 109);
                }
                return;
            }
            if (arg0 == 1211) {
                var47.field7082 = 5;
                var47.field6997 = class389.field5512;
                var47.field7047 = 0;
                if (var47.field6944 == -1) {
                    class139.method984(var47.field6956, (byte) 105);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class493 var62;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var62 = class127.method854((byte) -101, field3226[--field3228]);
                } else {
                    var62 = arg1 ? field3224 : field3209;
                }
                if (arg0 == 1499) {
                    var62.method2935((byte) -79);
                    return;
                }
                String var63 = field3216[--field3213];
                int[] var64 = null;
                if (var63.length() > 0 && var63.charAt(var63.length() - 1) == 'Y') {
                    int var65 = field3226[--field3228];
                    if (var65 > 0) {
                        var64 = new int[var65];
                        while (var65-- > 0) {
                            var64[var65] = field3226[--field3228];
                        }
                    }
                    var63 = var63.substring(0, var63.length() - 1);
                }
                Object[] var66 = new Object[var63.length() + 1];
                for (int var67 = var66.length - 1; var67 >= 1; var67--) {
                    if (var63.charAt(var67 - 1) == 's') {
                        var66[var67] = field3216[--field3213];
                    } else {
                        var66[var67] = Integer.valueOf(field3226[--field3228]);
                    }
                }
                int var68 = field3226[--field3228];
                if (var68 == -1) {
                    var66 = null;
                } else {
                    var66[0] = Integer.valueOf(var68);
                }
                if (arg0 == 1400) {
                    var62.field6960 = var66;
                } else if (arg0 == 1401) {
                    var62.field7094 = var66;
                } else if (arg0 == 1402) {
                    var62.field7097 = var66;
                } else if (arg0 == 1403) {
                    var62.field7049 = var66;
                } else if (arg0 == 1404) {
                    var62.field6946 = var66;
                } else if (arg0 == 1405) {
                    var62.field6993 = var66;
                } else if (arg0 == 1406) {
                    var62.field7012 = var66;
                } else if (arg0 == 1407) {
                    var62.field6948 = var66;
                    var62.field7089 = var64;
                } else if (arg0 == 1408) {
                    var62.field7110 = var66;
                } else if (arg0 == 1409) {
                    var62.field7040 = var66;
                } else if (arg0 == 1410) {
                    var62.field7044 = var66;
                } else if (arg0 == 1411) {
                    var62.field7026 = var66;
                } else if (arg0 == 1412) {
                    var62.field7036 = var66;
                } else if (arg0 == 1414) {
                    var62.field7115 = var66;
                    var62.field7008 = var64;
                } else if (arg0 == 1415) {
                    var62.field6988 = var66;
                    var62.field7022 = var64;
                } else if (arg0 == 1416) {
                    var62.field6978 = var66;
                } else if (arg0 == 1417) {
                    var62.field6985 = var66;
                } else if (arg0 == 1418) {
                    var62.field7032 = var66;
                } else if (arg0 == 1419) {
                    var62.field7058 = var66;
                } else if (arg0 == 1420) {
                    var62.field6957 = var66;
                } else if (arg0 == 1421) {
                    var62.field7085 = var66;
                } else if (arg0 == 1422) {
                    var62.field6965 = var66;
                } else if (arg0 == 1423) {
                    var62.field7017 = var66;
                } else if (arg0 == 1424) {
                    var62.field7048 = var66;
                } else if (arg0 == 1425) {
                    var62.field7108 = var66;
                } else if (arg0 == 1426) {
                    var62.field6999 = var66;
                } else if (arg0 == 1427) {
                    var62.field7038 = var66;
                } else if (arg0 == 1428) {
                    var62.field7000 = var66;
                    var62.field6986 = var64;
                } else if (arg0 == 1429) {
                    var62.field7060 = var66;
                    var62.field7113 = var64;
                } else if (arg0 == 1430) {
                    var62.field6964 = var66;
                }
                var62.field6947 = true;
                return;
            }
            if (arg0 < 1600) {
                class493 var69 = arg1 ? field3224 : field3209;
                if (arg0 == 1500) {
                    field3226[field3228++] = var69.field6954;
                    return;
                }
                if (arg0 == 1501) {
                    field3226[field3228++] = var69.field6975;
                    return;
                }
                if (arg0 == 1502) {
                    field3226[field3228++] = var69.field7095;
                    return;
                }
                if (arg0 == 1503) {
                    field3226[field3228++] = var69.field7031;
                    return;
                }
                if (arg0 == 1504) {
                    field3226[field3228++] = var69.field7020 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field3226[field3228++] = var69.field7078;
                    return;
                }
                if (arg0 == 1506) {
                    class493 var70 = class315.method2032(var69, true);
                    field3226[field3228++] = var70 == null ? -1 : var70.field6956;
                    return;
                }
            } else if (arg0 < 1700) {
                class493 var71 = arg1 ? field3224 : field3209;
                if (arg0 == 1600) {
                    field3226[field3228++] = var71.field7046;
                    return;
                }
                if (arg0 == 1601) {
                    field3226[field3228++] = var71.field7073;
                    return;
                }
                if (arg0 == 1602) {
                    field3216[field3213++] = var71.field6966;
                    return;
                }
                if (arg0 == 1603) {
                    field3226[field3228++] = var71.field7007;
                    return;
                }
                if (arg0 == 1604) {
                    field3226[field3228++] = var71.field6969;
                    return;
                }
                if (arg0 == 1605) {
                    field3226[field3228++] = var71.field7083;
                    return;
                }
                if (arg0 == 1606) {
                    field3226[field3228++] = var71.field6981;
                    return;
                }
                if (arg0 == 1607) {
                    field3226[field3228++] = var71.field7011;
                    return;
                }
                if (arg0 == 1608) {
                    field3226[field3228++] = var71.field7063;
                    return;
                }
                if (arg0 == 1609) {
                    field3226[field3228++] = var71.field7070;
                    return;
                }
                if (arg0 == 1610) {
                    field3226[field3228++] = var71.field7080;
                    return;
                }
                if (arg0 == 1611) {
                    field3226[field3228++] = var71.field7001;
                    return;
                }
                if (arg0 == 1612) {
                    field3226[field3228++] = var71.field7029;
                    return;
                }
                if (arg0 == 1613) {
                    int var72 = field3226[--field3228];
                    class82 var73 = class605.field8497.method154(var72, (byte) -88);
                    if (var73.method634(0)) {
                        field3216[field3213++] = var71.method2946(var72, false, var73.field1031);
                        return;
                    }
                    field3226[field3228++] = var71.method2932(var73.field1025, var72, (byte) 30);
                    return;
                }
                if (arg0 == 1614) {
                    field3226[field3228++] = var71.field7072;
                    return;
                }
                if (arg0 == 2614) {
                    field3226[field3228++] = var71.field7082 == 1 ? var71.field6997 : -1;
                    return;
                }
            } else if (arg0 < 1800) {
                class493 var74 = arg1 ? field3224 : field3209;
                if (arg0 == 1700) {
                    field3226[field3228++] = var74.field6952;
                    return;
                }
                if (arg0 == 1701) {
                    if (var74.field6952 != -1) {
                        field3226[field3228++] = var74.field7057;
                        return;
                    }
                    field3226[field3228++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field3226[field3228++] = var74.field6944;
                    return;
                }
            } else if (arg0 < 1900) {
                class493 var75 = arg1 ? field3224 : field3209;
                if (arg0 == 1800) {
                    field3226[field3228++] = client.method1950(var75).method2855(false);
                    return;
                }
                if (arg0 == 1801) {
                    int var76 = field3226[--field3228];
                    int var357 = var76 - 1;
                    if (var75.field7005 != null && var357 < var75.field7005.length && var75.field7005[var357] != null) {
                        field3216[field3213++] = var75.field7005[var357];
                        return;
                    }
                    field3216[field3213++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var75.field6991 == null) {
                        field3216[field3213++] = "";
                        return;
                    }
                    field3216[field3213++] = var75.field6991;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class493 var355;
                if (arg0 >= 2000) {
                    var355 = class127.method854((byte) -85, field3226[--field3228]);
                    arg0 -= 1000;
                } else {
                    var355 = arg1 ? field3224 : field3209;
                }
                if (field3232 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var355.field7038 == null) {
                        return;
                    }
                    class357 var356 = new class357();
                    var356.field5082 = var355;
                    var356.field5076 = var355.field7038;
                    var356.field5075 = field3232 + 1;
                    class243.field3247.method2770((byte) -13, var356);
                    return;
                }
            } else if (arg0 < 2600) {
                class493 var77 = class127.method854((byte) -112, field3226[--field3228]);
                if (arg0 == 2500) {
                    field3226[field3228++] = var77.field6954;
                    return;
                }
                if (arg0 == 2501) {
                    field3226[field3228++] = var77.field6975;
                    return;
                }
                if (arg0 == 2502) {
                    field3226[field3228++] = var77.field7095;
                    return;
                }
                if (arg0 == 2503) {
                    field3226[field3228++] = var77.field7031;
                    return;
                }
                if (arg0 == 2504) {
                    field3226[field3228++] = var77.field7020 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field3226[field3228++] = var77.field7078;
                    return;
                }
                if (arg0 == 1506) {
                    class493 var78 = class315.method2032(var77, true);
                    field3226[field3228++] = var78 == null ? -1 : var78.field6956;
                    return;
                }
            } else if (arg0 < 2700) {
                class493 var79 = class127.method854((byte) -84, field3226[--field3228]);
                if (arg0 == 2600) {
                    field3226[field3228++] = var79.field7046;
                    return;
                }
                if (arg0 == 2601) {
                    field3226[field3228++] = var79.field7073;
                    return;
                }
                if (arg0 == 2602) {
                    field3216[field3213++] = var79.field6966;
                    return;
                }
                if (arg0 == 2603) {
                    field3226[field3228++] = var79.field7007;
                    return;
                }
                if (arg0 == 2604) {
                    field3226[field3228++] = var79.field6969;
                    return;
                }
                if (arg0 == 2605) {
                    field3226[field3228++] = var79.field7083;
                    return;
                }
                if (arg0 == 2606) {
                    field3226[field3228++] = var79.field6981;
                    return;
                }
                if (arg0 == 2607) {
                    field3226[field3228++] = var79.field7011;
                    return;
                }
                if (arg0 == 2608) {
                    field3226[field3228++] = var79.field7063;
                    return;
                }
                if (arg0 == 2609) {
                    field3226[field3228++] = var79.field7070;
                    return;
                }
                if (arg0 == 2610) {
                    field3226[field3228++] = var79.field7080;
                    return;
                }
                if (arg0 == 2611) {
                    field3226[field3228++] = var79.field7001;
                    return;
                }
                if (arg0 == 2612) {
                    field3226[field3228++] = var79.field7029;
                    return;
                }
                if (arg0 == 2613) {
                    field3226[field3228++] = var79.field7072;
                    return;
                }
                if (arg0 == 2614) {
                    field3226[field3228++] = var79.field7082 == 1 ? var79.field6997 : -1;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class493 var80 = class127.method854((byte) -117, field3226[--field3228]);
                    field3226[field3228++] = var80.field6952;
                    return;
                }
                if (arg0 == 2701) {
                    class493 var81 = class127.method854((byte) -128, field3226[--field3228]);
                    if (var81.field6952 != -1) {
                        field3226[field3228++] = var81.field7057;
                        return;
                    }
                    field3226[field3228++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var82 = field3226[--field3228];
                    class47 var83 = (class47) class475.field6744.method1180((byte) 26, (long) var82);
                    if (var83 != null) {
                        field3226[field3228++] = 1;
                        return;
                    }
                    field3226[field3228++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class493 var84 = class127.method854((byte) -78, field3226[--field3228]);
                    if (var84.field7009 == null) {
                        field3226[field3228++] = 0;
                        return;
                    }
                    int var85 = var84.field7009.length;
                    for (int var86 = 0; var86 < var84.field7009.length; var86++) {
                        if (var84.field7009[var86] == null) {
                            var85 = var86;
                            break;
                        }
                    }
                    field3226[field3228++] = var85;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field3228 -= 2;
                    int var87 = field3226[field3228];
                    int var88 = field3226[field3228 + 1];
                    class47 var89 = (class47) class475.field6744.method1180((byte) 26, (long) var87);
                    if (var89 != null && var89.field550 == var88) {
                        field3226[field3228++] = 1;
                        return;
                    }
                    field3226[field3228++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class493 var90 = class127.method854((byte) -86, field3226[--field3228]);
                if (arg0 == 2800) {
                    field3226[field3228++] = client.method1950(var90).method2855(false);
                    return;
                }
                if (arg0 == 2801) {
                    int var91 = field3226[--field3228];
                    int var358 = var91 - 1;
                    if (var90.field7005 != null && var358 < var90.field7005.length && var90.field7005[var358] != null) {
                        field3216[field3213++] = var90.field7005[var358];
                        return;
                    }
                    field3216[field3213++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var90.field6991 == null) {
                        field3216[field3213++] = "";
                        return;
                    }
                    field3216[field3213++] = var90.field6991;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var92 = field3216[--field3213];
                    class192.method1194((byte) 83, var92);
                    return;
                }
                if (arg0 == 3101) {
                    field3228 -= 2;
                    class534.method3105(class660.field9039, field3226[field3228], (byte) 4, field3226[field3228 + 1]);
                    return;
                }
                if (arg0 == 3103) {
                    class180.method1136(true, -1);
                    return;
                }
                if (arg0 == 3104) {
                    String var93 = field3216[--field3213];
                    int var94 = 0;
                    if (class213.method1310(var93, -17633)) {
                        var94 = class325.method2121(var93, -23213);
                    }
                    field3208++;
                    class519 var95 = class357.method2293(class427.field5994, class486.field6816, (byte) 116);
                    var95.field7384.method3733(-49, var94);
                    class151.method1027(var95, -16);
                    return;
                }
                if (arg0 == 3105) {
                    String var96 = field3216[--field3213];
                    field3210++;
                    class519 var97 = class357.method2293(class427.field5994, class145.field2088, (byte) -51);
                    var97.field7384.method3694(var96.length() + 1, -1528071456);
                    var97.field7384.method3747((byte) 27, var96);
                    class151.method1027(var97, -58);
                    return;
                }
                if (arg0 == 3106) {
                    String var98 = field3216[--field3213];
                    field3221++;
                    class519 var99 = class357.method2293(class427.field5994, class269.field3860, (byte) -85);
                    var99.field7384.method3694(var98.length() + 1, -1528071456);
                    var99.field7384.method3747((byte) 27, var98);
                    class151.method1027(var99, -78);
                    return;
                }
                if (arg0 == 3107) {
                    int var100 = field3226[--field3228];
                    String var101 = field3216[--field3213];
                    class260.method1703(var100, var101, -98);
                    return;
                }
                if (arg0 == 3108) {
                    field3228 -= 3;
                    int var102 = field3226[field3228];
                    int var103 = field3226[field3228 + 1];
                    int var104 = field3226[field3228 + 2];
                    class493 var105 = class127.method854((byte) -103, var104);
                    class681.method3817(var103, var102, true, var105);
                    return;
                }
                if (arg0 == 3109) {
                    field3228 -= 2;
                    int var106 = field3226[field3228];
                    int var107 = field3226[field3228 + 1];
                    class493 var108 = arg1 ? field3224 : field3209;
                    class681.method3817(var107, var106, true, var108);
                    return;
                }
                if (arg0 == 3110) {
                    int var109 = field3226[--field3228];
                    field3207++;
                    class519 var110 = class357.method2293(class427.field5994, class235.field3154, (byte) 53);
                    var110.field7384.method3745(-119, var109);
                    class151.method1027(var110, -112);
                    return;
                }
                if (arg0 == 3111) {
                    field3228 -= 2;
                    int var111 = field3226[field3228];
                    int var112 = field3226[field3228 + 1];
                    class47 var113 = (class47) class475.field6744.method1180((byte) 26, (long) var111);
                    if (var113 != null) {
                        class353.method2275(true, var113.field550 != var112, var113, -123);
                    }
                    class427.method2604(var111, (byte) -125, 3, var112, true);
                    return;
                }
                if (arg0 == 3112) {
                    field3228--;
                    int var114 = field3226[field3228];
                    class47 var115 = (class47) class475.field6744.method1180((byte) 26, (long) var114);
                    if (var115 != null && var115.field553 == 3) {
                        class353.method2275(true, true, var115, -69);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class418.method2565(field3216[--field3213], (byte) -25);
                    return;
                }
                if (arg0 == 3114) {
                    field3228 -= 2;
                    int var116 = field3226[field3228];
                    int var117 = field3226[field3228 + 1];
                    String var118 = field3216[--field3213];
                    class336.method2182(-87, var118, "", var117, "", "", var116);
                    return;
                }
                if (arg0 == 3115) {
                    field3228 -= 11;
                    class3[] var119 = class759.method4211(-11911);
                    class120[] var120 = class720.method4047(25992);
                    class101.method729(field3226[field3228 + 8], field3226[field3228 + 10], -1870, field3226[field3228 + 2], field3226[field3228 + 3], field3226[field3228 + 5], field3226[field3228 + 9], field3226[field3228 + 6], var119[field3226[field3228]], field3226[field3228 + 4], var120[field3226[field3228 + 1]], field3226[field3228 + 7]);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field3228 -= 3;
                    class420.method2576(256, 255, (byte) 115, field3226[field3228 + 1], field3226[field3228], field3226[field3228 + 2]);
                    return;
                }
                if (arg0 == 3201) {
                    class314.method2029(50, 107, field3226[--field3228], 255);
                    return;
                }
                if (arg0 == 3202) {
                    field3228 -= 2;
                    class85.method647(field3226[field3228 + 1], field3226[field3228], 255, false);
                    return;
                }
                if (arg0 == 3203) {
                    field3228 -= 4;
                    class420.method2576(256, field3226[field3228 + 3], (byte) 85, field3226[field3228 + 1], field3226[field3228], field3226[field3228 + 2]);
                    return;
                }
                if (arg0 == 3204) {
                    field3228 -= 3;
                    class314.method2029(field3226[field3228 + 2], 120, field3226[field3228], field3226[field3228 + 1]);
                    return;
                }
                if (arg0 == 3205) {
                    field3228 -= 3;
                    class85.method647(field3226[field3228 + 1], field3226[field3228], field3226[field3228 + 2], false);
                    return;
                }
                if (arg0 == 3206) {
                    field3228 -= 4;
                    class220.method1349(field3226[field3228], false, field3226[field3228 + 1], 256, 9400, field3226[field3228 + 3], field3226[field3228 + 2]);
                    return;
                }
                if (arg0 == 3207) {
                    field3228 -= 4;
                    class220.method1349(field3226[field3228], true, field3226[field3228 + 1], 256, 9400, field3226[field3228 + 3], field3226[field3228 + 2]);
                    return;
                }
                if (arg0 == 3208) {
                    field3228 -= 5;
                    class420.method2576(field3226[field3228 + 4], field3226[field3228 + 3], (byte) 29, field3226[field3228 + 1], field3226[field3228], field3226[field3228 + 2]);
                    return;
                }
                if (arg0 == 3209) {
                    field3228 -= 5;
                    class220.method1349(field3226[field3228], false, field3226[field3228 + 1], field3226[field3228 + 4], 9400, field3226[field3228 + 3], field3226[field3228 + 2]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field3226[field3228++] = class740.field10285;
                    return;
                }
                if (arg0 == 3301) {
                    field3228 -= 2;
                    int var121 = field3226[field3228];
                    int var122 = field3226[field3228 + 1];
                    field3226[field3228++] = class127.method856((byte) 24, false, var121, var122);
                    return;
                }
                if (arg0 == 3302) {
                    field3228 -= 2;
                    int var123 = field3226[field3228];
                    int var124 = field3226[field3228 + 1];
                    field3226[field3228++] = class424.method2595(false, var123, -75, var124);
                    return;
                }
                if (arg0 == 3303) {
                    field3228 -= 2;
                    int var125 = field3226[field3228];
                    int var126 = field3226[field3228 + 1];
                    field3226[field3228++] = class739.method4127(false, var125, var126, -122);
                    return;
                }
                if (arg0 == 3304) {
                    int var127 = field3226[--field3228];
                    field3226[field3228++] = class237.field3177.method819(var127, true).field6373;
                    return;
                }
                if (arg0 == 3305) {
                    int var128 = field3226[--field3228];
                    field3226[field3228++] = class485.field6811[var128];
                    return;
                }
                if (arg0 == 3306) {
                    int var129 = field3226[--field3228];
                    field3226[field3228++] = class377.field5296[var129];
                    return;
                }
                if (arg0 == 3307) {
                    int var130 = field3226[--field3228];
                    field3226[field3228++] = class601.field8435[var130];
                    return;
                }
                if (arg0 == 3308) {
                    byte var131 = class660.field9039.field1266;
                    int var132 = (class660.field9039.field1264 >> 9) + class228.field3063;
                    int var133 = (class660.field9039.field1250 >> 9) + class3.field30;
                    field3226[field3228++] = (var131 << 28) + (var132 << 14) + var133;
                    return;
                }
                if (arg0 == 3309) {
                    int var134 = field3226[--field3228];
                    field3226[field3228++] = var134 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var135 = field3226[--field3228];
                    field3226[field3228++] = var135 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var136 = field3226[--field3228];
                    field3226[field3228++] = var136 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field3226[field3228++] = class192.field2572 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field3228 -= 2;
                    int var137 = field3226[field3228];
                    int var138 = field3226[field3228 + 1];
                    field3226[field3228++] = class127.method856((byte) 24, true, var137, var138);
                    return;
                }
                if (arg0 == 3314) {
                    field3228 -= 2;
                    int var139 = field3226[field3228];
                    int var140 = field3226[field3228 + 1];
                    field3226[field3228++] = class424.method2595(true, var139, -127, var140);
                    return;
                }
                if (arg0 == 3315) {
                    field3228 -= 2;
                    int var141 = field3226[field3228];
                    int var142 = field3226[field3228 + 1];
                    field3226[field3228++] = class739.method4127(true, var141, var142, -77);
                    return;
                }
                if (arg0 == 3316) {
                    if (class399.field5645 >= 2) {
                        field3226[field3228++] = class399.field5645;
                        return;
                    }
                    field3226[field3228++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field3226[field3228++] = class561.field7879;
                    return;
                }
                if (arg0 == 3318) {
                    field3226[field3228++] = class584.field8222.field10399;
                    return;
                }
                if (arg0 == 3321) {
                    field3226[field3228++] = class2.field20;
                    return;
                }
                if (arg0 == 3322) {
                    field3226[field3228++] = class357.field5083;
                    return;
                }
                if (arg0 == 3323) {
                    if (class439.field6251 >= 5 && class439.field6251 <= 9) {
                        field3226[field3228++] = 1;
                        return;
                    }
                    field3226[field3228++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class439.field6251 >= 5 && class439.field6251 <= 9) {
                        field3226[field3228++] = class439.field6251;
                        return;
                    }
                    field3226[field3228++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field3226[field3228++] = class758.field10534 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field3226[field3228++] = class660.field9039.field3954;
                    return;
                }
                if (arg0 == 3327) {
                    field3226[field3228++] = class660.field9039.field3983 != null && class660.field9039.field3983.field8661 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field3226[field3228++] = class603.field8476 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var143 = field3226[--field3228];
                    field3226[field3228++] = class680.method3810(false, (byte) 99, var143);
                    return;
                }
                if (arg0 == 3331) {
                    field3228 -= 2;
                    int var144 = field3226[field3228];
                    int var145 = field3226[field3228 + 1];
                    field3226[field3228++] = class222.method1353(var145, -2705, false, false, var144);
                    return;
                }
                if (arg0 == 3332) {
                    field3228 -= 2;
                    int var146 = field3226[field3228];
                    int var147 = field3226[field3228 + 1];
                    field3226[field3228++] = class222.method1353(var147, -2705, false, true, var146);
                    return;
                }
                if (arg0 == 3333) {
                    field3226[field3228++] = class343.field4791;
                    return;
                }
                if (arg0 == 3335) {
                    field3226[field3228++] = class549.field7669;
                    return;
                }
                if (arg0 == 3336) {
                    field3228 -= 4;
                    int var148 = field3226[field3228];
                    int var149 = field3226[field3228 + 1];
                    int var150 = field3226[field3228 + 2];
                    int var151 = field3226[field3228 + 3];
                    int var152 = (var149 << 14) + var148;
                    int var153 = (var150 << 28) + var152;
                    int var154 = var151 + var153;
                    field3226[field3228++] = var154;
                    return;
                }
                if (arg0 == 3337) {
                    field3226[field3228++] = class638.field8771;
                    return;
                }
                if (arg0 == 3338) {
                    field3226[field3228++] = class675.method3740(107);
                    return;
                }
                if (arg0 == 3339) {
                    field3226[field3228++] = 0;
                    return;
                }
                if (arg0 == 3340) {
                    field3226[field3228++] = class70.field876 ? 1 : 0;
                    return;
                }
                if (arg0 == 3341) {
                    field3226[field3228++] = class472.field6695 ? 1 : 0;
                    return;
                }
                if (arg0 == 3342) {
                    field3226[field3228++] = class530.field7470.method1094(-89);
                    return;
                }
                if (arg0 == 3343) {
                    field3226[field3228++] = class530.field7470.method1089((byte) -63);
                    return;
                }
                if (arg0 == 3344) {
                    field3216[field3213++] = class97.method714(122);
                    return;
                }
                if (arg0 == 3345) {
                    field3216[field3213++] = class654.method3595(false);
                    return;
                }
                if (arg0 == 3346) {
                    field3226[field3228++] = class745.method4146(76);
                    return;
                }
                if (arg0 == 3347) {
                    field3226[field3228++] = class649.field8922;
                    return;
                }
                if (arg0 == 3349) {
                    field3226[field3228++] = class660.field9039.field7917.method2122(-1) >> 3;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field3228 -= 2;
                    int var155 = field3226[field3228];
                    int var156 = field3226[field3228 + 1];
                    class331 var157 = class116.field1416.method1900(var155, 109);
                    field3216[field3213++] = var157.method2163(-27058, var156);
                    return;
                }
                if (arg0 == 3408) {
                    field3228 -= 4;
                    int var158 = field3226[field3228];
                    int var159 = field3226[field3228 + 1];
                    int var160 = field3226[field3228 + 2];
                    int var161 = field3226[field3228 + 3];
                    class331 var162 = class116.field1416.method1900(var160, 108);
                    if (var162.field4610 == var158 && var162.field4606 == var159) {
                        if (var159 == 115) {
                            field3216[field3213++] = var162.method2163(-27058, var161);
                            return;
                        }
                        field3226[field3228++] = var162.method2166(90, var161);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field3228 -= 3;
                    int var163 = field3226[field3228];
                    int var164 = field3226[field3228 + 1];
                    int var165 = field3226[field3228 + 2];
                    if (var164 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class331 var166 = class116.field1416.method1900(var164, 114);
                    if (var166.field4606 != var163) {
                        throw new RuntimeException("C3409-1");
                    }
                    field3226[field3228++] = var166.method2158(var165, (byte) 98) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var167 = field3226[--field3228];
                    String var168 = field3216[--field3213];
                    if (var167 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class331 var169 = class116.field1416.method1900(var167, 94);
                    if (var169.field4606 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field3226[field3228++] = var169.method2164(var168, 118) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var170 = field3226[--field3228];
                    class331 var171 = class116.field1416.method1900(var170, 100);
                    field3226[field3228++] = var171.field4604.method1177(63);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class726.field10163 == 0) {
                        field3226[field3228++] = -2;
                        return;
                    }
                    if (class726.field10163 == 1) {
                        field3226[field3228++] = -1;
                        return;
                    }
                    field3226[field3228++] = class215.field2828;
                    return;
                }
                if (arg0 == 3601) {
                    int var172 = field3226[--field3228];
                    if (class726.field10163 == 2 && var172 < class215.field2828) {
                        field3216[field3213++] = class703.field9786[var172];
                        if (class479.field6784[var172] != null) {
                            field3216[field3213++] = class479.field6784[var172];
                            return;
                        }
                        field3216[field3213++] = "";
                        return;
                    }
                    field3216[field3213++] = "";
                    field3216[field3213++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var173 = field3226[--field3228];
                    if (class726.field10163 == 2 && var173 < class215.field2828) {
                        field3226[field3228++] = class533.field7498[var173];
                        return;
                    }
                    field3226[field3228++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var174 = field3226[--field3228];
                    if (class726.field10163 == 2 && var174 < class215.field2828) {
                        field3226[field3228++] = class692.field9536[var174];
                        return;
                    }
                    field3226[field3228++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var175 = field3216[--field3213];
                    int var176 = field3226[--field3228];
                    class675.method3722(var175, var176, (byte) 52);
                    return;
                }
                if (arg0 == 3605) {
                    String var177 = field3216[--field3213];
                    class150.method1021(-1, var177);
                    return;
                }
                if (arg0 == 3606) {
                    String var178 = field3216[--field3213];
                    class394.method2477(var178, (byte) -96);
                    return;
                }
                if (arg0 == 3607) {
                    String var179 = field3216[--field3213];
                    class125.method844(false, var179, (byte) -43);
                    return;
                }
                if (arg0 == 3608) {
                    String var180 = field3216[--field3213];
                    class543.method3150(0, var180);
                    return;
                }
                if (arg0 == 3609) {
                    String var181 = field3216[--field3213];
                    if (var181.startsWith("<img=0>") || var181.startsWith("<img=1>")) {
                        var181 = var181.substring(7);
                    }
                    field3226[field3228++] = class266.method1740(var181, 0) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var182 = field3226[--field3228];
                    if (class726.field10163 == 2 && var182 < class215.field2828) {
                        field3216[field3213++] = class222.field2895[var182];
                        return;
                    }
                    field3216[field3213++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class166.field2280 != null) {
                        field3216[field3213++] = class245.method1568(false, class166.field2280);
                        return;
                    }
                    field3216[field3213++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class166.field2280 != null) {
                        field3226[field3228++] = class741.field10299;
                        return;
                    }
                    field3226[field3228++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var183 = field3226[--field3228];
                    if (class166.field2280 != null && var183 < class741.field10299) {
                        field3216[field3213++] = class332.field4625[var183].field360;
                        return;
                    }
                    field3216[field3213++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var184 = field3226[--field3228];
                    if (class166.field2280 != null && var184 < class741.field10299) {
                        field3226[field3228++] = class332.field4625[var184].field358;
                        return;
                    }
                    field3226[field3228++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var185 = field3226[--field3228];
                    if (class166.field2280 != null && var185 < class741.field10299) {
                        field3226[field3228++] = class332.field4625[var185].field359;
                        return;
                    }
                    field3226[field3228++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field3226[field3228++] = class418.field5908;
                    return;
                }
                if (arg0 == 3617) {
                    String var186 = field3216[--field3213];
                    class740.method4132(var186, -59);
                    return;
                }
                if (arg0 == 3618) {
                    field3226[field3228++] = class176.field2374;
                    return;
                }
                if (arg0 == 3619) {
                    String var187 = field3216[--field3213];
                    class638.method3543(var187, 101);
                    return;
                }
                if (arg0 == 3620) {
                    class657.method3614((byte) -79);
                    return;
                }
                if (arg0 == 3621) {
                    if (class726.field10163 == 0) {
                        field3226[field3228++] = -1;
                        return;
                    }
                    field3226[field3228++] = class261.field3764;
                    return;
                }
                if (arg0 == 3622) {
                    int var188 = field3226[--field3228];
                    if (class726.field10163 != 0 && var188 < class261.field3764) {
                        field3216[field3213++] = class260.field3742[var188];
                        if (class539.field7559[var188] != null) {
                            field3216[field3213++] = class539.field7559[var188];
                            return;
                        }
                        field3216[field3213++] = "";
                        return;
                    }
                    field3216[field3213++] = "";
                    field3216[field3213++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var189 = field3216[--field3213];
                    if (var189.startsWith("<img=0>") || var189.startsWith("<img=1>")) {
                        var189 = var189.substring(7);
                    }
                    field3226[field3228++] = class101.method730(var189, (byte) 99) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var190 = field3226[--field3228];
                    if (class332.field4625 != null && var190 < class741.field10299 && class332.field4625[var190].field362.equalsIgnoreCase(class660.field9039.field3965)) {
                        field3226[field3228++] = 1;
                        return;
                    }
                    field3226[field3228++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class373.field5240 != null) {
                        field3216[field3213++] = class373.field5240;
                        return;
                    }
                    field3216[field3213++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var191 = field3226[--field3228];
                    if (class166.field2280 != null && var191 < class741.field10299) {
                        field3216[field3213++] = class332.field4625[var191].field364;
                        return;
                    }
                    field3216[field3213++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var192 = field3226[--field3228];
                    if (class726.field10163 == 2 && var192 >= 0 && var192 < class215.field2828) {
                        field3226[field3228++] = class596.field8384[var192] ? 1 : 0;
                        return;
                    }
                    field3226[field3228++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var193 = field3216[--field3213];
                    if (var193.startsWith("<img=0>") || var193.startsWith("<img=1>")) {
                        var193 = var193.substring(7);
                    }
                    field3226[field3228++] = class530.method3087(var193, -125);
                    return;
                }
                if (arg0 == 3629) {
                    field3226[field3228++] = class279.field3942;
                    return;
                }
                if (arg0 == 3630) {
                    String var194 = field3216[--field3213];
                    class125.method844(true, var194, (byte) -43);
                    return;
                }
                if (arg0 == 3631) {
                    int var195 = field3226[--field3228];
                    field3226[field3228++] = class69.field853[var195] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var196 = field3226[--field3228];
                    if (class166.field2280 != null && var196 < class741.field10299) {
                        field3216[field3213++] = class332.field4625[var196].field362;
                        return;
                    }
                    field3216[field3213++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var197 = field3226[--field3228];
                    if (class726.field10163 != 0 && var197 < class261.field3764) {
                        field3216[field3213++] = class608.field8561[var197];
                        return;
                    }
                    field3216[field3213++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var198 = field3226[--field3228];
                    field3226[field3228++] = class358.field5092[var198].method2497(-81);
                    return;
                }
                if (arg0 == 3904) {
                    int var199 = field3226[--field3228];
                    field3226[field3228++] = class358.field5092[var199].field5667;
                    return;
                }
                if (arg0 == 3905) {
                    int var200 = field3226[--field3228];
                    field3226[field3228++] = class358.field5092[var200].field5664;
                    return;
                }
                if (arg0 == 3906) {
                    int var201 = field3226[--field3228];
                    field3226[field3228++] = class358.field5092[var201].field5657;
                    return;
                }
                if (arg0 == 3907) {
                    int var202 = field3226[--field3228];
                    field3226[field3228++] = class358.field5092[var202].field5662;
                    return;
                }
                if (arg0 == 3908) {
                    int var203 = field3226[--field3228];
                    field3226[field3228++] = class358.field5092[var203].field5663;
                    return;
                }
                if (arg0 == 3910) {
                    int var204 = field3226[--field3228];
                    int var205 = class358.field5092[var204].method2502(4095);
                    field3226[field3228++] = var205 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var206 = field3226[--field3228];
                    int var207 = class358.field5092[var206].method2502(4095);
                    field3226[field3228++] = var207 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var208 = field3226[--field3228];
                    int var209 = class358.field5092[var208].method2502(4095);
                    field3226[field3228++] = var209 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var210 = field3226[--field3228];
                    int var211 = class358.field5092[var210].method2502(4095);
                    field3226[field3228++] = var211 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field3228 -= 2;
                    int var212 = field3226[field3228];
                    int var213 = field3226[field3228 + 1];
                    field3226[field3228++] = var212 + var213;
                    return;
                }
                if (arg0 == 4001) {
                    field3228 -= 2;
                    int var214 = field3226[field3228];
                    int var215 = field3226[field3228 + 1];
                    field3226[field3228++] = var214 - var215;
                    return;
                }
                if (arg0 == 4002) {
                    field3228 -= 2;
                    int var216 = field3226[field3228];
                    int var217 = field3226[field3228 + 1];
                    field3226[field3228++] = var216 * var217;
                    return;
                }
                if (arg0 == 4003) {
                    field3228 -= 2;
                    int var218 = field3226[field3228];
                    int var219 = field3226[field3228 + 1];
                    field3226[field3228++] = var218 / var219;
                    return;
                }
                if (arg0 == 4004) {
                    int var220 = field3226[--field3228];
                    field3226[field3228++] = (int) (Math.random() * (double) var220);
                    return;
                }
                if (arg0 == 4005) {
                    int var221 = field3226[--field3228];
                    field3226[field3228++] = (int) (Math.random() * (double) (var221 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field3228 -= 5;
                    int var222 = field3226[field3228];
                    int var223 = field3226[field3228 + 1];
                    int var224 = field3226[field3228 + 2];
                    int var225 = field3226[field3228 + 3];
                    int var226 = field3226[field3228 + 4];
                    field3226[field3228++] = (var223 - var222) * (var226 - var224) / (var225 - var224) + var222;
                    return;
                }
                if (arg0 == 4007) {
                    field3228 -= 2;
                    long var227 = (long) field3226[field3228];
                    long var229 = (long) field3226[field3228 + 1];
                    field3226[field3228++] = (int) (var227 * var229 / 100L + var227);
                    return;
                }
                if (arg0 == 4008) {
                    field3228 -= 2;
                    int var231 = field3226[field3228];
                    int var232 = field3226[field3228 + 1];
                    field3226[field3228++] = var231 | 0x1 << var232;
                    return;
                }
                if (arg0 == 4009) {
                    field3228 -= 2;
                    int var233 = field3226[field3228];
                    int var234 = field3226[field3228 + 1];
                    field3226[field3228++] = var233 & -(0x1 << var234) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field3228 -= 2;
                    int var235 = field3226[field3228];
                    int var236 = field3226[field3228 + 1];
                    field3226[field3228++] = (var235 & 0x1 << var236) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field3228 -= 2;
                    int var237 = field3226[field3228];
                    int var238 = field3226[field3228 + 1];
                    field3226[field3228++] = var237 % var238;
                    return;
                }
                if (arg0 == 4012) {
                    field3228 -= 2;
                    int var239 = field3226[field3228];
                    int var240 = field3226[field3228 + 1];
                    if (var239 == 0) {
                        field3226[field3228++] = 0;
                        return;
                    }
                    field3226[field3228++] = (int) Math.pow((double) var239, (double) var240);
                    return;
                }
                if (arg0 == 4013) {
                    field3228 -= 2;
                    int var241 = field3226[field3228];
                    int var242 = field3226[field3228 + 1];
                    if (var241 == 0) {
                        field3226[field3228++] = 0;
                        return;
                    }
                    if (var242 == 0) {
                        field3226[field3228++] = Integer.MAX_VALUE;
                        return;
                    }
                    field3226[field3228++] = (int) Math.pow((double) var241, 1.0D / (double) var242);
                    return;
                }
                if (arg0 == 4014) {
                    field3228 -= 2;
                    int var243 = field3226[field3228];
                    int var244 = field3226[field3228 + 1];
                    field3226[field3228++] = var243 & var244;
                    return;
                }
                if (arg0 == 4015) {
                    field3228 -= 2;
                    int var245 = field3226[field3228];
                    int var246 = field3226[field3228 + 1];
                    field3226[field3228++] = var245 | var246;
                    return;
                }
                if (arg0 == 4016) {
                    field3228 -= 2;
                    int var247 = field3226[field3228];
                    int var248 = field3226[field3228 + 1];
                    field3226[field3228++] = var247 < var248 ? var247 : var248;
                    return;
                }
                if (arg0 == 4017) {
                    field3228 -= 2;
                    int var249 = field3226[field3228];
                    int var250 = field3226[field3228 + 1];
                    field3226[field3228++] = var249 > var250 ? var249 : var250;
                    return;
                }
                if (arg0 == 4018) {
                    field3228 -= 3;
                    long var251 = (long) field3226[field3228];
                    long var253 = (long) field3226[field3228 + 1];
                    long var255 = (long) field3226[field3228 + 2];
                    field3226[field3228++] = (int) (var251 * var255 / var253);
                    return;
                }
                if (arg0 == 4019) {
                    field3228 -= 2;
                    int var257 = field3226[field3228];
                    int var258 = field3226[field3228 + 1];
                    if (var257 > 700 || var258 > 700) {
                        field3226[field3228++] = 256;
                    }
                    double var259 = (Math.random() * (double) (var257 + var258) + 800.0D - (double) var257) / 100.0D;
                    field3226[field3228++] = (int) (Math.pow(2.0D, var259) + 0.5D);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var261 = field3216[--field3213];
                    int var262 = field3226[--field3228];
                    field3216[field3213++] = var261 + var262;
                    return;
                }
                if (arg0 == 4101) {
                    field3213 -= 2;
                    String var263 = field3216[field3213];
                    String var264 = field3216[field3213 + 1];
                    field3216[field3213++] = var263 + var264;
                    return;
                }
                if (arg0 == 4102) {
                    String var265 = field3216[--field3213];
                    int var266 = field3226[--field3228];
                    field3216[field3213++] = var265 + class488.method2914(-9165, var266, true);
                    return;
                }
                if (arg0 == 4103) {
                    String var267 = field3216[--field3213];
                    field3216[field3213++] = var267.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field3216[field3213++] = method1537(field3226[--field3228]);
                    return;
                }
                if (arg0 == 4105) {
                    field3213 -= 2;
                    String var268 = field3216[field3213];
                    String var269 = field3216[field3213 + 1];
                    if (class660.field9039.field3983 != null && class660.field9039.field3983.field8661) {
                        field3216[field3213++] = var269;
                        return;
                    }
                    field3216[field3213++] = var268;
                    return;
                }
                if (arg0 == 4106) {
                    int var270 = field3226[--field3228];
                    field3216[field3213++] = Integer.toString(var270);
                    return;
                }
                if (arg0 == 4107) {
                    field3213 -= 2;
                    field3226[field3228++] = class103.method737(-1, class549.field7669, field3216[field3213], field3216[field3213 + 1]);
                    return;
                }
                if (arg0 == 4108) {
                    String var271 = field3216[--field3213];
                    field3228 -= 2;
                    int var272 = field3226[field3228];
                    int var273 = field3226[field3228 + 1];
                    class143 var274 = class439.method2651((byte) -70, 0, class405.field5725, var273);
                    field3226[field3228++] = var274.method1000((byte) -48, var271, class716.field9948, var272);
                    return;
                }
                if (arg0 == 4109) {
                    String var275 = field3216[--field3213];
                    field3228 -= 2;
                    int var276 = field3226[field3228];
                    int var277 = field3226[field3228 + 1];
                    class143 var278 = class439.method2651((byte) -74, 0, class405.field5725, var277);
                    field3226[field3228++] = var278.method998(174, var276, var275, class716.field9948);
                    return;
                }
                if (arg0 == 4110) {
                    field3213 -= 2;
                    String var279 = field3216[field3213];
                    String var280 = field3216[field3213 + 1];
                    if (field3226[--field3228] == 1) {
                        field3216[field3213++] = var279;
                        return;
                    }
                    field3216[field3213++] = var280;
                    return;
                }
                if (arg0 == 4111) {
                    String var281 = field3216[--field3213];
                    field3216[field3213++] = class493.method2950(var281, 0);
                    return;
                }
                if (arg0 == 4112) {
                    String var282 = field3216[--field3213];
                    int var283 = field3226[--field3228];
                    if (var283 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field3216[field3213++] = var282 + (char) var283;
                    return;
                }
                if (arg0 == 4113) {
                    int var284 = field3226[--field3228];
                    field3226[field3228++] = method1532((char) var284);
                    return;
                }
                if (arg0 == 4114) {
                    int var285 = field3226[--field3228];
                    field3226[field3228++] = class506.method2994((char) var285, -98) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var286 = field3226[--field3228];
                    field3226[field3228++] = class251.method1622((char) var286, (byte) -62) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var287 = field3226[--field3228];
                    field3226[field3228++] = class356.method2289((char) var287, 1000) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var288 = field3216[--field3213];
                    if (var288 != null) {
                        field3226[field3228++] = var288.length();
                        return;
                    }
                    field3226[field3228++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var289 = field3216[--field3213];
                    field3228 -= 2;
                    int var290 = field3226[field3228];
                    int var291 = field3226[field3228 + 1];
                    field3216[field3213++] = var289.substring(var290, var291);
                    return;
                }
                if (arg0 == 4119) {
                    String var292 = field3216[--field3213];
                    StringBuffer var293 = new StringBuffer(var292.length());
                    boolean var294 = false;
                    for (int var295 = 0; var295 < var292.length(); var295++) {
                        char var296 = var292.charAt(var295);
                        if (var296 == '<') {
                            var294 = true;
                        } else if (var296 == '>') {
                            var294 = false;
                        } else if (!var294) {
                            var293.append(var296);
                        }
                    }
                    field3216[field3213++] = var293.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var297 = field3216[--field3213];
                    field3228 -= 2;
                    int var298 = field3226[field3228];
                    int var299 = field3226[field3228 + 1];
                    field3226[field3228++] = var297.indexOf(var298, var299);
                    return;
                }
                if (arg0 == 4121) {
                    field3213 -= 2;
                    String var300 = field3216[field3213];
                    String var301 = field3216[field3213 + 1];
                    int var302 = field3226[--field3228];
                    field3226[field3228++] = var300.indexOf(var301, var302);
                    return;
                }
                if (arg0 == 4122) {
                    int var303 = field3226[--field3228];
                    field3226[field3228++] = Character.toLowerCase((char) var303);
                    return;
                }
                if (arg0 == 4123) {
                    int var304 = field3226[--field3228];
                    field3226[field3228++] = Character.toUpperCase((char) var304);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var305 = field3226[--field3228] != 0;
                    int var306 = field3226[--field3228];
                    field3216[field3213++] = class556.method3211((byte) 91, var305, class549.field7669, (long) var306, 0);
                    return;
                }
                if (arg0 == 4125) {
                    String var307 = field3216[--field3213];
                    int var308 = field3226[--field3228];
                    class143 var309 = class439.method2651((byte) -89, 0, class405.field5725, var308);
                    field3226[field3228++] = var309.method991(class716.field9948, 13, var307);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var310 = field3226[--field3228];
                    field3216[field3213++] = class682.field9361.method3424(var310, false).field7677;
                    return;
                }
                if (arg0 == 4201) {
                    field3228 -= 2;
                    int var311 = field3226[field3228];
                    int var312 = field3226[field3228 + 1];
                    class551 var313 = class682.field9361.method3424(var311, false);
                    if (var312 >= 1 && var312 <= 5 && var313.field7678[var312 - 1] != null) {
                        field3216[field3213++] = var313.field7678[var312 - 1];
                        return;
                    }
                    field3216[field3213++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field3228 -= 2;
                    int var314 = field3226[field3228];
                    int var315 = field3226[field3228 + 1];
                    class551 var316 = class682.field9361.method3424(var314, false);
                    if (var315 >= 1 && var315 <= 5 && var316.field7744[var315 - 1] != null) {
                        field3216[field3213++] = var316.field7744[var315 - 1];
                        return;
                    }
                    field3216[field3213++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var317 = field3226[--field3228];
                    field3226[field3228++] = class682.field9361.method3424(var317, false).field7708;
                    return;
                }
                if (arg0 == 4204) {
                    int var318 = field3226[--field3228];
                    field3226[field3228++] = class682.field9361.method3424(var318, false).field7734 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var319 = field3226[--field3228];
                    class551 var320 = class682.field9361.method3424(var319, false);
                    if (var320.field7707 == -1 && var320.field7713 >= 0) {
                        field3226[field3228++] = var320.field7713;
                        return;
                    }
                    field3226[field3228++] = var319;
                    return;
                }
                if (arg0 == 4206) {
                    int var321 = field3226[--field3228];
                    class551 var322 = class682.field9361.method3424(var321, false);
                    if (var322.field7707 >= 0 && var322.field7713 >= 0) {
                        field3226[field3228++] = var322.field7713;
                        return;
                    }
                    field3226[field3228++] = var321;
                    return;
                }
                if (arg0 == 4207) {
                    int var323 = field3226[--field3228];
                    field3226[field3228++] = class682.field9361.method3424(var323, false).field7692 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field3228 -= 2;
                    int var324 = field3226[field3228];
                    int var325 = field3226[field3228 + 1];
                    class82 var326 = class605.field8497.method154(var325, (byte) -124);
                    if (var326.method634(0)) {
                        field3216[field3213++] = class682.field9361.method3424(var324, false).method3194(var325, (byte) -90, var326.field1031);
                        return;
                    }
                    field3226[field3228++] = class682.field9361.method3424(var324, false).method3198(var326.field1025, var325, 83);
                    return;
                }
                if (arg0 == 4209) {
                    field3228 -= 2;
                    int var327 = field3226[field3228];
                    int var328 = field3226[field3228 + 1] - 1;
                    class551 var329 = class682.field9361.method3424(var327, false);
                    if (var329.field7722 == var328) {
                        field3226[field3228++] = var329.field7752;
                        return;
                    }
                    if (var329.field7695 == var328) {
                        field3226[field3228++] = var329.field7745;
                        return;
                    }
                    field3226[field3228++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var330 = field3216[--field3213];
                    int var331 = field3226[--field3228];
                    class391.method2459(17936, var330, var331 == 1);
                    field3226[field3228++] = class565.field8026;
                    return;
                }
                if (arg0 == 4211) {
                    if (class698.field9631 != null && class538.field7552 < class565.field8026) {
                        field3226[field3228++] = class698.field9631[class538.field7552++] & 0xFFFF;
                        return;
                    }
                    field3226[field3228++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class538.field7552 = 0;
                    return;
                }
                if (arg0 == 4213) {
                    int var332 = field3226[--field3228];
                    field3226[field3228++] = class682.field9361.method3424(var332, false).field7698;
                    return;
                }
                if (arg0 == 4214) {
                    String var333 = field3216[--field3213];
                    field3228 -= 3;
                    int var334 = field3226[field3228];
                    int var335 = field3226[field3228 + 1];
                    int var336 = field3226[field3228 + 2];
                    class645.method3561(var333, var334 == 1, -93, var335, var336);
                    field3226[field3228++] = class565.field8026;
                    return;
                }
                if (arg0 == 4215) {
                    field3213 -= 2;
                    field3228 -= 2;
                    String var337 = field3216[field3213];
                    int var338 = field3226[field3228];
                    int var339 = field3226[field3228 + 1];
                    String var340 = field3216[field3213 + 1];
                    class58.method411(var337, var339, 7059, var340, var338 == 1);
                    field3226[field3228++] = class565.field8026;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field3228 -= 2;
                    int var341 = field3226[field3228];
                    int var342 = field3226[field3228 + 1];
                    class82 var343 = class605.field8497.method154(var342, (byte) -121);
                    if (var343.method634(0)) {
                        field3216[field3213++] = class231.field3110.method2797(var341, false).method2272(41, var342, var343.field1031);
                        return;
                    }
                    field3226[field3228++] = class231.field3110.method2797(var341, false).method2277(var342, var343.field1025, -15359);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field3228 -= 2;
                    int var344 = field3226[field3228];
                    int var345 = field3226[field3228 + 1];
                    class82 var346 = class605.field8497.method154(var345, (byte) -123);
                    if (var346.method634(0)) {
                        field3216[field3213++] = class612.field8588.method558((byte) 125, var344).method59(var346.field1031, var345, (byte) 30);
                        return;
                    }
                    field3226[field3228++] = class612.field8588.method558((byte) 8, var344).method61(var345, 75, var346.field1025);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field3228 -= 2;
                    int var347 = field3226[field3228];
                    int var348 = field3226[field3228 + 1];
                    class82 var349 = class605.field8497.method154(var348, (byte) -109);
                    if (var349.method634(0)) {
                        field3216[field3213++] = class116.field1417.method1357(false, var347).method1345(var349.field1031, 3, var348);
                        return;
                    }
                    field3226[field3228++] = class116.field1417.method1357(false, var347).method1344(var349.field1025, var348, 6);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var350 = field3226[--field3228];
                class224 var351 = class200.field2638.method3506(var350, 64);
                if (var351.field2999 != null && var351.field2999.length > 0) {
                    int var352 = 0;
                    int var353 = var351.field2996[0];
                    for (int var354 = 1; var354 < var351.field2999.length; var354++) {
                        if (var351.field2996[var354] > var353) {
                            var352 = var354;
                            var353 = var351.field2996[var354];
                        }
                    }
                    field3226[field3228++] = var351.field2999[var352];
                    return;
                }
                field3226[field3228++] = var351.field2980;
                return;
            }
        } else {
            class493 var51;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var51 = class127.method854((byte) -123, field3226[--field3228]);
            } else {
                var51 = arg1 ? field3224 : field3209;
            }
            if (arg0 == 1300) {
                int var52 = field3226[--field3228] - 1;
                if (var52 >= 0 && var52 <= 9) {
                    var51.method2947(118, var52, field3216[--field3213]);
                    return;
                }
                field3213--;
                return;
            }
            if (arg0 == 1301) {
                field3228 -= 2;
                int var53 = field3226[field3228];
                int var54 = field3226[field3228 + 1];
                if (var53 == -1 && var54 == -1) {
                    var51.field7043 = null;
                    return;
                }
                var51.field7043 = class323.method2083(var53, (byte) -121, var54);
                return;
            }
            if (arg0 == 1302) {
                int var55 = field3226[--field3228];
                if (class124.field1506 != var55 && class235.field3168 != var55 && class492.field6940 != var55) {
                    return;
                }
                var51.field7042 = var55;
                return;
            }
            if (arg0 == 1303) {
                var51.field7056 = field3226[--field3228];
                return;
            }
            if (arg0 == 1304) {
                var51.field7054 = field3226[--field3228];
                return;
            }
            if (arg0 == 1305) {
                var51.field6991 = field3216[--field3213];
                return;
            }
            if (arg0 == 1306) {
                var51.field7099 = field3216[--field3213];
                return;
            }
            if (arg0 == 1307) {
                var51.field7005 = null;
                return;
            }
            if (arg0 == 1308) {
                var51.field7004 = field3226[--field3228];
                var51.field6992 = field3226[--field3228];
                return;
            }
            if (arg0 == 1309) {
                int var56 = field3226[--field3228];
                int var57 = field3226[--field3228];
                if (var57 >= 1 && var57 <= 10) {
                    var51.method2943(var57 - 1, var56, (byte) -79);
                }
                return;
            }
            if (arg0 == 1310) {
                var51.field6989 = field3216[--field3213];
                return;
            }
            if (arg0 == 1311) {
                var51.field7107 = field3226[--field3228];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var58;
                int var59;
                int var60;
                if (arg0 == 1312) {
                    field3228 -= 3;
                    var58 = field3226[field3228] - 1;
                    var59 = field3226[field3228 + 1];
                    var60 = field3226[field3228 + 2];
                    if (var58 < 0 || var58 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field3228 -= 2;
                    var58 = 10;
                    var59 = field3226[field3228];
                    var60 = field3226[field3228 + 1];
                }
                if (var51.field7064 == null) {
                    if (var59 == 0) {
                        return;
                    }
                    var51.field7064 = new byte[11];
                    var51.field7079 = new byte[11];
                    var51.field7052 = new int[11];
                }
                var51.field7064[var58] = (byte) var59;
                if (var59 == 0) {
                    var51.field7066 = false;
                    for (int var61 = 0; var61 < var51.field7064.length; var61++) {
                        if (var51.field7064[var61] != 0) {
                            var51.field7066 = true;
                            break;
                        }
                    }
                } else {
                    var51.field7066 = true;
                }
                var51.field7079[var58] = (byte) var60;
                return;
            }
            if (arg0 == 1314) {
                var51.field7111 = field3226[--field3228];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lrb;II)V", line = 4032)
    public static final void method1539(class352 arg0, int arg1, int arg2) {
        class648 var3 = class274.method1786(arg2, -122, arg0, arg1);
        if (var3 == null) {
            return;
        }
        field3206 = new int[var3.field8913];
        field3212 = new String[var3.field8914];
        if (class389.field5509 == var3.field8906 || class20.field311 == var3.field8906 || class333.field4660 == var3.field8906) {
            int var4 = 0;
            int var5 = 0;
            if (class230.field3104 != null) {
                var4 = class230.field3104.field6954;
                var5 = class230.field3104.field6975;
            }
            field3206[0] = class530.field7470.method1094(-95) - var4;
            field3206[1] = class530.field7470.method1089((byte) -63) - var5;
        }
        method1545(var3, 200000);
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)V", line = 4058)
    private static final void method1540(int arg0) {
        class493 var1 = class127.method854((byte) -89, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class493[] var3 = class419.field5914[var2];
        if (var3 == null) {
            class493[] var4 = class37.field475[var2];
            int var5 = var4.length;
            var3 = class419.field5914[var2] = new class493[var5];
            class255.method1693(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class255.method1693(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 4100)
    private static final void method1541(String arg0, int arg1) {
        if (class399.field5645 == 0 && !(!class567.field8052 || class491.field6932) || class603.field8476) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class71.field943.method588((byte) 87, 0))) {
            var3 = 0;
            arg0 = arg0.substring(class71.field943.method588((byte) 97, 0).length());
        } else if (var2.startsWith(class71.field944.method588((byte) 103, 0))) {
            var3 = 1;
            arg0 = arg0.substring(class71.field944.method588((byte) 109, 0).length());
        } else if (var2.startsWith(class71.field945.method588((byte) 104, 0))) {
            var3 = 2;
            arg0 = arg0.substring(class71.field945.method588((byte) 102, 0).length());
        } else if (var2.startsWith(class71.field946.method588((byte) 98, 0))) {
            var3 = 3;
            arg0 = arg0.substring(class71.field946.method588((byte) 99, 0).length());
        } else if (var2.startsWith(class71.field947.method588((byte) 86, 0))) {
            var3 = 4;
            arg0 = arg0.substring(class71.field947.method588((byte) 120, 0).length());
        } else if (var2.startsWith(class71.field948.method588((byte) 116, 0))) {
            var3 = 5;
            arg0 = arg0.substring(class71.field948.method588((byte) 113, 0).length());
        } else if (var2.startsWith(class71.field949.method588((byte) 121, 0))) {
            var3 = 6;
            arg0 = arg0.substring(class71.field949.method588((byte) 123, 0).length());
        } else if (var2.startsWith(class71.field950.method588((byte) 120, 0))) {
            var3 = 7;
            arg0 = arg0.substring(class71.field950.method588((byte) 98, 0).length());
        } else if (var2.startsWith(class71.field951.method588((byte) 120, 0))) {
            var3 = 8;
            arg0 = arg0.substring(class71.field951.method588((byte) 105, 0).length());
        } else if (var2.startsWith(class71.field952.method588((byte) 123, 0))) {
            var3 = 9;
            arg0 = arg0.substring(class71.field952.method588((byte) 115, 0).length());
        } else if (var2.startsWith(class71.field953.method588((byte) 105, 0))) {
            var3 = 10;
            arg0 = arg0.substring(class71.field953.method588((byte) 98, 0).length());
        } else if (var2.startsWith(class71.field954.method588((byte) 118, 0))) {
            var3 = 11;
            arg0 = arg0.substring(class71.field954.method588((byte) 108, 0).length());
        } else if (class549.field7669 != 0) {
            if (var2.startsWith(class71.field943.method588((byte) 97, class549.field7669))) {
                var3 = 0;
                arg0 = arg0.substring(class71.field943.method588((byte) 95, class549.field7669).length());
            } else if (var2.startsWith(class71.field944.method588((byte) 115, class549.field7669))) {
                var3 = 1;
                arg0 = arg0.substring(class71.field944.method588((byte) 117, class549.field7669).length());
            } else if (var2.startsWith(class71.field945.method588((byte) 93, class549.field7669))) {
                var3 = 2;
                arg0 = arg0.substring(class71.field945.method588((byte) 97, class549.field7669).length());
            } else if (var2.startsWith(class71.field946.method588((byte) 117, class549.field7669))) {
                var3 = 3;
                arg0 = arg0.substring(class71.field946.method588((byte) 96, class549.field7669).length());
            } else if (var2.startsWith(class71.field947.method588((byte) 86, class549.field7669))) {
                var3 = 4;
                arg0 = arg0.substring(class71.field947.method588((byte) 94, class549.field7669).length());
            } else if (var2.startsWith(class71.field948.method588((byte) 119, class549.field7669))) {
                var3 = 5;
                arg0 = arg0.substring(class71.field948.method588((byte) 109, class549.field7669).length());
            } else if (var2.startsWith(class71.field949.method588((byte) 84, class549.field7669))) {
                var3 = 6;
                arg0 = arg0.substring(class71.field949.method588((byte) 125, class549.field7669).length());
            } else if (var2.startsWith(class71.field950.method588((byte) 98, class549.field7669))) {
                var3 = 7;
                arg0 = arg0.substring(class71.field950.method588((byte) 112, class549.field7669).length());
            } else if (var2.startsWith(class71.field951.method588((byte) 106, class549.field7669))) {
                var3 = 8;
                arg0 = arg0.substring(class71.field951.method588((byte) 95, class549.field7669).length());
            } else if (var2.startsWith(class71.field952.method588((byte) 94, class549.field7669))) {
                var3 = 9;
                arg0 = arg0.substring(class71.field952.method588((byte) 122, class549.field7669).length());
            } else if (var2.startsWith(class71.field953.method588((byte) 100, class549.field7669))) {
                var3 = 10;
                arg0 = arg0.substring(class71.field953.method588((byte) 113, class549.field7669).length());
            } else if (var2.startsWith(class71.field954.method588((byte) 114, class549.field7669))) {
                var3 = 11;
                arg0 = arg0.substring(class71.field954.method588((byte) 120, class549.field7669).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class71.field955.method588((byte) 94, 0))) {
            var5 = 1;
            arg0 = arg0.substring(class71.field955.method588((byte) 99, 0).length());
        } else if (var4.startsWith(class71.field956.method588((byte) 123, 0))) {
            var5 = 2;
            arg0 = arg0.substring(class71.field956.method588((byte) 124, 0).length());
        } else if (var4.startsWith(class71.field957.method588((byte) 116, 0))) {
            var5 = 3;
            arg0 = arg0.substring(class71.field957.method588((byte) 113, 0).length());
        } else if (var4.startsWith(class71.field958.method588((byte) 86, 0))) {
            var5 = 4;
            arg0 = arg0.substring(class71.field958.method588((byte) 96, 0).length());
        } else if (var4.startsWith(class71.field959.method588((byte) 109, 0))) {
            var5 = 5;
            arg0 = arg0.substring(class71.field959.method588((byte) 124, 0).length());
        } else if (class549.field7669 != 0) {
            if (var4.startsWith(class71.field955.method588((byte) 90, class549.field7669))) {
                var5 = 1;
                arg0 = arg0.substring(class71.field955.method588((byte) 92, class549.field7669).length());
            } else if (var4.startsWith(class71.field956.method588((byte) 124, class549.field7669))) {
                var5 = 2;
                arg0 = arg0.substring(class71.field956.method588((byte) 123, class549.field7669).length());
            } else if (var4.startsWith(class71.field957.method588((byte) 93, class549.field7669))) {
                var5 = 3;
                arg0 = arg0.substring(class71.field957.method588((byte) 122, class549.field7669).length());
            } else if (var4.startsWith(class71.field958.method588((byte) 84, class549.field7669))) {
                var5 = 4;
                arg0 = arg0.substring(class71.field958.method588((byte) 111, class549.field7669).length());
            } else if (var4.startsWith(class71.field959.method588((byte) 124, class549.field7669))) {
                var5 = 5;
                arg0 = arg0.substring(class71.field959.method588((byte) 101, class549.field7669).length());
            }
        }
        field3222++;
        class519 var6 = class357.method2293(class427.field5994, class44.field541, (byte) 52);
        var6.field7384.method3694(0, -1528071456);
        int var7 = var6.field7384.field9146;
        var6.field7384.method3694(var3, -1528071456);
        var6.field7384.method3694(var5, -1528071456);
        class182.method1148(arg0, false, var6.field7384);
        var6.field7384.method3728(var6.field7384.field9146 - var7, (byte) 108);
        class151.method1027(var6, -59);
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "()V", line = 4366)
    public static final void method1542() {
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lws;)V", line = 4371)
    public static final void method1543(class357 arg0) {
        method1535(arg0, 200000);
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(IZ)V", line = 4374)
    public static final void method1544(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lbl;I)V", line = 4379)
    private static final void method1545(class648 arg0, int arg1) {
        field3228 = 0;
        field3213 = 0;
        int var2 = -1;
        int[] var3 = arg0.field8912;
        int[] var4 = arg0.field8910;
        byte var5 = -1;
        field3205 = 0;
        try {
            int var6 = 0;
            label260: while (true) {
                var6++;
                if (var6 > arg1) {
                    throw new RuntimeException("slow");
                }
                var2++;
                int var43 = var3[var2];
                if (var43 >= 100) {
                    boolean var35;
                    if (var4[var2] == 1) {
                        var35 = true;
                    } else {
                        var35 = false;
                    }
                    if (var43 >= 100 && var43 < 5000) {
                        method1538(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method1546(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field3226[field3228++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field3226[field3228++] = class101.field1201.field4275[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class101.field1201.method1998(var8, field3226[--field3228], (byte) -122);
                } else if (var43 == 3) {
                    field3216[field3213++] = arg0.field8904[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field3228 -= 2;
                    if (field3226[field3228 + 1] != field3226[field3228]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field3228 -= 2;
                    if (field3226[field3228 + 1] == field3226[field3228]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field3228 -= 2;
                    if (field3226[field3228] < field3226[field3228 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field3228 -= 2;
                    if (field3226[field3228] > field3226[field3228 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field3205 == 0) {
                        return;
                    }
                    class609 var9 = field3211[--field3205];
                    arg0 = var9.field8564;
                    var3 = arg0.field8912;
                    var4 = arg0.field8910;
                    var2 = var9.field8568;
                    field3206 = var9.field8567;
                    field3212 = var9.field8566;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field3226[field3228++] = class101.field1201.method1990(var10, 26951);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class101.field1201.method1994(var11, field3226[--field3228], (byte) -104);
                } else if (var43 == 31) {
                    field3228 -= 2;
                    if (field3226[field3228] <= field3226[field3228 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field3228 -= 2;
                    if (field3226[field3228] >= field3226[field3228 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field3226[field3228++] = field3206[var4[var2]];
                } else if (var43 == 34) {
                    field3206[var4[var2]] = field3226[--field3228];
                } else if (var43 == 35) {
                    field3216[field3213++] = field3212[var4[var2]];
                } else if (var43 == 36) {
                    field3212[var4[var2]] = field3216[--field3213];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field3213 -= var12;
                    String var13 = class84.method642(-106, var12, field3216, field3213);
                    field3216[field3213++] = var13;
                } else if (var43 == 38) {
                    field3228--;
                } else if (var43 == 39) {
                    field3213--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class648 var15 = class254.method1683((byte) -96, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field8913];
                    String[] var17 = new String[var15.field8914];
                    for (int var18 = 0; var18 < var15.field8907; var18++) {
                        var16[var18] = field3226[field3228 + var18 - var15.field8907];
                    }
                    for (int var19 = 0; var19 < var15.field8905; var19++) {
                        var17[var19] = field3216[field3213 + var19 - var15.field8905];
                    }
                    field3228 -= var15.field8907;
                    field3213 -= var15.field8905;
                    class609 var20 = new class609();
                    var20.field8564 = arg0;
                    var20.field8568 = var2;
                    var20.field8567 = field3206;
                    var20.field8566 = field3212;
                    if (field3205 >= field3211.length) {
                        throw new RuntimeException();
                    }
                    field3211[field3205++] = var20;
                    arg0 = var15;
                    var3 = var15.field8912;
                    var4 = var15.field8910;
                    var2 = -1;
                    field3206 = var16;
                    field3212 = var17;
                } else if (var43 == 42) {
                    field3226[field3228++] = class718.field9975[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class718.field9975[var21] = field3226[--field3228];
                    class698.method3923((byte) 113, var21);
                    class476.field6748 |= class538.field7548[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field3226[--field3228];
                    if (var24 >= 0 && var24 <= 5000) {
                        field3219[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field3204[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field3226[--field3228];
                    if (var28 < 0 || var28 >= field3219[var27]) {
                        throw new RuntimeException();
                    }
                    field3226[field3228++] = field3204[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field3228 -= 2;
                    int var30 = field3226[field3228];
                    if (var30 < 0 || var30 >= field3219[var29]) {
                        throw new RuntimeException();
                    }
                    field3204[var29][var30] = field3226[field3228 + 1];
                } else if (var43 == 47) {
                    String var31 = class492.field6941[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field3216[field3213++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class492.field6941[var32] = field3216[--field3213];
                    class123.method840(-127, var32);
                } else if (var43 == 51) {
                    class188 var33 = arg0.field8908[var4[var2]];
                    class756 var34 = (class756) var33.method1180((byte) 26, (long) field3226[--field3228]);
                    if (var34 != null) {
                        var2 += var34.field10518;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field8909 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field2546).append(" ");
                for (int var41 = field3205 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field3211[var41].field8564.field2546).append(" ");
                }
                var40.append("op: ").append(var5);
                class248.method1583((byte) -94, var40.toString(), var42);
            } else {
                class642.method3549(true, 4, "Clientscript error in: " + arg0.field8909);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field8909).append("\n");
                for (int var38 = field3205 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field3211[var38].field8564.field8909).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class248.method1583((byte) -59, var37.toString(), var42);
                class559.method3221(var37.toString(), (byte) -93);
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(IZ)V", line = 4827)
    private static final void method1546(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field3226[field3228++] = class332.field4619;
                return;
            }
            if (arg0 == 5001) {
                field3228 -= 3;
                class332.field4619 = field3226[field3228];
                class69.field846 = class729.method4095(120, field3226[field3228 + 1]);
                if (class69.field846 == null) {
                    class69.field846 = class315.field4362;
                }
                class106.field1278 = field3226[field3228 + 2];
                field3215++;
                class519 var2 = class357.method2293(class427.field5994, class18.field285, (byte) 71);
                var2.field7384.method3694(class332.field4619, -1528071456);
                var2.field7384.method3694(class69.field846.field2344, -1528071456);
                var2.field7384.method3694(class106.field1278, -1528071456);
                class151.method1027(var2, -18);
                return;
            }
            if (arg0 == 5002) {
                field3213 -= 2;
                String var3 = field3216[field3213];
                String var4 = field3216[field3213 + 1];
                field3228 -= 2;
                int var5 = field3226[field3228];
                int var6 = field3226[field3228 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field3217++;
                class519 var7 = class357.method2293(class427.field5994, class614.field8599, (byte) 59);
                var7.field7384.method3694(class505.method2988(var3, 0) + class505.method2988(var4, 0) + 2, -1528071456);
                var7.field7384.method3747((byte) 27, var3);
                var7.field7384.method3694(var5 - 1, -1528071456);
                var7.field7384.method3694(var6, -1528071456);
                var7.field7384.method3747((byte) 27, var4);
                class151.method1027(var7, -122);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field3226[--field3228];
                class533 var9 = class748.method4162((byte) -101, var8);
                String var10 = "";
                if (var9 != null && var9.field7512 != null) {
                    var10 = var9.field7512;
                }
                field3216[field3213++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field3226[--field3228];
                class533 var12 = class748.method4162((byte) -122, var11);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field7499;
                }
                field3226[field3228++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class69.field846 == null) {
                    field3226[field3228++] = -1;
                    return;
                }
                field3226[field3228++] = class69.field846.field2344;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field3226[--field3228];
                class519 var15 = class357.method2293(class427.field5994, class651.field8944, (byte) -28);
                var15.field7384.method3694(var14, -1528071456);
                class151.method1027(var15, -64);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field3216[--field3213];
                method1541(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field3213 -= 2;
                String var17 = field3216[field3213];
                String var18 = field3216[field3213 + 1];
                if (class399.field5645 != 0 || (!class567.field8052 || class491.field6932) && !class603.field8476) {
                    field3218++;
                    class519 var19 = class357.method2293(class427.field5994, class488.field6891, (byte) 63);
                    var19.field7384.method3694(0, -1528071456);
                    int var20 = var19.field7384.field9146;
                    var19.field7384.method3747((byte) 27, var17);
                    class182.method1148(var18, false, var19.field7384);
                    var19.field7384.method3728(var19.field7384.field9146 - var20, (byte) 114);
                    class151.method1027(var19, -55);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field3226[--field3228];
                class533 var22 = class748.method4162((byte) -74, var21);
                String var23 = "";
                if (var22 != null && var22.field7505 != null) {
                    var23 = var22.field7505;
                }
                field3216[field3213++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field3226[--field3228];
                class533 var25 = class748.method4162((byte) -106, var24);
                String var26 = "";
                if (var25 != null && var25.field7511 != null) {
                    var26 = var25.field7511;
                }
                field3216[field3213++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field3226[--field3228];
                class533 var28 = class748.method4162((byte) -101, var27);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field7507;
                }
                field3226[field3228++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class660.field9039 == null || class660.field9039.field3973 == null) {
                    var30 = "";
                } else {
                    var30 = class660.field9039.method1842(-127, true);
                }
                field3216[field3213++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field3226[field3228++] = class106.field1278;
                return;
            }
            if (arg0 == 5017) {
                field3226[field3228++] = class32.method191((byte) 33);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field3226[--field3228];
                class533 var32 = class748.method4162((byte) -91, var31);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field7508;
                }
                field3226[field3228++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field3226[--field3228];
                class533 var35 = class748.method4162((byte) -81, var34);
                String var36 = "";
                if (var35 != null && var35.field7497 != null) {
                    var36 = var35.field7497;
                }
                field3216[field3213++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class660.field9039 == null || class660.field9039.field3973 == null) {
                    var37 = "";
                } else {
                    var37 = class660.field9039.method1829(true, false);
                }
                field3216[field3213++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field3226[--field3228];
                class533 var39 = class748.method4162((byte) -71, var38);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field7506;
                }
                field3226[field3228++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field3226[--field3228];
                class533 var42 = class748.method4162((byte) -105, var41);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field7502;
                }
                field3226[field3228++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field3226[--field3228];
                class533 var45 = class748.method4162((byte) -73, var44);
                String var46 = "";
                if (var45 != null && var45.field7504 != null) {
                    var46 = var45.field7504;
                }
                field3216[field3213++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field3226[--field3228];
                field3216[field3213++] = class371.field5218.method988(var47, (byte) 71).field7174;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field3226[--field3228];
                class500 var49 = class371.field5218.method988(var48, (byte) 71);
                if (var49.field7177 == null) {
                    field3226[field3228++] = 0;
                    return;
                }
                field3226[field3228++] = var49.field7177.length;
                return;
            }
            if (arg0 == 5052) {
                field3228 -= 2;
                int var50 = field3226[field3228];
                int var51 = field3226[field3228 + 1];
                class500 var52 = class371.field5218.method988(var50, (byte) 71);
                int var53 = var52.field7177[var51];
                field3226[field3228++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field3226[--field3228];
                class500 var55 = class371.field5218.method988(var54, (byte) 71);
                if (var55.field7178 == null) {
                    field3226[field3228++] = 0;
                    return;
                }
                field3226[field3228++] = var55.field7178.length;
                return;
            }
            if (arg0 == 5054) {
                field3228 -= 2;
                int var56 = field3226[field3228];
                int var57 = field3226[field3228 + 1];
                field3226[field3228++] = class371.field5218.method988(var56, (byte) 71).field7178[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field3226[--field3228];
                field3216[field3213++] = class5.field50.method3340(var58, false).method2331(16584);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field3226[--field3228];
                class366 var60 = class5.field50.method3340(var59, false);
                if (var60.field5187 == null) {
                    field3226[field3228++] = 0;
                    return;
                }
                field3226[field3228++] = var60.field5187.length;
                return;
            }
            if (arg0 == 5057) {
                field3228 -= 2;
                int var61 = field3226[field3228];
                int var62 = field3226[field3228 + 1];
                field3226[field3228++] = class5.field50.method3340(var61, false).field5187[var62];
                return;
            }
            if (arg0 == 5058) {
                field3214 = new class166();
                field3214.field2279 = field3226[--field3228];
                field3214.field2282 = class5.field50.method3340(field3214.field2279, false);
                field3214.field2283 = new int[field3214.field2282.method2336(37)];
                return;
            }
            if (arg0 == 5059) {
                field3220++;
                class519 var63 = class357.method2293(class427.field5994, class56.field669, (byte) -54);
                var63.field7384.method3694(0, -1528071456);
                int var64 = var63.field7384.field9146;
                var63.field7384.method3694(0, -1528071456);
                var63.field7384.method3745(-124, field3214.field2279);
                field3214.field2282.method2334(var63.field7384, (byte) -51, field3214.field2283);
                var63.field7384.method3728(var63.field7384.field9146 - var64, (byte) 115);
                class151.method1027(var63, -10);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field3216[--field3213];
                field3223++;
                class519 var66 = class357.method2293(class427.field5994, class279.field3939, (byte) -30);
                var66.field7384.method3694(0, -1528071456);
                int var67 = var66.field7384.field9146;
                var66.field7384.method3747((byte) 27, var65);
                var66.field7384.method3745(-120, field3214.field2279);
                field3214.field2282.method2334(var66.field7384, (byte) -51, field3214.field2283);
                var66.field7384.method3728(var66.field7384.field9146 - var67, (byte) 111);
                class151.method1027(var66, -124);
                return;
            }
            if (arg0 == 5061) {
                field3220++;
                class519 var68 = class357.method2293(class427.field5994, class56.field669, (byte) 95);
                var68.field7384.method3694(0, -1528071456);
                int var69 = var68.field7384.field9146;
                var68.field7384.method3694(1, -1528071456);
                var68.field7384.method3745(-123, field3214.field2279);
                field3214.field2282.method2334(var68.field7384, (byte) -51, field3214.field2283);
                var68.field7384.method3728(var68.field7384.field9146 - var69, (byte) 114);
                class151.method1027(var68, -45);
                return;
            }
            if (arg0 == 5062) {
                field3228 -= 2;
                int var70 = field3226[field3228];
                int var71 = field3226[field3228 + 1];
                field3226[field3228++] = class371.field5218.method988(var70, (byte) 71).field7186[var71];
                return;
            }
            if (arg0 == 5063) {
                field3228 -= 2;
                int var72 = field3226[field3228];
                int var73 = field3226[field3228 + 1];
                field3226[field3228++] = class371.field5218.method988(var72, (byte) 71).field7169[var73];
                return;
            }
            if (arg0 == 5064) {
                field3228 -= 2;
                int var74 = field3226[field3228];
                int var75 = field3226[field3228 + 1];
                if (var75 == -1) {
                    field3226[field3228++] = -1;
                    return;
                }
                field3226[field3228++] = class371.field5218.method988(var74, (byte) 71).method2978((byte) -43, (char) var75);
                return;
            }
            if (arg0 == 5065) {
                field3228 -= 2;
                int var76 = field3226[field3228];
                int var77 = field3226[field3228 + 1];
                if (var77 == -1) {
                    field3226[field3228++] = -1;
                    return;
                }
                field3226[field3228++] = class371.field5218.method988(var76, (byte) 71).method2975((char) var77, 127);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field3226[--field3228];
                field3226[field3228++] = class5.field50.method3340(var78, false).method2336(127);
                return;
            }
            if (arg0 == 5067) {
                field3228 -= 2;
                int var79 = field3226[field3228];
                int var80 = field3226[field3228 + 1];
                int var81 = class5.field50.method3340(var79, false).method2330(-1, var80).field2144;
                field3226[field3228++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field3228 -= 2;
                int var82 = field3226[field3228];
                int var83 = field3226[field3228 + 1];
                field3214.field2283[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field3228 -= 2;
                int var84 = field3226[field3228];
                int var85 = field3226[field3228 + 1];
                field3214.field2283[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field3228 -= 3;
                int var86 = field3226[field3228];
                int var87 = field3226[field3228 + 1];
                int var88 = field3226[field3228 + 2];
                class366 var89 = class5.field50.method3340(var86, false);
                if (var89.method2330(-1, var87).field2144 != 0) {
                    throw new RuntimeException("bad command");
                }
                field3226[field3228++] = var89.method2332(-3, var87, var88);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field3216[--field3213];
                boolean var91 = field3226[--field3228] == 1;
                class360.method2305(var90, var91, -70);
                field3226[field3228++] = class565.field8026;
                return;
            }
            if (arg0 == 5072) {
                if (class698.field9631 != null && class538.field7552 < class565.field8026) {
                    field3226[field3228++] = class698.field9631[class538.field7552++] & 0xFFFF;
                    return;
                }
                field3226[field3228++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class538.field7552 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class589.field8306.method1517(0, 86)) {
                    field3226[field3228++] = 1;
                    return;
                }
                field3226[field3228++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class589.field8306.method1517(0, 82)) {
                    field3226[field3228++] = 1;
                    return;
                }
                field3226[field3228++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class589.field8306.method1517(0, 81)) {
                    field3226[field3228++] = 1;
                    return;
                }
                field3226[field3228++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class96.method709(field3226[--field3228], -3311);
                return;
            }
            if (arg0 == 5201) {
                field3226[field3228++] = class519.method3041((byte) -109);
                return;
            }
            if (arg0 == 5205) {
                class138.method974(-1, -1, field3226[--field3228], 0, false);
                return;
            }
            if (arg0 == 5206) {
                int var92 = field3226[--field3228];
                class52 var93 = class678.method3781(var92 >> 14 & 0x3FFF, var92 & 0x3FFF);
                if (var93 == null) {
                    field3226[field3228++] = -1;
                    return;
                }
                field3226[field3228++] = var93.field599;
                return;
            }
            if (arg0 == 5207) {
                class52 var94 = class678.method3794(field3226[--field3228]);
                if (var94 != null && var94.field590 != null) {
                    field3216[field3213++] = var94.field590;
                    return;
                }
                field3216[field3213++] = "";
                return;
            }
            if (arg0 == 5208) {
                field3226[field3228++] = class739.field10284;
                field3226[field3228++] = class753.field10478;
                return;
            }
            if (arg0 == 5209) {
                field3226[field3228++] = class678.field9294 + class299.field4217;
                field3226[field3228++] = class678.field9304 + class193.field2580;
                return;
            }
            if (arg0 == 5210) {
                int var95 = field3226[--field3228];
                class52 var96 = class678.method3794(var95);
                if (var96 == null) {
                    field3226[field3228++] = 0;
                    field3226[field3228++] = 0;
                    return;
                }
                field3226[field3228++] = var96.field580 >> 14 & 0x3FFF;
                field3226[field3228++] = var96.field580 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var97 = field3226[--field3228];
                class52 var98 = class678.method3794(var97);
                if (var98 == null) {
                    field3226[field3228++] = 0;
                    field3226[field3228++] = 0;
                    return;
                }
                field3226[field3228++] = var98.field587 - var98.field594;
                field3226[field3228++] = var98.field598 - var98.field585;
                return;
            }
            if (arg0 == 5212) {
                class507 var99 = class327.method2127((byte) 118);
                if (var99 == null) {
                    field3226[field3228++] = -1;
                    field3226[field3228++] = -1;
                    return;
                }
                field3226[field3228++] = var99.field7257;
                int var100 = var99.field7261 << 28 | class678.field9294 + var99.field7263 << 14 | class678.field9304 + var99.field7262;
                field3226[field3228++] = var100;
                return;
            }
            if (arg0 == 5213) {
                class507 var101 = class172.method1105(true);
                if (var101 == null) {
                    field3226[field3228++] = -1;
                    field3226[field3228++] = -1;
                    return;
                }
                field3226[field3228++] = var101.field7257;
                int var102 = var101.field7261 << 28 | class678.field9294 + var101.field7263 << 14 | class678.field9304 + var101.field7262;
                field3226[field3228++] = var102;
                return;
            }
            if (arg0 == 5214) {
                int var103 = field3226[--field3228];
                class52 var104 = class648.method3574(0);
                if (var104 != null) {
                    boolean var105 = var104.method321(var103 >> 28 & 0x3, var103 & 0x3FFF, (byte) 21, var103 >> 14 & 0x3FFF, field3230);
                    if (var105) {
                        class74.method601(field3230[2], true, field3230[1]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field3228 -= 2;
                int var106 = field3226[field3228];
                int var107 = field3226[field3228 + 1];
                class711 var108 = class678.method3790(var106 >> 14 & 0x3FFF, var106 & 0x3FFF);
                boolean var109 = false;
                for (class52 var110 = (class52) var108.method4000((byte) -7); var110 != null; var110 = (class52) var108.method4002(-46)) {
                    if (var110.field599 == var107) {
                        var109 = true;
                        break;
                    }
                }
                if (var109) {
                    field3226[field3228++] = 1;
                    return;
                }
                field3226[field3228++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var111 = field3226[--field3228];
                class52 var112 = class678.method3794(var111);
                if (var112 == null) {
                    field3226[field3228++] = -1;
                    return;
                }
                field3226[field3228++] = var112.field589;
                return;
            }
            if (arg0 == 5220) {
                field3226[field3228++] = class725.field10122 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var113 = field3226[--field3228];
                class74.method601(var113 & 0x3FFF, true, var113 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class52 var114 = class648.method3574(0);
                if (var114 != null) {
                    boolean var115 = var114.method320(-128, field3230, class678.field9294 + class299.field4217, class678.field9304 + class193.field2580);
                    if (var115) {
                        field3226[field3228++] = field3230[1];
                        field3226[field3228++] = field3230[2];
                        return;
                    }
                    field3226[field3228++] = -1;
                    field3226[field3228++] = -1;
                    return;
                }
                field3226[field3228++] = -1;
                field3226[field3228++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field3228 -= 2;
                int var116 = field3226[field3228];
                int var117 = field3226[field3228 + 1];
                class138.method974(var117 & 0x3FFF, var117 >> 14 & 0x3FFF, var116, 0, false);
                return;
            }
            if (arg0 == 5224) {
                int var118 = field3226[--field3228];
                class52 var119 = class648.method3574(0);
                if (var119 != null) {
                    boolean var120 = var119.method321(var118 >> 28 & 0x3, var118 & 0x3FFF, (byte) 21, var118 >> 14 & 0x3FFF, field3230);
                    if (var120) {
                        field3226[field3228++] = field3230[1];
                        field3226[field3228++] = field3230[2];
                        return;
                    }
                    field3226[field3228++] = -1;
                    field3226[field3228++] = -1;
                    return;
                }
                field3226[field3228++] = -1;
                field3226[field3228++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var121 = field3226[--field3228];
                class52 var122 = class648.method3574(0);
                if (var122 != null) {
                    boolean var123 = var122.method320(-114, field3230, var121 >> 14 & 0x3FFF, var121 & 0x3FFF);
                    if (var123) {
                        field3226[field3228++] = field3230[1];
                        field3226[field3228++] = field3230[2];
                        return;
                    }
                    field3226[field3228++] = -1;
                    field3226[field3228++] = -1;
                    return;
                }
                field3226[field3228++] = -1;
                field3226[field3228++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class756.method4204(29372, field3226[--field3228]);
                return;
            }
            if (arg0 == 5227) {
                field3228 -= 2;
                int var124 = field3226[field3228];
                int var125 = field3226[field3228 + 1];
                class138.method974(var125 & 0x3FFF, var125 >> 14 & 0x3FFF, var124, 0, true);
                return;
            }
            if (arg0 == 5228) {
                class186.field2511 = field3226[--field3228] == 1;
                return;
            }
            if (arg0 == 5229) {
                field3226[field3228++] = class186.field2511 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var126 = field3226[--field3228];
                class153.method1030(1, var126);
                return;
            }
            if (arg0 == 5231) {
                field3228 -= 2;
                int var127 = field3226[field3228];
                boolean var128 = field3226[field3228 + 1] == 1;
                if (class455.field6430 != null) {
                    class189 var129 = class455.field6430.method1180((byte) 26, (long) var127);
                    if (var129 != null && !var128) {
                        var129.method1185(-122);
                        return;
                    }
                    if (var129 == null && var128) {
                        class189 var130 = new class189();
                        class455.field6430.method1179((long) var127, var130, (byte) -26);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var131 = field3226[--field3228];
                if (class455.field6430 != null) {
                    class189 var132 = class455.field6430.method1180((byte) 26, (long) var131);
                    field3226[field3228++] = var132 == null ? 0 : 1;
                    return;
                }
                field3226[field3228++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field3228 -= 2;
                int var133 = field3226[field3228];
                boolean var134 = field3226[field3228 + 1] == 1;
                if (class467.field6613 != null) {
                    class189 var135 = class467.field6613.method1180((byte) 26, (long) var133);
                    if (var135 != null && !var134) {
                        var135.method1185(-73);
                        return;
                    }
                    if (var135 == null && var134) {
                        class189 var136 = new class189();
                        class467.field6613.method1179((long) var133, var136, (byte) -26);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var137 = field3226[--field3228];
                if (class467.field6613 != null) {
                    class189 var138 = class467.field6613.method1180((byte) 26, (long) var137);
                    field3226[field3228++] = var138 == null ? 0 : 1;
                    return;
                }
                field3226[field3228++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field3226[field3228++] = class678.field9271 == null ? -1 : class678.field9271.field599;
                return;
            }
            if (arg0 == 5236) {
                field3228 -= 2;
                int var139 = field3226[field3228];
                int var140 = field3226[field3228 + 1];
                int var141 = var140 >> 14 & 0x3FFF;
                int var142 = var140 & 0x3FFF;
                int var143 = class109.method774(var139, var142, var141, 0);
                if (var143 < 0) {
                    field3226[field3228++] = -1;
                    return;
                }
                field3226[field3228++] = var143;
                return;
            }
            if (arg0 == 5237) {
                class707.method3966((byte) 101);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field3228 -= 2;
                int var144 = field3226[field3228];
                int var145 = field3226[field3228 + 1];
                class342.method2214(3, false, 3, var144, var145);
                field3226[field3228++] = class272.field3891 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class272.field3891 != null) {
                    class342.method2214(3, false, class557.field7812.field6551.method290(false), -1, -1);
                }
                return;
            }
            if (arg0 == 5302) {
                class611[] var146 = class319.method2066(17710);
                field3226[field3228++] = var146.length;
                return;
            }
            if (arg0 == 5303) {
                int var147 = field3226[--field3228];
                class611[] var148 = class319.method2066(17710);
                field3226[field3228++] = var148[var147].field8576;
                field3226[field3228++] = var148[var147].field8579;
                return;
            }
            if (arg0 == 5305) {
                int var149 = class466.field6607;
                int var150 = class756.field10514;
                int var151 = -1;
                class611[] var152 = class319.method2066(17710);
                for (int var153 = 0; var153 < var152.length; var153++) {
                    class611 var154 = var152[var153];
                    if (var154.field8576 == var149 && var154.field8579 == var150) {
                        var151 = var153;
                        break;
                    }
                }
                field3226[field3228++] = var151;
                return;
            }
            if (arg0 == 5306) {
                field3226[field3228++] = class605.method3408((byte) 54);
                return;
            }
            if (arg0 == 5307) {
                int var155 = field3226[--field3228];
                if (var155 >= 1 && var155 <= 2) {
                    class342.method2214(3, false, var155, -1, -1);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field3226[field3228++] = class557.field7812.field6551.method290(false);
                return;
            }
            if (arg0 == 5309) {
                int var156 = field3226[--field3228];
                if (var156 >= 1 && var156 <= 2) {
                    class557.field7812.method2755(249682952, var156, class557.field7812.field6551);
                    class557.field7812.method2755(249682952, var156, class557.field7812.field6549);
                    class90.method681(10343);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field3213 -= 2;
                String var157 = field3216[field3213];
                String var158 = field3216[field3213 + 1];
                int var159 = field3226[--field3228];
                field3225++;
                class519 var160 = class357.method2293(class427.field5994, class289.field4081, (byte) 101);
                var160.field7384.method3694(class505.method2988(var157, 0) + class505.method2988(var158, 0) + 1, -1528071456);
                var160.field7384.method3747((byte) 27, var157);
                var160.field7384.method3747((byte) 27, var158);
                var160.field7384.method3694(var159, -1528071456);
                class151.method1027(var160, -117);
                return;
            }
            if (arg0 == 5401) {
                field3228 -= 2;
                class510.field7298[field3226[field3228]] = (short) class657.method3613(false, field3226[field3228 + 1]);
                class682.field9361.method3421(false);
                class682.field9361.method3422(false);
                class231.field3110.method2800(false);
                class350.method2257(-101);
                return;
            }
            if (arg0 == 5405) {
                field3228 -= 2;
                int var161 = field3226[field3228];
                int var162 = field3226[field3228 + 1];
                if (var161 >= 0 && var161 < 2) {
                    class414.field5833[var161] = new int[var162 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field3228 -= 7;
                int var163 = field3226[field3228];
                int var164 = field3226[field3228 + 1] << 1;
                int var165 = field3226[field3228 + 2];
                int var166 = field3226[field3228 + 3];
                int var167 = field3226[field3228 + 4];
                int var168 = field3226[field3228 + 5];
                int var169 = field3226[field3228 + 6];
                if (var163 >= 0 && var163 < 2 && class414.field5833[var163] != null && var164 >= 0 && var164 < class414.field5833[var163].length) {
                    class414.field5833[var163][var164] = new int[] { (var165 >> 14 & 0x3FFF) << 9, var166 << 2, (var165 & 0x3FFF) << 9, var169 };
                    class414.field5833[var163][var164 + 1] = new int[] { (var167 >> 14 & 0x3FFF) << 9, var168 << 2, (var167 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var170 = class414.field5833[field3226[--field3228]].length >> 1;
                field3226[field3228++] = var170;
                return;
            }
            if (arg0 == 5411) {
                if (class272.field3891 != null) {
                    class342.method2214(3, false, class557.field7812.field6551.method290(false), -1, -1);
                }
                if (class387.field5484 != null) {
                    class642.method3550(false);
                    System.exit(0);
                    return;
                }
                String var171 = class110.field1326 == null ? class399.method2495(true) : class110.field1326;
                class38.method213(false, var171, (byte) 121, class202.field2644, class557.field7812.field6521.method2556(false) == 1);
                return;
            }
            if (arg0 == 5419) {
                String var172 = "";
                if (class579.field8177 != null) {
                    if (class579.field8177.field3311 == null) {
                        var172 = class710.method3983(class579.field8177.field3314, 1677133712);
                    } else {
                        var172 = (String) class579.field8177.field3311;
                    }
                }
                field3216[field3213++] = var172;
                return;
            }
            if (arg0 == 5420) {
                field3226[field3228++] = class202.field2644.field4385 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class272.field3891 != null) {
                    class342.method2214(3, false, class557.field7812.field6551.method290(false), -1, -1);
                }
                String var173 = field3216[--field3213];
                boolean var174 = field3226[--field3228] == 1;
                String var175 = class399.method2495(true) + var173;
                class38.method213(var174, var175, (byte) 127, class202.field2644, class557.field7812.field6521.method2556(false) == 1);
                return;
            }
            if (arg0 == 5422) {
                field3213 -= 2;
                String var176 = field3216[field3213];
                String var177 = field3216[field3213 + 1];
                int var178 = field3226[--field3228];
                if (var176.length() > 0) {
                    if (class234.field3151 == null) {
                        class234.field3151 = new String[class539.field7556[class633.field8733.field4515]];
                    }
                    class234.field3151[var178] = var176;
                }
                if (var177.length() > 0) {
                    if (class424.field5973 == null) {
                        class424.field5973 = new String[class539.field7556[class633.field8733.field4515]];
                    }
                    class424.field5973[var178] = var177;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field3216[--field3213]);
                return;
            }
            if (arg0 == 5424) {
                field3228 -= 11;
                class10.field175 = field3226[field3228];
                class309.field4310 = field3226[field3228 + 1];
                class588.field8293 = field3226[field3228 + 2];
                class736.field10258 = field3226[field3228 + 3];
                class268.field3830 = field3226[field3228 + 4];
                class423.field5962 = field3226[field3228 + 5];
                class317.field4399 = field3226[field3228 + 6];
                class98.field1183 = field3226[field3228 + 7];
                class186.field2512 = field3226[field3228 + 8];
                class91.field1084 = field3226[field3228 + 9];
                class625.field8691 = field3226[field3228 + 10];
                class374.field5245.method2088(class268.field3830, -107);
                class374.field5245.method2088(class423.field5962, 101);
                class374.field5245.method2088(class317.field4399, -104);
                class374.field5245.method2088(class98.field1183, 106);
                class374.field5245.method2088(class186.field2512, -69);
                class681.field9344 = null;
                class648.field8916 = null;
                class426.field5985 = null;
                class657.field9011 = null;
                class504.field7231 = null;
                class336.field4684 = null;
                class213.field2811 = null;
                class166.field2285 = null;
                class273.field3903 = true;
                return;
            }
            if (arg0 == 5425) {
                class299.method1944((byte) -126);
                class273.field3903 = false;
                return;
            }
            if (arg0 == 5426) {
                field3228 -= 2;
                class519.field7376 = field3226[field3228];
                class405.field5738 = field3226[field3228 + 1];
                return;
            }
            if (arg0 == 5427) {
                field3228 -= 2;
                class621.field8643 = field3226[field3228 + 1];
                return;
            }
            if (arg0 == 5428) {
                field3228 -= 2;
                int var179 = field3226[field3228];
                int var180 = field3226[field3228 + 1];
                field3226[field3228++] = class283.method1856(var180, var179, false) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class150.method1022(field3216[--field3213], false, false, -119);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class113.method797("accountcreated", 117, class213.field2800);
                    return;
                } catch (Throwable var324) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class113.method797("accountcreatestarted", 96, class213.field2800);
                    return;
                } catch (Throwable var325) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var181 = "";
                if (class595.field8367 != null) {
                    Transferable var182 = class595.field8367.getContents(null);
                    if (var182 != null) {
                        try {
                            var181 = (String) var182.getTransferData(DataFlavor.stringFlavor);
                            if (var181 == null) {
                                var181 = "";
                            }
                        } catch (Exception var326) {
                        }
                    }
                }
                field3216[field3213++] = var181;
                return;
            }
            if (arg0 == 5433) {
                class533.field7509 = field3226[--field3228];
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field3228 -= 4;
                int var183 = field3226[field3228];
                int var184 = field3226[field3228 + 1];
                int var185 = field3226[field3228 + 2];
                int var186 = field3226[field3228 + 3];
                class480.method2869(var186, (byte) -69, (var183 >> 14 & 0x3FFF) - class228.field3063, false, (var183 & 0x3FFF) - class3.field30, var185, var184 << 2);
                return;
            }
            if (arg0 == 5501) {
                field3228 -= 4;
                int var187 = field3226[field3228];
                int var188 = field3226[field3228 + 1];
                int var189 = field3226[field3228 + 2];
                int var190 = field3226[field3228 + 3];
                class622.method3494((var187 & 0x3FFF) - class3.field30, var189, var188 << 2, (var187 >> 14 & 0x3FFF) - class228.field3063, var190, (byte) 108);
                return;
            }
            if (arg0 == 5502) {
                field3228 -= 6;
                int var191 = field3226[field3228];
                if (var191 >= 2) {
                    throw new RuntimeException();
                }
                class44.field532 = var191;
                int var192 = field3226[field3228 + 1];
                if (var192 + 1 >= class414.field5833[class44.field532].length >> 1) {
                    throw new RuntimeException();
                }
                class555.field7791 = var192;
                class101.field1203 = 0;
                class245.field3272 = field3226[field3228 + 2];
                class608.field8560 = field3226[field3228 + 3];
                int var193 = field3226[field3228 + 4];
                if (var193 >= 2) {
                    throw new RuntimeException();
                }
                class150.field2124 = var193;
                int var194 = field3226[field3228 + 5];
                if (var194 + 1 >= class414.field5833[class150.field2124].length >> 1) {
                    throw new RuntimeException();
                }
                class213.field2812 = var194;
                class97.field1168 = 3;
                class218.field2850 = -1;
                class419.field5919 = -1;
                return;
            }
            if (arg0 == 5503) {
                class426.method2600((byte) 103);
                return;
            }
            if (arg0 == 5504) {
                field3228 -= 2;
                class158.method1053(0, 3, field3226[field3228 + 1], field3226[field3228]);
                return;
            }
            if (arg0 == 5505) {
                field3226[field3228++] = (int) class2.field19 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field3226[field3228++] = (int) class552.field7773 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class626.method3511(false);
                return;
            }
            if (arg0 == 5508) {
                class310.method2015((byte) 52);
                return;
            }
            if (arg0 == 5509) {
                class206.method1266(-1);
                return;
            }
            if (arg0 == 5510) {
                class430.method2630(110);
                return;
            }
            if (arg0 == 5511) {
                int var195 = field3226[--field3228];
                int var196 = var195 >> 14 & 0x3FFF;
                int var197 = var195 & 0x3FFF;
                int var198 = var196 - class228.field3063;
                if (var198 < 0) {
                    var198 = 0;
                } else if (var198 >= class336.field4683) {
                    var198 = class336.field4683;
                }
                int var199 = var197 - class3.field30;
                if (var199 < 0) {
                    var199 = 0;
                } else if (var199 >= class700.field9768) {
                    var199 = class700.field9768;
                }
                class711.field9884 = (var198 << 9) + 256;
                class354.field5059 = (var199 << 9) + 256;
                class97.field1168 = 4;
                class218.field2850 = -1;
                class419.field5919 = -1;
                return;
            }
            if (arg0 == 5512) {
                class146.method1010((byte) -83);
                return;
            }
            if (arg0 == 5514) {
                class516.field7359 = field3226[--field3228];
                return;
            }
            if (arg0 == 5516) {
                field3226[field3228++] = class516.field7359;
                return;
            }
            if (arg0 == 5517) {
                int var200 = field3226[--field3228];
                if (var200 == -1) {
                    int var201 = var200 >> 14 & 0x3FFF;
                    int var202 = var200 & 0x3FFF;
                    int var203 = var201 - class228.field3063;
                    if (var203 < 0) {
                        var203 = 0;
                    } else if (var203 >= class336.field4683) {
                        var203 = class336.field4683;
                    }
                    int var204 = var202 - class3.field30;
                    if (var204 < 0) {
                        var204 = 0;
                    } else if (var204 >= class700.field9768) {
                        var204 = class700.field9768;
                    }
                    class419.field5919 = (var203 << 9) + 256;
                    class218.field2850 = (var204 << 9) + 256;
                    return;
                }
                class419.field5919 = -1;
                class218.field2850 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field3213 -= 2;
                String var205 = field3216[field3213];
                String var206 = field3216[field3213 + 1];
                int var207 = field3226[--field3228];
                if (var205.length() > 320) {
                    return;
                }
                if (class222.field2897 != 3) {
                    return;
                }
                if (class215.field2831 == 0 && class69.field856 == 0) {
                    class209.field2755 = var205;
                    class449.field6370 = var206;
                    class343.field4791 = var207;
                    class60.method514(false, 6);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class439.method2650(0);
                return;
            }
            if (arg0 == 5602) {
                if (class215.field2831 == 0) {
                    class79.field1013 = -2;
                    class62.field759 = -2;
                }
                return;
            }
            if (arg0 == 5604) {
                field3213--;
                if (class222.field2897 != 3) {
                    return;
                }
                if (class215.field2831 == 0 && class69.field856 == 0) {
                    class260.method1704(field3216[field3213], false);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field3213 -= 2;
                field3228 -= 2;
                if (class222.field2897 != 3) {
                    return;
                }
                if (class215.field2831 == 0 && class69.field856 == 0) {
                    class566.method3262(field3216[field3213], field3216[field3213 + 1], field3226[field3228], field3226[field3228 + 1] == 1, 18703);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class69.field856 == 0) {
                    class480.field6795 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field3226[field3228++] = class62.field759;
                return;
            }
            if (arg0 == 5608) {
                field3226[field3228++] = class545.field7597;
                return;
            }
            if (arg0 == 5609) {
                field3226[field3228++] = class480.field6795;
                return;
            }
            if (arg0 == 5611) {
                field3226[field3228++] = class253.field3705;
                return;
            }
            if (arg0 == 5612) {
                int var208 = field3226[--field3228];
                if (class222.field2897 != 7) {
                    return;
                }
                if (class215.field2831 == 0 && class69.field856 == 0) {
                    if (class333.field4663 != null) {
                        class333.field4663.method2844(Integer.MIN_VALUE);
                        class333.field4663 = null;
                    }
                    class343.field4791 = var208;
                    class60.method514(false, 9);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field3226[field3228++] = class62.field759;
                return;
            }
            if (arg0 == 5615) {
                field3213 -= 2;
                String var209 = field3216[field3213];
                String var210 = field3216[field3213 + 1];
                if (var209.length() > 320) {
                    return;
                }
                if (class222.field2897 != 3) {
                    return;
                }
                if (class215.field2831 == 0 && class69.field856 == 0) {
                    if (class333.field4663 != null) {
                        class333.field4663.method2844(Integer.MIN_VALUE);
                        class333.field4663 = null;
                    }
                    class209.field2755 = var209;
                    class449.field6370 = var210;
                    class60.method514(false, 5);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class415.method2550(false, -25626);
                return;
            }
            if (arg0 == 5617) {
                field3226[field3228++] = class79.field1013;
                return;
            }
            if (arg0 == 5618) {
                field3228--;
                return;
            }
            if (arg0 == 5619) {
                field3228--;
                return;
            }
            if (arg0 == 5620) {
                field3226[field3228++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field3213 -= 2;
                field3228 -= 2;
                return;
            }
            if (arg0 == 5622) {
                return;
            }
            if (arg0 == 5623) {
                if (class448.field6360 != null) {
                    field3226[field3228++] = 1;
                    return;
                }
                field3226[field3228++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field3226[field3228++] = (int) (class3.field32 >> 32);
                field3226[field3228++] = (int) (class3.field32 & 0xFFFFL);
                return;
            }
            if (arg0 == 5625) {
                field3226[field3228++] = class225.field3036 ? 1 : 0;
                return;
            }
            if (arg0 == 5626) {
                class225.field3036 = true;
                class401.method2504((byte) -66);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var211 = field3226[--field3228];
                class557.field7812.method2755(249682952, var211, class557.field7812.field6510);
                class510.method3014(3);
                class90.method681(10343);
                class673.field9128 = false;
                return;
            }
            if (arg0 == 6002) {
                boolean var212 = field3226[--field3228] == 1;
                class557.field7812.method2755(249682952, var212 ? 1 : 0, class557.field7812.field6543);
                class557.field7812.method2755(249682952, var212 ? 1 : 0, class557.field7812.field6532);
                class510.method3014(3);
                class405.method2515(-121);
                class90.method681(10343);
                class673.field9128 = false;
                return;
            }
            if (arg0 == 6003) {
                boolean var213 = field3226[--field3228] == 1;
                class557.field7812.method2755(249682952, var213 ? 2 : 1, class557.field7812.field6507);
                class557.field7812.method2755(249682952, var213 ? 2 : 1, class557.field7812.field6509);
                class405.method2515(-100);
                class90.method681(10343);
                class673.field9128 = false;
                return;
            }
            if (arg0 == 6005) {
                class557.field7812.method2755(249682952, field3226[--field3228] == 1 ? 1 : 0, class557.field7812.field6528);
                class510.method3014(3);
                class90.method681(10343);
                class673.field9128 = false;
                return;
            }
            if (arg0 == 6007) {
                class557.field7812.method2755(249682952, field3226[--field3228], class557.field7812.field6511);
                class90.method681(10343);
                class673.field9128 = false;
                return;
            }
            if (arg0 == 6008) {
                class557.field7812.method2755(249682952, field3226[--field3228] == 1 ? 1 : 0, class557.field7812.field6512);
                class90.method681(10343);
                class673.field9128 = false;
                return;
            }
            if (arg0 == 6010) {
                class557.field7812.method2755(249682952, field3226[--field3228] == 1 ? 1 : 0, class557.field7812.field6525);
                class90.method681(10343);
                class673.field9128 = false;
                return;
            }
            if (arg0 == 6011) {
                class557.field7812.method2755(249682952, field3226[--field3228], class557.field7812.field6542);
                class510.method3014(3);
                class90.method681(10343);
                class673.field9128 = false;
                return;
            }
            if (arg0 == 6012) {
                class557.field7812.method2755(249682952, field3226[--field3228] == 1 ? 1 : 0, class557.field7812.field6548);
                class43.method289((byte) -126);
                class661.method3626(16711680);
                class90.method681(10343);
                class673.field9128 = false;
                return;
            }
            if (arg0 == 6014) {
                class557.field7812.method2755(249682952, field3226[--field3228] == 1 ? 2 : 0, class557.field7812.field6520);
                class510.method3014(3);
                class90.method681(10343);
                class673.field9128 = false;
                return;
            }
            if (arg0 == 6015) {
                class557.field7812.method2755(249682952, field3226[--field3228] == 1 ? 1 : 0, class557.field7812.field6557);
                class510.method3014(3);
                class90.method681(10343);
                class673.field9128 = false;
                return;
            }
            if (arg0 == 6016) {
                class557.field7812.method2755(249682952, field3226[--field3228], class557.field7812.field6553);
                class759.method4212(false, 0, class557.field7812.field6521.method2556(false));
                class90.method681(10343);
                return;
            }
            if (arg0 == 6017) {
                class557.field7812.method2755(249682952, field3226[--field3228] == 1 ? 1 : 0, class557.field7812.field6536);
                class150.method1023(22104);
                class90.method681(10343);
                class673.field9128 = false;
                return;
            }
            if (arg0 == 6018) {
                class557.field7812.method2755(249682952, field3226[--field3228], class557.field7812.field6527);
                class90.method681(10343);
                class673.field9128 = false;
                return;
            }
            if (arg0 == 6019) {
                int var214 = field3226[--field3228];
                int var215 = class557.field7812.field6547.method3029(false);
                if (var214 != var215) {
                    if (class349.method2250((byte) 35, class222.field2897)) {
                        if (var215 == 0 && class118.field1431 != -1) {
                            class658.method3616(var214, class118.field1431, 0, false, class587.field8276, 0);
                            class64.method540(-1);
                            class105.field1268 = false;
                        } else if (var214 == 0) {
                            class105.method743(126);
                            class105.field1268 = false;
                        } else {
                            class699.method3937(-1, var214);
                        }
                    }
                    class557.field7812.method2755(249682952, var214, class557.field7812.field6547);
                    class90.method681(10343);
                    class673.field9128 = false;
                }
                return;
            }
            if (arg0 == 6020) {
                class557.field7812.method2755(249682952, field3226[--field3228], class557.field7812.field6550);
                class90.method681(10343);
                class673.field9128 = false;
                return;
            }
            if (arg0 == 6021) {
                int var216 = class557.field7812.field6507.method3516(false);
                class557.field7812.method2755(249682952, field3226[--field3228] == 1 ? 0 : var216, class557.field7812.field6509);
                class405.method2515(-104);
                return;
            }
            if (arg0 == 6023) {
                int var217 = field3226[--field3228];
                class557.field7812.method2755(249682952, var217, class557.field7812.field6516);
                class90.method681(10343);
                class673.field9128 = false;
                return;
            }
            if (arg0 == 6024) {
                class557.field7812.method2755(249682952, field3226[--field3228], class557.field7812.field6537);
                class90.method681(10343);
                return;
            }
            if (arg0 == 6025) {
                class557.field7812.method2755(249682952, field3226[--field3228], class557.field7812.field6514);
                class90.method681(10343);
                class673.field9128 = false;
                return;
            }
            if (arg0 == 6027) {
                int var218 = field3226[--field3228];
                if (var218 < 0 || var218 > 1) {
                    var218 = 0;
                }
                class479.method2861(-93, var218 == 1);
                return;
            }
            if (arg0 == 6028) {
                class557.field7812.method2755(249682952, field3226[--field3228] == 0 ? 0 : 1, class557.field7812.field6535);
                class90.method681(10343);
                return;
            }
            if (arg0 == 6029) {
                class557.field7812.method2755(249682952, field3226[--field3228], class557.field7812.field6511);
                class90.method681(10343);
                return;
            }
            if (arg0 == 6030) {
                class557.field7812.method2755(249682952, field3226[--field3228] == 0 ? 0 : 1, class557.field7812.field6546);
                class90.method681(10343);
                class510.method3014(3);
                return;
            }
            if (arg0 == 6031) {
                int var219 = field3226[--field3228];
                if (var219 < 0 || var219 > 5) {
                    var219 = 2;
                }
                class759.method4212(false, 0, var219);
                return;
            }
            if (arg0 == 6032) {
                field3228 -= 2;
                int var220 = field3226[field3228];
                boolean var221 = field3226[field3228 + 1] == 1;
                class557.field7812.method2755(249682952, var220, class557.field7812.field6555);
                if (!var221) {
                    class557.field7812.method2755(249682952, 0, class557.field7812.field6508);
                }
                class90.method681(10343);
                class673.field9128 = false;
                return;
            }
            if (arg0 == 6033) {
                class557.field7812.method2755(249682952, field3226[--field3228], class557.field7812.field6540);
                class90.method681(10343);
                return;
            }
            if (arg0 == 6034) {
                class557.field7812.method2755(249682952, field3226[--field3228] == 1 ? 1 : 0, class557.field7812.field6522);
                class90.method681(10343);
                class43.method289((byte) -121);
                class673.field9128 = false;
                return;
            }
            if (arg0 == 6035) {
                int var222 = class557.field7812.field6543.method1419(false);
                class557.field7812.method2755(249682952, field3226[--field3228] == 1 ? 1 : var222, class557.field7812.field6532);
                class510.method3014(3);
                class405.method2515(-124);
                return;
            }
            if (arg0 == 6036) {
                class557.field7812.method2755(249682952, field3226[--field3228], class557.field7812.field6552);
                class90.method681(10343);
                class64.field792 = true;
                return;
            }
            if (arg0 == 6037) {
                class557.field7812.method2755(249682952, field3226[--field3228], class557.field7812.field6545);
                class90.method681(10343);
                class673.field9128 = false;
                return;
            }
            if (arg0 == 6038) {
                int var223 = field3226[--field3228];
                int var224 = class557.field7812.field6515.method3029(false);
                if (var223 != var224 && class147.field2116 == class118.field1431) {
                    if (!class349.method2250((byte) 35, class222.field2897)) {
                        if (var224 == 0) {
                            class658.method3616(var223, class118.field1431, 0, false, class587.field8276, 0);
                            class64.method540(-1);
                            class105.field1268 = false;
                        } else if (var223 == 0) {
                            class105.method743(125);
                            class105.field1268 = false;
                        } else {
                            class699.method3937(-1, var223);
                        }
                    }
                    class557.field7812.method2755(249682952, var223, class557.field7812.field6515);
                    class90.method681(10343);
                    class673.field9128 = false;
                }
                return;
            }
            if (arg0 == 6039) {
                int var225 = field3226[--field3228];
                if (var225 > 255 || var225 < 0) {
                    var225 = 0;
                }
                if (var225 != class557.field7812.field6518.method982(false)) {
                    class557.field7812.method2755(249682952, var225, class557.field7812.field6518);
                    class90.method681(10343);
                    class673.field9128 = false;
                }
                return;
            }
            if (arg0 == 6040) {
                int var226 = field3226[--field3228];
                if (var226 != class557.field7812.field6556.method2647(false)) {
                    class557.field7812.method2755(249682952, var226, class557.field7812.field6556);
                    class90.method681(10343);
                    class673.field9128 = false;
                    class729.method4096(-1);
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field3226[field3228++] = class557.field7812.field6510.method1695(false);
                return;
            }
            if (arg0 == 6102) {
                field3226[field3228++] = class557.field7812.field6543.method1419(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field3226[field3228++] = class557.field7812.field6507.method3516(false) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field3226[field3228++] = class557.field7812.field6528.method3559(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field3226[field3228++] = class557.field7812.field6511.method4150(false);
                return;
            }
            if (arg0 == 6108) {
                field3226[field3228++] = class557.field7812.field6512.method3355(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field3226[field3228++] = class557.field7812.field6525.method1231(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field3226[field3228++] = class557.field7812.field6542.method1222(false);
                return;
            }
            if (arg0 == 6112) {
                field3226[field3228++] = class557.field7812.field6548.method20(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field3226[field3228++] = class557.field7812.field6520.method77(false) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field3226[field3228++] = class557.field7812.field6557.method3237(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field3226[field3228++] = class557.field7812.field6553.method3560(false);
                return;
            }
            if (arg0 == 6117) {
                field3226[field3228++] = class557.field7812.field6536.method3530(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field3226[field3228++] = class557.field7812.field6527.method3029(false);
                return;
            }
            if (arg0 == 6119) {
                field3226[field3228++] = class557.field7812.field6547.method3029(false);
                return;
            }
            if (arg0 == 6120) {
                field3226[field3228++] = class557.field7812.field6550.method3029(false);
                return;
            }
            if (arg0 == 6123) {
                field3226[field3228++] = class111.method786((byte) 81);
                return;
            }
            if (arg0 == 6124) {
                field3226[field3228++] = class557.field7812.field6537.method3560(false);
                return;
            }
            if (arg0 == 6125) {
                field3226[field3228++] = class557.field7812.field6514.method651(false);
                return;
            }
            if (arg0 == 6127) {
                field3226[field3228++] = class557.field7812.field6524.method2217(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field3226[field3228++] = class557.field7812.field6535.method2177(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field3226[field3228++] = class557.field7812.field6511.method4150(false);
                return;
            }
            if (arg0 == 6130) {
                field3226[field3228++] = class557.field7812.field6546.method1308(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field3226[field3228++] = class557.field7812.field6521.method2556(false);
                return;
            }
            if (arg0 == 6132) {
                field3226[field3228++] = class557.field7812.field6555.method2556(false);
                return;
            }
            if (arg0 == 6133) {
                field3226[field3228++] = class202.field2644.field4385 && !class202.field2644.field4367 ? 1 : 0;
                return;
            }
            if (arg0 == 6135) {
                field3226[field3228++] = class557.field7812.field6540.method1300(false);
                return;
            }
            if (arg0 == 6136) {
                field3226[field3228++] = class557.field7812.field6522.method2865(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field3226[field3228++] = class752.method4186(200, class557.field7812.field6521.method2556(false), (byte) 83);
                return;
            }
            if (arg0 == 6139) {
                field3226[field3228++] = class557.field7812.field6552.method4108(false);
                return;
            }
            if (arg0 == 6142) {
                field3226[field3228++] = class557.field7812.field6545.method3029(false);
                return;
            }
            if (arg0 == 6143) {
                field3226[field3228++] = class557.field7812.field6515.method3029(false);
                return;
            }
            if (arg0 == 6144) {
                field3226[field3228++] = class105.field1269 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field3226[field3228++] = class557.field7812.field6518.method982(false);
                return;
            }
            if (arg0 == 6146) {
                field3226[field3228++] = class557.field7812.field6556.method2647(false);
                return;
            }
            if (arg0 == 6147) {
                field3226[field3228++] = class470.field6666.field5558 < 512 || class105.field1269 || class167.field2289 ? 1 : 0;
                return;
            }
            if (arg0 == 6148) {
                field3226[field3228++] = class451.field6387 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field3228 -= 2;
                class347.field4907 = (short) field3226[field3228];
                if (class347.field4907 <= 0) {
                    class347.field4907 = 256;
                }
                class600.field8426 = (short) field3226[field3228 + 1];
                if (class600.field8426 <= 0) {
                    class600.field8426 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field3228 -= 2;
                class314.field4350 = (short) field3226[field3228];
                if (class314.field4350 <= 0) {
                    class314.field4350 = 256;
                }
                class343.field4787 = (short) field3226[field3228 + 1];
                if (class343.field4787 <= 0) {
                    class343.field4787 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field3228 -= 4;
                class456.field6437 = (short) field3226[field3228];
                if (class456.field6437 <= 0) {
                    class456.field6437 = 1;
                }
                class220.field2881 = (short) field3226[field3228 + 1];
                if (class220.field2881 <= 0) {
                    class220.field2881 = 32767;
                } else if (class220.field2881 < class456.field6437) {
                    class220.field2881 = class456.field6437;
                }
                class310.field4319 = (short) field3226[field3228 + 2];
                if (class310.field4319 <= 0) {
                    class310.field4319 = 1;
                }
                class187.field2515 = (short) field3226[field3228 + 3];
                if (class187.field2515 <= 0) {
                    class187.field2515 = 32767;
                    return;
                }
                if (class187.field2515 < class310.field4319) {
                    class187.field2515 = class310.field4319;
                }
                return;
            }
            if (arg0 == 6203) {
                class228.method1421(false, false, 0, class371.field5222.field7031, class371.field5222.field7095, 0);
                field3226[field3228++] = class493.field7109;
                field3226[field3228++] = class213.field2807;
                return;
            }
            if (arg0 == 6204) {
                field3226[field3228++] = class314.field4350;
                field3226[field3228++] = class343.field4787;
                return;
            }
            if (arg0 == 6205) {
                field3226[field3228++] = class347.field4907;
                field3226[field3228++] = class600.field8426;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field3226[field3228++] = (int) (class479.method2864((byte) -95) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field3226[field3228++] = (int) (class479.method2864((byte) -42) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field3228 -= 3;
                int var227 = field3226[field3228];
                int var228 = field3226[field3228 + 1];
                int var229 = field3226[field3228 + 2];
                field3227.clear();
                field3227.set(11, 12);
                field3227.set(var229, var228, var227);
                int var230 = (int) (field3227.getTime().getTime() / 86400000L) - 11745;
                if (var229 < 1970) {
                    var230--;
                }
                field3226[field3228++] = var230;
                return;
            }
            if (arg0 == 6303) {
                field3227.clear();
                field3227.setTime(new Date(class479.method2864((byte) -39)));
                field3226[field3228++] = field3227.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var231 = field3226[--field3228];
                boolean var232 = true;
                if (var231 < 0) {
                    var232 = (var231 + 1) % 4 == 0;
                } else if (var231 < 1582) {
                    var232 = var231 % 4 == 0;
                } else if (var231 % 4 != 0) {
                    var232 = false;
                } else if (var231 % 100 != 0) {
                    var232 = true;
                } else if (var231 % 400 != 0) {
                    var232 = false;
                }
                field3226[field3228++] = var232 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field3226[field3228++] = class391.method2461(0) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field3226[field3228++] = class341.method2205(5) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class222.field2897 == 7 && class215.field2831 == 0 && class69.field856 == 0) {
                    if (class135.field1971) {
                        field3226[field3228++] = 0;
                        return;
                    }
                    if (class146.field2102 > class479.method2864((byte) -82) - 1000L) {
                        field3226[field3228++] = 1;
                        return;
                    }
                    class135.field1971 = true;
                    class519 var233 = class357.method2293(class427.field5994, class533.field7503, (byte) -74);
                    var233.field7384.method3733(-49, class360.field5115);
                    class151.method1027(var233, -53);
                    field3226[field3228++] = 0;
                    return;
                }
                field3226[field3228++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class287 var234 = class391.method2460(0);
                if (var234 != null) {
                    field3226[field3228++] = var234.field4067;
                    field3226[field3228++] = var234.field2182;
                    field3216[field3213++] = var234.field4068;
                    class439 var235 = var234.method1880((byte) 111);
                    field3226[field3228++] = var235.field6253;
                    field3216[field3213++] = var235.field6248;
                    field3226[field3228++] = var234.field2183;
                    field3226[field3228++] = var234.field4064;
                    field3216[field3213++] = var234.field4062;
                    return;
                }
                field3226[field3228++] = -1;
                field3226[field3228++] = 0;
                field3216[field3213++] = "";
                field3226[field3228++] = 0;
                field3216[field3213++] = "";
                field3226[field3228++] = 0;
                field3226[field3228++] = 0;
                field3216[field3213++] = "";
                return;
            }
            if (arg0 == 6502) {
                class287 var236 = class759.method4214(1554);
                if (var236 != null) {
                    field3226[field3228++] = var236.field4067;
                    field3226[field3228++] = var236.field2182;
                    field3216[field3213++] = var236.field4068;
                    class439 var237 = var236.method1880((byte) 111);
                    field3226[field3228++] = var237.field6253;
                    field3216[field3213++] = var237.field6248;
                    field3226[field3228++] = var236.field2183;
                    field3226[field3228++] = var236.field4064;
                    field3216[field3213++] = var236.field4062;
                    return;
                }
                field3226[field3228++] = -1;
                field3226[field3228++] = 0;
                field3216[field3213++] = "";
                field3226[field3228++] = 0;
                field3216[field3213++] = "";
                field3226[field3228++] = 0;
                field3226[field3228++] = 0;
                field3216[field3213++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var238 = field3226[--field3228];
                String var239 = field3216[--field3213];
                if (class222.field2897 == 7 && class215.field2831 == 0 && class69.field856 == 0) {
                    field3226[field3228++] = class518.method3038((byte) 49, var239, var238) ? 1 : 0;
                    return;
                }
                field3226[field3228++] = 0;
                return;
            }
            if (arg0 == 6506) {
                int var240 = field3226[--field3228];
                class287 var241 = class233.method1502(46, var240);
                if (var241 != null) {
                    field3226[field3228++] = var241.field2182;
                    field3216[field3213++] = var241.field4068;
                    class439 var242 = var241.method1880((byte) 111);
                    field3226[field3228++] = var242.field6253;
                    field3216[field3213++] = var242.field6248;
                    field3226[field3228++] = var241.field2183;
                    field3226[field3228++] = var241.field4064;
                    field3216[field3213++] = var241.field4062;
                    return;
                }
                field3226[field3228++] = -1;
                field3216[field3213++] = "";
                field3226[field3228++] = 0;
                field3216[field3213++] = "";
                field3226[field3228++] = 0;
                field3226[field3228++] = 0;
                field3216[field3213++] = "";
                return;
            }
            if (arg0 == 6507) {
                field3228 -= 4;
                int var243 = field3226[field3228];
                boolean var244 = field3226[field3228 + 1] == 1;
                int var245 = field3226[field3228 + 2];
                boolean var246 = field3226[field3228 + 3] == 1;
                class400.method2499(var245, var243, (byte) 114, var244, var246);
                return;
            }
            if (arg0 == 6508) {
                class41.method276((byte) 90);
                return;
            }
            if (arg0 == 6509) {
                if (class222.field2897 != 7) {
                    return;
                }
                class425.field5980 = field3226[--field3228] == 1;
                return;
            }
            if (arg0 == 6510) {
                field3226[field3228++] = class273.field3901;
                return;
            }
        } else if (arg0 >= 6700) {
            if (arg0 < 6800 && class622.field8663 == class28.field378) {
                if (arg0 == 6700) {
                    int var247 = class475.field6744.method1177(-95);
                    if (class457.field6447 != -1) {
                        var247++;
                    }
                    field3226[field3228++] = var247;
                    return;
                }
                if (arg0 == 6701) {
                    int var248 = field3226[--field3228];
                    if (class457.field6447 != -1) {
                        if (var248 == 0) {
                            field3226[field3228++] = class457.field6447;
                            return;
                        }
                        var248--;
                    }
                    class47 var249 = (class47) class475.field6744.method1176(24490);
                    while (var248-- > 0) {
                        var249 = (class47) class475.field6744.method1178((byte) 71);
                    }
                    field3226[field3228++] = var249.field550;
                    return;
                }
                if (arg0 == 6702) {
                    int var250 = field3226[--field3228];
                    if (class37.field475[var250] == null) {
                        field3216[field3213++] = "";
                        return;
                    }
                    String var251 = class37.field475[var250][0].field6949;
                    if (var251 == null) {
                        field3216[field3213++] = "";
                        return;
                    }
                    field3216[field3213++] = var251.substring(0, var251.indexOf(58));
                    return;
                }
                if (arg0 == 6703) {
                    int var252 = field3226[--field3228];
                    if (class37.field475[var252] == null) {
                        field3226[field3228++] = 0;
                        return;
                    }
                    field3226[field3228++] = class37.field475[var252].length;
                    return;
                }
                if (arg0 == 6704) {
                    field3228 -= 2;
                    int var253 = field3226[field3228];
                    int var254 = field3226[field3228 + 1];
                    if (class37.field475[var253] == null) {
                        field3216[field3213++] = "";
                        return;
                    }
                    String var255 = class37.field475[var253][var254].field6949;
                    if (var255 == null) {
                        field3216[field3213++] = "";
                        return;
                    }
                    field3216[field3213++] = var255;
                    return;
                }
                if (arg0 == 6705) {
                    field3228 -= 2;
                    int var256 = field3226[field3228];
                    int var257 = field3226[field3228 + 1];
                    if (class37.field475[var256] == null) {
                        field3226[field3228++] = 0;
                        return;
                    }
                    field3226[field3228++] = class37.field475[var256][var257].field6972;
                    return;
                }
                if (arg0 == 6706) {
                    return;
                }
                if (arg0 == 6707) {
                    field3228 -= 3;
                    int var258 = field3226[field3228];
                    int var259 = field3226[field3228 + 1];
                    int var260 = field3226[field3228 + 2];
                    class481.method2872(var258 << 16 | var259, 1, var260, "", (byte) 126);
                    return;
                }
                if (arg0 == 6708) {
                    field3228 -= 3;
                    int var261 = field3226[field3228];
                    int var262 = field3226[field3228 + 1];
                    int var263 = field3226[field3228 + 2];
                    class481.method2872(var261 << 16 | var262, 2, var263, "", (byte) 122);
                    return;
                }
                if (arg0 == 6709) {
                    field3228 -= 3;
                    int var264 = field3226[field3228];
                    int var265 = field3226[field3228 + 1];
                    int var266 = field3226[field3228 + 2];
                    class481.method2872(var264 << 16 | var265, 3, var266, "", (byte) 122);
                    return;
                }
                if (arg0 == 6710) {
                    field3228 -= 3;
                    int var267 = field3226[field3228];
                    int var268 = field3226[field3228 + 1];
                    int var269 = field3226[field3228 + 2];
                    class481.method2872(var267 << 16 | var268, 4, var269, "", (byte) 118);
                    return;
                }
                if (arg0 == 6711) {
                    field3228 -= 3;
                    int var270 = field3226[field3228];
                    int var271 = field3226[field3228 + 1];
                    int var272 = field3226[field3228 + 2];
                    class481.method2872(var270 << 16 | var271, 5, var272, "", (byte) 122);
                    return;
                }
                if (arg0 == 6712) {
                    field3228 -= 3;
                    int var273 = field3226[field3228];
                    int var274 = field3226[field3228 + 1];
                    int var275 = field3226[field3228 + 2];
                    class481.method2872(var273 << 16 | var274, 6, var275, "", (byte) 120);
                    return;
                }
                if (arg0 == 6713) {
                    field3228 -= 3;
                    int var276 = field3226[field3228];
                    int var277 = field3226[field3228 + 1];
                    int var278 = field3226[field3228 + 2];
                    class481.method2872(var276 << 16 | var277, 7, var278, "", (byte) 123);
                    return;
                }
                if (arg0 == 6714) {
                    field3228 -= 3;
                    int var279 = field3226[field3228];
                    int var280 = field3226[field3228 + 1];
                    int var281 = field3226[field3228 + 2];
                    class481.method2872(var279 << 16 | var280, 8, var281, "", (byte) 119);
                    return;
                }
                if (arg0 == 6715) {
                    field3228 -= 3;
                    int var282 = field3226[field3228];
                    int var283 = field3226[field3228 + 1];
                    int var284 = field3226[field3228 + 2];
                    class481.method2872(var282 << 16 | var283, 9, var284, "", (byte) 125);
                    return;
                }
                if (arg0 == 6716) {
                    field3228 -= 3;
                    int var285 = field3226[field3228];
                    int var286 = field3226[field3228 + 1];
                    int var287 = field3226[field3228 + 2];
                    class481.method2872(var285 << 16 | var286, 10, var287, "", (byte) 124);
                    return;
                }
                if (arg0 == 6717) {
                    field3228 -= 3;
                    int var288 = field3226[field3228];
                    int var289 = field3226[field3228 + 1];
                    int var290 = field3226[field3228 + 2];
                    class493 var291 = class323.method2083(var288 << 16 | var289, (byte) -103, var290);
                    class37.method210(-1);
                    class477 var292 = client.method1950(var291);
                    class243.method1556(var292.method2855(false), var292.field6772, var291, true);
                    return;
                }
            } else if (arg0 < 6900) {
                if (arg0 == 6800) {
                    int var293 = field3226[--field3228];
                    class344 var294 = class569.field8079.method3088((byte) -78, var293);
                    if (var294.field4847 == null) {
                        field3216[field3213++] = "";
                        return;
                    }
                    field3216[field3213++] = var294.field4847;
                    return;
                }
                if (arg0 == 6801) {
                    int var295 = field3226[--field3228];
                    class344 var296 = class569.field8079.method3088((byte) -85, var295);
                    field3226[field3228++] = var296.field4803;
                    return;
                }
                if (arg0 == 6802) {
                    int var297 = field3226[--field3228];
                    class344 var298 = class569.field8079.method3088((byte) -92, var297);
                    field3226[field3228++] = var298.field4808;
                    return;
                }
                if (arg0 == 6803) {
                    int var299 = field3226[--field3228];
                    class344 var300 = class569.field8079.method3088((byte) -108, var299);
                    field3226[field3228++] = var300.field4807;
                    return;
                }
                if (arg0 == 6804) {
                    field3228 -= 2;
                    int var301 = field3226[field3228];
                    int var302 = field3226[field3228 + 1];
                    class82 var303 = class605.field8497.method154(var302, (byte) -120);
                    if (var303.method634(0)) {
                        field3216[field3213++] = class569.field8079.method3088((byte) -103, var301).method2228((byte) -74, var303.field1031, var302);
                        return;
                    }
                    field3226[field3228++] = class569.field8079.method3088((byte) -91, var301).method2222(var303.field1025, (byte) -128, var302);
                    return;
                }
            } else if (arg0 < 7000) {
                if (arg0 == 6900) {
                    field3226[field3228++] = class567.field8052 && !class491.field6932 ? 1 : 0;
                    return;
                }
                if (arg0 == 6901) {
                    field3226[field3228++] = class377.field5297;
                    return;
                }
                if (arg0 == 6902) {
                    field3226[field3228++] = class505.field7242;
                    return;
                }
                if (arg0 == 6903) {
                    field3226[field3228++] = class426.field5988;
                    return;
                }
                if (arg0 == 6904) {
                    field3226[field3228++] = class189.field2539;
                    return;
                }
                if (arg0 == 6905) {
                    String var304 = "";
                    if (class579.field8177 != null) {
                        if (class579.field8177.field3311 == null) {
                            var304 = class710.method3983(class579.field8177.field3314, 1677133712);
                        } else {
                            var304 = (String) class579.field8177.field3311;
                        }
                    }
                    field3216[field3213++] = var304;
                    return;
                }
                if (arg0 == 6906) {
                    field3226[field3228++] = class314.field4339;
                    return;
                }
                if (arg0 == 6907) {
                    field3226[field3228++] = class336.field4681;
                    return;
                }
                if (arg0 == 6908) {
                    field3226[field3228++] = class117.field1420;
                    return;
                }
                if (arg0 == 6909) {
                    field3226[field3228++] = class302.field4253 ? 1 : 0;
                    return;
                }
                if (arg0 == 6910) {
                    field3226[field3228++] = class211.field2787;
                    return;
                }
                if (arg0 == 6911) {
                    field3226[field3228++] = class312.field4328;
                    return;
                }
                if (arg0 == 6912) {
                    field3226[field3228++] = class736.field10257;
                    return;
                }
            } else if (arg0 < 7100) {
                if (arg0 == 7000) {
                    int var305 = class471.method2819((byte) -76);
                    field3226[field3228++] = class473.field6715 = class557.field7812.field6521.method2556(false);
                    field3226[field3228++] = var305;
                    class510.method3014(3);
                    class90.method681(10343);
                    class673.field9128 = false;
                    return;
                }
                if (arg0 == 7001) {
                    class643.method3555(-1);
                    class510.method3014(3);
                    class90.method681(10343);
                    class673.field9128 = false;
                    return;
                }
                if (arg0 == 7002) {
                    class262.method1713(1);
                    class510.method3014(3);
                    class90.method681(10343);
                    class673.field9128 = false;
                    return;
                }
                if (arg0 == 7003) {
                    class493.method2941(-65536);
                    class510.method3014(3);
                    class90.method681(10343);
                    class673.field9128 = false;
                    return;
                }
                if (arg0 == 7004) {
                    class546.method3170(87, true);
                    class510.method3014(3);
                    class90.method681(10343);
                    class673.field9128 = false;
                    return;
                }
                if (arg0 == 7005) {
                    class557.field7812.method2755(249682952, 0, class557.field7812.field6508);
                    class90.method681(10343);
                    class673.field9128 = false;
                    return;
                }
                if (arg0 == 7006) {
                    if (class473.field6715 == 2) {
                        class245.field3273 = true;
                        return;
                    }
                    if (class473.field6715 == 1) {
                        class380.field5440 = true;
                        return;
                    }
                    if (class473.field6715 == 3) {
                        class87.field1064 = true;
                    }
                    return;
                }
                if (arg0 == 7007) {
                    field3226[field3228++] = class557.field7812.field6508.method2353(false);
                    return;
                }
            } else if (arg0 < 7200) {
                if (arg0 == 7100) {
                    field3228 -= 2;
                    int var306 = field3226[field3228];
                    int var307 = field3226[field3228 + 1];
                    if (var306 != -1) {
                        if (var307 > 255) {
                            var307 = 255;
                        } else if (var307 < 0) {
                            var307 = 0;
                        }
                        class233.method1501(var306, false, var307, 4096);
                    }
                    return;
                }
                if (arg0 == 7101) {
                    int var308 = field3226[--field3228];
                    if (var308 != -1) {
                        class748.method4158(var308, (byte) 108);
                    }
                    return;
                }
                if (arg0 == 7102) {
                    int var309 = field3226[--field3228];
                    if (var309 != -1) {
                        class677.method3772((byte) 50, var309);
                    }
                    return;
                }
                if (arg0 == 7103) {
                    field3226[field3228++] = class29.method167((byte) -64, "jagtheora") ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7300) {
                if (arg0 == 7201) {
                    field3226[field3228++] = class557.field7812.field6528.method3558((byte) -53) ? 1 : 0;
                    return;
                }
                if (arg0 == 7202) {
                    field3226[field3228++] = class557.field7812.field6525.method1230((byte) -53) ? 1 : 0;
                    return;
                }
                if (arg0 == 7203) {
                    field3226[field3228++] = class557.field7812.field6542.method1225((byte) -53) ? 1 : 0;
                    return;
                }
                if (arg0 == 7204) {
                    field3226[field3228++] = class557.field7812.field6520.method78((byte) -53) ? 1 : 0;
                    return;
                }
                if (arg0 == 7205) {
                    field3226[field3228++] = class557.field7812.field6537.method3562((byte) -53) && class268.field3831.method468() ? 1 : 0;
                    return;
                }
                if (arg0 == 7206) {
                    field3226[field3228++] = class557.field7812.field6516.method806((byte) -53) ? 1 : 0;
                    return;
                }
                if (arg0 == 7207) {
                    field3226[field3228++] = class557.field7812.field6514.method650((byte) -53) ? 1 : 0;
                    return;
                }
                if (arg0 == 7208) {
                    field3226[field3228++] = class557.field7812.field6524.method2218((byte) -53) && class268.field3831.method374() ? 1 : 0;
                    return;
                }
                if (arg0 == 7209) {
                    field3226[field3228++] = class557.field7812.field6546.method1307((byte) -53) ? 1 : 0;
                    return;
                }
                if (arg0 == 7210) {
                    field3226[field3228++] = class557.field7812.field6522.method2866((byte) -53) ? 1 : 0;
                    return;
                }
                if (arg0 == 7211) {
                    field3226[field3228++] = class557.field7812.field6552.method4110((byte) -53) ? 1 : 0;
                    return;
                }
                if (arg0 == 7212) {
                    field3226[field3228++] = class557.field7812.field6557.method3239((byte) -53) ? 1 : 0;
                    return;
                }
                if (arg0 == 7213) {
                    field3226[field3228++] = class557.field7812.field6556.method2648((byte) -53) ? 1 : 0;
                    return;
                }
                if (arg0 == 7214) {
                    field3226[field3228++] = class557.field7812.field6555.method2557((byte) -53) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7400) {
                if (arg0 == 7301) {
                    int var310 = field3226[--field3228];
                    field3226[field3228++] = class557.field7812.field6528.method19(var310, 82);
                    return;
                }
                if (arg0 == 7302) {
                    int var311 = field3226[--field3228];
                    field3226[field3228++] = class557.field7812.field6525.method19(var311, 81);
                    return;
                }
                if (arg0 == 7303) {
                    int var312 = field3226[--field3228];
                    field3226[field3228++] = class557.field7812.field6542.method19(var312, 76);
                    return;
                }
                if (arg0 == 7304) {
                    int var313 = field3226[--field3228];
                    field3226[field3228++] = class557.field7812.field6520.method19(var313, 13);
                    return;
                }
                if (arg0 == 7305) {
                    int var314 = field3226[--field3228];
                    if (!class268.field3831.method468()) {
                        field3226[field3228++] = 3;
                        return;
                    }
                    field3226[field3228++] = class557.field7812.field6537.method19(var314, 106);
                    return;
                }
                if (arg0 == 7306) {
                    int var315 = field3226[--field3228];
                    field3226[field3228++] = class557.field7812.field6516.method19(var315, 91);
                    return;
                }
                if (arg0 == 7307) {
                    int var316 = field3226[--field3228];
                    field3226[field3228++] = class557.field7812.field6514.method19(var316, 21);
                    return;
                }
                if (arg0 == 7308) {
                    int var317 = field3226[--field3228];
                    if (!class268.field3831.method374()) {
                        field3226[field3228++] = 3;
                        return;
                    }
                    field3226[field3228++] = class557.field7812.field6524.method19(var317, 85);
                    return;
                }
                if (arg0 == 7309) {
                    int var318 = field3226[--field3228];
                    field3226[field3228++] = class557.field7812.field6546.method19(var318, 85);
                    return;
                }
                if (arg0 == 7310) {
                    int var319 = field3226[--field3228];
                    field3226[field3228++] = class557.field7812.field6522.method19(var319, 125);
                    return;
                }
                if (arg0 == 7311) {
                    int var320 = field3226[--field3228];
                    field3226[field3228++] = class557.field7812.field6552.method19(var320, 79);
                    return;
                }
                if (arg0 == 7312) {
                    int var321 = field3226[--field3228];
                    field3226[field3228++] = class557.field7812.field6557.method19(var321, 58);
                    return;
                }
                if (arg0 == 7313) {
                    int var322 = field3226[--field3228];
                    field3226[field3228++] = class557.field7812.field6556.method19(var322, 67);
                    return;
                }
                if (arg0 == 7314) {
                    int var323 = field3226[--field3228];
                    field3226[field3228++] = class557.field7812.field6555.method19(var323, 78);
                    return;
                }
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }
}
