import java.awt.Color;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public abstract class class140 {

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1788 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public static int field1791 = 0;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "[I")
    public static int[] field1792 = new int[1];

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "Lcb;")
    public static class318 field1790 = new class318(75, 1);

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IB)Lefa;", line = 11)
    public static final class40 method967(int arg0, byte arg1) {
        field1789++;
        if (arg1 <= 6) {
            field1792 = null;
        }
        return class177.field2219 && class528.field7316 <= arg0 && arg0 <= class352.field5142 ? class645.field9142[arg0 - class528.field7316] : null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V", line = 26)
    public static void method968(byte arg0) {
        field1788 = null;
        if (arg0 == -108) {
            field1792 = null;
            field1790 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BZILefa;Lefa;IZ)I", line = 40)
    public static final int method970(byte arg0, boolean arg1, int arg2, class40 arg3, class40 arg4, int arg5, boolean arg6) {
        field1787++;
        int var7 = class66.method397(false, arg2, arg4, arg1, arg3);
        if (var7 != 0) {
            return arg1 ? -var7 : var7;
        } else if (arg5 == -1) {
            return 0;
        } else if (arg0 <= 116) {
            return 30;
        } else {
            int var8 = class66.method397(false, arg5, arg4, arg6, arg3);
            return arg6 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "([BIII)I")
    public abstract int method964(byte[] arg0, int arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BI)Z")
    public abstract boolean method965(byte arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)V")
    public abstract void method966(boolean arg0);

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "([BIII)V")
    public abstract void method969(byte[] arg0, int arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
    public abstract void method971(int arg0);
}
