import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class376 extends class296 {

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    private int field4977;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "I")
    private int field4980;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
    private int field4983;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
    private int field4984;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "[B")
    public static byte[] field4975 = new byte[2048];

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "I")
    public static int field4982 = 0;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "[I")
    public static int[] field4981;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V", line = 8)
    public static void method2151(int arg0) {
        field4981 = null;
        if (arg0 == 16777215) {
            field4975 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(III)V", line = 19)
    public final void method134(int arg0, int arg1, int arg2) {
        ++field4976;
        int var4 = this.field4983 * arg0 >> 12;
        if (arg2 > -125) {
            field4981 = null;
        }
        int var5 = this.field4984 * arg0 >> 12;
        int var6 = this.field4980 * arg1 >> 12;
        int var7 = this.field4977 * arg1 >> 12;
        class481.method2767(super.field3920, 8, var5, var7, var4, var6);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BII)V", line = 38)
    public final void method136(byte arg0, int arg1, int arg2) {
        if (arg0 == 122) {
            ++field4979;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IBI)V", line = 49)
    public final void method135(int arg0, byte arg1, int arg2) {
        ++field4978;
        int var4 = this.field4983 * arg0 >> 12;
        if (arg1 > 20) {
            int var5 = this.field4984 * arg0 >> 12;
            int var6 = this.field4980 * arg2 >> 12;
            int var7 = this.field4977 * arg2 >> 12;
            class541.method3034(super.field3918, var7, super.field3920, var5, true, var6, super.field3919, var4);
        }
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(IIIIIII)V", line = 73)
    public class376(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4977 = arg3;
        this.field4980 = arg1;
        this.field4983 = arg0;
        this.field4984 = arg2;
    }
}
