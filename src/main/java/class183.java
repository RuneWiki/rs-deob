import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class183 {

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "[I")
    public static int[] field2678 = new int[16384];

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "[I")
    public static int[] field2684 = new int[16384];

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "[I")
    public static int[] field2686 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "Lya;")
    public static class38 field2679;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "Ljv;")
    public static class56 field2685;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "[Ll;")
    public static class16[] field2681;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field2684[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field2678[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V", line = 5)
    public static void method1166(int arg0) {
        field2686 = null;
        field2678 = null;
        if (arg0 == 50) {
            field2685 = null;
            field2681 = null;
            field2679 = null;
            field2684 = null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V", line = 32)
    public static final void method1167(int arg0) {
        field2682++;
        if (class94.field1448) {
            return;
        }
        class94.field1448 = true;
        if (arg0 != -15383) {
            field2685 = null;
        }
        class463.field6805 = true;
        if (class20.field269.field7654) {
            class498.field7255 = ((int) class498.field7255 - 65 & 0xFFFFFF80);
        } else {
            class78.field1128 += (-24.0F - class78.field1128) / 2.0F;
        }
    }
}
