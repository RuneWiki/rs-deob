import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class440 {

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "I")
    public int field6293;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "F")
    public static float field6295 = 1.0F;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "I")
    public static int field6294 = 0;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "I")
    public static int field6291;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
    public static int field6297;

    @OriginalMember(owner = "client!ep", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6292++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(JII)Ljava/lang/String;")
    public static final String method2660(long arg0, int arg1, int arg2) {
        class527.method3060(-12477, arg0);
        field6297++;
        int var4 = class241.field3461.get(5);
        if (arg2 >= -51) {
            method2661(127, null, 31);
        }
        int var5 = class241.field3461.get(2) + 1;
        int var6 = class241.field3461.get(1);
        return Integer.toString(var4 / 10) + var4 % 10 + "/" + var5 / 10 + var5 % 10 + "/" + var6 % 100 / 10 + var6 % 10;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILvm;I)V")
    public static final void method2661(int arg0, class713 arg1, int arg2) {
        if (class458.field6564) {
            arg2 = 0;
            class458.field6564 = false;
        }
        field6296++;
        if (class709.field9998 == null || !class709.field9998.method4036(arg1, (byte) 124)) {
            class709.field9998 = arg1;
            class415.field5869 = class109.method731(82);
            class119.field1501 = arg2;
            class585.field8270 = arg2;
            if (class585.field8270 == 0) {
                class302.method2005(117);
            } else {
                class311.field4631 = class363.field5244;
                class789.field10834 = class752.field10426;
                class502.field7179 = class566.field8014;
                class10.field231 = class577.field8146;
                class52.field741 = class129.field1693;
                class61.field831 = class276.field3846;
                class461.field6591 = class181.field2754;
                class223.field3201 = class553.field7874;
                class464.field6623 = class788.field10828;
                class516.field7386 = class452.field6512;
            }
        }
        if (arg0 != 0) {
            field6295 = 0.9727114F;
        }
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class440(String arg0, int arg1) {
        this.field6293 = arg1;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)I")
    public final int method2662(byte arg0) {
        if (arg0 >= -35) {
            this.method2662((byte) -20);
        }
        field6291++;
        return this.field6293;
    }
}
