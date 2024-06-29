import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class190 {

    @OriginalMember(owner = "client!em", name = "c", descriptor = "[C")
    private static char[] field2690;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "Lej;")
    public static class104 field2692;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "Z")
    public static volatile boolean field2693;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "([BIIIIII)Z")
    public static final boolean method1182(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2689++;
        int var7 = arg3 % arg6;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg6 - var7;
        }
        int var9 = -((arg5 + arg6 - 1) / arg6);
        int var10 = -((arg6 + arg3 - 1) / arg6);
        if (arg2 != 0) {
            method1184((byte) -7);
        }
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg0[arg1] == 0) {
                    return true;
                }
                arg1 += arg6;
            }
            int var13 = arg1 - var8;
            if (arg0[var13 - 1] == 0) {
                return true;
            }
            arg1 = arg4 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I[Lha;)V")
    public static final void method1183(int arg0, class52[] arg1) {
        field2688++;
        class15.field204 = arg1.length;
        class374.field5033 = new int[class15.field204 + 10];
        class160.field2344 = new class52[class15.field204 + 10];
        if (arg0 > -77) {
            field2693 = true;
        }
        class416.method2497(arg1, 0, class160.field2344, 0, class15.field204);
        for (int var2 = 0; var2 < class15.field204; var2++) {
            class374.field5033[var2] = class160.field2344[var2].method432();
        }
        for (int var3 = class15.field204; var3 < class160.field2344.length; var3++) {
            class374.field5033[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V")
    public static void method1184(byte arg0) {
        field2692 = null;
        int var1 = -97 % ((54 - arg0) / 56);
        field2690 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ILjava/awt/Component;)Lre;")
    public static final class517 method1185(int arg0, Component arg1) {
        if (arg0 == 52) {
            field2691++;
            return new class462(arg1);
        } else {
            return null;
        }
    }

    static {
        new class104("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
        field2690 = new char[64];
        for (int var0 = 0; var0 < 26; var0++) {
            field2690[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field2690[var1] = (char) (var1 + 71);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field2690[var2] = (char) (var2 + 48 - 52);
        }
        field2690[62] = '*';
        field2690[63] = '-';
        field2692 = new class104("slide:", "gleiten:", "glissement:", "deslizamento:");
        field2693 = true;
    }
}
