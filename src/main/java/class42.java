import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class42 extends class125 {

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    private int field1005;

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "I")
    public static int field1012 = 50;

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "Lod;")
    public static class101 field1011 = class46.method335(-101, "Anmelde)2Limit -Uberschritten)3");

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "[I")
    public static int[] field1010 = new int[field1012];

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "Lod;")
    public static class101 field1000 = class46.method335(83, "Hidden)2use");

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "Lod;")
    private static class101 field1004 = class46.method335(115, "button near the top of that page)3");

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "[I")
    public static int[] field1002 = new int[field1012];

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "[I")
    public static int[] field1014 = new int[field1012];

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "[I")
    public static int[] field1006 = new int[field1012];

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "[I")
    public static int[] field1018 = new int[field1012];

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "[I")
    public static int[] field1019 = new int[field1012];

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
    public static int field1020 = 2;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "[Lod;")
    public static class101[] field1001 = new class101[field1012];

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "[I")
    public static int[] field1003 = new int[field1012];

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "Lod;")
    public static class101 field1016 = field1004;

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "Lcb;")
    public static class17 field1013 = new class17(100);

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!ff", name = "E", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    public static final void method312(byte arg0) {
        field1015++;
        int var1 = class54.field1247 * 128 + 64;
        int var2 = class80.field1710 * 128 + 64;
        int var3 = class65.method449(var2, var1, class95.field2040, true) - class8.field132;
        if (class133.field3048 < var2) {
            class133.field3048 += (var2 - class133.field3048) * class134.field3074 / 1000 + class143.field3298;
            if (var2 < class133.field3048) {
                class133.field3048 = var2;
            }
        }
        if (class133.field3048 > var2) {
            class133.field3048 -= (class133.field3048 - var2) * class134.field3074 / 1000 + class143.field3298;
            if (var2 > class133.field3048) {
                class133.field3048 = var2;
            }
        }
        int var4 = class82.field1790 * 128 + 64;
        if (var3 > class26.field692) {
            class26.field692 += (var3 - class26.field692) * class134.field3074 / 1000 + class143.field3298;
            if (var3 < class26.field692) {
                class26.field692 = var3;
            }
        }
        if (var3 < class26.field692) {
            class26.field692 -= (class26.field692 - var3) * class134.field3074 / 1000 + class143.field3298;
            if (var3 > class26.field692) {
                class26.field692 = var3;
            }
        }
        if (var1 > class120.field2637) {
            class120.field2637 += class143.field3298 + (var1 - class120.field2637) * class134.field3074 / 1000;
            if (class120.field2637 > var1) {
                class120.field2637 = var1;
            }
        }
        if (class120.field2637 > var1) {
            class120.field2637 -= (class120.field2637 - var1) * class134.field3074 / 1000 + class143.field3298;
            if (class120.field2637 < var1) {
                class120.field2637 = var1;
            }
        }
        if (arg0 != -18) {
            field1011 = null;
        }
        int var5 = class135.field3102 * 128 + 64;
        int var6 = class65.method449(var4, var5, class95.field2040, true) - client.field472;
        int var7 = var6 - class26.field692;
        int var8 = var5 - class120.field2637;
        int var9 = var4 - class133.field3048;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var8, (double) var9)) & 0x7FF;
        int var13 = var12 - class132.field3033;
        if (class26.field677 < var11) {
            class26.field677 += class85.field1876 + (var11 - class26.field677) * class3.field57 / 1000;
            if (var11 < class26.field677) {
                class26.field677 = var11;
            }
        }
        if (var11 < class26.field677) {
            class26.field677 -= (class26.field677 - var11) * class3.field57 / 1000 + class85.field1876;
            if (class26.field677 < var11) {
                class26.field677 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class132.field3033 += class3.field57 * var13 / 1000 + class85.field1876;
            class132.field3033 &= 0x7FF;
        }
        if (var13 < 0) {
            class132.field3033 -= -var13 * class3.field57 / 1000 + class85.field1876;
            class132.field3033 &= 0x7FF;
        }
        int var14 = var12 - class132.field3033;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class132.field3033 = var12;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lsa;B)I")
    public static final int method313(class126 arg0, byte arg1) {
        field1008++;
        if (arg1 >= -7) {
            field1001 = null;
        }
        class42 var2 = (class42) class153.field3494.method1141(((long) arg0.field2780 << 32) + (long) arg0.field2807, -1);
        return var2 == null ? arg0.field2859 : var2.field1005;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)Z")
    public static final boolean method314(int arg0, int arg1) {
        if (arg0 <= 112) {
            return false;
        } else {
            field1017++;
            return (arg1 >> 28 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V")
    public static void method315(int arg0) {
        field1011 = null;
        field1014 = null;
        field1013 = null;
        field1010 = null;
        if (arg0 != 128) {
            return;
        }
        field1018 = null;
        field1001 = null;
        field1016 = null;
        field1002 = null;
        field1003 = null;
        field1019 = null;
        field1000 = null;
        field1004 = null;
        field1006 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IJ)V")
    public static final void method316(int arg0, long arg1) {
        field1022++;
        if (arg1 == 0L) {
            return;
        }
        class17.field364.method419(131, (byte) 0);
        if (arg0 != -18925) {
            field1000 = null;
        }
        class106.field2278++;
        class17.field364.method1087(arg1, arg0 ^ 0x4985);
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
    public class42() {
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(I)V")
    public class42(int arg0) {
        this.field1005 = arg0;
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)V")
    public static final void method317(int arg0) {
        field1023++;
        class25.field652.method135(0);
        if (arg0 >= -95) {
            method316(-119, -40L);
        }
        class153.field3496.method135(0);
    }
}
