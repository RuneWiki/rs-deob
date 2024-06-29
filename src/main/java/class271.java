import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class271 {

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "I")
    public int field3838;

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "Lh;")
    public static class572 field3836 = new class572("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "Z")
    public static boolean field3843;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(II)Z")
    public static final boolean method1707(int arg0, int arg1) {
        field3842++;
        if (arg0 <= 47) {
            return true;
        } else {
            return arg1 == 16 || arg1 == 5 || arg1 == 1002 || arg1 == 2 || arg1 == 10;
        }
    }

    @OriginalMember(owner = "client!fp", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3837++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZIILte;[II)Lrp;")
    public static final class371 method1708(boolean arg0, int arg1, int arg2, class527 arg3, int[] arg4, int arg5) {
        field3839++;
        if (arg5 < 3) {
            field3836 = null;
        }
        if (!arg3.field7806 && (!class452.method2749(arg1, false) || !class452.method2749(arg2, false))) {
            return arg3.field7814 ? new class371(arg3, 34037, arg1, arg2, arg0, arg4) : new class371(arg3, arg1, arg2, class322.method1938(arg1, 62), class322.method1938(arg2, 116), arg4);
        } else {
            return new class371(arg3, 3553, arg1, arg2, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(I)V")
    public class271(int arg0) {
        this.field3838 = arg0;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
    public static final void method1709(int arg0) {
        field3840++;
        if (class215.field3163 != -1) {
            class42.method269((byte) 114, -1, -1, class215.field3163, false);
            class215.field3163 = -1;
        }
        int var1 = -14 % ((41 - arg0) / 34);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Z)V")
    public static void method1710(boolean arg0) {
        field3836 = null;
        if (arg0) {
            field3843 = true;
        }
    }
}
