import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class241 extends class230 {

    @OriginalMember(owner = "client!og", name = "v", descriptor = "Lbk;")
    public static class22 field3769 = new class22(0, -1);

    @OriginalMember(owner = "client!og", name = "p", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!og", name = "q", descriptor = "I")
    public int field3764;

    @OriginalMember(owner = "client!og", name = "r", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!og", name = "u", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!og", name = "x", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!og", name = "w", descriptor = "Lgi;")
    public static class164 field3770;

    @OriginalMember(owner = "client!og", name = "s", descriptor = "Ljava/lang/String;")
    public String field3766;

    @OriginalMember(owner = "client!og", name = "t", descriptor = "Ljava/lang/String;")
    public String field3767;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(I)V")
    public static final void method1634(int arg0) {
        ++field3765;
        class104.method744();
        int var1 = 0;
        if (arg0 == -2600) {
            while (var1 < 4) {
                class310.field5021[var1].method353(arg0 + 2475);
                ++var1;
            }
            System.gc();
        }
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(B)V")
    public static void method1635(byte arg0) {
        field3770 = null;
        field3769 = null;
        if (arg0 != -73) {
            method1635((byte) -68);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)Ljg;")
    public final class177 method1636(boolean arg0) {
        ++field3771;
        if (!arg0) {
            method1634(-86);
        }
        return class220.field3465[super.field3607];
    }
}
