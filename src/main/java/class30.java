import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class30 {

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "[B")
    private byte[] field626;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "[I")
    private int[] field622;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "[I")
    private int[] field627;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "Lkc;")
    public static class67 field628 = class19.method144("Cabbage", 83);

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field631 = 0;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Lgd;")
    public static class44 field625 = new class44(64);

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "Lkc;")
    public static class67 field641 = class19.method144("Icons redrawn", 89);

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field638 = 0;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "Lkc;")
    private static class67 field633 = class19.method144("Please check your message)2centre for details)3", 127);

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field637 = 0;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "Lkc;")
    public static class67 field634 = class19.method144("An", 90);

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "Lkc;")
    public static class67 field646 = field633;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
    public static int field645 = 0;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "Lkc;")
    private static class67 field647 = class19.method144("RuneScape has been updated(Q", 78);

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "Lkc;")
    private static class67 field642 = class19.method144("Walk here", 116);

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "Lkc;")
    public static class67 field635 = field647;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "Lkc;")
    public static class67 field636 = field642;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "J")
    public static long field644;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "Lje;")
    public static class63 field639;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 4)
    public static final void method254(int arg0) {
        if (arg0 != -1) {
            field640 = -1;
        }
        field632++;
        while (true) {
            label289: do {
                while (class114.method916((byte) 102)) {
                    if (class96.field2163 != -1 && class96.field2163 == class20.field413) {
                        if (class64.field1502 == 85 && class127.field2968.method539(2618) > 0) {
                            class127.field2968 = class127.field2968.method529(0, class127.field2968.method539(2618) - 1, 17804);
                        }
                        continue label289;
                    }
                    if (class21.field434) {
                        if (class64.field1502 == 85 && class127.field2967.method539(2618) > 0) {
                            class127.field2967 = class127.field2967.method529(0, class127.field2967.method539(2618) - 1, 17804);
                            class138.field3304 = true;
                        }
                        if (class134.method1039(class77.field1831, -19770) && class127.field2967.method539(2618) < 80) {
                            class127.field2967 = class127.field2967.method513(class77.field1831, (byte) -103);
                            class138.field3304 = true;
                        }
                        if (class64.field1502 == 84) {
                            class21.field434 = false;
                            class138.field3304 = true;
                            if (field645 == 1) {
                                long var10 = class127.field2967.method532(-125);
                                class94.method743(var10, (byte) -59);
                            }
                            if (field645 == 2 && class9.field188 > 0) {
                                long var12 = class127.field2967.method532(-65);
                                class9.method78(var12, (byte) -110);
                            }
                            if (field645 == 3 && class127.field2967.method539(arg0 + 2619) > 0) {
                                class54.field1295.method713(503, 154);
                                class60.field1427++;
                                class54.field1295.method1115((byte) 49, 0);
                                int var14 = class54.field1295.field3347;
                                class54.field1295.method1083((byte) -96, class141.field3390);
                                class83.method647(2047, class54.field1295, class127.field2967);
                                class54.field1295.method1108(-1, class54.field1295.field3347 - var14);
                                if (class4.field93 == 2) {
                                    class103.field2314++;
                                    class4.field93 = 1;
                                    class59.field1386 = true;
                                    class54.field1295.method713(arg0 + 504, 194);
                                    class54.field1295.method1115((byte) 49, class20.field410);
                                    class54.field1295.method1115((byte) 49, class4.field93);
                                    class54.field1295.method1115((byte) 49, class58.field1375);
                                }
                            }
                            if (field645 == 4 && class128.field3003 < 100) {
                                long var15 = class127.field2967.method532(arg0 - 113);
                                class74.method602(var15, (byte) 107);
                            }
                            if (field645 == 5 && class128.field3003 > 0) {
                                long var17 = class127.field2967.method532(-102);
                                class14.method114(var17, (byte) 126);
                            }
                        }
                    } else if (class41.field1008 == 1) {
                        if (class64.field1502 == 85 && class127.field2966.method539(2618) > 0) {
                            class127.field2966 = class127.field2966.method529(0, class127.field2966.method539(arg0 ^ -2619) - 1, 17804);
                            class138.field3304 = true;
                        }
                        if (class100.method765(-1, class77.field1831) && class127.field2966.method539(2618) < 10) {
                            class127.field2966 = class127.field2966.method513(class77.field1831, (byte) -106);
                            class138.field3304 = true;
                        }
                        if (class64.field1502 == 84) {
                            if (class127.field2966.method539(2618) > 0) {
                                class102.field2288++;
                                int var1 = 0;
                                if (class127.field2966.method522(false)) {
                                    var1 = class127.field2966.method523(arg0 ^ 0xFFFFFFF5);
                                }
                                class54.field1295.method713(arg0 ^ 0xFFFFFE08, 20);
                                class54.field1295.method1100(var1, (byte) -28);
                            }
                            class41.field1008 = 0;
                            class138.field3304 = true;
                        }
                    } else if (class41.field1008 == 2) {
                        if (class64.field1502 == 85 && class127.field2966.method539(2618) > 0) {
                            class127.field2966 = class127.field2966.method529(0, class127.field2966.method539(arg0 ^ -2619) - 1, arg0 ^ 0xFFFFBA73);
                            class138.field3304 = true;
                        }
                        if ((class117.method929(-124, class77.field1831) || class77.field1831 == 32) && class127.field2966.method539(2618) < 12) {
                            class127.field2966 = class127.field2966.method513(class77.field1831, (byte) -112);
                            class138.field3304 = true;
                        }
                        if (class64.field1502 == 84) {
                            if (class127.field2966.method539(arg0 + 2619) > 0) {
                                class54.field1295.method713(arg0 + 504, 208);
                                class54.field1295.method1083((byte) -111, class127.field2966.method532(-92));
                                class76.field1809++;
                            }
                            class138.field3304 = true;
                            class41.field1008 = 0;
                        }
                    } else if (class41.field1008 == 3) {
                        if (class64.field1502 == 85 && class127.field2966.method539(2618) > 0) {
                            class127.field2966 = class127.field2966.method529(0, class127.field2966.method539(arg0 ^ 0xFFFFF5C5) - 1, 17804);
                            class138.field3304 = true;
                        }
                        if (class134.method1039(class77.field1831, -19770) && class127.field2966.method539(2618) < 40) {
                            class127.field2966 = class127.field2966.method513(class77.field1831, (byte) -104);
                            class138.field3304 = true;
                        }
                    } else if (class63.field1487 == -1 && class59.field1387 == -1) {
                        if (class64.field1502 == 85 && class127.field2965.method539(2618) > 0) {
                            class127.field2965 = class127.field2965.method529(0, class127.field2965.method539(2618) - 1, 17804);
                            class138.field3304 = true;
                        }
                        if (class134.method1039(class77.field1831, -19770) && class127.field2965.method539(2618) < 80) {
                            class127.field2965 = class127.field2965.method513(class77.field1831, (byte) -107);
                            class138.field3304 = true;
                        }
                        if (class64.field1502 == 84 && class127.field2965.method539(2618) > 0) {
                            if (class97.field2195 == 2) {
                                if (class127.field2965.method533(class18.field347, (byte) -100)) {
                                    class93.method733((byte) 55);
                                }
                                if (class127.field2965.method533(class4.field51, (byte) -120)) {
                                    class69.field1655 = true;
                                }
                                if (class127.field2965.method533(class20.field408, (byte) -108)) {
                                    class69.field1655 = false;
                                }
                                if (class127.field2965.method533(class7.field152, (byte) -101)) {
                                    for (int var2 = 0; var2 < 4; var2++) {
                                        for (int var3 = 1; var3 < 103; var3++) {
                                            for (int var4 = 1; var4 < 103; var4++) {
                                                class14.field295[var2].field98[var3][var4] = 0;
                                            }
                                        }
                                    }
                                }
                                if (class127.field2965.method533(class99.field2228, (byte) -117) && class129.field3014 == 2) {
                                    throw new RuntimeException();
                                }
                                if (class127.field2965.method533(class24.field513, (byte) -118)) {
                                    class140.field3383 = true;
                                }
                            }
                            if (class127.field2965.method553(class9.field199, (byte) -64)) {
                                class117.field2768++;
                                class54.field1295.method713(503, 179);
                                class54.field1295.method1115((byte) 49, class127.field2965.method539(2618) - 1);
                                class54.field1295.method1090((byte) -78, class127.field2965.method531(13401, 2));
                            } else {
                                class141.field3389++;
                                class67 var5 = class127.field2965.method527(-32632);
                                byte var6 = 0;
                                if (var5.method553(class34.field820, (byte) -64)) {
                                    class127.field2965 = class127.field2965.method531(13401, class34.field820.method539(2618));
                                    var6 = 0;
                                } else if (var5.method553(class85.field1999, (byte) -64)) {
                                    class127.field2965 = class127.field2965.method531(arg0 + 13402, class85.field1999.method539(2618));
                                    var6 = 1;
                                } else if (var5.method553(class71.field1681, (byte) -64)) {
                                    class127.field2965 = class127.field2965.method531(13401, class71.field1681.method539(2618));
                                    var6 = 2;
                                } else if (var5.method553(class11.field250, (byte) -64)) {
                                    class127.field2965 = class127.field2965.method531(13401, class11.field250.method539(2618));
                                    var6 = 3;
                                } else if (var5.method553(class18.field360, (byte) -64)) {
                                    var6 = 4;
                                    class127.field2965 = class127.field2965.method531(13401, class18.field360.method539(2618));
                                } else if (var5.method553(class99.field2229, (byte) -64)) {
                                    var6 = 5;
                                    class127.field2965 = class127.field2965.method531(13401, class99.field2229.method539(2618));
                                } else if (var5.method553(class77.field1823, (byte) -64)) {
                                    class127.field2965 = class127.field2965.method531(arg0 ^ 0xFFFFCBA6, class77.field1823.method539(2618));
                                    var6 = 6;
                                } else if (var5.method553(class126.field2942, (byte) -64)) {
                                    var6 = 7;
                                    class127.field2965 = class127.field2965.method531(13401, class126.field2942.method539(2618));
                                } else if (var5.method553(class45.field1093, (byte) -64)) {
                                    var6 = 8;
                                    class127.field2965 = class127.field2965.method531(13401, class45.field1093.method539(2618));
                                } else if (var5.method553(class138.field3295, (byte) -64)) {
                                    class127.field2965 = class127.field2965.method531(13401, class138.field3295.method539(2618));
                                    var6 = 9;
                                } else if (var5.method553(class29.field601, (byte) -64)) {
                                    var6 = 10;
                                    class127.field2965 = class127.field2965.method531(13401, class29.field601.method539(arg0 ^ 0xFFFFF5C5));
                                } else if (var5.method553(class58.field1377, (byte) -64)) {
                                    class127.field2965 = class127.field2965.method531(13401, class58.field1377.method539(arg0 ^ 0xFFFFF5C5));
                                    var6 = 11;
                                }
                                byte var7 = 0;
                                class67 var8 = class127.field2965.method527(-32632);
                                if (var8.method553(class130.field3054, (byte) -64)) {
                                    var7 = 1;
                                    class127.field2965 = class127.field2965.method531(13401, class130.field3054.method539(2618));
                                } else if (var8.method553(class132.field3147, (byte) -64)) {
                                    var7 = 2;
                                    class127.field2965 = class127.field2965.method531(13401, class132.field3147.method539(2618));
                                } else if (var8.method553(class128.field3007, (byte) -64)) {
                                    var7 = 3;
                                    class127.field2965 = class127.field2965.method531(13401, class128.field3007.method539(2618));
                                } else if (var8.method553(class59.field1395, (byte) -64)) {
                                    var7 = 4;
                                    class127.field2965 = class127.field2965.method531(13401, class59.field1395.method539(arg0 ^ 0xFFFFF5C5));
                                } else if (var8.method553(class66.field1560, (byte) -64)) {
                                    var7 = 5;
                                    class127.field2965 = class127.field2965.method531(13401, class66.field1560.method539(arg0 + 2619));
                                }
                                class54.field1295.method713(503, 201);
                                class54.field1295.method1115((byte) 49, 0);
                                int var9 = class54.field1295.field3347;
                                class54.field1295.method1115((byte) 49, var6);
                                class54.field1295.method1115((byte) 49, var7);
                                class83.method647(2047, class54.field1295, class127.field2965);
                                class54.field1295.method1108(arg0, class54.field1295.field3347 - var9);
                                if (class20.field410 == 2) {
                                    class103.field2314++;
                                    class59.field1386 = true;
                                    class20.field410 = 3;
                                    class54.field1295.method713(503, 194);
                                    class54.field1295.method1115((byte) 49, class20.field410);
                                    class54.field1295.method1115((byte) 49, class4.field93);
                                    class54.field1295.method1115((byte) 49, class58.field1375);
                                }
                            }
                            class127.field2965 = class127.field2976;
                            class138.field3304 = true;
                        }
                    }
                }
                return;
            } while (!class117.method929(-127, class77.field1831) && class77.field1831 != 32);
            if (class127.field2968.method539(2618) < 12) {
                class127.field2968 = class127.field2968.method513(class77.field1831, (byte) -88);
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V", line = 491)
    public static void method255(int arg0) {
        field641 = null;
        field646 = null;
        field634 = null;
        field647 = null;
        field628 = null;
        if (arg0 != 15741) {
            method254(-34);
        }
        field639 = null;
        field625 = null;
        field633 = null;
        field642 = null;
        field636 = null;
        field635 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V", line = 514)
    public static final void method256(int arg0, int arg1) {
        field624++;
        class102 var2 = (class102) class82.field1954.method462(false, (long) arg0);
        if (var2 != null) {
            var2.method13(119);
            if (arg1 >= -65) {
                method259(25, 113, 64, -2);
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II[BII[B)I", line = 535)
    public final int method257(int arg0, int arg1, byte[] arg2, int arg3, int arg4, byte[] arg5) {
        int var7 = arg1 + arg4;
        int var8 = arg3 << 3;
        int var9 = 0;
        field643++;
        if (arg0 != 25682) {
            return -83;
        }
        while (var7 > arg1) {
            int var10 = arg2[arg1] & 0xFF;
            int var11 = this.field622[var10];
            byte var12 = this.field626[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = (var14 + var12 - 1 >> 3) + var13;
            var8 += var12;
            int var16 = var9 & -var14 >> 31;
            int var17 = var14 + 24;
            arg5[var13] = (byte) (var9 = class65.method505(var16, var11 >>> var17));
            if (var15 > var13) {
                var13++;
                var14 = var17 - 8;
                arg5[var13] = (byte) (var9 = var11 >>> var14);
                if (var15 > var13) {
                    var14 -= 8;
                    var13++;
                    arg5[var13] = (byte) (var9 = var11 >>> var14);
                    if (var15 > var13) {
                        var14 -= 8;
                        var13++;
                        arg5[var13] = (byte) (var9 = var11 >>> var14);
                        if (var13 < var15) {
                            var14 -= 8;
                            var13++;
                            arg5[var13] = (byte) (var9 = var11 << -var14);
                        }
                    }
                }
            }
            arg1++;
        }
        return (var8 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lab;I)V", line = 624)
    public static final void method258(class3 arg0, int arg1) {
        for (int var2 = 0; var2 < class9.field198.length; var2++) {
            class9.field198[var2] = 0;
        }
        field629++;
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var3);
            class9.field198[var16] = (int) (Math.random() * 256.0D);
        }
        if (arg1 >= -78) {
            field631 = 24;
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class129.field3013[var15] = (class9.field198[var15 - 1] + class9.field198[var15 - 128] + class9.field198[var15 + 128] + class9.field198[var15 - -1]) / 4;
                }
            }
            int[] var13 = class9.field198;
            class9.field198 = class129.field3013;
            class129.field3013 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field34; var7++) {
            for (int var8 = 0; var8 < arg0.field36; var8++) {
                if (arg0.field35[var6++] != 0) {
                    int var9 = var8 + arg0.field33 + 16;
                    int var10 = var7 + arg0.field37 + 16;
                    int var11 = (var10 << 7) + var9;
                    class9.field198[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "([B)V", line = 721)
    public class30(byte[] arg0) {
        int var2 = 0;
        int var3 = arg0.length;
        this.field626 = arg0;
        this.field622 = new int[var3];
        int[] var4 = new int[33];
        this.field627 = new int[8];
        for (int var5 = 0; var5 < var3; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field622[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var4[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var4[var10] = var4[var10 - 1];
                            break;
                        }
                        var4[var10] = class65.method505(var12, var11);
                    }
                    var9 = var7 | var8;
                } else {
                    var9 = var4[var6 - 1];
                }
                var4[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field627[var14] == 0) {
                            this.field627[var14] = var2;
                        }
                        var14 = this.field627[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field627.length <= var14) {
                        int[] var18 = new int[this.field627.length * 2];
                        for (int var19 = 0; var19 < this.field627.length; var19++) {
                            var18[var19] = this.field627[var19];
                        }
                        this.field627 = var18;
                    }
                }
                if (var14 >= var2) {
                    var2 = var14 + 1;
                }
                this.field627[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)I", line = 844)
    public static final int method259(int arg0, int arg1, int arg2, int arg3) {
        field621++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg3;
        }
        if (arg1 != -20303) {
            field641 = null;
        }
        if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V", line = 881)
    public static final void method260(byte arg0) {
        field630++;
        Object var1 = class76.field1814;
        synchronized (class76.field1814) {
            if (class60.field1412 != 0) {
                class60.field1412 = 1;
                try {
                    class76.field1814.wait();
                } catch (InterruptedException var2) {
                }
            }
            if (arg0 < 117) {
                field637 = 10;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[BII[BI)I", line = 949)
    public final int method261(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field623++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = arg0 + arg5;
        if (arg2 != 8) {
            field637 = -102;
        }
        int var8 = 0;
        int var9 = arg3;
        while (true) {
            byte var10 = arg4[var9];
            if (var10 < 0) {
                var8 = this.field627[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field627[var8]) < 0) {
                arg1[arg5++] = (byte) ~var11;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field627[var8];
            }
            int var12;
            if ((var12 = this.field627[var8]) < 0) {
                arg1[arg5++] = (byte) ~var12;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field627[var8];
            }
            int var13;
            if ((var13 = this.field627[var8]) < 0) {
                arg1[arg5++] = (byte) ~var13;
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field627[var8];
            }
            int var14;
            if ((var14 = this.field627[var8]) < 0) {
                arg1[arg5++] = (byte) ~var14;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field627[var8];
            }
            int var15;
            if ((var15 = this.field627[var8]) < 0) {
                arg1[arg5++] = (byte) ~var15;
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field627[var8];
            }
            int var16;
            if ((var16 = this.field627[var8]) < 0) {
                arg1[arg5++] = (byte) ~var16;
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field627[var8];
            }
            int var17;
            if ((var17 = this.field627[var8]) < 0) {
                arg1[arg5++] = (byte) ~var17;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field627[var8];
            }
            int var18;
            if ((var18 = this.field627[var8]) < 0) {
                arg1[arg5++] = (byte) ~var18;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg3;
    }
}
