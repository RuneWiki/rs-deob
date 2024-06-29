import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class645 extends class168 {

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "Ljava/lang/String;")
    public String field8929;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "[[Z")
    public static boolean[][] field8930 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field8931;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field8932;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field8933;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lria;I)Lria;", line = 8)
    public static final class288 method3618(class288 arg0, int arg1) {
        field8932++;
        if (arg0.field3743 != -1) {
            return class501.method2936(-116, arg0.field3743);
        }
        int var2 = arg0.field3696 >>> 16;
        class722 var3 = new class722(class290.field3804);
        for (class491 var4 = (class491) var3.method4031(false); var4 != null; var4 = (class491) var3.method4032((byte) 71)) {
            if (var4.field6978 == var2) {
                return class501.method2936(-106, (int) var4.field2333);
            }
        }
        if (arg1 > -18) {
            method3618(null, 124);
        }
        return null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)Lvi;", line = 37)
    public static final class542 method3619(int arg0) {
        field8931++;
        if (arg0 >= -78) {
            method3620((byte) -11);
        }
        try {
            return (class542) Class.forName("sg").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V", line = 58)
    public static void method3620(byte arg0) {
        field8930 = null;
        if (arg0 <= 82) {
            method3618(null, 13);
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V", line = 67)
    public class645() {
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 69)
    public class645(String arg0) {
        this.field8929 = arg0;
    }
}
