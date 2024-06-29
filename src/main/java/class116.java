import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class116 {

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "J")
    public long field2598 = 0L;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field2587 = 0;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "Lgg;")
    public static class63 field2590 = method911(43, ":");

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "Lgg;")
    public static class63 field2597 = method911(43, "Sichtbare Karte vorbereitet)3");

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public static int field2592 = 10;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "[Lka;")
    public static class92[] field2593 = new class92[4];

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "Lgg;")
    private static class63 field2605 = method911(43, "World");

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "Lgg;")
    public static class63 field2591 = field2605;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "Lgg;")
    public static class63 field2604 = field2605;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public int field2588;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public int field2589;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    public int field2596;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
    public int field2599;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
    public int field2600;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "Ld;")
    public class30 field2594;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "Ld;")
    public class30 field2603;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    public static void method909(int arg0) {
        field2590 = null;
        field2597 = null;
        field2593 = null;
        field2605 = null;
        if (arg0 != -32644) {
            method910(-50, -21, -51);
        }
        field2604 = null;
        field2591 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)J")
    public static final long method910(int arg0, int arg1, int arg2) {
        class96 var3 = class148.field3117[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field2272; var4++) {
            class98 var5 = var3.field2284[var4];
            if ((var5.field2319 >> 29 & 0x3L) == 2L && var5.field2330 == arg1 && var5.field2325 == arg2) {
                return var5.field2319;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILjava/lang/String;)Lgg;")
    public static final class63 method911(int arg0, String arg1) {
        field2602++;
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        if (arg0 != 43) {
            method909(83);
        }
        class63 var4 = new class63();
        int var5 = 0;
        var4.field1602 = new byte[var3];
        while (var5 < var3) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var5) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field1602[var4.field1628++] = (byte) (var6 * 43 + var7 - 48 - 1720);
            } else if (var6 != 0) {
                var4.field1602[var4.field1628++] = (byte) var6;
            }
        }
        var4.method574((byte) 124);
        return var4.method588((byte) 116);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BI)V")
    public static final void method912(byte arg0, int arg1) {
        field2586++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class148.field3123[arg1];
        int var3 = class196.field3924[arg1];
        int var4 = class164.field3368[arg1];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        int var5 = (int) class10.field228[arg1];
        long var6 = class10.field228[arg1];
        if (var3 == 48) {
            class6 var8 = class55.field1458[var5];
            if (var8 != null) {
                class162.method1105(0, class3.field72.field1117[0], 0, 1, 1, 2, var8.field1117[0], class3.field72.field1164[0], var8.field1164[0], false, (byte) -37, 0);
                class182.field3693 = 0;
                class154.field3231++;
                class32.field785 = class110.field2480;
                class6.field149 = 2;
                class49.field1188 = class143.field3074;
                class141.field3031.method854(236, true);
                class141.field3031.method47(636435176, var5);
            }
        }
        if (var3 == 40) {
            class141.field3031.method854(64, true);
            class15.field366++;
            class141.field3031.method76(var4, (byte) 114);
            class54 var9 = class59.method555(var4, 32173);
            if (var9.field1332 != null && var9.field1332[0][0] == 5) {
                int var10 = var9.field1332[0][1];
                if (class24.field545[var10] != var9.field1355[0]) {
                    class24.field545[var10] = var9.field1355[0];
                    class10.method131(arg0 ^ 0x23, var10);
                }
            }
        }
        if (var3 == 6) {
            class154.method1073(arg0 ^ 0x61);
        }
        if (var3 == 8) {
            class6 var11 = class55.field1458[var5];
            if (var11 != null) {
                class63.field1601++;
                class162.method1105(0, class3.field72.field1117[0], 0, 1, 1, 2, var11.field1117[0], class3.field72.field1164[0], var11.field1164[0], false, (byte) -110, 0);
                class182.field3693 = 0;
                class6.field149 = 2;
                class32.field785 = class110.field2480;
                class49.field1188 = class143.field3074;
                class141.field3031.method854(213, true);
                class141.field3031.method47(arg0 ^ 0x25EF3A89, var5);
            }
        }
        if (var3 == 41) {
            class131.field2864++;
            class141.field3031.method854(35, true);
            class141.field3031.method62(var2, (byte) 82);
            class141.field3031.method62(var5, (byte) 117);
            class141.field3031.method22(var4, 458634000);
            class113.field2537 = 0;
            class162.field3332 = class59.method555(var4, 32173);
            class103.field2384 = var2;
        }
        if (var3 == 23) {
            class155.field3253++;
            class141.field3031.method854(95, true);
            class141.field3031.method62(var2, (byte) 74);
            class141.field3031.method24(var5, 127);
            class141.field3031.method44((byte) 123, var4);
            class113.field2537 = 0;
            class162.field3332 = class59.method555(var4, 32173);
            class103.field2384 = var2;
        }
        if (var3 == 4) {
            class151.method1061(var4, var6, var2, -23);
            class63.field1619++;
            class141.field3031.method854(122, true);
            class141.field3031.method24(Integer.MAX_VALUE & (int) (var6 >>> 32), arg0 ^ 0x1E);
            class141.field3031.method54((byte) -14, var2 + class3.field110);
            class141.field3031.method47(636435176, class38.field921 + var4);
        }
        if (var3 == 1007) {
            class151.method1061(var4, var6, var2, -23);
            class141.field3031.method854(109, true);
            class141.field3031.method62(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) -119);
            class16.field386++;
            class141.field3031.method54((byte) -14, var2 + class3.field110);
            class141.field3031.method47(636435176, class38.field921 + var4);
        }
        if (var3 == 34) {
            class22.field524++;
            boolean var12 = class162.method1105(0, class3.field72.field1117[0], 0, 0, 0, 2, var2, class3.field72.field1164[0], var4, false, (byte) -21, 0);
            if (!var12) {
                class162.method1105(0, class3.field72.field1117[0], 0, 1, 1, 2, var2, class3.field72.field1164[0], var4, false, (byte) -18, 0);
            }
            class32.field785 = class110.field2480;
            class182.field3693 = 0;
            class49.field1188 = class143.field3074;
            class6.field149 = 2;
            class141.field3031.method854(131, true);
            class141.field3031.method62(var4 + class38.field921, (byte) 57);
            class141.field3031.method54((byte) -14, class3.field110 + var2);
            class141.field3031.method62(var5, (byte) -116);
        }
        if (var3 == 32) {
            class151.method1061(var4, var6, var2, arg0 ^ 0xFFFFFF88);
            class141.field3031.method854(238, true);
            class141.field3031.method24((int) (var6 >>> 32) & Integer.MAX_VALUE, arg0 + 27);
            class78.field1898++;
            class141.field3031.method24(class38.field921 + var4, 126);
            class141.field3031.method62(var2 + class3.field110, (byte) -119);
        }
        if (var3 == 20) {
            client.field719++;
            class141.field3031.method854(83, true);
            class141.field3031.method44((byte) 91, var4);
            class141.field3031.method24(var2, 127);
            class141.field3031.method54((byte) -14, var5);
            class113.field2537 = 0;
            class162.field3332 = class59.method555(var4, 32173);
            class103.field2384 = var2;
        }
        if (var3 == 44) {
            class6 var14 = class55.field1458[var5];
            if (var14 != null) {
                class4.field114++;
                class162.method1105(0, class3.field72.field1117[0], 0, 1, 1, 2, var14.field1117[0], class3.field72.field1164[0], var14.field1164[0], false, (byte) -91, 0);
                class32.field785 = class110.field2480;
                class182.field3693 = 0;
                class6.field149 = 2;
                class49.field1188 = class143.field3074;
                class141.field3031.method854(127, true);
                class141.field3031.method24(var5, -42);
            }
        }
        if (var3 == 7) {
            class6 var15 = class55.field1458[var5];
            if (var15 != null) {
                class162.method1105(0, class3.field72.field1117[0], 0, 1, 1, 2, var15.field1117[0], class3.field72.field1164[0], var15.field1164[0], false, (byte) -110, 0);
                class182.field3693 = 0;
                class32.field785 = class110.field2480;
                class193.field3906++;
                class49.field1188 = class143.field3074;
                class6.field149 = 2;
                class141.field3031.method854(216, true);
                class141.field3031.method24(var5, -107);
            }
        }
        if (var3 == 16 && class198.field3967 == null) {
            class136.method995(var4, (byte) 110, var2);
            class198.field3967 = class12.method149(var2, var4, arg0 + 12129);
            class113.method901(0, class198.field3967);
        }
        if (var3 == 46) {
            class141.field3031.method854(0, true);
            class141.field3031.method53(var4, 1623728984);
            class141.field3031.method54((byte) -14, var2);
            class4.field123++;
            class141.field3031.method54((byte) -14, var5);
            class113.field2537 = 0;
            class162.field3332 = class59.method555(var4, 32173);
            class103.field2384 = var2;
        }
        if (var3 == 13) {
            class6 var16 = class55.field1458[var5];
            if (var16 != null) {
                class168.field3476++;
                class162.method1105(0, class3.field72.field1117[0], 0, 1, 1, 2, var16.field1117[0], class3.field72.field1164[0], var16.field1164[0], false, (byte) -124, 0);
                class182.field3693 = 0;
                class49.field1188 = class143.field3074;
                class32.field785 = class110.field2480;
                class6.field149 = 2;
                class141.field3031.method854(172, true);
                class141.field3031.method62(class17.field405, (byte) 70);
                class141.field3031.method62(var5, (byte) -87);
                class141.field3031.method44((byte) 91, class123.field2710);
                class141.field3031.method47(636435176, class90.field2114);
            }
        }
        if (var3 == 3) {
            class174.field3577++;
            boolean var17 = class162.method1105(0, class3.field72.field1117[0], 0, 0, 0, 2, var2, class3.field72.field1164[0], var4, false, (byte) -128, 0);
            if (!var17) {
                class162.method1105(0, class3.field72.field1117[0], 0, 1, 1, 2, var2, class3.field72.field1164[0], var4, false, (byte) -13, 0);
            }
            class182.field3693 = 0;
            class49.field1188 = class143.field3074;
            class6.field149 = 2;
            class32.field785 = class110.field2480;
            class141.field3031.method854(2, true);
            class141.field3031.method47(636435176, var5);
            class141.field3031.method47(636435176, class17.field405);
            class141.field3031.method47(636435176, class38.field921 + var4);
            class141.field3031.method62(class3.field110 + var2, (byte) -73);
            class141.field3031.method47(636435176, class90.field2114);
            class141.field3031.method22(class123.field2710, 458634000);
        }
        if (var3 == 42) {
            class62 var19 = class33.field806[var5];
            if (var19 != null) {
                class162.method1105(0, class3.field72.field1117[0], 0, 1, 1, 2, var19.field1117[0], class3.field72.field1164[0], var19.field1164[0], false, (byte) -76, 0);
                class174.field3574++;
                class32.field785 = class110.field2480;
                class49.field1188 = class143.field3074;
                class182.field3693 = 0;
                class6.field149 = 2;
                class141.field3031.method854(34, true);
                class141.field3031.method54((byte) -14, var5);
            }
        }
        if (var3 == 25) {
            class152.field3190++;
            class141.field3031.method854(148, true);
            class141.field3031.method62(var5, (byte) 48);
            class141.field3031.method24(var2, -2);
            class141.field3031.method22(var4, arg0 ^ 0x1B563371);
            class141.field3031.method24(class90.field2114, arg0 ^ 0xFFFFFFE5);
            class141.field3031.method47(arg0 ^ 0x25EF3A89, class17.field405);
            class141.field3031.method53(class123.field2710, 1623728984);
            class113.field2537 = 0;
            class162.field3332 = class59.method555(var4, 32173);
            class103.field2384 = var2;
        }
        if (var3 == 9) {
            class38.field920++;
            class141.field3031.method854(134, true);
            class141.field3031.method54((byte) -14, var5);
            class141.field3031.method62(var2, (byte) 84);
            class141.field3031.method44((byte) 120, var4);
            class113.field2537 = 0;
            class162.field3332 = class59.method555(var4, 32173);
            class103.field2384 = var2;
        }
        if (var3 == 1002) {
            class54 var20 = class59.method555(var4, 32173);
            if (var20 == null || var20.field1315[var2] < 100000) {
                class23.field533++;
                class141.field3031.method854(194, true);
                class141.field3031.method24(var5, 125);
            } else {
                class100.method843((byte) -107, 0, class151.field3175, class89.method772((byte) 77, new class63[] { class175.method1162((byte) -126, var20.field1315[var2]), class109.field2453, class59.method554(var5, arg0 + 13222).field2202 }));
            }
            class113.field2537 = 0;
            class162.field3332 = class59.method555(var4, 32173);
            class103.field2384 = var2;
        }
        if (var3 == 36 && class151.method1061(var4, var6, var2, -23)) {
            class141.field3031.method854(171, true);
            class110.field2487++;
            class141.field3031.method47(636435176, class38.field921 + var4);
            class141.field3031.method62(class33.field793, (byte) 106);
            class141.field3031.method54((byte) -14, class3.field110 + var2);
            class141.field3031.method53(class60.field1538, 1623728984);
            class141.field3031.method24(Integer.MAX_VALUE & (int) (var6 >>> 32), -48);
        }
        if (var3 == 51) {
            class6.field160++;
            boolean var21 = class162.method1105(0, class3.field72.field1117[0], 0, 0, 0, 2, var2, class3.field72.field1164[0], var4, false, (byte) -50, 0);
            if (!var21) {
                class162.method1105(0, class3.field72.field1117[0], 0, 1, 1, 2, var2, class3.field72.field1164[0], var4, false, (byte) -33, 0);
            }
            class6.field149 = 2;
            class182.field3693 = 0;
            class49.field1188 = class143.field3074;
            class32.field785 = class110.field2480;
            class141.field3031.method854(183, true);
            class141.field3031.method44((byte) 72, class60.field1538);
            class141.field3031.method24(var2 + class3.field110, 126);
            class141.field3031.method62(class38.field921 + var4, (byte) -86);
            class141.field3031.method47(636435176, var5);
            class141.field3031.method54((byte) -14, class33.field793);
        }
        if (var3 == 38) {
            class141.field3031.method854(64, true);
            class141.field3031.method76(var4, (byte) 114);
            class15.field366++;
            class54 var23 = class59.method555(var4, 32173);
            if (var23.field1332 != null && var23.field1332[0][0] == 5) {
                int var24 = var23.field1332[0][1];
                class24.field545[var24] = 1 - class24.field545[var24];
                class10.method131(116, var24);
            }
        }
        if (var3 == 21) {
            class54 var25 = class59.method555(var4, 32173);
            boolean var26 = true;
            if (var25.field1367 > 0) {
                var26 = class170.method1146(var25, (byte) -109);
            }
            if (var26) {
                class15.field366++;
                class141.field3031.method854(64, true);
                class141.field3031.method76(var4, (byte) 114);
            }
        }
        if (var3 == 30) {
            class50.field1209++;
            class141.field3031.method854(251, true);
            class141.field3031.method24(var5, 125);
            class141.field3031.method62(var2, (byte) -113);
            class141.field3031.method53(var4, 1623728984);
            class113.field2537 = 0;
            class162.field3332 = class59.method555(var4, 32173);
            class103.field2384 = var2;
        }
        if (var3 == 15) {
            class94.field2260++;
            boolean var27 = class162.method1105(0, class3.field72.field1117[0], 0, 0, 0, 2, var2, class3.field72.field1164[0], var4, false, (byte) -58, 0);
            if (!var27) {
                class162.method1105(0, class3.field72.field1117[0], 0, 1, 1, 2, var2, class3.field72.field1164[0], var4, false, (byte) -28, 0);
            }
            class49.field1188 = class143.field3074;
            class182.field3693 = 0;
            class32.field785 = class110.field2480;
            class6.field149 = 2;
            class141.field3031.method854(178, true);
            class141.field3031.method47(arg0 ^ 0x25EF3A89, var5);
            class141.field3031.method54((byte) -14, class38.field921 + var4);
            class141.field3031.method24(class3.field110 + var2, arg0 ^ 0x1C);
        }
        if (var3 == 1005) {
            class23.field533++;
            class182.field3693 = 0;
            class49.field1188 = class143.field3074;
            class32.field785 = class110.field2480;
            class6.field149 = 2;
            class141.field3031.method854(194, true);
            class141.field3031.method24(var5, -88);
        }
        if (var3 == 57) {
            class11.field275++;
            boolean var29 = class162.method1105(0, class3.field72.field1117[0], 0, 0, 0, 2, var2, class3.field72.field1164[0], var4, false, (byte) -85, 0);
            if (!var29) {
                class162.method1105(0, class3.field72.field1117[0], 0, 1, 1, 2, var2, class3.field72.field1164[0], var4, false, (byte) -41, 0);
            }
            class182.field3693 = 0;
            class6.field149 = 2;
            class49.field1188 = class143.field3074;
            class32.field785 = class110.field2480;
            class141.field3031.method854(124, true);
            class141.field3031.method54((byte) -14, var5);
            class141.field3031.method47(636435176, class3.field110 + var2);
            class141.field3031.method62(class38.field921 + var4, (byte) -78);
        }
        if (var3 == 49 || var3 == 1003) {
            class175.method1166(var4, class84.field2003[arg1], var5, var2, 17120);
        }
        if (var3 == 12) {
            class62 var31 = class33.field806[var5];
            if (var31 != null) {
                class150.field3157++;
                class162.method1105(0, class3.field72.field1117[0], 0, 1, 1, 2, var31.field1117[0], class3.field72.field1164[0], var31.field1164[0], false, (byte) -67, 0);
                class182.field3693 = 0;
                class6.field149 = 2;
                class49.field1188 = class143.field3074;
                class32.field785 = class110.field2480;
                class141.field3031.method854(195, true);
                class141.field3031.method24(var5, arg0 ^ 0x1C);
            }
        }
        if (var3 == 35) {
            class141.field3031.method854(103, true);
            class141.field3031.method62(var2, (byte) 49);
            class33.field792++;
            class141.field3031.method24(class33.field793, 126);
            class141.field3031.method76(var4, (byte) 114);
            class141.field3031.method47(636435176, var5);
            class141.field3031.method53(class60.field1538, 1623728984);
            class113.field2537 = 0;
            class162.field3332 = class59.method555(var4, arg0 ^ 0x7DCC);
            class103.field2384 = var2;
        }
        if (var3 == 45) {
            class51.field1237++;
            boolean var32 = class162.method1105(0, class3.field72.field1117[0], 0, 0, 0, 2, var2, class3.field72.field1164[0], var4, false, (byte) -114, 0);
            if (!var32) {
                class162.method1105(0, class3.field72.field1117[0], 0, 1, 1, 2, var2, class3.field72.field1164[0], var4, false, (byte) -37, 0);
            }
            class6.field149 = 2;
            class32.field785 = class110.field2480;
            class49.field1188 = class143.field3074;
            class182.field3693 = 0;
            class141.field3031.method854(162, true);
            class141.field3031.method54((byte) -14, class3.field110 + var2);
            class141.field3031.method54((byte) -14, var4 + class38.field921);
            class141.field3031.method47(636435176, var5);
        }
        if (var3 == 5 && class151.method1061(var4, var6, var2, arg0 ^ 0xFFFFFF88)) {
            class141.field3031.method854(55, true);
            class141.field3031.method22(class123.field2710, 458634000);
            class141.field3031.method47(arg0 ^ 0x25EF3A89, class38.field921 + var4);
            class138.field2958++;
            class141.field3031.method47(636435176, class17.field405);
            class141.field3031.method62(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) -86);
            class141.field3031.method54((byte) -14, class90.field2114);
            class141.field3031.method24(class3.field110 + var2, 124);
        }
        if (var3 == 24) {
            class151.method1061(var4, var6, var2, -23);
            class141.field3031.method854(77, true);
            class152.field3182++;
            class141.field3031.method54((byte) -14, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class141.field3031.method54((byte) -14, class3.field110 + var2);
            class141.field3031.method62(var4 + class38.field921, (byte) 105);
        }
        if (var3 == 17) {
            class62 var34 = class33.field806[var5];
            if (var34 != null) {
                class162.method1105(0, class3.field72.field1117[0], 0, 1, 1, 2, var34.field1117[0], class3.field72.field1164[0], var34.field1164[0], false, (byte) -22, 0);
                class6.field149 = 2;
                class182.field3693 = 0;
                class32.field785 = class110.field2480;
                class49.field1188 = class143.field3074;
                class141.field3031.method854(132, true);
                class141.field3031.method44((byte) 126, class123.field2710);
                class141.field3031.method54((byte) -14, class90.field2114);
                class141.field3031.method24(var5, 23);
                class84.field1988++;
                class141.field3031.method62(class17.field405, (byte) 73);
            }
        }
        if (var3 == 31) {
            class141.field3031.method854(26, true);
            class141.field3031.method47(636435176, var5);
            class141.field3031.method44((byte) 51, var4);
            class141.field3031.method62(var2, (byte) -119);
            class113.field2537 = 0;
            class60.field1541++;
            class162.field3332 = class59.method555(var4, 32173);
            class103.field2384 = var2;
        }
        if (var3 == 10) {
            class62 var35 = class33.field806[var5];
            if (var35 != null) {
                class56.field1488++;
                class162.method1105(0, class3.field72.field1117[0], 0, 1, 1, 2, var35.field1117[0], class3.field72.field1164[0], var35.field1164[0], false, (byte) -20, 0);
                class49.field1188 = class143.field3074;
                class182.field3693 = 0;
                class32.field785 = class110.field2480;
                class6.field149 = 2;
                class141.field3031.method854(60, true);
                class141.field3031.method47(636435176, var5);
            }
        }
        if (var3 == 33) {
            class54 var36 = class12.method149(var2, var4, 12226);
            if (var36 != null) {
                class52.method511(1969814855);
                class27.method268(var4, var2, class186.method1221((byte) -92, class10.method136((byte) -116, var36)), 64);
                class184.field3729 = 0;
                class106.field2420 = class79.method707((byte) -122, var36);
                if (class106.field2420 == null) {
                    class106.field2420 = class6.field159;
                }
                if (var36.field1336) {
                    class24.field547 = class89.method772((byte) 48, new class63[] { var36.field1381, class83.field1964 });
                    return;
                }
                class24.field547 = class89.method772((byte) 70, new class63[] { class109.field2466, var36.field1334, class83.field1964 });
            }
            return;
        }
        if (var3 == 58) {
            class62 var37 = class33.field806[var5];
            if (var37 != null) {
                class39.field933++;
                class162.method1105(0, class3.field72.field1117[0], 0, 1, 1, 2, var37.field1117[0], class3.field72.field1164[0], var37.field1164[0], false, (byte) -54, 0);
                class49.field1188 = class143.field3074;
                class6.field149 = 2;
                class32.field785 = class110.field2480;
                class182.field3693 = 0;
                class141.field3031.method854(92, true);
                class141.field3031.method62(var5, (byte) -110);
            }
        }
        if (var3 == 1006) {
            class32.field785 = class110.field2480;
            class54.field1437++;
            class6.field149 = 2;
            class49.field1188 = class143.field3074;
            class182.field3693 = 0;
            class141.field3031.method854(93, true);
            class141.field3031.method62(var5, (byte) 103);
        }
        if (var3 == 43) {
            class62 var38 = class33.field806[var5];
            if (var38 != null) {
                class162.method1105(0, class3.field72.field1117[0], 0, 1, 1, 2, var38.field1117[0], class3.field72.field1164[0], var38.field1164[0], false, (byte) -73, 0);
                class19.field456++;
                class6.field149 = 2;
                class32.field785 = class110.field2480;
                class182.field3693 = 0;
                class49.field1188 = class143.field3074;
                class141.field3031.method854(108, true);
                class141.field3031.method54((byte) -14, var5);
            }
        }
        if (var3 == 39) {
            class62 var39 = class33.field806[var5];
            if (var39 != null) {
                class17.field424++;
                class162.method1105(0, class3.field72.field1117[0], 0, 1, 1, 2, var39.field1117[0], class3.field72.field1164[0], var39.field1164[0], false, (byte) -88, 0);
                class182.field3693 = 0;
                class49.field1188 = class143.field3074;
                class32.field785 = class110.field2480;
                class6.field149 = 2;
                class141.field3031.method854(210, true);
                class141.field3031.method24(var5, 127);
            }
        }
        if (var3 == 2) {
            class151.method1061(var4, var6, var2, arg0 ^ 0xFFFFFF88);
            class141.field3031.method854(208, true);
            class141.field3031.method62((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) 107);
            class141.field3031.method47(636435176, class3.field110 + var2);
            class141.field3031.method62(class38.field921 + var4, (byte) 119);
            class51.field1238++;
        }
        if (var3 == 37) {
            class181.field3669++;
            class141.field3031.method854(22, true);
            class141.field3031.method62(var5, (byte) 126);
            class141.field3031.method22(var4, 458634000);
            class141.field3031.method62(var2, (byte) -100);
            class113.field2537 = 0;
            class162.field3332 = class59.method555(var4, 32173);
            class103.field2384 = var2;
        }
        if (var3 == 29) {
            class62 var40 = class33.field806[var5];
            if (var40 != null) {
                class162.method1105(0, class3.field72.field1117[0], 0, 1, 1, 2, var40.field1117[0], class3.field72.field1164[0], var40.field1164[0], false, (byte) -37, 0);
                class6.field149 = 2;
                class182.field3693 = 0;
                class32.field785 = class110.field2480;
                class49.field1188 = class143.field3074;
                class176.field3616++;
                class141.field3031.method854(12, true);
                class141.field3031.method47(arg0 ^ 0x25EF3A89, var5);
            }
        }
        if (var3 == 14) {
            class6 var41 = class55.field1458[var5];
            if (var41 != null) {
                class162.method1105(0, class3.field72.field1117[0], 0, 1, 1, 2, var41.field1117[0], class3.field72.field1164[0], var41.field1164[0], false, (byte) -12, 0);
                class6.field149 = 2;
                class182.field3693 = 0;
                class49.field1188 = class143.field3074;
                class32.field785 = class110.field2480;
                class141.field3031.method854(86, true);
                class161.field3314++;
                class141.field3031.method47(636435176, var5);
            }
        }
        if (var3 == 26) {
            class62 var42 = class33.field806[var5];
            if (var42 != null) {
                class162.method1105(0, class3.field72.field1117[0], 0, 1, 1, 2, var42.field1117[0], class3.field72.field1164[0], var42.field1164[0], false, (byte) -29, 0);
                class32.field785 = class110.field2480;
                class182.field3693 = 0;
                class6.field149 = 2;
                class49.field1188 = class143.field3074;
                class189.field3813++;
                class141.field3031.method854(250, true);
                class141.field3031.method24(var5, arg0 + 30);
            }
        }
        if (var3 == 11) {
            class183.field3708++;
            class141.field3031.method854(74, true);
            class141.field3031.method47(arg0 ^ 0x25EF3A89, class33.field793);
            class141.field3031.method44((byte) 18, var4);
            class141.field3031.method22(class60.field1538, 458634000);
            class141.field3031.method47(636435176, var2);
        }
        if (var3 == 1) {
            class190.field3848++;
            class141.field3031.method854(144, true);
            class141.field3031.method62(var5, (byte) 77);
            class141.field3031.method44((byte) 43, var4);
            class141.field3031.method62(var2, (byte) -109);
            class113.field2537 = 0;
            class162.field3332 = class59.method555(var4, 32173);
            class103.field2384 = var2;
        }
        if (var3 == 1001) {
            class182.field3693 = 0;
            class32.field785 = class110.field2480;
            class6.field149 = 2;
            class49.field1188 = class143.field3074;
            class6 var43 = class55.field1458[var5];
            if (var43 != null) {
                class28 var44 = var43.field150;
                if (var44.field623 != null) {
                    var44 = var44.method281(true);
                }
                if (var44 != null) {
                    class141.field3031.method854(110, true);
                    class141.field3031.method54((byte) -14, var44.field666);
                    class138.field2974++;
                }
            }
        }
        if (var3 == 50) {
            class126.field2781++;
            boolean var45 = class162.method1105(0, class3.field72.field1117[0], 0, 0, 0, 2, var2, class3.field72.field1164[0], var4, false, (byte) -59, 0);
            if (!var45) {
                class162.method1105(0, class3.field72.field1117[0], 0, 1, 1, 2, var2, class3.field72.field1164[0], var4, false, (byte) -123, 0);
            }
            class32.field785 = class110.field2480;
            class49.field1188 = class143.field3074;
            class182.field3693 = 0;
            class6.field149 = 2;
            class141.field3031.method854(69, true);
            class141.field3031.method62(var5, (byte) 97);
            class141.field3031.method54((byte) -14, var4 + class38.field921);
            class141.field3031.method47(arg0 + 636435079, var2 - -class3.field110);
        }
        if (var3 == 28) {
            class6 var47 = class55.field1458[var5];
            if (var47 != null) {
                class162.method1105(0, class3.field72.field1117[0], 0, 1, 1, 2, var47.field1117[0], class3.field72.field1164[0], var47.field1164[0], false, (byte) -43, 0);
                class49.field1188 = class143.field3074;
                class6.field149 = 2;
                class3.field76++;
                class182.field3693 = 0;
                class32.field785 = class110.field2480;
                class141.field3031.method854(72, true);
                class141.field3031.method62(var5, (byte) -99);
                class141.field3031.method44((byte) 53, class60.field1538);
                class141.field3031.method54((byte) -14, class33.field793);
            }
        }
        if (arg0 != 97) {
            return;
        }
        if (var3 == 18) {
            class52.method511(arg0 ^ 0x7568FD26);
            class54 var48 = class59.method555(var4, 32173);
            class123.field2710 = var4;
            class90.field2114 = var2;
            class184.field3729 = 1;
            class17.field405 = var5;
            class113.method901(0, var48);
            class62.field1554 = class89.method772((byte) 42, new class63[] { class103.field2379, class59.method554(var5, 13319).field2202, class83.field1964 });
            if (class62.field1554 == null) {
                class62.field1554 = class111.field2509;
            }
            return;
        }
        if (var3 == 47) {
            class173.field3566++;
            class141.field3031.method854(198, true);
            class141.field3031.method22(var4, arg0 ^ 0x1B563371);
            class141.field3031.method24(var2, 125);
            class141.field3031.method24(var5, -75);
            class113.field2537 = 0;
            class162.field3332 = class59.method555(var4, 32173);
            class103.field2384 = var2;
        }
        if (var3 == 19) {
            class3.method43(class112.field2528, var2, var4);
        }
        if (var3 == 22) {
            class62 var49 = class33.field806[var5];
            if (var49 != null) {
                class162.method1105(0, class3.field72.field1117[0], 0, 1, 1, 2, var49.field1117[0], class3.field72.field1164[0], var49.field1164[0], false, (byte) -47, 0);
                class32.field785 = class110.field2480;
                class6.field149 = 2;
                class182.field3693 = 0;
                class9.field199++;
                class49.field1188 = class143.field3074;
                class141.field3031.method854(222, true);
                class141.field3031.method54((byte) -14, class33.field793);
                class141.field3031.method44((byte) 86, class60.field1538);
                class141.field3031.method47(636435176, var5);
            }
        }
        if (class184.field3729 != 0) {
            class184.field3729 = 0;
            class113.method901(0, class59.method555(class123.field2710, 32173));
        }
        if (class181.field3680) {
            class52.method511(1969814855);
        }
        if (class162.field3332 != null && class113.field2537 == 0) {
            class113.method901(0, class162.field3332);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([Lgg;I)[Lgg;")
    public static final class63[] method913(class63[] arg0, int arg1) {
        field2595++;
        class63[] var2 = new class63[5];
        if (arg1 != 12852) {
            return null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class89.method772((byte) 84, new class63[] { class175.method1162((byte) -126, var3), class121.field2662 });
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class89.method772((byte) 110, new class63[] { var2[var3], arg0[var3] });
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V")
    public static final void method914(int arg0) {
        class134.field2903 = new class148();
        if (arg0 != 0) {
            method911(113, null);
        }
        field2601++;
    }
}
