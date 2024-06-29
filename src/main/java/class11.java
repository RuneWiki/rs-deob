import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class11 {

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public int field225 = 0;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public int field221 = 0;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "Lfe;")
    public static class36 field227 = new class36(64);

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public static int field236 = 0;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "Llc;")
    public static class69 field235 = class69.method470((byte) -103, "mapscene");

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public static int field238 = 7759444;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public int field219;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public int field220;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public int field223;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public int field224;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public int field228;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public int field229;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public int field230;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    public int field231;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public int field232;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public int field233;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public int field239;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "Lea;")
    public class26 field226;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "Loa;")
    public static class85 field234;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static void method65(int arg0) {
        field227 = null;
        if (arg0 == 5) {
            field235 = null;
            field234 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)V")
    public static final void method66(int arg0, byte arg1) {
        field222++;
        int var2 = class49.method318((byte) 20, arg0).field1586;
        if (arg1 > -73 || var2 == 0) {
            return;
        }
        int var3 = class10.field204[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class117.method846(0.9D);
                ((class91) class117.field2525).method643(0.9D, 1536);
            }
            if (var3 == 2) {
                class117.method846(0.8D);
                ((class91) class117.field2525).method643(0.8D, 1536);
            }
            if (var3 == 3) {
                class117.method846(0.7D);
                ((class91) class117.field2525).method643(0.7D, 1536);
            }
            if (var3 == 4) {
                class117.method846(0.6D);
                ((class91) class117.field2525).method643(0.6D, 1536);
            }
            class61.method371((byte) 118);
            class62.field1285 = true;
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class104.field2279 != var4) {
                if (class104.field2279 == 0 && class87.field1910 != -1) {
                    class93.method656(0, 0, class87.field1910, false, class27.field570, var4, -123);
                    class26.field565 = 0;
                } else if (var4 == 0) {
                    class93.method652(-100);
                    class26.field565 = 0;
                } else {
                    class96.method732(-1, var4);
                }
                class104.field2279 = var4;
            }
        }
        if (var2 == 9) {
            class70.field1570 = var3;
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class102.field2204 = 127;
            }
            if (var3 == 1) {
                class102.field2204 = 96;
            }
            if (var3 == 2) {
                class102.field2204 = 64;
            }
            if (var3 == 3) {
                class102.field2204 = 32;
            }
            if (var3 == 4) {
                class102.field2204 = 0;
            }
        }
        if (var2 == 6) {
            class17.field334 = var3;
        }
        if (var2 == 5) {
            client.field399 = var3;
        }
        if (var2 == 8) {
            class121.field2627 = var3;
            class35.field709 = true;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
    public static final void method67(int arg0) {
        if (arg0 != -11742) {
            field238 = -93;
        }
        while (class3.field22.method174(false, class103.field2224) >= 11) {
            int var1 = class3.field22.method181(11, 8);
            if (var1 == 2047) {
                break;
            }
            if (class123.field2682[var1] == null) {
                class123.field2682[var1] = new class60();
                if (class4.field95[var1] != null) {
                    class123.field2682[var1].method362(65535, class4.field95[var1]);
                }
            }
            class92.field2013[class27.field585++] = var1;
            class60 var2 = class123.field2682[var1];
            var2.field1088 = class62.field1282;
            int var3 = class3.field22.method181(5, 8);
            if (var3 > 15) {
                var3 -= 32;
            }
            int var4 = class3.field22.method181(5, 8);
            int var5 = class3.field22.method181(1, 8);
            if (var5 == 1) {
                class108.field2410[class77.field1746++] = var1;
            }
            int var6 = class3.field22.method181(1, 8);
            if (var4 > 15) {
                var4 -= 32;
            }
            var2.method335(var6 == 1, true, class46.field974.field1097[0] + var3, class46.field974.field1041[0] + var4);
        }
        field237++;
        class3.field22.method176((byte) -81);
    }
}
