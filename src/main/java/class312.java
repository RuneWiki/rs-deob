import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class312 {

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Lud;")
    public static class279 field5515 = class130.method1024("::fps ", 255);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field5514 = 0;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "Lhc;")
    public static class171 field5519 = new class171(5);

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "Lud;")
    public static class279 field5520 = class130.method1024(")3runescape)3com)4l=", 255);

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "Z")
    public static boolean field5521 = true;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "[Lfg;")
    public static class211[] field5525 = new class211[14];

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "Ldg;")
    public static class317 field5523 = new class317();

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Lok;")
    public static class149 field5518;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "Lcb;")
    public static class280 field5522;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIII)V", line = 7)
    public static final void method2215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg1 - arg3;
        field5517++;
        int var7 = arg0 - arg5;
        if (var6 == 0) {
            if (var7 != 0) {
                class173.method1349(4, arg5, arg0, arg3, arg2);
            }
        } else if (var7 == 0) {
            class184.method1423(arg1, arg2, arg3, (byte) -82, arg5);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg5 - (arg3 * var8 >> 12);
            int var10;
            int var11;
            if (class249.field4449 > arg1) {
                var10 = (class249.field4449 * var8 >> 12) + var9;
                var11 = class249.field4449;
            } else if (arg1 > class44.field929) {
                var10 = (class44.field929 * var8 >> 12) + var9;
                var11 = class44.field929;
            } else {
                var11 = arg1;
                var10 = arg0;
            }
            int var12;
            int var13;
            if (arg3 < class249.field4449) {
                var12 = (class249.field4449 * var8 >> 12) + var9;
                var13 = class249.field4449;
            } else if (class44.field929 >= arg3) {
                var12 = arg5;
                var13 = arg3;
            } else {
                var12 = var9 + (class44.field929 * var8 >> 12);
                var13 = class44.field929;
            }
            if (var10 < class135.field2463) {
                var10 = class135.field2463;
                var11 = (class135.field2463 - var9 << 12) / var8;
            } else if (var10 > class108.field2002) {
                var10 = class108.field2002;
                var11 = (class108.field2002 - var9 << 12) / var8;
            }
            if (arg4 >= 81) {
                if (var12 < class135.field2463) {
                    var13 = (class135.field2463 - var9 << 12) / var8;
                    var12 = class135.field2463;
                } else if (class108.field2002 < var12) {
                    var13 = (class108.field2002 - var9 << 12) / var8;
                    var12 = class108.field2002;
                }
                class28.method255(var10, var11, (byte) 113, var13, arg2, var12);
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 112)
    public static void method2216(int arg0) {
        field5518 = null;
        field5523 = null;
        field5515 = null;
        field5525 = null;
        field5520 = null;
        if (arg0 != -1465077780) {
            field5518 = (class149) null;
        }
        field5519 = null;
        field5522 = null;
    }
}
