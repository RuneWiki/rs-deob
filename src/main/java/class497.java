import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class497 extends class300 {

    @OriginalMember(owner = "client!iaa", name = "n", descriptor = "I")
    private int field6696 = 0;

    @OriginalMember(owner = "client!iaa", name = "o", descriptor = "[I")
    public static int[] field6697 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!iaa", name = "q", descriptor = "J")
    public static long field6699 = 0L;

    @OriginalMember(owner = "client!iaa", name = "m", descriptor = "I")
    public static int field6695;

    @OriginalMember(owner = "client!iaa", name = "p", descriptor = "I")
    public static int field6698;

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lwu;Lgga;)V")
    public class497(class376 arg0, class295 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ILnt;II)V")
    public static final void method2804(int arg0, class224 arg1, int arg2, int arg3) {
        ++field6695;
        if (arg2 == 4) {
            class131.field2147[arg0][arg3] = arg1;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZB)V")
    public final void method328(boolean arg0, byte arg1) {
        ++field6698;
        int var3 = super.field4267.field10571.method1911(super.field4266.method1036(), 0, class69.field844) + super.field4267.field10567;
        if (arg1 < -60) {
            int var4 = super.field4267.field10566.method2861((byte) -23, class304.field4321, super.field4266.method1048()) + super.field4267.field10569;
            super.field4266.method1029((float) (super.field4266.method1036() / 2 + var3), (float) (super.field4266.method1048() / 2 + var4), 4096, this.field6696);
            this.field6696 += ((class295) super.field4267).field4218;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "(I)V")
    public static void method2805(int arg0) {
        if (arg0 != -30978) {
            method2805(-53);
        }
        field6697 = null;
    }
}
