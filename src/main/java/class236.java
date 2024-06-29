import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class236 extends class738 {

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "Z")
    public static boolean field2809 = false;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "[[B")
    public static byte[][] field2811 = new byte[1000][];

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "[B")
    private byte[] field2808;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BIB)V", line = 3)
    public final void method1394(byte arg0, int arg1, byte arg2) {
        field2807++;
        int var4 = arg1 * 2;
        if (arg0 != 1) {
            this.method1394((byte) 97, 106, (byte) -114);
        }
        int var5 = arg2 & 0xFF;
        this.field2808[var4++] = (byte) (var5 * 3 >> 5);
        this.field2808[var4] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(JJ)J", line = 22)
    public static long method1395(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII)[B", line = 40)
    public final byte[] method1396(int arg0, int arg1, int arg2, int arg3) {
        this.field2808 = new byte[arg0 * arg1 * 2 * arg3];
        field2812++;
        int var5 = 79 % ((30 - arg2) / 58);
        this.method3296((byte) -48, arg0, arg3, arg1);
        return this.field2808;
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V", line = 53)
    public static final void method1397(int arg0) {
        class716.method3998(arg0, class654.field9334.field9879.method3007(10) == 1, 2, (byte) 108);
        field2810++;
        class167.field1857 = class267.method1604(arg0 ^ 0xFFFF8B80, class289.field3549, class618.field8849, 22050, 0);
        class254.method1513(true, arg0 ^ 0xFFFFA9DD, class345.method2058((byte) -47, null));
        class637.field9160 = class267.method1604(-8798, class289.field3549, class618.field8849, 2048, 1);
        class597.field8470 = new class282();
        class637.field9160.method108(class597.field8470, -120);
        class638.field9168 = new class748(22050, class277.field3387);
        class703.method3949(108);
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V", line = 68)
    public class236() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "(I)V", line = 71)
    public static void method1398(int arg0) {
        if (arg0 == -817583739) {
            field2811 = null;
        }
    }
}
