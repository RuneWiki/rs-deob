import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class31 extends class295 {

    @OriginalMember(owner = "client!na", name = "y", descriptor = "[I")
    private int[] field714 = new int[this.field4825];

    @OriginalMember(owner = "client!na", name = "w", descriptor = "Z")
    public static boolean field712 = false;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!na", name = "D", descriptor = "I")
    private int field718;

    @OriginalMember(owner = "client!na", name = "E", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!na", name = "F", descriptor = "I")
    private int field720;

    @OriginalMember(owner = "client!na", name = "G", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!na", name = "C", descriptor = "Lsc;")
    public static class288 field717;

    @OriginalMember(owner = "client!na", name = "A", descriptor = "[B")
    private byte[] field716;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "[[I")
    public static int[][] field710;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V", line = 6)
    public final void method134(int arg0) {
        this.field720 = 0;
        field713++;
        this.field718 = arg0;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)V", line = 16)
    public static void method236(boolean arg0) {
        if (!arg0) {
            field717 = (class288) null;
        }
        field710 = (int[][]) null;
        field717 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V", line = 29)
    public final void method128(int arg0) {
        this.field720 = Math.abs(this.field720);
        field711++;
        if (this.field720 >= 4096) {
            this.field720 = 4095;
        }
        this.method237(this.field718++, (byte) (this.field720 >> 4));
        int var2 = 83 / ((-arg0 - 45) / 35);
        this.field720 = 0;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III)V", line = 51)
    public final void method129(int arg0, int arg1, int arg2) {
        this.field720 += this.field714[arg1] * arg0 >> 12;
        field721++;
        if (arg2 < 125) {
            this.method134(53);
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(IIIIIF)V", line = 66)
    public class31(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field4825; var7++) {
            this.field714[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)V", line = 90)
    public void method237(int arg0, byte arg1) {
        this.field716[this.field718++] = (byte) ((class83.method613(255, arg1) >> 1) + 127);
        field715++;
    }
}
