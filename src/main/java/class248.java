import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class248 {

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "[Z")
    public static boolean[] field3578 = new boolean[8];

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Lgf;")
    public static class180 field3577 = new class180("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "Llh;")
    public static class364 field3579 = new class364(260);

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "[I")
    public static int[] field3580 = new int[2];

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "[I")
    public static int[] field3581 = new int[50];

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "[I")
    public static int[] field3582 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    public static final void method1582(byte arg0) {
        field3575++;
        if (class320.field4577 != null) {
            return;
        }
        if (arg0 != -23) {
            method1584(-74);
        }
        int var1 = class79.field1315;
        int var2 = class381.field5677;
        int var3 = class382.field5683 - class112.field1780 - var1;
        int var4 = class183.field2752 - class477.field7003 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class409.field6029 == null) {
                var5 = class112.field1785.field4458;
            } else {
                var5 = class409.field6029;
            }
            int var6 = 0;
            int var7 = 0;
            if (class409.field6029 == var5) {
                Insets var8 = class409.field6029.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class183.field2752);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class382.field5683, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class382.field5683 + var6 - var3, var7, var3, class183.field2752);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class183.field2752 - var4, class382.field5683, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static final void method1583(int arg0) {
        field3574++;
        class137 var1 = null;
        try {
            class100 var2 = class112.field1785.method1967(12619, "2");
            while (var2.field1604 == 0) {
                class185.method1285(114, 1L);
            }
            if (var2.field1604 == 1) {
                var1 = (class137) var2.field1608;
                byte[] var3 = new byte[(int) var1.method1014(false)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method1013(var3, var4, (byte) 102, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class496.method2956((byte) 30, new class303(var3));
            }
        } catch (Exception var8) {
        }
        int var6 = -41 / ((arg0 + 28) / 60);
        try {
            if (var1 != null) {
                var1.method1011(7734);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
    public static void method1584(int arg0) {
        field3578 = null;
        field3580 = null;
        field3579 = null;
        field3577 = null;
        field3582 = null;
        field3581 = null;
        if (arg0 != 0) {
            field3582 = null;
        }
    }
}
