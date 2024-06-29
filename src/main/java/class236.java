import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class236 {

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "[[[B")
    public static byte[][][] field4299;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static void method1589(int arg0) {
        if (arg0 != -12529) {
            method1591(true, (Object) null, false);
        }
        field4299 = null;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public static final void method1590(int arg0) {
        field4296++;
        if (class88.field1598 == 5) {
            if (arg0 > -122) {
                method1590(55);
            }
            class88.field1598 = 6;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZLjava/lang/Object;Z)[B")
    public static final byte[] method1591(boolean arg0, Object arg1, boolean arg2) {
        field4295++;
        if (arg1 == null) {
            return null;
        }
        if (!arg0) {
            method1590(5);
        }
        if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg2 ? class66.method377(var3, !arg0) : var3;
        } else if (arg1 instanceof class276) {
            class276 var4 = (class276) arg1;
            return var4.method7((byte) -86);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BI)V")
    public static final void method1592(byte arg0, int arg1) {
        int var2 = 43 % ((arg0 - 26) / 39);
        class190.field3442.method835(1, arg1);
        field4297++;
        class117.field2086.method835(1, arg1);
        class184.field3331.method835(1, arg1);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IZLlc;)V")
    public static final void method1593(int arg0, boolean arg1, class143 arg2) {
        field4294++;
        byte var3 = 4;
        int var4 = class134.field2341.method1313(arg2, 250);
        int var5 = var3 + 6;
        int var6 = var3 + 6;
        int var7 = class134.field2341.method1307(arg2, 250) * 13;
        class260.method1726(var5 - var3, -var3 + var6, var3 + var3 + var4, var3 + var7 + var3, 0);
        class260.method1729(var5 - var3, -var3 + var6, var3 + var4 + var3, var3 + var7 + var3, 16777215);
        class134.field2341.method1315(arg2, var5, var6, var4, var7, arg0, -1, 1, 1, 0);
        class235.method1588(arg0 - 16777139, -var3 + var6, var4 + var3 + var3, var5 - var3, var3 + var7 + var3);
        if (!arg1) {
            class186.method1216(var4, var6, -126, var5, var7);
            return;
        }
        try {
            Graphics var8 = class155.field2792.getGraphics();
            class35.field608.method321(0, 0, var8, 0);
        } catch (Exception var9) {
            class155.field2792.repaint();
        }
    }
}
