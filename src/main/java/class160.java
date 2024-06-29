import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public abstract class class160 {

    @OriginalMember(owner = "client!l", name = "c", descriptor = "Lcc;")
    public static class209 field2906 = class95.method669(88, "Abandonner");

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Lcc;")
    public static class209 field2904 = class95.method669(101, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Lcc;")
    public static class209 field2905 = class95.method669(87, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public static int field2910 = 0;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "[[Z")
    public static boolean[][] field2909;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public static final void method1105(int arg0) {
        field2911++;
        if (class111.field2244 == null) {
            return;
        }
        if (class255.field4597 < 10) {
            if (!class39.field667.method373(class111.field2244.field4994, arg0 ^ 0x76)) {
                class255.field4597 = class174.field3175.method350(class111.field2244.field4994, 0) / 10;
                return;
            }
            class273.method1865(4);
            class255.field4597 = 10;
        }
        if (class255.field4597 == 10) {
            class116.field2324 = 8.0F;
            class11.field224 = 8.0F;
            class224.field4082 = class111.field2244.field5006 >> 6 << 6;
            class98.field1921 = (class111.field2244.field4983 >> 6 << 6) + 64 - class224.field4082;
            class38.field654 = class111.field2244.field4987 >> 6 << 6;
            class59.field1194 = (class111.field2244.field4981 >> 6 << 6) + 64 - class38.field654;
            int var1 = (class223.field4069.field1571 >> 7) + class174.field3178 - class38.field654;
            int var2 = var1 + ((int) (Math.random() * 10.0D) - 5);
            int var3 = class98.field1921 - ((class223.field4069.field1534 >> 7) + 1 - class224.field4082) - class245.field4444;
            int var4 = var3 + ((int) (Math.random() * 10.0D) - 5);
            if (var2 >= 0 && class59.field1194 > var2 && var4 >= 0 && var4 < class98.field1921) {
                class118.field2370 = var4;
                class200.field3580 = var2;
            } else {
                class200.field3580 = class111.field2244.field4991 * 64 - class38.field654;
                class118.field2370 = -(class111.field2244.field4985 * 64) - (1 - class224.field4082 - class98.field1921);
            }
            class112.method801((byte) 53);
            int var5 = class59.field1194 >> 6;
            class12.field233 = new int[class94.field1861 + 1];
            int var6 = class213.field3852 >> 2 << 10;
            int var7 = class271.field4807 >> 1;
            int var8 = class98.field1921 >> 6;
            class234.field4213 = new byte[var5][var8][];
            class181.field3264 = new byte[var5][var8][];
            class249.field4496 = new byte[var5][var8][];
            class191.field3461 = new byte[var5][var8][];
            class147.field2702 = new int[var5][var8][];
            class1.field23 = new short[var5][var8][];
            class187.field3383 = new int[var5][var8][];
            class87.field1737 = new byte[var5][var8][];
            class86.method618(false, var6, var7);
            class255.field4597 = 20;
        } else if (class255.field4597 == 20) {
            class33.method260((byte) 53, new class106(class39.field667.method366(class10.field195, class111.field2244.field4994, (byte) -106)));
            class255.field4597 = 30;
            class76.method535((byte) 41, true);
            class173.method1191((byte) 47);
        } else if (class255.field4597 == 30) {
            class201.method1390(new class106(class39.field667.method366(class191.field3459, class111.field2244.field4994, (byte) -106)), (byte) -111);
            class255.field4597 = 40;
            class173.method1191((byte) 44);
        } else if (class255.field4597 == 40) {
            class93.method651(new class106(class39.field667.method366(class264.field4730, class111.field2244.field4994, (byte) -106)), true);
            class255.field4597 = 50;
            class173.method1191((byte) 99);
        } else if (class255.field4597 == 50) {
            class13.method101(new class106(class39.field667.method366(class84.field1670, class111.field2244.field4994, (byte) -106)), (byte) -128);
            class255.field4597 = 60;
            class76.method535((byte) 41, true);
            class173.method1191((byte) 88);
        } else {
            if (arg0 != 5) {
                method1105(43);
            }
            if (class255.field4597 == 60) {
                if (class39.field667.method376((byte) -17, class229.method1604(new class209[] { class111.field2244.field4994, class13.field234 }, (byte) 35))) {
                    if (!class39.field667.method373(class229.method1604(new class209[] { class111.field2244.field4994, class13.field234 }, (byte) 58), 50)) {
                        return;
                    }
                    class134.field2548 = class284.method1914((byte) -49, class39.field667, class229.method1604(new class209[] { class111.field2244.field4994, class13.field234 }, (byte) 110));
                } else {
                    class134.field2548 = new class168(0);
                }
                class255.field4597 = 70;
                class173.method1191((byte) 120);
            } else if (class255.field4597 == 70) {
                class197.field3538 = new class139(11, true, class122.field2411);
                class255.field4597 = 73;
                class76.method535((byte) 41, true);
                class173.method1191((byte) 68);
            } else if (class255.field4597 == 73) {
                class115.field2320 = new class139(12, true, class122.field2411);
                class255.field4597 = 76;
                class76.method535((byte) 41, true);
                class173.method1191((byte) 38);
            } else if (class255.field4597 == 76) {
                class69.field1314 = new class139(14, true, class122.field2411);
                class255.field4597 = 79;
                class76.method535((byte) 41, true);
                class173.method1191((byte) 38);
            } else if (class255.field4597 == 79) {
                class172.field3143 = new class139(17, true, class122.field2411);
                class255.field4597 = 82;
                class76.method535((byte) 41, true);
                class173.method1191((byte) 80);
            } else if (class255.field4597 == 82) {
                class155.field2842 = new class139(19, true, class122.field2411);
                class255.field4597 = 85;
                class76.method535((byte) 41, true);
                class173.method1191((byte) 40);
            } else if (class255.field4597 == 85) {
                class145.field2672 = new class139(22, true, class122.field2411);
                class255.field4597 = 88;
                class76.method535((byte) 41, true);
                class173.method1191((byte) 101);
            } else if (class255.field4597 == 88) {
                class108.field2173 = new class139(26, true, class122.field2411);
                class255.field4597 = 91;
                class76.method535((byte) 41, true);
                class173.method1191((byte) 112);
            } else {
                class237.field4281 = new class139(30, true, class122.field2411);
                class255.field4597 = 100;
                class76.method535((byte) 41, true);
                class173.method1191((byte) 102);
                class49.field978 = -1;
                class279.field4919 = -1;
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([BB)V")
    public abstract void method1106(byte[] arg0, byte arg1);

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
    public static void method1107(int arg0) {
        if (arg0 == -2083330714) {
            field2904 = null;
            field2905 = null;
            field2906 = null;
            field2909 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)[B")
    public abstract byte[] method1108(byte arg0);
}
