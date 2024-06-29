import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class451 extends class677 {

    @OriginalMember(owner = "client!uf", name = "Bb", descriptor = "Lbca;")
    public static class662 field6173 = new class662();

    @OriginalMember(owner = "client!uf", name = "Cb", descriptor = "[I")
    public static int[] field6174 = new int[16384];

    @OriginalMember(owner = "client!uf", name = "Fb", descriptor = "[I")
    public static int[] field6177 = new int[16384];

    @OriginalMember(owner = "client!uf", name = "Db", descriptor = "I")
    public static int field6175;

    @OriginalMember(owner = "client!uf", name = "Eb", descriptor = "I")
    public static int field6176;

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(I)V")
    public class451(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "(I)V")
    public static void method2572(int arg0) {
        if (arg0 == 25819) {
            field6173 = null;
            field6174 = null;
            field6177 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IF)V")
    public final void method2573(int arg0, float arg1) {
        ++field6175;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field9399[super.field9419++] = (byte) var3;
        super.field9399[super.field9419++] = (byte) (var3 >> 8);
        super.field9399[super.field9419++] = (byte) (var3 >> 16);
        super.field9399[super.field9419++] = (byte) (var3 >> 24);
        if (arg0 != 4440) {
            this.method2574(123, 1.4405893F);
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(IF)V")
    public final void method2574(int arg0, float arg1) {
        ++field6176;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field9399[super.field9419++] = (byte) (var3 >> 24);
        super.field9399[super.field9419++] = (byte) (var3 >> 16);
        super.field9399[super.field9419++] = (byte) (var3 >> 8);
        super.field9399[super.field9419++] = (byte) var3;
        if (arg0 <= 23) {
            this.method2574(-116, -1.2237406F);
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; ++var2) {
            field6174[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field6177[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
    }
}
