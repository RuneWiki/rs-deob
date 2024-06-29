import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class499 {

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "Llo;")
    public static class306 field7314 = new class306("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "[I")
    public static int[] field7316 = new int[16];

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
    public static int field7312;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
    public static int field7313;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
    public static int field7315;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZLjava/lang/String;ILla;)V")
    public static final void method2954(boolean arg0, String arg1, int arg2, class296 arg3) {
        field7313++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class136.field2303.method2077(arg1, 250, null, -123);
        if (arg2 <= 85) {
            return;
        }
        int var8 = class136.field2303.method2079(null, 0, 250, arg1) * 13;
        class305.field4873.method914(var5 - var4, -var4 + var6, var4 + var7 + var4, var8 - -var4 + var4, -16777216, 0);
        class305.field4873.method915(var5 - var4, -var4 + var6, var4 + var7 + var4, var4 + var4 + var8, -1, 0);
        arg3.method1911(1, false, arg1, var7, -1, var6, null, var5, -1, null, null, 0, var8, 0, 0, 1);
        class358.method2298(var6 - var4, var4 - -var4 + var7, (byte) -123, var8 + var4 + var4, -var4 + var5);
        if (arg0) {
            class305.field4873.method844();
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IILou;IIII)V")
    public static final void method2955(int arg0, int arg1, class197 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 == -10480) {
            field7315++;
            class353.method2266(0, arg3, arg2.field4720, arg6, arg0, arg4, arg5, arg2.field4714, (byte) 126, arg2.field4716);
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V")
    public static void method2956(boolean arg0) {
        field7314 = null;
        field7316 = null;
        if (!arg0) {
            field7314 = null;
        }
    }
}
