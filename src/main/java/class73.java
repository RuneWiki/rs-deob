import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class73 extends class270 implements class323 {

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "Luc;")
    public class200 field910;

    @OriginalMember(owner = "client!ok", name = "D", descriptor = "Z")
    private boolean field920;

    @OriginalMember(owner = "client!ok", name = "E", descriptor = "Lpi;")
    public static class340 field921 = new class340(84, 20);

    @OriginalMember(owner = "client!ok", name = "H", descriptor = "[I")
    public static int[] field924 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!ok", name = "y", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!ok", name = "A", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!ok", name = "B", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!ok", name = "C", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!ok", name = "F", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!ok", name = "G", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!ok", name = "I", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!ok", name = "J", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(I)Z")
    public final boolean method177(int arg0) {
        ++field912;
        if (arg0 != 5) {
            field924 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)I")
    public final int method413(int arg0) {
        ++field909;
        if (arg0 != -30502) {
            field921 = null;
        }
        return this.field910.field2565;
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lqa;Ljt;IIIIIZIII)V")
    public class73(class129 arg0, class402 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class243.method1523(arg9, arg8, (byte) -88));
        this.field910 = new class200(arg0, arg1, arg8, arg9, arg2, arg3, super.field3421, super.field3420, arg7, arg10);
        this.field920 = ~arg1.field5347 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)I")
    public final int method414(int arg0) {
        if (arg0 != 17350) {
            field926 = -67;
        }
        ++field914;
        return this.field910.field2597;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLrn;ZIILqa;I)V")
    public final void method174(byte arg0, class242 arg1, boolean arg2, int arg3, int arg4, class129 arg5, int arg6) {
        ++field925;
        if (arg0 != 91) {
            this.method418(-39);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)I")
    public final int method415(int arg0) {
        ++field922;
        if (arg0 != -15317) {
            this.method174((byte) -48, (class242) null, false, 10, -76, (class129) null, 30);
        }
        return this.field910.field2585;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lqa;I)V")
    public final void method416(class129 arg0, int arg1) {
        if (arg1 == 16663) {
            this.field910.method1278(arg1 + -23941, arg0);
            ++field911;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
    public final void method173(byte arg0) {
        ++field908;
        if (arg0 != -32) {
            field926 = 54;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)Z")
    public final boolean method417(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            ++field913;
            return this.field910.method1290(122);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZILqa;)Z")
    public final boolean method179(int arg0, boolean arg1, int arg2, class129 arg3) {
        ++field919;
        class507 var5 = this.field910.method1280(false, super.field3420, super.field3421, 0, 131072, arg1, arg3);
        if (var5 == null) {
            return false;
        } else {
            class142 var6 = arg3.method847();
            var6.method982(super.field3421, super.field3422, super.field3420);
            return var5.method499(arg0, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLqa;)V")
    public final void method175(byte arg0, class129 arg1) {
        ++field923;
        if (arg0 != 91) {
            method420((byte) 109);
        }
        class507 var3 = this.field910.method1280(true, super.field3420, super.field3421, arg0 + -91, 262144, true, arg1);
        if (var3 != null) {
            int var4 = super.field3421 >> 7;
            int var5 = super.field3420 >> 7;
            this.field910.method1279(var4, arg1, var5, var3, var4, false, var5, (byte) 97);
        }
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)V")
    public final void method418(int arg0) {
        if (arg0 != -14924) {
            field921 = null;
        }
        ++field917;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IILqa;)Lc;")
    public final class507 method419(int arg0, int arg1, class129 arg2) {
        ++field915;
        return arg1 != -32039 ? null : this.field910.method1280(false, 0, 0, 0, arg0, false, arg2);
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)V")
    public static void method420(byte arg0) {
        field921 = null;
        if (arg0 != -85) {
            field924 = null;
        }
        field924 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lqa;B)V")
    public final void method421(class129 arg0, byte arg1) {
        ++field916;
        if (arg1 > -88) {
            field921 = null;
        }
        this.field910.method1282(arg0, (byte) 112);
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(Lqa;B)Lvs;")
    public final class465 method172(class129 arg0, byte arg1) {
        ++field918;
        class507 var3 = this.field910.method1280(false, super.field3420, super.field3421, 0, 2048, true, arg0);
        if (var3 == null) {
            return null;
        } else {
            class142 var4 = arg0.method847();
            var4.method982(super.field3421, super.field3422, super.field3420);
            class465 var5 = null;
            if (this.field920) {
                var5 = class92.method635(1, -16461);
            }
            if (this.field910.field2572 == null) {
                var3.method520(var4, var5 != null ? var5.field6843[0] : null, 0);
            } else {
                class287 var6 = this.field910.field2572.method1969();
                arg0.method824(var3, var6, var4, var5 == null ? null : var5.field6843[0], 0);
            }
            int var7 = super.field3421 >> 7;
            int var8 = super.field3420 >> 7;
            this.field910.method1279(var7, arg0, var8, var3, var7, true, var8, (byte) 120);
            int var9 = 52 % ((arg1 - 48) / 60);
            return var5;
        }
    }

    static {
        new class169("Use", "Benutzen", "Utiliser", "Usar");
    }
}
