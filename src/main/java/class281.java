import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class281 {

    @OriginalMember(owner = "client!sea", name = "f", descriptor = "Lfba;")
    private class348 field3935 = new class348(16);

    @OriginalMember(owner = "client!sea", name = "h", descriptor = "Lla;")
    private class423 field3937;

    @OriginalMember(owner = "client!sea", name = "e", descriptor = "Lwk;")
    public static class431 field3934 = new class431();

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!sea", name = "d", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!sea", name = "g", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!sea", name = "i", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!sea", name = "j", descriptor = "Z")
    public static boolean field3939;

    @OriginalMember(owner = "client!sea", name = "c", descriptor = "[I")
    public static int[] field3932;

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(BI)V")
    public final void method1796(byte arg0, int arg1) {
        if (arg0 <= 83) {
            field3934 = null;
        }
        field3938++;
        class348 var3 = this.field3935;
        synchronized (this.field3935) {
            this.field3935.method2207(arg1, 1);
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(B)V")
    public static void method1797(byte arg0) {
        if (arg0 != 86) {
            method1801(33, (byte) -120);
        }
        field3932 = null;
        field3934 = null;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(II)Lgea;")
    public final class640 method1798(int arg0, int arg1) {
        field3931++;
        class348 var3 = this.field3935;
        class640 var4;
        synchronized (this.field3935) {
            var4 = (class640) this.field3935.method2216(arg1 - 27392, (long) arg0);
        }
        if (arg1 != 27392) {
            return null;
        } else if (var4 == null) {
            class423 var5 = this.field3937;
            byte[] var6;
            synchronized (this.field3937) {
                var6 = this.field3937.method2600(arg1 - 27392, 30, arg0);
            }
            class640 var7 = new class640();
            if (var6 != null) {
                var7.method3698(new class479(var6), 16777215);
            }
            class348 var8 = this.field3935;
            synchronized (this.field3935) {
                this.field3935.method2213((byte) -16, (long) arg0, var7);
                return var7;
            }
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)V")
    public final void method1799(int arg0) {
        class348 var2 = this.field3935;
        synchronized (this.field3935) {
            this.field3935.method2219(-5300);
        }
        int var3 = -33 / ((62 - arg0) / 39);
        field3936++;
    }

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(I)V")
    public final void method1800(int arg0) {
        if (arg0 != 30) {
            this.field3937 = null;
        }
        field3930++;
        class348 var2 = this.field3935;
        synchronized (this.field3935) {
            this.field3935.method2220(false);
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IB)Z")
    public static final boolean method1801(int arg0, byte arg1) {
        field3933++;
        if (arg1 >= -79) {
            return false;
        } else {
            return arg0 == 0 || arg0 == 1 || arg0 == 2;
        }
    }

    @OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lmp;ILla;)V")
    public class281(class315 arg0, int arg1, class423 arg2) {
        this.field3937 = arg2;
        this.field3937.method2616(30, 0);
    }
}
