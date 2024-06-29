import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class31 extends class19 {

    @OriginalMember(owner = "client!eb", name = "Z", descriptor = "Z")
    public boolean field652 = false;

    @OriginalMember(owner = "client!eb", name = "lb", descriptor = "[I")
    private int[] field664 = new int[6];

    @OriginalMember(owner = "client!eb", name = "jb", descriptor = "I")
    public int field662 = -1;

    @OriginalMember(owner = "client!eb", name = "rb", descriptor = "[I")
    private int[] field670 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!eb", name = "tb", descriptor = "[I")
    private int[] field672 = new int[6];

    @OriginalMember(owner = "client!eb", name = "X", descriptor = "[J")
    public static long[] field650 = new long[200];

    @OriginalMember(owner = "client!eb", name = "bb", descriptor = "Led;")
    public static class33 field654 = null;

    @OriginalMember(owner = "client!eb", name = "ib", descriptor = "Lkc;")
    private static class67 field661 = class19.method144("Loaded wordpack", 78);

    @OriginalMember(owner = "client!eb", name = "eb", descriptor = "Lkc;")
    public static class67 field657 = field661;

    @OriginalMember(owner = "client!eb", name = "cb", descriptor = "[I")
    public static int[] field655 = new int[5];

    @OriginalMember(owner = "client!eb", name = "qb", descriptor = "[J")
    public static long[] field669 = new long[32];

    @OriginalMember(owner = "client!eb", name = "fb", descriptor = "Lwd;")
    public static class140 field658 = new class140(new byte[5000]);

    @OriginalMember(owner = "client!eb", name = "ub", descriptor = "Lkc;")
    public static class67 field673 = class19.method144("weiss:", 69);

    @OriginalMember(owner = "client!eb", name = "vb", descriptor = "I")
    public static int field674 = 0;

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!eb", name = "Y", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!eb", name = "db", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!eb", name = "gb", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!eb", name = "hb", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!eb", name = "kb", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!eb", name = "mb", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!eb", name = "nb", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!eb", name = "ob", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!eb", name = "pb", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!eb", name = "sb", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "Lnd;")
    public static class86 field649;

    @OriginalMember(owner = "client!eb", name = "ab", descriptor = "[I")
    private int[] field653;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BILwd;)V", line = 6)
    private final void method262(byte arg0, int arg1, class140 arg2) {
        field671++;
        if (arg0 != -89) {
            field654 = null;
        }
        if (arg1 == 1) {
            this.field662 = arg2.method1105(arg0 ^ 0xFFFFFF58);
        } else if (arg1 == 2) {
            int var4 = arg2.method1105(arg0 ^ 0xFFFFFF58);
            this.field653 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field653[var5] = arg2.method1072(class63.method487(arg0, -24));
            }
        } else if (arg1 == 3) {
            this.field652 = true;
        } else if (arg1 >= 40 && arg1 < 50) {
            this.field672[arg1 - 40] = arg2.method1072(70);
        } else if (arg1 >= 50 && arg1 < 60) {
            this.field664[arg1 - 50] = arg2.method1072(arg0 + 179);
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field670[arg1 - 60] = arg2.method1072(class63.method487(arg0, -88));
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BIILac;)[Lab;", line = 58)
    public static final class3[] method263(byte arg0, int arg1, int arg2, class4 arg3) {
        if (arg0 <= 85) {
            return null;
        } else {
            field659++;
            return class19.method151((byte) -88, arg3, arg2, arg1) ? class137.method1064(-9667) : null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)Lfd;", line = 79)
    public final class39 method264(byte arg0) {
        field667++;
        class39[] var2 = new class39[5];
        int var3 = 0;
        if (arg0 < 110) {
            field660 = -73;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field670[var4] != -1) {
                var2[var3++] = class39.method332(class58.field1370, this.field670[var4], 0);
            }
        }
        class39 var5 = new class39(var2, var3);
        for (int var6 = 0; var6 < 6 && this.field672[var6] != 0; var6++) {
            var5.method337(this.field672[var6], this.field664[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "(I)Lfd;", line = 120)
    public final class39 method265(int arg0) {
        field665++;
        if (this.field653 == null) {
            return null;
        }
        class39[] var2 = new class39[this.field653.length];
        for (int var3 = arg0; var3 < this.field653.length; var3++) {
            var2[var3] = class39.method332(class58.field1370, this.field653[var3], 0);
        }
        class39 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class39(var2, var2.length);
        }
        for (int var5 = 0; var5 < 6 && this.field672[var5] != 0; var5++) {
            var4.method337(this.field672[var5], this.field664[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "(I)Z", line = 179)
    public final boolean method266(int arg0) {
        field666++;
        if (this.field653 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != 1745596848) {
            field658 = null;
        }
        for (int var3 = 0; var3 < this.field653.length; var3++) {
            if (!class58.field1370.method33(this.field653[var3], (byte) -118, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)V", line = 205)
    public static void method267(byte arg0) {
        field669 = null;
        int var1 = 63 % ((40 - arg0) / 47);
        field658 = null;
        field661 = null;
        field673 = null;
        field657 = null;
        field654 = null;
        field650 = null;
        field655 = null;
        field649 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILwd;)V", line = 229)
    public final void method268(int arg0, class140 arg1) {
        if (arg0 != -31031) {
            this.method269(-8);
        }
        field651++;
        while (true) {
            int var3 = arg1.method1105(255);
            if (var3 == 0) {
                return;
            }
            this.method262((byte) -89, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "(I)Z", line = 249)
    public final boolean method269(int arg0) {
        boolean var2 = true;
        for (int var3 = arg0; var3 < 5; var3++) {
            if (this.field670[var3] != -1 && !class58.field1370.method33(this.field670[var3], (byte) -98, 0)) {
                var2 = false;
            }
        }
        field648++;
        return var2;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BIII)V", line = 276)
    public static final void method270(byte arg0, int arg1, int arg2, int arg3) {
        field656++;
        if (arg2 < 128 || arg3 < 128 || arg2 > 13056 || arg3 > 13056) {
            class66.field1554 = -1;
            class45.field1096 = -1;
        } else if (arg0 == 58) {
            int var4 = class70.method575(arg3, arg0 - 57, arg2, class112.field2593) - arg1;
            int var5 = arg3 - class74.field1776;
            int var6 = class39.field951[class116.field2737];
            int var7 = class39.field941[class116.field2737];
            int var8 = var4 - class133.field3164;
            int var9 = class39.field951[class65.field1535];
            int var10 = arg2 - class127.field2980;
            int var11 = class39.field941[class65.field1535];
            int var12 = var5 * var9 + var10 * var11 >> 16;
            int var13 = var5 * var11 - var9 * var10 >> 16;
            int var15 = var7 * var8 - var6 * var13 >> 16;
            int var16 = var6 * var8 + var7 * var13 >> 16;
            if (var16 < 50) {
                class45.field1096 = -1;
                class66.field1554 = -1;
            } else {
                class66.field1554 = (var15 << 9) / var16 + 167;
                class45.field1096 = (var12 << 9) / var16 + 256;
            }
        }
    }
}
