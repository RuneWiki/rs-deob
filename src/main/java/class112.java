import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class112 extends class130 {

    @OriginalMember(owner = "client!md", name = "K", descriptor = "Lgg;")
    public static class63 field2522 = class116.method911(43, "<img=1>");

    @OriginalMember(owner = "client!md", name = "J", descriptor = "[I")
    public static int[] field2521 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!md", name = "F", descriptor = "I")
    public static volatile int field2519 = 0;

    @OriginalMember(owner = "client!md", name = "N", descriptor = "Lgg;")
    public static class63 field2524 = class116.method911(43, "event_opbase");

    @OriginalMember(owner = "client!md", name = "U", descriptor = "I")
    public static int field2531 = 0;

    @OriginalMember(owner = "client!md", name = "P", descriptor = "Lgg;")
    public static class63 field2526 = class116.method911(43, "Stufe)2");

    @OriginalMember(owner = "client!md", name = "H", descriptor = "B")
    public byte field2520;

    @OriginalMember(owner = "client!md", name = "L", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "I")
    public int field2527;

    @OriginalMember(owner = "client!md", name = "R", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!md", name = "S", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!md", name = "T", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "J")
    public static long field2518;

    @OriginalMember(owner = "client!md", name = "O", descriptor = "Lmc;")
    public class111 field2525;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIII)I")
    public static final int method894(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 >> 7;
        field2530++;
        int var5 = arg3 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg2 & 0x7F;
        int var7 = arg3 & 0x7F;
        int var8 = arg1;
        if (arg1 < 3 && (class49.field1194[1][var4][var5] & 0x2) == 2) {
            var8 = arg1 + 1;
        }
        int var9 = (128 - var6) * class81.field1948[var8][var4][var5 + 1] + class81.field1948[var8][var4 + 1][var5 + 1] * var6 >> 7;
        int var10 = (128 - var6) * class81.field1948[var8][var4][var5] + class81.field1948[var8][var4 + 1][var5] * var6 >> 7;
        return arg0 >= -84 ? 62 : (128 - var7) * var10 + var7 * var9 >> 7;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
    public static void method895(int arg0) {
        field2526 = null;
        field2524 = null;
        field2521 = null;
        int var1 = 122 % ((-arg0 - 10) / 43);
        field2522 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BZLgg;)V")
    public static final void method896(byte arg0, boolean arg1, class63 arg2) {
        field2529++;
        class63 var3 = arg2.method584((byte) -123);
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class161.field3319; var6++) {
            class93 var9 = class59.method554(var6, 13319);
            if ((!arg1 || var9.field2207) && var9.field2202.method584((byte) -123).method585(-110, var3) != -1) {
                if (var5 >= 250) {
                    class152.field3192 = null;
                    class118.field2643 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class118.field2643 = var5;
        class143.field3072 = 0;
        class63[] var7 = new class63[class118.field2643];
        class152.field3192 = var4;
        for (int var8 = 0; var8 < class118.field2643; var8++) {
            var7[var8] = class59.method554(var4[var8], 13319).field2202;
        }
        class37.method346(class152.field3192, var7, (byte) 124);
        if (arg0 != -36) {
            field2521 = null;
        }
    }
}
