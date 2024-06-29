import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class286 {

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "Lvl;")
    public static class15 field3933 = new class15(34, -1);

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "[I")
    public static int[] field3937 = new int[32];

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "Llc;")
    public static class675 field3938 = null;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "Ljava/applet/Applet;")
    public static Applet field3936;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "[[B")
    public static byte[][] field3935;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIII)V")
    public static final void method1828(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3934++;
        int var6 = arg2 - arg0;
        int var7 = arg1 - arg3;
        if (var6 == 0) {
            if (var7 != 0) {
                class6.method47(arg0, arg4 - 854970339, arg1, arg5, arg3);
            }
        } else if (var7 == 0) {
            class635.method3551(arg0, arg3, (byte) 88, arg5, arg2);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg3 - (arg0 * var8 >> 12);
            int var10;
            int var11;
            if (class268.field3766 > arg2) {
                var10 = class268.field3766;
                var11 = var9 + (class268.field3766 * var8 >> 12);
            } else if (class236.field3392 < arg2) {
                var11 = var9 + (class236.field3392 * var8 >> 12);
                var10 = class236.field3392;
            } else {
                var10 = arg2;
                var11 = arg1;
            }
            int var12;
            int var13;
            if (arg0 < class268.field3766) {
                var12 = class268.field3766;
                var13 = (class268.field3766 * var8 >> 12) + var9;
            } else if (arg0 <= class236.field3392) {
                var12 = arg0;
                var13 = arg3;
            } else {
                var12 = class236.field3392;
                var13 = (class236.field3392 * var8 >> 12) + var9;
            }
            if (arg4 != 854952684) {
                field3936 = null;
            }
            if (var13 < class223.field3260) {
                var12 = (class223.field3260 - var9 << 12) / var8;
                var13 = class223.field3260;
            } else if (var13 > class706.field9700) {
                var12 = (class706.field9700 - var9 << 12) / var8;
                var13 = class706.field9700;
            }
            if (class223.field3260 > var11) {
                var10 = (class223.field3260 - var9 << 12) / var8;
                var11 = class223.field3260;
            } else if (class706.field9700 < var11) {
                var11 = class706.field9700;
                var10 = (class706.field9700 - var9 << 12) / var8;
            }
            class676.method3814(arg5, var11, var10, var12, var13, 116);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V")
    public static final void method1829(int arg0, int arg1) {
        class196 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class296 var4 = class142.field2418[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class375.field5083; var5++) {
                    for (int var6 = 0; var6 < class441.field5980; var6++) {
                        var2 = var4.method1908(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class654.field9055;
                            int var8 = var5 << class654.field9055;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class296 var10 = class142.field2418[var9];
                                if (var10 != null) {
                                    int var11 = var4.method1897((byte) -34, var5, var6) - var10.method1897((byte) -34, var5, var6);
                                    int var12 = var4.method1897((byte) -34, var5, var6 + 1) - var10.method1897((byte) -34, var5, var6 + 1);
                                    int var13 = var4.method1897((byte) -34, var5 + 1, var6 + 1) - var10.method1897((byte) -34, var5 + 1, var6 + 1);
                                    int var14 = var4.method1897((byte) -34, var5 + 1, var6) - var10.method1897((byte) -34, var5 + 1, var6);
                                    var10.method1902(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
    public static void method1830(int arg0) {
        field3933 = null;
        field3937 = null;
        field3936 = null;
        field3935 = null;
        if (arg0 != 1) {
            method1829(49, -99);
        }
    }
}
