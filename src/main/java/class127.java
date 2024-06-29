import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class127 {

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field1657 = new String[100];

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "Lke;")
    public static class622 field1655;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)V", line = 7)
    public static final void method926(int arg0) {
        field1656++;
        if (class677.field9637 != null) {
            return;
        }
        int var1 = class457.field6547;
        int var2 = class273.field3812;
        int var3 = class133.field1735 - var1 - class638.field8980;
        int var4 = class711.field10013 - class512.field7325 - var2;
        if (~var1 >= arg0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class463.field6617 != null) {
                var5 = class463.field6617;
            } else if (class535.field7544 == null) {
                var5 = class119.field1498;
            } else {
                var5 = class535.field7544;
            }
            int var6 = 0;
            int var7 = 0;
            if (class463.field6617 == var5) {
                Insets var8 = class463.field6617.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class711.field10013);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class133.field1735, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class133.field1735 + var6 - var3, var7, var3, class711.field10013);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 - (var4 - class711.field10013), class133.field1735, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(I)V", line = 76)
    public static void method927(int arg0) {
        field1657 = null;
        field1655 = null;
        if (arg0 != 0) {
            field1657 = null;
        }
    }
}
