import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class81 {

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "Leh;")
    public static class246 field1049 = new class246(7, -1);

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "[[Z")
    public static boolean[][] field1051;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "Ljava/awt/Frame;")
    public static Frame field1052;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "[I")
    public static int[] field1048;

    static {
        new class530("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
        field1051 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V", line = 18)
    public static void method605(byte arg0) {
        field1049 = null;
        field1051 = null;
        field1048 = null;
        if (arg0 != -112) {
            field1049 = null;
        }
        field1052 = null;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BI)I", line = 31)
    public static final int method606(byte arg0, int arg1) {
        if (arg0 < 96) {
            field1053 = 27;
        }
        field1047++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V", line = 69)
    public static final void method607(int arg0) {
        class264.field3874.method1515(-2044015643);
        field1050++;
        if (arg0 != 1) {
            field1053 = -108;
        }
        int var1 = class264.field3874.method1520(-12494, 8);
        if (var1 < class434.field6110) {
            for (int var2 = var1; var2 < class434.field6110; var2++) {
                class8.field126[class225.field3244++] = class488.field6834[var2];
            }
        }
        if (class434.field6110 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class434.field6110 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class488.field6834[var3];
            class429 var5 = ((class378) class125.field1687.method2405((long) var4, -115)).field5353;
            int var6 = class264.field3874.method1520(-12494, 1);
            if (var6 == 0) {
                class488.field6834[class434.field6110++] = var4;
                var5.field3316 = class390.field5481;
            } else {
                int var7 = class264.field3874.method1520(-12494, 2);
                if (var7 == 0) {
                    class488.field6834[class434.field6110++] = var4;
                    var5.field3316 = class390.field5481;
                    class373.field5317[class169.field2464++] = var4;
                } else if (var7 == 1) {
                    class488.field6834[class434.field6110++] = var4;
                    var5.field3316 = class390.field5481;
                    int var8 = class264.field3874.method1520(-12494, 3);
                    var5.method2544(var8, 1, (byte) 105);
                    int var9 = class264.field3874.method1520(-12494, 1);
                    if (var9 == 1) {
                        class373.field5317[class169.field2464++] = var4;
                    }
                } else if (var7 == 2) {
                    class488.field6834[class434.field6110++] = var4;
                    var5.field3316 = class390.field5481;
                    if (class264.field3874.method1520(-12494, 1) == 1) {
                        int var11 = class264.field3874.method1520(-12494, 3);
                        var5.method2544(var11, 2, (byte) 104);
                        int var12 = class264.field3874.method1520(-12494, 3);
                        var5.method2544(var12, 2, (byte) 90);
                    } else {
                        int var10 = class264.field3874.method1520(-12494, 3);
                        var5.method2544(var10, 0, (byte) 92);
                    }
                    int var13 = class264.field3874.method1520(-12494, 1);
                    if (var13 == 1) {
                        class373.field5317[class169.field2464++] = var4;
                    }
                } else if (var7 == 3) {
                    class8.field126[class225.field3244++] = var4;
                }
            }
        }
    }
}
