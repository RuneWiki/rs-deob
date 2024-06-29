import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public class class21 {

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "Lof;")
    private class620 field191 = new class620(64);

    @OriginalMember(owner = "client!qia", name = "d", descriptor = "Loh;")
    private class404 field194;

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!qia", name = "c", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!qia", name = "e", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!qia", name = "f", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(I)V", line = 6)
    public final void method95(int arg0) {
        class620 var2 = this.field191;
        synchronized (this.field191) {
            this.field191.method3541(-647);
        }
        field196++;
        if (arg0 != -7316) {
            this.method96(47, -16);
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(II)V", line = 19)
    public final void method96(int arg0, int arg1) {
        class620 var3 = this.field191;
        synchronized (this.field191) {
            if (arg0 != 11) {
                return;
            }
            this.field191.method3539((byte) -79, arg1);
        }
        field195++;
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(B)V", line = 33)
    public final void method97(byte arg0) {
        class620 var2 = this.field191;
        synchronized (this.field191) {
            this.field191.method3549(0);
        }
        field193++;
        int var3 = 27 / ((12 - arg0) / 62);
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(ZI)Led;", line = 46)
    public final class703 method98(boolean arg0, int arg1) {
        field192++;
        class620 var3 = this.field191;
        class703 var4;
        synchronized (this.field191) {
            var4 = (class703) this.field191.method3538((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class404 var5 = this.field194;
        byte[] var6;
        synchronized (this.field194) {
            if (!arg0) {
                this.method97((byte) 92);
            }
            var6 = this.field194.method2481(11, arg1, (byte) 116);
        }
        class703 var7 = new class703();
        if (var6 != null) {
            var7.method3945((byte) 63, new class244(var6));
        }
        class620 var8 = this.field191;
        synchronized (this.field191) {
            this.field191.method3537(74, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(Lnb;ILoh;)V", line = 84)
    public class21(class301 arg0, int arg1, class404 arg2) {
        this.field194 = arg2;
        if (this.field194 != null) {
            this.field194.method2482(0, 11);
        }
    }
}
