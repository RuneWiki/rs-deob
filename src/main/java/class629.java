import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class629 {

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public int field9026;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "Ldh;")
    public static class320 field9027 = new class320(118, 0);

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "Lhp;")
    public static class327 field9032 = new class327(8);

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field9028;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public static int field9029;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public static int field9030;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public static int field9031;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "Loh;")
    public static class404 field9033;

    @OriginalMember(owner = "client!sn", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field9030++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V", line = 12)
    public static final void method3604(byte arg0) {
        class93.field987 = null;
        field9031++;
        if (class397.field5443 && class735.method4098(false) != 1) {
            class512.method3026((byte) 98, 0, class456.method2795((byte) 101), 0, class178.method1097(false), class392.field5397 == 3 || class392.field5397 == 7);
        }
        int var1 = 0;
        int var2 = 0;
        if (class397.field5443) {
            var1 = class389.method2400(arg0 + 1);
            var2 = class752.method4192(1);
        }
        if (arg0 != 85) {
            method3606(true);
        }
        class84.method593(-125, -1, var2, class327.field4245, var1, var1, var2, class476.field6777 + var2, class705.field9926 + var1);
        if (class93.field987 != null) {
            class740.method4117(false, var1, class261.field3243, class705.field9926 + var1, true, class476.field6777 + var2, class68.field694.field7568, var2, class382.field5234, -1412584499, class93.field987);
            class93.field987 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)V", line = 52)
    public static final void method3605(int arg0, int arg1) {
        field9028++;
        int var2 = 54 / ((arg0 + 38) / 33);
        class47 var3 = class258.method1546(4, arg1, (byte) 121);
        var3.method274(false);
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 67)
    public class629(String arg0, int arg1) {
        this.field9026 = arg1;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Z)V", line = 82)
    public static void method3606(boolean arg0) {
        field9033 = null;
        field9027 = null;
        field9032 = null;
        if (!arg0) {
            field9027 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lrr;Lfba;II)V", line = 94)
    public static final void method3607(class361 arg0, class25 arg1, int arg2, int arg3) {
        field9029++;
        if (class306.field3815 >= 50 || arg1 == null || arg1.field266 == null || arg3 >= arg1.field266.length || arg1.field266[arg3] == null) {
            return;
        }
        int var4 = arg1.field266[arg3][0];
        int var5 = var4 >> 8;
        int var6 = var4 >> 5 & 0x7;
        int var7 = var4 & 0x1F;
        if (arg1.field266[arg3].length > 1) {
            int var8 = (int) (Math.random() * (double) arg1.field266[arg3].length);
            if (var8 > 0) {
                var5 = arg1.field266[arg3][var8];
            }
        }
        int var9 = 256;
        if (arg1.field264 != null && arg1.field255 != null) {
            var9 = arg1.field264[arg3] + (int) ((double) (arg1.field255[arg3] - arg1.field264[arg3]) * Math.random());
        }
        int var10 = arg1.field274 == null ? 255 : arg1.field274[arg3];
        if (var7 == 0) {
            if (class90.field937 == arg0) {
                if (!arg1.field271) {
                    class259.method1549(var9, (byte) -46, var6, var5, var10, 0);
                    return;
                }
                class54.method305(0, false, var6, true, var9, var5, var10);
            }
        } else if (class654.field9334.field9861.method1500(52) != 0) {
            int var11 = arg0.field4635 - 256 >> 9;
            int var12 = arg0.field4629 - 256 >> 9;
            int var13 = class90.field937 == arg0 ? 0 : (arg0.field4628 << 24) + var7 + (var11 << 16) + (var12 << 8);
            if (arg2 <= -113) {
                class313.field3888[class306.field3815++] = new class590((byte) (arg1.field271 ? 2 : 1), var5, var6, 0, var10, var13, var9, arg0);
            }
        }
    }
}
