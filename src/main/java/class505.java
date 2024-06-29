import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class505 {

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "J")
    public static long field7369 = 0L;

    @OriginalMember(owner = "client!lu", name = "g", descriptor = "I")
    public static int field7374 = 0;

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "I")
    public static int field7373 = 0;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "I")
    public static int field7368;

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "I")
    public static int field7370;

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "I")
    public static int field7371;

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "I")
    public static int field7372;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)V")
    public static final void method3030(byte arg0) {
        field7370++;
        for (class358 var1 = (class358) class378.field5531.method1892(85); var1 != null; var1 = (class358) class378.field5531.method1893((byte) -2)) {
            if (var1.field5268) {
                var1.method2208(112);
            }
        }
        for (class358 var2 = (class358) class492.field7212.method1892(110); var2 != null; var2 = (class358) class492.field7212.method1893((byte) -2)) {
            if (var2.field5268) {
                var2.method2208(58);
            }
        }
        if (arg0 != 58) {
            method3032(-36, -75, 72, 30, -101);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(III)Z")
    public static final boolean method3031(int arg0, int arg1, int arg2) {
        field7368++;
        int var3 = 88 / ((arg0 - 69) / 50);
        return (arg1 & 0x40000) != 0 | class355.method2192(arg1, (byte) 85, arg2) || class181.method1237(arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIII)V")
    public static final void method3032(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7372++;
        class18 var5 = class140.method1047(10, arg3, false);
        if (arg4 < -46) {
            var5.method122(true);
            var5.field284 = arg0;
            var5.field283 = arg2;
            var5.field291 = arg1;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(BZ)V")
    public static final void method3033(byte arg0, boolean arg1) {
        if (arg0 > 120) {
            field7371++;
            class106.method912((byte) 104, class71.field1415, arg1, class65.field1330, class155.field2523);
        }
    }
}
