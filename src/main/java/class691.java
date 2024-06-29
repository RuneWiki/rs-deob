import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class691 {

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "Lcfa;")
    public static class179 field9658 = new class179();

    @OriginalMember(owner = "client!ica", name = "f", descriptor = "Ljava/lang/String;")
    public static String field9661 = "";

    @OriginalMember(owner = "client!ica", name = "e", descriptor = "Z")
    public static boolean field9660 = false;

    @OriginalMember(owner = "client!ica", name = "d", descriptor = "Lvea;")
    public static class288 field9659 = new class288(4);

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "I")
    public static int field9656;

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "I")
    public static int field9657;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(B)V", line = 4)
    public static final void method3902(byte arg0) {
        if (arg0 < 37) {
            method3903(1.7696268210894515D, 126);
        }
        class239.field3580.method3735(2);
        field9656++;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(DI)V", line = 15)
    public static final void method3903(double arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        if (class158.field2531 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class310.field4433[var3] = var4 <= 255 ? var4 : 255;
            }
            class158.field2531 = arg0;
        }
        field9657++;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)V", line = 44)
    public static void method3904(int arg0) {
        field9661 = null;
        field9659 = null;
        if (arg0 >= 126) {
            field9658 = null;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIILfj;Lfj;)V", line = 62)
    public static final void method3905(int arg0, int arg1, int arg2, class682 arg3, class682 arg4) {
        class46 var5 = class704.method3985(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field592 = arg3;
        var5.field581 = arg4;
        int var6 = class774.field10642 == class208.field3219 ? 1 : 0;
        if (!arg3.method909(false)) {
            arg3.field5747 = class695.field9711[var6];
            class695.field9711[var6] = arg3;
        } else if (arg3.method906(67)) {
            arg3.field5747 = class338.field4733[var6];
            class338.field4733[var6] = arg3;
        } else {
            arg3.field5747 = class745.field10328[var6];
            class745.field10328[var6] = arg3;
            class98.field1115 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method909(false)) {
            if (arg4.method906(-66)) {
                arg4.field5747 = class338.field4733[var6];
                class338.field4733[var6] = arg4;
                return;
            }
            arg4.field5747 = class745.field10328[var6];
            class745.field10328[var6] = arg4;
            class98.field1115 = true;
            return;
        }
        arg4.field5747 = class695.field9711[var6];
        class695.field9711[var6] = arg4;
    }
}
