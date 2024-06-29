import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class590 extends class521 {

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
    public static int field8473;

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
    public static int field8474;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "I")
    public static int field8476;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
    public static int field8477;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "I")
    public static int field8478;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "[B")
    private byte[] field8475;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIB)V")
    public final void method922(int arg0, int arg1, byte arg2) {
        field8476++;
        int var4 = arg0 * 2;
        if (arg1 != 14482) {
            this.method922(-35, 73, (byte) -31);
        }
        int var5 = arg2 & 0xFF;
        this.field8475[var4++] = (byte) (var5 * 3 >> 5);
        this.field8475[var4] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIII)[B")
    public final byte[] method3442(int arg0, int arg1, int arg2, int arg3) {
        this.field8475 = new byte[arg2 * 2 * arg0 * arg3];
        if (arg1 != -22908) {
            field8474 = 59;
        }
        field8473++;
        this.method2905(arg2, arg0, (byte) -85, arg3);
        return this.field8475;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
    public class590() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
