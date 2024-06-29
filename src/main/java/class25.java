import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class25 extends class51 {

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "I")
    public int field614 = -1;

    @OriginalMember(owner = "client!dc", name = "bb", descriptor = "I")
    public int field616 = -1;

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "I")
    public int field611 = 99;

    @OriginalMember(owner = "client!dc", name = "eb", descriptor = "Z")
    public boolean field619 = false;

    @OriginalMember(owner = "client!dc", name = "ib", descriptor = "I")
    public int field623 = 2;

    @OriginalMember(owner = "client!dc", name = "sb", descriptor = "I")
    public int field633 = -1;

    @OriginalMember(owner = "client!dc", name = "xb", descriptor = "I")
    public int field638 = 5;

    @OriginalMember(owner = "client!dc", name = "yb", descriptor = "I")
    public int field639 = -1;

    @OriginalMember(owner = "client!dc", name = "tb", descriptor = "I")
    public int field634 = -1;

    @OriginalMember(owner = "client!dc", name = "nb", descriptor = "[Z")
    public static boolean[] field628 = new boolean[100];

    @OriginalMember(owner = "client!dc", name = "gb", descriptor = "Lic;")
    public static class59 field621 = class59.method433(0, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!dc", name = "wb", descriptor = "I")
    public static int field637 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!dc", name = "cb", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!dc", name = "db", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!dc", name = "jb", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!dc", name = "lb", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!dc", name = "mb", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!dc", name = "ob", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!dc", name = "pb", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!dc", name = "qb", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!dc", name = "ub", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!dc", name = "vb", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!dc", name = "Ab", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!dc", name = "fb", descriptor = "Ldd;")
    public static class26 field620;

    @OriginalMember(owner = "client!dc", name = "rb", descriptor = "Z")
    public static boolean field632;

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "[I")
    public int[] field610;

    @OriginalMember(owner = "client!dc", name = "ab", descriptor = "[I")
    private int[] field615;

    @OriginalMember(owner = "client!dc", name = "hb", descriptor = "[I")
    public int[] field622;

    @OriginalMember(owner = "client!dc", name = "kb", descriptor = "[I")
    public int[] field625;

    @OriginalMember(owner = "client!dc", name = "zb", descriptor = "[I")
    private int[] field640;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
    public static void method167(int arg0) {
        field628 = null;
        field620 = null;
        field621 = null;
        if (arg0 != 10368) {
            field637 = -41;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILnb;)Lnb;")
    public final class92 method168(int arg0, int arg1, class92 arg2) {
        field618++;
        int var4 = this.field625[arg1];
        if (arg0 != 10) {
            this.field622 = null;
        }
        class54 var5 = class91.method745((byte) 36, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method760(true);
        } else {
            class92 var7 = arg2.method760(!var5.method404((byte) 48, var6));
            var7.method770(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)V")
    public final void method169(int arg0) {
        field641++;
        if (this.field616 == -1) {
            if (this.field615 == null) {
                this.field616 = 0;
            } else {
                this.field616 = 2;
            }
        }
        if (arg0 <= 59) {
            method167(27);
        }
        if (this.field633 != -1) {
            return;
        }
        if (this.field615 == null) {
            this.field633 = 0;
        } else {
            this.field633 = 2;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lnb;IBI)Lnb;")
    public final class92 method170(class92 arg0, int arg1, byte arg2, int arg3) {
        int var5 = this.field625[arg1];
        int var6 = 48 % ((-arg2 - 85) / 32);
        class54 var7 = class91.method745((byte) 56, var5 >> 16);
        field635++;
        int var8 = var5 & 0xFFFF;
        if (var7 == null) {
            return arg0.method761(true);
        }
        class92 var9 = arg0.method761(!var7.method404((byte) 109, var8));
        int var10 = arg3 & 0x3;
        if (var10 == 1) {
            var9.method774();
        } else if (var10 == 2) {
            var9.method765();
        } else if (var10 == 3) {
            var9.method768();
        }
        var9.method770(var7, var8);
        if (var10 == 1) {
            var9.method768();
        } else if (var10 == 2) {
            var9.method765();
        } else if (var10 == 3) {
            var9.method774();
        }
        return var9;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lwd;I)V")
    public final void method171(class157 arg0, int arg1) {
        if (arg1 != 4095) {
            return;
        }
        while (true) {
            int var3 = arg0.method1194(false);
            if (var3 == 0) {
                field629++;
                return;
            }
            this.method178(arg1 - 4220, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)V")
    public static final void method172(int arg0) {
        field627++;
        if (class33.field895 > 0) {
            class33.field895--;
        }
        if (class120.field2759 > 1) {
            class120.field2759--;
        }
        if (class126.field2857) {
            class126.field2857 = false;
            class114.method922((byte) 127);
            return;
        }
        for (int var1 = 0; var1 < 100 && class32.method256((byte) 59); var1++) {
        }
        if (class64.field1635 != 30) {
            return;
        }
        class154.method1124(class125.field2842, 232, (byte) 11);
        Object var2 = class159.field3668.field1383;
        synchronized (class159.field3668.field1383) {
            if (!class154.field3333) {
                class159.field3668.field1399 = 0;
            } else if (class41.field1065 != 0 || class159.field3668.field1399 >= 40) {
                int var3 = 0;
                class125.field2842.method1072(110, -1);
                class125.field2842.method1205(0, arg0 + 8583);
                int var4 = class125.field2842.field3457;
                for (int var5 = 0; var5 < class159.field3668.field1399 && class125.field2842.field3457 - var4 < 240; var5++) {
                    var3++;
                    int var6 = class159.field3668.field1398[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 502) {
                        var6 = 502;
                    }
                    int var7 = class159.field3668.field1396[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    int var8 = var6 * 765 + var7;
                    if (class159.field3668.field1398[var5] == -1 && class159.field3668.field1396[var5] == -1) {
                        var6 = -1;
                        var8 = 524287;
                        var7 = -1;
                    }
                    if (class114.field2705 != var7 || class75.field1850 != var6) {
                        int var9 = var7 - class114.field2705;
                        class114.field2705 = var7;
                        int var10 = var6 - class75.field1850;
                        class75.field1850 = var6;
                        if (client.field505 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class125.field2842.method1206((client.field505 << 12) + (var9 << 6) + var10, true);
                            client.field505 = 0;
                        } else if (client.field505 < 8) {
                            class125.field2842.method1209((client.field505 << 19) + var8 + 8388608, (byte) 121);
                            client.field505 = 0;
                        } else {
                            class125.field2842.method1195((client.field505 << 19) + var8 - 1073741824, 852);
                            client.field505 = 0;
                        }
                    } else if (client.field505 < 2047) {
                        client.field505++;
                    }
                }
                class81.field2015++;
                class125.field2842.method1215(class125.field2842.field3457 - var4, 123);
                if (class159.field3668.field1399 <= var3) {
                    class159.field3668.field1399 = 0;
                } else {
                    class159.field3668.field1399 -= var3;
                    for (int var11 = 0; var11 < class159.field3668.field1399; var11++) {
                        class159.field3668.field1396[var11] = class159.field3668.field1396[var3 + var11];
                        class159.field3668.field1398[var11] = class159.field3668.field1398[var3 + var11];
                    }
                }
            }
        }
        if (class41.field1065 != 0) {
            class82.field2036++;
            long var12 = (class147.field3207 - class8.field167) / 50L;
            class8.field167 = class147.field3207;
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            int var14 = class81.field2005;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 502) {
                var14 = 502;
            }
            int var15 = class3.field68;
            byte var16 = 0;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 764) {
                var15 = 764;
            }
            int var17 = (int) var12;
            if (class41.field1065 == 2) {
                var16 = 1;
            }
            int var18 = var14 * 765 + var15;
            class125.field2842.method1072(193, -1);
            class125.field2842.method1195((var17 << 20) + (var16 << 19) + var18, arg0 ^ 0x355);
        }
        if (class95.field2423[96] || class95.field2423[97] || class95.field2423[98] || class95.field2423[99]) {
            class103.field2499 = true;
        }
        if (class91.field2319 > 0) {
            class91.field2319--;
        }
        if (class103.field2499 && class91.field2319 <= 0) {
            class103.field2499 = false;
            class91.field2319 = 20;
            class51.field1260++;
            class125.field2842.method1072(66, -1);
            class125.field2842.method1191(class62.field1569, -1806027672);
            class125.field2842.method1165(58, class79.field1941);
        }
        if (class127.field2890 && !class55.field1345) {
            class55.field1345 = true;
            class65.field1647++;
            class125.field2842.method1072(32, arg0 - 2);
            class125.field2842.method1205(1, 8584);
        }
        if (!class127.field2890 && class55.field1345) {
            class65.field1647++;
            class55.field1345 = false;
            class125.field2842.method1072(32, -1);
            class125.field2842.method1205(0, 8584);
        }
        client.method130(false);
        if (class64.field1635 != 30) {
            return;
        }
        class155.method1130((byte) 118);
        class139.method1052((byte) -80);
        class153.field3314++;
        if (class153.field3314 > 750) {
            class114.method922((byte) 127);
            return;
        }
        class86.method706(false);
        class106.method826(18618);
        class65.method531(-1);
        class76.field1872++;
        if (class18.field364 != 0) {
            class158.field3500 += 20;
            if (class158.field3500 >= 400) {
                class18.field364 = 0;
            }
        }
        if (class147.field3199 != null) {
            class46.field1157++;
            if (class46.field1157 >= 15) {
                class42.method320(false, class147.field3199);
                class147.field3199 = null;
            }
        }
        if (class136.field3039 != null) {
            class42.method320(false, class136.field3039);
            if (class94.field2408 + 5 < class16.field325 || class16.field325 < class94.field2408 - 5 || class63.field1609 + 5 < class145.field3166 || class145.field3166 < class63.field1609 - 5) {
                class29.field768 = true;
            }
            class29.field767++;
            if (class159.field3667 == 0) {
                if (class29.field768 && class29.field767 >= 5) {
                    if (class54.field1340 == class136.field3039 && class94.field2409 != class40.field1022) {
                        class2.field32++;
                        class159 var19 = class136.field3039;
                        byte var20 = 0;
                        if (class32.field865 == 1 && var19.field3610 == 206) {
                            var20 = 1;
                        }
                        if (var19.field3613[class40.field1022] <= 0) {
                            var20 = 0;
                        }
                        if (class79.method652(class112.method915(var19, arg0 ^ 0x8642FBA1), true)) {
                            int var21 = class94.field2409;
                            int var22 = class40.field1022;
                            var19.field3613[var22] = var19.field3613[var21];
                            var19.field3559[var22] = var19.field3559[var21];
                            var19.field3613[var21] = -1;
                            var19.field3559[var21] = 0;
                        } else if (var20 == 1) {
                            int var23 = class40.field1022;
                            int var24 = class94.field2409;
                            while (var23 != var24) {
                                if (var23 < var24) {
                                    var19.method1230(var24, true, var24 - 1);
                                    var24--;
                                } else if (var24 < var23) {
                                    var19.method1230(var24, true, var24 + 1);
                                    var24++;
                                }
                            }
                        } else {
                            var19.method1230(class94.field2409, true, class40.field1022);
                        }
                        class125.field2842.method1072(250, -1);
                        class125.field2842.method1163(class136.field3039.field3573, (byte) 88);
                        class125.field2842.method1203((byte) -81, class94.field2409);
                        class125.field2842.method1188(arg0 ^ 0x1, var20);
                        class125.field2842.method1203((byte) 23, class40.field1022);
                    }
                } else if ((class134.field2977 == 1 || class83.method681(0, class107.field2557 - 1)) && class107.field2557 > 2) {
                    class24.method166(0);
                } else if (class107.field2557 > 0) {
                    class30.method237(8107, class107.field2557 - 1);
                }
                class136.field3039 = null;
                class46.field1157 = 10;
                class41.field1065 = 0;
            }
        }
        class116.field2725 = 0;
        class159 var25 = class17.field343;
        class126.field2864 = null;
        class17.field343 = null;
        class159 var26 = class147.field3191;
        class61.field1556 = false;
        class147.field3191 = null;
        class26.field668 = false;
        while (class87.method713(127) && class116.field2725 < 128) {
            class35.field928[class116.field2725] = class23.field564;
            class40.field1010[class116.field2725] = class118.field2749;
            class116.field2725++;
        }
        class27.method207(0, 127, 0, 503, 765, class126.field2866, 0, 0);
        class94.field2400++;
        while (true) {
            class139 var27;
            class159 var28;
            class159 var29;
            do {
                var27 = (class139) class53.field1307.method691(arg0 ^ 0x1);
                if (var27 == null) {
                    while (true) {
                        class139 var30;
                        class159 var31;
                        class159 var32;
                        do {
                            var30 = (class139) class46.field1171.method691(0);
                            if (var30 == null) {
                                while (true) {
                                    class139 var33;
                                    class159 var34;
                                    class159 var35;
                                    do {
                                        var33 = (class139) class153.field3313.method691(0);
                                        if (var33 == null) {
                                            if (class102.field2492 != null) {
                                                class38.method291(-1);
                                            }
                                            if (class111.field2645 != -1) {
                                                int var36 = class111.field2645;
                                                int var37 = class111.field2634;
                                                boolean var38 = class121.method945(0, 0, class159.field3650.field1719[0], 0, class159.field3650.field1704[0], 0, 0, -25171, var36, var37, 0, true);
                                                if (var38) {
                                                    class88.field2220 = class81.field2005;
                                                    class18.field364 = 1;
                                                    class157.field3416 = class3.field68;
                                                    class158.field3500 = 0;
                                                }
                                                class111.field2645 = -1;
                                            }
                                            class38.method294((byte) 116);
                                            if (class17.field343 != var25) {
                                                if (var25 != null) {
                                                    class42.method320(false, var25);
                                                }
                                                if (class17.field343 != null) {
                                                    class42.method320(false, class17.field343);
                                                }
                                            }
                                            if (class147.field3191 != var26 && class85.field2140 == class3.field66) {
                                                if (var26 != null) {
                                                    class42.method320(false, var26);
                                                }
                                                if (class147.field3191 != null) {
                                                    class42.method320(false, class147.field3191);
                                                }
                                            }
                                            if (class147.field3191 == null) {
                                                if (class85.field2140 > 0) {
                                                    class85.field2140--;
                                                }
                                            } else if (class3.field66 > class85.field2140) {
                                                class85.field2140++;
                                                if (class85.field2140 == class3.field66) {
                                                    class42.method320(false, class147.field3191);
                                                }
                                            }
                                            class79.method649(-75);
                                            if (class131.field2942) {
                                                class89.method733(arg0 - 22);
                                            }
                                            for (int var39 = 0; var39 < 5; var39++) {
                                                int var10002 = class15.field302[var39]++;
                                            }
                                            int var40 = class98.method802(-20310);
                                            int var41 = class54.method403(0);
                                            if (arg0 != 1) {
                                                field626 = -30;
                                            }
                                            if (var40 > 4500 && var41 > 4500) {
                                                class53.field1310++;
                                                class33.field895 = 250;
                                                class47.method371(4000, false);
                                                class125.field2842.method1072(12, arg0 - 2);
                                            }
                                            class33.field893++;
                                            class34.field909++;
                                            if (class34.field909 > 500) {
                                                class34.field909 = 0;
                                                int var42 = (int) (Math.random() * 8.0D);
                                                if ((var42 & 0x2) == 2) {
                                                    class36.field955 += class40.field1018;
                                                }
                                                if ((var42 & 0x4) == 4) {
                                                    class154.field3350 += class68.field1729;
                                                }
                                                if ((var42 & 0x1) == 1) {
                                                    class16.field319 += class102.field2489;
                                                }
                                            }
                                            if (class16.field319 < -50) {
                                                class102.field2489 = 2;
                                            }
                                            class157.field3465++;
                                            if (class154.field3350 < -40) {
                                                class68.field1729 = 1;
                                            }
                                            if (class36.field955 < -55) {
                                                class40.field1018 = 2;
                                            }
                                            if (class16.field319 > 50) {
                                                class102.field2489 = -2;
                                            }
                                            if (class157.field3465 > 500) {
                                                class157.field3465 = 0;
                                                int var43 = (int) (Math.random() * 8.0D);
                                                if ((var43 & 0x1) == 1) {
                                                    class130.field2927 += class65.field1646;
                                                }
                                                if ((var43 & 0x2) == 2) {
                                                    class49.field1226 += class102.field2484;
                                                }
                                            }
                                            if (class130.field2927 < -60) {
                                                class65.field1646 = 2;
                                            }
                                            if (class154.field3350 > 40) {
                                                class68.field1729 = -1;
                                            }
                                            if (class130.field2927 > 60) {
                                                class65.field1646 = -2;
                                            }
                                            if (class36.field955 > 55) {
                                                class40.field1018 = -2;
                                            }
                                            if (class49.field1226 < -20) {
                                                class102.field2484 = 1;
                                            }
                                            if (class49.field1226 > 10) {
                                                class102.field2484 = -1;
                                            }
                                            if (class33.field893 > 50) {
                                                client.field489++;
                                                class125.field2842.method1072(85, -1);
                                            }
                                            try {
                                                if (class102.field2491 != null && class125.field2842.field3457 > 0) {
                                                    class102.field2491.method306(class125.field2842.field3457, 0, 15731, class125.field2842.field3473);
                                                    class125.field2842.field3457 = 0;
                                                    class33.field893 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var44) {
                                                class114.method922((byte) 127);
                                                return;
                                            }
                                        }
                                        var34 = var33.field3104;
                                        if (var34.field3567 < 0) {
                                            break;
                                        }
                                        var35 = class134.method1032(var34.field3660, 499749840);
                                    } while (var35 == null || var35.field3598 == null || var35.field3598.length <= var34.field3567 || var35.field3598[var34.field3567] != var34);
                                    class125.method948(var33, -30164);
                                }
                            }
                            var31 = var30.field3104;
                            if (var31.field3567 < 0) {
                                break;
                            }
                            var32 = class134.method1032(var31.field3660, 499749840);
                        } while (var32 == null || var32.field3598 == null || var31.field3567 >= var32.field3598.length || var32.field3598[var31.field3567] != var31);
                        class125.method948(var30, arg0 ^ 0xFFFF8A2D);
                    }
                }
                var28 = var27.field3104;
                if (var28.field3567 < 0) {
                    break;
                }
                var29 = class134.method1032(var28.field3660, arg0 + 499749839);
            } while (var29 == null || var29.field3598 == null || var28.field3567 >= var29.field3598.length || var29.field3598[var28.field3567] != var28);
            class125.method948(var27, arg0 - 30165);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILnb;B)Lnb;")
    public final class92 method173(int arg0, class92 arg1, byte arg2) {
        int var4 = this.field625[arg0];
        field612++;
        class54 var5 = class91.method745((byte) 125, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method761(true);
        }
        class92 var7 = arg1.method761(!var5.method404((byte) -126, var6));
        var7.method770(var5, var6);
        if (arg2 <= 3) {
            this.method173(70, null, (byte) -8);
        }
        return var7;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lnb;II)Lnb;")
    public final class92 method174(class92 arg0, int arg1, int arg2) {
        field636++;
        int var4 = this.field625[arg2];
        class54 var5 = class91.method745((byte) 34, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method761(true);
        }
        class54 var7 = null;
        int var8 = arg1;
        if (this.field640 != null && this.field640.length > arg2) {
            int var9 = this.field640[arg2];
            var7 = class91.method745((byte) 63, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class92 var11 = arg0.method761(!var5.method404((byte) 112, var6));
            var11.method770(var5, var6);
            return var11;
        } else {
            class92 var10 = arg0.method761(!var5.method404((byte) -107, var6) & !var7.method404((byte) 47, var8));
            var10.method770(var5, var6);
            var10.method770(var7, var8);
            return var10;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ)I")
    public static final int method175(int arg0, boolean arg1) {
        field609++;
        class127 var2 = class143.method1061((byte) -106, arg0);
        int var3 = var2.field2889;
        if (arg1) {
            method176(true);
        }
        int var4 = var2.field2885;
        int var5 = var2.field2888;
        int var6 = class38.field986[var5 - var4];
        return var6 & class85.field2124[var3] >> var4;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V")
    public static final void method176(boolean arg0) {
        field613++;
        if (arg0) {
            method167(-72);
        }
        class51.field1277.method676((byte) -105);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILdc;ZILnb;)Lnb;")
    public final class92 method177(int arg0, class25 arg1, boolean arg2, int arg3, class92 arg4) {
        int var6 = this.field625[arg3];
        class54 var7 = class91.method745((byte) 108, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (arg2) {
            this.method178(12, null, 11);
        }
        field630++;
        if (var7 == null) {
            return arg1.method173(arg0, arg4, (byte) 101);
        }
        int var9 = arg1.field625[arg0];
        class54 var10 = class91.method745((byte) 63, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class92 var12 = arg4.method761(!var7.method404((byte) 25, var8));
            var12.method770(var7, var8);
            return var12;
        } else {
            class92 var13 = arg4.method761(!var7.method404((byte) 94, var8) & !var10.method404((byte) 59, var11));
            var13.method757(var7, var8, var10, var11, this.field615);
            return var13;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILwd;I)V")
    private final void method178(int arg0, class157 arg1, int arg2) {
        field617++;
        if (arg0 >= -120) {
            this.field638 = 84;
        }
        if (arg2 == 1) {
            int var11 = arg1.method1161((byte) 60);
            this.field610 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field610[var12] = arg1.method1161((byte) 60);
            }
            this.field625 = new int[var11];
            for (int var13 = 0; var13 < var11; var13++) {
                this.field625[var13] = arg1.method1161((byte) 60);
            }
            for (int var14 = 0; var14 < var11; var14++) {
                this.field625[var14] += arg1.method1161((byte) 60) << 16;
            }
        } else if (arg2 == 2) {
            this.field639 = arg1.method1161((byte) 60);
        } else if (arg2 == 3) {
            int var4 = arg1.method1194(false);
            this.field615 = new int[var4 + 1];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field615[var5] = arg1.method1194(false);
            }
            this.field615[var4] = 9999999;
        } else if (arg2 == 4) {
            this.field619 = true;
        } else if (arg2 == 5) {
            this.field638 = arg1.method1194(false);
        } else if (arg2 == 6) {
            this.field614 = arg1.method1161((byte) 60);
        } else if (arg2 == 7) {
            this.field634 = arg1.method1161((byte) 60);
        } else if (arg2 == 8) {
            this.field611 = arg1.method1194(false);
        } else if (arg2 == 9) {
            this.field633 = arg1.method1194(false);
        } else if (arg2 == 10) {
            this.field616 = arg1.method1194(false);
        } else if (arg2 == 11) {
            this.field623 = arg1.method1194(false);
            return;
        } else if (arg2 == 12) {
            int var6 = arg1.method1194(false);
            this.field640 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field640[var7] = arg1.method1161((byte) 60);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field640[var8] = (arg1.method1161((byte) 60) << 16) + this.field640[var8];
            }
            return;
        } else if (arg2 == 13) {
            int var9 = arg1.method1194(false);
            this.field622 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field622[var10] = arg1.method1207((byte) 124);
            }
            return;
        }
    }
}
