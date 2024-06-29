import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class415 extends class397 {

    @OriginalMember(owner = "client!pe", name = "L", descriptor = "Lgn;")
    public static class475 field6142 = new class475(31, 12);

    @OriginalMember(owner = "client!pe", name = "P", descriptor = "Z")
    public static boolean field6146 = false;

    @OriginalMember(owner = "client!pe", name = "R", descriptor = "I")
    public static int field6148 = 0;

    @OriginalMember(owner = "client!pe", name = "T", descriptor = "[Lue;")
    public static class147[] field6150 = new class147[50];

    @OriginalMember(owner = "client!pe", name = "U", descriptor = "F")
    public static float field6151;

    @OriginalMember(owner = "client!pe", name = "M", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!pe", name = "N", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!pe", name = "S", descriptor = "I")
    public static int field6149;

    @OriginalMember(owner = "client!pe", name = "V", descriptor = "I")
    public static int field6152;

    @OriginalMember(owner = "client!pe", name = "O", descriptor = "Lso;")
    public static class313 field6145;

    @OriginalMember(owner = "client!pe", name = "Q", descriptor = "[Z")
    public static boolean[] field6147;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V")
    public static void method2466(int arg0) {
        field6142 = null;
        if (arg0 != 4096) {
            method2466(82);
        }
        field6145 = null;
        field6147 = null;
        field6150 = null;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
    public class415() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lae;I)Lra;")
    public static final class67 method2467(class156 arg0, int arg1) {
        ++field6144;
        if (arg1 != 789221) {
            field6150 = null;
        }
        return new class67(arg0.method936((byte) -96), arg0.method936((byte) -96), arg0.method936((byte) -96), arg0.method936((byte) -96), arg0.method936((byte) -96), arg0.method936((byte) -96), arg0.method936((byte) -96), arg0.method936((byte) -96), arg0.method943(arg1 + 1295062091), arg0.method941((byte) 125));
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIZ)I")
    private final int method2468(int arg0, int arg1, boolean arg2) {
        ++field6149;
        if (!arg2) {
            field6142 = null;
        }
        int var4 = arg0 * 57 + arg1;
        int var5 = var4 << 1 ^ var4;
        return -(((var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        if (arg0 != -780833076) {
            method2466(25);
        }
        ++field6152;
        int[] var3 = super.field5854.method465(arg1, arg0 + 780833186);
        if (super.field5854.field991) {
            int var4 = class447.field6523[arg1];
            for (int var5 = 0; ~var5 > ~class164.field2152; ++var5) {
                var3[var5] = this.method2468(var4, class228.field3210[var5], true) % 4096;
            }
        }
        return var3;
    }
}
