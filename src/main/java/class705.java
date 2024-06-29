import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class705 {

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public int field9772 = -1;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public int field9771 = -1;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "Lks;")
    public static class443 field9779 = new class443(8);

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field9773;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field9774;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field9776;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field9777;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field9778;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "[I")
    public int[] field9775;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 5)
    public static void method3964(int arg0) {
        if (arg0 != -21322) {
            field9779 = null;
        }
        field9779 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IBI)Z", line = 25)
    public static final boolean method3965(int arg0, byte arg1, int arg2) {
        field9774++;
        if (arg1 != -35) {
            method3967((byte) -20, null);
        }
        return (class141.method1082(-107, arg2, arg0) | class628.method3462((byte) -28, arg2, arg0) | class649.method3549(arg1 ^ 0xFFFFA3EB, arg2, arg0)) & class677.method3784(arg0, true, arg2);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZLha;)V", line = 36)
    public static final void method3966(boolean arg0, class59 arg1) {
        field9778++;
        if (arg0) {
            method3964(-116);
        }
        if (class743.field10329) {
            class202.method1356(false, arg1);
        } else {
            class58.method385(arg1, (byte) -59);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLee;)Luc;", line = 52)
    public static final class27 method3967(byte arg0, class677 arg1) {
        field9776++;
        class476 var2 = class446.method2555(117, arg1);
        if (arg0 <= 51) {
            method3964(81);
        }
        int var3 = arg1.method3799(false);
        int var4 = arg1.method3799(false);
        int var5 = arg1.method3807(-1);
        return new class27(var2.field6522, var2.field6523, var2.field6521, var2.field6528, var2.field6529, var2.field6531, var2.field6526, var2.field6530, var2.field6524, var3, var4, var5);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILee;Z)V", line = 71)
    private final void method3968(int arg0, class677 arg1, boolean arg2) {
        if (!arg2) {
            field9779 = null;
        }
        field9777++;
        if (arg0 == 1) {
            this.field9771 = arg1.method3807(-1);
        } else if (arg0 == 2) {
            this.field9775 = new int[arg1.method3821((byte) -15)];
            for (int var4 = 0; var4 < this.field9775.length; var4++) {
                this.field9775[var4] = arg1.method3807(-1);
            }
            return;
        } else if (arg0 == 3) {
            this.field9772 = arg1.method3821((byte) 94);
            return;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILee;)V", line = 111)
    public final void method3969(int arg0, class677 arg1) {
        while (true) {
            int var3 = arg1.method3821((byte) -22);
            if (var3 == 0) {
                field9773++;
                if (arg0 != -5224) {
                    this.method3969(97, null);
                    return;
                }
                return;
            }
            this.method3968(var3, arg1, true);
        }
    }
}
