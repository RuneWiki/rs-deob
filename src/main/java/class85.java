import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class85 extends class124 {

    @OriginalMember(owner = "client!mb", name = "gb", descriptor = "I")
    private int field1815 = 128;

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
    private int field1806 = 0;

    @OriginalMember(owner = "client!mb", name = "mb", descriptor = "I")
    public int field1821 = -1;

    @OriginalMember(owner = "client!mb", name = "jb", descriptor = "I")
    private int field1818 = 128;

    @OriginalMember(owner = "client!mb", name = "lb", descriptor = "I")
    private int field1820 = 0;

    @OriginalMember(owner = "client!mb", name = "nb", descriptor = "I")
    private int field1822 = 0;

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "Lpe;")
    public static class109 field1802 = class141.method1120("Der Server wird gerade aktualisiert)3", 0);

    @OriginalMember(owner = "client!mb", name = "eb", descriptor = "Lpe;")
    private static class109 field1813 = class141.method1120("and choose the (Wcreate account(W", 0);

    @OriginalMember(owner = "client!mb", name = "hb", descriptor = "Lpe;")
    public static class109 field1816 = field1813;

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "Lpe;")
    public static class109 field1801 = class141.method1120("leuchten1:", 0);

    @OriginalMember(owner = "client!mb", name = "ib", descriptor = "[[S")
    public static short[][] field1817 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!mb", name = "kb", descriptor = "Lpe;")
    public static class109 field1819 = class141.method1120(" loggt sich ein)3", 0);

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "I")
    private int field1797;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "I")
    private int field1807;

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!mb", name = "cb", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "Lwf;")
    public static class159 field1803;

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "[I")
    public static int[] field1793;

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "[Le;")
    public static class29[] field1810;

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "[S")
    private short[] field1794;

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "[S")
    private short[] field1808;

    @OriginalMember(owner = "client!mb", name = "db", descriptor = "[S")
    private short[] field1812;

    @OriginalMember(owner = "client!mb", name = "fb", descriptor = "[S")
    private short[] field1814;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)Lwb;")
    public final class155 method712(int arg0, int arg1) {
        field1805++;
        if (arg1 <= 76) {
            return null;
        }
        class155 var3 = (class155) class52.field1066.method93((byte) 103, (long) this.field1797);
        if (var3 == null) {
            class33 var4 = class33.method351(class62.field1280, this.field1807, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field1794 != null) {
                for (int var5 = 0; var5 < this.field1794.length; var5++) {
                    var4.method336(this.field1794[var5], this.field1812[var5]);
                }
            }
            if (this.field1814 != null) {
                for (int var6 = 0; var6 < this.field1814.length; var6++) {
                    var4.method347(this.field1814[var6], this.field1808[var6]);
                }
            }
            var3 = var4.method334(this.field1806 + 64, this.field1820 + 850, -30, -50, -30);
            class52.field1066.method97((long) this.field1797, (byte) -105, var3);
        }
        class155 var7;
        if (this.field1821 == -1 || arg0 == -1) {
            var7 = var3.method1201(true);
        } else {
            var7 = class27.method238(8, this.field1821).method60(1824222512, arg0, var3);
        }
        if (this.field1815 != 128 || this.field1818 != 128) {
            var7.method1209(this.field1815, this.field1818, this.field1815);
        }
        if (this.field1822 != 0) {
            if (this.field1822 == 90) {
                var7.method1210();
            }
            if (this.field1822 == 180) {
                var7.method1210();
                var7.method1210();
            }
            if (this.field1822 == 270) {
                var7.method1210();
                var7.method1210();
                var7.method1210();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lbe;B)V")
    private final void method713(class13 arg0, byte arg1) {
        if (arg1 <= 46) {
            this.method713(null, (byte) 44);
        }
        while (true) {
            int var3 = arg0.method142(27467);
            if (var3 == 0) {
                field1799++;
                return;
            }
            this.method718(var3, (byte) 89, arg0);
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
    public static final void method714(int arg0) {
        for (int var1 = 0; var1 < class64.field1320; var1++) {
            int var10002 = class131.field2868[var1]--;
            if (class131.field2868[var1] >= -10) {
                class73 var3 = class154.field3444[var1];
                if (var3 == null) {
                    var3 = class73.method583(class18.field456, class152.field3354[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class131.field2868[var1] += var3.method584();
                    class154.field3444[var1] = var3;
                }
                if (class131.field2868[var1] < 0) {
                    int var4;
                    if (class137.field2998[var1] == 0) {
                        var4 = class126.field2797;
                    } else {
                        int var5 = (class137.field2998[var1] & 0xFF) * 128;
                        int var6 = class137.field2998[var1] >> 16 & 0xFF;
                        int var7 = var6 * 128 + 64 - class136.field2975.field3094;
                        int var8 = class137.field2998[var1] >> 8 & 0xFF;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var9 = var8 * 128 + 64 - class136.field2975.field3106;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 - 128;
                        if (var5 < var10) {
                            class131.field2868[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var5 - var10) * class8.field201 / var5;
                    }
                    if (var4 > 0) {
                        class51 var11 = var3.method586().method430(class88.field1869);
                        class30 var12 = class30.method314(var11, 100, var4);
                        var12.method317(class43.field922[var1] - 1);
                        class124.field2746.method1049(var12);
                    }
                    class131.field2868[var1] = -100;
                }
            } else {
                class64.field1320--;
                for (int var2 = var1; var2 < class64.field1320; var2++) {
                    class152.field3354[var2] = class152.field3354[var2 + 1];
                    class154.field3444[var2] = class154.field3444[var2 + 1];
                    class43.field922[var2] = class43.field922[var2 + 1];
                    class131.field2868[var2] = class131.field2868[var2 + 1];
                    class137.field2998[var2] = class137.field2998[var2 + 1];
                }
                var1--;
            }
        }
        field1809++;
        if (class120.field2664 && !class146.method1143(0)) {
            if (class48.field999 != 0 && class125.field2770 != -1) {
                class127.method1032(0, class125.field2770, class107.field2241, false, (byte) 66, class48.field999);
            }
            class120.field2664 = false;
        }
        if (arg0 != -1) {
            field1813 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(B)V")
    public static void method715(byte arg0) {
        field1803 = null;
        field1810 = null;
        field1801 = null;
        field1793 = null;
        field1816 = null;
        field1819 = null;
        field1817 = null;
        field1802 = null;
        field1813 = null;
        int var1 = -116 / ((65 - arg0) / 44);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)Lmb;")
    public static final class85 method716(byte arg0, int arg1) {
        if (arg0 <= 24) {
            return null;
        }
        field1804++;
        class85 var2 = (class85) class86.field1827.method93((byte) 103, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class154.field3512.method742(arg1, -128, 13);
        class85 var4 = new class85();
        var4.field1797 = arg1;
        if (var3 != null) {
            var4.method713(new class13(var3), (byte) 116);
        }
        class86.field1827.method97((long) arg1, (byte) 94, var4);
        return var4;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)V")
    public static final void method717(int arg0, int arg1) {
        if (arg1 == -3) {
            class49.method421(class136.field2959, arg0 ^ 0xFFFFDE7B, class76.field1540, class94.field2030);
        } else if (arg1 == -2) {
            class49.method421(class104.field2203, -8453, class76.field1542, class76.field1573);
        } else if (arg1 == -1) {
            class49.method421(class136.field2967, -8453, class76.field1533, class127.field2825);
        } else if (arg1 == 3) {
            class49.method421(class77.field1610, -8453, class76.field1532, class76.field1572);
        } else if (arg1 == 4) {
            class49.method421(class64.field1322, -8453, class76.field1597, class42.field891);
        } else if (arg1 == 5) {
            class49.method421(class57.field1161, -8453, class76.field1538, class119.field2636);
        } else if (arg1 == 6) {
            class49.method421(class141.field3074, -8453, class76.field1537, class151.field3323);
        } else if (arg1 == 7) {
            class49.method421(class92.field1969, -8453, class76.field1562, class2.field29);
        } else if (arg1 == 8) {
            class49.method421(class82.field1759, -8453, class76.field1539, class124.field2753);
        } else if (arg1 == 9) {
            class49.method421(class114.field2527, -8453, class76.field1574, class27.field635);
        } else if (arg1 == 10) {
            class49.method421(class4.field104, -8453, class76.field1565, class124.field2748);
        } else if (arg1 == 11) {
            class49.method421(class44.field938, -8453, class76.field1536, class87.field1855);
        } else if (arg1 == 12) {
            class49.method421(class53.field1102, -8453, class76.field1528, class156.field3603);
        } else if (arg1 == 13) {
            class49.method421(class136.field2978, -8453, class76.field1545, class62.field1268);
        } else if (arg1 == 14) {
            class49.method421(class131.field2871, -8453, class76.field1570, class92.field1985);
        } else if (arg1 == 16) {
            class49.method421(class67.field1343, -8453, class76.field1535, class42.field902);
        } else if (arg1 == 17) {
            class49.method421(class49.field1016, -8453, class76.field1560, class23.field546);
        } else if (arg1 == 18) {
            class49.method421(class57.field1159, arg0 - 8581, class76.field1566, class17.field415);
        } else if (arg1 == 19) {
            class49.method421(class158.field3661, -8453, class92.field1984, class17.field429);
        } else if (arg1 == 20) {
            class49.method421(class136.field2963, arg0 - 8581, class76.field1551, class152.field3352);
        } else if (arg1 == 22) {
            class49.method421(class139.field3036, -8453, class76.field1598, class12.field268);
        } else if (arg1 == 23) {
            class49.method421(class131.field2874, -8453, class76.field1596, class4.field84);
        } else if (arg1 == 24) {
            class49.method421(class53.field1090, -8453, class76.field1576, class148.field3249);
        } else if (arg1 == 25) {
            class49.method421(class136.field2965, -8453, class76.field1525, class74.field1494);
        } else if (arg1 == 26) {
            class49.method421(class93.field2002, -8453, class76.field1559, class99.field2079);
        } else if (arg1 == 27) {
            class49.method421(class137.field2986, -8453, class76.field1584, class76.field1524);
        } else {
            class49.method421(class136.field2977, -8453, class76.field1564, class101.field2113);
        }
        if (arg0 != 128) {
            method716((byte) 55, 80);
        }
        class118.method958(false, 10);
        field1800++;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBLbe;)V")
    private final void method718(int arg0, byte arg1, class13 arg2) {
        field1811++;
        if (arg0 == 1) {
            this.field1807 = arg2.method105(1375221240);
        } else if (arg0 == 2) {
            this.field1821 = arg2.method105(1375221240);
        } else if (arg0 == 4) {
            this.field1815 = arg2.method105(arg1 ^ 0x51F835A1);
        } else if (arg0 == 5) {
            this.field1818 = arg2.method105(1375221240);
        } else if (arg0 == 6) {
            this.field1822 = arg2.method105(arg1 + 1375221151);
        } else if (arg0 == 7) {
            this.field1806 = arg2.method142(27467);
        } else if (arg0 == 8) {
            this.field1820 = arg2.method142(27467);
        } else if (arg0 == 40) {
            int var4 = arg2.method142(27467);
            this.field1794 = new short[var4];
            this.field1812 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1794[var5] = (short) arg2.method105(arg1 + 1375221151);
                this.field1812[var5] = (short) arg2.method105(1375221240);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method142(arg1 ^ 0x6B12);
            this.field1814 = new short[var6];
            this.field1808 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1814[var7] = (short) arg2.method105(1375221240);
                this.field1808[var7] = (short) arg2.method105(class76.method598(arg1, 1375221153));
            }
        }
        if (arg1 != 89) {
            this.method713(null, (byte) 105);
        }
    }
}
