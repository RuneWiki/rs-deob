import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class335 {

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public int field4261;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "[I")
    public int[] field4266;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "[I")
    public int[] field4262;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "[I")
    public static int[] field4265 = new int[5];

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
    public static int field4264 = 0;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
    public static int field4263 = 0;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)I", line = 4)
    public static final int method1891(byte arg0) {
        field4267++;
        class450 var1 = class190.field2377;
        synchronized (class190.field2377) {
            if (arg0 != 24) {
                field4265 = null;
            }
            return class190.field2377.method2404((byte) 116);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V", line = 32)
    public static void method1892(int arg0) {
        field4265 = null;
        if (arg0 != 0) {
            field4265 = null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(I)V", line = 47)
    public class335(int arg0) {
        this.field4261 = arg0;
        this.field4266 = new int[this.field4261];
        this.field4262 = new int[this.field4261];
    }
}
