import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class266 {

    @OriginalMember(owner = "client!md", name = "d", descriptor = "Liu;")
    public static class517 field3883 = new class517(55, -1);

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field3887 = 0;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field3886 = -1;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public int field3881;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "Ljava/lang/String;")
    public String field3884;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
    public static final void method1684(boolean arg0) {
        class476.field6810 = -1;
        field3885++;
        if (arg0) {
            method1684(false);
        }
        class439.field6391 = -1;
        class473.field6783 = 0;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I[SI)[S")
    public static final short[] method1685(int arg0, short[] arg1, int arg2) {
        field3882++;
        short[] var3 = new short[arg2];
        class164.method1147(arg1, 0, var3, 0, arg2);
        return arg0 >= -89 ? null : var3;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static void method1686(int arg0) {
        field3883 = null;
        if (arg0 != 55) {
            field3886 = -7;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
    public static final void method1687(int arg0) {
        field3880++;
        if (class97.field1693 == class47.field657) {
            return;
        }
        if (arg0 != -1) {
            field3883 = null;
        }
        try {
            class630.method3564(class454.field6574, "tbrefresh", (byte) -121);
        } catch (Throwable var1) {
        }
    }
}
