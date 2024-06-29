import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class773 {

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "Ljda;")
    public class239 field10649 = new class239(20);

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "Ljda;")
    private class239 field10651 = new class239(64);

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "Laj;")
    private class333 field10647;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "Laj;")
    public class333 field10648;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "Ljw;")
    public static class581 field10643 = new class581(34, 7);

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field10641;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field10642;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field10644;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field10645;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field10646;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field10650;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V", line = 4)
    public final void method4281(int arg0) {
        field10642++;
        if (arg0 > -97) {
            return;
        }
        class239 var2 = this.field10651;
        synchronized (this.field10651) {
            this.field10651.method1555((byte) -3);
        }
        class239 var3 = this.field10649;
        synchronized (this.field10649) {
            this.field10649.method1555((byte) -3);
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V", line = 22)
    public static void method4282(int arg0) {
        if (arg0 != 34) {
            method4282(51);
        }
        field10643 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lor;II)I", line = 34)
    public static final int method4283(class668 arg0, int arg1, int arg2) {
        field10644++;
        if (!client.method2022(arg0).method842(19061, arg2) && arg0.field9250 == null) {
            return -1;
        } else {
            if (arg1 != -1) {
                method4283(null, -63, -84);
            }
            return arg0.field9224 == null || arg0.field9224.length <= arg2 ? -1 : arg0.field9224[arg2];
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)V", line = 53)
    public final void method4284(int arg0, byte arg1) {
        class239 var3 = this.field10651;
        synchronized (this.field10651) {
            this.field10651.method1546(arg0, (byte) -8);
            if (arg1 != 63) {
                field10643 = null;
            }
        }
        field10646++;
        class239 var4 = this.field10649;
        synchronized (this.field10649) {
            this.field10649.method1546(arg0, (byte) -8);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)Lnv;", line = 70)
    public final class441 method4285(int arg0, int arg1) {
        field10641++;
        class239 var3 = this.field10651;
        class441 var4;
        synchronized (this.field10651) {
            var4 = (class441) this.field10651.method1541(-10, (long) arg0);
            if (arg1 != -18112) {
                this.field10648 = null;
            }
        }
        if (var4 != null) {
            return var4;
        }
        class333 var5 = this.field10647;
        byte[] var6;
        synchronized (this.field10647) {
            var6 = this.field10647.method2095(arg0, 46, arg1 + 18113);
        }
        class441 var7 = new class441();
        var7.field6213 = this;
        if (var6 != null) {
            var7.method2657(new class376(var6), (byte) 73);
        }
        class239 var8 = this.field10651;
        synchronized (this.field10651) {
            this.field10651.method1544(true, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)Llda;", line = 105)
    public static final class513 method4286(int arg0, int arg1) {
        if (arg1 != 46) {
            method4286(1, 90);
        }
        field10650++;
        return class168.field2262 && class620.field8351 <= arg0 && class767.field10587 >= arg0 ? class124.field1825[arg0 - class620.field8351] : null;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V", line = 121)
    public final void method4287(int arg0) {
        if (arg0 > -77) {
            method4286(-72, 34);
        }
        class239 var2 = this.field10651;
        synchronized (this.field10651) {
            this.field10651.method1552(-126);
        }
        field10645++;
        class239 var3 = this.field10649;
        synchronized (this.field10649) {
            this.field10649.method1552(-125);
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lgia;ILaj;Laj;)V", line = 147)
    public class773(class285 arg0, int arg1, class333 arg2, class333 arg3) {
        this.field10647 = arg2;
        this.field10648 = arg3;
        this.field10647.method2090(46, false);
    }
}
