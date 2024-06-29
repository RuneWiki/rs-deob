import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class137 extends class124 {

    @OriginalMember(owner = "client!ah", name = "T", descriptor = "Le;")
    public static class191 field2293 = class54.method368("floorshadows", 2047);

    @OriginalMember(owner = "client!ah", name = "P", descriptor = "Lwe;")
    public static class147 field2290 = new class147(20);

    @OriginalMember(owner = "client!ah", name = "cb", descriptor = "I")
    public static int field2302 = 0;

    @OriginalMember(owner = "client!ah", name = "hb", descriptor = "Lwe;")
    public static class147 field2307 = new class147(64);

    @OriginalMember(owner = "client!ah", name = "Z", descriptor = "B")
    public static byte field2299;

    @OriginalMember(owner = "client!ah", name = "R", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!ah", name = "S", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!ah", name = "U", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!ah", name = "V", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!ah", name = "X", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!ah", name = "Y", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!ah", name = "ab", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!ah", name = "fb", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!ah", name = "gb", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!ah", name = "eb", descriptor = "J")
    public static long field2304;

    @OriginalMember(owner = "client!ah", name = "ib", descriptor = "J")
    public static long field2308;

    @OriginalMember(owner = "client!ah", name = "db", descriptor = "Lng;")
    public static class121 field2303;

    @OriginalMember(owner = "client!ah", name = "W", descriptor = "[I")
    public static int[] field2296;

    @OriginalMember(owner = "client!ah", name = "jb", descriptor = "[I")
    public static int[] field2309;

    @OriginalMember(owner = "client!ah", name = "bb", descriptor = "[[[B")
    public static byte[][][] field2301;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI)[I")
    public final int[] method131(byte arg0, int arg1) {
        int[] var3 = super.field2064.method378(arg1, 0);
        if (arg0 <= 68) {
            field2293 = null;
        }
        if (super.field2064.field1035) {
            int[][] var4 = this.method843((byte) -86, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class64.field1132 < ~var8; ++var8) {
                var3[var8] = (var5[var8] - -var6[var8] + var7[var8]) / 3;
            }
        }
        ++field2291;
        return var3;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
    public class137() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(B)V")
    public static void method911(byte arg0) {
        int var1 = -35 % ((arg0 - -25) / 51);
        field2296 = null;
        field2290 = null;
        field2309 = null;
        field2303 = null;
        field2307 = null;
        field2293 = null;
        field2301 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)Z")
    public static final boolean method912(int arg0, int arg1) {
        ++field2292;
        if (arg1 != -26100) {
            field2308 = 122L;
        }
        return ~arg0 <= -49 && ~arg0 >= -58;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILcc;Z)V")
    public static final void method913(int arg0, class267 arg1, boolean arg2) {
        ++field2300;
        int var3 = arg1.field4721;
        int var4 = (int) arg1.field1713;
        arg1.method655(63);
        if (arg2) {
            class110.method703(2, var3);
        }
        class235.method1660(1955713648, var3);
        class33 var5 = class233.method1646(5877, var4);
        if (arg0 != 15) {
            method913(-78, (class267) null, false);
        }
        if (var5 != null) {
            class184.method1238(var5, (byte) -51);
        }
        int var6 = class167.field2824;
        for (int var7 = 0; var7 < var6; ++var7) {
            if (class156.method1069(96, class188.field3306[var7])) {
                class158.method1074(0, var7);
            }
        }
        if (class167.field2824 == 1) {
            class258.field4575 = false;
            class71.method469(-124, class93.field1522, class123.field2041, class192.field3447, class224.field3986);
        } else {
            class71.method469(-119, class93.field1522, class123.field2041, class192.field3447, class224.field3986);
            int var8 = class230.field4128.method302(class107.field1774);
            for (int var9 = 0; ~class167.field2824 < ~var9; ++var9) {
                int var10 = class230.field4128.method302(class106.method683(-8029, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class224.field3986 = var8 + 8;
            class93.field1522 = class167.field2824 * 15 + 22;
        }
        if (~class130.field2166 != 0) {
            class244.method1709(class130.field2166, 0, 1);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(JI)V")
    public static final void method914(long arg0, int arg1) {
        ++field2295;
        if (~arg0 != -1L) {
            for (int var3 = 0; class254.field4506 > var3; ++var3) {
                if (~class207.field3693[var3] == ~arg0) {
                    --class254.field4506;
                    ++class253.field4483;
                    for (int var4 = var3; ~var4 > ~class254.field4506; ++var4) {
                        class207.field3693[var4] = class207.field3693[var4 + 1];
                        class47.field844[var4] = class47.field844[var4 - -1];
                    }
                    class21.field297 = class110.field1841;
                    class53.field963.method1096(81, 0);
                    class53.field963.method1589(arg0, false);
                    break;
                }
            }
            if (arg1 != 27040) {
                field2297 = -40;
            }
        }
    }
}
