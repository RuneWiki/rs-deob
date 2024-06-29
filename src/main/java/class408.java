import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class408 extends class442 {

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "I")
    private int field5788;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
    private int field5787;

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "I")
    private int field5790;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
    private int field5785;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
    public static int field5782 = 0;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "I")
    private int field5781;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
    public static int field5783;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
    public static int field5784;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
    private int field5786;

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "I")
    private int field5789;

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "I")
    private int field5795;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "Lrg;")
    public static class395 field5780;

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "[B")
    private byte[] field5794;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)V", line = 4)
    public void method718(int arg0, byte arg1) {
        field5792++;
        this.field5794[arg0] = arg1;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(IIIIIFFF)V", line = 27)
    public class408(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field5788 = (int) (arg6 * 4096.0F);
        this.field5787 = (int) (arg7 * 4096.0F);
        this.field5785 = this.field5790 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)V", line = 39)
    public final void method2127(int arg0, int arg1, int arg2) {
        if (arg1 != -256) {
            this.method718(60, (byte) -85);
        }
        field5791++;
        if (arg2 == 0) {
            this.field5781 = this.field5788 - (arg0 >= 0 ? arg0 : -arg0);
            this.field5786 = 4096;
            this.field5781 = this.field5781 * this.field5781 >> 12;
            this.field5795 = this.field5781;
            return;
        }
        this.field5786 = this.field5787 * this.field5781 >> 12;
        this.field5781 = this.field5788 - (arg0 >= 0 ? arg0 : -arg0);
        if (this.field5786 < 0) {
            this.field5786 = 0;
        } else if (this.field5786 > 4096) {
            this.field5786 = 4096;
        }
        this.field5781 = this.field5781 * this.field5781 >> 12;
        this.field5781 = this.field5786 * this.field5781 >> 12;
        this.field5795 += this.field5785 * this.field5781 >> 12;
        this.field5785 = this.field5790 * this.field5785 >> 12;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V", line = 74)
    public final void method2128(int arg0) {
        this.field5789 = 0;
        if (arg0 != 1) {
            this.method718(-94, (byte) -26);
        }
        field5784++;
        this.field5795 = 0;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lg;ZILjava/lang/String;)Ltg;", line = 91)
    public static final class318 method2426(class470 arg0, boolean arg1, int arg2, String arg3) {
        field5793++;
        int var4 = arg0.method2761(0, arg3);
        if (var4 == -1) {
            return new class318(0);
        }
        int[] var5 = arg0.method2765(var4, 0);
        class318 var6 = new class318(var5.length);
        int var7 = arg2;
        int var8 = 0;
        while (true) {
            while (var7 < var6.field4630) {
                class179 var9 = new class179(arg0.method2768(arg2 - 20472, var5[var8++], var4));
                int var10 = var9.method939((byte) -96);
                int var11 = var9.method916(21933);
                int var12 = var9.method895((byte) -126);
                if (!arg1 && var12 == 1) {
                    var6.field4630--;
                } else {
                    var6.field4633[var7] = var10;
                    var6.field4627[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V", line = 134)
    public final void method2129(int arg0) {
        this.field5785 = this.field5790;
        if (arg0 != 255) {
            this.method2127(84, -57, -76);
        }
        this.field5795 >>= 0x4;
        field5783++;
        if (this.field5795 < 0) {
            this.field5795 = 0;
        } else if (this.field5795 > 255) {
            this.field5795 = 255;
        }
        this.method718(this.field5789++, (byte) this.field5795);
        this.field5795 = 0;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(B)V", line = 156)
    public static void method2427(byte arg0) {
        if (arg0 == 101) {
            field5780 = null;
        }
    }
}
