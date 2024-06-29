import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class170 {

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "Lwp;")
    public static class453 field2217 = new class453(109, -1);

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public int field2213;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public int field2214;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
    public int field2216;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "I")
    public int field2218;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
    public static void method971(int arg0) {
        field2217 = null;
        if (arg0 != 0) {
            field2217 = null;
        }
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)V")
    public static final void method972(int arg0) {
        field2215++;
        if (class655.field9229 != null) {
            return;
        }
        int var1 = class193.field2426;
        int var2 = class267.field3382;
        int var3 = class95.field1307 - var1 - class523.field7111;
        if (arg0 != 0) {
            field2217 = null;
        }
        int var4 = class366.field4659 - var2 - class244.field3022;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class582.field8140 != null) {
                var5 = class582.field8140;
            } else if (class422.field5308 == null) {
                var5 = class678.field9508;
            } else {
                var5 = class422.field5308;
            }
            int var6 = 0;
            int var7 = 0;
            if (class582.field8140 == var5) {
                Insets var8 = class582.field8140.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class366.field4659);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class95.field1307, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class95.field1307 - var3, var7, var3, class366.field4659);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class366.field4659 - var4, class95.field1307, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }
}
