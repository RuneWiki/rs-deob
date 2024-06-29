import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class492 extends class632 {

    @OriginalMember(owner = "client!aq", name = "n", descriptor = "I")
    private int field6781;

    @OriginalMember(owner = "client!aq", name = "h", descriptor = "I")
    private int field6775;

    @OriginalMember(owner = "client!aq", name = "q", descriptor = "I")
    private int field6784;

    @OriginalMember(owner = "client!aq", name = "l", descriptor = "I")
    private int field6779;

    @OriginalMember(owner = "client!aq", name = "i", descriptor = "I")
    public static int field6776 = -1;

    @OriginalMember(owner = "client!aq", name = "p", descriptor = "[I")
    public static int[] field6783 = new int[32];

    @OriginalMember(owner = "client!aq", name = "s", descriptor = "I")
    public static int field6786 = 0;

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "I")
    public static int field6777;

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
    public static int field6778;

    @OriginalMember(owner = "client!aq", name = "m", descriptor = "I")
    public static int field6780;

    @OriginalMember(owner = "client!aq", name = "r", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!aq", name = "o", descriptor = "[Lho;")
    public static class318[] field6782;

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(IIIIIII)V")
    public class492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field6781 = arg1;
        this.field6775 = arg0;
        this.field6784 = arg2;
        this.field6779 = arg3;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILs;)V")
    public static final void method2905(int arg0, class418 arg1) {
        class661.field9303[arg0] = arg1;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IBI)V")
    public final void method1994(int arg0, byte arg1, int arg2) {
        int var4 = 51 % ((arg1 - 33) / 62);
        ++field6777;
        int var5 = this.field6775 * arg0 >> 12;
        int var6 = this.field6784 * arg0 >> 12;
        int var7 = this.field6781 * arg2 >> 12;
        int var8 = this.field6779 * arg2 >> 12;
        class106.method752(var5, var8, var6, super.field8836, super.field8834, var7, (byte) -111);
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)V")
    public static void method2906(int arg0) {
        if (arg0 == 2) {
            field6782 = null;
            field6783 = null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public static final boolean method2907(boolean arg0, String arg1) {
        ++field6778;
        if (!arg0) {
            method2906(5);
        }
        return class644.field9022.containsKey(arg1);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIB)V")
    public final void method1993(int arg0, int arg1, byte arg2) {
        ++field6785;
        int var4 = this.field6775 * arg0 >> 12;
        int var5 = this.field6784 * arg0 >> 12;
        int var6 = this.field6781 * arg1 >> 12;
        if (arg2 > -79) {
            method2905(-65, (class418) null);
        }
        int var7 = this.field6779 * arg1 >> 12;
        class640.method3678(super.field8835, var6, var4, true, var5, var7);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(BII)V")
    public final void method1992(byte arg0, int arg1, int arg2) {
        if (arg0 < 96) {
            this.field6784 = -37;
        }
        ++field6780;
        int var4 = this.field6775 * arg2 >> 12;
        int var5 = this.field6784 * arg2 >> 12;
        int var6 = this.field6781 * arg1 >> 12;
        int var7 = this.field6779 * arg1 >> 12;
        class610.method3533(var5, var6, super.field8834, super.field8835, var4, -2, super.field8836, var7);
    }
}
