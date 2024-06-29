import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class246 {

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)V", line = 6)
    public static final void method1655(int arg0, int arg1) {
        field3514++;
        class678 var2 = class630.method3597(arg1 - 16682299, 2, (long) arg0);
        var2.method3836((byte) -104);
        if (arg1 != 16711935) {
            field3513 = 45;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZII)I", line = 24)
    public static final int method1656(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            method1656(53, true, 95, -5);
        }
        field3511++;
        int var4 = ((arg2 & 0xFF00FF) * arg0 & 0xFF00FF00 | (arg2 & 0xFF00) * arg0 & 0xFF0000) >>> 8;
        int var5 = 255 - arg0;
        return (((arg3 & 0xFF00) * var5 & 0xFF0000 | (arg3 & 0xFF00FF) * var5 & 0xFF00FF00) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ldn;Ldn;I)V", line = 38)
    public static final void method1657(class540 arg0, class540 arg1, int arg2) {
        field3512++;
        if (arg0.field7583 != null) {
            arg0.method3117((byte) -125);
        }
        arg0.field7578 = arg1;
        arg0.field7583 = arg1.field7583;
        if (arg2 == -16711936) {
            arg0.field7583.field7578 = arg0;
            arg0.field7578.field7583 = arg0;
        }
    }
}
