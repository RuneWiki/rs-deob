import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class14 extends class121 {

    @OriginalMember(owner = "client!bf", name = "T", descriptor = "I")
    private int field324 = 0;

    @OriginalMember(owner = "client!bf", name = "ab", descriptor = "[S")
    private short[] field331 = new short[6];

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "I")
    public int field325 = -1;

    @OriginalMember(owner = "client!bf", name = "mb", descriptor = "I")
    private int field343 = 0;

    @OriginalMember(owner = "client!bf", name = "nb", descriptor = "I")
    private int field344 = 128;

    @OriginalMember(owner = "client!bf", name = "pb", descriptor = "[S")
    private short[] field346 = new short[6];

    @OriginalMember(owner = "client!bf", name = "hb", descriptor = "I")
    private int field338 = 128;

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "I")
    private int field323 = 0;

    @OriginalMember(owner = "client!bf", name = "cb", descriptor = "Loc;")
    public static class99 field333 = class48.method402((byte) -104, "Zu viele Anmelde)2Versuche von Ihrer Adresse");

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "Loc;")
    public static class99 field322 = class48.method402((byte) -104, "Texturen geladen)3");

    @OriginalMember(owner = "client!bf", name = "V", descriptor = "I")
    public static int field326 = 0;

    @OriginalMember(owner = "client!bf", name = "kb", descriptor = "Loc;")
    public static class99 field341 = class48.method402((byte) -104, "gelb:");

    @OriginalMember(owner = "client!bf", name = "ib", descriptor = "Loc;")
    private static class99 field339 = class48.method402((byte) -104, "Private chat");

    @OriginalMember(owner = "client!bf", name = "X", descriptor = "Loc;")
    public static class99 field328 = field339;

    @OriginalMember(owner = "client!bf", name = "W", descriptor = "Lrd;")
    public static class119 field327 = new class119(32);

    @OriginalMember(owner = "client!bf", name = "ub", descriptor = "I")
    public static int field351 = 0;

    @OriginalMember(owner = "client!bf", name = "tb", descriptor = "Loc;")
    public static class99 field350 = class48.method402((byte) -104, "(U2");

    @OriginalMember(owner = "client!bf", name = "vb", descriptor = "I")
    public static int field352 = -1;

    @OriginalMember(owner = "client!bf", name = "Y", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!bf", name = "Z", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!bf", name = "bb", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!bf", name = "db", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!bf", name = "eb", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!bf", name = "fb", descriptor = "I")
    public int field336;

    @OriginalMember(owner = "client!bf", name = "gb", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!bf", name = "jb", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!bf", name = "lb", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!bf", name = "ob", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!bf", name = "qb", descriptor = "I")
    private int field347;

    @OriginalMember(owner = "client!bf", name = "rb", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!bf", name = "sb", descriptor = "Ljc;")
    public static class64 field349;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZIILse;)V")
    public static final void method142(int arg0, boolean arg1, int arg2, int arg3, class126 arg4) {
        field334++;
        if (class69.field1770 == arg4 || class144.field3601 >= 400) {
            return;
        }
        class99 var5;
        if (arg4.field3036 == 0) {
            var5 = class20.method189(new class99[] { arg4.field3034, class105.method902(class69.field1770.field3030, true, arg4.field3030), class18.field475, class74.field1860, class5.method31(arg4.field3030, 10), class4.field87 }, 99);
        } else {
            var5 = class20.method189(new class99[] { arg4.field3034, class18.field475, class84.field2105, class5.method31(arg4.field3036, 10), class4.field87 }, 84);
        }
        if (class46.field1130 == 1) {
            class112.field2805++;
            class136.method1132(arg3, class20.method189(new class99[] { class89.field2206, class128.field3147, var5 }, 76), 10, arg0, (byte) 21, class48.field1166, arg2);
        } else if (!class121.field2957) {
            for (int var6 = 4; var6 >= 0; var6--) {
                if (class121.field2960[var6] != null) {
                    class60.field1600++;
                    short var7 = 0;
                    int var8 = 0;
                    if (class121.field2960[var6].method845(class104.field2521, 63)) {
                        if (class69.field1770.field3030 < arg4.field3030) {
                            var7 = 2000;
                        }
                        if (class69.field1770.field3040 != 0 && arg4.field3040 != 0) {
                            if (class69.field1770.field3040 == arg4.field3040) {
                                var7 = 2000;
                            } else {
                                var7 = 0;
                            }
                        }
                    } else if (class125.field3011[var6]) {
                        var7 = 2000;
                    }
                    if (var6 == 0) {
                        var8 = var7 + 3;
                    }
                    if (var6 == 1) {
                        var8 = var7 + 36;
                    }
                    if (var6 == 2) {
                        var8 = var7 + 53;
                    }
                    if (var6 == 3) {
                        var8 = var7 + 50;
                    }
                    if (var6 == 4) {
                        var8 = var7 + 4;
                    }
                    class136.method1132(arg3, class20.method189(new class99[] { class144.field3598, var5 }, 125), var8, arg0, (byte) 21, class121.field2960[var6], arg2);
                }
            }
        } else if ((class111.field2774 & 0x8) == 8) {
            class111.field2780++;
            class136.method1132(arg3, class20.method189(new class99[] { class63.field1678, class128.field3147, var5 }, 48), 21, arg0, (byte) 21, class32.field766, arg2);
        }
        int var9 = 0;
        if (!arg1) {
            field350 = null;
        }
        while (var9 < class144.field3601) {
            if (class141.field3486[var9] == 1) {
                class145.field3619[var9] = class20.method189(new class99[] { class142.field3510, client.field513, class144.field3598, var5 }, 81);
                return;
            }
            var9++;
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
    public static void method143(int arg0) {
        field322 = null;
        field350 = null;
        field328 = null;
        field339 = null;
        field349 = null;
        field333 = null;
        field341 = null;
        if (arg0 != -4952) {
            method145(2, null);
        }
        field327 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILib;B)V")
    private final void method144(int arg0, class57 arg1, byte arg2) {
        if (arg2 < 105) {
            this.field344 = -117;
        }
        if (arg0 == 1) {
            this.field347 = arg1.method506(-1);
        } else if (arg0 == 2) {
            this.field325 = arg1.method506(-1);
        } else if (arg0 == 4) {
            this.field344 = arg1.method506(-1);
        } else if (arg0 == 5) {
            this.field338 = arg1.method506(-1);
        } else if (arg0 == 6) {
            this.field324 = arg1.method506(-1);
        } else if (arg0 == 7) {
            this.field343 = arg1.method510(-110);
        } else if (arg0 == 8) {
            this.field323 = arg1.method510(-110);
        } else if (arg0 >= 40 && arg0 < 50) {
            this.field346[arg0 - 40] = (short) arg1.method506(-1);
        } else if (arg0 >= 50 && arg0 < 60) {
            this.field331[arg0 - 50] = (short) arg1.method506(-1);
        }
        field345++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILpc;)V")
    public static final void method145(int arg0, class105 arg1) {
        class60.field1617 = arg1;
        int var2 = -42 / ((70 - arg0) / 38);
        field335++;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(B)[Ldc;")
    public static final class24[] method146(byte arg0) {
        field342++;
        class24[] var1 = new class24[class142.field3501];
        for (int var2 = 0; var2 < class142.field3501; var2++) {
            class24 var3 = var1[var2] = new class24();
            var3.field562 = class81.field1999;
            var3.field568 = class47.field1150;
            var3.field564 = class5.field96[var2];
            var3.field567 = class74.field1887[var2];
            var3.field569 = class95.field2319[var2];
            var3.field563 = class119.field2929[var2];
            var3.field565 = class21.field508;
            var3.field566 = class86.field2142[var2];
        }
        class89.method746(100);
        if (arg0 != -57) {
            method143(21);
        }
        return var1;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)Ldd;")
    public final class26 method147(int arg0, byte arg1) {
        field332++;
        if (arg1 != -103) {
            this.field325 = 104;
        }
        class26 var3 = (class26) class138.field3443.method997(-1, (long) this.field336);
        if (var3 == null) {
            class129 var4 = class129.method1060(class70.field1789, this.field347, 0);
            if (var4 == null) {
                return null;
            }
            for (int var5 = 0; var5 < 6; var5++) {
                if (this.field346[0] != 0) {
                    var4.method1043(this.field346[var5], this.field331[var5]);
                }
            }
            var3 = var4.method1044(this.field343 + 64, this.field323 + 850, -30, -50, -30);
            class138.field3443.method993((byte) 100, (long) this.field336, var3);
        }
        class26 var6;
        if (this.field325 == -1 || arg0 == -1) {
            var6 = var3.method250(true);
        } else {
            var6 = class142.method1163(-124, this.field325).method697(arg0, true, var3);
        }
        if (this.field344 != 128 || this.field338 != 128) {
            var6.method233(this.field344, this.field338, this.field344);
        }
        if (this.field324 != 0) {
            if (this.field324 == 90) {
                var6.method249();
            }
            if (this.field324 == 180) {
                var6.method249();
                var6.method249();
            }
            if (this.field324 == 270) {
                var6.method249();
                var6.method249();
                var6.method249();
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILib;)V")
    public final void method148(int arg0, class57 arg1) {
        field329++;
        while (true) {
            int var3 = arg1.method510(-121);
            if (var3 == 0) {
                int var4 = -112 % ((arg0 - 40) / 37);
                return;
            }
            this.method144(var3, arg1, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)V")
    public static final void method149(int arg0) {
        short var1 = 256;
        if (class74.field1895 > 0) {
            for (int var4 = 0; var4 < 256; var4++) {
                if (class74.field1895 > 768) {
                    class16.field414[var4] = class72.method656(65280, class60.field1598[var4], class2.field43[var4], 1024 - class74.field1895);
                } else if (class74.field1895 <= 256) {
                    class16.field414[var4] = class72.method656(65280, class2.field43[var4], class60.field1598[var4], 256 - class74.field1895);
                } else {
                    class16.field414[var4] = class60.field1598[var4];
                }
            }
        } else if (class93.field2269 <= 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                class16.field414[var2] = class2.field43[var2];
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                if (class93.field2269 > 768) {
                    class16.field414[var3] = class72.method656(65280, class80.field1982[var3], class2.field43[var3], 1024 - class93.field2269);
                } else if (class93.field2269 > 256) {
                    class16.field414[var3] = class80.field1982[var3];
                } else {
                    class16.field414[var3] = class72.method656(65280, class2.field43[var3], class80.field1982[var3], 256 - class93.field2269);
                }
            }
        }
        class96.method795(0, 9, 128, var1 + 7);
        class4.field70.method573(0, 0);
        int var5 = 6885;
        field330++;
        class96.method799();
        int var6 = 0;
        for (int var7 = 1; var7 < var1 - 1; var7++) {
            int var20 = (var1 - var7) * class111.field2764[var7] / var1;
            int var21 = var20 + 22;
            if (var21 < 0) {
                var21 = 0;
            }
            var6 += var21;
            for (int var22 = var21; var22 < 128; var22++) {
                int var23 = class54.field1282[var6++];
                if (var23 == 0) {
                    var5++;
                } else {
                    int var25 = 256 - var23;
                    int var26 = class16.field414[var23];
                    int var27 = class104.field2518.field2478[var5];
                    class104.field2518.field2478[var5++] = class17.method171(16711680, var23 * class17.method171(var26, 65280) + var25 * class17.method171(65280, var27)) + class17.method171(class17.method171(16711935, var27) * var25 + class17.method171(var26, 16711935) * var23, -16711936) >> 8;
                }
            }
            var5 += var21 + 765 - 128;
        }
        int var8 = 0;
        class96.method795(637, 9, 765, var1 + 7);
        class89.field2210.method573(382, 0);
        int var9 = 7546;
        class96.method799();
        for (int var10 = 1; var10 < var1 - 1; var10++) {
            int var11 = (var1 - var10) * class111.field2764[var10] / var1;
            int var12 = var9 + var11;
            int var13 = 103 - var11;
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = class54.field1282[var8++];
                if (var15 == 0) {
                    var12++;
                } else {
                    int var17 = 256 - var15;
                    int var18 = class16.field414[var15];
                    int var19 = class104.field2518.field2478[var12];
                    class104.field2518.field2478[var12++] = class17.method171(-16711936, class17.method171(16711935, var19) * var17 + var15 * class17.method171(16711935, var18)) + class17.method171(class17.method171(65280, var18) * var15 + class17.method171(65280, var19) * var17, 16711680) >> 8;
                }
            }
            var8 += 128 - var13;
            var9 = var12 + 765 - var13 - var11;
        }
        if (arg0 != -2) {
            method145(43, null);
        }
    }
}
