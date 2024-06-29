import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class346 {

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "[I")
    public static int[] field5016;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "Z")
    public static boolean field5017;

    static {
        new class530("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field5016 = new int[1];
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIIIIIII)V", line = 11)
    public static final void method2053(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5014++;
        if (arg3 != 65532) {
            field5016 = null;
        }
        int var8 = class539.method3173(arg6, (byte) 47, class303.field4422, class353.field5062);
        int var9 = class539.method3173(arg0, (byte) 79, class303.field4422, class353.field5062);
        int var10 = class539.method3173(arg4, (byte) 112, class392.field5514, class518.field7624);
        int var11 = class539.method3173(arg1, (byte) 103, class392.field5514, class518.field7624);
        int var12 = class539.method3173(arg6 + arg5, (byte) 53, class303.field4422, class353.field5062);
        int var13 = class539.method3173(arg0 - arg5, (byte) 33, class303.field4422, class353.field5062);
        for (int var14 = var8; var14 < var12; var14++) {
            class447.method2605(-7, var10, arg2, var11, class112.field1523[var14]);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class447.method2605(-7, var10, arg2, var11, class112.field1523[var15]);
        }
        int var16 = class539.method3173(arg4 + arg5, (byte) 46, class392.field5514, class518.field7624);
        int var17 = class539.method3173(arg1 - arg5, (byte) 45, class392.field5514, class518.field7624);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class112.field1523[var18];
            class447.method2605(arg3 ^ 0xFFFF0005, var10, arg2, var16, var19);
            class447.method2605(-7, var16, arg7, var17, var19);
            class447.method2605(arg3 - 65539, var17, arg2, var11, var19);
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(ZLhm;II)V", line = 65)
    public static final void method2054(boolean arg0, class150 arg1, int arg2, int arg3) {
        field5015++;
        class145 var4 = arg1.method944(class385.field5414, -1);
        if (arg0 || var4 == null) {
            return;
        }
        class385.field5414.method301(arg2, arg3, arg1.field2113 + arg2, arg1.field2033 + arg3);
        if (class230.field3393 >= 3) {
            class385.field5414.method300(-16777216, var4, arg2, arg3);
        } else {
            class131.field1726.method143((float) arg1.field2113 / 2.0F + (float) arg2, (float) arg1.field2033 / 2.0F + (float) arg3, 4096, (int) (-class153.field2204) & 0x3FFF << 2, var4, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)V", line = 88)
    public static void method2055(byte arg0) {
        field5016 = null;
        if (arg0 != -15) {
            method2055((byte) -50);
        }
    }
}
