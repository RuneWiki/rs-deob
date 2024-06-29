import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public abstract class class393 {

    @OriginalMember(owner = "client!q", name = "a", descriptor = "Lvg;")
    public static class49 field6137 = new class49(5);

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field6138;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field6139;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!q", name = "AA", descriptor = "(I)V")
    public abstract void method515(int arg0);

    @OriginalMember(owner = "client!q", name = "I", descriptor = "(III[I)V")
    public abstract void method509(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)Z")
    public static final boolean method2545(int arg0) throws IOException {
        field6140++;
        if (class499.field7329 == null) {
            return false;
        }
        if (class253.field4038 == null) {
            if (class362.field5725) {
                if (!class499.field7329.method593(1, -119)) {
                    return false;
                }
                class499.field7329.method589(-104, class558.field8066.field96, 1, 0);
                class362.field5725 = false;
                class459.field6872++;
                class622.field8790 = 0;
            }
            class558.field8066.field57 = 0;
            if (class558.field8066.method3408((byte) -125)) {
                if (!class499.field7329.method593(1, -122)) {
                    return false;
                }
                class499.field7329.method589(-114, class558.field8066.field96, 1, 1);
                class622.field8790 = 0;
                class459.field6872++;
            }
            class362.field5725 = true;
            class158[] var1 = class658.method3780((byte) -3);
            int var2 = class558.field8066.method3399((byte) 0);
            if (var2 < 0 || var2 >= var1.length) {
                throw new IOException("invo:" + var2 + " ip:" + class558.field8066.field57);
            }
            class253.field4038 = var1[var2];
            class344.field5550 = class253.field4038.field2697;
        }
        if (class344.field5550 == -1) {
            if (!class499.field7329.method593(1, -119)) {
                return false;
            }
            class499.field7329.method589(66, class558.field8066.field96, 1, 0);
            class622.field8790 = 0;
            class459.field6872++;
            class344.field5550 = class558.field8066.field96[0] & 0xFF;
        }
        if (class344.field5550 == -2) {
            if (!class499.field7329.method593(2, -117)) {
                return false;
            }
            class499.field7329.method589(62, class558.field8066.field96, 2, 0);
            class558.field8066.field57 = 0;
            class344.field5550 = class558.field8066.method67(12021);
            class622.field8790 = 0;
            class459.field6872 += 2;
        }
        if (class344.field5550 > 0) {
            if (!class499.field7329.method593(class344.field5550, -128)) {
                return false;
            }
            class558.field8066.field57 = 0;
            class499.field7329.method589(-13, class558.field8066.field96, class344.field5550, 0);
            class622.field8790 = 0;
            class459.field6872 += class344.field5550;
        }
        class437.field6668 = class11.field179;
        class11.field179 = class17.field302;
        class17.field302 = class253.field4038;
        int var3 = 10 % ((50 - arg0) / 61);
        if (class390.field6044 == class253.field4038) {
            class618.field8748 = class558.field8066.method31(-97) << 3;
            class371.field5822 = class558.field8066.method77((byte) -55);
            class211.field3512 = class558.field8066.method31(-99) << 3;
            for (class138 var4 = (class138) class290.field4590.method1556(117); var4 != null; var4 = (class138) class290.field4590.method1559(81)) {
                int var6 = (int) (var4.field844 >> 28 & 0x3L);
                int var7 = (int) (var4.field844 & 0x3FFFL);
                int var8 = var7 - class612.field8702;
                int var9 = (int) (var4.field844 >> 14 & 0x3FFFL);
                int var10 = var9 - class626.field8855;
                if (class371.field5822 == var6 && var8 >= class618.field8748 && var8 < (class618.field8748 + 8) && var10 >= class211.field3512 && (class211.field3512 + 8) > var10) {
                    var4.method707((byte) -9);
                    if (var8 >= 0 && var10 >= 0 && var8 < class275.field4426 && class417.field6374 > var10) {
                        class399.method2569(class371.field5822, false, var8, var10);
                    }
                }
            }
            for (class640 var5 = (class640) class580.field8270.method3465((byte) -54); var5 != null; var5 = (class640) class580.field8270.method3469(0)) {
                if (class618.field8748 <= var5.field8975 && var5.field8975 < (class618.field8748 + 8) && class211.field3512 <= var5.field8980 && (class211.field3512 + 8) > var5.field8980 && class371.field5822 == var5.field8972) {
                    var5.field8983 = 0;
                }
            }
            class253.field4038 = null;
            return true;
        } else if (class78.field981 == class253.field4038) {
            class93.method903(class458.field6851, false);
            class253.field4038 = null;
            return true;
        } else if (class418.field6400 == class253.field4038) {
            String var11 = class558.field8066.method42((byte) -95);
            String var12 = class333.method2311((byte) -59, class35.method468(false, class558.field8066));
            class247.method1763(var11, var11, var12, false, 0, 6, var11);
            class253.field4038 = null;
            return true;
        } else if (class469.field6953 == class253.field4038) {
            while (class558.field8066.field57 < class344.field5550) {
                boolean var23 = class558.field8066.method70(-9059) == 1;
                String var24 = class558.field8066.method42((byte) -21);
                String var25 = class558.field8066.method42((byte) -71);
                int var26 = class558.field8066.method67(12021);
                int var27 = class558.field8066.method70(-9059);
                String var28 = "";
                boolean var29 = false;
                if (var26 > 0) {
                    var28 = class558.field8066.method42((byte) -48);
                    var29 = class558.field8066.method70(-9059) == 1;
                }
                for (int var30 = 0; var30 < class204.field3334; var30++) {
                    if (var23) {
                        if (var25.equals(class527.field7700[var30])) {
                            class527.field7700[var30] = var24;
                            class20.field328[var30] = var25;
                            var24 = null;
                            break;
                        }
                    } else if (var24.equals(class527.field7700[var30])) {
                        if (class185.field3113[var30] != var26) {
                            boolean var31 = true;
                            for (class126 var32 = (class126) class397.field6156.method2754((byte) 114); var32 != null; var32 = (class126) class397.field6156.method2759(1486415172)) {
                                if (var32.field2061.equals(var24)) {
                                    if (var26 != 0 && var32.field2065 == 0) {
                                        var32.method2648((byte) -25);
                                        var31 = false;
                                    } else if (var26 == 0 && var32.field2065 != 0) {
                                        var32.method2648((byte) -25);
                                        var31 = false;
                                    }
                                }
                            }
                            if (var31) {
                                class397.field6156.method2757(new class126(var24, var26), -1);
                            }
                            class185.field3113[var30] = var26;
                        }
                        class20.field328[var30] = var25;
                        class124.field2048[var30] = var28;
                        class46.field623[var30] = var27;
                        class322.field5038[var30] = var29;
                        var24 = null;
                        break;
                    }
                }
                if (var24 != null && class204.field3334 < 200) {
                    class527.field7700[class204.field3334] = var24;
                    class20.field328[class204.field3334] = var25;
                    class185.field3113[class204.field3334] = var26;
                    class124.field2048[class204.field3334] = var28;
                    class46.field623[class204.field3334] = var27;
                    class322.field5038[class204.field3334] = var29;
                    class204.field3334++;
                }
            }
            class538.field7861 = 2;
            class292.field4608 = class79.field997;
            boolean var13 = false;
            int var14 = class204.field3334;
            while (var14 > 0) {
                boolean var15 = true;
                var14--;
                for (int var16 = 0; var16 < var14; var16++) {
                    if (class185.field3113[var16] != class221.field3591.field6971 && class185.field3113[var16 + 1] == class221.field3591.field6971 || class185.field3113[var16] == 0 && class185.field3113[var16 + 1] != 0) {
                        int var17 = class185.field3113[var16];
                        class185.field3113[var16] = class185.field3113[var16 + 1];
                        class185.field3113[var16 + 1] = var17;
                        String var18 = class124.field2048[var16];
                        class124.field2048[var16] = class124.field2048[var16 + 1];
                        class124.field2048[var16 + 1] = var18;
                        String var19 = class527.field7700[var16];
                        class527.field7700[var16] = class527.field7700[var16 + 1];
                        class527.field7700[var16 + 1] = var19;
                        String var20 = class20.field328[var16];
                        class20.field328[var16] = class20.field328[var16 + 1];
                        class20.field328[var16 + 1] = var20;
                        int var21 = class46.field623[var16];
                        class46.field623[var16] = class46.field623[var16 + 1];
                        class46.field623[var16 + 1] = var21;
                        boolean var22 = class322.field5038[var16];
                        class322.field5038[var16] = class322.field5038[var16 + 1];
                        class322.field5038[var16 + 1] = var22;
                        var15 = false;
                    }
                }
                if (var15) {
                    break;
                }
            }
            class253.field4038 = null;
            return true;
        } else if (class504.field7377 == class253.field4038) {
            String var33 = class558.field8066.method42((byte) -83);
            boolean var34 = class558.field8066.method70(-9059) == 1;
            String var35;
            if (var34) {
                var35 = class558.field8066.method42((byte) -97);
            } else {
                var35 = var33;
            }
            int var36 = class558.field8066.method67(12021);
            byte var37 = class558.field8066.method81(true);
            boolean var38 = false;
            if (var37 == -128) {
                var38 = true;
            }
            if (var38) {
                if (class307.field4836 == 0) {
                    class253.field4038 = null;
                    return true;
                }
                boolean var39 = false;
                int var40;
                for (var40 = 0; class307.field4836 > var40 && (!class92.field1171[var40].field3588.equals(var35) || class92.field1171[var40].field3587 != var36); var40++) {
                }
                if (class307.field4836 > var40) {
                    while (var40 < class307.field4836 - 1) {
                        class92.field1171[var40] = class92.field1171[var40 + 1];
                        var40++;
                    }
                    class307.field4836--;
                    class92.field1171[class307.field4836] = null;
                }
            } else {
                String var41 = class558.field8066.method42((byte) -33);
                class221 var42 = new class221();
                var42.field3588 = var35;
                var42.field3594 = var33;
                var42.field3593 = class321.method2179(-2081246228, var42.field3588);
                var42.field3596 = var41;
                var42.field3590 = var37;
                var42.field3587 = var36;
                int var43;
                for (var43 = class307.field4836 - 1; var43 >= 0; var43--) {
                    int var44 = class92.field1171[var43].field3593.compareTo(var42.field3593);
                    if (var44 == 0) {
                        class92.field1171[var43].field3587 = var36;
                        class92.field1171[var43].field3590 = var37;
                        class92.field1171[var43].field3596 = var41;
                        if (var35.equals(class567.field8141.field4792)) {
                            class191.field3164 = var37;
                        }
                        class253.field4038 = null;
                        class122.field2036 = class79.field997;
                        return true;
                    }
                    if (var44 < 0) {
                        break;
                    }
                }
                if (class307.field4836 >= class92.field1171.length) {
                    class253.field4038 = null;
                    return true;
                }
                for (int var45 = class307.field4836 - 1; var45 > var43; var45--) {
                    class92.field1171[var45 + 1] = class92.field1171[var45];
                }
                if (class307.field4836 == 0) {
                    class92.field1171 = new class221[100];
                }
                class92.field1171[var43 + 1] = var42;
                class307.field4836++;
                if (var35.equals(class567.field8141.field4792)) {
                    class191.field3164 = var37;
                }
            }
            class122.field2036 = class79.field997;
            class253.field4038 = null;
            return true;
        } else if (class546.field7941 == class253.field4038) {
            int var46 = class558.field8066.method37(4);
            int var47 = class558.field8066.method68(12513);
            if (class299.method2070((byte) 89, var47)) {
                class139.method1189(0, var46, class114.field1793, 5, -6194);
            }
            class253.field4038 = null;
            return true;
        } else if (class689.field9668 == class253.field4038) {
            int var48 = class558.field8066.method67(12021);
            int var49 = class558.field8066.method77((byte) -69);
            boolean var50 = (var49 & 0x1) == 1;
            class592.method3457(true, var48, var50);
            class356.field5689[class453.method2846(class529.field7710++, 31)] = var48;
            class253.field4038 = null;
            return true;
        } else if (class369.field5785 == class253.field4038) {
            boolean var51 = class558.field8066.method70(-9059) == 1;
            byte[] var52 = new byte[class344.field5550 - 1];
            class558.field8066.method50(var52, 0, class344.field5550 - 1, (byte) 19);
            class520.method3133(var52, var51, 10);
            class253.field4038 = null;
            return true;
        } else if (class610.field8671 == class253.field4038) {
            class328.method2209((byte) 54, class558.field8066, class344.field5550);
            class253.field4038 = null;
            return true;
        } else if (class396.field6151 == class253.field4038) {
            int var53 = class558.field8066.method67(12021);
            if (class299.method2070((byte) 84, var53)) {
                class375.method2467((byte) 85);
            }
            class253.field4038 = null;
            return true;
        } else if (class566.field8128 == class253.field4038) {
            String var54 = class558.field8066.method42((byte) -56);
            int var55 = class558.field8066.method78(true);
            int var56 = class558.field8066.method39((byte) 125);
            if (class299.method2070((byte) 47, var56)) {
                class347.method2344((byte) 121, var54, var55);
            }
            class253.field4038 = null;
            return true;
        } else if (class567.field8136 == class253.field4038) {
            int var57 = class558.field8066.method37(4);
            int var58 = class558.field8066.method68(12513);
            int var59 = class558.field8066.method68(12513);
            int var60 = class558.field8066.method78(true);
            int var61 = class558.field8066.method68(12513);
            if (class299.method2070((byte) 9, var60)) {
                class139.method1189(var58, var57, var59 << 16 | var61, 7, -6194);
            }
            class253.field4038 = null;
            return true;
        } else if (class268.field4353 == class253.field4038) {
            class93.method903(class39.field528, false);
            class253.field4038 = null;
            return true;
        } else if (class497.field7258 == class253.field4038) {
            class93.method903(class499.field7320, false);
            class253.field4038 = null;
            return true;
        } else if (class589.field8362 == class253.field4038) {
            int var62 = class558.field8066.method72(-43);
            class578.field8243 = class402.field6207.method3183((byte) 115, var62);
            class253.field4038 = null;
            return true;
        } else if (class253.field4038 == class232.field3689) {
            int var63 = class558.field8066.method37(4);
            int var64 = class558.field8066.method39((byte) 126);
            int var65 = class558.field8066.method67(12021);
            int var66 = class558.field8066.method75(-119);
            int var67 = class558.field8066.method67(12021);
            boolean var68 = (var66 & 0x80) != 0;
            if (var63 >> 30 != 0) {
                int var69 = var63 >> 28 & 0x3;
                int var70 = (var63 >> 14 & 0x3FFF) - class612.field8702;
                int var71 = (var63 & 0x3FFF) - class626.field8855;
                if (var70 >= 0 && var71 >= 0 && class275.field4426 > var70 && var71 < class417.field6374) {
                    int var72 = var70 * 512 + 256;
                    int var73 = var71 * 512 + 256;
                    int var74 = var69;
                    if (var69 < 3 && class437.method2774(true, var70, var71)) {
                        var74 = var69 + 1;
                    }
                    class370 var75 = new class370(var64, 0, class562.field8084, var69, var74, var72, class202.method1568(var72, var69, var73, 2) - var67, var73, var70, var70, var71, var71, var66 & 0x7);
                    class597.field8462.method3463((byte) -87, new class327(var75));
                }
            } else if ((var63 >> 29) != 0) {
                int var76 = var63 & 0xFFFF;
                class348 var77 = (class348) class592.field8395.method1558((long) var76, (byte) -93);
                if (var77 != null) {
                    if (var64 == 65535) {
                        var64 = -1;
                    }
                    class589 var78 = var77.field5577;
                    boolean var79 = true;
                    int var80 = var68 ? var78.field4170 : var78.field4220;
                    if (var64 != -1 && var80 != -1) {
                        if (var64 == var80) {
                            class578 var85 = class65.field826.method3686(false, var64);
                            if (var85.field8230 && var85.field8241 != -1) {
                                class428 var86 = class636.field8942.method2872((byte) 11, var85.field8241);
                                int var87 = var86.field6513;
                                if (var87 == 0 || var87 == 2) {
                                    var79 = false;
                                } else if (var87 == 1) {
                                    var79 = true;
                                }
                            }
                        } else {
                            class578 var81 = class65.field826.method3686(false, var64);
                            class578 var82 = class65.field826.method3686(false, var80);
                            if (var81.field8241 != -1 && var82.field8241 != -1) {
                                class428 var83 = class636.field8942.method2872((byte) 11, var81.field8241);
                                class428 var84 = class636.field8942.method2872((byte) 11, var82.field8241);
                                if (var84.field6527 > var83.field6527) {
                                    var79 = false;
                                }
                            }
                        }
                    }
                    if (var79) {
                        if (var68) {
                            var78.field4238 = var67;
                            var78.field4153 = 0;
                            var78.field4254 = class562.field8084 + var65;
                            var78.field4158 = 1;
                            var78.field4230 = var66 & 0x7;
                            var78.field4165 = 0;
                            var78.field4170 = var64;
                            if (var78.field4254 > class562.field8084) {
                                var78.field4153 = -1;
                            }
                            if (var78.field4170 != -1 && class562.field8084 == var78.field4254) {
                                int var90 = class65.field826.method3686(false, var78.field4170).field8241;
                                if (var90 != -1) {
                                    class428 var91 = class636.field8942.method2872((byte) 11, var90);
                                    if (var91 != null && var91.field6521 != null && !var78.field4180) {
                                        class216.method1622(0, var78, (byte) -39, var91);
                                    }
                                }
                            }
                        } else {
                            var78.field4193 = class562.field8084 + var65;
                            var78.field4220 = var64;
                            var78.field4234 = 1;
                            var78.field4207 = var67;
                            var78.field4210 = 0;
                            var78.field4240 = 0;
                            var78.field4157 = var66 & 0x7;
                            if (var78.field4193 > class562.field8084) {
                                var78.field4240 = -1;
                            }
                            if (var78.field4220 != -1 && class562.field8084 == var78.field4193) {
                                int var88 = class65.field826.method3686(false, var78.field4220).field8241;
                                if (var88 != -1) {
                                    class428 var89 = class636.field8942.method2872((byte) 11, var88);
                                    if (var89 != null && var89.field6521 != null && !var78.field4180) {
                                        class216.method1622(0, var78, (byte) -83, var89);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if ((var63 >> 28) != 0) {
                int var92 = var63 & 0xFFFF;
                class304 var93;
                if (class114.field1793 == var92) {
                    var93 = class567.field8141;
                } else {
                    var93 = class597.field8465[var92];
                }
                if (var93 != null) {
                    if (var64 == 65535) {
                        var64 = -1;
                    }
                    boolean var94 = true;
                    int var95 = var68 ? var93.field4170 : var93.field4220;
                    if (var64 != -1 && var95 != -1) {
                        if (var64 == var95) {
                            class578 var100 = class65.field826.method3686(false, var64);
                            if (var100.field8230 && var100.field8241 != -1) {
                                class428 var101 = class636.field8942.method2872((byte) 11, var100.field8241);
                                int var102 = var101.field6513;
                                if (var102 == 0 || var102 == 2) {
                                    var94 = false;
                                } else if (var102 == 1) {
                                    var94 = true;
                                }
                            }
                        } else {
                            class578 var96 = class65.field826.method3686(false, var64);
                            class578 var97 = class65.field826.method3686(false, var95);
                            if (var96.field8241 != -1 && var97.field8241 != -1) {
                                class428 var98 = class636.field8942.method2872((byte) 11, var96.field8241);
                                class428 var99 = class636.field8942.method2872((byte) 11, var97.field8241);
                                if (var98.field6527 < var99.field6527) {
                                    var94 = false;
                                }
                            }
                        }
                    }
                    if (var94) {
                        if (var68) {
                            var93.field4254 = class562.field8084 + var65;
                            var93.field4238 = var67;
                            var93.field4165 = 0;
                            var93.field4170 = var64;
                            var93.field4230 = var66 & 0x7;
                            var93.field4158 = 1;
                            var93.field4153 = 0;
                            if (var93.field4170 == 65535) {
                                var93.field4170 = -1;
                            }
                            if (var93.field4254 > class562.field8084) {
                                var93.field4153 = -1;
                            }
                            if (var93.field4170 != -1 && class562.field8084 == var93.field4254) {
                                int var103 = class65.field826.method3686(false, var93.field4170).field8241;
                                if (var103 != -1) {
                                    class428 var104 = class636.field8942.method2872((byte) 11, var103);
                                    if (var104 != null && var104.field6521 != null && !var93.field4180) {
                                        class216.method1622(0, var93, (byte) -67, var104);
                                    }
                                }
                            }
                        } else {
                            var93.field4220 = var64;
                            var93.field4207 = var67;
                            var93.field4157 = var66 & 0x7;
                            var93.field4240 = 0;
                            var93.field4210 = 0;
                            var93.field4193 = class562.field8084 + var65;
                            var93.field4234 = 1;
                            if (var93.field4193 > class562.field8084) {
                                var93.field4240 = -1;
                            }
                            if (var93.field4220 == 65535) {
                                var93.field4220 = -1;
                            }
                            if (var93.field4220 != -1 && class562.field8084 == var93.field4193) {
                                int var105 = class65.field826.method3686(false, var93.field4220).field8241;
                                if (var105 != -1) {
                                    class428 var106 = class636.field8942.method2872((byte) 11, var105);
                                    if (var106 != null && var106.field6521 != null && !var93.field4180) {
                                        class216.method1622(0, var93, (byte) -123, var106);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class253.field4038 = null;
            return true;
        } else if (class85.field1047 == class253.field4038) {
            int var107 = class558.field8066.method72(-67);
            int var108 = class558.field8066.method67(12021);
            String var109 = class558.field8066.method42((byte) -83);
            if (class299.method2070((byte) -114, var108)) {
                class328.method2207((byte) -110, var107, var109);
            }
            class253.field4038 = null;
            return true;
        } else if (class402.field6192 == class253.field4038) {
            class93.method903(class180.field3030, false);
            class253.field4038 = null;
            return true;
        } else if (class253.field4038 == class138.field2337) {
            int var110 = class558.field8066.method67(12021);
            int var111 = class558.field8066.method39((byte) 126);
            if (var111 == 65535) {
                var111 = -1;
            }
            int var112 = class558.field8066.method37(4);
            int var113 = class558.field8066.method30(114);
            if (class299.method2070((byte) 30, var110)) {
                class659.method3782(var111, (byte) 84, var113, var112);
                class117 var114 = class91.field1083.method2859(var111, (byte) 123);
                class290.method2048(8, var114.field1825, var114.field1813, var112, var114.field1886);
                class370.method2441(var114.field1861, var114.field1832, var114.field1874, var112, (byte) -61);
            }
            class253.field4038 = null;
            return true;
        } else if (class432.field6569 == class253.field4038) {
            int var115 = class558.field8066.method39((byte) 127);
            int var116 = class558.field8066.method68(12513);
            if (var116 == 65535) {
                var116 = -1;
            }
            int var117 = class558.field8066.method68(12513);
            if (var117 == 65535) {
                var117 = -1;
            }
            int var118 = class558.field8066.method72(-56);
            int var119 = class558.field8066.method68(12513);
            if (class299.method2070((byte) -90, var115)) {
                for (int var120 = var117; var120 <= var116; var120++) {
                    long var121 = ((long) var118 << 32) + (long) var120;
                    class73 var123 = (class73) class122.field2037.method1558(var121, (byte) -93);
                    class73 var124;
                    if (var123 != null) {
                        var124 = new class73(var123.field919, var119);
                        var123.method707((byte) -45);
                    } else if (var120 == -1) {
                        var124 = new class73(class326.method2197(false, var118).field9280.field919, var119);
                    } else {
                        var124 = new class73(0, var119);
                    }
                    class122.field2037.method1564(var121, var124, (byte) 80);
                }
            }
            class253.field4038 = null;
            return true;
        } else if (class561.field8080 == class253.field4038) {
            if (class476.field7061 != null) {
                class356.method2392(false, -103, -1, class17.field282.field4865, -1);
            }
            byte[] var125 = new byte[class344.field5550];
            class558.field8066.method3406(var125, class344.field5550, 0, -97);
            String var126 = class267.method1897(class344.field5550, 0, var125, 0);
            class2.method9(class402.field6207, (byte) 71, class497.field7259 == 1, var126, true);
            class253.field4038 = null;
            return true;
        } else if (class556.field8033 == class253.field4038) {
            boolean var127 = class558.field8066.method70(-9059) == 1;
            String var128 = class558.field8066.method42((byte) -50);
            String var129 = var128;
            if (var127) {
                var129 = class558.field8066.method42((byte) -45);
            }
            long var130 = class558.field8066.method69(1282265952);
            long var132 = (long) class558.field8066.method67(12021);
            long var134 = (long) class558.field8066.method86(-105);
            int var136 = class558.field8066.method70(-9059);
            int var137 = class558.field8066.method67(12021);
            long var138 = (var132 << 32) + var134;
            boolean var140 = false;
            int var141 = 0;
            while (true) {
                if (var141 >= 100) {
                    if (var136 <= 1 && class661.method3793(var129, (byte) 94)) {
                        var140 = true;
                    }
                    break;
                }
                if (class706.field9995[var141] == var138) {
                    var140 = true;
                    break;
                }
                var141++;
            }
            if (!var140 && class505.field7382 == 0) {
                class706.field9995[class53.field710] = var138;
                class53.field710 = (class53.field710 + 1) % 100;
                String var142 = class139.field2340.method3968(var137, 0).method1310(class558.field8066, -39);
                if (var136 == 2) {
                    class635.method3690("<img=1>" + var128, class683.method3887(var130, 106), var142, 0, var137, -23694, var128, "<img=1>" + var129, 20);
                } else if (var136 == 1) {
                    class635.method3690("<img=0>" + var128, class683.method3887(var130, 126), var142, 0, var137, -23694, var128, "<img=0>" + var129, 20);
                } else {
                    class635.method3690(var128, class683.method3887(var130, 72), var142, 0, var137, -23694, var128, var129, 20);
                }
            }
            class253.field4038 = null;
            return true;
        } else if (class664.field9253 == class253.field4038) {
            class452.method2840(class344.field5550, (byte) 35, class558.field8066, class402.field6207);
            class253.field4038 = null;
            return true;
        } else if (class354.field5636 == class253.field4038) {
            int var143 = class558.field8066.method78(true);
            int var144 = class558.field8066.method33((byte) 99);
            class539.field7869.method3750(var143, 127, var144);
            class253.field4038 = null;
            return true;
        } else if (class659.field9178 == class253.field4038) {
            class93.method903(class70.field891, false);
            class253.field4038 = null;
            return true;
        } else if (class392.field6131 == class253.field4038) {
            int var145 = class558.field8066.method67(12021);
            int var146 = class558.field8066.method70(-9059);
            int var147 = class558.field8066.method70(-9059);
            int var148 = class558.field8066.method67(12021) << 2;
            int var149 = class558.field8066.method70(-9059);
            int var150 = class558.field8066.method70(-9059);
            if (class299.method2070((byte) -106, var145)) {
                class149.method1248(var147, var146, 2, var148, var150, var149);
            }
            class253.field4038 = null;
            return true;
        } else if (class253.field4038 == class10.field177) {
            int var151 = class558.field8066.method39((byte) 126);
            int var152 = class558.field8066.method68(12513);
            int var153 = class558.field8066.method78(true);
            if (class299.method2070((byte) -116, var153)) {
                class453.method2844(var152, var151, true, 0);
            }
            class253.field4038 = null;
            return true;
        } else if (class66.field843 == class253.field4038) {
            int var154 = class558.field8066.method68(12513);
            int var155 = class558.field8066.method39((byte) 126);
            byte var156 = class558.field8066.method85(true);
            if (class299.method2070((byte) -91, var154)) {
                class271.method1910(var155, (byte) 104, var156);
            }
            class253.field4038 = null;
            return true;
        } else if (class331.field5113 == class253.field4038) {
            int var157 = class558.field8066.method39((byte) 124);
            int var158 = class558.field8066.method75(-100);
            int var159 = class558.field8066.method37(4);
            int var160 = class558.field8066.method68(12513);
            if (class299.method2070((byte) 49, var160)) {
                class102 var161 = (class102) class486.field7115.method1558((long) var159, (byte) -93);
                if (var161 != null) {
                    class353.method2370(var161.field1687 != var157, (byte) 0, false, var161);
                }
                class322.method2184(var157, var158, false, var159, 1);
            }
            class253.field4038 = null;
            return true;
        } else if (class498.field7300 == class253.field4038) {
            class93.method903(class147.field2458, false);
            class253.field4038 = null;
            return true;
        } else if (class253.field4038 == class161.field2738) {
            int var162 = class558.field8066.method33((byte) 99);
            int var163 = var162 >> 2;
            int var164 = var162 & 0x3;
            int var165 = class150.field2487[var163];
            int var166 = class558.field8066.method37(4);
            int var167 = var166 >> 28 & 0x3;
            int var168 = (var166 & 0xFFFCC39) >> 14;
            int var169 = var166 & 0x3FFF;
            int var170 = class558.field8066.method78(true);
            int var171 = var168 - class612.field8702;
            int var172 = var169 - class626.field8855;
            if (var170 == 65535) {
                var170 = -1;
            }
            class165.method1335(var171, var163, var170, var172, (byte) 92, var165, var167, var164);
            class253.field4038 = null;
            return true;
        } else if (class473.field6989 == class253.field4038) {
            int var173 = class558.field8066.method68(12513);
            int[] var174 = new int[4];
            for (int var175 = 0; var175 < 4; var175++) {
                var174[var175] = class558.field8066.method39((byte) 125);
            }
            int var176 = class558.field8066.method33((byte) 99);
            class348 var177 = (class348) class592.field8395.method1558((long) var173, (byte) -93);
            if (var177 != null) {
                class411.method2621(var176, false, var177.field5577, var174);
            }
            class253.field4038 = null;
            return true;
        } else if (class478.field7076 == class253.field4038) {
            int var178 = class558.field8066.method67(12021);
            if (var178 == 65535) {
                var178 = -1;
            }
            int var179 = class558.field8066.method70(-9059);
            int var180 = class558.field8066.method67(12021);
            int var181 = class558.field8066.method70(-9059);
            int var182 = class558.field8066.method67(12021);
            class299.method2072(var181, var182, var180, var178, -54, var179, false);
            class253.field4038 = null;
            return true;
        } else if (class475.field7031 == class253.field4038) {
            int var183 = class558.field8066.method67(12021);
            int var184 = class558.field8066.method67(12021);
            int var185 = class558.field8066.method37(4);
            if (class299.method2070((byte) -126, var184)) {
                class320.method2174(var183, var185, (byte) 62);
            }
            class253.field4038 = null;
            return true;
        } else if (class444.field6752 == class253.field4038) {
            class93.method903(class161.field2739, false);
            class253.field4038 = null;
            return true;
        } else if (class640.field8984 == class253.field4038) {
            int var186 = class558.field8066.method67(12021);
            String var187 = class558.field8066.method42((byte) -77);
            Object[] var188 = new Object[var187.length() + 1];
            for (int var189 = var187.length() - 1; var189 >= 0; var189--) {
                if (var187.charAt(var189) == 's') {
                    var188[var189 + 1] = class558.field8066.method42((byte) -95);
                } else {
                    var188[var189 + 1] = Integer.valueOf(class558.field8066.method72(-101));
                }
            }
            var188[0] = Integer.valueOf(class558.field8066.method72(-78));
            if (class299.method2070((byte) -110, var186)) {
                class438 var190 = new class438();
                var190.field6684 = var188;
                class142.method1201(var190);
            }
            class253.field4038 = null;
            return true;
        } else if (class379.field5911 == class253.field4038) {
            int var191 = class558.field8066.method70(-9059);
            if (class558.field8066.method70(-9059) == 0) {
                class668.field9445[var191] = new class83();
            } else {
                class558.field8066.field57--;
                class668.field9445[var191] = new class83(class558.field8066);
            }
            class253.field4038 = null;
            class644.field9059 = class79.field997;
            return true;
        } else if (class335.field5483 == class253.field4038) {
            int var192 = class558.field8066.method67(12021);
            int var193 = class558.field8066.method67(12021);
            int var194 = class558.field8066.method67(12021);
            int var195 = class558.field8066.method67(12021);
            if (class299.method2070((byte) -89, var192) && class564.field8105[var193] != null) {
                for (int var196 = var194; var196 < var195; var196++) {
                    int var197 = class558.field8066.method86(-112);
                    if (var196 < class564.field8105[var193].length && class564.field8105[var193][var196] != null) {
                        class564.field8105[var193][var196].field9413 = var197;
                    }
                }
            }
            class253.field4038 = null;
            return true;
        } else if (class253.field4038 == class206.field3452) {
            boolean var198 = class558.field8066.method70(-9059) == 1;
            int var199 = class558.field8066.method78(true);
            if (class299.method2070((byte) -22, var199)) {
                class48.field646 = var198;
            }
            class253.field4038 = null;
            return true;
        } else if (class47.field635 == class253.field4038) {
            class93.method903(class72.field914, false);
            class253.field4038 = null;
            return true;
        } else if (class413.field6345 == class253.field4038) {
            int var200 = class558.field8066.method72(-52);
            int var201 = class558.field8066.method39((byte) 124);
            int var202 = class558.field8066.method41(61);
            int var203 = class558.field8066.method68(12513);
            if (var203 == 65535) {
                var203 = -1;
            }
            int var204 = class558.field8066.method39((byte) 126);
            if (var204 == 65535) {
                var204 = -1;
            }
            if (class299.method2070((byte) -119, var201)) {
                for (int var205 = var203; var205 <= var204; var205++) {
                    long var206 = ((long) var202 << 32) + (long) var205;
                    class73 var208 = (class73) class122.field2037.method1558(var206, (byte) -93);
                    class73 var209;
                    if (var208 != null) {
                        var209 = new class73(var200, var208.field921);
                        var208.method707((byte) -13);
                    } else if (var205 == -1) {
                        var209 = new class73(var200, class326.method2197(false, var202).field9280.field921);
                    } else {
                        var209 = new class73(var200, -1);
                    }
                    class122.field2037.method1564(var206, var209, (byte) 84);
                }
            }
            class253.field4038 = null;
            return true;
        } else if (class286.field4543 == class253.field4038) {
            class93.method903(class216.field3558, false);
            class253.field4038 = null;
            return true;
        } else if (class56.field728 == class253.field4038) {
            class6.method63(0, class473.field7017);
            class253.field4038 = null;
            return false;
        } else if (class675.field9512 == class253.field4038) {
            int var210 = class558.field8066.method67(12021);
            class304 var211;
            if (class114.field1793 == var210) {
                var211 = class567.field8141;
            } else {
                var211 = class597.field8465[var210];
            }
            if (var211 == null) {
                class253.field4038 = null;
                return true;
            }
            int var212 = class558.field8066.method67(12021);
            int var213 = class558.field8066.method70(-9059);
            boolean var214 = (var212 & 0x8000) != 0;
            if (var211.field4792 != null && var211.field4778 != null) {
                boolean var215 = false;
                if (var213 <= 1) {
                    if (!var214 && (class622.field8788 && !class193.field3197 || class519.field7509)) {
                        var215 = true;
                    } else if (class661.method3793(var211.field4792, (byte) 35)) {
                        var215 = true;
                    }
                }
                if (!var215 && class505.field7382 == 0) {
                    int var216 = -1;
                    String var218;
                    if (var214) {
                        var212 &= 0x7FFF;
                        class706 var217 = class218.method1629(24, class558.field8066);
                        var216 = var217.field9984;
                        var218 = var217.field9989.method1310(class558.field8066, -58);
                    } else {
                        var218 = class333.method2311((byte) -102, class35.method468(false, class558.field8066));
                    }
                    var211.field4182 = var218.trim();
                    var211.field4252 = var212 >> 8;
                    var211.field4246 = 150;
                    var211.field4171 = var212 & 0xFF;
                    int var219;
                    if (var213 == 1 || var213 == 2) {
                        var219 = var214 ? 17 : 1;
                    } else {
                        var219 = var214 ? 17 : 2;
                    }
                    if (var213 == 2) {
                        class635.method3690("<img=1>" + var211.method2111(true, 0), null, var218, 0, var216, -23694, var211.field4759, "<img=1>" + var211.method2105(27069, false), var219);
                    } else if (var213 == 1) {
                        class635.method3690("<img=0>" + var211.method2111(true, 0), null, var218, 0, var216, -23694, var211.field4759, "<img=0>" + var211.method2105(27069, false), var219);
                    } else {
                        class635.method3690(var211.method2111(true, 0), null, var218, 0, var216, -23694, var211.field4759, var211.method2105(27069, false), var219);
                    }
                }
            }
            class253.field4038 = null;
            return true;
        } else if (class626.field8823 == class253.field4038) {
            int var220 = class558.field8066.method33((byte) 99);
            int var221 = class558.field8066.method77((byte) -69);
            int var222 = class558.field8066.method39((byte) 126);
            if (var222 == 65535) {
                var222 = -1;
            }
            class260.method1842(false, var220, var221, var222);
            class253.field4038 = null;
            return true;
        } else if (class288.field4573 == class253.field4038) {
            int var223 = class558.field8066.method43(68);
            int var224 = class558.field8066.method77((byte) -93);
            int var225 = class558.field8066.method68(12513);
            if (var225 == 65535) {
                var225 = -1;
            }
            class691.method3914(var225, var224, var223, 22662);
            class253.field4038 = null;
            return true;
        } else if (class664.field9255 == class253.field4038) {
            int var226 = class558.field8066.method30(126);
            int var227 = class558.field8066.method45(-8652);
            int var228 = class558.field8066.method67(12021);
            if (class299.method2070((byte) -93, var228)) {
                class328.method2208(5, var226, var227);
            }
            class253.field4038 = null;
            return true;
        } else if (class351.field5595 == class253.field4038) {
            class93.method903(class429.field6542, false);
            class253.field4038 = null;
            return true;
        } else if (class609.field8648 == class253.field4038) {
            int var229 = class558.field8066.method67(12021);
            if (var229 == 65535) {
                var229 = -1;
            }
            int var230 = class558.field8066.method70(-9059);
            int var231 = class558.field8066.method67(12021);
            int var232 = class558.field8066.method70(-9059);
            int var233 = class558.field8066.method67(12021);
            class556.method3322(var229, 102, var233, var231, var230, var232);
            class253.field4038 = null;
            return true;
        } else if (class312.field4911 == class253.field4038) {
            int var234 = class558.field8066.method78(true);
            int var235 = class558.field8066.method68(12513);
            if (var235 == 65535) {
                var235 = -1;
            }
            int var236 = class558.field8066.method41(53);
            if (class299.method2070((byte) -115, var234)) {
                class139.method1189(-1, var236, var235, 1, -6194);
            }
            class253.field4038 = null;
            return true;
        } else if (class623.field8793 == class253.field4038) {
            boolean var237 = class558.field8066.method70(-9059) == 1;
            String var238 = class558.field8066.method42((byte) -107);
            String var239 = var238;
            if (var237) {
                var239 = class558.field8066.method42((byte) -55);
            }
            int var240 = class558.field8066.method70(-9059);
            int var241 = class558.field8066.method67(12021);
            boolean var242 = false;
            if (var240 <= 1 && class661.method3793(var239, (byte) 40)) {
                var242 = true;
            }
            if (!var242 && class505.field7382 == 0) {
                String var243 = class139.field2340.method3968(var241, 0).method1310(class558.field8066, -106);
                if (var240 == 2) {
                    class635.method3690("<img=1>" + var238, null, var243, 0, var241, -23694, var238, "<img=1>" + var239, 25);
                } else if (var240 == 1) {
                    class635.method3690("<img=0>" + var238, null, var243, 0, var241, -23694, var238, "<img=0>" + var239, 25);
                } else {
                    class635.method3690(var238, null, var243, 0, var241, -23694, var238, var239, 25);
                }
            }
            class253.field4038 = null;
            return true;
        } else if (class57.field737 == class253.field4038) {
            class253.field4038 = null;
            return false;
        } else if (class534.field7798 == class253.field4038) {
            boolean var244 = class558.field8066.method70(-9059) == 1;
            String var245 = class558.field8066.method42((byte) -60);
            String var246 = var245;
            if (var244) {
                var246 = class558.field8066.method42((byte) -55);
            }
            long var247 = (long) class558.field8066.method67(12021);
            long var249 = (long) class558.field8066.method86(-76);
            int var251 = class558.field8066.method70(-9059);
            int var252 = class558.field8066.method67(12021);
            long var253 = (var247 << 32) + var249;
            boolean var255 = false;
            int var256 = 0;
            while (true) {
                if (var256 >= 100) {
                    if (var251 <= 1 && class661.method3793(var246, (byte) 24)) {
                        var255 = true;
                    }
                    break;
                }
                if (class706.field9995[var256] == var253) {
                    var255 = true;
                    break;
                }
                var256++;
            }
            if (!var255 && class505.field7382 == 0) {
                class706.field9995[class53.field710] = var253;
                class53.field710 = (class53.field710 + 1) % 100;
                String var257 = class139.field2340.method3968(var252, 0).method1310(class558.field8066, 114);
                if (var251 == 2) {
                    class635.method3690("<img=1>" + var245, null, var257, 0, var252, -23694, var245, "<img=1>" + var246, 18);
                } else if (var251 == 1) {
                    class635.method3690("<img=0>" + var245, null, var257, 0, var252, -23694, var245, "<img=0>" + var246, 18);
                } else {
                    class635.method3690(var245, null, var257, 0, var252, -23694, var245, var246, 18);
                }
            }
            class253.field4038 = null;
            return true;
        } else if (class253.field4038 == class146.field2455) {
            int var258 = class558.field8066.method67(12021);
            int var259 = class558.field8066.method70(-9059);
            int var260 = class558.field8066.method70(-9059);
            int var261 = class558.field8066.method67(12021) << 2;
            int var262 = class558.field8066.method70(-9059);
            int var263 = class558.field8066.method70(-9059);
            if (class299.method2070((byte) -100, var258)) {
                class602.method3512(var259, true, var260, -19139, var261, var262, var263);
            }
            class253.field4038 = null;
            return true;
        } else if (class603.field8574 == class253.field4038) {
            int var264 = class558.field8066.method78(true);
            int var265 = class558.field8066.method72(-41);
            if (class299.method2070((byte) 70, var264)) {
                class139.method1189(-1, var265, -1, 3, -6194);
            }
            class253.field4038 = null;
            return true;
        } else if (class253.field4038 == class100.field1649) {
            int var266 = class558.field8066.method37(4);
            int var267 = class558.field8066.method70(-9059);
            int var268 = class558.field8066.method33((byte) 99);
            class475.field7027[var267] = var266;
            class49.field651[var267] = var268;
            class295.field4622[var267] = 1;
            int var269 = class462.field6908[var267] - 1;
            for (int var270 = 0; var270 < var269; var270++) {
                if (var266 >= class149.field2470[var270]) {
                    class295.field4622[var267] = var270 + 2;
                }
            }
            class562.field8090[class453.method2846(class310.field4874++, 31)] = var267;
            class253.field4038 = null;
            return true;
        } else if (class86.field1053 == class253.field4038) {
            int var271 = class558.field8066.method78(true);
            int var272 = class558.field8066.method67(12021);
            int var273 = class558.field8066.method37(4);
            if (class299.method2070((byte) -126, var271)) {
                class208.method1592(var273, var272, -5);
            }
            class253.field4038 = null;
            return true;
        } else if (class330.field5099 == class253.field4038) {
            class669.field9455 = class558.field8066.method70(-9059);
            class158.field2701 = class79.field997;
            class253.field4038 = null;
            return true;
        } else if (class411.field6313 == class253.field4038) {
            class163.method1323(false);
            class253.field4038 = null;
            return false;
        } else if (class572.field8174 == class253.field4038) {
            class22.field345 = class344.field5550 <= 2 ? class122.field1998.method1091(class135.field2206, 1) : class558.field8066.method42((byte) -22);
            class250.field4004 = class344.field5550 <= 0 ? -1 : class558.field8066.method67(12021);
            class253.field4038 = null;
            if (class250.field4004 == 65535) {
                class250.field4004 = -1;
            }
            return true;
        } else if (class86.field1049 == class253.field4038) {
            class218.field3569 = class558.field8066.method45(-8652);
            class253.field4038 = null;
            class158.field2701 = class79.field997;
            return true;
        } else if (class507.field7396 == class253.field4038) {
            int var274 = class558.field8066.method67(12021);
            if (class299.method2070((byte) -88, var274)) {
                class83.method781(54);
            }
            class253.field4038 = null;
            return true;
        } else if (class57.field750 == class253.field4038) {
            class350.method2356(-50, class558.field8066.method42((byte) -115));
            class253.field4038 = null;
            return true;
        } else if (class253.field4038 == class162.field2744) {
            int var275 = class558.field8066.method72(-112);
            int var276 = class558.field8066.method68(12513);
            int var277 = class558.field8066.method67(12021);
            if (class299.method2070((byte) -127, var277)) {
                class371.method2448(var276, var275, -22977);
            }
            class253.field4038 = null;
            return true;
        } else if (class498.field7275 == class253.field4038) {
            int var278 = class558.field8066.method77((byte) -117);
            int var279 = class558.field8066.method77((byte) -94);
            if (var278 == 255) {
                var278 = -1;
                var279 = -1;
            }
            class123.method1098((byte) 88, var278, var279);
            class253.field4038 = null;
            return true;
        } else if (class96.field1531 == class253.field4038) {
            class476.field7054 = class690.method3910((byte) -126, class558.field8066.method70(-9059));
            class253.field4038 = null;
            return true;
        } else if (class602.field8561 == class253.field4038) {
            class122.field2036 = class79.field997;
            if (class344.field5550 == 0) {
                class584.field8306 = null;
                class307.field4836 = 0;
                class92.field1171 = null;
                class145.field2442 = null;
                class253.field4038 = null;
                return true;
            }
            class584.field8306 = class558.field8066.method42((byte) -104);
            boolean var280 = class558.field8066.method70(-9059) == 1;
            if (var280) {
                class558.field8066.method42((byte) -128);
            }
            long var281 = class558.field8066.method69(1282265952);
            class145.field2442 = class357.method2398(var281, -15775);
            class289.field4585 = class558.field8066.method81(true);
            int var283 = class558.field8066.method70(-9059);
            if (var283 == 255) {
                class253.field4038 = null;
                return true;
            }
            class307.field4836 = var283;
            class221[] var284 = new class221[100];
            for (int var285 = 0; var285 < class307.field4836; var285++) {
                var284[var285] = new class221();
                var284[var285].field3594 = class558.field8066.method42((byte) -105);
                boolean var291 = class558.field8066.method70(-9059) == 1;
                if (var291) {
                    var284[var285].field3588 = class558.field8066.method42((byte) -106);
                } else {
                    var284[var285].field3588 = var284[var285].field3594;
                }
                var284[var285].field3593 = class321.method2179(-2081246228, var284[var285].field3588);
                var284[var285].field3587 = class558.field8066.method67(12021);
                var284[var285].field3590 = class558.field8066.method81(true);
                var284[var285].field3596 = class558.field8066.method42((byte) -100);
                if (var284[var285].field3588.equals(class567.field8141.field4792)) {
                    class191.field3164 = var284[var285].field3590;
                }
            }
            boolean var286 = false;
            int var287 = class307.field4836;
            while (var287 > 0) {
                boolean var288 = true;
                var287--;
                for (int var289 = 0; var289 < var287; var289++) {
                    if (var284[var289].field3593.compareTo(var284[var289 + 1].field3593) > 0) {
                        class221 var290 = var284[var289];
                        var284[var289] = var284[var289 + 1];
                        var288 = false;
                        var284[var289 + 1] = var290;
                    }
                }
                if (var288) {
                    break;
                }
            }
            class253.field4038 = null;
            class92.field1171 = var284;
            return true;
        } else if (class253.field4038 == class177.field2888) {
            class6.method63(0, false);
            class253.field4038 = null;
            return false;
        } else if (class342.field5533 == class253.field4038) {
            class192.field3179 = class558.field8066.method32((byte) 52);
            class622.field8788 = class558.field8066.method70(-9059) == 1;
            class253.field4038 = null;
            return true;
        } else if (class276.field4472 == class253.field4038) {
            int var292 = class558.field8066.method30(122);
            int var293 = class558.field8066.method39((byte) 126);
            int var294 = class558.field8066.method67(12021);
            if (class299.method2070((byte) -120, var294)) {
                class271.method1910(var293, (byte) 105, var292);
            }
            class253.field4038 = null;
            return true;
        } else if (class505.field7380 == class253.field4038) {
            int var295 = class558.field8066.method78(true);
            int var296 = class558.field8066.method37(4);
            int var297 = class558.field8066.method39((byte) 127);
            if (var297 == 65535) {
                var297 = -1;
            }
            if (class299.method2070((byte) 109, var295)) {
                class139.method1189(-1, var296, var297, 2, -6194);
            }
            class253.field4038 = null;
            return true;
        } else if (class253.field4038 == class187.field3124) {
            int var298 = class558.field8066.method77((byte) -80);
            int var299 = class558.field8066.method33((byte) 99);
            int var300 = class558.field8066.method39((byte) 125);
            if (var300 == 65535) {
                var300 = -1;
            }
            String var301 = class558.field8066.method42((byte) -78);
            if (var299 >= 1 && var299 <= 8) {
                if (var301.equalsIgnoreCase("null")) {
                    var301 = null;
                }
                class34.field501[var299 - 1] = var301;
                class220.field3581[var299 - 1] = var300;
                class101.field1652[var299 - 1] = var298 == 0;
            }
            class253.field4038 = null;
            return true;
        } else if (class286.field4550 == class253.field4038) {
            class371.field5822 = class558.field8066.method77((byte) -102);
            class211.field3512 = class558.field8066.method48((byte) -118) << 3;
            class618.field8748 = class558.field8066.method31(-113) << 3;
            class253.field4038 = null;
            return true;
        } else if (class253.field4038 == class250.field3994) {
            int var302 = class558.field8066.method41(62);
            int var303 = class558.field8066.method67(12021);
            int var304 = class558.field8066.method37(4);
            if (class299.method2070((byte) -89, var303)) {
                class102 var305 = (class102) class486.field7115.method1558((long) var304, (byte) -93);
                class102 var306 = (class102) class486.field7115.method1558((long) var302, (byte) -93);
                if (var306 != null) {
                    class353.method2370(var305 == null || var305.field1687 != var306.field1687, (byte) 0, false, var306);
                }
                if (var305 != null) {
                    var305.method707((byte) -90);
                    class486.field7115.method1564((long) var302, var305, (byte) 98);
                }
                class665 var307 = class326.method2197(false, var304);
                if (var307 != null) {
                    class362.method2415(-120, var307);
                }
                class665 var308 = class326.method2197(false, var302);
                if (var308 != null) {
                    class362.method2415(-121, var308);
                    class318.method2168((byte) 115, var308, true);
                }
                if (class528.field7706 != -1) {
                    class281.method1994(107, 1, class528.field7706);
                }
            }
            class253.field4038 = null;
            return true;
        } else if (class438.field6671 == class253.field4038) {
            int var309 = class558.field8066.method67(12021);
            int var310 = class558.field8066.method70(-9059);
            boolean var311 = (var310 & 0x1) == 1;
            while (class344.field5550 > class558.field8066.field57) {
                int var312 = class558.field8066.method88((byte) 90);
                int var313 = class558.field8066.method67(12021);
                int var314 = 0;
                if (var313 != 0) {
                    var314 = class558.field8066.method70(-9059);
                    if (var314 == 255) {
                        var314 = class558.field8066.method72(-49);
                    }
                }
                class518.method3128(var311, -126, var313 - 1, var314, var309, var312);
            }
            class356.field5689[class453.method2846(class529.field7710++, 31)] = var309;
            class253.field4038 = null;
            return true;
        } else if (class531.field7740 == class253.field4038) {
            boolean var315 = class558.field8066.method70(-9059) == 1;
            String var316 = class558.field8066.method42((byte) -99);
            String var317 = var316;
            if (var315) {
                var317 = class558.field8066.method42((byte) -123);
            }
            long var318 = (long) class558.field8066.method67(12021);
            long var320 = (long) class558.field8066.method86(-44);
            int var322 = class558.field8066.method70(-9059);
            long var323 = (var318 << 32) + var320;
            boolean var325 = false;
            int var326 = 0;
            while (true) {
                if (var326 >= 100) {
                    if (var322 <= 1) {
                        if (!(!class622.field8788 || class193.field3197) || class519.field7509) {
                            var325 = true;
                        } else if (class661.method3793(var317, (byte) 37)) {
                            var325 = true;
                        }
                    }
                    break;
                }
                if (class706.field9995[var326] == var323) {
                    var325 = true;
                    break;
                }
                var326++;
            }
            if (!var325 && class505.field7382 == 0) {
                class706.field9995[class53.field710] = var323;
                class53.field710 = (class53.field710 + 1) % 100;
                String var327 = class333.method2311((byte) -39, class35.method468(false, class558.field8066));
                if (var322 == 2) {
                    class635.method3690("<img=1>" + var316, null, var327, 0, -1, -23694, var316, "<img=1>" + var317, 7);
                } else if (var322 == 1) {
                    class635.method3690("<img=0>" + var316, null, var327, 0, -1, -23694, var316, "<img=0>" + var317, 7);
                } else {
                    class635.method3690(var316, null, var327, 0, -1, -23694, var316, var317, 3);
                }
            }
            class253.field4038 = null;
            return true;
        } else if (class612.field8699 == class253.field4038) {
            class93.method903(class644.field9058, false);
            class253.field4038 = null;
            return true;
        } else if (class47.field637 == class253.field4038) {
            class106.field1720 = class558.field8066.method70(-9059);
            class253.field4038 = null;
            return true;
        } else if (class639.field8964 == class253.field4038) {
            class51.field691 = class558.field8066.method70(-9059);
            for (int var328 = 0; var328 < class51.field691; var328++) {
                class478.field7077[var328] = class558.field8066.method42((byte) -72);
                class299.field4671[var328] = class558.field8066.method42((byte) -120);
                if (class299.field4671[var328].equals("")) {
                    class299.field4671[var328] = class478.field7077[var328];
                }
                class333.field5455[var328] = class558.field8066.method42((byte) -80);
                class182.field3064[var328] = class558.field8066.method42((byte) -92);
                if (class182.field3064[var328].equals("")) {
                    class182.field3064[var328] = class333.field5455[var328];
                }
                class55.field726[var328] = false;
            }
            class292.field4608 = class79.field997;
            class253.field4038 = null;
            return true;
        } else if (class643.field9049 == class253.field4038) {
            class93.method903(class588.field8350, false);
            class253.field4038 = null;
            return true;
        } else if (class429.field6541 == class253.field4038) {
            class211.field3512 = class558.field8066.method85(true) << 3;
            class371.field5822 = class558.field8066.method75(-28);
            class618.field8748 = class558.field8066.method85(true) << 3;
            while (class344.field5550 > class558.field8066.field57) {
                class328 var329 = class622.method3608(113)[class558.field8066.method70(-9059)];
                class93.method903(var329, false);
            }
            class253.field4038 = null;
            return true;
        } else if (class427.field6493 == class253.field4038) {
            class538.field7861 = 1;
            class292.field4608 = class79.field997;
            class253.field4038 = null;
            return true;
        } else if (class253.field4038 == class139.field2344) {
            int var330 = class558.field8066.method68(12513);
            byte var331 = class558.field8066.method81(true);
            class539.field7869.method3747(var330, var331, 0);
            class253.field4038 = null;
            return true;
        } else if (class253.field4038 == class160.field2732) {
            class558.field8066.field57 += 28;
            if (class558.field8066.method35(0)) {
                class89.method806(15090, class558.field8066, class558.field8066.field57 - 28);
            }
            class253.field4038 = null;
            return true;
        } else if (class347.field5572 == class253.field4038) {
            int var332 = class558.field8066.method67(12021);
            int var333 = class558.field8066.method70(-9059);
            boolean var334 = (var333 & 0x1) == 1;
            class409.method2614(var334, var332, false);
            int var335 = class558.field8066.method67(12021);
            for (int var336 = 0; var336 < var335; var336++) {
                int var337 = class558.field8066.method67(12021);
                int var338 = class558.field8066.method75(-120);
                if (var338 == 255) {
                    var338 = class558.field8066.method30(99);
                }
                class518.method3128(var334, -114, var337 - 1, var338, var332, var336);
            }
            class356.field5689[class453.method2846(class529.field7710++, 31)] = var332;
            class253.field4038 = null;
            return true;
        } else if (class592.field8412 == class253.field4038) {
            int var339 = class558.field8066.method67(12021);
            int var340 = class558.field8066.method30(123);
            int var341 = class558.field8066.method68(12513);
            if (var341 == 65535) {
                var341 = -1;
            }
            if (class299.method2070((byte) -108, var339)) {
                class183.method1489(var340, var341, 16);
            }
            class253.field4038 = null;
            return true;
        } else if (class665.field9349 == class253.field4038) {
            int var342 = class558.field8066.method37(4);
            int var343 = class558.field8066.method37(4);
            int var344 = class558.field8066.method68(12513);
            int var345 = class558.field8066.method39((byte) 125);
            if (class299.method2070((byte) -99, var344)) {
                class139.method1189(var343, var342, var345, 5, -6194);
            }
            class253.field4038 = null;
            return true;
        } else if (class263.field4306 == class253.field4038) {
            class539.field7869.method3748((byte) -84);
            class253.field4038 = null;
            class403.field6230 += 32;
            return true;
        } else if (class64.field822 == class253.field4038) {
            int var346 = class558.field8066.method67(12021);
            int var347 = class558.field8066.method70(-9059);
            int var348 = class558.field8066.method70(-9059);
            int var349 = class558.field8066.method70(-9059);
            int var350 = class558.field8066.method70(-9059);
            int var351 = class558.field8066.method67(12021);
            if (class299.method2070((byte) 123, var346)) {
                class631.field8880[var347] = true;
                class208.field3482[var347] = var348;
                class683.field9585[var347] = var349;
                class592.field8409[var347] = var350;
                class97.field1542[var347] = var351;
            }
            class253.field4038 = null;
            return true;
        } else if (class78.field995 == class253.field4038) {
            int var352 = class558.field8066.method78(true);
            int var353 = class558.field8066.method72(-79);
            if (class299.method2070((byte) -17, var352)) {
                if (var353 == -1) {
                    class81.field1005 = -1;
                    class664.field9243 = -1;
                } else {
                    int var354 = (var353 & 0xFFFFF4A) >> 14;
                    int var355 = var354 - class612.field8702;
                    int var356 = var353 & 0x3FFF;
                    if (var355 < 0) {
                        var355 = 0;
                    } else if (class275.field4426 <= var355) {
                        var355 = class275.field4426;
                    }
                    int var357 = var356 - class626.field8855;
                    class664.field9243 = (var355 << 9) + 256;
                    if (var357 < 0) {
                        var357 = 0;
                    } else if (class417.field6374 <= var357) {
                        var357 = class417.field6374;
                    }
                    class81.field1005 = (var357 << 9) + 256;
                }
            }
            class253.field4038 = null;
            return true;
        } else if (class253.field4038 == class136.field2217) {
            int var358 = class558.field8066.method70(-9059);
            boolean var359 = (var358 & 0x1) == 1;
            String var360 = class558.field8066.method42((byte) -26);
            String var361 = class558.field8066.method42((byte) -95);
            if (var361.equals("")) {
                var361 = var360;
            }
            String var362 = class558.field8066.method42((byte) -122);
            String var363 = class558.field8066.method42((byte) -94);
            if (var363.equals("")) {
                var363 = var362;
            }
            if (var359) {
                for (int var364 = 0; var364 < class51.field691; var364++) {
                    if (class299.field4671[var364].equals(var363)) {
                        class478.field7077[var364] = var360;
                        class299.field4671[var364] = var361;
                        class333.field5455[var364] = var362;
                        class182.field3064[var364] = var363;
                        break;
                    }
                }
            } else {
                class478.field7077[class51.field691] = var360;
                class299.field4671[class51.field691] = var361;
                class333.field5455[class51.field691] = var362;
                class182.field3064[class51.field691] = var363;
                class55.field726[class51.field691] = class453.method2846(var358, 2) == 2;
                class51.field691++;
            }
            class292.field4608 = class79.field997;
            class253.field4038 = null;
            return true;
        } else if (class334.field5474 == class253.field4038) {
            class93.method903(class589.field8363, false);
            class253.field4038 = null;
            return true;
        } else if (class276.field4476 == class253.field4038) {
            int var365 = class558.field8066.method70(-9059);
            int var366 = var365 >> 5;
            int var367 = var365 & 0x1F;
            if (var367 == 0) {
                class472.field6987[var366] = null;
                class253.field4038 = null;
                return true;
            }
            class515 var368 = new class515();
            var368.field7483 = var367;
            var368.field7480 = class558.field8066.method70(-9059);
            if (var368.field7480 >= 0 && var368.field7480 < class487.field7143.length) {
                if (var368.field7483 == 1 || var368.field7483 == 10) {
                    var368.field7485 = class558.field8066.method67(12021);
                    class558.field8066.field57 += 6;
                } else if (var368.field7483 >= 2 && var368.field7483 <= 6) {
                    if (var368.field7483 == 2) {
                        var368.field7488 = 256;
                        var368.field7492 = 256;
                    }
                    if (var368.field7483 == 3) {
                        var368.field7488 = 256;
                        var368.field7492 = 0;
                    }
                    if (var368.field7483 == 4) {
                        var368.field7488 = 256;
                        var368.field7492 = 512;
                    }
                    if (var368.field7483 == 5) {
                        var368.field7488 = 0;
                        var368.field7492 = 256;
                    }
                    if (var368.field7483 == 6) {
                        var368.field7492 = 256;
                        var368.field7488 = 512;
                    }
                    var368.field7483 = 2;
                    var368.field7486 = class558.field8066.method70(-9059);
                    var368.field7492 += class558.field8066.method67(12021) - class612.field8702 << 9;
                    var368.field7488 += class558.field8066.method67(12021) - class626.field8855 << 9;
                    var368.field7489 = class558.field8066.method70(-9059) << 2;
                    var368.field7484 = class558.field8066.method67(12021);
                }
                var368.field7487 = class558.field8066.method67(12021);
                if (var368.field7487 == 65535) {
                    var368.field7487 = -1;
                }
                class472.field6987[var366] = var368;
            }
            class253.field4038 = null;
            return true;
        } else if (class578.field8220 == class253.field4038) {
            int var369 = class558.field8066.method72(-118);
            int var370 = class558.field8066.method68(12513);
            class539.field7869.method3750(var370, 84, var369);
            class253.field4038 = null;
            return true;
        } else if (class605.field8580 == class253.field4038) {
            int var371 = class558.field8066.method37(4);
            int var372 = class558.field8066.method78(true);
            int var373 = class558.field8066.method70(-9059);
            if (class299.method2070((byte) -117, var372)) {
                class502.method3054((byte) -45, var373, var371);
            }
            class253.field4038 = null;
            return true;
        } else if (class478.field7073 == class253.field4038) {
            class49.method557(5424);
            class253.field4038 = null;
            return false;
        } else if (class253.field4038 == class164.field2766) {
            class93.method903(class126.field2058, false);
            class253.field4038 = null;
            return true;
        } else if (class500.field7341 == class253.field4038) {
            for (int var374 = 0; var374 < class597.field8465.length; var374++) {
                if (class597.field8465[var374] != null) {
                    class597.field8465[var374].field4174 = null;
                    class597.field8465[var374].field4215 = -1;
                }
            }
            for (int var375 = 0; var375 < class289.field4581; var375++) {
                class613.field8707[var375].field5577.field4174 = null;
                class613.field8707[var375].field5577.field4215 = -1;
            }
            class253.field4038 = null;
            return true;
        } else if (class528.field7703 == class253.field4038) {
            boolean var376 = class558.field8066.method70(-9059) == 1;
            String var377 = class558.field8066.method42((byte) -63);
            String var378 = var377;
            if (var376) {
                var378 = class558.field8066.method42((byte) -43);
            }
            int var379 = class558.field8066.method70(-9059);
            boolean var380 = false;
            if (var379 <= 1) {
                if (!(!class622.field8788 || class193.field3197) || class519.field7509) {
                    var380 = true;
                } else if (var379 <= 1 && class661.method3793(var378, (byte) 58)) {
                    var380 = true;
                }
            }
            if (!var380 && class505.field7382 == 0) {
                String var381 = class333.method2311((byte) -69, class35.method468(false, class558.field8066));
                if (var379 == 2) {
                    class635.method3690("<img=1>" + var377, null, var381, 0, -1, -23694, var377, "<img=1>" + var378, 24);
                } else if (var379 == 1) {
                    class635.method3690("<img=0>" + var377, null, var381, 0, -1, -23694, var377, "<img=0>" + var378, 24);
                } else {
                    class635.method3690(var377, null, var381, 0, -1, -23694, var377, var378, 24);
                }
            }
            class253.field4038 = null;
            return true;
        } else if (class521.field7568 == class253.field4038) {
            class112.field1780 = class558.field8066.method75(48);
            class174.field2878 = class558.field8066.method77((byte) -56);
            class253.field4038 = null;
            return true;
        } else if (class470.field6972 == class253.field4038) {
            int var382 = class558.field8066.method39((byte) 125);
            int var383 = class558.field8066.method30(105);
            int var384 = class558.field8066.method68(12513);
            int var385 = class558.field8066.method67(12021);
            if (class299.method2070((byte) -99, var382)) {
                class327.method2204((var384 << 16) + var385, 16777215, var383);
            }
            class253.field4038 = null;
            return true;
        } else if (class420.field6423 == class253.field4038) {
            int var386 = class558.field8066.method67(12021);
            if (var386 == 65535) {
                var386 = -1;
            }
            int var387 = class558.field8066.method70(-9059);
            int var388 = class558.field8066.method67(12021);
            int var389 = class558.field8066.method70(-9059);
            class299.method2072(var389, 256, var388, var386, -117, var387, true);
            class253.field4038 = null;
            return true;
        } else if (class350.field5593 == class253.field4038) {
            int var390 = class558.field8066.method39((byte) 127);
            int var391 = class558.field8066.method30(117);
            int var392 = class558.field8066.method39((byte) 127);
            int var393 = class558.field8066.method67(12021);
            int var394 = class558.field8066.method67(12021);
            if (class299.method2070((byte) -128, var390)) {
                class290.method2048(8, var393, var392, var391, var394);
            }
            class253.field4038 = null;
            return true;
        } else if (class476.field7050 == class253.field4038) {
            class93.method903(class606.field8605, false);
            class253.field4038 = null;
            return true;
        } else if (class650.field9103 == class253.field4038) {
            String var395 = class558.field8066.method42((byte) -31);
            int var396 = class558.field8066.method67(12021);
            String var397 = class139.field2340.method3968(var396, 0).method1310(class558.field8066, 127);
            class635.method3690(var395, null, var397, 0, var396, -23694, var395, var395, 19);
            class253.field4038 = null;
            return true;
        } else if (class660.field9198 == class253.field4038) {
            int var398 = class558.field8066.method39((byte) 126);
            byte var399 = class558.field8066.method81(true);
            int var400 = class558.field8066.method33((byte) 99);
            if (class299.method2070((byte) -92, var398)) {
                class524.method3156(var399, var400, 847);
            }
            class253.field4038 = null;
            return true;
        } else if (class517.field7500 == class253.field4038) {
            int var401 = class558.field8066.method88((byte) 90);
            int var402 = class558.field8066.method72(-35);
            int var403 = class558.field8066.method70(-9059);
            String var404 = "";
            String var405 = var404;
            if ((var403 & 0x1) != 0) {
                var404 = class558.field8066.method42((byte) -78);
                if ((var403 & 0x2) == 0) {
                    var405 = var404;
                } else {
                    var405 = class558.field8066.method42((byte) -97);
                }
            }
            String var406 = class558.field8066.method42((byte) -39);
            if (var401 == 99) {
                class529.method3200(var406, -101);
            } else if (var405.equals("") || !class661.method3793(var405, (byte) 86)) {
                class247.method1763(var404, var404, var406, false, var402, var401, var405);
            } else {
                class253.field4038 = null;
                return true;
            }
            class253.field4038 = null;
            return true;
        } else if (class98.field1584 == class253.field4038) {
            int var407 = class558.field8066.method78(true);
            String var408 = class558.field8066.method42((byte) -101);
            int var409 = class558.field8066.method67(12021);
            if (class299.method2070((byte) -113, var409)) {
                class347.method2344((byte) 121, var408, var407);
            }
            class253.field4038 = null;
            return true;
        } else if (class253.field4038 == class140.field2358) {
            class58.method668(false);
            class253.field4038 = null;
            return true;
        } else if (class555.field8027 == class253.field4038) {
            boolean var410 = class558.field8066.method70(-9059) == 1;
            String var411 = class558.field8066.method42((byte) -32);
            String var412 = var411;
            if (var410) {
                var412 = class558.field8066.method42((byte) -104);
            }
            long var413 = class558.field8066.method69(1282265952);
            long var415 = (long) class558.field8066.method67(12021);
            long var417 = (long) class558.field8066.method86(-26);
            int var419 = class558.field8066.method70(-9059);
            long var420 = (var415 << 32) + var417;
            boolean var422 = false;
            int var423 = 0;
            while (true) {
                if (var423 >= 100) {
                    if (var419 <= 1) {
                        if (!(!class622.field8788 || class193.field3197) || class519.field7509) {
                            var422 = true;
                        } else if (class661.method3793(var412, (byte) 62)) {
                            var422 = true;
                        }
                    }
                    break;
                }
                if (class706.field9995[var423] == var420) {
                    var422 = true;
                    break;
                }
                var423++;
            }
            if (!var422 && class505.field7382 == 0) {
                class706.field9995[class53.field710] = var420;
                class53.field710 = (class53.field710 + 1) % 100;
                String var424 = class333.method2311((byte) -84, class35.method468(false, class558.field8066));
                if (var419 == 2 || var419 == 3) {
                    class635.method3690("<img=1>" + var411, class683.method3887(var413, 122), var424, 0, -1, -23694, var411, "<img=1>" + var412, 9);
                } else if (var419 == 1) {
                    class635.method3690("<img=0>" + var411, class683.method3887(var413, 75), var424, 0, -1, -23694, var411, "<img=0>" + var412, 9);
                } else {
                    class635.method3690(var411, class683.method3887(var413, 70), var424, 0, -1, -23694, var411, var412, 9);
                }
            }
            class253.field4038 = null;
            return true;
        } else if (class443.field6743 == class253.field4038) {
            class333.method2305(0);
            class253.field4038 = null;
            return true;
        } else if (class405.field6241 == class253.field4038) {
            if (class471.method2924((byte) 43, class682.field9564)) {
                class157.field2688 = (int) ((float) class558.field8066.method67(12021) * 2.5F);
            } else {
                class157.field2688 = class558.field8066.method67(12021) * 30;
            }
            class253.field4038 = null;
            class158.field2701 = class79.field997;
            return true;
        } else if (class253.field4038 == class124.field2049) {
            int var425 = class558.field8066.method67(12021);
            int var426 = class558.field8066.method72(-41);
            if (class299.method2070((byte) 57, var425)) {
                class102 var427 = (class102) class486.field7115.method1558((long) var426, (byte) -93);
                if (var427 != null) {
                    class353.method2370(true, (byte) 0, false, var427);
                }
                if (class672.field9481 != null) {
                    class362.method2415(-124, class672.field9481);
                    class672.field9481 = null;
                }
            }
            class253.field4038 = null;
            return true;
        } else if (class253.field4038 == class181.field3046) {
            int var428 = class558.field8066.method39((byte) 126);
            int var429 = class558.field8066.method30(113);
            class539.field7869.method3747(var428, var429, 0);
            class253.field4038 = null;
            return true;
        } else if (class665.field9418 == class253.field4038) {
            int var430 = class558.field8066.method75(115);
            int var431 = class558.field8066.method78(true);
            if (class299.method2070((byte) -90, var431)) {
                class240.field3802 = var430;
            }
            class253.field4038 = null;
            return true;
        } else if (class335.field5478 == class253.field4038) {
            if (class528.field7706 != -1) {
                class281.method1994(105, 0, class528.field7706);
            }
            class253.field4038 = null;
            return true;
        } else if (class520.field7517 == class253.field4038) {
            int var432 = class558.field8066.method37(4);
            int var433 = class558.field8066.method57((byte) 2);
            int var434 = class558.field8066.method67(12021);
            int var435 = class558.field8066.method46(-123);
            if (class299.method2070((byte) -110, var434)) {
                class468.method2909(false, var432, var435, var433);
            }
            class253.field4038 = null;
            return true;
        } else if (class515.field7482 == class253.field4038) {
            int var436 = class558.field8066.method67(12021);
            int var437 = class558.field8066.method77((byte) -68);
            int var438 = class558.field8066.method39((byte) 126);
            if (class299.method2070((byte) -98, var438)) {
                if (var437 == 2) {
                    class343.method2335(0);
                }
                class528.field7706 = var436;
                class51.method577(var436, 126);
                class351.method2359((byte) 87, false);
                class142.method1208(class528.field7706);
                for (int var439 = 0; var439 < 100; var439++) {
                    class532.field7753[var439] = true;
                }
            }
            class253.field4038 = null;
            return true;
        } else {
            class660.method3790(10216, null, "T1 - " + (class253.field4038 == null ? -1 : class253.field4038.method1300(-1)) + "," + (class11.field179 == null ? -1 : class11.field179.method1300(-1)) + "," + (class437.field6668 == null ? -1 : class437.field6668.method1300(-1)) + " - " + class344.field5550);
            class6.method63(0, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!q", name = "J", descriptor = "(I)V")
    public abstract void method508(int arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ldh;I)I")
    public static final int method2546(class295 arg0, int arg1) {
        field6141++;
        if (arg1 != 4) {
            return 44;
        }
        String var2 = class183.method1486(arg0, false);
        int[] var3 = null;
        if (class147.method1238(12081, arg0.field4631)) {
            var3 = class91.field1083.method2859((int) arg0.field4627, (byte) 127).field1838;
        } else if (arg0.field4632 != -1) {
            var3 = class91.field1083.method2859(arg0.field4632, (byte) 126).field1838;
        } else if (class511.method3098(false, arg0.field4631)) {
            class348 var4 = (class348) class592.field8395.method1558((long) ((int) arg0.field4627), (byte) -93);
            if (var4 != null) {
                class589 var5 = var4.field5577;
                class705 var6 = var5.field8354;
                if (var6.field9912 != null) {
                    var6 = var6.method3973(true, class539.field7869);
                }
                if (var6 != null) {
                    var3 = var6.field9941;
                }
            }
        } else if (class705.method3978(32, arg0.field4631)) {
            Object var7 = null;
            class698 var8;
            if (arg0.field4631 == 1002) {
                var8 = class213.field3537.method94((int) arg0.field4627, (byte) -42);
            } else {
                var8 = class213.field3537.method94((int) (arg0.field4627 >>> 32 & 0x7FFFFFFFL), (byte) -42);
            }
            if (var8.field9826 != null) {
                var8 = var8.method3934(class539.field7869, -8);
            }
            if (var8 != null) {
                var3 = var8.field9782;
            }
        }
        if (var3 != null) {
            var2 = var2 + class693.method3919(var3, (byte) 81);
        }
        int var9 = class35.field508.method3677(class114.field1790, (byte) -90, var2);
        if (arg0.field4624) {
            var9 += class56.field733.method1083() + 4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!q", name = "na", descriptor = "(IIIIII)V")
    public abstract void method497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
    public static void method2547(int arg0) {
        field6137 = null;
        if (arg0 != 2478) {
            field6137 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "YA", descriptor = "([I)V")
    public abstract void method500(int[] arg0);

    @OriginalMember(owner = "client!q", name = "NA", descriptor = "(III)V")
    public abstract void method503(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "wa", descriptor = "(III[I)V")
    public abstract void method514(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "oa", descriptor = "(I)V")
    public abstract void method521(int arg0);

    @OriginalMember(owner = "client!q", name = "ZA", descriptor = "(I)V")
    public abstract void method511(int arg0);

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V")
    public static final void method2548(int arg0) {
        field6138++;
        class349 var1 = (class349) class490.field7162.method2758(-44);
        if (arg0 <= 34) {
            field6137 = null;
        }
        while (var1 != null) {
            class304.method2108(var1, false);
            var1 = (class349) class490.field7162.method2758(114);
        }
        int var2;
        int var3;
        if (class17.field282.method2089(class497.field7259, -1)) {
            var2 = 3;
            var3 = 0;
        } else {
            var2 = class70.field887;
            var3 = class70.field887;
        }
        client.method1948();
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method1947();
            client.method1951(var4);
            client.method1952(var4);
        }
        client.method1958();
        client.method1950();
    }

    @OriginalMember(owner = "client!q", name = "U", descriptor = "(III)V")
    public abstract void method505(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "()V")
    public abstract void method504();

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III[I)V")
    public abstract void method502(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()Lq;")
    public abstract class393 method519();

    @OriginalMember(owner = "client!q", name = "M", descriptor = "(Lq;)V")
    public abstract void method512(class393 arg0);

    @OriginalMember(owner = "client!q", name = "o", descriptor = "(I)V")
    public abstract void method506(int arg0);

    @OriginalMember(owner = "client!q", name = "w", descriptor = "(I)V")
    public abstract void method517(int arg0);
}
