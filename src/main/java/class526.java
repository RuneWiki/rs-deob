import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class526 {

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "Z")
    public static boolean field7302 = false;

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "Lvba;")
    public static class45 field7304 = new class45();

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "I")
    public int field7300;

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "I")
    public static int field7301;

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "I")
    public static int field7303;

    @OriginalMember(owner = "client!eaa", name = "f", descriptor = "Ljava/lang/String;")
    public String field7305;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BLofa;)V", line = 3)
    public static final void method3051(byte arg0, class347 arg1) {
        int var2 = -96 % (arg0 / 59);
        if (arg1.field4884 == 5 && arg1.field4956 != -1) {
            class728.method4026(true, arg1, class375.field5490);
        }
        field7303++;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lr;III[Z)V", line = 16)
    public static final void method3052(class195 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class737.field10008 == class645.field8694) {
            return;
        }
        int var5 = class648.field8748[arg1].method1895(arg2, arg3, 97);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class295 var7 = class648.field8748[var6];
                if (var7 != null) {
                    var7.method200(arg0, arg2, var5 - var7.method1895(arg2, arg3, 114), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V", line = 42)
    public static void method3053(int arg0) {
        field7304 = null;
        if (arg0 >= -122) {
            method3051((byte) 67, null);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(B)V", line = 59)
    public static final void method3054(byte arg0) {
        class408.field5772.method3113(-127);
        int var1 = 121 / ((arg0 + 52) / 57);
        field7301++;
    }
}
