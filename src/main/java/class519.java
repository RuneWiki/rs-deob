import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class519 {

    @OriginalMember(owner = "client!au", name = "e", descriptor = "Lad;")
    private class19 field7385 = new class19(64);

    @OriginalMember(owner = "client!au", name = "c", descriptor = "Ltf;")
    public class701 field7383;

    @OriginalMember(owner = "client!au", name = "d", descriptor = "Ltf;")
    private class701 field7384;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "I")
    public static int field7382;

    @OriginalMember(owner = "client!au", name = "f", descriptor = "I")
    public static int field7386;

    @OriginalMember(owner = "client!au", name = "g", descriptor = "I")
    public static int field7387;

    @OriginalMember(owner = "client!au", name = "h", descriptor = "I")
    public static int field7388;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "Lfg;")
    public static class174 field7381;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(B)V")
    public final void method2946(byte arg0) {
        if (arg0 <= 89) {
            this.field7383 = null;
        }
        field7388++;
        class19 var2 = this.field7385;
        synchronized (this.field7385) {
            this.field7385.method80((byte) 123);
        }
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(B)V")
    public final void method2947(byte arg0) {
        field7386++;
        class19 var2 = this.field7385;
        synchronized (this.field7385) {
            this.field7385.method88(arg0 ^ 0x25);
            if (arg0 != 107) {
                this.method2950(37, -115);
            }
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V")
    public static void method2948(int arg0) {
        if (arg0 == 5331) {
            field7381 = null;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(BI)Lhe;")
    public final class235 method2949(byte arg0, int arg1) {
        field7387++;
        class19 var3 = this.field7385;
        class235 var4;
        synchronized (this.field7385) {
            var4 = (class235) this.field7385.method78(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class701 var5 = this.field7384;
        byte[] var6;
        synchronized (this.field7384) {
            var6 = this.field7384.method3854((byte) 95, 3, arg1);
        }
        class235 var7 = new class235();
        var7.field2887 = this;
        if (var6 != null) {
            var7.method1399((byte) -75, new class115(var6));
        }
        if (arg0 >= -21) {
            this.field7383 = null;
        }
        class19 var8 = this.field7385;
        synchronized (this.field7385) {
            this.field7385.method92(1, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lqh;ILtf;Ltf;)V")
    public class519(class320 arg0, int arg1, class701 arg2, class701 arg3) {
        this.field7383 = arg3;
        this.field7384 = arg2;
        this.field7384.method3883(3, 0);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(II)V")
    public final void method2950(int arg0, int arg1) {
        class19 var3 = this.field7385;
        synchronized (this.field7385) {
            if (arg0 != 64) {
                field7381 = null;
            }
            this.field7385.method83((byte) -2, arg1);
        }
        field7382++;
    }
}
