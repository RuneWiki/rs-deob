import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public abstract class class33 {

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field609 = 0;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Led;")
    private static class43 field610 = class191.method1219("Your account is already logged in)3", false);

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "Led;")
    public static class43 field613 = class191.method1219("<br>(X100(U(Y", false);

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "Led;")
    public static class43 field616 = class191.method1219("(Udns", false);

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field611 = 0;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "Led;")
    public static class43 field612 = field610;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Lga;")
    public static class58 field615;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "[Luh;")
    public static class189[] field614;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public abstract void method186(boolean arg0, Component arg1);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIBI)V")
    public static final void method187(int arg0, int arg1, byte arg2, int arg3) {
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var7 = 0; var7 < 8; var7++) {
                class158.field3203[arg0][arg1 + var4][arg3 + var7] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class158.field3203[arg0][arg1][arg3 + var5] = class158.field3203[arg0][arg1 - 1][arg3 + var5];
            }
        }
        if (arg3 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class158.field3203[arg0][arg1 + var6][arg3] = class158.field3203[arg0][arg1 + var6][arg3 - 1];
            }
        }
        field608++;
        if (arg1 > 0 && class158.field3203[arg0][arg1 - 1][arg3] != 0) {
            class158.field3203[arg0][arg1][arg3] = class158.field3203[arg0][arg1 - 1][arg3];
        } else if (arg3 > 0 && class158.field3203[arg0][arg1][arg3 - 1] != 0) {
            class158.field3203[arg0][arg1][arg3] = class158.field3203[arg0][arg1][arg3 - 1];
        } else if (arg1 > 0 && arg3 > 0 && class158.field3203[arg0][arg1 - 1][arg3 - 1] != 0) {
            class158.field3203[arg0][arg1][arg3] = class158.field3203[arg0][arg1 - 1][arg3 - 1];
        }
        if (arg2 != 126) {
            field617 = 6;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public static final void method188(byte arg0) {
        if (arg0 != 38) {
            field617 = 98;
        }
        field618++;
        class38.field725.method729(-83);
        class5.field113 = null;
        class158.field3206 = 1;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)I")
    public static int method189(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method190(Component arg0, int arg1);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)I")
    public abstract int method191(boolean arg0);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static void method192(int arg0) {
        field616 = null;
        if (arg0 != -1) {
            field614 = null;
        }
        field610 = null;
        field614 = null;
        field613 = null;
        field612 = null;
        field615 = null;
    }
}
