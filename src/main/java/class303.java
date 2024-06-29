import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class303 extends class604 {

    @OriginalMember(owner = "client!caa", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field4296 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!caa", name = "D", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!caa", name = "E", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!caa", name = "F", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!caa", name = "A", descriptor = "[B")
    private byte[] field4295;

    @OriginalMember(owner = "client!caa", name = "<init>", descriptor = "()V")
    public class303() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!caa", name = "d", descriptor = "(B)V")
    public static void method1910(byte arg0) {
        field4296 = null;
        int var1 = -120 % ((-arg0 - 21) / 39);
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(BII)V")
    public final void method1641(byte arg0, int arg1, int arg2) {
        field4297++;
        int var4 = arg1 * 2;
        byte var5 = (byte) (((arg0 & 0xFF) >> 1) + 127);
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field4295[var10001] = var5;
        this.field4295[var6] = var5;
        if (arg2 != 9170) {
            this.method1641((byte) 44, -78, -27);
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIII)[B")
    public final byte[] method1911(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 100) {
            field4296 = null;
        }
        this.field4295 = new byte[arg1 * arg3 * arg0 * 2];
        field4298++;
        this.method3318(arg3, arg1, arg0, (byte) -22);
        return this.field4295;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(II)I")
    public static final int method1912(int arg0, int arg1) {
        return class624.field8740 == null ? 0 : class624.field8740[arg0][arg1] & 0xFFFFFF;
    }
}
