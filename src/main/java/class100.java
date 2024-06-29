import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class100 {

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "Z")
    public boolean field2124 = true;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public int field2114;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public int field2113;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
    public int field2133;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public int field2120;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    public int field2125;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public int field2118;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "Lo;")
    public static class84 field2111 = class15.method124("This is a non)2members*6nworld)3 To enjoy your*6nmembers benefits we*6nrecommend you play on a*6nmembers world instead)3", 255);

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field2119 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field2112 = 5063219;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "Lo;")
    public static class84 field2128 = class15.method124("flash3:", 255);

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "Lo;")
    public static class84 field2117 = class15.method124("runes", 255);

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "Lo;")
    public static class84 field2123 = class15.method124("From ", 255);

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public static int field2127 = 0;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "Lo;")
    public static class84 field2131 = class15.method124("purple:", 255);

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "Lud;")
    public static class118 field2132;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "Lad;")
    public static class5 field2122;

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(IIIIIIZ)V", line = 327)
    public class100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2114 = arg3;
        this.field2113 = arg2;
        this.field2133 = arg0;
        this.field2120 = arg1;
        this.field2125 = arg4;
        this.field2118 = arg5;
        this.field2124 = arg6;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 49)
    public static final void method754(byte arg0) {
        class31.field623.method742(4);
        field2121++;
        int var1 = 92 % ((-arg0 - 62) / 47);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIBIII)V", line = 60)
    public static final void method755(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (!class1.field23) {
            arg1 = 0;
        }
        field2126++;
        if (class65.field1445 == arg0 && class58.field1204 == arg5 && class39.field801 == arg1) {
            return;
        }
        class39.field801 = arg1;
        class58.field1204 = arg5;
        class65.field1445 = arg0;
        class8.method63(25, false);
        class78.method576(false, null, class117.field2545, -32266);
        int var6 = class36.field714;
        class36.field714 = (arg5 - 6) * 8;
        int var7 = class36.field714 - var6;
        int var8 = class36.field714;
        int var9 = class106.field2242;
        class106.field2242 = arg0 * 8 - 48;
        int var10 = class106.field2242 - var9;
        int var11 = class106.field2242;
        for (int var12 = 0; var12 < 16384; var12++) {
            class115 var28 = class3.field30[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field1374[var29] -= var10;
                    var28.field1436[var29] -= var7;
                }
                var28.field1380 -= var10 * 128;
                var28.field1391 -= var7 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class63 var26 = class119.field2643[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field1374[var27] -= var10;
                    var26.field1436[var27] -= var7;
                }
                var26.field1380 -= var10 * 128;
                var26.field1391 -= var7 * 128;
            }
        }
        byte var14 = 0;
        class1.field11 = arg1;
        class107.field2271.method507(false, arg3, (byte) 50, arg4);
        byte var15 = 104;
        byte var16 = 1;
        byte var17 = 0;
        if (var10 < 0) {
            var16 = -1;
            var14 = 103;
            var15 = -1;
        }
        byte var18 = 1;
        byte var19 = 104;
        if (var7 < 0) {
            var18 = -1;
            var17 = 103;
            var19 = -1;
        }
        for (int var20 = var14; var20 != var15; var20 += var16) {
            for (int var22 = var17; var22 != var19; var22 += var18) {
                int var23 = var10 + var20;
                int var24 = var7 + var22;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        class110.field2379[var25][var20][var22] = class110.field2379[var25][var23][var24];
                    } else {
                        class110.field2379[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class41 var21 = (class41) class111.field2404.method695((byte) -126); var21 != null; var21 = (class41) class111.field2404.method702(0)) {
            var21.field827 -= var7;
            var21.field823 -= var10;
            if (var21.field823 < 0 || var21.field827 < 0 || var21.field823 >= 104 || var21.field827 >= 104) {
                var21.method333(0);
            }
        }
        class8.field159 = false;
        if (class45.field970 != 0) {
            class45.field970 -= var10;
            class97.field2077 -= var7;
        }
        class27.field533 = -1;
        class115.field2491.method693(-9707);
        class30.field595.method693(-9707);
        if (arg2 <= 83) {
            field2122 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)V", line = 246)
    public static final void method756(byte arg0) {
        field2130++;
        class48.field1008.method742(4);
        class111.field2391.method742(4);
        class48.field998.method742(4);
        if (arg0 != -14) {
            field2119 = -1;
        }
        class3.field43.method742(4);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BJ)V", line = 267)
    public static final void method757(byte arg0, long arg1) {
        field2129++;
        if (arg0 != -42) {
            method758(-14);
        }
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class118.field2629; var3++) {
            if (class103.field2166[var3] == arg1) {
                class118.field2629--;
                class39.field798 = true;
                for (int var4 = var3; var4 < class118.field2629; var4++) {
                    class103.field2166[var4] = class103.field2166[var4 + 1];
                }
                class97.field2070.method979(1, 168);
                class84.field1910++;
                class97.field2070.method203(-24628, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 305)
    public static void method758(int arg0) {
        field2131 = null;
        field2117 = null;
        field2128 = null;
        field2132 = null;
        if (arg0 == 0) {
            field2122 = null;
            field2123 = null;
            field2111 = null;
        }
    }
}
