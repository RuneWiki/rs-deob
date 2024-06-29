import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class286 extends class504 {

    @OriginalMember(owner = "client!wt", name = "i", descriptor = "S")
    public short field4030;

    @OriginalMember(owner = "client!wt", name = "j", descriptor = "Lcu;")
    public static class206 field4031 = new class206(79, -1);

    @OriginalMember(owner = "client!wt", name = "l", descriptor = "[I")
    public static int[] field4033 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!wt", name = "m", descriptor = "Z")
    public static boolean field4034 = false;

    @OriginalMember(owner = "client!wt", name = "k", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(BI)V", line = 4)
    public static final void method1765(byte arg0, int arg1) {
        class571.field7582 = arg1;
        field4032++;
        class666 var2 = class174.field2680;
        synchronized (class174.field2680) {
            class174.field2680.method3739(0);
            if (arg0 <= 61) {
                field4034 = true;
            }
        }
        class666 var3 = class603.field8015;
        synchronized (class603.field8015) {
            class603.field8015.method3739(0);
        }
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "()V", line = 27)
    public class286() {
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V", line = 38)
    public static void method1766(int arg0) {
        field4031 = null;
        field4033 = null;
        int var1 = 35 / ((33 - arg0) / 38);
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(S)V", line = 47)
    public class286(short arg0) {
        this.field4030 = arg0;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(III)V", line = 56)
    public static final void method1767(int arg0, int arg1, int arg2) {
        class24 var3 = class703.field9899[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field411 != null) {
            var3.field411 = null;
        }
        if (var3.field406 != null) {
            var3.field406 = null;
        }
    }
}
