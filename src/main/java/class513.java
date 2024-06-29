import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public abstract class class513 extends class361 {

    @OriginalMember(owner = "client!dw", name = "x", descriptor = "I")
    public int field7574;

    @OriginalMember(owner = "client!dw", name = "z", descriptor = "I")
    public static int field7576 = -1;

    @OriginalMember(owner = "client!dw", name = "A", descriptor = "Ltn;")
    public static class60 field7577 = new class60(76, -1);

    @OriginalMember(owner = "client!dw", name = "C", descriptor = "Lkn;")
    public static class530 field7579 = new class530("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!dw", name = "D", descriptor = "Leh;")
    public static class246 field7580 = new class246(3, 8);

    @OriginalMember(owner = "client!dw", name = "E", descriptor = "Lfc;")
    public static class174 field7581 = new class174(32);

    @OriginalMember(owner = "client!dw", name = "F", descriptor = "Lnh;")
    public static class536 field7582 = new class536("WTRC", 1);

    @OriginalMember(owner = "client!dw", name = "w", descriptor = "I")
    public static int field7573;

    @OriginalMember(owner = "client!dw", name = "y", descriptor = "I")
    public static int field7575;

    @OriginalMember(owner = "client!dw", name = "B", descriptor = "I")
    public static int field7578;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(CIZ)C")
    public static final char method3056(char arg0, int arg1, boolean arg2) {
        field7575++;
        if (arg0 >= 'À' && arg0 <= 'ÿ') {
            if (arg0 >= 'À' && arg0 <= 'Æ') {
                return 'A';
            }
            if (arg0 == 'Ç') {
                return 'C';
            }
            if (arg0 >= 'È' && arg0 <= 'Ë') {
                return 'E';
            }
            if (arg0 >= 'Ì' && arg0 <= 'Ï') {
                return 'I';
            }
            if (arg0 == 'Ñ' && arg1 != 0) {
                return 'N';
            }
            if (arg0 >= 'Ò' && arg0 <= 'Ö') {
                return 'O';
            }
            if (arg0 >= 'Ù' && arg0 <= 'Ü') {
                return 'U';
            }
            if (arg0 == 'Ý') {
                return 'Y';
            }
            if (arg0 == 'ß') {
                return 's';
            }
            if (arg0 >= 'à' && arg0 <= 'æ') {
                return 'a';
            }
            if (arg0 == 'ç') {
                return 'c';
            }
            if (arg0 >= 'è' && arg0 <= 'ë') {
                return 'e';
            }
            if (arg0 >= 'ì' && arg0 <= 'ï') {
                return 'i';
            }
            if (arg0 == 'ñ' && arg1 != 0) {
                return 'n';
            }
            if (arg0 >= 'ò' && arg0 <= 'ö') {
                return 'o';
            }
            if (arg0 >= 'ù' && arg0 <= 'ü') {
                return 'u';
            }
            if (arg0 == 'ý' || arg0 == 'ÿ') {
                return 'y';
            }
        }
        if (arg0 == 'Œ') {
            return 'O';
        } else if (arg0 == 'œ') {
            return 'o';
        } else {
            if (!arg2) {
                field7573 = -115;
            }
            if (arg0 == 'Ÿ') {
                return 'Y';
            } else {
                return arg0;
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method2510(byte arg0);

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(B)V")
    public static void method3057(byte arg0) {
        field7579 = null;
        field7577 = null;
        if (arg0 < 33) {
            field7579 = null;
        }
        field7581 = null;
        field7580 = null;
        field7582 = null;
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(I)V")
    public class513(int arg0) {
        this.field7574 = arg0;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)Z")
    public abstract boolean method2508(int arg0);

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(II)I")
    public static final int method3058(int arg0, int arg1) {
        return class211.field3059 == null ? 0 : class211.field3059[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!dw", name = "g", descriptor = "(I)I")
    public static final int method3059(int arg0) {
        field7578++;
        if (arg0 != -65536) {
            return 55;
        }
        class290 var1 = class385.field5414;
        boolean var2 = false;
        if (class405.field5737 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class290.method1804(0, var3, 0, null, null, 4);
        }
        long var4 = class465.method2699((byte) 14);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method336(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class465.method2699((byte) 14) - var4);
        var1.method1794(100, 0, -16777216, 100, arg0 + 65662, 0);
        if (var2) {
            var1.method1801(0);
        }
        return var7;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lsq;IIII)V")
    public static final void method3060(class121 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class270.method1711(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class6.field109) {
            class270.method1711(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class270.method1711(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class272.field4032) {
            class270.method1711(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class272.field4032) {
            class270.method1711(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class6.field109 && arg4 <= class272.field4032) {
            class270.method1711(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class270.method1711(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class6.field109 && arg4 > 0) {
            class270.method1711(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }
}
