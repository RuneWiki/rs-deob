import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class239 extends class602 {

    @OriginalMember(owner = "client!fga", name = "n", descriptor = "I")
    private int field3101;

    @OriginalMember(owner = "client!fga", name = "r", descriptor = "I")
    private int field3105;

    @OriginalMember(owner = "client!fga", name = "f", descriptor = "I")
    private int field3093;

    @OriginalMember(owner = "client!fga", name = "m", descriptor = "I")
    private int field3100;

    @OriginalMember(owner = "client!fga", name = "o", descriptor = "I")
    private int field3102;

    @OriginalMember(owner = "client!fga", name = "j", descriptor = "I")
    private int field3097;

    @OriginalMember(owner = "client!fga", name = "i", descriptor = "I")
    private int field3096;

    @OriginalMember(owner = "client!fga", name = "l", descriptor = "I")
    private int field3099;

    @OriginalMember(owner = "client!fga", name = "h", descriptor = "[I")
    public static int[] field3095 = new int[14];

    @OriginalMember(owner = "client!fga", name = "g", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!fga", name = "k", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!fga", name = "p", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!fga", name = "q", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 5)
    public class239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3101 = arg4;
        this.field3105 = arg3;
        this.field3093 = arg6;
        this.field3100 = arg7;
        this.field3102 = arg1;
        this.field3097 = arg2;
        this.field3096 = arg0;
        this.field3099 = arg5;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(ZII)V", line = 24)
    public final void method805(boolean arg0, int arg1, int arg2) {
        ++field3104;
        int var4 = this.field3096 * arg2 >> 12;
        int var5 = this.field3102 * arg1 >> 12;
        int var6 = this.field3097 * arg2 >> 12;
        int var7 = this.field3105 * arg1 >> 12;
        if (!arg0) {
            int var8 = this.field3101 * arg2 >> 12;
            int var9 = this.field3099 * arg1 >> 12;
            int var10 = this.field3093 * arg2 >> 12;
            int var11 = this.field3100 * arg1 >> 12;
            class484.method2633(var10, super.field8084, var6, var11, var7, var8, var5, var9, 2, var4);
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(I)V", line = 63)
    public static void method1441(int arg0) {
        field3095 = null;
        if (arg0 != 19582) {
            method1441(-57);
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(III)V", line = 74)
    public final void method807(int arg0, int arg1, int arg2) {
        ++field3103;
        if (arg2 != 5) {
            this.field3093 = 16;
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(IBI)V", line = 89)
    public final void method803(int arg0, byte arg1, int arg2) {
        ++field3094;
        if (arg1 != 61) {
            this.field3096 = 31;
        }
    }
}
