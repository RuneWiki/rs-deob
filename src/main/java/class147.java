import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class147 extends class195 {

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "[I")
    private final int[] field2133 = new int[this.field3044];

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "Lma;")
    public static class5 field2129 = class12.method119("gelb:", (byte) 75);

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
    public static int field2138 = 0;

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "Z")
    public static boolean field2139 = false;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "Lrc;")
    public static class210 field2127 = new class210(5000);

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
    private int field2132;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "I")
    private int field2134;

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2141;

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "[B")
    private byte[] field2136;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)V", line = 9)
    public final void method931(int arg0, int arg1, int arg2) {
        field2128++;
        this.field2132 += this.field2133[arg1] * arg2 >> 12;
        if (arg0 != -1) {
            this.field2132 = -117;
        }
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(IIIIIF)V", line = 19)
    public class147(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field3044; var7++) {
            this.field2133[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lni;BLni;)V", line = 42)
    public static final void method932(class202 arg0, byte arg1, class202 arg2) {
        class195.field3041 = arg0;
        class105.field1563 = arg2;
        if (arg1 >= -38) {
            field2137 = -69;
        }
        field2135++;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB)V", line = 58)
    public void method913(int arg0, byte arg1) {
        this.field2136[this.field2134++] = (byte) ((class204.method1354(255, arg1) >> 1) + 127);
        field2140++;
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(B)V", line = 69)
    public final void method933(byte arg0) {
        field2131++;
        this.field2132 = 0;
        if (arg0 >= -126) {
            field2129 = (class5) null;
        }
        this.field2134 = 0;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V", line = 87)
    public final void method934(byte arg0) {
        field2130++;
        this.field2132 = Math.abs(this.field2132);
        if (this.field2132 >= 4096) {
            this.field2132 = 4095;
        }
        if (arg0 >= -48) {
            field2129 = (class5) null;
        }
        this.method913(this.field2134++, (byte) (this.field2132 >> 4));
        this.field2132 = 0;
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V", line = 117)
    public static void method935(int arg0) {
        field2127 = null;
        field2129 = null;
        if (arg0 == 0) {
            field2141 = null;
        }
    }
}
