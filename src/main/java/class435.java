import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class435 {

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "Lmf;")
    private class382 field6353 = new class382(64);

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public int field6356 = 0;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "Lpu;")
    private class522 field6355;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public int field6352;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field6351;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field6357;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V", line = 6)
    public final void method2584(int arg0) {
        field6348++;
        class382 var2 = this.field6353;
        synchronized (this.field6353) {
            this.field6353.method2285((byte) -102);
            if (arg0 >= -67) {
                this.method2585(-91, (byte) -13);
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)V", line = 20)
    public final void method2585(int arg0, byte arg1) {
        field6349++;
        class382 var3 = this.field6353;
        synchronized (this.field6353) {
            this.field6353.method2290(false, arg0);
        }
        if (arg1 != 63) {
            this.field6355 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)Ltca;", line = 40)
    public final class156 method2586(int arg0, int arg1) {
        field6350++;
        if (arg0 != -20216) {
            field6354 = -114;
        }
        class382 var3 = this.field6353;
        class156 var4;
        synchronized (this.field6353) {
            var4 = (class156) this.field6353.method2287(1, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field6355;
        byte[] var6;
        synchronized (this.field6355) {
            var6 = this.field6355.method3007(4, arg1, arg0 ^ 0xFFFFB10D);
        }
        class156 var7 = new class156();
        var7.field2247 = arg1;
        var7.field2246 = this;
        if (var6 != null) {
            var7.method1087(new class695(var6), 10);
        }
        var7.method1086(arg0 + 20728);
        class382 var8 = this.field6353;
        synchronized (this.field6353) {
            this.field6353.method2291(var7, (long) arg1, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V", line = 75)
    public final void method2587(int arg0) {
        class382 var2 = this.field6353;
        synchronized (this.field6353) {
            this.field6353.method2279(0);
        }
        field6351++;
        int var3 = 48 % ((arg0 + 54) / 52);
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lkr;ILpu;)V", line = 94)
    public class435(class693 arg0, int arg1, class522 arg2) {
        this.field6355 = arg2;
        this.field6352 = this.field6355.method2988(119, 4);
    }
}
