import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class530 extends InputStream {

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "Lef;")
    public static class335 field7801 = new class335(9, 0, 4, 1);

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "Lrn;")
    public static class174 field7802 = new class174(4, 3);

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "F")
    public static float field7800;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "I")
    public static int field7797;

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "I")
    public static int field7798;

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "I")
    public static int field7799;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Z)V")
    public static final void method3141(boolean arg0) {
        if (arg0) {
            method3142(-13);
        }
        field7799++;
        for (class408 var1 = (class408) class431.field6415.method2427(112); var1 != null; var1 = (class408) class431.field6415.method2422(-88)) {
            if (var1.field6120 == -1) {
                var1.field6125 = 0;
                if (var1.field6126 >= 0 && var1.field6119 >= 0 && class33.field662 > var1.field6126 && var1.field6119 < class121.field1966) {
                    class47.method446(var1, (byte) 90);
                }
            } else {
                var1.method2090(-1);
            }
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
    public static final void method3142(int arg0) {
        field7798++;
        if (class350.field5217 == 5) {
            class350.field5217 = 6;
            if (arg0 != 28153) {
                field7802 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ms", name = "read", descriptor = "()I")
    public final int read() {
        field7797++;
        class71.method583(30000L, 125);
        return -1;
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)V")
    public static void method3143(int arg0) {
        if (arg0 == 4) {
            field7802 = null;
            field7801 = null;
        }
    }
}
