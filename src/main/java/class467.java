import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class467 {

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field6103 = -1;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field6104 = 1;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field6106;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)Lbg;")
    public static final class641 method2596(int arg0, byte arg1) {
        field6106++;
        class641 var2 = (class641) class382.field4895.method3655(-112, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class389.field4986.method3346(-1, 1, arg0);
        class641 var4 = new class641();
        var4.field8926 = arg0;
        if (var3 != null) {
            var4.method3532(-95, new class418(var3));
        }
        var4.method3535(8);
        if (var4.field8909 == 2 && class194.field2537.method39((long) arg0, 31750) == null) {
            class194.field2537.method38(new class195(class402.field5145), 38, (long) arg0);
            class193.field2519[class402.field5145++] = var4;
        }
        if (arg1 < 70) {
            field6103 = -127;
        }
        class382.field4895.method3650((long) arg0, -126, var4);
        return var4;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2597(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6105++;
        int var8 = class650.method3574(class99.field1309, class165.field2061, arg1, 0);
        int var9 = class650.method3574(class99.field1309, class165.field2061, arg2, 127);
        int var10 = class650.method3574(class641.field8924, class265.field3552, arg6, 115);
        int var11 = class650.method3574(class641.field8924, class265.field3552, arg0, 112);
        int var12 = class650.method3574(class99.field1309, class165.field2061, arg1 + arg7, 109);
        int var13 = class650.method3574(class99.field1309, class165.field2061, arg2 - arg7, 118);
        for (int var14 = var8; var14 < var12; var14++) {
            class349.method2008(var11, (byte) 112, class213.field2746[var14], var10, arg5);
        }
        if (arg3 > -56) {
            field6103 = -40;
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class349.method2008(var11, (byte) 45, class213.field2746[var15], var10, arg5);
        }
        int var16 = class650.method3574(class641.field8924, class265.field3552, arg6 + arg7, -57);
        int var17 = class650.method3574(class641.field8924, class265.field3552, arg0 - arg7, 13);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class213.field2746[var18];
            class349.method2008(var16, (byte) 64, var19, var10, arg5);
            class349.method2008(var17, (byte) 11, var19, var16, arg4);
            class349.method2008(var11, (byte) 27, var19, var17, arg5);
        }
    }
}
