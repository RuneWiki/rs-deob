import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class346 extends class393 {

    @OriginalMember(owner = "client!og", name = "S", descriptor = "I")
    public int field5411;

    @OriginalMember(owner = "client!og", name = "X", descriptor = "I")
    public int field5415;

    @OriginalMember(owner = "client!og", name = "W", descriptor = "Z")
    public boolean field5414;

    @OriginalMember(owner = "client!og", name = "T", descriptor = "F")
    public float field5412;

    @OriginalMember(owner = "client!og", name = "Z", descriptor = "F")
    public float field5417;

    @OriginalMember(owner = "client!og", name = "ab", descriptor = "Lpg;")
    public static class492 field5418;

    @OriginalMember(owner = "client!og", name = "cb", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!og", name = "V", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!og", name = "Y", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!og", name = "bb", descriptor = "Lan;")
    public static class126 field5419;

    // $FF: synthetic field
    @OriginalMember(owner = "client!og", name = "db", descriptor = "Ljava/lang/Class;")
    public static Class field5421;

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lbv;IIII[I)V")
    public class346(class282 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field5411 = arg2;
        this.field5415 = arg1;
        this.method2421(0, arg2, true, 0, arg5, 0, arg1, (byte) -35, 0);
        this.field5414 = false;
        this.field5412 = (float) arg2 / (float) arg4;
        this.field5417 = (float) arg1 / (float) arg3;
        this.method2417(true, false, false);
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lbv;IIIIIZ)V")
    public class346(class282 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field5415 = arg4;
        this.field5411 = arg5;
        if (~super.field240 != -34038) {
            this.field5414 = true;
            this.field5417 = this.field5412 = 1.0F;
        } else {
            this.field5417 = (float) arg4;
            this.field5414 = false;
            this.field5412 = (float) arg5;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILic;)V")
    public static final void method2206(int arg0, class32 arg1) {
        ++field5408;
        if (!class455.field6680) {
            if (arg0 == -7445) {
                arg1.method2785((byte) -120);
                --class12.field201;
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIII)V")
    public static final void method2207(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~arg0 >= ~arg2) {
            for (int var5 = arg0; arg2 > var5; ++var5) {
                class23.field356[var5][arg3] = arg4;
            }
        } else {
            for (int var6 = arg2; ~arg0 < ~var6; ++var6) {
                class23.field356[var6][arg3] = arg4;
            }
        }
        ++field5410;
        if (arg1 >= -102) {
            method2208(-125, -48, (class496) null);
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lbv;IIIII[BI)V")
    public class346(class282 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field5411 = arg3;
        this.field5415 = arg2;
        this.method2422(0, arg6, arg7, arg2, 0, 0, 0, true, false, arg3);
        this.field5412 = (float) arg3 / (float) arg5;
        this.field5417 = (float) arg2 / (float) arg4;
        this.field5414 = false;
        this.method2417(true, false, false);
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lbv;IIIIZ[BI)V")
    public class346(class282 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field5415 = arg3;
        if (~super.field240 != -34038) {
            this.field5414 = true;
            this.field5417 = this.field5412 = 1.0F;
        } else {
            this.field5414 = false;
            this.field5417 = (float) arg3;
            this.field5412 = (float) arg4;
        }
        this.field5411 = arg4;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IILqa;)Z")
    public static final boolean method2208(int arg0, int arg1, class496 arg2) {
        ++field5416;
        int var3 = (class96.field1403 + -104) / 2;
        int var4 = (class485.field7122 + -104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; ++var6) {
            for (int var51 = var4; ~var51 > ~(var4 + 104); ++var51) {
                for (int var52 = arg1; ~var52 >= -4; ++var52) {
                    if (class411.method2500(var52, arg1, var6, var51, (byte) -126)) {
                        int var53 = var52;
                        if (class42.method333(var51, var6, arg0 ^ -238)) {
                            var53 = var52 - 1;
                        }
                        if (~var53 <= -1) {
                            var5 &= class519.method3089(17706, var6, var51, var53);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        } else {
            int[] var7 = new int[262144];
            for (int var8 = 0; var7.length > var8; ++var8) {
                var7[var8] = -16777216;
            }
            class261.field3634 = arg2.method1097(var7, 0, 512, 512, 512);
            class1.method5(true);
            int var9 = -16777216 | -10 - -((int) (20.0D * Math.random())) - (arg0 - ((int) (Math.random() * 20.0D) + 228 << 16)) - -(238 + ((int) (Math.random() * 20.0D) - 10) << 8);
            int var10 = (int) (20.0D * Math.random()) + 238 + -10 << 16 | -16777216;
            int var11 = (int) (8.0D * Math.random()) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
            boolean[][] var12 = new boolean[class389.field5907][class389.field5907];
            for (int var13 = var3; var13 < var3 + 104; var13 += class389.field5907) {
                for (int var36 = var4; ~(var4 + 104) < ~var36; var36 += class389.field5907) {
                    arg2.method1046(0, 0, class389.field5907 * 4, class389.field5907 * 4);
                    arg2.method1053(-16777216);
                    for (int var37 = arg1; ~var37 >= -4; ++var37) {
                        for (int var44 = 0; ~var44 > ~class389.field5907; ++var44) {
                            for (int var50 = 0; ~var50 > ~class389.field5907; ++var50) {
                                var12[var44][var50] = class411.method2500(var37, arg1, var13 + var44, var36 + var50, (byte) -79);
                            }
                        }
                        class204.field2871[var37].method843(0, 0, 1024, var13, var36, class389.field5907 + var13, class389.field5907 + var36, var12);
                        if (!class335.field5163) {
                            for (int var45 = -4; ~class389.field5907 < ~var45; ++var45) {
                                for (int var46 = -4; var46 < class389.field5907; ++var46) {
                                    int var47 = var13 + var45;
                                    int var48 = var36 + var46;
                                    if (~var47 <= ~var3 && var48 >= var4 && class411.method2500(var37, arg1, var47, var48, (byte) -83)) {
                                        int var49 = var37;
                                        if (class42.method333(var48, var47, arg0 ^ -238)) {
                                            var49 = var37 - 1;
                                        }
                                        if (var49 >= 0) {
                                            class14.method120(var49, var9, var47, (byte) -119, var10, (-var46 + class389.field5907) * 4 + -4, arg2, var48, var45 * 4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class335.field5163) {
                        class370 var38 = class444.field6605[arg1];
                        for (int var39 = 0; var39 < class389.field5907; ++var39) {
                            for (int var40 = 0; class389.field5907 > var40; ++var40) {
                                int var41 = var13 - -var39;
                                int var42 = var36 + var40;
                                int var43 = var38.field5678[-var38.field5692 + var41][-var38.field5669 + var42];
                                if (~(var43 & 1076101120) == -1) {
                                    if (~(8388608 & var43) == -1) {
                                        if (~(var43 & 33554432) == -1) {
                                            if ((var43 & 134217728) != 0) {
                                                arg2.method2947(var39 * 4, -1713569622, (-var40 + class389.field5907) * 4 + -4 + 3, (byte) 99, 4);
                                            } else if (~(536870912 & var43) != -1) {
                                                arg2.method2949(-1713569622, (byte) -83, 4, (-var40 + class389.field5907) * 4 + -4, var39 * 4);
                                            }
                                        } else {
                                            arg2.method2949(-1713569622, (byte) -83, 4, (-var40 + class389.field5907) * 4 - 4, var39 * 4 - -3);
                                        }
                                    } else {
                                        arg2.method2947(var39 * 4, -1713569622, (-var40 + class389.field5907) * 4 + -4, (byte) 106, 4);
                                    }
                                } else {
                                    arg2.method2952(4, 4, var39 * 4, -1713569622, (byte) -53, (-var40 + class389.field5907) * 4 + -4);
                                }
                            }
                        }
                    }
                    arg2.method1112(0, 0, class389.field5907 * 4, class389.field5907 * 4, var11, 2);
                    class261.field3634.method31((-var3 + var13) * 4 + 48, -((-var4 + var36) * 4) + 464 + -(class389.field5907 * 4), class389.field5907 * 4, class389.field5907 * 4, 0, 0);
                }
            }
            arg2.method1107();
            arg2.method1053(-16777215);
            class268.method1710(true);
            class44.field656 = 0;
            class7.field110.method1959((byte) 113);
            if (!class335.field5163) {
                for (int var14 = var3; ~(var3 + 104) < ~var14; ++var14) {
                    for (int var20 = var4; var20 < var4 + 104; ++var20) {
                        for (int var21 = arg1; arg1 + 1 >= var21 && var21 <= 3; ++var21) {
                            if (class411.method2500(var21, arg1, var14, var20, (byte) 12)) {
                                class196 var22 = (class196) class380.method2357(var21, var14, var20);
                                if (var22 == null) {
                                    var22 = (class196) class432.method2587(var21, var14, var20, field5421 != null ? field5421 : (field5421 = method2210("ou")));
                                }
                                if (var22 == null) {
                                    var22 = (class196) class456.method2743(var21, var14, var20);
                                }
                                if (var22 == null) {
                                    var22 = (class196) class174.method1214(var21, var14, var20);
                                }
                                if (var22 != null) {
                                    class130 var23 = class56.field755.method2031(-123, var22.method50(25707));
                                    if (!var23.field1842 || class289.field4305) {
                                        int var24 = var23.field1903;
                                        if (var23.field1823 != null) {
                                            for (int var25 = 0; ~var25 > ~var23.field1823.length; ++var25) {
                                                if (~var23.field1823[var25] != 0) {
                                                    class130 var26 = class56.field755.method2031(-96, var23.field1823[var25]);
                                                    if (~var26.field1903 <= -1) {
                                                        var24 = var26.field1903;
                                                    }
                                                }
                                            }
                                        }
                                        if (~var24 <= -1) {
                                            boolean var27 = false;
                                            if (~var24 <= -1) {
                                                class24 var28 = class237.field3377.method356(-1, var24);
                                                if (var28 != null && var28.field366) {
                                                    var27 = true;
                                                }
                                            }
                                            int var29 = var14;
                                            int var30 = var20;
                                            if (var27) {
                                                int[][] var31 = class444.field6605[var21].field5678;
                                                int var32 = class444.field6605[var21].field5692;
                                                int var33 = class444.field6605[var21].field5669;
                                                for (int var34 = 0; ~var34 > -11; ++var34) {
                                                    int var35 = (int) (Math.random() * 4.0D);
                                                    if (var35 == 0 && ~var29 < ~var3 && ~var29 < ~(var14 + -3) && (2883848 & var31[-var32 + var29 + -1][-var33 + var30]) == 0) {
                                                        --var29;
                                                    }
                                                    if (~var35 == -2 && var29 < var3 + -1 + 104 && var14 + 3 > var29 && (2883968 & var31[var29 - -1 + -var32][var30 - var33]) == 0) {
                                                        ++var29;
                                                    }
                                                    if (var35 == 2 && var4 < var30 && var20 - 3 < var30 && ~(var31[-var32 + var29][var30 - 1 + -var33] & 2883842) == -1) {
                                                        --var30;
                                                    }
                                                    if (var35 == 3 && ~(var4 - -104 - 1) < ~var30 && var20 + 3 > var30 && ~(var31[-var32 + var29][-var33 + 1 + var30] & 2883872) == -1) {
                                                        ++var30;
                                                    }
                                                }
                                            }
                                            class138.field2014[class44.field656] = var23.field1826;
                                            class93.field1349[class44.field656] = var29;
                                            class16.field254[class44.field656] = var30;
                                            ++class44.field656;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (class465.field6792 != null) {
                    class338.field5355.field6511 = 1;
                    class237.field3377.method358((byte) 114, 1024, 64);
                    for (int var15 = 0; ~class465.field6792.field5354 < ~var15; ++var15) {
                        int var16 = class465.field6792.field5353[var15];
                        if (var16 >> 28 == class339.field5365.field2210) {
                            int var17 = (var16 >> 14 & 16383) + -class82.field1105;
                            int var18 = (var16 & 16383) + -class437.field6477;
                            if (var17 >= 0 && class96.field1403 > var17 && var18 >= 0 && var18 < class485.field7122) {
                                class7.field110.method1958(new class74(var15), arg0 + 238);
                            } else {
                                class24 var19 = class237.field3377.method356(-1, class465.field6792.field5358[var15]);
                                if (var19.field358 != null && ~(var19.field376 + var17) <= -1 && ~class96.field1403 < ~(var17 - -var19.field370) && ~(var18 - -var19.field364) <= -1 && ~(var19.field359 + var18) > ~class485.field7122) {
                                    class7.field110.method1958(new class74(var15), 0);
                                }
                            }
                        }
                    }
                    class237.field3377.method358((byte) -72, 128, 64);
                    class338.field5355.field6511 = 2;
                    class338.field5355.method2625(arg0 + 237);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V")
    public static void method2209(byte arg0) {
        field5419 = null;
        field5418 = null;
        if (arg0 > -11) {
            method2207(124, 66, 5, 7, 39);
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lbv;IIIIIIZ)V")
    public class346(class282 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field5411 = arg4;
        this.field5417 = (float) arg3 / (float) arg5;
        this.field5412 = (float) arg4 / (float) arg6;
        this.field5414 = false;
        this.field5415 = arg3;
        this.method2417(true, false, false);
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lbv;IIIZ[I)V")
    public class346(class282 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field5411 = arg3;
        this.field5415 = arg2;
        if (super.field240 == 34037) {
            this.field5417 = (float) arg2;
            this.field5412 = (float) arg3;
            this.field5414 = false;
        } else {
            this.field5417 = this.field5412 = 1.0F;
            this.field5414 = true;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!og", name = "b", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2210(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class375("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
        field5418 = new class492(84, 6);
        field5420 = 0;
    }
}
