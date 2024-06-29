import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class226 extends class354 {

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "I")
    private int field3300;

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "Lao;")
    public static class188 field3299 = new class188(91, 2);

    @OriginalMember(owner = "client!ng", name = "M", descriptor = "Lao;")
    public static class188 field3303 = new class188(33, 2);

    @OriginalMember(owner = "client!ng", name = "O", descriptor = "[I")
    public static int[] field3305 = new int[500];

    @OriginalMember(owner = "client!ng", name = "P", descriptor = "Lmg;")
    public static class100 field3306 = null;

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!ng", name = "L", descriptor = "Lf;")
    public static class528 field3302;

    @OriginalMember(owner = "client!ng", name = "N", descriptor = "Lf;")
    public static class528 field3304;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(B)V", line = 6)
    public static void method1497(byte arg0) {
        if (arg0 < 123) {
            method1497((byte) -18);
        }
        field3304 = null;
        field3303 = null;
        field3306 = null;
        field3305 = null;
        field3302 = null;
        field3299 = null;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(I)V", line = 25)
    public class226(int arg0) {
        super(0, true);
        this.field3300 = 4096;
        this.field3300 = arg0;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILti;I)V", line = 37)
    public final void method206(int arg0, class303 arg1, int arg2) {
        ++field3298;
        if (arg2 == 0) {
            this.field3300 = (arg1.method1918((byte) 86) << 12) / 255;
        }
        if (arg0 != 15180) {
            method1497((byte) -103);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)[I", line = 64)
    public final int[] method253(int arg0, byte arg1) {
        ++field3301;
        if (arg1 != -95) {
            field3299 = null;
        }
        int[] var3 = super.field5357.method861(true, arg0);
        if (super.field5357.field1869) {
            class486.method2900(var3, 0, class404.field5952, this.field3300);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V", line = 86)
    public class226() {
        this(4096);
    }
}
