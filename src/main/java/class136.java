import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class136 extends class26 {

    @OriginalMember(owner = "client!td", name = "db", descriptor = "Z")
    public boolean field3160 = false;

    @OriginalMember(owner = "client!td", name = "lb", descriptor = "I")
    private int field3168 = 0;

    @OriginalMember(owner = "client!td", name = "hb", descriptor = "I")
    private int field3164 = 0;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "I")
    public int field3151;

    @OriginalMember(owner = "client!td", name = "jb", descriptor = "I")
    public int field3166;

    @OriginalMember(owner = "client!td", name = "W", descriptor = "I")
    public int field3153;

    @OriginalMember(owner = "client!td", name = "qb", descriptor = "I")
    public int field3173;

    @OriginalMember(owner = "client!td", name = "ib", descriptor = "I")
    private int field3165;

    @OriginalMember(owner = "client!td", name = "mb", descriptor = "I")
    public int field3169;

    @OriginalMember(owner = "client!td", name = "Z", descriptor = "Lvc;")
    private class149 field3156;

    @OriginalMember(owner = "client!td", name = "bb", descriptor = "I")
    public static int field3158 = 0;

    @OriginalMember(owner = "client!td", name = "Y", descriptor = "I")
    public static int field3155 = 0;

    @OriginalMember(owner = "client!td", name = "ob", descriptor = "Lec;")
    public static class32 field3171 = class73.method594("nicht hergestellt werden)3", true);

    @OriginalMember(owner = "client!td", name = "T", descriptor = "Lec;")
    private static class32 field3150 = class73.method594("Please enter your password)3", true);

    @OriginalMember(owner = "client!td", name = "nb", descriptor = "Lec;")
    public static class32 field3170 = field3150;

    @OriginalMember(owner = "client!td", name = "rb", descriptor = "Lec;")
    public static class32 field3174 = class73.method594("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1", true);

    @OriginalMember(owner = "client!td", name = "V", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!td", name = "X", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!td", name = "ab", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!td", name = "eb", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!td", name = "fb", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!td", name = "gb", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!td", name = "kb", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!td", name = "cb", descriptor = "J")
    public static long field3159;

    @OriginalMember(owner = "client!td", name = "pb", descriptor = "Z")
    public static boolean field3172;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IBII)V")
    public static final void method1033(int arg0, byte arg1, int arg2, int arg3) {
        field3154++;
        if (arg2 < 128 || arg0 < 128 || arg2 > 13056 || arg0 > 13056) {
            class130.field3003 = -1;
            class89.field2057 = -1;
            return;
        }
        int var4 = class83.method654(-5736, class43.field990, arg2, arg0) - arg3;
        int var5 = arg0 - class48.field1127;
        int var6 = class7.field113[class45.field1050];
        int var7 = var4 - class73.field1720;
        if (arg1 <= 115) {
            return;
        }
        int var8 = class7.field121[class45.field1050];
        int var9 = class7.field113[class115.field2720];
        int var10 = class7.field121[class115.field2720];
        int var11 = arg2 - class105.field2496;
        int var12 = var5 * var9 + var10 * var11 >> 16;
        int var13 = var5 * var10 - var9 * var11 >> 16;
        int var15 = var7 * var8 - var6 * var13 >> 16;
        int var16 = var6 * var7 + var8 * var13 >> 16;
        if (var16 < 50) {
            class89.field2057 = -1;
            class130.field3003 = -1;
        } else {
            class130.field3003 = (var15 << 9) / var16 + 167;
            class89.field2057 = (var12 << 9) / var16 + 256;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIILh;I)V")
    public static final void method1034(int arg0, int arg1, int arg2, int arg3, class49 arg4, int arg5) {
        field3162++;
        if (arg4 == null) {
            return;
        }
        int var6 = class27.field493 + class133.field3056 & 0x7FF;
        int var7 = arg3 * arg3 + arg5 * arg5;
        if (var7 > 6400) {
            return;
        }
        if (arg0 != -2011) {
            method1034(-17, 121, 0, -81, null, -39);
        }
        int var8 = class7.field113[var6];
        int var9 = var8 * 256 / (class29.field527 + 256);
        int var10 = class7.field121[var6];
        int var11 = var10 * 256 / (class29.field527 + 256);
        int var12 = arg3 * var11 - arg5 * var9 >> 16;
        int var13 = arg3 * var9 + arg5 * var11 >> 16;
        if (var7 <= 2500) {
            arg4.method370(arg1 + var13 + 94 + 4 - arg4.field1139 / 2, -(arg4.field1141 / 2) - 4 + -var12 + arg2 + 83);
        } else {
            arg4.method372(class20.field369, arg1 + var13 + 94 + 4 - arg4.field1139 / 2, arg2 - var12 + 83 + -(arg4.field1141 / 2) + -4);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lec;Lea;ZLec;)Lhb;")
    public static final class51 method1035(class32 arg0, class30 arg1, boolean arg2, class32 arg3) {
        if (arg2) {
            method1036(null, null, (byte) -1);
        }
        field3163++;
        int var4 = arg1.method201(3, arg3);
        int var5 = arg1.method215(arg0, var4, true);
        return class1.method4(var5, var4, true, arg1);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lea;Lea;B)V")
    public static final void method1036(class30 arg0, class30 arg1, byte arg2) {
        class19.field363 = arg1;
        if (arg2 >= 111) {
            field3152++;
            class154.field3514 = arg0;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)V")
    public final void method1037(byte arg0, int arg1) {
        field3167++;
        int var3 = -86 / ((-arg0 - 39) / 61);
        if (this.field3160) {
            return;
        }
        this.field3164 += arg1;
        while (this.field3156.field3378[this.field3168] < this.field3164) {
            this.field3164 -= this.field3156.field3378[this.field3168];
            this.field3168++;
            if (this.field3156.field3395.length <= this.field3168) {
                this.field3160 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)Lod;")
    public final class101 method132(byte arg0) {
        field3161++;
        if (arg0 != 109) {
            this.field3168 = 50;
        }
        class133 var2 = class38.method317(this.field3165, 126);
        class101 var3;
        if (this.field3160) {
            var3 = var2.method1019(123, -1);
        } else {
            var3 = var2.method1019(arg0 + 17, this.field3168);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(B)V")
    public static void method1038(byte arg0) {
        field3174 = null;
        field3150 = null;
        if (arg0 <= -65) {
            field3170 = null;
            field3171 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(IIIIIII)V")
    public class136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3151 = arg1;
        this.field3166 = arg2;
        this.field3153 = arg5 + arg6;
        this.field3173 = arg3;
        this.field3165 = arg0;
        this.field3169 = arg4;
        int var8 = class38.method317(this.field3165, 126).field3098;
        if (var8 == -1) {
            this.field3160 = true;
        } else {
            this.field3160 = false;
            this.field3156 = class97.method762((byte) 121, var8);
        }
    }
}
