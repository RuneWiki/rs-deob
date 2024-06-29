import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class8 {

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "[I")
    public static int[] field122 = new int[256];

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "[I")
    public static int[] field117 = new int[2048];

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public static int field124 = 0;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "[I")
    public static int[] field119 = new int[8];

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "Ldl;")
    public static class123 field123;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)V")
    public static final void method48(int arg0, int arg1) {
        if (arg0 != 0) {
            method48(-62, 124);
        }
        class67.field931.method1425(arg1, -113);
        field116++;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lvc;IIIII)V")
    public static final void method49(class190 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field120++;
        if (arg0.field3018 == -1 && arg0.field3015 == null) {
            return;
        }
        int var6 = 0;
        if (arg5 > arg0.field3016) {
            var6 += arg5 - arg0.field3016;
        } else if (arg0.field3003 > arg5) {
            var6 += arg0.field3003 - arg5;
        }
        if (arg0.field3007 < arg3) {
            var6 += arg3 - arg0.field3007;
        } else if (arg3 < arg0.field2990) {
            var6 += arg0.field2990 - arg3;
        }
        if (arg0.field2999 == 0 || arg0.field2999 < (var6 - 64) || class60.field841 == 0 || arg0.field2994 != arg4) {
            if (arg0.field2986 != null) {
                class130.field1907.method716(arg0.field2986);
                arg0.field2986 = null;
            }
            if (arg0.field2989 != null) {
                class130.field1907.method716(arg0.field2989);
                arg0.field2989 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        if (arg1 >= -45) {
            method51(false, (byte) -9);
        }
        int var7 = (arg0.field2999 - var6) * class60.field841 / arg0.field2999;
        if (arg0.field2986 != null) {
            arg0.field2986.method1733(var7);
        } else if (arg0.field3018 >= 0) {
            class14 var8 = class14.method100(class49.field633, arg0.field3018, 0);
            if (var8 != null) {
                class119 var9 = var8.method99().method783(class26.field368);
                class255 var10 = class255.method1747(var9, 100, var7);
                var10.method1744(-1);
                class130.field1907.method709(var10);
                arg0.field2986 = var10;
            }
        }
        if (arg0.field2989 != null) {
            arg0.field2989.method1733(var7);
            if (arg0.field2989.method785(32)) {
                return;
            }
            arg0.field2989 = null;
        } else if (arg0.field3015 != null && (arg0.field3002 -= arg2) <= 0) {
            int var11 = (int) (Math.random() * (double) arg0.field3015.length);
            class14 var12 = class14.method100(class49.field633, arg0.field3015[var11], 0);
            if (var12 != null) {
                class119 var13 = var12.method99().method783(class26.field368);
                class255 var14 = class255.method1747(var13, 100, var7);
                var14.method1744(0);
                class130.field1907.method709(var14);
                arg0.field3002 = (int) ((double) (arg0.field3001 - arg0.field3010) * Math.random()) + arg0.field3010;
                arg0.field2989 = var14;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
    public static final void method50(int arg0) {
        class182.field2886.method1420(-1);
        field118++;
        int var1 = 13 / ((58 - arg0) / 45);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZB)I")
    public static final int method51(boolean arg0, byte arg1) {
        if (arg1 < 54) {
            field119 = null;
        }
        long var2 = class260.method1785((byte) -97);
        field121++;
        for (class16 var4 = arg0 ? (class16) class202.field3168.method671(0) : (class16) class202.field3168.method666(120); var4 != null; var4 = (class16) class202.field3168.method666(73)) {
            if ((var4.field188 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field188 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field1750;
                    class258.field4166[var5] = class211.field3295[var5];
                    var4.method784(false);
                    return var5;
                }
                var4.method784(false);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I[IIIZ)V")
    public static final void method52(int arg0, int[] arg1, int arg2, int arg3, boolean arg4) {
        if (!arg4) {
            field117 = null;
        }
        arg0--;
        field126++;
        int var11 = arg2 - 1;
        int var5 = var11 - 7;
        while (var5 > arg0) {
            int var6 = arg0 + 1;
            arg1[var6] = arg3;
            int var7 = var6 + 1;
            arg1[var7] = arg3;
            int var8 = var7 + 1;
            arg1[var8] = arg3;
            int var9 = var8 + 1;
            arg1[var9] = arg3;
            int var10 = var9 + 1;
            arg1[var10] = arg3;
            int var12 = var10 + 1;
            arg1[var12] = arg3;
            int var13 = var12 + 1;
            arg1[var13] = arg3;
            arg0 = var13 + 1;
            arg1[arg0] = arg3;
        }
        while (var11 > arg0) {
            arg0++;
            arg1[arg0] = arg3;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V")
    public static void method53(boolean arg0) {
        if (!arg0) {
            field122 = null;
            field117 = null;
            field123 = null;
            field119 = null;
        }
    }
}
