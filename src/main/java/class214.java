import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class214 extends class223 {

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    private final int field3521;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    private final int field3524;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "I")
    private final int field3531;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
    private final int field3519;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
    private final int field3520;

    @OriginalMember(owner = "client!sk", name = "D", descriptor = "I")
    private final int field3536;

    @OriginalMember(owner = "client!sk", name = "G", descriptor = "I")
    private final int field3539;

    @OriginalMember(owner = "client!sk", name = "H", descriptor = "I")
    private final int field3540;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "I")
    public static int field3527 = 0;

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "[Z")
    public static boolean[] field3529 = new boolean[100];

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "I")
    public static int field3533 = 100;

    @OriginalMember(owner = "client!sk", name = "A", descriptor = "I")
    public static int field3534 = 0;

    @OriginalMember(owner = "client!sk", name = "F", descriptor = "Lph;")
    public static class229 field3538 = class266.method1858(" de votre liste d(Wamis)3", 0);

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "I")
    public static int field3532 = 0;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!sk", name = "C", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!sk", name = "E", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3526;

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "[Lrl;")
    public static class327[] field3530;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZII)V", line = 4)
    public final void method1392(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field3528++;
        }
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 22)
    public class214(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3521 = arg3;
        this.field3524 = arg5;
        this.field3531 = arg1;
        this.field3519 = arg0;
        this.field3520 = arg2;
        this.field3536 = arg7;
        this.field3539 = arg6;
        this.field3540 = arg4;
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)V", line = 38)
    public static void method1515(int arg0) {
        field3530 = null;
        if (arg0 != 17887) {
            field3530 = (class327[]) null;
        }
        field3526 = null;
        field3529 = null;
        field3538 = null;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(III)V", line = 54)
    public final void method1391(int arg0, int arg1, int arg2) {
        if (arg0 < 83) {
            field3532 = -103;
        }
        field3523++;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)V", line = 69)
    public final void method1396(int arg0, int arg1, int arg2) {
        if (arg1 > -66) {
            return;
        }
        int var4 = this.field3519 * arg2 >> 12;
        int var5 = this.field3520 * arg2 >> 12;
        int var6 = this.field3531 * arg0 >> 12;
        field3522++;
        int var7 = this.field3521 * arg0 >> 12;
        int var8 = this.field3540 * arg2 >> 12;
        int var9 = this.field3524 * arg0 >> 12;
        int var10 = this.field3539 * arg2 >> 12;
        int var11 = this.field3536 * arg0 >> 12;
        class277.method1909(this.field3665, 1, var5, var7, var11, var6, var10, var4, var9, var8);
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V", line = 116)
    public static final void method1516(byte arg0) {
        field3535++;
        if (class251.field4208 != null) {
            class203 var1 = class251.field4208;
            synchronized (class251.field4208) {
                class251.field4208 = null;
            }
        }
        if (arg0 >= -76) {
            field3530 = (class327[]) null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)V", line = 150)
    public static final void method1517(int arg0) {
        class279.field4623 = (byte[][]) null;
        field3525++;
        class303.field5064 = null;
        class27.field387 = null;
        class288.field4729 = null;
        class36.field597 = null;
        class314.field5346 = null;
        if (arg0 != -25672) {
            field3526 = (Canvas) null;
        }
    }
}
