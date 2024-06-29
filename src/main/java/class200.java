import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class200 extends class36 {

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "I")
    private int field3252;

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "I")
    private int field3259;

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "I")
    private int field3261;

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "I")
    private int field3260;

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "I")
    private int field3262;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
    private int field3257;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
    private int field3255;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    private int field3256;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "[I")
    public static int[] field3251 = new int[2048];

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
    public static int field3254 = -1;

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "[I")
    public static int[] field3263 = new int[200];

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "I")
    public static int field3264 = 0;

    @OriginalMember(owner = "client!ej", name = "E", descriptor = "I")
    public static int field3265 = 0;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIB)V")
    public final void method309(int arg0, int arg1, byte arg2) {
        if (arg2 != -17) {
            this.field3262 = 122;
        }
        ++field3253;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3252 = arg7;
        this.field3259 = arg3;
        this.field3261 = arg4;
        this.field3260 = arg5;
        this.field3262 = arg1;
        this.field3257 = arg2;
        this.field3255 = arg0;
        this.field3256 = arg6;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(IIB)V")
    public final void method310(int arg0, int arg1, byte arg2) {
        int var4 = this.field3255 * arg1 >> 12;
        int var5 = this.field3262 * arg0 >> 12;
        ++field3258;
        int var6 = this.field3259 * arg0 >> 12;
        int var7 = this.field3257 * arg1 >> 12;
        int var8 = this.field3261 * arg1 >> 12;
        int var9 = -10 / ((-65 - arg2) / 34);
        int var10 = this.field3256 * arg1 >> 12;
        int var11 = this.field3252 * arg0 >> 12;
        int var12 = this.field3260 * arg0 >> 12;
        class230.method1530(super.field611, var8, var5, var12, var6, var4, var10, var7, 0, var11);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)V")
    public final void method307(int arg0, int arg1, int arg2) {
        ++field3250;
        if (arg0 != 0) {
            this.field3252 = -116;
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
    public static void method1355(int arg0) {
        field3263 = null;
        field3251 = null;
        if (arg0 != -25319) {
            field3254 = 22;
        }
    }
}
