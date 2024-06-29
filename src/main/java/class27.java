import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class27 {

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "Lpu;")
    public static class179 field302 = new class179("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "Lwn;")
    public static class177 field300;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "Lum;")
    public static class83 field303;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)V", line = 9)
    public static void method162(boolean arg0) {
        if (!arg0) {
            field300 = null;
        }
        field300 = null;
        field303 = null;
        field302 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V", line = 25)
    public static final void method163(byte arg0) {
        field301++;
        if (class337.field5072 != null) {
            return;
        }
        int var1 = class338.field5079;
        int var2 = -113 % ((arg0 + 21) / 39);
        int var3 = class525.field7700;
        int var4 = class100.field1538 - var1 - class169.field2570;
        int var5 = class228.field3453 - class360.field5313 - var3;
        if (var1 <= 0 && var4 <= 0 && var3 <= 0 && var5 <= 0) {
            return;
        }
        try {
            Container var6;
            if (class237.field3564 == null) {
                var6 = class122.field1844.field1062;
            } else {
                var6 = class237.field3564;
            }
            int var7 = 0;
            int var8 = 0;
            if (class237.field3564 == var6) {
                Insets var9 = class237.field3564.getInsets();
                var8 = var9.top;
                var7 = var9.left;
            }
            Graphics var10 = var6.getGraphics();
            var10.setColor(Color.black);
            if (var1 > 0) {
                var10.fillRect(var7, var8, var1, class228.field3453);
            }
            if (var3 > 0) {
                var10.fillRect(var7, var8, class100.field1538, var3);
            }
            if (var4 > 0) {
                var10.fillRect(var7 + class100.field1538 - var4, var8, var4, class228.field3453);
            }
            if (var5 > 0) {
                var10.fillRect(var7, class228.field3453 + var8 - var5, class100.field1538, var5);
                return;
            }
        } catch (Exception var11) {
            return;
        }
    }
}
