import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class384 extends class637 {

    @OriginalMember(owner = "client!nn", name = "F", descriptor = "[F")
    public static float[] field5650 = new float[16384];

    @OriginalMember(owner = "client!nn", name = "G", descriptor = "[F")
    public static float[] field5651 = new float[16384];

    @OriginalMember(owner = "client!nn", name = "H", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5652;

    @OriginalMember(owner = "client!nn", name = "C", descriptor = "I")
    public static int field5647;

    @OriginalMember(owner = "client!nn", name = "D", descriptor = "I")
    public int field5648;

    @OriginalMember(owner = "client!nn", name = "E", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!nn", name = "A", descriptor = "Lfj;")
    public class610 field5645;

    @OriginalMember(owner = "client!nn", name = "B", descriptor = "[B")
    public byte[] field5646;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(B)[B")
    public final byte[] method235(byte arg0) {
        ++field5649;
        if (arg0 > -73) {
            return null;
        } else if (super.field9179) {
            throw new RuntimeException();
        } else {
            return this.field5646;
        }
    }

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "(I)I")
    public final int method237(int arg0) {
        ++field5647;
        if (arg0 != 0) {
            this.field5646 = null;
        }
        return super.field9179 ? 0 : 100;
    }

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "(I)V")
    public static void method2380(int arg0) {
        field5650 = null;
        field5651 = null;
        field5652 = null;
        if (arg0 >= -5) {
            method2380(98);
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; ~var2 > -16385; ++var2) {
            field5651[var2] = (float) Math.sin((double) var2 * var0);
            field5650[var2] = (float) Math.cos((double) var2 * var0);
        }
        field5652 = new Color[] { new Color(9179409), new Color(3289650) };
    }
}
