import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class76 extends class311 {

    @OriginalMember(owner = "client!mr", name = "Y", descriptor = "Ljava/lang/Object;")
    private Object field899;

    @OriginalMember(owner = "client!mr", name = "H", descriptor = "[I")
    public static int[] field893 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!mr", name = "W", descriptor = "Z")
    public static boolean field897 = false;

    @OriginalMember(owner = "client!mr", name = "T", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!mr", name = "U", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!mr", name = "V", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!mr", name = "X", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lmn;Ljava/lang/Object;)V")
    public class76(class205 arg0, Object arg1) {
        super(arg0);
        this.field899 = arg1;
    }

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "(I)V")
    public static final void method421(int arg0) {
        class45.field541.method1626((byte) 106);
        if (arg0 != -1) {
            field893 = null;
        }
        field894++;
        class71.field820.method1626((byte) 106);
    }

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "(I)Z")
    public final boolean method422(int arg0) {
        field896++;
        if (arg0 < 111) {
            this.method422(79);
        }
        return false;
    }

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "(I)Ljava/lang/Object;")
    public final Object method423(int arg0) {
        field895++;
        return arg0 == -27364 ? this.field899 : null;
    }

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "(I)V")
    public static void method424(int arg0) {
        if (arg0 != -6095) {
            method424(-65);
        }
        field893 = null;
    }
}
