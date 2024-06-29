import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class120 extends class183 {

    @OriginalMember(owner = "client!da", name = "T", descriptor = "I")
    private int field2124 = 3072;

    @OriginalMember(owner = "client!da", name = "Y", descriptor = "I")
    private int field2129 = 1024;

    @OriginalMember(owner = "client!da", name = "eb", descriptor = "I")
    private int field2135 = 2048;

    @OriginalMember(owner = "client!da", name = "U", descriptor = "Ljf;")
    public static class229 field2125 = class212.method1457((byte) 78, "hitmarks");

    @OriginalMember(owner = "client!da", name = "hb", descriptor = "Ljf;")
    public static class229 field2138 = class212.method1457((byte) 100, "Veuillez patienter )2 tentative de r-Btablissement)3");

    @OriginalMember(owner = "client!da", name = "W", descriptor = "Ljf;")
    private static class229 field2127 = class212.method1457((byte) 59, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!da", name = "bb", descriptor = "Ljf;")
    public static class229 field2132 = field2127;

    @OriginalMember(owner = "client!da", name = "ib", descriptor = "Ljf;")
    public static class229 field2139 = class212.method1457((byte) 125, "comp-Btence ");

    @OriginalMember(owner = "client!da", name = "V", descriptor = "[B")
    public static byte[] field2126 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!da", name = "X", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!da", name = "Z", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!da", name = "ab", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!da", name = "cb", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!da", name = "db", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!da", name = "fb", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!da", name = "gb", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!da", name = "jb", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!da", name = "kb", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!da", name = "lb", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IB)Ltb;", line = 4)
    public static final class222 method848(int arg0, byte arg1) {
        if (arg1 != 118) {
            field2132 = (class229) null;
        }
        field2131++;
        return class183.field3165 && class24.field452 <= arg0 && class312.field5242 >= arg0 ? class282.field4835[arg0 - class24.field452] : null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILkh;I)V", line = 22)
    public final void method14(int arg0, class14 arg1, int arg2) {
        if (arg0 > -43) {
            return;
        }
        field2142++;
        if (arg2 == 0) {
            this.field2129 = arg1.method116(-1);
        } else if (arg2 == 1) {
            this.field2124 = arg1.method116(-1);
        } else if (arg2 == 2) {
            this.field3166 = arg1.method93(false) == 1;
        }
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(B)V", line = 66)
    public static final void method849(byte arg0) {
        if (arg0 != -116) {
            return;
        }
        for (int var1 = 0; var1 < class126.field2238; var1++) {
            int var2 = class283.field4858[var1];
            class331 var3 = class331.field5637[var2];
            if (var3 != null) {
                class236.method1689(var3, (byte) 78, var3.field5631.field2952);
            }
        }
        field2136++;
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V", line = 100)
    public static void method850(int arg0) {
        field2139 = null;
        field2127 = null;
        field2125 = null;
        field2132 = null;
        field2138 = null;
        if (arg0 != -22376) {
            method852(114, (byte) -112);
        }
        field2126 = null;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)[[I", line = 119)
    public final int[][] method12(int arg0, int arg1) {
        field2130++;
        int[][] var3 = this.field3160.method1057(-20449, arg1);
        if (this.field3160.field2689) {
            int[][] var4 = this.method1250(arg1, 0, (byte) 55);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class22.field393; var11++) {
                var8[var11] = (var5[var11] * this.field2135 >> 12) + this.field2129;
                var9[var11] = (var7[var11] * this.field2135 >> 12) + this.field2129;
                var10[var11] = (var6[var11] * this.field2135 >> 12) + this.field2129;
            }
        }
        int var12 = -119 % ((arg0 - 18) / 61);
        return var3;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(II)[I", line = 167)
    public final int[] method10(int arg0, int arg1) {
        field2137++;
        if (arg1 != -1) {
            field2139 = (class229) null;
        }
        int[] var3 = this.field3161.method664(arg0, 0);
        if (this.field3161.field1736) {
            int[] var4 = this.method1253(0, arg0, 125);
            for (int var5 = 0; var5 < class22.field393; var5++) {
                var3[var5] = this.field2129 + (var4[var5] * this.field2135 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(II)V", line = 202)
    public static final void method851(int arg0, int arg1) {
        field2128++;
        if (class192.method1314(arg1, -17)) {
            class27.method243(arg0 ^ 0xFFFFFF9C, class23.field423[arg1], arg0);
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V", line = 218)
    public final void method25(int arg0) {
        if (arg0 == -8) {
            field2134++;
            this.field2135 = this.field2124 - this.field2129;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(IB)V", line = 233)
    public static final void method852(int arg0, byte arg1) {
        field2141++;
        if (arg0 == -1 || !class146.field2544[arg0]) {
            return;
        }
        if (arg1 != -126) {
            field2125 = (class229) null;
        }
        class318.field5378.method1274((byte) -73, arg0);
        if (class23.field423[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class23.field423[arg0].length; var3++) {
            if (class23.field423[arg0][var3] != null) {
                if (class23.field423[arg0][var3].field1267 == 2) {
                    var2 = false;
                } else {
                    class23.field423[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class23.field423[arg0] = null;
        }
        class146.field2544[arg0] = false;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLek;)V", line = 281)
    public static final void method853(byte arg0, class185 arg1) {
        client.field4466 = arg1;
        field2140++;
        if (arg0 != -45) {
            field2132 = (class229) null;
        }
        class325.field5479 = client.field4466.method1268(16, (byte) 109);
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V", line = 320)
    public class120() {
        super(1, false);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(IIIIIII)V", line = 328)
    public static final void method854(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2133++;
        int var7 = class129.method909(class56.field991, arg0 ^ arg0, arg3, class142.field2458);
        int var8 = class129.method909(class56.field991, 0, arg2, class142.field2458);
        int var9 = class129.method909(class149.field2578, 0, arg1, class327.field5490);
        int var10 = class129.method909(class149.field2578, 0, arg6, class327.field5490);
        int var11 = class129.method909(class56.field991, 0, arg3 + arg4, class142.field2458);
        int var12 = class129.method909(class56.field991, 0, arg2 - arg4, class142.field2458);
        for (int var13 = var7; var13 < var11; var13++) {
            class34.method306(var9, class173.field3021[var13], (byte) 127, var10, arg5);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class34.method306(var9, class173.field3021[var14], (byte) 127, var10, arg5);
        }
        int var15 = class129.method909(class149.field2578, 0, arg1 + arg4, class327.field5490);
        int var16 = class129.method909(class149.field2578, 0, arg6 - arg4, class327.field5490);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class173.field3021[var17];
            class34.method306(var9, var18, (byte) 120, var15, arg5);
            class34.method306(var16, var18, (byte) 114, var10, arg5);
        }
    }
}
