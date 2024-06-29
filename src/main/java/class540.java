import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public abstract class class540 extends class101 {

    @OriginalMember(owner = "client!uca", name = "v", descriptor = "I")
    public int field7344;

    @OriginalMember(owner = "client!uca", name = "A", descriptor = "I")
    private int field7349;

    @OriginalMember(owner = "client!uca", name = "t", descriptor = "I")
    public int field7342;

    @OriginalMember(owner = "client!uca", name = "z", descriptor = "F")
    public float field7348;

    @OriginalMember(owner = "client!uca", name = "s", descriptor = "I")
    public int field7341;

    @OriginalMember(owner = "client!uca", name = "q", descriptor = "I")
    private int field7339;

    @OriginalMember(owner = "client!uca", name = "y", descriptor = "Z")
    public static boolean field7347 = false;

    @OriginalMember(owner = "client!uca", name = "n", descriptor = "I")
    public static int field7336;

    @OriginalMember(owner = "client!uca", name = "o", descriptor = "I")
    public static int field7337;

    @OriginalMember(owner = "client!uca", name = "p", descriptor = "I")
    public static int field7338;

    @OriginalMember(owner = "client!uca", name = "r", descriptor = "I")
    public static int field7340;

    @OriginalMember(owner = "client!uca", name = "u", descriptor = "I")
    public static int field7343;

    @OriginalMember(owner = "client!uca", name = "w", descriptor = "I")
    public static int field7345;

    @OriginalMember(owner = "client!uca", name = "x", descriptor = "I")
    public static int field7346;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(B)I", line = 3)
    public final int method3080(byte arg0) {
        field7336++;
        if (arg0 >= -99) {
            this.field7339 = -13;
        }
        return this.field7349;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(I)I", line = 14)
    public final int method3081(int arg0) {
        field7337++;
        if (arg0 != 7036) {
            this.field7341 = -125;
        }
        return this.field7339;
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(I)I", line = 32)
    public final int method3082(int arg0) {
        if (arg0 >= -11) {
            this.method3085(-107);
        }
        field7340++;
        return this.field7342;
    }

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "(B)F", line = 50)
    public final float method3083(byte arg0) {
        field7345++;
        return arg0 == -41 ? this.field7348 : 0.9233426F;
    }

    @OriginalMember(owner = "client!uca", name = "e", descriptor = "(B)I", line = 62)
    public final int method3084(byte arg0) {
        if (arg0 != -16) {
            this.method3083((byte) -84);
        }
        field7346++;
        return this.field7344;
    }

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "(I)I", line = 81)
    public final int method3085(int arg0) {
        if (arg0 != 24859) {
            this.method3083((byte) -34);
        }
        field7338++;
        return this.field7341;
    }

    @OriginalMember(owner = "client!uca", name = "<init>", descriptor = "(IIIIIF)V", line = 91)
    public class540(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field7344 = arg2;
        this.field7349 = arg4;
        this.field7342 = arg1;
        this.field7348 = arg5;
        this.field7341 = arg0;
        this.field7339 = arg3;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IBII)V")
    public abstract void method1411(int arg0, byte arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(FB)V")
    public abstract void method1412(float arg0, byte arg1);
}
