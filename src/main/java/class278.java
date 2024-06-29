import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class278 extends class311 {

    @OriginalMember(owner = "client!no", name = "x", descriptor = "I")
    public int field3793;

    @OriginalMember(owner = "client!no", name = "z", descriptor = "I")
    public int field3795;

    @OriginalMember(owner = "client!no", name = "u", descriptor = "Z")
    public static boolean field3790 = false;

    @OriginalMember(owner = "client!no", name = "p", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!no", name = "q", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!no", name = "r", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!no", name = "s", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!no", name = "t", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!no", name = "v", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!no", name = "w", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!no", name = "y", descriptor = "[[[I")
    public static int[][][] field3794;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIII)V")
    public static final void method1752(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3789++;
        for (int var6 = arg4; var6 <= arg5; var6++) {
            class149.method1112(arg0, arg3, 8, arg2, class83.field1157[var6]);
        }
        int var7 = -46 % ((arg1 + 60) / 39);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BI)V")
    public static final void method1753(byte arg0, int arg1) {
        field3787++;
        if (arg0 > -69) {
            field3794 = null;
        }
        class26 var2 = class217.method1445(true, arg1, 14);
        var2.method164(12);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lcd;B)V")
    public static final void method1754(class43 arg0, byte arg1) {
        if (arg1 < 121) {
            method1756(12);
        }
        arg0.field565 = null;
        field3792++;
        if (class75.field1072 < 20) {
            class417.field5773.method2483(arg0, 0);
            class75.field1072++;
        }
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(I)Lae;")
    public static final class277 method1755(int arg0) {
        class419.field5817 = arg0;
        field3786++;
        return class50.method407(-128);
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(II)V")
    public class278(int arg0, int arg1) {
        this.field3793 = arg1;
        this.field3795 = arg0;
    }

    @OriginalMember(owner = "client!no", name = "d", descriptor = "(I)V")
    public static void method1756(int arg0) {
        field3794 = null;
        if (arg0 != 16687) {
            method1753((byte) -124, 111);
        }
    }
}
