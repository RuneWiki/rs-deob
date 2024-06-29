import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class278 {

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "Lhu;")
    private class76 field3683 = new class76(256);

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "Lr;")
    private class110 field3681;

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "[Z")
    public static boolean[] field3687 = new boolean[5];

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "Lkk;")
    public static class114 field3682 = new class114("LIVE", 0);

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(BI)Lck;")
    public final class419 method1568(byte arg0, int arg1) {
        field3686++;
        class76 var3 = this.field3683;
        class419 var4;
        synchronized (this.field3683) {
            var4 = (class419) this.field3683.method493((byte) 19, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        } else if (arg0 <= 13) {
            return null;
        } else {
            byte[] var5 = this.field3681.method702((byte) 71, arg1, 26);
            class419 var6 = new class419();
            if (var5 != null) {
                var6.method2492(new class32(var5), (byte) 39);
            }
            class76 var7 = this.field3683;
            synchronized (this.field3683) {
                this.field3683.method505((long) arg1, var6, 46);
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(BI)V")
    public final void method1569(byte arg0, int arg1) {
        field3685++;
        class76 var3 = this.field3683;
        synchronized (this.field3683) {
            if (arg0 != -37) {
                field3682 = null;
            }
            this.field3683.method496(arg1, 69);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V")
    public final void method1570(byte arg0) {
        field3688++;
        if (arg0 > -20) {
            method1571(false);
        }
        class76 var2 = this.field3683;
        synchronized (this.field3683) {
            this.field3683.method502(0);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)V")
    public static void method1571(boolean arg0) {
        if (!arg0) {
            method1571(false);
        }
        field3682 = null;
        field3687 = null;
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Ldn;ILr;)V")
    public class278(class329 arg0, int arg1, class110 arg2) {
        this.field3681 = arg2;
        this.field3681.method694(26, (byte) 119);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V")
    public final void method1572(int arg0) {
        field3684++;
        class76 var2 = this.field3683;
        synchronized (this.field3683) {
            if (arg0 <= 30) {
                this.field3683 = null;
            }
            this.field3683.method495(-121);
        }
    }
}
