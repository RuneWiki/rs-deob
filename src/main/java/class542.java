import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class542 extends class694 {

    @OriginalMember(owner = "client!nu", name = "H", descriptor = "Z")
    public static boolean field7372 = false;

    @OriginalMember(owner = "client!nu", name = "F", descriptor = "I")
    public static int field7370;

    @OriginalMember(owner = "client!nu", name = "G", descriptor = "I")
    public static int field7371;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)[I", line = 5)
    public final int[] method39(int arg0, int arg1) {
        ++field7370;
        int[] var3 = super.field9751.method2712(arg1, (byte) 118);
        if (arg0 <= 112) {
            return null;
        } else {
            if (super.field9751.field6674) {
                class282.method1705(var3, 0, class465.field6544, class105.field1409[arg1]);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)V", line = 29)
    public static final void method2979(byte arg0) {
        int var1 = 72 / ((-46 - arg0) / 63);
        ++field7371;
        if (class492.method2755(22050)) {
            if (class371.field5278 == null) {
                class10.method48(false);
            }
            class410.field5804 = true;
            class477.field6669 = 0;
            try {
                class77.field1056 = class258.field3685.getToolkit().getSystemClipboard();
            } catch (Exception var2) {
            }
        }
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V", line = 56)
    public class542() {
        super(0, true);
    }
}
