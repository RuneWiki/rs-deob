import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public abstract class class180 {

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public int field3115;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public int field3122;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public int field3121;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "[I")
    public static int[] field3117 = new int[32];

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Ljf;")
    public static class229 field3119 = class212.method1457((byte) 87, "<col=ffffff>");

    @OriginalMember(owner = "client!af", name = "b", descriptor = "Ljava/util/Random;")
    public static Random field3116 = new Random();

    @OriginalMember(owner = "client!af", name = "k", descriptor = "[I")
    public static int[] field3125 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "Lek;")
    public static class185 field3123;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "Lte;")
    public static class297 field3126;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "Lfk;")
    public static class45 field3124;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IB)V", line = 21)
    public static final void method1241(int arg0, byte arg1) {
        field3118++;
        if (arg0 == -1 && !class269.field4620) {
            class20.method193(true);
        } else if (arg0 != -1 && (class232.field4020 != arg0 || !class48.method409(-1)) && class27.field487 != 0 && !class269.field4620) {
            class82.method578(true, arg0, 0, class259.field4506, class27.field487, false, 2);
        }
        class232.field4020 = arg0;
        if (arg1 >= -78) {
            method1241(113, (byte) -106);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([BI)Lvm;", line = 64)
    public static final class77 method1242(byte[] arg0, int arg1) {
        field3120++;
        if (arg0 == null) {
            return null;
        } else {
            int var2 = 13 / ((38 - arg1) / 49);
            class77 var3 = new class77(arg0, class272.field4659, class256.field4473, class232.field4025, class6.field71, class21.field357);
            class62.method466((byte) 63);
            return var3;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)V", line = 81)
    public static void method1243(boolean arg0) {
        field3124 = null;
        field3117 = null;
        field3116 = null;
        field3125 = null;
        if (!arg0) {
            field3116 = (Random) null;
        }
        field3123 = null;
        field3126 = null;
        field3119 = null;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(III)V", line = 100)
    public class180(int arg0, int arg1, int arg2) {
        this.field3115 = arg2;
        this.field3122 = arg1;
        this.field3121 = arg0;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(III)V")
    public abstract void method787(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(III)V")
    public abstract void method789(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(III)V")
    public abstract void method786(int arg0, int arg1, int arg2);
}
