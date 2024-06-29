import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class80 extends class49 {

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "Lv;")
    public static class165 field900 = new class165();

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!qh", name = "B", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!qh", name = "D", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!qh", name = "E", descriptor = "Llk;")
    private class638 field902;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BILgga;)V", line = 10)
    private final void method568(byte arg0, int arg1, class511 arg2) {
        field896++;
        if (arg0 != 123) {
            this.method568((byte) 2, -40, null);
        }
        if (arg1 != 249) {
            return;
        }
        int var4 = arg2.method3013(79);
        if (this.field902 == null) {
            int var5 = class179.method1142(var4, -92);
            this.field902 = new class638(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg2.method3013(arg0 - 251) == 1;
            int var8 = arg2.method2983(true);
            class69 var9;
            if (var7) {
                var9 = new class282(arg2.method2993((byte) -19));
            } else {
                var9 = new class324(arg2.method3008(arg0 ^ 0x3B));
            }
            this.field902.method3666((byte) 65, (long) var8, var9);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILjava/lang/String;B)Ljava/lang/String;", line = 56)
    public final String method569(int arg0, String arg1, byte arg2) {
        int var4 = 125 / ((21 - arg2) / 34);
        field895++;
        if (this.field902 == null) {
            return arg1;
        } else {
            class282 var5 = (class282) this.field902.method3669(false, (long) arg0);
            return var5 == null ? arg1 : var5.field4042;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BII)I", line = 75)
    public final int method570(byte arg0, int arg1, int arg2) {
        if (arg0 != -65) {
            return -57;
        }
        field899++;
        if (this.field902 == null) {
            return arg1;
        } else {
            class324 var4 = (class324) this.field902.method3669(false, (long) arg2);
            return var4 == null ? arg1 : var4.field4575;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILgga;)V", line = 96)
    public final void method571(int arg0, class511 arg1) {
        if (arg0 >= -56) {
            return;
        }
        field898++;
        while (true) {
            int var3 = arg1.method3013(115);
            if (var3 == 0) {
                return;
            }
            this.method568((byte) 123, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIZ)Z", line = 117)
    public static final boolean method572(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method572(96, -44, true);
        }
        field897++;
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V", line = 133)
    public static void method573(int arg0) {
        field900 = null;
        if (arg0 > -26) {
            method572(52, -113, false);
        }
    }
}
