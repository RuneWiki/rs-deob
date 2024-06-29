import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class553 {

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "Lof;")
    private class620 field7930 = new class620(128);

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "Loh;")
    private class404 field7922;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "Z")
    public static boolean field7923 = false;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "J")
    public static long field7927 = 0L;

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
    public static int field7924;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
    public static int field7926;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
    public static int field7928;

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "I")
    public static int field7929;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "[I")
    public static int[] field7925;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)V", line = 4)
    public final void method3240(byte arg0) {
        class620 var2 = this.field7930;
        synchronized (this.field7930) {
            this.field7930.method3541(-647);
        }
        field7924++;
        if (arg0 > -118) {
            method3243(false);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)V", line = 18)
    public final void method3241(boolean arg0) {
        field7929++;
        if (!arg0) {
            field7927 = -76L;
        }
        class620 var2 = this.field7930;
        synchronized (this.field7930) {
            this.field7930.method3549(0);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IB)V", line = 35)
    public final void method3242(int arg0, byte arg1) {
        field7928++;
        class620 var3 = this.field7930;
        synchronized (this.field7930) {
            this.field7930.method3539((byte) 121, arg0);
        }
        if (arg1 != -46) {
            field7927 = -10L;
        }
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(Z)V", line = 50)
    public static void method3243(boolean arg0) {
        field7925 = null;
        if (arg0) {
            method3243(false);
        }
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(IB)Lrq;", line = 65)
    public final class350 method3244(int arg0, byte arg1) {
        field7926++;
        class620 var3 = this.field7930;
        class350 var4;
        synchronized (this.field7930) {
            var4 = (class350) this.field7930.method3538((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class404 var5 = this.field7922;
        byte[] var6;
        synchronized (this.field7922) {
            var6 = this.field7922.method2481(1, arg0, (byte) 101);
            if (arg1 != -68) {
                this.method3241(true);
            }
        }
        class350 var7 = new class350();
        if (var6 != null) {
            var7.method2074(8034, new class244(var6));
        }
        class620 var8 = this.field7930;
        synchronized (this.field7930) {
            this.field7930.method3537(-128, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lnb;ILoh;)V", line = 104)
    public class553(class301 arg0, int arg1, class404 arg2) {
        this.field7922 = arg2;
        this.field7922.method2482(0, 1);
    }
}
