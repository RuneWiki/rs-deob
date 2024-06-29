import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class295 extends IOException {

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "Lac;")
    public static class712 field3842;

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class295(String arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIIZ)Lkha;")
    public static final class687 method1763(int arg0, int arg1, int arg2, boolean arg3) {
        field3841++;
        class98 var4 = null;
        if (class460.field6516 != null) {
            var4 = new class98(arg2, class460.field6516, class586.field8194[arg2], 1000000);
        }
        class403.field5622[arg2] = class424.field6032.method2871(var4, class322.field4106, arg2, 64);
        class403.field5622[arg2].method3056(-121);
        if (arg1 >= -56) {
            field3840 = -25;
        }
        return new class687(class403.field5622[arg2], arg3, arg0);
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)V")
    public static void method1764(int arg0) {
        field3842 = null;
        if (arg0 != 1000000) {
            field3842 = null;
        }
    }
}
