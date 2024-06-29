import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class251 {

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "[I")
    public static int[] field4127 = new int[14];

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB[Lg;)V", line = 4)
    public static final void method1767(int arg0, byte arg1, class181[] arg2) {
        field4129++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class181 var4 = arg2[var3];
            if (var4 != null && var4.field2970 == arg0 && (!var4.field3058 || !client.method1987(var4))) {
                if (var4.field3098 == 0) {
                    if (!var4.field3058 && client.method1987(var4) && class292.field4731 != var4) {
                        continue;
                    }
                    method1767(var4.field3103, (byte) 111, arg2);
                    if (var4.field3095 != null) {
                        method1767(var4.field3103, (byte) -81, var4.field3095);
                    }
                    class355 var5 = (class355) class34.field758.method2344(-1, (long) var4.field3103);
                    if (var5 != null) {
                        class344.method2418(var5.field5657, (byte) -109);
                    }
                }
                if (var4.field3098 == 6) {
                    if (var4.field3092 != -1 || var4.field3052 != -1) {
                        boolean var6 = class13.method133(false, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field3052;
                        } else {
                            var7 = var4.field3092;
                        }
                        if (var7 != -1) {
                            class300 var8 = class258.method1807(var7, 103);
                            if (var8 != null) {
                                var4.field3102 += class197.field3303;
                                while (var4.field3102 > var8.field4877[var4.field3100]) {
                                    var4.field3102 -= var8.field4877[var4.field3100];
                                    var4.field3100++;
                                    if (var4.field3100 >= var8.field4885.length) {
                                        var4.field3100 -= var8.field4871;
                                        if (var4.field3100 < 0 || var8.field4885.length <= var4.field3100) {
                                            var4.field3100 = 0;
                                        }
                                    }
                                    var4.field3010 = var4.field3100 + 1;
                                    if (var8.field4885.length <= var4.field3010) {
                                        var4.field3010 -= var8.field4871;
                                        if (var4.field3010 < 0 || var8.field4885.length <= var4.field3010) {
                                            var4.field3010 = -1;
                                        }
                                    }
                                    class52.method459(128, var4);
                                }
                            }
                        }
                    }
                    if (var4.field3031 != 0 && !var4.field3058) {
                        int var9 = var4.field3031 >> 16;
                        int var10 = var4.field3031 << 16 >> 16;
                        int var11 = class197.field3303 * var9;
                        var4.field3000 = var4.field3000 + var11 & 0x7FF;
                        int var12 = class197.field3303 * var10;
                        var4.field3130 = var4.field3130 + var12 & 0x7FF;
                        class52.method459(128, var4);
                    }
                }
            }
        }
        int var13 = 49 % ((2 - arg1) / 52);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BB)C", line = 128)
    public static final char method1768(byte arg0, byte arg1) {
        if (arg0 <= 62) {
            return 'q';
        }
        int var2 = arg1 & 0xFF;
        field4124++;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class57.field1144[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIIIIILml;IZJ)Z", line = 160)
    public static final boolean method1769(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class152 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class55.field1085 == class144.field2427;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class224.field3701 || var16 >= class280.field4578) {
                    return false;
                }
                class312 var17 = class353.field5644[arg0][var15][var16];
                if (var17 != null && var17.field5078 >= 5) {
                    return false;
                }
            }
        }
        class278 var18 = new class278();
        var18.field4527 = arg11;
        var18.field4532 = arg0;
        var18.field4536 = arg5;
        var18.field4522 = arg6;
        var18.field4521 = arg7;
        var18.field4529 = arg8;
        var18.field4531 = arg9;
        var18.field4523 = arg1;
        var18.field4530 = arg2;
        var18.field4525 = arg1 + arg3 - 1;
        var18.field4544 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class353.field5644[var22][var19][var20] == null) {
                        class353.field5644[var22][var19][var20] = new class312(var22, var19, var20);
                    }
                }
                class312 var23 = class353.field5644[arg0][var19][var20];
                var23.field5089[var23.field5078] = var18;
                var23.field5101[var23.field5078] = var21;
                var23.field5097 |= var21;
                var23.field5078++;
                if (var13 && class318.field5180[var19][var20] != 0) {
                    var14 = class318.field5180[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class318.field5180[var24][var25] == 0) {
                        class318.field5180[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class172.field2842[class201.field3383++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)Lpg;", line = 280)
    public static final class226 method1770(int arg0) {
        field4125++;
        if (arg0 > -2) {
            method1770(-41);
        }
        return class38.field829;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V", line = 292)
    public static void method1771(byte arg0) {
        if (arg0 == 24) {
            field4127 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(III[Ljava/lang/String;)Ljava/lang/String;", line = 302)
    public static final String method1772(int arg0, int arg1, int arg2, String[] arg3) {
        field4128++;
        if (arg0 == 0) {
            return "";
        } else if (arg0 == 1) {
            String var4 = arg3[arg1];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg1;
            int var6 = 0;
            for (int var7 = arg1; var7 < var5; var7++) {
                String var8 = arg3[var7];
                if (var8 == null) {
                    var6 += 4;
                } else {
                    var6 += var8.length();
                }
            }
            if (arg2 != 4) {
                method1772(32, -1, 100, (String[]) null);
            }
            StringBuffer var9 = new StringBuffer(var6);
            for (int var10 = arg1; var10 < var5; var10++) {
                String var11 = arg3[var10];
                if (var11 == null) {
                    var9.append("null");
                } else {
                    var9.append(var11);
                }
            }
            return var9.toString();
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIIIIII)V", line = 364)
    public static final void method1773(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4126++;
        if (arg4 != -28629) {
            field4127 = (int[]) null;
        }
        if (class267.method1874(arg0, (byte) 12)) {
            class258.method1809(arg2, arg8, arg5, arg6, class178.field2938[arg0], -1, arg1, arg3, arg7, arg4 ^ 0x6FD4);
        } else if (arg3 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class213.field3524[var9] = true;
            }
        } else {
            class213.field3524[arg3] = true;
        }
    }
}
