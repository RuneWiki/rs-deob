import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class3 {

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field44 = 0;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "F")
    public static float field48;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)V", line = 15)
    public static final void method20(int arg0, int arg1) {
        class119.field2109[1] = (float) (class2.method15(65384, arg1) >> 8) / 255.0F;
        class119.field2109[0] = (float) (class2.method15(arg1, 16723513) >> 16) / 255.0F;
        if (arg0 == -415) {
            class119.field2109[2] = (float) class2.method15(255, arg1) / 255.0F;
            class271.method1915(3, -10948);
            class271.method1915(4, -10948);
            field47++;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)Lfb;", line = 38)
    public static final class219 method21(int arg0, int arg1, int arg2) {
        class228 var3 = class178.field3180[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3950; var4++) {
            class219 var5 = var3.field3932[var4];
            if ((var5.field3795 >> 29 & 0x3L) == 2L && var5.field3793 == arg1 && var5.field3797 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(II)Lpk;", line = 60)
    public static final class255 method22(int arg0, int arg1) {
        class255 var2 = (class255) class253.field4357.method1159((byte) 123, (long) arg1);
        field45++;
        if (var2 != null) {
            return var2;
        }
        class255 var3 = class130.method940(arg1, class192.field3389, false, -22381, class186.field3300);
        if (var3 != null) {
            class253.field4357.method1163(var3, -1, (long) arg1);
        }
        return arg0 < 113 ? (class255) null : var3;
    }
}
