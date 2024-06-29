import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class172 extends class45 {

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "S")
    public static short field2745 = 32767;

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "Ljava/lang/String;")
    public static String field2747 = "Attack";

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "Lci;")
    public static class327 field2742 = new class327();

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "Z")
    public static boolean field2758 = false;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!kh", name = "r", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!kh", name = "A", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!kh", name = "E", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!kh", name = "F", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!kh", name = "B", descriptor = "J")
    public static long field2753;

    @OriginalMember(owner = "client!kh", name = "C", descriptor = "J")
    public long field2754;

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "Lcj;")
    public static class147 field2744;

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "Lkh;")
    public class172 field2746;

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "Lkh;")
    public class172 field2749;

    @OriginalMember(owner = "client!kh", name = "D", descriptor = "[I")
    public static int[] field2755;

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "[[I")
    public static int[][] field2748;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V", line = 5)
    public static void method1349(int arg0) {
        field2747 = null;
        field2755 = null;
        field2748 = (int[][]) null;
        field2742 = null;
        if (arg0 == 0) {
            field2744 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)Z", line = 24)
    public static final boolean method1350(int arg0, int arg1, int arg2) {
        field2759++;
        if (!class358.field5687) {
            return false;
        }
        int var3 = arg0 >> 16;
        int var4 = arg0 & 0xFFFF;
        if (class163.field2587[var3] == null || class163.field2587[var3][var4] == null) {
            return false;
        }
        class250 var5 = class163.field2587[var3][var4];
        if (arg1 > -127) {
            field2740 = 50;
        }
        if (arg2 == -1 && var5.field4078 == 0) {
            for (int var6 = 0; var6 < class104.field1683; var6++) {
                if (class51.field810[var6] == 16 || class51.field810[var6] == 1010 || class51.field810[var6] == 24 || class51.field810[var6] == 43 || class51.field810[var6] == 31) {
                    for (class250 var7 = class13.method74(-29, class230.field3819[var6]); var7 != null; var7 = class180.method1413((byte) -106, var7)) {
                        if (var5.field4167 == var7.field4167) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < class104.field1683; var8++) {
                if (class252.field4258[var8] == arg2 && class230.field3819[var8] == var5.field4167 && (class51.field810[var8] == 16 || class51.field810[var8] == 1010 || class51.field810[var8] == 24 || class51.field810[var8] == 43 || class51.field810[var8] == 31)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V", line = 91)
    public static final void method1351(boolean arg0) {
        field2751++;
        if (!arg0) {
            field2742 = (class327) null;
        }
        for (int var1 = 0; var1 < class213.field3398; var1++) {
            int var10002 = class240.field3962[var1]--;
            if (class240.field3962[var1] >= -10) {
                class85 var3 = class94.field1584[var1];
                if (var3 == null) {
                    var3 = class85.method680(class220.field3557, class252.field4269[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class240.field3962[var1] += var3.method679();
                    class94.field1584[var1] = var3;
                }
                if (class240.field3962[var1] < 0) {
                    int var4;
                    if (class43.field662[var1] == 0) {
                        var4 = class230.field3830[var1] * class45.field704 >> 8;
                    } else {
                        int var5 = (class43.field662[var1] & 0xFF) * 128;
                        int var6 = (class43.field662[var1] & 0xFFC898) >> 16;
                        int var7 = var6 * 128 + 64 - class6.field55.field3577;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = (class43.field662[var1] & 0xFF57) >> 8;
                        int var9 = var8 * 128 + 64 - class6.field55.field3511;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 - 128;
                        if (var10 > var5) {
                            class240.field3962[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var5 - var10) * class230.field3830[var1] * class272.field4520 / var5 >> 8;
                    }
                    if (var4 > 0) {
                        class110 var11 = var3.method677().method840(class320.field5092);
                        class139 var12 = class139.method1072(var11, 100, var4);
                        var12.method1079(class76.field1323[var1] - 1);
                        class245.field4030.method2162(var12);
                    }
                    class240.field3962[var1] = -100;
                }
            } else {
                class213.field3398--;
                for (int var2 = var1; var2 < class213.field3398; var2++) {
                    class252.field4269[var2] = class252.field4269[var2 + 1];
                    class94.field1584[var2] = class94.field1584[var2 + 1];
                    class76.field1323[var2] = class76.field1323[var2 + 1];
                    class240.field3962[var2] = class240.field3962[var2 + 1];
                    class43.field662[var2] = class43.field662[var2 + 1];
                    class230.field3830[var2] = class230.field3830[var2 + 1];
                }
                var1--;
            }
        }
        if (class32.field461 && !class90.method711(-20904)) {
            if (class235.field3899 != 0 && class196.field3132 != -1) {
                class287.method2087(0, 113, class355.field5641, false, class196.field3132, class235.field3899);
            }
            class32.field461 = false;
        } else if (class235.field3899 != 0 && class196.field3132 != -1 && !class90.method711(-20904)) {
            class36.field520.method2228(130, 16547);
            class87.field1484++;
            class36.field520.method1757(class196.field3132, -117);
            class196.field3132 = -1;
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)V", line = 219)
    public final void method1352(int arg0) {
        field2743++;
        if (this.field2749 != null && arg0 <= -13) {
            this.field2749.field2746 = this.field2746;
            this.field2746.field2749 = this.field2749;
            this.field2749 = null;
            this.field2746 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZLjava/lang/String;B)V", line = 237)
    public static final void method1353(boolean arg0, String arg1, byte arg2) {
        field2750++;
        int var3 = 0;
        String var4 = arg1.toLowerCase();
        int var5 = arg0 ? 32768 : 0;
        short[] var6 = new short[16];
        int var7 = (arg0 ? class325.field5163 : class64.field1137) + var5;
        for (int var8 = var5; var8 < var7; var8++) {
            class131 var9 = class326.method2298(4575, var8);
            if (var9.field2228 && var9.method1015((byte) 86).toLowerCase().indexOf(var4) != -1) {
                if (var3 >= 50) {
                    class248.field4051 = -1;
                    class17.field204 = null;
                    return;
                }
                if (var6.length <= var3) {
                    short[] var10 = new short[var6.length * 2];
                    for (int var11 = 0; var11 < var3; var11++) {
                        var10[var11] = var6[var11];
                    }
                    var6 = var10;
                }
                var6[var3++] = (short) var8;
            }
        }
        class343.field5463 = 0;
        class248.field4051 = var3;
        String[] var12 = new String[class248.field4051];
        class17.field204 = var6;
        if (arg2 >= -55) {
            method1351(true);
        }
        for (int var13 = 0; var13 < class248.field4051; var13++) {
            var12[var13] = class326.method2298(4575, var6[var13]).method1015((byte) 86);
        }
        class26.method168(class17.field204, 124, var12);
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)Z", line = 316)
    public final boolean method1354(int arg0) {
        field2741++;
        if (this.field2749 == null) {
            return false;
        } else {
            if (arg0 != 20934) {
                field2740 = 27;
            }
            return true;
        }
    }
}
