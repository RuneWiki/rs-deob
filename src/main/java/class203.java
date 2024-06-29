import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class203 extends class66 {

    @OriginalMember(owner = "client!vn", name = "v", descriptor = "[I")
    private int[] field2932 = new int[this.field1149];

    @OriginalMember(owner = "client!vn", name = "z", descriptor = "[Ljava/awt/Color;")
    public static Color[] field2936 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!vn", name = "B", descriptor = "[I")
    public static int[] field2938 = new int[4096];

    @OriginalMember(owner = "client!vn", name = "C", descriptor = "[I")
    public static int[] field2939 = new int[50];

    @OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!vn", name = "u", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!vn", name = "w", descriptor = "I")
    private int field2933;

    @OriginalMember(owner = "client!vn", name = "x", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!vn", name = "y", descriptor = "I")
    private int field2935;

    @OriginalMember(owner = "client!vn", name = "A", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!vn", name = "s", descriptor = "[B")
    private byte[] field2929;

    static {
        new class180("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(B)V", line = 4)
    public static void method1368(byte arg0) {
        int var1 = -41 % ((10 - arg0) / 62);
        field2939 = null;
        field2938 = null;
        field2936 = null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IZI)V", line = 16)
    public final void method579(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method404(25, (byte) 31, 36);
        }
        ++field2930;
        this.field2935 += this.field2932[arg2] * arg0 >> 12;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IBI)V", line = 30)
    public void method404(int arg0, byte arg1, int arg2) {
        ++field2934;
        if (arg2 != -12393) {
            this.method576((byte) 25);
        }
        this.field2929[this.field2933++] = (byte) ((class388.method2441(255, arg1) >> 1) + 127);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V", line = 42)
    public final void method576(byte arg0) {
        ++field2931;
        int var2 = 109 % ((6 - arg0) / 62);
        this.field2933 = 0;
        this.field2935 = 0;
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(IIIIIF)V", line = 61)
    public class203(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~var7 > ~super.field1149; ++var7) {
            this.field2932[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V", line = 85)
    public final void method574(int arg0) {
        ++field2937;
        if (arg0 != 28007) {
            this.method574(-79);
        }
        this.field2935 = Math.abs(this.field2935);
        if (this.field2935 >= 4096) {
            this.field2935 = 4095;
        }
        this.method404(this.field2933++, (byte) (this.field2935 >> 4), -12393);
        this.field2935 = 0;
    }
}
