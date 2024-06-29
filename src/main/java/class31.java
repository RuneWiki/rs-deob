import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public abstract class class31 extends class170 {

    @OriginalMember(owner = "client!ph", name = "P", descriptor = "Lsc;")
    public static class181 field506 = class149.method967(255, "scrollen:");

    @OriginalMember(owner = "client!ph", name = "S", descriptor = "I")
    public static int field509 = 0;

    @OriginalMember(owner = "client!ph", name = "U", descriptor = "Lsc;")
    public static class181 field511 = class149.method967(255, "<br>(X");

    @OriginalMember(owner = "client!ph", name = "T", descriptor = "Lsc;")
    public static class181 field510 = class149.method967(255, "(U1");

    @OriginalMember(owner = "client!ph", name = "M", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!ph", name = "N", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!ph", name = "Q", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!ph", name = "R", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!ph", name = "O", descriptor = "[[[I")
    public static int[][][] field505;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)Z")
    public abstract boolean method245(int arg0);

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method246(byte arg0);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IILjb;)[Lka;")
    public static final class134[] method247(int arg0, int arg1, class11 arg2) {
        field503++;
        if (arg1 == 0) {
            return class18.method173(arg2, (byte) 114, arg0) ? class61.method437((byte) 117) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lg;")
    public static final class160 method248(Throwable arg0, String arg1) {
        field507++;
        class160 var2;
        if (arg0 instanceof class160) {
            var2 = (class160) arg0;
            var2.field2730 = var2.field2730 + ' ' + arg1;
        } else {
            var2 = new class160(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class102 var20 = new class102(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class221.field3820[var21][arg1][arg2] == null) {
                    class221.field3820[var21][arg1][arg2] = new class220(var21, arg1, arg2);
                }
            }
            class221.field3820[arg0][arg1][arg2].field3809 = var20;
        } else if (arg3 == 1) {
            class102 var22 = new class102(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class221.field3820[var23][arg1][arg2] == null) {
                    class221.field3820[var23][arg1][arg2] = new class220(var23, arg1, arg2);
                }
            }
            class221.field3820[arg0][arg1][arg2].field3809 = var22;
        } else {
            class15 var24 = new class15(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class221.field3820[var25][arg1][arg2] == null) {
                    class221.field3820[var25][arg1][arg2] = new class220(var25, arg1, arg2);
                }
            }
            class221.field3820[arg0][arg1][arg2].field3799 = var24;
        }
    }

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "(I)V")
    public static void method250(int arg0) {
        if (arg0 == 0) {
            field510 = null;
            field511 = null;
            field506 = null;
            field505 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIII)V")
    public static final void method251(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        class171.method1133(class149.field2507[arg4], arg2 - arg3, arg5, arg2 + arg3, (byte) 125);
        int var7 = arg0;
        field508++;
        int var8 = arg3 * arg3;
        int var9 = arg0 * arg0;
        int var10 = var8 << 1;
        int var11 = var9 << 1;
        int var12 = arg0 << 1;
        int var13 = var9 - ((var12 - 1) * var10);
        int var14 = -92 % ((-arg1 - 21) / 53);
        int var15 = (1 - var12) * var8 + var11;
        int var16 = var8 << 2;
        int var17 = var9 << 2;
        int var18 = ((arg0 << 1) - 3) * var10;
        int var19 = ((var6 << 1) + 3) * var11;
        int var20 = (arg0 - 1) * var16;
        int var21 = (var6 + 1) * var17;
        while (var7 > 0) {
            if (var15 < 0) {
                while (var15 < 0) {
                    var6++;
                    var15 += var19;
                    var13 += var21;
                    var19 += var17;
                    var21 += var17;
                }
            }
            if (var13 < 0) {
                var13 += var21;
                var6++;
                var15 += var19;
                var19 += var17;
                var21 += var17;
            }
            var13 += -var18;
            var7--;
            var18 -= var16;
            var15 += -var20;
            int var22 = arg4 + var7;
            int var23 = arg4 - var7;
            var20 -= var16;
            int var24 = arg2 + var6;
            int var25 = arg2 - var6;
            class171.method1133(class149.field2507[var23], var25, arg5, var24, (byte) 126);
            class171.method1133(class149.field2507[var22], var25, arg5, var24, (byte) 125);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIZ)Lwb;")
    public static final class91 method252(int arg0, int arg1, boolean arg2) {
        field504++;
        if (arg2) {
            return null;
        }
        class91 var3 = (class91) class85.field1348.method1424(true, (long) arg0 | (long) arg1 << 32);
        if (var3 == null) {
            var3 = new class91(arg1, arg0);
            class85.field1348.method1422(var3.field606, var3, -1);
        }
        return var3;
    }
}
