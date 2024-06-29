import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class420 {

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Llt;")
    private class458 field6035;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public int field6040;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "S")
    public static short field6037;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "[[[I")
    public static int[][][] field6038;

    static {
        new class423(null, "der Spieler ist momentan nicht verfügbar.", null, null);
        field6037 = 320;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIII)I", line = 6)
    public static final int method2458(int arg0, int arg1, int arg2, int arg3) {
        field6036++;
        if (arg0 == arg1) {
            return arg1;
        }
        int var4 = 128 - arg3;
        int var5 = (arg0 & 0x7F) * arg3 + (arg1 & 0x7F) * var4 >> 7;
        int var6 = (arg0 & 0x380) * arg3 + (arg1 & 0x380) * var4 >> 7;
        int var7 = (arg1 & arg2) * var4 + ((arg0 & 0xFC00) * arg3) >> 7;
        return var6 & 0x380 | var7 & 0xFC00 | var5 & 0x7F;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 35)
    public static void method2459(int arg0) {
        if (arg0 > -30) {
            field6037 = -76;
        }
        field6038 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(III)V", line = 55)
    public static final void method2460(int arg0, int arg1, int arg2) {
        class268 var3 = class321.field4830[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field4052 != null) {
            var3.field4052 = null;
        }
        if (var3.field4051 != null) {
            var3.field4051 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lcm;ILlt;)V", line = 74)
    public class420(class491 arg0, int arg1, class458 arg2) {
        new class288(64);
        this.field6035 = arg2;
        this.field6040 = this.field6035.method2726((byte) 113, 15);
    }
}
