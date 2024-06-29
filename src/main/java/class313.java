import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class313 extends class183 {

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    public static int field4723 = 2;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4721 = " has logged in.";

    @OriginalMember(owner = "client!n", name = "r", descriptor = "[I")
    public static int[] field4726 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "I")
    public int field4729;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "I")
    public int field4730;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "[I")
    public int[] field4722;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "[I")
    public int[] field4732;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "[I")
    public int[] field4735;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "[Lo;")
    public class285[] field4733;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "[Lo;")
    public class285[] field4734;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "[[[B")
    public byte[][][] field4728;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V", line = 15)
    public static void method2141(int arg0) {
        if (arg0 <= -71) {
            field4726 = null;
            field4721 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(B)V", line = 49)
    public static final void method2142(byte arg0) {
        field4727++;
        if (class41.field469 || arg0 != 76) {
            return;
        }
        if (class98.field1340) {
            class124.field1674 = (float) ((int) class124.field1674 + 47 & 0xFFFFFFF0);
        } else {
            class187.field2589 += (12.0F - class187.field2589) / 2.0F;
        }
        class125.field1711 = true;
        class41.field469 = true;
    }
}
