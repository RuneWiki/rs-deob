import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class295 {

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public int field4199;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public int field4201;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public int field4203;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public int field4204;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIII[BI)V")
    public static final void method1868(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field4200++;
        if (arg5 <= arg3) {
            return;
        }
        if (arg2 != 100) {
            method1869(null, (byte) -74, null);
        }
        int var6 = arg0 + arg3;
        int var7 = arg5 - arg3 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg5 - arg3 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg4[var6++] = 1;
                }
            }
            arg4[var6++] = 1;
            arg4[var6++] = 1;
            arg4[var6++] = 1;
            arg4[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/awt/Frame;BLge;)V")
    public static final void method1869(Frame arg0, byte arg1, class711 arg2) {
        while (true) {
            class197 var3 = arg2.method4044(arg0, arg1 ^ 0xFFFFFFAB);
            while (var3.field2986 == 0) {
                class277.method1759(10L, 63);
            }
            if (var3.field2986 == 1) {
                field4198++;
                arg0.setVisible(false);
                if (arg1 != -34) {
                    method1869(null, (byte) -114, null);
                }
                arg0.dispose();
                return;
            }
            class277.method1759(100L, 96);
        }
    }
}
