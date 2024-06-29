import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class150 extends class125 {

    @OriginalMember(owner = "client!nr", name = "l", descriptor = "[I")
    public static int[] field2189 = new int[1];

    @OriginalMember(owner = "client!nr", name = "i", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!nr", name = "j", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!nr", name = "k", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!nr", name = "m", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!nr", name = "n", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!nr", name = "o", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!nr", name = "p", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!nr", name = "q", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!nr", name = "r", descriptor = "Lla;")
    public static class423 field2195;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(III)Z")
    public static final boolean method1089(int arg0, int arg1, int arg2) {
        ++field2192;
        if (arg0 != 0) {
            return false;
        } else {
            return (arg2 & 33) != 0;
        }
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(Z)V")
    public final void method156(boolean arg0) {
        if (~super.field1732 != -2 && super.field1732 != 0) {
            super.field1732 = this.method158((byte) -112);
        }
        if (!arg0) {
            this.method157((byte) 82, 90);
        }
        ++field2191;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)I")
    public final int method158(byte arg0) {
        ++field2187;
        int var2 = 42 % ((-63 - arg0) / 49);
        return 1;
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lgp;)V")
    public class150(class549 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)V")
    public static final void method1090(int arg0) {
        if (arg0 < 66) {
            field2195 = null;
        }
        for (int var1 = 0; ~var1 > ~class595.field8451; ++var1) {
            int var2 = class316.method1941(106, var1 - -class647.field9322, class595.field8451) * class565.field8192;
            for (int var3 = 0; var3 < class565.field8192; ++var3) {
                int var4 = class316.method1941(123, class641.field9120 + var3, class565.field8192) + var2;
                if (~class571.field8229[var4] == ~class721.field10151) {
                    class577.field8283[var4].method686(0, 0, class381.field5523, class519.field7488, class381.field5523 * var3, class519.field7488 * var1, true, true);
                }
            }
        }
        ++field2188;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(BI)V")
    public final void method157(byte arg0, int arg1) {
        ++field2186;
        super.field1732 = arg1;
        if (arg0 >= -32) {
            method1091((byte) -30);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ZI)I")
    public final int method155(boolean arg0, int arg1) {
        if (!arg0) {
            field2189 = null;
        }
        ++field2193;
        return 1;
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(B)V")
    public static void method1091(byte arg0) {
        if (arg0 > -54) {
            method1090(82);
        }
        field2189 = null;
        field2195 = null;
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(Z)I")
    public final int method1092(boolean arg0) {
        ++field2194;
        if (arg0) {
            field2190 = -72;
        }
        return super.field1732;
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(ILgp;)V")
    public class150(int arg0, class549 arg1) {
        super(arg0, arg1);
    }
}
