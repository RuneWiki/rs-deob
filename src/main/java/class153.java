import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class153 extends class152 {

    @OriginalMember(owner = "client!he", name = "U", descriptor = "Lce;")
    private static class126 field2797 = class206.method1445(-7923, "Drop");

    @OriginalMember(owner = "client!he", name = "W", descriptor = "Lce;")
    public static class126 field2799 = field2797;

    @OriginalMember(owner = "client!he", name = "Y", descriptor = "Lce;")
    public static class126 field2801 = class206.method1445(-7923, "huffman");

    @OriginalMember(owner = "client!he", name = "V", descriptor = "Lce;")
    public static class126 field2798 = class206.method1445(-7923, "violet:");

    @OriginalMember(owner = "client!he", name = "bb", descriptor = "Lce;")
    public static class126 field2804 = class206.method1445(-7923, "Card:");

    @OriginalMember(owner = "client!he", name = "db", descriptor = "Lce;")
    public static class126 field2806 = class206.method1445(-7923, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!he", name = "R", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!he", name = "T", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!he", name = "X", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!he", name = "Z", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!he", name = "ab", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!he", name = "cb", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!he", name = "S", descriptor = "Lcc;")
    public static class313 field2795;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZI)[I", line = 6)
    public final int[] method6(boolean arg0, int arg1) {
        field2794++;
        if (!arg0) {
            return (int[]) null;
        }
        int[] var3 = this.field2776.method1799((byte) 107, arg1);
        if (this.field2776.field4516) {
            for (int var4 = 0; var4 < class244.field4133; var4++) {
                this.method1138(-2048, var4, arg1);
                int[] var5 = this.method1132(class175.field3098, -88, 0);
                var3[var4] = var5[class282.field4700];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(II)[[I", line = 57)
    public final int[][] method26(int arg0, int arg1) {
        field2796++;
        if (arg0 != 0) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field2775.method319(76, arg1);
        if (this.field2775.field775) {
            int[] var4 = var3[2];
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            for (int var7 = 0; var7 < class244.field4133; var7++) {
                this.method1138(-2048, var7, arg1);
                int[][] var8 = this.method1133(class175.field3098, 0, true);
                var6[var7] = var8[0][class282.field4700];
                var5[var7] = var8[1][class282.field4700];
                var4[var7] = var8[2][class282.field4700];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(B)V", line = 96)
    public static void method1136(byte arg0) {
        field2801 = null;
        field2804 = null;
        field2799 = null;
        field2797 = null;
        field2806 = null;
        field2795 = null;
        field2798 = null;
        if (arg0 >= -106) {
            method1137((byte) -27, -78, -56, (class126[]) null);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IILbb;)V", line = 113)
    public final void method5(int arg0, int arg1, class134 arg2) {
        field2803++;
        if (arg1 == 0) {
            this.field2781 = arg2.method948(-125) == 1;
        }
        if (arg0 != 8) {
            field2797 = (class126) null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BII[Lce;)Lce;", line = 127)
    public static final class126 method1137(byte arg0, int arg1, int arg2, class126[] arg3) {
        field2805++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg3[arg2 + var5] == null) {
                arg3[arg2 + var5] = class174.field3071;
            }
            var4 += arg3[arg2 + var5].field2140;
        }
        if (arg0 != -73) {
            field2795 = (class313) null;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg1; var8++) {
            class126 var9 = arg3[arg2 + var8];
            class230.method1562(var9.field2158, 0, var6, var7, var9.field2140);
            var7 += var9.field2140;
        }
        class126 var10 = new class126();
        var10.field2158 = var6;
        var10.field2140 = var4;
        return var10;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(III)V", line = 176)
    private final void method1138(int arg0, int arg1, int arg2) {
        field2802++;
        int var4 = class29.field406[arg1];
        int var5 = class122.field2038[arg2];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (arg0 + var5));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class282.field4700 = arg1;
            class175.field3098 = arg2;
        } else if (-1.5707963267948966D >= (double) var6 && (double) var6 >= -2.356194490192345D) {
            class175.field3098 = arg1;
            class282.field4700 = arg2;
        } else if (-0.7853981633974483D >= (double) var6 && (double) var6 >= -1.5707963267948966D) {
            class282.field4700 = class244.field4133 - arg2;
            class175.field3098 = arg1;
        } else if (var6 <= 0.0F && -0.7853981633974483D <= (double) var6) {
            class282.field4700 = arg1;
            class175.field3098 = class143.field2599 - arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class175.field3098 = class143.field2599 - arg2;
            class282.field4700 = class244.field4133 - arg1;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class282.field4700 = class244.field4133 - arg2;
            class175.field3098 = class143.field2599 - arg1;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class282.field4700 = arg2;
            class175.field3098 = class143.field2599 - arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class175.field3098 = arg2;
            class282.field4700 = class244.field4133 - arg1;
        }
        class175.field3098 &= class314.field5378;
        class282.field4700 &= class321.field5490;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZI)I", line = 251)
    public static final int method1139(int arg0, boolean arg1, int arg2) {
        field2800++;
        int var3 = arg0 >>> 31;
        return arg1 ? 21 : (arg0 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V", line = 264)
    public class153() {
        super(1, false);
    }
}
