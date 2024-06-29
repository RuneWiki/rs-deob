import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class19 extends class310 {

    @OriginalMember(owner = "client!be", name = "X", descriptor = "Lca;")
    public static class124 field257 = null;

    @OriginalMember(owner = "client!be", name = "bb", descriptor = "Lvm;")
    public static class297 field261 = new class297(100);

    @OriginalMember(owner = "client!be", name = "U", descriptor = "B")
    public byte field254;

    @OriginalMember(owner = "client!be", name = "V", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!be", name = "W", descriptor = "I")
    public int field256;

    @OriginalMember(owner = "client!be", name = "ab", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!be", name = "cb", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!be", name = "db", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!be", name = "Y", descriptor = "Lng;")
    public static class138 field258;

    @OriginalMember(owner = "client!be", name = "Z", descriptor = "Lra;")
    public class41 field259;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(Z)[B", line = 24)
    public final byte[] method117(boolean arg0) {
        if (!arg0) {
            return (byte[]) null;
        }
        field262++;
        if (this.field5342 || (this.field259.field772.length - this.field254) > this.field259.field738) {
            throw new RuntimeException();
        }
        return this.field259.field772;
    }

    @OriginalMember(owner = "client!be", name = "g", descriptor = "(I)I", line = 48)
    public final int method118(int arg0) {
        field260++;
        int var2 = -94 / ((29 - arg0) / 42);
        return this.field259 == null ? 0 : this.field259.field738 * 100 / (this.field259.field772.length - this.field254);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BI)I", line = 62)
    public static final int method119(byte arg0, int arg1) {
        int var2 = 5 % ((-arg0 - 62) / 40);
        field263++;
        return arg1 == 16711935 ? -1 : class145.method1060(arg1, 4158);
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(Z)V", line = 79)
    public static void method120(boolean arg0) {
        field261 = null;
        if (arg0) {
            method120(true);
        }
        field258 = null;
    }
}
