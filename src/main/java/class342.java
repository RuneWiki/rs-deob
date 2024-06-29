import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class342 {

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "Lnj;")
    private class162 field4928 = new class162(64);

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "Lmg;")
    private class101 field4927;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public final void method2030(int arg0) {
        if (arg0 != 3105) {
            this.method2032(102, (byte) -96);
        }
        field4930++;
        class162 var2 = this.field4928;
        synchronized (this.field4928) {
            this.field4928.method1068(0);
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
    public static final void method2031(int arg0) {
        field4929++;
        if (arg0 != -2) {
            method2031(65);
        }
        if (class266.field3671 == null) {
            return;
        }
        if (class266.field3671.field667 == 1) {
            class266.field3671 = null;
            return;
        }
        if (class266.field3671.field667 == 2) {
            class329.method1905(class231.field3256, (byte) 116, 2, class432.field6340);
            class266.field3671 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB)V")
    public final void method2032(int arg0, byte arg1) {
        if (arg1 != 123) {
            this.field4927 = null;
        }
        field4926++;
        class162 var3 = this.field4928;
        synchronized (this.field4928) {
            this.field4928.method1065((byte) -95, arg0);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BI)Ljl;")
    public final class177 method2033(byte arg0, int arg1) {
        field4925++;
        int var3 = -105 / ((24 - arg0) / 52);
        class162 var4 = this.field4928;
        class177 var5;
        synchronized (this.field4928) {
            var5 = (class177) this.field4928.method1073((long) arg1, false);
        }
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = this.field4927.method727(arg1, 11, 60);
        class177 var7 = new class177();
        if (var6 != null) {
            var7.method1145(new class391(var6), -98);
        }
        class162 var8 = this.field4928;
        synchronized (this.field4928) {
            this.field4928.method1072((long) arg1, var7, false);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V")
    public final void method2034(int arg0) {
        field4931++;
        if (arg0 > 4) {
            class162 var2 = this.field4928;
            synchronized (this.field4928) {
                this.field4928.method1066(4080);
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lal;ILmg;)V")
    public class342(class66 arg0, int arg1, class101 arg2) {
        this.field4927 = arg2;
        if (this.field4927 != null) {
            this.field4927.method753(11, -62);
        }
    }
}
