import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class629 {

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "[I")
    private int[] field8843;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "Lio;")
    public static class151 field8845;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "[Lwe;")
    public static class181[] field8848;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "[[Z")
    public static boolean[][] field8849;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "[I")
    public static int[] field8850;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field8842;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field8844;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field8846;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field8847;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static final void method3560(int arg0) {
        field8842++;
        if (class443.field6474 != null) {
            return;
        }
        int var1 = class335.field4800;
        int var2 = class39.field516;
        if (arg0 != -1) {
            field8848 = null;
        }
        int var3 = class416.field6134 - (class68.field1285 + var1);
        int var4 = class638.field9262 - class442.field6464 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class327.field4718 == null) {
                var5 = class270.field3976.field549;
            } else {
                var5 = class327.field4718;
            }
            int var6 = 0;
            int var7 = 0;
            if (class327.field4718 == var5) {
                Insets var8 = class327.field4718.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class638.field9262);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class416.field6134, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class416.field6134 + var6 - var3, var7, var3, class638.field9262);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class638.field9262 - var4, class416.field6134, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
    public static void method3561(boolean arg0) {
        field8850 = null;
        field8845 = null;
        if (arg0) {
            field8850 = null;
        }
        field8848 = null;
        field8849 = null;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "([I)V")
    public class629(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field8843 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field8843[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field8843[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field8843[var5 + var5] = arg0[var4];
            this.field8843[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZ)I")
    public final int method3562(int arg0, boolean arg1) {
        field8844++;
        if (!arg1) {
            return -122;
        }
        int var3 = (this.field8843.length >> 1) - 1;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field8843[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field8843[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    static {
        new class567("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field8845 = new class151(15, 0, 1, 0);
        field8848 = new class181[1024];
        field8849 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };
        field8850 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };
    }
}
