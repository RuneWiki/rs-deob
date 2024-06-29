import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class431 {

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "Loa;")
    public static class157 field6125;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "Lct;")
    public static class285 field6128;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "Lsh;")
    public static class472 field6130;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field6127;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "Lbp;")
    public static class58 field6129;

    static {
        new class332("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field6125 = new class157();
        field6128 = new class285(31, 8);
        field6130 = new class472(103, 3);
        field6131 = 0;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V", line = 6)
    public static void method2523(byte arg0) {
        field6125 = null;
        field6128 = null;
        field6129 = null;
        if (arg0 == -32) {
            field6130 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)V", line = 26)
    public static final void method2524(int arg0, byte arg1) {
        class479.field6747 = arg0;
        class346.field5283 = false;
        class415.field5986 = null;
        class268.field3968 = -1;
        if (arg1 != -27) {
            method2523((byte) -53);
        }
        field6126++;
        class428.field6110 = 1;
        class372.field5600 = 0;
        class338.field5076 = -1;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIIII)V", line = 45)
    public static final void method2525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6124++;
        int var8 = arg5 + arg6;
        int var9 = arg7 - arg5;
        for (int var10 = arg6; var10 < var8; var10++) {
            class345.method2125(false, class49.field723[var10], arg4, arg3, arg2);
        }
        int var11 = arg4 + arg5;
        int var12 = arg3 - arg5;
        for (int var13 = arg7; var13 > var9; var13--) {
            class345.method2125(false, class49.field723[var13], arg4, arg3, arg2);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class49.field723[var14];
            class345.method2125(false, var15, arg4, var11, arg2);
            class345.method2125(false, var15, var11, var12, arg0);
            class345.method2125(false, var15, var12, arg3, arg2);
        }
        if (arg1 > -28) {
            field6128 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)[B", line = 91)
    public static final synchronized byte[] method2526(int arg0, int arg1) {
        field6127++;
        if (arg1 == 100 && class20.field255 > 0) {
            byte[] var2 = class253.field3634[--class20.field255];
            class253.field3634[class20.field255] = null;
            return var2;
        } else if (arg1 == 5000 && class334.field4988 > 0) {
            byte[] var3 = class134.field1956[--class334.field4988];
            class134.field1956[class334.field4988] = null;
            return var3;
        } else if (~arg1 == arg0 && class456.field6476 > 0) {
            byte[] var4 = class280.field4237[--class456.field6476];
            class280.field4237[class456.field6476] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }
}
