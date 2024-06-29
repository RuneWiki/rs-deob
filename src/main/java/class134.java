import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class134 implements Runnable {

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "[Lfc;")
    public volatile class51[] field2891 = new class51[2];

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "Z")
    public volatile boolean field2900 = false;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "Z")
    public volatile boolean field2901 = false;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "Lgg;")
    public static class63 field2896 = class116.method911(43, "(U1");

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "Lgg;")
    private static class63 field2899 = class116.method911(43, "Loading)3)3)3");

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "Lgg;")
    public static class63 field2892 = field2899;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "Lqd;")
    public static class148 field2903 = new class148();

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "Lgg;")
    private static class63 field2907 = class116.method911(43, "Connection lost)3");

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "[[I")
    public static int[][] field2904 = new int[104][104];

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "Lgg;")
    public static class63 field2905 = class116.method911(43, "(U");

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "Lgg;")
    public static class63 field2909 = class116.method911(43, "Lade)3)3)3");

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "Lgg;")
    public static class63 field2911 = field2907;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "Lgg;")
    private static class63 field2910 = class116.method911(43, "Choose Option");

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "Lgg;")
    public static class63 field2912 = field2910;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "Lai;")
    public static class10 field2908 = new class10();

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "Lmc;")
    public static class111 field2906;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "Lqe;")
    public class149 field2894;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIILd;IJZ)Z")
    public static final boolean method975(int arg0, int arg1, int arg2, int arg3, int arg4, class30 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class142.method1020(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILgf;I)V")
    public static final void method976(int arg0, int arg1, class62 arg2, int arg3) {
        if (arg2.field1167 == arg1 && arg1 != -1) {
            int var4 = class49.method480(1000, arg1).field220;
            if (var4 == 1) {
                arg2.field1097 = 0;
                arg2.field1152 = arg3;
                arg2.field1121 = 0;
                arg2.field1112 = 0;
            }
            if (var4 == 2) {
                arg2.field1112 = 0;
            }
        } else if (arg1 == -1 || arg2.field1167 == -1 || class49.method480(1000, arg1).field202 >= class49.method480(1000, arg2.field1167).field202) {
            arg2.field1097 = 0;
            arg2.field1121 = 0;
            arg2.field1155 = arg2.field1154;
            arg2.field1167 = arg1;
            arg2.field1112 = 0;
            arg2.field1152 = arg3;
        }
        if (arg0 != 15278) {
            method981(82, 100, -15, null);
        }
        field2897++;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public static void method977(int arg0) {
        field2909 = null;
        field2899 = null;
        field2908 = null;
        field2896 = null;
        field2903 = null;
        field2905 = null;
        field2912 = null;
        field2904 = null;
        field2906 = null;
        field2910 = null;
        field2892 = null;
        field2907 = null;
        field2911 = null;
        if (arg0 != -32606) {
            field2909 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "run", descriptor = "()V")
    public final void run() {
        field2898++;
        this.field2901 = true;
        try {
            while (!this.field2900) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class51 var2 = this.field2891[var1];
                    if (var2 != null) {
                        var2.method498((byte) -127);
                    }
                }
                class196.method1281((byte) -8, 10L);
                class136.method996(null, -964, this.field2894);
            }
        } catch (Exception var9) {
            class199.method1302(null, var9, true);
        } finally {
            Object var6 = null;
            this.field2901 = false;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "([IIIIII)V")
    public static final void method978(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class96 var6 = class148.field3117[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class152 var7 = var6.field2283;
        if (var7 != null) {
            int var8 = var7.field3184;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class160 var10 = var6.field2289;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field3311;
        int var12 = var10.field3296;
        int var13 = var10.field3305;
        int var14 = var10.field3294;
        int[] var15 = class54.field1374[var11];
        int[] var16 = class14.field349[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)Z")
    public static final boolean method979(int arg0, int arg1) {
        field2893++;
        int var2 = -62 % ((50 - arg1) / 44);
        return (arg0 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)I")
    public static final int method980(byte arg0) {
        field2902++;
        int var1 = class112.method894(-86, class112.field2528, class35.field828, class21.field491);
        if (arg0 != -52) {
            method979(103, -69);
        }
        return var1 - class39.field924 >= 800 || (class49.field1194[class112.field2528][class35.field828 >> 7][class21.field491 >> 7] & 0x4) == 0 ? 3 : class112.field2528;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIILjc;)[Lwb;")
    public static final class200[] method981(int arg0, int arg1, int arg2, class85 arg3) {
        if (arg1 < 37) {
            field2899 = null;
        }
        field2895++;
        return class117.method917(arg3, arg2, arg0, -20878) ? class32.method314((byte) -104) : null;
    }
}
