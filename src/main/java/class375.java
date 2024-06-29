import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class375 extends class578 {

    @OriginalMember(owner = "client!aw", name = "q", descriptor = "[I")
    public int[] field5472 = new int[1];

    @OriginalMember(owner = "client!aw", name = "n", descriptor = "[I")
    public int[] field5476 = new int[] { -1 };

    @OriginalMember(owner = "client!aw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5485 = new String[] { method2972(method2971("A\u000bDHx")), method2972(method2971("[RD -")), method2972(method2971("TP\u0006\n")), method2972(method2971("[RD%-")), method2972(method2971("[RD'-")), method2972(method2971("[RD!-")), method2972(method2971("[RD$-")), method2972(method2971("[RD#-")), method2972(method2971("[RD\"-")) };

    @OriginalMember(owner = "client!aw", name = "r", descriptor = "Z")
    public static boolean field5481 = false;

    @OriginalMember(owner = "client!aw", name = "s", descriptor = "Lsb;")
    public static class261 field5478 = new class261(102, 3);

    @OriginalMember(owner = "client!aw", name = "l", descriptor = "[Lol;")
    public static class180[] field5484 = new class180[6];

    @OriginalMember(owner = "client!aw", name = "u", descriptor = "I")
    public static int field5473;

    @OriginalMember(owner = "client!aw", name = "j", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!aw", name = "o", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!aw", name = "i", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!aw", name = "t", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!aw", name = "m", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!aw", name = "p", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!aw", name = "k", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!aw", name = "v", descriptor = "Z")
    public static boolean field5471;

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)Lng;", line = 3)
    public static final class429 method2964(int arg0) {
        try {
            field5477++;
            return arg0 == 28563 ? class786.field11354 : null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5485[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "([IZBI[I)J", line = 16)
    private final long method2965(int[] arg0, boolean arg1, byte arg2, int arg3, int[] arg4) {
        try {
            field5479++;
            long[] var6 = class57.field813;
            long var7 = -1L;
            if (arg2 != 114) {
                return -99L;
            }
            long var9 = var7 >>> 8 ^ var6[(int) (((long) (arg3 >> 8) ^ var7) & 0xFFL)];
            long var11 = var9 >>> 8 ^ var6[(int) ((var9 ^ (long) arg3) & 0xFFL)];
            for (int var13 = 0; var13 < arg4.length; var13++) {
                long var14 = var6[(int) (((long) (arg4[var13] >> 24) ^ var11) & 0xFFL)] ^ var11 >>> 8;
                long var16 = var6[(int) ((var14 ^ (long) (arg4[var13] >> 16)) & 0xFFL)] ^ var14 >>> 8;
                long var18 = var6[(int) ((var16 ^ (long) (arg4[var13] >> 8)) & 0xFFL)] ^ var16 >>> 8;
                var11 = var18 >>> 8 ^ var6[(int) ((var18 ^ (long) arg4[var13]) & 0xFFL)];
            }
            if (arg0 != null) {
                for (int var20 = 0; var20 < 5; var20++) {
                    var11 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) arg0[var20]) & 0xFFL)];
                }
            }
            return var6[(int) (((long) (arg1 ? 1 : 0) ^ var11) & 0xFFL)] ^ var11 >>> 8;
        } catch (RuntimeException var24) {
            throw class665.method4799(var24, field5485[1] + (arg0 == null ? field5485[2] : field5485[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field5485[2] : field5485[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(B)I", line = 60)
    public static final int method2966(byte arg0) {
        try {
            if (arg0 <= 56) {
                method2964(-71);
            }
            field5475++;
            if (class543.field7943 == null) {
                if (!class86.field1217 && class44.field639 != null) {
                    return class44.field639.field3304;
                }
                int var1 = class604.field8668.method2881((byte) 121);
                int var2 = class604.field8668.method2879(-237);
                if (class493.field7252) {
                    if (var1 > class637.field9012 && var1 < (class637.field9012 + class525.field7646)) {
                        int var10 = -1;
                        for (int var11 = 0; var11 < class17.field221; var11++) {
                            if (class728.field10430) {
                                int var12 = var11 * 16 + class433.field6281 + 33;
                                if (var12 - 13 < var2 && var12 + 3 >= var2) {
                                    var10 = var11;
                                }
                            } else {
                                int var13 = var11 * 16 + class433.field6281 + 31;
                                if ((var13 - 13) < var2 && (var13 + 3) >= var2) {
                                    var10 = var11;
                                }
                            }
                        }
                        if (var10 != -1) {
                            int var14 = 0;
                            class701 var15 = new class701(class520.field7588);
                            for (class801 var16 = (class801) var15.method5045(0); var16 != null; var16 = (class801) var15.method5044((byte) 7)) {
                                if (var10 == (var14++)) {
                                    return ((class228) var16.field11651.field7555.field9626).field3304;
                                }
                            }
                        }
                    } else if (class582.field8406 != null && class647.field9199 < var1 && var1 < class647.field9199 + class435.field6411) {
                        int var17 = -1;
                        for (int var18 = 0; var18 < class582.field8406.field11653; var18++) {
                            if (class728.field10430) {
                                int var19 = var18 * 16 + (class238.field3444 + 33);
                                if (var2 > var19 - 13 && var19 + 3 >= var2) {
                                    var17 = var18;
                                }
                            } else {
                                int var20 = class238.field3444 - (-var18 * 16 - 31);
                                if ((var20 - 13) < var2 && var2 <= var20 + 3) {
                                    var17 = var18;
                                }
                            }
                        }
                        if (var17 != -1) {
                            int var21 = 0;
                            class701 var22 = new class701(class582.field8406.field11651);
                            for (class228 var23 = (class228) var22.method5045(0); var23 != null; var23 = (class228) var22.method5044((byte) -127)) {
                                if (var17 == var21++) {
                                    return var23.field3304;
                                }
                            }
                        }
                    }
                } else if (var1 > class637.field9012 && var1 < class637.field9012 + class525.field7646) {
                    int var3 = -1;
                    for (int var4 = 0; var4 < class72.field1049; var4++) {
                        if (class728.field10430) {
                            int var5 = class433.field6281 + ((class72.field1049 - 1 + -var4) * 16) + 33;
                            if (var2 > (var5 - 13) && var5 + 3 >= var2) {
                                var3 = var4;
                            }
                        } else {
                            int var6 = class433.field6281 + (class72.field1049 + -1 - var4) * 16 + 31;
                            if ((var6 - 13) < var2 && (var6 + 3) >= var2) {
                                var3 = var4;
                            }
                        }
                    }
                    if (var3 != -1) {
                        int var7 = 0;
                        class336 var8 = new class336(class45.field644);
                        for (class228 var9 = (class228) var8.method2703((byte) 32); var9 != null; var9 = (class228) var8.method2704(0)) {
                            if (var7++ == var3) {
                                return var9.field3304;
                            }
                        }
                    }
                }
            }
            return -1;
        } catch (RuntimeException var25) {
            throw class665.method4799(var25, field5485[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(III)Z", line = 257)
    public static final boolean method2967(int arg0, int arg1, int arg2) {
        try {
            field5473++;
            if (arg2 != 4) {
                method2964(41);
            }
            return ((arg1 & 0x2000) != 0 | class639.method4653(arg1, arg0, -4413) | class79.method789(arg1, 579, arg0)) & class322.method2548(arg0, arg1, -1);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5485[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V", line = 275)
    public static void method2968(int arg0) {
        try {
            if (arg0 == 16) {
                field5478 = null;
                field5484 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5485[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(BLmv;Loja;)Ldm;", line = 286)
    public static final class274 method2969(byte arg0, class125 arg1, class646 arg2) {
        try {
            field5474++;
            class274 var3 = class551.method4126(0);
            var3.field3882 = arg1.field1575;
            if (arg0 != 1) {
                return null;
            }
            var3.field3880 = arg1;
            if (var3.field3882 == -1) {
                var3.field3885 = new class476(260);
            } else if (var3.field3882 == -2) {
                var3.field3885 = new class476(10000);
            } else if (var3.field3882 <= 18) {
                var3.field3885 = new class476(20);
            } else if (var3.field3882 <= 98) {
                var3.field3885 = new class476(100);
            } else {
                var3.field3885 = new class476(260);
            }
            var3.field3885.method3683(-6436, arg2);
            var3.field3885.method3680(var3.field3880.method1118((byte) -92), (byte) 0);
            var3.field3879 = 0;
            return var3;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5485[3] + arg0 + ',' + (arg1 == null ? field5485[2] : field5485[0]) + ',' + (arg2 == null ? field5485[2] : field5485[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Ldea;ILqu;BIZLha;)Lka;", line = 328)
    public final class761 method2970(class471 arg0, int arg1, class84 arg2, byte arg3, int arg4, boolean arg5, class18 arg6) {
        try {
            field5480++;
            class761 var8 = null;
            int var9 = arg4;
            if (arg3 >= -39) {
                return null;
            }
            class765 var10 = null;
            if (arg1 != -1) {
                var10 = class772.field10996.method2792(arg1, (byte) 18);
            }
            int[] var11 = this.field5476;
            if (var10 != null && var10.field10921 != null) {
                var11 = new int[var10.field10921.length];
                for (int var12 = 0; var12 < var10.field10921.length; var12++) {
                    int var13 = var10.field10921[var12];
                    if (var13 >= 0 && var13 < this.field5476.length) {
                        var11[var12] = this.field5476[var13];
                    } else {
                        var11[var12] = -1;
                    }
                }
            }
            if (arg2 != null) {
                var9 = arg4 | arg2.method830(96);
            }
            long var14 = this.method2965(arg0 == null ? null : arg0.field6911, arg5, (byte) 114, arg1, var11);
            if (class29.field366 != null) {
                var8 = (class761) class29.field366.method2053(0, var14);
            }
            if (var8 == null || arg6.method226(var8.method395(), var9) != 0) {
                if (var8 != null) {
                    var9 = arg6.method194(var9, var8.method395());
                }
                int var16 = var9;
                boolean var17 = false;
                for (int var18 = 0; var18 < var11.length; var18++) {
                    if (var11[var18] != -1 && !class153.field1955.method3237(var11[var18], 0).method2930(2, arg5, null)) {
                        var17 = true;
                    }
                }
                if (var17) {
                    return null;
                }
                class60[] var19 = new class60[var11.length];
                for (int var20 = 0; var20 < var11.length; var20++) {
                    if (var11[var20] != -1) {
                        var19[var20] = class153.field1955.method3237(var11[var20], 0).method2941(arg5, true, null);
                    }
                }
                if (var10 != null && var10.field10884 != null) {
                    for (int var21 = 0; var21 < var10.field10884.length; var21++) {
                        if (var10.field10884[var21] != null && var19[var21] != null) {
                            int var22 = var10.field10884[var21][0];
                            int var23 = var10.field10884[var21][1];
                            int var24 = var10.field10884[var21][2];
                            int var25 = var10.field10884[var21][3];
                            int var26 = var10.field10884[var21][4];
                            int var27 = var10.field10884[var21][5];
                            if (var25 != 0 || var26 != 0 || var27 != 0) {
                                var19[var21].method647(var27, var25, (byte) 105, var26);
                            }
                            if (var22 != 0 || var23 != 0 || var24 != 0) {
                                var19[var21].method650(var22, var24, var23, true);
                            }
                        }
                    }
                }
                if (arg0 != null) {
                    var16 = var9 | 0x4000;
                }
                class60 var28 = new class60(var19, var19.length);
                var8 = arg6.method197(var28, var16, class195.field2922, 64, 850);
                if (arg0 != null) {
                    for (int var29 = 0; var29 < 5; var29++) {
                        for (int var30 = 0; var30 < class617.field8803.length; var30++) {
                            if (arg0.field6911[var29] < class617.field8803[var30][var29].length) {
                                var8.method386(class511.field7497[var30][var29], class617.field8803[var30][var29][arg0.field6911[var29]]);
                            }
                        }
                    }
                }
                if (class29.field366 != null) {
                    var8.method411(var9);
                    class29.field366.method2051(var14, var8, 93);
                }
            }
            if (arg2 == null) {
                return var8;
            } else {
                class761 var31 = var8.method418((byte) 1, var9, true);
                arg2.method825((byte) -115, 0, var31);
                return var31;
            }
        } catch (RuntimeException var33) {
            throw class665.method4799(var33, field5485[8] + (arg0 == null ? field5485[2] : field5485[0]) + ',' + arg1 + ',' + (arg2 == null ? field5485[2] : field5485[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field5485[2] : field5485[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!aw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2971(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2972(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 58;
                    break;
                case 1:
                    var10005 = 37;
                    break;
                case 2:
                    var10005 = 106;
                    break;
                case 3:
                    var10005 = 102;
                    break;
                default:
                    var10005 = 5;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
