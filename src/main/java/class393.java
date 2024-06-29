import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class393 extends class766 {

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "[I")
    public int[] field5458 = new int[] { -1 };

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "[I")
    public int[] field5460 = new int[1];

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "[I")
    public static int[] field5461;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I[IZI[I)J", line = 6)
    private final long method2351(int arg0, int[] arg1, boolean arg2, int arg3, int[] arg4) {
        field5459++;
        long[] var6 = class709.field9915;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) ((var7 ^ (long) (arg3 >> 8)) & 0xFFL)];
        long var11 = var6[(int) (((long) arg3 ^ var9) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg1.length; var13++) {
            long var17 = var6[(int) ((var11 ^ (long) (arg1[var13] >> 24)) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var17 >>> 8 ^ var6[(int) (((long) (arg1[var13] >> 16) ^ var17) & 0xFFL)];
            long var21 = var19 >>> 8 ^ var6[(int) ((var19 ^ (long) (arg1[var13] >> 8)) & 0xFFL)];
            var11 = var21 >>> 8 ^ var6[(int) ((var21 ^ (long) arg1[var13]) & 0xFFL)];
        }
        if (arg4 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) ((var11 ^ (long) arg4[var14]) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        long var15 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg2 ? 1 : 0)) & 0xFFL)];
        if (arg0 >= -59) {
            method2355((byte) 1);
        }
        return var15;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V", line = 51)
    public static final void method2352(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, int arg17, boolean arg18) {
        class317.field4537 = true;
        class398.field5491 = class29.field307.method472() > 0;
        class721.field10072 = arg15;
        class277.field3995 = arg1 >> class679.field9600;
        class3.field47 = arg3 >> class679.field9600;
        class556.field7718 = arg1;
        class355.field5021 = arg3;
        class379.field5321 = arg2;
        class483.field6677 = class277.field3995 - class162.field2499;
        if (class483.field6677 < 0) {
            class586.field8433 = -class483.field6677;
            class483.field6677 = 0;
        } else {
            class586.field8433 = 0;
        }
        class62.field946 = class3.field47 - class162.field2499;
        if (class62.field946 < 0) {
            class733.field10198 = -class62.field946;
            class62.field946 = 0;
        } else {
            class733.field10198 = 0;
        }
        class163.field2503 = class277.field3995 + class162.field2499;
        if (class163.field2503 > class42.field520) {
            class163.field2503 = class42.field520;
        }
        class350.field4965 = class3.field47 + class162.field2499;
        if (class350.field4965 > class681.field9665) {
            class350.field4965 = class681.field9665;
        }
        boolean[][] var19 = class737.field10233;
        boolean[][] var20 = client.field1581;
        if (class721.field10072) {
            for (int var21 = 0; var21 < class162.field2499 + class162.field2499 + 2; var21++) {
                int var22 = 0;
                int var23 = 0;
                for (int var24 = 0; var24 < class162.field2499 + class162.field2499 + 2; var24++) {
                    if (var24 > 1) {
                        class789.field10793[var24 - 2] = var22;
                    }
                    var22 = var23;
                    int var25 = class277.field3995 + var21 - class162.field2499;
                    int var26 = class3.field47 + var24 - class162.field2499;
                    if (var25 >= 0 && var26 >= 0 && var25 < class42.field520 && var26 < class681.field9665) {
                        int var27 = var25 << class679.field9600;
                        int var28 = var26 << class679.field9600;
                        int var29 = class495.field6799[class495.field6799.length - 1].method2476(var26, var25, -1) - (0x3E8 << class679.field9600 - 7);
                        int var30 = class454.field6207 == null ? class495.field6799[0].method2476(var26, var25, -1) + class253.field3624 : class454.field6207[0].method2476(var26, var25, -1) + class253.field3624;
                        var23 = arg16 >= 0 ? class29.field307.method471(var27, var29, var28, var27, var30, var28, arg16) : class29.field307.method519(var27, var29, var28, var27, var30, var28);
                        client.field1581[var21][var24] = var23 == 0;
                    } else {
                        var23 = -1;
                        client.field1581[var21][var24] = false;
                    }
                    if (var21 > 0 && var24 > 0) {
                        int var31 = class789.field10793[var24 - 1] & class789.field10793[var24] & var22 & var23;
                        class737.field10233[var21 - 1][var24 - 1] = var31 == 0;
                    }
                }
                class789.field10793[class162.field2499 + class162.field2499] = var22;
                class789.field10793[class162.field2499 + class162.field2499 + 1] = var23;
            }
            if (arg16 >= 0) {
                class317.field4537 = false;
            } else {
                class482.field6623 = arg5;
                class703.field9854 = arg6;
                class615.field8720 = arg7;
                class493.field6764 = arg8;
                class647.field9190 = arg9;
                class86.method761(arg10, (byte) 63, class29.field307);
            }
        } else {
            if (class114.field1700 == null) {
                class114.field1700 = new boolean[class42.field520 + class42.field520 + 1][class681.field9665 + class42.field520 + 1];
            }
            for (int var32 = 0; var32 < class114.field1700.length; var32++) {
                for (int var42 = 0; var42 < class114.field1700[0].length; var42++) {
                    class114.field1700[var32][var42] = true;
                }
            }
            client.field1581 = class114.field1700;
            class737.field10233 = class114.field1700;
            class483.field6677 = 0;
            class62.field946 = 0;
            class163.field2503 = class42.field520;
            class350.field4965 = class681.field9665;
            class317.field4537 = false;
        }
        class599.method3489(-1, class29.field307);
        if (!class316.field4495.field10095) {
            class271 var33 = class316.field4495.field10091;
            for (class162 var34 = (class162) var33.method1730((byte) 45); var34 != null; var34 = (class162) var33.method1729((byte) 100)) {
                var34.method781(5555);
                class432.method2588(var34, -126);
            }
        }
        if (class398.field5491) {
            for (int var35 = 0; var35 < class774.field10661; var35++) {
                class208.field3032[var35].method1806(arg0, -1955233437, arg14);
            }
        }
        if (class494.field6789) {
            class629.field8923 = class29.field307.method459();
            class29.field307.method422(class229.field3362);
            int var36 = (class229.field3362[2] - class229.field3362[0]) / class402.field5541;
            for (int var37 = 0; var37 < class402.field5541 - 1; var37++) {
                class456.field6222[var37] = (var37 + 1) * var36 + class134.field2239[var37];
            }
            for (int var38 = 0; var38 < class495.field6792.length; var38++) {
                class495.field6792[var38].method4000();
            }
        }
        if (class410.field5618 != null) {
            if (class494.field6789) {
                class243.method1616(0);
            }
            class368.method2202(true);
            class29.field307.method476(-1, 1583160, 40, 127);
            class100.method837(true, arg4, arg10, arg11, arg16, arg17, arg18);
            if (class494.field6789) {
                class436.method2602();
            }
            class29.field307.method515();
            class368.method2202(false);
        }
        class100.method837(false, arg4, arg10, arg11, arg16, arg17, arg18);
        if (class494.field6789) {
            for (int var39 = 0; var39 < class169.field2565; var39++) {
                class568.field7902[var39] = class542.field7502[var39];
            }
            class243.method1616(0);
            for (int var40 = 0; var40 < class495.field6792.length; var40++) {
                class495.field6792[var40].method4000();
            }
        }
        if (class494.field6789) {
            class436.method2602();
            for (int var41 = 0; var41 < class169.field2565; var41++) {
                class542.field7502[var41] = class568.field7902[var41];
            }
            if (class44.field585 == 2) {
                int var10002;
                if (class346.field4931[0] < class346.field4931[1]) {
                    if (class456.field6222[0] + class134.field2239[0] > class229.field3362[0]) {
                        var10002 = class134.field2239[0]++;
                    }
                } else if (class346.field4931[0] > class346.field4931[1] && class456.field6222[0] + class134.field2239[0] < class229.field3362[2]) {
                    var10002 = class134.field2239[0]--;
                }
            }
        }
        if (!class721.field10072) {
            class737.field10233 = var19;
            client.field1581 = var20;
        }
        class4.method26();
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BII)V", line = 336)
    public static final void method2353(byte arg0, int arg1, int arg2) {
        if (arg0 <= -100) {
            field5455++;
            class371 var3 = class490.method2867((byte) -60, 12, (long) arg2);
            var3.method2212(-90);
            var3.field5233 = arg1;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIZLha;ILae;IIILje;)Lka;", line = 350)
    public final class233 method2354(int arg0, int arg1, boolean arg2, class475 arg3, int arg4, class285 arg5, int arg6, int arg7, int arg8, class98 arg9) {
        field5457++;
        class233 var11 = null;
        int var12 = arg7;
        class31 var13 = null;
        if (~arg1 != arg0) {
            var13 = class150.field2404.method1774(arg1, (byte) 77);
        }
        int[] var14 = this.field5458;
        if (var13 != null && var13.field363 != null) {
            var14 = new int[var13.field363.length];
            for (int var15 = 0; var15 < var13.field363.length; var15++) {
                int var16 = var13.field363[var15];
                if (var16 >= 0 && var16 < this.field5458.length) {
                    var14[var15] = this.field5458[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class495 var24 = null;
        class495 var25 = null;
        if (arg9 != null) {
            int var26 = arg9.field1402[arg4];
            var12 = arg7 | 0x20;
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class168.field2552.method3284(var27, (byte) -124);
            if (var24 != null) {
                var18 |= var24.method2899(var21, arg0 ^ 0x77);
                var17 |= var24.method2900((byte) -111, var21);
                var20 |= var24.method2898(var21, 30);
                var19 |= arg9.field1406;
            }
            if ((arg9.field1418 || class568.field7904) && arg8 != -1 && arg9.field1402.length > arg8) {
                int var28 = arg9.field1402[arg8];
                var23 = arg9.field1388[arg4];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class168.field2552.method3284(var22 >>> 16, (byte) -107);
                }
                if (var25 != null) {
                    var18 |= var25.method2899(var22, 119);
                    var17 |= var25.method2900((byte) -111, var22);
                    var20 |= var25.method2898(var22, arg0 - 102);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
            if (var20) {
                var12 |= 0x400;
            }
        }
        long var30 = this.method2351(-123, var14, arg2, arg1, arg5 == null ? null : arg5.field4193);
        if (class521.field7311 != null) {
            var11 = (class233) class521.field7311.method2882(var30, (byte) -74);
        }
        if (var11 == null || arg3.method497(var11.method591(), var12) != 0) {
            if (var11 != null) {
                var12 = arg3.method426(var12, var11.method591());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class422.field5873.method2937((byte) -24, var14[var34]).method312((byte) 113, null, arg2)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class678[] var35 = new class678[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class422.field5873.method2937((byte) -55, var14[var36]).method320(0, arg2, null);
                }
            }
            if (var13 != null && var13.field384 != null) {
                for (int var37 = 0; var37 < var13.field384.length; var37++) {
                    if (var13.field384[var37] != null && var35[var37] != null) {
                        int var38 = var13.field384[var37][0];
                        int var39 = var13.field384[var37][1];
                        int var40 = var13.field384[var37][2];
                        int var41 = var13.field384[var37][3];
                        int var42 = var13.field384[var37][4];
                        int var43 = var13.field384[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method3813(var42, arg0 + 51, var43, var41);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method3804(var39, 0, var38, var40);
                        }
                    }
                }
            }
            if (arg5 != null) {
                var32 = var12 | 0x4000;
            }
            class678 var44 = new class678(var35, var35.length);
            var11 = arg3.method514(var44, var32, class481.field6610, 64, 850);
            if (arg5 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    for (int var46 = 0; var46 < class78.field1169.length; var46++) {
                        if (class78.field1169[var46][var45].length > arg5.field4193[var45]) {
                            var11.method563(class611.field8683[var46][var45], class78.field1169[var46][var45][arg5.field4193[var45]]);
                        }
                    }
                }
            }
            if (class521.field7311 != null) {
                var11.method523(var12);
                class521.field7311.method2890(-7307, var30, var11);
            }
        }
        if (arg9 == null || var24 == null) {
            return var11;
        } else {
            class233 var47 = var11.method585((byte) 1, var12, true);
            var47.method1581(0, var24, arg6 - 1, arg9.field1406, var21, 0, var25, var22, var23);
            return var47;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V", line = 593)
    public static void method2355(byte arg0) {
        field5461 = null;
        int var1 = 126 % ((-arg0 - 72) / 36);
    }
}
