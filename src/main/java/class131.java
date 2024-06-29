import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class131 extends class31 {

    @OriginalMember(owner = "client!sf", name = "T", descriptor = "I")
    public int field2965 = 0;

    @OriginalMember(owner = "client!sf", name = "cb", descriptor = "Z")
    public boolean field2974 = true;

    @OriginalMember(owner = "client!sf", name = "hb", descriptor = "I")
    public int field2979 = -1;

    @OriginalMember(owner = "client!sf", name = "eb", descriptor = "I")
    public int field2976 = -1;

    @OriginalMember(owner = "client!sf", name = "ab", descriptor = "[[B")
    public static byte[][] field2972 = new byte[50][];

    @OriginalMember(owner = "client!sf", name = "S", descriptor = "Lqd;")
    public static class115 field2964 = new class115(64);

    @OriginalMember(owner = "client!sf", name = "ib", descriptor = "Lid;")
    private static class60 field2980 = class11.method72("red:", (byte) -30);

    @OriginalMember(owner = "client!sf", name = "jb", descriptor = "Lid;")
    public static class60 field2981 = class11.method72("oder benutzen Sie eine andere Welt)3", (byte) 95);

    @OriginalMember(owner = "client!sf", name = "ob", descriptor = "Lid;")
    public static class60 field2986 = class11.method72("<col=ff9040>", (byte) 104);

    @OriginalMember(owner = "client!sf", name = "kb", descriptor = "I")
    public static int field2982 = 0;

    @OriginalMember(owner = "client!sf", name = "pb", descriptor = "Lid;")
    public static class60 field2987 = field2980;

    @OriginalMember(owner = "client!sf", name = "lb", descriptor = "Z")
    public static boolean field2983 = false;

    @OriginalMember(owner = "client!sf", name = "nb", descriptor = "Lid;")
    public static class60 field2985 = field2980;

    @OriginalMember(owner = "client!sf", name = "U", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!sf", name = "V", descriptor = "I")
    public int field2967;

    @OriginalMember(owner = "client!sf", name = "W", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!sf", name = "X", descriptor = "I")
    public int field2969;

    @OriginalMember(owner = "client!sf", name = "Y", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!sf", name = "Z", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!sf", name = "bb", descriptor = "I")
    public int field2973;

    @OriginalMember(owner = "client!sf", name = "db", descriptor = "I")
    public int field2975;

    @OriginalMember(owner = "client!sf", name = "gb", descriptor = "I")
    public int field2978;

    @OriginalMember(owner = "client!sf", name = "mb", descriptor = "I")
    public int field2984;

    @OriginalMember(owner = "client!sf", name = "fb", descriptor = "Lie;")
    public static class61 field2977;

    @OriginalMember(owner = "client!sf", name = "qb", descriptor = "[[B")
    public static byte[][] field2988;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIILof;)V")
    private final void method1034(int arg0, int arg1, int arg2, class103 arg3) {
        if (arg0 == 1) {
            this.field2965 = arg3.method805(3);
        } else if (arg0 == 2) {
            this.field2979 = arg3.method829((byte) -123);
        } else if (arg0 == 5) {
            this.field2974 = false;
        } else if (arg0 == 7) {
            this.field2976 = arg3.method805(3);
        }
        field2971++;
        int var5 = 51 % ((-arg2 - 65) / 41);
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)V")
    public final void method1035(int arg0) {
        field2966++;
        if (this.field2976 != -1) {
            this.method1038(26046, this.field2976);
            this.field2975 = this.field2969;
            this.field2984 = this.field2978;
            this.field2973 = this.field2967;
        }
        int var2 = -121 / ((arg0 + 44) / 46);
        this.method1038(26046, this.field2965);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILof;)V")
    public final void method1036(int arg0, int arg1, class103 arg2) {
        field2968++;
        while (true) {
            int var4 = arg2.method829((byte) 58);
            if (var4 == 0) {
                int var5 = -44 % ((arg0 - 39) / 47);
                return;
            }
            this.method1034(var4, arg1, -108, arg2);
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)V")
    public static void method1037(byte arg0) {
        field2985 = null;
        field2972 = null;
        field2977 = null;
        field2980 = null;
        field2981 = null;
        field2964 = null;
        field2988 = null;
        int var1 = -82 % ((arg0 + 4) / 57);
        field2986 = null;
        field2987 = null;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)V")
    private final void method1038(int arg0, int arg1) {
        field2970++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 > var3) {
            var9 = var5;
        }
        if (var9 < var7) {
            var9 = var7;
        }
        double var11 = 0.0D;
        double var13 = 0.0D;
        double var15 = var3;
        if (var5 < var3) {
            var15 = var5;
        }
        if (var7 < var15) {
            var15 = var7;
        }
        double var17 = (var9 + var15) / 2.0D;
        this.field2967 = (int) (var17 * 256.0D);
        if (this.field2967 < 0) {
            this.field2967 = 0;
        } else if (this.field2967 > 255) {
            this.field2967 = 255;
        }
        if (var9 != var15) {
            if (var17 < 0.5D) {
                var13 = (var9 - var15) / (var9 + var15);
            }
            if (var3 == var9) {
                var11 = (var5 - var7) / (-var15 + var9);
            } else if (var5 == var9) {
                var11 = (var7 - var3) / (var9 - var15) + 2.0D;
            } else if (var7 == var9) {
                var11 = (var3 - var5) / (var9 - var15) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var13 = (var9 - var15) / (2.0D - var9 - var15);
            }
        }
        this.field2978 = (int) (var13 * 256.0D);
        double var19 = var11 / 6.0D;
        if (arg0 != 26046) {
            this.method1038(24, -31);
        }
        this.field2969 = (int) (var19 * 256.0D);
        if (this.field2978 < 0) {
            this.field2978 = 0;
        } else if (this.field2978 > 255) {
            this.field2978 = 255;
            return;
        }
    }
}
