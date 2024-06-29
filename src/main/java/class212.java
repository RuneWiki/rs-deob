import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class212 {

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "Lhu;")
    private class76 field2857 = new class76(64);

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "Lr;")
    private class110 field2853;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "Lh;")
    public static class434 field2852 = new class434(95, 8);

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "[I")
    public static int[] field2854 = new int[13];

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V", line = 6)
    public static void method1198(boolean arg0) {
        field2854 = null;
        if (arg0) {
            method1198(false);
        }
        field2852 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V", line = 18)
    public final void method1199(int arg0) {
        field2849++;
        if (arg0 != 32) {
            method1198(true);
        }
        class76 var2 = this.field2857;
        synchronized (this.field2857) {
            this.field2857.method495(-71);
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V", line = 31)
    public final void method1200(int arg0) {
        class76 var2 = this.field2857;
        synchronized (this.field2857) {
            this.field2857.method502(0);
            if (arg0 != 12580) {
                this.method1201(73, false);
            }
        }
        field2856++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)V", line = 44)
    public final void method1201(int arg0, boolean arg1) {
        class76 var3 = this.field2857;
        synchronized (this.field2857) {
            this.field2857.method496(arg0, 72);
        }
        field2850++;
        if (!arg1) {
            this.field2857 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)I", line = 57)
    public static final int method1202(int arg0, int arg1, int arg2) {
        field2855++;
        if (arg0 != -16100) {
            method1198(true);
        }
        int var3 = arg2 >> 31 & arg1 - 1;
        return ((arg2 >>> 31) + arg2) % arg1 + var3;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Lti;", line = 76)
    public final class280 method1203(int arg0, int arg1) {
        field2851++;
        class76 var3 = this.field2857;
        class280 var4;
        synchronized (this.field2857) {
            var4 = (class280) this.field2857.method493((byte) 19, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2853.method702((byte) -90, arg0, 32);
        class280 var6 = new class280();
        if (var5 != null) {
            var6.method1579(new class32(var5), 2186);
        }
        class76 var7 = this.field2857;
        synchronized (this.field2857) {
            this.field2857.method505((long) arg0, var6, 83);
        }
        int var8 = 93 / ((arg1 - 11) / 56);
        return var6;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Ldn;ILr;)V", line = 115)
    public class212(class329 arg0, int arg1, class110 arg2) {
        this.field2853 = arg2;
        this.field2853.method694(32, (byte) 119);
    }
}
