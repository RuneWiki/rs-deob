import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class33 {

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "Lmh;")
    public static class128 field717 = class22.method156(127, " )2> ");

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)I", line = 16)
    public static final int method234(int arg0, int arg1) {
        field721++;
        return arg0 > -110 ? -69 : (arg1 & 0x3FC2B) >> 11;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ldj;ZLo;Ldj;)V", line = 27)
    public static final void method235(class314 arg0, boolean arg1, class197 arg2, class314 arg3) {
        class253.field4372 = arg2;
        class57.field1094 = arg0;
        if (!arg1) {
            class39.field826 = arg3;
            field718++;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ldj;Ldj;Z)V", line = 46)
    public static final void method236(class314 arg0, class314 arg1, boolean arg2) {
        class287.field4904 = arg1;
        class71.field1321 = arg0;
        field720++;
        if (arg2) {
            field716 = 123;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V", line = 73)
    public static void method237(int arg0) {
        field717 = null;
        if (arg0 != 261163) {
            method236((class314) null, (class314) null, true);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ldj;III)[Lqg;", line = 89)
    public static final class231[] method238(class314 arg0, int arg1, int arg2, int arg3) {
        field722++;
        if (arg1 == 20190) {
            return class118.method708(-2, arg2, arg0, arg3) ? class249.method1737(54) : null;
        } else {
            return (class231[]) null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIB)V", line = 106)
    public static final void method239(int arg0, int arg1, byte arg2) {
        field719++;
        class229 var3 = class241.method1638(1, arg2 + 17, arg0);
        var3.method1574(3199);
        var3.field3981 = arg1;
        if (arg2 != -98) {
            field716 = -50;
        }
    }
}
