import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class99 extends class225 {

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "Lvk;")
    public static class56 field1377 = new class56(8);

    @OriginalMember(owner = "client!tl", name = "K", descriptor = "I")
    public static volatile int field1388 = 0;

    @OriginalMember(owner = "client!tl", name = "F", descriptor = "C")
    private char field1383;

    @OriginalMember(owner = "client!tl", name = "y", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!tl", name = "B", descriptor = "I")
    public int field1380;

    @OriginalMember(owner = "client!tl", name = "C", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!tl", name = "E", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!tl", name = "G", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!tl", name = "H", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!tl", name = "I", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!tl", name = "L", descriptor = "I")
    public static int field1389;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tl", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field1390;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "Ljava/lang/String;")
    public String field1376;

    @OriginalMember(owner = "client!tl", name = "J", descriptor = "[[[Lgk;")
    public static class254[][][] field1387;

    // $FF: synthetic method
    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method679(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(B)V", line = 4)
    public static void method670(byte arg0) {
        if (arg0 != -106) {
            field1385 = 84;
        }
        field1387 = null;
        field1377 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILnj;)V", line = 16)
    public final void method671(int arg0, class228 arg1) {
        while (true) {
            int var3 = arg1.method1348(-128);
            if (var3 == 0) {
                if (arg0 != 0) {
                    return;
                }
                field1382++;
                return;
            }
            this.method678(arg0 ^ 0x314A, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BIIJ)V", line = 36)
    public static final void method672(byte arg0, int arg1, int arg2, long arg3) {
        field1389++;
        int var5 = ((int) arg3 & 0x7F23E) >> 14;
        if (arg0 != -62) {
            field1387 = null;
        }
        int var6 = (int) arg3 >> 20 & 0x3;
        int var7 = (int) (arg3 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class254.method1552(0, arg2, var5, arg1, class227.field2988.field4362[0], 0, -2, true, var6, class227.field2988.field4360[0], 0);
            return;
        }
        class104 var8 = class329.method2190((byte) 63, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field1489;
            var9 = var8.field1506;
        } else {
            var9 = var8.field1489;
            var10 = var8.field1506;
        }
        int var11 = var8.field1439;
        if (var6 != 0) {
            var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
        }
        class254.method1552(var11, arg2, 0, arg1, class227.field2988.field4362[0], var10, -2, true, 0, class227.field2988.field4360[0], var9);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "([Lps;II)V", line = 80)
    public static final void method673(class394[] arg0, int arg1, int arg2) {
        field1381++;
        int var3 = -4 % ((57 - arg1) / 61);
        for (int var4 = 0; var4 < arg0.length; var4++) {
            class394 var5 = arg0[var4];
            if (var5 != null && var5.field5639 == arg2 && (!var5.field5790 || !client.method1546(var5))) {
                if (var5.field5671 == 0) {
                    if (!var5.field5790 && client.method1546(var5) && class96.field1358 != var5) {
                        continue;
                    }
                    method673(arg0, 125, var5.field5698);
                    if (var5.field5820 != null) {
                        method673(var5.field5820, -95, var5.field5698);
                    }
                    class169 var6 = (class169) field1377.method384((long) var5.field5698, true);
                    if (var6 != null) {
                        class388.method2499(1, var6.field2275);
                    }
                }
                if (var5.field5671 == 6) {
                    if (var5.field5643 != -1 || var5.field5668 != -1) {
                        boolean var7 = class188.method1132((byte) -17, var5);
                        int var8;
                        if (var7) {
                            var8 = var5.field5668;
                        } else {
                            var8 = var5.field5643;
                        }
                        if (var8 != -1) {
                            class12 var9 = class33.method221((byte) 102, var8);
                            if (var9 != null) {
                                var5.field5645 += class379.field5514;
                                while (var9.field176[var5.field5727] < var5.field5645) {
                                    var5.field5645 -= var9.field176[var5.field5727];
                                    var5.field5727++;
                                    if (var9.field182.length <= var5.field5727) {
                                        var5.field5727 -= var9.field177;
                                        if (var5.field5727 < 0 || var5.field5727 >= var9.field182.length) {
                                            var5.field5727 = 0;
                                        }
                                    }
                                    var5.field5703 = var5.field5727 + 1;
                                    if (var5.field5703 >= var9.field182.length) {
                                        var5.field5703 -= var9.field177;
                                        if (var5.field5703 < 0 || var5.field5703 >= var9.field182.length) {
                                            var5.field5703 = -1;
                                        }
                                    }
                                    class407.method2621(var5, 15);
                                }
                            }
                        }
                    }
                    if (var5.field5675 != 0 && !var5.field5790) {
                        int var10 = var5.field5675 >> 16;
                        int var11 = class379.field5514 * var10;
                        int var12 = var5.field5675 << 16 >> 16;
                        var5.field5666 = var5.field5666 + var11 & 0x3FFF;
                        int var13 = class379.field5514 * var12;
                        var5.field5795 = var5.field5795 + var13 & 0x3FFF;
                        class407.method2621(var5, 15);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)Lfp;", line = 198)
    public static final class7 method674(int arg0, int arg1) {
        field1378++;
        class7 var2 = (class7) class129.field1787.method1137((long) arg1, arg0 + 2108653675);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class226.field2968.method2261(arg1, arg0, 120);
        class7 var4 = new class7();
        var4.field103 = arg1;
        if (var3 != null) {
            var4.method59(new class228(var3), -24120);
        }
        var4.method55((byte) 113);
        class129.field1787.method1144((long) arg1, var4, arg0 ^ 0xFFFFF24C);
        return var4;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(II)V", line = 228)
    public static final void method675(int arg0, int arg1) {
        class254 var2 = class213.field2852[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class254 var4 = class213.field2852[var3][arg0][arg1] = class213.field2852[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field3517--;
                for (class328 var5 = var4.field3515; var5 != null; var5 = var5.field4783) {
                    class55 var6 = var5.field4785;
                    if (var6.field743 == arg0 && var6.field726 == arg1) {
                        var6.field727--;
                    }
                }
            }
        }
        if (class213.field2852[0][arg0][arg1] == null) {
            class213.field2852[0][arg0][arg1] = new class254(0, arg0, arg1);
            class213.field2852[0][arg0][arg1].field3507 = 1;
        }
        class213.field2852[0][arg0][arg1].field3503 = var2;
        class213.field2852[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILma;)V", line = 267)
    public static final void method676(int arg0, class306 arg1) {
        field1379++;
        if (class213.field2852 == null) {
            return;
        }
        class425 var2 = null;
        if (arg1.field4495 == arg0) {
            var2 = (class425) class40.method292(arg1.field4493, arg1.field4492, arg1.field4503);
        }
        if (arg1.field4495 == 1) {
            var2 = (class425) class376.method2434(arg1.field4493, arg1.field4492, arg1.field4503);
        }
        if (arg1.field4495 == 2) {
            var2 = (class425) class243.method1460(arg1.field4493, arg1.field4492, arg1.field4503, field1390 == null ? (field1390 = method679("jb")) : field1390);
        }
        if (arg1.field4495 == 3) {
            var2 = (class425) class130.method823(arg1.field4493, arg1.field4492, arg1.field4503);
        }
        if (var2 == null) {
            arg1.field4508 = 0;
            arg1.field4498 = 0;
            arg1.field4497 = -1;
        } else {
            arg1.field4497 = var2.method121(arg0 ^ 0xFFFFC4ED);
            arg1.field4498 = var2.method105(-23);
            arg1.field4508 = var2.method120(25940);
        }
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "(B)Z", line = 323)
    public final boolean method677(byte arg0) {
        if (arg0 != 69) {
            field1377 = null;
        }
        field1384++;
        return this.field1383 == 's';
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILnj;I)V", line = 334)
    private final void method678(int arg0, class228 arg1, int arg2) {
        if (arg0 != 12618) {
            return;
        }
        if (arg2 == 1) {
            this.field1383 = class27.method189(-24769, arg1.method1349(arg0 - 12615));
        } else if (arg2 == 2) {
            this.field1380 = arg1.method1344((byte) 95);
        } else if (arg2 == 5) {
            this.field1376 = arg1.method1329(991328496);
        }
        field1386++;
    }
}
