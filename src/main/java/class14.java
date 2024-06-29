import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class14 {

    @OriginalMember(owner = "client!as", name = "d", descriptor = "Lfh;")
    public static class170 field173 = null;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "Z")
    public static boolean field175 = false;

    @OriginalMember(owner = "client!as", name = "i", descriptor = "[I")
    public static int[] field178 = new int[1000];

    @OriginalMember(owner = "client!as", name = "g", descriptor = "I")
    public static int field176 = 2;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "Liq;")
    public static class134 field177;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "[Z")
    public static boolean[] field174;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "[[[B")
    public static byte[][][] field172;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IZ)V")
    public static final void method82(int arg0, boolean arg1) {
        class374.method2244((byte) -78);
        field171++;
        if (class19.field263 != 30 && class19.field263 != 25) {
            return;
        }
        class407.field6066++;
        if (arg0 > class407.field6066 && !arg1) {
            return;
        }
        class407.field6066 = 0;
        if (!class351.field5208 && class301.field4543 != null) {
            class334.field4978++;
            class177.method1082(class402.field5989, 0);
            try {
                class301.field4543.method2164(0, (byte) -35, class189.field2840.field5666, class189.field2840.field5685);
                class189.field2840.field5666 = 0;
            } catch (IOException var2) {
                class351.field5208 = true;
            }
        }
        class374.method2244((byte) -78);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method83(String arg0, byte arg1) {
        field170++;
        if (arg0 == null) {
            return false;
        } else if (arg1 > -14) {
            return false;
        } else {
            for (int var2 = 0; var2 < class433.field6366; var2++) {
                if (arg0.equalsIgnoreCase(class246.field3687[var2])) {
                    return true;
                }
                if (arg0.equalsIgnoreCase(class68.field891[var2])) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(B)V")
    public static void method84(byte arg0) {
        field172 = null;
        field178 = null;
        field177 = null;
        field174 = null;
        field173 = null;
        if (arg0 <= 68) {
            field176 = -41;
        }
    }
}
