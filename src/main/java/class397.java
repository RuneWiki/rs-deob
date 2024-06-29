import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class397 {

    @OriginalMember(owner = "client!h", name = "a", descriptor = "Ljava/lang/String;")
    public static String field5784 = "purple:";

    @OriginalMember(owner = "client!h", name = "b", descriptor = "[S")
    public static short[] field5785 = new short[256];

    @OriginalMember(owner = "client!h", name = "i", descriptor = "Z")
    public static boolean field5792 = false;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "[I")
    public static int[] field5791 = new int[500];

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field5787;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "Lra;")
    public static class57 field5794;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "Lvr;")
    public static class71 field5789;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V", line = 7)
    public static void method2524(int arg0) {
        field5784 = null;
        if (arg0 != 0) {
            field5789 = null;
        }
        field5791 = null;
        field5794 = null;
        field5789 = null;
        field5785 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([JI[Ljava/lang/Object;)V", line = 33)
    public static final void method2525(long[] arg0, int arg1, Object[] arg2) {
        if (arg1 > -93) {
            field5791 = null;
        }
        class67.method398(arg2, arg0.length - 1, 45, arg0, 0);
        field5793++;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V", line = 48)
    public static final void method2526(int arg0) {
        if (arg0 != 29328) {
            method2525((long[]) null, -11, (Object[]) null);
        }
        class388.field5690.method2043(-83);
        field5787++;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V", line = 59)
    public static final void method2527(byte arg0) {
        field5790++;
        if (class223.field3042 != null) {
            return;
        }
        int var1 = class99.field1111;
        if (arg0 != 96) {
            field5785 = null;
        }
        int var2 = class375.field5479;
        int var3 = class356.field5219 - class38.field389 - var1;
        int var4 = class384.field5628 - (class222.field3039 + var2);
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class252.field3406 == null) {
                var5 = class323.field4554.field5559;
            } else {
                var5 = class252.field3406;
            }
            int var6 = 0;
            int var7 = 0;
            if (class252.field3406 == var5) {
                Insets var8 = class252.field3406.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class384.field5628);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class356.field5219, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class356.field5219 + var6 - var3, var7, var3, class384.field5628);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class384.field5628 - var4, class356.field5219, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }
}
