import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class316 {

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Lbj;")
    public static class241 field4485 = null;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "[I")
    public static int[] field4487 = new int[16384];

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "[S")
    public static short[] field4489 = new short[256];

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "[I")
    public static int[] field4490 = new int[16384];

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "Lrr;")
    public static class361 field4492;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public int field4484;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public int field4488;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public int field4491;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)[Ljw;")
    public static final class551[] method2035(int arg0) {
        field4486++;
        if (arg0 != 16384) {
            field4487 = null;
        }
        return new class551[] { class630.field9039, class438.field6122, class601.field8731, class415.field5814, class676.field9502, class375.field5253, class54.field1031, class70.field1259, class519.field7368, class459.field6630 };
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
    public static void method2036(int arg0) {
        field4487 = null;
        if (arg0 != -24583) {
            method2036(8);
        }
        field4490 = null;
        field4489 = null;
        field4492 = null;
        field4485 = null;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4487[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field4490[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
        field4492 = new class361();
    }
}
