import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class465 {

    @OriginalMember(owner = "client!md", name = "d", descriptor = "Z")
    public static boolean field6552 = false;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field6549;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field6550;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)V")
    public static final void method2716(byte arg0, int arg1) {
        class587.field8409 = new int[arg1];
        class340.field4584 = new int[arg1];
        class456.field6425 = new int[arg1];
        if (arg0 <= 18) {
            field6552 = true;
        }
        class437.field6208 = new int[arg1];
        class564.field7811 = new int[arg1];
        field6549++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static final void method2717(int arg0) {
        class571 var1 = class263.field3675;
        synchronized (class263.field3675) {
            class263.field3675.method3246(false);
            if (arg0 != 1677) {
                field6552 = false;
            }
        }
        field6551++;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
    public static final void method2718(int arg0) {
        if (arg0 != -8274) {
            field6552 = false;
        }
        field6550++;
        class590.field8429 = true;
    }
}
