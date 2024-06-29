import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class631 extends class363 implements class231 {

    @OriginalMember(owner = "client!mv", name = "p", descriptor = "Lwca;")
    public class308 field8855;

    @OriginalMember(owner = "client!mv", name = "q", descriptor = "Z")
    private boolean field8856;

    @OriginalMember(owner = "client!mv", name = "C", descriptor = "Lbg;")
    public static class340 field8868;

    @OriginalMember(owner = "client!mv", name = "l", descriptor = "I")
    public static int field8851;

    @OriginalMember(owner = "client!mv", name = "m", descriptor = "I")
    public static int field8852;

    @OriginalMember(owner = "client!mv", name = "n", descriptor = "I")
    public static int field8853;

    @OriginalMember(owner = "client!mv", name = "o", descriptor = "I")
    public static int field8854;

    @OriginalMember(owner = "client!mv", name = "r", descriptor = "I")
    public static int field8857;

    @OriginalMember(owner = "client!mv", name = "s", descriptor = "I")
    public static int field8858;

    @OriginalMember(owner = "client!mv", name = "t", descriptor = "I")
    public static int field8859;

    @OriginalMember(owner = "client!mv", name = "u", descriptor = "I")
    public static int field8860;

    @OriginalMember(owner = "client!mv", name = "v", descriptor = "I")
    public static int field8861;

    @OriginalMember(owner = "client!mv", name = "w", descriptor = "I")
    public static int field8862;

    @OriginalMember(owner = "client!mv", name = "x", descriptor = "I")
    public static int field8863;

    @OriginalMember(owner = "client!mv", name = "y", descriptor = "I")
    public static int field8864;

    @OriginalMember(owner = "client!mv", name = "z", descriptor = "I")
    public static int field8865;

    @OriginalMember(owner = "client!mv", name = "E", descriptor = "I")
    public static int field8869;

    @OriginalMember(owner = "client!mv", name = "G", descriptor = "I")
    public static int field8870;

    @OriginalMember(owner = "client!mv", name = "H", descriptor = "I")
    public static int field8871;

    @OriginalMember(owner = "client!mv", name = "A", descriptor = "Lha;")
    public static class116 field8866;

    @OriginalMember(owner = "client!mv", name = "B", descriptor = "Lkm;")
    private class120 field8867;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "(I)Z")
    public final boolean method262(int arg0) {
        if (arg0 != -21131) {
            this.method267((class167) null, 117);
        }
        ++field8870;
        return this.field8855.method1910(-1);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Z)Z")
    public final boolean method868(boolean arg0) {
        if (arg0) {
            this.method255(-5, (class167) null);
        }
        ++field8863;
        return false;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(BLqa;II)Z")
    public final boolean method263(byte arg0, class167 arg1, int arg2, int arg3) {
        ++field8865;
        if (arg0 != 29) {
            this.method263((byte) -119, (class167) null, -91, 22);
        }
        class519 var5 = this.field8855.method1908(131072, -1, arg1, false, false, super.field5151, super.field5156);
        if (var5 == null) {
            return false;
        } else {
            class105 var6 = arg1.method637();
            var6.method884(super.field5156, super.field5152, super.field5151);
            return var5.method1399(arg2, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(B)I")
    public final int method258(byte arg0) {
        ++field8861;
        if (arg0 != -36) {
            method3566(-38);
        }
        return this.field8855.field4430;
    }

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "(I)V")
    public final void method270(int arg0) {
        int var2 = 103 / ((arg0 - -1) / 47);
        ++field8871;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILqa;)V")
    public final void method255(int arg0, class167 arg1) {
        int var3 = 23 / ((-46 - arg0) / 42);
        ++field8862;
        this.field8855.method1919(-119, arg1);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)I")
    public final int method269(int arg0) {
        ++field8857;
        if (arg0 != -13265) {
            this.method254(108, (class167) null, true);
        }
        return this.field8855.field4433;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(ZLqa;)V")
    public final void method268(boolean arg0, class167 arg1) {
        ++field8859;
        this.field8855.method1911(arg1, -8881);
        if (!arg0) {
            field8854 = -85;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(BZILqa;IILcea;)V")
    public final void method866(byte arg0, boolean arg1, int arg2, class167 arg3, int arg4, int arg5, class103 arg6) {
        ++field8852;
        if (arg0 != -84) {
            this.method270(63);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lqa;I)Lbi;")
    public final class465 method267(class167 arg0, int arg1) {
        ++field8851;
        if (arg1 != 2) {
            this.field8867 = null;
        }
        class519 var3 = this.field8855.method1908(2048, -1, arg0, false, true, super.field5151, super.field5156);
        if (var3 == null) {
            return null;
        } else {
            class105 var4 = arg0.method637();
            var4.method884(super.field5156, super.field5152, super.field5151);
            class465 var5 = null;
            if (this.field8856) {
                var5 = class603.method3437((byte) -22, 1);
            }
            if (this.field8855.field4460 == null) {
                var3.method1379(var4, var5 != null ? var5.field6707[0] : null, 0);
            } else {
                class616 var6 = this.field8855.field4460.method3350();
                arg0.method553(var3, var6, var4, var5 != null ? var5.field6707[0] : null, 0);
            }
            if (this.field8867 == null) {
                this.field8867 = class577.method3298(var3, super.field5156, super.field5151, (byte) 117, super.field5152);
            } else {
                class221.method1477(var3, this.field8867, super.field5151, super.field5156, -8040, super.field5152);
            }
            int var7 = super.field5156 >> 7;
            int var8 = super.field5151 >> 7;
            this.field8855.method1907(var3, true, var8, arg0, 34165, var8, var7, var7);
            return var5;
        }
    }

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "(I)V")
    public static void method3566(int arg0) {
        field8868 = null;
        if (arg0 >= -113) {
            field8868 = null;
        }
        field8866 = null;
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(ILqa;)Lkm;")
    public final class120 method260(int arg0, class167 arg1) {
        ++field8860;
        if (arg0 >= -50) {
            this.method255(-48, (class167) null);
        }
        return this.field8867;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lqa;B)V")
    public final void method266(class167 arg0, byte arg1) {
        if (arg1 != -40) {
            field8854 = -88;
        }
        ++field8864;
        class519 var3 = this.field8855.method1908(262144, -1, arg0, true, true, super.field5151, super.field5156);
        if (var3 != null) {
            int var4 = super.field5156 >> 7;
            int var5 = super.field5151 >> 7;
            this.field8855.method1907(var3, false, var5, arg0, 34165, var5, var4, var4);
        }
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(I)I")
    public final int method264(int arg0) {
        ++field8858;
        return arg0 != -25792 ? 122 : this.field8855.field4455;
    }

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "(I)V")
    public final void method867(int arg0) {
        if (arg0 <= 12) {
            this.method268(false, (class167) null);
        }
        ++field8853;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILqa;Z)Lr;")
    public final class519 method254(int arg0, class167 arg1, boolean arg2) {
        ++field8869;
        if (arg2) {
            this.method264(105);
        }
        return this.field8855.method1908(arg0, -1, arg1, false, false, 0, 0);
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lqa;Ltk;IIIIIZIII)V")
    public class631(class167 arg0, class370 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class45.method408(arg9, (byte) 31, arg8));
        this.field8855 = new class308(arg0, arg1, arg8, arg9, arg2, arg3, super.field5156, super.field5151, arg7, arg10);
        this.field8856 = arg1.field5276 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(II)I")
    public static int method3567(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    static {
        new class567("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        new class567("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
        field8868 = new class340();
    }
}
