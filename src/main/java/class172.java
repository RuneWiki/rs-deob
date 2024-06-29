import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class172 {

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field2346 = 0;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "[[[I")
    public static int[][][] field2347;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V", line = 20)
    public static void method1205(boolean arg0) {
        if (!arg0) {
            field2347 = (int[][][]) null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V", line = 30)
    public static final void method1206(byte arg0) {
        field2345++;
        int var1 = class113.field1550;
        int var2 = class226.field3237 - class187.field2592 - var1;
        int var3 = class169.field2294;
        int var4 = class223.field3203 - class64.field836 - var3;
        if (var1 > 0 || var2 > 0 || var3 > 0 || var4 > 0) {
            try {
                Container var5;
                if (class329.field4964 != null) {
                    var5 = class329.field4964;
                } else if (class138.field1898 == null) {
                    var5 = class165.field2258.field1157;
                } else {
                    var5 = class138.field1898;
                }
                int var6 = 0;
                int var7 = 0;
                if (class138.field1898 == var5) {
                    Insets var8 = class138.field1898.getInsets();
                    var6 = var8.top;
                    var7 = var8.left;
                }
                Graphics var9 = var5.getGraphics();
                var9.setColor(Color.black);
                if (var1 > 0) {
                    var9.fillRect(var7, var6, var1, class223.field3203);
                }
                if (var3 > 0) {
                    var9.fillRect(var7, var6, class226.field3237, var3);
                }
                if (var2 > 0) {
                    var9.fillRect(class226.field3237 + var7 - var2, var6, var2, class223.field3203);
                }
                if (var4 > 0) {
                    var9.fillRect(var7, class223.field3203 + var6 - var4, class226.field3237, var4);
                }
            } catch (Exception var11) {
            }
        }
        if (arg0 != 95) {
            field2347 = (int[][][]) ((int[][][]) null);
        }
    }
}
