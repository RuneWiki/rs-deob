import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class534 {

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
    public static int field7851 = 0;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "Lvq;")
    public static class323 field7849 = new class323(16);

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "Z")
    public static boolean field7857;

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "Ldq;")
    public static class493 field7858;

    @OriginalMember(owner = "client!mp", name = "n", descriptor = "[I")
    public static int[] field7860;

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "F")
    public static float field7856;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
    public static int field7847;

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
    public static int field7848;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
    public static int field7850;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
    public static int field7852;

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
    public static int field7853;

    @OriginalMember(owner = "client!mp", name = "m", descriptor = "Lqn;")
    public static class47 field7859;

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "Z")
    public static boolean field7855;

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "[S")
    public static short[] field7854;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method3158(byte arg0, byte[] arg1) {
        field7853++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 != 37) {
            field7856 = -1.5958699F;
        }
        byte[] var2 = new byte[arg1.length];
        class318.method1875(arg1, 0, var2, 0, arg1.length);
        return var2;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZIIII)Lcl;")
    public static final class175 method3159(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field7850++;
        class175 var5 = new class175();
        var5.field2279 = arg2;
        var5.field2273 = arg4;
        if (arg1 != 16384) {
            return null;
        }
        class397.field5684.method2019((byte) -80, var5, (long) arg3);
        class262.method1569((byte) 35, arg2);
        class523 var6 = class310.method1810(arg3, arg1 + 1182807280);
        if (var6 != null) {
            class136.method935(var6, -126);
        }
        if (class466.field6723 != null) {
            class136.method935(class466.field6723, -127);
            class466.field6723 = null;
        }
        class483.method2939(true);
        if (var6 != null) {
            class319.method1881(var6, -64, !arg0);
        }
        if (!arg0) {
            class239.method1438(arg2);
        }
        if (!arg0 && class277.field3510 != -1) {
            class186.method1166(class277.field3510, 1, (byte) 74);
        }
        return var5;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(BILhd;I)V")
    public static final void method3160(byte arg0, int arg1, class523 arg2, int arg3) {
        class288.field3679 = arg1;
        field7848++;
        class344.field4404 = arg2;
        if (arg0 <= 58) {
            field7849 = null;
        }
        class480.field7023 = arg3;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(II)Lmv;")
    public static final class254 method3161(int arg0, int arg1) {
        field7852++;
        if (arg1 != 16) {
            field7851 = 119;
        }
        return class354.field4556 && class357.field4597 <= arg0 && arg0 <= class64.field832 ? class66.field850[arg0 - class357.field4597] : null;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Z)V")
    public static void method3162(boolean arg0) {
        field7854 = null;
        if (arg0) {
            method3159(true, -81, -93, 115, 29);
        }
        field7860 = null;
        field7859 = null;
        field7858 = null;
        field7849 = null;
    }

    static {
        new class335("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
        field7857 = true;
        field7858 = new class493(13, 2);
        field7860 = new int[14];
    }
}
