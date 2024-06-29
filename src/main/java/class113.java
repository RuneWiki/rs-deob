import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class113 {

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public int field1591 = 1;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public static int field1589 = 0;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
    public static int field1595 = 50;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "[I")
    public static int[] field1583 = new int[field1595];

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "[I")
    public static int[] field1587 = new int[field1595];

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field1592 = new String[field1595];

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "[I")
    public static int[] field1597 = new int[field1595];

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "[I")
    public static int[] field1588 = new int[field1595];

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "[I")
    public static int[] field1596 = new int[field1595];

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "[I")
    public static int[] field1590 = new int[field1595];

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "C")
    public char field1594;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "F")
    public static float field1584;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Liv;B)V", line = 5)
    public final void method912(class65 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method577(255);
            if (var3 == 0) {
                int var4 = -26 / ((-arg1 - 52) / 37);
                field1585++;
                return;
            }
            this.method916((byte) 127, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V", line = 25)
    public static void method913(byte arg0) {
        field1596 = null;
        if (arg0 != -102) {
            method913((byte) -58);
        }
        field1590 = null;
        field1588 = null;
        field1587 = null;
        field1597 = null;
        field1583 = null;
        field1592 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIII)V", line = 44)
    public static final void method914(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg3; var5 < class267.field3933; var5++) {
            Rectangle var6 = class96.field1292[var5];
            if (arg4 < var6.x + var6.width && arg0 + arg4 > var6.x && (var6.y + var6.height) > arg2 && (arg1 + arg2) > var6.y) {
                class525.field7706[var5] = true;
            }
        }
        field1586++;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)Laq;", line = 78)
    public static final class111 method915(boolean arg0) {
        field1593++;
        if (class399.field5903 == null || class411.field6105 == null) {
            return null;
        }
        class411.field6105.method1085(class399.field5903, -101);
        class111 var1 = (class111) class411.field6105.method1081(arg0);
        if (var1 == null) {
            return null;
        } else {
            class405 var2 = class399.field5891.method837(var1.field1567, (byte) -41);
            return var2 != null && var2.field5984 && var2.method2481(-11247, class399.field5894) ? var1 : class432.method2624(-2);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BILiv;)V", line = 111)
    private final void method916(byte arg0, int arg1, class65 arg2) {
        if (arg1 == 1) {
            this.field1594 = class208.method1445(32404, arg2.method629(false));
        } else if (arg1 == 2) {
            this.field1591 = 0;
        }
        if (arg0 >= 117) {
            field1598++;
        }
    }
}
