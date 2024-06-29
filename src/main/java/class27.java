import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class27 {

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public int field442;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public int field444;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public int field443;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public int field447;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public int field451;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "Lmi;")
    public class27 field445;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "Lwc;")
    public class376 field440;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "Lkha;")
    public static class687 field446;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)Lbt;", line = 9)
    public final class496 method273(int arg0) {
        if (arg0 == 3758) {
            field441++;
            return class565.method3191(this.field442, 1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 20)
    public static final String method274(byte arg0, String arg1, String arg2, String arg3) {
        field449++;
        for (int var4 = arg3.indexOf(arg1); var4 != -1; var4 = arg3.indexOf(arg1, arg2.length() + var4)) {
            arg3 = arg3.substring(0, var4) + arg2 + arg3.substring(arg1.length() + var4);
        }
        return arg0 > -126 ? null : arg3;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II[B)I", line = 40)
    public static final int method275(int arg0, int arg1, byte[] arg2) {
        field448++;
        int var3 = -90 % ((arg1 + 73) / 46);
        return class83.method593(arg2, (byte) 84, arg0, 0);
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V", line = 51)
    public static void method276(int arg0) {
        if (arg0 != -14952) {
            method274((byte) -106, null, null, null);
        }
        field446 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)Lmi;", line = 64)
    public final class27 method277(int arg0, int arg1) {
        field450++;
        return arg0 == 0 ? new class27(this.field442, arg1) : null;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(II)V", line = 76)
    public class27(int arg0, int arg1) {
        this.field442 = arg0;
        this.field444 = arg1;
    }
}
