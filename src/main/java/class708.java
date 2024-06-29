import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class708 {

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "Loo;")
    private class652 field9849 = new class652(64);

    @OriginalMember(owner = "client!ufa", name = "h", descriptor = "I")
    public int field9853 = 0;

    @OriginalMember(owner = "client!ufa", name = "f", descriptor = "Lwia;")
    private class791 field9851;

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "I")
    public int field9848;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "I")
    public static int field9846;

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "I")
    public static int field9847;

    @OriginalMember(owner = "client!ufa", name = "e", descriptor = "I")
    public static int field9850;

    @OriginalMember(owner = "client!ufa", name = "g", descriptor = "I")
    public static int field9852;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ZI)V")
    public final void method3996(boolean arg0, int arg1) {
        field9847++;
        class652 var3 = this.field9849;
        synchronized (this.field9849) {
            if (arg0) {
                this.field9849.method3741(arg1, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)V")
    public final void method3997(byte arg0) {
        class652 var2 = this.field9849;
        synchronized (this.field9849) {
            this.field9849.method3735(2);
        }
        if (arg0 < 104) {
            this.method3998(102, -52);
        }
        field9846++;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(II)Ljp;")
    public final class374 method3998(int arg0, int arg1) {
        field9852++;
        class652 var3 = this.field9849;
        class374 var4;
        synchronized (this.field9849) {
            var4 = (class374) this.field9849.method3742((byte) 67, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class791 var5 = this.field9851;
        byte[] var6;
        synchronized (this.field9851) {
            var6 = this.field9851.method4339(arg1, 0, 4);
        }
        class374 var7 = new class374();
        var7.field5173 = this;
        var7.field5162 = arg1;
        if (var6 != null) {
            var7.method2320(new class494(var6), 1287);
        }
        var7.method2321(38);
        class652 var8 = this.field9849;
        synchronized (this.field9849) {
            this.field9849.method3739((long) arg1, (byte) 13, var7);
        }
        if (arg0 != 64) {
            this.field9851 = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)V")
    public final void method3999(int arg0) {
        field9850++;
        class652 var2 = this.field9849;
        synchronized (this.field9849) {
            this.field9849.method3743(8);
            int var3 = 38 % ((arg0 + 45) / 43);
        }
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(Ldt;ILwia;)V")
    public class708(class252 arg0, int arg1, class791 arg2) {
        this.field9851 = arg2;
        this.field9848 = this.field9851.method4353(4, true);
    }
}
