import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class557 {

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "Lnj;")
    public static class415 field7278 = new class415(50, 3);

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "I")
    public static int field7279;

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "I")
    public static int field7280;

    @OriginalMember(owner = "client!nca", name = "d", descriptor = "Lul;")
    public class439 field7281;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lfd;Z)Lrg;")
    public static final class526 method2984(class418 arg0, boolean arg1) {
        field7279++;
        if (arg1) {
            field7280 = 68;
        }
        return new class526(arg0.method2383(65280), arg0.method2383(65280), arg0.method2383(65280), arg0.method2383(65280), arg0.method2364(-79), arg0.method2364(-110), arg0.method2396(76));
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(B)V")
    public static void method2985(byte arg0) {
        field7278 = null;
        if (arg0 != -65) {
            method2986(47, -100);
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(II)I")
    public static final int method2986(int arg0, int arg1) {
        return class315.field4084 == null ? 0 : class315.field4084[arg0][arg1] & 0xFF;
    }
}
