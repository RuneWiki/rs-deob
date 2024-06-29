import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class68 extends class247 {

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public int field1005 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public int field1006 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public int field1010 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public int field1012 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public int field1009 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public int field1007 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!je", name = "F", descriptor = "I")
    public int field1024 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!je", name = "D", descriptor = "I")
    public int field1022 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "Lva;")
    public class138 field1004;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "Ljf;")
    public static class216 field1011 = new class216(64);

    @OriginalMember(owner = "client!je", name = "v", descriptor = "I")
    public static int field1014 = 0;

    @OriginalMember(owner = "client!je", name = "A", descriptor = "Ljava/lang/String;")
    public static String field1019 = "Discard";

    @OriginalMember(owner = "client!je", name = "C", descriptor = "[Lrb;")
    public static class210[] field1021 = new class210[0];

    @OriginalMember(owner = "client!je", name = "w", descriptor = "F")
    public static float field1015;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!je", name = "B", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!je", name = "E", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!je", name = "z", descriptor = "[[Lfe;")
    public static class231[][] field1018;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)Z")
    public final boolean method450(int arg0, int arg1, int arg2) {
        field1020++;
        if (this.field1022 <= arg0 && arg0 <= this.field1024 && arg2 >= this.field1012 && arg2 <= this.field1007) {
            return true;
        } else if (this.field1009 <= arg0 && this.field1006 >= arg0 && arg2 >= this.field1005 && arg2 <= this.field1010) {
            return true;
        } else if (arg1 == -1) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
    public static final void method451(int arg0) {
        for (int var1 = 0; var1 < class210.field3275; var1++) {
            int var10002 = class46.field574[var1]--;
            if (class46.field574[var1] >= -10) {
                class101 var3 = class112.field1627[var1];
                if (var3 == null) {
                    var3 = class101.method685(class49.field619, class235.field3794[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class46.field574[var1] += var3.method684();
                    class112.field1627[var1] = var3;
                }
                if (class46.field574[var1] < 0) {
                    int var4;
                    if (class200.field3154[var1] == 0) {
                        var4 = class250.field4058[var1] * class96.field1437 >> 8;
                    } else {
                        int var5 = (class200.field3154[var1] & 0xFF) * 128;
                        int var6 = class200.field3154[var1] >> 16 & 0xFF;
                        int var7 = var6 * 128 + 64 - class214.field3347.field3915;
                        int var8 = class200.field3154[var1] >> 8 & 0xFF;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var9 = var8 * 128 + 64 - class214.field3347.field3920;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 - 128;
                        if (var5 < var10) {
                            class46.field574[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var5 - var10) * class235.field3792 * class250.field4058[var1] / var5 >> 8;
                    }
                    if (var4 > 0) {
                        class131 var11 = var3.method682().method836(class86.field1322);
                        class145 var12 = class145.method985(var11, 100, var4);
                        var12.method953(class170.field2625[var1] - 1);
                        class81.field1231.method1927(var12);
                    }
                    class46.field574[var1] = -100;
                }
            } else {
                class210.field3275--;
                for (int var2 = var1; var2 < class210.field3275; var2++) {
                    class235.field3794[var2] = class235.field3794[var2 + 1];
                    class112.field1627[var2] = class112.field1627[var2 + 1];
                    class170.field2625[var2] = class170.field2625[var2 + 1];
                    class46.field574[var2] = class46.field574[var2 + 1];
                    class200.field3154[var2] = class200.field3154[var2 + 1];
                    class250.field4058[var2] = class250.field4058[var2 + 1];
                }
                var1--;
            }
        }
        if (class229.field3542 && !class67.method438(118)) {
            if (class136.field1960 != 0 && class127.field1826 != -1) {
                class198.method1381(class136.field1960, 0, -42, class127.field1826, false, class77.field1177);
            }
            class229.field3542 = false;
        } else if (class136.field1960 != 0 && class127.field1826 != -1 && !class67.method438(70)) {
            class150.field2218.method445(55, 7);
            class150.field2218.method1210(class127.field1826, (byte) -16);
            class74.field1126++;
            class127.field1826 = -1;
        }
        field1008++;
        if (arg0 != -1) {
            method453(false, 7);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V")
    public static final void method452(int arg0, int arg1) {
        class161.field2407.method1514(arg0, (byte) -55);
        field1013++;
        if (arg1 > -98) {
            field1011 = null;
        }
        class248.field4032.method1514(arg0, (byte) -55);
        class198.field3137.method1514(arg0, (byte) -55);
        class11.field172.method1514(arg0, (byte) -55);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI)V")
    public static final void method453(boolean arg0, int arg1) {
        class207.field3261 = null;
        class207.field3253 = null;
        class207.field3254 = null;
        field1017++;
        class207.field3255 = null;
        class281.field4569 = null;
        class207.field3263 = null;
        class207.field3256 = null;
        class207.field3258 = null;
        class200.field3150 = 0;
        class249.field4048 = null;
        class207.field3262 = null;
        if (arg0 && class207.field3240 != null) {
            class42.field506 = class207.field3240.field624;
        } else {
            class42.field506 = -1;
        }
        class207.field3240 = null;
        class207.field3238.method1147(arg1 ^ 0xFFFF8D5F);
        class127.field1818 = null;
        class22.field284 = null;
        class201.field3176 = null;
        class207.field3239 = null;
        class303.field4813 = null;
        if (arg1 != -29397) {
            method452(121, -118);
        }
        class222.field3478 = null;
        class181.field2846 = null;
        class309.field4971 = null;
        class260.field4224 = null;
        class62.field902 = null;
        class282.field4592 = -1;
        class72.field1069 = -1;
        class4.method26(17978);
        class146.field2184 = null;
        class264.field4288 = null;
        class258.field4198 = null;
        class304.method2041(64, arg1 + 29464, 128);
        class171.method1221(64, (byte) 40);
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V")
    public static void method454(int arg0) {
        field1021 = null;
        if (arg0 == 0) {
            field1011 = null;
            field1019 = null;
            field1018 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lva;)V")
    public class68(class138 arg0) {
        this.field1004 = arg0;
    }
}
