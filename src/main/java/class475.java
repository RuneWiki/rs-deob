import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class475 {

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Loo;")
    private class652 field6653 = new class652(256);

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Lwia;")
    private class791 field6650;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field6652 = 0;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field6649;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field6651;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field6655;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field6656;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
    public final void method2822(boolean arg0) {
        class652 var2 = this.field6653;
        synchronized (this.field6653) {
            this.field6653.method3743(8);
        }
        field6649++;
        if (!arg0) {
            this.field6650 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lmea;III)V")
    public static final void method2823(class451 arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 256) {
            field6656++;
            class312.field4448 = arg2;
            class549.field7893 = arg0;
            class198.field3020 = arg1;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public final void method2824(int arg0) {
        field6651++;
        if (arg0 != 0) {
            this.field6653 = null;
        }
        class652 var2 = this.field6653;
        synchronized (this.field6653) {
            this.field6653.method3735(2);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IB)V")
    public final void method2825(int arg0, byte arg1) {
        class652 var3 = this.field6653;
        synchronized (this.field6653) {
            this.field6653.method3741(arg0, 0);
        }
        field6655++;
        if (arg1 <= 74) {
            this.method2826(100, (byte) 54);
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(IB)Lew;")
    public final class517 method2826(int arg0, byte arg1) {
        field6654++;
        class652 var3 = this.field6653;
        class517 var4;
        synchronized (this.field6653) {
            var4 = (class517) this.field6653.method3742((byte) 67, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class791 var5 = this.field6650;
        byte[] var6;
        synchronized (this.field6650) {
            var6 = this.field6650.method4339(arg0, 0, 26);
        }
        class517 var7 = new class517();
        if (arg1 > -91) {
            this.method2826(-29, (byte) 82);
        }
        if (var6 != null) {
            var7.method3115(true, new class494(var6));
        }
        class652 var8 = this.field6653;
        synchronized (this.field6653) {
            this.field6653.method3739((long) arg0, (byte) 70, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Ldt;ILwia;)V")
    public class475(class252 arg0, int arg1, class791 arg2) {
        this.field6650 = arg2;
        this.field6650.method4353(26, true);
    }
}
