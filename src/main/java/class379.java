import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class379 implements class486 {

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public int field5533;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "Log;")
    public class673 field5527;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Lgi;")
    public class705 field5529;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public int field5531;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public int field5532;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field5526 = 4;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "Z")
    public static boolean field5528 = false;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)Leo;", line = 17)
    public class313 method576(byte arg0) {
        field5535++;
        return arg0 == 41 ? class50.field576 : null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLjava/lang/String;)V", line = 30)
    public static final void method2366(byte arg0, String arg1) {
        field5530++;
        if (!class506.field7094 || (class384.field5578 & 0x18) == 0) {
            return;
        }
        if (arg0 != 11) {
            field5526 = -107;
        }
        boolean var2 = false;
        int var3 = class652.field8795;
        int[] var4 = class497.field6986;
        for (int var5 = 0; var5 < var3; var5++) {
            class758 var6 = class84.field1204[var4[var5]];
            if (var6.field10367 != null && var6.field10367.equalsIgnoreCase(arg1) && (class625.field8475 == var6 && (class384.field5578 & 0x10) != 0 || var6 != null && (class384.field5578 & 0x8) != 0)) {
                class426.field6203++;
                class43 var7 = class492.method2903(class737.field10004, 0, class73.field983);
                var7.field457.method1725(0, 54);
                var7.field457.method1686(-51, class294.field4170);
                var7.field457.method1733(class658.field8875, -32466);
                var7.field457.method1718((byte) -34, var4[var5]);
                var7.field457.method1697(class634.field8567, true);
                class409.method2457((byte) -100, var7);
                class307.method1985(-2, var6.field6198[0], var6.method2563(arg0 ^ 0xFFFFCDD3), var6.method2563(arg0 ^ 0xFFFFCDD3), 0, true, 0, var6.field6197[0], true);
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class743.method4082(-126, 4, class58.field718.method365(class55.field647, (byte) 116) + arg1);
        }
        if (class506.field7094) {
            class579.method3278(-1);
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(ILog;Lgi;II)V", line = 87)
    public class379(int arg0, class673 arg1, class705 arg2, int arg3, int arg4) {
        this.field5533 = arg3;
        this.field5527 = arg1;
        this.field5529 = arg2;
        this.field5531 = arg4;
        this.field5532 = arg0;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V", line = 99)
    public static final void method2367(int arg0) {
        field5534++;
        class279.field4047 = 0;
        class743.field10049 = 0;
        for (int var1 = 0; var1 < class441.field6352; var1++) {
            int var2 = class1.field2 * var1;
            for (int var3 = 0; var3 < class1.field2; var3++) {
                int var4 = var2 + var3;
                class204.field2635[var4].method3507(class533.field7397 * var3, class607.field8210 * var1, class533.field7397, class607.field8210, 0, 0, true, true);
            }
        }
        if (arg0 != -5073) {
            method2366((byte) -121, null);
        }
    }
}
