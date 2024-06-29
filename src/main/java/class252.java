import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class252 extends class161 {

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "I")
    public static int field4406 = 0;

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "I")
    public static int field4413 = 0;

    @OriginalMember(owner = "client!ii", name = "H", descriptor = "[[I")
    public static int[][] field4417 = new int[104][104];

    @OriginalMember(owner = "client!ii", name = "K", descriptor = "Lp;")
    public static class280 field4420 = class18.method140((byte) -128, "clignotant1:");

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "Lsb;")
    public static class221 field4407 = new class221(50);

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
    public int field4403;

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "I")
    public int field4412;

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "Ldl;")
    public static class122 field4400;

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "Ltg;")
    public static class180 field4402;

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "Ltg;")
    public static class180 field4415;

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "Lug;")
    public static class198 field4409;

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "[I")
    public static int[] field4408;

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "[I")
    public int[] field4411;

    @OriginalMember(owner = "client!ii", name = "E", descriptor = "[I")
    public int[] field4414;

    @OriginalMember(owner = "client!ii", name = "I", descriptor = "[I")
    public int[] field4418;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "[Lbc;")
    public class174[] field4399;

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "[Lbc;")
    public class174[] field4404;

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "[[[B")
    public static byte[][][] field4401;

    @OriginalMember(owner = "client!ii", name = "J", descriptor = "[[[B")
    public byte[][][] field4419;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ltg;I)V")
    public static final void method1694(class180 arg0, int arg1) {
        int var2 = 97 % ((arg1 - 14) / 33);
        field4410++;
        class181.field3164 = arg0;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
    public static void method1695(byte arg0) {
        field4420 = null;
        if (arg0 != 64) {
            return;
        }
        field4401 = null;
        field4400 = null;
        field4407 = null;
        field4402 = null;
        field4417 = null;
        field4408 = null;
        field4415 = null;
        field4409 = null;
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)V")
    public static final void method1696(int arg0) {
        int var1 = 78 / ((arg0 - 58) / 56);
        field4405++;
        if (class201.field3516 != null && class90.field1459 != null) {
            return;
        }
        class90.field1459 = new int[256];
        class201.field3516 = new int[256];
        for (int var2 = 0; var2 < 256; var2++) {
            double var3 = (double) var2 / 255.0D * 6.283185307179586D;
            class201.field3516[var2] = (int) (Math.sin(var3) * 4096.0D);
            class90.field1459[var2] = (int) (Math.cos(var3) * 4096.0D);
        }
    }
}
