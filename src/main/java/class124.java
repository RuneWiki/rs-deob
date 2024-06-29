import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class124 extends class12 {

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "Lbc;")
    public static class11 field2737 = new class11(260);

    @OriginalMember(owner = "client!rf", name = "C", descriptor = "Lpe;")
    private static class109 field2747 = class141.method1120("Unable to connect)3", 0);

    @OriginalMember(owner = "client!rf", name = "I", descriptor = "Lpe;")
    public static class109 field2753 = field2747;

    @OriginalMember(owner = "client!rf", name = "D", descriptor = "Lpe;")
    public static class109 field2748 = field2747;

    @OriginalMember(owner = "client!rf", name = "J", descriptor = "I")
    public static volatile int field2754 = -1;

    @OriginalMember(owner = "client!rf", name = "E", descriptor = "Lpe;")
    public static class109 field2749 = class141.method1120("Konfig geladen)3", 0);

    @OriginalMember(owner = "client!rf", name = "G", descriptor = "Lpe;")
    public static class109 field2751 = class141.method1120(")1j", 0);

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "Lrf;")
    public class124 field2739;

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "Lrf;")
    public class124 field2742;

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "Lse;")
    public static class130 field2746;

    @OriginalMember(owner = "client!rf", name = "H", descriptor = "Lbe;")
    public static class13 field2752;

    @OriginalMember(owner = "client!rf", name = "F", descriptor = "Lk;")
    public static class69 field2750;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(B)V")
    public final void method1006(byte arg0) {
        int var2 = -75 % ((arg0 - 89) / 35);
        field2744++;
        if (this.field2739 != null) {
            this.field2739.field2742 = this.field2742;
            this.field2742.field2739 = this.field2739;
            this.field2739 = null;
            this.field2742 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILub;)V")
    public static final void method1007(int arg0, class141 arg1) {
        arg1.field3060 = arg1.field3113;
        field2740++;
        if (arg1.field3080 == 0) {
            arg1.field3092 = 0;
            return;
        }
        if (arg1.field3124 != -1 && arg1.field3081 == 0) {
            class6 var2 = class27.method238(8, arg1.field3124);
            if (arg1.field3110 > 0 && var2.field142 == 0) {
                arg1.field3092++;
                return;
            }
            if (arg1.field3110 <= 0 && var2.field154 == 0) {
                arg1.field3092++;
                return;
            }
        }
        int var3 = arg1.field3120[arg1.field3080 - 1] * 128 + arg1.field3071 * 64;
        int var4 = arg1.field3094;
        int var5 = arg1.field3106;
        int var6 = arg1.field3121[arg1.field3080 - 1] * 128 + arg1.field3071 * 64;
        if (var3 - var4 > 256 || var3 - var4 < -256 || var6 - var5 > 256 || var6 - var5 < -256) {
            arg1.field3106 = var6;
            arg1.field3094 = var3;
            return;
        }
        if (var4 >= var3) {
            if (var3 >= var4) {
                if (var6 > var5) {
                    arg1.field3111 = 1024;
                } else if (var6 < var5) {
                    arg1.field3111 = 0;
                }
            } else if (var5 < var6) {
                arg1.field3111 = 768;
            } else if (var5 > var6) {
                arg1.field3111 = 256;
            } else {
                arg1.field3111 = 512;
            }
        } else if (var5 < var6) {
            arg1.field3111 = 1280;
        } else if (var5 <= var6) {
            arg1.field3111 = 1536;
        } else {
            arg1.field3111 = 1792;
        }
        int var7 = arg1.field3064;
        int var8 = 4;
        boolean var9 = true;
        int var10 = arg1.field3111 - arg1.field3114 & 0x7FF;
        if (var10 > 1024) {
            var10 -= 2048;
        }
        if (arg0 <= var10 && var10 <= 256) {
            var7 = arg1.field3108;
        } else if (var10 >= 256 && var10 < 768) {
            var7 = arg1.field3076;
        } else if (var10 >= -768 && var10 <= -256) {
            var7 = arg1.field3109;
        }
        if (var7 == -1) {
            var7 = arg1.field3108;
        }
        arg1.field3060 = var7;
        if (arg1 instanceof class108) {
            var9 = ((class108) arg1).field2265.field2456;
        }
        if (var9) {
            if (arg1.field3114 != arg1.field3111 && arg1.field3123 == -1 && arg1.field3073 != 0) {
                var8 = 2;
            }
            if (arg1.field3080 > 2) {
                var8 = 6;
            }
            if (arg1.field3080 > 3) {
                var8 = 8;
            }
            if (arg1.field3092 > 0 && arg1.field3080 > 1) {
                arg1.field3092--;
                var8 = 8;
            }
        } else {
            if (arg1.field3080 > 1) {
                var8 = 6;
            }
            if (arg1.field3080 > 2) {
                var8 = 8;
            }
            if (arg1.field3092 > 0 && arg1.field3080 > 1) {
                var8 = 8;
                arg1.field3092--;
            }
        }
        if (arg1.field3072[arg1.field3080 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg1.field3108 == arg1.field3060 && arg1.field3090 != -1) {
            arg1.field3060 = arg1.field3090;
        }
        if (var3 > var4) {
            arg1.field3094 += var8;
            if (var3 < arg1.field3094) {
                arg1.field3094 = var3;
            }
        } else if (var3 < var4) {
            arg1.field3094 -= var8;
            if (arg1.field3094 < var3) {
                arg1.field3094 = var3;
            }
        }
        if (var6 > var5) {
            arg1.field3106 += var8;
            if (var6 < arg1.field3106) {
                arg1.field3106 = var6;
            }
        } else if (var6 < var5) {
            arg1.field3106 -= var8;
            if (arg1.field3106 < var6) {
                arg1.field3106 = var6;
            }
        }
        if (arg1.field3094 != var3 || arg1.field3106 != var6) {
            return;
        }
        arg1.field3080--;
        if (arg1.field3110 > 0) {
            arg1.field3110--;
            return;
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
    public static void method1008(int arg0) {
        field2753 = null;
        field2751 = null;
        field2747 = null;
        field2749 = null;
        field2737 = null;
        field2752 = null;
        if (arg0 == -2) {
            field2748 = null;
            field2746 = null;
            field2750 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)I")
    public static final int method1009(int arg0, int arg1) {
        field2743++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg0 != 17613) {
            method1009(27, -27);
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZLna;Lwf;ILna;)V")
    public static final void method1010(boolean arg0, class91 arg1, class159 arg2, int arg3, class91 arg4) {
        class137.field2997 = arg1;
        if (arg3 != 0) {
            return;
        }
        class125.field2763 = arg0;
        class44.field937 = arg4;
        class44.field937.method754(10, (byte) 38);
        class85.field1803 = arg2;
        field2745++;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIZLe;)V")
    public static final void method1011(int arg0, int arg1, int arg2, int arg3, boolean arg4, class29 arg5) {
        field2741++;
        if (arg5 == null) {
            return;
        }
        int var6 = class139.field3030 + class100.field2104 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class105.field2210[var6];
        int var9 = var8 * 256 / (class68.field1368 + 256);
        if (arg4) {
            field2753 = null;
        }
        int var10 = class105.field2221[var6];
        int var11 = var10 * 256 / (class68.field1368 + 256);
        int var12 = arg3 * var11 + arg2 * var9 >> 16;
        int var13 = arg3 * var9 - arg2 * var11 >> 16;
        if (var7 <= 2500) {
            arg5.method279(arg1 + var12 + 94 + 4 - arg5.field662 / 2, arg0 - arg5.field665 / 2 + -var13 + 83 + -4);
        } else {
            arg5.method254(class84.field1789, arg1 + var12 + 4 + 94 - arg5.field662 / 2, -var13 + arg0 + -4 - -83 + -(arg5.field665 / 2));
        }
    }
}
