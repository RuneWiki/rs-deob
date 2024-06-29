import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class264 extends class487 {

    @OriginalMember(owner = "client!tm", name = "s", descriptor = "I")
    private int field3810;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
    private int field3802;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    private int field3803;

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
    private int field3807;

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "[I")
    public static int[] field3809 = new int[64];

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!tm", name = "t", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(IIIIIII)V")
    public class264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3810 = arg1;
        this.field3802 = arg2;
        this.field3803 = arg0;
        this.field3807 = arg3;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)V")
    public final void method516(int arg0, int arg1, int arg2) {
        if (arg2 <= 41) {
            this.method516(-90, 9, 8);
        }
        ++field3805;
        int var4 = this.field3803 * arg0 >> 12;
        int var5 = this.field3802 * arg0 >> 12;
        int var6 = this.field3810 * arg1 >> 12;
        int var7 = this.field3807 * arg1 >> 12;
        class376.method2342((byte) 64, super.field7216, super.field7214, var6, var5, super.field7217, var7, var4);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method1700(int arg0, int arg1) {
        int var2 = 99 / ((arg1 - -24) / 42);
        ++field3808;
        return (arg0 >> 24 & 255) + "." + (255 & arg0 >> 16) + "." + ((65530 & arg0) >> 8) + "." + (arg0 & 255);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IBI)V")
    public final void method515(int arg0, byte arg1, int arg2) {
        ++field3811;
        int var4 = this.field3803 * arg0 >> 12;
        int var5 = this.field3802 * arg0 >> 12;
        int var6 = this.field3810 * arg2 >> 12;
        if (arg1 != 12) {
            method1700(-56, 47);
        }
        int var7 = this.field3807 * arg2 >> 12;
        class480.method2858(var5, var6, super.field7216, var4, var7, 8055, super.field7217);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
    public static void method1701(int arg0) {
        if (arg0 != -1927413812) {
            method1702(-46, -68, -85);
        }
        field3809 = null;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(III)B")
    public static final byte method1702(int arg0, int arg1, int arg2) {
        int var3 = 24 / ((90 - arg1) / 33);
        ++field3804;
        if (~arg0 != -10) {
            return 0;
        } else {
            return (byte) (~(arg2 & 1) != -1 ? 2 : 1);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIZ)V")
    public final void method519(int arg0, int arg1, boolean arg2) {
        ++field3806;
        int var4 = this.field3803 * arg1 >> 12;
        int var5 = this.field3802 * arg1 >> 12;
        if (arg2) {
            this.field3803 = -42;
        }
        int var6 = this.field3810 * arg0 >> 12;
        int var7 = this.field3807 * arg0 >> 12;
        class1.method6(var4, var7, var6, super.field7214, var5, (byte) -116);
    }
}
