import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public abstract class class232 extends class510 {

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public int field3406;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public int field3405;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public int field3402;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public int field3400;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "Ltn;")
    public static class60 field3401 = new class60(77, 7);

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "Ldh;")
    public static class214 field3407;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIB)V", line = 3)
    public static final void method1430(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        class119.field1638 = arg2;
        class461.field6446 = arg3;
        class75.field922 = arg5;
        class397.field5621 = arg4;
        class264.field3879 = arg1;
        if (arg6 <= 46) {
            method1430(-9, 25, 2, 117, -110, 19, (byte) -120);
        }
        class74.field904 = arg0;
        field3403++;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)V", line = 23)
    public static final void method1431(int arg0, int arg1, int arg2) {
        boolean var3 = class268.field3910[0][arg1][arg2] != null && class268.field3910[0][arg1][arg2].field3483 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class268.field3910[var4][arg1][arg2] == null) {
                class239 var5 = class268.field3910[var4][arg1][arg2] = new class239(var4, arg1, arg2);
                if (var3) {
                    var5.field3470++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(Z)V", line = 47)
    public static void method1432(boolean arg0) {
        field3407 = null;
        if (!arg0) {
            field3401 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(IIII)V", line = 61)
    public class232(int arg0, int arg1, int arg2, int arg3) {
        this.field3406 = arg1;
        this.field3405 = arg3;
        this.field3402 = arg0;
        this.field3400 = arg2;
    }
}
