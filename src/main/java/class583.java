import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class583 extends class417 {

    @OriginalMember(owner = "client!wca", name = "o", descriptor = "I")
    public int field8557;

    @OriginalMember(owner = "client!wca", name = "x", descriptor = "I")
    public int field8566;

    @OriginalMember(owner = "client!wca", name = "y", descriptor = "Ljava/lang/String;")
    public String field8567;

    @OriginalMember(owner = "client!wca", name = "n", descriptor = "Ljava/lang/String;")
    public String field8556;

    @OriginalMember(owner = "client!wca", name = "p", descriptor = "I")
    public int field8558;

    @OriginalMember(owner = "client!wca", name = "j", descriptor = "Z")
    public boolean field8552;

    @OriginalMember(owner = "client!wca", name = "i", descriptor = "Z")
    public boolean field8551;

    @OriginalMember(owner = "client!wca", name = "s", descriptor = "I")
    public int field8561;

    @OriginalMember(owner = "client!wca", name = "v", descriptor = "J")
    public long field8564;

    @OriginalMember(owner = "client!wca", name = "l", descriptor = "I")
    public int field8554;

    @OriginalMember(owner = "client!wca", name = "w", descriptor = "Llu;")
    public static class610 field8565 = new class610(34, 8);

    @OriginalMember(owner = "client!wca", name = "k", descriptor = "I")
    public static int field8553;

    @OriginalMember(owner = "client!wca", name = "m", descriptor = "I")
    public static int field8555;

    @OriginalMember(owner = "client!wca", name = "u", descriptor = "I")
    public static int field8563;

    @OriginalMember(owner = "client!wca", name = "z", descriptor = "Lvn;")
    public static class261 field8568;

    @OriginalMember(owner = "client!wca", name = "r", descriptor = "Lha;")
    public static class53 field8560;

    @OriginalMember(owner = "client!wca", name = "A", descriptor = "Loa;")
    public static class597 field8569;

    @OriginalMember(owner = "client!wca", name = "q", descriptor = "Lip;")
    public static class607 field8559;

    @OriginalMember(owner = "client!wca", name = "t", descriptor = "[Lpc;")
    public static class577[] field8562;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method3477(int arg0, int arg1, int arg2) {
        field8553++;
        if (arg0 != -14993) {
            field8560 = null;
        }
        return class397.method2358(arg1, 8468, arg2) & class599.method3540(0, arg1, arg2);
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IZII)I", line = 32)
    public static final int method3478(int arg0, boolean arg1, int arg2, int arg3) {
        field8563++;
        class38 var4 = class487.method2920(arg1, arg2 + 13985, arg3);
        if (var4 == null) {
            return 0;
        } else {
            if (arg2 != 8) {
                method3479(-38);
            }
            return arg0 >= 0 && var4.field465.length > arg0 ? var4.field465[arg0] : 0;
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)V", line = 56)
    public static void method3479(int arg0) {
        field8565 = null;
        field8569 = null;
        field8560 = null;
        field8559 = null;
        if (arg0 != 0) {
            field8560 = null;
        }
        field8568 = null;
        field8562 = null;
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V", line = 72)
    public class583(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field8557 = arg7;
        this.field8566 = arg3;
        this.field8567 = arg1;
        this.field8556 = arg0;
        this.field8558 = arg4;
        this.field8552 = arg9;
        this.field8551 = arg8;
        this.field8561 = arg6;
        this.field8564 = arg5;
        this.field8554 = arg2;
    }
}
