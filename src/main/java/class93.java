import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class93 extends class88 {

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "Ltd;")
    private static class136 field2181 = class145.method1172("You are standing in a members)2only area)3", 45);

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "Ltd;")
    public static class136 field2175 = field2181;

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "Ltd;")
    public static class136 field2179 = class145.method1172("Mem:", 45);

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "Ltd;")
    public static class136 field2173 = class145.method1172("Bitte geben Sie Ihren Benutzenamen ein)3", 45);

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "Ltd;")
    private static class136 field2185 = class145.method1172("Drop", 45);

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "Ltd;")
    public static class136 field2180 = field2185;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "I")
    public static int field2172 = 0;

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "Ltd;")
    private static class136 field2183 = class145.method1172("scroll:", 45);

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "[I")
    public static int[] field2182 = new int[50];

    @OriginalMember(owner = "client!nc", name = "Q", descriptor = "I")
    public static int field2191 = 0;

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "Ltd;")
    public static class136 field2176 = field2183;

    @OriginalMember(owner = "client!nc", name = "T", descriptor = "Ltd;")
    public static class136 field2194 = field2183;

    @OriginalMember(owner = "client!nc", name = "O", descriptor = "I")
    public static int field2189 = 0;

    @OriginalMember(owner = "client!nc", name = "W", descriptor = "[[[Lk;")
    public static class69[][][] field2197 = new class69[4][104][104];

    @OriginalMember(owner = "client!nc", name = "X", descriptor = "[J")
    public static long[] field2198 = new long[32];

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!nc", name = "P", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!nc", name = "R", descriptor = "I")
    public int field2192;

    @OriginalMember(owner = "client!nc", name = "V", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "Lpd;")
    public class108 field2186;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "Laf;")
    public class7 field2177;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "Lmd;")
    public static class87 field2178;

    @OriginalMember(owner = "client!nc", name = "S", descriptor = "[B")
    public byte[] field2193;

    @OriginalMember(owner = "client!nc", name = "U", descriptor = "[Lbb;")
    public static class10[] field2195;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)Z")
    public static final boolean method694(int arg0, int arg1, int arg2) {
        if (arg2 != 20625) {
            field2172 = 112;
        }
        field2174++;
        return (arg1 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILmd;I)Lad;")
    public static final class5 method695(int arg0, class87 arg1, int arg2) {
        field2171++;
        if (arg2 != 25600) {
            method697(-125L, (byte) 55);
        }
        byte[] var3 = arg1.method662(arg0, -31047);
        return var3 == null ? null : new class5(var3);
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)V")
    public static void method696(byte arg0) {
        field2176 = null;
        if (arg0 <= 42) {
            field2191 = -58;
        }
        field2181 = null;
        field2183 = null;
        field2173 = null;
        field2175 = null;
        field2178 = null;
        field2182 = null;
        field2198 = null;
        field2195 = null;
        field2194 = null;
        field2180 = null;
        field2179 = null;
        field2197 = null;
        field2185 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(JB)V")
    public static final void method697(long arg0, byte arg1) {
        field2187++;
        if (arg0 == 0L) {
            return;
        }
        if (class1.field14 >= 100 && class43.field977 != 1 || class1.field14 >= 200) {
            class27.method236((byte) -38, class78.field1803, 0, class37.field871);
            return;
        }
        class136 var3 = class11.method74(-8261, arg0).method1102(-1);
        int var4 = 0;
        if (arg1 < 18) {
            method697(-108L, (byte) -115);
        }
        while (var4 < class1.field14) {
            if (class11.field196[var4] == arg0) {
                class27.method236((byte) -38, class79.method570(0, new class136[] { var3, class112.field2611 }), 0, class37.field871);
                return;
            }
            var4++;
        }
        for (int var5 = 0; var5 < class89.field2104; var5++) {
            if (class43.field988[var5] == arg0) {
                class27.method236((byte) -38, class79.method570(0, new class136[] { class121.field2773, var3, class145.field3334 }), 0, class37.field871);
                return;
            }
        }
        if (var3.method1114(0, class24.field555.field249)) {
            class27.method236((byte) -38, class96.field2306, 0, class37.field871);
            return;
        }
        class89.field2103[class1.field14] = var3;
        class11.field196[class1.field14] = arg0;
        class65.field1406++;
        class61.field1297[class1.field14] = 0;
        class40.field939[class1.field14] = 0;
        class1.field14++;
        class154.field3522 = class67.field1423;
        class15.field304.method867(82, true);
        class15.field304.method990(arg0, (byte) 121);
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
    public static final void method698(int arg0) {
        if (class99.field2379[98]) {
            class19.field404 += (12 - class19.field404) / 2;
        } else if (class99.field2379[99]) {
            class19.field404 += (-class19.field404 - 12) / 2;
        } else {
            class19.field404 /= 2;
        }
        if (class99.field2379[96]) {
            class149.field3426 += (-class149.field3426 - 24) / 2;
        } else if (class99.field2379[97]) {
            class149.field3426 += (24 - class149.field3426) / 2;
        } else {
            class149.field3426 /= 2;
        }
        class151.field3467 = class149.field3426 / 2 + class151.field3467 & 0x7FF;
        field2188++;
        class105.field2491 += class19.field404 / 2;
        if (class105.field2491 < 128) {
            class105.field2491 = 128;
        }
        int var1 = field2189 + class24.field555.field3578;
        int var2 = class64.field1360 + class24.field555.field3580;
        if (class105.field2491 > 383) {
            class105.field2491 = 383;
        }
        if (class13.field238 - var2 < -500 || class13.field238 - var2 > 500 || class152.field3482 - var1 < -500 || class152.field3482 - var1 > 500) {
            class152.field3482 = var1;
            class13.field238 = var2;
        }
        if (arg0 != 2395) {
            method698(-16);
        }
        int var3 = 0;
        if (class13.field238 != var2) {
            class13.field238 += (var2 - class13.field238) / 16;
        }
        if (class152.field3482 != var1) {
            class152.field3482 += (var1 - class152.field3482) / 16;
        }
        int var4 = class13.field238 >> 7;
        int var5 = class152.field3482 >> 7;
        int var6 = class65.method486(class62.field1331, (byte) -42, class152.field3482, class13.field238);
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var7 = var4 - 4; var7 <= var4 + 4; var7++) {
                for (int var8 = var5 - 4; var8 <= var5 + 4; var8++) {
                    int var9 = class62.field1331;
                    if (var9 < 3 && (class125.field2895[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class78.field1804[var9][var7][var8];
                    if (var10 > var3) {
                        var3 = var10;
                    }
                }
            }
        }
        int var11 = var3 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (var11 > class1.field10) {
            class1.field10 += (var11 - class1.field10) / 24;
        } else if (class1.field10 > var11) {
            class1.field10 += (var11 - class1.field10) / 80;
        }
    }
}
