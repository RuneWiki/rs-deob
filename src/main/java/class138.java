import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class138 extends class110 {

    @OriginalMember(owner = "client!vb", name = "V", descriptor = "Lmb;")
    private static class84 field3323 = class79.method672(true, "shake:");

    @OriginalMember(owner = "client!vb", name = "Z", descriptor = "Lmb;")
    public static class84 field3327 = class79.method672(true, "Zu viele Verbindungen von Ihrer Adresse)3");

    @OriginalMember(owner = "client!vb", name = "cb", descriptor = "Z")
    public static boolean field3330 = false;

    @OriginalMember(owner = "client!vb", name = "fb", descriptor = "Lmb;")
    public static class84 field3333 = field3323;

    @OriginalMember(owner = "client!vb", name = "W", descriptor = "[I")
    public static int[] field3324 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!vb", name = "Y", descriptor = "Lmb;")
    public static class84 field3326 = class79.method672(true, "Unerwartete Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!vb", name = "mb", descriptor = "Lmb;")
    private static class84 field3340 = class79.method672(true, "Create a free account");

    @OriginalMember(owner = "client!vb", name = "ab", descriptor = "Lmb;")
    public static class84 field3328 = field3340;

    @OriginalMember(owner = "client!vb", name = "jb", descriptor = "[I")
    public static int[] field3337 = new int[2000];

    @OriginalMember(owner = "client!vb", name = "gb", descriptor = "Lmb;")
    public static class84 field3334 = class79.method672(true, "Keine Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!vb", name = "kb", descriptor = "Lmb;")
    public static class84 field3338 = class79.method672(true, "m-Ochte sich mit Ihnen duellieren)3");

    @OriginalMember(owner = "client!vb", name = "U", descriptor = "Lmb;")
    public static class84 field3322 = class79.method672(true, "@cya@");

    @OriginalMember(owner = "client!vb", name = "T", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!vb", name = "X", descriptor = "I")
    public int field3325;

    @OriginalMember(owner = "client!vb", name = "bb", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!vb", name = "eb", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!vb", name = "hb", descriptor = "I")
    public int field3335;

    @OriginalMember(owner = "client!vb", name = "ib", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!vb", name = "lb", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!vb", name = "nb", descriptor = "I")
    public int field3341;

    @OriginalMember(owner = "client!vb", name = "S", descriptor = "Lsd;")
    public static class122 field3320;

    @OriginalMember(owner = "client!vb", name = "db", descriptor = "Lsd;")
    public static class122 field3331;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lhb;BI)V")
    private final void method1125(class51 arg0, byte arg1, int arg2) {
        if (arg1 < 110) {
            field3328 = null;
        }
        if (arg2 == 1) {
            this.field3335 = arg0.method383(-2056200760);
            this.field3341 = arg0.method373(25094);
            this.field3325 = arg0.method373(25094);
        }
        field3321++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILka;IB)V")
    public static final void method1126(int arg0, int arg1, class70 arg2, int arg3, byte arg4) {
        field3339++;
        if (class122.field2934 >= 50 || class140.field3359 == 0 || (arg2.field1711 == null || arg2.field1711.length <= arg1)) {
            return;
        }
        int var5 = arg2.field1711[arg1];
        if (var5 == 0) {
            return;
        }
        int var6 = var5 >> 4 & 0x7;
        int var7 = var5 >> 8;
        class50.field1069[class122.field2934] = var7;
        int var8 = var5 & 0xF;
        if (arg4 != 10) {
            method1129(-1);
        }
        class52.field1182[class122.field2934] = var6;
        int var9 = (arg3 - 64) / 128;
        int var10 = (arg0 - 64) / 128;
        class39.field888[class122.field2934] = 0;
        class111.field2676[class122.field2934] = null;
        class1.field6[class122.field2934] = (var10 << 16) + (var9 << 8) + var8;
        class122.field2934++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLhb;)V")
    public final void method1127(byte arg0, class51 arg1) {
        while (true) {
            int var3 = arg1.method373(25094);
            if (var3 == 0) {
                if (arg0 <= 123) {
                    field3334 = null;
                }
                field3336++;
                return;
            }
            this.method1125(arg1, (byte) 112, var3);
        }
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)Z")
    public static final boolean method1128(byte arg0) {
        long var1 = class77.method657(3745);
        field3329++;
        int var3 = (int) (var1 - class95.field2341);
        int var4 = 56 % ((arg0 - 7) / 60);
        class95.field2341 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class24.field565 += var3;
        if (class11.field190 == 0 && class102.field2488 == 0 && class66.field1627 == 0 && class92.field2285 == 0) {
            return true;
        } else if (class1.field3 == null) {
            return false;
        } else {
            try {
                if (class24.field565 > 30000) {
                    throw new IOException();
                }
                while (class102.field2488 < 20 && class92.field2285 > 0) {
                    class96 var5 = (class96) class36.field793.method962(true);
                    class51 var6 = new class51(4);
                    var6.method393(1, -17343);
                    var6.method386(-29267, (int) var5.field370);
                    class1.field3.method45(0, 4, (byte) 87, var6.field1084);
                    class58.field1448.method958(var5.field370, var5, -42);
                    class102.field2488++;
                    class92.field2285--;
                }
                while (class11.field190 < 20 && class66.field1627 > 0) {
                    class96 var7 = (class96) class122.field2928.method785(0);
                    class51 var8 = new class51(4);
                    var8.method393(0, -17343);
                    var8.method386(-29267, (int) var7.field370);
                    class1.field3.method45(0, 4, (byte) 87, var8.field1084);
                    var7.method899(107);
                    class44.field974.method958(var7.field370, var7, 118);
                    class66.field1627--;
                    class11.field190++;
                }
                for (int var9 = 0; var9 < 100; var9++) {
                    int var10 = class1.field3.method37(-87);
                    if (var10 < 0) {
                        throw new IOException();
                    }
                    if (var10 == 0) {
                        break;
                    }
                    class24.field565 = 0;
                    byte var11 = 0;
                    if (class128.field3093 == null) {
                        var11 = 8;
                    } else if (class19.field395 == 0) {
                        var11 = 1;
                    }
                    if (var11 <= 0) {
                        int var12 = class125.field3034.field1084.length - class128.field3093.field2381;
                        int var13 = 512 - class19.field395;
                        if (var12 - class125.field3034.field1128 < var13) {
                            var13 = var12 - class125.field3034.field1128;
                        }
                        if (var10 < var13) {
                            var13 = var10;
                        }
                        class1.field3.method40(class125.field3034.field1128, var13, -19746, class125.field3034.field1084);
                        if (class119.field2861 != 0) {
                            for (int var14 = 0; var14 < var13; var14++) {
                                class125.field3034.field1084[class125.field3034.field1128 + var14] = (byte) class13.method86(class125.field3034.field1084[class125.field3034.field1128 + var14], class119.field2861);
                            }
                        }
                        class19.field395 += var13;
                        class125.field3034.field1128 += var13;
                        if (class125.field3034.field1128 == var12) {
                            if (class128.field3093.field370 == 16711935L) {
                                class125.field3029 = class125.field3034;
                                for (int var16 = 0; var16 < 256; var16++) {
                                    class47 var17 = class38.field854[var16];
                                    if (var17 != null) {
                                        class125.field3029.field1128 = var16 * 4 + 5;
                                        int var18 = class125.field3029.method399(-539722392);
                                        var17.method339(var18, 99);
                                    }
                                }
                            } else {
                                class123.field2970.reset();
                                class123.field2970.update(class125.field3034.field1084, 0, var12);
                                int var15 = (int) class123.field2970.getValue();
                                if (class128.field3093.field2377 != var15) {
                                    try {
                                        class1.field3.method38((byte) 61);
                                    } catch (Exception var30) {
                                    }
                                    class119.field2861 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class1.field3 = null;
                                    class8.field127++;
                                    return false;
                                }
                                class58.field1450 = 0;
                                class8.field127 = 0;
                                class128.field3093.field2372.method337(class125.field3034.field1084, (byte) 119, (class128.field3093.field370 & 0xFF0000L) == 16711680L, (int) (class128.field3093.field370 & 0xFFFFL), class20.field417);
                            }
                            class128.field3093.method121(false);
                            class128.field3093 = null;
                            class19.field395 = 0;
                            class125.field3034 = null;
                            if (class20.field417) {
                                class102.field2488--;
                            } else {
                                class11.field190--;
                            }
                        } else {
                            if (class19.field395 != 512) {
                                break;
                            }
                            class19.field395 = 0;
                        }
                    } else {
                        int var19 = var11 - class72.field1764.field1128;
                        if (var19 > var10) {
                            var19 = var10;
                        }
                        class1.field3.method40(class72.field1764.field1128, var19, -19746, class72.field1764.field1084);
                        if (class119.field2861 != 0) {
                            for (int var20 = 0; var20 < var19; var20++) {
                                class72.field1764.field1084[class72.field1764.field1128 + var20] = (byte) class13.method86(class72.field1764.field1084[class72.field1764.field1128 + var20], class119.field2861);
                            }
                        }
                        class72.field1764.field1128 += var19;
                        if (class72.field1764.field1128 < var11) {
                            break;
                        }
                        if (class128.field3093 == null) {
                            class72.field1764.field1128 = 0;
                            int var21 = class72.field1764.method373(25094);
                            int var22 = class72.field1764.method383(-2056200760);
                            int var23 = class72.field1764.method373(25094);
                            int var24 = class72.field1764.method399(-539722392);
                            long var25 = (long) ((var21 << 16) + var22);
                            class96 var27 = (class96) class58.field1448.method959(true, var25);
                            class20.field417 = true;
                            if (var27 == null) {
                                var27 = (class96) class44.field974.method959(true, var25);
                                class20.field417 = false;
                            }
                            if (var27 == null) {
                                throw new IOException();
                            }
                            class128.field3093 = var27;
                            int var28 = var23 == 0 ? 5 : 9;
                            class125.field3034 = new class51(var24 + var28 + class128.field3093.field2381);
                            class125.field3034.method393(var23, -17343);
                            class125.field3034.method378(2, var24);
                            class19.field395 = 8;
                            class72.field1764.field1128 = 0;
                        } else if (class19.field395 == 0) {
                            if (class72.field1764.field1084[0] == -1) {
                                class72.field1764.field1128 = 0;
                                class19.field395 = 1;
                            } else {
                                class128.field3093 = null;
                            }
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class1.field3.method38((byte) 61);
                } catch (Exception var29) {
                }
                class1.field3 = null;
                class58.field1450++;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)V")
    public static void method1129(int arg0) {
        field3324 = null;
        field3320 = null;
        field3323 = null;
        field3337 = null;
        field3326 = null;
        field3333 = null;
        field3322 = null;
        field3334 = null;
        field3331 = null;
        if (arg0 != 512) {
            field3327 = null;
        }
        field3338 = null;
        field3328 = null;
        field3340 = null;
        field3327 = null;
    }
}
