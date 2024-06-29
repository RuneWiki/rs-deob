import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class253 {

    @OriginalMember(owner = "client!caa", name = "h", descriptor = "Lwf;")
    private class117 field3651 = new class117(128);

    @OriginalMember(owner = "client!caa", name = "f", descriptor = "Lkda;")
    private class328 field3649;

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "Lh;")
    public static class572 field3646 = new class572(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

    @OriginalMember(owner = "client!caa", name = "j", descriptor = "Lee;")
    public static class582 field3653 = new class582();

    @OriginalMember(owner = "client!caa", name = "m", descriptor = "Lh;")
    public static class572 field3656 = new class572("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!caa", name = "l", descriptor = "F")
    public static float field3655;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!caa", name = "d", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!caa", name = "e", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!caa", name = "g", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!caa", name = "i", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!caa", name = "k", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIII)V", line = 3)
    public static final void method1627(String arg0, String arg1, String arg2, String arg3, int arg4, int arg5, int arg6, int arg7) {
        field3654++;
        class510 var8 = class574.field8452[99];
        for (int var9 = 99; var9 > 0; var9--) {
            class574.field8452[var9] = class574.field8452[var9 - 1];
        }
        if (var8 == null) {
            var8 = new class510(arg6, arg4, arg3, arg0, arg1, arg7, arg2);
        } else {
            var8.method3038(7, arg7, arg3, arg2, arg0, arg4, arg6, arg1);
        }
        class574.field8452[arg5] = var8;
        class228.field3342++;
        class263.field3743 = class226.field3283;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(II)V", line = 27)
    public final void method1628(int arg0, int arg1) {
        if (arg0 < 27) {
            field3652 = 110;
        }
        field3650++;
        class117 var3 = this.field3651;
        synchronized (this.field3651) {
            this.field3651.method834(arg1, 0);
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(B)V", line = 42)
    public static void method1629(byte arg0) {
        if (arg0 == -98) {
            field3646 = null;
            field3653 = null;
            field3656 = null;
        }
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(II)Ldp;", line = 56)
    public final class3 method1630(int arg0, int arg1) {
        field3648++;
        class117 var3 = this.field3651;
        class3 var4;
        synchronized (this.field3651) {
            var4 = (class3) this.field3651.method842(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class328 var5 = this.field3649;
        byte[] var6;
        synchronized (this.field3649) {
            var6 = this.field3649.method1966(arg1, 1, true);
        }
        class3 var7 = new class3();
        if (var6 != null) {
            var7.method9(new class148(var6), (byte) -123);
        }
        class117 var8 = this.field3651;
        synchronized (this.field3651) {
            int var9 = -18 / ((77 - arg0) / 43);
            this.field3651.method835((byte) 127, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(B)V", line = 101)
    public final void method1631(byte arg0) {
        field3645++;
        int var2 = -43 / ((-arg0 - 73) / 32);
        class117 var3 = this.field3651;
        synchronized (this.field3651) {
            this.field3651.method846(0);
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Z)V", line = 116)
    public final void method1632(boolean arg0) {
        field3647++;
        class117 var2 = this.field3651;
        synchronized (this.field3651) {
            if (!arg0) {
                field3655 = -0.059429288F;
            }
            this.field3651.method837(127);
        }
    }

    @OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(Lbt;ILkda;)V", line = 131)
    public class253(class39 arg0, int arg1, class328 arg2) {
        this.field3649 = arg2;
        this.field3649.method1975(108, 1);
    }
}
