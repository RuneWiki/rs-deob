import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class110 extends class47 {

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "Loc;")
    private static class99 field2713 = class48.method402((byte) -104, "M");

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "Loc;")
    public static class99 field2716 = field2713;

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "[I")
    public static int[] field2728 = new int[256];

    @OriginalMember(owner = "client!qb", name = "Q", descriptor = "Loc;")
    public static class99 field2735 = class48.method402((byte) -104, "::errortest");

    @OriginalMember(owner = "client!qb", name = "Z", descriptor = "Loc;")
    public static class99 field2744;

    @OriginalMember(owner = "client!qb", name = "ab", descriptor = "Z")
    public static boolean field2745;

    @OriginalMember(owner = "client!qb", name = "bb", descriptor = "Loc;")
    public static class99 field2746;

    @OriginalMember(owner = "client!qb", name = "cb", descriptor = "Loc;")
    public static class99 field2747;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
    public int field2715;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "I")
    public int field2717;

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "I")
    public int field2721;

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "I")
    public int field2722;

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "I")
    public int field2723;

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "I")
    public int field2727;

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "I")
    public int field2730;

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "I")
    public int field2732;

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "I")
    public int field2733;

    @OriginalMember(owner = "client!qb", name = "S", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!qb", name = "V", descriptor = "I")
    public int field2740;

    @OriginalMember(owner = "client!qb", name = "W", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!qb", name = "X", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "J")
    public static long field2720;

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "Lpc;")
    public static class105 field2734;

    @OriginalMember(owner = "client!qb", name = "U", descriptor = "Lcb;")
    public class16 field2739;

    @OriginalMember(owner = "client!qb", name = "Y", descriptor = "Lef;")
    public static class35 field2743;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "Lkc;")
    public class71 field2718;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "Lkc;")
    public class71 field2724;

    @OriginalMember(owner = "client!qb", name = "R", descriptor = "[I")
    public int[] field2736;

    @OriginalMember(owner = "client!qb", name = "T", descriptor = "[I")
    public static int[] field2738;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
    public static final void method941(int arg0) {
        class3.field51.method998(true);
        field2741++;
        if (arg0 != 1) {
            method945(false);
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V")
    public static final void method942(byte arg0) {
        field2725++;
        int var1 = class39.field965.method864(8, -25644);
        if (var1 < class101.field2446) {
            for (int var2 = var1; var2 < class101.field2446; var2++) {
                class140.field3471[class91.field2224++] = class67.field1729[var2];
            }
        }
        if (var1 > class101.field2446) {
            throw new RuntimeException("gppov1");
        }
        class101.field2446 = 0;
        int var3 = 0;
        if (arg0 != 64) {
            method942((byte) 38);
        }
        while (var1 > var3) {
            int var4 = class67.field1729[var3];
            class126 var5 = class59.field1571[var4];
            int var6 = class39.field965.method864(1, -25644);
            if (var6 == 0) {
                class67.field1729[class101.field2446++] = var4;
                var5.field3068 = class101.field2444;
            } else {
                int var7 = class39.field965.method864(2, -25644);
                if (var7 == 0) {
                    class67.field1729[class101.field2446++] = var4;
                    var5.field3068 = class101.field2444;
                    class126.field3041[class141.field3493++] = var4;
                } else if (var7 == 1) {
                    class67.field1729[class101.field2446++] = var4;
                    var5.field3068 = class101.field2444;
                    int var8 = class39.field965.method864(3, -25644);
                    var5.method1037(arg0 + 10, var8, false);
                    int var9 = class39.field965.method864(1, -25644);
                    if (var9 == 1) {
                        class126.field3041[class141.field3493++] = var4;
                    }
                } else if (var7 == 2) {
                    class67.field1729[class101.field2446++] = var4;
                    var5.field3068 = class101.field2444;
                    int var10 = class39.field965.method864(3, -25644);
                    var5.method1037(114, var10, true);
                    int var11 = class39.field965.method864(3, -25644);
                    var5.method1037(arg0 - 184, var11, true);
                    int var12 = class39.field965.method864(1, -25644);
                    if (var12 == 1) {
                        class126.field3041[class141.field3493++] = var4;
                    }
                } else if (var7 == 3) {
                    class140.field3471[class91.field2224++] = var4;
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILef;I)V")
    public static final void method943(int arg0, class35 arg1, int arg2) {
        if (arg2 != 0) {
            return;
        }
        field2742++;
        if (class3.field55 == null) {
            class39.method320(null, 255, 255, 0, (byte) 0, true, 1499);
            class145.field3627[arg0] = arg1;
        } else {
            class3.field55.field1477 = arg0 * 4 + 5;
            int var3 = class3.field55.method495(arg2 ^ 0xFF0000);
            arg1.method311(arg2 ^ 0xFF, var3);
        }
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
    public final void method944(int arg0) {
        if (arg0 != 1) {
            return;
        }
        field2726++;
        int var2 = this.field2717;
        class16 var3 = this.field2739.method157((byte) 126);
        if (var3 == null) {
            this.field2732 = 0;
            this.field2721 = 0;
            this.field2717 = -1;
            this.field2715 = 0;
            this.field2736 = null;
        } else {
            this.field2732 = var3.field439;
            this.field2717 = var3.field396;
            this.field2721 = var3.field397;
            this.field2715 = var3.field433 * 128;
            this.field2736 = var3.field384;
        }
        if (this.field2717 != var2 && this.field2724 != null) {
            class140.field3481.method96(this.field2724);
            this.field2724 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(Z)V")
    public static void method945(boolean arg0) {
        field2744 = null;
        field2716 = null;
        field2746 = null;
        if (!arg0) {
            method945(true);
        }
        field2734 = null;
        field2728 = null;
        field2747 = null;
        field2743 = null;
        field2738 = null;
        field2735 = null;
        field2713 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2728[var0] = var1;
        }
        field2744 = class48.method402((byte) -104, "chatback");
        field2745 = false;
        field2746 = class48.method402((byte) -104, "@cya@");
        field2747 = class48.method402((byte) -104, ": ");
    }
}
