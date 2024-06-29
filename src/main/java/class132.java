import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class132 extends class26 {

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "J")
    public long field1794;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1793 = "rating: ";

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "Z")
    public static volatile boolean field1796 = false;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "[Lt;")
    public static class64[] field1799 = new class64[6];

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "Ljava/lang/String;")
    public static String field1800 = "Loading config - ";

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIZZI[[[Lnh;)Z", line = 6)
    public static final boolean method1008(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, class119[][][] arg5) {
        field1802++;
        byte var6 = arg3 ? 1 : (byte) (class42.field531 & 0xFF);
        if (class306.field4480[class56.field724][arg1][arg4] == var6) {
            return false;
        } else if ((class9.field101[class56.field724][arg1][arg4] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class274.field3926[var7] = arg1;
            if (arg2) {
                method1009(-100, -64, 4, 122, 56, 105);
            }
            int var8 = 0;
            int var31 = var7 + 1;
            class199.field2805[var7] = arg4;
            class306.field4480[class56.field724][arg1][arg4] = var6;
            while (var31 != var8) {
                int var9 = class274.field3926[var8] & 0xFFFF;
                int var10 = class274.field3926[var8] >> 16 & 0xFF;
                int var11 = class274.field3926[var8] >> 24 & 0xFF;
                int var12 = class199.field2805[var8] >> 16 & 0xFF;
                boolean var13 = false;
                int var14 = class199.field2805[var8] & 0xFFFF;
                boolean var15 = false;
                var8 = var8 + 1 & 0xFFF;
                if ((class9.field101[class56.field724][var9][var14] & 0x4) == 0) {
                    var13 = true;
                }
                label245: for (int var16 = class56.field724 + 1; var16 <= 3; var16++) {
                    if ((class9.field101[var16][var9][var14] & 0x8) == 0) {
                        if (var13 && arg5[var16][var9][var14] != null) {
                            if (arg5[var16][var9][var14].field1552 != null) {
                                int var17 = class330.method2289(26957, var10);
                                if (arg5[var16][var9][var14].field1552.field3308 == var17 || arg5[var16][var9][var14].field1552.field3299 == var17) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var18 = class330.method2289(26957, var11);
                                    if (arg5[var16][var9][var14].field1552.field3308 == var18 || arg5[var16][var9][var14].field1552.field3299 == var18) {
                                        continue;
                                    }
                                }
                                if (var12 != 0) {
                                    int var19 = class330.method2289(26957, var12);
                                    if (arg5[var16][var9][var14].field1552.field3308 == var19 || arg5[var16][var9][var14].field1552.field3299 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg5[var16][var9][var14].field1549 != null) {
                                for (int var20 = 0; var20 < arg5[var16][var9][var14].field1563; var20++) {
                                    int var21 = (int) (arg5[var16][var9][var14].field1549[var20].field4289 >> 14 & 0x3FL);
                                    int var22 = (int) (arg5[var16][var9][var14].field1549[var20].field4289 >> 20 & 0x3L);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var23 = var22 << 6 | var21;
                                    if (var10 == var23 || var11 != 0 && var11 == var23 || var12 != 0 && var12 == var23) {
                                        continue label245;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class119 var24 = arg5[var16][var9][var14];
                        if (var24 != null && var24.field1563 > 0) {
                            for (int var25 = 0; var25 < var24.field1563; var25++) {
                                class294 var26 = var24.field1549[var25];
                                if (var26.field4285 != var26.field4283 || var26.field4287 != var26.field4276) {
                                    for (int var27 = var26.field4283; var27 <= var26.field4285; var27++) {
                                        for (int var28 = var26.field4287; var28 <= var26.field4276; var28++) {
                                            class306.field4480[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class306.field4480[var16][var9][var14] = var6;
                    }
                }
                if (var15) {
                    if (class48.field646[arg0] < class74.field978[class56.field724 + 1][var9][var14]) {
                        class48.field646[arg0] = class74.field978[class56.field724 + 1][var9][var14];
                    }
                    int var29 = var9 << 7;
                    int var30 = var14 << 7;
                    if (class221.field3181[arg0] > var29) {
                        class221.field3181[arg0] = var29;
                    } else if (var29 > class7.field64[arg0]) {
                        class7.field64[arg0] = var29;
                    }
                    if (var30 < class29.field331[arg0]) {
                        class29.field331[arg0] = var30;
                    } else if (var30 > class291.field4235[arg0]) {
                        class291.field4235[arg0] = var30;
                    }
                }
                if (!var13) {
                    if (var9 >= 1 && class306.field4480[class56.field724][var9 - 1][var14] != var6) {
                        class274.field3926[var31] = class80.method568(class80.method568(1179648, var9 - 1), -754974720);
                        class199.field2805[var31] = class80.method568(1245184, var14);
                        var31 = var31 + 1 & 0xFFF;
                        class306.field4480[class56.field724][var9 - 1][var14] = var6;
                    }
                    var14++;
                    if (var14 < 104) {
                        if ((var9 - 1) >= 0 && class306.field4480[class56.field724][var9 - 1][var14] != var6 && (class9.field101[class56.field724][var9][var14] & 0x4) == 0 && (class9.field101[class56.field724][var9 - 1][var14 - 1] & 0x4) == 0) {
                            class274.field3926[var31] = class80.method568(1375731712, class80.method568(var9 - 1, 1179648));
                            class199.field2805[var31] = class80.method568(var14, 1245184);
                            class306.field4480[class56.field724][var9 - 1][var14] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class306.field4480[class56.field724][var9][var14] != var6) {
                            class274.field3926[var31] = class80.method568(class80.method568(var9, 5373952), 318767104);
                            class199.field2805[var31] = class80.method568(var14, 5439488);
                            class306.field4480[class56.field724][var9][var14] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < 104 && class306.field4480[class56.field724][var9 + 1][var14] != var6 && (class9.field101[class56.field724][var9][var14] & 0x4) == 0 && (class9.field101[class56.field724][var9 + 1][var14 - 1] & 0x4) == 0) {
                            class274.field3926[var31] = class80.method568(class80.method568(5373952, var9 + 1), -1845493760);
                            class199.field2805[var31] = class80.method568(5439488, var14);
                            class306.field4480[class56.field724][var9 + 1][var14] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var14--;
                    if ((var9 + 1) < 104 && class306.field4480[class56.field724][var9 + 1][var14] != var6) {
                        class274.field3926[var31] = class80.method568(1392508928, class80.method568(var9 + 1, 9568256));
                        class199.field2805[var31] = class80.method568(var14, 9633792);
                        var31 = var31 + 1 & 0xFFF;
                        class306.field4480[class56.field724][var9 + 1][var14] = var6;
                    }
                    var14--;
                    if (var14 >= 0) {
                        if ((var9 - 1) >= 0 && class306.field4480[class56.field724][var9 - 1][var14] != var6 && (class9.field101[class56.field724][var9][var14] & 0x4) == 0 && (class9.field101[class56.field724][var9 - 1][var14 + 1] & 0x4) == 0) {
                            class274.field3926[var31] = class80.method568(301989888, class80.method568(13762560, var9 - 1));
                            class199.field2805[var31] = class80.method568(13828096, var14);
                            var31 = var31 + 1 & 0xFFF;
                            class306.field4480[class56.field724][var9 - 1][var14] = var6;
                        }
                        if (class306.field4480[class56.field724][var9][var14] != var6) {
                            class274.field3926[var31] = class80.method568(-1828716544, class80.method568(13762560, var9));
                            class199.field2805[var31] = class80.method568(13828096, var14);
                            var31 = var31 + 1 & 0xFFF;
                            class306.field4480[class56.field724][var9][var14] = var6;
                        }
                        if ((var9 + 1) < 104 && class306.field4480[class56.field724][var9 + 1][var14] != var6 && (class9.field101[class56.field724][var9][var14] & 0x4) == 0 && (class9.field101[class56.field724][var9 + 1][var14 + 1] & 0x4) == 0) {
                            class274.field3926[var31] = class80.method568(-771751936, class80.method568(var9 + 1, 9568256));
                            class199.field2805[var31] = class80.method568(var14, 9633792);
                            var31 = var31 + 1 & 0xFFF;
                            class306.field4480[class56.field724][var9 + 1][var14] = var6;
                        }
                    }
                }
            }
            if (class48.field646[arg0] != -1000000) {
                class48.field646[arg0] += 10;
                class221.field3181[arg0] -= 50;
                class7.field64[arg0] += 50;
                class291.field4235[arg0] += 50;
                class29.field331[arg0] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(IIIIII)V", line = 322)
    public static final void method1009(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1797++;
        int var6 = arg0 - arg2;
        int var7 = arg5 - arg1;
        if (var7 == 0) {
            if (var6 != 0) {
                class32.method205(arg1, arg4, arg0, (byte) -75, arg2);
            }
        } else if (var6 == 0) {
            class109.method774(arg1, false, arg5, arg4, arg2);
        } else {
            if (arg3 < ~var7) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg1;
                arg1 = arg2;
                arg2 = var9;
                int var10 = arg5;
                arg5 = arg0;
                arg0 = var10;
            }
            if (arg5 < arg1) {
                int var11 = arg1;
                arg1 = arg5;
                int var12 = arg2;
                arg2 = arg0;
                arg0 = var12;
                arg5 = var11;
            }
            int var13 = arg2;
            int var14 = arg5 - arg1;
            int var15 = arg0 - arg2;
            int var16 = arg0 > arg2 ? 1 : -1;
            if (var15 < 0) {
                var15 = -var15;
            }
            int var17 = -(var14 >> 1);
            if (var8) {
                for (int var18 = arg1; var18 <= arg5; var18++) {
                    var17 += var15;
                    class331.field4902[var18][var13] = arg4;
                    if (var17 > 0) {
                        var13 += var16;
                        var17 -= var14;
                    }
                }
            } else {
                for (int var19 = arg1; var19 <= arg5; var19++) {
                    var17 += var15;
                    class331.field4902[var13][var19] = arg4;
                    if (var17 > 0) {
                        var13 += var16;
                        var17 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILfd;)V", line = 438)
    public static final void method1010(int arg0, int arg1, class299 arg2) {
        if (class134.field1825 != null) {
            try {
                class134.field1825.method97(true, 0L);
                class134.field1825.method94(arg1, arg2.field4350, 24, (byte) 42);
            } catch (Exception var4) {
            }
        }
        if (arg0 == -29026) {
            field1798++;
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V", line = 458)
    public static void method1011(int arg0) {
        field1799 = null;
        field1793 = null;
        field1800 = null;
        if (arg0 != 1) {
            method1011(58);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIIIIIZ)V", line = 473)
    public static final void method1012(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        if (arg4 == arg8 && arg2 == arg7 && arg5 == arg6 && arg0 == arg1) {
            method1009(arg0, arg8, arg2, -1, arg3, arg6);
        } else {
            int var10 = arg8;
            int var11 = arg2;
            int var12 = arg8 * 3;
            int var13 = arg2 * 3;
            int var14 = arg4 * 3;
            int var15 = arg5 * 3;
            int var16 = arg7 * 3;
            int var17 = arg1 * 3;
            int var18 = var14 + arg6 - arg8 - var15;
            int var19 = arg0 + var16 - arg2 - var17;
            int var20 = var15 + var12 - var14 - var14;
            int var21 = var13 + var17 - var16 - var16;
            int var22 = var16 - var13;
            int var23 = var14 - var12;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var20 * var25;
                int var29 = var23 * var24;
                int var30 = var21 * var25;
                int var31 = (var27 + var28 + var29 >> 12) + arg8;
                int var32 = var19 * var26;
                int var33 = var22 * var24;
                int var34 = (var30 + var32 + var33 >> 12) + arg2;
                method1009(var34, var10, var11, -1, arg3, var31);
                var10 = var31;
                var11 = var34;
            }
        }
        if (!arg9) {
            method1011(34);
        }
        field1801++;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V", line = 553)
    public class132() {
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(J)V", line = 555)
    public class132(long arg0) {
        this.field1794 = arg0;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BC)B", line = 568)
    public static final byte method1013(byte arg0, char arg1) {
        field1795++;
        int var2 = 65 / ((-arg0 - 14) / 52);
        byte var3;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var3 = (byte) arg1;
        } else if (arg1 == '€') {
            var3 = -128;
        } else if (arg1 == '‚') {
            var3 = -126;
        } else if (arg1 == 'ƒ') {
            var3 = -125;
        } else if (arg1 == '„') {
            var3 = -124;
        } else if (arg1 == '…') {
            var3 = -123;
        } else if (arg1 == '†') {
            var3 = -122;
        } else if (arg1 == '‡') {
            var3 = -121;
        } else if (arg1 == 'ˆ') {
            var3 = -120;
        } else if (arg1 == '‰') {
            var3 = -119;
        } else if (arg1 == 'Š') {
            var3 = -118;
        } else if (arg1 == '‹') {
            var3 = -117;
        } else if (arg1 == 'Œ') {
            var3 = -116;
        } else if (arg1 == 'Ž') {
            var3 = -114;
        } else if (arg1 == '‘') {
            var3 = -111;
        } else if (arg1 == '’') {
            var3 = -110;
        } else if (arg1 == '“') {
            var3 = -109;
        } else if (arg1 == '”') {
            var3 = -108;
        } else if (arg1 == '•') {
            var3 = -107;
        } else if (arg1 == '–') {
            var3 = -106;
        } else if (arg1 == '—') {
            var3 = -105;
        } else if (arg1 == '˜') {
            var3 = -104;
        } else if (arg1 == '™') {
            var3 = -103;
        } else if (arg1 == 'š') {
            var3 = -102;
        } else if (arg1 == '›') {
            var3 = -101;
        } else if (arg1 == 'œ') {
            var3 = -100;
        } else if (arg1 == 'ž') {
            var3 = -98;
        } else if (arg1 == 'Ÿ') {
            var3 = -97;
        } else {
            var3 = 63;
        }
        return var3;
    }
}
