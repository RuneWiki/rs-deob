import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class203 {

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "[I")
    public static int[] field3633 = new int[256];

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "Ldj;")
    public static class44 field3637;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "Z")
    public static boolean field3635;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Ldj;")
    private static class44 field3638;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "Ldj;")
    public static class44 field3639;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)Lcj;")
    public static final class33 method1310(int arg0, int arg1, int arg2) {
        class68 var3 = class32.field567[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1298;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIBIIIIIII)V")
    public static final void method1311(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 >= class70.field1337 && class70.field1321 >= arg0 && class70.field1337 <= arg6 && class70.field1321 >= arg6 && class70.field1337 <= arg8 && arg8 <= class70.field1321 && arg9 >= class70.field1337 && arg9 <= class70.field1321 && arg1 >= class14.field267 && arg1 <= class57.field1068 && class14.field267 <= arg7 && class57.field1068 >= arg7 && class14.field267 <= arg5 && class57.field1068 >= arg5 && arg4 >= class14.field267 && arg4 <= class57.field1068) {
            class23.method166(arg4, 32002, arg0, arg5, arg7, arg1, arg8, arg3, arg9, arg6);
        } else {
            class238.method1544(arg8, arg7, arg4, -112, arg9, arg0, arg5, arg3, arg6, arg1);
        }
        if (arg2 <= 69) {
            method1314(-17, 18, 124, 54, -123, -13, -101);
        }
        field3632++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
    public static void method1312(byte arg0) {
        field3637 = null;
        int var1 = 56 % ((arg0 + 13) / 58);
        field3638 = null;
        field3633 = null;
        field3639 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ldj;I)Ldj;")
    public static final class44 method1313(class44 arg0, int arg1) {
        class35 var2 = class123.method843(false, arg0);
        int var3 = 5 / ((arg1 - 26) / 48);
        field3634++;
        return var2 == null ? class237.field4394 : var2.field626;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg2 + arg3;
        int var8 = arg1 - arg2;
        field3631++;
        int var9 = arg2 + arg6;
        int var10 = arg4 - arg2;
        if (arg5 != -23487) {
            field3638 = null;
        }
        for (int var11 = arg6; var11 < var9; var11++) {
            class42.method290(class108.field1979[var11], -7, arg3, arg4, arg0);
        }
        for (int var12 = arg1; var12 > var8; var12--) {
            class42.method290(class108.field1979[var12], -7, arg3, arg4, arg0);
        }
        for (int var13 = var9; var13 <= var8; var13++) {
            int[] var14 = class108.field1979[var13];
            class42.method290(var14, -7, arg3, var7, arg0);
            class42.method290(var14, arg5 ^ 0x5BB8, var10, arg4, arg0);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3633[var0] = var1;
        }
        field3637 = class89.method650(255, "Ung-Ultiges Anmelde)2Paket)3");
        field3635 = false;
        field3636 = -1;
        field3638 = class89.method650(255, "Connecting to update server");
        field3639 = field3638;
    }
}
