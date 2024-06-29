import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public class class286 {

    @OriginalMember(owner = "client!ria", name = "j", descriptor = "I")
    private int field4067;

    @OriginalMember(owner = "client!ria", name = "f", descriptor = "I")
    private int field4063;

    @OriginalMember(owner = "client!ria", name = "p", descriptor = "I")
    private int field4073;

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "I")
    private int field4058;

    @OriginalMember(owner = "client!ria", name = "e", descriptor = "I")
    public int field4062;

    @OriginalMember(owner = "client!ria", name = "i", descriptor = "I")
    public int field4066;

    @OriginalMember(owner = "client!ria", name = "g", descriptor = "I")
    public int field4064;

    @OriginalMember(owner = "client!ria", name = "c", descriptor = "I")
    public int field4060;

    @OriginalMember(owner = "client!ria", name = "n", descriptor = "I")
    public int field4071;

    @OriginalMember(owner = "client!ria", name = "l", descriptor = "I")
    public int field4069;

    @OriginalMember(owner = "client!ria", name = "d", descriptor = "J")
    public static long field4061 = 0L;

    @OriginalMember(owner = "client!ria", name = "b", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!ria", name = "h", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!ria", name = "k", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!ria", name = "m", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!ria", name = "o", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(IIIZ)Z", line = 4)
    public final boolean method1826(int arg0, int arg1, int arg2, boolean arg3) {
        field4070++;
        if (this.field4069 > arg1 || arg1 > this.field4060) {
            return false;
        } else if (arg3) {
            return false;
        } else if (this.field4064 > arg0 || arg0 > this.field4062) {
            return false;
        } else if (this.field4066 <= arg2 && arg2 <= this.field4071) {
            int var5 = arg1 - this.field4067;
            int var6 = arg2 - this.field4073;
            return this.field4063 > var5 * var5 + var6 * var6;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(IIB)Z", line = 31)
    public static final boolean method1827(int arg0, int arg1, byte arg2) {
        field4059++;
        int var3 = 74 / ((arg2 - 56) / 46);
        if (arg0 >= 0 && arg1 >= 0 && class60.field847[1].length > arg0 && arg1 < class60.field847[1][arg0].length) {
            return (class60.field847[1][arg0][arg1] & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(IIIIII)V", line = 64)
    public static final void method1828(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4065++;
        if (arg2 >= -118) {
            method1828(118, 77, 37, 50, -119, 45);
        }
        int var6 = arg4 - arg1;
        int var7 = arg3 - arg0;
        if (var7 == 0) {
            if (var6 != 0) {
                class559.method3267(arg1, arg4, arg5, true, arg0);
            }
        } else if (var6 == 0) {
            class103.method785(arg1, arg0, arg3, true, arg5);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg0;
                arg0 = arg1;
                int var10 = arg3;
                arg1 = var9;
                arg3 = arg4;
                arg4 = var10;
            }
            if (arg3 < arg0) {
                int var11 = arg0;
                int var12 = arg1;
                arg0 = arg3;
                arg1 = arg4;
                arg3 = var11;
                arg4 = var12;
            }
            int var13 = arg1;
            int var14 = arg3 - arg0;
            int var15 = arg4 - arg1;
            int var16 = -(var14 >> 1);
            if (var15 < 0) {
                var15 = -var15;
            }
            int var17 = arg4 <= arg1 ? -1 : 1;
            if (var8) {
                for (int var18 = arg0; var18 <= arg3; var18++) {
                    var16 += var15;
                    class664.field9322[var18][var13] = arg5;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            } else {
                for (int var19 = arg0; var19 <= arg3; var19++) {
                    var16 += var15;
                    class664.field9322[var13][var19] = arg5;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(IIIIIZIIIII)V", line = 186)
    public final void method1829(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field4063 = arg0 * arg0;
        field4068++;
        if (!arg5) {
            this.field4073 = 60;
        }
        this.field4073 = arg10;
        this.field4058 = arg9;
        this.field4067 = arg2;
        this.field4064 = this.field4058 + arg7;
        this.field4060 = this.field4067 + arg3;
        this.field4062 = this.field4058 + arg1;
        this.field4066 = this.field4073 + arg8;
        this.field4071 = this.field4073 + arg4;
        this.field4069 = this.field4067 + arg6;
    }

    @OriginalMember(owner = "client!ria", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 208)
    public class286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field4067 = arg0;
        this.field4063 = arg3 * arg3;
        this.field4073 = arg2;
        this.field4058 = arg1;
        this.field4062 = this.field4058 + arg7;
        this.field4066 = this.field4073 + arg8;
        this.field4064 = this.field4058 + arg6;
        this.field4060 = this.field4067 + arg5;
        this.field4071 = this.field4073 + arg9;
        this.field4069 = this.field4067 + arg4;
    }
}
