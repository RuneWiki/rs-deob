import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class460 implements class639 {

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "I")
    public int field6588;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "Ljava/lang/Object;")
    public static Object field6585;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IBII)V", line = 4)
    public static final void method2740(int arg0, byte arg1, int arg2, int arg3) {
        field6587++;
        if (arg1 != 81) {
            field6585 = null;
        }
        String var4 = "tele " + arg2 + "," + (arg0 >> 6) + "," + (arg3 >> 6) + "," + (arg0 & 0x3F) + "," + (arg3 & 0x3F);
        System.out.println(var4);
        class237.method1628((byte) 84, true, var4, false);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lwq;I)V", line = 29)
    public static final void method2741(class176 arg0, int arg1) {
        field6586++;
        if (!class26.field382 || arg1 != 63) {
            return;
        }
        class780.field10749++;
        if (arg0.field2568 != null) {
            class176 var2 = class333.method2152(false, class76.field1018, class483.field6863);
            if (var2 != null) {
                class140 var3 = new class140();
                var3.field1802 = arg0;
                var3.field1808 = arg0.field2568;
                var3.field1804 = var2;
                class353.method2219(var3);
            }
        }
        class731 var4 = class155.method1222(260, class731.field10216, class237.field3417);
        var4.field10211.method879((byte) -116, arg0.field2588);
        var4.field10211.method856(-95, arg0.field2612);
        var4.field10211.method856(arg1 - 188, class76.field1018);
        var4.field10211.method896(arg0.field2540, (byte) 85);
        var4.field10211.method860(class189.field2820, (byte) 121);
        var4.field10211.method864((byte) -108, class483.field6863);
        class533.method3088(var4, 0);
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 73)
    public class460(String arg0, int arg1) {
        this.field6588 = arg1;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V", line = 83)
    public static void method2742(int arg0) {
        field6585 = null;
        if (arg0 > -106) {
            method2742(-51);
        }
    }

    @OriginalMember(owner = "client!ks", name = "toString", descriptor = "()Ljava/lang/String;", line = 93)
    public final String toString() {
        field6589++;
        throw new IllegalStateException();
    }
}
