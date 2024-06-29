import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class45 {

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "Lhf;")
    private class363 field802 = new class363();

    @OriginalMember(owner = "client!gp", name = "i", descriptor = "Ljava/lang/String;")
    public String field809;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!gp", name = "k", descriptor = "I")
    private volatile int field811;

    @OriginalMember(owner = "client!gp", name = "j", descriptor = "Lgu;")
    private class536 field810;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(BLjava/lang/String;ILjava/lang/String;)V")
    public static final void method530(byte arg0, String arg1, int arg2, String arg3) {
        class611.field8763 = 2;
        if (arg0 > -97) {
            method534(49, -91);
        }
        field805++;
        class168.field2054 = arg2;
        class256.method1559(arg3, false, (byte) 23, arg1);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)Z")
    public final boolean method531(int arg0) {
        field801++;
        int var2 = 107 % ((32 - arg0) / 49);
        return this.field811 == 0;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Llb;I)V")
    public final void method532(class503 arg0, int arg1) {
        class363 var3 = this.field802;
        synchronized (this.field802) {
            this.field802.method2071((byte) 79, arg0);
            this.field811++;
        }
        field808++;
        if (arg1 == 16686 && this.field810 != null) {
            class536 var4 = this.field810;
            synchronized (this.field810) {
                this.field810.notify();
            }
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lub;B)V")
    public final void method533(class20 arg0, byte arg1) {
        if (arg1 != 38) {
            return;
        }
        field806++;
        arg0.field538 = true;
        class363 var3 = this.field802;
        synchronized (this.field802) {
            this.field802.method2071((byte) -70, arg0);
            this.field811++;
        }
        if (this.field810 != null) {
            class536 var4 = this.field810;
            synchronized (this.field810) {
                this.field810.notify();
            }
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(II)I")
    public static final int method534(int arg0, int arg1) {
        return class206.field2475 == null ? 0 : class206.field2475[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZLub;)V")
    public final void method535(boolean arg0, class20 arg1) {
        field807++;
        arg1.field538 = arg0;
        class363 var3 = this.field802;
        synchronized (this.field802) {
            this.field802.method2071((byte) -69, arg1);
            this.field811++;
        }
        if (this.field810 != null) {
            class536 var4 = this.field810;
            synchronized (this.field810) {
                this.field810.notify();
            }
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lgu;Z)V")
    public final void method536(class536 arg0, boolean arg1) {
        field804++;
        this.field810 = arg0;
        if (arg1) {
            this.method532(null, 63);
        }
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)Lsj;")
    public final class426 method537(int arg0) {
        field803++;
        int var2 = 118 / ((arg0 + 66) / 58);
        Object var3 = null;
        class363 var4 = this.field802;
        synchronized (this.field802) {
            class426 var5 = this.field802.method2070((byte) -113);
            var5.method2564((byte) 2);
            this.field811--;
            return var5;
        }
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class45(String arg0) {
        this.field809 = arg0;
    }
}
