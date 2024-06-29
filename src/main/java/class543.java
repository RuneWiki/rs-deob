import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class543 {

    @OriginalMember(owner = "client!hv", name = "l", descriptor = "Loo;")
    private class652 field7806 = new class652(64);

    @OriginalMember(owner = "client!hv", name = "q", descriptor = "Loo;")
    public class652 field7811 = new class652(2);

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "Lwia;")
    public class791 field7796;

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "Lwia;")
    private class791 field7799;

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "Lok;")
    public static class266 field7798 = new class266();

    @OriginalMember(owner = "client!hv", name = "j", descriptor = "[S")
    private static short[] field7804 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!hv", name = "k", descriptor = "[S")
    private static short[] field7805 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!hv", name = "n", descriptor = "[F")
    public static float[] field7808 = new float[4];

    @OriginalMember(owner = "client!hv", name = "m", descriptor = "[S")
    private static short[] field7807 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!hv", name = "p", descriptor = "[[S")
    public static short[][] field7810 = new short[][] { field7804, field7807, field7805 };

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "I")
    public static int field7795;

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "I")
    public static int field7797;

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "I")
    public static int field7800;

    @OriginalMember(owner = "client!hv", name = "g", descriptor = "I")
    public static int field7801;

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "I")
    public static int field7802;

    @OriginalMember(owner = "client!hv", name = "i", descriptor = "I")
    public static int field7803;

    @OriginalMember(owner = "client!hv", name = "o", descriptor = "I")
    public static int field7809;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Z)V", line = 3)
    public final void method3243(boolean arg0) {
        field7800++;
        class652 var2 = this.field7806;
        synchronized (this.field7806) {
            this.field7806.method3735(2);
        }
        class652 var3 = this.field7811;
        synchronized (this.field7811) {
            this.field7811.method3735(2);
        }
        if (arg0) {
            method3245(false);
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(BI)V", line = 22)
    public static final void method3244(byte arg0, int arg1) {
        class652 var2 = class663.field9221;
        synchronized (class663.field9221) {
            if (arg0 >= -14) {
                method3245(true);
            }
            class663.field9221.method3741(arg1, 0);
        }
        field7809++;
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(Z)V", line = 40)
    public static void method3245(boolean arg0) {
        field7810 = null;
        field7805 = null;
        field7808 = null;
        field7804 = null;
        field7798 = null;
        if (arg0) {
            field7810 = null;
        }
        field7807 = null;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)V", line = 62)
    public final void method3246(byte arg0) {
        class652 var2 = this.field7806;
        synchronized (this.field7806) {
            this.field7806.method3743(8);
            if (arg0 != 101) {
                field7810 = null;
            }
        }
        field7801++;
        class652 var3 = this.field7811;
        synchronized (this.field7811) {
            this.field7811.method3743(8);
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(II)Lii;", line = 79)
    public final class578 method3247(int arg0, int arg1) {
        if (arg0 != 33) {
            method3244((byte) 10, 13);
        }
        field7803++;
        class652 var3 = this.field7806;
        class578 var4;
        synchronized (this.field7806) {
            var4 = (class578) this.field7806.method3742((byte) 67, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class791 var5 = this.field7799;
        byte[] var6;
        synchronized (this.field7799) {
            var6 = this.field7799.method4339(arg1, 0, 33);
        }
        class578 var7 = new class578();
        var7.field8147 = this;
        if (var6 != null) {
            var7.method3393(-1, new class494(var6));
        }
        class652 var8 = this.field7806;
        synchronized (this.field7806) {
            this.field7806.method3739((long) arg1, (byte) 12, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ZI)V", line = 113)
    public final void method3248(boolean arg0, int arg1) {
        if (!arg0) {
            method3249(63);
        }
        class652 var3 = this.field7806;
        synchronized (this.field7806) {
            this.field7806.method3741(arg1, 0);
        }
        field7802++;
        class652 var4 = this.field7811;
        synchronized (this.field7811) {
            this.field7811.method3741(arg1, 0);
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)Lso;", line = 139)
    public static final class494 method3249(int arg0) {
        field7795++;
        class494 var1 = class480.method2860(false);
        var1.method3003((long) arg0, (byte) 123);
        var1.method2953(class694.field9678, -28136);
        var1.method3003(class189.field2920, (byte) 109);
        var1.method3003(class26.field393, (byte) 113);
        var1.method2949(class255.field3750, class167.field2638, 1866000624);
        return var1;
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Ldt;ILwia;Lwia;)V", line = 171)
    public class543(class252 arg0, int arg1, class791 arg2, class791 arg3) {
        this.field7796 = arg3;
        this.field7799 = arg2;
        this.field7799.method4353(33, true);
    }
}
