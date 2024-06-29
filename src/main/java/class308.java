import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class308 {

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "Lmh;")
    public static class62 field5284 = class201.method1405(true, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "Lmh;")
    public static class62 field5287 = class201.method1405(true, "Sprites geladen)3");

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "Lmh;")
    private static class62 field5285 = class201.method1405(true, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "Lmh;")
    public static class62 field5291 = class201.method1405(true, "(U1");

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "Lmh;")
    public static class62 field5283 = field5285;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "[[Z")
    public static boolean[][] field5290;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V", line = 19)
    public static void method2098(byte arg0) {
        field5285 = null;
        field5291 = null;
        field5283 = null;
        field5284 = null;
        field5287 = null;
        field5290 = (boolean[][]) null;
        int var1 = 85 % ((arg0 - 17) / 33);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)V", line = 55)
    public static final void method2099(int arg0, int arg1) {
        class291.method1979(0);
        class192.method1351((byte) -76);
        field5288++;
        int var2 = class110.method843((byte) -55, arg0).field3377;
        if (arg1 >= -35 || var2 == 0) {
            return;
        }
        int var3 = class222.field3877[arg0];
        if (var2 == 6) {
            class4.field39 = var3;
        }
        if (var2 == 5) {
            class240.field4090 = var3;
        }
        if (var2 == 9) {
            class161.field2593 = var3;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIILjm;IJIIII)Z", line = 92)
    public static final boolean method2100(int arg0, int arg1, int arg2, int arg3, class123 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class134.method1011(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(III[B)Z", line = 107)
    public static final boolean method2101(int arg0, int arg1, int arg2, byte[] arg3) {
        boolean var4 = true;
        field5292++;
        class92 var5 = new class92(arg3);
        if (arg2 != 4062) {
            method2100(-65, 116, -54, -95, (class123) null, 46, 124L, 53, -61, 57, 114);
        }
        int var6 = -1;
        label74: while (true) {
            int var7 = var5.method706((byte) 117);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var12;
                class216 var16;
                do {
                    int var13;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method731(-121);
                                        if (var17 == 0) {
                                            continue label74;
                                        }
                                        var5.method702(-1);
                                    }
                                    int var10 = var5.method731(-31);
                                    if (var10 == 0) {
                                        continue label74;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = (var8 & 0xFDE) >> 6;
                                    var12 = var5.method702(-1) >> 2;
                                    var13 = arg1 + var11;
                                    int var14 = var8 & 0x3F;
                                    var15 = var14 + arg0;
                                } while (var13 <= 0);
                            } while (var15 <= 0);
                        } while (var13 >= 103);
                    } while (var15 >= 103);
                    var16 = class252.method1755(var6, (byte) -62);
                } while (var12 == 22 && !class276.field4733 && var16.field3732 == 0 && var16.field3706 != 1 && !var16.field3691);
                if (!var16.method1525(arg2 - 4062)) {
                    var4 = false;
                    class290.field4930++;
                }
                var9 = true;
            }
        }
    }
}
