import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class49 extends class337 {

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "[B")
    public byte[] field793;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "[Lmc;")
    public class87[] field792;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "[B")
    public byte[] field781;

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "[B")
    public byte[] field791;

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "[Lnq;")
    public class319[] field787;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "[S")
    public short[] field788;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "[I")
    private int[] field789;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public int field782;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
    public static int field785 = -1;

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "Llp;")
    public static class266 field795;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "Lwd;")
    public static class178 field796;

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "Z")
    public static boolean field797;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static void method303(int arg0) {
        if (arg0 < 98) {
            field785 = 58;
        }
        field795 = null;
        field796 = null;
    }

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "(I)V")
    public final void method304(int arg0) {
        this.field789 = null;
        field783++;
        int var2 = -69 / ((arg0 + 69) / 49);
    }

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "(I)V")
    public static final void method305(int arg0) {
        field786++;
        class23.field251.method2601(-21859);
        int var1 = 92 / ((arg0 + 35) / 56);
        class91.field1371.method2601(-21859);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lvg;I)Lvg;")
    public static final class38 method306(class38 arg0, int arg1) {
        field794++;
        class38 var2 = client.method1339(arg0);
        if (arg1 != -7692) {
            method303(86);
        }
        if (var2 == null) {
            var2 = arg0.field512;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "(I)V")
    public static final void method307(int arg0) {
        field790++;
        if (class248.field3645 > 1) {
            class296.field4212 = class99.field1453;
            class248.field3645--;
        }
        if (class12.field162 > 0) {
            class12.field162--;
        }
        if (class445.field6627) {
            class445.field6627 = false;
            class361.method2250((byte) -31);
            return;
        }
        if (!class207.field2963) {
            class189.method1290((byte) -127);
        }
        for (int var1 = 0; var1 < 100 && class471.method2822(0); var1++) {
        }
        if (class193.field2832 != 30) {
            return;
        }
        class365.method2267(arg0 ^ 0x229A, class356.field5471, class35.field364.method2987((byte) -112));
        if (client.field2857 == null) {
            if (class110.field1574 <= class256.method1708((byte) 118)) {
                client.field2857 = class458.field6776.method1346(class285.field4101, (byte) 116);
            }
        } else if (client.field2857.field1794 != -1) {
            class291.method1861((byte) -104, class104.field1490);
            class356.field5471.method1413(arg0 - 8980, client.field2857.field1794);
            client.field2857 = null;
            class110.field1574 = class256.method1708((byte) 118) + 30000L;
        }
        class320 var2 = (class320) class111.field1597.method816(111);
        if (var2 != null || (class256.method1708((byte) 118) - 2000L) > class109.field1564) {
            boolean var3 = false;
            int var4 = class356.field5471.field3037;
            for (class320 var5 = (class320) class375.field5727.method816(108); var5 != null && (class356.field5471.field3037 - var4) < 240; var5 = (class320) class375.field5727.method812(112)) {
                var5.method2049(-76);
                int var6 = var5.method238(119);
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                int var7 = var5.method243((byte) -109);
                if (var7 < 0) {
                    var7 = 0;
                } else if (var7 > 65534) {
                    var7 = 65534;
                }
                boolean var8 = false;
                if (var5.method238(83) == -1 && var5.method243((byte) -109) == -1) {
                    var8 = true;
                    var6 = -1;
                    var7 = -1;
                }
                if (class397.field5959 != var7 || class522.field7732 != var6) {
                    if (!var3) {
                        class291.method1861((byte) -104, class329.field4678);
                        class346.field4984++;
                        class356.field5471.method1410(0, arg0 - 36504);
                        var4 = class356.field5471.field3037;
                        var3 = true;
                    }
                    int var9 = var7 - class397.field5959;
                    class397.field5959 = var7;
                    int var10 = var6 - class522.field7732;
                    class522.field7732 = var6;
                    int var11 = (int) ((var5.method242((byte) 127) - class109.field1564) / 20L);
                    if (var11 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                        var9 += 32;
                        var10 += 32;
                        class356.field5471.method1413(-124, (var9 << 6) + (var11 << 12) + var10);
                    } else if (var11 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                        class356.field5471.method1410(var11 + 128, arg0 + -36504);
                        var10 += 128;
                        var9 += 128;
                        class356.field5471.method1413(-119, (var9 << 8) + var10);
                    } else if (var11 >= 32) {
                        class356.field5471.method1413(arg0 ^ 0xFFFFDD13, var11 + 57344);
                        if (var8) {
                            class356.field5471.method1415(Integer.MIN_VALUE, (byte) -105);
                        } else {
                            class356.field5471.method1415(var7 | var6 << 16, (byte) -122);
                        }
                    } else {
                        class356.field5471.method1410(var11 + 192, arg0 ^ 0xFFFFB698);
                        if (var8) {
                            class356.field5471.method1415(Integer.MIN_VALUE, (byte) -92);
                        } else {
                            class356.field5471.method1415(var7 | var6 << 16, (byte) -84);
                        }
                    }
                    class109.field1564 = var5.method242((byte) 111);
                }
            }
            if (var3) {
                class356.field5471.method1443(class356.field5471.field3037 - var4, arg0 ^ 0xFFFFDD64);
            }
        }
        if (var2 != null) {
            long var12 = (var2.method242((byte) 99) - class472.field6954) / 50L;
            class472.field6954 = var2.method242((byte) 117);
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            int var14 = var2.method238(104);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = var2.method243((byte) -109);
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (var2.method239(arg0 - 8974) == 2) {
                var16 = 1;
            }
            class88.field1339++;
            int var17 = (int) var12;
            class291.method1861((byte) -104, class76.field1126);
            class356.field5471.method1413(arg0 ^ 0xFFFFDD1F, var17 | var16 << 15);
            class356.field5471.method1415(var14 << 16 | var15, (byte) -57);
        }
        if (class268.field3913 > 0) {
            int var18 = 0;
            for (int var19 = 0; var19 < class268.field3913; var19++) {
                if (class525.field7766[var19].method1650(-117)) {
                    var18++;
                }
            }
            if (var18 > 0) {
                class250.field3700++;
                if (var18 > 75) {
                    var18 = 75;
                }
                class291.method1861((byte) -104, class229.field3425);
                class356.field5471.method1410(var18 * 3, -27645);
                for (int var20 = 0; var20 < class268.field3913; var20++) {
                    class246 var21 = class525.field7766[var20];
                    if (var21.method1650(-112)) {
                        long var22 = (var21.method1660(15690) - class391.field5891) / 50L;
                        if (var22 > 65535L) {
                            var22 = 65535L;
                        }
                        class391.field5891 = var21.method1660(15690);
                        class356.field5471.method1410(var21.method1655(true), -27645);
                        class356.field5471.method1413(-119, (int) var22);
                    }
                }
            }
        }
        if (class479.field7043 > 0) {
            class479.field7043--;
        }
        if (class264.field3869 && class479.field7043 <= 0) {
            class264.field3869 = false;
            class479.field7043 = 20;
            class340.field4853++;
            class291.method1861((byte) -104, class237.field3492);
            class356.field5471.method1437((int) class24.field262 >> 3, -69);
            class356.field5471.method1439(arg0 - 8757, (int) class382.field5792 >> 3);
        }
        if (class521.field7697 && !class291.field4172) {
            class102.field1469++;
            class291.field4172 = true;
            class291.method1861((byte) -104, class334.field4712);
            class356.field5471.method1410(1, -27645);
        }
        if (!class521.field7697 && class291.field4172) {
            class102.field1469++;
            class291.field4172 = false;
            class291.method1861((byte) -104, class334.field4712);
            class356.field5471.method1410(0, -27645);
        }
        if (!class526.field7788) {
            class291.method1861((byte) -104, class231.field3451);
            class118.field1790++;
            class356.field5471.method1410(0, -27645);
            int var24 = class356.field5471.field3037;
            class209 var25 = class426.field6401.method2525(2);
            class356.field5471.method1445(var25.field3036, var25.field3037, (byte) 93, 0);
            class356.field5471.method1443(class356.field5471.field3037 - var24, arg0 ^ 0xFFFFDD64);
            class526.field7788 = true;
        }
        if (class108.field1553 != null) {
            if (class140.field2103 == 2) {
                class187.method1287(16384);
            } else if (class140.field2103 == 3) {
                class305.method1923((byte) 42);
            }
        }
        if (class347.field4998) {
            class347.field4998 = false;
        } else {
            class244.field3608 /= 2.0F;
        }
        if (class154.field2280) {
            class154.field2280 = false;
        } else {
            class450.field6707 /= 2.0F;
        }
        class244.method1640((byte) 74);
        if (class193.field2832 != 30) {
            return;
        }
        class453.method2724(28);
        class51.method316(0);
        class430.method2565((byte) 123);
        class439.method2648(arg0 - 25094);
        class5.field73++;
        if (class5.field73 > 750) {
            class361.method2250((byte) -31);
            return;
        }
        class88.method520(-6);
        client.method1327(0);
        class226.method1548(-20815);
        for (int var26 = field796.method1216(0, true); var26 != -1; var26 = field796.method1216(0, false)) {
            class427.method2558(arg0 - 19351, var26);
            class419.field6297[class286.method1847(class355.field5467++, 31)] = var26;
        }
        for (class338 var27 = class315.method1969(126); var27 != null; var27 = class315.method1969(arg0 ^ 0x22E5)) {
            int var28 = var27.method2055(8332);
            int var29 = var27.method2054(0);
            if (var28 == 1) {
                class146.field2173[var29] = var27.field4756;
                class394.field5938 |= class436.field6519[var29];
                class391.field5897[class286.method1847(class131.field2031++, 31)] = var29;
            } else if (var28 == 2) {
                class35.field371[var29] = var27.field4757;
                class77.field1159[class286.method1847(31, class237.field3497++)] = var29;
            } else if (var28 == 3) {
                class38 var30 = class149.method979((byte) -120, var29);
                if (!var27.field4757.equals(var30.field489)) {
                    var30.field489 = var27.field4757;
                    class350.method2203((byte) -118, var30);
                }
            } else if (var28 == 4) {
                class38 var31 = class149.method979((byte) -101, var29);
                int var32 = var27.field4756;
                int var33 = var27.field4751;
                int var34 = var27.field4748;
                if (var31.field523 != var32 || var31.field444 != var33 || var31.field447 != var34) {
                    var31.field447 = var34;
                    var31.field523 = var32;
                    var31.field444 = var33;
                    class350.method2203((byte) -118, var31);
                }
            } else if (var28 == 5) {
                class38 var35 = class149.method979((byte) -99, var29);
                if (var27.field4756 != var35.field407 || var27.field4756 == -1) {
                    var35.field407 = var27.field4756;
                    var35.field455 = 0;
                    var35.field522 = 0;
                    var35.field443 = 1;
                    class350.method2203((byte) -127, var35);
                }
            } else if (var28 == 6) {
                int var36 = var27.field4756;
                int var37 = var36 >> 10 & 0x1F;
                int var38 = (var36 & 0x3F1) >> 5;
                int var39 = var36 & 0x1F;
                int var40 = (var37 << 19) + (var39 << 3) + (var38 << 11);
                class38 var41 = class149.method979((byte) -119, var29);
                if (var41.field533 != var40) {
                    var41.field533 = var40;
                    class350.method2203((byte) -119, var41);
                }
            } else if (var28 == 7) {
                class38 var42 = class149.method979((byte) -126, var29);
                boolean var43 = var27.field4756 == 1;
                if (var43 != var42.field459) {
                    var42.field459 = var43;
                    class350.method2203((byte) -117, var42);
                }
            } else if (var28 == 8) {
                class38 var51 = class149.method979((byte) -108, var29);
                if (var27.field4756 != var51.field485 || var27.field4751 != var51.field408 || var27.field4748 != var51.field426) {
                    var51.field408 = var27.field4751;
                    var51.field485 = var27.field4756;
                    var51.field426 = var27.field4748;
                    if (var51.field535 != -1) {
                        if (var51.field529 > 0) {
                            var51.field426 = var51.field426 * 32 / var51.field529;
                        } else if (var51.field520 > 0) {
                            var51.field426 = var51.field426 * 32 / var51.field520;
                        }
                    }
                    class350.method2203((byte) -127, var51);
                }
            } else if (var28 == 9) {
                class38 var50 = class149.method979((byte) -111, var29);
                if (var27.field4756 != var50.field535 || var27.field4751 != var50.field563) {
                    var50.field535 = var27.field4756;
                    var50.field563 = var27.field4751;
                    class350.method2203((byte) -127, var50);
                }
            } else if (var28 == 10) {
                class38 var49 = class149.method979((byte) -78, var29);
                if (var27.field4756 != var49.field562 || var27.field4751 != var49.field466 || var27.field4748 != var49.field482) {
                    var49.field562 = var27.field4756;
                    var49.field482 = var27.field4748;
                    var49.field466 = var27.field4751;
                    class350.method2203((byte) -117, var49);
                }
            } else if (var28 == 11) {
                class38 var48 = class149.method979((byte) -85, var29);
                var48.field501 = var48.field484 = var27.field4751;
                var48.field488 = 0;
                var48.field509 = 0;
                var48.field412 = var48.field552 = var27.field4756;
                class350.method2203((byte) -121, var48);
            } else if (var28 == 12) {
                class38 var44 = class149.method979((byte) -117, var29);
                int var45 = var27.field4756;
                if (var44 != null && var44.field492 == 0) {
                    if ((var44.field475 - var44.field472) < var45) {
                        var45 = var44.field475 - var44.field472;
                    }
                    if (var45 < 0) {
                        var45 = 0;
                    }
                    if (var44.field415 != var45) {
                        var44.field415 = var45;
                        class350.method2203((byte) -126, var44);
                    }
                }
            } else if (var28 == 14) {
                class38 var47 = class149.method979((byte) -96, var29);
                var47.field519 = var27.field4756;
            } else if (var28 == 15) {
                class523.field7749 = var27.field4751;
                class255.field3778 = true;
                class401.field6030 = var27.field4756;
            } else if (var28 == 16) {
                class38 var46 = class149.method979((byte) -104, var29);
                var46.field456 = var27.field4756;
            }
        }
        if (class490.field7240 != 0) {
            class347.field4994 += 20;
            if (class347.field4994 >= 400) {
                class490.field7240 = 0;
            }
        }
        class500.field7364++;
        if (class57.field876 != null) {
            class221.field3284++;
            if (class221.field3284 >= 15) {
                class350.method2203((byte) -123, class57.field876);
                class57.field876 = null;
            }
        }
        class82.field1262 = null;
        class166.field2455 = null;
        class518.field7546 = false;
        class100.field1462 = false;
        class429.method2561(-1, -1, 27711, null);
        class287.method1852(-1, -1, true, null);
        if (!class61.field932) {
            class195.field2839 = -1;
        }
        class484.method2872(1);
        class99.field1453++;
        if (class372.field5680) {
            class291.method1861((byte) -104, class503.field7379);
            class2.field10++;
            class356.field5471.method1457((byte) 57, class223.field3290 << 28 | class122.field1848 << 14 | class208.field2973);
            class372.field5680 = false;
        }
        while (true) {
            class168 var52;
            class38 var53;
            class38 var54;
            do {
                var52 = (class168) class199.field2883.method815(-125);
                if (var52 == null) {
                    while (true) {
                        class168 var55;
                        class38 var56;
                        class38 var57;
                        do {
                            var55 = (class168) class147.field2178.method815(-127);
                            if (var55 == null) {
                                while (true) {
                                    class168 var58;
                                    class38 var59;
                                    class38 var60;
                                    do {
                                        var58 = (class168) class163.field2396.method815(-122);
                                        if (var58 == null) {
                                            if (arg0 != 8859) {
                                                method303(-41);
                                            }
                                            if (class166.field2455 == null) {
                                                class62.field940 = 0;
                                            }
                                            if (class283.field4065 != null) {
                                                class51.method314(-62);
                                            }
                                            if (class402.field6053 > 0 && class162.field2368.method1352(82, 118) && class162.field2368.method1352(81, 112) && class244.field3594 != 0) {
                                                int var61 = class500.field7365.field1768 - class244.field3594;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class404.method2433(var61, class500.field7365.field1997[0] + class68.field1038, arg0 ^ 0x334D, class500.field7365.field1996[0] + class24.field259);
                                            }
                                            class196.method1341(arg0 ^ 0xFFFFDD65);
                                            for (int var62 = 0; var62 < 5; var62++) {
                                                int var10002 = class5.field69[var62]++;
                                            }
                                            if (class394.field5938 && class84.field1294 < class256.method1708((byte) 118) - 60000L) {
                                                class352.method2206(true);
                                            }
                                            class423.field6360++;
                                            if (class423.field6360 > 500) {
                                                class423.field6360 = 0;
                                                int var63 = (int) (Math.random() * 8.0D);
                                                if ((var63 & 0x4) == 4) {
                                                    class333.field4696 += class61.field930;
                                                }
                                                if ((var63 & 0x1) == 1) {
                                                    class52.field817 += class137.field2071;
                                                }
                                                if ((var63 & 0x2) == 2) {
                                                    class339.field4777 += class200.field2897;
                                                }
                                            }
                                            if (class52.field817 < -50) {
                                                class137.field2071 = 2;
                                            }
                                            if (class52.field817 > 50) {
                                                class137.field2071 = -2;
                                            }
                                            if (class339.field4777 < -55) {
                                                class200.field2897 = 2;
                                            }
                                            if (class339.field4777 > 55) {
                                                class200.field2897 = -2;
                                            }
                                            if (class333.field4696 < -40) {
                                                class61.field930 = 1;
                                            }
                                            class405.field6121++;
                                            if (class333.field4696 > 40) {
                                                class61.field930 = -1;
                                            }
                                            if (class405.field6121 > 500) {
                                                class405.field6121 = 0;
                                                int var64 = (int) (Math.random() * 8.0D);
                                                if ((var64 & 0x2) == 2) {
                                                    class410.field6171 += class178.field2616;
                                                }
                                                if ((var64 & 0x1) == 1) {
                                                    class289.field4132 += class527.field7789;
                                                }
                                            }
                                            if (class289.field4132 < -60) {
                                                class527.field7789 = 2;
                                            }
                                            if (class289.field4132 > 60) {
                                                class527.field7789 = -2;
                                            }
                                            if (class410.field6171 < -20) {
                                                class178.field2616 = 1;
                                            }
                                            if (class410.field6171 > 10) {
                                                class178.field2616 = -1;
                                            }
                                            class248.field3637++;
                                            if (class248.field3637 > 50) {
                                                class390.field5879++;
                                                class291.method1861((byte) -104, class315.field4490);
                                            }
                                            if (class223.field3289) {
                                                class213.method1488((byte) -120);
                                                class223.field3289 = false;
                                            }
                                            try {
                                                if (class90.field1361 != null && class356.field5471.field3037 > 0) {
                                                    class476.field7003 += class356.field5471.field3037;
                                                    class90.field1361.method2311(class356.field5471.field3037, class356.field5471.field3036, arg0 ^ 0x31BF, 0);
                                                    class248.field3637 = 0;
                                                    class356.field5471.field3037 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var65) {
                                                class361.method2250((byte) -31);
                                                return;
                                            }
                                        }
                                        var59 = var58.field2488;
                                        if (var59.field547 < 0) {
                                            break;
                                        }
                                        var60 = class149.method979((byte) -96, var59.field480);
                                    } while (var60 == null || var60.field452 == null || var60.field452.length <= var59.field547 || var60.field452[var59.field547] != var59);
                                    class360.method2238(var58);
                                }
                            }
                            var56 = var55.field2488;
                            if (var56.field547 < 0) {
                                break;
                            }
                            var57 = class149.method979((byte) -103, var56.field480);
                        } while (var57 == null || var57.field452 == null || var56.field547 >= var57.field452.length || var57.field452[var56.field547] != var56);
                        class360.method2238(var55);
                    }
                }
                var53 = var52.field2488;
                if (var53.field547 < 0) {
                    break;
                }
                var54 = class149.method979((byte) -126, var53.field480);
            } while (var54 == null || var54.field452 == null || var53.field547 >= var54.field452.length || var54.field452[var53.field547] != var53);
            class360.method2238(var52);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "([BILrt;[I)Z")
    public final boolean method308(byte[] arg0, int arg1, class150 arg2, int[] arg3) {
        field784++;
        boolean var5 = true;
        int var6 = arg1;
        class319 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field789[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method981(var9 >> 2, arg3, (byte) 106);
                        } else {
                            var7 = arg2.method984((byte) -67, arg3, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field787[var8] = var7;
                        this.field789[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
    public class49() {
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "([B)V")
    public class49(byte[] arg0) {
        this.field793 = new byte[128];
        this.field792 = new class87[128];
        this.field781 = new byte[128];
        this.field791 = new byte[128];
        this.field787 = new class319[128];
        this.field788 = new short[128];
        this.field789 = new int[128];
        class209 var2 = new class209(arg0);
        int var3;
        for (var3 = 0; var2.field3036[var2.field3037 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1417(false);
        }
        var3++;
        var2.field3037++;
        int var6 = var2.field3037;
        var2.field3037 += var3;
        int var7;
        for (var7 = 0; var2.field3036[var2.field3037 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1417(false);
        }
        var2.field3037++;
        var7++;
        int var10 = var2.field3037;
        var2.field3037 += var7;
        int var11;
        for (var11 = 0; var2.field3036[var2.field3037 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1417(false);
        }
        var11++;
        var2.field3037++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            int var16 = 1;
            var15 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method1428(32122);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var105) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class87[] var18 = new class87[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class87 var102 = var18[var19] = new class87();
            int var103 = var2.method1428(32122);
            if (var103 > 0) {
                var102.field1330 = new byte[var103 * 2];
            }
            int var104 = var2.method1428(32122);
            if (var104 > 0) {
                var102.field1331 = new byte[var104 * 2 + 2];
                var102.field1331[1] = 64;
            }
        }
        int var20 = var2.method1428(32122);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var2.method1428(32122);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var2.field3036[var2.field3037 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method1417(false);
        }
        var24++;
        var2.field3037++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method1428(32122);
            this.field788[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method1428(32122);
            this.field788[var30] = (short) (this.field788[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var32 >= var25.length) {
                    var31 = -1;
                } else {
                    var31 = var25[var32++];
                }
                var33 = var2.method1444(true);
            }
            this.field788[var34] = (short) (this.field788[var34] + (class286.method1847(2, var33 - 1) << 14));
            var31--;
            this.field789[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field789[var38] != 0) {
                if (var36 == 0) {
                    var37 = var2.field3036[var6++] - 1;
                    if (var35 < var4.length) {
                        var36 = var4[var35++];
                    } else {
                        var36 = -1;
                    }
                }
                this.field791[var38] = (byte) var37;
                var36--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field789[var42] != 0) {
                if (var39 == 0) {
                    var41 = var2.field3036[var10++] + 16 << 2;
                    if (var8.length <= var40) {
                        var39 = -1;
                    } else {
                        var39 = var8[var40++];
                    }
                }
                this.field781[var42] = (byte) var41;
                var39--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class87 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field789[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var44 >= var12.length) {
                        var43 = -1;
                    } else {
                        var43 = var12[var44++];
                    }
                }
                this.field792[var46] = var45;
                var43--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var48 >= var25.length) {
                    var47 = -1;
                } else {
                    var47 = var25[var48++];
                }
                if (this.field789[var50] > 0) {
                    var49 = var2.method1428(32122) + 1;
                }
            }
            this.field793[var50] = (byte) var49;
            var47--;
        }
        this.field782 = var2.method1428(32122) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class87 var99 = var18[var51];
            if (var99.field1330 != null) {
                for (int var100 = 1; var100 < var99.field1330.length; var100 += 2) {
                    var99.field1330[var100] = var2.method1417(false);
                }
            }
            if (var99.field1331 != null) {
                for (int var101 = 3; var101 < (var99.field1331.length - 2); var101 += 2) {
                    var99.field1331[var101] = var2.method1417(false);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method1417(false);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method1417(false);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class87 var96 = var18[var54];
            if (var96.field1331 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field1331.length; var98 += 2) {
                    var97 = var97 + var2.method1428(32122) + 1;
                    var96.field1331[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class87 var93 = var18[var55];
            if (var93.field1330 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field1330.length; var95 += 2) {
                    var94 = var94 + var2.method1428(32122) + 1;
                    var93.field1330[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method1428(32122);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var2.method1428(32122) + var56 + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field793[var60] = (byte) (this.field793[var60] * var59 + 32 >> 6);
            }
            for (int var61 = 2; var61 < var21.length; var61 += 2) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) * var59 + ((var64 - var58) / 2);
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class238.method1607(var64 - var58, true, var66);
                    this.field793[var67] = (byte) (this.field793[var67] * var68 + 32 >> 6);
                    var66 += var65 - var59;
                }
                var58 = var64;
                var59 = var65;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field793[var63] = (byte) (this.field793[var63] * var59 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var2.method1428(32122);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var69 + var2.method1428(32122) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field781[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field781[var73] = (byte) var84;
            }
            for (int var74 = 2; var74 < var23.length; var74 += 2) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class238.method1607(var78 - var71, true, var80);
                    int var83 = (this.field781[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    var80 += var79 - var72;
                    this.field781[var81] = (byte) var83;
                }
                var72 = var79;
                var71 = var78;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field781[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field781[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field1328 = var2.method1428(32122);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class87 var92 = var18[var86];
            if (var92.field1330 != null) {
                var92.field1332 = var2.method1428(32122);
            }
            if (var92.field1331 != null) {
                var92.field1333 = var2.method1428(32122);
            }
            if (var92.field1328 > 0) {
                var92.field1337 = var2.method1428(32122);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field1336 = var2.method1428(32122);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class87 var91 = var18[var88];
            if (var91.field1336 > 0) {
                var91.field1335 = var2.method1428(32122);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class87 var90 = var18[var89];
            if (var90.field1335 > 0) {
                var90.field1329 = var2.method1428(32122);
            }
        }
    }

    static {
        new class475("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        field795 = new class266();
    }
}
