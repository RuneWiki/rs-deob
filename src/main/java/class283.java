import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class283 {

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    private int field3700 = -1;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    private int field3698 = 0;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "Lbb;")
    private class270 field3705 = new class270();

    @OriginalMember(owner = "client!le", name = "s", descriptor = "Z")
    public boolean field3708 = false;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    private int field3694;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    private int field3695;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "[Lub;")
    private class262[] field3697;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "[[I")
    private int[][] field3701;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field3692 = 0;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field3704 = 0;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "Lbb;")
    public static class270 field3699 = new class270();

    @OriginalMember(owner = "client!le", name = "t", descriptor = "I")
    public static int field3709 = 0;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "Lub;")
    private static class262 field3707 = new class262(0, 0);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)[[I")
    public final int[][] method1780(byte arg0) {
        field3702++;
        if (this.field3695 != this.field3694) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = -122 / ((arg0 - 56) / 38);
        for (int var3 = 0; var3 < this.field3695; var3++) {
            this.field3697[var3] = field3707;
        }
        return this.field3701;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IZ)[I")
    public final int[] method1781(int arg0, boolean arg1) {
        if (arg1) {
            field3709 = 47;
        }
        field3691++;
        if (this.field3695 == this.field3694) {
            this.field3708 = this.field3697[arg0] == null;
            this.field3697[arg0] = field3707;
            return this.field3701[arg0];
        } else if (this.field3695 == 1) {
            this.field3708 = this.field3700 != arg0;
            this.field3700 = arg0;
            return this.field3701[0];
        } else {
            class262 var3 = this.field3697[arg0];
            if (var3 == null) {
                this.field3708 = true;
                if (this.field3698 >= this.field3695) {
                    class262 var4 = (class262) this.field3705.method1700((byte) 108);
                    var3 = new class262(arg0, var4.field3371);
                    this.field3697[var4.field3368] = null;
                    var4.method263(false);
                } else {
                    var3 = new class262(arg0, this.field3698);
                    this.field3698++;
                }
                this.field3697[arg0] = var3;
            } else {
                this.field3708 = false;
            }
            this.field3705.method1691(-8567, var3);
            return this.field3701[var3.field3371];
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public final void method1782(int arg0) {
        for (int var2 = 0; var2 < this.field3695; var2++) {
            this.field3701[var2] = null;
        }
        field3703++;
        this.field3697 = null;
        this.field3701 = null;
        this.field3705.method1701(true);
        this.field3705 = null;
        if (arg0 != -5821) {
            this.field3701 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
    public static void method1783(int arg0) {
        if (arg0 > -113) {
            method1783(88);
        }
        field3707 = null;
        field3699 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1784(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 >= class295.field3937 && arg4 <= class427.field5844 && arg5 >= class295.field3937 && arg5 <= class427.field5844 && arg3 >= class295.field3937 && class427.field5844 >= arg3 && arg1 >= class295.field3937 && class427.field5844 >= arg1 && class53.field624 <= arg8 && class118.field1356 >= arg8 && arg9 >= class53.field624 && arg9 <= class118.field1356 && arg7 >= class53.field624 && class118.field1356 >= arg7 && class53.field624 <= arg0 && class118.field1356 >= arg0) {
            class451.method2791(arg5, arg1, arg8, arg4, arg2, 76, arg7, arg0, arg9, arg3);
        } else {
            class162.method1034(arg9, arg2, 128, arg4, arg0, arg3, arg8, arg7, arg1, arg5);
        }
        field3696++;
        if (arg6 != 16873) {
            method1784(31, -67, 85, 20, 31, 20, -8, -62, -77, 9);
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)Lr;")
    public static final class368 method1785(int arg0) {
        if (arg0 != 0) {
            field3693 = -98;
        }
        field3690++;
        try {
            return (class368) Class.forName("w").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(III)V")
    public class283(int arg0, int arg1, int arg2) {
        this.field3694 = arg1;
        this.field3695 = arg0;
        this.field3697 = new class262[this.field3694];
        this.field3701 = new int[this.field3695][arg2];
    }
}
