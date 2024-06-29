import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hja")
public class class429 extends class70 {

    @OriginalMember(owner = "client!hja", name = "w", descriptor = "I")
    public int field5850;

    @OriginalMember(owner = "client!hja", name = "u", descriptor = "I")
    public int field5848;

    @OriginalMember(owner = "client!hja", name = "t", descriptor = "I")
    public int field5847;

    @OriginalMember(owner = "client!hja", name = "E", descriptor = "I")
    public int field5858;

    @OriginalMember(owner = "client!hja", name = "x", descriptor = "I")
    public int field5851;

    @OriginalMember(owner = "client!hja", name = "v", descriptor = "I")
    public int field5849;

    @OriginalMember(owner = "client!hja", name = "s", descriptor = "Z")
    public static boolean field5846 = true;

    @OriginalMember(owner = "client!hja", name = "D", descriptor = "[I")
    public static int[] field5857 = new int[4];

    @OriginalMember(owner = "client!hja", name = "A", descriptor = "Lam;")
    public static class660 field5854 = new class660();

    @OriginalMember(owner = "client!hja", name = "F", descriptor = "Lfja;")
    public static class783 field5859 = new class783(117, 1);

    @OriginalMember(owner = "client!hja", name = "y", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!hja", name = "z", descriptor = "I")
    public static int field5853;

    @OriginalMember(owner = "client!hja", name = "B", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!hja", name = "C", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(I)Laca;", line = 8)
    public class758 method228(int arg0) {
        if (arg0 != 1) {
            this.field5847 = 0;
        }
        field5852++;
        return class571.field8132;
    }

    @OriginalMember(owner = "client!hja", name = "b", descriptor = "(Z)V", line = 21)
    public static void method2522(boolean arg0) {
        field5859 = null;
        if (arg0) {
            method2522(false);
        }
        field5854 = null;
        field5857 = null;
    }

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(II)Z", line = 34)
    public static final boolean method2523(int arg0, int arg1) {
        if (arg0 != 4095) {
            method2523(35, 51);
        }
        field5853++;
        return arg1 >= 12 && arg1 <= 17;
    }

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(IIIB)I", line = 45)
    public static final int method2524(int arg0, int arg1, int arg2, byte arg3) {
        field5855++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg0;
        }
        if (arg3 != -34) {
            method2524(39, -42, -124, (byte) 114);
        }
        if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 4095 - arg0;
        } else {
            return 4095 - arg2;
        }
    }

    @OriginalMember(owner = "client!hja", name = "<init>", descriptor = "(Leaa;Lcq;IIIIIIIIIIIII)V", line = 73)
    public class429(class528 arg0, class494 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field5850 = arg14;
        this.field5848 = arg10;
        this.field5847 = arg12;
        this.field5858 = arg9;
        this.field5851 = arg13;
        this.field5849 = arg11;
    }
}
