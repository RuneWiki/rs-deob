import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class236 {

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "Lka;")
    private class473 field3266 = new class473(64);

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "Ldk;")
    private class421 field3265;

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "Z")
    public static boolean field3269 = true;

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
    public static int field3268 = -1;

    @OriginalMember(owner = "client!gv", name = "k", descriptor = "F")
    public static float field3272;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!gv", name = "j", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!gv", name = "l", descriptor = "[[B")
    public static byte[][] field3273;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
    public static final void method1442(int arg0) {
        field3270++;
        if (class223.field3146 != null) {
            class223.field3146.method3017(arg0 + 51);
        }
        if (class515.field7534 != null) {
            class515.field7534.method3017(88);
        }
        if (arg0 != 35) {
            method1442(115);
        }
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)V")
    public final void method1443(int arg0) {
        field3262++;
        class473 var2 = this.field3266;
        synchronized (this.field3266) {
            if (arg0 < 92) {
                this.method1443(-54);
            }
            this.field3266.method2774((byte) 98);
        }
    }

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "(I)V")
    public final void method1444(int arg0) {
        if (arg0 != 35) {
            this.field3265 = null;
        }
        field3271++;
        class473 var2 = this.field3266;
        synchronized (this.field3266) {
            this.field3266.method2764(-769);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILpf;)V")
    public static final void method1445(int arg0, class487 arg1) {
        if (arg0 != 35) {
            method1445(-11, null);
        }
        field3264++;
        class374 var2 = (class374) class481.field6955.method1592((byte) -25, (long) arg1.field179);
        if (var2 == null) {
            return;
        }
        if (var2.field5367 != null) {
            class290.field3924.method298(var2.field5367);
            var2.field5367 = null;
        }
        var2.method2791((byte) 112);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)Llh;")
    public final class100 method1446(int arg0, int arg1) {
        field3267++;
        class473 var3 = this.field3266;
        class100 var4;
        synchronized (this.field3266) {
            var4 = (class100) this.field3266.method2767((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class421 var5 = this.field3265;
        byte[] var6;
        synchronized (this.field3265) {
            var6 = this.field3265.method2512(35, (byte) -93, arg1);
        }
        class100 var7 = new class100();
        if (var6 != null) {
            var7.method791(76, new class319(var6));
        }
        var7.method788(2);
        class473 var8 = this.field3266;
        synchronized (this.field3266) {
            this.field3266.method2777(-1025, var7, (long) arg1);
            if (arg0 != 12167) {
                this.method1444(50);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "(I)V")
    public static void method1447(int arg0) {
        if (arg0 != 35) {
            field3269 = false;
        }
        field3273 = null;
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(II)V")
    public final void method1448(int arg0, int arg1) {
        if (arg1 != 35) {
            return;
        }
        class473 var3 = this.field3266;
        synchronized (this.field3266) {
            this.field3266.method2779(14896, arg0);
        }
        field3263++;
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lad;ILdk;)V")
    public class236(class12 arg0, int arg1, class421 arg2) {
        this.field3265 = arg2;
        if (this.field3265 != null) {
            this.field3265.method2509(0, 35);
        }
    }

    static {
        new class157("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
    }
}
