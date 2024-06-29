import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class141 extends class337 {

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "Ljava/lang/String;")
    public String field2110;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "Lki;")
    public static class498 field2111 = new class498(16, 8);

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "Lri;")
    public static class73 field2115 = new class73(18, -2);

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    public static int field2117 = 0;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "Lri;")
    public static class73 field2118 = new class73(36, -1);

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)[Le;")
    public static final class369[] method936(int arg0) {
        if (arg0 != 8) {
            field2115 = null;
        }
        field2114++;
        return new class369[] { class450.field6703, class227.field3331, class380.field5770 };
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
    public static final void method937(boolean arg0) {
        field2113++;
        class18.field197 = arg0;
        class417.field6259 = null;
        class377.method2315(arg0);
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
    public class141() {
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lic;B)V")
    public static final void method938(class491 arg0, byte arg1) {
        class20.field226 = 0;
        class476.field6999 = 0;
        field2112++;
        class190.field2802 = new class296();
        class70.field1063 = new class55[1024];
        if (arg1 > -9) {
            method939(true);
        }
        class119.method787(arg0, -1);
        class315.method1972(-13427, arg0);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Z)V")
    public static void method939(boolean arg0) {
        field2111 = null;
        if (arg0) {
            method938(null, (byte) -39);
        }
        field2115 = null;
        field2118 = null;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class141(String arg0) {
        this.field2110 = arg0;
    }
}
