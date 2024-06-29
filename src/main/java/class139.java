import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class139 extends class262 {

    @OriginalMember(owner = "client!oc", name = "U", descriptor = "I")
    private int field2310 = 0;

    @OriginalMember(owner = "client!oc", name = "bb", descriptor = "I")
    private int field2317 = 0;

    @OriginalMember(owner = "client!oc", name = "eb", descriptor = "I")
    private int field2320 = 1;

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "Lok;")
    public static class146 field2306 = class235.method1724(-12908, "<col=ffff00>");

    @OriginalMember(owner = "client!oc", name = "P", descriptor = "Lok;")
    private static class146 field2305 = class235.method1724(-12908, "Select");

    @OriginalMember(owner = "client!oc", name = "cb", descriptor = "Lok;")
    public static class146 field2318 = null;

    @OriginalMember(owner = "client!oc", name = "db", descriptor = "Lok;")
    public static class146 field2319 = class235.method1724(-12908, "Atteindre");

    @OriginalMember(owner = "client!oc", name = "ab", descriptor = "S")
    public static short field2316 = 205;

    @OriginalMember(owner = "client!oc", name = "Z", descriptor = "Lok;")
    public static class146 field2315 = field2305;

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!oc", name = "T", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!oc", name = "X", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!oc", name = "Y", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!oc", name = "R", descriptor = "Lub;")
    public static class20 field2307;

    @OriginalMember(owner = "client!oc", name = "V", descriptor = "Lje;")
    public static class70 field2311;

    @OriginalMember(owner = "client!oc", name = "W", descriptor = "[I")
    public static int[] field2312;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIII)I", line = 6)
    public static final int method1021(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class121.field1985) {
            arg2 = 1000000;
            class121.field1985 = false;
        }
        class175 var5 = class95.field1529[arg1][arg0];
        field2314++;
        int var6 = var5.field2931;
        float var7 = ((float) arg4 * 0.1F + 0.7F) * var5.field2924;
        float var8 = var5.field2921;
        if (arg3 != 65280) {
            field2318 = (class146) null;
        }
        int var9 = var5.field2928;
        float var10 = var5.field2938;
        int var11 = var5.field2933;
        if (!class322.field5501) {
            var11 = 0;
        }
        if (class150.field2558 != var6 || class174.field2917 != var7 || class300.field5081 != var8 || class297.field5054 != var10 || class85.field1354 != var9 || class278.field4767 != var11) {
            class85.field1354 = var9;
            class296.field5010 = class55.field984;
            class296.field5050 = class211.field3501;
            class297.field5054 = var10;
            class124.field2022 = 0;
            class174.field2917 = var7;
            class300.field5081 = var8;
            class278.field4767 = var11;
            class192.field3191 = class81.field1299;
            class23.field418 = class155.field2601;
            class319.field5454 = class74.field1210;
            class150.field2558 = var6;
            class115.field1848 = class241.field4010;
        }
        if (class124.field2022 < 65536) {
            class124.field2022 += arg2 * 250;
            if (class124.field2022 >= 65536) {
                class124.field2022 = 65536;
            }
            int var12 = class124.field2022 >> 8;
            int var13 = 65536 - class124.field2022 >> 8;
            class241.field4010 = ((class150.field2558 & 0xFF00FF) * var12 + (class115.field1848 & 0xFF00FF) * var13 & 0xFF00FF00) + ((class150.field2558 & 0xFF00) * var12 + (class115.field1848 & 0xFF00) * var13 & 0xFF0000) >> 8;
            float var14 = (float) (65536 - class124.field2022) / 65536.0F;
            float var15 = (float) class124.field2022 / 65536.0F;
            class155.field2601 = ((class85.field1354 & 0xFF00FF) * var12 + (class23.field418 & 0xFF00FF) * var13 & 0xFF00FF00) + ((class85.field1354 & 0xFF00) * var12 + (class23.field418 & 0xFF00) * var13 & 0xFF0000) >> 8;
            class55.field984 = class300.field5081 * var15 + class296.field5010 * var14;
            class74.field1210 = class319.field5454 * var14 + class297.field5054 * var15;
            class211.field3501 = class296.field5050 * var13 + (class278.field4767 * var12) >> 8;
            class81.field1299 = class192.field3191 * var14 + class174.field2917 * var15;
        }
        class231.method1690(class241.field4010, class81.field1299, class55.field984, class74.field1210);
        class231.method1696(class155.field2601, class211.field3501);
        class231.method1692((float) class192.field3176, (float) class94.field1513, (float) class119.field1932);
        class231.method1700();
        return class155.field2601;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)[I", line = 90)
    public final int[] method38(int arg0, byte arg1) {
        if (arg1 >= -85) {
            method1022(22);
        }
        int[] var3 = this.field4350.method1532(arg0, (byte) 86);
        if (this.field4350.field3333) {
            int var4 = class312.field5326[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class98.field1598; var6++) {
                int var7 = class210.field3485[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (this.field2310 == 0) {
                    var11 = (var7 - var4) * this.field2320;
                } else {
                    int var9 = var8 * var8 + (var5 * var5) >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field2320 * var10) * 3.141592653589793D);
                }
                int var12 = var11 - (var11 & 0xFFFFF000);
                if (this.field2317 == 0) {
                    var12 = class260.field4324[(var12 & 0xFFF) >> 4] + 4096 >> 1;
                } else if (this.field2317 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        field2309++;
        return var3;
    }

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)V", line = 162)
    public static void method1022(int arg0) {
        field2311 = null;
        field2312 = null;
        if (arg0 >= -114) {
            return;
        }
        field2318 = null;
        field2315 = null;
        field2319 = null;
        field2305 = null;
        field2306 = null;
        field2307 = null;
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)V", line = 192)
    public final void method43(int arg0) {
        if (arg0 != -2) {
            field2311 = (class70) null;
        }
        field2313++;
        class73.method543((byte) -111);
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V", line = 263)
    public class139() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lwe;II)V", line = 219)
    public final void method40(class47 arg0, int arg1, int arg2) {
        field2308++;
        if (arg1 != 2048) {
            return;
        }
        if (arg2 == 0) {
            this.field2310 = arg0.method368(89);
        } else if (arg2 == 1) {
            this.field2317 = arg0.method368(69);
        } else if (arg2 == 3) {
            this.field2320 = arg0.method368(60);
        }
    }
}
