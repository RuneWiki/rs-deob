import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class159 {

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Ltg;")
    public static class184 field500 = class135.method812(" (X", 3);

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "Lvb;")
    public static class197 field498;

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Z")
    private static final boolean method182(int arg0) {
        field507++;
        long var1 = class24.method165(arg0 + 128);
        int var3 = (int) (var1 - class66.field1273);
        if (var3 > 200) {
            var3 = 200;
        }
        class66.field1273 = var1;
        class14.field259 += var3;
        if (class146.field2638 == 0 && class6.field113 == 0 && class132.field2394 == 0 && class73.field1370 == 0) {
            return true;
        } else if (class182.field3503 == null) {
            return false;
        } else {
            try {
                if (class14.field259 > 30000) {
                    throw new IOException();
                }
                while (class6.field113 < 20 && class73.field1370 > 0) {
                    class83 var4 = (class83) class9.field159.method57(-19654);
                    class97 var5 = new class97(4);
                    var5.method583((byte) 14, 1);
                    var5.method595(65280, (int) var4.field2393);
                    class182.field3503.method514(4, 0, var5.field1809, -23422);
                    class212.field4101.method55((byte) -114, var4, var4.field2393);
                    class73.field1370--;
                    class6.field113++;
                }
                while (class146.field2638 < 20 && class132.field2394 > 0) {
                    class83 var6 = (class83) class2.field45.method919(arg0 ^ 0xFFFFFF9D);
                    class97 var7 = new class97(4);
                    var7.method583((byte) 14, 0);
                    var7.method595(65280, (int) var6.field2393);
                    class182.field3503.method514(4, 0, var7.field1809, -23422);
                    var6.method628((byte) -104);
                    class175.field3318.method55((byte) -79, var6, var6.field2393);
                    class132.field2394--;
                    class146.field2638++;
                }
                for (int var8 = arg0; var8 < 100; var8++) {
                    int var9 = class182.field3503.method519((byte) -99);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class14.field259 = 0;
                    byte var10 = 0;
                    if (class2.field55 == null) {
                        var10 = 8;
                    } else if (class60.field1111 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - class119.field2143.field1834;
                        if (var11 > var9) {
                            var11 = var9;
                        }
                        class182.field3503.method520(var11, class119.field2143.field1834, -1, class119.field2143.field1809);
                        if (class130.field2361 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                class119.field2143.field1809[class119.field2143.field1834 + var12] = (byte) class51.method283(class119.field2143.field1809[class119.field2143.field1834 + var12], class130.field2361);
                            }
                        }
                        class119.field2143.field1834 += var11;
                        if (var10 > class119.field2143.field1834) {
                            break;
                        }
                        if (class2.field55 == null) {
                            class119.field2143.field1834 = 0;
                            int var13 = class119.field2143.method588((byte) -58);
                            int var14 = class119.field2143.method611(false);
                            int var15 = class119.field2143.method588((byte) -67);
                            long var16 = (long) ((var13 << 16) + var14);
                            int var18 = class119.field2143.method599(-16003);
                            class83 var19 = (class83) class212.field4101.method51(var16, arg0 + 76);
                            class198.field3862 = true;
                            if (var19 == null) {
                                var19 = (class83) class175.field3318.method51(var16, arg0 - 99);
                                class198.field3862 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            class2.field55 = var19;
                            int var20 = var15 == 0 ? 5 : 9;
                            class47.field885 = new class97(var18 + var20 + class2.field55.field1485);
                            class47.field885.method583((byte) 14, var15);
                            class47.field885.method580(var18, false);
                            class119.field2143.field1834 = 0;
                            class60.field1111 = 8;
                        } else if (class60.field1111 == 0) {
                            if (class119.field2143.field1809[0] == -1) {
                                class119.field2143.field1834 = 0;
                                class60.field1111 = 1;
                            } else {
                                class2.field55 = null;
                            }
                        }
                    } else {
                        int var21 = class47.field885.field1809.length - class2.field55.field1485;
                        int var22 = 512 - class60.field1111;
                        if (var22 > var21 - class47.field885.field1834) {
                            var22 = var21 - class47.field885.field1834;
                        }
                        if (var22 > var9) {
                            var22 = var9;
                        }
                        class182.field3503.method520(var22, class47.field885.field1834, arg0 - 1, class47.field885.field1809);
                        if (class130.field2361 != 0) {
                            for (int var23 = 0; var23 < var22; var23++) {
                                class47.field885.field1809[class47.field885.field1834 + var23] = (byte) class51.method283(class47.field885.field1809[class47.field885.field1834 + var23], class130.field2361);
                            }
                        }
                        class47.field885.field1834 += var22;
                        class60.field1111 += var22;
                        if (class47.field885.field1834 == var21) {
                            if (class2.field55.field2393 == 16711935L) {
                                class202.field3897 = class47.field885;
                                for (int var24 = 0; var24 < 256; var24++) {
                                    class190 var25 = class170.field3232[var24];
                                    if (var25 != null) {
                                        class202.field3897.field1834 = var24 * 8 + 5;
                                        int var26 = class202.field3897.method599(arg0 ^ 0xFFFFC17D);
                                        int var27 = class202.field3897.method599(-16003);
                                        var25.method1212(var27, var26, arg0 - 12711);
                                    }
                                }
                            } else {
                                class143.field2572.reset();
                                class143.field2572.update(class47.field885.field1809, 0, var21);
                                int var28 = (int) class143.field2572.getValue();
                                if (class2.field55.field1486 != var28) {
                                    try {
                                        class182.field3503.method515(arg0 - 125);
                                    } catch (Exception var30) {
                                    }
                                    class130.field2348++;
                                    class130.field2361 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class182.field3503 = null;
                                    return false;
                                }
                                class130.field2348 = 0;
                                class43.field828 = 0;
                                class2.field55.field1474.method1211((byte) 121, (int) (class2.field55.field2393 & 0xFFFFL), class47.field885.field1809, class198.field3862, (class2.field55.field2393 & 0xFF0000L) == 16711680L);
                            }
                            class2.field55.method797((byte) -103);
                            class2.field55 = null;
                            if (class198.field3862) {
                                class6.field113--;
                            } else {
                                class146.field2638--;
                            }
                            class60.field1111 = 0;
                            class47.field885 = null;
                        } else {
                            if (class60.field1111 != 512) {
                                break;
                            }
                            class60.field1111 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class182.field3503.method515(arg0 + 114);
                } catch (Exception var29) {
                }
                class43.field828++;
                class182.field3503 = null;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public static void method183(int arg0) {
        field498 = null;
        if (arg0 > 71) {
            field500 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method184(int arg0) {
        field496++;
        if (class127.field2281 != 1000) {
            boolean var2 = method182(arg0 ^ arg0);
            if (!var2) {
                this.method185(5);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 7) {
                class207.method1309(127);
            }
            class52.field954 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class65.field1247 = 0;
            } else if (arg0[1].equals("office")) {
                class65.field1247 = 1;
            } else if (arg0[1].equals("local")) {
                class65.field1247 = 2;
            } else {
                class207.method1309(126);
            }
            if (arg0[2].equals("live")) {
                class111.field2018 = 0;
            } else if (arg0[2].equals("rc")) {
                class111.field2018 = 1;
            } else if (arg0[2].equals("wip")) {
                class111.field2018 = 2;
            } else {
                class207.method1309(120);
            }
            if (arg0[3].equals("lowmem")) {
                class110.method679(95);
            } else if (arg0[3].equals("highmem")) {
                class68.method399((byte) 87);
            } else {
                class207.method1309(116);
            }
            if (arg0[4].equals("free")) {
                class47.field882 = false;
            } else if (arg0[4].equals("members")) {
                class47.field882 = true;
            } else {
                class207.method1309(120);
            }
            if (arg0[5].equals("english")) {
                class141.field2565 = 0;
            } else if (arg0[5].equals("german")) {
                class185.method1172(6);
                class170.field3237 = class198.field3861;
                class141.field2565 = 1;
            } else {
                class207.method1309(119);
            }
            if (arg0[6].equals("game0")) {
                class109.field1971 = 0;
            } else if (arg0[6].equals("game1")) {
                class109.field1971 = 1;
            } else {
                class207.method1309(121);
            }
            class112.field2023 = "127.0.0.1";
            client var1 = new client();
            var1.method960(class111.field2018 + 32, 16, "runescape", 765, -94, 485, 503);
            class43.field827.setLocation(40, 40);
        } catch (Exception var3) {
            class5.method38((byte) -112, null, var3);
        }
        field499++;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field505++;
        if (!this.method957(-1)) {
            return;
        }
        class52.field954 = Integer.parseInt(this.getParameter("worldid"));
        class111.field2018 = Integer.parseInt(this.getParameter("modewhat"));
        class65.field1247 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class110.method679(99);
        } else {
            class68.method399((byte) -123);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class47.field882 = true;
        } else {
            class47.field882 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class185.method1172(5);
            class170.field3237 = class198.field3861;
            class141.field2565 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class109.field1971 = 1;
        } else {
            class109.field1971 = 0;
        }
        try {
            class167.field2992 = Integer.parseInt(this.getParameter("js"));
            class176.field3335 = Integer.parseInt(this.getParameter("plug"));
        } catch (Exception var5) {
        }
        class112.field2023 = this.getCodeBase().getHost();
        this.method966((byte) 1, class111.field2018 + 32, 485, 503, 765);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method185(int arg0) {
        field494++;
        if (class130.field2348 >= 4) {
            this.method962(true, "js5crc");
            class127.field2281 = 1000;
            return;
        }
        if (class43.field828 >= 4) {
            if (class127.field2281 <= 5) {
                this.method962(true, "js5io");
                class127.field2281 = 1000;
                return;
            }
            class206.field3963 = 3000;
            class43.field828 = 3;
        }
        if (class206.field3963-- > 0) {
            return;
        }
        try {
            if (class11.field207 == 0) {
                class117.field2119 = class98.field1841.method899(class159.field2871, class112.field2023, 107);
                class11.field207++;
            }
            if (class11.field207 == 1) {
                if (class117.field2119.field1765 == 2) {
                    this.method193(-1, (byte) 120);
                    return;
                }
                if (class117.field2119.field1765 == 1) {
                    class11.field207++;
                }
            }
            if (class11.field207 == 2) {
                class125.field2247 = new class87((Socket) class117.field2119.field1767, class98.field1841);
                class97 var2 = new class97(5);
                var2.method583((byte) 14, 15);
                var2.method580(485, false);
                class125.field2247.method514(5, 0, var2.field1809, -23422);
                class11.field207++;
                class128.field2322 = class24.method165(128);
            }
            if (class11.field207 == 3) {
                if (class127.field2281 <= 5 || class125.field2247.method519((byte) -99) > 0) {
                    int var3 = class125.field2247.method518(arg0 ^ 0x5);
                    if (var3 != 0) {
                        this.method193(var3, (byte) -110);
                        return;
                    }
                    class11.field207++;
                } else if (class24.method165(128) - class128.field2322 > 30000L) {
                    this.method193(-2, (byte) -100);
                    return;
                }
            }
            if (arg0 != 5) {
                field498 = null;
            }
            if (class11.field207 == 4) {
                class83.method463(class127.field2281 > 20, class125.field2247, arg0 - 5);
                class113.field2031 = 0;
                class117.field2119 = null;
                class11.field207 = 0;
                class125.field2247 = null;
            }
        } catch (IOException var4) {
            this.method193(-3, (byte) 105);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method186(int arg0) {
        field501++;
        class161.field2903++;
        if (class161.field2903 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class36.field672 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class155.field2781.setSeed((long) class36.field672);
        }
        this.method184(-22288);
        class89.method526((byte) 0);
        class66.method385(-113);
        if (arg0 != 3503) {
            return;
        }
        class91.method530(arg0 - 3587);
        class11.method68(-1);
        class185.method1169(0);
        if (class13.field241 != null) {
            int var3 = class13.field241.method65(arg0 ^ 0xD84);
            class141.field2566 = var3;
        }
        if (class127.field2281 == 0) {
            class67.method395(8);
            class108.method675(-103);
        } else if (class127.field2281 == 5) {
            class26.method171(this, 0);
            class67.method395(8);
            class108.method675(-109);
        } else if (class127.field2281 == 10) {
            class26.method171(this, arg0 - 3503);
        } else if (class127.field2281 == 20) {
            class26.method171(this, 0);
            class111.method688(3);
        } else if (class127.field2281 == 25) {
            class10.method58((byte) 58);
        }
        if (class127.field2281 == 30) {
            class45.method263(false);
        } else if (class127.field2281 == 40) {
            class111.method688(3);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    public static final void method187(int arg0, int arg1) {
        class20.field382 += arg0 * 128;
        short var2 = 256;
        field508++;
        if (class20.field382 > class81.field1449.length) {
            int var3 = (int) (Math.random() * 12.0D);
            class20.field382 -= class81.field1449.length;
            class176.method1082(106, class5.field86[var3]);
        }
        int var4 = 0;
        int var5 = arg0 * 128;
        int var6 = (var2 - arg0) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var27 = class158.field2824[var4 + var5] - class81.field1449[class20.field382 + var4 & class81.field1449.length + -1] * arg0 / 6;
            if (var27 < 0) {
                var27 = 0;
            }
            class158.field2824[var4++] = var27;
        }
        for (int var8 = var2 - arg0; var8 < var2; var8++) {
            int var24 = var8 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class158.field2824[var24 + var25] = 255;
                } else {
                    class158.field2824[var24 + var25] = 0;
                }
            }
        }
        if (class20.field386 > 0) {
            class20.field386 -= arg0 * 4;
        }
        if (class209.field4007 > 0) {
            class209.field4007 -= arg0 * 4;
        }
        if (arg1 >= -101) {
            main(null);
        }
        if (class20.field386 == 0 && class209.field4007 == 0) {
            int var9 = (int) (Math.random() * (double) (2000 / arg0));
            if (var9 == 1) {
                class209.field4007 = 1024;
            }
            if (var9 == 0) {
                class20.field386 = 1024;
            }
        }
        for (int var10 = 0; var10 < var2 - arg0; var10++) {
            class51.field940[var10] = class51.field940[var10 + arg0];
        }
        for (int var11 = var2 - arg0; var11 < var2; var11++) {
            class51.field940[var11] = (int) (Math.sin((double) class26.field470 / 14.0D) * 16.0D + Math.sin((double) class26.field470 / 15.0D) * 14.0D + Math.sin((double) class26.field470 / 16.0D) * 12.0D);
            class26.field470++;
        }
        class40.field747 += arg0;
        int var12 = ((class161.field2903 & 0x1) + arg0) / 2;
        if (var12 <= 0) {
            return;
        }
        for (int var13 = 0; var13 < class40.field747 * 100; var13++) {
            int var22 = (int) (Math.random() * 128.0D) + 128;
            int var23 = (int) (Math.random() * 124.0D) + 2;
            class158.field2824[(var22 << 7) + var23] = 192;
        }
        class40.field747 = 0;
        for (int var14 = 0; var14 < var2; var14++) {
            int var19 = 0;
            int var20 = var14 * 128;
            for (int var21 = -var12; var21 < 128; var21++) {
                if (var12 + var21 < 128) {
                    var19 += class158.field2824[var20 + var21 + var12];
                }
                if (var21 - var12 - 1 >= 0) {
                    var19 -= class158.field2824[var20 + var21 - var12 - 1];
                }
                if (var21 >= 0) {
                    class32.field563[var20 + var21] = var19 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var2; var17++) {
                int var18 = var17 * 128;
                if (var2 > var12 + var17) {
                    var16 += class32.field563[var12 * 128 + var15 + var18];
                }
                if (var17 - var12 - 1 >= 0) {
                    var16 -= class32.field563[var15 + var18 - (var12 - -1) * 128];
                }
                if (var17 >= 0) {
                    class158.field2824[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method188(boolean arg0) {
        field497++;
        if (!arg0) {
            method182(108);
        }
        boolean var2 = class206.method1305(-127);
        if (var2 && class159.field2856 && class157.field2820 != null) {
            class157.field2820.method1331(!arg0);
        }
        if (class179.field3420) {
            class212.method1370(false, class129.field2344);
            class40.method231(class129.field2344, 32711);
            if (class13.field241 != null) {
                class13.field241.method66(class129.field2344, -12542);
            }
            this.method958((byte) -94);
            class66.method391(-82, class129.field2344);
            class128.method778(class129.field2344, 4);
            if (class13.field241 != null) {
                class13.field241.method69(124, class129.field2344);
            }
        }
        if (class127.field2281 == 0) {
            class94.method540(class47.field895, -1729, class188.field3622, null);
        } else if (class127.field2281 == 5) {
            class194.method1235(class125.field2261, class122.field2185, (byte) -88);
        } else if (class127.field2281 == 10) {
            class194.method1235(class125.field2261, class122.field2185, (byte) -91);
        } else if (class127.field2281 == 20) {
            class194.method1235(class125.field2261, class122.field2185, (byte) -96);
        } else if (class127.field2281 == 25) {
            if (class195.field3789 == 1) {
                if (class135.field2459 < class117.field2120) {
                    class135.field2459 = class117.field2120;
                }
                int var3 = (class135.field2459 - class117.field2120) * 50 / class135.field2459;
                class69.method405(false, class144.method884(0, new class184[] { class81.field1460, class8.field146, class170.method1060(var3, -125), class108.field1948 }), 32549);
            } else if (class195.field3789 == 2) {
                if (class122.field2224 > class143.field2587) {
                    class143.field2587 = class122.field2224;
                }
                int var4 = (class143.field2587 - class122.field2224) * 50 / class143.field2587 + 50;
                class69.method405(false, class144.method884(0, new class184[] { class81.field1460, class8.field146, class170.method1060(var4, -109), class108.field1948 }), 32549);
            } else {
                class69.method405(false, class81.field1460, 32549);
            }
        } else if (class127.field2281 == 30) {
            class113.method697(-14790);
        } else if (class127.field2281 == 40) {
            class69.method405(false, class144.method884(0, new class184[] { class43.field821, class169.field3205, class159.field2868 }), 32549);
        }
        if (class127.field2281 == 30 && class184.field3524 == 0 && !class157.field2809) {
            try {
                Graphics var5 = class129.field2344.getGraphics();
                for (int var6 = 0; var6 < class11.field199; var6++) {
                    if (class134.field2427[var6]) {
                        class168.field3139.method441(var5, 3289, class55.field984[var6], class194.field3767[var6], class133.field2411[var6], class198.field3859[var6]);
                        class134.field2427[var6] = false;
                    }
                }
            } catch (Exception var9) {
                class129.field2344.repaint();
            }
        } else if (class127.field2281 > 0) {
            try {
                Graphics var7 = class129.field2344.getGraphics();
                class168.field3139.method440(99, 0, var7, 0);
                class157.field2809 = false;
                for (int var8 = 0; var8 < class11.field199; var8++) {
                    class134.field2427[var8] = false;
                }
            } catch (Exception var10) {
                class129.field2344.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIII)V")
    public static final void method189(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field503++;
        int var5 = 107 % ((-arg1 - 52) / 43);
        for (class14 var6 = (class14) class2.field51.method404(false); var6 != null; var6 = (class14) class2.field51.method414(-128)) {
            if (var6.field272 != -1 || var6.field274 != null) {
                int var7 = 0;
                if (var6.field256 < arg2) {
                    var7 += arg2 - var6.field256;
                } else if (arg2 < var6.field260) {
                    var7 += var6.field260 - arg2;
                }
                if (var6.field268 < arg0) {
                    var7 += arg0 - var6.field268;
                } else if (arg0 < var6.field254) {
                    var7 += var6.field254 - arg0;
                }
                if (var7 - 64 > var6.field257 || class170.field3230 == 0 || var6.field265 != arg4) {
                    if (var6.field269 != null) {
                        class26.field467.method141(var6.field269);
                        var6.field269 = null;
                    }
                    if (var6.field264 != null) {
                        class26.field467.method141(var6.field264);
                        var6.field264 = null;
                    }
                } else {
                    var7 -= 64;
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var8 = (var6.field257 - var7) * class170.field3230 / var6.field257;
                    if (var6.field269 != null) {
                        var6.field269.method996(var8);
                    } else if (var6.field272 >= 0) {
                        class48 var9 = class48.method274(class7.field128, var6.field272, 0);
                        if (var9 != null) {
                            class33 var10 = var9.method275().method204(class37.field693);
                            class165 var11 = class165.method1022(var10, 100, var8);
                            var11.method1004(-1);
                            class26.field467.method142(var11);
                            var6.field269 = var11;
                        }
                    }
                    if (var6.field264 != null) {
                        var6.field264.method996(var8);
                        if (!var6.field264.method800(true)) {
                            var6.field264 = null;
                        }
                    } else if (var6.field274 != null && (var6.field255 -= arg3) <= 0) {
                        int var12 = (int) (Math.random() * (double) var6.field274.length);
                        class48 var13 = class48.method274(class7.field128, var6.field274[var12], 0);
                        if (var13 != null) {
                            class33 var14 = var13.method275().method204(class37.field693);
                            class165 var15 = class165.method1022(var14, 100, var8);
                            var15.method1004(0);
                            class26.field467.method142(var15);
                            var6.field255 = var6.field252 + (int) ((double) (var6.field271 - var6.field252) * Math.random());
                            var6.field264 = var15;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method190(int arg0) {
        field504++;
        method183(114);
        class184.method1155(-73464828);
        class159.method961((byte) -73);
        class112.method691((byte) 70);
        class129.method786(104);
        class106.method659(false);
        int var2 = 59 % ((arg0 - 14) / 55);
        class179.method1093(0);
        class97.method567(115);
        class87.method517(-2450);
        class190.method1219(-1);
        class144.method881(3673);
        class143.method878(-29);
        class158.method954(false);
        class17.method109(74);
        class65.method375((byte) 14);
        class167.method1040(true);
        class67.method392(-85);
        class69.method413(-125);
        class9.method54(true);
        class11.method70(-123);
        class46.method266(167);
        class133.method804(-114);
        class210.method1336(24775);
        class44.method259((byte) -122);
        class207.method1315((byte) -81);
        class188.method1187(false);
        class35.method211(-86);
        class186.method1174((byte) -58);
        class41.method237((byte) 75);
        class7.method41((byte) 125);
        class132.method799(-8458);
        class63.method354((byte) 85);
        class98.method616((byte) 114);
        class127.method767(125);
        class140.method863();
        class100.method622((byte) -125);
        class196.method1248(7);
        class201.method1287(128);
        class90.method529(125);
        class164.method983((byte) -8);
        class194.method1234(-128);
        class52.method285(-6789);
        class50.method279(-21568);
        class134.method808((byte) -77);
        class88.method523((byte) 120);
        class181.method1115();
        class113.method695(118);
        class30.method194();
        class31.method195((byte) -99);
        class151.method925(-106);
        class38.method225(-129);
        class19.method124((byte) -127);
        class24.method164(19897);
        class117.method714(5422);
        class6.method39(-128);
        class197.method1257(0);
        class84.method489(-45266836);
        class8.method45(-1);
        class78.method448((byte) -119);
        class81.method456((byte) -87);
        class205.method1298(-112);
        class168.method1045((byte) 87);
        class40.method230(11722);
        class68.method397(false);
        class150.method923(1);
        class83.method464(-114);
        class45.method262(31355);
        class131.method793((byte) -100);
        class4.method34();
        class101.method624((byte) 12);
        class23.method152();
        class1.method1(-127);
        class104.method647();
        class59.method325(0);
        class189.method1201(-120);
        class94.method543(30);
        class178.method1091(-241125918);
        class156.method945(128);
        class170.method1056(127);
        class58.method324(56);
        class123.method753(25211);
        class122.method747((byte) -60);
        class95.method553();
        class54.method291((byte) -67);
        class57.method303(true);
        class21.method128((byte) -91);
        class110.method681((byte) 88);
        class180.method1100(-67);
        class202.method1288(-522);
        class211.method1367();
        class64.method365(113);
        class18.method116((byte) -98);
        class138.method853((byte) 97);
        class74.method435(-86);
        class16.method102(4);
        class91.method531(-78);
        class36.method218(3);
        class14.method89(0);
        class73.method431(1);
        class141.method875(-60);
        class51.method282(-23473);
        class5.method37(23127);
        class29.method180(22682);
        class39.method228(false);
        class139.method859();
        class114.method705(-9040);
        class182.method1125(true);
        class20.method125(true);
        class3.method14(111);
        class13.method84(true);
        class82.method459(3);
        class157.method951(-37);
        class85.method503((byte) 4);
        class76.method443(1);
        class60.method333(64);
        class177.method1087(false);
        class111.method686((byte) -87);
        class198.method1276(113);
        class47.method268((byte) 115);
        class125.method757(1);
        class126.method762((byte) -101);
        class192.method1226();
        class166.method1027();
        class208.method1324((byte) 67);
        class152.method928();
        class191.method1225(-1);
        class103.method636((byte) 124);
        class15.method91((byte) 65);
        class86.method510();
        class176.method1083(117);
        class200.method1281(-2);
        class204.method1297(-27141);
        class61.method341();
        class42.method245();
        class193.method1227(-968911704);
        class149.method910(0);
        class12.method83(-1);
        class79.method449(-113);
        class209.method1329(0);
        class99.method618(0);
        class108.method672(1);
        class2.method8(-1);
        class153.method929(0);
        class206.method1301(107);
        class161.method971(0);
        class187.method1183(false);
        class92.method534(0);
        class130.method788((byte) -86);
        class135.method814(116);
        class118.method716((byte) -58);
        class62.method349(63);
        class173.method1074(1);
        class43.method250((byte) -87);
        class55.method297((byte) -76);
        class172.method1070(-67);
        class115.method707(-2537);
        class49.method277(-58);
        class155.method943(-1);
        class169.method1049(10435);
        class72.method425((byte) 125);
        class162.method976((byte) 89);
        class105.method658((byte) -128);
        class109.method678(-1871881620);
        class195.method1239((byte) -50);
        class120.method727(-115);
        class119.method723(31577);
        class146.method897(76);
        class128.method782((byte) 116);
        class175.method1080((byte) 122);
        class212.method1371(-123);
        class34.method207(-105);
        class154.method932(-26109);
        class25.method167((byte) 60);
        class136.method822(false);
        class10.method63(-2064200148);
        class37.method222(-56);
        class145.method895(false);
        class32.method200(-121);
        class26.method170(-124);
        class174.method1075(1048562);
        class66.method389((byte) -78);
        class71.method423(true);
        class116.method709(40);
        class185.method1171(24191);
        class107.method663(-79);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method191(int arg0) {
        if (class43.field825 != null) {
            class43.field825.field1922 = false;
        }
        field502++;
        class43.field825 = null;
        if (class180.field3435 != null) {
            class180.field3435.method515(27);
            class180.field3435 = null;
        }
        class144.method888((byte) 9);
        class36.method217(7);
        class13.field241 = null;
        if (class157.field2820 != null) {
            class157.field2820.method1339((byte) -123);
        }
        if (class90.field1667 != null) {
            class90.field1667.method1339((byte) 118);
        }
        class71.method424(arg0 ^ 0x3DA7);
        class194.method1231(-94);
        try {
            if (class180.field3434 != null) {
                class180.field3434.method886((byte) 59);
            }
            if (class51.field941 != null) {
                for (int var2 = 0; var2 < class51.field941.length; var2++) {
                    if (class51.field941[var2] != null) {
                        class51.field941[var2].method886((byte) 59);
                    }
                }
            }
            if (class60.field1127 != null) {
                class60.field1127.method886((byte) 59);
            }
            if (class19.field376 != null) {
                class19.field376.method886((byte) 59);
            }
            if (arg0 != 0) {
                main(null);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method192(byte arg0) {
        if (class109.field1971 == 1) {
            class122.field2209 = class60.field1126;
            class6.field112 = class50.field922;
            class133.field2409 = class40.field748;
            class64.field1211 = class125.field2253;
        } else {
            class6.field112 = class45.field858;
            class133.field2409 = class130.field2365;
            class122.field2209 = class34.field589;
            class64.field1211 = class144.field2607;
        }
        class110.field1982 = class65.field1247 == 0 ? 43594 : class52.field954 + 40000;
        field495++;
        class159.field2871 = class110.field1982;
        class212.field4103 = class65.field1247 == 0 ? 443 : class52.field954 + 50000;
        class11.method72((byte) 109);
        class66.method391(-46, class129.field2344);
        class128.method778(class129.field2344, 110);
        class13.field241 = class200.method1282((byte) 124);
        if (class13.field241 != null) {
            class13.field241.method69(121, class129.field2344);
        }
        class179.field3424 = class147.field2659;
        try {
            if (arg0 < 63) {
                method189(-89, 115, -128, 15, -111);
            }
            if (class98.field1841.field2654 != null) {
                class180.field3434 = new class144(class98.field1841.field2654, 5200, 0);
                for (int var2 = 0; var2 < 16; var2++) {
                    class51.field941[var2] = new class144(class98.field1841.field2655[var2], 6000, 0);
                }
                class60.field1127 = new class144(class98.field1841.field2650, 6000, 0);
                class83.field1489 = new class143(255, class180.field3434, class60.field1127, 500000);
                class19.field376 = new class144(class98.field1841.field2662, 24, 0);
                class98.field1841.field2654 = null;
                class98.field1841.field2662 = null;
                class98.field1841.field2650 = null;
                class98.field1841.field2655 = null;
            }
        } catch (IOException var3) {
            class60.field1127 = null;
            class19.field376 = null;
            class83.field1489 = null;
            class180.field3434 = null;
        }
        if (class65.field1247 != 0) {
            class74.field1378 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    private final void method193(int arg0, byte arg1) {
        if (class159.field2871 == class110.field1982) {
            class159.field2871 = class212.field4103;
        } else {
            class159.field2871 = class110.field1982;
        }
        class125.field2247 = null;
        int var3 = -117 % ((23 - arg1) / 32);
        field506++;
        class11.field207 = 0;
        class113.field2031++;
        class117.field2119 = null;
        if (class113.field2031 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class127.field2281 > 5) {
                class206.field3963 = 3000;
            } else {
                this.method962(true, "js5connect_full");
                class127.field2281 = 1000;
            }
        } else if (class113.field2031 >= 2 && arg0 == 6) {
            this.method962(true, "js5connect_outofdate");
            class127.field2281 = 1000;
        } else if (class113.field2031 >= 4) {
            if (class127.field2281 <= 5) {
                this.method962(true, "js5connect");
                class127.field2281 = 1000;
            } else {
                class206.field3963 = 3000;
            }
        }
    }
}
