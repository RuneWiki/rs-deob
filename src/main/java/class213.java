import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class213 extends class132 {

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "Lvd;")
    public static class222 field3946 = class212.method1357("Spieler kann nicht gefunden werden: ", 10731);

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
    public static int field3950 = 0;

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "Lvd;")
    private static class222 field3953 = class212.method1357("Unable to connect)3", 10731);

    @OriginalMember(owner = "client!ue", name = "G", descriptor = "Lvd;")
    private static class222 field3959 = class212.method1357("Starting 3d library", 10731);

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "Lvd;")
    public static class222 field3948 = field3953;

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "Lvd;")
    public static class222 field3957 = field3959;

    @OriginalMember(owner = "client!ue", name = "B", descriptor = "Lvd;")
    public static class222 field3954 = field3953;

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "Lvd;")
    public static class222 field3962 = class212.method1357("Bitte geben Sie Ihr Passwort ein)3", 10731);

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!ue", name = "D", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!ue", name = "H", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "Lue;")
    public class213 field3949;

    @OriginalMember(owner = "client!ue", name = "F", descriptor = "Lue;")
    public class213 field3958;

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "[[Z")
    public static boolean[][] field3961;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZILve;Ls;)V")
    public static final void method1358(boolean arg0, int arg1, class223 arg2, class188 arg3) {
        byte[] var4 = null;
        class28 var5 = class185.field3420;
        synchronized (class185.field3420) {
            for (class174 var6 = (class174) class185.field3420.method236(0); var6 != null; var6 = (class174) class185.field3420.method237(true)) {
                if ((long) arg1 == var6.field2555 && var6.field3268 == arg3 && var6.field3267 == 0) {
                    var4 = var6.field3274;
                    break;
                }
            }
        }
        field3963++;
        if (var4 == null) {
            byte[] var7 = arg3.method1182(arg1, -1786);
            arg2.method1460(28068, var7, arg0, arg3, arg1);
        } else {
            arg2.method1460(28068, var4, true, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 >= -12) {
            return -9;
        }
        if ((arg0 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg5;
            arg5 = var7;
        }
        int var8 = arg3 & 0x3;
        field3952++;
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return arg2;
        } else if (var8 == 2) {
            return 1 + 7 - arg4 - arg6;
        } else {
            return 1 + 7 - arg5 - arg2;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(JI)V")
    public static final void method1360(long arg0, int arg1) {
        field3947++;
        try {
            Thread.sleep(arg0);
            if (arg1 > -120) {
                field3954 = null;
            }
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)I")
    public static int method1361(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)V")
    public final void method1362(int arg0) {
        field3960++;
        if (arg0 != -2) {
            method1363(true);
        }
        if (this.field3958 != null) {
            this.field3958.field3949 = this.field3949;
            this.field3949.field3958 = this.field3958;
            this.field3949 = null;
            this.field3958 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
    public static void method1363(boolean arg0) {
        if (!arg0) {
            field3959 = null;
        }
        field3957 = null;
        field3948 = null;
        field3954 = null;
        field3962 = null;
        field3946 = null;
        field3953 = null;
        field3959 = null;
        field3961 = null;
    }
}
