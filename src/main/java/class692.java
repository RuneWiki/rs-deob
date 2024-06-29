import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class692 {

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "J")
    public long field9810;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "Leq;")
    private class357 field9808;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "Lk;")
    public static class43 field9816 = new class43();

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field9809;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field9811;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field9812;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field9813;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field9814;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field9815;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    public static int field9817;

    @OriginalMember(owner = "client!ci", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        field9817++;
        this.field9808.method2129(11642, this.field9810);
        super.finalize();
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V", line = 17)
    public static void method3861(byte arg0) {
        if (arg0 != 127) {
            method3861((byte) -58);
        }
        field9816 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)V", line = 28)
    public static final void method3862(int arg0, int arg1) {
        if (arg0 == -2) {
            class721.field10157.method775(arg0 + 3, arg1);
            field9812++;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILtn;)Leaa;", line = 43)
    public static final class379 method3863(int arg0, class179 arg1) {
        field9809++;
        if (arg0 != 3) {
            field9816 = null;
        }
        return new class379(arg1.method1137((byte) -77), arg1.method1137((byte) -62), arg1.method1137((byte) -85), arg1.method1137((byte) -112), arg1.method1114(104), arg1.method1094(arg0 + 252));
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Leq;JI)V", line = 53)
    public class692(class357 arg0, long arg1, int arg2) {
        this.field9810 = arg1;
        this.field9808 = arg0;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)I", line = 64)
    public static final int method3864(int arg0) {
        field9811++;
        int var1 = 27 % ((arg0 - 28) / 45);
        return class709.field9973 == 1 ? class635.field8800 : class199.field2547;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)Ljava/lang/String;", line = 78)
    public static final String method3865(int arg0, int arg1) {
        field9815++;
        if (arg1 != 0) {
            return null;
        }
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class586.field8158.method3261(class416.field5920, (byte) 82) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class586.field8160.method3261(class416.field5920, (byte) 82) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }
}
