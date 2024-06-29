import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class308 extends class261 {

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "I")
    public static int field5249 = -1;

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "F")
    public static float field5248;

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)[I", line = 5)
    public final int[] method21(byte arg0, int arg1) {
        field5246++;
        int var3 = 30 / ((arg0 + 49) / 33);
        int[] var4 = this.field4425.method906(arg1, 8251);
        if (this.field4425.field2043) {
            int var5 = class20.field324[arg1];
            for (int var6 = 0; var6 < class92.field1576; var6++) {
                var4[var6] = this.method2142((byte) -119, class245.field4120[var6], var5) % 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lrg;I)V", line = 36)
    public static final void method2140(class88 arg0, int arg1) {
        field5251++;
        class7.field102 = arg0;
        if (arg1 != 1376312589) {
            method2140((class88) null, -117);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lrg;ILrg;)V", line = 59)
    public static final void method2141(class88 arg0, int arg1, class88 arg2) {
        class244.field4118 = arg2;
        field5250++;
        class275.field4728 = arg0;
        int var3 = -23 % ((-arg1 - 69) / 53);
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V", line = 70)
    public class308() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BII)I", line = 78)
    private final int method2142(byte arg0, int arg1, int arg2) {
        int var4 = 63 % ((-arg0 - 55) / 62);
        field5247++;
        int var5 = arg2 * 57 + arg1;
        int var6 = var5 << 1 ^ var5;
        return 4096 - (((var6 * var6 * 15731 + 789221) * var6 + 1376312589 & Integer.MAX_VALUE) / 262144);
    }
}
