import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class172 extends class107 {

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public int field2807;

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
    public int field2823;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "Ldf;")
    public static class51 field2814 = class46.method233("www)2wtrc", 100);

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "I")
    public static int field2815 = 0;

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "Z")
    public static boolean field2812 = false;

    @OriginalMember(owner = "client!ed", name = "I", descriptor = "Ldf;")
    public static class51 field2819 = class46.method233("(U2", 100);

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "I")
    public static int field2824 = 0;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "Ldf;")
    public static class51 field2813 = class46.method233("overlay", 100);

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
    public static int field2822 = 0;

    @OriginalMember(owner = "client!ed", name = "P", descriptor = "[I")
    public static int[] field2826 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "B")
    public static byte field2811;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "[I")
    public static int[] field2808;

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "[I")
    public static int[] field2825;

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "[[[B")
    public static byte[][][] field2817;

    @OriginalMember(owner = "client!ed", name = "J", descriptor = "[[[I")
    public static int[][][] field2820;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V")
    public static void method1205(int arg0) {
        field2826 = null;
        field2813 = null;
        if (arg0 != -23274) {
            method1208((byte) 125, (class36) null);
        }
        field2817 = null;
        field2820 = null;
        field2825 = null;
        field2819 = null;
        field2808 = null;
        field2814 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZB)I")
    public static final int method1206(boolean arg0, byte arg1) {
        if (arg1 != -104) {
            return -33;
        }
        long var2 = class7.method31((byte) -88);
        field2816++;
        for (class84 var4 = arg0 ? (class84) class189.field3158.method1451(93) : (class84) class189.field3158.method1449(-1); var4 != null; var4 = (class84) class189.field3158.method1449(arg1 ^ 0x67)) {
            if (var2 > (var4.field1413 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field1413 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field1760;
                    class30.field439[var5] = class139.field2335[var5];
                    var4.method764((byte) -48);
                    return var5;
                }
                var4.method764((byte) -84);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIII)V")
    public static final void method1207(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class95.field1575.field2026 = 0;
        field2821++;
        class95.field1575.method919(arg3 - 4742, 100);
        class95.field1575.method919(arg3 - 4742, arg1);
        class95.field1575.method919(-4742, arg0);
        class95.field1575.method895(-49, arg4);
        class95.field1575.method895(-124, arg2);
        class130.field2185 = 0;
        class181.field2987 = -3;
        class210.field3497 = 1;
        class144.field2403 = arg3;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLuc;)V")
    public static final void method1208(byte arg0, class36 arg1) {
        field2818++;
        long var2 = 0L;
        if (arg1.field551 == 0) {
            var2 = class75.method542(arg1.field548, arg1.field543, arg1.field552);
        }
        if (arg1.field551 == 1) {
            var2 = class7.method32(arg1.field548, arg1.field543, arg1.field552);
        }
        if (arg1.field551 == 2) {
            var2 = class98.method726(arg1.field548, arg1.field543, arg1.field552);
        }
        if (arg1.field551 == 3) {
            var2 = class45.method230(arg1.field548, arg1.field543, arg1.field552);
        }
        if (arg0 != -19) {
            field2825 = null;
        }
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (var2 != 0L) {
            var4 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
            var5 = (int) var2 >> 14 & 0x1F;
            var6 = ((int) var2 & 0x3AE342) >> 20;
        }
        arg1.field541 = var6;
        arg1.field540 = var5;
        arg1.field553 = var4;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)V")
    public static final void method1209(int arg0, int arg1, int arg2) {
        field2810++;
        if (class49.field767 != arg1) {
            class211.field3510 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class211.field3510[var3] = (var3 << 12) / arg1;
            }
            class170.field2785 = arg1 == 64 ? 2048 : 4096;
            class49.field767 = arg1;
            class135.field2245 = arg1 - 1;
        }
        if (class234.field4079 != arg0) {
            if (class49.field767 == arg0) {
                class161.field2639 = class211.field3510;
            } else {
                class161.field2639 = new int[arg0];
                for (int var4 = 0; var4 < arg0; var4++) {
                    class161.field2639[var4] = (var4 << 12) / arg0;
                }
            }
            class214.field3717 = arg0 - 1;
            class234.field4079 = arg0;
        }
        if (arg2 > -72) {
            method1206(false, (byte) -66);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[I)[I")
    public static final int[] method1210(int arg0, int[] arg1) {
        field2809++;
        if (arg1 == null) {
            return null;
        }
        int[] var2 = new int[arg1.length];
        if (arg0 == 80) {
            class256.method1744(arg1, 0, var2, 0, arg1.length);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(II)V")
    public class172(int arg0, int arg1) {
        this.field2807 = arg1;
        this.field2823 = arg0;
    }
}
