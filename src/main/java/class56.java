import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class56 {

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public int field688;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "Lqu;")
    public static class65 field690;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lba;III[Z)V")
    public static final void method514(class265 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class491.field7059 == class290.field4367) {
            return;
        }
        int var5 = class289.field4358[arg1].method412(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class145 var7 = class289.field4358[var6];
                if (var7 != null) {
                    var7.method413(arg0, arg2, var5 - var7.method412(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIIIII)Z")
    public static final boolean method515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg7 != 4268) {
            method514(null, -120, -50, -113, null);
        }
        field689++;
        if ((arg2 + arg6) > arg3 && arg6 < arg3 + arg1) {
            return arg0 < arg8 + arg5 && (arg0 + arg4) > arg8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V")
    public static void method516(byte arg0) {
        if (arg0 != -35) {
            field690 = null;
        }
        field690 = null;
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class56(String arg0, int arg1) {
        this.field688 = arg1;
    }

    @OriginalMember(owner = "client!kl", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field691++;
        throw new IllegalStateException();
    }

    static {
        new class234("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
        field690 = new class65(1, 2, 2, 0);
    }
}
