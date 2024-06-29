import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class451 extends class671 {

    @OriginalMember(owner = "client!kp", name = "x", descriptor = "[I")
    private int[] field6498 = new int[this.field9476];

    @OriginalMember(owner = "client!kp", name = "w", descriptor = "I")
    public static int field6497 = 0;

    @OriginalMember(owner = "client!kp", name = "s", descriptor = "[I")
    public static int[] field6493 = new int[14];

    @OriginalMember(owner = "client!kp", name = "t", descriptor = "I")
    private int field6494;

    @OriginalMember(owner = "client!kp", name = "v", descriptor = "I")
    public static int field6496;

    @OriginalMember(owner = "client!kp", name = "y", descriptor = "I")
    public static int field6499;

    @OriginalMember(owner = "client!kp", name = "z", descriptor = "I")
    public static int field6500;

    @OriginalMember(owner = "client!kp", name = "B", descriptor = "I")
    private int field6501;

    @OriginalMember(owner = "client!kp", name = "D", descriptor = "I")
    public static int field6503;

    @OriginalMember(owner = "client!kp", name = "C", descriptor = "Lpu;")
    public static class522 field6502;

    @OriginalMember(owner = "client!kp", name = "u", descriptor = "[B")
    private byte[] field6495;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V", line = 4)
    public final void method904(int arg0) {
        ++field6503;
        this.field6501 = 0;
        int var2 = 68 / ((arg0 - -56) / 52);
        this.field6494 = 0;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(IIIIIF)V", line = 16)
    public class451(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; super.field9476 > var7; ++var7) {
            this.field6498[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)V", line = 34)
    public final void method902(boolean arg0) {
        this.field6494 = Math.abs(this.field6494);
        ++field6499;
        if (~this.field6494 <= -4097) {
            this.field6494 = 4095;
        }
        this.method2392(false, this.field6501++, (byte) (this.field6494 >> 4));
        this.field6494 = 0;
        if (!arg0) {
            this.method902(false);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZIB)V", line = 59)
    public void method2392(boolean arg0, int arg1, byte arg2) {
        if (!arg0) {
            ++field6500;
            this.field6495[this.field6501++] = (byte) (127 + class689.method3797(arg2 >> 1, 127));
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIB)V", line = 70)
    public final void method907(int arg0, int arg1, byte arg2) {
        ++field6496;
        if (arg2 != 44) {
            this.field6495 = null;
        }
        this.field6494 += this.field6498[arg0] * arg1 >> 12;
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(B)V", line = 87)
    public static void method2672(byte arg0) {
        if (arg0 == -24) {
            field6502 = null;
            field6493 = null;
        }
    }
}
