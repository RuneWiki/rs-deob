import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class203 {

    @OriginalMember(owner = "client!m", name = "e", descriptor = "Loo;")
    private class652 field3163 = new class652(64);

    @OriginalMember(owner = "client!m", name = "g", descriptor = "Lwia;")
    private class791 field3165;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V", line = 3)
    public final void method1420(int arg0, int arg1) {
        class652 var3 = this.field3163;
        synchronized (this.field3163) {
            if (arg1 != 1) {
                return;
            }
            this.field3163.method3741(arg0, 0);
        }
        field3161++;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II)V", line = 17)
    public final void method1421(int arg0, int arg1) {
        field3164++;
        class652 var3 = this.field3163;
        synchronized (this.field3163) {
            this.field3163.method3735(2);
            if (arg0 != 1) {
                this.field3165 = null;
            }
            this.field3163 = new class652(arg1);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V", line = 35)
    public final void method1422(int arg0) {
        if (arg0 < 92) {
            this.method1424(-105);
        }
        class652 var2 = this.field3163;
        synchronized (this.field3163) {
            this.field3163.method3743(8);
        }
        field3160++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BI)Lmfa;", line = 50)
    public final class641 method1423(byte arg0, int arg1) {
        field3159++;
        class652 var3 = this.field3163;
        class641 var4;
        synchronized (this.field3163) {
            if (arg0 != -55) {
                this.method1422(39);
            }
            var4 = (class641) this.field3163.method3742((byte) 67, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class791 var5 = this.field3165;
        byte[] var6;
        synchronized (this.field3165) {
            var6 = this.field3165.method4339(class730.method4086((byte) -70, arg1), 0, class411.method2497(1739125290, arg1));
        }
        class641 var7 = new class641();
        if (var6 != null) {
            var7.method3656(new class494(var6), -69);
        }
        class652 var8 = this.field3163;
        synchronized (this.field3163) {
            this.field3163.method3739((long) arg1, (byte) 112, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V", line = 80)
    public final void method1424(int arg0) {
        class652 var2 = this.field3163;
        synchronized (this.field3163) {
            this.field3163.method3735(2);
        }
        if (arg0 <= 11) {
            this.method1423((byte) 116, -86);
        }
        field3162++;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Ldt;ILwia;)V", line = 98)
    public class203(class252 arg0, int arg1, class791 arg2) {
        this.field3165 = arg2;
        if (this.field3165 != null) {
            int var4 = this.field3165.method4332((byte) -57) - 1;
            this.field3165.method4353(var4, true);
        }
    }
}
