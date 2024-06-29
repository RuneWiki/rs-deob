import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class242 {

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "[I")
    public int[] field3250 = new int[3];

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "[I")
    public int[] field3249 = new int[100];

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "[Lmca;")
    public class34[] field3248 = new class34[100];

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "[Lpn;")
    public class296[] field3254 = new class296[8];

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "[I")
    public static int[] field3252 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "I")
    public int field3251;

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!cp", name = "j", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "Ljava/lang/Object;")
    public Object field3246;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V", line = 19)
    public static final void method1521(int arg0) {
        class668 var1 = class369.field4757;
        synchronized (class369.field4757) {
            class369.field4757.method3658(0);
        }
        int var2 = 107 % ((-arg0 - 21) / 63);
        field3255++;
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)V", line = 40)
    public static void method1522(int arg0) {
        int var1 = 34 / ((arg0 - 44) / 57);
        field3252 = null;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)I", line = 49)
    public static final int method1523(byte arg0) {
        field3253++;
        if (arg0 > -105) {
            field3252 = null;
        }
        class668 var1 = class207.field2671;
        synchronized (class207.field2671) {
            return class207.field2671.method3653(108);
        }
    }
}
