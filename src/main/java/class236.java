import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class236 extends class396 {

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    private int field3552;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    private int field3554;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    private int field3547;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    private int field3551;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    private int field3550;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    private int field3555;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "I")
    private int field3559;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "I")
    private int field3557;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public static int field3548 = -1;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    public static int field3553 = 100;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!em", name = "p", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!em", name = "r", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!em", name = "s", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!em", name = "t", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(III)V")
    public final void method1580(int arg0, int arg1, int arg2) {
        if (arg1 >= -5) {
            this.field3559 = -30;
        }
        ++field3558;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3552 = arg6;
        this.field3554 = arg5;
        this.field3547 = arg2;
        this.field3551 = arg7;
        this.field3550 = arg0;
        this.field3555 = arg4;
        this.field3559 = arg1;
        this.field3557 = arg3;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(CI)Z")
    public static final boolean method1581(char arg0, int arg1) {
        if (arg1 != 255) {
            method1585(true);
        }
        ++field3560;
        if ((arg0 <= 0 || ~arg0 <= -129) && (arg0 < 160 || arg0 > 255)) {
            if (~arg0 != -1) {
                char[] var2 = class242.field3616;
                for (int var3 = 0; var2.length > var3; ++var3) {
                    char var4 = var2[var3];
                    if (arg0 == var4) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)Z")
    public static final boolean method1582(int arg0, int arg1) {
        ++field3562;
        if (arg1 != 0) {
            return true;
        } else {
            return ~arg0 <= -1 && ~arg0 >= -4 || ~arg0 == -10;
        }
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(III)V")
    public final void method1583(int arg0, int arg1, int arg2) {
        ++field3549;
        if (arg1 != 126) {
            this.field3551 = 48;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(III)V")
    public final void method1584(int arg0, int arg1, int arg2) {
        ++field3561;
        int var4 = this.field3550 * arg1 >> 12;
        int var5 = this.field3559 * arg0 >> 12;
        int var6 = this.field3547 * arg1 >> 12;
        int var7 = this.field3557 * arg0 >> 12;
        int var8 = this.field3555 * arg1 >> 12;
        int var9 = this.field3554 * arg0 >> 12;
        int var10 = this.field3552 * arg1 >> 12;
        if (arg2 != -1791337721) {
            this.field3559 = 53;
        }
        int var11 = this.field3551 * arg0 >> 12;
        class22.method224(var6, var10, super.field5448, var9, var5, var7, var8, var4, -1949423318, var11);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)Lgaa;")
    public static final class313 method1585(boolean arg0) {
        ++field3556;
        class313 var1 = (class313) class53.field670.method636(256);
        if (var1 != null) {
            var1.method3387((byte) -75);
            var1.method827(3);
            return var1;
        } else if (arg0) {
            return null;
        } else {
            class313 var2;
            do {
                var2 = (class313) class170.field2655.method636(256);
                if (var2 == null) {
                    return null;
                }
                if (var2.method2003(-120) > class459.method2731(102)) {
                    return null;
                }
                var2.method3387((byte) 117);
                var2.method827(3);
            } while (~(Long.MIN_VALUE & var2.field1597) == -1L);
            return var2;
        }
    }
}
