import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class287 extends OutputStream {

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "Lvt;")
    public static class344 field3755 = new class344("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "Lqa;")
    public static class167 field3757;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)Lck;")
    public static final class8 method1777(int arg0, int arg1, int arg2) {
        class563 var3 = class199.field2605[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7884;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIII)V")
    public static final void method1778(int arg0, int arg1, int arg2, int arg3) {
        field3756++;
        class632 var4 = class641.method3699(-121, arg2, arg1);
        var4.method3656(0);
        var4.field9198 = arg3;
        var4.field9197 = arg0;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V")
    public static void method1779(boolean arg0) {
        field3757 = null;
        field3755 = null;
        if (!arg0) {
            field3758 = 14;
        }
    }

    @OriginalMember(owner = "client!mb", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field3754++;
        throw new IOException();
    }
}
