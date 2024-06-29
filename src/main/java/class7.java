import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class7 {

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "[I")
    public static int[] field95 = new int[5];

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field91 = 0;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field90 = 5063219;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "Lcf;")
    public static class93 field93 = class147.method1066("Lade Wordpack )2 ", -48);

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "Lcf;")
    public static class93 field96 = class147.method1066("<col=ffffff> )4 ", -48);

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "Lcf;")
    public static class93 field100 = class147.method1066("<img=1>", -48);

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZI)V")
    public static final void method29(boolean arg0, int arg1) {
        field92++;
        if (arg1 == -1 || !class205.field3690[arg1]) {
            return;
        }
        class264.field4714.method1292(arg0, arg1);
        if (class6.field82[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class6.field82[arg1].length; var3++) {
            if (class6.field82[arg1][var3] != null) {
                if (class6.field82[arg1][var3].field3289 == 2) {
                    var2 = false;
                } else {
                    class6.field82[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class6.field82[arg1] = null;
        }
        class205.field3690[arg1] = false;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I[B)Lvh;")
    public static final class274 method30(int arg0, byte[] arg1) {
        int var2 = 90 / ((arg0 - 27) / 33);
        field97++;
        if (arg1 == null) {
            return null;
        } else {
            class221 var3 = new class221(arg1, class169.field2974, class67.field1230, class246.field4435, class42.field663, class255.field4614);
            class50.method276((byte) 120);
            return var3;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
    public static void method31(byte arg0) {
        field93 = null;
        field95 = null;
        field96 = null;
        field100 = null;
        if (arg0 != 26) {
            method33(false, -83, 107);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class268.field4769 == 0) {
            int var7 = class231.field4134;
            int var8 = class14.field169;
            int var9 = class216.field3931;
            int var10 = class204.field3685;
            int var11 = (var9 - var7) * (arg6 - arg1) / arg5 + var7;
            int var12 = (arg0 - arg2) * (var10 - var8) / arg3 + var8;
            if (class263.field4695 && (class210.field3799 & 0x40) != 0) {
                class181 var13 = class5.method21(class16.field229, class255.field4611, (byte) 40);
                if (var13 == null) {
                    class117.method869(64);
                } else {
                    class144.method1042((short) 48, 0L, class54.field888, class153.field2683, true, var12, class19.field260, var11);
                }
            } else {
                class74.field1349++;
                if (class78.field1460 == 1) {
                    class144.method1042((short) 26, 0L, -1, class8.field109, true, var12, class178.field3144, var11);
                }
                class144.method1042((short) 42, 0L, -1, class61.field1032, true, var12, class178.field3144, var11);
            }
        }
        long var14 = -1L;
        if (arg4 != 45) {
            field91 = -46;
        }
        for (int var16 = 0; var16 < class273.field4854; var16++) {
            long var17 = class283.field5083[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = ((int) var17 & 0x3FA3) >> 7;
            int var21 = (int) var17 >> 29 & 0x3;
            int var22 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            if (var14 != var17) {
                var14 = var17;
                if (var21 == 2 && class207.method1464(class138.field2405, var19, var20, var17)) {
                    class240 var23 = class34.method197(arg4 - 169, var22);
                    if (var23.field4275 != null) {
                        var23 = var23.method1631(0);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class268.field4769 == 1) {
                        class198.field3600++;
                        class144.method1042((short) 36, var17, class220.field3994, class156.field2768, true, var20, class130.method949((byte) -77, new class93[] { class97.field1738, class220.field3992, var23.field4333 }), var19);
                    } else if (class263.field4695) {
                        class131 var28 = field102 == -1 ? null : class30.method176(7255, field102);
                        if ((class210.field3799 & 0x4) != 0 && (var28 == null || var23.method1639(var28.field2320, 7, field102) != var28.field2320)) {
                            class248.field4474++;
                            class144.method1042((short) 5, var17, class54.field888, class153.field2683, true, var20, class130.method949((byte) -77, new class93[] { class66.field1206, class220.field3992, var23.field4333 }), var19);
                        }
                    } else {
                        class196.field3584++;
                        class93[] var24 = var23.field4331;
                        if (class168.field2959) {
                            var24 = class157.method1123(var24, true);
                        }
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    int var26 = -1;
                                    if (var23.field4308 == var25) {
                                        var26 = var23.field4334;
                                    }
                                    short var27 = 0;
                                    class156.field2741++;
                                    if (var25 == 0) {
                                        var27 = 13;
                                    }
                                    if (var25 == 1) {
                                        var27 = 7;
                                    }
                                    if (var23.field4324 == var25) {
                                        var26 = var23.field4304;
                                    }
                                    if (var25 == 2) {
                                        var27 = 22;
                                    }
                                    if (var25 == 3) {
                                        var27 = 32;
                                    }
                                    if (var25 == 4) {
                                        var27 = 1003;
                                    }
                                    class144.method1042(var27, var17, var26, var24[var25], true, var20, class130.method949((byte) -77, new class93[] { class188.field3461, var23.field4333 }), var19);
                                }
                            }
                        }
                        class144.method1042((short) 1004, (long) var23.field4318, class126.field2237, class266.field4735, true, var20, class130.method949((byte) -77, new class93[] { class188.field3461, var23.field4333 }), var19);
                    }
                }
                if (var21 == 1) {
                    class227 var29 = class155.field2709[var22];
                    if ((var29.field4062.field2504 & 0x1) == 0 && (var29.field3868 & 0x7F) == 0 && (var29.field3784 & 0x7F) == 0 || (var29.field4062.field2504 & 0x1) == 1 && (var29.field3868 & 0x7F) == 64 && (var29.field3784 & 0x7F) == 64) {
                        int var30 = var29.field3868 + 64 - (var29.field4062.field2504 * 64);
                        int var31 = var29.field3784 + 64 - (var29.field4062.field2504 * 64);
                        for (int var32 = 0; var32 < class72.field1299; var32++) {
                            class227 var37 = class155.field2709[class58.field995[var32]];
                            if (var37 != null && !var37.field3834 && var29 != var37 && var37.field3801) {
                                int var38 = var37.field3784 - (var37.field4062.field2504 - 1) * 64;
                                int var39 = var37.field3868 + 64 - (var37.field4062.field2504 * 64);
                                if (var30 <= var39 && var29.field4062.field2504 - (var39 - var30 >> 7) >= var37.field4062.field2504 && var31 <= var38 && var37.field4062.field2504 <= (var29.field4062.field2504 - (var38 - var31 >> 7))) {
                                    class224.method1553(var37.field4062, var19, var20, class58.field995[var32], 118);
                                    var37.field3834 = true;
                                }
                            }
                        }
                        for (int var33 = 0; var33 < class252.field4543; var33++) {
                            class237 var34 = class224.field4031[class234.field4166[var33]];
                            if (var34 != null && !var34.field3834 && var34.field3801) {
                                int var35 = var34.field3868 + 64 - (var34.method1475(false) * 64);
                                int var36 = var34.field3784 - ((var34.method1475(false) - 1) * 64);
                                if (var30 <= var35 && var34.method1475(false) <= (var29.field4062.field2504 - (var35 - var30 >> 7)) && var36 >= var31 && var34.method1475(false) <= (var29.field4062.field2504 - (var36 - var31 >> 7))) {
                                    class69.method466(22, class234.field4166[var33], var19, var20, var34);
                                    var34.field3834 = true;
                                }
                            }
                        }
                    }
                    if (var29.field3834) {
                        continue;
                    }
                    class224.method1553(var29.field4062, var19, var20, var22, -114);
                    var29.field3834 = true;
                }
                if (var21 == 0) {
                    class237 var40 = class224.field4031[var22];
                    if ((var40.field3868 & 0x7F) == 64 && (var40.field3784 & 0x7F) == 64) {
                        int var41 = var40.field3868 - (var40.method1475(false) * 64 - 64);
                        int var42 = var40.field3784 - ((var40.method1475(false) - 1) * 64);
                        for (int var43 = 0; var43 < class72.field1299; var43++) {
                            class227 var48 = class155.field2709[class58.field995[var43]];
                            if (var48 != null && !var48.field3834 && var48.field3801) {
                                int var49 = -(var48.field4062.field2504 * 64) - (-var48.field3868 - 64);
                                int var50 = var48.field3784 - ((var48.field4062.field2504 - 1) * 64);
                                if (var49 >= var41 && var48.field4062.field2504 <= (var40.method1475(false) - (var49 - var41 >> 7)) && var50 >= var42 && var48.field4062.field2504 <= var40.method1475(false) - (var50 - var42 >> 7)) {
                                    class224.method1553(var48.field4062, var19, var20, class58.field995[var43], -107);
                                    var48.field3834 = true;
                                }
                            }
                        }
                        for (int var44 = 0; var44 < class252.field4543; var44++) {
                            class237 var45 = class224.field4031[class234.field4166[var44]];
                            if (var45 != null && !var45.field3834 && var40 != var45 && var45.field3801) {
                                int var46 = var45.field3868 - ((var45.method1475(false) - 1) * 64);
                                int var47 = var45.field3784 + 64 - var45.method1475(false) * 64;
                                if (var41 <= var46 && var45.method1475(false) <= (var40.method1475(false) - (var46 - var41 >> 7)) && var42 <= var47 && var45.method1475(false) <= (var40.method1475(false) - (var47 - var42 >> 7))) {
                                    class69.method466(34, class234.field4166[var44], var19, var20, var45);
                                    var45.field3834 = true;
                                }
                            }
                        }
                    }
                    if (var40.field3834) {
                        continue;
                    }
                    class69.method466(68, var22, var19, var20, var40);
                    var40.field3834 = true;
                }
                if (var21 == 3) {
                    class160 var51 = class109.field1858[class138.field2405][var19][var20];
                    if (var51 != null) {
                        for (class51 var52 = (class51) var51.method1161(-1059); var52 != null; var52 = (class51) var51.method1157(true)) {
                            int var53 = var52.field835.field4032;
                            class29 var54 = class89.method617(var53, arg4 ^ 0x2D);
                            if (class268.field4769 == 1) {
                                class144.method1042((short) 12, (long) var53, class220.field3994, class156.field2768, true, var20, class130.method949((byte) -77, new class93[] { class97.field1738, class218.field3965, var54.field357 }), var19);
                                class69.field1264++;
                            } else if (class263.field4695) {
                                class131 var55 = field102 == -1 ? null : class30.method176(7255, field102);
                                if ((class210.field3799 & 0x1) != 0 && (var55 == null || var54.method161(0, var55.field2320, field102) != var55.field2320)) {
                                    class144.method1042((short) 15, (long) var53, class54.field888, class153.field2683, true, var20, class130.method949((byte) -77, new class93[] { class66.field1206, class218.field3965, var54.field357 }), var19);
                                    class67.field1228++;
                                }
                            } else {
                                class204.field3679++;
                                class93[] var56 = var54.field383;
                                if (class168.field2959) {
                                    var56 = class157.method1123(var56, true);
                                }
                                for (int var57 = 4; var57 >= 0; var57--) {
                                    if (var56 != null && var56[var57] != null) {
                                        byte var58 = 0;
                                        class26.field344++;
                                        int var59 = -1;
                                        if (var57 == 0) {
                                            var58 = 16;
                                        }
                                        if (var57 == 1) {
                                            var58 = 45;
                                        }
                                        if (var57 == 2) {
                                            var58 = 2;
                                        }
                                        if (var57 == 3) {
                                            var58 = 24;
                                        }
                                        if (var54.field426 == var57) {
                                            var59 = var54.field408;
                                        }
                                        if (var54.field415 == var57) {
                                            var59 = var54.field409;
                                        }
                                        if (var57 == 4) {
                                            var58 = 25;
                                        }
                                        class144.method1042(var58, (long) var53, var59, var56[var57], true, var20, class130.method949((byte) -77, new class93[] { class139.field2414, var54.field357 }), var19);
                                    }
                                }
                                class144.method1042((short) 1006, (long) var53, class126.field2237, class266.field4735, true, var20, class130.method949((byte) -77, new class93[] { class139.field2414, var54.field357 }), var19);
                            }
                        }
                    }
                }
            }
        }
        field94++;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZII)V")
    public static final void method33(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method33(false, 53, -95);
        }
        class212 var3 = class123.method905(-1205364448, 6, arg2);
        var3.method1493(13);
        field98++;
        var3.field3883 = arg1;
    }
}
