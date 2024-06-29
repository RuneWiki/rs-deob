import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class663 extends class334 {

    @OriginalMember(owner = "client!wda", name = "C", descriptor = "Z")
    public static boolean field9303 = false;

    @OriginalMember(owner = "client!wda", name = "z", descriptor = "I")
    public static int field9300;

    @OriginalMember(owner = "client!wda", name = "B", descriptor = "I")
    public int field9302;

    @OriginalMember(owner = "client!wda", name = "E", descriptor = "I")
    public static int field9305;

    @OriginalMember(owner = "client!wda", name = "F", descriptor = "I")
    public static int field9306;

    @OriginalMember(owner = "client!wda", name = "H", descriptor = "I")
    public static int field9308;

    @OriginalMember(owner = "client!wda", name = "I", descriptor = "Lqia;")
    public class23 field9309;

    @OriginalMember(owner = "client!wda", name = "G", descriptor = "Ldia;")
    public static class242 field9307;

    @OriginalMember(owner = "client!wda", name = "A", descriptor = "Lbg;")
    public static class487 field9301;

    @OriginalMember(owner = "client!wda", name = "D", descriptor = "[B")
    public byte[] field9304;

    @OriginalMember(owner = "client!wda", name = "J", descriptor = "[I")
    public static int[] field9310;

    @OriginalMember(owner = "client!wda", name = "g", descriptor = "(I)[B")
    public final byte[] method2160(int arg0) {
        if (arg0 != -879) {
            field9310 = null;
        }
        ++field9308;
        if (super.field4984) {
            throw new RuntimeException();
        } else {
            return this.field9304;
        }
    }

    @OriginalMember(owner = "client!wda", name = "h", descriptor = "(I)V")
    public static final void method3778(int arg0) throws IOException {
        ++field9306;
        if (class76.field1025 != null && class445.field6330 > 0) {
            class49.field700.field1521 = 0;
            while (true) {
                class731 var1 = (class731) class187.field2806.method2508((byte) 113);
                if (var1 == null || ~var1.field10214 < ~(class49.field700.field1556.length - class49.field700.field1521)) {
                    class76.field1025.method196(class49.field700.field1521, 0, 24405, class49.field700.field1556);
                    class511.field7307 += class49.field700.field1521;
                    class403.field5707 = 0;
                    break;
                }
                class49.field700.method885(var1.field10211.field1556, -18983, var1.field10214, 0);
                class445.field6330 -= var1.field10214;
                var1.method3117((byte) 9);
                var1.field10211.method878(false);
                var1.method4095((byte) 55);
            }
        }
        if (arg0 < 93) {
            field9301 = null;
        }
    }

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "(I)I")
    public final int method2159(int arg0) {
        if (arg0 != 0) {
            this.field9304 = null;
        }
        ++field9300;
        return super.field4984 ? 0 : 100;
    }

    @OriginalMember(owner = "client!wda", name = "i", descriptor = "(I)V")
    public static void method3779(int arg0) {
        field9310 = null;
        if (arg0 != 2588) {
            field9301 = null;
        }
        field9301 = null;
        field9307 = null;
    }
}
