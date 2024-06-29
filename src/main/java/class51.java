import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class51 {

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "Z")
    public static boolean field858 = false;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)Lbl;")
    public static final class146 method357(int arg0) {
        int var1 = class60.field976[0] * class246.field3916[0];
        field860++;
        int[] var2 = new int[var1];
        byte[] var3 = class70.field1192[0];
        if (arg0 != 19983) {
            return null;
        }
        for (int var4 = 0; var4 < var1; var4++) {
            var2[var4] = class243.field3870[method359(255, var3[var4])];
        }
        class232 var5 = new class232(class255.field4128, class111.field1749, class273.field4380[0], class314.field5058[0], class246.field3916[0], class60.field976[0], var2);
        class28.method156(-27424);
        return var5;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIILqk;IJZ)Z")
    public static final boolean method358(int arg0, int arg1, int arg2, int arg3, int arg4, class2 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class263.method1768(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)I")
    public static int method359(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
