import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class57 {

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "Ljava/lang/String;")
    public static String field674 = "";

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "Lwj;")
    public static class270 field672 = new class270(100, -2);

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V", line = 6)
    public static final void method469(byte arg0) {
        field671++;
        if (class147.field2140 != null) {
            return;
        }
        if (arg0 < 114) {
            field674 = null;
        }
        int var1 = class195.field2780;
        int var2 = class445.field6563;
        int var3 = class105.field1586 - class117.field1754 - var1;
        int var4 = class480.field7020 - var2 - class27.field359;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class367.field5383 == null) {
                var5 = class202.field2840.field7425;
            } else {
                var5 = class367.field5383;
            }
            int var6 = 0;
            int var7 = 0;
            if (class367.field5383 == var5) {
                Insets var8 = class367.field5383.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class480.field7020);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class105.field1586, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class105.field1586 - var3, var7, var3, class480.field7020);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class480.field7020 - var4, class105.field1586, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(B)V", line = 76)
    public static void method470(byte arg0) {
        int var1 = 99 / ((13 - arg0) / 61);
        field674 = null;
        field672 = null;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IB)[B", line = 88)
    public static final synchronized byte[] method471(int arg0, byte arg1) {
        field673++;
        if (arg0 == 100 && class352.field5170 > 0) {
            byte[] var2 = class270.field3727[--class352.field5170];
            class270.field3727[class352.field5170] = null;
            return var2;
        }
        if (arg1 >= -20) {
            field674 = null;
        }
        if (arg0 == 5000 && class174.field2579 > 0) {
            byte[] var3 = class27.field354[--class174.field2579];
            class27.field354[class174.field2579] = null;
            return var3;
        } else if (arg0 == 30000 && class371.field5432 > 0) {
            byte[] var4 = class422.field6186[--class371.field5432];
            class422.field6186[class371.field5432] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }
}
