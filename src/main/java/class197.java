import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class197 {

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "Lmga;")
    private class666 field2873 = new class666(128);

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "Lbi;")
    private class449 field2879;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "Lff;")
    public static class9 field2878 = new class9(0);

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
    public final void method1274(int arg0) {
        field2874++;
        class666 var2 = this.field2873;
        synchronized (this.field2873) {
            if (arg0 != -6022) {
                this.field2879 = null;
            }
            this.field2873.method3748(6);
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
    public static void method1275(int arg0) {
        if (arg0 >= 74) {
            field2878 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)V")
    public final void method1276(int arg0) {
        field2875++;
        class666 var2 = this.field2873;
        synchronized (this.field2873) {
            if (arg0 != -2861) {
                this.field2879 = null;
            }
            this.field2873.method3739(0);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZI)Lhr;")
    public final class491 method1277(boolean arg0, int arg1) {
        field2881++;
        class666 var3 = this.field2873;
        class491 var4;
        synchronized (this.field2873) {
            var4 = (class491) this.field2873.method3750((long) arg1, false);
        }
        if (var4 != null) {
            return var4;
        }
        class449 var5 = this.field2879;
        byte[] var6;
        synchronized (this.field2879) {
            var6 = this.field2879.method2537(arg0, 1, arg1);
        }
        class491 var7 = new class491();
        if (var6 != null) {
            var7.method2741((byte) 113, new class335(var6));
        }
        class666 var8 = this.field2873;
        synchronized (this.field2873) {
            this.field2873.method3745(1, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(I)V")
    public static final void method1278(int arg0) {
        if (class655.field8871 != arg0) {
            class111.method886(-1, class655.field8871, false, 13, -1);
            class655.field8871 = -1;
        }
        field2877++;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static final void method1279(int arg0, String arg1, boolean arg2) {
        field2880++;
        class80.field1260++;
        if (!arg2) {
            return;
        }
        class402 var3 = class390.method2252(class400.field5315, -127, class262.field3644);
        var3.field5354.method1980(-345277664, class580.method3186(117, arg1) + 1);
        var3.field5354.method2019(-115, arg1);
        var3.field5354.method2012((byte) 71, arg0);
        class36.method278(0, var3);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)V")
    public final void method1280(int arg0, int arg1) {
        class666 var3 = this.field2873;
        synchronized (this.field2873) {
            this.field2873.method3740((byte) 60, arg1);
        }
        field2876++;
        if (arg0 <= 65) {
            this.method1274(-60);
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lpca;ILbi;)V")
    public class197(class671 arg0, int arg1, class449 arg2) {
        this.field2879 = arg2;
        this.field2879.method2527(0, 1);
    }
}
