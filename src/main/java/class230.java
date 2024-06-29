import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class230 extends class62 {

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
    private int field3365;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "Lada;")
    public static class144 field3366 = new class144(60, 14);

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "[I")
    public static int[] field3369 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "I")
    public static int field3371 = 0;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "Lvp;")
    public static class162 field3374;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "Lgf;")
    public static class232 field3373;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "I")
    public static int field3370;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wd", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field3375;

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "[S")
    public static short[] field3372;

    static {
        new class391("", 73);
        field3374 = null;
        field3373 = new class232();
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V", line = 3)
    public class230() {
        this(4096);
    }

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "(I)V", line = 6)
    public static void method1487(int arg0) {
        field3372 = null;
        field3374 = null;
        if (arg0 == 3) {
            field3373 = null;
            field3366 = null;
            field3369 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V", line = 35)
    public class230(int arg0) {
        super(0, true);
        this.field3365 = 4096;
        this.field3365 = arg0;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 25)
    public static final boolean method1488(int arg0, String arg1) {
        ++field3368;
        int var2 = -90 % ((-31 - arg0) / 40);
        return class317.method1919(arg1, 13282, field3375 != null ? field3375 : (field3375 = class62.method410("fu")));
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lgw;II)V", line = 67)
    public final void method11(class148 arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            field3374 = null;
        }
        if (~arg2 == -1) {
            this.field3365 = (arg0.method1032((byte) -33) << 12) / 255;
        }
        ++field3370;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(II)[I", line = 93)
    public final int[] method13(int arg0, int arg1) {
        ++field3367;
        if (arg1 != 656024161) {
            return null;
        } else {
            int[] var3 = super.field774.method3086(arg0, -2);
            if (super.field774.field7499) {
                class648.method3739(var3, 0, class438.field5847, this.field3365);
            }
            return var3;
        }
    }
}
