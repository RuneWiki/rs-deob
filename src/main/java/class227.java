import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class227 {

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public int field3184 = 0;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public int field3188 = 2048;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public int field3191 = 2048;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public int field3192 = 0;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field3187 = -2;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Z")
    public static boolean field3189 = true;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "B")
    public static byte field3190;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lmo;B)V", line = 6)
    public final void method1491(class695 arg0, byte arg1) {
        if (arg1 != -3) {
            this.method1492(-65, null, false);
        }
        field3193++;
        while (true) {
            int var3 = arg0.method3826(false);
            if (var3 == 0) {
                return;
            }
            this.method1492(var3, arg0, true);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILmo;Z)V", line = 32)
    private final void method1492(int arg0, class695 arg1, boolean arg2) {
        if (arg0 == 1) {
            this.field3192 = arg1.method3826(false);
        } else if (arg0 == 2) {
            this.field3191 = arg1.method3847((byte) 118);
        } else if (arg0 == 3) {
            this.field3188 = arg1.method3847((byte) 118);
        } else if (arg0 == 4) {
            this.field3184 = arg1.method3814(!arg2);
        }
        if (!arg2) {
            field3190 = 101;
        }
        field3186++;
    }
}
