import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class293 {

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "[[B")
    public static byte[][] field4980 = new byte[1000][];

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "[I")
    public static int[] field4981 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public int field4982;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "Ltf;")
    public class250 field4983;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "[I")
    public int[] field4985;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "[[[I")
    public static int[][][] field4979;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V", line = 18)
    public static void method2092(byte arg0) {
        int var1 = -24 / ((51 - arg0) / 63);
        field4979 = (int[][][]) null;
        field4980 = (byte[][]) null;
        field4981 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(DI)V", line = 34)
    public static final void method2093(double arg0, int arg1) {
        field4984++;
        if (arg1 > -69) {
            method2092((byte) -73);
        }
        if (class309.field5258 == arg0) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
            class262.field4366[var3] = var4 <= 255 ? var4 : 255;
        }
        class309.field5258 = arg0;
    }
}
