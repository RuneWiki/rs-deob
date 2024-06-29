import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class682 {

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "Lnea;")
    public static class664 field9619 = new class664(26, -2);

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field9616;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public static int field9621;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "Lr;")
    public static class166 field9618;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "[B")
    public byte[] field9620;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "[S")
    public short[] field9614;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "[S")
    public short[] field9615;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "[S")
    public short[] field9617;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V", line = 6)
    public static final void method3774(int arg0) {
        field9616++;
        int var1 = (int) ((double) class199.field2812 * 34.46D);
        int var2 = var1 << 2;
        if (class282.field4228.method167()) {
            var2 += 512;
        }
        class282.field4228.method142(arg0, var2);
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V", line = 21)
    public static void method3775(int arg0) {
        if (arg0 == 200) {
            field9618 = null;
            field9619 = null;
        }
    }
}
