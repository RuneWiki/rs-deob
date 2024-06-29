import java.io.IOException;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class63 extends class143 {

    @OriginalMember(owner = "client!ja", name = "Bb", descriptor = "Z")
    public boolean field1574 = false;

    @OriginalMember(owner = "client!ja", name = "Ib", descriptor = "I")
    private int field1581 = 0;

    @OriginalMember(owner = "client!ja", name = "sb", descriptor = "I")
    private int field1565 = 0;

    @OriginalMember(owner = "client!ja", name = "Kb", descriptor = "I")
    public int field1583;

    @OriginalMember(owner = "client!ja", name = "Jb", descriptor = "I")
    private int field1582;

    @OriginalMember(owner = "client!ja", name = "qb", descriptor = "I")
    public int field1563;

    @OriginalMember(owner = "client!ja", name = "ub", descriptor = "I")
    public int field1567;

    @OriginalMember(owner = "client!ja", name = "ob", descriptor = "I")
    public int field1561;

    @OriginalMember(owner = "client!ja", name = "zb", descriptor = "I")
    public int field1572;

    @OriginalMember(owner = "client!ja", name = "Db", descriptor = "Lma;")
    private class84 field1576;

    @OriginalMember(owner = "client!ja", name = "nb", descriptor = "Lu;")
    public static class135 field1560 = class87.method676((byte) -86, ")1");

    @OriginalMember(owner = "client!ja", name = "vb", descriptor = "I")
    public static int field1568 = 0;

    @OriginalMember(owner = "client!ja", name = "mb", descriptor = "I")
    public static int field1559 = 0;

    @OriginalMember(owner = "client!ja", name = "Cb", descriptor = "I")
    public static int field1575 = 0;

    @OriginalMember(owner = "client!ja", name = "Eb", descriptor = "Lu;")
    public static class135 field1577 = class87.method676((byte) -69, ")3runescape)3com");

    @OriginalMember(owner = "client!ja", name = "Hb", descriptor = "Lu;")
    public static class135 field1580 = class87.method676((byte) -69, "Ausw-=hlen");

    @OriginalMember(owner = "client!ja", name = "Ab", descriptor = "I")
    public static int field1573 = 0;

    @OriginalMember(owner = "client!ja", name = "tb", descriptor = "Lu;")
    private static class135 field1566 = class87.method676((byte) -39, "Too many connections from your address)3");

    @OriginalMember(owner = "client!ja", name = "wb", descriptor = "Lu;")
    public static class135 field1569 = field1566;

    @OriginalMember(owner = "client!ja", name = "Nb", descriptor = "I")
    public static int field1586 = 0;

    @OriginalMember(owner = "client!ja", name = "Mb", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1585 = new CRC32();

    @OriginalMember(owner = "client!ja", name = "pb", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!ja", name = "rb", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!ja", name = "xb", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!ja", name = "yb", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!ja", name = "Fb", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!ja", name = "Lb", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!ja", name = "Ob", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!ja", name = "Pb", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!ja", name = "Qb", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!ja", name = "Rb", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!ja", name = "Gb", descriptor = "Lcc;")
    public static class18 field1579;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)Lna;")
    public final class91 method273(byte arg0) {
        field1564++;
        int var2 = -29 % ((-arg0 - 59) / 51);
        class19 var3 = class44.method345(this.field1582, true);
        class91 var4;
        if (this.field1574) {
            var4 = var3.method146(30814, -1);
        } else {
            var4 = var3.method146(30814, this.field1581);
        }
        return var4 == null ? null : var4;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lg;Lg;ZI)V")
    public static final void method521(class43 arg0, class43 arg1, boolean arg2, int arg3) {
        if (arg3 != 0) {
            field1577 = null;
        }
        field1570++;
        class131.field3134 = arg0;
        class90.field2118 = arg1;
        class38.field866 = arg2;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IB)V")
    public final void method522(int arg0, byte arg1) {
        field1571++;
        if (this.field1574) {
            return;
        }
        this.field1565 += arg0;
        while (this.field1576.field2008[this.field1581] < this.field1565) {
            this.field1565 -= this.field1576.field2008[this.field1581];
            this.field1581++;
            if (this.field1581 >= this.field1576.field2013.length) {
                this.field1574 = true;
                break;
            }
        }
        if (arg1 < 124) {
            this.field1567 = 112;
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(B)V")
    public static final void method523(byte arg0) {
        field1588++;
        if (arg0 >= -33) {
            method527(41);
        }
        for (int var1 = -1; var1 < class14.field329; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class108.field2600[var1];
            }
            class145 var6 = class131.field3166[var5];
            if (var6 != null && var6.field190 > 0) {
                var6.field190--;
                if (var6.field190 == 0) {
                    var6.field179 = null;
                }
            }
        }
        for (int var2 = 0; var2 < class34.field790; var2++) {
            int var3 = class47.field1124[var2];
            class111 var4 = class96.field2340[var3];
            if (var4 != null && var4.field190 > 0) {
                var4.field190--;
                if (var4.field190 == 0) {
                    var4.field179 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
    public static final void method524(int arg0) {
        class37.method282(true);
        class95.field2306 = true;
        class62.method511(14707);
        field1587++;
        if (class34.field789) {
            field1579.method127(class113.field2724, 239, 40, 0);
            field1579.method127(class107.method867(arg0 ^ 0x19C7, new class135[] { class113.field2735, class109.field2646 }), 239, 60, 128);
        } else if (class42.field975 == 1) {
            field1579.method127(class12.field270, 239, 40, 0);
            field1579.method127(class107.method867(2, new class135[] { class113.field2722, class109.field2646 }), 239, 60, 128);
        } else if (class42.field975 == 2) {
            field1579.method127(class124.field2962, 239, 40, 0);
            field1579.method127(class107.method867(2, new class135[] { class113.field2722, class109.field2646 }), 239, 60, 128);
        } else if (class42.field975 == 3) {
            if (class113.field2723 != class113.field2722) {
                class146.method1194(class113.field2722, (byte) 113);
                class113.field2723 = class113.field2722;
            }
            class18 var17 = class93.field2200;
            class70.method573(0, 0, 463, 77);
            for (int var18 = 0; var18 < class79.field1884; var18++) {
                int var19 = var18 * 14 + 18 - class151.field3735;
                if (var19 > 0 && var19 < 110) {
                    var17.method127(class148.field3699[var18], 239, var19, 0);
                }
            }
            class70.method561();
            if (class79.field1884 > 5) {
                class23.method189(463, 0, (byte) -10, class79.field1884 * 14 + 7, class151.field3735, 77);
            }
            if (class113.field2722.method1063(-64) == 0) {
                field1579.method127(class30.field721, 239, 40, 255);
            } else if (class79.field1884 == 0) {
                field1579.method127(class113.field2720, 239, 40, 0);
            }
            var17.method127(class107.method867(2, new class135[] { class113.field2722, class109.field2646 }), 239, 90, 0);
            class70.method568(0, 77, 479, 0);
        } else if (class42.field975 == 4) {
            field1579.method127(class113.field2734, 239, 40, 0);
            field1579.method127(class107.method867(2, new class135[] { class113.field2722, class109.field2646 }), 239, 60, 128);
        } else if (class21.field487 != null) {
            field1579.method124(class21.field487, 10, 20, 459, 40, 0, false, 1, 1, 0);
            field1579.method127(class2.field59, 239, 80, 128);
        } else if (class49.field1174 != -1) {
            boolean var16 = class101.method830(2, 0, 96, 479, 0, 0, class49.field1174);
            if (!var16) {
                class65.field1634 = true;
            }
        } else if (class99.field2384 == -1) {
            class18 var1 = class93.field2200;
            int var2 = 0;
            class70.method573(0, 0, 463, 77);
            for (int var3 = 0; var3 < 100; var3++) {
                if (class125.field2976[var3] != null) {
                    int var5 = class117.field2804[var3];
                    int var6 = class53.field1261 + 70 - var2 * 14;
                    byte var7 = 0;
                    class135 var8 = class25.field589[var3];
                    if (var8 != null && var8.method1087(class56.field1369, (byte) -52)) {
                        var8 = var8.method1065((byte) -102, 5);
                        var7 = 1;
                    }
                    if (var8 != null && var8.method1087(class26.field626, (byte) -52)) {
                        var7 = 2;
                        var8 = var8.method1065((byte) -92, 5);
                    }
                    if (var5 == 0) {
                        var2++;
                        if (var6 > 0 && var6 < 110) {
                            var1.method121(class125.field2976[var3], 4, var6, 0);
                        }
                    }
                    if ((var5 == 1 || var5 == 2) && (var5 == 1 || class79.field1858 == 0 || class79.field1858 == 1 && class9.method48(var8, 0))) {
                        if (var6 > 0 && var6 < 110) {
                            int var9 = 4;
                            if (var7 == 1) {
                                class40.field937[0].method29(var9, var6 - 12);
                                var9 += 14;
                            }
                            if (var7 == 2) {
                                class40.field937[1].method29(var9, var6 - 12);
                                var9 += 14;
                            }
                            var1.method121(class107.method867(2, new class135[] { var8, class138.field3345 }), var9, var6, 0);
                            int var10 = var9 + var1.method115(var8) + 8;
                            var1.method121(class125.field2976[var3], var10, var6, 255);
                        }
                        var2++;
                    }
                    if ((var5 == 3 || var5 == 7) && field1559 == 0 && (var5 == 7 || class48.field1135 == 0 || class48.field1135 == 1 && class9.method48(var8, arg0 ^ 0x19C5))) {
                        if (var6 > 0 && var6 < 110) {
                            byte var11 = 4;
                            var1.method121(class20.field469, var11, var6, 0);
                            int var12 = var11 + var1.method115(class20.field469);
                            int var13 = var12 + var1.method123(32);
                            if (var7 == 1) {
                                class40.field937[0].method29(var13, var6 - 12);
                                var13 += 14;
                            }
                            if (var7 == 2) {
                                class40.field937[1].method29(var13, var6 - 12);
                                var13 += 14;
                            }
                            var1.method121(class107.method867(2, new class135[] { var8, class138.field3345 }), var13, var6, 0);
                            int var14 = var13 + var1.method115(var8) + 8;
                            var1.method121(class125.field2976[var3], var14, var6, 8388608);
                        }
                        var2++;
                    }
                    if (var5 == 4 && (class126.field3014 == 0 || class126.field3014 == 1 && class9.method48(var8, 0))) {
                        var2++;
                        if (var6 > 0 && var6 < 110) {
                            var1.method121(class107.method867(2, new class135[] { var8, class1.field3, class125.field2976[var3] }), 4, var6, 8388736);
                        }
                    }
                    if (var5 == 5 && field1559 == 0 && class48.field1135 < 2) {
                        var2++;
                        if (var6 > 0 && var6 < 110) {
                            var1.method121(class125.field2976[var3], 4, var6, 8388608);
                        }
                    }
                    if (var5 == 6 && field1559 == 0 && class48.field1135 < 2) {
                        var2++;
                        if (var6 > 0 && var6 < 110) {
                            var1.method121(class107.method867(2, new class135[] { class83.field1971, class1.field3, var8, class138.field3345 }), 4, var6, 0);
                            var1.method121(class125.field2976[var3], var1.method115(class107.method867(arg0 - 6595, new class135[] { class83.field1971, class1.field3, var8 })) + 12, var6, 8388608);
                        }
                    }
                    if (var5 == 8 && (class126.field3014 == 0 || class126.field3014 == 1 && class9.method48(var8, 0))) {
                        if (var6 > 0 && var6 < 110) {
                            var1.method121(class107.method867(2, new class135[] { var8, class1.field3, class125.field2976[var3] }), 4, var6, 8270336);
                        }
                        var2++;
                    }
                }
            }
            class70.method561();
            class26.field637 = var2 * 14 + 7;
            if (class26.field637 < 78) {
                class26.field637 = 78;
            }
            class23.method189(463, 0, (byte) -10, class26.field637, class26.field637 - class53.field1261 - 77, 77);
            class135 var4;
            if (class116.field2789 == null || class116.field2789.field3516 == null) {
                var4 = class57.field1389;
            } else {
                var4 = class116.field2789.field3516;
            }
            var1.method121(class107.method867(arg0 ^ 0x19C7, new class135[] { var4, class138.field3345 }), 4, 90, 0);
            var1.method121(class107.method867(arg0 ^ 0x19C7, new class135[] { class113.field2744, class109.field2646 }), var1.method115(class107.method867(2, new class135[] { var4, class2.field72 })) + 6, 90, 255);
            class70.method568(0, 77, 479, 0);
        } else {
            boolean var15 = class101.method830(3, 0, 96, 479, 0, arg0 ^ 0x19C5, class99.field2384);
            if (!var15) {
                class65.field1634 = true;
            }
        }
        if (arg0 == 6597) {
            if (class128.field3077 && class94.field2237 == 2) {
                class60.method505(0);
            }
            class59.method445(-128);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BZ)V")
    public static final void method525(byte arg0, boolean arg1) {
        field1590++;
        class37.method282(true);
        class23.field567++;
        if (class23.field567 < 50 && !arg1) {
            return;
        }
        class23.field567 = 0;
        int var2 = -81 % ((arg0 - 74) / 49);
        if (class49.field1172 || class104.field2501 == null) {
            return;
        }
        class87.field2074++;
        class152.field3751.method929(119, -14044);
        try {
            class104.field2501.method870(class152.field3751.field1485, 0, 0, class152.field3751.field1495);
            class152.field3751.field1485 = 0;
        } catch (IOException var3) {
            class49.field1172 = true;
        }
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(B)V")
    public static void method526(byte arg0) {
        field1577 = null;
        field1579 = null;
        field1585 = null;
        field1569 = null;
        field1566 = null;
        field1580 = null;
        field1560 = null;
        if (arg0 != 55) {
            method526((byte) -117);
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(IIIIIII)V")
    public class63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1583 = arg4;
        this.field1582 = arg0;
        this.field1563 = arg3;
        this.field1567 = arg2;
        this.field1561 = arg1;
        this.field1572 = arg5 + arg6;
        int var8 = class44.method345(this.field1582, true).field445;
        if (var8 == -1) {
            this.field1574 = true;
        } else {
            this.field1574 = false;
            this.field1576 = class17.method108(var8, 0);
        }
    }

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V")
    public static final void method527(int arg0) {
        field1578++;
        if (class46.field1103 != null) {
            class77 var1 = class46.field1103;
            synchronized (class46.field1103) {
                class46.field1103 = null;
            }
        }
        if (arg0 <= 73) {
            field1568 = 68;
        }
    }

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "(I)V")
    public static final void method528(int arg0) {
        if (class131.field3158 != null) {
            class120 var1 = class131.field3158;
            synchronized (class131.field3158) {
                class131.field3158 = null;
            }
        }
        if (arg0 != 12) {
            method527(-4);
        }
        field1584++;
    }
}
