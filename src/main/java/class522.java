import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class522 extends class497 {

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "[I")
    private int[] field7656 = new int[this.field6946];

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "Lwo;")
    public static class690 field7658 = new class690(50, 5);

    @OriginalMember(owner = "client!wm", name = "A", descriptor = "I")
    public static int field7665 = 0;

    @OriginalMember(owner = "client!wm", name = "x", descriptor = "Lwaa;")
    public static class652 field7662 = new class652(64);

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
    private int field7654;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
    public static int field7655;

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
    private int field7657;

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "I")
    public static int field7659;

    @OriginalMember(owner = "client!wm", name = "w", descriptor = "I")
    public static int field7661;

    @OriginalMember(owner = "client!wm", name = "y", descriptor = "I")
    public static int field7663;

    @OriginalMember(owner = "client!wm", name = "z", descriptor = "I")
    public static int field7664;

    @OriginalMember(owner = "client!wm", name = "v", descriptor = "[B")
    private byte[] field7660;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lun;I)Leg;")
    public static final class91 method3094(class389 arg0, int arg1) {
        if (arg1 != 0) {
            field7665 = -122;
        }
        ++field7663;
        int var2 = arg0.method2229(arg1 ^ 255);
        class564 var3 = class262.method1597((byte) 49)[arg0.method2229(255)];
        class172 var4 = class423.method2555((byte) 122)[arg0.method2229(255)];
        int var5 = arg0.method2270((byte) 71);
        int var6 = arg0.method2270((byte) 71);
        int var7 = arg0.method2260(-103);
        int var8 = arg0.method2260(arg1 + -78);
        int var9 = arg0.method2255(255);
        int var10 = arg0.method2255(255);
        int var11 = arg0.method2255(255);
        boolean var12 = arg0.method2229(255) == 1;
        return new class91(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V")
    public final void method766(int arg0) {
        this.field7654 = 0;
        this.field7657 = 0;
        ++field7661;
        int var2 = -1 / ((arg0 - 82) / 36);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIB)V")
    public void method415(int arg0, int arg1, byte arg2) {
        ++field7659;
        this.field7660[this.field7654++] = (byte) ((class435.method2605(arg2, arg0) >> 1) + 127);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)V")
    public final void method768(int arg0, int arg1, int arg2) {
        if (arg0 == -1) {
            ++field7664;
            this.field7657 += this.field7656[arg1] * arg2 >> 12;
        }
    }

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "(I)V")
    public static void method3095(int arg0) {
        field7662 = null;
        if (arg0 != 25130) {
            method3095(49);
        }
        field7658 = null;
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(IIIIIF)V")
    public class522(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < super.field6946; ++var7) {
            this.field7656[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)V")
    public final void method769(int arg0) {
        ++field7655;
        this.field7657 = Math.abs(this.field7657);
        int var2 = 123 % ((arg0 - 2) / 53);
        if (~this.field7657 <= -4097) {
            this.field7657 = 4095;
        }
        this.method415(255, this.field7654++, (byte) (this.field7657 >> 4));
        this.field7657 = 0;
    }
}
