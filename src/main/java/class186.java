import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class186 {

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "Z")
    public static boolean field2524 = false;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "Liba;")
    public static class211 field2521 = new class211(53, -1);

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    public static int field2525 = -1;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
    public static final void method1234(int arg0) {
        field2523++;
        class2.field15.method2470(126);
        class547.field8069.method2790((byte) -121);
        class177.field2477.method3579(126);
        class60.field965.method2597(126);
        class563.field8235.method1088(false);
        class259.field3355.method2390((byte) 127);
        class203.field2769.method2972(11);
        class134.field1945.method3080(90);
        class449.field6504.method1957(arg0 - 89);
        class683.field9635.method1378(29445);
        class547.field8070.method405((byte) -119);
        class652.field9331.method231(11702);
        class189.field2572.method2751(arg0);
        class586.field8507.method1448(112);
        class141.field2041.method1502(-1);
        class251.field3294.method374((byte) 95);
        class274.field3588.method178(false);
        class342.field5068.method2766(17696);
        class252.field3301.method741((byte) -98);
        class503.field7119.method67((byte) 72);
        class8.method47(false);
        class533.method3088(16384);
        class528.method2992(false);
        class509.method2893((byte) 78);
        class508.method2886(-1);
        class86.field1341.method3891(13747);
        class218.field2908.method3891(13747);
        class630.field9122.method3891(13747);
        class693.field9788.method3891(arg0 ^ 0x35B3);
        class195.field2634.method3891(13747);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)Llc;")
    public static final class653 method1235(int arg0, int arg1) {
        field2522++;
        if (arg0 >= -83) {
            method1234(-128);
        }
        class653 var2 = (class653) class129.field1856.method3720(-116, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class587.field8518.method1844(arg1, 31330, 0);
        if (var3 == null || var3.length <= 1) {
            return null;
        }
        class653 var4;
        try {
            var4 = class579.method3323(-114, var3);
        } catch (Exception var6) {
            throw new RuntimeException(var6.getMessage() + " S: " + arg1);
        }
        class129.field1856.method3716(var4, (byte) -24, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
    public static void method1236(int arg0) {
        field2521 = null;
        if (arg0 != 31984) {
            field2524 = true;
        }
    }
}
