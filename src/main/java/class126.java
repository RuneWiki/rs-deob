import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class126 extends class583 {

    @OriginalMember(owner = "client!gm", name = "G", descriptor = "I")
    public static int field1798 = 0;

    @OriginalMember(owner = "client!gm", name = "I", descriptor = "Lkg;")
    public static class275 field1800 = new class275(61, 6);

    @OriginalMember(owner = "client!gm", name = "N", descriptor = "[I")
    public static int[] field1805 = new int[6];

    @OriginalMember(owner = "client!gm", name = "E", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!gm", name = "J", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!gm", name = "K", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!gm", name = "L", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!gm", name = "H", descriptor = "Lcea;")
    public static class216 field1799;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gm", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field1807;

    @OriginalMember(owner = "client!gm", name = "O", descriptor = "Ljava/lang/String;")
    public static String field1806;

    @OriginalMember(owner = "client!gm", name = "M", descriptor = "[B")
    private byte[] field1804;

    // $FF: synthetic method
    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method951(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IBI)V", line = 5)
    public final void method946(int arg0, byte arg1, int arg2) {
        field1801++;
        int var4 = arg0 * 2;
        if (arg2 == -28541) {
            int var5 = arg1 & 0xFF;
            this.field1804[var4++] = (byte) (var5 * 3 >> 5);
            this.field1804[var4] = (byte) (var5 * 3 >> 5);
        }
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V", line = 21)
    public class126() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(B)V", line = 28)
    public static final void method947(byte arg0) {
        class26.field474 = -1;
        class582.field8137 = null;
        if (arg0 > 23) {
            field1803++;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIII)[B", line = 42)
    public final byte[] method948(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -59072692) {
            this.method948(-78, 34, 94, 42);
        }
        field1802++;
        this.field1804 = new byte[arg1 * arg2 * arg0 * 2];
        this.method1058(arg1, arg0, arg2, (byte) -128);
        return this.field1804;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BLaca;)V", line = 55)
    public static final void method949(byte arg0, class729 arg1) {
        field1797++;
        if (class197.field2689 == null) {
            return;
        }
        class457 var2 = null;
        if (arg0 > -53) {
            field1805 = null;
        }
        if (arg1.field10140 == 0) {
            var2 = (class457) class527.method3046(arg1.field10147, arg1.field10154, arg1.field10139);
        }
        if (arg1.field10140 == 1) {
            var2 = (class457) class67.method624(arg1.field10147, arg1.field10154, arg1.field10139);
        }
        if (arg1.field10140 == 2) {
            var2 = (class457) class290.method1735(arg1.field10147, arg1.field10154, arg1.field10139, field1807 == null ? (field1807 = method951("rca")) : field1807);
        }
        if (arg1.field10140 == 3) {
            var2 = (class457) class146.method1046(arg1.field10147, arg1.field10154, arg1.field10139);
        }
        if (var2 == null) {
            arg1.field10144 = 0;
            arg1.field10153 = -1;
            arg1.field10141 = 0;
        } else {
            arg1.field10153 = var2.method745((byte) -93);
            arg1.field10144 = var2.method758(true);
            arg1.field10141 = var2.method743(-30968);
        }
    }

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "(I)V", line = 101)
    public static void method950(int arg0) {
        field1800 = null;
        field1805 = null;
        field1806 = null;
        if (arg0 != -1) {
            method950(-111);
        }
        field1799 = null;
    }
}
