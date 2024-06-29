import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class282 {

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "J")
    private long field3998;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    private int field4000;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Lia;")
    public static class551 field4001;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V")
    public static void method1751(boolean arg0) {
        if (!arg0) {
            field4001 = null;
        }
        field4001 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)I")
    public final int method1752(int arg0) {
        field4002++;
        if (arg0 != 1) {
            this.method1753((byte) -111, 45);
        }
        return this.field4000;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI)I")
    private final int method1753(byte arg0, int arg1) {
        field3997++;
        return arg0 > -70 ? 89 : (int) (this.field3998 >> class512.field6851 * arg1) & 0xF;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lea;I)V")
    private final void method1754(class512 arg0, int arg1) {
        if (arg1 == 1) {
            field3999++;
            this.field3998 |= (arg0.field6841 << this.field4000++ * class512.field6851);
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lea;)V")
    public class282(class512 arg0) {
        this.field3998 = arg0.field6841;
        this.field4000 = 1;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)Lea;")
    public final class512 method1755(int arg0, int arg1) {
        if (arg0 <= 44) {
            return null;
        } else {
            field4003++;
            return class512.method2849((byte) -114)[this.method1753((byte) -93, arg1)];
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "([Lea;)V")
    public class282(class512[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method1754(arg0[var2], 1);
        }
    }
}
