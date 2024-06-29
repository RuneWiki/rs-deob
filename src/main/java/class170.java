import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class170 extends class51 {

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    private int field2799;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    private int field2800;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    private int field2797;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    private int field2795;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    private int field2803;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
    private int field2807;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
    private int field2805;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "I")
    private int field2806;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "[I")
    public static int[] field2798 = new int[100];

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "[I")
    public static int[] field2794 = new int[100];

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
    public static int field2804 = 0;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V", line = 9)
    public static void method1275(byte arg0) {
        field2794 = null;
        field2798 = null;
        int var1 = -20 % ((arg0 + 65) / 46);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BII)V", line = 25)
    public final void method234(byte arg0, int arg1, int arg2) {
        field2796++;
        int var4 = this.field2806 * arg2 >> 12;
        int var5 = -69 % ((2 - arg0) / 48);
        int var6 = this.field2803 * arg2 >> 12;
        int var7 = this.field2799 * arg1 >> 12;
        int var8 = this.field2800 * arg1 >> 12;
        int var9 = this.field2795 * arg2 >> 12;
        int var10 = this.field2807 * arg1 >> 12;
        int var11 = this.field2805 * arg1 >> 12;
        int var12 = this.field2797 * arg2 >> 12;
        class297.method2068(var6, var9, var4, var11, (byte) 96, var10, var12, var8, this.field652, var7);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIZ)V", line = 51)
    public static final void method1276(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2809++;
        if (class286.method2022((byte) -33, arg1)) {
            class51.method375(class269.field4182[arg1], arg3, -1, arg0, arg4, -1);
            if (arg2 != 3993) {
                field2804 = 26;
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILug;Lug;BZ)Lq;", line = 65)
    public static final class193 method1277(int arg0, class253 arg1, class253 arg2, byte arg3, boolean arg4) {
        field2808++;
        boolean var5 = true;
        int[] var6 = arg2.method1842((byte) -1, arg0);
        if (arg3 <= 23) {
            field2798 = (int[]) null;
        }
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg2.method1830(536, var6[var7], arg0);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg4) {
                    var10 = arg1.method1830(536, var9, 0);
                } else {
                    var10 = arg1.method1830(536, 0, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class193(arg2, arg1, arg0, arg4);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 121)
    public class170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2799 = arg1;
        this.field2800 = arg3;
        this.field2797 = arg6;
        this.field2795 = arg4;
        this.field2803 = arg2;
        this.field2807 = arg7;
        this.field2805 = arg5;
        this.field2806 = arg0;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(III)V", line = 138)
    public final void method229(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field2795 = 8;
        }
        field2810++;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)V", line = 154)
    public final void method230(int arg0, int arg1, int arg2) {
        int var4 = 3 / ((arg0 - 58) / 60);
        field2801++;
    }
}
