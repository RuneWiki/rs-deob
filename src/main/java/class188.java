import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class188 extends class24 {

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "Luf;")
    public class168 field2985;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public static int field2984 = 1;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "Lpc;")
    public static class12 field2983 = new class12();

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "Luf;")
    public static class168 field2986 = class148.method1019(-1720, "_");

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "I")
    public static int field2988 = 0;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "Lfj;")
    public static class283 field2987;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V", line = 7)
    public static void method1327(int arg0) {
        int var1 = 69 / ((arg0 + 14) / 35);
        field2983 = null;
        field2986 = null;
        field2987 = null;
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)Z", line = 21)
    public static final boolean method1328(int arg0) {
        field2981++;
        long var1 = class194.method1368((byte) 64);
        int var3 = (int) (var1 - class294.field4989);
        if (var3 > 200) {
            var3 = 200;
        }
        class279.field4688 += var3;
        class294.field4989 = var1;
        if (class242.field3967 == 0 && class233.field3740 == 0 && class189.field3007 == 0 && class43.field527 == 0) {
            return true;
        } else if (class270.field4537 == null) {
            return false;
        } else {
            try {
                if (class279.field4688 > 30000) {
                    throw new IOException();
                }
                while (class233.field3740 < 20 && class43.field527 > 0) {
                    class221 var4 = (class221) class143.field2199.method499((byte) -99);
                    class153 var5 = new class153(4);
                    var5.method1095(1, -39);
                    var5.method1097(-979940696, (int) var4.field292);
                    class270.field4537.method1233((byte) 125, var5.field2359, 4, 0);
                    class65.field869.method490(var4, var4.field292, true);
                    class233.field3740++;
                    class43.field527--;
                }
                while (class242.field3967 < 20 && class189.field3007 > 0) {
                    class221 var6 = (class221) class5.field71.method1884(11109);
                    class153 var7 = new class153(4);
                    var7.method1095(0, -30);
                    var7.method1097(arg0 ^ 0xC5974AA8, (int) var6.field292);
                    class270.field4537.method1233((byte) 127, var7.field2359, 4, 0);
                    var6.method1464((byte) 84);
                    class206.field3383.method490(var6, var6.field292, true);
                    class189.field3007--;
                    class242.field3967++;
                }
                for (int var8 = arg0; var8 < 100; var8++) {
                    int var9 = class270.field4537.method1227(0);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class279.field4688 = 0;
                    byte var10 = 0;
                    if (class101.field1576 == null) {
                        var10 = 8;
                    } else if (class18.field215 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - class138.field2125.field2367;
                        if (var11 > var9) {
                            var11 = var9;
                        }
                        class270.field4537.method1226(class138.field2125.field2359, 14451, class138.field2125.field2367, var11);
                        if (class303.field5102 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                class138.field2125.field2359[class138.field2125.field2367 + var12] = (byte) class289.method1988(class138.field2125.field2359[class138.field2125.field2367 + var12], class303.field5102);
                            }
                        }
                        class138.field2125.field2367 += var11;
                        if (var10 > class138.field2125.field2367) {
                            break;
                        }
                        if (class101.field1576 == null) {
                            class138.field2125.field2367 = 0;
                            int var13 = class138.field2125.method1042((byte) -83);
                            int var14 = class138.field2125.method1069(32);
                            int var15 = class138.field2125.method1042((byte) -77);
                            int var16 = class138.field2125.method1089((byte) -14);
                            long var17 = (long) ((var13 << 16) + var14);
                            class221 var19 = (class221) class65.field869.method493(var17, 60);
                            class168.field2687 = true;
                            if (var19 == null) {
                                var19 = (class221) class206.field3383.method493(var17, 86);
                                class168.field2687 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            class101.field1576 = var19;
                            int var20 = var15 == 0 ? 5 : 9;
                            class23.field285 = new class153(class101.field1576.field3590 + var20 + var16);
                            class23.field285.method1095(var15, -99);
                            class23.field285.method1045(var16, (byte) 9);
                            class138.field2125.field2367 = 0;
                            class18.field215 = 8;
                        } else if (class18.field215 == 0) {
                            if (class138.field2125.field2359[0] == -1) {
                                class138.field2125.field2367 = 0;
                                class18.field215 = 1;
                            } else {
                                class101.field1576 = null;
                            }
                        }
                    } else {
                        int var21 = class23.field285.field2359.length - class101.field1576.field3590;
                        int var22 = 512 - class18.field215;
                        if (var22 > (var21 - class23.field285.field2367)) {
                            var22 = var21 - class23.field285.field2367;
                        }
                        if (var9 < var22) {
                            var22 = var9;
                        }
                        class270.field4537.method1226(class23.field285.field2359, 14451, class23.field285.field2367, var22);
                        if (class303.field5102 != 0) {
                            for (int var23 = 0; var23 < var22; var23++) {
                                class23.field285.field2359[class23.field285.field2367 + var23] = (byte) class289.method1988(class23.field285.field2359[class23.field285.field2367 + var23], class303.field5102);
                            }
                        }
                        class23.field285.field2367 += var22;
                        class18.field215 += var22;
                        if (class23.field285.field2367 == var21) {
                            if (class101.field1576.field292 == 16711935L) {
                                class114.field1779 = class23.field285;
                                for (int var24 = 0; var24 < 256; var24++) {
                                    class283 var25 = class25.field305[var24];
                                    if (var25 != null) {
                                        class114.field1779.field2367 = var24 * 8 + 5;
                                        int var26 = class114.field1779.method1089((byte) -14);
                                        int var27 = class114.field1779.method1089((byte) -14);
                                        var25.method1957(var26, var27, (byte) 114);
                                    }
                                }
                            } else {
                                class236.field3769.reset();
                                class236.field3769.update(class23.field285.field2359, 0, var21);
                                int var28 = (int) class236.field3769.getValue();
                                if (class101.field1576.field3584 != var28) {
                                    try {
                                        class270.field4537.method1229(arg0 + 545);
                                    } catch (Exception var33) {
                                    }
                                    class272.field4581++;
                                    class303.field5102 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    class270.field4537 = null;
                                    return false;
                                }
                                class214.field3497 = 0;
                                class272.field4581 = 0;
                                class101.field1576.field3587.method1958((int) (class101.field1576.field292 & 0xFFFFL), (class101.field1576.field292 & 0xFF0000L) == 16711680L, class23.field285.field2359, arg0 + 117, class168.field2687);
                            }
                            class101.field1576.method124((byte) 62);
                            if (class168.field2687) {
                                class233.field3740--;
                            } else {
                                class242.field3967--;
                            }
                            class18.field215 = 0;
                            class23.field285 = null;
                            class101.field1576 = null;
                        } else {
                            if (class18.field215 != 512) {
                                break;
                            }
                            class18.field215 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var34) {
                try {
                    class270.field4537.method1229(545);
                } catch (Exception var32) {
                }
                class270.field4537 = null;
                class214.field3497++;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V", line = 323)
    public class188() {
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Luf;)V", line = 327)
    public class188(class168 arg0) {
        this.field2985 = arg0;
    }
}
