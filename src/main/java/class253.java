import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class253 extends class83 {

    @OriginalMember(owner = "client!om", name = "q", descriptor = "I")
    private int field3227;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "I")
    private int field3226;

    @OriginalMember(owner = "client!om", name = "u", descriptor = "I")
    private int field3231;

    @OriginalMember(owner = "client!om", name = "w", descriptor = "I")
    private int field3233;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "I")
    private int field3228;

    @OriginalMember(owner = "client!om", name = "t", descriptor = "I")
    private int field3230;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "I")
    private int field3221;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    private int field3220;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "Ldq;")
    public static class493 field3225 = new class493(58, -2);

    @OriginalMember(owner = "client!om", name = "x", descriptor = "Z")
    public static boolean field3234 = false;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!om", name = "s", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!om", name = "v", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!om", name = "y", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IZI)V")
    public final void method679(int arg0, boolean arg1, int arg2) {
        ++field3229;
        int var4 = this.field3231 * arg0 >> 12;
        int var5 = this.field3228 * arg2 >> 12;
        if (arg1) {
            this.field3221 = -52;
        }
        int var6 = this.field3227 * arg0 >> 12;
        int var7 = this.field3226 * arg2 >> 12;
        int var8 = this.field3220 * arg0 >> 12;
        int var9 = this.field3233 * arg2 >> 12;
        int var10 = this.field3221 * arg0 >> 12;
        int var11 = this.field3230 * arg2 >> 12;
        class151.method992(var11, var10, var7, 0, var8, var5, var6, var9, super.field1044, var4);
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
    public static void method1524(int arg0) {
        if (arg0 != 689892780) {
            method1525(32);
        }
        field3225 = null;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3227 = arg2;
        this.field3226 = arg3;
        this.field3231 = arg0;
        this.field3233 = arg5;
        this.field3228 = arg1;
        this.field3230 = arg7;
        this.field3221 = arg6;
        this.field3220 = arg4;
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V")
    public static final void method1525(int arg0) {
        if (arg0 != -1860040276) {
            method1524(-44);
        }
        ++field3223;
        if (class280.field3572 <= 0 && class483.field7059 != 6) {
            class442.field6333 = class64.field835;
            class64.field835 = null;
            class284.method1677(-20429, 12);
        } else {
            class461.method2721((byte) -76, false);
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(III)V")
    public final void method678(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            ++field3232;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(III)V")
    public final void method676(int arg0, int arg1, int arg2) {
        if (arg2 != 22742) {
            this.method679(18, false, -101);
        }
        ++field3224;
    }
}
