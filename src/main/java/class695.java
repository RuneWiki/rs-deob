import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class695 {

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "Loo;")
    private class652 field9703 = new class652(128);

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "Lwia;")
    private class791 field9702;

    @OriginalMember(owner = "client!gba", name = "i", descriptor = "Lpha;")
    public static class174 field9709 = new class174("", 19);

    @OriginalMember(owner = "client!gba", name = "l", descriptor = "[Lim;")
    public static class596[] field9712 = new class596[37];

    @OriginalMember(owner = "client!gba", name = "m", descriptor = "S")
    public static short field9713 = 1;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "I")
    public static int field9701;

    @OriginalMember(owner = "client!gba", name = "d", descriptor = "I")
    public static int field9704;

    @OriginalMember(owner = "client!gba", name = "e", descriptor = "I")
    public static int field9705;

    @OriginalMember(owner = "client!gba", name = "f", descriptor = "I")
    public static int field9706;

    @OriginalMember(owner = "client!gba", name = "g", descriptor = "I")
    public static int field9707;

    @OriginalMember(owner = "client!gba", name = "j", descriptor = "Ljc;")
    public static class462 field9710;

    @OriginalMember(owner = "client!gba", name = "h", descriptor = "Lgj;")
    public static class660 field9708;

    @OriginalMember(owner = "client!gba", name = "k", descriptor = "[Lje;")
    public static class421[] field9711;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(II)V", line = 7)
    public final void method3920(int arg0, int arg1) {
        field9705++;
        if (arg1 == -22893) {
            class652 var3 = this.field9703;
            synchronized (this.field9703) {
                this.field9703.method3741(arg0, 0);
            }
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)V", line = 20)
    public final void method3921(int arg0) {
        class652 var2 = this.field9703;
        synchronized (this.field9703) {
            this.field9703.method3735(2);
            if (arg0 != 17988) {
                this.field9702 = null;
            }
        }
        field9701++;
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(I)V", line = 34)
    public static void method3922(int arg0) {
        field9710 = null;
        field9712 = null;
        field9709 = null;
        field9711 = null;
        if (arg0 != 11) {
            method3923(109, false);
        }
        field9708 = null;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IZ)Z", line = 52)
    public static final boolean method3923(int arg0, boolean arg1) {
        field9706++;
        if (arg1) {
            return true;
        } else {
            return arg0 == 10 || arg0 == 11 || arg0 == 12;
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(B)V", line = 63)
    public final void method3924(byte arg0) {
        field9707++;
        if (arg0 <= 30) {
            field9710 = null;
        }
        class652 var2 = this.field9703;
        synchronized (this.field9703) {
            this.field9703.method3743(8);
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(ZI)Llda;", line = 77)
    public final class510 method3925(boolean arg0, int arg1) {
        field9704++;
        class652 var3 = this.field9703;
        class510 var4;
        synchronized (this.field9703) {
            var4 = (class510) this.field9703.method3742((byte) 67, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class791 var5 = this.field9702;
        byte[] var6;
        synchronized (this.field9702) {
            var6 = this.field9702.method4339(arg1, 0, 1);
        }
        if (!arg0) {
            field9712 = null;
        }
        class510 var7 = new class510();
        if (var6 != null) {
            var7.method3088(new class494(var6), -4399);
        }
        class652 var8 = this.field9703;
        synchronized (this.field9703) {
            this.field9703.method3739((long) arg1, (byte) 80, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Ldt;ILwia;)V", line = 119)
    public class695(class252 arg0, int arg1, class791 arg2) {
        this.field9702 = arg2;
        this.field9702.method4353(1, true);
    }
}
