import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class157 extends class212 {

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "Lod;")
    public class154 field2716;

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "[I")
    public static int[] field2717 = new int[100];

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "Lqe;")
    public static class168 field2718 = class66.method448("Ausw-=hlen", -128);

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "[I")
    public static int[] field2721 = new int[32];

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "(I)Z")
    public static final boolean method1026(int arg0) {
        field2720++;
        long var1 = class59.method407(-37);
        int var3 = (int) (var1 - class154.field2683);
        if (var3 > 200) {
            var3 = 200;
        }
        class73.field1112 += var3;
        class154.field2683 = var1;
        if (class115.field1888 == 0 && class134.field2338 == 0 && client.field534 == 0 && class213.field3686 == 0) {
            return true;
        } else if (class148.field2583 == null) {
            return false;
        } else {
            try {
                if (class73.field1112 > 30000) {
                    throw new IOException();
                }
                while (class134.field2338 < 20 && class213.field3686 > 0) {
                    class186 var4 = (class186) class122.field2020.method1536(104);
                    class112 var5 = new class112(4);
                    var5.method768(1, 7295);
                    var5.method748(979698984, (int) var4.field3308);
                    class148.field2583.method1650(12398, 0, var5.field1780, 4);
                    class169.field2926.method1533(var4.field3308, -113, var4);
                    class213.field3686--;
                    class134.field2338++;
                }
                while (class115.field1888 < 20 && client.field534 > 0) {
                    class186 var6 = (class186) class163.field2797.method397(true);
                    class112 var7 = new class112(4);
                    var7.method768(0, 7295);
                    var7.method748(979698984, (int) var6.field3308);
                    class148.field2583.method1650(12398, 0, var7.field1780, 4);
                    var6.method1369(-124);
                    class257.field4492.method1533(var6.field3308, 65, var6);
                    class115.field1888++;
                    client.field534--;
                }
                if (arg0 <= 100) {
                    field2718 = null;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class148.field2583.method1648(-115);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class73.field1112 = 0;
                    byte var10 = 0;
                    if (class159.field2744 == null) {
                        var10 = 8;
                    } else if (class56.field776 == 0) {
                        var10 = 1;
                    }
                    if (var10 <= 0) {
                        int var11 = class112.field1843.field1780.length - class159.field2744.field3284;
                        int var12 = 512 - class56.field776;
                        if (var11 - class112.field1843.field1821 < var12) {
                            var12 = var11 - class112.field1843.field1821;
                        }
                        if (var12 > var9) {
                            var12 = var9;
                        }
                        class148.field2583.method1652(-1, var12, class112.field1843.field1780, class112.field1843.field1821);
                        if (class9.field104 != 0) {
                            for (int var13 = 0; var13 < var12; var13++) {
                                class112.field1843.field1780[class112.field1843.field1821 + var13] = (byte) class45.method298(class112.field1843.field1780[class112.field1843.field1821 + var13], class9.field104);
                            }
                        }
                        class112.field1843.field1821 += var12;
                        class56.field776 += var12;
                        if (class112.field1843.field1821 == var11) {
                            if (class159.field2744.field3308 == 16711935L) {
                                class88.field1370 = class112.field1843;
                                for (int var15 = 0; var15 < 256; var15++) {
                                    class207 var16 = class80.field1210[var15];
                                    if (var16 != null) {
                                        class88.field1370.field1821 = var15 * 8 + 5;
                                        int var17 = class88.field1370.method769((byte) -86);
                                        int var18 = class88.field1370.method769((byte) -86);
                                        var16.method1340((byte) -98, var17, var18);
                                    }
                                }
                            } else {
                                class120.field1957.reset();
                                class120.field1957.update(class112.field1843.field1780, 0, var11);
                                int var14 = (int) class120.field1957.getValue();
                                if (class159.field2744.field3279 != var14) {
                                    try {
                                        class148.field2583.method1653(96);
                                    } catch (Exception var30) {
                                    }
                                    class249.field4311++;
                                    class9.field104 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class148.field2583 = null;
                                    return false;
                                }
                                class249.field4313 = 0;
                                class249.field4311 = 0;
                                class159.field2744.field3274.method1341((class159.field2744.field3308 & 0xFF0000L) == 16711680L, 355362984, class112.field1843.field1780, (int) (class159.field2744.field3308 & 0xFFFFL), class25.field300);
                            }
                            class159.field2744.method1234(17216);
                            class112.field1843 = null;
                            class56.field776 = 0;
                            if (class25.field300) {
                                class134.field2338--;
                            } else {
                                class115.field1888--;
                            }
                            class159.field2744 = null;
                        } else {
                            if (class56.field776 != 512) {
                                break;
                            }
                            class56.field776 = 0;
                        }
                    } else {
                        int var19 = var10 - class245.field4251.field1821;
                        if (var9 < var19) {
                            var19 = var9;
                        }
                        class148.field2583.method1652(-1, var19, class245.field4251.field1780, class245.field4251.field1821);
                        if (class9.field104 != 0) {
                            for (int var20 = 0; var20 < var19; var20++) {
                                class245.field4251.field1780[class245.field4251.field1821 + var20] = (byte) class45.method298(class245.field4251.field1780[class245.field4251.field1821 + var20], class9.field104);
                            }
                        }
                        class245.field4251.field1821 += var19;
                        if (var10 > class245.field4251.field1821) {
                            break;
                        }
                        if (class159.field2744 == null) {
                            class245.field4251.field1821 = 0;
                            int var21 = class245.field4251.method758(true);
                            int var22 = class245.field4251.method731(false);
                            long var23 = (long) ((var21 << 16) + var22);
                            int var25 = class245.field4251.method758(true);
                            int var26 = class245.field4251.method769((byte) -86);
                            class186 var27 = (class186) class169.field2926.method1527(var23, (byte) -118);
                            class25.field300 = true;
                            if (var27 == null) {
                                var27 = (class186) class257.field4492.method1527(var23, (byte) -89);
                                class25.field300 = false;
                            }
                            if (var27 == null) {
                                throw new IOException();
                            }
                            class159.field2744 = var27;
                            int var28 = var25 == 0 ? 5 : 9;
                            class112.field1843 = new class112(class159.field2744.field3284 + var26 + var28);
                            class112.field1843.method768(var25, 7295);
                            class112.field1843.method770(var26, (byte) -10);
                            class245.field4251.field1821 = 0;
                            class56.field776 = 8;
                        } else if (class56.field776 == 0) {
                            if (class245.field4251.field1780[0] == -1) {
                                class245.field4251.field1821 = 0;
                                class56.field776 = 1;
                            } else {
                                class159.field2744 = null;
                            }
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class148.field2583.method1653(91);
                } catch (Exception var29) {
                }
                class249.field4313++;
                class148.field2583 = null;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "(I)V")
    public static void method1027(int arg0) {
        field2721 = null;
        if (arg0 != 0) {
            field2718 = null;
        }
        field2718 = null;
        field2717 = null;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V")
    public static final void method1028(byte arg0) {
        int var1 = -76 / ((arg0 + 67) / 47);
        class166.method1064((byte) 111);
        field2715++;
        System.gc();
        class84.method555(5, 25);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZI)V")
    public static final void method1029(boolean arg0, int arg1) {
        int var2 = class132.field2322;
        if (arg0) {
            var2 = 1;
        }
        if (class7.field85.field190 >> 7 == class163.field2803 && class7.field85.field166 >> 7 == class29.field351) {
            class163.field2803 = 0;
        }
        if (arg1 != -65) {
            method1028((byte) -63);
        }
        for (int var3 = 0; var3 < var2; var3++) {
            long var4;
            class121 var6;
            if (arg0) {
                var4 = 8791798054912L;
                var6 = class7.field85;
            } else {
                var4 = (long) class115.field1868[var3] << 32;
                var6 = class104.field1677[class115.field1868[var3]];
            }
            if (var6 != null && var6.method87(-1570135920)) {
                int var7 = var6.field190 >> 7;
                int var8 = var6.field166 >> 7;
                var6.field1976 = false;
                if ((class17.field149 && class132.field2322 > 200 || class132.field2322 > 50) && !arg0 && var6.field224 == var6.field223) {
                    var6.field1976 = true;
                }
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var6.field2007 == null || class133.field2326 < var6.field1985 || var6.field1991 <= class133.field2326) {
                        if ((var6.field190 & 0x7F) == 64 && (var6.field166 & 0x7F) == 64) {
                            if (class125.field2058[var7][var8] == class237.field4073) {
                                continue;
                            }
                            class125.field2058[var7][var8] = class237.field4073;
                        }
                        var6.field202 = class236.method1535(var6.field190, class196.field3401, var6.field166, 0);
                        class241.method1574(class196.field3401, var6.field190, var6.field166, var6.field202, 60, var6, var6.field194, var4, var6.field213);
                    } else {
                        var6.field1976 = false;
                        var6.field202 = class236.method1535(var6.field190, class196.field3401, var6.field166, 0);
                        class123.method836(class196.field3401, var6.field190, var6.field166, var6.field202, var6, var6.field194, var4, var6.field1998, var6.field1997, var6.field1986, var6.field1992);
                    }
                }
            }
        }
        field2719++;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lod;)V")
    public class157(class154 arg0) {
        this.field2716 = arg0;
    }
}
