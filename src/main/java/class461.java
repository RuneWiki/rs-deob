import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class461 extends RuntimeException {

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "Ljava/lang/String;")
    public String field6632;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "Ljava/lang/Throwable;")
    public Throwable field6633;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field6628 = 0;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "J")
    public static long field6627 = 0L;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "[I")
    public static int[] field6635 = new int[3];

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field6629;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field6631;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIBIII)I", line = 3)
    public static final int method2678(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 >= -63) {
            return 57;
        }
        field6629++;
        if (class687.field9745 == null) {
            return 0;
        }
        if (arg1 < 3) {
            int var6 = arg5 >> 9;
            int var7 = arg0 >> 9;
            if (arg3 < 0 || arg4 < 0 || (class430.field6136 - 1) < arg3 || arg4 > (class580.field8504 - 1)) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || var6 > class430.field6136 - 1 || class580.field8504 - 1 < var7) {
                return 0;
            }
            boolean var8 = (class548.field8052[1][arg5 >> 9][arg0 >> 9] & 0x2) != 0;
            if ((arg5 & 0x1FF) == 0) {
                boolean var9 = (class548.field8052[1][var6 - 1][arg0 >> 9] & 0x2) != 0;
                boolean var10 = (class548.field8052[1][var6][arg0 >> 9] & 0x2) != 0;
                if (var10 != var9) {
                    var8 = (class548.field8052[1][arg3][arg4] & 0x2) != 0;
                }
            }
            if ((arg0 & 0x1FF) == 0) {
                boolean var11 = (class548.field8052[1][arg5 >> 9][var7 - 1] & 0x2) != 0;
                boolean var12 = (class548.field8052[1][arg5 >> 9][var7] & 0x2) != 0;
                if (var11 != var12) {
                    var8 = (class548.field8052[1][arg3][arg4] & 0x2) != 0;
                }
            }
            if (var8) {
                arg1++;
            }
        }
        return class687.field9745[arg1].method3861((byte) -68, arg5, arg0);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V", line = 63)
    public static final void method2679(byte arg0) {
        class472.field6789 = 0;
        class400.field5777 = -1;
        class202.field3126 = -1;
        class511.field7605 = -1;
        field6634++;
        if (arg0 < 18) {
            method2681(2, -97);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V", line = 86)
    public static final void method2680(boolean arg0) {
        field6630++;
        if (class35.field490 != null) {
            return;
        }
        int var1 = class240.field3525;
        int var2 = class119.field1910;
        int var3 = class521.field7686 - class465.field6689 - var1;
        int var4 = class122.field1985 - class597.field8633 - var2;
        if (!arg0) {
            field6628 = 15;
        }
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class699.field9906 != null) {
                var5 = class699.field9906;
            } else if (class492.field7063 == null) {
                var5 = class107.field1756;
            } else {
                var5 = class492.field7063;
            }
            int var6 = 0;
            int var7 = 0;
            if (class699.field9906 == var5) {
                Insets var8 = class699.field9906.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class122.field1985);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class521.field7686, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class521.field7686 + var6 - var3, var7, var3, class122.field1985);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class122.field1985 - var4, class521.field7686, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Z", line = 161)
    public static final boolean method2681(int arg0, int arg1) {
        if (arg0 != 1619598377) {
            method2679((byte) -17);
        }
        field6631++;
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 171)
    public class461(Throwable arg0, String arg1) {
        this.field6632 = arg1;
        this.field6633 = arg0;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 180)
    public static void method2682(int arg0) {
        int var1 = -20 % ((arg0 - 54) / 57);
        field6635 = null;
    }
}
