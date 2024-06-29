import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class300 extends class309 {

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "[I")
    public int[] field3849;

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "[I")
    public int[] field3845;

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "Lsw;")
    public static class641 field3848 = new class641(64);

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "Lcea;")
    public static class180 field3850 = new class180("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

    @OriginalMember(owner = "client!oq", name = "o", descriptor = "I")
    public static int field3853 = 0;

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "Lcea;")
    public static class180 field3852 = new class180(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!oq", name = "m", descriptor = "Ldn;")
    public static class438 field3851;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IBI)I")
    public static final int method1661(int arg0, byte arg1, int arg2) {
        field3847++;
        int var3 = 96 / ((arg1 + 19) / 62);
        return arg0 == 1 || arg0 == 3 ? class566.field8320[arg2 & 0x3] : class389.field5148[arg2 & 0x3];
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z)V")
    public static void method1662(boolean arg0) {
        field3850 = null;
        field3852 = null;
        if (arg0) {
            field3851 = null;
        }
        field3851 = null;
        field3848 = null;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B[FI)[F")
    public static final float[] method1663(byte arg0, float[] arg1, int arg2) {
        field3846++;
        if (arg0 > -77) {
            field3848 = null;
        }
        float[] var3 = new float[arg2];
        class345.method1930(arg1, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(II[I[I)V")
    public class300(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field3849 = arg2;
        this.field3845 = arg3;
    }
}
