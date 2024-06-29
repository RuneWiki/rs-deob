import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class658 {

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "Lgg;")
    private class114 field9039 = new class114(64);

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public int field9046 = 0;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "Lkha;")
    private class687 field9042;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public int field9044;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "S")
    public static short field9040 = 256;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field9043 = 0;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Lfq;")
    public static class141 field9037 = new class141(4, 1, 1, 1);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field9035;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field9036;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field9038;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field9041;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field9045;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)Lwm;", line = 4)
    public final class424 method3570(int arg0, int arg1) {
        field9041++;
        class114 var3 = this.field9039;
        class424 var4;
        synchronized (this.field9039) {
            var4 = (class424) this.field9039.method778((long) arg1, arg0 + 99);
        }
        if (var4 != null) {
            return var4;
        }
        class687 var5 = this.field9042;
        byte[] var6;
        synchronized (this.field9042) {
            var6 = this.field9042.method3810(arg0, -23360, arg1);
        }
        class424 var7 = new class424();
        var7.field6046 = this;
        var7.field6037 = arg1;
        if (var6 != null) {
            var7.method2526(arg0 + 90, new class179(var6));
        }
        var7.method2527(-87);
        class114 var8 = this.field9039;
        synchronized (this.field9039) {
            this.field9039.method774((long) arg1, -25, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)V", line = 36)
    public final void method3571(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method3571(70, -92);
        }
        field9035++;
        class114 var3 = this.field9039;
        synchronized (this.field9039) {
            this.field9039.method775(arg0 + 1, arg1);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V", line = 52)
    public static final void method3572(byte arg0) {
        if (arg0 < 17) {
            field9043 = -9;
        }
        if (class347.field4493 == null) {
            class393 var1 = new class393();
            byte[] var2 = var1.method2345(128, -1, 128, 16);
            class347.field4493 = class574.method3222(var2, (byte) -81, false);
        }
        field9036++;
        if (class38.field564 == null) {
            class367 var3 = new class367();
            byte[] var4 = var3.method2255(132733924, 128, 16, 128);
            class38.field564 = class574.method3222(var4, (byte) -101, false);
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V", line = 86)
    public final void method3573(byte arg0) {
        class114 var2 = this.field9039;
        synchronized (this.field9039) {
            this.field9039.method781((byte) 47);
        }
        if (arg0 != 50) {
            method3572((byte) -89);
        }
        field9045++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 99)
    public final void method3574(int arg0) {
        class114 var2 = this.field9039;
        synchronized (this.field9039) {
            this.field9039.method776((byte) 76);
        }
        if (arg0 != 17291) {
            this.method3573((byte) 4);
        }
        field9038++;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)V", line = 113)
    public static void method3575(byte arg0) {
        if (arg0 < 66) {
            field9043 = 22;
        }
        field9037 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIILtd;Ltd;)V", line = 127)
    public static final void method3576(int arg0, int arg1, int arg2, class525 arg3, class525 arg4) {
        class73 var5 = class663.method3590(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field973 = arg3;
        var5.field961 = arg4;
        int var6 = class517.field7282 == class109.field1341 ? 1 : 0;
        if (!arg3.method265((byte) 124)) {
            arg3.field5793 = class293.field3797[var6];
            class293.field3797[var6] = arg3;
        } else if (arg3.method256((byte) 94)) {
            arg3.field5793 = class466.field6722[var6];
            class466.field6722[var6] = arg3;
        } else {
            arg3.field5793 = class684.field9445[var6];
            class684.field9445[var6] = arg3;
            class571.field7967 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method265((byte) 122)) {
            if (arg4.method256((byte) 123)) {
                arg4.field5793 = class466.field6722[var6];
                class466.field6722[var6] = arg4;
                return;
            }
            arg4.field5793 = class684.field9445[var6];
            class684.field9445[var6] = arg4;
            class571.field7967 = true;
            return;
        }
        arg4.field5793 = class293.field3797[var6];
        class293.field3797[var6] = arg4;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Ldh;ILkha;)V", line = 198)
    public class658(class286 arg0, int arg1, class687 arg2) {
        this.field9042 = arg2;
        this.field9044 = this.field9042.method3812(0, 4);
    }
}
