import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class69 {

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "Lwf;")
    private class117 field875 = new class117(64);

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "Lwf;")
    public class117 field879 = new class117(64);

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "Lkda;")
    public class328 field873;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "Lkda;")
    private class328 field871;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "Lada;")
    public static class144 field877 = new class144(36, -2);

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "Lada;")
    public static class144 field878 = new class144(109, -1);

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public static int field876;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kl", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field880;

    // $FF: synthetic method
    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method549(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIBI)Z", line = 5)
    public static final boolean method542(int arg0, int arg1, byte arg2, int arg3) {
        field872++;
        boolean var4 = true;
        class231 var5 = (class231) class169.method1205(arg1, arg3, arg0);
        if (arg2 < 12) {
            return false;
        }
        if (var5 != null) {
            var4 &= class522.method3079(var5, -120);
        }
        class231 var6 = (class231) class624.method3650(arg1, arg3, arg0, field880 == null ? (field880 = method549("up")) : field880);
        if (var6 != null) {
            var4 &= class522.method3079(var6, 119);
        }
        class231 var7 = (class231) class440.method2560(arg1, arg3, arg0);
        if (var7 != null) {
            var4 &= class522.method3079(var7, -59);
        }
        return var4;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 41)
    public final void method543(int arg0) {
        if (arg0 < 63) {
            return;
        }
        class117 var2 = this.field875;
        synchronized (this.field875) {
            this.field875.method846(0);
        }
        field876++;
        class117 var3 = this.field879;
        synchronized (this.field879) {
            this.field879.method846(0);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)V", line = 57)
    public final void method544(int arg0, int arg1) {
        field874++;
        class117 var3 = this.field875;
        synchronized (this.field875) {
            if (arg0 >= -99) {
                this.method547(-37, -59, -67);
            }
            this.field875.method834(arg1, 0);
        }
        class117 var4 = this.field879;
        synchronized (this.field879) {
            this.field879.method834(arg1, 0);
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(II)Lit;", line = 73)
    public final class554 method545(int arg0, int arg1) {
        field868++;
        class117 var3 = this.field875;
        class554 var4;
        synchronized (this.field875) {
            var4 = (class554) this.field875.method842(arg1 ^ 0x22, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class328 var5 = this.field871;
        byte[] var6;
        synchronized (this.field871) {
            var6 = this.field871.method1966(arg0, arg1, true);
        }
        class554 var7 = new class554();
        var7.field8250 = this;
        if (var6 != null) {
            var7.method3351(new class148(var6), 0);
        }
        class117 var8 = this.field875;
        synchronized (this.field875) {
            this.field875.method835((byte) 121, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V", line = 106)
    public final void method546(int arg0) {
        field867++;
        class117 var2 = this.field875;
        synchronized (this.field875) {
            if (arg0 != 64) {
                this.field871 = null;
            }
            this.field875.method837(127);
        }
        class117 var3 = this.field879;
        synchronized (this.field879) {
            this.field879.method837(127);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)V", line = 123)
    public final void method547(int arg0, int arg1, int arg2) {
        field870++;
        if (arg0 != 16581) {
            this.field875 = null;
        }
        this.field875 = new class117(arg1);
        this.field879 = new class117(arg2);
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V", line = 135)
    public static void method548(int arg0) {
        if (arg0 != 109) {
            field877 = null;
        }
        field878 = null;
        field877 = null;
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lbt;ILkda;Lkda;)V", line = 165)
    public class69(class39 arg0, int arg1, class328 arg2, class328 arg3) {
        this.field873 = arg3;
        this.field871 = arg2;
        this.field871.method1975(34, 34);
    }
}
