import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class39 {

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "Low;")
    public static class665 field454 = new class665();

    @OriginalMember(owner = "client!rea", name = "d", descriptor = "[F")
    public static float[] field457 = new float[16];

    @OriginalMember(owner = "client!rea", name = "c", descriptor = "[Lol;")
    public static class431[] field456 = new class431[2048];

    @OriginalMember(owner = "client!rea", name = "g", descriptor = "[I")
    public static int[] field460 = new int[2];

    @OriginalMember(owner = "client!rea", name = "e", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!rea", name = "f", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!rea", name = "h", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!rea", name = "i", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "Ltj;")
    public class690 field455;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(Ljava/awt/Component;Z)Lkc;")
    public static final class72 method293(Component arg0, boolean arg1) {
        field458++;
        return arg1 ? new class244(arg0) : null;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(B)V")
    public static final void method294(byte arg0) {
        field461++;
        if (class259.field3676 != null) {
            return;
        }
        int var1 = class728.field10160;
        int var2 = class424.field5897;
        int var3 = class688.field9724 - var1 - class709.field9923;
        if (arg0 != 83) {
            field460 = null;
        }
        int var4 = class668.field9393 - class448.field6174 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class410.field5617 != null) {
                var5 = class410.field5617;
            } else if (class343.field4881 == null) {
                var5 = class149.field2396;
            } else {
                var5 = class343.field4881;
            }
            int var6 = 0;
            int var7 = 0;
            if (class410.field5617 == var5) {
                Insets var8 = class410.field5617.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class668.field9393);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class688.field9724, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class688.field9724 + var6 - var3, var7, var3, class668.field9393);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class668.field9393 - var4, class688.field9724, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)V")
    public static void method295(int arg0) {
        if (arg0 != -2996) {
            field457 = null;
        }
        field456 = null;
        field460 = null;
        field457 = null;
        field454 = null;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method296(int arg0, String[] arg1) {
        field462++;
        if (arg0 != 5) {
            field459 = -21;
        }
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }
}
