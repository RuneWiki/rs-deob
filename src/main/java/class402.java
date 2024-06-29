import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class402 extends class260 {

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    private int field6010;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    private int field6008;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "I")
    private int field6013;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    private int field6009;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "Liu;")
    public static class517 field6006 = new class517(73, 8);

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field6004;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "[Lha;")
    public static class116[] field6012;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(III)Z", line = 4)
    public static final boolean method2455(int arg0, int arg1, int arg2) {
        ++field6007;
        if (arg2 != 31705) {
            field6006 = null;
        }
        return (class104.field1755[1][arg1][arg0] & 2) != 0;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZIILbj;BII)V", line = 25)
    public static final void method2456(boolean arg0, int arg1, int arg2, class439 arg3, byte arg4, int arg5, int arg6) {
        ++field6005;
        if (~class621.field8746 > -51) {
            if (arg3 != null && arg3.field6400 != null && ~arg2 > ~arg3.field6400.length && arg3.field6400[arg2] != null) {
                int var7 = arg3.field6400[arg2][0];
                int var8 = var7 >> 8;
                int var9 = (245 & var7) >> 5;
                int var10 = var7 & 31;
                if (~arg3.field6400[arg2].length < -2) {
                    int var11 = (int) (Math.random() * (double) arg3.field6400[arg2].length);
                    if (var11 > 0) {
                        var8 = arg3.field6400[arg2][var11];
                    }
                }
                if (var10 == 0) {
                    if (arg0) {
                        class308.method1915(true, var8, 255, var9, 0);
                    }
                } else if (class202.field2854.field7886 != 0) {
                    if (arg4 != -23) {
                        method2455(34, 39, 56);
                    }
                    int var12 = arg5 + -64 >> 7;
                    int var13 = arg1 + -64 >> 7;
                    class313.field4568[class621.field8746++] = new class509((byte) 1, var8, var9, 0, 255, (arg6 << 24) + (var12 << 16) + (var13 << 8) + var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V", line = 76)
    public static void method2457(int arg0) {
        if (arg0 == -20310) {
            field6012 = null;
            field6006 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZII)V", line = 89)
    public final void method33(boolean arg0, int arg1, int arg2) {
        ++field6014;
        if (arg0) {
            this.field6013 = -109;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IBI)V", line = 101)
    public final void method32(int arg0, byte arg1, int arg2) {
        ++field6011;
        if (arg1 <= 6) {
            method2457(107);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(III)V", line = 113)
    public final void method30(int arg0, int arg1, int arg2) {
        ++field6004;
        int var4 = this.field6009 * arg0 >> 12;
        int var5 = this.field6010 * arg0 >> 12;
        if (arg2 != 0) {
            this.method32(-71, (byte) 124, -45);
        }
        int var6 = this.field6008 * arg1 >> 12;
        int var7 = this.field6013 * arg1 >> 12;
        class604.method3442(var4, var7, var6, super.field3783, var5, arg2 + -82);
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(IIIIII)V", line = 132)
    public class402(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field6010 = arg2;
        this.field6008 = arg1;
        this.field6013 = arg3;
        this.field6009 = arg0;
    }
}
