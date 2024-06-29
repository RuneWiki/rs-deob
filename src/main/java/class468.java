import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class468 extends class479 {

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "[I")
    public static int[] field6971 = new int[1000];

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "[Lhm;")
    public static class146[] field6970 = new class146[16];

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "I")
    public static int field6969;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Z)V")
    public static void method2773(boolean arg0) {
        field6970 = null;
        if (arg0) {
            method2773(true);
        }
        field6971 = null;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V")
    public static final void method2774(int arg0) {
        class109.field1831.method159(0);
        if (arg0 < -47) {
            field6969++;
        }
    }
}
