import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class130 extends class107 {

    @OriginalMember(owner = "client!vd", name = "cb", descriptor = "Lab;")
    public static class3 field3151 = new class3();

    @OriginalMember(owner = "client!vd", name = "nb", descriptor = "[[B")
    public static byte[][] field3162 = new byte[1000][];

    @OriginalMember(owner = "client!vd", name = "hb", descriptor = "Lrc;")
    public static class105 field3156 = class43.method374("huffman", 0);

    @OriginalMember(owner = "client!vd", name = "lb", descriptor = "I")
    public static int field3160 = 0;

    @OriginalMember(owner = "client!vd", name = "qb", descriptor = "Z")
    public static boolean field3165 = false;

    @OriginalMember(owner = "client!vd", name = "Z", descriptor = "I")
    public int field3148;

    @OriginalMember(owner = "client!vd", name = "ab", descriptor = "I")
    public int field3149;

    @OriginalMember(owner = "client!vd", name = "bb", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!vd", name = "db", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!vd", name = "eb", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!vd", name = "ib", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!vd", name = "jb", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!vd", name = "pb", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!vd", name = "sb", descriptor = "I")
    public int field3167;

    @OriginalMember(owner = "client!vd", name = "vb", descriptor = "I")
    public int field3170;

    @OriginalMember(owner = "client!vd", name = "fb", descriptor = "Lbd;")
    public static class11 field3154;

    @OriginalMember(owner = "client!vd", name = "tb", descriptor = "Lfc;")
    public static class34 field3168;

    @OriginalMember(owner = "client!vd", name = "mb", descriptor = "Lkb;")
    public static class62 field3161;

    @OriginalMember(owner = "client!vd", name = "ob", descriptor = "Lmd;")
    public static class76 field3163;

    @OriginalMember(owner = "client!vd", name = "ub", descriptor = "Ljava/awt/Font;")
    public static Font field3169;

    @OriginalMember(owner = "client!vd", name = "gb", descriptor = "[I")
    public int[] field3155;

    @OriginalMember(owner = "client!vd", name = "kb", descriptor = "[I")
    public int[] field3159;

    @OriginalMember(owner = "client!vd", name = "rb", descriptor = "[Lrc;")
    public class105[] field3166;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lte;I)Z", line = 21)
    public static final boolean method1041(class119 arg0, int arg1) {
        field3158++;
        int var2 = arg0.field2847;
        if (arg1 != 15131) {
            return true;
        } else if (var2 >= 1 && var2 <= 200 || !(var2 < 701 || var2 > 900)) {
            class1.field3++;
            if (var2 >= 801) {
                var2 -= 701;
            } else if (var2 >= 701) {
                var2 -= 601;
            } else if (var2 >= 101) {
                var2 -= 101;
            } else {
                var2--;
            }
            class107.field2443++;
            class105.method832(27, 0, 0, (byte) 120, class108.method878(new class105[] { class90.field2060, class86.field1938[var2] }, 2867), class121.field2937, 0);
            class105.method832(12, 0, 0, (byte) 127, class108.method878(new class105[] { class90.field2060, class86.field1938[var2] }, 2867), class23.field567, 0);
            return true;
        } else if (var2 >= 401 && var2 <= 500) {
            class107.field2444++;
            class105.method832(57, 0, 0, (byte) 123, class108.method878(new class105[] { class90.field2060, arg0.field2864 }, 2867), class121.field2937, 0);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "(I)V", line = 75)
    public static void method1042(int arg0) {
        field3154 = null;
        field3151 = null;
        field3163 = null;
        field3162 = null;
        field3168 = null;
        field3169 = null;
        if (arg0 == -201) {
            field3161 = null;
            field3156 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(III)I", line = 95)
    public static final int method1043(int arg0, int arg1, int arg2) {
        field3150++;
        if (arg0 == 30468) {
            long var3 = (long) ((arg1 << 16) + arg2);
            return class3.field34 != null && class3.field34.field1448 == var3 ? class93.field2175.field143 * 99 / (class93.field2175.field117.length - class3.field34.field2483) + 1 : 0;
        } else {
            return -119;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I[BZ)I", line = 115)
    public static final int method1044(int arg0, byte[] arg1, boolean arg2) {
        field3164++;
        return arg2 ? class14.method157(0, 1576238408, arg0, arg1) : 30;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(Z)V", line = 133)
    public static final void method1045(boolean arg0) {
        int var1 = class51.field1075;
        field3153++;
        int var2 = class74.field1654;
        int var3 = class10.field199;
        int var4 = 6116423;
        int var5 = class116.field2723;
        class69.method580(var1, var3, var5, var2, var4);
        class69.method580(var1 + 1, var3 + 1, var5 - 2, 16, 0);
        class69.method588(var1 + 1, var3 + 18, var5 - 2, var2 - 19, 0);
        class100.field2285.method664(class102.field2322, var1 + 3, var3 + 14, var4);
        if (arg0) {
            field3163 = null;
        }
        int var6 = class75.field1664;
        int var7 = class35.field816;
        if (class1.field13 == 0) {
            var7 -= 4;
            var6 -= 4;
        }
        if (class1.field13 == 1) {
            var6 -= 553;
            var7 -= 205;
        }
        if (class1.field13 == 2) {
            var6 -= 17;
            var7 -= 357;
        }
        for (int var8 = 0; var8 < class113.field2652; var8++) {
            int var9 = 16777215;
            int var10 = var3 + (class113.field2652 + -1 + -var8) * 15 + 31;
            if (var6 > var1 && var1 + var5 > var6 && var10 - 13 < var7 && var10 + 3 > var7) {
                var9 = 16776960;
            }
            class100.field2285.method658(class95.field2197[var8], var1 + 3, var10, var9, true);
        }
    }
}
