import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class132 {

    @OriginalMember(owner = "client!o", name = "d", descriptor = "Ltg;")
    public static class184 field2396 = class135.method812("oder benutzen Sie eine andere Welt)3", 3);

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field2394 = 0;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "Ltg;")
    public static class184 field2401 = class135.method812("Bitte starten Sie eine Mitgliedschaft", 3);

    @OriginalMember(owner = "client!o", name = "k", descriptor = "Ltg;")
    public static class184 field2403 = class135.method812("-5berpr-Ufen Sie Ihr Mitteilungsfach)3", 3);

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "J")
    public long field2393;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "Lo;")
    public class132 field2397;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "Lo;")
    public class132 field2398;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
    public final void method797(byte arg0) {
        field2402++;
        if (arg0 <= -85 && this.field2398 != null) {
            this.field2398.field2397 = this.field2397;
            this.field2397.field2398 = this.field2398;
            this.field2397 = null;
            this.field2398 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lrh;B)Lrh;")
    public static final class167 method798(class167 arg0, byte arg1) {
        field2400++;
        if (arg1 <= 3) {
            return null;
        }
        class167 var2 = class107.method666(arg0, -950);
        if (var2 == null) {
            var2 = arg0.field3060;
        }
        return var2;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static void method799(int arg0) {
        field2401 = null;
        field2396 = null;
        if (arg0 == -8458) {
            field2403 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)Z")
    public final boolean method800(boolean arg0) {
        field2399++;
        if (arg0) {
            return this.field2398 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lrh;IIIIIII)V")
    public static final void method801(class167 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2395++;
        if (class117.field2121) {
            class193.field3738 = 32;
        } else {
            class193.field3738 = 0;
        }
        if (arg7 != -9) {
            field2396 = null;
        }
        class117.field2121 = false;
        if (class1.field12 != 0) {
            if (arg3 >= arg6 && arg6 + 16 > arg3 && arg2 <= arg1 && arg2 + 16 > arg1) {
                arg0.field3073 -= 4;
                class57.method305(-117, arg0);
            } else if (arg6 <= arg3 && arg3 < arg6 + 16 && arg2 + arg4 - 16 <= arg1 && arg2 + arg4 > arg1) {
                arg0.field3073 += 4;
                class57.method305(-114, arg0);
            } else if (arg3 >= arg6 - class193.field3738 && arg6 + class193.field3738 + 16 > arg3 && arg1 >= arg2 + 16 && arg1 < arg2 + arg4 - 16) {
                int var8 = (arg4 - 32) * arg4 / arg5;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg4 - var8 - 32;
                int var10 = arg1 - arg2 - var8 / 2 - 16;
                arg0.field3073 = (arg5 - arg4) * var10 / var9;
                class57.method305(arg7 - 103, arg0);
                class117.field2121 = true;
            }
        }
        if (class141.field2566 == 0) {
            return;
        }
        int var11 = arg0.field3045;
        if (arg6 - var11 <= arg3 && arg2 <= arg1 && arg3 < arg6 + 16 && arg2 + arg4 >= arg1) {
            arg0.field3073 += class141.field2566 * 45;
            class57.method305(arg7 - 115, arg0);
            return;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)Lob;")
    public static final class134 method802(int arg0, int arg1, int arg2) {
        class90 var3 = class190.field3704[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1684;
    }
}
