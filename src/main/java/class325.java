import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public abstract class class325 {

    @OriginalMember(owner = "client!bp", name = "i", descriptor = "Z")
    public boolean field5094 = true;

    @OriginalMember(owner = "client!bp", name = "m", descriptor = "Z")
    public boolean field5098 = false;

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
    public int field5089 = 0;

    @OriginalMember(owner = "client!bp", name = "r", descriptor = "Z")
    public boolean field5103 = true;

    @OriginalMember(owner = "client!bp", name = "k", descriptor = "Z")
    public boolean field5096 = true;

    @OriginalMember(owner = "client!bp", name = "o", descriptor = "Z")
    public boolean field5100 = true;

    @OriginalMember(owner = "client!bp", name = "h", descriptor = "I")
    public int field5093 = 0;

    @OriginalMember(owner = "client!bp", name = "p", descriptor = "Z")
    public boolean field5101 = true;

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
    public int field5087 = 255;

    @OriginalMember(owner = "client!bp", name = "z", descriptor = "Z")
    public boolean field5111 = true;

    @OriginalMember(owner = "client!bp", name = "j", descriptor = "I")
    public int field5095 = 2;

    @OriginalMember(owner = "client!bp", name = "n", descriptor = "I")
    public int field5099 = 0;

    @OriginalMember(owner = "client!bp", name = "C", descriptor = "I")
    public int field5113 = 0;

    @OriginalMember(owner = "client!bp", name = "s", descriptor = "I")
    public int field5104 = 0;

    @OriginalMember(owner = "client!bp", name = "E", descriptor = "Z")
    public boolean field5115 = false;

    @OriginalMember(owner = "client!bp", name = "t", descriptor = "Z")
    public boolean field5105 = true;

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
    public int field5091 = 2;

    @OriginalMember(owner = "client!bp", name = "J", descriptor = "I")
    public int field5120 = 2;

    @OriginalMember(owner = "client!bp", name = "L", descriptor = "Z")
    public boolean field5122 = true;

    @OriginalMember(owner = "client!bp", name = "u", descriptor = "I")
    public int field5106 = 1;

    @OriginalMember(owner = "client!bp", name = "I", descriptor = "I")
    public int field5119 = 127;

    @OriginalMember(owner = "client!bp", name = "K", descriptor = "I")
    public int field5121 = 127;

    @OriginalMember(owner = "client!bp", name = "w", descriptor = "I")
    public int field5108 = 3;

    @OriginalMember(owner = "client!bp", name = "B", descriptor = "Z")
    public boolean field5112 = true;

    @OriginalMember(owner = "client!bp", name = "O", descriptor = "Z")
    public boolean field5125 = false;

    @OriginalMember(owner = "client!bp", name = "M", descriptor = "Z")
    public boolean field5123 = true;

    @OriginalMember(owner = "client!bp", name = "x", descriptor = "Z")
    public boolean field5109 = true;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
    public int field5086 = 0;

    @OriginalMember(owner = "client!bp", name = "D", descriptor = "I")
    public int field5114 = 2;

    @OriginalMember(owner = "client!bp", name = "N", descriptor = "I")
    public int field5124 = 0;

    @OriginalMember(owner = "client!bp", name = "H", descriptor = "Z")
    public boolean field5118 = true;

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "[J")
    public static long[] field5088 = new long[100];

    @OriginalMember(owner = "client!bp", name = "v", descriptor = "I")
    public static int field5107 = 0;

    @OriginalMember(owner = "client!bp", name = "q", descriptor = "J")
    public static long field5102 = 0L;

    @OriginalMember(owner = "client!bp", name = "P", descriptor = "[[I")
    public static int[][] field5126 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!bp", name = "l", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!bp", name = "y", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!bp", name = "G", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!bp", name = "R", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "Z")
    public boolean field5092;

    @OriginalMember(owner = "client!bp", name = "F", descriptor = "Z")
    public boolean field5116;

    @OriginalMember(owner = "client!bp", name = "Q", descriptor = "Z")
    public boolean field5127;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZII)V")
    public final void method2040(boolean arg0, int arg1, int arg2) {
        if (arg2 == 1 || arg2 == 3) {
            this.field5091 = arg1;
        } else {
            this.field5086 = arg1;
        }
        if (arg0) {
            field5097++;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)I")
    public final int method2041(int arg0, int arg1) {
        int var3 = 42 % ((arg0 - 84) / 34);
        field5090++;
        return arg1 == 1 || arg1 == 3 ? this.field5091 : this.field5086;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
    public static void method2042(int arg0) {
        field5126 = null;
        field5088 = null;
        if (arg0 != 0) {
            method2044(-92, -86, -108, 118, true, 120, 26, -48, -0.16547583F);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZZI)V")
    public final void method2043(boolean arg0, boolean arg1, int arg2) {
        field5128++;
        if (!arg0) {
            this.method2040(true, 85, -33);
        }
        if (arg2 == 1 || arg2 == 3) {
            this.field5127 = arg1;
        } else {
            this.field5092 = arg1;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIIZIIIF)[[I")
    public static final int[][] method2044(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, float arg8) {
        field5110++;
        if (arg3 > -121) {
            method2042(69);
        }
        int[][] var9 = new int[arg2][arg1];
        class65 var10 = new class65();
        var10.field974 = arg7;
        var10.field960 = arg5;
        var10.field959 = (int) (arg8 * 4096.0F);
        var10.field966 = arg6;
        var10.field957 = arg4;
        var10.method74(12388);
        class34.method258(-76, arg2, arg1);
        for (int var11 = 0; var11 < arg2; var11++) {
            var10.method425(var9[var11], -22048, var11);
        }
        return var9;
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(II)Z")
    public final boolean method2045(int arg0, int arg1) {
        if (arg0 == 4) {
            field5117++;
            return arg1 == 1 || arg1 == 3 ? this.field5127 : this.field5092;
        } else {
            return true;
        }
    }
}
