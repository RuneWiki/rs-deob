import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class56 {

    @OriginalMember(owner = "client!b", name = "b", descriptor = "Z")
    public boolean field1067 = true;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public int field1072;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    public int field1076;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public int field1068;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public int field1075;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public int field1081;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "Lmh;")
    public static class128 field1073 = class22.method156(123, "Nehmen");

    @OriginalMember(owner = "client!b", name = "f", descriptor = "Ls;")
    public static class261 field1071 = new class261(64);

    @OriginalMember(owner = "client!b", name = "o", descriptor = "Lmh;")
    public static class128 field1080 = class22.method156(127, "(U (X");

    @OriginalMember(owner = "client!b", name = "s", descriptor = "[I")
    public static int[] field1084 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!b", name = "t", descriptor = "I")
    public static int field1085 = 0;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "Lmh;")
    public static class128 field1083 = class22.method156(123, "Texturen geladen)3");

    @OriginalMember(owner = "client!b", name = "u", descriptor = "Lmh;")
    public static class128 field1086 = class22.method156(124, "Weiter");

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "Lel;")
    public static class112 field1078;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "[I")
    public static int[] field1079;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V", line = 5)
    public static final void method373(int arg0) {
        field1070++;
        if (class81.field1457 != null || arg0 >= -92 || class165.field2839 != null) {
            return;
        }
        int var1 = class103.field1767;
        if (class271.field4721) {
            if (var1 != 1) {
                int var2 = class275.field4760;
                int var3 = class77.field1411;
                if ((class309.field5242 - 10) > var2 || (class309.field5242 + class292.field5005 + 10) < var2 || class226.field3946 - 10 > var3 || class219.field3864 + class226.field3946 + 10 < var3) {
                    class271.field4721 = false;
                    class118.method710(class226.field3946, class219.field3864, class292.field5005, (byte) -122, class309.field5242);
                }
            }
            if (var1 == 1) {
                int var4 = class226.field3946;
                int var5 = class309.field5242;
                int var6 = class292.field5005;
                int var7 = class241.field4129;
                int var8 = class45.field915;
                int var9 = -1;
                for (int var10 = 0; var10 < class275.field4769; var10++) {
                    int var11 = (class275.field4769 - var10 - 1) * 15 + var4 + 31;
                    if (var5 < var8 && var8 < var5 + var6 && (var11 - 13) < var7 && (var11 + 3) > var7) {
                        var9 = var10;
                    }
                }
                if (var9 != -1) {
                    class11.method90((byte) -26, var9);
                }
                class271.field4721 = false;
                class118.method710(class226.field3946, class219.field3864, class292.field5005, (byte) -128, class309.field5242);
            }
            return;
        }
        if (var1 == 1 && class275.field4769 > 0) {
            short var12 = class117.field1979[class275.field4769 - 1];
            if (var12 == 12 || var12 == 50 || var12 == 28 || var12 == 8 || var12 == 38 || var12 == 30 || var12 == 49 || var12 == 57 || var12 == 35 || var12 == 32 || var12 == 31 || var12 == 1005) {
                int var13 = class267.field4635[class275.field4769 - 1];
                int var14 = class309.field5251[class275.field4769 - 1];
                class10 var15 = class233.method1606(true, var14);
                if (class62.method408(client.method1657(var15), 0) || class125.method767(client.method1657(var15), 16711935)) {
                    class259.field4459 = 0;
                    class252.field4360 = false;
                    if (class81.field1457 != null) {
                        class7.method48(class81.field1457, 0);
                    }
                    class81.field1457 = class233.method1606(true, var14);
                    class219.field3867 = class45.field915;
                    class115.field1943 = class241.field4129;
                    class262.field4541 = var13;
                    class7.method48(class81.field1457, 0);
                    return;
                }
            }
        }
        if (var1 == 1 && (class191.field3315 == 1 && class275.field4769 > 2 || class20.method145(class275.field4769 - 1, (byte) -118))) {
            var1 = 2;
        }
        if (var1 == 2 && class275.field4769 > 0 || class173.field3069 == 1) {
            class118.method709(25608);
        }
        if (var1 == 1 && class275.field4769 > 0 || class173.field3069 == 2) {
            class315.method2178(-3595);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)V", line = 131)
    public static final void method374(int arg0, int arg1) {
        class143.field2441 = arg1;
        class30.field663 = arg0;
        class102.field1756 = -1;
        class130.method874(arg0);
        field1066++;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)I", line = 148)
    public static final int method375(byte arg0, int arg1) {
        class275 var2 = class84.method538(arg1, 1);
        if (arg0 >= -108) {
            field1083 = (class128) null;
        }
        field1074++;
        int var3 = var2.field4761;
        int var4 = var2.field4758;
        int var5 = var2.field4766;
        int var6 = class182.field3185[var4 - var3];
        return var6 & class104.field1778[var5] >> var3;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V", line = 168)
    public static void method376(boolean arg0) {
        field1083 = null;
        field1079 = null;
        field1078 = null;
        field1084 = null;
        if (!arg0) {
            field1080 = null;
            field1071 = null;
            field1086 = null;
            field1073 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(IIIIIIZ)V", line = 244)
    public class56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1072 = arg5;
        this.field1076 = arg1;
        this.field1067 = arg6;
        this.field1068 = arg2;
        this.field1075 = arg4;
        this.field1081 = arg3;
        this.field1082 = arg0;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V", line = 205)
    public static final void method377(int arg0) {
        field1077++;
        class37 var1 = (class37) class156.field2679.method2024(0);
        if (arg0 < 121) {
            return;
        }
        while (var1 != null) {
            class98 var2 = var1.field745;
            if (class133.field2315 != var2.field1695 || var2.field1699) {
                var1.method1978((byte) -101);
            } else if (class293.field5011 >= var2.field1693) {
                var2.method614(class50.field992, 0);
                if (var2.field1699) {
                    var1.method1978((byte) 126);
                } else {
                    class252.method1791(var2.field1695, var2.field1691, var2.field1700, var2.field1688, 60, var2, 0, -1L, false);
                }
            }
            var1 = (class37) class156.field2679.method2027(1211754408);
        }
    }
}
