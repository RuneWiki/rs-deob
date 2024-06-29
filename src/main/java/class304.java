import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class304 extends class455 {

    @OriginalMember(owner = "client!on", name = "q", descriptor = "I")
    public int field4530;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Ljava/lang/String;ZB)V", line = 3)
    public static final void method1941(String arg0, boolean arg1, byte arg2) {
        field4526++;
        class512.method2929((byte) -118, -1, arg0, -1, arg1);
        if (arg2 == -37) {
            ;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IBLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V", line = 14)
    public static final void method1942(int arg0, byte arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7, int arg8) {
        field4529++;
        class576 var9 = class85.field1395[99];
        for (int var10 = 99; var10 > 0; var10--) {
            class85.field1395[var10] = class85.field1395[var10 - 1];
        }
        if (var9 == null) {
            var9 = new class576(arg6, arg0, arg3, arg4, arg2, arg7, arg8, arg5);
        } else {
            var9.method3263(arg0, arg2, arg8, arg5, arg4, (byte) -90, arg7, arg3, arg6);
        }
        if (arg1 < 99) {
            method1944(null, (byte) 119);
        }
        class85.field1395[0] = var9;
        class390.field5792++;
        class52.field1043 = class363.field5184;
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(ILut;Lgi;III)V", line = 42)
    public class304(int arg0, class109 arg1, class630 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4530 = arg5;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(B)Lrw;", line = 53)
    public final class703 method351(byte arg0) {
        if (arg0 <= 73) {
            return null;
        } else {
            field4527++;
            return class500.field7080;
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)[Lgq;", line = 64)
    public static final class475[] method1943(int arg0) {
        if (arg0 == 1001) {
            field4528++;
            return new class475[] { class370.field5277, class370.field5281, class370.field5283, class370.field5284, class370.field5285, class370.field5286, class370.field5287, class370.field5288, class370.field5289, class370.field5290, class370.field5291, class370.field5292, class370.field5293, class370.field5294 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lwt;B)I", line = 76)
    public static final int method1944(class279 arg0, byte arg1) {
        field4525++;
        String var2 = class666.method3680(false, arg0);
        int[] var3 = null;
        if (class488.method2833(arg0.field4213, (byte) 110)) {
            var3 = class41.field682.method2228((int) arg0.field4208, 0).field2687;
        } else if (arg0.field4221 != -1) {
            var3 = class41.field682.method2228(arg0.field4221, 0).field2687;
        } else if (class656.method3612(arg0.field4213, (byte) -81)) {
            class16 var6 = (class16) class189.field2723.method1405((long) ((int) arg0.field4208), (byte) -49);
            if (var6 != null) {
                class577 var7 = var6.field174;
                class592 var8 = var7.field8121;
                if (var8.field8315 != null) {
                    var8 = var8.method3356(73, class61.field1163);
                }
                if (var8 != null) {
                    var3 = var8.field8288;
                }
            }
        } else if (class15.method90((byte) -123, arg0.field4213)) {
            Object var4 = null;
            class550 var5;
            if (arg0.field4213 == 1001) {
                var5 = class101.field1572.method2617((byte) -118, (int) arg0.field4208);
            } else {
                var5 = class101.field1572.method2617((byte) -109, (int) (arg0.field4208 >>> 32 & 0x7FFFFFFFL));
            }
            if (var5.field7781 != null) {
                var5 = var5.method3124((byte) -125, class61.field1163);
            }
            if (var5 != null) {
                var3 = var5.field7764;
            }
        }
        if (var3 != null) {
            var2 = var2 + class56.method614(var3, 0);
        }
        if (arg1 <= 91) {
            method1944(null, (byte) 47);
        }
        int var9 = class467.field6721.method1043(87, class210.field2948, var2);
        if (arg0.field4212) {
            var9 += class143.field2110.method927() + 4;
        }
        return var9;
    }
}
