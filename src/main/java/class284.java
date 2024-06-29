import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class284 {

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "Lmq;")
    private class104 field3895 = new class104(128);

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "Lfc;")
    private class343 field3897;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Llk;Z)Lpj;")
    public static final class289 method1759(class425 arg0, boolean arg1) {
        field3898++;
        return arg1 ? null : new class289(arg0.method2514(9786), arg0.method2514(9786), arg0.method2514(9786), arg0.method2514(9786), arg0.method2514(9786), arg0.method2514(9786), arg0.method2514(9786), arg0.method2514(9786), arg0.method2498(3), arg0.method2503(true));
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZB)V")
    public static final void method1760(boolean arg0, byte arg1) {
        field3894++;
        for (class462 var2 = (class462) class178.field2594.method1544(arg1 ^ 0xFFFFFF90); var2 != null; var2 = (class462) class178.field2594.method1546((byte) -42)) {
            if (var2.field6507 != null) {
                class386.field5445.method1313(var2.field6507);
                var2.field6507 = null;
            }
            if (var2.field6508 != null) {
                class386.field5445.method1313(var2.field6508);
                var2.field6508 = null;
            }
            var2.method1182(arg1 ^ 0x70A9);
        }
        if (arg1 != 59) {
            method1759((class425) null, false);
        }
        if (!arg0) {
            return;
        }
        for (class462 var3 = (class462) class366.field5213.method1544(-89); var3 != null; var3 = (class462) class366.field5213.method1546((byte) -42)) {
            if (var3.field6507 != null) {
                class386.field5445.method1313(var3.field6507);
                var3.field6507 = null;
            }
            var3.method1182(28818);
        }
        for (class462 var4 = (class462) class78.field1184.method2615((byte) -18); var4 != null; var4 = (class462) class78.field1184.method2619((byte) -98)) {
            if (var4.field6507 != null) {
                class386.field5445.method1313(var4.field6507);
                var4.field6507 = null;
            }
            var4.method1182(28818);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IZ)Lfa;")
    public final class310 method1761(int arg0, boolean arg1) {
        field3896++;
        class104 var3 = this.field3895;
        class310 var4;
        synchronized (this.field3895) {
            var4 = (class310) this.field3895.method659((long) arg0, (byte) -1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3897.method2029(class13.method113(arg0, (byte) 3), class208.method1307(arg0, 112), 0);
        class310 var6 = new class310();
        if (var5 != null) {
            var6.method1872(-31034, new class425(var5));
        }
        if (arg1) {
            return null;
        }
        class104 var7 = this.field3895;
        synchronized (this.field3895) {
            this.field3895.method653(82, (long) arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Ldk;ILfc;)V")
    public class284(class328 arg0, int arg1, class343 arg2) {
        this.field3897 = arg2;
        if (this.field3897 != null) {
            int var4 = this.field3897.method2027(97) - 1;
            this.field3897.method2054(0, var4);
        }
    }
}
