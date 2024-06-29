import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class739 extends class362 {

    @OriginalMember(owner = "client!mga", name = "B", descriptor = "J")
    public static long field10198 = -1L;

    @OriginalMember(owner = "client!mga", name = "y", descriptor = "I")
    public static int field10195;

    @OriginalMember(owner = "client!mga", name = "z", descriptor = "I")
    public static int field10196;

    @OriginalMember(owner = "client!mga", name = "A", descriptor = "I")
    public static int field10197;

    @OriginalMember(owner = "client!mga", name = "C", descriptor = "I")
    public static int field10199;

    @OriginalMember(owner = "client!mga", name = "D", descriptor = "I")
    public static int field10200;

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(IILha;Z)Lda;", line = 4)
    public static final class67 method4093(int arg0, int arg1, class66 arg2, boolean arg3) {
        field10200++;
        if (arg0 != -11020) {
            method4095(51, -28, 88, 57);
        }
        class401 var4 = class386.method2350(arg3, arg2, 87, arg1);
        return var4 == null ? null : var4.field5521;
    }

    @OriginalMember(owner = "client!mga", name = "<init>", descriptor = "()V", line = 23)
    public class739() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lha;B)V", line = 27)
    public static final void method4094(class66 arg0, byte arg1) {
        if (class608.field8486) {
            class421.method2475(11, arg0);
        } else {
            class654.method3675(arg0, 10854);
        }
        field10197++;
        if (arg1 != 89) {
            method4093(-9, 10, null, true);
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(IIII)I", line = 44)
    public static final int method4095(int arg0, int arg1, int arg2, int arg3) {
        int var4 = -50 % ((arg0 - 40) / 52);
        field10195++;
        int var5 = arg2 & 0x3;
        if (var5 == 0) {
            return arg1;
        } else if (var5 == 1) {
            return 4095 - arg3;
        } else if (var5 == 2) {
            return 4095 - arg1;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(II)[I", line = 68)
    public final int[] method156(int arg0, int arg1) {
        if (arg0 != -2026769311) {
            method4095(-11, -96, 21, -128);
        }
        field10199++;
        return class172.field2750;
    }
}
