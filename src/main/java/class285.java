import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class285 extends class208 {

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "Lve;")
    private static class255 field4894 = class87.method607(69, "flash3:");

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public static int field4896 = 0;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "Lve;")
    public static class255 field4902 = field4894;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "Lve;")
    public static class255 field4906 = class87.method607(51, "rot:");

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "Lve;")
    public static class255 field4908 = field4894;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "J")
    public long field4903;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "Ltl;")
    public static class197 field4900;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "Ljc;")
    public class285 field4901;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "Ljc;")
    public class285 field4907;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "Lrg;")
    public static class88 field4895;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "Lrg;")
    public static class88 field4904;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIZLrg;III)V", line = 12)
    public static final void method2023(int arg0, int arg1, boolean arg2, class88 arg3, int arg4, int arg5, int arg6) {
        class258.field4389 = arg3;
        class100.field1696 = arg2;
        class78.field1274 = arg6;
        class132.field2197 = arg1;
        class235.field3872 = arg4;
        class15.field224 = arg0;
        class73.field1203 = arg5;
        field4905++;
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)V", line = 30)
    public final void method2024(byte arg0) {
        if (arg0 <= 87) {
            field4894 = (class255) null;
        }
        field4897++;
        if (this.field4901 != null) {
            this.field4901.field4907 = this.field4907;
            this.field4907.field4901 = this.field4901;
            this.field4901 = null;
            this.field4907 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IB)Lve;", line = 55)
    public static final class255 method2025(int arg0, byte arg1) {
        int var2 = 38 % ((66 - arg1) / 51);
        class255 var3 = new class255();
        field4899++;
        var3.field4343 = 0;
        var3.field4297 = new byte[arg0];
        return var3;
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V", line = 83)
    public static void method2026(int arg0) {
        field4894 = null;
        field4906 = null;
        int var1 = -49 % ((arg0 - 45) / 43);
        field4904 = null;
        field4900 = null;
        field4902 = null;
        field4908 = null;
        field4895 = null;
    }
}
