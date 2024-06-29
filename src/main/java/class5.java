import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 {

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Loo;")
    private class652 field41 = new class652(64);

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "Lwia;")
    private class791 field35;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "Ltga;")
    public static class63 field34;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Lufa;")
    public static class708 field40;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Lwia;")
    public static class791 field36;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V", line = 8)
    public static void method30(byte arg0) {
        if (arg0 > 51) {
            field40 = null;
            field36 = null;
            field34 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V", line = 22)
    public final void method31(int arg0) {
        class652 var2 = this.field41;
        synchronized (this.field41) {
            if (arg0 != -4826) {
                field34 = null;
            }
            this.field41.method3743(8);
        }
        field37++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V", line = 38)
    public final void method32(int arg0, int arg1) {
        field39++;
        class652 var3 = this.field41;
        synchronized (this.field41) {
            this.field41.method3741(arg1, arg0 ^ arg0);
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)Lev;", line = 50)
    public final class720 method33(int arg0, int arg1) {
        field47++;
        class652 var3 = this.field41;
        class720 var4;
        synchronized (this.field41) {
            var4 = (class720) this.field41.method3742((byte) 67, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        } else if (arg0 < 56) {
            return null;
        } else {
            class791 var5 = this.field35;
            byte[] var6;
            synchronized (this.field35) {
                var6 = this.field35.method4339(arg1, 0, 31);
            }
            class720 var7 = new class720();
            if (var6 != null) {
                var7.method4031(new class494(var6), (byte) 116);
            }
            class652 var8 = this.field41;
            synchronized (this.field41) {
                this.field41.method3739((long) arg1, (byte) 118, var7);
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)V", line = 81)
    public final void method34(byte arg0) {
        if (arg0 != 11) {
            field34 = null;
        }
        field42++;
        class652 var2 = this.field41;
        synchronized (this.field41) {
            this.field41.method3735(2);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[S[Ljava/lang/String;)V", line = 101)
    public static final void method35(int arg0, short[] arg1, String[] arg2) {
        field38++;
        class506.method3050(arg1, arg2.length + arg0, (byte) 108, 0, arg2);
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Ldt;ILwia;)V", line = 112)
    public class5(class252 arg0, int arg1, class791 arg2) {
        this.field35 = arg2;
        this.field35.method4353(31, true);
    }
}
