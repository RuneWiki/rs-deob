import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class251 {

    @OriginalMember(owner = "client!io", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3397 = "Walk here";

    @OriginalMember(owner = "client!io", name = "a", descriptor = "Lfi;")
    public static class331 field3396 = new class331(64);

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!io", name = "f", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)V")
    public static void method1570(boolean arg0) {
        if (arg0) {
            field3396 = null;
        }
        field3397 = null;
        field3396 = null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IB)Lmh;")
    public static final class377 method1571(int arg0, byte arg1) {
        field3399++;
        class331 var2 = class123.field1633;
        class377 var3;
        synchronized (class123.field1633) {
            var3 = (class377) class123.field1633.method2049(-67, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class70.field790.method361(class338.method2175(arg0, (byte) -21), 127, class289.method1842((byte) 101, arg0));
        class377 var5 = new class377();
        var5.field5519 = arg0;
        if (var4 != null) {
            var5.method2378(new class211(var4), 8238);
        }
        class331 var6 = class123.field1633;
        synchronized (class123.field1633) {
            if (arg1 != 90) {
                method1571(-89, (byte) 6);
            }
            class123.field1633.method2046((long) arg0, arg1 ^ 0x5A, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
    public static final void method1572(int arg0) {
        field3400++;
        class167 var1 = null;
        try {
            class241 var2 = class323.field4554.method2379(true);
            if (arg0 >= -75) {
                return;
            }
            while (var2.field3268 == 0) {
                class278.method1757(1L, 0);
            }
            if (var2.field3268 == 1) {
                var1 = (class167) var2.field3270;
                byte[] var3 = new byte[(int) var1.method1106(0)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method1108(var3, (byte) -51, var4, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class178.method1166(49, new class211(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method1107((byte) -116);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(II)I")
    public static final int method1573(int arg0, int arg1) {
        field3398++;
        if (arg1 < 0) {
            return 0;
        }
        class417 var2 = (class417) class201.field2774.method1204((byte) -126, (long) arg1);
        if (var2 == null) {
            return class430.method2679(-99, arg1).field6483;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field5987.length; var4++) {
            if (var2.field5987[var4] == -1) {
                var3++;
            }
        }
        int var5 = var3 + (class430.method2679(-112, arg1).field6483 - var2.field5987.length);
        int var6 = -79 % ((56 - arg0) / 39);
        return var5;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ILqp;Lqp;)V")
    public static final void method1574(int arg0, class396 arg1, class396 arg2) {
        if (arg2.field5779 != null) {
            arg2.method2519(-2107);
        }
        field3401++;
        if (arg0 == -1) {
            arg2.field5779 = arg1;
            arg2.field5777 = arg1.field5777;
            arg2.field5779.field5777 = arg2;
            arg2.field5777.field5779 = arg2;
        }
    }
}
