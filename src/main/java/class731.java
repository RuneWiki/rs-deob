import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class731 {

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field9897 = 0;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Lmw;")
    public static class517 field9898 = new class517(14, 1);

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "Ljb;")
    public static class519 field9901 = new class519(53, 8);

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field9899;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field9900;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V", line = 23)
    public static void method4035(byte arg0) {
        field9898 = null;
        field9901 = null;
        int var1 = 108 / ((14 - arg0) / 61);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 35)
    public static final void method4036(int arg0) {
        if (arg0 >= 80) {
            field9899++;
            class642.field8649 = new class183[50];
            class10.field118 = 0;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIIIIZ)V", line = 52)
    public static final void method4037(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        if (!arg8) {
            method4037(35, -41, -6, 121, -90, 64, -28, -91, true);
        }
        field9900++;
        if (arg0 < 1 || arg2 < 1 || arg0 > class102.field1467 - 2 || arg2 > (class393.field5663 - 2)) {
            return;
        }
        int var9 = arg3;
        if (arg3 < 3 && class49.method310(arg0, arg2, (byte) 99)) {
            var9 = arg3 + 1;
        }
        if (class125.field1721.field5155.method591(43) == 0 && !class616.method3419(arg2, class786.field10794, -1, var9, arg0)) {
            return;
        }
        if (class443.field6387 == null) {
            return;
        }
        class131.field1803.method4180(arg2, arg0, (byte) 126, class257.field3830[arg3], arg4, class375.field5490, arg3);
        if (arg5 < 0) {
            return;
        }
        int var10 = class125.field1721.field5166.method2848(43);
        class125.field1721.method2255(true, 1, class125.field1721.field5166);
        class131.field1803.method4184(class257.field3830[arg3], arg7, class375.field5490, 122, arg3, arg5, arg0, var9, arg2, arg1, arg6);
        class125.field1721.method2255(true, var10, class125.field1721.field5166);
        return;
    }
}
