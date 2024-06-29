import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class310 extends class270 {

    @OriginalMember(owner = "client!so", name = "H", descriptor = "Lfg;")
    public static class18 field4521 = new class18(64);

    @OriginalMember(owner = "client!so", name = "L", descriptor = "Z")
    public static boolean field4525 = true;

    @OriginalMember(owner = "client!so", name = "G", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!so", name = "I", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!so", name = "J", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!so", name = "K", descriptor = "Ldp;")
    public static class174 field4524;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lvj;IIIBI)Ljava/awt/Frame;", line = 5)
    public static final Frame method2115(class177 arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field4522++;
        if (!arg0.method1389((byte) -78)) {
            return null;
        }
        if (arg2 == 0) {
            class319[] var6 = class248.method1788(arg0, (byte) 83);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field4608 == arg1 && var6[var8].field4611 == arg3 && (arg5 == 0 || var6[var8].field4605 == arg5) && (!var7 || var6[var8].field4615 > arg2)) {
                    arg2 = var6[var8].field4615;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class131 var9 = arg0.method1393(arg3, arg2, (byte) -81, arg1, arg5);
        while (var9.field2121 == 0) {
            class134.method1106(10L, 10);
        }
        Frame var10 = (Frame) var9.field2125;
        if (var10 == null) {
            return null;
        } else if (var9.field2121 == 2) {
            class89.method664(var10, arg0, arg4 ^ 0x6D);
            return null;
        } else if (arg4 == -110) {
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V", line = 77)
    public class310() {
        super(0, true);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(BI)[I", line = 82)
    public final int[] method81(byte arg0, int arg1) {
        field4523++;
        if (arg0 < 26) {
            this.method81((byte) -104, 91);
        }
        return class136.field2168;
    }

    @OriginalMember(owner = "client!so", name = "f", descriptor = "(I)V", line = 103)
    public static void method2116(int arg0) {
        field4524 = null;
        field4521 = null;
        if (arg0 != 64) {
            method2115((class177) null, 119, 22, -109, (byte) 32, -79);
        }
    }
}
