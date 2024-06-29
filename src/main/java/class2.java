import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 extends class141 {

    @OriginalMember(owner = "client!aa", name = "F", descriptor = "[I")
    public int[] field141 = new int[] { -1 };

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "[I")
    public int[] field151 = new int[1];

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "I")
    public static int field146 = 0;

    @OriginalMember(owner = "client!aa", name = "B", descriptor = "Lkd;")
    public static class73 field137 = class126.method1070((byte) -66, "Icons redrawn");

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "I")
    public static int field140 = 0;

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "Lkd;")
    public static class73 field149 = class126.method1070((byte) -66, "Offline");

    @OriginalMember(owner = "client!aa", name = "D", descriptor = "Lkd;")
    public static class73 field139 = class126.method1070((byte) -66, "T");

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "Lkd;")
    public static class73 field144 = class126.method1070((byte) -66, ")3");

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "I")
    public static int field152 = 7759444;

    @OriginalMember(owner = "client!aa", name = "C", descriptor = "Lkd;")
    public static class73 field138 = class126.method1070((byte) -66, "mapfunction");

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "Z")
    public static boolean field147 = true;

    @OriginalMember(owner = "client!aa", name = "S", descriptor = "[Lnc;")
    public static class93[] field154 = new class93[50];

    @OriginalMember(owner = "client!aa", name = "U", descriptor = "I")
    public static volatile int field156 = 0;

    @OriginalMember(owner = "client!aa", name = "A", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!aa", name = "G", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!aa", name = "V", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "[I")
    public static int[] field150;

    @OriginalMember(owner = "client!aa", name = "T", descriptor = "[[B")
    public static byte[][] field155;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(B)V")
    public static final void method15(byte arg0) {
        field142++;
        if (!class54.field1431) {
            return;
        }
        class142.field3542 = null;
        class89.field2294 = null;
        class11.field358 = null;
        class151.field3747 = null;
        class22.field635 = null;
        class136.field3399 = null;
        class99.field2491 = null;
        class54.field1431 = false;
        class142.field3536 = null;
        class22.field625 = null;
        class89.field2252 = null;
        class103.field2565 = null;
        class84.field2138 = null;
        class38.field1045 = null;
        class23.field679 = null;
        class45.field1184 = null;
        class38.field1030 = null;
        if (arg0 <= 6) {
            return;
        }
        class48.field1287 = null;
        class26.field770 = null;
        class81.field2038 = null;
        class151.field3749 = null;
        class55.field1480 = null;
        client.field607 = null;
        class86.field2184 = null;
        class142.field3531 = null;
        class79.field2010 = null;
        class22.field642 = null;
        class115.field2887 = null;
        class55.field1488 = null;
        class116.field2978 = null;
        class51.field1365 = null;
        class114.field2817 = null;
        class92.field2379 = null;
        class39.field1064 = null;
        class139.field3462 = null;
        class36.field982 = null;
        class80.field2019 = null;
        class92.field2377 = null;
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(B)V")
    public static void method16(byte arg0) {
        field138 = null;
        field154 = null;
        field139 = null;
        field144 = null;
        field137 = null;
        field149 = null;
        if (arg0 != 41) {
            method16((byte) -70);
        }
        field155 = null;
        field150 = null;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)Lqd;")
    public static final class115 method17(int arg0, int arg1) {
        field136++;
        class115 var2 = (class115) class125.field3171.method538(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        class115 var3 = class80.method686(class82.field2077, arg1 + arg1, false, class30.field855, arg0);
        if (var3 != null) {
            class125.field3171.method542(var3, -901, (long) arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lmf;BI)V")
    public static final void method18(class89 arg0, byte arg1, int arg2) {
        field157++;
        if (arg0.field2238 > class49.field1308) {
            client.method177(arg0, 1024);
        } else if (class49.field1308 > arg0.field2257) {
            class150.method1204(arg0, false);
        } else {
            class53.method426(arg0, 123);
        }
        if (arg0.field2277 < 128 || arg0.field2264 < 128 || arg0.field2277 >= 13184 || arg0.field2264 >= 13184) {
            arg0.field2284 = -1;
            arg0.field2257 = 0;
            arg0.field2264 = arg0.field2280[0] * 128 + arg0.field2233 * 64;
            arg0.field2238 = 0;
            arg0.field2301 = -1;
            arg0.field2277 = arg0.field2304[0] * 128 + arg0.field2233 * 64;
            arg0.method745(-115);
        }
        if (class73.field1901 == arg0 && (arg0.field2277 < 1536 || arg0.field2264 < 1536 || arg0.field2277 >= 11776 || arg0.field2264 >= 11776)) {
            arg0.field2238 = 0;
            arg0.field2284 = -1;
            arg0.field2264 = arg0.field2280[0] * 128 + arg0.field2233 * 64;
            arg0.field2257 = 0;
            arg0.field2301 = -1;
            arg0.field2277 = arg0.field2304[0] * 128 + arg0.field2233 * 64;
            arg0.method745(-98);
        }
        class61.method512((byte) 84, arg0);
        class18.method153(arg0, (byte) -124);
        int var3 = 64 % ((18 - arg1) / 48);
    }
}
