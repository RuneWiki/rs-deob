import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class31 extends class119 {

    @OriginalMember(owner = "client!na", name = "E", descriptor = "I")
    private int field463;

    @OriginalMember(owner = "client!na", name = "H", descriptor = "I")
    private int field466;

    @OriginalMember(owner = "client!na", name = "A", descriptor = "I")
    private int field459;

    @OriginalMember(owner = "client!na", name = "C", descriptor = "I")
    private int field461;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "[Lid;")
    public static class149[] field457 = new class149[100];

    @OriginalMember(owner = "client!na", name = "x", descriptor = "Lid;")
    public static class149 field456 = class60.method382("(U0a )2 non)2existant gosub script)2num: ", (byte) 114);

    @OriginalMember(owner = "client!na", name = "I", descriptor = "Lid;")
    public static class149 field467 = class60.method382("Votre liste d(Wamis est pleine (X100 noms maximum pour la version gratuite et 200 pour les abonn-Bs(Y)3", (byte) 35);

    @OriginalMember(owner = "client!na", name = "z", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!na", name = "B", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!na", name = "D", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!na", name = "F", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!na", name = "G", descriptor = "[[[Lra;")
    public static class231[][][] field465;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V")
    public static void method185(boolean arg0) {
        if (arg0) {
            field465 = null;
        }
        field457 = null;
        field456 = null;
        field465 = null;
        field467 = null;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(BII)V")
    public final void method186(byte arg0, int arg1, int arg2) {
        ++field462;
        int var4 = this.field459 * arg1 >> 12;
        if (arg0 < -39) {
            int var5 = this.field461 * arg1 >> 12;
            int var6 = this.field466 * arg2 >> 12;
            int var7 = this.field463 * arg2 >> 12;
            class37.method216(var4, super.field2038, -30374, var6, var7, var5);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BII)V")
    public final void method187(byte arg0, int arg1, int arg2) {
        if (arg0 == -36) {
            ++field458;
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(IIIIII)V")
    public class31(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field463 = arg3;
        this.field466 = arg1;
        this.field459 = arg2;
        this.field461 = arg0;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIB)V")
    public final void method188(int arg0, int arg1, byte arg2) {
        ++field460;
        if (arg2 != -67) {
            this.method186((byte) -101, 40, 40);
        }
    }
}
