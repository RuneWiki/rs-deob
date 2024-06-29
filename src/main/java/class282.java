import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class282 {

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Lvg;")
    private class49 field4510 = new class49(256);

    @OriginalMember(owner = "client!le", name = "c", descriptor = "Lfa;")
    private class214 field4511;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "Ler;")
    private class92 field4513;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "Lrl;")
    public static class672 field4514 = new class672(8, 7);

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field4517 = 0;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field4516 = 0;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public final void method2001(byte arg0) {
        field4509++;
        if (arg0 != 97) {
            method2002(null);
        }
        this.field4510.method573((byte) 121, 5);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lpn;)V")
    public static final void method2002(class692 arg0) {
        class595.field8435.method330(arg0.field9696, arg0.field9701 + (arg0.method393(0) >> 1), arg0.field9705, class310.field4866);
        arg0.field9700 = class310.field4866[0];
        arg0.field9704 = class310.field4866[1];
        arg0.field9699 = class310.field4866[2];
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
    public final void method2003(boolean arg0) {
        if (!arg0) {
            this.field4513 = null;
        }
        this.field4510.method569(0);
        field4512++;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(B)V")
    public static void method2004(byte arg0) {
        field4514 = null;
        if (arg0 != 104) {
            field4514 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)Lwh;")
    public final class133 method2005(int arg0, int arg1) {
        field4515++;
        Object var3 = this.field4510.method560(false, (long) arg1);
        if (var3 != null) {
            return (class133) var3;
        } else if (this.field4511.method1608(-20340, arg1)) {
            class258 var4 = this.field4511.method1610(18904, arg1);
            int var5 = var4.field4137 ? 64 : this.field4513.field1319;
            class133 var7;
            if (var4.field4135 && this.field4513.method168()) {
                float[] var6 = this.field4511.method1611(var5, var5, 0.7F, arg1, false, false);
                var7 = new class133(this.field4513, 3553, 34842, var5, var5, var4.field4127 != 0, var6, 6408);
            } else {
                int[] var8;
                if (!var4.field4119 && class290.method2045(-13857, var4.field4134)) {
                    var8 = this.field4511.method1607(var5, arg1, -20490, true, var5, 0.7F);
                } else {
                    var8 = this.field4511.method1609(0.7F, false, arg1, (byte) -92, var5, var5);
                }
                var7 = new class133(this.field4513, 3553, 6408, var5, var5, var4.field4127 != 0, var8, 0, 0, false);
            }
            if (arg0 > -97) {
                method2004((byte) -128);
            }
            var7.method1158(var4.field4125, var4.field4124, (byte) 73);
            this.field4510.method559(var7, (long) arg1, 0);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Ler;Lfa;)V")
    public class282(class92 arg0, class214 arg1) {
        this.field4511 = arg1;
        this.field4513 = arg0;
    }
}
