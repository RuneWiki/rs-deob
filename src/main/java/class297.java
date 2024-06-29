import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class297 extends class205 {

    @OriginalMember(owner = "client!er", name = "t", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!er", name = "u", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!er", name = "v", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!er", name = "w", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!er", name = "y", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!er", name = "z", descriptor = "Lraa;")
    public static class353 field4516;

    @OriginalMember(owner = "client!er", name = "x", descriptor = "Lpl;")
    private class616 field4514;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;", line = 6)
    public final String method1910(int arg0, int arg1, String arg2) {
        field4511++;
        if (this.field4514 == null) {
            return arg2;
        } else if (arg1 == 1) {
            class495 var4 = (class495) this.field4514.method3512(true, (long) arg0);
            return var4 == null ? arg2 : var4.field7165;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V", line = 26)
    public static void method1911(byte arg0) {
        field4516 = null;
        if (arg0 != 31) {
            field4513 = 78;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lofa;B)V", line = 36)
    public final void method1912(class301 arg0, byte arg1) {
        if (arg1 != -16) {
            return;
        }
        field4515++;
        while (true) {
            int var3 = arg0.method1987(arg1 ^ 0x3D);
            if (var3 == 0) {
                return;
            }
            this.method1914(arg0, (byte) -84, var3);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IBI)I", line = 59)
    public final int method1913(int arg0, byte arg1, int arg2) {
        field4510++;
        if (arg1 != 114) {
            field4516 = null;
        }
        if (this.field4514 == null) {
            return arg0;
        } else {
            class332 var4 = (class332) this.field4514.method3512(true, (long) arg2);
            return var4 == null ? arg0 : var4.field4880;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lofa;BI)V", line = 82)
    private final void method1914(class301 arg0, byte arg1, int arg2) {
        if (arg2 == 249) {
            int var4 = arg0.method1987(-115);
            if (this.field4514 == null) {
                int var5 = class567.method3292(var4, -93);
                this.field4514 = new class616(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method1987(-56) == 1;
                int var8 = arg0.method1952(22085);
                class65 var9;
                if (var7) {
                    var9 = new class495(arg0.method1958(-3438));
                } else {
                    var9 = new class332(arg0.method1934(-2));
                }
                this.field4514.method3516(255, (long) var8, var9);
            }
        }
        field4512++;
        int var10 = -87 / ((-arg1 - 38) / 46);
    }
}
