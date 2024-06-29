import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class94 {

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "[I")
    public static int[] field2155 = new int[128];

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "Lgd;")
    public static class40 field2162 = class14.method90(false, "Classic");

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field2161 = -1;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "Lgd;")
    private static class40 field2165 = class14.method90(false, "Classic");

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field2163 = 0;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "[Lhd;")
    public static class46[] field2173 = new class46[1000];

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "Z")
    public static boolean field2166 = false;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    public static int field2174 = 0;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    public static int field2178 = 0;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "Lgd;")
    public static class40 field2157 = field2165;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "Loc;")
    public static class86 field2169;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 3)
    public static final void method631(int arg0) {
        field2170++;
        if (!class83.field1878) {
            return;
        }
        class130.field3128 = null;
        class120.field2843 = null;
        class83.field1886 = null;
        class65.field1574 = null;
        class100.field2374 = null;
        class113.field2728 = null;
        class85.field1902 = null;
        class12.field307 = null;
        class41.field1018 = null;
        class59.field1488 = null;
        class44.field1096 = null;
        class108.field2622 = null;
        if (arg0 != -1) {
            return;
        }
        class8.field213 = null;
        class101.field2406 = null;
        class135.field3278 = null;
        class88.field2001 = null;
        class99.field2365 = null;
        class18.field446 = null;
        class91.field2058 = null;
        class41.field1031 = null;
        class130.field3140 = null;
        class14.field402 = null;
        class43.field1092 = null;
        class70.field1698 = null;
        class45.field1137 = null;
        class83.field1878 = false;
        class86.field1915 = null;
        class104.field2568 = null;
        class122.field2864 = null;
        class49.field1249 = null;
        class45.field1140 = null;
        class136.field3330 = null;
        class10.field255 = null;
        class91.field2083 = null;
        class53.field1353 = null;
        class64.field1553 = null;
        class65.field1599 = null;
        class10.field268 = null;
        class31.field793 = null;
        class128.field3074 = null;
        class67.field1639 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lrb;BLrb;)V", line = 62)
    public static final void method632(class103 arg0, byte arg1, class103 arg2) {
        field2158++;
        if (arg1 < -102) {
            class101.field2412 = arg0;
            class11.field290 = arg2;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V", line = 74)
    public static final void method633(int arg0) {
        field2175++;
        for (int var1 = arg0; var1 < class1.field18; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class77.field1787[var1];
            }
            class96 var3 = class90.field2044[var2];
            if (var3 != null) {
                class83.method550(1, var3, 18617);
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)V", line = 108)
    public static final synchronized void method634(byte arg0, int arg1) {
        field2180++;
        if (!class134.method1049(16681)) {
            return;
        }
        class107.method828(true, arg1);
        class99.field2349 = null;
        if (arg0 <= 123) {
            method635((byte) 20);
        }
        class131.field3183 = false;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V", line = 133)
    public static void method635(byte arg0) {
        field2162 = null;
        field2157 = null;
        int var1 = -43 / ((-arg0 - 6) / 60);
        field2173 = null;
        field2165 = null;
        field2169 = null;
        field2155 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILrb;IIIZII)V", line = 156)
    public static final synchronized void method636(int arg0, class103 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field2160++;
        if (!class134.method1049(16681)) {
            return;
        }
        class48.field1222 = arg0;
        class14.field386 = arg5;
        class77.field1769 = arg2;
        class99.field2349 = arg1;
        class104.field2562 = arg3;
        class53.field1352 = arg7;
        class131.field3183 = true;
        class56.field1458 = arg4;
        class93.field2152 = arg6;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V", line = 196)
    public static final synchronized void method637(int arg0) {
        field2164++;
        if (!class134.method1049(16681)) {
            return;
        }
        class85.method558((byte) 96);
        class131.field3183 = false;
        class99.field2349 = null;
        if (arg0 != -3570) {
            field2161 = 14;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)Z", line = 216)
    public static final boolean method638(int arg0, int arg1) {
        field2181++;
        if (class30.field756[arg0]) {
            return true;
        } else if (class12.field311.method732(127, arg0)) {
            int var2 = class12.field311.method729(1, arg0);
            if (arg1 == var2) {
                class30.field756[arg0] = true;
                return true;
            }
            if (class129.field3093[arg0] == null) {
                class129.field3093[arg0] = new class30[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class129.field3093[arg0][var3] == null) {
                    byte[] var4 = class12.field311.method731(var3, arg0, (byte) -113);
                    if (var4 != null) {
                        class129.field3093[arg0][var3] = new class30();
                        class129.field3093[arg0][var3].field704 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            class129.field3093[arg0][var3].method191(new class104(var4), 30499);
                        } else {
                            class129.field3093[arg0][var3].method197(new class104(var4), (byte) 0);
                        }
                    }
                }
            }
            class30.field756[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V", line = 278)
    public static final synchronized void method639(int arg0) {
        if (arg0 != 19938) {
            method636(-111, null, -23, -80, -66, true, -15, -3);
        }
        field2167++;
        if (!class134.method1049(16681)) {
            return;
        }
        if (class131.field3183) {
            byte[] var1 = class92.method621(class53.field1352, (byte) 77, class99.field2349, class104.field2562, class56.field1458);
            if (var1 != null) {
                if (class48.field1222 >= 0) {
                    class11.method58(class14.field386, (byte) -115, class48.field1222, class93.field2152, var1);
                } else if (class77.field1769 < 0) {
                    class49.method383(var1, arg0 ^ 0x4DF6, class14.field386, class93.field2152);
                } else {
                    class49.method379(class93.field2152, class77.field1769, true, class14.field386, var1);
                }
                class131.field3183 = false;
                class99.field2349 = null;
            }
        }
        class101.method706((byte) 67);
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)V", line = 339)
    public static final synchronized void method640(int arg0) {
        field2179++;
        if (arg0 == -9475) {
            class31.method205((byte) 111);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIZILgd;Lrb;Lgd;)V", line = 350)
    public static final synchronized void method641(int arg0, int arg1, int arg2, boolean arg3, int arg4, class40 arg5, class103 arg6, class40 arg7) {
        field2156++;
        if (class134.method1049(16681)) {
            int var8 = arg6.method749(arg7, arg1);
            int var9 = arg6.method740(var8, false, arg5);
            method636(arg4, arg6, -1, var8, arg0, arg3, arg2, var9);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZBIIIILrb;)V", line = 369)
    public static final synchronized void method642(boolean arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, class103 arg6) {
        field2172++;
        if (!class134.method1049(16681)) {
            return;
        }
        class56.field1458 = arg5;
        class99.field2349 = arg6;
        class14.field386 = arg0;
        class93.field2152 = arg2;
        class77.field1769 = -1;
        class104.field2562 = arg4;
        if (arg1 != -119) {
            method638(75, 8);
        }
        class53.field1352 = arg3;
        class131.field3183 = true;
        class48.field1222 = -1;
    }
}
