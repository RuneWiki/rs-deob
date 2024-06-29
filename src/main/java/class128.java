import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class128 extends class160 {

    @OriginalMember(owner = "client!q", name = "V", descriptor = "I")
    private int field2014 = 4096;

    @OriginalMember(owner = "client!q", name = "X", descriptor = "Z")
    private boolean field2016 = true;

    @OriginalMember(owner = "client!q", name = "Z", descriptor = "I")
    public static int field2018 = 0;

    @OriginalMember(owner = "client!q", name = "S", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!q", name = "T", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!q", name = "U", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!q", name = "W", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!q", name = "ab", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!q", name = "bb", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BJ)V")
    public static final void method886(byte arg0, long arg1) {
        ++field2015;
        if (~arg1 != -1L) {
            if (arg0 != 35) {
                field2019 = 91;
            }
            for (int var3 = 0; var3 < class268.field4284; ++var3) {
                if (class106.field1766[var3] == arg1) {
                    --class268.field4284;
                    for (int var4 = var3; ~var4 > ~class268.field4284; ++var4) {
                        class106.field1766[var4] = class106.field1766[var4 - -1];
                        class212.field3288[var4] = class212.field3288[var4 - -1];
                        class138.field2117[var4] = class138.field2117[var4 + 1];
                    }
                    class15.field235 = class275.field4392;
                    client.field2435.method536((byte) -104, 86);
                    client.field2435.method638(arg1, false);
                    ++class33.field498;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BIJZI)Ljava/lang/String;")
    public static final String method887(byte arg0, int arg1, long arg2, boolean arg3, int arg4) {
        ++field2012;
        int var6 = -56 / ((arg0 - 61) / 48);
        char var7 = ',';
        char var8 = '.';
        boolean var9 = false;
        if (arg1 == 0) {
            var7 = '.';
            var8 = ',';
        }
        StringBuffer var10 = new StringBuffer(26);
        if (arg2 < 0L) {
            arg2 = -arg2;
            var9 = true;
        }
        if (arg1 == 2) {
            var8 = 160;
        }
        if (arg4 > 0) {
            for (int var11 = 0; var11 < arg4; ++var11) {
                int var12 = (int) arg2;
                arg2 /= 10L;
                var10.append((char) (var12 + 48 + -((int) arg2 * 10)));
            }
            var10.append(var7);
        }
        int var13 = 0;
        while (true) {
            int var14 = (int) arg2;
            arg2 /= 10L;
            var10.append((char) (48 - -var14 - (int) arg2 * 10));
            if (~arg2 == -1L) {
                if (var9) {
                    var10.append('-');
                }
                return var10.reverse().toString();
            }
            if (arg3) {
                ++var13;
                if (var13 % 3 == 0) {
                    var10.append(var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIILji;JLji;Lji;)V")
    public static final void method888(int arg0, int arg1, int arg2, int arg3, class43 arg4, long arg5, class43 arg6, class43 arg7) {
        class267 var9 = new class267();
        var9.field4255 = arg4;
        var9.field4268 = arg1 * 128 + 64;
        var9.field4271 = arg2 * 128 + 64;
        var9.field4262 = arg3;
        var9.field4263 = arg5;
        var9.field4256 = arg6;
        var9.field4260 = arg7;
        int var10 = 0;
        class6 var11 = class269.field4298[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field125; ++var12) {
                class293 var13 = var11.field134[var12];
                if ((var13.field4618 & 4194304L) == 4194304L) {
                    int var14 = var13.field4619.method102();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field4257 = -var10;
        if (class269.field4298[arg0][arg1][arg2] == null) {
            class269.field4298[arg0][arg1][arg2] = new class6(arg0, arg1, arg2);
        }
        class269.field4298[arg0][arg1][arg2].field124 = var9;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method889(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (~class223.field3423 >= ~arg7 && ~arg3 >= ~class148.field2338 && class90.field1568 <= arg6 && class266.field4247 >= arg1) {
            class212.method1437(arg2, arg1, arg5, arg6, arg7, arg3, true, arg0);
        } else {
            class126.method877(arg2, arg3, -114, arg7, arg1, arg5, arg0, arg6);
        }
        ++field2020;
        int var8 = -15 % ((arg4 - 67) / 34);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lwj;Z)V")
    public static final void method890(class6 arg0, boolean arg1) {
        class144.field2293.method1219(false, arg0);
        while (true) {
            class6 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class6[][] var7;
            class6 var66;
            do {
                class6 var65;
                do {
                    class6 var64;
                    do {
                        class6 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class6) class144.field2293.method1231(15);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field141);
                                            var3 = var2.field146;
                                            var4 = var2.field131;
                                            var5 = var2.field133;
                                            var6 = var2.field138;
                                            var7 = class269.field4298[var5];
                                            if (!var2.field142) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class6 var8 = class269.field4298[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field141) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class99.field1669 && var3 > class151.field2372) {
                                                    class6 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field141 && (var9.field142 || (var2.field139 & 1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class99.field1669 && var3 < class55.field918 - 1) {
                                                    class6 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field141 && (var10.field142 || (var2.field139 & 4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class99.field1664 && var4 > class163.field2560) {
                                                    class6 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field141 && (var11.field142 || (var2.field139 & 8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class99.field1664 && var4 < class52.field781 - 1) {
                                                    class6 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field141 && (var12.field142 || (var2.field139 & 2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field142 = false;
                                            if (var2.field145 != null) {
                                                class6 var13 = var2.field145;
                                                if (var13.field129 != null) {
                                                    if (!class268.method1805(0, var3, var4)) {
                                                        class50.method378(var13.field129, 0, class221.field3404, class109.field1789, class256.field4103, class187.field2907, var3, var4, false);
                                                    } else {
                                                        class50.method378(var13.field129, 0, class221.field3404, class109.field1789, class256.field4103, class187.field2907, var3, var4, true);
                                                    }
                                                } else if (var13.field148 != null) {
                                                    if (!class268.method1805(0, var3, var4)) {
                                                        class150.method1009(var13.field148, class221.field3404, class109.field1789, class256.field4103, class187.field2907, var3, var4, false);
                                                    } else {
                                                        class150.method1009(var13.field148, class221.field3404, class109.field1789, class256.field4103, class187.field2907, var3, var4, true);
                                                    }
                                                }
                                                class7 var14 = var13.field147;
                                                if (var14 != null) {
                                                    var14.field149.method100(0, class221.field3404, class109.field1789, class256.field4103, class187.field2907, var14.field150 - class6.field127, var14.field153 - class140.field2145, var14.field158 - class193.field3029, var14.field159, var5, (class67) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field125; ++var15) {
                                                    class293 var16 = var13.field134[var15];
                                                    if (var16 != null) {
                                                        var16.field4619.method100(var16.field4611, class221.field3404, class109.field1789, class256.field4103, class187.field2907, var16.field4609 - class6.field127, var16.field4629 - class140.field2145, var16.field4627 - class193.field3029, var16.field4618, var5, (class67) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field129 != null) {
                                                if (!class268.method1805(var6, var3, var4)) {
                                                    var17 = true;
                                                    if (var2.field129.field318 != 12345678 || class16.field248 && var5 <= class71.field1138) {
                                                        class50.method378(var2.field129, var6, class221.field3404, class109.field1789, class256.field4103, class187.field2907, var3, var4, false);
                                                    }
                                                } else {
                                                    class50.method378(var2.field129, var6, class221.field3404, class109.field1789, class256.field4103, class187.field2907, var3, var4, true);
                                                }
                                            } else if (var2.field148 != null) {
                                                if (!class268.method1805(var6, var3, var4)) {
                                                    var17 = true;
                                                    class150.method1009(var2.field148, class221.field3404, class109.field1789, class256.field4103, class187.field2907, var3, var4, false);
                                                } else {
                                                    class150.method1009(var2.field148, class221.field3404, class109.field1789, class256.field4103, class187.field2907, var3, var4, true);
                                                }
                                            }
                                            if (var17) {
                                                class140 var18 = var2.field144;
                                                if (var18 != null && (var18.field2146 & 2147483648L) != 0L) {
                                                    var18.field2137.method100(0, class221.field3404, class109.field1789, class256.field4103, class187.field2907, var18.field2143 - class6.field127, var18.field2136 - class140.field2145, var18.field2138 - class193.field3029, var18.field2146, var5, (class67) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class7 var21 = var2.field147;
                                            class206 var22 = var2.field123;
                                            if (var21 != null || var22 != null) {
                                                if (class99.field1669 == var3) {
                                                    ++var19;
                                                } else if (class99.field1669 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class99.field1664 == var4) {
                                                    var19 += 3;
                                                } else if (class99.field1664 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class141.field2151[var19];
                                                var2.field121 = class95.field1615[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field157 & class65.field1098[var19]) != 0) {
                                                    if (var21.field157 == 16) {
                                                        var2.field140 = 3;
                                                        var2.field126 = class294.field4631[var19];
                                                        var2.field120 = 3 - var2.field126;
                                                    } else if (var21.field157 == 32) {
                                                        var2.field140 = 6;
                                                        var2.field126 = class143.field2194[var19];
                                                        var2.field120 = 6 - var2.field126;
                                                    } else if (var21.field157 == 64) {
                                                        var2.field140 = 12;
                                                        var2.field126 = class72.field1221[var19];
                                                        var2.field120 = 12 - var2.field126;
                                                    } else {
                                                        var2.field140 = 9;
                                                        var2.field126 = class161.field2525[var19];
                                                        var2.field120 = 9 - var2.field126;
                                                    }
                                                } else {
                                                    var2.field140 = 0;
                                                }
                                                if ((var21.field157 & var20) != 0 && !class13.method112(var6, var3, var4, var21.field157)) {
                                                    var21.field149.method100(0, class221.field3404, class109.field1789, class256.field4103, class187.field2907, var21.field150 - class6.field127, var21.field153 - class140.field2145, var21.field158 - class193.field3029, var21.field159, var5, (class67) null);
                                                }
                                                if ((var21.field162 & var20) != 0 && !class13.method112(var6, var3, var4, var21.field162)) {
                                                    var21.field156.method100(0, class221.field3404, class109.field1789, class256.field4103, class187.field2907, var21.field150 - class6.field127, var21.field153 - class140.field2145, var21.field158 - class193.field3029, var21.field159, var5, (class67) null);
                                                }
                                            }
                                            if (var22 != null && !class288.method1927(var6, var3, var4, var22.field3224.method102())) {
                                                if ((var22.field3218 & var20) != 0) {
                                                    var22.field3224.method100(0, class221.field3404, class109.field1789, class256.field4103, class187.field2907, var22.field3213 - class6.field127 + var22.field3210, var22.field3223 - class140.field2145, var22.field3211 - class193.field3029 + var22.field3221, var22.field3217, var5, (class67) null);
                                                } else if (var22.field3218 == 256) {
                                                    int var23 = var22.field3213 - class6.field127;
                                                    int var24 = var22.field3223 - class140.field2145;
                                                    int var25 = var22.field3211 - class193.field3029;
                                                    int var26 = var22.field3216;
                                                    int var27;
                                                    if (var26 != 1 && var26 != 2) {
                                                        var27 = var23;
                                                    } else {
                                                        var27 = -var23;
                                                    }
                                                    int var28;
                                                    if (var26 != 2 && var26 != 3) {
                                                        var28 = var25;
                                                    } else {
                                                        var28 = -var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field3224.method100(0, class221.field3404, class109.field1789, class256.field4103, class187.field2907, var22.field3210 + var23, var24, var22.field3221 + var25, var22.field3217, var5, (class67) null);
                                                    } else if (var22.field3222 != null) {
                                                        var22.field3222.method100(0, class221.field3404, class109.field1789, class256.field4103, class187.field2907, var23, var24, var25, var22.field3217, var5, (class67) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class140 var29 = var2.field144;
                                                if (var29 != null && (var29.field2146 & 2147483648L) == 0L) {
                                                    var29.field2137.method100(0, class221.field3404, class109.field1789, class256.field4103, class187.field2907, var29.field2143 - class6.field127, var29.field2136 - class140.field2145, var29.field2138 - class193.field3029, var29.field2146, var5, (class67) null);
                                                }
                                                class267 var30 = var2.field124;
                                                if (var30 != null && var30.field4257 == 0) {
                                                    if (var30.field4256 != null) {
                                                        var30.field4256.method100(0, class221.field3404, class109.field1789, class256.field4103, class187.field2907, var30.field4268 - class6.field127, var30.field4262 - class140.field2145, var30.field4271 - class193.field3029, var30.field4263, var5, (class67) null);
                                                    }
                                                    if (var30.field4260 != null) {
                                                        var30.field4260.method100(0, class221.field3404, class109.field1789, class256.field4103, class187.field2907, var30.field4268 - class6.field127, var30.field4262 - class140.field2145, var30.field4271 - class193.field3029, var30.field4263, var5, (class67) null);
                                                    }
                                                    if (var30.field4255 != null) {
                                                        var30.field4255.method100(0, class221.field3404, class109.field1789, class256.field4103, class187.field2907, var30.field4268 - class6.field127, var30.field4262 - class140.field2145, var30.field4271 - class193.field3029, var30.field4263, var5, (class67) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field139;
                                            if (var31 != 0) {
                                                if (var3 < class99.field1669 && (var31 & 4) != 0) {
                                                    class6 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field141) {
                                                        class144.field2293.method1219(false, var32);
                                                    }
                                                }
                                                if (var4 < class99.field1664 && (var31 & 2) != 0) {
                                                    class6 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field141) {
                                                        class144.field2293.method1219(false, var33);
                                                    }
                                                }
                                                if (var3 > class99.field1669 && (var31 & 1) != 0) {
                                                    class6 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field141) {
                                                        class144.field2293.method1219(false, var34);
                                                    }
                                                }
                                                if (var4 > class99.field1664 && (var31 & 8) != 0) {
                                                    class6 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field141) {
                                                        class144.field2293.method1219(false, var35);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field140 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field125; ++var37) {
                                                if (class297.field4689 != var2.field134[var37].field4614 && (var2.field143[var37] & var2.field140) == var2.field126) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class7 var38 = var2.field147;
                                                if (!class13.method112(var6, var3, var4, var38.field157)) {
                                                    var38.field149.method100(0, class221.field3404, class109.field1789, class256.field4103, class187.field2907, var38.field150 - class6.field127, var38.field153 - class140.field2145, var38.field158 - class193.field3029, var38.field159, var5, (class67) null);
                                                }
                                                var2.field140 = 0;
                                            }
                                        }
                                        if (!var2.field136) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field125;
                                            var2.field136 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; ++var41) {
                                                class293 var42 = var2.field134[var41];
                                                if (class297.field4689 != var42.field4614) {
                                                    for (int var43 = var42.field4616; var43 <= var42.field4623; ++var43) {
                                                        for (int var44 = var42.field4612; var44 <= var42.field4615; ++var44) {
                                                            class6 var45 = var7[var43][var44];
                                                            if (var45.field142) {
                                                                var2.field136 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field140 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field4616) {
                                                                    ++var46;
                                                                }
                                                                if (var43 < var42.field4623) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field4612) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field4615) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field140) == var2.field120) {
                                                                    var2.field136 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class110.field1803[var40++] = var42;
                                                    int var47 = class99.field1669 - var42.field4616;
                                                    int var48 = var42.field4623 - class99.field1669;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class99.field1664 - var42.field4612;
                                                    int var50 = var42.field4615 - class99.field1664;
                                                    if (var50 > var49) {
                                                        var42.field4625 = var47 + var50;
                                                    } else {
                                                        var42.field4625 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; ++var53) {
                                                    class293 var54 = class110.field1803[var53];
                                                    if (class297.field4689 != var54.field4614) {
                                                        if (var54.field4625 > var51) {
                                                            var51 = var54.field4625;
                                                            var52 = var53;
                                                        } else if (var54.field4625 == var51) {
                                                            int var55 = var54.field4609 - class6.field127;
                                                            int var56 = var54.field4627 - class193.field3029;
                                                            int var57 = class110.field1803[var52].field4609 - class6.field127;
                                                            int var58 = class110.field1803[var52].field4627 - class193.field3029;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class293 var59 = class110.field1803[var52];
                                                var59.field4614 = class297.field4689;
                                                if (!class13.method113(var6, var59.field4616, var59.field4623, var59.field4612, var59.field4615, var59.field4619.method102())) {
                                                    var59.field4619.method100(var59.field4611, class221.field3404, class109.field1789, class256.field4103, class187.field2907, var59.field4609 - class6.field127, var59.field4629 - class140.field2145, var59.field4627 - class193.field3029, var59.field4618, var5, (class67) null);
                                                }
                                                for (int var60 = var59.field4616; var60 <= var59.field4623; ++var60) {
                                                    for (int var61 = var59.field4612; var61 <= var59.field4615; ++var61) {
                                                        class6 var62 = var7[var60][var61];
                                                        if (var62.field140 != 0) {
                                                            class144.field2293.method1219(false, var62);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field141) {
                                                            class144.field2293.method1219(false, var62);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field136) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field136 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field141);
                            } while (var2.field140 != 0);
                            if (var3 > class99.field1669 || var3 <= class151.field2372) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field141);
                        if (var3 < class99.field1669 || var3 >= class55.field918 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field141);
                    if (var4 > class99.field1664 || var4 <= class163.field2560) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field141);
                if (var4 < class99.field1664 || var4 >= class52.field781 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field141);
            var2.field141 = false;
            --class110.field1798;
            class267 var67 = var2.field124;
            if (var67 != null && var67.field4257 != 0) {
                if (var67.field4256 != null) {
                    var67.field4256.method100(0, class221.field3404, class109.field1789, class256.field4103, class187.field2907, var67.field4268 - class6.field127, var67.field4262 - class140.field2145 - var67.field4257, var67.field4271 - class193.field3029, var67.field4263, var5, (class67) null);
                }
                if (var67.field4260 != null) {
                    var67.field4260.method100(0, class221.field3404, class109.field1789, class256.field4103, class187.field2907, var67.field4268 - class6.field127, var67.field4262 - class140.field2145 - var67.field4257, var67.field4271 - class193.field3029, var67.field4263, var5, (class67) null);
                }
                if (var67.field4255 != null) {
                    var67.field4255.method100(0, class221.field3404, class109.field1789, class256.field4103, class187.field2907, var67.field4268 - class6.field127, var67.field4262 - class140.field2145 - var67.field4257, var67.field4271 - class193.field3029, var67.field4263, var5, (class67) null);
                }
            }
            if (var2.field121 != 0) {
                class206 var68 = var2.field123;
                if (var68 != null && !class288.method1927(var6, var3, var4, var68.field3224.method102())) {
                    if ((var68.field3218 & var2.field121) != 0) {
                        var68.field3224.method100(0, class221.field3404, class109.field1789, class256.field4103, class187.field2907, var68.field3213 - class6.field127 + var68.field3210, var68.field3223 - class140.field2145, var68.field3211 - class193.field3029 + var68.field3221, var68.field3217, var5, (class67) null);
                    } else if (var68.field3218 == 256) {
                        int var69 = var68.field3213 - class6.field127;
                        int var70 = var68.field3223 - class140.field2145;
                        int var71 = var68.field3211 - class193.field3029;
                        int var72 = var68.field3216;
                        int var73;
                        if (var72 != 1 && var72 != 2) {
                            var73 = var69;
                        } else {
                            var73 = -var69;
                        }
                        int var74;
                        if (var72 != 2 && var72 != 3) {
                            var74 = var71;
                        } else {
                            var74 = -var71;
                        }
                        if (var74 >= var73) {
                            var68.field3224.method100(0, class221.field3404, class109.field1789, class256.field4103, class187.field2907, var68.field3210 + var69, var70, var68.field3221 + var71, var68.field3217, var5, (class67) null);
                        } else if (var68.field3222 != null) {
                            var68.field3222.method100(0, class221.field3404, class109.field1789, class256.field4103, class187.field2907, var69, var70, var71, var68.field3217, var5, (class67) null);
                        }
                    }
                }
                class7 var75 = var2.field147;
                if (var75 != null) {
                    if ((var75.field162 & var2.field121) != 0 && !class13.method112(var6, var3, var4, var75.field162)) {
                        var75.field156.method100(0, class221.field3404, class109.field1789, class256.field4103, class187.field2907, var75.field150 - class6.field127, var75.field153 - class140.field2145, var75.field158 - class193.field3029, var75.field159, var5, (class67) null);
                    }
                    if ((var75.field157 & var2.field121) != 0 && !class13.method112(var6, var3, var4, var75.field157)) {
                        var75.field149.method100(0, class221.field3404, class109.field1789, class256.field4103, class187.field2907, var75.field150 - class6.field127, var75.field153 - class140.field2145, var75.field158 - class193.field3029, var75.field159, var5, (class67) null);
                    }
                }
            }
            if (var5 < class217.field3352 - 1) {
                class6 var76 = class269.field4298[var5 + 1][var3][var4];
                if (var76 != null && var76.field141) {
                    class144.field2293.method1219(false, var76);
                }
            }
            if (var3 < class99.field1669) {
                class6 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field141) {
                    class144.field2293.method1219(false, var77);
                }
            }
            if (var4 < class99.field1664) {
                class6 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field141) {
                    class144.field2293.method1219(false, var78);
                }
            }
            if (var3 > class99.field1669) {
                class6 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field141) {
                    class144.field2293.method1219(false, var79);
                }
            }
            if (var4 > class99.field1664) {
                class6 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field141) {
                    class144.field2293.method1219(false, var80);
                }
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "i", descriptor = "(B)V")
    public static final void method891(byte arg0) {
        Container var1;
        if (class39.field547 != null) {
            var1 = class39.field547;
        } else if (class47.field685 != null) {
            var1 = class47.field685;
        } else {
            var1 = class179.field2788.field479;
        }
        class266.field4249 = var1.getSize().width;
        ++field2017;
        int var2 = 58 / ((arg0 - 31) / 62);
        client.field2439 = var1.getSize().height;
        if (class47.field685 == var1) {
            Insets var3 = class47.field685.getInsets();
            class266.field4249 -= var3.left - -var3.right;
            client.field2439 -= var3.top - -var3.bottom;
        }
        if (class33.method262(0) < 2) {
            class87.field1457 = (class266.field4249 - 765) / 2;
            class103.field1717 = 0;
            class79.field1310 = 503;
            class29.field409 = 765;
        } else {
            class87.field1457 = 0;
            class103.field1717 = 0;
            class79.field1310 = client.field2439;
            class29.field409 = class266.field4249;
        }
        class230.field3651.setSize(class29.field409, class79.field1310);
        if (class47.field685 == var1) {
            Insets var4 = class47.field685.getInsets();
            class230.field3651.setLocation(var4.left - -class87.field1457, class103.field1717 + var4.top);
        } else {
            class230.field3651.setLocation(class87.field1457, class103.field1717);
        }
        if (~class75.field1236 != 0) {
            class297.method1981(true, 19992);
        }
        class177.method1199(true);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method3(int arg0, boolean arg1) {
        ++field2013;
        if (!arg1) {
            field2018 = -126;
        }
        int[][] var3 = super.field2476.method839(!arg1, arg0);
        if (super.field2476.field1950) {
            int[] var4 = this.method1085(0, arg0 + -1 & class53.field811, (byte) 92);
            int[] var5 = this.method1085(0, arg0, (byte) 59);
            int[] var6 = this.method1085(0, class53.field811 & arg0 + 1, (byte) 119);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class240.field3896; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field2014;
                int var12 = (var5[var10 - -1 & class189.field2929] + -var5[class189.field2929 & var10 + -1]) * this.field2014;
                int var13 = var11 >> 12;
                int var14 = var12 >> 12;
                int var15 = var14 * var14 >> 12;
                int var16 = var13 * var13 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var20 = var11 / var17;
                    var19 = 16777216 / var17;
                    var18 = var12 / var17;
                }
                if (this.field2016) {
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var8[var10] = var18;
                var7[var10] = var20;
                var9[var10] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
    public class128() {
        super(1, false);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        ++field2011;
        if (arg1 <= 11) {
            this.field2016 = true;
        }
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field2016 = arg0.method633(48) == 1;
            }
        } else {
            this.field2014 = arg0.method645(11596);
        }
    }
}
