import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class354 {

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field4734 = 0;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "[F")
    public static float[] field4732 = new float[16];

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public static void method2105(int arg0) {
        if (arg0 != 1) {
            field4738 = 87;
        }
        field4732 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIZ)V")
    public static final void method2106(int arg0, int arg1, boolean arg2) {
        field4737++;
        class548 var3 = class696.method3872(arg0, 13, -1633381944);
        var3.method3130(108);
        if (!arg2) {
            method2107(31, false, -123, -8, 58, -8, -80, -117);
        }
        var3.field7725 = arg1;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZIIIIII)V")
    public static final void method2107(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!arg1) {
            return;
        }
        field4733++;
        int var8 = class711.method3927(arg3, -119, class328.field4190, class112.field1386);
        int var9 = class711.method3927(arg4, -117, class328.field4190, class112.field1386);
        int var10 = class711.method3927(arg5, -126, class592.field8242, class108.field1334);
        int var11 = class711.method3927(arg7, -111, class592.field8242, class108.field1334);
        int var12 = class711.method3927(arg3 + arg6, -128, class328.field4190, class112.field1386);
        int var13 = class711.method3927(arg4 - arg6, -126, class328.field4190, class112.field1386);
        for (int var14 = var8; var14 < var12; var14++) {
            class284.method1709(class15.field220[var14], var11, -8251, var10, arg0);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class284.method1709(class15.field220[var15], var11, -8251, var10, arg0);
        }
        int var16 = class711.method3927(arg5 + arg6, -116, class592.field8242, class108.field1334);
        int var17 = class711.method3927(arg7 - arg6, -121, class592.field8242, class108.field1334);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class15.field220[var18];
            class284.method1709(var19, var16, -8251, var10, arg0);
            class284.method1709(var19, var17, -8251, var16, arg2);
            class284.method1709(var19, var11, -8251, var17, arg0);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)V")
    public static final void method2108(int arg0, int arg1, int arg2) {
        if (arg0 >= -6) {
            field4732 = null;
        }
        field4735++;
        class548 var3 = class696.method3872(arg1, 1, -1633381944);
        var3.method3130(62);
        var3.field7725 = arg2;
    }

    @OriginalMember(owner = "client!kh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4736++;
        throw new IllegalStateException();
    }
}
