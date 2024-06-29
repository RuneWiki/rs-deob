import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class233 extends class356 {

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "[I")
    private int[] field3383 = new int[this.field5050];

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field3385 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "[I")
    public static int[] field3386 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
    private int field3382;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
    private int field3388;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "[B")
    private byte[] field3389;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)V", line = 4)
    public final void method1627(int arg0, int arg1, int arg2) {
        if (arg2 != -2) {
            this.method1628(false);
        }
        this.field3382 += this.field3383[arg1] * arg0 >> 12;
        ++field3384;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V", line = 22)
    public final void method1628(boolean arg0) {
        ++field3387;
        this.field3382 = 0;
        this.field3388 = 0;
        if (!arg0) {
            this.field3382 = -121;
        }
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)V", line = 48)
    public final void method1629(int arg0) {
        this.field3382 = Math.abs(this.field3382);
        ++field3381;
        if (~this.field3382 <= -4097) {
            this.field3382 = 4095;
        }
        this.method722((byte) 92, this.field3388++, (byte) (this.field3382 >> 4));
        if (arg0 != -1538606516) {
            this.method1627(-74, -93, 118);
        }
        this.field3382 = 0;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(IIIIIF)V", line = 64)
    public class233(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < super.field5050; ++var7) {
            this.field3383[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BIB)V", line = 84)
    public void method722(byte arg0, int arg1, byte arg2) {
        this.field3389[this.field3388++] = (byte) (class263.method1762(127, arg2 >> 1) + 127);
        if (arg0 < 79) {
            this.method1628(true);
        }
        ++field3390;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V", line = 97)
    public static void method1630(byte arg0) {
        field3385 = null;
        field3386 = null;
        if (arg0 >= -39) {
            method1630((byte) 50);
        }
    }
}
