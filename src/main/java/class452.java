import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class452 {

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "Lka;")
    private class473 field6618 = new class473(64);

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "Lka;")
    public class473 field6627 = new class473(30);

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "Ldk;")
    private class421 field6626;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "Ldk;")
    public class421 field6623;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "Lkc;")
    public static class157 field6625 = new class157(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field6616;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field6619;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field6620;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field6621;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public int field6628;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "Lpk;")
    public static class77 field6629;

    static {
        new class157("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIZIII)V", line = 4)
    public static final void method2649(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        field6619++;
        if (!arg6) {
            field6625 = null;
        }
        class65 var10 = null;
        for (class65 var11 = (class65) class463.field6690.method3137(0); var11 != null; var11 = (class65) class463.field6690.method3132(0)) {
            if (var11.field935 == arg1 && var11.field931 == arg9 && var11.field929 == arg4 && var11.field943 == arg3) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class65();
            var10.field931 = arg9;
            var10.field929 = arg4;
            var10.field935 = arg1;
            var10.field943 = arg3;
            if (arg9 >= 0 && arg4 >= 0 && arg9 < class9.field111 && class192.field2809 > arg4) {
                class288.method1651((byte) 37, var10);
            }
            class463.field6690.method3139(0, var10);
        }
        var10.field940 = arg2;
        var10.field927 = arg7;
        var10.field937 = arg0;
        var10.field942 = arg8;
        var10.field939 = arg5;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V", line = 49)
    public static void method2650(byte arg0) {
        if (arg0 >= 87) {
            field6629 = null;
            field6625 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)Lsr;", line = 64)
    public final class350 method2651(byte arg0, int arg1) {
        field6617++;
        class473 var3 = this.field6618;
        class350 var4;
        synchronized (this.field6618) {
            var4 = (class350) this.field6618.method2767((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class421 var5 = this.field6626;
        byte[] var6;
        synchronized (this.field6626) {
            var6 = this.field6626.method2512(class402.method2377((byte) -33, arg1), (byte) -93, class123.method896((byte) -56, arg1));
        }
        class350 var7 = new class350();
        var7.field5096 = this;
        var7.field5088 = arg1;
        if (arg0 != 59) {
            this.field6623 = null;
        }
        if (var6 != null) {
            var7.method2097(new class319(var6), true);
        }
        class473 var8 = this.field6618;
        synchronized (this.field6618) {
            this.field6618.method2777(-1025, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V", line = 100)
    public final void method2652(int arg0, int arg1) {
        this.field6628 = arg1;
        field6620++;
        class473 var3 = this.field6627;
        synchronized (this.field6627) {
            this.field6627.method2764(arg0 - 833);
        }
        if (arg0 != 64) {
            this.field6623 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(BI)V", line = 117)
    public final void method2653(byte arg0, int arg1) {
        int var3 = -1 / ((arg0 - 4) / 48);
        class473 var4 = this.field6618;
        synchronized (this.field6618) {
            this.field6618.method2779(14896, arg1);
        }
        field6616++;
        class473 var5 = this.field6627;
        synchronized (this.field6627) {
            this.field6627.method2779(14896, arg1);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V", line = 132)
    public final void method2654(boolean arg0) {
        if (!arg0) {
            return;
        }
        class473 var2 = this.field6618;
        synchronized (this.field6618) {
            this.field6618.method2774((byte) -66);
        }
        field6622++;
        class473 var3 = this.field6627;
        synchronized (this.field6627) {
            this.field6627.method2774((byte) 121);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIB)I", line = 149)
    public static final int method2655(int arg0, int arg1, byte arg2) {
        field6624++;
        if (arg1 == -2) {
            return 12345678;
        }
        if (arg2 <= 42) {
            field6625 = null;
        }
        if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        }
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V", line = 185)
    public final void method2656(byte arg0) {
        class473 var2 = this.field6618;
        synchronized (this.field6618) {
            this.field6618.method2764(-769);
        }
        field6621++;
        if (arg0 < 76) {
            this.method2652(-10, 92);
        }
        class473 var3 = this.field6627;
        synchronized (this.field6627) {
            this.field6627.method2764(-769);
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lad;ILdk;Ldk;)V", line = 220)
    public class452(class12 arg0, int arg1, class421 arg2, class421 arg3) {
        this.field6626 = arg2;
        this.field6623 = arg3;
        int var5 = this.field6626.method2493((byte) -41) - 1;
        this.field6626.method2509(0, var5);
    }
}
