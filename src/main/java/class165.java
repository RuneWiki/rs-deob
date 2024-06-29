import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class165 {

    @OriginalMember(owner = "client!g", name = "j", descriptor = "Loo;")
    private class652 field2611 = new class652(128);

    @OriginalMember(owner = "client!g", name = "k", descriptor = "Loo;")
    public class652 field2612 = new class652(64);

    @OriginalMember(owner = "client!g", name = "g", descriptor = "Lwia;")
    public class791 field2608;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "Lwia;")
    private class791 field2609;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "[I")
    public static int[] field2603 = null;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Lbr;", line = 6)
    public final class413 method1231(int arg0, int arg1) {
        field2606++;
        class652 var3 = this.field2611;
        class413 var4;
        synchronized (this.field2611) {
            var4 = (class413) this.field2611.method3742((byte) 67, (long) arg1);
            if (arg0 <= 40) {
                this.field2612 = null;
            }
        }
        if (var4 != null) {
            return var4;
        }
        class791 var5 = this.field2609;
        byte[] var6;
        synchronized (this.field2609) {
            var6 = this.field2609.method4339(arg1, 0, 36);
        }
        class413 var7 = new class413();
        var7.field5622 = arg1;
        var7.field5638 = this;
        if (var6 != null) {
            var7.method2500(new class494(var6), 11744);
        }
        var7.method2510((byte) -15);
        class652 var8 = this.field2611;
        synchronized (this.field2611) {
            this.field2611.method3739((long) arg1, (byte) 51, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZI)I", line = 42)
    public static final int method1232(boolean arg0, int arg1) {
        field2604++;
        if (arg1 != 64) {
            field2603 = null;
        }
        if (class63.field756 == null) {
            return 0;
        } else if (arg0 || class65.field792 == null) {
            int var2 = 0;
            for (int var3 = 0; var3 < class63.field756.length; var3++) {
                int var4 = class63.field756[var3];
                if (class268.field3900.method4349((byte) -102, var4)) {
                    var2++;
                }
                if (class452.field6351.method4349((byte) -102, var4)) {
                    var2++;
                }
            }
            return var2;
        } else {
            return class63.field756.length * 2;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V", line = 82)
    public final void method1233(int arg0) {
        field2607++;
        class652 var2 = this.field2611;
        synchronized (this.field2611) {
            this.field2611.method3743(8);
        }
        class652 var3 = this.field2612;
        synchronized (this.field2612) {
            if (arg0 != 2) {
                this.field2612 = null;
            }
            this.field2612.method3743(8);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V", line = 101)
    public final void method1234(boolean arg0) {
        field2610++;
        class652 var2 = this.field2611;
        synchronized (this.field2611) {
            if (!arg0) {
                method1232(true, 28);
            }
            this.field2611.method3735(2);
        }
        class652 var3 = this.field2612;
        synchronized (this.field2612) {
            this.field2612.method3735(2);
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(II)V", line = 117)
    public final void method1235(int arg0, int arg1) {
        field2602++;
        class652 var3 = this.field2611;
        synchronized (this.field2611) {
            this.field2611.method3741(arg1, 0);
        }
        class652 var4 = this.field2612;
        synchronized (this.field2612) {
            this.field2612.method3741(arg1, 0);
            if (arg0 > -90) {
                field2603 = null;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V", line = 133)
    public static void method1236(int arg0) {
        field2603 = null;
        if (arg0 != 36) {
            method1236(74);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(III)V", line = 144)
    public final void method1237(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method1235(2, -102);
        }
        field2605++;
        this.field2611 = new class652(arg0);
        this.field2612 = new class652(arg2);
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Ldt;ILwia;Lwia;)V", line = 168)
    public class165(class252 arg0, int arg1, class791 arg2, class791 arg3) {
        this.field2608 = arg3;
        this.field2609 = arg2;
        this.field2609.method4353(36, true);
    }
}
