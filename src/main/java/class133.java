import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class133 {

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "Lsb;")
    private class93 field1792;

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "J")
    public long field1797;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "I")
    public static int field1795 = 0;

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "[I")
    public static int[] field1794 = new int[14];

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "Lpaa;")
    public static class712 field1798 = null;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "[I")
    public static int[] field1793 = new int[13];

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!jr", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field1792.method605(this.field1797, 100);
        field1796++;
        super.finalize();
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
    public static final void method838(int arg0) {
        if (arg0 != 14) {
            method838(-113);
        }
        class463.method2768(false);
        field1799++;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Z)V")
    public static void method839(boolean arg0) {
        field1798 = null;
        if (!arg0) {
            field1794 = null;
        }
        field1793 = null;
        field1794 = null;
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lsb;JI)V")
    public class133(class93 arg0, long arg1, int arg2) {
        this.field1792 = arg0;
        this.field1797 = arg1;
    }
}
