import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class203 extends class224 {

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "[I")
    public static int[] field3173 = new int[14];

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
    public static int field3171 = 0;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field3180 = "flash1:";

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "[I")
    public static int[] field3179 = new int[14];

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "I")
    public static int field3182 = 0;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(JB)V")
    public static final void method1393(long arg0, byte arg1) {
        try {
            Thread.sleep(arg0);
            if (arg1 <= 57) {
                field3179 = null;
            }
        } catch (InterruptedException var3) {
        }
        field3175++;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public static void method1394(byte arg0) {
        field3173 = null;
        field3179 = null;
        if (arg0 == -104) {
            field3180 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
    public class203() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ)[I")
    public final int[] method14(int arg0, boolean arg1) {
        field3181++;
        if (!arg1) {
            field3179 = null;
        }
        return class243.field3893;
    }
}
