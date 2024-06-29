import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!sa")
public class PreciseSleep {

    @OriginalMember(owner = "mapview!sa", name = "f", descriptor = "Lv;")
    public static JagString field438;

    @OriginalMember(owner = "mapview!sa", name = "d", descriptor = "Lv;")
    public static JagString field436;

    @OriginalMember(owner = "mapview!sa", name = "g", descriptor = "Lv;")
    public static JagString field439;

    @OriginalMember(owner = "mapview!sa", name = "e", descriptor = "Lv;")
    public static JagString field437;

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "mapview!sa", name = "h", descriptor = "[Lv;")
    public static JagString[] field440;

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(JI)V", line = 18)
    public static final void method206(long arg0, int arg1) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var4) {
        }
        if (arg1 != 0) {
            field433 = -66;
        }
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(I)V", line = 40)
    public static void method207(int arg0) {
        if (arg0 != -11601) {
            ByteArrayCopier.directBuffersUnsupported = false;
        }
        field436 = null;
        field438 = null;
        field440 = null;
        field437 = null;
        field439 = null;
    }

    static {
        ByteArrayPool.minCount = 0;
        field438 = class1.method2(255, "Sword Shop");
        field436 = class1.method2(255, "Mini)2Game");
        field439 = class1.method2(255, "Key");
        field437 = class1.method2(255, "Cooking Range");
        ByteArrayCopier.directBuffersUnsupported = false;
    }
}
