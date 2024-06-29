import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class637 {

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "I")
    public static int field8784;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "I")
    public static int field8785;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "I")
    public static int field8786;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sp", name = "d", descriptor = "Ljava/lang/Class;")
    public static Class field8787;

    // $FF: synthetic method
    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3574(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lnd;III)Llga;", line = 5)
    public static final class714 method3572(class547 arg0, int arg1, int arg2, int arg3) {
        field8784++;
        byte[] var4 = arg0.method3153(arg3, 0, arg1);
        if (arg2 != 4) {
            field8786 = 98;
        }
        return var4 == null ? null : new class714(var4);
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IILha;)Z", line = 21)
    public static final boolean method3573(int arg0, int arg1, class60 arg2) {
        field8785++;
        int var3 = (class409.field5183 - 104) / 2;
        int var4 = (class543.field7597 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < (var3 + 104); var6++) {
            for (int var57 = var4; var57 < (var4 + 104); var57++) {
                for (int var58 = arg0; var58 <= 3; var58++) {
                    if (class520.method3024(var58, var6, var57, arg0, -29920)) {
                        int var59 = var58;
                        if (class99.method797(var57, 1, var6)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class409.method2287(var57, (byte) -83, var6, var59);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class582.field8137 = arg2.method435(512, 0, 512, -115, var7, 512);
        class682.method3838(-200);
        int var9 = (int) (Math.random() * 20.0D) - (-(((int) (Math.random() * 20.0D) + 228 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16)) - 228) | 0xFF000000;
        int var10 = (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00 << 16;
        if (arg1 != 4) {
            method3572(null, -128, -18, -27);
        }
        int var11 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
        boolean[][] var12 = new boolean[class112.field1621 + 2 + 1][class112.field1621 + 2 + 1];
        for (int var13 = var3; var13 < var3 + 104; var13 += class112.field1621) {
            for (int var36 = var4; var36 < var4 + 104; var36 += class112.field1621) {
                int var37 = 0;
                int var38 = 0;
                int var39 = var13;
                if (var13 > 0) {
                    var37 += 4;
                    var39 = var13 - 1;
                }
                int var40 = var36;
                if (var36 > 0) {
                    var40 = var36 - 1;
                }
                int var41 = class112.field1621 + var13;
                if (var41 < 104) {
                    var41++;
                }
                int var42 = class112.field1621 + var36;
                if (var42 < 104) {
                    var42++;
                    var38 += 4;
                }
                arg2.method534(0, 0, var37 + (class112.field1621 * 4), class112.field1621 * 4 + var38);
                arg2.method462(-16777216);
                for (int var43 = arg0; var43 <= 3; var43++) {
                    for (int var50 = 0; var50 <= class112.field1621; var50++) {
                        for (int var56 = 0; var56 <= class112.field1621; var56++) {
                            var12[var50][var56] = class520.method3024(var43, var39 + var50, var40 + var56, arg0, -29920);
                        }
                    }
                    class707.field9826[var43].method1688(0, 0, 1024, var39, var40, var41, var42, var12);
                    if (!class746.field10432) {
                        for (int var51 = -4; var51 < class112.field1621; var51++) {
                            for (int var52 = -4; var52 < class112.field1621; var52++) {
                                int var53 = var13 + var51;
                                int var54 = var36 + var52;
                                if (var53 >= var3 && var4 <= var54 && class520.method3024(var43, var53, var54, arg0, arg1 ^ 0xFFFF8B24)) {
                                    int var55 = var43;
                                    if (class99.method797(var54, 1, var53)) {
                                        var55 = var43 - 1;
                                    }
                                    if (var55 >= 0) {
                                        class94.method767(var55, var9, var10, (byte) 114, var54, var53, arg2, var38 + ((class112.field1621 - var52) * 4) - 4, var51 * 4 + var37);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class746.field10432) {
                    class405 var44 = class526.field7350[arg0];
                    for (int var45 = 0; var45 < class112.field1621; var45++) {
                        for (int var46 = 0; var46 < class112.field1621; var46++) {
                            int var47 = var13 + var45;
                            int var48 = var36 + var46;
                            int var49 = var44.field5137[var47 - var44.field5131][var48 - var44.field5122];
                            if ((var49 & 0x40240000) != 0) {
                                arg2.method544(-1713569622, 4, var45 * 4 + var37, 18553, 4, (class112.field1621 - var46) * 4 + var38 - 4);
                            } else if ((var49 & 0x800000) != 0) {
                                arg2.method439((class112.field1621 - var46) * 4 + var38 - 4, var37 - -(var45 * 4), 4, true, -1713569622);
                            } else if ((var49 & 0x2000000) != 0) {
                                arg2.method441(4, var45 * 4 + var37 + 3, -1713569622, (class112.field1621 - var46) * 4 + var38 - 4, -22315);
                            } else if ((var49 & 0x8000000) != 0) {
                                arg2.method439((class112.field1621 - var46) * 4 + var38 - 1, var37 - -(var45 * 4), 4, true, -1713569622);
                            } else if ((var49 & 0x20000000) != 0) {
                                arg2.method441(4, var45 * 4 + var37, -1713569622, var38 + ((class112.field1621 - var46) * 4) - 4, -22315);
                            }
                        }
                    }
                }
                arg2.method528(var37, var38, class112.field1621 * 4, class112.field1621 * 4, var11, 2);
                class582.field8137.method154((var13 - var3) * 4 + 48, -((-var4 + var36) * 4) + -(class112.field1621 * 4) + 464, class112.field1621 * 4, class112.field1621 * 4, var37, var38);
            }
        }
        arg2.method446();
        arg2.method462(-16777215);
        class433.method2476(-100);
        class412.field5240 = 0;
        class82.field1120.method3668(0);
        if (!class746.field10432) {
            for (int var14 = var3; var14 < (var3 + 104); var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg0; arg0 + 1 >= var21 && var21 <= 3; var21++) {
                        if (class520.method3024(var21, var14, var20, arg0, -29920)) {
                            class457 var22 = (class457) class146.method1046(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class457) class290.method1735(var21, var14, var20, field8787 == null ? (field8787 = method3574("rca")) : field8787);
                            }
                            if (var22 == null) {
                                var22 = (class457) class527.method3046(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class457) class67.method624(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class543 var23 = client.field3995.method3384(var22.method745((byte) -89), false);
                                if (!var23.field7577 || class258.field3268) {
                                    int var24 = var23.field7546;
                                    if (var23.field7541 != null) {
                                        for (int var25 = 0; var25 < var23.field7541.length; var25++) {
                                            if (var23.field7541[var25] != -1) {
                                                class543 var26 = client.field3995.method3384(var23.field7541[var25], false);
                                                if (var26.field7546 >= 0) {
                                                    var24 = var26.field7546;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class278 var28 = class424.field5399.method3085((byte) -122, var24);
                                            if (var28 != null && var28.field3521) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class526.field7350[var21].field5137;
                                            int var32 = class526.field7350[var21].field5131;
                                            int var33 = class526.field7350[var21].field5122;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var29 > var3 && var14 - 3 < var29 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var29 < (var3 + 104 - 1) && var29 < var14 + 3 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var30 > var4 && var30 > (var20 - 3) && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var4 + 104 - 1 > var30 && var20 + 3 > var30 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class327.field4197[class412.field5240] = var23.field7586;
                                        class263.field3315[class412.field5240] = var29;
                                        class630.field8702[class412.field5240] = var30;
                                        class412.field5240++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class583.field8162 != null) {
                class531.field7380.field7631 = 1;
                class424.field5399.method3080(64, (byte) 78, 1024);
                for (int var15 = 0; var15 < class583.field8162.field1068; var15++) {
                    int var16 = class583.field8162.field1067[var15];
                    if (var16 >> 28 == class380.field4847.field5796) {
                        int var17 = (var16 >> 14 & 0x3FFF) - class332.field4232;
                        int var18 = (var16 & 0x3FFF) - class447.field5936;
                        if (var17 >= 0 && var17 < class409.field5183 && var18 >= 0 && var18 < class543.field7597) {
                            class82.field1120.method3671(new class393(var15), false);
                        } else {
                            class278 var19 = class424.field5399.method3085((byte) -122, class583.field8162.field1069[var15]);
                            if (var19.field3487 != null && (var17 + var19.field3536) >= 0 && var19.field3494 + var17 < class409.field5183 && (var19.field3497 + var18) >= 0 && class543.field7597 > (var19.field3513 + var18)) {
                                class82.field1120.method3671(new class393(var15), false);
                            }
                        }
                    }
                }
                class424.field5399.method3080(64, (byte) 78, 128);
                class531.field7380.field7631 = 2;
                class531.field7380.method3163(-100);
            }
        }
        return true;
    }
}
