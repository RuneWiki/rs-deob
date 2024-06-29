import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class73 extends class219 {

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    private int field1124 = 0;

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
    private int field1144 = -1;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "Z")
    public boolean field1129 = false;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    private int field1140 = 0;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    private int field1130 = -32768;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
    public int field1142;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "I")
    public int field1143;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
    public int field1138;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public int field1128;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public int field1125;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
    private int field1136;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "Lfc;")
    private class196 field1137;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    public static int field1133 = -1;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "Lqa;")
    private class112 field1126;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZ)V")
    public final void method492(int arg0, boolean arg1) {
        field1134++;
        if (this.field1129) {
            return;
        }
        this.field1140 += arg0;
        while (this.field1137.field2825[this.field1124] < this.field1140) {
            this.field1140 -= this.field1137.field2825[this.field1124];
            this.field1124++;
            if (this.field1137.field2818.length <= this.field1124) {
                this.field1129 = true;
                break;
            }
        }
        if (!arg1) {
            method493((class233) null, (class233) null, 41);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lve;Lve;I)V")
    public static final void method493(class233 arg0, class233 arg1, int arg2) {
        if (arg2 != 1) {
            field1133 = -28;
        }
        field1139++;
        class280.field4476 = arg0;
        class54.field827 = arg1;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIIIJILqa;)V")
    public final void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class112 arg10) {
        field1127++;
        class2 var13 = this.method494(false);
        if (var13 != null) {
            var13.method10(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1126);
            this.field1130 = var13.method36();
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "()I")
    public final int method36() {
        field1131++;
        return this.field1130;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Z)Lpa;")
    private final class2 method494(boolean arg0) {
        field1135++;
        class7 var2 = class274.method1848(true, this.field1136);
        if (arg0) {
            this.method492(-25, false);
        }
        class2 var3;
        if (this.field1129) {
            var3 = var2.method77(-1, -1, (byte) -121, 0);
        } else {
            var3 = var2.method77(this.field1124, this.field1144, (byte) 123, this.field1140);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIII)V")
    public final void method23(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1141++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIII)V")
    public static final void method495(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class204.field2963 == 0) {
            int var7 = class51.field757;
            int var8 = class152.field2191;
            int var9 = class132.field1941;
            int var10 = (arg3 - arg1) * (var8 - var9) / arg5 + var9;
            int var11 = class43.field622;
            int var12 = (var11 - var7) * (arg6 - arg0) / arg4 + var7;
            if (class275.field4406 && (class136.field1970 & 0x40) != 0) {
                class267 var13 = class22.method165(class102.field1511, false, class172.field2462);
                if (var13 == null) {
                    class213.method1363(true);
                } else {
                    class180.method1167(class214.field3087, " ->", class255.field3866, var10, (short) 38, 0L, arg2 + 122, var12);
                }
            } else {
                if (class69.field1076 == 1) {
                    class180.method1167(class94.field1437, "", -1, var10, (short) 37, 0L, -104, var12);
                }
                class180.method1167(class189.field2682, "", -1, var10, (short) 17, 0L, -116, var12);
                class279.field4464++;
            }
        }
        field1132++;
        long var14 = (long) arg2;
        for (int var16 = 0; var16 < class178.field2519; var16++) {
            long var17 = class236.field3562[var16];
            int var19 = ((int) var17 & 0x6E10B2B4) >> 29;
            int var20 = ((int) var17 & 0x3FC1) >> 7;
            int var21 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            int var22 = (int) var17 & 0x7F;
            if (var14 != var17) {
                var14 = var17;
                if (var19 == 2 && class99.method662(class163.field2364, var22, var20, var17)) {
                    class250 var23 = class91.method618(127, var21);
                    if (var23.field3817 != null) {
                        var23 = var23.method1639(-1);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class204.field2963 == 1) {
                        class66.field1026++;
                        class180.method1167(class240.field3609, class207.field3002 + " -> <col=00ffff>" + var23.field3750, class269.field4217, var20, (short) 10, var17, 121, var22);
                    } else if (class275.field4406) {
                        class228 var28 = class67.field1043 == -1 ? null : class102.method678((byte) -128, class67.field1043);
                        if ((class136.field1970 & 0x4) != 0 && (var28 == null || var23.method1652(class67.field1043, (byte) 124, var28.field3410) != var28.field3410)) {
                            class95.field1441++;
                            class180.method1167(class214.field3087, class14.field214 + " -> <col=00ffff>" + var23.field3750, class255.field3866, var20, (short) 1, var17, 120, var22);
                        }
                    } else {
                        class141.field2038++;
                        String[] var24 = var23.field3796;
                        if (class100.field1488) {
                            var24 = class170.method1121(var24, (byte) -30);
                        }
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    class13.field198++;
                                    short var26 = 0;
                                    int var27 = -1;
                                    if (var23.field3825 == var25) {
                                        var27 = var23.field3818;
                                    }
                                    if (var25 == 0) {
                                        var26 = 21;
                                    }
                                    if (var25 == 1) {
                                        var26 = 41;
                                    }
                                    if (var23.field3792 == var25) {
                                        var27 = var23.field3775;
                                    }
                                    if (var25 == 2) {
                                        var26 = 2;
                                    }
                                    if (var25 == 3) {
                                        var26 = 19;
                                    }
                                    if (var25 == 4) {
                                        var26 = 1005;
                                    }
                                    class180.method1167(var24[var25], "<col=00ffff>" + var23.field3750, var27, var20, var26, var17, 120, var22);
                                }
                            }
                        }
                        class180.method1167(class55.field830, "<col=00ffff>" + var23.field3750, class206.field2976, var20, (short) 1007, (long) var23.field3783, -125, var22);
                    }
                }
                if (var19 == 1) {
                    class72 var29 = class82.field1268[var21];
                    if ((var29.field1119.field4283 & 0x1) == 0 && (var29.field45 & 0x7F) == 0 && (var29.field94 & 0x7F) == 0 || (var29.field1119.field4283 & 0x1) == 1 && (var29.field45 & 0x7F) == 64 && (var29.field94 & 0x7F) == 64) {
                        int var30 = var29.field94 - (var29.field1119.field4283 - 1) * 64;
                        int var31 = var29.field45 + 64 - (var29.field1119.field4283 * 64);
                        for (int var32 = 0; var32 < class51.field756; var32++) {
                            class72 var37 = class82.field1268[class67.field1049[var32]];
                            if (var37 != null && !var37.field110 && var29 != var37 && var37.field89) {
                                int var38 = var37.field45 - (var37.field1119.field4283 - 1) * 64;
                                int var39 = var37.field94 - ((var37.field1119.field4283 - 1) * 64);
                                if (var38 >= var31 && var37.field1119.field4283 <= (var29.field1119.field4283 - (var38 - var31 >> 7)) && var30 <= var39 && (var29.field1119.field4283 - (var39 - var30 >> 7)) >= var37.field1119.field4283) {
                                    class268.method1791(class67.field1049[var32], var37.field1119, var22, var20, 4);
                                    var37.field110 = true;
                                }
                            }
                        }
                        for (int var33 = 0; var33 < class193.field2770; var33++) {
                            class53 var34 = class194.field2777[class110.field1589[var33]];
                            if (var34 != null && !var34.field110 && var34.field89) {
                                int var35 = var34.field45 + 64 - (var34.method57(0) * 64);
                                int var36 = var34.field94 - ((var34.method57(0) - 1) * 64);
                                if (var31 <= var35 && var34.method57(0) <= (var29.field1119.field4283 - (var35 - var31 >> 7)) && var30 <= var36 && var34.method57(0) <= var29.field1119.field4283 - (var36 - var30 >> 7)) {
                                    class137.method922(var22, var34, class110.field1589[var33], 255, var20);
                                    var34.field110 = true;
                                }
                            }
                        }
                    }
                    if (var29.field110) {
                        continue;
                    }
                    class268.method1791(var21, var29.field1119, var22, var20, 4);
                    var29.field110 = true;
                }
                if (var19 == 0) {
                    class53 var40 = class194.field2777[var21];
                    if ((var40.field45 & 0x7F) == 64 && (var40.field94 & 0x7F) == 64) {
                        int var41 = var40.field45 - (var40.method57(0) - 1) * 64;
                        int var42 = var40.field94 + 64 - (var40.method57(0) * 64);
                        for (int var43 = 0; var43 < class51.field756; var43++) {
                            class72 var48 = class82.field1268[class67.field1049[var43]];
                            if (var48 != null && !var48.field110 && var48.field89) {
                                int var49 = var48.field45 + 64 - (var48.field1119.field4283 * 64);
                                int var50 = var48.field94 - ((var48.field1119.field4283 - 1) * 64);
                                if (var41 <= var49 && var48.field1119.field4283 <= (var40.method57(0) - (var49 - var41 >> 7)) && var42 <= var50 && var48.field1119.field4283 <= (var40.method57(~arg2) - (var50 - var42 >> 7))) {
                                    class268.method1791(class67.field1049[var43], var48.field1119, var22, var20, 4);
                                    var48.field110 = true;
                                }
                            }
                        }
                        for (int var44 = 0; var44 < class193.field2770; var44++) {
                            class53 var45 = class194.field2777[class110.field1589[var44]];
                            if (var45 != null && !var45.field110 && var40 != var45 && var45.field89) {
                                int var46 = var45.field45 - ((var45.method57(0) - 1) * 64);
                                int var47 = var45.field94 - (var45.method57(0) - 1) * 64;
                                if (var41 <= var46 && var45.method57(0) <= var40.method57(arg2 + 1) - (var46 - var41 >> 7) && var47 >= var42 && var45.method57(0) <= (var40.method57(0) - (var47 - var42 >> 7))) {
                                    class137.method922(var22, var45, class110.field1589[var44], 255, var20);
                                    var45.field110 = true;
                                }
                            }
                        }
                    }
                    if (var40.field110) {
                        continue;
                    }
                    class137.method922(var22, var40, var21, 255, var20);
                    var40.field110 = true;
                }
                if (var19 == 3) {
                    class97 var51 = class162.field2335[class163.field2364][var22][var20];
                    if (var51 != null) {
                        for (class274 var52 = (class274) var51.method649(104); var52 != null; var52 = (class274) var51.method651(false)) {
                            int var53 = var52.field4404.field903;
                            class273 var54 = class259.method1735(var53, -14667);
                            if (class204.field2963 == 1) {
                                class180.method1167(class240.field3609, class207.field3002 + " -> <col=ff9040>" + var54.field4375, class269.field4217, var20, (short) 28, (long) var53, -34, var22);
                                class262.field3945++;
                            } else if (class275.field4406) {
                                class228 var55 = class67.field1043 == -1 ? null : class102.method678((byte) 59, class67.field1043);
                                if ((class136.field1970 & 0x1) != 0 && (var55 == null || var54.method1835((byte) -97, var55.field3410, class67.field1043) != var55.field3410)) {
                                    class180.method1167(class214.field3087, class14.field214 + " -> <col=ff9040>" + var54.field4375, class255.field3866, var20, (short) 6, (long) var53, -45, var22);
                                    class134.field1953++;
                                }
                            } else {
                                String[] var56 = var54.field4372;
                                if (class100.field1488) {
                                    var56 = class170.method1121(var56, (byte) 121);
                                }
                                for (int var57 = 4; var57 >= 0; var57--) {
                                    if (var56 != null && var56[var57] != null) {
                                        class34.field484++;
                                        byte var58 = 0;
                                        if (var57 == 0) {
                                            var58 = 18;
                                        }
                                        int var59 = -1;
                                        if (var54.field4351 == var57) {
                                            var59 = var54.field4352;
                                        }
                                        if (var54.field4365 == var57) {
                                            var59 = var54.field4370;
                                        }
                                        if (var57 == 1) {
                                            var58 = 26;
                                        }
                                        if (var57 == 2) {
                                            var58 = 47;
                                        }
                                        if (var57 == 3) {
                                            var58 = 60;
                                        }
                                        if (var57 == 4) {
                                            var58 = 29;
                                        }
                                        class180.method1167(var56[var57], "<col=ff9040>" + var54.field4375, var59, var20, var58, (long) var53, 122, var22);
                                    }
                                }
                                class100.field1489++;
                                class180.method1167(class55.field830, "<col=ff9040>" + var54.field4375, class206.field2976, var20, (short) 1002, (long) var53, 125, var22);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(IIIIIII)V")
    public class73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1142 = arg5 + arg6;
        this.field1143 = arg1;
        this.field1138 = arg2;
        this.field1128 = arg3;
        this.field1125 = arg4;
        this.field1136 = arg0;
        int var8 = class274.method1848(true, this.field1136).field138;
        if (var8 == -1) {
            this.field1129 = true;
        } else {
            this.field1129 = false;
            this.field1137 = class70.method478(var8, false);
        }
    }
}
