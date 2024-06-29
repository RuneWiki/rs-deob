import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class54 extends class319 {

    @OriginalMember(owner = "client!mq", name = "o", descriptor = "I")
    private int field863;

    @OriginalMember(owner = "client!mq", name = "E", descriptor = "I")
    private int field879;

    @OriginalMember(owner = "client!mq", name = "x", descriptor = "I")
    private int field872;

    @OriginalMember(owner = "client!mq", name = "w", descriptor = "I")
    private int field871;

    @OriginalMember(owner = "client!mq", name = "B", descriptor = "[I")
    public static int[] field876;

    @OriginalMember(owner = "client!mq", name = "A", descriptor = "Z")
    public static boolean field875;

    @OriginalMember(owner = "client!mq", name = "n", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!mq", name = "p", descriptor = "I")
    private int field864;

    @OriginalMember(owner = "client!mq", name = "r", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!mq", name = "s", descriptor = "I")
    private int field867;

    @OriginalMember(owner = "client!mq", name = "t", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!mq", name = "u", descriptor = "I")
    private int field869;

    @OriginalMember(owner = "client!mq", name = "v", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!mq", name = "y", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!mq", name = "z", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!mq", name = "C", descriptor = "I")
    private int field877;

    @OriginalMember(owner = "client!mq", name = "D", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!mq", name = "q", descriptor = "[B")
    private byte[] field865;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V")
    public final void method375(byte arg0) {
        field868++;
        this.field871 = this.field872;
        this.field864 >>= 0x4;
        if (this.field864 < 0) {
            this.field864 = 0;
        } else if (this.field864 > 255) {
            this.field864 = 255;
        }
        if (arg0 != 120) {
            this.field863 = 65;
        }
        this.method377(-126, this.field869++, (byte) this.field864);
        this.field864 = 0;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)I")
    public static final int method376(int arg0, int arg1) {
        if (arg1 != 32238) {
            return 0;
        }
        field866++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class54(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field863 = (int) (arg7 * 4096.0F);
        this.field879 = (int) (arg6 * 4096.0F);
        this.field871 = this.field872 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIB)V")
    public void method377(int arg0, int arg1, byte arg2) {
        this.field865[arg1] = arg2;
        field873++;
        if (arg0 > -102) {
            method378(27, -11, (byte) -127, 66);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIBI)V")
    public static final void method378(int arg0, int arg1, byte arg2, int arg3) {
        field878++;
        class266 var4 = class308.method1961(true, arg1, 11);
        if (arg2 <= -5) {
            var4.method1781((byte) 95);
            var4.field4453 = arg3;
            var4.field4454 = arg0;
        }
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)V")
    public final void method379(int arg0) {
        if (arg0 != 1) {
            this.field877 = 62;
        }
        this.field869 = 0;
        this.field864 = 0;
        field862++;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(III)V")
    public final void method380(int arg0, int arg1, int arg2) {
        if (arg1 == arg2) {
            this.field877 = this.field879 - (arg0 < 0 ? -arg0 : arg0);
            this.field867 = 4096;
            this.field877 = this.field877 * this.field877 >> 12;
            this.field864 = this.field877;
        } else {
            this.field867 = this.field877 * this.field863 >> 12;
            this.field877 = this.field879 - (arg0 < 0 ? -arg0 : arg0);
            if (this.field867 < 0) {
                this.field867 = 0;
            } else if (this.field867 > 4096) {
                this.field867 = 4096;
            }
            this.field877 = this.field877 * this.field877 >> 12;
            this.field877 = this.field877 * this.field867 >> 12;
            this.field864 += this.field877 * this.field871 >> 12;
            this.field871 = this.field872 * this.field871 >> 12;
        }
        field870++;
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(I)V")
    public static void method381(int arg0) {
        if (arg0 != 8) {
            method378(104, -31, (byte) 127, 102);
        }
        field876 = null;
    }

    static {
        new class306("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
        field876 = new int[] { 1, 2, 4, 8 };
        field875 = false;
    }
}
