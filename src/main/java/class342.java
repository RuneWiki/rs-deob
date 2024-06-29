import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class342 implements class257 {

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public int field4772;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    public int field4782;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public int field4768;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public int field4771;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
    public int field4779;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "Ldp;")
    public class3 field4777;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public int field4773;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "Ljava/lang/String;")
    public String field4767;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "Lfv;")
    public class120 field4766;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public int field4774;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "I")
    public int field4781;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public int field4770;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public int field4775;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "F")
    public static float field4778;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "Lvg;")
    public static class52 field4780;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
    public static void method2213(byte arg0) {
        if (arg0 == 122) {
            field4780 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZIII)V")
    public static final void method2214(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class729.method4096(-1);
        field4769++;
        class118.field1428 = 0L;
        if (arg0 != 3) {
            method2213((byte) 96);
        }
        int var5 = class605.method3408((byte) 54);
        if (arg2 == 3 || var5 == 3) {
            arg1 = true;
        }
        if (!class268.field3831.method438()) {
            arg1 = true;
        }
        class266.method1736(arg1, arg4, arg2, var5, arg3, (byte) -102);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)Z")
    public static final boolean method2215(int arg0, int arg1) {
        field4776++;
        if (arg1 != -6) {
            method2214(-119, true, -71, -62, 118);
        }
        return arg0 == 3 || arg0 == 5 || arg0 == 6;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)Lg;")
    public final class153 method769(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field4765++;
            return class252.field3689;
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Ljava/lang/String;Ldp;Lfv;IIIIIIIIII)V")
    public class342(String arg0, class3 arg1, class120 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field4772 = arg10;
        this.field4782 = arg3;
        this.field4768 = arg12;
        this.field4771 = arg8;
        this.field4779 = arg5;
        this.field4777 = arg1;
        this.field4773 = arg11;
        this.field4767 = arg0;
        this.field4766 = arg2;
        this.field4774 = arg7;
        this.field4781 = arg4;
        this.field4770 = arg9;
        this.field4775 = arg6;
    }
}
