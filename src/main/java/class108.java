import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class108 {

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "Z")
    public boolean field2244 = true;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public int field2252;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public int field2238;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    public int field2256;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public int field2240;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public int field2235;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public int field2243;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static volatile int field2245 = -1;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public static int field2249 = 0;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "Lma;")
    public static class114 field2241 = new class114();

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "Lrf;")
    public static class163 field2253 = class53.method392(-123, "mod_icons");

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "Lrf;")
    private static class163 field2257 = class53.method392(-116, "Members object");

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "Lrf;")
    public static class163 field2259 = class53.method392(-86, "Das ist eine Mitglieder)2Welt(Q");

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "Lrf;")
    public static class163 field2255 = field2257;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "Lu;")
    public static class184 field2251;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "Lu;")
    public static class184 field2258;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "Lue;")
    public static class189 field2246;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "Ljava/lang/String;")
    public static String field2254;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "[I")
    public static int[] field2236;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "[I")
    public static int[] field2242;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static void method727(int arg0) {
        field2246 = null;
        field2251 = null;
        field2253 = null;
        field2241 = null;
        field2254 = null;
        field2258 = null;
        field2255 = null;
        field2257 = null;
        if (arg0 == 4748) {
            field2242 = null;
            field2259 = null;
            field2236 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lrf;ILfa;)I")
    public static final int method728(class163 arg0, int arg1, class52 arg2) {
        field2239++;
        if (arg1 >= -60) {
            field2249 = -62;
        }
        int var3 = arg2.field1033;
        arg2.method352((byte) -20, arg0.field3341);
        arg2.field1033 += class122.field2578.method1138(arg2.field1054, 0, arg2.field1033, (byte) 80, arg0.field3341, arg0.field3320);
        return arg2.field1033 - var3;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILde;)V")
    public static final void method729(int arg0, class36 arg1) {
        field2250++;
        if (arg1.field717 == 0) {
            return;
        }
        if (arg1.field740 != -1 && arg1.field740 < 32768) {
            class70 var2 = class187.field3723[arg1.field740];
            if (var2 != null) {
                int var3 = arg1.field716 - var2.field716;
                int var4 = arg1.field679 - var2.field679;
                if (var3 != 0 || var4 != 0) {
                    arg1.field737 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field740 >= 32768) {
            int var5 = arg1.field740 - 32768;
            if (class200.field3962 == var5) {
                var5 = 2047;
            }
            class38 var6 = class121.field2553[var5];
            if (var6 != null) {
                int var7 = arg1.field679 - var6.field679;
                int var8 = arg1.field716 - var6.field716;
                if (var8 != 0 || var7 != 0) {
                    arg1.field737 = (int) (Math.atan2((double) var8, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field674 != arg0 || arg1.field708 != 0) && (arg1.field706 == 0 || arg1.field699 > 0)) {
            int var9 = arg1.field716 - (arg1.field674 - class172.field3493 - class172.field3493) * 64;
            int var10 = arg1.field679 - (arg1.field708 - class69.field1470 - class69.field1470) * 64;
            if (var9 != 0 || var10 != 0) {
                arg1.field737 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field708 = 0;
            arg1.field674 = 0;
        }
        int var11 = arg1.field737 - arg1.field727 & 0x7FF;
        if (var11 == 0) {
            arg1.field695 = 0;
            return;
        }
        arg1.field695++;
        if (var11 > 1024) {
            arg1.field727 -= arg1.field717;
            boolean var12 = true;
            if (arg1.field717 > var11 || 2048 - arg1.field717 < var11) {
                var12 = false;
                arg1.field727 = arg1.field737;
            }
            if (arg1.field721 == arg1.field705 && (arg1.field695 > 25 || var12)) {
                if (arg1.field709 == -1) {
                    arg1.field705 = arg1.field732;
                } else {
                    arg1.field705 = arg1.field709;
                }
            }
        } else {
            arg1.field727 += arg1.field717;
            boolean var13 = true;
            if (arg1.field717 > var11 || var11 > 2048 - arg1.field717) {
                arg1.field727 = arg1.field737;
                var13 = false;
            }
            if (arg1.field721 == arg1.field705 && (arg1.field695 > 25 || var13)) {
                if (arg1.field681 == -1) {
                    arg1.field705 = arg1.field732;
                } else {
                    arg1.field705 = arg1.field681;
                }
            }
        }
        arg1.field727 &= 0x7FF;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)Z")
    public static final boolean method730(byte arg0, int arg1) {
        field2237++;
        if (arg0 == 55) {
            return (arg1 >> 31 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
    public static final void method731(int arg0) {
        if (class199.field3935 != null) {
            class199.field3935.method694((byte) -107);
        }
        if (arg0 != 2047) {
            field2251 = null;
        }
        field2248++;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2252 = arg1;
        this.field2244 = arg6;
        this.field2238 = arg2;
        this.field2256 = arg0;
        this.field2240 = arg5;
        this.field2235 = arg4;
        this.field2243 = arg3;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIII)V")
    public static final void method732(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2247++;
        if (arg1 != 0) {
            method732(-94, -53, -45, 30, -35);
        }
    }
}
