import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class14 {

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "Lha;")
    private class77 field192 = new class77();

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "Lfg;")
    private class62 field210 = new class62();

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
    private int field214;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    private int field211;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "Loa;")
    private class153 field212;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "Ldc;")
    private static class37 field191 = class185.method1233((byte) 86, "Type");

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "Ldc;")
    public static class37 field203 = field191;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "Ldc;")
    public static class37 field202 = class185.method1233((byte) 86, "(R");

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "Ldc;")
    public static class37 field205 = class185.method1233((byte) 86, "labels)3dat");

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "Ldc;")
    public static class37 field197 = class185.method1233((byte) 86, "Welt");

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "Ldc;")
    private static class37 field208 = class185.method1233((byte) 86, "Too many connections from your address)3");

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "Ldc;")
    public static class37 field200 = field208;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "Ldj;")
    public static class44 field207;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IJ)Lha;")
    public final class77 method87(int arg0, long arg1) {
        field213++;
        class77 var4 = (class77) this.field212.method1047((byte) 114, arg1);
        int var5 = 78 % ((66 - arg0) / 50);
        if (var4 != null) {
            this.field210.method465(var4, (byte) 65);
        }
        return var4;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lmf;IIIILji;I)V")
    public static final void method88(class136 arg0, int arg1, int arg2, int arg3, int arg4, class106 arg5, int arg6) {
        field204++;
        if (arg5 == null) {
            return;
        }
        int var7 = class91.field1571 + class82.field1454 & 0x7FF;
        int var8 = Math.max(arg0.field2638 / 2, arg0.field2509 / 2) + 10;
        int var9 = arg2 * arg2 + arg4 * arg4;
        if (var9 > var8 * var8) {
            return;
        }
        int var10 = class169.field3211[var7];
        if (arg3 != 90) {
            method89(26);
        }
        int var11 = class169.field3220[var7];
        int var12 = var10 * 256 / (class123.field2208 + 256);
        int var13 = var11 * 256 / (class123.field2208 + 256);
        int var14 = arg2 * var12 + arg4 * var13 >> 16;
        int var15 = arg2 * var13 - arg4 * var12 >> 16;
        ((class182) arg5).method1220(arg0.field2638 / 2 + arg6 + var14 - arg5.field1843 / 2, -(arg5.field1849 / 2) + arg1 - -(arg0.field2509 / 2) + -var15, arg0.field2574, arg0.field2619);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public static void method89(int arg0) {
        if (arg0 >= -48) {
            method88(null, 5, 14, -11, -5, null, -25);
        }
        field205 = null;
        field203 = null;
        field202 = null;
        field191 = null;
        field197 = null;
        field207 = null;
        field208 = null;
        field200 = null;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)Lej;")
    public final class54 method90(int arg0) {
        if (arg0 != -1) {
            this.field211 = -120;
        }
        field194++;
        return this.field212.method1041(true);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIZZIIIIII)Z")
    public static final boolean method91(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field199++;
        if (arg5) {
            method89(95);
        }
        if (class238.field4382.field3499 == 2) {
            return class162.method1086(arg7, arg1, arg10, arg8, arg6, arg4, 83, arg9, arg3, arg11, arg2, arg0);
        } else if (class238.field4382.field3499 > 2) {
            return class198.method1315(arg2, arg6, -29517, arg10, arg8, class238.field4382.field3499, arg0, arg1, arg3, arg9, arg11, arg4, arg7);
        } else {
            return class82.method563(arg6, arg3, arg10, arg2, arg4, arg8, arg11, arg7, false, arg9, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(JLha;Z)V")
    public final void method92(long arg0, class77 arg1, boolean arg2) {
        if (!arg2) {
            return;
        }
        if (this.field214 == 0) {
            class77 var5 = this.field210.method464(-91);
            var5.method433(0);
            var5.method533(!arg2);
            if (this.field192 == var5) {
                class77 var6 = this.field210.method464(-91);
                var6.method433(0);
                var6.method533(false);
            }
        } else {
            this.field214--;
        }
        field201++;
        this.field212.method1044(arg1, (byte) -14, arg0);
        this.field210.method465(arg1, (byte) 93);
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
    public final void method93(int arg0) {
        while (true) {
            class77 var2 = this.field210.method464(-127);
            if (var2 == null) {
                if (arg0 != 0) {
                    this.field192 = null;
                }
                field196++;
                this.field214 = this.field211;
                return;
            }
            var2.method433(0);
            var2.method533(false);
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)Lej;")
    public final class54 method94(int arg0) {
        if (arg0 < 97) {
            field202 = null;
        }
        field206++;
        return this.field212.method1042((byte) -25);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(JI)V")
    public final void method95(long arg0, int arg1) {
        field209++;
        if (arg1 != 2047) {
            this.method90(-106);
        }
        class77 var4 = (class77) this.field212.method1047((byte) 109, arg0);
        if (var4 != null) {
            var4.method433(0);
            var4.method533(false);
            this.field214++;
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(I)V")
    public class14(int arg0) {
        this.field214 = arg0;
        this.field211 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field212 = new class153(var2);
    }
}
