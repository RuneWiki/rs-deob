import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class258 extends class51 {

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
    private int field4068;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "I")
    private int field4071;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    private int field4062;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    private int field4064;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "Lrm;")
    public static class184 field4070 = new class184(50);

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "[I")
    public static int[] field4073 = new int[128];

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "I")
    public static int field4072 = 0;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)V", line = 5)
    public static void method1861(byte arg0) {
        field4073 = null;
        field4070 = null;
        if (arg0 != 109) {
            field4070 = (class184) null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(III)V", line = 17)
    public final void method229(int arg0, int arg1, int arg2) {
        field4063++;
        int var4 = this.field4064 * arg2 >> 12;
        if (arg1 != 0) {
            this.field4062 = 70;
        }
        int var5 = this.field4071 * arg2 >> 12;
        int var6 = this.field4062 * arg0 >> 12;
        int var7 = this.field4068 * arg0 >> 12;
        class85.method614(true, this.field647, this.field652, var7, this.field651, var6, var4, var5);
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(IIIIIII)V", line = 34)
    public class258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4068 = arg3;
        this.field4071 = arg2;
        this.field4062 = arg1;
        this.field4064 = arg0;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIII)I", line = 50)
    public static final int method1862(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4067++;
        if (arg1 == 2352272) {
            int var5 = 65536 - class31.field451[arg4 * 1024 / arg3] >> 1;
            return ((65536 - var5) * arg2 >> 16) + (arg0 * var5 >> 16);
        } else {
            return -98;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)V", line = 65)
    public final void method230(int arg0, int arg1, int arg2) {
        field4065++;
        int var4 = this.field4064 * arg2 >> 12;
        int var5 = this.field4071 * arg2 >> 12;
        int var6 = -34 / ((58 - arg0) / 60);
        int var7 = this.field4062 * arg1 >> 12;
        int var8 = this.field4068 * arg1 >> 12;
        class265.method1895(var5, var8, 11, var7, var4, this.field647);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BII)V", line = 89)
    public final void method234(byte arg0, int arg1, int arg2) {
        int var4 = -71 / ((2 - arg0) / 48);
        field4069++;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)I", line = 98)
    public static final int method1863(int arg0, int arg1) {
        field4066++;
        if (arg1 != 685159436) {
            field4070 = (class184) null;
        }
        return arg0 >>> 8;
    }
}
