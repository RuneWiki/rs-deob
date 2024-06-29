import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class297 extends class46 {

    @OriginalMember(owner = "client!gaa", name = "g", descriptor = "I")
    private int field4171;

    @OriginalMember(owner = "client!gaa", name = "n", descriptor = "I")
    private int field4178;

    @OriginalMember(owner = "client!gaa", name = "i", descriptor = "I")
    private int field4173;

    @OriginalMember(owner = "client!gaa", name = "o", descriptor = "I")
    private int field4179;

    @OriginalMember(owner = "client!gaa", name = "m", descriptor = "Lpca;")
    public static class714 field4177 = new class714(8);

    @OriginalMember(owner = "client!gaa", name = "h", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!gaa", name = "j", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!gaa", name = "k", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!gaa", name = "l", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(IIIIIII)V")
    public class297(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4171 = arg0;
        this.field4178 = arg3;
        this.field4173 = arg1;
        this.field4179 = arg2;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIII)V")
    public static final void method1924(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -5967) {
            field4177 = null;
        }
        class651.field8948 = new byte[arg2][arg1][arg3];
        ++field4172;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZII)V")
    public final void method301(boolean arg0, int arg1, int arg2) {
        ++field4175;
        int var4 = this.field4171 * arg2 >> 12;
        int var5 = this.field4179 * arg2 >> 12;
        if (arg0) {
            this.method301(true, -9, -65);
        }
        int var6 = this.field4173 * arg1 >> 12;
        int var7 = this.field4178 * arg1 >> 12;
        class38.method214(var4, var7, var6, true, super.field549, var5);
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(III)V")
    public final void method303(int arg0, int arg1, int arg2) {
        ++field4174;
        if (arg1 != -12939) {
            this.field4178 = -47;
        }
        int var4 = this.field4171 * arg2 >> 12;
        int var5 = this.field4179 * arg2 >> 12;
        int var6 = this.field4173 * arg0 >> 12;
        int var7 = this.field4178 * arg0 >> 12;
        class622.method3497(var7, var4, super.field548, var5, 118, var6, super.field545);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(III)V")
    public final void method300(int arg0, int arg1, int arg2) {
        ++field4176;
        int var4 = this.field4171 * arg0 >> 12;
        int var5 = this.field4179 * arg0 >> 12;
        int var6 = this.field4173 * arg2 >> 12;
        int var7 = -76 % ((arg1 - -7) / 42);
        int var8 = this.field4178 * arg2 >> 12;
        class162.method1064(super.field549, (byte) 114, var8, var5, var6, super.field548, super.field545, var4);
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(I)V")
    public static void method1925(int arg0) {
        int var1 = 32 / ((arg0 - -1) / 53);
        field4177 = null;
    }
}
