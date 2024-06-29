import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public abstract class class607 {

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "Ltu;")
    public class294 field8870;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "[[F")
    public static float[][] field8871;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field8864;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field8865;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field8866;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field8867;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field8868;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field8869;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public void method3006(int arg0) {
        if (arg0 != -15201) {
            this.method806(true);
        }
        field8864++;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public static void method3530(byte arg0) {
        field8871 = null;
        if (arg0 != 25) {
            method3530((byte) 70);
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public void method813(int arg0) {
        field8869++;
        if (arg0 != -8635) {
            this.field8870 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)Z")
    public abstract boolean method814(byte arg0);

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
    public void method3005(int arg0) {
        field8866++;
        if (arg0 != 17367) {
            this.method806(false);
        }
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)V")
    public abstract void method805(byte arg0);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V")
    public void method2065(boolean arg0) {
        field8867++;
        if (!arg0) {
            this.field8870 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZB)V")
    public abstract void method811(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V")
    public void method3007(int arg0) {
        field8868++;
        if (arg0 != -18969) {
            this.method813(24);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBLiu;)V")
    public abstract void method810(int arg0, byte arg1, class502 arg2);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V")
    public abstract void method815(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Ltu;)V")
    public class607(class294 arg0) {
        this.field8870 = arg0;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)V")
    public void method806(boolean arg0) {
        if (arg0) {
            field8865++;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZ)V")
    public abstract void method808(int arg0, boolean arg1);

    static {
        new class474("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
        field8871 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };
    }
}
