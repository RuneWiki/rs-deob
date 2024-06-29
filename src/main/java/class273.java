import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class273 {

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "J")
    private long field3837;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    private int field3838;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field3844 = -2;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIZI)I", line = 3)
    public static final int method1800(int arg0, int arg1, boolean arg2, int arg3) {
        field3841++;
        class6 var4 = class284.method1863((byte) -120, arg1, arg2);
        if (var4 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field45.length; var6++) {
                if (var4.field44[var6] == arg0) {
                    var5 += var4.field45[var6];
                }
            }
            int var7 = 73 % ((arg3 + 52) / 63);
            return var5;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ldaa;I)V", line = 38)
    private final void method1801(class11 arg0, int arg1) {
        this.field3837 |= (arg0.field146 << this.field3838++ * class11.field157);
        field3843++;
        int var3 = 0 % ((28 - arg1) / 59);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BI)I", line = 48)
    private final int method1802(byte arg0, int arg1) {
        field3845++;
        return arg0 == 0 ? (int) (this.field3837 >> class11.field157 * arg1) & 0xF : -115;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIIB)V", line = 60)
    public static final void method1803(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field3842++;
        int var7 = class486.method2865(class479.field6682, arg5, class58.field1150, 111);
        int var8 = class486.method2865(class479.field6682, arg1, class58.field1150, -104);
        if (arg6 >= -62) {
            method1803(80, -63, -10, 41, -65, 39, (byte) -89);
        }
        int var9 = class486.method2865(class536.field7419, arg0, class140.field2314, -79);
        int var10 = class486.method2865(class536.field7419, arg3, class140.field2314, 92);
        int var11 = class486.method2865(class479.field6682, arg2 + arg5, class58.field1150, 32);
        int var12 = class486.method2865(class479.field6682, arg1 - arg2, class58.field1150, 41);
        for (int var13 = var7; var13 < var11; var13++) {
            class47.method550(-27, var10, class691.field9345[var13], var9, arg4);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class47.method550(-27, var10, class691.field9345[var14], var9, arg4);
        }
        int var15 = class486.method2865(class536.field7419, arg0 + arg2, class140.field2314, 121);
        int var16 = class486.method2865(class536.field7419, arg3 - arg2, class140.field2314, -101);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class691.field9345[var17];
            class47.method550(-27, var15, var18, var9, arg4);
            class47.method550(-27, var10, var18, var16, arg4);
        }
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Ldaa;)V", line = 112)
    public class273(class11 arg0) {
        this.field3837 = arg0.field146;
        this.field3838 = 1;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "([Ldaa;)V", line = 122)
    public class273(class11[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method1801(arg0[var2], 92);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZIII)Z", line = 136)
    public static final boolean method1804(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg1) {
            method1804(-65, true, 105, -126, 39);
        }
        field3846++;
        if ((class607.field8331[0][arg2][arg0] & 0x2) != 0) {
            return true;
        } else if ((class607.field8331[arg4][arg2][arg0] & 0x10) == 0) {
            return arg3 == class507.method2978(-55, arg4, arg0, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)Ldaa;", line = 162)
    public final class11 method1805(int arg0, int arg1) {
        field3840++;
        int var3 = 4 % ((-arg1 - 35) / 53);
        return class11.method66(this.method1802((byte) 0, arg0), -109);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)I", line = 177)
    public final int method1806(byte arg0) {
        field3836++;
        if (arg0 >= -114) {
            this.method1806((byte) 105);
        }
        return this.field3838;
    }
}
