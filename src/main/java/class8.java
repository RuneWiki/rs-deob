import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class8 extends class181 {

    @OriginalMember(owner = "client!ag", name = "y", descriptor = "I")
    private final int field130;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    private final int field121;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "I")
    private final int field125;

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "I")
    private final int field126;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
    public static int field120 = 0;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "Z")
    public static boolean field124 = false;

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "I")
    public static int field129 = 0;

    @OriginalMember(owner = "client!ag", name = "A", descriptor = "Loc;")
    public static class151 field132 = class137.method873(2, "<)4col>");

    @OriginalMember(owner = "client!ag", name = "C", descriptor = "Loc;")
    private static class151 field134 = class137.method873(2, "To play on this world move to a free area first)3");

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "Loc;")
    public static class151 field123 = field134;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!ag", name = "B", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "Lhh;")
    public static class84 field131;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BII)V")
    public final void method47(byte arg0, int arg1, int arg2) {
        if (arg0 != -101) {
            this.method47((byte) 5, 7, 81);
        }
        int var4 = this.field121 * arg2 >> 12;
        ++field128;
        int var5 = this.field126 * arg2 >> 12;
        int var6 = this.field125 * arg1 >> 12;
        int var7 = this.field130 * arg1 >> 12;
        class217.method1350(arg0 + 105, var7, var6, var4, super.field3275, var5);
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(BII)V")
    public final void method48(byte arg0, int arg1, int arg2) {
        if (arg0 != 125) {
            this.method48((byte) 64, -101, -77);
        }
        ++field122;
        int var4 = this.field121 * arg2 >> 12;
        int var5 = this.field126 * arg2 >> 12;
        int var6 = this.field125 * arg1 >> 12;
        int var7 = this.field130 * arg1 >> 12;
        class25.method200(var5, super.field3274, var7, var6, 47, super.field3279, var4);
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(IIIIIII)V")
    public class8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field130 = arg3;
        this.field121 = arg0;
        this.field125 = arg1;
        this.field126 = arg2;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
    public static void method49(int arg0) {
        field131 = null;
        field134 = null;
        field123 = null;
        field132 = null;
        if (arg0 != 8454) {
            method49(41);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V")
    public final void method50(int arg0, int arg1, int arg2) {
        ++field127;
        int var4 = this.field121 * arg0 >> 12;
        int var5 = this.field126 * arg0 >> 12;
        if (arg1 != 0) {
            field120 = 116;
        }
        int var6 = this.field125 * arg2 >> 12;
        int var7 = this.field130 * arg2 >> 12;
        class212.method1325(var4, super.field3279, (byte) -126, super.field3275, var7, var5, var6, super.field3274);
    }
}
