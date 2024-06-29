import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class98 extends class93 {

    @OriginalMember(owner = "client!k", name = "T", descriptor = "I")
    private int field1988;

    @OriginalMember(owner = "client!k", name = "W", descriptor = "I")
    public static int field1991 = 0;

    @OriginalMember(owner = "client!k", name = "X", descriptor = "I")
    public static int field1992 = 0;

    @OriginalMember(owner = "client!k", name = "Z", descriptor = "Ljd;")
    public static class92 field1994 = class202.method1325((byte) 90, "null");

    @OriginalMember(owner = "client!k", name = "Y", descriptor = "[I")
    public static int[] field1993 = new int[32];

    @OriginalMember(owner = "client!k", name = "bb", descriptor = "I")
    public static int field1996 = 0;

    @OriginalMember(owner = "client!k", name = "S", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!k", name = "U", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!k", name = "V", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!k", name = "ab", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        ++field1990;
        int[] var3 = super.field1887.method916(arg0, -94);
        if (super.field1887.field2757) {
            class11.method77(var3, 0, class150.field2985, this.field1988);
        }
        int var4 = -52 / ((arg1 - 67) / 42);
        return var3;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(II)I")
    public static int method685(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!k", name = "f", descriptor = "(I)V")
    public static void method686(int arg0) {
        field1993 = null;
        if (arg0 == 30425) {
            field1994 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.field1988 = (arg1.method443(arg2 + 255) << 12) / 255;
            }
            ++field1987;
        }
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(II)V")
    public static final void method687(int arg0, int arg1) {
        ++field1995;
        if (class188.method1210(-18040, arg0)) {
            class1[] var2 = class60.field1256[arg0];
            int var3 = 0;
            int var4 = 122 / ((2 - arg1) / 53);
            while (var3 < var2.length) {
                class1 var5 = var2[var3];
                if (var5 != null) {
                    var5.field140 = 0;
                    var5.field130 = 0;
                }
                ++var3;
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V")
    public class98() {
        this(4096);
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(I)V")
    private class98(int arg0) {
        super(0, true);
        this.field1988 = 4096;
        this.field1988 = arg0;
    }
}
