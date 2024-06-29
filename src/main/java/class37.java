import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class37 {

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "Lij;")
    public static class50 field713 = class78.method578(126, " weitere Optionen");

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "Lij;")
    public static class50 field716 = class78.method578(127, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "Lwi;")
    public static class21 field715;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "Lhk;")
    public static class83 field719;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V")
    public static final void method297(int arg0, int arg1) {
        if (arg0 != 31132) {
            method300(124);
        }
        class33 var2 = class112.field1978;
        synchronized (class112.field1978) {
            class63.field1215 = arg1;
        }
        field714++;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static final void method298(int arg0) {
        class25.field538.method762((byte) 117);
        class123.field2164.method762((byte) 117);
        field717++;
        if (arg0 != 0) {
            method301((byte) 54);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)V")
    public static final void method299(byte arg0, int arg1) {
        class25.field538.method770(true, arg1);
        if (arg0 < -40) {
            class123.field2164.method770(true, arg1);
            field712++;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V")
    public static void method300(int arg0) {
        if (arg0 == -28655) {
            field715 = null;
            field713 = null;
            field719 = null;
            field716 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)Z")
    public static final boolean method301(byte arg0) {
        long var1 = class104.method785(-1);
        field718++;
        int var3 = (int) (var1 - class20.field418);
        if (var3 > 200) {
            var3 = 200;
        }
        class48.field867 += var3;
        class20.field418 = var1;
        if (class239.field4108 == 0 && class122.field2151 == 0 && class160.field2752 == 0 && class125.field2190 == 0) {
            return true;
        } else if (class20.field425 == null) {
            return false;
        } else {
            try {
                if (class48.field867 > 30000) {
                    throw new IOException();
                }
                while (class122.field2151 < 20 && class125.field2190 > 0) {
                    class142 var4 = (class142) class154.field2686.method446(1);
                    class217 var5 = new class217(4);
                    var5.method1471(1, (byte) 24);
                    var5.method1440(-2724, (int) var4.field635);
                    class20.field425.method632(0, var5.field3633, 4, true);
                    class104.field1898.method445(85, var4.field635, var4);
                    class125.field2190--;
                    class122.field2151++;
                }
                if (arg0 < 98) {
                    method297(2, 31);
                }
                while (class239.field4108 < 20 && class160.field2752 > 0) {
                    class142 var6 = (class142) class254.field4388.method1684(-1128);
                    class217 var7 = new class217(4);
                    var7.method1471(0, (byte) 24);
                    var7.method1440(-2724, (int) var6.field635);
                    class20.field425.method632(0, var7.field3633, 4, true);
                    var6.method1693(63);
                    class136.field2345.method445(103, var6.field635, var6);
                    class239.field4108++;
                    class160.field2752--;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class20.field425.method631((byte) -33);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class48.field867 = 0;
                    byte var10 = 0;
                    if (class54.field979 == null) {
                        var10 = 8;
                    } else if (class87.field1689 == 0) {
                        var10 = 1;
                    }
                    if (var10 <= 0) {
                        int var11 = class260.field4525.field3633.length - class54.field979.field2481;
                        int var12 = 512 - class87.field1689;
                        if (var11 - class260.field4525.field3581 < var12) {
                            var12 = var11 - class260.field4525.field3581;
                        }
                        if (var9 < var12) {
                            var12 = var9;
                        }
                        class20.field425.method633(false, class260.field4525.field3633, class260.field4525.field3581, var12);
                        if (class118.field2088 != 0) {
                            for (int var13 = 0; var13 < var12; var13++) {
                                class260.field4525.field3633[class260.field4525.field3581 + var13] = (byte) class201.method1339(class260.field4525.field3633[class260.field4525.field3581 + var13], class118.field2088);
                            }
                        }
                        class260.field4525.field3581 += var12;
                        class87.field1689 += var12;
                        if (class260.field4525.field3581 == var11) {
                            if (class54.field979.field635 == 16711935L) {
                                class259.field4513 = class260.field4525;
                                for (int var14 = 0; var14 < 256; var14++) {
                                    class21 var15 = class99.field1825[var14];
                                    if (var15 != null) {
                                        class259.field4513.field3581 = var14 * 8 + 5;
                                        int var16 = class259.field4513.method1466((byte) -15);
                                        int var17 = class259.field4513.method1466((byte) -15);
                                        var15.method156(var16, var17, 255);
                                    }
                                }
                            } else {
                                class191.field3164.reset();
                                class191.field3164.update(class260.field4525.field3633, 0, var11);
                                int var18 = (int) class191.field3164.getValue();
                                if (class54.field979.field2493 != var18) {
                                    try {
                                        class20.field425.method630(2);
                                    } catch (Exception var30) {
                                    }
                                    class196.field3254++;
                                    class118.field2088 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    class20.field425 = null;
                                    return false;
                                }
                                class196.field3254 = 0;
                                class133.field2319 = 0;
                                class54.field979.field2487.method158(class260.field4525.field3633, (class54.field979.field635 & 0xFF0000L) == 16711680L, (byte) 107, class118.field2089, (int) (class54.field979.field635 & 0xFFFFL));
                            }
                            class54.field979.method267(-72);
                            if (class118.field2089) {
                                class122.field2151--;
                            } else {
                                class239.field4108--;
                            }
                            class260.field4525 = null;
                            class87.field1689 = 0;
                            class54.field979 = null;
                        } else {
                            if (class87.field1689 != 512) {
                                break;
                            }
                            class87.field1689 = 0;
                        }
                    } else {
                        int var19 = var10 - class59.field1076.field3581;
                        if (var19 > var9) {
                            var19 = var9;
                        }
                        class20.field425.method633(false, class59.field1076.field3633, class59.field1076.field3581, var19);
                        if (class118.field2088 != 0) {
                            for (int var20 = 0; var20 < var19; var20++) {
                                class59.field1076.field3633[class59.field1076.field3581 + var20] = (byte) class201.method1339(class59.field1076.field3633[class59.field1076.field3581 + var20], class118.field2088);
                            }
                        }
                        class59.field1076.field3581 += var19;
                        if (class59.field1076.field3581 < var10) {
                            break;
                        }
                        if (class54.field979 == null) {
                            class59.field1076.field3581 = 0;
                            int var21 = class59.field1076.method1487(255);
                            int var22 = class59.field1076.method1441(-61);
                            int var23 = class59.field1076.method1487(255);
                            int var24 = class59.field1076.method1466((byte) -15);
                            long var25 = (long) ((var21 << 16) + var22);
                            class142 var27 = (class142) class104.field1898.method443(var25, (byte) 119);
                            class118.field2089 = true;
                            if (var27 == null) {
                                var27 = (class142) class136.field2345.method443(var25, (byte) 68);
                                class118.field2089 = false;
                            }
                            if (var27 == null) {
                                throw new IOException();
                            }
                            int var28 = var23 == 0 ? 5 : 9;
                            class54.field979 = var27;
                            class260.field4525 = new class217(var24 + class54.field979.field2481 + var28);
                            class260.field4525.method1471(var23, (byte) 24);
                            class260.field4525.method1446(-90, var24);
                            class87.field1689 = 8;
                            class59.field1076.field3581 = 0;
                        } else if (class87.field1689 == 0) {
                            if (class59.field1076.field3633[0] == -1) {
                                class59.field1076.field3581 = 0;
                                class87.field1689 = 1;
                            } else {
                                class54.field979 = null;
                            }
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class20.field425.method630(2);
                } catch (Exception var29) {
                }
                class133.field2319++;
                class20.field425 = null;
                return false;
            }
        }
    }
}
