import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class419 implements class554 {

    @OriginalMember(owner = "client!uw", name = "i", descriptor = "Laha;")
    private class384 field5340;

    @OriginalMember(owner = "client!uw", name = "g", descriptor = "I")
    public int field5338;

    @OriginalMember(owner = "client!uw", name = "f", descriptor = "I")
    public int field5337;

    @OriginalMember(owner = "client!uw", name = "h", descriptor = "[I")
    public int[] field5339;

    @OriginalMember(owner = "client!uw", name = "e", descriptor = "Ljt;")
    private class107 field5336;

    @OriginalMember(owner = "client!uw", name = "d", descriptor = "[F")
    public float[] field5335;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!uw", name = "j", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(IIIIIIZZ)V", line = 3)
    public final void method2341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field5332++;
        class542.method3106(arg7 ? this.field5340.field4870 : null, arg6 ? this.field5340.field4863.field9976 : null, this.field5340.field4863.field9980, arg7 ? this.field5335 : null, this.field5339, arg2, arg4, this.field5338, arg3, arg0, (byte) -41, arg1, arg5);
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Z[B)Z", line = 12)
    public static final boolean method2342(boolean arg0, byte[] arg1) {
        field5333++;
        if (arg0) {
            return true;
        }
        class461 var2 = new class461(arg1);
        int var3 = var2.method2600((byte) -125);
        if (var3 != 2) {
            return false;
        }
        boolean var4 = var2.method2600((byte) -126) == 1;
        if (var4) {
            class672.method3776(var2, 124);
        }
        class518.method3006(var2, true);
        return true;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIIIIIZZ)V", line = 43)
    public final void method2343(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field5334++;
        class542.method3106(arg7 ? this.field5335 : null, arg6 ? this.field5339 : null, this.field5338, arg7 ? this.field5340.field4870 : null, this.field5340.field4863.field9976, arg2, arg4, this.field5340.field4863.field9980, arg3, arg0, (byte) -118, arg1, arg5);
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(III)V", line = 53)
    public static final void method2344(int arg0, int arg1, int arg2) {
        class331.field4231++;
        field5341++;
        if (arg0 != 1) {
            method2342(false, null);
        }
        class589 var3 = class514.method2994(-29488, class760.field10605, class296.field3908);
        var3.field8251.method2620(arg1, false);
        var3.field8251.method2598(arg2, (byte) 106);
        class737.method4107(var3, arg0 ^ 0x6);
    }

    @OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(Laha;Liea;Ljt;)V", line = 74)
    public class419(class384 arg0, class481 arg1, class107 arg2) {
        this.field5340 = arg0;
        if (arg1 instanceof class398) {
            class398 var4 = (class398) arg1;
            this.field5338 = var4.field1099;
            this.field5337 = var4.field1078;
            this.field5339 = var4.field5075;
        } else if ((arg1 instanceof class62)) {
            class62 var5 = (class62) arg1;
            this.field5337 = var5.field1078;
            this.field5338 = var5.field1099;
            this.field5339 = var5.field872;
        } else {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            this.field5336 = arg2;
            if (this.field5336.field1537 != this.field5338 || this.field5336.field1539 != this.field5337) {
                throw new RuntimeException();
            }
            this.field5335 = this.field5336.field1536;
        }
    }
}
