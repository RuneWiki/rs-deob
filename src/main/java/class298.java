import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class298 extends class182 {

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "[I")
    public static int[] field4865 = new int[1000];

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "I")
    public static int field4864 = 0;

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "I")
    public static int field4870 = 0;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "[I")
    public static int[] field4867 = new int[100];

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "[[S")
    public static short[][] field4868;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V")
    public static final void method2043(int arg0, int arg1) {
        if (arg1 != Integer.MAX_VALUE) {
            field4870 = 14;
        }
        ++field4863;
        class36 var2 = class136.method1013(9, arg0, (byte) -90);
        var2.method221(1);
    }

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "(I)V")
    public static void method2044(int arg0) {
        field4867 = null;
        field4865 = null;
        field4868 = null;
        if (arg0 != 789221) {
            method2043(-116, -111);
        }
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(III)I")
    private final int method2045(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            return -109;
        } else {
            ++field4869;
            int var4 = arg1 * 57 + arg0;
            int var5 = var4 << 1 ^ var4;
            return -(((var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class298() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZI)[I")
    public final int[] method153(boolean arg0, int arg1) {
        if (arg0) {
            field4865 = null;
        }
        int[] var3 = super.field2911.method77(arg1, -61);
        if (super.field2911.field287) {
            int var4 = class66.field1112[arg1];
            for (int var5 = 0; ~var5 > ~class4.field116; ++var5) {
                var3[var5] = this.method2045(class207.field3415[var5], var4, 0) % 4096;
            }
        }
        ++field4866;
        return var3;
    }
}
