import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class96 extends class62 {

    @OriginalMember(owner = "client!bm", name = "C", descriptor = "Lada;")
    public static class144 field1407 = new class144(43, -2);

    @OriginalMember(owner = "client!bm", name = "E", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!bm", name = "F", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!bm", name = "G", descriptor = "Lkda;")
    public static class328 field1410;

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V")
    public class96() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(II)[I")
    public final int[] method13(int arg0, int arg1) {
        ++field1408;
        if (arg1 != 656024161) {
            return null;
        } else {
            int[] var3 = super.field774.method3086(arg0, arg1 + -656024163);
            if (super.field774.field7499) {
                class648.method3739(var3, 0, class438.field5847, class309.field4265[arg0]);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "(I)V")
    public static void method742(int arg0) {
        if (arg0 < 15) {
            method742(52);
        }
        field1410 = null;
        field1407 = null;
    }
}
