import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public abstract class class225 extends class287 {

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "Ljo;")
    public class381 field3179;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
    public int field3180;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "[Z")
    public static boolean[] field3178;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "Lhi;")
    public static class45 field3177;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "[[I")
    public static int[][] field3181;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method1395(byte arg0);

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(B)Z")
    public abstract boolean method1396(byte arg0);

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "(I)V")
    public static void method1397(int arg0) {
        field3181 = null;
        field3178 = null;
        if (arg0 != 5) {
            method1397(30);
        }
        field3177 = null;
    }

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "(B)V")
    public static final void method1398(byte arg0) {
        field3174++;
        int var1 = 0;
        if (arg0 != -116) {
            return;
        }
        while (class27.field379.length > var1) {
            for (int var2 = 0; var2 < class27.field379[0].length; var2++) {
                for (int var3 = 0; var3 < class27.field379[0][0].length; var3++) {
                    class27.field379[var1][var2][var3] = 0;
                }
            }
            var1++;
        }
    }

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "(I)Lgk;")
    public static final class468 method1399(int arg0) {
        field3175++;
        if (arg0 != 0) {
            method1397(-9);
        }
        return class29.field427 < class504.field7378.length ? class504.field7378[class29.field427++] : null;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Ljo;I)V")
    public class225(class381 arg0, int arg1) {
        this.field3179 = arg0;
        this.field3180 = arg1;
    }

    static {
        new class157("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
        field3178 = new boolean[100];
        field3177 = new class45(15, 8);
        field3181 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };
    }
}
