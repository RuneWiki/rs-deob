import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class349 extends class338 {

    @OriginalMember(owner = "client!fs", name = "s", descriptor = "[B")
    public static byte[] field4854 = new byte[32896];

    @OriginalMember(owner = "client!fs", name = "u", descriptor = "[I")
    public static int[] field4856;

    @OriginalMember(owner = "client!fs", name = "v", descriptor = "[I")
    public static int[] field4857;

    @OriginalMember(owner = "client!fs", name = "q", descriptor = "F")
    public float field4852;

    @OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
    public int field4848;

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
    public int field4849;

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "I")
    public int field4851;

    @OriginalMember(owner = "client!fs", name = "r", descriptor = "I")
    public int field4853;

    @OriginalMember(owner = "client!fs", name = "t", descriptor = "I")
    public int field4855;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var3 = 0; var3 <= var1; var3++) {
                field4854[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + (var3 * var3 + 65535)) / 65535.0F))));
            }
        }
        field4856 = new int[4096];
        for (int var2 = 0; var2 < 4096; var2++) {
            field4856[var2] = class344.method2008(var2, false);
        }
        field4857 = new int[14];
    }

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "(I)V", line = 5)
    public static void method2141(int arg0) {
        field4857 = null;
        field4854 = null;
        field4856 = null;
        if (arg0 != 255) {
            method2141(28);
        }
    }
}
