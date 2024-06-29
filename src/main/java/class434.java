import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ija")
public class class434 {

    @OriginalMember(owner = "client!ija", name = "b", descriptor = "[S")
    public short[] field6288;

    @OriginalMember(owner = "client!ija", name = "c", descriptor = "[S")
    public short[] field6283;

    @OriginalMember(owner = "client!ija", name = "f", descriptor = "[I")
    public int[] field6289;

    @OriginalMember(owner = "client!ija", name = "d", descriptor = "J")
    public long field6285;

    @OriginalMember(owner = "client!ija", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6291 = new String[] { method3382(method3381("\u0004\t{*6E")), method3382(method3381("\u0016M4*\u000f")), method3382(method3381("\u0004\t{*0E")), method3382(method3381("\u0003\u0016vh")), method3382(method3381("/\u0016sh\u0016WC,1J")), method3382(method3381("\u0004\t{*3E")), method3382(method3381("@N$$")), method3382(method3381("\u0004\t{*1E")), method3382(method3381("\u0004\t{*N\u0004\rspLE")) };

    @OriginalMember(owner = "client!ija", name = "h", descriptor = "Lcb;")
    public static class700 field6287 = new class700();

    @OriginalMember(owner = "client!ija", name = "g", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!ija", name = "e", descriptor = "J")
    public static long field6286;

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(II)I")
    public static int method3377(int arg0, int arg1) {
        try {
            return arg0 & arg1;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6291[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "([[[Lnaa;ZIIII)Z")
    public static final boolean method3378(class621[][][] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            field6290++;
            byte var6 = arg1 ? 1 : (byte) (class671.field9454 & 0xFF);
            if (class247.field3547[class693.field9689][arg3][arg4] == var6) {
                return false;
            } else if ((class76.field1089[class693.field9689][arg3][arg4] & 0x4) == 0) {
                return false;
            } else {
                if (arg5 < 83) {
                    method3379(null, 71);
                }
                byte var7 = 0;
                int var8 = 0;
                class492.field7236[var7] = arg3;
                int var37 = var7 + 1;
                class298.field4161[var7] = arg4;
                class247.field3547[class693.field9689][arg3][arg4] = var6;
                while (var37 != var8) {
                    int var9 = class492.field7236[var8] & 0xFFFF;
                    int var10 = class492.field7236[var8] >> 16 & 0xFF;
                    int var11 = class492.field7236[var8] >> 24 & 0xFF;
                    int var12 = class298.field4161[var8] & 0xFFFF;
                    int var13 = class298.field4161[var8] >> 16 & 0xFF;
                    var8 = var8 + 1 & 0xFFF;
                    boolean var14 = false;
                    if ((class76.field1089[class693.field9689][var9][var12] & 0x4) == 0) {
                        var14 = true;
                    }
                    boolean var15 = false;
                    if (arg0 != null) {
                        label296: for (int var16 = class693.field9689 + 1; var16 <= 3; var16++) {
                            if (arg0[var16] != null && (class76.field1089[var16][var9][var12] & 0x8) == 0) {
                                if (var14 && arg0[var16][var9][var12] != null) {
                                    if (arg0[var16][var9][var12].field8842 != null) {
                                        int var17 = class531.method4020(var10, (byte) -73);
                                        if (arg0[var16][var9][var12].field8842.field8278 == var17 || arg0[var16][var9][var12].field8845 != null && arg0[var16][var9][var12].field8845.field8278 == var17) {
                                            continue;
                                        }
                                        if (var11 != 0) {
                                            int var18 = class531.method4020(var11, (byte) -109);
                                            if (arg0[var16][var9][var12].field8842.field8278 == var18 || arg0[var16][var9][var12].field8845 != null && arg0[var16][var9][var12].field8845.field8278 == var18) {
                                                continue;
                                            }
                                        }
                                        if (var13 != 0) {
                                            int var19 = class531.method4020(var13, (byte) -77);
                                            if (arg0[var16][var9][var12].field8842.field8278 == var19 || arg0[var16][var9][var12].field8845 != null && arg0[var16][var9][var12].field8845.field8278 == var19) {
                                                continue;
                                            }
                                        }
                                    }
                                    class621 var20 = arg0[var16][var9][var12];
                                    if (var20.field8841 != null) {
                                        for (class219 var21 = var20.field8841; var21 != null; var21 = var21.field3190) {
                                            class604 var22 = var21.field3188;
                                            if (var22 instanceof class675) {
                                                class675 var23 = (class675) var22;
                                                int var24 = var23.method572(89);
                                                if (var24 == 21) {
                                                    var24 = 19;
                                                }
                                                int var25 = var23.method585(-20175);
                                                int var26 = var24 | var25 << 6;
                                                if (var10 == var26 || var11 != 0 && var11 == var26 || var13 != 0 && var13 == var26) {
                                                    continue label296;
                                                }
                                            }
                                        }
                                    }
                                }
                                class621 var27 = arg0[var16][var9][var12];
                                if (var27 != null && var27.field8841 != null) {
                                    for (class219 var28 = var27.field8841; var28 != null; var28 = var28.field3190) {
                                        class604 var29 = var28.field3188;
                                        if (var29.field8666 != var29.field8663 || var29.field8669 != var29.field8661) {
                                            for (int var30 = var29.field8663; var30 <= var29.field8666; var30++) {
                                                for (int var31 = var29.field8669; var31 <= var29.field8661; var31++) {
                                                    class247.field3547[var16][var30][var31] = var6;
                                                }
                                            }
                                        }
                                    }
                                }
                                class247.field3547[var16][var9][var12] = var6;
                                var15 = true;
                            }
                        }
                    }
                    if (var15) {
                        int var32 = class107.field1413[class693.field9689 + 1].method5442(var9, var12, 31844);
                        if (class774.field11044[arg2] < var32) {
                            class774.field11044[arg2] = var32;
                        }
                        int var33 = var9 << 9;
                        if (var33 < class631.field8965[arg2]) {
                            class631.field8965[arg2] = var33;
                        } else if (var33 > class742.field10546[arg2]) {
                            class742.field10546[arg2] = var33;
                        }
                        int var34 = var12 << 9;
                        if (var34 < class99.field1344[arg2]) {
                            class99.field1344[arg2] = var34;
                        } else if (var34 > class250.field3575[arg2]) {
                            class250.field3575[arg2] = var34;
                        }
                    }
                    if (!var14) {
                        if (var9 >= 1 && class247.field3547[class693.field9689][var9 - 1][var12] != var6) {
                            class492.field7236[var37] = class10.method71(-754974720, class10.method71(1179648, var9 - 1));
                            class298.field4161[var37] = class10.method71(var12, 1245184);
                            class247.field3547[class693.field9689][var9 - 1][var12] = var6;
                            var37 = var37 + 1 & 0xFFF;
                        }
                        int var10000 = ~class14.field187;
                        var12++;
                        if (var10000 < ~var12) {
                            if ((var9 - 1) >= 0 && class247.field3547[class693.field9689][var9 - 1][var12] != var6 && (class76.field1089[class693.field9689][var9][var12] & 0x4) == 0 && (class76.field1089[class693.field9689][var9 - 1][var12 - 1] & 0x4) == 0) {
                                class492.field7236[var37] = class10.method71(class10.method71(var9 - 1, 1179648), 1375731712);
                                class298.field4161[var37] = class10.method71(1245184, var12);
                                class247.field3547[class693.field9689][var9 - 1][var12] = var6;
                                var37 = var37 + 1 & 0xFFF;
                            }
                            if (class247.field3547[class693.field9689][var9][var12] != var6) {
                                class492.field7236[var37] = class10.method71(class10.method71(var9, 5373952), 318767104);
                                class298.field4161[var37] = class10.method71(var12, 5439488);
                                var37 = var37 + 1 & 0xFFF;
                                class247.field3547[class693.field9689][var9][var12] = var6;
                            }
                            if (class625.field8929 > (var9 + 1) && class247.field3547[class693.field9689][var9 + 1][var12] != var6 && (class76.field1089[class693.field9689][var9][var12] & 0x4) == 0 && (class76.field1089[class693.field9689][var9 + 1][var12 - 1] & 0x4) == 0) {
                                class492.field7236[var37] = class10.method71(class10.method71(var9 + 1, 5373952), -1845493760);
                                class298.field4161[var37] = class10.method71(var12, 5439488);
                                var37 = var37 + 1 & 0xFFF;
                                class247.field3547[class693.field9689][var9 + 1][var12] = var6;
                            }
                        }
                        var12--;
                        if (class625.field8929 > var9 + 1 && class247.field3547[class693.field9689][var9 + 1][var12] != var6) {
                            class492.field7236[var37] = class10.method71(class10.method71(9568256, var9 + 1), 1392508928);
                            class298.field4161[var37] = class10.method71(var12, 9633792);
                            var37 = var37 + 1 & 0xFFF;
                            class247.field3547[class693.field9689][var9 + 1][var12] = var6;
                        }
                        var12--;
                        if (var12 >= 0) {
                            if ((var9 - 1) >= 0 && class247.field3547[class693.field9689][var9 - 1][var12] != var6 && (class76.field1089[class693.field9689][var9][var12] & 0x4) == 0 && (class76.field1089[class693.field9689][var9 - 1][var12 + 1] & 0x4) == 0) {
                                class492.field7236[var37] = class10.method71(301989888, class10.method71(var9 - 1, 13762560));
                                class298.field4161[var37] = class10.method71(13828096, var12);
                                var37 = var37 + 1 & 0xFFF;
                                class247.field3547[class693.field9689][var9 - 1][var12] = var6;
                            }
                            if (class247.field3547[class693.field9689][var9][var12] != var6) {
                                class492.field7236[var37] = class10.method71(class10.method71(var9, 13762560), -1828716544);
                                class298.field4161[var37] = class10.method71(13828096, var12);
                                var37 = var37 + 1 & 0xFFF;
                                class247.field3547[class693.field9689][var9][var12] = var6;
                            }
                            if (class625.field8929 > var9 + 1 && class247.field3547[class693.field9689][var9 + 1][var12] != var6 && (class76.field1089[class693.field9689][var9][var12] & 0x4) == 0 && (class76.field1089[class693.field9689][var9 + 1][var12 + 1] & 0x4) == 0) {
                                class492.field7236[var37] = class10.method71(-771751936, class10.method71(9568256, var9 + 1));
                                class298.field4161[var37] = class10.method71(var12, 9633792);
                                var37 = var37 + 1 & 0xFFF;
                                class247.field3547[class693.field9689][var9 + 1][var12] = var6;
                            }
                        }
                    }
                }
                if (class774.field11044[arg2] != -1000000) {
                    class774.field11044[arg2] += 40;
                    class631.field8965[arg2] -= 512;
                    class742.field10546[arg2] += 512;
                    class250.field3575[arg2] += 512;
                    class99.field1344[arg2] -= 512;
                }
                return true;
            }
        } catch (RuntimeException var36) {
            throw class665.method4799(var36, field6291[2] + (arg0 == null ? field6291[3] : field6291[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(Lha;I)V")
    public static final void method3379(class18 arg0, int arg1) {
        try {
            field6284++;
            int var2 = 0;
            int var3 = 0;
            if (class212.field3119) {
                var2 = class784.method5647((byte) 105);
                var3 = class30.method328(-17233);
            }
            arg0.method208(var2, var3, class391.field5700 + var2, var3 + 350);
            arg0.method237(var2, var3, class391.field5700, 350, class55.field760 << 24 | 0x332277, 1);
            if (arg1 != 21) {
                field6286 = 63L;
            }
            class232.method1925(var3, var2, var3 + 350, var2 - -class391.field5700, (byte) 102);
            int var4 = 350 / class324.field4417;
            if (class648.field9211 > 0) {
                int var5 = 346 - class324.field4417 - 4;
                int var6 = var4 * var5 / (class648.field9211 + var4 - 1);
                int var7 = 4;
                if (class648.field9211 > 1) {
                    var7 += (class648.field9211 - class462.field6742 - 1) * (var5 - var6) / (class648.field9211 - 1);
                }
                arg0.method237(class391.field5700 + var2 - 16, var3 + var7, 12, var6, class55.field760 << 24 | 0x332277, 2);
                for (int var8 = class462.field6742; var8 < class462.field6742 + var4 && var8 < class648.field9211; var8++) {
                    String[] var9 = class793.method5716('\b', class789.field11405[var8], -62);
                    int var10 = (class391.field5700 - 16 - 8) / var9.length;
                    for (int var11 = 0; var11 < var9.length; var11++) {
                        int var12 = (var10 * var11) + 8;
                        arg0.method208(var2 + var12, var3, var10 + var12 + var2 - 8, var3 + 350);
                        class23.field279.method1828(var3 + 350 - (class775.field11056 + class84.field1185.field2062) - (var8 - class462.field6742) * class324.field4417 - 2, class61.method661(var9[var11], 123), true, -16777216, var2 + var12, -1);
                    }
                }
            }
            class626.field8945.method1819(73, field6291[4], class391.field5700 + var2 - 25, -1, var3 + 350 - 20, -16777216);
            arg0.method208(var2, var3, class391.field5700 + var2, var3 - -350);
            arg0.method161(var3 + 350 - class775.field11056, class391.field5700, var2, true, -1);
            class200.field2954.method1828(var3 + 350 - class520.field7584.field2062 - 1, field6291[6] + class61.method661(class273.field3877, arg1 + -149), true, -16777216, var2 + 10, -1);
            if (class257.field3676) {
                int var13 = -1;
                if ((class694.field9700 % 30) > 15) {
                    var13 = 16777215;
                }
                arg0.method200(var3 + 350 - class520.field7584.field2062 - 11, 12, class520.field7584.method1368(field6291[6] + class61.method661(class273.field3877, arg1 ^ 0xFFFFFFCC).substring(0, class26.field326), -76) + var2 + 10, arg1 + -20, var13);
            }
        } catch (RuntimeException var15) {
            throw class665.method4799(var15, field6291[5] + (arg0 == null ? field6291[3] : field6291[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(I)V")
    public static void method3380(int arg0) {
        try {
            if (arg0 != 10) {
                method3378(null, false, -111, -123, 79, 102);
            }
            field6287 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6291[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ija", name = "<init>", descriptor = "(J[I[S[S)V")
    public class434(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        try {
            this.field6288 = arg3;
            this.field6283 = arg2;
            this.field6289 = arg1;
            this.field6285 = arg0;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field6291[8] + arg0 + ',' + (arg1 == null ? field6291[3] : field6291[1]) + ',' + (arg2 == null ? field6291[3] : field6291[1]) + ',' + (arg3 == null ? field6291[3] : field6291[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ija", name = "<init>", descriptor = "()V")
    protected class434() {
    }

    @OriginalMember(owner = "client!ija", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3381(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x72);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ija", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3382(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 109;
                    break;
                case 1:
                    var10005 = 99;
                    break;
                case 2:
                    var10005 = 26;
                    break;
                case 3:
                    var10005 = 4;
                    break;
                default:
                    var10005 = 114;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
