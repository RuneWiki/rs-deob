import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class67 {

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
    public static int field886 = 0;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "Lnha;")
    public static class501 field885 = new class501("", 14);

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V", line = 3)
    public static void method505(int arg0) {
        if (arg0 != Integer.MIN_VALUE) {
            method505(-42);
        }
        field885 = null;
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)V", line = 15)
    public static final void method506(int arg0) {
        if (arg0 != -8224) {
            method507(119, -55, 13, -62, 79, 5);
        }
        for (int var1 = 0; var1 < class111.field1370; var1++) {
            class310 var2 = class552.field7756[var1];
            if (var2.field3961 == 3) {
                if (var2.field3971 == null) {
                    var2.field3954 = Integer.MIN_VALUE;
                } else {
                    class668.field9148.method664(var2.field3971);
                }
            }
        }
        field887++;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIIII)V", line = 53)
    public static final void method507(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field884++;
        int var6 = class711.method3927(arg4, -118, class328.field4190, class112.field1386);
        int var7 = class711.method3927(arg3, -121, class328.field4190, class112.field1386);
        int var8 = class711.method3927(arg0, -111, class592.field8242, class108.field1334);
        int var9 = class711.method3927(arg2, -126, class592.field8242, class108.field1334);
        int var10 = -45 / ((arg1 + 54) / 48);
        for (int var11 = var6; var11 <= var7; var11++) {
            class284.method1709(class15.field220[var11], var9, -8251, var8, arg5);
        }
    }
}
